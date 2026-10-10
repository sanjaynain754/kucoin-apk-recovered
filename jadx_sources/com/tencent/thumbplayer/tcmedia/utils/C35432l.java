package com.tencent.thumbplayer.tcmedia.utils;

import android.text.TextUtils;
import com.tencent.thumbplayer.tcmedia.common.p158a.InterfaceC35304a;
import java.util.Map;
import java.util.Properties;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.utils.l */
/* JADX INFO: loaded from: classes64.dex */
public class C35432l implements InterfaceC35304a {

    /* JADX INFO: renamed from: a */
    protected final Properties f76602a;

    public C35432l() {
        this(null);
    }

    /* JADX INFO: renamed from: a */
    public Properties m78901a() {
        return this.f76602a;
    }

    public C35432l(Properties properties) {
        this.f76602a = new Properties();
        if (properties != null) {
            for (Map.Entry entry : properties.entrySet()) {
                mo78038a((String) entry.getKey(), (String) entry.getValue());
            }
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.common.p158a.InterfaceC35304a
    /* JADX INFO: renamed from: a */
    public void mo78035a(String str, float f11) {
        if (str != null) {
            this.f76602a.put(str, String.valueOf(f11));
        }
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject(this.f76602a);
        if (jSONObject.has("data")) {
            try {
                String string = jSONObject.getString("data");
                jSONObject.remove("data");
                jSONObject.put("data", new JSONObject(string));
            } catch (JSONException e11) {
                TPLogUtil.m78798e("TPProperties", e11);
            }
        }
        return jSONObject.toString();
    }

    @Override // com.tencent.thumbplayer.tcmedia.common.p158a.InterfaceC35304a
    /* JADX INFO: renamed from: a */
    public void mo78036a(String str, int i11) {
        if (str != null) {
            this.f76602a.put(str, String.valueOf(i11));
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.common.p158a.InterfaceC35304a
    /* JADX INFO: renamed from: a */
    public void mo78037a(String str, long j11) {
        if (str != null) {
            this.f76602a.put(str, String.valueOf(j11));
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.common.p158a.InterfaceC35304a
    /* JADX INFO: renamed from: a */
    public void mo78038a(String str, String str2) {
        if (str != null) {
            if (TextUtils.isEmpty(str2)) {
                this.f76602a.put(str, "");
            } else {
                this.f76602a.put(str, str2);
            }
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.common.p158a.InterfaceC35304a
    /* JADX INFO: renamed from: a */
    public void mo78039a(Map<String, String> map) {
        if (map == null) {
            throw new IllegalArgumentException("map must not be null!");
        }
        for (Map.Entry entry : this.f76602a.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value == null) {
                map.put(key.toString(), "");
            } else {
                map.put(key.toString(), value.toString());
            }
        }
    }
}
