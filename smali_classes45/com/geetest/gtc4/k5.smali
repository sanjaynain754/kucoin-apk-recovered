.class public final Lcom/geetest/gtc4/k5;
.super Lcom/geetest/gtc4/l0;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lcom/geetest/gtc4/r7;Lcom/geetest/gtc4/r7;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/geetest/gtc4/l0;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/geetest/gtc4/o7;

    .line 6
    .line 7
    const-wide/16 v1, 0x26

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, v1, v2}, Lcom/geetest/gtc4/o7;-><init>(J)V

    .line 11
    .line 12
    iput-object v0, p0, Lcom/geetest/gtc4/f3;->b:Lcom/geetest/gtc4/o7;

    .line 13
    .line 14
    .line 15
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p1, Lcom/geetest/gtc4/f3;

    .line 18
    .line 19
    iget-object v0, p0, Lcom/geetest/gtc4/l0;->d:Ljava/util/ArrayList;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p2, Lcom/geetest/gtc4/f3;

    .line 28
    .line 29
    iget-object p1, p0, Lcom/geetest/gtc4/l0;->d:Ljava/util/ArrayList;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 33
    return-void
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
.end method
