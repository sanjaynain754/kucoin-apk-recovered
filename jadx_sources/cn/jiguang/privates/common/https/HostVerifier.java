package cn.jiguang.privates.common.https;

import android.text.TextUtils;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

/* JADX INFO: loaded from: classes34.dex */
public class HostVerifier implements HostnameVerifier {
    private static final String TAG = "HostVerifier";
    public String checkHost;

    public HostVerifier(String str) {
        this.checkHost = str;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String str, SSLSession sSLSession) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return TextUtils.equals(this.checkHost, str);
    }
}
