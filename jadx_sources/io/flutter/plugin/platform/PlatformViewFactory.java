package io.flutter.plugin.platform;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.flutter.plugin.common.MessageCodec;

/* JADX INFO: loaded from: classes23.dex */
public abstract class PlatformViewFactory {
    private final MessageCodec<Object> createArgsCodec;

    @NonNull
    public abstract PlatformView create(Context context, int i11, @Nullable Object obj);

    @Nullable
    public final MessageCodec<Object> getCreateArgsCodec() {
        return this.createArgsCodec;
    }

    public PlatformViewFactory(@Nullable MessageCodec<Object> messageCodec) {
        this.createArgsCodec = messageCodec;
    }
}
