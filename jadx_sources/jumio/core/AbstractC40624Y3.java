package jumio.core;

import com.jumio.core.enums.UploadResolution;

/* JADX INFO: renamed from: jumio.core.Y3 */
/* JADX INFO: loaded from: classes61.dex */
public abstract /* synthetic */ class AbstractC40624Y3 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f90187a;

    static {
        int[] iArr = new int[UploadResolution.values().length];
        try {
            iArr[UploadResolution.DEBUG.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[UploadResolution.FHD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[UploadResolution.UHD.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f90187a = iArr;
    }
}
