package p036b8;

import android.text.TextUtils;
import com.github.penfeizhou.animation.p065io.C6954c;
import com.github.penfeizhou.animation.p065io.Reader;
import java.io.IOException;

/* JADX INFO: renamed from: b8.a */
/* JADX INFO: compiled from: APNGReader.java */
/* JADX INFO: loaded from: classes.dex */
public class C4503a extends C6954c {

    /* JADX INFO: renamed from: b */
    public static ThreadLocal<byte[]> f3919b = new ThreadLocal<>();

    public static byte[] ensureBytes() {
        byte[] bArr = f3919b.get();
        if (bArr != null) {
            return bArr;
        }
        byte[] bArr2 = new byte[4];
        f3919b.set(bArr2);
        return bArr2;
    }

    public C4503a(Reader reader) {
        super(reader);
    }

    /* JADX INFO: renamed from: a */
    public boolean m4309a(String str) throws IOException {
        if (TextUtils.isEmpty(str) || str.length() != 4) {
            return false;
        }
        int iM4310b = m4310b();
        for (int i11 = 0; i11 < 4; i11++) {
            if (((iM4310b >> (i11 * 8)) & 255) != str.charAt(i11)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public int m4310b() throws IOException {
        byte[] bArrEnsureBytes = ensureBytes();
        read(bArrEnsureBytes, 0, 4);
        return ((bArrEnsureBytes[3] & 255) << 24) | (bArrEnsureBytes[0] & 255) | ((bArrEnsureBytes[1] & 255) << 8) | ((bArrEnsureBytes[2] & 255) << 16);
    }

    /* JADX INFO: renamed from: c */
    public int m4311c() throws IOException {
        byte[] bArrEnsureBytes = ensureBytes();
        read(bArrEnsureBytes, 0, 4);
        return ((bArrEnsureBytes[0] & 255) << 24) | (bArrEnsureBytes[3] & 255) | ((bArrEnsureBytes[2] & 255) << 8) | ((bArrEnsureBytes[1] & 255) << 16);
    }

    /* JADX INFO: renamed from: d */
    public short m4312d() throws IOException {
        byte[] bArrEnsureBytes = ensureBytes();
        read(bArrEnsureBytes, 0, 2);
        return (short) (((bArrEnsureBytes[0] & 255) << 8) | (bArrEnsureBytes[1] & 255));
    }
}
