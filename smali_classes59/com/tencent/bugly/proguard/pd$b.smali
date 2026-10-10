.class public final Lcom/tencent/bugly/proguard/pd$b;
.super Lcom/tencent/bugly/proguard/pd$f;
.source "BUGLY"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/bugly/proguard/pd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final e:Lokio/Buffer;

.field public f:J


# direct methods
.method public constructor <init>(J)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/bugly/proguard/pd$f;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lokio/Buffer;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Lokio/Buffer;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/tencent/bugly/proguard/pd$b;->e:Lokio/Buffer;

    .line 11
    .line 12
    const-wide/16 v1, -0x1

    .line 13
    .line 14
    iput-wide v1, p0, Lcom/tencent/bugly/proguard/pd$b;->f:J

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v0, p1, p2}, Lcom/tencent/bugly/proguard/pd$f;->a(Lokio/BufferedSink;J)V

    .line 18
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method


# virtual methods
.method public a(Lokhttp3/Request;)Lokhttp3/Request;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "Content-Length"

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1, v0}, Lokhttp3/Request;->header(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    return-object p1

    .line 10
    .line 11
    :cond_0
    iget-object v1, p0, Lcom/tencent/bugly/proguard/pd$f;->c:Ljava/io/OutputStream;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V

    .line 15
    .line 16
    iget-object v1, p0, Lcom/tencent/bugly/proguard/pd$b;->e:Lokio/Buffer;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1}, Lokio/Buffer;->size()J

    .line 20
    move-result-wide v1

    .line 21
    .line 22
    iput-wide v1, p0, Lcom/tencent/bugly/proguard/pd$b;->f:J

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1}, Lokhttp3/Request;->newBuilder()Lokhttp3/Request$Builder;

    .line 26
    move-result-object p1

    .line 27
    .line 28
    const-string v1, "Transfer-Encoding"

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1, v1}, Lokhttp3/Request$Builder;->removeHeader(Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 32
    move-result-object p1

    .line 33
    .line 34
    iget-object v1, p0, Lcom/tencent/bugly/proguard/pd$b;->e:Lokio/Buffer;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1}, Lokio/Buffer;->size()J

    .line 38
    move-result-wide v1

    .line 39
    .line 40
    .line 41
    invoke-static {v1, v2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 42
    move-result-object v1

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1, v0, v1}, Lokhttp3/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 46
    move-result-object p1

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1}, Lokhttp3/Request$Builder;->build()Lokhttp3/Request;

    .line 50
    move-result-object p1

    .line 51
    return-object p1
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
    .line 79
    .line 80
    .line 81
.end method

.method public contentLength()J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/bugly/proguard/pd$b;->f:J

    .line 3
    return-wide v0
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
.end method

.method public writeTo(Lokio/BufferedSink;)V
    .locals 6

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/pd$b;->e:Lokio/Buffer;

    .line 3
    .line 4
    .line 5
    invoke-interface {p1}, Lokio/BufferedSink;->buffer()Lokio/Buffer;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    iget-object p1, p0, Lcom/tencent/bugly/proguard/pd$b;->e:Lokio/Buffer;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lokio/Buffer;->size()J

    .line 12
    move-result-wide v4

    .line 13
    .line 14
    const-wide/16 v2, 0x0

    .line 15
    .line 16
    .line 17
    invoke-virtual/range {v0 .. v5}, Lokio/Buffer;->copyTo(Lokio/Buffer;JJ)Lokio/Buffer;

    .line 18
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method
