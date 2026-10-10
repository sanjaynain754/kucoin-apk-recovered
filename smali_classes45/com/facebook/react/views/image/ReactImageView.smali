.class public final Lcom/facebook/react/views/image/ReactImageView;
.super Lcom/facebook/drawee/view/GenericDraweeView;
.source "ReactImageView.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/views/image/ReactImageView$Companion;,
        Lcom/facebook/react/views/image/ReactImageView$TilePostprocessor;,
        Lcom/facebook/react/views/image/ReactImageView$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00ca\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010\u0007\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0010!\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u0000 \u0092\u00012\u00020\u0001:\u0004\u0093\u0001\u0092\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u00030\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000cH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0014H\u0002\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0016H\u0002\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001dH\u0002\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0019\u0010\"\u001a\u00020\u00162\u0008\u0010!\u001a\u0004\u0018\u00010\u000cH\u0002\u00a2\u0006\u0004\u0008\"\u0010#J\u0017\u0010$\u001a\u00020\u00162\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008$\u0010%J\u0015\u0010\'\u001a\u00020\u00162\u0006\u0010&\u001a\u00020\u0014\u00a2\u0006\u0004\u0008\'\u0010\u0018J\u0015\u0010*\u001a\u00020\u00162\u0006\u0010)\u001a\u00020(\u00a2\u0006\u0004\u0008*\u0010+J\u0017\u0010.\u001a\u00020\u00162\u0006\u0010-\u001a\u00020,H\u0016\u00a2\u0006\u0004\u0008.\u0010/J\u0015\u00101\u001a\u00020\u00162\u0006\u00100\u001a\u00020,\u00a2\u0006\u0004\u00081\u0010/J\u0015\u00103\u001a\u00020\u00162\u0006\u00102\u001a\u00020,\u00a2\u0006\u0004\u00083\u0010/J\u0015\u00105\u001a\u00020\u00162\u0006\u00104\u001a\u00020(\u00a2\u0006\u0004\u00085\u0010+J\u0015\u00107\u001a\u00020\u00162\u0006\u00106\u001a\u00020(\u00a2\u0006\u0004\u00087\u0010+J\u001d\u00107\u001a\u00020\u00162\u0006\u00106\u001a\u00020(2\u0006\u00108\u001a\u00020,\u00a2\u0006\u0004\u00087\u00109J\u0015\u0010<\u001a\u00020\u00162\u0006\u0010;\u001a\u00020:\u00a2\u0006\u0004\u0008<\u0010=J\u0015\u0010@\u001a\u00020\u00162\u0006\u0010?\u001a\u00020>\u00a2\u0006\u0004\u0008@\u0010AJ\u0015\u0010D\u001a\u00020\u00162\u0006\u0010C\u001a\u00020B\u00a2\u0006\u0004\u0008D\u0010EJ\u0015\u0010G\u001a\u00020\u00162\u0006\u0010F\u001a\u00020(\u00a2\u0006\u0004\u0008G\u0010+J\u0017\u0010J\u001a\u00020\u00162\u0008\u0010I\u001a\u0004\u0018\u00010H\u00a2\u0006\u0004\u0008J\u0010KJ\u0017\u0010M\u001a\u00020\u00162\u0008\u0010L\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0004\u0008M\u0010#J\u0017\u0010N\u001a\u00020\u00162\u0008\u0010L\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0004\u0008N\u0010#J\u0015\u0010P\u001a\u00020\u00162\u0006\u0010O\u001a\u00020\u0014\u00a2\u0006\u0004\u0008P\u0010\u0018J\u0015\u0010R\u001a\u00020\u00162\u0006\u0010Q\u001a\u00020,\u00a2\u0006\u0004\u0008R\u0010/J\u0017\u0010U\u001a\u00020\u00162\u0008\u0010T\u001a\u0004\u0018\u00010S\u00a2\u0006\u0004\u0008U\u0010VJ\u000f\u0010W\u001a\u00020\u0014H\u0016\u00a2\u0006\u0004\u0008W\u0010\u001aJ\u0017\u0010Z\u001a\u00020\u00162\u0006\u0010Y\u001a\u00020XH\u0016\u00a2\u0006\u0004\u0008Z\u0010[J\r\u0010\\\u001a\u00020\u0016\u00a2\u0006\u0004\u0008\\\u0010\u001cJ\u001f\u0010`\u001a\u00020\u00162\u000e\u0010_\u001a\n\u0012\u0004\u0012\u00020^\u0018\u00010]H\u0007\u00a2\u0006\u0004\u0008`\u0010aJ/\u0010f\u001a\u00020\u00162\u0006\u0010b\u001a\u00020,2\u0006\u0010c\u001a\u00020,2\u0006\u0010d\u001a\u00020,2\u0006\u0010e\u001a\u00020,H\u0014\u00a2\u0006\u0004\u0008f\u0010gR$\u0010\u0005\u001a\u0012\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u00030\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010hR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010iR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00088\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\t\u0010jR\u001a\u0010I\u001a\u0008\u0012\u0004\u0012\u00020\u001d0k8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008I\u0010lR$\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008\u001e\u0010m\u001a\u0004\u0008n\u0010o\"\u0004\u0008p\u0010qR\u0018\u0010r\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008r\u0010mR\u0018\u0010t\u001a\u0004\u0018\u00010s8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008t\u0010uR\u0018\u0010v\u001a\u0004\u0018\u00010s8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008v\u0010uR\u0016\u00102\u001a\u00020,8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00082\u0010wR\u0016\u0010;\u001a\u00020:8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008;\u0010xR\u0016\u0010?\u001a\u00020>8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008?\u0010yR\u0016\u0010z\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008z\u0010{R\u001c\u0010}\u001a\u0008\u0018\u00010|R\u00020\u00008\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008}\u0010~R\u001b\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u007f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u0080\u0001\u0010\u0081\u0001R\"\u0010\u0083\u0001\u001a\u000b\u0012\u0004\u0012\u00020^\u0018\u00010\u0082\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u0083\u0001\u0010\u0084\u0001R!\u0010\u0085\u0001\u001a\n\u0012\u0004\u0012\u00020^\u0018\u00010]8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u0085\u0001\u0010\u0086\u0001R\u0018\u0010\u0087\u0001\u001a\u00020,8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u0008\u0087\u0001\u0010wR\u0018\u0010\u0088\u0001\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u0008\u0088\u0001\u0010{R\u0019\u0010T\u001a\u0004\u0018\u00010S8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u0008T\u0010\u0089\u0001R\u0019\u0010\u008a\u0001\u001a\u00020(8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u008a\u0001\u0010\u008b\u0001R\u0017\u0010C\u001a\u00020B8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u0008C\u0010\u008c\u0001R\u0016\u0010\u008d\u0001\u001a\u00020\u00148BX\u0082\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u008d\u0001\u0010\u001aR\u001a\u0010\u0091\u0001\u001a\u0005\u0018\u00010\u008e\u00018BX\u0082\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u008f\u0001\u0010\u0090\u0001\u00a8\u0006\u0094\u0001"
    }
    d2 = {
        "Lcom/facebook/react/views/image/ReactImageView;",
        "Lcom/facebook/drawee/view/GenericDraweeView;",
        "Landroid/content/Context;",
        "context",
        "Lcom/facebook/drawee/controller/AbstractDraweeControllerBuilder;",
        "draweeControllerBuilder",
        "Lcom/facebook/react/views/image/GlobalImageLoadListener;",
        "globalImageLoadListener",
        "",
        "callerContext",
        "<init>",
        "(Landroid/content/Context;Lcom/facebook/drawee/controller/AbstractDraweeControllerBuilder;Lcom/facebook/react/views/image/GlobalImageLoadListener;Ljava/lang/Object;)V",
        "",
        "cacheControl",
        "Lcom/facebook/react/modules/fresco/ImageCacheControl;",
        "computeCacheControl",
        "(Ljava/lang/String;)Lcom/facebook/react/modules/fresco/ImageCacheControl;",
        "Lcom/facebook/imagepipeline/request/ImageRequest$RequestLevel;",
        "computeRequestLevel",
        "(Lcom/facebook/react/modules/fresco/ImageCacheControl;)Lcom/facebook/imagepipeline/request/ImageRequest$RequestLevel;",
        "",
        "doResize",
        "",
        "maybeUpdateViewFromRequest",
        "(Z)V",
        "hasMultipleSources",
        "()Z",
        "setSourceImage",
        "()V",
        "Lcom/facebook/react/views/imagehelper/ImageSource;",
        "imageSource",
        "shouldResize",
        "(Lcom/facebook/react/views/imagehelper/ImageSource;)Z",
        "uri",
        "warnImageSource",
        "(Ljava/lang/String;)V",
        "updateCallerContext",
        "(Ljava/lang/Object;)V",
        "shouldNotify",
        "setShouldNotifyLoadEvents",
        "",
        "blurRadius",
        "setBlurRadius",
        "(F)V",
        "",
        "backgroundColor",
        "setBackgroundColor",
        "(I)V",
        "borderColor",
        "setBorderColor",
        "overlayColor",
        "setOverlayColor",
        "borderWidth",
        "setBorderWidth",
        "borderRadius",
        "setBorderRadius",
        "position",
        "(FI)V",
        "Lcom/facebook/drawee/drawable/q;",
        "scaleType",
        "setScaleType",
        "(Lcom/facebook/drawee/drawable/q;)V",
        "Landroid/graphics/Shader$TileMode;",
        "tileMode",
        "setTileMode",
        "(Landroid/graphics/Shader$TileMode;)V",
        "Lcom/facebook/react/views/image/ImageResizeMethod;",
        "resizeMethod",
        "setResizeMethod",
        "(Lcom/facebook/react/views/image/ImageResizeMethod;)V",
        "multiplier",
        "setResizeMultiplier",
        "Lcom/facebook/react/bridge/ReadableArray;",
        "sources",
        "setSource",
        "(Lcom/facebook/react/bridge/ReadableArray;)V",
        "name",
        "setDefaultSource",
        "setLoadingIndicatorSource",
        "enabled",
        "setProgressiveRenderingEnabled",
        "durationMs",
        "setFadeDuration",
        "Lcom/facebook/react/bridge/ReadableMap;",
        "headers",
        "setHeaders",
        "(Lcom/facebook/react/bridge/ReadableMap;)V",
        "hasOverlappingRendering",
        "Landroid/graphics/Canvas;",
        "canvas",
        "onDraw",
        "(Landroid/graphics/Canvas;)V",
        "maybeUpdateView",
        "Lo4/c;",
        "Lx5/k;",
        "controllerListener",
        "setControllerListener",
        "(Lo4/c;)V",
        "w",
        "h",
        "oldw",
        "oldh",
        "onSizeChanged",
        "(IIII)V",
        "Lcom/facebook/drawee/controller/AbstractDraweeControllerBuilder;",
        "Lcom/facebook/react/views/image/GlobalImageLoadListener;",
        "Ljava/lang/Object;",
        "",
        "Ljava/util/List;",
        "Lcom/facebook/react/views/imagehelper/ImageSource;",
        "getImageSource$ReactAndroid_release",
        "()Lcom/facebook/react/views/imagehelper/ImageSource;",
        "setImageSource$ReactAndroid_release",
        "(Lcom/facebook/react/views/imagehelper/ImageSource;)V",
        "cachedImageSource",
        "Landroid/graphics/drawable/Drawable;",
        "defaultImageDrawable",
        "Landroid/graphics/drawable/Drawable;",
        "loadingImageDrawable",
        "I",
        "Lcom/facebook/drawee/drawable/q;",
        "Landroid/graphics/Shader$TileMode;",
        "isDirty",
        "Z",
        "Lcom/facebook/react/views/image/ReactImageView$TilePostprocessor;",
        "tilePostprocessor",
        "Lcom/facebook/react/views/image/ReactImageView$TilePostprocessor;",
        "Lc6/a;",
        "iterativeBoxBlurPostProcessor",
        "Lc6/a;",
        "Lcom/facebook/react/views/image/ReactImageDownloadListener;",
        "downloadListener",
        "Lcom/facebook/react/views/image/ReactImageDownloadListener;",
        "controllerForTesting",
        "Lo4/c;",
        "fadeDurationMs",
        "progressiveRenderingEnabled",
        "Lcom/facebook/react/bridge/ReadableMap;",
        "resizeMultiplier",
        "F",
        "Lcom/facebook/react/views/image/ImageResizeMethod;",
        "isTiled",
        "Lcom/facebook/imagepipeline/common/ResizeOptions;",
        "getResizeOptions",
        "()Lcom/facebook/imagepipeline/common/ResizeOptions;",
        "resizeOptions",
        "Companion",
        "TilePostprocessor",
        "ReactAndroid_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nReactImageView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactImageView.kt\ncom/facebook/react/views/image/ReactImageView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,629:1\n1#2:630\n*E\n"
    }
