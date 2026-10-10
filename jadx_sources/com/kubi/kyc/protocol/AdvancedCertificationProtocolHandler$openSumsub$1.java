package com.kubi.kyc.protocol;

import androidx.credentials.provider.CredentialEntry;
import com.kubi.kyc.exception.KycException;
import com.kubi.kyc.exception.KycMessage;
import com.kubi.sdk.BaseActivity;
import com.kubi.utils.C27099x;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.tencent.bugly.proguard.InterfaceC33826o0;
import io.reactivex.disposables.CompositeDisposable;
import java.util.HashMap;
import kn.C41076a;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import o00.C42911a;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;
import sn.C44525c;
import tn.C45052j;
import tn.SumsubLaunchResult;

/* JADX INFO: compiled from: AdvancedCertificationProtocolHandler.kt */
/* JADX INFO: loaded from: classes21.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.kyc.protocol.AdvancedCertificationProtocolHandler$openSumsub$1", m90122f = "AdvancedCertificationProtocolHandler.kt", m90123i = {0, 0, 0}, m90124l = {267}, m90125m = "invokeSuspend", m90126n = {"this_$iv", "json$iv", "$i$f$fromJsonOrNull"}, m90127s = {"L$0", "L$1", "I$0"})
@SourceDebugExtension({"SMAP\nAdvancedCertificationProtocolHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdvancedCertificationProtocolHandler.kt\ncom/kubi/kyc/protocol/AdvancedCertificationProtocolHandler$openSumsub$1\n+ 2 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n+ 3 KycIssue.kt\ncom/kubi/kyc/exception/KycIssueKt\n*L\n1#1,264:1\n196#2,3:265\n48#3,2:268\n48#3,2:270\n44#3,2:272\n*S KotlinDebug\n*F\n+ 1 AdvancedCertificationProtocolHandler.kt\ncom/kubi/kyc/protocol/AdvancedCertificationProtocolHandler$openSumsub$1\n*L\n176#1:265,3\n179#1:268,2\n194#1:270,2\n237#1:272,2\n*E\n"})
public final class AdvancedCertificationProtocolHandler$openSumsub$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ BaseActivity $activity;
    final /* synthetic */ Function1<AdvancedCertificationResult, Unit> $callback;
    final /* synthetic */ String $channel;
    final /* synthetic */ String $data;
    int I$0;
    Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AdvancedCertificationProtocolHandler$openSumsub$1(String str, String str2, Function1<? super AdvancedCertificationResult, Unit> function1, BaseActivity baseActivity, Continuation<? super AdvancedCertificationProtocolHandler$openSumsub$1> continuation) {
        super(2, continuation);
        this.$data = str;
        this.$channel = str2;
        this.$callback = function1;
        this.$activity = baseActivity;
    }

    /* JADX INFO: renamed from: g */
    public static final Unit m36854g(final Function1 function1, BaseActivity baseActivity, String str, String str2, String str3, boolean z11) {
        if (z11) {
            C45052j.f101449a.m99646x(baseActivity, str, str2, str3, new Function1() { // from class: com.kubi.kyc.protocol.d
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AdvancedCertificationProtocolHandler$openSumsub$1.m36855h(function1, (SumsubLaunchResult) obj);
                }
            });
            return Unit.INSTANCE;
        }
        function1.invoke(AdvancedCertificationResult.f31242e.failure("-100002", "camera permission denied"));
        return Unit.INSTANCE;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdvancedCertificationProtocolHandler$openSumsub$1(this.$data, this.$channel, this.$callback, this.$activity, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((AdvancedCertificationProtocolHandler$openSumsub$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        try {
            if (i11 == 0) {
                ResultKt.throwOnFailure(obj);
                C27099x c27099x = C27099x.f54458a;
                String str = this.$data;
                InterfaceC41634e interfaceC41634eM90890N = C41636g.m90890N(C41636g.m90887K(new C17128xcfbb1758(str, null)), C42911a.m94120b());
                this.L$0 = SpillingKt.nullOutSpilledVariable(c27099x);
                this.L$1 = SpillingKt.nullOutSpilledVariable(str);
                this.I$0 = 0;
                this.label = 1;
                obj = C41636g.m90914f0(interfaceC41634eM90890N, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            HashMap map = (HashMap) obj;
            if (map != null && !map.isEmpty()) {
                final String str2 = (String) map.get(InterfaceC33826o0.f71244p);
                String str3 = (String) map.get("idDocType");
                final String str4 = str3 == null ? "" : str3;
                String str5 = (String) map.get("country");
                final String str6 = str5 == null ? "" : str5;
                if (str2 != null && str2.length() != 0) {
                    C44525c c44525c = C44525c.f98708a;
                    BaseActivity baseActivity = this.$activity;
                    CompositeDisposable destroyDisposable = baseActivity.getDestroyDisposable();
                    final Function1<AdvancedCertificationResult, Unit> function1 = this.$callback;
                    final BaseActivity baseActivity2 = this.$activity;
                    c44525c.m98534e(baseActivity, destroyDisposable, new Function1() { // from class: com.kubi.kyc.protocol.c
                        @Override // p852kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return AdvancedCertificationProtocolHandler$openSumsub$1.m36854g(function1, baseActivity2, str2, str4, str6, ((Boolean) obj2).booleanValue());
                        }
                    });
                    return Unit.INSTANCE;
                }
                C41076a.f91293a.m90059a("-100001");
                C43846g.m96568c(new KycMessage("channel:" + this.$channel + " token(" + str2 + ") is null or empty", "AdvancedCertificationProtocol", false, 4, null), null, 2, null);
                this.$callback.invoke(AdvancedCertificationResult.f31242e.failure("-100001", "token is null or empty"));
                return Unit.INSTANCE;
            }
            C41076a.f91293a.m90059a("-100007");
            C43846g.m96568c(new KycMessage("channel:" + this.$channel + " data is null or Illegal", "AdvancedCertificationProtocol", false, 4, null), null, 2, null);
            this.$callback.invoke(AdvancedCertificationResult.f31242e.failure("-100007", "data is null or empty"));
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            C41076a.f91293a.m90059a("-199999");
            C43846g.m96568c(new KycException(th2, "AdvancedCertificationProtocol", false, null, 8, null), null, 2, null);
            Function1<AdvancedCertificationResult, Unit> function2 = this.$callback;
            AdvancedCertificationResult.Companion companion = AdvancedCertificationResult.f31242e;
            String message = th2.getMessage();
            if (message == null) {
                message = "advanced certification failed";
            }
            function2.invoke(companion.failure("-199999", message));
        }
    }

    /* JADX INFO: renamed from: h */
    public static final Unit m36855h(Function1 function1, SumsubLaunchResult sumsubLaunchResult) {
        if (sumsubLaunchResult.getSuccess()) {
            function1.invoke(AdvancedCertificationResult.f31242e.success(MapsKt.mapOf(TuplesKt.m90091to(DbParams.KEY_CHANNEL_RESULT, CredentialEntry.TRUE_STRING))));
        } else {
            function1.invoke(AdvancedCertificationResult.f31242e.failure(sumsubLaunchResult.getCode(), sumsubLaunchResult.getMsg()));
        }
        return Unit.INSTANCE;
    }
}
