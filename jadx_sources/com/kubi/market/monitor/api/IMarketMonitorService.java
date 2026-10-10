package com.kubi.market.monitor.api;

import android.content.Context;
import com.kubi.router.core.Router;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p705vx.InterfaceC45661b;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: IMarketMonitorService.kt */
/* JADX INFO: loaded from: classes12.dex */
@InterfaceC45661b
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/market/monitor/api/IMarketMonitorService;", "", "updateFloatingWidget", "", "mContext", "Landroid/content/Context;", "Companion", "MarketMonitorApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface IMarketMonitorService {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f34270a = Companion.f34271a;

    /* JADX INFO: compiled from: IMarketMonitorService.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/market/monitor/api/IMarketMonitorService$Companion;", "", "<init>", "()V", "get", "Lcom/kubi/market/monitor/api/IMarketMonitorService;", "MarketMonitorApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f34271a = new Companion();

        @NotNull
        public final IMarketMonitorService get() {
            return (IMarketMonitorService) Router.f46192a.m56192n(IMarketMonitorService.class);
        }
    }

    /* JADX INFO: renamed from: a */
    void mo40721a(@Nullable Context context);
}
