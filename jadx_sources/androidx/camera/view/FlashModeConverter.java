package androidx.camera.view;

/* JADX INFO: loaded from: classes23.dex */
final class FlashModeConverter {
    public static int valueOf(String str) {
        if (str == null) {
            throw new NullPointerException("name cannot be null");
        }
        switch (str) {
            case "ON":
                return 1;
            case "OFF":
                return 2;
            case "AUTO":
                return 0;
            default:
                throw new IllegalArgumentException("Unknown flash mode name " + str);
        }
    }

    public static String nameOf(int i11) {
        if (i11 == 0) {
            return "AUTO";
        }
        if (i11 == 1) {
            return "ON";
        }
        if (i11 == 2) {
            return "OFF";
        }
        throw new IllegalArgumentException("Unknown flash mode " + i11);
    }

    private FlashModeConverter() {
    }
}
