.class public final Lcom/tencent/bugly/proguard/pd$g;
.super Lcom/tencent/bugly/proguard/pd$f;
.source "BUGLY"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/bugly/proguard/pd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "g"
.end annotation


# instance fields
.field public final e:Lokio/Pipe;


# direct methods
.method public constructor <init>(J)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/bugly/proguard/pd$f;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lokio/Pipe;

    .line 6
    .line 7
    const-wide/16 v1, 0x2000

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, v1, v2}, Lokio/Pipe;-><init>(J)V

    .line 11
    .line 12
    iput-object v0, p0, Lcom/tencent/bugly/proguard/pd$g;->e:Lokio/Pipe;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lokio/Pipe;->sink()Lokio/Sink;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    .line 19
    invoke-static {v0}, Lokio/Okio;->buffer(Lokio/Sink;)Lokio/BufferedSink;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v0, p1, p2}, Lcom/tencent/bugly/proguard/pd$f;->a(Lokio/BufferedSink;J)V

    .line 24
    return-void
    .line 25
.end method


# virtual methods
.method public a()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
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

.method public writeTo(Lokio/BufferedSink;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lokio/Buffer;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lokio/Buffer;-><init>()V

    .line 6
    .line 7
    :goto_0
    iget-object v1, p0, Lcom/tencent/bugly/proguard/pd$g;->e:Lokio/Pipe;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1}, Lokio/Pipe;->source()Lokio/Source;

    .line 11
    move-result-object v1

    .line 12
    .line 13
    const-wide/16 v2, 0x2000

    .line 14
    .line 15
    .line 16
    invoke-interface {v1, v0, v2, v3}, Lokio/Source;->read(Lokio/Buffer;J)J

    .line 17
    move-result-wide v1

    .line 18
    .line 19
    const-wide/16 v3, -0x1

    .line 20
    .line 21
    cmp-long v1, v1, v3

    .line 22
    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Lokio/Buffer;->size()J

    .line 27
    move-result-wide v1

    .line 28
    .line 29
    .line 30
    invoke-interface {p1, v0, v1, v2}, Lokio/Sink;->write(Lokio/Buffer;J)V

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    return-void
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
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
.end method
