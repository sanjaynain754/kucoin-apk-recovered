package com.geetest.gtc4;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: com.geetest.gtc4.b */
/* JADX INFO: loaded from: classes45.dex */
public abstract class AbstractC6716b extends AbstractC6905w implements InterfaceC6725c {

    /* JADX INFO: renamed from: b */
    public static final C6707a f11310b = new C6707a();

    /* JADX INFO: renamed from: c */
    public static final char[] f11311c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: a */
    public final byte[] f11312a;

    public AbstractC6716b(byte[] bArr, int i11) {
        if (bArr == null) {
            throw new NullPointerException("'data' cannot be null");
        }
        if (bArr.length == 0 && i11 != 0) {
            throw new IllegalArgumentException("zero length data with non-zero pad bits");
        }
        if (i11 > 7 || i11 < 0) {
            throw new IllegalArgumentException("pad bits cannot be greater than 7 or less than 0");
        }
        int length = bArr.length;
        byte[] bArr2 = new byte[length + 1];
        System.arraycopy(bArr, 0, bArr2, 1, length);
        bArr2[0] = (byte) i11;
        this.f11312a = bArr2;
    }

    @Override // com.geetest.gtc4.InterfaceC6725c
    /* JADX INFO: renamed from: a */
    public final InputStream mo12605a() {
        byte[] bArr = this.f11312a;
        return new ByteArrayInputStream(bArr, 1, bArr.length - 1);
    }

    @Override // com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: a */
    public final boolean mo12606a(AbstractC6905w abstractC6905w) {
        if (!(abstractC6905w instanceof AbstractC6716b)) {
            return false;
        }
        byte[] bArr = this.f11312a;
        byte[] bArr2 = ((AbstractC6716b) abstractC6905w).f11312a;
        int length = bArr.length;
        if (bArr2.length != length) {
            return false;
        }
        if (length == 1) {
            return true;
        }
        int i11 = length - 1;
        for (int i12 = 0; i12 < i11; i12++) {
            if (bArr[i12] != bArr2[i12]) {
                return false;
            }
        }
        int i13 = 255 << (bArr[0] & 255);
        return ((byte) (bArr[i11] & i13)) == ((byte) (bArr2[i11] & i13));
    }

    @Override // com.geetest.gtc4.InterfaceC6725c
    /* JADX INFO: renamed from: e */
    public final int mo12607e() {
        return this.f11312a[0] & 255;
    }

    @Override // com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: g */
    public AbstractC6905w mo12600g() {
        return new C6933z1(this.f11312a);
    }

    @Override // com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: h */
    public AbstractC6905w mo12601h() {
        return new C6890u2(this.f11312a);
    }

    @Override // com.geetest.gtc4.AbstractC6905w
    public final int hashCode() {
        byte[] bArr = this.f11312a;
        if (bArr.length < 2) {
            return 1;
        }
        int i11 = bArr[0] & 255;
        int length = bArr.length;
        int i12 = length - 1;
        byte b11 = (byte) ((255 << i11) & bArr[i12]);
        while (true) {
            i12--;
            if (i12 < 0) {
                return (length * 257) ^ b11;
            }
            length = (length * 257) ^ bArr[i12];
        }
    }

    public final String toString() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            mo12613a(new C6887u(byteArrayOutputStream), true);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            StringBuffer stringBuffer = new StringBuffer((byteArray.length * 2) + 1);
            stringBuffer.append('#');
            for (int i11 = 0; i11 != byteArray.length; i11++) {
                byte b11 = byteArray[i11];
                char[] cArr = f11311c;
                stringBuffer.append(cArr[(b11 >>> 4) & 15]);
                stringBuffer.append(cArr[b11 & 15]);
            }
            return stringBuffer.toString();
        } catch (IOException e11) {
            throw new C6896v("Internal error encoding BitString: " + e11.getMessage(), e11);
        }
    }

    public AbstractC6716b(byte[] bArr) {
        this.f11312a = bArr;
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC6716b m12604a(byte[] bArr) {
        int length = bArr.length;
        if (length >= 1) {
            int i11 = bArr[0] & 255;
            if (i11 > 0) {
                if (i11 <= 7 && length >= 2) {
                    byte b11 = bArr[length - 1];
                    if (b11 != ((byte) ((255 << i11) & b11))) {
                        return new C6890u2(bArr);
                    }
                } else {
                    throw new IllegalArgumentException("invalid pad bits detected");
                }
            }
            return new C6933z1(bArr);
        }
        throw new IllegalArgumentException("truncated BIT STRING detected");
    }

    @Override // com.geetest.gtc4.InterfaceC6785i5
    /* JADX INFO: renamed from: b */
    public final AbstractC6905w mo12597b() {
        return this;
    }
}
