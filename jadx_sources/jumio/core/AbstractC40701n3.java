package jumio.core;

import com.jumio.sdk.enums.JumioCredentialPart;
import com.jumio.sdk.enums.JumioScanStep;

/* JADX INFO: renamed from: jumio.core.n3 */
/* JADX INFO: loaded from: classes61.dex */
public abstract /* synthetic */ class AbstractC40701n3 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f90338a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int[] f90339b;

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
        try {
            iArr[JumioCredentialPart.MULTIPART.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[JumioCredentialPart.NFC.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[JumioCredentialPart.FACE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[JumioCredentialPart.DOCUMENT.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[JumioCredentialPart.DIGITAL.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        f90338a = iArr;
        int[] iArr2 = new int[JumioScanStep.values().length];
        try {
            iArr2[JumioScanStep.PREPARE.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[JumioScanStep.STARTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[JumioScanStep.ATTACH_ACTIVITY.ordinal()] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[JumioScanStep.ATTACH_FILE.ordinal()] = 4;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[JumioScanStep.DIGITAL_IDENTITY_VIEW.ordinal()] = 5;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[JumioScanStep.SCAN_VIEW.ordinal()] = 6;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[JumioScanStep.THIRD_PARTY_VERIFICATION.ordinal()] = 7;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[JumioScanStep.IMAGE_TAKEN.ordinal()] = 8;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr2[JumioScanStep.NEXT_PART.ordinal()] = 9;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr2[JumioScanStep.PROCESSING.ordinal()] = 10;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr2[JumioScanStep.CONFIRMATION_VIEW.ordinal()] = 11;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr2[JumioScanStep.REJECT_VIEW.ordinal()] = 12;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr2[JumioScanStep.RETRY.ordinal()] = 13;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr2[JumioScanStep.CAN_FINISH.ordinal()] = 14;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr2[JumioScanStep.ADDON_SCAN_PART.ordinal()] = 15;
        } catch (NoSuchFieldError unused22) {
        }
        f90339b = iArr2;
    }
}
