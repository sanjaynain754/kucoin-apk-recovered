package com.kubi.tradebase.tradetype;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.tradebase.R$color;
import com.kubi.tradebase.R$drawable;
import com.kubi.tradebase.R$string;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.bugly.proguard.C33954u6;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import n30.C42734j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.tradebase.tradetype.l, reason: from Kotlin metadata */
/* JADX INFO: compiled from: TradeTypeSelectedAdapter.kt */
/* JADX INFO: loaded from: classes48.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u001d\u001eB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J0\u0010\u0010\u001a\u00020\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00122\u0006\u0010\u0013\u001a\u00020\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\nJ\u001c\u0010\u0014\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u001c\u0010\u0019\u001a\u00020\u000b2\n\u0010\u001a\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0018H\u0016J\b\u0010\u001c\u001a\u00020\u0018H\u0016R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/tradebase/tradetype/TradeTypeSelectedAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/kubi/tradebase/tradetype/TradeTypeSelectedAdapter$ViewHolder;", "<init>", "()V", "tradeTypeCollector", "", "Lcom/kubi/tradebase/tradetype/TradeType;", "Lcom/kubi/tradebase/tradetype/TradeTypeSelectedAdapter$TradeTypeData;", "onSelectedChange", "Lkotlin/Function1;", "", "selectedType", "displaySelectedTypeList", "", "Lcom/kubi/tradebase/tradetype/TradeTypeItem;", "setData", "data", "", "selected", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", C33954u6.f72238i, ViewProps.POSITION, "getItemCount", "ViewHolder", "TradeTypeData", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class TradeTypeSelectedAdapter extends RecyclerView.Adapter<b> {

    /* JADX INFO: renamed from: i */
    @NotNull
    public final Map<TradeType, TradeTypeData> f51664i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public Function1<? super TradeType, Unit> f51665j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public TradeType f51666k;

    /* JADX INFO: renamed from: l */
    @NotNull
    public final List<TradeTypeItem> f51667l;

    /* JADX INFO: renamed from: com.kubi.tradebase.tradetype.l$a, reason: from toString */
    /* JADX INFO: compiled from: TradeTypeSelectedAdapter.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/tradebase/tradetype/TradeTypeSelectedAdapter$TradeTypeData;", "", "typeNameRes", "", "typeDescriptorRes", "typeIconRes", "<init>", "(III)V", "getTypeNameRes", "()I", "getTypeDescriptorRes", "getTypeIconRes", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class TradeTypeData {

        /* JADX INFO: renamed from: a, reason: from toString */
        public final int typeNameRes;

        /* JADX INFO: renamed from: b, reason: from toString */
        public final int typeDescriptorRes;

        /* JADX INFO: renamed from: c, reason: from toString */
        public final int typeIconRes;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TradeTypeData)) {
                return false;
            }
            TradeTypeData tradeTypeData = (TradeTypeData) other;
            return this.typeNameRes == tradeTypeData.typeNameRes && this.typeDescriptorRes == tradeTypeData.typeDescriptorRes && this.typeIconRes == tradeTypeData.typeIconRes;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getTypeDescriptorRes() {
            return this.typeDescriptorRes;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getTypeIconRes() {
            return this.typeIconRes;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getTypeNameRes() {
            return this.typeNameRes;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.typeNameRes) * 31) + Integer.hashCode(this.typeDescriptorRes)) * 31) + Integer.hashCode(this.typeIconRes);
        }

        @NotNull
        public String toString() {
            return "TradeTypeData(typeNameRes=" + this.typeNameRes + ", typeDescriptorRes=" + this.typeDescriptorRes + ", typeIconRes=" + this.typeIconRes + ')';
        }

        public TradeTypeData(int i11, int i12, int i13) {
            this.typeNameRes = i11;
            this.typeDescriptorRes = i12;
            this.typeIconRes = i13;
        }
    }

    /* JADX INFO: renamed from: com.kubi.tradebase.tradetype.l$b */
    /* JADX INFO: compiled from: TradeTypeSelectedAdapter.kt */
    @Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J4\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u000fJ\u0014\u0010\u0010\u001a\u00020\u0007*\u00020\u00112\u0006\u0010\f\u001a\u00020\rH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/tradebase/tradetype/TradeTypeSelectedAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "viewBinding", "Lcom/kubi/tradebase/databinding/BtradebaseTradetypeSelectedItemBinding;", "<init>", "(Lcom/kubi/tradebase/tradetype/TradeTypeSelectedAdapter;Lcom/kubi/tradebase/databinding/BtradebaseTradetypeSelectedItemBinding;)V", "bindItem", "", "type", "Lcom/kubi/tradebase/tradetype/TradeType;", "groupHeaderText", "", "isSelected", "", "onSelectedChange", "Lkotlin/Function1;", "wrapperCheckboxTintColor", "Landroid/widget/CheckBox;", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public final class b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: g */
        @NotNull
        public final C42734j f51671g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ TradeTypeSelectedAdapter f51672h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull TradeTypeSelectedAdapter tradeTypeSelectedAdapter, C42734j viewBinding) {
            super(viewBinding.getRoot());
            Intrinsics.checkNotNullParameter(viewBinding, "viewBinding");
            this.f51672h = tradeTypeSelectedAdapter;
            this.f51671g = viewBinding;
        }

        /* JADX INFO: renamed from: c */
        public static final Unit m63399c(Function1 function1, TradeType tradeType, View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            function1.invoke(tradeType);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: b */
        public final void m63400b(@NotNull final TradeType type, @Nullable String str, boolean z11, @NotNull final Function1<? super TradeType, Unit> onSelectedChange) {
            int iM66699n;
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(onSelectedChange, "onSelectedChange");
            TradeTypeData tradeTypeData = (TradeTypeData) this.f51672h.f51664i.get(type);
            if (tradeTypeData != null) {
                this.f51671g.f94640g.setText(tradeTypeData.getTypeNameRes());
                this.f51671g.f94639f.setText(tradeTypeData.getTypeDescriptorRes());
                this.f51671g.f94637d.setImageResource(tradeTypeData.getTypeIconRes());
                this.f51671g.f94635b.setChecked(z11);
                AppCompatCheckBox cbSelect = this.f51671g.f94635b;
                Intrinsics.checkNotNullExpressionValue(cbSelect, "cbSelect");
                m63401d(cbSelect, z11);
                this.f51671g.f94635b.setVisibility(z11 ? 0 : 8);
                Context context = this.f51671g.getRoot().getContext();
                if (z11) {
                    Intrinsics.checkNotNull(context);
                    iM66699n = C27046k.m66699n(context, R$color.c_cover2);
                } else {
                    Intrinsics.checkNotNull(context);
                    iM66699n = C27046k.m66699n(context, R$color.c_transparent);
                }
                this.f51671g.f94638e.setBackgroundColor(iM66699n);
                ConstraintLayout llItemView = this.f51671g.f94638e;
                Intrinsics.checkNotNullExpressionValue(llItemView, "llItemView");
                ViewExtKt.m66575f(llItemView, new Function1() { // from class: com.kubi.tradebase.tradetype.m
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return TradeTypeSelectedAdapter.b.m63399c(onSelectedChange, type, (View) obj);
                    }
                });
                if (str == null || str.length() == 0) {
                    this.f51671g.f94636c.setVisibility(8);
                } else {
                    this.f51671g.f94636c.setVisibility(0);
                    this.f51671g.f94636c.setText(str);
                }
            }
        }

        /* JADX INFO: renamed from: d */
        public final void m63401d(CheckBox checkBox, boolean z11) {
            Drawable drawable;
            Drawable drawableMutate;
            if (!z11 || (drawable = AppCompatResources.getDrawable(checkBox.getContext(), R$drawable.ui_selector_checkbox_20)) == null || (drawableMutate = drawable.mutate()) == null) {
                return;
            }
            DrawableCompat.setTintList(drawableMutate, ContextCompat.getColorStateList(checkBox.getContext(), R$color.c_text));
            checkBox.setButtonDrawable(drawableMutate);
        }
    }

    public TradeTypeSelectedAdapter() {
        Pair pairM90091to = TuplesKt.m90091to(TradeType.LIMIT, new TradeTypeData(R$string.limit_price_trade, R$string.kc_limit_price_order_desc, R$drawable.trade_type_limit));
        Pair pairM90091to2 = TuplesKt.m90091to(TradeType.MARKET, new TradeTypeData(R$string.market_price_trade, R$string.kc_market_price_order_desc, R$drawable.trade_type_market));
        Pair pairM90091to3 = TuplesKt.m90091to(TradeType.ADVANCED_LIMIT, new TradeTypeData(R$string.kc_advanced_limit_order, R$string.kc_ad_limit_price_order_desc, R$drawable.trade_type_advanced_limit));
        TradeType tradeType = TradeType.CONDITIONAL;
        int i11 = R$string.kumex_order_conditional;
        int i12 = R$string.kc_kumex_order_conditional_desc;
        int i13 = R$drawable.trade_type_stop_limit;
        Pair pairM90091to4 = TuplesKt.m90091to(tradeType, new TradeTypeData(i11, i12, i13));
        Pair pairM90091to5 = TuplesKt.m90091to(TradeType.LIMIT_STOP, new TradeTypeData(R$string.limit_price_stop, R$string.kc_limit_stop_price_order_desc, i13));
        Pair pairM90091to6 = TuplesKt.m90091to(TradeType.MARKET_STOP, new TradeTypeData(R$string.market_price_stop, R$string.kc_market_stop_price_order_desc, R$drawable.trade_type_stop_market));
        Pair pairM90091to7 = TuplesKt.m90091to(TradeType.OCO, new TradeTypeData(R$string.oco_order, R$string.kc_coc_order_desc, R$drawable.trade_type_oco));
        TradeType tradeType2 = TradeType.SEGMENT;
        int i14 = R$string.kemex_segment_delegation;
        int i15 = R$string.kemex_segment_delegation_desc;
        int i16 = R$drawable.trade_type_segment;
        this.f51664i = MapsKt.mapOf(pairM90091to, pairM90091to2, pairM90091to3, pairM90091to4, pairM90091to5, pairM90091to6, pairM90091to7, TuplesKt.m90091to(tradeType2, new TradeTypeData(i14, i15, i16)), TuplesKt.m90091to(TradeType.HIDDEN, new TradeTypeData(R$string.kumex_order_hidden, R$string.kc_kumex_order_hidden_desc, R$drawable.trade_type_hidden)), TuplesKt.m90091to(TradeType.TSO, new TradeTypeData(R$string.kc_spot_trailing_stop, R$string.kc_tso_order_desc, R$drawable.trade_type_trailing_stop)), TuplesKt.m90091to(TradeType.TWAP, new TradeTypeData(R$string.kumex_order_twap, R$string.bkumex_twap_order_desc, R$drawable.trade_type_twap)), TuplesKt.m90091to(tradeType2, new TradeTypeData(i14, i15, i16)));
        this.f51667l = new ArrayList();
    }

    /* JADX INFO: renamed from: j */
    public static final Unit m63391j(TradeTypeSelectedAdapter tradeTypeSelectedAdapter, TradeType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        tradeTypeSelectedAdapter.f51666k = type;
        Function1<? super TradeType, Unit> function1 = tradeTypeSelectedAdapter.f51665j;
        if (function1 != null) {
            function1.invoke(type);
        }
        return Unit.INSTANCE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f51667l.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull b holder, int i11) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        TradeTypeItem tradeTypeItem = this.f51667l.get(i11);
        TradeType tradeTypeMapToTradeType = tradeTypeItem.mapToTradeType();
        holder.m63400b(tradeTypeMapToTradeType, tradeTypeItem.getGroupHeaderText(), tradeTypeMapToTradeType == this.f51666k, new Function1() { // from class: com.kubi.tradebase.tradetype.k
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradeTypeSelectedAdapter.m63391j(this.f51663b, (TradeType) obj);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(@NotNull ViewGroup parent, int i11) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        C42734j c42734jM93640c = C42734j.m93640c(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(c42734jM93640c, "inflate(...)");
        return new b(this, c42734jM93640c);
    }

    /* JADX INFO: renamed from: l */
    public final void m63394l(@NotNull List<TradeTypeItem> data, @NotNull TradeType selected, @NotNull Function1<? super TradeType, Unit> onSelectedChange) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(selected, "selected");
        Intrinsics.checkNotNullParameter(onSelectedChange, "onSelectedChange");
        this.f51667l.clear();
        this.f51667l.addAll(data);
        this.f51666k = selected;
        this.f51665j = onSelectedChange;
    }
}
