package com.facebook.react.devsupport;

import com.tencent.bugly.proguard.C33844oi;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;

/* JADX INFO: loaded from: classes45.dex */
class MultipartStreamReader {
    private static final String CRLF = "\r\n";
    private final String mBoundary;
    private long mLastProgressEvent;
    private final BufferedSource mSource;

    public interface ChunkListener {
        void onChunkComplete(Map<String, String> map, Buffer buffer, boolean z11) throws IOException;

        void onChunkProgress(Map<String, String> map, long j11, long j12) throws IOException;
    }

    private void emitChunk(Buffer buffer, boolean z11, ChunkListener chunkListener) throws IOException {
        ByteString byteStringEncodeUtf8 = ByteString.encodeUtf8("\r\n\r\n");
        long jIndexOf = buffer.indexOf(byteStringEncodeUtf8);
        if (jIndexOf == -1) {
            chunkListener.onChunkComplete(null, buffer, z11);
            return;
        }
        Buffer buffer2 = new Buffer();
        Buffer buffer3 = new Buffer();
        buffer.read(buffer2, jIndexOf);
        buffer.skip(byteStringEncodeUtf8.size());
        buffer.readAll(buffer3);
        chunkListener.onChunkComplete(parseHeaders(buffer2), buffer3, z11);
    }

    private void emitProgress(Map<String, String> map, long j11, boolean z11, ChunkListener chunkListener) throws IOException {
        if (map == null || chunkListener == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.mLastProgressEvent > 16 || z11) {
            this.mLastProgressEvent = jCurrentTimeMillis;
            chunkListener.onChunkProgress(map, j11, map.get("Content-Length") != null ? Long.parseLong(map.get("Content-Length")) : 0L);
        }
    }

    private Map<String, String> parseHeaders(Buffer buffer) {
        HashMap map = new HashMap();
        for (String str : buffer.readUtf8().split("\r\n")) {
            int iIndexOf = str.indexOf(C33844oi.f71346o);
            if (iIndexOf != -1) {
                map.put(str.substring(0, iIndexOf).trim(), str.substring(iIndexOf + 1).trim());
            }
        }
        return map;
    }

    public boolean readAllParts(ChunkListener chunkListener) throws IOException {
        boolean z11;
        ByteString byteStringEncodeUtf8 = ByteString.encodeUtf8("\r\n--" + this.mBoundary + "\r\n");
        ByteString byteStringEncodeUtf9 = ByteString.encodeUtf8("\r\n--" + this.mBoundary + "--\r\n");
        ByteString byteStringEncodeUtf10 = ByteString.encodeUtf8("\r\n\r\n");
        Buffer buffer = new Buffer();
        long j11 = 0L;
        long size = 0L;
        long j12 = 0L;
        Map<String, String> headers = null;
        while (true) {
            long jMax = Math.max(j11 - ((long) byteStringEncodeUtf9.size()), size);
            long jIndexOf = buffer.indexOf(byteStringEncodeUtf8, jMax);
            if (jIndexOf == -1) {
                jIndexOf = buffer.indexOf(byteStringEncodeUtf9, jMax);
                z11 = true;
            } else {
                z11 = false;
            }
            if (jIndexOf == -1) {
                long size2 = buffer.size();
                if (headers == null) {
                    long jIndexOf2 = buffer.indexOf(byteStringEncodeUtf10, jMax);
                    if (jIndexOf2 >= 0) {
                        this.mSource.read(buffer, jIndexOf2);
                        Buffer buffer2 = new Buffer();
                        buffer.copyTo(buffer2, jMax, jIndexOf2 - jMax);
                        long size3 = buffer2.size() + ((long) byteStringEncodeUtf10.size());
                        headers = parseHeaders(buffer2);
                        j12 = size3;
                    }
                } else {
                    Map<String, String> map = headers;
                    emitProgress(map, buffer.size() - j12, false, chunkListener);
                    headers = map;
                }
                if (this.mSource.read(buffer, 4096) <= 0) {
                    return false;
                }
                size = size;
                j11 = size2;
            } else {
                long j13 = size;
                Map<String, String> map2 = headers;
                long j14 = jIndexOf - j13;
                if (j13 > 0) {
                    Buffer buffer3 = new Buffer();
                    buffer.skip(j13);
                    buffer.read(buffer3, j14);
                    emitProgress(map2, buffer3.size() - j12, true, chunkListener);
                    emitChunk(buffer3, z11, chunkListener);
                    j12 = 0;
                    map2 = null;
                } else {
                    buffer.skip(jIndexOf);
                }
                if (z11) {
                    return true;
                }
                size = byteStringEncodeUtf8.size();
                headers = map2;
                j11 = size;
            }
        }
    }

    public MultipartStreamReader(BufferedSource bufferedSource, String str) {
        this.mSource = bufferedSource;
        this.mBoundary = str;
    }
}
