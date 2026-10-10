.class public Lh8/e;
.super Ljava/lang/Object;
.source "DataSubBlock.java"

# interfaces
.implements Lh8/b;


# static fields
.field public static final c:Lh8/e;


# instance fields
.field public final a:I

.field public b:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lh8/e;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lh8/e;-><init>(I)V

    .line 7
    .line 8
    sput-object v0, Lh8/e;->c:Lh8/e;

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
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput p1, p0, Lh8/e;->a:I

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

.method public static c(Lcom/github/penfeizhou/animation/gif/io/GifReader;)Lh8/e;
    .locals 2
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
    move-result v0

    .line 5
    .line 6
    and-int/lit16 v0, v0, 0xff

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    sget-object p0, Lh8/e;->c:Lh8/e;

    .line 11
    return-object p0

    .line 12
    .line 13
    :cond_0
    new-instance v1, Lh8/e;

    .line 14
    .line 15
    .line 16
    invoke-direct {v1, v0}, Lh8/e;-><init>(I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/github/penfeizhou/animation/io/c;->position()I

    .line 20
    move-result v0

    .line 21
    .line 22
    iput v0, v1, Lh8/e;->b:I

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, p0}, Lh8/e;->a(Lcom/github/penfeizhou/animation/gif/io/GifReader;)V

    .line 26
    return-object v1
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
    .line 76
    .line 77
    .line 78
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
    iget v0, p0, Lh8/e;->a:I

    .line 3
    int-to-long v0, v0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1, v0, v1}, Lcom/github/penfeizhou/animation/io/c;->skip(J)J

    .line 7
    return-void
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

.method public b()Z
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lh8/e;->c:Lh8/e;

    .line 3
    .line 4
    if-ne p0, v0, :cond_0

    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

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
