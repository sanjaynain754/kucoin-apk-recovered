.class public final Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/c;
.super Lcom/sumsub/sns/internal/core/presentation/common/t;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# static fields
.field public static final synthetic i:[Lkotlin/reflect/KProperty;


# instance fields
.field public final e:Ljava/lang/String;

.field public final f:Lkotlin/Lazy;

.field public final g:Lcom/sumsub/sns/internal/core/presentation/common/k;

.field public final h:Lcom/sumsub/sns/internal/core/presentation/common/k;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    .line 2
    const-class v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/c;

    .line 3
    .line 4
    const-string v1, "autoCaptureHint"

    .line 5
    .line 6
    const-string v2, "getAutoCaptureHint()Landroid/view/ViewGroup;"

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
    const-string v2, "autoCaptureHintText"

    .line 14
    .line 15
    const-string v4, "getAutoCaptureHintText()Landroid/widget/TextView;"

    .line 16
    .line 17
    .line 18
    invoke-static {v0, v2, v4, v3}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 19
    move-result-object v0

    .line 20
    const/4 v2, 0x2

    .line 21
    .line 22
    new-array v2, v2, [Lkotlin/reflect/KProperty;

    .line 23
    .line 24
    aput-object v1, v2, v3

    .line 25
    const/4 v1, 0x1

    .line 26
    .line 27
    aput-object v0, v2, v1

    .line 28
    .line 29
    sput-object v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/c;->i:[Lkotlin/reflect/KProperty;

    .line 30
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

.method public constructor <init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/j;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/b;)V
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
    const-string p1, "AutocaptureHint"

    .line 8
    .line 9
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/c;->e:Ljava/lang/String;

    .line 10
    .line 11
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/n4;

    .line 12
    .line 13
    .line 14
    invoke-direct {p1, p0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/n4;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/c;)V

    .line 15
    .line 16
    .line 17
    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 18
    move-result-object p1

    .line 19
    .line 20
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/c;->f:Lkotlin/Lazy;

    .line 21
    .line 22
    iget p1, p2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/b;->a:I

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/core/presentation/common/t;->a(I)Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 26
    move-result-object p1

    .line 27
    .line 28
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/c;->g:Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 29
    .line 30
    iget p1, p2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/b;->b:I

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/core/presentation/common/t;->a(I)Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 34
    move-result-object p1

    .line 35
    .line 36
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/c;->h:Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 37
    return-void
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/c;)I
    .locals 4

    .line 1
    sget-object v0, Lcom/sumsub/sns/internal/core/common/k0;->a:Lcom/sumsub/sns/internal/core/common/k0;

    invoke-virtual {v0}, Lcom/sumsub/sns/internal/core/common/k0;->getCustomization()Lcom/sumsub/sns/core/theme/SNSJsonCustomization;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/sumsub/sns/core/theme/SNSJsonCustomization;->getTheme()Lcom/sumsub/sns/core/theme/SNSCustomizationTheme;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    instance-of v2, v0, Lcom/sumsub/sns/internal/core/presentation/theme/p;

    if-eqz v2, :cond_1

    check-cast v0, Lcom/sumsub/sns/internal/core/presentation/theme/p;

    goto :goto_1

    :cond_1
    move-object v0, v1

    :goto_1
    if-eqz v0, :cond_4

    .line 2
    sget-object v2, Lcom/sumsub/sns/core/theme/SNSColorElement;->CAMERA_BACKGROUND:Lcom/sumsub/sns/core/theme/SNSColorElement;

    .line 3
    iget-object v3, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 4
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v3

    .line 5
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v3

    invoke-static {v3}, Lcom/sumsub/sns/internal/core/common/h;->a(Landroid/content/res/Configuration;)Z

    move-result v3

    .line 6
    iget-object v0, v0, Lcom/sumsub/sns/internal/core/presentation/theme/p;->c:Ljava/util/Map;

    if-eqz v0, :cond_3

    .line 7
    invoke-virtual {v2}, Lcom/sumsub/sns/core/theme/SNSColorElement;->getValue()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sumsub/sns/internal/core/presentation/theme/c;

    if-eqz v0, :cond_3

    if-eqz v3, :cond_2

    .line 8
    iget-object v1, v0, Lcom/sumsub/sns/internal/core/presentation/theme/c;->a:Ljava/lang/Integer;

    goto :goto_2

    .line 9
    :cond_2
    iget-object v1, v0, Lcom/sumsub/sns/internal/core/presentation/theme/c;->b:Ljava/lang/Integer;

    :cond_3
    :goto_2
    if-eqz v1, :cond_4

    .line 10
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result p0

    return p0

    .line 11
    :cond_4
    iget-object p0, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 12
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object p0

    .line 13
    sget v0, Lcom/sumsub/sns/R$color;->sns_cameraBackground:I

    invoke-static {p0, v0}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result p0

    return p0
.end method


# virtual methods
.method public final a(Ljava/lang/String;Z)V
    .locals 5

    .line 14
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/c;->g:Lcom/sumsub/sns/internal/core/presentation/common/k;

    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/c;->i:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x0

    aget-object v3, v1, v2

    invoke-virtual {v0, p0, v3}, Lcom/sumsub/sns/internal/core/presentation/common/k;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    if-nez v0, :cond_0

    goto :goto_4

    :cond_0
    const/4 v3, 0x1

    if-eqz p1, :cond_2

    .line 15
    invoke-static {p1}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_0

    :cond_1
    move v4, v2

    goto :goto_1

    :cond_2
    :goto_0
    move v4, v3

    :goto_1
    if-nez v4, :cond_3

    if-eqz p2, :cond_3

    move p2, v3

    goto :goto_2

    :cond_3
    move p2, v2

    :goto_2
    if-nez v4, :cond_4

    .line 16
    iget-object v4, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/c;->h:Lcom/sumsub/sns/internal/core/presentation/common/k;

    aget-object v1, v1, v3

    invoke-virtual {v4, p0, v1}, Lcom/sumsub/sns/internal/core/presentation/common/k;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    if-eqz v1, :cond_4

    .line 17
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 18
    :cond_4
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result p1

    if-nez p1, :cond_5

    .line 19
    invoke-virtual {v0}, Landroid/view/View;->getAlpha()F

    move-result p1

    const/high16 v1, 0x3f800000    # 1.0f

    cmpg-float p1, p1, v1

    if-nez p1, :cond_5

    move p1, v3

    goto :goto_3

    :cond_5
    move p1, v2

    .line 20
    :goto_3
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v1

    if-nez v1, :cond_6

    move v2, v3

    :cond_6
    if-eqz p2, :cond_7

    if-nez p1, :cond_7

    .line 21
    invoke-static {v0}, Lcom/sumsub/sns/internal/core/common/c1;->a(Landroid/view/View;)V

    return-void

    :cond_7
    if-nez p2, :cond_8

    if-eqz v2, :cond_8

    .line 22
    invoke-static {v0}, Lcom/sumsub/sns/internal/core/common/c1;->b(Landroid/view/View;)V

    :cond_8
    :goto_4
    return-void
.end method

.method public final h()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/c;->e:Ljava/lang/String;

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
    .locals 6

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/c;->g:Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 3
    .line 4
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/c;->i:[Lkotlin/reflect/KProperty;

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
    check-cast v0, Landroid/view/ViewGroup;

    .line 14
    .line 15
    if-eqz v0, :cond_6

    .line 16
    .line 17
    new-instance v1, Landroid/graphics/drawable/GradientDrawable;

    .line 18
    .line 19
    .line 20
    invoke-direct {v1}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 21
    .line 22
    sget-object v2, Lcom/sumsub/sns/core/theme/SNSMetricElement;->DOCUMENT_FRAME_CORNER_RADIUS:Lcom/sumsub/sns/core/theme/SNSMetricElement;

    .line 23
    .line 24
    sget-object v3, Lcom/sumsub/sns/internal/core/common/k0;->a:Lcom/sumsub/sns/internal/core/common/k0;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v3}, Lcom/sumsub/sns/internal/core/common/k0;->getCustomization()Lcom/sumsub/sns/core/theme/SNSJsonCustomization;

    .line 28
    move-result-object v3

    .line 29
    const/4 v4, 0x0

    .line 30
    .line 31
    if-eqz v3, :cond_0

    .line 32
    .line 33
    .line 34
    invoke-interface {v3}, Lcom/sumsub/sns/core/theme/SNSJsonCustomization;->getTheme()Lcom/sumsub/sns/core/theme/SNSCustomizationTheme;

    .line 35
    move-result-object v3

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    move-object v3, v4

    .line 38
    .line 39
    :goto_0
    instance-of v5, v3, Lcom/sumsub/sns/internal/core/presentation/theme/p;

    .line 40
    .line 41
    if-eqz v5, :cond_1

    .line 42
    .line 43
    check-cast v3, Lcom/sumsub/sns/internal/core/presentation/theme/p;

    .line 44
    goto :goto_1

    .line 45
    :cond_1
    move-object v3, v4

    .line 46
    .line 47
    :goto_1
    if-eqz v3, :cond_4

    .line 48
    .line 49
    iget-object v3, v3, Lcom/sumsub/sns/internal/core/presentation/theme/p;->d:Ljava/util/Map;

    .line 50
    .line 51
    if-eqz v3, :cond_2

    .line 52
    .line 53
    .line 54
    invoke-virtual {v2}, Lcom/sumsub/sns/core/theme/SNSMetricElement;->getValue()Ljava/lang/String;

    .line 55
    move-result-object v2

    .line 56
    .line 57
    .line 58
    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    move-result-object v2

    .line 60
    .line 61
    check-cast v2, Lcom/sumsub/sns/internal/core/presentation/theme/j;

    .line 62
    goto :goto_2

    .line 63
    :cond_2
    move-object v2, v4

    .line 64
    .line 65
    :goto_2
    instance-of v3, v2, Lcom/sumsub/sns/internal/core/presentation/theme/d;

    .line 66
    .line 67
    if-eqz v3, :cond_3

    .line 68
    .line 69
    check-cast v2, Lcom/sumsub/sns/internal/core/presentation/theme/d;

    .line 70
    goto :goto_3

    .line 71
    :cond_3
    move-object v2, v4

    .line 72
    .line 73
    :goto_3
    if-eqz v2, :cond_4

    .line 74
    .line 75
    iget-object v4, v2, Lcom/sumsub/sns/internal/core/presentation/theme/d;->a:Ljava/lang/Float;

    .line 76
    .line 77
    :cond_4
    if-eqz v4, :cond_5

    .line 78
    .line 79
    .line 80
    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    .line 81
    move-result v2

    .line 82
    goto :goto_4

    .line 83
    .line 84
    :cond_5
    iget-object v2, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 88
    move-result-object v2

    .line 89
    .line 90
    .line 91
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 92
    move-result-object v2

    .line 93
    .line 94
    sget v3, Lcom/sumsub/sns/R$dimen;->sns_state_frame_radius:I

    .line 95
    .line 96
    .line 97
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 98
    move-result v2

    .line 99
    int-to-float v2, v2

    .line 100
    .line 101
    .line 102
    :goto_4
    invoke-virtual {v1, v2}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 103
    .line 104
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/c;->f:Lkotlin/Lazy;

    .line 105
    .line 106
    .line 107
    invoke-interface {v2}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 108
    move-result-object v2

    .line 109
    .line 110
    check-cast v2, Ljava/lang/Number;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 114
    move-result v2

    .line 115
    .line 116
    .line 117
    invoke-virtual {v1, v2}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 121
    :cond_6
    return-void
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
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
