package com.sumsub.sns.internal.features.presentation.videoident.chat;

import android.os.Handler;
import android.os.HandlerThread;
import com.sumsub.sns.internal.features.presentation.videoident.AbstractC32895a;
import com.twilio.video.RemoteAudioTrack;
import com.twilio.video.RemoteVideoTrack;
import com.twilio.video.VideoTextureView;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.C41674s;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41668m;
import kotlinx.coroutines.flow.InterfaceC41669n;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.videoident.chat.u */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32921u {

    /* JADX INFO: renamed from: a */
    public final InterfaceC41709m0 f67353a = C41713n0.m91125a(C41782z0.m91393c());

    /* JADX INFO: renamed from: b */
    public final Handler f67354b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC41668m f67355c;

    /* JADX INFO: renamed from: d */
    public RemoteVideoTrack f67356d;

    /* JADX INFO: renamed from: e */
    public VideoTextureView f67357e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC41669n f67358f;

    /* JADX INFO: renamed from: g */
    public RemoteAudioTrack f67359g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC41668m f67360h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC41669n f67361i;

    /* JADX INFO: renamed from: j */
    public boolean f67362j;

    /* JADX INFO: renamed from: k */
    public final C32919s f67363k;

    /* JADX INFO: renamed from: l */
    public final C32920t f67364l;

    public C32921u() {
        HandlerThread handlerThread = new HandlerThread("RemoteDataTrack");
        AbstractC32895a.m71366a("init messageReceiveThread");
        handlerThread.start();
        this.f67354b = new Handler(handlerThread.getLooper());
        InterfaceC41668m interfaceC41668mM91001b = C41674s.m91001b(0, 10, BufferOverflow.DROP_LATEST, 1, null);
        this.f67355c = interfaceC41668mM91001b;
        InterfaceC41669n interfaceC41669nM91009a = C41679x.m91009a(new C32905e(false, false, false));
        this.f67358f = interfaceC41669nM91009a;
        this.f67360h = interfaceC41668mM91001b;
        this.f67361i = interfaceC41669nM91009a;
        this.f67362j = true;
        this.f67363k = new C32919s(this);
        this.f67364l = new C32920t(this);
    }
}
