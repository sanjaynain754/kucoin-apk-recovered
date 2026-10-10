.class final Lcom/otaliastudios/transcoder/internal/audio/AudioEngine$drain$2;
.super Lkotlin/jvm/internal/Lambda;
.source "AudioEngine.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;->g()Lcom/otaliastudios/transcoder/internal/pipeline/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function3<",
        "Ljava/nio/ShortBuffer;",
        "Ljava/lang/Long;",
        "Ljava/lang/Double;",
        "Lcom/otaliastudios/transcoder/internal/pipeline/f$b<",
        "Lcom/otaliastudios/transcoder/internal/codec/EncoderData;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n\u00a2\u0006\u0004\u0008\u0008\u0010\t"
    }
    d2 = {
        "Ljava/nio/ShortBuffer;",
        "inBuffer",
        "",
        "timeUs",
        "",
        "stretch",
        "Lcom/otaliastudios/transcoder/internal/pipeline/f$b;",
        "Lcom/otaliastudios/transcoder/internal/codec/EncoderData;",
        "<anonymous>",
        "(Ljava/nio/ShortBuffer;JD)Lcom/otaliastudios/transcoder/internal/pipeline/f$b;"
    }
    k = 0x3
    mv = {
        0x1,
        0x5,
        0x1
    }
.end annotation


# instance fields
.field final synthetic $outBuffer:Ljava/nio/ShortBuffer;

.field final synthetic $outBytes:Ljava/nio/ByteBuffer;

.field final synthetic $outId:I

.field final synthetic this$0:Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;


# direct methods
.method public constructor <init>(Ljava/nio/ShortBuffer;Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;Ljava/nio/ByteBuffer;I)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/otaliastudios/transcoder/internal/audio/AudioEngine$drain$2;->$outBuffer:Ljava/nio/ShortBuffer;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/otaliastudios/transcoder/internal/audio/AudioEngine$drain$2;->this$0:Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;

    .line 5
    .line 6
    iput-object p3, p0, Lcom/otaliastudios/transcoder/internal/audio/AudioEngine$drain$2;->$outBytes:Ljava/nio/ByteBuffer;

    .line 7
    .line 8
    iput p4, p0, Lcom/otaliastudios/transcoder/internal/audio/AudioEngine$drain$2;->$outId:I

    .line 9
    const/4 p1, 0x3

    .line 10
    .line 11
    .line 12
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 13
    return-void
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


