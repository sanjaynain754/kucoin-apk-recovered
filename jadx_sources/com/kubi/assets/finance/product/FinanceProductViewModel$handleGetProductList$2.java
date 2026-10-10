package com.kubi.assets.finance.product;

import com.kubi.assets.entity.FinanceProductEntity;
import java.util.ArrayList;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: FinanceProductViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Ljava/util/ArrayList;", "Lcom/kubi/assets/entity/FinanceProductEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.finance.product.FinanceProductViewModel$handleGetProductList$2", m90122f = "FinanceProductViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class FinanceProductViewModel$handleGetProductList$2 extends SuspendLambda implements Function2<ArrayList<FinanceProductEntity>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FinanceProductViewModel this$0;

    /* JADX INFO: renamed from: com.kubi.assets.finance.product.FinanceProductViewModel$handleGetProductList$2$1 */
    /* JADX INFO: compiled from: FinanceProductViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.finance.product.FinanceProductViewModel$handleGetProductList$2$1", m90122f = "FinanceProductViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C100141 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ ArrayList<FinanceProductEntity> $it;
        int label;
        final /* synthetic */ FinanceProductViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C100141(FinanceProductViewModel financeProductViewModel, ArrayList<FinanceProductEntity> arrayList, Continuation<? super C100141> continuation) {
            super(2, continuation);
            this.this$0 = financeProductViewModel;
            this.$it = arrayList;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C100141(this.this$0, this.$it, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C100141) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                this.this$0.m16831u(this.$it);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinanceProductViewModel$handleGetProductList$2(FinanceProductViewModel financeProductViewModel, Continuation<? super FinanceProductViewModel$handleGetProductList$2> continuation) {
        super(2, continuation);
        this.this$0 = financeProductViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FinanceProductViewModel$handleGetProductList$2 financeProductViewModel$handleGetProductList$2 = new FinanceProductViewModel$handleGetProductList$2(this.this$0, continuation);
        financeProductViewModel$handleGetProductList$2.L$0 = obj;
        return financeProductViewModel$handleGetProductList$2;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(ArrayList<FinanceProductEntity> arrayList, Continuation<? super Unit> continuation) {
        return ((FinanceProductViewModel$handleGetProductList$2) create(arrayList, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList = (ArrayList) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        FinanceProductViewModel financeProductViewModel = this.this$0;
        financeProductViewModel.launchOnIO(new C100141(financeProductViewModel, arrayList, null));
        return Unit.INSTANCE;
    }
}
