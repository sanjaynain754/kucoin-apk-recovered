package com.tencent.bugly.proguard;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.ja */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33731ja {

    /* JADX INFO: renamed from: b */
    public static C34046yi[] f70354b = new C34046yi[256];

    /* JADX INFO: renamed from: a */
    public int f70355a;

    /* JADX INFO: renamed from: a */
    public int m73544a() {
        return this.f70355a;
    }

    static {
        int i11 = 0;
        while (true) {
            C34046yi[] c34046yiArr = f70354b;
            if (i11 >= c34046yiArr.length) {
                return;
            }
            c34046yiArr[i11] = new C34046yi(i11);
            i11++;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C33731ja m73532a(byte b11, int i11) {
        return new C33639f2(b11, i11);
    }

    /* JADX INFO: renamed from: b */
    public static C33731ja m73543b(C33731ja[] c33731jaArr, int i11) {
        return new C33904rg(c33731jaArr, i11);
    }

    public C33731ja(int i11) {
        this.f70355a = i11;
    }

    /* JADX INFO: renamed from: a */
    public static C33731ja m73539a(short s11, int i11) {
        return new C33737jg(s11, i11);
    }

    /* JADX INFO: renamed from: a */
    public static C33731ja m73536a(int i11, int i12) {
        return new C33626ea(i11, i12);
    }

    /* JADX INFO: renamed from: a */
    public static C33731ja m73537a(long j11, int i11) {
        return new C33669gb(j11, i11);
    }

    /* JADX INFO: renamed from: a */
    public static C33731ja m73534a(float f11, int i11) {
        return new C33581c7(f11, i11);
    }

    /* JADX INFO: renamed from: a */
    public static C33731ja m73533a(double d11, int i11) {
        return new C33892r4(d11, i11);
    }

    /* JADX INFO: renamed from: a */
    public static C33731ja m73538a(String str, int i11) {
        return new C33884qg(str, i11);
    }

    /* JADX INFO: renamed from: a */
    public static C33731ja m73540a(byte[] bArr, int i11) {
        return new C33618e2(bArr, i11);
    }

    /* JADX INFO: renamed from: a */
    public static C33731ja m73541a(C33731ja[] c33731jaArr, int i11) {
        return new C34038ya(c33731jaArr, i11);
    }

    /* JADX INFO: renamed from: a */
    public static C33731ja m73542a(C33731ja[] c33731jaArr, C33731ja[] c33731jaArr2, int i11) {
        return new C33837ob(c33731jaArr, c33731jaArr2, i11);
    }

    /* JADX INFO: renamed from: a */
    public static C33731ja m73535a(int i11) {
        if (i11 >= 0 && i11 < 255) {
            return f70354b[i11];
        }
        throw new C33689ha(C33986vi.m75326a("invalid tag: ", i11));
    }
}
