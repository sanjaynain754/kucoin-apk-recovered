.class final Lcom/otaliastudios/transcoder/internal/pipeline/PipelinesKt$AudioPipeline$1;
.super Lkotlin/jvm/internal/Lambda;
.source "pipelines.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/otaliastudios/transcoder/internal/pipeline/PipelinesKt;->a(Laa0/b;Lz90/a;Lda0/b;Landroid/media/MediaFormat;Lcom/otaliastudios/transcoder/internal/Codecs;Lca0/a;Lx90/a;)Lcom/otaliastudios/transcoder/internal/pipeline/Pipeline;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lcom/otaliastudios/transcoder/internal/pipeline/Pipeline$a<",
        "*",
        "Lcom/otaliastudios/transcoder/internal/pipeline/b;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u000c\u0012\u0002\u0008\u0003\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lcom/otaliastudios/transcoder/internal/pipeline/Pipeline$a;",
        "Lcom/otaliastudios/transcoder/internal/pipeline/b;",
        "<anonymous>",
        "()Lcom/otaliastudios/transcoder/internal/pipeline/Pipeline$a;"
    }
    k = 0x3
    mv = {
        0x1,
        0x5,
        0x1
    }
.end annotation


# instance fields
.field final synthetic $audioResampler:Lx90/a;

.field final synthetic $audioStretcher:Lca0/a;

.field final synthetic $codecs:Lcom/otaliastudios/transcoder/internal/Codecs;

.field final synthetic $format:Landroid/media/MediaFormat;

.field final synthetic $interpolator:Lda0/b;

.field final synthetic $sink:Lz90/a;

.field final synthetic $source:Laa0/b;


