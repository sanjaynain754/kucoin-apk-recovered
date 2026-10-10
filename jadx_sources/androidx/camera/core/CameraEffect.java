package androidx.camera.core;

import androidx.annotation.RestrictTo;
import androidx.camera.core.processing.SurfaceProcessorInternal;
import androidx.camera.core.processing.SurfaceProcessorWithExecutor;
import androidx.camera.core.processing.TargetUtils;
import androidx.core.util.Consumer;
import androidx.core.util.Preconditions;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes23.dex */
public abstract class CameraEffect {
    public static final int IMAGE_CAPTURE = 4;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final int OUTPUT_OPTION_ONE_FOR_ALL_TARGETS = 0;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final int OUTPUT_OPTION_ONE_FOR_EACH_TARGET = 1;
    public static final int PREVIEW = 1;
    private static final List<Integer> SURFACE_PROCESSOR_TARGETS = Arrays.asList(1, 2, 3, 7);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final int TRANSFORMATION_ARBITRARY = 0;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final int TRANSFORMATION_CAMERA_AND_SURFACE_ROTATION = 1;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final int TRANSFORMATION_PASSTHROUGH = 2;
    public static final int VIDEO_CAPTURE = 2;
    private final Consumer<Throwable> mErrorListener;
    private final Executor mExecutor;
    private final ImageProcessor mImageProcessor;
    private final int mOutputOption;
    private final SurfaceProcessor mSurfaceProcessor;
    private final int mTargets;
    private final int mTransformation;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface Formats {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface OutputOptions {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface Targets {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface Transformations {
    }

    public CameraEffect(int i11, Executor executor, ImageProcessor imageProcessor, Consumer<Throwable> consumer) {
        Preconditions.checkArgument(i11 == 4, "Currently ImageProcessor can only target IMAGE_CAPTURE.");
        this.mTargets = i11;
        this.mTransformation = 0;
        this.mOutputOption = 0;
        this.mExecutor = executor;
        this.mSurfaceProcessor = null;
        this.mImageProcessor = imageProcessor;
        this.mErrorListener = consumer;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public SurfaceProcessorInternal createSurfaceProcessorInternal() {
        return new SurfaceProcessorWithExecutor(this);
    }

    public Consumer<Throwable> getErrorListener() {
        return this.mErrorListener;
    }

    public Executor getExecutor() {
        return this.mExecutor;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public ImageProcessor getImageProcessor() {
        return this.mImageProcessor;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getOutputOption() {
        return this.mOutputOption;
    }

    public SurfaceProcessor getSurfaceProcessor() {
        return this.mSurfaceProcessor;
    }

    public int getTargets() {
        return this.mTargets;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getTransformation() {
        return this.mTransformation;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public CameraEffect(int i11, int i12, Executor executor, SurfaceProcessor surfaceProcessor, Consumer<Throwable> consumer) {
        this(i11, 0, i12, executor, surfaceProcessor, consumer);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public CameraEffect(int i11, int i12, int i13, Executor executor, SurfaceProcessor surfaceProcessor, Consumer<Throwable> consumer) {
        TargetUtils.checkSupportedTargets(SURFACE_PROCESSOR_TARGETS, i11);
        this.mTargets = i11;
        this.mOutputOption = i12;
        this.mTransformation = i13;
        this.mExecutor = executor;
        this.mSurfaceProcessor = surfaceProcessor;
        this.mImageProcessor = null;
        this.mErrorListener = consumer;
    }

    public CameraEffect(int i11, Executor executor, SurfaceProcessor surfaceProcessor, Consumer<Throwable> consumer) {
        this(i11, 0, 0, executor, surfaceProcessor, consumer);
    }
}
