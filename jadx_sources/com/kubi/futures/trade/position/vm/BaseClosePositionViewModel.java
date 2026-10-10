package com.kubi.futures.trade.position.vm;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.MutableLiveData;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.broker.BrokerConfig;
import com.kubi.broker.MultiBizFacadeManager;
import com.kubi.broker.MultiBizType;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.data.constance.ValidationBizEnum;
import com.kubi.futures.settings.C13392j;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.market.model.TickerEntity;
import com.kubi.kumex.data.trade.model.ClosePositionSizeEntity;
import com.kubi.kumex.data.trade.model.OrdersPageEntityWrapper;
import com.kubi.kumex.data.trade.model.PositionEntity;
import com.kubi.kumex.dialog.C15943u;
import com.kubi.kumex.dialog.ResultData;
import com.kubi.kumex.helper.C16108t;
import com.kubi.kumex.helper.TradePwdHelperKt;
import com.kubi.kumex.utils.C17058m0;
import com.kubi.kumex.utils.C17060n0;
import com.kubi.kumex.utils.GoogleRatingUtil;
import com.kubi.mine.lib.jsapi.KCTurboSystemSettingsModuleImpl;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.resources.dialog.BaseDialogFragment;
import com.kubi.sdk.BaseViewModel;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27099x;
import com.kubi.utils.FlowableCompat;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27041f;
import com.trtc.uikit.livekit.p180kc.data.entity.SharedPositionInfo;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.DisposableKt;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import o00.C42916f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p236em.C37214b;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;
import sm.OrderRequest;

