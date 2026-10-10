package com.kubi.quotefacade.alpha;

import android.os.Build;
import com.appsflyer.AppsFlyerProperties;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.config.exception.KCConfigException;
import com.kubi.quotefacade.api.IQuoteFacadeService;
import com.kubi.quotefacade.entity.CurrencyFilterTransferData;
import com.kubi.quotefacade.entity.SymbolData;
import com.kubi.sdk.flutter.ui.FlutterEntryActivity;
import com.kubi.search.searchresult.SearchCategory$Companion;
import com.trtc.uikit.livekit.p180kc.data.entity.ClickCardReport;
import f00.C37304a;
import g00.InterfaceC37752d;
import g00.InterfaceC37756h;
import g00.InterfaceC37762n;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p741wy.InterfaceC45941a;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: compiled from: AlphaKlineTransmitReceiver.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\tH\u0016J\u001a\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002J$\u0010\u0013\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\bH\u0002J\f\u0010\u0017\u001a\u00020\t*\u00020\fH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/quotefacade/alpha/AlphaKlineTransmitReceiver;", "Lcom/kubi/sdk/flutter/transmit/IAlphaKlineTransmit;", "<init>", "()V", AppsFlyerProperties.CHANNEL, "Lio/flutter/plugin/common/MethodChannel;", "onPickerResult", "Lkotlin/Function1;", "Lcom/kubi/quotefacade/entity/CurrencyFilterTransferData;", "", "registerWith", "activity", "Lcom/kubi/sdk/flutter/ui/FlutterEntryActivity;", "flutterEngine", "Lio/flutter/embedding/engine/FlutterEngine;", "unregister", "chooseCoin", "arguments", "", "handlePickResult", "originTokenBridgeId", "", "transferData", "disableNavigationAnim", "Companion", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAlphaKlineTransmitReceiver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlphaKlineTransmitReceiver.kt\ncom/kubi/quotefacade/alpha/AlphaKlineTransmitReceiver\n+ 2 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,124:1\n44#2,2:125\n*S KotlinDebug\n*F\n+ 1 AlphaKlineTransmitReceiver.kt\ncom/kubi/quotefacade/alpha/AlphaKlineTransmitReceiver\n*L\n37#1:125,2\n*E\n"})
public final class AlphaKlineTransmitReceiver implements InterfaceC45941a {

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Companion f41137c = new Companion(null);

    /* JADX INFO: renamed from: d */
    @Nullable
    public static AlphaKlineTransmitReceiver f41138d;

    /* JADX INFO: renamed from: a */
    @Nullable
    public MethodChannel f41139a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public Function1<? super CurrencyFilterTransferData, Unit> f41140b;

