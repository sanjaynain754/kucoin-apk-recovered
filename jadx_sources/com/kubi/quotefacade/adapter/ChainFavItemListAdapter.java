package com.kubi.quotefacade.adapter;

import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.quotefacade.R$color;
import com.kubi.quotefacade.R$id;
import com.kubi.quotefacade.R$layout;
import com.kubi.quotefacade.R$mipmap;
import com.kubi.quotefacade.constant.ChainSortItemEnum;
import com.kubi.quotefacade.entity.ChainItemEntity;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.CoinAvatarView;
import com.kubi.resources.widget.UpDownColorTextView;
import com.kubi.sdk.util.C24277v;
import com.kubi.utils.extensions.C27041f;
import gf.C37885i;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41015b;
import p809yu.C46574g;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.ranges.RangesKt;
import ro.C44128b;
import rs.C44172b;

/* JADX INFO: compiled from: ChainFavItemListAdapter.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0010J\u0012\u0010\u0019\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u001c\u0010\u001c\u001a\u00020\u00172\b\u0010\u001d\u001a\u0004\u0018\u00010\u00032\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002H\u0014J\u0012\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0002J\u0012\u0010#\u001a\u00020\u00052\b\u0010$\u001a\u0004\u0018\u00010\u0005H\u0002R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000¨\u0006%"}, m90084d2 = {"Lcom/kubi/quotefacade/adapter/ChainFavItemListAdapter;", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/quotefacade/entity/ChainItemEntity;", "Lio/chad/library/adapter/base/BaseViewHolder;", "sortItemType", "", "from", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getSortItemType", "()Ljava/lang/String;", "setSortItemType", "(Ljava/lang/String;)V", "getFrom", "setFrom", "firstVisiblePosition", "", "lastVisiblePosition", "longClickPosition", "FROM_TYPE", "isNotBindRecyclerView", "", "setLongClickPosition", "", ViewProps.POSITION, "bindToRecyclerView", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "convert", "helper", "item", "getNoNullPrice", "Landroid/text/SpannableStringBuilder;", "currentPriceUsd", "Ljava/math/BigDecimal;", "getNoNullVolume", "tokenTxVolumeUsd", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ChainFavItemListAdapter extends BaseQuickAdapter<ChainItemEntity, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    @Nullable
    public String f41036i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public String f41037j;

    /* JADX INFO: renamed from: k */
    public int f41038k;

    /* JADX INFO: renamed from: l */
    public int f41039l;

    /* JADX INFO: renamed from: m */
    public int f41040m;

    /* JADX INFO: renamed from: n */
    @NotNull
    public final String f41041n;

    /* JADX INFO: renamed from: com.kubi.quotefacade.adapter.ChainFavItemListAdapter$a */
    /* JADX INFO: compiled from: ChainFavItemListAdapter.kt */
    @Metadata(m90083d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m90084d2 = {"com/kubi/quotefacade/adapter/ChainFavItemListAdapter$bindToRecyclerView$1", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newState", "", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21568a extends RecyclerView.OnScrollListener {
        public C21568a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, newState);
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            ChainFavItemListAdapter chainFavItemListAdapter = ChainFavItemListAdapter.this;
            chainFavItemListAdapter.f41038k = linearLayoutManager.findFirstVisibleItemPosition();
            chainFavItemListAdapter.f41039l = linearLayoutManager.findLastVisibleItemPosition();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChainFavItemListAdapter() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: j */
    public final SpannableStringBuilder m50183j(BigDecimal bigDecimal) {
        SpannableStringBuilder spannableStringBuilderM89958e = null;
        if (bigDecimal != null) {
            try {
                spannableStringBuilderM89958e = C41015b.m89958e(bigDecimal, null, null, 0, 7, null);
            } catch (Exception unused) {
                C44128b.m97266j("ChainFavItemListAdapter", "volume parse number error");
            }
        }
        if (spannableStringBuilderM89958e != null) {
            return spannableStringBuilderM89958e;
        }
        SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder().append((CharSequence) "--");
        Intrinsics.checkNotNullExpressionValue(spannableStringBuilderAppend, "append(...)");
        return spannableStringBuilderAppend;
    }

    public /* synthetic */ ChainFavItemListAdapter(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? ChainSortItemEnum.CHAIN_SORT_TYPE_CHANGE.getConstSortType() : str, (i11 & 2) != 0 ? "" : str2);
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void convert(@Nullable BaseViewHolder baseViewHolder, @Nullable ChainItemEntity chainItemEntity) {
        if (baseViewHolder == null || chainItemEntity == null) {
            return;
        }
        C24277v.m58542g((ImageView) baseViewHolder.getView(R$id.coin_icon), chainItemEntity.getLogoUrl());
        int i11 = R$id.chain_icon;
        C24277v.m58542g((ImageView) baseViewHolder.getView(i11), chainItemEntity.getChainLogo());
        CoinAvatarView coinAvatarView = (CoinAvatarView) baseViewHolder.getView(i11);
        coinAvatarView.setStrokeColor(coinAvatarView.getResources().getColor(R$color.c_overlay));
        View view = baseViewHolder.getView(R$id.tv_chain_currency);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        BaseTextView baseTextView = (BaseTextView) view;
        baseTextView.setText(C27041f.m66669i(chainItemEntity.getSymbol(), "--"));
        if (Intrinsics.areEqual(chainItemEntity.getHotToken(), Boolean.TRUE)) {
            baseTextView.setCompoundDrawablePadding(4);
            baseTextView.setCompoundDrawablesWithIntrinsicBounds(0, 0, R$mipmap.ic_hot, 0);
        } else {
            baseTextView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        }
        baseViewHolder.setGone(R$id.iv_chain_fav, Intrinsics.areEqual(this.f41037j, this.f41041n) ? C46574g.m102732b(chainItemEntity, chainItemEntity) : false);
        baseViewHolder.setText(R$id.chain_coin_volume, m50184k(chainItemEntity.getTokenTxVolumeUsd()));
        boolean z11 = RangesKt.coerceAtLeast(this.f41038k, baseViewHolder.getAdapterPosition()) == RangesKt.coerceAtMost(this.f41039l, baseViewHolder.getAdapterPosition());
        UpDownColorTextView upDownColorTextView = (UpDownColorTextView) baseViewHolder.getView(R$id.tv_chain_price);
        Intrinsics.checkNotNull(upDownColorTextView);
        C44172b.m97383c(upDownColorTextView, null, false, 3, null);
        upDownColorTextView.setSameSymbol(Boolean.valueOf(upDownColorTextView.getTag() != null && upDownColorTextView.getTag().equals(chainItemEntity.getToken())));
        upDownColorTextView.setTag(chainItemEntity.getToken());
        upDownColorTextView.setVisibleToUser(z11);
        upDownColorTextView.setText(m50183j(chainItemEntity.getCurrentPriceUsd()));
        baseViewHolder.setGone(R$id.tv_change_rate, false);
        baseViewHolder.setGone(R$id.tv_trade_count, false);
        baseViewHolder.setGone(R$id.layout_count, false);
        baseViewHolder.setGone(R$id.tv_single_line, false);
        baseViewHolder.setGone(R$id.iv_container, false);
        String str = this.f41036i;
        if (str != null) {
            C46574g.m102731a(chainItemEntity, str).mo102729a(baseViewHolder, chainItemEntity);
        }
    }

    /* JADX INFO: renamed from: k */
    public final String m50184k(String str) {
        String strM85566e;
        if (str != null) {
            try {
                strM85566e = C37885i.m85566e(Double.parseDouble(str), "USD");
            } catch (Exception unused) {
                C44128b.m97266j("ChainFavItemListAdapter", "volume parse number error");
                return "--";
            }
        } else {
            strM85566e = null;
        }
        return C27041f.m66669i(strM85566e, "--");
    }

    /* JADX INFO: renamed from: m */
    public final void m50186m(int i11) {
        this.f41040m = i11;
    }

    /* JADX INFO: renamed from: n */
    public final void m50187n(@Nullable String str) {
        this.f41036i = str;
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    public void bindToRecyclerView(@Nullable RecyclerView recyclerView) {
        super.bindToRecyclerView(recyclerView);
        if (recyclerView != null) {
            recyclerView.addOnScrollListener(new C21568a());
        }
    }

    /* JADX INFO: renamed from: l */
    public final boolean m50185l() {
        if (getRecyclerView() == null) {
            return true;
        }
        return false;
    }

    public ChainFavItemListAdapter(@Nullable String str, @Nullable String str2) {
        super(R$layout.item_list_chain_favorite);
        this.f41036i = str;
        this.f41037j = str2;
        this.f41039l = 15;
        this.f41040m = -1;
        this.f41041n = "market";
        setHasStableIds(true);
    }
}
