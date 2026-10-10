package io.trtc.tuikit.atomicxcore.api;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0003H&¨\u0006\t"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;", "", "onFailure", "", "code", "", "desc", "", "onSuccess", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public interface CompletionHandler {
    void onFailure(int code, @NotNull String desc);

    void onSuccess();
}