    /* JADX INFO: compiled from: AlphaKlineTransmitReceiver.kt */
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0000¢\u0006\u0002\b\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/quotefacade/alpha/AlphaKlineTransmitReceiver$Companion;", "", "<init>", "()V", "TAG", "", "CHANNEL", "METHOD_CHOOSE_COIN", "instance", "Lcom/kubi/quotefacade/alpha/AlphaKlineTransmitReceiver;", "finishPicker", "", "transferData", "Lcom/kubi/quotefacade/entity/CurrencyFilterTransferData;", "finishPicker$QuoteFacadeLib_googleRelease", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final void finishPicker$QuoteFacadeLib_googleRelease(@Nullable CurrencyFilterTransferData transferData) {
            Function1 function1;
            AlphaKlineTransmitReceiver alphaKlineTransmitReceiver = AlphaKlineTransmitReceiver.f41138d;
            if (alphaKlineTransmitReceiver != null && (function1 = alphaKlineTransmitReceiver.f41140b) != null) {
                function1.invoke(transferData);
            }
            AlphaKlineTransmitReceiver alphaKlineTransmitReceiver2 = AlphaKlineTransmitReceiver.f41138d;
            if (alphaKlineTransmitReceiver2 != null) {
                alphaKlineTransmitReceiver2.f41140b = null;
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: y */
    public final void m50341y(FlutterEntryActivity flutterEntryActivity, String str, CurrencyFilterTransferData currencyFilterTransferData) {
        SymbolData data;
        String symbolCode;
        SymbolData data2;
        String symbolCode2;
        SymbolData data3;
        String symbolCode3;
        MethodChannel methodChannel;
        String level1 = currencyFilterTransferData != null ? currencyFilterTransferData.getLevel1() : null;
        if (level1 != null) {
            switch (level1.hashCode()) {
                case -1263170109:
                    if (level1.equals(ClickCardReport.ReportData.CARD_TYPE_FUTURE) && (data = currencyFilterTransferData.getData()) != null && (symbolCode = data.getSymbolCode()) != null) {
                        InterfaceC37752d.a.m85122a(C37304a.f82764a, symbolCode, null, null, null, 14, null);
                        flutterEntryActivity.finish();
                        m50340x(flutterEntryActivity);
                    }
                    break;
                case -1081309778:
                    if (level1.equals(ViewProps.MARGIN) && (data2 = currencyFilterTransferData.getData()) != null && (symbolCode2 = data2.getSymbolCode()) != null) {
                        InterfaceC37756h.a.m85145c(C37304a.f82764a, Intrinsics.areEqual(currencyFilterTransferData.getLevel2(), "cross") ? "cross" : "isolated", symbolCode2, null, null, null, null, 60, null);
                        flutterEntryActivity.finish();
                        m50340x(flutterEntryActivity);
                    }
                    break;
                case 3537154:
                    if (level1.equals(SearchCategory$Companion.SPOT) && (data3 = currencyFilterTransferData.getData()) != null && (symbolCode3 = data3.getSymbolCode()) != null) {
                        InterfaceC37762n.a.m85177a(C37304a.f82764a, symbolCode3, null, null, null, 14, null);
                        flutterEntryActivity.finish();
                        m50340x(flutterEntryActivity);
                    }
                    break;
                case 92909918:
                    if (level1.equals("alpha")) {
                        SymbolData data4 = currencyFilterTransferData.getData();
                        String symbolCode4 = data4 != null ? data4.getSymbolCode() : null;
                        if (symbolCode4 != null && !StringsKt.isBlank(symbolCode4) && !Intrinsics.areEqual(symbolCode4, str) && (methodChannel = this.f41139a) != null) {
                            methodChannel.invokeMethod("doChooseAlphaCoin", MapsKt.mapOf(TuplesKt.m90091to("tokenBridgeId", symbolCode4)));
                            break;
                        }
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public static final void m50337z(AlphaKlineTransmitReceiver alphaKlineTransmitReceiver, FlutterEntryActivity flutterEntryActivity, MethodCall call, MethodChannel.Result result) {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(result, "result");
        if (!Intrinsics.areEqual(call.method, "doChooseAlphaCoin")) {
            result.notImplemented();
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            alphaKlineTransmitReceiver.m50339v(flutterEntryActivity, call.arguments);
            result.success(null);
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            C44128b.m97263g("AlphaKlineTransmit", thM103847exceptionOrNullimpl);
            C43846g.m96568c(new KCConfigException(thM103847exceptionOrNullimpl, "AlphaKlineTransmit", false, null, 8, null), null, 2, null);
            result.error("ALPHA_KLINE_NATIVE_ERROR", thM103847exceptionOrNullimpl.getMessage(), null);
        }
    }

    @Override // p741wy.InterfaceC45941a
    /* JADX INFO: renamed from: k */
    public void mo50338k(@NotNull final FlutterEntryActivity activity, @NotNull FlutterEngine flutterEngine) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(flutterEngine, "flutterEngine");
        f41138d = this;
        MethodChannel methodChannel = new MethodChannel(flutterEngine.getDartExecutor().getBinaryMessenger(), "com.kc.alpha.kline");
        this.f41139a = methodChannel;
        methodChannel.setMethodCallHandler(new MethodChannel.MethodCallHandler() { // from class: com.kubi.quotefacade.alpha.k
            @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
            public final void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
                AlphaKlineTransmitReceiver.m50337z(this.f41281b, activity, methodCall, result);
            }
        });
    }

    @Override // p741wy.InterfaceC45941a
    public void unregister() {
        MethodChannel methodChannel = this.f41139a;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(null);
        }
        this.f41139a = null;
        this.f41140b = null;
        if (f41138d == this) {
            f41138d = null;
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m50339v(final FlutterEntryActivity flutterEntryActivity, Object obj) {
        Object obj2;
        if (!IQuoteFacadeService.f41383a.get().mo50718w() || flutterEntryActivity.isFinishing() || flutterEntryActivity.isDestroyed()) {
            return;
        }
        final String string = null;
        Map map = obj instanceof Map ? (Map) obj : null;
        if (map != null && (obj2 = map.get("tokenBridgeId")) != null) {
            string = obj2.toString();
        }
        this.f41140b = new Function1() { // from class: com.kubi.quotefacade.alpha.l
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                return AlphaKlineTransmitReceiver.m50336w(this.f41283b, flutterEntryActivity, string, (CurrencyFilterTransferData) obj3);
            }
        };
        AlphaKlineSymbolPickerActivity.f41135j.launch(flutterEntryActivity, string);
    }

    /* JADX INFO: renamed from: x */
    public final void m50340x(FlutterEntryActivity flutterEntryActivity) {
        if (Build.VERSION.SDK_INT >= 34) {
            flutterEntryActivity.overrideActivityTransition(0, 0, 0);
        } else {
            flutterEntryActivity.overridePendingTransition(0, 0);
        }
    }

    /* JADX INFO: renamed from: w */
    public static final Unit m50336w(AlphaKlineTransmitReceiver alphaKlineTransmitReceiver, FlutterEntryActivity flutterEntryActivity, String str, CurrencyFilterTransferData currencyFilterTransferData) {
        alphaKlineTransmitReceiver.m50341y(flutterEntryActivity, str, currencyFilterTransferData);
        return Unit.INSTANCE;
    }
}
