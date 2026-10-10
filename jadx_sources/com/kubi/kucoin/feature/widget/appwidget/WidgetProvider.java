package com.kubi.kucoin.feature.widget.appwidget;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.RemoteViews;
import com.blankj.utilcode.util.C5258a;
import com.kubi.kucoin.api.IKuFacadeService;
import com.kubi.kucoin.feature.widget.ChooseSymbolFragment;
import com.kubi.kucoin.market.monitor.lib.R$id;
import com.kubi.kucoin.market.monitor.lib.R$layout;
import com.kubi.kucoin.market.monitor.lib.R$string;
import com.kubi.launch.LaunchIntentHelper;
import com.kubi.market.monitor.lib.p100ui.floating.window.FloatingActionManager;
import java.text.SimpleDateFormat;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p265fl.C37565d;
import p839zp.C46902a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WidgetProvider.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0002J*\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0018\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/kucoin/feature/widget/appwidget/WidgetProvider;", "Landroid/appwidget/AppWidgetProvider;", "<init>", "()V", "onUpdate", "", "context", "Landroid/content/Context;", "appWidgetManager", "Landroid/appwidget/AppWidgetManager;", "appWidgetIds", "", "onDeleted", "onEnabled", "onDisabled", "floatingShowIng", "", "onAppWidgetOptionsChanged", "appWidgetId", "", "newOptions", "Landroid/os/Bundle;", "onReceive", "intent", "Landroid/content/Intent;", "createRemoteView", "Landroid/widget/RemoteViews;", "Companion", "MarketMonitorLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class WidgetProvider extends AppWidgetProvider {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f27798a = new Companion(null);

    /* JADX INFO: compiled from: WidgetProvider.kt */
    @Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0012\u001a\u00020\u0013H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/kucoin/feature/widget/appwidget/WidgetProvider$Companion;", "", "<init>", "()V", "REFRESH_ACTION", "", "LOADING_SHOW_ACTION", "LOADING_HIDE_ACTION", "sendUpdateBroadcast", "", "context", "Landroid/content/Context;", "getAppWidgetIds", "", "onDataReceived", "rest", "", "getAppWidgetFormatter", "toLong", "", "MarketMonitorLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        /* JADX INFO: renamed from: a */
        public final String m32126a(long j11) {
            return new SimpleDateFormat("MM-dd HH:mm:ss", Locale.getDefault()).format(Long.valueOf(j11));
        }

        @NotNull
        public final int[] getAppWidgetIds(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            int[] appWidgetIds = AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context, (Class<?>) WidgetProvider.class));
            Intrinsics.checkNotNullExpressionValue(appWidgetIds, "getAppWidgetIds(...)");
            return appWidgetIds;
        }

        public final void onDataReceived(@NotNull Context context, boolean rest) {
            Intrinsics.checkNotNullParameter(context, "context");
            int[] appWidgetIds = getAppWidgetIds(context);
            if (appWidgetIds.length == 0) {
                return;
            }
            AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
            if (rest) {
                RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R$layout.view_app_market_widget);
                remoteViews.setTextViewText(R$id.tv_refresh_time, m32126a(System.currentTimeMillis()));
                appWidgetManager.partiallyUpdateAppWidget(appWidgetIds, remoteViews);
            }
            appWidgetManager.notifyAppWidgetViewDataChanged(appWidgetIds, R$id.list_market_datas);
        }

        public final void sendUpdateBroadcast(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (getAppWidgetIds(context).length == 0) {
                return;
            }
            WidgetIntent widgetIntent = new WidgetIntent("android.appwidget.action.APPWIDGET_UPDATE");
            Bundle bundle = new Bundle();
            bundle.putIntArray("appWidgetIds", WidgetProvider.f27798a.getAppWidgetIds(context));
            widgetIntent.putExtras(bundle);
            context.sendBroadcast(widgetIntent);
        }
    }

    /* JADX INFO: renamed from: a */
    public final RemoteViews m32124a(Context context) {
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R$layout.view_app_market_widget);
        remoteViews.setTextViewText(R$id.tv_refresh_time, f27798a.m32126a(System.currentTimeMillis()));
        Intent intent = new Intent(context, (Class<?>) WidgetRemoteService.class);
        int i11 = R$id.list_market_datas;
        remoteViews.setRemoteAdapter(i11, intent);
        int i12 = R$id.view_add_data;
        remoteViews.setEmptyView(i11, i12);
        Intent intent2 = new Intent(context, (Class<?>) WidgetProvider.class);
        intent2.setAction("android.appwidget.action.desktop_widget_refresh");
        remoteViews.setOnClickPendingIntent(R$id.widget_iv_refresh, PendingIntent.getBroadcast(context, 0, intent2, 33554432));
        LaunchIntentHelper launchIntentHelper = LaunchIntentHelper.f31789a;
        remoteViews.setPendingIntentTemplate(i11, launchIntentHelper.m37452h(context, C46902a.f104768a.m103312b().mo60013z()));
        String string = context.getString(R$string.widget_tracking);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        remoteViews.setOnClickPendingIntent(R$id.widget_iv_set, launchIntentHelper.m37454j(context, string, WidgetDeskSettingFragment.class, "action_widget_dest_setting"));
        String string2 = context.getString(R$string.symbol_choose);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        remoteViews.setOnClickPendingIntent(i12, launchIntentHelper.m37454j(context, string2, ChooseSymbolFragment.class, "action_widget_desk_add"));
        remoteViews.setOnClickPendingIntent(R$id.view_header, launchIntentHelper.m37453i(context, IKuFacadeService.f27711a.get().mo31925d(), "action_widget_desk_home"));
        return remoteViews;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m32125b() {
        return C37565d.f83517a.m84604j() || FloatingActionManager.f34540a.m41387s2();
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onAppWidgetOptionsChanged(@NotNull Context context, @NotNull AppWidgetManager appWidgetManager, int appWidgetId, @Nullable Bundle newOptions) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appWidgetManager, "appWidgetManager");
        super.onAppWidgetOptionsChanged(context, appWidgetManager, appWidgetId, newOptions);
        f27798a.sendUpdateBroadcast(context);
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onDeleted(@NotNull Context context, @NotNull int[] appWidgetIds) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appWidgetIds, "appWidgetIds");
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onDisabled(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        WidgetRefreshService.f27799g.stopSelf(context, "移除小组件");
        context.stopService(new Intent(context, (Class<?>) WidgetRemoteService.class));
        if (C5258a.m6124g().size() != 0 || m32125b()) {
            return;
        }
        System.exit(0);
        throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onEnabled(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    public void onReceive(@NotNull Context context, @NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onReceive(context, intent);
        String action = intent.getAction();
        if (action != null) {
            int iHashCode = action.hashCode();
            if (iHashCode == -100441069) {
                if (action.equals("android.appwidget.action.desktop_widget_refresh")) {
                    WidgetRefreshService.Companion companion = WidgetRefreshService.f27799g;
                    companion.startService(context);
                    companion.getRefreshObs().onNext(Boolean.TRUE);
                    return;
                }
                return;
            }
            if (iHashCode == 118966210) {
                if (action.equals("android.appwidget.action.desktop_widget_show_loading")) {
                    RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R$layout.view_app_market_widget);
                    remoteViews.setViewVisibility(R$id.view_progress, 0);
                    AppWidgetManager.getInstance(context).partiallyUpdateAppWidget(f27798a.getAppWidgetIds(context), remoteViews);
                    return;
                }
                return;
            }
            if (iHashCode == 1533162759 && action.equals("android.appwidget.action.desktop_widget_hide_loading")) {
                RemoteViews remoteViews2 = new RemoteViews(context.getPackageName(), R$layout.view_app_market_widget);
                remoteViews2.setViewVisibility(R$id.view_progress, 8);
                AppWidgetManager.getInstance(context).partiallyUpdateAppWidget(f27798a.getAppWidgetIds(context), remoteViews2);
            }
        }
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onUpdate(@NotNull Context context, @NotNull AppWidgetManager appWidgetManager, @NotNull int[] appWidgetIds) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appWidgetManager, "appWidgetManager");
        Intrinsics.checkNotNullParameter(appWidgetIds, "appWidgetIds");
        appWidgetManager.updateAppWidget(appWidgetIds, m32124a(context));
    }
}
