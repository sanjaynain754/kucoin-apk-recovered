package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import androidx.collection.SimpleArrayMap;
import com.google.common.base.Optional;
import com.tencent.bugly.proguard.C33627eb;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzjy {
    private static volatile Optional zza;

    /* JADX WARN: Code duplicated, block: B:20:0x0038 A[Catch: all -> 0x0023, TryCatch #2 {all -> 0x0023, blocks: (B:6:0x0007, B:8:0x000b, B:10:0x0019, B:20:0x0038, B:76:0x0181, B:15:0x0026, B:17:0x002e, B:21:0x003e, B:23:0x0044, B:25:0x004a, B:27:0x0052, B:75:0x017e, B:77:0x0184, B:78:0x0187, B:79:0x0188, B:28:0x0056, B:30:0x005a, B:31:0x0067, B:33:0x006d, B:39:0x0086, B:41:0x008c, B:42:0x0098, B:62:0x0161, B:63:0x0164, B:71:0x0173, B:70:0x0170, B:72:0x0174, B:73:0x0179, B:74:0x017a, B:36:0x0075, B:38:0x007b), top: B:86:0x0007, inners: #1 }] */
    public static Optional zza(Context context) {
        Optional optionalAbsent;
        Optional optionalAbsent2;
        Optional optional = zza;
        if (optional != null) {
            return optional;
        }
        synchronized (zzjy.class) {
            try {
                optionalAbsent = zza;
                if (optionalAbsent == null) {
                    String str = Build.TYPE;
                    String str2 = Build.TAGS;
                    int i11 = zzka.zza;
                    if (!str.equals("eng") && !str.equals("userdebug")) {
                        optionalAbsent = Optional.absent();
                    } else if (str2.contains("dev-keys") || str2.contains("test-keys")) {
                        Context contextCreateDeviceProtectedStorageContext = (!zzjm.zza() || context.isDeviceProtectedStorage()) ? context : context.createDeviceProtectedStorageContext();
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            StrictMode.allowThreadDiskWrites();
                            char c11 = 0;
                            try {
                                File file = new File(contextCreateDeviceProtectedStorageContext.getDir("phenotype_hermetic", 0), "overrides.txt");
                                optionalAbsent2 = file.exists() ? Optional.m13374of(file) : Optional.absent();
                            } catch (RuntimeException e11) {
                                Log.e("HermeticFileOverrides", "no data dir", e11);
                                optionalAbsent2 = Optional.absent();
                            }
                            if (optionalAbsent2.isPresent()) {
                                File file2 = (File) optionalAbsent2.get();
                                try {
                                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2)));
                                    try {
                                        SimpleArrayMap simpleArrayMap = new SimpleArrayMap();
                                        HashMap map = new HashMap();
                                        while (true) {
                                            String line = bufferedReader.readLine();
                                            if (line == null) {
                                                break;
                                            }
                                            String[] strArrSplit = line.split(C33627eb.f69716f, 3);
                                            if (strArrSplit.length != 3) {
                                                StringBuilder sb2 = new StringBuilder(line.length() + 9);
                                                sb2.append("Invalid: ");
                                                sb2.append(line);
                                                Log.e("HermeticFileOverrides", sb2.toString());
                                            } else {
                                                String str3 = new String(strArrSplit[c11]);
                                                String strDecode = Uri.decode(new String(strArrSplit[1]));
                                                String strDecode2 = (String) map.get(strArrSplit[2]);
                                                if (strDecode2 == null) {
                                                    String str4 = new String(strArrSplit[2]);
                                                    strDecode2 = Uri.decode(str4);
                                                    if (strDecode2.length() < 1024 || strDecode2 == str4) {
                                                        map.put(str4, strDecode2);
                                                    }
                                                }
                                                SimpleArrayMap simpleArrayMap2 = (SimpleArrayMap) simpleArrayMap.get(str3);
                                                if (simpleArrayMap2 == null) {
                                                    simpleArrayMap2 = new SimpleArrayMap();
                                                    simpleArrayMap.put(str3, simpleArrayMap2);
                                                }
                                                simpleArrayMap2.put(strDecode, strDecode2);
                                                c11 = 0;
                                            }
                                        }
                                        String string = file2.toString();
                                        String packageName = contextCreateDeviceProtectedStorageContext.getPackageName();
                                        StringBuilder sb3 = new StringBuilder(string.length() + 28 + String.valueOf(packageName).length());
                                        sb3.append("Parsed ");
                                        sb3.append(string);
                                        sb3.append(" for Android package ");
                                        sb3.append(packageName);
                                        Log.w("HermeticFileOverrides", sb3.toString());
                                        zzjs zzjsVar = new zzjs(simpleArrayMap);
                                        bufferedReader.close();
                                        optionalAbsent = Optional.m13374of(zzjsVar);
                                    } catch (Throwable th2) {
                                        try {
                                            bufferedReader.close();
                                            throw th2;
                                        } catch (Throwable th3) {
                                            th2.addSuppressed(th3);
                                            throw th2;
                                        }
                                    }
                                } catch (IOException e12) {
                                    throw new RuntimeException(e12);
                                }
                            } else {
                                optionalAbsent = Optional.absent();
                            }
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        } catch (Throwable th4) {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            throw th4;
                        }
                    } else {
                        optionalAbsent = Optional.absent();
                    }
                    zza = optionalAbsent;
                }
            } catch (Throwable th5) {
                throw th5;
            }
        }
        return optionalAbsent;
    }

    private zzjy() {
    }
}
