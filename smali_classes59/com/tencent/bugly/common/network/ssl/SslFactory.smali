.class public final Lcom/tencent/bugly/common/network/ssl/SslFactory;
.super Ljava/lang/Object;
.source "BUGLY"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R*\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u00048B@BX\u0082\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008\"\u0004\u0008\t\u0010\nR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u000c8F\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/tencent/bugly/common/network/ssl/SslFactory;",
        "",
        "()V",
        "DEFAULT_SSL_CONTEXT",
        "Lcom/tencent/bugly/common/network/ssl/ISslContextBuilder;",
        "value",
        "sslBuilder",
        "getSslBuilder",
        "()Lcom/tencent/bugly/common/network/ssl/ISslContextBuilder;",
        "setSslBuilder",
        "(Lcom/tencent/bugly/common/network/ssl/ISslContextBuilder;)V",
        "sslSocketFactory",
        "Ljavax/net/ssl/SSLSocketFactory;",
        "getSslSocketFactory",
        "()Ljavax/net/ssl/SSLSocketFactory;",
        "bugly-pro_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final DEFAULT_SSL_CONTEXT:Lcom/tencent/bugly/common/network/ssl/ISslContextBuilder;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final INSTANCE:Lcom/tencent/bugly/common/network/ssl/SslFactory;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static sslBuilder:Lcom/tencent/bugly/common/network/ssl/ISslContextBuilder;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private static final sslSocketFactory:Ljavax/net/ssl/SSLSocketFactory;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/bugly/common/network/ssl/SslFactory;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/tencent/bugly/common/network/ssl/SslFactory;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/tencent/bugly/common/network/ssl/SslFactory;->INSTANCE:Lcom/tencent/bugly/common/network/ssl/SslFactory;

    .line 8
    .line 9
    new-instance v0, Lcom/tencent/bugly/common/network/ssl/DefaultSslContextBuilder;

    .line 10
    .line 11
    .line 12
    invoke-direct {v0}, Lcom/tencent/bugly/common/network/ssl/DefaultSslContextBuilder;-><init>()V

    .line 13
    .line 14
    sput-object v0, Lcom/tencent/bugly/common/network/ssl/SslFactory;->DEFAULT_SSL_CONTEXT:Lcom/tencent/bugly/common/network/ssl/ISslContextBuilder;

    .line 15
    .line 16
    sput-object v0, Lcom/tencent/bugly/common/network/ssl/SslFactory;->sslBuilder:Lcom/tencent/bugly/common/network/ssl/ISslContextBuilder;

    .line 17
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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

.method private final getSslBuilder()Lcom/tencent/bugly/common/network/ssl/ISslContextBuilder;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/bugly/common/network/ssl/SslFactory;->sslBuilder:Lcom/tencent/bugly/common/network/ssl/ISslContextBuilder;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    sget-object v0, Lcom/tencent/bugly/common/network/ssl/SslFactory;->DEFAULT_SSL_CONTEXT:Lcom/tencent/bugly/common/network/ssl/ISslContextBuilder;

    .line 7
    :cond_0
    return-object v0
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

.method private final setSslBuilder(Lcom/tencent/bugly/common/network/ssl/ISslContextBuilder;)V
    .locals 1

    .line 1
    .line 2
    const-class v0, Lcom/tencent/bugly/common/network/ssl/SslFactory;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    :try_start_0
    sput-object p1, Lcom/tencent/bugly/common/network/ssl/SslFactory;->sslBuilder:Lcom/tencent/bugly/common/network/ssl/ISslContextBuilder;

    .line 6
    .line 7
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    monitor-exit v0

    .line 9
    return-void

    .line 10
    :catchall_0
    move-exception p1

    .line 11
    monitor-exit v0

    .line 12
    throw p1
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
.end method


# virtual methods
.method public final getSslSocketFactory()Ljavax/net/ssl/SSLSocketFactory;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/bugly/common/network/ssl/SslFactory;->sslSocketFactory:Ljavax/net/ssl/SSLSocketFactory;

    .line 3
    .line 4
    if-nez v0, :cond_1

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Lcom/tencent/bugly/common/network/ssl/SslFactory;->getSslBuilder()Lcom/tencent/bugly/common/network/ssl/ISslContextBuilder;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-interface {v0}, Lcom/tencent/bugly/common/network/ssl/ISslContextBuilder;->build()Ljavax/net/ssl/SSLContext;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljavax/net/ssl/SSLContext;->getSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    .line 20
    move-result-object v0

    .line 21
    return-object v0

    .line 22
    :cond_0
    const/4 v0, 0x0

    .line 23
    :cond_1
    return-object v0
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
.end method
