package com.kubi.kumex.record.currentDelegate.viewModel;

import androidx.lifecycle.MutableLiveData;
import com.kubi.broker.MultiBizFacadeManager;
import com.kubi.kumex.data.trade.model.OrderEntity;
import com.kubi.kumex.utils.CoroutineExKt;
import com.kubi.sdk.PageEntity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.InterfaceC41709m0;
import p595rg.InterfaceC44081i;
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

/* JADX INFO: compiled from: DelegateHistViewModel.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.kumex.record.currentDelegate.viewModel.DelegateHistoryViewModel$fetchAdvancedOrders$1", m90122f = "DelegateHistViewModel.kt", m90123i = {}, m90124l = {103}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class DelegateHistoryViewModel$fetchAdvancedOrders$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $assetType;
    final /* synthetic */ long $currentPage;
    final /* synthetic */ String $symbol;
    int label;
    final /* synthetic */ DelegateHistoryViewModel this$0;

    /* JADX INFO: renamed from: com.kubi.kumex.record.currentDelegate.viewModel.DelegateHistoryViewModel$fetchAdvancedOrders$1$1 */
    /* JADX INFO: compiled from: DelegateHistViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.kumex.record.currentDelegate.viewModel.DelegateHistoryViewModel$fetchAdvancedOrders$1$1", m90122f = "DelegateHistViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C166211 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ String $assetType;
        final /* synthetic */ long $currentPage;
        final /* synthetic */ String $symbol;
        int label;
        final /* synthetic */ DelegateHistoryViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C166211(DelegateHistoryViewModel delegateHistoryViewModel, long j11, String str, String str2, Continuation<? super C166211> continuation) {
            super(1, continuation);
            this.this$0 = delegateHistoryViewModel;
            this.$currentPage = j11;
            this.$assetType = str;
            this.$symbol = str2;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C166211(this.this$0, this.$currentPage, this.$assetType, this.$symbol, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C166211) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean hasNext;
            List<OrderEntity> items;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                InterfaceC44081i interfaceC44081iM20260s = MultiBizFacadeManager.m20260s(MultiBizFacadeManager.f19232a, null, 1, null);
                HashMap map = new HashMap();
                long j11 = this.$currentPage;
                String str = this.$assetType;
                String str2 = this.$symbol;
                map.put("currentPage", String.valueOf(j11));
                map.put("pageSize", "50");
                map.put("fundsType", str);
                if (str2 != null && str2.length() != 0) {
                    map.put("symbol", str2);
                }
                PageEntity<OrderEntity> pageEntityMo4504g = interfaceC44081iM20260s.mo4504g(map);
                if (pageEntityMo4504g == null || (items = pageEntityMo4504g.getItems()) == null || items.isEmpty()) {
                    this.this$0.m35558c0(this.$currentPage);
                    if (this.this$0.m35552W(this.$currentPage)) {
                        DelegateHistoryViewModel delegateHistoryViewModel = this.this$0;
                        long j12 = this.$currentPage;
                        ArrayList arrayList = new ArrayList();
                        if (pageEntityMo4504g != null) {
                            hasNext = pageEntityMo4504g.getHasNext();
                        } else {
                            hasNext = false;
                        }
                        delegateHistoryViewModel.m35540J(j12, arrayList, hasNext);
                    } else {
                        this.this$0.f30072d0.postValue(Boxing.boxBoolean(true));
                    }
                } else {
                    this.this$0.m35558c0(this.$currentPage);
                    DelegateHistoryViewModel delegateHistoryViewModel2 = this.this$0;
                    long j13 = this.$currentPage;
                    delegateHistoryViewModel2.m35540J(j13, delegateHistoryViewModel2.m35561l0(pageEntityMo4504g, j13), pageEntityMo4504g.getHasNext());
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DelegateHistoryViewModel$fetchAdvancedOrders$1(DelegateHistoryViewModel delegateHistoryViewModel, long j11, String str, String str2, Continuation<? super DelegateHistoryViewModel$fetchAdvancedOrders$1> continuation) {
        super(2, continuation);
        this.this$0 = delegateHistoryViewModel;
        this.$currentPage = j11;
        this.$assetType = str;
        this.$symbol = str2;
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m35565f(DelegateHistoryViewModel delegateHistoryViewModel, long j11, Throwable th2) {
        if (th2 instanceof CancellationException) {
            return Unit.INSTANCE;
        }
        if (delegateHistoryViewModel.m35552W(j11)) {
            MutableLiveData mutableLiveData = delegateHistoryViewModel.f30082n0;
            Boolean bool = Boolean.TRUE;
            mutableLiveData.postValue(bool);
            delegateHistoryViewModel.f30076h0.postValue(bool);
        } else {
            delegateHistoryViewModel.f30082n0.postValue(Boolean.FALSE);
            delegateHistoryViewModel.f30078j0.postValue(Boolean.TRUE);
        }
        return Unit.INSTANCE;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DelegateHistoryViewModel$fetchAdvancedOrders$1(this.this$0, this.$currentPage, this.$assetType, this.$symbol, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((DelegateHistoryViewModel$fetchAdvancedOrders$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            C166211 c166211 = new C166211(this.this$0, this.$currentPage, this.$assetType, this.$symbol, null);
            final DelegateHistoryViewModel delegateHistoryViewModel = this.this$0;
            final long j11 = this.$currentPage;
            Function1 function1 = new Function1() { // from class: com.kubi.kumex.record.currentDelegate.viewModel.i
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return DelegateHistoryViewModel$fetchAdvancedOrders$1.m35565f(delegateHistoryViewModel, j11, (Throwable) obj2);
                }
            };
            this.label = 1;
            if (CoroutineExKt.m36471a(c166211, function1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
