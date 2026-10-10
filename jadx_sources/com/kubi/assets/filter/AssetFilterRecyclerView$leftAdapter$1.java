package com.kubi.assets.filter;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.CheckedTextView;
import com.kubi.assets.R$id;
import com.kubi.utils.extensions.C27046k;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.util.Iterator;
import java.util.List;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: AssetFilterRecyclerView.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0015¨\u0006\b"}, m90084d2 = {"com/kubi/assets/filter/AssetFilterRecyclerView$leftAdapter$1", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/assets/filter/AssetFilterRecyclerView$FilterGroupList;", "Lio/chad/library/adapter/base/BaseViewHolder;", "convert", "", "helper", "item", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAssetFilterRecyclerView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetFilterRecyclerView.kt\ncom/kubi/assets/filter/AssetFilterRecyclerView$leftAdapter$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,100:1\n1869#2,2:101\n*S KotlinDebug\n*F\n+ 1 AssetFilterRecyclerView.kt\ncom/kubi/assets/filter/AssetFilterRecyclerView$leftAdapter$1\n*L\n41#1:101,2\n*E\n"})
public final class AssetFilterRecyclerView$leftAdapter$1 extends BaseQuickAdapter<AssetFilterRecyclerView.FilterGroupList, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ AssetFilterRecyclerView f17348i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetFilterRecyclerView$leftAdapter$1(AssetFilterRecyclerView assetFilterRecyclerView, int i11) {
        super(i11);
        this.f17348i = assetFilterRecyclerView;
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void convert(BaseViewHolder helper, final AssetFilterRecyclerView.FilterGroupList item) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        CheckedTextView checkedTextView = (CheckedTextView) helper.getView(R$id.tvGroupName);
        checkedTextView.setChecked(item.getIsCheck());
        checkedTextView.setText(item.getFilterName());
        View itemView = helper.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        final AssetFilterRecyclerView assetFilterRecyclerView = this.f17348i;
        C27046k.m66711z(itemView, 0L, new Function0() { // from class: com.kubi.assets.filter.i
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AssetFilterRecyclerView$leftAdapter$1.m16598i(this.f17368b, item, assetFilterRecyclerView);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m16598i(AssetFilterRecyclerView$leftAdapter$1 assetFilterRecyclerView$leftAdapter$1, AssetFilterRecyclerView.FilterGroupList filterGroupList, AssetFilterRecyclerView assetFilterRecyclerView) {
        List<AssetFilterRecyclerView.FilterGroupList> data = assetFilterRecyclerView$leftAdapter$1.getData();
        Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
        Iterator<T> it = data.iterator();
        while (it.hasNext()) {
            ((AssetFilterRecyclerView.FilterGroupList) it.next()).m16596d(false);
        }
        filterGroupList.m16596d(true);
        assetFilterRecyclerView$leftAdapter$1.notifyDataSetChanged();
        assetFilterRecyclerView.f17344f.replaceData(filterGroupList.m16594b());
        return Unit.INSTANCE;
    }
}
