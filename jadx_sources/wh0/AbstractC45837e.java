package wh0;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

/* JADX INFO: renamed from: wh0.e */
/* JADX INFO: compiled from: Base64Utils.java */
/* JADX INFO: loaded from: classes61.dex */
public abstract class AbstractC45837e {

    /* JADX INFO: renamed from: a */
    public static final Charset f103312a = StandardCharsets.UTF_8;

    /* JADX INFO: renamed from: a */
    public static byte[] m101254a(byte[] bArr) {
        return bArr.length == 0 ? bArr : Base64.getDecoder().decode(bArr);
    }

    /* JADX INFO: renamed from: c */
    public static byte[] m101256c(byte[] bArr) {
        return bArr.length == 0 ? bArr : Base64.getEncoder().encode(bArr);
    }

    /* JADX INFO: renamed from: d */
    public static String m101257d(byte[] bArr) {
        return bArr.length == 0 ? "" : new String(m101256c(bArr), f103312a);
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m101255b(String str) {
        if (str.isEmpty()) {
            return new byte[0];
        }
        return m101254a(str.getBytes(f103312a));
    }
}
