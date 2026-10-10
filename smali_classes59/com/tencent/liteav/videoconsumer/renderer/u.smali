.class public final Lcom/tencent/liteav/videoconsumer/renderer/u;
.super Lcom/tencent/liteav/videoconsumer/renderer/s;
.source "SourceFile"

# interfaces
.implements Lcom/tencent/liteav/videoconsumer/renderer/RenderViewHelperInterface$RenderViewListener;


# instance fields
.field private final A:Lcom/tencent/liteav/base/util/Size;

.field private B:Lcom/tencent/liteav/videobase/base/a;

.field private C:Lcom/tencent/liteav/videoconsumer/renderer/t;

.field private D:Z

.field private E:Landroid/graphics/Bitmap;

.field private final F:Lcom/tencent/liteav/base/b/a;

.field private G:Lcom/tencent/liteav/videoconsumer/renderer/a;

.field private H:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation
.end field

.field private I:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation
.end field

.field public final a:Ljava/lang/String;

.field public final b:Lcom/tencent/liteav/videobase/utils/f;

.field public volatile c:Z

.field public d:Z

.field private final e:Landroid/os/Handler;

.field private final f:Lcom/tencent/liteav/base/util/CustomHandler;

.field private final g:Lcom/tencent/liteav/videobase/videobase/c;

.field private final h:Lcom/tencent/liteav/base/util/m;

.field private final i:Lcom/tencent/liteav/base/util/m;

.field private final j:Lcom/tencent/liteav/base/b/b;

.field private final k:Lcom/tencent/liteav/base/util/Size;

.field private l:Landroid/view/Surface;

.field private m:Z

.field private n:Ljava/lang/Object;

.field private o:Lcom/tencent/liteav/videobase/egl/EGLCore;

.field private final p:Lcom/tencent/liteav/videobase/frame/c;

.field private q:Lcom/tencent/liteav/videobase/frame/i;

.field private r:Lcom/tencent/liteav/videobase/frame/e;

.field private s:Lcom/tencent/liteav/videobase/base/GLConstants$GLScaleType;

.field private t:Lcom/tencent/liteav/base/util/l;

.field private u:Z

.field private v:Z

.field private w:Lcom/tencent/liteav/videobase/videobase/DisplayTarget;

.field private x:Lcom/tencent/liteav/videoconsumer/renderer/RenderViewHelperInterface;

.field private final y:Lcom/tencent/liteav/base/util/Size;

.field private z:Z


# direct methods
.method public constructor <init>(Landroid/os/Looper;Lcom/tencent/liteav/videobase/videobase/c;)V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/liteav/videoconsumer/renderer/s;-><init>()V

    .line 4
    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    const-string v1, "VideoRenderer_"

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 14
    move-result v1

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    iput-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->a:Ljava/lang/String;

    .line 24
    .line 25
    new-instance v0, Landroid/os/Handler;

    .line 26
    .line 27
    .line 28
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 29
    move-result-object v1

    .line 30
    .line 31
    .line 32
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 33
    .line 34
    iput-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->e:Landroid/os/Handler;

    .line 35
    .line 36
    new-instance v0, Lcom/tencent/liteav/base/util/m;

    .line 37
    const/4 v1, 0x5

    .line 38
    .line 39
    .line 40
    invoke-direct {v0, v1}, Lcom/tencent/liteav/base/util/m;-><init>(I)V

    .line 41
    .line 42
    iput-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->i:Lcom/tencent/liteav/base/util/m;

    .line 43
    .line 44
    new-instance v0, Lcom/tencent/liteav/base/b/b;

    .line 45
    .line 46
    .line 47
    invoke-direct {v0}, Lcom/tencent/liteav/base/b/b;-><init>()V

    .line 48
    .line 49
    iput-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->j:Lcom/tencent/liteav/base/b/b;

    .line 50
    .line 51
    new-instance v0, Lcom/tencent/liteav/base/util/Size;

    .line 52
    .line 53
    .line 54
    invoke-direct {v0}, Lcom/tencent/liteav/base/util/Size;-><init>()V

    .line 55
    .line 56
    iput-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->k:Lcom/tencent/liteav/base/util/Size;

    .line 57
    const/4 v0, 0x0

    .line 58
    .line 59
    iput-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->l:Landroid/view/Surface;

    .line 60
    const/4 v1, 0x0

    .line 61
    .line 62
    iput-boolean v1, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->m:Z

    .line 63
    .line 64
    iput-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->o:Lcom/tencent/liteav/videobase/egl/EGLCore;

    .line 65
    .line 66
    new-instance v2, Lcom/tencent/liteav/videobase/frame/c;

    .line 67
    .line 68
    .line 69
    invoke-direct {v2}, Lcom/tencent/liteav/videobase/frame/c;-><init>()V

    .line 70
    .line 71
    iput-object v2, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->p:Lcom/tencent/liteav/videobase/frame/c;

    .line 72
    .line 73
    new-instance v2, Lcom/tencent/liteav/videobase/utils/f;

    .line 74
    .line 75
    .line 76
    invoke-direct {v2}, Lcom/tencent/liteav/videobase/utils/f;-><init>()V

    .line 77
    .line 78
    iput-object v2, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->b:Lcom/tencent/liteav/videobase/utils/f;

    .line 79
    .line 80
    sget-object v2, Lcom/tencent/liteav/videobase/base/GLConstants$GLScaleType;->a:Lcom/tencent/liteav/videobase/base/GLConstants$GLScaleType;

    .line 81
    .line 82
    iput-object v2, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->s:Lcom/tencent/liteav/videobase/base/GLConstants$GLScaleType;

    .line 83
    .line 84
    sget-object v2, Lcom/tencent/liteav/base/util/l;->a:Lcom/tencent/liteav/base/util/l;

    .line 85
    .line 86
    iput-object v2, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->t:Lcom/tencent/liteav/base/util/l;

    .line 87
    .line 88
    iput-boolean v1, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->u:Z

    .line 89
    .line 90
    iput-boolean v1, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->v:Z

    .line 91
    .line 92
    new-instance v2, Lcom/tencent/liteav/base/util/Size;

    .line 93
    .line 94
    .line 95
    invoke-direct {v2}, Lcom/tencent/liteav/base/util/Size;-><init>()V

    .line 96
    .line 97
    iput-object v2, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->y:Lcom/tencent/liteav/base/util/Size;

    .line 98
    .line 99
    iput-boolean v1, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->c:Z

    .line 100
    .line 101
    iput-boolean v1, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->d:Z

    .line 102
    .line 103
    iput-boolean v1, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->z:Z

    .line 104
    .line 105
    new-instance v2, Lcom/tencent/liteav/base/util/Size;

    .line 106
    .line 107
    .line 108
    invoke-direct {v2}, Lcom/tencent/liteav/base/util/Size;-><init>()V

    .line 109
    .line 110
    iput-object v2, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->A:Lcom/tencent/liteav/base/util/Size;

    .line 111
    .line 112
    iput-boolean v1, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->D:Z

    .line 113
    .line 114
    new-instance v1, Lcom/tencent/liteav/base/b/a;

    .line 115
    .line 116
    const-wide/16 v2, 0x1388

    .line 117
    .line 118
    .line 119
    invoke-direct {v1, v2, v3}, Lcom/tencent/liteav/base/b/a;-><init>(J)V

    .line 120
    .line 121
    iput-object v1, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->F:Lcom/tencent/liteav/base/b/a;

    .line 122
    .line 123
    new-instance v1, Lcom/tencent/liteav/base/util/CustomHandler;

    .line 124
    .line 125
    .line 126
    invoke-direct {v1, p1}, Lcom/tencent/liteav/base/util/CustomHandler;-><init>(Landroid/os/Looper;)V

    .line 127
    .line 128
    iput-object v1, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->f:Lcom/tencent/liteav/base/util/CustomHandler;

    .line 129
    .line 130
    iput-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->h:Lcom/tencent/liteav/base/util/m;

    .line 131
    .line 132
    iput-object p2, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->g:Lcom/tencent/liteav/videobase/videobase/c;

    .line 133
    return-void
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

