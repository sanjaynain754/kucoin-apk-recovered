package com.google.api.client.googleapis.auth.oauth2;

/* JADX INFO: loaded from: classes56.dex */
class SystemEnvironmentProvider {
    static final SystemEnvironmentProvider INSTANCE = new SystemEnvironmentProvider();

    public String getEnv(String str) {
        return System.getenv(str);
    }

    public boolean getEnvEquals(String str, String str2) {
        if (System.getenv().containsKey(str) && System.getenv(str).equals(str2)) {
            return true;
        }
        return false;
    }
}
