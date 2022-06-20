package at.fhv.jazzers.shared.dto;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

public class DigitalProductDTO implements Serializable {
    private UUID productId;
    private String title;
    private String interpret;
    private String medium;
    private String genre;
    private double price;

    private String downloadLink;

    public DigitalProductDTO() {

    }

    public DigitalProductDTO(UUID productId, String title, String interpret, String medium, String genre, double price, String downloadLink) {
        this.productId = productId;
        this.title = title;
        this.interpret = interpret;
        this.medium = medium;
        this.genre = genre;
        this.price = price;
        this.downloadLink = downloadLink;
    }

    public UUID getProductId() {
        return productId;
    }

    public String getTitle() {
        return title;
    }

    public String getInterpret() {
        return interpret;
    }

    public String getMedium() {
        return medium;
    }

    public String getGenre() {
        return genre;
    }

    public double getPrice() {
        return price;
    }

    public String getDownloadLink() { return downloadLink; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DigitalProductDTO that = (DigitalProductDTO) o;
        return Double.compare(that.price, price) == 0 && productId.equals(that.productId) && downloadLink.equals(that.downloadLink) && title.equals(that.title) && interpret.equals(that.interpret) && medium.equals(that.medium) && genre.equals(that.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, title, interpret, medium, genre, price, downloadLink);
    }
}
