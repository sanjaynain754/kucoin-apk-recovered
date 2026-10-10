.class public final Lcom/kubi/assets/options/positions/a;
.super Ljava/lang/Object;
.source "OptionsPositionEntityExt.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000c\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u00a8\u0006\u0003"
    }
    d2 = {
        "getTradeSideConfig",
        "Lcom/kubi/assets/options/positions/TradeSide;",
        "Lcom/kubi/assets/entity/OptionsPositionEntity;",
        "AssetsCenterLib_googleRelease"
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
.method public static final a(Lcom/kubi/assets/entity/OptionsPositionEntity;)Lcom/kubi/assets/options/positions/h;
    .locals 5
    .param p0    # Lcom/kubi/assets/entity/OptionsPositionEntity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

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
    invoke-virtual {p0}, Lcom/kubi/assets/entity/OptionsPositionEntity;->getSide()Ljava/lang/String;

    .line 9
    move-result-object p0

    .line 10
    .line 11
    const-string v0, "BUY"

    .line 12
    .line 13
    .line 14
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 15
    move-result v0

    .line 16
    const/4 v1, 0x2

    .line 17
    const/4 v2, 0x0

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    new-instance p0, Lcom/kubi/assets/options/positions/h;

    .line 22
    .line 23
    sget-object v0, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 24
    .line 25
    sget v3, Lcom/kubi/assets/R$color;->brandGreen:I

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v3}, Lcom/kubi/utils/c;->a(I)I

    .line 29
    move-result v3

    .line 30
    .line 31
    sget v4, Lcom/kubi/assets/R$drawable;->shape_primary8_4r:I

    .line 32
    .line 33
    .line 34
    invoke-static {v0, v4, v2, v1, v2}, Lcom/kubi/utils/c;->d(Lcom/kubi/utils/c;ILjava/lang/Integer;ILjava/lang/Object;)Landroid/graphics/drawable/Drawable;

    .line 35
    move-result-object v0

    .line 36
    .line 37
    sget v1, Lcom/kubi/assets/R$string;->buy:I

    .line 38
    .line 39
    .line 40
    invoke-direct {p0, v3, v0, v1}, Lcom/kubi/assets/options/positions/h;-><init>(ILandroid/graphics/drawable/Drawable;I)V

    .line 41
    return-object p0

    .line 42
    .line 43
    :cond_0
    const-string v0, "SELL"

    .line 44
    .line 45
    .line 46
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    move-result p0

    .line 48
    .line 49
    if-eqz p0, :cond_1

    .line 50
    .line 51
    new-instance p0, Lcom/kubi/assets/options/positions/h;

    .line 52
    .line 53
    sget-object v0, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 54
    .line 55
    sget v3, Lcom/kubi/assets/R$color;->brandRed:I

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, v3}, Lcom/kubi/utils/c;->a(I)I

    .line 59
    move-result v3

    .line 60
    .line 61
    sget v4, Lcom/kubi/assets/R$drawable;->shape_secondary8_4r:I

    .line 62
    .line 63
    .line 64
    invoke-static {v0, v4, v2, v1, v2}, Lcom/kubi/utils/c;->d(Lcom/kubi/utils/c;ILjava/lang/Integer;ILjava/lang/Object;)Landroid/graphics/drawable/Drawable;

    .line 65
    move-result-object v0

    .line 66
    .line 67
    sget v1, Lcom/kubi/assets/R$string;->sell:I

    .line 68
    .line 69
    .line 70
    invoke-direct {p0, v3, v0, v1}, Lcom/kubi/assets/options/positions/h;-><init>(ILandroid/graphics/drawable/Drawable;I)V

    .line 71
    return-object p0

    .line 72
    .line 73
    :cond_1
    new-instance p0, Lcom/kubi/assets/options/positions/h;

    .line 74
    .line 75
    sget-object v0, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 76
    .line 77
    sget v3, Lcom/kubi/assets/R$color;->c_text:I

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0, v3}, Lcom/kubi/utils/c;->a(I)I

    .line 81
    move-result v3

    .line 82
    .line 83
    sget v4, Lcom/kubi/assets/R$drawable;->shape_emphasis8_4r:I

    .line 84
    .line 85
    .line 86
    invoke-static {v0, v4, v2, v1, v2}, Lcom/kubi/utils/c;->d(Lcom/kubi/utils/c;ILjava/lang/Integer;ILjava/lang/Object;)Landroid/graphics/drawable/Drawable;

    .line 87
    move-result-object v0

    .line 88
    .line 89
    sget v1, Lcom/kubi/assets/R$string;->stub:I

    .line 90
    .line 91
    .line 92
    invoke-direct {p0, v3, v0, v1}, Lcom/kubi/assets/options/positions/h;-><init>(ILandroid/graphics/drawable/Drawable;I)V

    .line 93
    return-object p0
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
.end method
