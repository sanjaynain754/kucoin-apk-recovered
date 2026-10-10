package a3d20260409;

import aai.liveness.GuardianLivenessDetectionSDK$DetectionLevel;
import ai.advance.liveness.lib.Market;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.google.firebase.messaging.Constants;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;
import p387k.C40832g;
import p387k.C40835j;
import p416l.C42010b;
import p579r.C43890a;

/* JADX INFO: renamed from: a3d20260409.v */
/* JADX INFO: loaded from: classes23.dex */
public class C0109v extends j3d20260409 {
    /* JADX INFO: renamed from: q */
    public static void m543q(String str, String str2, String str3, String str4, String str5, boolean z11, String str6) {
        if (!j3d20260409.O0OOOoOooo() || C43890a.m96661b() == null) {
            return;
        }
        C42010b c42010b = new C42010b(C43890a.m96661b());
        j3d20260409.OoOo0OoO(str, str2, str3, str6, c42010b.m92104i(), c42010b.m92110o(), c42010b.m92109n(), C43890a.m96661b().getPackageName(), C43890a.m96661b());
        j3d20260409.oOoOoOo00(str4, str5, Market.Singapore.getAlias().equals(str4) ? true : z11);
    }

    /* JADX INFO: renamed from: A */
    public static int m512A() {
        if (j3d20260409.O0OOOoOooo()) {
            return j3d20260409.OOoooOO0000();
        }
        return 100;
    }

    /* JADX INFO: renamed from: B */
    public static boolean m513B() {
        if (j3d20260409.O0OOOoOooo()) {
            return j3d20260409.OOOooO();
        }
        return false;
    }

    /* JADX INFO: renamed from: C */
    public static boolean m514C() {
        if (j3d20260409.O0OOOoOooo()) {
            return j3d20260409.OOOooOo0();
        }
        return false;
    }

    /* JADX INFO: renamed from: D */
    public static boolean m515D() {
        JSONObject jSONObjectM528Q = m528Q();
        if (jSONObjectM528Q == null) {
            return false;
        }
        return jSONObjectM528Q.optBoolean("looperScaleNearImage");
    }

    /* JADX INFO: renamed from: E */
    public static float m516E() {
        JSONObject jSONObjectM528Q = m528Q();
        if (jSONObjectM528Q == null) {
            return -1.0f;
        }
        return (float) jSONObjectM528Q.optDouble("looperScaleFarPercent");
    }

    /* JADX INFO: renamed from: F */
    public static boolean m517F() {
        JSONObject jSONObjectM528Q = m528Q();
        if (jSONObjectM528Q == null) {
            return false;
        }
        return jSONObjectM528Q.optBoolean("looperScaleFarImage");
    }

    /* JADX INFO: renamed from: G */
    public static float m518G() {
        JSONObject jSONObjectM528Q = m528Q();
        if (jSONObjectM528Q == null) {
            return -1.0f;
        }
        return (float) jSONObjectM528Q.optDouble("looperScaleNearPercent");
    }

    /* JADX INFO: renamed from: H */
    public static String m519H() {
        if (j3d20260409.O0OOOoOooo()) {
            return j3d20260409.O0oO();
        }
        return Constants.IPC_BUNDLE_KEY_SEND_ERROR;
    }

    /* JADX INFO: renamed from: I */
    public static boolean m520I() {
        if (j3d20260409.O0OOOoOooo()) {
            return j3d20260409.OOoooOO();
        }
        return false;
    }

    /* JADX INFO: renamed from: J */
    public static String m521J() {
        if (j3d20260409.O0OOOoOooo()) {
            return j3d20260409.O0ooooo0oo();
        }
        return null;
    }

    /* JADX INFO: renamed from: K */
    public static int m522K() {
        if (j3d20260409.O0OOOoOooo()) {
            return j3d20260409.m348q1();
        }
        return 2;
    }

    /* JADX INFO: renamed from: L */
    public static int m523L() {
        if (j3d20260409.O0OOOoOooo()) {
            return j3d20260409.OOo0ooOO0000ooo0();
        }
        return 0;
    }

    /* JADX INFO: renamed from: M */
    public static int m524M() {
        if (j3d20260409.O0OOOoOooo()) {
            return j3d20260409.OoOOOoO();
        }
        return 0;
    }

    /* JADX INFO: renamed from: N */
    public static int m525N() {
        if (j3d20260409.O0OOOoOooo()) {
            return j3d20260409.m349q2();
        }
        return 2;
    }

    /* JADX INFO: renamed from: O */
    public static boolean m526O() {
        if (j3d20260409.O0OOOoOooo()) {
            return j3d20260409.O0o0o0();
        }
        return false;
    }

    /* JADX INFO: renamed from: P */
    public static int m527P() {
        if (j3d20260409.O0OOOoOooo()) {
            return j3d20260409.OOooooO();
        }
        return 0;
    }

