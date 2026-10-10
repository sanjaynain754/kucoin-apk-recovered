package com.kubi.margin.market;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.margin.R$color;
import com.kubi.margin.R$drawable;
import com.kubi.margin.R$string;
import com.kubi.router.core.Router;
import com.kubi.search.searchresult.SearchCategory$Companion;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27046k;
import com.tencent.bugly.proguard.C33954u6;
import f00.C37304a;
import g00.InterfaceC37754f;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: renamed from: com.kubi.margin.market.r0, reason: from Kotlin metadata */
/* JADX INFO: compiled from: MarginNavigationIconAdapter.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\bH\u0016J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\bH\u0016J\b\u0010\u0016\u001a\u00020\bH\u0016J\u001e\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u0006H\u0002J\u0010\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\bH\u0002J\b\u0010\u001b\u001a\u00020\u0013H\u0002J\b\u0010\u001c\u001a\u00020\u0013H\u0002J\b\u0010\u001d\u001a\u00020\u0013H\u0002J\b\u0010\u001e\u001a\u00020\u0013H\u0002J\u0014\u0010\u001f\u001a\u00020\u00132\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00060!R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u00060\fj\b\u0012\u0004\u0012\u00020\u0006`\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, m90084d2 = {"Lcom/kubi/margin/market/MarginNavigationIconAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/kubi/margin/market/MarginNavigationIconViewHolder;", "mTradeBean", "Lcom/kubi/data/entity/TradeItemBean;", "contractSymbol", "", "viewWidth", "", "<init>", "(Lcom/kubi/data/entity/TradeItemBean;Ljava/lang/String;I)V", "data", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onBindViewHolder", "", C33954u6.f72238i, ViewProps.POSITION, "getItemCount", "getTextDataByType", "Lkotlin/Pair;", "type", NotificationCompat.CATEGORY_NAVIGATION, "toFlash", "toFuture", "toRobot", "toSpot", "notifyData", "list", "", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class MarginNavigationIconAdapter extends RecyclerView.Adapter<MarginNavigationIconViewHolder> {

    /* JADX INFO: renamed from: i */
    @NotNull
    public final TradeItemBean f33394i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public final String f33395j;

    /* JADX INFO: renamed from: k */
    public final int f33396k;

    /* JADX INFO: renamed from: l */
    @NotNull
    public final ArrayList<String> f33397l;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: i */
    public final void m39128i(int i11) {
        if (i11 == -1 || i11 >= this.f33397l.size()) {
            return;
        }
        String str = this.f33397l.get(i11);
        switch (str.hashCode()) {
            case -503567600:
                if (str.equals(SearchCategory$Companion.FUTURES)) {
                    m39133o();
                    return;
                }
                break;
            case 3537154:
                if (str.equals(SearchCategory$Companion.SPOT)) {
                    m39135q();
                    return;
                }
                break;
            case 97513456:
                if (str.equals("flash")) {
                    m39132n();
                    return;
                }
                break;
            case 108685930:
                if (str.equals("robot")) {
                    m39134p();
                    return;
                }
                break;
        }
        C44128b.m97259c("NavigationIconAdapter", "illegal type");
    }

    public MarginNavigationIconAdapter(@NotNull TradeItemBean mTradeBean, @Nullable String str, int i11) {
        Intrinsics.checkNotNullParameter(mTradeBean, "mTradeBean");
        this.f33394i = mTradeBean;
        this.f33395j = str;
        this.f33396k = i11;
        this.f33397l = new ArrayList<>();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f33397l.size();
    }

    /* JADX INFO: renamed from: j */
    public final void m39129j(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.f33397l.clear();
        this.f33397l.addAll(list);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull MarginNavigationIconViewHolder holder, int i11) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (i11 == -1) {
            return;
        }
        View view = holder.itemView;
        if (view instanceof TextView) {
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView = (TextView) view;
            String str = this.f33397l.get(i11);
            Intrinsics.checkNotNullExpressionValue(str, "get(...)");
            Pair<String, Integer> pairM39127h = m39127h(str);
            if (pairM39127h == null) {
                return;
            }
            textView.setText(pairM39127h.getFirst());
            C27046k.m66693h(textView, pairM39127h.getSecond().intValue(), 0, 48);
            C27046k.m66702q(textView, C27017c.f54310a.m66512a(R$color.c_icon));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public MarginNavigationIconViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i11) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        TextView textView = new TextView(parent.getContext());
        textView.setTextColor(C27017c.f54310a.m66512a(R$color.c_text40));
        textView.setTextSize(10.0f);
        Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        textView.setCompoundDrawablePadding((int) C27025c.m66565c(context, 4));
        Context context2 = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        textView.setLayoutParams(new ViewGroup.LayoutParams((int) C27025c.m66565c(context2, this.f33396k), -2));
        textView.setGravity(1);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        final MarginNavigationIconViewHolder marginNavigationIconViewHolder = new MarginNavigationIconViewHolder(textView);
        C27046k.m66711z(textView, 0L, new Function0() { // from class: com.kubi.margin.market.q0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginNavigationIconAdapter.m39126m(this.f33389b, marginNavigationIconViewHolder);
            }
        }, 1, null);
        return marginNavigationIconViewHolder;
    }

    /* JADX INFO: renamed from: n */
    public final void m39132n() {
        C43852m.m96590b("B4candle", "Convert", "1", TuplesKt.m90091to("symbol", this.f33394i.getSymbol()));
        Router router = Router.f46192a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("krn/router?biz=convert&entry=main&component=kucoin_convert_rn&route=");
        sb2.append(Uri.encode("ConvertPage?from=" + this.f33394i.getSymbolInfoEntity().getBaseCurrency() + "&to=USDT"));
        router.m56184f(sb2.toString()).m4048k();
    }

    /* JADX INFO: renamed from: o */
    public final void m39133o() {
        C43852m.m96590b("B4candle", "Futures", "1", TuplesKt.m90091to("symbol", this.f33394i.getSymbol()));
        InterfaceC37754f.a.m85131c(C37304a.f82764a, this.f33395j, null, null, null, null, null, null, null, null, 510, null);
    }

    /* JADX INFO: renamed from: p */
    public final void m39134p() {
        C43852m.m96590b("B4candle", "klineRobot", "1", TuplesKt.m90091to("symbol", this.f33394i.getSymbol()));
        InterfaceC37754f.a.m85139k(C37304a.f82764a, this.f33394i.getSymbol(), null, null, null, 14, null);
    }

    /* JADX INFO: renamed from: q */
    public final void m39135q() {
        InterfaceC37754f.a.m85140l(C37304a.f82764a, this.f33394i.getSymbol(), Boolean.TRUE, null, null, null, null, 60, null);
    }

    /* JADX INFO: renamed from: m */
    public static final Unit m39126m(MarginNavigationIconAdapter marginNavigationIconAdapter, MarginNavigationIconViewHolder marginNavigationIconViewHolder) {
        marginNavigationIconAdapter.m39128i(marginNavigationIconViewHolder.getAdapterPosition());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: h */
    public final Pair<String, Integer> m39127h(String str) {
        switch (str.hashCode()) {
            case -503567600:
                if (!str.equals(SearchCategory$Companion.FUTURES)) {
                    return null;
                }
                return new Pair<>(C27017c.f54310a.m66516f(R$string.futures, new Object[0]), Integer.valueOf(R$drawable.ic2_futures_account_24));
            case 3537154:
                if (str.equals(SearchCategory$Companion.SPOT)) {
                    return new Pair<>(C27017c.f54310a.m66516f(R$string.trading, new Object[0]), Integer.valueOf(R$drawable.ic_exchange_24));
                }
                return null;
            case 97513456:
                if (str.equals("flash")) {
                    return new Pair<>(C27017c.f54310a.m66516f(R$string.market_flash_trade, new Object[0]), Integer.valueOf(R$drawable.ic2_convert_24));
                }
                return null;
            case 108685930:
                if (str.equals("robot")) {
                    return new Pair<>(C27017c.f54310a.m66516f(R$string.kc_tb_grid_kline_title, new Object[0]), Integer.valueOf(R$drawable.ic2_roboto_24));
                }
                return null;
            default:
                return null;
        }
    }
}
