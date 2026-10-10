.class public Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder$c;
.super Ljava/lang/Object;
.source "FrameSeqDecoder.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->L(Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder$j;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder$j;

.field public final synthetic c:Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;


# direct methods
.method public constructor <init>(Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder$j;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder$c;->c:Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder$c;->b:Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder$j;

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
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder$c;->c:Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->j(Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;)Ljava/util/Set;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    iget-object v1, p0, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder$c;->b:Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder$j;

    .line 9
    .line 10
    .line 11
    invoke-interface {v0, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 12
    return-void
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method
