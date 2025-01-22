package lab10_p;

import java.io.*;
import java.time.LocalDate;
import java.util.Random;

public class zad2 {
    private static final String FILE_NAME = "film_logs.txt";
    private static final int TOTAL_LOGS = 50;
    public static void main(String[] args) throws InterruptedException{
        Thread watek1 = new LogWriterThread(FILE_NAME, TOTAL_LOGS / 2);

        Thread watek2 = new Thread(new LogWriterRunnable(FILE_NAME, TOTAL_LOGS / 2));

        watek1.start();
        watek2.start();

        watek1.join();
        watek2.join();

        Thread watek3 = new LogReaderThread(FILE_NAME, 0, 10);
        Thread watek4 = new LogReaderThread(FILE_NAME, 10, 10);
        Thread watek5 = new LogReaderThread(FILE_NAME, 20, 10);
        Thread watek6 = new LogReaderThread(FILE_NAME, 30, 10);
        Thread watek7 = new LogReaderThread(FILE_NAME, 40, 10);

        watek3.start();
        watek4.start();
        watek5.start();
        watek6.start();
        watek7.start();
    }
}

class LogWriterThread extends Thread{
    private final String filename;
    private final int logsToGenerate;

    public LogWriterThread(String filename, int logsToGenerate) {
        this.filename = filename;
        this.logsToGenerate = logsToGenerate;
    }

    @Override
    public void run() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))){
            Random random = new Random();
            for (int i = 0; i < logsToGenerate; i++){
                String log = "FilmID: " + random.nextInt(1000) + ", UserID: " + random.nextInt(500) + ", Ocena: " + (random.nextInt(5) + 1) + ", Data: " + LocalDate.now() + "\n";
                writer.write(log);
            }
        } catch (IOException e){
            System.err.println("Błąd zapisu wątku Runnable: " + e.getMessage());
        }
    }
}

class LogReaderThread extends Thread{
    private final String filename;
    private final int startLine;
    private final int linesToRead;

    public LogReaderThread(String filename, int startLine, int linesToRead) {
        this.filename = filename;
        this.startLine = startLine;
        this.linesToRead = linesToRead;
    }

    @Override
    public void run() {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))){
            int currentLine = 0;
            String line;
            while ((line = reader.readLine()) != null){
                if (currentLine >= startLine && currentLine < startLine + linesToRead){
                    System.out.println("Wątek odczytu: " + getName() + " -> " + line);
                }
                currentLine++;
                if (currentLine >= startLine + linesToRead){
                    break;
                }
            }
        }catch (IOException e){
            System.err.println("Błąd odczytu wątku: " + e.getMessage());
        }
    }
}