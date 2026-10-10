package com.geetest.gtc4;

import java.util.Objects;

/* JADX INFO: renamed from: com.geetest.gtc4.s1 */
/* JADX INFO: loaded from: classes45.dex */
public abstract class AbstractC6871s1 extends AbstractC6756f3 {

    /* JADX INFO: renamed from: c */
    public boolean f11489c;

    @Override // com.geetest.gtc4.AbstractC6756f3
    public boolean equals(Object obj) {
        if (obj instanceof AbstractC6871s1) {
            AbstractC6871s1 abstractC6871s1 = (AbstractC6871s1) obj;
            if (super.equals(obj) && this.f11489c == abstractC6871s1.f11489c) {
                return true;
            }
        }
        return false;
    }

    @Override // com.geetest.gtc4.AbstractC6756f3
    public int hashCode() {
        return Objects.hash(this.f11356a, this.f11357b) ^ Boolean.valueOf(this.f11489c).hashCode();
    }

    public AbstractC6871s1(EnumC6848p5 enumC6848p5) {
        super(enumC6848p5);
        this.f11489c = false;
    }
}
