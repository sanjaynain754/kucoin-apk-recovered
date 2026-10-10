.class public final Lcom/geetest/gtc4/v2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/geetest/gtc4/c;


# instance fields
.field public final a:Lcom/geetest/gtc4/h3;

.field public b:I


# direct methods
.method public constructor <init>(Lcom/geetest/gtc4/h3;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput v0, p0, Lcom/geetest/gtc4/v2;->b:I

    .line 7
    .line 8
    iput-object p1, p0, Lcom/geetest/gtc4/v2;->a:Lcom/geetest/gtc4/h3;

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
    .line 23
.end method


# virtual methods
.method public final a()Ljava/io/InputStream;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/geetest/gtc4/v2;->a:Lcom/geetest/gtc4/h3;

    .line 3
    .line 4
    iget v1, v0, Lcom/geetest/gtc4/h3;->d:I

    .line 5
    const/4 v2, 0x1

    .line 6
    .line 7
    if-lt v1, v2, :cond_3

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/geetest/gtc4/h3;->read()I

    .line 11
    move-result v0

    .line 12
    .line 13
    iput v0, p0, Lcom/geetest/gtc4/v2;->b:I

    .line 14
    .line 15
    if-lez v0, :cond_2

    .line 16
    const/4 v2, 0x2

    .line 17
    .line 18
    if-lt v1, v2, :cond_1

    .line 19
    const/4 v1, 0x7

    .line 20
    .line 21
    if-gt v0, v1, :cond_0

    .line 22
    goto :goto_0

    .line 23
    .line 24
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 25
    .line 26
    const-string v1, "pad bits cannot be greater than 7 or less than 0"

    .line 27
    .line 28
    .line 29
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 30
    throw v0

    .line 31
    .line 32
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 33
    .line 34
    .line 35
    const-string/jumbo v1, "zero length data with non-zero pad bits"

    .line 36
    .line 37
    .line 38
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 39
    throw v0

    .line 40
    .line 41
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/geetest/gtc4/v2;->a:Lcom/geetest/gtc4/h3;

    .line 42
    return-object v0

    .line 43
    .line 44
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 45
    .line 46
    const-string v1, "content octets cannot be empty"

    .line 47
    .line 48
    .line 49
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 50
    throw v0
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

.method public final b()Lcom/geetest/gtc4/w;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/geetest/gtc4/v2;->a:Lcom/geetest/gtc4/h3;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/geetest/gtc4/h3;->b()[B

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Lcom/geetest/gtc4/b;->a([B)Lcom/geetest/gtc4/b;

    .line 10
    move-result-object v0

    .line 11
    return-object v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public final d()Lcom/geetest/gtc4/w;
    .locals 4

    .line 1
    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/geetest/gtc4/v2;->a:Lcom/geetest/gtc4/h3;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/geetest/gtc4/h3;->b()[B

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Lcom/geetest/gtc4/b;->a([B)Lcom/geetest/gtc4/b;

    .line 10
    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    return-object v0

    .line 12
    :catch_0
    move-exception v0

    .line 13
    .line 14
    new-instance v1, Lcom/geetest/gtc4/v;

    .line 15
    .line 16
    new-instance v2, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    const-string v3, "IOException converting stream to byte array: "

    .line 19
    .line 20
    .line 21
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 25
    move-result-object v3

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    move-result-object v2

    .line 33
    .line 34
    .line 35
    invoke-direct {v1, v2, v0}, Lcom/geetest/gtc4/v;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 36
    throw v1
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

.method public final e()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/geetest/gtc4/v2;->b:I

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
    .line 17
    .line 18
.end method
