package com.kubi.assets.exchange.p075ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.kubi.assets.AssetV2Api;
import com.kubi.assets.R$drawable;
import com.kubi.assets.R$id;
import com.kubi.assets.R$layout;
import com.kubi.assets.R$string;
import com.kubi.assets.entity.ExchangeRecordEntity;
import com.kubi.data.coin.AccountType;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.base.entity.BasePageEntity;
import com.kubi.sdk.base.p113ui.BasePagingFragment;
import com.kubi.sdk.util.C24217a1;
import com.kubi.sdk.util.C24256n1;
import com.kubi.utils.C27051h;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import gf.C37886j;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.Observable;
import java.math.BigDecimal;
import mr.C42597a;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import p429lf.C42179a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ExchangeCoinHistoryFragment.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0011\u001a\u00020\u0012H\u0014J\b\u0010\u0013\u001a\u00020\u0012H\u0014J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0002H\u0014J$\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u001b0\u001a2\u0006\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u0012H\u0014J\b\u0010\u001e\u001a\u00020\u001fH\u0014J\b\u0010 \u001a\u00020\u0015H\u0016R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR#\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\f0\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u000e\u0010\u000f¨\u0006\""}, m90084d2 = {"Lcom/kubi/assets/exchange/ui/ExchangeCoinHistoryFragment;", "Lcom/kubi/sdk/base/ui/BasePagingFragment;", "Lcom/kubi/assets/entity/ExchangeRecordEntity;", "<init>", "()V", "type", "", "getType", "()Ljava/lang/String;", "type$delegate", "Lkotlin/Lazy;", "assetApi", "Lcom/kubi/assets/AssetV2Api;", "kotlin.jvm.PlatformType", "getAssetApi", "()Lcom/kubi/assets/AssetV2Api;", "assetApi$delegate", "getLayout", "", "getItemLayout", "bindDataToView", "", "helper", "Lio/chad/library/adapter/base/BaseViewHolder;", "item", "getDataLoader", "Lio/reactivex/Observable;", "Lcom/kubi/sdk/base/entity/BasePageEntity;", "pageIndex", "pageSize", "needDefaultBackground", "", "showEmpty", "Companion", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ExchangeCoinHistoryFragment extends BasePagingFragment<ExchangeRecordEntity> {

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public static final Companion f17265b0 = new Companion(null);

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final Lazy f17266Z = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.exchange.ui.p
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ExchangeCoinHistoryFragment.m16437O3(this.f17310b);
        }
    });

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final Lazy f17267a0 = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.exchange.ui.q
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ExchangeCoinHistoryFragment.m16434K3();
        }
    });

    /* JADX INFO: compiled from: ExchangeCoinHistoryFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/assets/exchange/ui/ExchangeCoinHistoryFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/assets/exchange/ui/ExchangeCoinHistoryFragment;", "type", "Lcom/kubi/data/coin/AccountType;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final ExchangeCoinHistoryFragment newInstance(@NotNull AccountType type) {
            Intrinsics.checkNotNullParameter(type, "type");
            Bundle bundle = new Bundle();
            bundle.putString("page", type.name());
            ExchangeCoinHistoryFragment exchangeCoinHistoryFragment = new ExchangeCoinHistoryFragment();
            exchangeCoinHistoryFragment.setArguments(bundle);
            return exchangeCoinHistoryFragment;
        }
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: C3 */
    public boolean mo15903C3() {
        return false;
    }

    /* JADX INFO: renamed from: N3 */
    private final AssetV2Api m16436N3() {
        return (AssetV2Api) this.f17267a0.getValue();
    }

    private final String getType() {
        return (String) this.f17266Z.getValue();
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: L3, reason: merged with bridge method [inline-methods] */
    public void mo16439o3(@NotNull BaseViewHolder helper, @NotNull final ExchangeRecordEntity item) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        int i11 = R$id.tv_exchange_time;
        Long time = item.getTime();
        BaseViewHolder text = helper.setText(i11, C27041f.m66669i(time != null ? C42179a.m92633f(time.longValue(), null, false, false, null, 15, null) : null, "--"));
        int i12 = R$id.tv_exchange_actual;
        BigDecimal realExchangeAmount = item.getRealExchangeAmount();
        text.setText(i12, C42828b.m93906g(realExchangeAmount != null ? C37886j.m85578b(realExchangeAmount, "KCS", null, false, false, false, 0, null, 0, 254, null) : null, " KCS", true, false, 4, null));
        View view = helper.getView(i12);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        C24256n1.m58511a((TextView) view);
        View itemView = helper.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        C27046k.m66711z(itemView, 0L, new Function0() { // from class: com.kubi.assets.exchange.ui.r
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ExchangeCoinHistoryFragment.m16435M3(this.f17311b, item);
            }
        }, 1, null);
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment, com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.kucoin_fragment_ghost_exchange_history;
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public void showEmpty() {
        showEmpty(R$string.no_exchange_record, R$drawable.ic2_common_empty);
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: x3 */
    public int mo15925x3() {
        return R$layout.kucoin_item_ghost_exchange_history_view;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K3 */
    public static final AssetV2Api m16434K3() {
        return (AssetV2Api) C42597a.m93386b().create(AssetV2Api.class);
    }

    /* JADX INFO: renamed from: M3 */
    public static final Unit m16435M3(ExchangeCoinHistoryFragment exchangeCoinHistoryFragment, ExchangeRecordEntity exchangeRecordEntity) {
        Context context = exchangeCoinHistoryFragment.getContext();
        if (context != null) {
            BaseActivity.INSTANCE.launch(context, ExchangeCoinDetailFragment.class, new C27051h().m66724h("data", exchangeRecordEntity.getExchangeId()).m66724h("title", context.getString(R$string.kc_convert_detail)).m66724h("page", exchangeCoinHistoryFragment.getType()).m66717a());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: O3 */
    public static final String m16437O3(ExchangeCoinHistoryFragment exchangeCoinHistoryFragment) {
        Bundle arguments = exchangeCoinHistoryFragment.getArguments();
        if (arguments != null) {
            return RouteExKt.m56284y(arguments, "page");
        }
        return null;
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    @NotNull
    /* JADX INFO: renamed from: r3 */
    public Observable<BasePageEntity<ExchangeRecordEntity>> mo16440r3(int i11, int i12) {
        String type = getType();
        if (Intrinsics.areEqual(type, "LEVER")) {
            Observable observableCompose = m16436N3().m17176y(i12, i11).compose(C24217a1.m58389m());
            Intrinsics.checkNotNull(observableCompose);
            return observableCompose;
        }
        if (Intrinsics.areEqual(type, "MAIN")) {
            Observable observableCompose2 = m16436N3().m17079D1(i12, i11, "MAIN").compose(C24217a1.m58389m());
            Intrinsics.checkNotNull(observableCompose2);
            return observableCompose2;
        }
        Observable<BasePageEntity<ExchangeRecordEntity>> observableCompose3 = AssetV2Api.m17067p0(m16436N3(), i12, i11, null, 4, null).compose(C24217a1.m58389m());
        Intrinsics.checkNotNull(observableCompose3);
        return observableCompose3;
    }
}
