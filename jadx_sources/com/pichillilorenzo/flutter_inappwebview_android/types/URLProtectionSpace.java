package com.pichillilorenzo.flutter_inappwebview_android.types;

import android.net.http.SslCertificate;
import android.net.http.SslError;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes59.dex */
public class URLProtectionSpace {
    private String host;

    /* JADX INFO: renamed from: id */
    private Long f55836id;
    private int port;
    private String protocol;
    private String realm;
    private SslCertificate sslCertificate;
    private SslError sslError;

    public URLProtectionSpace(String str, String str2, String str3, int i11, SslCertificate sslCertificate, SslError sslError) {
        this.host = str;
        this.protocol = str2;
        this.realm = str3;
        this.port = i11;
        this.sslCertificate = sslCertificate;
        this.sslError = sslError;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            URLProtectionSpace uRLProtectionSpace = (URLProtectionSpace) obj;
            if (this.port != uRLProtectionSpace.port || !this.host.equals(uRLProtectionSpace.host) || !this.protocol.equals(uRLProtectionSpace.protocol)) {
                return false;
            }
            String str = this.realm;
            if (str == null ? uRLProtectionSpace.realm != null : !str.equals(uRLProtectionSpace.realm)) {
                return false;
            }
            SslCertificate sslCertificate = this.sslCertificate;
            if (sslCertificate == null ? uRLProtectionSpace.sslCertificate != null : !sslCertificate.equals(uRLProtectionSpace.sslCertificate)) {
                return false;
            }
            SslError sslError = this.sslError;
            SslError sslError2 = uRLProtectionSpace.sslError;
            if (sslError != null) {
                return sslError.equals(sslError2);
            }
            if (sslError2 == null) {
                return true;
            }
        }
        return false;
    }

    public String getHost() {
        return this.host;
    }

    public Long getId() {
        return this.f55836id;
    }

    public int getPort() {
        return this.port;
    }

    public String getProtocol() {
        return this.protocol;
    }

    public String getRealm() {
        return this.realm;
    }

    public SslCertificate getSslCertificate() {
        return this.sslCertificate;
    }

    public SslError getSslError() {
        return this.sslError;
    }

    public int hashCode() {
        int iHashCode = ((this.host.hashCode() * 31) + this.protocol.hashCode()) * 31;
        String str = this.realm;
        int iHashCode2 = (((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.port) * 31;
        SslCertificate sslCertificate = this.sslCertificate;
        int iHashCode3 = (iHashCode2 + (sslCertificate != null ? sslCertificate.hashCode() : 0)) * 31;
        SslError sslError = this.sslError;
        return iHashCode3 + (sslError != null ? sslError.hashCode() : 0);
    }

    public void setHost(String str) {
        this.host = str;
    }

    public void setId(Long l11) {
        this.f55836id = l11;
    }

    public void setPort(int i11) {
        this.port = i11;
    }

    public void setProtocol(String str) {
        this.protocol = str;
    }

    public void setRealm(String str) {
        this.realm = str;
    }

    public void setSslCertificate(SslCertificate sslCertificate) {
        this.sslCertificate = sslCertificate;
    }

    public void setSslError(SslError sslError) {
        this.sslError = sslError;
    }

    public Map<String, Object> toMap() {
        HashMap map = new HashMap();
        map.put("host", this.host);
        map.put("protocol", this.protocol);
        map.put(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_REALM, this.realm);
        map.put("port", Integer.valueOf(this.port));
        map.put("sslCertificate", SslCertificateExt.toMap(this.sslCertificate));
        map.put("sslError", SslErrorExt.toMap(this.sslError));
        map.put("authenticationMethod", null);
        map.put("distinguishedNames", null);
        map.put("receivesCredentialSecurely", null);
        map.put("isProxy", null);
        map.put("proxyType", null);
        return map;
    }

    public String toString() {
        return "URLProtectionSpace{host='" + this.host + "', protocol='" + this.protocol + "', realm='" + this.realm + "', port=" + this.port + ", sslCertificate=" + this.sslCertificate + ", sslError=" + this.sslError + '}';
    }

    public URLProtectionSpace(Long l11, String str, String str2, String str3, int i11) {
        this.f55836id = l11;
        this.host = str;
        this.protocol = str2;
        this.realm = str3;
        this.port = i11;
    }
}
