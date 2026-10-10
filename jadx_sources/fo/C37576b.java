package fo;

import com.kubi.lite.R$raw;
import com.kubi.lite.tab.bean.TabConfig;
import com.kubi.lite.tab.bean.TabExtra;
import com.kubi.lite.tab.bean.TabFullLotties;
import com.kubi.lite.tab.bean.TabLargeExtra;
import com.kubi.lite.tab.bean.TabMainLotties;
import com.kubi.lite.tab.bean.TabTopExtra;
import com.kubi.lite.tab.util.LiteCommonUtils;
import com.tencent.bugly.proguard.C33789m5;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: renamed from: fo.b */
/* JADX INFO: compiled from: LiteLottiePathUtil.kt */
/* JADX INFO: loaded from: classes24.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005J*\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005J*\u0010\u0011\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/lite/tab/util/path/LiteLottiePathUtil;", "", "<init>", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "getHttpUrl", "tabConfig", "Lcom/kubi/lite/tab/bean/TabConfig;", "isSelected", "", "tabCount", "", "scrollState", "getLocalResId", "hasLottieResource", "LiteLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C37576b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C37576b f83540a = new C37576b();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final String f83541b = "LiteV2-LiteLottiePathUtil";

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a2, code lost:
    
        r4 = r7;
     */
    @NotNull
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m84706a(@NotNull TabConfig tabConfig, boolean z11, int i11, @Nullable String str) {
        String reverseLottieNight;
        TabLargeExtra large;
        String switchLottie;
        TabTopExtra top;
        Intrinsics.checkNotNullParameter(tabConfig, "tabConfig");
        boolean zM37654h = LiteCommonUtils.f32173a.m37654h();
        TabExtra extra = tabConfig.getExtra();
        String lottie = null;
        TabFullLotties lotties = (extra == null || (top = extra.getTop()) == null) ? null : top.getLotties();
        String tabId = tabConfig.getTabId();
        String str2 = "";
        if (str != null && str.length() != 0) {
            if (Intrinsics.areEqual(str, "scrollToTop")) {
                if (zM37654h) {
                    if (lotties != null) {
                        lottie = lotties.getLottieNight();
                    }
                } else if (lotties != null) {
                    lottie = lotties.getLottie();
                }
            } else if (!Intrinsics.areEqual(str, C33789m5.f70921k)) {
                lottie = "";
            } else if (zM37654h) {
                if (lotties != null) {
                    lottie = lotties.getReverseLottieNight();
                }
            } else if (lotties != null) {
                lottie = lotties.getReverseLottie();
            }
            str2 = lottie != null ? lottie : "";
            C44128b.m97266j(f83541b, "[getHttpUrl#1] Scroll driven: tabId=" + tabId + ", state=" + str + ", url=" + str2);
            return str2;
        }
        if (z11 && C37575a.f83537a.m84704d().m37643g(tabId)) {
            if (zM37654h) {
            }
            C44128b.m97266j(f83541b, "[getHttpUrl#2] Selected & Top: tabId=" + tabId + ", url=" + str2);
            return str2;
        }
        if (!z11) {
            C37575a c37575a = C37575a.f83537a;
            if (c37575a.m84704d().m37642f(tabId)) {
                C44128b.m97266j(f83541b, "[getHttpUrl#3.1] Unselected & Bottom: tabId=" + tabId);
                return "";
            }
            if (c37575a.m84704d().m37643g(tabId)) {
                if (!zM37654h ? !(lotties == null || (switchLottie = lotties.getSwitchLottie()) == null) : !(lotties == null || (switchLottie = lotties.getSwitchLottieNight()) == null)) {
                    str2 = switchLottie;
                }
                C44128b.m97266j(f83541b, "[getHttpUrl#3.2] Unselected & Top: tabId=" + tabId + ", url=" + str2);
                return str2;
            }
        }
        TabExtra extra2 = tabConfig.getExtra();
        TabFullLotties lotties2 = (extra2 == null || (large = extra2.getLarge()) == null) ? null : large.getLotties();
        if (lotties2 != null) {
            if (z11) {
                reverseLottieNight = zM37654h ? lotties2.getLottieNight() : lotties2.getLottie();
            } else {
                reverseLottieNight = zM37654h ? lotties2.getReverseLottieNight() : lotties2.getReverseLottie();
            }
            str2 = reverseLottieNight != null ? reverseLottieNight : "";
            C44128b.m97266j(f83541b, "[getHttpUrl#4] Large Lottie: tabId=" + tabId + ", isSelected=" + z11 + ", url=" + str2);
            return str2;
        }
        TabMainLotties lotties3 = tabConfig.getLotties();
        if (zM37654h) {
            if (lotties3 != null) {
                lottie = lotties3.getLottieNight();
            }
        } else if (lotties3 != null) {
            lottie = lotties3.getLottie();
        }
        String str3 = f83541b;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[getHttpUrl#5] Default Lottie: tabId=");
        sb2.append(tabId);
        sb2.append(", isSelected=");
        sb2.append(z11);
        sb2.append(", url=");
        sb2.append(lottie == null ? "" : lottie);
        C44128b.m97266j(str3, sb2.toString());
        return lottie == null ? "" : lottie;
    }

    /* JADX INFO: renamed from: b */
    public final int m84707b(@NotNull TabConfig tabConfig, boolean z11, int i11, @Nullable String str) {
        Intrinsics.checkNotNullParameter(tabConfig, "tabConfig");
        int i12 = 0;
        if (str != null && str.length() != 0) {
            if (Intrinsics.areEqual(str, "scrollToTop")) {
                i12 = R$raw.lite_icon_scroll_to_top;
            } else if (Intrinsics.areEqual(str, C33789m5.f70921k)) {
                i12 = R$raw.lite_icon_scroll_to_bottom;
            }
            C44128b.m97266j(f83541b, "[getLocalResId#1] Scroll driven: state=" + str + ", resId=" + i12);
            return i12;
        }
        String tabId = tabConfig.getTabId();
        if (z11 && C37575a.f83537a.m84704d().m37643g(tabId)) {
            int i13 = R$raw.lite_icon_scroll_to_top_light_grey;
            C44128b.m97266j(f83541b, "[getLocalResId#2] Selected & Top: tabId=" + tabId + ", resId=" + i13);
            return i13;
        }
        if (!z11) {
            C37575a c37575a = C37575a.f83537a;
            if (c37575a.m84704d().m37642f(tabId)) {
                C44128b.m97266j(f83541b, "[getLocalResId#3.1] Unselected & Bottom: tabId=" + tabId);
                return 0;
            }
            if (c37575a.m84704d().m37643g(tabId)) {
                int i14 = R$raw.lite_icon_top_to_scroll_light_grey;
                C44128b.m97266j(f83541b, "[getLocalResId#3.2] Unselected & Top: tabId=" + tabId + ", resId=" + i14);
                return i14;
            }
        }
        LiteCommonUtils liteCommonUtils = LiteCommonUtils.f32173a;
        boolean zM37656j = liteCommonUtils.m37656j(tabConfig, i11);
        if (Intrinsics.areEqual(tabId, liteCommonUtils.m37648b())) {
            i12 = R$raw.lite_icon_home_lottie;
        } else if (Intrinsics.areEqual(tabId, liteCommonUtils.m37650d())) {
            i12 = R$raw.lite_icon_square_lottie;
        } else if (Intrinsics.areEqual(tabId, liteCommonUtils.m37651e())) {
            if (zM37656j) {
                i12 = z11 ? R$raw.lite_icon_trade_five_item_erect_lottie : R$raw.lite_icon_trade_five_item_horizontal_lottie;
            } else {
                i12 = R$raw.lite_icon_trade_lottie;
            }
        } else if (Intrinsics.areEqual(tabId, liteCommonUtils.m37647a())) {
            i12 = R$raw.lite_icon_earn_lottie;
        } else if (Intrinsics.areEqual(tabId, liteCommonUtils.m37649c())) {
            i12 = R$raw.lite_icon_portfolio_lottie;
        }
        if (i12 == 0) {
            C44128b.m97266j(f83541b, "[getLocalResId#5] No local res: tabId=" + tabId + ", isSelected=" + z11);
            return i12;
        }
        C44128b.m97266j(f83541b, "[getLocalResId#4] Biz mapping: tabId=" + tabId + ", isSelected=" + z11 + ", resId=" + i12);
        return i12;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m84708c(@NotNull TabConfig tabConfig, boolean z11, int i11, @Nullable String str) {
        Intrinsics.checkNotNullParameter(tabConfig, "tabConfig");
        return (m84706a(tabConfig, z11, i11, str).length() > 0) || (m84707b(tabConfig, z11, i11, str) != 0);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ boolean m84705d(C37576b c37576b, TabConfig tabConfig, boolean z11, int i11, String str, int i12, Object obj) {
        if ((i12 & 8) != 0) {
            str = null;
        }
        return c37576b.m84708c(tabConfig, z11, i11, str);
    }
}
