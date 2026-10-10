package p404kk;

import android.app.Activity;
import android.content.Context;
import com.blankj.utilcode.util.C5258a;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.kumex.api.IKuMexService;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiSymbolsCoinFuturesCoinInfo;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiSymbolsCoinFuturesDisplayInfo;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiSymbolsCoinFuturesSymbolInfo;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiSymbolsCoinSpotCoinInfo;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiSymbolsCoinSpotSymbolInfo;
import com.kubi.utils.C27099x;
import com.kubi.utils.extensions.C27041f;
import com.tencent.qcloud.tuicore.TUIConstants;
import d00.InterfaceC36565c0;
import gf.C37890n;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: kk.g */
/* JADX INFO: compiled from: KCJsBridgeCoin.kt */
/* JADX INFO: loaded from: classes17.dex */
@Metadata(m90083d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JH\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u001c\u0010\u000f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00070\u0010H\u0016JF\u0010\u0013\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\"\u0010\u000f\u001a\u001e\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00070\u0010H\u0016JH\u0010\u0015\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\r2\u001c\u0010\u000f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00070\u0010H\u0016JH\u0010\u0018\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u001c\u0010\u000f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00070\u0010H\u0016JF\u0010\u001a\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\"\u0010\u000f\u001a\u001e\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00070\u0010H\u0016JH\u0010\u001b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u001c\u0010\u000f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00070\u0010H\u0016JF\u0010\u001d\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\"\u0010\u000f\u001a\u001e\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00070\u0010H\u0016JH\u0010\u001e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u001c\u0010\u000f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00070\u0010H\u0016JF\u0010 \u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\"\u0010\u000f\u001a\u001e\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00070\u0010H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, m90084d2 = {"Lcom/kubi/jsbridge/impl/coin/KCJsBridgeCoin;", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiSymbolsCoinModule;", "<init>", "()V", "bridgeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "getFuturesCoinInfo", "", "ctx", "Landroid/content/Context;", "obj", "Ljava/lang/Object;", "source", "", "code", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiSymbolsCoinFuturesCoinInfo;", "Lcom/kubi/sdk/protocol/ProtocolException;", "getFuturesCoinInfoBatch", "", "getFuturesDisplayInfo", "symbol", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiSymbolsCoinFuturesDisplayInfo;", "getFuturesSymbolInfo", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiSymbolsCoinFuturesSymbolInfo;", "getFuturesSymbolInfoBatch", "getSpotCoinInfo", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiSymbolsCoinSpotCoinInfo;", "getSpotCoinInfoBatch", "getSpotSymbol", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiSymbolsCoinSpotSymbolInfo;", "getSpotSymbolBatch", "JsBridgeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKCJsBridgeCoin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCJsBridgeCoin.kt\ncom/kubi/jsbridge/impl/coin/KCJsBridgeCoin\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 JsonEx.kt\ncom/kubi/utils/extensions/JsonExKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,447:1\n1#2:448\n35#3,3:449\n774#4:452\n865#4,2:453\n1563#4:455\n1634#4,3:456\n1563#4:459\n1634#4,3:460\n1563#4:463\n1634#4,3:464\n*S KotlinDebug\n*F\n+ 1 KCJsBridgeCoin.kt\ncom/kubi/jsbridge/impl/coin/KCJsBridgeCoin\n*L\n81#1:449,3\n103#1:452\n103#1:453,2\n104#1:455\n104#1:456,3\n210#1:459\n210#1:460,3\n293#1:463\n293#1:464,3\n*E\n"})
public final class C41068g implements InterfaceC36565c0 {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final CompositeDisposable f91283a = new CompositeDisposable();

