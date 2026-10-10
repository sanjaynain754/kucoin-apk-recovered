package jumio.core;

import com.jumio.core.models.SupplementalImageCategory;

/* JADX INFO: renamed from: jumio.core.T2 */
/* JADX INFO: loaded from: classes61.dex */
public abstract /* synthetic */ class AbstractC40598T2 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f90126a;

    static {
        int[] iArr = new int[SupplementalImageCategory.values().length];
        try {
            iArr[SupplementalImageCategory.FLASH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SupplementalImageCategory.TILTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SupplementalImageCategory.CAMERACHALLENGE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SupplementalImageCategory.UNSUPPORTED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f90126a = iArr;
    }
}
