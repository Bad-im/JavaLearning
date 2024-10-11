package Chapter4.VariantB.FlowerShop.service;
import Chapter4.VariantB.FlowerShop.model.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Bouquet {
    private List<Flower> flowers = new ArrayList<>();

    public void addFlower(Flower flower) {
        flowers.add(flower);
    }

    public double calculateTotalPrice() {
        return flowers.stream().mapToDouble(Flower::getPrice).sum();
    }

    public void sortFlowersByFreshness() {
        flowers.sort(Comparator.comparingInt(Flower::getFreshnessLevel));
    }

    public List<Flower> findFlowersByStemLength(double minLength, double maxLength) {
        List<Flower> result = new ArrayList<>();
        for (Flower flower : flowers) {
            if (flower.getStemLength() >= minLength && flower.getStemLength() <= maxLength) {
                result.add(flower);
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "Букет: " + flowers;
    }
}
