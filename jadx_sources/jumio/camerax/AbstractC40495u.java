package jumio.camerax;

import com.jumio.commons.camera.WhiteBalance;

/* JADX INFO: renamed from: jumio.camerax.u */
/* JADX INFO: loaded from: classes61.dex */
public abstract /* synthetic */ class AbstractC40495u {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f89890a;

    static {
        int[] iArr = new int[WhiteBalance.values().length];
        try {
            iArr[WhiteBalance.RED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[WhiteBalance.RED_GREEN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[WhiteBalance.GREEN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[WhiteBalance.GREEN_BLUE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[WhiteBalance.BLUE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[WhiteBalance.BLUE_RED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f89890a = iArr;
    }
}
