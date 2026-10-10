package com.google.zxing.oned.rss.expanded.decoders;

/* JADX INFO: loaded from: classes56.dex */
final class DecodedChar extends DecodedObject {
    static final char FNC1 = '$';
    private final char value;

    public char getValue() {
        return this.value;
    }

    public boolean isFNC1() {
        return this.value == '$';
    }

    public DecodedChar(int i11, char c11) {
        super(i11);
        this.value = c11;
    }
}
