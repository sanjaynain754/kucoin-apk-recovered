package com.geetest.gtc4;

/* JADX INFO: renamed from: com.geetest.gtc4.g */
/* JADX INFO: loaded from: classes45.dex */
public final class C6761g {

    /* JADX INFO: renamed from: d */
    public static final InterfaceC6752f[] f11363d = new InterfaceC6752f[0];

    /* JADX INFO: renamed from: a */
    public InterfaceC6752f[] f11364a;

    /* JADX INFO: renamed from: b */
    public int f11365b;

    /* JADX INFO: renamed from: c */
    public boolean f11366c;

    /* JADX INFO: renamed from: a */
    public final void m12634a(InterfaceC6752f interfaceC6752f) {
        if (interfaceC6752f == null) {
            throw new NullPointerException("'element' cannot be null");
        }
        InterfaceC6752f[] interfaceC6752fArr = this.f11364a;
        int length = interfaceC6752fArr.length;
        int i11 = this.f11365b + 1;
        if (this.f11366c | (i11 > length)) {
            InterfaceC6752f[] interfaceC6752fArr2 = new InterfaceC6752f[Math.max(interfaceC6752fArr.length, (i11 >> 1) + i11)];
            System.arraycopy(this.f11364a, 0, interfaceC6752fArr2, 0, this.f11365b);
            this.f11364a = interfaceC6752fArr2;
            this.f11366c = false;
        }
        this.f11364a[this.f11365b] = interfaceC6752f;
        this.f11365b = i11;
    }

    public C6761g(int i11) {
        InterfaceC6752f[] interfaceC6752fArr;
        if (i11 >= 0) {
            if (i11 == 0) {
                interfaceC6752fArr = f11363d;
            } else {
                interfaceC6752fArr = new InterfaceC6752f[i11];
            }
            this.f11364a = interfaceC6752fArr;
            this.f11365b = 0;
            this.f11366c = false;
            return;
        }
        throw new IllegalArgumentException("'initialCapacity' must not be negative");
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC6752f m12633a(int i11) {
        if (i11 < this.f11365b) {
            return this.f11364a[i11];
        }
        throw new ArrayIndexOutOfBoundsException(i11 + " >= " + this.f11365b);
    }
}
