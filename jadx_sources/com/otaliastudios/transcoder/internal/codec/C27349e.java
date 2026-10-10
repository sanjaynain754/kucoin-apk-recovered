package com.otaliastudios.transcoder.internal.codec;

import java.nio.ByteBuffer;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.otaliastudios.transcoder.internal.codec.e */
/* JADX INFO: compiled from: DecoderTimer.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001BJ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\t¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0018¨\u0006\u0019"}, m90084d2 = {"Lcom/otaliastudios/transcoder/internal/codec/e;", "Lcom/otaliastudios/transcoder/internal/codec/b;", "Ljava/nio/ByteBuffer;", "buffer", "", "rawTimeUs", "timeUs", "", "timeStretch", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "render", "", "release", "<init>", "(Ljava/nio/ByteBuffer;JJDLkotlin/jvm/functions/Function1;)V", "d", "J", "getRawTimeUs", "()J", "e", "D", "()D", "lib_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public final class C27349e extends C27346b {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final long rawTimeUs;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final double timeStretch;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27349e(@NotNull ByteBuffer buffer, long j11, long j12, double d11, @NotNull Function1<? super Boolean, Unit> release) {
        super(buffer, j12, release);
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(release, "release");
        this.rawTimeUs = j11;
        this.timeStretch = d11;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final double getTimeStretch() {
        return this.timeStretch;
    }
}
