.class public final Lcom/otaliastudios/transcoder/internal/video/d;
.super Ljava/lang/Object;
.source "VideoPublisher.kt"

# interfaces
.implements Lcom/otaliastudios/transcoder/internal/pipeline/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/otaliastudios/transcoder/internal/pipeline/g<",
        "Ljava/lang/Long;",
        "Lcom/otaliastudios/transcoder/internal/pipeline/b;",
        "Lcom/otaliastudios/transcoder/internal/codec/EncoderData;",
        "Lcom/otaliastudios/transcoder/internal/codec/f;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001B\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0008\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\n\u0010\u000bJ+\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00102\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0007R\u001a\u0010\u0018\u001a\u00020\u00148\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u001d8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u001e\u00a8\u0006 "
    }
    d2 = {
        "Lcom/otaliastudios/transcoder/internal/video/d;",
        "Lcom/otaliastudios/transcoder/internal/pipeline/g;",
        "",
        "Lcom/otaliastudios/transcoder/internal/pipeline/b;",
        "Lcom/otaliastudios/transcoder/internal/codec/EncoderData;",
        "Lcom/otaliastudios/transcoder/internal/codec/f;",
        "<init>",
        "()V",
        "next",
        "",
        "d",
        "(Lcom/otaliastudios/transcoder/internal/codec/f;)V",
        "Lcom/otaliastudios/transcoder/internal/pipeline/f$b;",
        "state",
        "",
        "fresh",
        "Lcom/otaliastudios/transcoder/internal/pipeline/f;",
        "b",
        "(Lcom/otaliastudios/transcoder/internal/pipeline/f$b;Z)Lcom/otaliastudios/transcoder/internal/pipeline/f;",
        "release",
        "Lcom/otaliastudios/transcoder/internal/pipeline/b$a;",
        "Lcom/otaliastudios/transcoder/internal/pipeline/b$a;",
        "a",
        "()Lcom/otaliastudios/transcoder/internal/pipeline/b$a;",
        "channel",
        "Lcom/otaliastudios/opengl/core/EglCore;",
        "c",
        "Lcom/otaliastudios/opengl/core/EglCore;",
        "core",
        "Lo90/c;",
        "Lo90/c;",
        "surface",
        "lib_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field public final b:Lcom/otaliastudios/transcoder/internal/pipeline/b$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Lcom/otaliastudios/opengl/core/EglCore;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public d:Lo90/c;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    sget-object v0, Lcom/otaliastudios/transcoder/internal/pipeline/b;->a:Lcom/otaliastudios/transcoder/internal/pipeline/b$a;

    .line 6
    .line 7
    iput-object v0, p0, Lcom/otaliastudios/transcoder/internal/video/d;->b:Lcom/otaliastudios/transcoder/internal/pipeline/b$a;

    .line 8
    .line 9
    new-instance v0, Lcom/otaliastudios/opengl/core/EglCore;

    .line 10
    .line 11
    sget-object v1, Landroid/opengl/EGL14;->EGL_NO_CONTEXT:Landroid/opengl/EGLContext;

    .line 12
    const/4 v2, 0x1

    .line 13
    .line 14
    .line 15
    invoke-direct {v0, v1, v2}, Lcom/otaliastudios/opengl/core/EglCore;-><init>(Landroid/opengl/EGLContext;I)V

    .line 16
    .line 17
    iput-object v0, p0, Lcom/otaliastudios/transcoder/internal/video/d;->c:Lcom/otaliastudios/opengl/core/EglCore;

    .line 18
    return-void
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
.end method


# virtual methods
.method public a()Lcom/otaliastudios/transcoder/internal/pipeline/b$a;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/otaliastudios/transcoder/internal/video/d;->b:Lcom/otaliastudios/transcoder/internal/pipeline/b$a;

    .line 3
    return-object v0
    .line 4
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
.end method

.method public b(Lcom/otaliastudios/transcoder/internal/pipeline/f$b;Z)Lcom/otaliastudios/transcoder/internal/pipeline/f;
    .locals 6
    .param p1    # Lcom/otaliastudios/transcoder/internal/pipeline/f$b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/otaliastudios/transcoder/internal/pipeline/f$b<",
            "Ljava/lang/Long;",
            ">;Z)",
            "Lcom/otaliastudios/transcoder/internal/pipeline/f<",
            "Lcom/otaliastudios/transcoder/internal/codec/EncoderData;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    const-string/jumbo p2, "state"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    instance-of p2, p1, Lcom/otaliastudios/transcoder/internal/pipeline/f$a;

    .line 9
    .line 10
    if-eqz p2, :cond_0

    .line 11
    .line 12
    new-instance p1, Lcom/otaliastudios/transcoder/internal/pipeline/f$a;

    .line 13
    .line 14
    sget-object p2, Lcom/otaliastudios/transcoder/internal/codec/EncoderData;->d:Lcom/otaliastudios/transcoder/internal/codec/EncoderData$Companion;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p2}, Lcom/otaliastudios/transcoder/internal/codec/EncoderData$Companion;->getEmpty()Lcom/otaliastudios/transcoder/internal/codec/EncoderData;

    .line 18
    move-result-object p2

    .line 19
    .line 20
    .line 21
    invoke-direct {p1, p2}, Lcom/otaliastudios/transcoder/internal/pipeline/f$a;-><init>(Ljava/lang/Object;)V

    .line 22
    return-object p1

    .line 23
    .line 24
    :cond_0
    iget-object p2, p0, Lcom/otaliastudios/transcoder/internal/video/d;->d:Lo90/c;

    .line 25
    const/4 v0, 0x0

    .line 26
    .line 27
    .line 28
    const-string/jumbo v1, "surface"

    .line 29
    .line 30
    if-nez p2, :cond_1

    .line 31
    .line 32
    .line 33
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 34
    move-object p2, v0

    .line 35
    .line 36
    .line 37
    :cond_1
    invoke-virtual {p1}, Lcom/otaliastudios/transcoder/internal/pipeline/f$b;->a()Ljava/lang/Object;

    .line 38
    move-result-object p1

    .line 39
    .line 40
    check-cast p1, Ljava/lang/Number;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 44
    move-result-wide v2

    .line 45
    .line 46
    const/16 p1, 0x3e8

    .line 47
    int-to-long v4, p1

    .line 48
    mul-long/2addr v2, v4

    .line 49
    .line 50
    .line 51
    invoke-virtual {p2, v2, v3}, Lo90/a;->e(J)V

    .line 52
    .line 53
    iget-object p1, p0, Lcom/otaliastudios/transcoder/internal/video/d;->d:Lo90/c;

    .line 54
    .line 55
    if-nez p1, :cond_2

    .line 56
    .line 57
    .line 58
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 59
    goto :goto_0

    .line 60
    :cond_2
    move-object v0, p1

    .line 61
    .line 62
    .line 63
    :goto_0
    invoke-virtual {v0}, Lo90/b;->g()Z

    .line 64
    .line 65
    new-instance p1, Lcom/otaliastudios/transcoder/internal/pipeline/f$b;

    .line 66
    .line 67
    sget-object p2, Lcom/otaliastudios/transcoder/internal/codec/EncoderData;->d:Lcom/otaliastudios/transcoder/internal/codec/EncoderData$Companion;

    .line 68
    .line 69
    .line 70
    invoke-virtual {p2}, Lcom/otaliastudios/transcoder/internal/codec/EncoderData$Companion;->getEmpty()Lcom/otaliastudios/transcoder/internal/codec/EncoderData;

    .line 71
    move-result-object p2

    .line 72
    .line 73
    .line 74
    invoke-direct {p1, p2}, Lcom/otaliastudios/transcoder/internal/pipeline/f$b;-><init>(Ljava/lang/Object;)V

    .line 75
    return-object p1
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
.end method

