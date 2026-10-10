package com.kubi.futures.share;

import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.futures.share.PositionListShare;
import com.kubi.kumex.data.market.model.PriceEntity;
import com.kubi.kumex.data.market.model.TickerEntity;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.kumex.data.trade.model.PositionEntity;
import com.kubi.kumex.utils.Persistence;
import com.kubi.network.retrofit.utils.C19331c;
import com.kubi.sdk.BaseFragment;
import com.kubi.utils.FlowableCompat;
import com.kubi.utils.extensions.C27041f;
import fm.C37569d;
import io.reactivex.Flowable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.math.BigDecimal;
import o00.C42916f;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.futures.share.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: PositionListShare.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0003H\u0014¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/futures/share/PositionListShare;", "Lcom/kubi/futures/share/BasePositionShare;", "Lcom/kubi/kumex/data/trade/model/PositionEntity;", "Lcom/kubi/kumex/data/market/model/TickerEntity;", "<init>", "()V", FirebaseAnalytics.Event.SHARE, "", "fragment", "Lcom/kubi/sdk/BaseFragment;", ViewProps.POSITION, "buildShareParam", "Lcom/kubi/futures/share/BasePositionShare$ShareParam;", "ticker", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class PositionListShare extends BasePositionShare<PositionEntity, TickerEntity> {
    /* JADX INFO: renamed from: p */
    public static final Unit m26531p(BaseFragment baseFragment, PositionListShare positionListShare, PositionEntity positionEntity, PriceEntity priceEntity) {
        BaseFragment.hideLoadingDialog$default(baseFragment, false, 1, null);
        positionListShare.m26504d(baseFragment, positionListShare.m26535m(positionEntity, priceEntity.getLatestTicker()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r */
    public static final Unit m26533r(BaseFragment baseFragment, Throwable th2) {
        BaseFragment.hideLoadingDialog$default(baseFragment, false, 1, null);
        Intrinsics.checkNotNull(th2);
        C19331c.m42836c(th2, null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o */
    public static final PriceEntity m26530o(PositionEntity positionEntity) {
        return RepositoryServiceLocator.f19236a.m20286e().mo24820s(C27041f.m66668h(positionEntity.getSymbol()));
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public BasePositionShare.ShareParam m26535m(@NotNull PositionEntity position, @NotNull TickerEntity ticker) {
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(ticker, "ticker");
        String strM66668h = C27041f.m66668h(position.getSymbol());
        ContractEntity contractEntityM84661b = C37569d.m84661b(position);
        String strM84683x = C37569d.m84683x(position);
        BigDecimal realLeverage = position.getRealLeverage();
        BigDecimal bigDecimalM84658J = C37569d.m84658J(position);
        BigDecimal bigDecimalM84659K = C37569d.m84659K(position);
        BigDecimal avgEntryPrice = position.getAvgEntryPrice();
        BigDecimal price = ticker.getPrice();
        String settleCurrency = position.getSettleCurrency();
        long jCurrentTimeMillis = System.currentTimeMillis();
        Persistence persistence = Persistence.f30799a;
        boolean zM36516a = persistence.m36516a("contract_share_show_pnl", false);
        boolean zIsTrialFunds = position.isTrialFunds();
        boolean zM36516a2 = persistence.m36516a("contract_share_show_user", true);
        String prizeType = position.getPrizeType();
        if (prizeType == null) {
            prizeType = "";
        }
        return new BasePositionShare.ShareParam(false, strM66668h, contractEntityM84661b, strM84683x, realLeverage, bigDecimalM84658J, bigDecimalM84659K, Long.valueOf(jCurrentTimeMillis), avgEntryPrice, price, settleCurrency, zM36516a2, zM36516a, zIsTrialFunds, prizeType);
    }

    /* JADX INFO: renamed from: n */
    public final void m26536n(@NotNull final BaseFragment fragment, @NotNull final PositionEntity position) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(position, "position");
        fragment.showLoadingDialog();
        Flowable flowableObserveOn = FlowableCompat.f54248a.m66385b(new Function0() { // from class: gi.j
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PositionListShare.m26530o(position);
            }
        }).subscribeOn(C42916f.m94127f()).observeOn(C42916f.m94128g());
        final Function1 function1 = new Function1() { // from class: gi.k
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PositionListShare.m26531p(fragment, this, position, (PriceEntity) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: gi.l
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                PositionListShare.m26532q(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: gi.m
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PositionListShare.m26533r(fragment, (Throwable) obj);
            }
        };
        Disposable disposableSubscribe = flowableObserveOn.subscribe(consumer, new Consumer() { // from class: gi.n
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                PositionListShare.m26534s(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, fragment.getDestroyDisposable());
    }

    /* JADX INFO: renamed from: q */
    public static final void m26532q(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: s */
    public static final void m26534s(Function1 function1, Object obj) {
        function1.invoke(obj);
    }
}
