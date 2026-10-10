package p466n8;

import android.text.TextUtils;
import com.github.penfeizhou.animation.p065io.C6954c;
import com.github.penfeizhou.animation.p065io.Reader;
import java.io.IOException;

/* JADX INFO: renamed from: n8.a */
/* JADX INFO: compiled from: WebPReader.java */
/* JADX INFO: loaded from: classes.dex */
public class C42774a extends C6954c {

    /* JADX INFO: renamed from: b */
    public static ThreadLocal<byte[]> f94720b = new ThreadLocal<>();

    public static byte[] ensureBytes() {
        byte[] bArr = f94720b.get();
        if (bArr != null) {
            return bArr;
        }
        byte[] bArr2 = new byte[4];
        f94720b.set(bArr2);
        return bArr2;
    }

    public C42774a(Reader reader) {
        super(reader);
    }

    /* JADX INFO: renamed from: a */
    public int m93722a() throws IOException {
        return m93725d() + 1;
    }

    /* JADX INFO: renamed from: b */
    public int m93723b() throws IOException {
        byte[] bArrEnsureBytes = ensureBytes();
        read(bArrEnsureBytes, 0, 4);
        return ((bArrEnsureBytes[3] & 255) << 24) | (bArrEnsureBytes[0] & 255) | ((bArrEnsureBytes[1] & 255) << 8) | ((bArrEnsureBytes[2] & 255) << 16);
    }

    /* JADX INFO: renamed from: c */
    public int m93724c() throws IOException {
        byte[] bArrEnsureBytes = ensureBytes();
        read(bArrEnsureBytes, 0, 2);
        return ((bArrEnsureBytes[1] & 255) << 8) | (bArrEnsureBytes[0] & 255);
    }

    /* JADX INFO: renamed from: d */
    public int m93725d() throws IOException {
        byte[] bArrEnsureBytes = ensureBytes();
        read(bArrEnsureBytes, 0, 3);
        return ((bArrEnsureBytes[2] & 255) << 16) | (bArrEnsureBytes[0] & 255) | ((bArrEnsureBytes[1] & 255) << 8);
    }

    /* JADX INFO: renamed from: e */
    public int m93726e() throws IOException {
        byte[] bArrEnsureBytes = ensureBytes();
        read(bArrEnsureBytes, 0, 4);
        return ((bArrEnsureBytes[3] & 255) << 24) | (bArrEnsureBytes[0] & 255) | ((bArrEnsureBytes[1] & 255) << 8) | ((bArrEnsureBytes[2] & 255) << 16);
    }

    /* JADX INFO: renamed from: f */
    public boolean m93727f(String str) throws IOException {
        if (TextUtils.isEmpty(str) || str.length() != 4) {
            return false;
        }
        int iM93723b = m93723b();
        for (int i11 = 0; i11 < 4; i11++) {
            if (((iM93723b >> (i11 * 8)) & 255) != str.charAt(i11)) {
                return false;
            }
        }
        return true;
    }
}
