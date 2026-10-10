package io.trtc.tuikit.atomicx.widget.utils;

import androidx.annotation.DrawableRes;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: ImageOptions.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0017\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u0000 %2\u00020\u0001:\u0002$%BM\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\u000bHÆ\u0003JO\u0010\u001e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006&"}, m90084d2 = {"Lio/trtc/tuikit/atomicx/widget/utils/ImageOptions;", "", "placeImage", "", "errorImage", "roundRadius", "isGif", "", "skipMemoryCache", "skipDiskCache", "blurEffect", "", "<init>", "(IIIZZZF)V", "getPlaceImage", "()I", "getErrorImage", "getRoundRadius", "()Z", "getSkipMemoryCache", "getSkipDiskCache", "getBlurEffect", "()F", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "", "Builder", "Companion", "atomic_x_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ImageOptions {

    /* JADX INFO: renamed from: h */
    @NotNull
    public static final Companion f87585h = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from toString */
    public final int placeImage;

    /* JADX INFO: renamed from: b, reason: from toString */
    public final int errorImage;

    /* JADX INFO: renamed from: c, reason: from toString */
    public final int roundRadius;

    /* JADX INFO: renamed from: d, reason: from toString */
    public final boolean isGif;

    /* JADX INFO: renamed from: e, reason: from toString */
    public final boolean skipMemoryCache;

    /* JADX INFO: renamed from: f, reason: from toString */
    public final boolean skipDiskCache;

    /* JADX INFO: renamed from: g, reason: from toString */
    public final float blurEffect;

    /* JADX INFO: compiled from: ImageOptions.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0012\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, m90084d2 = {"Lio/trtc/tuikit/atomicx/widget/utils/ImageOptions$Companion;", "", "<init>", "()V", "default", "Lio/trtc/tuikit/atomicx/widget/utils/ImageOptions;", "withPlaceholder", "placeImage", "", "atomic_x_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: default, reason: not valid java name */
        public final ImageOptions m103838default() {
            return new ImageOptions(0, 0, 0, false, false, false, 0.0f, 127, null);
        }

        @JvmStatic
        @NotNull
        public final ImageOptions withPlaceholder(@DrawableRes int placeImage) {
            return new ImageOptions(placeImage, 0, 0, false, false, false, 0.0f, 126, null);
        }
    }

    /* JADX INFO: renamed from: io.trtc.tuikit.atomicx.widget.utils.ImageOptions$a */
    /* JADX INFO: compiled from: ImageOptions.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u000e\u001a\u00020\u00002\b\b\u0001\u0010\u0004\u001a\u00020\u0005J\u0010\u0010\u000f\u001a\u00020\u00002\b\b\u0001\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0005J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\tJ\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\tJ\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\rJ\u0006\u0010\u0017\u001a\u00020\u0018R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m90084d2 = {"Lio/trtc/tuikit/atomicx/widget/utils/ImageOptions$Builder;", "", "<init>", "()V", "placeImage", "", "errorImage", "roundRadius", "isGif", "", "skipMemoryCache", "skipDiskCache", "blurEffect", "", "setPlaceImage", "setErrorImage", "setRoundRadius", "asGif", "setSkipMemoryCache", "skip", "setSkipDiskCache", "setBlurEffect", FirebaseAnalytics.Param.LEVEL, "build", "Lio/trtc/tuikit/atomicx/widget/utils/ImageOptions;", "atomic_x_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C39388a {

        /* JADX INFO: renamed from: a */
        public int f87593a;

        /* JADX INFO: renamed from: b */
        public int f87594b;

        /* JADX INFO: renamed from: c */
        public int f87595c;

        /* JADX INFO: renamed from: d */
        public boolean f87596d;

        /* JADX INFO: renamed from: e */
        public boolean f87597e;

        /* JADX INFO: renamed from: f */
        public boolean f87598f;

        /* JADX INFO: renamed from: g */
        public float f87599g;

        @NotNull
        /* JADX INFO: renamed from: a */
        public final ImageOptions m88212a() {
            return new ImageOptions(this.f87593a, this.f87594b, this.f87595c, this.f87596d, this.f87597e, this.f87598f, this.f87599g);
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final C39388a m88213b(@DrawableRes int i11) {
            this.f87593a = i11;
            return this;
        }
    }

    public ImageOptions() {
        this(0, 0, 0, false, false, false, 0.0f, 127, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageOptions)) {
            return false;
        }
        ImageOptions imageOptions = (ImageOptions) other;
        return this.placeImage == imageOptions.placeImage && this.errorImage == imageOptions.errorImage && this.roundRadius == imageOptions.roundRadius && this.isGif == imageOptions.isGif && this.skipMemoryCache == imageOptions.skipMemoryCache && this.skipDiskCache == imageOptions.skipDiskCache && Float.compare(this.blurEffect, imageOptions.blurEffect) == 0;
    }

    public ImageOptions(@DrawableRes int i11, @DrawableRes int i12, int i13, boolean z11, boolean z12, boolean z13, float f11) {
        this.placeImage = i11;
        this.errorImage = i12;
        this.roundRadius = i13;
        this.isGif = z11;
        this.skipMemoryCache = z12;
        this.skipDiskCache = z13;
        this.blurEffect = f11;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getBlurEffect() {
        return this.blurEffect;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getErrorImage() {
        return this.errorImage;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getPlaceImage() {
        return this.placeImage;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getRoundRadius() {
        return this.roundRadius;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getSkipDiskCache() {
        return this.skipDiskCache;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getSkipMemoryCache() {
        return this.skipMemoryCache;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getIsGif() {
        return this.isGif;
    }

    public int hashCode() {
        return (((((((((((Integer.hashCode(this.placeImage) * 31) + Integer.hashCode(this.errorImage)) * 31) + Integer.hashCode(this.roundRadius)) * 31) + Boolean.hashCode(this.isGif)) * 31) + Boolean.hashCode(this.skipMemoryCache)) * 31) + Boolean.hashCode(this.skipDiskCache)) * 31) + Float.hashCode(this.blurEffect);
    }

    @NotNull
    public String toString() {
        return "ImageOptions(placeImage=" + this.placeImage + ", errorImage=" + this.errorImage + ", roundRadius=" + this.roundRadius + ", isGif=" + this.isGif + ", skipMemoryCache=" + this.skipMemoryCache + ", skipDiskCache=" + this.skipDiskCache + ", blurEffect=" + this.blurEffect + ')';
    }

    public /* synthetic */ ImageOptions(int i11, int i12, int i13, boolean z11, boolean z12, boolean z13, float f11, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? 0 : i11, (i14 & 2) != 0 ? 0 : i12, (i14 & 4) != 0 ? 0 : i13, (i14 & 8) != 0 ? false : z11, (i14 & 16) != 0 ? false : z12, (i14 & 32) != 0 ? false : z13, (i14 & 64) != 0 ? 0.0f : f11);
    }
}