    /* JADX INFO: renamed from: Q */
    public static JSONObject m528Q() {
        if (j3d20260409.O0OOOoOooo()) {
            String strOoOOOoO00 = j3d20260409.OoOOOoO00();
            if (C40832g.m89352g(strOoOOOoO00)) {
                try {
                    return new JSONObject(strOoOOOoO00);
                } catch (Exception unused) {
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: R */
    public static String m529R() {
        if (j3d20260409.O0OOOoOooo()) {
            return j3d20260409.OoOoO000();
        }
        return null;
    }

    /* JADX INFO: renamed from: S */
    public static boolean m530S() {
        if (m545s() == Bitmap.CompressFormat.JPEG) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: T */
    public static String m531T() {
        if (j3d20260409.O0OOOoOooo()) {
            return j3d20260409.OoOoOooo(System.currentTimeMillis());
        }
        return null;
    }

    /* JADX INFO: renamed from: U */
    public static int m532U() {
        if (j3d20260409.O0OOOoOooo()) {
            return j3d20260409.m350t();
        }
        return 2;
    }

    /* JADX INFO: renamed from: g */
    public static String m533g(String str) {
        if (j3d20260409.O0OOOoOooo()) {
            return j3d20260409.O0OO0oOo0o0o000(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m534h() {
        if (j3d20260409.O0OOOoOooo()) {
            return j3d20260409.Oo0O00O0000oo();
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m535i() {
        if (j3d20260409.O0OOOoOooo()) {
            return j3d20260409.OOooooOOo0oOo();
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public static GuardianLivenessDetectionSDK$DetectionLevel m536j() {
        if (j3d20260409.O0OOOoOooo()) {
            return GuardianLivenessDetectionSDK$DetectionLevel.valueOf(j3d20260409.OoOOOo());
        }
        return GuardianLivenessDetectionSDK$DetectionLevel.NORMAL;
    }

    /* JADX INFO: renamed from: k */
    public static int m537k(byte[] bArr, int i11, int i12, int i13, byte[] bArr2, int i14, boolean z11, int i15) {
        if (j3d20260409.O0OOOoOooo()) {
            return j3d20260409.oO00(bArr, i11, i12, i13, bArr2, i14, z11, i15);
        }
        return -1;
    }

    /* JADX INFO: renamed from: l */
    public static long m538l(AssetManager assetManager) {
        if (j3d20260409.O0OOOoOooo()) {
            return j3d20260409.Oo0Oo(assetManager);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: m */
    public static String m539m(long j11, byte[] bArr, int i11, int i12, int i13) {
        if (j3d20260409.O0OOOoOooo()) {
            return j3d20260409.oO0ooO(j11, bArr, i11, i12, i13);
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    public static String m540n(String str, String str2) {
        if (j3d20260409.O0OOOoOooo()) {
            return j3d20260409.oOo0ooooo(str, str2);
        }
        return null;
    }

    /* JADX INFO: renamed from: o */
    public static String m541o(String str, String str2, byte[] bArr) {
        if (j3d20260409.O0OOOoOooo()) {
            return j3d20260409.O0o0Oo0oo0(str, str2, bArr);
        }
        return null;
    }

    /* JADX INFO: renamed from: p */
    public static void m542p(long j11) {
        if (j3d20260409.O0OOOoOooo()) {
            j3d20260409.OoO(j11, System.currentTimeMillis());
        }
    }

    /* JADX INFO: renamed from: r */
    public static boolean m544r(@NonNull intl.oOooooooo0000000000 ooooooooo0000000000) {
        if (j3d20260409.O0OOOoOooo()) {
            return j3d20260409.OoOOOoO0O(ooooooooo0000000000.name());
        }
        if (ooooooooo0000000000 != intl.oOooooooo0000000000.CRASH) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: s */
    public static Bitmap.CompressFormat m545s() {
        if (j3d20260409.O0OOOoOooo()) {
            if (j3d20260409.OOoooOO000()) {
                return Bitmap.CompressFormat.WEBP;
            }
            return Bitmap.CompressFormat.JPEG;
        }
        return Bitmap.CompressFormat.JPEG;
    }

    /* JADX INFO: renamed from: u */
    public static String m546u(String str) {
        if (j3d20260409.O0OOOoOooo()) {
            return j3d20260409.O0OO0oOo0(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: v */
    public static boolean m547v() {
        if (j3d20260409.O0OOOoOooo()) {
            return j3d20260409.OoOOOoo();
        }
        return false;
    }

    /* JADX INFO: renamed from: w */
    public static int m548w() {
        if (j3d20260409.O0OOOoOooo()) {
            return j3d20260409.OOooooOOo0();
        }
        return 0;
    }

    /* JADX INFO: renamed from: x */
    public static String m549x() {
        if (j3d20260409.O0OOOoOooo()) {
            return j3d20260409.OOooO();
        }
        return "";
    }

    /* JADX INFO: renamed from: y */
    public static float[] m550y() {
        if (j3d20260409.O0OOOoOooo()) {
            return j3d20260409.OOooooO0();
        }
        return null;
    }

    /* JADX INFO: renamed from: z */
    public static Map<String, Object> m551z() {
        if (j3d20260409.O0OOOoOooo()) {
            try {
                JSONObject jSONObject = new JSONObject(j3d20260409.oOoOoOo00o0());
                HashMap map = new HashMap();
                map.put("X-ADVAI-LOCALE", C40835j.m89368b());
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    map.put(next, jSONObject.get(next));
                }
                return map;
            } catch (Exception unused) {
                return null;
            }
        }
        return null;
    }
}
