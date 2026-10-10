package com.otaliastudios.transcoder.internal.video;

import android.opengl.EGL14;
import android.view.Surface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.appsflyer.AppsFlyerProperties;
import com.otaliastudios.opengl.core.EglCore;
import com.otaliastudios.transcoder.internal.codec.EncoderData;
import com.otaliastudios.transcoder.internal.codec.InterfaceC27350f;
import com.otaliastudios.transcoder.internal.pipeline.AbstractC27360f;
import com.otaliastudios.transcoder.internal.pipeline.InterfaceC27356b;
import com.otaliastudios.transcoder.internal.pipeline.InterfaceC27361g;
import o90.C43003c;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.otaliastudios.transcoder.internal.video.d */
/* JADX INFO: compiled from: VideoPublisher.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00102\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0007R\u001a\u0010\u0018\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u001d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\n\u0010\u001e¨\u0006 "}, m90084d2 = {"Lcom/otaliastudios/transcoder/internal/video/d;", "Lcom/otaliastudios/transcoder/internal/pipeline/g;", "", "Lcom/otaliastudios/transcoder/internal/pipeline/b;", "Lcom/otaliastudios/transcoder/internal/codec/EncoderData;", "Lcom/otaliastudios/transcoder/internal/codec/f;", "<init>", "()V", "next", "", "d", "(Lcom/otaliastudios/transcoder/internal/codec/f;)V", "Lcom/otaliastudios/transcoder/internal/pipeline/f$b;", "state", "", "fresh", "Lcom/otaliastudios/transcoder/internal/pipeline/f;", "b", "(Lcom/otaliastudios/transcoder/internal/pipeline/f$b;Z)Lcom/otaliastudios/transcoder/internal/pipeline/f;", "release", "Lcom/otaliastudios/transcoder/internal/pipeline/b$a;", "Lcom/otaliastudios/transcoder/internal/pipeline/b$a;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Lcom/otaliastudios/transcoder/internal/pipeline/b$a;", AppsFlyerProperties.CHANNEL, "Lcom/otaliastudios/opengl/core/EglCore;", "c", "Lcom/otaliastudios/opengl/core/EglCore;", "core", "Lo90/c;", "Lo90/c;", "surface", "lib_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public final class C27368d implements InterfaceC27361g<Long, InterfaceC27356b, EncoderData, InterfaceC27350f> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC27356b.Companion channel = InterfaceC27356b.INSTANCE;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final EglCore core = new EglCore(EGL14.EGL_NO_CONTEXT, 1);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public C43003c surface;

    @Override // com.otaliastudios.transcoder.internal.pipeline.InterfaceC27361g
    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public InterfaceC27356b.Companion getChannel() {
        return this.channel;
    }

    @Override // com.otaliastudios.transcoder.internal.pipeline.InterfaceC27361g
    public void release() {
        C43003c c43003c = this.surface;
        if (c43003c == null) {
            Intrinsics.throwUninitializedPropertyAccessException("surface");
            c43003c = null;
        }
        c43003c.mo94431d();
        this.core.m67819g();
    }

    @Override // com.otaliastudios.transcoder.internal.pipeline.InterfaceC27361g
    @NotNull
    /* JADX INFO: renamed from: b */
    public AbstractC27360f<EncoderData> mo67997b(@NotNull AbstractC27360f.b<Long> state, boolean fresh) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state instanceof AbstractC27360f.a) {
            return new AbstractC27360f.a(EncoderData.INSTANCE.getEmpty());
        }
        C43003c c43003c = this.surface;
        C43003c c43003c2 = null;
        if (c43003c == null) {
            Intrinsics.throwUninitializedPropertyAccessException("surface");
            c43003c = null;
        }
        c43003c.m94432e(state.m68053a().longValue() * ((long) 1000));
        C43003c c43003c3 = this.surface;
        if (c43003c3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("surface");
        } else {
            c43003c2 = c43003c3;
        }
        c43003c2.m94433g();
        return new AbstractC27360f.b(EncoderData.INSTANCE.getEmpty());
    }

    @Override // com.otaliastudios.transcoder.internal.pipeline.InterfaceC27361g
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo67962c(@NotNull InterfaceC27350f next) {
        Intrinsics.checkNotNullParameter(next, "next");
        InterfaceC27361g.a.m68054a(this, next);
        EglCore eglCore = this.core;
        Surface surface = next.getSurface();
        Intrinsics.checkNotNull(surface);
        C43003c c43003c = new C43003c(eglCore, surface, false);
        this.surface = c43003c;
        c43003c.m94430c();
    }
}
