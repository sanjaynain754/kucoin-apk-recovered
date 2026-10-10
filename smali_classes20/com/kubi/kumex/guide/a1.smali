.class public final Lcom/kubi/kumex/guide/a1;
.super Ljava/lang/Object;
.source "GuideStepView.kt"

# interfaces
.implements Lcom/kubi/resources/guideview/b;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0008\u0010\u0011\u001a\u00020\u0003H\u0016J\u0008\u0010\u0012\u001a\u00020\u0003H\u0016J\u0008\u0010\u0013\u001a\u00020\u0003H\u0016J\u0008\u0010\u0014\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0014\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/kubi/kumex/guide/TransferAssetsStep;",
        "Lcom/kubi/resources/guideview/Component;",
        "rectLength",
        "",
        "next",
        "Lkotlin/Function0;",
        "",
        "<init>",
        "(ILkotlin/jvm/functions/Function0;)V",
        "getRectLength",
        "()I",
        "right",
        "",
        "getView",
        "Landroid/view/View;",
        "inflater",
        "Landroid/view/LayoutInflater;",
        "getAnchor",
        "getFitPosition",
        "getYOffset",
        "getXOffset",
        "KumexLib_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final a:I

.field public final b:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Z


# direct methods
.method public constructor <init>(ILkotlin/jvm/functions/Function0;)V
    .locals 1
    .param p2    # Lkotlin/jvm/functions/Function0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "next"

    .line 3
    .line 4
    .line 5
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    iput p1, p0, Lcom/kubi/kumex/guide/a1;->a:I

    .line 11
    .line 12
    iput-object p2, p0, Lcom/kubi/kumex/guide/a1;->b:Lkotlin/jvm/functions/Function0;

    .line 13
    .line 14
    const-string p1, "trade_panel_position"

    .line 15
    const/4 p2, 0x1

    .line 16
    .line 17
    .line 18
    invoke-static {p1, p2}, Lcom/kubi/utils/n;->b(Ljava/lang/String;I)I

    .line 19
    move-result p1

    .line 20
    .line 21
    if-ne p1, p2, :cond_0

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 p2, 0x0

    .line 24
    .line 25
    :goto_0
    iput-boolean p2, p0, Lcom/kubi/kumex/guide/a1;->c:Z

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
.end method

