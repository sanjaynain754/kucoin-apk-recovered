package ai.advance.sdk.global.iqa.lib.code;

/* JADX INFO: loaded from: classes23.dex */
public enum ImageWarnCode {
    NO_CARD(0),
    TOO_SMALL_CARD(1),
    EDGE_CROSS(2),
    CARD_POOR_QUALITY(3),
    CARD_OCCLUDED(4),
    CARD_GLOSSY(5),
    GOOD(6);

    public int level;

    public static ImageWarnCode highLevel(ImageWarnCode imageWarnCode, ImageWarnCode imageWarnCode2) {
        return imageWarnCode.level > imageWarnCode2.level ? imageWarnCode : imageWarnCode2;
    }

    ImageWarnCode(int i11) {
        this.level = i11;
    }
}
