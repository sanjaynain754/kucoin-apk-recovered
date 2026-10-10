package jumio.core;

import com.jumio.core.data.ScanMode;

/* JADX INFO: renamed from: jumio.core.y3 */
/* JADX INFO: loaded from: classes61.dex */
public abstract /* synthetic */ class AbstractC40756y3 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f90486a;

    static {
        int[] iArr = new int[ScanMode.values().length];
        try {
            iArr[ScanMode.DOCFINDER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ScanMode.PDF417.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ScanMode.FACE_MANUAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ScanMode.MANUAL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ScanMode.NFC.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[ScanMode.JUMIO_LIVENESS.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[ScanMode.JUMIO_PREMIUM.ordinal()] = 7;
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
        f90486a = iArr;
    }
}
