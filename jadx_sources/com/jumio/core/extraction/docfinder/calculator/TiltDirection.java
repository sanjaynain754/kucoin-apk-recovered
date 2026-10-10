package com.jumio.core.extraction.docfinder.calculator;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.jumio.core.extraction.docfinder.calculator.TiltDirection[], still in use, count: 1, list:
  (r0v1 com.jumio.core.extraction.docfinder.calculator.TiltDirection[]) from 0x0038: INVOKE (r0v1 com.jumio.core.extraction.docfinder.calculator.TiltDirection[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:59)
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
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m90084d2 = {"Lcom/jumio/core/extraction/docfinder/calculator/TiltDirection;", "", "<init>", "(Ljava/lang/String;I)V", "INVALID", "UP", "DOWN", "LEFT", "RIGHT", "jumio-docfinder_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class TiltDirection {
    INVALID,
    UP,
    DOWN,
    LEFT,
    RIGHT;


    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ EnumEntries f14028b;

    static {
        f14028b = EnumEntriesKt.enumEntries(tiltDirectionArr);
    }

    @NotNull
    public static EnumEntries<TiltDirection> getEntries() {
        return f14028b;
    }

    public static TiltDirection valueOf(String str) {
        return (TiltDirection) Enum.valueOf(TiltDirection.class, str);
    }

    public static TiltDirection[] values() {
        return (TiltDirection[]) f14027a.clone();
    }

    public TiltDirection() {
        super(str, i);
    }
}
