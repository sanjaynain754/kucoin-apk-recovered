package com.tencent.thumbplayer.tcmedia.utils;

import android.content.Context;
import android.os.Process;
import com.tencent.bugly.proguard.C33820nf;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.utils.a */
/* JADX INFO: loaded from: classes64.dex */
public class C35421a {

    /* JADX INFO: renamed from: a */
    private static Map<String, C35421a> f76566a = new HashMap();

    /* JADX INFO: renamed from: b */
    private a f76567b;

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.utils.a$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        protected File f76568a;

        /* JADX INFO: renamed from: b */
        private final AtomicLong f76569b;

        /* JADX INFO: renamed from: c */
        private final AtomicInteger f76570c;

        /* JADX INFO: renamed from: d */
        private final long f76571d;

        /* JADX INFO: renamed from: e */
        private final int f76572e;

        /* JADX INFO: renamed from: f */
        private final Map<File, Long> f76573f;

        private a(File file, long j11, int i11) {
            this.f76573f = Collections.synchronizedMap(new HashMap());
            this.f76568a = file;
            this.f76571d = j11;
            this.f76572e = i11;
            this.f76569b = new AtomicLong();
            this.f76570c = new AtomicInteger();
            m78816a();
        }

        /* JADX INFO: renamed from: c */
        private long m78826c() {
            File key;
            if (this.f76573f.isEmpty()) {
                return 0L;
            }
            Set<Map.Entry<File, Long>> setEntrySet = this.f76573f.entrySet();
            synchronized (this.f76573f) {
                try {
                    key = null;
                    Long value = null;
                    for (Map.Entry<File, Long> entry : setEntrySet) {
                        if (key == null) {
                            key = entry.getKey();
                            value = entry.getValue();
                        } else {
                            Long value2 = entry.getValue();
                            if (value2.longValue() < value.longValue()) {
                                key = entry.getKey();
                                value = value2;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (key == null) {
                return 0L;
            }
            long jM78821b = m78821b(key);
            if (key.delete()) {
                this.f76573f.remove(key);
            }
            return jM78821b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a */
        public File m78815a(String str) {
            File fileM78823b = m78823b(str);
            long jCurrentTimeMillis = System.currentTimeMillis();
            Long lValueOf = Long.valueOf(jCurrentTimeMillis);
            fileM78823b.setLastModified(jCurrentTimeMillis);
            this.f76573f.put(fileM78823b, lValueOf);
            return fileM78823b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public long m78821b(File file) {
            if (file == null) {
                return 0L;
            }
            return file.length();
        }

        /* JADX INFO: renamed from: a */
        private void m78816a() {
            C35435o.m78917a().m78924d().execute(new Runnable() { // from class: com.tencent.thumbplayer.tcmedia.utils.a.a.1
                @Override // java.lang.Runnable
                public void run() {
                    File[] fileArrListFiles = a.this.f76568a.listFiles();
                    if (fileArrListFiles != null) {
                        int iM78821b = 0;
                        int i11 = 0;
                        for (File file : fileArrListFiles) {
                            iM78821b = (int) (((long) iM78821b) + a.this.m78821b(file));
                            i11++;
                            a.this.f76573f.put(file, Long.valueOf(file.lastModified()));
                        }
                        a.this.f76569b.set(iM78821b);
                        a.this.f76570c.set(i11);
                    }
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public File m78823b(String str) {
            File file = this.f76568a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str.hashCode());
            return new File(file, sb2.toString());
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: c */
        public boolean m78829c(String str) {
            File fileM78815a = m78815a(str);
            long jM78821b = m78821b(fileM78815a);
            if (!fileM78815a.delete()) {
                return false;
            }
            this.f76570c.addAndGet(-1);
            this.f76569b.addAndGet(-jM78821b);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a */
        public void m78819a(File file) {
            int iAddAndGet = this.f76570c.get();
            while (iAddAndGet + 1 > this.f76572e) {
                this.f76569b.addAndGet(-m78826c());
                iAddAndGet = this.f76570c.addAndGet(-1);
            }
            this.f76570c.addAndGet(1);
            long jM78821b = m78821b(file);
            long jAddAndGet = this.f76569b.get();
            while (jAddAndGet + jM78821b > this.f76571d) {
                jAddAndGet = this.f76569b.addAndGet(-m78826c());
            }
            this.f76569b.addAndGet(jM78821b);
            long jCurrentTimeMillis = System.currentTimeMillis();
            Long lValueOf = Long.valueOf(jCurrentTimeMillis);
            file.setLastModified(jCurrentTimeMillis);
            this.f76573f.put(file, lValueOf);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public void m78825b() {
            this.f76573f.clear();
            this.f76569b.set(0L);
            this.f76570c.set(0);
            File[] fileArrListFiles = this.f76568a.listFiles();
            if (fileArrListFiles != null) {
                for (File file : fileArrListFiles) {
                    file.delete();
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.utils.a$b */
    public static class b {
        /* JADX INFO: renamed from: a */
        private static int m78831a(byte[] bArr, char c11) {
            for (int i11 = 0; i11 < bArr.length; i11++) {
                if (bArr[i11] == c11) {
                    return i11;
                }
            }
            return -1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public static byte[] m78836b(int i11, byte[] bArr) {
            byte[] bytes = m78832a(i11).getBytes();
            byte[] bArr2 = new byte[bytes.length + bArr.length];
            System.arraycopy(bytes, 0, bArr2, 0, bytes.length);
            System.arraycopy(bArr, 0, bArr2, bytes.length, bArr.length);
            return bArr2;
        }

        /* JADX INFO: renamed from: a */
        private static String m78832a(int i11) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(System.currentTimeMillis());
            String string = sb2.toString();
            while (string.length() < 13) {
                string = "0".concat(string);
            }
            return string + C33820nf.f71144W + i11 + ' ';
        }

        /* JADX INFO: renamed from: e */
        private static boolean m78840e(byte[] bArr) {
            return bArr != null && bArr.length > 15 && bArr[13] == 45 && m78831a(bArr, ' ') > 14;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: c */
        public static boolean m78838c(byte[] bArr) {
            String[] strArrM78841f = m78841f(bArr);
            if (strArrM78841f != null && strArrM78841f.length == 2) {
                String strSubstring = strArrM78841f[0];
                while (strSubstring.startsWith("0")) {
                    strSubstring = strSubstring.substring(1, strSubstring.length());
                }
                try {
                    if (System.currentTimeMillis() > Long.valueOf(strSubstring).longValue() + (Long.valueOf(strArrM78841f[1]).longValue() * 1000)) {
                        return true;
                    }
                } catch (Exception unused) {
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: d */
        public static byte[] m78839d(byte[] bArr) {
            if (m78840e(bArr)) {
                return m78835a(bArr, m78831a(bArr, ' ') + 1, bArr.length);
            }
            return bArr;
        }

        /* JADX INFO: renamed from: f */
        private static String[] m78841f(byte[] bArr) {
            if (m78840e(bArr)) {
                return new String[]{new String(m78835a(bArr, 0, 13)), new String(m78835a(bArr, 14, m78831a(bArr, ' ')))};
            }
            return null;
        }

        /* JADX INFO: renamed from: a */
        private static byte[] m78835a(byte[] bArr, int i11, int i12) {
            int i13 = i12 - i11;
            if (i13 >= 0) {
                byte[] bArr2 = new byte[i13];
                System.arraycopy(bArr, i11, bArr2, 0, Math.min(bArr.length - i11, i13));
                return bArr2;
            }
            throw new IllegalArgumentException(i11 + " > " + i12);
        }
    }

    /* JADX INFO: renamed from: a */
    public static C35421a m78803a(Context context, String str) {
        return m78804a(new File(context.getCacheDir(), str), 50000000L, Integer.MAX_VALUE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.io.ObjectInputStream] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX INFO: renamed from: b */
    public Object m78812b(String str) throws Throwable {
        ByteArrayInputStream byteArrayInputStream;
        ObjectInputStream objectInputStream;
        ?? M78811a = m78811a(str);
        try {
            if (M78811a == 0) {
                return null;
            }
            try {
                byteArrayInputStream = new ByteArrayInputStream(M78811a);
                try {
                    objectInputStream = new ObjectInputStream(byteArrayInputStream);
                    try {
                        Object object = objectInputStream.readObject();
                        try {
                            byteArrayInputStream.close();
                        } catch (IOException e11) {
                            e11.printStackTrace();
                        }
                        try {
                            objectInputStream.close();
                        } catch (IOException e12) {
                            e12.printStackTrace();
                        }
                        return object;
                    } catch (Exception e13) {
                        e = e13;
                        e.printStackTrace();
                        if (byteArrayInputStream != null) {
                            try {
                                byteArrayInputStream.close();
                            } catch (IOException e14) {
                                e14.printStackTrace();
                            }
                        }
                        if (objectInputStream != null) {
                            try {
                                objectInputStream.close();
                            } catch (IOException e15) {
                                e15.printStackTrace();
                            }
                        }
                        return null;
                    }
                } catch (Exception e16) {
                    e = e16;
                    objectInputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    M78811a = 0;
                    if (byteArrayInputStream != null) {
                        try {
                            byteArrayInputStream.close();
                        } catch (IOException e17) {
                            e17.printStackTrace();
                        }
                    }
                    if (M78811a == 0) {
                        throw th;
                    }
                    try {
                        M78811a.close();
                        throw th;
                    } catch (IOException e18) {
                        e18.printStackTrace();
                        throw th;
                    }
                }
            } catch (Exception e19) {
                e = e19;
                objectInputStream = null;
                byteArrayInputStream = null;
            } catch (Throwable th3) {
                byteArrayInputStream = null;
                th = th3;
                M78811a = 0;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C35421a m78804a(File file, long j11, int i11) {
        C35421a c35421a;
        try {
            c35421a = f76566a.get(file.getAbsoluteFile() + m78805b());
        } catch (Exception unused) {
            c35421a = null;
        }
        if (c35421a != null) {
            return c35421a;
        }
        try {
            C35421a c35421a2 = new C35421a(file, j11, i11);
            try {
                f76566a.put(file.getAbsolutePath() + m78805b(), c35421a2);
            } catch (Throwable unused2) {
            }
            return c35421a2;
        } catch (Throwable unused3) {
            return c35421a;
        }
    }

    /* JADX INFO: renamed from: b */
    private static String m78805b() {
        return "_" + Process.myPid();
    }

    /* JADX INFO: renamed from: c */
    public boolean m78813c(String str) {
        a aVar = this.f76567b;
        if (aVar == null) {
            return false;
        }
        return aVar.m78829c(str);
    }

    private C35421a(File file, long j11, int i11) {
        if (!file.exists() && !file.mkdirs()) {
            this.f76567b = null;
        } else {
            this.f76567b = new a(file, j11, i11);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m78806a() {
        a aVar = this.f76567b;
        if (aVar == null) {
            return;
        }
        aVar.m78825b();
    }

    /* JADX INFO: renamed from: a */
    public void m78807a(String str, Serializable serializable) {
        m78808a(str, serializable, -1);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x002f A[Catch: all -> 0x003b, PHI: r0
      0x002f: PHI (r0v4 java.io.ObjectOutputStream) = (r0v2 java.io.ObjectOutputStream), (r0v5 java.io.ObjectOutputStream) binds: [B:19:0x002d, B:25:0x0038] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #6 {all -> 0x003b, blocks: (B:12:0x0022, B:20:0x002f), top: B:39:0x0001 }] */
    /* JADX INFO: renamed from: a */
    public void m78808a(String str, Serializable serializable, int i11) {
        ObjectOutputStream objectOutputStream = null;
        try {
            try {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream);
                    try {
                        objectOutputStream2.writeObject(serializable);
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        if (i11 != -1) {
                            m78810a(str, byteArray, i11);
                        } else {
                            m78809a(str, byteArray);
                        }
                        objectOutputStream2.close();
                    } catch (Exception e11) {
                        e = e11;
                        objectOutputStream = objectOutputStream2;
                        e.printStackTrace();
                        if (objectOutputStream != null) {
                            objectOutputStream.close();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        objectOutputStream = objectOutputStream2;
                        th.printStackTrace();
                        if (objectOutputStream != null) {
                            objectOutputStream.close();
                        }
                    }
                } catch (Throwable th3) {
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (Throwable unused) {
                        }
                    }
                    throw th3;
                }
            } catch (Exception e12) {
                e = e12;
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable unused2) {
        }
    }

    /* JADX INFO: renamed from: a */
    public void m78809a(String str, byte[] bArr) throws Throwable {
        a aVar = this.f76567b;
        if (aVar == null) {
            return;
        }
        File fileM78823b = aVar.m78823b(str);
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(fileM78823b);
                try {
                    fileOutputStream2.write(bArr);
                    try {
                        fileOutputStream2.flush();
                        fileOutputStream2.close();
                    } catch (IOException e11) {
                        e = e11;
                        e.printStackTrace();
                    }
                } catch (Exception e12) {
                    e = e12;
                    fileOutputStream = fileOutputStream2;
                    e.printStackTrace();
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.flush();
                            fileOutputStream.close();
                        } catch (IOException e13) {
                            e = e13;
                            e.printStackTrace();
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.flush();
                            fileOutputStream.close();
                        } catch (IOException e14) {
                            e14.printStackTrace();
                        }
                    }
                    this.f76567b.m78819a(fileM78823b);
                    throw th;
                }
            } catch (Exception e15) {
                e = e15;
            }
            this.f76567b.m78819a(fileM78823b);
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m78810a(String str, byte[] bArr, int i11) throws Throwable {
        m78809a(str, b.m78836b(i11, bArr));
    }

    /* JADX WARN: Code duplicated, block: B:60:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public byte[] m78811a(String str) throws Throwable {
        RandomAccessFile randomAccessFile;
        a aVar = this.f76567b;
        RandomAccessFile randomAccessFile2 = null;
        if (aVar == null) {
            return null;
        }
        try {
            File fileM78815a = aVar.m78815a(str);
            if (!fileM78815a.exists()) {
                return null;
            }
            randomAccessFile = new RandomAccessFile(fileM78815a, "r");
            try {
                try {
                    byte[] bArr = new byte[(int) randomAccessFile.length()];
                    if (randomAccessFile.read(bArr) <= 0) {
                        try {
                            randomAccessFile.close();
                        } catch (IOException e11) {
                            e11.printStackTrace();
                        }
                        return null;
                    }
                    if (b.m78838c(bArr)) {
                        try {
                            randomAccessFile.close();
                        } catch (IOException e12) {
                            e12.printStackTrace();
                        }
                        m78813c(str);
                        return null;
                    }
                    byte[] bArrM78839d = b.m78839d(bArr);
                    try {
                        randomAccessFile.close();
                        return bArrM78839d;
                    } catch (IOException e13) {
                        e13.printStackTrace();
                        return bArrM78839d;
                    }
                } catch (Exception e14) {
                    e = e14;
                    e.printStackTrace();
                    if (randomAccessFile != null) {
                        try {
                            randomAccessFile.close();
                        } catch (IOException e15) {
                            e15.printStackTrace();
                        }
                    }
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                randomAccessFile2 = randomAccessFile;
            }
            th = th2;
            randomAccessFile2 = randomAccessFile;
            if (randomAccessFile2 != null) {
                try {
                    randomAccessFile2.close();
                } catch (IOException e16) {
                    e16.printStackTrace();
                }
            }
            throw th;
        } catch (Exception e17) {
            e = e17;
            randomAccessFile = null;
        } catch (Throwable th3) {
            th = th3;
        }
        e.printStackTrace();
        if (randomAccessFile != null) {
            randomAccessFile.close();
        }
        return null;
    }
}
