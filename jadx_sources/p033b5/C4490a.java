package p033b5;

import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import p448m5.InterfaceC42426a;
import p683v4.InterfaceC45417d;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: b5.a */
/* JADX INFO: compiled from: AnimatedDrawableBackendAnimationInformation.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\bJ\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\bJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\bJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010¨\u0006\u0011"}, m90084d2 = {"Lb5/a;", "Lv4/d;", "Lm5/a;", "animatedDrawableBackend", "<init>", "(Lm5/a;)V", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()I", "frameNumber", "i", "(I)I", "b", CmcdData.Factory.STREAMING_FORMAT_HLS, "k", "g", "Lm5/a;", "animated-base_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C4490a implements InterfaceC45417d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC42426a animatedDrawableBackend;

    public C4490a(@NotNull InterfaceC42426a animatedDrawableBackend) {
        Intrinsics.checkNotNullParameter(animatedDrawableBackend, "animatedDrawableBackend");
        this.animatedDrawableBackend = animatedDrawableBackend;
    }

    @Override // p683v4.InterfaceC45417d
    /* JADX INFO: renamed from: a */
    public int mo4283a() {
        return this.animatedDrawableBackend.mo93130a();
    }

    @Override // p683v4.InterfaceC45417d
    /* JADX INFO: renamed from: b */
    public int mo4284b() {
        return this.animatedDrawableBackend.mo93131b();
    }

    @Override // p683v4.InterfaceC45417d
    /* JADX INFO: renamed from: g */
    public int mo4285g() {
        return this.animatedDrawableBackend.getHeight();
    }

    @Override // p683v4.InterfaceC45417d
    /* JADX INFO: renamed from: h */
    public int mo4286h() {
        return this.animatedDrawableBackend.getDurationMs();
    }

    @Override // p683v4.InterfaceC45417d
    /* JADX INFO: renamed from: i */
    public int mo4287i(int frameNumber) {
        return this.animatedDrawableBackend.mo93133d(frameNumber);
    }

    @Override // p683v4.InterfaceC45417d
    /* JADX INFO: renamed from: k */
    public int mo4288k() {
        return this.animatedDrawableBackend.getWidth();
    }
}
