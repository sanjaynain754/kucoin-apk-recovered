package com.kubi.margin.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.margin.R$dimen;
import com.kubi.margin.view.TradeSettingOptionGroupView;
import com.kubi.margin.view.TradeSettingOptionItemView;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: TradeSettingOptionGroupView.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0002\"#B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014J(\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u000e\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u000eJ\u0018\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u00072\b\b\u0002\u0010!\u001a\u00020\u001cR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, m90084d2 = {"Lcom/kubi/margin/view/TradeSettingOptionGroupView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", FirebaseAnalytics.Param.ITEMS, "", "Lcom/kubi/margin/view/TradeSettingOptionItemView;", "onItemSelectedListener", "Lcom/kubi/margin/view/TradeSettingOptionGroupView$OnItemSelectedListener;", "maxItems", "itemWidth", "setItems", "", "itemConfigs", "", "Lcom/kubi/margin/view/TradeSettingOptionGroupView$ItemConfig;", "addItem", "id", "imageResId", "text", "", ViewProps.VISIBLE, "", "setOnItemSelectedListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "selectItem", "itemId", "needCallback", "ItemConfig", "OnItemSelectedListener", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTradeSettingOptionGroupView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradeSettingOptionGroupView.kt\ncom/kubi/margin/view/TradeSettingOptionGroupView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,122:1\n1869#2,2:123\n1869#2,2:125\n1869#2,2:128\n1#3:127\n*S KotlinDebug\n*F\n+ 1 TradeSettingOptionGroupView.kt\ncom/kubi/margin/view/TradeSettingOptionGroupView\n*L\n38#1:123,2\n101#1:125,2\n66#1:128,2\n*E\n"})
public final class TradeSettingOptionGroupView extends LinearLayout {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final List<TradeSettingOptionItemView> f34260b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public InterfaceC18595b f34261c;

    /* JADX INFO: renamed from: d */
    public final int f34262d;

    /* JADX INFO: renamed from: e */
    public final int f34263e;

    /* JADX INFO: renamed from: com.kubi.margin.view.TradeSettingOptionGroupView$a, reason: from toString */
    /* JADX INFO: compiled from: TradeSettingOptionGroupView.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/margin/view/TradeSettingOptionGroupView$ItemConfig;", "", "id", "", "imageResId", "text", "", "<init>", "(IILjava/lang/String;)V", "getId", "()I", "getImageResId", "getText", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class ItemConfig {

        /* JADX INFO: renamed from: a, reason: from toString */
        public final int id;

        /* JADX INFO: renamed from: b, reason: from toString */
        public final int imageResId;

