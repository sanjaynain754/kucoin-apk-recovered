package com.datavisorobfus;

import android.content.Context;
import com.datavisor.vangogh.bridge.config;
import com.datavisor.vangogh.bridge.crypto;
import com.datavisor.vangogh.bridge.storage;
import java.util.Random;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.datavisorobfus.g */
/* JADX INFO: loaded from: classes34.dex */
public class C5417g {

    /* JADX INFO: renamed from: c */
    private static C5417g f7252c;

    /* JADX INFO: renamed from: a */
    private Context f7253a;

    /* JADX INFO: renamed from: b */
    private String f7254b;

    /* JADX INFO: renamed from: a */
    public static C5417g m7143a(Context context) {
        if (f7252c == null) {
            synchronized (C5417g.class) {
                try {
                    if (f7252c == null) {
                        f7252c = new C5417g(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f7252c;
    }

    /* JADX INFO: renamed from: a */
    private String m7144a() {
        try {
            int iM7414c = C5447u0.m7414c(this.f7253a, "DVSPRANDOM");
            if (iM7414c < 0) {
                iM7414c = (new Random().nextInt(1000) % 1000) + 1;
                C5447u0.m7406a(this.f7253a, "DVSPRANDOM", iM7414c);
            }
            storage.globalSet(crypto.convert("H6ih6nfSockIb6dpGfsK/wZizrztHSI="), iM7414c + "", 0);
            String strM7416e = C5447u0.m7416e(this.f7253a, "DVSPSERVERRANDOM");
            if (C5457z0.m7480a(strM7416e)) {
                strM7416e = UUID.randomUUID().toString();
                if (C5457z0.m7482b(strM7416e)) {
                    C5447u0.m7411b(this.f7253a, "DVSPSERVERRANDOM", strM7416e);
                }
            }
            return strM7416e;
        } catch (Throwable unused) {
            String string = UUID.randomUUID().toString();
            if (C5457z0.m7482b(string)) {
                C5447u0.m7411b(this.f7253a, "DVSPSERVERRANDOM", string);
            }
            return string;
        }
    }

    private C5417g(Context context) {
        this.f7253a = null;
        this.f7254b = null;
        if (context != null) {
            this.f7253a = context;
            this.f7254b = m7144a();
            config.loadDefaultConfig();
            return;
        }
        throw new IllegalArgumentException("ConfigManager initialization error: mContext is null.");
    }

    /* JADX INFO: renamed from: a */
    public JSONObject m7145a(String str) {
        if (C5457z0.m7480a(str)) {
            return null;
        }
        String infoByName = config.getInfoByName(str);
        if (C5457z0.m7480a(infoByName)) {
            return null;
        }
        try {
            return new JSONObject(infoByName);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean m7146b(String str) {
        if (C5457z0.m7480a(str) || config.isSwitchOn(str) == 0) {
            return false;
        }
        return true;
    }
}
