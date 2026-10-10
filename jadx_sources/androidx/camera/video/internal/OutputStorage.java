package androidx.camera.video.internal;

import androidx.camera.video.OutputOptions;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: OutputStorage.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0006J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, m90084d2 = {"Landroidx/camera/video/internal/OutputStorage;", "", "getOutputOptions", "Landroidx/camera/video/OutputOptions;", "getAvailableBytes", "", "Factory", "camera-video_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public interface OutputStorage {

    /* JADX INFO: compiled from: OutputStorage.kt */
    @Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m90084d2 = {"Landroidx/camera/video/internal/OutputStorage$Factory;", "", "create", "Landroidx/camera/video/internal/OutputStorage;", "outputOptions", "Landroidx/camera/video/OutputOptions;", "camera-video_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public interface Factory {
        @NotNull
        OutputStorage create(@NotNull OutputOptions outputOptions);
    }

    long getAvailableBytes();

    @NotNull
    OutputOptions getOutputOptions();
}
