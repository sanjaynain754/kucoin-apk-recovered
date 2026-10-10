package com.kubi.quotefacade.market.futures;

import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.kumex.api.IKuMexService;
import com.kubi.quotefacade.R$string;
import com.kubi.quotefacade.event.MarketListContract$UIIntent;
import com.kubi.quotefacade.helper.FavFutureCacheManager;
import com.kubi.quotefacade.market.MarketListFragment;
import com.kubi.quotefacade.service.BQuoteFacadeDepend;
import com.kubi.router.core.Router;
import com.kubi.router.model.IRedirect;
import com.kubi.user.api.IUserService;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27025c;
import f00.C37304a;
import g00.InterfaceC37752d;
import java.util.ArrayList;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p569qq.C43841b;
import p569qq.C43852m;
import p809yu.C46588u;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;
import qe0.C43724b;

/* JADX INFO: compiled from: FuturesListFragment.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J/\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0002\u0010\u000eJ\u001a\u0010\u000f\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0010\u001a\u00020\u0005H\u0016J\u001a\u0010\u0011\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0010\u001a\u00020\u0005H\u0016¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/quotefacade/market/futures/FuturesListFragment;", "Lcom/kubi/quotefacade/market/MarketListFragment;", "<init>", "()V", "getSymbolType", "", "onMarketListItemClick", "", "item", "Lcom/kubi/data/entity/TradeItemBean;", "fromType", "l1p", "", "l2p", "(Lcom/kubi/data/entity/TradeItemBean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "handleAddOrCancelFavorite", ViewProps.POSITION, "handleFavorite", "Companion", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class FuturesListFragment extends MarketListFragment {

    /* JADX INFO: renamed from: j0 */
    @NotNull
    public static final Companion f42235j0 = new Companion(null);

    /* JADX INFO: compiled from: FuturesListFragment.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u00050\rj\b\u0012\u0004\u0012\u00020\u0005`\u000eH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/quotefacade/market/futures/FuturesListFragment$Companion;", "", "<init>", "()V", "PAGE_ID", "", "newInstance", "Lcom/kubi/quotefacade/market/futures/FuturesListFragment;", "l1p", "l2p", "pageSize", "", "symbols", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @JvmStatic
        @NotNull
        public final FuturesListFragment newInstance(@NotNull String l1p, @NotNull String l2p, int pageSize, @NotNull ArrayList<String> symbols) {
            Intrinsics.checkNotNullParameter(l1p, "l1p");
            Intrinsics.checkNotNullParameter(l2p, "l2p");
            Intrinsics.checkNotNullParameter(symbols, "symbols");
            FuturesListFragment futuresListFragment = new FuturesListFragment();
            Bundle bundle = new Bundle();
            bundle.putString("data", l1p);
            bundle.putString("data_1", l2p);
            bundle.putInt("data_2", pageSize);
            bundle.putStringArrayList("data_3", symbols);
            futuresListFragment.setArguments(bundle);
            return futuresListFragment;
        }
    }

    @Override // com.kubi.quotefacade.market.MarketListFragment
    /* JADX INFO: renamed from: u4 */
    public int mo52334u4() {
        return 1;
    }

    /* JADX INFO: renamed from: j5 */
    public static final Unit m52404j5() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k5 */
    public static final Unit m52405k5(FuturesListFragment futuresListFragment, boolean z11, TradeItemBean tradeItemBean, String str, int i11, boolean z12) {
        if (!z12) {
            return Unit.INSTANCE;
        }
        ToastCompat.m66441G(futuresListFragment.mContext.getString(z11 ? R$string.add_favorites_ok : R$string.cancel_favor_ok), new Object[0]);
        tradeItemBean.setFavor(z11);
        BQuoteFacadeDepend.f42592a.m53023c().mo33256E(str, z11);
        futuresListFragment.m52326l4().notifyItemChanged(i11);
        return Unit.INSTANCE;
    }

    @Override // com.kubi.quotefacade.market.MarketListFragment
    /* JADX INFO: renamed from: Y4 */
    public void mo52321Y4(@NotNull TradeItemBean item, @Nullable Integer num, @NotNull String l1p, @NotNull String l2p) throws JSONException {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(l1p, "l1p");
        Intrinsics.checkNotNullParameter(l2p, "l2p");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("postType", l1p);
        jSONObject.put("name", l2p);
        jSONObject.put("symbol", item.getSymbol());
        Unit unit = Unit.INSTANCE;
        C43852m.m96589a("B6FuturesMarkets", "Futures", "1", jSONObject);
        C43841b.m96557d("B5markets_futures", "click_start_btn", null, 4, null);
        String symbol = item.getSymbol();
        if (symbol != null) {
            InterfaceC37752d.a.m85122a(C37304a.f82764a, symbol, null, null, null, 14, null);
        }
    }

    @Override // com.kubi.quotefacade.market.MarketListFragment
    /* JADX INFO: renamed from: v4 */
    public void mo52335v4(@Nullable final TradeItemBean tradeItemBean, final int i11) {
        final String symbol;
        BQuoteFacadeDepend bQuoteFacadeDepend = BQuoteFacadeDepend.f42592a;
        if (bQuoteFacadeDepend.m53025e().c()) {
            sendIntent(new MarketListContract$UIIntent.CollectOrCancelCoin(1, tradeItemBean, i11));
        } else if (!TextUtils.isEmpty(bQuoteFacadeDepend.m53025e().d()) && com.kubi.user.config.a.b()) {
            IUserService.O((IUserService) Router.f46192a.m56192n(IUserService.class), (Map) null, IRedirect.INSTANCE.obtain(new Function0() { // from class: com.kubi.quotefacade.market.futures.a
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FuturesListFragment.m52404j5();
                }
            }), 1, (Object) null);
        } else if (tradeItemBean != null && (symbol = tradeItemBean.getSymbol()) != null && !StringsKt.isBlank(symbol)) {
            final boolean z11 = !C27025c.m66566d(Boolean.valueOf(C46588u.m102744c(tradeItemBean)));
            FavFutureCacheManager.f41975a.m51907d(symbol, new Function1() { // from class: com.kubi.quotefacade.market.futures.b
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FuturesListFragment.m52405k5(this.f42249b, z11, tradeItemBean, symbol, i11, ((Boolean) obj).booleanValue());
                }
            });
        }
        C43724b c43724bM52322a5 = m52322a5();
        if (c43724bM52322a5 != null) {
            c43724bM52322a5.m96331y();
        }
    }

    @Override // com.kubi.quotefacade.market.MarketListFragment
    /* JADX INFO: renamed from: w4 */
    public void mo52336w4(@Nullable TradeItemBean tradeItemBean, int i11) {
        if (tradeItemBean != null) {
            ToastCompat.m66441G(this.mContext.getString(C27025c.m66566d(Boolean.valueOf(C46588u.m102744c(tradeItemBean))) ? R$string.cancel_favor_ok : R$string.add_favorites_ok), new Object[0]);
            tradeItemBean.setFavor(!tradeItemBean.isFavor());
            IKuMexService iKuMexServiceM53023c = BQuoteFacadeDepend.f42592a.m53023c();
            String symbol = tradeItemBean.getSymbol();
            Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
            IKuMexService.m33250m(iKuMexServiceM53023c, symbol, tradeItemBean.isFavor(), false, null, 8, null);
            m52326l4().notifyItemChanged(i11);
        }
    }
}
