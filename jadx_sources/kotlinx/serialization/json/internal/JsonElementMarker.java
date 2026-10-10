package kotlinx.serialization.json.internal;

import androidx.media3.exoplayer.upstream.CmcdData;
import kotlinx.serialization.internal.ElementMarker;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import vg0.InterfaceC45533f;

/* JADX INFO: compiled from: JsonElementMarker.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R$\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\r8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0019"}, m90084d2 = {"Lkotlinx/serialization/json/internal/JsonElementMarker;", "", "Lvg0/f;", "descriptor", "<init>", "(Lvg0/f;)V", "", "index", "", "c", "(I)V", "d", "()I", "", "e", "(Lvg0/f;I)Z", "Lkotlinx/serialization/internal/ElementMarker;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lkotlinx/serialization/internal/ElementMarker;", "origin", "value", "b", "Z", "()Z", "isUnmarkedNull", "kotlinx-serialization-json"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class JsonElementMarker {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final ElementMarker origin;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public boolean isUnmarkedNull;

    public JsonElementMarker(@NotNull InterfaceC45533f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.origin = new ElementMarker(descriptor, new JsonElementMarker$origin$1(this));
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getIsUnmarkedNull() {
        return this.isUnmarkedNull;
    }

    /* JADX INFO: renamed from: c */
    public final void m91796c(int index) {
        this.origin.m91417a(index);
    }

    /* JADX INFO: renamed from: d */
    public final int m91797d() {
        return this.origin.m91420d();
    }

    /* JADX INFO: renamed from: e */
    public final boolean m91798e(InterfaceC45533f descriptor, int index) {
        boolean z11;
        if (!descriptor.mo91529i(index) && descriptor.mo91525d(index).mo91523b()) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.isUnmarkedNull = z11;
        return z11;
    }
}
