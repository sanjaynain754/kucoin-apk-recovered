.class public final Lcom/facebook/imagepipeline/producers/DecodeProducer$c$a;
.super Lcom/facebook/imagepipeline/producers/f;
.source "DecodeProducer.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/imagepipeline/producers/DecodeProducer$c;-><init>(Lcom/facebook/imagepipeline/producers/DecodeProducer;Lcom/facebook/imagepipeline/producers/m;Lcom/facebook/imagepipeline/producers/w0;ZI)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "com/facebook/imagepipeline/producers/DecodeProducer$c$a",
        "Lcom/facebook/imagepipeline/producers/f;",
        "",
        "a",
        "()V",
        "b",
        "imagepipeline_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic a:Lcom/facebook/imagepipeline/producers/DecodeProducer$c;

.field public final synthetic b:Z


# direct methods
.method public constructor <init>(Lcom/facebook/imagepipeline/producers/DecodeProducer$c;Z)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/DecodeProducer$c$a;->a:Lcom/facebook/imagepipeline/producers/DecodeProducer$c;

    .line 3
    .line 4
    iput-boolean p2, p0, Lcom/facebook/imagepipeline/producers/DecodeProducer$c$a;->b:Z

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Lcom/facebook/imagepipeline/producers/f;-><init>()V

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
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/DecodeProducer$c$a;->a:Lcom/facebook/imagepipeline/producers/DecodeProducer$c;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/facebook/imagepipeline/producers/DecodeProducer$c;->s(Lcom/facebook/imagepipeline/producers/DecodeProducer$c;)Lcom/facebook/imagepipeline/producers/w0;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-interface {v0}, Lcom/facebook/imagepipeline/producers/w0;->m()Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/DecodeProducer$c$a;->a:Lcom/facebook/imagepipeline/producers/DecodeProducer$c;

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Lcom/facebook/imagepipeline/producers/DecodeProducer$c;->r(Lcom/facebook/imagepipeline/producers/DecodeProducer$c;)Lcom/facebook/imagepipeline/producers/JobScheduler;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Lcom/facebook/imagepipeline/producers/JobScheduler;->h()Z

    .line 22
    :cond_0
    return-void
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
.end method

.method public b()V
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/facebook/imagepipeline/producers/DecodeProducer$c$a;->b:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/DecodeProducer$c$a;->a:Lcom/facebook/imagepipeline/producers/DecodeProducer$c;

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Lcom/facebook/imagepipeline/producers/DecodeProducer$c;->t(Lcom/facebook/imagepipeline/producers/DecodeProducer$c;)V

    .line 10
    :cond_0
    return-void
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method
