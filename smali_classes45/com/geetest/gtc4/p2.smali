.class public final Lcom/geetest/gtc4/p2;
.super Lcom/geetest/gtc4/d0;
.source "SourceFile"


# direct methods
.method public constructor <init>(IIILcom/geetest/gtc4/f;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/geetest/gtc4/d0;-><init>(IIILcom/geetest/gtc4/f;)V

    return-void
.end method

.method public constructor <init>(ZILcom/geetest/gtc4/f;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/geetest/gtc4/d0;-><init>(ZILcom/geetest/gtc4/f;)V

    return-void
.end method


# virtual methods
.method public final a(Z)I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/geetest/gtc4/d0;->d:Lcom/geetest/gtc4/f;

    invoke-interface {v0}, Lcom/geetest/gtc4/f;->d()Lcom/geetest/gtc4/w;

    move-result-object v0

    invoke-virtual {v0}, Lcom/geetest/gtc4/w;->g()Lcom/geetest/gtc4/w;

    move-result-object v0

    .line 2
    invoke-virtual {p0}, Lcom/geetest/gtc4/d0;->i()Z

    move-result v1

    .line 3
    invoke-virtual {v0, v1}, Lcom/geetest/gtc4/w;->a(Z)I

    move-result v0

    if-eqz v1, :cond_0

    .line 4
    invoke-static {v0}, Lcom/geetest/gtc4/u;->a(I)I

    move-result v1

    add-int/2addr v0, v1

    :cond_0
    if-eqz p1, :cond_3

    .line 5
    iget p1, p0, Lcom/geetest/gtc4/d0;->c:I

    const/16 v1, 0x1f

    if-ge p1, v1, :cond_1

    const/4 p1, 0x1

    goto :goto_1

    :cond_1
    const/4 v1, 0x2

    :goto_0
    ushr-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    move p1, v1

    goto :goto_1

    :cond_3
    const/4 p1, 0x0

    :goto_1
    add-int/2addr v0, p1

    return v0
.end method

.method public final a(Lcom/geetest/gtc4/u;Z)V
    .locals 3

    .line 6
    iget-object v0, p0, Lcom/geetest/gtc4/d0;->d:Lcom/geetest/gtc4/f;

    invoke-interface {v0}, Lcom/geetest/gtc4/f;->d()Lcom/geetest/gtc4/w;

    move-result-object v0

    invoke-virtual {v0}, Lcom/geetest/gtc4/w;->g()Lcom/geetest/gtc4/w;

    move-result-object v0

    .line 7
    invoke-virtual {p0}, Lcom/geetest/gtc4/d0;->i()Z

    move-result v1

    if-eqz p2, :cond_2

    .line 8
    iget p2, p0, Lcom/geetest/gtc4/d0;->b:I

    if-nez v1, :cond_0

    .line 9
    invoke-virtual {v0}, Lcom/geetest/gtc4/w;->f()Z

    move-result v2

    if-eqz v2, :cond_1

    :cond_0
    or-int/lit8 p2, p2, 0x20

    .line 10
    :cond_1
    iget v2, p0, Lcom/geetest/gtc4/d0;->c:I

    invoke-virtual {p1, p2, v2}, Lcom/geetest/gtc4/u;->a(II)V

    :cond_2
    if-eqz v1, :cond_3

    const/4 p2, 0x1

    .line 11
    invoke-virtual {v0, p2}, Lcom/geetest/gtc4/w;->a(Z)I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/geetest/gtc4/u;->b(I)V

    .line 12
    :cond_3
    invoke-virtual {p1}, Lcom/geetest/gtc4/u;->a()Lcom/geetest/gtc4/k2;

    move-result-object p1

    invoke-virtual {v0, p1, v1}, Lcom/geetest/gtc4/w;->a(Lcom/geetest/gtc4/u;Z)V

    return-void
.end method

.method public final c(Lcom/geetest/gtc4/w;)Lcom/geetest/gtc4/z;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/geetest/gtc4/m2;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p1}, Lcom/geetest/gtc4/m2;-><init>(Lcom/geetest/gtc4/w;)V

    .line 6
    return-object v0
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

.method public final f()Z
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/geetest/gtc4/d0;->i()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    iget-object v0, p0, Lcom/geetest/gtc4/d0;->d:Lcom/geetest/gtc4/f;

    .line 9
    .line 10
    .line 11
    invoke-interface {v0}, Lcom/geetest/gtc4/f;->d()Lcom/geetest/gtc4/w;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/geetest/gtc4/w;->g()Lcom/geetest/gtc4/w;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/geetest/gtc4/w;->f()Z

    .line 20
    move-result v0

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 v0, 0x0

    .line 25
    return v0

    .line 26
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 27
    return v0
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
