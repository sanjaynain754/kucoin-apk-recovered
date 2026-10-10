.class public final Lcom/sumsub/sns/internal/features/presentation/camera/w;
.super Lcom/sumsub/sns/internal/core/presentation/common/t;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public final e:Ljava/lang/String;

.field public final f:Lkotlin/Lazy;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/presentation/camera/t;)V
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
    const-string p1, "CameraSystemBars"

    .line 8
    .line 9
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/w;->e:Ljava/lang/String;

    .line 10
    .line 11
    new-instance p1, Lcom/sumsub/sns/internal/core/presentation/common/u;

    .line 12
    .line 13
    .line 14
    invoke-direct {p1, p0}, Lcom/sumsub/sns/internal/core/presentation/common/u;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/w;)V

    .line 15
    .line 16
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/camera/d1;

    .line 17
    .line 18
    .line 19
    invoke-direct {p1, p0}, Lcom/sumsub/sns/internal/features/presentation/camera/d1;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/w;)V

    .line 20
    .line 21
    .line 22
    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 23
    move-result-object p1

    .line 24
    .line 25
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/w;->f:Lkotlin/Lazy;

    .line 26
    return-void
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

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/camera/w;)I
    .locals 4

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/internal/core/common/k0;->a:Lcom/sumsub/sns/internal/core/common/k0;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/core/common/k0;->getCustomization()Lcom/sumsub/sns/core/theme/SNSJsonCustomization;

    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    .line 12
    invoke-interface {v0}, Lcom/sumsub/sns/core/theme/SNSJsonCustomization;->getTheme()Lcom/sumsub/sns/core/theme/SNSCustomizationTheme;

    .line 13
    move-result-object v0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move-object v0, v1

    .line 16
    .line 17
    :goto_0
    instance-of v2, v0, Lcom/sumsub/sns/internal/core/presentation/theme/p;

    .line 18
    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    check-cast v0, Lcom/sumsub/sns/internal/core/presentation/theme/p;

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    move-object v0, v1

    .line 24
    .line 25
    :goto_1
    if-eqz v0, :cond_4

    .line 26
    .line 27
    sget-object v2, Lcom/sumsub/sns/core/theme/SNSColorElement;->CAMERA_BACKGROUND:Lcom/sumsub/sns/core/theme/SNSColorElement;

    .line 28
    .line 29
    iget-object v3, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 33
    move-result-object v3

    .line 34
    .line 35
    .line 36
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 37
    move-result-object v3

    .line 38
    .line 39
    .line 40
    invoke-virtual {v3}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 41
    move-result-object v3

    .line 42
    .line 43
    .line 44
    invoke-static {v3}, Lcom/sumsub/sns/internal/core/common/h;->a(Landroid/content/res/Configuration;)Z

    .line 45
    move-result v3

    .line 46
    .line 47
    iget-object v0, v0, Lcom/sumsub/sns/internal/core/presentation/theme/p;->c:Ljava/util/Map;

    .line 48
    .line 49
    if-eqz v0, :cond_3

    .line 50
    .line 51
    .line 52
    invoke-virtual {v2}, Lcom/sumsub/sns/core/theme/SNSColorElement;->getValue()Ljava/lang/String;

    .line 53
    move-result-object v2

    .line 54
    .line 55
    .line 56
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    move-result-object v0

    .line 58
    .line 59
    check-cast v0, Lcom/sumsub/sns/internal/core/presentation/theme/c;

    .line 60
    .line 61
    if-eqz v0, :cond_3

    .line 62
    .line 63
    if-eqz v3, :cond_2

    .line 64
    .line 65
    iget-object v1, v0, Lcom/sumsub/sns/internal/core/presentation/theme/c;->a:Ljava/lang/Integer;

    .line 66
    goto :goto_2

    .line 67
    .line 68
    :cond_2
    iget-object v1, v0, Lcom/sumsub/sns/internal/core/presentation/theme/c;->b:Ljava/lang/Integer;

    .line 69
    .line 70
    :cond_3
    :goto_2
    if-eqz v1, :cond_4

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 74
    move-result p0

    .line 75
    return p0

    .line 76
    .line 77
    :cond_4
    iget-object p0, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 81
    move-result-object p0

    .line 82
    .line 83
    sget v0, Lcom/sumsub/sns/R$color;->sns_cameraBackground:I

    .line 84
    .line 85
    .line 86
    invoke-static {p0, v0}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 87
    move-result p0

    .line 88
    return p0
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
    .line 121
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
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
.end method


