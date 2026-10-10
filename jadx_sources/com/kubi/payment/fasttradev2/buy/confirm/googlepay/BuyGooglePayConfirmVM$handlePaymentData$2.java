package com.kubi.payment.fasttradev2.buy.confirm.googlepay;

import android.util.Base64;
import androidx.autofill.HintConstants;
import com.google.android.gms.wallet.PaymentData;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.kubi.otc.exception.OtcException;
import com.kubi.payment.fast.data.entities.GooglePaymentData;
import com.kubi.utils.extensions.C27041f;
import com.tencent.bugly.proguard.InterfaceC33826o0;
import kotlinx.coroutines.InterfaceC41709m0;
import org.json.JSONObject;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.Charsets;
import ro.C44128b;

/* JADX INFO: compiled from: BuyGooglePayConfirmVM.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "Lcom/kubi/payment/fast/data/entities/GooglePaymentData;", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.fasttradev2.buy.confirm.googlepay.BuyGooglePayConfirmVM$handlePaymentData$2", m90122f = "BuyGooglePayConfirmVM.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nBuyGooglePayConfirmVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuyGooglePayConfirmVM.kt\ncom/kubi/payment/fasttradev2/buy/confirm/googlepay/BuyGooglePayConfirmVM$handlePaymentData$2\n+ 2 OtcIssue.kt\ncom/kubi/otc/exception/OtcIssueKt\n*L\n1#1,295:1\n44#2,2:296\n*S KotlinDebug\n*F\n+ 1 BuyGooglePayConfirmVM.kt\ncom/kubi/payment/fasttradev2/buy/confirm/googlepay/BuyGooglePayConfirmVM$handlePaymentData$2\n*L\n137#1:296,2\n*E\n"})
public final class BuyGooglePayConfirmVM$handlePaymentData$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super GooglePaymentData>, Object> {
    final /* synthetic */ PaymentData $paymentData;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyGooglePayConfirmVM$handlePaymentData$2(PaymentData paymentData, Continuation<? super BuyGooglePayConfirmVM$handlePaymentData$2> continuation) {
        super(2, continuation);
        this.$paymentData = paymentData;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BuyGooglePayConfirmVM$handlePaymentData$2(this.$paymentData, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super GooglePaymentData> continuation) {
        return ((BuyGooglePayConfirmVM$handlePaymentData$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        try {
            String json = this.$paymentData.toJson();
            Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
            JSONObject jSONObjectOptJSONObject3 = new JSONObject(json).optJSONObject("paymentMethodData");
            byte[] bytes = C27041f.m66668h((jSONObjectOptJSONObject3 == null || (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject3.optJSONObject("tokenizationData")) == null) ? null : jSONObjectOptJSONObject2.optString(InterfaceC33826o0.f71244p)).getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            String strEncodeToString = Base64.encodeToString(bytes, 2);
            JSONObject jSONObjectOptJSONObject4 = (jSONObjectOptJSONObject3 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject3.optJSONObject("info")) == null) ? null : jSONObjectOptJSONObject.optJSONObject("billingAddress");
            String strOptString = jSONObjectOptJSONObject4 != null ? jSONObjectOptJSONObject4.optString("name") : null;
            String strOptString2 = jSONObjectOptJSONObject4 != null ? jSONObjectOptJSONObject4.optString(HintConstants.AUTOFILL_HINT_POSTAL_CODE) : null;
            return new GooglePaymentData(strEncodeToString, jSONObjectOptJSONObject4 != null ? jSONObjectOptJSONObject4.optString("address1") : null, jSONObjectOptJSONObject4 != null ? jSONObjectOptJSONObject4.optString("address2") : null, jSONObjectOptJSONObject4 != null ? jSONObjectOptJSONObject4.optString("address3") : null, jSONObjectOptJSONObject4 != null ? jSONObjectOptJSONObject4.optString("administrativeArea") : null, jSONObjectOptJSONObject4 != null ? jSONObjectOptJSONObject4.optString(RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE) : null, jSONObjectOptJSONObject4 != null ? jSONObjectOptJSONObject4.optString("locality") : null, strOptString, strOptString2, jSONObjectOptJSONObject4 != null ? jSONObjectOptJSONObject4.optString("administrativeArea") : null);
        } catch (Exception e11) {
            C43846g.m96568c(new OtcException(new Throwable("Google Pay parse payment data error: " + e11.getMessage()), "payment", false, null, 8, null), null, 2, null);
            C44128b.m97261e("payment", "Google Pay handlePaymentData error: " + e11);
            return null;
        }
    }
}
