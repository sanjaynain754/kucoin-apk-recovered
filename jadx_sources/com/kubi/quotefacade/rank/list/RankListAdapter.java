package com.kubi.quotefacade.rank.list;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.mvi.common.C19244f;
import com.kubi.quotefacade.R$color;
import com.kubi.quotefacade.R$drawable;
import com.kubi.quotefacade.R$id;
import com.kubi.quotefacade.R$layout;
import com.kubi.quotefacade.entity.RankEntity;
import com.kubi.quotefacade.helper.QuoteExKt;
import com.kubi.resources.C22890g;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.CoinAvatarView;
import com.kubi.resources.widget.ShowHideTextView;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.sdk.util.C24277v;
import com.kubi.sdk.util.CountDownFinishCallback;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.C27046k;
import gf.C37886j;
import io.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025av.C4392c;
import p402kf.C41014a;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import rs.C44172b;

/* JADX INFO: compiled from: RankListAdapter.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 $2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001$B!\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0010J\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\fJ\u001c\u0010\u0018\u001a\u00020\u00122\b\u0010\u0019\u001a\u0004\u0018\u00010\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002H\u0014J\u0012\u0010\u001b\u001a\u00020\u00122\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u0014\u0010\u001e\u001a\u00020\u0012*\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0002H\u0002J\u0014\u0010\u001f\u001a\u00020\u0012*\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0002H\u0002J\u0014\u0010 \u001a\u00020\u0012*\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0002H\u0002J\b\u0010!\u001a\u00020\u0015H\u0002J\u0010\u0010\"\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0002H\u0002J\b\u0010#\u001a\u00020\u0015H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, m90084d2 = {"Lcom/kubi/quotefacade/rank/list/RankListAdapter;", "Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;", "Lcom/kubi/quotefacade/entity/RankEntity;", "Lio/chad/library/adapter/base/BaseViewHolder;", "rankType", "", "catalog", "positionType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "TAG", "firstVisiblePosition", "", "lastVisiblePosition", "longClickPosition", "countDownFinish", "Lcom/kubi/sdk/util/CountDownFinishCallback;", "configCountDownFinishCallback", "", "cb", "isNotBindRecyclerView", "", "setLongClickPosition", ViewProps.POSITION, "convert", "helper", "item", "bindToRecyclerView", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "renderNormal", "renderNew", "configIcon", "isShowVolume", "getVolumeMarketCap", "isShowOrder", "Companion", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class RankListAdapter extends BaseMultiItemQuickAdapter<RankEntity, BaseViewHolder> {

    /* JADX INFO: renamed from: q */
    @NotNull
    public static final Companion f42458q = new Companion(null);

    /* JADX INFO: renamed from: i */
    @NotNull
    public final String f42459i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final String f42460j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public final String f42461k;

    /* JADX INFO: renamed from: l */
    @NotNull
    public final String f42462l;

    /* JADX INFO: renamed from: m */
    public int f42463m;

    /* JADX INFO: renamed from: n */
    public int f42464n;

    /* JADX INFO: renamed from: o */
    public int f42465o;

    /* JADX INFO: renamed from: p */
    @Nullable
    public CountDownFinishCallback f42466p;

    /* JADX INFO: compiled from: RankListAdapter.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/quotefacade/rank/list/RankListAdapter$Companion;", "", "<init>", "()V", "ITEM_TYPE_NEW", "", "ITEM_TYPE_NORMAL", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.rank.list.RankListAdapter$a */
    /* JADX INFO: compiled from: RankListAdapter.kt */
    @Metadata(m90083d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m90084d2 = {"com/kubi/quotefacade/rank/list/RankListAdapter$bindToRecyclerView$1", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newState", "", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C22467a extends RecyclerView.OnScrollListener {
        public C22467a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, newState);
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            RankListAdapter rankListAdapter = RankListAdapter.this;
            rankListAdapter.f42463m = linearLayoutManager.findFirstVisibleItemPosition();
            rankListAdapter.f42464n = linearLayoutManager.findLastVisibleItemPosition();
        }
    }

    /* JADX INFO: renamed from: w */
    public static final Unit m52782w(RankListAdapter rankListAdapter, BaseViewHolder baseViewHolder, RankEntity rankEntity) {
        Drawable drawable;
        String strM51857h;
        String strM85579c;
        rankListAdapter.m52784m(baseViewHolder, rankEntity);
        BaseTextView baseTextView = (BaseTextView) baseViewHolder.getView(R$id.tv_order);
        if (rankListAdapter.m52788r()) {
            Intrinsics.checkNotNull(baseTextView);
            C27046k.m66685H(baseTextView);
            int bindingAdapterPosition = baseViewHolder.getBindingAdapterPosition() + 1;
            baseTextView.setText(String.valueOf(bindingAdapterPosition));
            if (bindingAdapterPosition == 1) {
                drawable = ContextCompat.getDrawable(baseTextView.getContext(), R$drawable.rank_top_bg_one);
            } else if (bindingAdapterPosition != 2) {
                drawable = bindingAdapterPosition != 3 ? null : ContextCompat.getDrawable(baseTextView.getContext(), R$drawable.rank_top_bg_three);
            } else {
                drawable = ContextCompat.getDrawable(baseTextView.getContext(), R$drawable.rank_top_bg_two);
            }
            baseTextView.setBackground(drawable);
            baseTextView.setTextColor((1 > bindingAdapterPosition || bindingAdapterPosition >= 4) ? ContextCompat.getColor(baseTextView.getContext(), R$color.c_text40) : ContextCompat.getColor(baseTextView.getContext(), R$color.c_text));
        } else {
            Intrinsics.checkNotNull(baseTextView);
            C27046k.m66700o(baseTextView);
        }
        baseViewHolder.setText(R$id.tv_symbol, rankEntity.showSymbol(rankListAdapter.f42460j));
        BaseTextView baseTextView2 = (BaseTextView) baseViewHolder.getView(R$id.tvCoinLabel);
        Intrinsics.checkNotNull(baseTextView2);
        C19244f.m42542a(baseTextView2, rankEntity.getMargin(rankListAdapter.f42460j).length() > 0);
        baseTextView2.setText(rankEntity.getMargin(rankListAdapter.f42460j));
        BaseTextView baseTextView3 = (BaseTextView) baseViewHolder.getView(R$id.tv_quote);
        String quote = rankEntity.getQuote();
        if (quote == null || quote.length() == 0 || !C4392c.m4018f(rankListAdapter.f42460j)) {
            Intrinsics.checkNotNull(baseTextView3);
            C27046k.m66700o(baseTextView3);
        } else {
            baseTextView3.setText('/' + rankEntity.getQuote());
            Intrinsics.checkNotNull(baseTextView3);
            C27046k.m66685H(baseTextView3);
        }
        BaseTextView baseTextView4 = (BaseTextView) baseViewHolder.getView(R$id.tv_price);
        Intrinsics.checkNotNull(baseTextView4);
        TextView textViewM97383c = C44172b.m97383c(baseTextView4, null, false, 3, null);
        BigDecimal bigDecimalM103798getPrice = rankEntity.m103798getPrice();
        if (bigDecimalM103798getPrice == null || (strM85579c = C37886j.m85579c(bigDecimalM103798getPrice, rankEntity.getSymbol(), (124 & 2) != 0 ? RoundingMode.DOWN : null, (124 & 4) != 0 ? false : false, (124 & 8) != 0 ? false : false, (124 & 16) != 0, (124 & 32) == 0 ? 0 : 0, (124 & 64) != 0 ? MultiLanguageManager.f46811g.getLocale() : null)) == null || (strM51857h = QuoteExKt.m51857h(strM85579c)) == null) {
            strM51857h = "--";
        }
        textViewM97383c.setText(strM51857h);
        baseViewHolder.setText(R$id.tv_money_price, rankEntity.getPrice());
        ShowHideTextView showHideTextView = (ShowHideTextView) baseViewHolder.getView(R$id.tv_value);
        Intrinsics.checkNotNull(showHideTextView);
        C19244f.m42542a(showHideTextView, rankListAdapter.m52789s());
        showHideTextView.setText(rankListAdapter.m52786p(rankEntity));
        int i11 = R$id.tv_change_rate;
        BigDecimal changeRate = rankEntity.getChangeRate();
        BaseViewHolder text = baseViewHolder.setText(i11, C42180b.m92647l(changeRate != null ? C42828b.m93915p(C42828b.m93911l(C42180b.m92642g(changeRate, null, null, C41014a.m89951y(changeRate), true, false, false, 19, null))) : null));
        Intrinsics.checkNotNullExpressionValue(text, "setText(...)");
        double dM66647g = C27039d.m66647g(rankEntity.getChangeRate());
        Context context = baseViewHolder.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        C22890g.m54293r(text, i11, C22890g.m54286k(dM66647g, context));
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RankListAdapter(@NotNull String rankType, @NotNull String catalog, @Nullable String str) {
        super(new ArrayList());
        Intrinsics.checkNotNullParameter(rankType, "rankType");
        Intrinsics.checkNotNullParameter(catalog, "catalog");
        this.f42459i = rankType;
        this.f42460j = catalog;
        this.f42461k = str;
        this.f42462l = "RankListAdapter";
        this.f42464n = 15;
        this.f42465o = -1;
        setHasStableIds(true);
        addItemType(1, R$layout.item_list_rank_coin_preview);
        addItemType(2, R$layout.item_list_rank_coin);
    }

    /* JADX INFO: renamed from: n */
    public static final Unit m52780n(BaseViewHolder baseViewHolder, RankListAdapter rankListAdapter, RankEntity rankEntity) {
        CoinAvatarView coinAvatarView = (CoinAvatarView) baseViewHolder.getView(R$id.coin_icon);
        if (coinAvatarView != null) {
            if (C4392c.m4016d(rankListAdapter.f42460j) && C4392c.m4015c(rankListAdapter.f42459i)) {
                C24277v.m58542g(coinAvatarView, rankEntity.getIconUrl());
                C27046k.m66685H(coinAvatarView);
            } else {
                C27046k.m66700o(coinAvatarView);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l */
    public final void m52783l(@Nullable CountDownFinishCallback countDownFinishCallback) {
        this.f42466p = countDownFinishCallback;
    }

    /* JADX INFO: renamed from: m */
    public final void m52784m(final BaseViewHolder baseViewHolder, final RankEntity rankEntity) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.rank.list.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RankListAdapter.m52780n(baseViewHolder, this, rankEntity);
            }
        });
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void convert(@Nullable BaseViewHolder baseViewHolder, @Nullable RankEntity rankEntity) {
        if (baseViewHolder == null || rankEntity == null) {
            return;
        }
        if (Intrinsics.areEqual(this.f42459i, "NEW_CURRENCY_V2")) {
            int f38450c = rankEntity.getF38450c();
            if (f38450c == 1) {
                m52790t(baseViewHolder, rankEntity);
            } else if (f38450c == 2) {
                m52791v(baseViewHolder, rankEntity);
            }
        } else {
            m52791v(baseViewHolder, rankEntity);
        }
        if (C4392c.m4013a(this.f42461k)) {
            int iM66658b = C27040e.m66658b(12);
            View view = baseViewHolder.getView(R$id.item_root_view);
            if (view != null) {
                view.setPadding(iM66658b, 0, iM66658b, 0);
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public final String m52786p(RankEntity rankEntity) {
        String str = this.f42459i;
        if (Intrinsics.areEqual(str, "VOLUME_CHANGE_24H_UP_RATE")) {
            return rankEntity.getVolume();
        }
        return Intrinsics.areEqual(str, "MARKET_CAP") ? rankEntity.getMarketCap() : "";
    }

    /* JADX INFO: renamed from: r */
    public final boolean m52788r() {
        return Intrinsics.areEqual(this.f42459i, "SEARCH_HOT") && !Intrinsics.areEqual(this.f42461k, "HOMEPAGE");
    }

    /* JADX INFO: renamed from: s */
    public final boolean m52789s() {
        return Intrinsics.areEqual(this.f42459i, "VOLUME_CHANGE_24H_UP_RATE") || Intrinsics.areEqual(this.f42459i, "MARKET_CAP");
    }

    /* JADX INFO: renamed from: t */
    public final void m52790t(final BaseViewHolder baseViewHolder, final RankEntity rankEntity) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.rank.list.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RankListAdapter.m52781u(this.f42501b, baseViewHolder, rankEntity);
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public final void m52791v(final BaseViewHolder baseViewHolder, final RankEntity rankEntity) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.rank.list.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RankListAdapter.m52782w(this.f42505b, baseViewHolder, rankEntity);
            }
        });
    }

    /* JADX INFO: renamed from: x */
    public final void m52792x(int i11) {
        this.f42465o = i11;
    }

    /* JADX INFO: renamed from: u */
    public static final Unit m52781u(RankListAdapter rankListAdapter, BaseViewHolder baseViewHolder, RankEntity rankEntity) {
        boolean z11;
        rankListAdapter.m52784m(baseViewHolder, rankEntity);
        baseViewHolder.setText(R$id.tv_symbol, rankEntity.showSymbol(rankListAdapter.f42460j));
        BaseTextView baseTextView = (BaseTextView) baseViewHolder.getView(R$id.tvCoinLabel);
        Intrinsics.checkNotNull(baseTextView);
        if (rankEntity.getMargin(rankListAdapter.f42460j).length() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        C19244f.m42542a(baseTextView, z11);
        baseTextView.setText(rankEntity.getMargin(rankListAdapter.f42460j));
        RankListCountDownView rankListCountDownView = (RankListCountDownView) baseViewHolder.getView(R$id.layoutCountdown);
        rankListCountDownView.m52797e(rankEntity.getOpeningTime());
        rankListCountDownView.m52796d(rankListAdapter.f42466p);
        return Unit.INSTANCE;
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    public void bindToRecyclerView(@Nullable RecyclerView recyclerView) {
        super.bindToRecyclerView(recyclerView);
        if (recyclerView != null) {
            recyclerView.addOnScrollListener(new C22467a());
        }
    }

    /* JADX INFO: renamed from: q */
    public final boolean m52787q() {
        if (getRecyclerView() == null) {
            return true;
        }
        return false;
    }
}
