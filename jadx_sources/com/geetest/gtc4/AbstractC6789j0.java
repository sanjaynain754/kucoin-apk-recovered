package com.geetest.gtc4;

/* JADX INFO: renamed from: com.geetest.gtc4.j0 */
/* JADX INFO: loaded from: classes45.dex */
public abstract class AbstractC6789j0 extends C6778h7 {

    /* JADX INFO: renamed from: e */
    public final float f11404e;

    @Override // com.geetest.gtc4.C6778h7, com.geetest.gtc4.AbstractC6756f3
    public final boolean equals(Object obj) {
        if (obj instanceof AbstractC6789j0) {
            AbstractC6789j0 abstractC6789j0 = (AbstractC6789j0) obj;
            if (super.equals(obj) && this.f11404e == abstractC6789j0.f11404e) {
                return true;
            }
        }
        return false;
    }

    public AbstractC6789j0(EnumC6805k7 enumC6805k7, float f11) {
        super(enumC6805k7);
        this.f11404e = f11;
    }

    @Override // com.geetest.gtc4.C6778h7, com.geetest.gtc4.AbstractC6756f3
    public final int hashCode() {
        return super.hashCode() ^ Float.valueOf(this.f11404e).hashCode();
    }
}
