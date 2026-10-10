.class public final Lze0/d$a;
.super Ljava/lang/Object;
.source "Buffer32.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lze0/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static a(Lze0/d;Lze0/d;Lio/github/crow_misia/libyuv/RotateMode;)V
    .locals 11
    .param p0    # Lze0/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lze0/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lio/github/crow_misia/libyuv/RotateMode;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<BUFFER::",
            "Lze0/d<",
            "TBUFFER;>;>(",
            "Lze0/d<",
            "TBUFFER;>;TBUFFER;",
            "Lio/github/crow_misia/libyuv/RotateMode;",
            ")V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "dst"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "rotateMode"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    sget-object v1, Lio/github/crow_misia/libyuv/Yuv;->INSTANCE:Lio/github/crow_misia/libyuv/Yuv;

    .line 13
    .line 14
    .line 15
    invoke-interface {p0}, Lze0/d;->r()Lze0/o;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Lze0/o;->a()Ljava/nio/ByteBuffer;

    .line 20
    move-result-object v2

    .line 21
    .line 22
    .line 23
    invoke-interface {p0}, Lze0/d;->r()Lze0/o;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Lze0/o;->c()I

    .line 28
    move-result v3

    .line 29
    const/4 v0, 0x0

    .line 30
    .line 31
    .line 32
    invoke-static {p0, v0}, Lze0/i;->f(Lze0/e;I)I

    .line 33
    move-result v4

    .line 34
    .line 35
    .line 36
    invoke-interface {p1}, Lze0/d;->r()Lze0/o;

    .line 37
    move-result-object v5

    .line 38
    .line 39
    .line 40
    invoke-virtual {v5}, Lze0/o;->a()Ljava/nio/ByteBuffer;

    .line 41
    move-result-object v5

    .line 42
    .line 43
    .line 44
    invoke-interface {p1}, Lze0/d;->r()Lze0/o;

    .line 45
    move-result-object v6

    .line 46
    .line 47
    .line 48
    invoke-virtual {v6}, Lze0/o;->c()I

    .line 49
    move-result v6

    .line 50
    .line 51
    .line 52
    invoke-static {p1, v0}, Lze0/i;->f(Lze0/e;I)I

    .line 53
    move-result v7

    .line 54
    .line 55
    .line 56
    invoke-virtual {p2, p0, p1}, Lio/github/crow_misia/libyuv/RotateMode;->calculateWidth$core_release(Lze0/e;Lze0/e;)I

    .line 57
    move-result v8

    .line 58
    .line 59
    .line 60
    invoke-virtual {p2, p0, p1}, Lio/github/crow_misia/libyuv/RotateMode;->calculateHeight$core_release(Lze0/e;Lze0/e;)I

    .line 61
    move-result v9

    .line 62
    .line 63
    .line 64
    invoke-virtual {p2}, Lio/github/crow_misia/libyuv/RotateMode;->getDegrees()I

    .line 65
    move-result v10

    .line 66
    .line 67
    .line 68
    invoke-virtual/range {v1 .. v10}, Lio/github/crow_misia/libyuv/Yuv;->rotateARGBRotate(Ljava/nio/ByteBuffer;IILjava/nio/ByteBuffer;IIIII)V

    .line 69
    return-void
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

.method public static b(Lze0/d;Lze0/d;Lio/github/crow_misia/libyuv/FilterMode;)V
    .locals 13
    .param p0    # Lze0/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lze0/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lio/github/crow_misia/libyuv/FilterMode;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<BUFFER::",
            "Lze0/d<",
            "TBUFFER;>;>(",
            "Lze0/d<",
            "TBUFFER;>;TBUFFER;",
            "Lio/github/crow_misia/libyuv/FilterMode;",
            ")V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "dst"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "filterMode"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    sget-object v1, Lio/github/crow_misia/libyuv/Yuv;->INSTANCE:Lio/github/crow_misia/libyuv/Yuv;

    .line 13
    .line 14
    .line 15
    invoke-interface {p0}, Lze0/d;->r()Lze0/o;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Lze0/o;->a()Ljava/nio/ByteBuffer;

    .line 20
    move-result-object v2

    .line 21
    .line 22
    .line 23
    invoke-interface {p0}, Lze0/d;->r()Lze0/o;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Lze0/o;->c()I

    .line 28
    move-result v3

    .line 29
    const/4 v0, 0x0

    .line 30
    .line 31
    .line 32
    invoke-static {p0, v0}, Lze0/i;->f(Lze0/e;I)I

    .line 33
    move-result v4

    .line 34
    .line 35
    .line 36
    invoke-interface {p0}, Lze0/e;->getCropRect()Landroid/graphics/Rect;

    .line 37
    move-result-object v5

    .line 38
    .line 39
    .line 40
    invoke-virtual {v5}, Landroid/graphics/Rect;->width()I

    .line 41
    move-result v5

    .line 42
    .line 43
    .line 44
    invoke-interface {p0}, Lze0/e;->getCropRect()Landroid/graphics/Rect;

    .line 45
    move-result-object p0

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Landroid/graphics/Rect;->height()I

    .line 49
    move-result v6

    .line 50
    .line 51
    .line 52
    invoke-interface {p1}, Lze0/d;->r()Lze0/o;

    .line 53
    move-result-object p0

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, Lze0/o;->a()Ljava/nio/ByteBuffer;

    .line 57
    move-result-object v7

    .line 58
    .line 59
    .line 60
    invoke-interface {p1}, Lze0/d;->r()Lze0/o;

    .line 61
    move-result-object p0

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0}, Lze0/o;->c()I

    .line 65
    move-result v8

    .line 66
    .line 67
    .line 68
    invoke-static {p1, v0}, Lze0/i;->f(Lze0/e;I)I

    .line 69
    move-result v9

    .line 70
    .line 71
    .line 72
    invoke-interface {p1}, Lze0/e;->getCropRect()Landroid/graphics/Rect;

    .line 73
    move-result-object p0

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0}, Landroid/graphics/Rect;->width()I

    .line 77
    move-result v10

    .line 78
    .line 79
    .line 80
    invoke-interface {p1}, Lze0/e;->getCropRect()Landroid/graphics/Rect;

    .line 81
    move-result-object p0

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0}, Landroid/graphics/Rect;->height()I

    .line 85
    move-result v11

    .line 86
    .line 87
    .line 88
    invoke-virtual {p2}, Lio/github/crow_misia/libyuv/FilterMode;->getMode()I

    .line 89
    move-result v12

    .line 90
    .line 91
    .line 92
    invoke-virtual/range {v1 .. v12}, Lio/github/crow_misia/libyuv/Yuv;->scaleARGBScale(Ljava/nio/ByteBuffer;IIIILjava/nio/ByteBuffer;IIIII)V

    .line 93
    return-void
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
