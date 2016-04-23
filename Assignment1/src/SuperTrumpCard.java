public class SuperTrumpCard extends Card {
    private int attribute;

    public SuperTrumpCard(int name ,int attribute){
        this.attribute = attribute;
        super.setName(name);
    }

    public int getAttribute() {
        return attribute;
    }

    public void setAttribute(int attribute) {
        this.attribute = attribute;
    }
}
