package r20;

import a30.InterfaceC0057a;
import androidx.appcompat.widget.AppCompatTextView;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.sdk.base.p113ui.OldBaseFragment;
import com.kubi.spot.R$id;
import com.kubi.spot.business.newCoin.NewCoinHelper;
import com.kubi.spot.business.newCoin.entity.NewCoinActivityEntity;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import io.chad.library.adapter.base.BaseViewHolder;
import org.jetbrains.annotations.NotNull;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: r20.e */
/* JADX INFO: compiled from: NewCoinSymbolListItemView.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, m90084d2 = {"Lcom/kubi/spot/business/newCoin/action/NewCoinSymbolListItemView;", "Lcom/kubi/spot/quote/market/symbolListItemView/ISymbolListItemView;", "<init>", "()V", "bindItemView", "", "helper", "Lio/chad/library/adapter/base/BaseViewHolder;", "item", "Lcom/kubi/data/entity/TradeItemBean;", "fragment", "Lcom/kubi/sdk/base/ui/OldBaseFragment;", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C43907e implements InterfaceC0057a {
    /* JADX INFO: renamed from: i */
    public static final Unit m96719i(NewCoinActivityEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        NewCoinHelper.f50279a.m61282e(it);
        return Unit.INSTANCE;
    }

    @Override // a30.InterfaceC0057a
    /* JADX INFO: renamed from: a */
    public void mo82a(@NotNull BaseViewHolder helper, @NotNull final TradeItemBean item, @NotNull final OldBaseFragment fragment) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        int i11 = R$id.tv_new_coin_reserve;
        helper.setGone(i11, true).setGone(R$id.ll_price_and_percent, false).setGone(R$id.tv_opening_call_auction, false);
        AppCompatTextView appCompatTextView = (AppCompatTextView) helper.getView(i11);
        Intrinsics.checkNotNull(appCompatTextView);
        C27046k.m66711z(appCompatTextView, 0L, new Function0() { // from class: r20.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C43907e.m96716f(item, fragment);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m96716f(TradeItemBean tradeItemBean, final OldBaseFragment oldBaseFragment) {
        C43852m.m96590b("B5trading", "sideBar", "subButton", TuplesKt.m90091to("symbol", C27041f.m66668h(tradeItemBean.getSymbolInfoEntity().getSymbol())));
        NewCoinHelper newCoinHelper = NewCoinHelper.f50279a;
        String baseCurrency = tradeItemBean.getSymbolInfoEntity().getBaseCurrency();
        Intrinsics.checkNotNullExpressionValue(baseCurrency, "getBaseCurrency(...)");
        newCoinHelper.m61281d(oldBaseFragment, baseCurrency, true, new Function0() { // from class: r20.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C43907e.m96717g(oldBaseFragment);
            }
        }, new Function0() { // from class: r20.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C43907e.m96718h(oldBaseFragment);
            }
        }, new Function1() { // from class: r20.d
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C43907e.m96719i((NewCoinActivityEntity) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g */
    public static final Unit m96717g(OldBaseFragment oldBaseFragment) {
        oldBaseFragment.showDialogLoading();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h */
    public static final Unit m96718h(OldBaseFragment oldBaseFragment) {
        oldBaseFragment.hideDialogLoading();
        return Unit.INSTANCE;
    }
}
