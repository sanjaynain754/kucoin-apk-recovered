package androidx.media3.exoplayer.source;

import androidx.media3.common.C2711C;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.LoadingInfo;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class CompositeSequenceableLoader implements SequenceableLoader {
    private long lastAudioVideoBufferedPositionUs;
    private final ImmutableList<SequenceableLoaderWithTrackTypes> loadersWithTrackTypes;

    public static final class SequenceableLoaderWithTrackTypes implements SequenceableLoader {
        private final SequenceableLoader loader;
        private final ImmutableList<Integer> trackTypes;

        @Override // androidx.media3.exoplayer.source.SequenceableLoader
        public boolean continueLoading(LoadingInfo loadingInfo) {
            return this.loader.continueLoading(loadingInfo);
        }

        @Override // androidx.media3.exoplayer.source.SequenceableLoader
        public long getBufferedPositionUs() {
            return this.loader.getBufferedPositionUs();
        }

        @Override // androidx.media3.exoplayer.source.SequenceableLoader
        public long getNextLoadPositionUs() {
            return this.loader.getNextLoadPositionUs();
        }

        public ImmutableList<Integer> getTrackTypes() {
            return this.trackTypes;
        }

        @Override // androidx.media3.exoplayer.source.SequenceableLoader
        public boolean isLoading() {
            return this.loader.isLoading();
        }

        @Override // androidx.media3.exoplayer.source.SequenceableLoader
        public void reevaluateBuffer(long j11) {
            this.loader.reevaluateBuffer(j11);
        }

        public SequenceableLoaderWithTrackTypes(SequenceableLoader sequenceableLoader, List<Integer> list) {
            this.loader = sequenceableLoader;
            this.trackTypes = ImmutableList.copyOf((Collection) list);
        }
    }

    @Deprecated
    public CompositeSequenceableLoader(SequenceableLoader[] sequenceableLoaderArr) {
        this(ImmutableList.copyOf(sequenceableLoaderArr), Collections.nCopies(sequenceableLoaderArr.length, ImmutableList.m13440of(-1)));
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public boolean continueLoading(LoadingInfo loadingInfo) {
        boolean zContinueLoading;
        boolean z11 = false;
        do {
            long nextLoadPositionUs = getNextLoadPositionUs();
            if (nextLoadPositionUs == Long.MIN_VALUE) {
                return z11;
            }
            zContinueLoading = false;
            for (int i11 = 0; i11 < this.loadersWithTrackTypes.size(); i11++) {
                long nextLoadPositionUs2 = this.loadersWithTrackTypes.get(i11).getNextLoadPositionUs();
                boolean z12 = nextLoadPositionUs2 != Long.MIN_VALUE && nextLoadPositionUs2 <= loadingInfo.playbackPositionUs;
                if (nextLoadPositionUs2 == nextLoadPositionUs || z12) {
                    zContinueLoading |= this.loadersWithTrackTypes.get(i11).continueLoading(loadingInfo);
                }
            }
            z11 |= zContinueLoading;
        } while (zContinueLoading);
        return z11;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public boolean isLoading() {
        for (int i11 = 0; i11 < this.loadersWithTrackTypes.size(); i11++) {
            if (this.loadersWithTrackTypes.get(i11).isLoading()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public void reevaluateBuffer(long j11) {
        for (int i11 = 0; i11 < this.loadersWithTrackTypes.size(); i11++) {
            this.loadersWithTrackTypes.get(i11).reevaluateBuffer(j11);
        }
    }

    public CompositeSequenceableLoader(List<? extends SequenceableLoader> list, List<List<Integer>> list2) {
        ImmutableList.Builder builder = ImmutableList.builder();
        Assertions.checkArgument(list.size() == list2.size());
        for (int i11 = 0; i11 < list.size(); i11++) {
            builder.add(new SequenceableLoaderWithTrackTypes(list.get(i11), list2.get(i11)));
        }
        this.loadersWithTrackTypes = builder.build();
        this.lastAudioVideoBufferedPositionUs = C2711C.TIME_UNSET;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public long getBufferedPositionUs() {
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        for (int i11 = 0; i11 < this.loadersWithTrackTypes.size(); i11++) {
            SequenceableLoaderWithTrackTypes sequenceableLoaderWithTrackTypes = this.loadersWithTrackTypes.get(i11);
            long bufferedPositionUs = sequenceableLoaderWithTrackTypes.getBufferedPositionUs();
            if ((sequenceableLoaderWithTrackTypes.getTrackTypes().contains(1) || sequenceableLoaderWithTrackTypes.getTrackTypes().contains(2) || sequenceableLoaderWithTrackTypes.getTrackTypes().contains(4)) && bufferedPositionUs != Long.MIN_VALUE) {
                jMin = Math.min(jMin, bufferedPositionUs);
            }
            if (bufferedPositionUs != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, bufferedPositionUs);
            }
        }
        if (jMin != Long.MAX_VALUE) {
            this.lastAudioVideoBufferedPositionUs = jMin;
            return jMin;
        }
        if (jMin2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j11 = this.lastAudioVideoBufferedPositionUs;
        if (j11 != C2711C.TIME_UNSET) {
            return j11;
        }
        return jMin2;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public long getNextLoadPositionUs() {
        long jMin = Long.MAX_VALUE;
        for (int i11 = 0; i11 < this.loadersWithTrackTypes.size(); i11++) {
            long nextLoadPositionUs = this.loadersWithTrackTypes.get(i11).getNextLoadPositionUs();
            if (nextLoadPositionUs != Long.MIN_VALUE) {
                jMin = Math.min(jMin, nextLoadPositionUs);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }
}
