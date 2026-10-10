.class public final Lcom/facebook/react/uimanager/DisplayMetricsHolder;
.super Ljava/lang/Object;
.source "DisplayMetricsHolder.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0002\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0008\u0010\u000b\u001a\u00020\u0007H\u0007J\u0012\u0010\u000c\u001a\u00020\r2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0007J\u0008\u0010\u000f\u001a\u00020\u0007H\u0007J\u0012\u0010\u0010\u001a\u00020\r2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0007J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J\u0010\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0007J\u0018\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0018H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0008\n\u0000\u0012\u0004\u0008\u0008\u0010\u0003R\u001a\u0010\t\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0008\n\u0000\u0012\u0004\u0008\n\u0010\u0003\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/facebook/react/uimanager/DisplayMetricsHolder;",
        "",
        "<init>",
        "()V",
        "INITIALIZATION_MISSING_MESSAGE",
        "",
        "windowDisplayMetrics",
        "Landroid/util/DisplayMetrics;",
        "getWindowDisplayMetrics$annotations",
        "screenDisplayMetrics",
        "getScreenDisplayMetrics$annotations",
        "getWindowDisplayMetrics",
        "setWindowDisplayMetrics",
        "",
        "displayMetrics",
        "getScreenDisplayMetrics",
        "setScreenDisplayMetrics",
        "initDisplayMetricsIfNotInitialized",
        "context",
        "Landroid/content/Context;",
        "initDisplayMetrics",
        "getDisplayMetricsWritableMap",
        "Lcom/facebook/react/bridge/WritableMap;",
        "fontScale",
        "",
        "getPhysicalPixelsWritableMap",
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
        "SMAP\nDisplayMetricsHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DisplayMetricsHolder.kt\ncom/facebook/react/uimanager/DisplayMetricsHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,103:1\n1#2:104\n*E\n"
    }
.end annotation


# static fields
.field private static final INITIALIZATION_MISSING_MESSAGE:Ljava/lang/String; = "DisplayMetricsHolder must be initialized with initDisplayMetricsIfNotInitialized or initDisplayMetrics"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final INSTANCE:Lcom/facebook/react/uimanager/DisplayMetricsHolder;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static screenDisplayMetrics:Landroid/util/DisplayMetrics;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private static windowDisplayMetrics:Landroid/util/DisplayMetrics;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/react/uimanager/DisplayMetricsHolder;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/facebook/react/uimanager/DisplayMetricsHolder;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/facebook/react/uimanager/DisplayMetricsHolder;->INSTANCE:Lcom/facebook/react/uimanager/DisplayMetricsHolder;

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
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method

.method public static final getDisplayMetricsWritableMap(D)Lcom/facebook/react/bridge/WritableMap;
    .locals 5
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/facebook/react/uimanager/DisplayMetricsHolder;->windowDisplayMetrics:Landroid/util/DisplayMetrics;

    .line 3
    .line 4
    const-string v1, "DisplayMetricsHolder must be initialized with initDisplayMetricsIfNotInitialized or initDisplayMetrics"

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    sget-object v0, Lcom/facebook/react/uimanager/DisplayMetricsHolder;->screenDisplayMetrics:Landroid/util/DisplayMetrics;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    new-instance v0, Lcom/facebook/react/bridge/WritableNativeMap;

    .line 13
    .line 14
    .line 15
    invoke-direct {v0}, Lcom/facebook/react/bridge/WritableNativeMap;-><init>()V

    .line 16
    .line 17
    sget-object v1, Lcom/facebook/react/uimanager/DisplayMetricsHolder;->INSTANCE:Lcom/facebook/react/uimanager/DisplayMetricsHolder;

    .line 18
    .line 19
    sget-object v2, Lcom/facebook/react/uimanager/DisplayMetricsHolder;->windowDisplayMetrics:Landroid/util/DisplayMetrics;

    .line 20
    .line 21
    const-string v3, "null cannot be cast to non-null type android.util.DisplayMetrics"

    .line 22
    .line 23
    .line 24
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-direct {v1, v2, p0, p1}, Lcom/facebook/react/uimanager/DisplayMetricsHolder;->getPhysicalPixelsWritableMap(Landroid/util/DisplayMetrics;D)Lcom/facebook/react/bridge/WritableMap;

    .line 28
    move-result-object v2

    .line 29
    .line 30
    .line 31
    const-string/jumbo v4, "windowPhysicalPixels"

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v4, v2}, Lcom/facebook/react/bridge/WritableNativeMap;->putMap(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 35
    .line 36
    sget-object v2, Lcom/facebook/react/uimanager/DisplayMetricsHolder;->screenDisplayMetrics:Landroid/util/DisplayMetrics;

    .line 37
    .line 38
    .line 39
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-direct {v1, v2, p0, p1}, Lcom/facebook/react/uimanager/DisplayMetricsHolder;->getPhysicalPixelsWritableMap(Landroid/util/DisplayMetrics;D)Lcom/facebook/react/bridge/WritableMap;

    .line 43
    move-result-object p0

    .line 44
    .line 45
    .line 46
    const-string/jumbo p1, "screenPhysicalPixels"

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, p1, p0}, Lcom/facebook/react/bridge/WritableNativeMap;->putMap(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 50
    return-object v0

    .line 51
    .line 52
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 53
    .line 54
    .line 55
    invoke-direct {p0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 56
    throw p0

    .line 57
    .line 58
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 59
    .line 60
    .line 61
    invoke-direct {p0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 62
    throw p0
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

.method private final getPhysicalPixelsWritableMap(Landroid/util/DisplayMetrics;D)Lcom/facebook/react/bridge/WritableMap;
    .locals 4

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/react/bridge/WritableNativeMap;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/facebook/react/bridge/WritableNativeMap;-><init>()V

    .line 6
    .line 7
    iget v1, p1, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 8
    .line 9
    .line 10
    const-string/jumbo v2, "width"

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v2, v1}, Lcom/facebook/react/bridge/WritableNativeMap;->putInt(Ljava/lang/String;I)V

    .line 14
    .line 15
    const-string v1, "height"

    .line 16
    .line 17
    iget v2, p1, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1, v2}, Lcom/facebook/react/bridge/WritableNativeMap;->putInt(Ljava/lang/String;I)V

    .line 21
    .line 22
    iget v1, p1, Landroid/util/DisplayMetrics;->density:F

    .line 23
    float-to-double v1, v1

    .line 24
    .line 25
    .line 26
    const-string/jumbo v3, "scale"

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v3, v1, v2}, Lcom/facebook/react/bridge/WritableNativeMap;->putDouble(Ljava/lang/String;D)V

    .line 30
    .line 31
    const-string v1, "fontScale"

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v1, p2, p3}, Lcom/facebook/react/bridge/WritableNativeMap;->putDouble(Ljava/lang/String;D)V

    .line 35
    .line 36
    iget p1, p1, Landroid/util/DisplayMetrics;->densityDpi:I

    .line 37
    int-to-double p1, p1

    .line 38
    .line 39
    const-string p3, "densityDpi"

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, p3, p1, p2}, Lcom/facebook/react/bridge/WritableNativeMap;->putDouble(Ljava/lang/String;D)V

    .line 43
    return-object v0
    .line 44
    .line 45
