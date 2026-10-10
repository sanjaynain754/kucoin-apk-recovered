.class public abstract Ly7/a;
.super Landroid/graphics/drawable/Drawable;
.source "FrameAnimationDrawable.java"

# interfaces
.implements Landroidx/vectordrawable/graphics/drawable/Animatable2Compat;
.implements Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder$j;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Decoder:",
        "Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder<",
        "**>;>",
        "Landroid/graphics/drawable/Drawable;",
        "Landroidx/vectordrawable/graphics/drawable/Animatable2Compat;",
        "Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder$j;"
    }
.end annotation


# static fields
.field public static final m:Ljava/lang/String; = "a"


# instance fields
.field public final b:Landroid/graphics/Paint;

.field public final c:Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TDecoder;"
        }
    .end annotation
.end field

.field public final d:Landroid/graphics/DrawFilter;

.field public final e:Landroid/graphics/Matrix;

.field public final f:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Landroidx/vectordrawable/graphics/drawable/Animatable2Compat$AnimationCallback;",
            ">;"
        }
    .end annotation
.end field

.field public g:Landroid/graphics/Bitmap;

.field public final h:Landroid/os/Handler;

.field public final i:Ljava/lang/Runnable;

.field public j:Z

.field public final k:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/ref/WeakReference<",
            "Landroid/graphics/drawable/Drawable$Callback;",
            ">;>;"
        }
    .end annotation
.end field

.field public l:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public constructor <init>(Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TDecoder;)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    .line 4
    .line 5
    new-instance v0, Landroid/graphics/Paint;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Ly7/a;->b:Landroid/graphics/Paint;

    .line 11
    .line 12
    new-instance v1, Landroid/graphics/PaintFlagsDrawFilter;

    .line 13
    const/4 v2, 0x3

    .line 14
    const/4 v3, 0x0

    .line 15
    .line 16
    .line 17
    invoke-direct {v1, v3, v2}, Landroid/graphics/PaintFlagsDrawFilter;-><init>(II)V

    .line 18
    .line 19
    iput-object v1, p0, Ly7/a;->d:Landroid/graphics/DrawFilter;

    .line 20
    .line 21
    new-instance v1, Landroid/graphics/Matrix;

    .line 22
    .line 23
    .line 24
    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    .line 25
    .line 26
    iput-object v1, p0, Ly7/a;->e:Landroid/graphics/Matrix;

    .line 27
    .line 28
    new-instance v1, Ljava/util/HashSet;

    .line 29
    .line 30
    .line 31
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 32
    .line 33
    iput-object v1, p0, Ly7/a;->f:Ljava/util/Set;

    .line 34
    .line 35
    new-instance v1, Ly7/a$a;

    .line 36
    .line 37
    .line 38
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 39
    move-result-object v2

    .line 40
    .line 41
    .line 42
    invoke-direct {v1, p0, v2}, Ly7/a$a;-><init>(Ly7/a;Landroid/os/Looper;)V

    .line 43
    .line 44
    iput-object v1, p0, Ly7/a;->h:Landroid/os/Handler;

    .line 45
    .line 46
    new-instance v1, Ly7/a$b;

    .line 47
    .line 48
    .line 49
    invoke-direct {v1, p0}, Ly7/a$b;-><init>(Ly7/a;)V

    .line 50
    .line 51
    iput-object v1, p0, Ly7/a;->i:Ljava/lang/Runnable;

    .line 52
    const/4 v1, 0x1

    .line 53
    .line 54
    iput-boolean v1, p0, Ly7/a;->j:Z

    .line 55
    .line 56
    new-instance v2, Ljava/util/HashSet;

    .line 57
    .line 58
    .line 59
    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 60
    .line 61
    iput-object v2, p0, Ly7/a;->k:Ljava/util/Set;

    .line 62
    .line 63
    iput-boolean v3, p0, Ly7/a;->l:Z

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 67
    .line 68
    iput-object p1, p0, Ly7/a;->c:Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;

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
.end method

