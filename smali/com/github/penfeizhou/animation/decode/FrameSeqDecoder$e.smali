.class public Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder$e;
.super Ljava/lang/Object;
.source "FrameSeqDecoder.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->s()Landroid/graphics/Rect;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Ljava/lang/Thread;

.field public final synthetic c:Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;


# direct methods
.method public constructor <init>(Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;Ljava/lang/Thread;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder$e;->c:Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder$e;->b:Ljava/lang/Thread;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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


# virtual methods
.method public run()V
    .locals 2

    .line 1
    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder$e;->c:Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;

    .line 3
    .line 4
    iget-object v0, v0, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->p:Landroid/graphics/Rect;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    iget-object v0, p0, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder$e;->c:Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->k(Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;)Lcom/github/penfeizhou/animation/io/Reader;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder$e;->c:Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;

    .line 17
    .line 18
    .line 19
    invoke-static {v0}, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->m(Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;)Lk8/b;

    .line 20
    move-result-object v1

    .line 21
    .line 22
    .line 23
    invoke-interface {v1}, Lk8/b;->a()Lcom/github/penfeizhou/animation/io/Reader;

    .line 24
    move-result-object v1

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1}, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->A(Lcom/github/penfeizhou/animation/io/Reader;)Lcom/github/penfeizhou/animation/io/Reader;

    .line 28
    move-result-object v1

    .line 29
    .line 30
    .line 31
    invoke-static {v0, v1}, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->l(Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;Lcom/github/penfeizhou/animation/io/Reader;)Lcom/github/penfeizhou/animation/io/Reader;

    .line 32
    goto :goto_0

    .line 33
    :catchall_0
    move-exception v0

    .line 34
    goto :goto_2

    .line 35
    :catch_0
    move-exception v0

    .line 36
    goto :goto_1

    .line 37
    :catch_1
    move-exception v0

    .line 38
    goto :goto_1

    .line 39
    .line 40
    :cond_0
    iget-object v0, p0, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder$e;->c:Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;

    .line 41
    .line 42
    .line 43
    invoke-static {v0}, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->k(Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;)Lcom/github/penfeizhou/animation/io/Reader;

    .line 44
    move-result-object v0

    .line 45
    .line 46
    .line 47
    invoke-interface {v0}, Lcom/github/penfeizhou/animation/io/Reader;->reset()V

    .line 48
    .line 49
    :goto_0
    iget-object v0, p0, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder$e;->c:Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;

    .line 50
    .line 51
    .line 52
    invoke-static {v0}, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->k(Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;)Lcom/github/penfeizhou/animation/io/Reader;

    .line 53
    move-result-object v1

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, v1}, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->I(Lcom/github/penfeizhou/animation/io/Reader;)Landroid/graphics/Rect;

    .line 57
    move-result-object v1

    .line 58
    .line 59
    .line 60
    invoke-static {v0, v1}, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->n(Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;Landroid/graphics/Rect;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 61
    .line 62
    :cond_1
    iget-object v0, p0, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder$e;->b:Ljava/lang/Thread;

    .line 63
    .line 64
    .line 65
    invoke-static {v0}, Ljava/util/concurrent/locks/LockSupport;->unpark(Ljava/lang/Thread;)V

    .line 66
    return-void

    .line 67
    .line 68
    .line 69
    :goto_1
    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 70
    .line 71
    iget-object v0, p0, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder$e;->c:Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;

    .line 72
    .line 73
    .line 74
    invoke-static {}, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->o()Landroid/graphics/Rect;

    .line 75
    move-result-object v1

    .line 76
    .line 77
    iput-object v1, v0, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->p:Landroid/graphics/Rect;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 78
    .line 79
    iget-object v0, p0, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder$e;->b:Ljava/lang/Thread;

    .line 80
    .line 81
    .line 82
    invoke-static {v0}, Ljava/util/concurrent/locks/LockSupport;->unpark(Ljava/lang/Thread;)V

    .line 83
    return-void

    .line 84
    .line 85
    :goto_2
    iget-object v1, p0, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder$e;->b:Ljava/lang/Thread;

    .line 86
    .line 87
    .line 88
    invoke-static {v1}, Ljava/util/concurrent/locks/LockSupport;->unpark(Ljava/lang/Thread;)V

    .line 89
    throw v0
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
.end method
