.class public Lcom/facebook/imagepipeline/producers/t0$a$b;
.super Ljava/lang/Object;
.source "PostprocessorProducer.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/imagepipeline/producers/t0$a;->I()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lcom/facebook/imagepipeline/producers/t0$a;


# direct methods
.method public constructor <init>(Lcom/facebook/imagepipeline/producers/t0$a;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/t0$a$b;->b:Lcom/facebook/imagepipeline/producers/t0$a;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/t0$a$b;->b:Lcom/facebook/imagepipeline/producers/t0$a;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    :try_start_0
    iget-object v1, p0, Lcom/facebook/imagepipeline/producers/t0$a$b;->b:Lcom/facebook/imagepipeline/producers/t0$a;

    .line 6
    .line 7
    .line 8
    invoke-static {v1}, Lcom/facebook/imagepipeline/producers/t0$a;->p(Lcom/facebook/imagepipeline/producers/t0$a;)La4/a;

    .line 9
    move-result-object v1

    .line 10
    .line 11
    iget-object v2, p0, Lcom/facebook/imagepipeline/producers/t0$a$b;->b:Lcom/facebook/imagepipeline/producers/t0$a;

    .line 12
    .line 13
    .line 14
    invoke-static {v2}, Lcom/facebook/imagepipeline/producers/t0$a;->q(Lcom/facebook/imagepipeline/producers/t0$a;)I

    .line 15
    move-result v2

    .line 16
    .line 17
    iget-object v3, p0, Lcom/facebook/imagepipeline/producers/t0$a$b;->b:Lcom/facebook/imagepipeline/producers/t0$a;

    .line 18
    const/4 v4, 0x0

    .line 19
    .line 20
    .line 21
    invoke-static {v3, v4}, Lcom/facebook/imagepipeline/producers/t0$a;->s(Lcom/facebook/imagepipeline/producers/t0$a;La4/a;)V

    .line 22
    .line 23
    iget-object v3, p0, Lcom/facebook/imagepipeline/producers/t0$a$b;->b:Lcom/facebook/imagepipeline/producers/t0$a;

    .line 24
    const/4 v4, 0x0

    .line 25
    .line 26
    .line 27
    invoke-static {v3, v4}, Lcom/facebook/imagepipeline/producers/t0$a;->r(Lcom/facebook/imagepipeline/producers/t0$a;Z)V

    .line 28
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 29
    .line 30
    .line 31
    invoke-static {v1}, La4/a;->o(La4/a;)Z

    .line 32
    move-result v0

    .line 33
    .line 34
    if-eqz v0, :cond_0

    .line 35
    .line 36
    :try_start_1
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/t0$a$b;->b:Lcom/facebook/imagepipeline/producers/t0$a;

    .line 37
    .line 38
    .line 39
    invoke-static {v0, v1, v2}, Lcom/facebook/imagepipeline/producers/t0$a;->u(Lcom/facebook/imagepipeline/producers/t0$a;La4/a;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 40
    .line 41
    .line 42
    invoke-static {v1}, La4/a;->j(La4/a;)V

    .line 43
    goto :goto_0

    .line 44
    :catchall_0
    move-exception v0

    .line 45
    .line 46
    .line 47
    invoke-static {v1}, La4/a;->j(La4/a;)V

    .line 48
    throw v0

    .line 49
    .line 50
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/t0$a$b;->b:Lcom/facebook/imagepipeline/producers/t0$a;

    .line 51
    .line 52
    .line 53
    invoke-static {v0}, Lcom/facebook/imagepipeline/producers/t0$a;->t(Lcom/facebook/imagepipeline/producers/t0$a;)V

    .line 54
    return-void

    .line 55
    :catchall_1
    move-exception v1

    .line 56
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 57
    throw v1
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
