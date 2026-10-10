package p221e4;

import com.jumio.core.constants.ConstantsKt;
import java.io.UnsupportedEncodingException;

/* JADX INFO: renamed from: e4.c */
/* JADX INFO: compiled from: WebpSupportStatus.java */
/* JADX INFO: loaded from: classes34.dex */
public class C37072c {

    /* JADX INFO: renamed from: a */
    public static final boolean f82329a = true;

    /* JADX INFO: renamed from: b */
    public static final boolean f82330b = m82972e();

    /* JADX INFO: renamed from: c */
    public static InterfaceC37071b f82331c = null;

    /* JADX INFO: renamed from: d */
    public static boolean f82332d = false;

    /* JADX INFO: renamed from: e */
    public static final byte[] f82333e = m82968a("RIFF");

    /* JADX INFO: renamed from: f */
    public static final byte[] f82334f = m82968a(ConstantsKt.FILE_TYPE_WEBP);

    /* JADX INFO: renamed from: g */
    public static final byte[] f82335g = m82968a("VP8 ");

    /* JADX INFO: renamed from: h */
    public static final byte[] f82336h = m82968a("VP8L");

    /* JADX INFO: renamed from: i */
    public static final byte[] f82337i = m82968a("VP8X");

    /* JADX INFO: renamed from: e */
    public static boolean m82972e() {
        return true;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m82977j(byte[] bArr, int i11, byte[] bArr2) {
        if (bArr2 == null || bArr == null || bArr2.length + i11 > bArr.length) {
            return false;
        }
        for (int i12 = 0; i12 < bArr2.length; i12++) {
            if (bArr[i12 + i11] != bArr2[i12]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m82968a(String str) {
        try {
            return str.getBytes("ASCII");
        } catch (UnsupportedEncodingException e11) {
            throw new RuntimeException("ASCII not found!", e11);
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m82969b(byte[] bArr, int i11) {
        return m82977j(bArr, i11 + 12, f82337i) && ((bArr[i11 + 20] & 2) == 2);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m82970c(byte[] bArr, int i11, int i12) {
        return i12 >= 21 && m82977j(bArr, i11 + 12, f82337i);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m82971d(byte[] bArr, int i11) {
        return m82977j(bArr, i11 + 12, f82337i) && ((bArr[i11 + 20] & 16) == 16);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m82973f(byte[] bArr, int i11) {
        return m82977j(bArr, i11 + 12, f82336h);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m82974g(byte[] bArr, int i11) {
        return m82977j(bArr, i11 + 12, f82335g);
    }

    /* JADX INFO: renamed from: h */
    public static boolean m82975h(byte[] bArr, int i11, int i12) {
        return i12 >= 20 && m82977j(bArr, i11, f82333e) && m82977j(bArr, i11 + 8, f82334f);
    }

    /* JADX INFO: renamed from: i */
    public static InterfaceC37071b m82976i() {
        InterfaceC37071b interfaceC37071b;
        if (f82332d) {
            return f82331c;
        }
        try {
            interfaceC37071b = (InterfaceC37071b) Class.forName("com.facebook.webpsupport.WebpBitmapFactoryImpl").newInstance();
        } catch (Throwable unused) {
            interfaceC37071b = null;
        }
        f82332d = true;
        return interfaceC37071b;
    }
}
