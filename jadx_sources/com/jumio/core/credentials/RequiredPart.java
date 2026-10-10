package com.jumio.core.credentials;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.jumio.core.credentials.RequiredPart[], still in use, count: 1, list:
  (r0v1 com.jumio.core.credentials.RequiredPart[]) from 0x0024: INVOKE (r0v1 com.jumio.core.credentials.RequiredPart[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:39)
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
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, m90084d2 = {"Lcom/jumio/core/credentials/RequiredPart;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "FRONT", "BACK", "Companion", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class RequiredPart {
    NONE,
    FRONT,
    BACK;


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ EnumEntries f13764b;

    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/jumio/core/credentials/RequiredPart$Companion;", "", "<init>", "()V", "fromString", "Lcom/jumio/core/credentials/RequiredPart;", TypedValues.Custom.S_STRING, "", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRequiredPart.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RequiredPart.kt\ncom/jumio/core/credentials/RequiredPart$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,13:1\n1#2:14\n*E\n"})
    public static final class Companion {
        @NotNull
        public final RequiredPart fromString(@NotNull String string) {
            RequiredPart next;
            Intrinsics.checkNotNullParameter(string, "string");
            Iterator<RequiredPart> it = RequiredPart.getEntries().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.areEqual(next.name(), string));
            RequiredPart requiredPart = next;
            return requiredPart == null ? RequiredPart.NONE : requiredPart;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        f13764b = EnumEntriesKt.enumEntries(new RequiredPart[]{r0, r1, r2});
    }

    @NotNull
    public static EnumEntries<RequiredPart> getEntries() {
        return f13764b;
    }

    public static RequiredPart valueOf(String str) {
        return (RequiredPart) Enum.valueOf(RequiredPart.class, str);
    }

    public static RequiredPart[] values() {
        return (RequiredPart[]) f13763a.clone();
    }

    public RequiredPart() {
        super(str, i);
    }
}