# direct methods
.method public constructor <init>(Laa0/b;Lda0/b;Lca0/a;Lx90/a;Landroid/media/MediaFormat;Lcom/otaliastudios/transcoder/internal/Codecs;Lz90/a;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/otaliastudios/transcoder/internal/pipeline/PipelinesKt$AudioPipeline$1;->$source:Laa0/b;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/otaliastudios/transcoder/internal/pipeline/PipelinesKt$AudioPipeline$1;->$interpolator:Lda0/b;

    .line 5
    .line 6
    iput-object p3, p0, Lcom/otaliastudios/transcoder/internal/pipeline/PipelinesKt$AudioPipeline$1;->$audioStretcher:Lca0/a;

    .line 7
    .line 8
    iput-object p4, p0, Lcom/otaliastudios/transcoder/internal/pipeline/PipelinesKt$AudioPipeline$1;->$audioResampler:Lx90/a;

    .line 9
    .line 10
    iput-object p5, p0, Lcom/otaliastudios/transcoder/internal/pipeline/PipelinesKt$AudioPipeline$1;->$format:Landroid/media/MediaFormat;

    .line 11
    .line 12
    iput-object p6, p0, Lcom/otaliastudios/transcoder/internal/pipeline/PipelinesKt$AudioPipeline$1;->$codecs:Lcom/otaliastudios/transcoder/internal/Codecs;

    .line 13
    .line 14
    iput-object p7, p0, Lcom/otaliastudios/transcoder/internal/pipeline/PipelinesKt$AudioPipeline$1;->$sink:Lz90/a;

    .line 15
    const/4 p1, 0x0

    .line 16
    .line 17
    .line 18
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 19
    return-void
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
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
.end method


# virtual methods
.method public final invoke()Lcom/otaliastudios/transcoder/internal/pipeline/Pipeline$a;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/otaliastudios/transcoder/internal/pipeline/Pipeline$a<",
            "*",
            "Lcom/otaliastudios/transcoder/internal/pipeline/b;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 2
    new-instance v0, Lt90/a;

    iget-object v1, p0, Lcom/otaliastudios/transcoder/internal/pipeline/PipelinesKt$AudioPipeline$1;->$source:Laa0/b;

    sget-object v2, Lcom/otaliastudios/transcoder/common/TrackType;->AUDIO:Lcom/otaliastudios/transcoder/common/TrackType;

    invoke-direct {v0, v1, v2}, Lt90/a;-><init>(Laa0/b;Lcom/otaliastudios/transcoder/common/TrackType;)V

    .line 3
    new-instance v1, Lcom/otaliastudios/transcoder/internal/codec/Decoder;

    iget-object v3, p0, Lcom/otaliastudios/transcoder/internal/pipeline/PipelinesKt$AudioPipeline$1;->$source:Laa0/b;

    invoke-interface {v3, v2}, Laa0/b;->d(Lcom/otaliastudios/transcoder/common/TrackType;)Landroid/media/MediaFormat;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const-string/jumbo v4, "source.getTrackFormat(TrackType.AUDIO)!!"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lcom/otaliastudios/transcoder/internal/codec/Decoder;-><init>(Landroid/media/MediaFormat;Z)V

    .line 4
    invoke-static {v0, v1}, Lcom/otaliastudios/transcoder/internal/pipeline/d;->a(Lcom/otaliastudios/transcoder/internal/pipeline/g;Lcom/otaliastudios/transcoder/internal/pipeline/g;)Lcom/otaliastudios/transcoder/internal/pipeline/Pipeline$a;

    move-result-object v0

    .line 5
    new-instance v1, Lcom/otaliastudios/transcoder/internal/codec/d;

    iget-object v3, p0, Lcom/otaliastudios/transcoder/internal/pipeline/PipelinesKt$AudioPipeline$1;->$interpolator:Lda0/b;

    invoke-direct {v1, v2, v3}, Lcom/otaliastudios/transcoder/internal/codec/d;-><init>(Lcom/otaliastudios/transcoder/common/TrackType;Lda0/b;)V

    .line 6
    invoke-virtual {v0, v1}, Lcom/otaliastudios/transcoder/internal/pipeline/Pipeline$a;->b(Lcom/otaliastudios/transcoder/internal/pipeline/g;)Lcom/otaliastudios/transcoder/internal/pipeline/Pipeline$a;

    move-result-object v0

    .line 7
    new-instance v1, Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;

    iget-object v3, p0, Lcom/otaliastudios/transcoder/internal/pipeline/PipelinesKt$AudioPipeline$1;->$audioStretcher:Lca0/a;

    iget-object v4, p0, Lcom/otaliastudios/transcoder/internal/pipeline/PipelinesKt$AudioPipeline$1;->$audioResampler:Lx90/a;

    iget-object v5, p0, Lcom/otaliastudios/transcoder/internal/pipeline/PipelinesKt$AudioPipeline$1;->$format:Landroid/media/MediaFormat;

    invoke-direct {v1, v3, v4, v5}, Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;-><init>(Lca0/a;Lx90/a;Landroid/media/MediaFormat;)V

    .line 8
    invoke-virtual {v0, v1}, Lcom/otaliastudios/transcoder/internal/pipeline/Pipeline$a;->b(Lcom/otaliastudios/transcoder/internal/pipeline/g;)Lcom/otaliastudios/transcoder/internal/pipeline/Pipeline$a;

    move-result-object v0

    .line 9
    new-instance v1, Lcom/otaliastudios/transcoder/internal/codec/Encoder;

    iget-object v3, p0, Lcom/otaliastudios/transcoder/internal/pipeline/PipelinesKt$AudioPipeline$1;->$codecs:Lcom/otaliastudios/transcoder/internal/Codecs;

    invoke-direct {v1, v3, v2}, Lcom/otaliastudios/transcoder/internal/codec/Encoder;-><init>(Lcom/otaliastudios/transcoder/internal/Codecs;Lcom/otaliastudios/transcoder/common/TrackType;)V

    .line 10
    invoke-virtual {v0, v1}, Lcom/otaliastudios/transcoder/internal/pipeline/Pipeline$a;->b(Lcom/otaliastudios/transcoder/internal/pipeline/g;)Lcom/otaliastudios/transcoder/internal/pipeline/Pipeline$a;

    move-result-object v0

    .line 11
    new-instance v1, Lt90/e;

    iget-object v3, p0, Lcom/otaliastudios/transcoder/internal/pipeline/PipelinesKt$AudioPipeline$1;->$sink:Lz90/a;

    invoke-direct {v1, v3, v2}, Lt90/e;-><init>(Lz90/a;Lcom/otaliastudios/transcoder/common/TrackType;)V

    .line 12
    invoke-virtual {v0, v1}, Lcom/otaliastudios/transcoder/internal/pipeline/Pipeline$a;->b(Lcom/otaliastudios/transcoder/internal/pipeline/g;)Lcom/otaliastudios/transcoder/internal/pipeline/Pipeline$a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/otaliastudios/transcoder/internal/pipeline/PipelinesKt$AudioPipeline$1;->invoke()Lcom/otaliastudios/transcoder/internal/pipeline/Pipeline$a;

    move-result-object v0

    return-object v0
.end method
