package androidx.media3.exoplayer;

import android.content.Context;
import androidx.media3.common.Metadata;
import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.audio.AudioRendererEventListener;
import androidx.media3.exoplayer.metadata.MetadataOutput;
import androidx.media3.exoplayer.text.TextOutput;
import androidx.media3.exoplayer.video.VideoRendererEventListener;
import java.util.Arrays;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class DefaultRendererCapabilitiesList implements RendererCapabilitiesList {
    private final Renderer[] renderers;

    public static final class Factory implements RendererCapabilitiesList.Factory {
        private final RenderersFactory renderersFactory;

        public Factory(Context context) {
            this.renderersFactory = new DefaultRenderersFactory(context);
        }

        @Override // androidx.media3.exoplayer.RendererCapabilitiesList.Factory
        public DefaultRendererCapabilitiesList createRendererCapabilitiesList() {
            return new DefaultRendererCapabilitiesList(this.renderersFactory.createRenderers(Util.createHandlerForCurrentOrMainLooper(), new VideoRendererEventListener() { // from class: androidx.media3.exoplayer.DefaultRendererCapabilitiesList.Factory.1
            }, new AudioRendererEventListener() { // from class: androidx.media3.exoplayer.DefaultRendererCapabilitiesList.Factory.2
            }, new TextOutput() { // from class: androidx.media3.exoplayer.l
                @Override // androidx.media3.exoplayer.text.TextOutput
                public final void onCues(CueGroup cueGroup) {
                    DefaultRendererCapabilitiesList.Factory.m3023b(cueGroup);
                }
            }, new MetadataOutput() { // from class: androidx.media3.exoplayer.m
                @Override // androidx.media3.exoplayer.metadata.MetadataOutput
                public final void onMetadata(Metadata metadata) {
                    DefaultRendererCapabilitiesList.Factory.m3022a(metadata);
                }
            }));
        }

        public Factory(RenderersFactory renderersFactory) {
            this.renderersFactory = renderersFactory;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m3022a(Metadata metadata) {
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m3023b(CueGroup cueGroup) {
        }
    }

    private DefaultRendererCapabilitiesList(Renderer[] rendererArr) {
        this.renderers = (Renderer[]) Arrays.copyOf(rendererArr, rendererArr.length);
        for (int i11 = 0; i11 < rendererArr.length; i11++) {
            this.renderers[i11].init(i11, PlayerId.UNSET, Clock.DEFAULT);
        }
    }

    @Override // androidx.media3.exoplayer.RendererCapabilitiesList
    public RendererCapabilities[] getRendererCapabilities() {
        RendererCapabilities[] rendererCapabilitiesArr = new RendererCapabilities[this.renderers.length];
        int i11 = 0;
        while (true) {
            Renderer[] rendererArr = this.renderers;
            if (i11 >= rendererArr.length) {
                return rendererCapabilitiesArr;
            }
            rendererCapabilitiesArr[i11] = rendererArr[i11].getCapabilities();
            i11++;
        }
    }

    @Override // androidx.media3.exoplayer.RendererCapabilitiesList
    public void release() {
        for (Renderer renderer : this.renderers) {
            renderer.release();
        }
    }

    @Override // androidx.media3.exoplayer.RendererCapabilitiesList
    public int size() {
        return this.renderers.length;
    }
}
