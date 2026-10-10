package com.kubi.kyc.knb;

import android.os.Bundle;
import androidx.credentials.provider.CredentialEntry;
import com.kubi.kyc.exception.KycException;
import com.kubi.kyc.exception.KycMessage;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.utils.C27099x;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.tencent.bugly.proguard.InterfaceC33826o0;
import java.util.HashMap;
import java.util.Map;
import kn.C41076a;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import o00.C42911a;
import p566qn.C43791a;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.functions.Function4;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: KCHybridBridgeFaceSdk.kt */
/* JADX INFO: loaded from: classes21.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.kyc.knb.KCHybridBridgeFaceSdk$openAdvancedCertification$1", m90122f = "KCHybridBridgeFaceSdk.kt", m90123i = {0, 0, 0}, m90124l = {283}, m90125m = "invokeSuspend", m90126n = {"this_$iv", "json$iv", "$i$f$fromJsonOrNull"}, m90127s = {"L$0", "L$1", "I$0"})
@SourceDebugExtension({"SMAP\nKCHybridBridgeFaceSdk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCHybridBridgeFaceSdk.kt\ncom/kubi/kyc/knb/KCHybridBridgeFaceSdk$openAdvancedCertification$1\n+ 2 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n+ 3 KycIssue.kt\ncom/kubi/kyc/exception/KycIssueKt\n*L\n1#1,280:1\n196#2,3:281\n48#3,2:284\n48#3,2:286\n44#3,2:288\n44#3,2:290\n*S KotlinDebug\n*F\n+ 1 KCHybridBridgeFaceSdk.kt\ncom/kubi/kyc/knb/KCHybridBridgeFaceSdk$openAdvancedCertification$1\n*L\n123#1:281,3\n127#1:284,2\n141#1:286,2\n179#1:288,2\n168#1:290,2\n*E\n"})
public final class KCHybridBridgeFaceSdk$openAdvancedCertification$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ BaseActivity $activity;
    final /* synthetic */ Function2<Map<String, ? extends Object>, ProtocolException, Unit> $callback;
    final /* synthetic */ String $channel;
    final /* synthetic */ String $data;
    int I$0;
    Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public KCHybridBridgeFaceSdk$openAdvancedCertification$1(String str, String str2, Function2<? super Map<String, ? extends Object>, ? super ProtocolException, Unit> function2, BaseActivity baseActivity, Continuation<? super KCHybridBridgeFaceSdk$openAdvancedCertification$1> continuation) {
        super(2, continuation);
        this.$data = str;
        this.$channel = str2;
        this.$callback = function2;
        this.$activity = baseActivity;
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m36815f(Function2 function2, boolean z11, Bundle bundle, String str, String str2) {
        if (z11) {
            bundle.putString(DbParams.KEY_CHANNEL_RESULT, CredentialEntry.TRUE_STRING);
            C41076a.f91293a.m90059a("0");
            function2.invoke(RouteExKt.m56243d0(bundle), null);
        } else {
            C41076a.f91293a.m90059a(str2);
            C43846g.m96568c(new KycException(new Exception("code " + str2 + ", errorMsg " + str), "KCHybridBridgeFaceSdk", false, null, 8, null), null, 2, null);
            function2.invoke(MapsKt.mapOf(new Pair(DbParams.KEY_CHANNEL_RESULT, CredentialEntry.FALSE_STRING)), new ProtocolException(str2, null, null, false, 14, null));
        }
        return Unit.INSTANCE;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KCHybridBridgeFaceSdk$openAdvancedCertification$1(this.$data, this.$channel, this.$callback, this.$activity, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((KCHybridBridgeFaceSdk$openAdvancedCertification$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                C27099x c27099x = C27099x.f54458a;
                String str = this.$data;
                InterfaceC41634e interfaceC41634eM90890N = C41636g.m90890N(C41636g.m90887K(new C17105x1b2d26b9(str, null)), C42911a.m94120b());
                this.L$0 = SpillingKt.nullOutSpilledVariable(c27099x);
                this.L$1 = SpillingKt.nullOutSpilledVariable(str);
                this.I$0 = 0;
                this.label = 1;
                obj = C41636g.m90914f0(interfaceC41634eM90890N, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            HashMap map = (HashMap) obj;
            if (map != null && !map.isEmpty()) {
                String str2 = (String) map.get(InterfaceC33826o0.f71244p);
                String str3 = (String) map.get("dataCenter");
                boolean z11 = Boolean.parseBoolean((String) map.get("needNFC"));
                if (str2 != null && str2.length() != 0 && str3 != null && str3.length() != 0) {
                    BaseActivity baseActivity = this.$activity;
                    final Function2<Map<String, ? extends Object>, ProtocolException, Unit> function2 = this.$callback;
                    C43791a.m96436c(baseActivity, str2, str3, z11, new Function4() { // from class: com.kubi.kyc.knb.h
                        @Override // p852kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                            return KCHybridBridgeFaceSdk$openAdvancedCertification$1.m36815f(function2, ((Boolean) obj2).booleanValue(), (Bundle) obj3, (String) obj4, (String) obj5);
                        }
                    });
                    return Unit.INSTANCE;
                }
                C41076a.f91293a.m90059a("-200001");
                C43846g.m96568c(new KycMessage("channel:" + this.$channel + " token(" + str2 + ") or dataCenter" + str3 + " is null or empty", "KCHybridBridgeFaceSdk", false, 4, null), null, 2, null);
                this.$callback.invoke(MapsKt.mapOf(new Pair(DbParams.KEY_CHANNEL_RESULT, CredentialEntry.FALSE_STRING)), new ProtocolException("-200001", null, "token or dataCenter is null or empty", false, 10, null));
                return Unit.INSTANCE;
            }
            C41076a.f91293a.m90059a("-200010");
            C43846g.m96568c(new KycMessage("channel:" + this.$channel + " data is null or Illegal", "KCHybridBridgeFaceSdk", false, 4, null), null, 2, null);
            this.$callback.invoke(MapsKt.mapOf(new Pair(DbParams.KEY_CHANNEL_RESULT, CredentialEntry.FALSE_STRING)), new ProtocolException("-200010", null, "data is null or empty", false, 10, null));
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            C41076a.f91293a.m90059a("-299999");
            C43846g.m96568c(new KycException(th2, "KCHybridBridgeFaceSdk", false, null, 8, null), null, 2, null);
            this.$callback.invoke(null, new ProtocolException("-299999", th2, th2.getMessage(), false, 8, null));
        }
    }
}
