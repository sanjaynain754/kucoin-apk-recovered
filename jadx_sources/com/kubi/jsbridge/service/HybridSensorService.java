package com.kubi.jsbridge.service;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.OnLifecycleEvent;
import com.kubi.jsbridge.service.HybridSensorService;
import com.kubi.sdk.web.jsapi.JsEventDispatcher;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p503ok.InterfaceC43106c;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: HybridSensorService.kt */
/* JADX INFO: loaded from: classes17.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\u0012\u0010\u0016\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u001a\u0010\u0019\u001a\u00020\u00142\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u001a\u001a\u00020\u001bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u000e\u001a\u0004\u0018\u00010\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/jsbridge/service/HybridSensorService;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lcom/kubi/jsbridge/service/IHybridService;", "Landroid/hardware/SensorEventListener;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "manager", "Landroid/hardware/SensorManager;", "getManager", "()Landroid/hardware/SensorManager;", "manager$delegate", "Lkotlin/Lazy;", "sensor", "Landroid/hardware/Sensor;", "getSensor", "()Landroid/hardware/Sensor;", "sensor$delegate", "bind", "", "unbind", "onSensorChanged", "event", "Landroid/hardware/SensorEvent;", "onAccuracyChanged", "accuracy", "", "WebBridgeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class HybridSensorService extends AtomicBoolean implements InterfaceC43106c, SensorEventListener {

    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: manager$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy manager;

    /* JADX INFO: renamed from: sensor$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy sensor;

    @Override // p503ok.InterfaceC43106c
    public void bind() {
        if (compareAndSet(false, true)) {
            m31860c().registerListener(this, m31861d(), 3);
        }
    }

    @Override // p503ok.InterfaceC43106c
    public void unbind() {
        if (compareAndSet(true, false)) {
            m31860c().unregisterListener(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HybridSensorService(@NotNull Context context) {
        super(false);
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.manager = LazyKt.lazy(new Function0() { // from class: ok.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HybridSensorService.m31858e(this.f95309b);
            }
        });
        this.sensor = LazyKt.lazy(new Function0() { // from class: ok.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HybridSensorService.m31859f(this.f95310b);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public static final SensorManager m31858e(HybridSensorService hybridSensorService) {
        Object systemService = hybridSensorService.context.getSystemService("sensor");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
        return (SensorManager) systemService;
    }

    /* JADX INFO: renamed from: c */
    public final SensorManager m31860c() {
        return (SensorManager) this.manager.getValue();
    }

    /* JADX INFO: renamed from: d */
    public final Sensor m31861d() {
        return (Sensor) this.sensor.getValue();
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(@Nullable SensorEvent event) throws JSONException {
        if ((event != null ? event.sensor : null) != null && event.sensor.getType() == 1) {
            float[] fArr = event.values;
            float f11 = fArr[0];
            float f12 = fArr[1];
            float f13 = fArr[2];
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("x", Float.valueOf(f11));
            jSONObject.put("y", Float.valueOf(f12));
            jSONObject.put("z", Float.valueOf(f13));
            JsEventDispatcher jsEventDispatcher = JsEventDispatcher.f48474a;
            String string = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            jsEventDispatcher.m58755b("onAccelerationChange", string);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final Sensor m31859f(HybridSensorService hybridSensorService) {
        return hybridSensorService.m31860c().getDefaultSensor(1);
    }

    @Override // p503ok.InterfaceC43106c
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public /* bridge */ /* synthetic */ void onDestroy() {
        super.onDestroy();
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(@Nullable Sensor sensor, int accuracy) {
    }
}
