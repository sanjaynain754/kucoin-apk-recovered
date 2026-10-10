package jumio.core;

import com.jumio.core.data.ScanMode;
import com.jumio.sdk.credentials.JumioCredentialCategory;

/* JADX INFO: renamed from: jumio.core.m0 */
/* JADX INFO: loaded from: classes61.dex */
public abstract /* synthetic */ class AbstractC40693m0 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f90325a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int[] f90326b;

    static {
        int[] iArr = new int[ScanMode.values().length];
        try {
            iArr[ScanMode.FACE_MANUAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ScanMode.JUMIO_LIVENESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ScanMode.JUMIO_PREMIUM.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f90325a = iArr;
        int[] iArr2 = new int[JumioCredentialCategory.values().length];
        try {
            iArr2[JumioCredentialCategory.ID.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[JumioCredentialCategory.FACE.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[JumioCredentialCategory.DOCUMENT.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        f90326b = iArr2;
    }
}
