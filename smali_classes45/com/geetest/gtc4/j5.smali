.class public final Lcom/geetest/gtc4/j5;
.super Lcom/geetest/gtc4/o5;
.source "SourceFile"


# instance fields
.field public c:I

.field public d:I

.field public e:Z

.field public f:Z


# direct methods
.method public constructor <init>(Ljava/io/InputStream;I)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Lcom/geetest/gtc4/o5;-><init>(Ljava/io/InputStream;I)V

    .line 4
    const/4 p2, 0x0

    .line 5
    .line 6
    iput-boolean p2, p0, Lcom/geetest/gtc4/j5;->e:Z

    .line 7
    const/4 p2, 0x1

    .line 8
    .line 9
    iput-boolean p2, p0, Lcom/geetest/gtc4/j5;->f:Z

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/io/InputStream;->read()I

    .line 13
    move-result p2

    .line 14
    .line 15
    iput p2, p0, Lcom/geetest/gtc4/j5;->c:I

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/io/InputStream;->read()I

    .line 19
    move-result p1

    .line 20
    .line 21
    iput p1, p0, Lcom/geetest/gtc4/j5;->d:I

    .line 22
    .line 23
    if-ltz p1, :cond_0

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lcom/geetest/gtc4/j5;->b()Z

    .line 27
    return-void

    .line 28
    .line 29
    :cond_0
    new-instance p1, Ljava/io/EOFException;

    .line 30
    .line 31
    .line 32
    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    .line 33
    throw p1
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


# virtual methods
.method public final b()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/geetest/gtc4/j5;->e:Z

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    iget-boolean v0, p0, Lcom/geetest/gtc4/j5;->f:Z

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget v0, p0, Lcom/geetest/gtc4/j5;->c:I

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    iget v0, p0, Lcom/geetest/gtc4/j5;->d:I

    .line 15
    .line 16
    if-nez v0, :cond_0

    .line 17
    const/4 v0, 0x1

    .line 18
    .line 19
    iput-boolean v0, p0, Lcom/geetest/gtc4/j5;->e:Z

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Lcom/geetest/gtc4/o5;->a()V

    .line 23
    .line 24
    :cond_0
    iget-boolean v0, p0, Lcom/geetest/gtc4/j5;->e:Z

    .line 25
    return v0
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
.end method

.method public final read()I
    .locals 3

    .line 11
    invoke-virtual {p0}, Lcom/geetest/gtc4/j5;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    return v0

    .line 12
    :cond_0
    iget-object v0, p0, Lcom/geetest/gtc4/o5;->a:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v0

    if-ltz v0, :cond_1

    .line 13
    iget v1, p0, Lcom/geetest/gtc4/j5;->c:I

    .line 14
    iget v2, p0, Lcom/geetest/gtc4/j5;->d:I

    iput v2, p0, Lcom/geetest/gtc4/j5;->c:I

    .line 15
    iput v0, p0, Lcom/geetest/gtc4/j5;->d:I

    return v1

    .line 16
    :cond_1
    new-instance v0, Ljava/io/EOFException;

    invoke-direct {v0}, Ljava/io/EOFException;-><init>()V

    throw v0
.end method

.method public final read([BII)I
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/geetest/gtc4/j5;->f:Z

    if-nez v0, :cond_4

    const/4 v0, 0x3

    if-ge p3, v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-boolean v0, p0, Lcom/geetest/gtc4/j5;->e:Z

    if-eqz v0, :cond_1

    const/4 p1, -0x1

    return p1

    .line 3
    :cond_1
    iget-object v0, p0, Lcom/geetest/gtc4/o5;->a:Ljava/io/InputStream;

    add-int/lit8 v1, p2, 0x2

    add-int/lit8 p3, p3, -0x2

    invoke-virtual {v0, p1, v1, p3}, Ljava/io/InputStream;->read([BII)I

    move-result p3

    if-ltz p3, :cond_3

    .line 4
    iget v0, p0, Lcom/geetest/gtc4/j5;->c:I

    int-to-byte v0, v0

    aput-byte v0, p1, p2

    add-int/lit8 p2, p2, 0x1

    .line 5
    iget v0, p0, Lcom/geetest/gtc4/j5;->d:I

    int-to-byte v0, v0

    aput-byte v0, p1, p2

    .line 6
    iget-object p1, p0, Lcom/geetest/gtc4/o5;->a:Ljava/io/InputStream;

    invoke-virtual {p1}, Ljava/io/InputStream;->read()I

    move-result p1

    iput p1, p0, Lcom/geetest/gtc4/j5;->c:I

    .line 7
    iget-object p1, p0, Lcom/geetest/gtc4/o5;->a:Ljava/io/InputStream;

    invoke-virtual {p1}, Ljava/io/InputStream;->read()I

    move-result p1

    iput p1, p0, Lcom/geetest/gtc4/j5;->d:I

    if-ltz p1, :cond_2

    add-int/lit8 p3, p3, 0x2

    return p3

    .line 8
    :cond_2
    new-instance p1, Ljava/io/EOFException;

    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    throw p1

    .line 9
    :cond_3
    new-instance p1, Ljava/io/EOFException;

    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    throw p1

    .line 10
    :cond_4
    :goto_0
    invoke-super {p0, p1, p2, p3}, Ljava/io/InputStream;->read([BII)I

    move-result p1

    return p1
.end method
