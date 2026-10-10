package com.kubi.assets.dialog.payment;

import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.assets.AssetExKt;
import com.kubi.assets.R$id;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.core.ViewExtKt;
import io.chad.library.adapter.base.BaseViewHolder;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.assets.dialog.payment.n, reason: from Kotlin metadata and from toString */
/* JADX INFO: compiled from: AssetMultiPaymentContentAdapter.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u001c\b\u0002\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0015J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001d\u0010\u0018\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007HÆ\u0003J=\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u001c\b\u0002\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R%\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/assets/dialog/payment/MergeGroupItem;", "", "groupItem", "Lcom/kubi/assets/dialog/payment/AssetPaymentListGroup;", "tradeType", "", "itemClick", "Lkotlin/Function2;", "Lcom/kubi/assets/dialog/payment/AssetPaymentListItem;", "", "", "<init>", "(Lcom/kubi/assets/dialog/payment/AssetPaymentListGroup;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "getGroupItem", "()Lcom/kubi/assets/dialog/payment/AssetPaymentListGroup;", "getTradeType", "()Ljava/lang/String;", "getItemClick", "()Lkotlin/jvm/functions/Function2;", "bind", "parentHelper", "Lio/chad/library/adapter/base/BaseViewHolder;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class MergeGroupItem {

    /* JADX INFO: renamed from: a, reason: from toString */
    @NotNull
    public final AssetPaymentListGroup groupItem;

    /* JADX INFO: renamed from: b, reason: from toString */
    @Nullable
    public final String tradeType;

    /* JADX INFO: renamed from: c, reason: from toString */
    @Nullable
    public final Function2<AssetPaymentListItem, Boolean, Unit> itemClick;

    /* JADX INFO: renamed from: com.kubi.assets.dialog.payment.n$a */
    /* JADX INFO: compiled from: AssetMultiPaymentContentAdapter.kt */
    @Metadata(m90083d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, m90084d2 = {"com/kubi/assets/dialog/payment/MergeGroupItem$bind$1$1", "Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;", "getSpanSize", "", ViewProps.POSITION, "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a extends GridLayoutManager.SpanSizeLookup {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List<AssetPaymentListItem> f17191a;

        public a(List<AssetPaymentListItem> list) {
            this.f17191a = list;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        public int getSpanSize(int position) {
            String displayType = this.f17191a.get(position).getDisplayType();
            return (!Intrinsics.areEqual(displayType, "L") && Intrinsics.areEqual(displayType, "M")) ? 1 : 2;
        }
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MergeGroupItem)) {
            return false;
        }
        MergeGroupItem mergeGroupItem = (MergeGroupItem) other;
        return Intrinsics.areEqual(this.groupItem, mergeGroupItem.groupItem) && Intrinsics.areEqual(this.tradeType, mergeGroupItem.tradeType) && Intrinsics.areEqual(this.itemClick, mergeGroupItem.itemClick);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MergeGroupItem(@NotNull AssetPaymentListGroup groupItem, @Nullable String str, @Nullable Function2<? super AssetPaymentListItem, ? super Boolean, Unit> function2) {
        Intrinsics.checkNotNullParameter(groupItem, "groupItem");
        this.groupItem = groupItem;
        this.tradeType = str;
        this.itemClick = function2;
    }

    /* JADX INFO: renamed from: a */
    public final void m16379a(@NotNull BaseViewHolder parentHelper) {
        Intrinsics.checkNotNullParameter(parentHelper, "parentHelper");
        int i11 = R$id.tvSubTitle;
        View view = parentHelper.getView(i11);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        String paymentGroup = this.groupItem.getPaymentGroup();
        AssetExKt.m15138z(view, !(paymentGroup == null || paymentGroup.length() == 0));
        parentHelper.setText(i11, C27041f.m66668h(this.groupItem.getPaymentGroup()));
        RecyclerView recyclerView = (RecyclerView) parentHelper.getView(R$id.recyclerView);
        List<AssetPaymentListItem> paymentMethodList = this.groupItem.getPaymentMethodList();
        if (paymentMethodList == null) {
            Intrinsics.checkNotNull(recyclerView);
            ViewExtKt.m66577h(recyclerView);
            return;
        }
        recyclerView.addItemDecoration(new HalfColumnSpacingDecoration(C27040e.m66658b(16)));
        GridLayoutManager gridLayoutManager = new GridLayoutManager(recyclerView.getContext(), 2);
        recyclerView.setLayoutManager(gridLayoutManager);
        gridLayoutManager.setSpanSizeLookup(new a(paymentMethodList));
        recyclerView.setAdapter(new AssetGroupItemAdapter(paymentMethodList, this.tradeType, this.itemClick));
    }

    public int hashCode() {
        int iHashCode = this.groupItem.hashCode() * 31;
        String str = this.tradeType;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Function2<AssetPaymentListItem, Boolean, Unit> function2 = this.itemClick;
        return iHashCode2 + (function2 != null ? function2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MergeGroupItem(groupItem=" + this.groupItem + ", tradeType=" + this.tradeType + ", itemClick=" + this.itemClick + ')';
    }
}
