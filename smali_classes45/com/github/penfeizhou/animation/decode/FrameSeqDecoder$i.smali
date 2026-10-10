.class public Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder$i;
.super Ljava/lang/Object;
.source "FrameSeqDecoder.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->O(II)I
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Z

.field public final synthetic d:Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;


# direct methods
.method public constructor <init>(Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;IZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder$i;->d:Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;

    .line 3
    .line 4
    iput p2, p0, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder$i;->b:I

    .line 5
    .line 6
    iput-boolean p3, p0, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder$i;->c:Z

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    return-void
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
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder$i;->d:Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->d(Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;)V

    .line 6
    .line 7
    :try_start_0
    iget-object v0, p0, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder$i;->d:Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;

    .line 8
    .line 9
    iget v1, p0, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder$i;->b:I

    .line 10
    .line 11
    iput v1, v0, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->k:I

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->m(Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;)Lk8/b;

    .line 15
    move-result-object v1

    .line 16
    .line 17
    .line 18
    invoke-interface {v1}, Lk8/b;->a()Lcom/github/penfeizhou/animation/io/Reader;

    .line 19
    move-result-object v1

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->A(Lcom/github/penfeizhou/animation/io/Reader;)Lcom/github/penfeizhou/animation/io/Reader;

    .line 23
    move-result-object v1

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v1}, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->I(Lcom/github/penfeizhou/animation/io/Reader;)Landroid/graphics/Rect;

    .line 27
    move-result-object v1

    .line 28
    .line 29
    .line 30
    invoke-static {v0, v1}, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->n(Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;Landroid/graphics/Rect;)V

    .line 31
    .line 32
    iget-boolean v0, p0, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder$i;->c:Z

    .line 33
    .line 34
    if-eqz v0, :cond_0

    .line 35
    .line 36
    iget-object v0, p0, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder$i;->d:Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;

    .line 37
    .line 38
    .line 39
    invoke-static {v0}, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->c(Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    return-void

    .line 41
    :catch_0
    move-exception v0

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 45
    :cond_0
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
.end method
