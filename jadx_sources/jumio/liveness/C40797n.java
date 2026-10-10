package jumio.liveness;

import android.content.Context;
import android.graphics.Color;
import android.hardware.SensorEvent;
import android.os.SystemClock;
import androidx.core.content.ContextCompat;
import com.jumio.commons.log.Log;
import com.jumio.core.MobileContext;
import com.jumio.core.extraction.ExtractionUpdateInterface;
import com.jumio.core.extraction.ExtractionUpdateState;
import com.jumio.core.extraction.liveness.extraction.LivenessUpdateState;
import com.jumio.core.models.LivenessSettingsModel;
import com.jumio.core.models.TimeModel;
import com.jumio.core.scope.ScopeProviderInterface;
import com.jumio.core.sensors.SensorConfig;
import com.jumio.core.sensors.SensorFactoryInterfaceKt;
import com.jumio.core.sensors.SensorProxy;
import com.jumio.core.sensors.SensorType;
import com.jumio.liveness.DaClient2;
import com.jumio.liveness.LivenessUX;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import jumio.liveness.C40797n;
import kotlinx.coroutines.C41696j;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.StringCompanionObject;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: jumio.liveness.n */
/* JADX INFO: loaded from: classes61.dex */
public final class C40797n implements LivenessUX.RunHandler {

    /* JADX INFO: renamed from: a */
    public final ScopeProviderInterface f90627a;

    /* JADX INFO: renamed from: b */
    public DaClient2 f90628b;

    /* JADX INFO: renamed from: c */
    public LivenessUX f90629c;

    /* JADX INFO: renamed from: d */
    public C40808y f90630d;

    /* JADX INFO: renamed from: e */
    public C40773B f90631e;

    /* JADX INFO: renamed from: f */
    public EnumC40801r f90632f;

    /* JADX INFO: renamed from: g */
    public final Object f90633g;

    /* JADX INFO: renamed from: h */
    public final Object f90634h;

    /* JADX INFO: renamed from: i */
    public final Object f90635i;

    /* JADX INFO: renamed from: j */
    public final C40787d f90636j;

    /* JADX INFO: renamed from: k */
    public final C40781J f90637k;

    /* JADX INFO: renamed from: l */
    public final C40802s f90638l;

    /* JADX INFO: renamed from: m */
    public final ConcurrentHashMap f90639m;

