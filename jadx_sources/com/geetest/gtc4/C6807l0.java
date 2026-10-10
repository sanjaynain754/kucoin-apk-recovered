package com.geetest.gtc4;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: com.geetest.gtc4.l0 */
/* JADX INFO: loaded from: classes45.dex */
public class C6807l0 extends AbstractC6871s1 {

    /* JADX INFO: renamed from: d */
    public final ArrayList f11421d;

    public C6807l0() {
        super(EnumC6848p5.ARRAY);
        this.f11421d = new ArrayList();
    }

    @Override // com.geetest.gtc4.AbstractC6871s1, com.geetest.gtc4.AbstractC6756f3
    public final boolean equals(Object obj) {
        if (obj instanceof C6807l0) {
            C6807l0 c6807l0 = (C6807l0) obj;
            if (super.equals(obj) && this.f11421d.equals(c6807l0.f11421d)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[");
        if (this.f11489c) {
            sb2.append("_ ");
        }
        sb2.append(Arrays.toString(this.f11421d.toArray()).substring(1));
        return sb2.toString();
    }

    public C6807l0(int i11) {
        super(EnumC6848p5.ARRAY);
        this.f11421d = new ArrayList(i11);
    }

    @Override // com.geetest.gtc4.AbstractC6871s1, com.geetest.gtc4.AbstractC6756f3
    public final int hashCode() {
        return super.hashCode() ^ this.f11421d.hashCode();
    }
}
