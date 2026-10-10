.class public abstract Lcom/tencent/bugly/proguard/pd$f;
.super Lokhttp3/RequestBody;
.source "BUGLY"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/bugly/proguard/pd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "f"
.end annotation


# instance fields
.field public a:Lokio/Timeout;

.field public b:J

.field public c:Ljava/io/OutputStream;

.field public d:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lokhttp3/RequestBody;-><init>()V

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
.end method


# virtual methods
.method public a(Lokhttp3/Request;)Lokhttp3/Request;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    return-object p1
.end method

.method public a(Lokio/BufferedSink;J)V
    .locals 1

    .line 2
    invoke-interface {p1}, Lokio/Sink;->timeout()Lokio/Timeout;

    move-result-object v0

    iput-object v0, p0, Lcom/tencent/bugly/proguard/pd$f;->a:Lokio/Timeout;

    .line 3
    iput-wide p2, p0, Lcom/tencent/bugly/proguard/pd$f;->b:J

    .line 4
    new-instance v0, Lcom/tencent/bugly/proguard/pd$f$a;

    invoke-direct {v0, p0, p2, p3, p1}, Lcom/tencent/bugly/proguard/pd$f$a;-><init>(Lcom/tencent/bugly/proguard/pd$f;JLokio/BufferedSink;)V

    iput-object v0, p0, Lcom/tencent/bugly/proguard/pd$f;->c:Ljava/io/OutputStream;

    return-void
.end method

.method public contentLength()J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/bugly/proguard/pd$f;->b:J

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

.method public final contentType()Lokhttp3/MediaType;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
    .line 3
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
