package net.jpountz.lz4;

/* JADX INFO: loaded from: classes61.dex */
enum LZ4Utils {
    ;

    private static final int MAX_INPUT_SIZE = 2113929216;

    public static class Match {
        int len;
        int ref;
        int start;

        public int end() {
            return this.start + this.len;
        }

        public void fix(int i11) {
            this.start += i11;
            this.ref += i11;
            this.len -= i11;
        }
    }

    public static void copyTo(Match match, Match match2) {
        match2.len = match.len;
        match2.start = match.start;
        match2.ref = match.ref;
    }

    public static int maxCompressedLength(int i11) {
        if (i11 >= 0) {
            if (i11 < MAX_INPUT_SIZE) {
                return i11 + (i11 / 255) + 16;
            }
            throw new IllegalArgumentException("length must be < 2113929216");
        }
        throw new IllegalArgumentException("length must be >= 0, got " + i11);
    }

    public static int hash(int i11) {
        return (i11 * (-1640531535)) >>> 20;
    }

    public static int hash64k(int i11) {
        return (i11 * (-1640531535)) >>> 19;
    }

    public static int hashHC(int i11) {
        return (i11 * (-1640531535)) >>> 17;
    }
}
