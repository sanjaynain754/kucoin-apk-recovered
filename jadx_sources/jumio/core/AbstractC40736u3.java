package jumio.core;

import com.jumio.sdk.enums.JumioScanStep;

/* JADX INFO: renamed from: jumio.core.u3 */
/* JADX INFO: loaded from: classes61.dex */
public abstract /* synthetic */ class AbstractC40736u3 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f90446a;

    static {
        int[] iArr = new int[JumioScanStep.values().length];
        try {
            iArr[JumioScanStep.RETRY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[JumioScanStep.IMAGE_TAKEN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[JumioScanStep.CAN_FINISH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f90446a = iArr;
    }
}
