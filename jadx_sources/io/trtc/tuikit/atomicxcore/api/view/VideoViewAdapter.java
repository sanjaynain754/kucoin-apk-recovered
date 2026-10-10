package io.trtc.tuikit.atomicxcore.api.view;

import android.view.View;
import io.trtc.tuikit.atomicxcore.api.live.SeatInfo;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&J\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\tH&J\u001e\u0010\n\u001a\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\tH&¨\u0006\u000b"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/view/VideoViewAdapter;", "", "createBattleContainerView", "Landroid/view/View;", "createBattleView", "seatInfo", "Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;", "createCoGuestView", "viewLayer", "Lio/trtc/tuikit/atomicxcore/api/view/ViewLayer;", "createCoHostView", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public interface VideoViewAdapter {
    @Nullable
    View createBattleContainerView();

    @Nullable
    View createBattleView(@Nullable SeatInfo seatInfo);

    @Nullable
    View createCoGuestView(@Nullable SeatInfo seatInfo, @Nullable ViewLayer viewLayer);

    @Nullable
    View createCoHostView(@Nullable SeatInfo seatInfo, @Nullable ViewLayer viewLayer);
}
