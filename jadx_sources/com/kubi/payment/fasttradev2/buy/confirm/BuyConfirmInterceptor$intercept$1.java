package com.kubi.payment.fasttradev2.buy.confirm;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.kubi.otc.exception.OtcMessage;
import com.kubi.payment.fasttradev2.buy.FastBuyHelper;
import com.kubi.router.utils.RouteExKt;
import com.kubi.utils.C27099x;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import o00.C42911a;
import p026ay.C4400a;
import p481ny.C42899b;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: BuyConfirmInterceptor.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.fasttradev2.buy.confirm.BuyConfirmInterceptor$intercept$1", m90122f = "BuyConfirmInterceptor.kt", m90123i = {0, 0, 0, 0, 0}, m90124l = {62}, m90125m = "invokeSuspend", m90126n = {"bundle", "confirmParasJsonString", "this_$iv", "json$iv", "$i$f$fromJsonOrNull"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
@SourceDebugExtension({"SMAP\nBuyConfirmInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuyConfirmInterceptor.kt\ncom/kubi/payment/fasttradev2/buy/confirm/BuyConfirmInterceptor$intercept$1\n+ 2 OtcIssue.kt\ncom/kubi/otc/exception/OtcIssueKt\n+ 3 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n*L\n1#1,57:1\n48#2,2:58\n48#2,2:63\n196#3,3:60\n*S KotlinDebug\n*F\n+ 1 BuyConfirmInterceptor.kt\ncom/kubi/payment/fasttradev2/buy/confirm/BuyConfirmInterceptor$intercept$1\n*L\n25#1:58,2\n39#1:63,2\n34#1:60,3\n*E\n"})
public final class BuyConfirmInterceptor$intercept$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ C4400a $postcard;
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyConfirmInterceptor$intercept$1(C4400a c4400a, Continuation<? super BuyConfirmInterceptor$intercept$1> continuation) {
        super(2, continuation);
        this.$postcard = c4400a;
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m47544f(BuyCommonConfirmExtraParams buyCommonConfirmExtraParams, C4400a c4400a, FragmentActivity fragmentActivity) {
        FastBuyHelper.f39263a.m47780C(fragmentActivity, buyCommonConfirmExtraParams, c4400a);
        return Unit.INSTANCE;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BuyConfirmInterceptor$intercept$1(this.$postcard, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((BuyConfirmInterceptor$intercept$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        boolean z11 = false;
        if (i11 != 0) {
            if (i11 == 1) {
                str = (String) this.L$1;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            Bundle bundle = this.$postcard.getBundle();
            String strM56284y = RouteExKt.m56284y(bundle, "confirmParams");
            if (strM56284y != null && strM56284y.length() != 0) {
                C44128b.m97258b("BuyConfirmInterceptor confirmParasJsonString:" + strM56284y);
                C27099x c27099x = C27099x.f54458a;
                InterfaceC41634e interfaceC41634eM90890N = C41636g.m90890N(C41636g.m90887K(new C20720x90d0dff8(strM56284y, null)), C42911a.m94120b());
                this.L$0 = SpillingKt.nullOutSpilledVariable(bundle);
                this.L$1 = strM56284y;
                this.L$2 = SpillingKt.nullOutSpilledVariable(c27099x);
                this.L$3 = SpillingKt.nullOutSpilledVariable(strM56284y);
                this.I$0 = 0;
                this.label = 1;
                obj = C41636g.m90914f0(interfaceC41634eM90890N, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                str = strM56284y;
            } else {
                C43846g.m96568c(new OtcMessage("confirmParasJsonString is null or empty", "BuyConfirmInterceptor", false, 4, null), null, 2, null);
                return Unit.INSTANCE;
            }
        }
        final BuyCommonConfirmExtraParams buyCommonConfirmExtraParams = (BuyCommonConfirmExtraParams) obj;
        if (buyCommonConfirmExtraParams != null) {
            if (buyCommonConfirmExtraParams.getRecurringFrequency() != null) {
                z11 = true;
            }
            buyCommonConfirmExtraParams.setRecurring(z11);
        }
        if (buyCommonConfirmExtraParams == null) {
            C43846g.m96568c(new OtcMessage("extraParams is null or empty,confirmParasJsonString:" + str, "BuyConfirmInterceptor", false, 4, null), null, 2, null);
            return Unit.INSTANCE;
        }
        final C4400a c4400a = this.$postcard;
        C42899b.m94073c(new Function1() { // from class: com.kubi.payment.fasttradev2.buy.confirm.n
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return BuyConfirmInterceptor$intercept$1.m47544f(buyCommonConfirmExtraParams, c4400a, (FragmentActivity) obj2);
            }
        });
        return Unit.INSTANCE;
    }
}
