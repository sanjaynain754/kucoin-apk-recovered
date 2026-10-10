package com.kubi.quotefacade.favorites.recommend;

import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.kubi.quotefacade.entity.RecommendItemBean;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.ItemCallBack;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.core.ViewExtKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RecommendRecyclerHomeItemProxy.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0006H\u0016J\b\u0010\u001b\u001a\u00020\u0010H\u0002R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/quotefacade/favorites/recommend/RecommendRecyclerHomeItemProxy;", "Lcom/kubi/quotefacade/favorites/recommend/RecommendRecyclerItemProxy;", "parent", "Landroid/view/ViewGroup;", "shortCall", "Lcom/kubi/sdk/ItemCallBack;", "Lcom/kubi/quotefacade/entity/RecommendItemBean;", "longCall", "<init>", "(Landroid/view/ViewGroup;Lcom/kubi/sdk/ItemCallBack;Lcom/kubi/sdk/ItemCallBack;)V", "getParent", "()Landroid/view/ViewGroup;", "getShortCall", "()Lcom/kubi/sdk/ItemCallBack;", "getLongCall", "bindView", "", "itemBean", "itemVerPadding", "", "itemMinHeight", "priceTopMargin", "priceTextSizePx", "", "priceMinHeight", "precentTextSizePx", "precentMinHeight", "updateUIOnHomeRankCard", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class RecommendRecyclerHomeItemProxy extends RecommendRecyclerItemProxy {
    private final int itemMinHeight;
    private final int itemVerPadding;

    @Nullable
    private final ItemCallBack<RecommendItemBean> longCall;

    @NotNull
    private final ViewGroup parent;
    private final int precentMinHeight;
    private final float precentTextSizePx;
    private final int priceMinHeight;
    private final float priceTextSizePx;
    private final int priceTopMargin;

    @Nullable
    private final ItemCallBack<RecommendItemBean> shortCall;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecommendRecyclerHomeItemProxy(@NotNull ViewGroup parent, @Nullable ItemCallBack<RecommendItemBean> itemCallBack, @Nullable ItemCallBack<RecommendItemBean> itemCallBack2) {
        super(parent, itemCallBack, itemCallBack2);
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.parent = parent;
        this.shortCall = itemCallBack;
        this.longCall = itemCallBack2;
        this.itemVerPadding = C27040e.m66658b(12);
        this.itemMinHeight = C27040e.m66658b(90);
        this.priceTopMargin = C27040e.m66658b(8);
        this.priceTextSizePx = C27040e.m66660d(14);
        this.priceMinHeight = C27040e.m66658b(20);
        this.precentTextSizePx = C27040e.m66660d(13);
        this.precentMinHeight = C27040e.m66658b(18);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.kubi.quotefacade.favorites.recommend.RecommendRecyclerItemProxy, com.kubi.sdk.ViewHolderProxy
    public void bindView(@NotNull RecommendItemBean itemBean) {
        Intrinsics.checkNotNullParameter(itemBean, "itemBean");
        super.bindView(itemBean);
        updateUIOnHomeRankCard();
    }

    @Override // com.kubi.quotefacade.favorites.recommend.RecommendRecyclerItemProxy, com.kubi.sdk.ViewHolderProxy
    @Nullable
    public ItemCallBack<RecommendItemBean> getLongCall() {
        return this.longCall;
    }

    @Override // com.kubi.quotefacade.favorites.recommend.RecommendRecyclerItemProxy, com.kubi.sdk.ViewHolderProxy
    @NotNull
    public ViewGroup getParent() {
        return this.parent;
    }

    @Override // com.kubi.quotefacade.favorites.recommend.RecommendRecyclerItemProxy, com.kubi.sdk.ViewHolderProxy
    @Nullable
    public ItemCallBack<RecommendItemBean> getShortCall() {
        return this.shortCall;
    }

    private final void updateUIOnHomeRankCard() {
        BaseTextView price = getBinding().f4363g;
        Intrinsics.checkNotNullExpressionValue(price, "price");
        ViewExtKt.m66585p(price, 0, this.priceTopMargin, 0, 0, 13, null);
        getBinding().f4363g.setTextSize(0, this.priceTextSizePx);
        getBinding().f4363g.setMinHeight(this.priceMinHeight);
        getBinding().f4369m.setTextSize(0, this.precentTextSizePx);
        getBinding().f4369m.setMinHeight(this.precentMinHeight);
        ConstraintLayout constraintLayout = getBinding().f4358b;
        constraintLayout.setPadding(constraintLayout.getPaddingStart(), this.itemVerPadding, constraintLayout.getPaddingEnd(), this.itemVerPadding);
        constraintLayout.setMinHeight(this.itemMinHeight);
    }
}