.end method

.method public static final getScreenDisplayMetrics()Landroid/util/DisplayMetrics;
    .locals 2
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/facebook/react/uimanager/DisplayMetricsHolder;->screenDisplayMetrics:Landroid/util/DisplayMetrics;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    const-string v1, "null cannot be cast to non-null type android.util.DisplayMetrics"

    .line 7
    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    return-object v0

    .line 11
    .line 12
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 13
    .line 14
    const-string v1, "DisplayMetricsHolder must be initialized with initDisplayMetricsIfNotInitialized or initDisplayMetrics"

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 18
    throw v0
.end method

.method private static synthetic getScreenDisplayMetrics$annotations()V
    .locals 0
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 1
    return-void
    .line 2
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

.method public static final getWindowDisplayMetrics()Landroid/util/DisplayMetrics;
    .locals 2
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/facebook/react/uimanager/DisplayMetricsHolder;->windowDisplayMetrics:Landroid/util/DisplayMetrics;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    const-string v1, "null cannot be cast to non-null type android.util.DisplayMetrics"

    .line 7
    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    return-object v0

    .line 11
    .line 12
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 13
    .line 14
    const-string v1, "DisplayMetricsHolder must be initialized with initDisplayMetricsIfNotInitialized or initDisplayMetrics"

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 18
    throw v0
.end method

.method private static synthetic getWindowDisplayMetrics$annotations()V
    .locals 0
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 1
    return-void
    .line 2
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

.method public static final initDisplayMetrics(Landroid/content/Context;)V
    .locals 2
    .param p0    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 1
    .line 2
    const-string v0, "context"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    sput-object v0, Lcom/facebook/react/uimanager/DisplayMetricsHolder;->windowDisplayMetrics:Landroid/util/DisplayMetrics;

    .line 16
    .line 17
    new-instance v1, Landroid/util/DisplayMetrics;

    .line 18
    .line 19
    .line 20
    invoke-direct {v1}, Landroid/util/DisplayMetrics;-><init>()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, v0}, Landroid/util/DisplayMetrics;->setTo(Landroid/util/DisplayMetrics;)V

    .line 24
    .line 25
    .line 26
    const-string/jumbo v0, "window"

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 30
    move-result-object p0

    .line 31
    .line 32
    const-string v0, "null cannot be cast to non-null type android.view.WindowManager"

    .line 33
    .line 34
    .line 35
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    .line 37
    check-cast p0, Landroid/view/WindowManager;

    .line 38
    .line 39
    .line 40
    invoke-interface {p0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 41
    move-result-object p0

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0, v1}, Landroid/view/Display;->getRealMetrics(Landroid/util/DisplayMetrics;)V

    .line 45
    .line 46
    sput-object v1, Lcom/facebook/react/uimanager/DisplayMetricsHolder;->screenDisplayMetrics:Landroid/util/DisplayMetrics;

    .line 47
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

.method public static final initDisplayMetricsIfNotInitialized(Landroid/content/Context;)V
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 1
    .line 2
    const-string v0, "context"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Lcom/facebook/react/uimanager/DisplayMetricsHolder;->screenDisplayMetrics:Landroid/util/DisplayMetrics;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    return-void

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-static {p0}, Lcom/facebook/react/uimanager/DisplayMetricsHolder;->initDisplayMetrics(Landroid/content/Context;)V

    .line 14
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

.method public static final setScreenDisplayMetrics(Landroid/util/DisplayMetrics;)V
    .locals 0
    .param p0    # Landroid/util/DisplayMetrics;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 1
    .line 2
    sput-object p0, Lcom/facebook/react/uimanager/DisplayMetricsHolder;->screenDisplayMetrics:Landroid/util/DisplayMetrics;

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

.method public static final setWindowDisplayMetrics(Landroid/util/DisplayMetrics;)V
    .locals 0
    .param p0    # Landroid/util/DisplayMetrics;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 1
    .line 2
    sput-object p0, Lcom/facebook/react/uimanager/DisplayMetricsHolder;->windowDisplayMetrics:Landroid/util/DisplayMetrics;

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
