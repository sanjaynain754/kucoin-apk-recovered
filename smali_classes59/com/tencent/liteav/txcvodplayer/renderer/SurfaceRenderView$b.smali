.class final Lcom/tencent/liteav/txcvodplayer/renderer/SurfaceRenderView$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/SurfaceHolder$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/liteav/txcvodplayer/renderer/SurfaceRenderView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field a:Landroid/view/SurfaceHolder;

.field b:Z

.field c:I

.field d:I

.field e:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/tencent/liteav/txcvodplayer/renderer/SurfaceRenderView;",
            ">;"
        }
    .end annotation
.end field

.field f:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/tencent/liteav/txcvodplayer/renderer/a$a;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private g:I


# direct methods
.method public constructor <init>(Lcom/tencent/liteav/txcvodplayer/renderer/SurfaceRenderView;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/tencent/liteav/txcvodplayer/renderer/SurfaceRenderView$b;->f:Ljava/util/Map;

    .line 11
    .line 12
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 13
    .line 14
    .line 15
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 16
    .line 17
    iput-object v0, p0, Lcom/tencent/liteav/txcvodplayer/renderer/SurfaceRenderView$b;->e:Ljava/lang/ref/WeakReference;

    .line 18
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method


# virtual methods
.method public final surfaceChanged(Landroid/view/SurfaceHolder;III)V
    .locals 1

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/liteav/txcvodplayer/renderer/SurfaceRenderView$b;->a:Landroid/view/SurfaceHolder;

    .line 3
    const/4 p1, 0x1

    .line 4
    .line 5
    iput-boolean p1, p0, Lcom/tencent/liteav/txcvodplayer/renderer/SurfaceRenderView$b;->b:Z

    .line 6
    .line 7
    iput p2, p0, Lcom/tencent/liteav/txcvodplayer/renderer/SurfaceRenderView$b;->g:I

    .line 8
    .line 9
    iput p3, p0, Lcom/tencent/liteav/txcvodplayer/renderer/SurfaceRenderView$b;->c:I

    .line 10
    .line 11
    iput p4, p0, Lcom/tencent/liteav/txcvodplayer/renderer/SurfaceRenderView$b;->d:I

    .line 12
    .line 13
    new-instance p1, Lcom/tencent/liteav/txcvodplayer/renderer/SurfaceRenderView$a;

    .line 14
    .line 15
    iget-object p2, p0, Lcom/tencent/liteav/txcvodplayer/renderer/SurfaceRenderView$b;->e:Ljava/lang/ref/WeakReference;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 19
    move-result-object p2

    .line 20
    .line 21
    check-cast p2, Lcom/tencent/liteav/txcvodplayer/renderer/SurfaceRenderView;

    .line 22
    .line 23
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/renderer/SurfaceRenderView$b;->a:Landroid/view/SurfaceHolder;

    .line 24
    .line 25
    .line 26
    invoke-direct {p1, p2, v0}, Lcom/tencent/liteav/txcvodplayer/renderer/SurfaceRenderView$a;-><init>(Lcom/tencent/liteav/txcvodplayer/renderer/SurfaceRenderView;Landroid/view/SurfaceHolder;)V

    .line 27
    .line 28
    iget-object p2, p0, Lcom/tencent/liteav/txcvodplayer/renderer/SurfaceRenderView$b;->f:Ljava/util/Map;

    .line 29
    .line 30
    .line 31
    invoke-interface {p2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 32
    move-result-object p2

    .line 33
    .line 34
    .line 35
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 36
    move-result-object p2

    .line 37
    .line 38
    .line 39
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    move-result v0

    .line 41
    .line 42
    if-eqz v0, :cond_0

    .line 43
    .line 44
    .line 45
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    move-result-object v0

    .line 47
    .line 48
    check-cast v0, Lcom/tencent/liteav/txcvodplayer/renderer/a$a;

    .line 49
    .line 50
    .line 51
    invoke-interface {v0, p1, p3, p4}, Lcom/tencent/liteav/txcvodplayer/renderer/a$a;->a(Lcom/tencent/liteav/txcvodplayer/renderer/a$b;II)V

    .line 52
    goto :goto_0

    .line 53
    :cond_0
    return-void
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

.method public final surfaceCreated(Landroid/view/SurfaceHolder;)V
    .locals 2

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/liteav/txcvodplayer/renderer/SurfaceRenderView$b;->a:Landroid/view/SurfaceHolder;

    .line 3
    const/4 p1, 0x0

    .line 4
    .line 5
    iput-boolean p1, p0, Lcom/tencent/liteav/txcvodplayer/renderer/SurfaceRenderView$b;->b:Z

    .line 6
    .line 7
    iput p1, p0, Lcom/tencent/liteav/txcvodplayer/renderer/SurfaceRenderView$b;->g:I

    .line 8
    .line 9
    iput p1, p0, Lcom/tencent/liteav/txcvodplayer/renderer/SurfaceRenderView$b;->c:I

    .line 10
    .line 11
    iput p1, p0, Lcom/tencent/liteav/txcvodplayer/renderer/SurfaceRenderView$b;->d:I

    .line 12
    .line 13
    new-instance p1, Lcom/tencent/liteav/txcvodplayer/renderer/SurfaceRenderView$a;

    .line 14
    .line 15
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/renderer/SurfaceRenderView$b;->e:Ljava/lang/ref/WeakReference;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    check-cast v0, Lcom/tencent/liteav/txcvodplayer/renderer/SurfaceRenderView;

    .line 22
    .line 23
    iget-object v1, p0, Lcom/tencent/liteav/txcvodplayer/renderer/SurfaceRenderView$b;->a:Landroid/view/SurfaceHolder;

    .line 24
    .line 25
    .line 26
    invoke-direct {p1, v0, v1}, Lcom/tencent/liteav/txcvodplayer/renderer/SurfaceRenderView$a;-><init>(Lcom/tencent/liteav/txcvodplayer/renderer/SurfaceRenderView;Landroid/view/SurfaceHolder;)V

    .line 27
    .line 28
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/renderer/SurfaceRenderView$b;->f:Ljava/util/Map;

    .line 29
    .line 30
    .line 31
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 32
    move-result-object v0

    .line 33
    .line 34
    .line 35
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 36
    move-result-object v0

    .line 37
    .line 38
    .line 39
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    move-result v1

    .line 41
    .line 42
    if-eqz v1, :cond_0

    .line 43
    .line 44
    .line 45
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    move-result-object v1

    .line 47
    .line 48
    check-cast v1, Lcom/tencent/liteav/txcvodplayer/renderer/a$a;

    .line 49
    .line 50
    .line 51
    invoke-interface {v1, p1}, Lcom/tencent/liteav/txcvodplayer/renderer/a$a;->a(Lcom/tencent/liteav/txcvodplayer/renderer/a$b;)V

    .line 52
    goto :goto_0

    .line 53
    :cond_0
    return-void
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

.method public final surfaceDestroyed(Landroid/view/SurfaceHolder;)V
    .locals 2

    .line 1
    const/4 p1, 0x0

    .line 2
    .line 3
    iput-object p1, p0, Lcom/tencent/liteav/txcvodplayer/renderer/SurfaceRenderView$b;->a:Landroid/view/SurfaceHolder;

    .line 4
    const/4 p1, 0x0

    .line 5
    .line 6
    iput-boolean p1, p0, Lcom/tencent/liteav/txcvodplayer/renderer/SurfaceRenderView$b;->b:Z

    .line 7
    .line 8
    iput p1, p0, Lcom/tencent/liteav/txcvodplayer/renderer/SurfaceRenderView$b;->g:I

    .line 9
    .line 10
    iput p1, p0, Lcom/tencent/liteav/txcvodplayer/renderer/SurfaceRenderView$b;->c:I

    .line 11
    .line 12
    iput p1, p0, Lcom/tencent/liteav/txcvodplayer/renderer/SurfaceRenderView$b;->d:I

    .line 13
    .line 14
    new-instance p1, Lcom/tencent/liteav/txcvodplayer/renderer/SurfaceRenderView$a;

    .line 15
    .line 16
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/renderer/SurfaceRenderView$b;->e:Ljava/lang/ref/WeakReference;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    check-cast v0, Lcom/tencent/liteav/txcvodplayer/renderer/SurfaceRenderView;

    .line 23
    .line 24
    iget-object v1, p0, Lcom/tencent/liteav/txcvodplayer/renderer/SurfaceRenderView$b;->a:Landroid/view/SurfaceHolder;

    .line 25
    .line 26
    .line 27
    invoke-direct {p1, v0, v1}, Lcom/tencent/liteav/txcvodplayer/renderer/SurfaceRenderView$a;-><init>(Lcom/tencent/liteav/txcvodplayer/renderer/SurfaceRenderView;Landroid/view/SurfaceHolder;)V

    .line 28
    .line 29
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/renderer/SurfaceRenderView$b;->f:Ljava/util/Map;

    .line 30
    .line 31
    .line 32
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 33
    move-result-object v0

    .line 34
    .line 35
    .line 36
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 37
    move-result-object v0

    .line 38
    .line 39
    .line 40
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 41
    move-result v1

    .line 42
    .line 43
    if-eqz v1, :cond_0

    .line 44
    .line 45
    .line 46
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 47
    move-result-object v1

    .line 48
    .line 49
    check-cast v1, Lcom/tencent/liteav/txcvodplayer/renderer/a$a;

    .line 50
    .line 51
    .line 52
    invoke-interface {v1, p1}, Lcom/tencent/liteav/txcvodplayer/renderer/a$a;->b(Lcom/tencent/liteav/txcvodplayer/renderer/a$b;)V

    .line 53
    goto :goto_0

    .line 54
    :cond_0
    return-void
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
