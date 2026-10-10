.class public La8/i;
.super La8/d;
.source "IHDRChunk.java"


# static fields
.field public static final h:I


# instance fields
.field public e:I

.field public f:I

.field public g:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    const-string v0, "IHDR"

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, La8/d;->a(Ljava/lang/String;)I

    .line 6
    move-result v0

    .line 7
    .line 8
    sput v0, La8/i;->h:I

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
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, La8/d;-><init>()V

    .line 4
    const/4 v0, 0x5

    .line 5
    .line 6
    new-array v0, v0, [B

    .line 7
    .line 8
    iput-object v0, p0, La8/i;->g:[B

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


# virtual methods
.method public b(Lb8/a;)V
    .locals 3
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
    iput v0, p0, La8/i;->e:I

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Lb8/a;->c()I

    .line 10
    move-result v0

    .line 11
    .line 12
    iput v0, p0, La8/i;->f:I

    .line 13
    .line 14
    iget-object v0, p0, La8/i;->g:[B

    .line 15
    const/4 v1, 0x0

    .line 16
    array-length v2, v0

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, v0, v1, v2}, Lcom/github/penfeizhou/animation/io/c;->read([BII)I

    .line 20
    return-void
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
.end method
