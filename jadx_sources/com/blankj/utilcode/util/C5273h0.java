package com.blankj.utilcode.util;

import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* JADX INFO: renamed from: com.blankj.utilcode.util.h0 */
/* JADX INFO: compiled from: ShellUtils.java */
/* JADX INFO: loaded from: classes.dex */
public final class C5273h0 {

    /* JADX INFO: renamed from: a */
    public static final String f6544a = System.getProperty("line.separator");

    /* JADX INFO: renamed from: com.blankj.utilcode.util.h0$a */
    /* JADX INFO: compiled from: ShellUtils.java */
    public static class a {

        /* JADX INFO: renamed from: a */
        public int f6545a;

        /* JADX INFO: renamed from: b */
        public String f6546b;

        /* JADX INFO: renamed from: c */
        public String f6547c;

        public String toString() {
            return "result: " + this.f6545a + "\nsuccessMsg: " + this.f6546b + "\nerrorMsg: " + this.f6547c;
        }

        public a(int i11, String str, String str2) {
            this.f6545a = i11;
            this.f6546b = str;
            this.f6547c = str2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0146  */
    /* JADX WARN: Code duplicated, block: B:108:0x014f  */
    /* JADX WARN: Code duplicated, block: B:109:0x0151  */
    /* JADX WARN: Code duplicated, block: B:112:0x0158  */
    /* JADX WARN: Code duplicated, block: B:132:0x0181  */
    /* JADX WARN: Code duplicated, block: B:138:0x0132 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:144:0x016d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:148:0x0128 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:154:0x0163 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:158:0x013c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:0x0177 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:175:? A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX INFO: renamed from: b */
    public static a m6232b(String[] strArr, boolean z11, boolean z12) throws Throwable {
        Process processExec;
        ?? r11;
        StringBuilder sb2;
        ?? r12;
        StringBuilder sb3;
        StringBuilder sb4;
        StringBuilder sb5;
        String string;
        StringBuilder sb6;
        Object obj;
        Object obj2;
        BufferedReader bufferedReader;
        int iWaitFor = -1;
        if (strArr == null || strArr.length == 0) {
            return new a(-1, "", "");
        }
        DataOutputStream dataOutputStream = null;
        BufferedReader bufferedReader2 = null;
        dataOutputStream = null;
        try {
            processExec = Runtime.getRuntime().exec(z11 ? CmcdConfiguration.KEY_STARTUP : "sh");
            try {
                DataOutputStream dataOutputStream2 = new DataOutputStream(processExec.getOutputStream());
                try {
                    try {
                        for (String str : strArr) {
                            if (str != null) {
                                dataOutputStream2.write(str.getBytes());
                                dataOutputStream2.writeBytes(f6544a);
                                dataOutputStream2.flush();
                            }
                        }
                        dataOutputStream2.writeBytes("exit" + f6544a);
                        dataOutputStream2.flush();
                        iWaitFor = processExec.waitFor();
                        if (z12) {
                            sb4 = new StringBuilder();
                            try {
                                sb5 = new StringBuilder();
                                try {
                                    BufferedReader bufferedReader3 = new BufferedReader(new InputStreamReader(processExec.getInputStream(), "UTF-8"));
                                    try {
                                        BufferedReader bufferedReader4 = new BufferedReader(new InputStreamReader(processExec.getErrorStream(), "UTF-8"));
                                        try {
                                            String line = bufferedReader3.readLine();
                                            if (line != null) {
                                                sb4.append(line);
                                                while (true) {
                                                    String line2 = bufferedReader3.readLine();
                                                    if (line2 == null) {
                                                        break;
                                                    }
                                                    sb4.append(f6544a);
                                                    sb4.append(line2);
                                                }
                                            }
                                            String line3 = bufferedReader4.readLine();
                                            if (line3 != null) {
                                                sb5.append(line3);
                                                while (true) {
                                                    String line4 = bufferedReader4.readLine();
                                                    if (line4 == null) {
                                                        break;
                                                    }
                                                    sb5.append(f6544a);
                                                    sb5.append(line4);
                                                }
                                            }
                                            bufferedReader2 = bufferedReader3;
                                            bufferedReader = bufferedReader4;
                                        } catch (Exception e11) {
                                            sb2 = sb4;
                                            e = e11;
                                            sb3 = sb5;
                                            obj2 = bufferedReader3;
                                            obj = bufferedReader4;
                                            dataOutputStream = dataOutputStream2;
                                            r11 = obj2;
                                            r12 = obj;
                                            try {
                                                e.printStackTrace();
                                                if (dataOutputStream != null) {
                                                    try {
                                                        dataOutputStream.close();
                                                    } catch (IOException e12) {
                                                        e12.printStackTrace();
                                                    }
                                                }
                                                if (r11 != 0) {
                                                    try {
                                                        r11.close();
                                                    } catch (IOException e13) {
                                                        e13.printStackTrace();
                                                    }
                                                }
                                                if (r12 != 0) {
                                                    try {
                                                        r12.close();
                                                    } catch (IOException e14) {
                                                        e14.printStackTrace();
                                                    }
                                                }
                                                if (processExec != null) {
                                                    processExec.destroy();
                                                }
                                                sb4 = sb2;
                                                sb5 = sb3;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                if (dataOutputStream != null) {
                                                    try {
                                                        dataOutputStream.close();
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
                                                if (r12 != 0) {
                                                    try {
                                                        r12.close();
                                                    } catch (IOException e17) {
                                                        e17.printStackTrace();
                                                    }
                                                }
                                                if (processExec == null) {
                                                    throw th;
                                                }
                                                processExec.destroy();
                                                throw th;
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            r11 = bufferedReader3;
                                            r12 = bufferedReader4;
                                            dataOutputStream = dataOutputStream2;
                                            if (dataOutputStream != null) {
                                                dataOutputStream.close();
                                            }
                                            if (r11 != 0) {
                                                r11.close();
                                            }
                                            if (r12 != 0) {
                                                r12.close();
                                            }
                                            if (processExec == null) {
                                                throw th;
                                            }
                                            processExec.destroy();
                                            throw th;
                                        }
                                    } catch (Exception e18) {
                                        sb2 = sb4;
                                        e = e18;
                                        sb3 = sb5;
                                        obj = null;
                                        obj2 = bufferedReader3;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        r12 = 0;
                                        r11 = bufferedReader3;
                                    }
                                } catch (Exception e19) {
                                    sb2 = sb4;
                                    e = e19;
                                    sb3 = sb5;
                                    sb6 = null;
                                    obj = sb6;
                                    obj2 = sb6;
                                    dataOutputStream = dataOutputStream2;
                                    r11 = obj2;
                                    r12 = obj;
                                    e.printStackTrace();
                                    if (dataOutputStream != null) {
                                        dataOutputStream.close();
                                    }
                                    if (r11 != 0) {
                                        r11.close();
                                    }
                                    if (r12 != 0) {
                                        r12.close();
                                    }
                                    if (processExec != null) {
                                        processExec.destroy();
                                    }
                                    sb4 = sb2;
                                    sb5 = sb3;
                                    if (sb4 == null) {
                                        string = "";
                                    } else {
                                        string = sb4.toString();
                                    }
                                    return new a(iWaitFor, string, sb5 != null ? sb5.toString() : "");
                                }
                            } catch (Exception e21) {
                                sb2 = sb4;
                                e = e21;
                                sb3 = null;
                                sb6 = sb3;
                                obj = sb6;
                                obj2 = sb6;
                                dataOutputStream = dataOutputStream2;
                                r11 = obj2;
                                r12 = obj;
                                e.printStackTrace();
                                if (dataOutputStream != null) {
                                    dataOutputStream.close();
                                }
                                if (r11 != 0) {
                                    r11.close();
                                }
                                if (r12 != 0) {
                                    r12.close();
                                }
                                if (processExec != null) {
                                    processExec.destroy();
                                }
                                sb4 = sb2;
                                sb5 = sb3;
                                if (sb4 == null) {
                                    string = "";
                                } else {
                                    string = sb4.toString();
                                }
                                return new a(iWaitFor, string, sb5 != null ? sb5.toString() : "");
                            }
                        } else {
                            sb4 = null;
                            sb5 = null;
                            bufferedReader = null;
                        }
                        try {
                            dataOutputStream2.close();
                        } catch (IOException e22) {
                            e22.printStackTrace();
                        }
                        if (bufferedReader2 != null) {
                            try {
                                bufferedReader2.close();
                            } catch (IOException e23) {
                                e23.printStackTrace();
                            }
                        }
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e24) {
                                e24.printStackTrace();
                            }
                        }
                        processExec.destroy();
                    } catch (Exception e25) {
                        e = e25;
                        sb2 = null;
                        sb3 = null;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    r11 = 0;
                    r12 = 0;
                }
            } catch (Exception e26) {
                e = e26;
                sb2 = null;
                sb3 = sb2;
                StringBuilder sb7 = sb3;
                r12 = sb7;
                r11 = sb7;
                e.printStackTrace();
                if (dataOutputStream != null) {
                    dataOutputStream.close();
                }
                if (r11 != 0) {
                    r11.close();
                }
                if (r12 != 0) {
                    r12.close();
                }
                if (processExec != null) {
                    processExec.destroy();
                }
                sb4 = sb2;
                sb5 = sb3;
                if (sb4 == null) {
                    string = "";
                } else {
                    string = sb4.toString();
                }
                return new a(iWaitFor, string, sb5 != null ? sb5.toString() : "");
            } catch (Throwable th6) {
                th = th6;
                r11 = 0;
                r12 = r11;
                if (dataOutputStream != null) {
                    dataOutputStream.close();
                }
                if (r11 != 0) {
                    r11.close();
                }
                if (r12 != 0) {
                    r12.close();
                }
                if (processExec == null) {
                    throw th;
                }
                processExec.destroy();
                throw th;
            }
        } catch (Exception e27) {
            e = e27;
            processExec = null;
            sb2 = null;
        } catch (Throwable th7) {
            th = th7;
            processExec = null;
            r11 = 0;
        }
        if (sb4 == null) {
            string = "";
        } else {
            string = sb4.toString();
        }
        return new a(iWaitFor, string, sb5 != null ? sb5.toString() : "");
    }

    /* JADX INFO: renamed from: a */
    public static a m6231a(String str, boolean z11) {
        return m6232b(new String[]{str}, z11, true);
    }
}