.end annotation


# static fields
.field public static final Companion:Lcom/facebook/react/views/image/ReactImageView$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final REMOTE_IMAGE_FADE_DURATION_MS:I = 0x12c

.field private static final tileMatrix:Landroid/graphics/Matrix;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field private cachedImageSource:Lcom/facebook/react/views/imagehelper/ImageSource;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private callerContext:Ljava/lang/Object;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private controllerForTesting:Lo4/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo4/c<",
            "Lx5/k;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private defaultImageDrawable:Landroid/graphics/drawable/Drawable;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private downloadListener:Lcom/facebook/react/views/image/ReactImageDownloadListener;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/react/views/image/ReactImageDownloadListener<",
            "Lx5/k;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final draweeControllerBuilder:Lcom/facebook/drawee/controller/AbstractDraweeControllerBuilder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/drawee/controller/AbstractDraweeControllerBuilder<",
            "****>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private fadeDurationMs:I

.field private final globalImageLoadListener:Lcom/facebook/react/views/image/GlobalImageLoadListener;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private headers:Lcom/facebook/react/bridge/ReadableMap;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private imageSource:Lcom/facebook/react/views/imagehelper/ImageSource;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private isDirty:Z

.field private iterativeBoxBlurPostProcessor:Lc6/a;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private loadingImageDrawable:Landroid/graphics/drawable/Drawable;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private overlayColor:I

.field private progressiveRenderingEnabled:Z

.field private resizeMethod:Lcom/facebook/react/views/image/ImageResizeMethod;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private resizeMultiplier:F

.field private scaleType:Lcom/facebook/drawee/drawable/q;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final sources:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/facebook/react/views/imagehelper/ImageSource;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private tileMode:Landroid/graphics/Shader$TileMode;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private tilePostprocessor:Lcom/facebook/react/views/image/ReactImageView$TilePostprocessor;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/react/views/image/ReactImageView$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/facebook/react/views/image/ReactImageView$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/facebook/react/views/image/ReactImageView;->Companion:Lcom/facebook/react/views/image/ReactImageView$Companion;

    .line 9
    .line 10
    new-instance v0, Landroid/graphics/Matrix;

    .line 11
    .line 12
    .line 13
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 14
    .line 15
    sput-object v0, Lcom/facebook/react/views/image/ReactImageView;->tileMatrix:Landroid/graphics/Matrix;

    .line 16
    return-void
    .line 17
    .line 18
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/facebook/drawee/controller/AbstractDraweeControllerBuilder;Lcom/facebook/react/views/image/GlobalImageLoadListener;Ljava/lang/Object;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/facebook/drawee/controller/AbstractDraweeControllerBuilder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/facebook/react/views/image/GlobalImageLoadListener;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/facebook/drawee/controller/AbstractDraweeControllerBuilder<",
            "****>;",
            "Lcom/facebook/react/views/image/GlobalImageLoadListener;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "context"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "draweeControllerBuilder"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    sget-object v0, Lcom/facebook/react/views/image/ReactImageView;->Companion:Lcom/facebook/react/views/image/ReactImageView$Companion;

    .line 13
    .line 14
    .line 15
    invoke-static {v0, p1}, Lcom/facebook/react/views/image/ReactImageView$Companion;->access$buildHierarchy(Lcom/facebook/react/views/image/ReactImageView$Companion;Landroid/content/Context;)Lr4/a;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    .line 19
    invoke-direct {p0, p1, v0}, Lcom/facebook/drawee/view/GenericDraweeView;-><init>(Landroid/content/Context;Lr4/a;)V

    .line 20
    .line 21
    iput-object p2, p0, Lcom/facebook/react/views/image/ReactImageView;->draweeControllerBuilder:Lcom/facebook/drawee/controller/AbstractDraweeControllerBuilder;

    .line 22
    .line 23
    iput-object p3, p0, Lcom/facebook/react/views/image/ReactImageView;->globalImageLoadListener:Lcom/facebook/react/views/image/GlobalImageLoadListener;

    .line 24
    .line 25
    iput-object p4, p0, Lcom/facebook/react/views/image/ReactImageView;->callerContext:Ljava/lang/Object;

    .line 26
    .line 27
    new-instance p1, Ljava/util/ArrayList;

    .line 28
    .line 29
    .line 30
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 31
    .line 32
    iput-object p1, p0, Lcom/facebook/react/views/image/ReactImageView;->sources:Ljava/util/List;

    .line 33
    .line 34
    .line 35
    invoke-static {}, Lcom/facebook/react/views/image/ImageResizeMode;->defaultValue()Lcom/facebook/drawee/drawable/q;

    .line 36
    move-result-object p1

    .line 37
    .line 38
    iput-object p1, p0, Lcom/facebook/react/views/image/ReactImageView;->scaleType:Lcom/facebook/drawee/drawable/q;

    .line 39
    .line 40
    .line 41
    invoke-static {}, Lcom/facebook/react/views/image/ImageResizeMode;->defaultTileMode()Landroid/graphics/Shader$TileMode;

    .line 42
    move-result-object p1

    .line 43
    .line 44
    iput-object p1, p0, Lcom/facebook/react/views/image/ReactImageView;->tileMode:Landroid/graphics/Shader$TileMode;

    .line 45
    const/4 p1, -0x1

    .line 46
    .line 47
    iput p1, p0, Lcom/facebook/react/views/image/ReactImageView;->fadeDurationMs:I

    .line 48
    .line 49
    const/high16 p1, 0x3f800000    # 1.0f

    .line 50
    .line 51
    iput p1, p0, Lcom/facebook/react/views/image/ReactImageView;->resizeMultiplier:F

    .line 52
    .line 53
    sget-object p1, Lcom/facebook/react/views/image/ImageResizeMethod;->AUTO:Lcom/facebook/react/views/image/ImageResizeMethod;

    .line 54
    .line 55
    iput-object p1, p0, Lcom/facebook/react/views/image/ReactImageView;->resizeMethod:Lcom/facebook/react/views/image/ImageResizeMethod;

    .line 56
    const/4 p1, 0x1

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0, p1}, Lcom/facebook/drawee/view/DraweeView;->setLegacyVisibilityHandlingEnabled(Z)V

    .line 60
    return-void
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
.end method

.method public static final synthetic access$getScaleType$p(Lcom/facebook/react/views/image/ReactImageView;)Lcom/facebook/drawee/drawable/q;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/facebook/react/views/image/ReactImageView;->scaleType:Lcom/facebook/drawee/drawable/q;

    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public static final synthetic access$getTileMatrix$cp()Landroid/graphics/Matrix;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/facebook/react/views/image/ReactImageView;->tileMatrix:Landroid/graphics/Matrix;

    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public static final synthetic access$getTileMode$p(Lcom/facebook/react/views/image/ReactImageView;)Landroid/graphics/Shader$TileMode;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/facebook/react/views/image/ReactImageView;->tileMode:Landroid/graphics/Shader$TileMode;

    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method private final computeCacheControl(Ljava/lang/String;)Lcom/facebook/react/modules/fresco/ImageCacheControl;
    .locals 1

    .line 1
    .line 2
    if-eqz p1, :cond_3

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 6
    move-result v0

    .line 7
    .line 8
    .line 9
    sparse-switch v0, :sswitch_data_0

    .line 10
    goto :goto_0

    .line 11
    .line 12
    :sswitch_0
    const-string v0, "default"

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 16
    move-result p1

    .line 17
    .line 18
    if-nez p1, :cond_3

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :sswitch_1
    const-string v0, "only-if-cached"

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 25
    move-result p1

    .line 26
    .line 27
    if-nez p1, :cond_0

    .line 28
    goto :goto_0

    .line 29
    .line 30
    :cond_0
    sget-object p1, Lcom/facebook/react/modules/fresco/ImageCacheControl;->ONLY_IF_CACHED:Lcom/facebook/react/modules/fresco/ImageCacheControl;

    .line 31
    return-object p1

    .line 32
    .line 33
    .line 34
    :sswitch_2
    const-string/jumbo v0, "reload"

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 38
    move-result p1

    .line 39
    .line 40
    if-nez p1, :cond_1

    .line 41
    goto :goto_0

    .line 42
    .line 43
    :cond_1
    sget-object p1, Lcom/facebook/react/modules/fresco/ImageCacheControl;->RELOAD:Lcom/facebook/react/modules/fresco/ImageCacheControl;

    .line 44
    return-object p1

    .line 45
    .line 46
    :sswitch_3
    const-string v0, "force-cache"

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 50
    move-result p1

    .line 51
    .line 52
    if-nez p1, :cond_2

    .line 53
    .line 54
    :goto_0
    sget-object p1, Lcom/facebook/react/modules/fresco/ImageCacheControl;->DEFAULT:Lcom/facebook/react/modules/fresco/ImageCacheControl;

    .line 55
    return-object p1

    .line 56
    .line 57
    :cond_2
    sget-object p1, Lcom/facebook/react/modules/fresco/ImageCacheControl;->FORCE_CACHE:Lcom/facebook/react/modules/fresco/ImageCacheControl;

    .line 58
    return-object p1

    .line 59
    .line 60
    :cond_3
    sget-object p1, Lcom/facebook/react/modules/fresco/ImageCacheControl;->DEFAULT:Lcom/facebook/react/modules/fresco/ImageCacheControl;

    .line 61
    return-object p1

    .line 62
    nop

    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    :sswitch_data_0
    .sparse-switch
        -0x5d3acde0 -> :sswitch_3
        -0x37b57e67 -> :sswitch_2
        0x2a216ef1 -> :sswitch_1
        0x5c13d641 -> :sswitch_0
    .end sparse-switch
