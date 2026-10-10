package com.kubi.kumex.record.currentDelegate.viewModel;

import androidx.lifecycle.MutableLiveData;
import com.kubi.broker.MultiBizFacadeManager;
import com.kubi.kumex.data.trade.model.OrderEntity;
import com.kubi.kumex.utils.CoroutineExKt;
import com.kubi.network.retrofit.utils.C19331c;
import com.kubi.sdk.PageEntity;
import com.kubi.utils.extensions.C27041f;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.InterfaceC41709m0;
import org.json.JSONException;
import p664ui.C45250e;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.functions.Function4;

/* JADX INFO: compiled from: DelegateHistViewModel.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.kumex.record.currentDelegate.viewModel.DelegateHistoryViewModel$revoke$2", m90122f = "DelegateHistViewModel.kt", m90123i = {}, m90124l = {373}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class DelegateHistoryViewModel$revoke$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $assetType;
    final /* synthetic */ long $curLastPage;
    final /* synthetic */ Function4<Long, String, String, Continuation<? super PageEntity<OrderEntity>>, Object> $lastPageOrdersFetcher;
    final /* synthetic */ OrderEntity $order;
    final /* synthetic */ String $symbol;
    int label;
    final /* synthetic */ DelegateHistoryViewModel this$0;

    /* JADX INFO: renamed from: com.kubi.kumex.record.currentDelegate.viewModel.DelegateHistoryViewModel$revoke$2$1 */
    /* JADX INFO: compiled from: DelegateHistViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.kumex.record.currentDelegate.viewModel.DelegateHistoryViewModel$revoke$2$1", m90122f = "DelegateHistViewModel.kt", m90123i = {}, m90124l = {396, 397}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C166241 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ String $assetType;
        final /* synthetic */ long $curLastPage;
        final /* synthetic */ Function4<Long, String, String, Continuation<? super PageEntity<OrderEntity>>, Object> $lastPageOrdersFetcher;
        final /* synthetic */ OrderEntity $order;
        final /* synthetic */ String $symbol;
        int label;
        final /* synthetic */ DelegateHistoryViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C166241(DelegateHistoryViewModel delegateHistoryViewModel, OrderEntity orderEntity, Function4<? super Long, ? super String, ? super String, ? super Continuation<? super PageEntity<OrderEntity>>, ? extends Object> function4, long j11, String str, String str2, Continuation<? super C166241> continuation) {
            super(1, continuation);
            this.this$0 = delegateHistoryViewModel;
            this.$order = orderEntity;
            this.$lastPageOrdersFetcher = function4;
            this.$curLastPage = j11;
            this.$assetType = str;
            this.$symbol = str2;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C166241(this.this$0, this.$order, this.$lastPageOrdersFetcher, this.$curLastPage, this.$assetType, this.$symbol, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C166241) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0073, code lost:
        
            if (r14 == r0) goto L19;
         */
        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws JSONException {
            PageEntity<OrderEntity> pageEntity;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            try {
                if (i11 != 0) {
                    if (i11 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    pageEntity = (PageEntity) obj;
                    this.this$0.m35539H(this.$curLastPage, this.$order.getId(), pageEntity != null ? this.this$0.m35561l0(pageEntity, this.$curLastPage) : null, pageEntity != null ? Boxing.boxBoolean(pageEntity.getHasNext()) : null);
                    this.this$0.f30066X.postValue(Boxing.boxBoolean(false));
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.f30066X.postValue(Boxing.boxBoolean(true));
                try {
                    MultiBizFacadeManager.m20260s(MultiBizFacadeManager.f19232a, null, 1, null).mo4507i1(this.$order.isTrialFunds(), this.$order.getSymbol(), C27041f.m66668h(this.$order.getId()));
                    C45250e.m100014c(C45250e.f101788a, "futures_order_revoke", null, 2, null);
                    this.label = 1;
                    if (DelayKt.m90350b(200L, this) == coroutine_suspended) {
                    }
                    return coroutine_suspended;
                } catch (Throwable th2) {
                    C19331c.m42836c(th2, null, 2, null);
                    C45250e.f101788a.m100016b("futures_order_revoke", th2);
                    throw th2;
                }
                Function4<Long, String, String, Continuation<? super PageEntity<OrderEntity>>, Object> function4 = this.$lastPageOrdersFetcher;
                Long lBoxLong = Boxing.boxLong(this.$curLastPage);
                String str = this.$assetType;
                String str2 = this.$symbol;
                this.label = 2;
                obj = function4.invoke(lBoxLong, str, str2, this);
            } catch (Throwable unused) {
                pageEntity = null;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DelegateHistoryViewModel$revoke$2(DelegateHistoryViewModel delegateHistoryViewModel, OrderEntity orderEntity, Function4<? super Long, ? super String, ? super String, ? super Continuation<? super PageEntity<OrderEntity>>, ? extends Object> function4, long j11, String str, String str2, Continuation<? super DelegateHistoryViewModel$revoke$2> continuation) {
        super(2, continuation);
        this.this$0 = delegateHistoryViewModel;
        this.$order = orderEntity;
        this.$lastPageOrdersFetcher = function4;
        this.$curLastPage = j11;
        this.$assetType = str;
        this.$symbol = str2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DelegateHistoryViewModel$revoke$2(this.this$0, this.$order, this.$lastPageOrdersFetcher, this.$curLastPage, this.$assetType, this.$symbol, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((DelegateHistoryViewModel$revoke$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m35571f(DelegateHistoryViewModel delegateHistoryViewModel, Throwable th2) {
        MutableLiveData mutableLiveData = delegateHistoryViewModel.f30066X;
        Boolean bool = Boolean.FALSE;
        mutableLiveData.postValue(bool);
        delegateHistoryViewModel.f30084p0.postValue(bool);
        return Unit.INSTANCE;
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
            C166241 c166241 = new C166241(this.this$0, this.$order, this.$lastPageOrdersFetcher, this.$curLastPage, this.$assetType, this.$symbol, null);
            final DelegateHistoryViewModel delegateHistoryViewModel = this.this$0;
            Function1 function1 = new Function1() { // from class: com.kubi.kumex.record.currentDelegate.viewModel.l
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return DelegateHistoryViewModel$revoke$2.m35571f(delegateHistoryViewModel, (Throwable) obj2);
                }
            };
            this.label = 1;
            if (CoroutineExKt.m36471a(c166241, function1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
