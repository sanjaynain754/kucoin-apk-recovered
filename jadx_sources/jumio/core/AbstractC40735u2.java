package jumio.core;

import com.jumio.core.data.ScanMode;

/* JADX INFO: renamed from: jumio.core.u2 */
/* JADX INFO: loaded from: classes61.dex */
public abstract /* synthetic */ class AbstractC40735u2 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f90444a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int[] f90445b;

    static {
        int[] iArr = new int[EnumC40670h2.values().length];
        try {
            iArr[4] = 1;
        } catch (NoSuchFieldError unused) {
        }
        f90444a = iArr;
        int[] iArr2 = new int[ScanMode.values().length];
        try {
            iArr2[ScanMode.DOCFINDER.ordinal()] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[ScanMode.PDF417.ordinal()] = 2;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[ScanMode.FACE_MANUAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[ScanMode.MANUAL.ordinal()] = 4;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[ScanMode.NFC.ordinal()] = 5;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[ScanMode.JUMIO_LIVENESS.ordinal()] = 6;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[ScanMode.JUMIO_PREMIUM.ordinal()] = 7;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[ScanMode.FILE.ordinal()] = 8;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[ScanMode.WEB.ordinal()] = 9;
        } catch (NoSuchFieldError unused10) {
        }
        f90445b = iArr2;
    }
}
