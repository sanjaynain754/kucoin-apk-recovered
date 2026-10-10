package androidx.window.embedding;

import android.app.Activity;
import android.content.Context;
import androidx.core.util.Consumer;
import androidx.credentials.ExecutorC1980h;
import androidx.window.RequiresWindowSdkExtension;
import androidx.window.core.ExperimentalWindowApi;
import java.util.List;
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
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SplitController.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000  2\u00020\u0001:\u0002 !B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0016\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u0011\u0010\u001f\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006\""}, m90084d2 = {"Landroidx/window/embedding/SplitController;", "", "Landroidx/window/embedding/EmbeddingBackend;", "embeddingBackend", "<init>", "(Landroidx/window/embedding/EmbeddingBackend;)V", "Landroid/app/Activity;", "activity", "Lkotlinx/coroutines/flow/e;", "", "Landroidx/window/embedding/SplitInfo;", "splitInfoList", "(Landroid/app/Activity;)Lkotlinx/coroutines/flow/e;", "Lkotlin/Function1;", "Landroidx/window/embedding/SplitAttributesCalculatorParams;", "Landroidx/window/embedding/SplitAttributes;", "calculator", "", "setSplitAttributesCalculator", "(Lkotlin/jvm/functions/Function1;)V", "clearSplitAttributesCalculator", "()V", "invalidateTopVisibleSplitAttributes", "splitInfo", "splitAttributes", "updateSplitAttributes", "(Landroidx/window/embedding/SplitInfo;Landroidx/window/embedding/SplitAttributes;)V", "Landroidx/window/embedding/EmbeddingBackend;", "Landroidx/window/embedding/SplitController$SplitSupportStatus;", "getSplitSupportStatus", "()Landroidx/window/embedding/SplitController$SplitSupportStatus;", "splitSupportStatus", "Companion", "SplitSupportStatus", "window_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class SplitController {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final boolean sDebug = false;

    @NotNull
    private final EmbeddingBackend embeddingBackend;

    /* JADX INFO: compiled from: SplitController.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\t"}, m90084d2 = {"Landroidx/window/embedding/SplitController$Companion;", "", "()V", "sDebug", "", "getInstance", "Landroidx/window/embedding/SplitController;", "context", "Landroid/content/Context;", "window_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        @NotNull
        public final SplitController getInstance(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new SplitController(EmbeddingBackend.INSTANCE.getInstance(context));
        }
    }

    /* JADX INFO: compiled from: SplitController.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, m90084d2 = {"Landroidx/window/embedding/SplitController$SplitSupportStatus;", "", "rawValue", "", "(I)V", "toString", "", "Companion", "window_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class SplitSupportStatus {
        private final int rawValue;

        @JvmField
        @NotNull
        public static final SplitSupportStatus SPLIT_AVAILABLE = new SplitSupportStatus(0);

        @JvmField
        @NotNull
        public static final SplitSupportStatus SPLIT_UNAVAILABLE = new SplitSupportStatus(1);

        @JvmField
        @NotNull
        public static final SplitSupportStatus SPLIT_ERROR_PROPERTY_NOT_DECLARED = new SplitSupportStatus(2);

        @NotNull
        public String toString() {
            int i11 = this.rawValue;
            if (i11 == 0) {
                return "SplitSupportStatus: AVAILABLE";
            }
            if (i11 != 1) {
                return i11 != 2 ? "UNKNOWN" : "SplitSupportStatus: ERROR_SPLIT_PROPERTY_NOT_DECLARED";
            }
            return "SplitSupportStatus: UNAVAILABLE";
        }

        private SplitSupportStatus(int i11) {
            this.rawValue = i11;
        }
    }

    /* JADX INFO: renamed from: androidx.window.embedding.SplitController$splitInfoList$1 */
    /* JADX INFO: compiled from: SplitController.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m90084d2 = {"Lkotlinx/coroutines/channels/m;", "", "Landroidx/window/embedding/SplitInfo;", "", "<anonymous>", "(Lkotlinx/coroutines/channels/m;)V"}, m90085k = 3, m90086mv = {1, 8, 0})
    @DebugMetadata(m90121c = "androidx.window.embedding.SplitController$splitInfoList$1", m90122f = "SplitController.kt", m90123i = {}, m90124l = {64}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C42421 extends SuspendLambda implements Function2<InterfaceC41574m<? super List<? extends SplitInfo>>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Activity $activity;
        private /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC41574m<? super List<? extends SplitInfo>> interfaceC41574m, Continuation<? super Unit> continuation) {
            return invoke2((InterfaceC41574m<? super List<SplitInfo>>) interfaceC41574m, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42421(Activity activity, Continuation<? super C42421> continuation) {
            super(2, continuation);
            this.$activity = activity;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C42421 c42421 = SplitController.this.new C42421(this.$activity, continuation);
            c42421.L$0 = obj;
            return c42421;
        }

        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@NotNull InterfaceC41574m<? super List<SplitInfo>> interfaceC41574m, @Nullable Continuation<? super Unit> continuation) {
            return ((C42421) create(interfaceC41574m, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
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
                final Consumer<List<SplitInfo>> consumer = new Consumer() { // from class: androidx.window.embedding.o
                    @Override // androidx.core.util.Consumer
                    public final void accept(Object obj2) {
                        interfaceC41574m.mo90594e((List) obj2);
                    }
                };
                SplitController.this.embeddingBackend.addSplitListenerForActivity(this.$activity, new ExecutorC1980h(), consumer);
                final SplitController splitController = SplitController.this;
                Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.window.embedding.SplitController.splitInfoList.1.2
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
                        splitController.embeddingBackend.removeSplitListenerForActivity(consumer);
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

    public SplitController(@NotNull EmbeddingBackend embeddingBackend) {
        Intrinsics.checkNotNullParameter(embeddingBackend, "embeddingBackend");
        this.embeddingBackend = embeddingBackend;
    }

    @JvmStatic
    @NotNull
    public static final SplitController getInstance(@NotNull Context context) {
        return INSTANCE.getInstance(context);
    }

    @RequiresWindowSdkExtension(version = 2)
    public final void clearSplitAttributesCalculator() {
        this.embeddingBackend.clearSplitAttributesCalculator();
    }

    @NotNull
    public final SplitSupportStatus getSplitSupportStatus() {
        return this.embeddingBackend.getSplitSupportStatus();
    }

    @ExperimentalWindowApi
    @RequiresWindowSdkExtension(version = 3)
    public final void invalidateTopVisibleSplitAttributes() {
        this.embeddingBackend.invalidateTopVisibleSplitAttributes();
    }

    @RequiresWindowSdkExtension(version = 2)
    public final void setSplitAttributesCalculator(@NotNull Function1<? super SplitAttributesCalculatorParams, SplitAttributes> calculator) {
        Intrinsics.checkNotNullParameter(calculator, "calculator");
        this.embeddingBackend.setSplitAttributesCalculator(calculator);
    }

    @NotNull
    public final InterfaceC41634e<List<SplitInfo>> splitInfoList(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        return C41636g.m90913f(new C42421(activity, null));
    }

    @ExperimentalWindowApi
    @RequiresWindowSdkExtension(version = 3)
    public final void updateSplitAttributes(@NotNull SplitInfo splitInfo, @NotNull SplitAttributes splitAttributes) {
        Intrinsics.checkNotNullParameter(splitInfo, "splitInfo");
        Intrinsics.checkNotNullParameter(splitAttributes, "splitAttributes");
        this.embeddingBackend.updateSplitAttributes(splitInfo, splitAttributes);
    }
}
