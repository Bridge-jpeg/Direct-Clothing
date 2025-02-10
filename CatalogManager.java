import java.util.ArrayList;
import java.util.List;

public class CatalogManager {
    private final List<Catalog> catalogs = new ArrayList<>();

    public void addCatalog(Catalog catalog) {
        catalogs.add(catalog);
    }

    public Catalog getCatalog(String catalogId) {
        return catalogs.stream()
                .filter(c -> c.getId().equals(catalogId))
                .findFirst()
                .orElse(null);
    }

    public Catalog getCurrentCatalog() {
        return catalogs.stream()
                .max((c1, c2) -> c1.getDate().compareTo(c2.getDate()))
                .orElse(null);
    }

    public void displayAllCatalogs() {
        System.out.println("Catalogs in the system:");
        for (Catalog catalog : catalogs) {
            catalog.displayCatalogInfo();
            System.out.println("---");
        }
    }
}
