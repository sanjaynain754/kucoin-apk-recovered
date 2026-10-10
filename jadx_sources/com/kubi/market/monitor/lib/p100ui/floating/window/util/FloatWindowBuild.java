package com.kubi.market.monitor.lib.p100ui.floating.window.util;

import android.content.Intent;
import android.graphics.Point;
import android.net.Uri;
import android.provider.Settings;
import android.view.View;
import aq.C4376e;
import aq.WindowStatus;
import com.blankj.utilcode.util.C5261b0;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.kubi.kucoin.market.monitor.lib.R$color;
import com.kubi.kucoin.market.monitor.lib.R$mipmap;
import com.kubi.kucoin.market.monitor.lib.R$string;
import com.kubi.market.monitor.lib.p100ui.floating.FloatingWindowConfigManager;
import com.kubi.sdk.BaseApplication;
import com.kubi.sdk.BaseFragment;
import com.kubi.utils.ToastCompat;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: FloatWindowBuild.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/market/monitor/lib/ui/floating/window/util/FloatWindowBuild;", "", "<init>", "()V", "Companion", "Builder", "MarketMonitorLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class FloatWindowBuild {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f34525a = new Companion(null);

    /* JADX INFO: compiled from: FloatWindowBuild.kt */
    @Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\nJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u000fJ\u0006\u0010\u0011\u001a\u00020\u000fJ\u0006\u0010\u0012\u001a\u00020\u000fJ\u0012\u0010\u0013\u001a\u00020\u00072\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017JB\u0010\u0018\u001a\u00020\u00072\u0017\u0010\u0019\u001a\u0013\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\u001a¢\u0006\u0002\b\u001b2!\u0010\u001c\u001a\u001d\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u00070\u001aJ\r\u0010 \u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010!J\u0006\u0010\"\u001a\u00020\u000fJ\u0006\u0010#\u001a\u00020\nJ\u0006\u0010$\u001a\u00020\nJ\u0006\u0010%\u001a\u00020\nJ\u0006\u0010&\u001a\u00020\nJ\u0006\u0010'\u001a\u00020\nJ\u0006\u0010(\u001a\u00020\nJ\u0006\u0010)\u001a\u00020\nJ\u0006\u0010*\u001a\u00020\nJ\u0006\u0010+\u001a\u00020\u000fJ\u0006\u0010,\u001a\u00020\nJ\u0006\u0010-\u001a\u00020\u000fJ\u0006\u0010.\u001a\u00020\u000fJ\u0006\u0010/\u001a\u00020\u000fJ\u0006\u00100\u001a\u00020\u000fJ\u0006\u00101\u001a\u00020\u000fJ\u0006\u00102\u001a\u00020\nJ\u0006\u00103\u001a\u00020\nJ\u000e\u00104\u001a\u00020\n2\u0006\u00105\u001a\u00020\u000fJ\u000e\u00106\u001a\u00020\n2\u0006\u00105\u001a\u00020\u000fJ\u0006\u00107\u001a\u00020\nJ\u0006\u00108\u001a\u00020\nJ\u0006\u00109\u001a\u00020\nJ\u0006\u0010:\u001a\u00020\nJ\u0006\u0010;\u001a\u00020\nJ\u0006\u0010<\u001a\u00020\n¨\u0006="}, m90084d2 = {"Lcom/kubi/market/monitor/lib/ui/floating/window/util/FloatWindowBuild$Companion;", "", "<init>", "()V", "with", "Lcom/kubi/market/monitor/lib/ui/floating/window/util/FloatWindowBuild$Builder;", "dismiss", "", "dismissViewAndWindow", "defaultDisplayHeight", "", "windowFrameLayoutHeight", "updatefloatingWindowParams", "viewWidth", "windowShowing", "", "isStayLeft", "isStayTop", "checkNotPermission", "toOpenSetting", "baseFragment", "Lcom/kubi/sdk/BaseFragment;", "getFloatingWindowHelperConfig", "Lcom/kubi/market/monitor/lib/ui/floating/window/util/WindowStatus;", "updataFloatingConfig", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "updataView", "Lkotlin/ParameterName;", "name", "data", "getFloatingConfigTheme", "()Ljava/lang/Integer;", "isAnimIng", "dataUpdateIntervalTime", "textSizeMode", "pagingMode", "pageTurningTime", "getPageSize", "getAutoScrollTime", "getBgThemeColor", "getBgThemeAlpha", "isExceedHalfAlpha", "getHalfAlpha", "currencyNameShow", "actionBarShow", "quoteChangeShow", "isFloatingWindowShowIng", "priceShow", "getZoomIcon", "getSetingIcon", "getPreviousPageIcon", "isRtl", "getNexpageIcon", "getLevitatingBallIcon", "textColorText", "textColorText40", "textColorText50", "textColorText68", "dividerColor", "MarketMonitorLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public static /* synthetic */ void toOpenSetting$default(Companion companion, BaseFragment baseFragment, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                baseFragment = null;
            }
            companion.toOpenSetting(baseFragment);
        }

        public final boolean checkNotPermission() {
            return !Settings.canDrawOverlays(BaseApplication.INSTANCE.get());
        }

        public final int defaultDisplayHeight() {
            return C4376e.f3773a.m3912b();
        }

        public final void dismiss() {
            C4376e.f3773a.m3913c();
        }

        public final void dismissViewAndWindow() {
            C4376e.f3773a.m3914d();
        }

        public final int getAutoScrollTime() {
            WindowStatus windowStatusM3915e = C4376e.f3773a.m3915e();
            if (windowStatusM3915e != null) {
                return windowStatusM3915e.getAutoScrollTime();
            }
            return 5;
        }

        @Nullable
        public final Integer getFloatingConfigTheme() {
            WindowStatus windowStatusM3915e = C4376e.f3773a.m3915e();
            if (windowStatusM3915e != null) {
                return Integer.valueOf(windowStatusM3915e.getTheme());
            }
            return null;
        }

        @Nullable
        public final WindowStatus getFloatingWindowHelperConfig() {
            return C4376e.f3773a.m3915e();
        }

        public final int getHalfAlpha() {
            return 102;
        }

        public final boolean isStayLeft() {
            return C4376e.f3773a.m3916f();
        }

        public final boolean isStayTop() {
            return C4376e.f3773a.m3917g();
        }

        public final void toOpenSetting(@Nullable BaseFragment baseFragment) {
            if (baseFragment != null) {
                try {
                    String packageName = BaseApplication.INSTANCE.get().getPackageName();
                    String strReplace$default = packageName != null ? StringsKt.replace$default(packageName, ".debug", "", false, 4, (Object) null) : null;
                    if (strReplace$default != null && strReplace$default.length() != 0) {
                        if (C5261b0.m6149j()) {
                            Intent intent = new Intent("com.meizu.safe.security.SHOW_APPSEC");
                            intent.setClassName("com.meizu.safe", "com.meizu.safe.security.AppSecActivity");
                            intent.putExtra(RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, strReplace$default);
                            intent.setFlags(268435456);
                            baseFragment.startActivity(intent);
                            return;
                        }
                        Intent intent2 = new Intent();
                        intent2.setAction("android.settings.action.MANAGE_OVERLAY_PERMISSION");
                        intent2.setData(Uri.parse("package:" + strReplace$default));
                        baseFragment.startActivityForResult(intent2, 0);
                    }
                } catch (Exception unused) {
                    ToastCompat.m66437C(R$string.permission_apply);
                }
            }
        }

        public final void updataFloatingConfig(@NotNull Function1<? super WindowStatus, WindowStatus> block, @NotNull Function1<? super WindowStatus, Unit> updataView) {
            Intrinsics.checkNotNullParameter(block, "block");
            Intrinsics.checkNotNullParameter(updataView, "updataView");
            C4376e.f3773a.m3919i(block, updataView);
        }

        public final void updatefloatingWindowParams(int viewWidth) {
            C4376e.f3773a.m3920j(viewWidth);
        }

        public final int windowFrameLayoutHeight() {
            return C4376e.f3773a.m3921k();
        }

        public final boolean windowShowing() {
            return C4376e.f3773a.m3922l();
        }

        @NotNull
        public final C18822a with() {
            return new C18822a();
        }

        public final boolean actionBarShow() {
            WindowStatus floatingWindowHelperConfig = getFloatingWindowHelperConfig();
            if (floatingWindowHelperConfig == null) {
                return true;
            }
            return floatingWindowHelperConfig.getActionBarShow();
        }

        public final boolean currencyNameShow() {
            WindowStatus floatingWindowHelperConfig = getFloatingWindowHelperConfig();
            if (floatingWindowHelperConfig == null) {
                return true;
            }
            return floatingWindowHelperConfig.getCurrencyNameShow();
        }

        public final int dataUpdateIntervalTime() {
            WindowStatus floatingWindowHelperConfig = getFloatingWindowHelperConfig();
            if (floatingWindowHelperConfig == null) {
                return 5;
            }
            if (floatingWindowHelperConfig.getDataUpdateIntervalTime() < 3) {
                return 3;
            }
            return floatingWindowHelperConfig.getDataUpdateIntervalTime();
        }

        public final int dividerColor() {
            WindowStatus floatingWindowHelperConfig = getFloatingWindowHelperConfig();
            if (floatingWindowHelperConfig == null) {
                return BaseApplication.INSTANCE.get().getResources().getColor(R$color.floating_darkTheme_divider);
            }
            if (floatingWindowHelperConfig.getTheme() == 0) {
                return BaseApplication.INSTANCE.get().getResources().getColor(R$color.floating_darkTheme_divider);
            }
            return BaseApplication.INSTANCE.get().getResources().getColor(R$color.floating_lightTheme_divider);
        }

        public final int getBgThemeAlpha() {
            WindowStatus floatingWindowHelperConfig = getFloatingWindowHelperConfig();
            if (floatingWindowHelperConfig == null) {
                return 191;
            }
            return floatingWindowHelperConfig.getAlpha();
        }

        public final int getBgThemeColor() {
            WindowStatus floatingWindowHelperConfig = getFloatingWindowHelperConfig();
            if (floatingWindowHelperConfig == null) {
                return BaseApplication.INSTANCE.get().getResources().getColor(R$color.floating_dark_color);
            }
            if (floatingWindowHelperConfig.getTheme() == 0) {
                return BaseApplication.INSTANCE.get().getResources().getColor(R$color.floating_dark_color);
            }
            return BaseApplication.INSTANCE.get().getResources().getColor(R$color.floating_light_color);
        }

        public final int getLevitatingBallIcon() {
            WindowStatus floatingWindowHelperConfig = getFloatingWindowHelperConfig();
            if (floatingWindowHelperConfig == null) {
                return R$mipmap.icon_floating_k_dark_logo;
            }
            if (floatingWindowHelperConfig.getTheme() == 0) {
                return R$mipmap.icon_floating_k_dark_logo;
            }
            return R$mipmap.icon_floating_k_light_logo;
        }

        public final int getNexpageIcon(boolean isRtl) {
            WindowStatus floatingWindowHelperConfig = getFloatingWindowHelperConfig();
            if (floatingWindowHelperConfig == null) {
                if (isRtl) {
                    return R$mipmap.icon_floateindow_previouspage;
                }
                return R$mipmap.icon_floateindow_nexpage;
            }
            if (floatingWindowHelperConfig.getTheme() == 0) {
                if (isRtl) {
                    return R$mipmap.icon_floateindow_previouspage;
                }
                return R$mipmap.icon_floateindow_nexpage;
            }
            if (isRtl) {
                return R$mipmap.icon_floateindow_light_previouspage;
            }
            return R$mipmap.icon_floateindow_light_nexpage;
        }

        public final int getPageSize() {
            WindowStatus floatingWindowHelperConfig = getFloatingWindowHelperConfig();
            if (floatingWindowHelperConfig == null) {
                return 6;
            }
            return floatingWindowHelperConfig.getPageSize();
        }

        public final int getPreviousPageIcon(boolean isRtl) {
            WindowStatus floatingWindowHelperConfig = getFloatingWindowHelperConfig();
            if (floatingWindowHelperConfig == null) {
                if (isRtl) {
                    return R$mipmap.icon_floateindow_nexpage;
                }
                return R$mipmap.icon_floateindow_previouspage;
            }
            if (floatingWindowHelperConfig.getTheme() == 0) {
                if (isRtl) {
                    return R$mipmap.icon_floateindow_nexpage;
                }
                return R$mipmap.icon_floateindow_previouspage;
            }
            if (isRtl) {
                return R$mipmap.icon_floateindow_light_nexpage;
            }
            return R$mipmap.icon_floateindow_light_previouspage;
        }

        public final int getSetingIcon() {
            WindowStatus floatingWindowHelperConfig = getFloatingWindowHelperConfig();
            if (floatingWindowHelperConfig == null) {
                return R$mipmap.icon_floateindow_setting;
            }
            if (floatingWindowHelperConfig.getTheme() == 0) {
                return R$mipmap.icon_floateindow_setting;
            }
            return R$mipmap.icon_floateindow_light_setting;
        }

        public final int getZoomIcon() {
            WindowStatus floatingWindowHelperConfig = getFloatingWindowHelperConfig();
            if (floatingWindowHelperConfig == null) {
                return R$mipmap.icon_floateindow_tolevitatingball;
            }
            if (floatingWindowHelperConfig.getTheme() == 0) {
                return R$mipmap.icon_floateindow_tolevitatingball;
            }
            return R$mipmap.icon_floateindow_light_tolevitatingball;
        }

        public final boolean isAnimIng() {
            WindowStatus floatingWindowHelperConfig = getFloatingWindowHelperConfig();
            if (floatingWindowHelperConfig == null) {
                return false;
            }
            return floatingWindowHelperConfig.getIsAnim();
        }

        public final boolean isExceedHalfAlpha() {
            if (getBgThemeAlpha() > 102) {
                return true;
            }
            return false;
        }

        public final boolean isFloatingWindowShowIng() {
            boolean isShow;
            WindowStatus floatingWindowHelperConfig = getFloatingWindowHelperConfig();
            if (floatingWindowHelperConfig != null) {
                isShow = floatingWindowHelperConfig.getIsShow();
            } else {
                isShow = false;
            }
            if (!FloatingWindowConfigManager.f34272a.m40729f() || !isShow) {
                return false;
            }
            return true;
        }

        public final int pageTurningTime() {
            WindowStatus floatingWindowHelperConfig = getFloatingWindowHelperConfig();
            if (floatingWindowHelperConfig == null) {
                return 5;
            }
            return floatingWindowHelperConfig.getPageTurningTime();
        }

        public final int pagingMode() {
            WindowStatus floatingWindowHelperConfig = getFloatingWindowHelperConfig();
            if (floatingWindowHelperConfig == null) {
                return 8;
            }
            return floatingWindowHelperConfig.getPagingMode();
        }

        public final boolean priceShow() {
            WindowStatus floatingWindowHelperConfig = getFloatingWindowHelperConfig();
            if (floatingWindowHelperConfig == null) {
                return true;
            }
            return floatingWindowHelperConfig.getPriceShow();
        }

        public final boolean quoteChangeShow() {
            WindowStatus floatingWindowHelperConfig = getFloatingWindowHelperConfig();
            if (floatingWindowHelperConfig == null) {
                return true;
            }
            return floatingWindowHelperConfig.getQuoteChangeShow();
        }

        public final int textColorText() {
            WindowStatus floatingWindowHelperConfig = getFloatingWindowHelperConfig();
            if (floatingWindowHelperConfig == null) {
                return BaseApplication.INSTANCE.get().getResources().getColor(R$color.floating_darkTheme_textcolor_text);
            }
            if (floatingWindowHelperConfig.getTheme() == 0) {
                return BaseApplication.INSTANCE.get().getResources().getColor(R$color.floating_darkTheme_textcolor_text);
            }
            return BaseApplication.INSTANCE.get().getResources().getColor(R$color.floating_lightTheme_textcolor_text);
        }

        public final int textColorText40() {
            WindowStatus floatingWindowHelperConfig = getFloatingWindowHelperConfig();
            if (floatingWindowHelperConfig == null) {
                return BaseApplication.INSTANCE.get().getResources().getColor(R$color.floating_darkTheme_textcolor_text40);
            }
            if (floatingWindowHelperConfig.getTheme() == 0) {
                return BaseApplication.INSTANCE.get().getResources().getColor(R$color.floating_darkTheme_textcolor_text40);
            }
            return BaseApplication.INSTANCE.get().getResources().getColor(R$color.floating_lightTheme_textcolor_text40);
        }

        public final int textColorText50() {
            WindowStatus floatingWindowHelperConfig = getFloatingWindowHelperConfig();
            if (floatingWindowHelperConfig == null) {
                return BaseApplication.INSTANCE.get().getResources().getColor(R$color.floating_darkTheme_textcolor_text50);
            }
            if (floatingWindowHelperConfig.getTheme() == 0) {
                return BaseApplication.INSTANCE.get().getResources().getColor(R$color.floating_darkTheme_textcolor_text50);
            }
            return BaseApplication.INSTANCE.get().getResources().getColor(R$color.floating_lightTheme_textcolor_text50);
        }

        public final int textColorText68() {
            WindowStatus floatingWindowHelperConfig = getFloatingWindowHelperConfig();
            if (floatingWindowHelperConfig == null) {
                return BaseApplication.INSTANCE.get().getResources().getColor(R$color.floating_darkTheme_textcolor_text68);
            }
            if (floatingWindowHelperConfig.getTheme() == 0) {
                return BaseApplication.INSTANCE.get().getResources().getColor(R$color.floating_darkTheme_textcolor_text68);
            }
            return BaseApplication.INSTANCE.get().getResources().getColor(R$color.floating_lightTheme_textcolor_text68);
        }

        public final int textSizeMode() {
            WindowStatus floatingWindowHelperConfig = getFloatingWindowHelperConfig();
            if (floatingWindowHelperConfig == null) {
                return 2;
            }
            return floatingWindowHelperConfig.getTextSizeMode();
        }
    }

    /* JADX INFO: renamed from: com.kubi.market.monitor.lib.ui.floating.window.util.FloatWindowBuild$a */
    /* JADX INFO: compiled from: FloatWindowBuild.kt */
    @Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J_\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\b2O\b\u0002\u0010\t\u001aI\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u0001\u0018\u00010\nJ\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0013J)\u0010\u0014\u001a\u00020\u00002!\u0010\u0015\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00170\u0016J\u0006\u0010\u0018\u001a\u00020\u0019J\b\u0010\u001a\u001a\u00020\u0019H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/market/monitor/lib/ui/floating/window/util/FloatWindowBuild$Builder;", "", "<init>", "()V", "config", "Lcom/kubi/market/monitor/lib/ui/floating/window/util/WindowStatus;", "setLayout", "floatingView", "Landroid/view/View;", "updateWindowMoveCallBack", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "isAnimationEnd", "isLeft", "childView", "setOffsetPair", "offsetPair", "Landroid/graphics/Point;", "setUpdataViewStateCallBack", "callBack", "Lkotlin/Function1;", "", TIMPushProvider.f75062n, "", "showFloat", "MarketMonitorLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C18822a {

        /* JADX INFO: renamed from: a */
        @NotNull
        public final WindowStatus f34526a = new WindowStatus(null, null, false, false, false, 0, false, null, 0, 0, 0, 0, 0, 0, 0, false, false, false, false, 0, 0, 0, null, 8388607, null);

        @NotNull
        /* JADX INFO: renamed from: a */
        public final C18822a m41187a(@NotNull View floatingView, @Nullable Function3<? super Boolean, ? super Boolean, ? super View, ? extends Object> function3) {
            Intrinsics.checkNotNullParameter(floatingView, "floatingView");
            this.f34526a.m3931G(floatingView);
            this.f34526a.m3942R(function3);
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final C18822a m41188b(@NotNull Point offsetPair) {
            Intrinsics.checkNotNullParameter(offsetPair, "offsetPair");
            this.f34526a.m3932H(offsetPair);
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final C18822a m41189c(@NotNull Function1<? super WindowStatus, Unit> callBack) {
            Intrinsics.checkNotNullParameter(callBack, "callBack");
            this.f34526a.m3941Q(callBack);
            return this;
        }

        /* JADX INFO: renamed from: d */
        public final int m41190d() {
            if (this.f34526a.getFloatingView() == null || FloatWindowBuild.f34525a.checkNotPermission()) {
                return -1;
            }
            return m41191e();
        }

        /* JADX INFO: renamed from: e */
        public final int m41191e() throws Throwable {
            C4376e c4376e = C4376e.f3773a;
            if (c4376e.m3922l()) {
                return 3;
            }
            if (c4376e.m3911a(this.f34526a) != 1) {
                return 0;
            }
            c4376e.m3918h();
            return 1;
        }
    }
}
