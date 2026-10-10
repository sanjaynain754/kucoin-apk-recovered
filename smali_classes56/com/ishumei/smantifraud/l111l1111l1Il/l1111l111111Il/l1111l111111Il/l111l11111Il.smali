.class public final Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l111l11111Il;
.super Ljava/lang/Object;


# instance fields
.field private final l1111l111111Il:I

.field private final l111l11111I1l:Ljava/io/InputStream;

.field private final l111l11111Il:[B

.field private final l111l11111lIl:I


# direct methods
.method public constructor <init>(I[B)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput p1, p0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l111l11111Il;->l1111l111111Il:I

    .line 6
    array-length p1, p2

    .line 7
    .line 8
    iput p1, p0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l111l11111Il;->l111l11111lIl:I

    .line 9
    .line 10
    iput-object p2, p0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l111l11111Il;->l111l11111Il:[B

    .line 11
    const/4 p1, 0x0

    .line 12
    .line 13
    iput-object p1, p0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l111l11111Il;->l111l11111I1l:Ljava/io/InputStream;

    .line 14
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
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
.end method


# virtual methods
.method public final l1111l111111Il()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l111l11111Il;->l1111l111111Il:I

    .line 3
    return v0
    .line 4
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
.end method

.method public final l111l11111I1l()[B
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l111l11111Il;->l111l11111Il:[B

    .line 3
    return-object v0
    .line 4
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
.end method

.method public final l111l11111Il()Ljava/io/InputStream;
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l111l11111Il;->l111l11111Il:[B

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Ljava/io/ByteArrayInputStream;

    .line 7
    .line 8
    iget-object v1, p0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l111l11111Il;->l111l11111Il:[B

    .line 9
    .line 10
    .line 11
    invoke-direct {v0, v1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 12
    return-object v0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return-object v0
    .line 15
    .line 16
.end method

.method public final l111l11111lIl()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l111l11111Il;->l111l11111lIl:I

    .line 3
    return v0
    .line 4
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
.end method
