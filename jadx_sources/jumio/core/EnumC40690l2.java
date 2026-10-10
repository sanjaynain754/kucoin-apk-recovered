package jumio.core;

import p852kotlin.enums.EnumEntriesKt;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 jumio.core.l2[], still in use, count: 1, list:
  (r0v1 jumio.core.l2[]) from 0x0040: INVOKE (r0v1 jumio.core.l2[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m)] (LINE:67)
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
/* JADX INFO: renamed from: jumio.core.l2 */
/* JADX INFO: loaded from: classes61.dex */
public final class EnumC40690l2 {
    /* JADX INFO: Fake field, exist only in values array */
    Unknown,
    MRP,
    /* JADX INFO: Fake field, exist only in values array */
    MRV_A,
    /* JADX INFO: Fake field, exist only in values array */
    MRV_B,
    /* JADX INFO: Fake field, exist only in values array */
    TD1,
    /* JADX INFO: Fake field, exist only in values array */
    TD2,
    /* JADX INFO: Fake field, exist only in values array */
    CNIS;

    static {
        EnumEntriesKt.enumEntries(enumC40690l2Arr);
    }

    public static EnumC40690l2 valueOf(String str) {
        return (EnumC40690l2) Enum.valueOf(EnumC40690l2.class, str);
    }

    public static EnumC40690l2[] values() {
        return (EnumC40690l2[]) f90319b.clone();
    }

    public EnumC40690l2() {
        super(str, i);
    }
}
