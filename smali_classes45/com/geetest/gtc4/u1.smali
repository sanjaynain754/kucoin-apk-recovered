.class public final Lcom/geetest/gtc4/u1;
.super Ljava/io/InputStream;
.source "SourceFile"


# instance fields
.field public final a:Lcom/geetest/gtc4/c0;

.field public b:Z

.field public c:Ljava/io/InputStream;


# direct methods
.method public constructor <init>(Lcom/geetest/gtc4/c0;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    .line 4
    const/4 v0, 0x1

    .line 5
    .line 6
    iput-boolean v0, p0, Lcom/geetest/gtc4/u1;->b:Z

    .line 7
    .line 8
    iput-object p1, p0, Lcom/geetest/gtc4/u1;->a:Lcom/geetest/gtc4/c0;

    .line 9
    return-void
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
.method public final a()Lcom/geetest/gtc4/t;
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/geetest/gtc4/u1;->a:Lcom/geetest/gtc4/c0;

    .line 3
    .line 4
    iget-object v1, v0, Lcom/geetest/gtc4/c0;->a:Lcom/geetest/gtc4/o5;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/io/InputStream;->read()I

    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    .line 11
    if-gez v1, :cond_0

    .line 12
    move-object v0, v2

    .line 13
    goto :goto_0

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-virtual {v0, v1}, Lcom/geetest/gtc4/c0;->a(I)Lcom/geetest/gtc4/f;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    :goto_0
    if-nez v0, :cond_1

    .line 20
    return-object v2

    .line 21
    .line 22
    :cond_1
    instance-of v1, v0, Lcom/geetest/gtc4/t;

    .line 23
    .line 24
    if-eqz v1, :cond_2

    .line 25
    .line 26
    check-cast v0, Lcom/geetest/gtc4/t;

    .line 27
    return-object v0

    .line 28
    .line 29
    :cond_2
    new-instance v1, Ljava/io/IOException;

    .line 30
    .line 31
    new-instance v2, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string/jumbo v3, "unknown object encountered: "

    .line 35
    .line 36
    .line 37
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    move-result-object v0

    .line 42
    .line 43
    .line 44
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    move-result-object v0

    .line 49
    .line 50
    .line 51
    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 52
    throw v1
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

.method public final read()I
    .locals 3

    .line 10
    iget-object v0, p0, Lcom/geetest/gtc4/u1;->c:Ljava/io/InputStream;

    const/4 v1, -0x1

    if-nez v0, :cond_2

    .line 11
    iget-boolean v0, p0, Lcom/geetest/gtc4/u1;->b:Z

    if-nez v0, :cond_0

    return v1

    .line 12
    :cond_0
    invoke-virtual {p0}, Lcom/geetest/gtc4/u1;->a()Lcom/geetest/gtc4/t;

    move-result-object v0

    if-nez v0, :cond_1

    return v1

    :cond_1
    const/4 v2, 0x0

    .line 13
    iput-boolean v2, p0, Lcom/geetest/gtc4/u1;->b:Z

    .line 14
    invoke-interface {v0}, Lcom/geetest/gtc4/t;->c()Ljava/io/InputStream;

    move-result-object v0

    iput-object v0, p0, Lcom/geetest/gtc4/u1;->c:Ljava/io/InputStream;

    .line 15
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/geetest/gtc4/u1;->c:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v0

    if-ltz v0, :cond_3

    return v0

    .line 16
    :cond_3
    invoke-virtual {p0}, Lcom/geetest/gtc4/u1;->a()Lcom/geetest/gtc4/t;

    move-result-object v0

    if-nez v0, :cond_4

    const/4 v0, 0x0

    .line 17
    iput-object v0, p0, Lcom/geetest/gtc4/u1;->c:Ljava/io/InputStream;

    return v1

    .line 18
    :cond_4
    invoke-interface {v0}, Lcom/geetest/gtc4/t;->c()Ljava/io/InputStream;

    move-result-object v0

    iput-object v0, p0, Lcom/geetest/gtc4/u1;->c:Ljava/io/InputStream;

    goto :goto_0
.end method

.method public final read([BII)I
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/geetest/gtc4/u1;->c:Ljava/io/InputStream;

    const/4 v1, 0x0

    const/4 v2, -0x1

    if-nez v0, :cond_2

    .line 2
    iget-boolean v0, p0, Lcom/geetest/gtc4/u1;->b:Z

    if-nez v0, :cond_0

    return v2

    .line 3
    :cond_0
    invoke-virtual {p0}, Lcom/geetest/gtc4/u1;->a()Lcom/geetest/gtc4/t;

    move-result-object v0

    if-nez v0, :cond_1

    return v2

    .line 4
    :cond_1
    iput-boolean v1, p0, Lcom/geetest/gtc4/u1;->b:Z

    .line 5
    invoke-interface {v0}, Lcom/geetest/gtc4/t;->c()Ljava/io/InputStream;

    move-result-object v0

    iput-object v0, p0, Lcom/geetest/gtc4/u1;->c:Ljava/io/InputStream;

    .line 6
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/geetest/gtc4/u1;->c:Ljava/io/InputStream;

    add-int v3, p2, v1

    sub-int v4, p3, v1

    invoke-virtual {v0, p1, v3, v4}, Ljava/io/InputStream;->read([BII)I

    move-result v0

    if-ltz v0, :cond_3

    add-int/2addr v1, v0

    if-ne v1, p3, :cond_2

    return v1

    .line 7
    :cond_3
    invoke-virtual {p0}, Lcom/geetest/gtc4/u1;->a()Lcom/geetest/gtc4/t;

    move-result-object v0

    if-nez v0, :cond_5

    const/4 p1, 0x0

    .line 8
    iput-object p1, p0, Lcom/geetest/gtc4/u1;->c:Ljava/io/InputStream;

    const/4 p1, 0x1

    if-ge v1, p1, :cond_4

    return v2

    :cond_4
    return v1

    .line 9
    :cond_5
    invoke-interface {v0}, Lcom/geetest/gtc4/t;->c()Ljava/io/InputStream;

    move-result-object v0

    iput-object v0, p0, Lcom/geetest/gtc4/u1;->c:Ljava/io/InputStream;

    goto :goto_0
.end method
