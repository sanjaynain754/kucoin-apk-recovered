package com.tencent.thumbplayer.tcmedia.p164g.p166b;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import com.tencent.thumbplayer.tcmedia.p164g.p165a.InterfaceC35358a;
import com.tencent.thumbplayer.tcmedia.p164g.p171f.C35376a;
import com.tencent.thumbplayer.tcmedia.p164g.p173h.C35380b;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.g.b.d */
/* JADX INFO: loaded from: classes64.dex */
public final class C35364d implements InterfaceC35363c {

    /* JADX INFO: renamed from: a */
    private static AtomicInteger f76077a = new AtomicInteger(0);

    /* JADX INFO: renamed from: b */
    private final MediaCodec f76078b;

    @Override // com.tencent.thumbplayer.tcmedia.p164g.p166b.InterfaceC35363c
    /* JADX INFO: renamed from: a */
    public final int mo78238a(long j11) {
        return this.f76078b.dequeueInputBuffer(j11);
    }

    @Override // com.tencent.thumbplayer.tcmedia.p164g.p166b.InterfaceC35363c
    /* JADX INFO: renamed from: b */
    public final C35376a.b mo78246b(C35365e c35365e) {
        C35380b.m78337d("DirectCodecWrapper", "setCanReuseType setCodecCallback ignore...");
        return C35376a.b.KEEP_CODEC_RESULT_NO;
    }

    @Override // com.tencent.thumbplayer.tcmedia.p164g.p166b.InterfaceC35363c
    /* JADX INFO: renamed from: a */
    public final int mo78239a(MediaCodec.BufferInfo bufferInfo, long j11) {
        return this.f76078b.dequeueOutputBuffer(bufferInfo, j11);
    }

    @Override // com.tencent.thumbplayer.tcmedia.p164g.p166b.InterfaceC35363c
    /* JADX INFO: renamed from: b */
    public final void mo78247b() {
    }

    @Override // com.tencent.thumbplayer.tcmedia.p164g.p166b.InterfaceC35363c
    /* JADX INFO: renamed from: c */
    public final void mo78248c() {
        C35380b.m78337d("DirectCodecWrapper", "DirectCodecWrapper prepareToReUse ignore...");
    }

    @Override // com.tencent.thumbplayer.tcmedia.p164g.p166b.InterfaceC35363c
    /* JADX INFO: renamed from: d */
    public final void mo78249d() {
        C35380b.m78336c("DirectCodecWrapper", "DirectCodecWrapper start ...");
        this.f76078b.start();
        C35380b.m78336c("DirectCodecWrapper", "DirectCodecWrapper start end...");
    }

    @Override // com.tencent.thumbplayer.tcmedia.p164g.p166b.InterfaceC35363c
    /* JADX INFO: renamed from: e */
    public final void mo78250e() {
        C35380b.m78336c("DirectCodecWrapper", "DirectCodecWrapper flush start ...");
        this.f76078b.flush();
        C35380b.m78336c("DirectCodecWrapper", "DirectCodecWrapper flush end ...");
    }

    @Override // com.tencent.thumbplayer.tcmedia.p164g.p166b.InterfaceC35363c
    /* JADX INFO: renamed from: f */
    public final void mo78251f() {
        C35380b.m78336c("DirectCodecWrapper", "DirectCodecWrapper stop before ...");
        this.f76078b.stop();
        C35380b.m78336c("DirectCodecWrapper", "DirectCodecWrapper stop end ...");
    }

    @Override // com.tencent.thumbplayer.tcmedia.p164g.p166b.InterfaceC35363c
    /* JADX INFO: renamed from: g */
    public final void mo78252g() {
        C35380b.m78336c("DirectCodecWrapper", "DirectCodecWrapper release start ...");
        this.f76078b.release();
        C35380b.m78336c("DirectCodecWrapper", "DirectCodecWrapper release end ... sCodecNum:" + f76077a.decrementAndGet());
    }

    public C35364d(MediaCodec mediaCodec) {
        this.f76078b = mediaCodec;
        C35380b.m78336c("DirectCodecWrapper", "DirectCodecWrapper sCodecNum:" + f76077a.incrementAndGet());
    }

    @Override // com.tencent.thumbplayer.tcmedia.p164g.p166b.InterfaceC35363c
    /* JADX INFO: renamed from: a */
    public final MediaCodec mo78240a() {
        return this.f76078b;
    }

    @Override // com.tencent.thumbplayer.tcmedia.p164g.p166b.InterfaceC35363c
    /* JADX INFO: renamed from: a */
    public final void mo78241a(int i11, int i12, int i13, long j11, int i14) {
        this.f76078b.queueInputBuffer(i11, i12, i13, j11, i14);
    }

    @Override // com.tencent.thumbplayer.tcmedia.p164g.p166b.InterfaceC35363c
    /* JADX INFO: renamed from: a */
    public final void mo78242a(int i11, boolean z11) {
        this.f76078b.releaseOutputBuffer(i11, z11);
    }

    @Override // com.tencent.thumbplayer.tcmedia.p164g.p166b.InterfaceC35363c
    /* JADX INFO: renamed from: a */
    public final void mo78243a(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i11) {
        this.f76078b.configure(mediaFormat, surface, mediaCrypto, i11);
    }

    @Override // com.tencent.thumbplayer.tcmedia.p164g.p166b.InterfaceC35363c
    /* JADX INFO: renamed from: a */
    public final void mo78244a(Surface surface) {
        C35380b.m78336c("DirectCodecWrapper", "DirectCodecWrapper setOutputSurface start, surface:".concat(String.valueOf(surface)));
        this.f76078b.setOutputSurface(surface);
        C35380b.m78336c("DirectCodecWrapper", "DirectCodecWrapper setOutputSurface end ...");
    }

    @Override // com.tencent.thumbplayer.tcmedia.p164g.p166b.InterfaceC35363c
    /* JADX INFO: renamed from: a */
    public final void mo78245a(InterfaceC35358a interfaceC35358a) {
        C35380b.m78337d("DirectCodecWrapper", "DirectCodecWrapper setCodecCallback ignore...");
    }
}
