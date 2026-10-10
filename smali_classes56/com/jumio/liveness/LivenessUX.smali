.class public final Lcom/jumio/liveness/LivenessUX;
.super Ljava/lang/Object;
.source "LivenessUX.kt"

# interfaces
.implements Ljava/lang/AutoCloseable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/jumio/liveness/LivenessUX$Companion;,
        Lcom/jumio/liveness/LivenessUX$EventHandler;,
        Lcom/jumio/liveness/LivenessUX$RunHandler;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010\u000b\n\u0002\u0008\u0008\u0018\u0000 \u001f2\u00060\u0001j\u0002`\u0002:\u0003\u001d\u001e\u001fB\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0013\u0010\u0007\u001a\u00020\u00082\u0008\u0010\t\u001a\u0004\u0018\u00010\nH\u0086 J\u0013\u0010\u000b\u001a\u00020\u00082\u0008\u0010\u000c\u001a\u0004\u0018\u00010\rH\u0086 J\t\u0010\u000e\u001a\u00020\u0008H\u0086 J\u0011\u0010\u000f\u001a\u00020\u00082\u0006\u0010\u0010\u001a\u00020\u0004H\u0082 J\t\u0010\u0011\u001a\u00020\u0008H\u0086 J\u0011\u0010\u0012\u001a\u00020\u00082\u0006\u0010\u0013\u001a\u00020\u0004H\u0086 J\t\u0010\u0014\u001a\u00020\u0008H\u0086 J\u0011\u0010\u0015\u001a\u00020\u00082\u0006\u0010\u0010\u001a\u00020\u0004H\u0082 J\t\u0010\u0016\u001a\u00020\u0008H\u0096 J\u000e\u0010\u000b\u001a\u00020\u0008H\u0086@\u00a2\u0006\u0002\u0010\u001aJ\u0008\u0010\u000f\u001a\u00020\u0008H\u0007J\u0016\u0010\u000f\u001a\u00020\u00082\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0018R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0017\u001a\u00020\u00188F\u00a2\u0006\u0006\u001a\u0004\u0008\u0017\u0010\u0019\u00a8\u0006 "
    }
    d2 = {
        "Lcom/jumio/liveness/LivenessUX;",
        "Ljava/lang/AutoCloseable;",
        "Lkotlin/AutoCloseable;",
        "ptr",
        "",
        "<init>",
        "(J)V",
        "setEventHandler",
        "",
        "eventHandler",
        "Lcom/jumio/liveness/LivenessUX$EventHandler;",
        "run",
        "handler",
        "Lcom/jumio/liveness/LivenessUX$RunHandler;",
        "cancel",
        "onBeforeFrame",
        "timestampMillis",
        "onAfterFrame",
        "onReceiveNativeEvent",
        "nativeEvent",
        "confirmColorChange",
        "onVSync",
        "close",
        "isClosed",
        "",
        "()Z",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "timestampNanos",
        "isRealtime",
        "EventHandler",
        "RunHandler",
        "Companion",
        "dasdk_withoutAssetsRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lcom/jumio/liveness/LivenessUX$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field private final ptr:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/jumio/liveness/LivenessUX$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/jumio/liveness/LivenessUX$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/jumio/liveness/LivenessUX;->Companion:Lcom/jumio/liveness/LivenessUX$Companion;

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lcom/jumio/liveness/LivenessUX$Companion;->access$loadType(Lcom/jumio/liveness/LivenessUX$Companion;)V

    .line 12
    return-void
    .line 13
    .line 14
    .line 15
    .line 16
.end method

.method private constructor <init>(J)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-wide p1, p0, Lcom/jumio/liveness/LivenessUX;->ptr:J

    .line 6
    return-void
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
.end method

.method public static final synthetic access$getPtr$p(Lcom/jumio/liveness/LivenessUX;)J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/jumio/liveness/LivenessUX;->ptr:J

    .line 3
    return-wide v0
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
    .line 24
.end method

.method public static final synthetic access$loadType()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/jumio/liveness/LivenessUX;->loadType()V

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
.end method

.method public static final synthetic access$onVSync(Lcom/jumio/liveness/LivenessUX;J)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Lcom/jumio/liveness/LivenessUX;->onVSync(J)V

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
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
.end method

.method public static final native create(Lcom/jumio/liveness/PremiumLivenessConfigurations;)Lcom/jumio/liveness/LivenessUX;
    .param p0    # Lcom/jumio/liveness/PremiumLivenessConfigurations;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public static final native create(Lcom/jumio/liveness/StandardLivenessConfigurations;)Lcom/jumio/liveness/LivenessUX;
    .param p0    # Lcom/jumio/liveness/StandardLivenessConfigurations;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method private static final native loadType()V
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation
.end method

.method private final native onBeforeFrame(J)V
.end method

.method private final native onVSync(J)V
.end method


# virtual methods
.method public final native cancel()V
.end method

.method public native close()V
.end method

.method public final native confirmColorChange()V
.end method

.method public final isClosed()Z
    .locals 4

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/jumio/liveness/LivenessUX;->ptr:J

    .line 3
    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    cmp-long v0, v0, v2

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
    .line 13
    .line 14
    .line 15
    .line 16
.end method

.method public final native onAfterFrame()V
.end method

.method public final onBeforeFrame()V
    .locals 2
    .annotation runtime Lkotlin/Deprecated;
        message = "Integrate onBeforeFrame(timestampNanos: Long, isRealtime: Boolean) instead to enable future Photinus improvements"
    .end annotation

    const-wide/16 v0, -0x1

    .line 1
    invoke-direct {p0, v0, v1}, Lcom/jumio/liveness/LivenessUX;->onBeforeFrame(J)V

    return-void
.end method

.method public final onBeforeFrame(JZ)V
    .locals 4

    const v0, 0xf4240

    int-to-long v0, v0

    .line 2
    div-long/2addr p1, v0

    if-eqz p3, :cond_0

    .line 3
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v2

    sub-long/2addr v0, v2

    sub-long/2addr p1, v0

    .line 4
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/jumio/liveness/LivenessUX;->onBeforeFrame(J)V

    return-void
.end method

.method public final native onReceiveNativeEvent(J)V
.end method

.method public final run(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .param p1    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    invoke-static {}, Lkotlinx/coroutines/z0;->c()Lkotlinx/coroutines/e2;

    move-result-object v0

    new-instance v1, Lcom/jumio/liveness/LivenessUX$run$2;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/jumio/liveness/LivenessUX$run$2;-><init>(Lcom/jumio/liveness/LivenessUX;Lkotlin/coroutines/Continuation;)V

    invoke-static {v0, v1, p1}, Lkotlinx/coroutines/h;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final native run(Lcom/jumio/liveness/LivenessUX$RunHandler;)V
    .param p1    # Lcom/jumio/liveness/LivenessUX$RunHandler;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
.end method

.method public final native setEventHandler(Lcom/jumio/liveness/LivenessUX$EventHandler;)V
    .param p1    # Lcom/jumio/liveness/LivenessUX$EventHandler;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
.end method
