package fo;

import com.kubi.lite.R$drawable;
import com.kubi.lite.tab.bean.TabConfig;
import com.kubi.lite.tab.util.LiteCommonUtils;
import com.kubi.lite.tab.util.TabScrollUtil;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: renamed from: fo.a */
/* JADX INFO: compiled from: LiteIconPathUtil.kt */
/* JADX INFO: loaded from: classes24.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u001e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u0010R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/lite/tab/util/path/LiteIconPathUtil;", "", "<init>", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "tabScrollUtil", "Lcom/kubi/lite/tab/util/TabScrollUtil;", "getTabScrollUtil", "()Lcom/kubi/lite/tab/util/TabScrollUtil;", "getHttpUrl", "tabConfig", "Lcom/kubi/lite/tab/bean/TabConfig;", "isSelected", "", "tabCount", "", "getLocalResId", "getDefaultLocalResId", "LiteLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C37575a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C37575a f83537a = new C37575a();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final String f83538b = "LiteV2-LiteIconPathUtil";

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final TabScrollUtil f83539c = TabScrollUtil.f32166f.getInstance();

    /* JADX INFO: renamed from: a */
    public final int m84701a(boolean z11) {
        int i11 = z11 ? R$drawable.lite_icon_default_selected : R$drawable.lite_icon_default;
        C44128b.m97266j(f83538b, "[getDefaultLocalResId] isSelected=" + z11 + ", resId=" + i11);
        return i11;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final String m84702b(@NotNull TabConfig tabConfig, boolean z11, int i11) {
        String icon;
        Intrinsics.checkNotNullParameter(tabConfig, "tabConfig");
        LiteCommonUtils liteCommonUtils = LiteCommonUtils.f32173a;
        boolean zM37654h = liteCommonUtils.m37654h();
        boolean zM37656j = liteCommonUtils.m37656j(tabConfig, i11);
        String tabId = tabConfig.getTabId();
        if (zM37654h) {
            if (z11) {
                icon = zM37656j ? "" : "";
                C44128b.m97266j(f83538b, "[getHttpUrl#1] Dark Selected: tabId=" + tabId + ", isMaxTrade=" + zM37656j + ", url=" + icon);
            } else {
                icon = zM37656j ? "" : "";
                C44128b.m97266j(f83538b, "[getHttpUrl#2] Dark Unselected: tabId=" + tabId + ", isMaxTrade=" + zM37656j + ", url=" + icon);
            }
        } else if (z11) {
            icon = zM37656j ? "" : "";
            C44128b.m97266j(f83538b, "[getHttpUrl#3] Light Selected: tabId=" + tabId + ", isMaxTrade=" + zM37656j + ", url=" + icon);
        } else {
            icon = zM37656j ? "" : "";
            C44128b.m97266j(f83538b, "[getHttpUrl#4] Light Unselected: tabId=" + tabId + ", isMaxTrade=" + zM37656j + ", url=" + icon);
        }
        if (liteCommonUtils.m37657k(icon)) {
            return icon;
        }
        C44128b.m97266j(f83538b, "[getHttpUrl#5] No valid HTTP URL found: tabId=" + tabId + ", url=" + icon);
        return "";
    }

    /* JADX INFO: renamed from: c */
    public final int m84703c(@NotNull TabConfig tabConfig, boolean z11, int i11) {
        int iM84701a;
        int iM84701a2;
        Intrinsics.checkNotNullParameter(tabConfig, "tabConfig");
        LiteCommonUtils liteCommonUtils = LiteCommonUtils.f32173a;
        boolean zM37656j = liteCommonUtils.m37656j(tabConfig, i11);
        String tabId = tabConfig.getTabId();
        if (!z11) {
            if (Intrinsics.areEqual(tabId, liteCommonUtils.m37648b())) {
                iM84701a = R$drawable.lite_icon_home;
            } else if (Intrinsics.areEqual(tabId, liteCommonUtils.m37650d())) {
                iM84701a = R$drawable.lite_icon_square;
            } else if (Intrinsics.areEqual(tabId, liteCommonUtils.m37651e())) {
                iM84701a = zM37656j ? R$drawable.lite_icon_trade_five_items : R$drawable.lite_icon_trade;
            } else if (Intrinsics.areEqual(tabId, liteCommonUtils.m37647a())) {
                iM84701a = R$drawable.lite_icon_earn;
            } else {
                iM84701a = Intrinsics.areEqual(tabId, liteCommonUtils.m37649c()) ? R$drawable.lite_icon_portfolio : m84701a(false);
            }
            C44128b.m97266j(f83538b, "[getLocalResId#3] Unselected: tabId=" + tabId + ", isMaxTrade=" + zM37656j + ", resId=" + iM84701a);
            return iM84701a;
        }
        if (f83539c.m37643g(tabId)) {
            int i12 = R$drawable.lite_icon_scroll;
            C44128b.m97266j(f83538b, "[getLocalResId#1] Selected & Top: tabId=" + tabId + ", resId=" + i12);
            return i12;
        }
        if (Intrinsics.areEqual(tabId, liteCommonUtils.m37648b())) {
            iM84701a2 = R$drawable.lite_icon_home_selected;
        } else if (Intrinsics.areEqual(tabId, liteCommonUtils.m37650d())) {
            iM84701a2 = R$drawable.lite_icon_square_selected;
        } else if (Intrinsics.areEqual(tabId, liteCommonUtils.m37651e())) {
            iM84701a2 = zM37656j ? R$drawable.lite_icon_trade_five_items_selected : R$drawable.lite_icon_trade_selected;
        } else if (Intrinsics.areEqual(tabId, liteCommonUtils.m37647a())) {
            iM84701a2 = R$drawable.lite_icon_earn_selected;
        } else {
            iM84701a2 = Intrinsics.areEqual(tabId, liteCommonUtils.m37649c()) ? R$drawable.lite_icon_portfolio_selected : m84701a(true);
        }
        C44128b.m97266j(f83538b, "[getLocalResId#2] Selected Normal: tabId=" + tabId + ", isMaxTrade=" + zM37656j + ", resId=" + iM84701a2);
        return iM84701a2;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final TabScrollUtil m84704d() {
        return f83539c;
    }
}
