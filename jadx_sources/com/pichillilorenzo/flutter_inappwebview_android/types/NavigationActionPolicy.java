package com.pichillilorenzo.flutter_inappwebview_android.types;

/* JADX INFO: loaded from: classes59.dex */
public enum NavigationActionPolicy {
    CANCEL(0),
    ALLOW(1);

    private final int value;

    public boolean equalsValue(int i11) {
        return this.value == i11;
    }

    public int rawValue() {
        return this.value;
    }

    @Override // java.lang.Enum
    public String toString() {
        return String.valueOf(this.value);
    }

    NavigationActionPolicy(int i11) {
        this.value = i11;
    }

    public static NavigationActionPolicy fromValue(int i11) {
        for (NavigationActionPolicy navigationActionPolicy : values()) {
            if (i11 == navigationActionPolicy.value) {
                return navigationActionPolicy;
            }
        }
        throw new IllegalArgumentException("No enum constant: " + i11);
    }
}