.method public static synthetic f(Lcom/kubi/kumex/guide/a1;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/kumex/guide/a1;->g(Lcom/kubi/kumex/guide/a1;)Lkotlin/Unit;

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
.end method

.method public static final g(Lcom/kubi/kumex/guide/a1;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/kumex/guide/a1;->b:Lkotlin/jvm/functions/Function0;

    .line 3
    .line 4
    .line 5
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 6
    .line 7
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 8
    return-object p0
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
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/kubi/kumex/guide/a1;->c:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    const/high16 v0, 0x41f00000    # 30.0f

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Lcom/blankj/utilcode/util/i0;->a(F)I

    .line 10
    move-result v0

    .line 11
    neg-int v0, v0

    .line 12
    return v0

    .line 13
    .line 14
    :cond_0
    const/16 v0, 0x8

    .line 15
    return v0
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
.end method

.method public b()I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
    .line 3
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
.end method

.method public c()I
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    return v0
    .line 3
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
.end method

.method public d()I
    .locals 1

    .line 1
    .line 2
    const/16 v0, 0x10

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
.end method

.method public e(Landroid/view/LayoutInflater;)Landroid/view/View;
    .locals 18
    .param p1    # Landroid/view/LayoutInflater;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v1, p1

    .line 5
    .line 6
    const-string v2, "inflater"

    .line 7
    .line 8
    .line 9
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    sget v2, Lcom/kubi/kumex/R$layout;->bkumex_guide_futures_step:I

    .line 12
    const/4 v3, 0x0

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    sget v3, Lcom/kubi/kumex/R$id;->bubble:I

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 22
    move-result-object v2

    .line 23
    .line 24
    check-cast v2, Lcom/cpiz/android/bubbleview/BubbleLinearLayout;

    .line 25
    .line 26
    sget-object v4, Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowDirection;->Down:Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowDirection;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2, v4}, Lcom/cpiz/android/bubbleview/BubbleLinearLayout;->setArrowDirection(Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowDirection;)V

    .line 30
    .line 31
    sget v4, Lcom/kubi/kumex/R$id;->bubbleTitle:I

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 35
    move-result-object v5

    .line 36
    .line 37
    check-cast v5, Landroid/widget/TextView;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 41
    move-result-object v6

    .line 42
    .line 43
    sget v7, Lcom/kubi/kumex/R$string;->welfare_transfer_in_assets:I

    .line 44
    .line 45
    .line 46
    invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 47
    move-result-object v6

    .line 48
    .line 49
    .line 50
    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 54
    move-result-object v4

    .line 55
    .line 56
    const-string v5, "findViewById(...)"

    .line 57
    .line 58
    .line 59
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    .line 61
    check-cast v4, Landroid/widget/TextView;

    .line 62
    .line 63
    .line 64
    invoke-static {v4}, Lcom/kubi/kumex/utils/ViewExKt;->i(Landroid/widget/TextView;)V

    .line 65
    .line 66
    sget v4, Lcom/kubi/kumex/R$id;->bubbleContent:I

    .line 67
    .line 68
    .line 69
    invoke-virtual {v2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 70
    move-result-object v4

    .line 71
    .line 72
    check-cast v4, Landroid/widget/TextView;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 76
    move-result-object v6

    .line 77
    .line 78
    sget v7, Lcom/kubi/kumex/R$string;->transfer_to_contract_accounts:I

    .line 79
    .line 80
    .line 81
    invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 82
    move-result-object v6

    .line 83
    .line 84
    .line 85
    invoke-virtual {v4, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 89
    move-result-object v4

    .line 90
    .line 91
    const-string v8, "getContext(...)"

    .line 92
    .line 93
    .line 94
    invoke-static {v4, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 95
    .line 96
    const/16 v6, 0x10

    .line 97
    .line 98
    .line 99
    invoke-static {v4, v6}, Lcom/kubi/utils/extensions/c;->c(Landroid/content/Context;I)F

    .line 100
    move-result v4

    .line 101
    float-to-int v4, v4

    .line 102
    .line 103
    .line 104
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 105
    move-result-object v7

    .line 106
    .line 107
    .line 108
    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 109
    .line 110
    const/16 v9, 0xc

    .line 111
    .line 112
    .line 113
    invoke-static {v7, v9}, Lcom/kubi/utils/extensions/c;->c(Landroid/content/Context;I)F

    .line 114
    move-result v7

    .line 115
    float-to-int v7, v7

    .line 116
    .line 117
    .line 118
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 119
    move-result-object v9

    .line 120
    .line 121
    .line 122
    invoke-static {v9, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    invoke-static {v9, v6}, Lcom/kubi/utils/extensions/c;->c(Landroid/content/Context;I)F

    .line 126
    move-result v6

    .line 127
    float-to-int v6, v6

    .line 128
    .line 129
    .line 130
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 131
    move-result-object v9

    .line 132
    .line 133
    .line 134
    invoke-static {v9, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 135
    .line 136
    const/16 v10, 0xe

    .line 137
    .line 138
    .line 139
    invoke-static {v9, v10}, Lcom/kubi/utils/extensions/c;->c(Landroid/content/Context;I)F

    .line 140
    move-result v9

    .line 141
    float-to-int v9, v9

    .line 142
    .line 143
    .line 144
    invoke-virtual {v2, v4, v7, v6, v9}, Lcom/cpiz/android/bubbleview/BubbleLinearLayout;->setPadding(IIII)V

    .line 145
    .line 146
    sget v2, Lcom/kubi/kumex/R$id;->skip:I

    .line 147
    .line 148
    .line 149
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 150
    move-result-object v2

    .line 151
    .line 152
    .line 153
    invoke-static {v2, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    invoke-static {v2}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 157
    .line 158
    sget v10, Lcom/kubi/kumex/R$id;->next:I

    .line 159
    .line 160
    .line 161
    invoke-virtual {v1, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 162
    move-result-object v11

    .line 163
    .line 164
    .line 165
    invoke-static {v11, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 166
    .line 167
    new-instance v14, Lcom/kubi/kumex/guide/z0;

    .line 168
    .line 169
    .line 170
    invoke-direct {v14, v0}, Lcom/kubi/kumex/guide/z0;-><init>(Lcom/kubi/kumex/guide/a1;)V

    .line 171
    const/4 v15, 0x1

    .line 172
    .line 173
    const/16 v16, 0x0

    .line 174
    .line 175
    const-wide/16 v12, 0x0

    .line 176
    .line 177
    .line 178
    invoke-static/range {v11 .. v16}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v1, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 182
    move-result-object v2

    .line 183
    .line 184
    check-cast v2, Landroid/widget/TextView;

    .line 185
    .line 186
    .line 187
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 188
    move-result-object v4

    .line 189
    .line 190
    sget v5, Lcom/kubi/kumex/R$string;->task_dialog_known:I

    .line 191
    .line 192
    .line 193
    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 194
    move-result-object v4

    .line 195
    .line 196
    .line 197
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 198
    .line 199
    new-instance v11, Landroidx/constraintlayout/widget/ConstraintSet;

    .line 200
    .line 201
    .line 202
    invoke-direct {v11}, Landroidx/constraintlayout/widget/ConstraintSet;-><init>()V

    .line 203
    .line 204
    const-string v2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout"

    .line 205
    .line 206
    .line 207
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 208
    move-object v9, v1

    .line 209
    .line 210
    check-cast v9, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 211
    .line 212
    .line 213
    invoke-virtual {v11, v9}, Landroidx/constraintlayout/widget/ConstraintSet;->clone(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v9}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 217
    move-result-object v2

    .line 218
    .line 219
    .line 220
    invoke-static {v2, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 221
    .line 222
    const/16 v4, 0x3c

    .line 223
    .line 224
    .line 225
    invoke-static {v2, v4}, Lcom/kubi/utils/extensions/c;->c(Landroid/content/Context;I)F

    .line 226
    move-result v2

    .line 227
    float-to-int v7, v2

    .line 228
    const/4 v4, 0x3

    .line 229
    const/4 v5, 0x0

    .line 230
    const/4 v6, 0x3

    .line 231
    move-object v2, v11

    .line 232
    .line 233
    .line 234
    invoke-virtual/range {v2 .. v7}, Landroidx/constraintlayout/widget/ConstraintSet;->connect(IIIII)V

    .line 235
    .line 236
    sget v12, Lcom/kubi/kumex/R$id;->dot:I

    .line 237
    .line 238
    iget v2, v0, Lcom/kubi/kumex/guide/a1;->a:I

    .line 239
    .line 240
    div-int/lit8 v2, v2, 0x2

    .line 241
    int-to-float v2, v2

    .line 242
    .line 243
    .line 244
    invoke-virtual {v9}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 245
    move-result-object v4

    .line 246
    .line 247
    .line 248
    invoke-static {v4, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 249
    .line 250
    const/high16 v5, 0x40f00000    # 7.5f

    .line 251
    .line 252
    .line 253
    invoke-static {v4, v5}, Lcom/kubi/utils/extensions/c;->b(Landroid/content/Context;F)F

    .line 254
    move-result v4

    .line 255
    sub-float/2addr v2, v4

    .line 256
    float-to-int v2, v2

    .line 257
    const/4 v13, 0x6

    .line 258
    const/4 v14, 0x0

    .line 259
    const/4 v15, 0x6

    .line 260
    .line 261
    move/from16 v16, v2

    .line 262
    .line 263
    .line 264
    invoke-virtual/range {v11 .. v16}, Landroidx/constraintlayout/widget/ConstraintSet;->connect(IIIII)V

    .line 265
    const/4 v15, 0x4

    .line 266
    .line 267
    const/16 v16, 0x0

    .line 268
    const/4 v13, 0x4

    .line 269
    .line 270
    .line 271
    invoke-virtual/range {v11 .. v16}, Landroidx/constraintlayout/widget/ConstraintSet;->connect(IIIII)V

    .line 272
    .line 273
    sget v12, Lcom/kubi/kumex/R$id;->line:I

    .line 274
    .line 275
    .line 276
    invoke-virtual {v9}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 277
    move-result-object v2

    .line 278
    .line 279
    .line 280
    invoke-static {v2, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 281
    const/4 v4, 0x4

    .line 282
    .line 283
    .line 284
    invoke-static {v2, v4}, Lcom/kubi/utils/extensions/c;->c(Landroid/content/Context;I)F

    .line 285
    move-result v2

    .line 286
    float-to-int v2, v2

    .line 287
    .line 288
    move/from16 v16, v2

    .line 289
    .line 290
    .line 291
    invoke-virtual/range {v11 .. v16}, Landroidx/constraintlayout/widget/ConstraintSet;->connect(IIIII)V

    .line 292
    .line 293
    iget v2, v0, Lcom/kubi/kumex/guide/a1;->a:I

    .line 294
    .line 295
    div-int/lit8 v16, v2, 0x2

    .line 296
    const/4 v13, 0x6

    .line 297
    const/4 v15, 0x6

    .line 298
    .line 299
    .line 300
    invoke-virtual/range {v11 .. v16}, Landroidx/constraintlayout/widget/ConstraintSet;->connect(IIIII)V

    .line 301
    const/4 v2, 0x3

    .line 302
    .line 303
    .line 304
    invoke-virtual {v11, v10, v2, v3, v4}, Landroidx/constraintlayout/widget/ConstraintSet;->connect(IIII)V

    .line 305
    .line 306
    .line 307
    invoke-virtual {v9}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 308
    move-result-object v2

    .line 309
    .line 310
    .line 311
    invoke-static {v2, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 312
    .line 313
    const/16 v3, 0x12

    .line 314
    .line 315
    .line 316
    invoke-static {v2, v3}, Lcom/kubi/utils/extensions/c;->c(Landroid/content/Context;I)F

    .line 317
    move-result v2

    .line 318
    float-to-int v14, v2

    .line 319
    move-object v2, v11

    .line 320
    const/4 v11, 0x4

    .line 321
    const/4 v12, 0x0

    .line 322
    const/4 v13, 0x4

    .line 323
    .line 324
    move-object/from16 v17, v9

    .line 325
    move-object v9, v2

    .line 326
    .line 327
    move-object/from16 v2, v17

    .line 328
    .line 329
    .line 330
    invoke-virtual/range {v9 .. v14}, Landroidx/constraintlayout/widget/ConstraintSet;->connect(IIIII)V

    .line 331
    move-object v11, v9

    .line 332
    .line 333
    .line 334
    invoke-virtual {v11, v2}, Landroidx/constraintlayout/widget/ConstraintSet;->applyTo(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    .line 335
    .line 336
    const-string v2, "apply(...)"

    .line 337
    .line 338
    .line 339
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 340
    return-object v1
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
.end method
