package org.tensorflow.lite.support.metadata;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Channel;

/* JADX INFO: loaded from: classes61.dex */
interface SeekableByteChannelCompat extends Channel {
    long position() throws IOException;

    SeekableByteChannelCompat position(long j11) throws IOException;

    int read(ByteBuffer byteBuffer) throws IOException;

    long size() throws IOException;

    SeekableByteChannelCompat truncate(long j11) throws IOException;

    int write(ByteBuffer byteBuffer) throws IOException;
}
