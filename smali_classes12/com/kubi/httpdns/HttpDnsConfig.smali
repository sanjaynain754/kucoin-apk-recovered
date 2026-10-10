.class public final Lcom/kubi/httpdns/HttpDnsConfig;
.super Ljava/lang/Object;
.source "KHttpDns.kt"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/httpdns/HttpDnsConfig$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008%\u0008\u0007\u0018\u00002\u00020\u0001:\u0001>B\u0089\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\u000c\u001a\u00020\t\u0012\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\r\u0012\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00100\r\u0012\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00120\r\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u00a2\u0006\u0004\u0008\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u001e\u001a\u0004\u0008\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010!\u001a\u0004\u0008\"\u0010#R\u0017\u0010\u0006\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010!\u001a\u0004\u0008$\u0010#R\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010%\u001a\u0004\u0008&\u0010\'R\u0017\u0010\n\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010(\u001a\u0004\u0008)\u0010*R\u0017\u0010\u000b\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010!\u001a\u0004\u0008+\u0010#R\u0017\u0010\u000c\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010(\u001a\u0004\u0008,\u0010*R\u001d\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\r8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010-\u001a\u0004\u0008.\u0010/R\u001d\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00100\r8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010-\u001a\u0004\u00080\u0010/R\u001d\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00120\r8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010-\u001a\u0004\u00081\u0010/R\u0017\u0010\u0015\u001a\u00020\u00148\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u00102\u001a\u0004\u00083\u00104R\u0017\u0010\u0017\u001a\u00020\u00168\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u00105\u001a\u0004\u00086\u00107R\u0017\u0010\u0019\u001a\u00020\u00188\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u00108\u001a\u0004\u00089\u0010:R\u0017\u0010\u001b\u001a\u00020\u001a8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010;\u001a\u0004\u0008<\u0010=\u00a8\u0006?"
    }
    d2 = {
        "Lcom/kubi/httpdns/HttpDnsConfig;",
        "",
        "Landroid/content/Context;",
        "context",
        "",
        "dnsEnable",
        "allowDiskCache",
        "",
        "allowRetryCount",
        "",
        "allowMaxTtl",
        "allowExpiredIp",
        "gloomyInterval",
        "",
        "",
        "preFetchHost",
        "Lcom/kubi/httpdns/ProbeConfig;",
        "probeConfig",
        "Lcom/kubi/httpdns/ServerConfig;",
        "serverConfig",
        "Lcom/kubi/httpdns/request/e;",
        "requestDecoder",
        "Lhk/b$a;",
        "requestTrackFactory",
        "Lcom/kubi/httpdns/track/IInterpretTrack$a;",
        "interpretTrackFactory",
        "Lokhttp3/OkHttpClient;",
        "okHttpClient",
        "<init>",
        "(Landroid/content/Context;ZZIJZJLjava/util/List;Ljava/util/List;Ljava/util/List;Lcom/kubi/httpdns/request/e;Lhk/b$a;Lcom/kubi/httpdns/track/IInterpretTrack$a;Lokhttp3/OkHttpClient;)V",
        "Landroid/content/Context;",
        "getContext",
        "()Landroid/content/Context;",
        "Z",
        "getDnsEnable",
        "()Z",
        "getAllowDiskCache",
        "I",
        "getAllowRetryCount",
        "()I",
        "J",
        "getAllowMaxTtl",
        "()J",
        "getAllowExpiredIp",
        "getGloomyInterval",
        "Ljava/util/List;",
        "getPreFetchHost",
        "()Ljava/util/List;",
        "getProbeConfig",
        "getServerConfig",
        "Lcom/kubi/httpdns/request/e;",
        "getRequestDecoder",
        "()Lcom/kubi/httpdns/request/e;",
        "Lhk/b$a;",
        "getRequestTrackFactory",
        "()Lhk/b$a;",
        "Lcom/kubi/httpdns/track/IInterpretTrack$a;",
        "getInterpretTrackFactory",
        "()Lcom/kubi/httpdns/track/IInterpretTrack$a;",
        "Lokhttp3/OkHttpClient;",
        "getOkHttpClient",
        "()Lokhttp3/OkHttpClient;",
        "a",
        "httpdns_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final allowDiskCache:Z

.field private final allowExpiredIp:Z

.field private final allowMaxTtl:J

.field private final allowRetryCount:I

.field private final context:Landroid/content/Context;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final dnsEnable:Z

.field private final gloomyInterval:J

.field private final interpretTrackFactory:Lcom/kubi/httpdns/track/IInterpretTrack$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final okHttpClient:Lokhttp3/OkHttpClient;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final preFetchHost:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final probeConfig:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/kubi/httpdns/ProbeConfig;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final requestDecoder:Lcom/kubi/httpdns/request/e;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final requestTrackFactory:Lhk/b$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final serverConfig:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/kubi/httpdns/ServerConfig;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;ZZIJZJLjava/util/List;Ljava/util/List;Ljava/util/List;Lcom/kubi/httpdns/request/e;Lhk/b$a;Lcom/kubi/httpdns/track/IInterpretTrack$a;Lokhttp3/OkHttpClient;)V
    .locals 8
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p10    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p11    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p12    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p13    # Lcom/kubi/httpdns/request/e;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p14    # Lhk/b$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p15    # Lcom/kubi/httpdns/track/IInterpretTrack$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p16    # Lokhttp3/OkHttpClient;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "ZZIJZJ",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Lcom/kubi/httpdns/ProbeConfig;",
            ">;",
            "Ljava/util/List<",
            "Lcom/kubi/httpdns/ServerConfig;",
            ">;",
            "Lcom/kubi/httpdns/request/e;",
            "Lhk/b$a;",
            "Lcom/kubi/httpdns/track/IInterpretTrack$a;",
            "Lokhttp3/OkHttpClient;",
            ")V"
        }
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p10

    .line 3
    .line 4
    move-object/from16 v1, p11

    .line 5
    .line 6
    move-object/from16 v2, p12

    .line 7
    .line 8
    move-object/from16 v3, p13

    .line 9
    .line 10
    move-object/from16 v4, p14

    .line 11
    .line 12
    move-object/from16 v5, p15

    .line 13
    .line 14
    move-object/from16 v6, p16

    .line 15
    .line 16
    const-string v7, "context"

    .line 17
    .line 18
    .line 19
    invoke-static {p1, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    const-string v7, "preFetchHost"

    .line 22
    .line 23
    .line 24
    invoke-static {v0, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    const-string v7, "probeConfig"

    .line 27
    .line 28
    .line 29
    invoke-static {v1, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    const-string v7, "serverConfig"

    .line 32
    .line 33
    .line 34
    invoke-static {v2, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    const-string v7, "requestDecoder"

    .line 37
    .line 38
    .line 39
    invoke-static {v3, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    .line 41
    const-string v7, "requestTrackFactory"

    .line 42
    .line 43
    .line 44
    invoke-static {v4, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    .line 46
    const-string v7, "interpretTrackFactory"

    .line 47
    .line 48
    .line 49
    invoke-static {v5, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    .line 51
    const-string v7, "okHttpClient"

    .line 52
    .line 53
    .line 54
    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    .line 59
    iput-object p1, p0, Lcom/kubi/httpdns/HttpDnsConfig;->context:Landroid/content/Context;

    .line 60
    .line 61
    iput-boolean p2, p0, Lcom/kubi/httpdns/HttpDnsConfig;->dnsEnable:Z

    .line 62
    .line 63
    iput-boolean p3, p0, Lcom/kubi/httpdns/HttpDnsConfig;->allowDiskCache:Z

    .line 64
    .line 65
    iput p4, p0, Lcom/kubi/httpdns/HttpDnsConfig;->allowRetryCount:I

    .line 66
    .line 67
    iput-wide p5, p0, Lcom/kubi/httpdns/HttpDnsConfig;->allowMaxTtl:J

    .line 68
    .line 69
    iput-boolean p7, p0, Lcom/kubi/httpdns/HttpDnsConfig;->allowExpiredIp:Z

    .line 70
    .line 71
    move-wide/from16 p1, p8

    .line 72
    .line 73
    iput-wide p1, p0, Lcom/kubi/httpdns/HttpDnsConfig;->gloomyInterval:J

    .line 74
    .line 75
    iput-object v0, p0, Lcom/kubi/httpdns/HttpDnsConfig;->preFetchHost:Ljava/util/List;

    .line 76
    .line 77
    iput-object v1, p0, Lcom/kubi/httpdns/HttpDnsConfig;->probeConfig:Ljava/util/List;

    .line 78
    .line 79
    iput-object v2, p0, Lcom/kubi/httpdns/HttpDnsConfig;->serverConfig:Ljava/util/List;

    .line 80
    .line 81
    iput-object v3, p0, Lcom/kubi/httpdns/HttpDnsConfig;->requestDecoder:Lcom/kubi/httpdns/request/e;

    .line 82
    .line 83
    iput-object v4, p0, Lcom/kubi/httpdns/HttpDnsConfig;->requestTrackFactory:Lhk/b$a;

    .line 84
    .line 85
    iput-object v5, p0, Lcom/kubi/httpdns/HttpDnsConfig;->interpretTrackFactory:Lcom/kubi/httpdns/track/IInterpretTrack$a;

    .line 86
    .line 87
    iput-object v6, p0, Lcom/kubi/httpdns/HttpDnsConfig;->okHttpClient:Lokhttp3/OkHttpClient;

    .line 88
    return-void
.end method


# virtual methods
.method public final getAllowDiskCache()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/kubi/httpdns/HttpDnsConfig;->allowDiskCache:Z

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
.end method

.method public final getAllowExpiredIp()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/kubi/httpdns/HttpDnsConfig;->allowExpiredIp:Z

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
.end method

.method public final getAllowMaxTtl()J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/kubi/httpdns/HttpDnsConfig;->allowMaxTtl:J

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
.end method

.method public final getAllowRetryCount()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/httpdns/HttpDnsConfig;->allowRetryCount:I

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
.end method

.method public final getContext()Landroid/content/Context;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/httpdns/HttpDnsConfig;->context:Landroid/content/Context;

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
.end method

.method public final getDnsEnable()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/kubi/httpdns/HttpDnsConfig;->dnsEnable:Z

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
.end method

.method public final getGloomyInterval()J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/kubi/httpdns/HttpDnsConfig;->gloomyInterval:J

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
.end method

.method public final getInterpretTrackFactory()Lcom/kubi/httpdns/track/IInterpretTrack$a;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/httpdns/HttpDnsConfig;->interpretTrackFactory:Lcom/kubi/httpdns/track/IInterpretTrack$a;

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
.end method

.method public final getOkHttpClient()Lokhttp3/OkHttpClient;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/httpdns/HttpDnsConfig;->okHttpClient:Lokhttp3/OkHttpClient;

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
.end method

.method public final getPreFetchHost()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/httpdns/HttpDnsConfig;->preFetchHost:Ljava/util/List;

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
.end method

.method public final getProbeConfig()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/kubi/httpdns/ProbeConfig;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/httpdns/HttpDnsConfig;->probeConfig:Ljava/util/List;

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
.end method

.method public final getRequestDecoder()Lcom/kubi/httpdns/request/e;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/httpdns/HttpDnsConfig;->requestDecoder:Lcom/kubi/httpdns/request/e;

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
.end method

.method public final getRequestTrackFactory()Lhk/b$a;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/httpdns/HttpDnsConfig;->requestTrackFactory:Lhk/b$a;

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
.end method

.method public final getServerConfig()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/kubi/httpdns/ServerConfig;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/httpdns/HttpDnsConfig;->serverConfig:Ljava/util/List;

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
.end method
