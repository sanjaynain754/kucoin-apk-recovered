package jumio.core;

import com.jumio.core.data.ScanMode;
import com.jumio.core.enums.EMRTDStatus;

/* JADX INFO: renamed from: jumio.core.o3 */
/* JADX INFO: loaded from: classes61.dex */
public abstract /* synthetic */ class AbstractC40706o3 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f90343a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int[] f90344b;

    static {
        int[] iArr = new int[ScanMode.values().length];
        try {
            iArr[ScanMode.JUMIO_PREMIUM.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ScanMode.JUMIO_LIVENESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ScanMode.FACE_MANUAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f90343a = iArr;
        int[] iArr2 = new int[EMRTDStatus.values().length];
        try {
            iArr2[EMRTDStatus.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[EMRTDStatus.NOT_PERFORMED.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        f90344b = iArr2;
    }
}
