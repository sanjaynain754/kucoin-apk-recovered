package com.google.common.base;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import java.util.BitSet;

/* JADX INFO: loaded from: classes56.dex */
@GwtIncompatible
@ElementTypesAreNonnullByDefault
final class SmallCharMatcher extends CharMatcher.NamedFastMatcher {

    /* JADX INFO: renamed from: C1 */
    private static final int f12223C1 = -862048943;

    /* JADX INFO: renamed from: C2 */
    private static final int f12224C2 = 461845907;
    private static final double DESIRED_LOAD_FACTOR = 0.5d;
    static final int MAX_SIZE = 1023;
    private final boolean containsZero;
    private final long filter;
    private final char[] table;

    @VisibleForTesting
    public static int chooseTableSize(int i11) {
        if (i11 == 1) {
            return 2;
        }
        int iHighestOneBit = Integer.highestOneBit(i11 - 1) << 1;
        while (((double) iHighestOneBit) * 0.5d < i11) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    private boolean checkFilter(int i11) {
        return 1 == ((this.filter >> i11) & 1);
    }

    @Override // com.google.common.base.CharMatcher
    public boolean matches(char c11) {
        if (c11 == 0) {
            return this.containsZero;
        }
        if (!checkFilter(c11)) {
            return false;
        }
        int length = this.table.length - 1;
        int iSmear = smear(c11) & length;
        int i11 = iSmear;
        do {
            char c12 = this.table[i11];
            if (c12 == 0) {
                return false;
            }
            if (c12 == c11) {
                return true;
            }
            i11 = (i11 + 1) & length;
        } while (i11 != iSmear);
        return false;
    }

    @Override // com.google.common.base.CharMatcher
    public void setBits(BitSet bitSet) {
        if (this.containsZero) {
            bitSet.set(0);
        }
        for (char c11 : this.table) {
            if (c11 != 0) {
                bitSet.set(c11);
            }
        }
    }

    private SmallCharMatcher(char[] cArr, long j11, boolean z11, String str) {
        super(str);
        this.table = cArr;
        this.filter = j11;
        this.containsZero = z11;
    }

    public static CharMatcher from(BitSet bitSet, String str) {
        int i11;
        int iCardinality = bitSet.cardinality();
        boolean z11 = bitSet.get(0);
        int iChooseTableSize = chooseTableSize(iCardinality);
        char[] cArr = new char[iChooseTableSize];
        int i12 = iChooseTableSize - 1;
        int iNextSetBit = bitSet.nextSetBit(0);
        long j11 = 0;
        while (iNextSetBit != -1) {
            long j12 = (1 << iNextSetBit) | j11;
            int iSmear = smear(iNextSetBit);
            while (true) {
                i11 = iSmear & i12;
                if (cArr[i11] == 0) {
                    break;
                }
                iSmear = i11 + 1;
            }
            cArr[i11] = (char) iNextSetBit;
            iNextSetBit = bitSet.nextSetBit(iNextSetBit + 1);
            j11 = j12;
        }
        return new SmallCharMatcher(cArr, j11, z11, str);
    }

    public static int smear(int i11) {
        return Integer.rotateLeft(i11 * (-862048943), 15) * f12224C2;
    }
}
