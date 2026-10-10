package net.jpountz.lz4;

import java.nio.ByteBuffer;
import java.util.Arrays;
import net.jpountz.util.ByteBufferUtils;
import net.jpountz.util.SafeUtils;
import p852kotlin.UShort;

/* JADX INFO: loaded from: classes61.dex */
final class LZ4HCJavaSafeCompressor extends LZ4Compressor {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final LZ4Compressor INSTANCE = new LZ4HCJavaSafeCompressor();
    final int compressionLevel;
    private final int maxAttempts;

    public class HashTable {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        static final int MASK = 65535;
        private final int base;
        private final short[] chainTable;
        private final int[] hashTable;
        int nextToUpdate;

        private void addHash(byte[] bArr, int i11) {
            addHash(SafeUtils.readInt(bArr, i11), i11);
        }

        private int hashPointer(byte[] bArr, int i11) {
            return hashPointer(SafeUtils.readInt(bArr, i11));
        }

        public void insert(int i11, byte[] bArr) {
            while (true) {
                int i12 = this.nextToUpdate;
                if (i12 >= i11) {
                    return;
                }
                addHash(bArr, i12);
                this.nextToUpdate++;
            }
        }

        public boolean insertAndFindBestMatch(byte[] bArr, int i11, int i12, LZ4Utils.Match match) {
            int i13;
            int iCommonBytes;
            int iCommonBytes2;
            match.start = i11;
            match.len = 0;
            insert(i11, bArr);
            int iHashPointer = hashPointer(bArr, i11);
            if (iHashPointer < i11 - 4 || iHashPointer > i11 || iHashPointer < this.base) {
                i13 = 0;
                iCommonBytes = 0;
            } else {
                if (LZ4SafeUtils.readIntEquals(bArr, iHashPointer, i11)) {
                    i13 = i11 - iHashPointer;
                    iCommonBytes = LZ4SafeUtils.commonBytes(bArr, iHashPointer + 4, i11 + 4, i12) + 4;
                    match.len = iCommonBytes;
                    match.ref = iHashPointer;
                } else {
                    i13 = 0;
                    iCommonBytes = 0;
                }
                iHashPointer = next(iHashPointer);
            }
            for (int i14 = 0; i14 < LZ4HCJavaSafeCompressor.this.maxAttempts && iHashPointer >= Math.max(this.base, i11 - 65535) && iHashPointer <= i11; i14++) {
                if (LZ4SafeUtils.readIntEquals(bArr, iHashPointer, i11) && (iCommonBytes2 = LZ4SafeUtils.commonBytes(bArr, iHashPointer + 4, i11 + 4, i12) + 4) > match.len) {
                    match.ref = iHashPointer;
                    match.len = iCommonBytes2;
                }
                iHashPointer = next(iHashPointer);
            }
            if (iCommonBytes != 0) {
                int i15 = (iCommonBytes + i11) - 3;
                while (i11 < i15 - i13) {
                    this.chainTable[i11 & 65535] = (short) i13;
                    i11++;
                }
                do {
                    this.chainTable[i11 & 65535] = (short) i13;
                    this.hashTable[LZ4Utils.hashHC(SafeUtils.readInt(bArr, i11))] = i11;
                    i11++;
                } while (i11 < i15);
                this.nextToUpdate = i15;
            }
            return match.len != 0;
        }

        public boolean insertAndFindWiderMatch(byte[] bArr, int i11, int i12, int i13, int i14, LZ4Utils.Match match) {
            match.len = i14;
            insert(i11, bArr);
            int iHashPointer = hashPointer(bArr, i11);
            for (int i15 = 0; i15 < LZ4HCJavaSafeCompressor.this.maxAttempts && iHashPointer >= Math.max(this.base, i11 - 65535) && iHashPointer <= i11; i15++) {
                if (LZ4SafeUtils.readIntEquals(bArr, iHashPointer, i11)) {
                    int iCommonBytes = LZ4SafeUtils.commonBytes(bArr, iHashPointer + 4, i11 + 4, i13) + 4;
                    int iCommonBytesBackward = LZ4SafeUtils.commonBytesBackward(bArr, iHashPointer, i11, this.base, i12);
                    int i16 = iCommonBytes + iCommonBytesBackward;
                    if (i16 > match.len) {
                        match.len = i16;
                        match.ref = iHashPointer - iCommonBytesBackward;
                        match.start = i11 - iCommonBytesBackward;
                    }
                }
                iHashPointer = next(iHashPointer);
            }
            return match.len > i14;
        }

