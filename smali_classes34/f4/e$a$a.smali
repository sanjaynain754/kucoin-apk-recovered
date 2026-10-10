.class public Lf4/e$a$a;
.super Ljava/lang/Object;
.source "FirstAvailableDataSourceSupplier.java"

# interfaces
.implements Lf4/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf4/e$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lf4/d<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lf4/e$a;


# direct methods
.method public constructor <init>(Lf4/e$a;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lf4/e$a$a;->a:Lf4/e$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lf4/e$a;Lf4/f;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lf4/e$a$a;-><init>(Lf4/e$a;)V

    return-void
.end method


# virtual methods
.method public onCancellation(Lf4/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf4/b<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    return-void
    .line 2
    .line 3
    .line 4
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
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public onFailure(Lf4/b;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf4/b<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lf4/e$a$a;->a:Lf4/e$a;

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p1}, Lf4/e$a;->u(Lf4/e$a;Lf4/b;)V

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

.method public onNewResult(Lf4/b;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf4/b<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-interface {p1}, Lf4/b;->a()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Lf4/e$a$a;->a:Lf4/e$a;

    .line 9
    .line 10
    .line 11
    invoke-static {v0, p1}, Lf4/e$a;->v(Lf4/e$a;Lf4/b;)V

    .line 12
    return-void

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-interface {p1}, Lf4/b;->isFinished()Z

    .line 16
    move-result v0

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    iget-object v0, p0, Lf4/e$a$a;->a:Lf4/e$a;

    .line 21
    .line 22
    .line 23
    invoke-static {v0, p1}, Lf4/e$a;->u(Lf4/e$a;Lf4/b;)V

    .line 24
    :cond_1
    return-void
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
.end method

.method public onProgressUpdate(Lf4/b;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf4/b<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lf4/e$a$a;->a:Lf4/e$a;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/facebook/datasource/AbstractDataSource;->getProgress()F

    .line 6
    move-result v0

    .line 7
    .line 8
    iget-object v1, p0, Lf4/e$a$a;->a:Lf4/e$a;

    .line 9
    .line 10
    .line 11
    invoke-interface {p1}, Lf4/b;->getProgress()F

    .line 12
    move-result p1

    .line 13
    .line 14
    .line 15
    invoke-static {v0, p1}, Ljava/lang/Math;->max(FF)F

    .line 16
    move-result p1

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, p1}, Lcom/facebook/datasource/AbstractDataSource;->p(F)Z

    .line 20
    return-void
    .line 21
    .line 22
    .line 23
.end method
