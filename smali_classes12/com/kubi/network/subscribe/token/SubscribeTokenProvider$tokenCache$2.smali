.class final Lcom/kubi/network/subscribe/token/SubscribeTokenProvider$tokenCache$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SubscribeTokenProvider.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/network/subscribe/token/SubscribeTokenProvider;-><init>(Lcom/kubi/network/subscribe/token/SubscribeTokenConfig;Lokhttp3/OkHttpClient;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Ljava/util/Map<",
        "Ljava/lang/String;",
        "Lcom/kubi/network/socket/model/DefaultTokenEntity;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "",
        "Lcom/kubi/network/socket/model/DefaultTokenEntity;",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSubscribeTokenProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubscribeTokenProvider.kt\ncom/kubi/network/subscribe/token/SubscribeTokenProvider$tokenCache$2\n+ 2 NetCoreSubIssue.kt\ncom/kubi/network/subscribe/exception/NetCoreSubIssueKt\n*L\n1#1,138:1\n52#2,33:139\n*S KotlinDebug\n*F\n+ 1 SubscribeTokenProvider.kt\ncom/kubi/network/subscribe/token/SubscribeTokenProvider$tokenCache$2\n*L\n49#1:139,33\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/kubi/network/subscribe/token/SubscribeTokenProvider;


# direct methods
.method public constructor <init>(Lcom/kubi/network/subscribe/token/SubscribeTokenProvider;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/network/subscribe/token/SubscribeTokenProvider$tokenCache$2;->this$0:Lcom/kubi/network/subscribe/token/SubscribeTokenProvider;

    .line 3
    const/4 p1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 7
    return-void
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
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/kubi/network/subscribe/token/SubscribeTokenProvider$tokenCache$2;->invoke()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final invoke()Ljava/util/Map;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/kubi/network/socket/model/DefaultTokenEntity;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/kubi/network/subscribe/token/SubscribeTokenProvider$tokenCache$2;->this$0:Lcom/kubi/network/subscribe/token/SubscribeTokenProvider;

    invoke-static {v0}, Lcom/kubi/network/subscribe/token/SubscribeTokenProvider;->e(Lcom/kubi/network/subscribe/token/SubscribeTokenProvider;)Ly70/g;

    move-result-object v0

    const-string v1, "{}"

    invoke-static {v0, v1}, Ly70/a;->h(Ly70/g;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 3
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-lez v1, :cond_0

    .line 4
    new-instance v1, Lcom/kubi/network/subscribe/token/SubscribeTokenProvider$tokenCache$2$a;

    invoke-direct {v1}, Lcom/kubi/network/subscribe/token/SubscribeTokenProvider$tokenCache$2$a;-><init>()V

    invoke-virtual {v1}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    move-result-object v1

    .line 5
    invoke-static {v0, v1}, Lcom/kubi/utils/x;->d(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    return-object v0

    :catchall_0
    move-exception v0

    goto :goto_0

    .line 6
    :cond_0
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    .line 7
    :goto_0
    iget-object v1, p0, Lcom/kubi/network/subscribe/token/SubscribeTokenProvider$tokenCache$2;->this$0:Lcom/kubi/network/subscribe/token/SubscribeTokenProvider;

    invoke-static {v1}, Lcom/kubi/network/subscribe/token/SubscribeTokenProvider;->e(Lcom/kubi/network/subscribe/token/SubscribeTokenProvider;)Ly70/g;

    move-result-object v1

    invoke-static {v1}, Ly70/a;->r(Ly70/g;)Ly70/a;

    .line 8
    instance-of v1, v0, Ljava/net/UnknownHostException;

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    goto/16 :goto_1

    .line 9
    :cond_1
    instance-of v1, v0, Ljava/net/SocketException;

    if-eqz v1, :cond_2

    goto/16 :goto_1

    .line 10
    :cond_2
    instance-of v1, v0, Ljava/net/SocketTimeoutException;

    if-eqz v1, :cond_3

    goto/16 :goto_1

    .line 11
    :cond_3
    instance-of v1, v0, Ljavax/net/ssl/SSLException;

    if-eqz v1, :cond_4

    goto/16 :goto_1

    .line 12
    :cond_4
    instance-of v1, v0, Ljavax/net/ssl/SSLProtocolException;

    if-eqz v1, :cond_5

    goto/16 :goto_1

    .line 13
    :cond_5
    instance-of v1, v0, Ljavax/net/ssl/SSLPeerUnverifiedException;

    if-eqz v1, :cond_6

    goto/16 :goto_1

    .line 14
    :cond_6
    instance-of v1, v0, Lokhttp3/internal/http2/ConnectionShutdownException;

    if-eqz v1, :cond_7

    goto :goto_1

    .line 15
    :cond_7
    instance-of v1, v0, Ljava/lang/SecurityException;

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x0

    if-eqz v1, :cond_9

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_8

    .line 16
    const-string v2, "Package android does not belong to"

    invoke-static {v1, v2, v5, v4, v3}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v2

    goto :goto_1

    :cond_8
    move v2, v5

    goto :goto_1

    .line 17
    :cond_9
    instance-of v1, v0, Ljava/io/IOException;

    if-eqz v1, :cond_8

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_8

    .line 18
    const-string v6, "Required SETTINGS preface not received"

    invoke-static {v1, v6, v5, v4, v3}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_a

    goto :goto_1

    .line 19
    :cond_a
    const-string v6, "Unexpected response code for CONNECT"

    invoke-static {v1, v6, v5, v4, v3}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_b

    goto :goto_1

    .line 20
    :cond_b
    const-string v6, "exhausted all routes"

    invoke-static {v1, v6, v5, v4, v3}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_c

    goto :goto_1

    .line 21
    :cond_c
    const-string v6, "unexpected end of stream"

    invoke-static {v1, v6, v5, v4, v3}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_d

    goto :goto_1

    .line 22
    :cond_d
    const-string v6, "stream was reset: CANCEL"

    invoke-static {v1, v6, v5, v4, v3}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_e

    goto :goto_1

    .line 23
    :cond_e
    const-string v6, "Software caused connection abort"

    invoke-static {v1, v6, v5, v4, v3}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_f

    goto :goto_1

    .line 24
    :cond_f
    const-string v3, "closed"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    .line 25
    :goto_1
    const-string v1, "TokenProvider"

    if-eqz v2, :cond_10

    .line 26
    invoke-static {v1, v0}, Lro/b;->g(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_2

    .line 27
    :cond_10
    invoke-static {v0, v1}, Lwr/a;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 28
    :goto_2
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    return-object v0
.end method
