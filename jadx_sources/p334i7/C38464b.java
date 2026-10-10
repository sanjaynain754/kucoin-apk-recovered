package p334i7;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import java.util.HashSet;

/* JADX INFO: renamed from: i7.b */
/* JADX INFO: compiled from: DupDetector.java */
/* JADX INFO: loaded from: classes45.dex */
public class C38464b {

    /* JADX INFO: renamed from: a */
    public final Object f86309a;

    /* JADX INFO: renamed from: b */
    public String f86310b;

    /* JADX INFO: renamed from: c */
    public String f86311c;

    /* JADX INFO: renamed from: d */
    public HashSet<String> f86312d;

    /* JADX INFO: renamed from: d */
    public void m86793d() {
        this.f86310b = null;
        this.f86311c = null;
        this.f86312d = null;
    }

    /* JADX INFO: renamed from: e */
    public static C38464b m86788e(JsonGenerator jsonGenerator) {
        return new C38464b(jsonGenerator);
    }

    /* JADX INFO: renamed from: f */
    public static C38464b m86789f(JsonParser jsonParser) {
        return new C38464b(jsonParser);
    }

    /* JADX INFO: renamed from: a */
    public C38464b m86790a() {
        return new C38464b(this.f86309a);
    }

    /* JADX INFO: renamed from: b */
    public Object m86791b() {
        return this.f86309a;
    }

    /* JADX INFO: renamed from: c */
    public boolean m86792c(String str) throws JsonParseException {
        String str2 = this.f86310b;
        if (str2 == null) {
            this.f86310b = str;
            return false;
        }
        if (str.equals(str2)) {
            return true;
        }
        String str3 = this.f86311c;
        if (str3 == null) {
            this.f86311c = str;
            return false;
        }
        if (str.equals(str3)) {
            return true;
        }
        if (this.f86312d == null) {
            HashSet<String> hashSet = new HashSet<>(16);
            this.f86312d = hashSet;
            hashSet.add(this.f86310b);
            this.f86312d.add(this.f86311c);
        }
        return !this.f86312d.add(str);
    }

    public C38464b(Object obj) {
        this.f86309a = obj;
    }
}
