package Assignment3;

public class Magazine extends Item {
    int issueNumber;

    public Magazine(int id, String title, int issueNumber) {
        super(id, title);
        this.issueNumber = issueNumber;
    }

    @Override
    public void display() {
        System.out.println("- " + title + " Issue " + issueNumber);
    }

    @Override
    public String toString() {
        return "Magazine: [ID: " + id + ", Title: " + title + ", Issue: " + issueNumber + "]";
    }
}
