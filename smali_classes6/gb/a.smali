.class public Lgb/a;
.super Ljava/lang/Object;
.source "BaseMapper.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0006\n\u0002\u0008\u0002\u0008\u0016\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\u0008\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0003J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0003\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/kubi/assets/overview/ongoing/mapper/BaseMapper;",
        "",
        "<init>",
        "()V",
        "getCardBackground",
        "",
        "rate",
        "",
        "getUpGreenBackground",
        "rateAsDouble",
        "",
        "getUpBackground",
        "AssetsCenterLib_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    return-void
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
.end method


# virtual methods
.method public final a(Ljava/lang/String;)I
    .locals 4
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    .line 7
    invoke-static {p1, v2, v3, v0, v1}, Lcom/kubi/utils/extensions/DowngradeExKt;->h(Ljava/lang/String;DILjava/lang/Object;)D

    .line 8
    move-result-wide v0

    .line 9
    .line 10
    sget-object p1, Lcom/kubi/kucoin/utils/r;->a:Lcom/kubi/kucoin/utils/r;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/kubi/kucoin/utils/r;->n()Z

    .line 14
    move-result p1

    .line 15
    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, v0, v1}, Lgb/a;->c(D)I

    .line 20
    move-result p1

    .line 21
    return p1

    .line 22
    .line 23
    .line 24
    :cond_0
    invoke-virtual {p0, v0, v1}, Lgb/a;->b(D)I

    .line 25
    move-result p1

    .line 26
    return p1
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

.method public final b(D)I
    .locals 5
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "KCCyclomaticComplexityCheck"
        }
    .end annotation

    .line 1
    .line 2
    const-wide/16 v0, 0x0

    .line 3
    .line 4
    cmpg-double v2, p1, v0

    .line 5
    .line 6
    if-nez v2, :cond_0

    .line 7
    .line 8
    sget p1, Lcom/kubi/assets/R$color;->c_transparent:I

    .line 9
    return p1

    .line 10
    .line 11
    :cond_0
    cmpg-double v0, v0, p1

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    const-wide v3, 0x3fc999999999999aL    # 0.2

    .line 17
    .line 18
    if-gtz v0, :cond_1

    .line 19
    .line 20
    cmpg-double v0, p1, v3

    .line 21
    .line 22
    if-gtz v0, :cond_1

    .line 23
    .line 24
    sget p1, Lcom/kubi/assets/R$mipmap;->asset_bg_ongoing_red_1:I

    .line 25
    return p1

    .line 26
    .line 27
    :cond_1
    cmpg-double v0, v3, p1

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    const-wide v3, 0x3fd999999999999aL    # 0.4

    .line 33
    .line 34
    if-gtz v0, :cond_2

    .line 35
    .line 36
    cmpg-double v0, p1, v3

    .line 37
    .line 38
    if-gtz v0, :cond_2

    .line 39
    .line 40
    sget p1, Lcom/kubi/assets/R$mipmap;->asset_bg_ongoing_red_2:I

    .line 41
    return p1

    .line 42
    .line 43
    :cond_2
    cmpg-double v0, v3, p1

    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    const-wide v3, 0x3fe3333333333333L    # 0.6

    .line 49
    .line 50
    if-gtz v0, :cond_3

    .line 51
    .line 52
    cmpg-double v0, p1, v3

    .line 53
    .line 54
    if-gtz v0, :cond_3

    .line 55
    .line 56
    sget p1, Lcom/kubi/assets/R$mipmap;->asset_bg_ongoing_red_3:I

    .line 57
    return p1

    .line 58
    .line 59
    :cond_3
    cmpg-double v0, v3, p1

    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    const-wide v3, 0x3fe999999999999aL    # 0.8

    .line 65
    .line 66
    if-gtz v0, :cond_4

    .line 67
    .line 68
    cmpg-double v0, p1, v3

    .line 69
    .line 70
    if-gtz v0, :cond_4

    .line 71
    .line 72
    sget p1, Lcom/kubi/assets/R$mipmap;->asset_bg_ongoing_red_4:I

    .line 73
    return p1

    .line 74
    .line 75
    :cond_4
    cmpg-double v0, v3, p1

    .line 76
    .line 77
    const-wide/high16 v3, 0x3ff0000000000000L    # 1.0

    .line 78
    .line 79
    if-gtz v0, :cond_5

    .line 80
    .line 81
    cmpg-double v0, p1, v3

    .line 82
    .line 83
    if-gtz v0, :cond_5

    .line 84
    .line 85
    sget p1, Lcom/kubi/assets/R$mipmap;->asset_bg_ongoing_red_5:I

    .line 86
    return p1

    .line 87
    .line 88
    :cond_5
    cmpl-double v0, p1, v3

    .line 89
    .line 90
    if-lez v0, :cond_6

    .line 91
    .line 92
    sget p1, Lcom/kubi/assets/R$mipmap;->asset_bg_ongoing_red_6:I

    .line 93
    return p1

    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    :cond_6
    const-wide v0, -0x4036666666666666L    # -0.2

    .line 99
    .line 100
    cmpg-double v3, v0, p1

    .line 101
    .line 102
    if-gtz v3, :cond_7

    .line 103
    .line 104
    if-gtz v2, :cond_7

    .line 105
    .line 106
    sget p1, Lcom/kubi/assets/R$mipmap;->asset_bg_ongoing_green_1:I

    .line 107
    return p1

    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    :cond_7
    const-wide v2, -0x4026666666666666L    # -0.4

    .line 113
    .line 114
    cmpg-double v4, v2, p1

    .line 115
    .line 116
    if-gtz v4, :cond_8

    .line 117
    .line 118
    cmpg-double v0, p1, v0

    .line 119
    .line 120
    if-gtz v0, :cond_8

    .line 121
    .line 122
    sget p1, Lcom/kubi/assets/R$mipmap;->asset_bg_ongoing_green_2:I

    .line 123
    return p1

    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    :cond_8
    const-wide v0, -0x401ccccccccccccdL    # -0.6

    .line 129
    .line 130
    cmpg-double v4, v0, p1

    .line 131
    .line 132
    if-gtz v4, :cond_9

    .line 133
    .line 134
    cmpg-double v2, p1, v2

    .line 135
    .line 136
    if-gtz v2, :cond_9

    .line 137
    .line 138
    sget p1, Lcom/kubi/assets/R$mipmap;->asset_bg_ongoing_green_3:I

    .line 139
    return p1

    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    :cond_9
    const-wide v2, -0x4016666666666666L    # -0.8

    .line 145
    .line 146
    cmpg-double v4, v2, p1

    .line 147
    .line 148
    if-gtz v4, :cond_a

    .line 149
    .line 150
    cmpg-double v0, p1, v0

    .line 151
    .line 152
    if-gtz v0, :cond_a

    .line 153
    .line 154
    sget p1, Lcom/kubi/assets/R$mipmap;->asset_bg_ongoing_green_4:I

    .line 155
    return p1

    .line 156
    .line 157
    :cond_a
    const-wide/high16 v0, -0x4010000000000000L    # -1.0

    .line 158
    .line 159
    cmpg-double v4, v0, p1

    .line 160
    .line 161
    if-gtz v4, :cond_b

    .line 162
    .line 163
    cmpg-double v2, p1, v2

    .line 164
    .line 165
    if-gtz v2, :cond_b

    .line 166
    .line 167
    sget p1, Lcom/kubi/assets/R$mipmap;->asset_bg_ongoing_green_5:I

    .line 168
    return p1

    .line 169
    .line 170
    :cond_b
    cmpg-double p1, p1, v0

    .line 171
    .line 172
    if-gez p1, :cond_c

    .line 173
    .line 174
    sget p1, Lcom/kubi/assets/R$mipmap;->asset_bg_ongoing_green_6:I

    .line 175
    return p1

    .line 176
    .line 177
    :cond_c
    sget p1, Lcom/kubi/assets/R$color;->c_transparent:I

    .line 178
    return p1
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

