package jumio.core;

import com.jumio.sdk.enums.JumioDataCenter;

/* JADX INFO: renamed from: jumio.core.K0 */
/* JADX INFO: loaded from: classes61.dex */
public abstract /* synthetic */ class AbstractC40552K0 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f90023a;

    static {
        int[] iArr = new int[JumioDataCenter.values().length];
        try {
            iArr[JumioDataCenter.EU.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[JumioDataCenter.US.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[JumioDataCenter.SG.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f90023a = iArr;
    }
}
