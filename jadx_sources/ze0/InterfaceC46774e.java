package ze0;

import android.graphics.Rect;
import androidx.annotation.RestrictTo;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.react.uimanager.ViewProps;
import java.io.Closeable;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: ze0.e */
/* JADX INFO: compiled from: Buffer.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J/\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H'¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m90084d2 = {"Lze0/e;", "Ljava/io/Closeable;", "", "planeIndex", "Lze0/p;", "rowStride", "left", ViewProps.TOP, CmcdData.Factory.STREAMING_FORMAT_SS, "(IIII)I", "", "Lze0/o;", "getPlanes", "()[Lze0/o;", "planes", "Landroid/graphics/Rect;", "getCropRect", "()Landroid/graphics/Rect;", "cropRect", "core_release"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public interface InterfaceC46774e extends Closeable {
    @NotNull
    Rect getCropRect();

    @NotNull
    AbstractC46784o[] getPlanes();

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* JADX INFO: renamed from: s */
    int mo103065s(int planeIndex, int rowStride, int left, int top);
}
