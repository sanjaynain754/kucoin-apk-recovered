package androidx.core.os;

import android.content.Context;
import android.os.ProfilingManager;
import android.os.ProfilingResult;
import androidx.annotation.RequiresApi;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import kotlinx.coroutines.channels.InterfaceC41574m;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Profiling.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a-\u0010\u0004\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\bH\u0007¢\u0006\u0004\b\u0004\u0010\u000b\u001a%\u0010\f\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\bH\u0007¢\u0006\u0004\b\f\u0010\r\u001a9\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\"\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014\"\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014\"\u0014\u0010\u0016\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014\"\u0014\u0010\u0017\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014\"\u0014\u0010\u0018\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0014\"\u0014\u0010\u0019\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0014\"\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c\"\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001c¨\u0006\u001e"}, m90084d2 = {"Landroid/content/Context;", "context", "Lkotlinx/coroutines/flow/e;", "Landroid/os/ProfilingResult;", "registerForAllProfilingResults", "(Landroid/content/Context;)Lkotlinx/coroutines/flow/e;", "Ljava/util/concurrent/Executor;", "executor", "Ljava/util/function/Consumer;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "(Landroid/content/Context;Ljava/util/concurrent/Executor;Ljava/util/function/Consumer;)V", "unregisterForAllProfilingResults", "(Landroid/content/Context;Ljava/util/function/Consumer;)V", "Landroidx/core/os/ProfilingRequest;", "profilingRequest", "requestProfiling", "(Landroid/content/Context;Landroidx/core/os/ProfilingRequest;Ljava/util/concurrent/Executor;Ljava/util/function/Consumer;)V", "", Profiling.KEY_DURATION_MS, "Ljava/lang/String;", Profiling.KEY_SAMPLING_INTERVAL_BYTES, Profiling.KEY_TRACK_JAVA_ALLOCATIONS, Profiling.KEY_FREQUENCY_HZ, Profiling.KEY_SIZE_KB, Profiling.KEY_BUFFER_FILL_POLICY, "", "VALUE_BUFFER_FILL_POLICY_DISCARD", "I", "VALUE_BUFFER_FILL_POLICY_RING_BUFFER", "core_release"}, m90085k = 2, m90086mv = {1, 8, 0}, m90088xi = 48)
@JvmName(name = "Profiling")
public final class Profiling {

    @NotNull
    private static final String KEY_BUFFER_FILL_POLICY = "KEY_BUFFER_FILL_POLICY";

    @NotNull
    private static final String KEY_DURATION_MS = "KEY_DURATION_MS";

    @NotNull
    private static final String KEY_FREQUENCY_HZ = "KEY_FREQUENCY_HZ";

    @NotNull
    private static final String KEY_SAMPLING_INTERVAL_BYTES = "KEY_SAMPLING_INTERVAL_BYTES";

    @NotNull
    private static final String KEY_SIZE_KB = "KEY_SIZE_KB";

    @NotNull
    private static final String KEY_TRACK_JAVA_ALLOCATIONS = "KEY_TRACK_JAVA_ALLOCATIONS";
    private static final int VALUE_BUFFER_FILL_POLICY_DISCARD = 1;
    private static final int VALUE_BUFFER_FILL_POLICY_RING_BUFFER = 2;

    /* JADX INFO: renamed from: androidx.core.os.Profiling$registerForAllProfilingResults$1 */
    /* JADX INFO: compiled from: Profiling.kt */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m90084d2 = {"Lkotlinx/coroutines/channels/m;", "Landroid/os/ProfilingResult;", "", "<anonymous>", "(Lkotlinx/coroutines/channels/m;)V"}, m90085k = 3, m90086mv = {1, 8, 0})
    @DebugMetadata(m90121c = "androidx.core.os.Profiling$registerForAllProfilingResults$1", m90122f = "Profiling.kt", m90123i = {}, m90124l = {79}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C17061 extends SuspendLambda implements Function2<InterfaceC41574m<? super ProfilingResult>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17061(Context context, Continuation<? super C17061> continuation) {
            super(2, continuation);
            this.$context = context;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C17061 c17061 = new C17061(this.$context, continuation);
            c17061.L$0 = obj;
            return c17061;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41574m<? super ProfilingResult> interfaceC41574m, Continuation<? super Unit> continuation) {
            return ((C17061) create(interfaceC41574m, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(InterfaceC41574m interfaceC41574m, ProfilingResult result) {
            Intrinsics.checkNotNullExpressionValue(result, "result");
            interfaceC41574m.mo90594e(result);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                final InterfaceC41574m interfaceC41574m = (InterfaceC41574m) this.L$0;
                final Consumer consumer = new Consumer() { // from class: androidx.core.os.h
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj2) {
                        Profiling.C17061.invokeSuspend$lambda$0(interfaceC41574m, (ProfilingResult) obj2);
                    }
                };
                final ProfilingManager profilingManagerM2429a = C1710d.m2429a(this.$context.getSystemService(C1709c.m2428a()));
                profilingManagerM2429a.registerForAllProfilingResults(new Executor() { // from class: androidx.core.os.i
                    @Override // java.util.concurrent.Executor
                    public final void execute(Runnable runnable) {
                        runnable.run();
                    }
                }, consumer);
                Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.core.os.Profiling.registerForAllProfilingResults.1.2
                    @Override // p852kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        profilingManagerM2429a.unregisterForAllProfilingResults(consumer);
                    }
                };
                this.label = 1;
                if (ProduceKt.m90681a(interfaceC41574m, function0, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    @RequiresApi(api = 35)
    @NotNull
    public static final InterfaceC41634e<ProfilingResult> registerForAllProfilingResults(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return C41636g.m90913f(new C17061(context, null));
    }

    @RequiresApi(api = 35)
    public static final void registerForAllProfilingResults(@NotNull Context context, @NotNull Executor executor, @NotNull Consumer<ProfilingResult> listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(listener, "listener");
        C1710d.m2429a(context.getSystemService(C1709c.m2428a())).registerForAllProfilingResults(executor, listener);
    }

    @RequiresApi(api = 35)
    public static final void requestProfiling(@NotNull Context context, @NotNull ProfilingRequest profilingRequest, @Nullable Executor executor, @Nullable Consumer<ProfilingResult> consumer) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(profilingRequest, "profilingRequest");
        C1710d.m2429a(context.getSystemService(C1709c.m2428a())).requestProfiling(profilingRequest.getProfilingType(), profilingRequest.getParams(), profilingRequest.getTag(), profilingRequest.getCancellationSignal(), executor, consumer);
    }

    @RequiresApi(api = 35)
    public static final void unregisterForAllProfilingResults(@NotNull Context context, @NotNull Consumer<ProfilingResult> listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listener, "listener");
        C1710d.m2429a(context.getSystemService(C1709c.m2428a())).unregisterForAllProfilingResults(listener);
    }
}
