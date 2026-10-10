package p839zp;

import android.content.Context;
import com.kubi.kucoin.feature.widget.appwidget.WidgetProvider;
import com.kubi.kucoin.feature.widget.appwidget.WidgetRefreshService;
import com.kubi.market.monitor.api.IMarketMonitorService;
import com.kubi.market.monitor.lib.p100ui.floating.window.FloatingActionManager;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: zp.b */
/* JADX INFO: compiled from: MarketMonitorService.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, m90084d2 = {"Lcom/kubi/market/monitor/lib/service/MarketMonitorService;", "Lcom/kubi/market/monitor/api/IMarketMonitorService;", "<init>", "()V", "updateFloatingWidget", "", "mContext", "Landroid/content/Context;", "MarketMonitorLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C46903b implements IMarketMonitorService {
    @Override // com.kubi.market.monitor.api.IMarketMonitorService
    /* JADX INFO: renamed from: a */
    public void mo40721a(@Nullable Context context) {
        FloatingActionManager.f34540a.m41379p2();
        WidgetProvider.Companion companion = WidgetProvider.f27798a;
        if (context != null) {
            companion.sendUpdateBroadcast(context);
            WidgetRefreshService.f27799g.startService(context);
        }
    }
}
