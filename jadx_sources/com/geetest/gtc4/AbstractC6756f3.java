package com.geetest.gtc4;

import java.util.Objects;

/* JADX INFO: renamed from: com.geetest.gtc4.f3 */
/* JADX INFO: loaded from: classes45.dex */
public abstract class AbstractC6756f3 {

    /* JADX INFO: renamed from: a */
    public final EnumC6848p5 f11356a;

    /* JADX INFO: renamed from: b */
    public C6841o7 f11357b;

    public boolean equals(Object obj) {
        if (obj instanceof AbstractC6756f3) {
            AbstractC6756f3 abstractC6756f3 = (AbstractC6756f3) obj;
            C6841o7 c6841o7 = this.f11357b;
            if (c6841o7 != null) {
                return c6841o7.equals(abstractC6756f3.f11357b) && this.f11356a == abstractC6756f3.f11356a;
            }
            if (abstractC6756f3.f11357b == null && this.f11356a == abstractC6756f3.f11356a) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.f11356a, this.f11357b);
    }

    public AbstractC6756f3(EnumC6848p5 enumC6848p5) {
        this.f11356a = enumC6848p5;
        Objects.requireNonNull(enumC6848p5, "majorType is null");
    }
}
