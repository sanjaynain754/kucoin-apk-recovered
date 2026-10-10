package mc0;

import com.tencentcloudapi.cls.android.producer.http.comm.HttpMethod;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import oc0.C43014a;

/* JADX INFO: renamed from: mc0.b */
/* JADX INFO: compiled from: RequestMessage.java */
/* JADX INFO: loaded from: classes2.dex */
public class C42508b extends AbstractC42507a {

    /* JADX INFO: renamed from: e */
    public URI f94184e;

    /* JADX INFO: renamed from: f */
    public String f94185f;

    /* JADX INFO: renamed from: d */
    public HttpMethod f94183d = HttpMethod.GET;

    /* JADX INFO: renamed from: g */
    public Map<String, String> f94186g = new HashMap();

    /* JADX INFO: renamed from: f */
    public URI m93212f() {
        return this.f94184e;
    }

    /* JADX INFO: renamed from: g */
    public HttpMethod m93213g() {
        return this.f94183d;
    }

    /* JADX INFO: renamed from: h */
    public Map<String, String> m93214h() {
        return this.f94186g;
    }

    /* JADX INFO: renamed from: i */
    public String m93215i() {
        return this.f94185f;
    }

    /* JADX INFO: renamed from: j */
    public void m93216j(URI uri) {
        this.f94184e = uri;
    }

    /* JADX INFO: renamed from: k */
    public void m93217k(HttpMethod httpMethod) {
        this.f94183d = httpMethod;
    }

    /* JADX INFO: renamed from: l */
    public void m93218l(Map<String, String> map) {
        C43014a.m94481a(map, "parameters");
        this.f94186g = map;
    }

    /* JADX INFO: renamed from: m */
    public void m93219m(String str) {
        this.f94185f = str;
    }
}
