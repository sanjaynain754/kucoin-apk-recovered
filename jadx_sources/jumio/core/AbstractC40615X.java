package jumio.core;

import com.jumio.commons.camera.ExposureLevel;

/* JADX INFO: renamed from: jumio.core.X */
/* JADX INFO: loaded from: classes61.dex */
public abstract /* synthetic */ class AbstractC40615X {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f90173a;

    static {
        int[] iArr = new int[ExposureLevel.values().length];
        try {
            iArr[ExposureLevel.OVER_EXPOSED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ExposureLevel.UNDER_EXPOSED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f90173a = iArr;
    }
}
