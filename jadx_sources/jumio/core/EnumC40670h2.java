package jumio.core;

import p852kotlin.enums.EnumEntriesKt;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 jumio.core.h2[], still in use, count: 1, list:
  (r0v1 jumio.core.h2[]) from 0x0038: INVOKE (r0v1 jumio.core.h2[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m)] (LINE:59)
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
/* JADX INFO: renamed from: jumio.core.h2 */
/* JADX INFO: loaded from: classes61.dex */
public final class EnumC40670h2 {
    FINISHED,
    CANCELLED,
    CREATED,
    ABORTED,
    ERROR;

    static {
        EnumEntriesKt.enumEntries(enumC40670h2Arr);
    }

    public static EnumC40670h2 valueOf(String str) {
        return (EnumC40670h2) Enum.valueOf(EnumC40670h2.class, str);
    }

    public static EnumC40670h2[] values() {
        return (EnumC40670h2[]) f90287f.clone();
    }

    public EnumC40670h2() {
        super(str, i);
    }
}
