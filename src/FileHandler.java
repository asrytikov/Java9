import java.io.*;
import java.util.LinkedList;
public class FileHandler {
    public LinkedList<Member> readFile() {
        String path = "D:/док/members.csv";
        String line;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));

            line = bufferedReader.readLine();
            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
            bufferedReader.close();
        } catch (IOException ex) {
            System.out.println("Error");
        }
        return line;
        members.add(line);
    }
    public void appendFile(String mem) {
        String path = "D:/док/members.csv";
        //mem - новая строка с информацией о новом посетителе. Её надо сюда передать;
        mem = " ";
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(path, true));
            writer.write(mem);
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            System.out.println("Error write");
        }
    }
    public void overwriteFile(LinkedList<Member> m) {
        //вызывается при удалении посетителя.(remove) Сначала он должен удалиться из LinkedList
        //создаем временный файл
        try {
            File nf = new File("D:/док/members.temp");
            nf.createNewFile();
        } catch (Exception exx) {
            System.out.println("Error create file");
        }
        //Во временный файл переписываем все из LinkedList
        String text = " ";
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("D:/док/members.temp", true));
            writer.write(text);
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            System.out.println("Error write");
        }
        //Удаляем файл members.csv
        File file3 = new File("D:/док/members.csv");
        if (file3.exists()){
            file3.delete();
        }
            String path = "D:/док/members.csv";
            File file = new File("D:/док/members.temp");
            if (file.exists()) {
                File file2 = new File("D:/док/members.csv");
                boolean rename = file.renameTo(file2);
                path = file2.getParent() + "//" + file2.getName();
                if (!rename) {
                    System.out.println("Error rename");
                }
            }
        }

    }
