package com.kubi.assets.bill;

import com.kubi.assets.entity.AccountDetailEntity;
import com.kubi.sdk.base.entity.BaseEntity;
import com.kubi.sdk.base.entity.BasePageEntity;
import com.trtc.uikit.livekit.p180kc.data.entity.SharedPositionInfo;
import java.util.HashMap;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AccountBillRepository.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0004H\n"}, m90084d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/kubi/sdk/base/entity/BasePageEntity;", "Lcom/kubi/assets/entity/AccountDetailEntity;", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.bill.AccountBillRepository$getAccountDetailBillList$2", m90122f = "AccountBillRepository.kt", m90123i = {0, 0, 0, 0}, m90124l = {156}, m90125m = "invokeSuspend", m90126n = {"$this$withContext", "$this$invokeSuspend_u24lambda_u240", "requestParams", "$i$a$-runCatching-AccountBillRepository$getAccountDetailBillList$2$1"}, m90127s = {"L$0", "L$2", "L$3", "I$0"})
public final class AccountBillRepository$getAccountDetailBillList$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Result<? extends BasePageEntity<AccountDetailEntity>>>, Object> {
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
    public AccountBillRepository$getAccountDetailBillList$2(AccountBillRepository accountBillRepository, int i11, int i12, AccountBillFilterModel accountBillFilterModel, Continuation<? super AccountBillRepository$getAccountDetailBillList$2> continuation) {
        super(2, continuation);
        this.this$0 = accountBillRepository;
        this.$pageIndex = i11;
        this.$pageSize = i12;
        this.$filter = accountBillFilterModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AccountBillRepository$getAccountDetailBillList$2 accountBillRepository$getAccountDetailBillList$2 = new AccountBillRepository$getAccountDetailBillList$2(this.this$0, this.$pageIndex, this.$pageSize, this.$filter, continuation);
        accountBillRepository$getAccountDetailBillList$2.L$0 = obj;
        return accountBillRepository$getAccountDetailBillList$2;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Result<? extends BasePageEntity<AccountDetailEntity>>> continuation) {
        return ((AccountBillRepository$getAccountDetailBillList$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AccountBillRepository accountBillRepository;
        String str = "OPTION";
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        try {
            if (i11 == 0) {
                ResultKt.throwOnFailure(obj);
                AccountBillRepository accountBillRepository2 = this.this$0;
                int i12 = this.$pageIndex;
                int i13 = this.$pageSize;
                AccountBillFilterModel accountBillFilterModel = this.$filter;
                Result.Companion companion = Result.INSTANCE;
                HashMap<String, Object> mapM15641f = accountBillRepository2.m15641f(i12, i13, accountBillFilterModel);
                AccountBillApi accountBillApi = accountBillRepository2.f16654a;
                if (Intrinsics.areEqual(accountBillFilterModel.getAccountType(), SharedPositionInfo.MARGIN_MODE_ISOLATED)) {
                    str = SharedPositionInfo.MARGIN_MODE_ISOLATED;
                } else if (Intrinsics.areEqual(accountBillFilterModel.getAccountType(), "MARGIN")) {
                    str = "MARGIN";
                } else if (!Intrinsics.areEqual(accountBillFilterModel.getAccountType(), "OPTION")) {
                    str = Intrinsics.areEqual(accountBillFilterModel.getAccountType(), "MINING") ? "MINING_USER" : "";
                }
                this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
                this.L$1 = accountBillRepository2;
                this.L$2 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
                this.L$3 = SpillingKt.nullOutSpilledVariable(mapM15641f);
                this.I$0 = 0;
                this.label = 1;
                Object objM15801c = accountBillApi.m15801c(str, mapM15641f, this);
                if (objM15801c == coroutine_suspended) {
                    return coroutine_suspended;
                }
                accountBillRepository = accountBillRepository2;
                obj = objM15801c;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                accountBillRepository = (AccountBillRepository) this.L$1;
                ResultKt.throwOnFailure(obj);
            }
            BaseEntity baseEntity = (BaseEntity) obj;
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