.end method

.method private final computeRequestLevel(Lcom/facebook/react/modules/fresco/ImageCacheControl;)Lcom/facebook/imagepipeline/request/ImageRequest$RequestLevel;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/facebook/react/views/image/ReactImageView$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 6
    move-result p1

    .line 7
    .line 8
    aget p1, v0, p1

    .line 9
    const/4 v0, 0x1

    .line 10
    .line 11
    if-ne p1, v0, :cond_0

    .line 12
    .line 13
    sget-object p1, Lcom/facebook/imagepipeline/request/ImageRequest$RequestLevel;->DISK_CACHE:Lcom/facebook/imagepipeline/request/ImageRequest$RequestLevel;

    .line 14
    return-object p1

    .line 15
    .line 16
    :cond_0
    sget-object p1, Lcom/facebook/imagepipeline/request/ImageRequest$RequestLevel;->FULL_FETCH:Lcom/facebook/imagepipeline/request/ImageRequest$RequestLevel;

    .line 17
    return-object p1
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method private final getResizeOptions()Lcom/facebook/imagepipeline/common/ResizeOptions;
    .locals 8

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 4
    move-result v0

    .line 5
    int-to-float v0, v0

    .line 6
    .line 7
    iget v1, p0, Lcom/facebook/react/views/image/ReactImageView;->resizeMultiplier:F

    .line 8
    mul-float/2addr v0, v1

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 12
    move-result v2

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 16
    move-result v0

    .line 17
    int-to-float v0, v0

    .line 18
    .line 19
    iget v1, p0, Lcom/facebook/react/views/image/ReactImageView;->resizeMultiplier:F

    .line 20
    mul-float/2addr v0, v1

    .line 21
    .line 22
    .line 23
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 24
    move-result v3

    .line 25
    .line 26
    if-lez v2, :cond_1

    .line 27
    .line 28
    if-gtz v3, :cond_0

    .line 29
    goto :goto_0

    .line 30
    .line 31
    :cond_0
    new-instance v1, Lcom/facebook/imagepipeline/common/ResizeOptions;

    .line 32
    .line 33
    const/16 v6, 0xc

    .line 34
    const/4 v7, 0x0

    .line 35
    const/4 v4, 0x0

    .line 36
    const/4 v5, 0x0

    .line 37
    .line 38
    .line 39
    invoke-direct/range {v1 .. v7}, Lcom/facebook/imagepipeline/common/ResizeOptions;-><init>(IIFFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 40
    return-object v1

    .line 41
    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 42
    return-object v0
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
.end method

.method private final hasMultipleSources()Z
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/react/views/image/ReactImageView;->sources:Ljava/util/List;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    .line 9
    if-le v0, v1, :cond_0

    .line 10
    return v1

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method private final isTiled()Z
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/react/views/image/ReactImageView;->tileMode:Landroid/graphics/Shader$TileMode;

    .line 3
    .line 4
    sget-object v1, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    .line 5
    .line 6
    if-eq v0, v1, :cond_0

    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method private final maybeUpdateViewFromRequest(Z)V
    .locals 8

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/react/views/image/ReactImageView;->imageSource:Lcom/facebook/react/views/imagehelper/ImageSource;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    return-void

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-virtual {v0}, Lcom/facebook/react/views/imagehelper/ImageSource;->getUri()Landroid/net/Uri;

    .line 9
    move-result-object v1

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/facebook/react/views/imagehelper/ImageSource;->getCacheControl()Lcom/facebook/react/modules/fresco/ImageCacheControl;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    .line 16
    invoke-direct {p0, v0}, Lcom/facebook/react/views/image/ReactImageView;->computeRequestLevel(Lcom/facebook/react/modules/fresco/ImageCacheControl;)Lcom/facebook/imagepipeline/request/ImageRequest$RequestLevel;

    .line 17
    move-result-object v2

    .line 18
    .line 19
    new-instance v3, Ljava/util/ArrayList;

    .line 20
    .line 21
    .line 22
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 23
    .line 24
    iget-object v4, p0, Lcom/facebook/react/views/image/ReactImageView;->iterativeBoxBlurPostProcessor:Lc6/a;

    .line 25
    .line 26
    if-eqz v4, :cond_1

    .line 27
    .line 28
    .line 29
    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 30
    .line 31
    :cond_1
    iget-object v4, p0, Lcom/facebook/react/views/image/ReactImageView;->tilePostprocessor:Lcom/facebook/react/views/image/ReactImageView$TilePostprocessor;

    .line 32
    .line 33
    if-eqz v4, :cond_2

    .line 34
    .line 35
    .line 36
    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 37
    .line 38
    :cond_2
    sget-object v4, Lcom/facebook/react/views/image/MultiPostprocessor;->Companion:Lcom/facebook/react/views/image/MultiPostprocessor$Companion;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v4, v3}, Lcom/facebook/react/views/image/MultiPostprocessor$Companion;->from(Ljava/util/List;)Lcom/facebook/imagepipeline/request/b;

    .line 42
    move-result-object v3

    .line 43
    .line 44
    if-eqz p1, :cond_3

    .line 45
    .line 46
    .line 47
    invoke-direct {p0}, Lcom/facebook/react/views/image/ReactImageView;->getResizeOptions()Lcom/facebook/imagepipeline/common/ResizeOptions;

    .line 48
    move-result-object p1

    .line 49
    goto :goto_0

    .line 50
    :cond_3
    const/4 p1, 0x0

    .line 51
    .line 52
    :goto_0
    sget-object v4, Lcom/facebook/react/modules/fresco/ImageCacheControl;->RELOAD:Lcom/facebook/react/modules/fresco/ImageCacheControl;

    .line 53
    .line 54
    if-ne v0, v4, :cond_4

    .line 55
    .line 56
    .line 57
    invoke-static {}, Lk4/d;->a()Lcom/facebook/imagepipeline/core/ImagePipeline;

    .line 58
    move-result-object v4

    .line 59
    .line 60
    .line 61
    invoke-virtual {v4, v1}, Lcom/facebook/imagepipeline/core/ImagePipeline;->g(Landroid/net/Uri;)V

    .line 62
    .line 63
    .line 64
    :cond_4
    invoke-static {v1}, Lcom/facebook/imagepipeline/request/ImageRequestBuilder;->x(Landroid/net/Uri;)Lcom/facebook/imagepipeline/request/ImageRequestBuilder;

    .line 65
    move-result-object v4

    .line 66
    .line 67
    .line 68
    invoke-virtual {v4, v3}, Lcom/facebook/imagepipeline/request/ImageRequestBuilder;->J(Lcom/facebook/imagepipeline/request/b;)Lcom/facebook/imagepipeline/request/ImageRequestBuilder;

    .line 69
    move-result-object v4

    .line 70
    .line 71
    .line 72
    invoke-virtual {v4, p1}, Lcom/facebook/imagepipeline/request/ImageRequestBuilder;->N(Lcom/facebook/imagepipeline/common/ResizeOptions;)Lcom/facebook/imagepipeline/request/ImageRequestBuilder;

    .line 73
    move-result-object v4

    .line 74
    const/4 v5, 0x1

    .line 75
    .line 76
    .line 77
    invoke-virtual {v4, v5}, Lcom/facebook/imagepipeline/request/ImageRequestBuilder;->y(Z)Lcom/facebook/imagepipeline/request/ImageRequestBuilder;

    .line 78
    move-result-object v4

    .line 79
    .line 80
    iget-boolean v6, p0, Lcom/facebook/react/views/image/ReactImageView;->progressiveRenderingEnabled:Z

    .line 81
    .line 82
    .line 83
    invoke-virtual {v4, v6}, Lcom/facebook/imagepipeline/request/ImageRequestBuilder;->K(Z)Lcom/facebook/imagepipeline/request/ImageRequestBuilder;

    .line 84
    move-result-object v4

    .line 85
    .line 86
    .line 87
    invoke-virtual {v4, v2}, Lcom/facebook/imagepipeline/request/ImageRequestBuilder;->I(Lcom/facebook/imagepipeline/request/ImageRequest$RequestLevel;)Lcom/facebook/imagepipeline/request/ImageRequestBuilder;

    .line 88
    move-result-object v2

    .line 89
    .line 90
    iget-object v4, p0, Lcom/facebook/react/views/image/ReactImageView;->resizeMethod:Lcom/facebook/react/views/image/ImageResizeMethod;

    .line 91
    .line 92
    sget-object v6, Lcom/facebook/react/views/image/ImageResizeMethod;->NONE:Lcom/facebook/react/views/image/ImageResizeMethod;

    .line 93
    .line 94
    if-ne v4, v6, :cond_5

    .line 95
    .line 96
    sget-object v4, Lcom/facebook/imagepipeline/core/DownsampleMode;->NEVER:Lcom/facebook/imagepipeline/core/DownsampleMode;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v2, v4}, Lcom/facebook/imagepipeline/request/ImageRequestBuilder;->E(Lcom/facebook/imagepipeline/core/DownsampleMode;)Lcom/facebook/imagepipeline/request/ImageRequestBuilder;

    .line 100
    .line 101
    :cond_5
    sget-object v4, Lcom/facebook/react/modules/fresco/ReactNetworkImageRequest;->Companion:Lcom/facebook/react/modules/fresco/ReactNetworkImageRequest$Companion;

    .line 102
    .line 103
    .line 104
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 105
    .line 106
    iget-object v7, p0, Lcom/facebook/react/views/image/ReactImageView;->headers:Lcom/facebook/react/bridge/ReadableMap;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v4, v2, v7, v0}, Lcom/facebook/react/modules/fresco/ReactNetworkImageRequest$Companion;->fromBuilderWithHeaders(Lcom/facebook/imagepipeline/request/ImageRequestBuilder;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/modules/fresco/ImageCacheControl;)Lcom/facebook/react/modules/fresco/ReactNetworkImageRequest;

    .line 110
    move-result-object v0

    .line 111
    .line 112
    iget-object v2, p0, Lcom/facebook/react/views/image/ReactImageView;->globalImageLoadListener:Lcom/facebook/react/views/image/GlobalImageLoadListener;

    .line 113
    .line 114
    if-eqz v2, :cond_6

    .line 115
    .line 116
    .line 117
    invoke-interface {v2, v1}, Lcom/facebook/react/views/image/GlobalImageLoadListener;->onLoadAttempt(Landroid/net/Uri;)V

    .line 118
    .line 119
    :cond_6
    iget-object v1, p0, Lcom/facebook/react/views/image/ReactImageView;->draweeControllerBuilder:Lcom/facebook/drawee/controller/AbstractDraweeControllerBuilder;

    .line 120
    .line 121
    const-string v2, "null cannot be cast to non-null type com.facebook.drawee.controller.AbstractDraweeControllerBuilder<*, com.facebook.imagepipeline.request.ImageRequest, com.facebook.common.references.CloseableReference<com.facebook.imagepipeline.image.CloseableImage>, com.facebook.imagepipeline.image.ImageInfo>"

    .line 122
    .line 123
    .line 124
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v1}, Lcom/facebook/drawee/controller/AbstractDraweeControllerBuilder;->z()Lcom/facebook/drawee/controller/AbstractDraweeControllerBuilder;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v1, v0}, Lcom/facebook/drawee/controller/AbstractDraweeControllerBuilder;->D(Ljava/lang/Object;)Lcom/facebook/drawee/controller/AbstractDraweeControllerBuilder;

    .line 131
    move-result-object v0

    .line 132
    .line 133
    .line 134
    invoke-virtual {v0, v5}, Lcom/facebook/drawee/controller/AbstractDraweeControllerBuilder;->A(Z)Lcom/facebook/drawee/controller/AbstractDraweeControllerBuilder;

    .line 135
    move-result-object v0

    .line 136
    .line 137
    .line 138
    invoke-virtual {p0}, Lcom/facebook/drawee/view/DraweeView;->getController()Lt4/a;

    .line 139
    move-result-object v2

    .line 140
    .line 141
    .line 142
    invoke-virtual {v0, v2}, Lcom/facebook/drawee/controller/AbstractDraweeControllerBuilder;->F(Lt4/a;)Lcom/facebook/drawee/controller/AbstractDraweeControllerBuilder;

    .line 143
    .line 144
    iget-object v0, p0, Lcom/facebook/react/views/image/ReactImageView;->callerContext:Ljava/lang/Object;

    .line 145
    .line 146
    if-eqz v0, :cond_7

    .line 147
    .line 148
    .line 149
    invoke-virtual {v1, v0}, Lcom/facebook/drawee/controller/AbstractDraweeControllerBuilder;->B(Ljava/lang/Object;)Lcom/facebook/drawee/controller/AbstractDraweeControllerBuilder;

    .line 150
    move-result-object v0

    .line 151
    .line 152
    .line 153
    const-string/jumbo v2, "setCallerContext(...)"

    .line 154
    .line 155
    .line 156
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 157
    .line 158
    :cond_7
    iget-object v0, p0, Lcom/facebook/react/views/image/ReactImageView;->cachedImageSource:Lcom/facebook/react/views/imagehelper/ImageSource;

    .line 159
    .line 160
    if-eqz v0, :cond_9

    .line 161
    .line 162
    .line 163
    invoke-virtual {v0}, Lcom/facebook/react/views/imagehelper/ImageSource;->getUri()Landroid/net/Uri;

    .line 164
    move-result-object v0

    .line 165
    .line 166
    .line 167
    invoke-static {v0}, Lcom/facebook/imagepipeline/request/ImageRequestBuilder;->x(Landroid/net/Uri;)Lcom/facebook/imagepipeline/request/ImageRequestBuilder;

    .line 168
    move-result-object v0

    .line 169
    .line 170
    .line 171
    invoke-virtual {v0, v3}, Lcom/facebook/imagepipeline/request/ImageRequestBuilder;->J(Lcom/facebook/imagepipeline/request/b;)Lcom/facebook/imagepipeline/request/ImageRequestBuilder;

    .line 172
    move-result-object v0

    .line 173
    .line 174
    .line 175
    invoke-virtual {v0, p1}, Lcom/facebook/imagepipeline/request/ImageRequestBuilder;->N(Lcom/facebook/imagepipeline/common/ResizeOptions;)Lcom/facebook/imagepipeline/request/ImageRequestBuilder;

    .line 176
    move-result-object p1

    .line 177
    .line 178
    .line 179
    invoke-virtual {p1, v5}, Lcom/facebook/imagepipeline/request/ImageRequestBuilder;->y(Z)Lcom/facebook/imagepipeline/request/ImageRequestBuilder;

    .line 180
    move-result-object p1

    .line 181
    .line 182
    iget-boolean v0, p0, Lcom/facebook/react/views/image/ReactImageView;->progressiveRenderingEnabled:Z

    .line 183
    .line 184
    .line 185
    invoke-virtual {p1, v0}, Lcom/facebook/imagepipeline/request/ImageRequestBuilder;->K(Z)Lcom/facebook/imagepipeline/request/ImageRequestBuilder;

    .line 186
    move-result-object p1

    .line 187
    .line 188
    iget-object v0, p0, Lcom/facebook/react/views/image/ReactImageView;->resizeMethod:Lcom/facebook/react/views/image/ImageResizeMethod;

    .line 189
    .line 190
    if-ne v0, v6, :cond_8

    .line 191
    .line 192
    sget-object v0, Lcom/facebook/imagepipeline/core/DownsampleMode;->NEVER:Lcom/facebook/imagepipeline/core/DownsampleMode;

    .line 193
    .line 194
    .line 195
    invoke-virtual {p1, v0}, Lcom/facebook/imagepipeline/request/ImageRequestBuilder;->E(Lcom/facebook/imagepipeline/core/DownsampleMode;)Lcom/facebook/imagepipeline/request/ImageRequestBuilder;

    .line 196
    .line 197
    .line 198
    :cond_8
    invoke-virtual {p1}, Lcom/facebook/imagepipeline/request/ImageRequestBuilder;->a()Lcom/facebook/imagepipeline/request/ImageRequest;

    .line 199
    move-result-object p1

    .line 200
    .line 201
    .line 202
    invoke-virtual {v1, p1}, Lcom/facebook/drawee/controller/AbstractDraweeControllerBuilder;->E(Ljava/lang/Object;)Lcom/facebook/drawee/controller/AbstractDraweeControllerBuilder;

    .line 203
    move-result-object p1

    .line 204
    .line 205
    .line 206
    const-string/jumbo v0, "setLowResImageRequest(...)"

    .line 207
    .line 208
    .line 209
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 210
    .line 211
    :cond_9
    iget-object p1, p0, Lcom/facebook/react/views/image/ReactImageView;->downloadListener:Lcom/facebook/react/views/image/ReactImageDownloadListener;

    .line 212
    .line 213
    if-eqz p1, :cond_a

    .line 214
    .line 215
    iget-object v0, p0, Lcom/facebook/react/views/image/ReactImageView;->controllerForTesting:Lo4/c;

    .line 216
    .line 217
    if-eqz v0, :cond_a

    .line 218
    .line 219
    new-instance p1, Lo4/e;

    .line 220
    .line 221
    .line 222
    invoke-direct {p1}, Lo4/e;-><init>()V

    .line 223
    .line 224
    iget-object v0, p0, Lcom/facebook/react/views/image/ReactImageView;->downloadListener:Lcom/facebook/react/views/image/ReactImageDownloadListener;

    .line 225
    .line 226
    .line 227
    invoke-virtual {p1, v0}, Lo4/e;->a(Lo4/c;)V

    .line 228
    .line 229
    iget-object v0, p0, Lcom/facebook/react/views/image/ReactImageView;->controllerForTesting:Lo4/c;

    .line 230
    .line 231
    .line 232
    invoke-virtual {p1, v0}, Lo4/e;->a(Lo4/c;)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {v1, p1}, Lcom/facebook/drawee/controller/AbstractDraweeControllerBuilder;->C(Lo4/c;)Lcom/facebook/drawee/controller/AbstractDraweeControllerBuilder;

    .line 236
    goto :goto_1

    .line 237
    .line 238
    :cond_a
    iget-object v0, p0, Lcom/facebook/react/views/image/ReactImageView;->controllerForTesting:Lo4/c;

    .line 239
    .line 240
    if-eqz v0, :cond_b

    .line 241
    .line 242
    .line 243
    invoke-virtual {v1, v0}, Lcom/facebook/drawee/controller/AbstractDraweeControllerBuilder;->C(Lo4/c;)Lcom/facebook/drawee/controller/AbstractDraweeControllerBuilder;

    .line 244
    goto :goto_1

    .line 245
    .line 246
    :cond_b
    if-eqz p1, :cond_c

    .line 247
    .line 248
    .line 249
    invoke-virtual {v1, p1}, Lcom/facebook/drawee/controller/AbstractDraweeControllerBuilder;->C(Lo4/c;)Lcom/facebook/drawee/controller/AbstractDraweeControllerBuilder;

    .line 250
    .line 251
    :cond_c
    :goto_1
    iget-object p1, p0, Lcom/facebook/react/views/image/ReactImageView;->downloadListener:Lcom/facebook/react/views/image/ReactImageDownloadListener;

    .line 252
    .line 253
    if-eqz p1, :cond_d

    .line 254
    .line 255
    .line 256
    invoke-virtual {p0}, Lcom/facebook/drawee/view/DraweeView;->getHierarchy()Lt4/b;

    .line 257
    move-result-object p1

    .line 258
    .line 259
    check-cast p1, Lr4/a;

    .line 260
    .line 261
    iget-object v0, p0, Lcom/facebook/react/views/image/ReactImageView;->downloadListener:Lcom/facebook/react/views/image/ReactImageDownloadListener;

    .line 262
    .line 263
    .line 264
    invoke-virtual {p1, v0}, Lr4/a;->y(Landroid/graphics/drawable/Drawable;)V

    .line 265
    .line 266
    .line 267
    :cond_d
    invoke-virtual {v1}, Lcom/facebook/drawee/controller/AbstractDraweeControllerBuilder;->c()Lo4/a;

    .line 268
    move-result-object p1

    .line 269
    .line 270
    .line 271
    invoke-virtual {p0, p1}, Lcom/facebook/drawee/view/DraweeView;->setController(Lt4/a;)V

    .line 272
    .line 273
    .line 274
    invoke-virtual {v1}, Lcom/facebook/drawee/controller/AbstractDraweeControllerBuilder;->z()Lcom/facebook/drawee/controller/AbstractDraweeControllerBuilder;

    .line 275
    return-void
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
.end method

