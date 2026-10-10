package com.tencent.mmkv;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tencent.bugly.proguard.C33844oi;
import dalvik.annotation.optimization.FastNative;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes23.dex */
public class MMKV implements SharedPreferences, SharedPreferences.Editor {
    private static final int ASHMEM_MODE = 8;
    private static final int BACKUP_MODE = 16;
    private static final int CONTEXT_MODE_MULTI_PROCESS = 4;
    public static final int ExpireInDay = 86400;
    public static final int ExpireInHour = 3600;
    public static final int ExpireInMinute = 60;
    public static final int ExpireInMonth = 2592000;
    public static final int ExpireInYear = 946080000;
    public static final int ExpireNever = 0;
    public static final int MULTI_PROCESS_MODE = 2;
    public static final int SINGLE_PROCESS_MODE = 1;
    private static final Set<Long> checkedHandleSet;
    private static MMKVHandler gCallbackHandler;
    private static MMKVContentChangeNotification gContentChangeNotify;
    private static boolean gWantLogReDirecting;
    private static final MMKVLogLevel[] index2LogLevel;
    private static boolean isProcessModeCheckerEnabled;
    private static final EnumMap<MMKVLogLevel, Integer> logLevel2Index;
    private static final HashMap<String, Parcelable.Creator<?>> mCreators;
    private static final EnumMap<MMKVRecoverStrategic, Integer> recoverIndex;
    private static String rootDir;
    private final long nativeHandle;

    public interface LibLoader {
        void loadLibrary(String str);
    }

    private native long actualSize(long j11);

    private native String[] allKeys(long j11, boolean z11);

    public static native long backupAllToDirectory(String str);

    public static native boolean backupOneToDirectory(String str, String str2, @Nullable String str3);