.method private a(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 1

    .line 166
    monitor-enter p0

    .line 167
    :try_start_0
    iget-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->E:Landroid/graphics/Bitmap;

    .line 168
    iput-object p1, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->E:Landroid/graphics/Bitmap;

    .line 169
    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception p1

    .line 170
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method private a()V
    .locals 5

    .line 49
    iget-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->o:Lcom/tencent/liteav/videobase/egl/EGLCore;

    if-nez v0, :cond_0

    return-void

    .line 50
    :cond_0
    iget-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->j:Lcom/tencent/liteav/base/b/b;

    const-string/jumbo v1, "uninitGL"

    invoke-virtual {v0, v1}, Lcom/tencent/liteav/base/b/b;->a(Ljava/lang/String;)Lcom/tencent/liteav/base/b/a;

    move-result-object v0

    iget-object v1, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->a:Ljava/lang/String;

    iget-object v2, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->l:Landroid/view/Surface;

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    .line 51
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_0

    :cond_1
    move v2, v3

    :goto_0
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget-object v4, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->k:Lcom/tencent/liteav/base/util/Size;

    filled-new-array {v2, v4}, [Ljava/lang/Object;

    move-result-object v2

    .line 52
    const-string/jumbo v4, "uninitializeEGL %d %s"

    invoke-static {v0, v1, v4, v2}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Lcom/tencent/liteav/base/b/a;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 53
    :try_start_0
    iget-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->o:Lcom/tencent/liteav/videobase/egl/EGLCore;

    invoke-virtual {v0}, Lcom/tencent/liteav/videobase/egl/EGLCore;->makeCurrent()V
    :try_end_0
    .catch Lcom/tencent/liteav/videobase/egl/d; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    .line 54
    iget-object v1, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->j:Lcom/tencent/liteav/base/b/b;

    const-string v2, "makeCurrentError"

    invoke-virtual {v1, v2}, Lcom/tencent/liteav/base/b/b;->a(Ljava/lang/String;)Lcom/tencent/liteav/base/b/a;

    move-result-object v1

    iget-object v2, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->a:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string/jumbo v4, "uninitializeEGL EGLCore makeCurrent failed."

    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v1, v2, v0, v3}, Lcom/tencent/liteav/base/util/LiteavLog;->e(Lcom/tencent/liteav/base/b/a;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 55
    :goto_1
    iget-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->G:Lcom/tencent/liteav/videoconsumer/renderer/a;

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    .line 56
    iget-object v2, v0, Lcom/tencent/liteav/videoconsumer/renderer/a;->g:Lcom/tencent/liteav/videobase/frame/i;

    if-eqz v2, :cond_2

    .line 57
    invoke-virtual {v2}, Lcom/tencent/liteav/videobase/frame/i;->a()V

    .line 58
    iput-object v1, v0, Lcom/tencent/liteav/videoconsumer/renderer/a;->g:Lcom/tencent/liteav/videobase/frame/i;

    .line 59
    :cond_2
    iget-object v2, v0, Lcom/tencent/liteav/videoconsumer/renderer/a;->d:Lcom/tencent/liteav/videobase/b/b;

    if-eqz v2, :cond_3

    .line 60
    invoke-virtual {v2}, Lcom/tencent/liteav/videobase/a/a;->b()V

    .line 61
    iput-object v1, v0, Lcom/tencent/liteav/videoconsumer/renderer/a;->d:Lcom/tencent/liteav/videobase/b/b;

    .line 62
    :cond_3
    iput-object v1, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->G:Lcom/tencent/liteav/videoconsumer/renderer/a;

    .line 63
    :cond_4
    iget-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->q:Lcom/tencent/liteav/videobase/frame/i;

    if-eqz v0, :cond_5

    .line 64
    invoke-virtual {v0}, Lcom/tencent/liteav/videobase/frame/i;->a()V

    .line 65
    iput-object v1, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->q:Lcom/tencent/liteav/videobase/frame/i;

    .line 66
    :cond_5
    iget-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->p:Lcom/tencent/liteav/videobase/frame/c;

    invoke-virtual {v0}, Lcom/tencent/liteav/videobase/frame/c;->d()V

    .line 67
    iget-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->r:Lcom/tencent/liteav/videobase/frame/e;

    if-eqz v0, :cond_6

    .line 68
    invoke-virtual {v0}, Lcom/tencent/liteav/videobase/frame/e;->a()V

    .line 69
    iget-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->r:Lcom/tencent/liteav/videobase/frame/e;

    invoke-virtual {v0}, Lcom/tencent/liteav/videobase/frame/e;->b()V

    .line 70
    iput-object v1, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->r:Lcom/tencent/liteav/videobase/frame/e;

    .line 71
    :cond_6
    iget-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->o:Lcom/tencent/liteav/videobase/egl/EGLCore;

    invoke-static {v0}, Lcom/tencent/liteav/videobase/egl/EGLCore;->destroy(Lcom/tencent/liteav/videobase/egl/EGLCore;)V

    .line 72
    iput-object v1, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->o:Lcom/tencent/liteav/videobase/egl/EGLCore;

    return-void
.end method

.method private a(Landroid/view/Surface;Z)V
    .locals 1

    .line 151
    iget-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->l:Landroid/view/Surface;

    invoke-static {v0, p1}, Lcom/tencent/liteav/base/util/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 152
    iget-object p1, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->a:Ljava/lang/String;

    const-string/jumbo p2, "updateSurface same surface!"

    invoke-static {p1, p2}, Lcom/tencent/liteav/base/util/LiteavLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 153
    :cond_0
    invoke-direct {p0}, Lcom/tencent/liteav/videoconsumer/renderer/u;->a()V

    .line 154
    iget-boolean v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->m:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->l:Landroid/view/Surface;

    if-eqz v0, :cond_1

    .line 155
    invoke-virtual {v0}, Landroid/view/Surface;->release()V

    .line 156
    :cond_1
    iput-object p1, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->l:Landroid/view/Surface;

    if-nez p1, :cond_2

    .line 157
    iget-object p1, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->k:Lcom/tencent/liteav/base/util/Size;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0}, Lcom/tencent/liteav/base/util/Size;->set(II)V

    .line 158
    :cond_2
    iput-boolean p2, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->m:Z

    return-void
.end method

.method private a(Lcom/tencent/liteav/videobase/frame/PixelFrame;Lcom/tencent/liteav/videobase/base/GLConstants$GLScaleType;)V
    .locals 8

    .line 94
    iget-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->x:Lcom/tencent/liteav/videoconsumer/renderer/RenderViewHelperInterface;

    if-eqz v0, :cond_0

    .line 95
    iget-object v1, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->s:Lcom/tencent/liteav/videobase/base/GLConstants$GLScaleType;

    iget-object v2, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->A:Lcom/tencent/liteav/base/util/Size;

    .line 96
    invoke-virtual {v2}, Lcom/tencent/liteav/base/util/Size;->getWidth()I

    move-result v2

    iget-object v3, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->A:Lcom/tencent/liteav/base/util/Size;

    invoke-virtual {v3}, Lcom/tencent/liteav/base/util/Size;->getHeight()I

    move-result v3

    iget-boolean v4, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->z:Z

    .line 97
    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/tencent/liteav/videoconsumer/renderer/RenderViewHelperInterface;->updateVideoFrameInfo(Lcom/tencent/liteav/videobase/base/GLConstants$GLScaleType;IIZ)V

    .line 98
    :cond_0
    iget-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->k:Lcom/tencent/liteav/base/util/Size;

    invoke-virtual {v0}, Lcom/tencent/liteav/base/util/Size;->isValid()Z

    move-result v0

    if-nez v0, :cond_1

    goto/16 :goto_0

    .line 99
    :cond_1
    iget-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->x:Lcom/tencent/liteav/videoconsumer/renderer/RenderViewHelperInterface;

    instance-of v0, v0, Lcom/tencent/liteav/videoconsumer/renderer/k;

    if-eqz v0, :cond_2

    sget-object p2, Lcom/tencent/liteav/videobase/base/GLConstants$GLScaleType;->c:Lcom/tencent/liteav/videobase/base/GLConstants$GLScaleType;

    .line 100
    :cond_2
    iget-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->H:Ljava/util/List;

    iget-object v1, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->I:Ljava/util/List;

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-eqz v0, :cond_c

    .line 101
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v4, 0x4

    if-ne v0, v4, :cond_c

    if-eqz v1, :cond_c

    .line 102
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    if-ne v0, v4, :cond_c

    .line 103
    iget-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->G:Lcom/tencent/liteav/videoconsumer/renderer/a;

    const/4 v1, 0x1

    if-nez v0, :cond_3

    .line 104
    new-instance v0, Lcom/tencent/liteav/videoconsumer/renderer/a;

    iget-object v4, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->r:Lcom/tencent/liteav/videobase/frame/e;

    iget-object v5, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->k:Lcom/tencent/liteav/base/util/Size;

    iget v6, v5, Lcom/tencent/liteav/base/util/Size;->width:I

    iget v5, v5, Lcom/tencent/liteav/base/util/Size;->height:I

    invoke-direct {v0, v4, v6, v5}, Lcom/tencent/liteav/videoconsumer/renderer/a;-><init>(Lcom/tencent/liteav/videobase/frame/e;II)V

    iput-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->G:Lcom/tencent/liteav/videoconsumer/renderer/a;

    .line 105
    iget-object v4, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->H:Ljava/util/List;

    iget-object v5, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->I:Ljava/util/List;

    .line 106
    iput-object v4, v0, Lcom/tencent/liteav/videoconsumer/renderer/a;->i:Ljava/util/List;

    .line 107
    iput-object v5, v0, Lcom/tencent/liteav/videoconsumer/renderer/a;->j:Ljava/util/List;

    .line 108
    iput-boolean v1, v0, Lcom/tencent/liteav/videoconsumer/renderer/a;->k:Z

    .line 109
    :cond_3
    iget-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->x:Lcom/tencent/liteav/videoconsumer/renderer/RenderViewHelperInterface;

    if-eqz v0, :cond_4

    .line 110
    iget-object v4, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->G:Lcom/tencent/liteav/videoconsumer/renderer/a;

    iget-object v5, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->k:Lcom/tencent/liteav/base/util/Size;

    iget v6, v5, Lcom/tencent/liteav/base/util/Size;->width:I

    iget v5, v5, Lcom/tencent/liteav/base/util/Size;->height:I

    .line 111
    invoke-virtual {v0, v6, v5}, Lcom/tencent/liteav/videoconsumer/renderer/RenderViewHelperInterface;->getTransformMatrix(II)Landroid/graphics/Matrix;

    move-result-object v0

    .line 112
    iget-object v5, v4, Lcom/tencent/liteav/videoconsumer/renderer/a;->h:Landroid/graphics/Matrix;

    invoke-static {v5, v0}, Lcom/tencent/liteav/base/util/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_4

    .line 113
    iput-object v0, v4, Lcom/tencent/liteav/videoconsumer/renderer/a;->h:Landroid/graphics/Matrix;

    .line 114
    iput-boolean v1, v4, Lcom/tencent/liteav/videoconsumer/renderer/a;->k:Z

    .line 115
    :cond_4
    iget-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->G:Lcom/tencent/liteav/videoconsumer/renderer/a;

    iget-object v4, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->k:Lcom/tencent/liteav/base/util/Size;

    iget v5, v4, Lcom/tencent/liteav/base/util/Size;->width:I

    iget v4, v4, Lcom/tencent/liteav/base/util/Size;->height:I

    .line 116
    iget-object v6, v0, Lcom/tencent/liteav/videoconsumer/renderer/a;->b:Lcom/tencent/liteav/base/util/Size;

    iget v7, v6, Lcom/tencent/liteav/base/util/Size;->width:I

    if-ne v7, v5, :cond_5

    iget v7, v6, Lcom/tencent/liteav/base/util/Size;->height:I

    if-eq v7, v4, :cond_6

    .line 117
    :cond_5
    invoke-virtual {v6, v5, v4}, Lcom/tencent/liteav/base/util/Size;->set(II)V

    .line 118
    iput-boolean v1, v0, Lcom/tencent/liteav/videoconsumer/renderer/a;->k:Z

    .line 119
    :cond_6
    iget-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->G:Lcom/tencent/liteav/videoconsumer/renderer/a;

    .line 120
    iget-object v1, v0, Lcom/tencent/liteav/videoconsumer/renderer/a;->b:Lcom/tencent/liteav/base/util/Size;

    invoke-virtual {v1}, Lcom/tencent/liteav/base/util/Size;->isValid()Z

    move-result v1

    if-eqz v1, :cond_b

    .line 121
    iget-object v1, v0, Lcom/tencent/liteav/videoconsumer/renderer/a;->g:Lcom/tencent/liteav/videobase/frame/i;

    if-nez v1, :cond_7

    .line 122
    iget-object v1, v0, Lcom/tencent/liteav/videoconsumer/renderer/a;->a:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "create PixelFrameRenderer, size ="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v5, v0, Lcom/tencent/liteav/videoconsumer/renderer/a;->b:Lcom/tencent/liteav/base/util/Size;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 123
    new-instance v1, Lcom/tencent/liteav/videobase/frame/i;

    iget-object v4, v0, Lcom/tencent/liteav/videoconsumer/renderer/a;->b:Lcom/tencent/liteav/base/util/Size;

    iget v5, v4, Lcom/tencent/liteav/base/util/Size;->width:I

    iget v4, v4, Lcom/tencent/liteav/base/util/Size;->height:I

    invoke-direct {v1, v5, v4}, Lcom/tencent/liteav/videobase/frame/i;-><init>(II)V

    iput-object v1, v0, Lcom/tencent/liteav/videoconsumer/renderer/a;->g:Lcom/tencent/liteav/videobase/frame/i;

    .line 124
    :cond_7
    iget-object v1, v0, Lcom/tencent/liteav/videoconsumer/renderer/a;->b:Lcom/tencent/liteav/base/util/Size;

    iget v4, v1, Lcom/tencent/liteav/base/util/Size;->width:I

    iget v1, v1, Lcom/tencent/liteav/base/util/Size;->height:I

    invoke-static {v3, v3, v4, v1}, Lcom/tencent/liteav/videobase/utils/OpenGlUtils;->glViewport(IIII)V

    .line 125
    iget-object v1, v0, Lcom/tencent/liteav/videoconsumer/renderer/a;->c:Lcom/tencent/liteav/videobase/frame/e;

    iget-object v4, v0, Lcom/tencent/liteav/videoconsumer/renderer/a;->b:Lcom/tencent/liteav/base/util/Size;

    iget v5, v4, Lcom/tencent/liteav/base/util/Size;->width:I

    iget v4, v4, Lcom/tencent/liteav/base/util/Size;->height:I

    invoke-virtual {v1, v5, v4}, Lcom/tencent/liteav/videobase/frame/e;->a(II)Lcom/tencent/liteav/videobase/frame/d;

    move-result-object v1

    .line 126
    iget-object v4, v0, Lcom/tencent/liteav/videoconsumer/renderer/a;->g:Lcom/tencent/liteav/videobase/frame/i;

    iget-object v5, v0, Lcom/tencent/liteav/videoconsumer/renderer/a;->b:Lcom/tencent/liteav/base/util/Size;

    iget v6, v5, Lcom/tencent/liteav/base/util/Size;->width:I

    iget v5, v5, Lcom/tencent/liteav/base/util/Size;->height:I

    invoke-virtual {v4, v6, v5}, Lcom/tencent/liteav/videobase/frame/i;->a(II)V

    .line 127
    iget-object v4, v0, Lcom/tencent/liteav/videoconsumer/renderer/a;->g:Lcom/tencent/liteav/videobase/frame/i;

    invoke-virtual {v4, p1, p2, v1}, Lcom/tencent/liteav/videobase/frame/i;->a(Lcom/tencent/liteav/videobase/frame/PixelFrame;Lcom/tencent/liteav/videobase/base/GLConstants$GLScaleType;Lcom/tencent/liteav/videobase/frame/d;)V

    .line 128
    iget-object p1, v0, Lcom/tencent/liteav/videoconsumer/renderer/a;->d:Lcom/tencent/liteav/videobase/b/b;

    if-nez p1, :cond_9

    if-nez p1, :cond_9

    .line 129
    new-instance p1, Lcom/tencent/liteav/videobase/b/b;

    invoke-direct {p1}, Lcom/tencent/liteav/videobase/b/b;-><init>()V

    iput-object p1, v0, Lcom/tencent/liteav/videoconsumer/renderer/a;->d:Lcom/tencent/liteav/videobase/b/b;

    .line 130
    iget-object p2, v0, Lcom/tencent/liteav/videoconsumer/renderer/a;->c:Lcom/tencent/liteav/videobase/frame/e;

    invoke-virtual {p1, p2}, Lcom/tencent/liteav/videobase/a/a;->a(Lcom/tencent/liteav/videobase/frame/e;)V

    .line 131
    iget-object p1, v0, Lcom/tencent/liteav/videoconsumer/renderer/a;->e:Ljava/nio/FloatBuffer;

    if-eqz p1, :cond_8

    iget-object p1, v0, Lcom/tencent/liteav/videoconsumer/renderer/a;->f:Ljava/nio/FloatBuffer;

    if-nez p1, :cond_9

    .line 132
    :cond_8
    invoke-static {}, Lcom/tencent/liteav/videobase/utils/OpenGlUtils;->createNormalCubeVerticesBuffer()Ljava/nio/FloatBuffer;

    move-result-object p1

    iput-object p1, v0, Lcom/tencent/liteav/videoconsumer/renderer/a;->e:Ljava/nio/FloatBuffer;

    .line 133
    sget-object p1, Lcom/tencent/liteav/base/util/l;->a:Lcom/tencent/liteav/base/util/l;

    .line 134
    invoke-static {p1, v3, v3}, Lcom/tencent/liteav/videobase/utils/OpenGlUtils;->createTextureCoordsBuffer(Lcom/tencent/liteav/base/util/l;ZZ)Ljava/nio/FloatBuffer;

    move-result-object p1

    iput-object p1, v0, Lcom/tencent/liteav/videoconsumer/renderer/a;->f:Ljava/nio/FloatBuffer;

    .line 135
    :cond_9
    iget-boolean p1, v0, Lcom/tencent/liteav/videoconsumer/renderer/a;->k:Z

    if-eqz p1, :cond_a

    .line 136
    iget-object p1, v0, Lcom/tencent/liteav/videoconsumer/renderer/a;->i:Ljava/util/List;

    iget-object p2, v0, Lcom/tencent/liteav/videoconsumer/renderer/a;->j:Ljava/util/List;

    invoke-virtual {v0, p1, p2}, Lcom/tencent/liteav/videoconsumer/renderer/a;->a(Ljava/util/List;Ljava/util/List;)V

    .line 137
    iput-boolean v3, v0, Lcom/tencent/liteav/videoconsumer/renderer/a;->k:Z

    .line 138
    :cond_a
    iget-object p1, v0, Lcom/tencent/liteav/videoconsumer/renderer/a;->d:Lcom/tencent/liteav/videobase/b/b;

    invoke-virtual {v1}, Lcom/tencent/liteav/videobase/frame/d;->a()I

    move-result p2

    iget-object v3, v0, Lcom/tencent/liteav/videoconsumer/renderer/a;->e:Ljava/nio/FloatBuffer;

    iget-object v0, v0, Lcom/tencent/liteav/videoconsumer/renderer/a;->f:Ljava/nio/FloatBuffer;

    invoke-virtual {p1, p2, v2, v3, v0}, Lcom/tencent/liteav/videobase/a/a;->a(ILcom/tencent/liteav/videobase/frame/d;Ljava/nio/FloatBuffer;Ljava/nio/FloatBuffer;)V

    .line 139
    invoke-virtual {v1}, Lcom/tencent/liteav/videobase/frame/j;->release()V

    :cond_b
    :goto_0
    return-void

    .line 140
    :cond_c
    iget-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->k:Lcom/tencent/liteav/base/util/Size;

    iget v1, v0, Lcom/tencent/liteav/base/util/Size;->width:I

    iget v0, v0, Lcom/tencent/liteav/base/util/Size;->height:I

    invoke-static {v3, v3, v1, v0}, Lcom/tencent/liteav/videobase/utils/OpenGlUtils;->glViewport(IIII)V

    .line 141
    iget-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->q:Lcom/tencent/liteav/videobase/frame/i;

    if-nez v0, :cond_d

    .line 142
    iget-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "create PixelFrameRenderer, surfaceSize="

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->k:Lcom/tencent/liteav/base/util/Size;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 143
    new-instance v0, Lcom/tencent/liteav/videobase/frame/i;

    iget-object v1, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->k:Lcom/tencent/liteav/base/util/Size;

    iget v3, v1, Lcom/tencent/liteav/base/util/Size;->width:I

    iget v1, v1, Lcom/tencent/liteav/base/util/Size;->height:I

    invoke-direct {v0, v3, v1}, Lcom/tencent/liteav/videobase/frame/i;-><init>(II)V

    iput-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->q:Lcom/tencent/liteav/videobase/frame/i;

    .line 144
    :cond_d
    iget-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->q:Lcom/tencent/liteav/videobase/frame/i;

    iget-object v1, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->k:Lcom/tencent/liteav/base/util/Size;

    iget v3, v1, Lcom/tencent/liteav/base/util/Size;->width:I

    iget v1, v1, Lcom/tencent/liteav/base/util/Size;->height:I

    invoke-virtual {v0, v3, v1}, Lcom/tencent/liteav/videobase/frame/i;->a(II)V

    .line 145
    iget-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->q:Lcom/tencent/liteav/videobase/frame/i;

    invoke-virtual {v0, p1, p2, v2}, Lcom/tencent/liteav/videobase/frame/i;->a(Lcom/tencent/liteav/videobase/frame/PixelFrame;Lcom/tencent/liteav/videobase/base/GLConstants$GLScaleType;Lcom/tencent/liteav/videobase/frame/d;)V

    return-void
.end method

.method public static synthetic a(Lcom/tencent/liteav/videoconsumer/renderer/u;)V
    .locals 3

    .line 171
    iget-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string/jumbo v2, "onSurfaceDestroy "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->l:Landroid/view/Surface;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 172
    iget-boolean v1, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->m:Z

    invoke-direct {p0, v0, v1}, Lcom/tencent/liteav/videoconsumer/renderer/u;->a(Landroid/view/Surface;Z)V

    return-void
.end method

.method public static synthetic a(Lcom/tencent/liteav/videoconsumer/renderer/u;Landroid/view/Surface;Z)V
    .locals 3

    .line 162
    iget-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->a:Ljava/lang/String;

    iget-object v1, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->l:Landroid/view/Surface;

    .line 163
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    filled-new-array {p1, v1, v2}, [Ljava/lang/Object;

    move-result-object v1

    .line 164
    const-string/jumbo v2, "onSurfaceChanged surface: %s, oldSurface: %s, isNeedRelease: %b"

    invoke-static {v0, v2, v1}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 165
    invoke-direct {p0, p1, p2}, Lcom/tencent/liteav/videoconsumer/renderer/u;->a(Landroid/view/Surface;Z)V

    return-void
.end method

.method public static synthetic a(Lcom/tencent/liteav/videoconsumer/renderer/u;Lcom/tencent/liteav/base/util/l;)V
    .locals 3

    .line 41
    iget-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->t:Lcom/tencent/liteav/base/util/l;

    if-eq v0, p1, :cond_0

    .line 42
    iget-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->a:Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string/jumbo v2, "setRenderRotation "

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    iput-object p1, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->t:Lcom/tencent/liteav/base/util/l;

    :cond_0
    return-void
.end method

.method public static synthetic a(Lcom/tencent/liteav/videoconsumer/renderer/u;Lcom/tencent/liteav/videobase/base/GLConstants$GLScaleType;)V
    .locals 3

    .line 37
    iget-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->s:Lcom/tencent/liteav/videobase/base/GLConstants$GLScaleType;

    if-eq v0, p1, :cond_0

    .line 38
    iget-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->a:Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string/jumbo v2, "setScaleType "

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    iput-object p1, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->s:Lcom/tencent/liteav/videobase/base/GLConstants$GLScaleType;

    :cond_0
    return-void
.end method

.method public static synthetic a(Lcom/tencent/liteav/videoconsumer/renderer/u;Lcom/tencent/liteav/videobase/videobase/DisplayTarget;Z)V
    .locals 0

    .line 35
    invoke-direct {p0, p1, p2}, Lcom/tencent/liteav/videoconsumer/renderer/u;->b(Lcom/tencent/liteav/videobase/videobase/DisplayTarget;Z)V

    return-void
.end method

.method public static synthetic a(Lcom/tencent/liteav/videoconsumer/renderer/u;Lcom/tencent/liteav/videoconsumer/renderer/RenderViewHelperInterface;Ljava/nio/ByteBuffer;IILcom/tencent/liteav/videobase/base/a;)V
    .locals 2

    .line 146
    instance-of v0, p1, Lcom/tencent/liteav/videoconsumer/renderer/k;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 147
    check-cast p1, Lcom/tencent/liteav/videoconsumer/renderer/k;

    .line 148
    iget-object p1, p1, Lcom/tencent/liteav/videoconsumer/renderer/k;->a:Landroid/view/TextureView;

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    if-nez p1, :cond_1

    goto :goto_1

    .line 149
    :cond_1
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    invoke-virtual {p1, v0}, Landroid/view/TextureView;->getTransform(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    move-result-object v1

    .line 150
    :goto_1
    iget-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->i:Lcom/tencent/liteav/base/util/m;

    move-object p1, p2

    move p2, p3

    move p3, p4

    move-object p4, v1

    invoke-static/range {p0 .. p5}, Lcom/tencent/liteav/videoconsumer/renderer/ab;->a(Lcom/tencent/liteav/videoconsumer/renderer/u;Ljava/nio/ByteBuffer;IILandroid/graphics/Matrix;Lcom/tencent/liteav/videobase/base/a;)Ljava/lang/Runnable;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/tencent/liteav/base/util/m;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static synthetic a(Lcom/tencent/liteav/videoconsumer/renderer/u;Lcom/tencent/liteav/videoconsumer/renderer/t;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->a:Ljava/lang/String;

    const-string v1, "Start"

    invoke-static {v0, v1}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-boolean v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->c:Z

    if-eqz v0, :cond_0

    .line 3
    iget-object p0, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->a:Ljava/lang/String;

    const-string/jumbo p1, "renderer is started!"

    invoke-static {p0, p1}, Lcom/tencent/liteav/base/util/LiteavLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 4
    iput-boolean v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->c:Z

    .line 5
    iput-object p1, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->C:Lcom/tencent/liteav/videoconsumer/renderer/t;

    .line 6
    iget-object p1, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->w:Lcom/tencent/liteav/videobase/videobase/DisplayTarget;

    if-eqz p1, :cond_1

    .line 7
    invoke-direct {p0, p1, v0}, Lcom/tencent/liteav/videoconsumer/renderer/u;->b(Lcom/tencent/liteav/videobase/videobase/DisplayTarget;Z)V

    .line 8
    :cond_1
    iget-object p0, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->F:Lcom/tencent/liteav/base/b/a;

    .line 9
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/tencent/liteav/base/b/a;->a:J

    return-void
.end method

.method public static synthetic a(Lcom/tencent/liteav/videoconsumer/renderer/u;Ljava/nio/ByteBuffer;IILandroid/graphics/Matrix;Lcom/tencent/liteav/videobase/base/a;)V
    .locals 2

    const/4 v0, 0x0

    .line 173
    :try_start_0
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 174
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {p2, p3, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 175
    invoke-virtual {v0, p1}, Landroid/graphics/Bitmap;->copyPixelsFromBuffer(Ljava/nio/Buffer;)V

    if-nez p4, :cond_0

    .line 176
    new-instance p4, Landroid/graphics/Matrix;

    invoke-direct {p4}, Landroid/graphics/Matrix;-><init>()V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    int-to-float p1, p2

    const/high16 p2, 0x40000000    # 2.0f

    div-float/2addr p1, p2

    int-to-float p3, p3

    div-float/2addr p3, p2

    const/high16 p2, 0x3f800000    # 1.0f

    const/high16 v1, -0x40800000    # -1.0f

    .line 177
    invoke-virtual {p4, p2, v1, p1, p3}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    const/4 p1, 0x1

    .line 178
    invoke-static {v0, p4, p1}, Lcom/tencent/liteav/videobase/utils/BitmapUtils;->createBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object p1

    .line 179
    invoke-interface {p5, p1}, Lcom/tencent/liteav/videobase/base/a;->onComplete(Landroid/graphics/Bitmap;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    .line 180
    :goto_1
    iget-object p0, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->a:Ljava/lang/String;

    const-string p2, "build snapshot bitmap failed."

    invoke-static {p0, p2, p1}, Lcom/tencent/liteav/base/util/LiteavLog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p0, 0x0

    .line 181
    invoke-interface {p5, p0}, Lcom/tencent/liteav/videobase/base/a;->onComplete(Landroid/graphics/Bitmap;)V

    return-void
.end method

.method public static synthetic a(Lcom/tencent/liteav/videoconsumer/renderer/u;Z)V
    .locals 4

    .line 10
    iget-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->a:Ljava/lang/String;

    const-string v1, "Stop,clearLastImage="

    invoke-static {p1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    iget-boolean v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->c:Z

    if-nez v0, :cond_0

    .line 12
    iget-object p0, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->a:Ljava/lang/String;

    const-string/jumbo p1, "renderer is not started!"

    invoke-static {p0, p1}, Lcom/tencent/liteav/base/util/LiteavLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 13
    iput-boolean v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->c:Z

    const/4 v1, 0x0

    .line 14
    iput-object v1, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->B:Lcom/tencent/liteav/videobase/base/a;

    .line 15
    invoke-direct {p0, p1}, Lcom/tencent/liteav/videoconsumer/renderer/u;->a(Z)V

    .line 16
    iget-object v2, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->w:Lcom/tencent/liteav/videobase/videobase/DisplayTarget;

    if-eqz v2, :cond_1

    if-eqz p1, :cond_1

    .line 17
    invoke-virtual {v2}, Lcom/tencent/liteav/videobase/videobase/DisplayTarget;->hideAll()V

    .line 18
    :cond_1
    iget-object p1, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->b:Lcom/tencent/liteav/videobase/utils/f;

    .line 19
    monitor-enter p1

    .line 20
    :try_start_0
    new-instance v2, Ljava/util/ArrayList;

    iget-object v3, p1, Lcom/tencent/liteav/videobase/utils/f;->a:Ljava/util/Deque;

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 21
    iget-object v3, p1, Lcom/tencent/liteav/videobase/utils/f;->a:Ljava/util/Deque;

    invoke-interface {v3}, Ljava/util/Collection;->clear()V

    .line 22
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    const-string p1, "RingFrameQueue"

    const-string v3, "evictAll pixelFrame."

    invoke-static {p1, v3}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    invoke-static {v2}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->releasePixelFrames(Ljava/util/Collection;)V

    .line 25
    invoke-direct {p0}, Lcom/tencent/liteav/videoconsumer/renderer/u;->a()V

    .line 26
    iget-boolean p1, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->m:Z

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->l:Landroid/view/Surface;

    if-eqz p1, :cond_2

    .line 27
    invoke-virtual {p1}, Landroid/view/Surface;->release()V

    .line 28
    iput-boolean v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->m:Z

    .line 29
    :cond_2
    iput-object v1, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->l:Landroid/view/Surface;

    .line 30
    iget-object p1, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->k:Lcom/tencent/liteav/base/util/Size;

    invoke-virtual {p1, v0, v0}, Lcom/tencent/liteav/base/util/Size;->set(II)V

    .line 31
    iget-object p1, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->y:Lcom/tencent/liteav/base/util/Size;

    invoke-virtual {p1, v0, v0}, Lcom/tencent/liteav/base/util/Size;->set(II)V

    .line 32
    iput-boolean v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->d:Z

    return-void

    :catchall_0
    move-exception p0

    .line 33
    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method private a(Z)V
    .locals 1

    .line 159
    iget-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->x:Lcom/tencent/liteav/videoconsumer/renderer/RenderViewHelperInterface;

    if-eqz v0, :cond_0

    .line 160
    invoke-virtual {v0, p1}, Lcom/tencent/liteav/videoconsumer/renderer/RenderViewHelperInterface;->release(Z)V

    const/4 p1, 0x0

    .line 161
    iput-object p1, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->x:Lcom/tencent/liteav/videoconsumer/renderer/RenderViewHelperInterface;

    :cond_0
    return-void
.end method

.method private a(Lcom/tencent/liteav/videobase/frame/PixelFrame;)Z
    .locals 5

    .line 73
    invoke-virtual {p1}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->getGLContext()Ljava/lang/Object;

    move-result-object v0

    .line 74
    iget-object v1, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->o:Lcom/tencent/liteav/videobase/egl/EGLCore;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    if-eqz v0, :cond_3

    iget-object v1, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->n:Ljava/lang/Object;

    .line 75
    invoke-static {v1, v0}, Lcom/tencent/liteav/base/util/CommonUtil;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 76
    :cond_0
    invoke-direct {p0}, Lcom/tencent/liteav/videoconsumer/renderer/u;->a()V

    .line 77
    invoke-virtual {p1}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->getGLContext()Ljava/lang/Object;

    move-result-object p1

    .line 78
    iget-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->l:Landroid/view/Surface;

    if-nez v0, :cond_1

    .line 79
    iget-object p1, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->j:Lcom/tencent/liteav/base/b/b;

    const-string v0, "initGLNoSurface"

    invoke-virtual {p1, v0}, Lcom/tencent/liteav/base/b/b;->a(Ljava/lang/String;)Lcom/tencent/liteav/base/b/a;

    move-result-object p1

    iget-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->a:Ljava/lang/String;

    const-string v1, "Initialize EGL failed because surface is null"

    new-array v3, v2, [Ljava/lang/Object;

    invoke-static {p1, v0, v1, v3}, Lcom/tencent/liteav/base/util/LiteavLog;->e(Lcom/tencent/liteav/base/b/a;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_2

    .line 80
    :cond_1
    :try_start_0
    iget-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->j:Lcom/tencent/liteav/base/b/b;

    const-string v1, "initGL"

    invoke-virtual {v0, v1}, Lcom/tencent/liteav/base/b/b;->a(Ljava/lang/String;)Lcom/tencent/liteav/base/b/a;

    move-result-object v0

    iget-object v1, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->a:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "initializeEGL surface="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v4, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->l:Landroid/view/Surface;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, ",size="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->k:Lcom/tencent/liteav/base/util/Size;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-array v4, v2, [Ljava/lang/Object;

    invoke-static {v0, v1, v3, v4}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Lcom/tencent/liteav/base/b/a;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 81
    new-instance v0, Lcom/tencent/liteav/videobase/egl/EGLCore;

    invoke-direct {v0}, Lcom/tencent/liteav/videobase/egl/EGLCore;-><init>()V

    iput-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->o:Lcom/tencent/liteav/videobase/egl/EGLCore;

    .line 82
    iget-object v1, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->l:Landroid/view/Surface;

    iget-object v3, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->k:Lcom/tencent/liteav/base/util/Size;

    iget v4, v3, Lcom/tencent/liteav/base/util/Size;->width:I

    iget v3, v3, Lcom/tencent/liteav/base/util/Size;->height:I

    invoke-virtual {v0, p1, v1, v4, v3}, Lcom/tencent/liteav/videobase/egl/EGLCore;->initialize(Ljava/lang/Object;Landroid/view/Surface;II)V

    .line 83
    iput-object p1, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->n:Ljava/lang/Object;

    .line 84
    iget-object p1, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->o:Lcom/tencent/liteav/videobase/egl/EGLCore;

    invoke-virtual {p1}, Lcom/tencent/liteav/videobase/egl/EGLCore;->makeCurrent()V

    .line 85
    iget-object p1, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->r:Lcom/tencent/liteav/videobase/frame/e;

    if-nez p1, :cond_2

    .line 86
    new-instance p1, Lcom/tencent/liteav/videobase/frame/e;

    invoke-direct {p1}, Lcom/tencent/liteav/videobase/frame/e;-><init>()V

    iput-object p1, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->r:Lcom/tencent/liteav/videobase/frame/e;

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    .line 87
    :cond_2
    :goto_0
    iget-object p1, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->p:Lcom/tencent/liteav/videobase/frame/c;

    invoke-virtual {p1}, Lcom/tencent/liteav/videobase/frame/c;->a()V
    :try_end_0
    .catch Lcom/tencent/liteav/videobase/egl/d; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    .line 88
    :goto_1
    iget-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->j:Lcom/tencent/liteav/base/b/b;

    const-string v1, "initGLError"

    invoke-virtual {v0, v1}, Lcom/tencent/liteav/base/b/b;->a(Ljava/lang/String;)Lcom/tencent/liteav/base/b/a;

    move-result-object v0

    iget-object v1, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->a:Ljava/lang/String;

    const-string v3, "initializeEGL failed."

    invoke-static {v0, v1, v3, p1}, Lcom/tencent/liteav/base/util/LiteavLog;->e(Lcom/tencent/liteav/base/b/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    .line 89
    iput-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->o:Lcom/tencent/liteav/videobase/egl/EGLCore;

    .line 90
    iget-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->g:Lcom/tencent/liteav/videobase/videobase/c;

    sget-object v1, Lcom/tencent/liteav/videobase/videobase/e$c;->e:Lcom/tencent/liteav/videobase/videobase/e$c;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v3, "VideoRender: create EGLCore fail:"

    invoke-virtual {v3, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lcom/tencent/liteav/videobase/videobase/c;->notifyWarning(Lcom/tencent/liteav/videobase/videobase/e$c;Ljava/lang/String;)V

    .line 91
    :cond_3
    :goto_2
    iget-object p1, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->o:Lcom/tencent/liteav/videobase/egl/EGLCore;

    if-nez p1, :cond_4

    return v2

    .line 92
    :cond_4
    :try_start_1
    invoke-virtual {p1}, Lcom/tencent/liteav/videobase/egl/EGLCore;->makeCurrent()V
    :try_end_1
    .catch Lcom/tencent/liteav/videobase/egl/d; {:try_start_1 .. :try_end_1} :catch_1

    const/4 p1, 0x1

    return p1

    :catch_1
    move-exception p1

    .line 93
    iget-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->j:Lcom/tencent/liteav/base/b/b;

    const-string v1, "makeCurrentForFrameError"

    invoke-virtual {v0, v1}, Lcom/tencent/liteav/base/b/b;->a(Ljava/lang/String;)Lcom/tencent/liteav/base/b/a;

    move-result-object v0

    iget-object v1, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->a:Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v3, "EGLCore makeCurrent failed."

    invoke-virtual {v3, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-array v3, v2, [Ljava/lang/Object;

    invoke-static {v0, v1, p1, v3}, Lcom/tencent/liteav/base/util/LiteavLog;->e(Lcom/tencent/liteav/base/b/a;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return v2
.end method

.method private b()V
    .locals 5

    .line 12
    iget-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->o:Lcom/tencent/liteav/videobase/egl/EGLCore;

    if-nez v0, :cond_0

    goto :goto_0

    .line 13
    :cond_0
    invoke-virtual {v0}, Lcom/tencent/liteav/videobase/egl/EGLCore;->getSurfaceSize()Lcom/tencent/liteav/base/util/Size;

    move-result-object v0

    .line 14
    iget-object v1, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->k:Lcom/tencent/liteav/base/util/Size;

    invoke-virtual {v1, v0}, Lcom/tencent/liteav/base/util/Size;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    .line 15
    :cond_1
    iget-object v1, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->j:Lcom/tencent/liteav/base/b/b;

    const-string/jumbo v2, "updateSurfaceSize"

    invoke-virtual {v1, v2}, Lcom/tencent/liteav/base/b/b;->a(Ljava/lang/String;)Lcom/tencent/liteav/base/b/a;

    move-result-object v1

    iget-object v2, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->a:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string/jumbo v4, "surface size changed,old size="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v4, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->k:Lcom/tencent/liteav/base/util/Size;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, ",new size="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    new-array v4, v4, [Ljava/lang/Object;

    invoke-static {v1, v2, v3, v4}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Lcom/tencent/liteav/base/b/a;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 16
    iget-object v1, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->k:Lcom/tencent/liteav/base/util/Size;

    invoke-virtual {v1, v0}, Lcom/tencent/liteav/base/util/Size;->set(Lcom/tencent/liteav/base/util/Size;)V

    .line 17
    iget-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->l:Landroid/view/Surface;

    if-eqz v0, :cond_2

    .line 18
    iget-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->g:Lcom/tencent/liteav/videobase/videobase/c;

    sget-object v1, Lcom/tencent/liteav/videobase/videobase/f;->j:Lcom/tencent/liteav/videobase/videobase/f;

    iget-object v2, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->k:Lcom/tencent/liteav/base/util/Size;

    iget v3, v2, Lcom/tencent/liteav/base/util/Size;->width:I

    shl-int/lit8 v3, v3, 0x10

    iget v2, v2, Lcom/tencent/liteav/base/util/Size;->height:I

    or-int/2addr v2, v3

    .line 19
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    .line 20
    invoke-interface {v0, v1, v2}, Lcom/tencent/liteav/videobase/videobase/c;->updateStatus(Lcom/tencent/liteav/videobase/videobase/f;Ljava/lang/Object;)V

    :cond_2
    :goto_0
    return-void
.end method

.method private b(Lcom/tencent/liteav/videobase/videobase/DisplayTarget;Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string/jumbo v2, "setDisplayViewInternal="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ",clearLastImage="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->w:Lcom/tencent/liteav/videobase/videobase/DisplayTarget;

    invoke-static {v0, p1}, Lcom/tencent/liteav/base/util/CommonUtil;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    .line 3
    iget-object v1, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->x:Lcom/tencent/liteav/videoconsumer/renderer/RenderViewHelperInterface;

    if-eqz v1, :cond_0

    .line 4
    iget-object p1, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->a:Ljava/lang/String;

    const-string/jumbo p2, "view is equal and RenderViewHelper is created."

    invoke-static {p1, p2}, Lcom/tencent/liteav/base/util/LiteavLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    if-nez v0, :cond_1

    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->D:Z

    .line 6
    iget-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->w:Lcom/tencent/liteav/videobase/videobase/DisplayTarget;

    if-eqz v0, :cond_1

    if-eqz p2, :cond_1

    .line 7
    invoke-virtual {v0}, Lcom/tencent/liteav/videobase/videobase/DisplayTarget;->hideAll()V

    .line 8
    :cond_1
    invoke-direct {p0, p2}, Lcom/tencent/liteav/videoconsumer/renderer/u;->a(Z)V

    .line 9
    iput-object p1, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->w:Lcom/tencent/liteav/videobase/videobase/DisplayTarget;

    if-nez p1, :cond_2

    return-void

    .line 10
    :cond_2
    invoke-virtual {p1}, Lcom/tencent/liteav/videobase/videobase/DisplayTarget;->showAll()V

    .line 11
    invoke-static {p1, p0}, Lcom/tencent/liteav/videoconsumer/renderer/RenderViewHelperInterface;->create(Lcom/tencent/liteav/videobase/videobase/DisplayTarget;Lcom/tencent/liteav/videoconsumer/renderer/RenderViewHelperInterface$RenderViewListener;)Lcom/tencent/liteav/videoconsumer/renderer/RenderViewHelperInterface;

    move-result-object p1

    iput-object p1, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->x:Lcom/tencent/liteav/videoconsumer/renderer/RenderViewHelperInterface;

    return-void
.end method

.method public static synthetic b(Lcom/tencent/liteav/videoconsumer/renderer/u;)V
    .locals 2

    const/4 v0, 0x0

    .line 21
    invoke-direct {p0, v0}, Lcom/tencent/liteav/videoconsumer/renderer/u;->a(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 22
    :cond_0
    invoke-static {v0}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->createFromBitmap(Landroid/graphics/Bitmap;)Lcom/tencent/liteav/videobase/frame/PixelFrame;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_0

    .line 23
    :cond_1
    invoke-direct {p0, v0}, Lcom/tencent/liteav/videoconsumer/renderer/u;->a(Lcom/tencent/liteav/videobase/frame/PixelFrame;)Z

    move-result v1

    if-nez v1, :cond_2

    :goto_0
    return-void

    .line 24
    :cond_2
    invoke-direct {p0}, Lcom/tencent/liteav/videoconsumer/renderer/u;->b()V

    const/4 v1, 0x1

    .line 25
    invoke-virtual {v0, v1}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->setMirrorVertical(Z)V

    .line 26
    iget-object v1, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->s:Lcom/tencent/liteav/videobase/base/GLConstants$GLScaleType;

    invoke-direct {p0, v0, v1}, Lcom/tencent/liteav/videoconsumer/renderer/u;->a(Lcom/tencent/liteav/videobase/frame/PixelFrame;Lcom/tencent/liteav/videobase/base/GLConstants$GLScaleType;)V

    .line 27
    invoke-direct {p0}, Lcom/tencent/liteav/videoconsumer/renderer/u;->c()Z

    return-void
.end method

.method public static synthetic c(Lcom/tencent/liteav/videoconsumer/renderer/u;)V
    .locals 12

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->b:Lcom/tencent/liteav/videobase/utils/f;

    invoke-virtual {v0}, Lcom/tencent/liteav/videobase/utils/f;->a()Lcom/tencent/liteav/videobase/frame/PixelFrame;

    move-result-object v0

    if-nez v0, :cond_0

    .line 2
    iget-object p0, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->a:Ljava/lang/String;

    const-string/jumbo v0, "renderFrameInternal pixelFrame is null!"

    invoke-static {p0, v0}, Lcom/tencent/liteav/base/util/LiteavLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 3
    :cond_0
    iget-object v1, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->y:Lcom/tencent/liteav/base/util/Size;

    invoke-virtual {v0}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->getWidth()I

    move-result v2

    invoke-virtual {v0}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->getHeight()I

    move-result v3

    invoke-virtual {v1, v2, v3}, Lcom/tencent/liteav/base/util/Size;->set(II)V

    .line 4
    invoke-virtual {v0}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->getMetaData()Lcom/tencent/liteav/videobase/frame/FrameMetaData;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 5
    invoke-virtual {v1}, Lcom/tencent/liteav/videobase/frame/FrameMetaData;->getRenderRotation()Lcom/tencent/liteav/base/util/l;

    move-result-object v2

    iput-object v2, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->t:Lcom/tencent/liteav/base/util/l;

    .line 6
    invoke-virtual {v1}, Lcom/tencent/liteav/videobase/frame/FrameMetaData;->isRenderMirrorHorizontal()Z

    move-result v2

    iput-boolean v2, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->u:Z

    .line 7
    invoke-virtual {v1}, Lcom/tencent/liteav/videobase/frame/FrameMetaData;->isRenderMirrorVertical()Z

    move-result v2

    iput-boolean v2, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->v:Z

    .line 8
    iget-object v2, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->y:Lcom/tencent/liteav/base/util/Size;

    invoke-virtual {v1}, Lcom/tencent/liteav/videobase/frame/FrameMetaData;->getCaptureRealSize()Lcom/tencent/liteav/base/util/Size;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/tencent/liteav/base/util/Size;->set(Lcom/tencent/liteav/base/util/Size;)V

    .line 9
    :cond_1
    iget-object v1, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->F:Lcom/tencent/liteav/base/b/a;

    invoke-virtual {v1}, Lcom/tencent/liteav/base/b/a;->a()Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->x:Lcom/tencent/liteav/videoconsumer/renderer/RenderViewHelperInterface;

    if-eqz v1, :cond_2

    .line 10
    invoke-virtual {v1}, Lcom/tencent/liteav/videoconsumer/renderer/RenderViewHelperInterface;->checkViewAvailability()V

    .line 11
    :cond_2
    iget-boolean v1, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->z:Z

    if-eqz v1, :cond_4

    .line 12
    iget-object v1, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->x:Lcom/tencent/liteav/videoconsumer/renderer/RenderViewHelperInterface;

    if-eqz v1, :cond_3

    .line 13
    iget-object v2, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->s:Lcom/tencent/liteav/videobase/base/GLConstants$GLScaleType;

    .line 14
    invoke-virtual {v0}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->getWidth()I

    move-result v3

    invoke-virtual {v0}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->getHeight()I

    move-result v4

    iget-boolean p0, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->z:Z

    .line 15
    invoke-virtual {v1, v2, v3, v4, p0}, Lcom/tencent/liteav/videoconsumer/renderer/RenderViewHelperInterface;->updateVideoFrameInfo(Lcom/tencent/liteav/videobase/base/GLConstants$GLScaleType;IIZ)V

    .line 16
    :cond_3
    sget p0, Lcom/tencent/liteav/videoconsumer/renderer/t$a;->a:I

    goto/16 :goto_1

    .line 17
    :cond_4
    iget-object v1, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->x:Lcom/tencent/liteav/videoconsumer/renderer/RenderViewHelperInterface;

    if-nez v1, :cond_5

    .line 18
    sget p0, Lcom/tencent/liteav/videoconsumer/renderer/t$a;->a:I

    goto/16 :goto_1

    .line 19
    :cond_5
    invoke-direct {p0, v0}, Lcom/tencent/liteav/videoconsumer/renderer/u;->a(Lcom/tencent/liteav/videobase/frame/PixelFrame;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_6

    .line 20
    sget v1, Lcom/tencent/liteav/videoconsumer/renderer/t$a;->a:I

    .line 21
    iget-object v1, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->j:Lcom/tencent/liteav/base/b/b;

    const-string v3, "makeCurrent"

    invoke-virtual {v1, v3}, Lcom/tencent/liteav/base/b/b;->a(Ljava/lang/String;)Lcom/tencent/liteav/base/b/a;

    move-result-object v1

    iget-object p0, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->a:Ljava/lang/String;

    const-string v3, "make current failed."

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v1, p0, v3, v2}, Lcom/tencent/liteav/base/util/LiteavLog;->e(Lcom/tencent/liteav/base/b/a;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_1

    .line 22
    :cond_6
    invoke-direct {p0}, Lcom/tencent/liteav/videoconsumer/renderer/u;->b()V

    .line 23
    new-instance v1, Lcom/tencent/liteav/videobase/frame/PixelFrame;

    invoke-direct {v1, v0}, Lcom/tencent/liteav/videobase/frame/PixelFrame;-><init>(Lcom/tencent/liteav/videobase/frame/PixelFrame;)V

    .line 24
    iget-boolean v3, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->u:Z

    iget-boolean v4, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->v:Z

    iget-object v5, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->t:Lcom/tencent/liteav/base/util/l;

    .line 25
    invoke-virtual {v1}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->getRotation()Lcom/tencent/liteav/base/util/l;

    move-result-object v6

    .line 26
    iget v6, v6, Lcom/tencent/liteav/base/util/l;->mValue:I

    .line 27
    iget v7, v5, Lcom/tencent/liteav/base/util/l;->mValue:I

    add-int/2addr v6, v7

    .line 28
    rem-int/lit16 v6, v6, 0x168

    .line 29
    invoke-static {v6}, Lcom/tencent/liteav/base/util/l;->a(I)Lcom/tencent/liteav/base/util/l;

    move-result-object v6

    invoke-virtual {v1, v6}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->setRotation(Lcom/tencent/liteav/base/util/l;)V

    if-eqz v3, :cond_7

    .line 30
    invoke-virtual {v1}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->isMirrorHorizontal()Z

    move-result v3

    xor-int/lit8 v3, v3, 0x1

    invoke-virtual {v1, v3}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->setMirrorHorizontal(Z)V

    :cond_7
    if-eqz v4, :cond_8

    .line 31
    invoke-virtual {v1}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->isMirrorVertical()Z

    move-result v3

    xor-int/lit8 v3, v3, 0x1

    invoke-virtual {v1, v3}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->setMirrorVertical(Z)V

    .line 32
    :cond_8
    sget-object v3, Lcom/tencent/liteav/base/util/l;->b:Lcom/tencent/liteav/base/util/l;

    if-eq v5, v3, :cond_9

    sget-object v3, Lcom/tencent/liteav/base/util/l;->d:Lcom/tencent/liteav/base/util/l;

    if-ne v5, v3, :cond_a

    .line 33
    :cond_9
    invoke-virtual {v1}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->getWidth()I

    move-result v3

    .line 34
    invoke-virtual {v1}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->getHeight()I

    move-result v4

    invoke-virtual {v1, v4}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->setWidth(I)V

    .line 35
    invoke-virtual {v1, v3}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->setHeight(I)V

    .line 36
    :cond_a
    invoke-virtual {v1}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->isMirrorVertical()Z

    move-result v3

    xor-int/lit8 v3, v3, 0x1

    invoke-virtual {v1, v3}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->setMirrorVertical(Z)V

    .line 37
    invoke-virtual {v1}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->getRotation()Lcom/tencent/liteav/base/util/l;

    move-result-object v3

    sget-object v4, Lcom/tencent/liteav/base/util/l;->a:Lcom/tencent/liteav/base/util/l;

    if-eq v3, v4, :cond_b

    .line 38
    invoke-virtual {v1}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->getRotation()Lcom/tencent/liteav/base/util/l;

    move-result-object v3

    sget-object v4, Lcom/tencent/liteav/base/util/l;->c:Lcom/tencent/liteav/base/util/l;

    if-eq v3, v4, :cond_b

    .line 39
    invoke-virtual {v1}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->getRotation()Lcom/tencent/liteav/base/util/l;

    move-result-object v3

    .line 40
    iget v3, v3, Lcom/tencent/liteav/base/util/l;->mValue:I

    .line 41
    iget v4, v4, Lcom/tencent/liteav/base/util/l;->mValue:I

    add-int/2addr v3, v4

    .line 42
    rem-int/lit16 v3, v3, 0x168

    .line 43
    invoke-static {v3}, Lcom/tencent/liteav/base/util/l;->a(I)Lcom/tencent/liteav/base/util/l;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->setRotation(Lcom/tencent/liteav/base/util/l;)V

    .line 44
    :cond_b
    iget-object v3, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->A:Lcom/tencent/liteav/base/util/Size;

    invoke-virtual {v1}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->getWidth()I

    move-result v4

    iput v4, v3, Lcom/tencent/liteav/base/util/Size;->width:I

    .line 45
    iget-object v3, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->A:Lcom/tencent/liteav/base/util/Size;

    invoke-virtual {v1}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->getHeight()I

    move-result v4

    iput v4, v3, Lcom/tencent/liteav/base/util/Size;->height:I

    .line 46
    iget-object v3, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->s:Lcom/tencent/liteav/videobase/base/GLConstants$GLScaleType;

    invoke-direct {p0, v1, v3}, Lcom/tencent/liteav/videoconsumer/renderer/u;->a(Lcom/tencent/liteav/videobase/frame/PixelFrame;Lcom/tencent/liteav/videobase/base/GLConstants$GLScaleType;)V

    .line 47
    iget-object v1, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->B:Lcom/tencent/liteav/videobase/base/a;

    const/4 v3, 0x0

    if-eqz v1, :cond_c

    const v1, 0x8d40

    .line 48
    invoke-static {v1, v2}, Lcom/tencent/liteav/videobase/utils/OpenGlUtils;->bindFramebuffer(II)V

    .line 49
    iget-object v1, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->k:Lcom/tencent/liteav/base/util/Size;

    iget v6, v1, Lcom/tencent/liteav/base/util/Size;->width:I

    iget v7, v1, Lcom/tencent/liteav/base/util/Size;->height:I

    .line 50
    iget-object v1, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->B:Lcom/tencent/liteav/videobase/base/a;

    if-eqz v1, :cond_c

    .line 51
    iput-object v3, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->B:Lcom/tencent/liteav/videobase/base/a;

    mul-int v4, v6, v7

    mul-int/lit8 v4, v4, 0x4

    .line 52
    invoke-static {v4}, Lcom/tencent/liteav/videobase/utils/d;->b(I)Ljava/nio/ByteBuffer;

    move-result-object v10

    if-nez v10, :cond_d

    .line 53
    iget-object v4, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->a:Ljava/lang/String;

    const-string/jumbo v5, "snapshotVideoFrameFromFrameBuffer, allocate direct buffer failed."

    invoke-static {v4, v5}, Lcom/tencent/liteav/base/util/LiteavLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    invoke-interface {v1, v3}, Lcom/tencent/liteav/videobase/base/a;->onComplete(Landroid/graphics/Bitmap;)V

    :cond_c
    move-object v4, p0

    goto :goto_0

    .line 55
    :cond_d
    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object v4

    invoke-virtual {v10, v4}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 56
    invoke-virtual {v10, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    const/16 v8, 0x1908

    const/16 v9, 0x1401

    const/4 v4, 0x0

    const/4 v5, 0x0

    .line 57
    invoke-static/range {v4 .. v10}, Landroid/opengl/GLES20;->glReadPixels(IIIIIILjava/nio/Buffer;)V

    .line 58
    iget-object v5, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->x:Lcom/tencent/liteav/videoconsumer/renderer/RenderViewHelperInterface;

    .line 59
    iget-object v11, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->e:Landroid/os/Handler;

    move-object v4, p0

    move-object v9, v1

    move v8, v7

    move v7, v6

    move-object v6, v10

    invoke-static/range {v4 .. v9}, Lcom/tencent/liteav/videoconsumer/renderer/x;->a(Lcom/tencent/liteav/videoconsumer/renderer/u;Lcom/tencent/liteav/videoconsumer/renderer/RenderViewHelperInterface;Ljava/nio/ByteBuffer;IILcom/tencent/liteav/videobase/base/a;)Ljava/lang/Runnable;

    move-result-object p0

    invoke-virtual {v11, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 60
    :goto_0
    invoke-direct {v4}, Lcom/tencent/liteav/videoconsumer/renderer/u;->c()Z

    move-result p0

    if-eqz p0, :cond_e

    invoke-static {}, Lcom/tencent/liteav/videobase/utils/OpenGlUtils;->getGLErrorCount()I

    move-result p0

    if-gtz p0, :cond_e

    .line 61
    sget p0, Lcom/tencent/liteav/videoconsumer/renderer/t$a;->a:I

    .line 62
    iget-boolean p0, v4, Lcom/tencent/liteav/videoconsumer/renderer/u;->D:Z

    if-eqz p0, :cond_f

    .line 63
    iget-object p0, v4, Lcom/tencent/liteav/videoconsumer/renderer/u;->g:Lcom/tencent/liteav/videobase/videobase/c;

    sget-object v1, Lcom/tencent/liteav/videobase/videobase/e$b;->i:Lcom/tencent/liteav/videobase/videobase/e$b;

    invoke-interface {p0, v1, v0, v3}, Lcom/tencent/liteav/videobase/videobase/c;->notifyEvent(Lcom/tencent/liteav/videobase/videobase/e$b;Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    iput-boolean v2, v4, Lcom/tencent/liteav/videoconsumer/renderer/u;->D:Z

    goto :goto_1

    .line 65
    :cond_e
    sget p0, Lcom/tencent/liteav/videoconsumer/renderer/t$a;->a:I

    .line 66
    iget-object p0, v4, Lcom/tencent/liteav/videoconsumer/renderer/u;->j:Lcom/tencent/liteav/base/b/b;

    const-string/jumbo v1, "renderFailed"

    invoke-virtual {p0, v1}, Lcom/tencent/liteav/base/b/b;->a(Ljava/lang/String;)Lcom/tencent/liteav/base/b/a;

    move-result-object p0

    iget-object v1, v4, Lcom/tencent/liteav/videoconsumer/renderer/u;->a:Ljava/lang/String;

    const-string/jumbo v3, "render frame failed."

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p0, v1, v3, v2}, Lcom/tencent/liteav/base/util/LiteavLog;->e(Lcom/tencent/liteav/base/b/a;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 67
    :cond_f
    :goto_1
    invoke-virtual {v0}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->release()V

    return-void
.end method

.method private c()Z
    .locals 6

    .line 68
    :try_start_0
    iget-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->o:Lcom/tencent/liteav/videobase/egl/EGLCore;

    invoke-virtual {v0}, Lcom/tencent/liteav/videobase/egl/EGLCore;->swapBuffers()V
    :try_end_0
    .catch Lcom/tencent/liteav/videobase/egl/d; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    return v0

    :catch_0
    move-exception v0

    .line 69
    iget-object v1, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->j:Lcom/tencent/liteav/base/b/b;

    const-string/jumbo v2, "swapBuffers"

    invoke-virtual {v1, v2}, Lcom/tencent/liteav/base/b/b;->a(Ljava/lang/String;)Lcom/tencent/liteav/base/b/a;

    move-result-object v1

    iget-object v2, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->a:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "EGLCore swapBuffers failed."

    invoke-virtual {v4, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    new-array v5, v4, [Ljava/lang/Object;

    invoke-static {v1, v2, v3, v5}, Lcom/tencent/liteav/base/util/LiteavLog;->e(Lcom/tencent/liteav/base/b/a;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 70
    iget-object v1, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->g:Lcom/tencent/liteav/videobase/videobase/c;

    sget-object v2, Lcom/tencent/liteav/videobase/videobase/e$c;->g:Lcom/tencent/liteav/videobase/videobase/e$c;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v3, "VideoRender: swapBuffer error:"

    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v2, v0}, Lcom/tencent/liteav/videobase/videobase/c;->notifyWarning(Lcom/tencent/liteav/videobase/videobase/e$c;Ljava/lang/String;)V

    return v4
.end method


# virtual methods
.method public final a(Lcom/tencent/liteav/base/util/l;)V
    .locals 0

    .line 40
    invoke-static {p0, p1}, Lcom/tencent/liteav/videoconsumer/renderer/af;->a(Lcom/tencent/liteav/videoconsumer/renderer/u;Lcom/tencent/liteav/base/util/l;)Ljava/lang/Runnable;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/tencent/liteav/videoconsumer/renderer/u;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final a(Lcom/tencent/liteav/videobase/base/GLConstants$GLScaleType;)V
    .locals 0

    .line 36
    invoke-static {p0, p1}, Lcom/tencent/liteav/videoconsumer/renderer/ae;->a(Lcom/tencent/liteav/videoconsumer/renderer/u;Lcom/tencent/liteav/videobase/base/GLConstants$GLScaleType;)Ljava/lang/Runnable;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/tencent/liteav/videoconsumer/renderer/u;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final a(Lcom/tencent/liteav/videobase/videobase/DisplayTarget;Z)V
    .locals 0

    .line 34
    invoke-static {p0, p1, p2}, Lcom/tencent/liteav/videoconsumer/renderer/ad;->a(Lcom/tencent/liteav/videoconsumer/renderer/u;Lcom/tencent/liteav/videobase/videobase/DisplayTarget;Z)Ljava/lang/Runnable;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/tencent/liteav/videoconsumer/renderer/u;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final a(Ljava/lang/Runnable;)V
    .locals 2

    .line 44
    iget-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->h:Lcom/tencent/liteav/base/util/m;

    if-eqz v0, :cond_0

    .line 45
    invoke-virtual {v0, p1}, Lcom/tencent/liteav/base/util/m;->a(Ljava/lang/Runnable;)V

    return-void

    .line 46
    :cond_0
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    iget-object v1, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->f:Lcom/tencent/liteav/base/util/CustomHandler;

    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_1

    .line 47
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    return-void

    .line 48
    :cond_1
    iget-object v0, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->f:Lcom/tencent/liteav/base/util/CustomHandler;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final onRequestRedraw(Landroid/graphics/Bitmap;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/tencent/liteav/videoconsumer/renderer/u;->a(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Lcom/tencent/liteav/videoconsumer/renderer/z;->a(Lcom/tencent/liteav/videoconsumer/renderer/u;)Ljava/lang/Runnable;

    .line 7
    move-result-object p1

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1}, Lcom/tencent/liteav/videoconsumer/renderer/u;->a(Ljava/lang/Runnable;)V

    .line 11
    return-void
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

.method public final onSurfaceChanged(Landroid/view/Surface;Z)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2}, Lcom/tencent/liteav/videoconsumer/renderer/y;->a(Lcom/tencent/liteav/videoconsumer/renderer/u;Landroid/view/Surface;Z)Ljava/lang/Runnable;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lcom/tencent/liteav/videoconsumer/renderer/u;->a(Ljava/lang/Runnable;)V

    .line 8
    return-void
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
.end method

.method public final onSurfaceDestroy()V
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/tencent/liteav/videoconsumer/renderer/aa;->a(Lcom/tencent/liteav/videoconsumer/renderer/u;)Ljava/lang/Runnable;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iget-object v1, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->h:Lcom/tencent/liteav/base/util/m;

    .line 7
    .line 8
    const-wide/16 v2, 0x7d0

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1, v0, v2, v3}, Lcom/tencent/liteav/base/util/m;->a(Ljava/lang/Runnable;J)V

    .line 14
    return-void

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    iget-object v4, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->f:Lcom/tencent/liteav/base/util/CustomHandler;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v4}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 24
    move-result-object v4

    .line 25
    .line 26
    if-ne v1, v4, :cond_1

    .line 27
    .line 28
    .line 29
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 30
    return-void

    .line 31
    .line 32
    :cond_1
    iget-object v1, p0, Lcom/tencent/liteav/videoconsumer/renderer/u;->f:Lcom/tencent/liteav/base/util/CustomHandler;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, v0, v2, v3}, Lcom/tencent/liteav/base/util/CustomHandler;->runAndWaitDone(Ljava/lang/Runnable;J)Z

    .line 36
    return-void
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
