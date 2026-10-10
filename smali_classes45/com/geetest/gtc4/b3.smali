.class public final Lcom/geetest/gtc4/b3;
.super Lcom/geetest/gtc4/b0;
.source "SourceFile"


# instance fields
.field public c:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/geetest/gtc4/b0;-><init>()V

    const/4 v0, -0x1

    .line 2
    iput v0, p0, Lcom/geetest/gtc4/b3;->c:I

    return-void
.end method

.method public constructor <init>(Lcom/geetest/gtc4/g;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, Lcom/geetest/gtc4/b0;-><init>(Lcom/geetest/gtc4/g;)V

    const/4 p1, -0x1

    .line 4
    iput p1, p0, Lcom/geetest/gtc4/b3;->c:I

    return-void
.end method

.method public constructor <init>([Lcom/geetest/gtc4/f;[Lcom/geetest/gtc4/f;)V
    .locals 0

    .line 5
    invoke-direct {p0, p1, p2}, Lcom/geetest/gtc4/b0;-><init>([Lcom/geetest/gtc4/f;[Lcom/geetest/gtc4/f;)V

    const/4 p1, -0x1

    .line 6
    iput p1, p0, Lcom/geetest/gtc4/b3;->c:I

    return-void
.end method


# virtual methods
.method public final a(Z)I
    .locals 5

    .line 1
    iget v0, p0, Lcom/geetest/gtc4/b3;->c:I

    if-gez v0, :cond_1

    .line 2
    iget-object v0, p0, Lcom/geetest/gtc4/b0;->a:[Lcom/geetest/gtc4/f;

    array-length v0, v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v1, v0, :cond_0

    .line 3
    iget-object v3, p0, Lcom/geetest/gtc4/b0;->a:[Lcom/geetest/gtc4/f;

    aget-object v3, v3, v1

    invoke-interface {v3}, Lcom/geetest/gtc4/f;->d()Lcom/geetest/gtc4/w;

    move-result-object v3

    invoke-virtual {v3}, Lcom/geetest/gtc4/w;->h()Lcom/geetest/gtc4/w;

    move-result-object v3

    const/4 v4, 0x1

    .line 4
    invoke-virtual {v3, v4}, Lcom/geetest/gtc4/w;->a(Z)I

    move-result v3

    add-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 5
    :cond_0
    iput v2, p0, Lcom/geetest/gtc4/b3;->c:I

    .line 6
    :cond_1
    iget v0, p0, Lcom/geetest/gtc4/b3;->c:I

    .line 7
    invoke-static {v0, p1, v0}, Lcom/geetest/gtc4/d;->a(III)I

    move-result p1

    return p1
.end method

.method public final a(Lcom/geetest/gtc4/u;Z)V
    .locals 7

    const/16 v0, 0x31

    .line 8
    invoke-virtual {p1, p2, v0}, Lcom/geetest/gtc4/u;->a(ZI)V

    .line 9
    invoke-virtual {p1}, Lcom/geetest/gtc4/u;->b()Lcom/geetest/gtc4/y2;

    move-result-object p2

    .line 10
    iget-object v0, p0, Lcom/geetest/gtc4/b0;->a:[Lcom/geetest/gtc4/f;

    array-length v1, v0

    .line 11
    iget v2, p0, Lcom/geetest/gtc4/b3;->c:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-gez v2, :cond_2

    const/16 v5, 0x10

    if-le v1, v5, :cond_0

    goto :goto_2

    .line 12
    :cond_0
    new-array v0, v1, [Lcom/geetest/gtc4/w;

    move v2, v4

    move v5, v2

    :goto_0
    if-ge v2, v1, :cond_1

    .line 13
    iget-object v6, p0, Lcom/geetest/gtc4/b0;->a:[Lcom/geetest/gtc4/f;

    aget-object v6, v6, v2

    invoke-interface {v6}, Lcom/geetest/gtc4/f;->d()Lcom/geetest/gtc4/w;

    move-result-object v6

    invoke-virtual {v6}, Lcom/geetest/gtc4/w;->h()Lcom/geetest/gtc4/w;

    move-result-object v6

    .line 14
    aput-object v6, v0, v2

    .line 15
    invoke-virtual {v6, v3}, Lcom/geetest/gtc4/w;->a(Z)I

    move-result v6

    add-int/2addr v5, v6

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 16
    :cond_1
    iput v5, p0, Lcom/geetest/gtc4/b3;->c:I

    .line 17
    invoke-virtual {p1, v5}, Lcom/geetest/gtc4/u;->b(I)V

    :goto_1
    if-ge v4, v1, :cond_5

    .line 18
    aget-object p1, v0, v4

    invoke-virtual {p2, p1}, Lcom/geetest/gtc4/y2;->a(Lcom/geetest/gtc4/w;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_2
    :goto_2
    if-gez v2, :cond_4

    .line 19
    array-length v0, v0

    move v2, v4

    move v5, v2

    :goto_3
    if-ge v2, v0, :cond_3

    .line 20
    iget-object v6, p0, Lcom/geetest/gtc4/b0;->a:[Lcom/geetest/gtc4/f;

    aget-object v6, v6, v2

    invoke-interface {v6}, Lcom/geetest/gtc4/f;->d()Lcom/geetest/gtc4/w;

    move-result-object v6

    invoke-virtual {v6}, Lcom/geetest/gtc4/w;->h()Lcom/geetest/gtc4/w;

    move-result-object v6

    .line 21
    invoke-virtual {v6, v3}, Lcom/geetest/gtc4/w;->a(Z)I

    move-result v6

    add-int/2addr v5, v6

    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    .line 22
    :cond_3
    iput v5, p0, Lcom/geetest/gtc4/b3;->c:I

    .line 23
    :cond_4
    iget v0, p0, Lcom/geetest/gtc4/b3;->c:I

    .line 24
    invoke-virtual {p1, v0}, Lcom/geetest/gtc4/u;->b(I)V

    :goto_4
    if-ge v4, v1, :cond_5

    .line 25
    iget-object p1, p0, Lcom/geetest/gtc4/b0;->a:[Lcom/geetest/gtc4/f;

    aget-object p1, p1, v4

    invoke-interface {p1}, Lcom/geetest/gtc4/f;->d()Lcom/geetest/gtc4/w;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/geetest/gtc4/y2;->a(Lcom/geetest/gtc4/w;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_4

    :cond_5
    return-void
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