.method private final setSourceImage()V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    iput-object v0, p0, Lcom/facebook/react/views/image/ReactImageView;->imageSource:Lcom/facebook/react/views/imagehelper/ImageSource;

    .line 4
    .line 5
    iget-object v0, p0, Lcom/facebook/react/views/image/ReactImageView;->sources:Ljava/util/List;

    .line 6
    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 9
    move-result v0

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lcom/facebook/react/views/image/ReactImageView;->sources:Ljava/util/List;

    .line 14
    .line 15
    sget-object v1, Lcom/facebook/react/views/imagehelper/ImageSource;->Companion:Lcom/facebook/react/views/imagehelper/ImageSource$Companion;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 19
    move-result-object v2

    .line 20
    .line 21
    const-string v3, "getContext(...)"

    .line 22
    .line 23
    .line 24
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, v2}, Lcom/facebook/react/views/imagehelper/ImageSource$Companion;->getTransparentBitmapImageSource(Landroid/content/Context;)Lcom/facebook/react/views/imagehelper/ImageSource;

    .line 28
    move-result-object v1

    .line 29
    .line 30
    .line 31
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 32
    goto :goto_0

    .line 33
    .line 34
    .line 35
    :cond_0
    invoke-direct {p0}, Lcom/facebook/react/views/image/ReactImageView;->hasMultipleSources()Z

    .line 36
    move-result v0

    .line 37
    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 42
    move-result v0

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 46
    move-result v1

    .line 47
    .line 48
    iget-object v2, p0, Lcom/facebook/react/views/image/ReactImageView;->sources:Ljava/util/List;

    .line 49
    .line 50
    .line 51
    invoke-static {v0, v1, v2}, Lcom/facebook/react/views/imagehelper/MultiSourceHelper;->getBestSourceForSize(IILjava/util/List;)Lcom/facebook/react/views/imagehelper/MultiSourceHelper$MultiSourceResult;

    .line 52
    move-result-object v0

    .line 53
    .line 54
    iget-object v1, v0, Lcom/facebook/react/views/imagehelper/MultiSourceHelper$MultiSourceResult;->bestResult:Lcom/facebook/react/views/imagehelper/ImageSource;

    .line 55
    .line 56
    iput-object v1, p0, Lcom/facebook/react/views/image/ReactImageView;->imageSource:Lcom/facebook/react/views/imagehelper/ImageSource;

    .line 57
    .line 58
    iget-object v0, v0, Lcom/facebook/react/views/imagehelper/MultiSourceHelper$MultiSourceResult;->bestResultInCache:Lcom/facebook/react/views/imagehelper/ImageSource;

    .line 59
    .line 60
    iput-object v0, p0, Lcom/facebook/react/views/image/ReactImageView;->cachedImageSource:Lcom/facebook/react/views/imagehelper/ImageSource;

    .line 61
    return-void

    .line 62
    .line 63
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/facebook/react/views/image/ReactImageView;->sources:Ljava/util/List;

    .line 64
    const/4 v1, 0x0

    .line 65
    .line 66
    .line 67
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 68
    move-result-object v0

    .line 69
    .line 70
    check-cast v0, Lcom/facebook/react/views/imagehelper/ImageSource;

    .line 71
    .line 72
    iput-object v0, p0, Lcom/facebook/react/views/image/ReactImageView;->imageSource:Lcom/facebook/react/views/imagehelper/ImageSource;

    .line 73
    return-void
    .line 74
    .line 75
