package com.kubi.assets;

import android.view.View;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.assets.service.AssetsDepend;
import com.kubi.utils.extensions.C27039d;
import io.chad.library.adapter.base.BaseItemDraggableAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.util.ArrayList;
import java.util.List;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import p402kf.C41014a;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AssetSortPreviewAdapter.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011J\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011J\u000e\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000bJ\u0018\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0002H\u0014J\b\u0010\u0018\u001a\u00020\u0019H\u0016R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/assets/AssetSortPreviewAdapter;", "Lio/chad/library/adapter/base/BaseItemDraggableAdapter;", "Lcom/kubi/assets/AccountSortIndexItem;", "Lio/chad/library/adapter/base/BaseViewHolder;", "assetList", "", "<init>", "(Ljava/util/List;)V", "getAssetList", "()Ljava/util/List;", "dragEnabled", "", FirebaseAnalytics.Param.CURRENCY, "", "updateData", "", "newList", "", "getCurrentData", "enableDragAndDrop", "enabled", "convert", "helper", "asset", "getItemCount", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AssetSortPreviewAdapter extends BaseItemDraggableAdapter<AccountSortIndexItem, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    @NotNull
    public final List<AccountSortIndexItem> f16324i;

    /* JADX INFO: renamed from: j */
    public boolean f16325j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public final String f16326k;

    /* JADX WARN: Multi-variable type inference failed */
    public AssetSortPreviewAdapter() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ AssetSortPreviewAdapter(List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? new ArrayList() : list);
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void convert(@NotNull BaseViewHolder helper, @NotNull AccountSortIndexItem asset) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(asset, "asset");
        helper.setText(R$id.tvAccountName, asset.getF16606b());
        helper.setText(R$id.tvAssetValue, C42828b.m93906g(C41014a.m89950x(C41014a.m89939m(C27039d.m66647g(asset.getF16607c()), this.f16326k), null, null, 0, false, false, false, true, 63, null), "≈", false, false, 6, null));
        View view = helper.getView(R$id.ivDragIcon);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        AssetExKt.m15138z(view, this.f16325j);
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f16324i.size();
    }

    /* JADX INFO: renamed from: h */
    public final void m15149h(boolean z11) {
        this.f16325j = z11;
        notifyDataSetChanged();
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final List<AccountSortIndexItem> m15150i() {
        return CollectionsKt.toList(this.f16324i);
    }

    /* JADX INFO: renamed from: j */
    public final void m15151j(@NotNull List<AccountSortIndexItem> newList) {
        Intrinsics.checkNotNullParameter(newList, "newList");
        this.f16324i.clear();
        this.f16324i.addAll(newList);
        notifyDataSetChanged();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetSortPreviewAdapter(@NotNull List<AccountSortIndexItem> assetList) {
        super(R$layout.asset_tab_sort_asset_preview, assetList);
        Intrinsics.checkNotNullParameter(assetList, "assetList");
        this.f16324i = assetList;
        this.f16326k = AssetsDepend.f18689a.m19189j().d0().getBalanceCurrency();
    }
}
