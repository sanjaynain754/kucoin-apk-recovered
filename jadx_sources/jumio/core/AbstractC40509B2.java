package jumio.core;

import com.jumio.core.enums.NfcStandard;

/* JADX INFO: renamed from: jumio.core.B2 */
/* JADX INFO: loaded from: classes61.dex */
public abstract /* synthetic */ class AbstractC40509B2 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f89926a;

    static {
        int[] iArr = new int[NfcStandard.values().length];
        try {
            iArr[NfcStandard.ICAO9303.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        f89926a = iArr;
    }
}
