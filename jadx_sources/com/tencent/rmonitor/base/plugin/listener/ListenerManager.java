package com.tencent.rmonitor.base.plugin.listener;

import androidx.annotation.RestrictTo;
import com.tencent.bugly.proguard.InterfaceC33645f8;
import com.tencent.bugly.proguard.InterfaceC33709i9;
import com.tencent.bugly.proguard.InterfaceC33856p9;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmField;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b \u0010!R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0005R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0005R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0005R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0005R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0005R\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0005R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0005R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0005R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0005R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0005R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0005R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0005R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0005¨\u0006\""}, m90084d2 = {"Lcom/tencent/rmonitor/base/plugin/listener/ListenerManager;", "", "Lcom/tencent/rmonitor/base/plugin/listener/MonitorListenerMng;", "Lcom/tencent/rmonitor/base/plugin/listener/IMemoryLeakListener;", "memoryLeakListener", "Lcom/tencent/rmonitor/base/plugin/listener/MonitorListenerMng;", "Lcom/tencent/rmonitor/base/plugin/listener/IMemoryCeilingListener;", "memoryCeilingListener", "Lcom/tencent/rmonitor/base/plugin/listener/IDropFrameListener;", "dropFrameListener", "Lcom/tencent/rmonitor/base/plugin/listener/ILooperListener;", "looperListener", "Lcom/tencent/rmonitor/base/plugin/listener/IIoTracerListener;", "ioTracerListener", "Lcom/tencent/rmonitor/base/plugin/listener/IBaseListener;", "bigBitmapListener", "fdLeakListener", "Lcom/tencent/rmonitor/base/plugin/listener/IDBTracerListener;", "dbTracerListener", "natMemListener", "Lcom/tencent/rmonitor/base/plugin/listener/IDeviceInfoListener;", "deviceInfoListener", "Lcom/tencent/bugly/proguard/f8;", "batteryListener", "Lcom/tencent/bugly/proguard/p9;", "pluginStateListener", "Lcom/tencent/rmonitor/base/plugin/listener/ICustomDataCollector;", "customDataCollector", "Lcom/tencent/rmonitor/base/plugin/listener/ICustomDataCollectorForIssue;", "customDataCollectorForIssue", "Lcom/tencent/bugly/proguard/i9;", "memoryPeakListener", "<init>", "()V", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class ListenerManager {

    @NotNull
    public static final ListenerManager INSTANCE = new ListenerManager();

    @JvmField
    @NotNull
    public static final MonitorListenerMng<IMemoryLeakListener> memoryLeakListener = new MonitorListenerMng<>();

    @JvmField
    @NotNull
    public static final MonitorListenerMng<IMemoryCeilingListener> memoryCeilingListener = new MonitorListenerMng<>();

    @JvmField
    @NotNull
    public static final MonitorListenerMng<IDropFrameListener> dropFrameListener = new MonitorListenerMng<>();

    @JvmField
    @NotNull
    public static final MonitorListenerMng<ILooperListener> looperListener = new MonitorListenerMng<>();

    @JvmField
    @NotNull
    public static final MonitorListenerMng<IIoTracerListener> ioTracerListener = new MonitorListenerMng<>();

    @JvmField
    @NotNull
    public static final MonitorListenerMng<IBaseListener> bigBitmapListener = new MonitorListenerMng<>();

    @JvmField
    @NotNull
    public static final MonitorListenerMng<IBaseListener> fdLeakListener = new MonitorListenerMng<>();

    @JvmField
    @NotNull
    public static MonitorListenerMng<IDBTracerListener> dbTracerListener = new MonitorListenerMng<>();

    @JvmField
    @NotNull
    public static final MonitorListenerMng<IBaseListener> natMemListener = new MonitorListenerMng<>();

    @JvmField
    @NotNull
    public static final MonitorListenerMng<IDeviceInfoListener> deviceInfoListener = new MonitorListenerMng<>();

    @JvmField
    @NotNull
    public static final MonitorListenerMng<InterfaceC33645f8> batteryListener = new MonitorListenerMng<>();

    @JvmField
    @NotNull
    public static final MonitorListenerMng<InterfaceC33856p9> pluginStateListener = new MonitorListenerMng<>();

    @JvmField
    @NotNull
    public static final MonitorListenerMng<ICustomDataCollector> customDataCollector = new MonitorListenerMng<>();

    @JvmField
    @NotNull
    public static final MonitorListenerMng<ICustomDataCollectorForIssue> customDataCollectorForIssue = new MonitorListenerMng<>();

    @JvmField
    @NotNull
    public static final MonitorListenerMng<InterfaceC33709i9> memoryPeakListener = new MonitorListenerMng<>();

    private ListenerManager() {
    }
}
