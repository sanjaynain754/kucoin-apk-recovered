.class public Lcom/github/penfeizhou/animation/gif/decode/b;
.super Lcom/github/penfeizhou/animation/gif/decode/a;
.source "GraphicControlExtension.java"


# instance fields
.field public a:I

.field public b:B

.field public c:I

.field public d:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/github/penfeizhou/animation/gif/decode/a;-><init>()V

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


# virtual methods
.method public a(Lcom/github/penfeizhou/animation/gif/io/GifReader;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/github/penfeizhou/animation/io/c;->peek()B

    .line 4
    move-result v0

    .line 5
    .line 6
    and-int/lit16 v0, v0, 0xff

    .line 7
    .line 8
    iput v0, p0, Lcom/github/penfeizhou/animation/gif/decode/b;->a:I

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/github/penfeizhou/animation/io/c;->peek()B

    .line 12
    move-result v0

    .line 13
    .line 14
    iput-byte v0, p0, Lcom/github/penfeizhou/animation/gif/decode/b;->b:B

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Lcom/github/penfeizhou/animation/gif/io/GifReader;->readUInt16()I

    .line 18
    move-result v0

    .line 19
    .line 20
    iput v0, p0, Lcom/github/penfeizhou/animation/gif/decode/b;->c:I

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Lcom/github/penfeizhou/animation/io/c;->peek()B

    .line 24
    move-result v0

    .line 25
    .line 26
    and-int/lit16 v0, v0, 0xff

    .line 27
    .line 28
    iput v0, p0, Lcom/github/penfeizhou/animation/gif/decode/b;->d:I

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1}, Lcom/github/penfeizhou/animation/io/c;->peek()B

    .line 32
    move-result p1

    .line 33
    .line 34
    if-nez p1, :cond_0

    .line 35
    return-void

    .line 36
    .line 37
    :cond_0
    new-instance p1, Lcom/github/penfeizhou/animation/gif/decode/GifParser$FormatException;

    .line 38
    .line 39
    .line 40
    invoke-direct {p1}, Lcom/github/penfeizhou/animation/gif/decode/GifParser$FormatException;-><init>()V

    .line 41
    throw p1
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
    .line 76
    .line 77
    .line 78
.end method

.method public c()I
    .locals 1

    .line 1
    .line 2
    iget-byte v0, p0, Lcom/github/penfeizhou/animation/gif/decode/b;->b:B

    .line 3
    .line 4
    shr-int/lit8 v0, v0, 0x2

    .line 5
    .line 6
    and-int/lit8 v0, v0, 0x7

    .line 7
    return v0
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

.method public d()Z
    .locals 2

    .line 1
    .line 2
    iget-byte v0, p0, Lcom/github/penfeizhou/animation/gif/decode/b;->b:B

    .line 3
    const/4 v1, 0x1

    .line 4
    and-int/2addr v0, v1

    .line 5
    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    return v1

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    return v0
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
