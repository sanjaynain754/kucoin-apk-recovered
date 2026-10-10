package p795yf;

import android.util.Log;
import com.tencent.thumbplayer.tcmedia.api.TPErrorCode;

/* JADX INFO: renamed from: yf.g */
/* JADX INFO: compiled from: FpLog.java */
/* JADX INFO: loaded from: classes.dex */
public class C46481g {

    /* JADX INFO: renamed from: a */
    public static boolean f104240a;

    /* JADX INFO: renamed from: b */
    public static void m102539b(String str, String str2, Throwable th2) {
        try {
            if (str2 == null) {
                Log.i(str, null, th2);
                return;
            }
            byte[] bytes = str2.getBytes();
            int length = bytes.length;
            if (length <= 4000) {
                Log.i(str, str2, th2);
                return;
            }
            int i11 = 0;
            while (i11 < length - 4000) {
                int iM102540c = m102540c(bytes, i11);
                int i12 = iM102540c - i11;
                Log.i(str, new String(bytes, i11, i12), null);
                if (i12 < 4000) {
                    iM102540c++;
                }
                i11 = iM102540c;
            }
            if (length > i11) {
                Log.i(str, new String(bytes, i11, length - i11), th2);
            }
        } catch (Exception e11) {
            m102541d(e11);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m102538a(String str, String str2) {
        if (f104240a) {
            m102539b(str, str2, null);
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m102540c(byte[] bArr, int i11) {
        int iMin = Math.min(i11 + TPErrorCode.TP_ERROR_TYPE_DOWNLOAD_PROXY, bArr.length - 1);
        for (int i12 = iMin; i12 > iMin - 4000; i12--) {
            if (bArr[i12] == 10) {
                return i12;
            }
        }
        return iMin;
    }

    /* JADX INFO: renamed from: d */
    public static void m102541d(Throwable th2) {
        if (!f104240a || th2 == null) {
            return;
        }
        Log.e("SA.Exception", "", th2);
    }

    /* JADX INFO: renamed from: e */
    public static void m102542e(boolean z11) {
        f104240a = z11;
    }
}
