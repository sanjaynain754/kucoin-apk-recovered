.class public La8/e;
.super La8/d;
.source "FCTLChunk.java"


# static fields
.field public static final n:I


# instance fields
.field public e:I

.field public f:I

.field public g:I

.field public h:I

.field public i:I

.field public j:S

.field public k:S

.field public l:B

.field public m:B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    const-string v0, "fcTL"

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, La8/d;->a(Ljava/lang/String;)I

    .line 6
    move-result v0

    .line 7
    .line 8
    sput v0, La8/e;->n:I

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
    invoke-direct {p0}, La8/d;-><init>()V

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
.method public b(Lb8/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Lb8/a;->c()I

    .line 4
    move-result v0

    .line 5
    .line 6
    iput v0, p0, La8/e;->e:I

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Lb8/a;->c()I

    .line 10
    move-result v0

    .line 11
    .line 12
    iput v0, p0, La8/e;->f:I

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Lb8/a;->c()I

    .line 16
    move-result v0

    .line 17
    .line 18
    iput v0, p0, La8/e;->g:I

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Lb8/a;->c()I

    .line 22
    move-result v0

    .line 23
    .line 24
    iput v0, p0, La8/e;->h:I

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Lb8/a;->c()I

    .line 28
    move-result v0

    .line 29
    .line 30
    iput v0, p0, La8/e;->i:I

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Lb8/a;->d()S

    .line 34
    move-result v0

    .line 35
    .line 36
    iput-short v0, p0, La8/e;->j:S

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1}, Lb8/a;->d()S

    .line 40
    move-result v0

    .line 41
    .line 42
    iput-short v0, p0, La8/e;->k:S

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1}, Lcom/github/penfeizhou/animation/io/c;->peek()B

    .line 46
    move-result v0

    .line 47
    .line 48
    iput-byte v0, p0, La8/e;->l:B

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1}, Lcom/github/penfeizhou/animation/io/c;->peek()B

    .line 52
    move-result p1

    .line 53
    .line 54
    iput-byte p1, p0, La8/e;->m:B

    .line 55
    return-void
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
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
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
