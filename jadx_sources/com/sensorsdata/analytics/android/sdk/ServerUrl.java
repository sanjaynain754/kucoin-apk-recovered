package com.sensorsdata.analytics.android.sdk;

import android.net.Uri;
import android.text.TextUtils;
import com.tencent.bugly.proguard.InterfaceC33826o0;

/* JADX INFO: loaded from: classes59.dex */
public class ServerUrl {
    private String baseUrl;
    private String host;
    private String project;
    private String token;
    private String url;

    private ServerUrl() {
    }

    public String getBaseUrl() {
        return this.baseUrl;
    }

    public ServerUrl(String str) {
        this.url = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.baseUrl = getBaseUrl(str);
        Uri uri = Uri.parse(str);
        try {
            this.host = uri.getHost();
            this.token = uri.getQueryParameter(InterfaceC33826o0.f71244p);
            this.project = uri.getQueryParameter("project");
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        } finally {
            if (TextUtils.isEmpty(this.host)) {
                this.host = "";
            }
            if (TextUtils.isEmpty(this.project)) {
                this.project = "default";
            }
            if (TextUtils.isEmpty(this.token)) {
                this.token = "";
            }
        }
    }

    public boolean check(ServerUrl serverUrl) {
        if (serverUrl == null) {
            return false;
        }
        try {
            return getHost().equals(serverUrl.getHost()) && getProject().equals(serverUrl.getProject());
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
            return false;
        }
    }

    public String getBaseUrl(String str) {
        int iLastIndexOf;
        return (TextUtils.isEmpty(str) || (iLastIndexOf = str.lastIndexOf("/")) == -1) ? "" : str.substring(0, iLastIndexOf);
    }

    public String getHost() {
        return this.host;
    }

    public String getProject() {
        return this.project;
    }

    public String getToken() {
        return this.token;
    }

    public String getUrl() {
        return this.url;
    }

    public String toString() {
        return "url=" + this.url + ",baseUrl" + this.baseUrl + ",host=" + this.host + ",project=" + this.project + ",token=" + this.token;
    }
}
