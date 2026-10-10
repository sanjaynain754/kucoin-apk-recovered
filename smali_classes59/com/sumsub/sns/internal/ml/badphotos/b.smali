.class public abstract Lcom/sumsub/sns/internal/ml/badphotos/b;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# direct methods
.method public static a(Landroid/content/Context;Lokhttp3/OkHttpClient;Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/common/X;)Lcom/sumsub/sns/internal/ml/core/o;
    .locals 10

    .line 1
    .line 2
    .line 3
    :try_start_0
    invoke-static {}, Lcom/sumsub/sns/internal/ml/badphotos/d;->a()Lcom/sumsub/sns/internal/ml/badphotos/e;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iget-object v1, v0, Lcom/sumsub/sns/internal/ml/badphotos/e;->f:Ljava/util/List;

    .line 7
    .line 8
    iget-object p3, p3, Lcom/sumsub/sns/internal/features/data/model/common/X;->a:Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    invoke-interface {v1, p3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 12
    move-result p3

    .line 13
    .line 14
    if-eqz p3, :cond_0

    .line 15
    .line 16
    sget p3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 17
    .line 18
    const/16 v1, 0x1a

    .line 19
    .line 20
    if-lt p3, v1, :cond_0

    .line 21
    .line 22
    new-instance v2, Lcom/sumsub/sns/internal/ml/badphotos/c;

    .line 23
    .line 24
    iget-object p3, v0, Lcom/sumsub/sns/internal/ml/badphotos/e;->a:Ljava/lang/String;

    .line 25
    .line 26
    new-instance v1, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string/jumbo p2, "resources/embeddedModels/"

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    move-result-object v5

    .line 46
    .line 47
    iget-wide v6, v0, Lcom/sumsub/sns/internal/ml/badphotos/e;->d:J

    .line 48
    .line 49
    iget-object v8, v0, Lcom/sumsub/sns/internal/ml/badphotos/e;->a:Ljava/lang/String;

    .line 50
    .line 51
    iget-boolean v9, v0, Lcom/sumsub/sns/internal/ml/badphotos/e;->e:Z

    .line 52
    move-object v3, p0

    .line 53
    move-object v4, p1

    .line 54
    .line 55
    .line 56
    invoke-direct/range {v2 .. v9}, Lcom/sumsub/sns/internal/ml/badphotos/c;-><init>(Landroid/content/Context;Lokhttp3/OkHttpClient;Ljava/lang/String;JLjava/lang/String;Z)V

    .line 57
    return-object v2

    .line 58
    .line 59
    :cond_0
    sget-object p0, Lcom/sumsub/sns/internal/ml/badphotos/c;->k:Lcom/sumsub/sns/internal/ml/badphotos/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    return-object p0

    .line 61
    :catchall_0
    move-exception v0

    .line 62
    move-object p0, v0

    .line 63
    .line 64
    sget-object p1, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    .line 65
    .line 66
    const-string p1, "MlSolution.BadPhotosDetector"

    .line 67
    .line 68
    const-string p2, "Can\'t create instance. Using dummy detector."

    .line 69
    .line 70
    .line 71
    invoke-static {p1, p2, p0}, Lcom/sumsub/sns/internal/log/d;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 72
    .line 73
    sget-object p0, Lcom/sumsub/sns/internal/ml/badphotos/c;->k:Lcom/sumsub/sns/internal/ml/badphotos/a;

    .line 74
    return-object p0
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
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
.end method
