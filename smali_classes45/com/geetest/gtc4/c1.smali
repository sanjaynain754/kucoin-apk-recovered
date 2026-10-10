.class public final Lcom/geetest/gtc4/c1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/geetest/gtc4/c;


# instance fields
.field public final a:Lcom/geetest/gtc4/c0;

.field public b:Lcom/geetest/gtc4/t1;


# direct methods
.method public constructor <init>(Lcom/geetest/gtc4/c0;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/geetest/gtc4/c1;->a:Lcom/geetest/gtc4/c0;

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


# virtual methods
.method public final a()Ljava/io/InputStream;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/geetest/gtc4/t1;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/geetest/gtc4/c1;->a:Lcom/geetest/gtc4/c0;

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1}, Lcom/geetest/gtc4/t1;-><init>(Lcom/geetest/gtc4/c0;)V

    .line 8
    .line 9
    iput-object v0, p0, Lcom/geetest/gtc4/c1;->b:Lcom/geetest/gtc4/t1;

    .line 10
    return-object v0
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public final b()Lcom/geetest/gtc4/w;
    .locals 6

    .line 1
    .line 2
    iget-object v0, p0, Lcom/geetest/gtc4/c1;->a:Lcom/geetest/gtc4/c0;

    .line 3
    .line 4
    new-instance v1, Lcom/geetest/gtc4/t1;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1, v0}, Lcom/geetest/gtc4/t1;-><init>(Lcom/geetest/gtc4/c0;)V

    .line 8
    .line 9
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    .line 10
    .line 11
    .line 12
    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 13
    .line 14
    const/16 v2, 0x1000

    .line 15
    .line 16
    new-array v3, v2, [B

    .line 17
    :goto_0
    const/4 v4, 0x0

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, v3, v4, v2}, Lcom/geetest/gtc4/t1;->read([BII)I

    .line 21
    move-result v5

    .line 22
    .line 23
    if-ltz v5, :cond_0

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v3, v4, v5}, Ljava/io/OutputStream;->write([BII)V

    .line 27
    goto :goto_0

    .line 28
    .line 29
    .line 30
    :cond_0
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 31
    move-result-object v0

    .line 32
    .line 33
    iget v1, v1, Lcom/geetest/gtc4/t1;->c:I

    .line 34
    .line 35
    new-instance v2, Lcom/geetest/gtc4/b1;

    .line 36
    .line 37
    .line 38
    invoke-direct {v2, v0, v1}, Lcom/geetest/gtc4/b1;-><init>([BI)V

    .line 39
    return-object v2
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

.method public final d()Lcom/geetest/gtc4/w;
    .locals 6

    .line 1
    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/geetest/gtc4/c1;->a:Lcom/geetest/gtc4/c0;

    .line 3
    .line 4
    new-instance v1, Lcom/geetest/gtc4/t1;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1, v0}, Lcom/geetest/gtc4/t1;-><init>(Lcom/geetest/gtc4/c0;)V

    .line 8
    .line 9
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    .line 10
    .line 11
    .line 12
    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 13
    .line 14
    const/16 v2, 0x1000

    .line 15
    .line 16
    new-array v3, v2, [B

    .line 17
    :goto_0
    const/4 v4, 0x0

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, v3, v4, v2}, Lcom/geetest/gtc4/t1;->read([BII)I

    .line 21
    move-result v5

    .line 22
    .line 23
    if-ltz v5, :cond_0

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v3, v4, v5}, Ljava/io/OutputStream;->write([BII)V

    .line 27
    goto :goto_0

    .line 28
    :catch_0
    move-exception v0

    .line 29
    goto :goto_1

    .line 30
    .line 31
    .line 32
    :cond_0
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 33
    move-result-object v0

    .line 34
    .line 35
    iget v1, v1, Lcom/geetest/gtc4/t1;->c:I

    .line 36
    .line 37
    new-instance v2, Lcom/geetest/gtc4/b1;

    .line 38
    .line 39
    .line 40
    invoke-direct {v2, v0, v1}, Lcom/geetest/gtc4/b1;-><init>([BI)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 41
    return-object v2

    .line 42
    .line 43
    :goto_1
    new-instance v1, Lcom/geetest/gtc4/v;

    .line 44
    .line 45
    new-instance v2, Ljava/lang/StringBuilder;

    .line 46
    .line 47
    const-string v3, "IOException converting stream to byte array: "

    .line 48
    .line 49
    .line 50
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 54
    move-result-object v3

    .line 55
    .line 56
    .line 57
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    move-result-object v2

    .line 62
    .line 63
    .line 64
    invoke-direct {v1, v2, v0}, Lcom/geetest/gtc4/v;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 65
    throw v1
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

.method public final e()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/geetest/gtc4/c1;->b:Lcom/geetest/gtc4/t1;

    .line 3
    .line 4
    iget v0, v0, Lcom/geetest/gtc4/t1;->c:I

    .line 5
    return v0
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
