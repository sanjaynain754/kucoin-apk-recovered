package sg0;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.C41716o;
import kotlinx.coroutines.InterfaceC41708m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugProbesKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: sg0.b */
/* JADX INFO: compiled from: Tasks.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a \u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@¢\u0006\u0004\b\u0002\u0010\u0003\u001a*\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0082@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lcom/google/android/gms/tasks/Task;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/google/android/gms/tasks/Task;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/google/android/gms/tasks/CancellationTokenSource;", "cancellationTokenSource", "b", "(Lcom/google/android/gms/tasks/Task;Lcom/google/android/gms/tasks/CancellationTokenSource;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-play-services"}, m90085k = 2, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTasks.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tasks.kt\nkotlinx/coroutines/tasks/TasksKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,164:1\n426#2,11:165\n*S KotlinDebug\n*F\n+ 1 Tasks.kt\nkotlinx/coroutines/tasks/TasksKt\n*L\n136#1:165,11\n*E\n"})
public final class C44409b {

    /* JADX INFO: renamed from: sg0.b$a */
    /* JADX INFO: compiled from: Tasks.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class a<TResult> implements OnCompleteListener {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC41708m<T> f98092b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(InterfaceC41708m<? super T> interfaceC41708m) {
            this.f98092b = interfaceC41708m;
        }

        @Override // com.google.android.gms.tasks.OnCompleteListener
        public final void onComplete(Task<T> task) {
            Exception exception = task.getException();
            if (exception == null) {
                if (task.isCanceled()) {
                    InterfaceC41708m.a.m91121a(this.f98092b, null, 1, null);
                    return;
                }
                Continuation continuation = this.f98092b;
                Result.Companion companion = Result.INSTANCE;
                continuation.resumeWith(Result.m103844constructorimpl(task.getResult()));
                return;
            }
            Continuation continuation2 = this.f98092b;
            Result.Companion companion2 = Result.INSTANCE;
            continuation2.resumeWith(Result.m103844constructorimpl(ResultKt.createFailure(exception)));
        }
    }

    /* JADX INFO: renamed from: sg0.b$b */
    /* JADX INFO: compiled from: Tasks.kt */
    /* JADX INFO: loaded from: classes61.dex */
    @Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class b implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ CancellationTokenSource f98093b;

        public b(CancellationTokenSource cancellationTokenSource) {
            this.f98093b = cancellationTokenSource;
        }

        /* JADX INFO: renamed from: a */
        public final void m97941a(Throwable th2) {
            this.f98093b.cancel();
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            m97941a(th2);
            return Unit.INSTANCE;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public static final <T> Object m97939a(@NotNull Task<T> task, @NotNull Continuation<? super T> continuation) {
        return m97940b(task, null, continuation);
    }

    /* JADX INFO: renamed from: b */
    public static final <T> Object m97940b(Task<T> task, CancellationTokenSource cancellationTokenSource, Continuation<? super T> continuation) throws Exception {
        if (task.isComplete()) {
            Exception exception = task.getException();
            if (exception == null) {
                if (!task.isCanceled()) {
                    return task.getResult();
                }
                throw new CancellationException("Task " + task + " was cancelled normally.");
            }
            throw exception;
        }
        C41716o c41716o = new C41716o(IntrinsicsKt.intercepted(continuation), 1);
        c41716o.m91142E();
        task.addOnCompleteListener(ExecutorC44408a.f98091b, new a(c41716o));
        if (cancellationTokenSource != null) {
            c41716o.mo91119t(new b(cancellationTokenSource));
        }
        Object objM91171w = c41716o.m91171w();
        if (objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objM91171w;
    }
}
