package io.flutter.plugins.videoplayer;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes60.dex */
public interface VideoPlayerCallbacks {
    void onBufferingEnd();

    void onBufferingStart();

    void onBufferingUpdate(long j11);

    void onCompleted();

    void onError(@NonNull String str, @Nullable String str2, @Nullable Object obj);

    void onInitialized(int i11, int i12, long j11, int i13);

    void onIsPlayingStateUpdate(boolean z11);
}
