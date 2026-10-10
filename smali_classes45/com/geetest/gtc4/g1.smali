.class public final Lcom/geetest/gtc4/g1;
.super Lcom/geetest/gtc4/z;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/geetest/gtc4/z;-><init>()V

    return-void
.end method

.method public constructor <init>(Lcom/geetest/gtc4/g;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, Lcom/geetest/gtc4/z;-><init>(Lcom/geetest/gtc4/g;)V

    return-void
.end method

.method public constructor <init>(Lcom/geetest/gtc4/w;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/geetest/gtc4/z;-><init>(Lcom/geetest/gtc4/w;)V

    return-void
.end method


# virtual methods
.method public final a(Z)I
    .locals 4

    if-eqz p1, :cond_0

    const/4 p1, 0x4

    goto :goto_0

    :cond_0
    const/4 p1, 0x3

    .line 1
    :goto_0
    iget-object v0, p0, Lcom/geetest/gtc4/z;->a:[Lcom/geetest/gtc4/f;

    array-length v0, v0

    const/4 v1, 0x0

    :goto_1
    if-ge v1, v0, :cond_1

    .line 2
    iget-object v2, p0, Lcom/geetest/gtc4/z;->a:[Lcom/geetest/gtc4/f;

    aget-object v2, v2, v1

    invoke-interface {v2}, Lcom/geetest/gtc4/f;->d()Lcom/geetest/gtc4/w;

    move-result-object v2

    const/4 v3, 0x1

    .line 3
    invoke-virtual {v2, v3}, Lcom/geetest/gtc4/w;->a(Z)I

    move-result v2

    add-int/2addr p1, v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_1
    return p1
.end method

.method public final a(Lcom/geetest/gtc4/u;Z)V
    .locals 2

    .line 4
    iget-object v0, p0, Lcom/geetest/gtc4/z;->a:[Lcom/geetest/gtc4/f;

    const/16 v1, 0x30

    invoke-virtual {p1, p2, v1, v0}, Lcom/geetest/gtc4/u;->a(ZI[Lcom/geetest/gtc4/f;)V

    return-void
.end method

.method public final l()Lcom/geetest/gtc4/b;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/geetest/gtc4/b1;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/geetest/gtc4/z;->i()[Lcom/geetest/gtc4/b;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v1}, Lcom/geetest/gtc4/b1;-><init>([Lcom/geetest/gtc4/b;)V

    .line 10
    return-object v0
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public final m()Lcom/geetest/gtc4/s;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/geetest/gtc4/e1;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/geetest/gtc4/z;->j()[Lcom/geetest/gtc4/s;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v1}, Lcom/geetest/gtc4/e1;-><init>([Lcom/geetest/gtc4/s;)V

    .line 10
    return-object v0
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method
