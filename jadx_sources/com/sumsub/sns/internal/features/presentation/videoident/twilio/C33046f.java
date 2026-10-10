package com.sumsub.sns.internal.features.presentation.videoident.twilio;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import com.sumsub.sns.internal.features.presentation.videoident.AbstractC32895a;
import com.twilio.video.Camera2Capturer;
import com.twilio.video.CameraCapturer;
import com.twilio.video.VideoCapturer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.ArrayIteratorKt;
import tvi.webrtc.Camera1Enumerator;
import tvi.webrtc.Camera2Enumerator;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.videoident.twilio.f */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C33046f implements VideoCapturer {

    /* JADX INFO: renamed from: a */
    public CameraCapturer f67429a;

    /* JADX INFO: renamed from: b */
    public Camera2Capturer f67430b;

    /* JADX INFO: renamed from: c */
    public VideoCapturer f67431c;

    /* JADX INFO: renamed from: h */
    public CameraManager f67436h;

    /* JADX INFO: renamed from: d */
    public final HashMap f67432d = new HashMap();

    /* JADX INFO: renamed from: e */
    public final HashMap f67433e = new HashMap();

    /* JADX INFO: renamed from: f */
    public final HashMap f67434f = new HashMap();

    /* JADX INFO: renamed from: g */
    public final HashMap f67435g = new HashMap();

    /* JADX INFO: renamed from: i */
    public final C33043c f67437i = new C33043c();

    /* JADX INFO: renamed from: a */
    public final boolean m71428a(Context context, CameraCapturerCompat$Source cameraCapturerCompat$Source) {
        boolean zIsSupported = Camera2Capturer.isSupported(context);
        AbstractC32895a.m71366a("Camera2 is supported: " + zIsSupported);
        if (!zIsSupported) {
            Camera1Enumerator camera1Enumerator = new Camera1Enumerator();
            Iterator it = ArrayIteratorKt.iterator(camera1Enumerator.getDeviceNames());
            while (it.hasNext()) {
                String str = (String) it.next();
                if (camera1Enumerator.isFrontFacing(str)) {
                    HashMap map = this.f67432d;
                    CameraCapturerCompat$Source cameraCapturerCompat$Source2 = CameraCapturerCompat$Source.FRONT_CAMERA;
                    map.put(cameraCapturerCompat$Source2, str);
                    this.f67433e.put(str, cameraCapturerCompat$Source2);
                }
                if (camera1Enumerator.isBackFacing(str)) {
                    HashMap map2 = this.f67432d;
                    CameraCapturerCompat$Source cameraCapturerCompat$Source3 = CameraCapturerCompat$Source.BACK_CAMERA;
                    map2.put(cameraCapturerCompat$Source3, str);
                    this.f67433e.put(str, cameraCapturerCompat$Source3);
                }
            }
            HashMap map3 = this.f67432d;
            String str2 = (String) map3.get(cameraCapturerCompat$Source);
            if (str2 == null) {
                str2 = map3.isEmpty() ? null : (String) new LinkedList(map3.values()).getFirst();
            }
            if (str2 == null) {
                return false;
            }
            CameraCapturer cameraCapturer = new CameraCapturer(context, str2, this.f67437i);
            this.f67429a = cameraCapturer;
            this.f67431c = cameraCapturer;
            this.f67430b = null;
            return true;
        }
        CameraManager cameraManager = (CameraManager) context.getSystemService("camera");
        this.f67436h = cameraManager;
        Camera2Enumerator camera2Enumerator = new Camera2Enumerator(context);
        List list = ArraysKt.toList(camera2Enumerator.getDeviceNames());
        String strM71426a = m71426a(this, cameraManager, list, new C33045e(camera2Enumerator));
        String strM71426a2 = m71426a(this, cameraManager, list, new C33044d(camera2Enumerator));
        if (strM71426a != null) {
            HashMap map4 = this.f67434f;
            CameraCapturerCompat$Source cameraCapturerCompat$Source4 = CameraCapturerCompat$Source.FRONT_CAMERA;
            map4.put(cameraCapturerCompat$Source4, strM71426a);
            this.f67435g.put(strM71426a, cameraCapturerCompat$Source4);
        } else {
            AbstractC32895a.m71366a("Camera2: Front camera was not found");
        }
        if (strM71426a2 != null) {
            HashMap map5 = this.f67434f;
            CameraCapturerCompat$Source cameraCapturerCompat$Source5 = CameraCapturerCompat$Source.BACK_CAMERA;
            map5.put(cameraCapturerCompat$Source5, strM71426a2);
            this.f67435g.put(strM71426a2, cameraCapturerCompat$Source5);
        } else {
            AbstractC32895a.m71366a("Camera2: Back camera was not found");
        }
        HashMap map6 = this.f67434f;
        String str3 = (String) map6.get(cameraCapturerCompat$Source);
        if (str3 == null) {
            str3 = map6.isEmpty() ? null : (String) new LinkedList(map6.values()).getFirst();
        }
        if (str3 == null) {
            return false;
        }
        Camera2Capturer camera2Capturer = new Camera2Capturer(context, str3);
        this.f67430b = camera2Capturer;
        this.f67431c = camera2Capturer;
        this.f67429a = null;
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final CameraCapturerCompat$Source m71429b() {
        HashMap map;
        HashMap map2;
        String str;
        CameraCapturerCompat$Source cameraCapturerCompat$SourceM71427a = m71427a();
        CameraCapturer cameraCapturer = this.f67429a;
        if (cameraCapturer != null) {
            map = this.f67433e;
        } else {
            map = this.f67435g;
        }
        if (cameraCapturer != null) {
            map2 = this.f67432d;
        } else {
            map2 = this.f67434f;
        }
        CameraCapturerCompat$Source cameraCapturerCompat$Source = CameraCapturerCompat$Source.FRONT_CAMERA;
        if (cameraCapturerCompat$Source == cameraCapturerCompat$SourceM71427a) {
            str = (String) map2.get(CameraCapturerCompat$Source.BACK_CAMERA);
        } else {
            str = (String) map2.get(cameraCapturerCompat$Source);
        }
        if (str != null) {
            CameraCapturer cameraCapturer2 = this.f67429a;
            if (cameraCapturer2 != null) {
                cameraCapturer2.switchCamera(str);
            } else {
                this.f67430b.switchCamera(str);
            }
        }
        return (CameraCapturerCompat$Source) map.get(str);
    }

    /* JADX INFO: renamed from: a */
    public final CameraCapturerCompat$Source m71427a() {
        CameraCapturer cameraCapturer = this.f67429a;
        if (cameraCapturer != null) {
            return (CameraCapturerCompat$Source) this.f67433e.get(cameraCapturer.getCameraId());
        }
        Camera2Capturer camera2Capturer = this.f67430b;
        if (camera2Capturer != null) {
            return (CameraCapturerCompat$Source) this.f67435g.get(camera2Capturer.getCameraId());
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static final String m71426a(C33046f c33046f, CameraManager cameraManager, List list, Function1 function1) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            boolean z11 = false;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            try {
                CameraCharacteristics cameraCharacteristics = c33046f.f67436h.getCameraCharacteristics((String) next);
                StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                boolean zIsOutputSupportedFor = streamConfigurationMap != null ? streamConfigurationMap.isOutputSupportedFor(34) : false;
                Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_COLOR_FILTER_ARRANGEMENT);
                if (Build.VERSION.SDK_INT >= 29 && num != null && (num.intValue() == 5 || num.intValue() == 6)) {
                    z11 = true;
                }
                if (zIsOutputSupportedFor && !z11) {
                    arrayList.add(next);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj2 = arrayList.get(i11);
            i11++;
            if (((Boolean) function1.invoke(obj2)).booleanValue()) {
                arrayList2.add(obj2);
            }
        }
        int size2 = arrayList2.size();
        int i12 = 0;
        loop2: while (true) {
            if (i12 >= size2) {
                obj = null;
                break;
            }
            obj = arrayList2.get(i12);
            i12++;
            int[] iArr = (int[]) cameraManager.getCameraCharacteristics((String) obj).get(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
            if (iArr != null) {
                int length = iArr.length;
                int i13 = 0;
                while (true) {
                    if (i13 >= length) {
                        break loop2;
                    }
                    if (iArr[i13] == 0) {
                        break;
                    }
                    i13++;
                }
            }
        }
        String str = (String) obj;
        return str == null ? (String) CollectionsKt.firstOrNull((List) arrayList2) : str;
    }
}
