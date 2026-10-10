.class public final Lrepayment/ext/h;
.super Ljava/lang/Object;
.source "RepayLialityUIExt.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u000c\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u000c\u0010\u0003\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u0016\u0010\u0004\u001a\u00020\u0001*\u00020\u00022\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0000\u00a8\u0006\u0007"
    }
    d2 = {
        "initLiabilityUI",
        "",
        "Lrepayment/UnifiedRepayFragment;",
        "emptyLiabilityUI",
        "fillLiabilityData",
        "selectedLiability",
        "Lrepayment/UnifyLiabilityData;",
        "BUnifyAccountLib_googleRelease"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic a(Lrepayment/UnifiedRepayFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lrepayment/ext/h;->e(Lrepayment/UnifiedRepayFragment;)Lkotlin/Unit;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
.end method

.method public static final b(Lrepayment/UnifiedRepayFragment;)V
    .locals 2
    .param p0    # Lrepayment/UnifiedRepayFragment;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "<this>"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lrepayment/UnifiedRepayFragment;->r3()Ll60/e;

    .line 9
    move-result-object p0

    .line 10
    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Ll60/e;->w:Lcom/kubi/resources/widget/BaseTextView;

    .line 14
    .line 15
    .line 16
    const-string/jumbo v1, "tvLiabilityTitle"

    .line 17
    .line 18
    .line 19
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    sget v1, Lcom/kubi/unify/R$color;->c_icon:I

    .line 22
    .line 23
    .line 24
    invoke-static {v0, v1}, Lcom/kubi/resources/t;->i(Landroid/widget/TextView;I)V

    .line 25
    .line 26
    iget-object v0, p0, Ll60/e;->u:Lcom/kubi/resources/widget/BaseTextView;

    .line 27
    .line 28
    sget v1, Lcom/kubi/unify/R$string;->stub:I

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 32
    .line 33
    iget-object p0, p0, Ll60/e;->j:Landroidx/appcompat/widget/AppCompatImageView;

    .line 34
    .line 35
    const-string v0, ""

    .line 36
    .line 37
    .line 38
    invoke-static {p0, v0}, Lcom/kubi/sdk/util/v;->g(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 39
    :cond_0
    return-void
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
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
.end method

.method public static final c(Lrepayment/UnifiedRepayFragment;Lrepayment/UnifyLiabilityData;)V
    .locals 2
    .param p0    # Lrepayment/UnifiedRepayFragment;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lrepayment/UnifyLiabilityData;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "<this>"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    if-nez p1, :cond_0

    .line 8
    goto :goto_0

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-virtual {p0}, Lrepayment/UnifiedRepayFragment;->r3()Ll60/e;

    .line 12
    move-result-object p0

    .line 13
    .line 14
    if-eqz p0, :cond_1

    .line 15
    .line 16
    iget-object v0, p0, Ll60/e;->u:Lcom/kubi/resources/widget/BaseTextView;

    .line 17
    const/4 v1, 0x0

    .line 18
    .line 19
    .line 20
    invoke-static {p1, v1}, Lrepayment/f;->e(Lrepayment/UnifyLiabilityData;Z)Ljava/lang/String;

    .line 21
    move-result-object v1

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 25
    .line 26
    iget-object v0, p0, Ll60/e;->v:Lcom/kubi/resources/widget/BaseTextView;

    .line 27
    .line 28
    .line 29
    invoke-static {p1}, Lrepayment/f;->c(Lrepayment/UnifyLiabilityData;)Ljava/lang/String;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 34
    .line 35
    iget-object p0, p0, Ll60/e;->j:Landroidx/appcompat/widget/AppCompatImageView;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1}, Lrepayment/UnifyLiabilityData;->getIconUrl()Ljava/lang/String;

    .line 39
    move-result-object p1

    .line 40
    .line 41
    .line 42
    invoke-static {p0, p1}, Lcom/kubi/sdk/util/v;->g(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 43
    :cond_1
    :goto_0
    return-void
.end method

.method public static final d(Lrepayment/UnifiedRepayFragment;)V
    .locals 9
    .param p0    # Lrepayment/UnifiedRepayFragment;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "<this>"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lrepayment/UnifiedRepayFragment;->r3()Ll60/e;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v1, v0, Ll60/e;->w:Lcom/kubi/resources/widget/BaseTextView;

    .line 14
    .line 15
    .line 16
    const-string/jumbo v2, "tvLiabilityTitle"

    .line 17
    .line 18
    .line 19
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    sget v2, Lcom/kubi/unify/R$color;->c_icon:I

    .line 22
    .line 23
    .line 24
    invoke-static {v1, v2}, Lcom/kubi/resources/t;->i(Landroid/widget/TextView;I)V

    .line 25
    .line 26
    iget-object v3, v0, Ll60/e;->l:Landroid/view/View;

    .line 27
    .line 28
    const-string v0, "liabilityClickRectView"

    .line 29
    .line 30
    .line 31
    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    new-instance v6, Lrepayment/ext/g;

    .line 34
    .line 35
    .line 36
    invoke-direct {v6, p0}, Lrepayment/ext/g;-><init>(Lrepayment/UnifiedRepayFragment;)V

    .line 37
    const/4 v7, 0x1

    .line 38
    const/4 v8, 0x0

    .line 39
    .line 40
    const-wide/16 v4, 0x0

    .line 41
    .line 42
    .line 43
    invoke-static/range {v3 .. v8}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    invoke-static {p0}, Lrepayment/ext/h;->b(Lrepayment/UnifiedRepayFragment;)V

    .line 47
    :cond_0
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
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
.end method

.method public static final e(Lrepayment/UnifiedRepayFragment;)Lkotlin/Unit;
    .locals 3

    .line 1
    .line 2
    sget-object v0, Lrepayment/dialog/LiabilitySelectedDialog;->w0:Lrepayment/dialog/LiabilitySelectedDialog$Companion;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lrepayment/UnifiedRepayFragment;->u3()Lrepayment/RepayVM;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    .line 9
    invoke-virtual {v1}, Lrepayment/RepayVM;->w()Lkotlinx/coroutines/flow/w;

    .line 10
    move-result-object v1

    .line 11
    .line 12
    .line 13
    invoke-interface {v1}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    check-cast v1, Lrepayment/UnifyLiabilityData;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 20
    move-result-object p0

    .line 21
    .line 22
    const-string v2, "getChildFragmentManager(...)"

    .line 23
    .line 24
    .line 25
    invoke-static {p0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v1, p0}, Lrepayment/dialog/LiabilitySelectedDialog$Companion;->show(Lrepayment/UnifyLiabilityData;Landroidx/fragment/app/FragmentManager;)V

    .line 29
    .line 30
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 31
    return-object p0
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
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
.end method
