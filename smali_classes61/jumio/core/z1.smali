.class public final Ljumio/core/z1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jumio/core/performance/FrameRateCallback;


# instance fields
.field public final a:Lcom/jumio/core/performance/FrameRateCallback;

.field public final b:Ljava/util/ArrayList;

.field public final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/jumio/core/performance/FrameRateCallback;)V
    .locals 1

    .line 1
    .line 2
    const-string v0, "originalCallback"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    iput-object p1, p0, Ljumio/core/z1;->a:Lcom/jumio/core/performance/FrameRateCallback;

    .line 11
    .line 12
    new-instance p1, Ljava/util/ArrayList;

    .line 13
    .line 14
    .line 15
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 16
    .line 17
    iput-object p1, p0, Ljumio/core/z1;->b:Ljava/util/ArrayList;

    .line 18
    .line 19
    new-instance p1, Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    iput-object p1, p0, Ljumio/core/z1;->c:Ljava/lang/Object;

    .line 25
    return-void
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method


# virtual methods
.method public final onFramesSampled(I)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Ljumio/core/z1;->c:Ljava/lang/Object;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    :try_start_0
    iget-object v1, p0, Ljumio/core/z1;->b:Ljava/util/ArrayList;

    .line 6
    .line 7
    .line 8
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 9
    move-result-object v2

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    monitor-exit v0

    .line 14
    .line 15
    iget-object v0, p0, Ljumio/core/z1;->a:Lcom/jumio/core/performance/FrameRateCallback;

    .line 16
    .line 17
    .line 18
    invoke-interface {v0, p1}, Lcom/jumio/core/performance/FrameRateCallback;->onFramesSampled(I)V

    .line 19
    return-void

    .line 20
    :catchall_0
    move-exception p1

    .line 21
    monitor-exit v0

    .line 22
    throw p1
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method