    @NonNull
    private static MMKV checkProcessMode(long j11, String str, int i11) throws RuntimeException {
        String str2;
        if (j11 == 0) {
            throw new RuntimeException("Fail to create an MMKV instance [" + str + "] in JNI");
        }
        if (!isProcessModeCheckerEnabled) {
            return new MMKV(j11);
        }
        Set<Long> set = checkedHandleSet;
        synchronized (set) {
            try {
                if (!set.contains(Long.valueOf(j11))) {
                    if (!checkProcessMode(j11)) {
                        if (i11 == 1) {
                            str2 = "Opening a multi-process MMKV instance [" + str + "] with SINGLE_PROCESS_MODE!";
                        } else {
                            str2 = ("Opening an MMKV instance [" + str + "] with MULTI_PROCESS_MODE, ") + "while it's already been opened with SINGLE_PROCESS_MODE by someone somewhere else!";
                        }
                        throw new IllegalArgumentException(str2);
                    }
                    set.add(Long.valueOf(j11));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return new MMKV(j11);
    }

    private static native boolean checkProcessMode(long j11);

    private native boolean containsKey(long j11, String str);

    private native long count(long j11, boolean z11);

    private static native long createNB(int i11);

    private native boolean decodeBool(long j11, String str, boolean z11);

    @Nullable
    private native byte[] decodeBytes(long j11, String str);

    private native double decodeDouble(long j11, String str, double d11);

    private native float decodeFloat(long j11, String str, float f11);

    private native int decodeInt(long j11, String str, int i11);

    private native long decodeLong(long j11, String str, long j12);

    @Nullable
    private native String decodeString(long j11, String str, @Nullable String str2);

    @Nullable
    private native String[] decodeStringSet(long j11, String str);

    @NonNull
    public static MMKV defaultMMKV() throws RuntimeException {
        if (rootDir != null) {
            return checkProcessMode(getDefaultMMKV(1, null), "DefaultMMKV", 1);
        }
        throw new IllegalStateException("You should Call MMKV.initialize() first.");
    }

    private static native void destroyNB(long j11, int i11);

    private native boolean encodeBool(long j11, String str, boolean z11);

    private native boolean encodeBool_2(long j11, String str, boolean z11, int i11);

    private native boolean encodeBytes(long j11, String str, @Nullable byte[] bArr);

    private native boolean encodeBytes_2(long j11, String str, @Nullable byte[] bArr, int i11);

    private native boolean encodeDouble(long j11, String str, double d11);

    private native boolean encodeDouble_2(long j11, String str, double d11, int i11);

    private native boolean encodeFloat(long j11, String str, float f11);

    private native boolean encodeFloat_2(long j11, String str, float f11, int i11);

    private native boolean encodeInt(long j11, String str, int i11);

    private native boolean encodeInt_2(long j11, String str, int i11, int i12);

    private native boolean encodeLong(long j11, String str, long j12);

    private native boolean encodeLong_2(long j11, String str, long j12, int i11);

    private native boolean encodeSet(long j11, String str, @Nullable String[] strArr);

    private native boolean encodeSet_2(long j11, String str, @Nullable String[] strArr, int i11);

    private native boolean encodeString(long j11, String str, @Nullable String str2);

    private native boolean encodeString_2(long j11, String str, @Nullable String str2, int i11);

    private static native long getDefaultMMKV(int i11, @Nullable String str);

    private static native long getMMKVWithAshmemFD(String str, int i11, int i12, @Nullable String str2);

    private static native long getMMKVWithID(String str, int i11, @Nullable String str2, @Nullable String str3, long j11);

    private static native long getMMKVWithIDAndSize(String str, int i11, int i12, @Nullable String str2);

    public static String initialize(@NonNull Context context) {
        return initialize(context, context.getFilesDir().getAbsolutePath() + "/mmkv", null, MMKVLogLevel.LevelInfo, null);
    }

    private native boolean isCompareBeforeSetEnabled();

    @FastNative
    private native boolean isEncryptionEnabled();

    @FastNative
    private native boolean isExpirationEnabled();

    public static boolean isFileValid(String str) {
        return isFileValid(str, null);
    }

    public static native boolean isFileValid(String str, @Nullable String str2);

    private static native void jniInitialize(String str, String str2, int i11, boolean z11);

    @NonNull
    public static MMKV mmkvWithID(String str) throws RuntimeException {
        if (rootDir != null) {
            return checkProcessMode(getMMKVWithID(str, 1, null, null, 0L), str, 1);
        }
        throw new IllegalStateException("You should Call MMKV.initialize() first.");
    }

    @FastNative
    private native void nativeEnableCompareBeforeSet();

    public static native void onExit();

    public static native int pageSize();

    public static boolean removeStorage(String str) {
        return removeStorage(str, null);
    }

    public static native boolean removeStorage(String str, @Nullable String str2);

    private native void removeValueForKey(long j11, String str);

    public static native long restoreAllFromDirectory(String str);

    public static native boolean restoreOneMMKVFromDirectory(String str, String str2, @Nullable String str3);

    private static native void setCallbackHandler(boolean z11, boolean z12);

    private static native void setLogLevel(int i11);

    public static void setLogLevel(MMKVLogLevel mMKVLogLevel) {
        setLogLevel(logLevel2Int(mMKVLogLevel));
    }

    private static native void setWantsContentChangeNotify(boolean z11);

    private native void sync(boolean z11);

    private native long totalSize(long j11);

    public static void unregisterContentChangeNotify() {
        gContentChangeNotify = null;
        setWantsContentChangeNotify(false);
    }

    public static void unregisterHandler() {
        gCallbackHandler = null;
        setCallbackHandler(false, false);
        gWantLogReDirecting = false;
    }

    private native int valueSize(long j11, String str, boolean z11);

    public static native String version();

    private native int writeValueToNB(long j11, String str, long j12, int i11);

    public long actualSize() {
        return actualSize(this.nativeHandle);
    }

    @Nullable
    public String[] allKeys() {
        return allKeys(this.nativeHandle, false);
    }

    @Override // android.content.SharedPreferences.Editor
    @Deprecated
    public void apply() {
        sync(false);
    }

    public native int ashmemFD();

    public native int ashmemMetaFD();

    public void async() {
        sync(false);
    }

    public native void checkContentChangedByOuterProcess();

    public native void checkReSetCryptKey(@Nullable String str);

    public native void clearAll();

    public native void clearAllWithKeepingSpace();

    public native void clearMemoryCache();

    public native void close();

    @Override // android.content.SharedPreferences.Editor
    @Deprecated
    public boolean commit() {
        sync(true);
        return true;
    }

    public boolean containsKey(String str) {
        return containsKey(this.nativeHandle, str);
    }

    public long count() {
        return count(this.nativeHandle, false);
    }

    @Nullable
    public native String cryptKey();

    public boolean decodeBool(String str) {
        return decodeBool(this.nativeHandle, str, false);
    }

    @Nullable
    public byte[] decodeBytes(String str) {
        return decodeBytes(str, (byte[]) null);
    }

    public double decodeDouble(String str) {
        return decodeDouble(this.nativeHandle, str, 0.0d);
    }

    public float decodeFloat(String str) {
        return decodeFloat(this.nativeHandle, str, 0.0f);
    }

    public int decodeInt(String str) {
        return decodeInt(this.nativeHandle, str, 0);
    }

    public long decodeLong(String str) {
        return decodeLong(this.nativeHandle, str, 0L);
    }

    @Nullable
    public <T extends Parcelable> T decodeParcelable(String str, Class<T> cls) {
        return (T) decodeParcelable(str, cls, null);
    }

    @Nullable
    public String decodeString(String str) {
        return decodeString(this.nativeHandle, str, null);
    }

    @Nullable
    public Set<String> decodeStringSet(String str) {
        return decodeStringSet(str, (Set<String>) null);
    }

    public native boolean disableAutoKeyExpire();

    public native void disableCompareBeforeSet();

    public native boolean enableAutoKeyExpire(int i11);

    public boolean encode(String str, boolean z11) {
        return encodeBool(this.nativeHandle, str, z11);
    }

    public native void lock();

    public native String mmapID();

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor putBoolean(String str, boolean z11) {
        encodeBool(this.nativeHandle, str, z11);
        return this;
    }

    public SharedPreferences.Editor putBytes(String str, @Nullable byte[] bArr) {
        encode(str, bArr);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor putFloat(String str, float f11) {
        encodeFloat(this.nativeHandle, str, f11);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor putInt(String str, int i11) {
        encodeInt(this.nativeHandle, str, i11);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor putLong(String str, long j11) {
        encodeLong(this.nativeHandle, str, j11);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor putString(String str, @Nullable String str2) {
        encodeString(this.nativeHandle, str, str2);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor putStringSet(String str, @Nullable Set<String> set) {
        encode(str, set);
        return this;
    }

    public native boolean reKey(@Nullable String str);

    public void removeValueForKey(String str) {
        removeValueForKey(this.nativeHandle, str);
    }

    public native void removeValuesForKeys(String[] strArr);

    public void sync() {
        sync(true);
    }

    public long totalSize() {
        return totalSize(this.nativeHandle);
    }

    public native void trim();

    public native boolean tryLock();

    public native void unlock();

    /* JADX INFO: renamed from: com.tencent.mmkv.MMKV$1 */
    public static /* synthetic */ class C349871 {
        static final /* synthetic */ int[] $SwitchMap$com$tencent$mmkv$MMKVLogLevel;

        static {
            int[] iArr = new int[MMKVLogLevel.values().length];
            $SwitchMap$com$tencent$mmkv$MMKVLogLevel = iArr;
            try {
                iArr[MMKVLogLevel.LevelDebug.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$tencent$mmkv$MMKVLogLevel[MMKVLogLevel.LevelWarning.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$tencent$mmkv$MMKVLogLevel[MMKVLogLevel.LevelError.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$tencent$mmkv$MMKVLogLevel[MMKVLogLevel.LevelNone.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$tencent$mmkv$MMKVLogLevel[MMKVLogLevel.LevelInfo.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    static {
        EnumMap<MMKVRecoverStrategic, Integer> enumMap = new EnumMap<>(MMKVRecoverStrategic.class);
        recoverIndex = enumMap;
        enumMap.put(MMKVRecoverStrategic.OnErrorDiscard, 0);
        enumMap.put(MMKVRecoverStrategic.OnErrorRecover, 1);
        EnumMap<MMKVLogLevel, Integer> enumMap2 = new EnumMap<>(MMKVLogLevel.class);
        logLevel2Index = enumMap2;
        MMKVLogLevel mMKVLogLevel = MMKVLogLevel.LevelDebug;
        enumMap2.put(mMKVLogLevel, 0);
        MMKVLogLevel mMKVLogLevel2 = MMKVLogLevel.LevelInfo;
        enumMap2.put(mMKVLogLevel2, 1);
        MMKVLogLevel mMKVLogLevel3 = MMKVLogLevel.LevelWarning;
        enumMap2.put(mMKVLogLevel3, 2);
        MMKVLogLevel mMKVLogLevel4 = MMKVLogLevel.LevelError;
        enumMap2.put(mMKVLogLevel4, 3);
        MMKVLogLevel mMKVLogLevel5 = MMKVLogLevel.LevelNone;
        enumMap2.put(mMKVLogLevel5, 4);
        index2LogLevel = new MMKVLogLevel[]{mMKVLogLevel, mMKVLogLevel2, mMKVLogLevel3, mMKVLogLevel4, mMKVLogLevel5};
        checkedHandleSet = new HashSet();
        rootDir = null;
        isProcessModeCheckerEnabled = true;
        mCreators = new HashMap<>();
        gWantLogReDirecting = false;
    }

    @NonNull
    public static MMKV backedUpMMKVWithID(String str, int i11, @Nullable String str2, String str3) throws RuntimeException {
        if (rootDir == null) {
            throw new IllegalStateException("You should Call MMKV.initialize() first.");
        }
        int i12 = i11 | 16;
        return checkProcessMode(getMMKVWithID(str, i12, str2, str3, 0L), str, i12);
    }

    public static void destroyNativeBuffer(@NonNull NativeBuffer nativeBuffer) {
        destroyNB(nativeBuffer.pointer, nativeBuffer.size);
    }

    public static void disableProcessModeChecker() {
        synchronized (checkedHandleSet) {
            isProcessModeCheckerEnabled = false;
        }
        Log.i("MMKV", "Disable checkProcessMode()");
    }

    public static void enableProcessModeChecker() {
        synchronized (checkedHandleSet) {
            isProcessModeCheckerEnabled = true;
        }
        Log.i("MMKV", "Enable checkProcessMode()");
    }

    public static String getRootDir() {
        return rootDir;
    }

    private static int logLevel2Int(@NonNull MMKVLogLevel mMKVLogLevel) {
        int i11 = C349871.$SwitchMap$com$tencent$mmkv$MMKVLogLevel[mMKVLogLevel.ordinal()];
        if (i11 == 1) {
            return 0;
        }
        int i12 = 2;
        if (i11 != 2) {
            i12 = 3;
            if (i11 != 3) {
                i12 = 4;
                if (i11 != 4) {
                    return 1;
                }
            }
        }
        return i12;
    }

    private static void mmkvLogImp(int i11, String str, int i12, String str2, String str3) {
        MMKVHandler mMKVHandler = gCallbackHandler;
        if (mMKVHandler != null && gWantLogReDirecting) {
            mMKVHandler.mmkvLog(index2LogLevel[i11], str, i12, str2, str3);
            return;
        }
        int i13 = C349871.$SwitchMap$com$tencent$mmkv$MMKVLogLevel[index2LogLevel[i11].ordinal()];
        if (i13 == 1) {
            Log.d("MMKV", str3);
            return;
        }
        if (i13 == 2) {
            Log.w("MMKV", str3);
        } else if (i13 == 3) {
            Log.e("MMKV", str3);
        } else {
            if (i13 != 5) {
                return;
            }
            Log.i("MMKV", str3);
        }
    }

    @NonNull
    public static MMKV mmkvWithAshmemID(Context context, String str, int i11, int i12, @Nullable String str2) throws RuntimeException {
        MMKV mmkv;
        if (rootDir == null) {
            throw new IllegalStateException("You should Call MMKV.initialize() first.");
        }
        String processNameByPID = MMKVContentProvider.getProcessNameByPID(context, Process.myPid());
        if (processNameByPID == null || processNameByPID.length() == 0) {
            simpleLog(MMKVLogLevel.LevelError, "process name detect fail, try again later");
            throw new IllegalStateException("process name detect fail, try again later");
        }
        if (processNameByPID.contains(C33844oi.f71346o)) {
            Uri uriContentUri = MMKVContentProvider.contentUri(context);
            if (uriContentUri == null) {
                simpleLog(MMKVLogLevel.LevelError, "MMKVContentProvider has invalid authority");
                throw new IllegalStateException("MMKVContentProvider has invalid authority");
            }
            MMKVLogLevel mMKVLogLevel = MMKVLogLevel.LevelInfo;
            simpleLog(mMKVLogLevel, "getting parcelable mmkv in process, Uri = " + uriContentUri);
            Bundle bundle = new Bundle();
            bundle.putInt("KEY_SIZE", i11);
            bundle.putInt("KEY_MODE", i12);
            if (str2 != null) {
                bundle.putString("KEY_CRYPT", str2);
            }
            Bundle bundleCall = context.getContentResolver().call(uriContentUri, "mmkvFromAshmemID", str, bundle);
            if (bundleCall != null) {
                bundleCall.setClassLoader(ParcelableMMKV.class.getClassLoader());
                ParcelableMMKV parcelableMMKV = (ParcelableMMKV) bundleCall.getParcelable("KEY");
                if (parcelableMMKV != null && (mmkv = parcelableMMKV.toMMKV()) != null) {
                    simpleLog(mMKVLogLevel, mmkv.mmapID() + " fd = " + mmkv.ashmemFD() + ", meta fd = " + mmkv.ashmemMetaFD());
                    return mmkv;
                }
            }
        }
        simpleLog(MMKVLogLevel.LevelInfo, "getting mmkv in main process");
        long mMKVWithIDAndSize = getMMKVWithIDAndSize(str, i11, i12 | 8, str2);
        if (mMKVWithIDAndSize != 0) {
            return new MMKV(mMKVWithIDAndSize);
        }
        throw new IllegalStateException("Fail to create an Ashmem MMKV instance [" + str + "]");
    }

    private static void onContentChangedByOuterProcess(String str) {
        MMKVContentChangeNotification mMKVContentChangeNotification = gContentChangeNotify;
        if (mMKVContentChangeNotification != null) {
            mMKVContentChangeNotification.onContentChangedByOuterProcess(str);
        }
    }

    private static int onMMKVCRCCheckFail(String str) {
        MMKVRecoverStrategic mMKVRecoverStrategicOnMMKVCRCCheckFail = MMKVRecoverStrategic.OnErrorDiscard;
        MMKVHandler mMKVHandler = gCallbackHandler;
        if (mMKVHandler != null) {
            mMKVRecoverStrategicOnMMKVCRCCheckFail = mMKVHandler.onMMKVCRCCheckFail(str);
        }
        simpleLog(MMKVLogLevel.LevelInfo, "Recover strategic for " + str + " is " + mMKVRecoverStrategicOnMMKVCRCCheckFail);
        Integer num = recoverIndex.get(mMKVRecoverStrategicOnMMKVCRCCheckFail);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    private static int onMMKVFileLengthError(String str) {
        MMKVRecoverStrategic mMKVRecoverStrategicOnMMKVFileLengthError = MMKVRecoverStrategic.OnErrorDiscard;
        MMKVHandler mMKVHandler = gCallbackHandler;
        if (mMKVHandler != null) {
            mMKVRecoverStrategicOnMMKVFileLengthError = mMKVHandler.onMMKVFileLengthError(str);
        }
        simpleLog(MMKVLogLevel.LevelInfo, "Recover strategic for " + str + " is " + mMKVRecoverStrategicOnMMKVFileLengthError);
        Integer num = recoverIndex.get(mMKVRecoverStrategicOnMMKVFileLengthError);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public static void registerContentChangeNotify(MMKVContentChangeNotification mMKVContentChangeNotification) {
        gContentChangeNotify = mMKVContentChangeNotification;
        setWantsContentChangeNotify(mMKVContentChangeNotification != null);
    }

    public static void registerHandler(MMKVHandler mMKVHandler) {
        gCallbackHandler = mMKVHandler;
        boolean zWantLogRedirecting = mMKVHandler.wantLogRedirecting();
        gWantLogReDirecting = zWantLogRedirecting;
        setCallbackHandler(zWantLogRedirecting, true);
    }

    @Nullable
    public String[] allNonExpireKeys() {
        return allKeys(this.nativeHandle, true);
    }

    public long countNonExpiredKeys() {
        return count(this.nativeHandle, true);
    }

    public boolean decodeBool(String str, boolean z11) {
        return decodeBool(this.nativeHandle, str, z11);
    }

    @Nullable
    public byte[] decodeBytes(String str, @Nullable byte[] bArr) {
        byte[] bArrDecodeBytes = decodeBytes(this.nativeHandle, str);
        return bArrDecodeBytes != null ? bArrDecodeBytes : bArr;
    }

    public double decodeDouble(String str, double d11) {
        return decodeDouble(this.nativeHandle, str, d11);
    }

    public float decodeFloat(String str, float f11) {
        return decodeFloat(this.nativeHandle, str, f11);
    }

    public int decodeInt(String str, int i11) {
        return decodeInt(this.nativeHandle, str, i11);
    }

    public long decodeLong(String str, long j11) {
        return decodeLong(this.nativeHandle, str, j11);
    }

    @Nullable
    public <T extends Parcelable> T decodeParcelable(String str, Class<T> cls, @Nullable T t11) {
        byte[] bArrDecodeBytes;
        Parcelable.Creator<?> creator;
        if (cls != null && (bArrDecodeBytes = decodeBytes(this.nativeHandle, str)) != null) {
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.unmarshall(bArrDecodeBytes, 0, bArrDecodeBytes.length);
            parcelObtain.setDataPosition(0);
            try {
                try {
                    String string = cls.toString();
                    HashMap<String, Parcelable.Creator<?>> map = mCreators;
                    synchronized (map) {
                        try {
                            creator = map.get(string);
                            if (creator == null && (creator = (Parcelable.Creator) cls.getField("CREATOR").get(null)) != null) {
                                map.put(string, creator);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    if (creator != null) {
                        T t12 = (T) creator.createFromParcel(parcelObtain);
                        parcelObtain.recycle();
                        return t12;
                    }
                    throw new Exception("Parcelable protocol requires a non-null static Parcelable.Creator object called CREATOR on class " + string);
                } catch (Exception e11) {
                    simpleLog(MMKVLogLevel.LevelError, e11.toString());
                    parcelObtain.recycle();
                }
            } catch (Throwable th3) {
                parcelObtain.recycle();
                throw th3;
            }
        }
        return t11;
    }

    @Nullable
    public String decodeString(String str, @Nullable String str2) {
        return decodeString(this.nativeHandle, str, str2);
    }

    @Nullable
    public Set<String> decodeStringSet(String str, @Nullable Set<String> set) {
        return decodeStringSet(str, set, HashSet.class);
    }

    public boolean encode(String str, boolean z11, int i11) {
        return encodeBool_2(this.nativeHandle, str, z11, i11);
    }

    @Override // android.content.SharedPreferences
    public Map<String, ?> getAll() {
        throw new UnsupportedOperationException("Intentionally Not Supported. Use allKeys() instead, getAll() not implement because type-erasure inside mmkv");
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(String str, boolean z11) {
        return decodeBool(this.nativeHandle, str, z11);
    }

    @Override // android.content.SharedPreferences
    public float getFloat(String str, float f11) {
        return decodeFloat(this.nativeHandle, str, f11);
    }

    @Override // android.content.SharedPreferences
    public int getInt(String str, int i11) {
        return decodeInt(this.nativeHandle, str, i11);
    }

    @Override // android.content.SharedPreferences
    public long getLong(String str, long j11) {
        return decodeLong(this.nativeHandle, str, j11);
    }

    @Override // android.content.SharedPreferences
    @Nullable
    public String getString(String str, @Nullable String str2) {
        return decodeString(this.nativeHandle, str, str2);
    }

    public int getValueActualSize(String str) {
        return valueSize(this.nativeHandle, str, true);
    }

    public int getValueSize(String str) {
        return valueSize(this.nativeHandle, str, false);
    }

    public SharedPreferences.Editor putBoolean(String str, boolean z11, int i11) {
        encodeBool_2(this.nativeHandle, str, z11, i11);
        return this;
    }

    public SharedPreferences.Editor putBytes(String str, @Nullable byte[] bArr, int i11) {
        encode(str, bArr, i11);
        return this;
    }

    public SharedPreferences.Editor putFloat(String str, float f11, int i11) {
        encodeFloat_2(this.nativeHandle, str, f11, i11);
        return this;
    }

    public SharedPreferences.Editor putInt(String str, int i11, int i12) {
        encodeInt_2(this.nativeHandle, str, i11, i12);
        return this;
    }

    public SharedPreferences.Editor putLong(String str, long j11, int i11) {
        encodeLong_2(this.nativeHandle, str, j11, i11);
        return this;
    }

    public SharedPreferences.Editor putString(String str, @Nullable String str2, int i11) {
        encodeString_2(this.nativeHandle, str, str2, i11);
        return this;
    }

    public SharedPreferences.Editor putStringSet(String str, @Nullable Set<String> set, int i11) {
        encode(str, set, i11);
        return this;
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        throw new UnsupportedOperationException("Intentionally Not implement in MMKV");
    }

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        throw new UnsupportedOperationException("Intentionally Not implement in MMKV");
    }

    public int writeValueToNativeBuffer(String str, @NonNull NativeBuffer nativeBuffer) {
        return writeValueToNB(this.nativeHandle, str, nativeBuffer.pointer, nativeBuffer.size);
    }

    private MMKV(long j11) {
        this.nativeHandle = j11;
    }

    @Nullable
    public static NativeBuffer createNativeBuffer(int i11) {
        long jCreateNB = createNB(i11);
        if (jCreateNB <= 0) {
            return null;
        }
        return new NativeBuffer(jCreateNB, i11);
    }

    private static String doInitialize(String str, String str2, LibLoader libLoader, MMKVLogLevel mMKVLogLevel, boolean z11) {
        if (libLoader != null) {
            libLoader.loadLibrary("mmkv");
        } else {
            System.loadLibrary("mmkv");
        }
        jniInitialize(str, str2, logLevel2Int(mMKVLogLevel), z11);
        rootDir = str;
        return str;
    }

    private byte[] getParcelableByte(@NonNull Parcelable parcelable) {
        Parcel parcelObtain = Parcel.obtain();
        parcelable.writeToParcel(parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }

    @NonNull
    public static MMKV mmkvWithAshmemFD(String str, int i11, int i12, String str2) throws RuntimeException {
        long mMKVWithAshmemFD = getMMKVWithAshmemFD(str, i11, i12, str2);
        if (mMKVWithAshmemFD != 0) {
            return new MMKV(mMKVWithAshmemFD);
        }
        throw new RuntimeException("Fail to create an ashmem MMKV instance [" + str + "] in JNI");
    }

    private static void simpleLog(MMKVLogLevel mMKVLogLevel, String str) {
        int iIntValue;
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        StackTraceElement stackTraceElement = stackTrace[stackTrace.length - 1];
        Integer num = logLevel2Index.get(mMKVLogLevel);
        if (num == null) {
            iIntValue = 0;
        } else {
            iIntValue = num.intValue();
        }
        mmkvLogImp(iIntValue, stackTraceElement.getFileName(), stackTraceElement.getLineNumber(), stackTraceElement.getMethodName(), str);
    }

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor clear() {
        clearAll();
        return this;
    }

    @Override // android.content.SharedPreferences
    public boolean contains(String str) {
        return containsKey(str);
    }

    @Nullable
    public Set<String> decodeStringSet(String str, @Nullable Set<String> set, Class<? extends Set> cls) {
        String[] strArrDecodeStringSet = decodeStringSet(this.nativeHandle, str);
        if (strArrDecodeStringSet != null) {
            try {
                Set<String> setNewInstance = cls.newInstance();
                setNewInstance.addAll(Arrays.asList(strArrDecodeStringSet));
                return setNewInstance;
            } catch (IllegalAccessException | InstantiationException unused) {
            }
        }
        return set;
    }

    public void enableCompareBeforeSet() {
        if (isExpirationEnabled()) {
            Log.e("MMKV", "enableCompareBeforeSet is invalid when Expiration is on");
        }
        if (isEncryptionEnabled()) {
            Log.e("MMKV", "enableCompareBeforeSet is invalid when key encryption is on");
        }
        nativeEnableCompareBeforeSet();
    }

    public boolean encode(String str, int i11) {
        return encodeInt(this.nativeHandle, str, i11);
    }

    public byte[] getBytes(String str, @Nullable byte[] bArr) {
        return decodeBytes(str, bArr);
    }

    @Override // android.content.SharedPreferences
    @Nullable
    public Set<String> getStringSet(String str, @Nullable Set<String> set) {
        return decodeStringSet(str, set);
    }

    public int importFromSharedPreferences(@NonNull SharedPreferences sharedPreferences) {
        Map<String, ?> all = sharedPreferences.getAll();
        if (all != null && all.size() > 0) {
            for (Map.Entry<String, ?> entry : all.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (key != null) {
                    if (value != null) {
                        if (value instanceof Boolean) {
                            encodeBool(this.nativeHandle, key, ((Boolean) value).booleanValue());
                        } else if (value instanceof Integer) {
                            encodeInt(this.nativeHandle, key, ((Integer) value).intValue());
                        } else if (value instanceof Long) {
                            encodeLong(this.nativeHandle, key, ((Long) value).longValue());
                        } else if (value instanceof Float) {
                            encodeFloat(this.nativeHandle, key, ((Float) value).floatValue());
                        } else if (value instanceof Double) {
                            encodeDouble(this.nativeHandle, key, ((Double) value).doubleValue());
                        } else if (value instanceof String) {
                            encodeString(this.nativeHandle, key, (String) value);
                        } else if (value instanceof Set) {
                            encode(key, (Set<String>) value);
                        } else {
                            simpleLog(MMKVLogLevel.LevelError, "unknown type: " + value.getClass());
                        }
                    }
                }
            }
            return all.size();
        }
        return 0;
    }

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor remove(String str) {
        removeValueForKey(str);
        return this;
    }

    public static String initialize(@NonNull Context context, MMKVLogLevel mMKVLogLevel) {
        return initialize(context, context.getFilesDir().getAbsolutePath() + "/mmkv", null, mMKVLogLevel, null);
    }

    public boolean encode(String str, int i11, int i12) {
        return encodeInt_2(this.nativeHandle, str, i11, i12);
    }

    @NonNull
    public static MMKV defaultMMKV(int i11, @Nullable String str) throws RuntimeException {
        if (rootDir != null) {
            return checkProcessMode(getDefaultMMKV(i11, str), "DefaultMMKV", i11);
        }
        throw new IllegalStateException("You should Call MMKV.initialize() first.");
    }

    @NonNull
    public static MMKV mmkvWithID(String str, int i11) throws RuntimeException {
        if (rootDir != null) {
            return checkProcessMode(getMMKVWithID(str, i11, null, null, 0L), str, i11);
        }
        throw new IllegalStateException("You should Call MMKV.initialize() first.");
    }

    public boolean encode(String str, long j11) {
        return encodeLong(this.nativeHandle, str, j11);
    }

    public static String initialize(@NonNull Context context, LibLoader libLoader) {
        return initialize(context, context.getFilesDir().getAbsolutePath() + "/mmkv", libLoader, MMKVLogLevel.LevelInfo, null);
    }

    public boolean encode(String str, long j11, int i11) {
        return encodeLong_2(this.nativeHandle, str, j11, i11);
    }

    public boolean encode(String str, float f11) {
        return encodeFloat(this.nativeHandle, str, f11);
    }

    public boolean encode(String str, float f11, int i11) {
        return encodeFloat_2(this.nativeHandle, str, f11, i11);
    }

    public static String initialize(@NonNull Context context, LibLoader libLoader, MMKVLogLevel mMKVLogLevel) {
        return initialize(context, context.getFilesDir().getAbsolutePath() + "/mmkv", libLoader, mMKVLogLevel, null);
    }

    @NonNull
    public static MMKV mmkvWithID(String str, int i11, long j11) throws RuntimeException {
        if (rootDir != null) {
            return checkProcessMode(getMMKVWithID(str, i11, null, null, j11), str, i11);
        }
        throw new IllegalStateException("You should Call MMKV.initialize() first.");
    }

    public boolean encode(String str, double d11) {
        return encodeDouble(this.nativeHandle, str, d11);
    }

    public boolean encode(String str, double d11, int i11) {
        return encodeDouble_2(this.nativeHandle, str, d11, i11);
    }

    public static String initialize(Context context, String str) {
        return initialize(context, str, null, MMKVLogLevel.LevelInfo, null);
    }

    public boolean encode(String str, @Nullable String str2) {
        return encodeString(this.nativeHandle, str, str2);
    }

    public boolean encode(String str, @Nullable String str2, int i11) {
        return encodeString_2(this.nativeHandle, str, str2, i11);
    }

    public static String initialize(Context context, String str, MMKVLogLevel mMKVLogLevel) {
        return initialize(context, str, null, mMKVLogLevel, null);
    }

    @NonNull
    public static MMKV mmkvWithID(String str, int i11, @Nullable String str2) throws RuntimeException {
        if (rootDir != null) {
            return checkProcessMode(getMMKVWithID(str, i11, str2, null, 0L), str, i11);
        }
        throw new IllegalStateException("You should Call MMKV.initialize() first.");
    }

    public boolean encode(String str, @Nullable Set<String> set) {
        return encodeSet(this.nativeHandle, str, set == null ? null : (String[]) set.toArray(new String[0]));
    }

    public static String initialize(Context context, String str, LibLoader libLoader) {
        return initialize(context, str, libLoader, MMKVLogLevel.LevelInfo, null);
    }

    public boolean encode(String str, @Nullable Set<String> set, int i11) {
        return encodeSet_2(this.nativeHandle, str, set == null ? null : (String[]) set.toArray(new String[0]), i11);
    }

    public boolean encode(String str, @Nullable byte[] bArr) {
        return encodeBytes(this.nativeHandle, str, bArr);
    }

    public static String initialize(Context context, String str, LibLoader libLoader, MMKVLogLevel mMKVLogLevel) {
        return initialize(context, str, libLoader, mMKVLogLevel, null);
    }

    public boolean encode(String str, @Nullable byte[] bArr, int i11) {
        return encodeBytes_2(this.nativeHandle, str, bArr, i11);
    }

    public static String initialize(@NonNull Context context, String str, LibLoader libLoader, MMKVLogLevel mMKVLogLevel, MMKVHandler mMKVHandler) {
        if ((context.getApplicationInfo().flags & 2) == 0) {
            disableProcessModeChecker();
        } else {
            enableProcessModeChecker();
        }
        String absolutePath = context.getCacheDir().getAbsolutePath();
        gCallbackHandler = mMKVHandler;
        if (mMKVHandler != null && mMKVHandler.wantLogRedirecting()) {
            gWantLogReDirecting = true;
        }
        String strDoInitialize = doInitialize(str, absolutePath, libLoader, mMKVLogLevel, gWantLogReDirecting);
        if (gCallbackHandler != null) {
            setCallbackHandler(gWantLogReDirecting, true);
        }
        return strDoInitialize;
    }

    @NonNull
    public static MMKV mmkvWithID(String str, String str2) throws RuntimeException {
        if (rootDir != null) {
            return checkProcessMode(getMMKVWithID(str, 1, null, str2, 0L), str, 1);
        }
        throw new IllegalStateException("You should Call MMKV.initialize() first.");
    }

    public boolean encode(String str, @Nullable Parcelable parcelable) {
        if (parcelable == null) {
            return encodeBytes(this.nativeHandle, str, null);
        }
        return encodeBytes(this.nativeHandle, str, getParcelableByte(parcelable));
    }

    @Override // android.content.SharedPreferences
    public SharedPreferences.Editor edit() {
        return this;
    }

    public boolean encode(String str, @Nullable Parcelable parcelable, int i11) {
        if (parcelable == null) {
            return encodeBytes_2(this.nativeHandle, str, null, i11);
        }
        return encodeBytes_2(this.nativeHandle, str, getParcelableByte(parcelable), i11);
    }

    @NonNull
    public static MMKV mmkvWithID(String str, String str2, long j11) throws RuntimeException {
        if (rootDir != null) {
            return checkProcessMode(getMMKVWithID(str, 1, null, str2, j11), str, 1);
        }
        throw new IllegalStateException("You should Call MMKV.initialize() first.");
    }

    @NonNull
    public static MMKV mmkvWithID(String str, int i11, @Nullable String str2, String str3, long j11) throws RuntimeException {
        if (rootDir != null) {
            return checkProcessMode(getMMKVWithID(str, i11, str2, str3, j11), str, i11);
        }
        throw new IllegalStateException("You should Call MMKV.initialize() first.");
    }

    @Deprecated
    public static String initialize(String str) {
        return doInitialize(str, str + "/.tmp", null, MMKVLogLevel.LevelInfo, false);
    }

    @Deprecated
    public static String initialize(String str, MMKVLogLevel mMKVLogLevel) {
        return doInitialize(str, str + "/.tmp", null, mMKVLogLevel, false);
    }

    @NonNull
    public static MMKV mmkvWithID(String str, int i11, @Nullable String str2, String str3) throws RuntimeException {
        if (rootDir != null) {
            return checkProcessMode(getMMKVWithID(str, i11, str2, str3, 0L), str, i11);
        }
        throw new IllegalStateException("You should Call MMKV.initialize() first.");
    }

    @Deprecated
    public static String initialize(String str, LibLoader libLoader) {
        return doInitialize(str, str + "/.tmp", libLoader, MMKVLogLevel.LevelInfo, false);
    }

    @Deprecated
    public static String initialize(String str, LibLoader libLoader, MMKVLogLevel mMKVLogLevel) {
        return doInitialize(str, str + "/.tmp", libLoader, mMKVLogLevel, false);
    }
}
