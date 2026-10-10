.class public Lcom/geetest/gtc4/y2;
.super Lcom/geetest/gtc4/u;
.source "SourceFile"


# direct methods
.method public constructor <init>(Ljava/io/ByteArrayOutputStream;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/geetest/gtc4/u;-><init>(Ljava/io/ByteArrayOutputStream;)V

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
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method


# virtual methods
.method public a(Lcom/geetest/gtc4/w;)V
    .locals 1

    .line 3
    invoke-virtual {p1}, Lcom/geetest/gtc4/w;->h()Lcom/geetest/gtc4/w;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, p0, v0}, Lcom/geetest/gtc4/w;->a(Lcom/geetest/gtc4/u;Z)V

    return-void
.end method

.method public a([Lcom/geetest/gtc4/f;)V
    .locals 4

    .line 1
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 2
    aget-object v2, p1, v1

    invoke-interface {v2}, Lcom/geetest/gtc4/f;->d()Lcom/geetest/gtc4/w;

    move-result-object v2

    invoke-virtual {v2}, Lcom/geetest/gtc4/w;->h()Lcom/geetest/gtc4/w;

    move-result-object v2

    const/4 v3, 0x1

    invoke-virtual {v2, p0, v3}, Lcom/geetest/gtc4/w;->a(Lcom/geetest/gtc4/u;Z)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public a([Lcom/geetest/gtc4/w;)V
    .locals 4

    .line 4
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 5
    aget-object v2, p1, v1

    invoke-virtual {v2}, Lcom/geetest/gtc4/w;->h()Lcom/geetest/gtc4/w;

    move-result-object v2

    const/4 v3, 0x1

    invoke-virtual {v2, p0, v3}, Lcom/geetest/gtc4/w;->a(Lcom/geetest/gtc4/u;Z)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final b()Lcom/geetest/gtc4/y2;
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
