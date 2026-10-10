package com.tencent.bugly.common.replay;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.view.PixelCopy;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import androidx.core.view.ViewCompat;
import androidx.work.Data;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import com.tencent.bugly.common.replay.tool.ExecutorsKt;
import com.tencent.bugly.common.replay.tool.MainLooperHandler;
import com.tencent.bugly.common.replay.tool.TextLayout;
import com.tencent.bugly.common.replay.tool.ViewsKt;
import com.tencent.bugly.common.replay.viewhierarchy.ViewHierarchyNode;
import com.tencent.bugly.proguard.C33770l7;
import com.tencent.bugly.proguard.C33986vi;
import com.tencent.rmonitor.common.logger.Logger;
import java.lang.ref.WeakReference;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Lambda;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0001\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\u000e\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u000208J\u0016\u0010J\u001a\u00020#2\u0006\u0010K\u001a\u00020#2\u0006\u0010L\u001a\u00020MJ\u0006\u0010N\u001a\u00020HJ\b\u0010O\u001a\u00020HH\u0002J\u0006\u0010P\u001a\u00020HJ\u001e\u0010Q\u001a\u00020H2\u0006\u0010R\u001a\u00020#2\u0006\u0010S\u001a\u00020#2\u0006\u0010T\u001a\u00020UJ\u0018\u0010V\u001a\u00020\u00102\u0006\u0010W\u001a\u00020\u000e2\u0006\u0010X\u001a\u00020\u000eH\u0002J\u0018\u0010Y\u001a\u00020H2\u0006\u0010Z\u001a\u00020\u00102\u0006\u0010[\u001a\u00020\u0010H\u0002J\u0018\u0010\\\u001a\u00020\u00102\u0006\u0010]\u001a\u00020\u00102\u0006\u0010^\u001a\u00020\u000eH\u0002J\b\u0010_\u001a\u00020HH\u0016J\u0006\u0010`\u001a\u00020HJ\u0006\u0010a\u001a\u00020HJ\u0016\u0010b\u001a\u00020U2\u0006\u0010T\u001a\u00020U2\u0006\u0010c\u001a\u000200J\u0010\u0010d\u001a\u00020H2\b\u0010I\u001a\u0004\u0018\u000108J\u0014\u0010e\u001a\u00020\u0010*\u00020#2\u0006\u0010T\u001a\u00020UH\u0002R\u000e\u0010\r\u001a\u00020\u000eX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\"\u001a\n $*\u0004\u0018\u00010#0#X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010&\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b(\u0010)R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u000e\u0010.\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010/\u001a\u0002008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010+\u001a\u0004\b1\u00102R\u000e\u00104\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u00106\u001a\n\u0012\u0004\u0012\u000208\u0018\u000107X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u00109\u001a\n $*\u0004\u0018\u00010#0#X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010:\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u0010+\u001a\u0004\b;\u0010<R\u001b\u0010>\u001a\u00020?8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bB\u0010+\u001a\u0004\b@\u0010AR\u000e\u0010C\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010E\u001a\u0004\u0018\u00010FX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006f"}, m90084d2 = {"Lcom/tencent/bugly/common/replay/ScreenshotRecorder;", "Landroid/view/ViewTreeObserver$OnDrawListener;", "config", "Lcom/tencent/bugly/common/replay/ScreenshotRecorderConfig;", "options", "Lcom/tencent/bugly/common/replay/BuglyReplayOptions;", "mainLooperHandler", "Lcom/tencent/bugly/common/replay/tool/MainLooperHandler;", "recorder", "Ljava/util/concurrent/ScheduledExecutorService;", "screenshotRecorderCallback", "Lcom/tencent/bugly/common/replay/ScreenshotRecorderCallback;", "(Lcom/tencent/bugly/common/replay/ScreenshotRecorderConfig;Lcom/tencent/bugly/common/replay/BuglyReplayOptions;Lcom/tencent/bugly/common/replay/tool/MainLooperHandler;Ljava/util/concurrent/ScheduledExecutorService;Lcom/tencent/bugly/common/replay/ScreenshotRecorderCallback;)V", "TAG", "", "blurProgram", "", "blurTexture", "", "getConfig", "()Lcom/tencent/bugly/common/replay/ScreenshotRecorderConfig;", "contentChanged", "Ljava/util/concurrent/atomic/AtomicBoolean;", "eglContext", "Landroid/opengl/EGLContext;", "eglDisplay", "Landroid/opengl/EGLDisplay;", "eglSurface", "Landroid/opengl/EGLSurface;", "isCapturing", "isOpenGLInitialized", "", "lastBitmapHeight", "lastBitmapWidth", "lastBlurScreenshot", "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "lastCaptureSuccessful", "maskingPaint", "Landroid/graphics/Paint;", "getMaskingPaint", "()Landroid/graphics/Paint;", "maskingPaint$delegate", "Lkotlin/Lazy;", "getOptions", "()Lcom/tencent/bugly/common/replay/BuglyReplayOptions;", "positionLocation", "prescaledMatrix", "Landroid/graphics/Matrix;", "getPrescaledMatrix", "()Landroid/graphics/Matrix;", "prescaledMatrix$delegate", "radiusLocation", "resolutionLocation", "rootView", "Ljava/lang/ref/WeakReference;", "Landroid/view/View;", "screenshot", "singlePixelBitmap", "getSinglePixelBitmap", "()Landroid/graphics/Bitmap;", "singlePixelBitmap$delegate", "singlePixelBitmapCanvas", "Landroid/graphics/Canvas;", "getSinglePixelBitmapCanvas", "()Landroid/graphics/Canvas;", "singlePixelBitmapCanvas$delegate", "texCoordLocation", "textureLocation", "vertexBuffer", "Ljava/nio/FloatBuffer;", "bind", "", "root", "blurBitmap", "original", "radius", "", BridgeParamKeyKt.CAPTURE, "cleanupOpenGLResources", "close", "copyRectPixels", "bitmapA", "bitmapB", "rect", "Landroid/graphics/Rect;", "createShaderProgram", "vertexShaderSource", "fragmentShaderSource", "initializeOpenGL", "width", "height", "loadShader", "type", "shaderCode", "onDraw", "pause", "resume", "transformRect", "matrix", "unbind", "dominantColorForRect", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
@TargetApi(26)
public final class ScreenshotRecorder implements ViewTreeObserver.OnDrawListener {

