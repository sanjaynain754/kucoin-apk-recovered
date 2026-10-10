package com.kubi.margin.kline;

import android.os.Bundle;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.flutter.proto.kline.MainIndexType;
import com.kubi.flutter.proto.kline.SubIndexType;
import com.kubi.flutter.proto.kline.SwitchType;
import com.kubi.flutter.proto.kline.VolumeConfig;
import com.kubi.flutter.proto.kline.VolumeConfigKt$Dsl;
import com.kubi.flutter.widget.kline.IKLineDataInteractor;
import com.kubi.flutter.widget.kline.KLineConverter;
import com.kubi.flutter.widget.kline.KLineType;
import com.kubi.flutter.widget.kline.KLineViewController;
import com.kubi.flutter.widget.kline.interactor.KLineMarketDataInteractor;
import com.kubi.flutter.widget.kline.view.KlineSmallBaseFragment;
import com.kubi.tradebase.business.klineSettings.KlineTrack;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import gf.C37878b0;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import p569qq.C43841b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: MarginSmallFlutterKlineFragment.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u0010\u001a\u00020\rH\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0014J\u0010\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0012H\u0014R\u0014\u0010\u0004\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/margin/kline/MarginSmallFlutterKlineFragment;", "Lcom/kubi/flutter/widget/kline/view/KlineSmallBaseFragment;", "<init>", "()V", "initParam", "Lcom/kubi/flutter/widget/kline/KLineViewController$InitParam;", "getInitParam", "()Lcom/kubi/flutter/widget/kline/KLineViewController$InitParam;", "interactor", "Lcom/kubi/flutter/widget/kline/IKLineDataInteractor;", "getInteractor", "()Lcom/kubi/flutter/widget/kline/IKLineDataInteractor;", "checkSymbol", "", "symbolBean", "Lcom/kubi/data/entity/TradeItemBean;", "onDataFirstLoaded", "getCurrentKline", "", "setCurrentKline", "value", "Companion", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMarginSmallFlutterKlineFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarginSmallFlutterKlineFragment.kt\ncom/kubi/margin/kline/MarginSmallFlutterKlineFragment\n+ 2 VolumeConfigKt.kt\ncom/kubi/flutter/proto/kline/VolumeConfigKtKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,78:1\n8#2:79\n1#3:80\n*S KotlinDebug\n*F\n+ 1 MarginSmallFlutterKlineFragment.kt\ncom/kubi/margin/kline/MarginSmallFlutterKlineFragment\n*L\n53#1:79\n53#1:80\n*E\n"})
public final class MarginSmallFlutterKlineFragment extends KlineSmallBaseFragment {

    /* JADX INFO: renamed from: e0 */
    @NotNull
    public static final Companion f33119e0 = new Companion(null);

    /* JADX INFO: compiled from: MarginSmallFlutterKlineFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, m90084d2 = {"Lcom/kubi/margin/kline/MarginSmallFlutterKlineFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/margin/kline/MarginSmallFlutterKlineFragment;", "symbol", "", "precision", "", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final MarginSmallFlutterKlineFragment newInstance(@NotNull String symbol, int precision) {
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            MarginSmallFlutterKlineFragment marginSmallFlutterKlineFragment = new MarginSmallFlutterKlineFragment();
            Bundle bundle = new Bundle();
            bundle.putString("symbol", symbol);
            bundle.putInt("data_3", precision);
            marginSmallFlutterKlineFragment.setArguments(bundle);
            return marginSmallFlutterKlineFragment;
        }
    }

    /* JADX INFO: renamed from: J3 */
    public static final Unit m38693J3() {
        C43841b.m96557d("margin_kline_load", "data_load_finish", null, 4, null);
        return Unit.INSTANCE;
    }

    @Override // com.kubi.flutter.widget.kline.view.KlineSmallBaseFragment
    /* JADX INFO: renamed from: B3 */
    public void mo24412B3() {
        runOnUiThread(new Function0() { // from class: com.kubi.margin.kline.t1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginSmallFlutterKlineFragment.m38693J3();
            }
        });
    }

    @Override // com.kubi.flutter.widget.kline.view.KlineSmallBaseFragment
    /* JADX INFO: renamed from: C3 */
    public void mo24413C3(int i11) throws JSONException {
        C37878b0.f85252a.m85538s(i11);
        KlineTrack.f51542a.m63176b(i11, "lever");
        m24420q3(i11);
    }

    /* JADX INFO: renamed from: I3 */
    public final void m38694I3(@NotNull TradeItemBean symbolBean) {
        Intrinsics.checkNotNullParameter(symbolBean, "symbolBean");
        String symbol = symbolBean.getSymbol();
        int iM66650j = C27039d.m66650j(Integer.valueOf(symbolBean.getSymbolInfoEntity().getPriceIncrementPrecision()));
        Intrinsics.checkNotNull(symbol);
        m24419p3(symbol, iM66650j);
    }

    @Override // com.kubi.flutter.widget.kline.view.KlineSmallBaseFragment
    /* JADX INFO: renamed from: w3 */
    public int mo24424w3() {
        return C37878b0.f85252a.m85523d();
    }

    @Override // com.kubi.flutter.widget.kline.view.KlineSmallBaseFragment
    @NotNull
    /* JADX INFO: renamed from: x3 */
    public KLineViewController.InitParam mo24425x3() {
        C37878b0 c37878b0 = C37878b0.f85252a;
        int iM85523d = c37878b0.m85523d();
        Bundle arguments = getArguments();
        String strM66668h = C27041f.m66668h(arguments != null ? arguments.getString("symbol") : null);
        Bundle arguments2 = getArguments();
        int iM66651k = C27039d.m66651k(arguments2 != null ? Integer.valueOf(arguments2.getInt("data_3")) : null, 2);
        KLineConverter kLineConverter = KLineConverter.f22477a;
        KLineType kLineTypeM24353a = kLineConverter.m24353a(iM85523d);
        List<MainIndexType> listM24354b = kLineConverter.m24354b(c37878b0.m85525f());
        List listListOf = CollectionsKt.listOf(SubIndexType.VOL);
        VolumeConfigKt$Dsl.Companion companion = VolumeConfigKt$Dsl.f22220b;
        VolumeConfig.C12735b c12735bNewBuilder = VolumeConfig.newBuilder();
        Intrinsics.checkNotNullExpressionValue(c12735bNewBuilder, "newBuilder(...)");
        VolumeConfigKt$Dsl volumeConfigKt$Dsl_create = companion._create(c12735bNewBuilder);
        volumeConfigKt$Dsl_create.m24063b(SwitchType.OFF);
        return new KLineViewController.InitParam(strM66668h, iM66651k, kLineTypeM24353a, "trade-margin", listM24354b, listListOf, iM85523d == 0, null, volumeConfigKt$Dsl_create.m24062a(), null, false, false, false, false, 16000, null);
    }

    @Override // com.kubi.flutter.widget.kline.view.KlineSmallBaseFragment
    @NotNull
    /* JADX INFO: renamed from: y3 */
    public IKLineDataInteractor mo24426y3() {
        return new KLineMarketDataInteractor();
    }
}
