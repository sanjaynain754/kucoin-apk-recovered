.class public final Lcom/kubi/kucoin/utils/b;
.super Ljava/lang/Object;
.source "AsyncBottomTabDrawable.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a&\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\tH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"
    }
    d2 = {
        "TAG",
        "",
        "bindAsyncBottomDrawable",
        "",
        "Landroid/widget/RadioButton;",
        "assetName",
        "normalRes",
        "",
        "gateway",
        "Lcom/kubi/kucoin/utils/BottomLottieGateway;",
        "LAppFacade_googleRelease"
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
.method public static final a(Landroid/widget/RadioButton;Ljava/lang/String;ILcom/kubi/kucoin/utils/g;)V
    .locals 6
    .param p0    # Landroid/widget/RadioButton;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/kubi/kucoin/utils/g;
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
    const-string v0, "assetName"

    .line 8
    .line 9
    .line 10
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    const-string v0, "gateway"

    .line 13
    .line 14
    .line 15
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    sget v0, Lcom/kubi/app/facade/R$id;->bottom_lottie_binding_tag:I

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 21
    move-result-object v1

    .line 22
    .line 23
    instance-of v2, v1, Lcom/kubi/kucoin/utils/a;

    .line 24
    const/4 v3, 0x0

    .line 25
    .line 26
    if-eqz v2, :cond_0

    .line 27
    .line 28
    check-cast v1, Lcom/kubi/kucoin/utils/a;

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    move-object v1, v3

    .line 31
    .line 32
    :goto_0
    if-eqz v1, :cond_1

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1}, Lcom/kubi/kucoin/utils/a;->a()V

    .line 36
    .line 37
    .line 38
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 39
    move-result-object v1

    .line 40
    .line 41
    .line 42
    invoke-static {v1, p2}, Landroidx/appcompat/content/res/AppCompatResources;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 43
    move-result-object v1

    .line 44
    .line 45
    if-eqz v1, :cond_4

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 49
    move-result-object v1

    .line 50
    .line 51
    if-nez v1, :cond_2

    .line 52
    goto :goto_1

    .line 53
    .line 54
    :cond_2
    sget-object v2, Lcom/kubi/kucoin/utils/BottomMenuHelper;->a:Lcom/kubi/kucoin/utils/BottomMenuHelper;

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 58
    move-result-object v4

    .line 59
    .line 60
    const-string v5, "getContext(...)"

    .line 61
    .line 62
    .line 63
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v2, v4, p2}, Lcom/kubi/kucoin/utils/BottomMenuHelper;->h(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 67
    move-result-object p2

    .line 68
    .line 69
    if-nez p2, :cond_3

    .line 70
    goto :goto_1

    .line 71
    .line 72
    :cond_3
    new-instance v2, Lcom/kubi/kucoin/utils/a;

    .line 73
    .line 74
    .line 75
    invoke-direct {v2, p0, p1, p2, p3}, Lcom/kubi/kucoin/utils/a;-><init>(Landroid/widget/RadioButton;Ljava/lang/String;Landroid/graphics/drawable/Drawable;Lcom/kubi/kucoin/utils/g;)V

    .line 76
    .line 77
    new-instance p1, Lcom/kubi/kucoin/utils/b$a;

    .line 78
    .line 79
    .line 80
    invoke-direct {p1, v2}, Lcom/kubi/kucoin/utils/b$a;-><init>(Lcom/kubi/kucoin/utils/a;)V

    .line 81
    .line 82
    .line 83
    const p2, 0x10100a0

    .line 84
    .line 85
    .line 86
    filled-new-array {p2}, [I

    .line 87
    move-result-object p2

    .line 88
    .line 89
    .line 90
    invoke-virtual {v2}, Lcom/kubi/kucoin/utils/a;->b()Lcom/kubi/kucoin/utils/v;

    .line 91
    move-result-object p3

    .line 92
    .line 93
    .line 94
    invoke-virtual {p1, p2, p3}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 95
    const/4 p2, 0x0

    .line 96
    .line 97
    new-array p3, p2, [I

    .line 98
    .line 99
    .line 100
    invoke-virtual {p1, p3, v1}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getMinimumWidth()I

    .line 104
    move-result p3

    .line 105
    .line 106
    .line 107
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getMinimumHeight()I

    .line 108
    move-result v1

    .line 109
    .line 110
    .line 111
    invoke-virtual {p1, p2, p2, p3, v1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p0, v0, v2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {p0, v2}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 118
    .line 119
    const/high16 p2, 0x3f800000    # 1.0f

    .line 120
    .line 121
    .line 122
    invoke-static {p2}, Lcom/blankj/utilcode/util/i0;->a(F)I

    .line 123
    move-result p2

    .line 124
    .line 125
    .line 126
    invoke-virtual {p0, p2}, Landroid/widget/TextView;->setCompoundDrawablePadding(I)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {p0, v3, p1, v3, v3}, Landroid/widget/TextView;->setCompoundDrawablesRelative(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {p0}, Landroid/widget/CompoundButton;->isChecked()Z

    .line 133
    move-result p0

    .line 134
    .line 135
    .line 136
    invoke-virtual {v2, p0}, Lcom/kubi/kucoin/utils/a;->c(Z)V

    .line 137
    :cond_4
    :goto_1
    return-void
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
.end method

.method public static synthetic b(Landroid/widget/RadioButton;Ljava/lang/String;ILcom/kubi/kucoin/utils/g;ILjava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    and-int/lit8 p4, p4, 0x4

    .line 3
    .line 4
    if-eqz p4, :cond_0

    .line 5
    .line 6
    sget-object p3, Lcom/kubi/kucoin/utils/s;->a:Lcom/kubi/kucoin/utils/s;

    .line 7
    .line 8
    .line 9
    :cond_0
    invoke-static {p0, p1, p2, p3}, Lcom/kubi/kucoin/utils/b;->a(Landroid/widget/RadioButton;Ljava/lang/String;ILcom/kubi/kucoin/utils/g;)V

    .line 10
    return-void
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
.end method
