package com.kubi.mine.lib.manger;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleCoroutineScope;
import bw.C4719f0;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.home.common.card.HomeCardViewHolderProxy;
import com.kubi.mine.R$string;
import com.kubi.mine.lib.entity.AppUpgradeEntityV2;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.resources.GlobalDialogManager;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.sdk.BaseApplication;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27023a;
import com.kubi.utils.extensions.C27039d;
import java.lang.reflect.Type;
import kotlinx.coroutines.C41696j;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p319hq.InterfaceC38284a;
import p481ny.C42899b;
import p538pq.C43521a;
import p569qq.C43846g;
import p694vk.AbstractC45585n0;
import p694vk.C45591t;
import p795yf.C46482h;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: AppUpgradeMangerV2.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JI\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\u0018H\u0000¢\u0006\u0002\b\u0019JD\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\u0018H\u0002JD\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\u0018H\u0002JD\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\u0018H\u0002JD\u0010\u001f\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\u0018H\u0002J6\u0010 \u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000f2\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\u0018H\u0002J\b\u0010!\u001a\u00020\rH\u0002J\u0010\u0010\"\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006#"}, m90084d2 = {"Lcom/kubi/mine/lib/manger/AppUpgradeMangerV2;", "", "<init>", "()V", "ONE_DAY", "", "mAppUpgradeApi", "Lcom/kubi/mine/lib/api/AppUpgradeApi;", "getMAppUpgradeApi", "()Lcom/kubi/mine/lib/api/AppUpgradeApi;", "mAppUpgradeApi$delegate", "Lkotlin/Lazy;", "checkUpgrade", "", "appUpgradeType", "Lcom/kubi/kucoin/UpgradeType;", "manager", "Landroidx/fragment/app/FragmentManager;", "lifecycleScope", "Landroidx/lifecycle/LifecycleCoroutineScope;", "isPageShow", "Lkotlin/Function0;", "", "dialogShow", "Lkotlin/Function1;", "checkUpgrade$MineLib_googleRelease", "getUpgradeInfo", "preShowDialog", "appUpgradeInfo", "Lcom/kubi/mine/lib/entity/AppUpgradeEntityV2;", "preCommonUpgradeDialog", "preHomePageUpgradeDialog", "showUpgradeDialog", "upgradeNoVersionToast", "upgradeDialogTrackExpose", "MineLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAppUpgradeMangerV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppUpgradeMangerV2.kt\ncom/kubi/mine/lib/manger/AppUpgradeMangerV2\n+ 2 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 3 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n+ 4 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n*L\n1#1,259:1\n35#2,4:260\n39#2:266\n44#3,2:264\n158#4,2:267\n*S KotlinDebug\n*F\n+ 1 AppUpgradeMangerV2.kt\ncom/kubi/mine/lib/manger/AppUpgradeMangerV2\n*L\n121#1:260,4\n121#1:266\n121#1:264,2\n233#1:267,2\n*E\n"})
public final class AppUpgradeMangerV2 {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final AppUpgradeMangerV2 f35086a = new AppUpgradeMangerV2();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Lazy f35087b = LazyKt.lazy(new Function0() { // from class: com.kubi.mine.lib.manger.j
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AppUpgradeMangerV2.m41725i();
        }
    });

    /* JADX INFO: renamed from: com.kubi.mine.lib.manger.AppUpgradeMangerV2$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    /* JADX INFO: loaded from: classes29.dex */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class C18966a extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: i */
    public static final InterfaceC38284a m41725i() {
        return (InterfaceC38284a) RetrofitFlowExKt.m42820a(InterfaceC38284a.class);
    }

    /* JADX INFO: renamed from: m */
    public static final Unit m41726m(AppUpgradeEntityV2 appUpgradeEntityV2, AbstractC45585n0 abstractC45585n0, Function1 function1, FragmentActivity it) throws JSONException {
        Intrinsics.checkNotNullParameter(it, "it");
        AppUpgradeMangerV2 appUpgradeMangerV2 = f35086a;
        FragmentManager supportFragmentManager = it.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        appUpgradeMangerV2.m41733n(appUpgradeEntityV2, supportFragmentManager, abstractC45585n0, function1);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f */
    public final void m41727f(@NotNull AbstractC45585n0 appUpgradeType, @NotNull FragmentManager manager, @NotNull LifecycleCoroutineScope lifecycleScope, @NotNull Function0<Boolean> isPageShow, @Nullable Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(appUpgradeType, "appUpgradeType");
        Intrinsics.checkNotNullParameter(manager, "manager");
        Intrinsics.checkNotNullParameter(lifecycleScope, "lifecycleScope");
        Intrinsics.checkNotNullParameter(isPageShow, "isPageShow");
        m41729h(manager, lifecycleScope, appUpgradeType, isPageShow, function1);
    }

    /* JADX INFO: renamed from: g */
    public final InterfaceC38284a m41728g() {
        return (InterfaceC38284a) f35087b.getValue();
    }

    /* JADX INFO: renamed from: h */
    public final void m41729h(FragmentManager fragmentManager, LifecycleCoroutineScope lifecycleCoroutineScope, AbstractC45585n0 abstractC45585n0, Function0<Boolean> function0, Function1<? super Boolean, Unit> function1) {
        if (C46482h.m102544b(BaseApplication.INSTANCE.get())) {
            C41696j.m91104d(lifecycleCoroutineScope, C42911a.m94120b(), null, new AppUpgradeMangerV2$getUpgradeInfo$1(abstractC45585n0, fragmentManager, function0, function1, null), 2, null);
        } else {
            C45591t.f102713a.m100681a("appUpgradeDialog-notNetwork");
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m41732l(final AppUpgradeEntityV2 appUpgradeEntityV2, FragmentManager fragmentManager, final AbstractC45585n0 abstractC45585n0, Function0<Boolean> function0, final Function1<? super Boolean, Unit> function1) throws JSONException {
        Object objM20457a;
        C45591t c45591t = C45591t.f102713a;
        c45591t.m100681a("appUpgradeDialog-preShowDialog");
        if (appUpgradeEntityV2.getUpgradeType() != 1) {
            if (abstractC45585n0 instanceof AbstractC45585n0.c) {
                m41731k(appUpgradeEntityV2, fragmentManager, abstractC45585n0, function0, function1);
                return;
            }
            if (abstractC45585n0 instanceof AbstractC45585n0.a) {
                m41730j(appUpgradeEntityV2, fragmentManager, abstractC45585n0, function0, function1);
                return;
            } else if ((abstractC45585n0 instanceof AbstractC45585n0.d) || (abstractC45585n0 instanceof AbstractC45585n0.b)) {
                m41733n(appUpgradeEntityV2, fragmentManager, abstractC45585n0, function1);
                return;
            } else {
                c45591t.m100681a("appUpgradeDialog-unknownUpgradeType");
                return;
            }
        }
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new C18966a().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("android_appupgradedialog_v2force", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        Boolean bool = (Boolean) objM20457a;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        C45591t.f102713a.m100681a("appUpgradeDialog-isForceOpen " + zBooleanValue);
        if (zBooleanValue) {
            C42899b.m94073c(new Function1() { // from class: com.kubi.mine.lib.manger.k
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AppUpgradeMangerV2.m41726m(appUpgradeEntityV2, abstractC45585n0, function1, (FragmentActivity) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m41733n(AppUpgradeEntityV2 appUpgradeEntityV2, FragmentManager fragmentManager, AbstractC45585n0 abstractC45585n0, Function1<? super Boolean, Unit> function1) throws JSONException {
        C45591t c45591t = C45591t.f102713a;
        c45591t.m100681a("appUpgradeDialog-showUpgradeDialog");
        if (GlobalDialogManager.f43651a.m54344i()) {
            c45591t.m100681a("appUpgradeDialog-hasDialog");
            return;
        }
        DialogFragmentHelper dialogFragmentHelperM41750d = AppUpgradeDialogMangerV2.f35102a.m41750d(abstractC45585n0, appUpgradeEntityV2);
        C4719f0.m4767h(C4719f0.f4716a, dialogFragmentHelperM41750d, fragmentManager, "appShowUpgradeDialog", 0, 4, null);
        if (function1 != null) {
            function1.invoke(Boolean.TRUE);
        }
        if (C12573b.f21598a.m23696a()) {
            "event_auto_clean_show".length();
        }
        C12572a.m23692a(dialogFragmentHelperM41750d, true, new AppUpgradeMangerV2$showUpgradeDialog$$inlined$bindFlowEvent$1("event_auto_clean_show", null, dialogFragmentHelperM41750d));
        C43521a.f96057a.m95765c(appUpgradeEntityV2);
        m41734o(appUpgradeEntityV2);
        c45591t.m100681a("appUpgradeDialog-showUpgradeDialog success");
    }

    /* JADX INFO: renamed from: o */
    public final void m41734o(AppUpgradeEntityV2 appUpgradeEntityV2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", appUpgradeEntityV2.getUpgradeType());
        jSONObject.put("token_id", appUpgradeEntityV2.getPopupId());
        Unit unit = Unit.INSTANCE;
        C27023a.m66556c(HomeCardViewHolderProxy.PAGE_ID, "upgrade", "1", jSONObject);
    }

    /* JADX INFO: renamed from: p */
    public final void m41735p() {
        ToastCompat.m66437C(R$string.strToastYourAreTheLatestVersion);
    }

    /* JADX INFO: renamed from: j */
    public final void m41730j(AppUpgradeEntityV2 appUpgradeEntityV2, FragmentManager fragmentManager, AbstractC45585n0 abstractC45585n0, Function0<Boolean> function0, Function1<? super Boolean, Unit> function1) throws JSONException {
        if (!function0.invoke().booleanValue()) {
            C45591t.f102713a.m100681a("appUpgradeDialog-checkUpgradeDialog-PageNotShow");
        } else {
            m41733n(appUpgradeEntityV2, fragmentManager, abstractC45585n0, function1);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m41731k(AppUpgradeEntityV2 appUpgradeEntityV2, FragmentManager fragmentManager, AbstractC45585n0 abstractC45585n0, Function0<Boolean> function0, Function1<? super Boolean, Unit> function1) throws JSONException {
        if (!function0.invoke().booleanValue()) {
            C45591t.f102713a.m100681a("appUpgradeDialog-homeShowUpgradeDialog-PageNotShow");
            return;
        }
        C43521a c43521a = C43521a.f96057a;
        if (!Intrinsics.areEqual(c43521a.m95767e(), appUpgradeEntityV2.getPopupId())) {
            C45591t.f102713a.m100681a("task id = " + c43521a.m95767e() + " --> " + appUpgradeEntityV2.getPopupId());
            m41733n(appUpgradeEntityV2, fragmentManager, abstractC45585n0, function1);
            return;
        }
        boolean z11 = true;
        int iM66651k = C27039d.m66651k(appUpgradeEntityV2.getFrequencyLimit(), 1);
        long jM95766d = c43521a.m95766d();
        C45591t c45591t = C45591t.f102713a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("appUpgradeDialog-homeShowUpgradeDialog frequency=");
        sb2.append(iM66651k);
        sb2.append(" oldTime=");
        sb2.append(jM95766d);
        sb2.append(" timeout=");
        long j11 = 86400000 * iM66651k;
        if (System.currentTimeMillis() - jM95766d <= j11) {
            z11 = false;
        }
        sb2.append(z11);
        c45591t.m100681a(sb2.toString());
        if (iM66651k > 0 && System.currentTimeMillis() - jM95766d > j11) {
            m41733n(appUpgradeEntityV2, fragmentManager, abstractC45585n0, function1);
        }
    }
}
