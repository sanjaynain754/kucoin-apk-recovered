.class public Lm8/c;
.super Lm8/e;
.source "ANMFChunk.java"


# static fields
.field public static final m:I


# instance fields
.field public d:I

.field public e:I

.field public f:I

.field public g:I

.field public h:I

.field public i:B

.field public j:Lm8/a;

.field public k:Lm8/i;

.field public l:Lm8/j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    const-string v0, "ANMF"

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lm8/e;->a(Ljava/lang/String;)I

    .line 6
    move-result v0

    .line 7
    .line 8
    sput v0, Lm8/c;->m:I

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
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lm8/e;-><init>()V

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
.end method


# virtual methods
.method public b(Ln8/a;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/github/penfeizhou/animation/io/c;->available()I

    .line 4
    move-result v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Ln8/a;->d()I

    .line 8
    move-result v1

    .line 9
    .line 10
    iput v1, p0, Lm8/c;->d:I

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Ln8/a;->d()I

    .line 14
    move-result v1

    .line 15
    .line 16
    iput v1, p0, Lm8/c;->e:I

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Ln8/a;->a()I

    .line 20
    move-result v1

    .line 21
    .line 22
    iput v1, p0, Lm8/c;->f:I

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1}, Ln8/a;->a()I

    .line 26
    move-result v1

    .line 27
    .line 28
    iput v1, p0, Lm8/c;->g:I

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1}, Ln8/a;->d()I

    .line 32
    move-result v1

    .line 33
    .line 34
    iput v1, p0, Lm8/c;->h:I

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1}, Lcom/github/penfeizhou/animation/io/c;->peek()B

    .line 38
    move-result v1

    .line 39
    .line 40
    iput-byte v1, p0, Lm8/c;->i:B

    .line 41
    .line 42
    iget v1, p0, Lm8/e;->b:I

    .line 43
    sub-int/2addr v0, v1

    .line 44
    int-to-long v0, v0

    .line 45
    .line 46
    .line 47
    :cond_0
    :goto_0
    invoke-virtual {p1}, Lcom/github/penfeizhou/animation/io/c;->available()I

    .line 48
    move-result v2

    .line 49
    int-to-long v2, v2

    .line 50
    .line 51
    cmp-long v2, v2, v0

    .line 52
    .line 53
    if-lez v2, :cond_3

    .line 54
    .line 55
    .line 56
    invoke-static {p1}, Lcom/github/penfeizhou/animation/webp/decode/WebPParser;->c(Ln8/a;)Lm8/e;

    .line 57
    move-result-object v2

    .line 58
    .line 59
    instance-of v3, v2, Lm8/a;

    .line 60
    .line 61
    if-eqz v3, :cond_1

    .line 62
    .line 63
    check-cast v2, Lm8/a;

    .line 64
    .line 65
    iput-object v2, p0, Lm8/c;->j:Lm8/a;

    .line 66
    goto :goto_0

    .line 67
    .line 68
    :cond_1
    instance-of v3, v2, Lm8/i;

    .line 69
    .line 70
    if-eqz v3, :cond_2

    .line 71
    .line 72
    check-cast v2, Lm8/i;

    .line 73
    .line 74
    iput-object v2, p0, Lm8/c;->k:Lm8/i;

    .line 75
    goto :goto_0

    .line 76
    .line 77
    :cond_2
    instance-of v3, v2, Lm8/j;

    .line 78
    .line 79
    if-eqz v3, :cond_0

    .line 80
    .line 81
    check-cast v2, Lm8/j;

    .line 82
    .line 83
    iput-object v2, p0, Lm8/c;->l:Lm8/j;

    .line 84
    goto :goto_0

    .line 85
    :cond_3
    return-void
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
.end method

.method public d()Z
    .locals 2

    .line 1
    .line 2
    iget-byte v0, p0, Lm8/c;->i:B

    .line 3
    const/4 v1, 0x2

    .line 4
    and-int/2addr v0, v1

    .line 5
    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
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
.end method

.method public e()Z
    .locals 2

    .line 1
    .line 2
    iget-byte v0, p0, Lm8/c;->i:B

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
    .line 19
    .line 20
    .line 21
    .line 22
.end method