    /* JADX INFO: renamed from: r */
    public static final Unit m90034r(Function2 function2, List list) {
        function2.invoke(list, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q */
    public static final void m90033q(Ref.ObjectRef objectRef, CompositeDisposable compositeDisposable) {
        Disposable disposable = (Disposable) objectRef.element;
        if (disposable != null) {
            compositeDisposable.remove(disposable);
        }
    }

    /* JADX INFO: renamed from: t */
    public static final Unit m90036t(Function2 function2, Throwable th2) {
        function2.invoke(null, new ProtocolException("getSpotSymbolBatch failed", th2, null, false, 12, null));
        return Unit.INSTANCE;
    }

    @Override // d00.InterfaceC36565c0
    /* JADX INFO: renamed from: a */
    public void mo81838a(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull Function2<? super List<KCJSApiSymbolsCoinSpotCoinInfo>, ? super ProtocolException, Unit> callback) {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            Result.Companion companion = Result.INSTANCE;
            List<CoinInfoEntity> listM85617y = C37890n.f85269a.m85617y();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM85617y, 10));
            Iterator<T> it = listM85617y.iterator();
            while (it.hasNext()) {
                arrayList.add(C41070i.m90048k((CoinInfoEntity) it.next()));
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
            callback.invoke(null, new ProtocolException("getSpotCoinInfoBatch failed", thM103847exceptionOrNullimpl, null, false, 12, null));
        }
    }

