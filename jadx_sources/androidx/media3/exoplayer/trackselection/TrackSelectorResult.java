package androidx.media3.exoplayer.trackselection;

import androidx.annotation.Nullable;
import androidx.media3.common.Tracks;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.RendererConfiguration;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class TrackSelectorResult {

    @Nullable
    public final Object info;
    public final int length;
    public final RendererConfiguration[] rendererConfigurations;
    public final ExoTrackSelection[] selections;
    public final Tracks tracks;

    @Deprecated
    public TrackSelectorResult(RendererConfiguration[] rendererConfigurationArr, ExoTrackSelection[] exoTrackSelectionArr, @Nullable Object obj) {
        this(rendererConfigurationArr, exoTrackSelectionArr, Tracks.EMPTY, obj);
    }

    public boolean isEquivalent(@Nullable TrackSelectorResult trackSelectorResult) {
        if (trackSelectorResult == null || trackSelectorResult.selections.length != this.selections.length) {
            return false;
        }
        for (int i11 = 0; i11 < this.selections.length; i11++) {
            if (!isEquivalent(trackSelectorResult, i11)) {
                return false;
            }
        }
        return true;
    }

    public TrackSelectorResult(RendererConfiguration[] rendererConfigurationArr, ExoTrackSelection[] exoTrackSelectionArr, Tracks tracks, @Nullable Object obj) {
        Assertions.checkArgument(rendererConfigurationArr.length == exoTrackSelectionArr.length);
        this.rendererConfigurations = rendererConfigurationArr;
        this.selections = (ExoTrackSelection[]) exoTrackSelectionArr.clone();
        this.tracks = tracks;
        this.info = obj;
        this.length = rendererConfigurationArr.length;
    }

    public boolean isRendererEnabled(int i11) {
        return this.rendererConfigurations[i11] != null;
    }

    public boolean isEquivalent(@Nullable TrackSelectorResult trackSelectorResult, int i11) {
        return trackSelectorResult != null && Util.areEqual(this.rendererConfigurations[i11], trackSelectorResult.rendererConfigurations[i11]) && Util.areEqual(this.selections[i11], trackSelectorResult.selections[i11]);
    }
}
