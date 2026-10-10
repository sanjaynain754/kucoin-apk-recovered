package com.google.zxing.aztec.encoder;

import com.google.zxing.common.BitArray;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes56.dex */
final class State {
    static final State INITIAL_STATE = new State(Token.EMPTY, 0, 0, 0);
    private final int binaryShiftByteCount;
    private final int bitCount;
    private final int mode;
    private final Token token;

    public State addBinaryShiftChar(int i11) {
        int i12;
        Token tokenAdd = this.token;
        int i13 = this.mode;
        int i14 = this.bitCount;
        if (i13 == 4 || i13 == 2) {
            int i15 = HighLevelEncoder.LATCH_TABLE[i13][0];
            int i16 = 65535 & i15;
            int i17 = i15 >> 16;
            tokenAdd = tokenAdd.add(i16, i17);
            i14 += i17;
            i13 = 0;
        }
        int i18 = this.binaryShiftByteCount;
        if (i18 == 0 || i18 == 31) {
            i12 = 18;
        } else {
            i12 = i18 == 62 ? 9 : 8;
        }
        State state = new State(tokenAdd, i13, i18 + 1, i14 + i12);
        return state.binaryShiftByteCount == 2078 ? state.endBinaryShift(i11 + 1) : state;
    }

    public State endBinaryShift(int i11) {
        int i12 = this.binaryShiftByteCount;
        return i12 == 0 ? this : new State(this.token.addBinaryShift(i11 - i12, i12), this.mode, 0, this.bitCount);
    }

    public int getBinaryShiftByteCount() {
        return this.binaryShiftByteCount;
    }

    public int getBitCount() {
        return this.bitCount;
    }

    public int getMode() {
        return this.mode;
    }

    public Token getToken() {
        return this.token;
    }

    public boolean isBetterThanOrEqualTo(State state) {
        int i11;
        int i12 = this.bitCount + (HighLevelEncoder.LATCH_TABLE[this.mode][state.mode] >> 16);
        int i13 = state.binaryShiftByteCount;
        if (i13 > 0 && ((i11 = this.binaryShiftByteCount) == 0 || i11 > i13)) {
            i12 += 10;
        }
        return i12 <= state.bitCount;
    }

    public State latchAndAppend(int i11, int i12) {
        int i13 = this.bitCount;
        Token tokenAdd = this.token;
        int i14 = this.mode;
        if (i11 != i14) {
            int i15 = HighLevelEncoder.LATCH_TABLE[i14][i11];
            int i16 = 65535 & i15;
            int i17 = i15 >> 16;
            tokenAdd = tokenAdd.add(i16, i17);
            i13 += i17;
        }
        int i18 = i11 == 2 ? 4 : 5;
        return new State(tokenAdd.add(i12, i18), i11, 0, i13 + i18);
    }

    public State shiftAndAppend(int i11, int i12) {
        Token token = this.token;
        int i13 = this.mode;
        int i14 = i13 == 2 ? 4 : 5;
        return new State(token.add(HighLevelEncoder.SHIFT_TABLE[i13][i11], i14).add(i12, 5), this.mode, 0, this.bitCount + i14 + 5);
    }

    public BitArray toBitArray(byte[] bArr) {
        LinkedList linkedList = new LinkedList();
        for (Token previous = endBinaryShift(bArr.length).token; previous != null; previous = previous.getPrevious()) {
            linkedList.addFirst(previous);
        }
        BitArray bitArray = new BitArray();
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            ((Token) it.next()).appendTo(bitArray, bArr);
        }
        return bitArray;
    }

    public String toString() {
        return String.format("%s bits=%d bytes=%d", HighLevelEncoder.MODE_NAMES[this.mode], Integer.valueOf(this.bitCount), Integer.valueOf(this.binaryShiftByteCount));
    }

    private State(Token token, int i11, int i12, int i13) {
        this.token = token;
        this.mode = i11;
        this.binaryShiftByteCount = i12;
        this.bitCount = i13;
    }
}
