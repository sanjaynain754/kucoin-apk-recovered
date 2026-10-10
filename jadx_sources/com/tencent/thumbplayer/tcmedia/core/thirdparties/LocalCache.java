package com.tencent.thumbplayer.tcmedia.core.thirdparties;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Process;
import com.tencent.bugly.proguard.C33820nf;
import com.tencent.thumbplayer.tcmedia.core.utils.TPThreadPool;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
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
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes64.dex */
public class LocalCache {
    private static final int MAX_COUNT = Integer.MAX_VALUE;
    private static final int MAX_SIZE = 50000000;
    public static final int TIME_DAY = 86400;
    public static final int TIME_HOUR = 3600;
    private static Map<String, LocalCache> mInstanceMap = new HashMap();
    private ACacheManager mCache;

    public class ACacheManager {
        private final AtomicInteger cacheCount;
        protected File cacheDir;
        private final AtomicLong cacheSize;
        private final int countLimit;
        private final Map<File, Long> lastUsageDates;
        private final long sizeLimit;

        private ACacheManager(File file, long j11, int i11) {
            this.lastUsageDates = Collections.synchronizedMap(new HashMap());
            this.cacheDir = file;
            this.sizeLimit = j11;
            this.countLimit = i11;
            this.cacheSize = new AtomicLong();
            this.cacheCount = new AtomicInteger();
            calculateCacheSizeAndCacheCount();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long calculateSize(File file) {
            if (file == null) {
                return 0L;
            }
            return file.length();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clear() {
            this.lastUsageDates.clear();
            this.cacheSize.set(0L);
            File[] fileArrListFiles = this.cacheDir.listFiles();
            if (fileArrListFiles != null) {
                for (File file : fileArrListFiles) {
                    file.delete();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public File newFile(String str) {
            File file = this.cacheDir;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str.hashCode());
            return new File(file, sb2.toString());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void put(File file) {
            int iAddAndGet = this.cacheCount.get();
            while (iAddAndGet + 1 > this.countLimit) {
                this.cacheSize.addAndGet(-removeNext());
                iAddAndGet = this.cacheCount.addAndGet(-1);
            }
            this.cacheCount.addAndGet(1);
            long jCalculateSize = calculateSize(file);
            long jAddAndGet = this.cacheSize.get();
            while (jAddAndGet + jCalculateSize > this.sizeLimit) {
                jAddAndGet = this.cacheSize.addAndGet(-removeNext());
            }
            this.cacheSize.addAndGet(jCalculateSize);
            long jCurrentTimeMillis = System.currentTimeMillis();
            Long lValueOf = Long.valueOf(jCurrentTimeMillis);
            file.setLastModified(jCurrentTimeMillis);
            this.lastUsageDates.put(file, lValueOf);
        }

        private long removeNext() {
            File key;
            if (this.lastUsageDates.isEmpty()) {
                return 0L;
            }
            Set<Map.Entry<File, Long>> setEntrySet = this.lastUsageDates.entrySet();
            synchronized (this.lastUsageDates) {
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
            long jCalculateSize = calculateSize(key);
            if (key.delete()) {
                this.lastUsageDates.remove(key);
            }
            return jCalculateSize;
        }

        private void calculateCacheSizeAndCacheCount() {
            TPThreadPool.getInstance().obtainThreadExecutor().execute(new Runnable() { // from class: com.tencent.thumbplayer.tcmedia.core.thirdparties.LocalCache.ACacheManager.1
                @Override // java.lang.Runnable
                public void run() {
                    File[] fileArrListFiles = ACacheManager.this.cacheDir.listFiles();
                    if (fileArrListFiles != null) {
                        int iCalculateSize = 0;
                        int i11 = 0;
                        for (File file : fileArrListFiles) {
                            iCalculateSize = (int) (((long) iCalculateSize) + ACacheManager.this.calculateSize(file));
                            i11++;
                            ACacheManager.this.lastUsageDates.put(file, Long.valueOf(file.lastModified()));
                        }
                        ACacheManager.this.cacheSize.set(iCalculateSize);
                        ACacheManager.this.cacheCount.set(i11);
                    }
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public File get(String str) {
            File fileNewFile = newFile(str);
            long jCurrentTimeMillis = System.currentTimeMillis();
            Long lValueOf = Long.valueOf(jCurrentTimeMillis);
            fileNewFile.setLastModified(jCurrentTimeMillis);
            this.lastUsageDates.put(fileNewFile, lValueOf);
            return fileNewFile;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean remove(String str) {
            return get(str).delete();
        }
    }

    public static class Utils {
        private static final char mSeparator = ' ';

        /* JADX INFO: Access modifiers changed from: private */
        public static Bitmap Bytes2Bimap(byte[] bArr) {
            int length = bArr.length;
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static String clearDateInfo(String str) {
            return (str == null || !hasDateInfo(str.getBytes())) ? str : str.substring(str.indexOf(32) + 1, str.length());
        }

        private static int indexOf(byte[] bArr, char c11) {
            for (int i11 = 0; i11 < bArr.length; i11++) {
                if (bArr[i11] == c11) {
                    return i11;
                }
            }
            return -1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isDue(String str) {
            return isDue(str.getBytes());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static byte[] Bitmap2Bytes(Bitmap bitmap) {
            if (bitmap == null) {
                return null;
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Drawable bitmap2Drawable(Bitmap bitmap) {
            if (bitmap == null) {
                return null;
            }
            return new BitmapDrawable(bitmap);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static byte[] clearDateInfo(byte[] bArr) {
            return hasDateInfo(bArr) ? copyOfRange(bArr, indexOf(bArr, mSeparator) + 1, bArr.length) : bArr;
        }

        private static byte[] copyOfRange(byte[] bArr, int i11, int i12) {
            int i13 = i12 - i11;
            if (i13 >= 0) {
                byte[] bArr2 = new byte[i13];
                System.arraycopy(bArr, i11, bArr2, 0, Math.min(bArr.length - i11, i13));
                return bArr2;
            }
            throw new IllegalArgumentException(i11 + " > " + i12);
        }

        private static String createDateInfo(int i11) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(System.currentTimeMillis());
            String string = sb2.toString();
            while (string.length() < 13) {
                string = "0".concat(string);
            }
            return string + C33820nf.f71144W + i11 + mSeparator;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Bitmap drawable2Bitmap(Drawable drawable) {
            if (drawable == null) {
                return null;
            }
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, drawable.getOpacity() != -1 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            drawable.draw(canvas);
            return bitmapCreateBitmap;
        }

        private static boolean hasDateInfo(byte[] bArr) {
            return bArr != null && bArr.length > 15 && bArr[13] == 45 && indexOf(bArr, mSeparator) > 14;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isDue(byte[] bArr) {
            String[] dateInfoFromDate = getDateInfoFromDate(bArr);
            if (dateInfoFromDate != null && dateInfoFromDate.length == 2) {
                String strSubstring = dateInfoFromDate[0];
                while (strSubstring.startsWith("0")) {
                    strSubstring = strSubstring.substring(1, strSubstring.length());
                }
                try {
                    if (System.currentTimeMillis() > Long.valueOf(strSubstring).longValue() + (Long.valueOf(dateInfoFromDate[1]).longValue() * 1000)) {
                        return true;
                    }
                } catch (Exception unused) {
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static String newStringWithDateInfo(int i11, String str) {
            return createDateInfo(i11) + str;
        }

        private Utils() {
        }

        private static String[] getDateInfoFromDate(byte[] bArr) {
            if (hasDateInfo(bArr)) {
                return new String[]{new String(copyOfRange(bArr, 0, 13)), new String(copyOfRange(bArr, 14, indexOf(bArr, mSeparator)))};
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static byte[] newByteArrayWithDateInfo(int i11, byte[] bArr) {
            byte[] bytes = createDateInfo(i11).getBytes();
            byte[] bArr2 = new byte[bytes.length + bArr.length];
            System.arraycopy(bytes, 0, bArr2, 0, bytes.length);
            System.arraycopy(bArr, 0, bArr2, bytes.length, bArr.length);
            return bArr2;
        }
    }

    public static LocalCache get(Context context) {
        return get(context, "LocalCache");
    }

    public void put(String str, Bitmap bitmap) throws Throwable {
        put(str, Utils.Bitmap2Bytes(bitmap));
    }

    public static LocalCache get(Context context, long j11, int i11) {
        return get(new File(context.getCacheDir(), "LocalCache"), j11, i11);
    }

    private static String myPid() {
        return "_" + Process.myPid();
    }

    public void clear() {
        ACacheManager aCacheManager = this.mCache;
        if (aCacheManager == null) {
            return;
        }
        aCacheManager.clear();
    }

    public File file(String str) {
        ACacheManager aCacheManager = this.mCache;
        if (aCacheManager == null) {
            return null;
        }
        File fileNewFile = aCacheManager.newFile(str);
        if (fileNewFile.exists()) {
            return fileNewFile;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:60:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public byte[] getAsBinary(String str) throws Throwable {
        RandomAccessFile randomAccessFile;
        ACacheManager aCacheManager = this.mCache;
        RandomAccessFile randomAccessFile2 = null;
        if (aCacheManager == null) {
            return null;
        }
        try {
            File file = aCacheManager.get(str);
            if (!file.exists()) {
                return null;
            }
            randomAccessFile = new RandomAccessFile(file, "r");
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
                    if (Utils.isDue(bArr)) {
                        try {
                            randomAccessFile.close();
                        } catch (IOException e12) {
                            e12.printStackTrace();
                        }
                        remove(str);
                        return null;
                    }
                    byte[] bArrClearDateInfo = Utils.clearDateInfo(bArr);
                    try {
                        randomAccessFile.close();
                        return bArrClearDateInfo;
                    } catch (IOException e13) {
                        e13.printStackTrace();
                        return bArrClearDateInfo;
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    public String getAsString(String str) throws Throwable {
        BufferedReader bufferedReader;
        ACacheManager aCacheManager = this.mCache;
        ?? r11 = 0;
        if (aCacheManager == null) {
            return null;
        }
        File file = aCacheManager.get(str);
        ?? Exists = file.exists();
        try {
            if (Exists == 0) {
                return null;
            }
            try {
                bufferedReader = new BufferedReader(new FileReader(file));
                String str2 = "";
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        str2 = str2 + line;
                    } catch (IOException e11) {
                        e = e11;
                        e.printStackTrace();
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e12) {
                                e12.printStackTrace();
                            }
                        }
                        return null;
                    }
                }
                if (Utils.isDue(str2)) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e13) {
                        e13.printStackTrace();
                    }
                    remove(str);
                    return null;
                }
                String strClearDateInfo = Utils.clearDateInfo(str2);
                try {
                    bufferedReader.close();
                    return strClearDateInfo;
                } catch (IOException e14) {
                    e14.printStackTrace();
                    return strClearDateInfo;
                }
            } catch (IOException e15) {
                e = e15;
                bufferedReader = null;
            } catch (Throwable th2) {
                th = th2;
                if (r11 != 0) {
                    try {
                        r11.close();
                    } catch (IOException e16) {
                        e16.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            r11 = Exists;
        }
    }

    public void put(String str, Bitmap bitmap, int i11) throws Throwable {
        put(str, Utils.Bitmap2Bytes(bitmap), i11);
    }

    public boolean remove(String str) {
        ACacheManager aCacheManager = this.mCache;
        if (aCacheManager == null) {
            return false;
        }
        return aCacheManager.remove(str);
    }

    private LocalCache(File file, long j11, int i11) {
        if (!file.exists() && !file.mkdirs()) {
            this.mCache = null;
        } else {
            this.mCache = new ACacheManager(file, j11, i11);
        }
    }

    public static LocalCache get(Context context, String str) {
        return get(new File(context.getCacheDir(), str), 50000000L, Integer.MAX_VALUE);
    }

    public Bitmap getAsBitmap(String str) {
        if (getAsBinary(str) != null) {
            return Utils.Bytes2Bimap(getAsBinary(str));
        }
        return null;
    }

    public Drawable getAsDrawable(String str) {
        if (getAsBinary(str) != null) {
            return Utils.bitmap2Drawable(Utils.Bytes2Bimap(getAsBinary(str)));
        }
        return null;
    }

    public JSONArray getAsJSONArray(String str) {
        try {
            return new JSONArray(getAsString(str));
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    public JSONObject getAsJSONObject(String str) {
        try {
            return new JSONObject(getAsString(str));
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.io.ObjectInputStream] */
    /* JADX WARN: Type inference failed for: r5v5 */
    public Object getAsObject(String str) throws Throwable {
        ByteArrayInputStream byteArrayInputStream;
        ObjectInputStream objectInputStream;
        ?? asBinary = getAsBinary(str);
        try {
            if (asBinary == 0) {
                return null;
            }
            try {
                byteArrayInputStream = new ByteArrayInputStream(asBinary);
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
                    asBinary = 0;
                    if (byteArrayInputStream != null) {
                        try {
                            byteArrayInputStream.close();
                        } catch (IOException e17) {
                            e17.printStackTrace();
                        }
                    }
                    if (asBinary != 0) {
                        try {
                            asBinary.close();
                            throw th;
                        } catch (IOException e18) {
                            e18.printStackTrace();
                            throw th;
                        }
                    }
                    throw th;
                }
            } catch (Exception e19) {
                e = e19;
                objectInputStream = null;
                byteArrayInputStream = null;
            } catch (Throwable th3) {
                byteArrayInputStream = null;
                th = th3;
                asBinary = 0;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public void put(String str, Drawable drawable) throws Throwable {
        put(str, Utils.drawable2Bitmap(drawable));
    }

    public static LocalCache get(File file) {
        return get(file, 50000000L, Integer.MAX_VALUE);
    }

    public void put(String str, Drawable drawable, int i11) throws Throwable {
        put(str, Utils.drawable2Bitmap(drawable), i11);
    }

    public static LocalCache get(File file, long j11, int i11) {
        LocalCache localCache;
        try {
            localCache = mInstanceMap.get(file.getAbsoluteFile() + myPid());
        } catch (Exception unused) {
            localCache = null;
        }
        if (localCache != null) {
            return localCache;
        }
        try {
            LocalCache localCache2 = new LocalCache(file, j11, i11);
            try {
                mInstanceMap.put(file.getAbsolutePath() + myPid(), localCache2);
            } catch (Throwable unused2) {
            }
            return localCache2;
        } catch (Throwable unused3) {
            return localCache;
        }
    }

    public void put(String str, Serializable serializable) {
        put(str, serializable, -1);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x002f A[Catch: all -> 0x003b, PHI: r0
      0x002f: PHI (r0v4 java.io.ObjectOutputStream) = (r0v2 java.io.ObjectOutputStream), (r0v5 java.io.ObjectOutputStream) binds: [B:19:0x002d, B:25:0x0038] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #6 {all -> 0x003b, blocks: (B:12:0x0022, B:20:0x002f), top: B:39:0x0001 }] */
    public void put(String str, Serializable serializable, int i11) {
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
                            put(str, byteArray, i11);
                        } else {
                            put(str, byteArray);
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

    public void put(String str, String str2) throws Throwable {
        ACacheManager aCacheManager = this.mCache;
        if (aCacheManager == null) {
            return;
        }
        File fileNewFile = aCacheManager.newFile(str);
        BufferedWriter bufferedWriter = null;
        try {
            try {
                BufferedWriter bufferedWriter2 = new BufferedWriter(new FileWriter(fileNewFile), 1024);
                try {
                    bufferedWriter2.write(str2);
                    try {
                        bufferedWriter2.flush();
                    } catch (IOException e11) {
                        e11.printStackTrace();
                    }
                    try {
                        bufferedWriter2.close();
                    } catch (IOException e12) {
                        e = e12;
                        e.printStackTrace();
                    }
                } catch (IOException e13) {
                    e = e13;
                    bufferedWriter = bufferedWriter2;
                    e.printStackTrace();
                    if (bufferedWriter != null) {
                        try {
                            bufferedWriter.flush();
                        } catch (IOException e14) {
                            e14.printStackTrace();
                        }
                        try {
                            bufferedWriter.close();
                        } catch (IOException e15) {
                            e = e15;
                            e.printStackTrace();
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bufferedWriter = bufferedWriter2;
                    if (bufferedWriter != null) {
                        try {
                            bufferedWriter.flush();
                        } catch (IOException e16) {
                            e16.printStackTrace();
                        }
                        try {
                            bufferedWriter.close();
                        } catch (IOException e17) {
                            e17.printStackTrace();
                        }
                    }
                    this.mCache.put(fileNewFile);
                    throw th;
                }
            } catch (IOException e18) {
                e = e18;
            }
            this.mCache.put(fileNewFile);
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public void put(String str, String str2, int i11) throws Throwable {
        put(str, Utils.newStringWithDateInfo(i11, str2));
    }

    public void put(String str, JSONArray jSONArray) throws Throwable {
        put(str, jSONArray.toString());
    }

    public void put(String str, JSONArray jSONArray, int i11) throws Throwable {
        put(str, jSONArray.toString(), i11);
    }

    public void put(String str, JSONObject jSONObject) throws Throwable {
        put(str, jSONObject.toString());
    }

    public void put(String str, JSONObject jSONObject, int i11) throws Throwable {
        put(str, jSONObject.toString(), i11);
    }

    public void put(String str, byte[] bArr) throws Throwable {
        ACacheManager aCacheManager = this.mCache;
        if (aCacheManager == null) {
            return;
        }
        File fileNewFile = aCacheManager.newFile(str);
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(fileNewFile);
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
                    this.mCache.put(fileNewFile);
                    throw th;
                }
            } catch (Exception e15) {
                e = e15;
            }
            this.mCache.put(fileNewFile);
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public void put(String str, byte[] bArr, int i11) throws Throwable {
        put(str, Utils.newByteArrayWithDateInfo(i11, bArr));
    }
}
