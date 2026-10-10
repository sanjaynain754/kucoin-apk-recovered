package com.kubi.sdk.site.helper;

import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.otc.entity.OtcAd;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.sdk.site.SiteService;
import com.kubi.sdk.site.config.SiteInfoProxy;
import com.kubi.sdk.site.config.SupportSiteManager;
import com.kubi.sdk.site.exception.SiteException;
import com.kubi.utils.extensions.C27025c;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.lang.reflect.Type;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43840a;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: SiteBridgeKnbHelper.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J4\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u001c\u0010\t\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u00070\nH\u0086@¢\u0006\u0002\u0010\rJ4\u0010\u000e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u001c\u0010\t\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u00070\nH\u0086@¢\u0006\u0002\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/sdk/site/helper/SiteBridgeKnbHelper;", "", "<init>", "()V", "TAG", "", "startChangeSite", "", "siteType", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "", "Lcom/kubi/sdk/protocol/ProtocolException;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startChangeSiteDirectly", "LSite_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSiteBridgeKnbHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SiteBridgeKnbHelper.kt\ncom/kubi/sdk/site/helper/SiteBridgeKnbHelper\n+ 2 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 3 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n+ 4 SiteIssue.kt\ncom/kubi/sdk/site/exception/SiteIssueKt\n*L\n1#1,74:1\n35#2,4:75\n39#2:81\n35#2,4:85\n39#2:91\n44#3,2:79\n44#3,2:89\n45#4,3:82\n45#4,3:92\n*S KotlinDebug\n*F\n+ 1 SiteBridgeKnbHelper.kt\ncom/kubi/sdk/site/helper/SiteBridgeKnbHelper\n*L\n23#1:75,4\n23#1:81\n52#1:85,4\n52#1:91\n23#1:79,2\n52#1:89,2\n41#1:82,3\n69#1:92,3\n*E\n"})
public final class SiteBridgeKnbHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final SiteBridgeKnbHelper f47909a = new SiteBridgeKnbHelper();

    /* JADX INFO: renamed from: com.kubi.sdk.site.helper.SiteBridgeKnbHelper$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class C24139a extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: com.kubi.sdk.site.helper.SiteBridgeKnbHelper$b */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class C24140b extends TypeToken<Boolean> {
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    @Nullable
    /* JADX INFO: renamed from: a */
    public final Object m58092a(@NotNull String str, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> function2, @NotNull Continuation<? super Unit> continuation) {
        SiteBridgeKnbHelper$startChangeSite$1 siteBridgeKnbHelper$startChangeSite$1;
        Object objM20457a;
        Function2<? super Boolean, ? super ProtocolException, Unit> function3;
        Function2<? super Boolean, ? super ProtocolException, Unit> function4 = function2;
        if (continuation instanceof SiteBridgeKnbHelper$startChangeSite$1) {
            siteBridgeKnbHelper$startChangeSite$1 = (SiteBridgeKnbHelper$startChangeSite$1) continuation;
            int i11 = siteBridgeKnbHelper$startChangeSite$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                siteBridgeKnbHelper$startChangeSite$1.label = i11 - Integer.MIN_VALUE;
            } else {
                siteBridgeKnbHelper$startChangeSite$1 = new SiteBridgeKnbHelper$startChangeSite$1(this, continuation);
            }
        } else {
            siteBridgeKnbHelper$startChangeSite$1 = new SiteBridgeKnbHelper$startChangeSite$1(this, continuation);
        }
        SiteBridgeKnbHelper$startChangeSite$1 siteBridgeKnbHelper$startChangeSite$2 = siteBridgeKnbHelper$startChangeSite$1;
        Object objM57981G = siteBridgeKnbHelper$startChangeSite$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = siteBridgeKnbHelper$startChangeSite$2.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM57981G);
            try {
                C43840a.m96550d("siteType error " + str, "SiteBridgeKnbHelper");
                try {
                    RemoteConfig remoteConfig = RemoteConfig.f19636a;
                    Type type = new C24139a().getType();
                    Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
                    objM20457a = RemoteConfig.m20457a("kc_site_support_knb", type);
                } catch (Throwable th2) {
                    C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
                    objM20457a = null;
                }
                if (C27025c.m66567e((Boolean) objM20457a, true) && !SupportSiteManager.m58057h(SupportSiteManager.f47892a, str, false, 2, null)) {
                    ReportHelper.f47911a.m58105d(str, SiteService.SwitchFromType.Bridge, "siteTypeNotSupport");
                    function4.invoke(null, new ProtocolException(OtcAd.KYC_NOT_PASS, null, "siteType error", false, 10, null));
                    return Unit.INSTANCE;
                }
                SiteService.SwitchFromType switchFromType = ActivityHelper.f47910a.m58096c() ? SiteService.SwitchFromType.Migration : SiteService.SwitchFromType.Bridge;
                SiteInfoProxy.f47889a.m58055h(true);
                SiteService siteService = SiteService.f47793a;
                siteBridgeKnbHelper$startChangeSite$2.L$0 = SpillingKt.nullOutSpilledVariable(str);
                siteBridgeKnbHelper$startChangeSite$2.L$1 = function4;
                siteBridgeKnbHelper$startChangeSite$2.L$2 = SpillingKt.nullOutSpilledVariable(switchFromType);
                siteBridgeKnbHelper$startChangeSite$2.label = 1;
                objM57981G = SiteService.m57981G(siteService, str, switchFromType, null, null, siteBridgeKnbHelper$startChangeSite$2, 12, null);
                if (objM57981G == coroutine_suspended) {
                    return coroutine_suspended;
                }
                function3 = function4;
            } catch (Throwable th3) {
                th = th3;
                Throwable th4 = th;
                C44128b.m97263g("SiteBridgeKnbHelper", th4);
                C43846g.m96568c(new SiteException(th4, "SiteBridgeKnbHelper", false, null, 8, null), null, 2, null);
                function4.invoke(null, new ProtocolException(OtcAd.KYC_NOT_PASS, th4, "siteType error", false, 8, null));
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            function3 = (Function2) siteBridgeKnbHelper$startChangeSite$2.L$1;
            try {
                ResultKt.throwOnFailure(objM57981G);
            } catch (Throwable th5) {
                th = th5;
                function4 = function3;
                Throwable th6 = th;
                C44128b.m97263g("SiteBridgeKnbHelper", th6);
                C43846g.m96568c(new SiteException(th6, "SiteBridgeKnbHelper", false, null, 8, null), null, 2, null);
                function4.invoke(null, new ProtocolException(OtcAd.KYC_NOT_PASS, th6, "siteType error", false, 8, null));
            }
        }
        function3.invoke(Boxing.boxBoolean(((Boolean) objM57981G).booleanValue()), null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    @Nullable
    /* JADX INFO: renamed from: b */
    public final Object m58093b(@NotNull String str, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> function2, @NotNull Continuation<? super Unit> continuation) {
        SiteBridgeKnbHelper$startChangeSiteDirectly$1 siteBridgeKnbHelper$startChangeSiteDirectly$1;
        Throwable th2;
        Object objM20457a;
        Function2<? super Boolean, ? super ProtocolException, Unit> function3;
        Function2<? super Boolean, ? super ProtocolException, Unit> function4 = function2;
        if (continuation instanceof SiteBridgeKnbHelper$startChangeSiteDirectly$1) {
            siteBridgeKnbHelper$startChangeSiteDirectly$1 = (SiteBridgeKnbHelper$startChangeSiteDirectly$1) continuation;
            int i11 = siteBridgeKnbHelper$startChangeSiteDirectly$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                siteBridgeKnbHelper$startChangeSiteDirectly$1.label = i11 - Integer.MIN_VALUE;
            } else {
                siteBridgeKnbHelper$startChangeSiteDirectly$1 = new SiteBridgeKnbHelper$startChangeSiteDirectly$1(this, continuation);
            }
        } else {
            siteBridgeKnbHelper$startChangeSiteDirectly$1 = new SiteBridgeKnbHelper$startChangeSiteDirectly$1(this, continuation);
        }
        SiteBridgeKnbHelper$startChangeSiteDirectly$1 siteBridgeKnbHelper$startChangeSiteDirectly$2 = siteBridgeKnbHelper$startChangeSiteDirectly$1;
        Object objM57997F = siteBridgeKnbHelper$startChangeSiteDirectly$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = siteBridgeKnbHelper$startChangeSiteDirectly$2.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM57997F);
            try {
                C43840a.m96550d("siteType error directly " + str, "SiteBridgeKnbHelper");
                try {
                    RemoteConfig remoteConfig = RemoteConfig.f19636a;
                    Type type = new C24140b().getType();
                    Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
                    objM20457a = RemoteConfig.m20457a("kc_site_support_knb_v2", type);
                } catch (Throwable th3) {
                    C43846g.m96568c(new KCConfigException(th3, "RemoteConfig", false, null, 8, null), null, 2, null);
                    objM20457a = null;
                }
                if (C27025c.m66567e((Boolean) objM20457a, true) && !SupportSiteManager.m58057h(SupportSiteManager.f47892a, str, false, 2, null)) {
                    ReportHelper.f47911a.m58105d(str, SiteService.SwitchFromType.Bridge, "siteTypeNotSupport");
                    function4.invoke(null, new ProtocolException(OtcAd.KYC_NOT_PASS, null, "directly siteType error", false, 10, null));
                    return Unit.INSTANCE;
                }
                SiteService.SwitchFromType switchFromType = ActivityHelper.f47910a.m58096c() ? SiteService.SwitchFromType.Migration : SiteService.SwitchFromType.Bridge;
                SiteService siteService = SiteService.f47793a;
                Boolean boolBoxBoolean = Boxing.boxBoolean(true);
                siteBridgeKnbHelper$startChangeSiteDirectly$2.L$0 = SpillingKt.nullOutSpilledVariable(str);
                siteBridgeKnbHelper$startChangeSiteDirectly$2.L$1 = function4;
                siteBridgeKnbHelper$startChangeSiteDirectly$2.L$2 = SpillingKt.nullOutSpilledVariable(switchFromType);
                siteBridgeKnbHelper$startChangeSiteDirectly$2.label = 1;
                objM57997F = siteService.m57997F(str, switchFromType, null, boolBoxBoolean, siteBridgeKnbHelper$startChangeSiteDirectly$2);
                if (objM57997F == coroutine_suspended) {
                    return coroutine_suspended;
                }
                function3 = function4;
            } catch (Throwable th4) {
                th2 = th4;
                C44128b.m97263g("SiteBridgeKnbHelper", th2);
                C43846g.m96568c(new SiteException(th2, "SiteBridgeKnbHelper", false, null, 8, null), null, 2, null);
                function4.invoke(null, new ProtocolException(OtcAd.KYC_NOT_PASS, th2, "directly siteType error", false, 8, null));
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            function3 = (Function2) siteBridgeKnbHelper$startChangeSiteDirectly$2.L$1;
            try {
                ResultKt.throwOnFailure(objM57997F);
            } catch (Throwable th5) {
                th2 = th5;
                function4 = function3;
                C44128b.m97263g("SiteBridgeKnbHelper", th2);
                C43846g.m96568c(new SiteException(th2, "SiteBridgeKnbHelper", false, null, 8, null), null, 2, null);
                function4.invoke(null, new ProtocolException(OtcAd.KYC_NOT_PASS, th2, "directly siteType error", false, 8, null));
            }
        }
        function3.invoke(Boxing.boxBoolean(((Boolean) objM57997F).booleanValue()), null);
        return Unit.INSTANCE;
    }
}
