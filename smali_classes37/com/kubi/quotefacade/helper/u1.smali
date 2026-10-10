.class public final Lcom/kubi/quotefacade/helper/u1;
.super Ljava/lang/Object;
.source "QuoteAlphaChainEx.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u001a\u0010\u0010\u0004\u001a\u00020\u00052\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a8\u0006\u0007"
    }
    d2 = {
        "chainCoinPrice",
        "Landroid/text/SpannableStringBuilder;",
        "currentPriceUsd",
        "Ljava/math/BigDecimal;",
        "chainCoinVolume",
        "",
        "tokenTxVolumeUsd",
        "QuoteFacadeLib_googleRelease"
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
.method public static final a(Ljava/math/BigDecimal;)Landroid/text/SpannableStringBuilder;
    .locals 7
    .param p0    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    const/4 v5, 0x7

    .line 5
    const/4 v6, 0x0

    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x0

    .line 9
    move-object v1, p0

    .line 10
    .line 11
    .line 12
    :try_start_0
    invoke-static/range {v1 .. v6}, Lkf/b;->e(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/RoundingMode;IILjava/lang/Object;)Landroid/text/SpannableStringBuilder;

    .line 13
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    goto :goto_0

    .line 15
    .line 16
    :catch_0
    const-string p0, "ChainFavItemListAdapter"

    .line 17
    .line 18
    const-string v1, "volume parse number error"

    .line 19
    .line 20
    .line 21
    invoke-static {p0, v1}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    .line 23
    :cond_0
    :goto_0
    if-nez v0, :cond_1

    .line 24
    .line 25
    new-instance p0, Landroid/text/SpannableStringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-direct {p0}, Landroid/text/SpannableStringBuilder;-><init>()V

    .line 29
    .line 30
    const-string v0, "--"

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, v0}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    const-string p0, "append(...)"

    .line 37
    .line 38
    .line 39
    invoke-static {v0, p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    :cond_1
    return-object v0
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
.end method

.method public static final b(Ljava/lang/String;)Ljava/lang/String;
    .locals 3
    .param p0    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "--"

    .line 3
    .line 4
    if-eqz p0, :cond_0

    .line 5
    .line 6
    .line 7
    :try_start_0
    invoke-static {p0}, Lkotlin/text/StringsKt;->toBigDecimalOrNull(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 8
    move-result-object p0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    .line 12
    :goto_0
    if-eqz p0, :cond_2

    .line 13
    .line 14
    sget-object v1, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v1}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 18
    move-result v1

    .line 19
    .line 20
    if-gtz v1, :cond_1

    .line 21
    goto :goto_1

    .line 22
    .line 23
    .line 24
    :cond_1
    invoke-virtual {p0}, Ljava/math/BigDecimal;->doubleValue()D

    .line 25
    move-result-wide v1

    .line 26
    .line 27
    const-string p0, "USD"

    .line 28
    .line 29
    .line 30
    invoke-static {v1, v2, p0}, Lgf/i;->e(DLjava/lang/String;)Ljava/lang/String;

    .line 31
    move-result-object p0

    .line 32
    .line 33
    .line 34
    invoke-static {p0, v0}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 35
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 36
    return-object p0

    .line 37
    .line 38
    :catch_0
    const-string p0, "ChainFavItemListAdapter"

    .line 39
    .line 40
    const-string v1, "volume parse number error"

    .line 41
    .line 42
    .line 43
    invoke-static {p0, v1}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    :cond_2
    :goto_1
    return-object v0
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
.end method
