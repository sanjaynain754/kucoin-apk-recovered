package com.tencent.liteav.txcvodplayer.p133b;

import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.liteav.txcvodplayer.b.b */
/* JADX INFO: loaded from: classes59.dex */
public final class C34835b {

    /* JADX INFO: renamed from: a */
    String f73926a;

    /* JADX INFO: renamed from: b */
    String f73927b;

    /* JADX INFO: renamed from: c */
    String f73928c;

    /* JADX INFO: renamed from: d */
    int f73929d;

    /* JADX INFO: renamed from: e */
    long f73930e;

    /* JADX INFO: renamed from: f */
    public String f73931f;

    /* JADX INFO: renamed from: g */
    List<C34836c.e> f73932g;

    /* JADX INFO: renamed from: h */
    String f73933h;

    /* JADX INFO: renamed from: i */
    C34836c.c f73934i;

    /* JADX INFO: renamed from: j */
    List<C34836c.d> f73935j;

    /* JADX INFO: renamed from: k */
    private JSONObject f73936k;

    /* JADX INFO: renamed from: l */
    private String f73937l;

    /* JADX INFO: renamed from: m */
    private List<a> f73938m;

    /* JADX INFO: renamed from: n */
    private String f73939n;

    /* JADX INFO: renamed from: o */
    private String f73940o;

