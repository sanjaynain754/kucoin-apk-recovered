package io.flutter.plugin.common;

import androidx.annotation.Nullable;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes23.dex */
public interface MessageCodec<T> {
    @Nullable
    T decodeMessage(@Nullable ByteBuffer byteBuffer);

    @Nullable
    ByteBuffer encodeMessage(@Nullable T t11);
}
