package ac0;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import io.flutter.plugin.common.MethodChannel;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: ac0.c */
/* JADX INFO: compiled from: BatchOperation.java */
/* JADX INFO: loaded from: classes59.dex */
public class C0233c extends AbstractC0231a {

    /* JADX INFO: renamed from: a */
    public final Map<String, Object> f689a;

    /* JADX INFO: renamed from: b */
    public final a f690b = new a();

    /* JADX INFO: renamed from: c */
    public final boolean f691c;

    /* JADX INFO: renamed from: ac0.c$a */
    /* JADX INFO: compiled from: BatchOperation.java */
    public class a implements InterfaceC0236f {

        /* JADX INFO: renamed from: a */
        public Object f692a;

        /* JADX INFO: renamed from: b */
        public String f693b;

        /* JADX INFO: renamed from: c */
        public String f694c;

        /* JADX INFO: renamed from: d */
        public Object f695d;

        public a() {
        }

        @Override // ac0.InterfaceC0236f
        public void error(String str, String str2, Object obj) {
            this.f693b = str;
            this.f694c = str2;
            this.f695d = obj;
        }

        @Override // ac0.InterfaceC0236f
        public void success(Object obj) {
            this.f692a = obj;
        }
    }

    @Override // ac0.InterfaceC0235e
    /* JADX INFO: renamed from: a */
    public <T> T mo863a(String str) {
        return (T) this.f689a.get(str);
    }

    @Override // ac0.InterfaceC0235e
    /* JADX INFO: renamed from: b */
    public boolean mo864b(String str) {
        return this.f689a.containsKey(str);
    }

    @Override // ac0.AbstractC0232b, ac0.InterfaceC0235e
    /* JADX INFO: renamed from: f */
    public boolean mo857f() {
        return this.f691c;
    }

    @Override // ac0.InterfaceC0235e
    public String getMethod() {
        return (String) this.f689a.get(FirebaseAnalytics.Param.METHOD);
    }

    @Override // ac0.AbstractC0231a
    /* JADX INFO: renamed from: l */
    public InterfaceC0236f mo853l() {
        return this.f690b;
    }

    /* JADX INFO: renamed from: m */
    public Map<String, Object> m865m() {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        map2.put("code", this.f690b.f693b);
        map2.put("message", this.f690b.f694c);
        map2.put("data", this.f690b.f695d);
        map.put(Constants.IPC_BUNDLE_KEY_SEND_ERROR, map2);
        return map;
    }

    /* JADX INFO: renamed from: n */
    public Map<String, Object> m866n() {
        HashMap map = new HashMap();
        map.put(DbParams.KEY_CHANNEL_RESULT, this.f690b.f692a);
        return map;
    }

    /* JADX INFO: renamed from: o */
    public void m867o(MethodChannel.Result result) {
        a aVar = this.f690b;
        result.error(aVar.f693b, aVar.f694c, aVar.f695d);
    }

    public C0233c(Map<String, Object> map, boolean z11) {
        this.f689a = map;
        this.f691c = z11;
    }

    /* JADX INFO: renamed from: p */
    public void m868p(List<Map<String, Object>> list) {
        if (!mo857f()) {
            list.add(m865m());
        }
    }

    /* JADX INFO: renamed from: q */
    public void m869q(List<Map<String, Object>> list) {
        if (!mo857f()) {
            list.add(m866n());
        }
    }
}