    /* JADX INFO: renamed from: com.tencent.liteav.txcvodplayer.b.b$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public String f73941a;

        /* JADX INFO: renamed from: b */
        public String f73942b;
    }

    /* JADX INFO: renamed from: a */
    private void m76359a(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return;
        }
        this.f73932g = new ArrayList();
        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i11);
            C34836c.e eVar = new C34836c.e();
            int iOptInt = jSONObject.optInt("width");
            int iOptInt2 = jSONObject.optInt("height");
            eVar.f73975b = iOptInt;
            eVar.f73976c = iOptInt2;
            eVar.f73974a = jSONObject.optString("resolutionName");
            eVar.f73977d = jSONObject.optString("type");
            eVar.f73978e = jSONObject.optLong("size");
            eVar.f73979f = jSONObject.optString("url");
            this.f73932g.add(eVar);
        }
    }

    /* JADX INFO: renamed from: c */
    private void m76361c() {
        JSONObject jSONObjectOptJSONObject;
        try {
            JSONObject jSONObject = this.f73936k.getJSONObject("media");
            if (jSONObject != null) {
                JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("basicInfo");
                if (jSONObjectOptJSONObject2 != null) {
                    this.f73926a = jSONObjectOptJSONObject2.optString("name");
                    String strOptString = jSONObjectOptJSONObject2.optString(TUIConstants.TUIPlugin.PLUGIN_DESCRIPTION);
                    this.f73927b = strOptString;
                    if (TextUtils.isEmpty(strOptString)) {
                        this.f73927b = this.f73926a;
                    }
                    this.f73928c = jSONObjectOptJSONObject2.optString("coverUrl");
                    this.f73929d = jSONObjectOptJSONObject2.optInt(TypedValues.TransitionType.S_DURATION);
                    this.f73930e = jSONObjectOptJSONObject2.optLong("size");
                }
                String strOptString2 = jSONObject.optString("audioVideoType");
                if (TextUtils.equals(strOptString2, "AdaptiveDynamicStream")) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("streamingInfo");
                    if (jSONObject2 != null) {
                        JSONObject jSONObjectOptJSONObject3 = jSONObject2.optJSONObject("plainOutput");
                        if (jSONObjectOptJSONObject3 != null) {
                            this.f73937l = jSONObjectOptJSONObject3.optString("url");
                            m76359a(jSONObjectOptJSONObject3.optJSONArray("subStreams"));
                        }
                        JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("drmOutput");
                        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                            this.f73938m = new ArrayList();
                            for (int i11 = 0; i11 < jSONArrayOptJSONArray.length(); i11++) {
                                JSONObject jSONObjectOptJSONObject4 = jSONArrayOptJSONArray.optJSONObject(i11);
                                String strOptString3 = jSONObjectOptJSONObject4.optString("type");
                                String strOptString4 = jSONObjectOptJSONObject4.optString("url");
                                a aVar = new a();
                                aVar.f73941a = strOptString3;
                                aVar.f73942b = strOptString4;
                                if (strOptString3.equalsIgnoreCase("SimpleAES")) {
                                    this.f73933h = strOptString3;
                                }
                                this.f73938m.add(aVar);
                                m76359a(jSONObjectOptJSONObject4.optJSONArray("subStreams"));
                            }
                        }
                        this.f73939n = jSONObject2.optString("drmToken");
                        String strOptString5 = jSONObject2.optString("widevineLicenseUrl");
                        this.f73940o = strOptString5;
                        if (!TextUtils.isEmpty(strOptString5)) {
                            this.f73933h = "Widevine";
                        }
                    }
                } else if (TextUtils.equals(strOptString2, "Transcode")) {
                    JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("transcodeInfo");
                    if (jSONObjectOptJSONObject5 != null) {
                        this.f73937l = jSONObjectOptJSONObject5.optString("url");
                    }
                } else if (TextUtils.equals(strOptString2, "Original") && (jSONObjectOptJSONObject = jSONObject.optJSONObject("originalInfo")) != null) {
                    this.f73937l = jSONObjectOptJSONObject.optString("url");
                }
                JSONObject jSONObjectOptJSONObject6 = jSONObject.optJSONObject("imageSpriteInfo");
                if (jSONObjectOptJSONObject6 != null) {
                    C34836c.c cVar = new C34836c.c();
                    this.f73934i = cVar;
                    cVar.f73971b = jSONObjectOptJSONObject6.getString("webVttUrl");
                    JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject6.optJSONArray("imageUrls");
                    if (jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray2.length() > 0) {
                        ArrayList<String> arrayList = new ArrayList<>();
                        for (int i12 = 0; i12 < jSONArrayOptJSONArray2.length(); i12++) {
                            arrayList.add(jSONArrayOptJSONArray2.getString(i12));
                        }
                        this.f73934i.f73970a = arrayList;
                    }
                }
                m76360a(jSONObject);
                JSONObject jSONObjectOptJSONObject7 = jSONObject.optJSONObject("ghostWatermarkInfo");
                if (jSONObjectOptJSONObject7 != null) {
                    this.f73931f = jSONObjectOptJSONObject7.optString("text");
                }
            }
        } catch (JSONException e11) {
            LiteavLog.m76083e("TXCPlayInfoParserV4", e11.getMessage());
        }
    }

    /* JADX INFO: renamed from: b */
    public final String m76364b() {
        if (TextUtils.isEmpty(this.f73940o)) {
            return null;
        }
        return this.f73940o;
    }

    public C34835b(JSONObject jSONObject) {
        this.f73936k = jSONObject;
        m76361c();
    }

    /* JADX INFO: renamed from: a */
    private void m76360a(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("keyFrameDescInfo");
        if (jSONObjectOptJSONObject != null) {
            this.f73935j = new ArrayList();
            JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("keyFrameDescList");
            if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
                return;
            }
            for (int i11 = 0; i11 < jSONArrayOptJSONArray.length(); i11++) {
                try {
                    jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i11);
                } catch (JSONException e11) {
                    e11.printStackTrace();
                    jSONObject2 = null;
                }
                C34836c.d dVar = new C34836c.d();
                dVar.f73973b = jSONObject2.optLong("timeOffset");
                dVar.f73972a = jSONObject2.optString("content");
                this.f73935j.add(dVar);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m76363a(String str) {
        if ("plain".equalsIgnoreCase(str)) {
            return this.f73937l;
        }
        List<a> list = this.f73938m;
        if (list == null) {
            return null;
        }
        for (a aVar : list) {
            String str2 = aVar.f73941a;
            if (str2 != null && str2.equalsIgnoreCase(str)) {
                return aVar.f73942b;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final String m76362a() {
        if (TextUtils.isEmpty(this.f73939n)) {
            return null;
        }
        return this.f73939n;
    }
}
