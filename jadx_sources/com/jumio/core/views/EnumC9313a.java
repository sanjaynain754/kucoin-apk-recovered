package com.jumio.core.views;

import p852kotlin.enums.EnumEntriesKt;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.jumio.core.views.a[], still in use, count: 1, list:
  (r0v1 com.jumio.core.views.a[]) from 0x0024: INVOKE (r0v1 com.jumio.core.views.a[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m)] (LINE:39)
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
/* JADX INFO: renamed from: com.jumio.core.views.a */
/* JADX INFO: loaded from: classes56.dex */
public final class EnumC9313a {
    FLASH,
    FOCUS,
    SWITCH_CAMERA;

    static {
        EnumEntriesKt.enumEntries(enumC9313aArr);
    }

    public static EnumC9313a valueOf(String str) {
        return (EnumC9313a) Enum.valueOf(EnumC9313a.class, str);
    }

    public static EnumC9313a[] values() {
        return (EnumC9313a[]) f14599d.clone();
    }

    public EnumC9313a() {
        super(str, i);
    }
}
