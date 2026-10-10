package com.ishumei.smantifraud.l111l11111I1l;

import android.content.Context;
import android.media.AudioManager;
import androidx.autofill.HintConstants;
import androidx.core.app.NotificationCompat;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class l11l1111Il {
    private Object l1111l111111Il;
    private Context l111l11111lIl;

    private Object l1111l111111Il(String str) {
        try {
            Context context = this.l111l11111lIl;
            if (context != null) {
                return com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l1111l111111Il.l111l11111lIl.l1111l111111Il(context.getApplicationContext(), "getSystemService", new Class[]{String.class}, new Object[]{str});
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static Map<String, Integer> l1111l111111Il() {
        try {
            AudioManager audioManager = (AudioManager) com.ishumei.smantifraud.l111l11111lIl.l111l1111l1Il.l1111l111111Il.getSystemService("audio");
            HashMap map = new HashMap();
            map.put("call", Integer.valueOf(audioManager.getStreamVolume(0)));
            map.put("system", Integer.valueOf(audioManager.getStreamVolume(1)));
            map.put("ring", Integer.valueOf(audioManager.getStreamVolume(2)));
            map.put("music", Integer.valueOf(audioManager.getStreamVolume(3)));
            map.put(NotificationCompat.CATEGORY_ALARM, Integer.valueOf(audioManager.getStreamVolume(4)));
            return map;
        } catch (Throwable unused) {
            return null;
        }
    }

    public final String l111l11111I1l() {
        try {
            Object objL1111l111111Il = l1111l111111Il(HintConstants.AUTOFILL_HINT_PHONE);
            Method declaredMethod = objL1111l111111Il.getClass().getDeclaredMethod("getNetworkCountryIso", new Class[0]);
            declaredMethod.setAccessible(true);
            return (String) declaredMethod.invoke(objL1111l111111Il, new Object[0]);
        } catch (Exception unused) {
            return "";
        }
    }

    public final String l111l11111lIl() {
        try {
            Object objL1111l111111Il = l1111l111111Il(HintConstants.AUTOFILL_HINT_PHONE);
            Method declaredMethod = objL1111l111111Il.getClass().getDeclaredMethod("getSimCountryIso", new Class[0]);
            declaredMethod.setAccessible(true);
            return (String) declaredMethod.invoke(objL1111l111111Il, new Object[0]);
        } catch (Exception unused) {
            return "";
        }
    }

    public l11l1111Il() {
        this.l1111l111111Il = null;
        this.l111l11111lIl = null;
        try {
            Context context = com.ishumei.smantifraud.l111l11111lIl.l111l1111l1Il.l1111l111111Il;
            if (context != null) {
                this.l111l11111lIl = context;
                this.l1111l111111Il = com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l1111l111111Il.l111l11111lIl.l1111l111111Il(context, "getSystemService", new Class[]{String.class}, new Object[]{HintConstants.AUTOFILL_HINT_PHONE});
            }
        } catch (Exception unused) {
        }
    }
}
