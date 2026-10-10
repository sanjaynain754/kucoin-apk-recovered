package com.sumsub.sns.internal.log.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;
import java.util.zip.CRC32;
import p852kotlin.Unit;
import p852kotlin.p407io.CloseableKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.log.utils.a */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C33306a {

    /* JADX INFO: renamed from: a */
    public final File f67902a;

    /* JADX INFO: renamed from: b */
    public final Random f67903b;

    /* JADX INFO: renamed from: a */
    public final void m71630a(byte[] bArr) {
        if (this.f67902a.exists()) {
            this.f67902a.delete();
        }
        File file = new File(this.f67902a.getAbsoluteFile() + "_random_" + this.f67903b.nextLong() + ".tmp");
        if (this.f67902a.exists()) {
            file.delete();
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            int length = bArr.length;
            fileOutputStream.write((byte) (length & 255));
            fileOutputStream.write((byte) ((length >> 8) & 255));
            fileOutputStream.write((byte) ((length >> 16) & 255));
            fileOutputStream.write((byte) ((length >> 24) & 255));
            fileOutputStream.write(bArr);
            CRC32 crc32 = new CRC32();
            crc32.update(bArr);
            long value = crc32.getValue();
            fileOutputStream.write((byte) (value & 255));
            fileOutputStream.write((byte) ((value >> 8) & 255));
            fileOutputStream.write((byte) ((value >> 16) & 255));
            fileOutputStream.write((byte) ((value >> 24) & 255));
            fileOutputStream.write((byte) ((value >> 32) & 255));
            fileOutputStream.write((byte) ((value >> 40) & 255));
            fileOutputStream.write((byte) ((value >> 48) & 255));
            fileOutputStream.write((byte) ((value >> 56) & 255));
            fileOutputStream.flush();
            fileOutputStream.getFD().sync();
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(fileOutputStream, null);
            file.renameTo(this.f67902a);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                CloseableKt.closeFinally(fileOutputStream, th2);
                throw th3;
            }
        }
    }

    public C33306a(File file) {
        Random random = new Random();
        this.f67902a = file;
        this.f67903b = random;
    }

    /* JADX INFO: renamed from: b */
    public static long m71629b(FileInputStream fileInputStream) throws IOException {
        long j11 = fileInputStream.read();
        if (j11 >= 0) {
            long j12 = fileInputStream.read();
            if (j12 >= 0) {
                long j13 = fileInputStream.read();
                if (j13 >= 0) {
                    long j14 = fileInputStream.read();
                    if (j14 >= 0) {
                        return j11 + (j12 << 8) + (j13 << 16) + (j14 << 24);
                    }
                    throw new IOException();
                }
                throw new IOException();
            }
            throw new IOException();
        }
        throw new IOException();
    }

    /* JADX INFO: renamed from: a */
    public final byte[] m71631a() {
        if (!this.f67902a.exists()) {
            return null;
        }
        FileInputStream fileInputStream = new FileInputStream(this.f67902a);
        try {
            int iM71628a = m71628a(fileInputStream);
            byte[] bArr = new byte[iM71628a];
            int i11 = 0;
            while (i11 < iM71628a) {
                int i12 = fileInputStream.read(bArr, i11, iM71628a - i11);
                if (i12 > 0) {
                    i11 += i12;
                } else if (i12 >= 0) {
                    Thread.yield();
                } else {
                    throw new IOException();
                }
            }
            CRC32 crc32 = new CRC32();
            crc32.update(bArr);
            if (m71629b(fileInputStream) + (m71629b(fileInputStream) << 32) != crc32.getValue()) {
                CloseableKt.closeFinally(fileInputStream, null);
                return null;
            }
            CloseableKt.closeFinally(fileInputStream, null);
            return bArr;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                CloseableKt.closeFinally(fileInputStream, th2);
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m71628a(FileInputStream fileInputStream) throws IOException {
        int i11 = fileInputStream.read();
        if (i11 >= 0) {
            int i12 = fileInputStream.read();
            if (i12 >= 0) {
                int i13 = fileInputStream.read();
                if (i13 >= 0) {
                    int i14 = fileInputStream.read();
                    if (i14 >= 0) {
                        return i11 + (i12 << 8) + (i13 << 16) + (i14 << 24);
                    }
                    throw new IOException();
                }
                throw new IOException();
            }
            throw new IOException();
        }
        throw new IOException();
    }
}
