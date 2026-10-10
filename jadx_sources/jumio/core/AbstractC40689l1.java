package jumio.core;

import com.jumio.core.data.ScanMode;

/* JADX INFO: renamed from: jumio.core.l1 */
/* JADX INFO: loaded from: classes61.dex */
public abstract /* synthetic */ class AbstractC40689l1 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f90317a;

    static {
        int[] iArr = new int[ScanMode.values().length];
        try {
            iArr[ScanMode.FACE_MANUAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        f90317a = iArr;
    }
}
