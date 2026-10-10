.class public final Lcom/facebook/imagepipeline/producers/ThreadHandoffProducer$a;
.super Lcom/facebook/imagepipeline/producers/f;
.source "ThreadHandoffProducer.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/imagepipeline/producers/ThreadHandoffProducer;->a(Lcom/facebook/imagepipeline/producers/m;Lcom/facebook/imagepipeline/producers/w0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "com/facebook/imagepipeline/producers/ThreadHandoffProducer$a",
        "Lcom/facebook/imagepipeline/producers/f;",
        "",
        "b",
        "()V",
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
.field public final synthetic a:Lcom/facebook/imagepipeline/producers/d1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/imagepipeline/producers/d1<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final synthetic b:Lcom/facebook/imagepipeline/producers/ThreadHandoffProducer;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/imagepipeline/producers/ThreadHandoffProducer<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/facebook/imagepipeline/producers/d1;Lcom/facebook/imagepipeline/producers/ThreadHandoffProducer;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/imagepipeline/producers/d1<",
            "TT;>;",
            "Lcom/facebook/imagepipeline/producers/ThreadHandoffProducer<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/ThreadHandoffProducer$a;->a:Lcom/facebook/imagepipeline/producers/d1;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/facebook/imagepipeline/producers/ThreadHandoffProducer$a;->b:Lcom/facebook/imagepipeline/producers/ThreadHandoffProducer;

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
.method public b()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/ThreadHandoffProducer$a;->a:Lcom/facebook/imagepipeline/producers/d1;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lu3/h;->a()V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/ThreadHandoffProducer$a;->b:Lcom/facebook/imagepipeline/producers/ThreadHandoffProducer;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/facebook/imagepipeline/producers/ThreadHandoffProducer;->d()Lcom/facebook/imagepipeline/producers/f1;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    iget-object v1, p0, Lcom/facebook/imagepipeline/producers/ThreadHandoffProducer$a;->a:Lcom/facebook/imagepipeline/producers/d1;

    .line 14
    .line 15
    .line 16
    invoke-interface {v0, v1}, Lcom/facebook/imagepipeline/producers/f1;->a(Ljava/lang/Runnable;)V

    .line 17
    return-void
    .line 18
.end method
