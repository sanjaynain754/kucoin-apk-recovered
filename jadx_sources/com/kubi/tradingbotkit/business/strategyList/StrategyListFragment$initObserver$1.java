package com.kubi.tradingbotkit.business.strategyList;

import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.kubi.sdk.BaseFragment;
import com.kubi.tradingbotkit.service.TradingBotKitDepend;
import i50.UiStates;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41635f;
import kotlinx.coroutines.flow.InterfaceC41678w;
import p852kotlin.KotlinNothingValueException;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: StrategyListFragment.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.tradingbotkit.business.strategyList.StrategyListFragment$initObserver$1", m90122f = "StrategyListFragment.kt", m90123i = {}, m90124l = {163}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class StrategyListFragment$initObserver$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ StrategyListFragment this$0;

    /* JADX INFO: renamed from: com.kubi.tradingbotkit.business.strategyList.StrategyListFragment$initObserver$1$1 */
    /* JADX INFO: compiled from: StrategyListFragment.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.tradingbotkit.business.strategyList.StrategyListFragment$initObserver$1$1", m90122f = "StrategyListFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C261851 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ StrategyListFragment this$0;

        /* JADX INFO: renamed from: com.kubi.tradingbotkit.business.strategyList.StrategyListFragment$initObserver$1$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: StrategyListFragment.kt */
        @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        @DebugMetadata(m90121c = "com.kubi.tradingbotkit.business.strategyList.StrategyListFragment$initObserver$1$1$1", m90122f = "StrategyListFragment.kt", m90123i = {}, m90124l = {165}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ StrategyListFragment this$0;

            /* JADX INFO: renamed from: com.kubi.tradingbotkit.business.strategyList.StrategyListFragment$initObserver$1$1$1$a */
            /* JADX INFO: compiled from: StrategyListFragment.kt */
            @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
            public static final class a<T> implements InterfaceC41635f {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ StrategyListFragment f52419b;

                public a(StrategyListFragment strategyListFragment) {
                    this.f52419b = strategyListFragment;
                }

                /* JADX INFO: renamed from: f */
                public static final void m64125f(StrategyListFragment strategyListFragment, View view) {
                    strategyListFragment.m64117G3().m64154w();
                }

                @Override // kotlinx.coroutines.flow.InterfaceC41635f
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public final Object emit(UiStates uiStates, Continuation<? super Unit> continuation) {
                    if (!TradingBotKitDepend.m64273f().c()) {
                        this.f52419b.m64123T3();
                    } else if (uiStates.getLoading()) {
                        BaseFragment.showLoadingView$default(this.f52419b, 0, 0, 3, null);
                    } else if (uiStates.getLoadingFailed()) {
                        final StrategyListFragment strategyListFragment = this.f52419b;
                        BaseFragment.showFailView$default(strategyListFragment, 0, 0, new View.OnClickListener() { // from class: com.kubi.tradingbotkit.business.strategyList.n
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                StrategyListFragment$initObserver$1.C261851.AnonymousClass1.a.m64125f(strategyListFragment, view);
                            }
                        }, 3, (Object) null);
                    } else {
                        this.f52419b.showContentView();
                        this.f52419b.m64120Q3(uiStates.m86706g());
                        StrategyAdapter strategyAdapter = this.f52419b.f52413V;
                        if (strategyAdapter != null) {
                            strategyAdapter.setNewData(uiStates.m86705f());
                        }
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(StrategyListFragment strategyListFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = strategyListFragment;
            }

            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.label;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                } else {
                    ResultKt.throwOnFailure(obj);
                    InterfaceC41678w<UiStates> interfaceC41678wM64148F = this.this$0.m64117G3().m64148F();
                    a aVar = new a(this.this$0);
                    this.label = 1;
                    if (interfaceC41678wM64148F.collect(aVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                throw new KotlinNothingValueException();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C261851(StrategyListFragment strategyListFragment, Continuation<? super C261851> continuation) {
            super(2, continuation);
            this.this$0 = strategyListFragment;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C261851 c261851 = new C261851(this.this$0, continuation);
            c261851.L$0 = obj;
            return c261851;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C261851) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C41696j.m91104d(interfaceC41709m0, null, null, new AnonymousClass1(this.this$0, null), 3, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StrategyListFragment$initObserver$1(StrategyListFragment strategyListFragment, Continuation<? super StrategyListFragment$initObserver$1> continuation) {
        super(2, continuation);
        this.this$0 = strategyListFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new StrategyListFragment$initObserver$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((StrategyListFragment$initObserver$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            StrategyListFragment strategyListFragment = this.this$0;
            Lifecycle.State state = Lifecycle.State.STARTED;
            C261851 c261851 = new C261851(strategyListFragment, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(strategyListFragment, state, c261851, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
