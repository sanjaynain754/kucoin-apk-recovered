package com.facebook.soloader;

import android.content.Context;
import android.os.Parcel;
import com.kubi.otc.entity.OtcAd;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes45.dex */
public abstract class UnpackingSoSource extends DirectorySoSource implements AsyncInitSoSource {
    protected static final String DEPS_FILE_NAME = "dso_deps";
    protected static final String LOCK_FILE_NAME = "dso_lock";
    private static final byte STATE_CLEAN = 1;
    private static final byte STATE_DIRTY = 0;
    protected static final String STATE_FILE_NAME = "dso_state";
    private static final String TAG = "fb-UnpackingSoSource";
    private String[] mAbis;
    protected final Context mContext;

    public static final class InputDso implements Closeable {
        private final InputStream content;
        private final Dso dso;

        public int available() throws IOException {
            return this.content.available();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.content.close();
        }

        public Dso getDso() {
            return this.dso;
        }

        public InputDso(Dso dso, InputStream inputStream) {
            this.dso = dso;
            this.content = inputStream;
        }
    }

    public static abstract class Unpacker implements Closeable {
        public abstract Dso[] getDsos() throws IOException;

        public abstract void unpack(File file) throws IOException;

        public void extractDso(InputDso inputDso, byte[] bArr, File file) throws IOException {
            LogUtil.m10654i(UnpackingSoSource.TAG, "extracting DSO " + inputDso.getDso().name);
            File file2 = new File(file, inputDso.getDso().name);
            try {
                try {
                    RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rw");
                    try {
                        int iAvailable = inputDso.available();
                        if (iAvailable > 1) {
                            SysUtil.fallocateIfSupported(randomAccessFile.getFD(), iAvailable);
                        }
                        SysUtil.copyBytes(randomAccessFile, inputDso.content, Integer.MAX_VALUE, bArr);
                        randomAccessFile.setLength(randomAccessFile.getFilePointer());
                        if (!file2.setExecutable(true, false)) {
                            throw new IOException("cannot make file executable: " + file2);
                        }
                        randomAccessFile.close();
                        if (!file2.exists() || file2.setWritable(false)) {
                            return;
                        }
                        LogUtil.m10652e(SoLoader.TAG, "Error removing " + file2 + " write permission from directory " + file + " (writable: " + file.canWrite() + ")");
                    } catch (Throwable th2) {
                        try {
                            randomAccessFile.close();
                            throw th2;
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                            throw th2;
                        }
                    }
                } catch (IOException e11) {
                    LogUtil.m10652e(UnpackingSoSource.TAG, "error extracting dso  " + file2 + " due to: " + e11);
                    SysUtil.dumbDelete(file2);
                    throw e11;
                }
            } catch (Throwable th4) {
                if (file2.exists() && !file2.setWritable(false)) {
                    LogUtil.m10652e(SoLoader.TAG, "Error removing " + file2 + " write permission from directory " + file + " (writable: " + file.canWrite() + ")");
                }
                throw th4;
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }
    }

    public UnpackingSoSource(Context context, String str, boolean z11) {
        super(getSoStorePath(context, str), z11 ? 1 : 0);
        this.mContext = context;
    }

    private static boolean rewriteStateAsync(int i11) {
        return (i11 & 1) != 0;
    }

    public boolean depsChanged(byte[] bArr, byte[] bArr2) {
        return !Arrays.equals(bArr, bArr2);
    }

    public abstract Unpacker makeUnpacker() throws IOException;

    public static class Dso {
        public final String hash;
        public final String name;

        public Dso(String str, String str2) {
            this.name = str;
            this.hash = str2;
        }
    }

