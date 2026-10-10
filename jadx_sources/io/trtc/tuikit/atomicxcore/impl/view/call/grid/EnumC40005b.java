package io.trtc.tuikit.atomicxcore.impl.view.call.grid;

import p852kotlin.enums.EnumEntriesKt;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 io.trtc.tuikit.atomicxcore.impl.view.call.grid.b[], still in use, count: 1, list:
  (r0v1 io.trtc.tuikit.atomicxcore.impl.view.call.grid.b[]) from 0x004c: INVOKE (r0v1 io.trtc.tuikit.atomicxcore.impl.view.call.grid.b[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m)] (LINE:79)
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
/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.call.grid.b */
/* JADX INFO: loaded from: classes61.dex */
public final class EnumC40005b {
    FULL_WIDTH,
    ONE_THIRD,
    FIFTY_FIFTY,
    THREE_ONE_THIRDS,
    ONE_THIRD_TWO_THIRDS,
    TWO_THIRDS_ONE_THIRD_CENTER,
    TWO_THIRDS_ONE_THIRD_RIGHT;

    static {
        EnumEntriesKt.enumEntries(enumC40005bArr);
    }

    public static EnumC40005b valueOf(String str) {
        return (EnumC40005b) Enum.valueOf(EnumC40005b.class, str);
    }

    public static EnumC40005b[] values() {
        return (EnumC40005b[]) f88981h.clone();
    }

    public EnumC40005b() {
        super(str, i);
    }
}
