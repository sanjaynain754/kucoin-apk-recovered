package com.datavisorobfus;

import android.content.Context;
import com.appsflyer.AppsFlyerProperties;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.datavisorobfus.t */
/* JADX INFO: loaded from: classes34.dex */
public class C5444t {
    /* JADX INFO: renamed from: a */
    private static String m7392a(BufferedInputStream bufferedInputStream) {
        if (bufferedInputStream == null) {
            return "";
        }
        byte[] bArr = new byte[8192];
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            try {
                int i11 = bufferedInputStream.read(bArr);
                if (i11 == -1) {
                    break;
                }
                if (i11 > 0) {
                    sb2.append(new String(bArr, 0, i11));
                }
            } catch (Throwable unused) {
            }
        }
        String string = sb2.toString();
        return (string.length() <= 0 || !string.substring(string.length() + (-1), string.length()).equals(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE)) ? string : string.substring(0, string.length() - 1);
    }

    /* JADX INFO: renamed from: b */
    public static String m7395b(String str) {
        BufferedReader bufferedReader;
        Matcher matcher;
        try {
            bufferedReader = new BufferedReader(new FileReader("/proc/cpuinfo"));
            try {
                Pattern patternCompile = Pattern.compile(str + "\\s*:\\s*(.*)");
                do {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable unused) {
                        }
                        return null;
                    }
                    matcher = patternCompile.matcher(line);
                } while (!matcher.matches());
                String strGroup = matcher.group(1);
                try {
                    bufferedReader.close();
                } catch (Throwable unused2) {
                }
                return strGroup;
            } catch (Throwable unused3) {
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable unused4) {
                    }
                }
                return null;
            }
        } catch (Throwable unused5) {
            bufferedReader = null;
        }
    }

    /* JADX INFO: renamed from: d */
    private static boolean m7397d(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        for (int i11 = 0; i11 < str.length(); i11++) {
            if (!Character.isDigit(str.charAt(i11))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0056  */
    /* JADX WARN: Code duplicated, block: B:34:0x0051 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x004c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static String m7393a(String str) {
        Process processExec;
        BufferedInputStream bufferedInputStream;
        BufferedInputStream bufferedInputStream2;
        if (C5457z0.m7480a(str)) {
            C5415f0.m7136a("command is empty");
            return null;
        }
        try {
            processExec = Runtime.getRuntime().exec(str);
            try {
                bufferedInputStream = new BufferedInputStream(processExec.getInputStream());
                try {
                    bufferedInputStream2 = new BufferedInputStream(processExec.getErrorStream());
                    try {
                        String strM7392a = m7392a(bufferedInputStream);
                        String strM7392a2 = m7392a(bufferedInputStream2);
                        processExec.waitFor();
                        if (!C5457z0.m7480a(strM7392a2)) {
                            C5415f0.m7136a(strM7392a2);
                        }
                        try {
                            bufferedInputStream.close();
                        } catch (Throwable unused) {
                        }
                        try {
                            bufferedInputStream2.close();
                        } catch (Throwable unused2) {
                        }
                        processExec.destroy();
                        return strM7392a;
                    } catch (Throwable unused3) {
                        if (bufferedInputStream != null) {
                            try {
                                bufferedInputStream.close();
                            } catch (Throwable unused4) {
                            }
                        }
                        if (bufferedInputStream2 != null) {
                            try {
                                bufferedInputStream2.close();
                            } catch (Throwable unused5) {
                            }
                        }
                        if (processExec != null) {
                            processExec.destroy();
                        }
                        return null;
                    }
                } catch (Throwable unused6) {
                    bufferedInputStream2 = null;
                }
            } catch (Throwable unused7) {
                bufferedInputStream = null;
                bufferedInputStream2 = null;
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
                if (bufferedInputStream2 != null) {
                    bufferedInputStream2.close();
                }
                if (processExec != null) {
                    processExec.destroy();
                }
                return null;
            }
        } catch (Throwable unused8) {
            processExec = null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m7396c(String str) {
        try {
            Class<?> clsLoadClass = Context.class.getClassLoader().loadClass("android.os.SystemProperties");
            Method method = clsLoadClass.getMethod("get", String.class);
            method.setAccessible(true);
            return (String) method.invoke(clsLoadClass, str);
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static String m7398e(String str) {
        FileInputStream fileInputStream;
        StringBuilder sb2 = new StringBuilder("");
        try {
            fileInputStream = new FileInputStream(str);
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int i11 = fileInputStream.read(bArr);
                    if (i11 == -1) {
                        fileInputStream.close();
                        return sb2.toString();
                    }
                    if (i11 > 0) {
                        sb2.append(new String(bArr, 0, i11));
                    }
                }
            } catch (Throwable unused) {
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable unused2) {
                    }
                }
                return null;
            }
        } catch (Throwable unused3) {
            fileInputStream = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static Map<String, Integer> m7394a() {
        String strM7398e = m7398e("/proc/self/cgroup");
        if (strM7398e != null && strM7398e.length() != 0) {
            int iLastIndexOf = strM7398e.lastIndexOf("uid");
            int iLastIndexOf2 = strM7398e.lastIndexOf("/pid");
            if (iLastIndexOf < 0) {
                return null;
            }
            if (iLastIndexOf2 <= 0) {
                iLastIndexOf2 = strM7398e.length();
            }
            try {
                String strReplaceAll = strM7398e.substring(iLastIndexOf + 4, iLastIndexOf2).replaceAll(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, "");
                if (m7397d(strReplaceAll)) {
                    int iIntValue = Integer.valueOf(strReplaceAll).intValue();
                    HashMap map = new HashMap();
                    map.put("userid", Integer.valueOf(iIntValue / 100000));
                    map.put(AppsFlyerProperties.APP_ID, Integer.valueOf(iIntValue % 100000));
                    return map;
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }
}
