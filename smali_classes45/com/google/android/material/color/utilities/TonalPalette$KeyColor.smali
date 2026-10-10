.class final Lcom/google/android/material/color/utilities/TonalPalette$KeyColor;
.super Ljava/lang/Object;
.source "TonalPalette.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/material/color/utilities/TonalPalette;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "KeyColor"
.end annotation


# static fields
.field private static final MAX_CHROMA_VALUE:D = 200.0


# instance fields
.field private final chromaCache:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation
.end field

.field private final hue:D

.field private final requestedChroma:D


# direct methods
.method public constructor <init>(DD)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Ljava/util/HashMap;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/google/android/material/color/utilities/TonalPalette$KeyColor;->chromaCache:Ljava/util/Map;

    .line 11
    .line 12
    iput-wide p1, p0, Lcom/google/android/material/color/utilities/TonalPalette$KeyColor;->hue:D

    .line 13
    .line 14
    iput-wide p3, p0, Lcom/google/android/material/color/utilities/TonalPalette$KeyColor;->requestedChroma:D

    .line 15
    return-void
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
.end method

.method private maxChroma(I)D
    .locals 7

    .line 1
    .line 2
    iget-object v0, p0, Lcom/google/android/material/color/utilities/TonalPalette$KeyColor;->chromaCache:Ljava/util/Map;

    .line 3
    .line 4
    .line 5
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    .line 9
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    iget-wide v1, p0, Lcom/google/android/material/color/utilities/TonalPalette$KeyColor;->hue:D

    .line 15
    .line 16
    const-wide/high16 v3, 0x4069000000000000L    # 200.0

    .line 17
    int-to-double v5, p1

    .line 18
    .line 19
    .line 20
    invoke-static/range {v1 .. v6}, Lcom/google/android/material/color/utilities/Hct;->from(DDD)Lcom/google/android/material/color/utilities/Hct;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Lcom/google/android/material/color/utilities/Hct;->getChroma()D

    .line 25
    move-result-wide v0

    .line 26
    .line 27
    .line 28
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 29
    move-result-object v0

    .line 30
    .line 31
    iget-object v1, p0, Lcom/google/android/material/color/utilities/TonalPalette$KeyColor;->chromaCache:Ljava/util/Map;

    .line 32
    .line 33
    .line 34
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 35
    move-result-object v2

    .line 36
    .line 37
    .line 38
    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    :cond_0
    iget-object v0, p0, Lcom/google/android/material/color/utilities/TonalPalette$KeyColor;->chromaCache:Ljava/util/Map;

    .line 41
    .line 42
    .line 43
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 44
    move-result-object p1

    .line 45
    .line 46
    .line 47
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    move-result-object p1

    .line 49
    .line 50
    check-cast p1, Ljava/lang/Double;

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    .line 54
    move-result-wide v0

    .line 55
    return-wide v0
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
.end method


# virtual methods
.method public create()Lcom/google/android/material/color/utilities/Hct;
    .locals 13

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    const/16 v1, 0x64

    .line 4
    move v2, v0

    .line 5
    .line 6
    :goto_0
    if-ge v2, v1, :cond_5

    .line 7
    .line 8
    add-int v3, v2, v1

    .line 9
    .line 10
    div-int/lit8 v3, v3, 0x2

    .line 11
    .line 12
    .line 13
    invoke-direct {p0, v3}, Lcom/google/android/material/color/utilities/TonalPalette$KeyColor;->maxChroma(I)D

    .line 14
    move-result-wide v4

    .line 15
    .line 16
    add-int/lit8 v6, v3, 0x1

    .line 17
    .line 18
    .line 19
    invoke-direct {p0, v6}, Lcom/google/android/material/color/utilities/TonalPalette$KeyColor;->maxChroma(I)D

    .line 20
    move-result-wide v7

    .line 21
    .line 22
    cmpg-double v4, v4, v7

    .line 23
    .line 24
    if-gez v4, :cond_0

    .line 25
    const/4 v4, 0x1

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    move v4, v0

    .line 28
    .line 29
    .line 30
    :goto_1
    invoke-direct {p0, v3}, Lcom/google/android/material/color/utilities/TonalPalette$KeyColor;->maxChroma(I)D

    .line 31
    move-result-wide v7

    .line 32
    .line 33
    iget-wide v9, p0, Lcom/google/android/material/color/utilities/TonalPalette$KeyColor;->requestedChroma:D

    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    const-wide v11, 0x3f847ae147ae147bL    # 0.01

    .line 39
    sub-double/2addr v9, v11

    .line 40
    .line 41
    cmpl-double v5, v7, v9

    .line 42
    .line 43
    if-ltz v5, :cond_3

    .line 44
    .line 45
    add-int/lit8 v4, v2, -0x32

    .line 46
    .line 47
    .line 48
    invoke-static {v4}, Ljava/lang/Math;->abs(I)I

    .line 49
    move-result v4

    .line 50
    .line 51
    add-int/lit8 v5, v1, -0x32

    .line 52
    .line 53
    .line 54
    invoke-static {v5}, Ljava/lang/Math;->abs(I)I

    .line 55
    move-result v5

    .line 56
    .line 57
    if-ge v4, v5, :cond_1

    .line 58
    goto :goto_2

    .line 59
    .line 60
    :cond_1
    if-ne v2, v3, :cond_2

    .line 61
    .line 62
    iget-wide v6, p0, Lcom/google/android/material/color/utilities/TonalPalette$KeyColor;->hue:D

    .line 63
    .line 64
    iget-wide v8, p0, Lcom/google/android/material/color/utilities/TonalPalette$KeyColor;->requestedChroma:D

    .line 65
    int-to-double v10, v2

    .line 66
    .line 67
    .line 68
    invoke-static/range {v6 .. v11}, Lcom/google/android/material/color/utilities/Hct;->from(DDD)Lcom/google/android/material/color/utilities/Hct;

    .line 69
    move-result-object v0

    .line 70
    return-object v0

    .line 71
    :cond_2
    move v2, v3

    .line 72
    goto :goto_0

    .line 73
    .line 74
    :cond_3
    if-eqz v4, :cond_4

    .line 75
    move v2, v6

    .line 76
    goto :goto_0

    .line 77
    :cond_4
    :goto_2
    move v1, v3

    .line 78
    goto :goto_0

    .line 79
    .line 80
    :cond_5
    iget-wide v3, p0, Lcom/google/android/material/color/utilities/TonalPalette$KeyColor;->hue:D

    .line 81
    .line 82
    iget-wide v5, p0, Lcom/google/android/material/color/utilities/TonalPalette$KeyColor;->requestedChroma:D

    .line 83
    int-to-double v7, v2

    .line 84
    .line 85
    .line 86
    invoke-static/range {v3 .. v8}, Lcom/google/android/material/color/utilities/Hct;->from(DDD)Lcom/google/android/material/color/utilities/Hct;

    .line 87
    move-result-object v0

    .line 88
    return-object v0
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
.end method
