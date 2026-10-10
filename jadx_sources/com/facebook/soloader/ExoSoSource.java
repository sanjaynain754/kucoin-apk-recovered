package com.facebook.soloader;

import android.content.Context;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes45.dex */
public final class ExoSoSource extends UnpackingSoSource {

    public final class ExoUnpacker extends UnpackingSoSource.Unpacker {
        private final FileDso[] mDsos;

        /* JADX WARN: Code duplicated, block: B:6:0x004c  */
        public ExoUnpacker(UnpackingSoSource unpackingSoSource) throws IOException {
            File file;
            File file2;
            File file3 = new File("/data/local/tmp/exopackage/" + ExoSoSource.this.mContext.getPackageName() + "/native-libs/");
            ArrayList arrayList = new ArrayList();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            String[] supportedAbis = SysUtil.getSupportedAbis();
            int length = supportedAbis.length;
            int i11 = 0;
            int i12 = 0;
            while (i12 < length) {
                String str = supportedAbis[i12];
                File file4 = new File(file3, str);
                if (file4.isDirectory()) {
                    linkedHashSet.add(str);
                    File file5 = new File(file4, "metadata.txt");
                    if (file5.isFile()) {
                        FileReader fileReader = new FileReader(file5);
                        try {
                            BufferedReader bufferedReader = new BufferedReader(fileReader);
                            while (true) {
                                try {
                                    String line = bufferedReader.readLine();
                                    if (line == null) {
                                        file = file3;
                                        bufferedReader.close();
                                        fileReader.close();
                                        break;
                                    }
                                    if (line.length() != 0) {
                                        int iIndexOf = line.indexOf(32);
                                        if (iIndexOf == -1) {
                                            throw new RuntimeException("illegal line in exopackage metadata: [" + line + "]");
                                        }
                                        String str2 = line.substring(i11, iIndexOf) + ".so";
                                        int size = arrayList.size();
                                        while (true) {
                                            if (i11 >= size) {
                                                file2 = file3;
                                                String strSubstring = line.substring(iIndexOf + 1);
                                                arrayList.add(new FileDso(str2, strSubstring.substring(strSubstring.indexOf(45), strSubstring.indexOf(".so")), new File(file4, strSubstring)));
                                                break;
                                            } else {
                                                file2 = file3;
                                                if (((FileDso) arrayList.get(i11)).name.equals(str2)) {
                                                    break;
                                                }
                                                i11++;
                                                file3 = file2;
                                            }
                                        }
                                        file3 = file2;
                                        i11 = 0;
                                    }
                                } catch (Throwable th2) {
                                    try {
                                        bufferedReader.close();
                                        throw th2;
                                    } catch (Throwable th3) {
                                        th2.addSuppressed(th3);
                                        throw th2;
                                    }
                                }
                                try {
                                    fileReader.close();
                                    throw th;
                                } catch (Throwable th4) {
                                    th.addSuppressed(th4);
                                    throw th;
                                }
                            }
                        } catch (Throwable th5) {
                            fileReader.close();
                            throw th5;
                        }
                    }
                    file = file3;
                } else {
                    file = file3;
                }
                i12++;
                file3 = file;
                i11 = 0;
            }
            unpackingSoSource.setSoSourceAbis((String[]) linkedHashSet.toArray(new String[linkedHashSet.size()]));
            this.mDsos = (FileDso[]) arrayList.toArray(new FileDso[arrayList.size()]);
        }

        @Override // com.facebook.soloader.UnpackingSoSource.Unpacker
        public UnpackingSoSource.Dso[] getDsos() throws IOException {
            return this.mDsos;
        }

        @Override // com.facebook.soloader.UnpackingSoSource.Unpacker
        public void unpack(File file) throws IOException {
            byte[] bArr = new byte[32768];
            for (FileDso fileDso : this.mDsos) {
                FileInputStream fileInputStream = new FileInputStream(fileDso.backingFile);
                try {
                    UnpackingSoSource.InputDso inputDso = new UnpackingSoSource.InputDso(fileDso, fileInputStream);
                    fileInputStream = null;
                    try {
                        extractDso(inputDso, bArr, file);
                        inputDso.close();
                    } catch (Throwable th2) {
                        try {
                            inputDso.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } catch (Throwable th4) {
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    throw th4;
                }
            }
        }
    }

    public static final class FileDso extends UnpackingSoSource.Dso {
        final File backingFile;

        public FileDso(String str, String str2, File file) {
            super(str, str2);
            this.backingFile = file;
        }
    }

    @Override // com.facebook.soloader.UnpackingSoSource
    public MessageDigest getHashingAlgorithm() throws NoSuchAlgorithmException {
        return MessageDigest.getInstance("SHA-1");
    }

    @Override // com.facebook.soloader.DirectorySoSource, com.facebook.soloader.SoSource
    public String getName() {
        return "ExoSoSource";
    }

    @Override // com.facebook.soloader.UnpackingSoSource
    public UnpackingSoSource.Unpacker makeUnpacker() throws IOException {
        return new ExoUnpacker(this);
    }

    public ExoSoSource(Context context, String str) {
        super(context, str);
    }
}
