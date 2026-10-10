package com.kubi.futures.settings.vm;

import com.kubi.broker.MultiBizFacadeManager;
import com.kubi.kumex.data.trade.model.PositionOrderHoldMarginEntity;
import com.kubi.kumex.utils.CoroutineExKt;
import com.kubi.network.retrofit.utils.C19331c;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import sg.InterfaceC44404a;

/* JADX INFO: compiled from: CrossLeverageSettingViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.futures.settings.vm.CrossLeverageSettingViewModel$fetchUnifyPosOrderMargin$1", m90122f = "CrossLeverageSettingViewModel.kt", m90123i = {}, m90124l = {101}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class CrossLeverageSettingViewModel$fetchUnifyPosOrderMargin$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $symbol;
    int label;
    final /* synthetic */ CrossLeverageSettingViewModel this$0;

    /* JADX INFO: renamed from: com.kubi.futures.settings.vm.CrossLeverageSettingViewModel$fetchUnifyPosOrderMargin$1$1 */
    /* JADX INFO: compiled from: CrossLeverageSettingViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.futures.settings.vm.CrossLeverageSettingViewModel$fetchUnifyPosOrderMargin$1$1", m90122f = "CrossLeverageSettingViewModel.kt", m90123i = {}, m90124l = {103}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C135021 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ String $symbol;
        int label;
        final /* synthetic */ CrossLeverageSettingViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C135021(String str, CrossLeverageSettingViewModel crossLeverageSettingViewModel, Continuation<? super C135021> continuation) {
            super(1, continuation);
            this.$symbol = str;
            this.this$0 = crossLeverageSettingViewModel;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C135021(this.$symbol, this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C135021) create(continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC44404a interfaceC44404aM20256j = MultiBizFacadeManager.m20256j(MultiBizFacadeManager.f19232a, null, 1, null);
                String str = this.$symbol;
                this.label = 1;
                obj = interfaceC44404aM20256j.mo24477L(str, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            PositionOrderHoldMarginEntity positionOrderHoldMarginEntity = (PositionOrderHoldMarginEntity) obj;
            if (positionOrderHoldMarginEntity != null) {
                this.this$0.mo26360D().postValue(positionOrderHoldMarginEntity.getPosOrderValue());
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m26368f(Throwable th2) {
        C19331c.m42836c(th2, null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CrossLeverageSettingViewModel$fetchUnifyPosOrderMargin$1(String str, CrossLeverageSettingViewModel crossLeverageSettingViewModel, Continuation<? super CrossLeverageSettingViewModel$fetchUnifyPosOrderMargin$1> continuation) {
        super(2, continuation);
        this.$symbol = str;
        this.this$0 = crossLeverageSettingViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CrossLeverageSettingViewModel$fetchUnifyPosOrderMargin$1(this.$symbol, this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((CrossLeverageSettingViewModel$fetchUnifyPosOrderMargin$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            C135021 c135021 = new C135021(this.$symbol, this.this$0, null);
            Function1 function1 = new Function1() { // from class: com.kubi.futures.settings.vm.b
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return CrossLeverageSettingViewModel$fetchUnifyPosOrderMargin$1.m26368f((Throwable) obj2);
                }
            };
            this.label = 1;
            if (CoroutineExKt.m36471a(c135021, function1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
