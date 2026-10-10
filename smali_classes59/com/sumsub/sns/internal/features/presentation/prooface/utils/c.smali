.class public final Lcom/sumsub/sns/internal/features/presentation/prooface/utils/c;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public final a:Lcom/sumsub/sns/internal/core/domain/facedetector/e;

.field public final b:Lcom/sumsub/sns/internal/features/presentation/prooface/A1;

.field public final c:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/core/domain/facedetector/e;Lcom/sumsub/sns/internal/features/presentation/prooface/A1;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/c;->a:Lcom/sumsub/sns/internal/core/domain/facedetector/e;

    .line 6
    .line 7
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/c;->b:Lcom/sumsub/sns/internal/features/presentation/prooface/A1;

    .line 8
    .line 9
    new-instance p1, Landroid/os/Handler;

    .line 10
    .line 11
    .line 12
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 13
    move-result-object p2

    .line 14
    .line 15
    .line 16
    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 17
    .line 18
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/c;->c:Landroid/os/Handler;

    .line 19
    return-void
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
.end method

.method public static final a(JJLkotlin/jvm/functions/Function0;Lcom/sumsub/sns/internal/features/presentation/prooface/utils/c;)Lkotlin/Unit;
    .locals 2

    .line 12
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    sub-long/2addr v0, p0

    cmp-long p0, v0, p2

    if-ltz p0, :cond_0

    .line 13
    invoke-interface {p4}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    goto :goto_0

    .line 14
    :cond_0
    iget-object p0, p5, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/c;->c:Landroid/os/Handler;

    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/i;

    invoke-direct {p1, p4}, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/i;-><init>(Lkotlin/jvm/functions/Function0;)V

    sub-long/2addr p2, v0

    invoke-virtual {p0, p1, p2, p3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 15
    :goto_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final a(Landroidx/camera/core/ImageProxy;)Lkotlin/Unit;
    .locals 0

    .line 9
    invoke-interface {p0}, Landroidx/camera/core/ImageProxy;->close()V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final a(Lkotlin/jvm/functions/Function0;)V
    .locals 0

    .line 16
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(JLkotlin/jvm/functions/Function0;)Lkotlin/jvm/functions/Function0;
    .locals 7

    .line 10
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v1

    .line 11
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/h;

    move-object v6, p0

    move-wide v3, p1

    move-object v5, p3

    invoke-direct/range {v0 .. v6}, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/h;-><init>(JJLkotlin/jvm/functions/Function0;Lcom/sumsub/sns/internal/features/presentation/prooface/utils/c;)V

    return-object v0
.end method

.method public final a(Landroidx/camera/core/ImageProxy;Lkotlin/jvm/functions/Function1;)V
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/c;->a:Lcom/sumsub/sns/internal/core/domain/facedetector/e;

    .line 2
    iget-wide v0, v0, Lcom/sumsub/sns/internal/core/domain/facedetector/e;->c:J

    .line 3
    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/g;

    invoke-direct {v2, p1}, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/g;-><init>(Landroidx/camera/core/ImageProxy;)V

    invoke-virtual {p0, v0, v1, v2}, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/c;->a(JLkotlin/jvm/functions/Function0;)Lkotlin/jvm/functions/Function0;

    move-result-object v0

    .line 4
    invoke-interface {p2, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p2

    .line 5
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/c;->b:Lcom/sumsub/sns/internal/features/presentation/prooface/A1;

    .line 6
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/A1;->a:Lcom/sumsub/sns/internal/features/presentation/prooface/c2;

    .line 7
    invoke-virtual {v0, p2}, Lcom/sumsub/sns/internal/features/presentation/prooface/c2;->a(Ljava/lang/Throwable;)V

    .line 8
    invoke-interface {p1}, Landroidx/camera/core/ImageProxy;->close()V

    return-void
.end method
