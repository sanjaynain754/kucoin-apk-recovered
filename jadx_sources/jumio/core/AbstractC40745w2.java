package jumio.core;

import com.jumio.sdk.enums.JumioCredentialPart;

/* JADX INFO: renamed from: jumio.core.w2 */
/* JADX INFO: loaded from: classes61.dex */
public abstract /* synthetic */ class AbstractC40745w2 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f90463a;

    static {
        int[] iArr = new int[JumioCredentialPart.values().length];
        try {
            iArr[JumioCredentialPart.FRONT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[JumioCredentialPart.BACK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f90463a = iArr;
    }
}
