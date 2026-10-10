.class public final Lcom/sumsub/sns/internal/features/domain/s0;
.super Lcom/sumsub/sns/internal/features/domain/k0;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public d:Lcom/sumsub/sns/internal/features/domain/n0;

.field public final e:Ljava/util/concurrent/ConcurrentHashMap;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/core/domain/h;)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p1, Lcom/sumsub/sns/internal/core/domain/h;->f:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/sumsub/sns/internal/features/data/repository/common/a;

    .line 9
    .line 10
    iget-object v1, p1, Lcom/sumsub/sns/internal/core/domain/h;->g:Lkotlin/Lazy;

    .line 11
    .line 12
    .line 13
    invoke-interface {v1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    check-cast v1, Lcom/sumsub/sns/internal/features/data/repository/applicant/d;

    .line 17
    .line 18
    iget-object v2, p1, Lcom/sumsub/sns/internal/core/domain/h;->e:Lkotlin/Lazy;

    .line 19
    .line 20
    .line 21
    invoke-interface {v2}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 22
    move-result-object v2

    .line 23
    .line 24
    check-cast v2, Lcom/sumsub/sns/internal/features/data/repository/settings/c;

    .line 25
    .line 26
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/domain/h;->r:Lkotlin/Lazy;

    .line 27
    .line 28
    .line 29
    invoke-interface {p1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 30
    move-result-object p1

    .line 31
    .line 32
    check-cast p1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    .line 33
    .line 34
    .line 35
    invoke-direct {p0, v0, v1, p1}, Lcom/sumsub/sns/internal/features/domain/k0;-><init>(Lcom/sumsub/sns/internal/features/data/repository/common/a;Lcom/sumsub/sns/internal/features/data/repository/applicant/d;Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;)V

    .line 36
    .line 37
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 38
    .line 39
    .line 40
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 41
    .line 42
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/domain/s0;->e:Ljava/util/concurrent/ConcurrentHashMap;

    .line 43
    return-void
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


# virtual methods
.method public final a()I
    .locals 5

    .line 63
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/domain/s0;->e:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->sumOfInt(Ljava/lang/Iterable;)I

    move-result v0

    .line 64
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/domain/s0;->e:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    move-result v1

    div-int/2addr v0, v1

    .line 65
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "total upload progress="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 66
    sget-object v2, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 67
    iget-object v2, v2, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 68
    const-string v3, "DocCapture"

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v1, v4}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return v0
.end method

.method public final bridge synthetic a(Lcom/sumsub/sns/internal/features/domain/f0;Lcom/sumsub/sns/internal/features/data/model/common/p;Ljava/lang/String;Lcom/sumsub/sns/internal/features/domain/j0;)Ljava/lang/Object;
    .locals 0

    .line 6
    check-cast p1, Lcom/sumsub/sns/internal/features/domain/m0;

    invoke-virtual {p0, p1, p3, p4}, Lcom/sumsub/sns/internal/features/domain/s0;->a(Lcom/sumsub/sns/internal/features/domain/m0;Ljava/lang/String;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final a(Lcom/sumsub/sns/internal/features/domain/m0;Ljava/lang/String;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    instance-of v3, v2, Lcom/sumsub/sns/internal/features/domain/p0;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lcom/sumsub/sns/internal/features/domain/p0;

    iget v4, v3, Lcom/sumsub/sns/internal/features/domain/p0;->h:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lcom/sumsub/sns/internal/features/domain/p0;->h:I

    goto :goto_0

    :cond_0
    new-instance v3, Lcom/sumsub/sns/internal/features/domain/p0;

    invoke-direct {v3, v0, v2}, Lcom/sumsub/sns/internal/features/domain/p0;-><init>(Lcom/sumsub/sns/internal/features/domain/s0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object v2, v3, Lcom/sumsub/sns/internal/features/domain/p0;->f:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v4

    .line 7
    iget v5, v3, Lcom/sumsub/sns/internal/features/domain/p0;->h:I

    const-string v6, "DocCapture"

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eqz v5, :cond_2

    if-ne v5, v7, :cond_1

    iget-object v1, v3, Lcom/sumsub/sns/internal/features/domain/p0;->e:Lcom/sumsub/sns/internal/features/data/model/common/T;

    iget-object v5, v3, Lcom/sumsub/sns/internal/features/domain/p0;->d:Ljava/util/Iterator;

    iget-object v9, v3, Lcom/sumsub/sns/internal/features/domain/p0;->c:Ljava/util/ArrayList;

    iget-object v10, v3, Lcom/sumsub/sns/internal/features/domain/p0;->b:Ljava/lang/String;

    iget-object v11, v3, Lcom/sumsub/sns/internal/features/domain/p0;->a:Lcom/sumsub/sns/internal/features/domain/m0;

    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_7

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 8
    iget-object v2, v0, Lcom/sumsub/sns/internal/features/domain/s0;->e:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 9
    iget-object v2, v1, Lcom/sumsub/sns/internal/features/domain/m0;->d:Ljava/util/List;

    .line 10
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    const/4 v9, 0x0

    if-eqz v5, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/sumsub/sns/internal/features/data/model/common/T;

    .line 11
    iget-object v10, v0, Lcom/sumsub/sns/internal/features/domain/s0;->e:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v9}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-virtual {v10, v5, v9}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 12
    :cond_3
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 13
    iget-object v5, v1, Lcom/sumsub/sns/internal/features/domain/m0;->d:Ljava/util/List;

    .line 14
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 15
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_4
    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_5

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    move-object v12, v11

    check-cast v12, Lcom/sumsub/sns/internal/features/data/model/common/T;

    .line 16
    iget-boolean v12, v12, Lcom/sumsub/sns/internal/features/data/model/common/T;->f:Z

    if-nez v12, :cond_4

    .line 17
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 18
    :cond_5
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v5

    move v11, v9

    :cond_6
    :goto_3
    if-ge v11, v5, :cond_7

    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    add-int/lit8 v11, v11, 0x1

    check-cast v12, Lcom/sumsub/sns/internal/features/data/model/common/T;

    .line 19
    iget-object v13, v0, Lcom/sumsub/sns/internal/features/domain/s0;->d:Lcom/sumsub/sns/internal/features/domain/n0;

    if-eqz v13, :cond_6

    .line 20
    new-instance v14, Lcom/sumsub/sns/internal/features/domain/documents/S;

    invoke-direct {v14, v9}, Lcom/sumsub/sns/internal/features/domain/documents/S;-><init>(I)V

    .line 21
    invoke-interface {v13, v12, v14, v9}, Lcom/sumsub/sns/internal/features/domain/n0;->a(Lcom/sumsub/sns/internal/features/data/model/common/T;Lcom/sumsub/sns/internal/features/domain/documents/T;I)V

    goto :goto_3

    .line 22
    :cond_7
    iget-object v5, v1, Lcom/sumsub/sns/internal/features/domain/m0;->d:Ljava/util/List;

    .line 23
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 24
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_8
    :goto_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_9

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    move-object v11, v10

    check-cast v11, Lcom/sumsub/sns/internal/features/data/model/common/T;

    .line 25
    iget-boolean v11, v11, Lcom/sumsub/sns/internal/features/data/model/common/T;->f:Z

    if-nez v11, :cond_8

    .line 26
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 27
    :cond_9
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    move-object/from16 v10, p2

    :goto_5
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_10

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/sumsub/sns/internal/features/data/model/common/T;

    .line 28
    iget-object v11, v9, Lcom/sumsub/sns/internal/features/data/model/common/T;->d:Ljava/lang/String;

    .line 29
    iget-object v12, v9, Lcom/sumsub/sns/internal/features/data/model/common/T;->e:Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    .line 30
    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v14, "uploading "

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v11, ", side="

    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v11, " ..."

    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    .line 31
    sget-object v12, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 32
    iget-object v12, v12, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 33
    invoke-virtual {v12, v6, v11, v8}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 34
    iget-object v11, v1, Lcom/sumsub/sns/internal/features/domain/f0;->a:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 35
    invoke-virtual {v11}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getType()Lcom/sumsub/sns/internal/features/data/model/common/X;

    move-result-object v11

    .line 36
    iget-object v12, v11, Lcom/sumsub/sns/internal/features/data/model/common/X;->a:Ljava/lang/String;

    .line 37
    const-string v13, "IDENTITY_VIDEO"

    invoke-static {v12, v13}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_a

    goto :goto_6

    :cond_a
    move-object v11, v8

    :goto_6
    if-nez v11, :cond_b

    .line 38
    new-instance v11, Lcom/sumsub/sns/internal/features/data/model/common/X;

    invoke-direct {v11, v13}, Lcom/sumsub/sns/internal/features/data/model/common/X;-><init>(Ljava/lang/String;)V

    :cond_b
    move-object v15, v11

    .line 39
    iget-object v11, v0, Lcom/sumsub/sns/internal/features/domain/k0;->b:Lcom/sumsub/sns/internal/features/data/repository/applicant/d;

    move-object v12, v11

    .line 40
    iget-object v11, v9, Lcom/sumsub/sns/internal/features/data/model/common/T;->b:Ljava/io/File;

    move-object v13, v12

    .line 41
    iget-object v12, v9, Lcom/sumsub/sns/internal/features/data/model/common/T;->d:Ljava/lang/String;

    move-object v14, v13

    .line 42
    iget-object v13, v9, Lcom/sumsub/sns/internal/features/data/model/common/T;->e:Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    .line 43
    new-instance v8, Lcom/sumsub/sns/internal/features/domain/o0;

    invoke-direct {v8, v9, v0}, Lcom/sumsub/sns/internal/features/domain/o0;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/T;Lcom/sumsub/sns/internal/features/domain/s0;)V

    .line 44
    iput-object v1, v3, Lcom/sumsub/sns/internal/features/domain/p0;->a:Lcom/sumsub/sns/internal/features/domain/m0;

    iput-object v10, v3, Lcom/sumsub/sns/internal/features/domain/p0;->b:Ljava/lang/String;

    iput-object v2, v3, Lcom/sumsub/sns/internal/features/domain/p0;->c:Ljava/util/ArrayList;

    iput-object v5, v3, Lcom/sumsub/sns/internal/features/domain/p0;->d:Ljava/util/Iterator;

    iput-object v9, v3, Lcom/sumsub/sns/internal/features/domain/p0;->e:Lcom/sumsub/sns/internal/features/data/model/common/T;

    iput v7, v3, Lcom/sumsub/sns/internal/features/domain/p0;->h:I

    move-object/from16 v16, v9

    move-object v9, v14

    const/4 v14, 0x0

    const/16 v18, 0x10

    move-object/from16 v17, v3

    move-object/from16 v3, v16

    move-object/from16 v16, v8

    invoke-static/range {v9 .. v18}, Lcom/sumsub/sns/internal/features/data/repository/applicant/c;->a(Lcom/sumsub/sns/internal/features/data/repository/applicant/d;Ljava/lang/String;Ljava/io/File;Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;Ljava/util/Map;Lcom/sumsub/sns/internal/features/data/model/common/X;Lcom/sumsub/sns/internal/features/domain/o0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;I)Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v4, :cond_c

    return-object v4

    :cond_c
    move-object v11, v1

    move-object v9, v2

    move-object v1, v3

    move-object v2, v8

    move-object/from16 v3, v17

    .line 45
    :goto_7
    check-cast v2, Lcom/sumsub/sns/internal/features/data/model/common/remote/Y0;

    if-eqz v2, :cond_d

    .line 46
    iget-object v8, v2, Lcom/sumsub/sns/internal/features/data/model/common/remote/Y0;->e:Ljava/lang/String;

    goto :goto_8

    :cond_d
    const/4 v8, 0x0

    .line 47
    :goto_8
    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v13, "uploaded doc="

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 48
    sget-object v12, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 49
    iget-object v13, v12, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    const/4 v14, 0x0

    .line 50
    invoke-virtual {v13, v6, v8, v14}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 51
    new-instance v8, Lcom/sumsub/sns/internal/features/domain/h0;

    sget-object v13, Lcom/sumsub/sns/internal/features/presentation/utils/M;->w:Lcom/sumsub/sns/internal/features/presentation/utils/s;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1}, Lcom/sumsub/sns/internal/features/presentation/utils/s;->a(Lcom/sumsub/sns/internal/features/data/model/common/T;)Ljava/lang/String;

    move-result-object v13

    invoke-direct {v8, v13, v2}, Lcom/sumsub/sns/internal/features/domain/h0;-><init>(Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/common/remote/Y0;)V

    invoke-virtual {v9, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 52
    iget-object v8, v0, Lcom/sumsub/sns/internal/features/domain/s0;->d:Lcom/sumsub/sns/internal/features/domain/n0;

    if-eqz v8, :cond_e

    .line 53
    sget-object v13, Lcom/sumsub/sns/internal/features/domain/documents/Q;->a:Lcom/sumsub/sns/internal/features/domain/documents/Q;

    .line 54
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/domain/s0;->a()I

    move-result v14

    .line 55
    invoke-interface {v8, v1, v13, v14}, Lcom/sumsub/sns/internal/features/domain/n0;->a(Lcom/sumsub/sns/internal/features/data/model/common/T;Lcom/sumsub/sns/internal/features/domain/documents/T;I)V

    :cond_e
    if-eqz v2, :cond_f

    .line 56
    invoke-virtual {v2}, Lcom/sumsub/sns/internal/features/data/model/common/remote/Y0;->d()Z

    move-result v8

    if-ne v8, v7, :cond_f

    .line 57
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Fast-fail for "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ". Stopping upload ..."

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 58
    iget-object v3, v12, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    const/4 v14, 0x0

    .line 59
    invoke-virtual {v3, v6, v1, v14}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 60
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v3, "response: "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 61
    iget-object v2, v12, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 62
    invoke-virtual {v2, v6, v1, v14}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v9

    :cond_f
    const/4 v14, 0x0

    move-object v2, v9

    move-object v1, v11

    move-object v8, v14

    goto/16 :goto_5

    :cond_10
    return-object v2
.end method

.method public final a(Ljava/util/List;Lcom/sumsub/sns/internal/features/domain/f0;Lcom/sumsub/sns/internal/features/domain/j0;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p2, Lcom/sumsub/sns/internal/features/domain/m0;

    .line 2
    iget-boolean v0, p2, Lcom/sumsub/sns/internal/features/domain/m0;->e:Z

    if-nez v0, :cond_1

    .line 3
    invoke-static {p0, p1, p2, p3}, Lcom/sumsub/sns/internal/features/domain/k0;->a(Lcom/sumsub/sns/internal/features/domain/k0;Ljava/util/List;Lcom/sumsub/sns/internal/features/domain/f0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p1

    .line 4
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    .line 5
    :cond_1
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final b(Lcom/sumsub/sns/internal/features/domain/f0;Lcom/sumsub/sns/internal/features/data/model/common/p;Ljava/lang/String;Lcom/sumsub/sns/internal/features/domain/j0;)Ljava/lang/Object;
    .locals 3

    .line 1
    .line 2
    check-cast p1, Lcom/sumsub/sns/internal/features/domain/m0;

    .line 3
    .line 4
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/domain/s0;->e:Ljava/util/concurrent/ConcurrentHashMap;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 8
    .line 9
    iget-object p2, p1, Lcom/sumsub/sns/internal/features/domain/m0;->d:Ljava/util/List;

    .line 10
    .line 11
    .line 12
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 13
    move-result-object p2

    .line 14
    .line 15
    .line 16
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    move-result v0

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    .line 22
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    check-cast v0, Lcom/sumsub/sns/internal/features/data/model/common/T;

    .line 26
    .line 27
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/domain/s0;->e:Ljava/util/concurrent/ConcurrentHashMap;

    .line 28
    const/4 v2, 0x0

    .line 29
    .line 30
    .line 31
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    .line 32
    move-result-object v2

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, v0, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    goto :goto_0

    .line 37
    .line 38
    :cond_0
    new-instance p2, Lcom/sumsub/sns/internal/features/domain/r0;

    .line 39
    const/4 v0, 0x0

    .line 40
    .line 41
    .line 42
    invoke-direct {p2, p1, p0, p3, v0}, Lcom/sumsub/sns/internal/features/domain/r0;-><init>(Lcom/sumsub/sns/internal/features/domain/m0;Lcom/sumsub/sns/internal/features/domain/s0;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    .line 43
    .line 44
    .line 45
    invoke-static {p2, p4}, Lkotlinx/coroutines/n0;->f(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 46
    move-result-object p1

    .line 47
    return-object p1
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
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
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
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
.end method
