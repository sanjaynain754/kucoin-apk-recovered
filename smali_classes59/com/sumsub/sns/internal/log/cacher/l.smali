.class public final Lcom/sumsub/sns/internal/log/cacher/l;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lcom/sumsub/sns/internal/log/cacher/b;
.implements Lcom/sumsub/sns/internal/log/cacher/c;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lcom/sumsub/sns/internal/log/cacher/a;

.field public final c:Lkotlin/jvm/functions/Function0;

.field public final d:Lkotlinx/coroutines/j0;

.field public final e:Lcom/sumsub/sns/internal/log/cacher/strategy/g;

.field public final f:Ljava/io/File;

.field public final g:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lcom/sumsub/sns/internal/log/cacher/a;Ljava/io/File;I)V
    .locals 8

    sget-object v0, Lcom/sumsub/sns/internal/log/cacher/strategy/c;->a:Lcom/sumsub/sns/internal/log/cacher/strategy/c;

    .line 9
    new-instance v4, Lcom/sumsub/sns/internal/log/cacher/m;

    invoke-direct {v4}, Lcom/sumsub/sns/internal/log/cacher/m;-><init>()V

    .line 10
    invoke-static {}, Lkotlinx/coroutines/z0;->b()Lkotlinx/coroutines/j0;

    move-result-object v5

    and-int/lit8 p4, p4, 0x10

    if-eqz p4, :cond_0

    .line 11
    sget-object v0, Lcom/sumsub/sns/internal/log/cacher/strategy/f;->a:Lcom/sumsub/sns/internal/log/cacher/strategy/f;

    :cond_0
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v7, p3

    move-object v6, v0

    .line 12
    invoke-direct/range {v1 .. v7}, Lcom/sumsub/sns/internal/log/cacher/l;-><init>(Ljava/lang/String;Lcom/sumsub/sns/internal/log/cacher/a;Lkotlin/jvm/functions/Function0;Lkotlinx/coroutines/j0;Lcom/sumsub/sns/internal/log/cacher/strategy/g;Ljava/io/File;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/sumsub/sns/internal/log/cacher/a;Lkotlin/jvm/functions/Function0;Lkotlinx/coroutines/j0;Lcom/sumsub/sns/internal/log/cacher/strategy/g;Ljava/io/File;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/internal/log/cacher/l;->a:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lcom/sumsub/sns/internal/log/cacher/l;->b:Lcom/sumsub/sns/internal/log/cacher/a;

    .line 4
    iput-object p3, p0, Lcom/sumsub/sns/internal/log/cacher/l;->c:Lkotlin/jvm/functions/Function0;

    .line 5
    iput-object p4, p0, Lcom/sumsub/sns/internal/log/cacher/l;->d:Lkotlinx/coroutines/j0;

    .line 6
    iput-object p5, p0, Lcom/sumsub/sns/internal/log/cacher/l;->e:Lcom/sumsub/sns/internal/log/cacher/strategy/g;

    .line 7
    iput-object p6, p0, Lcom/sumsub/sns/internal/log/cacher/l;->f:Ljava/io/File;

    .line 8
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "SinkWrapper_"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/sumsub/sns/internal/log/cacher/l;->g:Ljava/lang/String;

    return-void
.end method

.method public static final a(Lcom/sumsub/sns/internal/log/cacher/l;Ljava/lang/Object;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p2, Lcom/sumsub/sns/internal/log/cacher/f;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/sumsub/sns/internal/log/cacher/f;

    iget v1, v0, Lcom/sumsub/sns/internal/log/cacher/f;->e:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/log/cacher/f;->e:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/log/cacher/f;

    invoke-direct {v0, p0, p2}, Lcom/sumsub/sns/internal/log/cacher/f;-><init>(Lcom/sumsub/sns/internal/log/cacher/l;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p2, v0, Lcom/sumsub/sns/internal/log/cacher/f;->c:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 2
    iget v2, v0, Lcom/sumsub/sns/internal/log/cacher/f;->e:I

    const/4 v3, 0x1

    const-string v4, "Can\'t cache value"

    const/4 v5, 0x0

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/sumsub/sns/internal/log/cacher/f;->b:Ljava/io/ByteArrayOutputStream;

    iget-object v0, v0, Lcom/sumsub/sns/internal/log/cacher/f;->a:Ljava/io/ByteArrayOutputStream;

    :try_start_0
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 3
    :try_start_1
    new-instance p2, Ljava/io/ByteArrayOutputStream;

    invoke-direct {p2}, Ljava/io/ByteArrayOutputStream;-><init>()V
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 4
    :try_start_2
    iget-object v2, p0, Lcom/sumsub/sns/internal/log/cacher/l;->b:Lcom/sumsub/sns/internal/log/cacher/a;

    iput-object p2, v0, Lcom/sumsub/sns/internal/log/cacher/f;->a:Ljava/io/ByteArrayOutputStream;

    iput-object p2, v0, Lcom/sumsub/sns/internal/log/cacher/f;->b:Ljava/io/ByteArrayOutputStream;

    iput v3, v0, Lcom/sumsub/sns/internal/log/cacher/f;->e:I

    invoke-interface {v2, p1, p2, v0}, Lcom/sumsub/sns/internal/log/cacher/a;->a(Ljava/lang/Object;Ljava/io/ByteArrayOutputStream;Lcom/sumsub/sns/internal/log/cacher/f;)Ljava/lang/Object;

    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    move-object p1, p2

    move-object v0, p1

    .line 5
    :goto_1
    :try_start_3
    invoke-virtual {p1}, Ljava/io/OutputStream;->flush()V

    .line 6
    invoke-virtual {p1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 7
    :try_start_4
    invoke-static {v0, v5}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 8
    new-instance p2, Ljava/io/File;

    .line 9
    iget-object v0, p0, Lcom/sumsub/sns/internal/log/cacher/l;->a:Ljava/lang/String;

    .line 10
    new-instance v1, Ljava/io/File;

    iget-object v2, p0, Lcom/sumsub/sns/internal/log/cacher/l;->f:Ljava/io/File;

    invoke-direct {v1, v2, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    .line 11
    iget-object v0, p0, Lcom/sumsub/sns/internal/log/cacher/l;->c:Lkotlin/jvm/functions/Function0;

    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-direct {p2, v1, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 12
    new-instance v0, Lcom/sumsub/sns/internal/log/utils/a;

    invoke-direct {v0, p2}, Lcom/sumsub/sns/internal/log/utils/a;-><init>(Ljava/io/File;)V

    invoke-virtual {v0, p1}, Lcom/sumsub/sns/internal/log/utils/a;->a([B)V
    :try_end_4
    .catch Ljava/io/FileNotFoundException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    return-object p2

    :catch_0
    move-exception p1

    goto :goto_3

    :catch_1
    move-exception p1

    goto :goto_4

    :catch_2
    move-exception p1

    goto :goto_5

    :catchall_1
    move-exception p1

    move-object v0, p2

    .line 13
    :goto_2
    :try_start_5
    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :catchall_2
    move-exception p2

    :try_start_6
    invoke-static {v0, p1}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw p2
    :try_end_6
    .catch Ljava/io/FileNotFoundException; {:try_start_6 .. :try_end_6} :catch_2
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_1
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    .line 14
    :goto_3
    sget-object p2, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    iget-object p0, p0, Lcom/sumsub/sns/internal/log/cacher/l;->g:Ljava/lang/String;

    .line 15
    sget-object p2, Lcom/sumsub/sns/internal/log/c;->c:Lcom/sumsub/sns/internal/log/logger/k;

    invoke-virtual {p2, p0, v4, p1}, Lcom/sumsub/sns/internal/log/logger/k;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_6

    .line 16
    :goto_4
    sget-object p2, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    iget-object p0, p0, Lcom/sumsub/sns/internal/log/cacher/l;->g:Ljava/lang/String;

    invoke-static {p0, v4, p1}, Lcom/sumsub/sns/internal/log/d;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_6

    .line 17
    :goto_5
    sget-object p2, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    iget-object p0, p0, Lcom/sumsub/sns/internal/log/cacher/l;->g:Ljava/lang/String;

    invoke-static {p0, v4, p1}, Lcom/sumsub/sns/internal/log/d;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_6
    return-object v5
.end method

.method public static final a()Ljava/lang/String;
    .locals 1

    .line 18
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final a(Ljava/io/File;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 11

    instance-of v0, p2, Lcom/sumsub/sns/internal/log/cacher/k;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/sumsub/sns/internal/log/cacher/k;

    iget v1, v0, Lcom/sumsub/sns/internal/log/cacher/k;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/log/cacher/k;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/log/cacher/k;

    invoke-direct {v0, p0, p2}, Lcom/sumsub/sns/internal/log/cacher/k;-><init>(Lcom/sumsub/sns/internal/log/cacher/l;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p2, v0, Lcom/sumsub/sns/internal/log/cacher/k;->b:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 19
    iget v2, v0, Lcom/sumsub/sns/internal/log/cacher/k;->d:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/sumsub/sns/internal/log/cacher/k;->a:Ljava/io/File;

    :try_start_0
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    move-object p2, v0

    goto/16 :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 20
    :try_start_1
    new-instance p2, Lcom/sumsub/sns/internal/log/utils/a;

    invoke-direct {p2, p1}, Lcom/sumsub/sns/internal/log/utils/a;-><init>(Ljava/io/File;)V

    invoke-virtual {p2}, Lcom/sumsub/sns/internal/log/utils/a;->a()[B

    move-result-object p2

    if-nez p2, :cond_3

    .line 21
    sget-object p2, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    iget-object p2, p0, Lcom/sumsub/sns/internal/log/cacher/l;->g:Ljava/lang/String;

    const-string v0, "Can\'t restore cache value"

    sget-object v1, Lcom/sumsub/sns/internal/log/d;->a:Ljava/util/Map;

    .line 22
    sget-object v1, Lcom/sumsub/sns/internal/log/LoggerType;->KIBANA:Lcom/sumsub/sns/internal/log/LoggerType;

    filled-new-array {v1}, [Lcom/sumsub/sns/internal/log/LoggerType;

    move-result-object v1

    .line 23
    invoke-static {v1}, Lkotlin/collections/ArraysKt;->toList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lcom/sumsub/sns/internal/log/c;->b(Ljava/util/List;)Lcom/sumsub/sns/internal/log/logger/b;

    move-result-object v1

    .line 24
    invoke-virtual {v1, p2, v0, v4}, Lcom/sumsub/sns/internal/log/logger/b;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 25
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    .line 26
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    .line 27
    :cond_3
    iget-object v2, p0, Lcom/sumsub/sns/internal/log/cacher/l;->b:Lcom/sumsub/sns/internal/log/cacher/a;

    new-instance v5, Ljava/io/ByteArrayInputStream;

    invoke-direct {v5, p2}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    iput-object p1, v0, Lcom/sumsub/sns/internal/log/cacher/k;->a:Ljava/io/File;

    iput v3, v0, Lcom/sumsub/sns/internal/log/cacher/k;->d:I

    invoke-interface {v2, v5, v0}, Lcom/sumsub/sns/internal/log/cacher/a;->a(Ljava/io/ByteArrayInputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    return-object v1

    :cond_4
    :goto_1
    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    const-string v0, "File "

    if-eqz p2, :cond_5

    .line 28
    :try_start_2
    sget-object v5, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    iget-object v6, p0, Lcom/sumsub/sns/internal/log/cacher/l;->g:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object p2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " is processed. Deleting..."

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    const/4 v9, 0x4

    const/4 v10, 0x0

    const/4 v8, 0x0

    invoke-static/range {v5 .. v10}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->i$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 29
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    move-result p2

    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    goto :goto_4

    .line 30
    :cond_5
    sget-object v5, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    iget-object v6, p0, Lcom/sumsub/sns/internal/log/cacher/l;->g:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object p2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " is not sent. Keep it."

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    const/4 v9, 0x4

    const/4 v10, 0x0

    const/4 v8, 0x0

    invoke-static/range {v5 .. v10}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->i$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_4

    .line 31
    :goto_2
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    .line 32
    invoke-static {p2}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_6

    goto :goto_3

    :cond_6
    move-object v0, v4

    :goto_3
    if-nez v0, :cond_7

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 33
    :cond_7
    sget-object p2, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    .line 34
    iget-object p2, p0, Lcom/sumsub/sns/internal/log/cacher/l;->g:Ljava/lang/String;

    .line 35
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Exception while processing "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ": "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 36
    invoke-static {p2, p1, v4}, Lcom/sumsub/sns/internal/log/d;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 37
    :goto_4
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 10

    .line 1
    .line 2
    instance-of v0, p2, Lcom/sumsub/sns/internal/log/cacher/h;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p2

    .line 6
    .line 7
    check-cast v0, Lcom/sumsub/sns/internal/log/cacher/h;

    .line 8
    .line 9
    iget v1, v0, Lcom/sumsub/sns/internal/log/cacher/h;->c:I

    .line 10
    .line 11
    const/high16 v2, -0x80000000

    .line 12
    .line 13
    and-int v3, v1, v2

    .line 14
    .line 15
    if-eqz v3, :cond_0

    .line 16
    sub-int/2addr v1, v2

    .line 17
    .line 18
    iput v1, v0, Lcom/sumsub/sns/internal/log/cacher/h;->c:I

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/log/cacher/h;

    .line 22
    .line 23
    check-cast p2, Lkotlin/coroutines/jvm/internal/ContinuationImpl;

    .line 24
    .line 25
    .line 26
    invoke-direct {v0, p0, p2}, Lcom/sumsub/sns/internal/log/cacher/h;-><init>(Lcom/sumsub/sns/internal/log/cacher/l;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    .line 27
    .line 28
    :goto_0
    iget-object p2, v0, Lcom/sumsub/sns/internal/log/cacher/h;->a:Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 32
    move-result-object v1

    .line 33
    .line 34
    iget v2, v0, Lcom/sumsub/sns/internal/log/cacher/h;->c:I

    .line 35
    const/4 v3, 0x1

    .line 36
    .line 37
    if-eqz v2, :cond_2

    .line 38
    .line 39
    if-ne v2, v3, :cond_1

    .line 40
    .line 41
    .line 42
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 43
    goto :goto_1

    .line 44
    .line 45
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 46
    .line 47
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    .line 50
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 51
    throw p1

    .line 52
    .line 53
    .line 54
    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 55
    .line 56
    sget-object p2, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    .line 57
    .line 58
    sget-object p2, Lcom/sumsub/sns/internal/log/LoggerType;->LOG_CAT:Lcom/sumsub/sns/internal/log/LoggerType;

    .line 59
    .line 60
    .line 61
    filled-new-array {p2}, [Lcom/sumsub/sns/internal/log/LoggerType;

    .line 62
    move-result-object p2

    .line 63
    .line 64
    .line 65
    invoke-static {p2}, Lkotlin/collections/ArraysKt;->toList([Ljava/lang/Object;)Ljava/util/List;

    .line 66
    move-result-object p2

    .line 67
    .line 68
    .line 69
    invoke-static {p2}, Lcom/sumsub/sns/internal/log/c;->b(Ljava/util/List;)Lcom/sumsub/sns/internal/log/logger/b;

    .line 70
    move-result-object v4

    .line 71
    .line 72
    iget-object v5, p0, Lcom/sumsub/sns/internal/log/cacher/l;->g:Ljava/lang/String;

    .line 73
    const/4 v8, 0x4

    .line 74
    const/4 v9, 0x0

    .line 75
    .line 76
    .line 77
    const-string/jumbo v6, "sending ..."

    .line 78
    const/4 v7, 0x0

    .line 79
    .line 80
    .line 81
    invoke-static/range {v4 .. v9}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->v$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 82
    .line 83
    iget-object p2, p0, Lcom/sumsub/sns/internal/log/cacher/l;->e:Lcom/sumsub/sns/internal/log/cacher/strategy/g;

    .line 84
    .line 85
    iget-object v2, p0, Lcom/sumsub/sns/internal/log/cacher/l;->g:Ljava/lang/String;

    .line 86
    .line 87
    new-instance v4, Lcom/sumsub/sns/internal/log/cacher/i;

    .line 88
    const/4 v5, 0x0

    .line 89
    .line 90
    .line 91
    invoke-direct {v4, p0, p1, v5}, Lcom/sumsub/sns/internal/log/cacher/i;-><init>(Lcom/sumsub/sns/internal/log/cacher/l;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)V

    .line 92
    .line 93
    new-instance v6, Lcom/sumsub/sns/internal/log/cacher/j;

    .line 94
    .line 95
    .line 96
    invoke-direct {v6, p0, p1, v5}, Lcom/sumsub/sns/internal/log/cacher/j;-><init>(Lcom/sumsub/sns/internal/log/cacher/l;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)V

    .line 97
    .line 98
    iput v3, v0, Lcom/sumsub/sns/internal/log/cacher/h;->c:I

    .line 99
    .line 100
    .line 101
    invoke-interface {p2, v2, v4, v6, v0}, Lcom/sumsub/sns/internal/log/cacher/strategy/g;->a(Ljava/lang/String;Lcom/sumsub/sns/internal/log/cacher/i;Lcom/sumsub/sns/internal/log/cacher/j;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 102
    move-result-object p1

    .line 103
    .line 104
    if-ne p1, v1, :cond_3

    .line 105
    return-object v1

    .line 106
    .line 107
    .line 108
    :cond_3
    :goto_1
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 109
    move-result-object p1

    .line 110
    return-object p1
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
.end method
