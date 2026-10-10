package com.geetest.gtc4;

/* JADX INFO: renamed from: com.geetest.gtc4.r7 */
/* JADX INFO: loaded from: classes45.dex */
public final class C6868r7 extends AbstractC6871s1 {

    /* JADX INFO: renamed from: d */
    public final String f11484d;

    public C6868r7(String str) {
        super(EnumC6848p5.UNICODE_STRING);
        this.f11484d = str;
    }

    @Override // com.geetest.gtc4.AbstractC6871s1, com.geetest.gtc4.AbstractC6756f3
    public final boolean equals(Object obj) {
        if (!(obj instanceof C6868r7) || !super.equals(obj)) {
            return false;
        }
        C6868r7 c6868r7 = (C6868r7) obj;
        String str = this.f11484d;
        if (str == null) {
            return c6868r7.f11484d == null;
        }
        return str.equals(c6868r7.f11484d);
    }

    @Override // com.geetest.gtc4.AbstractC6871s1, com.geetest.gtc4.AbstractC6756f3
    public final int hashCode() {
        if (this.f11484d == null) {
            return 0;
        }
        return this.f11484d.hashCode() + super.hashCode();
    }

    public final String toString() {
        String str = this.f11484d;
        return str == null ? "null" : str;
    }
}
