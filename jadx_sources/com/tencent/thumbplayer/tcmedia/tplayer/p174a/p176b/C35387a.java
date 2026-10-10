package com.tencent.thumbplayer.tcmedia.tplayer.p174a.p176b;

import com.kubi.otc.entity.OtcAd;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDownloadProxyEnum;
import com.tencent.thumbplayer.tcmedia.utils.TPLogUtil;
import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.tplayer.a.b.a */
/* JADX INFO: loaded from: classes64.dex */
public class C35387a implements Serializable {

    /* JADX INFO: renamed from: a */
    @a(m78405a = "flowid")
    private String f76219a = "";

    /* JADX INFO: renamed from: b */
    @a(m78405a = TPDownloadProxyEnum.USER_GUID)
    private String f76220b = "";

    /* JADX INFO: renamed from: c */
    @a(m78405a = "seq")
    private int f76221c = -1;

    /* JADX INFO: renamed from: d */
    @a(m78405a = "platformtype")
    private int f76222d = -1;

    /* JADX INFO: renamed from: e */
    @a(m78405a = "devtype")
    private int f76223e = -1;

    /* JADX INFO: renamed from: f */
    @a(m78405a = "networktype")
    private int f76224f = -1;

    /* JADX INFO: renamed from: g */
    @a(m78405a = "devicename")
    private String f76225g = "";

    /* JADX INFO: renamed from: h */
    @a(m78405a = "osver")
    private String f76226h = "";

    /* JADX INFO: renamed from: i */
    @a(m78405a = "appname")
    private String f76227i = "";

    /* JADX INFO: renamed from: j */
    @a(m78405a = "appver")
    private String f76228j = "";

    /* JADX INFO: renamed from: k */
    @a(m78405a = "playerver")
    private String f76229k = "";

    /* JADX INFO: renamed from: l */
    @a(m78405a = "reportprotocolver")
    private String f76230l = "";

    /* JADX INFO: renamed from: m */
    @a(m78405a = "durationms")
    private long f76231m = -1;

    /* JADX INFO: renamed from: n */
    @a(m78405a = "hlssourcetype")
    private int f76232n = -1;

    /* JADX INFO: renamed from: o */
    @a(m78405a = "playertype")
    private int f76233o = -1;

    /* JADX INFO: renamed from: p */
    @a(m78405a = "urlprotocol")
    private int f76234p = -1;

    /* JADX INFO: renamed from: q */
    @a(m78405a = "containerformat")
    private String f76235q = "";

    /* JADX INFO: renamed from: r */
    @a(m78405a = "videoencodefmt")
    private int f76236r = -1;

    /* JADX INFO: renamed from: s */
    @a(m78405a = "audioencodefmt")
    private int f76237s = -1;

    /* JADX INFO: renamed from: t */
    @a(m78405a = "subtitleencodefmt")
    private int f76238t = -1;

    /* JADX INFO: renamed from: u */
    @a(m78405a = "streambitratekbps")
    private long f76239u = -1;

    /* JADX INFO: renamed from: v */
    @a(m78405a = "videoframerate")
    private float f76240v = -1.0f;

    /* JADX INFO: renamed from: w */
    @a(m78405a = "url")
    private String f76241w = "";

    /* JADX INFO: renamed from: x */
    @a(m78405a = "resolution")
    private String f76242x = "";

    /* JADX INFO: renamed from: y */
    @a(m78405a = "datatransportver")
    private String f76243y = "";

    /* JADX INFO: renamed from: z */
    @a(m78405a = "speedkbps")
    private int f76244z = -1;

    /* JADX INFO: renamed from: A */
    @a(m78405a = "usedatatransport")
    private int f76208A = -1;

    /* JADX INFO: renamed from: B */
    @a(m78405a = "datatransportprotocolver")
    private String f76209B = "";

    /* JADX INFO: renamed from: C */
    @a(m78405a = "cdnuip")
    private String f76210C = "";

    /* JADX INFO: renamed from: D */
    @a(m78405a = "cdnip")
    private String f76211D = "";

    /* JADX INFO: renamed from: E */
    @a(m78405a = "platform")
    private int f76212E = -1;

    /* JADX INFO: renamed from: F */
    @a(m78405a = "playerconfig")
    private String f76213F = "";

    /* JADX INFO: renamed from: G */
    @a(m78405a = "drmability")
    private int f76214G = -1;

    /* JADX INFO: renamed from: H */
    private Map<String, String> f76215H = null;

    /* JADX INFO: renamed from: I */
    private Map<String, String> f76216I = null;

    /* JADX INFO: renamed from: J */
    private Map<String, String> f76217J = null;

