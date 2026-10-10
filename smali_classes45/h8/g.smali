.class public Lh8/g;
.super Ljava/lang/Object;
.source "ImageDescriptor.java"

# interfaces
.implements Lh8/b;


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public d:I

.field public e:B

.field public f:Lh8/c;

.field public g:I

.field public h:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/github/penfeizhou/animation/gif/io/GifReader;->readUInt16()I

    .line 4
    move-result v0

    .line 5
    .line 6
    iput v0, p0, Lh8/g;->a:I

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Lcom/github/penfeizhou/animation/gif/io/GifReader;->readUInt16()I

    .line 10
    move-result v0

    .line 11
    .line 12
    iput v0, p0, Lh8/g;->b:I

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Lcom/github/penfeizhou/animation/gif/io/GifReader;->readUInt16()I

    .line 16
    move-result v0

    .line 17
    .line 18
    iput v0, p0, Lh8/g;->c:I

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Lcom/github/penfeizhou/animation/gif/io/GifReader;->readUInt16()I

    .line 22
    move-result v0

    .line 23
    .line 24
    iput v0, p0, Lh8/g;->d:I

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Lcom/github/penfeizhou/animation/io/c;->peek()B

    .line 28
    move-result v0

    .line 29
    .line 30
    iput-byte v0, p0, Lh8/g;->e:B

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Lh8/g;->c()Z

    .line 34
    move-result v0

    .line 35
    .line 36
    if-eqz v0, :cond_0

    .line 37
    .line 38
    new-instance v0, Lh8/c;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, Lh8/g;->d()I

    .line 42
    move-result v1

    .line 43
    .line 44
    .line 45
    invoke-direct {v0, v1}, Lh8/c;-><init>(I)V

    .line 46
    .line 47
    iput-object v0, p0, Lh8/g;->f:Lh8/c;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, p1}, Lh8/c;->a(Lcom/github/penfeizhou/animation/gif/io/GifReader;)V

    .line 51
    .line 52
    .line 53
    :cond_0
    invoke-virtual {p1}, Lcom/github/penfeizhou/animation/io/c;->peek()B

    .line 54
    move-result v0

    .line 55
    .line 56
    and-int/lit16 v0, v0, 0xff

    .line 57
    .line 58
    iput v0, p0, Lh8/g;->g:I

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1}, Lcom/github/penfeizhou/animation/io/c;->position()I

    .line 62
    move-result v0

    .line 63
    .line 64
    iput v0, p0, Lh8/g;->h:I

    .line 65
    .line 66
    .line 67
    :goto_0
    invoke-virtual {p1}, Lcom/github/penfeizhou/animation/io/c;->peek()B

    .line 68
    move-result v0

    .line 69
    .line 70
    if-eqz v0, :cond_1

    .line 71
    .line 72
    and-int/lit16 v0, v0, 0xff

    .line 73
    int-to-long v0, v0

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1, v0, v1}, Lcom/github/penfeizhou/animation/io/c;->skip(J)J

    .line 77
    goto :goto_0

    .line 78
    :cond_1
    return-void
.end method

.method public b()Z
    .locals 2

    .line 1
    .line 2
    iget-byte v0, p0, Lh8/g;->e:B

    .line 3
    .line 4
    const/16 v1, 0x40

    .line 5
    and-int/2addr v0, v1

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    const/4 v0, 0x1

    .line 9
    return v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public c()Z
    .locals 2

    .line 1
    .line 2
    iget-byte v0, p0, Lh8/g;->e:B

    .line 3
    .line 4
    const/16 v1, 0x80

    .line 5
    and-int/2addr v0, v1

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    const/4 v0, 0x1

    .line 9
    return v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public d()I
    .locals 2

    .line 1
    .line 2
    iget-byte v0, p0, Lh8/g;->e:B

    .line 3
    .line 4
    and-int/lit8 v0, v0, 0xf

    .line 5
    const/4 v1, 0x2

    .line 6
    .line 7
    shl-int v0, v1, v0

    .line 8
    return v0
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
