package com.kubi.sdk.site.net;

import com.kubi.mvi.common.MviExKt;
import com.kubi.sdk.site.SiteService;
import com.kubi.sdk.site.SiteType;
import com.kubi.sdk.site.config.SiteInfoProxy;
import com.kubi.sdk.site.config.SupportSiteManager;
import com.kubi.sdk.site.exception.SiteException;
import com.kubi.sdk.site.exception.SiteMessage;
import com.kubi.sdk.site.helper.ActivityHelper;
import com.kubi.sdk.site.helper.ReportHelper;
import com.kubi.user.account.AccountChangeType;
import com.kubi.user.account.MultiAccountBizErrorHandler;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.InterfaceC41709m0;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import p569qq.C43840a;
import p569qq.C43846g;
import p764xk.BizErrorInfo;
import p764xk.InterfaceC46255c;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: NetSiteErrorReceiver.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0082@¢\u0006\u0002\u0010\bJ\u0016\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0082@¢\u0006\u0002\u0010\bJ\u0011\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0002¨\u0006\f"}, m90084d2 = {"Lcom/kubi/sdk/site/net/NetSiteErrorReceiver;", "Lcom/kubi/kucoin/callback/INetBusinessErrorReceiver;", "<init>", "()V", "handle", "", "errorInfo", "Lcom/kubi/kucoin/callback/BizErrorInfo;", "(Lcom/kubi/kucoin/callback/BizErrorInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleLegacySiteError", "invoke", "Companion", "LSite_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nNetSiteErrorReceiver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetSiteErrorReceiver.kt\ncom/kubi/sdk/site/net/NetSiteErrorReceiver\n+ 2 SiteIssue.kt\ncom/kubi/sdk/site/exception/SiteIssueKt\n*L\n1#1,124:1\n50#2,3:125\n50#2,3:128\n50#2,3:131\n50#2,3:134\n45#2,3:137\n*S KotlinDebug\n*F\n+ 1 NetSiteErrorReceiver.kt\ncom/kubi/sdk/site/net/NetSiteErrorReceiver\n*L\n68#1:125,3\n77#1:128,3\n97#1:131,3\n101#1:134,3\n120#1:137,3\n*E\n"})
public final class NetSiteErrorReceiver implements InterfaceC46255c {

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Companion f47933b = new Companion(null);

    /* JADX INFO: compiled from: NetSiteErrorReceiver.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/sdk/site/net/NetSiteErrorReceiver$Companion;", "", "<init>", "()V", "TAG", "", "SITE_ERROR", "LSite_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.sdk.site.net.NetSiteErrorReceiver$invoke$1 */
    /* JADX INFO: compiled from: NetSiteErrorReceiver.kt */
    /* JADX INFO: loaded from: classes45.dex */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.sdk.site.net.NetSiteErrorReceiver$invoke$1", m90122f = "NetSiteErrorReceiver.kt", m90123i = {}, m90124l = {117}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C241601 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ BizErrorInfo $errorInfo;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C241601(BizErrorInfo bizErrorInfo, Continuation<? super C241601> continuation) {
            super(2, continuation);
            this.$errorInfo = bizErrorInfo;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return NetSiteErrorReceiver.this.new C241601(this.$errorInfo, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C241601) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                NetSiteErrorReceiver netSiteErrorReceiver = NetSiteErrorReceiver.this;
                BizErrorInfo bizErrorInfo = this.$errorInfo;
                this.label = 1;
                if (netSiteErrorReceiver.m58158d(bizErrorInfo, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.sdk.site.net.NetSiteErrorReceiver$a */
    /* JADX INFO: compiled from: NetSiteErrorReceiver.kt */
    /* JADX INFO: loaded from: classes45.dex */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C24159a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MultiAccountBizErrorHandler.DispatchResult.values().length];
            try {
                iArr[MultiAccountBizErrorHandler.DispatchResult.NON_CURRENT_HANDLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MultiAccountBizErrorHandler.DispatchResult.SKIPPED_NO_MATCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MultiAccountBizErrorHandler.DispatchResult.LEGACY_EXECUTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: e */
    public static final Unit m58157e() {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0206  */
    /* JADX WARN: Code duplicated, block: B:49:0x0224  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Instruction removed from duplicated block: B:48:0x0206, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:49:0x0224, please report this as an issue */
    /* JADX INFO: renamed from: f */
    public final Object m58159f(BizErrorInfo bizErrorInfo, Continuation<? super Unit> continuation) {
        NetSiteErrorReceiver$handleLegacySiteError$1 netSiteErrorReceiver$handleLegacySiteError$1;
        JSONObject body;
        String strEncodedPath;
        JSONObject jSONObjectOptJSONObject;
        String strOptString;
        boolean zOptBoolean;
        String str;
        String str2;
        String str3;
        if (continuation instanceof NetSiteErrorReceiver$handleLegacySiteError$1) {
            netSiteErrorReceiver$handleLegacySiteError$1 = (NetSiteErrorReceiver$handleLegacySiteError$1) continuation;
            int i11 = netSiteErrorReceiver$handleLegacySiteError$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                netSiteErrorReceiver$handleLegacySiteError$1.label = i11 - Integer.MIN_VALUE;
            } else {
                netSiteErrorReceiver$handleLegacySiteError$1 = new NetSiteErrorReceiver$handleLegacySiteError$1(this, continuation);
            }
        } else {
            netSiteErrorReceiver$handleLegacySiteError$1 = new NetSiteErrorReceiver$handleLegacySiteError$1(this, continuation);
        }
        NetSiteErrorReceiver$handleLegacySiteError$1 netSiteErrorReceiver$handleLegacySiteError$2 = netSiteErrorReceiver$handleLegacySiteError$1;
        Object obj = netSiteErrorReceiver$handleLegacySiteError$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = netSiteErrorReceiver$handleLegacySiteError$2.label;
        if (i12 != 0) {
            if (i12 == 1) {
                boolean z11 = netSiteErrorReceiver$handleLegacySiteError$2.Z$0;
                String str4 = (String) netSiteErrorReceiver$handleLegacySiteError$2.L$5;
                String str5 = (String) netSiteErrorReceiver$handleLegacySiteError$2.L$4;
                jSONObjectOptJSONObject = (JSONObject) netSiteErrorReceiver$handleLegacySiteError$2.L$3;
                String str6 = (String) netSiteErrorReceiver$handleLegacySiteError$2.L$2;
                body = (JSONObject) netSiteErrorReceiver$handleLegacySiteError$2.L$1;
                BizErrorInfo bizErrorInfo2 = (BizErrorInfo) netSiteErrorReceiver$handleLegacySiteError$2.L$0;
                ResultKt.throwOnFailure(obj);
                zOptBoolean = z11;
                bizErrorInfo = bizErrorInfo2;
                strEncodedPath = str6;
                strOptString = str5;
                str = str4;
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str3 = (String) netSiteErrorReceiver$handleLegacySiteError$2.L$5;
                str2 = (String) netSiteErrorReceiver$handleLegacySiteError$2.L$2;
                ResultKt.throwOnFailure(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                C44128b.m97266j("NetSiteErrorReceiver", "handle_site_error[" + str2 + "] startSwitchSite " + str3 + " success");
            } else {
                C44128b.m97270n("NetSiteErrorReceiver", "handle_site_error[" + str2 + "] startSwitchSite " + str3 + " cancel");
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        body = bizErrorInfo.getBody();
        strEncodedPath = bizErrorInfo.getRequest().url().encodedPath();
        jSONObjectOptJSONObject = body.optJSONObject("data");
        if (jSONObjectOptJSONObject == null) {
            String str7 = "handle_site_error[" + strEncodedPath + "] data_empty";
            C44128b.m97261e("NetSiteErrorReceiver", str7);
            C43846g.m96568c(new SiteMessage(str7, "NetSiteErrorReceiver", false, 4, null), null, 2, null);
            return Unit.INSTANCE;
        }
        strOptString = jSONObjectOptJSONObject.optString("siteType");
        zOptBoolean = jSONObjectOptJSONObject.optBoolean("forceRedirect");
        SiteInfoProxy.f47889a.m58055h(zOptBoolean);
        C44128b.m97266j("NetSiteErrorReceiver", "handle_site_error[" + strEncodedPath + "] code=308100, siteType=" + strOptString + ", forceRedirect=" + zOptBoolean);
        if (strOptString == null || strOptString.length() == 0) {
            String str8 = "handle_site_error[" + strEncodedPath + "] site_empty";
            C44128b.m97261e("NetSiteErrorReceiver", str8);
            C43846g.m96568c(new SiteMessage(str8, "NetSiteErrorReceiver", false, 4, null), null, 2, null);
            return Unit.INSTANCE;
        }
        if (ActivityHelper.f47910a.m58096c()) {
            ReportHelper.f47911a.m58105d(strOptString, SiteService.SwitchFromType.Gateway, "inMigration");
            return Unit.INSTANCE;
        }
        C43840a.m96550d("handle_site_error[" + strEncodedPath + "] body_invalid data=" + strOptString, "NetSiteErrorReceiver");
        if (!SupportSiteManager.m58057h(SupportSiteManager.f47892a, strOptString, false, 2, null)) {
            String str9 = "handle_site_error[" + strEncodedPath + "] not support site";
            C44128b.m97261e("NetSiteErrorReceiver", str9);
            C43846g.m96568c(new SiteMessage(str9, "NetSiteErrorReceiver", false, 4, null), null, 2, null);
            return Unit.INSTANCE;
        }
        if (Intrinsics.areEqual(strOptString, SiteType.INSTANCE.getCurrentSiteType())) {
            String str10 = "handle_site_error[" + strEncodedPath + "] body_same";
            C44128b.m97261e("NetSiteErrorReceiver", str10);
            C43846g.m96568c(new SiteMessage(str10, "NetSiteErrorReceiver", false, 4, null), null, 2, null);
            return Unit.INSTANCE;
        }
        C44128b.m97266j("NetSiteErrorReceiver", "SiteService.startSwitchSite start, siteType=" + strOptString);
        netSiteErrorReceiver$handleLegacySiteError$2.L$0 = SpillingKt.nullOutSpilledVariable(bizErrorInfo);
        netSiteErrorReceiver$handleLegacySiteError$2.L$1 = SpillingKt.nullOutSpilledVariable(body);
        netSiteErrorReceiver$handleLegacySiteError$2.L$2 = strEncodedPath;
        netSiteErrorReceiver$handleLegacySiteError$2.L$3 = SpillingKt.nullOutSpilledVariable(jSONObjectOptJSONObject);
        netSiteErrorReceiver$handleLegacySiteError$2.L$4 = SpillingKt.nullOutSpilledVariable(strOptString);
        netSiteErrorReceiver$handleLegacySiteError$2.L$5 = strOptString;
        netSiteErrorReceiver$handleLegacySiteError$2.Z$0 = zOptBoolean;
        netSiteErrorReceiver$handleLegacySiteError$2.label = 1;
        if (DelayKt.m90350b(2000L, netSiteErrorReceiver$handleLegacySiteError$2) != coroutine_suspended) {
            str = strOptString;
        }
        return coroutine_suspended;
        SiteService siteService = SiteService.f47793a;
        SiteService.SwitchFromType switchFromType = SiteService.SwitchFromType.Gateway;
        netSiteErrorReceiver$handleLegacySiteError$2.L$0 = SpillingKt.nullOutSpilledVariable(bizErrorInfo);
        netSiteErrorReceiver$handleLegacySiteError$2.L$1 = SpillingKt.nullOutSpilledVariable(body);
        netSiteErrorReceiver$handleLegacySiteError$2.L$2 = strEncodedPath;
        netSiteErrorReceiver$handleLegacySiteError$2.L$3 = SpillingKt.nullOutSpilledVariable(jSONObjectOptJSONObject);
        netSiteErrorReceiver$handleLegacySiteError$2.L$4 = SpillingKt.nullOutSpilledVariable(strOptString);
        netSiteErrorReceiver$handleLegacySiteError$2.L$5 = str;
        netSiteErrorReceiver$handleLegacySiteError$2.Z$0 = zOptBoolean;
        netSiteErrorReceiver$handleLegacySiteError$2.label = 2;
        Object objM57981G = SiteService.m57981G(siteService, str, switchFromType, null, null, netSiteErrorReceiver$handleLegacySiteError$2, 12, null);
        if (objM57981G != coroutine_suspended) {
            str2 = strEncodedPath;
            obj = objM57981G;
            str3 = str;
            if (((Boolean) obj).booleanValue()) {
                C44128b.m97266j("NetSiteErrorReceiver", "handle_site_error[" + str2 + "] startSwitchSite " + str3 + " success");
            } else {
                C44128b.m97270n("NetSiteErrorReceiver", "handle_site_error[" + str2 + "] startSwitchSite " + str3 + " cancel");
            }
            return Unit.INSTANCE;
        }
        return coroutine_suspended;
    }

    /* JADX INFO: renamed from: g */
    public void m58160g(@NotNull BizErrorInfo errorInfo) {
        Intrinsics.checkNotNullParameter(errorInfo, "errorInfo");
        try {
            MviExKt.m42518n(new C241601(errorInfo, null));
        } catch (Exception e11) {
            C44128b.m97263g("NetSiteErrorReceiver", e11);
            C43846g.m96568c(new SiteException(e11, "NetSiteErrorReceiver", false, null, 8, null), null, 2, null);
        }
    }

    @Override // p852kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m58160g((BizErrorInfo) obj);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d */
    public final Object m58158d(BizErrorInfo bizErrorInfo, Continuation<? super Unit> continuation) {
        JSONObject body = bizErrorInfo.getBody();
        bizErrorInfo.getRequest().url().encodedPath();
        String strOptString = body.optString("code");
        if (strOptString == null) {
            return Unit.INSTANCE;
        }
        if (!Intrinsics.areEqual(strOptString, "308100")) {
            return Unit.INSTANCE;
        }
        int i11 = C24159a.$EnumSwitchMapping$0[MultiAccountBizErrorHandler.m65468b(MultiAccountBizErrorHandler.f53654a, bizErrorInfo.getRequest().header("X-APP-TOKEN"), AccountChangeType.TYPE_308100, new Function0() { // from class: com.kubi.sdk.site.net.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NetSiteErrorReceiver.m58157e();
            }
        }, null, 8, null).ordinal()];
        if (i11 != 1 && i11 != 2) {
            if (i11 == 3) {
                Object objM58159f = m58159f(bizErrorInfo, continuation);
                if (objM58159f == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    return objM58159f;
                }
                return Unit.INSTANCE;
            }
            throw new NoWhenBranchMatchedException();
        }
        C44128b.m97266j("NetSiteErrorReceiver", "是子账户，不跳转切站点逻辑");
        return Unit.INSTANCE;
    }
}
