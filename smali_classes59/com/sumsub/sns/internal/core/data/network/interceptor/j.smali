.class public final Lcom/sumsub/sns/internal/core/data/network/interceptor/j;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lokhttp3/Interceptor;


# instance fields
.field public final a:Lcom/sumsub/sns/internal/core/domain/k;

.field public final b:Lcom/sumsub/sns/internal/core/domain/g;

.field public final c:Lxg0/a;

.field public d:I


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/core/domain/r;Lcom/sumsub/sns/internal/core/domain/g;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/sumsub/sns/internal/core/data/network/interceptor/j;->a:Lcom/sumsub/sns/internal/core/domain/k;

    .line 6
    .line 7
    iput-object p2, p0, Lcom/sumsub/sns/internal/core/data/network/interceptor/j;->b:Lcom/sumsub/sns/internal/core/domain/g;

    .line 8
    .line 9
    sget-boolean p1, Lcom/sumsub/sns/internal/core/common/k0;->f:Z

    .line 10
    .line 11
    .line 12
    invoke-static {p1}, Lcom/sumsub/sns/internal/core/common/J;->a(Z)Lxg0/a;

    .line 13
    move-result-object p1

    .line 14
    .line 15
    iput-object p1, p0, Lcom/sumsub/sns/internal/core/data/network/interceptor/j;->c:Lxg0/a;

    .line 16
    return-void
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
.end method


