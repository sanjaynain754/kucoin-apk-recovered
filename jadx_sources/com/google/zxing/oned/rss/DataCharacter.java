package com.google.zxing.oned.rss;

/* JADX INFO: loaded from: classes56.dex */
public class DataCharacter {
    private final int checksumPortion;
    private final int value;

    public final boolean equals(Object obj) {
        if (!(obj instanceof DataCharacter)) {
            return false;
        }
        DataCharacter dataCharacter = (DataCharacter) obj;
        return this.value == dataCharacter.value && this.checksumPortion == dataCharacter.checksumPortion;
    }

    public final int getChecksumPortion() {
        return this.checksumPortion;
    }

    public final int getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value ^ this.checksumPortion;
    }

    public final String toString() {
        return this.value + "(" + this.checksumPortion + ')';
    }

    public DataCharacter(int i11, int i12) {
        this.value = i11;
        this.checksumPortion = i12;
    }
}