.end method

.method private final shouldResize(Lcom/facebook/react/views/imagehelper/ImageSource;)Z
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/react/views/image/ReactImageView;->resizeMethod:Lcom/facebook/react/views/image/ImageResizeMethod;

    .line 3
    .line 4
    sget-object v1, Lcom/facebook/react/views/image/ReactImageView$WhenMappings;->$EnumSwitchMapping$1:[I

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 8
    move-result v0

    .line 9
    .line 10
    aget v0, v1, v0

    .line 11
    const/4 v1, 0x0

    .line 12
    const/4 v2, 0x1

    .line 13
    .line 14
    if-eq v0, v2, :cond_1

    .line 15
    const/4 p1, 0x2

    .line 16
    .line 17
    if-eq v0, p1, :cond_0

    .line 18
    return v1

    .line 19
    :cond_0
    return v2

    .line 20
    .line 21
    .line 22
    :cond_1
    invoke-virtual {p1}, Lcom/facebook/react/views/imagehelper/ImageSource;->getUri()Landroid/net/Uri;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    .line 26
    invoke-static {v0}, Ld4/d;->m(Landroid/net/Uri;)Z

    .line 27
    move-result v0

    .line 28
    .line 29
    if-nez v0, :cond_3

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Lcom/facebook/react/views/imagehelper/ImageSource;->getUri()Landroid/net/Uri;

    .line 33
    move-result-object p1

    .line 34
    .line 35
    .line 36
    invoke-static {p1}, Ld4/d;->n(Landroid/net/Uri;)Z

    .line 37
    move-result p1

    .line 38
    .line 39
    if-eqz p1, :cond_2

    .line 40
    goto :goto_0

    .line 41
    :cond_2
    return v1

    .line 42
    :cond_3
    :goto_0
    return v2
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method private final warnImageSource(Ljava/lang/String;)V
    .locals 3

    .line 1
    .line 2
    sget-boolean v0, Lcom/facebook/react/common/build/ReactBuildConfig;->DEBUG:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-static {}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->enableBridgelessArchitecture()Z

    .line 8
    move-result v0

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    const-string v1, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext"

    .line 17
    .line 18
    .line 19
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    check-cast v0, Lcom/facebook/react/bridge/ReactContext;

    .line 22
    .line 23
    new-instance v1, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 27
    .line 28
    const-string v2, "ReactImageView: Image source \""

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    const-string p1, "\" doesn\'t exist"

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    move-result-object p1

    .line 44
    .line 45
    .line 46
    invoke-static {v0, p1}, Lcom/facebook/react/util/RNLog;->w(Lcom/facebook/react/bridge/ReactContext;Ljava/lang/String;)V

    .line 47
    :cond_0
    return-void
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method


# virtual methods
.method public final getImageSource$ReactAndroid_release()Lcom/facebook/react/views/imagehelper/ImageSource;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/react/views/image/ReactImageView;->imageSource:Lcom/facebook/react/views/imagehelper/ImageSource;

    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public hasOverlappingRendering()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public final maybeUpdateView()V
    .locals 5

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/facebook/react/views/image/ReactImageView;->isDirty:Z

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    goto :goto_0

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-direct {p0}, Lcom/facebook/react/views/image/ReactImageView;->hasMultipleSources()Z

    .line 9
    move-result v0

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 15
    move-result v0

    .line 16
    .line 17
    if-lez v0, :cond_4

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 21
    move-result v0

    .line 22
    .line 23
    if-gtz v0, :cond_1

    .line 24
    goto :goto_0

    .line 25
    .line 26
    .line 27
    :cond_1
    invoke-direct {p0}, Lcom/facebook/react/views/image/ReactImageView;->setSourceImage()V

    .line 28
    .line 29
    iget-object v0, p0, Lcom/facebook/react/views/image/ReactImageView;->imageSource:Lcom/facebook/react/views/imagehelper/ImageSource;

    .line 30
    .line 31
    if-nez v0, :cond_2

    .line 32
    goto :goto_0

    .line 33
    .line 34
    .line 35
    :cond_2
    invoke-direct {p0, v0}, Lcom/facebook/react/views/image/ReactImageView;->shouldResize(Lcom/facebook/react/views/imagehelper/ImageSource;)Z

    .line 36
    move-result v1

    .line 37
    .line 38
    if-eqz v1, :cond_3

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 42
    move-result v2

    .line 43
    .line 44
    if-lez v2, :cond_4

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 48
    move-result v2

    .line 49
    .line 50
    if-gtz v2, :cond_3

    .line 51
    goto :goto_0

    .line 52
    .line 53
    .line 54
    :cond_3
    invoke-direct {p0}, Lcom/facebook/react/views/image/ReactImageView;->isTiled()Z

    .line 55
    move-result v2

    .line 56
    .line 57
    if-eqz v2, :cond_5

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 61
    move-result v2

    .line 62
    .line 63
    if-lez v2, :cond_4

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 67
    move-result v2

    .line 68
    .line 69
    if-gtz v2, :cond_5

    .line 70
    :cond_4
    :goto_0
    return-void

    .line 71
    .line 72
    .line 73
    :cond_5
    invoke-virtual {p0}, Lcom/facebook/drawee/view/DraweeView;->getHierarchy()Lt4/b;

    .line 74
    move-result-object v2

    .line 75
    .line 76
    check-cast v2, Lr4/a;

    .line 77
    .line 78
    iget-object v3, p0, Lcom/facebook/react/views/image/ReactImageView;->scaleType:Lcom/facebook/drawee/drawable/q;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2, v3}, Lr4/a;->t(Lcom/facebook/drawee/drawable/q;)V

    .line 82
    .line 83
    iget-object v3, p0, Lcom/facebook/react/views/image/ReactImageView;->defaultImageDrawable:Landroid/graphics/drawable/Drawable;

    .line 84
    .line 85
    if-eqz v3, :cond_6

    .line 86
    .line 87
    iget-object v4, p0, Lcom/facebook/react/views/image/ReactImageView;->scaleType:Lcom/facebook/drawee/drawable/q;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v2, v3, v4}, Lr4/a;->w(Landroid/graphics/drawable/Drawable;Lcom/facebook/drawee/drawable/q;)V

    .line 91
    .line 92
    :cond_6
    iget-object v3, p0, Lcom/facebook/react/views/image/ReactImageView;->loadingImageDrawable:Landroid/graphics/drawable/Drawable;

    .line 93
    .line 94
    if-eqz v3, :cond_7

    .line 95
    .line 96
    sget-object v4, Lcom/facebook/drawee/drawable/q;->g:Lcom/facebook/drawee/drawable/q;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v2, v3, v4}, Lr4/a;->w(Landroid/graphics/drawable/Drawable;Lcom/facebook/drawee/drawable/q;)V

    .line 100
    .line 101
    .line 102
    :cond_7
    invoke-virtual {v2}, Lr4/a;->o()Lcom/facebook/drawee/generic/RoundingParams;

    .line 103
    move-result-object v3

    .line 104
    .line 105
    if-eqz v3, :cond_9

    .line 106
    .line 107
    iget v4, p0, Lcom/facebook/react/views/image/ReactImageView;->overlayColor:I

    .line 108
    .line 109
    if-eqz v4, :cond_8

    .line 110
    .line 111
    .line 112
    invoke-virtual {v3, v4}, Lcom/facebook/drawee/generic/RoundingParams;->q(I)Lcom/facebook/drawee/generic/RoundingParams;

    .line 113
    goto :goto_1

    .line 114
    .line 115
    :cond_8
    sget-object v4, Lcom/facebook/drawee/generic/RoundingParams$RoundingMethod;->BITMAP_ONLY:Lcom/facebook/drawee/generic/RoundingParams$RoundingMethod;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v3, v4}, Lcom/facebook/drawee/generic/RoundingParams;->u(Lcom/facebook/drawee/generic/RoundingParams$RoundingMethod;)Lcom/facebook/drawee/generic/RoundingParams;

    .line 119
    .line 120
    .line 121
    :goto_1
    invoke-virtual {v2, v3}, Lr4/a;->z(Lcom/facebook/drawee/generic/RoundingParams;)V

    .line 122
    .line 123
    :cond_9
    iget v3, p0, Lcom/facebook/react/views/image/ReactImageView;->fadeDurationMs:I

    .line 124
    const/4 v4, 0x0

    .line 125
    .line 126
    if-ltz v3, :cond_a

    .line 127
    goto :goto_2

    .line 128
    .line 129
    .line 130
    :cond_a
    invoke-virtual {v0}, Lcom/facebook/react/views/imagehelper/ImageSource;->isResource()Z

    .line 131
    move-result v0

    .line 132
    .line 133
    if-eqz v0, :cond_b

    .line 134
    move v3, v4

    .line 135
    goto :goto_2

    .line 136
    .line 137
    :cond_b
    const/16 v3, 0x12c

    .line 138
    .line 139
    .line 140
    :goto_2
    invoke-virtual {v2, v3}, Lr4/a;->v(I)V

    .line 141
    .line 142
    .line 143
    invoke-direct {p0, v1}, Lcom/facebook/react/views/image/ReactImageView;->maybeUpdateViewFromRequest(Z)V

    .line 144
    .line 145
    iput-boolean v4, p0, Lcom/facebook/react/views/image/ReactImageView;->isDirty:Z

    .line 146
    return-void
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 4
    .param p1    # Landroid/graphics/Canvas;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "canvas"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p0, p1}, Lcom/facebook/react/uimanager/BackgroundStyleApplicator;->clipToPaddingBox(Landroid/view/View;Landroid/graphics/Canvas;)V

    .line 9
    .line 10
    .line 11
    :try_start_0
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    return-void

    .line 13
    :catch_0
    move-exception p1

    .line 14
    .line 15
    iget-object v0, p0, Lcom/facebook/react/views/image/ReactImageView;->downloadListener:Lcom/facebook/react/views/image/ReactImageDownloadListener;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    const-string v1, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext"

    .line 24
    .line 25
    .line 26
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    check-cast v0, Lcom/facebook/react/bridge/ReactContext;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 32
    move-result v1

    .line 33
    .line 34
    .line 35
    invoke-static {v0, v1}, Lcom/facebook/react/uimanager/UIManagerHelper;->getEventDispatcherForReactTag(Lcom/facebook/react/bridge/ReactContext;I)Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 36
    move-result-object v0

    .line 37
    .line 38
    if-eqz v0, :cond_0

    .line 39
    .line 40
    sget-object v1, Lcom/facebook/react/views/image/ImageLoadEvent;->Companion:Lcom/facebook/react/views/image/ImageLoadEvent$Companion;

    .line 41
    .line 42
    .line 43
    invoke-static {p0}, Lcom/facebook/react/uimanager/UIManagerHelper;->getSurfaceId(Landroid/view/View;)I

    .line 44
    move-result v2

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 48
    move-result v3

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1, v2, v3, p1}, Lcom/facebook/react/views/image/ImageLoadEvent$Companion;->createErrorEvent(IILjava/lang/Throwable;)Lcom/facebook/react/views/image/ImageLoadEvent;

    .line 52
    move-result-object p1

    .line 53
    .line 54
    .line 55
    invoke-interface {v0, p1}, Lcom/facebook/react/uimanager/events/EventDispatcher;->dispatchEvent(Lcom/facebook/react/uimanager/events/Event;)V

    .line 56
    :cond_0
    return-void
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public onSizeChanged(IIII)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    .line 4
    .line 5
    if-lez p1, :cond_2

    .line 6
    .line 7
    if-lez p2, :cond_2

    .line 8
    .line 9
    iget-boolean p1, p0, Lcom/facebook/react/views/image/ReactImageView;->isDirty:Z

    .line 10
    .line 11
    if-nez p1, :cond_1

    .line 12
    .line 13
    .line 14
    invoke-direct {p0}, Lcom/facebook/react/views/image/ReactImageView;->hasMultipleSources()Z

    .line 15
    move-result p1

    .line 16
    .line 17
    if-nez p1, :cond_1

    .line 18
    .line 19
    .line 20
    invoke-direct {p0}, Lcom/facebook/react/views/image/ReactImageView;->isTiled()Z

    .line 21
    move-result p1

    .line 22
    .line 23
    if-eqz p1, :cond_0

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 p1, 0x0

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 28
    .line 29
    :goto_1
    iput-boolean p1, p0, Lcom/facebook/react/views/image/ReactImageView;->isDirty:Z

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Lcom/facebook/react/views/image/ReactImageView;->maybeUpdateView()V

    .line 33
    :cond_2
    return-void
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
.end method

