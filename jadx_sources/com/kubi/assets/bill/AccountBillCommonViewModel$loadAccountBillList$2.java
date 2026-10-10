package com.kubi.assets.bill;

import com.kubi.sdk.base.entity.BasePageEntity;
import com.kubi.utils.ToastCompat;
import java.util.Collection;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: AccountBillCommonViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.bill.AccountBillCommonViewModel$loadAccountBillList$2", m90122f = "AccountBillCommonViewModel.kt", m90123i = {0, 0}, m90124l = {91}, m90125m = "invokeSuspend", m90126n = {"currentFilter", "currentListState"}, m90127s = {"L$0", "L$1"})
@SourceDebugExtension({"SMAP\nAccountBillCommonViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountBillCommonViewModel.kt\ncom/kubi/assets/bill/AccountBillCommonViewModel$loadAccountBillList$2\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,291:1\n230#2,5:292\n*S KotlinDebug\n*F\n+ 1 AccountBillCommonViewModel.kt\ncom/kubi/assets/bill/AccountBillCommonViewModel$loadAccountBillList$2\n*L\n102#1:292,5\n*E\n"})
public final class AccountBillCommonViewModel$loadAccountBillList$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isLoadMore;
    final /* synthetic */ int $pageIndex;
    final /* synthetic */ boolean $refresh;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ AccountBillCommonViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountBillCommonViewModel$loadAccountBillList$2(AccountBillCommonViewModel accountBillCommonViewModel, boolean z11, boolean z12, int i11, Continuation<? super AccountBillCommonViewModel$loadAccountBillList$2> continuation) {
        super(2, continuation);
        this.this$0 = accountBillCommonViewModel;
        this.$refresh = z11;
        this.$isLoadMore = z12;
        this.$pageIndex = i11;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AccountBillCommonViewModel$loadAccountBillList$2(this.this$0, this.$refresh, this.$isLoadMore, this.$pageIndex, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((AccountBillCommonViewModel$loadAccountBillList$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        LoadingState loadingState;
        Object objM15643h;
        AccountBillListState accountBillListState;
        List listPlus;
        Object value;
        AccountBillListState accountBillListState2;
        int size;
        boolean zIsHasNext;
        int currentPage;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    accountBillListState = (AccountBillListState) this.L$1;
                    ResultKt.throwOnFailure(obj);
                    objM15643h = ((Result) obj).getValue();
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                InterfaceC41669n interfaceC41669n = this.this$0.f16637c0;
                if (this.$refresh) {
                    loadingState = LoadingState.REFRESHING;
                } else if (this.$isLoadMore) {
                    loadingState = LoadingState.LOADING_MORE;
                } else {
                    loadingState = LoadingState.LOADING;
                }
                interfaceC41669n.setValue(loadingState);
                AccountBillFilterModel accountBillFilterModel = (AccountBillFilterModel) this.this$0.f16633Y.getValue();
                AccountBillListState accountBillListState3 = (AccountBillListState) this.this$0.f16635a0.getValue();
                AccountBillRepository accountBillRepository = this.this$0.f16632X;
                int i12 = this.$pageIndex;
                this.L$0 = SpillingKt.nullOutSpilledVariable(accountBillFilterModel);
                this.L$1 = accountBillListState3;
                this.label = 1;
                objM15643h = accountBillRepository.m15643h(accountBillFilterModel, i12, 20, this);
                if (objM15643h == coroutine_suspended) {
                    return coroutine_suspended;
                }
                accountBillListState = accountBillListState3;
            }
            boolean z11 = this.$refresh;
            AccountBillCommonViewModel accountBillCommonViewModel = this.this$0;
            Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM15643h);
            if (thM103847exceptionOrNullimpl == null) {
                BasePageEntity basePageEntity = (BasePageEntity) objM15643h;
                if (z11) {
                    listPlus = basePageEntity.getItems();
                } else {
                    List listM15817d = accountBillListState.m15817d();
                    List items = basePageEntity.getItems();
                    Intrinsics.checkNotNullExpressionValue(items, "getItems(...)");
                    listPlus = CollectionsKt.plus((Collection) listM15817d, (Iterable) items);
                }
                InterfaceC41669n interfaceC41669n2 = accountBillCommonViewModel.f16635a0;
                do {
                    value = interfaceC41669n2.getValue();
                    accountBillListState2 = (AccountBillListState) value;
                    Intrinsics.checkNotNull(listPlus);
                    size = listPlus.size();
                    zIsHasNext = basePageEntity.isHasNext();
                    if (z11) {
                        currentPage = 1;
                    } else {
                        currentPage = accountBillListState2.getCurrentPage() + 1;
                    }
                } while (!interfaceC41669n2.compareAndSet(value, accountBillListState2.m15815a(listPlus, size, zIsHasNext, currentPage)));
                accountBillCommonViewModel.f16637c0.setValue(LoadingState.IDLE);
            } else {
                ToastCompat.m66441G(thM103847exceptionOrNullimpl.getMessage(), new Object[0]);
                accountBillCommonViewModel.f16637c0.setValue(LoadingState.IDLE);
            }
        } catch (Exception e11) {
            ToastCompat.m66441G(e11.getMessage(), new Object[0]);
            this.this$0.f16637c0.setValue(LoadingState.IDLE);
        }
        return Unit.INSTANCE;
    }
}
