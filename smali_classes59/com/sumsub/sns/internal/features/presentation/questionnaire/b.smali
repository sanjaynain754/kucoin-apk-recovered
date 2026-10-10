.class public final synthetic Lcom/sumsub/sns/internal/features/presentation/questionnaire/b;
.super Lkotlin/jvm/internal/FunctionReferenceImpl;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/presentation/questionnaire/SNSQuestionnaireFragment;)V
    .locals 7

    .line 1
    .line 2
    .line 3
    const-string/jumbo v5, "openGallery()V"

    .line 4
    const/4 v6, 0x0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    const-class v3, Lcom/sumsub/sns/internal/features/presentation/questionnaire/SNSQuestionnaireFragment;

    .line 8
    .line 9
    .line 10
    const-string/jumbo v4, "openGallery"

    .line 11
    move-object v0, p0

    .line 12
    move-object v2, p1

    .line 13
    .line 14
    .line 15
    invoke-direct/range {v0 .. v6}, Lkotlin/jvm/internal/FunctionReferenceImpl;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 16
    return-void
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
.method public final invoke()Ljava/lang/Object;
    .locals 6

    .line 1
    .line 2
    iget-object v0, p0, Lkotlin/jvm/internal/CallableReference;->receiver:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/SNSQuestionnaireFragment;

    .line 5
    .line 6
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/questionnaire/SNSQuestionnaireFragment;->d:Lcom/sumsub/sns/internal/features/presentation/questionnaire/SNSQuestionnaireFragment$Companion;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 10
    move-result-object v1

    .line 11
    .line 12
    const-string v2, "PENDING_FORM_ITEM"

    .line 13
    const/4 v3, 0x0

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    const-class v4, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;

    .line 18
    .line 19
    .line 20
    invoke-static {v1, v2, v4, v3}, Lcom/sumsub/sns/internal/core/common/b;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Landroid/content/Context;)Landroid/os/Parcelable;

    .line 21
    move-result-object v1

    .line 22
    .line 23
    check-cast v1, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move-object v1, v3

    .line 26
    .line 27
    :goto_0
    if-eqz v1, :cond_1

    .line 28
    .line 29
    iget-object v4, v0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/SNSQuestionnaireFragment;->a:Lkotlin/Lazy;

    .line 30
    .line 31
    .line 32
    invoke-interface {v4}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 33
    move-result-object v4

    .line 34
    .line 35
    check-cast v4, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;

    .line 36
    .line 37
    new-instance v5, Lcom/sumsub/sns/internal/features/presentation/questionnaire/n;

    .line 38
    .line 39
    .line 40
    invoke-direct {v5, v1}, Lcom/sumsub/sns/internal/features/presentation/questionnaire/n;-><init>(Lcom/sumsub/sns/internal/core/presentation/form/model/e0;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v4, v5}, Lcom/sumsub/sns/internal/features/presentation/questionnaire/I;->intent(Lcom/sumsub/sns/core/presentation/base/Q;)V

    .line 44
    .line 45
    .line 46
    :cond_1
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 47
    move-result-object v0

    .line 48
    .line 49
    if-eqz v0, :cond_2

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 53
    .line 54
    :cond_2
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 55
    return-object v0
    .line 56
    .line 57
.end method
