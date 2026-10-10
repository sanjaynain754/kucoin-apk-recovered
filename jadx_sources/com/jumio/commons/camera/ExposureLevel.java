package com.jumio.commons.camera;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.jumio.commons.camera.ExposureLevel[], still in use, count: 1, list:
  (r0v1 com.jumio.commons.camera.ExposureLevel[]) from 0x002e: INVOKE (r0v1 com.jumio.commons.camera.ExposureLevel[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:49)
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
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m90084d2 = {"Lcom/jumio/commons/camera/ExposureLevel;", "", "<init>", "(Ljava/lang/String;I)V", "AUTO", "DEFAULT", "UNDER_EXPOSED", "OVER_EXPOSED", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ExposureLevel {
    AUTO,
    DEFAULT,
    UNDER_EXPOSED,
    OVER_EXPOSED;


    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ EnumEntries f13527b;

    static {
        f13527b = EnumEntriesKt.enumEntries(exposureLevelArr);
    }

    @NotNull
    public static EnumEntries<ExposureLevel> getEntries() {
        return f13527b;
    }

    public static ExposureLevel valueOf(String str) {
        return (ExposureLevel) Enum.valueOf(ExposureLevel.class, str);
    }

    public static ExposureLevel[] values() {
        return (ExposureLevel[]) f13526a.clone();
    }

    public ExposureLevel() {
        super(str, i);
    }
}
