package lc0;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.tencentcloudapi.cls.android.producer.common.Constants;
import com.tencentcloudapi.cls.android.producer.response.PutLogsResponse;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import mc0.C42508b;
import nc0.C42805b;

/* JADX INFO: renamed from: lc0.a */
/* JADX INFO: compiled from: Sender.java */
/* JADX INFO: loaded from: classes2.dex */
public class C42169a {
    /* JADX INFO: renamed from: b */
    public static PutLogsResponse m92588b(C42508b c42508b) throws Exception {
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(m92587a(c42508b)).openConnection()));
        httpURLConnection.setRequestMethod(c42508b.m93213g().toString());
        httpURLConnection.setConnectTimeout(Constants.f77443a);
        httpURLConnection.setReadTimeout(Constants.f77444b);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setDoInput(true);
        for (Map.Entry<String, String> entry : c42508b.m93208b().entrySet()) {
            httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
        }
        OutputStream outputStream = httpURLConnection.getOutputStream();
        outputStream.write(c42508b.m93207a());
        PutLogsResponse putLogsResponse = new PutLogsResponse(httpURLConnection.getHeaderFields());
        putLogsResponse.SetHttpStatusCode(Integer.valueOf(httpURLConnection.getResponseCode()));
        outputStream.close();
        return putLogsResponse;
    }

    /* JADX INFO: renamed from: a */
    public static String m92587a(C42508b c42508b) {
        String string = c42508b.m93212f().toString();
        if (!string.endsWith("/") && (c42508b.m93215i() == null || !c42508b.m93215i().startsWith("/"))) {
            string = string + "/";
        }
        if (c42508b.m93215i() != null) {
            string = string + c42508b.m93215i();
        }
        String strM93832a = C42805b.m93832a(c42508b.m93214h(), "UTF-8");
        if (strM93832a != null) {
            return string + "?" + strM93832a;
        }
        return string;
    }
}
