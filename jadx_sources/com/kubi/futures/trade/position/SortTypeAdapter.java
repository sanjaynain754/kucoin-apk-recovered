package com.kubi.futures.trade.position;

import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.futures.trade.position.data.PositionSortOrder;
import com.kubi.kumex.R$color;
import com.kubi.kumex.R$id;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.R$mipmap;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.bugly.proguard.C33954u6;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p640ti.PositionSortType;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.futures.trade.position.n4, reason: from Kotlin metadata */
/* JADX INFO: compiled from: PositionSortDialog.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dBM\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\tJ\u000e\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\tJ\u0016\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\tJ\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0007H\u0016J\b\u0010\u0019\u001a\u00020\u0007H\u0016J\u0018\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0007H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/futures/trade/position/SortTypeAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/kubi/futures/trade/position/SortTypeAdapter$SortViewHolder;", "list", "", "Lcom/kubi/futures/trade/position/data/PositionSortType;", "selectedPos", "", "currentSortOrder", "Lcom/kubi/futures/trade/position/data/PositionSortOrder;", "onOrderClick", "Lkotlin/Function1;", "", "onItemClick", "<init>", "(Ljava/util/List;ILcom/kubi/futures/trade/position/data/PositionSortOrder;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "updateAll", "newSelected", "newOrder", "updateOrder", "updateSelection", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "getItemCount", "onBindViewHolder", C33954u6.f72238i, ViewProps.POSITION, "SortViewHolder", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class SortTypeAdapter extends RecyclerView.Adapter<a> {

    /* JADX INFO: renamed from: i */
    @NotNull
    public final List<PositionSortType> f24223i;

    /* JADX INFO: renamed from: j */
    public int f24224j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public PositionSortOrder f24225k;

    /* JADX INFO: renamed from: l */
    @NotNull
    public final Function1<Integer, Unit> f24226l;

    /* JADX INFO: renamed from: m */
    @NotNull
    public final Function1<Integer, Unit> f24227m;

    /* JADX INFO: renamed from: com.kubi.futures.trade.position.n4$a */
    /* JADX INFO: compiled from: PositionSortDialog.kt */
    @Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J:\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/futures/trade/position/SortTypeAdapter$SortViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "bind", "", "item", "Lcom/kubi/futures/trade/position/data/PositionSortType;", "selected", "", "order", "Lcom/kubi/futures/trade/position/data/PositionSortOrder;", "onOrderClick", "Lkotlin/Function0;", "onItemClick", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a extends RecyclerView.ViewHolder {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
        }

        /* JADX INFO: renamed from: g */
        public static final void m27765g(boolean z11, Function0 function0, Function0 function1, View view) {
            if (z11) {
                function0.invoke();
            } else {
                function1.invoke();
            }
        }

        /* JADX INFO: renamed from: d */
        public final void m27766d(@NotNull PositionSortType item, final boolean z11, @NotNull PositionSortOrder order, @NotNull final Function0<Unit> onOrderClick, @NotNull final Function0<Unit> onItemClick) {
            Intrinsics.checkNotNullParameter(item, "item");
            Intrinsics.checkNotNullParameter(order, "order");
            Intrinsics.checkNotNullParameter(onOrderClick, "onOrderClick");
            Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
            AppCompatTextView appCompatTextView = (AppCompatTextView) this.itemView.findViewById(R$id.text);
            ImageView imageView = (ImageView) this.itemView.findViewById(R$id.image);
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) this.itemView.findViewById(R$id.orderText);
            appCompatTextView.setText(item.getName());
            this.itemView.setSelected(z11);
            this.itemView.setBackgroundColor(z11 ? ContextCompat.getColor(C27017c.f54310a.m66513b(), R$color.c_cover4) : ContextCompat.getColor(C27017c.f54310a.m66513b(), R$color.c_transparent));
            if (item.getHasOrder()) {
                imageView.setVisibility(0);
                imageView.setImageResource(order == PositionSortOrder.ASC ? R$mipmap.bkumex_sort_up : R$mipmap.bkumex_sort_down);
                imageView.setColorFilter(z11 ? ContextCompat.getColor(C27017c.f54310a.m66513b(), R$color.primary) : ContextCompat.getColor(C27017c.f54310a.m66513b(), R$color.c_icon), PorterDuff.Mode.SRC_IN);
                Intrinsics.checkNotNull(imageView);
                C27046k.m66711z(imageView, 0L, new Function0() { // from class: com.kubi.futures.trade.position.k4
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SortTypeAdapter.a.m27763e(onOrderClick);
                    }
                }, 1, null);
                appCompatTextView2.setVisibility(z11 ? 0 : 8);
                appCompatTextView2.setText(z11 ? item.m99589e().invoke(order) : "");
                appCompatTextView2.setTextColor(this.itemView.getContext().getColor(R$color.brandGreen));
                Intrinsics.checkNotNull(appCompatTextView2);
                if (ViewExtKt.m66581l(appCompatTextView2)) {
                    C27046k.m66711z(appCompatTextView2, 0L, new Function0() { // from class: com.kubi.futures.trade.position.l4
                        @Override // p852kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SortTypeAdapter.a.m27764f(onOrderClick);
                        }
                    }, 1, null);
                }
            } else {
                if (z11) {
                    imageView.setVisibility(0);
                    imageView.setImageResource(R$mipmap.kucoin_ic_checked);
                    imageView.setColorFilter(ContextCompat.getColor(C27017c.f54310a.m66513b(), R$color.primary), PorterDuff.Mode.SRC_IN);
                } else {
                    imageView.setVisibility(8);
                }
                appCompatTextView2.setVisibility(8);
            }
            this.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.kubi.futures.trade.position.m4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SortTypeAdapter.a.m27765g(z11, onOrderClick, onItemClick, view);
                }
            });
        }

        /* JADX INFO: renamed from: e */
        public static final Unit m27763e(Function0 function0) {
            function0.invoke();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: f */
        public static final Unit m27764f(Function0 function0) {
            function0.invoke();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SortTypeAdapter(@NotNull List<PositionSortType> list, int i11, @NotNull PositionSortOrder currentSortOrder, @NotNull Function1<? super Integer, Unit> onOrderClick, @NotNull Function1<? super Integer, Unit> onItemClick) {
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(currentSortOrder, "currentSortOrder");
        Intrinsics.checkNotNullParameter(onOrderClick, "onOrderClick");
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        this.f24223i = list;
        this.f24224j = i11;
        this.f24225k = currentSortOrder;
        this.f24226l = onOrderClick;
        this.f24227m = onItemClick;
    }

    /* JADX INFO: renamed from: j */
    public static final Unit m27753j(SortTypeAdapter sortTypeAdapter, int i11) {
        sortTypeAdapter.f24226l.invoke(Integer.valueOf(i11));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public static final Unit m27754k(SortTypeAdapter sortTypeAdapter, int i11) {
        sortTypeAdapter.f24227m.invoke(Integer.valueOf(i11));
        return Unit.INSTANCE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f24223i.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull a holder, final int i11) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        PositionSortType positionSortType = this.f24223i.get(i11);
        boolean z11 = i11 == this.f24224j;
        holder.m27766d(positionSortType, z11, z11 ? this.f24225k : positionSortType.getDefaultOrder(), new Function0() { // from class: com.kubi.futures.trade.position.i4
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SortTypeAdapter.m27753j(this.f24192b, i11);
            }
        }, new Function0() { // from class: com.kubi.futures.trade.position.j4
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SortTypeAdapter.m27754k(this.f24197b, i11);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(@NotNull ViewGroup parent, int i11) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R$layout.bkumex_item_position_change_sort_type, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new a(viewInflate);
    }

    /* JADX INFO: renamed from: m */
    public final void m27757m(int i11, @NotNull PositionSortOrder newOrder) {
        Intrinsics.checkNotNullParameter(newOrder, "newOrder");
        this.f24224j = i11;
        this.f24225k = newOrder;
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: n */
    public final void m27758n(@NotNull PositionSortOrder newOrder) {
        Intrinsics.checkNotNullParameter(newOrder, "newOrder");
        this.f24225k = newOrder;
        notifyItemChanged(this.f24224j);
    }

    /* JADX INFO: renamed from: o */
    public final void m27759o(int i11, @NotNull PositionSortOrder newOrder) {
        Intrinsics.checkNotNullParameter(newOrder, "newOrder");
        int i12 = this.f24224j;
        this.f24224j = i11;
        this.f24225k = newOrder;
        notifyItemChanged(i12);
        notifyItemChanged(this.f24224j);
    }
}
