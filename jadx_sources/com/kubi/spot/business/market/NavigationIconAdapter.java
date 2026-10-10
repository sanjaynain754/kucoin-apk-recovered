package com.kubi.spot.business.market;

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
import com.kubi.margin.api.IMarginService;
import com.kubi.monitor.EventParametersBuilder;
import com.kubi.router.core.Router;
import com.kubi.search.searchresult.SearchCategory$Companion;
import com.kubi.spot.R$color;
import com.kubi.spot.R$drawable;
import com.kubi.spot.R$string;
import com.kubi.spot.service.SpotDepend;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27046k;
import com.tencent.bugly.proguard.C33954u6;
import com.trtc.uikit.livekit.p180kc.data.entity.ClickCardReport;
import f00.C37304a;
import g00.InterfaceC37754f;
import id.C38519a;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43852m;
import p671uq.C45290a;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;
import y70.C46392a;

/* JADX INFO: renamed from: com.kubi.spot.business.market.c, reason: from Kotlin metadata */
/* JADX INFO: compiled from: NavigationIconAdapter.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\bH\u0016J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\bH\u0016J\b\u0010\u0016\u001a\u00020\bH\u0016J\u001e\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u0006H\u0002J\u0010\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\bH\u0002J\b\u0010\u001b\u001a\u00020\u0013H\u0002J\b\u0010\u001c\u001a\u00020\u0013H\u0002J\b\u0010\u001d\u001a\u00020\u0013H\u0002J\b\u0010\u001e\u001a\u00020\u0013H\u0002J\u0014\u0010\u001f\u001a\u00020\u00132\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00060!R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u00060\fj\b\u0012\u0004\u0012\u00020\u0006`\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, m90084d2 = {"Lcom/kubi/spot/business/market/NavigationIconAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/kubi/spot/business/market/NavigationIconViewHolder;", "mTradeBean", "Lcom/kubi/data/entity/TradeItemBean;", "contractSymbol", "", "viewWidth", "", "<init>", "(Lcom/kubi/data/entity/TradeItemBean;Ljava/lang/String;I)V", "data", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onBindViewHolder", "", C33954u6.f72238i, ViewProps.POSITION, "getItemCount", "getTextDataByType", "Lkotlin/Pair;", "type", NotificationCompat.CATEGORY_NAVIGATION, "toFlash", "toFuture", "toRobot", "toMargin", "notifyData", "list", "", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nNavigationIconAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationIconAdapter.kt\ncom/kubi/spot/business/market/NavigationIconAdapter\n+ 2 DurationTracker.kt\ncom/kubi/monitor/DurationTrackerKt\n+ 3 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,202:1\n46#2,14:203\n135#3,2:217\n*S KotlinDebug\n*F\n+ 1 NavigationIconAdapter.kt\ncom/kubi/spot/business/market/NavigationIconAdapter\n*L\n150#1:203,14\n169#1:217,2\n*E\n"})
public final class NavigationIconAdapter extends RecyclerView.Adapter<NavigationIconViewHolder> {

    /* JADX INFO: renamed from: i */
    @NotNull
    public final TradeItemBean f50217i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public final String f50218j;

    /* JADX INFO: renamed from: k */
    public final int f50219k;

    /* JADX INFO: renamed from: l */
    @NotNull
    public final ArrayList<String> f50220l;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: i */
    private final void m61159i(int i11) {
        if (i11 == -1 || i11 >= this.f50220l.size()) {
            return;
        }
        String str = this.f50220l.get(i11);
        switch (str.hashCode()) {
            case -1081309778:
                if (str.equals(ViewProps.MARGIN)) {
                    m61167p();
                    return;
                }
                break;
            case -503567600:
                if (str.equals(SearchCategory$Companion.FUTURES)) {
                    m61162o();
                    return;
                }
                break;
            case 97513456:
                if (str.equals("flash")) {
                    m61161n();
                    return;
                }
                break;
            case 108685930:
                if (str.equals("robot")) {
                    m61163q();
                    return;
                }
                break;
        }
        C44128b.m97259c("NavigationIconAdapter", "illegal type");
    }

    public NavigationIconAdapter(@NotNull TradeItemBean mTradeBean, @Nullable String str, int i11) {
        Intrinsics.checkNotNullParameter(mTradeBean, "mTradeBean");
        this.f50217i = mTradeBean;
        this.f50218j = str;
        this.f50219k = i11;
        this.f50220l = new ArrayList<>();
    }

    /* JADX INFO: renamed from: n */
    private final void m61161n() {
        C43852m.m96590b("B5candle", "convert", "1", TuplesKt.m90091to("trade_pair", this.f50217i.getSymbol()));
        Router router = Router.f46192a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("krn/router?biz=convert&entry=main&component=kucoin_convert_rn&route=");
        sb2.append(Uri.encode("ConvertPage?from=" + this.f50217i.getSymbolInfoEntity().getBaseCurrency() + "&to=USDT&spm=" + C43852m.m96601m("B5candle", "convert", "1")));
        router.m56184f(sb2.toString()).m4048k();
    }

    /* JADX INFO: renamed from: o */
    private final void m61162o() {
        C43852m.m96590b("B5candle", ClickCardReport.ReportData.CARD_TYPE_FUTURE, "1", TuplesKt.m90091to("trade_pair", this.f50217i.getSymbol()));
        InterfaceC37754f.a.m85131c(C37304a.f82764a, this.f50218j, null, null, null, null, null, C43852m.m96601m("B5candle", ClickCardReport.ReportData.CARD_TYPE_FUTURE, "1"), null, null, 446, null);
    }

    /* JADX INFO: renamed from: q */
    private final void m61163q() {
        if ("B5trading_bot_load".length() == 0 || "page_load_start".length() == 0) {
            C44128b.m97270n("Monitor", "eventName(B5trading_bot_load) or pointName(page_load_start) is null");
        } else {
            EventParametersBuilder eventParametersBuilderAcquire = EventParametersBuilder.INSTANCE.acquire();
            eventParametersBuilderAcquire.m42382c("type", "market");
            C45290a.f101823a.m100101b("B5trading_bot_load", "page_load_start", "", eventParametersBuilderAcquire.m42380a());
        }
        C43852m.m96590b("B5candle", "grid", "1", TuplesKt.m90091to("trade_pair", this.f50217i.getSymbol()));
        InterfaceC37754f.a.m85139k(C37304a.f82764a, this.f50217i.getSymbol(), C43852m.m96601m("B5candle", "grid", "1"), null, null, 12, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f50220l.size();
    }

    /* JADX INFO: renamed from: j */
    public final void m61164j(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.f50220l.clear();
        this.f50220l.addAll(list);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull NavigationIconViewHolder holder, int i11) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (i11 == -1) {
            return;
        }
        View view = holder.itemView;
        if (view instanceof TextView) {
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView = (TextView) view;
            String str = this.f50220l.get(i11);
            Intrinsics.checkNotNullExpressionValue(str, "get(...)");
            Pair<String, Integer> pairM61158h = m61158h(str);
            if (pairM61158h == null) {
                return;
            }
            textView.setText(pairM61158h.getFirst());
            C27046k.m66693h(textView, pairM61158h.getSecond().intValue(), 0, 48);
            C27046k.m66702q(textView, C27017c.f54310a.m66512a(R$color.c_icon));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public NavigationIconViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i11) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        TextView textView = new TextView(parent.getContext());
        textView.setTextColor(C27017c.f54310a.m66512a(R$color.c_text40));
        textView.setTextSize(10.0f);
        Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        textView.setCompoundDrawablePadding((int) C27025c.m66565c(context, 4));
        Context context2 = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        textView.setLayoutParams(new ViewGroup.LayoutParams((int) C27025c.m66565c(context2, this.f50219k), -2));
        textView.setGravity(1);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        final NavigationIconViewHolder navigationIconViewHolder = new NavigationIconViewHolder(textView);
        C27046k.m66711z(textView, 0L, new Function0() { // from class: com.kubi.spot.business.market.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NavigationIconAdapter.m61160m(this.f50213b, navigationIconViewHolder);
            }
        }, 1, null);
        return navigationIconViewHolder;
    }

    /* JADX INFO: renamed from: p */
    public final void m61167p() {
        C43852m.m96590b("B5candle", ViewProps.MARGIN, "1", TuplesKt.m90091to("trade_pair", this.f50217i.getSymbol()));
        String strM96601m = C43852m.m96601m("B5candle", ViewProps.MARGIN, "1");
        boolean zIsMarginEnabled = this.f50217i.getSymbolInfoEntity().isMarginEnabled();
        boolean zIsIsolatedMarginTradeEnabled = this.f50217i.getSymbolInfoEntity().isIsolatedMarginTradeEnabled();
        if (zIsMarginEnabled && zIsIsolatedMarginTradeEnabled) {
            IMarginService iMarginServiceM63033c = SpotDepend.f51244a.m63033c();
            String symbol = this.f50217i.getSymbol();
            Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
            IMarginService.m37900d0(iMarginServiceM63033c, symbol, C46392a.m102322d(C38519a.f86479a.m87134i(), false), false, strM96601m, 4, null);
            return;
        }
        if (zIsMarginEnabled) {
            IMarginService iMarginServiceM63033c2 = SpotDepend.f51244a.m63033c();
            String symbol2 = this.f50217i.getSymbol();
            Intrinsics.checkNotNullExpressionValue(symbol2, "getSymbol(...)");
            IMarginService.m37900d0(iMarginServiceM63033c2, symbol2, false, false, strM96601m, 4, null);
            return;
        }
        IMarginService iMarginServiceM63033c3 = SpotDepend.f51244a.m63033c();
        String symbol3 = this.f50217i.getSymbol();
        Intrinsics.checkNotNullExpressionValue(symbol3, "getSymbol(...)");
        IMarginService.m37900d0(iMarginServiceM63033c3, symbol3, true, false, strM96601m, 4, null);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: h */
    private final Pair<String, Integer> m61158h(String str) {
        switch (str.hashCode()) {
            case -1081309778:
                if (!str.equals(ViewProps.MARGIN)) {
                    return null;
                }
                return new Pair<>(C27017c.f54310a.m66516f(R$string.lever, new Object[0]), Integer.valueOf(R$drawable.ic2_margin_account_24));
            case -503567600:
                if (str.equals(SearchCategory$Companion.FUTURES)) {
                    return new Pair<>(C27017c.f54310a.m66516f(R$string.futures, new Object[0]), Integer.valueOf(R$drawable.ic2_futures_account_24));
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

    /* JADX INFO: renamed from: m */
    public static final Unit m61160m(NavigationIconAdapter navigationIconAdapter, NavigationIconViewHolder navigationIconViewHolder) {
        navigationIconAdapter.m61159i(navigationIconViewHolder.getAdapterPosition());
        return Unit.INSTANCE;
    }
}
