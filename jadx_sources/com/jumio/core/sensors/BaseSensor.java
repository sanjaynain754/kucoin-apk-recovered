package com.jumio.core.sensors;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.jumio.commons.log.Log;
import com.jumio.core.models.TimeModel;
import com.tencent.bugly.proguard.InterfaceC33730j9;
import com.tencent.qcloud.tuicore.TUIConstants;
import jumio.core.C40540H3;
import jumio.core.C40687l;
import jumio.core.InterfaceC40550J3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020!H\u0016J\u001c\u0010&\u001a\u00020!2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001fH\u0016J\b\u0010(\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020!H\u0016J\u0012\u0010+\u001a\u00020!2\b\u0010,\u001a\u0004\u0018\u00010 H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006-"}, m90084d2 = {"Lcom/jumio/core/sensors/BaseSensor;", "Lcom/jumio/core/sensors/SensorInterface;", "type", "Lcom/jumio/core/sensors/SensorType;", "config", "Lcom/jumio/core/sensors/SensorConfig;", "<init>", "(Lcom/jumio/core/sensors/SensorType;Lcom/jumio/core/sensors/SensorConfig;)V", "getType", "()Lcom/jumio/core/sensors/SensorType;", "getConfig", "()Lcom/jumio/core/sensors/SensorConfig;", "latestData", "", "getLatestData", "()[F", "setLatestData", "([F)V", "initialTimestamp", "", "getInitialTimestamp", "()J", "setInitialTimestamp", "(J)V", "sensorManager", "Landroid/hardware/SensorManager;", "sensor", "Landroid/hardware/Sensor;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroid/hardware/SensorEventListener;", "onEventCallback", "Lkotlin/Function1;", "Landroid/hardware/SensorEvent;", "", "start", "context", "Landroid/content/Context;", InterfaceC33730j9.f70350a, "setEventCallback", TUIConstants.TUIChat.CALL_BACK, "getResult", "Lcom/jumio/core/sensors/SensorResult;", "resetAllData", "handleSensorEvent", "event", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class BaseSensor implements SensorInterface {

    /* JADX INFO: renamed from: a */
    public final SensorType f14557a;

    /* JADX INFO: renamed from: b */
    public final SensorConfig f14558b;

    /* JADX INFO: renamed from: c */
    public float[] f14559c;

    /* JADX INFO: renamed from: d */
    public long f14560d;

    /* JADX INFO: renamed from: e */
    public SensorManager f14561e;

    /* JADX INFO: renamed from: f */
    public Sensor f14562f;

    /* JADX INFO: renamed from: g */
    public C40687l f14563g;

    /* JADX INFO: renamed from: h */
    public Function1 f14564h;

    @Override // com.jumio.core.sensors.SensorInterface
    @NotNull
    public synchronized float[] getLatestData() {
        return this.f14559c;
    }

    public synchronized void setLatestData(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<set-?>");
        this.f14559c = fArr;
    }

    public BaseSensor(@NotNull SensorType type, @NotNull SensorConfig config) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f14557a = type;
        this.f14558b = config;
        this.f14559c = config.getDefaultValue();
    }

    @NotNull
    /* JADX INFO: renamed from: getConfig, reason: from getter */
    public final SensorConfig getF14558b() {
        return this.f14558b;
    }

    @Override // com.jumio.core.sensors.SensorInterface
    /* JADX INFO: renamed from: getInitialTimestamp, reason: from getter */
    public long getF14560d() {
        return this.f14560d;
    }

    @Override // com.jumio.core.sensors.SensorInterface
    @NotNull
    public InterfaceC40550J3 getResult() {
        return new C40540H3(getF14557a());
    }

    @Override // com.jumio.core.sensors.SensorInterface
    @NotNull
    /* JADX INFO: renamed from: getType, reason: from getter */
    public SensorType getF14557a() {
        return this.f14557a;
    }

    @Override // com.jumio.core.sensors.SensorInterface
    public void resetAllData() {
        setInitialTimestamp(TimeModel.getCurrentTime$default(this.f14558b.getTimeModel(), 0L, 1, null));
        setLatestData(new float[]{0.0f, 0.0f, 0.0f});
    }

    @Override // com.jumio.core.sensors.SensorInterface
    public void setEventCallback(@NotNull Function1<? super SensorEvent, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f14564h = callback;
    }

    public void setInitialTimestamp(long j11) {
        this.f14560d = j11;
    }

    @Override // com.jumio.core.sensors.SensorInterface
    public void start(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        stop();
        Object systemService = context.getSystemService("sensor");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
        SensorManager sensorManager = (SensorManager) systemService;
        this.f14561e = sensorManager;
        Sensor defaultSensor = sensorManager != null ? sensorManager.getDefaultSensor(getF14557a().getAndroidSensorType()) : null;
        this.f14562f = defaultSensor;
        if (defaultSensor == null) {
            this.f14561e = null;
            Log.m14463d("BaseSensor", "Sensor not available on this device");
            return;
        }
        C40687l c40687l = new C40687l(this);
        this.f14563g = c40687l;
        SensorManager sensorManager2 = this.f14561e;
        if (sensorManager2 != null) {
            sensorManager2.registerListener(c40687l, defaultSensor, this.f14558b.getCaptureDelay() * 1000, this.f14558b.getCaptureDelay() * 1000);
        }
        StringBuilder sb2 = new StringBuilder("Sensor ");
        Sensor sensor = this.f14562f;
        sb2.append(sensor != null ? sensor.getName() : null);
        sb2.append(" started");
        Log.m14463d("BaseSensor", sb2.toString());
    }

    @Override // com.jumio.core.sensors.SensorInterface
    public void stop() {
        Sensor sensor = this.f14562f;
        String name = sensor != null ? sensor.getName() : null;
        SensorManager sensorManager = this.f14561e;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this.f14563g);
        }
        this.f14561e = null;
        this.f14563g = null;
        this.f14562f = null;
        Log.m14463d("BaseSensor", "Sensor " + name + " stopped");
    }

    public void handleSensorEvent(@Nullable SensorEvent event) {
    }
}
