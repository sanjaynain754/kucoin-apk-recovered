package com.forter.mobile.fortersdk;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import p634t7.C44699a;

/* JADX INFO: renamed from: com.forter.mobile.fortersdk.k */
/* JADX INFO: loaded from: classes.dex */
public final class C6560k {

    /* JADX INFO: renamed from: a */
    public int f10987a;

    /* JADX INFO: renamed from: b */
    public static boolean m12406b(@NonNull HttpURLConnection httpURLConnection, @Nullable Map<String, String> map) {
        if (map == null) {
            return false;
        }
        try {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
            }
            return true;
        } catch (Exception unused) {
            AbstractC6524c3.m12212d();
            return false;
        }
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public final HttpURLConnection m12407a(@NonNull String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection()));
        httpURLConnection.setConnectTimeout(this.f10987a);
        httpURLConnection.setReadTimeout(AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH);
        httpURLConnection.setRequestProperty("Content-Type", "application/json; charset=utf-8");
        httpURLConnection.setDoInput(true);
        return httpURLConnection;
    }

    public C6560k() {
        this.f10987a = 15000;
        C44699a c44699aM12197p = C6520c.m12182b().m12197p();
        if (c44699aM12197p != null) {
            this.f10987a = c44699aM12197p.m98888n();
        }
    }
}
