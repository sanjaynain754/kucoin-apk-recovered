.class public Lo4/a$a;
.super Lf4/a;
.source "AbstractDraweeController.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo4/a;->h0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lf4/a<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Z

.field public final synthetic c:Lo4/a;


# direct methods
.method public constructor <init>(Lo4/a;Ljava/lang/String;Z)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lo4/a$a;->c:Lo4/a;

    .line 3
    .line 4
    iput-object p2, p0, Lo4/a$a;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-boolean p3, p0, Lo4/a$a;->b:Z

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Lf4/a;-><init>()V

    .line 10
    return-void
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
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
.end method


# virtual methods
.method public onFailureImpl(Lf4/b;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf4/b<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lo4/a$a;->c:Lo4/a;

    .line 3
    .line 4
    iget-object v1, p0, Lo4/a$a;->a:Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    invoke-interface {p1}, Lf4/b;->c()Ljava/lang/Throwable;

    .line 8
    move-result-object v2

    .line 9
    const/4 v3, 0x1

    .line 10
    .line 11
    .line 12
    invoke-static {v0, v1, p1, v2, v3}, Lo4/a;->g(Lo4/a;Ljava/lang/String;Lf4/b;Ljava/lang/Throwable;Z)V

    .line 13
    return-void
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

.method public onNewResultImpl(Lf4/b;)V
    .locals 8
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
    invoke-interface {p1}, Lf4/b;->isFinished()Z

    .line 4
    move-result v5

    .line 5
    .line 6
    .line 7
    invoke-interface {p1}, Lf4/b;->d()Z

    .line 8
    move-result v7

    .line 9
    .line 10
    .line 11
    invoke-interface {p1}, Lf4/b;->getProgress()F

    .line 12
    move-result v4

    .line 13
    .line 14
    .line 15
    invoke-interface {p1}, Lf4/b;->getResult()Ljava/lang/Object;

    .line 16
    move-result-object v3

    .line 17
    .line 18
    if-eqz v3, :cond_0

    .line 19
    .line 20
    iget-object v0, p0, Lo4/a$a;->c:Lo4/a;

    .line 21
    .line 22
    iget-object v1, p0, Lo4/a$a;->a:Ljava/lang/String;

    .line 23
    .line 24
    iget-boolean v6, p0, Lo4/a$a;->b:Z

    .line 25
    move-object v2, p1

    .line 26
    .line 27
    .line 28
    invoke-static/range {v0 .. v7}, Lo4/a;->h(Lo4/a;Ljava/lang/String;Lf4/b;Ljava/lang/Object;FZZZ)V

    .line 29
    return-void

    .line 30
    :cond_0
    move-object v2, p1

    .line 31
    .line 32
    if-eqz v5, :cond_1

    .line 33
    .line 34
    iget-object p1, p0, Lo4/a$a;->c:Lo4/a;

    .line 35
    .line 36
    iget-object v0, p0, Lo4/a$a;->a:Ljava/lang/String;

    .line 37
    .line 38
    new-instance v1, Ljava/lang/NullPointerException;

    .line 39
    .line 40
    .line 41
    invoke-direct {v1}, Ljava/lang/NullPointerException;-><init>()V

    .line 42
    const/4 v3, 0x1

    .line 43
    .line 44
    .line 45
    invoke-static {p1, v0, v2, v1, v3}, Lo4/a;->g(Lo4/a;Ljava/lang/String;Lf4/b;Ljava/lang/Throwable;Z)V

    .line 46
    :cond_1
    return-void
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
    .locals 4
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
    invoke-interface {p1}, Lf4/b;->isFinished()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    .line 7
    invoke-interface {p1}, Lf4/b;->getProgress()F

    .line 8
    move-result v1

    .line 9
    .line 10
    iget-object v2, p0, Lo4/a$a;->c:Lo4/a;

    .line 11
    .line 12
    iget-object v3, p0, Lo4/a$a;->a:Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    invoke-static {v2, v3, p1, v1, v0}, Lo4/a;->i(Lo4/a;Ljava/lang/String;Lf4/b;FZ)V

    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method
