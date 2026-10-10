package com.jumio.core.sensors;

import android.content.Context;
import android.hardware.SensorEvent;
import com.jumio.core.Injected;
import com.tencent.bugly.proguard.InterfaceC33730j9;
import com.tencent.qcloud.tuicore.TUIConstants;
import jumio.core.InterfaceC40550J3;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes56.dex */
@Injected
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H&J\b\u0010\u0012\u001a\u00020\u000fH&J\u001c\u0010\u0013\u001a\u00020\u000f2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000f0\u0015H&J\b\u0010\u0017\u001a\u00020\u0018H&J\b\u0010\u0019\u001a\u00020\u000fH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u001aÀ\u0006\u0003"}, m90084d2 = {"Lcom/jumio/core/sensors/SensorInterface;", "", "type", "Lcom/jumio/core/sensors/SensorType;", "getType", "()Lcom/jumio/core/sensors/SensorType;", "latestData", "", "getLatestData", "()[F", "initialTimestamp", "", "getInitialTimestamp", "()J", "start", "", "context", "Landroid/content/Context;", InterfaceC33730j9.f70350a, "setEventCallback", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "Landroid/hardware/SensorEvent;", "getResult", "Lcom/jumio/core/sensors/SensorResult;", "resetAllData", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface SensorInterface {
    long getInitialTimestamp();

    @NotNull
    float[] getLatestData();

    @NotNull
    InterfaceC40550J3 getResult();

    @NotNull
    SensorType getType();

    void resetAllData();

    void setEventCallback(@NotNull Function1<? super SensorEvent, Unit> callback);

    void start(@NotNull Context context);

    void stop();
}
