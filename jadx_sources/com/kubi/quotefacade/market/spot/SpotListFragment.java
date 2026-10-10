package com.kubi.quotefacade.market.spot;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.quotefacade.R$string;
import com.kubi.quotefacade.event.MarketListContract$UIIntent;
import com.kubi.quotefacade.helper.FavSpotCacheManager;
import com.kubi.quotefacade.market.MarketListFragment;
import com.kubi.quotefacade.service.BQuoteFacadeDepend;
import com.kubi.router.core.Router;
import com.kubi.router.model.IRedirect;
import com.kubi.spot.api.ISpotService;
import com.kubi.user.api.IUserService;
import com.kubi.utils.C27051h;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27025c;
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
import qe0.C43724b;

/* JADX INFO: compiled from: SpotListFragment.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J/\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0002\u0010\u000eJ\u001a\u0010\u000f\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0010\u001a\u00020\u0005H\u0016J\u001a\u0010\u0011\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0010\u001a\u00020\u0005H\u0016¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/quotefacade/market/spot/SpotListFragment;", "Lcom/kubi/quotefacade/market/MarketListFragment;", "<init>", "()V", "getSymbolType", "", "onMarketListItemClick", "", "item", "Lcom/kubi/data/entity/TradeItemBean;", "fromType", "l1p", "", "l2p", "(Lcom/kubi/data/entity/TradeItemBean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "handleAddOrCancelFavorite", ViewProps.POSITION, "handleFavorite", "Companion", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class SpotListFragment extends MarketListFragment {

    /* JADX INFO: renamed from: j0 */
    @NotNull
    public static final Companion f42360j0 = new Companion(null);

    /* JADX INFO: compiled from: SpotListFragment.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u00050\rj\b\u0012\u0004\u0012\u00020\u0005`\u000eH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/quotefacade/market/spot/SpotListFragment$Companion;", "", "<init>", "()V", "PAGE_ID", "", "newInstance", "Lcom/kubi/quotefacade/market/spot/SpotListFragment;", "l1p", "l2p", "pageSize", "", "symbols", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @JvmStatic
        @NotNull
        public final SpotListFragment newInstance(@NotNull String l1p, @NotNull String l2p, int pageSize, @NotNull ArrayList<String> symbols) {
            Intrinsics.checkNotNullParameter(l1p, "l1p");
            Intrinsics.checkNotNullParameter(l2p, "l2p");
            Intrinsics.checkNotNullParameter(symbols, "symbols");
            SpotListFragment spotListFragment = new SpotListFragment();
            Bundle bundle = new Bundle();
            bundle.putString("data", l1p);
            bundle.putString("data_1", l2p);
            bundle.putInt("data_2", pageSize);
            bundle.putStringArrayList("data_3", symbols);
            spotListFragment.setArguments(bundle);
            return spotListFragment;
        }
    }

    @Override // com.kubi.quotefacade.market.MarketListFragment
    /* JADX INFO: renamed from: u4 */
    public int mo52334u4() {
        return 0;
    }

    /* JADX INFO: renamed from: k5 */
    public static final Unit m52629k5() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l5 */
    public static final Unit m52630l5(TradeItemBean tradeItemBean, SpotListFragment spotListFragment, int i11, boolean z11) {
        if (z11 && tradeItemBean != null) {
            ToastCompat.m66441G(spotListFragment.mContext.getString(C27025c.m66566d(Boolean.valueOf(C46588u.m102743b(tradeItemBean))) ? R$string.cancel_favor_ok : R$string.add_favorites_ok), new Object[0]);
            spotListFragment.m52326l4().notifyItemChanged(i11);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m5 */
    public static final Unit m52631m5(SpotListFragment spotListFragment, TradeItemBean it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Intent intent = new Intent();
        intent.putExtras(new C27051h().m66721e("data", it).m66717a());
        FragmentActivity activity = spotListFragment.getActivity();
        if (activity != null) {
            activity.setResult(-1, intent);
        }
        FragmentActivity activity2 = spotListFragment.getActivity();
        if (activity2 != null) {
            activity2.finish();
        }
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
        C43852m.m96589a("B5SpotsMarkets", "Spots", "1", jSONObject);
        C43841b.m96557d("B5markets_spot", "click_start_btn", null, 4, null);
        if (item.getSymbol() != null) {
            ISpotService.m59982A(BQuoteFacadeDepend.f42592a.m53024d(), item.getSymbol(), num, null, new Function1() { // from class: com.kubi.quotefacade.market.spot.f
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SpotListFragment.m52631m5(this.f42368b, (TradeItemBean) obj);
                }
            }, 4, null);
        }
    }

    @Override // com.kubi.quotefacade.market.MarketListFragment
    /* JADX INFO: renamed from: v4 */
    public void mo52335v4(@Nullable final TradeItemBean tradeItemBean, final int i11) {
        BQuoteFacadeDepend bQuoteFacadeDepend = BQuoteFacadeDepend.f42592a;
        if (bQuoteFacadeDepend.m53025e().c()) {
            sendIntent(new MarketListContract$UIIntent.CollectOrCancelCoin(0, tradeItemBean, i11));
        } else if (TextUtils.isEmpty(bQuoteFacadeDepend.m53025e().d()) || !com.kubi.user.config.a.b()) {
            FavSpotCacheManager.f41993a.m51947d(tradeItemBean, new Function1() { // from class: com.kubi.quotefacade.market.spot.h
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SpotListFragment.m52630l5(tradeItemBean, this, i11, ((Boolean) obj).booleanValue());
                }
            });
        } else {
            IUserService.O((IUserService) Router.f46192a.m56192n(IUserService.class), (Map) null, IRedirect.INSTANCE.obtain(new Function0() { // from class: com.kubi.quotefacade.market.spot.g
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SpotListFragment.m52629k5();
                }
            }), 1, (Object) null);
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
            ToastCompat.m66441G(this.mContext.getString(C27025c.m66566d(Boolean.valueOf(C46588u.m102743b(tradeItemBean))) ? R$string.cancel_favor_ok : R$string.add_favorites_ok), new Object[0]);
            tradeItemBean.setFavor(!C27025c.m66566d(Boolean.valueOf(C46588u.m102743b(tradeItemBean))));
            m52326l4().notifyItemChanged(i11);
        }
    }
}
