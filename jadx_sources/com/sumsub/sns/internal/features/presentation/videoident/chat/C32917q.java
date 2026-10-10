package com.sumsub.sns.internal.features.presentation.videoident.chat;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.AudioManager;
import androidx.core.content.ContextCompat;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.internal.core.common.AbstractC28400J;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.domain.SNSDebugConstants;
import com.sumsub.sns.internal.features.presentation.videoident.AbstractC32895a;
import com.sumsub.sns.internal.features.presentation.videoident.SNSVideoIdent;
import com.sumsub.sns.internal.features.presentation.videoident.twilio.C33042b;
import com.sumsub.sns.internal.features.presentation.videoident.twilio.C33046f;
import com.sumsub.sns.internal.features.presentation.videoident.twilio.CameraCapturerCompat$Source;
import com.sumsub.sns.internal.log.C33272c;
import com.sumsub.sns.internal.log.LoggerType;
import com.sumsub.sns.internal.p125ff.C33048a;
import com.sumsub.sns.internal.p125ff.core.C33050a;
import com.twilio.audioswitch.AudioSwitch;
import com.twilio.video.ConnectOptions;
import com.twilio.video.H264Codec;
import com.twilio.video.LocalAudioTrack;
import com.twilio.video.LocalDataTrack;
import com.twilio.video.LocalDataTrackPublication;
import com.twilio.video.LocalParticipant;
import com.twilio.video.LocalVideoTrack;
import com.twilio.video.RemoteAudioTrack;
import com.twilio.video.RemoteVideoTrack;
import com.twilio.video.Room;
import com.twilio.video.Video;
import com.twilio.video.VideoCodec;
import com.twilio.video.VideoDimensions;
import com.twilio.video.VideoFormat;
import com.twilio.video.VideoTextureView;
import com.twilio.video.VideoView;
import com.twilio.video.Vp8Codec;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41775x1;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.C41674s;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41669n;
import kotlinx.coroutines.flow.InterfaceC41673r;
import kotlinx.coroutines.flow.SharingStarted;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import tvi.webrtc.VideoProcessor;
import tvi.webrtc.VideoSource;
import xg0.AbstractC46162a;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.videoident.chat.q */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32917q {

    /* JADX INFO: renamed from: a */
    public C32897B f67329a;

    /* JADX INFO: renamed from: b */
    public InterfaceC41775x1 f67330b;

    /* JADX INFO: renamed from: c */
    public long f67331c;

    /* JADX INFO: renamed from: d */
    public boolean f67332d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC41634e f67333e = C41636g.m90887K(new C32909i(this, null));

    /* JADX INFO: renamed from: f */
    public final InterfaceC41709m0 f67334f;

    /* JADX INFO: renamed from: g */
    public final C32921u f67335g;

    /* JADX INFO: renamed from: h */
    public LocalDataTrack f67336h;

    /* JADX INFO: renamed from: i */
    public LocalAudioTrack f67337i;

    /* JADX INFO: renamed from: j */
    public LocalVideoTrack f67338j;

    /* JADX INFO: renamed from: k */
    public C32901a f67339k;

    /* JADX INFO: renamed from: l */
    public LocalParticipant f67340l;

    /* JADX INFO: renamed from: m */
    public Room f67341m;

    /* JADX INFO: renamed from: n */
    public final InterfaceC41669n f67342n;

    /* JADX INFO: renamed from: o */
    public Function1 f67343o;

    /* JADX INFO: renamed from: p */
    public final InterfaceC41673r f67344p;

    /* JADX INFO: renamed from: q */
    public Function0 f67345q;

    /* JADX INFO: renamed from: r */
    public Function1 f67346r;

    /* JADX INFO: renamed from: s */
    public Function0 f67347s;

    /* JADX INFO: renamed from: t */
    public final C32906f f67348t;

    /* JADX INFO: renamed from: u */
    public final C32910j f67349u;

    /* JADX INFO: renamed from: a */
    public static VideoCodec m71367a(VideoCodec videoCodec) {
        throw null;
    }

    /* JADX INFO: renamed from: a */
    public static final void m71370a(C32917q c32917q, int i11) {
        FocusStatus c32903c;
        FocusStatus focusStatus;
        c32917q.getClass();
        if (i11 != -3 && i11 != -2 && i11 != -1) {
            if (i11 == 1 || i11 == 2 || i11 == 3 || i11 == 4) {
                c32903c = new C32902b(i11 != 1);
            } else {
                focusStatus = C32904d.f67308a;
            }
            c32917q.m71374a(focusStatus);
        }
        c32903c = new C32903c(i11 != -1);
        focusStatus = c32903c;
        c32917q.m71374a(focusStatus);
    }

    /* JADX INFO: renamed from: b */
    public final void m71378b(VideoView videoView) {
        if (this.f67338j != null) {
            return;
        }
        Context applicationContext = videoView.getContext().getApplicationContext();
        this.f67329a = new C32897B((AudioManager) applicationContext.getSystemService("audio"), new C33042b(new AudioSwitch(applicationContext, false, new AudioManager.OnAudioFocusChangeListener() { // from class: com.sumsub.sns.internal.features.presentation.videoident.chat.o
            @Override // android.media.AudioManager.OnAudioFocusChangeListener
            public final void onAudioFocusChange(int i11) {
                C32917q.m71370a(this.f67327b, i11);
            }
        }, (List) null, 10, (DefaultConstructorMarker) null)));
        if (this.f67336h == null) {
            this.f67336h = LocalDataTrack.create(applicationContext);
        }
        m71372a(applicationContext);
        m71375a(videoView);
        if (this.f67337i != null) {
            AbstractC32895a.m71366a("startLocalMediaTracking: audio already started");
            return;
        }
        if (ContextCompat.checkSelfPermission(applicationContext, "android.permission.RECORD_AUDIO") == 0) {
            LocalAudioTrack localAudioTrackCreate = LocalAudioTrack.create(applicationContext, true);
            this.f67337i = localAudioTrackCreate;
            if (localAudioTrackCreate != null) {
                localAudioTrackCreate.enable(true ^ SNSDebugConstants.INSTANCE.getMuteVideoIdent());
            }
        }
    }

    public C32917q() {
        InterfaceC41709m0 interfaceC41709m0M91125a = C41713n0.m91125a(C41782z0.m91393c());
        this.f67334f = interfaceC41709m0M91125a;
        C32921u c32921u = new C32921u();
        C41696j.m91104d(interfaceC41709m0M91125a, null, null, new C32908h(c32921u, this, null), 3, null);
        this.f67335g = c32921u;
        this.f67342n = C41679x.m91009a(new C32923x());
        this.f67344p = C41636g.m90910d0(C41636g.m90894R(c32921u.f67360h, C41674s.m91001b(0, 0, null, 7, null)), interfaceC41709m0M91125a, SharingStarted.INSTANCE.getLazily(), 1);
        this.f67348t = new C32906f();
        this.f67349u = new C32910j(this);
    }

    /* JADX INFO: renamed from: a */
    public final void m71374a(FocusStatus focusStatus) {
        AbstractC32895a.m71366a("handleFocusStatusChange: " + focusStatus);
        boolean z11 = focusStatus instanceof C32902b;
        LocalAudioTrack localAudioTrack = this.f67337i;
        if (localAudioTrack != null) {
            localAudioTrack.enable(z11);
        }
        C32921u c32921u = this.f67335g;
        c32921u.f67362j = z11;
        RemoteAudioTrack remoteAudioTrack = c32921u.f67359g;
        if (remoteAudioTrack != null) {
            remoteAudioTrack.enablePlayback(z11 && !SNSDebugConstants.INSTANCE.getMuteVideoIdent());
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m71372a(Context context) {
        if (this.f67338j != null) {
            AbstractC32895a.m71366a("startVideoTracking: video already started");
            if (this.f67338j == null) {
                throw new IllegalStateException("Required value was null.");
            }
            return;
        }
        C33046f c33046f = new C33046f();
        boolean zM71428a = c33046f.m71428a(context, CameraCapturerCompat$Source.FRONT_CAMERA);
        AbstractC32895a.m71366a("startLocalVideoTracking: camera=" + c33046f.m71427a());
        if (zM71428a) {
            LocalVideoTrack localVideoTrackCreate = LocalVideoTrack.create(context, true, c33046f, new VideoFormat(VideoDimensions.HD_1080P_VIDEO_DIMENSIONS, 24));
            if (localVideoTrackCreate != null) {
                LocalParticipant localParticipant = this.f67340l;
                if (localParticipant != null) {
                    localParticipant.publishTrack(localVideoTrackCreate);
                }
            } else {
                localVideoTrackCreate = null;
            }
            this.f67338j = localVideoTrackCreate;
        }
        if (this.f67338j == null) {
            C33272c c33272c = C33272c.f67812a;
            Logger.DefaultImpls.e$default(C33272c.m71618b(ArraysKt.toList(new LoggerType[]{LoggerType.KIBANA})), SNSVideoIdent.logTag, "startLocalVideoTracking: error creating local video track", null, 4, null);
        }
        C32901a c32901a = new C32901a();
        this.f67339k = c32901a;
        c32901a.f67304b = new Function0() { // from class: com.sumsub.sns.internal.features.presentation.videoident.chat.p
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C32917q.m71368a(this.f67328b);
            }
        };
        C32901a c32901a2 = this.f67339k;
        if (c32901a2 != null) {
            c32901a2.f67305c = new Function1() { // from class: com.sumsub.sns.internal.features.presentation.videoident.chat.r
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C32917q.m71369a(this.f67350b, (Bitmap) obj);
                }
            };
        }
        if (this.f67338j == null) {
            throw new IllegalStateException("Required value was null.");
        }
    }

    /* JADX INFO: renamed from: b */
    public final SNSVideoChatController$CameraId m71377b() {
        C33046f videoCapturer;
        CameraCapturerCompat$Source cameraCapturerCompat$SourceM71427a;
        LocalVideoTrack localVideoTrack = this.f67338j;
        if (localVideoTrack != null && (videoCapturer = localVideoTrack.getVideoCapturer()) != null) {
            C33046f c33046f = videoCapturer instanceof C33046f ? videoCapturer : null;
            if (c33046f != null && (cameraCapturerCompat$SourceM71427a = c33046f.m71427a()) != null) {
                if (cameraCapturerCompat$SourceM71427a == CameraCapturerCompat$Source.BACK_CAMERA) {
                    return SNSVideoChatController$CameraId.BACK;
                }
                return SNSVideoChatController$CameraId.FRONT;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m71368a(C32917q c32917q) {
        C41696j.m91104d(c32917q.f67334f, null, null, new C32911k(c32917q, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m71369a(C32917q c32917q, Bitmap bitmap) {
        VideoSource videoSource;
        LocalVideoTrack localVideoTrack = c32917q.f67338j;
        if (localVideoTrack != null && (videoSource = localVideoTrack.getVideoSource()) != null) {
            videoSource.setVideoProcessor((VideoProcessor) null);
        }
        C41696j.m91104d(c32917q.f67334f, null, null, new C32914n(bitmap, c32917q, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public final void m71375a(VideoView videoView) {
        List sinks;
        LocalVideoTrack localVideoTrack = this.f67338j;
        if (localVideoTrack != null) {
            localVideoTrack.enable(true);
        }
        LocalVideoTrack localVideoTrack2 = this.f67338j;
        if (localVideoTrack2 != null && (sinks = localVideoTrack2.getSinks()) != null && sinks.contains(videoView)) {
            AbstractC32895a.m71366a("bindLocalVideoView: already added");
            return;
        }
        LocalVideoTrack localVideoTrack3 = this.f67338j;
        if (localVideoTrack3 != null) {
            localVideoTrack3.addSink(videoView);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m71373a(Context context, String str, String str2) {
        VideoCodec h264Codec;
        Map mapMapOf = MapsKt.mapOf(TuplesKt.m90091to("vp8", new Vp8Codec()), TuplesKt.m90091to("h264", new H264Codec()));
        C33050a c33050a = C33048a.f67470d;
        String str3 = c33050a.m71435b().f67504b;
        if (str3 == null) {
            str3 = c33050a.f67500g.f67504b;
        }
        if (str3 != null) {
            AbstractC46162a abstractC46162aM69286a = AbstractC28400J.m69286a(C28468k0.f57988f);
            abstractC46162aM69286a.getSerializersModule();
            String str4 = ((C32900F) abstractC46162aM69286a.mo99408a(C32900F.Companion.serializer(), str3)).f67302a;
            if (str4 == null || (h264Codec = (VideoCodec) mapMapOf.get(str4)) == null) {
                h264Codec = new H264Codec();
            }
            ConnectOptions.Builder builderPreferVideoCodecs = new ConnectOptions.Builder(str).roomName(str2).preferVideoCodecs(CollectionsKt.listOf(m71367a(h264Codec)));
            LocalAudioTrack localAudioTrack = this.f67337i;
            if (localAudioTrack != null) {
                builderPreferVideoCodecs.audioTracks(CollectionsKt.listOf(localAudioTrack));
            }
            LocalDataTrack localDataTrack = this.f67336h;
            if (localDataTrack != null) {
                builderPreferVideoCodecs.dataTracks(CollectionsKt.listOf(localDataTrack));
            }
            LocalVideoTrack localVideoTrack = this.f67338j;
            if (localVideoTrack != null) {
                builderPreferVideoCodecs.videoTracks(CollectionsKt.listOf(localVideoTrack));
            }
            ConnectOptions connectOptionsBuild = builderPreferVideoCodecs.build();
            this.f67342n.setValue(C32922w.f67365a);
            this.f67341m = Video.connect(context, connectOptionsBuild, this.f67349u);
            LocalDataTrack localDataTrack2 = this.f67336h;
            AbstractC32895a.m71366a("connectToRoom: localDataTrack=" + (localDataTrack2 != null ? localDataTrack2.getName() : null));
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX INFO: renamed from: a */
    public final void m71371a() {
        RemoteVideoTrack remoteVideoTrack;
        AbstractC32895a.m71366a("disconnect");
        C32921u c32921u = this.f67335g;
        VideoTextureView videoTextureView = c32921u.f67357e;
        if (videoTextureView != null && (remoteVideoTrack = c32921u.f67356d) != null) {
            remoteVideoTrack.removeSink(videoTextureView);
        }
        c32921u.f67356d = null;
        c32921u.f67357e = null;
        c32921u.f67358f.setValue(new C32905e(false, false, false));
        Room room = this.f67341m;
        if (room != null) {
            room.disconnect();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m71376a(String str) {
        List localDataTracks;
        LocalDataTrackPublication localDataTrackPublication;
        LocalDataTrack localDataTrack = this.f67336h;
        if (localDataTrack != null) {
            LocalParticipant localParticipant = this.f67340l;
            LocalDataTrack localDataTrack2 = (localParticipant == null || (localDataTracks = localParticipant.getLocalDataTracks()) == null || (localDataTrackPublication = (LocalDataTrackPublication) CollectionsKt.first(localDataTracks)) == null) ? null : localDataTrackPublication.getLocalDataTrack();
            if (!Intrinsics.areEqual(this.f67336h, localDataTrack2)) {
                AbstractC32895a.m71366a("sendMessage: published dt=" + localDataTrack2 + ", local dt=" + this.f67336h);
                C33272c c33272c = C33272c.f67812a;
                Logger.DefaultImpls.w$default(C33272c.m71618b(ArraysKt.toList(new LoggerType[]{LoggerType.KIBANA})), SNSVideoIdent.logTag, "local data track changed", null, 4, null);
            }
            AbstractC32895a.m71366a("sendMessage: " + str);
            localDataTrack.send(str);
        }
    }
}
