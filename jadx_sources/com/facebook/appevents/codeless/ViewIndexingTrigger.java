package com.facebook.appevents.codeless;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p464n6.C42757a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ViewIndexingTrigger.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0001\u0018\u0000 \u00162\u00020\u0001:\u0002\u0017\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, m90084d2 = {"Lcom/facebook/appevents/codeless/ViewIndexingTrigger;", "Landroid/hardware/SensorEventListener;", "<init>", "()V", "Lcom/facebook/appevents/codeless/ViewIndexingTrigger$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "setOnShakeListener", "(Lcom/facebook/appevents/codeless/ViewIndexingTrigger$a;)V", "Landroid/hardware/SensorEvent;", "event", "onSensorChanged", "(Landroid/hardware/SensorEvent;)V", "Landroid/hardware/Sensor;", "sensor", "", "accuracy", "onAccuracyChanged", "(Landroid/hardware/Sensor;I)V", "b", "Lcom/facebook/appevents/codeless/ViewIndexingTrigger$a;", "onShakeListener", "c", "Companion", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class ViewIndexingTrigger implements SensorEventListener {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public InterfaceC5520a onShakeListener;

    /* JADX INFO: renamed from: com.facebook.appevents.codeless.ViewIndexingTrigger$a */
    /* JADX INFO: compiled from: ViewIndexingTrigger.kt */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m90084d2 = {"Lcom/facebook/appevents/codeless/ViewIndexingTrigger$a;", "", "", "onShake", "()V", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public interface InterfaceC5520a {
        void onShake();
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(@NotNull Sensor sensor, int accuracy) {
        if (C42757a.m93689d(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(sensor, "sensor");
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(@NotNull SensorEvent event) {
        if (!C42757a.m93689d(this)) {
            try {
                Intrinsics.checkNotNullParameter(event, "event");
                InterfaceC5520a interfaceC5520a = this.onShakeListener;
                if (interfaceC5520a != null) {
                    float[] fArr = event.values;
                    double d11 = fArr[0] / 9.80665f;
                    double d12 = fArr[1] / 9.80665f;
                    double d13 = fArr[2] / 9.80665f;
                    if (Math.sqrt((d11 * d11) + (d12 * d12) + (d13 * d13)) > 2.3d) {
                        interfaceC5520a.onShake();
                    }
                }
            } catch (Throwable th2) {
                C42757a.m93687b(th2, this);
            }
        }
    }

    public final void setOnShakeListener(@Nullable InterfaceC5520a listener) {
        if (C42757a.m93689d(this)) {
            return;
        }
        try {
            this.onShakeListener = listener;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
        }
    }
}