# virtual methods
.method public final h()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/w;->e:Ljava/lang/String;

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
    .locals 14

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    sget v2, Lcom/sumsub/sns/R$id;->sns_system_bars_owner:I

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, v2}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 20
    move-result-object v1

    .line 21
    .line 22
    instance-of v3, v1, Lcom/sumsub/sns/internal/features/presentation/camera/u;

    .line 23
    const/4 v4, 0x0

    .line 24
    .line 25
    if-eqz v3, :cond_0

    .line 26
    .line 27
    check-cast v1, Lcom/sumsub/sns/internal/features/presentation/camera/u;

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move-object v1, v4

    .line 30
    .line 31
    :goto_0
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/camera/u;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 35
    move-result-object v5

    .line 36
    const/4 v6, 0x0

    .line 37
    .line 38
    if-eqz v1, :cond_1

    .line 39
    .line 40
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/presentation/camera/u;->b:Lcom/sumsub/sns/internal/features/presentation/camera/v;

    .line 41
    goto :goto_2

    .line 42
    .line 43
    :cond_1
    new-instance v1, Landroidx/core/view/WindowInsetsControllerCompat;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 47
    move-result-object v7

    .line 48
    .line 49
    .line 50
    invoke-direct {v1, v0, v7}, Landroidx/core/view/WindowInsetsControllerCompat;-><init>(Landroid/view/Window;Landroid/view/View;)V

    .line 51
    .line 52
    new-instance v8, Lcom/sumsub/sns/internal/features/presentation/camera/v;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0}, Landroid/view/Window;->getStatusBarColor()I

    .line 56
    move-result v9

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0}, Landroid/view/Window;->getNavigationBarColor()I

    .line 60
    move-result v10

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 64
    move-result-object v7

    .line 65
    .line 66
    .line 67
    invoke-virtual {v7}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 68
    move-result-object v7

    .line 69
    .line 70
    instance-of v11, v7, Landroid/graphics/drawable/ColorDrawable;

    .line 71
    .line 72
    if-eqz v11, :cond_2

    .line 73
    move-object v4, v7

    .line 74
    .line 75
    check-cast v4, Landroid/graphics/drawable/ColorDrawable;

    .line 76
    .line 77
    :cond_2
    if-eqz v4, :cond_3

    .line 78
    .line 79
    .line 80
    invoke-virtual {v4}, Landroid/graphics/drawable/ColorDrawable;->getColor()I

    .line 81
    move-result v4

    .line 82
    move v11, v4

    .line 83
    goto :goto_1

    .line 84
    :cond_3
    move v11, v6

    .line 85
    .line 86
    .line 87
    :goto_1
    invoke-virtual {v1}, Landroidx/core/view/WindowInsetsControllerCompat;->isAppearanceLightStatusBars()Z

    .line 88
    move-result v12

    .line 89
    .line 90
    .line 91
    invoke-virtual {v1}, Landroidx/core/view/WindowInsetsControllerCompat;->isAppearanceLightNavigationBars()Z

    .line 92
    move-result v13

    .line 93
    .line 94
    .line 95
    invoke-direct/range {v8 .. v13}, Lcom/sumsub/sns/internal/features/presentation/camera/v;-><init>(IIIZZ)V

    .line 96
    move-object v1, v8

    .line 97
    .line 98
    .line 99
    :goto_2
    invoke-direct {v3, v5, v1}, Lcom/sumsub/sns/internal/features/presentation/camera/u;-><init>(Ljava/lang/String;Lcom/sumsub/sns/internal/features/presentation/camera/v;)V

    .line 100
    .line 101
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/w;->f:Lkotlin/Lazy;

    .line 102
    .line 103
    .line 104
    invoke-interface {v1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 105
    move-result-object v1

    .line 106
    .line 107
    check-cast v1, Ljava/lang/Number;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 111
    move-result v1

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0, v1}, Landroid/view/Window;->setStatusBarColor(I)V

    .line 115
    .line 116
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/w;->f:Lkotlin/Lazy;

    .line 117
    .line 118
    .line 119
    invoke-interface {v1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 120
    move-result-object v1

    .line 121
    .line 122
    check-cast v1, Ljava/lang/Number;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 126
    move-result v1

    .line 127
    .line 128
    .line 129
    invoke-virtual {v0, v1}, Landroid/view/Window;->setNavigationBarColor(I)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 133
    move-result-object v1

    .line 134
    .line 135
    iget-object v4, p0, Lcom/sumsub/sns/internal/features/presentation/camera/w;->f:Lkotlin/Lazy;

    .line 136
    .line 137
    .line 138
    invoke-interface {v4}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 139
    move-result-object v4

    .line 140
    .line 141
    check-cast v4, Ljava/lang/Number;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 145
    move-result v4

    .line 146
    .line 147
    .line 148
    invoke-virtual {v1, v4}, Landroid/view/View;->setBackgroundColor(I)V

    .line 149
    .line 150
    new-instance v1, Landroidx/core/view/WindowInsetsControllerCompat;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 154
    move-result-object v4

    .line 155
    .line 156
    .line 157
    invoke-direct {v1, v0, v4}, Landroidx/core/view/WindowInsetsControllerCompat;-><init>(Landroid/view/Window;Landroid/view/View;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v1, v6}, Landroidx/core/view/WindowInsetsControllerCompat;->setAppearanceLightStatusBars(Z)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v1, v6}, Landroidx/core/view/WindowInsetsControllerCompat;->setAppearanceLightNavigationBars(Z)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 167
    move-result-object v0

    .line 168
    .line 169
    .line 170
    invoke-virtual {v0, v2, v3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 171
    return-void
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
.end method

.method public final m()V
    .locals 6

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    sget v2, Lcom/sumsub/sns/R$id;->sns_system_bars_owner:I

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, v2}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 20
    move-result-object v1

    .line 21
    .line 22
    instance-of v3, v1, Lcom/sumsub/sns/internal/features/presentation/camera/u;

    .line 23
    const/4 v4, 0x0

    .line 24
    .line 25
    if-eqz v3, :cond_0

    .line 26
    .line 27
    check-cast v1, Lcom/sumsub/sns/internal/features/presentation/camera/u;

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move-object v1, v4

    .line 30
    .line 31
    :goto_0
    if-nez v1, :cond_1

    .line 32
    goto :goto_1

    .line 33
    .line 34
    :cond_1
    iget-object v3, v1, Lcom/sumsub/sns/internal/features/presentation/camera/u;->a:Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 38
    move-result-object v5

    .line 39
    .line 40
    .line 41
    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 42
    move-result v3

    .line 43
    .line 44
    if-nez v3, :cond_2

    .line 45
    :goto_1
    return-void

    .line 46
    .line 47
    .line 48
    :cond_2
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 49
    move-result-object v3

    .line 50
    .line 51
    .line 52
    invoke-virtual {v3, v2, v4}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 53
    .line 54
    iget-object v2, v1, Lcom/sumsub/sns/internal/features/presentation/camera/u;->b:Lcom/sumsub/sns/internal/features/presentation/camera/v;

    .line 55
    .line 56
    iget v2, v2, Lcom/sumsub/sns/internal/features/presentation/camera/v;->a:I

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, v2}, Landroid/view/Window;->setStatusBarColor(I)V

    .line 60
    .line 61
    iget-object v2, v1, Lcom/sumsub/sns/internal/features/presentation/camera/u;->b:Lcom/sumsub/sns/internal/features/presentation/camera/v;

    .line 62
    .line 63
    iget v2, v2, Lcom/sumsub/sns/internal/features/presentation/camera/v;->b:I

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, v2}, Landroid/view/Window;->setNavigationBarColor(I)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 70
    move-result-object v2

    .line 71
    .line 72
    iget-object v3, v1, Lcom/sumsub/sns/internal/features/presentation/camera/u;->b:Lcom/sumsub/sns/internal/features/presentation/camera/v;

    .line 73
    .line 74
    iget v3, v3, Lcom/sumsub/sns/internal/features/presentation/camera/v;->c:I

    .line 75
    .line 76
    .line 77
    invoke-virtual {v2, v3}, Landroid/view/View;->setBackgroundColor(I)V

    .line 78
    .line 79
    new-instance v2, Landroidx/core/view/WindowInsetsControllerCompat;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 83
    move-result-object v3

    .line 84
    .line 85
    .line 86
    invoke-direct {v2, v0, v3}, Landroidx/core/view/WindowInsetsControllerCompat;-><init>(Landroid/view/Window;Landroid/view/View;)V

    .line 87
    .line 88
    iget-object v0, v1, Lcom/sumsub/sns/internal/features/presentation/camera/u;->b:Lcom/sumsub/sns/internal/features/presentation/camera/v;

    .line 89
    .line 90
    iget-boolean v0, v0, Lcom/sumsub/sns/internal/features/presentation/camera/v;->d:Z

    .line 91
    .line 92
    .line 93
    invoke-virtual {v2, v0}, Landroidx/core/view/WindowInsetsControllerCompat;->setAppearanceLightStatusBars(Z)V

    .line 94
    .line 95
    iget-object v0, v1, Lcom/sumsub/sns/internal/features/presentation/camera/u;->b:Lcom/sumsub/sns/internal/features/presentation/camera/v;

    .line 96
    .line 97
    iget-boolean v0, v0, Lcom/sumsub/sns/internal/features/presentation/camera/v;->e:Z

    .line 98
    .line 99
    .line 100
    invoke-virtual {v2, v0}, Landroidx/core/view/WindowInsetsControllerCompat;->setAppearanceLightNavigationBars(Z)V

    .line 101
    return-void
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
    .line 121
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
