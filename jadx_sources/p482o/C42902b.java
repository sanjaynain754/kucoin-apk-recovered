package p482o;

import ai.advance.network.NetworkFailedException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: o.b */
/* JADX INFO: loaded from: classes23.dex */
public class C42902b {

    /* JADX INFO: renamed from: a */
    public final List<InterfaceC42903c> f94980a = new ArrayList();

    /* JADX INFO: renamed from: a */
    public void m94081a(InterfaceC42903c interfaceC42903c) {
        this.f94980a.add(interfaceC42903c);
    }

    /* JADX INFO: renamed from: b */
    public final String m94082b(int i11, HttpURLConnection httpURLConnection, String str) throws NetworkFailedException {
        if (i11 >= this.f94980a.size()) {
            return str;
        }
        return m94082b(i11 + 1, httpURLConnection, this.f94980a.get(i11).mo94080a(httpURLConnection, str));
    }

    /* JADX INFO: renamed from: c */
    public String m94083c(HttpURLConnection httpURLConnection, String str) throws NetworkFailedException {
        return !this.f94980a.isEmpty() ? m94082b(0, httpURLConnection, str) : str;
    }
}
