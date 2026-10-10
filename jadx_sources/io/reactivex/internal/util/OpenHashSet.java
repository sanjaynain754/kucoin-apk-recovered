package io.reactivex.internal.util;

/* JADX INFO: loaded from: classes23.dex */
public final class OpenHashSet<T> {
    private static final int INT_PHI = -1640531527;
    T[] keys;
    final float loadFactor;
    int mask;
    int maxSize;
    int size;

    public OpenHashSet() {
        this(16, 0.75f);
    }

    public OpenHashSet(int i11) {
        this(i11, 0.75f);
    }

    public boolean add(T t11) {
        T t12;
        T[] tArr = this.keys;
        int i11 = this.mask;
        int iMix = mix(t11.hashCode()) & i11;
        T t13 = tArr[iMix];
        if (t13 != null) {
            if (t13.equals(t11)) {
                return false;
            }
            do {
                iMix = (iMix + 1) & i11;
                t12 = tArr[iMix];
                if (t12 == null) {
                }
            } while (!t12.equals(t11));
            return false;
        }
        tArr[iMix] = t11;
        int i12 = this.size + 1;
        this.size = i12;
        if (i12 >= this.maxSize) {
            rehash();
        }
        return true;
    }

    public Object[] keys() {
        return this.keys;
    }

    public void rehash() {
        T t11;
        T[] tArr = this.keys;
        int length = tArr.length;
        int i11 = length << 1;
        int i12 = i11 - 1;
        T[] tArr2 = (T[]) new Object[i11];
        int i13 = this.size;
        while (true) {
            int i14 = i13 - 1;
            if (i13 == 0) {
                this.mask = i12;
                this.maxSize = (int) (i11 * this.loadFactor);
                this.keys = tArr2;
                return;
            }
            do {
                length--;
                t11 = tArr[length];
            } while (t11 == null);
            int iMix = mix(t11.hashCode()) & i12;
            if (tArr2[iMix] != null) {
                do {
                    iMix = (iMix + 1) & i12;
                } while (tArr2[iMix] != null);
            }
            tArr2[iMix] = tArr[length];
            i13 = i14;
        }
    }

    public boolean remove(T t11) {
        T t12;
        T[] tArr = this.keys;
        int i11 = this.mask;
        int iMix = mix(t11.hashCode()) & i11;
        T t13 = tArr[iMix];
        if (t13 == null) {
            return false;
        }
        if (t13.equals(t11)) {
            return removeEntry(iMix, tArr, i11);
        }
        do {
            iMix = (iMix + 1) & i11;
            t12 = tArr[iMix];
            if (t12 == null) {
                return false;
            }
        } while (!t12.equals(t11));
        return removeEntry(iMix, tArr, i11);
    }

    public boolean removeEntry(int i11, T[] tArr, int i12) {
        int i13;
        T t11;
        this.size--;
        while (true) {
            int i14 = i11 + 1;
            while (true) {
                i13 = i14 & i12;
                t11 = tArr[i13];
                if (t11 != null) {
                    int iMix = mix(t11.hashCode()) & i12;
                    if (i11 > i13) {
                        if (i11 >= iMix && iMix > i13) {
                            break;
                        }
                        i14 = i13 + 1;
                    } else {
                        if (i11 >= iMix || iMix > i13) {
                            break;
                        }
                        i14 = i13 + 1;
                    }
                } else {
                    tArr[i11] = null;
                    return true;
                }
            }
            tArr[i11] = t11;
            i11 = i13;
        }
    }

    public int size() {
        return this.size;
    }

    public OpenHashSet(int i11, float f11) {
        this.loadFactor = f11;
        int iRoundToPowerOfTwo = Pow2.roundToPowerOfTwo(i11);
        this.mask = iRoundToPowerOfTwo - 1;
        this.maxSize = (int) (f11 * iRoundToPowerOfTwo);
        this.keys = (T[]) new Object[iRoundToPowerOfTwo];
    }

    public static int mix(int i11) {
        int i12 = i11 * INT_PHI;
        return i12 ^ (i12 >>> 16);
    }
}
