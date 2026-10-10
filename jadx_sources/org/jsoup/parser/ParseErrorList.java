package org.jsoup.parser;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes61.dex */
public class ParseErrorList extends ArrayList<C43297c> {
    private final int maxSize;

    public static ParseErrorList noTracking() {
        return new ParseErrorList(0, 0);
    }

    public static ParseErrorList tracking(int i11) {
        return new ParseErrorList(16, i11);
    }

    public int getMaxSize() {
        return this.maxSize;
    }

    public ParseErrorList(int i11, int i12) {
        super(i11);
        this.maxSize = i12;
    }

    public boolean canAddError() {
        if (size() < this.maxSize) {
            return true;
        }
        return false;
    }
}
