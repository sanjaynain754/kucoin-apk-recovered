package ze0;

import android.graphics.Rect;
import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import ze0.InterfaceC46774e;

/* JADX INFO: renamed from: ze0.g */
/* JADX INFO: compiled from: BufferFactory.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003J'\u0010\t\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m90084d2 = {"Lze0/g;", "Lze0/e;", "BUFFER", "", "", "width", "height", "Landroid/graphics/Rect;", "cropRect", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(IILandroid/graphics/Rect;)Lze0/e;", "core_release"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public interface InterfaceC46776g<BUFFER extends InterfaceC46774e> {

    /* JADX INFO: renamed from: ze0.g$a */
    /* JADX INFO: compiled from: BufferFactory.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class a {
        @NotNull
        /* JADX INFO: renamed from: a */
        public static <BUFFER extends InterfaceC46774e> BUFFER m103080a(@NotNull InterfaceC46776g<BUFFER> interfaceC46776g, int i11, int i12) {
            return (BUFFER) interfaceC46776g.mo103068a(i11, i12, new Rect(0, 0, i11, i12));
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    BUFFER mo103068a(int width, int height, @NotNull Rect cropRect);
}
