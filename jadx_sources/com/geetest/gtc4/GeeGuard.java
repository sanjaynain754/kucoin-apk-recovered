package com.geetest.gtc4;

import android.content.Context;

/* JADX INFO: loaded from: classes45.dex */
public class GeeGuard {

    public interface CallbackHandler {
        void onCompletion(Integer num, GeeGuardReceipt geeGuardReceipt);
    }

    public static GeeGuardReceipt fetchReceipt(Context context, String str) {
        return AbstractC6900v3.f11537a.m12736a(context, str);
    }

    public static void register(Context context, String str) {
        AbstractC6900v3.f11537a.m12739a(context, str, (String) null, (CallbackHandler) null);
    }

    public static void submitReceipt(Context context, String str, int i11, CallbackHandler callbackHandler) {
        AbstractC6900v3.f11537a.m12741b(context, str, i11, callbackHandler);
    }

    @Deprecated
    public static GeeGuardReceipt fetchReceipt(Context context, String str, String str2) {
        return AbstractC6864r3.m12707a(context, str, str2);
    }

    public static boolean getLogEnabled() {
        return AbstractC6846p3.f11465a;
    }

    public static String getVersion() {
        return "2.7.1.1";
    }

    public static void register(Context context, String str, CallbackHandler callbackHandler) {
        AbstractC6900v3.f11537a.m12739a(context, str, (String) null, callbackHandler);
    }

    public static void setLogEnabled(boolean z11) {
        AbstractC6846p3.f11465a = z11;
    }

    public static void submitReceipt(Context context, String str, CallbackHandler callbackHandler) {
        AbstractC6900v3.f11537a.m12741b(context, str, 5000, callbackHandler);
    }

    @Deprecated
    public static String getData(Context context, GeeGuardConfiguration geeGuardConfiguration) {
        return Core.getData(context.getApplicationContext(), geeGuardConfiguration);
    }

    public static void register(Context context, String str, String str2) {
        AbstractC6900v3.f11537a.m12739a(context, str, str2, (CallbackHandler) null);
    }

    @Deprecated
    public static void submitReceipt(Context context, String str, String str2, int i11, CallbackHandler callbackHandler) {
        AbstractC6864r3.m12708a(context, str, str2, i11, "https://riskct.geetest.com/g2/api/v1/client_report", callbackHandler);
    }

    @Deprecated
    public static void submitReceipt(Context context, String str, String str2, CallbackHandler callbackHandler) {
        AbstractC6864r3.m12708a(context, str, str2, 5000, "https://riskct.geetest.com/g2/api/v1/client_report", callbackHandler);
    }
}
