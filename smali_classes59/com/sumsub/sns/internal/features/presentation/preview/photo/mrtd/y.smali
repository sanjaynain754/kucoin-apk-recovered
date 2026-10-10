.class public final Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/y;
.super Lcom/sumsub/sns/internal/core/presentation/common/t;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# static fields
.field public static final synthetic r:[Lkotlin/reflect/KProperty;


# instance fields
.field public final e:Lkotlin/jvm/functions/Function0;

.field public final f:Lkotlin/jvm/functions/Function0;

.field public final g:Ljava/lang/String;

.field public final h:Lcom/sumsub/sns/internal/core/presentation/common/k;

.field public final i:Lcom/sumsub/sns/internal/core/presentation/common/k;

.field public final j:Lcom/sumsub/sns/internal/core/presentation/common/k;

.field public final k:Lcom/sumsub/sns/internal/core/presentation/common/k;

.field public final l:Lcom/sumsub/sns/internal/core/presentation/common/k;

.field public final m:Lcom/sumsub/sns/internal/core/presentation/common/k;

.field public final n:Lcom/sumsub/sns/internal/core/presentation/common/k;

.field public final o:Lcom/sumsub/sns/internal/core/presentation/common/k;

.field public final p:Lcom/sumsub/sns/internal/core/presentation/common/k;

.field public final q:Lcom/sumsub/sns/internal/core/presentation/common/k;


# direct methods
.method static constructor <clinit>()V
    .locals 13

    .line 1
    .line 2
    const-class v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/y;

    .line 3
    .line 4
    const-string v1, "introAnimation"

    .line 5
    .line 6
    const-string v2, "getIntroAnimation()Lcom/airbnb/lottie/LottieAnimationView;"

    .line 7
    const/4 v3, 0x0

    .line 8
    .line 9
    .line 10
    invoke-static {v0, v1, v2, v3}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 11
    move-result-object v1

    .line 12
    .line 13
    const-string v2, "introTitle"

    .line 14
    .line 15
    const-string v4, "getIntroTitle()Landroid/widget/TextView;"

    .line 16
    .line 17
    .line 18
    invoke-static {v0, v2, v4, v3}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 19
    move-result-object v2

    .line 20
    .line 21
    const-string v4, "introHint"

    .line 22
    .line 23
    const-string v5, "getIntroHint()Landroid/widget/TextView;"

    .line 24
    .line 25
    .line 26
    invoke-static {v0, v4, v5, v3}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 27
    move-result-object v4

    .line 28
    .line 29
    const-string v5, "introAction"

    .line 30
    .line 31
    const-string v6, "getIntroAction()Landroid/widget/TextView;"

    .line 32
    .line 33
    .line 34
    invoke-static {v0, v5, v6, v3}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 35
    move-result-object v5

    .line 36
    .line 37
    .line 38
    const-string/jumbo v6, "readingTitle"

    .line 39
    .line 40
    const-string v7, "getReadingTitle()Landroid/widget/TextView;"

    .line 41
    .line 42
    .line 43
    invoke-static {v0, v6, v7, v3}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 44
    move-result-object v6

    .line 45
    .line 46
    .line 47
    const-string/jumbo v7, "readingSubtitle"

    .line 48
    .line 49
    const-string v8, "getReadingSubtitle()Landroid/widget/TextView;"

    .line 50
    .line 51
    .line 52
    invoke-static {v0, v7, v8, v3}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 53
    move-result-object v7

    .line 54
    .line 55
    .line 56
    const-string/jumbo v8, "readingProgress"

    .line 57
    .line 58
    const-string v9, "getReadingProgress()Lcom/sumsub/sns/core/widget/SNSHorizontalProgressBarView;"

    .line 59
    .line 60
    .line 61
    invoke-static {v0, v8, v9, v3}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 62
    move-result-object v8

    .line 63
    .line 64
    .line 65
    const-string/jumbo v9, "resultIcon"

    .line 66
    .line 67
    const-string v10, "getResultIcon()Landroid/widget/ImageView;"

    .line 68
    .line 69
    .line 70
    invoke-static {v0, v9, v10, v3}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 71
    move-result-object v9

    .line 72
    .line 73
    .line 74
    const-string/jumbo v10, "resultTitle"

    .line 75
    .line 76
    const-string v11, "getResultTitle()Landroid/widget/TextView;"

    .line 77
    .line 78
    .line 79
    invoke-static {v0, v10, v11, v3}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 80
    move-result-object v10

    .line 81
    .line 82
    .line 83
    const-string/jumbo v11, "resultSubtitle"

    .line 84
    .line 85
    const-string v12, "getResultSubtitle()Landroid/widget/TextView;"

    .line 86
    .line 87
    .line 88
    invoke-static {v0, v11, v12, v3}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 89
    move-result-object v0

    .line 90
    .line 91
    const/16 v11, 0xa

    .line 92
    .line 93
    new-array v11, v11, [Lkotlin/reflect/KProperty;

    .line 94
    .line 95
    aput-object v1, v11, v3

    .line 96
    const/4 v1, 0x1

    .line 97
    .line 98
    aput-object v2, v11, v1

    .line 99
    const/4 v1, 0x2

    .line 100
    .line 101
    aput-object v4, v11, v1

    .line 102
    const/4 v1, 0x3

    .line 103
    .line 104
    aput-object v5, v11, v1

    .line 105
    const/4 v1, 0x4

    .line 106
    .line 107
    aput-object v6, v11, v1

    .line 108
    const/4 v1, 0x5

    .line 109
    .line 110
    aput-object v7, v11, v1

    .line 111
    const/4 v1, 0x6

    .line 112
    .line 113
    aput-object v8, v11, v1

    .line 114
    const/4 v1, 0x7

    .line 115
    .line 116
    aput-object v9, v11, v1

    .line 117
    .line 118
    const/16 v1, 0x8

    .line 119
    .line 120
    aput-object v10, v11, v1

    .line 121
    .line 122
    const/16 v1, 0x9

    .line 123
    .line 124
    aput-object v0, v11, v1

    .line 125
    .line 126
    sput-object v11, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/y;->r:[Lkotlin/reflect/KProperty;

    .line 127
    return-void
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
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

.method public constructor <init>(Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/w;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p1, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0, v0, p1}, Lcom/sumsub/sns/internal/core/presentation/common/t;-><init>(Lcom/sumsub/sns/core/presentation/base/l;Lcom/sumsub/sns/internal/core/presentation/common/t;)V

    .line 6
    .line 7
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/y;->e:Lkotlin/jvm/functions/Function0;

    .line 8
    .line 9
    iput-object p3, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/y;->f:Lkotlin/jvm/functions/Function0;

    .line 10
    .line 11
    const-string p1, "MrtdLayoutStateHandler"

    .line 12
    .line 13
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/y;->g:Ljava/lang/String;

    .line 14
    .line 15
    sget p1, Lcom/sumsub/sns/R$id;->sns_intro_animation:I

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/core/presentation/common/t;->a(I)Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 19
    move-result-object p1

    .line 20
    .line 21
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/y;->h:Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 22
    .line 23
    sget p1, Lcom/sumsub/sns/R$id;->sns_intro_title:I

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/core/presentation/common/t;->a(I)Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 27
    move-result-object p1

    .line 28
    .line 29
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/y;->i:Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 30
    .line 31
    sget p1, Lcom/sumsub/sns/R$id;->sns_intro_hint:I

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/core/presentation/common/t;->a(I)Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 35
    move-result-object p1

    .line 36
    .line 37
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/y;->j:Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 38
    .line 39
    sget p1, Lcom/sumsub/sns/R$id;->sns_intro_action:I

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/core/presentation/common/t;->a(I)Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 43
    move-result-object p1

    .line 44
    .line 45
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/y;->k:Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 46
    .line 47
    sget p1, Lcom/sumsub/sns/R$id;->sns_reading_title:I

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/core/presentation/common/t;->a(I)Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 51
    move-result-object p1

    .line 52
    .line 53
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/y;->l:Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 54
    .line 55
    sget p1, Lcom/sumsub/sns/R$id;->sns_reading_subtitle:I

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/core/presentation/common/t;->a(I)Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 59
    move-result-object p1

    .line 60
    .line 61
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/y;->m:Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 62
    .line 63
    sget p1, Lcom/sumsub/sns/R$id;->sns_reading_progress:I

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/core/presentation/common/t;->a(I)Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 67
    move-result-object p1

    .line 68
    .line 69
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/y;->n:Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 70
    .line 71
    sget p1, Lcom/sumsub/sns/R$id;->sns_result_status:I

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/core/presentation/common/t;->a(I)Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 75
    move-result-object p1

    .line 76
    .line 77
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/y;->o:Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 78
    .line 79
    sget p1, Lcom/sumsub/sns/R$id;->sns_result_title:I

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/core/presentation/common/t;->a(I)Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 83
    move-result-object p1

    .line 84
    .line 85
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/y;->p:Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 86
    .line 87
    sget p1, Lcom/sumsub/sns/R$id;->sns_result_subtitle:I

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/core/presentation/common/t;->a(I)Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 91
    move-result-object p1

    .line 92
    .line 93
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/y;->q:Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 94
    return-void
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

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/y;Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;)Lkotlin/Unit;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/y;->h:Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 2
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/y;->r:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, Lcom/sumsub/sns/internal/core/presentation/common/k;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/airbnb/lottie/LottieAnimationView;

    if-eqz p0, :cond_1

    .line 3
    const-string/jumbo v0, "sns_mrtdscan2_animation_chip"

    invoke-virtual {p1, v0}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 4
    const-string/jumbo v1, "sns_mrtdscan2_animation_phone"

    invoke-virtual {p1, v1}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz v0, :cond_0

    .line 5
    const-string v1, "Chip area"

    invoke-static {p0, v1, v0}, Lcom/sumsub/sns/internal/core/common/X;->a(Lcom/airbnb/lottie/LottieAnimationView;Ljava/lang/String;Ljava/lang/CharSequence;)V

    :cond_0
    if-eqz p1, :cond_1

    .line 6
    const-string v0, "Phone sensor"

    invoke-static {p0, v0, p1}, Lcom/sumsub/sns/internal/core/common/X;->a(Lcom/airbnb/lottie/LottieAnimationView;Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 7
    :cond_1
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/y;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    .line 26
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/y;->e:Lkotlin/jvm/functions/Function0;

    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public final a(Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/p;)V
    .locals 6

    .line 8
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/y;->i:Lcom/sumsub/sns/internal/core/presentation/common/k;

    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/y;->r:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x1

    aget-object v2, v1, v2

    invoke-virtual {v0, p0, v2}, Lcom/sumsub/sns/internal/core/presentation/common/k;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    if-eqz v0, :cond_0

    .line 9
    iget-object v2, p1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/p;->a:Ljava/lang/CharSequence;

    .line 10
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 11
    :cond_0
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/y;->j:Lcom/sumsub/sns/internal/core/presentation/common/k;

    const/4 v2, 0x2

    aget-object v2, v1, v2

    invoke-virtual {v0, p0, v2}, Lcom/sumsub/sns/internal/core/presentation/common/k;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    if-eqz v0, :cond_2

    .line 12
    iget-object v2, p1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/p;->b:Ljava/lang/CharSequence;

    if-eqz v2, :cond_1

    .line 13
    iget-object v3, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v3

    .line 14
    invoke-static {v2, v3}, Lcom/sumsub/sns/internal/core/common/i0;->a(Ljava/lang/CharSequence;Landroid/content/Context;)Landroid/text/Spanned;

    move-result-object v2

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 15
    :cond_2
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/p;->c:Ljava/lang/CharSequence;

    const/4 v0, 0x3

    if-eqz p1, :cond_4

    .line 16
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/y;->k:Lcom/sumsub/sns/internal/core/presentation/common/k;

    aget-object v3, v1, v0

    invoke-virtual {v2, p0, v3}, Lcom/sumsub/sns/internal/core/presentation/common/k;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    const/4 v3, 0x0

    if-eqz v2, :cond_3

    .line 17
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setHighlightColor(I)V

    .line 18
    :cond_3
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/y;->k:Lcom/sumsub/sns/internal/core/presentation/common/k;

    aget-object v0, v1, v0

    invoke-virtual {v2, p0, v0}, Lcom/sumsub/sns/internal/core/presentation/common/k;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    if-eqz v0, :cond_5

    .line 19
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/i1;

    invoke-direct {v1, p0}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/i1;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/y;)V

    .line 20
    new-instance v2, Landroid/text/SpannableString;

    invoke-direct {v2, p1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 21
    new-instance v4, Landroid/text/style/URLSpan;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v4, p1}, Landroid/text/style/URLSpan;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Landroid/text/SpannableString;->length()I

    move-result p1

    const/16 v5, 0x21

    invoke-virtual {v2, v4, v3, p1, v5}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 22
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 23
    invoke-static {v0, v1}, Lcom/sumsub/sns/internal/core/common/q;->a(Landroid/widget/TextView;Lkotlin/jvm/functions/Function1;)V

    return-void

    .line 24
    :cond_4
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/y;->k:Lcom/sumsub/sns/internal/core/presentation/common/k;

    aget-object v0, v1, v0

    invoke-virtual {p1, p0, v0}, Lcom/sumsub/sns/internal/core/presentation/common/k;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    if-eqz p1, :cond_5

    const/16 v0, 0x8

    .line 25
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    :cond_5
    return-void
.end method

.method public final h()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/y;->g:Ljava/lang/String;

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

.method public final l()V
    .locals 8

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/y;->h:Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 3
    .line 4
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/y;->r:[Lkotlin/reflect/KProperty;

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    aget-object v1, v1, v2

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p0, v1}, Lcom/sumsub/sns/internal/core/presentation/common/k;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    check-cast v0, Lcom/airbnb/lottie/LottieAnimationView;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    .line 18
    invoke-static {v0}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/a;->a(Lcom/airbnb/lottie/LottieAnimationView;)V

    .line 19
    .line 20
    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/h1;

    .line 21
    .line 22
    .line 23
    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/h1;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/y;)V

    .line 24
    .line 25
    iget-object v1, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 29
    move-result-object v1

    .line 30
    .line 31
    .line 32
    invoke-static {v1}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 33
    move-result-object v2

    .line 34
    .line 35
    new-instance v5, Lcom/sumsub/sns/internal/core/presentation/common/s;

    .line 36
    const/4 v1, 0x0

    .line 37
    .line 38
    .line 39
    invoke-direct {v5, p0, v0, v1}, Lcom/sumsub/sns/internal/core/presentation/common/s;-><init>(Lcom/sumsub/sns/internal/core/presentation/common/t;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V

    .line 40
    const/4 v6, 0x3

    .line 41
    const/4 v7, 0x0

    .line 42
    const/4 v3, 0x0

    .line 43
    const/4 v4, 0x0

    .line 44
    .line 45
    .line 46
    invoke-static/range {v2 .. v7}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

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
.end method

.method public final n()Landroid/widget/ImageView;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/y;->o:Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 3
    .line 4
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/y;->r:[Lkotlin/reflect/KProperty;

    .line 5
    const/4 v2, 0x7

    .line 6
    .line 7
    aget-object v1, v1, v2

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p0, v1}, Lcom/sumsub/sns/internal/core/presentation/common/k;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    check-cast v0, Landroid/widget/ImageView;

    .line 14
    return-object v0
    .line 15
    .line 16
    .line 17
.end method