        public HashTable(int i11) {
            this.base = i11;
            this.nextToUpdate = i11;
            int[] iArr = new int[32768];
            this.hashTable = iArr;
            Arrays.fill(iArr, -1);
            this.chainTable = new short[65536];
        }

        private int next(int i11) {
            return i11 - (this.chainTable[i11 & 65535] & UShort.MAX_VALUE);
        }

        private void addHash(ByteBuffer byteBuffer, int i11) {
            addHash(ByteBufferUtils.readInt(byteBuffer, i11), i11);
        }

        private int hashPointer(ByteBuffer byteBuffer, int i11) {
            return hashPointer(ByteBufferUtils.readInt(byteBuffer, i11));
        }

        public void insert(int i11, ByteBuffer byteBuffer) {
            while (true) {
                int i12 = this.nextToUpdate;
                if (i12 >= i11) {
                    return;
                }
                addHash(byteBuffer, i12);
                this.nextToUpdate++;
            }
        }

        private void addHash(int i11, int i12) {
            int iHashHC = LZ4Utils.hashHC(i11);
            int[] iArr = this.hashTable;
            int i13 = i12 - iArr[iHashHC];
            if (i13 >= 65536) {
                i13 = 65535;
            }
            this.chainTable[65535 & i12] = (short) i13;
            iArr[iHashHC] = i12;
        }

        private int hashPointer(int i11) {
            return this.hashTable[LZ4Utils.hashHC(i11)];
        }

        public boolean insertAndFindWiderMatch(ByteBuffer byteBuffer, int i11, int i12, int i13, int i14, LZ4Utils.Match match) {
            match.len = i14;
            insert(i11, byteBuffer);
            int iHashPointer = hashPointer(byteBuffer, i11);
            for (int i15 = 0; i15 < LZ4HCJavaSafeCompressor.this.maxAttempts && iHashPointer >= Math.max(this.base, i11 - 65535) && iHashPointer <= i11; i15++) {
                if (LZ4ByteBufferUtils.readIntEquals(byteBuffer, iHashPointer, i11)) {
                    int iCommonBytes = LZ4ByteBufferUtils.commonBytes(byteBuffer, iHashPointer + 4, i11 + 4, i13) + 4;
                    int iCommonBytesBackward = LZ4ByteBufferUtils.commonBytesBackward(byteBuffer, iHashPointer, i11, this.base, i12);
                    int i16 = iCommonBytes + iCommonBytesBackward;
                    if (i16 > match.len) {
                        match.len = i16;
                        match.ref = iHashPointer - iCommonBytesBackward;
                        match.start = i11 - iCommonBytesBackward;
                    }
                }
                iHashPointer = next(iHashPointer);
            }
            return match.len > i14;
        }

