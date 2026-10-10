.class public final Lcom/tencent/bugly/common/network/ssl/NameVerifierFactory;
.super Ljava/lang/Object;
.source "BUGLY"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R*\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008\"\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/tencent/bugly/common/network/ssl/NameVerifierFactory;",
        "",
        "()V",
        "DEFAULT_NAME_VERIFIER",
        "Ljavax/net/ssl/HostnameVerifier;",
        "value",
        "nameVerifier",
        "getNameVerifier",
        "()Ljavax/net/ssl/HostnameVerifier;",
        "setNameVerifier",
        "(Ljavax/net/ssl/HostnameVerifier;)V",
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
.field public static final DEFAULT_NAME_VERIFIER:Ljavax/net/ssl/HostnameVerifier;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final INSTANCE:Lcom/tencent/bugly/common/network/ssl/NameVerifierFactory;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static nameVerifier:Ljavax/net/ssl/HostnameVerifier;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/bugly/common/network/ssl/NameVerifierFactory;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/tencent/bugly/common/network/ssl/NameVerifierFactory;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/tencent/bugly/common/network/ssl/NameVerifierFactory;->INSTANCE:Lcom/tencent/bugly/common/network/ssl/NameVerifierFactory;

    .line 8
    .line 9
    new-instance v0, Lcom/tencent/bugly/common/network/ssl/DefaultNameVerifier;

    .line 10
    .line 11
    .line 12
    invoke-direct {v0}, Lcom/tencent/bugly/common/network/ssl/DefaultNameVerifier;-><init>()V

    .line 13
    .line 14
    sput-object v0, Lcom/tencent/bugly/common/network/ssl/NameVerifierFactory;->DEFAULT_NAME_VERIFIER:Ljavax/net/ssl/HostnameVerifier;

    .line 15
    .line 16
    sput-object v0, Lcom/tencent/bugly/common/network/ssl/NameVerifierFactory;->nameVerifier:Ljavax/net/ssl/HostnameVerifier;

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


# virtual methods
.method public final getNameVerifier()Ljavax/net/ssl/HostnameVerifier;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/bugly/common/network/ssl/NameVerifierFactory;->nameVerifier:Ljavax/net/ssl/HostnameVerifier;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    sget-object v0, Lcom/tencent/bugly/common/network/ssl/NameVerifierFactory;->DEFAULT_NAME_VERIFIER:Ljavax/net/ssl/HostnameVerifier;

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

.method public final setNameVerifier(Ljavax/net/ssl/HostnameVerifier;)V
    .locals 1
    .param p1    # Ljavax/net/ssl/HostnameVerifier;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    const-class v0, Lcom/tencent/bugly/common/network/ssl/SslFactory;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    :try_start_0
    sput-object p1, Lcom/tencent/bugly/common/network/ssl/NameVerifierFactory;->nameVerifier:Ljavax/net/ssl/HostnameVerifier;

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
