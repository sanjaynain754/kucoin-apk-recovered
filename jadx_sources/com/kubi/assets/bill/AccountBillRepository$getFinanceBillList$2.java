package com.kubi.assets.bill;

import com.kubi.assets.entity.FinanceBillItemEntity;
import com.kubi.sdk.base.entity.BaseEntity;
import com.kubi.sdk.base.entity.BasePageEntity;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: AccountBillRepository.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00020\u0001*\u00020\u0005H\n"}, m90084d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/kubi/sdk/base/entity/BasePageEntity;", "Lcom/kubi/assets/entity/FinanceBillItemEntity;", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.bill.AccountBillRepository$getFinanceBillList$2", m90122f = "AccountBillRepository.kt", m90123i = {0, 0, 0, 0}, m90124l = {240}, m90125m = "invokeSuspend", m90126n = {"$this$withContext", "$this$invokeSuspend_u24lambda_u240", "time", "$i$a$-runCatching-AccountBillRepository$getFinanceBillList$2$1"}, m90127s = {"L$0", "L$2", "L$3", "I$0"})
public final class AccountBillRepository$getFinanceBillList$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Result<? extends BasePageEntity<FinanceBillItemEntity>>>, Object> {
    final /* synthetic */ AccountBillFilterModel $filter;
    final /* synthetic */ int $pageIndex;
    final /* synthetic */ int $pageSize;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ AccountBillRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountBillRepository$getFinanceBillList$2(AccountBillRepository accountBillRepository, AccountBillFilterModel accountBillFilterModel, int i11, int i12, Continuation<? super AccountBillRepository$getFinanceBillList$2> continuation) {
        super(2, continuation);
        this.this$0 = accountBillRepository;
        this.$filter = accountBillFilterModel;
        this.$pageIndex = i11;
        this.$pageSize = i12;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AccountBillRepository$getFinanceBillList$2 accountBillRepository$getFinanceBillList$2 = new AccountBillRepository$getFinanceBillList$2(this.this$0, this.$filter, this.$pageIndex, this.$pageSize, continuation);
        accountBillRepository$getFinanceBillList$2.L$0 = obj;
        return accountBillRepository$getFinanceBillList$2;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Result<? extends BasePageEntity<FinanceBillItemEntity>>> continuation) {
        return ((AccountBillRepository$getFinanceBillList$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AccountBillRepository accountBillRepository;
        Object objM15807i;
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        try {
            if (i11 == 0) {
                ResultKt.throwOnFailure(obj);
                accountBillRepository = this.this$0;
                AccountBillFilterModel accountBillFilterModel = this.$filter;
                int i12 = this.$pageIndex;
                int i13 = this.$pageSize;
                Result.Companion companion = Result.INSTANCE;
                Pair pairM15642g = accountBillRepository.m15642g(accountBillFilterModel.getTime());
                AccountBillApi accountBillApi = accountBillRepository.f16654a;
                String productCategory = accountBillFilterModel.getProductCategory();
                String currency = accountBillFilterModel.getCurrency();
                String bizType = accountBillFilterModel.getBizType();
                String direction = accountBillFilterModel.getDirection();
                Integer numBoxInt = Boxing.boxInt(i12);
                Integer numBoxInt2 = Boxing.boxInt(i13);
                Long l11 = (Long) pairM15642g.getFirst();
                Long l12 = (Long) pairM15642g.getSecond();
                this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
                this.L$1 = accountBillRepository;
                this.L$2 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
                this.L$3 = SpillingKt.nullOutSpilledVariable(pairM15642g);
                this.I$0 = 0;
                this.label = 1;
                objM15807i = accountBillApi.m15807i(productCategory, currency, bizType, direction, numBoxInt, numBoxInt2, l11, l12, this);
                if (objM15807i == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AccountBillRepository accountBillRepository2 = (AccountBillRepository) this.L$1;
                ResultKt.throwOnFailure(obj);
                accountBillRepository = accountBillRepository2;
                objM15807i = obj;
            }
            BaseEntity baseEntity = (BaseEntity) objM15807i;
            if (baseEntity.getSuccess()) {
                Result.Companion companion2 = Result.INSTANCE;
                return Result.m103843boximpl(Result.m103844constructorimpl(baseEntity.getData()));
            }
            Result.Companion companion3 = Result.INSTANCE;
            String msg = baseEntity.getMsg();
            if (msg == null) {
                msg = accountBillRepository.m15651p();
            }
            return Result.m103843boximpl(Result.m103844constructorimpl(ResultKt.createFailure(new Exception(msg))));
        } catch (Throwable th2) {
            Result.Companion companion4 = Result.INSTANCE;
            Object objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            AccountBillRepository accountBillRepository3 = this.this$0;
            Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
            if (thM103847exceptionOrNullimpl == null) {
                return Result.m103843boximpl(objM103844constructorimpl);
            }
            String message = thM103847exceptionOrNullimpl.getMessage();
            if (message == null) {
                message = accountBillRepository3.m15651p();
            }
            return Result.m103843boximpl(Result.m103844constructorimpl(ResultKt.createFailure(new Exception(message))));
        }
    }
}
