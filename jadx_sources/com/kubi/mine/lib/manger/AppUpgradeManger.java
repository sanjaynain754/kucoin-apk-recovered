package com.kubi.mine.lib.manger;

import android.content.res.Resources;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleCoroutineScope;
import com.blankj.utilcode.util.C5264d;
import com.kubi.home.common.card.HomeCardViewHolderProxy;
import com.kubi.mine.R$string;
import com.kubi.mine.lib.entity.AppUpgradeEntity;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.resources.GlobalDialogManager;
import com.kubi.sdk.BaseApplication;
import com.kubi.sdk.pkg.util.VersionUtils;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27023a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.coroutines.C41696j;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p319hq.InterfaceC38284a;
import p538pq.C43521a;
import p694vk.AbstractC45585n0;
import p694vk.C45590s;
import p694vk.C45591t;
import p795yf.C46482h;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: AppUpgradeManger.kt */
/* JADX INFO: loaded from: classes29.dex */
@Metadata(m90083d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010#\u001a\u00020\b2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001f0+H\u0000¢\u0006\u0002\b,J\u0016\u0010-\u001a\u00020\b2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001f0+H\u0002J.\u0010.\u001a\u00020\b2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010$\u001a\u00020%2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001f0+H\u0002J.\u0010/\u001a\u00020\b2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001f0+H\u0002J.\u00100\u001a\u00020\b2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010$\u001a\u00020%2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001f0+H\u0002J.\u00101\u001a\u00020\b2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001f0+H\u0002J.\u00102\u001a\u00020\b2\u0006\u00103\u001a\u00020\u001b2\u0006\u00104\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001f0+H\u0002J.\u00105\u001a\u00020\b2\u0006\u00106\u001a\u00020\u001b2\u0006\u0010&\u001a\u00020'2\u0006\u0010$\u001a\u00020%2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001f0+H\u0002J\u000e\u00107\u001a\u0002082\u0006\u0010&\u001a\u00020'J \u00109\u001a\u00020\b2\u0006\u0010:\u001a\u00020\u001b2\u0006\u0010&\u001a\u00020'2\u0006\u0010$\u001a\u00020%H\u0002J\u001e\u0010;\u001a\u00020\u001f2\u0006\u00104\u001a\u00020%2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001f0+H\u0002J\u0018\u0010<\u001a\u00020\b2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0002J \u0010=\u001a\u00020\b2\u0006\u0010$\u001a\u00020%2\u0006\u0010:\u001a\u00020\u001b2\u0006\u0010&\u001a\u00020'H\u0002J\b\u0010>\u001a\u00020\u001fH\u0002J\b\u0010?\u001a\u000208H\u0002J\u0010\u0010@\u001a\u0002082\u0006\u0010A\u001a\u00020\bH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001aX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u001f0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001f0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006B"}, m90084d2 = {"Lcom/kubi/mine/lib/manger/AppUpgradeManger;", "", "<init>", "()V", "KEY_UPGRADE_HOMEPAGE_MAP", "", "KEY_APPUPGRADE_MAP", "HTTP_GET_ASK_MAX", "", "RETURN_NOT_LEGALCHANNELS", "RETURN_NOT_PAGESHOW", "RETURN_NOT_NEWVERSION", "RETURN_DIALOGSHOWED", "RETURN_HASOTHERDIALOGSHOWING", "RETURN_HTTPGET_ASK_MAX", "RETURN_NOT_NETWORK", "RETURN_HTTPGET_ASK_ING", "RETURN_UNKNOWN_UPGRADETYPE", "RETURN_APPUPGRADEDIALOG_SHOWSUCC", "mAppUpgradeApi", "Lcom/kubi/mine/lib/api/AppUpgradeApi;", "getMAppUpgradeApi", "()Lcom/kubi/mine/lib/api/AppUpgradeApi;", "mAppUpgradeApi$delegate", "Lkotlin/Lazy;", "upgradeInfoMap", "", "Lcom/kubi/mine/lib/entity/AppUpgradeEntity;", "getUpgradeInfoMap$MineLib_googleRelease", "()Ljava/util/Map;", "getUpgradeInfoIngMap", "", "isNoVersionMap", "homePageUpgradeDialogShowEd", "homePageHttpAskNumber", "checkUpgrade", "appUpgradeType", "Lcom/kubi/kucoin/UpgradeType;", "manager", "Landroidx/fragment/app/FragmentManager;", "lifecycleScope", "Landroidx/lifecycle/LifecycleCoroutineScope;", "isPageShow", "Lkotlin/Function0;", "checkUpgrade$MineLib_googleRelease", "canCheckUpgrade", "checkUpgradeInHomePage", "appCheckUpgrade", "getHomeUpgradeTipInfo", "getAPPUpgradeInfo", "appShowUpgradeDialog", "appUpgradeEntity", "upgradeType", "homeShowUpgradeDialog", "appUpgradeInfo", "showFuturesCrossUpgradeDialog", "", "showUpgradeDialog", "upgradeInfo", "noVersionShowUpgradeDialog", "routerOrH5UpgradeDialogShow", "otherShowUpgradeDialog", "isLegalChannels", "upgradeNoVersionToast", "upgradeDialogTrackExpose", "type", "MineLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AppUpgradeManger {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final AppUpgradeManger f35079a = new AppUpgradeManger();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Lazy f35080b = LazyKt.lazy(new Function0() { // from class: com.kubi.mine.lib.manger.i
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AppUpgradeManger.m41702u();
        }
    });

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Map<String, AppUpgradeEntity> f35081c = new LinkedHashMap();

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Map<Object, Boolean> f35082d = new LinkedHashMap();

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final Map<String, Boolean> f35083e;

    /* JADX INFO: renamed from: f */
    public static boolean f35084f;

    /* JADX INFO: renamed from: g */
    public static int f35085g;

    static {
        Boolean bool = Boolean.FALSE;
        f35083e = MapsKt.mutableMapOf(TuplesKt.m90091to("homepage_key", bool), TuplesKt.m90091to("appUpgrade_key", bool));
    }

    /* JADX INFO: renamed from: u */
    public static final InterfaceC38284a m41702u() {
        return (InterfaceC38284a) RetrofitFlowExKt.m42820a(InterfaceC38284a.class);
    }

    /* JADX INFO: renamed from: A */
    public final void m41703A() {
        ToastCompat.m66437C(R$string.strToastYourAreTheLatestVersion);
    }

    /* JADX INFO: renamed from: j */
    public final int m41704j(AbstractC45585n0 abstractC45585n0, FragmentManager fragmentManager, LifecycleCoroutineScope lifecycleCoroutineScope, Function0<Boolean> function0) {
        AppUpgradeEntity appUpgradeEntity;
        Map<String, AppUpgradeEntity> map = f35081c;
        return (!map.containsKey("appUpgrade_key") || map.get("appUpgrade_key") == null || (appUpgradeEntity = map.get("appUpgrade_key")) == null) ? m41709o(abstractC45585n0, fragmentManager, lifecycleCoroutineScope, function0) : m41705k(appUpgradeEntity, abstractC45585n0, fragmentManager, function0);
    }

    /* JADX INFO: renamed from: k */
    public final int m41705k(AppUpgradeEntity appUpgradeEntity, AbstractC45585n0 abstractC45585n0, FragmentManager fragmentManager, Function0<Boolean> function0) {
        C45591t c45591t = C45591t.f102713a;
        c45591t.m100681a("appUpgradeDialog-appShowUpgradeDialog");
        if (!function0.invoke().booleanValue()) {
            c45591t.m100681a("appUpgradeDialog-appShowUpgradeDialog_pageStatus=notShow");
            return 0;
        }
        if (abstractC45585n0 instanceof AbstractC45585n0.a) {
            return m41718y(appUpgradeEntity, fragmentManager, abstractC45585n0);
        }
        return 9;
    }

    /* JADX INFO: renamed from: m */
    public final int m41707m(@NotNull AbstractC45585n0 appUpgradeType, @NotNull FragmentManager manager, @NotNull LifecycleCoroutineScope lifecycleScope, @NotNull Function0<Boolean> isPageShow) {
        Intrinsics.checkNotNullParameter(appUpgradeType, "appUpgradeType");
        Intrinsics.checkNotNullParameter(manager, "manager");
        Intrinsics.checkNotNullParameter(lifecycleScope, "lifecycleScope");
        Intrinsics.checkNotNullParameter(isPageShow, "isPageShow");
        int iM41706l = m41706l(isPageShow);
        if (iM41706l != 1) {
            return iM41706l;
        }
        if (appUpgradeType instanceof AbstractC45585n0.c) {
            return m41708n(manager, lifecycleScope, appUpgradeType, isPageShow);
        }
        if (appUpgradeType instanceof AbstractC45585n0.a) {
            return m41704j(appUpgradeType, manager, lifecycleScope, isPageShow);
        }
        if ((appUpgradeType instanceof AbstractC45585n0.d) || (appUpgradeType instanceof AbstractC45585n0.b)) {
            return m41717x(appUpgradeType, manager);
        }
        return 9;
    }

    /* JADX INFO: renamed from: n */
    public final int m41708n(FragmentManager fragmentManager, LifecycleCoroutineScope lifecycleCoroutineScope, AbstractC45585n0 abstractC45585n0, Function0<Boolean> function0) {
        AppUpgradeEntity appUpgradeEntity;
        if (Intrinsics.areEqual(f35083e.get("homepage_key"), Boolean.TRUE)) {
            C45591t.f102713a.m100681a("appUpgradeDialog-checkUpgradeInHomePage：noVersion");
            return 2;
        }
        if (f35084f) {
            return 3;
        }
        C45591t.f102713a.m100681a("appUpgradeDialog-checkUpgradeInHomePage");
        Map<String, AppUpgradeEntity> map = f35081c;
        return (!map.containsKey("homepage_key") || map.get("homepage_key") == null || (appUpgradeEntity = map.get("homepage_key")) == null) ? m41710p(fragmentManager, lifecycleCoroutineScope, abstractC45585n0, function0) : m41713s(appUpgradeEntity, fragmentManager, abstractC45585n0, function0);
    }

    /* JADX INFO: renamed from: p */
    public final int m41710p(FragmentManager fragmentManager, LifecycleCoroutineScope lifecycleCoroutineScope, AbstractC45585n0 abstractC45585n0, Function0<Boolean> function0) {
        if (f35085g >= 3) {
            C45591t.f102713a.m100681a("appUpgradeDialog-getHomeUpgradeTipInfo-httpMaxAskNumber");
            return 6;
        }
        if (!C46482h.m102544b(BaseApplication.INSTANCE.get())) {
            C45591t.f102713a.m100681a("appUpgradeDialog-getHomeUpgradeTipInfo-notNetwork");
            return 7;
        }
        Map<Object, Boolean> map = f35082d;
        Boolean bool = map.get("homepage_key");
        Boolean bool2 = Boolean.TRUE;
        if (Intrinsics.areEqual(bool, bool2)) {
            return 8;
        }
        C45591t.f102713a.m100681a("appUpgradeDialog-getHomeUpgradeTipInfo");
        map.put("homepage_key", bool2);
        C41696j.m91104d(lifecycleCoroutineScope, C42911a.m94120b(), null, new AppUpgradeManger$getHomeUpgradeTipInfo$1(fragmentManager, abstractC45585n0, function0, null), 2, null);
        return 8;
    }

    /* JADX INFO: renamed from: q */
    public final InterfaceC38284a m41711q() {
        return (InterfaceC38284a) f35080b.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public final Map<String, AppUpgradeEntity> m41712r() {
        return f35081c;
    }

    /* JADX INFO: renamed from: s */
    public final int m41713s(AppUpgradeEntity appUpgradeEntity, FragmentManager fragmentManager, AbstractC45585n0 abstractC45585n0, Function0<Boolean> function0) throws JSONException {
        if (f35084f) {
            C45591t.f102713a.m100681a("appUpgradeDialog-homeShowUpgradeDialog-homePageUpgradeDialogShowEd");
            return 3;
        }
        if (!function0.invoke().booleanValue()) {
            C45591t.f102713a.m100681a("appUpgradeDialog-homeShowUpgradeDialog-homePageNotShow");
            return 0;
        }
        if (GlobalDialogManager.f43651a.m54344i()) {
            C45591t.f102713a.m100681a("appUpgradeDialog-homeShowUpgradeDialog-hasDialog");
            return 5;
        }
        if (VersionUtils.f47483a.m57851b(C5264d.m6166l(), appUpgradeEntity.getLatestAppVersion()) >= 0) {
            return 2;
        }
        f35084f = true;
        C43521a.f96057a.m95764b(appUpgradeEntity.getLatestAppVersion());
        AppUpgradeDialogManger.f35094a.m41742d(abstractC45585n0, appUpgradeEntity).show(fragmentManager, "homePageShowUpgradeTipDialog");
        m41719z(1);
        C45591t.f102713a.m100681a("appUpgradeDialog-homeShowUpgradeDialog-show");
        return 1;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m41714t() {
        C45590s c45590s = C45590s.f102687a;
        return StringsKt.equals("GOOGLE", c45590s.m100665P(), true) || StringsKt.equals("KUCOIN", c45590s.m100665P(), true);
    }

    /* JADX INFO: renamed from: v */
    public final boolean m41715v(AbstractC45585n0 abstractC45585n0, Function0<Boolean> function0) {
        if (!Intrinsics.areEqual(f35083e.get("appUpgrade_key"), Boolean.TRUE)) {
            return false;
        }
        C45591t.f102713a.m100681a("appUpgradeDialog-noVersionShowUpgradeDialog-noVersion");
        if (function0.invoke().booleanValue() && (abstractC45585n0 instanceof AbstractC45585n0.a)) {
            m41703A();
        }
        return true;
    }

    /* JADX INFO: renamed from: w */
    public final int m41716w(AbstractC45585n0 abstractC45585n0, AppUpgradeEntity appUpgradeEntity, FragmentManager fragmentManager) {
        String str;
        if (abstractC45585n0 instanceof AbstractC45585n0.b) {
            str = "webH5PageShowUpgradeDialog";
        } else {
            str = abstractC45585n0 instanceof AbstractC45585n0.d ? "routerShowUpgradeDialog" : null;
        }
        if (str == null || str.length() == 0) {
            C45591t.f102713a.m100681a("appUpgradeDialog-otherShowUpgradeDialog-show,UpgradeType=nknownType");
            return 9;
        }
        AppUpgradeDialogManger.f35094a.m41742d(abstractC45585n0, appUpgradeEntity).show(fragmentManager, str);
        C45591t.f102713a.m100681a("appUpgradeDialog-otherShowUpgradeDialog-show,UpgradeType=" + str);
        return 1;
    }

    /* JADX INFO: renamed from: x */
    public final int m41717x(AbstractC45585n0 abstractC45585n0, FragmentManager fragmentManager) {
        Resources resources = BaseApplication.INSTANCE.get().getResources();
        return m41716w(abstractC45585n0, new AppUpgradeEntity(resources.getString(R$string.dialog_appupgrade_title_tiptext), null, resources.getString(R$string.not_sup_for_upgrade)), fragmentManager);
    }

    /* JADX INFO: renamed from: z */
    public final void m41719z(int i11) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("allItemAmount", i11);
        Unit unit = Unit.INSTANCE;
        C27023a.m66556c(HomeCardViewHolderProxy.PAGE_ID, "optionalupgrade", "1", jSONObject);
    }

    /* JADX INFO: renamed from: l */
    public final int m41706l(Function0<Boolean> function0) {
        if (!m41714t()) {
            C45591t.f102713a.m100681a("appUpgradeDialog-Channels：noLegalChannels");
            return -1;
        }
        if (!function0.invoke().booleanValue()) {
            C45591t.f102713a.m100681a("appUpgradeDialog-pageStatus：noShow");
            return 0;
        }
        C45591t.f102713a.m100681a("appUpgradeDialog：canCheckUpgrade");
        return 1;
    }

    /* JADX INFO: renamed from: o */
    public final int m41709o(AbstractC45585n0 abstractC45585n0, FragmentManager fragmentManager, LifecycleCoroutineScope lifecycleCoroutineScope, Function0<Boolean> function0) {
        if (m41715v(abstractC45585n0, function0)) {
            return 2;
        }
        if (!C46482h.m102544b(BaseApplication.INSTANCE.get())) {
            C45591t.f102713a.m100681a("appUpgradeDialog-getAPPUpgradeInfo-notNetwork");
            return 7;
        }
        Map<Object, Boolean> map = f35082d;
        Boolean bool = map.get(abstractC45585n0);
        Boolean bool2 = Boolean.TRUE;
        if (Intrinsics.areEqual(bool, bool2)) {
            return 8;
        }
        C45591t.f102713a.m100681a("appUpgradeDialog-getAPPUpgradeInfo");
        map.put(abstractC45585n0, bool2);
        C41696j.m91104d(lifecycleCoroutineScope, C42911a.m94120b(), null, new AppUpgradeManger$getAPPUpgradeInfo$1(abstractC45585n0, function0, fragmentManager, null), 2, null);
        return 8;
    }

    /* JADX INFO: renamed from: y */
    public final int m41718y(AppUpgradeEntity appUpgradeEntity, FragmentManager fragmentManager, AbstractC45585n0 abstractC45585n0) throws JSONException {
        if (VersionUtils.f47483a.m57851b(C5264d.m6166l(), appUpgradeEntity.getLatestAppVersion()) >= 0) {
            C45591t.f102713a.m100681a("appUpgradeDialog-showUpgradeDialog_isNewVersion");
            m41703A();
            return 2;
        }
        AppUpgradeDialogManger.f35094a.m41742d(abstractC45585n0, appUpgradeEntity).show(fragmentManager, "settingPageShowUpgradeDialog");
        m41719z(2);
        C45591t.f102713a.m100681a("appUpgradeDialog-showUpgradeDialog_dialogShow");
        return 1;
    }
}
