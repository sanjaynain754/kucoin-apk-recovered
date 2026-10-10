.class public abstract Lcom/sumsub/sns/internal/features/data/model/common/g2;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# direct methods
.method public static a(Ljava/lang/String;)Lcom/sumsub/sns/internal/features/data/model/common/q2;
    .locals 8

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 4
    move-result v0

    .line 5
    .line 6
    .line 7
    sparse-switch v0, :sswitch_data_0

    .line 8
    goto :goto_0

    .line 9
    .line 10
    :sswitch_0
    const-string v0, "PASSPORT"

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 14
    move-result v0

    .line 15
    .line 16
    if-nez v0, :cond_0

    .line 17
    goto :goto_0

    .line 18
    .line 19
    :cond_0
    sget-object p0, Lcom/sumsub/sns/internal/features/data/model/common/k2;->c:Lcom/sumsub/sns/internal/features/data/model/common/k2;

    .line 20
    return-object p0

    .line 21
    .line 22
    :sswitch_1
    const-string v0, "RESIDENCE_PERMIT"

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    move-result v0

    .line 27
    .line 28
    if-nez v0, :cond_1

    .line 29
    goto :goto_0

    .line 30
    .line 31
    :cond_1
    sget-object p0, Lcom/sumsub/sns/internal/features/data/model/common/l2;->c:Lcom/sumsub/sns/internal/features/data/model/common/l2;

    .line 32
    return-object p0

    .line 33
    .line 34
    :sswitch_2
    const-string v0, "SNILS"

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 38
    move-result v0

    .line 39
    .line 40
    if-nez v0, :cond_2

    .line 41
    goto :goto_0

    .line 42
    .line 43
    :cond_2
    sget-object p0, Lcom/sumsub/sns/internal/features/data/model/common/n2;->c:Lcom/sumsub/sns/internal/features/data/model/common/n2;

    .line 44
    return-object p0

    .line 45
    .line 46
    :sswitch_3
    const-string v0, "VISA"

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 50
    move-result v0

    .line 51
    .line 52
    if-nez v0, :cond_3

    .line 53
    goto :goto_0

    .line 54
    .line 55
    :cond_3
    sget-object p0, Lcom/sumsub/sns/internal/features/data/model/common/p2;->c:Lcom/sumsub/sns/internal/features/data/model/common/p2;

    .line 56
    return-object p0

    .line 57
    .line 58
    :sswitch_4
    const-string v0, "INSURANCE_CERTIFICATE"

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 62
    move-result v0

    .line 63
    .line 64
    if-nez v0, :cond_4

    .line 65
    goto :goto_0

    .line 66
    .line 67
    :cond_4
    sget-object p0, Lcom/sumsub/sns/internal/features/data/model/common/j2;->c:Lcom/sumsub/sns/internal/features/data/model/common/j2;

    .line 68
    return-object p0

    .line 69
    .line 70
    :sswitch_5
    const-string v0, "DRIVERS"

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 74
    move-result v0

    .line 75
    .line 76
    if-nez v0, :cond_5

    .line 77
    goto :goto_0

    .line 78
    .line 79
    :cond_5
    sget-object p0, Lcom/sumsub/sns/internal/features/data/model/common/h2;->c:Lcom/sumsub/sns/internal/features/data/model/common/h2;

    .line 80
    return-object p0

    .line 81
    .line 82
    :sswitch_6
    const-string v0, "SELFIE"

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 86
    move-result v0

    .line 87
    .line 88
    if-nez v0, :cond_6

    .line 89
    goto :goto_0

    .line 90
    .line 91
    :cond_6
    sget-object p0, Lcom/sumsub/sns/internal/features/data/model/common/m2;->c:Lcom/sumsub/sns/internal/features/data/model/common/m2;

    .line 92
    return-object p0

    .line 93
    .line 94
    :sswitch_7
    const-string v0, "ID_CARD"

    .line 95
    .line 96
    .line 97
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 98
    move-result v0

    .line 99
    .line 100
    if-nez v0, :cond_7

    .line 101
    .line 102
    :goto_0
    new-instance v0, Lcom/sumsub/sns/internal/features/data/model/common/o2;

    .line 103
    const/4 v1, 0x1

    .line 104
    .line 105
    new-array v3, v1, [C

    .line 106
    .line 107
    const/16 v1, 0x5f

    .line 108
    const/4 v2, 0x0

    .line 109
    .line 110
    aput-char v1, v3, v2

    .line 111
    const/4 v6, 0x6

    .line 112
    const/4 v7, 0x0

    .line 113
    const/4 v4, 0x0

    .line 114
    const/4 v5, 0x0

    .line 115
    move-object v2, p0

    .line 116
    .line 117
    .line 118
    invoke-static/range {v2 .. v7}, Lkotlin/text/StringsKt;->split$default(Ljava/lang/CharSequence;[CZIILjava/lang/Object;)Ljava/util/List;

    .line 119
    move-result-object p0

    .line 120
    .line 121
    .line 122
    invoke-static {p0}, Lcom/sumsub/sns/internal/core/common/T0;->a(Ljava/util/List;)Ljava/lang/String;

    .line 123
    move-result-object p0

    .line 124
    .line 125
    .line 126
    invoke-direct {v0, v2, p0}, Lcom/sumsub/sns/internal/features/data/model/common/o2;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 127
    return-object v0

    .line 128
    .line 129
    :cond_7
    sget-object p0, Lcom/sumsub/sns/internal/features/data/model/common/i2;->c:Lcom/sumsub/sns/internal/features/data/model/common/i2;

    .line 130
    return-object p0

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
    :sswitch_data_0
    .sparse-switch
        -0x70f5644c -> :sswitch_7
        -0x6e6dd298 -> :sswitch_6
        -0x62be06d5 -> :sswitch_5
        -0x2f1c5c8e -> :sswitch_4
        0x283441 -> :sswitch_3
        0x4b62f55 -> :sswitch_2
        0x4dd71b94 -> :sswitch_1
        0x772c7c12 -> :sswitch_0
    .end sparse-switch
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
