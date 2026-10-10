.class public final Lcom/google/android/gms/common/util/HexDumpUtils;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-basement@@18.5.0"


# annotations
.annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
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
.end method

.method public static dump([BIIZ)Ljava/lang/String;
    .locals 10
    .param p0    # [B
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
    .end annotation

    .line 1
    .line 2
    if-eqz p0, :cond_e

    .line 3
    array-length v0, p0

    .line 4
    .line 5
    if-eqz v0, :cond_e

    .line 6
    .line 7
    if-ltz p1, :cond_e

    .line 8
    .line 9
    if-lez p2, :cond_e

    .line 10
    .line 11
    add-int v1, p1, p2

    .line 12
    .line 13
    if-le v1, v0, :cond_0

    .line 14
    .line 15
    goto/16 :goto_6

    .line 16
    .line 17
    :cond_0
    if-eqz p3, :cond_1

    .line 18
    .line 19
    const/16 v0, 0x4b

    .line 20
    goto :goto_0

    .line 21
    .line 22
    :cond_1
    const/16 v0, 0x39

    .line 23
    .line 24
    :goto_0
    add-int/lit8 v1, p2, 0xf

    .line 25
    .line 26
    new-instance v2, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    const/16 v3, 0x10

    .line 29
    div-int/2addr v1, v3

    .line 30
    mul-int/2addr v0, v1

    .line 31
    .line 32
    .line 33
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 34
    const/4 v0, 0x0

    .line 35
    move v1, p2

    .line 36
    move v4, v0

    .line 37
    move v5, v4

    .line 38
    .line 39
    :goto_1
    if-lez v1, :cond_d

    .line 40
    .line 41
    const/16 v6, 0x8

    .line 42
    .line 43
    if-nez v4, :cond_3

    .line 44
    .line 45
    const/high16 v5, 0x10000

    .line 46
    .line 47
    if-ge p2, v5, :cond_2

    .line 48
    .line 49
    .line 50
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 51
    move-result-object v5

    .line 52
    .line 53
    .line 54
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 55
    move-result-object v5

    .line 56
    .line 57
    const-string v7, "%04X:"

    .line 58
    .line 59
    .line 60
    invoke-static {v7, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 61
    move-result-object v5

    .line 62
    .line 63
    .line 64
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    goto :goto_2

    .line 66
    .line 67
    .line 68
    :cond_2
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 69
    move-result-object v5

    .line 70
    .line 71
    .line 72
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 73
    move-result-object v5

    .line 74
    .line 75
    const-string v7, "%08X:"

    .line 76
    .line 77
    .line 78
    invoke-static {v7, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 79
    move-result-object v5

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    :goto_2
    move v5, p1

    .line 84
    goto :goto_3

    .line 85
    .line 86
    :cond_3
    if-ne v4, v6, :cond_4

    .line 87
    .line 88
    const-string v7, " -"

    .line 89
    .line 90
    .line 91
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    :cond_4
    :goto_3
    aget-byte v7, p0, p1

    .line 94
    .line 95
    and-int/lit16 v7, v7, 0xff

    .line 96
    .line 97
    .line 98
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 99
    move-result-object v7

    .line 100
    .line 101
    .line 102
    filled-new-array {v7}, [Ljava/lang/Object;

    .line 103
    move-result-object v7

    .line 104
    .line 105
    const-string v8, " %02X"

    .line 106
    .line 107
    .line 108
    invoke-static {v8, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 109
    move-result-object v7

    .line 110
    .line 111
    .line 112
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    add-int/lit8 v1, v1, -0x1

    .line 115
    .line 116
    add-int/lit8 v4, v4, 0x1

    .line 117
    .line 118
    if-eqz p3, :cond_a

    .line 119
    .line 120
    if-eq v4, v3, :cond_5

    .line 121
    .line 122
    if-nez v1, :cond_a

    .line 123
    .line 124
    :cond_5
    rsub-int/lit8 v7, v4, 0x10

    .line 125
    .line 126
    if-lez v7, :cond_6

    .line 127
    move v8, v0

    .line 128
    .line 129
    :goto_4
    if-ge v8, v7, :cond_6

    .line 130
    .line 131
    const-string v9, "   "

    .line 132
    .line 133
    .line 134
    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    add-int/lit8 v8, v8, 0x1

    .line 137
    goto :goto_4

    .line 138
    .line 139
    :cond_6
    const-string v8, "  "

    .line 140
    .line 141
    if-lt v7, v6, :cond_7

    .line 142
    .line 143
    .line 144
    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    :cond_7
    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    move v6, v0

    .line 149
    .line 150
    :goto_5
    if-ge v6, v4, :cond_a

    .line 151
    .line 152
    add-int v7, v5, v6

    .line 153
    .line 154
    aget-byte v7, p0, v7

    .line 155
    int-to-char v7, v7

    .line 156
    .line 157
    const/16 v8, 0x20

    .line 158
    .line 159
    const/16 v9, 0x2e

    .line 160
    .line 161
    if-lt v7, v8, :cond_8

    .line 162
    .line 163
    const/16 v8, 0x7e

    .line 164
    .line 165
    if-le v7, v8, :cond_9

    .line 166
    :cond_8
    move v7, v9

    .line 167
    .line 168
    .line 169
    :cond_9
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    add-int/lit8 v6, v6, 0x1

    .line 172
    goto :goto_5

    .line 173
    .line 174
    :cond_a
    if-eq v4, v3, :cond_b

    .line 175
    .line 176
    if-nez v1, :cond_c

    .line 177
    .line 178
    :cond_b
    const/16 v4, 0xa

    .line 179
    .line 180
    .line 181
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 182
    move v4, v0

    .line 183
    .line 184
    :cond_c
    add-int/lit8 p1, p1, 0x1

    .line 185
    .line 186
    goto/16 :goto_1

    .line 187
    .line 188
    .line 189
    :cond_d
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 190
    move-result-object p0

    .line 191
    return-object p0

    .line 192
    :cond_e
    :goto_6
    const/4 p0, 0x0

    .line 193
    return-object p0
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
.end method
