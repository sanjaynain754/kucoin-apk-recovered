package com.geetest.gtc4;

import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes45.dex */
public class GeeGuardConfiguration {

    /* JADX INFO: renamed from: a */
    public final String f11252a;

    /* JADX INFO: renamed from: b */
    public final boolean f11253b;

    /* JADX INFO: renamed from: c */
    public final boolean f11254c;

    /* JADX INFO: renamed from: d */
    public final HashMap f11255d;

    /* JADX INFO: renamed from: e */
    public final HashMap f11256e;

    /* JADX INFO: renamed from: f */
    public final int f11257f;

    /* JADX INFO: renamed from: g */
    public final String f11258g;

    public static class Builder {

        /* JADX INFO: renamed from: a */
        public String f11259a = null;

        /* JADX INFO: renamed from: b */
        public boolean f11260b = false;

        /* JADX INFO: renamed from: c */
        public boolean f11261c = true;

        /* JADX INFO: renamed from: d */
        public HashMap f11262d = null;

        /* JADX INFO: renamed from: e */
        public HashMap f11263e = null;

        /* JADX INFO: renamed from: f */
        public int f11264f = 1;

        /* JADX INFO: renamed from: g */
        public String f11265g = null;

        public Builder addSignature(String str) {
            this.f11265g = str;
            return this;
        }

        public GeeGuardConfiguration build() {
            return new GeeGuardConfiguration(this);
        }

        public Builder setAlInfo(boolean z11) {
            this.f11260b = z11;
            return this;
        }

        public Builder setAppId(String str) {
            this.f11259a = str;
            return this;
        }

        public Builder setDevInfo(boolean z11) {
            this.f11261c = z11;
            return this;
        }

        public Builder setExtraInfo(HashMap<String, JSONObject> map) {
            this.f11263e = map;
            return this;
        }

        public Builder setLevel(int i11) {
            this.f11264f = i11;
            return this;
        }

        public Builder setOuterInfo(HashMap<String, Object> map) {
            this.f11262d = map;
            return this;
        }
    }

    private GeeGuardConfiguration(Builder builder) {
        this.f11252a = builder.f11259a;
        this.f11253b = builder.f11260b;
        this.f11254c = builder.f11261c;
        this.f11255d = builder.f11262d;
        this.f11256e = builder.f11263e;
        this.f11257f = builder.f11264f;
        this.f11258g = builder.f11265g;
    }

    public String getAppId() {
        return this.f11252a;
    }

    public String getContent() {
        return this.f11258g;
    }

    public HashMap<String, JSONObject> getExtraInfo() {
        return this.f11256e;
    }

    public int getLevel() {
        return this.f11257f;
    }

    public HashMap<String, Object> getOuterInfo() {
        return this.f11255d;
    }

    public boolean isAlInfo() {
        return this.f11253b;
    }

    public boolean isDevInfo() {
        return this.f11254c;
    }
}
