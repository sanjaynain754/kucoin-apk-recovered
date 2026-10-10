package p611s;

import ai.advance.common.entity.BaseResultEntity;
import ai.advance.sdk.global.iqa.lib.code.ErrorCode;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import org.json.JSONException;
import org.json.JSONObject;
import p387k.C40832g;

/* JADX INFO: renamed from: s.a */
/* JADX INFO: loaded from: classes23.dex */
public class C44203a {

    /* JADX INFO: renamed from: a */
    public static String f97550a;

    /* JADX INFO: renamed from: b */
    public static BaseResultEntity f97551b;

    /* JADX INFO: renamed from: c */
    public static String f97552c;

    /* JADX INFO: renamed from: d */
    public static String f97553d;

    /* JADX INFO: renamed from: e */
    public static String f97554e;

    /* JADX INFO: renamed from: f */
    public static String f97555f;

    /* JADX INFO: renamed from: c */
    public static void m97430c() {
        f97552c = null;
        f97553d = null;
        f97551b = null;
        f97550a = null;
        f97554e = null;
    }

    /* JADX INFO: renamed from: a */
    public static void m97428a(BaseResultEntity baseResultEntity) {
        f97551b = baseResultEntity;
    }

    /* JADX INFO: renamed from: b */
    public static void m97429b(String str, String str2) {
        f97550a = str2;
        f97554e = str;
    }

    /* JADX INFO: renamed from: d */
    public static String m97431d() {
        return f97550a;
    }

    /* JADX INFO: renamed from: e */
    public static Bitmap m97432e() {
        String str = f97550a;
        if (str == null) {
            return null;
        }
        byte[] bArrDecode = Base64.decode(str, 2);
        return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
    }

    /* JADX INFO: renamed from: f */
    public static String m97433f() {
        return f97552c;
    }

    /* JADX INFO: renamed from: g */
    public static String m97434g() {
        return f97553d;
    }

    /* JADX INFO: renamed from: k */
    public static String m97438k() {
        return f97554e;
    }

    /* JADX INFO: renamed from: l */
    public static String m97439l() {
        BaseResultEntity baseResultEntity = f97551b;
        if (baseResultEntity == null) {
            return null;
        }
        return baseResultEntity.transactionId;
    }

    /* JADX INFO: renamed from: n */
    public static boolean m97441n() {
        BaseResultEntity baseResultEntity;
        return (f97550a == null || (baseResultEntity = f97551b) == null || !baseResultEntity.success) ? false : true;
    }

    /* JADX INFO: renamed from: p */
    public static void m97443p(String str) {
        f97552c = str;
    }

    /* JADX INFO: renamed from: q */
    public static void m97444q(String str) {
        f97553d = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m97445r(String str) {
        f97555f = str;
    }

    /* JADX INFO: renamed from: h */
    public static String m97435h() {
        if (!m97441n()) {
            return null;
        }
        try {
            return C40832g.m89351f(new JSONObject(f97551b.data), "IDVID");
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: i */
    public static JSONObject m97436i() {
        if (!m97441n()) {
            return null;
        }
        try {
            return new JSONObject(f97551b.data).optJSONObject("idForgery");
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: j */
    public static JSONObject m97437j() {
        if (!m97441n()) {
            return null;
        }
        try {
            return new JSONObject(f97551b.data).optJSONObject("OCR");
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: m */
    public static boolean m97440m() {
        if (m97441n() && "PAY".equals(f97551b.pricingStrategy)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: o */
    public static void m97442o(ErrorCode errorCode) {
        f97552c = errorCode.name();
    }
}
