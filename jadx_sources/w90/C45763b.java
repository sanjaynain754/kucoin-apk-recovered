package w90;

import androidx.annotation.NonNull;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: w90.b */
/* JADX INFO: compiled from: AvcSpsUtils.java */
/* JADX INFO: loaded from: classes59.dex */
public class C45763b {
    /* JADX INFO: renamed from: a */
    public static byte m101047a(@NonNull ByteBuffer byteBuffer) {
        return byteBuffer.get(0);
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public static String m101048b(byte b11) {
        if (b11 == 66) {
            return "Baseline Profile";
        }
        if (b11 == 77) {
            return "Main Profile";
        }
        if (b11 == 88) {
            return "Extended Profile";
        }
        if (b11 == 100) {
            return "High Profile";
        }
        return "Unknown Profile (" + ((int) b11) + ")";
    }
}
