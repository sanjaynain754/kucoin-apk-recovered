package com.tencent.bugly.proguard;

import android.content.Context;
import android.text.TextUtils;
import androidx.credentials.provider.CredentialEntry;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.kubi.otc.entity.OtcAd;
import com.tencent.bugly.common.utils.FileUtil;
import com.tencent.bugly.crashreport.crash.CrashDetailBean;
import com.tencent.bugly.crashreport.crash.jni.NativeExceptionHandler;
import com.tencent.rmonitor.common.logger.LogState;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.dd */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33608dd {

    /* JADX INFO: renamed from: a */
    public static final String f69569a = "rqd_record.eup";

    /* JADX INFO: renamed from: b */
    public static final String f69570b = "reg_record.txt";

    /* JADX INFO: renamed from: c */
    public static final String f69571c = "map_record.txt";

    /* JADX INFO: renamed from: d */
    public static final String f69572d = "NATIVE_RQD_REPORT";

    /* JADX INFO: renamed from: e */
    public static List<File> f69573e = new ArrayList();

    /* JADX INFO: renamed from: a */
    public static String m72835a(String str) {
        if (str == null) {
            return "";
        }
        String[] strArrSplit = str.split(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        if (strArrSplit == null || strArrSplit.length == 0) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : strArrSplit) {
            if (!str2.contains("java.lang.Thread.getStackTrace(")) {
                sb2.append(str2);
                sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
            }
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: b */
    public static String m72843b(String str, String str2) {
        BufferedReader bufferedReaderM72568a = C33571bi.m72568a(str, f69571c);
        if (bufferedReaderM72568a == null) {
            return null;
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            String line = bufferedReaderM72568a.readLine();
            if (line != null && line.startsWith(str2)) {
                while (true) {
                    String line2 = bufferedReaderM72568a.readLine();
                    if (line2 == null) {
                        String string = sb2.toString();
                        try {
                            bufferedReaderM72568a.close();
                            return string;
                        } catch (Exception e11) {
                            C34012x4.m75438b(e11);
                            return string;
                        }
                    }
                    sb2.append("  ");
                    sb2.append(line2);
                    sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                }
            }
            try {
                bufferedReaderM72568a.close();
                return null;
            } catch (Exception e12) {
                C34012x4.m75438b(e12);
                return null;
            }
        } catch (Throwable th2) {
            try {
                C34012x4.m75438b(th2);
                try {
                    bufferedReaderM72568a.close();
                } catch (Exception e13) {
                    C34012x4.m75432a(LogState.WARN, e13);
                }
                return null;
            } catch (Throwable th3) {
                try {
                    bufferedReaderM72568a.close();
                } catch (Exception e14) {
                    C34012x4.m75438b(e14);
                }
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static Map<String, Integer> m72849c(String str) {
        if (str == null) {
            return null;
        }
        try {
            HashMap map = new HashMap();
            for (String str2 : str.split(",")) {
                String[] strArrSplit = str2.split(C33844oi.f71346o);
                if (strArrSplit.length != 2) {
                    C34012x4.m75437b("error format at %s", str2);
                    return null;
                }
                map.put(strArrSplit[0], Integer.valueOf(Integer.parseInt(strArrSplit[1])));
            }
            return map;
        } catch (Exception e11) {
            C34012x4.m75437b("error format intStateStr %s", str);
            e11.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static long m72851d(Map<String, String> map) {
        String str = map.get("launchTime");
        if (str == null) {
            return -1L;
        }
        C34012x4.m75434a("[Native record info] launchTime: %s", str);
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException e11) {
            if (C34012x4.m75432a(LogState.WARN, e11)) {
                return -1L;
            }
            e11.printStackTrace();
            return -1L;
        }
    }

    /* JADX INFO: renamed from: e */
    public static String m72852e(Map<String, String> map) {
        String str = (String) m72833a(map, StackTraceHelper.STACK_KEY, "unknown");
        String str2 = map.get("jstack");
        if (str2 != null) {
            return str + "java:\n" + str2;
        }
        return str;
    }

    /* JADX INFO: renamed from: f */
    public static byte[] m72853f(Map<String, String> map) {
        String str = map.get("nativeLog");
        if (str == null || str.isEmpty()) {
            return null;
        }
        return C33571bi.m72597a((File) null, str, "BuglyNativeLog.txt");
    }

    /* JADX INFO: renamed from: a */
    public static CrashDetailBean m72832a(Context context, Map<String, String> map, NativeExceptionHandler nativeExceptionHandler) {
        if (!m72842a(map, context)) {
            return null;
        }
        Map<String, Integer> mapM72849c = m72849c(map.get("intStateStr"));
        if (mapM72849c == null) {
            C34012x4.m75437b("parse intSateMap fail", Integer.valueOf(map.size()));
            return null;
        }
        try {
            mapM72849c.get("sino").getClass();
            mapM72849c.get("sud").getClass();
            String str = map.get("soVersion");
            if (TextUtils.isEmpty(str)) {
                C34012x4.m75437b("error format at version", new Object[0]);
                return null;
            }
            String str2 = (String) m72833a(map, "codeMsg", "unknown");
            String str3 = (String) m72833a(map, "signalName", "unknown");
            map.get("errnoMsg");
            String strM72852e = m72852e(map);
            String str4 = (String) m72833a(map, "crashIdentify", "");
            Integer num = mapM72849c.get("sico");
            if (num != null && num.intValue() > 0) {
                str3 = str3 + "(" + str2 + ")";
                str2 = "KERNEL";
            }
            byte[] bArrM72853f = m72853f(map);
            String strM72844b = m72844b(map, mapM72849c);
            String strM72848c = m72848c(map, mapM72849c);
            String strM72838a = m72838a(map, mapM72849c);
            Map<String, String> mapM72850c = m72850c(map);
            long jIntValue = (((long) mapM72849c.get("ets").intValue()) * 1000) + (((long) mapM72849c.get("etms").intValue()) / 1000);
            String str5 = (String) m72833a(map, "errorAddr", "unknown");
            String strM72835a = m72835a(strM72852e);
            String str6 = map.get("sysLogPath");
            String str7 = map.get("jniLogPath");
            long j11 = Long.parseLong((String) m72833a(map, "ramAvail", OtcAd.KYC_NOT_PASS));
            long j12 = Long.parseLong((String) m72833a(map, "romAvail", OtcAd.KYC_NOT_PASS));
            long j13 = Long.parseLong((String) m72833a(map, "sdAvail", OtcAd.KYC_NOT_PASS));
            long j14 = Long.parseLong((String) m72833a(map, "vss", OtcAd.KYC_NOT_PASS));
            CrashDetailBean crashDetailBeanPackageCrashBasicDatas = nativeExceptionHandler.packageCrashBasicDatas(strM72848c, jIntValue, str3, str5, strM72835a, (String) m72833a(map, "abortMsg", ""), str2, strM72844b, (String) m72833a(map, "tombPath", "unknown"), str6, str7, str);
            if (crashDetailBeanPackageCrashBasicDatas == null) {
                return crashDetailBeanPackageCrashBasicDatas;
            }
            nativeExceptionHandler.packageCrashDetailDatas(crashDetailBeanPackageCrashBasicDatas, strM72838a, bArrM72853f, mapM72850c, false, j11, j12, j13, j14);
            String str8 = (String) m72833a(map, "userId", crashDetailBeanPackageCrashBasicDatas.f68665v);
            crashDetailBeanPackageCrashBasicDatas.f68665v = str8;
            C34012x4.m75434a("[Native record info] userId: %s", str8);
            String str9 = (String) m72833a(map, RemoteConfigConstants.RequestFieldKey.APP_VERSION, crashDetailBeanPackageCrashBasicDatas.f68649l);
            crashDetailBeanPackageCrashBasicDatas.f68649l = str9;
            C34012x4.m75434a("[Native record info] appVersion: %s", str9);
            String str10 = (String) m72833a(map, RemoteConfigConstants.RequestFieldKey.SDK_VERSION, crashDetailBeanPackageCrashBasicDatas.f68647k);
            crashDetailBeanPackageCrashBasicDatas.f68647k = str10;
            C34012x4.m75434a("[Native record info] sdkVersion: %s", str10);
            String str11 = (String) m72833a(map, "hotPatchNum", "");
            crashDetailBeanPackageCrashBasicDatas.f68652m0 = str11;
            C34012x4.m75434a("[Native record info] hotPatchNum: %s", str11);
            crashDetailBeanPackageCrashBasicDatas.f68645j = (String) m72833a(map, C33577c3.f69335I, crashDetailBeanPackageCrashBasicDatas.f68645j);
            crashDetailBeanPackageCrashBasicDatas.f68643i = (String) m72833a(map, C33577c3.f69334H, crashDetailBeanPackageCrashBasicDatas.f68643i);
            crashDetailBeanPackageCrashBasicDatas.f68651m = (String) m72833a(map, "buildNum", crashDetailBeanPackageCrashBasicDatas.f68651m);
            crashDetailBeanPackageCrashBasicDatas.f68653n = (String) m72833a(map, "appChannel", crashDetailBeanPackageCrashBasicDatas.f68653n);
            crashDetailBeanPackageCrashBasicDatas.f68607F = (String) m72833a(map, "sysLog", crashDetailBeanPackageCrashBasicDatas.f68607F);
            crashDetailBeanPackageCrashBasicDatas.f68641h = m72841a(map);
            crashDetailBeanPackageCrashBasicDatas.f68632c0 = m72846b(map);
            crashDetailBeanPackageCrashBasicDatas.f68630b0 = m72851d(map);
            crashDetailBeanPackageCrashBasicDatas.f68610I = null;
            crashDetailBeanPackageCrashBasicDatas.f68657p = null;
            crashDetailBeanPackageCrashBasicDatas.f68663t = true;
            crashDetailBeanPackageCrashBasicDatas.f68635e = str4;
            m72839a(map, crashDetailBeanPackageCrashBasicDatas);
            C33663g5.m73147b(crashDetailBeanPackageCrashBasicDatas);
            return crashDetailBeanPackageCrashBasicDatas;
        } catch (Throwable th2) {
            C34012x4.m75437b(C33799mf.m74131a("error format\n", th2), new Object[0]);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m72847c(String str, String str2) {
        BufferedReader bufferedReaderM72568a = C33571bi.m72568a(str, f69570b);
        if (bufferedReaderM72568a == null) {
            return null;
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            String line = bufferedReaderM72568a.readLine();
            if (line != null && line.startsWith(str2)) {
                int i11 = 18;
                int i12 = 0;
                int length = 0;
                while (true) {
                    String line2 = bufferedReaderM72568a.readLine();
                    if (line2 != null) {
                        if (i12 % 4 == 0) {
                            if (i12 > 0) {
                                sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                            }
                            sb2.append("  ");
                        } else {
                            if (line2.length() > 16) {
                                i11 = 28;
                            }
                            sb2.append("                ".substring(0, i11 - length));
                        }
                        length = line2.length();
                        sb2.append(line2);
                        i12++;
                    } else {
                        sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                        String string = sb2.toString();
                        try {
                            bufferedReaderM72568a.close();
                            return string;
                        } catch (Exception e11) {
                            C34012x4.m75438b(e11);
                            return string;
                        }
                    }
                }
            }
            try {
                bufferedReaderM72568a.close();
                return null;
            } catch (Exception e12) {
                C34012x4.m75438b(e12);
                return null;
            }
        } catch (Throwable th2) {
            try {
                C34012x4.m75438b(th2);
                try {
                    bufferedReaderM72568a.close();
                } catch (Exception e13) {
                    C34012x4.m75432a(LogState.WARN, e13);
                }
                return null;
            } catch (Throwable th3) {
                try {
                    bufferedReaderM72568a.close();
                } catch (Exception e14) {
                    C34012x4.m75438b(e14);
                }
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m72845b(String str) {
        File[] fileArrListFiles;
        if (str == null) {
            return;
        }
        try {
            File file = new File(str);
            if (file.canRead() && file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
                for (File file2 : fileArrListFiles) {
                    if (file2.canRead() && file2.canWrite() && file2.length() == 0) {
                        file2.delete();
                        C34012x4.m75434a("Delete empty record file %s", file2.getAbsoluteFile());
                    }
                }
            }
        } catch (Throwable th2) {
            C34012x4.m75438b(th2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m72844b(Map<String, String> map, Map<String, Integer> map2) {
        String str = (String) m72833a(map, "sendingProcess", "unknown");
        Integer num = map2.get("spd");
        if (num == null) {
            return str;
        }
        return str + "(" + num + ")";
    }

    /* JADX INFO: renamed from: b */
    public static boolean m72846b(Map<String, String> map) {
        String str = map.get("isAppForeground");
        if (str == null) {
            return false;
        }
        C34012x4.m75434a("[Native record info] isAppForeground: %s", str);
        return str.equalsIgnoreCase(CredentialEntry.TRUE_STRING);
    }

    /* JADX INFO: renamed from: c */
    public static String m72848c(Map<String, String> map, Map<String, Integer> map2) {
        String str = (String) m72833a(map, "threadName", "unknown");
        Integer num = map2.get("et");
        if (num == null) {
            return str;
        }
        return str + "(" + num + ")";
    }

    /* JADX INFO: renamed from: c */
    public static Map<String, String> m72850c(Map<String, String> map) {
        String str = map.get("key-value");
        if (str == null) {
            return null;
        }
        HashMap map2 = new HashMap();
        for (String str2 : str.split(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE)) {
            String[] strArrSplit = str2.split("=");
            if (strArrSplit.length == 2) {
                map2.put(strArrSplit[0], strArrSplit[1]);
            }
        }
        return map2;
    }

    /* JADX INFO: renamed from: a */
    public static void m72839a(Map<String, String> map, CrashDetailBean crashDetailBean) {
        if (map == null || crashDetailBean == null) {
            return;
        }
        crashDetailBean.m72184a("RDelivery", (String) m72833a(map, "shiplyVersionLabel", ""));
        crashDetailBean.m72184a("stage", (String) m72833a(map, "stageLabel", ""));
        crashDetailBean.m72184a(CrashDetailBean.f68590E0, (String) m72833a(map, CrashDetailBean.f68590E0, ""));
        crashDetailBean.m72184a(CrashDetailBean.f68589D0, (String) m72833a(map, CrashDetailBean.f68589D0, ""));
    }

    /* JADX INFO: renamed from: a */
    public static <KeyT, ValueT> ValueT m72833a(Map<KeyT, ValueT> map, KeyT keyt, ValueT valuet) {
        try {
            ValueT valuet2 = map.get(keyt);
            return valuet2 != null ? valuet2 : valuet;
        } catch (Exception e11) {
            C34012x4.m75438b(e11);
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m72834a(BufferedInputStream bufferedInputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        if (bufferedInputStream == null) {
            return null;
        }
        try {
            byteArrayOutputStream = new ByteArrayOutputStream(1024);
            while (true) {
                try {
                    int i11 = bufferedInputStream.read();
                    if (i11 == -1) {
                        byteArrayOutputStream.close();
                        break;
                    }
                    if (i11 == 0) {
                        String str = new String(byteArrayOutputStream.toByteArray(), "UTf-8");
                        byteArrayOutputStream.close();
                        return str;
                    }
                    byteArrayOutputStream.write(i11);
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        C34012x4.m75438b(th);
                    } finally {
                        if (byteArrayOutputStream != null) {
                            byteArrayOutputStream.close();
                        }
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
            byteArrayOutputStream = null;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:75:0x009c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static CrashDetailBean m72831a(Context context, String str, NativeExceptionHandler nativeExceptionHandler) {
        BufferedInputStream bufferedInputStream;
        String str2;
        String strM72834a;
        BufferedInputStream bufferedInputStream2 = null;
        if (context != null && str != null && nativeExceptionHandler != null) {
            File file = new File(str, f69569a);
            if (!file.exists() || !file.canRead()) {
                return null;
            }
            try {
                bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                try {
                    String strM72834a2 = m72834a(bufferedInputStream);
                    if (strM72834a2 != null && strM72834a2.equals(f69572d)) {
                        HashMap map = new HashMap();
                        loop0: while (true) {
                            str2 = null;
                            while (true) {
                                strM72834a = m72834a(bufferedInputStream);
                                if (strM72834a == null) {
                                    break loop0;
                                }
                                if (str2 == null) {
                                    str2 = strM72834a;
                                }
                            }
                            map.put(str2, strM72834a);
                        }
                        if (str2 != null) {
                            C34012x4.m75437b("record not pair! drop! %s", str2);
                            try {
                                bufferedInputStream.close();
                                return null;
                            } catch (IOException e11) {
                                e11.printStackTrace();
                                return null;
                            }
                        }
                        CrashDetailBean crashDetailBeanM72832a = m72832a(context, map, nativeExceptionHandler);
                        try {
                            bufferedInputStream.close();
                            return crashDetailBeanM72832a;
                        } catch (IOException e12) {
                            e12.printStackTrace();
                            return crashDetailBeanM72832a;
                        }
                    }
                    C34012x4.m75437b("record read fail! %s", strM72834a2);
                    try {
                        bufferedInputStream.close();
                        return null;
                    } catch (IOException e13) {
                        e13.printStackTrace();
                        return null;
                    }
                } catch (IOException e14) {
                    e = e14;
                    try {
                        e.printStackTrace();
                        if (bufferedInputStream != null) {
                            try {
                                bufferedInputStream.close();
                            } catch (IOException e15) {
                                e15.printStackTrace();
                            }
                        }
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedInputStream2 = bufferedInputStream;
                        bufferedInputStream = bufferedInputStream2;
                        if (bufferedInputStream != null) {
                            try {
                                bufferedInputStream.close();
                            } catch (IOException e16) {
                                e16.printStackTrace();
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (bufferedInputStream != null) {
                        bufferedInputStream.close();
                    }
                    throw th;
                }
            } catch (IOException e17) {
                e = e17;
                bufferedInputStream = null;
            } catch (Throwable th4) {
                th = th4;
                bufferedInputStream = bufferedInputStream2;
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
                throw th;
            }
        } else {
            C34012x4.m75437b("get eup record file args error", new Object[0]);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m72837a(String str, String str2) {
        if (str == null || str2 == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        String strM72847c = m72847c(str, str2);
        if (strM72847c != null && !strM72847c.isEmpty()) {
            sb2.append("Register infos:\n");
            sb2.append(strM72847c);
        }
        String strM72843b = m72843b(str, str2);
        if (strM72843b != null && !strM72843b.isEmpty()) {
            if (sb2.length() > 0) {
                sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
            }
            sb2.append("System SO infos:\n");
            sb2.append(strM72843b);
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: a */
    public static void m72840a(boolean z11, String str) {
        if (str != null) {
            f69573e.add(new File(str, f69569a));
            f69573e.add(new File(str, f69570b));
            f69573e.add(new File(str, f69571c));
            if (z11) {
                m72845b(str);
                m72845b(FileUtil.getFileParentPath(str));
            }
        }
        List<File> list = f69573e;
        if (list == null || list.size() <= 0) {
            return;
        }
        for (File file : f69573e) {
            if (file.exists() && file.canWrite()) {
                file.delete();
                C34012x4.m75434a("Delete record file %s", file.getAbsoluteFile());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m72836a(String str, int i11, int i12, int i13, String str2, long j11) {
        if (j11 == -1) {
            C34012x4.m75434a("No exception time, exit!", new Object[0]);
            return null;
        }
        if (str != null && i11 > 0) {
            File file = new File(str);
            if (file.exists() && file.canRead()) {
                C34012x4.m75442d("Read system log from native record file(length: %s bytes): %s", Long.valueOf(file.length()), file.getAbsolutePath());
                f69573e.add(file);
                C34012x4.m75431a(LogState.DEBUG, "Add this record file to list for cleaning lastly.", new Object[0]);
                try {
                    return C33571bi.m72577a(new BufferedReader(new InputStreamReader(new FileInputStream(file), "utf-8")), i11, i12, i13, str2, j11);
                } catch (Throwable th2) {
                    C34012x4.m75432a(LogState.WARN, th2);
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m72842a(Map<String, String> map, Context context) {
        if (map == null) {
            return false;
        }
        if (C33765l2.m73825a(context) == null) {
            C34012x4.m75437b("abnormal com info not created", new Object[0]);
            return false;
        }
        String str = map.get("intStateStr");
        if (str != null && str.trim().length() > 0) {
            return true;
        }
        C34012x4.m75437b("no intStateStr", new Object[0]);
        return false;
    }

    /* JADX INFO: renamed from: a */
    public static String m72838a(Map<String, String> map, Map<String, Integer> map2) {
        String str = (String) m72833a(map, "processName", "unknown");
        Integer num = map2.get("ep");
        if (num == null) {
            return str;
        }
        return str + "(" + num + ")";
    }

    /* JADX INFO: renamed from: a */
    public static boolean m72841a(Map<String, String> map) {
        String str = map.get("isFirstInstall");
        if (str != null) {
            return str.equalsIgnoreCase(CredentialEntry.TRUE_STRING);
        }
        return false;
    }
}