.method public setBackgroundColor(I)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    .line 7
    invoke-static {p0, p1}, Lcom/facebook/react/uimanager/BackgroundStyleApplicator;->setBackgroundColor(Landroid/view/View;Ljava/lang/Integer;)V

    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public final setBlurRadius(F)V
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/facebook/react/uimanager/PixelUtil;->INSTANCE:Lcom/facebook/react/uimanager/PixelUtil;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/facebook/react/uimanager/PixelUtil;->dpToPx(F)F

    .line 6
    move-result p1

    .line 7
    float-to-int p1, p1

    .line 8
    const/4 v0, 0x2

    .line 9
    div-int/2addr p1, v0

    .line 10
    .line 11
    if-nez p1, :cond_0

    .line 12
    const/4 p1, 0x0

    .line 13
    goto :goto_0

    .line 14
    .line 15
    :cond_0
    new-instance v1, Lc6/a;

    .line 16
    .line 17
    .line 18
    invoke-direct {v1, v0, p1}, Lc6/a;-><init>(II)V

    .line 19
    move-object p1, v1

    .line 20
    .line 21
    :goto_0
    iput-object p1, p0, Lcom/facebook/react/views/image/ReactImageView;->iterativeBoxBlurPostProcessor:Lc6/a;

    .line 22
    const/4 p1, 0x1

    .line 23
    .line 24
    iput-boolean p1, p0, Lcom/facebook/react/views/image/ReactImageView;->isDirty:Z

    .line 25
    return-void
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public final setBorderColor(I)V
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/facebook/react/uimanager/style/LogicalEdge;->ALL:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 3
    .line 4
    .line 5
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    .line 9
    invoke-static {p0, v0, p1}, Lcom/facebook/react/uimanager/BackgroundStyleApplicator;->setBorderColor(Landroid/view/View;Lcom/facebook/react/uimanager/style/LogicalEdge;Ljava/lang/Integer;)V

    .line 10
    return-void
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public final setBorderRadius(F)V
    .locals 2

    .line 1
    invoke-static {p1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 2
    :cond_0
    new-instance v0, Lcom/facebook/react/uimanager/LengthPercentage;

    sget-object v1, Lcom/facebook/react/uimanager/PixelUtil;->INSTANCE:Lcom/facebook/react/uimanager/PixelUtil;

    invoke-virtual {v1, p1}, Lcom/facebook/react/uimanager/PixelUtil;->pxToDp(F)F

    move-result p1

    sget-object v1, Lcom/facebook/react/uimanager/LengthPercentageType;->POINT:Lcom/facebook/react/uimanager/LengthPercentageType;

    invoke-direct {v0, p1, v1}, Lcom/facebook/react/uimanager/LengthPercentage;-><init>(FLcom/facebook/react/uimanager/LengthPercentageType;)V

    move-object p1, v0

    .line 3
    :goto_0
    sget-object v0, Lcom/facebook/react/uimanager/style/BorderRadiusProp;->BORDER_RADIUS:Lcom/facebook/react/uimanager/style/BorderRadiusProp;

    invoke-static {p0, v0, p1}, Lcom/facebook/react/uimanager/BackgroundStyleApplicator;->setBorderRadius(Landroid/view/View;Lcom/facebook/react/uimanager/style/BorderRadiusProp;Lcom/facebook/react/uimanager/LengthPercentage;)V

    return-void
.end method

.method public final setBorderRadius(FI)V
    .locals 2

    .line 4
    invoke-static {p1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 5
    :cond_0
    new-instance v0, Lcom/facebook/react/uimanager/LengthPercentage;

    sget-object v1, Lcom/facebook/react/uimanager/PixelUtil;->INSTANCE:Lcom/facebook/react/uimanager/PixelUtil;

    invoke-virtual {v1, p1}, Lcom/facebook/react/uimanager/PixelUtil;->pxToDp(F)F

    move-result p1

    sget-object v1, Lcom/facebook/react/uimanager/LengthPercentageType;->POINT:Lcom/facebook/react/uimanager/LengthPercentageType;

    invoke-direct {v0, p1, v1}, Lcom/facebook/react/uimanager/LengthPercentage;-><init>(FLcom/facebook/react/uimanager/LengthPercentageType;)V

    move-object p1, v0

    .line 6
    :goto_0
    invoke-static {}, Lcom/facebook/react/uimanager/style/BorderRadiusProp;->values()[Lcom/facebook/react/uimanager/style/BorderRadiusProp;

    move-result-object v0

    aget-object p2, v0, p2

    invoke-static {p0, p2, p1}, Lcom/facebook/react/uimanager/BackgroundStyleApplicator;->setBorderRadius(Landroid/view/View;Lcom/facebook/react/uimanager/style/BorderRadiusProp;Lcom/facebook/react/uimanager/LengthPercentage;)V

    return-void
.end method

.method public final setBorderWidth(F)V
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/facebook/react/uimanager/style/LogicalEdge;->ALL:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 3
    .line 4
    .line 5
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    .line 9
    invoke-static {p0, v0, p1}, Lcom/facebook/react/uimanager/BackgroundStyleApplicator;->setBorderWidth(Landroid/view/View;Lcom/facebook/react/uimanager/style/LogicalEdge;Ljava/lang/Float;)V

    .line 10
    return-void
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public final setControllerListener(Lo4/c;)V
    .locals 0
    .param p1    # Lo4/c;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation runtime Lcom/facebook/react/common/annotations/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo4/c<",
            "Lx5/k;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/facebook/react/views/image/ReactImageView;->controllerForTesting:Lo4/c;

    .line 3
    const/4 p1, 0x1

    .line 4
    .line 5
    iput-boolean p1, p0, Lcom/facebook/react/views/image/ReactImageView;->isDirty:Z

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/facebook/react/views/image/ReactImageView;->maybeUpdateView()V

    .line 9
    return-void
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public final setDefaultSource(Ljava/lang/String;)V
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    sget-object v0, Lcom/facebook/react/views/imagehelper/ResourceDrawableIdHelper;->Companion:Lcom/facebook/react/views/imagehelper/ResourceDrawableIdHelper$Companion;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/facebook/react/views/imagehelper/ResourceDrawableIdHelper$Companion;->getInstance()Lcom/facebook/react/views/imagehelper/ResourceDrawableIdHelper;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 10
    move-result-object v1

    .line 11
    .line 12
    const-string v2, "getContext(...)"

    .line 13
    .line 14
    .line 15
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1, p1}, Lcom/facebook/react/views/imagehelper/ResourceDrawableIdHelper;->getResourceDrawable(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    .line 19
    move-result-object p1

    .line 20
    .line 21
    iget-object v0, p0, Lcom/facebook/react/views/image/ReactImageView;->defaultImageDrawable:Landroid/graphics/drawable/Drawable;

    .line 22
    .line 23
    .line 24
    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    move-result v0

    .line 26
    .line 27
    if-nez v0, :cond_0

    .line 28
    .line 29
    iput-object p1, p0, Lcom/facebook/react/views/image/ReactImageView;->defaultImageDrawable:Landroid/graphics/drawable/Drawable;

    .line 30
    const/4 p1, 0x1

    .line 31
    .line 32
    iput-boolean p1, p0, Lcom/facebook/react/views/image/ReactImageView;->isDirty:Z

    .line 33
    :cond_0
    return-void
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public final setFadeDuration(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/facebook/react/views/image/ReactImageView;->fadeDurationMs:I

    .line 3
    return-void
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public final setHeaders(Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 0
    .param p1    # Lcom/facebook/react/bridge/ReadableMap;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/facebook/react/views/image/ReactImageView;->headers:Lcom/facebook/react/bridge/ReadableMap;

    .line 3
    return-void
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public final setImageSource$ReactAndroid_release(Lcom/facebook/react/views/imagehelper/ImageSource;)V
    .locals 0
    .param p1    # Lcom/facebook/react/views/imagehelper/ImageSource;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/facebook/react/views/image/ReactImageView;->imageSource:Lcom/facebook/react/views/imagehelper/ImageSource;

    .line 3
    return-void
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public final setLoadingIndicatorSource(Ljava/lang/String;)V
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    sget-object v0, Lcom/facebook/react/views/imagehelper/ResourceDrawableIdHelper;->Companion:Lcom/facebook/react/views/imagehelper/ResourceDrawableIdHelper$Companion;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/facebook/react/views/imagehelper/ResourceDrawableIdHelper$Companion;->getInstance()Lcom/facebook/react/views/imagehelper/ResourceDrawableIdHelper;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 10
    move-result-object v1

    .line 11
    .line 12
    const-string v2, "getContext(...)"

    .line 13
    .line 14
    .line 15
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1, p1}, Lcom/facebook/react/views/imagehelper/ResourceDrawableIdHelper;->getResourceDrawable(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    .line 19
    move-result-object p1

    .line 20
    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    new-instance v0, Lcom/facebook/drawee/drawable/b;

    .line 24
    .line 25
    const/16 v1, 0x3e8

    .line 26
    .line 27
    .line 28
    invoke-direct {v0, p1, v1}, Lcom/facebook/drawee/drawable/b;-><init>(Landroid/graphics/drawable/Drawable;I)V

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 v0, 0x0

    .line 31
    .line 32
    :goto_0
    iget-object p1, p0, Lcom/facebook/react/views/image/ReactImageView;->loadingImageDrawable:Landroid/graphics/drawable/Drawable;

    .line 33
    .line 34
    .line 35
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    move-result p1

    .line 37
    .line 38
    if-nez p1, :cond_1

    .line 39
    .line 40
    iput-object v0, p0, Lcom/facebook/react/views/image/ReactImageView;->loadingImageDrawable:Landroid/graphics/drawable/Drawable;

    .line 41
    const/4 p1, 0x1

    .line 42
    .line 43
    iput-boolean p1, p0, Lcom/facebook/react/views/image/ReactImageView;->isDirty:Z

    .line 44
    :cond_1
    return-void
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public final setOverlayColor(I)V
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/facebook/react/views/image/ReactImageView;->overlayColor:I

    .line 3
    .line 4
    if-eq v0, p1, :cond_0

    .line 5
    .line 6
    iput p1, p0, Lcom/facebook/react/views/image/ReactImageView;->overlayColor:I

    .line 7
    const/4 p1, 0x1

    .line 8
    .line 9
    iput-boolean p1, p0, Lcom/facebook/react/views/image/ReactImageView;->isDirty:Z

    .line 10
    :cond_0
    return-void
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public final setProgressiveRenderingEnabled(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/facebook/react/views/image/ReactImageView;->progressiveRenderingEnabled:Z

    .line 3
    return-void
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public final setResizeMethod(Lcom/facebook/react/views/image/ImageResizeMethod;)V
    .locals 1
    .param p1    # Lcom/facebook/react/views/image/ImageResizeMethod;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "resizeMethod"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    iget-object v0, p0, Lcom/facebook/react/views/image/ReactImageView;->resizeMethod:Lcom/facebook/react/views/image/ImageResizeMethod;

    .line 9
    .line 10
    if-eq v0, p1, :cond_0

    .line 11
    .line 12
    iput-object p1, p0, Lcom/facebook/react/views/image/ReactImageView;->resizeMethod:Lcom/facebook/react/views/image/ImageResizeMethod;

    .line 13
    const/4 p1, 0x1

    .line 14
    .line 15
    iput-boolean p1, p0, Lcom/facebook/react/views/image/ReactImageView;->isDirty:Z

    .line 16
    :cond_0
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public final setResizeMultiplier(F)V
    .locals 4

    .line 1
    .line 2
    iget v0, p0, Lcom/facebook/react/views/image/ReactImageView;->resizeMultiplier:F

    .line 3
    sub-float/2addr v0, p1

    .line 4
    float-to-double v0, v0

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    .line 8
    move-result-wide v0

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    const-wide v2, 0x3f1a36e2e0000000L    # 9.999999747378752E-5

    .line 14
    .line 15
    cmpl-double v0, v0, v2

    .line 16
    .line 17
    if-lez v0, :cond_0

    .line 18
    .line 19
    iput p1, p0, Lcom/facebook/react/views/image/ReactImageView;->resizeMultiplier:F

    .line 20
    const/4 p1, 0x1

    .line 21
    .line 22
    iput-boolean p1, p0, Lcom/facebook/react/views/image/ReactImageView;->isDirty:Z

    .line 23
    :cond_0
    return-void
.end method

.method public final setScaleType(Lcom/facebook/drawee/drawable/q;)V
    .locals 1
    .param p1    # Lcom/facebook/drawee/drawable/q;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "scaleType"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    iget-object v0, p0, Lcom/facebook/react/views/image/ReactImageView;->scaleType:Lcom/facebook/drawee/drawable/q;

    .line 9
    .line 10
    if-eq v0, p1, :cond_0

    .line 11
    .line 12
    iput-object p1, p0, Lcom/facebook/react/views/image/ReactImageView;->scaleType:Lcom/facebook/drawee/drawable/q;

    .line 13
    const/4 p1, 0x1

    .line 14
    .line 15
    iput-boolean p1, p0, Lcom/facebook/react/views/image/ReactImageView;->isDirty:Z

    .line 16
    :cond_0
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public final setShouldNotifyLoadEvents(Z)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/react/views/image/ReactImageView;->downloadListener:Lcom/facebook/react/views/image/ReactImageDownloadListener;

    .line 3
    const/4 v1, 0x1

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    move v0, v1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    .line 10
    :goto_0
    if-ne p1, v0, :cond_1

    .line 11
    return-void

    .line 12
    .line 13
    :cond_1
    if-nez p1, :cond_2

    .line 14
    const/4 p1, 0x0

    .line 15
    .line 16
    iput-object p1, p0, Lcom/facebook/react/views/image/ReactImageView;->downloadListener:Lcom/facebook/react/views/image/ReactImageDownloadListener;

    .line 17
    goto :goto_1

    .line 18
    .line 19
    .line 20
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 21
    move-result-object p1

    .line 22
    .line 23
    const-string v0, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext"

    .line 24
    .line 25
    .line 26
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    check-cast p1, Lcom/facebook/react/bridge/ReactContext;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 32
    move-result v0

    .line 33
    .line 34
    .line 35
    invoke-static {p1, v0}, Lcom/facebook/react/uimanager/UIManagerHelper;->getEventDispatcherForReactTag(Lcom/facebook/react/bridge/ReactContext;I)Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 36
    move-result-object p1

    .line 37
    .line 38
    new-instance v0, Lcom/facebook/react/views/image/ReactImageView$setShouldNotifyLoadEvents$1;

    .line 39
    .line 40
    .line 41
    invoke-direct {v0, p1, p0}, Lcom/facebook/react/views/image/ReactImageView$setShouldNotifyLoadEvents$1;-><init>(Lcom/facebook/react/uimanager/events/EventDispatcher;Lcom/facebook/react/views/image/ReactImageView;)V

    .line 42
    .line 43
    iput-object v0, p0, Lcom/facebook/react/views/image/ReactImageView;->downloadListener:Lcom/facebook/react/views/image/ReactImageDownloadListener;

    .line 44
    .line 45
    :goto_1
    iput-boolean v1, p0, Lcom/facebook/react/views/image/ReactImageView;->isDirty:Z

    .line 46
    return-void
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public final setSource(Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 19
    .param p1    # Lcom/facebook/react/bridge/ReadableArray;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v1, p1

    .line 5
    .line 6
    new-instance v2, Ljava/util/ArrayList;

    .line 7
    .line 8
    .line 9
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 10
    const/4 v3, 0x1

    .line 11
    .line 12
    const-string v4, "getContext(...)"

    .line 13
    .line 14
    if-eqz v1, :cond_6

    .line 15
    .line 16
    .line 17
    invoke-interface {v1}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    .line 18
    move-result v5

    .line 19
    .line 20
    if-nez v5, :cond_0

    .line 21
    .line 22
    goto/16 :goto_2

    .line 23
    .line 24
    .line 25
    :cond_0
    invoke-interface {v1}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    .line 26
    move-result v5

    .line 27
    .line 28
    const-string v6, "cache"

    .line 29
    const/4 v7, 0x0

    .line 30
    .line 31
    .line 32
    const-string/jumbo v8, "uri"

    .line 33
    .line 34
    if-ne v5, v3, :cond_3

    .line 35
    .line 36
    .line 37
    invoke-interface {v1, v7}, Lcom/facebook/react/bridge/ReadableArray;->getMap(I)Lcom/facebook/react/bridge/ReadableMap;

    .line 38
    move-result-object v1

    .line 39
    .line 40
    if-eqz v1, :cond_2

    .line 41
    .line 42
    .line 43
    invoke-interface {v1, v6}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 44
    move-result-object v5

    .line 45
    .line 46
    .line 47
    invoke-direct {v0, v5}, Lcom/facebook/react/views/image/ReactImageView;->computeCacheControl(Ljava/lang/String;)Lcom/facebook/react/modules/fresco/ImageCacheControl;

    .line 48
    move-result-object v16

    .line 49
    .line 50
    new-instance v9, Lcom/facebook/react/views/imagehelper/ImageSource;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 54
    move-result-object v10

    .line 55
    .line 56
    .line 57
    invoke-static {v10, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-interface {v1, v8}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 61
    move-result-object v11

    .line 62
    .line 63
    const/16 v17, 0xc

    .line 64
    .line 65
    const/16 v18, 0x0

    .line 66
    .line 67
    const-wide/16 v12, 0x0

    .line 68
    .line 69
    const-wide/16 v14, 0x0

    .line 70
    .line 71
    .line 72
    invoke-direct/range {v9 .. v18}, Lcom/facebook/react/views/imagehelper/ImageSource;-><init>(Landroid/content/Context;Ljava/lang/String;DDLcom/facebook/react/modules/fresco/ImageCacheControl;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 73
    .line 74
    sget-object v5, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v9}, Lcom/facebook/react/views/imagehelper/ImageSource;->getUri()Landroid/net/Uri;

    .line 78
    move-result-object v6

    .line 79
    .line 80
    .line 81
    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 82
    move-result v5

    .line 83
    .line 84
    if-eqz v5, :cond_1

    .line 85
    .line 86
    .line 87
    invoke-interface {v1, v8}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 88
    move-result-object v1

    .line 89
    .line 90
    .line 91
    invoke-direct {v0, v1}, Lcom/facebook/react/views/image/ReactImageView;->warnImageSource(Ljava/lang/String;)V

    .line 92
    .line 93
    sget-object v1, Lcom/facebook/react/views/imagehelper/ImageSource;->Companion:Lcom/facebook/react/views/imagehelper/ImageSource$Companion;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 97
    move-result-object v5

    .line 98
    .line 99
    .line 100
    invoke-static {v5, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v1, v5}, Lcom/facebook/react/views/imagehelper/ImageSource$Companion;->getTransparentBitmapImageSource(Landroid/content/Context;)Lcom/facebook/react/views/imagehelper/ImageSource;

    .line 104
    move-result-object v9

    .line 105
    .line 106
    .line 107
    :cond_1
    invoke-interface {v2, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 108
    goto :goto_3

    .line 109
    .line 110
    :cond_2
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 111
    .line 112
    const-string v2, "Required value was null."

    .line 113
    .line 114
    .line 115
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 116
    throw v1

    .line 117
    .line 118
    .line 119
    :cond_3
    invoke-interface {v1}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    .line 120
    move-result v5

    .line 121
    .line 122
    :goto_0
    if-ge v7, v5, :cond_7

    .line 123
    .line 124
    .line 125
    invoke-interface {v1, v7}, Lcom/facebook/react/bridge/ReadableArray;->getMap(I)Lcom/facebook/react/bridge/ReadableMap;

    .line 126
    move-result-object v9

    .line 127
    .line 128
    if-nez v9, :cond_4

    .line 129
    goto :goto_1

    .line 130
    .line 131
    .line 132
    :cond_4
    invoke-interface {v9, v6}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 133
    move-result-object v10

    .line 134
    .line 135
    .line 136
    invoke-direct {v0, v10}, Lcom/facebook/react/views/image/ReactImageView;->computeCacheControl(Ljava/lang/String;)Lcom/facebook/react/modules/fresco/ImageCacheControl;

    .line 137
    move-result-object v18

    .line 138
    .line 139
    new-instance v11, Lcom/facebook/react/views/imagehelper/ImageSource;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 143
    move-result-object v12

    .line 144
    .line 145
    .line 146
    invoke-static {v12, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    invoke-interface {v9, v8}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 150
    move-result-object v13

    .line 151
    .line 152
    .line 153
    const-string/jumbo v10, "width"

    .line 154
    .line 155
    .line 156
    invoke-interface {v9, v10}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    .line 157
    move-result-wide v14

    .line 158
    .line 159
    const-string v10, "height"

    .line 160
    .line 161
    .line 162
    invoke-interface {v9, v10}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    .line 163
    move-result-wide v16

    .line 164
    .line 165
    .line 166
    invoke-direct/range {v11 .. v18}, Lcom/facebook/react/views/imagehelper/ImageSource;-><init>(Landroid/content/Context;Ljava/lang/String;DDLcom/facebook/react/modules/fresco/ImageCacheControl;)V

    .line 167
    .line 168
    sget-object v10, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v11}, Lcom/facebook/react/views/imagehelper/ImageSource;->getUri()Landroid/net/Uri;

    .line 172
    move-result-object v12

    .line 173
    .line 174
    .line 175
    invoke-static {v10, v12}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 176
    move-result v10

    .line 177
    .line 178
    if-eqz v10, :cond_5

    .line 179
    .line 180
    .line 181
    invoke-interface {v9, v8}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 182
    move-result-object v9

    .line 183
    .line 184
    .line 185
    invoke-direct {v0, v9}, Lcom/facebook/react/views/image/ReactImageView;->warnImageSource(Ljava/lang/String;)V

    .line 186
    .line 187
    sget-object v9, Lcom/facebook/react/views/imagehelper/ImageSource;->Companion:Lcom/facebook/react/views/imagehelper/ImageSource$Companion;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 191
    move-result-object v10

    .line 192
    .line 193
    .line 194
    invoke-static {v10, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v9, v10}, Lcom/facebook/react/views/imagehelper/ImageSource$Companion;->getTransparentBitmapImageSource(Landroid/content/Context;)Lcom/facebook/react/views/imagehelper/ImageSource;

    .line 198
    move-result-object v11

    .line 199
    .line 200
    .line 201
    :cond_5
    invoke-interface {v2, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 202
    .line 203
    :goto_1
    add-int/lit8 v7, v7, 0x1

    .line 204
    goto :goto_0

    .line 205
    .line 206
    :cond_6
    :goto_2
    sget-object v1, Lcom/facebook/react/views/imagehelper/ImageSource;->Companion:Lcom/facebook/react/views/imagehelper/ImageSource$Companion;

    .line 207
    .line 208
    .line 209
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 210
    move-result-object v5

    .line 211
    .line 212
    .line 213
    invoke-static {v5, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v1, v5}, Lcom/facebook/react/views/imagehelper/ImageSource$Companion;->getTransparentBitmapImageSource(Landroid/content/Context;)Lcom/facebook/react/views/imagehelper/ImageSource;

    .line 217
    move-result-object v1

    .line 218
    .line 219
    .line 220
    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 221
    .line 222
    :cond_7
    :goto_3
    iget-object v1, v0, Lcom/facebook/react/views/image/ReactImageView;->sources:Ljava/util/List;

    .line 223
    .line 224
    .line 225
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 226
    move-result v1

    .line 227
    .line 228
    if-eqz v1, :cond_8

    .line 229
    return-void

    .line 230
    .line 231
    :cond_8
    iget-object v1, v0, Lcom/facebook/react/views/image/ReactImageView;->sources:Ljava/util/List;

    .line 232
    .line 233
    .line 234
    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 235
    .line 236
    iget-object v1, v0, Lcom/facebook/react/views/image/ReactImageView;->sources:Ljava/util/List;

    .line 237
    .line 238
    .line 239
    invoke-interface {v1, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 240
    .line 241
    iput-boolean v3, v0, Lcom/facebook/react/views/image/ReactImageView;->isDirty:Z

    .line 242
    return-void
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
.end method

.method public final setTileMode(Landroid/graphics/Shader$TileMode;)V
    .locals 1
    .param p1    # Landroid/graphics/Shader$TileMode;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "tileMode"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    iget-object v0, p0, Lcom/facebook/react/views/image/ReactImageView;->tileMode:Landroid/graphics/Shader$TileMode;

    .line 9
    .line 10
    if-eq v0, p1, :cond_1

    .line 11
    .line 12
    iput-object p1, p0, Lcom/facebook/react/views/image/ReactImageView;->tileMode:Landroid/graphics/Shader$TileMode;

    .line 13
    .line 14
    .line 15
    invoke-direct {p0}, Lcom/facebook/react/views/image/ReactImageView;->isTiled()Z

    .line 16
    move-result p1

    .line 17
    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    new-instance p1, Lcom/facebook/react/views/image/ReactImageView$TilePostprocessor;

    .line 21
    .line 22
    .line 23
    invoke-direct {p1, p0}, Lcom/facebook/react/views/image/ReactImageView$TilePostprocessor;-><init>(Lcom/facebook/react/views/image/ReactImageView;)V

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 p1, 0x0

    .line 26
    .line 27
    :goto_0
    iput-object p1, p0, Lcom/facebook/react/views/image/ReactImageView;->tilePostprocessor:Lcom/facebook/react/views/image/ReactImageView$TilePostprocessor;

    .line 28
    const/4 p1, 0x1

    .line 29
    .line 30
    iput-boolean p1, p0, Lcom/facebook/react/views/image/ReactImageView;->isDirty:Z

    .line 31
    :cond_1
    return-void
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public final updateCallerContext(Ljava/lang/Object;)V
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/react/views/image/ReactImageView;->callerContext:Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iput-object p1, p0, Lcom/facebook/react/views/image/ReactImageView;->callerContext:Ljava/lang/Object;

    .line 11
    const/4 p1, 0x1

    .line 12
    .line 13
    iput-boolean p1, p0, Lcom/facebook/react/views/image/ReactImageView;->isDirty:Z

    .line 14
    :cond_0
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method
