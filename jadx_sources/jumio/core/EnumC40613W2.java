package jumio.core;

import java.util.Arrays;
import java.util.List;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.enums.EnumEntriesKt;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v7 jumio.core.W2[], still in use, count: 1, list:
  (r0v7 jumio.core.W2[]) from 0x00f5: INVOKE (r0v7 jumio.core.W2[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m)] (LINE:248)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: jumio.core.W2 */
/* JADX INFO: loaded from: classes61.dex */
public final class EnumC40613W2 {
    BARCODE("com.jumio.invalid", new EnumC40608V2[0]),
    BARCODE_NATIVE("com.jumio.core.extraction.barcode.BarcodePlugin", new EnumC40608V2[0]),
    /* JADX INFO: Fake field, exist only in values array */
    DATADOG("com.jumio.invalid", EnumC40608V2.DATADOG),
    DOCFINDER("com.jumio.core.extraction.docfinder.DocFinderPlugin", new EnumC40608V2[0]),
    EMULATOR("com.jumio.emulator.EmulatorPlugin", new EnumC40608V2[0]),
    /* JADX INFO: Fake field, exist only in values array */
    FACE_IPROOV("com.jumio.invalid", EnumC40608V2.IPROOV),
    FACE_MANUAL("com.jumio.core.extraction.facemanual.FaceManualPlugin", new EnumC40608V2[0]),
    /* JADX INFO: Fake field, exist only in values array */
    LINEFINDER("com.jumio.invalid", new EnumC40608V2[0]),
    MANUAL("com.jumio.core.extraction.manual.ManualPicturePlugin", new EnumC40608V2[0]),
    /* JADX INFO: Fake field, exist only in values array */
    MRZ("com.jumio.invalid", new EnumC40608V2[0]),
    NFC("com.jumio.core.extraction.nfc.NfcPlugin", EnumC40608V2.JMRTD, EnumC40608V2.BOUNCYCASTLE, EnumC40608V2.SCUBA),
    /* JADX INFO: Fake field, exist only in values array */
    SARDINE("com.jumio.invalid", new EnumC40608V2[0]),
    DIGITAL_IDENTITY("com.jumio.digitalidentity.DigitalIdentityPlugin", new EnumC40608V2[0]),
    JUMIO_LIVENESS("com.jumio.liveness.LivenessPlugin", new EnumC40608V2[0]),
    CAMERA_X("com.jumio.camerax.CameraXManager", new EnumC40608V2[0]);


    /* JADX INFO: renamed from: a */
    public final String f90171a;

    /* JADX INFO: renamed from: b */
    public final List f90172b;

    static {
        EnumEntriesKt.enumEntries(enumC40613W2Arr);
    }

    public static EnumC40613W2 valueOf(String str) {
        return (EnumC40613W2) Enum.valueOf(EnumC40613W2.class, str);
    }

    public static EnumC40613W2[] values() {
        return (EnumC40613W2[]) f90170m.clone();
    }

    public EnumC40613W2(String str, EnumC40608V2... enumC40608V2Arr) {
        super(str, i);
        this.f90171a = str;
        this.f90172b = CollectionsKt.listOf(Arrays.copyOf(enumC40608V2Arr, enumC40608V2Arr.length));
    }
}
