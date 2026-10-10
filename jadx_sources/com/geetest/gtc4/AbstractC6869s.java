package com.geetest.gtc4;

import com.tencent.bugly.proguard.RunnableC33958ua;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.Arrays;

/* JADX INFO: renamed from: com.geetest.gtc4.s */
/* JADX INFO: loaded from: classes45.dex */
public abstract class AbstractC6869s extends AbstractC6905w implements InterfaceC6878t {

    /* JADX INFO: renamed from: b */
    public static final C6860r f11485b = new C6860r();

    /* JADX INFO: renamed from: c */
    public static final byte[] f11486c = new byte[0];

    /* JADX INFO: renamed from: a */
    public final byte[] f11487a;

    @Override // com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: a */
    public final boolean mo12606a(AbstractC6905w abstractC6905w) {
        if (abstractC6905w instanceof AbstractC6869s) {
            return Arrays.equals(this.f11487a, ((AbstractC6869s) abstractC6905w).f11487a);
        }
        return false;
    }

    @Override // com.geetest.gtc4.InterfaceC6878t
    /* JADX INFO: renamed from: c */
    public final InputStream mo12631c() {
        return new ByteArrayInputStream(this.f11487a);
    }

    @Override // com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: g */
    public AbstractC6905w mo12600g() {
        return new C6782i2(this.f11487a);
    }

    @Override // com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: h */
    public AbstractC6905w mo12601h() {
        return new C6782i2(this.f11487a);
    }

    @Override // com.geetest.gtc4.AbstractC6905w
    public final int hashCode() {
        return AbstractC6834o0.m12688b(this.f11487a);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(RunnableC33958ua.f72251f);
        byte[] bArr = this.f11487a;
        C6730c4 c6730c4 = AbstractC6721b4.f11319a;
        int length = bArr.length;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            C6730c4 c6730c5 = AbstractC6721b4.f11319a;
            c6730c5.getClass();
            if (length >= 0) {
                byte[] bArr2 = new byte[72];
                int i11 = 0;
                while (length > 0) {
                    int iMin = Math.min(36, length);
                    int i12 = i11 + iMin;
                    int i13 = 0;
                    while (i11 < i12) {
                        int i14 = i11 + 1;
                        byte b11 = bArr[i11];
                        int i15 = i13 + 1;
                        byte[] bArr3 = c6730c5.f11330a;
                        bArr2[i13] = bArr3[(b11 & 255) >>> 4];
                        i13 += 2;
                        bArr2[i15] = bArr3[b11 & 15];
                        i11 = i14;
                    }
                    byteArrayOutputStream.write(bArr2, 0, i13);
                    length -= iMin;
                    i11 = i12;
                }
            }
            sb2.append(AbstractC6832n7.m12686a(byteArrayOutputStream.toByteArray()));
            return sb2.toString();
        } catch (Exception e11) {
            throw new C6819m3("exception encoding Hex string: " + e11.getMessage(), e11);
        }
    }

    public AbstractC6869s(byte[] bArr) {
        if (bArr != null) {
            this.f11487a = bArr;
            return;
        }
        throw new NullPointerException("'string' cannot be null");
    }

    @Override // com.geetest.gtc4.InterfaceC6785i5
    /* JADX INFO: renamed from: b */
    public final AbstractC6905w mo12597b() {
        return this;
    }
}
