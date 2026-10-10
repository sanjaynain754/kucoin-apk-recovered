package com.geetest.captcha;

import java.util.Map;

/* JADX INFO: loaded from: classes45.dex */
public class GTCaptcha4Config implements NoProguard {

    /* JADX INFO: renamed from: a */
    public final boolean f11108a;

    /* JADX INFO: renamed from: b */
    public final String f11109b;

    /* JADX INFO: renamed from: c */
    public final String f11110c;

    /* JADX INFO: renamed from: d */
    public final String[] f11111d;

    /* JADX INFO: renamed from: e */
    public final String[] f11112e;

    /* JADX INFO: renamed from: f */
    public final Map<String, Object> f11113f;

    /* JADX INFO: renamed from: g */
    public final boolean f11114g;

    /* JADX INFO: renamed from: h */
    public final boolean f11115h;

    /* JADX INFO: renamed from: i */
    public final int f11116i;

    /* JADX INFO: renamed from: j */
    public final int f11117j;

    /* JADX INFO: renamed from: k */
    public final String f11118k;

    /* JADX INFO: renamed from: l */
    public final GTCaptcha4Client.OnDialogShowListener f11119l;

    public static class Builder implements NoProguard {

        /* JADX INFO: renamed from: d */
        public String[] f11123d;

        /* JADX INFO: renamed from: e */
        public String[] f11124e;

        /* JADX INFO: renamed from: a */
        public boolean f11120a = false;

        /* JADX INFO: renamed from: b */
        public String f11121b = null;

        /* JADX INFO: renamed from: c */
        public String f11122c = "file:///android_asset/gt4-index.html";

        /* JADX INFO: renamed from: f */
        public Map<String, Object> f11125f = null;

        /* JADX INFO: renamed from: g */
        public boolean f11126g = true;

        /* JADX INFO: renamed from: h */
        public boolean f11127h = false;

        /* JADX INFO: renamed from: i */
        public int f11128i = 10000;

        /* JADX INFO: renamed from: j */
        public int f11129j = 0;

        /* JADX INFO: renamed from: k */
        public String f11130k = null;

        /* JADX INFO: renamed from: l */
        public GTCaptcha4Client.OnDialogShowListener f11131l = null;

        public GTCaptcha4Config build() {
            return new GTCaptcha4Config(this);
        }

        public Builder setApiServers(String[] strArr) {
            this.f11123d = strArr;
            return this;
        }

        public Builder setBackgroundColor(int i11) {
            this.f11129j = i11;
            return this;
        }

        public Builder setCanceledOnTouchOutside(boolean z11) {
            this.f11126g = z11;
            return this;
        }

        public Builder setDebug(boolean z11) {
            this.f11120a = z11;
            return this;
        }

        public Builder setDialogShowListener(GTCaptcha4Client.OnDialogShowListener onDialogShowListener) {
            this.f11131l = onDialogShowListener;
            return this;
        }

        public Builder setDialogStyle(String str) {
            this.f11130k = str;
            return this;
        }

        public Builder setGTC4ViewHidden(boolean z11) {
            this.f11127h = z11;
            return this;
        }

        public Builder setLanguage(String str) {
            this.f11121b = str;
            return this;
        }

        public Builder setParams(Map<String, Object> map) {
            this.f11125f = map;
            return this;
        }

        public Builder setResourcePath(String str) {
            this.f11122c = str;
            return this;
        }

        public Builder setStaticServers(String[] strArr) {
            this.f11124e = strArr;
            return this;
        }

        public Builder setTimeOut(int i11) {
            this.f11128i = i11;
            return this;
        }
    }

    private GTCaptcha4Config(Builder builder) {
        this.f11108a = builder.f11120a;
        this.f11109b = builder.f11121b;
        this.f11110c = builder.f11122c;
        this.f11113f = builder.f11125f;
        this.f11114g = builder.f11126g;
        this.f11115h = builder.f11127h;
        this.f11116i = builder.f11128i;
        this.f11117j = builder.f11129j;
        this.f11118k = builder.f11130k;
        this.f11119l = builder.f11131l;
        this.f11111d = builder.f11123d;
        this.f11112e = builder.f11124e;
    }

    public String[] getApiServers() {
        return this.f11111d;
    }

    public int getBackgroundColor() {
        return this.f11117j;
    }

    public GTCaptcha4Client.OnDialogShowListener getDialogShowListener() {
        return this.f11119l;
    }

    public String getDialogStyle() {
        return this.f11118k;
    }

    public String getHtml() {
        return this.f11110c;
    }

    public String getLanguage() {
        return this.f11109b;
    }

    public Map<String, Object> getParams() {
        return this.f11113f;
    }

    public String[] getStaticServers() {
        return this.f11112e;
    }

    public int getTimeOut() {
        return this.f11116i;
    }

    public boolean isCanceledOnTouchOutside() {
        return this.f11114g;
    }

    public boolean isDebug() {
        return this.f11108a;
    }

    public boolean isGTC4ViewHidden() {
        return this.f11115h;
    }
}
