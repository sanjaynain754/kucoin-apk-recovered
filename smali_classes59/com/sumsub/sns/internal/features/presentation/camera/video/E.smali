.class public final Lcom/sumsub/sns/internal/features/presentation/camera/video/E;
.super Landroid/os/CountDownTimer;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public final synthetic a:Lcom/sumsub/sns/internal/features/presentation/camera/video/G;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/presentation/camera/video/G;)V
    .locals 4

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/video/E;->a:Lcom/sumsub/sns/internal/features/presentation/camera/video/G;

    .line 3
    .line 4
    const-wide/16 v0, 0xbb8

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
    .locals 9

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/video/E;->a:Lcom/sumsub/sns/internal/features/presentation/camera/video/G;

    .line 3
    .line 4
    sget v1, Lcom/sumsub/sns/internal/features/presentation/camera/video/G;->V:I

    .line 5
    .line 6
    const-string v1, "Countdown is finished"

    .line 7
    .line 8
    .line 9
    invoke-static {v1}, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/s;->a(Ljava/lang/String;)V

    .line 10
    .line 11
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/camera/video/u;

    .line 12
    const/4 v2, 0x0

    .line 13
    .line 14
    .line 15
    invoke-direct {v1, v2}, Lcom/sumsub/sns/internal/features/presentation/camera/video/u;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 16
    const/4 v3, 0x0

    .line 17
    const/4 v4, 0x1

    .line 18
    .line 19
    .line 20
    invoke-static {v0, v3, v1, v4, v2}, Lcom/sumsub/sns/core/presentation/base/M0;->updateState$default(Lcom/sumsub/sns/core/presentation/base/M0;ZLkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 21
    .line 22
    iget-object v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/video/G;->e:Landroid/os/CountDownTimer;

    .line 23
    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1}, Landroid/os/CountDownTimer;->cancel()V

    .line 28
    .line 29
    :cond_0
    iput-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/video/G;->e:Landroid/os/CountDownTimer;

    .line 30
    .line 31
    .line 32
    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 33
    move-result-object v3

    .line 34
    .line 35
    new-instance v6, Lcom/sumsub/sns/internal/features/presentation/camera/video/v;

    .line 36
    .line 37
    .line 38
    invoke-direct {v6, v0, v2}, Lcom/sumsub/sns/internal/features/presentation/camera/video/v;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/video/G;Lkotlin/coroutines/Continuation;)V

    .line 39
    const/4 v7, 0x3

    .line 40
    const/4 v8, 0x0

    .line 41
    const/4 v4, 0x0

    .line 42
    const/4 v5, 0x0

    .line 43
    .line 44
    .line 45
    invoke-static/range {v3 .. v8}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 46
    .line 47
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/camera/video/w;

    .line 48
    .line 49
    .line 50
    invoke-direct {v1, v0}, Lcom/sumsub/sns/internal/features/presentation/camera/video/w;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/video/G;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1}, Landroid/os/CountDownTimer;->start()Landroid/os/CountDownTimer;

    .line 54
    move-result-object v1

    .line 55
    .line 56
    iput-object v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/video/G;->e:Landroid/os/CountDownTimer;

    .line 57
    return-void
.end method

.method public final onTick(J)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/video/E;->a:Lcom/sumsub/sns/internal/features/presentation/camera/video/G;

    .line 3
    .line 4
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/camera/video/n;

    .line 5
    .line 6
    sget-object v2, Lcom/sumsub/sns/internal/features/presentation/camera/video/SNSVideoSelfieViewModel$State;->Countdown:Lcom/sumsub/sns/internal/features/presentation/camera/video/SNSVideoSelfieViewModel$State;

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
