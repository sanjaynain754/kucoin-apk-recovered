package jumio.core;

import com.jumio.core.data.ScanMode;
import com.jumio.sdk.enums.JumioScanStep;

/* JADX INFO: renamed from: jumio.core.W1 */
/* JADX INFO: loaded from: classes61.dex */
public abstract /* synthetic */ class AbstractC40612W1 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f90158a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int[] f90159b;

    static {
        int[] iArr = new int[ScanMode.values().length];
        try {
            iArr[ScanMode.PDF417.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ScanMode.DOCFINDER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ScanMode.FACE_MANUAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ScanMode.JUMIO_LIVENESS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ScanMode.JUMIO_PREMIUM.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[ScanMode.MANUAL.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[ScanMode.NFC.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[ScanMode.FILE.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[ScanMode.WEB.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        f90158a = iArr;
        int[] iArr2 = new int[JumioScanStep.values().length];
        try {
            iArr2[JumioScanStep.IMAGE_TAKEN.ordinal()] = 1;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[JumioScanStep.NEXT_PART.ordinal()] = 2;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[JumioScanStep.CAN_FINISH.ordinal()] = 3;
        } catch (NoSuchFieldError unused12) {
        }
        f90159b = iArr2;
    }
}
