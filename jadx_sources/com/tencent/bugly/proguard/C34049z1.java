package com.tencent.bugly.proguard;

import com.tencent.bugly.network.BuglyListenerFactory;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.z1 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C34049z1 implements Interceptor {

    /* JADX INFO: renamed from: a */
    public static final C34049z1 f72585a = new C34049z1();

    /* JADX INFO: renamed from: a */
    public void m75572a(Call call, IOException iOException) {
        BuglyListenerFactory.getInstance().onCallEnd(call, true, iOException);
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Request request = chain.request();
        Call call = chain.call();
        try {
            return chain.proceed(request);
        } catch (IOException e11) {
            m75572a(call, e11);
            throw e11;
        } catch (Throwable th2) {
            IOException iOException = new IOException(th2);
            m75572a(call, iOException);
            throw iOException;
        }
    }
}
