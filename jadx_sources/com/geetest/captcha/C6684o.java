package com.geetest.captcha;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.Process;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.geetest.captcha.o */
/* JADX INFO: loaded from: classes45.dex */
public final class C6684o {

    /* JADX INFO: renamed from: a */
    @SuppressLint({"SdCardPath"})
    public static final String[] f11195a = {"/sdcard/.system_log.trace", "/sdcard/tencent/.DrvZPZQ", "/sdcard/alipay/.Wg83DS3"};

    /* JADX INFO: renamed from: a */
    public static Pair<String, String> m12549a(Context context) {
        String string;
        String string2;
        String string3;
        String string4;
        try {
            string = context.getSharedPreferences("gt_fp", 0).getString("gt_di", null);
        } catch (Exception unused) {
            string = "$unknown";
        }
        if (!TextUtils.isEmpty(string) && !"$unknown".equals(string)) {
            try {
                byte[] bArrM12517a = C6656a.m12517a(Base64.decode(string, 2));
                int i11 = C6692v.f11212a;
                return new Pair<>(new JSONObject(new String(bArrM12517a, Charset.forName("utf-8"))).getString("gee_id"), string);
            } catch (Exception unused2) {
                return null;
            }
        }
        if (context.checkPermission("android.permission.WRITE_EXTERNAL_STORAGE", Process.myPid(), Process.myUid()) == 0) {
            if (Build.VERSION.SDK_INT >= 29 && !Environment.isExternalStorageLegacy()) {
                return null;
            }
            try {
                FileReader fileReader = new FileReader(f11195a[0]);
                int i12 = C6692v.f11212a;
                try {
                    StringWriter stringWriter = new StringWriter();
                    char[] cArr = new char[4096];
                    while (true) {
                        int i13 = fileReader.read(cArr);
                        if (-1 == i13) {
                            break;
                        }
                        stringWriter.write(cArr, 0, i13);
                    }
                    string4 = stringWriter.toString();
                } catch (Exception unused3) {
                    string4 = null;
                }
                JSONObject jSONObject = new JSONObject(new String(C6656a.m12517a(Base64.decode(string4, 2))));
                try {
                    context.getSharedPreferences("gt_fp", 0).edit().putString("gt_di", string4).apply();
                } catch (Exception unused4) {
                }
                return new Pair<>(jSONObject.getString("gee_id"), string4);
            } catch (Exception unused5) {
                try {
                    try {
                        try {
                            String[] strArr = f11195a;
                            FileReader fileReader2 = new FileReader(strArr[1]);
                            int i14 = C6692v.f11212a;
                            try {
                                StringWriter stringWriter2 = new StringWriter();
                                char[] cArr2 = new char[4096];
                                while (true) {
                                    int i15 = fileReader2.read(cArr2);
                                    if (-1 == i15) {
                                        break;
                                    }
                                    stringWriter2.write(cArr2, 0, i15);
                                }
                                string3 = stringWriter2.toString();
                            } catch (Exception unused6) {
                                string3 = null;
                            }
                            JSONObject jSONObject2 = new JSONObject(new String(C6656a.m12517a(Base64.decode(string3, 2))));
                            try {
                                context.getSharedPreferences("gt_fp", 0).edit().putString("gt_di", string3).apply();
                            } catch (Exception unused7) {
                            }
                            m12550a(string3, strArr[0]);
                            return new Pair<>(jSONObject2.getString("gee_id"), string3);
                        } catch (Exception unused8) {
                            String string5 = UUID.randomUUID().toString();
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("gee_id", string5);
                            jSONObject3.put("ts", System.currentTimeMillis());
                            jSONObject3.put("ver", "1.0.0");
                            byte[] bArrEncode = Base64.encode(C6656a.m12518b(jSONObject3.toString()), 2);
                            int i16 = C6692v.f11212a;
                            String str = new String(bArrEncode, Charset.forName("utf-8"));
                            try {
                                context.getSharedPreferences("gt_fp", 0).edit().putString("gt_di", str).apply();
                            } catch (Exception unused9) {
                            }
                            String[] strArr2 = f11195a;
                            m12550a(str, strArr2[0]);
                            m12550a(str, strArr2[1]);
                            m12550a(str, strArr2[2]);
                            return new Pair<>(string5, str);
                        }
                    } catch (Exception unused10) {
                    }
                } catch (Exception unused11) {
                    String[] strArr3 = f11195a;
                    FileReader fileReader3 = new FileReader(strArr3[2]);
                    int i17 = C6692v.f11212a;
                    try {
                        StringWriter stringWriter3 = new StringWriter();
                        char[] cArr3 = new char[4096];
                        while (true) {
                            int i18 = fileReader3.read(cArr3);
                            if (-1 == i18) {
                                break;
                            }
                            stringWriter3.write(cArr3, 0, i18);
                        }
                        string2 = stringWriter3.toString();
                    } catch (Exception unused12) {
                        string2 = null;
                    }
                    JSONObject jSONObject4 = new JSONObject(new String(C6656a.m12517a(Base64.decode(string2, 2))));
                    try {
                        context.getSharedPreferences("gt_fp", 0).edit().putString("gt_di", string2).apply();
                    } catch (Exception unused13) {
                    }
                    m12550a(string2, strArr3[0]);
                    m12550a(string2, strArr3[1]);
                    return new Pair<>(jSONObject4.getString("gee_id"), string2);
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static void m12550a(String str, String str2) {
        try {
            FileWriter fileWriter = new FileWriter(str2);
            int i11 = C6692v.f11212a;
            if (str != null) {
                fileWriter.write(str);
            }
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException unused) {
        }
    }
}
