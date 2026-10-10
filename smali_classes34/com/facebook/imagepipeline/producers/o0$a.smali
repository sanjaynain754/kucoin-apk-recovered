.class public Lcom/facebook/imagepipeline/producers/o0$a;
.super Ljava/lang/Object;
.source "NetworkFetchProducer.java"

# interfaces
.implements Lcom/facebook/imagepipeline/producers/p0$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/imagepipeline/producers/o0;->a(Lcom/facebook/imagepipeline/producers/m;Lcom/facebook/imagepipeline/producers/w0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/facebook/imagepipeline/producers/a0;

.field public final synthetic b:Lcom/facebook/imagepipeline/producers/o0;


# direct methods
.method public constructor <init>(Lcom/facebook/imagepipeline/producers/o0;Lcom/facebook/imagepipeline/producers/a0;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/o0$a;->b:Lcom/facebook/imagepipeline/producers/o0;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/facebook/imagepipeline/producers/o0$a;->a:Lcom/facebook/imagepipeline/producers/a0;

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
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/o0$a;->b:Lcom/facebook/imagepipeline/producers/o0;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/facebook/imagepipeline/producers/o0$a;->a:Lcom/facebook/imagepipeline/producers/a0;

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v1}, Lcom/facebook/imagepipeline/producers/o0;->c(Lcom/facebook/imagepipeline/producers/o0;Lcom/facebook/imagepipeline/producers/a0;)V

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
.end method

.method public b(Ljava/io/InputStream;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {}, Ld6/b;->d()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const-string v0, "NetworkFetcher->onResponse"

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Ld6/b;->a(Ljava/lang/String;)V

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/o0$a;->b:Lcom/facebook/imagepipeline/producers/o0;

    .line 14
    .line 15
    iget-object v1, p0, Lcom/facebook/imagepipeline/producers/o0$a;->a:Lcom/facebook/imagepipeline/producers/a0;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1, p1, p2}, Lcom/facebook/imagepipeline/producers/o0;->m(Lcom/facebook/imagepipeline/producers/a0;Ljava/io/InputStream;I)V

    .line 19
    .line 20
    .line 21
    invoke-static {}, Ld6/b;->d()Z

    .line 22
    move-result p1

    .line 23
    .line 24
    if-eqz p1, :cond_1

    .line 25
    .line 26
    .line 27
    invoke-static {}, Ld6/b;->b()V

    .line 28
    :cond_1
    return-void
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

.method public onFailure(Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/o0$a;->b:Lcom/facebook/imagepipeline/producers/o0;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/facebook/imagepipeline/producers/o0$a;->a:Lcom/facebook/imagepipeline/producers/a0;

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v1, p1}, Lcom/facebook/imagepipeline/producers/o0;->d(Lcom/facebook/imagepipeline/producers/o0;Lcom/facebook/imagepipeline/producers/a0;Ljava/lang/Throwable;)V

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
.end method
