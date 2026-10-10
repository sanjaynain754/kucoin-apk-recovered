package com.jumio.liveness;

import android.content.Context;
import android.os.SystemClock;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.jumio.commons.camera.Frame;
import com.jumio.core.camera.CameraDataInterface;
import com.jumio.core.camera.CameraDataResult;
import com.jumio.core.camera.CameraDataSettingsModel;
import com.jumio.core.camera.CameraStatistics;
import com.jumio.core.scope.ScopeProviderInterface;
import com.jumio.core.util.JsonUtilKt;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.tencent.bugly.proguard.InterfaceC33730j9;
import com.tencent.qcloud.tuicore.TUIConstants;
import jumio.liveness.AbstractC40785b;
import jumio.liveness.AbstractC40786c;
import jumio.liveness.C40784a;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41775x1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010%\u001a\u00020 H\u0016J\u0010\u0010&\u001a\u00020 2\u0006\u0010'\u001a\u00020(H\u0016J\b\u0010)\u001a\u00020 H\u0016J\b\u0010*\u001a\u00020 H\u0016J\b\u0010+\u001a\u00020\u0019H\u0016J\b\u0010,\u001a\u00020 H\u0002J\b\u0010-\u001a\u00020 H\u0002J\b\u0010.\u001a\u00020 H\u0002J\u0010\u0010/\u001a\u00020 2\u0006\u00100\u001a\u000201H\u0004R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u0011X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u00062"}, m90084d2 = {"Lcom/jumio/liveness/CameraData;", "Lcom/jumio/core/camera/CameraDataInterface;", "<init>", "()V", "daClient", "Lcom/jumio/liveness/DaClient2;", "getDaClient", "()Lcom/jumio/liveness/DaClient2;", "setDaClient", "(Lcom/jumio/liveness/DaClient2;)V", "scopeProvider", "Lcom/jumio/core/scope/ScopeProviderInterface;", "getScopeProvider", "()Lcom/jumio/core/scope/ScopeProviderInterface;", "setScopeProvider", "(Lcom/jumio/core/scope/ScopeProviderInterface;)V", "clientLock", "", "getClientLock", "()Ljava/lang/Object;", "lastId", "", "captureJob", "Lkotlinx/coroutines/Job;", DbParams.KEY_CHANNEL_RESULT, "Lcom/jumio/core/camera/CameraDataResult;", "resultLock", "timestamp", "", "getTimestamp", "()J", "init", "", "context", "Landroid/content/Context;", "cameraDataSettingsModel", "Lcom/jumio/core/camera/CameraDataSettingsModel;", "start", "sendFrame", TypedValues.AttributesType.S_FRAME, "Lcom/jumio/commons/camera/Frame;", InterfaceC33730j9.f70350a, TUIConstants.TUIBeauty.METHOD_DESTROY_XMAGIC, "getResult", "startCapture", "stopCapture", "requestData", "saveEvent", "event", "Lcom/jumio/liveness/DaClient2$Event;", "jumio-liveness_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class CameraData implements CameraDataInterface {

    /* JADX INFO: renamed from: a */
    public DaClient2 f14600a;

    /* JADX INFO: renamed from: b */
    public ScopeProviderInterface f14601b;

    /* JADX INFO: renamed from: d */
    public int f14603d;

    /* JADX INFO: renamed from: e */
    public InterfaceC41775x1 f14604e;

    /* JADX INFO: renamed from: c */
    public final Object f14602c = new Object();

    /* JADX INFO: renamed from: f */
    public final CameraDataResult f14605f = new CameraDataResult();

    /* JADX INFO: renamed from: g */
    public final Object f14606g = new Object();

    /* JADX INFO: renamed from: a */
    public final void m14616a() {
        synchronized (this.f14602c) {
            DaClient2 daClient2 = this.f14600a;
            if (daClient2 != null) {
                AbstractC40786c.m89283a(daClient2, "camera_liveness_req_status", new Pair[]{TuplesKt.m90091to("start_sn", String.valueOf(this.f14603d))}, getTimestamp());
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    @Override // com.jumio.core.camera.CameraDataInterface
    public void destroy() {
        this.f14601b = null;
        this.f14600a = null;
    }

    @NotNull
    /* JADX INFO: renamed from: getClientLock, reason: from getter */
    public final Object getF14602c() {
        return this.f14602c;
    }

    @Nullable
    /* JADX INFO: renamed from: getDaClient, reason: from getter */
    public final DaClient2 getF14600a() {
        return this.f14600a;
    }

    @Override // com.jumio.core.camera.CameraDataInterface
    @NotNull
    public CameraDataResult getResult() {
        CameraDataResult cameraDataResult;
        synchronized (this.f14606g) {
            cameraDataResult = this.f14605f;
        }
        return cameraDataResult;
    }

    @Nullable
    /* JADX INFO: renamed from: getScopeProvider, reason: from getter */
    public final ScopeProviderInterface getF14601b() {
        return this.f14601b;
    }

    @Override // com.jumio.core.camera.CameraDataInterface
    public void init(@NotNull Context context, @NotNull CameraDataSettingsModel cameraDataSettingsModel, @NotNull ScopeProviderInterface scopeProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cameraDataSettingsModel, "cameraDataSettingsModel");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        this.f14601b = scopeProvider;
    }

    public final void saveEvent(@NotNull final DaClient2.Event event) {
        Intrinsics.checkNotNullParameter(event, "event");
        synchronized (this.f14606g) {
            try {
                Object obj = event.get(AbstractC40785b.f90606c);
                String str = obj instanceof String ? (String) obj : null;
                if (str == null) {
                    str = "";
                }
                Object obj2 = event.get(AbstractC40785b.f90605b);
                final boolean z11 = Boolean.parseBoolean(obj2 instanceof String ? (String) obj2 : null);
                Object obj3 = event.get(AbstractC40785b.f90604a);
                String str2 = obj3 instanceof String ? (String) obj3 : null;
                this.f14603d = str2 != null ? Integer.parseInt(str2) : 0;
                if (str.length() <= 0 || !z11) {
                    this.f14605f.addStatistics(new CameraStatistics(this.f14603d, event.getTimestamp(), null, z11, 0, 0L, 0L, 116, null));
                } else {
                    JSONArray jSONArray = new JSONObject(str).getJSONArray(AbstractC40785b.f90607d);
                    Intrinsics.checkNotNullExpressionValue(jSONArray, "getJSONArray(...)");
                    JsonUtilKt.forEach(jSONArray, new Function1() { // from class: com.jumio.liveness.a
                        @Override // p852kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj4) {
                            return CameraData.m14615a(this.f14666b, event, z11, (JSONObject) obj4);
                        }
                    });
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.jumio.core.camera.CameraDataInterface
    public void sendFrame(@NotNull Frame frame) {
        Intrinsics.checkNotNullParameter(frame, "frame");
    }

    public final void setDaClient(@Nullable DaClient2 daClient2) {
        this.f14600a = daClient2;
    }

    public final void setScopeProvider(@Nullable ScopeProviderInterface scopeProviderInterface) {
        this.f14601b = scopeProviderInterface;
    }

    @Override // com.jumio.core.camera.CameraDataInterface
    public void start() {
        InterfaceC41709m0 backgroundScope;
        InterfaceC41775x1 interfaceC41775x1;
        synchronized (this.f14602c) {
            try {
                DaClient2 daClient2 = this.f14600a;
                if (daClient2 != null) {
                    AbstractC40786c.m89283a(daClient2, "camera_liveness_start", new Pair[0], getTimestamp());
                }
                InterfaceC41775x1 interfaceC41775x2 = this.f14604e;
                InterfaceC41775x1 interfaceC41775x1M91104d = null;
                if (interfaceC41775x2 != null && interfaceC41775x2.isActive() && (interfaceC41775x1 = this.f14604e) != null) {
                    InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
                }
                m14616a();
                ScopeProviderInterface scopeProviderInterface = this.f14601b;
                if (scopeProviderInterface != null && (backgroundScope = scopeProviderInterface.getBackgroundScope()) != null) {
                    interfaceC41775x1M91104d = C41696j.m91104d(backgroundScope, null, null, new C40784a(this, null), 3, null);
                }
                this.f14604e = interfaceC41775x1M91104d;
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.jumio.core.camera.CameraDataInterface
    public void stop() {
        InterfaceC41775x1 interfaceC41775x1;
        synchronized (this.f14602c) {
            try {
                InterfaceC41775x1 interfaceC41775x2 = this.f14604e;
                if (interfaceC41775x2 != null && interfaceC41775x2.isActive() && (interfaceC41775x1 = this.f14604e) != null) {
                    InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
                }
                m14616a();
                DaClient2 daClient2 = this.f14600a;
                if (daClient2 != null) {
                    AbstractC40786c.m89283a(daClient2, "camera_liveness_end", new Pair[0], getTimestamp());
                    Unit unit = Unit.INSTANCE;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public long getTimestamp() {
        return SystemClock.uptimeMillis();
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m14615a(CameraData cameraData, DaClient2.Event event, boolean z11, JSONObject it) {
        Intrinsics.checkNotNullParameter(it, "it");
        cameraData.f14605f.addStatistics(new CameraStatistics(it.optInt(AbstractC40785b.f90608e), event.getTimestamp(), null, z11, it.optInt(AbstractC40785b.f90609f), it.optLong(AbstractC40785b.f90610g), it.optLong(AbstractC40785b.f90611h), 4, null));
        return Unit.INSTANCE;
    }
}
