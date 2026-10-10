package com.kubi.assets.filter;

import android.annotation.SuppressLint;
import android.view.View;
import com.kubi.assets.R$color;
import com.kubi.assets.R$drawable;
import com.kubi.assets.R$id;
import com.kubi.assets.R$layout;
import com.kubi.resources.widget.drop.FilterType;
import com.kubi.utils.extensions.C27046k;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.ArraysKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: AssetFilterAdapter.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0015J\b\u0010\r\u001a\u00020\u000eH\u0016¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/assets/filter/AssetFilterAdapter;", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/resources/widget/drop/FilterType$IFilter;", "Lio/chad/library/adapter/base/BaseViewHolder;", "Lcom/kubi/assets/filter/IFilterDialogCallBack;", "list", "", "<init>", "([Lcom/kubi/resources/widget/drop/FilterType$IFilter;)V", "convert", "", "helper", "item", "getAdapterResult", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAssetFilterAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetFilterAdapter.kt\ncom/kubi/assets/filter/AssetFilterAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,38:1\n295#2,2:39\n1869#2,2:41\n*S KotlinDebug\n*F\n+ 1 AssetFilterAdapter.kt\ncom/kubi/assets/filter/AssetFilterAdapter\n*L\n37#1:39,2\n31#1:41,2\n*E\n"})
public final class AssetFilterAdapter extends BaseQuickAdapter<FilterType.InterfaceC23033b, BaseViewHolder> implements IFilterDialogCallBack {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetFilterAdapter(@NotNull FilterType.InterfaceC23033b[] list) {
        super(R$layout.item_asset_account_check, ArraysKt.toList(list));
        Intrinsics.checkNotNullParameter(list, "list");
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void convert(@NotNull BaseViewHolder helper, @NotNull final FilterType.InterfaceC23033b item) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        int i11 = R$id.tv_label;
        helper.setText(i11, item.getF44544a()).setBackgroundRes(i11, item.getF44546c() ? R$drawable.shape_border_emphasis_20r : R$drawable.shape_border_divider8_20r).setTextColor(i11, helper.itemView.getResources().getColor(item.getF44546c() ? R$color.c_text : R$color.c_text60));
        View itemView = helper.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        C27046k.m66711z(itemView, 0L, new Function0() { // from class: com.kubi.assets.filter.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AssetFilterAdapter.m16558i(this.f17358b, item);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m16558i(AssetFilterAdapter assetFilterAdapter, FilterType.InterfaceC23033b interfaceC23033b) {
        List<FilterType.InterfaceC23033b> data = assetFilterAdapter.getData();
        Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
        Iterator<T> it = data.iterator();
        while (it.hasNext()) {
            ((FilterType.InterfaceC23033b) it.next()).mo55155c(false);
        }
        interfaceC23033b.mo55155c(true);
        assetFilterAdapter.notifyDataSetChanged();
        return Unit.INSTANCE;
    }

    @Override // com.kubi.assets.filter.IFilterDialogCallBack
    @NotNull
    public String getAdapterResult() {
        Object next;
        String f44545b;
        List<FilterType.InterfaceC23033b> data = getData();
        Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
        Iterator<T> it = data.iterator();
        do {
            if (it.hasNext()) {
                next = it.next();
            } else {
                next = null;
                break;
            }
        } while (!((FilterType.InterfaceC23033b) next).getF44546c());
        FilterType.InterfaceC23033b interfaceC23033b = (FilterType.InterfaceC23033b) next;
        if (interfaceC23033b != null && (f44545b = interfaceC23033b.getF44545b()) != null) {
            return f44545b;
        }
        return "";
    }
}
