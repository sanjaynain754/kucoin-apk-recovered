package com.geetest.gtc4;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.geetest.gtc4.x */
/* JADX INFO: loaded from: classes45.dex */
public final class C6914x extends AbstractC6905w {

    /* JADX INFO: renamed from: c */
    public static final ConcurrentHashMap f11545c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public final byte[] f11546a;

    /* JADX INFO: renamed from: b */
    public String f11547b = null;

    @Override // com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: a */
    public final boolean mo12606a(AbstractC6905w abstractC6905w) {
        if (this == abstractC6905w) {
            return true;
        }
        if (abstractC6905w instanceof C6914x) {
            return Arrays.equals(this.f11546a, ((C6914x) abstractC6905w).f11546a);
        }
        return false;
    }

    @Override // com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: f */
    public final boolean mo12610f() {
        return false;
    }

    @Override // com.geetest.gtc4.AbstractC6905w
    public final int hashCode() {
        return AbstractC6834o0.m12688b(this.f11546a);
    }

    public final String toString() {
        String str;
        synchronized (this) {
            try {
                if (this.f11547b == null) {
                    byte[] bArr = this.f11546a;
                    StringBuffer stringBuffer = new StringBuffer();
                    boolean z11 = true;
                    long j11 = 0;
                    BigInteger bigIntegerShiftLeft = null;
                    for (int i11 = 0; i11 != bArr.length; i11++) {
                        byte b11 = bArr[i11];
                        if (j11 <= 72057594037927808L) {
                            long j12 = j11 + ((long) (b11 & 127));
                            if ((b11 & 128) == 0) {
                                if (z11) {
                                    z11 = false;
                                } else {
                                    stringBuffer.append('.');
                                }
                                stringBuffer.append(j12);
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
                                    z11 = false;
                                } else {
                                    stringBuffer.append('.');
                                }
                                stringBuffer.append(bigIntegerOr);
                                j11 = 0;
                                bigIntegerShiftLeft = null;
                            } else {
                                bigIntegerShiftLeft = bigIntegerOr.shiftLeft(7);
                            }
                        }
                    }
                    this.f11547b = stringBuffer.toString();
                }
                str = this.f11547b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    public C6914x(byte[] bArr) {
        this.f11546a = bArr;
    }

    @Override // com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: a */
    public final int mo12612a(boolean z11) {
        int length = this.f11546a.length;
        return AbstractC6734d.m12622a(length, z11 ? 1 : 0, length);
    }

    @Override // com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: a */
    public final void mo12613a(C6887u c6887u, boolean z11) throws IOException {
        c6887u.m12723a(z11, 13, this.f11546a);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m12742a(byte[] bArr) {
        if (bArr.length < 1) {
            return false;
        }
        boolean z11 = true;
        for (int i11 = 0; i11 < bArr.length; i11++) {
            if (z11 && (bArr[i11] & 255) == 128) {
                return false;
            }
            z11 = (bArr[i11] & 128) == 0;
        }
        return z11;
    }
}
