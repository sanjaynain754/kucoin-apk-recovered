package com.kubi.assets.bill;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.CheckedTextView;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.drop.FilterType;
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

/* JADX INFO: compiled from: FutureRecordFilterRecyclerView.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0015¨\u0006\b"}, m90084d2 = {"com/kubi/assets/bill/FutureRecordFilterRecyclerView$rightAdapter$1", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/resources/widget/drop/FilterType$IFilter;", "Lio/chad/library/adapter/base/BaseViewHolder;", "convert", "", "helper", "item", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFutureRecordFilterRecyclerView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FutureRecordFilterRecyclerView.kt\ncom/kubi/assets/bill/FutureRecordFilterRecyclerView$rightAdapter$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,104:1\n1869#2:105\n1869#2,2:106\n1870#2:108\n*S KotlinDebug\n*F\n+ 1 FutureRecordFilterRecyclerView.kt\ncom/kubi/assets/bill/FutureRecordFilterRecyclerView$rightAdapter$1\n*L\n56#1:105\n57#1:106,2\n56#1:108\n*E\n"})
public final class FutureRecordFilterRecyclerView$rightAdapter$1 extends BaseQuickAdapter<FilterType.InterfaceC23033b, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ FutureRecordFilterRecyclerView f16727i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FutureRecordFilterRecyclerView$rightAdapter$1(FutureRecordFilterRecyclerView futureRecordFilterRecyclerView, int i11) {
        super(i11);
        this.f16727i = futureRecordFilterRecyclerView;
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void convert(BaseViewHolder helper, final FilterType.InterfaceC23033b item) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        CheckedTextView checkedTextView = (CheckedTextView) helper.getView(R$id.tvName);
        checkedTextView.setChecked(item.getF44546c());
        checkedTextView.setText(item.getF44544a());
        helper.setGone(R$id.ivChecked, item.getF44546c());
        View itemView = helper.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        final FutureRecordFilterRecyclerView futureRecordFilterRecyclerView = this.f16727i;
        C27046k.m66711z(itemView, 0L, new Function0() { // from class: com.kubi.assets.bill.i2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FutureRecordFilterRecyclerView$rightAdapter$1.m15797i(futureRecordFilterRecyclerView, this, item);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m15797i(FutureRecordFilterRecyclerView futureRecordFilterRecyclerView, FutureRecordFilterRecyclerView$rightAdapter$1 futureRecordFilterRecyclerView$rightAdapter$1, FilterType.InterfaceC23033b interfaceC23033b) {
        List data = futureRecordFilterRecyclerView.f16721e.getData();
        Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
        Iterator it = data.iterator();
        while (it.hasNext()) {
            for (FilterType.InterfaceC23033b interfaceC23033b2 : ((FutureRecordFilterRecyclerView.FilterGroupList) it.next()).m15790b()) {
                interfaceC23033b2.mo55155c(Intrinsics.areEqual(interfaceC23033b.getF44545b(), interfaceC23033b2.getF44545b()));
            }
        }
        futureRecordFilterRecyclerView$rightAdapter$1.notifyDataSetChanged();
        return Unit.INSTANCE;
    }
}
