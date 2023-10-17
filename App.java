import java.util.Scanner; //////работает!!

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder text = new StringBuilder(); // текст загоняем в стрингбилдер
        int NumberOfLines = 0;
        while (true) {
            NumberOfLines++;
            String inputText = scanner.nextLine();
            if (inputText.isEmpty()) {
                break;
            }
            text.append(inputText).append("\n");
        }

        System.out.print("Длина заменяемого слова: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        System.out.print("подстрока: ");
        String replacementWord = scanner.nextLine();

        String[] lines = text.toString().split("\n"); // разделяем текст на строки
        StringBuilder outputText = new StringBuilder(); // результат в новом стрингбилдере
        for (String line : lines) {
            String[] words = line.split("\\s+");
            for (String word : words) {
                if (word.length() == n) {
                    line = line.replace(word, replacementWord);
                }
            }
            outputText.append(line).append("\n");
        }
        System.out.println(outputText.toString().trim());
    }
}