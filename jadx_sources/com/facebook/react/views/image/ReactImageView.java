package com.facebook.react.views.image;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.drawee.drawable.InterfaceC5597q;
import com.facebook.drawee.drawable.RunnableC5576b;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.view.GenericDraweeView;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.core.DownsampleMode;
import com.facebook.imagepipeline.request.AbstractC5741a;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.imagepipeline.request.InterfaceC5742b;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.annotations.VisibleForTesting;
import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.modules.fresco.ImageCacheControl;
import com.facebook.react.modules.fresco.ReactNetworkImageRequest;
import com.facebook.react.uimanager.BackgroundStyleApplicator;
import com.facebook.react.uimanager.LengthPercentage;
import com.facebook.react.uimanager.LengthPercentageType;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.style.BorderRadiusProp;
import com.facebook.react.uimanager.style.LogicalEdge;
import com.facebook.react.util.RNLog;
import com.facebook.react.views.imagehelper.ImageSource;
import com.facebook.react.views.imagehelper.MultiSourceHelper;
import com.facebook.react.views.imagehelper.ResourceDrawableIdHelper;
import com.tencent.bugly.proguard.C33590cg;
import com.tencent.live2.impl.V2TXLiveProperty;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p006a4.AbstractC0110a;
import p052c6.C4846a;
import p190d4.C36613d;
import p392k4.C40889d;
import p487o4.C42958e;
import p487o4.InterfaceC42956c;
import p526p5.AbstractC43387c;
import p584r4.C43921a;
import p584r4.C43922b;
import p749x5.InterfaceC46077k;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: ReactImageView.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010!\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u0092\u00012\u00020\u0001:\u0004\u0093\u0001\u0092\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010\"\u001a\u00020\u00162\b\u0010!\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u00162\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b$\u0010%J\u0015\u0010'\u001a\u00020\u00162\u0006\u0010&\u001a\u00020\u0014¢\u0006\u0004\b'\u0010\u0018J\u0015\u0010*\u001a\u00020\u00162\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020\u00162\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b.\u0010/J\u0015\u00101\u001a\u00020\u00162\u0006\u00100\u001a\u00020,¢\u0006\u0004\b1\u0010/J\u0015\u00103\u001a\u00020\u00162\u0006\u00102\u001a\u00020,¢\u0006\u0004\b3\u0010/J\u0015\u00105\u001a\u00020\u00162\u0006\u00104\u001a\u00020(¢\u0006\u0004\b5\u0010+J\u0015\u00107\u001a\u00020\u00162\u0006\u00106\u001a\u00020(¢\u0006\u0004\b7\u0010+J\u001d\u00107\u001a\u00020\u00162\u0006\u00106\u001a\u00020(2\u0006\u00108\u001a\u00020,¢\u0006\u0004\b7\u00109J\u0015\u0010<\u001a\u00020\u00162\u0006\u0010;\u001a\u00020:¢\u0006\u0004\b<\u0010=J\u0015\u0010@\u001a\u00020\u00162\u0006\u0010?\u001a\u00020>¢\u0006\u0004\b@\u0010AJ\u0015\u0010D\u001a\u00020\u00162\u0006\u0010C\u001a\u00020B¢\u0006\u0004\bD\u0010EJ\u0015\u0010G\u001a\u00020\u00162\u0006\u0010F\u001a\u00020(¢\u0006\u0004\bG\u0010+J\u0017\u0010J\u001a\u00020\u00162\b\u0010I\u001a\u0004\u0018\u00010H¢\u0006\u0004\bJ\u0010KJ\u0017\u0010M\u001a\u00020\u00162\b\u0010L\u001a\u0004\u0018\u00010\f¢\u0006\u0004\bM\u0010#J\u0017\u0010N\u001a\u00020\u00162\b\u0010L\u001a\u0004\u0018\u00010\f¢\u0006\u0004\bN\u0010#J\u0015\u0010P\u001a\u00020\u00162\u0006\u0010O\u001a\u00020\u0014¢\u0006\u0004\bP\u0010\u0018J\u0015\u0010R\u001a\u00020\u00162\u0006\u0010Q\u001a\u00020,¢\u0006\u0004\bR\u0010/J\u0017\u0010U\u001a\u00020\u00162\b\u0010T\u001a\u0004\u0018\u00010S¢\u0006\u0004\bU\u0010VJ\u000f\u0010W\u001a\u00020\u0014H\u0016¢\u0006\u0004\bW\u0010\u001aJ\u0017\u0010Z\u001a\u00020\u00162\u0006\u0010Y\u001a\u00020XH\u0016¢\u0006\u0004\bZ\u0010[J\r\u0010\\\u001a\u00020\u0016¢\u0006\u0004\b\\\u0010\u001cJ\u001f\u0010`\u001a\u00020\u00162\u000e\u0010_\u001a\n\u0012\u0004\u0012\u00020^\u0018\u00010]H\u0007¢\u0006\u0004\b`\u0010aJ/\u0010f\u001a\u00020\u00162\u0006\u0010b\u001a\u00020,2\u0006\u0010c\u001a\u00020,2\u0006\u0010d\u001a\u00020,2\u0006\u0010e\u001a\u00020,H\u0014¢\u0006\u0004\bf\u0010gR$\u0010\u0005\u001a\u0012\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010hR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010iR\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010jR\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020\u001d0k8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010lR$\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR\u0018\u0010r\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010mR\u0018\u0010t\u001a\u0004\u0018\u00010s8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010uR\u0018\u0010v\u001a\u0004\u0018\u00010s8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010uR\u0016\u00102\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010wR\u0016\u0010;\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010xR\u0016\u0010?\u001a\u00020>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010yR\u0016\u0010z\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010{R\u001c\u0010}\u001a\b\u0018\u00010|R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b}\u0010~R\u001b\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u007f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\"\u0010\u0083\u0001\u001a\u000b\u0012\u0004\u0012\u00020^\u0018\u00010\u0082\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R!\u0010\u0085\u0001\u001a\n\u0012\u0004\u0012\u00020^\u0018\u00010]8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0018\u0010\u0087\u0001\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0087\u0001\u0010wR\u0018\u0010\u0088\u0001\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0088\u0001\u0010{R\u0019\u0010T\u001a\u0004\u0018\u00010S8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bT\u0010\u0089\u0001R\u0019\u0010\u008a\u0001\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0017\u0010C\u001a\u00020B8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bC\u0010\u008c\u0001R\u0016\u0010\u008d\u0001\u001a\u00020\u00148BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u008d\u0001\u0010\u001aR\u001a\u0010\u0091\u0001\u001a\u0005\u0018\u00010\u008e\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001¨\u0006\u0094\u0001"}, m90084d2 = {"Lcom/facebook/react/views/image/ReactImageView;", "Lcom/facebook/drawee/view/GenericDraweeView;", "Landroid/content/Context;", "context", "Lcom/facebook/drawee/controller/AbstractDraweeControllerBuilder;", "draweeControllerBuilder", "Lcom/facebook/react/views/image/GlobalImageLoadListener;", "globalImageLoadListener", "", "callerContext", "<init>", "(Landroid/content/Context;Lcom/facebook/drawee/controller/AbstractDraweeControllerBuilder;Lcom/facebook/react/views/image/GlobalImageLoadListener;Ljava/lang/Object;)V", "", "cacheControl", "Lcom/facebook/react/modules/fresco/ImageCacheControl;", "computeCacheControl", "(Ljava/lang/String;)Lcom/facebook/react/modules/fresco/ImageCacheControl;", "Lcom/facebook/imagepipeline/request/ImageRequest$RequestLevel;", "computeRequestLevel", "(Lcom/facebook/react/modules/fresco/ImageCacheControl;)Lcom/facebook/imagepipeline/request/ImageRequest$RequestLevel;", "", "doResize", "", "maybeUpdateViewFromRequest", "(Z)V", "hasMultipleSources", "()Z", "setSourceImage", "()V", "Lcom/facebook/react/views/imagehelper/ImageSource;", "imageSource", "shouldResize", "(Lcom/facebook/react/views/imagehelper/ImageSource;)Z", "uri", "warnImageSource", "(Ljava/lang/String;)V", "updateCallerContext", "(Ljava/lang/Object;)V", "shouldNotify", "setShouldNotifyLoadEvents", "", "blurRadius", "setBlurRadius", "(F)V", "", "backgroundColor", "setBackgroundColor", "(I)V", ViewProps.BORDER_COLOR, "setBorderColor", "overlayColor", "setOverlayColor", ViewProps.BORDER_WIDTH, "setBorderWidth", "borderRadius", "setBorderRadius", ViewProps.POSITION, "(FI)V", "Lcom/facebook/drawee/drawable/q;", "scaleType", "setScaleType", "(Lcom/facebook/drawee/drawable/q;)V", "Landroid/graphics/Shader$TileMode;", "tileMode", "setTileMode", "(Landroid/graphics/Shader$TileMode;)V", "Lcom/facebook/react/views/image/ImageResizeMethod;", ViewProps.RESIZE_METHOD, "setResizeMethod", "(Lcom/facebook/react/views/image/ImageResizeMethod;)V", "multiplier", "setResizeMultiplier", "Lcom/facebook/react/bridge/ReadableArray;", "sources", "setSource", "(Lcom/facebook/react/bridge/ReadableArray;)V", "name", "setDefaultSource", "setLoadingIndicatorSource", "enabled", "setProgressiveRenderingEnabled", "durationMs", "setFadeDuration", "Lcom/facebook/react/bridge/ReadableMap;", "headers", V2TXLiveProperty.kV2SetHeaders, "(Lcom/facebook/react/bridge/ReadableMap;)V", "hasOverlappingRendering", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "maybeUpdateView", "Lo4/c;", "Lx5/k;", "controllerListener", "setControllerListener", "(Lo4/c;)V", "w", CmcdData.Factory.STREAMING_FORMAT_HLS, "oldw", "oldh", "onSizeChanged", "(IIII)V", "Lcom/facebook/drawee/controller/AbstractDraweeControllerBuilder;", "Lcom/facebook/react/views/image/GlobalImageLoadListener;", "Ljava/lang/Object;", "", "Ljava/util/List;", "Lcom/facebook/react/views/imagehelper/ImageSource;", "getImageSource$ReactAndroid_release", "()Lcom/facebook/react/views/imagehelper/ImageSource;", "setImageSource$ReactAndroid_release", "(Lcom/facebook/react/views/imagehelper/ImageSource;)V", "cachedImageSource", "Landroid/graphics/drawable/Drawable;", "defaultImageDrawable", "Landroid/graphics/drawable/Drawable;", "loadingImageDrawable", "I", "Lcom/facebook/drawee/drawable/q;", "Landroid/graphics/Shader$TileMode;", "isDirty", "Z", "Lcom/facebook/react/views/image/ReactImageView$TilePostprocessor;", "tilePostprocessor", "Lcom/facebook/react/views/image/ReactImageView$TilePostprocessor;", "Lc6/a;", "iterativeBoxBlurPostProcessor", "Lc6/a;", "Lcom/facebook/react/views/image/ReactImageDownloadListener;", "downloadListener", "Lcom/facebook/react/views/image/ReactImageDownloadListener;", "controllerForTesting", "Lo4/c;", "fadeDurationMs", "progressiveRenderingEnabled", "Lcom/facebook/react/bridge/ReadableMap;", "resizeMultiplier", "F", "Lcom/facebook/react/views/image/ImageResizeMethod;", "isTiled", "Lcom/facebook/imagepipeline/common/ResizeOptions;", "getResizeOptions", "()Lcom/facebook/imagepipeline/common/ResizeOptions;", "resizeOptions", "Companion", "TilePostprocessor", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nReactImageView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactImageView.kt\ncom/facebook/react/views/image/ReactImageView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,629:1\n1#2:630\n*E\n"})
public final class ReactImageView extends GenericDraweeView {
    public static final int REMOTE_IMAGE_FADE_DURATION_MS = 300;

    @Nullable
    private ImageSource cachedImageSource;

    @Nullable
    private Object callerContext;

    @Nullable
    private InterfaceC42956c<InterfaceC46077k> controllerForTesting;

    @Nullable
    private Drawable defaultImageDrawable;

    @Nullable
    private ReactImageDownloadListener<InterfaceC46077k> downloadListener;

    @NotNull
    private final AbstractDraweeControllerBuilder<?, ?, ?, ?> draweeControllerBuilder;
    private int fadeDurationMs;

    @Nullable
    private final GlobalImageLoadListener globalImageLoadListener;

    @Nullable
    private ReadableMap headers;

    @Nullable
    private ImageSource imageSource;
    private boolean isDirty;

    @Nullable
    private C4846a iterativeBoxBlurPostProcessor;

    @Nullable
    private Drawable loadingImageDrawable;
    private int overlayColor;
    private boolean progressiveRenderingEnabled;

    @NotNull
    private ImageResizeMethod resizeMethod;
    private float resizeMultiplier;

    @NotNull
    private InterfaceC5597q scaleType;

    @NotNull
    private final List<ImageSource> sources;

    @NotNull
    private Shader.TileMode tileMode;

    @Nullable
    private TilePostprocessor tilePostprocessor;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Matrix tileMatrix = new Matrix();

    /* JADX INFO: compiled from: ReactImageView.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m90084d2 = {"Lcom/facebook/react/views/image/ReactImageView$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lr4/a;", "buildHierarchy", "(Landroid/content/Context;)Lr4/a;", "", "REMOTE_IMAGE_FADE_DURATION_MS", "I", "Landroid/graphics/Matrix;", "tileMatrix", "Landroid/graphics/Matrix;", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nReactImageView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactImageView.kt\ncom/facebook/react/views/image/ReactImageView$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,629:1\n1#2:630\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final C43921a buildHierarchy(Context context) {
            C43922b c43922b = new C43922b(context.getResources());
            RoundingParams roundingParamsM8705a = RoundingParams.m8705a(0.0f);
            roundingParamsM8705a.m8723s(true);
            C43921a c43921aM96796a = c43922b.m96794J(roundingParamsM8705a).m96796a();
            Intrinsics.checkNotNullExpressionValue(c43921aM96796a, "build(...)");
            return c43921aM96796a;
        }
    }

    /* JADX INFO: compiled from: ReactImageView.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m90084d2 = {"Lcom/facebook/react/views/image/ReactImageView$TilePostprocessor;", "Lcom/facebook/imagepipeline/request/a;", "<init>", "(Lcom/facebook/react/views/image/ReactImageView;)V", "Landroid/graphics/Bitmap;", "source", "Lp5/c;", "bitmapFactory", "La4/a;", "process", "(Landroid/graphics/Bitmap;Lp5/c;)La4/a;", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public final class TilePostprocessor extends AbstractC5741a {
        public TilePostprocessor() {
        }

        @Override // com.facebook.imagepipeline.request.AbstractC5741a, com.facebook.imagepipeline.request.InterfaceC5742b
        @NotNull
        public AbstractC0110a<Bitmap> process(@NotNull Bitmap source, @NotNull AbstractC43387c bitmapFactory) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(bitmapFactory, "bitmapFactory");
            Rect rect = new Rect(0, 0, ReactImageView.this.getWidth(), ReactImageView.this.getHeight());
            ReactImageView.this.scaleType.getTransform(ReactImageView.tileMatrix, rect, source.getWidth(), source.getHeight(), 0.0f, 0.0f);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            BitmapShader bitmapShader = new BitmapShader(source, ReactImageView.this.tileMode, ReactImageView.this.tileMode);
            bitmapShader.setLocalMatrix(ReactImageView.tileMatrix);
            paint.setShader(bitmapShader);
            AbstractC0110a<Bitmap> abstractC0110aM95560a = bitmapFactory.m95560a(ReactImageView.this.getWidth(), ReactImageView.this.getHeight());
            Intrinsics.checkNotNullExpressionValue(abstractC0110aM95560a, "createBitmap(...)");
            try {
                new Canvas(abstractC0110aM95560a.m565l()).drawRect(rect, paint);
                AbstractC0110a<Bitmap> abstractC0110aClone = abstractC0110aM95560a.clone();
                Intrinsics.checkNotNullExpressionValue(abstractC0110aClone, "clone(...)");
                return abstractC0110aClone;
            } finally {
                AbstractC0110a.m555j(abstractC0110aM95560a);
            }
        }
    }

    private final void setSourceImage() {
        this.imageSource = null;
        if (this.sources.isEmpty()) {
            List<ImageSource> list = this.sources;
            ImageSource.Companion companion = ImageSource.INSTANCE;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            list.add(companion.getTransparentBitmapImageSource(context));
        } else if (hasMultipleSources()) {
            MultiSourceHelper.MultiSourceResult bestSourceForSize = MultiSourceHelper.getBestSourceForSize(getWidth(), getHeight(), this.sources);
            this.imageSource = bestSourceForSize.bestResult;
            this.cachedImageSource = bestSourceForSize.bestResultInCache;
            return;
        }
        this.imageSource = this.sources.get(0);
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    public final void setBorderRadius(float borderRadius) {
        BackgroundStyleApplicator.setBorderRadius(this, BorderRadiusProp.BORDER_RADIUS, Float.isNaN(borderRadius) ? null : new LengthPercentage(PixelUtil.INSTANCE.pxToDp(borderRadius), LengthPercentageType.POINT));
    }

    /* JADX INFO: compiled from: ReactImageView.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 0, 0}, m90088xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ImageCacheControl.values().length];
            try {
                iArr[ImageCacheControl.ONLY_IF_CACHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ImageResizeMethod.values().length];
            try {
                iArr2[ImageResizeMethod.AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[ImageResizeMethod.RESIZE.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactImageView(@NotNull Context context, @NotNull AbstractDraweeControllerBuilder<?, ?, ?, ?> draweeControllerBuilder, @Nullable GlobalImageLoadListener globalImageLoadListener, @Nullable Object obj) {
        super(context, INSTANCE.buildHierarchy(context));
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(draweeControllerBuilder, "draweeControllerBuilder");
        this.draweeControllerBuilder = draweeControllerBuilder;
        this.globalImageLoadListener = globalImageLoadListener;
        this.callerContext = obj;
        this.sources = new ArrayList();
        this.scaleType = ImageResizeMode.defaultValue();
        this.tileMode = ImageResizeMode.defaultTileMode();
        this.fadeDurationMs = -1;
        this.resizeMultiplier = 1.0f;
        this.resizeMethod = ImageResizeMethod.AUTO;
        setLegacyVisibilityHandlingEnabled(true);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0010, code lost:
    
        if (r2.equals("default") == false) goto L21;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final ImageCacheControl computeCacheControl(String cacheControl) {
        if (cacheControl != null) {
            switch (cacheControl.hashCode()) {
                case -1564134880:
                    if (cacheControl.equals("force-cache")) {
                        return ImageCacheControl.FORCE_CACHE;
                    }
                    return ImageCacheControl.DEFAULT;
                case -934641255:
                    if (cacheControl.equals("reload")) {
                        return ImageCacheControl.RELOAD;
                    }
                    return ImageCacheControl.DEFAULT;
                case 706834161:
                    if (cacheControl.equals("only-if-cached")) {
                        return ImageCacheControl.ONLY_IF_CACHED;
                    }
                    return ImageCacheControl.DEFAULT;
                case 1544803905:
                    break;
                default:
                    return ImageCacheControl.DEFAULT;
            }
        }
        return ImageCacheControl.DEFAULT;
    }

    private final ImageRequest.RequestLevel computeRequestLevel(ImageCacheControl cacheControl) {
        return WhenMappings.$EnumSwitchMapping$0[cacheControl.ordinal()] == 1 ? ImageRequest.RequestLevel.DISK_CACHE : ImageRequest.RequestLevel.FULL_FETCH;
    }

    private final boolean hasMultipleSources() {
        return this.sources.size() > 1;
    }

    private final boolean isTiled() {
        return this.tileMode != Shader.TileMode.CLAMP;
    }

    private final void maybeUpdateViewFromRequest(boolean doResize) {
        ImageSource imageSource = this.imageSource;
        if (imageSource == null) {
            return;
        }
        Uri uri = imageSource.getUri();
        ImageCacheControl cacheControl = imageSource.getCacheControl();
        ImageRequest.RequestLevel requestLevelComputeRequestLevel = computeRequestLevel(cacheControl);
        ArrayList arrayList = new ArrayList();
        C4846a c4846a = this.iterativeBoxBlurPostProcessor;
        if (c4846a != null) {
            arrayList.add(c4846a);
        }
        TilePostprocessor tilePostprocessor = this.tilePostprocessor;
        if (tilePostprocessor != null) {
            arrayList.add(tilePostprocessor);
        }
        InterfaceC5742b interfaceC5742bFrom = MultiPostprocessor.INSTANCE.from(arrayList);
        ResizeOptions resizeOptions = doResize ? getResizeOptions() : null;
        if (cacheControl == ImageCacheControl.RELOAD) {
            C40889d.m89525a().m9218g(uri);
        }
        ImageRequestBuilder imageRequestBuilderM9860I = ImageRequestBuilder.m9851x(uri).m9861J(interfaceC5742bFrom).m9865N(resizeOptions).m9893y(true).m9862K(this.progressiveRenderingEnabled).m9860I(requestLevelComputeRequestLevel);
        ImageResizeMethod imageResizeMethod = this.resizeMethod;
        ImageResizeMethod imageResizeMethod2 = ImageResizeMethod.NONE;
        if (imageResizeMethod == imageResizeMethod2) {
            imageRequestBuilderM9860I.m9856E(DownsampleMode.NEVER);
        }
        ReactNetworkImageRequest.Companion companion = ReactNetworkImageRequest.INSTANCE;
        Intrinsics.checkNotNull(imageRequestBuilderM9860I);
        ReactNetworkImageRequest reactNetworkImageRequestFromBuilderWithHeaders = companion.fromBuilderWithHeaders(imageRequestBuilderM9860I, this.headers, cacheControl);
        GlobalImageLoadListener globalImageLoadListener = this.globalImageLoadListener;
        if (globalImageLoadListener != null) {
            globalImageLoadListener.onLoadAttempt(uri);
        }
        AbstractDraweeControllerBuilder<?, ?, ?, ?> abstractDraweeControllerBuilder = this.draweeControllerBuilder;
        Intrinsics.checkNotNull(abstractDraweeControllerBuilder, "null cannot be cast to non-null type com.facebook.drawee.controller.AbstractDraweeControllerBuilder<*, com.facebook.imagepipeline.request.ImageRequest, com.facebook.common.references.CloseableReference<com.facebook.imagepipeline.image.CloseableImage>, com.facebook.imagepipeline.image.ImageInfo>");
        abstractDraweeControllerBuilder.m8640z();
        abstractDraweeControllerBuilder.m8613D(reactNetworkImageRequestFromBuilderWithHeaders).m8610A(true).mo8617a(getController());
        Object obj = this.callerContext;
        if (obj != null) {
            Intrinsics.checkNotNullExpressionValue(abstractDraweeControllerBuilder.m8611B(obj), "setCallerContext(...)");
        }
        ImageSource imageSource2 = this.cachedImageSource;
        if (imageSource2 != null) {
            ImageRequestBuilder imageRequestBuilderM9862K = ImageRequestBuilder.m9851x(imageSource2.getUri()).m9861J(interfaceC5742bFrom).m9865N(resizeOptions).m9893y(true).m9862K(this.progressiveRenderingEnabled);
            if (this.resizeMethod == imageResizeMethod2) {
                imageRequestBuilderM9862K.m9856E(DownsampleMode.NEVER);
            }
            Intrinsics.checkNotNullExpressionValue(abstractDraweeControllerBuilder.m8614E(imageRequestBuilderM9862K.m9872a()), "setLowResImageRequest(...)");
        }
        ReactImageDownloadListener<InterfaceC46077k> reactImageDownloadListener = this.downloadListener;
        if (reactImageDownloadListener == null || this.controllerForTesting == null) {
            InterfaceC42956c<InterfaceC46077k> interfaceC42956c = this.controllerForTesting;
            if (interfaceC42956c != null) {
                abstractDraweeControllerBuilder.m8612C(interfaceC42956c);
            } else if (reactImageDownloadListener != null) {
                abstractDraweeControllerBuilder.m8612C(reactImageDownloadListener);
            }
        } else {
            C42958e c42958e = new C42958e();
            c42958e.m94336a(this.downloadListener);
            c42958e.m94336a(this.controllerForTesting);
            abstractDraweeControllerBuilder.m8612C(c42958e);
        }
        if (this.downloadListener != null) {
            getHierarchy().m96782y(this.downloadListener);
        }
        setController(abstractDraweeControllerBuilder.build());
        abstractDraweeControllerBuilder.m8640z();
    }

    private final boolean shouldResize(ImageSource imageSource) {
        int i11 = WhenMappings.$EnumSwitchMapping$1[this.resizeMethod.ordinal()];
        if (i11 != 1) {
            return i11 == 2;
        }
        return C36613d.m81944m(imageSource.getUri()) || C36613d.m81945n(imageSource.getUri());
    }

    private final void warnImageSource(String uri) {
        if (!ReactBuildConfig.DEBUG || ReactNativeFeatureFlags.enableBridgelessArchitecture()) {
            return;
        }
        Context context = getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        RNLog.m10580w((ReactContext) context, "ReactImageView: Image source \"" + uri + "\" doesn't exist");
    }

    @Nullable
    /* JADX INFO: renamed from: getImageSource$ReactAndroid_release, reason: from getter */
    public final ImageSource getImageSource() {
        return this.imageSource;
    }

    public final void maybeUpdateView() {
        if (this.isDirty) {
            if (!hasMultipleSources() || (getWidth() > 0 && getHeight() > 0)) {
                setSourceImage();
                ImageSource imageSource = this.imageSource;
                if (imageSource == null) {
                    return;
                }
                boolean zShouldResize = shouldResize(imageSource);
                if (!zShouldResize || (getWidth() > 0 && getHeight() > 0)) {
                    if (!isTiled() || (getWidth() > 0 && getHeight() > 0)) {
                        C43921a hierarchy = getHierarchy();
                        hierarchy.m96777t(this.scaleType);
                        Drawable drawable = this.defaultImageDrawable;
                        if (drawable != null) {
                            hierarchy.m96780w(drawable, this.scaleType);
                        }
                        Drawable drawable2 = this.loadingImageDrawable;
                        if (drawable2 != null) {
                            hierarchy.m96780w(drawable2, InterfaceC5597q.f8357g);
                        }
                        RoundingParams roundingParamsM96772o = hierarchy.m96772o();
                        if (roundingParamsM96772o != null) {
                            int i11 = this.overlayColor;
                            if (i11 != 0) {
                                roundingParamsM96772o.m8721q(i11);
                            } else {
                                roundingParamsM96772o.m8725u(RoundingParams.RoundingMethod.BITMAP_ONLY);
                            }
                            hierarchy.m96783z(roundingParamsM96772o);
                        }
                        int i12 = this.fadeDurationMs;
                        if (i12 < 0) {
                            i12 = imageSource.get_isResource() ? 0 : 300;
                        }
                        hierarchy.m96779v(i12);
                        maybeUpdateViewFromRequest(zShouldResize);
                        this.isDirty = false;
                    }
                }
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        BackgroundStyleApplicator.clipToPaddingBox(this, canvas);
        try {
            super.onDraw(canvas);
        } catch (RuntimeException e11) {
            if (this.downloadListener != null) {
                Context context = getContext();
                Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
                EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag((ReactContext) context, getId());
                if (eventDispatcherForReactTag != null) {
                    eventDispatcherForReactTag.dispatchEvent(ImageLoadEvent.INSTANCE.createErrorEvent(UIManagerHelper.getSurfaceId(this), getId(), e11));
                }
            }
        }
    }

    public final void setBlurRadius(float blurRadius) {
        int iDpToPx = ((int) PixelUtil.INSTANCE.dpToPx(blurRadius)) / 2;
        this.iterativeBoxBlurPostProcessor = iDpToPx == 0 ? null : new C4846a(2, iDpToPx);
        this.isDirty = true;
    }

    public final void setBorderColor(int borderColor) {
        BackgroundStyleApplicator.setBorderColor(this, LogicalEdge.ALL, Integer.valueOf(borderColor));
    }

    public final void setBorderWidth(float borderWidth) {
        BackgroundStyleApplicator.setBorderWidth(this, LogicalEdge.ALL, Float.valueOf(borderWidth));
    }

    @VisibleForTesting
    public final void setControllerListener(@Nullable InterfaceC42956c<InterfaceC46077k> controllerListener) {
        this.controllerForTesting = controllerListener;
        this.isDirty = true;
        maybeUpdateView();
    }

    public final void setDefaultSource(@Nullable String name) {
        ResourceDrawableIdHelper companion = ResourceDrawableIdHelper.INSTANCE.getInstance();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Drawable resourceDrawable = companion.getResourceDrawable(context, name);
        if (Intrinsics.areEqual(this.defaultImageDrawable, resourceDrawable)) {
            return;
        }
        this.defaultImageDrawable = resourceDrawable;
        this.isDirty = true;
    }

    public final void setFadeDuration(int durationMs) {
        this.fadeDurationMs = durationMs;
    }

    public final void setHeaders(@Nullable ReadableMap headers) {
        this.headers = headers;
    }

    public final void setImageSource$ReactAndroid_release(@Nullable ImageSource imageSource) {
        this.imageSource = imageSource;
    }

    public final void setLoadingIndicatorSource(@Nullable String name) {
        ResourceDrawableIdHelper companion = ResourceDrawableIdHelper.INSTANCE.getInstance();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Drawable resourceDrawable = companion.getResourceDrawable(context, name);
        RunnableC5576b runnableC5576b = resourceDrawable != null ? new RunnableC5576b(resourceDrawable, 1000) : null;
        if (Intrinsics.areEqual(this.loadingImageDrawable, runnableC5576b)) {
            return;
        }
        this.loadingImageDrawable = runnableC5576b;
        this.isDirty = true;
    }

    public final void setOverlayColor(int overlayColor) {
        if (this.overlayColor != overlayColor) {
            this.overlayColor = overlayColor;
            this.isDirty = true;
        }
    }

    public final void setProgressiveRenderingEnabled(boolean enabled) {
        this.progressiveRenderingEnabled = enabled;
    }

    public final void setResizeMultiplier(float multiplier) {
        if (Math.abs(this.resizeMultiplier - multiplier) > 9.999999747378752E-5d) {
            this.resizeMultiplier = multiplier;
            this.isDirty = true;
        }
    }

    public final void setShouldNotifyLoadEvents(boolean shouldNotify) {
        if (shouldNotify == (this.downloadListener != null)) {
            return;
        }
        if (shouldNotify) {
            Context context = getContext();
            Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            final EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag((ReactContext) context, getId());
            this.downloadListener = new ReactImageDownloadListener<InterfaceC46077k>() { // from class: com.facebook.react.views.image.ReactImageView.setShouldNotifyLoadEvents.1
                @Override // com.facebook.react.views.image.ReactImageDownloadListener, p487o4.InterfaceC42956c
                public void onFailure(String id2, Throwable throwable) {
                    Intrinsics.checkNotNullParameter(id2, "id");
                    Intrinsics.checkNotNullParameter(throwable, "throwable");
                    EventDispatcher eventDispatcher = eventDispatcherForReactTag;
                    if (eventDispatcher == null) {
                        return;
                    }
                    eventDispatcher.dispatchEvent(ImageLoadEvent.INSTANCE.createErrorEvent(UIManagerHelper.getSurfaceId(this), this.getId(), throwable));
                }

                @Override // com.facebook.react.views.image.ReactImageDownloadListener, p487o4.InterfaceC42956c
                public void onFinalImageSet(String id2, InterfaceC46077k imageInfo, Animatable animatable) {
                    EventDispatcher eventDispatcher;
                    Intrinsics.checkNotNullParameter(id2, "id");
                    if (imageInfo == null || this.getImageSource() == null || (eventDispatcher = eventDispatcherForReactTag) == null) {
                        return;
                    }
                    ImageLoadEvent.Companion companion = ImageLoadEvent.INSTANCE;
                    int surfaceId = UIManagerHelper.getSurfaceId(this);
                    int id3 = this.getId();
                    ImageSource imageSource = this.getImageSource();
                    eventDispatcher.dispatchEvent(companion.createLoadEvent(surfaceId, id3, imageSource != null ? imageSource.getSource() : null, imageInfo.getWidth(), imageInfo.getHeight()));
                    eventDispatcherForReactTag.dispatchEvent(companion.createLoadEndEvent(UIManagerHelper.getSurfaceId(this), this.getId()));
                }

                @Override // com.facebook.react.views.image.ReactImageDownloadListener
                public void onProgressChange(int loaded, int total) {
                    if (eventDispatcherForReactTag == null || this.getImageSource() == null) {
                        return;
                    }
                    EventDispatcher eventDispatcher = eventDispatcherForReactTag;
                    ImageLoadEvent.Companion companion = ImageLoadEvent.INSTANCE;
                    int surfaceId = UIManagerHelper.getSurfaceId(this);
                    int id2 = this.getId();
                    ImageSource imageSource = this.getImageSource();
                    eventDispatcher.dispatchEvent(companion.createProgressEvent(surfaceId, id2, imageSource != null ? imageSource.getSource() : null, loaded, total));
                }

                @Override // com.facebook.react.views.image.ReactImageDownloadListener, p487o4.InterfaceC42956c
                public void onSubmit(String id2, Object callerContext) {
                    Intrinsics.checkNotNullParameter(id2, "id");
                    EventDispatcher eventDispatcher = eventDispatcherForReactTag;
                    if (eventDispatcher == null) {
                        return;
                    }
                    eventDispatcher.dispatchEvent(ImageLoadEvent.INSTANCE.createLoadStartEvent(UIManagerHelper.getSurfaceId(this), this.getId()));
                }
            };
        } else {
            this.downloadListener = null;
        }
        this.isDirty = true;
    }

    public final void setSource(@Nullable ReadableArray sources) {
        ArrayList arrayList = new ArrayList();
        if (sources == null || sources.size() == 0) {
            ImageSource.Companion companion = ImageSource.INSTANCE;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            arrayList.add(companion.getTransparentBitmapImageSource(context));
        } else {
            if (sources.size() == 1) {
                ReadableMap map = sources.getMap(0);
                if (map == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                ImageCacheControl imageCacheControlComputeCacheControl = computeCacheControl(map.getString(C33590cg.f69440j));
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                ImageSource imageSource = new ImageSource(context2, map.getString("uri"), 0.0d, 0.0d, imageCacheControlComputeCacheControl, 12, null);
                if (Intrinsics.areEqual(Uri.EMPTY, imageSource.getUri())) {
                    warnImageSource(map.getString("uri"));
                    ImageSource.Companion companion2 = ImageSource.INSTANCE;
                    Context context3 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                    imageSource = companion2.getTransparentBitmapImageSource(context3);
                }
                arrayList.add(imageSource);
            } else {
                int size = sources.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ReadableMap map2 = sources.getMap(i11);
                    if (map2 != null) {
                        ImageCacheControl imageCacheControlComputeCacheControl2 = computeCacheControl(map2.getString(C33590cg.f69440j));
                        Context context4 = getContext();
                        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                        ImageSource imageSource2 = new ImageSource(context4, map2.getString("uri"), map2.getDouble("width"), map2.getDouble("height"), imageCacheControlComputeCacheControl2);
                        if (Intrinsics.areEqual(Uri.EMPTY, imageSource2.getUri())) {
                            warnImageSource(map2.getString("uri"));
                            ImageSource.Companion companion3 = ImageSource.INSTANCE;
                            Context context5 = getContext();
                            Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                            imageSource2 = companion3.getTransparentBitmapImageSource(context5);
                        }
                        arrayList.add(imageSource2);
                    }
                }
            }
        }
        if (Intrinsics.areEqual(this.sources, arrayList)) {
            return;
        }
        this.sources.clear();
        this.sources.addAll(arrayList);
        this.isDirty = true;
    }

    public final void updateCallerContext(@Nullable Object callerContext) {
        if (Intrinsics.areEqual(this.callerContext, callerContext)) {
            return;
        }
        this.callerContext = callerContext;
        this.isDirty = true;
    }

    private final ResizeOptions getResizeOptions() {
        int iRound = Math.round(getWidth() * this.resizeMultiplier);
        int iRound2 = Math.round(getHeight() * this.resizeMultiplier);
        if (iRound > 0 && iRound2 > 0) {
            return new ResizeOptions(iRound, iRound2, 0.0f, 0.0f, 12, null);
        }
        return null;
    }

    @Override // android.view.View
    public void onSizeChanged(int w11, int h11, int oldw, int oldh) {
        boolean z11;
        super.onSizeChanged(w11, h11, oldw, oldh);
        if (w11 > 0 && h11 > 0) {
            if (!this.isDirty && !hasMultipleSources() && !isTiled()) {
                z11 = false;
            } else {
                z11 = true;
            }
            this.isDirty = z11;
            maybeUpdateView();
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int backgroundColor) {
        BackgroundStyleApplicator.setBackgroundColor(this, Integer.valueOf(backgroundColor));
    }

    public final void setResizeMethod(@NotNull ImageResizeMethod resizeMethod) {
        Intrinsics.checkNotNullParameter(resizeMethod, "resizeMethod");
        if (this.resizeMethod != resizeMethod) {
            this.resizeMethod = resizeMethod;
            this.isDirty = true;
        }
    }

    public final void setScaleType(@NotNull InterfaceC5597q scaleType) {
        Intrinsics.checkNotNullParameter(scaleType, "scaleType");
        if (this.scaleType != scaleType) {
            this.scaleType = scaleType;
            this.isDirty = true;
        }
    }

    public final void setTileMode(@NotNull Shader.TileMode tileMode) {
        TilePostprocessor tilePostprocessor;
        Intrinsics.checkNotNullParameter(tileMode, "tileMode");
        if (this.tileMode != tileMode) {
            this.tileMode = tileMode;
            if (isTiled()) {
                tilePostprocessor = new TilePostprocessor();
            } else {
                tilePostprocessor = null;
            }
            this.tilePostprocessor = tilePostprocessor;
            this.isDirty = true;
        }
    }

    public final void setBorderRadius(float borderRadius, int position) {
        BackgroundStyleApplicator.setBorderRadius(this, BorderRadiusProp.values()[position], Float.isNaN(borderRadius) ? null : new LengthPercentage(PixelUtil.INSTANCE.pxToDp(borderRadius), LengthPercentageType.POINT));
    }
}
