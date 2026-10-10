package com.kubi.otc.service;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.google.firebase.messaging.Constants;
import com.kubi.assets.api.IAssetsCenterService;
import com.kubi.helpcenter.api.CustomerServiceType;
import com.kubi.helpcenter.api.local.IHelpCenterService;
import com.kubi.host.HostManager;
import com.kubi.kucoin.utils.DayNightThemeManager;
import com.kubi.mine.api.service.IMineService;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import com.kubi.router.model.IRedirect;
import com.kubi.safe.api.service.ISafeService;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.base.p113ui.OldBaseFragment;
import com.kubi.sdk.util.ImagePickerHelper;
import com.kubi.user.api.IUserService;
import com.kubi.user.model.LoginUserEntity;
import com.kubi.utils.extensions.C27041f;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import io.reactivex.functions.BiConsumer;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.otc.service.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: OtcDepend.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\rJ\u0006\u0010\u000f\u001a\u00020\rJ*\u0010\u0010\u001a\u00020\u00112\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015J*\u0010\u0016\u001a\u00020\u00112\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\u0006\u0010\u0017\u001a\u00020\rJ\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001eJ\u000e\u0010\u001f\u001a\u00020\r2\u0006\u0010 \u001a\u00020!J \u0010\"\u001a\u00020\u00112\u0006\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020&J\u001c\u0010(\u001a\u00020\u00112\b\u0010)\u001a\u0004\u0018\u00010*2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\rJ\u0006\u0010,\u001a\u00020\u0019J&\u0010-\u001a\u00020.2\u0006\u0010\u001d\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\r2\u0006\u0010'\u001a\u00020&J*\u00103\u001a\u00020\u00112\u0006\u00100\u001a\u00020.2\u0006\u00104\u001a\u00020\r2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u001906J\u0006\u00107\u001a\u00020\u0011¨\u00068"}, m90084d2 = {"Lcom/kubi/otc/service/OtcDepend;", "", "<init>", "()V", "getUserService", "Lcom/kubi/user/api/IUserService;", "safeService", "Lcom/kubi/safe/api/service/ISafeService;", "getMineService", "Lcom/kubi/mine/api/service/IMineService;", "getAssetsCenterService", "Lcom/kubi/assets/api/IAssetsCenterService;", "getBaseH5Url", "", "getBaseHelpUrl", "getBaseVideoUrl", "checkLogin", "", ReportDataTable.COLUMN_PARAMS, "", "redirect", "Lcom/kubi/router/model/IRedirect;", "checkPassword", "getUserId", "hasLogin", "", "getLoginUser", "Lcom/kubi/user/model/LoginUserEntity;", "bindEmail", "context", "Landroid/content/Context;", "obtainPathResult", "intent", "Landroid/content/Intent;", "pickPhoto", "fragment", "Lcom/kubi/sdk/BaseFragment;", BridgeParamKeyKt.MAX_COUNT, "", "requestCode", "toHelpChat", "activity", "Landroidx/fragment/app/FragmentActivity;", "from", "isDayMode", "addUploadView", "Landroid/view/View;", "Lcom/kubi/sdk/base/ui/OldBaseFragment;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/ViewGroup;", Constants.ScionAnalytics.PARAM_LABEL, "upload", "path", "biConsumer", "Lio/reactivex/functions/BiConsumer;", "goToUpgradeApp", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class OtcDepend {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final OtcDepend f38138a = new OtcDepend();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m45451d(OtcDepend otcDepend, Map map, IRedirect iRedirect, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            map = null;
        }
        if ((i11 & 2) != 0) {
            iRedirect = null;
        }
        otcDepend.m45455c(map, iRedirect);
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m45452s(OtcDepend otcDepend, BaseFragment baseFragment, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 1;
        }
        otcDepend.m45469r(baseFragment, i11, i12);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final View m45453a(@NotNull OldBaseFragment context, @NotNull ViewGroup view, @NotNull String label, int i11) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(label, "label");
        return m45464m().x(context, view, label, i11);
    }

    /* JADX INFO: renamed from: b */
    public final void m45454b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        m45470t().m56318l(context);
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final IAssetsCenterService m45457f() {
        return IAssetsCenterService.f16464a.get();
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final String m45458g() {
        return HostManager.a.e();
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final String m45459h() {
        return HostManager.a.q();
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final String m45460i() {
        return HostManager.a.w();
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final IMineService m45462k() {
        return IMineService.f35025a.get();
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final IUserService m45464m() {
        return IUserService.a.get();
    }

    /* JADX INFO: renamed from: p */
    public final boolean m45467p() {
        return DayNightThemeManager.f28592a.m33187l();
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final String m45468q(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        return C27041f.m66668h(ImagePickerHelper.m58392a(intent));
    }

    /* JADX INFO: renamed from: r */
    public final void m45469r(@NotNull BaseFragment fragment, int i11, int i12) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        ImagePickerHelper.m58397f(fragment, i11, i12, null, 8, null);
    }

    @NotNull
    /* JADX INFO: renamed from: t */
    public final ISafeService m45470t() {
        return ISafeService.f46324a.get();
    }

    /* JADX INFO: renamed from: u */
    public final void m45471u(@Nullable FragmentActivity fragmentActivity, @Nullable String str) {
        IHelpCenterService.m28904f(IHelpCenterService.f25326a.get(), fragmentActivity, str, CustomerServiceType.PAYMENT, null, false, 24, null);
    }

    /* JADX INFO: renamed from: v */
    public final void m45472v(@NotNull View view, @NotNull String path, @NotNull BiConsumer<String, Boolean> biConsumer) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(biConsumer, "biConsumer");
        m45464m().T(view, path, biConsumer);
    }

    /* JADX INFO: renamed from: c */
    public final void m45455c(@Nullable Map<String, ? extends Object> map, @Nullable IRedirect iRedirect) {
        m45464m().w(map, iRedirect);
    }

    /* JADX INFO: renamed from: e */
    public final void m45456e(@Nullable Map<String, ? extends Object> map, @Nullable IRedirect iRedirect) {
        m45464m().F0(map, iRedirect);
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final LoginUserEntity m45461j() {
        return m45464m().d0();
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final String m45463l() {
        return m45464m().d();
    }

    /* JADX INFO: renamed from: n */
    public final void m45465n() {
        m45462k().mo41621d();
    }

    /* JADX INFO: renamed from: o */
    public final boolean m45466o() {
        return m45464m().c();
    }
}
