package com.kubi.assets.bill;

import com.kubi.assets.entity.FinanceBillBizType;
import com.kubi.assets.entity.FinanceBillOptionsEntity;
import com.kubi.assets.entity.FinanceBillProductCategory;
import java.util.LinkedHashMap;
import java.util.List;
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

/* JADX INFO: compiled from: AccountBillCommonViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.bill.AccountBillCommonViewModel$loadFinanceOptions$1", m90122f = "AccountBillCommonViewModel.kt", m90123i = {}, m90124l = {159}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class AccountBillCommonViewModel$loadFinanceOptions$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<List<FinanceBillBizType>, List<FinanceBillProductCategory>, Unit> $callback;
    final /* synthetic */ String $typeKey;
    int label;
    final /* synthetic */ AccountBillCommonViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AccountBillCommonViewModel$loadFinanceOptions$1(String str, Function2<? super List<FinanceBillBizType>, ? super List<FinanceBillProductCategory>, Unit> function2, AccountBillCommonViewModel accountBillCommonViewModel, Continuation<? super AccountBillCommonViewModel$loadFinanceOptions$1> continuation) {
        super(2, continuation);
        this.$typeKey = str;
        this.$callback = function2;
        this.this$0 = accountBillCommonViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AccountBillCommonViewModel$loadFinanceOptions$1(this.$typeKey, this.$callback, this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((AccountBillCommonViewModel$loadFinanceOptions$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM15647l;
        Object obj2;
        List<FinanceBillBizType> bizType;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                objM15647l = ((Result) obj).getValue();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            AccountBillCommonViewModel.Companion companion = AccountBillCommonViewModel.f16629e0;
            if (companion.getFinanceBizTypes().get(this.$typeKey) == null || companion.getFinanceProductCategories().get(this.$typeKey) == null) {
                AccountBillRepository accountBillRepository = this.this$0.f16632X;
                this.label = 1;
                objM15647l = accountBillRepository.m15647l(this);
                if (objM15647l == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                Function2<List<FinanceBillBizType>, List<FinanceBillProductCategory>, Unit> function2 = this.$callback;
                if (function2 != null) {
                    function2.invoke(companion.getFinanceBizTypes().get(this.$typeKey), companion.getFinanceProductCategories().get(this.$typeKey));
                }
            }
            return Unit.INSTANCE;
        }
        if (Result.m103851isSuccessimpl(objM15647l)) {
            AccountBillCommonViewModel.Companion companion2 = AccountBillCommonViewModel.f16629e0;
            LinkedHashMap<String, List<FinanceBillBizType>> financeBizTypes = companion2.getFinanceBizTypes();
            String str = this.$typeKey;
            List<FinanceBillProductCategory> productCategory = null;
            if (Result.m103850isFailureimpl(objM15647l)) {
                obj2 = null;
            } else {
                obj2 = objM15647l;
            }
            FinanceBillOptionsEntity financeBillOptionsEntity = (FinanceBillOptionsEntity) obj2;
            if (financeBillOptionsEntity != null) {
                bizType = financeBillOptionsEntity.getBizType();
            } else {
                bizType = null;
            }
            financeBizTypes.put(str, bizType);
            LinkedHashMap<String, List<FinanceBillProductCategory>> financeProductCategories = companion2.getFinanceProductCategories();
            String str2 = this.$typeKey;
            if (Result.m103850isFailureimpl(objM15647l)) {
                objM15647l = null;
            }
            FinanceBillOptionsEntity financeBillOptionsEntity2 = (FinanceBillOptionsEntity) objM15647l;
            if (financeBillOptionsEntity2 != null) {
                productCategory = financeBillOptionsEntity2.getProductCategory();
            }
            financeProductCategories.put(str2, productCategory);
        }
        Function2<List<FinanceBillBizType>, List<FinanceBillProductCategory>, Unit> function3 = this.$callback;
        if (function3 != null) {
            AccountBillCommonViewModel.Companion companion3 = AccountBillCommonViewModel.f16629e0;
            function3.invoke(companion3.getFinanceBizTypes().get(this.$typeKey), companion3.getFinanceProductCategories().get(this.$typeKey));
        }
        return Unit.INSTANCE;
    }
}
