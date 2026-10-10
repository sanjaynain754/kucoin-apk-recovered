package com.kubi.kucoin.feature.widget.appwidget;

import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import com.facebook.react.uimanager.ViewProps;
import com.fasterxml.jackson.databind.node.C6447a;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.kucoin.market.monitor.lib.R$color;
import com.kubi.kucoin.market.monitor.lib.R$id;
import com.kubi.kucoin.market.monitor.lib.R$layout;
import com.kubi.kucoin.utils.DayNightThemeManager;
import com.kubi.launch.LaunchIntentHelper;
import com.kubi.margin.api.IMarginService;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.utils.TimeUtils;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27046k;
import gf.C37885i;
import gf.C37886j;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.ListIterator;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p311hf.C38183a;
import p402kf.C41014a;
import p429lf.C42180b;
import p839zp.C46902a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.Regex;
import ro.C44128b;

/* JADX INFO: compiled from: WidgetRemoteService.kt */
/* JADX INFO: loaded from: classes18.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\t"}, m90084d2 = {"Lcom/kubi/kucoin/feature/widget/appwidget/WidgetRemoteService;", "Landroid/widget/RemoteViewsService;", "<init>", "()V", "onGetViewFactory", "Landroid/widget/RemoteViewsService$RemoteViewsFactory;", "intent", "Landroid/content/Intent;", "ListRemoteViewFactory", "MarketMonitorLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class WidgetRemoteService extends RemoteViewsService {

    /* JADX INFO: renamed from: com.kubi.kucoin.feature.widget.appwidget.WidgetRemoteService$a */
    /* JADX INFO: compiled from: WidgetRemoteService.kt */
    @Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\r\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000fH\u0016J\n\u0010\u0013\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u0014\u001a\u00020\u000fH\u0016J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u000fH\u0016J\b\u0010\u0017\u001a\u00020\tH\u0016J\u0010\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/kucoin/feature/widget/appwidget/WidgetRemoteService$ListRemoteViewFactory;", "Landroid/widget/RemoteViewsService$RemoteViewsFactory;", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "<init>", "(Lcom/kubi/kucoin/feature/widget/appwidget/WidgetRemoteService;Landroid/content/Context;Landroid/content/Intent;)V", "isGreenUpRedDown", "", "onCreate", "", "onDataSetChanged", "onDestroy", "getCount", "", "getViewAt", "Landroid/widget/RemoteViews;", ViewProps.POSITION, "getLoadingView", "getViewTypeCount", "getItemId", "", "hasStableIds", "getAppWidgetRateBgColor", "num", "", "MarketMonitorLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nWidgetRemoteService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WidgetRemoteService.kt\ncom/kubi/kucoin/feature/widget/appwidget/WidgetRemoteService$ListRemoteViewFactory\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,164:1\n739#2,9:165\n37#3:174\n36#3,3:175\n*S KotlinDebug\n*F\n+ 1 WidgetRemoteService.kt\ncom/kubi/kucoin/feature/widget/appwidget/WidgetRemoteService$ListRemoteViewFactory\n*L\n70#1:165,9\n71#1:174\n71#1:175,3\n*E\n"})
    public final class C15339a implements RemoteViewsService.RemoteViewsFactory {

        /* JADX INFO: renamed from: a */
        @NotNull
        public final Context f27809a;

        /* JADX INFO: renamed from: b */
        public boolean f27810b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ WidgetRemoteService f27811c;

        @Override // android.widget.RemoteViewsService.RemoteViewsFactory
        public long getItemId(int position) {
            return position;
        }

        @Override // android.widget.RemoteViewsService.RemoteViewsFactory
        @NotNull
        public RemoteViews getViewAt(int position) {
            TradeItemBean tradeItemBean;
            List listEmptyList;
            RemoteViews remoteViews = new RemoteViews(this.f27809a.getPackageName(), R$layout.view_app_widget_item);
            WidgetRemoteService widgetRemoteService = this.f27811c;
            WidgetRefreshService.Companion companion = WidgetRefreshService.f27799g;
            if (position < companion.getTradeLists().size()) {
                String strM93915p = null;
                try {
                    tradeItemBean = companion.getTradeLists().get(position);
                } catch (Exception unused) {
                    tradeItemBean = null;
                }
                if (tradeItemBean != null) {
                    String showSymbol = tradeItemBean.getShowSymbol();
                    Intrinsics.checkNotNullExpressionValue(showSymbol, "getShowSymbol(...)");
                    List<String> listSplit = new Regex("/").split(showSymbol, 0);
                    if (!listSplit.isEmpty()) {
                        ListIterator<String> listIterator = listSplit.listIterator(listSplit.size());
                        while (true) {
                            if (!listIterator.hasPrevious()) {
                                listEmptyList = CollectionsKt.emptyList();
                                break;
                            }
                            if (listIterator.previous().length() != 0) {
                                listEmptyList = CollectionsKt.take(listSplit, listIterator.nextIndex() + 1);
                                break;
                            }
                        }
                    } else {
                        listEmptyList = CollectionsKt.emptyList();
                        break;
                    }
                    String[] strArr = (String[]) listEmptyList.toArray(new String[0]);
                    if (strArr.length > 1) {
                        remoteViews.setTextViewText(R$id.tv_trade_pair_left, strArr[0]);
                        int i11 = R$id.tv_trade_pair_right;
                        remoteViews.setTextViewText(i11, '/' + strArr[1]);
                        remoteViews.setViewVisibility(i11, 0);
                    } else {
                        remoteViews.setTextViewText(R$id.tv_trade_pair_left, tradeItemBean.getShowSymbol());
                        remoteViews.setViewVisibility(R$id.tv_trade_pair_right, 8);
                    }
                    remoteViews.setTextViewText(R$id.tv_refresh_time, TimeUtils.m66425l(System.currentTimeMillis()));
                    int i12 = R$id.tv_lever;
                    remoteViews.setViewVisibility(i12, (tradeItemBean.getSymbolInfoEntity().isShowMarginLeverLabel() && C38183a.m86145a()) ? 0 : 8);
                    StringBuilder sb2 = new StringBuilder();
                    C46902a c46902a = C46902a.f104768a;
                    IMarginService iMarginServiceM103311a = c46902a.m103311a();
                    String symbol = tradeItemBean.getSymbol();
                    Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
                    sb2.append(C6447a.m11724a(iMarginServiceM103311a.mo37954q(symbol)).toPlainString());
                    sb2.append('x');
                    remoteViews.setTextViewText(i12, sb2.toString());
                    remoteViews.setTextViewText(R$id.tv_price, C37886j.m85579c(new BigDecimal(String.valueOf(tradeItemBean.getLastDealPrice())), tradeItemBean.getSymbol(), (124 & 2) != 0 ? RoundingMode.DOWN : null, (124 & 4) != 0 ? false : false, (124 & 8) != 0 ? false : false, (124 & 16) != 0, (124 & 32) == 0 ? 0 : 0, (124 & 64) != 0 ? MultiLanguageManager.f46811g.getLocale() : null));
                    int i13 = R$id.tv_money_price;
                    double lastDealPrice = tradeItemBean.getLastDealPrice();
                    SymbolInfoEntity symbolInfoEntity = tradeItemBean.getSymbolInfoEntity();
                    remoteViews.setTextViewText(i13, C41014a.m89933g(new BigDecimal(String.valueOf(C41014a.m89939m(lastDealPrice, symbolInfoEntity != null ? symbolInfoEntity.getQuoteCurrency() : null))), null, null, 0, false, false, true, 31, null));
                    int i14 = R$id.tv_change_rate;
                    Double changeRate = tradeItemBean.getChangeRate();
                    if (changeRate != null) {
                        BigDecimal bigDecimal = new BigDecimal(String.valueOf(changeRate.doubleValue()));
                        strM93915p = C42828b.m93915p(C42828b.m93911l(C42180b.m92642g(bigDecimal, null, null, C41014a.m89951y(bigDecimal), true, false, false, 19, null)));
                    }
                    remoteViews.setTextViewText(i14, C42180b.m92647l(strM93915p));
                    remoteViews.setTextViewText(R$id.tv_value, C37885i.m85566e(tradeItemBean.getValue(), tradeItemBean.getSymbolInfoEntity().getQuoteCurrency()));
                    remoteViews.setTextColor(i14, C27046k.m66699n(widgetRemoteService, R$color.c_white));
                    remoteViews.setInt(i14, "setBackgroundColor", m32164a(C27039d.m66646f(tradeItemBean.getChangeRate())));
                    int i15 = R$id.item_widget;
                    Intent intent = new Intent();
                    try {
                        LaunchIntentHelper.f31789a.m37455k(intent, c46902a.m103312b().mo59999l());
                        Intrinsics.checkNotNull(intent.putExtra("data", tradeItemBean));
                    } catch (Exception e11) {
                        C44128b.m97262f("Widget", "widgetItem err", e11);
                    }
                    Unit unit = Unit.INSTANCE;
                    remoteViews.setOnClickFillInIntent(i15, intent);
                }
            }
            return remoteViews;
        }

        @Override // android.widget.RemoteViewsService.RemoteViewsFactory
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.RemoteViewsService.RemoteViewsFactory
        public boolean hasStableIds() {
            return true;
        }

        public C15339a(@NotNull WidgetRemoteService widgetRemoteService, @NotNull Context context, Intent intent) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            this.f27811c = widgetRemoteService;
            this.f27809a = context;
        }

        /* JADX INFO: renamed from: a */
        public final int m32164a(double d11) {
            if (d11 > 0.0d) {
                return C27046k.m66699n(this.f27811c, this.f27810b ? R$color.primary : R$color.secondary);
            }
            if (d11 < 0.0d) {
                return C27046k.m66699n(this.f27811c, this.f27810b ? R$color.secondary : R$color.primary);
            }
            return C27046k.m66699n(this.f27811c, R$color.emphasis40);
        }

        @Override // android.widget.RemoteViewsService.RemoteViewsFactory
        public int getCount() {
            return WidgetRefreshService.f27799g.getTradeLists().size();
        }

        @Override // android.widget.RemoteViewsService.RemoteViewsFactory
        @Nullable
        public RemoteViews getLoadingView() {
            return new RemoteViews(this.f27809a.getPackageName(), R$layout.view_app_widget_item_loading);
        }

        @Override // android.widget.RemoteViewsService.RemoteViewsFactory
        public void onCreate() {
            WidgetRefreshService.f27799g.startService(this.f27809a);
        }

        @Override // android.widget.RemoteViewsService.RemoteViewsFactory
        public void onDataSetChanged() {
            this.f27810b = DayNightThemeManager.f28592a.m33189n();
        }

        @Override // android.widget.RemoteViewsService.RemoteViewsFactory
        public void onDestroy() {
        }
    }

    @Override // android.widget.RemoteViewsService
    @NotNull
    public RemoteViewsService.RemoteViewsFactory onGetViewFactory(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        return new C15339a(this, applicationContext, intent);
    }
}
