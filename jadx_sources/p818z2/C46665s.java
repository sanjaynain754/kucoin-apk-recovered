package p818z2;

import android.os.Handler;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.C5552c;
import com.facebook.GraphRequest;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: z2.s */
/* JADX INFO: compiled from: ProgressNoopOutputStream.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\u000f\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0016\u0010\u001bJ\u0017\u0010\u0016\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0016\u0010\u001dR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001eR \u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\r0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010'\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R$\u0010-\u001a\u00020\u00182\u0006\u0010(\u001a\u00020\u00188\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006."}, m90084d2 = {"Lz2/s;", "Ljava/io/OutputStream;", "Lz2/u;", "Landroid/os/Handler;", "callbackHandler", "<init>", "(Landroid/os/Handler;)V", "Lcom/facebook/GraphRequest;", "currentRequest", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/facebook/GraphRequest;)V", "", "Lcom/facebook/c;", CmcdData.Factory.STREAMING_FORMAT_HLS, "()Ljava/util/Map;", "", "size", "b", "(J)V", "", "buffer", "write", "([B)V", "", TypedValues.CycleType.S_WAVE_OFFSET, SessionDescription.ATTR_LENGTH, "([BII)V", "oneByte", "(I)V", "Landroid/os/Handler;", "", "c", "Ljava/util/Map;", "progressMap", "d", "Lcom/facebook/GraphRequest;", "e", "Lcom/facebook/c;", "currentRequestProgress", "<set-?>", "f", "I", "g", "()I", "maxProgress", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C46665s extends OutputStream implements InterfaceC46667u {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final Handler callbackHandler;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Map<GraphRequest, C5552c> progressMap = new HashMap();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public GraphRequest currentRequest;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public C5552c currentRequestProgress;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public int maxProgress;

    @Override // java.io.OutputStream
    public void write(@NotNull byte[] buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        m102889b(buffer.length);
    }

    @Override // p818z2.InterfaceC46667u
    /* JADX INFO: renamed from: a */
    public void mo8376a(@Nullable GraphRequest currentRequest) {
        this.currentRequest = currentRequest;
        this.currentRequestProgress = currentRequest != null ? this.progressMap.get(currentRequest) : null;
    }

    /* JADX INFO: renamed from: b */
    public final void m102889b(long size) {
        GraphRequest graphRequest = this.currentRequest;
        if (graphRequest == null) {
            return;
        }
        if (this.currentRequestProgress == null) {
            C5552c c5552c = new C5552c(this.callbackHandler, graphRequest);
            this.currentRequestProgress = c5552c;
            this.progressMap.put(graphRequest, c5552c);
        }
        C5552c c5552c2 = this.currentRequestProgress;
        if (c5552c2 != null) {
            c5552c2.m8444c(size);
        }
        this.maxProgress += (int) size;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getMaxProgress() {
        return this.maxProgress;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final Map<GraphRequest, C5552c> m102891h() {
        return this.progressMap;
    }

    @Override // java.io.OutputStream
    public void write(@NotNull byte[] buffer, int offset, int length) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        m102889b(length);
    }

    public C46665s(@Nullable Handler handler) {
        this.callbackHandler = handler;
    }

    @Override // java.io.OutputStream
    public void write(int oneByte) {
        m102889b(1L);
    }
}
