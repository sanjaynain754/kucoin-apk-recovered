package com.google.zxing.oned.rss;

/* JADX INFO: loaded from: classes56.dex */
final class Pair extends DataCharacter {
    private int count;
    private final FinderPattern finderPattern;

    public int getCount() {
        return this.count;
    }

    public FinderPattern getFinderPattern() {
        return this.finderPattern;
    }

    public void incrementCount() {
        this.count++;
    }

    public Pair(int i11, int i12, FinderPattern finderPattern) {
        super(i11, i12);
        this.finderPattern = finderPattern;
    }
}
