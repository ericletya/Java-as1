public class MineralCard extends Card {
    private int attribute;//not an attribute for the game itself, using this instead of actual attributes below to create deck and hand until part B.
    private int hardness, specificGravity;
    private String cleavage, crustal_abundance, economic_value;

    private String[] cleavageValues = {"none", "poor/none", "1 poor","2 poor" ,"1 good"
            ,"1 good, 1 poor" ,"2 good","3 good" ,"1 perfect", "1 perfect, 1 good",
            "1 perfect, 2 good", "2 perfect, 1 good", "3 perfect", "4 perfect", "6 perfect" };

    private String[] crustal_abundance_values = {"ultratrace", "trace", "low", "moderate", "high", "very high"};

    private String[] economicValues = {"trivial", "low", "moderate", "high", "very high", "I'm rich!"};// this arrays contain every possible non-numeric attribute values, are used for card comparison

    public MineralCard(int name, int attribute){
        this.attribute = attribute;
        super.setName(name);
    }

    public int getHardness() {
        return hardness;
    }

    public void setHardness(int hardness) {
        this.hardness = hardness;
    }

    public int getSpecificGravity() {
        return specificGravity;
    }

    public String getCleavage() {
        return cleavage;
    }

    public void setCleavage(String cleavage) {
        this.cleavage = cleavage;
    }

    public String getCrustal_abundance() {
        return crustal_abundance;
    }

    public void setCrustal_abundance(String crustal_abundance) {
        this.crustal_abundance = crustal_abundance;
    }

    public String getEconomic_value() {
        return economic_value;
    }

    public void setEconomic_value(String economic_value) {
        this.economic_value = economic_value;
    }

    public void setSpecificGravity(int specificGravity) {
        this.specificGravity = specificGravity;
    }

    public int getAttribute() {
        return attribute;
    }

    public void setAttribute(int attribute) {
        this.attribute = attribute;
    }

    public String[] getEconomicValues() {
        return economicValues;
    }

    public String[] getCleavageValues() {
        return cleavageValues;
    }

    public String[] getCrustal_abundance_values() {
        return crustal_abundance_values;
    }

    public boolean compareValues(MineralCard otherCard, String attribute_to_compare){
        boolean check = true;

        switch (attribute_to_compare) {

    }

    private int convert(String attribute, String[] attributes){
        int i = 0;
        for (String s : attributes){
            i++;
            if (attribute.equals(s))
                break;
        }
        return i;
    }
}