package com.google.zxing.pdf417.decoder;

import java.util.Formatter;

/* JADX INFO: loaded from: classes56.dex */
class DetectionResultColumn {
    private static final int MAX_NEARBY_DISTANCE = 5;
    private final BoundingBox boundingBox;
    private final Codeword[] codewords;

    public final BoundingBox getBoundingBox() {
        return this.boundingBox;
    }

    public final Codeword getCodeword(int i11) {
        return this.codewords[imageRowToCodewordIndex(i11)];
    }

    public final Codeword[] getCodewords() {
        return this.codewords;
    }

    public final int imageRowToCodewordIndex(int i11) {
        return i11 - this.boundingBox.getMinY();
    }

    public final void setCodeword(int i11, Codeword codeword) {
        this.codewords[imageRowToCodewordIndex(i11)] = codeword;
    }

    public String toString() {
        Formatter formatter = new Formatter();
        try {
            int i11 = 0;
            for (Codeword codeword : this.codewords) {
                if (codeword == null) {
                    formatter.format("%3d:    |   %n", Integer.valueOf(i11));
                    i11++;
                } else {
                    formatter.format("%3d: %3d|%3d%n", Integer.valueOf(i11), Integer.valueOf(codeword.getRowNumber()), Integer.valueOf(codeword.getValue()));
                    i11++;
                }
            }
            String string = formatter.toString();
            formatter.close();
            return string;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                try {
                    formatter.close();
                } catch (Throwable th4) {
                    th2.addSuppressed(th4);
                }
                throw th3;
            }
        }
    }

    public DetectionResultColumn(BoundingBox boundingBox) {
        this.boundingBox = new BoundingBox(boundingBox);
        this.codewords = new Codeword[(boundingBox.getMaxY() - boundingBox.getMinY()) + 1];
    }

    public final Codeword getCodewordNearby(int i11) {
        Codeword codeword;
        Codeword codeword2;
        Codeword codeword3 = getCodeword(i11);
        if (codeword3 != null) {
            return codeword3;
        }
        for (int i12 = 1; i12 < 5; i12++) {
            int iImageRowToCodewordIndex = imageRowToCodewordIndex(i11) - i12;
            if (iImageRowToCodewordIndex >= 0 && (codeword2 = this.codewords[iImageRowToCodewordIndex]) != null) {
                return codeword2;
            }
            int iImageRowToCodewordIndex2 = imageRowToCodewordIndex(i11) + i12;
            Codeword[] codewordArr = this.codewords;
            if (iImageRowToCodewordIndex2 < codewordArr.length && (codeword = codewordArr[iImageRowToCodewordIndex2]) != null) {
                return codeword;
            }
        }
        return null;
    }
}