# virtual methods
.method public final invoke(Ljava/nio/ShortBuffer;JD)Lcom/otaliastudios/transcoder/internal/pipeline/f$b;
    .locals 19
    .param p1    # Ljava/nio/ShortBuffer;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/nio/ShortBuffer;",
            "JD)",
            "Lcom/otaliastudios/transcoder/internal/pipeline/f$b<",
            "Lcom/otaliastudios/transcoder/internal/codec/EncoderData;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "inBuffer"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v2, v0, Lcom/otaliastudios/transcoder/internal/audio/AudioEngine$drain$2;->$outBuffer:Ljava/nio/ShortBuffer;

    invoke-virtual {v2}, Ljava/nio/Buffer;->remaining()I

    move-result v2

    .line 3
    invoke-virtual {v1}, Ljava/nio/Buffer;->remaining()I

    move-result v3

    int-to-double v4, v3

    mul-double v6, v4, p4

    .line 4
    invoke-static {v6, v7}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v6

    .line 5
    iget-object v8, v0, Lcom/otaliastudios/transcoder/internal/audio/AudioEngine$drain$2;->this$0:Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;

    invoke-static {v8}, Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;->m(Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;)Lcom/otaliastudios/transcoder/internal/audio/remix/AudioRemixer;

    move-result-object v8

    const-string/jumbo v9, "remixer"

    const/4 v10, 0x0

    if-nez v8, :cond_0

    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v8, v10

    :cond_0
    double-to-int v6, v6

    invoke-interface {v8, v6}, Lcom/otaliastudios/transcoder/internal/audio/remix/AudioRemixer;->a(I)I

    move-result v6

    int-to-double v6, v6

    .line 6
    iget-object v8, v0, Lcom/otaliastudios/transcoder/internal/audio/AudioEngine$drain$2;->this$0:Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;

    invoke-static {v8}, Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;->q(Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;)Landroid/media/MediaFormat;

    move-result-object v11

    invoke-static {v8, v11}, Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;->o(Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;Landroid/media/MediaFormat;)I

    move-result v8

    int-to-double v11, v8

    mul-double/2addr v6, v11

    iget-object v8, v0, Lcom/otaliastudios/transcoder/internal/audio/AudioEngine$drain$2;->this$0:Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;

    invoke-static {v8}, Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;->l(Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;)Landroid/media/MediaFormat;

    move-result-object v11

    const-string/jumbo v12, "rawFormat"

    if-nez v11, :cond_1

    invoke-static {v12}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v11, v10

    :cond_1
    invoke-static {v8, v11}, Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;->o(Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;Landroid/media/MediaFormat;)I

    move-result v8

    int-to-double v13, v8

    div-double/2addr v6, v13

    invoke-static {v6, v7}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v6

    int-to-double v13, v2

    cmpg-double v2, v6, v13

    if-gtz v2, :cond_2

    goto :goto_0

    :cond_2
    div-double/2addr v6, v4

    div-double/2addr v13, v6

    .line 7
    invoke-static {v13, v14}, Ljava/lang/Math;->floor(D)D

    move-result-wide v2

    double-to-int v3, v2

    .line 8
    :goto_0
    invoke-virtual {v1}, Ljava/nio/Buffer;->position()I

    move-result v2

    add-int/2addr v2, v3

    invoke-virtual {v1, v2}, Ljava/nio/ShortBuffer;->limit(I)Ljava/nio/Buffer;

    int-to-double v2, v3

    mul-double v2, v2, p4

    .line 9
    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    .line 10
    iget-object v4, v0, Lcom/otaliastudios/transcoder/internal/audio/AudioEngine$drain$2;->this$0:Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;

    invoke-static {v4}, Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;->j(Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;)Lcom/otaliastudios/transcoder/internal/audio/c;

    move-result-object v4

    double-to-int v2, v2

    const-string/jumbo v3, "stretch"

    invoke-virtual {v4, v3, v2}, Lcom/otaliastudios/transcoder/internal/audio/c;->a(Ljava/lang/String;I)Ljava/nio/ShortBuffer;

    move-result-object v3

    .line 11
    iget-object v4, v0, Lcom/otaliastudios/transcoder/internal/audio/AudioEngine$drain$2;->this$0:Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;

    invoke-static {v4}, Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;->p(Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;)Lca0/a;

    move-result-object v4

    iget-object v5, v0, Lcom/otaliastudios/transcoder/internal/audio/AudioEngine$drain$2;->this$0:Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;

    invoke-static {v5}, Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;->l(Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;)Landroid/media/MediaFormat;

    move-result-object v6

    if-nez v6, :cond_3

    invoke-static {v12}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v6, v10

    :cond_3
    invoke-static {v5, v6}, Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;->k(Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;Landroid/media/MediaFormat;)I

    move-result v5

    invoke-interface {v4, v1, v3, v5}, Lca0/a;->a(Ljava/nio/ShortBuffer;Ljava/nio/ShortBuffer;I)V

    .line 12
    invoke-virtual {v3}, Ljava/nio/ShortBuffer;->flip()Ljava/nio/Buffer;

    .line 13
    iget-object v1, v0, Lcom/otaliastudios/transcoder/internal/audio/AudioEngine$drain$2;->this$0:Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;

    invoke-static {v1}, Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;->m(Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;)Lcom/otaliastudios/transcoder/internal/audio/remix/AudioRemixer;

    move-result-object v1

    if-nez v1, :cond_4

    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v1, v10

    :cond_4
    invoke-interface {v1, v2}, Lcom/otaliastudios/transcoder/internal/audio/remix/AudioRemixer;->a(I)I

    move-result v1

    .line 14
    iget-object v2, v0, Lcom/otaliastudios/transcoder/internal/audio/AudioEngine$drain$2;->this$0:Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;

    invoke-static {v2}, Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;->j(Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;)Lcom/otaliastudios/transcoder/internal/audio/c;

    move-result-object v2

    const-string/jumbo v4, "remix"

    invoke-virtual {v2, v4, v1}, Lcom/otaliastudios/transcoder/internal/audio/c;->a(Ljava/lang/String;I)Ljava/nio/ShortBuffer;

    move-result-object v14

    .line 15
    iget-object v1, v0, Lcom/otaliastudios/transcoder/internal/audio/AudioEngine$drain$2;->this$0:Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;

    invoke-static {v1}, Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;->m(Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;)Lcom/otaliastudios/transcoder/internal/audio/remix/AudioRemixer;

    move-result-object v1

    if-nez v1, :cond_5

    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v1, v10

    :cond_5
    invoke-interface {v1, v3, v14}, Lcom/otaliastudios/transcoder/internal/audio/remix/AudioRemixer;->b(Ljava/nio/ShortBuffer;Ljava/nio/ShortBuffer;)V

    .line 16
    invoke-virtual {v14}, Ljava/nio/ShortBuffer;->flip()Ljava/nio/Buffer;

    .line 17
    iget-object v1, v0, Lcom/otaliastudios/transcoder/internal/audio/AudioEngine$drain$2;->this$0:Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;

    invoke-static {v1}, Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;->n(Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;)Lx90/a;

    move-result-object v13

    .line 18
    iget-object v1, v0, Lcom/otaliastudios/transcoder/internal/audio/AudioEngine$drain$2;->this$0:Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;

    invoke-static {v1}, Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;->l(Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;)Landroid/media/MediaFormat;

    move-result-object v2

    if-nez v2, :cond_6

    invoke-static {v12}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_1

    :cond_6
    move-object v10, v2

    :goto_1
    invoke-static {v1, v10}, Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;->o(Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;Landroid/media/MediaFormat;)I

    move-result v15

    .line 19
    iget-object v1, v0, Lcom/otaliastudios/transcoder/internal/audio/AudioEngine$drain$2;->$outBuffer:Ljava/nio/ShortBuffer;

    iget-object v2, v0, Lcom/otaliastudios/transcoder/internal/audio/AudioEngine$drain$2;->this$0:Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;

    invoke-static {v2}, Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;->q(Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;)Landroid/media/MediaFormat;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;->o(Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;Landroid/media/MediaFormat;)I

    move-result v17

    .line 20
    iget-object v2, v0, Lcom/otaliastudios/transcoder/internal/audio/AudioEngine$drain$2;->this$0:Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;

    invoke-static {v2}, Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;->q(Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;)Landroid/media/MediaFormat;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;->k(Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;Landroid/media/MediaFormat;)I

    move-result v18

    move-object/from16 v16, v1

    .line 21
    invoke-interface/range {v13 .. v18}, Lx90/a;->a(Ljava/nio/ShortBuffer;ILjava/nio/ShortBuffer;II)V

    .line 22
    iget-object v1, v0, Lcom/otaliastudios/transcoder/internal/audio/AudioEngine$drain$2;->$outBuffer:Ljava/nio/ShortBuffer;

    invoke-virtual {v1}, Ljava/nio/ShortBuffer;->flip()Ljava/nio/Buffer;

    .line 23
    iget-object v1, v0, Lcom/otaliastudios/transcoder/internal/audio/AudioEngine$drain$2;->$outBytes:Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 24
    iget-object v1, v0, Lcom/otaliastudios/transcoder/internal/audio/AudioEngine$drain$2;->$outBytes:Ljava/nio/ByteBuffer;

    iget-object v2, v0, Lcom/otaliastudios/transcoder/internal/audio/AudioEngine$drain$2;->$outBuffer:Ljava/nio/ShortBuffer;

    invoke-virtual {v2}, Ljava/nio/Buffer;->limit()I

    move-result v2

    mul-int/lit8 v2, v2, 0x2

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 25
    iget-object v1, v0, Lcom/otaliastudios/transcoder/internal/audio/AudioEngine$drain$2;->$outBytes:Ljava/nio/ByteBuffer;

    iget-object v2, v0, Lcom/otaliastudios/transcoder/internal/audio/AudioEngine$drain$2;->$outBuffer:Ljava/nio/ShortBuffer;

    invoke-virtual {v2}, Ljava/nio/Buffer;->position()I

    move-result v2

    mul-int/lit8 v2, v2, 0x2

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 26
    new-instance v1, Lcom/otaliastudios/transcoder/internal/pipeline/f$b;

    new-instance v2, Lcom/otaliastudios/transcoder/internal/codec/EncoderData;

    iget-object v3, v0, Lcom/otaliastudios/transcoder/internal/audio/AudioEngine$drain$2;->$outBytes:Ljava/nio/ByteBuffer;

    iget v4, v0, Lcom/otaliastudios/transcoder/internal/audio/AudioEngine$drain$2;->$outId:I

    move-wide/from16 v5, p2

    invoke-direct {v2, v3, v4, v5, v6}, Lcom/otaliastudios/transcoder/internal/codec/EncoderData;-><init>(Ljava/nio/ByteBuffer;IJ)V

    invoke-direct {v1, v2}, Lcom/otaliastudios/transcoder/internal/pipeline/f$b;-><init>(Ljava/lang/Object;)V

    return-object v1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    move-object v1, p1

    check-cast v1, Ljava/nio/ShortBuffer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    move-result-wide v2

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v4

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Lcom/otaliastudios/transcoder/internal/audio/AudioEngine$drain$2;->invoke(Ljava/nio/ShortBuffer;JD)Lcom/otaliastudios/transcoder/internal/pipeline/f$b;

    move-result-object p1

    return-object p1
.end method