    @NotNull
    private final String TAG;
    private int blurProgram;

    @Nullable
    private int[] blurTexture;

    @NotNull
    private final ScreenshotRecorderConfig config;

    @NotNull
    private final AtomicBoolean contentChanged;

    @Nullable
    private EGLContext eglContext;

    @Nullable
    private EGLDisplay eglDisplay;

    @Nullable
    private EGLSurface eglSurface;

    @NotNull
    private final AtomicBoolean isCapturing;
    private boolean isOpenGLInitialized;
    private int lastBitmapHeight;
    private int lastBitmapWidth;
    private final Bitmap lastBlurScreenshot;

    @NotNull
    private final AtomicBoolean lastCaptureSuccessful;

    @NotNull
    private final MainLooperHandler mainLooperHandler;

    /* JADX INFO: renamed from: maskingPaint$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy maskingPaint;

    @NotNull
    private final BuglyReplayOptions options;
    private int positionLocation;

    /* JADX INFO: renamed from: prescaledMatrix$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy prescaledMatrix;
    private int radiusLocation;

    @NotNull
    private final ScheduledExecutorService recorder;
    private int resolutionLocation;

    @Nullable
    private WeakReference<View> rootView;
    private final Bitmap screenshot;

    @Nullable
    private final ScreenshotRecorderCallback screenshotRecorderCallback;

    /* JADX INFO: renamed from: singlePixelBitmap$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy singlePixelBitmap;

    /* JADX INFO: renamed from: singlePixelBitmapCanvas$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy singlePixelBitmapCanvas;
    private int texCoordLocation;
    private int textureLocation;

    @Nullable
    private FloatBuffer vertexBuffer;

    /* JADX INFO: renamed from: com.tencent.bugly.common.replay.ScreenshotRecorder$capture$1 */
    /* JADX INFO: compiled from: BUGLY */
    @Metadata(m90083d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m90084d2 = {"<anonymous>", "", "invoke"}, m90085k = 3, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class C335101 extends Lambda implements Function0<Unit> {
        final /* synthetic */ View $root;
        final /* synthetic */ Window $window;

        @Override // p852kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C335101(Window window, View view) {
            super(0);
            this.$window = window;
            this.$root = view;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            try {
                ScreenshotRecorder.this.contentChanged.set(false);
                Window window = this.$window;
                Bitmap bitmap = ScreenshotRecorder.this.screenshot;
                final ScreenshotRecorder screenshotRecorder = ScreenshotRecorder.this;
                final View view = this.$root;
                PixelCopy.request(window, bitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: com.tencent.bugly.common.replay.d
                    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                    public final void onPixelCopyFinished(int i11) {
                        ScreenshotRecorder.C335101.m103814invoke$lambda1(screenshotRecorder, view, i11);
                    }
                }, ScreenshotRecorder.this.mainLooperHandler.getHandler());
            } catch (Throwable th2) {
                Logger.INSTANCE.exception(ScreenshotRecorder.this.TAG, "Failed to capture replay recording", th2);
                ScreenshotRecorder.this.lastCaptureSuccessful.set(false);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: invoke$lambda-1, reason: not valid java name */
        public static final void m103814invoke$lambda1(final ScreenshotRecorder this$0, View view, int i11) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            if (i11 != 0) {
                Logger.INSTANCE.mo77132i(this$0.TAG, C33986vi.m75326a("Failed to capture replay recording: ", i11));
                this$0.lastCaptureSuccessful.set(false);
            } else if (this$0.contentChanged.get()) {
                Logger.INSTANCE.mo77132i(this$0.TAG, "Failed to determine view hierarchy, not capturing");
                this$0.lastCaptureSuccessful.set(false);
            } else {
                final ViewHierarchyNode viewHierarchyNodeFromView = ViewHierarchyNode.INSTANCE.fromView(view, null, 0, this$0.getOptions());
                ViewsKt.traverse(view, viewHierarchyNodeFromView, this$0.getOptions());
                ExecutorsKt.submitSafely(this$0.recorder, "screenshot_recorder.mask", new Runnable() { // from class: com.tencent.bugly.common.replay.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        ScreenshotRecorder.C335101.m103815invoke$lambda1$lambda0(this$0, viewHierarchyNodeFromView);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: invoke$lambda-1$lambda-0, reason: not valid java name */
        public static final void m103815invoke$lambda1$lambda0(final ScreenshotRecorder this$0, ViewHierarchyNode viewHierarchy) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(viewHierarchy, "$viewHierarchy");
            Bitmap screenshot = this$0.screenshot;
            Intrinsics.checkNotNullExpressionValue(screenshot, "screenshot");
            final Bitmap bitmapBlurBitmap = this$0.blurBitmap(screenshot, 5.0f);
            try {
                viewHierarchy.traverse(new Function1<ViewHierarchyNode, Boolean>() { // from class: com.tencent.bugly.common.replay.ScreenshotRecorder$capture$1$1$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p852kotlin.jvm.functions.Function1
                    @NotNull
                    public final Boolean invoke(@NotNull ViewHierarchyNode node) {
                        Pair pairM90091to;
                        Integer dominantColor;
                        Intrinsics.checkNotNullParameter(node, "node");
                        if (!node.getShouldMask() && node.getWidth() > 0 && node.getHeight() > 0) {
                            if (node.getVisibleRect() == null) {
                                return Boolean.FALSE;
                            }
                            boolean z11 = node instanceof ViewHierarchyNode.TextViewHierarchyNode;
                            int iIntValue = ViewCompat.MEASURED_STATE_MASK;
                            if (z11) {
                                ViewHierarchyNode.TextViewHierarchyNode textViewHierarchyNode = (ViewHierarchyNode.TextViewHierarchyNode) node;
                                TextLayout layout = textViewHierarchyNode.getLayout();
                                if ((layout != null && (dominantColor = layout.getDominantTextColor()) != null) || (dominantColor = textViewHierarchyNode.getDominantColor()) != null) {
                                    iIntValue = dominantColor.intValue();
                                }
                                pairM90091to = TuplesKt.m90091to(ViewsKt.getVisibleRects(textViewHierarchyNode.getLayout(), node.getVisibleRect(), textViewHierarchyNode.getPaddingLeft(), textViewHierarchyNode.getPaddingTop()), Integer.valueOf(iIntValue));
                            } else {
                                pairM90091to = TuplesKt.m90091to(CollectionsKt.listOf(node.getVisibleRect()), Integer.valueOf(ViewCompat.MEASURED_STATE_MASK));
                            }
                            List<Rect> list = (List) pairM90091to.component1();
                            ((Number) pairM90091to.component2()).intValue();
                            ScreenshotRecorder screenshotRecorder = this$0;
                            Bitmap bitmap = bitmapBlurBitmap;
                            for (Rect rect : list) {
                                Bitmap screenshot2 = screenshotRecorder.screenshot;
                                Intrinsics.checkNotNullExpressionValue(screenshot2, "screenshot");
                                screenshotRecorder.copyRectPixels(screenshot2, bitmap, screenshotRecorder.transformRect(rect, screenshotRecorder.getPrescaledMatrix()));
                            }
                        }
                        return Boolean.TRUE;
                    }
                });
                new Canvas(this$0.lastBlurScreenshot).drawBitmap(bitmapBlurBitmap, 0.0f, 0.0f, (Paint) null);
                ScreenshotRecorderCallback screenshotRecorderCallback = this$0.screenshotRecorderCallback;
                if (screenshotRecorderCallback != null) {
                    screenshotRecorderCallback.onScreenshotRecorded(bitmapBlurBitmap, true);
                }
                this$0.lastCaptureSuccessful.set(true);
                this$0.contentChanged.set(false);
            } catch (Exception e11) {
                Logger.INSTANCE.exception(this$0.TAG, "Failed to process blur screenshot", e11);
                if (!bitmapBlurBitmap.isRecycled()) {
                    bitmapBlurBitmap.recycle();
                }
                this$0.lastCaptureSuccessful.set(false);
            }
        }
    }

    public ScreenshotRecorder(@NotNull ScreenshotRecorderConfig config, @NotNull BuglyReplayOptions options, @NotNull MainLooperHandler mainLooperHandler, @NotNull ScheduledExecutorService recorder, @Nullable ScreenshotRecorderCallback screenshotRecorderCallback) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(mainLooperHandler, "mainLooperHandler");
        Intrinsics.checkNotNullParameter(recorder, "recorder");
        this.config = config;
        this.options = options;
        this.mainLooperHandler = mainLooperHandler;
        this.recorder = recorder;
        this.screenshotRecorderCallback = screenshotRecorderCallback;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.maskingPaint = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<Paint>() { // from class: com.tencent.bugly.common.replay.ScreenshotRecorder$maskingPaint$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final Paint invoke() {
                return new Paint();
            }
        });
        this.TAG = "ScreenshotRecorder";
        this.singlePixelBitmap = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<Bitmap>() { // from class: com.tencent.bugly.common.replay.ScreenshotRecorder$singlePixelBitmap$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            public final Bitmap invoke() {
                return Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            }
        });
        int recordingWidth = config.getRecordingWidth();
        int recordingHeight = config.getRecordingHeight();
        Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
        this.screenshot = Bitmap.createBitmap(recordingWidth, recordingHeight, config2);
        this.lastBlurScreenshot = Bitmap.createBitmap(config.getRecordingWidth(), config.getRecordingHeight(), config2);
        this.singlePixelBitmapCanvas = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<Canvas>() { // from class: com.tencent.bugly.common.replay.ScreenshotRecorder$singlePixelBitmapCanvas$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final Canvas invoke() {
                return new Canvas(this.this$0.getSinglePixelBitmap());
            }

            {
                super(0);
            }
        });
        this.prescaledMatrix = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<Matrix>() { // from class: com.tencent.bugly.common.replay.ScreenshotRecorder$prescaledMatrix$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final Matrix invoke() {
                Matrix matrix = new Matrix();
                ScreenshotRecorder screenshotRecorder = this.this$0;
                matrix.preScale(screenshotRecorder.getConfig().getScaleFactorX(), screenshotRecorder.getConfig().getScaleFactorY());
                return matrix;
            }
        });
        this.contentChanged = new AtomicBoolean(false);
        this.isCapturing = new AtomicBoolean(true);
        this.lastCaptureSuccessful = new AtomicBoolean(false);
        this.radiusLocation = -1;
        this.resolutionLocation = -1;
        this.textureLocation = -1;
        this.positionLocation = -1;
        this.texCoordLocation = -1;
    }

    private final void cleanupOpenGLResources() {
        try {
            int[] iArr = this.blurTexture;
            if (iArr != null) {
                GLES20.glDeleteTextures(1, iArr, 0);
                this.blurTexture = null;
            }
            int i11 = this.blurProgram;
            if (i11 != 0) {
                GLES20.glDeleteProgram(i11);
                this.blurProgram = 0;
            }
            EGLDisplay eGLDisplay = this.eglDisplay;
            if (eGLDisplay != null) {
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                EGLSurface eGLSurface2 = this.eglSurface;
                if (eGLSurface2 != null) {
                    EGL14.eglDestroySurface(eGLDisplay, eGLSurface2);
                    this.eglSurface = null;
                }
                EGLContext eGLContext = this.eglContext;
                if (eGLContext != null) {
                    EGL14.eglDestroyContext(eGLDisplay, eGLContext);
                    this.eglContext = null;
                }
                EGL14.eglTerminate(eGLDisplay);
                this.eglDisplay = null;
            }
            this.vertexBuffer = null;
            this.isOpenGLInitialized = false;
            this.lastBitmapWidth = 0;
            this.lastBitmapHeight = 0;
            this.radiusLocation = -1;
            this.resolutionLocation = -1;
            this.textureLocation = -1;
            this.positionLocation = -1;
            this.texCoordLocation = -1;
        } catch (Exception e11) {
            Logger.INSTANCE.exception(this.TAG, "Failed to cleanup OpenGL ES resources", e11);
        }
    }

    private final int dominantColorForRect(Bitmap bitmap, Rect rect) {
        Rect rect2 = new Rect(rect);
        RectF rectF = new RectF(rect2);
        getPrescaledMatrix().mapRect(rectF);
        rectF.round(rect2);
        getSinglePixelBitmapCanvas().drawBitmap(bitmap, rect2, new Rect(0, 0, 1, 1), (Paint) null);
        return getSinglePixelBitmap().getPixel(0, 0);
    }

    private final Paint getMaskingPaint() {
        return (Paint) this.maskingPaint.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Matrix getPrescaledMatrix() {
        return (Matrix) this.prescaledMatrix.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap getSinglePixelBitmap() {
        Object value = this.singlePixelBitmap.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-singlePixelBitmap>(...)");
        return (Bitmap) value;
    }

    private final Canvas getSinglePixelBitmapCanvas() {
        return (Canvas) this.singlePixelBitmapCanvas.getValue();
    }

    private final void initializeOpenGL(int width, int height) throws Exception {
        try {
            EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
            this.eglDisplay = eGLDisplayEglGetDisplay;
            if (Intrinsics.areEqual(eGLDisplayEglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
                throw new RuntimeException("Unable to get EGL14 display");
            }
            int[] iArr = new int[2];
            if (!EGL14.eglInitialize(this.eglDisplay, iArr, 0, iArr, 1)) {
                throw new RuntimeException("Unable to initialize EGL14");
            }
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            int[] iArr2 = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12344};
            if (!EGL14.eglChooseConfig(this.eglDisplay, iArr2, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                throw new RuntimeException("Unable to find a suitable EGLConfig");
            }
            EGLConfig eGLConfig = eGLConfigArr[0];
            if (eGLConfig == null) {
                throw new RuntimeException("Unable to find a suitable EGLConfig");
            }
            EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(this.eglDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
            this.eglContext = eGLContextEglCreateContext;
            if (Intrinsics.areEqual(eGLContextEglCreateContext, EGL14.EGL_NO_CONTEXT)) {
                throw new RuntimeException("Failed to create EGL context");
            }
            EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(this.eglDisplay, eGLConfig, new int[]{12375, width, 12374, height, 12344}, 0);
            this.eglSurface = eGLSurfaceEglCreatePbufferSurface;
            if (Intrinsics.areEqual(eGLSurfaceEglCreatePbufferSurface, EGL14.EGL_NO_SURFACE)) {
                throw new RuntimeException("Failed to create EGL surface");
            }
            EGLDisplay eGLDisplay = this.eglDisplay;
            EGLSurface eGLSurface = this.eglSurface;
            if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.eglContext)) {
                throw new RuntimeException("Failed to make EGL context current");
            }
            int iCreateShaderProgram = createShaderProgram("attribute vec4 a_position;\nattribute vec2 a_texCoord;\nvarying vec2 v_texCoord;\nvoid main() {\n    gl_Position = a_position;\n    v_texCoord = a_texCoord;\n}", "precision mediump float;\nuniform sampler2D u_texture;\nuniform float u_radius;\nuniform vec2 u_resolution;\nvarying vec2 v_texCoord;\n\nvoid main() {\n    vec2 texelSize = 1.0 / u_resolution;\n    vec4 color = vec4(0.0);\n    float total = 0.0;\n    \n    int radius = int(u_radius);\n    for (int x = -radius; x <= radius; x++) {\n        for (int y = -radius; y <= radius; y++) {\n            vec2 offset = vec2(float(x), float(y)) * texelSize;\n            float weight = 1.0 - (length(vec2(float(x), float(y))) / u_radius);\n            weight = max(weight, 0.0);\n            color += texture2D(u_texture, v_texCoord + offset) * weight;\n            total += weight;\n        }\n    }\n    \n    gl_FragColor = color / total;\n}");
            this.blurProgram = iCreateShaderProgram;
            this.radiusLocation = GLES20.glGetUniformLocation(iCreateShaderProgram, "u_radius");
            this.resolutionLocation = GLES20.glGetUniformLocation(this.blurProgram, "u_resolution");
            this.textureLocation = GLES20.glGetUniformLocation(this.blurProgram, "u_texture");
            this.positionLocation = GLES20.glGetAttribLocation(this.blurProgram, "a_position");
            this.texCoordLocation = GLES20.glGetAttribLocation(this.blurProgram, "a_texCoord");
            int[] iArr3 = new int[1];
            this.blurTexture = iArr3;
            GLES20.glGenTextures(1, iArr3, 0);
            int[] iArr4 = this.blurTexture;
            Intrinsics.checkNotNull(iArr4);
            GLES20.glBindTexture(3553, iArr4[0]);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glTexParameteri(3553, Data.MAX_DATA_BYTES, 9729);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            GLES20.glTexImage2D(3553, 0, 6408, width, height, 0, 6408, 5121, null);
            Buffer bufferPosition = ByteBuffer.allocateDirect(64).order(ByteOrder.nativeOrder()).asFloatBuffer().put(new float[]{-1.0f, -1.0f, 0.0f, 0.0f, 1.0f, -1.0f, 1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f}).position(0);
            if (bufferPosition == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.nio.FloatBuffer");
            }
            this.vertexBuffer = (FloatBuffer) bufferPosition;
            this.isOpenGLInitialized = true;
            Logger.INSTANCE.mo77130d(this.TAG, "OpenGL ES environment initialized successfully");
        } catch (Exception e11) {
            Logger.INSTANCE.exception(this.TAG, "Failed to initialize OpenGL ES environment", e11);
            cleanupOpenGLResources();
            throw e11;
        }
    }

    public final void capture() {
        if (!this.isCapturing.get()) {
            Logger.INSTANCE.mo77130d(this.TAG, "ScreenshotRecorder is paused, not capturing screenshot");
            return;
        }
        if (!this.contentChanged.get() && this.lastCaptureSuccessful.get()) {
            ScreenshotRecorderCallback screenshotRecorderCallback = this.screenshotRecorderCallback;
            if (screenshotRecorderCallback != null) {
                Bitmap lastBlurScreenshot = this.lastBlurScreenshot;
                Intrinsics.checkNotNullExpressionValue(lastBlurScreenshot, "lastBlurScreenshot");
                screenshotRecorderCallback.onScreenshotRecorded(lastBlurScreenshot, false);
            }
            Logger.INSTANCE.mo77130d(this.TAG, "Screenshot is unchanged, not capturing screenshot");
            return;
        }
        WeakReference<View> weakReference = this.rootView;
        View view = weakReference != null ? weakReference.get() : null;
        if (view == null || view.getWidth() <= 0 || view.getHeight() <= 0 || !view.isShown()) {
            Logger.INSTANCE.mo77130d(this.TAG, "Root view is invalid, not capturing screenshot");
            return;
        }
        Window phoneWindow = WindowsKt.getPhoneWindow(view);
        if (phoneWindow == null) {
            Logger.INSTANCE.mo77130d(this.TAG, "Window is invalid, not capturing screenshot");
        } else {
            this.mainLooperHandler.post(new C335101(phoneWindow, view));
        }
    }

    public final void close() {
        WeakReference<View> weakReference = this.rootView;
        unbind(weakReference != null ? weakReference.get() : null);
        WeakReference<View> weakReference2 = this.rootView;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        if (!this.screenshot.isRecycled()) {
            this.screenshot.recycle();
        }
        if (!this.lastBlurScreenshot.isRecycled()) {
            this.lastBlurScreenshot.recycle();
        }
        cleanupOpenGLResources();
        this.isCapturing.set(false);
    }

    public final void copyRectPixels(@NotNull Bitmap bitmapA, @NotNull Bitmap bitmapB, @NotNull Rect rect) {
        Intrinsics.checkNotNullParameter(bitmapA, "bitmapA");
        Intrinsics.checkNotNullParameter(bitmapB, "bitmapB");
        Intrinsics.checkNotNullParameter(rect, "rect");
        if (!bitmapA.isMutable() || !bitmapB.isMutable()) {
            throw new IllegalArgumentException("Both bitmaps must be mutable");
        }
        int width = bitmapA.getWidth();
        int height = bitmapA.getHeight();
        int width2 = bitmapB.getWidth();
        int height2 = bitmapB.getHeight();
        int iCoerceAtLeast = RangesKt.coerceAtLeast(rect.left, 0);
        int iCoerceAtLeast2 = RangesKt.coerceAtLeast(rect.top, 0);
        int iCoerceAtMost = RangesKt.coerceAtMost(RangesKt.coerceAtMost(rect.right, width), width2);
        int iCoerceAtMost2 = RangesKt.coerceAtMost(RangesKt.coerceAtMost(rect.bottom, height), height2);
        int i11 = iCoerceAtMost2 - iCoerceAtLeast2;
        if (iCoerceAtMost - iCoerceAtLeast <= 0 || i11 <= 0) {
            return;
        }
        new Canvas(bitmapB).drawBitmap(bitmapA, new Rect(iCoerceAtLeast, iCoerceAtLeast2, iCoerceAtMost, iCoerceAtMost2), new Rect(iCoerceAtLeast, iCoerceAtLeast2, iCoerceAtMost, iCoerceAtMost2), (Paint) null);
    }

    @NotNull
    public final ScreenshotRecorderConfig getConfig() {
        return this.config;
    }

    @NotNull
    public final BuglyReplayOptions getOptions() {
        return this.options;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public void onDraw() {
        WeakReference<View> weakReference = this.rootView;
        View view = weakReference != null ? weakReference.get() : null;
        if (view == null || view.getWidth() <= 0 || view.getHeight() <= 0 || !view.isShown()) {
            Logger.INSTANCE.mo77130d(this.TAG, "Root view is invalid, not capturing screenshot");
        } else {
            this.contentChanged.set(true);
        }
    }

    public final void pause() {
        this.isCapturing.set(false);
        WeakReference<View> weakReference = this.rootView;
        unbind(weakReference != null ? weakReference.get() : null);
    }

    public final void resume() {
        View view;
        WeakReference<View> weakReference = this.rootView;
        if (weakReference != null && (view = weakReference.get()) != null) {
            ViewsKt.addOnDrawListenerSafe(view, this);
        }
        this.isCapturing.set(true);
    }

    public final void unbind(@Nullable View root) {
        if (root != null) {
            ViewsKt.removeOnDrawListenerSafe(root, this);
        }
    }

    private final int createShaderProgram(String vertexShaderSource, String fragmentShaderSource) {
        int iLoadShader = loadShader(35633, vertexShaderSource);
        int iLoadShader2 = loadShader(35632, fragmentShaderSource);
        int iGlCreateProgram = GLES20.glCreateProgram();
        GLES20.glAttachShader(iGlCreateProgram, iLoadShader);
        GLES20.glAttachShader(iGlCreateProgram, iLoadShader2);
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        if (iArr[0] == 1) {
            GLES20.glDeleteShader(iLoadShader);
            GLES20.glDeleteShader(iLoadShader2);
            return iGlCreateProgram;
        }
        String strGlGetProgramInfoLog = GLES20.glGetProgramInfoLog(iGlCreateProgram);
        GLES20.glDeleteProgram(iGlCreateProgram);
        throw new RuntimeException(C33770l7.m73937a("Failed to link shader program: ", strGlGetProgramInfoLog));
    }

    private final int loadShader(int type, String shaderCode) {
        int iGlCreateShader = GLES20.glCreateShader(type);
        GLES20.glShaderSource(iGlCreateShader, shaderCode);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] == 1) {
            return iGlCreateShader;
        }
        String strGlGetShaderInfoLog = GLES20.glGetShaderInfoLog(iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        throw new RuntimeException(C33770l7.m73937a("Failed to compile shader: ", strGlGetShaderInfoLog));
    }

    public final void bind(@NotNull View root) {
        View view;
        Intrinsics.checkNotNullParameter(root, "root");
        WeakReference<View> weakReference = this.rootView;
        if (weakReference != null) {
            view = weakReference.get();
        } else {
            view = null;
        }
        unbind(view);
        WeakReference<View> weakReference2 = this.rootView;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        this.rootView = new WeakReference<>(root);
        ViewsKt.addOnDrawListenerSafe(root, this);
        this.contentChanged.set(true);
    }

    @NotNull
    public final Bitmap blurBitmap(@NotNull Bitmap original, float radius) {
        Intrinsics.checkNotNullParameter(original, "original");
        try {
            if (!this.isOpenGLInitialized || this.lastBitmapWidth != original.getWidth() || this.lastBitmapHeight != original.getHeight()) {
                cleanupOpenGLResources();
                initializeOpenGL(original.getWidth(), original.getHeight());
                this.lastBitmapWidth = original.getWidth();
                this.lastBitmapHeight = original.getHeight();
            }
            EGLDisplay eGLDisplay = this.eglDisplay;
            EGLSurface eGLSurface = this.eglSurface;
            if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.eglContext)) {
                GLES20.glViewport(0, 0, original.getWidth(), original.getHeight());
                GLES20.glUseProgram(this.blurProgram);
                int[] iArr = this.blurTexture;
                Intrinsics.checkNotNull(iArr);
                GLES20.glBindTexture(3553, iArr[0]);
                GLUtils.texSubImage2D(3553, 0, 0, 0, original);
                GLES20.glUniform1f(this.radiusLocation, radius);
                GLES20.glUniform2f(this.resolutionLocation, original.getWidth(), original.getHeight());
                GLES20.glUniform1i(this.textureLocation, 0);
                GLES20.glEnableVertexAttribArray(this.positionLocation);
                GLES20.glEnableVertexAttribArray(this.texCoordLocation);
                FloatBuffer floatBuffer = this.vertexBuffer;
                Intrinsics.checkNotNull(floatBuffer);
                floatBuffer.position(0);
                GLES20.glVertexAttribPointer(this.positionLocation, 2, 5126, false, 16, (Buffer) this.vertexBuffer);
                FloatBuffer floatBuffer2 = this.vertexBuffer;
                Intrinsics.checkNotNull(floatBuffer2);
                floatBuffer2.position(2);
                GLES20.glVertexAttribPointer(this.texCoordLocation, 2, 5126, false, 16, (Buffer) this.vertexBuffer);
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                GLES20.glClear(16384);
                GLES20.glDrawArrays(5, 0, 4);
                ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(original.getWidth() * original.getHeight() * 4);
                GLES20.glReadPixels(0, 0, original.getWidth(), original.getHeight(), 6408, 5121, byteBufferAllocateDirect);
                Bitmap resultBitmap = Bitmap.createBitmap(original.getWidth(), original.getHeight(), Bitmap.Config.ARGB_8888);
                resultBitmap.copyPixelsFromBuffer(byteBufferAllocateDirect);
                Intrinsics.checkNotNullExpressionValue(resultBitmap, "resultBitmap");
                return resultBitmap;
            }
            throw new RuntimeException("Failed to make EGL context current");
        } catch (Throwable th2) {
            Logger.INSTANCE.exception(this.TAG, "Failed to blur bitmap with OpenGL ES", th2);
            cleanupOpenGLResources();
            Bitmap bitmapCopy = original.copy(original.getConfig(), false);
            Intrinsics.checkNotNullExpressionValue(bitmapCopy, "original.copy(original.config, false)");
            return bitmapCopy;
        }
    }

    @NotNull
    public final Rect transformRect(@NotNull Rect rect, @NotNull Matrix matrix) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        RectF rectF = new RectF(rect);
        matrix.mapRect(rectF);
        Rect rect2 = new Rect();
        rectF.round(rect2);
        return rect2;
    }
}
