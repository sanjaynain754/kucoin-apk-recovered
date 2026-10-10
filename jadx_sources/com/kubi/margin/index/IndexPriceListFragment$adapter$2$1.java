package com.kubi.margin.index;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.margin.R$id;
import com.kubi.margin.entity.IndexSymbolData;
import com.kubi.resources.C22890g;
import com.kubi.resources.widget.UpDownColorTextView;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.bugly.proguard.C33820nf;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.math.BigDecimal;
import p402kf.C41014a;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.ranges.RangesKt;
import p852kotlin.text.StringsKt;
import rs.C44172b;

/* JADX INFO: compiled from: IndexPriceListFragment.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0006\u0010\u0004\u001a\u00020\u0005J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u001c\u0010\r\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m90084d2 = {"com/kubi/margin/index/IndexPriceListFragment$adapter$2$1", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/margin/entity/IndexSymbolData;", "Lio/chad/library/adapter/base/BaseViewHolder;", "isNotBindRecyclerView", "", "firstVisiblePosition", "", "lastVisiblePosition", "bindToRecyclerView", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "convert", "helper", "item", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class IndexPriceListFragment$adapter$2$1 extends BaseQuickAdapter<IndexSymbolData, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    public int f33055i;

    /* JADX INFO: renamed from: j */
    public int f33056j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ IndexPriceListFragment f33057k;

    /* JADX INFO: renamed from: com.kubi.margin.index.IndexPriceListFragment$adapter$2$1$a */
    /* JADX INFO: compiled from: IndexPriceListFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m90084d2 = {"com/kubi/margin/index/IndexPriceListFragment$adapter$2$1$bindToRecyclerView$1", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newState", "", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C17646a extends RecyclerView.OnScrollListener {
        public C17646a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, newState);
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            IndexPriceListFragment$adapter$2$1 indexPriceListFragment$adapter$2$1 = IndexPriceListFragment$adapter$2$1.this;
            indexPriceListFragment$adapter$2$1.f33055i = linearLayoutManager.findFirstVisibleItemPosition();
            indexPriceListFragment$adapter$2$1.f33056j = linearLayoutManager.findLastVisibleItemPosition();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndexPriceListFragment$adapter$2$1(IndexPriceListFragment indexPriceListFragment, int i11) {
        super(i11);
        this.f33057k = indexPriceListFragment;
        setHasStableIds(true);
        this.f33056j = 15;
    }

    /* JADX INFO: renamed from: k */
    public static final Unit m38485k(IndexPriceListFragment$adapter$2$1 indexPriceListFragment$adapter$2$1, IndexSymbolData indexSymbolData) {
        IndexDetailActivity.Companion companion = IndexDetailActivity.f33040B;
        Context mContext = indexPriceListFragment$adapter$2$1.mContext;
        Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
        companion.toIndexDetailActivity(mContext, indexSymbolData);
        return Unit.INSTANCE;
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void convert(BaseViewHolder baseViewHolder, final IndexSymbolData indexSymbolData) {
        if (baseViewHolder == null || indexSymbolData == null) {
            return;
        }
        int i11 = R$id.tv_trade_pair;
        IndexPriceListFragment indexPriceListFragment = this.f33057k;
        Context mContext = this.mContext;
        Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
        String name = indexSymbolData.getName();
        BaseViewHolder text = baseViewHolder.setText(i11, indexPriceListFragment.m38479F3(mContext, name != null ? StringsKt.replace$default(name, C33820nf.f71144W, "/", false, 4, (Object) null) : null));
        int i12 = R$id.tv_money_price;
        BigDecimal price = indexSymbolData.getPrice();
        BaseViewHolder text2 = text.setText(i12, C27041f.m66669i(price != null ? C41014a.m89950x(C41014a.m89940n(price, indexSymbolData.getQuoteCurrency()), null, null, 0, false, false, false, false, 127, null) : null, "--"));
        int i13 = R$id.tv_change_rate;
        BaseViewHolder text3 = text2.setText(i13, indexSymbolData.getChange() == null ? "--" : indexSymbolData.getFormatChangeRate());
        Intrinsics.checkNotNullExpressionValue(text3, "setText(...)");
        double dM66647g = C27039d.m66647g(indexSymbolData.getChange());
        Context context = baseViewHolder.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        C22890g.m54293r(text3, i13, C22890g.m54286k(dM66647g, context));
        View itemView = baseViewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        C27046k.m66711z(itemView, 0L, new Function0() { // from class: com.kubi.margin.index.i0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IndexPriceListFragment$adapter$2$1.m38485k(this.f33071b, indexSymbolData);
            }
        }, 1, null);
        boolean z11 = RangesKt.coerceAtLeast(this.f33055i, baseViewHolder.getAdapterPosition()) == RangesKt.coerceAtMost(this.f33056j, baseViewHolder.getAdapterPosition());
        int i14 = R$id.tv_price;
        ((UpDownColorTextView) baseViewHolder.getView(i14)).setVisibleToUser(z11);
        View view = baseViewHolder.getView(i14);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        TextView textViewM97383c = C44172b.m97383c((TextView) view, null, false, 3, null);
        BigDecimal price2 = indexSymbolData.getPrice();
        textViewM97383c.setText(C27041f.m66669i(price2 != null ? C42180b.m92640e(price2, null, 30, false, false, false, 0, null, 125, null) : null, "--"));
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    public void bindToRecyclerView(RecyclerView recyclerView) {
        super.bindToRecyclerView(recyclerView);
        if (recyclerView != null) {
            recyclerView.addOnScrollListener(new C17646a());
        }
    }

    /* JADX INFO: renamed from: l */
    public final boolean m38487l() {
        if (getRecyclerView() == null) {
            return true;
        }
        return false;
    }
}
