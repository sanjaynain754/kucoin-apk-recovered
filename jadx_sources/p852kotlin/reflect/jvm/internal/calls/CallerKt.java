package p852kotlin.reflect.jvm.internal.calls;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Caller.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u001c\u0010\u0000\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m90084d2 = {"arity", "", "Lkotlin/reflect/jvm/internal/calls/Caller;", "getArity", "(Lkotlin/reflect/jvm/internal/calls/Caller;)I", "kotlin-reflection"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class CallerKt {
    public static final int getArity(@NotNull Caller<?> caller) {
        Intrinsics.checkNotNullParameter(caller, "<this>");
        return caller.getParameterTypes().size();
    }
}
