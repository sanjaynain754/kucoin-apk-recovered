package com.kubi.futures.trade.book;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.kubi.kumex.R$attr;
import com.kubi.kumex.R$color;
import com.kubi.kumex.R$drawable;
import com.kubi.kumex.utils.C17037c;
import com.kubi.resources.widget.OrderBookItemView;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.core.C27029c;
import com.tencent.bugly.proguard.C33954u6;
import com.tencent.qcloud.tuicore.TUIConstants;
import fm.C37569d;
import im.DisplayBookItem;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.futures.trade.book.b, reason: from Kotlin metadata */
/* JADX INFO: compiled from: BookAdapter.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u0011\u001a\u00020\u00102\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00100\u000eJ\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000fH\u0016J\u0018\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u000fH\u0016J\b\u0010\u001c\u001a\u00020\u000fH\u0016J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u000fH\u0016J\u000e\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u000fJ\u0014\u0010!\u001a\u00020\u00102\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000b0#R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\fX\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, m90084d2 = {"Lcom/kubi/futures/trade/book/BookAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/kubi/futures/trade/book/BookAdapter$ViewHolder;", "side", "", "<init>", "(Ljava/lang/String;)V", "getSide", "()Ljava/lang/String;", "datas", "Ljava/util/ArrayList;", "Lcom/kubi/kumex/logic/book/DisplayBookItem;", "Lkotlin/collections/ArrayList;", "mItemClickListener", "Lkotlin/Function2;", "", "", "setOnItemClickListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "mTextSize", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onBindViewHolder", C33954u6.f72238i, ViewProps.POSITION, "getItemCount", "getItemId", "", "setPrecision", "precision", "notifyDataChanged", "list", "", "ViewHolder", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class BookAdapter extends RecyclerView.Adapter<a> {

    /* JADX INFO: renamed from: i */
    @NotNull
    public final String f23679i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final ArrayList<DisplayBookItem> f23680j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public Function2<? super Integer, ? super DisplayBookItem, Unit> f23681k;

    /* JADX INFO: renamed from: l */
    public float f23682l;

    /* JADX INFO: renamed from: com.kubi.futures.trade.book.b$a */
    /* JADX INFO: compiled from: BookAdapter.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/futures/trade/book/BookAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a extends RecyclerView.ViewHolder {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int position) {
        return position;
    }

    public BookAdapter(@NotNull String side) {
        Intrinsics.checkNotNullParameter(side, "side");
        this.f23679i = side;
        this.f23680j = new ArrayList<>();
        setHasStableIds(true);
        this.f23682l = C27029c.m66599b(C27017c.f54310a.m66513b(), 12);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f23680j.size();
    }

    /* JADX INFO: renamed from: h */
    public final void m26926h(@NotNull List<DisplayBookItem> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.f23680j.clear();
        this.f23680j.addAll(list);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull a holder, int i11) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        DisplayBookItem displayBookItem = this.f23680j.get(i11);
        Intrinsics.checkNotNullExpressionValue(displayBookItem, "get(...)");
        DisplayBookItem displayBookItem2 = displayBookItem;
        View view = holder.itemView;
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.kubi.resources.widget.OrderBookItemView");
        OrderBookItemView orderBookItemView = (OrderBookItemView) view;
        orderBookItemView.setTextSize(this.f23682l);
        orderBookItemView.setOrderBookType(Intrinsics.areEqual(this.f23679i, "buy") ? 1 : 0);
        orderBookItemView.setDirection(0);
        orderBookItemView.setProgress(displayBookItem2.getDisplayProgress() * 100);
        orderBookItemView.setText(C27041f.m66669i(displayBookItem2.getDisplayPrice(), C37569d.m84684y()), C27041f.m66669i(displayBookItem2.getDisplayAmount(), C37569d.m84684y()));
        orderBookItemView.setNeedShowPosition(displayBookItem2.getIsDelegationMark());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(@NotNull ViewGroup parent, int i11) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        OrderBookItemView orderBookItemView = new OrderBookItemView(parent.getContext());
        Context context = orderBookItemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        orderBookItemView.setBuyColor(C17037c.m36495a(context, R$attr.upColor));
        Context context2 = orderBookItemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        orderBookItemView.setBuyProgressColor(C17037c.m36495a(context2, R$attr.upColor8));
        Context context3 = orderBookItemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        orderBookItemView.setSellColor(C17037c.m36495a(context3, R$attr.downColor));
        Context context4 = orderBookItemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        orderBookItemView.setSellProgressColor(C17037c.m36495a(context4, R$attr.downColor8));
        orderBookItemView.setAmountColor(C27017c.f54310a.m66512a(R$color.c_text80));
        orderBookItemView.setBackgroundResource(R$drawable.selector_orderbook_item_press);
        orderBookItemView.setLayoutParams(new ViewGroup.LayoutParams(-1, C27029c.m66601d(orderBookItemView, C13635c.m26931a())));
        final a aVar = new a(orderBookItemView);
        orderBookItemView.setOnClickListener(new View.OnClickListener() { // from class: com.kubi.futures.trade.book.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BookAdapter.m26925k(aVar, this, view);
            }
        });
        return aVar;
    }

    /* JADX INFO: renamed from: l */
    public final void m26929l(@NotNull Function2<? super Integer, ? super DisplayBookItem, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f23681k = listener;
    }

    /* JADX INFO: renamed from: m */
    public final void m26930m(int i11) {
        int iM66599b;
        if (i11 >= 11) {
            iM66599b = C27029c.m66599b(C27017c.f54310a.m66513b(), 10);
        } else {
            iM66599b = (9 > i11 || i11 >= 11) ? C27029c.m66599b(C27017c.f54310a.m66513b(), 12) : C27029c.m66599b(C27017c.f54310a.m66513b(), 11);
        }
        this.f23682l = iM66599b;
    }

    /* JADX INFO: renamed from: k */
    public static final void m26925k(a aVar, BookAdapter bookAdapter, View view) {
        Function2<? super Integer, ? super DisplayBookItem, Unit> function2;
        int bindingAdapterPosition = aVar.getBindingAdapterPosition();
        if (bindingAdapterPosition >= 0 && (function2 = bookAdapter.f23681k) != null) {
            Integer numValueOf = Integer.valueOf(bindingAdapterPosition);
            DisplayBookItem displayBookItem = bookAdapter.f23680j.get(bindingAdapterPosition);
            Intrinsics.checkNotNullExpressionValue(displayBookItem, "get(...)");
            function2.invoke(numValueOf, displayBookItem);
        }
    }
}
