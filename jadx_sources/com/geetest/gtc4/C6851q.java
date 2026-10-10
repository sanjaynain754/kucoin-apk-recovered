package com.geetest.gtc4;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.geetest.gtc4.q */
/* JADX INFO: loaded from: classes45.dex */
public final class C6851q extends AbstractC6905w {

    /* JADX INFO: renamed from: c */
    public static final ConcurrentHashMap f11469c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public final byte[] f11470a;

    /* JADX INFO: renamed from: b */
    public String f11471b = null;

    @Override // com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: a */
    public final int mo12612a(boolean z11) {
        int length = this.f11470a.length;
        return AbstractC6734d.m12622a(length, z11 ? 1 : 0, length);
    }

    @Override // com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: f */
    public final boolean mo12610f() {
        return false;
    }

    @Override // com.geetest.gtc4.AbstractC6905w
    public final int hashCode() {
        return AbstractC6834o0.m12688b(this.f11470a);
    }

    public final String toString() {
        String str;
        synchronized (this) {
            try {
                if (this.f11471b == null) {
                    byte[] bArr = this.f11470a;
                    StringBuilder sb2 = new StringBuilder();
                    boolean z11 = true;
                    long j11 = 0;
                    BigInteger bigIntegerShiftLeft = null;
                    for (int i11 = 0; i11 != bArr.length; i11++) {
                        byte b11 = bArr[i11];
                        if (j11 <= 72057594037927808L) {
                            long j12 = j11 + ((long) (b11 & 127));
                            if ((b11 & 128) == 0) {
                                if (z11) {
                                    if (j12 < 40) {
                                        sb2.append('0');
                                    } else if (j12 < 80) {
                                        sb2.append('1');
                                        j12 -= 40;
                                    } else {
                                        sb2.append('2');
                                        j12 -= 80;
                                    }
                                    z11 = false;
                                }
                                sb2.append('.');
                                sb2.append(j12);
                                j11 = 0;
                            } else {
                                j11 = j12 << 7;
                            }
                        } else {
                            if (bigIntegerShiftLeft == null) {
                                bigIntegerShiftLeft = BigInteger.valueOf(j11);
                            }
                            BigInteger bigIntegerOr = bigIntegerShiftLeft.or(BigInteger.valueOf(b11 & 127));
                            if ((b11 & 128) == 0) {
                                if (z11) {
                                    sb2.append('2');
                                    bigIntegerOr = bigIntegerOr.subtract(BigInteger.valueOf(80L));
                                    z11 = false;
                                }
                                sb2.append('.');
                                sb2.append(bigIntegerOr);
                                j11 = 0;
                                bigIntegerShiftLeft = null;
                            } else {
                                bigIntegerShiftLeft = bigIntegerOr.shiftLeft(7);
                            }
                        }
                    }
                    this.f11471b = sb2.toString();
                }
                str = this.f11471b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    public C6851q(byte[] bArr) {
        this.f11470a = bArr;
    }

    @Override // com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: a */
    public final void mo12613a(C6887u c6887u, boolean z11) throws IOException {
        c6887u.m12723a(z11, 6, this.f11470a);
    }

    @Override // com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: a */
    public final boolean mo12606a(AbstractC6905w abstractC6905w) {
        if (this == abstractC6905w) {
            return true;
        }
        if (abstractC6905w instanceof C6851q) {
            return Arrays.equals(this.f11470a, ((C6851q) abstractC6905w).f11470a);
        }
        return false;
    }
}
