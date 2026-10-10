.class public abstract Lcom/geetest/gtc4/f0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/Class;


# direct methods
.method public constructor <init>(Ljava/lang/Class;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/geetest/gtc4/f0;->a:Ljava/lang/Class;

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
.method public final a(Lcom/geetest/gtc4/d0;)Lcom/geetest/gtc4/w;
    .locals 4

    .line 2
    iget v0, p1, Lcom/geetest/gtc4/d0;->b:I

    const/16 v1, 0x80

    if-ne v0, v1, :cond_6

    .line 3
    iget v0, p1, Lcom/geetest/gtc4/d0;->a:I

    const/4 v1, 0x1

    if-eq v1, v0, :cond_5

    .line 4
    iget-object v0, p1, Lcom/geetest/gtc4/d0;->d:Lcom/geetest/gtc4/f;

    invoke-interface {v0}, Lcom/geetest/gtc4/f;->d()Lcom/geetest/gtc4/w;

    move-result-object v0

    .line 5
    iget v1, p1, Lcom/geetest/gtc4/d0;->a:I

    const/4 v2, 0x3

    const-string/jumbo v3, "unexpected object: "

    if-eq v1, v2, :cond_3

    const/4 p1, 0x4

    if-eq v1, p1, :cond_1

    .line 6
    iget-object p1, p0, Lcom/geetest/gtc4/f0;->a:Ljava/lang/Class;

    invoke-virtual {p1, v0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    .line 7
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 9
    :cond_1
    instance-of p1, v0, Lcom/geetest/gtc4/z;

    if-eqz p1, :cond_2

    .line 10
    check-cast v0, Lcom/geetest/gtc4/z;

    invoke-virtual {p0, v0}, Lcom/geetest/gtc4/f0;->a(Lcom/geetest/gtc4/z;)Lcom/geetest/gtc4/w;

    move-result-object v0

    goto :goto_0

    .line 11
    :cond_2
    check-cast v0, Lcom/geetest/gtc4/i2;

    invoke-virtual {p0, v0}, Lcom/geetest/gtc4/f0;->a(Lcom/geetest/gtc4/i2;)Lcom/geetest/gtc4/w;

    move-result-object v0

    goto :goto_0

    .line 12
    :cond_3
    invoke-virtual {p1, v0}, Lcom/geetest/gtc4/d0;->c(Lcom/geetest/gtc4/w;)Lcom/geetest/gtc4/z;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/geetest/gtc4/f0;->a(Lcom/geetest/gtc4/z;)Lcom/geetest/gtc4/w;

    move-result-object v0

    .line 13
    :goto_0
    iget-object p1, p0, Lcom/geetest/gtc4/f0;->a:Ljava/lang/Class;

    invoke-virtual {p1, v0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    return-object v0

    .line 14
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 16
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "object explicit - implicit expected."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    const/16 p1, 0x40

    if-eq v0, p1, :cond_9

    if-eq v0, v1, :cond_8

    const/16 p1, 0xc0

    if-eq v0, p1, :cond_7

    .line 17
    const-string p1, "UNIVERSAL"

    goto :goto_1

    .line 18
    :cond_7
    const-string p1, "PRIVATE"

    goto :goto_1

    .line 19
    :cond_8
    const-string p1, "CONTEXT"

    goto :goto_1

    .line 20
    :cond_9
    const-string p1, "APPLICATION"

    .line 21
    :goto_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Expected CONTEXT tag but found "

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public abstract a(Lcom/geetest/gtc4/i2;)Lcom/geetest/gtc4/w;
.end method

.method public a(Lcom/geetest/gtc4/z;)Lcom/geetest/gtc4/w;
    .locals 1

    .line 1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo v0, "unexpected implicit constructed encoding"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    const/4 p1, 0x1

    .line 4
    return p1

    .line 5
    :cond_0
    const/4 p1, 0x0

    .line 6
    return p1
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
