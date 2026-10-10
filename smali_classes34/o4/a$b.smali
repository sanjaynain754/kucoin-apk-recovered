.class public Lo4/a$b;
.super Lo4/e;
.source "AbstractDraweeController.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo4/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<INFO:",
        "Ljava/lang/Object;",
        ">",
        "Lo4/e<",
        "TINFO;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lo4/e;-><init>()V

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

.method public static d(Lo4/c;Lo4/c;)Lo4/a$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<INFO:",
            "Ljava/lang/Object;",
            ">(",
            "Lo4/c<",
            "-TINFO;>;",
            "Lo4/c<",
            "-TINFO;>;)",
            "Lo4/a$b<",
            "TINFO;>;"
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
    const-string v0, "AbstractDraweeController#createInternal"

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Ld6/b;->a(Ljava/lang/String;)V

    .line 12
    .line 13
    :cond_0
    new-instance v0, Lo4/a$b;

    .line 14
    .line 15
    .line 16
    invoke-direct {v0}, Lo4/a$b;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p0}, Lo4/e;->a(Lo4/c;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, p1}, Lo4/e;->a(Lo4/c;)V

    .line 23
    .line 24
    .line 25
    invoke-static {}, Ld6/b;->d()Z

    .line 26
    move-result p0

    .line 27
    .line 28
    if-eqz p0, :cond_1

    .line 29
    .line 30
    .line 31
    invoke-static {}, Ld6/b;->b()V

    .line 32
    :cond_1
    return-object v0
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
