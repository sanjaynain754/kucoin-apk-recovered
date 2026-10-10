package com.pichillilorenzo.flutter_inappwebview_android.types;

/* JADX INFO: loaded from: classes59.dex */
public enum PreferredContentModeOptionType {
    RECOMMENDED(0),
    MOBILE(1),
    DESKTOP(2);

    private final int value;

    public boolean equalsValue(int i11) {
        return this.value == i11;
    }

    public int toValue() {
        return this.value;
    }

    PreferredContentModeOptionType(int i11) {
        this.value = i11;
    }

    public static PreferredContentModeOptionType fromValue(int i11) {
        for (PreferredContentModeOptionType preferredContentModeOptionType : values()) {
            if (i11 == preferredContentModeOptionType.toValue()) {
                return preferredContentModeOptionType;
            }
        }
        throw new IllegalArgumentException("No enum constant: " + i11);
    }
}
