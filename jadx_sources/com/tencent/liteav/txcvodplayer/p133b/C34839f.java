package com.tencent.liteav.txcvodplayer.p133b;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.liteav.txcvodplayer.b.f */
/* JADX INFO: loaded from: classes59.dex */
public final class C34839f {

    /* JADX INFO: renamed from: a */
    protected JSONObject f73997a;

    /* JADX INFO: renamed from: b */
    C34840g f73998b;

    /* JADX INFO: renamed from: com.tencent.liteav.txcvodplayer.b.f$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public String f73999a;

        /* JADX INFO: renamed from: b */
        public String f74000b;

        /* JADX INFO: renamed from: c */
        public List<Integer> f74001c;
    }

    /* JADX INFO: renamed from: a */
    public final String m76399a() {
        if (this.f73998b == null) {
            this.f73998b = m76401c();
        }
        C34840g c34840g = this.f73998b;
        if (c34840g != null) {
            return c34840g.f74002a;
        }
        return null;
    }

    /* JADX INFO: renamed from: l */
    private C34840g m76396l() {
        try {
            JSONObject jSONObject = this.f73997a.getJSONObject("videoInfo").getJSONObject("masterPlayList");
            C34840g c34840g = new C34840g();
            c34840g.f74002a = jSONObject.getString("url");
            return c34840g;
        } catch (JSONException e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: m */
    private String m76397m() {
        try {
            return this.f73997a.getJSONObject("playerInfo").getString("defaultVideoClassification");
        } catch (JSONException e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m76400b() {
        if (this.f73998b == null) {
            this.f73998b = m76401c();
        }
        C34840g c34840g = this.f73998b;
        if (c34840g != null) {
            return c34840g.f74006e;
        }
        return -1;
    }

    /* JADX INFO: renamed from: d */
    public final String m76402d() {
        try {
            JSONObject jSONObject = this.f73997a.getJSONObject("coverInfo");
            if (jSONObject != null) {
                return jSONObject.getString("coverUrl");
            }
            return null;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public final List<C34840g> m76403e() {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = this.f73997a.getJSONObject("videoInfo").getJSONArray("transcodeList");
            if (jSONArray != null) {
                for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i11);
                    C34840g c34840g = new C34840g();
                    c34840g.f74002a = jSONObject.getString("url");
                    c34840g.f74006e = jSONObject.getInt(TypedValues.TransitionType.S_DURATION);
                    c34840g.f74004c = jSONObject.getInt("width");
                    c34840g.f74003b = jSONObject.getInt("height");
                    c34840g.f74005d = Math.max(jSONObject.getLong("totalSize"), jSONObject.getLong("size"));
                    c34840g.f74007f = jSONObject.getInt("bitrate");
                    c34840g.f74010i = jSONObject.getInt("definition");
                    c34840g.f74008g = jSONObject.getString(TtmlNode.RUBY_CONTAINER);
                    c34840g.f74009h = jSONObject.getString("templateName");
                    arrayList.add(c34840g);
                }
            }
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    public final C34840g m76404f() {
        try {
            JSONObject jSONObject = this.f73997a.getJSONObject("videoInfo").getJSONObject("sourceVideo");
            C34840g c34840g = new C34840g();
            c34840g.f74002a = jSONObject.getString("url");
            c34840g.f74006e = jSONObject.getInt(TypedValues.TransitionType.S_DURATION);
            c34840g.f74004c = jSONObject.getInt("width");
            c34840g.f74003b = jSONObject.getInt("height");
            c34840g.f74005d = Math.max(jSONObject.getLong("size"), jSONObject.getLong("totalSize"));
            c34840g.f74007f = jSONObject.getInt("bitrate");
            return c34840g;
        } catch (JSONException e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public final String m76405g() {
        try {
            JSONObject jSONObject = this.f73997a.getJSONObject("videoInfo").getJSONObject("basicInfo");
            if (jSONObject != null) {
                return jSONObject.getString("name");
            }
            return null;
        } catch (JSONException e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    public final String m76406h() {
        try {
            JSONObject jSONObject = this.f73997a.getJSONObject("videoInfo").getJSONObject("basicInfo");
            if (jSONObject != null) {
                return jSONObject.getString(TUIConstants.TUIPlugin.PLUGIN_DESCRIPTION);
            }
            return null;
        } catch (JSONException e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: i */
    public final C34836c.c m76407i() {
        JSONObject jSONObjectOptJSONObject = this.f73997a.optJSONObject("imageSpriteInfo");
        if (jSONObjectOptJSONObject != null) {
            try {
                JSONArray jSONArray = jSONObjectOptJSONObject.getJSONArray("imageSpriteList");
                if (jSONArray != null) {
                    JSONObject jSONObject = jSONArray.getJSONObject(jSONArray.length() - 1);
                    C34836c.c cVar = new C34836c.c();
                    cVar.f73971b = jSONObject.getString("webVttUrl");
                    JSONArray jSONArray2 = jSONObject.getJSONArray("imageUrls");
                    ArrayList<String> arrayList = new ArrayList<>();
                    for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
                        arrayList.add(jSONArray2.getString(i11));
                    }
                    cVar.f73970a = arrayList;
                    return cVar;
                }
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final List<C34836c.d> m76408j() {
        JSONObject jSONObjectOptJSONObject = this.f73997a.optJSONObject("keyFrameDescInfo");
        if (jSONObjectOptJSONObject == null) {
            return null;
        }
        try {
            return m76395a(jSONObjectOptJSONObject);
        } catch (JSONException unused) {
            LiteavLog.m76083e("TXPlayInfoResponse", "v2 parseKeyFrameDescInfo exception");
            return null;
        }
    }

    /* JADX INFO: renamed from: k */
    public final List<a> m76409k() {
        try {
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = this.f73997a.getJSONObject("playerInfo").getJSONArray("videoClassification");
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                a aVar = new a();
                aVar.f73999a = jSONArray.getJSONObject(i11).getString("id");
                aVar.f74000b = jSONArray.getJSONObject(i11).getString("name");
                aVar.f74001c = new ArrayList();
                JSONArray jSONArray2 = jSONArray.getJSONObject(i11).getJSONArray("definitionList");
                for (int i12 = 0; i12 < jSONArray2.length(); i12++) {
                    aVar.f74001c.add(Integer.valueOf(jSONArray2.getInt(i12)));
                }
                arrayList.add(aVar);
            }
            return arrayList;
        } catch (JSONException e11) {
            e11.printStackTrace();
            return null;
        }
    }

    public C34839f(JSONObject jSONObject) {
        this.f73997a = jSONObject;
    }

    /* JADX INFO: renamed from: n */
    private List<Integer> m76398n() {
        List<a> listM76409k = m76409k();
        String strM76397m = m76397m();
        if (strM76397m != null && listM76409k != null) {
            for (a aVar : listM76409k) {
                if (aVar.f73999a.equals(strM76397m)) {
                    return aVar.f74001c;
                }
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final C34840g m76401c() {
        if (m76396l() != null) {
            return m76396l();
        }
        if (m76403e().size() != 0) {
            List<Integer> listM76398n = m76398n();
            if (listM76398n != null) {
                for (C34840g c34840g : m76403e()) {
                    if (listM76398n.contains(Integer.valueOf(c34840g.f74010i))) {
                        return c34840g;
                    }
                }
            }
            return m76403e().get(0);
        }
        return m76404f();
    }

    /* JADX INFO: renamed from: a */
    private static List<C34836c.d> m76395a(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = jSONObject.getJSONArray("keyFrameDescList");
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
            String string = jSONArray.getJSONObject(i11).getString("content");
            float f11 = (float) (jSONArray.getJSONObject(i11).getLong("timeOffset") / 1000.0d);
            C34836c.d dVar = new C34836c.d();
            try {
                dVar.f73972a = URLDecoder.decode(string, "UTF-8");
            } catch (UnsupportedEncodingException e11) {
                e11.printStackTrace();
                dVar.f73972a = "";
            }
            dVar.f73973b = f11;
            arrayList.add(dVar);
        }
        return arrayList;
    }
}
