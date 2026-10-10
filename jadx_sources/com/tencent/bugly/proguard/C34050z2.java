package com.tencent.bugly.proguard;

import com.tencent.rmonitor.common.logger.Logger;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.z2 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C34050z2 implements InterfaceC33813n8 {

    /* JADX INFO: renamed from: a */
    public static final String f72586a = "RMonitor_config_ParserV7";

    @Override // com.tencent.bugly.proguard.InterfaceC33813n8
    /* JADX INFO: renamed from: a */
    public boolean mo74242a(JSONObject jSONObject, @NotNull C33547af c33547af) {
        if (jSONObject == null) {
            return false;
        }
        return m75574b(jSONObject, c33547af);
    }

    /* JADX INFO: renamed from: a */
    public final void m75573a(C33547af c33547af, String str, JSONObject jSONObject) throws JSONException {
        AbstractC34022xe abstractC34022xeM72368b = c33547af.m72368b(str);
        if (abstractC34022xeM72368b != null) {
            abstractC34022xeM72368b.mo72627a(jSONObject);
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m75574b(JSONObject jSONObject, @NotNull C33547af c33547af) {
        try {
            if (jSONObject.has(AbstractC34022xe.f72511b)) {
                c33547af.f68867a = (float) jSONObject.getDouble(AbstractC34022xe.f72511b);
            }
            if (jSONObject.has(AbstractC34022xe.f72512c)) {
                m75573a(c33547af, AbstractC34022xe.f72512c, jSONObject.getJSONObject(AbstractC34022xe.f72512c));
            }
            if (jSONObject.has("crash")) {
                m75573a(c33547af, "crash", jSONObject.getJSONObject("crash"));
            }
            if (!jSONObject.has(AbstractC34022xe.f72514e)) {
                return true;
            }
            JSONArray jSONArray = jSONObject.getJSONArray(AbstractC34022xe.f72514e);
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i11);
                AbstractC34022xe abstractC34022xeM72368b = c33547af.m72368b(jSONObject2.optString("name"));
                if (abstractC34022xeM72368b != null) {
                    abstractC34022xeM72368b.mo72627a(jSONObject2);
                }
            }
            return true;
        } catch (Throwable th2) {
            Logger.INSTANCE.exception(f72586a, "parseConfig", th2);
            return false;
        }
    }
}
