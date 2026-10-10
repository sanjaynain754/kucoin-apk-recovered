package jumio.camerax;

import com.jumio.commons.camera.ExposureLevel;
import com.jumio.commons.camera.LensDistance;
import com.jumio.commons.camera.WhiteBalance;

/* JADX INFO: renamed from: jumio.camerax.s */
/* JADX INFO: loaded from: classes61.dex */
public abstract /* synthetic */ class AbstractC40493s {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f89882a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int[] f89883b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int[] f89884c;

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
        f89882a = iArr;
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
        f89883b = iArr2;
        int[] iArr3 = new int[LensDistance.values().length];
        try {
            iArr3[LensDistance.MEDIUM.ordinal()] = 1;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr3[LensDistance.STRONG.ordinal()] = 2;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr3[LensDistance.AUTO.ordinal()] = 3;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr3[LensDistance.DEFAULT.ordinal()] = 4;
        } catch (NoSuchFieldError unused16) {
        }
        f89884c = iArr3;
    }
}
