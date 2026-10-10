package com.kubi.jsbridge.impl.biz.trade;

import android.app.Activity;
import android.content.Context;
import com.blankj.utilcode.util.C5258a;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.data.entity.AlphaCurrencyInfoEntity;
import com.kubi.kumex.api.IKuMexService;
import com.kubi.loan.api.ILoanService;
import com.kubi.loan.api.entity.LeverCoinConfig;
import com.kubi.margin.api.IMarginService;
import com.kubi.margin.api.entity.IsolatedMarginBridgeConfig;
import com.kubi.mvi.common.MviExKt;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiTradeAlphaCurrencyInfo;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiTradeIsolatedMarginConfig;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiTradeMarginConfig;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiTradeMarginCurrency;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiTradeSymbolOfflineInfo;
import com.kubi.unify.api.IUnifyAccountService;
import com.kubi.utaspot.api.IUtaSpotService;
import com.tencent.qcloud.tuicore.TUIConstants;
import d00.InterfaceC36569e0;
import gf.C37890n;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: KCJsBridgeTrade.kt */
/* JADX INFO: loaded from: classes17.dex */
@Metadata(m90083d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003Jt\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\r2\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\u001c\u0010\u0014\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u00070\u0015H\u0016JH\u0010\u0017\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\r2\u001c\u0010\u0014\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u00070\u0015H\u0016JP\u0010\u001a\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u001c\u0010\u0014\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u00070\u0015H\u0016JF\u0010 \u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\"\u0010\u0014\u001a\u001e\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010!\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u00070\u0015H\u0016J@\u0010\"\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u001c\u0010\u0014\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u00070\u0015H\u0016JH\u0010#\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010$\u001a\u00020\r2\u001c\u0010\u0014\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010%\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u00070\u0015H\u0016JF\u0010&\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\"\u0010\u0014\u001a\u001e\u0012\f\u0012\n\u0012\u0004\u0012\u00020%\u0018\u00010!\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u00070\u0015H\u0016J@\u0010'\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u001c\u0010\u0014\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010(\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u00070\u0015H\u0016JH\u0010)\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\r2\u001c\u0010\u0014\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u00070\u0015H\u0016JF\u0010*\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\"\u0010\u0014\u001a\u001e\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010!\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u00070\u0015H\u0016J@\u0010+\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u001c\u0010\u0014\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u00070\u0015H\u0016J`\u0010,\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010-\u001a\u00020\r2\u0006\u0010$\u001a\u00020\r2\u0006\u0010.\u001a\u00020\r2\u0006\u0010/\u001a\u00020\r2\u001c\u0010\u0014\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u00070\u0015H\u0016J\f\u00100\u001a\u00020\u001f*\u000201H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00062"}, m90084d2 = {"Lcom/kubi/jsbridge/impl/biz/trade/KCJsBridgeTrade;", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiTradeModule;", "<init>", "()V", "bridgeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "openNativeMarketsSymbolDialog", "", "ctx", "Landroid/content/Context;", "obj", "Ljava/lang/Object;", "source", "", "level1", "level2", "level3", "data", "", "", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "Lcom/kubi/sdk/protocol/ProtocolException;", "fetchMarginCurrency", FirebaseAnalytics.Param.CURRENCY, "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiTradeMarginCurrency;", "getAlphaCurrencyInfo", "currencySeq", "", "quoteCurrency", "", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiTradeAlphaCurrencyInfo;", "getAlphaCurrencyInfoBatch", "", "getContractTradeUnit", "getIsolatedMarginConfig", "symbol", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiTradeIsolatedMarginConfig;", "getIsolatedMarginConfigBatch", "getMarginConfig", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiTradeMarginConfig;", "getMarginCurrency", "getMarginCurrencyList", "isUtaHasOpend", "openOrderDetail", "orderId", "bussinesType", "content", "toJsAlphaCurrencyInfo", "Lcom/kubi/data/entity/AlphaCurrencyInfoEntity;", "JsBridgeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKCJsBridgeTrade.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCJsBridgeTrade.kt\ncom/kubi/jsbridge/impl/biz/trade/KCJsBridgeTrade\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,361:1\n1563#2:362\n1634#2,3:363\n1563#2:366\n1634#2,3:367\n1563#2:371\n1634#2,3:372\n1#3:370\n*S KotlinDebug\n*F\n+ 1 KCJsBridgeTrade.kt\ncom/kubi/jsbridge/impl/biz/trade/KCJsBridgeTrade\n*L\n162#1:362\n162#1:363,3\n210#1:366\n210#1:367,3\n275#1:371\n275#1:372,3\n*E\n"})
public final class KCJsBridgeTrade implements InterfaceC36569e0 {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final CompositeDisposable f27371a = new CompositeDisposable();

    @Override // d00.InterfaceC36569e0
    /* JADX INFO: renamed from: g */
    public void mo31587g(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String orderId, @NotNull String symbol, @NotNull String bussinesType, @NotNull String content, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(bussinesType, "bussinesType");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            Result.Companion companion = Result.INSTANCE;
            if (StringsKt.equals("FUTURES", bussinesType, true)) {
                IUnifyAccountService.f53155a.get().mo65004t(ctx, orderId, symbol, content, bussinesType);
            } else {
                IUtaSpotService.f54014a.get().mo65988a(ctx, orderId, symbol, content, bussinesType);
            }
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103851isSuccessimpl(objM103844constructorimpl)) {
            callback.invoke(Boolean.TRUE, null);
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            callback.invoke(Boolean.FALSE, new ProtocolException("openOrderDetail failed", thM103847exceptionOrNullimpl, null, false, 12, null));
        }
    }

    @Override // d00.InterfaceC36569e0
    /* JADX INFO: renamed from: j */
    public void mo31590j(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Map<String, ? extends Object> map, @NotNull Function2<? super String, ? super ProtocolException, Unit> callback) {
        Object obj2;
        Object obj3;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Pair pairM90091to = TuplesKt.m90091to("level1", str);
        Pair pairM90091to2 = TuplesKt.m90091to("level2", str2);
        Pair pairM90091to3 = TuplesKt.m90091to("level3", str3);
        String string = null;
        Pair pairM90091to4 = TuplesKt.m90091to("symbolCode", (map == null || (obj3 = map.get("symbolCode")) == null) ? null : obj3.toString());
        if (map != null && (obj2 = map.get("leverage")) != null) {
            string = obj2.toString();
        }
        MviExKt.m42518n(new KCJsBridgeTrade$openNativeMarketsSymbolDialog$1(new Ref.BooleanRef(), MapsKt.mapOf(pairM90091to, pairM90091to2, pairM90091to3, TuplesKt.m90091to("data", MapsKt.mapOf(pairM90091to4, TuplesKt.m90091to("leverage", string)))), new Ref.BooleanRef(), callback, null));
    }

    /* JADX INFO: renamed from: A */
    public static final void m31568A(Ref.BooleanRef booleanRef, Function2<? super String, ? super ProtocolException, Unit> function2, String str, ProtocolException protocolException) {
        if (booleanRef.element) {
            return;
        }
        booleanRef.element = true;
        function2.invoke(str, protocolException);
    }

    /* JADX INFO: renamed from: v */
    public static final void m31575v(Ref.ObjectRef objectRef, CompositeDisposable compositeDisposable) {
        Disposable disposable = (Disposable) objectRef.element;
        if (disposable != null) {
            compositeDisposable.remove(disposable);
        }
    }

    /* JADX INFO: renamed from: y */
    public static final Unit m31578y(Function2 function2, Throwable th2) {
        function2.invoke(null, new ProtocolException("getMarginCurrencyList failed", th2, null, false, 12, null));
        return Unit.INSTANCE;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 ??, still in use, count: 1, list:
          (r0v0 ?? I:??[OBJECT, ARRAY]) from 0x00cd: RETURN (r0v0 ?? I:??[OBJECT, ARRAY]) (LINE:143)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    /* JADX INFO: renamed from: B */
    public final com.kubi.sdk.protocol.jsapi.protocol.KCJSApiTradeAlphaCurrencyInfo m31580B(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 ??, still in use, count: 1, list:
          (r0v0 ?? I:??[OBJECT, ARRAY]) from 0x00cd: RETURN (r0v0 ?? I:??[OBJECT, ARRAY]) (LINE:143)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r30v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */

    @Override // d00.InterfaceC36569e0
    /* JADX INFO: renamed from: a */
    public void mo31581a(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull Function2<? super List<KCJSApiTradeIsolatedMarginConfig>, ? super ProtocolException, Unit> callback) {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            Result.Companion companion = Result.INSTANCE;
            List<IsolatedMarginBridgeConfig> listMo37903A = IMarginService.f32724a.get().mo37903A();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listMo37903A, 10));
            for (IsolatedMarginBridgeConfig isolatedMarginBridgeConfig : listMo37903A) {
                TradeMarginBridgeMapper tradeMarginBridgeMapper = TradeMarginBridgeMapper.f27387a;
                String symbol = isolatedMarginBridgeConfig.getSymbol();
                if (symbol == null) {
                    symbol = "";
                }
                arrayList.add(tradeMarginBridgeMapper.m31608b(isolatedMarginBridgeConfig, symbol));
            }
            objM103844constructorimpl = Result.m103844constructorimpl(arrayList);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103851isSuccessimpl(objM103844constructorimpl)) {
            callback.invoke((List) objM103844constructorimpl, null);
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            callback.invoke(null, new ProtocolException("getIsolatedMarginConfigBatch failed", thM103847exceptionOrNullimpl, null, false, 12, null));
        }
    }

    @Override // d00.InterfaceC36569e0
    /* JADX INFO: renamed from: b */
    public void mo31582b(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull Function2<? super List<KCJSApiTradeAlphaCurrencyInfo>, ? super ProtocolException, Unit> callback) {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            Result.Companion companion = Result.INSTANCE;
            List<AlphaCurrencyInfoEntity> listM85612t = C37890n.f85269a.m85612t();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM85612t, 10));
            Iterator<T> it = listM85612t.iterator();
            while (it.hasNext()) {
                arrayList.add(m31580B((AlphaCurrencyInfoEntity) it.next()));
            }
            objM103844constructorimpl = Result.m103844constructorimpl(arrayList);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103851isSuccessimpl(objM103844constructorimpl)) {
            callback.invoke((List) objM103844constructorimpl, null);
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            callback.invoke(null, new ProtocolException("getAlphaCurrencyInfoBatch failed", thM103847exceptionOrNullimpl, null, false, 12, null));
        }
    }

    @Override // d00.InterfaceC36569e0
    /* JADX INFO: renamed from: c */
    public void mo31583c(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String symbol, @NotNull Function2<? super KCJSApiTradeIsolatedMarginConfig, ? super ProtocolException, Unit> callback) {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(TradeMarginBridgeMapper.f27387a.m31608b(IMarginService.f32724a.get().mo37919S(symbol), symbol));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103851isSuccessimpl(objM103844constructorimpl)) {
            callback.invoke((KCJSApiTradeIsolatedMarginConfig) objM103844constructorimpl, null);
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            callback.invoke(null, new ProtocolException("getIsolatedMarginConfig failed", thM103847exceptionOrNullimpl, null, false, 12, null));
        }
    }

    @Override // d00.InterfaceC36569e0
    /* JADX INFO: renamed from: e */
    public void mo31585e(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.invoke(Boolean.valueOf(IUnifyAccountService.f53155a.get().mo64991e()), null);
    }

    @Override // d00.InterfaceC36569e0
    /* JADX INFO: renamed from: f */
    public void mo31586f(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String currency, @NotNull Function2<? super KCJSApiTradeMarginCurrency, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.invoke(TradeMarginBridgeMapper.f27387a.m31610d(ILoanService.f32363a.get().mo37707f(currency, true), C37890n.f85269a.m85613u(currency), currency), null);
    }

    @Override // d00.InterfaceC36569e0
    /* JADX INFO: renamed from: k */
    public void mo31591k(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull Function2<? super String, ? super ProtocolException, Unit> callback) {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(IKuMexService.f28731a.get().mo33288r());
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103851isSuccessimpl(objM103844constructorimpl)) {
            callback.invoke((String) objM103844constructorimpl, null);
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            callback.invoke(null, new ProtocolException("getContractTradeUnit failed", thM103847exceptionOrNullimpl, null, false, 12, null));
        }
    }

    /* JADX WARN: Type inference failed for: r6v5, types: [T, io.reactivex.disposables.Disposable] */
    @Override // d00.InterfaceC36569e0
    /* JADX INFO: renamed from: l */
    public void mo31592l(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull final Function2<? super List<KCJSApiTradeMarginCurrency>, ? super ProtocolException, Unit> callback) {
        final CompositeDisposable destroyDisposable;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(callback, "callback");
        BaseActivity baseActivity = ctx instanceof BaseActivity ? (BaseActivity) ctx : null;
        if (baseActivity == null) {
            Activity activityM6125h = C5258a.m6125h();
            baseActivity = activityM6125h instanceof BaseActivity ? (BaseActivity) activityM6125h : null;
        }
        if (baseActivity == null || (destroyDisposable = baseActivity.getDestroyDisposable()) == null) {
            destroyDisposable = this.f27371a;
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Observable observableDoFinally = ILoanService.m37702d(ILoanService.f32363a.get(), false, 1, null).observeOn(AndroidSchedulers.mainThread()).doFinally(new Action() { // from class: com.kubi.jsbridge.impl.biz.trade.b
            @Override // io.reactivex.functions.Action
            public final void run() {
                KCJsBridgeTrade.m31575v(objectRef, destroyDisposable);
            }
        });
        final Function1 function1 = new Function1() { // from class: com.kubi.jsbridge.impl.biz.trade.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return KCJsBridgeTrade.m31576w(callback, (List) obj2);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.jsbridge.impl.biz.trade.d
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj2) {
                KCJsBridgeTrade.m31577x(function1, obj2);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.jsbridge.impl.biz.trade.e
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return KCJsBridgeTrade.m31578y(callback, (Throwable) obj2);
            }
        };
        ?? Subscribe = observableDoFinally.subscribe(consumer, new Consumer() { // from class: com.kubi.jsbridge.impl.biz.trade.f
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj2) {
                KCJsBridgeTrade.m31579z(function2, obj2);
            }
        });
        objectRef.element = Subscribe;
        Disposable disposable = (Disposable) Subscribe;
        if (disposable != null) {
            destroyDisposable.add(disposable);
        }
    }

    @Override // d00.InterfaceC36569e0
    /* JADX INFO: renamed from: m */
    public void mo31593m(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull Function2<? super KCJSApiTradeMarginConfig, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.invoke(TradeMarginBridgeMapper.f27387a.m31609c(IMarginService.f32724a.get().mo37906E()), null);
    }

    @Override // d00.InterfaceC36569e0
    /* JADX INFO: renamed from: n */
    public void mo31594n(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, long j11, boolean z11, @NotNull Function2<? super KCJSApiTradeAlphaCurrencyInfo, ? super ProtocolException, Unit> callback) {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(C37890n.f85269a.m85611s(Long.valueOf(j11), Boolean.valueOf(z11)));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103851isSuccessimpl(objM103844constructorimpl)) {
            AlphaCurrencyInfoEntity alphaCurrencyInfoEntity = (AlphaCurrencyInfoEntity) objM103844constructorimpl;
            if (alphaCurrencyInfoEntity == null) {
                callback.invoke(null, new ProtocolException("getAlphaCurrencyInfo failed: currency " + j11 + " not found", null, null, false, 14, null));
            } else {
                callback.invoke(m31580B(alphaCurrencyInfoEntity), null);
            }
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            callback.invoke(null, new ProtocolException("getAlphaCurrencyInfo failed", thM103847exceptionOrNullimpl, null, false, 12, null));
        }
    }

    @Override // d00.InterfaceC36569e0
    /* JADX INFO: renamed from: o */
    public void mo31595o(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String currency, @NotNull Function2<? super KCJSApiTradeMarginCurrency, ? super ProtocolException, Unit> callback) {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ILoanService.f32363a.get().mo37707f(currency, false));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103851isSuccessimpl(objM103844constructorimpl)) {
            LeverCoinConfig leverCoinConfig = (LeverCoinConfig) objM103844constructorimpl;
            callback.invoke(leverCoinConfig != null ? TradeMarginBridgeMapper.f27387a.m31610d(leverCoinConfig, C37890n.f85269a.m85613u(leverCoinConfig.getCurrency()), currency) : null, null);
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            callback.invoke(null, new ProtocolException("getMarginCurrency failed", thM103847exceptionOrNullimpl, null, false, 12, null));
        }
    }

    /* JADX INFO: renamed from: w */
    public static final Unit m31576w(Function2 function2, List list) {
        Intrinsics.checkNotNull(list);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            LeverCoinConfig leverCoinConfig = (LeverCoinConfig) it.next();
            arrayList.add(TradeMarginBridgeMapper.f27387a.m31610d(leverCoinConfig, C37890n.f85269a.m85613u(leverCoinConfig.getCurrency()), ""));
        }
        function2.invoke(arrayList, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x */
    public static final void m31577x(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: z */
    public static final void m31579z(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    @Override // d00.InterfaceC36569e0
    /* JADX INFO: renamed from: d */
    public void mo31584d(@NotNull Context context, @Nullable Object obj, @NotNull String str, @NotNull String str2, @NotNull Function2<? super KCJSApiTradeSymbolOfflineInfo, ? super ProtocolException, Unit> function2) {
        InterfaceC36569e0.a.m81860b(this, context, obj, str, str2, function2);
    }

    @Override // d00.InterfaceC36569e0
    /* JADX INFO: renamed from: h */
    public void mo31588h(@NotNull Context context, @Nullable Object obj, @NotNull String str, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> function2) {
        InterfaceC36569e0.a.m81861c(this, context, obj, str, function2);
    }

    @Override // d00.InterfaceC36569e0
    /* JADX INFO: renamed from: i */
    public void mo31589i(@NotNull Context context, @Nullable Object obj, @NotNull String str, @NotNull Function2<? super List<KCJSApiTradeSymbolOfflineInfo>, ? super ProtocolException, Unit> function2) {
        InterfaceC36569e0.a.m81859a(this, context, obj, str, function2);
    }
}