.method public static synthetic c(Ly7/a;)Ljava/util/Set;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Ly7/a;->f:Ljava/util/Set;

    .line 3
    return-object p0
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
.end method


# virtual methods
.method public a(Ljava/nio/ByteBuffer;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Ly7/a;->isRunning()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    :cond_0
    iget-object v0, p0, Ly7/a;->g:Landroid/graphics/Bitmap;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 15
    move-result v0

    .line 16
    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    :cond_1
    iget-object v0, p0, Ly7/a;->c:Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->s()Landroid/graphics/Rect;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 27
    move-result v0

    .line 28
    .line 29
    iget-object v1, p0, Ly7/a;->c:Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->B()I

    .line 33
    move-result v1

    .line 34
    div-int/2addr v0, v1

    .line 35
    .line 36
    iget-object v1, p0, Ly7/a;->c:Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1}, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->s()Landroid/graphics/Rect;

    .line 40
    move-result-object v1

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    .line 44
    move-result v1

    .line 45
    .line 46
    iget-object v2, p0, Ly7/a;->c:Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v2}, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->B()I

    .line 50
    move-result v2

    .line 51
    div-int/2addr v1, v2

    .line 52
    .line 53
    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 54
    .line 55
    .line 56
    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 57
    move-result-object v0

    .line 58
    .line 59
    iput-object v0, p0, Ly7/a;->g:Landroid/graphics/Bitmap;

    .line 60
    .line 61
    .line 62
    :cond_2
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    .line 66
    move-result v0

    .line 67
    .line 68
    iget-object v1, p0, Ly7/a;->g:Landroid/graphics/Bitmap;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getByteCount()I

    .line 72
    move-result v1

    .line 73
    .line 74
    if-ge v0, v1, :cond_3

    .line 75
    .line 76
    sget-object p1, Ly7/a;->m:Ljava/lang/String;

    .line 77
    .line 78
    const-string v0, "onRender:Buffer not large enough for pixels"

    .line 79
    .line 80
    .line 81
    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 82
    return-void

    .line 83
    .line 84
    :cond_3
    iget-object v0, p0, Ly7/a;->g:Landroid/graphics/Bitmap;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0, p1}, Landroid/graphics/Bitmap;->copyPixelsFromBuffer(Ljava/nio/Buffer;)V

    .line 88
    .line 89
    iget-object p1, p0, Ly7/a;->h:Landroid/os/Handler;

    .line 90
    .line 91
    iget-object v0, p0, Ly7/a;->i:Ljava/lang/Runnable;

    .line 92
    .line 93
    .line 94
    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 95
    return-void
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
.end method

.method public b()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Ly7/a;->h:Landroid/os/Handler;

    .line 3
    const/4 v1, 0x2

    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

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
.end method

.method public clearAnimationCallbacks()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Ly7/a;->f:Ljava/util/Set;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/Set;->clear()V

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
.end method

.method public d()I
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Ly7/a;->c:Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->y()I

    .line 6
    move-result v0

    .line 7
    .line 8
    iget-object v1, p0, Ly7/a;->g:Landroid/graphics/Bitmap;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 14
    move-result v1

    .line 15
    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    iget-object v1, p0, Ly7/a;->g:Landroid/graphics/Bitmap;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getAllocationByteCount()I

    .line 22
    move-result v1

    .line 23
    add-int/2addr v0, v1

    .line 24
    :cond_0
    const/4 v1, 0x1

    .line 25
    .line 26
    .line 27
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    .line 28
    move-result v0

    .line 29
    return v0
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
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Ly7/a;->g:Landroid/graphics/Bitmap;

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 8
    move-result v0

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    goto :goto_0

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Ly7/a;->d:Landroid/graphics/DrawFilter;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->setDrawFilter(Landroid/graphics/DrawFilter;)V

    .line 17
    .line 18
    iget-object v0, p0, Ly7/a;->g:Landroid/graphics/Bitmap;

    .line 19
    .line 20
    iget-object v1, p0, Ly7/a;->e:Landroid/graphics/Matrix;

    .line 21
    .line 22
    iget-object v2, p0, Ly7/a;->b:Landroid/graphics/Paint;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, v0, v1, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    .line 26
    :cond_1
    :goto_0
    return-void
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
.end method

