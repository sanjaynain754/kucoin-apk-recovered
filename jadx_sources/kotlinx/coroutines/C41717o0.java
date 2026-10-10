package kotlinx.coroutines;

import androidx.media3.exoplayer.upstream.CmcdData;
import og0.C43058h;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: kotlinx.coroutines.o0 */
/* JADX INFO: compiled from: DebugStrings.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u001a\u0017\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u0018\u0010\u0007\u001a\u00020\u0001*\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\"\u0018\u0010\t\u001a\u00020\u0001*\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006¨\u0006\n"}, m90084d2 = {"Lkotlin/coroutines/Continuation;", "", "c", "(Lkotlin/coroutines/Continuation;)Ljava/lang/String;", "", "b", "(Ljava/lang/Object;)Ljava/lang/String;", "hexAddress", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "classSimpleName", "kotlinx-coroutines-core"}, m90085k = 2, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nDebugStrings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugStrings.kt\nkotlinx/coroutines/DebugStringsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,18:1\n1#2:19\n*E\n"})
public final class C41717o0 {
    @NotNull
    /* JADX INFO: renamed from: c */
    public static final String m91176c(@NotNull Continuation<?> continuation) {
        Object objM103844constructorimpl;
        if (continuation instanceof C43058h) {
            return ((C43058h) continuation).toString();
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(continuation + '@' + m91175b(continuation));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103847exceptionOrNullimpl(objM103844constructorimpl) != null) {
            objM103844constructorimpl = continuation.getClass().getName() + '@' + m91175b(continuation);
        }
        return (String) objM103844constructorimpl;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m91174a(@NotNull Object obj) {
        return obj.getClass().getSimpleName();
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final String m91175b(@NotNull Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }
}
