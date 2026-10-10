package com.facebook.soloader;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes45.dex */
public class ElfZipFileChannel implements ElfByteChannel {
    private InputStream mIs;
    private final long mLength;
    private boolean mOpened = true;
    private long mPos = 0;
    private final ZipEntry mZipEntry;
    private final ZipFile mZipFile;

    @Override // com.facebook.soloader.ElfByteChannel
    public long position() throws IOException {
        return this.mPos;
    }

    @Override // com.facebook.soloader.ElfByteChannel, java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        return read(byteBuffer, this.mPos);
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        InputStream inputStream = this.mIs;
        if (inputStream != null) {
            inputStream.close();
            this.mOpened = false;
        }
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return this.mOpened;
    }

    @Override // com.facebook.soloader.ElfByteChannel
    public ElfByteChannel position(long j11) throws IOException {
        InputStream inputStream = this.mIs;
        if (inputStream == null) {
            throw new IOException(this.mZipEntry.getName() + "'s InputStream is null");
        }
        long j12 = this.mPos;
        if (j11 == j12) {
            return this;
        }
        long j13 = this.mLength;
        if (j11 > j13) {
            j11 = j13;
        }
        if (j11 >= j12) {
            inputStream.skip(j11 - j12);
        } else {
            inputStream.close();
            InputStream inputStream2 = this.mZipFile.getInputStream(this.mZipEntry);
            this.mIs = inputStream2;
            if (inputStream2 == null) {
                throw new IOException(this.mZipEntry.getName() + "'s InputStream is null");
            }
            inputStream2.skip(j11);
        }
        this.mPos = j11;
        return this;
    }

    @Override // com.facebook.soloader.ElfByteChannel
    public int read(ByteBuffer byteBuffer, long j11) throws IOException {
        if (this.mIs == null) {
            throw new IOException("InputStream is null");
        }
        int iRemaining = byteBuffer.remaining();
        long j12 = this.mLength - j11;
        if (j12 <= 0) {
            return -1;
        }
        int i11 = (int) j12;
        if (iRemaining > i11) {
            iRemaining = i11;
        }
        position(j11);
        if (byteBuffer.hasArray()) {
            this.mIs.read(byteBuffer.array(), 0, iRemaining);
            byteBuffer.position(byteBuffer.position() + iRemaining);
        } else {
            byte[] bArr = new byte[iRemaining];
            this.mIs.read(bArr, 0, iRemaining);
            byteBuffer.put(bArr, 0, iRemaining);
        }
        this.mPos += (long) iRemaining;
        return iRemaining;
    }

    @Override // com.facebook.soloader.ElfByteChannel
    public long size() throws IOException {
        return this.mLength;
    }

    @Override // com.facebook.soloader.ElfByteChannel
    public ElfByteChannel truncate(long j11) throws IOException {
        throw new UnsupportedOperationException("ElfZipFileChannel doesn't support truncate");
    }

    @Override // com.facebook.soloader.ElfByteChannel, java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        throw new UnsupportedOperationException("ElfZipFileChannel doesn't support write");
    }

    public ElfZipFileChannel(ZipFile zipFile, ZipEntry zipEntry) throws IOException {
        this.mZipFile = zipFile;
        this.mZipEntry = zipEntry;
        this.mLength = zipEntry.getSize();
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        this.mIs = inputStream;
        if (inputStream != null) {
            return;
        }
        throw new IOException(zipEntry.getName() + "'s InputStream is null");
    }
}
