package jumio.core;

import com.jumio.commons.enums.ScreenAngle;

/* JADX INFO: renamed from: jumio.core.D3 */
/* JADX INFO: loaded from: classes61.dex */
public abstract /* synthetic */ class AbstractC40520D3 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f89951a;

    static {
        int[] iArr = new int[ScreenAngle.values().length];
        try {
            iArr[ScreenAngle.PORTRAIT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ScreenAngle.LANDSCAPE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ScreenAngle.INVERTED_PORTRAIT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ScreenAngle.INVERTED_LANDSCAPE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f89951a = iArr;
    }
}
