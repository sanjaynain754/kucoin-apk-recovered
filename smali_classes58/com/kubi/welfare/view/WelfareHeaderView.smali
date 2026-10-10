.class public final Lcom/kubi/welfare/view/WelfareHeaderView;
.super Landroid/widget/FrameLayout;
.source "WelfareHeaderView.kt"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "ViewConstructor"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/welfare/view/WelfareHeaderView$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u0000 \u00102\u00020\u0001:\u0002\u0010\u0011B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0012\u0010\u000c\u001a\u00020\r2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/kubi/welfare/view/WelfareHeaderView;",
        "Landroid/widget/FrameLayout;",
        "context",
        "Landroid/content/Context;",
        "type",
        "",
        "<init>",
        "(Landroid/content/Context;I)V",
        "getType",
        "()I",
        "binding",
        "Lcom/kubi/welfare/databinding/KucoinLayoutWelfareHeaderBinding;",
        "setData",
        "",
        "entity",
        "Lcom/kubi/welfare/api/entity/WelfareInfoEntity$WelfareDetailEntity;",
        "Companion",
        "WelfareHeaderType",
        "WelfareLib_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final d:Lcom/kubi/welfare/view/WelfareHeaderView$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final b:I

.field public c:Lm80/a;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/welfare/view/WelfareHeaderView$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/kubi/welfare/view/WelfareHeaderView$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/kubi/welfare/view/WelfareHeaderView;->d:Lcom/kubi/welfare/view/WelfareHeaderView$Companion;

    .line 9
    return-void
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
.end method

