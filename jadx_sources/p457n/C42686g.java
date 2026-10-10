package p457n;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import p520p.AbstractC43343d;

/* JADX INFO: renamed from: n.g */
/* JADX INFO: loaded from: classes23.dex */
public class C42686g {

    /* JADX INFO: renamed from: h */
    public static Map<String, Object> f94471h;

    /* JADX INFO: renamed from: a */
    public final String f94472a;

    /* JADX INFO: renamed from: b */
    public final Map<String, Object> f94473b;

    /* JADX INFO: renamed from: c */
    public final AbstractC43343d f94474c;

    /* JADX INFO: renamed from: d */
    public final String f94475d;

    /* JADX INFO: renamed from: e */
    public final String f94476e;

    /* JADX INFO: renamed from: f */
    public final String f94477f;

    /* JADX INFO: renamed from: g */
    public final String f94478g = UUID.randomUUID().toString();

    /* JADX INFO: renamed from: n.g$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public String f94479a;

        /* JADX INFO: renamed from: c */
        public AbstractC43343d f94481c;

        /* JADX INFO: renamed from: e */
        public String f94483e;

        /* JADX INFO: renamed from: f */
        public String f94484f;

        /* JADX INFO: renamed from: b */
        public final Map<String, Object> f94480b = new HashMap();

        /* JADX INFO: renamed from: d */
        public String f94482d = "POST";

        /* JADX INFO: renamed from: g */
        public a m93542g(Map<String, Object> map) {
            if (map != null && !map.isEmpty()) {
                this.f94480b.putAll(map);
            }
            return this;
        }

        /* JADX INFO: renamed from: h */
        public C42686g m93543h() {
            return new C42686g(this);
        }

        /* JADX INFO: renamed from: i */
        public a m93544i(String str) {
            this.f94483e = str;
            return this;
        }

        /* JADX INFO: renamed from: j */
        public a m93545j(String str) {
            this.f94484f = str;
            return this;
        }

        /* JADX INFO: renamed from: k */
        public a m93546k(String str) {
            this.f94482d = str;
            return this;
        }

        /* JADX INFO: renamed from: l */
        public a m93547l(String str) {
            this.f94479a = str;
            return this;
        }

        /* JADX INFO: renamed from: m */
        public a m93548m(AbstractC43343d abstractC43343d) {
            this.f94481c = abstractC43343d;
            return this;
        }
    }

    /* JADX INFO: renamed from: a */
    public String m93530a() {
        return this.f94476e;
    }

    /* JADX INFO: renamed from: b */
    public String m93531b() {
        return this.f94477f;
    }

    /* JADX INFO: renamed from: c */
    public Map<String, Object> m93532c() {
        return this.f94473b;
    }

    /* JADX INFO: renamed from: d */
    public String m93533d() {
        return this.f94475d;
    }

    /* JADX INFO: renamed from: e */
    public String m93534e() {
        return this.f94472a;
    }

    /* JADX INFO: renamed from: f */
    public AbstractC43343d m93535f() {
        return this.f94474c;
    }

    public C42686g(a aVar) {
        this.f94472a = aVar.f94479a;
        Map<String, Object> map = aVar.f94480b;
        this.f94473b = map;
        this.f94474c = aVar.f94481c;
        this.f94475d = aVar.f94482d;
        this.f94476e = aVar.f94483e;
        this.f94477f = aVar.f94484f;
        Map<String, Object> map2 = f94471h;
        if (map2 != null && !map2.isEmpty()) {
            map.putAll(f94471h);
        }
    }
}
