package com.kubi.otc.otc.paytype.add;

import com.kubi.otc.R$string;
import com.kubi.payment.PaymentServiceLocator;
import com.kubi.payment.flutter.upload.UploadHelper;
import com.kubi.sdk.base.entity.BaseEntity;
import com.kubi.utils.ToastCompat;
import java.util.HashMap;
import java.util.List;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: PayTypeAddViewModel.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.otc.otc.paytype.add.PayTypeAddViewModel$submitInfo$2$1", m90122f = "PayTypeAddViewModel.kt", m90123i = {0, 1, 1, 1}, m90124l = {80, 92}, m90125m = "invokeSuspend", m90126n = {"$this$launch", "$this$launch", "$this$invokeSuspend_u24lambda_u240", "$i$a$-runCatching-PayTypeAddViewModel$submitInfo$2$1$1"}, m90127s = {"L$0", "L$0", "L$1", "I$0"})
public final class PayTypeAddViewModel$submitInfo$2$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isEditPayType;
    final /* synthetic */ HashMap<String, String> $params;
    final /* synthetic */ String $path;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ PayTypeAddViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PayTypeAddViewModel$submitInfo$2$1(PayTypeAddViewModel payTypeAddViewModel, String str, HashMap<String, String> map, boolean z11, Continuation<? super PayTypeAddViewModel$submitInfo$2$1> continuation) {
        super(2, continuation);
        this.this$0 = payTypeAddViewModel;
        this.$path = str;
        this.$params = map;
        this.$isEditPayType = z11;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PayTypeAddViewModel$submitInfo$2$1 payTypeAddViewModel$submitInfo$2$1 = new PayTypeAddViewModel$submitInfo$2$1(this.this$0, this.$path, this.$params, this.$isEditPayType, continuation);
        payTypeAddViewModel$submitInfo$2$1.L$0 = obj;
        return payTypeAddViewModel$submitInfo$2$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((PayTypeAddViewModel$submitInfo$2$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:
    
        if (r11 == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b2, code lost:
    
        if (r11 == r1) goto L33;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objM103844constructorimpl;
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        try {
            if (i11 == 0) {
                ResultKt.throwOnFailure(obj);
                this.this$0.f37916W.setValue(Boxing.boxBoolean(true));
                if (this.$path.length() > 0) {
                    UploadHelper uploadHelper = UploadHelper.f39536a;
                    List<String> listListOf = CollectionsKt.listOf(this.$path);
                    this.L$0 = interfaceC41709m0;
                    this.label = 1;
                    obj = uploadHelper.m48220b(listListOf, "ku_otc_payment", this);
                } else {
                    boolean z11 = this.$isEditPayType;
                    PayTypeAddViewModel payTypeAddViewModel = this.this$0;
                    HashMap<String, String> map = this.$params;
                    Result.Companion companion = Result.INSTANCE;
                    AbstractC41697j0 abstractC41697j0M45617e = PaymentServiceLocator.f38204a.m45617e();
                    PayTypeAddViewModel$submitInfo$2$1$1$1 payTypeAddViewModel$submitInfo$2$1$1$1 = new PayTypeAddViewModel$submitInfo$2$1$1$1(z11, payTypeAddViewModel, map, null);
                    this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
                    this.L$1 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
                    this.I$0 = 0;
                    this.label = 2;
                    obj = C41686h.m91049g(abstractC41697j0M45617e, payTypeAddViewModel$submitInfo$2$1$1$1, this);
                }
                return coroutine_suspended;
            }
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            objM103844constructorimpl = Result.m103844constructorimpl((BaseEntity) obj);
            PayTypeAddViewModel payTypeAddViewModel2 = this.this$0;
            if (Result.m103851isSuccessimpl(objM103844constructorimpl)) {
                BaseEntity baseEntity = (BaseEntity) objM103844constructorimpl;
                payTypeAddViewModel2.f37916W.setValue(Boxing.boxBoolean(false));
                if (baseEntity.getSuccess()) {
                    payTypeAddViewModel2.f37918Y.setValue(Boxing.boxBoolean(true));
                } else {
                    ToastCompat.m66441G(baseEntity.getMsg(), new Object[0]);
                }
            }
            PayTypeAddViewModel payTypeAddViewModel3 = this.this$0;
            Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
            if (thM103847exceptionOrNullimpl != null) {
                payTypeAddViewModel3.f37916W.setValue(Boxing.boxBoolean(false));
                thM103847exceptionOrNullimpl.printStackTrace();
                ToastCompat.m66441G(thM103847exceptionOrNullimpl.getMessage(), new Object[0]);
            }
            return Unit.INSTANCE;
            List list = (List) obj;
            String str = list != null ? (String) CollectionsKt.firstOrNull(list) : null;
            if (str == null || str.length() == 0) {
                this.this$0.f37916W.setValue(Boxing.boxBoolean(false));
                ToastCompat.m66437C(R$string.upload_fail);
                return Unit.INSTANCE;
            }
            this.$params.put("payQrcodePic", str);
            boolean z12 = this.$isEditPayType;
            PayTypeAddViewModel payTypeAddViewModel4 = this.this$0;
            HashMap<String, String> map2 = this.$params;
            Result.Companion companion2 = Result.INSTANCE;
            AbstractC41697j0 abstractC41697j0M45617e2 = PaymentServiceLocator.f38204a.m45617e();
            PayTypeAddViewModel$submitInfo$2$1$1$1 payTypeAddViewModel$submitInfo$2$1$1$2 = new PayTypeAddViewModel$submitInfo$2$1$1$1(z12, payTypeAddViewModel4, map2, null);
            this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
            this.L$1 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
            this.I$0 = 0;
            this.label = 2;
            obj = C41686h.m91049g(abstractC41697j0M45617e2, payTypeAddViewModel$submitInfo$2$1$1$2, this);
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
    }
}
