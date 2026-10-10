package kotlinx.coroutines;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: kotlinx.coroutines.c0 */
/* JADX INFO: compiled from: CompletionState.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a!\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a-\u0010\u0007\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a3\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0000¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m90084d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Result;", "", "b", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/coroutines/m;", "caller", "c", "(Ljava/lang/Object;Lkotlinx/coroutines/m;)Ljava/lang/Object;", "state", "Lkotlin/coroutines/Continuation;", "uCont", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m90085k = 2, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCompletionState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompletionState.kt\nkotlinx/coroutines/CompletionStateKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n1#1,51:1\n1#2:52\n57#3,2:53\n57#3,2:55\n*S KotlinDebug\n*F\n+ 1 CompletionState.kt\nkotlinx/coroutines/CompletionStateKt\n*L\n11#1:53,2\n16#1:55,2\n*E\n"})
public final class C41554c0 {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final <T> Object m90498a(@Nullable Object obj, @NotNull Continuation<? super T> continuation) {
        if (!(obj instanceof C41549b0)) {
            return Result.m103844constructorimpl(obj);
        }
        Result.Companion companion = Result.INSTANCE;
        return Result.m103844constructorimpl(ResultKt.createFailure(((C41549b0) obj).cause));
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static final <T> Object m90499b(@NotNull Object obj) {
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(obj);
        if (thM103847exceptionOrNullimpl == null) {
            return obj;
        }
        return new C41549b0(thM103847exceptionOrNullimpl, false, 2, null);
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static final <T> Object m90500c(@NotNull Object obj, @NotNull InterfaceC41708m<?> interfaceC41708m) {
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(obj);
        if (thM103847exceptionOrNullimpl == null) {
            return obj;
        }
        return new C41549b0(thM103847exceptionOrNullimpl, false, 2, null);
    }
}
