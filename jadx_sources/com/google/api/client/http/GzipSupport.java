package com.google.api.client.http;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: classes56.dex */
final class GzipSupport {

    public static final class OptimisticAvailabilityInputStream extends FilterInputStream {
        private int lastRead;

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            int i11 = super.read();
            this.lastRead = i11;
            return i11;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int available() throws IOException {
            return this.lastRead > -1 ? Integer.MAX_VALUE : 0;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr) throws IOException {
            int i11 = super.read(bArr);
            this.lastRead = i11;
            return i11;
        }

        public OptimisticAvailabilityInputStream(InputStream inputStream) {
            super(inputStream);
            this.lastRead = 0;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i11, int i12) throws IOException {
            int i13 = super.read(bArr, i11, i12);
            this.lastRead = i13;
            return i13;
        }
    }

    public static GZIPInputStream newGzipInputStream(InputStream inputStream) throws IOException {
        return new GZIPInputStream(new OptimisticAvailabilityInputStream(inputStream));
    }

    private GzipSupport() {
    }
}
