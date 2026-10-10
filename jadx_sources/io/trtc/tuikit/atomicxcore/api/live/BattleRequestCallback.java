package io.trtc.tuikit.atomicxcore.api.live;

import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J$\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\fH&¨\u0006\r"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/live/BattleRequestCallback;", "", "onError", "", "code", "", "desc", "", "onSuccess", "battleInfo", "Lio/trtc/tuikit/atomicxcore/api/live/BattleInfo;", "resultMap", "", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public interface BattleRequestCallback {
    void onError(int code, @NotNull String desc);

    void onSuccess(@NotNull BattleInfo battleInfo, @NotNull Map<String, Integer> resultMap);
}
