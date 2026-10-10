.class public final Lgf/j;
.super Ljava/lang/Object;
.source "CoinSymbolRateEx.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001aZ\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\t\u001a\u00020\u00072\u0008\u0008\u0002\u0010\n\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\r2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000b\u001aP\u0010\u000f\u001a\u00020\u0001*\u00020\u00022\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u00012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\t\u001a\u00020\u00072\u0008\u0008\u0002\u0010\n\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\r\u00a8\u0006\u0011"
    }
    d2 = {
        "formatCurrencyDisplay",
        "",
        "Ljava/math/BigDecimal;",
        "currency",
        "roundingMode",
        "Ljava/math/RoundingMode;",
        "keepZero",
        "",
        "isShowLess",
        "isGroup",
        "miniPrecision",
        "",
        "cLocale",
        "Ljava/util/Locale;",
        "precision",
        "formatSymbolDisplay",
        "symbol",
        "LDataProvider_googleRelease"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/RoundingMode;ZZZILjava/util/Locale;I)Ljava/lang/String;
    .locals 8
    .param p0    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/math/RoundingMode;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p7    # Ljava/util/Locale;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string p1, "<this>"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string p1, "roundingMode"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    const-string p1, "cLocale"

    .line 13
    .line 14
    .line 15
    invoke-static {p7, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    move-object v0, p0

    .line 17
    move-object v1, p2

    .line 18
    move v3, p3

    .line 19
    move v4, p4

    .line 20
    move v5, p5

    .line 21
    move v6, p6

    .line 22
    move-object v7, p7

    .line 23
    .line 24
    move/from16 v2, p8

    .line 25
    .line 26
    .line 27
    invoke-static/range {v0 .. v7}, Llf/b;->d(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZILjava/util/Locale;)Ljava/lang/String;

    .line 28
    move-result-object p0

    .line 29
    return-object p0
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
.end method

.method public static synthetic b(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/RoundingMode;ZZZILjava/util/Locale;IILjava/lang/Object;)Ljava/lang/String;
    .locals 8

    move/from16 v0, p9

    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_0

    .line 1
    sget-object v1, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    goto :goto_0

    :cond_0
    move-object v1, p2

    :goto_0
    and-int/lit8 v2, v0, 0x4

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    move v2, p3

    :goto_1
    and-int/lit8 v4, v0, 0x8

    if-eqz v4, :cond_2

    move v4, v3

    goto :goto_2

    :cond_2
    move v4, p4

    :goto_2
    and-int/lit8 v5, v0, 0x10

    if-eqz v5, :cond_3

    const/4 v5, 0x1

    goto :goto_3

    :cond_3
    move v5, p5

    :goto_3
    and-int/lit8 v6, v0, 0x20

    if-eqz v6, :cond_4

    goto :goto_4

    :cond_4
    move v3, p6

    :goto_4
    and-int/lit8 v6, v0, 0x40

    if-eqz v6, :cond_5

    .line 2
    sget-object v6, Lcom/kubi/sdk/function/language/a;->g:Lcom/kubi/sdk/function/language/LanguageType;

    invoke-virtual {v6}, Lcom/kubi/sdk/function/language/LanguageType;->getLocale()Ljava/util/Locale;

    move-result-object v6

    goto :goto_5

    :cond_5
    move-object v6, p7

    :goto_5
    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_7

    .line 3
    sget-object v0, Lcom/kubi/data/q;->a:Lcom/kubi/data/q;

    invoke-virtual {v0}, Lcom/kubi/data/q;->b()Lcom/kubi/data/t;

    move-result-object v0

    if-nez p1, :cond_6

    const-string v7, ""

    goto :goto_6

    :cond_6
    move-object v7, p1

    :goto_6
    invoke-virtual {v0, v7}, Lcom/kubi/data/t;->a(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    const/16 v7, 0xc

    invoke-static {v0, v7}, Lcom/kubi/utils/extensions/d;->k(Ljava/lang/Integer;I)I

    move-result v0

    move/from16 p10, v0

    :goto_7
    move-object p2, p0

    move-object p3, p1

    move-object p4, v1

    move p5, v2

    move/from16 p8, v3

    move p6, v4

    move p7, v5

    move-object/from16 p9, v6

    goto :goto_8

    :cond_7
    move/from16 p10, p8

    goto :goto_7

    .line 4
    :goto_8
    invoke-static/range {p2 .. p10}, Lgf/j;->a(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/RoundingMode;ZZZILjava/util/Locale;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static final c(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/RoundingMode;ZZZILjava/util/Locale;)Ljava/lang/String;
    .locals 9
    .param p0    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/math/RoundingMode;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p7    # Ljava/util/Locale;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "<this>"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "roundingMode"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    const-string v0, "cLocale"

    .line 13
    .line 14
    move-object/from16 v8, p7

    .line 15
    .line 16
    .line 17
    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    sget-object v0, Lcom/kubi/data/q;->a:Lcom/kubi/data/q;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Lcom/kubi/data/q;->b()Lcom/kubi/data/t;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    if-nez p1, :cond_0

    .line 26
    .line 27
    const-string p1, ""

    .line 28
    .line 29
    .line 30
    :cond_0
    invoke-virtual {v0, p1}, Lcom/kubi/data/t;->a(Ljava/lang/String;)Ljava/lang/Integer;

    .line 31
    move-result-object p1

    .line 32
    .line 33
    const/16 v0, 0xc

    .line 34
    .line 35
    .line 36
    invoke-static {p1, v0}, Lcom/kubi/utils/extensions/d;->k(Ljava/lang/Integer;I)I

    .line 37
    move-result v3

    .line 38
    move-object v1, p0

    .line 39
    move-object v2, p2

    .line 40
    move v4, p3

    .line 41
    move v5, p4

    .line 42
    move v6, p5

    .line 43
    move v7, p6

    .line 44
    .line 45
    .line 46
    invoke-static/range {v1 .. v8}, Llf/b;->d(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZILjava/util/Locale;)Ljava/lang/String;

    .line 47
    move-result-object p0

    .line 48
    return-object p0
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
.end method

.method public static synthetic d(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/RoundingMode;ZZZILjava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;
    .locals 6

    .line 1
    .line 2
    and-int/lit8 v0, p8, 0x2

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    sget-object v0, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    move-object v0, p2

    .line 9
    .line 10
    :goto_0
    and-int/lit8 v1, p8, 0x4

    .line 11
    const/4 v2, 0x0

    .line 12
    .line 13
    if-eqz v1, :cond_1

    .line 14
    move v1, v2

    .line 15
    goto :goto_1

    .line 16
    :cond_1
    move v1, p3

    .line 17
    .line 18
    :goto_1
    and-int/lit8 v3, p8, 0x8

    .line 19
    .line 20
    if-eqz v3, :cond_2

    .line 21
    move v3, v2

    .line 22
    goto :goto_2

    .line 23
    :cond_2
    move v3, p4

    .line 24
    .line 25
    :goto_2
    and-int/lit8 v4, p8, 0x10

    .line 26
    .line 27
    if-eqz v4, :cond_3

    .line 28
    const/4 v4, 0x1

    .line 29
    goto :goto_3

    .line 30
    :cond_3
    move v4, p5

    .line 31
    .line 32
    :goto_3
    and-int/lit8 v5, p8, 0x20

    .line 33
    .line 34
    if-eqz v5, :cond_4

    .line 35
    goto :goto_4

    .line 36
    :cond_4
    move v2, p6

    .line 37
    .line 38
    :goto_4
    and-int/lit8 v5, p8, 0x40

    .line 39
    .line 40
    if-eqz v5, :cond_5

    .line 41
    .line 42
    sget-object v5, Lcom/kubi/sdk/function/language/a;->g:Lcom/kubi/sdk/function/language/LanguageType;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v5}, Lcom/kubi/sdk/function/language/LanguageType;->getLocale()Ljava/util/Locale;

    .line 46
    move-result-object v5

    .line 47
    move-object p9, v5

    .line 48
    :goto_5
    move-object p2, p0

    .line 49
    move-object p3, p1

    .line 50
    move-object p4, v0

    .line 51
    move p5, v1

    .line 52
    move p8, v2

    .line 53
    move p6, v3

    .line 54
    move p7, v4

    .line 55
    goto :goto_6

    .line 56
    :cond_5
    move-object p9, p7

    .line 57
    goto :goto_5

    .line 58
    .line 59
    .line 60
    :goto_6
    invoke-static/range {p2 .. p9}, Lgf/j;->c(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/RoundingMode;ZZZILjava/util/Locale;)Ljava/lang/String;

    .line 61
    move-result-object v0

    .line 62
    return-object v0
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
.end method
