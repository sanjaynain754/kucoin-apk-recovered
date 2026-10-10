.class public Lcom/facebook/imagepipeline/memory/BasePool$a;
.super Ljava/lang/Object;
.source "BasePool.java"


# annotations
.annotation build Landroidx/annotation/VisibleForTesting;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/imagepipeline/memory/BasePool;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public a:I

.field public b:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method


# virtual methods
.method public a(I)V
    .locals 2

    .line 1
    .line 2
    iget v0, p0, Lcom/facebook/imagepipeline/memory/BasePool$a;->b:I

    .line 3
    .line 4
    if-lt v0, p1, :cond_0

    .line 5
    .line 6
    iget v1, p0, Lcom/facebook/imagepipeline/memory/BasePool$a;->a:I

    .line 7
    .line 8
    if-lez v1, :cond_0

    .line 9
    .line 10
    add-int/lit8 v1, v1, -0x1

    .line 11
    .line 12
    iput v1, p0, Lcom/facebook/imagepipeline/memory/BasePool$a;->a:I

    .line 13
    sub-int/2addr v0, p1

    .line 14
    .line 15
    iput v0, p0, Lcom/facebook/imagepipeline/memory/BasePool$a;->b:I

    .line 16
    return-void

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    move-result-object p1

    .line 21
    .line 22
    iget v0, p0, Lcom/facebook/imagepipeline/memory/BasePool$a;->b:I

    .line 23
    .line 24
    .line 25
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 26
    move-result-object v0

    .line 27
    .line 28
    iget v1, p0, Lcom/facebook/imagepipeline/memory/BasePool$a;->a:I

    .line 29
    .line 30
    .line 31
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 32
    move-result-object v1

    .line 33
    .line 34
    .line 35
    filled-new-array {p1, v0, v1}, [Ljava/lang/Object;

    .line 36
    move-result-object p1

    .line 37
    .line 38
    const-string v0, "com.facebook.imagepipeline.memory.BasePool.Counter"

    .line 39
    .line 40
    const-string v1, "Unexpected decrement of %d. Current numBytes = %d, count = %d"

    .line 41
    .line 42
    .line 43
    invoke-static {v0, v1, p1}, Lx3/a;->O(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 44
    return-void
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
.end method

.method public b(I)V
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/facebook/imagepipeline/memory/BasePool$a;->a:I

    .line 3
    .line 4
    add-int/lit8 v0, v0, 0x1

    .line 5
    .line 6
    iput v0, p0, Lcom/facebook/imagepipeline/memory/BasePool$a;->a:I

    .line 7
    .line 8
    iget v0, p0, Lcom/facebook/imagepipeline/memory/BasePool$a;->b:I

    .line 9
    add-int/2addr v0, p1

    .line 10
    .line 11
    iput v0, p0, Lcom/facebook/imagepipeline/memory/BasePool$a;->b:I

    .line 12
    return-void
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
