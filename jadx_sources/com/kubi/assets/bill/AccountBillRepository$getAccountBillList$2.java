package com.kubi.assets.bill;

import com.kubi.sdk.base.entity.BasePageEntity;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: AccountBillRepository.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00020\u0001*\u00020\u0004H\n"}, m90084d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/kubi/sdk/base/entity/BasePageEntity;", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.bill.AccountBillRepository$getAccountBillList$2", m90122f = "AccountBillRepository.kt", m90123i = {}, m90124l = {30, 34, 38, 42, 46}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class AccountBillRepository$getAccountBillList$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Result<? extends BasePageEntity<? extends Object>>>, Object> {
    final /* synthetic */ AccountBillFilterModel $filter;
    final /* synthetic */ int $pageIndex;
    final /* synthetic */ int $pageSize;
    int label;
    final /* synthetic */ AccountBillRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountBillRepository$getAccountBillList$2(AccountBillFilterModel accountBillFilterModel, AccountBillRepository accountBillRepository, int i11, int i12, Continuation<? super AccountBillRepository$getAccountBillList$2> continuation) {
        super(2, continuation);
        this.$filter = accountBillFilterModel;
        this.this$0 = accountBillRepository;
        this.$pageIndex = i11;
        this.$pageSize = i12;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AccountBillRepository$getAccountBillList$2(this.$filter, this.this$0, this.$pageIndex, this.$pageSize, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Result<? extends BasePageEntity<? extends Object>>> continuation) {
        return ((AccountBillRepository$getAccountBillList$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:54:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e0  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0061, code lost:
    
        if (r8 == r0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007d, code lost:
    
        if (r8 == r0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0097, code lost:
    
        if (r8 == r0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b1, code lost:
    
        if (r8 == r0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00dd, code lost:
    
        if (r8 == r0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00df, code lost:
    
        return r0;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objM103844constructorimpl;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1 && i11 != 2 && i11 != 3 && i11 != 4 && i11 != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objM103844constructorimpl = ((Result) obj).getValue();
        } else {
            ResultKt.throwOnFailure(obj);
            String accountType = this.$filter.getAccountType();
            if (accountType != null) {
                switch (accountType) {
                    case "MARGIN":
                    case "MINING":
                    case "OPTION":
                        AccountBillRepository accountBillRepository = this.this$0;
                        AccountBillFilterModel accountBillFilterModel = this.$filter;
                        int i12 = this.$pageIndex;
                        int i13 = this.$pageSize;
                        this.label = 3;
                        objM103844constructorimpl = accountBillRepository.m15644i(accountBillFilterModel, i12, i13, this);
                        break;
                    case "FINANCE":
                        AccountBillRepository accountBillRepository2 = this.this$0;
                        AccountBillFilterModel accountBillFilterModel2 = this.$filter;
                        int i14 = this.$pageIndex;
                        int i15 = this.$pageSize;
                        this.label = 5;
                        objM103844constructorimpl = accountBillRepository2.m15646k(accountBillFilterModel2, i14, i15, this);
                        break;
                    case "MAIN":
                        AccountBillRepository accountBillRepository3 = this.this$0;
                        AccountBillFilterModel accountBillFilterModel3 = this.$filter;
                        int i16 = this.$pageIndex;
                        int i17 = this.$pageSize;
                        this.label = 1;
                        objM103844constructorimpl = accountBillRepository3.m15650o(accountBillFilterModel3, i16, i17, this);
                        break;
                    case "TRADE":
                        AccountBillRepository accountBillRepository4 = this.this$0;
                        AccountBillFilterModel accountBillFilterModel4 = this.$filter;
                        int i18 = this.$pageIndex;
                        int i19 = this.$pageSize;
                        this.label = 2;
                        objM103844constructorimpl = accountBillRepository4.m15652q(accountBillFilterModel4, i18, i19, this);
                        break;
                    case "CONTRACT":
                        AccountBillRepository accountBillRepository5 = this.this$0;
                        AccountBillFilterModel accountBillFilterModel5 = this.$filter;
                        int i21 = this.$pageIndex;
                        int i22 = this.$pageSize;
                        this.label = 4;
                        objM103844constructorimpl = accountBillRepository5.m15648m(accountBillFilterModel5, i21, i22, this);
                        break;
                    case "ISOLATED":
                        AccountBillRepository accountBillRepository6 = this.this$0;
                        AccountBillFilterModel accountBillFilterModel6 = this.$filter;
                        int i110 = this.$pageIndex;
                        int i111 = this.$pageSize;
                        this.label = 3;
                        objM103844constructorimpl = accountBillRepository6.m15644i(accountBillFilterModel6, i110, i111, this);
                        break;
                    default:
                        Result.Companion companion = Result.INSTANCE;
                        objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(new Exception(this.this$0.m15651p())));
                        break;
                }
            } else {
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(new Exception(this.this$0.m15651p())));
            }
        }
        return Result.m103843boximpl(objM103844constructorimpl);
    }
}
