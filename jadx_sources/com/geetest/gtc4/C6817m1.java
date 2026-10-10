package com.geetest.gtc4;

import java.util.Arrays;

/* JADX INFO: renamed from: com.geetest.gtc4.m1 */
/* JADX INFO: loaded from: classes45.dex */
public final class C6817m1 extends AbstractC6871s1 {

    /* JADX INFO: renamed from: d */
    public final byte[] f11434d;

    public C6817m1(byte[] bArr) {
        super(EnumC6848p5.BYTE_STRING);
        if (bArr == null) {
            this.f11434d = null;
        } else {
            this.f11434d = bArr;
        }
    }

    @Override // com.geetest.gtc4.AbstractC6871s1, com.geetest.gtc4.AbstractC6756f3
    public final boolean equals(Object obj) {
        if (obj instanceof C6817m1) {
            C6817m1 c6817m1 = (C6817m1) obj;
            if (super.equals(obj) && Arrays.equals(this.f11434d, c6817m1.f11434d)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.geetest.gtc4.AbstractC6871s1, com.geetest.gtc4.AbstractC6756f3
    public final int hashCode() {
        return super.hashCode() ^ Arrays.hashCode(this.f11434d);
    }
}
