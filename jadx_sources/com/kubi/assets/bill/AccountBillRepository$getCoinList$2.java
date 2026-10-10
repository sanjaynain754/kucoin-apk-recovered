package com.kubi.assets.bill;

import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.sdk.base.entity.BaseEntity;
import java.util.ArrayList;
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

/* JADX INFO: compiled from: AccountBillRepository.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u00040\u0001*\u00020\u0005H\n"}, m90084d2 = {"<anonymous>", "Lkotlin/Result;", "Ljava/util/ArrayList;", "Lcom/kubi/data/entity/CoinInfoEntity;", "Lkotlin/collections/ArrayList;", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.bill.AccountBillRepository$getCoinList$2", m90122f = "AccountBillRepository.kt", m90123i = {0, 0, 0}, m90124l = {296}, m90125m = "invokeSuspend", m90126n = {"$this$withContext", "$this$invokeSuspend_u24lambda_u240", "$i$a$-runCatching-AccountBillRepository$getCoinList$2$1"}, m90127s = {"L$0", "L$1", "I$0"})
public final class AccountBillRepository$getCoinList$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Result<? extends ArrayList<CoinInfoEntity>>>, Object> {
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ AccountBillRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountBillRepository$getCoinList$2(AccountBillRepository accountBillRepository, Continuation<? super AccountBillRepository$getCoinList$2> continuation) {
        super(2, continuation);
        this.this$0 = accountBillRepository;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AccountBillRepository$getCoinList$2 accountBillRepository$getCoinList$2 = new AccountBillRepository$getCoinList$2(this.this$0, continuation);
        accountBillRepository$getCoinList$2.L$0 = obj;
        return accountBillRepository$getCoinList$2;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Result<? extends ArrayList<CoinInfoEntity>>> continuation) {
        return ((AccountBillRepository$getCoinList$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM103844constructorimpl;
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        try {
            if (i11 == 0) {
                ResultKt.throwOnFailure(obj);
                AccountBillRepository accountBillRepository = this.this$0;
                Result.Companion companion = Result.INSTANCE;
                AccountBillApi accountBillApi = accountBillRepository.f16654a;
                this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
                this.L$1 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
                this.I$0 = 0;
                this.label = 1;
                obj = accountBillApi.m15805g(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            objM103844constructorimpl = Result.m103844constructorimpl((ArrayList) ((BaseEntity) obj).getData());
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        return Result.m103843boximpl(objM103844constructorimpl);
    }
}
