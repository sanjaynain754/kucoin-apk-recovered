.class public abstract Laf0/c;
.super Ljava/lang/Object;
.source "ProgressListener.java"

# interfaces
.implements Laf0/a;


# instance fields
.field public a:Z

.field public b:J

.field public c:J

.field public d:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    const-wide/16 v0, 0x0

    .line 6
    .line 7
    iput-wide v0, p0, Laf0/c;->b:J

    .line 8
    .line 9
    iput-wide v0, p0, Laf0/c;->c:J

    .line 10
    .line 11
    const/16 v0, 0x64

    .line 12
    .line 13
    iput v0, p0, Laf0/c;->d:I

    .line 14
    return-void
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
.end method


# virtual methods
.method public final a(JJF)V
    .locals 11

    .line 1
    .line 2
    iget-boolean v1, p0, Laf0/c;->a:Z

    .line 3
    .line 4
    if-nez v1, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p3, p4}, Laf0/c;->d(J)V

    .line 8
    const/4 v1, 0x1

    .line 9
    .line 10
    iput-boolean v1, p0, Laf0/c;->a:Z

    .line 11
    .line 12
    :cond_0
    const-wide/16 v1, -0x1

    .line 13
    .line 14
    cmp-long v5, p1, v1

    .line 15
    .line 16
    if-nez v5, :cond_1

    .line 17
    .line 18
    cmp-long v1, p3, v1

    .line 19
    .line 20
    if-nez v1, :cond_1

    .line 21
    .line 22
    const/high16 v1, -0x40800000    # -1.0f

    .line 23
    .line 24
    cmpl-float v1, p5, v1

    .line 25
    .line 26
    if-nez v1, :cond_1

    .line 27
    .line 28
    const/high16 v5, -0x40800000    # -1.0f

    .line 29
    .line 30
    const/high16 v6, -0x40800000    # -1.0f

    .line 31
    .line 32
    const-wide/16 v1, -0x1

    .line 33
    .line 34
    const-wide/16 v3, -0x1

    .line 35
    move-object v0, p0

    .line 36
    .line 37
    .line 38
    invoke-virtual/range {v0 .. v6}, Laf0/c;->b(JJFF)V

    .line 39
    return-void

    .line 40
    .line 41
    .line 42
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 43
    move-result-wide v1

    .line 44
    .line 45
    iget-wide v5, p0, Laf0/c;->b:J

    .line 46
    .line 47
    sub-long v7, v1, v5

    .line 48
    .line 49
    iget v9, p0, Laf0/c;->d:I

    .line 50
    int-to-long v9, v9

    .line 51
    .line 52
    cmp-long v7, v7, v9

    .line 53
    .line 54
    const/high16 v8, 0x3f800000    # 1.0f

    .line 55
    .line 56
    if-gez v7, :cond_2

    .line 57
    .line 58
    cmp-long v7, p1, p3

    .line 59
    .line 60
    if-eqz v7, :cond_2

    .line 61
    .line 62
    cmpl-float v7, p5, v8

    .line 63
    .line 64
    if-ltz v7, :cond_4

    .line 65
    :cond_2
    sub-long/2addr v1, v5

    .line 66
    .line 67
    const-wide/16 v5, 0x0

    .line 68
    .line 69
    cmp-long v5, v1, v5

    .line 70
    .line 71
    if-nez v5, :cond_3

    .line 72
    .line 73
    const-wide/16 v5, 0x1

    .line 74
    add-long/2addr v1, v5

    .line 75
    .line 76
    :cond_3
    iget-wide v5, p0, Laf0/c;->c:J

    .line 77
    .line 78
    sub-long v5, p1, v5

    .line 79
    div-long/2addr v5, v1

    .line 80
    long-to-float v6, v5

    .line 81
    move-object v0, p0

    .line 82
    move-wide v1, p1

    .line 83
    move-wide v3, p3

    .line 84
    .line 85
    move/from16 v5, p5

    .line 86
    .line 87
    .line 88
    invoke-virtual/range {v0 .. v6}, Laf0/c;->b(JJFF)V

    .line 89
    .line 90
    .line 91
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 92
    move-result-wide v3

    .line 93
    .line 94
    iput-wide v3, p0, Laf0/c;->b:J

    .line 95
    .line 96
    iput-wide p1, p0, Laf0/c;->c:J

    .line 97
    .line 98
    :cond_4
    cmp-long v1, p1, p3

    .line 99
    .line 100
    if-eqz v1, :cond_6

    .line 101
    .line 102
    cmpl-float v1, p5, v8

    .line 103
    .line 104
    if-ltz v1, :cond_5

    .line 105
    goto :goto_0

    .line 106
    :cond_5
    return-void

    .line 107
    .line 108
    .line 109
    :cond_6
    :goto_0
    invoke-virtual {p0}, Laf0/c;->c()V

    .line 110
    return-void
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
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
.end method

.method public abstract b(JJFF)V
.end method

.method public abstract c()V
.end method

.method public abstract d(J)V
.end method
