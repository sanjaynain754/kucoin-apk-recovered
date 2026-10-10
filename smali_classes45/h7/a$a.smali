.class public Lh7/a$a;
.super Ljava/lang/Object;
.source "InputAccessor.java"

# interfaces
.implements Lh7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh7/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final a:Ljava/io/InputStream;

.field public final b:[B

.field public final c:I

.field public d:I

.field public e:I


# direct methods
.method public constructor <init>(Ljava/io/InputStream;[B)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lh7/a$a;->a:Ljava/io/InputStream;

    .line 3
    iput-object p2, p0, Lh7/a$a;->b:[B

    const/4 p1, 0x0

    .line 4
    iput p1, p0, Lh7/a$a;->c:I

    .line 5
    iput p1, p0, Lh7/a$a;->e:I

    .line 6
    iput p1, p0, Lh7/a$a;->d:I

    return-void
.end method

.method public constructor <init>([BII)V
    .locals 1

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 8
    iput-object v0, p0, Lh7/a$a;->a:Ljava/io/InputStream;

    .line 9
    iput-object p1, p0, Lh7/a$a;->b:[B

    .line 10
    iput p2, p0, Lh7/a$a;->e:I

    .line 11
    iput p2, p0, Lh7/a$a;->c:I

    add-int/2addr p2, p3

    .line 12
    iput p2, p0, Lh7/a$a;->d:I

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget v0, p0, Lh7/a$a;->e:I

    .line 3
    .line 4
    iget v1, p0, Lh7/a$a;->d:I

    .line 5
    const/4 v2, 0x1

    .line 6
    .line 7
    if-ge v0, v1, :cond_0

    .line 8
    return v2

    .line 9
    .line 10
    :cond_0
    iget-object v1, p0, Lh7/a$a;->a:Ljava/io/InputStream;

    .line 11
    const/4 v3, 0x0

    .line 12
    .line 13
    if-nez v1, :cond_1

    .line 14
    return v3

    .line 15
    .line 16
    :cond_1
    iget-object v4, p0, Lh7/a$a;->b:[B

    .line 17
    array-length v5, v4

    .line 18
    sub-int/2addr v5, v0

    .line 19
    .line 20
    if-ge v5, v2, :cond_2

    .line 21
    return v3

    .line 22
    .line 23
    .line 24
    :cond_2
    invoke-virtual {v1, v4, v0, v5}, Ljava/io/InputStream;->read([BII)I

    .line 25
    move-result v0

    .line 26
    .line 27
    if-gtz v0, :cond_3

    .line 28
    return v3

    .line 29
    .line 30
    :cond_3
    iget v1, p0, Lh7/a$a;->d:I

    .line 31
    add-int/2addr v1, v0

    .line 32
    .line 33
    iput v1, p0, Lh7/a$a;->d:I

    .line 34
    return v2
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

.method public b()V
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lh7/a$a;->c:I

    .line 3
    .line 4
    iput v0, p0, Lh7/a$a;->e:I

    .line 5
    return-void
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

.method public nextByte()B
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget v0, p0, Lh7/a$a;->e:I

    .line 3
    .line 4
    iget v1, p0, Lh7/a$a;->d:I

    .line 5
    .line 6
    if-lt v0, v1, :cond_1

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lh7/a$a;->a()Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    goto :goto_0

    .line 14
    .line 15
    :cond_0
    new-instance v0, Ljava/io/EOFException;

    .line 16
    .line 17
    new-instance v1, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 21
    .line 22
    const-string v2, "Failed auto-detect: could not read more than "

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    iget v2, p0, Lh7/a$a;->e:I

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    const-string v2, " bytes (max buffer size: "

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    iget-object v2, p0, Lh7/a$a;->b:[B

    .line 38
    array-length v2, v2

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    const-string v2, ")"

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    move-result-object v1

    .line 51
    .line 52
    .line 53
    invoke-direct {v0, v1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    .line 54
    throw v0

    .line 55
    .line 56
    :cond_1
    :goto_0
    iget-object v0, p0, Lh7/a$a;->b:[B

    .line 57
    .line 58
    iget v1, p0, Lh7/a$a;->e:I

    .line 59
    .line 60
    add-int/lit8 v2, v1, 0x1

    .line 61
    .line 62
    iput v2, p0, Lh7/a$a;->e:I

    .line 63
    .line 64
    aget-byte v0, v0, v1

    .line 65
    return v0
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
