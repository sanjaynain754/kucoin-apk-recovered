.class public final Lcom/forter/mobile/fortersdk/r;
.super Ljava/lang/Object;


# instance fields
.field public a:I

.field public b:Ljava/lang/String;


# direct methods
.method public constructor <init>(ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/forter/mobile/fortersdk/r;->a:I

    iput-object p2, p0, Lcom/forter/mobile/fortersdk/r;->b:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/forter/mobile/fortersdk/aj$d;)V
    .locals 3

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p1, Lcom/forter/mobile/fortersdk/aj$d;->b:Ljava/net/HttpURLConnection;

    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v2

    iput v2, p0, Lcom/forter/mobile/fortersdk/r;->a:I

    iget-object p1, p1, Lcom/forter/mobile/fortersdk/aj$d;->c:Ljava/io/InputStream;

    if-eqz p1, :cond_0

    invoke-static {p1}, Lcom/forter/mobile/fortersdk/y;->a(Ljava/io/InputStream;)Ljava/io/BufferedReader;

    move-result-object p1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_0
    invoke-static {v1}, Lcom/forter/mobile/fortersdk/aj;->b(Ljava/net/HttpURLConnection;)Ljava/io/InputStream;

    move-result-object v0

    invoke-static {v0}, Lcom/forter/mobile/fortersdk/y;->a(Ljava/io/InputStream;)Ljava/io/BufferedReader;

    move-result-object p1

    :goto_0
    invoke-static {p1}, Lcom/forter/mobile/fortersdk/y;->b(Ljava/io/BufferedReader;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/forter/mobile/fortersdk/r;->b:Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_1

    :try_start_1
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    return-void

    :goto_1
    const/4 v1, -0x1

    :try_start_2
    iput v1, p0, Lcom/forter/mobile/fortersdk/r;->a:I

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Could not read response body for rejected message: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/forter/mobile/fortersdk/r;->b:Ljava/lang/String;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v0, :cond_1

    :try_start_3
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    :catch_1
    :cond_1
    return-void

    :goto_2
    if-eqz v0, :cond_2

    :try_start_4
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2

    :catch_2
    :cond_2
    throw p1
.end method
