package com.tencent.ugc.decoder;

/* JADX INFO: loaded from: classes2.dex */
public class CharCache {
    private final char[] cache;
    private int pos;

    public void append(String str) {
        char[] charArray = str.toCharArray();
        int iMin = Math.min(charArray.length, this.cache.length - this.pos);
        System.arraycopy(charArray, 0, this.cache, this.pos, iMin);
        this.pos += iMin;
    }

    public void clear() {
        this.pos = 0;
    }

    public int length() {
        return this.pos;
    }

    public String toString() {
        return new String(this.cache, 0, this.pos);
    }

    public CharCache(int i11) {
        this.cache = new char[i11];
    }

    public void append(char c11) {
        int i11 = this.pos;
        char[] cArr = this.cache;
        if (i11 < cArr.length - 1) {
            cArr[i11] = c11;
            this.pos = i11 + 1;
        }
    }
}