.method public final e()V
    .locals 6

    .line 1
    .line 2
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Ly7/a;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    .line 9
    move-result-object v1

    .line 10
    .line 11
    new-instance v2, Ljava/util/HashSet;

    .line 12
    .line 13
    iget-object v3, p0, Ly7/a;->k:Ljava/util/Set;

    .line 14
    .line 15
    .line 16
    invoke-direct {v2, v3}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 17
    .line 18
    .line 19
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 20
    move-result-object v2

    .line 21
    const/4 v3, 0x0

    .line 22
    .line 23
    .line 24
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    move-result v4

    .line 26
    .line 27
    if-eqz v4, :cond_2

    .line 28
    .line 29
    .line 30
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    move-result-object v4

    .line 32
    .line 33
    check-cast v4, Ljava/lang/ref/WeakReference;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v4}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 37
    move-result-object v5

    .line 38
    .line 39
    check-cast v5, Landroid/graphics/drawable/Drawable$Callback;

    .line 40
    .line 41
    if-nez v5, :cond_0

    .line 42
    .line 43
    .line 44
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 45
    goto :goto_0

    .line 46
    .line 47
    :cond_0
    if-ne v5, v1, :cond_1

    .line 48
    const/4 v3, 0x1

    .line 49
    goto :goto_0

    .line 50
    .line 51
    .line 52
    :cond_1
    invoke-interface {v5, p0}, Landroid/graphics/drawable/Drawable$Callback;->invalidateDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 53
    goto :goto_0

    .line 54
    .line 55
    .line 56
    :cond_2
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 57
    move-result-object v0

    .line 58
    .line 59
    .line 60
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 61
    move-result v2

    .line 62
    .line 63
    if-eqz v2, :cond_3

    .line 64
    .line 65
    .line 66
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 67
    move-result-object v2

    .line 68
    .line 69
    check-cast v2, Ljava/lang/ref/WeakReference;

    .line 70
    .line 71
    iget-object v4, p0, Ly7/a;->k:Ljava/util/Set;

    .line 72
    .line 73
    .line 74
    invoke-interface {v4, v2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 75
    goto :goto_1

    .line 76
    .line 77
    :cond_3
    if-nez v3, :cond_4

    .line 78
    .line 79
    iget-object v0, p0, Ly7/a;->k:Ljava/util/Set;

    .line 80
    .line 81
    new-instance v2, Ljava/lang/ref/WeakReference;

    .line 82
    .line 83
    .line 84
    invoke-direct {v2, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 88
    :cond_4
    return-void
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
.end method

.method public final f()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Ly7/a;->c:Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p0}, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->p(Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder$j;)V

    .line 6
    .line 7
    iget-boolean v0, p0, Ly7/a;->j:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Ly7/a;->c:Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->P()V

    .line 15
    return-void

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Ly7/a;->c:Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->G()Z

    .line 21
    move-result v0

    .line 22
    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    iget-object v0, p0, Ly7/a;->c:Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->P()V

    .line 29
    :cond_1
    return-void
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
.end method

.method public final g()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Ly7/a;->c:Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p0}, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->L(Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder$j;)V

    .line 6
    .line 7
    iget-boolean v0, p0, Ly7/a;->j:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Ly7/a;->c:Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->R()V

    .line 15
    return-void

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Ly7/a;->c:Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->S()V

    .line 21
    return-void
    .line 22
.end method

