.class public final Lcom/sumsub/sns/internal/features/data/repository/applicant/J;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lcom/sumsub/sns/internal/features/data/repository/applicant/a;


# instance fields
.field public final a:Lcom/sumsub/sns/internal/features/data/repository/applicant/K;

.field public final b:Lcom/sumsub/sns/internal/features/data/repository/applicant/b;

.field public final c:Lxg0/a;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/data/repository/applicant/K;Lcom/sumsub/sns/internal/features/data/repository/applicant/b;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/data/repository/applicant/J;->a:Lcom/sumsub/sns/internal/features/data/repository/applicant/K;

    .line 6
    .line 7
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/data/repository/applicant/J;->b:Lcom/sumsub/sns/internal/features/data/repository/applicant/b;

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
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/data/repository/applicant/J;->c:Lxg0/a;

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
.method public final a(ILkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p2, Lcom/sumsub/sns/internal/features/data/repository/applicant/B;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/B;

    iget v1, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/B;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/B;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/B;

    invoke-direct {v0, p0, p2}, Lcom/sumsub/sns/internal/features/data/repository/applicant/B;-><init>(Lcom/sumsub/sns/internal/features/data/repository/applicant/J;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p2, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/B;->a:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 42
    iget v2, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/B;->c:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 43
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/data/repository/applicant/J;->b:Lcom/sumsub/sns/internal/features/data/repository/applicant/b;

    iput v3, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/B;->c:I

    invoke-interface {p2, p1, v0}, Lcom/sumsub/sns/internal/features/data/repository/applicant/b;->a(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    .line 44
    :cond_3
    :goto_1
    check-cast p2, Lretrofit2/Response;

    .line 45
    invoke-virtual {p2}, Lretrofit2/Response;->isSuccessful()Z

    move-result p1

    const-string v0, "Error downloading file"

    if-eqz p1, :cond_6

    .line 46
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lokhttp3/ResponseBody;

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lokhttp3/ResponseBody;->byteStream()Ljava/io/InputStream;

    move-result-object p1

    if-eqz p1, :cond_5

    .line 47
    new-instance p2, Ljava/io/ByteArrayOutputStream;

    invoke-direct {p2}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 48
    invoke-static {p1, p2}, Lcom/sumsub/sns/internal/core/common/L0;->a(Ljava/io/InputStream;Ljava/io/OutputStream;)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 49
    invoke-virtual {p2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p1

    return-object p1

    .line 50
    :cond_4
    new-instance p1, Ljava/io/IOException;

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 51
    :cond_5
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Error getting byte stream"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 52
    :cond_6
    new-instance p1, Ljava/io/IOException;

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final a(Ljava/lang/String;Ljava/io/File;Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;Ljava/util/Map;Lcom/sumsub/sns/internal/features/data/model/common/X;Lcom/sumsub/sns/internal/features/data/utils/a;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p6

    move-object/from16 v2, p8

    instance-of v3, v2, Lcom/sumsub/sns/internal/features/data/repository/applicant/H;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lcom/sumsub/sns/internal/features/data/repository/applicant/H;

    iget v4, v3, Lcom/sumsub/sns/internal/features/data/repository/applicant/H;->c:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lcom/sumsub/sns/internal/features/data/repository/applicant/H;->c:I

    :goto_0
    move-object v9, v3

    goto :goto_1

    :cond_0
    new-instance v3, Lcom/sumsub/sns/internal/features/data/repository/applicant/H;

    invoke-direct {v3, v0, v2}, Lcom/sumsub/sns/internal/features/data/repository/applicant/H;-><init>(Lcom/sumsub/sns/internal/features/data/repository/applicant/J;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    goto :goto_0

    :goto_1
    iget-object v2, v9, Lcom/sumsub/sns/internal/features/data/repository/applicant/H;->a:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v3

    .line 20
    iget v4, v9, Lcom/sumsub/sns/internal/features/data/repository/applicant/H;->c:I

    const/4 v5, 0x1

    const/4 v10, 0x0

    if-eqz v4, :cond_2

    if-ne v4, v5, :cond_1

    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 21
    new-instance v2, Lcom/sumsub/sns/internal/features/data/utils/b;

    move-object/from16 v4, p2

    move-object/from16 v6, p7

    invoke-direct {v2, v4, v6}, Lcom/sumsub/sns/internal/features/data/utils/b;-><init>(Ljava/io/File;Lcom/sumsub/sns/internal/features/data/utils/a;)V

    .line 22
    sget-object v6, Lokhttp3/MultipartBody$Part;->Companion:Lokhttp3/MultipartBody$Part$Companion;

    .line 23
    invoke-virtual {v4}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v7

    .line 24
    const-string v8, "content"

    invoke-virtual {v6, v8, v7, v2}, Lokhttp3/MultipartBody$Part$Companion;->createFormData(Ljava/lang/String;Ljava/lang/String;Lokhttp3/RequestBody;)Lokhttp3/MultipartBody$Part;

    move-result-object v2

    move-object/from16 v6, p1

    move-object/from16 v7, p3

    move-object/from16 v8, p4

    .line 25
    invoke-static {v6, v7, v8}, Lcom/sumsub/sns/internal/features/data/utils/f;->a(Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;)Lokhttp3/RequestBody;

    move-result-object v6

    .line 26
    sget-object v11, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    invoke-virtual {v4}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v4

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v8, "uploadFile: meta="

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v8, ", file="

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    const/4 v15, 0x4

    const/16 v16, 0x0

    const-string v12, "ApplicantRemoteDataSource"

    const/4 v14, 0x0

    invoke-static/range {v11 .. v16}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->d$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 27
    iget-object v4, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/J;->b:Lcom/sumsub/sns/internal/features/data/repository/applicant/b;

    if-eqz v1, :cond_3

    .line 28
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/data/model/common/X;->a:Ljava/lang/String;

    move-object v8, v1

    goto :goto_2

    :cond_3
    move-object v8, v10

    .line 29
    :goto_2
    iput v5, v9, Lcom/sumsub/sns/internal/features/data/repository/applicant/H;->c:I

    move-object/from16 v7, p5

    move-object v5, v2

    invoke-interface/range {v4 .. v9}, Lcom/sumsub/sns/internal/features/data/repository/applicant/b;->b(Lokhttp3/MultipartBody$Part;Lokhttp3/RequestBody;Ljava/util/Map;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v3, :cond_4

    return-object v3

    .line 30
    :cond_4
    :goto_3
    check-cast v2, Lretrofit2/Response;

    .line 31
    invoke-virtual {v2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sumsub/sns/internal/features/data/model/common/remote/k1;

    if-eqz v1, :cond_7

    .line 32
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/data/model/common/remote/k1;->a:Lcom/sumsub/sns/internal/features/data/model/common/remote/j1;

    if-nez v1, :cond_5

    goto :goto_4

    .line 33
    :cond_5
    new-instance v2, Lcom/sumsub/sns/internal/features/data/model/common/remote/Y0;

    .line 34
    iget-object v3, v1, Lcom/sumsub/sns/internal/features/data/model/common/remote/j1;->c:Ljava/lang/String;

    .line 35
    iget-object v4, v1, Lcom/sumsub/sns/internal/features/data/model/common/remote/j1;->b:Ljava/lang/String;

    .line 36
    iget-object v5, v1, Lcom/sumsub/sns/internal/features/data/model/common/remote/j1;->d:Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    .line 37
    iget-object v6, v1, Lcom/sumsub/sns/internal/features/data/model/common/remote/j1;->e:Ljava/util/List;

    .line 38
    iget-object v7, v1, Lcom/sumsub/sns/internal/features/data/model/common/remote/j1;->a:Ljava/lang/Integer;

    if-eqz v7, :cond_6

    .line 39
    invoke-virtual {v7}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    move-result-object v10

    .line 40
    :cond_6
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/data/model/common/remote/j1;->f:Lcom/sumsub/sns/internal/features/data/model/common/remote/v0;

    move-object/from16 p7, v1

    move-object/from16 p1, v2

    move-object/from16 p2, v3

    move-object/from16 p3, v4

    move-object/from16 p4, v5

    move-object/from16 p5, v6

    move-object/from16 p6, v10

    .line 41
    invoke-direct/range {p1 .. p7}, Lcom/sumsub/sns/internal/features/data/model/common/remote/Y0;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;Ljava/util/List;Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/common/remote/v0;)V

    move-object/from16 v1, p1

    return-object v1

    :cond_7
    :goto_4
    return-object v10
.end method

.method public final a(Ljava/lang/String;Ljava/io/InputStream;Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;Ljava/util/Map;Lcom/sumsub/sns/internal/features/data/model/common/X;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p6

    move-object/from16 v2, p7

    instance-of v3, v2, Lcom/sumsub/sns/internal/features/data/repository/applicant/G;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lcom/sumsub/sns/internal/features/data/repository/applicant/G;

    iget v4, v3, Lcom/sumsub/sns/internal/features/data/repository/applicant/G;->c:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lcom/sumsub/sns/internal/features/data/repository/applicant/G;->c:I

    :goto_0
    move-object v9, v3

    goto :goto_1

    :cond_0
    new-instance v3, Lcom/sumsub/sns/internal/features/data/repository/applicant/G;

    invoke-direct {v3, v0, v2}, Lcom/sumsub/sns/internal/features/data/repository/applicant/G;-><init>(Lcom/sumsub/sns/internal/features/data/repository/applicant/J;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    goto :goto_0

    :goto_1
    iget-object v2, v9, Lcom/sumsub/sns/internal/features/data/repository/applicant/G;->a:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v3

    .line 1
    iget v4, v9, Lcom/sumsub/sns/internal/features/data/repository/applicant/G;->c:I

    const/4 v5, 0x1

    const/4 v10, 0x0

    if-eqz v4, :cond_2

    if-ne v4, v5, :cond_1

    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 2
    invoke-static/range {p2 .. p2}, Lcom/sumsub/sns/internal/features/data/utils/f;->a(Ljava/io/InputStream;)Lokhttp3/MultipartBody$Part;

    move-result-object v2

    move-object/from16 v4, p1

    move-object/from16 v6, p3

    move-object/from16 v7, p4

    .line 3
    invoke-static {v4, v6, v7}, Lcom/sumsub/sns/internal/features/data/utils/f;->a(Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;)Lokhttp3/RequestBody;

    move-result-object v6

    .line 4
    sget-object v11, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v7, "uploadFile: meta="

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v7, ", file="

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    const/4 v15, 0x4

    const/16 v16, 0x0

    const-string v12, "ApplicantRemoteDataSource"

    const/4 v14, 0x0

    invoke-static/range {v11 .. v16}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->d$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 5
    iget-object v4, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/J;->b:Lcom/sumsub/sns/internal/features/data/repository/applicant/b;

    if-eqz v1, :cond_3

    .line 6
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/data/model/common/X;->a:Ljava/lang/String;

    move-object v8, v1

    goto :goto_2

    :cond_3
    move-object v8, v10

    .line 7
    :goto_2
    iput v5, v9, Lcom/sumsub/sns/internal/features/data/repository/applicant/G;->c:I

    move-object/from16 v7, p5

    move-object v5, v2

    invoke-interface/range {v4 .. v9}, Lcom/sumsub/sns/internal/features/data/repository/applicant/b;->b(Lokhttp3/MultipartBody$Part;Lokhttp3/RequestBody;Ljava/util/Map;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v3, :cond_4

    return-object v3

    .line 8
    :cond_4
    :goto_3
    check-cast v2, Lretrofit2/Response;

    .line 9
    invoke-virtual {v2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sumsub/sns/internal/features/data/model/common/remote/k1;

    if-eqz v1, :cond_7

    .line 10
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/data/model/common/remote/k1;->a:Lcom/sumsub/sns/internal/features/data/model/common/remote/j1;

    if-nez v1, :cond_5

    goto :goto_4

    .line 11
    :cond_5
    new-instance v2, Lcom/sumsub/sns/internal/features/data/model/common/remote/Y0;

    .line 12
    iget-object v3, v1, Lcom/sumsub/sns/internal/features/data/model/common/remote/j1;->c:Ljava/lang/String;

    .line 13
    iget-object v4, v1, Lcom/sumsub/sns/internal/features/data/model/common/remote/j1;->b:Ljava/lang/String;

    .line 14
    iget-object v5, v1, Lcom/sumsub/sns/internal/features/data/model/common/remote/j1;->d:Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    .line 15
    iget-object v6, v1, Lcom/sumsub/sns/internal/features/data/model/common/remote/j1;->e:Ljava/util/List;

    .line 16
    iget-object v7, v1, Lcom/sumsub/sns/internal/features/data/model/common/remote/j1;->a:Ljava/lang/Integer;

    if-eqz v7, :cond_6

    .line 17
    invoke-virtual {v7}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    move-result-object v10

    .line 18
    :cond_6
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/data/model/common/remote/j1;->f:Lcom/sumsub/sns/internal/features/data/model/common/remote/v0;

    move-object/from16 p7, v1

    move-object/from16 p1, v2

    move-object/from16 p2, v3

    move-object/from16 p3, v4

    move-object/from16 p4, v5

    move-object/from16 p5, v6

    move-object/from16 p6, v10

    .line 19
    invoke-direct/range {p1 .. p7}, Lcom/sumsub/sns/internal/features/data/model/common/remote/Y0;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;Ljava/util/List;Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/common/remote/v0;)V

    move-object/from16 v1, p1

    return-object v1

    :cond_7
    :goto_4
    return-object v10
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/repository/applicant/s;)Ljava/lang/Object;
    .locals 6

    .line 60
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Set language "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " for applicant "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x4

    const/4 v5, 0x0

    const-string v1, "ApplicantDataSource"

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->d$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 61
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/data/repository/applicant/J;->a:Lcom/sumsub/sns/internal/features/data/repository/applicant/K;

    const-string v1, "lang"

    invoke-static {v1, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p2

    invoke-static {p2}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/sumsub/sns/internal/features/data/repository/applicant/J;->a(Ljava/lang/String;Ljava/util/Map;)Lokhttp3/RequestBody;

    move-result-object p1

    invoke-interface {v0, p1, p3}, Lcom/sumsub/sns/internal/features/data/repository/applicant/K;->c(Lokhttp3/RequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/repository/applicant/t;)Ljava/lang/Object;
    .locals 6

    .line 62
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Set phone for applicant "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x4

    const/4 v5, 0x0

    const-string v1, "ApplicantDataSource"

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->d$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 63
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/data/repository/applicant/J;->a:Lcom/sumsub/sns/internal/features/data/repository/applicant/K;

    const-string/jumbo v1, "phone"

    invoke-static {v1, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p2

    invoke-static {p2}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/sumsub/sns/internal/features/data/repository/applicant/J;->a(Ljava/lang/String;Ljava/util/Map;)Lokhttp3/RequestBody;

    move-result-object p1

    invoke-interface {v0, p1, p3}, Lcom/sumsub/sns/internal/features/data/repository/applicant/K;->c(Lokhttp3/RequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/jvm/internal/SuspendLambda;)Ljava/lang/Object;
    .locals 10

    move-object/from16 v0, p7

    if-eqz v0, :cond_1

    .line 80
    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 81
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 82
    check-cast v2, Ljava/lang/String;

    .line 83
    new-instance v3, Lcom/sumsub/sns/internal/features/data/model/common/remote/h0;

    invoke-direct {v3, v2}, Lcom/sumsub/sns/internal/features/data/model/common/remote/h0;-><init>(Ljava/lang/String;)V

    .line 84
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    :goto_1
    move-object v9, v1

    goto :goto_2

    :cond_1
    const/4 v1, 0x0

    goto :goto_1

    .line 85
    :goto_2
    new-instance v2, Lcom/sumsub/sns/internal/features/data/model/common/remote/e0;

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    move-object v7, p5

    move-object/from16 v8, p6

    invoke-direct/range {v2 .. v9}, Lcom/sumsub/sns/internal/features/data/model/common/remote/e0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 86
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/data/repository/applicant/J;->a:Lcom/sumsub/sns/internal/features/data/repository/applicant/K;

    move-object/from16 p2, p8

    invoke-interface {p1, v2, p2}, Lcom/sumsub/sns/internal/features/data/repository/applicant/K;->a(Lcom/sumsub/sns/internal/features/data/model/common/remote/e0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final a(Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p3, Lcom/sumsub/sns/internal/features/data/repository/applicant/D;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/D;

    iget v1, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/D;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/D;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/D;

    invoke-direct {v0, p0, p3}, Lcom/sumsub/sns/internal/features/data/repository/applicant/D;-><init>(Lcom/sumsub/sns/internal/features/data/repository/applicant/J;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p3, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/D;->a:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 74
    iget v2, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/D;->c:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 75
    new-instance p3, Lcom/sumsub/sns/internal/features/data/repository/applicant/data/c;

    invoke-direct {p3, p2}, Lcom/sumsub/sns/internal/features/data/repository/applicant/data/c;-><init>(Ljava/util/List;)V

    .line 76
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/data/repository/applicant/J;->a:Lcom/sumsub/sns/internal/features/data/repository/applicant/K;

    .line 77
    iput v3, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/D;->c:I

    invoke-interface {p2, p1, p3, v0}, Lcom/sumsub/sns/internal/features/data/repository/applicant/K;->a(Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/repository/applicant/data/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_3

    return-object v1

    .line 78
    :cond_3
    :goto_1
    check-cast p3, Lcom/sumsub/sns/internal/features/data/repository/applicant/data/f;

    .line 79
    iget-object p1, p3, Lcom/sumsub/sns/internal/features/data/repository/applicant/data/f;->a:Lcom/sumsub/sns/internal/features/data/model/common/remote/c;

    return-object p1
.end method

.method public final a(Ljava/lang/String;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p2, Lcom/sumsub/sns/internal/features/data/repository/applicant/E;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/E;

    iget v1, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/E;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/E;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/E;

    invoke-direct {v0, p0, p2}, Lcom/sumsub/sns/internal/features/data/repository/applicant/E;-><init>(Lcom/sumsub/sns/internal/features/data/repository/applicant/J;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p2, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/E;->a:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 53
    iget v2, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/E;->c:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p2, p0, Lcom/sumsub/sns/internal/features/data/repository/applicant/J;->a:Lcom/sumsub/sns/internal/features/data/repository/applicant/K;

    iput v3, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/E;->c:I

    invoke-interface {p2, p1, v0}, Lcom/sumsub/sns/internal/features/data/repository/applicant/K;->c(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p2, Lcom/sumsub/sns/internal/features/data/model/common/remote/I;

    .line 54
    iget-object p1, p2, Lcom/sumsub/sns/internal/features/data/model/common/remote/I;->a:Ljava/lang/Integer;

    if-nez p1, :cond_4

    goto :goto_2

    .line 55
    :cond_4
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-ne p1, v3, :cond_5

    goto :goto_3

    :cond_5
    :goto_2
    const/4 v3, 0x0

    :goto_3
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public final a(Ljava/util/List;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p2, Lcom/sumsub/sns/internal/features/data/repository/applicant/C;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/C;

    iget v1, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/C;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/C;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/C;

    invoke-direct {v0, p0, p2}, Lcom/sumsub/sns/internal/features/data/repository/applicant/C;-><init>(Lcom/sumsub/sns/internal/features/data/repository/applicant/J;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p2, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/C;->a:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 68
    iget v2, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/C;->c:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 69
    new-instance p2, Lcom/sumsub/sns/internal/features/data/repository/applicant/data/c;

    invoke-direct {p2, p1}, Lcom/sumsub/sns/internal/features/data/repository/applicant/data/c;-><init>(Ljava/util/List;)V

    .line 70
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/data/repository/applicant/J;->a:Lcom/sumsub/sns/internal/features/data/repository/applicant/K;

    .line 71
    iput v3, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/C;->c:I

    invoke-interface {p1, p2, v0}, Lcom/sumsub/sns/internal/features/data/repository/applicant/K;->a(Lcom/sumsub/sns/internal/features/data/repository/applicant/data/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    .line 72
    :cond_3
    :goto_1
    check-cast p2, Lcom/sumsub/sns/internal/features/data/repository/applicant/data/f;

    .line 73
    iget-object p1, p2, Lcom/sumsub/sns/internal/features/data/repository/applicant/data/f;->a:Lcom/sumsub/sns/internal/features/data/model/common/remote/c;

    return-object p1
.end method

.method public final a(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p1, Lcom/sumsub/sns/internal/features/data/repository/applicant/A;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/A;

    iget v1, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/A;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/A;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/A;

    invoke-direct {v0, p0, p1}, Lcom/sumsub/sns/internal/features/data/repository/applicant/A;-><init>(Lcom/sumsub/sns/internal/features/data/repository/applicant/J;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/A;->a:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 56
    iget v2, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/A;->c:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 57
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/data/repository/applicant/J;->a:Lcom/sumsub/sns/internal/features/data/repository/applicant/K;

    iput v3, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/A;->c:I

    invoke-interface {p1, v0}, Lcom/sumsub/sns/internal/features/data/repository/applicant/K;->g(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p1, Lcom/sumsub/sns/internal/features/data/model/common/remote/F;

    .line 58
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/model/common/remote/F;->a:Ljava/util/List;

    if-nez p1, :cond_4

    .line 59
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p1

    :cond_4
    return-object p1
.end method

.method public final a(Ljava/lang/String;Ljava/util/Map;)Lokhttp3/RequestBody;
    .locals 5

    .line 64
    sget-object v0, Lokhttp3/RequestBody;->Companion:Lokhttp3/RequestBody$Companion;

    iget-object v1, p0, Lcom/sumsub/sns/internal/features/data/repository/applicant/J;->c:Lxg0/a;

    .line 65
    const-string v2, "id"

    invoke-static {v2, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p1

    invoke-static {p1, p2}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    .line 66
    invoke-interface {v1}, Ltg0/n;->getSerializersModule()Lyg0/a;

    move-result-object p2

    new-instance v2, Lkotlinx/serialization/internal/a1;

    const-class v3, Ljava/lang/Object;

    invoke-static {v3}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v4

    invoke-static {p2, v4}, Ltg0/x;->a(Lyg0/a;Lkotlin/reflect/KClass;)Ltg0/d;

    move-result-object v4

    invoke-static {v4}, Lug0/a;->u(Ltg0/d;)Ltg0/d;

    move-result-object v4

    invoke-static {v3}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v3

    invoke-static {p2, v3}, Ltg0/x;->a(Lyg0/a;Lkotlin/reflect/KClass;)Ltg0/d;

    move-result-object p2

    invoke-static {p2}, Lug0/a;->u(Ltg0/d;)Ltg0/d;

    move-result-object p2

    invoke-direct {v2, v4, p2}, Lkotlinx/serialization/internal/a1;-><init>(Ltg0/d;Ltg0/d;)V

    invoke-interface {v1, v2, p1}, Ltg0/c0;->b(Ltg0/p;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 67
    sget-object p2, Lokhttp3/MediaType;->Companion:Lokhttp3/MediaType$Companion;

    const-string v1, "application/json; charset=utf-8"

    invoke-virtual {p2, v1}, Lokhttp3/MediaType$Companion;->parse(Ljava/lang/String;)Lokhttp3/MediaType;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Lokhttp3/RequestBody$Companion;->create(Ljava/lang/String;Lokhttp3/MediaType;)Lokhttp3/RequestBody;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ljava/lang/String;Ljava/io/File;Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;Ljava/util/Map;Lcom/sumsub/sns/internal/features/data/model/common/X;Lcom/sumsub/sns/internal/features/data/utils/a;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p6

    move-object/from16 v2, p8

    instance-of v3, v2, Lcom/sumsub/sns/internal/features/data/repository/applicant/I;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lcom/sumsub/sns/internal/features/data/repository/applicant/I;

    iget v4, v3, Lcom/sumsub/sns/internal/features/data/repository/applicant/I;->c:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lcom/sumsub/sns/internal/features/data/repository/applicant/I;->c:I

    :goto_0
    move-object v9, v3

    goto :goto_1

    :cond_0
    new-instance v3, Lcom/sumsub/sns/internal/features/data/repository/applicant/I;

    invoke-direct {v3, v0, v2}, Lcom/sumsub/sns/internal/features/data/repository/applicant/I;-><init>(Lcom/sumsub/sns/internal/features/data/repository/applicant/J;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    goto :goto_0

    :goto_1
    iget-object v2, v9, Lcom/sumsub/sns/internal/features/data/repository/applicant/I;->a:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v3

    .line 1
    iget v4, v9, Lcom/sumsub/sns/internal/features/data/repository/applicant/I;->c:I

    const/4 v5, 0x1

    const/4 v10, 0x0

    if-eqz v4, :cond_2

    if-ne v4, v5, :cond_1

    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 2
    new-instance v2, Lcom/sumsub/sns/internal/features/data/utils/b;

    move-object/from16 v4, p2

    move-object/from16 v6, p7

    invoke-direct {v2, v4, v6}, Lcom/sumsub/sns/internal/features/data/utils/b;-><init>(Ljava/io/File;Lcom/sumsub/sns/internal/features/data/utils/a;)V

    .line 3
    sget-object v6, Lokhttp3/MultipartBody$Part;->Companion:Lokhttp3/MultipartBody$Part$Companion;

    .line 4
    invoke-virtual {v4}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v7

    .line 5
    const-string v8, "content"

    invoke-virtual {v6, v8, v7, v2}, Lokhttp3/MultipartBody$Part$Companion;->createFormData(Ljava/lang/String;Ljava/lang/String;Lokhttp3/RequestBody;)Lokhttp3/MultipartBody$Part;

    move-result-object v2

    move-object/from16 v6, p1

    move-object/from16 v7, p3

    move-object/from16 v8, p4

    .line 6
    invoke-static {v6, v7, v8}, Lcom/sumsub/sns/internal/features/data/utils/f;->a(Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;)Lokhttp3/RequestBody;

    move-result-object v6

    .line 7
    sget-object v11, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    invoke-virtual {v4}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v4

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v8, "uploadFileForAction: meta="

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v8, ", file="

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    const/4 v15, 0x4

    const/16 v16, 0x0

    const-string v12, "ApplicantDataSource"

    const/4 v14, 0x0

    invoke-static/range {v11 .. v16}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->d$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 8
    iget-object v4, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/J;->b:Lcom/sumsub/sns/internal/features/data/repository/applicant/b;

    if-eqz v1, :cond_3

    .line 9
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/data/model/common/X;->a:Ljava/lang/String;

    move-object v8, v1

    goto :goto_2

    :cond_3
    move-object v8, v10

    .line 10
    :goto_2
    iput v5, v9, Lcom/sumsub/sns/internal/features/data/repository/applicant/I;->c:I

    move-object/from16 v7, p5

    move-object v5, v2

    invoke-interface/range {v4 .. v9}, Lcom/sumsub/sns/internal/features/data/repository/applicant/b;->a(Lokhttp3/MultipartBody$Part;Lokhttp3/RequestBody;Ljava/util/Map;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v3, :cond_4

    return-object v3

    .line 11
    :cond_4
    :goto_3
    check-cast v2, Lretrofit2/Response;

    .line 12
    invoke-virtual {v2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sumsub/sns/internal/features/data/model/common/remote/e1;

    if-eqz v1, :cond_8

    .line 13
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/data/model/common/remote/e1;->a:Lcom/sumsub/sns/internal/features/data/model/common/remote/d1;

    if-eqz v1, :cond_5

    .line 14
    iget-object v3, v1, Lcom/sumsub/sns/internal/features/data/model/common/remote/d1;->a:Ljava/lang/Long;

    if-eqz v3, :cond_5

    .line 15
    invoke-virtual {v3}, Ljava/lang/Long;->toString()Ljava/lang/String;

    move-result-object v3

    goto :goto_4

    :cond_5
    move-object v3, v10

    :goto_4
    if-eqz v1, :cond_6

    .line 16
    iget-object v4, v1, Lcom/sumsub/sns/internal/features/data/model/common/remote/d1;->b:Ljava/lang/String;

    goto :goto_5

    :cond_6
    move-object v4, v10

    :goto_5
    if-eqz v1, :cond_7

    .line 17
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/data/model/common/remote/d1;->c:Ljava/lang/String;

    goto :goto_6

    :cond_7
    move-object v1, v10

    .line 18
    :goto_6
    new-instance v5, Lcom/sumsub/sns/internal/features/data/model/common/remote/Y0;

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object/from16 p3, v1

    move-object/from16 p6, v3

    move-object/from16 p2, v4

    move-object/from16 p1, v5

    move-object/from16 p4, v6

    move-object/from16 p5, v7

    move-object/from16 p7, v8

    .line 19
    invoke-direct/range {p1 .. p7}, Lcom/sumsub/sns/internal/features/data/model/common/remote/Y0;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;Ljava/util/List;Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/common/remote/v0;)V

    goto :goto_7

    :cond_8
    move-object v5, v10

    .line 20
    :goto_7
    invoke-virtual {v2}, Lretrofit2/Response;->headers()Lokhttp3/Headers;

    move-result-object v1

    const-string v2, "X-Image-Id"

    invoke-virtual {v1, v2}, Lokhttp3/Headers;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_b

    if-eqz v5, :cond_9

    .line 21
    iget-object v2, v5, Lcom/sumsub/sns/internal/features/data/model/common/remote/Y0;->a:Ljava/lang/String;

    iget-object v3, v5, Lcom/sumsub/sns/internal/features/data/model/common/remote/Y0;->b:Ljava/lang/String;

    iget-object v4, v5, Lcom/sumsub/sns/internal/features/data/model/common/remote/Y0;->c:Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    iget-object v6, v5, Lcom/sumsub/sns/internal/features/data/model/common/remote/Y0;->d:Ljava/util/List;

    iget-object v7, v5, Lcom/sumsub/sns/internal/features/data/model/common/remote/Y0;->f:Lcom/sumsub/sns/internal/features/data/model/common/remote/v0;

    .line 22
    new-instance v8, Lcom/sumsub/sns/internal/features/data/model/common/remote/Y0;

    move-object/from16 p6, v1

    move-object/from16 p2, v2

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v6

    move-object/from16 p7, v7

    move-object/from16 p1, v8

    invoke-direct/range {p1 .. p7}, Lcom/sumsub/sns/internal/features/data/model/common/remote/Y0;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;Ljava/util/List;Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/common/remote/v0;)V

    move-object/from16 v10, p1

    :cond_9
    if-nez v10, :cond_a

    goto :goto_8

    :cond_a
    return-object v10

    :cond_b
    :goto_8
    return-object v5
.end method

.method public final b(Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/repository/applicant/t;)Ljava/lang/Object;
    .locals 6

    .line 26
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Set phone for action "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x4

    const/4 v5, 0x0

    const-string v1, "ApplicantDataSource"

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->d$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 27
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/data/repository/applicant/J;->a:Lcom/sumsub/sns/internal/features/data/repository/applicant/K;

    const-string/jumbo v1, "phone"

    invoke-static {v1, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p2

    invoke-static {p2}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/sumsub/sns/internal/features/data/repository/applicant/J;->a(Ljava/lang/String;Ljava/util/Map;)Lokhttp3/RequestBody;

    move-result-object p1

    invoke-interface {v0, p1, p3}, Lcom/sumsub/sns/internal/features/data/repository/applicant/K;->b(Lokhttp3/RequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final b(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p1, Lcom/sumsub/sns/internal/features/data/repository/applicant/F;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/F;

    iget v1, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/F;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/F;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/F;

    invoke-direct {v0, p0, p1}, Lcom/sumsub/sns/internal/features/data/repository/applicant/F;-><init>(Lcom/sumsub/sns/internal/features/data/repository/applicant/J;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/F;->a:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 23
    iget v2, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/F;->c:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/sumsub/sns/internal/features/data/repository/applicant/J;->a:Lcom/sumsub/sns/internal/features/data/repository/applicant/K;

    iput v3, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/F;->c:I

    invoke-interface {p1, v0}, Lcom/sumsub/sns/internal/features/data/repository/applicant/K;->b(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p1, Lcom/sumsub/sns/internal/features/data/model/common/remote/I;

    .line 24
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/model/common/remote/I;->a:Ljava/lang/Integer;

    if-nez p1, :cond_4

    goto :goto_2

    .line 25
    :cond_4
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-ne p1, v3, :cond_5

    goto :goto_3

    :cond_5
    :goto_2
    const/4 v3, 0x0

    :goto_3
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
