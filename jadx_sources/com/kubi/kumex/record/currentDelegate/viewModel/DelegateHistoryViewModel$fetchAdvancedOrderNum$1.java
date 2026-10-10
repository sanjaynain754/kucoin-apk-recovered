package com.kubi.kumex.record.currentDelegate.viewModel;

import com.kubi.broker.MultiBizFacadeManager;
import com.kubi.kumex.data.trade.model.OrderEntity;
import com.kubi.kumex.utils.CoroutineExKt;
import com.kubi.sdk.PageEntity;
import java.util.HashMap;
import kotlinx.coroutines.InterfaceC41709m0;
import p595rg.InterfaceC44081i;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: DelegateHistViewModel.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.kumex.record.currentDelegate.viewModel.DelegateHistoryViewModel$fetchAdvancedOrderNum$1", m90122f = "DelegateHistViewModel.kt", m90123i = {}, m90124l = {221}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class DelegateHistoryViewModel$fetchAdvancedOrderNum$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $assetType;
    final /* synthetic */ Function0<String> $curFundsTypeGetter;
    final /* synthetic */ String $symbol;
    int label;
    final /* synthetic */ DelegateHistoryViewModel this$0;

    /* JADX INFO: renamed from: com.kubi.kumex.record.currentDelegate.viewModel.DelegateHistoryViewModel$fetchAdvancedOrderNum$1$1 */
    /* JADX INFO: compiled from: DelegateHistViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.kumex.record.currentDelegate.viewModel.DelegateHistoryViewModel$fetchAdvancedOrderNum$1$1", m90122f = "DelegateHistViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C166201 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ String $assetType;
        final /* synthetic */ Function0<String> $curFundsTypeGetter;
        final /* synthetic */ String $symbol;
        int label;
        final /* synthetic */ DelegateHistoryViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C166201(DelegateHistoryViewModel delegateHistoryViewModel, String str, Function0<String> function0, String str2, Continuation<? super C166201> continuation) {
            super(1, continuation);
            this.this$0 = delegateHistoryViewModel;
            this.$assetType = str;
            this.$curFundsTypeGetter = function0;
            this.$symbol = str2;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C166201(this.this$0, this.$assetType, this.$curFundsTypeGetter, this.$symbol, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C166201) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                Long totalNum = null;
                InterfaceC44081i interfaceC44081iM20260s = MultiBizFacadeManager.m20260s(MultiBizFacadeManager.f19232a, null, 1, null);
                HashMap map = new HashMap();
                String str = this.$assetType;
                String str2 = this.$symbol;
                map.put("currentPage", "1");
                map.put("pageSize", "1");
                map.put("fundsType", str);
                if (str2 != null && str2.length() != 0) {
                    map.put("symbol", str2);
                }
                PageEntity<OrderEntity> pageEntityMo4504g = interfaceC44081iM20260s.mo4504g(map);
                DelegateHistoryViewModel delegateHistoryViewModel = this.this$0;
                String str3 = this.$assetType;
                if (pageEntityMo4504g != null) {
                    totalNum = pageEntityMo4504g.getTotalNum();
                }
                delegateHistoryViewModel.m35550U(str3, totalNum, this.$curFundsTypeGetter);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m35563f(DelegateHistoryViewModel delegateHistoryViewModel, String str, Function0 function0, Throwable th2) {
        delegateHistoryViewModel.m35550U(str, null, function0);
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DelegateHistoryViewModel$fetchAdvancedOrderNum$1(DelegateHistoryViewModel delegateHistoryViewModel, String str, Function0<String> function0, String str2, Continuation<? super DelegateHistoryViewModel$fetchAdvancedOrderNum$1> continuation) {
        super(2, continuation);
        this.this$0 = delegateHistoryViewModel;
        this.$assetType = str;
        this.$curFundsTypeGetter = function0;
        this.$symbol = str2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DelegateHistoryViewModel$fetchAdvancedOrderNum$1(this.this$0, this.$assetType, this.$curFundsTypeGetter, this.$symbol, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((DelegateHistoryViewModel$fetchAdvancedOrderNum$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            C166201 c166201 = new C166201(this.this$0, this.$assetType, this.$curFundsTypeGetter, this.$symbol, null);
            final DelegateHistoryViewModel delegateHistoryViewModel = this.this$0;
            final String str = this.$assetType;
            final Function0<String> function0 = this.$curFundsTypeGetter;
            Function1 function1 = new Function1() { // from class: com.kubi.kumex.record.currentDelegate.viewModel.h
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return DelegateHistoryViewModel$fetchAdvancedOrderNum$1.m35563f(delegateHistoryViewModel, str, function0, (Throwable) obj2);
                }
            };
            this.label = 1;
            if (CoroutineExKt.m36471a(c166201, function1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
