package jumio.core;

import com.jumio.core.data.ScanMode;
import com.jumio.sdk.enums.JumioCredentialPart;

/* JADX INFO: renamed from: jumio.core.z3 */
/* JADX INFO: loaded from: classes61.dex */
public abstract /* synthetic */ class AbstractC40761z3 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f90513a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int[] f90514b;

    static {
        int[] iArr = new int[ScanMode.values().length];
        try {
            iArr[ScanMode.JUMIO_LIVENESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ScanMode.JUMIO_PREMIUM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f90513a = iArr;
        int[] iArr2 = new int[JumioCredentialPart.values().length];
        try {
            iArr2[JumioCredentialPart.FRONT.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[JumioCredentialPart.NFC.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[JumioCredentialPart.BACK.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[JumioCredentialPart.FACE.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[JumioCredentialPart.DOCUMENT.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        f90514b = iArr2;
    }
}
