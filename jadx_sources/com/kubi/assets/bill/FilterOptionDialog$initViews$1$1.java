package com.kubi.assets.bill;

import android.view.View;
import com.kubi.assets.R$color;
import com.kubi.assets.R$drawable;
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

/* JADX INFO: compiled from: FilterOptionDialog.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0014¨\u0006\b"}, m90084d2 = {"com/kubi/assets/bill/FilterOptionDialog$initViews$1$1", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/assets/bill/FilterOptionItem;", "Lio/chad/library/adapter/base/BaseViewHolder;", "convert", "", "helper", "item", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFilterOptionDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FilterOptionDialog.kt\ncom/kubi/assets/bill/FilterOptionDialog$initViews$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,115:1\n1869#2,2:116\n*S KotlinDebug\n*F\n+ 1 FilterOptionDialog.kt\ncom/kubi/assets/bill/FilterOptionDialog$initViews$1$1\n*L\n92#1:116,2\n*E\n"})
public final class FilterOptionDialog$initViews$1$1 extends BaseQuickAdapter<FilterOptionItem, BaseViewHolder> {
    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void convert(BaseViewHolder helper, final FilterOptionItem item) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        int i11 = R$id.tvLabel;
        helper.setText(i11, item.getLabel()).setBackgroundRes(i11, item.getChecked() ? R$drawable.shape_border_emphasis_20r : R$drawable.shape_border_divider8_20r).setTextColor(i11, helper.itemView.getResources().getColor(item.getChecked() ? R$color.c_text : R$color.c_text60));
        View itemView = helper.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        C27046k.m66711z(itemView, 0L, new Function0() { // from class: com.kubi.assets.bill.u1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FilterOptionDialog$initViews$1$1.m15738i(this.f16816b, item);
            }
        }, 1, null);
    }

    public FilterOptionDialog$initViews$1$1(int i11, List<FilterOptionItem> list) {
        super(i11, list);
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m15738i(FilterOptionDialog$initViews$1$1 filterOptionDialog$initViews$1$1, FilterOptionItem filterOptionItem) {
        List<FilterOptionItem> data = filterOptionDialog$initViews$1$1.getData();
        Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
        Iterator<T> it = data.iterator();
        while (it.hasNext()) {
            ((FilterOptionItem) it.next()).setChecked(false);
        }
        filterOptionItem.setChecked(true);
        filterOptionDialog$initViews$1$1.notifyDataSetChanged();
        return Unit.INSTANCE;
    }
}
