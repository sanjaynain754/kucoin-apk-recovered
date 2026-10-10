package com.geetest.gtc4;

import java.util.Objects;

/* JADX INFO: renamed from: com.geetest.gtc4.o7 */
/* JADX INFO: loaded from: classes45.dex */
public final class C6841o7 extends AbstractC6756f3 {

    /* JADX INFO: renamed from: c */
    public final long f11452c;

    public C6841o7(long j11) {
        super(EnumC6848p5.TAG);
        this.f11452c = j11;
    }

    @Override // com.geetest.gtc4.AbstractC6756f3
    public final boolean equals(Object obj) {
        if (obj instanceof C6841o7) {
            C6841o7 c6841o7 = (C6841o7) obj;
            if (super.equals(obj) && this.f11452c == c6841o7.f11452c) {
                return true;
            }
        }
        return false;
    }

    @Override // com.geetest.gtc4.AbstractC6756f3
    public final int hashCode() {
        return Objects.hash(this.f11356a, this.f11357b) ^ Long.valueOf(this.f11452c).hashCode();
    }

    public final String toString() {
        return "Tag(" + this.f11452c + ")";
    }
}
