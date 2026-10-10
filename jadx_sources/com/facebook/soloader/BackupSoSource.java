package com.facebook.soloader;

import android.content.Context;
import android.os.Parcel;
import android.os.StrictMode;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes45.dex */
public class BackupSoSource extends UnpackingSoSource implements RecoverableSoSource {
    private static final byte APK_SO_SOURCE_SIGNATURE_VERSION = 3;
    private static final byte LIBS_DIR_DOESNT_EXIST = 1;
    private static final byte LIBS_DIR_SNAPSHOT = 2;
    private static final String TAG = "BackupSoSource";
    private static final String ZIP_SEARCH_PATTERN = "^lib/([^/]+)/([^/]+\\.so)$";
    protected boolean mInitialized;
    private final ArrayList<ExtractFromZipSoSource> mZipSources;

    public class ApkUnpacker extends UnpackingSoSource.Unpacker {
        public ApkUnpacker() {
        }

        @Override // com.facebook.soloader.UnpackingSoSource.Unpacker
        public UnpackingSoSource.Dso[] getDsos() throws IOException {
            ArrayList arrayList = new ArrayList();
            Iterator it = BackupSoSource.this.mZipSources.iterator();
            while (it.hasNext()) {
                UnpackingSoSource.Unpacker unpackerMakeUnpacker = ((ExtractFromZipSoSource) it.next()).makeUnpacker();
                try {
                    arrayList.addAll(Arrays.asList(unpackerMakeUnpacker.getDsos()));
                    unpackerMakeUnpacker.close();
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
            return (UnpackingSoSource.Dso[]) arrayList.toArray(new UnpackingSoSource.Dso[arrayList.size()]);
        }

        @Override // com.facebook.soloader.UnpackingSoSource.Unpacker
        public void unpack(File file) throws IOException {
            Iterator it = BackupSoSource.this.mZipSources.iterator();
            while (it.hasNext()) {
                ExtractFromZipSoSource.ZipUnpacker zipUnpacker = (ExtractFromZipSoSource.ZipUnpacker) ((ExtractFromZipSoSource) it.next()).makeUnpacker();
                try {
                    zipUnpacker.unpack(file);
                    zipUnpacker.close();
                } catch (Throwable th2) {
                    if (zipUnpacker != null) {
                        try {
                            zipUnpacker.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            }
        }
    }

    public BackupSoSource(Context context, String str, boolean z11) {
        super(context, str, z11);
        ArrayList<ExtractFromZipSoSource> arrayList = new ArrayList<>();
        this.mZipSources = arrayList;
        this.mInitialized = false;
        arrayList.add(new ExtractFromZipSoSource(context, str, new File(context.getApplicationInfo().sourceDir), ZIP_SEARCH_PATTERN));
        addBackupsFromSplitApks(context, str);
    }

    private void addBackupsFromSplitApks(Context context, String str) {
        if (context.getApplicationInfo().splitSourceDirs == null) {
            return;
        }
        try {
            for (String str2 : context.getApplicationInfo().splitSourceDirs) {
                ExtractFromZipSoSource extractFromZipSoSource = new ExtractFromZipSoSource(context, str, new File(str2), ZIP_SEARCH_PATTERN);
                if (extractFromZipSoSource.hasZippedLibs()) {
                    LogUtil.m10658w(TAG, "adding backup source from split: " + extractFromZipSoSource.toString());
                    this.mZipSources.add(extractFromZipSoSource);
                }
            }
        } catch (IOException e11) {
            LogUtil.m10659w(TAG, "failed to read split apks", e11);
        }
    }

    @Override // com.facebook.soloader.UnpackingSoSource
    public UnpackingSoSource.Dso[] getDsosBaseApk() throws IOException {
        UnpackingSoSource.Unpacker unpackerMakeUnpacker = this.mZipSources.get(0).makeUnpacker();
        try {
            UnpackingSoSource.Dso[] dsos = unpackerMakeUnpacker.getDsos();
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
    public String getName() {
        return TAG;
    }

    @Override // com.facebook.soloader.DirectorySoSource, com.facebook.soloader.SoSource
    public int loadLibrary(String str, int i11, StrictMode.ThreadPolicy threadPolicy) throws IOException {
        if (this.mInitialized) {
            return super.loadLibrary(str, i11, threadPolicy);
        }
        return 0;
    }

    @Override // com.facebook.soloader.UnpackingSoSource
    public UnpackingSoSource.Unpacker makeUnpacker() throws IOException {
        return new ApkUnpacker();
    }

    @Override // com.facebook.soloader.UnpackingSoSource, com.facebook.soloader.SoSource
    public void prepare(int i11) throws IOException {
        if ((i11 & 8) != 0) {
            return;
        }
        super.prepare(i11);
        this.mInitialized = true;
    }

    @Override // com.facebook.soloader.RecoverableSoSource
    public SoSource recover(Context context) {
        BackupSoSource backupSoSource = new BackupSoSource(context, this.soDirectory.getName());
        try {
            backupSoSource.prepare(0);
            return backupSoSource;
        } catch (IOException e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override // com.facebook.soloader.DirectorySoSource, com.facebook.soloader.SoSource
    public String toString() {
        String name;
        try {
            name = String.valueOf(this.soDirectory.getCanonicalPath());
        } catch (IOException unused) {
            name = this.soDirectory.getName();
        }
        return getName() + "[root = " + name + " flags = " + this.flags + " apks = " + this.mZipSources.toString() + "]";
    }

    @Override // com.facebook.soloader.UnpackingSoSource
    public byte[] getDepsBlock() throws IOException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeByte((byte) 3);
            parcelObtain.writeInt(SysUtil.getAppVersionCode(this.mContext));
            parcelObtain.writeInt(this.mZipSources.size());
            Iterator<ExtractFromZipSoSource> it = this.mZipSources.iterator();
            while (it.hasNext()) {
                parcelObtain.writeByteArray(it.next().getDepsBlock());
            }
            String str = this.mContext.getApplicationInfo().sourceDir;
            if (str == null) {
                parcelObtain.writeByte((byte) 1);
                return parcelObtain.marshall();
            }
            File canonicalFile = new File(str).getCanonicalFile();
            if (!canonicalFile.exists()) {
                parcelObtain.writeByte((byte) 1);
                return parcelObtain.marshall();
            }
            parcelObtain.writeByte((byte) 2);
            parcelObtain.writeString(canonicalFile.getPath());
            parcelObtain.writeLong(canonicalFile.lastModified());
            return parcelObtain.marshall();
        } finally {
            parcelObtain.recycle();
        }
    }

    public boolean peekAndPrepareSoSource(String str, int i11) throws IOException {
        boolean z11;
        UnpackingSoSource.Unpacker unpackerMakeUnpacker = makeUnpacker();
        try {
            UnpackingSoSource.Dso[] dsos = unpackerMakeUnpacker.getDsos();
            int length = dsos.length;
            int i12 = 0;
            while (true) {
                if (i12 < length) {
                    if (dsos[i12].name.equals(str)) {
                        LogUtil.m10652e(SoLoader.TAG, "Found " + str + " in " + getName());
                        z11 = true;
                        break;
                    }
                    i12++;
                } else {
                    z11 = false;
                    break;
                }
            }
            unpackerMakeUnpacker.close();
            if (!z11) {
                return false;
            }
            LogUtil.m10652e(SoLoader.TAG, "Preparing " + getName());
            prepare(i11);
            return true;
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

    public BackupSoSource(Context context, String str) {
        this(context, str, true);
    }
}
