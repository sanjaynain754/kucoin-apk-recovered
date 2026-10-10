package com.kubi.profit.loss.analysis.api;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.kubi.event.api.C12572a;
import com.kubi.mvi.common.C19241c;
import com.kubi.resources.widget.chart.data.configuration.LineChartConfiguration;
import com.kubi.sdk.BaseFragment;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.C27041f;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import java.math.BigDecimal;
import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: renamed from: com.kubi.profit.loss.analysis.api.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: AssetsProfitLossAnalysisManager.kt */
/* JADX INFO: loaded from: classes35.dex */
@Metadata(m90083d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001EB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010!\u001a\u00020\"J\u000e\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020%J\u0014\u0010&\u001a\u00020\"2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020)0(J\u0006\u0010*\u001a\u00020\"J\u0006\u0010+\u001a\u00020\"J\u0006\u0010,\u001a\u00020\"J\u0006\u0010-\u001a\u00020\"J\u0018\u0010.\u001a\u00020\"2\u0006\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0005J\u000e\u00102\u001a\u00020\"2\u0006\u00103\u001a\u00020%J\u0006\u00104\u001a\u00020\"J\u001f\u00105\u001a\u00020\"2\u0017\u00106\u001a\u0013\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\"07¢\u0006\u0002\b9J\u000e\u0010:\u001a\u00020\"2\u0006\u0010;\u001a\u00020<J\u0006\u0010=\u001a\u00020\"J\u000e\u0010>\u001a\u00020\"2\u0006\u0010?\u001a\u00020\u0005J \u0010@\u001a\u00020\"2\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020\u001c2\b\b\u0002\u0010D\u001a\u00020\u001cR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006F"}, m90084d2 = {"Lcom/kubi/profit/loss/analysis/api/AssetsProfitLossAnalysisManager;", "", "<init>", "()V", "EVENT_UPDATE_CONFIG", "", "EVENT_SET_DATA", "UPDATE_ASSET_DATA", "EVENT_REFRESH_ASSET_TEXT", "EVENT_REFRESH_CHART_DATA", "UPDATE_CHART", "HIDE_ASSET_PLACEHOLDER", "EXTRA_PADDING_TOP", "MODULE_NAME", "EVENT_CHANGE_CHART_VISIBLE", "EVENT_CHANGE_MINI_CHART_VISIBLE", "EVENT_SHOW_COIN_GUIDE", "EVENT_TOUCH_LINE_CHART", "EVENT_NO_TOUCH_LINE_CHART", "EVENT_UPDATE_RANGE", "EVENT_LINE_CHART_ENTRANCE", "EVENT_CLICK_MINI_LINE_CHART", "amountChange", "getAmountChange", "()Ljava/lang/String;", "setAmountChange", "(Ljava/lang/String;)V", "coinGuideCount", "", "getCoinGuideCount", "()I", "setCoinGuideCount", "(I)V", "showChart", "", "updateLineChartEntrance", ViewProps.VISIBLE, "", "setData", RemoteConfigConstants.ResponseFieldKey.ENTRIES, "", "Lcom/kubi/resources/widget/chart/data/DataPoint;", "hideChart", "showMiniChart", "hideMiniChart", "showCoinGuide", "updateAsset", "totalAssets", "Ljava/math/BigDecimal;", "baseCurrency", "hideAsset", TIMPushProvider.f75063o, "updateChart", "updateConfig", "block", "Lkotlin/Function1;", "Lcom/kubi/resources/widget/chart/data/configuration/LineChartConfiguration;", "Lkotlin/ExtensionFunctionType;", "sendTouchChartEvent", "dataPoint", "", "sendNoTouchChartEvent", "sendUpdateRangeEvent", SessionDescription.ATTR_RANGE, "createProfitLossAnalysisFragment", "parentFragment", "Landroidx/fragment/app/Fragment;", "containerId", ViewProps.PADDING_TOP, "UpdateConfig", "ProfitLossAnalysisApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAssetsProfitLossAnalysisManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetsProfitLossAnalysisManager.kt\ncom/kubi/profit/loss/analysis/api/AssetsProfitLossAnalysisManager\n+ 2 MviEx.kt\ncom/kubi/mvi/common/MviExKt\n*L\n1#1,212:1\n50#2,17:213\n*S KotlinDebug\n*F\n+ 1 AssetsProfitLossAnalysisManager.kt\ncom/kubi/profit/loss/analysis/api/AssetsProfitLossAnalysisManager\n*L\n201#1:213,17\n*E\n"})
public final class AssetsProfitLossAnalysisManager {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final AssetsProfitLossAnalysisManager f40608a = new AssetsProfitLossAnalysisManager();