.method public bridge synthetic c(Lcom/otaliastudios/transcoder/internal/pipeline/b;)V
    .locals 0

    .line 1
    .line 2
    check-cast p1, Lcom/otaliastudios/transcoder/internal/codec/f;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lcom/otaliastudios/transcoder/internal/video/d;->d(Lcom/otaliastudios/transcoder/internal/codec/f;)V

    .line 6
    return-void
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
.end method

.method public d(Lcom/otaliastudios/transcoder/internal/codec/f;)V
    .locals 3
    .param p1    # Lcom/otaliastudios/transcoder/internal/codec/f;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "next"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-static {p0, p1}, Lcom/otaliastudios/transcoder/internal/pipeline/g$a;->a(Lcom/otaliastudios/transcoder/internal/pipeline/g;Lcom/otaliastudios/transcoder/internal/pipeline/b;)V

    .line 10
    .line 11
    new-instance v0, Lo90/c;

    .line 12
    .line 13
    iget-object v1, p0, Lcom/otaliastudios/transcoder/internal/video/d;->c:Lcom/otaliastudios/opengl/core/EglCore;

    .line 14
    .line 15
    .line 16
    invoke-interface {p1}, Lcom/otaliastudios/transcoder/internal/codec/f;->getSurface()Landroid/view/Surface;

    .line 17
    move-result-object p1

    .line 18
    .line 19
    .line 20
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 21
    const/4 v2, 0x0

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, v1, p1, v2}, Lo90/c;-><init>(Lcom/otaliastudios/opengl/core/EglCore;Landroid/view/Surface;Z)V

    .line 25
    .line 26
    iput-object v0, p0, Lcom/otaliastudios/transcoder/internal/video/d;->d:Lo90/c;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Lo90/a;->c()V

    .line 30
    return-void
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
.end method

.method public bridge synthetic getChannel()Lcom/otaliastudios/transcoder/internal/pipeline/b;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/otaliastudios/transcoder/internal/video/d;->a()Lcom/otaliastudios/transcoder/internal/pipeline/b$a;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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
.end method

.method public release()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/otaliastudios/transcoder/internal/video/d;->d:Lo90/c;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    .line 7
    const-string/jumbo v0, "surface"

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 11
    const/4 v0, 0x0

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-virtual {v0}, Lo90/c;->d()V

    .line 15
    .line 16
    iget-object v0, p0, Lcom/otaliastudios/transcoder/internal/video/d;->c:Lcom/otaliastudios/opengl/core/EglCore;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/otaliastudios/opengl/core/EglCore;->g()V

    .line 20
    return-void
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
.end method
