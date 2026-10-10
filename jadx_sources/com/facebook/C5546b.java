package com.facebook;

import android.os.Handler;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.C5546b;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p818z2.InterfaceC46667u;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.facebook.b */
/* JADX INFO: compiled from: ProgressOutputStream.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001a\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u0018\u0010\u001dJ\u0017\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u0018\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0010H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\"\u0010!R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010(R$\u00100\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020\u000b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b.\u0010(\u001a\u0004\b/\u0010*R\u0016\u00101\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010(R\u0018\u00103\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u00102¨\u00064"}, m90084d2 = {"Lcom/facebook/b;", "Ljava/io/FilterOutputStream;", "Lz2/u;", "Ljava/io/OutputStream;", "out", "Lcom/facebook/GraphRequestBatch;", "requests", "", "Lcom/facebook/GraphRequest;", "Lcom/facebook/c;", "progressMap", "", "maxProgress", "<init>", "(Ljava/io/OutputStream;Lcom/facebook/GraphRequestBatch;Ljava/util/Map;J)V", "size", "", "g", "(J)V", "request", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/facebook/GraphRequest;)V", "", "buffer", "write", "([B)V", "", TypedValues.CycleType.S_WAVE_OFFSET, SessionDescription.ATTR_LENGTH, "([BII)V", "oneByte", "(I)V", "close", "()V", CmcdData.Factory.STREAMING_FORMAT_HLS, "b", "Lcom/facebook/GraphRequestBatch;", "c", "Ljava/util/Map;", "d", "J", "getMaxProgress", "()J", "e", "threshold", "<set-?>", "f", "getBatchProgress", "batchProgress", "lastReportedProgress", "Lcom/facebook/c;", "currentRequestProgress", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C5546b extends FilterOutputStream implements InterfaceC46667u {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final GraphRequestBatch requests;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Map<GraphRequest, C5552c> progressMap;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final long maxProgress;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final long threshold;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public long batchProgress;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public long lastReportedProgress;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public C5552c currentRequestProgress;

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(@NotNull byte[] buffer) throws IOException {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        ((FilterOutputStream) this).out.write(buffer);
        m8374g(buffer.length);
    }

    /* JADX INFO: renamed from: g */
    private final void m8374g(long size) {
        C5552c c5552c = this.currentRequestProgress;
        if (c5552c != null) {
            c5552c.m8443b(size);
        }
        long j11 = this.batchProgress + size;
        this.batchProgress = j11;
        if (j11 >= this.lastReportedProgress + this.threshold || j11 >= this.maxProgress) {
            m8377h();
        }
    }

    /* JADX INFO: renamed from: i */
    public static final void m8375i(GraphRequestBatch.InterfaceC5497a callback, C5546b this$0) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((GraphRequestBatch.InterfaceC5498b) callback).m7739b(this$0.requests, this$0.batchProgress, this$0.maxProgress);
    }

    @Override // p818z2.InterfaceC46667u
    /* JADX INFO: renamed from: a */
    public void mo8376a(@Nullable GraphRequest request) {
        this.currentRequestProgress = request != null ? this.progressMap.get(request) : null;
    }

    /* JADX INFO: renamed from: h */
    public final void m8377h() {
        if (this.batchProgress > this.lastReportedProgress) {
            for (final GraphRequestBatch.InterfaceC5497a interfaceC5497a : this.requests.m7731l()) {
                if (interfaceC5497a instanceof GraphRequestBatch.InterfaceC5498b) {
                    Handler callbackHandler = this.requests.getCallbackHandler();
                    if (callbackHandler != null) {
                        callbackHandler.post(new Runnable() { // from class: z2.t
                            @Override // java.lang.Runnable
                            public final void run() {
                                C5546b.m8375i(interfaceC5497a, this);
                            }
                        });
                    } else {
                        ((GraphRequestBatch.InterfaceC5498b) interfaceC5497a).m7739b(this.requests, this.batchProgress, this.maxProgress);
                    }
                }
            }
            this.lastReportedProgress = this.batchProgress;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5546b(@NotNull OutputStream out, @NotNull GraphRequestBatch requests, @NotNull Map<GraphRequest, C5552c> progressMap, long j11) {
        super(out);
        Intrinsics.checkNotNullParameter(out, "out");
        Intrinsics.checkNotNullParameter(requests, "requests");
        Intrinsics.checkNotNullParameter(progressMap, "progressMap");
        this.requests = requests;
        this.progressMap = progressMap;
        this.maxProgress = j11;
        this.threshold = C5501a.m7811y();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
        Iterator<C5552c> it = this.progressMap.values().iterator();
        while (it.hasNext()) {
            it.next().m8445d();
        }
        m8377h();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(@NotNull byte[] buffer, int offset, int length) throws IOException {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        ((FilterOutputStream) this).out.write(buffer, offset, length);
        m8374g(length);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int oneByte) throws IOException {
        ((FilterOutputStream) this).out.write(oneByte);
        m8374g(1L);
    }
}