# virtual methods
.method public final a(Lokhttp3/Request;)Lokhttp3/Request;
    .locals 17

    move-object/from16 v0, p0

    .line 10
    const-string/jumbo v1, "utf-8"

    invoke-virtual/range {p1 .. p1}, Lokhttp3/Request;->newBuilder()Lokhttp3/Request$Builder;

    move-result-object v2

    const-string v3, "X-Access-Token"

    invoke-virtual {v2, v3}, Lokhttp3/Request$Builder;->removeHeader(Ljava/lang/String;)Lokhttp3/Request$Builder;

    move-result-object v2

    .line 11
    iget-object v4, v0, Lcom/sumsub/sns/internal/core/data/network/interceptor/j;->a:Lcom/sumsub/sns/internal/core/domain/k;

    invoke-interface {v4}, Lcom/sumsub/sns/internal/core/domain/k;->a()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 12
    const-string v5, "_act-jwt-"

    const/4 v6, 0x0

    const/4 v7, 0x2

    const/4 v8, 0x0

    invoke-static {v4, v5, v6, v7, v8}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v9

    const-string v10, "_act-sbx-jwt-"

    if-nez v9, :cond_1

    invoke-static {v4, v10, v6, v7, v8}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_0

    goto :goto_0

    .line 13
    :cond_0
    invoke-virtual {v2, v3, v4}, Lokhttp3/Request$Builder;->addHeader(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    goto/16 :goto_1

    .line 14
    :cond_1
    :goto_0
    :try_start_0
    invoke-static {v4, v5}, Lkotlin/text/StringsKt;->removePrefix(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v5

    .line 15
    invoke-static {v5, v10}, Lkotlin/text/StringsKt;->removePrefix(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v11

    .line 16
    const-string v5, "."

    filled-new-array {v5}, [Ljava/lang/String;

    move-result-object v12

    const/4 v15, 0x6

    const/16 v16, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v11 .. v16}, Lkotlin/text/StringsKt;->split$default(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;

    move-result-object v5

    .line 17
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    const/4 v9, 0x1

    invoke-interface {v5, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    .line 18
    invoke-static {v6, v1}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v7}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v6

    new-instance v9, Ljava/lang/String;

    sget-object v10, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v9, v6, v10}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 19
    invoke-static {v5, v1}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v7}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v1

    new-instance v5, Ljava/lang/String;

    invoke-direct {v5, v1, v10}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 20
    sget-object v11, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    invoke-static {v0}, Lcom/sumsub/sns/internal/log/e;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v12

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "JWT: header="

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, " payload="

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    const/4 v15, 0x4

    const/16 v16, 0x0

    const/4 v14, 0x0

    invoke-static/range {v11 .. v16}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->d$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 21
    sget-boolean v1, Lcom/sumsub/sns/internal/core/common/k0;->f:Z

    .line 22
    invoke-static {v1}, Lcom/sumsub/sns/internal/core/common/J;->a(Z)Lxg0/a;

    move-result-object v1

    .line 23
    invoke-virtual {v1}, Lxg0/a;->getSerializersModule()Lyg0/a;

    sget-object v6, Lcom/sumsub/sns/internal/core/data/network/interceptor/i;->Companion:Lcom/sumsub/sns/internal/core/data/network/interceptor/h;

    invoke-virtual {v6}, Lcom/sumsub/sns/internal/core/data/network/interceptor/h;->serializer()Ltg0/d;

    move-result-object v6

    invoke-static {v6}, Lug0/a;->u(Ltg0/d;)Ltg0/d;

    move-result-object v6

    check-cast v6, Ltg0/c;

    invoke-virtual {v1, v6, v5}, Lxg0/a;->a(Ltg0/c;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    .line 24
    check-cast v1, Lcom/sumsub/sns/internal/core/data/network/interceptor/i;

    if-eqz v1, :cond_2

    .line 25
    iget-object v5, v1, Lcom/sumsub/sns/internal/core/data/network/interceptor/i;->a:Ljava/lang/String;

    if-eqz v5, :cond_2

    .line 26
    iget-object v6, v0, Lcom/sumsub/sns/internal/core/data/network/interceptor/j;->a:Lcom/sumsub/sns/internal/core/domain/k;

    invoke-interface {v6, v5}, Lcom/sumsub/sns/internal/core/domain/k;->put(Ljava/lang/Object;)V

    .line 27
    invoke-virtual {v2, v3, v5}, Lokhttp3/Request$Builder;->addHeader(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    :cond_2
    if-eqz v1, :cond_3

    .line 28
    iget-object v1, v1, Lcom/sumsub/sns/internal/core/data/network/interceptor/i;->b:Ljava/lang/String;

    if-eqz v1, :cond_3

    .line 29
    iget-object v5, v0, Lcom/sumsub/sns/internal/core/data/network/interceptor/j;->b:Lcom/sumsub/sns/internal/core/domain/g;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    iput-object v1, v5, Lcom/sumsub/sns/internal/core/domain/g;->a:Ljava/lang/String;

    .line 31
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 32
    :catch_0
    invoke-virtual {v2, v3, v4}, Lokhttp3/Request$Builder;->addHeader(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 33
    :cond_3
    :goto_1
    iget-object v1, v0, Lcom/sumsub/sns/internal/core/data/network/interceptor/j;->b:Lcom/sumsub/sns/internal/core/domain/g;

    .line 34
    iget-object v1, v1, Lcom/sumsub/sns/internal/core/domain/g;->a:Ljava/lang/String;

    if-eqz v1, :cond_8

    .line 35
    sget-object v3, Lokhttp3/HttpUrl;->Companion:Lokhttp3/HttpUrl$Companion;

    invoke-virtual {v3, v1}, Lokhttp3/HttpUrl$Companion;->parse(Ljava/lang/String;)Lokhttp3/HttpUrl;

    move-result-object v1

    .line 36
    invoke-virtual/range {p1 .. p1}, Lokhttp3/Request;->url()Lokhttp3/HttpUrl;

    move-result-object v3

    .line 37
    invoke-virtual {v3}, Lokhttp3/HttpUrl;->newBuilder()Lokhttp3/HttpUrl$Builder;

    move-result-object v4

    if-eqz v1, :cond_4

    .line 38
    invoke-virtual {v1}, Lokhttp3/HttpUrl;->scheme()Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_5

    :cond_4
    invoke-virtual {v3}, Lokhttp3/HttpUrl;->scheme()Ljava/lang/String;

    move-result-object v5

    :cond_5
    invoke-virtual {v4, v5}, Lokhttp3/HttpUrl$Builder;->scheme(Ljava/lang/String;)Lokhttp3/HttpUrl$Builder;

    move-result-object v4

    if-eqz v1, :cond_6

    .line 39
    invoke-virtual {v1}, Lokhttp3/HttpUrl;->host()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_7

    :cond_6
    invoke-virtual {v3}, Lokhttp3/HttpUrl;->host()Ljava/lang/String;

    move-result-object v1

    :cond_7
    invoke-virtual {v4, v1}, Lokhttp3/HttpUrl$Builder;->host(Ljava/lang/String;)Lokhttp3/HttpUrl$Builder;

    move-result-object v1

    .line 40
    invoke-virtual {v1}, Lokhttp3/HttpUrl$Builder;->build()Lokhttp3/HttpUrl;

    move-result-object v1

    .line 41
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Substitute url: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " -> "

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 42
    sget-object v4, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 43
    iget-object v4, v4, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 44
    const-string v5, "TokenInterceptor"

    invoke-virtual {v4, v5, v3, v8}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 45
    invoke-virtual {v2, v1}, Lokhttp3/Request$Builder;->url(Lokhttp3/HttpUrl;)Lokhttp3/Request$Builder;

    .line 46
    :cond_8
    invoke-virtual {v2}, Lokhttp3/Request$Builder;->build()Lokhttp3/Request;

    move-result-object v1

    return-object v1
.end method

.method public final a()Z
    .locals 5

    const/4 v0, 0x0

    .line 1
    :try_start_0
    sget-object v1, Lcom/sumsub/sns/internal/core/common/k0;->a:Lcom/sumsub/sns/internal/core/common/k0;

    invoke-virtual {v1}, Lcom/sumsub/sns/internal/core/common/k0;->getTokenExpirationHandler()Lcom/sumsub/sns/core/data/listener/TokenExpirationHandler;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-interface {v1}, Lcom/sumsub/sns/core/data/listener/TokenExpirationHandler;->onTokenExpired()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    .line 2
    sget-object v2, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    invoke-static {p0}, Lcom/sumsub/sns/internal/log/e;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_0

    const-string v3, ""

    .line 3
    :cond_0
    sget-object v4, Lcom/sumsub/sns/internal/log/c;->c:Lcom/sumsub/sns/internal/log/logger/k;

    invoke-virtual {v4, v2, v3, v1}, Lcom/sumsub/sns/internal/log/logger/k;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 4
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "error updating token: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 5
    sget-object v2, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 6
    iget-object v2, v2, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 7
    const-string v3, "TokenInterceptor"

    invoke-virtual {v2, v3, v1, v0}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    if-eqz v0, :cond_2

    .line 8
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x5

    if-lt v1, v2, :cond_2

    .line 9
    iget-object v1, p0, Lcom/sumsub/sns/internal/core/data/network/interceptor/j;->a:Lcom/sumsub/sns/internal/core/domain/k;

    invoke-interface {v1, v0}, Lcom/sumsub/sns/internal/core/domain/k;->put(Ljava/lang/Object;)V

    const/4 v0, 0x1

    return v0

    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public final b(Lokhttp3/Request;)Lokhttp3/Request;
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/data/network/interceptor/j;->a:Lcom/sumsub/sns/internal/core/domain/k;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lcom/sumsub/sns/internal/core/domain/k;->a()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Ljava/lang/String;

    .line 9
    .line 10
    const-string v1, "TokenInterceptor"

    .line 11
    const/4 v2, 0x0

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 17
    move-result v0

    .line 18
    const/4 v3, 0x5

    .line 19
    .line 20
    if-lt v0, v3, :cond_1

    .line 21
    .line 22
    .line 23
    :try_start_0
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/core/data/network/interceptor/j;->a(Lokhttp3/Request;)Lokhttp3/Request;

    .line 24
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    return-object p1

    .line 26
    :catch_0
    move-exception p1

    .line 27
    .line 28
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    .line 29
    .line 30
    .line 31
    invoke-static {p0}, Lcom/sumsub/sns/internal/log/e;->a(Ljava/lang/Object;)Ljava/lang/String;

    .line 32
    move-result-object v0

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 36
    move-result-object v3

    .line 37
    .line 38
    if-nez v3, :cond_0

    .line 39
    .line 40
    const-string v3, ""

    .line 41
    .line 42
    :cond_0
    sget-object v4, Lcom/sumsub/sns/internal/log/c;->c:Lcom/sumsub/sns/internal/log/logger/k;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v4, v0, v3, p1}, Lcom/sumsub/sns/internal/log/logger/k;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 49
    move-result-object v0

    .line 50
    .line 51
    new-instance v3, Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 55
    .line 56
    const-string v4, "error adding header: "

    .line 57
    .line 58
    .line 59
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    move-result-object v0

    .line 67
    .line 68
    sget-object v3, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 69
    .line 70
    iget-object v3, v3, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v3, v1, v0, v2}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 74
    .line 75
    sget-object v0, Lcom/sumsub/sns/internal/core/common/F0;->a:Ljava/util/Map;

    .line 76
    .line 77
    new-instance v0, Lcom/sumsub/sns/core/data/model/SNSException$Unknown;

    .line 78
    .line 79
    .line 80
    invoke-direct {v0, p1}, Lcom/sumsub/sns/core/data/model/SNSException$Unknown;-><init>(Ljava/lang/Throwable;)V

    .line 81
    .line 82
    .line 83
    invoke-static {v0}, Lcom/sumsub/sns/internal/core/common/F0;->a(Lcom/sumsub/sns/core/data/model/SNSException;)V

    .line 84
    return-object v2

    .line 85
    .line 86
    :cond_1
    sget-object p1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 87
    .line 88
    iget-object p1, p1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 89
    .line 90
    const-string v0, "Invalid token, try to refresh"

    .line 91
    .line 92
    .line 93
    invoke-virtual {p1, v1, v0, v2}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 94
    return-object v2
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
.end method

.method public final c(Lokhttp3/Request;)Lokhttp3/Request;
    .locals 8

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/core/data/network/interceptor/j;->a()Z

    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    return-object v1

    .line 9
    .line 10
    .line 11
    :cond_0
    :try_start_0
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/core/data/network/interceptor/j;->a(Lokhttp3/Request;)Lokhttp3/Request;

    .line 12
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    return-object p1

    .line 14
    :catch_0
    move-exception v0

    .line 15
    move-object p1, v0

    .line 16
    .line 17
    sget-object v2, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    .line 18
    .line 19
    .line 20
    invoke-static {p0}, Lcom/sumsub/sns/internal/log/e;->a(Ljava/lang/Object;)Ljava/lang/String;

    .line 21
    move-result-object v3

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 25
    move-result-object v0

    .line 26
    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    const-string v0, ""

    .line 30
    :cond_1
    move-object v4, v0

    .line 31
    const/4 v6, 0x4

    .line 32
    const/4 v7, 0x0

    .line 33
    const/4 v5, 0x0

    .line 34
    .line 35
    .line 36
    invoke-static/range {v2 .. v7}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->e$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 40
    move-result-object p1

    .line 41
    .line 42
    new-instance v0, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 46
    .line 47
    const-string v2, "error adding header: "

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    move-result-object p1

    .line 58
    .line 59
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 60
    .line 61
    iget-object v0, v0, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 62
    .line 63
    const-string v2, "TokenInterceptor"

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, v2, p1, v1}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 67
    return-object v1
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

.method public final declared-synchronized intercept(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;
    .locals 9

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    .line 4
    :try_start_0
    invoke-interface {p1}, Lokhttp3/Interceptor$Chain;->request()Lokhttp3/Request;

    .line 5
    move-result-object v0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/core/data/network/interceptor/j;->b(Lokhttp3/Request;)Lokhttp3/Request;

    .line 9
    move-result-object v1

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object v0, v1

    .line 14
    .line 15
    .line 16
    :goto_0
    invoke-interface {p1, v0}, Lokhttp3/Interceptor$Chain;->proceed(Lokhttp3/Request;)Lokhttp3/Response;

    .line 17
    move-result-object v1

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, Lokhttp3/Response;->code()I

    .line 21
    move-result v2

    .line 22
    .line 23
    const/16 v3, 0x191

    .line 24
    const/4 v4, 0x0

    .line 25
    .line 26
    if-eq v2, v3, :cond_1

    .line 27
    .line 28
    iput v4, p0, Lcom/sumsub/sns/internal/core/data/network/interceptor/j;->d:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    monitor-exit p0

    .line 30
    return-object v1

    .line 31
    :catchall_0
    move-exception p1

    .line 32
    .line 33
    goto/16 :goto_7

    .line 34
    :cond_1
    const/4 v2, 0x0

    .line 35
    .line 36
    :try_start_1
    sget-object v5, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    .line 40
    move-result-object v5

    .line 41
    .line 42
    if-eqz v5, :cond_2

    .line 43
    .line 44
    .line 45
    invoke-virtual {v5}, Lokhttp3/ResponseBody;->string()Ljava/lang/String;

    .line 46
    move-result-object v5

    .line 47
    goto :goto_1

    .line 48
    :catchall_1
    move-exception v5

    .line 49
    goto :goto_2

    .line 50
    :cond_2
    move-object v5, v2

    .line 51
    .line 52
    :goto_1
    iget-object v6, p0, Lcom/sumsub/sns/internal/core/data/network/interceptor/j;->c:Lxg0/a;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v6}, Lxg0/a;->getSerializersModule()Lyg0/a;

    .line 56
    .line 57
    sget-object v7, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/o;->Companion:Lcom/sumsub/sns/internal/features/data/model/common/remote/response/n;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v7}, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/n;->serializer()Ltg0/d;

    .line 61
    move-result-object v7

    .line 62
    .line 63
    check-cast v7, Ltg0/c;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v6, v7, v5}, Lxg0/a;->a(Ltg0/c;Ljava/lang/String;)Ljava/lang/Object;

    .line 67
    move-result-object v5

    .line 68
    .line 69
    check-cast v5, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/o;

    .line 70
    .line 71
    .line 72
    invoke-static {v5}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    move-result-object v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 74
    goto :goto_3

    .line 75
    .line 76
    :goto_2
    :try_start_2
    sget-object v6, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 77
    .line 78
    .line 79
    invoke-static {v5}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 80
    move-result-object v5

    .line 81
    .line 82
    .line 83
    invoke-static {v5}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    move-result-object v5

    .line 85
    .line 86
    .line 87
    :goto_3
    invoke-static {v5}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    .line 88
    move-result v6

    .line 89
    .line 90
    if-eqz v6, :cond_4

    .line 91
    .line 92
    check-cast v5, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/o;

    .line 93
    .line 94
    iget-object v5, v5, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/o;->d:Ljava/lang/Integer;

    .line 95
    .line 96
    if-nez v5, :cond_3

    .line 97
    goto :goto_4

    .line 98
    .line 99
    .line 100
    :cond_3
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 101
    move-result v5

    .line 102
    .line 103
    const/16 v6, 0x28a2

    .line 104
    .line 105
    if-ne v5, v6, :cond_4

    .line 106
    .line 107
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 108
    .line 109
    iget-object v1, v1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 110
    .line 111
    const-string v3, "TokenInterceptor"

    .line 112
    .line 113
    const-string v5, "Skipping SumsubID 401 error..."

    .line 114
    .line 115
    .line 116
    invoke-virtual {v1, v3, v5, v2}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 117
    .line 118
    iput v4, p0, Lcom/sumsub/sns/internal/core/data/network/interceptor/j;->d:I

    .line 119
    .line 120
    .line 121
    invoke-interface {p1, v0}, Lokhttp3/Interceptor$Chain;->proceed(Lokhttp3/Request;)Lokhttp3/Response;

    .line 122
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 123
    monitor-exit p0

    .line 124
    return-object p1

    .line 125
    .line 126
    :cond_4
    :goto_4
    :try_start_3
    iget v5, p0, Lcom/sumsub/sns/internal/core/data/network/interceptor/j;->d:I

    .line 127
    .line 128
    .line 129
    invoke-virtual {v1}, Lokhttp3/Response;->headers()Lokhttp3/Headers;

    .line 130
    move-result-object v6

    .line 131
    .line 132
    new-instance v7, Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 136
    .line 137
    const-string v8, "Token is expired. Attempts("

    .line 138
    .line 139
    .line 140
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    const-string v5, "). Headers are "

    .line 146
    .line 147
    .line 148
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    const-string v5, ", try to refresh..."

    .line 154
    .line 155
    .line 156
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 160
    move-result-object v5

    .line 161
    .line 162
    sget-object v6, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 163
    .line 164
    iget-object v6, v6, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 165
    .line 166
    const-string v7, "TokenInterceptor"

    .line 167
    .line 168
    .line 169
    invoke-virtual {v6, v7, v5, v2}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 170
    .line 171
    .line 172
    :cond_5
    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/core/data/network/interceptor/j;->c(Lokhttp3/Request;)Lokhttp3/Request;

    .line 173
    move-result-object v2

    .line 174
    .line 175
    if-nez v2, :cond_6

    .line 176
    goto :goto_5

    .line 177
    :cond_6
    move-object v0, v2

    .line 178
    .line 179
    .line 180
    :goto_5
    invoke-virtual {v1}, Lokhttp3/Response;->close()V

    .line 181
    .line 182
    .line 183
    invoke-interface {p1, v0}, Lokhttp3/Interceptor$Chain;->proceed(Lokhttp3/Request;)Lokhttp3/Response;

    .line 184
    move-result-object v1

    .line 185
    .line 186
    .line 187
    invoke-virtual {v1}, Lokhttp3/Response;->code()I

    .line 188
    move-result v2

    .line 189
    const/4 v5, 0x3

    .line 190
    .line 191
    if-eq v2, v3, :cond_7

    .line 192
    .line 193
    iput v4, p0, Lcom/sumsub/sns/internal/core/data/network/interceptor/j;->d:I

    .line 194
    goto :goto_6

    .line 195
    .line 196
    :cond_7
    iget v2, p0, Lcom/sumsub/sns/internal/core/data/network/interceptor/j;->d:I

    .line 197
    .line 198
    add-int/lit8 v2, v2, 0x1

    .line 199
    .line 200
    iput v2, p0, Lcom/sumsub/sns/internal/core/data/network/interceptor/j;->d:I

    .line 201
    .line 202
    if-lt v2, v5, :cond_5

    .line 203
    .line 204
    :goto_6
    iget p1, p0, Lcom/sumsub/sns/internal/core/data/network/interceptor/j;->d:I

    .line 205
    .line 206
    if-lt p1, v5, :cond_8

    .line 207
    .line 208
    iput v4, p0, Lcom/sumsub/sns/internal/core/data/network/interceptor/j;->d:I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 209
    :cond_8
    monitor-exit p0

    .line 210
    return-object v1

    .line 211
    :goto_7
    :try_start_4
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 212
    throw p1
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
.end method