    /* JADX INFO: renamed from: K */
    private Map<String, String> f76218K = null;

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.tplayer.a.b.a$a */
    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface a {
        /* JADX INFO: renamed from: a */
        String m78405a() default "";
    }

    /* JADX INFO: renamed from: c */
    private void m78363c() {
        Map<String, String> map;
        Map<String, String> map2 = this.f76215H;
        if (map2 == null || (map = this.f76217J) == null) {
            return;
        }
        m78362a(map2, map);
    }

    /* JADX INFO: renamed from: d */
    private void m78364d() {
        Map<String, String> map;
        Map<String, String> map2 = this.f76216I;
        if (map2 == null || (map = this.f76218K) == null) {
            return;
        }
        m78362a(map2, map);
    }

    /* JADX INFO: renamed from: a */
    public String m78365a() {
        return this.f76219a;
    }

    /* JADX INFO: renamed from: b */
    public Map<String, String> m78372b() {
        HashMap map = new HashMap();
        Class<? super Object> superclass = getClass().getSuperclass();
        if (superclass != null) {
            map.putAll(m78361a(superclass.getDeclaredFields()));
        }
        map.putAll(m78361a(getClass().getDeclaredFields()));
        m78363c();
        m78364d();
        Map<String, String> map2 = this.f76215H;
        if (map2 != null) {
            map.putAll(map2);
        }
        Map<String, String> map3 = this.f76217J;
        if (map3 != null) {
            map.putAll(map3);
        }
        Map<String, String> map4 = this.f76216I;
        if (map4 != null) {
            map.putAll(map4);
        }
        Map<String, String> map5 = this.f76218K;
        if (map5 != null) {
            map.putAll(map5);
        }
        return map;
    }

    /* JADX INFO: renamed from: e */
    public void m78383e(int i11) {
        this.f76232n = i11;
    }

    /* JADX INFO: renamed from: f */
    public void m78385f(int i11) {
        this.f76233o = i11;
    }

    /* JADX INFO: renamed from: g */
    public void m78387g(int i11) {
        this.f76234p = i11;
    }

    /* JADX INFO: renamed from: h */
    public void m78389h(int i11) {
        this.f76236r = i11;
    }

    /* JADX INFO: renamed from: i */
    public void m78391i(int i11) {
        this.f76237s = i11;
    }

    /* JADX INFO: renamed from: j */
    public void m78393j(int i11) {
        this.f76238t = i11;
    }

    /* JADX INFO: renamed from: k */
    public void m78395k(int i11) {
        this.f76244z = i11;
    }

    /* JADX INFO: renamed from: l */
    public void m78397l(int i11) {
        this.f76208A = i11;
    }

    /* JADX INFO: renamed from: m */
    public void m78399m(int i11) {
        this.f76212E = i11;
    }

    /* JADX INFO: renamed from: n */
    public void m78401n(int i11) {
        this.f76214G = i11;
    }

