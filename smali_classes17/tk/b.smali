.class public final Ltk/b;
.super Ljava/lang/Object;
.source "HedgeIsolatedCalculator.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0010\u0008\n\u0002\u0008\u0006\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003JG\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u000c\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0087\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u000c\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\u001c"
    }
    d2 = {
        "Ltk/b;",
        "",
        "<init>",
        "()V",
        "",
        "isInverse",
        "Lrk/b;",
        "multiplier",
        "availableBalance",
        "estimatedPrice",
        "leverage",
        "takerFeeRate",
        "taxRate",
        "b",
        "(ZLrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;)Lrk/b;",
        "maxQty",
        "orderQty",
        "positionQty",
        "maintainMarginRate",
        "liquidationFeeRate",
        "posCost",
        "posMargin",
        "",
        "indexPricePrecision",
        "minPrice",
        "maxPrice",
        "a",
        "(ZLrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;ILrk/b;Lrk/b;)Lrk/b;",
        "shared_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nHedgeIsolatedCalculator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HedgeIsolatedCalculator.kt\ncom/kubi/kmm/trade/futures/hedge/HedgeIsolatedCalculator\n+ 2 NumberEx.kt\ncom/kubi/kmm/trade/utils/NumberExKt\n*L\n1#1,158:1\n18#2:159\n38#2,2:160\n55#2,2:162\n41#2:164\n30#2,4:165\n38#2,2:169\n55#2,2:171\n41#2:173\n30#2,4:174\n38#2,2:178\n55#2,2:180\n41#2:182\n52#2:183\n52#2:184\n52#2:185\n30#2,4:186\n52#2:190\n30#2,4:191\n52#2:195\n30#2,4:196\n*S KotlinDebug\n*F\n+ 1 HedgeIsolatedCalculator.kt\ncom/kubi/kmm/trade/futures/hedge/HedgeIsolatedCalculator\n*L\n47#1:159\n55#1:160,2\n55#1:162,2\n55#1:164\n55#1:165,4\n58#1:169,2\n58#1:171,2\n58#1:173\n60#1:174,4\n105#1:178,2\n105#1:180,2\n105#1:182\n107#1:183\n110#1:184\n118#1:185\n121#1:186,4\n134#1:190\n137#1:191,4\n140#1:195\n143#1:196,4\n*E\n"
    }
.end annotation


# static fields
.field public static final a:Ltk/b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Ltk/b;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ltk/b;-><init>()V

    .line 6
    .line 7
    sput-object v0, Ltk/b;->a:Ltk/b;

    .line 8
    return-void
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
    .line 82
    .line 83
    .line 84
.end method

.method public constructor <init>()V
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
    .line 82
    .line 83
    .line 84
.end method