        public boolean insertAndFindBestMatch(ByteBuffer byteBuffer, int i11, int i12, LZ4Utils.Match match) {
            int i13;
            int iCommonBytes;
            int iCommonBytes2;
            match.start = i11;
            match.len = 0;
            insert(i11, byteBuffer);
            int iHashPointer = hashPointer(byteBuffer, i11);
            if (iHashPointer < i11 - 4 || iHashPointer > i11 || iHashPointer < this.base) {
                i13 = 0;
                iCommonBytes = 0;
            } else {
                if (LZ4ByteBufferUtils.readIntEquals(byteBuffer, iHashPointer, i11)) {
                    i13 = i11 - iHashPointer;
                    iCommonBytes = LZ4ByteBufferUtils.commonBytes(byteBuffer, iHashPointer + 4, i11 + 4, i12) + 4;
                    match.len = iCommonBytes;
                    match.ref = iHashPointer;
                } else {
                    i13 = 0;
                    iCommonBytes = 0;
                }
                iHashPointer = next(iHashPointer);
            }
            for (int i14 = 0; i14 < LZ4HCJavaSafeCompressor.this.maxAttempts && iHashPointer >= Math.max(this.base, i11 - 65535) && iHashPointer <= i11; i14++) {
                if (LZ4ByteBufferUtils.readIntEquals(byteBuffer, iHashPointer, i11) && (iCommonBytes2 = LZ4ByteBufferUtils.commonBytes(byteBuffer, iHashPointer + 4, i11 + 4, i12) + 4) > match.len) {
                    match.ref = iHashPointer;
                    match.len = iCommonBytes2;
                }
                iHashPointer = next(iHashPointer);
            }
            if (iCommonBytes != 0) {
                int i15 = (iCommonBytes + i11) - 3;
                while (i11 < i15 - i13) {
                    this.chainTable[i11 & 65535] = (short) i13;
                    i11++;
                }
                do {
                    this.chainTable[i11 & 65535] = (short) i13;
                    this.hashTable[LZ4Utils.hashHC(ByteBufferUtils.readInt(byteBuffer, i11))] = i11;
                    i11++;
                } while (i11 < i15);
                this.nextToUpdate = i15;
            }
            return match.len != 0;
        }
    }

    public LZ4HCJavaSafeCompressor() {
        this(9);
    }

