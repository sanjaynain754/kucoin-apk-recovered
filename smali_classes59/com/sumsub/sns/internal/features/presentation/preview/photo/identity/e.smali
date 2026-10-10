.class public final Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/e;
.super Lcom/sumsub/sns/internal/features/presentation/utils/M;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# static fields
.field public static final synthetic B:I


# instance fields
.field public final A:Lcom/sumsub/sns/internal/features/domain/E;

.field public final z:Lcom/sumsub/sns/internal/features/domain/h;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/data/model/common/Document;Landroidx/lifecycle/SavedStateHandle;Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;Lcom/sumsub/sns/internal/features/domain/t;Lcom/sumsub/sns/internal/features/domain/A;Lcom/sumsub/sns/internal/features/domain/s0;Lcom/sumsub/sns/internal/core/common/D0;Lcom/sumsub/sns/internal/features/domain/e;Lcom/sumsub/sns/internal/features/domain/mrtd/e;Lcom/sumsub/sns/internal/features/domain/mrtd/i;Lcom/sumsub/sns/internal/features/domain/h;Lcom/sumsub/sns/internal/features/domain/E;Lcom/sumsub/sns/internal/features/domain/utils/a;Lcom/sumsub/sns/internal/features/presentation/utils/m;)V
    .locals 13

    .line 1
    move-object v0, p0

    .line 2
    move-object v1, p1

    .line 3
    move-object v2, p2

    .line 4
    .line 5
    move-object/from16 v3, p3

    .line 6
    .line 7
    move-object/from16 v4, p4

    .line 8
    .line 9
    move-object/from16 v5, p5

    .line 10
    .line 11
    move-object/from16 v6, p6

    .line 12
    .line 13
    move-object/from16 v7, p7

    .line 14
    .line 15
    move-object/from16 v8, p8

    .line 16
    .line 17
    move-object/from16 v10, p9

    .line 18
    .line 19
    move-object/from16 v11, p10

    .line 20
    .line 21
    move-object/from16 v9, p13

    .line 22
    .line 23
    move-object/from16 v12, p14

    .line 24
    .line 25
    .line 26
    invoke-direct/range {v0 .. v12}, Lcom/sumsub/sns/internal/features/presentation/utils/M;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/Document;Landroidx/lifecycle/SavedStateHandle;Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;Lcom/sumsub/sns/internal/features/domain/t;Lcom/sumsub/sns/internal/features/domain/A;Lcom/sumsub/sns/internal/features/domain/s0;Lcom/sumsub/sns/internal/core/common/D0;Lcom/sumsub/sns/internal/features/domain/e;Lcom/sumsub/sns/internal/features/domain/utils/a;Lcom/sumsub/sns/internal/features/domain/mrtd/e;Lcom/sumsub/sns/internal/features/domain/mrtd/i;Lcom/sumsub/sns/internal/features/presentation/utils/m;)V

    .line 27
    .line 28
    move-object/from16 p1, p11

    .line 29
    .line 30
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/e;->z:Lcom/sumsub/sns/internal/features/domain/h;

    .line 31
    .line 32
    move-object/from16 p1, p12

    .line 33
    .line 34
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/e;->A:Lcom/sumsub/sns/internal/features/domain/E;

    .line 35
    return-void
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
.end method


