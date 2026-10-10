.class public final Lcom/sumsub/sns/internal/features/presentation/prooface/d0;
.super Ljava/util/TimerTask;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public final synthetic a:Lcom/sumsub/sns/internal/features/presentation/prooface/k0;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/presentation/prooface/k0;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/d0;->a:Lcom/sumsub/sns/internal/features/presentation/prooface/k0;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

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
    .line 25
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/d0;->a:Lcom/sumsub/sns/internal/features/presentation/prooface/k0;

    .line 3
    .line 4
    iget-object v1, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->k:Ljava/util/Timer;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    new-instance v1, Ljava/util/Timer;

    .line 9
    .line 10
    .line 11
    invoke-direct {v1}, Ljava/util/Timer;-><init>()V

    .line 12
    .line 13
    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/prooface/f0;

    .line 14
    .line 15
    .line 16
    invoke-direct {v2, v0}, Lcom/sumsub/sns/internal/features/presentation/prooface/f0;-><init>(Lcom/sumsub/sns/internal/features/presentation/prooface/k0;)V

    .line 17
    .line 18
    sget-object v3, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 19
    .line 20
    const-wide/16 v4, 0x2

    .line 21
    .line 22
    .line 23
    invoke-virtual {v3, v4, v5}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 24
    move-result-wide v3

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, v2, v3, v4}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    .line 28
    .line 29
    iput-object v1, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->k:Ljava/util/Timer;

    .line 30
    :cond_0
    return-void
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
.end method
