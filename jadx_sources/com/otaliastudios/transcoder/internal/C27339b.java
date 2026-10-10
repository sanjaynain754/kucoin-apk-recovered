package com.otaliastudios.transcoder.internal;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.otaliastudios.transcoder.common.TrackType;
import com.otaliastudios.transcoder.internal.pipeline.AbstractC27360f;
import com.otaliastudios.transcoder.internal.pipeline.Pipeline;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;
import w90.C45770i;

/* JADX INFO: renamed from: com.otaliastudios.transcoder.internal.b */
/* JADX INFO: compiled from: Segment.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\fJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0019R\u001e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001c¨\u0006\u001e"}, m90084d2 = {"Lcom/otaliastudios/transcoder/internal/b;", "", "Lcom/otaliastudios/transcoder/common/TrackType;", "type", "", "index", "Lcom/otaliastudios/transcoder/internal/pipeline/Pipeline;", "pipeline", "<init>", "(Lcom/otaliastudios/transcoder/common/TrackType;ILcom/otaliastudios/transcoder/internal/pipeline/Pipeline;)V", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Z", "b", "", "e", "()V", "Lcom/otaliastudios/transcoder/common/TrackType;", "d", "()Lcom/otaliastudios/transcoder/common/TrackType;", "I", "c", "()I", "Lcom/otaliastudios/transcoder/internal/pipeline/Pipeline;", "Lw90/i;", "Lw90/i;", "log", "Lcom/otaliastudios/transcoder/internal/pipeline/f;", "Lcom/otaliastudios/transcoder/internal/pipeline/f;", "state", "lib_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public final class C27339b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final TrackType type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int index;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Pipeline pipeline;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final C45770i log;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public AbstractC27360f<Unit> state;

    /* JADX INFO: renamed from: a */
    public final boolean m67946a() {
        AbstractC27360f<Unit> abstractC27360fM68040a = this.pipeline.m68040a();
        this.state = abstractC27360fM68040a;
        return abstractC27360fM68040a instanceof AbstractC27360f.b;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m67947b() {
        this.log.m101070h(Intrinsics.stringPlus("canAdvance(): state=", this.state));
        AbstractC27360f<Unit> abstractC27360f = this.state;
        return abstractC27360f == null || !(abstractC27360f instanceof AbstractC27360f.a);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final TrackType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: e */
    public final void m67950e() {
        this.pipeline.m68042c();
    }

    public C27339b(@NotNull TrackType type, int i11, @NotNull Pipeline pipeline) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(pipeline, "pipeline");
        this.type = type;
        this.index = i11;
        this.pipeline = pipeline;
        this.log = new C45770i("Segment(" + type + ',' + i11 + ')');
    }
}
