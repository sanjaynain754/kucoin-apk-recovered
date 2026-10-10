package com.kubi.home.realtime;

import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.kubi.router.core.Router;
import org.jetbrains.annotations.NotNull;
import p705vx.InterfaceC45661b;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: IRealTimeWidgetService.kt */
/* JADX INFO: loaded from: classes12.dex */
@InterfaceC45661b
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\bg\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013J \u0010\u0002\u001a\u00020\u0003\"\b\b\u0000\u0010\u0004*\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0007H&J \u0010\b\u001a\u00020\u0003\"\b\b\u0000\u0010\u0004*\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00040\nH&J \u0010\u000b\u001a\u00020\u0003\"\b\b\u0000\u0010\u0004*\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00040\nH&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0005H&J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0005H&J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u0005H&J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/home/realtime/IRealTimeWidgetService;", "", "registerAdapter", "", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/kubi/home/realtime/IRealTimeData;", "adapter", "Lcom/kubi/home/realtime/IRealTimeAdapter;", "addLifecycleListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/kubi/home/realtime/ViewLifecycleListener;", "removeLifecycleListener", "add", "data", "update", "", "newData", "remove", "isRemoved", "Companion", "HomeApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface IRealTimeWidgetService {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f26087a = Companion.f26088a;

    /* JADX INFO: compiled from: IRealTimeWidgetService.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/home/realtime/IRealTimeWidgetService$Companion;", "", "<init>", "()V", "get", "Lcom/kubi/home/realtime/IRealTimeWidgetService;", "HomeApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f26088a = new Companion();

        @NotNull
        public final IRealTimeWidgetService get() {
            return (IRealTimeWidgetService) Router.f46192a.m56192n(IRealTimeWidgetService.class);
        }
    }

    /* JADX INFO: renamed from: a */
    <T extends IRealTimeData> void mo30031a(@NotNull IRealTimeAdapter<T> iRealTimeAdapter);

    /* JADX INFO: renamed from: b */
    <T extends IRealTimeData> void mo30032b(@NotNull ViewLifecycleListener<T> viewLifecycleListener);

    /* JADX INFO: renamed from: c */
    boolean mo30033c(@NotNull IRealTimeData iRealTimeData);

    /* JADX INFO: renamed from: d */
    boolean mo30034d(@NotNull IRealTimeData iRealTimeData);

    /* JADX INFO: renamed from: e */
    boolean mo30035e(@NotNull IRealTimeData iRealTimeData);

    /* JADX INFO: renamed from: f */
    void mo30036f(@NotNull IRealTimeData iRealTimeData);
}