# virtual methods
.method public final a(ZLcom/sumsub/sns/internal/features/data/model/common/p;Lcom/sumsub/sns/internal/features/data/model/common/h;)Lcom/sumsub/sns/internal/features/domain/documents/M;
    .locals 11

    .line 70
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->e()Z

    move-result v1

    .line 71
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->a:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 72
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->f()Ljava/util/List;

    move-result-object v3

    .line 73
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->a:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 74
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getType()Lcom/sumsub/sns/internal/features/data/model/common/X;

    move-result-object v0

    .line 75
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/model/common/X;->a:Ljava/lang/String;

    .line 76
    invoke-static {p3, v0}, Lcom/sumsub/sns/internal/features/data/model/common/i;->a(Lcom/sumsub/sns/internal/features/data/model/common/h;Ljava/lang/String;)Z

    move-result p3

    const/4 v0, 0x0

    const/4 v4, 0x1

    if-nez p3, :cond_0

    .line 77
    iget-object p3, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->a:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 78
    invoke-virtual {p3}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getType()Lcom/sumsub/sns/internal/features/data/model/common/X;

    move-result-object p3

    invoke-virtual {p3}, Lcom/sumsub/sns/internal/features/data/model/common/X;->e()Z

    move-result p3

    if-eqz p3, :cond_1

    .line 79
    :cond_0
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->e()Z

    move-result p3

    if-nez p3, :cond_1

    move p3, v4

    goto :goto_0

    :cond_1
    move p3, v4

    move v4, v0

    .line 80
    :goto_0
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->d()Z

    move-result v5

    const/4 v6, 0x0

    if-nez v5, :cond_2

    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->b()Ljava/lang/String;

    move-result-object v5

    goto :goto_1

    :cond_2
    move-object v5, v6

    .line 81
    :goto_1
    sget-object v7, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/DocCapture$PreferredMode;->AUTO:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/DocCapture$PreferredMode;

    .line 82
    iget-object v8, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->l:Lcom/sumsub/sns/internal/features/presentation/utils/m;

    invoke-virtual {v8}, Lcom/sumsub/sns/internal/features/presentation/utils/m;->a()Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    move-result-object v8

    .line 83
    sget-object v9, Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;->Back:Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    if-ne v8, v9, :cond_5

    .line 84
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->c()Ljava/util/List;

    move-result-object v8

    invoke-static {v8}, Lkotlin/collections/CollectionsKt;->lastOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/sumsub/sns/internal/features/data/model/common/T;

    if-eqz v8, :cond_4

    .line 85
    iget-object v9, v8, Lcom/sumsub/sns/internal/features/data/model/common/T;->e:Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    .line 86
    sget-object v10, Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;->Front:Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    if-ne v9, v10, :cond_3

    goto :goto_2

    :cond_3
    move-object v8, v6

    :goto_2
    if-eqz v8, :cond_4

    .line 87
    iget-object v8, v8, Lcom/sumsub/sns/internal/features/data/model/common/T;->g:Ljava/lang/Boolean;

    .line 88
    invoke-static {p3}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v9

    .line 89
    invoke-static {v8, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    goto :goto_3

    :cond_4
    move v8, v0

    :goto_3
    if-eqz v8, :cond_5

    move v0, p3

    :cond_5
    if-eqz v0, :cond_6

    goto :goto_4

    :cond_6
    move-object v7, v6

    .line 90
    :goto_4
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->a()Ljava/lang/String;

    move-result-object v8

    .line 91
    invoke-virtual {p0, p2, p1}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->a(Lcom/sumsub/sns/internal/features/data/model/common/p;Z)Z

    move-result v9

    .line 92
    new-instance v0, Lcom/sumsub/sns/internal/features/domain/documents/M;

    move v6, p1

    invoke-direct/range {v0 .. v9}, Lcom/sumsub/sns/internal/features/domain/documents/M;-><init>(ZLcom/sumsub/sns/internal/features/data/model/common/Document;Ljava/util/List;ZLjava/lang/String;ZLcom/sumsub/sns/internal/features/presentation/camera/photo/document/DocCapture$PreferredMode;Ljava/lang/String;Z)V

    return-object v0
.end method

.method public final a(Lcom/sumsub/sns/internal/features/data/model/common/T;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 11

    .line 2
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->d()Z

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "id preview - on picker result: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", shouldSkipSelector="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 3
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 4
    iget-object v1, v1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 5
    const-string v2, "DocCapture"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v0, v3}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    if-nez p1, :cond_4

    .line 6
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->d()Z

    move-result v0

    if-nez v0, :cond_4

    .line 7
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->c()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object p1

    .line 8
    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 9
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->a(Ljava/util/List;)V

    .line 10
    sget-object p1, Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;->Front:Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    .line 11
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->l:Lcom/sumsub/sns/internal/features/presentation/utils/m;

    .line 12
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/utils/m;->c:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/utils/m;->e:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    .line 13
    iget-object v1, v0, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 14
    iget-object v0, v0, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    invoke-virtual {v1, v0, p1}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 15
    sget-object p1, Lcom/sumsub/sns/internal/core/analytics/e;->a:Lcom/sumsub/sns/internal/features/data/repository/analytics/a;

    sget-object p1, Lcom/sumsub/sns/internal/core/analytics/GlobalStatePayload;->IdDocSubType:Lcom/sumsub/sns/internal/core/analytics/GlobalStatePayload;

    .line 16
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->l:Lcom/sumsub/sns/internal/features/presentation/utils/m;

    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/utils/m;->a()Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    move-result-object v0

    .line 17
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;->getValue()Ljava/lang/String;

    move-result-object v0

    .line 18
    sget-object v1, Lcom/sumsub/sns/internal/core/analytics/e;->c:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1, p1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    sget-object p1, Lcom/sumsub/sns/internal/core/common/k0;->a:Lcom/sumsub/sns/internal/core/common/k0;

    invoke-virtual {p1}, Lcom/sumsub/sns/internal/core/common/k0;->getPreferredDocumentsDefinitions()Ljava/util/Map;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 20
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->m:Lcom/sumsub/sns/core/presentation/base/C;

    .line 21
    instance-of p2, p1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/f;

    if-eqz p2, :cond_0

    move-object v3, p1

    check-cast v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/f;

    :cond_0
    if-eqz v3, :cond_1

    move-object v4, v3

    check-cast v4, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/t;

    const/16 v9, 0xf

    const/4 v10, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    .line 22
    invoke-static/range {v4 .. v10}, Lcom/sumsub/sns/core/presentation/base/C;->finish$default(Lcom/sumsub/sns/core/presentation/base/C;Lcom/sumsub/sns/internal/core/common/w;Ljava/lang/Object;Ljava/lang/Long;Lcom/sumsub/sns/internal/features/presentation/result/c;ILjava/lang/Object;)V

    .line 23
    :cond_1
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    .line 24
    :cond_2
    invoke-virtual {p0, v2, p2}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/e;->a(ZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_3

    return-object p1

    :cond_3
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    .line 25
    :cond_4
    invoke-static {p0, p1, p2}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->a(Lcom/sumsub/sns/internal/features/presentation/utils/M;Lcom/sumsub/sns/internal/features/data/model/common/T;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p1

    .line 26
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_5

    return-object p1

    :cond_5
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final a(Lkotlin/coroutines/jvm/internal/SuspendLambda;)Ljava/lang/Object;
    .locals 4

    .line 27
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 28
    iget-object v0, v0, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 29
    const-string/jumbo v1, "onRestartStep"

    const/4 v2, 0x0

    const-string v3, "DocCapture"

    invoke-virtual {v0, v3, v1, v2}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 30
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 31
    invoke-super {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->a(Lkotlin/coroutines/jvm/internal/SuspendLambda;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    .line 32
    :cond_1
    sget-object v0, Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;->Front:Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    .line 33
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->l:Lcom/sumsub/sns/internal/features/presentation/utils/m;

    .line 34
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/presentation/utils/m;->c:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object v2, Lcom/sumsub/sns/internal/features/presentation/utils/m;->e:[Lkotlin/reflect/KProperty;

    const/4 v3, 0x0

    aget-object v2, v2, v3

    .line 35
    iget-object v2, v1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 36
    iget-object v1, v1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    invoke-virtual {v2, v1, v0}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 37
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->c()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v0

    .line 38
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 39
    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->a(Ljava/util/List;)V

    const/4 v0, 0x1

    .line 40
    invoke-virtual {p0, v0, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/e;->a(ZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_2

    return-object p1

    :cond_2
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final a(ZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 10

    instance-of v0, p2, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/c;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/c;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/c;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/c;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/c;

    invoke-direct {v0, p0, p2}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/c;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/e;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/c;->a:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 41
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/c;->c:I

    const-string v3, "DocCapture"

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v2, :cond_4

    if-eq v2, v6, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 42
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->d()Z

    move-result p2

    .line 43
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->a:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 44
    invoke-virtual {v2}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->isSubmitted()Z

    move-result v2

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v9, "showDocumentTypeSelector, skipSelector="

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string p2, ", fromWarning="

    invoke-virtual {v8, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string p2, ", documentIsSubmitted="

    invoke-virtual {v8, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 45
    sget-object v2, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 46
    iget-object v2, v2, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 47
    invoke-virtual {v2, v3, p2, v7}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 48
    iput v6, v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/c;->c:I

    invoke-virtual {p0, p1, v0}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/e;->b(ZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_5

    goto :goto_3

    :cond_5
    :goto_1
    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_7

    .line 49
    iput v5, v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/c;->c:I

    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/e;->d(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    goto :goto_3

    .line 50
    :cond_6
    :goto_2
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    .line 51
    :cond_7
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->d()Z

    move-result p1

    if-eqz p1, :cond_9

    .line 52
    iput v4, v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/c;->c:I

    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/e;->d(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8

    :goto_3
    return-object v1

    .line 53
    :cond_8
    :goto_4
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    .line 54
    :cond_9
    sget-object p1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 55
    iget-object p1, p1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 56
    const-string/jumbo p2, "showDocumentTypeSelector, request selector"

    invoke-virtual {p1, v3, p2, v7}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 57
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->m:Lcom/sumsub/sns/core/presentation/base/C;

    .line 58
    instance-of p2, p1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/f;

    if-eqz p2, :cond_a

    move-object v7, p1

    check-cast v7, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/f;

    :cond_a
    if-eqz v7, :cond_b

    .line 59
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->a:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 60
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getType()Lcom/sumsub/sns/internal/features/data/model/common/X;

    move-result-object p1

    .line 61
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/model/common/X;->a:Ljava/lang/String;

    .line 62
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->a()Ljava/lang/String;

    move-result-object p1

    check-cast v7, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/t;

    .line 63
    new-instance p2, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/n;

    .line 64
    iget-object v0, v7, Lcom/sumsub/sns/internal/features/presentation/preview/h;->a:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 65
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getType()Lcom/sumsub/sns/internal/features/data/model/common/X;

    move-result-object v0

    .line 66
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/model/common/X;->a:Ljava/lang/String;

    .line 67
    invoke-direct {p2, v0, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/n;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 68
    invoke-virtual {v7, p2}, Lcom/sumsub/sns/core/presentation/base/C;->fireEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    .line 69
    :cond_b
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final a(Ljava/lang/String;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final b(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/a;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/a;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/a;->e:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/a;->e:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/a;

    invoke-direct {v0, p0, p3}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/a;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/e;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p3, v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/a;->c:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 35
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/a;->e:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/a;->b:Ljava/lang/String;

    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/a;->a:Ljava/lang/String;

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 36
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "onDocumentAndCountrySelected: c="

    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", t="

    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    .line 37
    sget-object v2, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 38
    iget-object v2, v2, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 39
    const-string v6, "DocCapture"

    invoke-virtual {v2, v6, p3, v5}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 40
    iget-object p3, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->d:Lcom/sumsub/sns/internal/features/domain/t;

    .line 41
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->a:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 42
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/a;->a:Ljava/lang/String;

    iput-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/a;->b:Ljava/lang/String;

    iput v4, v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/a;->e:I

    invoke-virtual {p3, v2, p1, p2, v0}, Lcom/sumsub/sns/internal/features/domain/t;->a(Lcom/sumsub/sns/internal/features/data/model/common/Document;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_4

    goto :goto_2

    .line 43
    :cond_4
    :goto_1
    check-cast p3, Lcom/sumsub/sns/internal/features/domain/documents/DocumentSideness;

    .line 44
    invoke-virtual {p0, p1, p2, p3}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/e;->b(Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/features/domain/documents/DocumentSideness;)V

    .line 45
    iput-object v5, v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/a;->a:Ljava/lang/String;

    iput-object v5, v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/a;->b:Ljava/lang/String;

    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/a;->e:I

    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/e;->d(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    .line 46
    :cond_5
    :goto_3
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final b(ZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 8

    instance-of v0, p2, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/d;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/d;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/d;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/d;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/d;

    invoke-direct {v0, p0, p2}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/d;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/e;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/d;->a:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 1
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/d;->c:I

    const/4 v3, 0x0

    const/4 v4, 0x0

    const-string v5, "DocCapture"

    const/4 v6, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v6, :cond_1

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 2
    sget-object p2, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 3
    iget-object v2, p2, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 4
    const-string/jumbo v7, "tryApplyPreferredDefinitions"

    invoke-virtual {v2, v5, v7, v4}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    if-eqz p1, :cond_3

    .line 5
    iget-object p1, p2, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 6
    const-string p2, "Preferred definitions will not be applied"

    invoke-virtual {p1, v5, p2, v4}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 7
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    .line 8
    :cond_3
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/e;->A:Lcom/sumsub/sns/internal/features/domain/E;

    .line 9
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->a:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 10
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->a()Ljava/lang/String;

    move-result-object v2

    iput v6, v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/d;->c:I

    invoke-virtual {p1, p2, v2, v0}, Lcom/sumsub/sns/internal/features/domain/E;->a(Lcom/sumsub/sns/internal/features/data/model/common/Document;Ljava/lang/String;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    return-object v1

    .line 11
    :cond_4
    :goto_1
    check-cast p2, Lcom/sumsub/sns/internal/features/domain/documents/a;

    if-eqz p2, :cond_5

    .line 12
    iget-object p1, p2, Lcom/sumsub/sns/internal/features/domain/documents/a;->a:Ljava/lang/String;

    .line 13
    iget-object v0, p2, Lcom/sumsub/sns/internal/features/domain/documents/a;->b:Ljava/lang/String;

    .line 14
    iget-object p2, p2, Lcom/sumsub/sns/internal/features/domain/documents/a;->c:Lcom/sumsub/sns/internal/features/domain/documents/DocumentSideness;

    .line 15
    invoke-virtual {p0, p1, v0, p2}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/e;->b(Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/features/domain/documents/DocumentSideness;)V

    .line 16
    sget-object p1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 17
    iget-object p1, p1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 18
    const-string p2, "Preferred definitions applied"

    invoke-virtual {p1, v5, p2, v4}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    move v3, v6

    .line 19
    :cond_5
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/features/domain/documents/DocumentSideness;)V
    .locals 4

    .line 20
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "applyDocumentInfo: country="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", idDocType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", sideness="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 21
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 22
    iget-object v1, v1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 23
    const-string v2, "DocCapture"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v0, v3}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 24
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->t:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/utils/M;->x:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x6

    aget-object v2, v1, v2

    .line 25
    iget-object v2, v0, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 26
    iget-object v0, v0, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    invoke-virtual {v2, v0, p1}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 27
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->u:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    const/4 v0, 0x7

    aget-object v0, v1, v0

    .line 28
    iget-object v0, p1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 29
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    invoke-virtual {v0, p1, p2}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 30
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->l:Lcom/sumsub/sns/internal/features/presentation/utils/m;

    .line 31
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/utils/m;->d:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 32
    sget-object p2, Lcom/sumsub/sns/internal/features/presentation/utils/m;->e:[Lkotlin/reflect/KProperty;

    const/4 v0, 0x1

    aget-object p2, p2, v0

    .line 33
    iget-object p2, p1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 34
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    invoke-virtual {p2, p1, p3}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public final d(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 5

    .line 1
    .line 2
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/b;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p1

    .line 6
    .line 7
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/b;

    .line 8
    .line 9
    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/b;->c:I

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
    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/b;->c:I

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/b;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p0, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/b;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/e;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    .line 25
    .line 26
    :goto_0
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/b;->a:Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/b;->c:I

    .line 33
    const/4 v3, 0x1

    .line 34
    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    if-ne v2, v3, :cond_1

    .line 38
    .line 39
    .line 40
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 41
    goto :goto_2

    .line 42
    .line 43
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 44
    .line 45
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 46
    .line 47
    .line 48
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 49
    throw p1

    .line 50
    .line 51
    .line 52
    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->a()Ljava/lang/String;

    .line 56
    move-result-object p1

    .line 57
    .line 58
    if-eqz p1, :cond_4

    .line 59
    .line 60
    .line 61
    invoke-static {p1}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    .line 62
    move-result p1

    .line 63
    .line 64
    if-eqz p1, :cond_3

    .line 65
    goto :goto_1

    .line 66
    .line 67
    .line 68
    :cond_3
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->b()Ljava/lang/String;

    .line 69
    move-result-object p1

    .line 70
    .line 71
    .line 72
    invoke-static {p1}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    .line 73
    move-result p1

    .line 74
    .line 75
    if-nez p1, :cond_4

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->b()Ljava/lang/String;

    .line 79
    move-result-object p1

    .line 80
    .line 81
    const-string v2, "OTHER"

    .line 82
    .line 83
    .line 84
    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 85
    move-result p1

    .line 86
    .line 87
    if-eqz p1, :cond_6

    .line 88
    .line 89
    :cond_4
    :goto_1
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/e;->z:Lcom/sumsub/sns/internal/features/domain/h;

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->a()Ljava/lang/String;

    .line 93
    move-result-object v2

    .line 94
    .line 95
    iget-object v4, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->a:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 96
    .line 97
    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/b;->c:I

    .line 98
    .line 99
    .line 100
    invoke-virtual {p1, v4, v2, v0}, Lcom/sumsub/sns/internal/features/domain/h;->a(Lcom/sumsub/sns/internal/features/data/model/common/Document;Ljava/lang/String;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 101
    move-result-object p1

    .line 102
    .line 103
    if-ne p1, v1, :cond_5

    .line 104
    return-object v1

    .line 105
    .line 106
    :cond_5
    :goto_2
    check-cast p1, Lcom/sumsub/sns/internal/features/domain/f;

    .line 107
    .line 108
    iget-object v0, p1, Lcom/sumsub/sns/internal/features/domain/f;->a:Ljava/lang/String;

    .line 109
    .line 110
    iget-object v1, p1, Lcom/sumsub/sns/internal/features/domain/f;->b:Ljava/lang/String;

    .line 111
    .line 112
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/domain/f;->c:Lcom/sumsub/sns/internal/features/domain/documents/DocumentSideness;

    .line 113
    .line 114
    .line 115
    invoke-virtual {p0, v0, v1, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/e;->b(Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/features/domain/documents/DocumentSideness;)V

    .line 116
    .line 117
    .line 118
    :cond_6
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->a()Ljava/lang/String;

    .line 119
    move-result-object p1

    .line 120
    .line 121
    .line 122
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->b()Ljava/lang/String;

    .line 123
    move-result-object v0

    .line 124
    .line 125
    new-instance v1, Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 129
    .line 130
    .line 131
    const-string/jumbo v2, "showCamera, country="

    .line 132
    .line 133
    .line 134
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    const-string p1, ", idDocType="

    .line 140
    .line 141
    .line 142
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 149
    move-result-object p1

    .line 150
    .line 151
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 152
    .line 153
    iget-object v0, v0, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 154
    .line 155
    const-string v1, "DocCapture"

    .line 156
    const/4 v2, 0x0

    .line 157
    .line 158
    .line 159
    invoke-virtual {v0, v1, p1, v2}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 160
    .line 161
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->m:Lcom/sumsub/sns/core/presentation/base/C;

    .line 162
    .line 163
    if-eqz p1, :cond_7

    .line 164
    const/4 v0, 0x0

    .line 165
    .line 166
    .line 167
    invoke-interface {p1, v0}, Lcom/sumsub/sns/internal/features/presentation/utils/N;->b(Z)V

    .line 168
    .line 169
    :cond_7
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 170
    return-object p1
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

.method public final j()Z
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->l:Lcom/sumsub/sns/internal/features/presentation/utils/m;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/utils/m;->a()Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    sget-object v1, Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;->Front:Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v3, 0x1

    .line 11
    .line 12
    if-ne v0, v1, :cond_1

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->c()Ljava/util/List;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 20
    move-result v0

    .line 21
    .line 22
    if-nez v0, :cond_0

    .line 23
    return v3

    .line 24
    :cond_0
    return v2

    .line 25
    .line 26
    .line 27
    :cond_1
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->c()Ljava/util/List;

    .line 28
    move-result-object v0

    .line 29
    .line 30
    .line 31
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 32
    move-result v0

    .line 33
    .line 34
    if-le v0, v3, :cond_2

    .line 35
    return v3

    .line 36
    :cond_2
    return v2
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
