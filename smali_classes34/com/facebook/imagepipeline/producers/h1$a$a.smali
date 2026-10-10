.class public Lcom/facebook/imagepipeline/producers/h1$a$a;
.super Ljava/lang/Object;
.source "ThrottlingProducer.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/imagepipeline/producers/h1$a;->p()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Landroid/util/Pair;

.field public final synthetic c:Lcom/facebook/imagepipeline/producers/h1$a;


# direct methods
.method public constructor <init>(Lcom/facebook/imagepipeline/producers/h1$a;Landroid/util/Pair;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/h1$a$a;->c:Lcom/facebook/imagepipeline/producers/h1$a;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/facebook/imagepipeline/producers/h1$a$a;->b:Landroid/util/Pair;

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
.method public run()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/h1$a$a;->c:Lcom/facebook/imagepipeline/producers/h1$a;

    .line 3
    .line 4
    iget-object v0, v0, Lcom/facebook/imagepipeline/producers/h1$a;->c:Lcom/facebook/imagepipeline/producers/h1;

    .line 5
    .line 6
    iget-object v1, p0, Lcom/facebook/imagepipeline/producers/h1$a$a;->b:Landroid/util/Pair;

    .line 7
    .line 8
    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v2, Lcom/facebook/imagepipeline/producers/m;

    .line 11
    .line 12
    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Lcom/facebook/imagepipeline/producers/w0;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v2, v1}, Lcom/facebook/imagepipeline/producers/h1;->g(Lcom/facebook/imagepipeline/producers/m;Lcom/facebook/imagepipeline/producers/w0;)V

    .line 18
    return-void
.end method
