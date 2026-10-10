package com.ishumei.smantifraud.l111l11111I1l;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.tencent.bugly.proguard.C33556b3;
import com.tencent.imsdk.BaseConstants;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class l11l1111Il1l {
    private static String l1111l111111Il() throws Throwable {
        int iIntValue = 0;
        try {
            String strL1111l111111Il = l1111l111111Il("cat /proc/self/cgroup");
            if (!TextUtils.isEmpty(strL1111l111111Il)) {
                int iLastIndexOf = strL1111l111111Il.lastIndexOf("uid");
                int iLastIndexOf2 = strL1111l111111Il.lastIndexOf("/pid");
                if (iLastIndexOf >= 0) {
                    if (iLastIndexOf2 <= 0) {
                        iLastIndexOf2 = strL1111l111111Il.length();
                    }
                    String strReplaceAll = strL1111l111111Il.substring(iLastIndexOf + 4, iLastIndexOf2).replaceAll(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, "");
                    if (strReplaceAll != null && strReplaceAll.length() != 0) {
                        int i11 = 0;
                        while (true) {
                            if (i11 >= strReplaceAll.length()) {
                                iIntValue = Integer.valueOf(strReplaceAll).intValue();
                                break;
                            }
                            if (!Character.isDigit(strReplaceAll.charAt(i11))) {
                                break;
                            }
                            i11++;
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
        if (iIntValue == 0) {
            try {
                Context context = com.ishumei.smantifraud.l111l11111lIl.l111l1111l1Il.l1111l111111Il;
                if (context != null) {
                    iIntValue = context.getApplicationInfo().uid;
                }
            } catch (Exception unused2) {
            }
        }
        if (iIntValue == 0) {
            return null;
        }
        return l1111l111111Il(iIntValue);
    }

    private static void l111l11111lIl(com.ishumei.smantifraud.l1111l111111Il.l111l11111I1l l111l11111i1l) throws Throwable {
        try {
            String strL1111l111111Il = l1111l111111Il();
            if (TextUtils.isEmpty(strL1111l111111Il)) {
                return;
            }
            String strL1111l111111Il2 = l1111l111111Il("ps");
            if (!TextUtils.isEmpty(strL1111l111111Il2) && strL1111l111111Il2.split(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE).length > 0) {
                l111l11111i1l.l11l111I11l(strL1111l111111Il);
            }
        } catch (Exception unused) {
        }
    }

    private static String l1111l111111Il(int i11) {
        Method method;
        if (Build.VERSION.SDK_INT > 27) {
            return String.format(Locale.US, "u0_a%d", Integer.valueOf(i11 + BaseConstants.ERR_SVR_SSO_VCODE));
        }
        try {
            Field declaredField = Class.forName("libcore.io.Libcore").getDeclaredField(C33556b3.f69078o2);
            if (!declaredField.isAccessible()) {
                declaredField.setAccessible(true);
            }
            Object obj = declaredField.get(null);
            if (obj != null && (method = obj.getClass().getMethod("getpwuid", Integer.TYPE)) != null) {
                if (!method.isAccessible()) {
                    method.setAccessible(true);
                }
                Object objInvoke = method.invoke(obj, Integer.valueOf(i11));
                if (objInvoke != null) {
                    Field declaredField2 = objInvoke.getClass().getDeclaredField("pw_name");
                    if (!declaredField2.isAccessible()) {
                        declaredField2.setAccessible(true);
                    }
                    return (String) declaredField2.get(objInvoke);
                }
            }
            return null;
        } catch (Exception unused) {
            return String.format(Locale.US, "u0_a%d", Integer.valueOf(i11 + BaseConstants.ERR_SVR_SSO_VCODE));
        }
    }

    private static boolean l111l11111lIl(String str) {
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

    private static String l1111l111111Il(BufferedInputStream bufferedInputStream) {
        int i11;
        byte[] bArr = new byte[512];
        StringBuilder sb2 = new StringBuilder();
        do {
            try {
                i11 = bufferedInputStream.read(bArr);
                if (i11 > 0) {
                    sb2.append(new String(bArr, 0, i11));
                }
            } catch (Exception unused) {
            }
        } while (i11 >= 512);
        return sb2.toString();
    }

    private static String l1111l111111Il(String str) throws Throwable {
        BufferedInputStream bufferedInputStream;
        Throwable th2;
        Process processExec;
        try {
            processExec = Runtime.getRuntime().exec(str);
            try {
                bufferedInputStream = new BufferedInputStream(processExec.getInputStream());
                try {
                    processExec.waitFor();
                    String strL1111l111111Il = l1111l111111Il(bufferedInputStream);
                    try {
                        bufferedInputStream.close();
                    } catch (IOException unused) {
                    }
                    processExec.destroy();
                    return strL1111l111111Il;
                } catch (Exception unused2) {
                    if (bufferedInputStream != null) {
                        try {
                            bufferedInputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                    if (processExec != null) {
                        processExec.destroy();
                    }
                    return null;
                } catch (Throwable th3) {
                    th2 = th3;
                    if (bufferedInputStream != null) {
                        try {
                            bufferedInputStream.close();
                        } catch (IOException unused4) {
                        }
                    }
                    if (processExec == null) {
                        throw th2;
                    }
                    processExec.destroy();
                    throw th2;
                }
            } catch (Exception unused5) {
                bufferedInputStream = null;
            } catch (Throwable th4) {
                bufferedInputStream = null;
                th2 = th4;
            }
        } catch (Exception unused6) {
            processExec = null;
            bufferedInputStream = null;
        } catch (Throwable th5) {
            bufferedInputStream = null;
            th2 = th5;
            processExec = null;
        }
    }

    public static void l1111l111111Il(com.ishumei.smantifraud.l1111l111111Il.l111l11111I1l l111l11111i1l) throws Throwable {
        try {
            String strL1111l111111Il = l1111l111111Il();
            if (TextUtils.isEmpty(strL1111l111111Il)) {
                return;
            }
            String strL1111l111111Il2 = l1111l111111Il("ps");
            if (!TextUtils.isEmpty(strL1111l111111Il2) && strL1111l111111Il2.split(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE).length > 0) {
                l111l11111i1l.l11l111I11l(strL1111l111111Il);
            }
        } catch (Exception unused) {
        }
    }
}
