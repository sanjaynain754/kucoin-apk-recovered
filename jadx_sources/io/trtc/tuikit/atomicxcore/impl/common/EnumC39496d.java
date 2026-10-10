package io.trtc.tuikit.atomicxcore.impl.common;

import p852kotlin.enums.EnumEntriesKt;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 io.trtc.tuikit.atomicxcore.impl.common.d[], still in use, count: 1, list:
  (r0v1 io.trtc.tuikit.atomicxcore.impl.common.d[]) from 0x0073: INVOKE (r0v1 io.trtc.tuikit.atomicxcore.impl.common.d[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m)] (LINE:118)
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
/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.common.d */
/* JADX INFO: loaded from: classes61.dex */
public final class EnumC39496d {
    MESSAGE_LIST(1001),
    MESSAGE_INPUT(1002),
    MESSAGE_ACTION(1003),
    CONVERSATION_LIST(1004),
    CONVERSATION_GROUP(1005),
    SEARCH(1006),
    CONTACT_LIST(1007),
    GROUP_SETTING(1008),
    C2C_SETTING(1009);

    static {
        EnumEntriesKt.enumEntries(enumC39496dArr);
    }

    public static EnumC39496d valueOf(String str) {
        return (EnumC39496d) Enum.valueOf(EnumC39496d.class, str);
    }

    public static EnumC39496d[] values() {
        return (EnumC39496d[]) f87693j.clone();
    }

    public EnumC39496d(int i11) {
        super(str, i);
    }
}
