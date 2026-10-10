package com.geetest.gtc4;

import java.math.BigInteger;

/* JADX INFO: renamed from: com.geetest.gtc4.q6 */
/* JADX INFO: loaded from: classes45.dex */
public final class C6858q6 extends C6807l0 {
    public C6858q6(AbstractC6741d6 abstractC6741d6, AbstractC6741d6 abstractC6741d7) throws C6853q1 {
        this.f11357b = new C6841o7(30L);
        if (abstractC6741d6 != null) {
            if (abstractC6741d7 != null) {
                if (!abstractC6741d7.f11339c.equals(BigInteger.ZERO)) {
                    this.f11421d.add(abstractC6741d6);
                    this.f11421d.add(abstractC6741d7);
                    return;
                }
                throw new C6853q1("Denominator is zero");
            }
            throw new C6853q1("Denominator is null");
        }
        throw new C6853q1("Numerator is null");
    }
}
