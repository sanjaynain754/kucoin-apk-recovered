package jumio.core;

import com.jumio.core.credentials.CredentialCapabilityType$Companion;
import p852kotlin.enums.EnumEntriesKt;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 jumio.core.D0[], still in use, count: 1, list:
  (r0v1 jumio.core.D0[]) from 0x004c: INVOKE (r0v1 jumio.core.D0[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m)] (LINE:79)
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
/* JADX INFO: renamed from: jumio.core.D0 */
/* JADX INFO: loaded from: classes61.dex */
public final class EnumC40517D0 {
    UNKNOWN,
    STORAGE,
    EXTRACTION,
    AUTHENTICATION,
    SIMILARITY,
    FRAUD_LOOKUPS,
    LIVENESS;


    /* JADX INFO: renamed from: a */
    public static final CredentialCapabilityType$Companion f89942a;

    static {
        EnumEntriesKt.enumEntries(enumC40517D0Arr);
        f89942a = new CredentialCapabilityType$Companion(null);
    }

    public static EnumC40517D0 valueOf(String str) {
        return (EnumC40517D0) Enum.valueOf(EnumC40517D0.class, str);
    }

    public static EnumC40517D0[] values() {
        return (EnumC40517D0[]) f89950i.clone();
    }

    public EnumC40517D0() {
        super(str, i);
    }
}