.method public final c(D)I
    .locals 5
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "KCCyclomaticComplexityCheck"
        }
    .end annotation

    .line 1
    .line 2
    const-wide/16 v0, 0x0

    .line 3
    .line 4
    cmpg-double v2, p1, v0

    .line 5
    .line 6
    if-nez v2, :cond_0

    .line 7
    .line 8
    sget p1, Lcom/kubi/assets/R$color;->c_transparent:I

    .line 9
    return p1

    .line 10
    .line 11
    :cond_0
    cmpg-double v0, v0, p1

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    const-wide v3, 0x3fc999999999999aL    # 0.2

    .line 17
    .line 18
    if-gtz v0, :cond_1

    .line 19
    .line 20
    cmpg-double v0, p1, v3

    .line 21
    .line 22
    if-gtz v0, :cond_1

    .line 23
    .line 24
    sget p1, Lcom/kubi/assets/R$mipmap;->asset_bg_ongoing_green_1:I

    .line 25
    return p1

    .line 26
    .line 27
    :cond_1
    cmpg-double v0, v3, p1

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    const-wide v3, 0x3fd999999999999aL    # 0.4

    .line 33
    .line 34
    if-gtz v0, :cond_2

    .line 35
    .line 36
    cmpg-double v0, p1, v3

    .line 37
    .line 38
    if-gtz v0, :cond_2

    .line 39
    .line 40
    sget p1, Lcom/kubi/assets/R$mipmap;->asset_bg_ongoing_green_2:I

    .line 41
    return p1

    .line 42
    .line 43
    :cond_2
    cmpg-double v0, v3, p1

    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    const-wide v3, 0x3fe3333333333333L    # 0.6

    .line 49
    .line 50
    if-gtz v0, :cond_3

    .line 51
    .line 52
    cmpg-double v0, p1, v3

    .line 53
    .line 54
    if-gtz v0, :cond_3

    .line 55
    .line 56
    sget p1, Lcom/kubi/assets/R$mipmap;->asset_bg_ongoing_green_3:I

    .line 57
    return p1

    .line 58
    .line 59
    :cond_3
    cmpg-double v0, v3, p1

    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    const-wide v3, 0x3fe999999999999aL    # 0.8

    .line 65
    .line 66
    if-gtz v0, :cond_4

    .line 67
    .line 68
    cmpg-double v0, p1, v3

    .line 69
    .line 70
    if-gtz v0, :cond_4

    .line 71
    .line 72
    sget p1, Lcom/kubi/assets/R$mipmap;->asset_bg_ongoing_green_4:I

    .line 73
    return p1

    .line 74
    .line 75
    :cond_4
    cmpg-double v0, v3, p1

    .line 76
    .line 77
    const-wide/high16 v3, 0x3ff0000000000000L    # 1.0

    .line 78
    .line 79
    if-gtz v0, :cond_5

    .line 80
    .line 81
    cmpg-double v0, p1, v3

    .line 82
    .line 83
    if-gtz v0, :cond_5

    .line 84
    .line 85
    sget p1, Lcom/kubi/assets/R$mipmap;->asset_bg_ongoing_green_5:I

    .line 86
    return p1

    .line 87
    .line 88
    :cond_5
    cmpl-double v0, p1, v3

    .line 89
    .line 90
    if-lez v0, :cond_6

    .line 91
    .line 92
    sget p1, Lcom/kubi/assets/R$mipmap;->asset_bg_ongoing_green_6:I

    .line 93
    return p1

    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    :cond_6
    const-wide v0, -0x4036666666666666L    # -0.2

    .line 99
    .line 100
    cmpg-double v3, v0, p1

    .line 101
    .line 102
    if-gtz v3, :cond_7

    .line 103
    .line 104
    if-gtz v2, :cond_7

    .line 105
    .line 106
    sget p1, Lcom/kubi/assets/R$mipmap;->asset_bg_ongoing_red_1:I

    .line 107
    return p1

    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    :cond_7
    const-wide v2, -0x4026666666666666L    # -0.4

    .line 113
    .line 114
    cmpg-double v4, v2, p1

    .line 115
    .line 116
    if-gtz v4, :cond_8

    .line 117
    .line 118
    cmpg-double v0, p1, v0

    .line 119
    .line 120
    if-gtz v0, :cond_8

    .line 121
    .line 122
    sget p1, Lcom/kubi/assets/R$mipmap;->asset_bg_ongoing_red_2:I

    .line 123
    return p1

    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    :cond_8
    const-wide v0, -0x401ccccccccccccdL    # -0.6

    .line 129
    .line 130
    cmpg-double v4, v0, p1

    .line 131
    .line 132
    if-gtz v4, :cond_9

    .line 133
    .line 134
    cmpg-double v2, p1, v2

    .line 135
    .line 136
    if-gtz v2, :cond_9

    .line 137
    .line 138
    sget p1, Lcom/kubi/assets/R$mipmap;->asset_bg_ongoing_red_3:I

    .line 139
    return p1

    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    :cond_9
    const-wide v2, -0x4016666666666666L    # -0.8

    .line 145
    .line 146
    cmpg-double v4, v2, p1

    .line 147
    .line 148
    if-gtz v4, :cond_a

    .line 149
    .line 150
    cmpg-double v0, p1, v0

    .line 151
    .line 152
    if-gtz v0, :cond_a

    .line 153
    .line 154
    sget p1, Lcom/kubi/assets/R$mipmap;->asset_bg_ongoing_red_4:I

    .line 155
    return p1

    .line 156
    .line 157
    :cond_a
    const-wide/high16 v0, -0x4010000000000000L    # -1.0

    .line 158
    .line 159
    cmpg-double v4, v0, p1

    .line 160
    .line 161
    if-gtz v4, :cond_b

    .line 162
    .line 163
    cmpg-double v2, p1, v2

    .line 164
    .line 165
    if-gtz v2, :cond_b

    .line 166
    .line 167
    sget p1, Lcom/kubi/assets/R$mipmap;->asset_bg_ongoing_red_5:I

    .line 168
    return p1

    .line 169
    .line 170
    :cond_b
    cmpg-double p1, p1, v0

    .line 171
    .line 172
    if-gez p1, :cond_c

    .line 173
    .line 174
    sget p1, Lcom/kubi/assets/R$mipmap;->asset_bg_ongoing_red_6:I

    .line 175
    return p1

    .line 176
    .line 177
    :cond_c
    sget p1, Lcom/kubi/assets/R$color;->c_transparent:I

    .line 178
    return p1
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
