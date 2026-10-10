package com.geetest.gtc4;

import java.math.BigInteger;
import java.util.Objects;

/* JADX INFO: renamed from: com.geetest.gtc4.d6 */
/* JADX INFO: loaded from: classes45.dex */
public abstract class AbstractC6741d6 extends AbstractC6756f3 {

    /* JADX INFO: renamed from: c */
    public final BigInteger f11339c;

    @Override // com.geetest.gtc4.AbstractC6756f3
    public final boolean equals(Object obj) {
        if (obj instanceof AbstractC6741d6) {
            AbstractC6741d6 abstractC6741d6 = (AbstractC6741d6) obj;
            if (super.equals(obj) && this.f11339c.equals(abstractC6741d6.f11339c)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return this.f11339c.toString();
    }

    public AbstractC6741d6(EnumC6848p5 enumC6848p5, BigInteger bigInteger) {
        super(enumC6848p5);
        Objects.requireNonNull(bigInteger);
        this.f11339c = bigInteger;
    }

    @Override // com.geetest.gtc4.AbstractC6756f3
    public final int hashCode() {
        return super.hashCode() ^ this.f11339c.hashCode();
    }
}
