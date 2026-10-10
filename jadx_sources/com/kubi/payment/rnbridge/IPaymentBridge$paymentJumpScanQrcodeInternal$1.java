package com.kubi.payment.rnbridge;

import android.content.Intent;
import com.google.zxing.client.android.Intents;
import com.google.zxing.integration.android.IntentIntegrator;
import com.kubi.otc.R$string;
import com.kubi.otc.api.IOtcService;
import com.kubi.otc.exception.OtcException;
import com.kubi.payment.channel.data.entities.ChannelKycRequest;
import com.kubi.payment.kucoinpay.qrscan.PaymentQrCodeScanActivity;
import com.kubi.router.core.Router;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27025c;
import cy.InterfaceC36555b;
import f00.C37304a;
import g00.InterfaceC37758j;
import io.reactivex.functions.Consumer;
import kotlinx.coroutines.InterfaceC41709m0;
import org.json.JSONException;
import org.json.JSONObject;
import p347iu.C40172b;
import p569qq.C43846g;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: IPaymentBridge.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.rnbridge.IPaymentBridge$paymentJumpScanQrcodeInternal$1", m90122f = "IPaymentBridge.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nIPaymentBridge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IPaymentBridge.kt\ncom/kubi/payment/rnbridge/IPaymentBridge$paymentJumpScanQrcodeInternal$1\n+ 2 OtcIssue.kt\ncom/kubi/otc/exception/OtcIssueKt\n*L\n1#1,160:1\n44#2,2:161\n*S KotlinDebug\n*F\n+ 1 IPaymentBridge.kt\ncom/kubi/payment/rnbridge/IPaymentBridge$paymentJumpScanQrcodeInternal$1\n*L\n97#1:161,2\n*E\n"})
public final class IPaymentBridge$paymentJumpScanQrcodeInternal$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ BaseActivity $activity;
    final /* synthetic */ Function2<Boolean, ProtocolException, Unit> $callback;
    int label;

    /* JADX INFO: renamed from: h */
    public static final void m49511h(Function2 function2, int i11, Intent intent) {
        if (i11 == -1) {
            if (C27025c.m66566d(intent != null ? Boolean.valueOf(RouteExKt.m56248g(intent, "data", false)) : null)) {
                function2.invoke(Boolean.TRUE, null);
                return;
            }
        }
        ToastCompat.m66437C(R$string.redpacket_wrong_code);
        function2.invoke(Boolean.FALSE, new ProtocolException("get a wrong scanCode", null, null, false, 14, null));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IPaymentBridge$paymentJumpScanQrcodeInternal$1(BaseActivity baseActivity, Function2<? super Boolean, ? super ProtocolException, Unit> function2, Continuation<? super IPaymentBridge$paymentJumpScanQrcodeInternal$1> continuation) {
        super(2, continuation);
        this.$activity = baseActivity;
        this.$callback = function2;
    }

    /* JADX INFO: renamed from: g */
    public static final void m49510g(final Function2 function2, Intent intent) throws JSONException {
        if (intent != null) {
            String strM56280w = RouteExKt.m56280w(intent, Intents.Scan.RESULT);
            C44128b.m97266j("IPaymentBridge", "scanCode:" + strM56280w);
            if (strM56280w == null || strM56280w.length() == 0) {
                function2.invoke(Boolean.FALSE, new ProtocolException("get scanCode failed", null, null, false, 14, null));
                return;
            }
            if (C40172b.m88532c(strM56280w)) {
                function2.invoke(Boolean.valueOf(Router.f46192a.m56184f(strM56280w).m4048k()), null);
            } else {
                InterfaceC37758j.a.m85161j(C37304a.f82764a, strM56280w, IOtcService.Companion.SOURCE_FROM_H5, null, null, new InterfaceC36555b() { // from class: com.kubi.payment.rnbridge.b
                    @Override // cy.InterfaceC36555b
                    /* JADX INFO: renamed from: a */
                    public final void mo4404a(int i11, Intent intent2) {
                        IPaymentBridge$paymentJumpScanQrcodeInternal$1.m49511h(function2, i11, intent2);
                    }
                }, 12, null);
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("category", ChannelKycRequest.SCENE_WITHDRAW);
            jSONObject.put("message", strM56280w);
            C43852m.m96605q("qr_scan_result", jSONObject);
        }
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new IPaymentBridge$paymentJumpScanQrcodeInternal$1(this.$activity, this.$callback, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((IPaymentBridge$paymentJumpScanQrcodeInternal$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                BaseActivity baseActivity = this.$activity;
                Intent intentCreateScanIntent = new IntentIntegrator(this.$activity).setOrientationLocked(false).setCaptureActivity(PaymentQrCodeScanActivity.class).createScanIntent();
                Intrinsics.checkNotNullExpressionValue(intentCreateScanIntent, "createScanIntent(...)");
                final Function2<Boolean, ProtocolException, Unit> function2 = this.$callback;
                baseActivity.startActivityWithResult(intentCreateScanIntent, new Consumer() { // from class: com.kubi.payment.rnbridge.a
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj2) throws JSONException {
                        IPaymentBridge$paymentJumpScanQrcodeInternal$1.m49510g(function2, (Intent) obj2);
                    }
                });
            } catch (Throwable th2) {
                C43846g.m96568c(new OtcException(th2, "IPaymentBridge", false, null, 8, null), null, 2, null);
                this.$callback.invoke(Boxing.boxBoolean(false), new ProtocolException(th2.getMessage(), th2, null, false, 12, null));
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
