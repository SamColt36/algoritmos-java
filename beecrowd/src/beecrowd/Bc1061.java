package beecrowd;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Bc1061 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("DIA: ");
		int inicialDate = input.nextInt();
		System.out.print("TIME: ");
		String timeInicial = input.next();

		String[] v = timeInicial.split(":");
		int totalSecondsInicial = ConvertionToSeconds(inicialDate, Integer.valueOf(v[0]), Integer.valueOf(v[1]),
				Integer.valueOf(v[2]));

		System.out.print("\n" + "DIA: ");
		int finalDate = input.nextInt();
		System.out.print("TIME: ");
		String timeFinal = input.next();

		v = timeFinal.split(":");
		int totalSecondsFinal = ConvertionToSeconds(finalDate, Integer.valueOf(v[0]), Integer.valueOf(v[1]),
				Integer.valueOf(v[2]));
		input.close();

		int variationSeconds = totalSecondsFinal - totalSecondsInicial;

		System.out.println(Convertion(variationSeconds));
	}

	public static Integer ConvertionToSeconds(int dia, int hora, int minuto, int segundo) {
		int sum = 0;
		sum += TimeUnit.DAYS.toSeconds(dia);
		sum += TimeUnit.HOURS.toSeconds(hora);
		sum += TimeUnit.MINUTES.toSeconds(minuto);
		sum += segundo;
		return sum;
	}

	public static String Convertion(int variationSeconds) {
		int days = 0, hours = 0, minutes = 0, seconds;
		seconds = variationSeconds % 60;

		if ((variationSeconds / 60) > 60) {
			minutes = ((variationSeconds / 60) % 60);
		}

		if ((variationSeconds / 3600) > 24) {
			hours = (variationSeconds / 3600) % 24;
			days = (variationSeconds / 3600) / 24;
		}
		StringBuilder obj = new StringBuilder();
		obj.append("\n" + days + " dia(s)" + "\n");
		obj.append(hours + " hora(s)" + "\n");
		obj.append(minutes + " minuto(s)" + "\n");
		obj.append(seconds + " segundo(s)" + "\n");

		String output = obj.toString();
		return output;
	}
}

// Alt + Shift + Y habilita quebra de linha