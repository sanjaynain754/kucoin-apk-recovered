package pg0;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import kotlinx.coroutines.DispatchException;
import og0.C43060i;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: pg0.a */
/* JADX INFO: compiled from: Cancellable.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0004\u001aQ\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00022\u0006\u0010\u0005\u001a\u00028\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\u0000¢\u0006\u0004\b\b\u0010\t\u001a%\u0010\u000b\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00070\u00032\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a#\u0010\u000f\u001a\u00020\u00072\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m90084d2 = {"R", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "receiver", "completion", "", "c", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)V", "fatalCompletion", "b", "(Lkotlin/coroutines/Continuation;Lkotlin/coroutines/Continuation;)V", "", "e", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lkotlin/coroutines/Continuation;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, m90085k = 2, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCancellable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Cancellable.kt\nkotlinx/coroutines/intrinsics/CancellableKt\n*L\n1#1,65:1\n45#1,6:66\n45#1,6:72\n45#1,6:78\n*S KotlinDebug\n*F\n+ 1 Cancellable.kt\nkotlinx/coroutines/intrinsics/CancellableKt\n*L\n15#1:66,6\n25#1:72,6\n34#1:78,6\n*E\n"})
public final class C43465a {
    /* JADX INFO: renamed from: a */
    public static final void m95677a(Continuation<?> continuation, Throwable th2) throws Throwable {
        if (th2 instanceof DispatchException) {
            th2 = ((DispatchException) th2).getCause();
        }
        Result.Companion companion = Result.INSTANCE;
        continuation.resumeWith(Result.m103844constructorimpl(ResultKt.createFailure(th2)));
        throw th2;
    }

    /* JADX INFO: renamed from: b */
    public static final void m95678b(@NotNull Continuation<? super Unit> continuation, @NotNull Continuation<?> continuation2) throws Throwable {
        try {
            Continuation continuationIntercepted = IntrinsicsKt.intercepted(continuation);
            Result.Companion companion = Result.INSTANCE;
            C43060i.m94592b(continuationIntercepted, Result.m103844constructorimpl(Unit.INSTANCE));
        } catch (Throwable th2) {
            m95677a(continuation2, th2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final <R, T> void m95679c(@NotNull Function2<? super R, ? super Continuation<? super T>, ? extends Object> function2, R r11, @NotNull Continuation<? super T> continuation) {
        try {
            Continuation continuationIntercepted = IntrinsicsKt.intercepted(IntrinsicsKt.createCoroutineUnintercepted(function2, r11, continuation));
            Result.Companion companion = Result.INSTANCE;
            C43060i.m94592b(continuationIntercepted, Result.m103844constructorimpl(Unit.INSTANCE));
        } catch (Throwable th2) {
            m95677a(continuation, th2);
        }
    }
}