    /* JADX INFO: renamed from: b */
    @Nullable
    public static String f40609b = "-2";

    /* JADX INFO: renamed from: c */
    public static int f40610c;

    /* JADX INFO: renamed from: com.kubi.profit.loss.analysis.api.a$a */
    /* JADX INFO: compiled from: AssetsProfitLossAnalysisManager.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B \u0012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/profit/loss/analysis/api/AssetsProfitLossAnalysisManager$UpdateConfig;", "", "block", "Lkotlin/Function1;", "Lcom/kubi/resources/widget/chart/data/configuration/LineChartConfiguration;", "", "Lkotlin/ExtensionFunctionType;", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "getBlock", "()Lkotlin/jvm/functions/Function1;", "ProfitLossAnalysisApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a */
        @NotNull
        public final Function1<LineChartConfiguration, Unit> f40611a;

        @NotNull
        /* JADX INFO: renamed from: a */
        public final Function1<LineChartConfiguration, Unit> m49954a() {
            return this.f40611a;
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m49946h() {
        C12572a.m23695d("no_touch_line_chart", null, 0L, 6, null);
    }

    /* JADX INFO: renamed from: o */
    public final void m49953o() {
        C12572a.m23695d("update_chart", "update_chart", 0L, 4, null);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m49939b(AssetsProfitLossAnalysisManager assetsProfitLossAnalysisManager, Fragment fragment, int i11, int i12, int i13, Object obj) throws Throwable {
        if ((i13 & 4) != 0) {
            i12 = C27040e.m66658b(12);
        }
        assetsProfitLossAnalysisManager.m49940a(fragment, i11, i12);
    }

    /* JADX INFO: renamed from: a */
    public final void m49940a(@NotNull Fragment parentFragment, int i11, int i12) throws Throwable {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(parentFragment, "parentFragment");
        boolean zM42528a = C19241c.f35620a.m42528a();
        boolean z11 = !zM42528a;
        try {
            Result.Companion companion = Result.INSTANCE;
            BaseFragment baseFragmentMo49938a = IAssetsProfitLossAnalysisService.f40529a.get().mo49938a();
            Bundle bundle = new Bundle();
            bundle.putString("padding_top", String.valueOf(i12));
            baseFragmentMo49938a.setArguments(bundle);
            parentFragment.getChildFragmentManager().beginTransaction().replace(i11, baseFragmentMo49938a).commitNowAllowingStateLoss();
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            if (zM42528a || (thM103847exceptionOrNullimpl instanceof CancellationException)) {
                throw thM103847exceptionOrNullimpl;
            }
            C44128b.m97262f("crash_issue", "crash_issue->【ProfitLossAnalysis 发生错误:needCatch->" + z11 + (char) 12305, thM103847exceptionOrNullimpl);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final String m49941c() {
        return f40609b;
    }

    /* JADX INFO: renamed from: d */
    public final int m49942d() {
        return f40610c;
    }

    /* JADX INFO: renamed from: f */
    public final void m49944f() {
        C12572a.m23695d("change_chart_visible", Boolean.FALSE, 0L, 4, null);
    }

    /* JADX INFO: renamed from: g */
    public final void m49945g() {
        C12572a.m23695d("change_mini_chart_visible", Boolean.FALSE, 0L, 4, null);
    }

    /* JADX INFO: renamed from: j */
    public final void m49948j(@NotNull String range) {
        Intrinsics.checkNotNullParameter(range, "range");
        C12572a.m23695d("update_range", range, 0L, 4, null);
    }

    /* JADX INFO: renamed from: k */
    public final void m49949k(int i11) {
        f40610c = i11;
    }

    /* JADX INFO: renamed from: l */
    public final void m49950l() {
        C12572a.m23695d("change_chart_visible", Boolean.TRUE, 0L, 4, null);
    }

    /* JADX INFO: renamed from: m */
    public final void m49951m() {
        C12572a.m23695d("change_mini_chart_visible", Boolean.TRUE, 0L, 4, null);
    }

    /* JADX INFO: renamed from: n */
    public final void m49952n(@NotNull BigDecimal totalAssets, @Nullable String str) {
        Intrinsics.checkNotNullParameter(totalAssets, "totalAssets");
        C12572a.m23695d("update_asset_data", new Asset(totalAssets, C27041f.m66668h(str)), 0L, 4, null);
    }

    /* JADX INFO: renamed from: e */
    public final void m49943e(boolean z11) {
        C12572a.m23695d("hide_asset", Boolean.valueOf(z11), 0L, 4, null);
    }

    /* JADX INFO: renamed from: i */
    public final void m49947i(double d11) {
        C12572a.m23695d("touch_line_chart", Double.valueOf(d11), 0L, 4, null);
    }
}
