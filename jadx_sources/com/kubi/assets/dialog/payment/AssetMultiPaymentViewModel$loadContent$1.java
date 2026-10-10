package com.kubi.assets.dialog.payment;

import com.kubi.assets.AssetV2Api;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.InterfaceC41709m0;
import o00.C42911a;
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

/* JADX INFO: compiled from: AssetMultiPaymentViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.dialog.payment.AssetMultiPaymentViewModel$loadContent$1", m90122f = "AssetMultiPaymentViewModel.kt", m90123i = {0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3}, m90124l = {65, 73, 83, 90}, m90125m = "invokeSuspend", m90126n = {"$this$launch", "$this$invokeSuspend_u24lambda_u242", "$i$a$-runCatching-AssetMultiPaymentViewModel$loadContent$1$1", "$this$launch", "$this$invokeSuspend_u24lambda_u242", "resp", "config", "$i$a$-runCatching-AssetMultiPaymentViewModel$loadContent$1$1", "$i$a$-let-AssetMultiPaymentViewModel$loadContent$1$1$1", "$this$launch", "$this$invokeSuspend_u24lambda_u242", "resp", "$this$invokeSuspend_u24lambda_u242_u24lambda_u241", "$i$a$-runCatching-AssetMultiPaymentViewModel$loadContent$1$1", "$i$a$-run-AssetMultiPaymentViewModel$loadContent$1$1$2", "$this$launch", "e", "$i$a$-onFailure-AssetMultiPaymentViewModel$loadContent$1$2"}, m90127s = {"L$0", "L$5", "I$0", "L$0", "L$4", "L$5", "L$6", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "I$0", "I$1", "L$0", "L$2", "I$0"})
public final class AssetMultiPaymentViewModel$loadContent$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ AssetPaymentListConfig $cachedConfig;
    final /* synthetic */ String $scene;
    final /* synthetic */ String $type;
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    final /* synthetic */ AssetMultiPaymentViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetMultiPaymentViewModel$loadContent$1(AssetMultiPaymentViewModel assetMultiPaymentViewModel, String str, String str2, AssetPaymentListConfig assetPaymentListConfig, Continuation<? super AssetMultiPaymentViewModel$loadContent$1> continuation) {
        super(2, continuation);
        this.this$0 = assetMultiPaymentViewModel;
        this.$type = str;
        this.$scene = str2;
        this.$cachedConfig = assetPaymentListConfig;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AssetMultiPaymentViewModel$loadContent$1 assetMultiPaymentViewModel$loadContent$1 = new AssetMultiPaymentViewModel$loadContent$1(this.this$0, this.$type, this.$scene, this.$cachedConfig, continuation);
        assetMultiPaymentViewModel$loadContent$1.L$0 = obj;
        return assetMultiPaymentViewModel$loadContent$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((AssetMultiPaymentViewModel$loadContent$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0145  */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0172, code lost:
    
        if (kotlinx.coroutines.C41686h.m91049g(r4, r9, r14) == r1) goto L49;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objM103844constructorimpl;
        AssetMultiPaymentViewModel assetMultiPaymentViewModel;
        String str;
        Throwable thM103847exceptionOrNullimpl;
        AssetMultiPaymentViewModel assetMultiPaymentViewModel2;
        String str2;
        String str3;
        AssetPaymentListConfig assetPaymentListConfig;
        InterfaceC41709m0 interfaceC41709m0;
        int i11;
        InterfaceC41709m0 interfaceC41709m1 = (InterfaceC41709m0) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(obj);
                assetMultiPaymentViewModel2 = this.this$0;
                str2 = this.$type;
                str3 = this.$scene;
                assetPaymentListConfig = this.$cachedConfig;
                Result.Companion companion = Result.INSTANCE;
                AssetV2Api assetV2ApiM16359u = assetMultiPaymentViewModel2.m16359u();
                AssetPaymentListConfigReq assetPaymentListConfigReq = new AssetPaymentListConfigReq(str2, str3);
                this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m1);
                this.L$1 = assetMultiPaymentViewModel2;
                this.L$2 = str2;
                this.L$3 = str3;
                this.L$4 = assetPaymentListConfig;
                this.L$5 = interfaceC41709m1;
                this.I$0 = 0;
                this.label = 1;
                obj = assetV2ApiM16359u.m17145l1(assetPaymentListConfigReq, this);
                if (obj != coroutine_suspended) {
                    interfaceC41709m0 = interfaceC41709m1;
                    i11 = 0;
                }
                return coroutine_suspended;
            }
            if (i12 != 1) {
                if (i12 == 2) {
                } else if (i12 == 3) {
                } else {
                    if (i12 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                ResultKt.throwOnFailure(obj);
                objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
                assetMultiPaymentViewModel = this.this$0;
                AssetPaymentListConfig assetPaymentListConfig2 = this.$cachedConfig;
                str = this.$type;
                thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
                if (thM103847exceptionOrNullimpl != null && !assetMultiPaymentViewModel.m16364z(assetPaymentListConfig2)) {
                    AbstractC41697j0 abstractC41697j0M94121c = C42911a.m94121c();
                    AssetMultiPaymentViewModel$loadContent$1$2$1 assetMultiPaymentViewModel$loadContent$1$2$1 = new AssetMultiPaymentViewModel$loadContent$1$2$1(assetMultiPaymentViewModel, str, null);
                    this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m1);
                    this.L$1 = objM103844constructorimpl;
                    this.L$2 = SpillingKt.nullOutSpilledVariable(thM103847exceptionOrNullimpl);
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.I$0 = 0;
                    this.label = 4;
                }
            } else {
                i11 = this.I$0;
                interfaceC41709m0 = (InterfaceC41709m0) this.L$5;
                assetPaymentListConfig = (AssetPaymentListConfig) this.L$4;
                str3 = (String) this.L$3;
                str2 = (String) this.L$2;
                assetMultiPaymentViewModel2 = (AssetMultiPaymentViewModel) this.L$1;
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
            AssetPaymentListConfig assetPaymentListConfig3 = (AssetPaymentListConfig) obj;
            if (assetPaymentListConfig3 == null) {
                if (!assetMultiPaymentViewModel2.m16364z(assetPaymentListConfig)) {
                    AbstractC41697j0 abstractC41697j0M94121c2 = C42911a.m94121c();
                    AssetMultiPaymentViewModel$loadContent$1$1$2$1 assetMultiPaymentViewModel$loadContent$1$1$2$1 = new AssetMultiPaymentViewModel$loadContent$1$1$2$1(assetMultiPaymentViewModel2, str2, null);
                    this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m1);
                    this.L$1 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
                    this.L$2 = SpillingKt.nullOutSpilledVariable(assetPaymentListConfig3);
                    this.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
                    this.L$4 = null;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.I$0 = i11;
                    this.I$1 = 0;
                    this.label = 3;
                    if (C41686h.m91049g(abstractC41697j0M94121c2, assetMultiPaymentViewModel$loadContent$1$1$2$1, this) == coroutine_suspended) {
                    }
                }
                objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
                assetMultiPaymentViewModel = this.this$0;
                AssetPaymentListConfig assetPaymentListConfig4 = this.$cachedConfig;
                str = this.$type;
                thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
                if (thM103847exceptionOrNullimpl != null) {
                    AbstractC41697j0 abstractC41697j0M94121c3 = C42911a.m94121c();
                    AssetMultiPaymentViewModel$loadContent$1$2$1 assetMultiPaymentViewModel$loadContent$1$2$2 = new AssetMultiPaymentViewModel$loadContent$1$2$1(assetMultiPaymentViewModel, str, null);
                    this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m1);
                    this.L$1 = objM103844constructorimpl;
                    this.L$2 = SpillingKt.nullOutSpilledVariable(thM103847exceptionOrNullimpl);
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.I$0 = 0;
                    this.label = 4;
                }
                return Unit.INSTANCE;
            }
            assetMultiPaymentViewModel2.m16357B(str2, str3, assetPaymentListConfig3);
            if (!assetMultiPaymentViewModel2.m16364z(assetPaymentListConfig)) {
                if (assetMultiPaymentViewModel2.m16364z(assetPaymentListConfig3)) {
                    AbstractC41697j0 abstractC41697j0M94121c4 = C42911a.m94121c();
                    AssetMultiPaymentViewModel$loadContent$1$1$1$1 assetMultiPaymentViewModel$loadContent$1$1$1$1 = new AssetMultiPaymentViewModel$loadContent$1$1$1$1(assetMultiPaymentViewModel2, assetPaymentListConfig3, null);
                    this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m1);
                    this.L$1 = assetMultiPaymentViewModel2;
                    this.L$2 = str2;
                    this.L$3 = assetPaymentListConfig;
                    this.L$4 = interfaceC41709m0;
                    this.L$5 = SpillingKt.nullOutSpilledVariable(assetPaymentListConfig3);
                    this.L$6 = SpillingKt.nullOutSpilledVariable(assetPaymentListConfig3);
                    this.I$0 = i11;
                    this.I$1 = 0;
                    this.label = 2;
                    if (C41686h.m91049g(abstractC41697j0M94121c4, assetMultiPaymentViewModel$loadContent$1$1$1$1, this) == coroutine_suspended) {
                    }
                } else {
                    assetMultiPaymentViewModel2.m16358C(str2);
                }
            }
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
            assetMultiPaymentViewModel = this.this$0;
            AssetPaymentListConfig assetPaymentListConfig5 = this.$cachedConfig;
            str = this.$type;
            thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
            if (thM103847exceptionOrNullimpl != null) {
                AbstractC41697j0 abstractC41697j0M94121c5 = C42911a.m94121c();
                AssetMultiPaymentViewModel$loadContent$1$2$1 assetMultiPaymentViewModel$loadContent$1$2$3 = new AssetMultiPaymentViewModel$loadContent$1$2$1(assetMultiPaymentViewModel, str, null);
                this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m1);
                this.L$1 = objM103844constructorimpl;
                this.L$2 = SpillingKt.nullOutSpilledVariable(thM103847exceptionOrNullimpl);
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.I$0 = 0;
                this.label = 4;
            }
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        return coroutine_suspended;
    }
}
