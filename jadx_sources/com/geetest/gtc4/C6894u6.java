package com.geetest.gtc4;

/* JADX INFO: renamed from: com.geetest.gtc4.u6 */
/* JADX INFO: loaded from: classes45.dex */
public final class C6894u6 extends C6778h7 {

    /* JADX INFO: renamed from: g */
    public static final C6894u6 f11526g = new C6894u6(EnumC6903v6.FALSE);

    /* JADX INFO: renamed from: h */
    public static final C6894u6 f11527h = new C6894u6(EnumC6903v6.TRUE);

    /* JADX INFO: renamed from: i */
    public static final C6894u6 f11528i = new C6894u6(EnumC6903v6.NULL);

    /* JADX INFO: renamed from: j */
    public static final C6894u6 f11529j = new C6894u6(EnumC6903v6.UNDEFINED);

    /* JADX INFO: renamed from: e */
    public final EnumC6903v6 f11530e;

    /* JADX INFO: renamed from: f */
    public final int f11531f;

    public C6894u6(EnumC6903v6 enumC6903v6) {
        super(EnumC6805k7.SIMPLE_VALUE);
        this.f11531f = enumC6903v6.getValue();
        this.f11530e = enumC6903v6;
    }

    @Override // com.geetest.gtc4.C6778h7, com.geetest.gtc4.AbstractC6756f3
    public final boolean equals(Object obj) {
        if (obj instanceof C6894u6) {
            C6894u6 c6894u6 = (C6894u6) obj;
            if (super.equals(obj) && this.f11531f == c6894u6.f11531f) {
                return true;
            }
        }
        return false;
    }

    @Override // com.geetest.gtc4.C6778h7
    public final String toString() {
        return this.f11530e.toString();
    }

    @Override // com.geetest.gtc4.C6778h7, com.geetest.gtc4.AbstractC6756f3
    public final int hashCode() {
        return super.hashCode() ^ Integer.valueOf(this.f11531f).hashCode();
    }

    public C6894u6(int i11) {
        super(i11 <= 23 ? EnumC6805k7.SIMPLE_VALUE : EnumC6805k7.SIMPLE_VALUE_NEXT_BYTE);
        this.f11531f = i11;
        this.f11530e = EnumC6903v6.ofByte(i11);
    }
}
