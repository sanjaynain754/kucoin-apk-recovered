.class public La6/u;
.super Ljava/lang/Object;
.source "FlexByteArrayPool.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La6/u$b;
    }
.end annotation


# instance fields
.field public final a:La4/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La4/h<",
            "[B>;"
        }
    .end annotation
.end field

.field public final b:La6/u$b;
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lz3/d;La6/h0;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iget v0, p2, La6/h0;->g:I

    .line 6
    .line 7
    if-lez v0, :cond_0

    .line 8
    const/4 v0, 0x1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    .line 12
    .line 13
    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Lw3/h;->b(Ljava/lang/Boolean;)V

    .line 18
    .line 19
    new-instance v0, La6/u$b;

    .line 20
    .line 21
    .line 22
    invoke-static {}, La6/b0;->h()La6/b0;

    .line 23
    move-result-object v1

    .line 24
    .line 25
    .line 26
    invoke-direct {v0, p1, p2, v1}, La6/u$b;-><init>(Lz3/d;La6/h0;Lcom/facebook/imagepipeline/memory/PoolStatsTracker;)V

    .line 27
    .line 28
    iput-object v0, p0, La6/u;->b:La6/u$b;

    .line 29
    .line 30
    new-instance p1, La6/u$a;

    .line 31
    .line 32
    .line 33
    invoke-direct {p1, p0}, La6/u$a;-><init>(La6/u;)V

    .line 34
    .line 35
    iput-object p1, p0, La6/u;->a:La4/h;

    .line 36
    return-void
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
.end method


# virtual methods
.method public a(I)La4/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "La4/a<",
            "[B>;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, La6/u;->b:La6/u$b;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/facebook/imagepipeline/memory/BasePool;->get(I)Ljava/lang/Object;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    check-cast p1, [B

    .line 9
    .line 10
    iget-object v0, p0, La6/u;->a:La4/h;

    .line 11
    .line 12
    .line 13
    invoke-static {p1, v0}, La4/a;->u(Ljava/lang/Object;La4/h;)La4/a;

    .line 14
    move-result-object p1

    .line 15
    return-object p1
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public b([B)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, La6/u;->b:La6/u$b;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/facebook/imagepipeline/memory/BasePool;->release(Ljava/lang/Object;)V

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