    @Override // net.jpountz.lz4.LZ4Compressor
    public int compress(byte[] bArr, int i11, int i12, byte[] bArr2, int i13, int i14) {
        LZ4Utils.Match match;
        char c11;
        LZ4Utils.Match match2;
        SafeUtils.checkRange(bArr, i11, i12);
        SafeUtils.checkRange(bArr2, i13, i14);
        int i15 = i11 + i12;
        int i16 = i13 + i14;
        int i17 = i15 - 12;
        int i18 = i15 - 5;
        HashTable hashTable = new HashTable(i11);
        LZ4Utils.Match match3 = new LZ4Utils.Match();
        LZ4Utils.Match match4 = new LZ4Utils.Match();
        LZ4Utils.Match match5 = new LZ4Utils.Match();
        LZ4Utils.Match match6 = new LZ4Utils.Match();
        int i19 = i11;
        int iEnd = i11 + 1;
        int iEncodeSequence = i13;
        while (iEnd < i17) {
            bArr = bArr;
            if (hashTable.insertAndFindBestMatch(bArr, iEnd, i18, match4)) {
                LZ4Utils.copyTo(match4, match3);
                int i21 = i19;
                int i22 = iEncodeSequence;
                while (true) {
                    if (match4.end() < i17) {
                        LZ4Utils.Match match7 = match5;
                        if (hashTable.insertAndFindWiderMatch(bArr, match4.end() - 2, match4.start + 1, i18, match4.len, match5)) {
                            int i23 = match3.start;
                            int i24 = match4.start;
                            if (i23 < i24 && match7.start < i24 + match3.len) {
                                LZ4Utils.copyTo(match3, match4);
                            }
                            char c12 = 3;
                            if (match7.start - match4.start < 3) {
                                LZ4Utils.copyTo(match7, match4);
                                match5 = match7;
                            } else {
                                while (true) {
                                    int i25 = match7.start;
                                    int i26 = match4.start;
                                    int i27 = i21;
                                    if (i25 - i26 < 18) {
                                        int i28 = match4.len;
                                        if (i28 > 18) {
                                            i28 = 18;
                                        }
                                        c11 = c12;
                                        if (i26 + i28 > match7.end() - 4) {
                                            i28 = ((match7.start - match4.start) + match7.len) - 4;
                                        }
                                        int i29 = i28 - (match7.start - match4.start);
                                        if (i29 > 0) {
                                            match7.fix(i29);
                                        }
                                    } else {
                                        c11 = c12;
                                    }
                                    if (match7.start + match7.len < i17) {
                                        c12 = c11;
                                        LZ4Utils.Match match8 = match6;
                                        match7 = match7;
                                        hashTable = hashTable;
                                        i18 = i18;
                                        if (!hashTable.insertAndFindWiderMatch(bArr, match7.end() - 3, match7.start, i18, match7.len, match8)) {
                                            match2 = match8;
                                        } else if (match8.start >= match4.end() + 3) {
                                            int i31 = i22;
                                            if (match7.start < match4.end()) {
                                                int i32 = match7.start;
                                                int i33 = match4.start;
                                                if (i32 - i33 < 15) {
                                                    if (match4.len > 18) {
                                                        match4.len = 18;
                                                    }
                                                    if (match4.end() > match7.end() - 4) {
                                                        match4.len = (match7.end() - match4.start) - 4;
                                                    }
                                                    match7.fix(match4.end() - match7.start);
                                                } else {
                                                    match4.len = i32 - i33;
                                                }
                                            }
                                            int iEncodeSequence2 = LZ4SafeUtils.encodeSequence(bArr, i27, match4.start, match4.ref, match4.len, bArr2, i31, i16);
                                            int iEnd2 = match4.end();
                                            LZ4Utils.copyTo(match7, match4);
                                            LZ4Utils.copyTo(match8, match7);
                                            match6 = match8;
                                            i22 = iEncodeSequence2;
                                            i21 = iEnd2;
                                        } else if (match8.start >= match4.end()) {
                                            if (match7.start < match4.end()) {
                                                match7.fix(match4.end() - match7.start);
                                                if (match7.len < 4) {
                                                    LZ4Utils.copyTo(match8, match7);
                                                }
                                            }
                                            int iEncodeSequence3 = LZ4SafeUtils.encodeSequence(bArr, i27, match4.start, match4.ref, match4.len, bArr2, i22, i16);
                                            int iEnd3 = match4.end();
                                            LZ4Utils.copyTo(match8, match4);
                                            LZ4Utils.copyTo(match7, match3);
                                            match5 = match7;
                                            match6 = match8;
                                            i18 = i18;
                                            i22 = iEncodeSequence3;
                                            i21 = iEnd3;
                                            hashTable = hashTable;
                                        } else {
                                            LZ4Utils.copyTo(match8, match7);
                                            i21 = i27;
                                            match6 = match8;
                                            i22 = i22;
                                        }
                                    } else {
                                        hashTable = hashTable;
                                        i18 = i18;
                                        match2 = match6;
                                        match7 = match7;
                                    }
                                    if (match7.start < match4.end()) {
                                        match4.len = match7.start - match4.start;
                                    }
                                    iEncodeSequence = LZ4SafeUtils.encodeSequence(bArr, match4.end(), match7.start, match7.ref, match7.len, bArr2, LZ4SafeUtils.encodeSequence(bArr, i27, match4.start, match4.ref, match4.len, bArr2, i22, i16), i16);
                                    iEnd = match7.end();
                                    i19 = iEnd;
                                    match5 = match7;
                                    match6 = match2;
                                }
                            }
                        } else {
                            match = match7;
                        }
                        i18 = i18;
                        hashTable = hashTable;
                    } else {
                        match = match5;
                    }
                    hashTable = hashTable;
                    i18 = i18;
                    iEncodeSequence = LZ4SafeUtils.encodeSequence(bArr, i21, match4.start, match4.ref, match4.len, bArr2, i22, i16);
                    iEnd = match4.end();
                    i19 = iEnd;
                    match5 = match;
                    match6 = match6;
                    i18 = i18;
                    hashTable = hashTable;
                }
            } else {
                iEnd++;
            }
        }
        return LZ4SafeUtils.lastLiterals(bArr, i19, i15 - i19, bArr2, iEncodeSequence, i16) - i13;
    }

    public LZ4HCJavaSafeCompressor(int i11) {
        this.maxAttempts = 1 << (i11 - 1);
        this.compressionLevel = i11;
    }

