package com.google.zxing.aztec.encoder;

import com.google.zxing.common.BitArray;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes56.dex */
public final class HighLevelEncoder {
    private static final int[][] CHAR_MAP;
    static final int MODE_DIGIT = 2;
    static final int MODE_LOWER = 1;
    static final int MODE_MIXED = 3;
    static final int MODE_PUNCT = 4;
    static final int MODE_UPPER = 0;
    static final int[][] SHIFT_TABLE;
    private final byte[] text;
    static final String[] MODE_NAMES = {"UPPER", "LOWER", "DIGIT", "MIXED", "PUNCT"};
    static final int[][] LATCH_TABLE = {new int[]{0, 327708, 327710, 327709, 656318}, new int[]{590318, 0, 327710, 327709, 656318}, new int[]{262158, 590300, 0, 590301, 932798}, new int[]{327709, 327708, 656318, 0, 327710}, new int[]{327711, 656380, 656382, 656381, 0}};

    static {
        Class cls = Integer.TYPE;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) cls, 5, 256);
        CHAR_MAP = iArr;
        iArr[0][32] = 1;
        for (int i11 = 65; i11 <= 90; i11++) {
            CHAR_MAP[0][i11] = i11 - 63;
        }
        CHAR_MAP[1][32] = 1;
        for (int i12 = 97; i12 <= 122; i12++) {
            CHAR_MAP[1][i12] = i12 - 95;
        }
        CHAR_MAP[2][32] = 1;
        for (int i13 = 48; i13 <= 57; i13++) {
            CHAR_MAP[2][i13] = i13 - 46;
        }
        int[] iArr2 = CHAR_MAP[2];
        iArr2[44] = 12;
        iArr2[46] = 13;
        int[] iArr3 = {0, 32, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 27, 28, 29, 30, 31, 64, 92, 94, 95, 96, 124, 126, 127};
        for (int i14 = 0; i14 < 28; i14++) {
            CHAR_MAP[3][iArr3[i14]] = i14;
        }
        int[] iArr4 = {0, 13, 0, 0, 0, 0, 33, 39, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 58, 59, 60, 61, 62, 63, 91, 93, 123, 125};
        for (int i15 = 0; i15 < 31; i15++) {
            int i16 = iArr4[i15];
            if (i16 > 0) {
                CHAR_MAP[4][i16] = i15;
            }
        }
        int[][] iArr5 = (int[][]) Array.newInstance((Class<?>) cls, 6, 6);
        SHIFT_TABLE = iArr5;
        for (int[] iArr6 : iArr5) {
            Arrays.fill(iArr6, -1);
        }
        int[][] iArr7 = SHIFT_TABLE;
        iArr7[0][4] = 0;
        int[] iArr8 = iArr7[1];
        iArr8[4] = 0;
        iArr8[0] = 28;
        iArr7[3][4] = 0;
        int[] iArr9 = iArr7[2];
        iArr9[4] = 0;
        iArr9[0] = 15;
    }

    private static Collection<State> simplifyStates(Iterable<State> iterable) {
        LinkedList linkedList = new LinkedList();
        for (State state : iterable) {
            Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    linkedList.add(state);
                    break;
                }
                State state2 = (State) it.next();
                if (state2.isBetterThanOrEqualTo(state)) {
                    break;
                }
                if (state.isBetterThanOrEqualTo(state2)) {
                    it.remove();
                }
            }
        }
        return linkedList;
    }

    private void updateStateForChar(State state, int i11, Collection<State> collection) {
        char c11 = (char) (this.text[i11] & 255);
        boolean z11 = CHAR_MAP[state.getMode()][c11] > 0;
        State stateEndBinaryShift = null;
        for (int i12 = 0; i12 <= 4; i12++) {
            int i13 = CHAR_MAP[i12][c11];
            if (i13 > 0) {
                if (stateEndBinaryShift == null) {
                    stateEndBinaryShift = state.endBinaryShift(i11);
                }
                if (!z11 || i12 == state.getMode() || i12 == 2) {
                    collection.add(stateEndBinaryShift.latchAndAppend(i12, i13));
                }
                if (!z11 && SHIFT_TABLE[state.getMode()][i12] >= 0) {
                    collection.add(stateEndBinaryShift.shiftAndAppend(i12, i13));
                }
            }
        }
        if (state.getBinaryShiftByteCount() > 0 || CHAR_MAP[state.getMode()][c11] == 0) {
            collection.add(state.addBinaryShiftChar(i11));
        }
    }

    private Collection<State> updateStateListForChar(Iterable<State> iterable, int i11) {
        LinkedList linkedList = new LinkedList();
        Iterator<State> it = iterable.iterator();
        while (it.hasNext()) {
            updateStateForChar(it.next(), i11, linkedList);
        }
        return simplifyStates(linkedList);
    }

    private static Collection<State> updateStateListForPair(Iterable<State> iterable, int i11, int i12) {
        LinkedList linkedList = new LinkedList();
        Iterator<State> it = iterable.iterator();
        while (it.hasNext()) {
            updateStateForPair(it.next(), i11, i12, linkedList);
        }
        return simplifyStates(linkedList);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002a  */
    public BitArray encode() {
        int i11;
        Collection<State> collectionSingletonList = Collections.singletonList(State.INITIAL_STATE);
        int i12 = 0;
        while (true) {
            byte[] bArr = this.text;
            if (i12 >= bArr.length) {
                return ((State) Collections.min(collectionSingletonList, new Comparator<State>() { // from class: com.google.zxing.aztec.encoder.HighLevelEncoder.1
                    @Override // java.util.Comparator
                    public int compare(State state, State state2) {
                        return state.getBitCount() - state2.getBitCount();
                    }
                })).toBitArray(this.text);
            }
            int i13 = i12 + 1;
            byte b11 = i13 < bArr.length ? bArr[i13] : (byte) 0;
            byte b12 = bArr[i12];
            if (b12 != 13) {
                if (b12 != 44) {
                    if (b12 != 46) {
                        if (b12 == 58 && b11 == 32) {
                            i11 = 5;
                        } else {
                            i11 = 0;
                        }
                    } else if (b11 == 32) {
                        i11 = 3;
                    } else {
                        i11 = 0;
                    }
                } else if (b11 == 32) {
                    i11 = 4;
                } else {
                    i11 = 0;
                }
            } else if (b11 == 10) {
                i11 = 2;
            } else {
                i11 = 0;
            }
            if (i11 > 0) {
                collectionSingletonList = updateStateListForPair(collectionSingletonList, i12, i11);
                i12 = i13;
            } else {
                collectionSingletonList = updateStateListForChar(collectionSingletonList, i12);
            }
            i12++;
        }
    }

    public HighLevelEncoder(byte[] bArr) {
        this.text = bArr;
    }

    private static void updateStateForPair(State state, int i11, int i12, Collection<State> collection) {
        State stateEndBinaryShift = state.endBinaryShift(i11);
        collection.add(stateEndBinaryShift.latchAndAppend(4, i12));
        if (state.getMode() != 4) {
            collection.add(stateEndBinaryShift.shiftAndAppend(4, i12));
        }
        if (i12 == 3 || i12 == 4) {
            collection.add(stateEndBinaryShift.latchAndAppend(2, 16 - i12).latchAndAppend(2, 1));
        }
        if (state.getBinaryShiftByteCount() > 0) {
            collection.add(state.addBinaryShiftChar(i11).addBinaryShiftChar(i11 + 1));
        }
    }
}
