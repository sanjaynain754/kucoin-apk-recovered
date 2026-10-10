package com.jumio.core.extraction.util;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/jumio/core/extraction/util/ByteBufferOutputStream;", "Ljava/io/ByteArrayOutputStream;", "<init>", "()V", "toDirectByteBuffer", "Ljava/nio/ByteBuffer;", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ByteBufferOutputStream extends ByteArrayOutputStream {
    @NotNull
    public final ByteBuffer toDirectByteBuffer() {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(((ByteArrayOutputStream) this).count);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        byteBufferAllocateDirect.put(((ByteArrayOutputStream) this).buf, 0, ((ByteArrayOutputStream) this).count);
        byteBufferAllocateDirect.flip();
        Intrinsics.checkNotNullExpressionValue(byteBufferAllocateDirect, "apply(...)");
        return byteBufferAllocateDirect;
    }
}
