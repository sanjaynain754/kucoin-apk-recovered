package com.datavisorobfus;

import android.content.Context;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import org.json.JSONArray;

/* JADX INFO: renamed from: com.datavisorobfus.j */
/* JADX INFO: loaded from: classes34.dex */
public class C5424j {
    /* JADX INFO: renamed from: a */
    public static boolean m7187a(Context context) {
        if (context == null) {
            return false;
        }
        String strM7416e = C5447u0.m7416e(context, "DVSPCRONDE");
        if (C5457z0.m7480a(strM7416e)) {
            C5415f0.m7136a("strCronTabDE is empty");
            return false;
        }
        try {
            JSONArray jSONArray = new JSONArray(strM7416e);
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                if (C5451w0.m7423a(jSONArray.getString(i11))) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m7188b(Context context) {
        Date date;
        if (context == null) {
            return false;
        }
        String strM7416e = C5447u0.m7416e(context, "DVSPDVDE");
        if (C5457z0.m7480a(strM7416e)) {
            return false;
        }
        try {
            JSONArray jSONArray = new JSONArray(strM7416e);
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                String[] strArrSplit = jSONArray.getString(i11).split("&");
                if (strArrSplit.length == 2) {
                    String str = strArrSplit[0];
                    String str2 = strArrSplit[1];
                    if (!C5457z0.m7480a(str) && !C5457z0.m7480a(str2)) {
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
                        simpleDateFormat.setLenient(false);
                        Date date2 = null;
                        try {
                            date = simpleDateFormat.parse(str);
                            try {
                                date2 = simpleDateFormat.parse(str2);
                            } catch (ParseException unused) {
                            }
                        } catch (ParseException unused2) {
                            date = null;
                        }
                        if (date != null && date2 != null && date.compareTo(date2) < 0) {
                            Date date3 = new Date();
                            if (date3.compareTo(date) > 0 && date3.compareTo(date2) < 0) {
                                return true;
                            }
                        }
                    }
                }
            }
        } catch (Throwable unused3) {
        }
        return false;
    }
}
