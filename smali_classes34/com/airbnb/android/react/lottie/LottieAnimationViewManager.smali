.class public final Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;
.super Lcom/facebook/react/uimanager/SimpleViewManager;
.source "LottieAnimationViewManager.kt"

# interfaces
.implements Lcom/facebook/react/viewmanagers/LottieAnimationViewManagerInterface;


# annotations
.annotation runtime Lcom/facebook/react/module/annotations/ReactModule;
    name = "LottieAnimationView"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/react/uimanager/SimpleViewManager<",
        "Lcom/airbnb/lottie/LottieAnimationView;",
        ">;",
        "Lcom/facebook/react/viewmanagers/LottieAnimationViewManagerInterface<",
        "Lcom/airbnb/lottie/LottieAnimationView;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\r\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0010\u0006\n\u0002\u0008\u0013\n\u0002\u0018\u0002\n\u0000\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00020\u0003B\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0010\u0010\u000b\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u0002H\u0002J\u000e\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00020\nH\u0014J\u0014\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fH\u0016J\u0008\u0010\u0012\u001a\u00020\u0010H\u0016J\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0016\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u000c\u001a\u00020\u0002H\u0014J\"\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00102\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J \u0010\u001f\u001a\u00020\u00192\u0006\u0010\u000c\u001a\u00020\u00022\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!H\u0016J\u0010\u0010#\u001a\u00020\u00192\u0006\u0010\u000c\u001a\u00020\u0002H\u0016J\u0010\u0010$\u001a\u00020\u00192\u0006\u0010\u000c\u001a\u00020\u0002H\u0016J\u0010\u0010%\u001a\u00020\u00192\u0006\u0010\u000c\u001a\u00020\u0002H\u0016J\u001a\u0010&\u001a\u00020\u00192\u0006\u0010\u000c\u001a\u00020\u00022\u0008\u0010\'\u001a\u0004\u0018\u00010\u0010H\u0017J\u001a\u0010(\u001a\u00020\u00192\u0006\u0010\u000c\u001a\u00020\u00022\u0008\u0010)\u001a\u0004\u0018\u00010\u0010H\u0017J\u001a\u0010*\u001a\u00020\u00192\u0006\u0010\u000c\u001a\u00020\u00022\u0008\u0010+\u001a\u0004\u0018\u00010\u0010H\u0017J\u001a\u0010,\u001a\u00020\u00192\u0006\u0010\u000c\u001a\u00020\u00022\u0008\u0010+\u001a\u0004\u0018\u00010\u0010H\u0017J\u0018\u0010-\u001a\u00020\u00192\u0006\u0010\u000c\u001a\u00020\u00022\u0006\u0010.\u001a\u00020/H\u0017J\u001a\u00100\u001a\u00020\u00192\u0006\u0010\u000c\u001a\u00020\u00022\u0008\u00101\u001a\u0004\u0018\u00010\u0010H\u0017J\u001a\u00102\u001a\u00020\u00192\u0006\u0010\u000c\u001a\u00020\u00022\u0008\u00103\u001a\u0004\u0018\u00010\u0010H\u0017J\u0018\u00104\u001a\u00020\u00192\u0006\u0010\u000c\u001a\u00020\u00022\u0006\u00105\u001a\u000206H\u0017J\u0018\u00107\u001a\u00020\u00192\u0006\u0010\u000c\u001a\u00020\u00022\u0006\u00108\u001a\u000209H\u0017J\u0018\u0010:\u001a\u00020\u00192\u0006\u0010\u000c\u001a\u00020\u00022\u0006\u0010;\u001a\u00020/H\u0017J\u0018\u0010<\u001a\u00020\u00192\u0006\u0010\u000c\u001a\u00020\u00022\u0006\u0010=\u001a\u00020/H\u0017J\u001a\u0010>\u001a\u00020\u00192\u0006\u0010\u000c\u001a\u00020\u00022\u0008\u0010?\u001a\u0004\u0018\u00010\u0010H\u0017J\u0018\u0010@\u001a\u00020\u00192\u0006\u0010\u000c\u001a\u00020\u00022\u0006\u0010A\u001a\u00020/H\u0017J\u0018\u0010B\u001a\u00020\u00192\u0006\u0010\u000c\u001a\u00020\u00022\u0006\u0010C\u001a\u00020/H\u0017J\u0018\u0010D\u001a\u00020\u00192\u0006\u0010\u000c\u001a\u00020\u00022\u0006\u0010E\u001a\u00020/H\u0017J\u001a\u0010F\u001a\u00020\u00192\u0006\u0010\u000c\u001a\u00020\u00022\u0008\u0010G\u001a\u0004\u0018\u00010\u001eH\u0017J\u001a\u0010H\u001a\u00020\u00192\u0006\u0010\u000c\u001a\u00020\u00022\u0008\u0010I\u001a\u0004\u0018\u00010\u001eH\u0017J\u001c\u0010J\u001a\u00020\u00192\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u00022\u0008\u0010K\u001a\u0004\u0018\u00010\u001eH\u0016J\u001a\u0010L\u001a\u00020\u00192\u0006\u0010\u000c\u001a\u00020\u00022\u0008\u0010K\u001a\u0004\u0018\u00010MH\u0016R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00080\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006N"
    }
    d2 = {
        "Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;",
        "Lcom/facebook/react/uimanager/SimpleViewManager;",
        "Lcom/airbnb/lottie/LottieAnimationView;",
        "Lcom/facebook/react/viewmanagers/LottieAnimationViewManagerInterface;",
        "<init>",
        "()V",
        "propManagersMap",
        "Ljava/util/WeakHashMap;",
        "Lcom/airbnb/android/react/lottie/LottieAnimationViewPropertyManager;",
        "delegate",
        "Lcom/facebook/react/uimanager/ViewManagerDelegate;",
        "getOrCreatePropertyManager",
        "view",
        "getDelegate",
        "getExportedViewConstants",
        "",
        "",
        "",
        "getName",
        "createViewInstance",
        "context",
        "Lcom/facebook/react/uimanager/ThemedReactContext;",
        "getExportedCustomDirectEventTypeConstants",
        "",
        "onAfterUpdateTransaction",
        "",
        "receiveCommand",
        "root",
        "commandId",
        "args",
        "Lcom/facebook/react/bridge/ReadableArray;",
        "play",
        "startFrame",
        "",
        "endFrame",
        "reset",
        "pause",
        "resume",
        "setSourceName",
        "name",
        "setSourceJson",
        "json",
        "setSourceURL",
        "urlString",
        "setSourceDotLottieURI",
        "setCacheComposition",
        "cacheComposition",
        "",
        "setResizeMode",
        "resizeMode",
        "setRenderMode",
        "renderMode",
        "setProgress",
        "progress",
        "",
        "setSpeed",
        "speed",
        "",
        "setLoop",
        "loop",
        "setAutoPlay",
        "autoPlay",
        "setImageAssetsFolder",
        "imageAssetsFolder",
        "setEnableMergePathsAndroidForKitKatAndAbove",
        "enableMergePaths",
        "setEnableSafeModeAndroid",
        "enableSafeMode",
        "setHardwareAccelerationAndroid",
        "hardwareAccelerationAndroid",
        "setColorFilters",
        "colorFilters",
        "setTextFiltersAndroid",
        "textFilters",
        "setTextFiltersIOS",
        "value",
        "setDummy",
        "Lcom/facebook/react/bridge/ReadableMap;",
        "lottie-react-native_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final delegate:Lcom/facebook/react/uimanager/ViewManagerDelegate;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/react/uimanager/ViewManagerDelegate<",
            "Lcom/airbnb/lottie/LottieAnimationView;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final propManagersMap:Ljava/util/WeakHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/WeakHashMap<",
            "Lcom/airbnb/lottie/LottieAnimationView;",
            "Lcom/airbnb/android/react/lottie/LottieAnimationViewPropertyManager;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/facebook/react/uimanager/SimpleViewManager;-><init>()V

    .line 4
    .line 5
    new-instance v0, Ljava/util/WeakHashMap;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;->propManagersMap:Ljava/util/WeakHashMap;

    .line 11
    .line 12
    new-instance v0, Lcom/facebook/react/viewmanagers/LottieAnimationViewManagerDelegate;

    .line 13
    .line 14
    .line 15
    invoke-direct {v0, p0}, Lcom/facebook/react/viewmanagers/LottieAnimationViewManagerDelegate;-><init>(Lcom/facebook/react/uimanager/BaseViewManager;)V

    .line 16
    .line 17
    iput-object v0, p0, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;->delegate:Lcom/facebook/react/uimanager/ViewManagerDelegate;

    .line 18
    return-void
.end method

.method public static synthetic a(Lcom/airbnb/lottie/LottieAnimationView;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;->createViewInstance$lambda$0(Lcom/airbnb/lottie/LottieAnimationView;Ljava/lang/Throwable;)V

    .line 4
    return-void
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
    .line 24
    .line 25
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
.end method

.method public static synthetic b(Lcom/airbnb/lottie/LottieAnimationView;Lcom/airbnb/lottie/h;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;->createViewInstance$lambda$1(Lcom/airbnb/lottie/LottieAnimationView;Lcom/airbnb/lottie/h;)V

    .line 4
    return-void
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
    .line 24
    .line 25
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
.end method

.method private static final createViewInstance$lambda$0(Lcom/airbnb/lottie/LottieAnimationView;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0, p1}, Lcom/airbnb/android/react/lottie/LottieAnimationViewManagerImpl;->sendAnimationFailureEvent(Lcom/airbnb/lottie/LottieAnimationView;Ljava/lang/Throwable;)V

    .line 7
    return-void
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
    .line 24
    .line 25
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
.end method

.method private static final createViewInstance$lambda$1(Lcom/airbnb/lottie/LottieAnimationView;Lcom/airbnb/lottie/h;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/airbnb/android/react/lottie/LottieAnimationViewManagerImpl;->sendAnimationLoadedEvent(Lcom/airbnb/lottie/LottieAnimationView;)V

    .line 4
    return-void
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
    .line 24
    .line 25
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
.end method

.method private final getOrCreatePropertyManager(Lcom/airbnb/lottie/LottieAnimationView;)Lcom/airbnb/android/react/lottie/LottieAnimationViewPropertyManager;
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;->propManagersMap:Ljava/util/WeakHashMap;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/airbnb/android/react/lottie/LottieAnimationViewPropertyManager;

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    new-instance v0, Lcom/airbnb/android/react/lottie/LottieAnimationViewPropertyManager;

    .line 13
    .line 14
    .line 15
    invoke-direct {v0, p1}, Lcom/airbnb/android/react/lottie/LottieAnimationViewPropertyManager;-><init>(Lcom/airbnb/lottie/LottieAnimationView;)V

    .line 16
    .line 17
    iget-object v1, p0, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;->propManagersMap:Ljava/util/WeakHashMap;

    .line 18
    .line 19
    .line 20
    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    :cond_0
    return-object v0
    .line 22
    .line 23
.end method


# virtual methods
.method public bridge synthetic createViewInstance(Lcom/facebook/react/uimanager/ThemedReactContext;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;->createViewInstance(Lcom/facebook/react/uimanager/ThemedReactContext;)Lcom/airbnb/lottie/LottieAnimationView;

    move-result-object p1

    return-object p1
.end method

.method public createViewInstance(Lcom/facebook/react/uimanager/ThemedReactContext;)Lcom/airbnb/lottie/LottieAnimationView;
    .locals 1
    .param p1    # Lcom/facebook/react/uimanager/ThemedReactContext;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-static {p1}, Lcom/airbnb/android/react/lottie/LottieAnimationViewManagerImpl;->createViewInstance(Lcom/facebook/react/uimanager/ThemedReactContext;)Lcom/airbnb/lottie/LottieAnimationView;

    move-result-object p1

    .line 3
    new-instance v0, Lcom/airbnb/android/react/lottie/a;

    invoke-direct {v0, p1}, Lcom/airbnb/android/react/lottie/a;-><init>(Lcom/airbnb/lottie/LottieAnimationView;)V

    invoke-virtual {p1, v0}, Lcom/airbnb/lottie/LottieAnimationView;->setFailureListener(Lcom/airbnb/lottie/j0;)V

    .line 4
    new-instance v0, Lcom/airbnb/android/react/lottie/b;

    invoke-direct {v0, p1}, Lcom/airbnb/android/react/lottie/b;-><init>(Lcom/airbnb/lottie/LottieAnimationView;)V

    invoke-virtual {p1, v0}, Lcom/airbnb/lottie/LottieAnimationView;->addLottieOnCompositionLoadedListener(Lcom/airbnb/lottie/l0;)Z

    .line 5
    new-instance v0, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager$createViewInstance$3;

    invoke-direct {v0, p1}, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager$createViewInstance$3;-><init>(Lcom/airbnb/lottie/LottieAnimationView;)V

    invoke-virtual {p1, v0}, Lcom/airbnb/lottie/LottieAnimationView;->addAnimatorListener(Landroid/animation/Animator$AnimatorListener;)V

    return-object p1
.end method

.method public getDelegate()Lcom/facebook/react/uimanager/ViewManagerDelegate;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/facebook/react/uimanager/ViewManagerDelegate<",
            "Lcom/airbnb/lottie/LottieAnimationView;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;->delegate:Lcom/facebook/react/uimanager/ViewManagerDelegate;

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

.method public getExportedCustomDirectEventTypeConstants()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/airbnb/android/react/lottie/LottieAnimationViewManagerImpl;->getExportedCustomDirectEventTypeConstants()Ljava/util/Map;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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

.method public getExportedViewConstants()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/airbnb/android/react/lottie/LottieAnimationViewManagerImpl;->getExportedViewConstants()Ljava/util/Map;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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

.method public getName()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "LottieAnimationView"

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

.method public bridge synthetic onAfterUpdateTransaction(Landroid/view/View;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/airbnb/lottie/LottieAnimationView;

    invoke-virtual {p0, p1}, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;->onAfterUpdateTransaction(Lcom/airbnb/lottie/LottieAnimationView;)V

    return-void
.end method

.method public onAfterUpdateTransaction(Lcom/airbnb/lottie/LottieAnimationView;)V
    .locals 1
    .param p1    # Lcom/airbnb/lottie/LottieAnimationView;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string/jumbo v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-super {p0, p1}, Lcom/facebook/react/uimanager/BaseViewManager;->onAfterUpdateTransaction(Landroid/view/View;)V

    .line 3
    invoke-direct {p0, p1}, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;->getOrCreatePropertyManager(Lcom/airbnb/lottie/LottieAnimationView;)Lcom/airbnb/android/react/lottie/LottieAnimationViewPropertyManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/airbnb/android/react/lottie/LottieAnimationViewPropertyManager;->commitChanges()V

    return-void
.end method

.method public bridge synthetic pause(Landroid/view/View;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/airbnb/lottie/LottieAnimationView;

    invoke-virtual {p0, p1}, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;->pause(Lcom/airbnb/lottie/LottieAnimationView;)V

    return-void
.end method

.method public pause(Lcom/airbnb/lottie/LottieAnimationView;)V
    .locals 1
    .param p1    # Lcom/airbnb/lottie/LottieAnimationView;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string/jumbo v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-static {p1}, Lcom/airbnb/android/react/lottie/LottieAnimationViewManagerImpl;->pause(Lcom/airbnb/lottie/LottieAnimationView;)V

    return-void
.end method

.method public bridge synthetic play(Landroid/view/View;II)V
    .locals 0

    .line 1
    check-cast p1, Lcom/airbnb/lottie/LottieAnimationView;

    invoke-virtual {p0, p1, p2, p3}, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;->play(Lcom/airbnb/lottie/LottieAnimationView;II)V

    return-void
.end method

.method public play(Lcom/airbnb/lottie/LottieAnimationView;II)V
    .locals 1
    .param p1    # Lcom/airbnb/lottie/LottieAnimationView;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string/jumbo v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-static {p1, p2, p3}, Lcom/airbnb/android/react/lottie/LottieAnimationViewManagerImpl;->play(Lcom/airbnb/lottie/LottieAnimationView;II)V

    return-void
.end method

.method public bridge synthetic receiveCommand(Landroid/view/View;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/airbnb/lottie/LottieAnimationView;

    invoke-virtual {p0, p1, p2, p3}, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;->receiveCommand(Lcom/airbnb/lottie/LottieAnimationView;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V

    return-void
.end method

.method public receiveCommand(Lcom/airbnb/lottie/LottieAnimationView;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 1
    .param p1    # Lcom/airbnb/lottie/LottieAnimationView;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/facebook/react/bridge/ReadableArray;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string/jumbo v0, "root"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "commandId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;->delegate:Lcom/facebook/react/uimanager/ViewManagerDelegate;

    invoke-interface {v0, p1, p2, p3}, Lcom/facebook/react/uimanager/ViewManagerDelegate;->receiveCommand(Landroid/view/View;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V

    return-void
.end method

.method public bridge synthetic reset(Landroid/view/View;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/airbnb/lottie/LottieAnimationView;

    invoke-virtual {p0, p1}, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;->reset(Lcom/airbnb/lottie/LottieAnimationView;)V

    return-void
.end method

.method public reset(Lcom/airbnb/lottie/LottieAnimationView;)V
    .locals 1
    .param p1    # Lcom/airbnb/lottie/LottieAnimationView;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string/jumbo v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-static {p1}, Lcom/airbnb/android/react/lottie/LottieAnimationViewManagerImpl;->reset(Lcom/airbnb/lottie/LottieAnimationView;)V

    return-void
.end method

.method public bridge synthetic resume(Landroid/view/View;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/airbnb/lottie/LottieAnimationView;

    invoke-virtual {p0, p1}, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;->resume(Lcom/airbnb/lottie/LottieAnimationView;)V

    return-void
.end method

.method public resume(Lcom/airbnb/lottie/LottieAnimationView;)V
    .locals 1
    .param p1    # Lcom/airbnb/lottie/LottieAnimationView;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string/jumbo v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-static {p1}, Lcom/airbnb/android/react/lottie/LottieAnimationViewManagerImpl;->resume(Lcom/airbnb/lottie/LottieAnimationView;)V

    return-void
.end method

.method public bridge synthetic setAutoPlay(Landroid/view/View;Z)V
    .locals 0

    .line 1
    check-cast p1, Lcom/airbnb/lottie/LottieAnimationView;

    invoke-virtual {p0, p1, p2}, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;->setAutoPlay(Lcom/airbnb/lottie/LottieAnimationView;Z)V

    return-void
.end method

.method public setAutoPlay(Lcom/airbnb/lottie/LottieAnimationView;Z)V
    .locals 1
    .param p1    # Lcom/airbnb/lottie/LottieAnimationView;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "autoPlay"
    .end annotation

    const-string/jumbo v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0, p1}, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;->getOrCreatePropertyManager(Lcom/airbnb/lottie/LottieAnimationView;)Lcom/airbnb/android/react/lottie/LottieAnimationViewPropertyManager;

    move-result-object p1

    invoke-static {p2, p1}, Lcom/airbnb/android/react/lottie/LottieAnimationViewManagerImpl;->setAutoPlay(ZLcom/airbnb/android/react/lottie/LottieAnimationViewPropertyManager;)V

    return-void
.end method

.method public bridge synthetic setCacheComposition(Landroid/view/View;Z)V
    .locals 0

    .line 1
    check-cast p1, Lcom/airbnb/lottie/LottieAnimationView;

    invoke-virtual {p0, p1, p2}, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;->setCacheComposition(Lcom/airbnb/lottie/LottieAnimationView;Z)V

    return-void
.end method

.method public setCacheComposition(Lcom/airbnb/lottie/LottieAnimationView;Z)V
    .locals 1
    .param p1    # Lcom/airbnb/lottie/LottieAnimationView;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "cacheComposition"
    .end annotation

    const-string/jumbo v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-static {p1, p2}, Lcom/airbnb/android/react/lottie/LottieAnimationViewManagerImpl;->setCacheComposition(Lcom/airbnb/lottie/LottieAnimationView;Z)V

    return-void
.end method

.method public bridge synthetic setColorFilters(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/airbnb/lottie/LottieAnimationView;

    invoke-virtual {p0, p1, p2}, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;->setColorFilters(Lcom/airbnb/lottie/LottieAnimationView;Lcom/facebook/react/bridge/ReadableArray;)V

    return-void
.end method

.method public setColorFilters(Lcom/airbnb/lottie/LottieAnimationView;Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 1
    .param p1    # Lcom/airbnb/lottie/LottieAnimationView;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/facebook/react/bridge/ReadableArray;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "colorFilters"
    .end annotation

    const-string/jumbo v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0, p1}, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;->getOrCreatePropertyManager(Lcom/airbnb/lottie/LottieAnimationView;)Lcom/airbnb/android/react/lottie/LottieAnimationViewPropertyManager;

    move-result-object p1

    invoke-static {p2, p1}, Lcom/airbnb/android/react/lottie/LottieAnimationViewManagerImpl;->setColorFilters(Lcom/facebook/react/bridge/ReadableArray;Lcom/airbnb/android/react/lottie/LottieAnimationViewPropertyManager;)V

    return-void
.end method

.method public bridge synthetic setDummy(Landroid/view/View;Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 0

    .line 2
    check-cast p1, Lcom/airbnb/lottie/LottieAnimationView;

    invoke-virtual {p0, p1, p2}, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;->setDummy(Lcom/airbnb/lottie/LottieAnimationView;Lcom/facebook/react/bridge/ReadableMap;)V

    return-void
.end method

.method public setDummy(Lcom/airbnb/lottie/LottieAnimationView;Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 0
    .param p1    # Lcom/airbnb/lottie/LottieAnimationView;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/facebook/react/bridge/ReadableMap;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    const-string/jumbo p2, "view"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setEnableMergePathsAndroidForKitKatAndAbove(Landroid/view/View;Z)V
    .locals 0

    .line 1
    check-cast p1, Lcom/airbnb/lottie/LottieAnimationView;

    invoke-virtual {p0, p1, p2}, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;->setEnableMergePathsAndroidForKitKatAndAbove(Lcom/airbnb/lottie/LottieAnimationView;Z)V

    return-void
.end method

.method public setEnableMergePathsAndroidForKitKatAndAbove(Lcom/airbnb/lottie/LottieAnimationView;Z)V
    .locals 1
    .param p1    # Lcom/airbnb/lottie/LottieAnimationView;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "enableMergePathsAndroidForKitKatAndAbove"
    .end annotation

    const-string/jumbo v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0, p1}, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;->getOrCreatePropertyManager(Lcom/airbnb/lottie/LottieAnimationView;)Lcom/airbnb/android/react/lottie/LottieAnimationViewPropertyManager;

    move-result-object p1

    invoke-static {p2, p1}, Lcom/airbnb/android/react/lottie/LottieAnimationViewManagerImpl;->setEnableMergePaths(ZLcom/airbnb/android/react/lottie/LottieAnimationViewPropertyManager;)V

    return-void
.end method

.method public bridge synthetic setEnableSafeModeAndroid(Landroid/view/View;Z)V
    .locals 0

    .line 1
    check-cast p1, Lcom/airbnb/lottie/LottieAnimationView;

    invoke-virtual {p0, p1, p2}, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;->setEnableSafeModeAndroid(Lcom/airbnb/lottie/LottieAnimationView;Z)V

    return-void
.end method

.method public setEnableSafeModeAndroid(Lcom/airbnb/lottie/LottieAnimationView;Z)V
    .locals 1
    .param p1    # Lcom/airbnb/lottie/LottieAnimationView;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "enableSafeModeAndroid"
    .end annotation

    const-string/jumbo v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0, p1}, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;->getOrCreatePropertyManager(Lcom/airbnb/lottie/LottieAnimationView;)Lcom/airbnb/android/react/lottie/LottieAnimationViewPropertyManager;

    move-result-object p1

    invoke-static {p2, p1}, Lcom/airbnb/android/react/lottie/LottieAnimationViewManagerImpl;->setEnableSafeMode(ZLcom/airbnb/android/react/lottie/LottieAnimationViewPropertyManager;)V

    return-void
.end method

.method public bridge synthetic setHardwareAccelerationAndroid(Landroid/view/View;Z)V
    .locals 0

    .line 1
    check-cast p1, Lcom/airbnb/lottie/LottieAnimationView;

    invoke-virtual {p0, p1, p2}, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;->setHardwareAccelerationAndroid(Lcom/airbnb/lottie/LottieAnimationView;Z)V

    return-void
.end method

.method public setHardwareAccelerationAndroid(Lcom/airbnb/lottie/LottieAnimationView;Z)V
    .locals 1
    .param p1    # Lcom/airbnb/lottie/LottieAnimationView;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "hardwareAccelerationAndroid"
    .end annotation

    const-string/jumbo v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0, p1}, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;->getOrCreatePropertyManager(Lcom/airbnb/lottie/LottieAnimationView;)Lcom/airbnb/android/react/lottie/LottieAnimationViewPropertyManager;

    move-result-object p1

    invoke-static {p2, p1}, Lcom/airbnb/android/react/lottie/LottieAnimationViewManagerImpl;->setHardwareAcceleration(ZLcom/airbnb/android/react/lottie/LottieAnimationViewPropertyManager;)V

    return-void
.end method

.method public bridge synthetic setImageAssetsFolder(Landroid/view/View;Ljava/lang/String;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/airbnb/lottie/LottieAnimationView;

    invoke-virtual {p0, p1, p2}, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;->setImageAssetsFolder(Lcom/airbnb/lottie/LottieAnimationView;Ljava/lang/String;)V

    return-void
.end method

.method public setImageAssetsFolder(Lcom/airbnb/lottie/LottieAnimationView;Ljava/lang/String;)V
    .locals 1
    .param p1    # Lcom/airbnb/lottie/LottieAnimationView;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "imageAssetsFolder"
    .end annotation

    const-string/jumbo v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0, p1}, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;->getOrCreatePropertyManager(Lcom/airbnb/lottie/LottieAnimationView;)Lcom/airbnb/android/react/lottie/LottieAnimationViewPropertyManager;

    move-result-object p1

    invoke-static {p2, p1}, Lcom/airbnb/android/react/lottie/LottieAnimationViewManagerImpl;->setImageAssetsFolder(Ljava/lang/String;Lcom/airbnb/android/react/lottie/LottieAnimationViewPropertyManager;)V

    return-void
.end method

.method public bridge synthetic setLoop(Landroid/view/View;Z)V
    .locals 0

    .line 1
    check-cast p1, Lcom/airbnb/lottie/LottieAnimationView;

    invoke-virtual {p0, p1, p2}, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;->setLoop(Lcom/airbnb/lottie/LottieAnimationView;Z)V

    return-void
.end method

.method public setLoop(Lcom/airbnb/lottie/LottieAnimationView;Z)V
    .locals 1
    .param p1    # Lcom/airbnb/lottie/LottieAnimationView;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "loop"
    .end annotation

    const-string/jumbo v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0, p1}, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;->getOrCreatePropertyManager(Lcom/airbnb/lottie/LottieAnimationView;)Lcom/airbnb/android/react/lottie/LottieAnimationViewPropertyManager;

    move-result-object p1

    invoke-static {p2, p1}, Lcom/airbnb/android/react/lottie/LottieAnimationViewManagerImpl;->setLoop(ZLcom/airbnb/android/react/lottie/LottieAnimationViewPropertyManager;)V

    return-void
.end method

.method public bridge synthetic setProgress(Landroid/view/View;F)V
    .locals 0

    .line 1
    check-cast p1, Lcom/airbnb/lottie/LottieAnimationView;

    invoke-virtual {p0, p1, p2}, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;->setProgress(Lcom/airbnb/lottie/LottieAnimationView;F)V

    return-void
.end method

.method public setProgress(Lcom/airbnb/lottie/LottieAnimationView;F)V
    .locals 1
    .param p1    # Lcom/airbnb/lottie/LottieAnimationView;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "progress"
    .end annotation

    const-string/jumbo v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0, p1}, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;->getOrCreatePropertyManager(Lcom/airbnb/lottie/LottieAnimationView;)Lcom/airbnb/android/react/lottie/LottieAnimationViewPropertyManager;

    move-result-object p1

    invoke-static {p2, p1}, Lcom/airbnb/android/react/lottie/LottieAnimationViewManagerImpl;->setProgress(FLcom/airbnb/android/react/lottie/LottieAnimationViewPropertyManager;)V

    return-void
.end method

.method public bridge synthetic setRenderMode(Landroid/view/View;Ljava/lang/String;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/airbnb/lottie/LottieAnimationView;

    invoke-virtual {p0, p1, p2}, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;->setRenderMode(Lcom/airbnb/lottie/LottieAnimationView;Ljava/lang/String;)V

    return-void
.end method

.method public setRenderMode(Lcom/airbnb/lottie/LottieAnimationView;Ljava/lang/String;)V
    .locals 1
    .param p1    # Lcom/airbnb/lottie/LottieAnimationView;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "renderMode"
    .end annotation

    const-string/jumbo v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0, p1}, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;->getOrCreatePropertyManager(Lcom/airbnb/lottie/LottieAnimationView;)Lcom/airbnb/android/react/lottie/LottieAnimationViewPropertyManager;

    move-result-object p1

    invoke-static {p2, p1}, Lcom/airbnb/android/react/lottie/LottieAnimationViewManagerImpl;->setRenderMode(Ljava/lang/String;Lcom/airbnb/android/react/lottie/LottieAnimationViewPropertyManager;)V

    return-void
.end method

.method public bridge synthetic setResizeMode(Landroid/view/View;Ljava/lang/String;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/airbnb/lottie/LottieAnimationView;

    invoke-virtual {p0, p1, p2}, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;->setResizeMode(Lcom/airbnb/lottie/LottieAnimationView;Ljava/lang/String;)V

    return-void
.end method

.method public setResizeMode(Lcom/airbnb/lottie/LottieAnimationView;Ljava/lang/String;)V
    .locals 1
    .param p1    # Lcom/airbnb/lottie/LottieAnimationView;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "resizeMode"
    .end annotation

    const-string/jumbo v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0, p1}, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;->getOrCreatePropertyManager(Lcom/airbnb/lottie/LottieAnimationView;)Lcom/airbnb/android/react/lottie/LottieAnimationViewPropertyManager;

    move-result-object p1

    invoke-static {p2, p1}, Lcom/airbnb/android/react/lottie/LottieAnimationViewManagerImpl;->setResizeMode(Ljava/lang/String;Lcom/airbnb/android/react/lottie/LottieAnimationViewPropertyManager;)V

    return-void
.end method

.method public bridge synthetic setSourceDotLottieURI(Landroid/view/View;Ljava/lang/String;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/airbnb/lottie/LottieAnimationView;

    invoke-virtual {p0, p1, p2}, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;->setSourceDotLottieURI(Lcom/airbnb/lottie/LottieAnimationView;Ljava/lang/String;)V

    return-void
.end method

.method public setSourceDotLottieURI(Lcom/airbnb/lottie/LottieAnimationView;Ljava/lang/String;)V
    .locals 1
    .param p1    # Lcom/airbnb/lottie/LottieAnimationView;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "sourceDotLottieURI"
    .end annotation

    const-string/jumbo v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0, p1}, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;->getOrCreatePropertyManager(Lcom/airbnb/lottie/LottieAnimationView;)Lcom/airbnb/android/react/lottie/LottieAnimationViewPropertyManager;

    move-result-object p1

    invoke-static {p2, p1}, Lcom/airbnb/android/react/lottie/LottieAnimationViewManagerImpl;->setSourceDotLottieURI(Ljava/lang/String;Lcom/airbnb/android/react/lottie/LottieAnimationViewPropertyManager;)V

    return-void
.end method

.method public bridge synthetic setSourceJson(Landroid/view/View;Ljava/lang/String;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/airbnb/lottie/LottieAnimationView;

    invoke-virtual {p0, p1, p2}, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;->setSourceJson(Lcom/airbnb/lottie/LottieAnimationView;Ljava/lang/String;)V

    return-void
.end method

.method public setSourceJson(Lcom/airbnb/lottie/LottieAnimationView;Ljava/lang/String;)V
    .locals 1
    .param p1    # Lcom/airbnb/lottie/LottieAnimationView;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "sourceJson"
    .end annotation

    const-string/jumbo v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0, p1}, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;->getOrCreatePropertyManager(Lcom/airbnb/lottie/LottieAnimationView;)Lcom/airbnb/android/react/lottie/LottieAnimationViewPropertyManager;

    move-result-object p1

    invoke-static {p2, p1}, Lcom/airbnb/android/react/lottie/LottieAnimationViewManagerImpl;->setSourceJson(Ljava/lang/String;Lcom/airbnb/android/react/lottie/LottieAnimationViewPropertyManager;)V

    return-void
.end method

.method public bridge synthetic setSourceName(Landroid/view/View;Ljava/lang/String;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/airbnb/lottie/LottieAnimationView;

    invoke-virtual {p0, p1, p2}, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;->setSourceName(Lcom/airbnb/lottie/LottieAnimationView;Ljava/lang/String;)V

    return-void
.end method

.method public setSourceName(Lcom/airbnb/lottie/LottieAnimationView;Ljava/lang/String;)V
    .locals 1
    .param p1    # Lcom/airbnb/lottie/LottieAnimationView;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "sourceName"
    .end annotation

    const-string/jumbo v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0, p1}, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;->getOrCreatePropertyManager(Lcom/airbnb/lottie/LottieAnimationView;)Lcom/airbnb/android/react/lottie/LottieAnimationViewPropertyManager;

    move-result-object p1

    invoke-static {p2, p1}, Lcom/airbnb/android/react/lottie/LottieAnimationViewManagerImpl;->setSourceName(Ljava/lang/String;Lcom/airbnb/android/react/lottie/LottieAnimationViewPropertyManager;)V

    return-void
.end method

.method public bridge synthetic setSourceURL(Landroid/view/View;Ljava/lang/String;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/airbnb/lottie/LottieAnimationView;

    invoke-virtual {p0, p1, p2}, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;->setSourceURL(Lcom/airbnb/lottie/LottieAnimationView;Ljava/lang/String;)V

    return-void
.end method

.method public setSourceURL(Lcom/airbnb/lottie/LottieAnimationView;Ljava/lang/String;)V
    .locals 1
    .param p1    # Lcom/airbnb/lottie/LottieAnimationView;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "sourceURL"
    .end annotation

    const-string/jumbo v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0, p1}, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;->getOrCreatePropertyManager(Lcom/airbnb/lottie/LottieAnimationView;)Lcom/airbnb/android/react/lottie/LottieAnimationViewPropertyManager;

    move-result-object p1

    invoke-static {p2, p1}, Lcom/airbnb/android/react/lottie/LottieAnimationViewManagerImpl;->setSourceURL(Ljava/lang/String;Lcom/airbnb/android/react/lottie/LottieAnimationViewPropertyManager;)V

    return-void
.end method

.method public bridge synthetic setSpeed(Landroid/view/View;D)V
    .locals 0

    .line 1
    check-cast p1, Lcom/airbnb/lottie/LottieAnimationView;

    invoke-virtual {p0, p1, p2, p3}, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;->setSpeed(Lcom/airbnb/lottie/LottieAnimationView;D)V

    return-void
.end method

.method public setSpeed(Lcom/airbnb/lottie/LottieAnimationView;D)V
    .locals 1
    .param p1    # Lcom/airbnb/lottie/LottieAnimationView;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "speed"
    .end annotation

    const-string/jumbo v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0, p1}, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;->getOrCreatePropertyManager(Lcom/airbnb/lottie/LottieAnimationView;)Lcom/airbnb/android/react/lottie/LottieAnimationViewPropertyManager;

    move-result-object p1

    invoke-static {p2, p3, p1}, Lcom/airbnb/android/react/lottie/LottieAnimationViewManagerImpl;->setSpeed(DLcom/airbnb/android/react/lottie/LottieAnimationViewPropertyManager;)V

    return-void
.end method

.method public bridge synthetic setTextFiltersAndroid(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/airbnb/lottie/LottieAnimationView;

    invoke-virtual {p0, p1, p2}, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;->setTextFiltersAndroid(Lcom/airbnb/lottie/LottieAnimationView;Lcom/facebook/react/bridge/ReadableArray;)V

    return-void
.end method

.method public setTextFiltersAndroid(Lcom/airbnb/lottie/LottieAnimationView;Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 1
    .param p1    # Lcom/airbnb/lottie/LottieAnimationView;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/facebook/react/bridge/ReadableArray;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "textFiltersAndroid"
    .end annotation

    const-string/jumbo v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0, p1}, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;->getOrCreatePropertyManager(Lcom/airbnb/lottie/LottieAnimationView;)Lcom/airbnb/android/react/lottie/LottieAnimationViewPropertyManager;

    move-result-object p1

    invoke-static {p2, p1}, Lcom/airbnb/android/react/lottie/LottieAnimationViewManagerImpl;->setTextFilters(Lcom/facebook/react/bridge/ReadableArray;Lcom/airbnb/android/react/lottie/LottieAnimationViewPropertyManager;)V

    return-void
.end method

.method public bridge synthetic setTextFiltersIOS(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 0

    .line 2
    check-cast p1, Lcom/airbnb/lottie/LottieAnimationView;

    invoke-virtual {p0, p1, p2}, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;->setTextFiltersIOS(Lcom/airbnb/lottie/LottieAnimationView;Lcom/facebook/react/bridge/ReadableArray;)V

    return-void
.end method

.method public setTextFiltersIOS(Lcom/airbnb/lottie/LottieAnimationView;Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 0
    .param p1    # Lcom/airbnb/lottie/LottieAnimationView;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/facebook/react/bridge/ReadableArray;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    return-void
.end method
