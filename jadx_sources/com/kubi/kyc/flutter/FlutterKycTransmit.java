package com.kubi.kyc.flutter;

import android.os.Bundle;
import com.jumio.core.constants.ConstantsKt;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.kyc.exception.KycException;
import com.kubi.kyc.exception.KycMessage;
import com.kubi.kyc.ui.kycv2.KycBridgeManager;
import com.kubi.kyc.ui.kycv2.advance.KycJumpParams;
import com.kubi.sdk.BaseApplication;
import com.kubi.sdk.flutter.ui.FlutterEntryActivity;
import com.kubi.utils.C27051h;
import com.kubi.utils.extensions.C27041f;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.coroutines.InterfaceC41775x1;
import org.jetbrains.annotations.NotNull;
import p569qq.C43846g;
import p611s.C44206b;
import p741wy.InterfaceC45947g;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: FlutterKycTransmit.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0007H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/kyc/flutter/FlutterKycTransmit;", "Lcom/kubi/sdk/flutter/transmit/IKYCTransmit;", "<init>", "()V", "kycHasSendResult", "Ljava/util/concurrent/atomic/AtomicInteger;", "handleMethod", "", "context", "Lcom/kubi/sdk/flutter/ui/FlutterEntryActivity;", "call", "Lio/flutter/plugin/common/MethodCall;", DbParams.KEY_CHANNEL_RESULT, "Lio/flutter/plugin/common/MethodChannel$Result;", "sendResult", "info", "", "release", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFlutterKycTransmit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlutterKycTransmit.kt\ncom/kubi/kyc/flutter/FlutterKycTransmit\n+ 2 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 3 KycIssue.kt\ncom/kubi/kyc/exception/KycIssueKt\n*L\n1#1,136:1\n81#2,2:137\n81#2,2:139\n44#3,2:141\n48#3,2:143\n*S KotlinDebug\n*F\n+ 1 FlutterKycTransmit.kt\ncom/kubi/kyc/flutter/FlutterKycTransmit\n*L\n49#1:137,2\n76#1:139,2\n121#1:141,2\n129#1:143,2\n*E\n"})
public final class FlutterKycTransmit implements InterfaceC45947g {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final AtomicInteger f31214a = new AtomicInteger(0);

    @Override // p741wy.InterfaceC45947g
    /* JADX INFO: renamed from: c */
    public void mo36786c(@NotNull FlutterEntryActivity context, @NotNull MethodCall call, @NotNull MethodChannel.Result result) {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(result, "result");
        try {
            Result.Companion companion = Result.INSTANCE;
            this.f31214a.set(0);
            String str = (String) call.argument("name");
            if (Intrinsics.areEqual(str, "caputure")) {
                KycBridgeManager kycBridgeManager = KycBridgeManager.f31425a;
                InterfaceC41775x1 interfaceC41775x1M37186r = kycBridgeManager.m37186r();
                if (interfaceC41775x1M37186r != null) {
                    InterfaceC41775x1.a.m91377a(interfaceC41775x1M37186r, null, 1, null);
                }
                if (C12573b.f21598a.m23696a()) {
                    "com.kubi.kyc.event.KycEvent:lego_event".length();
                }
                kycBridgeManager.m37180L(C12572a.m23692a(context, false, new C17101xfc9e7c4e("com.kubi.kyc.event.KycEvent:lego_event", null, this, result)));
                HashMap map = (HashMap) call.argument("parameter");
                Object obj = map != null ? map.get("type") : null;
                HashMap map2 = (HashMap) call.argument("parameter");
                if (map2 != null) {
                    map2.get("way");
                }
                HashMap map3 = (HashMap) call.argument("parameter");
                Object obj2 = map3 != null ? map3.get("ekycFlowId") : null;
                kycBridgeManager.m37184m(1, obj, context, context.getF46748j(), obj2 instanceof String ? (String) obj2 : null);
            } else if (Intrinsics.areEqual(str, "caputureIqa")) {
                KycBridgeManager kycBridgeManager2 = KycBridgeManager.f31425a;
                InterfaceC41775x1 interfaceC41775x1M37186r2 = kycBridgeManager2.m37186r();
                if (interfaceC41775x1M37186r2 != null) {
                    InterfaceC41775x1.a.m91377a(interfaceC41775x1M37186r2, null, 1, null);
                }
                if (C12573b.f21598a.m23696a()) {
                    "com.kubi.kyc.event.KycEvent:lego_event".length();
                }
                kycBridgeManager2.m37180L(C12572a.m23692a(context, false, new C17102xfc9e7c4f("com.kubi.kyc.event.KycEvent:lego_event", null, this, result)));
                C44206b.m97448h(BaseApplication.INSTANCE.get());
                HashMap map4 = (HashMap) call.argument("parameter");
                String str2 = map4 != null ? (String) map4.get("type") : null;
                HashMap map5 = (HashMap) call.argument("parameter");
                String str3 = map5 != null ? (String) map5.get("frontToken") : null;
                HashMap map6 = (HashMap) call.argument("parameter");
                String str4 = map6 != null ? (String) map6.get("transactionId") : null;
                HashMap map7 = (HashMap) call.argument("parameter");
                String str5 = map7 != null ? (String) map7.get("regionCode") : null;
                KycJumpParams kycJumpParams = new KycJumpParams(0, null, null, null, null, null, null, null, null, null, null, 2047, null);
                kycJumpParams.setType(C27041f.m66668h(str2));
                kycJumpParams.setDirection(ConstantsKt.FACE_CAPTURE_MODE_FRONT);
                kycJumpParams.setFrontToken(C27041f.m66668h(str3));
                kycJumpParams.setTransactionId(C27041f.m66668h(str4));
                kycJumpParams.setRegion(C27041f.m66668h(str5));
                Bundle bundleM66717a = new C27051h().m66721e("kyc_jump", kycJumpParams).m66717a();
                Intrinsics.checkNotNullExpressionValue(bundleM66717a, "getBundle(...)");
                kycBridgeManager2.m37188u(context, bundleM66717a, context.getF46748j());
            } else {
                HashMap map8 = new HashMap();
                map8.put("isSuccess", Boolean.FALSE);
                if (this.f31214a.getAndIncrement() == 0) {
                    m36787s(result, map8);
                }
            }
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            HashMap map9 = new HashMap();
            map9.put("isSuccess", Boolean.FALSE);
            if (this.f31214a.getAndIncrement() == 0) {
                m36787s(result, map9);
            }
            C43846g.m96568c(new KycException(thM103847exceptionOrNullimpl, "kycflutter", false, null, 8, null), null, 2, null);
        }
    }

    @Override // p741wy.InterfaceC45947g
    public void release() {
        KycBridgeManager.f31425a.m37179K();
    }

    /* JADX INFO: renamed from: s */
    public final void m36787s(MethodChannel.Result result, Object obj) {
        try {
            result.success(obj);
        } catch (Throwable th2) {
            C43846g.m96568c(new KycMessage(" result.success(info) error: " + th2.getMessage(), "FlutterKycTransmit", false, 4, null), null, 2, null);
        }
    }
}
