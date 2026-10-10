.class public abstract Lcom/github/penfeizhou/animation/gif/decode/a;
.super Ljava/lang/Object;
.source "ExtensionBlock.java"

# interfaces
.implements Lh8/b;


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

.method public static b(Lcom/github/penfeizhou/animation/gif/io/GifReader;)Lcom/github/penfeizhou/animation/gif/decode/a;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/github/penfeizhou/animation/io/c;->peek()B

    .line 4
    move-result p0

    .line 5
    const/4 v0, -0x7

    .line 6
    .line 7
    if-eq p0, v0, :cond_3

    .line 8
    const/4 v0, 0x1

    .line 9
    .line 10
    if-eq p0, v0, :cond_2

    .line 11
    const/4 v0, -0x2

    .line 12
    .line 13
    if-eq p0, v0, :cond_1

    .line 14
    const/4 v0, -0x1

    .line 15
    .line 16
    if-ne p0, v0, :cond_0

    .line 17
    .line 18
    new-instance p0, Lh8/a;

    .line 19
    .line 20
    .line 21
    invoke-direct {p0}, Lh8/a;-><init>()V

    .line 22
    return-object p0

    .line 23
    .line 24
    :cond_0
    new-instance p0, Lcom/github/penfeizhou/animation/gif/decode/GifParser$FormatException;

    .line 25
    .line 26
    .line 27
    invoke-direct {p0}, Lcom/github/penfeizhou/animation/gif/decode/GifParser$FormatException;-><init>()V

    .line 28
    throw p0

    .line 29
    .line 30
    :cond_1
    new-instance p0, Lh8/d;

    .line 31
    .line 32
    .line 33
    invoke-direct {p0}, Lh8/d;-><init>()V

    .line 34
    return-object p0

    .line 35
    .line 36
    :cond_2
    new-instance p0, Lh8/i;

    .line 37
    .line 38
    .line 39
    invoke-direct {p0}, Lh8/i;-><init>()V

    .line 40
    return-object p0

    .line 41
    .line 42
    :cond_3
    new-instance p0, Lcom/github/penfeizhou/animation/gif/decode/b;

    .line 43
    .line 44
    .line 45
    invoke-direct {p0}, Lcom/github/penfeizhou/animation/gif/decode/b;-><init>()V

    .line 46
    return-object p0
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
