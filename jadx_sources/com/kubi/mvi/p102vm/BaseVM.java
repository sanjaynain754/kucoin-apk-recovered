package com.kubi.mvi.p102vm;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.mvi.common.C19243e;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.tencent.bugly.proguard.InterfaceC33617e1;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.channels.C41568g;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.InterfaceC41565d;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.ReplaceWith;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BaseVM.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\r\u001a\u00020\n2\u001c\u0010\f\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\bH\u0005¢\u0006\u0004\b\r\u0010\u000eJ8\u0010\u0013\u001a\u00020\n2'\u0010\u0012\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u000f¢\u0006\u0002\b\u0011H\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0019\u0010\u0004J\u000f\u0010\u001a\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001a\u0010\u0004J\u000f\u0010\u001b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001b\u0010\u0004J\u000f\u0010\u001c\u001a\u00020\nH\u0014¢\u0006\u0004\b\u001c\u0010\u0004R\u0014\u0010\u001d\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00150\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00150%8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006)"}, m90084d2 = {"Lcom/kubi/mvi/vm/BaseVM;", "Landroidx/lifecycle/ViewModel;", "Lcom/kubi/mvi/vm/c;", "<init>", "()V", "Lcom/kubi/mvi/vm/a;", "getWidgetLifecycle", "()Lcom/kubi/mvi/vm/a;", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "", TUIConstants.TUIChat.CALL_BACK, InterfaceC33617e1.f69659h, "(Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function2;", "Lkotlinx/coroutines/m0;", "Lkotlin/ExtensionFunctionType;", "block", "launchOnMain", "(Lkotlin/jvm/functions/Function2;)V", "Lcom/kubi/mvi/vm/WidgetLifeEvent;", "widgetLifeEvent", "sendLifeEvent", "(Lcom/kubi/mvi/vm/WidgetLifeEvent;)V", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "onFirstShow", "onCleared", "widgetLifecycle", "Lcom/kubi/mvi/vm/a;", "Lkotlinx/coroutines/channels/d;", "lifeEventChannel", "Lkotlinx/coroutines/channels/d;", "Ljava/util/concurrent/atomic/AtomicInteger;", "showCount", "Ljava/util/concurrent/atomic/AtomicInteger;", "Lkotlinx/coroutines/flow/e;", "getLifecycleFLow", "()Lkotlinx/coroutines/flow/e;", "lifecycleFLow", "MVI_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public abstract class BaseVM extends ViewModel implements InterfaceC19308c {

    @NotNull
    private final C19306a widgetLifecycle = new C19306a();

    @NotNull
    private final InterfaceC41565d<WidgetLifeEvent> lifeEventChannel = C41568g.m90691b(Integer.MAX_VALUE, null, null, 6, null);

    @NotNull
    private final AtomicInteger showCount = new AtomicInteger();

    /* JADX INFO: renamed from: com.kubi.mvi.vm.BaseVM$1 */
    /* JADX INFO: compiled from: BaseVM.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {1, 9, 0})
    @DebugMetadata(m90121c = "com.kubi.mvi.vm.BaseVM$1", m90122f = "BaseVM.kt", m90123i = {}, m90124l = {60}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C193021 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.kubi.mvi.vm.BaseVM$1$a */
        /* JADX INFO: compiled from: BaseVM.kt */
        @Metadata(m90083d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m90084d2 = {"Lcom/kubi/mvi/vm/WidgetLifeEvent;", "it", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/kubi/mvi/vm/WidgetLifeEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m90085k = 3, m90086mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC41635f {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ BaseVM f35713b;

            public a(BaseVM baseVM) {
                this.f35713b = baseVM;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41635f
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(@NotNull WidgetLifeEvent widgetLifeEvent, @NotNull Continuation<? super Unit> continuation) throws Throwable {
                if (widgetLifeEvent == WidgetLifeEvent.ON_SHOW) {
                    this.f35713b.onShow();
                }
                if (widgetLifeEvent == WidgetLifeEvent.ON_HIDE) {
                    this.f35713b.onHide();
                }
                return Unit.INSTANCE;
            }
        }

        public C193021(Continuation<? super C193021> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BaseVM.this.new C193021(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super Unit> continuation) {
            return ((C193021) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC41634e lifecycleFLow = BaseVM.this.getLifecycleFLow();
                a aVar = new a(BaseVM.this);
                this.label = 1;
                if (lifecycleFLow.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.mvi.vm.BaseVM$launch$1 */
    /* JADX INFO: compiled from: BaseVM.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {1, 9, 0})
    @DebugMetadata(m90121c = "com.kubi.mvi.vm.BaseVM$launch$1", m90122f = "BaseVM.kt", m90123i = {}, m90124l = {47}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C193031 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<Continuation<? super Unit>, Object> $callback;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C193031(Function1<? super Continuation<? super Unit>, ? extends Object> function1, Continuation<? super C193031> continuation) {
            super(2, continuation);
            this.$callback = function1;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C193031(this.$callback, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super Unit> continuation) {
            return ((C193031) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                Function1<Continuation<? super Unit>, Object> function1 = this.$callback;
                this.label = 1;
                if (function1.invoke(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.mvi.vm.BaseVM$launchOnMain$1 */
    /* JADX INFO: compiled from: BaseVM.kt */
    /* JADX INFO: loaded from: classes29.dex */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {1, 9, 0})
    @DebugMetadata(m90121c = "com.kubi.mvi.vm.BaseVM$launchOnMain$1", m90122f = "BaseVM.kt", m90123i = {}, m90124l = {55}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C193041 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> $block;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C193041(Function2<? super InterfaceC41709m0, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super C193041> continuation) {
            super(2, continuation);
            this.$block = function2;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C193041 c193041 = new C193041(this.$block, continuation);
            c193041.L$0 = obj;
            return c193041;
        }

        @Override // p852kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super Unit> continuation) {
            return ((C193041) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
                Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> function2 = this.$block;
                this.label = 1;
                if (function2.invoke(interfaceC41709m0, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.mvi.vm.BaseVM$sendLifeEvent$1 */
    /* JADX INFO: compiled from: BaseVM.kt */
    @Metadata(m90083d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, m90084d2 = {"<anonymous>", ""}, m90085k = 3, m90086mv = {1, 9, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.mvi.vm.BaseVM$sendLifeEvent$1", m90122f = "BaseVM.kt", m90123i = {}, m90124l = {79}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C193051 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ WidgetLifeEvent $widgetLifeEvent;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C193051(WidgetLifeEvent widgetLifeEvent, Continuation<? super C193051> continuation) {
            super(1, continuation);
            this.$widgetLifeEvent = widgetLifeEvent;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return BaseVM.this.new C193051(this.$widgetLifeEvent, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@Nullable Continuation<? super Unit> continuation) {
            return ((C193051) create(continuation)).invokeSuspend(Unit.INSTANCE);
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
                if (ChannelResult.m90676i(BaseVM.this.lifeEventChannel.mo90594e(this.$widgetLifeEvent))) {
                    InterfaceC41565d interfaceC41565d = BaseVM.this.lifeEventChannel;
                    WidgetLifeEvent widgetLifeEvent = this.$widgetLifeEvent;
                    this.label = 1;
                    if (interfaceC41565d.send(widgetLifeEvent, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC41634e<WidgetLifeEvent> getLifecycleFLow() {
        return C41636g.m90936s(this.lifeEventChannel);
    }

    @Override // com.kubi.mvi.p102vm.InterfaceC19308c
    @NotNull
    public C19306a getWidgetLifecycle() {
        return this.widgetLifecycle;
    }

    @Deprecated(message = "废弃 用launchOnMain", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public final void launch(@NotNull Function1<? super Continuation<? super Unit>, ? extends Object> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C193031(callback, null), 3, null);
    }

    public final void launchOnMain(@NotNull Function2<? super InterfaceC41709m0, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C193041(block, null), 3, null);
    }

    public void onFirstShow() {
        C19243e.m42533b("VM:" + this + " onFirstShow");
    }

    public void onHide() {
        this.widgetLifecycle.m42730d();
        C19243e.m42533b("VM:" + this + " onHide");
    }

    public void onShow() throws Throwable {
        this.widgetLifecycle.m42731e();
        if (this.showCount.get() == 0) {
            onFirstShow();
        }
        this.showCount.incrementAndGet();
        C19243e.m42533b("VM:" + this + " onShow " + this.showCount.get());
    }

    public final void sendLifeEvent(@NotNull WidgetLifeEvent widgetLifeEvent) {
        Intrinsics.checkNotNullParameter(widgetLifeEvent, "widgetLifeEvent");
        launch(new C193051(widgetLifeEvent, null));
    }

    public BaseVM() {
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C193021(null), 3, null);
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        this.widgetLifecycle.m42728b();
        C19243e.m42533b("VM:" + this + " onCleared");
    }
}
