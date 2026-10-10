package com.otaliastudios.transcoder.internal.audio;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.nio.ShortBuffer;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.ArrayDeque;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.otaliastudios.transcoder.internal.audio.a */
/* JADX INFO: compiled from: chunks.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ3\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0016Jh\u0010\u001d\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00172\u0006\u0010\u0018\u001a\u00028\u00002K\u0010\u001c\u001aG\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00028\u00000\u0019¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001fR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001fR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020!0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\"¨\u0006$"}, m90084d2 = {"Lcom/otaliastudios/transcoder/internal/audio/a;", "", "", "sampleRate", "channels", "<init>", "(II)V", "", "d", "()Z", "Ljava/nio/ShortBuffer;", "buffer", "", "timeUs", "", "timeStretch", "Lkotlin/Function0;", "", "release", "b", "(Ljava/nio/ShortBuffer;JDLkotlin/jvm/functions/Function0;)V", "c", "()V", ExifInterface.GPS_DIRECTION_TRUE, "eos", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", TUIConstants.TIMPush.NOTIFICATION.ACTION, CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "I", "Lkotlin/collections/ArrayDeque;", "Lcom/otaliastudios/transcoder/internal/audio/Chunk;", "Lkotlin/collections/ArrayDeque;", "queue", "lib_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public final class C27336a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int sampleRate;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int channels;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final ArrayDeque<Chunk> queue = new ArrayDeque<>();

    /* JADX INFO: renamed from: a */
    public final <T> T m67935a(T eos, @NotNull Function3<? super ShortBuffer, ? super Long, ? super Double, ? extends T> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        Chunk chunkRemoveFirst = this.queue.removeFirst();
        if (chunkRemoveFirst == Chunk.INSTANCE.getEos()) {
            return eos;
        }
        int iRemaining = chunkRemoveFirst.getBuffer().remaining();
        int iLimit = chunkRemoveFirst.getBuffer().limit();
        T tInvoke = action.invoke(chunkRemoveFirst.getBuffer(), Long.valueOf(chunkRemoveFirst.getTimeUs()), Double.valueOf(chunkRemoveFirst.getTimeStretch()));
        chunkRemoveFirst.getBuffer().limit(iLimit);
        if (!chunkRemoveFirst.getBuffer().hasRemaining()) {
            chunkRemoveFirst.m67932e().invoke();
            return tInvoke;
        }
        this.queue.addFirst(Chunk.m67929c(chunkRemoveFirst, null, C27337b.m67942d(iRemaining - chunkRemoveFirst.getBuffer().remaining(), this.sampleRate, this.channels), 0.0d, null, 13, null));
        return tInvoke;
    }

    /* JADX INFO: renamed from: b */
    public final void m67936b(@NotNull ShortBuffer buffer, long timeUs, double timeStretch, @NotNull Function0<Unit> release) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(release, "release");
        if (buffer.hasRemaining()) {
            this.queue.addLast(new Chunk(buffer, timeUs, timeStretch, release));
        } else {
            release.invoke();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m67937c() {
        this.queue.addLast(Chunk.INSTANCE.getEos());
    }

    /* JADX INFO: renamed from: d */
    public final boolean m67938d() {
        return this.queue.isEmpty();
    }

    public C27336a(int i11, int i12) {
        this.sampleRate = i11;
        this.channels = i12;
    }
}
