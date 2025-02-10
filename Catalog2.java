import java.time.LocalDate;

public class Catalog2 {
    private String id;
    private LocalDate date;

    public Catalog2(String id, LocalDate date) {
        this.id = id;
        this.date = date;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void displayCatalogInfo() {
        System.out.println("Catalog ID: " + id);
        System.out.println("Catalog Date: " + date);
    }
}
