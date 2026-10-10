.class public interface abstract Lcom/facebook/imagepipeline/cache/c;
.super Ljava/lang/Object;
.source "CountingMemoryCache.java"

# interfaces
.implements Lcom/facebook/imagepipeline/cache/f;
.implements Lz3/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/imagepipeline/cache/c$a;,
        Lcom/facebook/imagepipeline/cache/c$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/facebook/imagepipeline/cache/f<",
        "TK;TV;>;",
        "Lz3/c;"
    }
.end annotation


# virtual methods
.method public abstract b(Ljava/lang/Object;)La4/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)",
            "La4/a<",
            "TV;>;"
        }
    .end annotation
.end method

.method public abstract d(Ljava/lang/Object;La4/a;Lcom/facebook/imagepipeline/cache/c$b;)La4/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;",
            "La4/a<",
            "TV;>;",
            "Lcom/facebook/imagepipeline/cache/c$b<",
            "TK;>;)",
            "La4/a<",
            "TV;>;"
        }
    .end annotation
.end method
