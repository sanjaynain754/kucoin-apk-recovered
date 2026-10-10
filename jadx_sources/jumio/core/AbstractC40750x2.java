package jumio.core;

import com.jumio.sdk.enums.JumioScanStep;

/* JADX INFO: renamed from: jumio.core.x2 */
/* JADX INFO: loaded from: classes61.dex */
public abstract /* synthetic */ class AbstractC40750x2 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f90469a;

    static {
        int[] iArr = new int[JumioScanStep.values().length];
        try {
            iArr[JumioScanStep.IMAGE_TAKEN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[JumioScanStep.NEXT_PART.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[JumioScanStep.CAN_FINISH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f90469a = iArr;
    }
}
