package com.tencent.liteav.base.system;

import android.content.Context;
import android.os.SystemClock;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.Log;
import com.tencent.liteav.base.storage.PersistStorage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.security.MessageDigest;
import java.util.UUID;

/* JADX INFO: renamed from: com.tencent.liteav.base.system.p */
/* JADX INFO: loaded from: classes59.dex */
final class C34728p {

    /* JADX INFO: renamed from: a */
    private static final char[] f73511a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX WARN: Code duplicated, block: B:103:0x01e0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:99:0x01e6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x0061: MOVE (r3 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]) (LINE:98), block:B:18:0x0061 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.tencent.liteav.base.storage.PersistStorage] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.String] */
    /* JADX INFO: renamed from: a */
    public static String m76073a(String str) throws Throwable {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        ?? r11;
        String str2;
        ?? string;
        FileOutputStream fileOutputStream;
        String str3;
        Context applicationContext = ContextUtils.getApplicationContext();
        String str4 = "";
        if (applicationContext == null) {
            return "";
        }
        FileInputStream fileInputStream3 = null;
        File externalFilesDir = applicationContext.getExternalFilesDir(null);
        String str5 = "UUID";
        if (externalFilesDir == null) {
            Log.m76033e("UUID", "getDeviceUuid: sdcardDir is null.", new Object[0]);
            return "";
        }
        ?? persistStorage = new PersistStorage("com.tencent.liteav.dev_uuid");
        ?? string2 = persistStorage.getString("com.tencent.liteav.key_dev_uuid");
        try {
            try {
                File file = new File(externalFilesDir.getAbsolutePath() + "/liteav/spuid");
                if (file.exists()) {
                    fileInputStream = new FileInputStream(file);
                    try {
                        int iAvailable = fileInputStream.available();
                        if (iAvailable > 0) {
                            byte[] bArr = new byte[iAvailable];
                            fileInputStream.read(bArr);
                            str3 = new String(bArr, "UTF-8");
                        } else {
                            r11 = 0;
                        }
                    } catch (Exception e11) {
                        e = e11;
                        Log.m76033e("UUID", "Read UUID from file failed." + e.getMessage(), new Object[0]);
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (Exception unused) {
                            }
                        }
                        r11 = 0;
                    }
                } else {
                    r11 = 0;
                    fileInputStream = null;
                }
                if (fileInputStream != null) {
                    try {
                        r11 = str3;
                        fileInputStream.close();
                    } catch (Exception unused2) {
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                fileInputStream3 = fileInputStream2;
                if (fileInputStream3 != null) {
                    try {
                        fileInputStream3.close();
                    } catch (Exception unused3) {
                    }
                }
                throw th;
            }
        } catch (Exception e12) {
            e = e12;
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            if (fileInputStream3 != null) {
                fileInputStream3.close();
            }
            throw th;
        }
        ?? r12 = (string2 == 0 || string2.length() <= 0) ? (r11 == 0 || r11.length() <= 0) ? 0 : r11 : string2;
        if (r12 == 0 || r12.length() == 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jUptimeMillis = SystemClock.uptimeMillis();
            int i11 = 5;
            while (i11 >= 0) {
                str4 = str4 + String.format("%02x", Byte.valueOf((byte) ((jCurrentTimeMillis >> (i11 * 8)) & 255)));
                i11--;
                str5 = str5;
            }
            str2 = str5;
            for (int i12 = 3; i12 >= 0; i12--) {
                str4 = str4 + String.format("%02x", Byte.valueOf((byte) ((jUptimeMillis >> (i12 * 8)) & 255)));
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str4);
            sb2.append(m76074b(str + UUID.randomUUID().toString()));
            string = sb2.toString();
        } else {
            str2 = "UUID";
            string = r12;
        }
        ?? r13 = string;
        if (r11 == 0 || !r11.equals(r13)) {
            try {
                File file2 = new File(externalFilesDir.getAbsolutePath() + "/liteav");
                if (!file2.exists()) {
                    file2.mkdir();
                }
                File file3 = new File(externalFilesDir.getAbsolutePath() + "/liteav/spuid");
                if (!file3.exists()) {
                    file3.createNewFile();
                }
                fileOutputStream = new FileOutputStream(file3);
                try {
                    try {
                        fileOutputStream.write(r13.getBytes());
                    } catch (Exception e13) {
                        e = e13;
                        Log.m76033e(str2, "Write UUID to file failed." + e.getMessage(), new Object[0]);
                        if (fileOutputStream != null) {
                        }
                        if (string2 != 0) {
                            persistStorage.put("com.tencent.liteav.key_dev_uuid", r13);
                            persistStorage.commit();
                        } else {
                            persistStorage.put("com.tencent.liteav.key_dev_uuid", r13);
                            persistStorage.commit();
                        }
                        return r13;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (Exception unused4) {
                        }
                    }
                    throw th;
                }
            } catch (Exception e14) {
                e = e14;
                fileOutputStream = null;
            } catch (Throwable th5) {
                th = th5;
                fileOutputStream = null;
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                throw th;
            }
            try {
                fileOutputStream.close();
            } catch (Exception unused5) {
            }
        }
        if (string2 != 0 || !string2.equals(r13)) {
            persistStorage.put("com.tencent.liteav.key_dev_uuid", r13);
            persistStorage.commit();
        }
        return r13;
    }

    /* JADX INFO: renamed from: b */
    private static String m76074b(String str) {
        if (str == null) {
            return "";
        }
        try {
            byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(str.getBytes("UTF-8"));
            char[] cArr = new char[bArrDigest.length << 1];
            int i11 = 0;
            for (byte b11 : bArrDigest) {
                int i12 = i11 + 1;
                char[] cArr2 = f73511a;
                cArr[i11] = cArr2[(b11 & 240) >>> 4];
                i11 += 2;
                cArr[i12] = cArr2[b11 & 15];
            }
            return new String(cArr);
        } catch (Exception e11) {
            Log.m76033e("UUID", "stringToMd5 failed.", e11);
            return "";
        }
    }
}
