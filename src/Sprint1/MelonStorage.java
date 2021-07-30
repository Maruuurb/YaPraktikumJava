package ArticleAssignments;
class MelonStorage{
    private int melonAmount;
    public void reduceMelonAmount(int amountToTake){
        if (amountToTake <= melonAmount){
            melonAmount = melonAmount - amountToTake;

        }else{
            int difference =  melonAmount - amountToTake;
            melonAmount = 0;
            System.out.println("Многа хочешь. Не удалось вывести: " + (-difference));
        }
    }
    public int getMelonAmount(){
        return melonAmount;
    }
    public MelonStorage (int newMelonAmount){
        melonAmount = newMelonAmount;
    }
}

class Main {
    public static void main(String[] args) {
        MelonStorage dina = new MelonStorage( 300);
        System.out.println(dina.getMelonAmount());
        dina.reduceMelonAmount(600);


    }
}