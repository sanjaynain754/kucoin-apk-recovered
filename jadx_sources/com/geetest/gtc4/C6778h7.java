package com.geetest.gtc4;

import java.util.Objects;

/* JADX INFO: renamed from: com.geetest.gtc4.h7 */
/* JADX INFO: loaded from: classes45.dex */
public class C6778h7 extends AbstractC6756f3 {

    /* JADX INFO: renamed from: d */
    public static final C6778h7 f11387d = new C6778h7(EnumC6805k7.BREAK);

    /* JADX INFO: renamed from: c */
    public final EnumC6805k7 f11388c;

    public C6778h7(EnumC6805k7 enumC6805k7) {
        super(EnumC6848p5.SPECIAL);
        Objects.requireNonNull(enumC6805k7);
        this.f11388c = enumC6805k7;
    }

    @Override // com.geetest.gtc4.AbstractC6756f3
    public boolean equals(Object obj) {
        if (obj instanceof C6778h7) {
            C6778h7 c6778h7 = (C6778h7) obj;
            if (super.equals(obj) && this.f11388c == c6778h7.f11388c) {
                return true;
            }
        }
        return false;
    }

    @Override // com.geetest.gtc4.AbstractC6756f3
    public int hashCode() {
        return Objects.hash(this.f11356a, this.f11357b) ^ Objects.hashCode(this.f11388c);
    }

    public String toString() {
        return this.f11388c.name();
    }
}
