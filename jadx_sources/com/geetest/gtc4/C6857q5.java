package com.geetest.gtc4;

import java.util.LinkedHashMap;
import java.util.LinkedList;

/* JADX INFO: renamed from: com.geetest.gtc4.q5 */
/* JADX INFO: loaded from: classes45.dex */
public final class C6857q5 extends AbstractC6871s1 {

    /* JADX INFO: renamed from: d */
    public final LinkedHashMap f11473d;

    /* JADX INFO: renamed from: e */
    public final LinkedList f11474e;

    public C6857q5() {
        super(EnumC6848p5.MAP);
        this.f11474e = new LinkedList();
        this.f11473d = new LinkedHashMap();
    }

    @Override // com.geetest.gtc4.AbstractC6871s1, com.geetest.gtc4.AbstractC6756f3
    public final boolean equals(Object obj) {
        if (obj instanceof C6857q5) {
            C6857q5 c6857q5 = (C6857q5) obj;
            if (super.equals(obj) && this.f11473d.equals(c6857q5.f11473d)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (this.f11489c) {
            sb2.append("{_ ");
        } else {
            sb2.append("{ ");
        }
        for (AbstractC6756f3 abstractC6756f3 : this.f11474e) {
            sb2.append(abstractC6756f3);
            sb2.append(": ");
            sb2.append(this.f11473d.get(abstractC6756f3));
            sb2.append(", ");
        }
        if (sb2.toString().endsWith(", ")) {
            sb2.setLength(sb2.length() - 2);
        }
        sb2.append(" }");
        return sb2.toString();
    }

    @Override // com.geetest.gtc4.AbstractC6871s1, com.geetest.gtc4.AbstractC6756f3
    public final int hashCode() {
        return super.hashCode() ^ this.f11473d.hashCode();
    }

    public C6857q5(int i11) {
        super(EnumC6848p5.MAP);
        this.f11474e = new LinkedList();
        this.f11473d = new LinkedHashMap(i11);
    }
}
