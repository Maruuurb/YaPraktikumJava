package ArticleAssignments;

public class Practicum {
    /*
    Напиши программу, которая сможет кодировать слова в числовой массив. И наоборот — раскодировать числовой массив в слово.
    В программе слова в виде исходной строки разбиваются на символы.
    Если приводить типы, они преобразуются в числа по кодам символов ASCII.
    Далее происходит обратная операция.
    Исправь код, чтобы символы преобразовывались в числа и обратно.
     */
    public static void main(String[] args) {
        String slovo = "slovo";
        var massiv = slovo.toCharArray();

        for (int i = 0; i < massiv.length; i++){
            System.out.println((int)massiv[i]);
        }
        String novaz = new String(massiv);
        System.out.println(novaz);

        System.out.println(Byte.parseByte("12"));
        Practicum practicum = new Practicum();

        System.out.println(practicum.SumAB("12", "23"));
    }
     public int SumAB(String a, String b){
         int aInt = Integer.parseInt(a);
         int bInt = Integer.parseInt(b);

        int sum;
        sum = Integer.sum(aInt, bInt);
        return sum;
    }
}