# virtual methods
.method public final a(ZLrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;ILrk/b;Lrk/b;)Lrk/b;
    .locals 18
    .param p2    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p7    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p8    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p9    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p10    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p11    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p12    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p14    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p15    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    move/from16 v0, p1

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    move-object/from16 v3, p4

    move-object/from16 v4, p5

    move-object/from16 v5, p6

    move-object/from16 v6, p7

    move-object/from16 v7, p8

    move-object/from16 v8, p9

    move-object/from16 v9, p12

    const-string v10, "1"

    const-string v11, "0"

    const-string v12, "multiplier"

    invoke-static {v1, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "maxQty"

    invoke-static {v2, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "orderQty"

    invoke-static {v3, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "positionQty"

    invoke-static {v4, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "estimatedPrice"

    invoke-static {v5, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "leverage"

    invoke-static {v6, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "maintainMarginRate"

    invoke-static {v7, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "liquidationFeeRate"

    invoke-static {v8, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "posCost"

    move-object/from16 v13, p10

    invoke-static {v13, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "posMargin"

    move-object/from16 v14, p11

    invoke-static {v14, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "taxRate"

    invoke-static {v9, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "minPrice"

    move-object/from16 v15, p14

    invoke-static {v15, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "maxPrice"

    move-object/from16 v13, p15

    invoke-static {v13, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    :try_start_0
    sget-object v16, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 2
    sget-object v16, Lrk/a;->a:Lrk/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/16 v17, 0x0

    :try_start_1
    invoke-virtual/range {v16 .. v16}, Lrk/a;->b()Lrk/b;

    move-result-object v12

    invoke-virtual {v3, v12}, Lrk/b;->b(Lrk/b;)I

    move-result v12

    if-ltz v12, :cond_0

    move-object v12, v3

    goto :goto_0

    .line 3
    :cond_0
    new-instance v12, Lrk/b;

    const-string v13, "-1"

    invoke-direct {v12, v13}, Lrk/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v12}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object v12

    .line 4
    :goto_0
    invoke-virtual {v12, v2}, Lrk/b;->b(Lrk/b;)I

    move-result v2

    if-lez v2, :cond_1

    return-object v17

    .line 5
    :cond_1
    new-instance v2, Lrk/b;

    invoke-direct {v2, v11}, Lrk/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v2}, Lrk/b;->b(Lrk/b;)I

    move-result v2

    if-nez v2, :cond_2

    goto :goto_1

    :cond_2
    new-instance v2, Lrk/b;

    invoke-direct {v2, v11}, Lrk/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v2}, Lrk/b;->b(Lrk/b;)I

    move-result v2

    if-nez v2, :cond_3

    :goto_1
    return-object v17

    .line 6
    :cond_3
    invoke-virtual {v4, v3}, Lrk/b;->a(Lrk/b;)Lrk/b;

    move-result-object v2

    .line 7
    new-instance v4, Lrk/b;

    invoke-direct {v4, v11}, Lrk/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v4}, Lrk/b;->b(Lrk/b;)I

    move-result v4

    if-nez v4, :cond_4

    return-object v17

    .line 8
    :cond_4
    new-instance v4, Lrk/b;

    invoke-direct {v4, v11}, Lrk/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v4}, Lrk/b;->b(Lrk/b;)I

    move-result v4

    if-ltz v4, :cond_5

    const/4 v4, 0x1

    goto :goto_2

    :cond_5
    const/4 v4, 0x0

    .line 9
    :goto_2
    sget-object v12, Luk/a;->a:Luk/a;

    invoke-virtual {v12, v4, v0}, Luk/a;->b(ZZ)Lrk/b;

    move-result-object v12

    .line 10
    sget-object v13, Luk/b;->a:Luk/b;

    invoke-virtual {v13, v0, v1, v5, v3}, Luk/b;->g(ZLrk/b;Lrk/b;Lrk/b;)Lrk/b;

    move-result-object v3

    if-nez v3, :cond_6

    .line 11
    new-instance v3, Lrk/b;

    invoke-direct {v3, v11}, Lrk/b;-><init>(Ljava/lang/String;)V

    goto :goto_3

    :catchall_0
    move-exception v0

    goto/16 :goto_8

    .line 12
    :cond_6
    :goto_3
    new-instance v5, Lrk/b;

    invoke-direct {v5, v11}, Lrk/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v5}, Lrk/b;->b(Lrk/b;)I

    move-result v5

    if-nez v5, :cond_7

    return-object v17

    .line 13
    :cond_7
    invoke-virtual/range {p10 .. p11}, Lrk/b;->g(Lrk/b;)Lrk/b;

    move-result-object v5

    invoke-virtual {v5, v3}, Lrk/b;->a(Lrk/b;)Lrk/b;

    move-result-object v5

    .line 14
    invoke-virtual {v12, v3}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object v3

    .line 15
    sget-object v13, Lcom/kubi/kmm/trade/KMMRoundingMode;->HALF_UP:Lcom/kubi/kmm/trade/KMMRoundingMode;

    const/16 v14, 0x14

    .line 16
    invoke-virtual {v3, v6, v14, v13}, Lrk/b;->c(Lrk/b;ILcom/kubi/kmm/trade/KMMRoundingMode;)Lrk/b;

    move-result-object v3

    .line 17
    invoke-virtual {v5, v3}, Lrk/b;->g(Lrk/b;)Lrk/b;

    move-result-object v3

    .line 18
    invoke-virtual {v2, v1}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object v1

    .line 19
    new-instance v2, Lrk/b;

    invoke-direct {v2, v10}, Lrk/b;-><init>(Ljava/lang/String;)V

    .line 20
    invoke-virtual {v12, v7}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object v5

    .line 21
    invoke-virtual {v2, v5}, Lrk/b;->g(Lrk/b;)Lrk/b;

    move-result-object v2

    .line 22
    invoke-virtual {v12, v8}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object v5

    .line 23
    new-instance v6, Lrk/b;

    invoke-direct {v6, v10}, Lrk/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v9}, Lrk/b;->a(Lrk/b;)Lrk/b;

    move-result-object v6

    invoke-virtual {v5, v6}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object v5

    .line 24
    invoke-virtual {v2, v5}, Lrk/b;->g(Lrk/b;)Lrk/b;

    move-result-object v2

    .line 25
    invoke-virtual {v1, v2}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object v1

    if-nez v0, :cond_9

    .line 26
    new-instance v0, Lrk/b;

    invoke-direct {v0, v11}, Lrk/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Lrk/b;->b(Lrk/b;)I

    move-result v0

    if-nez v0, :cond_8

    return-object v17

    .line 27
    :cond_8
    invoke-virtual {v3, v1, v14, v13}, Lrk/b;->c(Lrk/b;ILcom/kubi/kmm/trade/KMMRoundingMode;)Lrk/b;

    move-result-object v0

    goto :goto_4

    .line 28
    :cond_9
    new-instance v0, Lrk/b;

    invoke-direct {v0, v11}, Lrk/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Lrk/b;->b(Lrk/b;)I

    move-result v0

    if-nez v0, :cond_a

    return-object v17

    .line 29
    :cond_a
    invoke-virtual {v1, v3, v14, v13}, Lrk/b;->c(Lrk/b;ILcom/kubi/kmm/trade/KMMRoundingMode;)Lrk/b;

    move-result-object v0

    .line 30
    :goto_4
    new-instance v1, Lrk/b;

    invoke-direct {v1, v11}, Lrk/b;-><init>(Ljava/lang/String;)V

    .line 31
    invoke-virtual {v0, v1}, Lrk/b;->b(Lrk/b;)I

    move-result v1

    if-gez v1, :cond_c

    if-eqz v4, :cond_b

    move-object v0, v15

    goto :goto_5

    :cond_b
    move-object/from16 v0, p15

    :cond_c
    :goto_5
    if-eqz v4, :cond_d

    .line 32
    sget-object v1, Lcom/kubi/kmm/trade/KMMRoundingMode;->UP:Lcom/kubi/kmm/trade/KMMRoundingMode;

    :goto_6
    move/from16 v2, p13

    goto :goto_7

    :cond_d
    sget-object v1, Lcom/kubi/kmm/trade/KMMRoundingMode;->DOWN:Lcom/kubi/kmm/trade/KMMRoundingMode;

    goto :goto_6

    :goto_7
    invoke-virtual {v0, v2, v1}, Lrk/b;->f(ILcom/kubi/kmm/trade/KMMRoundingMode;)Lrk/b;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-object v0

    :catchall_1
    move-exception v0

    const/16 v17, 0x0

    .line 33
    :goto_8
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 34
    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_e

    move-object/from16 v12, v17

    goto :goto_9

    :cond_e
    move-object v12, v0

    :goto_9
    check-cast v12, Lrk/b;

    return-object v12
.end method

.method public final b(ZLrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;)Lrk/b;
    .locals 4
    .param p2    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p7    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    const-string v0, "1"

    .line 3
    .line 4
    const-string v1, "multiplier"

    .line 5
    .line 6
    .line 7
    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    const-string v1, "availableBalance"

    .line 10
    .line 11
    .line 12
    invoke-static {p3, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    const-string v1, "estimatedPrice"

    .line 15
    .line 16
    .line 17
    invoke-static {p4, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    const-string v1, "leverage"

    .line 20
    .line 21
    .line 22
    invoke-static {p5, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    const-string v1, "takerFeeRate"

    .line 25
    .line 26
    .line 27
    invoke-static {p6, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    const-string v1, "taxRate"

    .line 30
    .line 31
    .line 32
    invoke-static {p7, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    :try_start_0
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 35
    .line 36
    new-instance v1, Lrk/b;

    .line 37
    .line 38
    .line 39
    invoke-direct {v1, v0}, Lrk/b;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    sget-object v2, Lcom/kubi/kmm/trade/KMMRoundingMode;->HALF_UP:Lcom/kubi/kmm/trade/KMMRoundingMode;

    .line 42
    .line 43
    const/16 v3, 0xa

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1, p5, v3, v2}, Lrk/b;->c(Lrk/b;ILcom/kubi/kmm/trade/KMMRoundingMode;)Lrk/b;

    .line 47
    move-result-object p5

    .line 48
    .line 49
    new-instance v1, Lrk/b;

    .line 50
    .line 51
    .line 52
    invoke-direct {v1, v0}, Lrk/b;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1, p7}, Lrk/b;->a(Lrk/b;)Lrk/b;

    .line 56
    move-result-object p7

    .line 57
    .line 58
    .line 59
    invoke-virtual {p6, p7}, Lrk/b;->e(Lrk/b;)Lrk/b;

    .line 60
    move-result-object p6

    .line 61
    .line 62
    .line 63
    invoke-virtual {p5, p6}, Lrk/b;->a(Lrk/b;)Lrk/b;

    .line 64
    move-result-object p5

    .line 65
    .line 66
    new-instance p6, Lrk/b;

    .line 67
    .line 68
    .line 69
    invoke-direct {p6, v0}, Lrk/b;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 70
    .line 71
    const/16 p7, 0x14

    .line 72
    .line 73
    const-string v0, "-1"

    .line 74
    .line 75
    if-eqz p1, :cond_1

    .line 76
    .line 77
    .line 78
    :try_start_1
    invoke-virtual {p6, p2}, Lrk/b;->e(Lrk/b;)Lrk/b;

    .line 79
    move-result-object p1

    .line 80
    .line 81
    sget-object p2, Lrk/a;->a:Lrk/a;

    .line 82
    .line 83
    .line 84
    invoke-virtual {p2}, Lrk/a;->b()Lrk/b;

    .line 85
    move-result-object p2

    .line 86
    .line 87
    .line 88
    invoke-virtual {p1, p2}, Lrk/b;->b(Lrk/b;)I

    .line 89
    move-result p2

    .line 90
    .line 91
    if-ltz p2, :cond_0

    .line 92
    goto :goto_0

    .line 93
    .line 94
    :cond_0
    new-instance p2, Lrk/b;

    .line 95
    .line 96
    .line 97
    invoke-direct {p2, v0}, Lrk/b;-><init>(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p1, p2}, Lrk/b;->e(Lrk/b;)Lrk/b;

    .line 101
    move-result-object p1

    .line 102
    .line 103
    .line 104
    :goto_0
    invoke-virtual {p1, p4, p7, v2}, Lrk/b;->c(Lrk/b;ILcom/kubi/kmm/trade/KMMRoundingMode;)Lrk/b;

    .line 105
    move-result-object p1

    .line 106
    goto :goto_2

    .line 107
    :catchall_0
    move-exception p1

    .line 108
    goto :goto_3

    .line 109
    .line 110
    .line 111
    :cond_1
    invoke-virtual {p6, p2}, Lrk/b;->e(Lrk/b;)Lrk/b;

    .line 112
    move-result-object p1

    .line 113
    .line 114
    sget-object p2, Lrk/a;->a:Lrk/a;

    .line 115
    .line 116
    .line 117
    invoke-virtual {p2}, Lrk/a;->b()Lrk/b;

    .line 118
    move-result-object p2

    .line 119
    .line 120
    .line 121
    invoke-virtual {p1, p2}, Lrk/b;->b(Lrk/b;)I

    .line 122
    move-result p2

    .line 123
    .line 124
    if-ltz p2, :cond_2

    .line 125
    goto :goto_1

    .line 126
    .line 127
    :cond_2
    new-instance p2, Lrk/b;

    .line 128
    .line 129
    .line 130
    invoke-direct {p2, v0}, Lrk/b;-><init>(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {p1, p2}, Lrk/b;->e(Lrk/b;)Lrk/b;

    .line 134
    move-result-object p1

    .line 135
    .line 136
    .line 137
    :goto_1
    invoke-virtual {p4, p1}, Lrk/b;->e(Lrk/b;)Lrk/b;

    .line 138
    move-result-object p1

    .line 139
    .line 140
    .line 141
    :goto_2
    invoke-virtual {p1, p5}, Lrk/b;->e(Lrk/b;)Lrk/b;

    .line 142
    move-result-object p1

    .line 143
    .line 144
    .line 145
    invoke-virtual {p3, p1, p7, v2}, Lrk/b;->c(Lrk/b;ILcom/kubi/kmm/trade/KMMRoundingMode;)Lrk/b;

    .line 146
    move-result-object p1

    .line 147
    .line 148
    .line 149
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 151
    goto :goto_4

    .line 152
    .line 153
    :goto_3
    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 154
    .line 155
    .line 156
    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 157
    move-result-object p1

    .line 158
    .line 159
    .line 160
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 161
    move-result-object p1

    .line 162
    .line 163
    .line 164
    :goto_4
    invoke-static {p1}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    .line 165
    move-result p2

    .line 166
    .line 167
    if-eqz p2, :cond_3

    .line 168
    const/4 p1, 0x0

    .line 169
    .line 170
    :cond_3
    check-cast p1, Lrk/b;

    .line 171
    return-object p1
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
    .line 245
.end method
