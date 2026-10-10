package x20;

import com.kubi.data.entity.CheckCodeResultEntity;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.sdk.flutter.FlutterConfig;
import com.kubi.sdk.flutter.ui.FlutterEntryActivity;
import com.kubi.spot.helper.TradeModel;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.ArrayList;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import p741wy.InterfaceC45956p;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import w20.C45700a;

/* JADX INFO: renamed from: x20.e */
/* JADX INFO: compiled from: FlutterTradeTransmit.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\r"}, m90084d2 = {"Lcom/kubi/spot/flutter/FlutterTradeTransmit;", "Lcom/kubi/sdk/flutter/transmit/ITradeTransmit;", "<init>", "()V", "checkValidationCode", "", "call", "Lio/flutter/plugin/common/MethodCall;", DbParams.KEY_CHANNEL_RESULT, "Lio/flutter/plugin/common/MethodChannel$Result;", "context", "Lcom/kubi/sdk/flutter/ui/FlutterEntryActivity;", "getSymbolInfo", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFlutterTradeTransmit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlutterTradeTransmit.kt\ncom/kubi/spot/flutter/FlutterTradeTransmit\n+ 2 SpotIssue.kt\ncom/kubi/spot/exeption/SpotIssueKt\n*L\n1#1,96:1\n43#2,7:97\n*S KotlinDebug\n*F\n+ 1 FlutterTradeTransmit.kt\ncom/kubi/spot/flutter/FlutterTradeTransmit\n*L\n45#1:97,7\n*E\n"})
public final class C45998e implements InterfaceC45956p {
    @Override // p741wy.InterfaceC45956p
    /* JADX INFO: renamed from: l */
    public void mo101384l(@NotNull MethodCall call, @NotNull MethodChannel.Result result) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(result, "result");
        String str = (String) call.argument("symbol");
        if (str == null) {
            return;
        }
        HashMap map = new HashMap();
        TradeItemBean tradeItemBean = new TradeItemBean(str);
        map.put("code", C27041f.m66668h(tradeItemBean.getSymbolInfoEntity().getCode()));
        map.put("symbol", C27041f.m66668h(tradeItemBean.getSymbolInfoEntity().getSymbol()));
        map.put("baseCurrency", C27041f.m66668h(tradeItemBean.getSymbolInfoEntity().getBaseCurrency()));
        map.put("quoteCurrency", C27041f.m66668h(tradeItemBean.getSymbolInfoEntity().getQuoteCurrency()));
        map.put("quoteCurrencyName", C27041f.m66668h(tradeItemBean.getSymbolInfoEntity().getQuoteCurrencyName()));
        map.put("baseCurrencyName", C27041f.m66668h(tradeItemBean.getSymbolInfoEntity().getBaseCurrencyName()));
        map.put("mark", Integer.valueOf(C27039d.m66650j(Integer.valueOf(tradeItemBean.getSymbolInfoEntity().getMark()))));
        map.put("board", Integer.valueOf(C27039d.m66650j(Integer.valueOf(tradeItemBean.getSymbolInfoEntity().getBoard()))));
        map.put("weight", Integer.valueOf(C27039d.m66650j(Integer.valueOf(tradeItemBean.getSymbolInfoEntity().getWeight()))));
        map.put("enableTrading", Boolean.valueOf(C27025c.m66566d(Boolean.valueOf(tradeItemBean.getSymbolInfoEntity().isEnableTrading()))));
        map.put("disabledTip", C27041f.m66668h(tradeItemBean.getSymbolInfoEntity().getDisabledTip()));
        map.put("display", Boolean.valueOf(C27025c.m66566d(Boolean.valueOf(tradeItemBean.getSymbolInfoEntity().isDisplay()))));
        map.put("market", C27041f.m66668h(tradeItemBean.getSymbolInfoEntity().getMarket()));
        map.put("feeCode", C27041f.m66668h(tradeItemBean.getSymbolInfoEntity().getFeeCode()));
        map.put("isMarginEnabled", Boolean.valueOf(C27025c.m66566d(Boolean.valueOf(tradeItemBean.getSymbolInfoEntity().isMarginEnabled()))));
        map.put("isIsolatedMarginEnabled", Boolean.valueOf(C27025c.m66566d(Boolean.valueOf(tradeItemBean.getSymbolInfoEntity().isIsolatedMarginEnabled()))));
        map.put("isIsolatedMarginTradeEnabled", Boolean.valueOf(C27025c.m66566d(Boolean.valueOf(tradeItemBean.getSymbolInfoEntity().isIsolatedMarginTradeEnabled()))));
        map.put("makerFeeRate", Double.valueOf(C27039d.m66646f(Double.valueOf(tradeItemBean.getSymbolInfoEntity().getMakerFeeRate()))));
        map.put("takerFeeRate", Double.valueOf(C27039d.m66646f(Double.valueOf(tradeItemBean.getSymbolInfoEntity().getTakerFeeRate()))));
        map.put("quoteIncrement", C27041f.m66668h(tradeItemBean.getSymbolInfoEntity().getQuoteIncrement()));
        map.put("quoteIncrementPrecision", Integer.valueOf(C27039d.m66650j(Integer.valueOf(tradeItemBean.getSymbolInfoEntity().getQuoteIncrementPrecision()))));
        map.put("quoteIncrementPrecisionTrade", Integer.valueOf(C27039d.m66650j(Integer.valueOf(tradeItemBean.getSymbolInfoEntity().getQuoteIncrementPrecisionTrade()))));
        map.put("baseIncrement", C27041f.m66668h(tradeItemBean.getSymbolInfoEntity().getBaseIncrement()));
        map.put("type", C27041f.m66668h(tradeItemBean.getSymbolInfoEntity().getType()));
        map.put("baseIncrementPrecision", Integer.valueOf(C27039d.m66650j(Integer.valueOf(tradeItemBean.getSymbolInfoEntity().getBaseIncrementPrecision()))));
        map.put("baseIncrementPrecisionTrade", Integer.valueOf(C27039d.m66650j(Integer.valueOf(tradeItemBean.getSymbolInfoEntity().getBaseIncrementPrecisionTrade()))));
        map.put("priceIncrement", C27041f.m66668h(tradeItemBean.getSymbolInfoEntity().getPriceIncrement()));
        map.put("priceIncrementPrecision", Integer.valueOf(C27039d.m66650j(Integer.valueOf(tradeItemBean.getSymbolInfoEntity().getPriceIncrementPrecision()))));
        map.put("priceIncrementPrecisionTrade", Integer.valueOf(C27039d.m66650j(Integer.valueOf(tradeItemBean.getSymbolInfoEntity().getPriceIncrementPrecisionTrade()))));
        map.put("quoteMinSize", Double.valueOf(C27039d.m66646f(Double.valueOf(tradeItemBean.getSymbolInfoEntity().getQuoteMinSize()))));
        map.put("quoteMaxSize", Double.valueOf(C27039d.m66646f(Double.valueOf(tradeItemBean.getSymbolInfoEntity().getQuoteMaxSize()))));
        map.put("baseMinSize", Double.valueOf(C27039d.m66646f(Double.valueOf(tradeItemBean.getSymbolInfoEntity().getBaseMinSize()))));
        map.put("baseMaxSize", Double.valueOf(C27039d.m66646f(Double.valueOf(tradeItemBean.getSymbolInfoEntity().getBaseMaxSize()))));
        map.put("priceLimitRate", Double.valueOf(C27039d.m66646f(Double.valueOf(tradeItemBean.getSymbolInfoEntity().getPriceLimitRate()))));
        map.put("isBotEnabled", Boolean.valueOf(C27025c.m66566d(Boolean.valueOf(tradeItemBean.getSymbolInfoEntity().isBotEnabled()))));
        map.put("previewEnableShow", Boolean.valueOf(C27025c.m66566d(Boolean.valueOf(tradeItemBean.getSymbolInfoEntity().isPreviewEnableShow()))));
        map.put("previewRemainSecond", Integer.valueOf(C27039d.m66650j(Integer.valueOf(tradeItemBean.getSymbolInfoEntity().getPreviewRemainSecond()))));
        map.put("previewTime", Long.valueOf(C27039d.m66652l(tradeItemBean.getSymbolInfoEntity().getPreviewTime())));
        map.put("tradeEnableShow", Boolean.valueOf(C27025c.m66566d(Boolean.valueOf(tradeItemBean.getSymbolInfoEntity().isTradeEnableShow()))));
        map.put("showSymbol", C27041f.m66668h(tradeItemBean.getSymbolInfoEntity().getShowSymbol()));
        result.success(map);
    }

    /* JADX INFO: renamed from: u */
    public static final Unit m101476u(HashMap map, MethodChannel.Result result, ArrayList arrayList) {
        map.put(DbParams.KEY_CHANNEL_RESULT, Boolean.TRUE);
        map.put("errorMsg", "");
        result.success(map);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w */
    public static final Unit m101478w(HashMap map, MethodChannel.Result result, Throwable th2) {
        map.put(DbParams.KEY_CHANNEL_RESULT, Boolean.FALSE);
        map.put("errorMsg", String.valueOf(th2.getMessage()));
        result.success(map);
        Intrinsics.checkNotNull(th2);
        String simpleName = FlutterConfig.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        C45700a.m100877c(th2, simpleName);
        return Unit.INSTANCE;
    }

    @Override // p741wy.InterfaceC45956p
    /* JADX INFO: renamed from: o */
    public void mo101385o(@NotNull MethodCall call, @NotNull final MethodChannel.Result result, @NotNull FlutterEntryActivity context) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(context, "context");
        String str3 = (String) call.argument("biz_type");
        if (str3 == null || (str = (String) call.argument("value")) == null || (str2 = (String) call.argument("key")) == null) {
            return;
        }
        final HashMap map = new HashMap();
        Observable<ArrayList<CheckCodeResultEntity>> observableM61850d = new TradeModel().m61850d(str3, str2, str);
        final Function1 function1 = new Function1() { // from class: x20.a
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C45998e.m101476u(map, result, (ArrayList) obj);
            }
        };
        Consumer<? super ArrayList<CheckCodeResultEntity>> consumer = new Consumer() { // from class: x20.b
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C45998e.m101477v(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: x20.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C45998e.m101478w(map, result, (Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableM61850d.subscribe(consumer, new Consumer() { // from class: x20.d
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C45998e.m101479x(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, context.getF46748j());
    }

    /* JADX INFO: renamed from: v */
    public static final void m101477v(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: x */
    public static final void m101479x(Function1 function1, Object obj) {
        function1.invoke(obj);
    }
}
