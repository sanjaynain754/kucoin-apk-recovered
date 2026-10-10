.class public final Lcom/sumsub/sns/internal/features/presentation/prooface/h;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lcom/sumsub/sns/core/widget/SNSLivenessFaceView$SNSFaceStateListener;


# instance fields
.field public final synthetic a:Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/h;->a:Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.method public final onState(Lcom/sumsub/sns/core/widget/SNSLivenessFaceView$SNSFaceViewState;)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/h;->a:Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;

    .line 3
    .line 4
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->a:Lkotlin/Lazy;

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;

    .line 11
    .line 12
    sget-object v1, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView$SNSFaceViewState;->Recognized:Lcom/sumsub/sns/core/widget/SNSLivenessFaceView$SNSFaceViewState;

    .line 13
    .line 14
    if-ne p1, v1, :cond_0

    .line 15
    const/4 v1, 0x1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v1, 0x0

    .line 18
    .line 19
    :goto_0
    iput-boolean v1, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->F:Z

    .line 20
    .line 21
    sget-object v0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView$SNSFaceViewState;->Complete:Lcom/sumsub/sns/core/widget/SNSLivenessFaceView$SNSFaceViewState;

    .line 22
    .line 23
    if-ne p1, v0, :cond_1

    .line 24
    .line 25
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/h;->a:Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;

    .line 26
    .line 27
    .line 28
    invoke-static {p1}, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->a(Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;)V

    .line 29
    :cond_1
    return-void
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
    .line 79
    .line 80
    .line 81
.end method
