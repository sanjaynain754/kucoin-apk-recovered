package com.kubi.spot.quote.market;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.quotefacade.api.IQuoteFacadeService;
import com.kubi.router.core.Router;
import com.kubi.router.model.IRedirect;
import com.kubi.spot.R$drawable;
import com.kubi.spot.R$id;
import com.kubi.spot.R$mipmap;
import com.kubi.spot.R$string;
import com.kubi.spot.business.market.ToggleSymbolsFragment;
import com.kubi.spot.helper.C25307a;
import com.kubi.spot.quote.market.symbolListItemView.SymbolsListAdapter;
import com.kubi.spot.service.SpotDepend;
import com.kubi.user.api.IUserService;
import com.kubi.utils.C27017c;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27046k;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import qe0.C43724b;
import w20.C45700a;

/* JADX INFO: renamed from: com.kubi.spot.quote.market.j, reason: from Kotlin metadata */
/* JADX INFO: compiled from: SpotFavorHelper.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002J\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0014H\u0002¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/spot/quote/market/SpotFavorHelper;", "", "<init>", "()V", "initPopView", "", "tradeListAdapter", "Lcom/kubi/spot/quote/market/symbolListItemView/SymbolsListAdapter;", ViewProps.POSITION, "", "mPop", "Lcom/zyyoona7/popup/EasyPopup;", "toggleSymbolsFragment", "Lcom/kubi/spot/business/market/ToggleSymbolsFragment;", "getToastMsg", "", "item", "Lcom/kubi/data/entity/TradeItemBean;", "trackClick", "isFavor", "", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSpotFavorHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpotFavorHelper.kt\ncom/kubi/spot/quote/market/SpotFavorHelper\n+ 2 SpotIssue.kt\ncom/kubi/spot/exeption/SpotIssueKt\n*L\n1#1,109:1\n43#2,7:110\n*S KotlinDebug\n*F\n+ 1 SpotFavorHelper.kt\ncom/kubi/spot/quote/market/SpotFavorHelper\n*L\n73#1:110,7\n*E\n"})
public final class SpotFavorHelper {
    /* JADX INFO: renamed from: k */
    public static final Unit m62637k(TradeListModel tradeListModel, final TradeItemBean tradeItemBean, final ToggleSymbolsFragment toggleSymbolsFragment, C43724b c43724b, final SpotFavorHelper spotFavorHelper, final SymbolsListAdapter symbolsListAdapter, final int i11) {
        SpotDepend spotDepend = SpotDepend.f51244a;
        if (spotDepend.m63036f().c()) {
            Observable<Object> observableM62521c = tradeListModel.m62521c(tradeItemBean.getSymbol());
            Consumer<? super Object> consumer = new Consumer() { // from class: com.kubi.spot.quote.market.e
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    SpotFavorHelper.m62638l(this.f50921b, tradeItemBean, symbolsListAdapter, i11, toggleSymbolsFragment, obj);
                }
            };
            final Function1 function1 = new Function1() { // from class: com.kubi.spot.quote.market.f
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SpotFavorHelper.m62639m((Throwable) obj);
                }
            };
            Disposable disposableSubscribe = observableM62521c.subscribe(consumer, new Consumer() { // from class: com.kubi.spot.quote.market.g
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    SpotFavorHelper.m62640n(function1, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
            DisposableKt.addTo(disposableSubscribe, toggleSymbolsFragment.getDestroyDisposable());
        } else if (TextUtils.isEmpty(spotDepend.m63036f().d0().id) || !spotDepend.m63036f().o()) {
            IQuoteFacadeService.f41383a.get().mo50678C(tradeItemBean, new Function1() { // from class: com.kubi.spot.quote.market.i
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SpotFavorHelper.m62642p(this.f50933b, tradeItemBean, symbolsListAdapter, i11, ((Boolean) obj).booleanValue());
                }
            });
        } else {
            IUserService.O((IUserService) Router.f46192a.m56192n(IUserService.class), (Map) null, IRedirect.INSTANCE.obtain(new Function0() { // from class: com.kubi.spot.quote.market.h
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SpotFavorHelper.m62641o();
                }
            }), 1, (Object) null);
        }
        c43724b.m96331y();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m */
    public static final Unit m62639m(Throwable th2) {
        if ((th2 instanceof ApiException) && Intrinsics.areEqual(((ApiException) th2).code, "420000")) {
            ToastCompat.m66441G(C27017c.f54310a.m66516f(R$string.rank_fav_limit, 150), new Object[0]);
        }
        Intrinsics.checkNotNull(th2);
        C45700a.m100877c(th2, "SpotFavorHelper");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o */
    public static final Unit m62641o() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m62642p(SpotFavorHelper spotFavorHelper, TradeItemBean tradeItemBean, SymbolsListAdapter symbolsListAdapter, int i11, boolean z11) {
        if (z11) {
            ToastCompat.m66441G(spotFavorHelper.m62643h(tradeItemBean), new Object[0]);
            spotFavorHelper.m62645q(C25307a.m61759a(tradeItemBean));
            symbolsListAdapter.notifyItemChanged(i11);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h */
    public final String m62643h(TradeItemBean tradeItemBean) {
        return C27017c.f54310a.m66516f(C27025c.m66566d(tradeItemBean != null ? Boolean.valueOf(C25307a.m61759a(tradeItemBean)) : null) ? R$string.cancel_favor_ok : R$string.add_favorites_ok, new Object[0]);
    }

    /* JADX INFO: renamed from: i */
    public final void m62644i(@NotNull final SymbolsListAdapter tradeListAdapter, final int i11, @NotNull final C43724b mPop, @NotNull final ToggleSymbolsFragment toggleSymbolsFragment) {
        LinearLayout linearLayout;
        ImageView imageView;
        Intrinsics.checkNotNullParameter(tradeListAdapter, "tradeListAdapter");
        Intrinsics.checkNotNullParameter(mPop, "mPop");
        Intrinsics.checkNotNullParameter(toggleSymbolsFragment, "toggleSymbolsFragment");
        final TradeListModel tradeListModel = new TradeListModel();
        final TradeItemBean item = tradeListAdapter.getItem(i11);
        if (item == null || mPop.m96292A() == null) {
            return;
        }
        View viewM96292A = mPop.m96292A();
        if (viewM96292A != null && (imageView = (ImageView) viewM96292A.findViewById(R$id.ivFavor)) != null) {
            imageView.setImageResource(C27025c.m66566d(Boolean.valueOf(C25307a.m61759a(item))) ? R$mipmap.ic_favor : R$drawable.ic_unfav_white);
        }
        mPop.m96315Y(new PopupWindow.OnDismissListener() { // from class: com.kubi.spot.quote.market.c
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                SpotFavorHelper.m62636j(tradeListAdapter);
            }
        });
        View viewM96292A2 = mPop.m96292A();
        if (viewM96292A2 == null || (linearLayout = (LinearLayout) viewM96292A2.findViewById(R$id.llFavor)) == null) {
            return;
        }
        C27046k.m66711z(linearLayout, 0L, new Function0() { // from class: com.kubi.spot.quote.market.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SpotFavorHelper.m62637k(tradeListModel, item, toggleSymbolsFragment, mPop, this, tradeListAdapter, i11);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: q */
    public final void m62645q(boolean z11) {
        C43852m.m96591c("B5trading", "sideMarketFavoriteSearch", null, new JSONObject().put("sidemarketfav", z11), 4, null);
    }

    /* JADX INFO: renamed from: j */
    public static final void m62636j(SymbolsListAdapter symbolsListAdapter) {
        if (symbolsListAdapter.getF51073m() != -1) {
            symbolsListAdapter.notifyItemChanged(symbolsListAdapter.getF51073m());
        }
        symbolsListAdapter.m62739m(-1);
    }

    /* JADX INFO: renamed from: l */
    public static final void m62638l(SpotFavorHelper spotFavorHelper, TradeItemBean tradeItemBean, SymbolsListAdapter symbolsListAdapter, int i11, ToggleSymbolsFragment toggleSymbolsFragment, Object obj) {
        ToastCompat.m66441G(spotFavorHelper.m62643h(tradeItemBean), new Object[0]);
        tradeItemBean.setFavor(!C27025c.m66566d(Boolean.valueOf(C25307a.m61759a(tradeItemBean))));
        spotFavorHelper.m62645q(C25307a.m61759a(tradeItemBean));
        symbolsListAdapter.notifyItemChanged(i11);
        toggleSymbolsFragment.updateFavor(tradeItemBean);
    }

    /* JADX INFO: renamed from: n */
    public static final void m62640n(Function1 function1, Object obj) {
        function1.invoke(obj);
    }
}
