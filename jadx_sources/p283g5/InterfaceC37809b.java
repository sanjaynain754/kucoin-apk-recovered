package p283g5;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.fresco.p061ui.common.ImageLoadStatus;
import com.facebook.fresco.p061ui.common.ImagePerfData;
import com.facebook.fresco.p061ui.common.VisibilityState;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: g5.b */
/* JADX INFO: compiled from: ImagePerfDataListener.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m90084d2 = {"Lg5/b;", "", "Lcom/facebook/fresco/ui/common/ImagePerfData;", "imagePerfData", "Lcom/facebook/fresco/ui/common/ImageLoadStatus;", "imageLoadStatus", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/facebook/fresco/ui/common/ImagePerfData;Lcom/facebook/fresco/ui/common/ImageLoadStatus;)V", "Lcom/facebook/fresco/ui/common/VisibilityState;", "visibilityState", "b", "(Lcom/facebook/fresco/ui/common/ImagePerfData;Lcom/facebook/fresco/ui/common/VisibilityState;)V", "ui-common_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public interface InterfaceC37809b {
    /* JADX INFO: renamed from: a */
    void m85302a(@NotNull ImagePerfData imagePerfData, @NotNull ImageLoadStatus imageLoadStatus);

    /* JADX INFO: renamed from: b */
    void m85303b(@NotNull ImagePerfData imagePerfData, @NotNull VisibilityState visibilityState);
}
