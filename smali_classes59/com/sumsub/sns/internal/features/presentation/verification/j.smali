.class public final Lcom/sumsub/sns/internal/features/presentation/verification/j;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lcom/sumsub/sns/core/widget/pincode/SNSPinView$OnTextCompleteListener;


# instance fields
.field public final synthetic a:Lcom/sumsub/sns/internal/features/presentation/verification/p;

.field public final synthetic b:Lcom/sumsub/sns/internal/features/presentation/verification/B;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/presentation/verification/p;Lcom/sumsub/sns/internal/features/presentation/verification/B;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/verification/j;->a:Lcom/sumsub/sns/internal/features/presentation/verification/p;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/verification/j;->b:Lcom/sumsub/sns/internal/features/presentation/verification/B;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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


# virtual methods
.method public final onTextComplete(Ljava/lang/String;)Z
    .locals 16

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    iget-object v1, v0, Lcom/sumsub/sns/internal/features/presentation/verification/j;->a:Lcom/sumsub/sns/internal/features/presentation/verification/p;

    .line 5
    .line 6
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/presentation/verification/p;->n:Lkotlin/Lazy;

    .line 7
    .line 8
    .line 9
    invoke-interface {v1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 10
    move-result-object v1

    .line 11
    move-object v3, v1

    .line 12
    .line 13
    check-cast v3, Lcom/sumsub/sns/internal/features/presentation/verification/j0;

    .line 14
    .line 15
    iget-object v1, v0, Lcom/sumsub/sns/internal/features/presentation/verification/j;->b:Lcom/sumsub/sns/internal/features/presentation/verification/B;

    .line 16
    .line 17
    iget-object v7, v1, Lcom/sumsub/sns/internal/features/presentation/verification/B;->h:Ljava/lang/String;

    .line 18
    .line 19
    iget-object v1, v3, Lcom/sumsub/sns/internal/features/presentation/verification/j0;->a:Lcom/sumsub/sns/internal/features/data/model/common/ValidationIdentifierType;

    .line 20
    .line 21
    sget-object v2, Lcom/sumsub/sns/internal/features/presentation/verification/F;->a:[I

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 25
    move-result v1

    .line 26
    .line 27
    aget v1, v2, v1

    .line 28
    const/4 v9, 0x1

    .line 29
    .line 30
    if-eq v1, v9, :cond_1

    .line 31
    const/4 v2, 0x2

    .line 32
    .line 33
    if-ne v1, v2, :cond_0

    .line 34
    .line 35
    const-string v1, "PHONE_VERIFICATION"

    .line 36
    :goto_0
    move-object v4, v1

    .line 37
    goto :goto_1

    .line 38
    .line 39
    :cond_0
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    .line 40
    .line 41
    .line 42
    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 43
    throw v1

    .line 44
    .line 45
    :cond_1
    const-string v1, "EMAIL_VERIFICATION"

    .line 46
    goto :goto_0

    .line 47
    .line 48
    .line 49
    :goto_1
    invoke-static {v3}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 50
    move-result-object v10

    .line 51
    .line 52
    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/verification/Z;

    .line 53
    const/4 v5, 0x0

    .line 54
    move-object v6, v3

    .line 55
    .line 56
    move-object/from16 v8, p1

    .line 57
    .line 58
    .line 59
    invoke-direct/range {v2 .. v8}, Lcom/sumsub/sns/internal/features/presentation/verification/Z;-><init>(Lcom/sumsub/sns/internal/features/presentation/verification/j0;Ljava/lang/String;Lkotlin/coroutines/Continuation;Lcom/sumsub/sns/internal/features/presentation/verification/j0;Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    const/4 v14, 0x3

    .line 61
    const/4 v15, 0x0

    .line 62
    const/4 v11, 0x0

    .line 63
    const/4 v12, 0x0

    .line 64
    move-object v13, v2

    .line 65
    .line 66
    .line 67
    invoke-static/range {v10 .. v15}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 68
    .line 69
    iget-object v1, v0, Lcom/sumsub/sns/internal/features/presentation/verification/j;->a:Lcom/sumsub/sns/internal/features/presentation/verification/p;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->j()Lcom/sumsub/sns/core/widget/pincode/SNSPinView;

    .line 73
    move-result-object v1

    .line 74
    .line 75
    if-eqz v1, :cond_2

    .line 76
    .line 77
    .line 78
    invoke-static {v1}, Lcom/sumsub/sns/internal/core/common/h;->a(Landroid/view/View;)V

    .line 79
    :cond_2
    return v9
    .line 80
    .line 81
.end method
