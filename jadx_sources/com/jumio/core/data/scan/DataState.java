package com.jumio.core.data.scan;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.jumio.core.data.scan.DataState[], still in use, count: 1, list:
  (r0v1 com.jumio.core.data.scan.DataState[]) from 0x0038: INVOKE (r0v1 com.jumio.core.data.scan.DataState[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:59)
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
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0000J\u000e\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0000j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\r"}, m90084d2 = {"Lcom/jumio/core/data/scan/DataState;", "", "<init>", "(Ljava/lang/String;I)V", "TODO", "SAVING", "SAVED", "UPLOADED", "SKIPPED", "isAtLeast", "", "state", "canTransitionTo", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class DataState {
    TODO,
    SAVING,
    SAVED,
    UPLOADED,
    SKIPPED;


    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ EnumEntries f13826b;

    static {
        f13826b = EnumEntriesKt.enumEntries(dataStateArr);
    }

    @NotNull
    public static EnumEntries<DataState> getEntries() {
        return f13826b;
    }

    public static DataState valueOf(String str) {
        return (DataState) Enum.valueOf(DataState.class, str);
    }

    public static DataState[] values() {
        return (DataState[]) f13825a.clone();
    }

    public final boolean canTransitionTo(@NotNull DataState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return state.ordinal() >= ordinal();
    }

    public final boolean isAtLeast(@NotNull DataState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return ordinal() >= state.ordinal();
    }

    public DataState() {
        super(str, i);
    }
}
