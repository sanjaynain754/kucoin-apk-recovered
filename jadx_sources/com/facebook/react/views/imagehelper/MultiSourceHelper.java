package com.facebook.react.views.imagehelper;

import com.facebook.imagepipeline.core.C5656a;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.react.modules.fresco.ImageCacheControl;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MultiSourceHelper.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u000eB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0007J.\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rH\u0007¨\u0006\u000f"}, m90084d2 = {"Lcom/facebook/react/views/imagehelper/MultiSourceHelper;", "", "<init>", "()V", "getBestSourceForSize", "Lcom/facebook/react/views/imagehelper/MultiSourceHelper$MultiSourceResult;", "width", "", "height", "sources", "", "Lcom/facebook/react/views/imagehelper/ImageSource;", "multiplier", "", "MultiSourceResult", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class MultiSourceHelper {

    @NotNull
    public static final MultiSourceHelper INSTANCE = new MultiSourceHelper();

    @JvmStatic
    @NotNull
    public static final MultiSourceResult getBestSourceForSize(int width, int height, @NotNull List<? extends ImageSource> sources) {
        Intrinsics.checkNotNullParameter(sources, "sources");
        return getBestSourceForSize(width, height, sources, 1.0d);
    }

    /* JADX INFO: compiled from: MultiSourceHelper.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m90084d2 = {"Lcom/facebook/react/views/imagehelper/MultiSourceHelper$MultiSourceResult;", "", "bestResult", "Lcom/facebook/react/views/imagehelper/ImageSource;", "bestResultInCache", "<init>", "(Lcom/facebook/react/views/imagehelper/ImageSource;Lcom/facebook/react/views/imagehelper/ImageSource;)V", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class MultiSourceResult {

        @JvmField
        @Nullable
        public final ImageSource bestResult;

        @JvmField
        @Nullable
        public final ImageSource bestResultInCache;

        public MultiSourceResult(@Nullable ImageSource imageSource, @Nullable ImageSource imageSource2) {
            this.bestResult = imageSource;
            this.bestResultInCache = imageSource2;
        }
    }

    @JvmStatic
    @NotNull
    public static final MultiSourceResult getBestSourceForSize(int width, int height, @NotNull List<? extends ImageSource> sources, double multiplier) {
        Intrinsics.checkNotNullParameter(sources, "sources");
        if (sources.isEmpty()) {
            return new MultiSourceResult(null, null);
        }
        if (sources.size() == 1) {
            return new MultiSourceResult(sources.get(0), null);
        }
        if (width <= 0 || height <= 0) {
            return new MultiSourceResult(null, null);
        }
        ImagePipeline imagePipelineM9445j = C5656a.m9433l().m9445j();
        Intrinsics.checkNotNullExpressionValue(imagePipelineM9445j, "getImagePipeline(...)");
        double d11 = ((double) (width * height)) * multiplier;
        double d12 = Double.MAX_VALUE;
        double d13 = Double.MAX_VALUE;
        ImageSource imageSource = null;
        ImageSource imageSource2 = null;
        for (ImageSource imageSource3 : sources) {
            double dAbs = Math.abs(1.0d - (imageSource3.getSize() / d11));
            if (dAbs < d12) {
                imageSource2 = imageSource3;
                d12 = dAbs;
            }
            if (dAbs < d13 && imageSource3.getCacheControl() != ImageCacheControl.RELOAD && (imagePipelineM9445j.m9230t(imageSource3.getUri()) || imagePipelineM9445j.m9232v(imageSource3.getUri()))) {
                imageSource = imageSource3;
                d13 = dAbs;
            }
        }
        return new MultiSourceResult(imageSource2, (imageSource == null || imageSource2 == null || !Intrinsics.areEqual(imageSource.getSource(), imageSource2.getSource())) ? imageSource : null);
    }

    private MultiSourceHelper() {
    }
}
