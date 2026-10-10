package p034b6;

import androidx.media3.exoplayer.upstream.CmcdData;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: b6.f */
/* JADX INFO: compiled from: PlatformDecoderOptions.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\b\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, m90084d2 = {"Lb6/f;", "", "", "avoidPoolGet", "avoidPoolRelease", "<init>", "(ZZ)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Z", "()Z", "b", "imagepipeline_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C4497f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final boolean avoidPoolGet;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final boolean avoidPoolRelease;

    public C4497f(boolean z11, boolean z12) {
        this.avoidPoolGet = z11;
        this.avoidPoolRelease = z12;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getAvoidPoolGet() {
        return this.avoidPoolGet;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getAvoidPoolRelease() {
        return this.avoidPoolRelease;
    }

    public /* synthetic */ C4497f(boolean z11, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? false : z12);
    }
}
