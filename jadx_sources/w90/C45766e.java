package w90;

import aa0.InterfaceC0214b;
import android.media.MediaFormat;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.otaliastudios.transcoder.common.TrackType;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: w90.e */
/* JADX INFO: compiled from: eos.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0013\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\t\u001a\u0004\u0018\u00010\bH\u0097\u0001¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0001\u0010\f\u001a\u00020\u000bH\u0097\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0010\u001a\u00020\u00042\b\b\u0001\u0010\f\u001a\u00020\u000bH\u0096\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H\u0096\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015H\u0096\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018H\u0096\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0015H\u0096\u0001¢\u0006\u0004\b\u001b\u0010\u0017J\u0010\u0010\u001c\u001a\u00020\u0012H\u0096\u0001¢\u0006\u0004\b\u001c\u0010\u0014J\u0010\u0010\u001d\u001a\u00020\u0004H\u0096\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00122\b\b\u0001\u0010 \u001a\u00020\u001fH\u0096\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010#\u001a\u00020\u00122\b\b\u0001\u0010\f\u001a\u00020\u000bH\u0096\u0001¢\u0006\u0004\b#\u0010$J\u0018\u0010&\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\u0015H\u0096\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010(\u001a\u00020\u00122\b\b\u0001\u0010\f\u001a\u00020\u000bH\u0096\u0001¢\u0006\u0004\b(\u0010$J\u000f\u0010)\u001a\u00020\u0004H\u0016¢\u0006\u0004\b)\u0010\u001eR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010*R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010+¨\u0006,"}, m90084d2 = {"Lw90/e;", "Laa0/b;", "source", "Lkotlin/Function0;", "", "force", "<init>", "(Laa0/b;Lkotlin/jvm/functions/Function0;)V", "", "getLocation", "()[D", "Lcom/otaliastudios/transcoder/common/TrackType;", "type", "Landroid/media/MediaFormat;", "d", "(Lcom/otaliastudios/transcoder/common/TrackType;)Landroid/media/MediaFormat;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/otaliastudios/transcoder/common/TrackType;)Z", "", "g", "()V", "", "getDurationUs", "()J", "", "getOrientation", "()I", "getPositionUs", "initialize", "isInitialized", "()Z", "Laa0/b$a;", "chunk", "f", "(Laa0/b$a;)V", "c", "(Lcom/otaliastudios/transcoder/common/TrackType;)V", "desiredPositionUs", "seekTo", "(J)J", "e", "b", "Laa0/b;", "Lkotlin/jvm/functions/Function0;", "lib_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public final class C45766e implements InterfaceC0214b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC0214b source;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Function0<Boolean> force;

    @Override // aa0.InterfaceC0214b
    /* JADX INFO: renamed from: b */
    public boolean mo789b() {
        return this.force.invoke().booleanValue() || this.source.mo789b();
    }

    @Override // aa0.InterfaceC0214b
    /* JADX INFO: renamed from: f */
    public void mo793f(@NonNull @NotNull InterfaceC0214b.a chunk) {
        Intrinsics.checkNotNullParameter(chunk, "chunk");
        this.source.mo793f(chunk);
    }

    @Override // aa0.InterfaceC0214b
    /* JADX INFO: renamed from: g */
    public void mo794g() {
        this.source.mo794g();
    }

    @Override // aa0.InterfaceC0214b
    public long getDurationUs() {
        return this.source.getDurationUs();
    }

    @Override // aa0.InterfaceC0214b
    @Nullable
    @org.jetbrains.annotations.Nullable
    public double[] getLocation() {
        return this.source.getLocation();
    }

    @Override // aa0.InterfaceC0214b
    public int getOrientation() {
        return this.source.getOrientation();
    }

    @Override // aa0.InterfaceC0214b
    public long getPositionUs() {
        return this.source.getPositionUs();
    }

    @Override // aa0.InterfaceC0214b
    public void initialize() {
        this.source.initialize();
    }

    @Override // aa0.InterfaceC0214b
    public boolean isInitialized() {
        return this.source.isInitialized();
    }

    @Override // aa0.InterfaceC0214b
    public long seekTo(long desiredPositionUs) {
        return this.source.seekTo(desiredPositionUs);
    }

    public C45766e(@NotNull InterfaceC0214b source, @NotNull Function0<Boolean> force) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(force, "force");
        this.source = source;
        this.force = force;
    }

    @Override // aa0.InterfaceC0214b
    /* JADX INFO: renamed from: a */
    public boolean mo788a(@NonNull @NotNull TrackType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return this.source.mo788a(type);
    }

    @Override // aa0.InterfaceC0214b
    /* JADX INFO: renamed from: c */
    public void mo790c(@NonNull @NotNull TrackType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.source.mo790c(type);
    }

    @Override // aa0.InterfaceC0214b
    @Nullable
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: d */
    public MediaFormat mo791d(@NonNull @NotNull TrackType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return this.source.mo791d(type);
    }

    @Override // aa0.InterfaceC0214b
    /* JADX INFO: renamed from: e */
    public void mo792e(@NonNull @NotNull TrackType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.source.mo792e(type);
    }
}
