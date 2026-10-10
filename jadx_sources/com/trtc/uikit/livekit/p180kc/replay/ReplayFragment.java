package com.trtc.uikit.livekit.p180kc.replay;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.OptIn;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.media3.common.MediaItem;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.Player;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DefaultHttpDataSource;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.hls.HlsMediaSource;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.media3.p022ui.PlayerView;
import com.google.firebase.messaging.Constants;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseFragment;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.trtc.uikit.livekit.R$color;
import com.trtc.uikit.livekit.R$drawable;
import com.trtc.uikit.livekit.R$id;
import com.trtc.uikit.livekit.R$layout;
import com.trtc.uikit.livekit.p180kc.helper.LiveFlutterHelper;
import i10.Menu;
import kotlinx.coroutines.C41696j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: compiled from: ReplayFragment.kt */
/* JADX INFO: loaded from: classes60.dex */
@OptIn(markerClass = {UnstableApi.class})
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 +2\u00020\u0001:\u0001+B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u001a\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010#\u001a\u00020!H\u0016J\b\u0010$\u001a\u00020!H\u0016J\b\u0010%\u001a\u00020!H\u0016J\b\u0010&\u001a\u00020!H\u0016J\b\u0010'\u001a\u00020!H\u0016J\b\u0010(\u001a\u00020!H\u0002J\b\u0010)\u001a\u00020!H\u0002J\b\u0010*\u001a\u00020!H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u0010\f\u001a\u0004\u0018\u00010\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0012\u001a\u0004\u0018\u00010\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0013\u0010\u000fR\u001d\u0010\u0015\u001a\u0004\u0018\u00010\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0016\u0010\u000f¨\u0006,"}, m90084d2 = {"Lcom/trtc/uikit/livekit/kc/replay/ReplayFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "playerView", "Landroidx/media3/ui/PlayerView;", "player", "Landroidx/media3/exoplayer/ExoPlayer;", "playbackPosition", "", "playWhenReady", "", "videoUrl", "", "getVideoUrl", "()Ljava/lang/String;", "videoUrl$delegate", "Lkotlin/Lazy;", "roomId", "getRoomId", "roomId$delegate", "eventId", "getEventId", "eventId$delegate", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "onStart", "onResume", "onPause", "onStop", "onDestroyView", "initializePlayer", "releasePlayer", "reportReplayExit", "Companion", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ReplayFragment extends BaseFragment {

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public static final Companion f79171b0 = new Companion(null);

    /* JADX INFO: renamed from: U */
    @Nullable
    public PlayerView f79172U;

    /* JADX INFO: renamed from: V */
    @Nullable
    public ExoPlayer f79173V;

    /* JADX INFO: renamed from: W */
    public long f79174W;

    /* JADX INFO: renamed from: X */
    public boolean f79175X = true;

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final Lazy f79176Y = LazyKt.lazy(new Function0() { // from class: com.trtc.uikit.livekit.kc.replay.b
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ReplayFragment.m81553y3(this.f79180b);
        }
    });

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final Lazy f79177Z = LazyKt.lazy(new Function0() { // from class: com.trtc.uikit.livekit.kc.replay.c
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ReplayFragment.m81552x3(this.f79181b);
        }
    });

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final Lazy f79178a0 = LazyKt.lazy(new Function0() { // from class: com.trtc.uikit.livekit.kc.replay.d
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ReplayFragment.m81546p3(this.f79182b);
        }
    });

    /* JADX INFO: compiled from: ReplayFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"Lcom/trtc/uikit/livekit/kc/replay/ReplayFragment$Companion;", "", "<init>", "()V", "KEY_VIDEO_URL", "", "KEY_ROOM_ID", "KEY_EVENT_ID", "DEFAULT_TIMEOUT_MS", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.kc.replay.ReplayFragment$a */
    /* JADX INFO: compiled from: ReplayFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m90084d2 = {"com/trtc/uikit/livekit/kc/replay/ReplayFragment$initializePlayer$1$1", "Landroidx/media3/common/Player$Listener;", "onPlaybackStateChanged", "", "playbackState", "", "onPlayerError", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Landroidx/media3/common/PlaybackException;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36409a implements Player.Listener {
        @Override // androidx.media3.common.Player.Listener
        public void onPlaybackStateChanged(int playbackState) {
            if (playbackState == 1) {
                C44128b.m97266j("Live", "ReplayFragment: Player idle");
                return;
            }
            if (playbackState == 2) {
                C44128b.m97266j("Live", "ReplayFragment: Buffering");
            } else if (playbackState == 3) {
                C44128b.m97266j("Live", "ReplayFragment: Player ready");
            } else {
                if (playbackState != 4) {
                    return;
                }
                C44128b.m97266j("Live", "ReplayFragment: Playback ended");
            }
        }

        @Override // androidx.media3.common.Player.Listener
        public void onPlayerError(PlaybackException error) {
            Intrinsics.checkNotNullParameter(error, "error");
            C44128b.m97261e("Live", "ReplayFragment: Playback error - code: " + error.errorCode + ", message: " + error.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r3 */
    public final String m81547r3() {
        return (String) this.f79177Z.getValue();
    }

    /* JADX INFO: renamed from: s3 */
    private final String m81548s3() {
        return (String) this.f79176Y.getValue();
    }

    /* JADX INFO: renamed from: v3 */
    private final void m81551v3() {
        ExoPlayer exoPlayer = this.f79173V;
        if (exoPlayer != null) {
            this.f79174W = exoPlayer.getCurrentPosition();
            this.f79175X = exoPlayer.getPlayWhenReady();
            exoPlayer.release();
        }
        this.f79173V = null;
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.live_kc_fragment_replay, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getTitleBar().setMenu(new Menu(0, Integer.valueOf(R$drawable.ic2_warning_20), Integer.valueOf(R$color.c_text), 0, null, 0, 0, new View.OnClickListener() { // from class: com.trtc.uikit.livekit.kc.replay.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ReplayFragment.m81550u3(this.f79179b, view2);
            }
        }, 0, 377, null));
        PlayerView playerView = (PlayerView) view.findViewById(R$id.player_view);
        this.f79172U = playerView;
        if (playerView != null) {
            playerView.requestFocus();
        }
    }

    /* JADX INFO: renamed from: q3 */
    public final String m81554q3() {
        return (String) this.f79178a0.getValue();
    }

    /* JADX INFO: renamed from: p3 */
    public static final String m81546p3(ReplayFragment replayFragment) {
        Bundle arguments = replayFragment.getArguments();
        if (arguments != null) {
            return RouteExKt.m56284y(arguments, "eventId");
        }
        return null;
    }

    /* JADX INFO: renamed from: t3 */
    private final void m81549t3() {
        Context context = getContext();
        if (context == null) {
            return;
        }
        String strM81548s3 = m81548s3();
        if (strM81548s3 != null && !StringsKt.isBlank(strM81548s3)) {
            C44128b.m97266j("Live", "ReplayFragment: initializePlayer with url: " + strM81548s3);
            ExoPlayer exoPlayerBuild = new ExoPlayer.Builder(context).build();
            PlayerView playerView = this.f79172U;
            if (playerView != null) {
                playerView.setPlayer(exoPlayerBuild);
            }
            MediaItem mediaItemFromUri = MediaItem.fromUri(strM81548s3);
            Intrinsics.checkNotNullExpressionValue(mediaItemFromUri, "fromUri(...)");
            DefaultHttpDataSource.Factory readTimeoutMs = new DefaultHttpDataSource.Factory().setAllowCrossProtocolRedirects(true).setConnectTimeoutMs(15000).setReadTimeoutMs(15000);
            Intrinsics.checkNotNullExpressionValue(readTimeoutMs, "setReadTimeoutMs(...)");
            HlsMediaSource hlsMediaSourceCreateMediaSource = new HlsMediaSource.Factory(readTimeoutMs).setAllowChunklessPreparation(true).createMediaSource(mediaItemFromUri);
            Intrinsics.checkNotNullExpressionValue(hlsMediaSourceCreateMediaSource, "createMediaSource(...)");
            exoPlayerBuild.setMediaSource(hlsMediaSourceCreateMediaSource);
            exoPlayerBuild.addListener(new C36409a());
            exoPlayerBuild.seekTo(this.f79174W);
            exoPlayerBuild.setPlayWhenReady(this.f79175X);
            exoPlayerBuild.prepare();
            this.f79173V = exoPlayerBuild;
            return;
        }
        C44128b.m97261e("Live", "ReplayFragment: videoUrl is null or blank");
    }

    /* JADX INFO: renamed from: u3 */
    public static final void m81550u3(ReplayFragment replayFragment, View view) {
        Boolean boolValueOf;
        String strM81547r3;
        if (replayFragment.getActivity() != null) {
            FragmentActivity activity = replayFragment.getActivity();
            if (activity != null) {
                boolValueOf = Boolean.valueOf(activity.isFinishing());
            } else {
                boolValueOf = null;
            }
            if (!C27025c.m66566d(boolValueOf) && !replayFragment.isDetached() && replayFragment.getContext() != null && (strM81547r3 = replayFragment.m81547r3()) != null && strM81547r3.length() != 0) {
                LiveFlutterHelper.f79161a.m81518c(C27041f.m66668h(replayFragment.m81547r3()));
            }
        }
    }

    /* JADX INFO: renamed from: x3 */
    public static final String m81552x3(ReplayFragment replayFragment) {
        Bundle arguments = replayFragment.getArguments();
        if (arguments != null) {
            return arguments.getString("roomId");
        }
        return null;
    }

    /* JADX INFO: renamed from: y3 */
    public static final String m81553y3(ReplayFragment replayFragment) {
        Bundle arguments = replayFragment.getArguments();
        if (arguments != null) {
            return RouteExKt.m56284y(arguments, "videoUrl");
        }
        return null;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f79172U = null;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        if (Util.SDK_INT <= 23) {
            m81555w3();
            PlayerView playerView = this.f79172U;
            if (playerView != null) {
                playerView.onPause();
            }
            m81551v3();
        }
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (Util.SDK_INT <= 23 || this.f79173V == null) {
            m81549t3();
            PlayerView playerView = this.f79172U;
            if (playerView != null) {
                playerView.onResume();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        if (Util.SDK_INT > 23) {
            m81549t3();
            PlayerView playerView = this.f79172U;
            if (playerView != null) {
                playerView.onResume();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        if (Util.SDK_INT > 23) {
            m81555w3();
            PlayerView playerView = this.f79172U;
            if (playerView != null) {
                playerView.onPause();
            }
            m81551v3();
        }
    }

    /* JADX INFO: renamed from: w3 */
    public final void m81555w3() {
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ReplayFragment$reportReplayExit$1(this, null), 3, null);
    }
}