    @Override // net.jpountz.lz4.LZ4Compressor
    public int compress(ByteBuffer byteBuffer, int i11, int i12, ByteBuffer byteBuffer2, int i13, int i14) {
        HashTable hashTable;
        ByteBuffer byteBuffer3;
        LZ4Utils.Match match;
        LZ4Utils.Match match2;
        char c11;
        int i15 = i11;
        if (byteBuffer.hasArray() && byteBuffer2.hasArray()) {
            return compress(byteBuffer.array(), i15 + byteBuffer.arrayOffset(), i12, byteBuffer2.array(), i13 + byteBuffer2.arrayOffset(), i14);
        }
        ByteBuffer byteBufferInNativeByteOrder = ByteBufferUtils.inNativeByteOrder(byteBuffer);
        ByteBuffer byteBufferInNativeByteOrder2 = ByteBufferUtils.inNativeByteOrder(byteBuffer2);
        ByteBufferUtils.checkRange(byteBufferInNativeByteOrder, i15, i12);
        ByteBufferUtils.checkRange(byteBufferInNativeByteOrder2, i13, i14);
        int i16 = i15 + i12;
        int i17 = i13 + i14;
        int i18 = i16 - 12;
        int i19 = i16 - 5;
        int iEnd = i15 + 1;
        HashTable hashTable2 = new HashTable(i15);
        LZ4Utils.Match match3 = new LZ4Utils.Match();
        LZ4Utils.Match match4 = new LZ4Utils.Match();
        LZ4Utils.Match match5 = new LZ4Utils.Match();
        LZ4Utils.Match match6 = new LZ4Utils.Match();
        int iEncodeSequence = i13;
        while (iEnd < i18) {
            if (hashTable2.insertAndFindBestMatch(byteBufferInNativeByteOrder, iEnd, i19, match4)) {
                LZ4Utils.copyTo(match4, match3);
                int iEncodeSequence2 = iEncodeSequence;
                while (true) {
                    if (match4.end() < i18) {
                        boolean zInsertAndFindWiderMatch = hashTable2.insertAndFindWiderMatch(byteBufferInNativeByteOrder, match4.end() - 2, match4.start + 1, i19, match4.len, match5);
                        ByteBuffer byteBuffer4 = byteBufferInNativeByteOrder;
                        hashTable = hashTable2;
                        byteBuffer3 = byteBuffer4;
                        match = match5;
                        if (zInsertAndFindWiderMatch) {
                            int i21 = match3.start;
                            int i22 = match4.start;
                            if (i21 < i22 && match.start < i22 + match3.len) {
                                LZ4Utils.copyTo(match3, match4);
                            }
                            char c12 = 3;
                            if (match.start - match4.start < 3) {
                                LZ4Utils.copyTo(match, match4);
                                byteBufferInNativeByteOrder = byteBuffer3;
                                hashTable2 = hashTable;
                                match5 = match;
                            } else {
                                while (true) {
                                    int i23 = match.start;
                                    int i24 = match4.start;
                                    int i25 = i15;
                                    if (i23 - i24 < 18) {
                                        int i26 = match4.len;
                                        if (i26 > 18) {
                                            i26 = 18;
                                        }
                                        c11 = c12;
                                        if (i24 + i26 > match.end() - 4) {
                                            i26 = ((match.start - match4.start) + match.len) - 4;
                                        }
                                        int i27 = i26 - (match.start - match4.start);
                                        if (i27 > 0) {
                                            match.fix(i27);
                                        }
                                    } else {
                                        c11 = c12;
                                    }
                                    if (match.start + match.len < i18) {
                                        HashTable hashTable3 = hashTable;
                                        ByteBuffer byteBuffer5 = byteBuffer3;
                                        match = match;
                                        LZ4Utils.Match match7 = match6;
                                        char c13 = c11;
                                        hashTable = hashTable3;
                                        byteBuffer3 = byteBuffer5;
                                        i19 = i19;
                                        if (!hashTable3.insertAndFindWiderMatch(byteBuffer5, match.end() - 3, match.start, i19, match.len, match7)) {
                                            match2 = match7;
                                        } else if (match7.start < match4.end() + 3) {
                                            if (match7.start >= match4.end()) {
                                                if (match.start < match4.end()) {
                                                    match.fix(match4.end() - match.start);
                                                    if (match.len < 4) {
                                                        LZ4Utils.copyTo(match7, match);
                                                    }
                                                }
                                                ByteBuffer byteBuffer6 = byteBufferInNativeByteOrder2;
                                                iEncodeSequence2 = LZ4ByteBufferUtils.encodeSequence(byteBuffer3, i25, match4.start, match4.ref, match4.len, byteBuffer6, iEncodeSequence2, i17);
                                                int iEnd2 = match4.end();
                                                LZ4Utils.copyTo(match7, match4);
                                                LZ4Utils.copyTo(match, match3);
                                                match5 = match;
                                                match6 = match7;
                                                i15 = iEnd2;
                                                byteBufferInNativeByteOrder2 = byteBuffer6;
                                                i19 = i19;
                                                byteBufferInNativeByteOrder = byteBuffer3;
                                                hashTable2 = hashTable;
                                            } else {
                                                LZ4Utils.copyTo(match7, match);
                                                match6 = match7;
                                                byteBufferInNativeByteOrder2 = byteBufferInNativeByteOrder2;
                                                c12 = c13;
                                                i15 = i25;
                                            }
                                        } else {
                                            ByteBuffer byteBuffer7 = byteBufferInNativeByteOrder2;
                                            int i28 = iEncodeSequence2;
                                            if (match.start < match4.end()) {
                                                int i29 = match.start;
                                                int i31 = match4.start;
                                                if (i29 - i31 < 15) {
                                                    if (match4.len > 18) {
                                                        match4.len = 18;
                                                    }
                                                    if (match4.end() > match.end() - 4) {
                                                        match4.len = (match.end() - match4.start) - 4;
                                                    }
                                                    match.fix(match4.end() - match.start);
                                                } else {
                                                    match4.len = i29 - i31;
                                                }
                                            }
                                            iEncodeSequence2 = LZ4ByteBufferUtils.encodeSequence(byteBuffer3, i25, match4.start, match4.ref, match4.len, byteBuffer7, i28, i17);
                                            int iEnd3 = match4.end();
                                            LZ4Utils.copyTo(match, match4);
                                            LZ4Utils.copyTo(match7, match);
                                            match6 = match7;
                                            byteBufferInNativeByteOrder2 = byteBuffer7;
                                            c12 = c13;
                                            i15 = iEnd3;
                                        }
                                    } else {
                                        hashTable = hashTable;
                                        match = match;
                                        i19 = i19;
                                        match2 = match6;
                                    }
                                    int i32 = iEncodeSequence2;
                                    if (match.start < match4.end()) {
                                        match4.len = match.start - match4.start;
                                    }
                                    iEncodeSequence = LZ4ByteBufferUtils.encodeSequence(byteBuffer3, match4.end(), match.start, match.ref, match.len, byteBufferInNativeByteOrder2, LZ4ByteBufferUtils.encodeSequence(byteBuffer3, i25, match4.start, match4.ref, match4.len, byteBufferInNativeByteOrder2, i32, i17), i17);
                                    iEnd = match.end();
                                }
                            }
                        } else {
                            hashTable = hashTable;
                            match = match;
                        }
                        match5 = match;
                        match6 = match2;
                        byteBufferInNativeByteOrder = byteBuffer3;
                        i15 = iEnd;
                        byteBufferInNativeByteOrder2 = byteBufferInNativeByteOrder2;
                        i19 = i19;
                        hashTable2 = hashTable;
                    } else {
                        hashTable = hashTable2;
                        byteBuffer3 = byteBufferInNativeByteOrder;
                        match = match5;
                    }
                    byteBufferInNativeByteOrder2 = byteBufferInNativeByteOrder2;
                    i19 = i19;
                    match2 = match6;
                    iEncodeSequence = LZ4ByteBufferUtils.encodeSequence(byteBuffer3, i15, match4.start, match4.ref, match4.len, byteBufferInNativeByteOrder2, iEncodeSequence2, i17);
                    iEnd = match4.end();
                    match5 = match;
                    match6 = match2;
                    byteBufferInNativeByteOrder = byteBuffer3;
                    i15 = iEnd;
                    byteBufferInNativeByteOrder2 = byteBufferInNativeByteOrder2;
                    i19 = i19;
                    hashTable2 = hashTable;
                }
            } else {
                iEnd++;
            }
        }
        ByteBuffer byteBuffer8 = byteBufferInNativeByteOrder;
        int i33 = i15;
        return LZ4ByteBufferUtils.lastLiterals(byteBuffer8, i33, i16 - i33, byteBufferInNativeByteOrder2, iEncodeSequence, i17) - i13;
    }
}