/* JADX INFO: renamed from: com.kubi.futures.trade.position.vm.b0, reason: from Kotlin metadata */
/* JADX INFO: compiled from: BaseClosePositionViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001cJ$\u0010\u001d\u001a\u00020\u001e2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0018H&J8\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J0\u0010#\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J$\u0010$\u001a\u00020\u00112\u0006\u0010%\u001a\u00020\u001c2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'2\u0006\u0010 \u001a\u00020\u001eH\u0002J\u0016\u0010(\u001a\u00020\u00112\u0006\u0010)\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u0018J\u0012\u0010*\u001a\u00020'2\b\u0010+\u001a\u0004\u0018\u00010'H\u0002R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\bR\u0014\u0010\f\u001a\u00020\rX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006,"}, m90084d2 = {"Lcom/kubi/futures/trade/position/vm/BaseClosePositionViewModel;", "Lcom/kubi/sdk/BaseViewModel;", "<init>", "()V", "submitResult", "Landroidx/lifecycle/MutableLiveData;", "Lcom/kubi/kumex/dialog/ResultData;", "getSubmitResult", "()Landroidx/lifecycle/MutableLiveData;", "availableQty", "Lcom/kubi/futures/trade/submit/panel/footer/FooterPanelData;", "getAvailableQty", "visibleDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "getVisibleDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "submitCloseOrder", "", "fragment", "Landroidx/fragment/app/Fragment;", FirebaseAnalytics.Param.PRICE, "Ljava/math/BigDecimal;", "qty", ViewProps.POSITION, "Lcom/kubi/kumex/data/trade/model/PositionEntity;", "multiBizType", "Lcom/kubi/broker/MultiBizType;", "isShowLoadingDialog", "", "createOrderRequest", "Lcom/kubi/kumex/request/OrderRequest;", "handleTickerResult", "request", "ticker", "Lcom/kubi/kumex/data/market/model/TickerEntity;", "doSubmitCloseOrderRequest", "trackClosePositionResult", "success", "failReason", "", "fetchClosePosition", "isFromCopyTrading", "toTrackPositionMode", "positionSide", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBaseClosePositionViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseClosePositionViewModel.kt\ncom/kubi/futures/trade/position/vm/BaseClosePositionViewModel\n+ 2 JsonEx.kt\ncom/kubi/utils/extensions/JsonExKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,289:1\n35#2,3:290\n295#3,2:293\n295#3,2:295\n*S KotlinDebug\n*F\n+ 1 BaseClosePositionViewModel.kt\ncom/kubi/futures/trade/position/vm/BaseClosePositionViewModel\n*L\n185#1:290,3\n267#1:293,2\n268#1:295,2\n*E\n"})
public abstract class BaseClosePositionViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: X */
    @NotNull
    public final MutableLiveData<ResultData> f24330X = new MutableLiveData<>();

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final MutableLiveData<com.kubi.futures.trade.submit.panel.footer.p0> f24331Y = new MutableLiveData<>();

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final CompositeDisposable f24332Z = new CompositeDisposable();

    @NotNull
    /* JADX INFO: renamed from: H */
    public abstract OrderRequest mo27992H(@Nullable BigDecimal bigDecimal, @NotNull BigDecimal bigDecimal2, @NotNull PositionEntity positionEntity);

    /* JADX INFO: renamed from: J */
    public static final Observable m27961J(final OrderRequest orderRequest, final MultiBizType multiBizType, final PositionEntity positionEntity, final String str) {
        Observable<Object> observable = FlowableCompat.f54248a.m66386c(new Function0() { // from class: com.kubi.futures.trade.position.vm.r
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseClosePositionViewModel.m27962K(orderRequest, multiBizType, positionEntity, str);
            }
        }).subscribeOn(C42916f.m94127f()).observeOn(C42916f.m94128g()).toObservable();
        Intrinsics.checkNotNullExpressionValue(observable, "toObservable(...)");
        return observable;
    }

    /* JADX INFO: renamed from: L */
    public static final Unit m27963L(BaseClosePositionViewModel baseClosePositionViewModel) {
        baseClosePositionViewModel.f24330X.postValue(new ResultData(false, "6", null, 4, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: M */
    public static final void m27964M(BaseClosePositionViewModel baseClosePositionViewModel, OrderRequest orderRequest, Fragment fragment, PositionEntity positionEntity, Object obj) throws JSONException {
        ToastCompat.m66441G(C27017c.f54310a.m66516f(R$string.close_order_success, new Object[0]), new Object[0]);
        baseClosePositionViewModel.m27999i0(true, null, orderRequest);
        GoogleRatingUtil.f30812a.m36610b(fragment.getActivity(), positionEntity);
        baseClosePositionViewModel.f24330X.postValue(new ResultData(true, null, null, 6, null));
    }

    /* JADX INFO: renamed from: N */
    public static final void m27965N(BaseClosePositionViewModel baseClosePositionViewModel, OrderRequest orderRequest, Fragment fragment, Throwable th2) throws JSONException {
        if (th2 instanceof ApiException) {
            StringBuilder sb2 = new StringBuilder();
            ApiException apiException = (ApiException) th2;
            sb2.append(apiException.code);
            sb2.append(": ");
            sb2.append(apiException.getMessage());
            baseClosePositionViewModel.m27999i0(false, sb2.toString(), orderRequest);
            MutableLiveData<ResultData> mutableLiveData = baseClosePositionViewModel.f24330X;
            String code = apiException.code;
            Intrinsics.checkNotNullExpressionValue(code, "code");
            String string = apiException.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            mutableLiveData.postValue(new ResultData(false, code, string));
        } else {
            baseClosePositionViewModel.f24330X.postValue(new ResultData(false, "-200", th2.toString()));
        }
        C17058m0.m36550e(fragment, th2);
    }

    /* JADX INFO: renamed from: P */
    public static final com.kubi.futures.trade.submit.panel.footer.p0 m27966P(MultiBizType multiBizType, String str, boolean z11, OrdersPageEntityWrapper it) {
        Object next;
        Object next2;
        Intrinsics.checkNotNullParameter(it, "it");
        try {
            List<ClosePositionSizeEntity> listMo89036W0 = MultiBizFacadeManager.f19232a.m20271k(multiBizType).mo89036W0(str, z11);
            Iterator<T> it2 = listMo89036W0.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!Intrinsics.areEqual(((ClosePositionSizeEntity) next).getPositionSide(), SharedPositionInfo.SIDE_LONG));
            ClosePositionSizeEntity closePositionSizeEntity = (ClosePositionSizeEntity) next;
            BigDecimal size = closePositionSizeEntity != null ? closePositionSizeEntity.getSize() : null;
            Iterator<T> it3 = listMo89036W0.iterator();
            do {
                if (!it3.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it3.next();
            } while (!Intrinsics.areEqual(((ClosePositionSizeEntity) next2).getPositionSide(), SharedPositionInfo.SIDE_SHORT));
            ClosePositionSizeEntity closePositionSizeEntity2 = (ClosePositionSizeEntity) next2;
            return new com.kubi.futures.trade.submit.panel.footer.p0(size, closePositionSizeEntity2 != null ? closePositionSizeEntity2.getSize() : null, (BigDecimal) null, 4, (DefaultConstructorMarker) null);
        } catch (Exception unused) {
            return new com.kubi.futures.trade.submit.panel.footer.p0((BigDecimal) null, (BigDecimal) null, (BigDecimal) null, 4, (DefaultConstructorMarker) null);
        }
    }

    /* JADX INFO: renamed from: Q */
    public static final com.kubi.futures.trade.submit.panel.footer.p0 m27967Q(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (com.kubi.futures.trade.submit.panel.footer.p0) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: R */
    public static final Unit m27968R(BaseClosePositionViewModel baseClosePositionViewModel, com.kubi.futures.trade.submit.panel.footer.p0 p0Var) {
        baseClosePositionViewModel.f24331Y.setValue(p0Var);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Y */
    public static final Unit m27972Y(Ref.BooleanRef booleanRef, BaseClosePositionViewModel baseClosePositionViewModel) {
        if (!booleanRef.element) {
            baseClosePositionViewModel.f24330X.postValue(new ResultData(false, "6", "没有点击立即成交确认按钮，流程终止"));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Z */
    public static final Unit m27973Z(Ref.BooleanRef booleanRef, BaseClosePositionViewModel baseClosePositionViewModel, Fragment fragment, OrderRequest orderRequest, PositionEntity positionEntity, boolean z11, MultiBizType multiBizType, DialogFragment it) {
        Intrinsics.checkNotNullParameter(it, "it");
        booleanRef.element = true;
        baseClosePositionViewModel.m27993I(fragment, orderRequest, positionEntity, z11, multiBizType);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b0 */
    public static /* synthetic */ void m27974b0(BaseClosePositionViewModel baseClosePositionViewModel, Fragment fragment, BigDecimal bigDecimal, BigDecimal bigDecimal2, PositionEntity positionEntity, MultiBizType multiBizType, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: submitCloseOrder");
        }
        if ((i11 & 32) != 0) {
            z11 = false;
        }
        baseClosePositionViewModel.m27998a0(fragment, bigDecimal, bigDecimal2, positionEntity, multiBizType, z11);
    }

    /* JADX INFO: renamed from: c0 */
    public static final TickerEntity m27975c0(OrderRequest orderRequest) throws Throwable {
        TickerEntity tickerEntityMo24822t = RepositoryServiceLocator.f19236a.m20286e().mo24822t(C27041f.m66668h(orderRequest.getSymbol()));
        return tickerEntityMo24822t == null ? new TickerEntity(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16777215, null) : tickerEntityMo24822t;
    }

    /* JADX INFO: renamed from: h0 */
    private final String m27980h0(String str) {
        if (str == null) {
            return "none";
        }
        int iHashCode = str.hashCode();
        if (iHashCode == 2044801) {
            return !str.equals("BOTH") ? "none" : "1";
        }
        if (iHashCode != 2342524) {
            return (iHashCode == 78875740 && str.equals(SharedPositionInfo.SIDE_SHORT)) ? "2" : "none";
        }
        return !str.equals(SharedPositionInfo.SIDE_LONG) ? "none" : "2";
    }

    /* JADX INFO: renamed from: I */
    public final void m27993I(final Fragment fragment, final OrderRequest orderRequest, final PositionEntity positionEntity, boolean z11, final MultiBizType multiBizType) {
        String strM66919i;
        ValidationBizEnum validationBizEnum = ValidationBizEnum.CONTRACT_TRADE;
        Map<String, String> mapM98504a = orderRequest.m98504a();
        if (mapM98504a == null || (strM66919i = C27099x.m66919i(mapM98504a, false, 2, null)) == null) {
            strM66919i = "";
        }
        TradePwdHelperKt.m33943w(fragment, z11, validationBizEnum, new Function1() { // from class: com.kubi.futures.trade.position.vm.p
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseClosePositionViewModel.m27961J(orderRequest, multiBizType, positionEntity, (String) obj);
            }
        }, new Consumer() { // from class: com.kubi.futures.trade.position.vm.n
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws JSONException {
                BaseClosePositionViewModel.m27964M(this.f24384b, orderRequest, fragment, positionEntity, obj);
            }
        }, new Consumer() { // from class: com.kubi.futures.trade.position.vm.o
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws JSONException {
                BaseClosePositionViewModel.m27965N(this.f24390b, orderRequest, fragment, (Throwable) obj);
            }
        }, positionEntity.isTrialFunds(), strM66919i, new Function0() { // from class: com.kubi.futures.trade.position.vm.q
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseClosePositionViewModel.m27963L(this.f24399b);
            }
        });
    }

    /* JADX INFO: renamed from: O */
    public final void m27994O(boolean z11, @NotNull PositionEntity position) {
        Intrinsics.checkNotNullParameter(position, "position");
        if (Intrinsics.areEqual(C27041f.m66669i(position.getPositionSide(), "BOTH"), "BOTH")) {
            return;
        }
        final boolean zIsTrialFunds = position.isTrialFunds();
        final String strM66668h = C27041f.m66668h(position.getSymbol());
        final MultiBizType multiBizTypeMo4515x = z11 ? MultiBizType.COPY_TRADING : BrokerConfig.f19211a.m20201d().mo4515x();
        Observable<OrdersPageEntityWrapper> observableObserveOn = MultiBizFacadeManager.f19232a.m20275r(multiBizTypeMo4515x).mo96065x0(zIsTrialFunds, null).subscribeOn(C42916f.m94127f()).throttleLatest(1L, TimeUnit.SECONDS).observeOn(C42916f.m94127f());
        final Function1 function1 = new Function1() { // from class: com.kubi.futures.trade.position.vm.j
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseClosePositionViewModel.m27966P(multiBizTypeMo4515x, strM66668h, zIsTrialFunds, (OrdersPageEntityWrapper) obj);
            }
        };
        Observable observableObserveOn2 = observableObserveOn.map(new Function() { // from class: com.kubi.futures.trade.position.vm.s
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return BaseClosePositionViewModel.m27967Q(function1, obj);
            }
        }).observeOn(C42916f.m94128g());
        final Function1 function2 = new Function1() { // from class: com.kubi.futures.trade.position.vm.t
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseClosePositionViewModel.m27968R(this.f24410b, (com.kubi.futures.trade.submit.panel.footer.p0) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.futures.trade.position.vm.u
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BaseClosePositionViewModel.m27969S(function2, obj);
            }
        };
        final Function1 function3 = new Function1() { // from class: com.kubi.futures.trade.position.vm.v
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseClosePositionViewModel.m27970T((Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableObserveOn2.subscribe(consumer, new Consumer() { // from class: com.kubi.futures.trade.position.vm.w
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BaseClosePositionViewModel.m27971U(function3, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, getF46845W());
    }

    @NotNull
    /* JADX INFO: renamed from: V */
    public final MutableLiveData<com.kubi.futures.trade.submit.panel.footer.p0> m27995V() {
        return this.f24331Y;
    }

    @NotNull
    /* JADX INFO: renamed from: W */
    public final MutableLiveData<ResultData> m27996W() {
        return this.f24330X;
    }

    /* JADX INFO: renamed from: a0 */
    public final void m27998a0(@NotNull final Fragment fragment, @Nullable BigDecimal bigDecimal, @NotNull BigDecimal qty, @NotNull final PositionEntity position, @NotNull final MultiBizType multiBizType, final boolean z11) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(qty, "qty");
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(multiBizType, "multiBizType");
        final OrderRequest orderRequestMo27992H = mo27992H(bigDecimal, qty, position);
        if (orderRequestMo27992H.m98514k() || orderRequestMo27992H.m98515l() || !C13392j.m26327n()) {
            m27993I(fragment, orderRequestMo27992H, position, z11, multiBizType);
            return;
        }
        Flowable flowableObserveOn = FlowableCompat.f54248a.m66385b(new Function0() { // from class: com.kubi.futures.trade.position.vm.x
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseClosePositionViewModel.m27975c0(orderRequestMo27992H);
            }
        }).subscribeOn(C42916f.m94127f()).observeOn(C42916f.m94128g());
        final Function1 function1 = new Function1() { // from class: com.kubi.futures.trade.position.vm.y
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseClosePositionViewModel.m27976d0(this.f24423b, fragment, orderRequestMo27992H, position, z11, multiBizType, (TickerEntity) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.futures.trade.position.vm.z
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BaseClosePositionViewModel.m27977e0(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.futures.trade.position.vm.a0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseClosePositionViewModel.m27978f0(this.f24322b, fragment, orderRequestMo27992H, position, z11, multiBizType, (Throwable) obj);
            }
        };
        Disposable disposableSubscribe = flowableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.futures.trade.position.vm.k
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BaseClosePositionViewModel.m27979g0(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, getF46845W());
    }

    /* JADX INFO: renamed from: K */
    public static final Unit m27962K(OrderRequest orderRequest, MultiBizType multiBizType, PositionEntity positionEntity, String str) {
        Map<String, String> mutableMap = MapsKt.toMutableMap(orderRequest.m98504a());
        if (str == null) {
            str = "";
        }
        mutableMap.put("X-VALIDATION-TOKEN", str);
        MultiBizFacadeManager.f19232a.m20275r(multiBizType).mo4496H0(positionEntity.isTrialFunds(), mutableMap);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: S */
    public static final void m27969S(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: T */
    public static final Unit m27970T(Throwable th2) {
        Intrinsics.checkNotNull(th2);
        C37214b.m83255a(th2, "BaseClosePositionViewModel-subscribeClassicClosePositions");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: U */
    public static final void m27971U(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: d0 */
    public static final Unit m27976d0(BaseClosePositionViewModel baseClosePositionViewModel, Fragment fragment, OrderRequest orderRequest, PositionEntity positionEntity, boolean z11, MultiBizType multiBizType, TickerEntity tickerEntity) {
        Intrinsics.checkNotNull(tickerEntity);
        baseClosePositionViewModel.m27997X(fragment, orderRequest, positionEntity, tickerEntity, z11, multiBizType);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e0 */
    public static final void m27977e0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: f0 */
    public static final Unit m27978f0(BaseClosePositionViewModel baseClosePositionViewModel, Fragment fragment, OrderRequest orderRequest, PositionEntity positionEntity, boolean z11, MultiBizType multiBizType, Throwable th2) {
        baseClosePositionViewModel.m27993I(fragment, orderRequest, positionEntity, z11, multiBizType);
        Intrinsics.checkNotNull(th2);
        C37214b.m83255a(th2, "BaseClosePositionViewModel-checkOrderPriceDeepBook");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g0 */
    public static final void m27979g0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: X */
    public final void m27997X(final Fragment fragment, final OrderRequest orderRequest, final PositionEntity positionEntity, TickerEntity tickerEntity, final boolean z11, final MultiBizType multiBizType) {
        if (!C16108t.m34069n(orderRequest.m98512i(), orderRequest.getDelegationPrice(), tickerEntity.getBestBidPrice(), tickerEntity.getBestAskPrice())) {
            m27993I(fragment, orderRequest, positionEntity, z11, multiBizType);
            return;
        }
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        BaseDialogFragment baseDialogFragmentM33707z = C15943u.m33707z(new Function0() { // from class: com.kubi.futures.trade.position.vm.l
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseClosePositionViewModel.m27972Y(booleanRef, this);
            }
        }, new Function1() { // from class: com.kubi.futures.trade.position.vm.m
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseClosePositionViewModel.m27973Z(booleanRef, this, fragment, orderRequest, positionEntity, z11, multiBizType, (DialogFragment) obj);
            }
        });
        FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        baseDialogFragmentM33707z.show(childFragmentManager, "now_deal_dialog");
    }

    /* JADX INFO: renamed from: i0 */
    public final void m27999i0(boolean z11, String str, OrderRequest orderRequest) throws JSONException {
        String str2;
        String strM36555e = C17060n0.m36555e();
        JSONObject jSONObject = new JSONObject();
        if (orderRequest.m98514k()) {
            str2 = "MarketClose";
        } else {
            str2 = "LimitClose";
        }
        jSONObject.put("order_type", str2);
        jSONObject.put("is_success", z11);
        if (str == null) {
            str = "none";
        }
        jSONObject.put("fail_reason", str);
        jSONObject.put("trade_pair", C27041f.m66668h(orderRequest.getSymbol()));
        jSONObject.put("trade_type", C27041f.m66668h(orderRequest.getSideType()));
        jSONObject.put("platform_type", KCTurboSystemSettingsModuleImpl.PLATFORM_ANDROID);
        jSONObject.put("positionMode", m27980h0(orderRequest.getPositionSide()));
        C43852m.m96605q(strM36555e, jSONObject);
    }
}
