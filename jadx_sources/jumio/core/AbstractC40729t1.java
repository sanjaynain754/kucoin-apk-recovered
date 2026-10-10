package jumio.core;

import com.jumio.sdk.enums.JumioFlashState;

/* JADX INFO: renamed from: jumio.core.t1 */
/* JADX INFO: loaded from: classes61.dex */
public abstract /* synthetic */ class AbstractC40729t1 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f90416a;

    static {
        int[] iArr = new int[JumioFlashState.values().length];
        try {
            iArr[JumioFlashState.ON.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[JumioFlashState.OFF.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f90416a = iArr;
    }
}
