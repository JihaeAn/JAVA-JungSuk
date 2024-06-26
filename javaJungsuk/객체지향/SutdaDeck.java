package javaJungsuk.객체지향;

public class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck() {
        for(int i = 0; i < cards.length; i++){
            int num = i % 10 + 1;
            boolean isKwang = (i < 10) && (num == 1 || num == 3 || num == 8);

            cards[i] = new SutdaCard(num, isKwang);
        }
    }

    public void shuffle(){
        for(int i = 0; i < cards.length; i++){
            int a = (int)(Math.random() * 19);
            SutdaCard origin = cards[i];
            cards[i] = cards[a];
            cards[a] = origin;
        }
    }
    public SutdaCard pick(int index){
        return cards[index];
    }
    public SutdaCard pick(){
        int ran = (int)(Math.random() * 19);
        return cards[ran];
    }
}
