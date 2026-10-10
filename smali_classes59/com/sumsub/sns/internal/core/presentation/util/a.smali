.class public abstract Lcom/sumsub/sns/internal/core/presentation/util/a;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# direct methods
.method public static final a(Landroid/widget/EditText;Lcom/sumsub/sns/internal/features/data/model/common/M0;)V
    .locals 2

    .line 36
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/data/model/common/z0;

    if-eqz v0, :cond_0

    .line 37
    new-instance v0, Landroid/text/InputFilter$LengthFilter;

    check-cast p1, Lcom/sumsub/sns/internal/features/data/model/common/z0;

    .line 38
    iget p1, p1, Lcom/sumsub/sns/internal/features/data/model/common/z0;->a:I

    .line 39
    invoke-direct {v0, p1}, Landroid/text/InputFilter$LengthFilter;-><init>(I)V

    filled-new-array {v0}, [Landroid/text/InputFilter$LengthFilter;

    move-result-object p1

    check-cast p1, [Landroid/text/InputFilter;

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setFilters([Landroid/text/InputFilter;)V

    return-void

    .line 40
    :cond_0
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/data/model/common/B0;

    if-nez v0, :cond_6

    .line 41
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/data/model/common/F0;

    if-nez v0, :cond_6

    .line 42
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/data/model/common/t0;

    if-eqz v0, :cond_1

    goto :goto_0

    .line 43
    :cond_1
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/data/model/common/H0;

    if-eqz v0, :cond_2

    const/4 p1, 0x2

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    goto :goto_1

    .line 44
    :cond_2
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/data/model/common/x0;

    const/16 v1, 0x20

    if-eqz v0, :cond_3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    goto :goto_1

    .line 45
    :cond_3
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/data/model/common/r0;

    if-eqz v0, :cond_4

    const/16 p1, 0x2001

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    goto :goto_1

    .line 46
    :cond_4
    instance-of p1, p1, Lcom/sumsub/sns/internal/features/data/model/common/p0;

    if-eqz p1, :cond_5

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    goto :goto_1

    :cond_5
    const/4 p1, 0x0

    goto :goto_1

    :cond_6
    :goto_0
    const/16 p1, 0x2002

    .line 47
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    :goto_1
    if-eqz p1, :cond_7

    .line 48
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setInputType(I)V

    :cond_7
    return-void
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/data/model/common/M0;Ljava/lang/String;)Z
    .locals 7

    const/4 v0, 0x1

    if-eqz p0, :cond_16

    if-eqz p1, :cond_16

    .line 1
    invoke-static {p1}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_1

    .line 2
    :cond_0
    instance-of v1, p0, Lcom/sumsub/sns/internal/features/data/model/common/n0;

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    .line 3
    invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C

    move-result-object p0

    .line 4
    array-length p1, p0

    move v1, v2

    :goto_0
    if-ge v1, p1, :cond_2

    aget-char v3, p0, v1

    .line 5
    invoke-static {v3}, Ljava/lang/Character;->isLetter(C)Z

    move-result v4

    if-nez v4, :cond_1

    invoke-static {v3}, Ljava/lang/Character;->isSpaceChar(C)Z

    move-result v3

    if-nez v3, :cond_1

    return v2

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return v0

    .line 6
    :cond_3
    instance-of v1, p0, Lcom/sumsub/sns/internal/features/data/model/common/t0;

    if-eqz v1, :cond_5

    check-cast p0, Lcom/sumsub/sns/internal/features/data/model/common/t0;

    .line 7
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/data/model/common/t0;->a:Lcom/sumsub/sns/internal/features/data/model/common/remote/K;

    .line 8
    invoke-static {p1}, Lkotlin/text/StringsKt;->toDoubleOrNull(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object p1

    if-nez p1, :cond_4

    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return v2

    .line 10
    :cond_4
    iget-wide v0, p0, Lcom/sumsub/sns/internal/features/data/model/common/remote/K;->a:D

    .line 11
    iget-wide v2, p0, Lcom/sumsub/sns/internal/features/data/model/common/remote/K;->b:D

    invoke-static {v0, v1, v2, v3}, Lkotlin/ranges/RangesKt;->rangeTo(DD)Lkotlin/ranges/ClosedFloatingPointRange;

    move-result-object p0

    invoke-interface {p0, p1}, Lkotlin/ranges/ClosedFloatingPointRange;->contains(Ljava/lang/Comparable;)Z

    move-result p0

    return p0

    .line 12
    :cond_5
    instance-of v1, p0, Lcom/sumsub/sns/internal/features/data/model/common/x0;

    const/4 v3, 0x2

    const-string v4, "(?:[a-z0-9!#$%&\'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&\'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:(2(5[0-5]|[0-4][0-9])|1[0-9][0-9]|[1-9]?[0-9]))\\.){3}(?:(2(5[0-5]|[0-4][0-9])|1[0-9][0-9]|[1-9]?[0-9])|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])"

    if-eqz v1, :cond_6

    .line 13
    invoke-static {v4, v3}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object p0

    .line 14
    invoke-virtual {p0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p0

    .line 15
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->matches()Z

    move-result p0

    return p0

    .line 16
    :cond_6
    instance-of v1, p0, Lcom/sumsub/sns/internal/features/data/model/common/B0;

    const-wide/16 v5, 0x0

    if-eqz v1, :cond_9

    invoke-static {p1}, Lkotlin/text/StringsKt;->toDoubleOrNull(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object p1

    if-eqz p1, :cond_7

    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v5

    :cond_7
    check-cast p0, Lcom/sumsub/sns/internal/features/data/model/common/B0;

    .line 17
    iget-wide p0, p0, Lcom/sumsub/sns/internal/features/data/model/common/B0;->a:D

    cmpg-double p0, v5, p0

    if-gtz p0, :cond_8

    return v0

    :cond_8
    return v2

    .line 18
    :cond_9
    instance-of v1, p0, Lcom/sumsub/sns/internal/features/data/model/common/F0;

    if-eqz v1, :cond_c

    invoke-static {p1}, Lkotlin/text/StringsKt;->toDoubleOrNull(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object p1

    if-eqz p1, :cond_a

    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v5

    :cond_a
    check-cast p0, Lcom/sumsub/sns/internal/features/data/model/common/F0;

    .line 19
    iget-wide p0, p0, Lcom/sumsub/sns/internal/features/data/model/common/F0;->a:D

    cmpl-double p0, v5, p0

    if-ltz p0, :cond_b

    return v0

    :cond_b
    return v2

    .line 20
    :cond_c
    instance-of v1, p0, Lcom/sumsub/sns/internal/features/data/model/common/H0;

    if-eqz v1, :cond_d

    .line 21
    invoke-static {p1}, Landroid/text/TextUtils;->isDigitsOnly(Ljava/lang/CharSequence;)Z

    move-result p0

    return p0

    .line 22
    :cond_d
    instance-of v1, p0, Lcom/sumsub/sns/internal/features/data/model/common/J0;

    if-eqz v1, :cond_e

    new-instance v0, Lkotlin/text/Regex;

    check-cast p0, Lcom/sumsub/sns/internal/features/data/model/common/J0;

    .line 23
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/data/model/common/J0;->a:Ljava/lang/String;

    .line 24
    invoke-direct {v0, p0}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lkotlin/text/Regex;->matches(Ljava/lang/CharSequence;)Z

    move-result p0

    return p0

    .line 25
    :cond_e
    instance-of v1, p0, Lcom/sumsub/sns/internal/features/data/model/common/L0;

    if-eqz v1, :cond_f

    invoke-static {p1}, Landroid/telephony/PhoneNumberUtils;->isGlobalPhoneNumber(Ljava/lang/String;)Z

    move-result p0

    return p0

    .line 26
    :cond_f
    instance-of v1, p0, Lcom/sumsub/sns/internal/features/data/model/common/z0;

    if-eqz v1, :cond_11

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    check-cast p0, Lcom/sumsub/sns/internal/features/data/model/common/z0;

    .line 27
    iget p0, p0, Lcom/sumsub/sns/internal/features/data/model/common/z0;->a:I

    if-gt p1, p0, :cond_10

    return v0

    :cond_10
    return v2

    .line 28
    :cond_11
    instance-of v1, p0, Lcom/sumsub/sns/internal/features/data/model/common/D0;

    if-eqz v1, :cond_13

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    check-cast p0, Lcom/sumsub/sns/internal/features/data/model/common/D0;

    .line 29
    iget p0, p0, Lcom/sumsub/sns/internal/features/data/model/common/D0;->a:I

    if-lt p1, p0, :cond_12

    return v0

    :cond_12
    return v2

    .line 30
    :cond_13
    instance-of v1, p0, Lcom/sumsub/sns/internal/features/data/model/common/r0;

    if-eqz v1, :cond_14

    return v0

    .line 31
    :cond_14
    instance-of p0, p0, Lcom/sumsub/sns/internal/features/data/model/common/p0;

    if-eqz p0, :cond_15

    .line 32
    invoke-static {v4, v3}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object p0

    .line 33
    invoke-virtual {p0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p0

    .line 34
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->matches()Z

    move-result p0

    return p0

    .line 35
    :cond_15
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_16
    :goto_1
    return v0
.end method
