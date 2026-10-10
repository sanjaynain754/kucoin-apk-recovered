package com.tencent.bugly.proguard;

import java.util.Arrays;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.da */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33605da implements Cloneable {

    /* JADX INFO: renamed from: d */
    public static final int f69561d = 12;

    /* JADX INFO: renamed from: b */
    public int[] f69562b;

    /* JADX INFO: renamed from: c */
    public int f69563c;

    public C33605da(int[] iArr, int i11) {
        this.f69562b = iArr;
        this.f69563c = m72810a(i11, 0, iArr.length, "size");
    }

    /* JADX INFO: renamed from: a */
    public static int m72810a(int i11, int i12, int i13, String str) {
        if (i11 < i12) {
            throw new IllegalArgumentException(String.format("%s is out of range of [%d, %d] (too low)", str, Integer.valueOf(i12), Integer.valueOf(i13)));
        }
        if (i11 <= i13) {
            return i11;
        }
        throw new IllegalArgumentException(String.format("%s is out of range of [%d, %d] (too high)", str, Integer.valueOf(i12), Integer.valueOf(i13)));
    }

    /* JADX INFO: renamed from: b */
    public final void m72817b(int i11) {
        int i12 = this.f69563c;
        int i13 = i11 + i12;
        int[] iArr = this.f69562b;
        if (i13 >= iArr.length) {
            int i14 = (i12 < 6 ? 12 : i12 >> 1) + i12;
            if (i14 > i13) {
                i13 = i14;
            }
            int[] iArr2 = new int[i13];
            System.arraycopy(iArr, 0, iArr2, 0, i12);
            this.f69562b = iArr2;
        }
    }

    /* JADX INFO: renamed from: c */
    public static int[] m72812c(int i11) {
        return new int[i11];
    }

    public C33605da() {
        this(0);
    }

    public C33605da(int i11) {
        if (i11 == 0) {
            this.f69562b = new int[0];
        } else {
            this.f69562b = m72812c(i11);
        }
        this.f69563c = 0;
    }

    /* JADX INFO: renamed from: b */
    public int[] m72818b() {
        return Arrays.copyOf(this.f69562b, this.f69563c);
    }

    /* JADX INFO: renamed from: b */
    public static void m72811b(int i11, int i12) {
        if (i12 < 0 || i11 <= i12) {
            throw new ArrayIndexOutOfBoundsException("length=" + i11 + "; index=" + i12);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m72816a(int[] iArr) {
        int length = iArr.length;
        m72817b(length);
        System.arraycopy(iArr, 0, this.f69562b, this.f69563c, length);
        this.f69563c += length;
    }

    /* JADX INFO: renamed from: a */
    public void m72814a(int i11) {
        m72815a(this.f69563c, i11);
    }

    /* JADX INFO: renamed from: a */
    public void m72815a(int i11, int i12) {
        m72817b(1);
        int i13 = this.f69563c;
        int i14 = i13 - i11;
        int i15 = i13 + 1;
        this.f69563c = i15;
        m72811b(i15, i11);
        if (i14 != 0) {
            int[] iArr = this.f69562b;
            System.arraycopy(iArr, i11, iArr, i11 + 1, i14);
        }
        this.f69562b[i11] = i12;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C33605da clone() {
        return new C33605da((int[]) this.f69562b.clone(), this.f69563c);
    }
}
