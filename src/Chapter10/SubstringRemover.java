package Chapter10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SubstringRemover {

    public static void main(String[] args) {
        String inputFilePath = "C:\\Users\\vadim\\IdeaProjects\\JavaLearning\\A";
        String outputFilePath = "C:\\Users\\vadim\\IdeaProjects\\JavaLearning\\B";
        String substringToRemove = "подстрока для удаления";

        try {
            removeSubstringFromFile(inputFilePath, outputFilePath, substringToRemove);
            System.out.println("Подстрока \"" + substringToRemove + "\" успешно удалена из строк.");
        } catch (IOException e) {
            System.err.println("Ошибка при обработке файлов: " + e.getMessage());
        }
    }

    public static void removeSubstringFromFile(String inputFilePath, String outputFilePath, String substringToRemove) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {

            String line;
            while ((line = reader.readLine()) != null) {
                // Удаляем заданную подстроку из строки
                String modifiedLine = line.replace(substringToRemove, "");
                // Записываем измененную строку в выходной файл
                writer.write(modifiedLine);
                writer.newLine();
            }
        }
    }
}