    /* JADX INFO: renamed from: a */
    private String m78360a(Field field) {
        try {
            field.setAccessible(true);
            if (field.getType() == Integer.TYPE) {
                return String.valueOf(field.getInt(this));
            }
            if (field.getType() == Long.TYPE) {
                return String.valueOf(field.getLong(this));
            }
            if (field.getType() == Float.TYPE) {
                return String.valueOf(field.getFloat(this));
            }
            if (field.getType() == Boolean.TYPE) {
                return String.valueOf(field.getBoolean(this));
            }
            if (field.getType() == String.class) {
                return (String) field.get(this);
            }
            TPLogUtil.m78797e(getClass().getName(), "getFieldValue field:" + field.getName() + " is not match.");
            return OtcAd.KYC_NOT_PASS;
        } catch (Exception e11) {
            TPLogUtil.m78798e(getClass().getName(), e11);
            return OtcAd.KYC_NOT_PASS;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m78373b(int i11) {
        this.f76222d = i11;
    }

    /* JADX INFO: renamed from: c */
    public void m78377c(int i11) {
        this.f76223e = i11;
    }

    /* JADX INFO: renamed from: d */
    public void m78380d(int i11) {
        this.f76224f = i11;
    }

    /* JADX INFO: renamed from: e */
    public void m78384e(String str) {
        this.f76227i = str;
    }

    /* JADX INFO: renamed from: f */
    public void m78386f(String str) {
        this.f76229k = str;
    }

    /* JADX INFO: renamed from: g */
    public void m78388g(String str) {
        this.f76228j = str;
    }

    /* JADX INFO: renamed from: h */
    public void m78390h(String str) {
        this.f76230l = str;
    }

    /* JADX INFO: renamed from: i */
    public void m78392i(String str) {
        this.f76235q = str;
    }

    /* JADX INFO: renamed from: j */
    public void m78394j(String str) {
        this.f76241w = str;
    }

    /* JADX INFO: renamed from: k */
    public void m78396k(String str) {
        this.f76242x = str;
    }

    /* JADX INFO: renamed from: l */
    public void m78398l(String str) {
        this.f76243y = str;
    }

    /* JADX INFO: renamed from: m */
    public void m78400m(String str) {
        this.f76210C = str;
    }

    /* JADX INFO: renamed from: n */
    public void m78402n(String str) {
        this.f76211D = str;
    }

    /* JADX INFO: renamed from: o */
    public void m78403o(String str) {
        this.f76209B = str;
    }

    /* JADX INFO: renamed from: p */
    public void m78404p(String str) {
        this.f76213F = str;
    }

    /* JADX INFO: renamed from: a */
    private Map<String, String> m78361a(Field[] fieldArr) {
        HashMap map = new HashMap();
        for (Field field : fieldArr) {
            a aVar = (a) field.getAnnotation(a.class);
            if (aVar != null) {
                map.put(aVar.m78405a(), m78360a(field));
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: b */
    public void m78374b(long j11) {
        this.f76239u = j11;
    }

    /* JADX INFO: renamed from: c */
    public void m78378c(String str) {
        this.f76225g = str;
    }

    /* JADX INFO: renamed from: d */
    public void m78381d(String str) {
        this.f76226h = str;
    }

    /* JADX INFO: renamed from: a */
    public void m78366a(float f11) {
        this.f76240v = f11;
    }

    /* JADX INFO: renamed from: b */
    public void m78375b(String str) {
        this.f76220b = str;
    }

    /* JADX INFO: renamed from: c */
    public void m78379c(Map<String, String> map) {
        this.f76217J = map;
    }

    /* JADX INFO: renamed from: d */
    public void m78382d(Map<String, String> map) {
        this.f76218K = map;
    }

    /* JADX INFO: renamed from: a */
    public void m78367a(int i11) {
        this.f76221c = i11;
    }

    /* JADX INFO: renamed from: b */
    public void m78376b(Map<String, String> map) {
        this.f76216I = map;
    }

    /* JADX INFO: renamed from: a */
    public void m78368a(long j11) {
        this.f76231m = j11;
    }

    /* JADX INFO: renamed from: a */
    public void m78369a(C35387a c35387a) {
        this.f76219a = c35387a.f76219a;
        this.f76220b = c35387a.f76220b;
        this.f76221c = c35387a.f76221c;
        this.f76222d = c35387a.f76222d;
        this.f76223e = c35387a.f76223e;
        this.f76224f = c35387a.f76224f;
        this.f76225g = c35387a.f76225g;
        this.f76226h = c35387a.f76226h;
        this.f76227i = c35387a.f76227i;
        this.f76229k = c35387a.f76229k;
        this.f76228j = c35387a.f76228j;
        this.f76230l = c35387a.f76230l;
        this.f76231m = c35387a.f76231m;
        this.f76232n = c35387a.f76232n;
        this.f76233o = c35387a.f76233o;
        this.f76234p = c35387a.f76234p;
        this.f76235q = c35387a.f76235q;
        this.f76236r = c35387a.f76236r;
        this.f76237s = c35387a.f76237s;
        this.f76238t = c35387a.f76238t;
        this.f76239u = c35387a.f76239u;
        this.f76240v = c35387a.f76240v;
        this.f76241w = c35387a.f76241w;
        this.f76242x = c35387a.f76242x;
        this.f76243y = c35387a.f76243y;
        this.f76244z = c35387a.f76244z;
        this.f76208A = c35387a.f76208A;
        this.f76210C = c35387a.f76210C;
        this.f76211D = c35387a.f76211D;
        this.f76209B = c35387a.f76209B;
        this.f76212E = c35387a.f76212E;
        this.f76213F = c35387a.f76213F;
        this.f76215H = c35387a.f76215H;
        this.f76216I = c35387a.f76216I;
        this.f76217J = c35387a.f76217J;
        this.f76218K = c35387a.f76218K;
        this.f76214G = c35387a.f76214G;
    }

    /* JADX INFO: renamed from: a */
    public void m78370a(String str) {
        this.f76219a = str;
    }

    /* JADX INFO: renamed from: a */
    public void m78371a(Map<String, String> map) {
        this.f76215H = map;
    }

    /* JADX INFO: renamed from: a */
    private static void m78362a(Map<String, String> map, Map<String, String> map2) {
        for (Map.Entry<String, String> entry : map2.entrySet()) {
            if (map.containsKey(entry.getKey())) {
                map.put(entry.getKey(), entry.getValue());
            }
        }
    }
}