.method public constructor <init>(Landroid/content/Context;I)V
    .locals 3
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    iput p2, p0, Lcom/kubi/welfare/view/WelfareHeaderView;->b:I

    .line 2
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/kubi/welfare/R$layout;->kucoin_layout_welfare_header:I

    invoke-virtual {v0, v1, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 3
    sget v0, Lcom/kubi/welfare/R$id;->layoutRoot:I

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lm80/a;->a(Landroid/view/View;)Lm80/a;

    move-result-object v0

    iput-object v0, p0, Lcom/kubi/welfare/view/WelfareHeaderView;->c:Lm80/a;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eq p2, v1, :cond_3

    const/4 v1, 0x2

    if-eq p2, v1, :cond_1

    const/4 p1, 0x3

    if-eq p2, p1, :cond_0

    goto :goto_0

    :cond_0
    if-eqz v0, :cond_5

    .line 4
    iget-object p1, v0, Lm80/a;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    if-eqz p1, :cond_5

    const/16 p2, 0x8

    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_1
    if-eqz v0, :cond_2

    .line 5
    iget-object p2, v0, Lm80/a;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    if-eqz p2, :cond_2

    invoke-virtual {p2, v2}, Landroid/view/View;->setVisibility(I)V

    .line 6
    :cond_2
    iget-object p2, p0, Lcom/kubi/welfare/view/WelfareHeaderView;->c:Lm80/a;

    if-eqz p2, :cond_5

    iget-object p2, p2, Lm80/a;->f:Landroid/widget/TextView;

    if-eqz p2, :cond_5

    sget v0, Lcom/kubi/welfare/R$string;->hold_kcs_num:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :cond_3
    if-eqz v0, :cond_4

    .line 7
    iget-object p2, v0, Lm80/a;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    if-eqz p2, :cond_4

    invoke-virtual {p2, v2}, Landroid/view/View;->setVisibility(I)V

    .line 8
    :cond_4
    iget-object p2, p0, Lcom/kubi/welfare/view/WelfareHeaderView;->c:Lm80/a;

    if-eqz p2, :cond_5

    iget-object p2, p2, Lm80/a;->f:Landroid/widget/TextView;

    if-eqz p2, :cond_5

    sget v0, Lcom/kubi/welfare/R$string;->invite_num:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_5
    :goto_0
    return-void
.end method


# virtual methods
.method public final getType()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/welfare/view/WelfareHeaderView;->b:I

    .line 3
    return v0
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
.end method

.method public final setData(Lcom/kubi/welfare/api/entity/WelfareInfoEntity$WelfareDetailEntity;)V
    .locals 19
    .param p1    # Lcom/kubi/welfare/api/entity/WelfareInfoEntity$WelfareDetailEntity;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SetTextI18n"
        }
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    sget-object v1, Lgf/n;->a:Lgf/n;

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    .line 10
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/welfare/api/entity/WelfareInfoEntity$WelfareDetailEntity;->getCurrency()Ljava/lang/String;

    .line 11
    move-result-object v3

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object v3, v2

    .line 14
    .line 15
    .line 16
    :goto_0
    invoke-static {v3}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 17
    move-result-object v3

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, v3}, Lgf/n;->u(Ljava/lang/String;)Lcom/kubi/data/entity/CoinInfoEntity;

    .line 21
    move-result-object v1

    .line 22
    .line 23
    iget-object v3, v0, Lcom/kubi/welfare/view/WelfareHeaderView;->c:Lm80/a;

    .line 24
    .line 25
    const/16 v4, 0x20

    .line 26
    .line 27
    if-eqz v3, :cond_4

    .line 28
    .line 29
    iget-object v3, v3, Lm80/a;->d:Lcom/kubi/resources/widget/ShowHideTextView;

    .line 30
    .line 31
    if-eqz v3, :cond_4

    .line 32
    .line 33
    new-instance v5, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 37
    .line 38
    if-eqz p1, :cond_1

    .line 39
    .line 40
    .line 41
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/welfare/api/entity/WelfareInfoEntity$WelfareDetailEntity;->getTotalAmount()Ljava/math/BigDecimal;

    .line 42
    move-result-object v6

    .line 43
    goto :goto_1

    .line 44
    :cond_1
    move-object v6, v2

    .line 45
    .line 46
    .line 47
    :goto_1
    invoke-static {v6}, Lcom/kubi/utils/extensions/d;->g(Ljava/math/BigDecimal;)D

    .line 48
    move-result-wide v7

    .line 49
    .line 50
    if-eqz v1, :cond_2

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1}, Lcom/kubi/data/entity/CoinInfoEntity;->getCode()Ljava/lang/String;

    .line 54
    move-result-object v6

    .line 55
    move-object v9, v6

    .line 56
    goto :goto_2

    .line 57
    :cond_2
    move-object v9, v2

    .line 58
    .line 59
    :goto_2
    const/16 v16, 0x7a

    .line 60
    .line 61
    const/16 v17, 0x0

    .line 62
    const/4 v10, 0x0

    .line 63
    const/4 v11, 0x1

    .line 64
    const/4 v12, 0x0

    .line 65
    const/4 v13, 0x0

    .line 66
    const/4 v14, 0x0

    .line 67
    const/4 v15, 0x0

    .line 68
    .line 69
    .line 70
    invoke-static/range {v7 .. v17}, Lgf/i;->j(DLjava/lang/String;Ljava/math/RoundingMode;ZZZZLjava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 71
    move-result-object v6

    .line 72
    .line 73
    .line 74
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    if-eqz v1, :cond_3

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1}, Lcom/kubi/data/entity/CoinInfoEntity;->getCurrency()Ljava/lang/String;

    .line 83
    move-result-object v6

    .line 84
    goto :goto_3

    .line 85
    :cond_3
    move-object v6, v2

    .line 86
    .line 87
    .line 88
    :goto_3
    invoke-static {v6}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 89
    move-result-object v6

    .line 90
    .line 91
    .line 92
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 96
    move-result-object v5

    .line 97
    .line 98
    .line 99
    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 100
    .line 101
    :cond_4
    iget-object v3, v0, Lcom/kubi/welfare/view/WelfareHeaderView;->c:Lm80/a;

    .line 102
    .line 103
    if-eqz v3, :cond_7

    .line 104
    .line 105
    iget-object v3, v3, Lm80/a;->g:Lcom/kubi/resources/widget/ShowHideTextView;

    .line 106
    .line 107
    if-eqz v3, :cond_7

    .line 108
    .line 109
    if-eqz p1, :cond_5

    .line 110
    .line 111
    .line 112
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/welfare/api/entity/WelfareInfoEntity$WelfareDetailEntity;->getTotalAmount()Ljava/math/BigDecimal;

    .line 113
    move-result-object v5

    .line 114
    goto :goto_4

    .line 115
    :cond_5
    move-object v5, v2

    .line 116
    .line 117
    .line 118
    :goto_4
    invoke-static {v5}, Lcom/kubi/utils/extensions/d;->g(Ljava/math/BigDecimal;)D

    .line 119
    move-result-wide v5

    .line 120
    .line 121
    if-eqz v1, :cond_6

    .line 122
    .line 123
    .line 124
    invoke-virtual {v1}, Lcom/kubi/data/entity/CoinInfoEntity;->getCode()Ljava/lang/String;

    .line 125
    move-result-object v7

    .line 126
    goto :goto_5

    .line 127
    :cond_6
    move-object v7, v2

    .line 128
    .line 129
    .line 130
    :goto_5
    invoke-static {v5, v6, v7}, Lkf/a;->m(DLjava/lang/String;)D

    .line 131
    move-result-wide v8

    .line 132
    .line 133
    const/16 v17, 0x7f

    .line 134
    .line 135
    const/16 v18, 0x0

    .line 136
    const/4 v10, 0x0

    .line 137
    const/4 v11, 0x0

    .line 138
    const/4 v12, 0x0

    .line 139
    const/4 v13, 0x0

    .line 140
    const/4 v14, 0x0

    .line 141
    const/4 v15, 0x0

    .line 142
    .line 143
    const/16 v16, 0x0

    .line 144
    .line 145
    .line 146
    invoke-static/range {v8 .. v18}, Lkf/a;->x(DLjava/lang/String;Ljava/math/RoundingMode;IZZZZILjava/lang/Object;)Ljava/lang/String;

    .line 147
    move-result-object v5

    .line 148
    .line 149
    .line 150
    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 151
    .line 152
    :cond_7
    iget v3, v0, Lcom/kubi/welfare/view/WelfareHeaderView;->b:I

    .line 153
    const/4 v5, 0x1

    .line 154
    .line 155
    if-eq v3, v5, :cond_e

    .line 156
    const/4 v5, 0x2

    .line 157
    .line 158
    if-eq v3, v5, :cond_8

    .line 159
    .line 160
    goto/16 :goto_7

    .line 161
    .line 162
    :cond_8
    if-eqz p1, :cond_a

    .line 163
    .line 164
    .line 165
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/welfare/api/entity/WelfareInfoEntity$WelfareDetailEntity;->getExpandNum()Ljava/math/BigDecimal;

    .line 166
    move-result-object v6

    .line 167
    .line 168
    if-eqz v6, :cond_a

    .line 169
    .line 170
    if-eqz v1, :cond_9

    .line 171
    .line 172
    .line 173
    invoke-virtual {v1}, Lcom/kubi/data/entity/CoinInfoEntity;->getCode()Ljava/lang/String;

    .line 174
    move-result-object v3

    .line 175
    move-object v7, v3

    .line 176
    goto :goto_6

    .line 177
    :cond_9
    move-object v7, v2

    .line 178
    .line 179
    :goto_6
    const/16 v15, 0xf6

    .line 180
    .line 181
    const/16 v16, 0x0

    .line 182
    const/4 v8, 0x0

    .line 183
    const/4 v9, 0x0

    .line 184
    const/4 v10, 0x1

    .line 185
    const/4 v11, 0x0

    .line 186
    const/4 v12, 0x0

    .line 187
    const/4 v13, 0x0

    .line 188
    const/4 v14, 0x0

    .line 189
    .line 190
    .line 191
    invoke-static/range {v6 .. v16}, Lgf/i;->l(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/RoundingMode;IZZZZLjava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 192
    move-result-object v3

    .line 193
    .line 194
    if-nez v3, :cond_b

    .line 195
    .line 196
    :cond_a
    const-string v3, "--"

    .line 197
    .line 198
    :cond_b
    iget-object v5, v0, Lcom/kubi/welfare/view/WelfareHeaderView;->c:Lm80/a;

    .line 199
    .line 200
    if-eqz v5, :cond_c

    .line 201
    .line 202
    iget-object v5, v5, Lm80/a;->i:Lcom/kubi/resources/widget/ShowHideTextView;

    .line 203
    .line 204
    if-eqz v5, :cond_c

    .line 205
    .line 206
    .line 207
    invoke-virtual {v5, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 208
    .line 209
    :cond_c
    iget-object v3, v0, Lcom/kubi/welfare/view/WelfareHeaderView;->c:Lm80/a;

    .line 210
    .line 211
    if-eqz v3, :cond_11

    .line 212
    .line 213
    iget-object v3, v3, Lm80/a;->e:Landroid/widget/TextView;

    .line 214
    .line 215
    if-eqz v3, :cond_11

    .line 216
    .line 217
    new-instance v5, Ljava/lang/StringBuilder;

    .line 218
    .line 219
    .line 220
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 224
    .line 225
    if-eqz v1, :cond_d

    .line 226
    .line 227
    .line 228
    invoke-virtual {v1}, Lcom/kubi/data/entity/CoinInfoEntity;->getCurrency()Ljava/lang/String;

    .line 229
    move-result-object v2

    .line 230
    .line 231
    .line 232
    :cond_d
    invoke-static {v2}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 233
    move-result-object v1

    .line 234
    .line 235
    .line 236
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 237
    .line 238
    .line 239
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 240
    move-result-object v1

    .line 241
    .line 242
    .line 243
    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 244
    return-void

    .line 245
    .line 246
    :cond_e
    iget-object v1, v0, Lcom/kubi/welfare/view/WelfareHeaderView;->c:Lm80/a;

    .line 247
    .line 248
    if-eqz v1, :cond_f

    .line 249
    .line 250
    iget-object v1, v1, Lm80/a;->e:Landroid/widget/TextView;

    .line 251
    .line 252
    if-eqz v1, :cond_f

    .line 253
    .line 254
    const-string v3, ""

    .line 255
    .line 256
    .line 257
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 258
    .line 259
    :cond_f
    iget-object v1, v0, Lcom/kubi/welfare/view/WelfareHeaderView;->c:Lm80/a;

    .line 260
    .line 261
    if-eqz v1, :cond_11

    .line 262
    .line 263
    iget-object v1, v1, Lm80/a;->i:Lcom/kubi/resources/widget/ShowHideTextView;

    .line 264
    .line 265
    if-eqz v1, :cond_11

    .line 266
    .line 267
    sget-object v3, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 268
    .line 269
    sget v4, Lcom/kubi/welfare/R$string;->people_stub:I

    .line 270
    .line 271
    if-eqz p1, :cond_10

    .line 272
    .line 273
    .line 274
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/welfare/api/entity/WelfareInfoEntity$WelfareDetailEntity;->getExpandNum()Ljava/math/BigDecimal;

    .line 275
    move-result-object v5

    .line 276
    .line 277
    if-eqz v5, :cond_10

    .line 278
    .line 279
    .line 280
    invoke-virtual {v5}, Ljava/math/BigDecimal;->intValue()I

    .line 281
    move-result v2

    .line 282
    .line 283
    .line 284
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 285
    move-result-object v2

    .line 286
    .line 287
    .line 288
    :cond_10
    invoke-static {v2}, Lcom/kubi/utils/extensions/d;->j(Ljava/lang/Integer;)I

    .line 289
    move-result v2

    .line 290
    .line 291
    .line 292
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 293
    move-result-object v2

    .line 294
    .line 295
    .line 296
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 297
    move-result-object v2

    .line 298
    .line 299
    .line 300
    invoke-virtual {v3, v4, v2}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 301
    move-result-object v2

    .line 302
    .line 303
    .line 304
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 305
    :cond_11
    :goto_7
    return-void
.end method
