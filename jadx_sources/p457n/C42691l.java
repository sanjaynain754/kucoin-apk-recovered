package p457n;

import ai.advance.network.BodyContentType;
import android.text.TextUtils;
import com.jumio.commons.log.LogUtils;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import p520p.AbstractC43343d;
import p520p.C43340a;
import p520p.C43341b;
import p520p.C43342c;

/* JADX INFO: renamed from: n.l */
/* JADX INFO: loaded from: classes23.dex */
public class C42691l {
    /* JADX INFO: renamed from: a */
    public static byte[] m93561a(C43342c c43342c) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            List<C43342c.b> listM95421c = c43342c.m95421c();
            if (listM95421c != null && !listM95421c.isEmpty()) {
                for (C43342c.b bVar : listM95421c) {
                    byteArrayOutputStream.write("--esu2fhj1C0QmBl2Z\r\n".getBytes());
                    byteArrayOutputStream.write(("Content-Disposition: form-data; name=\"" + bVar.m95434b() + "\"; filename=\"" + bVar.m95432d() + "\"" + LogUtils.NEW_LINE).getBytes());
                    String strM95433a = bVar.m95433a();
                    if (!strM95433a.isEmpty()) {
                        byteArrayOutputStream.write(("Content-Type: " + strM95433a + LogUtils.NEW_LINE).getBytes());
                    }
                    byteArrayOutputStream.write(LogUtils.NEW_LINE.getBytes());
                    byteArrayOutputStream.write(bVar.m95431c());
                    byteArrayOutputStream.write(LogUtils.NEW_LINE.getBytes());
                }
            }
            c43342c.m95422d();
            c43342c.m95423e();
            byteArrayOutputStream.write("--esu2fhj1C0QmBl2Z--".getBytes());
        } catch (Exception unused) {
        } catch (Throwable th2) {
            try {
                byteArrayOutputStream.close();
            } catch (Exception unused2) {
            }
            throw th2;
        }
        try {
            byteArrayOutputStream.close();
        } catch (Exception unused3) {
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX INFO: renamed from: b */
    public static String m93562b(Map<String, Object> map) throws Exception {
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (!TextUtils.isEmpty(key) && value != null) {
                Charset charset = StandardCharsets.UTF_8;
                sb2.append(URLEncoder.encode(key, charset.name()));
                sb2.append("=");
                sb2.append(URLEncoder.encode(value.toString(), charset.name()));
                sb2.append("&");
            }
        }
        if (sb2.length() > 0) {
            sb2.deleteCharAt(sb2.length() - 1);
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: c */
    public static void m93563c(HttpURLConnection httpURLConnection, AbstractC43343d abstractC43343d) throws Exception {
        if (abstractC43343d instanceof C43340a) {
            m93565e(httpURLConnection, (C43340a) abstractC43343d);
        } else if (abstractC43343d instanceof C43341b) {
            m93566f(httpURLConnection, (C43341b) abstractC43343d);
        } else if (abstractC43343d instanceof C43342c) {
            m93567g(httpURLConnection, (C43342c) abstractC43343d);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m93564d(HttpURLConnection httpURLConnection, byte[] bArr) throws IOException {
        httpURLConnection.setRequestProperty("Content-Type", BodyContentType.MULTIPART.getValue() + "; boundary=esu2fhj1C0QmBl2Z");
        DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
        try {
            dataOutputStream.write(bArr);
            dataOutputStream.close();
        } catch (Throwable th2) {
            try {
                dataOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m93565e(HttpURLConnection httpURLConnection, C43340a c43340a) throws Exception {
        Map<String, Object> mapM95415b = c43340a.m95415b();
        if (mapM95415b != null && !mapM95415b.isEmpty()) {
            httpURLConnection.setRequestProperty("Content-Type", BodyContentType.FORM.getValue());
            String strM93562b = m93562b(mapM95415b);
            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
            try {
                dataOutputStream.writeBytes(strM93562b);
                dataOutputStream.close();
            } catch (Throwable th2) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m93566f(HttpURLConnection httpURLConnection, C43341b c43341b) throws IOException {
        String strM95416b = c43341b.m95416b();
        if (TextUtils.isEmpty(strM95416b)) {
            return;
        }
        httpURLConnection.setRequestProperty("Content-Type", BodyContentType.JSON.getValue() + "; charset=UTF-8");
        DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
        try {
            dataOutputStream.writeBytes(strM95416b);
            dataOutputStream.close();
        } catch (Throwable th2) {
            try {
                dataOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m93567g(HttpURLConnection httpURLConnection, C43342c c43342c) throws Exception {
        byte[] bArrM95420b = c43342c.m95420b();
        if (bArrM95420b != null) {
            m93564d(httpURLConnection, bArrM95420b);
            return;
        }
        httpURLConnection.setRequestProperty("Content-Type", BodyContentType.MULTIPART.getValue() + "; boundary=esu2fhj1C0QmBl2Z");
        DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
        try {
            dataOutputStream.write(m93561a(c43342c));
            dataOutputStream.close();
        } catch (Throwable th2) {
            try {
                dataOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}
