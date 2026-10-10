.class public final Lcom/sumsub/sns/internal/core/analytics/q;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lcom/sumsub/sns/internal/log/cacher/a;


# instance fields
.field public final a:Lcom/sumsub/sns/internal/features/data/repository/analytics/b;

.field public final b:Lxg0/a;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/data/repository/analytics/b;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/sumsub/sns/internal/core/analytics/q;->a:Lcom/sumsub/sns/internal/features/data/repository/analytics/b;

    .line 6
    .line 7
    sget-boolean p1, Lcom/sumsub/sns/internal/core/common/k0;->f:Z

    .line 8
    .line 9
    .line 10
    invoke-static {p1}, Lcom/sumsub/sns/internal/core/common/J;->a(Z)Lxg0/a;

    .line 11
    move-result-object p1

    .line 12
    .line 13
    iput-object p1, p0, Lcom/sumsub/sns/internal/core/analytics/q;->b:Lxg0/a;

    .line 14
    return-void
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

.method public static a()[B
    .locals 3

    .line 1
    sget-boolean v0, Lcom/sumsub/sns/internal/core/common/P0;->a:Z

    if-eqz v0, :cond_3

    .line 2
    sget-object v0, Lcom/sumsub/sns/internal/core/common/P0;->c:Lcom/sumsub/sns/internal/core/common/SNSSession;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move-object v0, v1

    .line 3
    :cond_0
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/core/common/SNSSession;->getSessionId()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 4
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-nez v2, :cond_1

    goto :goto_0

    .line 5
    :cond_1
    sget-object v1, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/ArraysKt;->reversedArray([B)[B

    move-result-object v0

    return-object v0

    .line 6
    :cond_2
    :goto_0
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    .line 7
    const-string v0, "RealAnalyticsRepository"

    const-string v2, "Got empty session id"

    invoke-static {v0, v2, v1}, Lcom/sumsub/sns/internal/log/d;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v1

    .line 8
    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Failed requirement."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final a(Ljava/io/ByteArrayInputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 18

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    instance-of v2, v0, Lcom/sumsub/sns/internal/core/analytics/o;

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Lcom/sumsub/sns/internal/core/analytics/o;

    iget v3, v2, Lcom/sumsub/sns/internal/core/analytics/o;->d:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lcom/sumsub/sns/internal/core/analytics/o;->d:I

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/sumsub/sns/internal/core/analytics/o;

    check-cast v0, Lkotlin/coroutines/jvm/internal/ContinuationImpl;

    invoke-direct {v2, v1, v0}, Lcom/sumsub/sns/internal/core/analytics/o;-><init>(Lcom/sumsub/sns/internal/core/analytics/q;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object v0, v2, Lcom/sumsub/sns/internal/core/analytics/o;->b:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v3

    .line 27
    iget v4, v2, Lcom/sumsub/sns/internal/core/analytics/o;->d:I

    const-string/jumbo v5, "resendFromCache failed "

    const/4 v6, 0x0

    const-string v7, "RealAnalyticsRepository"

    const/4 v8, 0x1

    const/4 v9, 0x0

    if-eqz v4, :cond_2

    if-ne v4, v8, :cond_1

    iget-object v2, v2, Lcom/sumsub/sns/internal/core/analytics/o;->a:Ljava/io/InputStreamReader;

    :try_start_0
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/sumsub/sns/core/data/model/SNSException$Api; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v0

    move-object v4, v2

    :goto_1
    move-object v2, v0

    goto/16 :goto_b

    :catch_0
    move-exception v0

    goto/16 :goto_3

    :catch_1
    move-exception v0

    goto/16 :goto_4

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 28
    new-instance v4, Ljava/io/InputStreamReader;

    move-object/from16 v0, p1

    invoke-direct {v4, v0}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    .line 29
    :try_start_1
    iget-object v0, v1, Lcom/sumsub/sns/internal/core/analytics/q;->b:Lxg0/a;

    invoke-static {v4}, Lkotlin/io/TextStreamsKt;->readText(Ljava/io/Reader;)Ljava/lang/String;

    move-result-object v10

    .line 30
    invoke-virtual {v0}, Lxg0/a;->getSerializersModule()Lyg0/a;

    sget-object v11, Lcom/sumsub/sns/internal/core/analytics/m;->Companion:Lcom/sumsub/sns/internal/core/analytics/l;

    invoke-virtual {v11}, Lcom/sumsub/sns/internal/core/analytics/l;->serializer()Ltg0/d;

    move-result-object v11

    check-cast v11, Ltg0/c;

    invoke-virtual {v0, v11, v10}, Lxg0/a;->a(Ltg0/c;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sumsub/sns/internal/core/analytics/m;
    :try_end_1
    .catch Lkotlinx/serialization/SerializationException; {:try_start_1 .. :try_end_1} :catch_5
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_4
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 31
    :try_start_2
    iget-object v10, v0, Lcom/sumsub/sns/internal/core/analytics/m;->a:Ljava/lang/String;

    .line 32
    iget-object v12, v0, Lcom/sumsub/sns/internal/core/analytics/m;->b:[B

    .line 33
    sget-object v11, Lokhttp3/RequestBody;->Companion:Lokhttp3/RequestBody$Companion;

    sget-object v0, Lokhttp3/MediaType;->Companion:Lokhttp3/MediaType$Companion;

    const-string v13, "application/octet-stream"

    invoke-virtual {v0, v13}, Lokhttp3/MediaType$Companion;->get(Ljava/lang/String;)Lokhttp3/MediaType;

    move-result-object v13

    const/16 v16, 0x6

    const/16 v17, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v11 .. v17}, Lokhttp3/RequestBody$Companion;->create$default(Lokhttp3/RequestBody$Companion;[BLokhttp3/MediaType;IIILjava/lang/Object;)Lokhttp3/RequestBody;

    move-result-object v0

    .line 34
    iget-object v11, v1, Lcom/sumsub/sns/internal/core/analytics/q;->a:Lcom/sumsub/sns/internal/features/data/repository/analytics/b;

    iput-object v4, v2, Lcom/sumsub/sns/internal/core/analytics/o;->a:Ljava/io/InputStreamReader;

    iput v8, v2, Lcom/sumsub/sns/internal/core/analytics/o;->d:I

    invoke-interface {v11, v10, v0, v2}, Lcom/sumsub/sns/internal/features/data/repository/analytics/b;->a(Ljava/lang/String;Lokhttp3/RequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0
    :try_end_2
    .catch Lcom/sumsub/sns/core/data/model/SNSException$Api; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-ne v0, v3, :cond_3

    return-object v3

    :cond_3
    move-object v2, v4

    :goto_2
    :try_start_3
    check-cast v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/I;

    .line 35
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/I;->a:Ljava/lang/Integer;

    if-nez v0, :cond_4

    goto :goto_8

    .line 36
    :cond_4
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0
    :try_end_3
    .catch Lcom/sumsub/sns/core/data/model/SNSException$Api; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-ne v0, v8, :cond_8

    goto :goto_7

    :catchall_1
    move-exception v0

    goto :goto_1

    :catch_2
    move-exception v0

    move-object v2, v4

    goto :goto_3

    :catch_3
    move-exception v0

    move-object v2, v4

    goto :goto_4

    .line 37
    :goto_3
    :try_start_4
    sget-object v3, Lcom/sumsub/sns/internal/log/c;->c:Lcom/sumsub/sns/internal/log/logger/k;

    invoke-virtual {v3, v7, v5, v0}, Lcom/sumsub/sns/internal/log/logger/k;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_8

    .line 38
    :goto_4
    invoke-virtual {v0}, Lcom/sumsub/sns/core/data/model/SNSException$Api;->getCode()Ljava/lang/Integer;

    move-result-object v3

    if-eqz v3, :cond_5

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    goto :goto_5

    :cond_5
    move v3, v6

    :goto_5
    const/16 v4, 0x190

    if-lt v3, v4, :cond_7

    invoke-virtual {v0}, Lcom/sumsub/sns/core/data/model/SNSException$Api;->getCode()Ljava/lang/Integer;

    move-result-object v3

    if-eqz v3, :cond_6

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    goto :goto_6

    :cond_6
    move v3, v6

    :goto_6
    const/16 v4, 0x1f3

    if-gt v3, v4, :cond_7

    .line 39
    sget-object v10, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    const-string v11, "RealAnalyticsRepository"

    const-string v12, "Unauthorized, drop packet"

    const/4 v14, 0x4

    const/4 v15, 0x0

    const/4 v13, 0x0

    invoke-static/range {v10 .. v15}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->i$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    :goto_7
    move v6, v8

    goto :goto_8

    .line 40
    :cond_7
    sget-object v3, Lcom/sumsub/sns/internal/log/c;->c:Lcom/sumsub/sns/internal/log/logger/k;

    invoke-virtual {v3, v7, v5, v0}, Lcom/sumsub/sns/internal/log/logger/k;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 41
    :cond_8
    :goto_8
    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 42
    invoke-static {v2, v9}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    return-object v0

    :catch_4
    move-exception v0

    goto :goto_9

    :catch_5
    move-exception v0

    goto :goto_a

    .line 43
    :goto_9
    :try_start_5
    const-string/jumbo v2, "resendFromCache parsing cache failed"

    .line 44
    sget-object v3, Lcom/sumsub/sns/internal/log/c;->c:Lcom/sumsub/sns/internal/log/logger/k;

    invoke-virtual {v3, v7, v2, v0}, Lcom/sumsub/sns/internal/log/logger/k;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 45
    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    invoke-static {v4, v9}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    return-object v0

    .line 46
    :goto_a
    :try_start_6
    const-string/jumbo v2, "resendFromCache: parsing cache failed. This data won\'t be sent"

    .line 47
    sget-object v3, Lcom/sumsub/sns/internal/log/c;->c:Lcom/sumsub/sns/internal/log/logger/k;

    invoke-virtual {v3, v7, v2, v0}, Lcom/sumsub/sns/internal/log/logger/k;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 48
    sget-object v2, Lcom/sumsub/sns/internal/log/LoggerType;->KIBANA:Lcom/sumsub/sns/internal/log/LoggerType;

    filled-new-array {v2}, [Lcom/sumsub/sns/internal/log/LoggerType;

    move-result-object v2

    .line 49
    invoke-static {v2}, Lkotlin/collections/ArraysKt;->toList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Lcom/sumsub/sns/internal/log/c;->b(Ljava/util/List;)Lcom/sumsub/sns/internal/log/logger/b;

    move-result-object v2

    .line 50
    const-string/jumbo v3, "resendFromCache parsing cache failed. This data won\'t be sent"

    invoke-virtual {v2, v7, v3, v0}, Lcom/sumsub/sns/internal/log/logger/b;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 51
    invoke-static {v8}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    invoke-static {v4, v9}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    return-object v0

    .line 52
    :goto_b
    :try_start_7
    throw v2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    :catchall_2
    move-exception v0

    invoke-static {v4, v2}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final a(Ljava/lang/Object;Ljava/io/ByteArrayOutputStream;Lcom/sumsub/sns/internal/log/cacher/f;)Ljava/lang/Object;
    .locals 3

    .line 9
    check-cast p1, Ljava/util/List;

    .line 10
    invoke-static {}, Lkotlinx/coroutines/z0;->b()Lkotlinx/coroutines/j0;

    move-result-object v0

    new-instance v1, Lcom/sumsub/sns/internal/core/analytics/n;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, p2, v2}, Lcom/sumsub/sns/internal/core/analytics/n;-><init>(Lcom/sumsub/sns/internal/core/analytics/q;Ljava/util/List;Ljava/io/ByteArrayOutputStream;Lkotlin/coroutines/Continuation;)V

    invoke-static {v0, v1, p3}, Lkotlinx/coroutines/h;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final a(Ljava/util/List;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 12

    instance-of v0, p2, Lcom/sumsub/sns/internal/core/analytics/p;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/sumsub/sns/internal/core/analytics/p;

    iget v1, v0, Lcom/sumsub/sns/internal/core/analytics/p;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/core/analytics/p;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/core/analytics/p;

    invoke-direct {v0, p0, p2}, Lcom/sumsub/sns/internal/core/analytics/p;-><init>(Lcom/sumsub/sns/internal/core/analytics/q;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p2, v0, Lcom/sumsub/sns/internal/core/analytics/p;->a:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 11
    iget v2, v0, Lcom/sumsub/sns/internal/core/analytics/p;->c:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    :try_start_0
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 12
    sget-boolean p2, Lcom/sumsub/sns/internal/core/common/P0;->a:Z

    if-eqz p2, :cond_8

    .line 13
    sget-object p2, Lcom/sumsub/sns/internal/core/common/P0;->c:Lcom/sumsub/sns/internal/core/common/SNSSession;

    if-nez p2, :cond_3

    const/4 p2, 0x0

    .line 14
    :cond_3
    invoke-virtual {p2}, Lcom/sumsub/sns/internal/core/common/SNSSession;->getSessionId()Ljava/lang/String;

    move-result-object p2

    .line 15
    invoke-static {}, Lcom/sumsub/sns/internal/core/analytics/q;->a()[B

    move-result-object v2

    if-nez v2, :cond_4

    .line 16
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    .line 17
    :cond_4
    :try_start_1
    iget-object v5, p0, Lcom/sumsub/sns/internal/core/analytics/q;->b:Lxg0/a;

    .line 18
    invoke-interface {v5}, Ltg0/n;->getSerializersModule()Lyg0/a;

    new-instance v6, Lkotlinx/serialization/internal/f;

    sget-object v7, Lcom/sumsub/sns/core/data/model/SNSTrackEvents;->Companion:Lcom/sumsub/sns/core/data/model/SNSTrackEvents$Companion;

    invoke-virtual {v7}, Lcom/sumsub/sns/core/data/model/SNSTrackEvents$Companion;->serializer()Ltg0/d;

    move-result-object v7

    invoke-direct {v6, v7}, Lkotlinx/serialization/internal/f;-><init>(Ltg0/d;)V

    invoke-interface {v5, v6, p1}, Ltg0/c0;->b(Ltg0/p;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 19
    sget-object v5, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v5}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    invoke-static {p1, v2}, Lcom/sumsub/sns/internal/core/common/j;->a([B[B)[B

    move-result-object v6

    .line 20
    sget-object v5, Lokhttp3/RequestBody;->Companion:Lokhttp3/RequestBody$Companion;

    sget-object p1, Lokhttp3/MediaType;->Companion:Lokhttp3/MediaType$Companion;

    const-string v2, "application/octet-stream"

    invoke-virtual {p1, v2}, Lokhttp3/MediaType$Companion;->get(Ljava/lang/String;)Lokhttp3/MediaType;

    move-result-object v7

    const/4 v10, 0x6

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v5 .. v11}, Lokhttp3/RequestBody$Companion;->create$default(Lokhttp3/RequestBody$Companion;[BLokhttp3/MediaType;IIILjava/lang/Object;)Lokhttp3/RequestBody;

    move-result-object p1

    .line 21
    iget-object v2, p0, Lcom/sumsub/sns/internal/core/analytics/q;->a:Lcom/sumsub/sns/internal/features/data/repository/analytics/b;

    iput v4, v0, Lcom/sumsub/sns/internal/core/analytics/p;->c:I

    invoke-interface {v2, p2, p1, v0}, Lcom/sumsub/sns/internal/features/data/repository/analytics/b;->a(Ljava/lang/String;Lokhttp3/RequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_5

    return-object v1

    :cond_5
    :goto_1
    check-cast p2, Lcom/sumsub/sns/internal/features/data/model/common/remote/I;

    .line 22
    iget-object p1, p2, Lcom/sumsub/sns/internal/features/data/model/common/remote/I;->a:Ljava/lang/Integer;

    if-nez p1, :cond_6

    goto :goto_3

    .line 23
    :cond_6
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ne p1, v4, :cond_7

    move v3, v4

    goto :goto_3

    .line 24
    :goto_2
    sget-object p2, Lcom/sumsub/sns/internal/log/c;->c:Lcom/sumsub/sns/internal/log/logger/k;

    const-string v0, "RealAnalyticsRepository"

    const-string/jumbo v1, "send failed "

    invoke-virtual {p2, v0, v1, p1}, Lcom/sumsub/sns/internal/log/logger/k;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 25
    :cond_7
    :goto_3
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    .line 26
    :cond_8
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Failed requirement."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final bridge synthetic send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    check-cast p1, Ljava/util/List;

    .line 3
    .line 4
    check-cast p2, Lkotlin/coroutines/jvm/internal/ContinuationImpl;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1, p2}, Lcom/sumsub/sns/internal/core/analytics/q;->a(Ljava/util/List;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 8
    move-result-object p1

    .line 9
    return-object p1
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
.end method
