package hust.soict.hedspi.aims.media;

import java.util.Comparator;

public abstract class Media implements Comparable<Media> {
    private int id;
    private String title;
    private String category;
    private float cost;

    public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
    public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();

    public Media(int id, String title, String category, float cost) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public float getCost() {
        return cost;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public boolean isMatch(String title) {
        return this.getTitle() != null && this.getTitle().equalsIgnoreCase(title);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (!(obj instanceof Media)) return false;

        Media media = (Media) obj;

        if (this.title == null) {
            if (media.title != null) return false;
        } else if (!this.title.equalsIgnoreCase(media.title)) {
            return false;
        }

        return this.cost == media.cost;
    }

    @Override
    public int compareTo(Media other) {
        if (other == null) {
            throw new NullPointerException("Khong the so sanh voi Media null");
        }

        if (this.title == null && other.title != null) {
            return -1;
        }
        if (this.title != null && other.title == null) {
            return 1;
        }
        if (this.title != null && other.title != null) {
            int titleCompare = this.title.compareToIgnoreCase(other.title);
            if (titleCompare != 0) {
                return titleCompare;
            }
        }
        return Float.compare(this.cost, other.cost);
    }
}
