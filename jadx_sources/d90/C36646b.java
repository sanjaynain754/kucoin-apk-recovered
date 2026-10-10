package d90;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: d90.b */
/* JADX INFO: compiled from: CommandUtil.java */
/* JADX INFO: loaded from: classes23.dex */
public class C36646b {

    /* JADX INFO: renamed from: d90.b$b */
    /* JADX INFO: compiled from: CommandUtil.java */
    public static class b {

        /* JADX INFO: renamed from: a */
        public static final C36646b f79446a = new C36646b();
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0090  */
    /* JADX WARN: Code duplicated, block: B:58:0x0086 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x007c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.io.BufferedInputStream] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.io.BufferedInputStream] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.io.BufferedInputStream] */
    /* JADX INFO: renamed from: a */
    public String m81983a(String str) throws Throwable {
        Process processExec;
        ?? r11;
        BufferedOutputStream bufferedOutputStream;
        ?? bufferedInputStream;
        BufferedOutputStream bufferedOutputStream2 = null;
        try {
            processExec = Runtime.getRuntime().exec("sh");
            try {
                bufferedOutputStream = new BufferedOutputStream(processExec.getOutputStream());
                try {
                    bufferedInputStream = new BufferedInputStream(processExec.getInputStream());
                    try {
                        bufferedOutputStream.write(str.getBytes());
                        bufferedOutputStream.write(10);
                        bufferedOutputStream.flush();
                        bufferedOutputStream.close();
                        processExec.waitFor();
                        String strM81982d = m81982d(bufferedInputStream);
                        try {
                            bufferedOutputStream.close();
                        } catch (IOException e11) {
                            e11.printStackTrace();
                        }
                        try {
                            bufferedInputStream.close();
                        } catch (IOException e12) {
                            e12.printStackTrace();
                        }
                        processExec.destroy();
                        return strM81982d;
                    } catch (Exception unused) {
                        if (bufferedOutputStream != null) {
                            try {
                                bufferedOutputStream.close();
                            } catch (IOException e13) {
                                e13.printStackTrace();
                            }
                        }
                        if (bufferedInputStream != 0) {
                            try {
                                bufferedInputStream.close();
                            } catch (IOException e14) {
                                e14.printStackTrace();
                            }
                        }
                        if (processExec != null) {
                            processExec.destroy();
                        }
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedOutputStream2 = bufferedOutputStream;
                        r11 = bufferedInputStream;
                        if (bufferedOutputStream2 != null) {
                            try {
                                bufferedOutputStream2.close();
                            } catch (IOException e15) {
                                e15.printStackTrace();
                            }
                        }
                        if (r11 != 0) {
                            try {
                                r11.close();
                            } catch (IOException e16) {
                                e16.printStackTrace();
                            }
                        }
                        if (processExec == null) {
                            throw th;
                        }
                        processExec.destroy();
                        throw th;
                    }
                } catch (Exception unused2) {
                    bufferedInputStream = 0;
                } catch (Throwable th3) {
                    th = th3;
                    bufferedInputStream = 0;
                }
            } catch (Exception unused3) {
                bufferedOutputStream = null;
                bufferedInputStream = bufferedOutputStream;
                if (bufferedOutputStream != null) {
                    bufferedOutputStream.close();
                }
                if (bufferedInputStream != 0) {
                    bufferedInputStream.close();
                }
                if (processExec != null) {
                    processExec.destroy();
                }
                return null;
            } catch (Throwable th4) {
                th = th4;
                r11 = 0;
            }
        } catch (Exception unused4) {
            processExec = null;
            bufferedOutputStream = null;
        } catch (Throwable th5) {
            th = th5;
            processExec = null;
            r11 = 0;
        }
    }

    /* JADX INFO: renamed from: b */
    public String m81984b(String str) {
        try {
            Object objInvoke = Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
            if (objInvoke != null) {
                return (String) objInvoke;
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public C36646b() {
    }

    /* JADX INFO: renamed from: d */
    public static String m81982d(BufferedInputStream bufferedInputStream) {
        int i11;
        if (bufferedInputStream == null) {
            return "";
        }
        byte[] bArr = new byte[512];
        StringBuilder sb2 = new StringBuilder();
        do {
            try {
                i11 = bufferedInputStream.read(bArr);
                if (i11 > 0) {
                    sb2.append(new String(bArr, 0, i11));
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        } while (i11 >= 512);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: c */
    public static final C36646b m81981c() {
        return b.f79446a;
    }
}