    /* JADX INFO: renamed from: n */
    public SensorProxy f90640n;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:117:0x0356  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:48:0x0112  */
    /* JADX WARN: Code duplicated, block: B:67:0x01b2  */
    /* JADX WARN: Instruction removed from duplicated block: B:117:0x0356, please report this as an issue */
    /* JADX INFO: renamed from: a */
    public static final void m89286a(C40797n c40797n, DaClient2.Event event) {
        int iRgb;
        LivenessSettingsModel livenessSettingsModel;
        c40797n.getClass();
        Pair<String, Object>[] attributes = event.getAttributes();
        int length = attributes.length;
        int i11 = 0;
        while (i11 < length) {
            Pair<String, Object> pair = attributes[i11];
            String strComponent1 = pair.component1();
            Object objComponent2 = pair.component2();
            if (objComponent2 instanceof String) {
                switch (strComponent1) {
                    case "ui_command":
                        String str = (String) objComponent2;
                        if (Intrinsics.areEqual(str, "hint_move_away")) {
                            c40797n.m89290a(EnumC40801r.FAR);
                        } else if (Intrinsics.areEqual(str, "hint_move_closer")) {
                            c40797n.m89290a(EnumC40801r.NEAR);
                        }
                    case "step_name":
                        String str2 = (String) objComponent2;
                        synchronized (c40797n.f90633g) {
                            Log.m14479v("DefaultDaClient", "Distance captured: " + str2);
                            c40797n.f90632f = EnumC40801r.f90641a.fromStepName(str2);
                            Unit unit = Unit.INSTANCE;
                        }
                    case "photinus_color":
                        String str3 = (String) objComponent2;
                        List listSplit$default = StringsKt.split$default((CharSequence) str3, new String[]{","}, false, 3, 2, (Object) null);
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSplit$default, 10));
                        Iterator it = listSplit$default.iterator();
                        while (it.hasNext()) {
                            arrayList.add(Float.valueOf(Float.parseFloat((String) it.next())));
                        }
                        if (arrayList.size() != 3 || arrayList.contains(Float.valueOf(-1.0f))) {
                            iRgb = 0;
                        } else {
                            float f11 = 255;
                            iRgb = Color.rgb((int) (((Number) arrayList.get(0)).floatValue() * f11), (int) (((Number) arrayList.get(1)).floatValue() * f11), (int) (f11 * ((Number) arrayList.get(2)).floatValue()));
                        }
                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                        String str4 = String.format("#%08X", Arrays.copyOf(new Object[]{Integer.valueOf(iRgb)}, 1));
                        Intrinsics.checkNotNullExpressionValue(str4, "format(...)");
                        Log.m14461d("Converted color " + str3 + " -> " + str4);
                        c40797n.m89289a(ExtractionUpdateInterface.Companion.build$default(ExtractionUpdateInterface.INSTANCE, LivenessUpdateState.INSTANCE.getUpdateColor(), Integer.valueOf(iRgb), null, 4, null));
                    case "camera_command":
                        String str5 = (String) objComponent2;
                        if (Intrinsics.areEqual(str5, "lock_exposure_and_white_balance")) {
                            c40797n.m89289a(ExtractionUpdateInterface.Companion.build$default(ExtractionUpdateInterface.INSTANCE, ExtractionUpdateState.INSTANCE.getLockExposureAndWhiteBalance(), Boolean.TRUE, null, 4, null));
                        } else if (Intrinsics.areEqual(str5, "unlock_exposure_and_white_balance")) {
                            c40797n.m89289a(ExtractionUpdateInterface.Companion.build$default(ExtractionUpdateInterface.INSTANCE, ExtractionUpdateState.INSTANCE.getLockExposureAndWhiteBalance(), Boolean.FALSE, null, 4, null));
                        }
                    case "display_message":
                        String str6 = (String) objComponent2;
                        switch (str6) {
                            case "face_hold_still":
                                ExtractionUpdateInterface.Companion companion = ExtractionUpdateInterface.INSTANCE;
                                int holdStill = ExtractionUpdateState.INSTANCE.getHoldStill();
                                C40773B c40773b = c40797n.f90631e;
                                C40808y c40808y = null;
                                c40797n.m89289a(ExtractionUpdateInterface.Companion.build$default(companion, holdStill, (c40773b == null || (livenessSettingsModel = c40773b.f90569b) == null) ? null : Long.valueOf(livenessSettingsModel.getMinTimePerDistanceInMs()), null, 4, null));
                                C40808y c40808y2 = c40797n.f90630d;
                                if (c40808y2 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("livenessProcessorCallback");
                                } else {
                                    c40808y = c40808y2;
                                }
                                c40808y.getClass();
                                new C40804u(c40808y.f90651a).invoke();
                                Unit unit2 = Unit.INSTANCE;
                                break;
                            case "face_tilt_down":
                                c40797n.m89289a(ExtractionUpdateInterface.Companion.build$default(ExtractionUpdateInterface.INSTANCE, LivenessUpdateState.INSTANCE.getFaceTiltDown(), null, null, 4, null));
                                Unit unit3 = Unit.INSTANCE;
                                break;
                            case "face_tilt_left":
                                c40797n.m89289a(ExtractionUpdateInterface.Companion.build$default(ExtractionUpdateInterface.INSTANCE, LivenessUpdateState.INSTANCE.getFaceTiltLeft(), null, null, 4, null));
                                Unit unit4 = Unit.INSTANCE;
                                break;
                            case "face_tilt_up":
                                c40797n.m89289a(ExtractionUpdateInterface.Companion.build$default(ExtractionUpdateInterface.INSTANCE, LivenessUpdateState.INSTANCE.getFaceTiltUp(), null, null, 4, null));
                                Unit unit5 = Unit.INSTANCE;
                                break;
                            case "face_not_upright":
                                c40797n.m89289a(ExtractionUpdateInterface.Companion.build$default(ExtractionUpdateInterface.INSTANCE, LivenessUpdateState.INSTANCE.getLevelEyesAndDevice(), null, null, 4, null));
                                Unit unit6 = Unit.INSTANCE;
                                break;
                            case "face_none_detected":
                                c40797n.m89289a(ExtractionUpdateInterface.Companion.build$default(ExtractionUpdateInterface.INSTANCE, LivenessUpdateState.INSTANCE.getMoveFaceIntoFrame(), null, null, 4, null));
                                Unit unit7 = Unit.INSTANCE;
                                break;
                            case "face_tilt_right":
                                c40797n.m89289a(ExtractionUpdateInterface.Companion.build$default(ExtractionUpdateInterface.INSTANCE, LivenessUpdateState.INSTANCE.getFaceTiltRight(), null, null, 4, null));
                                Unit unit8 = Unit.INSTANCE;
                                break;
                            case "face_move_away":
                                c40797n.m89289a(ExtractionUpdateInterface.Companion.build$default(ExtractionUpdateInterface.INSTANCE, LivenessUpdateState.INSTANCE.getFaceTooClose(), null, null, 4, null));
                                Unit unit9 = Unit.INSTANCE;
                                break;
                            case "start":
                                c40797n.m89289a(ExtractionUpdateInterface.Companion.build$default(ExtractionUpdateInterface.INSTANCE, LivenessUpdateState.INSTANCE.getMoveFaceIntoFrame(), null, null, 4, null));
                                Unit unit10 = Unit.INSTANCE;
                                break;
                            case "face_keep_center":
                                c40797n.m89289a(ExtractionUpdateInterface.Companion.build$default(ExtractionUpdateInterface.INSTANCE, LivenessUpdateState.INSTANCE.getCenterFace(), null, null, 4, null));
                                Unit unit11 = Unit.INSTANCE;
                                break;
                            case "face_move_closer":
                                c40797n.m89289a(ExtractionUpdateInterface.Companion.build$default(ExtractionUpdateInterface.INSTANCE, LivenessUpdateState.INSTANCE.getMoveFaceCloser(), null, null, 4, null));
                                Unit unit12 = Unit.INSTANCE;
                                break;
                            case "face_keep_center_severe":
                                c40797n.m89289a(ExtractionUpdateInterface.Companion.build$default(ExtractionUpdateInterface.INSTANCE, LivenessUpdateState.INSTANCE.getMoveFaceIntoFrame(), null, null, 4, null));
                                Unit unit13 = Unit.INSTANCE;
                                break;
                            case "more_captures_needed":
                                c40797n.m89289a(c40797n.m89287a());
                                c40797n.m89289a(ExtractionUpdateInterface.Companion.build$default(ExtractionUpdateInterface.INSTANCE, LivenessUpdateState.INSTANCE.getNextPosition(), null, null, 4, null));
                                Unit unit14 = Unit.INSTANCE;
                                break;
                            case "face_stop_movement":
                                c40797n.m89289a(ExtractionUpdateInterface.Companion.build$default(ExtractionUpdateInterface.INSTANCE, LivenessUpdateState.INSTANCE.getCenterFace(), null, null, 4, null));
                                Unit unit15 = Unit.INSTANCE;
                                break;
                            default:
                                Log.m14463d("DefaultDaClient", "unhandled display command: ".concat(str6));
                                Unit unit16 = Unit.INSTANCE;
                                break;
                        }
                    default:
                        Log.m14463d("DefaultDaClient", "Unhandled attribute: " + strComponent1 + " with value: " + ((String) objComponent2));
                }
            } else {
                return;
            }
        }
    }

    public C40797n(ScopeProviderInterface scopeProvider) {
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        this.f90627a = scopeProvider;
        this.f90632f = EnumC40801r.INITIAL;
        this.f90633g = new Object();
        this.f90634h = new Object();
        this.f90635i = new Object();
        this.f90636j = new C40787d(new C40788e(this), new C40789f(this));
        this.f90637k = new C40781J(new C40792i(this), new C40793j(this));
        this.f90638l = new C40802s();
        this.f90639m = new ConcurrentHashMap();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m89292b() {
        boolean z11;
        boolean z12;
        if (this.f90630d != null && this.f90631e != null) {
            synchronized (this.f90634h) {
                DaClient2 daClient2 = this.f90628b;
                z11 = (daClient2 == null || daClient2.isClosed()) ? false : true;
            }
            if (z11) {
                synchronized (this.f90635i) {
                    LivenessUX livenessUX = this.f90629c;
                    z12 = (livenessUX == null || livenessUX.isClosed()) ? false : true;
                }
                if (z12) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final void m89293c() {
        SensorProxy sensorProxy = this.f90640n;
        if (sensorProxy != null) {
            sensorProxy.stop();
        }
        m89295e();
        m89294d();
        this.f90631e = null;
        this.f90638l.m89301a();
        this.f90639m.clear();
    }

    /* JADX INFO: renamed from: d */
    public final void m89294d() {
        synchronized (this.f90634h) {
            try {
                DaClient2 daClient2 = this.f90628b;
                if (daClient2 != null) {
                    daClient2.stop();
                    daClient2.setEventHandler(null);
                    daClient2.close();
                }
                this.f90628b = null;
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m89295e() {
        synchronized (this.f90635i) {
            try {
                LivenessUX livenessUX = this.f90629c;
                if (livenessUX != null) {
                    livenessUX.setEventHandler(null);
                    livenessUX.close();
                }
                this.f90629c = null;
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.jumio.liveness.LivenessUX.RunHandler
    public final void onFinishRun(Exception exc) {
        Log log = Log.INSTANCE;
        StringBuilder sb2 = new StringBuilder("onFinishRun: Exception=");
        sb2.append(exc != null ? exc.getMessage() : null);
        Log.logThreadInfoWithMessage$default(log, sb2.toString(), "DefaultDaClient", null, 4, null);
        if (exc == null) {
            C41696j.m91104d(this.f90627a.getMainScope(), null, null, new C40795l(this, null), 3, null);
            return;
        }
        C40808y c40808y = this.f90630d;
        if (c40808y == null) {
            Intrinsics.throwUninitializedPropertyAccessException("livenessProcessorCallback");
            c40808y = null;
        }
        c40808y.getClass();
        new C40805v(c40808y.f90651a).invoke(exc);
        C41696j.m91104d(this.f90627a.getMainScope(), null, null, new C40794k(this, null), 3, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m89291a(C40808y livenessProcessorCallback, C40773B livenessProcessorConfig) {
        Intrinsics.checkNotNullParameter(livenessProcessorCallback, "livenessProcessorCallback");
        Intrinsics.checkNotNullParameter(livenessProcessorConfig, "livenessProcessorConfig");
        m89293c();
        this.f90630d = livenessProcessorCallback;
        this.f90631e = livenessProcessorConfig;
        Log.m14474i("DefaultDaClient", "Starting " + Reflection.getOrCreateKotlinClass(C40809z.class).getSimpleName());
        m89290a(EnumC40801r.INITIAL);
        C41696j.m91104d(this.f90627a.getMainScope(), null, null, new C40796m(this, livenessProcessorConfig, livenessProcessorCallback, null), 3, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m89288a(Context context, final TimeModel timeModel) {
        MobileContext mobileContext;
        C40773B c40773b = this.f90631e;
        final int i11 = (c40773b == null || (mobileContext = c40773b.f90568a) == null || ContextCompat.checkSelfPermission(mobileContext, "android.permission.HIGH_SAMPLING_RATE_SENSORS") != 0) ? 3 : 0;
        SensorProxy sensorProxy = new SensorProxy(new Function1() { // from class: mg0.a
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C40797n.m89284a(timeModel, i11, (List) obj);
            }
        });
        sensorProxy.setCallback(CollectionsKt.listOf((Object[]) new SensorType[]{SensorType.LINEAR_ACCELEROMETER, SensorType.GYROSCOPE}), new Function1() { // from class: mg0.b
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C40797n.m89285a(this.f94215b, (SensorEvent) obj);
            }
        });
        sensorProxy.start(context);
        this.f90640n = sensorProxy;
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m89284a(TimeModel timeModel, int i11, List SensorProxy) {
        Intrinsics.checkNotNullParameter(SensorProxy, "$this$SensorProxy");
        SensorConfig sensorConfig = new SensorConfig(timeModel, i11, null, 4, null);
        SensorProxy.add(SensorFactoryInterfaceKt.getSensorFactory().getSensor(SensorType.LINEAR_ACCELEROMETER, sensorConfig));
        SensorProxy.add(SensorFactoryInterfaceKt.getSensorFactory().getSensor(SensorType.GYROSCOPE, sensorConfig));
        SensorProxy.add(SensorFactoryInterfaceKt.getSensorFactory().getSensor(SensorType.LIGHT, new SensorConfig(timeModel, 3, null, 4, null)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m89285a(C40797n c40797n, SensorEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        DaClient2 daClient2 = c40797n.f90628b;
        if (daClient2 != null) {
            daClient2.sendSensorEvent(SystemClock.uptimeMillis(), event);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public final ExtractionUpdateInterface m89287a() {
        ExtractionUpdateInterface extractionUpdateInterfaceBuild;
        synchronized (this.f90633g) {
            extractionUpdateInterfaceBuild = ExtractionUpdateInterface.INSTANCE.build(ExtractionUpdateState.INSTANCE.getShotTaken(), null, this.f90638l.m89300a(this.f90632f));
        }
        return extractionUpdateInterfaceBuild;
    }

    /* JADX INFO: renamed from: a */
    public final void m89290a(EnumC40801r enumC40801r) {
        float f11;
        int iOrdinal = enumC40801r.ordinal();
        if (iOrdinal != 0) {
            f11 = iOrdinal != 2 ? 0.8f : 0.625f;
        } else {
            f11 = 0.7125f;
        }
        m89289a(ExtractionUpdateInterface.Companion.build$default(ExtractionUpdateInterface.INSTANCE, ExtractionUpdateState.INSTANCE.getResetOverlay(), Float.valueOf(f11), null, 4, null));
    }

    /* JADX INFO: renamed from: a */
    public final void m89289a(ExtractionUpdateInterface updateState) {
        C40808y c40808y;
        String str;
        C40802s c40802s = this.f90638l;
        synchronized (c40802s) {
            try {
                Intrinsics.checkNotNullParameter(updateState, "updateState");
                Integer f13842a = updateState.getF13842a();
                c40808y = null;
                if (f13842a != null) {
                    int iIntValue = f13842a.intValue();
                    LivenessUpdateState livenessUpdateState = LivenessUpdateState.INSTANCE;
                    if (iIntValue == livenessUpdateState.getMoveFaceIntoFrame()) {
                        str = "noFace";
                    } else if (iIntValue == livenessUpdateState.getCenterFace()) {
                        str = "centerFace";
                    } else if (iIntValue == livenessUpdateState.getFaceTooClose()) {
                        str = "faceTooClose";
                    } else if (iIntValue == livenessUpdateState.getMoveFaceCloser()) {
                        str = "moveFaceCloser";
                    } else if (iIntValue == livenessUpdateState.getLevelEyesAndDevice()) {
                        str = "levelEyesAndDevice";
                    } else if (iIntValue == livenessUpdateState.getFaceTiltUp()) {
                        str = "tiltFaceUp";
                    } else if (iIntValue == livenessUpdateState.getFaceTiltDown()) {
                        str = "tiltFaceDown";
                    } else if (iIntValue == livenessUpdateState.getFaceTiltLeft()) {
                        str = "tiltFaceLeft";
                    } else if (iIntValue == livenessUpdateState.getFaceTiltRight()) {
                        str = "tiltFaceRight";
                    } else {
                        str = iIntValue == ExtractionUpdateState.INSTANCE.getHoldStill() ? "holdStill" : null;
                    }
                    if (str != null) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        String str2 = c40802s.f90646a;
                        if (str2 != null) {
                            Long l11 = (Long) c40802s.f90648c.get(str2);
                            long jLongValue = l11 != null ? l11.longValue() : 0L;
                            Long l12 = c40802s.f90647b;
                            if (l12 != null) {
                                c40802s.f90648c.put(str2, Long.valueOf((jCurrentTimeMillis - l12.longValue()) + jLongValue));
                            }
                        }
                        c40802s.f90647b = Long.valueOf(jCurrentTimeMillis);
                        c40802s.f90646a = str;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        C40808y c40808y2 = this.f90630d;
        if (c40808y2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("livenessProcessorCallback");
        } else {
            c40808y = c40808y2;
        }
        c40808y.getClass();
        new C40807x(c40808y.f90651a).invoke(updateState);
    }
}