    /* JADX WARN: Type inference failed for: r5v9, types: [T, io.reactivex.disposables.Disposable] */
    @Override // d00.InterfaceC36565c0
    /* JADX INFO: renamed from: b */
    public void mo81839b(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull final Function2<? super List<KCJSApiSymbolsCoinSpotSymbolInfo>, ? super ProtocolException, Unit> callback) {
        final CompositeDisposable destroyDisposable;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(callback, "callback");
        BaseActivity baseActivity = null;
        BaseActivity baseActivity2 = ctx instanceof BaseActivity ? (BaseActivity) ctx : null;
        if (baseActivity2 == null) {
            Activity activityM6125h = C5258a.m6125h();
            if (activityM6125h instanceof BaseActivity) {
                baseActivity = (BaseActivity) activityM6125h;
            }
        } else {
            baseActivity = baseActivity2;
        }
        if (baseActivity == null || (destroyDisposable = baseActivity.getDestroyDisposable()) == null) {
            destroyDisposable = this.f91283a;
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Observable observableDoFinally = Observable.fromCallable(new Callable() { // from class: kk.a
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C41068g.m90032p();
            }
        }).subscribeOn(Schedulers.m87969io()).observeOn(AndroidSchedulers.mainThread()).doFinally(new Action() { // from class: kk.b
            @Override // io.reactivex.functions.Action
            public final void run() {
                C41068g.m90033q(objectRef, destroyDisposable);
            }
        });
        final Function1 function1 = new Function1() { // from class: kk.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return C41068g.m90034r(callback, (List) obj2);
            }
        };
        Consumer consumer = new Consumer() { // from class: kk.d
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj2) {
                C41068g.m90035s(function1, obj2);
            }
        };
        final Function1 function2 = new Function1() { // from class: kk.e
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return C41068g.m90036t(callback, (Throwable) obj2);
            }
        };
        ?? Subscribe = observableDoFinally.subscribe(consumer, new Consumer() { // from class: kk.f
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj2) {
                C41068g.m90037u(function2, obj2);
            }
        });
        objectRef.element = Subscribe;
        Disposable disposable = (Disposable) Subscribe;
        if (disposable != null) {
            destroyDisposable.add(disposable);
        }
    }

    @Override // d00.InterfaceC36565c0
    /* JADX INFO: renamed from: c */
    public void mo81840c(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String code, @NotNull Function2<? super KCJSApiSymbolsCoinFuturesCoinInfo, ? super ProtocolException, Unit> callback) {
        Object objM103844constructorimpl;
        Object objM103844constructorimpl2;
        String strM66919i;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(IKuMexService.f28731a.get().mo33269S(code));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Object obj2 = objM103844constructorimpl;
        if (Result.m103851isSuccessimpl(obj2)) {
            Map map = (Map) obj2;
            if (map.isEmpty()) {
                callback.invoke(null, null);
            } else {
                String strM90046i = C41070i.m90046i(map, "code");
                String strM90046i2 = C41070i.m90046i(map, FirebaseAnalytics.Param.CURRENCY);
                String strM90046i3 = C41070i.m90046i(map, "name");
                String strM90046i4 = C41070i.m90046i(map, "imgUrl");
                String strM90046i5 = C41070i.m90046i(map, "withdrawDisabledTip");
                String strM90046i6 = C41070i.m90046i(map, "depositDisabledTip");
                String strM90046i7 = C41070i.m90046i(map, "type");
                String strM90046i8 = C41070i.m90046i(map, "precision");
                String strM90046i9 = C41070i.m90046i(map, "status");
                String strM90046i10 = C41070i.m90046i(map, "withdrawEnableAt");
                String strM90046i11 = C41070i.m90046i(map, "depositEnableAt");
                String strM90046i12 = C41070i.m90046i(map, "withdrawMinFee");
                String strM90046i13 = C41070i.m90046i(map, "withdrawMinSize");
                String strM90046i14 = C41070i.m90046i(map, "innerWithdrawMinFee");
                String strM90046i15 = C41070i.m90046i(map, "availableBalance");
                String strM90046i16 = C41070i.m90046i(map, "totalBalance");
                String strM90046i17 = C41070i.m90046i(map, "isDepositEnabled");
                String strM90046i18 = C41070i.m90046i(map, "isWithdrawEnabled");
                String strM90046i19 = C41070i.m90046i(map, "isDisplayWithdraw");
                String strM90046i20 = C41070i.m90046i(map, "isDisplayDeposit");
                String strM90046i21 = C41070i.m90046i(map, "isMarginEnabled");
                String strM90046i22 = C41070i.m90046i(map, "isDebitEnabled");
                String strM90046i23 = C41070i.m90046i(map, "isPoolXEnabled");
                try {
                    Object obj3 = map.get("properties");
                    if (obj3 != null) {
                        strM66919i = C27099x.m66919i(obj3, false, 2, null);
                        if (strM66919i == null) {
                            strM66919i = "";
                        }
                    } else {
                        strM66919i = null;
                    }
                    objM103844constructorimpl2 = Result.m103844constructorimpl(strM66919i);
                } catch (Throwable th3) {
                    Result.Companion companion3 = Result.INSTANCE;
                    objM103844constructorimpl2 = Result.m103844constructorimpl(ResultKt.createFailure(th3));
                }
                if (Result.m103850isFailureimpl(objM103844constructorimpl2)) {
                    objM103844constructorimpl2 = null;
                }
                String str = (String) objM103844constructorimpl2;
                if (str == null) {
                    str = "{}";
                }
                callback.invoke(new KCJSApiSymbolsCoinFuturesCoinInfo(strM90046i, strM90046i2, strM90046i3, strM90046i4, strM90046i5, strM90046i6, strM90046i7, strM90046i8, strM90046i9, strM90046i10, strM90046i11, strM90046i12, strM90046i13, strM90046i14, strM90046i15, strM90046i16, strM90046i17, strM90046i18, strM90046i19, strM90046i20, strM90046i21, strM90046i22, strM90046i23, C27041f.m66673m(C41070i.m90046i(map, "isEarnEnabled"), false, 1, null), C27041f.m66673m(C41070i.m90046i(map, "isDigitalCoin"), false, 1, null), C27041f.m66673m(C41070i.m90046i(map, "isStableCoin"), false, 1, null), C27041f.m66673m(C41070i.m90046i(map, "isDelistingCoin"), false, 1, null), C27041f.m66673m(C41070i.m90046i(map, "isTransferEnabled"), false, 1, null), str), null);
            }
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(obj2);
        if (thM103847exceptionOrNullimpl != null) {
            callback.invoke(null, new ProtocolException("getFuturesCoinInfo failed", thM103847exceptionOrNullimpl, null, false, 12, null));
        }
    }

    @Override // d00.InterfaceC36565c0
    /* JADX INFO: renamed from: d */
    public void mo81841d(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String code, @NotNull Function2<? super KCJSApiSymbolsCoinFuturesSymbolInfo, ? super ProtocolException, Unit> callback) {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(IKuMexService.f28731a.get().mo33286o(code));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103851isSuccessimpl(objM103844constructorimpl)) {
            Map map = (Map) objM103844constructorimpl;
            if (map.isEmpty()) {
                callback.invoke(null, null);
            } else {
                IKuMexService iKuMexService = IKuMexService.f28731a.get();
                callback.invoke(new KCJSApiSymbolsCoinFuturesSymbolInfo(C41070i.m90046i(map, "type"), C41070i.m90046i(map, "isInverse"), C41070i.m90046i(map, "symbol"), C41070i.m90046i(map, "rootSymbol"), C41070i.m90046i(map, "baseCurrency"), C41070i.m90046i(map, "displayBaseCurrency"), C41070i.m90046i(map, "quoteCurrency"), C41070i.m90046i(map, "status"), C41070i.m90046i(map, "createdAt"), C41070i.m90046i(map, "expireDate"), C41070i.m90046i(map, "updatedAt"), C41070i.m90046i(map, "fairMethod"), C41070i.m90046i(map, "firstOpenDate"), C41070i.m90046i(map, "fundingBaseSymbol"), C41070i.m90046i(map, "fundingQuoteSymbol"), C41070i.m90046i(map, "fundingRateSymbol"), C41070i.m90046i(map, "indexSymbol"), C41070i.m90046i(map, "initialMargin"), C41070i.m90046i(map, "isDeleverage"), C41070i.m90046i(map, "isQuanto"), C41070i.m90046i(map, "lotSize"), C41070i.m90046i(map, "maintainMargin"), C41070i.m90046i(map, "makerFeeRate"), C41070i.m90046i(map, "makerFixFee"), C41070i.m90046i(map, "markMethod"), C41070i.m90046i(map, "maxOrderQty"), C41070i.m90046i(map, "indexPriceTickSize"), C41070i.m90046i(map, "maxPrice"), C41070i.m90046i(map, "maxRiskLimit"), C41070i.m90046i(map, "minRiskLimit"), C41070i.m90046i(map, "riskStep"), C41070i.m90046i(map, "settleCurrency"), C41070i.m90046i(map, "settleDate"), C41070i.m90046i(map, "settlementFee"), C41070i.m90046i(map, "takerFeeRate"), C41070i.m90046i(map, "takerFixFee"), C41070i.m90046i(map, "tickSize"), C41070i.m90046i(map, "multiplier"), iKuMexService.mo33264M(code), iKuMexService.mo33289s(code), C41070i.m90046i(map, "maxLeverage"), C41070i.m90046i(map, "imgUrl"), C41070i.m90046i(map, "marketStage"), C41070i.m90046i(map, "preMarketToPerpDate")), null);
            }
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            callback.invoke(null, new ProtocolException("getFuturesSymbolInfo failed", thM103847exceptionOrNullimpl, null, false, 12, null));
        }
    }

    @Override // d00.InterfaceC36565c0
    /* JADX INFO: renamed from: e */
    public void mo81842e(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull Function2<? super List<KCJSApiSymbolsCoinFuturesSymbolInfo>, ? super ProtocolException, Unit> callback) {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            Result.Companion companion = Result.INSTANCE;
            IKuMexService.Companion companion2 = IKuMexService.f28731a;
            IKuMexService iKuMexService = companion2.get();
            List<ContractEntity> listMo33283k = companion2.get().mo33283k();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listMo33283k, 10));
            for (ContractEntity contractEntity : listMo33283k) {
                String symbol = contractEntity.getSymbol();
                String str = symbol == null ? "" : symbol;
                String type = contractEntity.getType();
                String str2 = type == null ? "" : type;
                String strValueOf = String.valueOf(contractEntity.isInverse());
                String rootSymbol = contractEntity.getRootSymbol();
                String str3 = rootSymbol == null ? "" : rootSymbol;
                String baseCurrency = contractEntity.getBaseCurrency();
                String str4 = baseCurrency == null ? "" : baseCurrency;
                String baseCurrency2 = contractEntity.getBaseCurrency();
                String str5 = baseCurrency2 == null ? "" : baseCurrency2;
                String quoteCurrency = contractEntity.getQuoteCurrency();
                String str6 = quoteCurrency == null ? "" : quoteCurrency;
                String status = contractEntity.getStatus();
                String str7 = status == null ? "" : status;
                String strValueOf2 = String.valueOf(contractEntity.getCreatedAt());
                String strValueOf3 = String.valueOf(contractEntity.getExpireDate());
                String strValueOf4 = String.valueOf(contractEntity.getUpdatedAt());
                String fairMethod = contractEntity.getFairMethod();
                String str8 = fairMethod == null ? "" : fairMethod;
                String strValueOf5 = String.valueOf(contractEntity.getFirstOpenDate());
                String fundingBaseSymbol = contractEntity.getFundingBaseSymbol();
                String str9 = fundingBaseSymbol == null ? "" : fundingBaseSymbol;
                String fundingQuoteSymbol = contractEntity.getFundingQuoteSymbol();
                String str10 = fundingQuoteSymbol == null ? "" : fundingQuoteSymbol;
                String fundingRateSymbol = contractEntity.getFundingRateSymbol();
                String str11 = fundingRateSymbol == null ? "" : fundingRateSymbol;
                String indexSymbol = contractEntity.getIndexSymbol();
                String str12 = indexSymbol == null ? "" : indexSymbol;
                String strValueOf6 = String.valueOf(contractEntity.getInitialMargin());
                String strValueOf7 = String.valueOf(contractEntity.isDeleverage());
                String strValueOf8 = String.valueOf(contractEntity.isQuanto());
                String strValueOf9 = String.valueOf(contractEntity.getLotSize());
                String strValueOf10 = String.valueOf(contractEntity.getMaintainMargin());
                String strValueOf11 = String.valueOf(contractEntity.getMakerFeeRate());
                String strValueOf12 = String.valueOf(contractEntity.getMakerFixFee());
                String markMethod = contractEntity.getMarkMethod();
                String str13 = markMethod == null ? "" : markMethod;
                String strValueOf13 = String.valueOf(contractEntity.getMaxOrderQty());
                String strValueOf14 = String.valueOf(contractEntity.getIndexPriceTickSize());
                String strValueOf15 = String.valueOf(contractEntity.getMaxPrice());
                String strValueOf16 = String.valueOf(contractEntity.getMaxRiskLimit());
                String strValueOf17 = String.valueOf(contractEntity.getMinRiskLimit());
                String strValueOf18 = String.valueOf(contractEntity.getRiskStep());
                String settleCurrency = contractEntity.getSettleCurrency();
                String str14 = settleCurrency == null ? "" : settleCurrency;
                Long settleDate = contractEntity.getSettleDate();
                String string = settleDate != null ? settleDate.toString() : null;
                String str15 = string == null ? "" : string;
                String strValueOf19 = String.valueOf(contractEntity.getSettlementFee());
                String strValueOf20 = String.valueOf(contractEntity.getTakerFeeRate());
                String strValueOf21 = String.valueOf(contractEntity.getTakerFixFee());
                String strValueOf22 = String.valueOf(contractEntity.getTickSize());
                String strValueOf23 = String.valueOf(contractEntity.getMultiplier());
                String strMo33264M = iKuMexService.mo33264M(str);
                String strMo33289s = iKuMexService.mo33289s(str);
                String strValueOf24 = String.valueOf(contractEntity.getMaxLeverage());
                String imgUrl = contractEntity.getImgUrl();
                String str16 = imgUrl == null ? "" : imgUrl;
                String marketStage = contractEntity.getMarketStage();
                String str17 = marketStage == null ? "" : marketStage;
                Long preMarketToPerpDate = contractEntity.getPreMarketToPerpDate();
                String string2 = preMarketToPerpDate != null ? preMarketToPerpDate.toString() : null;
                arrayList.add(new KCJSApiSymbolsCoinFuturesSymbolInfo(str2, strValueOf, str, str3, str4, str5, str6, str7, strValueOf2, strValueOf3, strValueOf4, str8, strValueOf5, str9, str10, str11, str12, strValueOf6, strValueOf7, strValueOf8, strValueOf9, strValueOf10, strValueOf11, strValueOf12, str13, strValueOf13, strValueOf14, strValueOf15, strValueOf16, strValueOf17, strValueOf18, str14, str15, strValueOf19, strValueOf20, strValueOf21, strValueOf22, strValueOf23, strMo33264M, strMo33289s, strValueOf24, str16, str17, string2 == null ? "" : string2));
            }
            callback.invoke(arrayList, null);
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            callback.invoke(null, new ProtocolException("getFuturesSymbolInfoBatch failed", thM103847exceptionOrNullimpl, null, false, 12, null));
        }
    }

    @Override // d00.InterfaceC36565c0
    /* JADX INFO: renamed from: f */
    public void mo81843f(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String code, @NotNull Function2<? super KCJSApiSymbolsCoinSpotSymbolInfo, ? super ProtocolException, Unit> callback) {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(C37890n.f85269a.m85601B(code));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103851isSuccessimpl(objM103844constructorimpl)) {
            SymbolInfoEntity symbolInfoEntity = (SymbolInfoEntity) objM103844constructorimpl;
            if (symbolInfoEntity == null) {
                callback.invoke(null, null);
            } else {
                callback.invoke(C41070i.m90049l(symbolInfoEntity), null);
            }
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            callback.invoke(null, new ProtocolException("getSpotSymbol failed", thM103847exceptionOrNullimpl, null, false, 12, null));
        }
    }

    @Override // d00.InterfaceC36565c0
    /* JADX INFO: renamed from: g */
    public void mo81844g(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String code, @NotNull Function2<? super KCJSApiSymbolsCoinSpotCoinInfo, ? super ProtocolException, Unit> callback) {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(C37890n.f85269a.m85613u(code));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103851isSuccessimpl(objM103844constructorimpl)) {
            CoinInfoEntity coinInfoEntity = (CoinInfoEntity) objM103844constructorimpl;
            if (coinInfoEntity == null) {
                callback.invoke(null, null);
            } else {
                callback.invoke(C41070i.m90048k(coinInfoEntity), null);
            }
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            callback.invoke(null, new ProtocolException("getSpotCoinInfo failed", thM103847exceptionOrNullimpl, null, false, 12, null));
        }
    }

    @Override // d00.InterfaceC36565c0
    /* JADX INFO: renamed from: h */
    public void mo81845h(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String symbol, @NotNull Function2<? super KCJSApiSymbolsCoinFuturesDisplayInfo, ? super ProtocolException, Unit> callback) {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            Result.Companion companion = Result.INSTANCE;
            IKuMexService iKuMexService = IKuMexService.f28731a.get();
            String strMo33264M = iKuMexService.mo33264M(symbol);
            String strMo33289s = iKuMexService.mo33289s(symbol);
            if (strMo33289s.length() == 0) {
                strMo33289s = null;
            }
            objM103844constructorimpl = Result.m103844constructorimpl(new KCJSApiSymbolsCoinFuturesDisplayInfo(strMo33264M, strMo33289s));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103851isSuccessimpl(objM103844constructorimpl)) {
            callback.invoke((KCJSApiSymbolsCoinFuturesDisplayInfo) objM103844constructorimpl, null);
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            callback.invoke(null, new ProtocolException("getFuturesDisplayInfo failed", thM103847exceptionOrNullimpl, null, false, 12, null));
        }
    }

    @Override // d00.InterfaceC36565c0
    /* JADX INFO: renamed from: i */
    public void mo81846i(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull Function2<? super List<KCJSApiSymbolsCoinFuturesCoinInfo>, ? super ProtocolException, Unit> callback) {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            Result.Companion companion = Result.INSTANCE;
            List<Map<String, Object>> listMo33252A = IKuMexService.f28731a.get().mo33252A();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : listMo33252A) {
                if (!((Map) obj2).isEmpty()) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(C41070i.m90047j((Map) it.next()));
            }
            objM103844constructorimpl = Result.m103844constructorimpl(arrayList2);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103851isSuccessimpl(objM103844constructorimpl)) {
            callback.invoke((List) objM103844constructorimpl, null);
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            callback.invoke(null, new ProtocolException("getFuturesCoinInfoBatch failed", thM103847exceptionOrNullimpl, null, false, 12, null));
        }
    }

    /* JADX INFO: renamed from: p */
    public static final List m90032p() {
        return C41070i.m90044g();
    }

    /* JADX INFO: renamed from: s */
    public static final void m90035s(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: u */
    public static final void m90037u(Function1 function1, Object obj) {
        function1.invoke(obj);
    }
}
