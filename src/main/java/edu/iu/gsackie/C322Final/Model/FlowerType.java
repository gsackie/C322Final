package edu.iu.gsackie.C322Final.Model;

public enum FlowerType {
    MIXED,
    ROSES,
    LILIES,
    TULIPS,
    DAISIES;

    @Override
    public String toString() {
        switch (this) {
            case MIXED: return "Mixed";
            case ROSES: return "Roses";
            case LILIES: return "Lilies";
            case TULIPS: return "Tulips";
            case DAISIES: return "Daisies";
            default: return "unspecified";
        }
    }

    public static FlowerType toEnum(String value) {
        switch (value.toLowerCase()) {
            case "mixed": return FlowerType.MIXED;
            case "roses": return FlowerType.ROSES;
            case "lilies": return FlowerType.LILIES;
            case "tulips": return FlowerType.TULIPS;
            case "daisies": return FlowerType.DAISIES;
            default: return null;
        }
    }
}