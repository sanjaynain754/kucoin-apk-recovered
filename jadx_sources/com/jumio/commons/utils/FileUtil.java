package com.jumio.commons.utils;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.jumio.commons.log.Log;
import com.jumio.core.models.AuthorizationModel;
import com.jumio.core.util.ByteArrayUtilKt;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import jumio.core.AbstractC40585Q3;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.p407io.ByteStreamsKt;
import p852kotlin.p407io.CloseableKt;
import p852kotlin.p407io.FilesKt;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u001dB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\u0010\b\u001a\u00060\tR\u00020\nJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0007J\u000e\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0007J\"\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00132\n\u0010\b\u001a\u00060\tR\u00020\nJ\"\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00132\n\u0010\b\u001a\u00060\tR\u00020\nJ\"\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00132\n\u0010\b\u001a\u00060\tR\u00020\nJ\u000e\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0013J\u000e\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0015J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0015H\u0002¨\u0006\u001e"}, m90084d2 = {"Lcom/jumio/commons/utils/FileUtil;", "", "<init>", "()V", "readFile", "", "file", "", "sessionKey", "Lcom/jumio/core/models/AuthorizationModel$SessionKey;", "Lcom/jumio/core/models/AuthorizationModel;", "deleteFile", "", "filename", "deleteFilesRecursive", "path", "saveToFile", "content", FirebaseAnalytics.Param.DESTINATION, "Ljava/io/File;", "Ljava/nio/ByteBuffer;", "Ljava/io/InputStream;", "checksumFromFile", "checksumFromInputStream", "inputStream", "updateDigest", "Ljava/security/MessageDigest;", "digest", "data", "JumioFilenameFilter", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFileUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileUtil.kt\ncom/jumio/commons/utils/FileUtil\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,134:1\n1#2:135\n*E\n"})
public final class FileUtil {

    @NotNull
    public static final FileUtil INSTANCE = new FileUtil();

    public final boolean saveToFile(@NotNull byte[] content, @NotNull File destination, @NotNull AuthorizationModel.SessionKey sessionKey) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(sessionKey, "sessionKey");
        try {
            CipherOutputStream cipherOutputStream = new CipherOutputStream(new FileOutputStream(destination), sessionKey.getEncryptCipher());
            try {
                cipherOutputStream.write(content);
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(cipherOutputStream, null);
                return true;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    CloseableKt.closeFinally(cipherOutputStream, th2);
                    throw th3;
                }
            }
        } catch (Exception e11) {
            Log.printStackTrace(e11);
            return false;
        }
    }

    @NotNull
    public final String checksumFromFile(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        try {
            if (file.exists()) {
                return checksumFromInputStream(new FileInputStream(file));
            }
        } catch (Exception unused) {
        }
        return "";
    }

    @NotNull
    public final String checksumFromInputStream(@NotNull InputStream inputStream) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        try {
            try {
                FileUtil fileUtil = INSTANCE;
                Intrinsics.checkNotNull(messageDigest);
                fileUtil.getClass();
                byte[] bArr = new byte[1024];
                int i11 = inputStream.read(bArr, 0, 1024);
                while (i11 > -1) {
                    messageDigest.update(bArr, 0, i11);
                    i11 = inputStream.read(bArr, 0, 1024);
                }
                byte[] bArrDigest = messageDigest.digest();
                Intrinsics.checkNotNull(bArrDigest);
                String strM89227a = AbstractC40585Q3.m89227a(bArrDigest);
                CloseableKt.closeFinally(inputStream, null);
                return strM89227a;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    CloseableKt.closeFinally(inputStream, th2);
                    throw th3;
                }
            }
        } catch (Exception e11) {
            Log.printStackTrace(e11);
            return "";
        }
    }

    public final boolean deleteFile(@NotNull String filename) {
        Intrinsics.checkNotNullParameter(filename, "filename");
        return new File(filename).delete();
    }

    public final boolean deleteFilesRecursive(@NotNull String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        return FilesKt.deleteRecursively(new File(path));
    }

    @NotNull
    public final byte[] readFile(@NotNull String file, @NotNull AuthorizationModel.SessionKey sessionKey) throws Exception {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(sessionKey, "sessionKey");
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            long length = randomAccessFile.length();
            int i11 = (int) length;
            if (i11 != length) {
                throw new IOException("File size >= 2 GB");
            }
            CipherInputStream cipherInputStream = new CipherInputStream(Channels.newInputStream(randomAccessFile.getChannel()), sessionKey.getDecryptCipher());
            try {
                byte[] bArr = new byte[i11];
                byte[] bArr2 = new byte[2048];
                int i12 = 0;
                while (true) {
                    int i13 = cipherInputStream.read(bArr2);
                    if (i13 == -1) {
                        byte[] bArrTrim = ByteArrayUtilKt.trim(bArr, i12);
                        CloseableKt.closeFinally(cipherInputStream, null);
                        CloseableKt.closeFinally(randomAccessFile, null);
                        return bArrTrim;
                    }
                    System.arraycopy(bArr2, 0, bArr, i12, i13);
                    i12 += i13;
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        CloseableKt.closeFinally(randomAccessFile, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    CloseableKt.closeFinally(cipherInputStream, th3);
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            throw th5;
        }
    }

    public final boolean saveToFile(@NotNull ByteBuffer content, @NotNull File destination, @NotNull AuthorizationModel.SessionKey sessionKey) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(sessionKey, "sessionKey");
        try {
            CipherOutputStream cipherOutputStream = new CipherOutputStream(new FileOutputStream(destination), sessionKey.getEncryptCipher());
            try {
                Channels.newChannel(cipherOutputStream).write(content);
                CloseableKt.closeFinally(cipherOutputStream, null);
                return true;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    CloseableKt.closeFinally(cipherOutputStream, th2);
                    throw th3;
                }
            }
        } catch (Exception e11) {
            Log.printStackTrace(e11);
            return false;
        }
    }

    public final boolean saveToFile(@NotNull InputStream content, @NotNull File destination, @NotNull AuthorizationModel.SessionKey sessionKey) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(sessionKey, "sessionKey");
        try {
            CipherOutputStream cipherOutputStream = new CipherOutputStream(new FileOutputStream(destination), sessionKey.getEncryptCipher());
            try {
                ByteStreamsKt.copyTo$default(content, cipherOutputStream, 0, 2, null);
                CloseableKt.closeFinally(cipherOutputStream, null);
                return true;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    CloseableKt.closeFinally(cipherOutputStream, th2);
                    throw th3;
                }
            }
        } catch (Exception e11) {
            Log.printStackTrace(e11);
            return false;
        }
    }
}