.method public getCallback()Landroid/graphics/drawable/Drawable$Callback;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public getIntrinsicHeight()I
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Ly7/a;->l:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    const/4 v0, -0x1

    .line 6
    return v0

    .line 7
    .line 8
    :cond_0
    :try_start_0
    iget-object v0, p0, Ly7/a;->c:Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->s()Landroid/graphics/Rect;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    .line 16
    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    return v0

    .line 18
    :catch_0
    const/4 v0, 0x0

    .line 19
    return v0
    .line 20
    .line 21
    .line 22
.end method

.method public getIntrinsicWidth()I
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Ly7/a;->l:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    const/4 v0, -0x1

    .line 6
    return v0

    .line 7
    .line 8
    :cond_0
    :try_start_0
    iget-object v0, p0, Ly7/a;->c:Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->s()Landroid/graphics/Rect;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 16
    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    return v0

    .line 18
    :catch_0
    const/4 v0, 0x0

    .line 19
    return v0
    .line 20
    .line 21
    .line 22
.end method

.method public getOpacity()I
    .locals 1

    .line 1
    const/4 v0, -0x3

    .line 2
    return v0
    .line 3
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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public h(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Ly7/a;->j:Z

    .line 3
    return-void
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
.end method

.method public i(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Ly7/a;->l:Z

    .line 3
    return-void
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
.end method

.method public invalidateSelf()V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 4
    .line 5
    new-instance v0, Ljava/util/HashSet;

    .line 6
    .line 7
    iget-object v1, p0, Ly7/a;->k:Ljava/util/Set;

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 11
    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    .line 17
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    move-result v1

    .line 19
    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    .line 23
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    move-result-object v1

    .line 25
    .line 26
    check-cast v1, Ljava/lang/ref/WeakReference;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    check-cast v1, Landroid/graphics/drawable/Drawable$Callback;

    .line 33
    .line 34
    if-eqz v1, :cond_0

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Ly7/a;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    .line 38
    move-result-object v2

    .line 39
    .line 40
    if-eq v1, v2, :cond_0

    .line 41
    .line 42
    .line 43
    invoke-interface {v1, p0}, Landroid/graphics/drawable/Drawable$Callback;->invalidateDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 44
    goto :goto_0

    .line 45
    :cond_1
    return-void
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
.end method

.method public isRunning()Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Ly7/a;->c:Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->G()Z

    .line 6
    move-result v0

    .line 7
    return v0
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
.end method

.method public onStart()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Ly7/a;->h:Landroid/os/Handler;

    .line 3
    const/4 v1, 0x1

    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

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
.end method

.method public registerAnimationCallback(Landroidx/vectordrawable/graphics/drawable/Animatable2Compat$AnimationCallback;)V
    .locals 1
    .param p1    # Landroidx/vectordrawable/graphics/drawable/Animatable2Compat$AnimationCallback;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    iget-object v0, p0, Ly7/a;->f:Ljava/util/Set;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

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
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
.end method

.method public setAlpha(I)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Ly7/a;->b:Landroid/graphics/Paint;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setAlpha(I)V

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
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
.end method

.method public setBounds(IIII)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1, p2, p3, p4}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 4
    .line 5
    iget-object p1, p0, Ly7/a;->c:Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->B()I

    .line 9
    move-result p1

    .line 10
    .line 11
    iget-object p2, p0, Ly7/a;->c:Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 15
    move-result-object p3

    .line 16
    .line 17
    .line 18
    invoke-virtual {p3}, Landroid/graphics/Rect;->width()I

    .line 19
    move-result p3

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 23
    move-result-object p4

    .line 24
    .line 25
    .line 26
    invoke-virtual {p4}, Landroid/graphics/Rect;->height()I

    .line 27
    move-result p4

    .line 28
    .line 29
    .line 30
    invoke-virtual {p2, p3, p4}, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->O(II)I

    .line 31
    move-result p2

    .line 32
    .line 33
    iget-object p3, p0, Ly7/a;->e:Landroid/graphics/Matrix;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 37
    move-result-object p4

    .line 38
    .line 39
    .line 40
    invoke-virtual {p4}, Landroid/graphics/Rect;->width()I

    .line 41
    move-result p4

    .line 42
    int-to-float p4, p4

    .line 43
    .line 44
    const/high16 v0, 0x3f800000    # 1.0f

    .line 45
    mul-float/2addr p4, v0

    .line 46
    int-to-float v1, p2

    .line 47
    mul-float/2addr p4, v1

    .line 48
    .line 49
    iget-object v2, p0, Ly7/a;->c:Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v2}, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->s()Landroid/graphics/Rect;

    .line 53
    move-result-object v2

    .line 54
    .line 55
    .line 56
    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    .line 57
    move-result v2

    .line 58
    int-to-float v2, v2

    .line 59
    div-float/2addr p4, v2

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 63
    move-result-object v2

    .line 64
    .line 65
    .line 66
    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    .line 67
    move-result v2

    .line 68
    int-to-float v2, v2

    .line 69
    mul-float/2addr v2, v0

    .line 70
    mul-float/2addr v2, v1

    .line 71
    .line 72
    iget-object v0, p0, Ly7/a;->c:Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0}, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->s()Landroid/graphics/Rect;

    .line 76
    move-result-object v0

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    .line 80
    move-result v0

    .line 81
    int-to-float v0, v0

    .line 82
    div-float/2addr v2, v0

    .line 83
    .line 84
    .line 85
    invoke-virtual {p3, p4, v2}, Landroid/graphics/Matrix;->setScale(FF)V

    .line 86
    .line 87
    if-eq p2, p1, :cond_0

    .line 88
    .line 89
    iget-object p1, p0, Ly7/a;->c:Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {p1}, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->s()Landroid/graphics/Rect;

    .line 93
    move-result-object p1

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    .line 97
    move-result p1

    .line 98
    div-int/2addr p1, p2

    .line 99
    .line 100
    iget-object p3, p0, Ly7/a;->c:Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {p3}, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->s()Landroid/graphics/Rect;

    .line 104
    move-result-object p3

    .line 105
    .line 106
    .line 107
    invoke-virtual {p3}, Landroid/graphics/Rect;->height()I

    .line 108
    move-result p3

    .line 109
    div-int/2addr p3, p2

    .line 110
    .line 111
    sget-object p2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 112
    .line 113
    .line 114
    invoke-static {p1, p3, p2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 115
    move-result-object p1

    .line 116
    .line 117
    iput-object p1, p0, Ly7/a;->g:Landroid/graphics/Bitmap;

    .line 118
    :cond_0
    return-void
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
.end method

.method public setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Ly7/a;->b:Landroid/graphics/Paint;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

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
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
.end method

.method public setVisible(ZZ)Z
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Ly7/a;->e()V

    .line 4
    .line 5
    iget-boolean v0, p0, Ly7/a;->j:Z

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Ly7/a;->isRunning()Z

    .line 13
    move-result v0

    .line 14
    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Ly7/a;->f()V

    .line 19
    goto :goto_0

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-virtual {p0}, Ly7/a;->isRunning()Z

    .line 23
    move-result v0

    .line 24
    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Ly7/a;->g()V

    .line 29
    .line 30
    .line 31
    :cond_1
    :goto_0
    invoke-super {p0, p1, p2}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    .line 32
    move-result p1

    .line 33
    return p1
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
.end method

.method public start()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Ly7/a;->c:Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->G()Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Ly7/a;->c:Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->R()V

    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Ly7/a;->c:Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->N()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Ly7/a;->f()V

    .line 22
    return-void
.end method

.method public stop()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Ly7/a;->g()V

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
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public unregisterAnimationCallback(Landroidx/vectordrawable/graphics/drawable/Animatable2Compat$AnimationCallback;)Z
    .locals 1
    .param p1    # Landroidx/vectordrawable/graphics/drawable/Animatable2Compat$AnimationCallback;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    iget-object v0, p0, Ly7/a;->f:Ljava/util/Set;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 6
    move-result p1

    .line 7
    return p1
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
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
.end method
