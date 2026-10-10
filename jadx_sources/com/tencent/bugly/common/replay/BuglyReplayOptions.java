package com.tencent.bugly.common.replay;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public final class BuglyReplayOptions {
    public static final String ANDROIDX_MEDIA_VIEW_CLASS_NAME = "androidx.media3.ui.PlayerView";
    public static final String EXOPLAYER_CLASS_NAME = "com.google.android.exoplayer2.ui.PlayerView";
    public static final String EXOPLAYER_STYLED_CLASS_NAME = "com.google.android.exoplayer2.ui.StyledPlayerView";
    public static final String IMAGE_VIEW_CLASS_NAME = "android.widget.ImageView";
    public static int MASK_KEY = 3689;
    public static final String TEXT_VIEW_CLASS_NAME = "android.widget.TextView";
    public static final String VIDEO_VIEW_CLASS_NAME = "android.widget.VideoView";
    public static final String WEB_VIEW_CLASS_NAME = "android.webkit.WebView";

    /* JADX INFO: renamed from: a */
    public Set<String> f68500a = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: b */
    @Nullable
    public String f68501b = null;

    /* JADX INFO: renamed from: c */
    @Nullable
    public String f68502c = null;

    /* JADX INFO: renamed from: d */
    public BuglyReplayQuality f68503d = BuglyReplayQuality.MEDIUM;

    /* JADX INFO: renamed from: e */
    public int f68504e = 1;

    /* JADX INFO: compiled from: BUGLY */
    public enum BuglyReplayQuality {
        LOW(0.8f, 50000, 50),
        MEDIUM(1.0f, 75000, 75),
        HIGH(1.0f, 100000, 100);

        public final int bitRate;
        public final int screenshotQuality;
        public final float sizeScale;

        BuglyReplayQuality(float f11, int i11, int i12) {
            this.sizeScale = f11;
            this.bitRate = i11;
            this.screenshotQuality = i12;
        }
    }

    public void addUnmaskViewClass(@NotNull String str) {
        this.f68500a.add(str);
    }

    public int getFrameRate() {
        return this.f68504e;
    }

    @Nullable
    public String getMaskViewContainerClass() {
        return this.f68501b;
    }

    @NotNull
    public BuglyReplayQuality getQuality() {
        return this.f68503d;
    }

    @NotNull
    public Set<String> getUnmaskViewClasses() {
        return this.f68500a;
    }

    @Nullable
    public String getUnmaskViewContainerClass() {
        return this.f68502c;
    }

    public void removeUnmaskViewClass(@NotNull String str) {
        this.f68500a.remove(str);
    }

    public void setFrameRate(int i11) {
        this.f68504e = i11;
    }

    public void setMaskAllImages(boolean z11) {
        if (z11) {
            this.f68500a.remove(IMAGE_VIEW_CLASS_NAME);
        } else {
            this.f68500a.add(IMAGE_VIEW_CLASS_NAME);
        }
    }

    public void setMaskAllText(boolean z11) {
        if (z11) {
            this.f68500a.remove(TEXT_VIEW_CLASS_NAME);
        } else {
            this.f68500a.add(TEXT_VIEW_CLASS_NAME);
        }
    }

    public void setMaskKey(int i11) {
        MASK_KEY = i11;
    }

    public void setQuality(@NotNull BuglyReplayQuality buglyReplayQuality) {
        this.f68503d = buglyReplayQuality;
    }
}
