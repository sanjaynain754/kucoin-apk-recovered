.class public final Lcom/geetest/gtc4/o;
.super Lcom/geetest/gtc4/w;
.source "SourceFile"


# instance fields
.field public final a:Lcom/geetest/gtc4/e2;


# direct methods
.method public constructor <init>(Lcom/geetest/gtc4/e2;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/geetest/gtc4/w;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/geetest/gtc4/o;->a:Lcom/geetest/gtc4/e2;

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
.method public final a(Z)I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/geetest/gtc4/o;->a:Lcom/geetest/gtc4/e2;

    invoke-virtual {v0, p1}, Lcom/geetest/gtc4/e2;->a(Z)I

    move-result p1

    return p1
.end method

.method public final a(Lcom/geetest/gtc4/u;Z)V
    .locals 2

    const/4 v0, 0x7

    .line 2
    invoke-virtual {p1, p2, v0}, Lcom/geetest/gtc4/u;->a(ZI)V

    .line 3
    iget-object p2, p0, Lcom/geetest/gtc4/o;->a:Lcom/geetest/gtc4/e2;

    .line 4
    iget-object p2, p2, Lcom/geetest/gtc4/e2;->a:[B

    const/4 v0, 0x0

    const/16 v1, 0x19

    .line 5
    invoke-virtual {p1, v0, v1, p2}, Lcom/geetest/gtc4/u;->a(ZI[B)V

    return-void
.end method

.method public final a(Lcom/geetest/gtc4/w;)Z
    .locals 1

    .line 6
    instance-of v0, p1, Lcom/geetest/gtc4/o;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 7
    :cond_0
    check-cast p1, Lcom/geetest/gtc4/o;

    .line 8
    iget-object v0, p0, Lcom/geetest/gtc4/o;->a:Lcom/geetest/gtc4/e2;

    iget-object p1, p1, Lcom/geetest/gtc4/o;->a:Lcom/geetest/gtc4/e2;

    invoke-virtual {v0, p1}, Lcom/geetest/gtc4/e2;->a(Lcom/geetest/gtc4/w;)Z

    move-result p1

    return p1
.end method

.method public final f()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
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
.end method

.method public final g()Lcom/geetest/gtc4/w;
    .locals 0

    .line 1
    return-object p0
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
.end method

.method public final h()Lcom/geetest/gtc4/w;
    .locals 0

    .line 1
    return-object p0
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
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/geetest/gtc4/o;->a:Lcom/geetest/gtc4/e2;

    .line 3
    .line 4
    iget-object v0, v0, Lcom/geetest/gtc4/e2;->a:[B

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, Lcom/geetest/gtc4/o0;->b([B)I

    .line 8
    move-result v0

    .line 9
    not-int v0, v0

    .line 10
    return v0
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method
