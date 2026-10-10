package com.kubi.kumex.market.tradingArea;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.C5303w0;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.kumex.R$color;
import com.kubi.kumex.R$drawable;
import com.kubi.kumex.R$font;
import com.kubi.kumex.data.market.model.AvailableTradeAreaEntity;
import com.kubi.kumex.data.market.model.QuotesSectionEntity;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.C27029c;
import com.tencent.bugly.proguard.C33954u6;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.kumex.market.tradingArea.h, reason: from Kotlin metadata */
/* JADX INFO: compiled from: ChildSection.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0003\u0017\u0018\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005J \u0010\u000e\u001a\u00020\u00002\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0007J\u0016\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tJ\u001e\u0010\u0010\u001a\u00020\u00002\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\b\u0002\u0010\u0014\u001a\u00020\tJ\u0014\u0010\u0010\u001a\u00020\u00002\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00150\u0012J\u0010\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/kumex/market/tradingArea/ChildSection;", "", "<init>", "()V", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "itemClick", "Lkotlin/Function2;", "", "", "", ViewProps.MARGIN_TOP, ViewProps.MARGIN_BOTTOM, "setWidget", "setItemOnClickListener", "setVerticalMargin", "notifyDataChanged", "list", "", "Lcom/kubi/kumex/data/market/model/AvailableTradeAreaEntity;", "selectIndex", "Lcom/kubi/kumex/data/market/model/QuotesSectionEntity;", "setAdapter", "SectionAdapter", "SectionViewHolder", "SectionItemDecoration", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nChildSection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChildSection.kt\ncom/kubi/kumex/market/tradingArea/ChildSection\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,177:1\n1573#2:178\n1604#2,4:179\n*S KotlinDebug\n*F\n+ 1 ChildSection.kt\ncom/kubi/kumex/market/tradingArea/ChildSection\n*L\n55#1:178\n55#1:179,4\n*E\n"})
public final class ChildSection {

    /* JADX INFO: renamed from: a */
    @Nullable
    public RecyclerView f29567a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public Function2<? super String, ? super Integer, Unit> f29568b;

    /* JADX INFO: renamed from: c */
    public int f29569c;

    /* JADX INFO: renamed from: d */
    public int f29570d;

    /* JADX INFO: renamed from: com.kubi.kumex.market.tradingArea.h$a */
    /* JADX INFO: compiled from: ChildSection.kt */
    @Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0006H\u0016J\u0018\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0006H\u0016J\b\u0010\u0017\u001a\u00020\u0006H\u0016J\u0014\u0010\u0018\u001a\u00020\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001aR%\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/kumex/market/tradingArea/ChildSection$SectionAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/kubi/kumex/market/tradingArea/ChildSection$SectionViewHolder;", "onItemClick", "Lkotlin/Function2;", "", "", "", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "getOnItemClick", "()Lkotlin/jvm/functions/Function2;", "list", "Ljava/util/ArrayList;", "Lcom/kubi/kumex/data/market/model/QuotesSectionEntity;", "Lkotlin/collections/ArrayList;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onBindViewHolder", C33954u6.f72238i, ViewProps.POSITION, "getItemCount", "notifyData", "data", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nChildSection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChildSection.kt\ncom/kubi/kumex/market/tradingArea/ChildSection$SectionAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,177:1\n1878#2,3:178\n*S KotlinDebug\n*F\n+ 1 ChildSection.kt\ncom/kubi/kumex/market/tradingArea/ChildSection$SectionAdapter\n*L\n111#1:178,3\n*E\n"})
    public static final class a extends RecyclerView.Adapter<c> {

        /* JADX INFO: renamed from: i */
        @Nullable
        public final Function2<String, Integer, Unit> f29571i;

        /* JADX INFO: renamed from: j */
        @NotNull
        public final ArrayList<QuotesSectionEntity> f29572j = new ArrayList<>();

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f29572j.size();
        }

        /* JADX INFO: renamed from: h */
        public final void m34624h(@NotNull List<QuotesSectionEntity> data) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.f29572j.clear();
            this.f29572j.addAll(data);
            notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull c holder, int i11) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            if (i11 < 0) {
                return;
            }
            QuotesSectionEntity quotesSectionEntity = this.f29572j.get(i11);
            Intrinsics.checkNotNullExpressionValue(quotesSectionEntity, "get(...)");
            QuotesSectionEntity quotesSectionEntity2 = quotesSectionEntity;
            View view = holder.itemView;
            TextView textView = view instanceof TextView ? (TextView) view : null;
            if (textView != null) {
                textView.setText(quotesSectionEntity2.getF28821b());
                if (quotesSectionEntity2.getF28820a()) {
                    textView.setTextColor(C27017c.f54310a.m66512a(R$color.c_text));
                    textView.setBackgroundResource(R$drawable.shape_emphasis4_4r);
                } else {
                    textView.setTextColor(C27017c.f54310a.m66512a(R$color.c_text40));
                    textView.setBackgroundResource(0);
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public c onCreateViewHolder(@NotNull ViewGroup parent, int i11) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            TextView textView = new TextView(parent.getContext());
            textView.setHeight(C27029c.m66601d(textView, 24));
            textView.setTypeface(ResourcesCompat.getFont(textView.getContext(), R$font.regular));
            textView.setBackgroundResource(R$drawable.shape_emphasis4_4r);
            textView.setGravity(17);
            textView.setPaddingRelative(C27029c.m66601d(textView, 10), 0, C27029c.m66601d(textView, 10), 0);
            textView.setTextSize(12.0f);
            final c cVar = new c(textView);
            C27046k.m66711z(textView, 0L, new Function0() { // from class: com.kubi.kumex.market.tradingArea.g
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ChildSection.a.m34623k(cVar, this);
                }
            }, 1, null);
            return cVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(@Nullable Function2<? super String, ? super Integer, Unit> function2) {
            this.f29571i = function2;
        }

        /* JADX INFO: renamed from: k */
        public static final Unit m34623k(c cVar, a aVar) {
            boolean z11;
            int bindingAdapterPosition = cVar.getBindingAdapterPosition();
            if (bindingAdapterPosition < 0) {
                return Unit.INSTANCE;
            }
            int i11 = 0;
            for (Object obj : aVar.f29572j) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                QuotesSectionEntity quotesSectionEntity = (QuotesSectionEntity) obj;
                if (i11 == bindingAdapterPosition) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                quotesSectionEntity.m33378d(z11);
                i11 = i12;
            }
            aVar.notifyDataSetChanged();
            Function2<String, Integer, Unit> function2 = aVar.f29571i;
            if (function2 != null) {
                function2.invoke(aVar.f29572j.get(bindingAdapterPosition).getF28822c(), Integer.valueOf(bindingAdapterPosition));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.kumex.market.tradingArea.h$b */
    /* JADX INFO: compiled from: ChildSection.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/kumex/market/tradingArea/ChildSection$SectionItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", ViewProps.MARGIN_TOP, "", ViewProps.MARGIN_BOTTOM, "<init>", "(II)V", "getMarginTop", "()I", "getMarginBottom", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", "itemPosition", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class b extends RecyclerView.ItemDecoration {

        /* JADX INFO: renamed from: d */
        public final int f29573d;

        /* JADX INFO: renamed from: e */
        public final int f29574e;

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(@NotNull Rect outRect, int itemPosition, @NotNull RecyclerView parent) {
            float fM66565c;
            int iM66565c;
            Intrinsics.checkNotNullParameter(outRect, "outRect");
            Intrinsics.checkNotNullParameter(parent, "parent");
            if (itemPosition < 0) {
                return;
            }
            RecyclerView.Adapter adapter = parent.getAdapter();
            int iM66650j = C27039d.m66650j(adapter != null ? Integer.valueOf(adapter.getItemCount()) : null);
            if (iM66650j <= 0) {
                return;
            }
            if (itemPosition == 0) {
                Context context = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                fM66565c = C27025c.m66565c(context, 16);
            } else {
                Context context2 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                fM66565c = C27025c.m66565c(context2, 4);
            }
            int i11 = (int) fM66565c;
            if (itemPosition == iM66650j - 1) {
                Context context3 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                iM66565c = (int) C27025c.m66565c(context3, 16);
            } else {
                iM66565c = 0;
            }
            int i12 = !C5303w0.m6511a() ? i11 : iM66565c;
            int i13 = this.f29573d;
            if (!C5303w0.m6511a()) {
                i11 = iM66565c;
            }
            outRect.set(i12, i13, i11, this.f29574e);
        }

        public b(int i11, int i12) {
            this.f29573d = i11;
            this.f29574e = i12;
        }
    }

    /* JADX INFO: renamed from: com.kubi.kumex.market.tradingArea.h$c */
    /* JADX INFO: compiled from: ChildSection.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/kumex/market/tradingArea/ChildSection$SectionViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/widget/TextView;", "<init>", "(Landroid/widget/TextView;)V", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class c extends RecyclerView.ViewHolder {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@NotNull TextView view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final ChildSection m34616a(@NotNull List<QuotesSectionEntity> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        RecyclerView recyclerView = this.f29567a;
        if (recyclerView == null) {
            return this;
        }
        C27046k.m66684G(recyclerView, !list.isEmpty());
        if (recyclerView.getAdapter() == null) {
            m34618c(recyclerView);
        }
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type com.kubi.kumex.market.tradingArea.ChildSection.SectionAdapter");
        ((a) adapter).m34624h(list);
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final ChildSection m34617b(@NotNull List<AvailableTradeAreaEntity> list, int i11) {
        Intrinsics.checkNotNullParameter(list, "list");
        RecyclerView recyclerView = this.f29567a;
        if (recyclerView == null) {
            return this;
        }
        C27046k.m66684G(recyclerView, !list.isEmpty());
        ArrayList arrayList = new ArrayList();
        if (i11 < 0) {
            i11 = 0;
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        int i12 = 0;
        for (Object obj : list) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            AvailableTradeAreaEntity availableTradeAreaEntity = (AvailableTradeAreaEntity) obj;
            arrayList2.add(Boolean.valueOf(arrayList.add(new QuotesSectionEntity(i12 == i11, C27041f.m66668h(availableTradeAreaEntity.getDisplayName()), C27041f.m66668h(availableTradeAreaEntity.getId())))));
            i12 = i13;
        }
        if (recyclerView.getAdapter() == null) {
            m34618c(recyclerView);
        }
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type com.kubi.kumex.market.tradingArea.ChildSection.SectionAdapter");
        ((a) adapter).m34624h(arrayList);
        return this;
    }

    /* JADX INFO: renamed from: c */
    public final void m34618c(RecyclerView recyclerView) {
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        recyclerView.addItemDecoration(new b(this.f29569c, this.f29570d));
        recyclerView.setAdapter(new a(this.f29568b));
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final ChildSection m34619d(@NotNull Function2<? super String, ? super Integer, Unit> itemClick) {
        Intrinsics.checkNotNullParameter(itemClick, "itemClick");
        this.f29568b = itemClick;
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final ChildSection m34620e(int i11, int i12) {
        this.f29569c = i11;
        this.f29570d = i12;
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final ChildSection m34621f(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.f29567a = recyclerView;
        return this;
    }
}