        /* JADX INFO: renamed from: c, reason: from toString */
        @NotNull
        public final String text;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ItemConfig)) {
                return false;
            }
            ItemConfig itemConfig = (ItemConfig) other;
            return this.id == itemConfig.id && this.imageResId == itemConfig.imageResId && Intrinsics.areEqual(this.text, itemConfig.text);
        }

        public ItemConfig(int i11, int i12, @NotNull String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.id = i11;
            this.imageResId = i12;
            this.text = text;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getImageResId() {
            return this.imageResId;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.id) * 31) + Integer.hashCode(this.imageResId)) * 31) + this.text.hashCode();
        }

        @NotNull
        public String toString() {
            return "ItemConfig(id=" + this.id + ", imageResId=" + this.imageResId + ", text=" + this.text + ')';
        }
    }

    /* JADX INFO: renamed from: com.kubi.margin.view.TradeSettingOptionGroupView$b */
    /* JADX INFO: compiled from: TradeSettingOptionGroupView.kt */
    @Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/margin/view/TradeSettingOptionGroupView$OnItemSelectedListener;", "", "onItemSelected", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Lcom/kubi/margin/view/TradeSettingOptionItemView;", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public interface InterfaceC18595b {
        /* JADX INFO: renamed from: a */
        void mo39950a(@NotNull TradeSettingOptionItemView tradeSettingOptionItemView);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TradeSettingOptionGroupView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TradeSettingOptionGroupView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: c */
    public static final void m40711c(TradeSettingOptionGroupView tradeSettingOptionGroupView, TradeSettingOptionItemView selectedItem) {
        Intrinsics.checkNotNullParameter(selectedItem, "selectedItem");
        for (TradeSettingOptionItemView tradeSettingOptionItemView : tradeSettingOptionGroupView.f34260b) {
            tradeSettingOptionItemView.setSelected(tradeSettingOptionItemView.getF34268c() == selectedItem.getF34268c());
        }
        InterfaceC18595b interfaceC18595b = tradeSettingOptionGroupView.f34261c;
        if (interfaceC18595b != null) {
            interfaceC18595b.mo39950a(selectedItem);
        }
    }

    /* JADX INFO: renamed from: b */
    public final TradeSettingOptionItemView m40712b(int i11, int i12, String str, boolean z11) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TradeSettingOptionItemView tradeSettingOptionItemView = new TradeSettingOptionItemView(context, null, 0, 6, null);
        tradeSettingOptionItemView.setLayoutParams(new LinearLayout.LayoutParams(this.f34263e, -2));
        tradeSettingOptionItemView.setImageResource(i12);
        tradeSettingOptionItemView.setText(str);
        tradeSettingOptionItemView.setItemId(i11);
        tradeSettingOptionItemView.setOnItemSelectedListener(new TradeSettingOptionItemView.InterfaceC18596a() { // from class: xp.p
            @Override // com.kubi.margin.view.TradeSettingOptionItemView.InterfaceC18596a
            /* JADX INFO: renamed from: a */
            public final void mo40720a(TradeSettingOptionItemView tradeSettingOptionItemView2) {
                TradeSettingOptionGroupView.m40711c(this.f103900a, tradeSettingOptionItemView2);
            }
        });
        tradeSettingOptionItemView.setVisibility(z11 ? 0 : 4);
        this.f34260b.add(tradeSettingOptionItemView);
        addView(tradeSettingOptionItemView);
        if (this.f34260b.size() < this.f34262d) {
            View view = new View(getContext());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1);
            layoutParams.weight = 1.0f;
            view.setLayoutParams(layoutParams);
            addView(view);
        }
        return tradeSettingOptionItemView;
    }

    /* JADX INFO: renamed from: d */
    public final void m40713d(int i11, boolean z11) {
        Object next;
        InterfaceC18595b interfaceC18595b;
        for (TradeSettingOptionItemView tradeSettingOptionItemView : this.f34260b) {
            tradeSettingOptionItemView.setSelected(tradeSettingOptionItemView.getF34268c() == i11);
        }
        if (z11) {
            Iterator<T> it = this.f34260b.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((TradeSettingOptionItemView) next).getF34268c() != i11);
            TradeSettingOptionItemView tradeSettingOptionItemView2 = (TradeSettingOptionItemView) next;
            if (tradeSettingOptionItemView2 == null || (interfaceC18595b = this.f34261c) == null) {
                return;
            }
            interfaceC18595b.mo39950a(tradeSettingOptionItemView2);
        }
    }

    public final void setItems(@NotNull List<ItemConfig> itemConfigs) {
        Intrinsics.checkNotNullParameter(itemConfigs, "itemConfigs");
        removeAllViews();
        this.f34260b.clear();
        for (ItemConfig itemConfig : CollectionsKt.take(itemConfigs, this.f34262d)) {
            m40712b(itemConfig.getId(), itemConfig.getImageResId(), itemConfig.getText(), true);
        }
        int size = this.f34262d - itemConfigs.size();
        if (size > 0) {
            for (int i11 = 0; i11 < size; i11++) {
                ItemConfig itemConfig2 = (ItemConfig) CollectionsKt.firstOrNull((List) itemConfigs);
                m40712b(-1, itemConfig2 != null ? itemConfig2.getImageResId() : 0, "", false);
            }
        }
    }

    public final void setOnItemSelectedListener(@NotNull InterfaceC18595b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f34261c = listener;
    }

    public /* synthetic */ TradeSettingOptionGroupView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TradeSettingOptionGroupView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f34260b = new ArrayList();
        this.f34262d = 3;
        this.f34263e = getResources().getDimensionPixelSize(R$dimen.bmargin_kline_option_item_width);
        setOrientation(0);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
    }
}
