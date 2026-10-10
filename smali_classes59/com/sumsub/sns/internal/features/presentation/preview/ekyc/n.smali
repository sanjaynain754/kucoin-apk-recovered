.class public final Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/n;
.super Lcom/sumsub/sns/internal/core/presentation/bottomsheet/i;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# static fields
.field public static final synthetic s:[Lkotlin/reflect/KProperty;


# instance fields
.field public final k:Lkotlin/jvm/functions/Function0;

.field public final l:Lkotlin/jvm/functions/Function0;

.field public final m:Ljava/lang/String;

.field public final n:Ljava/lang/String;

.field public final o:Lcom/sumsub/sns/internal/core/presentation/bottomsheet/a;

.field public final p:Lcom/sumsub/sns/internal/core/presentation/common/k;

.field public final q:Lcom/sumsub/sns/internal/core/presentation/common/k;

.field public final r:Lcom/sumsub/sns/internal/core/presentation/common/k;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    .line 2
    const-class v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/n;

    .line 3
    .line 4
    .line 5
    const-string/jumbo v1, "tvTitle"

    .line 6
    .line 7
    const-string v2, "getTvTitle()Landroid/widget/TextView;"

    .line 8
    const/4 v3, 0x0

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, v2, v3}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 12
    move-result-object v1

    .line 13
    .line 14
    .line 15
    const-string/jumbo v2, "tvBody"

    .line 16
    .line 17
    const-string v4, "getTvBody()Landroid/widget/TextView;"

    .line 18
    .line 19
    .line 20
    invoke-static {v0, v2, v4, v3}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 21
    move-result-object v2

    .line 22
    .line 23
    const-string v4, "btnContinue"

    .line 24
    .line 25
    const-string v5, "getBtnContinue()Landroid/widget/Button;"

    .line 26
    .line 27
    .line 28
    invoke-static {v0, v4, v5, v3}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 29
    move-result-object v0

    .line 30
    const/4 v4, 0x3

    .line 31
    .line 32
    new-array v4, v4, [Lkotlin/reflect/KProperty;

    .line 33
    .line 34
    aput-object v1, v4, v3

    .line 35
    const/4 v1, 0x1

    .line 36
    .line 37
    aput-object v2, v4, v1

    .line 38
    const/4 v1, 0x2

    .line 39
    .line 40
    aput-object v0, v4, v1

    .line 41
    .line 42
    sput-object v4, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/n;->s:[Lkotlin/reflect/KProperty;

    .line 43
    return-void
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

.method public constructor <init>(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/i;-><init>(Lcom/sumsub/sns/core/presentation/base/l;)V

    .line 4
    .line 5
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/n;->k:Lkotlin/jvm/functions/Function0;

    .line 6
    .line 7
    iput-object p3, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/n;->l:Lkotlin/jvm/functions/Function0;

    .line 8
    .line 9
    const-string p1, "SNSEkycInstructionsBottomSheet"

    .line 10
    .line 11
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/n;->m:Ljava/lang/String;

    .line 12
    .line 13
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/n;->n:Ljava/lang/String;

    .line 14
    .line 15
    new-instance p1, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/a;

    .line 16
    .line 17
    sget-object p2, Lcom/sumsub/sns/internal/core/analytics/Popup;->EkycConfirmationPopup:Lcom/sumsub/sns/internal/core/analytics/Popup;

    .line 18
    .line 19
    .line 20
    invoke-direct {p1, p2}, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/a;-><init>(Lcom/sumsub/sns/internal/core/analytics/Popup;)V

    .line 21
    .line 22
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/n;->o:Lcom/sumsub/sns/internal/core/presentation/bottomsheet/a;

    .line 23
    .line 24
    sget p1, Lcom/sumsub/sns/R$id;->sns_ekyc_instructions_title:I

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/i;->b(I)Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 28
    move-result-object p1

    .line 29
    .line 30
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/n;->p:Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 31
    .line 32
    sget p1, Lcom/sumsub/sns/R$id;->sns_ekyc_instructions_body:I

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/i;->b(I)Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 36
    move-result-object p1

    .line 37
    .line 38
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/n;->q:Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 39
    .line 40
    sget p1, Lcom/sumsub/sns/R$id;->sns_ekyc_instructions_button:I

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/i;->b(I)Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 44
    move-result-object p1

    .line 45
    .line 46
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/n;->r:Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 47
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
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/n;Landroid/view/View;)V
    .locals 1

    .line 2
    sget-object p1, Lcom/sumsub/sns/internal/core/analytics/Control;->ConfirmButton:Lcom/sumsub/sns/internal/core/analytics/Control;

    invoke-static {p0, p1}, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/i;->a(Lcom/sumsub/sns/internal/core/presentation/bottomsheet/i;Lcom/sumsub/sns/internal/core/analytics/Control;)V

    .line 3
    iget-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/i;->e:Lcom/sumsub/sns/internal/core/presentation/bottomsheet/d;

    if-eqz p1, :cond_0

    goto :goto_1

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 5
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object p1

    .line 6
    invoke-virtual {p1}, Landroidx/fragment/app/FragmentManager;->executePendingTransactions()Z

    .line 7
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/n;->n()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/fragment/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    move-result-object p1

    instance-of v0, p1, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/d;

    if-eqz v0, :cond_1

    check-cast p1, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/d;

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_2

    .line 8
    :goto_1
    invoke-virtual {p1}, Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;->dismiss()V

    goto :goto_2

    .line 9
    :cond_2
    const-string p1, "Bottom sheet is dismissed"

    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/core/presentation/common/t;->b(Ljava/lang/String;)V

    .line 10
    :goto_2
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/n;->l:Lkotlin/jvm/functions/Function0;

    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 2

    .line 1
    sget v0, Lcom/sumsub/sns/R$layout;->sns_ekyc_instructions_bottom_sheet:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public final h()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/n;->m:Ljava/lang/String;

    .line 3
    return-object v0
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
.end method

.method public final n()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/n;->n:Ljava/lang/String;

    .line 3
    return-object v0
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
.end method

.method public final o()Lcom/sumsub/sns/internal/core/presentation/bottomsheet/c;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/n;->o:Lcom/sumsub/sns/internal/core/presentation/bottomsheet/a;

    .line 3
    return-object v0
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
.end method

.method public final p()V
    .locals 6

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/n;->k:Lkotlin/jvm/functions/Function0;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/b;

    .line 9
    .line 10
    if-nez v0, :cond_3

    .line 11
    .line 12
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/i;->e:Lcom/sumsub/sns/internal/core/presentation/bottomsheet/d;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;->dismiss()V

    .line 18
    return-void

    .line 19
    .line 20
    :cond_0
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->executePendingTransactions()Z

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/n;->n()Ljava/lang/String;

    .line 31
    move-result-object v1

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v1}, Landroidx/fragment/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 35
    move-result-object v0

    .line 36
    .line 37
    instance-of v1, v0, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/d;

    .line 38
    .line 39
    if-eqz v1, :cond_1

    .line 40
    .line 41
    check-cast v0, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/d;

    .line 42
    goto :goto_0

    .line 43
    :cond_1
    const/4 v0, 0x0

    .line 44
    .line 45
    :goto_0
    if-eqz v0, :cond_2

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;->dismiss()V

    .line 49
    return-void

    .line 50
    .line 51
    :cond_2
    const-string v0, "Bottom sheet is dismissed"

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/core/presentation/common/t;->b(Ljava/lang/String;)V

    .line 55
    return-void

    .line 56
    .line 57
    :cond_3
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/n;->p:Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 58
    .line 59
    sget-object v2, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/n;->s:[Lkotlin/reflect/KProperty;

    .line 60
    const/4 v3, 0x0

    .line 61
    .line 62
    aget-object v4, v2, v3

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1, p0, v4}, Lcom/sumsub/sns/internal/core/presentation/common/k;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 66
    move-result-object v1

    .line 67
    .line 68
    check-cast v1, Landroid/widget/TextView;

    .line 69
    .line 70
    if-eqz v1, :cond_4

    .line 71
    .line 72
    iget-object v4, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/b;->a:Ljava/lang/CharSequence;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 76
    .line 77
    :cond_4
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/n;->q:Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 78
    const/4 v4, 0x1

    .line 79
    .line 80
    aget-object v5, v2, v4

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1, p0, v5}, Lcom/sumsub/sns/internal/core/presentation/common/k;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 84
    move-result-object v1

    .line 85
    .line 86
    check-cast v1, Landroid/widget/TextView;

    .line 87
    .line 88
    if-eqz v1, :cond_5

    .line 89
    .line 90
    iget-object v5, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/b;->b:Ljava/lang/CharSequence;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 94
    .line 95
    :cond_5
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/n;->q:Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 96
    .line 97
    aget-object v4, v2, v4

    .line 98
    .line 99
    .line 100
    invoke-virtual {v1, p0, v4}, Lcom/sumsub/sns/internal/core/presentation/common/k;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 101
    move-result-object v1

    .line 102
    .line 103
    check-cast v1, Landroid/widget/TextView;

    .line 104
    .line 105
    if-eqz v1, :cond_8

    .line 106
    .line 107
    iget-object v4, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/b;->b:Ljava/lang/CharSequence;

    .line 108
    .line 109
    if-eqz v4, :cond_6

    .line 110
    .line 111
    .line 112
    invoke-static {v4}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    .line 113
    move-result v4

    .line 114
    .line 115
    if-eqz v4, :cond_7

    .line 116
    .line 117
    :cond_6
    const/16 v3, 0x8

    .line 118
    .line 119
    .line 120
    :cond_7
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 121
    .line 122
    :cond_8
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/n;->r:Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 123
    const/4 v3, 0x2

    .line 124
    .line 125
    aget-object v4, v2, v3

    .line 126
    .line 127
    .line 128
    invoke-virtual {v1, p0, v4}, Lcom/sumsub/sns/internal/core/presentation/common/k;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 129
    move-result-object v1

    .line 130
    .line 131
    check-cast v1, Landroid/widget/Button;

    .line 132
    .line 133
    if-eqz v1, :cond_9

    .line 134
    .line 135
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/b;->c:Ljava/lang/CharSequence;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 139
    .line 140
    :cond_9
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/n;->r:Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 141
    .line 142
    aget-object v1, v2, v3

    .line 143
    .line 144
    .line 145
    invoke-virtual {v0, p0, v1}, Lcom/sumsub/sns/internal/core/presentation/common/k;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 146
    move-result-object v0

    .line 147
    .line 148
    check-cast v0, Landroid/widget/Button;

    .line 149
    .line 150
    if-eqz v0, :cond_a

    .line 151
    .line 152
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/t0;

    .line 153
    .line 154
    .line 155
    invoke-direct {v1, p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/t0;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/n;)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 159
    :cond_a
    return-void
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
.end method
