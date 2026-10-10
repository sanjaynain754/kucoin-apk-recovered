package d90;

import android.content.Context;
import android.hardware.SensorManager;
import android.text.TextUtils;
import com.jumio.commons.log.LogUtils;
import com.tencent.bugly.proguard.C34052z4;
import com.tencent.thumbplayer.tcmedia.core.common.TPSystemInfo;

/* JADX INFO: renamed from: d90.e */
/* JADX INFO: compiled from: EmulatorCheckUtil.java */
/* JADX INFO: loaded from: classes23.dex */
public class C36649e {

    /* JADX INFO: renamed from: d90.e$b */
    /* JADX INFO: compiled from: EmulatorCheckUtil.java */
    public static class b {

        /* JADX INFO: renamed from: a */
        public static final C36649e f79447a = new C36649e();
    }

    /* JADX INFO: renamed from: e */
    public final C36645a m81997e() {
        int i11 = 2;
        byte b11 = 0;
        String strM82001i = m82001i("ro.hardware");
        if (strM82001i == null) {
            return new C36645a(0, null);
        }
        String lowerCase = strM82001i.toLowerCase();
        lowerCase.getClass();
        switch (lowerCase.hashCode()) {
            case -1367724016:
                if (!lowerCase.equals("cancro")) {
                    b11 = -1;
                }
                break;
            case -822798509:
                b11 = !lowerCase.equals("vbox86") ? (byte) -1 : (byte) 1;
                break;
            case 109271:
                b11 = !lowerCase.equals("nox") ? (byte) -1 : (byte) 2;
                break;
            case 3570999:
                b11 = !lowerCase.equals("ttvm") ? (byte) -1 : (byte) 3;
                break;
            case 3613077:
                b11 = !lowerCase.equals("vbox") ? (byte) -1 : (byte) 4;
                break;
            case 100361430:
                b11 = !lowerCase.equals("intel") ? (byte) -1 : (byte) 5;
                break;
            case 937844646:
                b11 = !lowerCase.equals("android_x86") ? (byte) -1 : (byte) 6;
                break;
            default:
                b11 = -1;
                break;
        }
        switch (b11) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                i11 = 1;
                break;
        }
        return new C36645a(i11, strM82001i);
    }

    public C36649e() {
    }

    /* JADX INFO: renamed from: a */
    public final C36645a m81993a() {
        String strM82001i = m82001i("gsm.version.baseband");
        if (strM82001i == null) {
            return new C36645a(0, null);
        }
        return new C36645a(strM82001i.contains("1.0.0.0") ? 1 : 2, strM82001i);
    }

    /* JADX INFO: renamed from: o */
    public boolean m82006o(Context context, InterfaceC36648d interfaceC36648d) throws Throwable {
        int i11;
        int i12;
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        }
        C36645a c36645aM81997e = m81997e();
        int i13 = c36645aM81997e.f79444a;
        if (i13 == 0) {
            i11 = 1;
        } else {
            if (i13 == 1) {
                if (interfaceC36648d != null) {
                    interfaceC36648d.m81991a("hardware = " + c36645aM81997e.f79445b);
                }
                return true;
            }
            i11 = 0;
        }
        C36645a c36645aM81996d = m81996d();
        int i14 = c36645aM81996d.f79444a;
        if (i14 == 0) {
            i11++;
        } else if (i14 == 1) {
            if (interfaceC36648d != null) {
                interfaceC36648d.m81991a("flavor = " + c36645aM81996d.f79445b);
            }
            return true;
        }
        C36645a c36645aM81999g = m81999g();
        int i15 = c36645aM81999g.f79444a;
        if (i15 == 0) {
            i11++;
        } else if (i15 == 1) {
            if (interfaceC36648d != null) {
                interfaceC36648d.m81991a("model = " + c36645aM81999g.f79445b);
            }
            return true;
        }
        C36645a c36645aM81998f = m81998f();
        int i16 = c36645aM81998f.f79444a;
        if (i16 == 0) {
            i11++;
        } else if (i16 == 1) {
            if (interfaceC36648d != null) {
                interfaceC36648d.m81991a("manufacturer = " + c36645aM81998f.f79445b);
            }
            return true;
        }
        C36645a c36645aM81994b = m81994b();
        int i17 = c36645aM81994b.f79444a;
        if (i17 == 0) {
            i11++;
        } else if (i17 == 1) {
            if (interfaceC36648d != null) {
                interfaceC36648d.m81991a("board = " + c36645aM81994b.f79445b);
            }
            return true;
        }
        C36645a c36645aM82000h = m82000h();
        int i18 = c36645aM82000h.f79444a;
        if (i18 == 0) {
            i11++;
        } else if (i18 == 1) {
            if (interfaceC36648d != null) {
                interfaceC36648d.m81991a("platform = " + c36645aM82000h.f79445b);
            }
            return true;
        }
        C36645a c36645aM81993a = m81993a();
        int i19 = c36645aM81993a.f79444a;
        int i21 = i11;
        if (i19 == 0) {
            i21 += 2;
        } else if (i19 == 1) {
            if (interfaceC36648d == null) {
                return true;
            }
            interfaceC36648d.m81991a("baseBand = " + c36645aM81993a.f79445b);
            return true;
        }
        int iM82002j = m82002j(context);
        if (iM82002j <= 7) {
            i21++;
        }
        int iM82004m = m82004m();
        if (iM82004m <= 5) {
            i21++;
        }
        boolean zM82009r = m82009r(context);
        if (!zM82009r) {
            i21++;
        }
        boolean zM82008q = m82008q(context);
        if (!zM82008q) {
            i21++;
        }
        boolean zM82007p = m82007p(context);
        if (!zM82007p) {
            i21++;
        }
        boolean zM82005n = m82005n(context);
        if (!zM82005n) {
            i21++;
        }
        C36645a c36645aM81995c = m81995c();
        if (c36645aM81995c.f79444a == 0) {
            i21++;
        }
        int i22 = i21;
        if (interfaceC36648d != null) {
            StringBuffer stringBuffer = new StringBuffer("Test start");
            stringBuffer.append(LogUtils.NEW_LINE);
            stringBuffer.append("hardware = ");
            stringBuffer.append(c36645aM81997e.f79445b);
            stringBuffer.append(LogUtils.NEW_LINE);
            stringBuffer.append("flavor = ");
            stringBuffer.append(c36645aM81996d.f79445b);
            stringBuffer.append(LogUtils.NEW_LINE);
            stringBuffer.append("model = ");
            stringBuffer.append(c36645aM81999g.f79445b);
            stringBuffer.append(LogUtils.NEW_LINE);
            stringBuffer.append("manufacturer = ");
            stringBuffer.append(c36645aM81998f.f79445b);
            stringBuffer.append(LogUtils.NEW_LINE);
            stringBuffer.append("board = ");
            stringBuffer.append(c36645aM81994b.f79445b);
            stringBuffer.append(LogUtils.NEW_LINE);
            stringBuffer.append("platform = ");
            stringBuffer.append(c36645aM82000h.f79445b);
            stringBuffer.append(LogUtils.NEW_LINE);
            stringBuffer.append("baseBand = ");
            stringBuffer.append(c36645aM81993a.f79445b);
            stringBuffer.append(LogUtils.NEW_LINE);
            stringBuffer.append("sensorNumber = ");
            stringBuffer.append(iM82002j);
            stringBuffer.append(LogUtils.NEW_LINE);
            stringBuffer.append("userAppNumber = ");
            stringBuffer.append(iM82004m);
            stringBuffer.append(LogUtils.NEW_LINE);
            stringBuffer.append("supportCamera = ");
            stringBuffer.append(zM82008q);
            stringBuffer.append(LogUtils.NEW_LINE);
            stringBuffer.append("supportCameraFlash = ");
            stringBuffer.append(zM82009r);
            stringBuffer.append(LogUtils.NEW_LINE);
            stringBuffer.append("supportBluetooth = ");
            stringBuffer.append(zM82007p);
            stringBuffer.append(LogUtils.NEW_LINE);
            stringBuffer.append("hasLightSensor = ");
            stringBuffer.append(zM82005n);
            stringBuffer.append(LogUtils.NEW_LINE);
            stringBuffer.append("cgroupResult = ");
            stringBuffer.append(c36645aM81995c.f79445b);
            stringBuffer.append(LogUtils.NEW_LINE);
            stringBuffer.append("suspectCount = ");
            i12 = i22;
            stringBuffer.append(i12);
            interfaceC36648d.m81991a(stringBuffer.toString());
        } else {
            i12 = i22;
        }
        return i12 > 3;
    }

    /* JADX INFO: renamed from: k */
    public static final C36649e m81992k() {
        return b.f79447a;
    }

    /* JADX INFO: renamed from: b */
    public final C36645a m81994b() {
        String strM82001i = m82001i(TPSystemInfo.KEY_PROPERTY_BOARD);
        if (strM82001i == null) {
            return new C36645a(0, null);
        }
        String lowerCase = strM82001i.toLowerCase();
        int i11 = 1;
        if (!lowerCase.contains("android") && !lowerCase.contains("goldfish")) {
            i11 = 2;
        }
        return new C36645a(i11, strM82001i);
    }

    /* JADX INFO: renamed from: c */
    public final C36645a m81995c() throws Throwable {
        String strM81983a = C36646b.m81981c().m81983a("cat /proc/self/cgroup");
        if (strM81983a == null) {
            return new C36645a(0, null);
        }
        return new C36645a(2, strM81983a);
    }

    /* JADX INFO: renamed from: d */
    public final C36645a m81996d() {
        String strM82001i = m82001i("ro.build.flavor");
        if (strM82001i == null) {
            return new C36645a(0, null);
        }
        String lowerCase = strM82001i.toLowerCase();
        int i11 = 1;
        if (!lowerCase.contains("vbox") && !lowerCase.contains("sdk_gphone")) {
            i11 = 2;
        }
        return new C36645a(i11, strM82001i);
    }

    /* JADX INFO: renamed from: f */
    public final C36645a m81998f() {
        String strM82001i = m82001i(TPSystemInfo.KEY_PROPERTY_MANUFACTURER);
        if (strM82001i == null) {
            return new C36645a(0, null);
        }
        String lowerCase = strM82001i.toLowerCase();
        int i11 = 1;
        if (!lowerCase.contains("genymotion") && !lowerCase.contains("netease")) {
            i11 = 2;
        }
        return new C36645a(i11, strM82001i);
    }

    /* JADX INFO: renamed from: g */
    public final C36645a m81999g() {
        String strM82001i = m82001i(TPSystemInfo.KEY_PROPERTY_MODEL);
        if (strM82001i == null) {
            return new C36645a(0, null);
        }
        String lowerCase = strM82001i.toLowerCase();
        int i11 = 1;
        if (!lowerCase.contains("google_sdk") && !lowerCase.contains(C34052z4.f72600l) && !lowerCase.contains("android sdk built for x86")) {
            i11 = 2;
        }
        return new C36645a(i11, strM82001i);
    }

    /* JADX INFO: renamed from: h */
    public final C36645a m82000h() {
        int i11;
        String strM82001i = m82001i("ro.board.platform");
        if (strM82001i == null) {
            return new C36645a(0, null);
        }
        if (strM82001i.toLowerCase().contains("android")) {
            i11 = 1;
        } else {
            i11 = 2;
        }
        return new C36645a(i11, strM82001i);
    }

    /* JADX INFO: renamed from: i */
    public final String m82001i(String str) {
        String strM81984b = C36646b.m81981c().m81984b(str);
        if (TextUtils.isEmpty(strM81984b)) {
            return null;
        }
        return strM81984b;
    }

    /* JADX INFO: renamed from: j */
    public final int m82002j(Context context) {
        return ((SensorManager) context.getSystemService("sensor")).getSensorList(-1).size();
    }

    /* JADX INFO: renamed from: l */
    public final int m82003l(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        return str.split("package:").length;
    }

    /* JADX INFO: renamed from: m */
    public final int m82004m() {
        return m82003l(C36646b.m81981c().m81983a("pm list package -3"));
    }

    /* JADX INFO: renamed from: n */
    public final boolean m82005n(Context context) {
        if (((SensorManager) context.getSystemService("sensor")).getDefaultSensor(5) == null) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m82007p(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.bluetooth");
    }

    /* JADX INFO: renamed from: q */
    public final boolean m82008q(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.camera");
    }

    /* JADX INFO: renamed from: r */
    public final boolean m82009r(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.camera.flash");
    }
}
