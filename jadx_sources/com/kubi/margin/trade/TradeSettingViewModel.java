package com.kubi.margin.trade;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.utils.C27063n;
import com.kubi.utils.C27099x;
import com.kubi.utils.storage.StorageType;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import mp.C42579a;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p402kf.C41016c;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.C46392a;
import y70.StorageId;

/* JADX INFO: renamed from: com.kubi.margin.trade.p5, reason: from Kotlin metadata */
/* JADX INFO: compiled from: TradeSettingViewModel.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0006J\u000e\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\fJ\u000e\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\fJ\u0010\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0006H\u0002J\b\u0010\u001a\u001a\u00020\u0013H\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\n¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/margin/trade/TradeSettingViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "_currentCurrency", "Landroidx/lifecycle/MutableLiveData;", "", "currentCurrency", "Landroidx/lifecycle/LiveData;", "getCurrentCurrency", "()Landroidx/lifecycle/LiveData;", "_tradePanelPosition", "", "tradePanelPosition", "getTradePanelPosition", "_kLinePosition", "kLinePosition", "getKLinePosition", "setUserCurrency", "", "userCurrency", "onTradePanelPositionSelect", "selectedItemId", "onKLinePositionSelected", "setMarginUserCurrency", FirebaseAnalytics.Param.CURRENCY, "syncRnTradeLayoutPreference", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTradeSettingViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradeSettingViewModel.kt\ncom/kubi/margin/trade/TradeSettingViewModel\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,151:1\n23#2,2:152\n*S KotlinDebug\n*F\n+ 1 TradeSettingViewModel.kt\ncom/kubi/margin/trade/TradeSettingViewModel\n*L\n141#1:152,2\n*E\n"})
public final class TradeSettingViewModel extends ViewModel {

    /* JADX INFO: renamed from: V */
    @NotNull
    public final MutableLiveData<String> f33981V;

    /* JADX INFO: renamed from: W */
    @NotNull
    public final LiveData<String> f33982W;

    /* JADX INFO: renamed from: X */
    @NotNull
    public final MutableLiveData<Integer> f33983X;

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final LiveData<Integer> f33984Y;

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final MutableLiveData<Integer> f33985Z;

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final LiveData<Integer> f33986a0;

    @NotNull
    /* JADX INFO: renamed from: n */
    public final LiveData<String> m40342n() {
        return this.f33982W;
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final LiveData<Integer> m40343o() {
        return this.f33986a0;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final LiveData<Integer> m40344p() {
        return this.f33984Y;
    }

    /* JADX INFO: renamed from: q */
    public final void m40345q(int i11) throws JSONException {
        String str;
        C27063n.m66770h(i11, "k_panel_position");
        this.f33985Z.setValue(Integer.valueOf(i11));
        m40349u();
        JSONObject jSONObject = new JSONObject();
        if (i11 != 1) {
            str = i11 != 2 ? "up" : TIMPushProvider.f75063o;
        } else {
            str = "down";
        }
        jSONObject.put("candleupdownprefervalue", str);
        Unit unit = Unit.INSTANCE;
        C43852m.m96591c("B5tradingpreferencesetting", "candleUpDownPrefer", null, jSONObject, 4, null);
    }

    /* JADX INFO: renamed from: r */
    public final void m40346r(int i11) throws JSONException {
        C27063n.m66770h(i11, "trade_panel_position");
        this.f33983X.setValue(Integer.valueOf(i11));
        m40349u();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("tradeleftrightprefervalue", i11 == 0 ? "left" : "right");
        Unit unit = Unit.INSTANCE;
        C43852m.m96591c("B5tradingpreferencesetting", "tradeLeftRightPrefer", null, jSONObject, 4, null);
    }

    /* JADX INFO: renamed from: s */
    public final void m40347s(String str) {
        C42579a c42579a = C42579a.f94275a;
        if (c42579a.m93347g().c()) {
            c42579a.m93347g().a(str);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m40348t(@NotNull String userCurrency) throws JSONException {
        Intrinsics.checkNotNullParameter(userCurrency, "userCurrency");
        this.f33981V.setValue(userCurrency);
        m40347s(userCurrency);
        C41016c.m89971i(userCurrency);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("fiatprefer", userCurrency);
        Unit unit = Unit.INSTANCE;
        C43852m.m96591c("B5tradingpreferencesetting", "chooseFiatPrefer", null, jSONObject, 4, null);
    }

    /* JADX INFO: renamed from: u */
    public final void m40349u() {
        C46392a.m102333p(new StorageId("kc_jsapi_storage.trade.nativePreference", TtmlNode.TAG_LAYOUT, StorageType.Shared, false, 8, null), C27099x.m66919i(MapsKt.mapOf(TuplesKt.m90091to("tradeInputRight", Boolean.valueOf(C27063n.m66764b("trade_panel_position", 1) == 1)), TuplesKt.m90091to("tradeKlineTop", Integer.valueOf(C27063n.m66765c("k_panel_position", 0, 1, null)))), false, 2, null));
    }

    public TradeSettingViewModel() {
        MutableLiveData<String> mutableLiveData = new MutableLiveData<>();
        this.f33981V = mutableLiveData;
        this.f33982W = mutableLiveData;
        MutableLiveData<Integer> mutableLiveData2 = new MutableLiveData<>();
        this.f33983X = mutableLiveData2;
        this.f33984Y = mutableLiveData2;
        MutableLiveData<Integer> mutableLiveData3 = new MutableLiveData<>();
        this.f33985Z = mutableLiveData3;
        this.f33986a0 = mutableLiveData3;
        mutableLiveData.setValue(C41016c.m89965c());
        mutableLiveData2.setValue(Integer.valueOf(C27063n.m66764b("trade_panel_position", 1)));
        mutableLiveData3.setValue(Integer.valueOf(C27063n.m66765c("k_panel_position", 0, 1, null)));
        m40349u();
    }
}
