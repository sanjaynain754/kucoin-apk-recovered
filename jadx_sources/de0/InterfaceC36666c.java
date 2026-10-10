package de0;

import com.tencent.bugly.proguard.InterfaceC33953u5;
import io.trtc.tuikit.atomicxcore.api.live.LiveInfo;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: de0.c */
/* JADX INFO: compiled from: AudienceContainerViewDefine.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/audiencecontainer/AudienceContainerViewDefine$LiveListCallback;", "", "onSuccess", "", InterfaceC33953u5.f72198E, "", "liveInfoList", "", "Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;", "onError", "code", "", "message", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC36666c {
    void onError(int code, @NotNull String message);

    void onSuccess(@NotNull String cursor, @NotNull List<LiveInfo> liveInfoList);
}
