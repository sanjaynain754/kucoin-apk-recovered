.class public final Lcom/sumsub/sns/internal/features/presentation/camera/video/w;
.super Landroid/os/CountDownTimer;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public final synthetic a:Lcom/sumsub/sns/internal/features/presentation/camera/video/G;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/presentation/camera/video/G;)V
    .locals 4

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/video/w;->a:Lcom/sumsub/sns/internal/features/presentation/camera/video/G;

    .line 3
    .line 4
    const-wide/16 v0, 0x1db0

    .line 5
    .line 6
    const-wide/16 v2, 0x32

    .line 7
    .line 8
    .line 9
    invoke-direct {p0, v0, v1, v2, v3}, Landroid/os/CountDownTimer;-><init>(JJ)V

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
    .line 24
    .line 25
.end method


# virtual methods
.method public final onFinish()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/video/w;->a:Lcom/sumsub/sns/internal/features/presentation/camera/video/G;

    .line 3
    .line 4
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/camera/video/m;

    .line 5
    .line 6
    sget-object v2, Lcom/sumsub/sns/internal/features/presentation/camera/video/SNSVideoSelfieViewModel$State;->Recording:Lcom/sumsub/sns/internal/features/presentation/camera/video/SNSVideoSelfieViewModel$State;

    .line 7
    .line 8
    .line 9
    invoke-direct {v1, v2}, Lcom/sumsub/sns/internal/features/presentation/camera/video/m;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/video/SNSVideoSelfieViewModel$State;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lcom/sumsub/sns/internal/features/presentation/camera/video/G;->fireEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    .line 13
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public final onTick(J)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/video/w;->a:Lcom/sumsub/sns/internal/features/presentation/camera/video/G;

    .line 3
    .line 4
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/camera/video/n;

    .line 5
    .line 6
    sget-object v2, Lcom/sumsub/sns/internal/features/presentation/camera/video/SNSVideoSelfieViewModel$State;->Recording:Lcom/sumsub/sns/internal/features/presentation/camera/video/SNSVideoSelfieViewModel$State;

    .line 7
    .line 8
    .line 9
    invoke-direct {v1, v2, p1, p2}, Lcom/sumsub/sns/internal/features/presentation/camera/video/n;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/video/SNSVideoSelfieViewModel$State;J)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lcom/sumsub/sns/internal/features/presentation/camera/video/G;->fireEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    .line 13
    return-void
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
