package com.kubi.user.video;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.ErrorMessageProvider;
import androidx.media3.common.MediaItem;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.Player;
import androidx.media3.common.Tracks;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.SimpleExoPlayer;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.media3.p022ui.PlayerView;
import c70.C4893r;
import com.google.firebase.messaging.Constants;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.user.R$layout;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import ro.C44128b;
import w00.C45681e;

/* JADX INFO: compiled from: VideoFragment.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0002#$B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u001a\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u001d\u001a\u00020\u001bH\u0016J\b\u0010\u001e\u001a\u00020\u001bH\u0016J\b\u0010\u001f\u001a\u00020\u001bH\u0016J\b\u0010 \u001a\u00020\u001bH\u0016J\u0006\u0010!\u001a\u00020\u001bJ\u0006\u0010\"\u001a\u00020\u001bR\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\n\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, m90084d2 = {"Lcom/kubi/user/video/VideoFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "binding", "Lcom/kubi/user/databinding/BusercenterFragmentVideoBinding;", "getBinding", "()Lcom/kubi/user/databinding/BusercenterFragmentVideoBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "videoUrl", "", "getVideoUrl", "()Ljava/lang/String;", "videoUrl$delegate", "Lkotlin/Lazy;", "player", "Landroidx/media3/exoplayer/SimpleExoPlayer;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "onStart", "onResume", "onPause", "onStop", "releasePlayer", "initializePlayer", "PlayerErrorMessageProvider", "PlayerEventListener", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nVideoFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VideoFragment.kt\ncom/kubi/user/video/VideoFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,146:1\n147#2,16:147\n*S KotlinDebug\n*F\n+ 1 VideoFragment.kt\ncom/kubi/user/video/VideoFragment\n*L\n36#1:147,16\n*E\n"})
public final class VideoFragment extends BaseFragment {

    /* JADX INFO: renamed from: X */
    public static final /* synthetic */ KProperty<Object>[] f53887X = {Reflection.property1(new PropertyReference1Impl(VideoFragment.class, "binding", "getBinding()Lcom/kubi/user/databinding/BusercenterFragmentVideoBinding;", 0))};

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f53888U = C45681e.m100799e(this, new Function1<VideoFragment, C4893r>() { // from class: com.kubi.user.video.VideoFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C4893r invoke(@NotNull VideoFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C4893r.m5065a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C4893r, Unit>() { // from class: com.kubi.user.video.VideoFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C4893r it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4893r c4893r) {
            invoke(c4893r);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f53889V = LazyKt.lazy(new Function0() { // from class: com.kubi.user.video.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return VideoFragment.m65886o3(this.f53893b);
        }
    });

    /* JADX INFO: renamed from: W */
    @Nullable
    public SimpleExoPlayer f53890W;

    /* JADX INFO: renamed from: com.kubi.user.video.VideoFragment$a */
    /* JADX INFO: compiled from: VideoFragment.kt */
    /* JADX INFO: loaded from: classes53.dex */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001c\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\n"}, m90084d2 = {"Lcom/kubi/user/video/VideoFragment$PlayerErrorMessageProvider;", "Landroidx/media3/common/ErrorMessageProvider;", "Landroidx/media3/common/PlaybackException;", "<init>", "(Lcom/kubi/user/video/VideoFragment;)V", "getErrorMessage", "Landroid/util/Pair;", "", "", "throwable", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public final class C26841a implements ErrorMessageProvider<PlaybackException> {
        public C26841a() {
        }

        @Override // androidx.media3.common.ErrorMessageProvider
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Pair<Integer, String> getErrorMessage(@NotNull PlaybackException throwable) {
            String message;
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            if ((throwable instanceof ExoPlaybackException ? (ExoPlaybackException) throwable : null) == null) {
                Pair<Integer, String> pairCreate = Pair.create(0, throwable.getMessage());
                Intrinsics.checkNotNullExpressionValue(pairCreate, "create(...)");
                return pairCreate;
            }
            VideoFragment videoFragment = VideoFragment.this;
            int i11 = ((ExoPlaybackException) throwable).type;
            C44128b.m97268l(videoFragment.getTAG(), "getErrorMessage: [errorType]: " + i11);
            try {
                message = ((ExoPlaybackException) throwable).getRendererException().getMessage();
            } catch (Throwable th2) {
                C44128b.m97268l(videoFragment.getTAG(), "rendererException: [errorMsg]: " + th2.getMessage());
                message = "";
            }
            C44128b.m97268l(videoFragment.getTAG(), "getErrorMessage: [errorMsg]: " + message);
            Pair<Integer, String> pairCreate2 = Pair.create(0, message);
            Intrinsics.checkNotNullExpressionValue(pairCreate2, "create(...)");
            return pairCreate2;
        }
    }

    /* JADX INFO: renamed from: com.kubi.user.video.VideoFragment$b */
    /* JADX INFO: compiled from: VideoFragment.kt */
    /* JADX INFO: loaded from: classes53.dex */
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rH\u0016¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/user/video/VideoFragment$PlayerEventListener;", "Landroidx/media3/common/Player$Listener;", "<init>", "(Lcom/kubi/user/video/VideoFragment;)V", "onPlaybackStateChanged", "", "state", "", "onPlayerError", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Landroidx/media3/common/PlaybackException;", "onTracksChanged", "tracks", "Landroidx/media3/common/Tracks;", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public final class C26842b implements Player.Listener {
        public C26842b() {
        }

        @Override // androidx.media3.common.Player.Listener
        public void onPlayerError(@NotNull PlaybackException error) {
            Intrinsics.checkNotNullParameter(error, "error");
            super.onPlayerError(error);
            C44128b.m97268l(VideoFragment.this.getTAG(), "onPlaybackStateChanged: [error]:" + error);
        }

        @Override // androidx.media3.common.Player.Listener
        public void onTracksChanged(@NotNull Tracks tracks) {
            Intrinsics.checkNotNullParameter(tracks, "tracks");
            super.onTracksChanged(tracks);
            C44128b.m97268l(VideoFragment.this.getTAG(), "onPlaybackStateChanged: [tracks]:" + tracks);
        }

        @Override // androidx.media3.common.Player.Listener
        public void onPlaybackStateChanged(int state) {
            super.onPlaybackStateChanged(state);
            C44128b.m97268l(VideoFragment.this.getTAG(), "onPlaybackStateChanged: [state]:" + state);
        }
    }

    /* JADX INFO: renamed from: k3 */
    public final C4893r m65887k3() {
        return (C4893r) this.f53888U.getValue(this, f53887X[0]);
    }

    /* JADX INFO: renamed from: l3 */
    public final String m65888l3() {
        return (String) this.f53889V.getValue();
    }

    /* JADX INFO: renamed from: n3 */
    public final void m65890n3() {
        SimpleExoPlayer simpleExoPlayer = this.f53890W;
        if (simpleExoPlayer != null) {
            simpleExoPlayer.release();
        }
        this.f53890W = null;
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.busercenter_fragment_video, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    /* JADX INFO: renamed from: o3 */
    public static final String m65886o3(VideoFragment videoFragment) {
        Bundle arguments = videoFragment.getArguments();
        if (arguments != null) {
            return RouteExKt.m56239b0(arguments, "url");
        }
        return null;
    }

    /* JADX INFO: renamed from: m3 */
    public final void m65889m3() {
        String strM65888l3;
        PlayerView playerView;
        PlayerView playerView2;
        Context context = getContext();
        if (context != null && (strM65888l3 = m65888l3()) != null) {
            this.f53890W = new SimpleExoPlayer.Builder(context).build();
            C4893r c4893rM65887k3 = m65887k3();
            if (c4893rM65887k3 != null && (playerView2 = c4893rM65887k3.f5287b) != null) {
                playerView2.setPlayer(this.f53890W);
            }
            C4893r c4893rM65887k4 = m65887k3();
            if (c4893rM65887k4 != null && (playerView = c4893rM65887k4.f5287b) != null) {
                playerView.requestFocus();
            }
            SimpleExoPlayer simpleExoPlayer = this.f53890W;
            if (simpleExoPlayer != null) {
                simpleExoPlayer.setPlayWhenReady(true);
            }
            MediaItem mediaItemFromUri = MediaItem.fromUri(strM65888l3);
            Intrinsics.checkNotNullExpressionValue(mediaItemFromUri, "fromUri(...)");
            SimpleExoPlayer simpleExoPlayer2 = this.f53890W;
            if (simpleExoPlayer2 != null) {
                simpleExoPlayer2.setMediaItem(mediaItemFromUri);
            }
            SimpleExoPlayer simpleExoPlayer3 = this.f53890W;
            if (simpleExoPlayer3 != null) {
                simpleExoPlayer3.setAudioAttributes(AudioAttributes.DEFAULT, true);
            }
            SimpleExoPlayer simpleExoPlayer4 = this.f53890W;
            if (simpleExoPlayer4 != null) {
                simpleExoPlayer4.addListener(new C26842b());
            }
            SimpleExoPlayer simpleExoPlayer5 = this.f53890W;
            if (simpleExoPlayer5 != null) {
                simpleExoPlayer5.prepare();
            }
            SimpleExoPlayer simpleExoPlayer6 = this.f53890W;
            if (simpleExoPlayer6 != null) {
                simpleExoPlayer6.play();
            }
        }
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onPause() {
        PlayerView playerView;
        super.onPause();
        if (Util.SDK_INT <= 23) {
            C4893r c4893rM65887k3 = m65887k3();
            if (c4893rM65887k3 != null && (playerView = c4893rM65887k3.f5287b) != null) {
                playerView.onPause();
            }
            m65890n3();
        }
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        PlayerView playerView;
        super.onResume();
        if (Util.SDK_INT <= 23 || this.f53890W == null) {
            m65889m3();
            C4893r c4893rM65887k3 = m65887k3();
            if (c4893rM65887k3 != null && (playerView = c4893rM65887k3.f5287b) != null) {
                playerView.onResume();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        PlayerView playerView;
        super.onStart();
        if (Util.SDK_INT > 23) {
            m65889m3();
            C4893r c4893rM65887k3 = m65887k3();
            if (c4893rM65887k3 != null && (playerView = c4893rM65887k3.f5287b) != null) {
                playerView.onResume();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        PlayerView playerView;
        super.onStop();
        if (Util.SDK_INT > 23) {
            C4893r c4893rM65887k3 = m65887k3();
            if (c4893rM65887k3 != null && (playerView = c4893rM65887k3.f5287b) != null) {
                playerView.onPause();
            }
            m65890n3();
        }
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        PlayerView playerView;
        PlayerView playerView2;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C4893r c4893rM65887k3 = m65887k3();
        if (c4893rM65887k3 != null && (playerView2 = c4893rM65887k3.f5287b) != null) {
            playerView2.setErrorMessageProvider(new C26841a());
        }
        C4893r c4893rM65887k4 = m65887k3();
        if (c4893rM65887k4 != null && (playerView = c4893rM65887k4.f5287b) != null) {
            playerView.requestFocus();
        }
    }
}
