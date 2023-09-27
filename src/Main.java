import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Second:");
        int[] array =
                {
                        780,
                        893,
                        423,
                        548,
                        247,
                        395,
                        92,
                        815,
                        871,
                        194,
                        908,
                        76,
                        174,
                        552,
                        526,
                        544,
                        883,
                        712,
                        937,
                        239,
                        399,
                        187,
                        808,
                        647,
                        868,
                        652,
                        870,
                        767,
                        403,
                        344,
                        659,
                        237,
                        317,
                        170,
                        984,
                        367,
                        493,
                        120,
                        97,
                        60,
                        235,
                        615,
                        117,
                        684,
                        337,
                        157,
                        200,
                        905,
                        725,
                        1000
                };
        int[] array2 =
                {
                        674,
                        59,
                        259,
                        568,
                        989,
                        842,
                        87,
                        658,
                        903,
                        882,
                        798,
                        820,
                        300,
                        598,
                        714,
                        853,
                        215,
                        127,
                        992,
                        945,
                        971,
                        748,
                        789,
                        455,
                        394,
                        404,
                        113,
                        364,
                        962,
                        649,
                        356,
                        324,
                        796,
                        709,
                        627,
                        562,
                        904,
                        313,
                        374,
                        286,
                        175,
                        182,
                        140,
                        326,
                        953,
                        600,
                        550,
                        233,
                        220,
                        566
                };
        LinkedList<Integer> player1 = new LinkedList<Integer>();
        LinkedList<Integer> player2 = new LinkedList<Integer>();
        int count = 0;
        for (int j = 0; j < array.length; j++) {
            player1.add(array[j]);
            player2.add(array2[j]);
        }
        while (player2.size() > 0) {
            if (player1.getFirst() > player2.getFirst())
            {
                player1.addLast(player1.getFirst());
                player1.remove(player1.getFirst());
                player1.addLast(player2.getFirst());
                player2.removeFirst();
                count++;
            }
            else if(player2.getFirst() > player1.getFirst()) {
                player2.addLast(player2.getFirst());
                player2.remove(player2.getFirst());
                player2.addLast(player1.getFirst());
                player1.removeFirst();
                count++;
            }
            /*else if(player1.getFirst() == player2.getFirst())
            {
                player1.addLast(player1.getFirst());
                player1.remove(player1.getFirst());
                player2.addLast(player2.getFirst());
                player2.remove(player2.getFirst());
            }*/

            System.out.println("Pirmas zaidejas: " + player1);
            System.out.println("Antras zaidejas: " + player2);
            System.out.println(count);
        }
    }
}
