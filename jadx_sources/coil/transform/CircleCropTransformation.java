package coil.transform;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: CircleCropTransformation.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m90084d2 = {"Lcoil/transform/CircleCropTransformation;", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Companion", "coil-base_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public final class CircleCropTransformation {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b */
    @Deprecated
    @NotNull
    public static final PorterDuffXfermode f5841b = new PorterDuffXfermode(PorterDuff.Mode.SRC_IN);

    /* JADX INFO: compiled from: CircleCropTransformation.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m90084d2 = {"Lcoil/transform/CircleCropTransformation$Companion;", "", "()V", "XFERMODE", "Landroid/graphics/PorterDuffXfermode;", "getXFERMODE", "()Landroid/graphics/PorterDuffXfermode;", "coil-base_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final PorterDuffXfermode getXFERMODE() {
            return CircleCropTransformation.f5841b;
        }
    }
}
