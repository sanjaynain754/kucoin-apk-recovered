package com.geetest.gtc4;

/* JADX INFO: renamed from: com.geetest.gtc4.j3 */
/* JADX INFO: loaded from: classes45.dex */
public final class C6792j3 extends C6778h7 {

    /* JADX INFO: renamed from: e */
    public final double f11407e;

    public C6792j3(double d11) {
        super(EnumC6805k7.IEEE_754_DOUBLE_PRECISION_FLOAT);
        this.f11407e = d11;
    }

    @Override // com.geetest.gtc4.C6778h7, com.geetest.gtc4.AbstractC6756f3
    public final boolean equals(Object obj) {
        if (obj instanceof C6792j3) {
            C6792j3 c6792j3 = (C6792j3) obj;
            if (super.equals(obj) && this.f11407e == c6792j3.f11407e) {
                return true;
            }
        }
        return false;
    }

    @Override // com.geetest.gtc4.C6778h7
    public final String toString() {
        return String.valueOf(this.f11407e);
    }

    @Override // com.geetest.gtc4.C6778h7, com.geetest.gtc4.AbstractC6756f3
    public final int hashCode() {
        return super.hashCode() ^ Double.valueOf(this.f11407e).hashCode();
    }
}
