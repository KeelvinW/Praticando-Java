import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class PraticandoDataHora2 {

    public static void main (String [] args){

        //https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html

        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");


        //Transformar datas em textos
        DateTimeFormatter teste1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter teste2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter teste3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter teste4 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter teste5 = DateTimeFormatter.ISO_INSTANT;


        System.out.println("d04 = " + d04.format(teste1));
        System.out.println("d04 = " + teste1.format(d04));
        System.out.println("d04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.println("d05 = " + d05.format(teste1));
        System.out.println("d05 = " + d05.format(teste2));
        System.out.println("d05 = " + d05.format(teste4));

        System.out.println("d06 = " + teste3.format(d06));
        System.out.println("d06 = " + teste5.format(d06));
    }
}