    private void deleteSoFiles() throws IOException {
        File[] fileArrListFiles = this.soDirectory.listFiles(new FilenameFilter() { // from class: com.facebook.soloader.UnpackingSoSource.1
            @Override // java.io.FilenameFilter
            public boolean accept(File file, String str) {
                return (str.equals(UnpackingSoSource.STATE_FILE_NAME) || str.equals(UnpackingSoSource.LOCK_FILE_NAME) || str.equals(UnpackingSoSource.DEPS_FILE_NAME)) ? false : true;
            }
        });
        if (fileArrListFiles == null) {
            throw new IOException("unable to list directory " + this.soDirectory);
        }
        for (File file : fileArrListFiles) {
            LogUtil.m10656v(TAG, "Deleting " + file);
            SysUtil.dumbDelete(file);
        }
    }

    private static boolean forceRefresh(int i11) {
        return (i11 & 2) != 0;
    }

    public static File getSoStorePath(Context context, String str) {
        return new File(context.getApplicationInfo().dataDir + "/" + str);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0074  */
    private boolean refreshLocked(final FileLocker fileLocker, int i11) throws IOException {
        byte b11;
        final File file = new File(this.soDirectory, STATE_FILE_NAME);
        byte[] depsBlock = getDepsBlock();
        if (forceRefresh(i11) || depsChanged(depsBlock)) {
            b11 = 0;
        } else {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                if (randomAccessFile.length() == 1) {
                    try {
                        b11 = randomAccessFile.readByte();
                        if (b11 == 1) {
                            LogUtil.m10656v(TAG, "dso store " + this.soDirectory + " regeneration not needed: state file clean");
                        } else {
                            b11 = 0;
                        }
                    } catch (IOException e11) {
                        LogUtil.m10656v(TAG, "dso store " + this.soDirectory + " regeneration interrupted: " + e11.getMessage());
                    }
                } else {
                    b11 = 0;
                }
                randomAccessFile.close();
            } catch (Throwable th2) {
                try {
                    randomAccessFile.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        if (b11 == 1) {
            return false;
        }
        final boolean z11 = (i11 & 4) == 0;
        LogUtil.m10656v(TAG, "so store dirty: regenerating");
        writeState(file, (byte) 0, z11);
        deleteSoFiles();
        Unpacker unpackerMakeUnpacker = makeUnpacker();
        try {
            unpackerMakeUnpacker.unpack(this.soDirectory);
            unpackerMakeUnpacker.close();
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(new File(this.soDirectory, DEPS_FILE_NAME), "rw");
            try {
                randomAccessFile2.write(depsBlock);
                randomAccessFile2.setLength(randomAccessFile2.getFilePointer());
                randomAccessFile2.close();
                Runnable runnable = new Runnable() { // from class: com.facebook.soloader.UnpackingSoSource.2
                    @Override // java.lang.Runnable
                    public void run() {
                        LogUtil.m10656v(UnpackingSoSource.TAG, "starting syncer worker");
                        try {
                            try {
                                if (z11) {
                                    SysUtil.fsyncAll(UnpackingSoSource.this.soDirectory);
                                }
                                UnpackingSoSource.writeState(file, (byte) 1, z11);
                            } finally {
                                LogUtil.m10656v(UnpackingSoSource.TAG, "releasing dso store lock for " + UnpackingSoSource.this.soDirectory + " (from syncer thread)");
                                fileLocker.close();
                            }
                        } catch (IOException e12) {
                            throw new RuntimeException(e12);
                        }
                    }
                };
                if (rewriteStateAsync(i11)) {
                    new Thread(runnable, "SoSync:" + this.soDirectory.getName()).start();
                } else {
                    runnable.run();
                }
                return true;
            } catch (Throwable th4) {
                try {
                    randomAccessFile2.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
                throw th4;
            }
        } catch (Throwable th6) {
            if (unpackerMakeUnpacker != null) {
                try {
                    unpackerMakeUnpacker.close();
                } catch (Throwable th7) {
                    th6.addSuppressed(th7);
                }
            }
            throw th6;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void writeState(File file, byte b11, boolean z11) throws IOException {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                randomAccessFile.seek(0L);
                randomAccessFile.write(b11);
                randomAccessFile.setLength(randomAccessFile.getFilePointer());
                if (z11) {
                    randomAccessFile.getFD().sync();
                }
                randomAccessFile.close();
            } catch (Throwable th2) {
                try {
                    randomAccessFile.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (SyncFailedException e11) {
            LogUtil.m10659w(TAG, "state file sync failed", e11);
        }
    }

    public String computeFileHash(File file) {
        try {
            MessageDigest hashingAlgorithm = getHashingAlgorithm();
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    DigestInputStream digestInputStream = new DigestInputStream(fileInputStream, hashingAlgorithm);
                    try {
                        while (digestInputStream.read(new byte[8192]) != -1) {
                        }
                        byte[] bArrDigest = hashingAlgorithm.digest();
                        StringBuilder sb2 = new StringBuilder(bArrDigest.length * 2);
                        for (byte b11 : bArrDigest) {
                            sb2.append(String.format("%02x", Byte.valueOf(b11)));
                        }
                        String string = sb2.toString();
                        digestInputStream.close();
                        fileInputStream.close();
                        return string;
                    } catch (Throwable th2) {
                        try {
                            digestInputStream.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } catch (Throwable th4) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                    throw th4;
                }
            } catch (IOException e11) {
                LogUtil.m10659w(TAG, "Failed to calculate hash for " + file.getName(), e11);
                return OtcAd.KYC_NOT_PASS;
            }
        } catch (NoSuchAlgorithmException e12) {
            LogUtil.m10659w(TAG, "Failed to calculate hash for " + file.getName(), e12);
            return OtcAd.KYC_NOT_PASS;
        }
    }

    public boolean depsChanged(byte[] bArr) {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(new File(this.soDirectory, DEPS_FILE_NAME), "rw");
            try {
                if (randomAccessFile.length() != 0) {
                    int length = (int) randomAccessFile.length();
                    byte[] bArr2 = new byte[length];
                    if (randomAccessFile.read(bArr2) == length) {
                        boolean zDepsChanged = depsChanged(bArr2, bArr);
                        randomAccessFile.close();
                        return zDepsChanged;
                    }
                    LogUtil.m10656v(TAG, "short read of so store deps file: marking unclean");
                }
                randomAccessFile.close();
                return true;
            } catch (Throwable th2) {
                try {
                    randomAccessFile.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException e11) {
            LogUtil.m10659w(TAG, "failed to compare whether deps changed", e11);
            return true;
        }
    }

    public MessageDigest getHashingAlgorithm() throws NoSuchAlgorithmException {
        return MessageDigest.getInstance("SHA-256");
    }

    @Override // com.facebook.soloader.SoSource
    public String[] getSoSourceAbis() {
        String[] strArr = this.mAbis;
        return strArr == null ? super.getSoSourceAbis() : strArr;
    }

    @Override // com.facebook.soloader.SoSource
    public void prepare(int i11) throws IOException {
        SysUtil.mkdirOrThrow(this.soDirectory);
        if (!this.soDirectory.canWrite() && !this.soDirectory.setWritable(true)) {
            throw new IOException("error adding " + this.soDirectory.getCanonicalPath() + " write permission");
        }
        FileLocker fileLocker = null;
        try {
            try {
                FileLocker orCreateLockOnDir = SysUtil.getOrCreateLockOnDir(this.soDirectory, new File(this.soDirectory, LOCK_FILE_NAME));
                try {
                    LogUtil.m10656v(TAG, "locked dso store " + this.soDirectory);
                    if (!this.soDirectory.canWrite() && !this.soDirectory.setWritable(true)) {
                        throw new IOException("error adding " + this.soDirectory.getCanonicalPath() + " write permission");
                    }
                    if (!refreshLocked(orCreateLockOnDir, i11)) {
                        LogUtil.m10654i(TAG, "dso store is up-to-date: " + this.soDirectory);
                        fileLocker = orCreateLockOnDir;
                    }
                    if (fileLocker != null) {
                        LogUtil.m10656v(TAG, "releasing dso store lock for " + this.soDirectory);
                        fileLocker.close();
                    } else {
                        LogUtil.m10656v(TAG, "not releasing dso store lock for " + this.soDirectory + " (syncer thread started)");
                    }
                    if (!this.soDirectory.canWrite() || this.soDirectory.setWritable(false)) {
                        return;
                    }
                    throw new IOException("error removing " + this.soDirectory.getCanonicalPath() + " write permission");
                } catch (Throwable th2) {
                    th = th2;
                    fileLocker = orCreateLockOnDir;
                    if (fileLocker != null) {
                        LogUtil.m10656v(TAG, "releasing dso store lock for " + this.soDirectory);
                        fileLocker.close();
                    } else {
                        LogUtil.m10656v(TAG, "not releasing dso store lock for " + this.soDirectory + " (syncer thread started)");
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            if (!this.soDirectory.canWrite() || this.soDirectory.setWritable(false)) {
                throw th4;
            }
            throw new IOException("error removing " + this.soDirectory.getCanonicalPath() + " write permission");
        }
    }

    public void setSoSourceAbis(String[] strArr) {
        this.mAbis = strArr;
    }

    @Override // com.facebook.soloader.AsyncInitSoSource
    public void waitUntilInitCompleted() throws Throwable {
        try {
            FileLocker orCreateLockOnDir = SysUtil.getOrCreateLockOnDir(this.soDirectory, new File(this.soDirectory, LOCK_FILE_NAME));
            if (orCreateLockOnDir != null) {
                orCreateLockOnDir.close();
            }
        } catch (Exception e11) {
            LogUtil.m10653e(TAG, "Encountered exception during wait for unpacking trying to acquire file lock for " + getClass().getName() + " (" + this.soDirectory + "): ", e11);
        }
    }

    public UnpackingSoSource(Context context, String str) {
        this(context, str, true);
    }

    private boolean libraryIsCorrupted(Dso dso, File file) {
        if (!file.exists() || !dso.hash.equals(computeFileHash(file))) {
            return true;
        }
        return false;
    }

    public byte[] getDepsBlock() throws IOException {
        Parcel parcelObtain = Parcel.obtain();
        Unpacker unpackerMakeUnpacker = makeUnpacker();
        try {
            Dso[] dsos = unpackerMakeUnpacker.getDsos();
            parcelObtain.writeInt(dsos.length);
            for (Dso dso : dsos) {
                parcelObtain.writeString(dso.name);
                parcelObtain.writeString(dso.hash);
            }
            unpackerMakeUnpacker.close();
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            return bArrMarshall;
        } catch (Throwable th2) {
            if (unpackerMakeUnpacker != null) {
                try {
                    unpackerMakeUnpacker.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public Dso[] getDsosBaseApk() throws IOException {
        Unpacker unpackerMakeUnpacker = makeUnpacker();
        try {
            Dso[] dsos = unpackerMakeUnpacker.getDsos();
            unpackerMakeUnpacker.close();
            return dsos;
        } catch (Throwable th2) {
            if (unpackerMakeUnpacker != null) {
                try {
                    unpackerMakeUnpacker.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // com.facebook.soloader.DirectorySoSource, com.facebook.soloader.SoSource
    public String getLibraryPath(String str) throws IOException {
        File soFileByName = getSoFileByName(str);
        if (soFileByName == null) {
            return null;
        }
        return soFileByName.getCanonicalPath();
    }

    public UnpackingSoSource(Context context, File file, boolean z11) {
        super(file, z11 ? 1 : 0);
        this.mContext = context;
    }

    public UnpackingSoSource(Context context, File file) {
        this(context, file, true);
    }
}
