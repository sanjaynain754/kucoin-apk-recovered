package com.tencent.bugly.proguard;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.text.TextUtils;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.tencent.bugly.crashreport.common.info.PlugInBean;
import com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler;
import com.tencent.rmonitor.base.thread.suspend.ThreadSuspend;
import com.tencent.rmonitor.common.logger.LogState;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.bi */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33571bi {

    /* JADX INFO: renamed from: a */
    public static final String f69310a = "yyyy-MM-dd HH:mm:ss";

    /* JADX INFO: renamed from: b */
    public static final ThreadLocal<SimpleDateFormat> f69311b = new a();

    /* JADX INFO: renamed from: c */
    public static Map<String, String> f69312c = null;

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.bi$a */
    /* JADX INFO: compiled from: BUGLY */
    public class a extends ThreadLocal<SimpleDateFormat> {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public synchronized SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m72572a() {
        return m72573a(System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: b */
    public static String m72605b(Throwable th2) {
        if (th2 == null) {
            return "";
        }
        try {
            StringWriter stringWriter = new StringWriter();
            th2.printStackTrace(new PrintWriter(stringWriter));
            return stringWriter.getBuffer().toString();
        } catch (Throwable th3) {
            if (C34012x4.m75438b(th3)) {
                return C33864ph.f71456b;
            }
            th3.printStackTrace();
            return C33864ph.f71456b;
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m72614c(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return "NULL";
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(bArr);
            return m72583a(messageDigest.digest());
        } catch (Throwable th2) {
            if (C34012x4.m75438b(th2)) {
                return null;
            }
            th2.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static Parcel m72618d(byte[] bArr) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArr, 0, bArr.length);
        parcelObtain.setDataPosition(0);
        return parcelObtain;
    }

    /* JADX INFO: renamed from: a */
    public static String m72582a(Date date) {
        try {
            return f69311b.get().format(date);
        } catch (Throwable unused) {
            return date.toString();
        }
    }

    /* JADX INFO: renamed from: e */
    public static boolean m72620e(String str) {
        if (m72617c(str)) {
            return false;
        }
        if (str.length() > 255) {
            C34012x4.m75442d("URL(%s)'s length is larger than 255.", str);
            return false;
        }
        if (!str.toLowerCase().startsWith("http")) {
            C34012x4.m75442d("URL(%s) is not start with \"http\".", str);
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public static String m72573a(long j11) {
        try {
            return f69311b.get().format(new Date(j11));
        } catch (Exception unused) {
            return new Date().toString();
        }
    }

    /* JADX INFO: renamed from: d */
    public static Date m72619d(String str) {
        if (str == null) {
            return null;
        }
        String[] strArrSplit = str.split("\\s++");
        try {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").parse(Calendar.getInstance().get(1) + C33820nf.f71144W + strArrSplit[0] + C33627eb.f69716f + strArrSplit[1]);
        } catch (ParseException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m72600a(byte[] bArr, int i11, String str) {
        if (bArr == null || i11 == -1) {
            return bArr;
        }
        C34012x4.m75434a("rqdp{  enD:} %d %d", Integer.valueOf(bArr.length), Integer.valueOf(i11));
        try {
            InterfaceC33558b5 interfaceC33558b5M72306a = C33537a5.m72306a(i11);
            if (interfaceC33558b5M72306a == null) {
                return null;
            }
            interfaceC33558b5M72306a.mo72277a(str);
            return interfaceC33558b5M72306a.mo72279b(bArr);
        } catch (Throwable th2) {
            if (!C34012x4.m75432a(LogState.WARN, th2)) {
                th2.printStackTrace();
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m72606b(Date date) {
        if (date == null) {
            return null;
        }
        try {
            return f69311b.get().format(date);
        } catch (Exception unused) {
            return new Date().toString();
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m72615c(long j11) {
        try {
            Thread.sleep(j11);
        } catch (InterruptedException e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m72613b(byte[] bArr, int i11, String str) {
        if (bArr == null || i11 == -1) {
            return bArr;
        }
        try {
            InterfaceC33558b5 interfaceC33558b5M72306a = C33537a5.m72306a(i11);
            if (interfaceC33558b5M72306a == null) {
                return null;
            }
            interfaceC33558b5M72306a.mo72277a(str);
            return interfaceC33558b5M72306a.mo72278a(bArr);
        } catch (Throwable th2) {
            if (!C34012x4.m75438b(th2)) {
                th2.printStackTrace();
            }
            C34012x4.m75431a(LogState.WARN, "encrytype %d %s", Integer.valueOf(i11), str);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m72617c(String str) {
        return str == null || str.trim().length() <= 0;
    }

    /* JADX INFO: renamed from: c */
    public static void m72616c(String str, String str2) {
        C33765l2 c33765l2;
        if (C33765l2.m73827s() != null) {
            synchronized (C33765l2.class) {
                c33765l2 = C33765l2.f70700C0;
            }
            if (c33765l2.f70760m0 != null) {
                C33765l2.m73827s().f70760m0.edit().putString(str, str2).apply();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0036  */
    /* JADX WARN: Code duplicated, block: B:24:0x0060 A[Catch: all -> 0x006a, LOOP:0: B:24:0x0060->B:26:0x0066, LOOP_START, TryCatch #6 {all -> 0x006a, blocks: (B:22:0x004f, B:24:0x0060, B:26:0x0066, B:29:0x006c, B:31:0x0072, B:32:0x0076), top: B:87:0x004f }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0066 A[Catch: all -> 0x006a, LOOP:0: B:24:0x0060->B:26:0x0066, LOOP_END, TryCatch #6 {all -> 0x006a, blocks: (B:22:0x004f, B:24:0x0060, B:26:0x0066, B:29:0x006c, B:31:0x0072, B:32:0x0076), top: B:87:0x004f }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0072 A[Catch: all -> 0x006a, LOOP:1: B:29:0x006c->B:31:0x0072, LOOP_END, TryCatch #6 {all -> 0x006a, blocks: (B:22:0x004f, B:24:0x0060, B:26:0x0066, B:29:0x006c, B:31:0x0072, B:32:0x0076), top: B:87:0x004f }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0085 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x006c A[EDGE_INSN: B:95:0x006c->B:97:? BREAK  A[LOOP:0: B:24:0x0060->B:26:0x0066], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x0076 A[EDGE_INSN: B:96:0x0076->B:32:0x0076 BREAK  A[LOOP:1: B:29:0x006c->B:31:0x0072], SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static byte[] m72597a(File file, String str, String str2) {
        FileInputStream fileInputStream;
        String name;
        ZipOutputStream zipOutputStream;
        ByteArrayInputStream byteArrayInputStream;
        byte[] bArr;
        int i11;
        int i12;
        if (str == null || str.length() == 0) {
            return null;
        }
        C34012x4.m75434a("rqdp{  ZF start}", new Object[0]);
        if (file != null) {
            try {
                if (file.exists() && file.canRead()) {
                    fileInputStream = new FileInputStream(file);
                    try {
                        name = file.getName();
                    } catch (Throwable th2) {
                        th = th2;
                        zipOutputStream = null;
                    }
                } else {
                    name = str2;
                    fileInputStream = null;
                }
                byteArrayInputStream = new ByteArrayInputStream(str.getBytes("UTF-8"));
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                zipOutputStream = new ZipOutputStream(byteArrayOutputStream);
                try {
                    zipOutputStream.setMethod(8);
                    zipOutputStream.putNextEntry(new ZipEntry(name));
                    bArr = new byte[1024];
                    if (fileInputStream != null) {
                        while (true) {
                            i12 = fileInputStream.read(bArr);
                            if (i12 > 0) {
                                break;
                            }
                            zipOutputStream.write(bArr, 0, i12);
                        }
                    }
                    while (true) {
                        i11 = byteArrayInputStream.read(bArr);
                        if (i11 > 0) {
                            break;
                        }
                        zipOutputStream.write(bArr, 0, i11);
                    }
                    zipOutputStream.closeEntry();
                    zipOutputStream.flush();
                    zipOutputStream.finish();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e11) {
                            e11.printStackTrace();
                        }
                    }
                    try {
                        zipOutputStream.close();
                    } catch (IOException e12) {
                        e12.printStackTrace();
                    }
                    C34012x4.m75431a(LogState.DEBUG, "rqdp{  ZF end}", new Object[0]);
                    return byteArray;
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
                fileInputStream = null;
                zipOutputStream = null;
            }
        } else {
            name = str2;
            fileInputStream = null;
            byteArrayInputStream = new ByteArrayInputStream(str.getBytes("UTF-8"));
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            zipOutputStream = new ZipOutputStream(byteArrayOutputStream2);
            zipOutputStream.setMethod(8);
            zipOutputStream.putNextEntry(new ZipEntry(name));
            bArr = new byte[1024];
            if (fileInputStream != null) {
                while (true) {
                    i12 = fileInputStream.read(bArr);
                    if (i12 > 0) {
                        break;
                        break;
                    }
                    zipOutputStream.write(bArr, 0, i12);
                }
            }
            while (true) {
                i11 = byteArrayInputStream.read(bArr);
                if (i11 > 0) {
                    break;
                    break;
                }
                zipOutputStream.write(bArr, 0, i11);
            }
            zipOutputStream.closeEntry();
            zipOutputStream.flush();
            zipOutputStream.finish();
            byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            zipOutputStream.close();
            C34012x4.m75431a(LogState.DEBUG, "rqdp{  ZF end}", new Object[0]);
            return byteArray2;
        }
        try {
            if (!C34012x4.m75432a(LogState.WARN, th)) {
                th.printStackTrace();
            }
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e13) {
                    e13.printStackTrace();
                }
            }
            if (zipOutputStream != null) {
                try {
                    zipOutputStream.close();
                } catch (IOException e14) {
                    e14.printStackTrace();
                }
            }
            C34012x4.m75431a(LogState.DEBUG, "rqdp{  ZF end}", new Object[0]);
            return null;
        } catch (Throwable th5) {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e15) {
                    e15.printStackTrace();
                }
            }
            if (zipOutputStream != null) {
                try {
                    zipOutputStream.close();
                } catch (IOException e16) {
                    e16.printStackTrace();
                }
            }
            C34012x4.m75431a(LogState.DEBUG, "rqdp{  ZF end}", new Object[0]);
            throw th5;
        }
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m72611b(byte[] bArr, int i11) {
        if (bArr == null || i11 == -1) {
            return bArr;
        }
        C34012x4.m75434a("[Util] Zip %d bytes data with type %s", Integer.valueOf(bArr.length), i11 == 2 ? "Gzip" : "zip");
        try {
            InterfaceC33870q2 interfaceC33870q2M74496a = C33849p2.m74496a(i11);
            if (interfaceC33870q2M74496a == null) {
                return null;
            }
            return interfaceC33870q2M74496a.mo73253a(bArr);
        } catch (Throwable th2) {
            if (!C34012x4.m75432a(LogState.WARN, th2)) {
                th2.printStackTrace();
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m72612b(byte[] bArr, int i11, int i12, String str) {
        if (bArr == null) {
            return null;
        }
        try {
            return m72600a(m72611b(bArr, i11), i12, str);
        } catch (Throwable th2) {
            if (!C34012x4.m75438b(th2)) {
                th2.printStackTrace();
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static long m72601b() {
        try {
            return (((System.currentTimeMillis() + ((long) TimeZone.getDefault().getRawOffset())) / 86400000) * 86400000) - ((long) TimeZone.getDefault().getRawOffset());
        } catch (Throwable th2) {
            if (C34012x4.m75438b(th2)) {
                return -1L;
            }
            th2.printStackTrace();
            return -1L;
        }
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m72610b(long j11) {
        try {
            return ("" + j11).getBytes("utf-8");
        } catch (UnsupportedEncodingException e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static long m72602b(byte[] bArr) {
        if (bArr == null) {
            return -1L;
        }
        try {
            return Long.parseLong(new String(bArr, "utf-8"));
        } catch (UnsupportedEncodingException e11) {
            e11.printStackTrace();
            return -1L;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m72608b(Parcel parcel, Map<String, String> map) {
        if (map != null && map.size() > 0) {
            int size = map.size();
            ArrayList<String> arrayList = new ArrayList<>(size);
            ArrayList<String> arrayList2 = new ArrayList<>(size);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                arrayList.add(entry.getKey());
                arrayList2.add(entry.getValue());
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("keys", arrayList);
            bundle.putStringArrayList("values", arrayList2);
            parcel.writeBundle(bundle);
            return;
        }
        parcel.writeBundle(null);
    }

    /* JADX INFO: renamed from: b */
    public static Map<String, String> m72607b(Parcel parcel) {
        Bundle bundle = parcel.readBundle();
        if (bundle == null) {
            return null;
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList("keys");
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("values");
        if (stringArrayList != null && stringArrayList2 != null && stringArrayList.size() == stringArrayList2.size()) {
            HashMap map = new HashMap(stringArrayList.size());
            for (int i11 = 0; i11 < stringArrayList.size(); i11++) {
                map.put(stringArrayList.get(i11), stringArrayList2.get(i11));
            }
            return map;
        }
        C34012x4.m75437b("map parcel error!", new Object[0]);
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m72598a(byte[] bArr, int i11) {
        if (bArr == null || i11 == -1) {
            return bArr;
        }
        C34012x4.m75434a("[Util] Unzip %d bytes data with type %s", Integer.valueOf(bArr.length), i11 == 2 ? "Gzip" : "zip");
        try {
            InterfaceC33870q2 interfaceC33870q2M74496a = C33849p2.m74496a(i11);
            if (interfaceC33870q2M74496a == null) {
                return null;
            }
            return interfaceC33870q2M74496a.mo73254b(bArr);
        } catch (Throwable th2) {
            if (th2.getMessage() != null && th2.getMessage().contains("Not in GZIP format")) {
                C34012x4.m75431a(LogState.WARN, th2.getMessage(), new Object[0]);
            } else if (!C34012x4.m75432a(LogState.WARN, th2)) {
                th2.printStackTrace();
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m72609b(Context context, String str) {
        C34012x4.m75434a("[Util] Try to unlock file: %s (pid=%d | tid=%d)", str, Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
        try {
            File file = new File(context.getFilesDir() + File.separator + str);
            if (!file.exists()) {
                return true;
            }
            if (!file.delete()) {
                return false;
            }
            C34012x4.m75431a(LogState.DEBUG, "[Util] Successfully unlocked file: %s (pid=%d | tid=%d)", str, Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
            return true;
        } catch (Throwable th2) {
            C34012x4.m75432a(LogState.WARN, th2);
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m72599a(byte[] bArr, int i11, int i12, String str) {
        try {
            return m72598a(m72613b(bArr, i12, str), i11);
        } catch (Exception e11) {
            if (C34012x4.m75438b(e11)) {
                return null;
            }
            e11.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m72583a(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b11 : bArr) {
            String hexString = Integer.toHexString(b11 & 255);
            if (hexString.length() == 1) {
                stringBuffer.append("0");
            }
            stringBuffer.append(hexString);
        }
        return stringBuffer.toString().toUpperCase();
    }

    /* JADX INFO: renamed from: b */
    public static String m72604b(String str, String str2) {
        C33765l2 c33765l2;
        if (C33765l2.m73827s() != null) {
            synchronized (C33765l2.class) {
                c33765l2 = C33765l2.f70700C0;
            }
            if (c33765l2.f70760m0 != null) {
                return C33765l2.m73827s().f70760m0.getString(str, str2);
            }
            return "";
        }
        return "";
    }

    /* JADX INFO: renamed from: b */
    public static String m72603b(String str) {
        return (str == null || str.indexOf(0) == -1) ? str : str.replace("\u0000", "");
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0075 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.FileInputStream] */
    /* JADX INFO: renamed from: a */
    public static String m72579a(File file, String str) throws Throwable {
        ?? r11;
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        ?? r12 = 0;
        if (file != null && file.exists()) {
            ?? CanRead = file.canRead();
            try {
                try {
                    if (CanRead != 0) {
                        try {
                            FileInputStream fileInputStream3 = new FileInputStream(file);
                            try {
                                MessageDigest messageDigest = MessageDigest.getInstance(str);
                                byte[] bArr = new byte[C33627eb.f69713c];
                                while (true) {
                                    int i11 = fileInputStream3.read(bArr);
                                    if (i11 != -1) {
                                        messageDigest.update(bArr, 0, i11);
                                    } else {
                                        String strM72583a = m72583a(messageDigest.digest());
                                        try {
                                            fileInputStream3.close();
                                            return strM72583a;
                                        } catch (IOException e11) {
                                            e11.printStackTrace();
                                            return strM72583a;
                                        }
                                    }
                                }
                            } catch (IOException e12) {
                                e = e12;
                                fileInputStream2 = fileInputStream3;
                                if (!C34012x4.m75438b(e)) {
                                    e.printStackTrace();
                                }
                                if (fileInputStream2 != null) {
                                    fileInputStream2.close();
                                }
                                return null;
                            } catch (NoSuchAlgorithmException e13) {
                                e = e13;
                                fileInputStream = fileInputStream3;
                                if (!C34012x4.m75438b(e)) {
                                    e.printStackTrace();
                                }
                                if (fileInputStream != null) {
                                    fileInputStream.close();
                                }
                                return null;
                            } catch (Throwable th2) {
                                th = th2;
                                r11 = fileInputStream3;
                                if (r11 != 0) {
                                    try {
                                        r11.close();
                                    } catch (IOException e14) {
                                        e14.printStackTrace();
                                    }
                                }
                                throw th;
                            }
                        } catch (IOException e15) {
                            e = e15;
                            fileInputStream2 = null;
                        } catch (NoSuchAlgorithmException e16) {
                            e = e16;
                            fileInputStream = null;
                        } catch (Throwable th3) {
                            th = th3;
                            r11 = r12;
                            if (r11 != 0) {
                                r11.close();
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    r12 = CanRead;
                }
            } catch (IOException e17) {
                e17.printStackTrace();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m72594a(File file, File file2, int i11) {
        ZipOutputStream zipOutputStream;
        C34012x4.m75434a("rqdp{  ZF start}", new Object[0]);
        if (!m72593a(file, file2)) {
            return false;
        }
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(file2)));
                try {
                    zipOutputStream.setMethod(8);
                    zipOutputStream.putNextEntry(new ZipEntry(file.getName()));
                    byte[] bArr = new byte[Math.max(i11, 1000)];
                    while (true) {
                        int i12 = fileInputStream2.read(bArr);
                        if (i12 <= 0) {
                            break;
                        }
                        zipOutputStream.write(bArr, 0, i12);
                    }
                    zipOutputStream.flush();
                    zipOutputStream.closeEntry();
                    try {
                        fileInputStream2.close();
                    } catch (IOException e11) {
                        e11.printStackTrace();
                    }
                    try {
                        zipOutputStream.close();
                    } catch (IOException e12) {
                        e12.printStackTrace();
                    }
                    C34012x4.m75431a(LogState.DEBUG, "rqdp{  ZF end}", new Object[0]);
                    return true;
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = fileInputStream2;
                    try {
                        if (!C34012x4.m75432a(LogState.WARN, th)) {
                            th.printStackTrace();
                        }
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException e13) {
                                e13.printStackTrace();
                            }
                        }
                        if (zipOutputStream != null) {
                            try {
                                zipOutputStream.close();
                            } catch (IOException e14) {
                                e14.printStackTrace();
                            }
                        }
                        C34012x4.m75431a(LogState.DEBUG, "rqdp{  ZF end}", new Object[0]);
                        return false;
                    } catch (Throwable th3) {
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException e15) {
                                e15.printStackTrace();
                            }
                        }
                        if (zipOutputStream != null) {
                            try {
                                zipOutputStream.close();
                            } catch (IOException e16) {
                                e16.printStackTrace();
                            }
                        }
                        C34012x4.m75431a(LogState.DEBUG, "rqdp{  ZF end}", new Object[0]);
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                zipOutputStream = null;
            }
        } catch (Throwable th5) {
            th = th5;
            zipOutputStream = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m72593a(File file, File file2) {
        if (file != null && file2 != null && !file.equals(file2)) {
            if (file.exists() && file.canRead()) {
                try {
                    if (file2.getParentFile() != null && !file2.getParentFile().exists()) {
                        file2.getParentFile().mkdirs();
                    }
                    if (!file2.exists()) {
                        file2.createNewFile();
                    }
                } catch (Throwable th2) {
                    if (!C34012x4.m75438b(th2)) {
                        th2.printStackTrace();
                    }
                }
                return file2.exists() && file2.canWrite();
            }
            C34012x4.m75444f("rqdp{  !sFile.exists() || !sFile.canRead(),pls check ,return!}", new Object[0]);
            return false;
        }
        C34012x4.m75444f("rqdp{  err ZF 1R!}", new Object[0]);
        return false;
    }

    /* JADX INFO: renamed from: a */
    public static ArrayList<String> m72585a(Context context, String[] strArr) {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2;
        if (C34007x.m75412e(context)) {
            return new ArrayList<>(Arrays.asList("unknown(low memory)"));
        }
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            Process processExec = Runtime.getRuntime().exec(strArr);
            bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream()));
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    arrayList.add(line);
                } catch (Throwable th2) {
                    th = th2;
                    bufferedReader2 = null;
                }
                try {
                    if (!C34012x4.m75438b(th)) {
                        th.printStackTrace();
                    }
                    return null;
                } finally {
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e11) {
                            e11.printStackTrace();
                        }
                    }
                    if (bufferedReader2 != null) {
                        try {
                            bufferedReader2.close();
                        } catch (IOException e12) {
                            e12.printStackTrace();
                        }
                    }
                }
            }
            bufferedReader2 = new BufferedReader(new InputStreamReader(processExec.getErrorStream()));
            while (true) {
                try {
                    String line2 = bufferedReader2.readLine();
                    if (line2 != null) {
                        arrayList.add(line2);
                    } else {
                        try {
                            break;
                        } catch (IOException e13) {
                            e13.printStackTrace();
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
            bufferedReader.close();
            try {
                bufferedReader2.close();
            } catch (IOException e14) {
                e14.printStackTrace();
            }
            return arrayList;
        } catch (Throwable th4) {
            th = th4;
            bufferedReader = null;
            bufferedReader2 = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m72576a(Context context, String str) {
        if (str == null || str.trim().equals("")) {
            return "";
        }
        try {
            if (f69312c == null) {
                f69312c = new HashMap();
            }
            if (f69312c.containsKey(str)) {
                return f69312c.get(str);
            }
            String systemProperty = NativeCrashHandler.getInstance().getSystemProperty(str);
            if (!TextUtils.isEmpty(systemProperty)) {
                f69312c.put(str, systemProperty);
            }
            return TextUtils.isEmpty(systemProperty) ? C33864ph.f71456b : systemProperty;
        } catch (Throwable th2) {
            C34012x4.m75435a(th2);
            return C33864ph.f71456b;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m72591a(String str) {
        if (str == null) {
            return;
        }
        File file = new File(str);
        if (file.isFile() && file.exists() && file.canWrite()) {
            file.delete();
        }
    }

    /* JADX INFO: renamed from: a */
    public static Context m72565a(Context context) {
        Context applicationContext;
        return (context == null || (applicationContext = context.getApplicationContext()) == null) ? context : applicationContext;
    }

    /* JADX INFO: renamed from: a */
    public static String m72581a(Throwable th2) {
        if (th2 == null) {
            return "";
        }
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th2.printStackTrace(printWriter);
        printWriter.flush();
        return stringWriter.toString();
    }

    /* JADX INFO: renamed from: a */
    public static Object m72569a(Class<?> cls, String str, Object obj) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.get(obj);
        } catch (Throwable th2) {
            if (C34012x4.m75438b(th2)) {
                return null;
            }
            th2.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m72590a(Class<?> cls, String str, Object obj, Object obj2) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            declaredField.set(obj2, obj);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static Object m72570a(String str, String str2, Object obj, Class<?>[] clsArr, Object[] objArr) {
        try {
            Method declaredMethod = Class.forName(str).getDeclaredMethod(str2, clsArr);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(obj, objArr);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m72589a(Parcel parcel, Map<String, PlugInBean> map) {
        if (map != null && map.size() > 0) {
            int size = map.size();
            ArrayList arrayList = new ArrayList(size);
            ArrayList arrayList2 = new ArrayList(size);
            for (Map.Entry<String, PlugInBean> entry : map.entrySet()) {
                arrayList.add(entry.getKey());
                arrayList2.add(entry.getValue());
            }
            Bundle bundle = new Bundle();
            bundle.putInt("pluginNum", arrayList.size());
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                bundle.putString(C33986vi.m75326a("pluginKey", i11), (String) arrayList.get(i11));
            }
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                bundle.putString("pluginVal" + i12 + "plugInId", ((PlugInBean) arrayList2.get(i12)).f68559b);
                bundle.putString("pluginVal" + i12 + "plugInUUID", ((PlugInBean) arrayList2.get(i12)).f68561d);
                bundle.putString("pluginVal" + i12 + "plugInVersion", ((PlugInBean) arrayList2.get(i12)).f68560c);
            }
            parcel.writeBundle(bundle);
            return;
        }
        parcel.writeBundle(null);
    }

    /* JADX INFO: renamed from: a */
    public static Map<String, PlugInBean> m72587a(Parcel parcel) {
        Bundle bundle = parcel.readBundle();
        if (bundle == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int iIntValue = ((Integer) bundle.get("pluginNum")).intValue();
        for (int i11 = 0; i11 < iIntValue; i11++) {
            arrayList.add(bundle.getString("pluginKey" + i11));
        }
        for (int i12 = 0; i12 < iIntValue; i12++) {
            arrayList2.add(new PlugInBean(bundle.getString("pluginVal" + i12 + "plugInId"), bundle.getString("pluginVal" + i12 + "plugInVersion"), bundle.getString("pluginVal" + i12 + "plugInUUID")));
        }
        if (arrayList.size() == arrayList2.size()) {
            HashMap map = new HashMap(arrayList.size());
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                map.put((String) arrayList.get(i13), (PlugInBean) PlugInBean.class.cast(arrayList2.get(i13)));
            }
            return map;
        }
        C34012x4.m75437b("map plugin parcel error!", new Object[0]);
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m72596a(Parcelable parcelable) {
        Parcel parcelObtain = Parcel.obtain();
        parcelable.writeToParcel(parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }

    /* JADX INFO: renamed from: a */
    public static <T> T m72571a(byte[] bArr, Parcelable.Creator<T> creator) {
        Parcel parcelM72618d = m72618d(bArr);
        try {
            T tCreateFromParcel = creator.createFromParcel(parcelM72618d);
            if (parcelM72618d != null) {
                parcelM72618d.recycle();
            }
            return tCreateFromParcel;
        } catch (Throwable th2) {
            try {
                th2.printStackTrace();
            } finally {
                if (parcelM72618d != null) {
                    parcelM72618d.recycle();
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m72574a(Context context, int i11, int i12, String str, long j11, long j12, int i13) throws Throwable {
        String[] strArr;
        Throwable th2;
        IOException iOException;
        Process processExec;
        C34012x4.m75442d("start to read logcat.", new Object[0]);
        Process process = null;
        if (j11 == -1) {
            C34012x4.m75431a(LogState.DEBUG, "No exception time, exit!", new Object[0]);
            return null;
        }
        String str2 = new SimpleDateFormat("MM-dd HH:mm:ss.SSS").format(Long.valueOf(j11 - (1000 * j12)));
        C34012x4.m75431a(LogState.INFO, C33770l7.m73937a("logcat start time: ", str2), new Object[0]);
        if (str == null) {
            strArr = new String[]{"logcat", "-t", str2, "-v", "threadtime"};
        } else {
            strArr = new String[]{"logcat", "-t", str2, "-v", "threadtime", "-s", str};
        }
        try {
            processExec = Runtime.getRuntime().exec(strArr);
            try {
                try {
                    String strM72577a = m72577a(new BufferedReader(new InputStreamReader(processExec.getInputStream())), i11, i12, i13, null, j11);
                    try {
                        processExec.getOutputStream().close();
                    } catch (IOException e11) {
                        e11.printStackTrace();
                    }
                    try {
                        processExec.getInputStream().close();
                    } catch (IOException e12) {
                        e12.printStackTrace();
                    }
                    try {
                        processExec.getErrorStream().close();
                    } catch (IOException e13) {
                        e13.printStackTrace();
                    }
                    return strM72577a;
                } catch (Throwable th3) {
                    th2 = th3;
                    process = processExec;
                    if (process != null) {
                        try {
                            process.getOutputStream().close();
                        } catch (IOException e14) {
                            e14.printStackTrace();
                        }
                        try {
                            process.getInputStream().close();
                        } catch (IOException e15) {
                            e15.printStackTrace();
                        }
                        try {
                            process.getErrorStream().close();
                            throw th2;
                        } catch (IOException e16) {
                            e16.printStackTrace();
                            throw th2;
                        }
                    }
                    throw th2;
                }
            } catch (IOException e17) {
                iOException = e17;
                iOException.printStackTrace();
                if (processExec != null) {
                    try {
                        processExec.getOutputStream().close();
                    } catch (IOException e18) {
                        e18.printStackTrace();
                    }
                    try {
                        processExec.getInputStream().close();
                    } catch (IOException e19) {
                        e19.printStackTrace();
                    }
                    try {
                        processExec.getErrorStream().close();
                    } catch (IOException e21) {
                        e21.printStackTrace();
                    }
                }
                return null;
            }
        } catch (IOException e22) {
            iOException = e22;
            processExec = null;
        } catch (Throwable th4) {
            th2 = th4;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m72577a(BufferedReader bufferedReader, int i11, int i12, int i13, String str, long j11) {
        String string;
        Date date = new Date(j11);
        StringBuilder sb2 = new StringBuilder();
        boolean z11 = false;
        int i14 = 0;
        try {
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    if (str != null) {
                        if (Pattern.compile(str + "[ ]*:").matcher(line).find()) {
                            sb2.append(line);
                            sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                        }
                    } else {
                        sb2.append(line);
                        sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                    }
                    if (i11 > 0 && sb2.length() > i11) {
                        Date dateM72619d = m72619d(line);
                        if (dateM72619d != null) {
                            if (z11) {
                                z11 = false;
                            }
                            if (dateM72619d.getTime() >= date.getTime() || i14 >= i13) {
                                break;
                            }
                            sb2.delete(0, i12);
                            i14++;
                        } else {
                            if (z11) {
                                C34012x4.m75434a("Failed to get current date twice, do not get more logcat!", new Object[0]);
                                break;
                            }
                            z11 = true;
                        }
                        return string;
                    }
                } catch (Throwable th2) {
                    try {
                        sb2.append("\n[error:");
                        sb2.append(th2.toString());
                        sb2.append("]");
                        string = sb2.toString();
                    } finally {
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (Exception e11) {
                                C34012x4.m75438b(e11);
                            }
                        }
                    }
                }
            }
            bufferedReader.close();
        } catch (Exception e12) {
            C34012x4.m75438b(e12);
        }
        string = sb2.toString();
        return string;
    }

    /* JADX INFO: renamed from: a */
    public static Map<String, String> m72588a(boolean z11, int i11, boolean z12, boolean z13) {
        if (!z11) {
            C34012x4.m75434a("get all thread stack not enable", new Object[0]);
            return new HashMap();
        }
        Map<String, String> mapM72586a = m72586a(i11, z12, z13);
        return mapM72586a == null ? new HashMap() : mapM72586a;
    }

    /* JADX INFO: renamed from: a */
    public static Map<String, String> m72586a(int i11, boolean z11, boolean z12) {
        HashMap map = new HashMap(12);
        Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
        if (allStackTraces == null) {
            return null;
        }
        Thread thread = Looper.getMainLooper().getThread();
        if (z12) {
            allStackTraces.remove(thread);
        } else if (!allStackTraces.containsKey(thread)) {
            allStackTraces.put(thread, thread.getStackTrace());
        }
        long id2 = Thread.currentThread().getId();
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry<Thread, StackTraceElement[]> entry : allStackTraces.entrySet()) {
            if (!z11 || id2 != entry.getKey().getId()) {
                sb2.setLength(0);
                if (entry.getValue() != null && entry.getValue().length != 0) {
                    for (StackTraceElement stackTraceElement : entry.getValue()) {
                        if (i11 > 0 && sb2.length() >= i11) {
                            sb2.append("\n[Stack over limit size :" + i11 + " , has been cut!]");
                            break;
                        }
                        sb2.append(stackTraceElement.toString());
                        sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                    }
                    map.put(entry.getKey().getName() + "(" + entry.getKey().getId() + ")", sb2.toString());
                }
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: a */
    public static String m72580a(Thread thread) {
        if (thread == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        long jM77113b = ThreadSuspend.m77109c().m77113b(thread);
        StackTraceElement[] stackTrace = thread.getStackTrace();
        ThreadSuspend.m77109c().m77111a(jM77113b);
        for (StackTraceElement stackTraceElement : stackTrace) {
            sb2.append(stackTraceElement.toString());
            sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: a */
    public static boolean m72592a(Context context, String str, long j11) {
        C34012x4.m75434a("[Util] Try to lock file:%s (pid=%d | tid=%d)", str, Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
        try {
            File file = new File(context.getFilesDir() + File.separator + str);
            if (file.exists()) {
                if (System.currentTimeMillis() - file.lastModified() < j11) {
                    return false;
                }
                C34012x4.m75431a(LogState.DEBUG, "[Util] Lock file (%s) is expired, unlock it.", str);
                m72609b(context, str);
            }
            if (file.createNewFile()) {
                C34012x4.m75431a(LogState.DEBUG, "[Util] Successfully locked file: %s (pid=%d | tid=%d)", str, Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
                return true;
            }
            C34012x4.m75431a(LogState.DEBUG, "[Util] Failed to locked file: %s (pid=%d | tid=%d)", str, Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
            return false;
        } catch (Throwable th2) {
            C34012x4.m75432a(LogState.WARN, th2);
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m72578a(File file, int i11, boolean z11) {
        BufferedReader bufferedReader;
        if (file == null || !file.exists() || !file.canRead()) {
            return null;
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "utf-8"));
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    sb2.append(line);
                    sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                    if (i11 > 0 && sb2.length() > i11) {
                        if (z11) {
                            sb2.delete(i11, sb2.length());
                            break;
                        }
                        sb2.delete(0, sb2.length() - i11);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        C34012x4.m75438b(th);
                        if (bufferedReader != null) {
                            try {
                            } catch (Exception e11) {
                                C34012x4.m75432a(LogState.WARN, e11);
                            }
                        }
                        return null;
                    } finally {
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (Exception e12) {
                                C34012x4.m75438b(e12);
                            }
                        }
                    }
                }
            }
            String string = sb2.toString();
            try {
                bufferedReader.close();
                return string;
            } catch (Exception e13) {
                C34012x4.m75438b(e13);
                return string;
            }
        } catch (Throwable th3) {
            th = th3;
            bufferedReader = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static BufferedReader m72567a(File file) {
        if (file != null && file.exists() && file.canRead()) {
            try {
                return new BufferedReader(new FileReader(file));
            } catch (Throwable th2) {
                C34012x4.m75438b(th2);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static BufferedReader m72568a(String str, String str2) {
        if (str == null) {
            return null;
        }
        try {
            File file = new File(str, str2);
            if (file.exists() && file.canRead()) {
                return m72567a(file);
            }
            return null;
        } catch (NullPointerException e11) {
            C34012x4.m75438b(e11);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static Thread m72584a(Runnable runnable, String str) {
        try {
            Thread thread = new Thread(runnable);
            thread.setName(str);
            thread.start();
            return thread;
        } catch (Throwable th2) {
            C34012x4.m75437b("[Util] Failed to start a thread to execute task with message: %s", th2.getMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m72595a(Runnable runnable) {
        if (runnable == null) {
            return false;
        }
        C33784m0 c33784m0M74004c = C33784m0.m74004c();
        if (c33784m0M74004c != null) {
            return c33784m0M74004c.m74006a(runnable);
        }
        String[] strArrSplit = runnable.getClass().getName().split("\\.");
        return m72584a(runnable, strArrSplit[strArrSplit.length - 1]) != null;
    }

    /* JADX INFO: renamed from: a */
    public static SharedPreferences m72566a(String str, Context context) {
        if (context != null) {
            return context.getSharedPreferences(str, 0);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static String m72575a(Context context, NativeCrashHandler nativeCrashHandler) {
        nativeCrashHandler.getFd();
        String str = context.getFilesDir().getAbsoluteFile() + "/fd_record_temp.txt";
        String strM72578a = m72578a(new File(str), 0, true);
        m72591a(str);
        return strM72578a;
    }
}
