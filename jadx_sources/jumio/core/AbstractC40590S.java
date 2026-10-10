package jumio.core;

import com.jumio.commons.camera.ExposureLevel;
import com.jumio.commons.camera.WhiteBalance;

/* JADX INFO: renamed from: jumio.core.S */
/* JADX INFO: loaded from: classes61.dex */
public abstract /* synthetic */ class AbstractC40590S {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f90113a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int[] f90114b;

    static {
        int[] iArr = new int[ExposureLevel.values().length];
        try {
            iArr[ExposureLevel.AUTO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ExposureLevel.DEFAULT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ExposureLevel.UNDER_EXPOSED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ExposureLevel.OVER_EXPOSED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f90113a = iArr;
        int[] iArr2 = new int[WhiteBalance.values().length];
        try {
            iArr2[WhiteBalance.AUTO.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[WhiteBalance.DEFAULT.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[WhiteBalance.RED.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[WhiteBalance.RED_GREEN.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[WhiteBalance.GREEN.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[WhiteBalance.GREEN_BLUE.ordinal()] = 6;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[WhiteBalance.BLUE.ordinal()] = 7;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[WhiteBalance.BLUE_RED.ordinal()] = 8;
        } catch (NoSuchFieldError unused12) {
        }
        f90114b = iArr2;
    }
}
