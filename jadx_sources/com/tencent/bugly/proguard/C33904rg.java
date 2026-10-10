package com.tencent.bugly.proguard;

import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.rg */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33904rg extends C33731ja {

    /* JADX INFO: renamed from: d */
    public static final Comparator<C33731ja> f71740d = new a();

    /* JADX INFO: renamed from: c */
    public C33731ja[] f71741c;

    /* JADX INFO: renamed from: b */
    public C33731ja[] m74870b() {
        return this.f71741c;
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.rg$a */
    /* JADX INFO: compiled from: BUGLY */
    public static class a implements Comparator<C33731ja> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(C33731ja c33731ja, C33731ja c33731ja2) {
            return c33731ja.m73544a() - c33731ja2.m73544a();
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m74868a(int i11, C33731ja c33731ja) {
        int iBinarySearch = Arrays.binarySearch(this.f71741c, C33731ja.m73535a(i11), f71740d);
        if (iBinarySearch >= 0) {
            this.f71741c[iBinarySearch] = c33731ja;
            return true;
        }
        int i12 = (-iBinarySearch) - 1;
        C33731ja[] c33731jaArr = new C33731ja[this.f71741c.length + 1];
        for (int i13 = 0; i13 < i12; i13++) {
            c33731jaArr[i13] = this.f71741c[i13];
        }
        c33731jaArr[i12] = c33731ja;
        while (true) {
            C33731ja[] c33731jaArr2 = this.f71741c;
            if (i12 >= c33731jaArr2.length) {
                return false;
            }
            int i14 = i12 + 1;
            c33731jaArr[i14] = c33731jaArr2[i12];
            i12 = i14;
        }
    }

    /* JADX INFO: renamed from: b */
    public C33731ja m74869b(int i11) {
        int iBinarySearch = Arrays.binarySearch(this.f71741c, C33731ja.m73535a(i11), f71740d);
        if (iBinarySearch >= 0) {
            return this.f71741c[iBinarySearch];
        }
        return null;
    }

    public C33904rg(C33731ja[] c33731jaArr, int i11) {
        super(i11);
        this.f71741c = c33731jaArr;
    }
}
