.class public abstract Lcom/sumsub/sns/internal/core/common/n;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# direct methods
.method public static final a(Ljava/lang/Throwable;Landroid/os/Parcelable;)Lcom/sumsub/sns/internal/features/data/model/common/l0;
    .locals 5

    .line 1
    instance-of v0, p0, Lcom/sumsub/sns/core/data/model/SNSException$Api;

    const/4 v1, 0x4

    const/4 v2, 0x0

    if-eqz v0, :cond_10

    check-cast p0, Lcom/sumsub/sns/core/data/model/SNSException$Api;

    .line 2
    invoke-virtual {p0}, Lcom/sumsub/sns/core/data/model/SNSException$Api;->getErrorCode()Ljava/lang/Integer;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const/16 v4, 0x3e8

    if-eq v3, v4, :cond_f

    :goto_0
    if-nez v0, :cond_1

    goto :goto_1

    .line 4
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const/16 v4, 0x3e9

    if-eq v3, v4, :cond_f

    :goto_1
    if-nez v0, :cond_2

    goto :goto_2

    .line 5
    :cond_2
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const/16 v4, 0x3ea

    if-eq v3, v4, :cond_f

    :goto_2
    if-nez v0, :cond_3

    goto :goto_3

    .line 6
    :cond_3
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const/16 v4, 0x3eb

    if-eq v3, v4, :cond_f

    :goto_3
    if-nez v0, :cond_4

    goto :goto_4

    .line 7
    :cond_4
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const/16 v4, 0x3ec

    if-eq v3, v4, :cond_f

    :goto_4
    if-nez v0, :cond_5

    goto :goto_5

    .line 8
    :cond_5
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const/16 v4, 0x3ed

    if-eq v3, v4, :cond_f

    :goto_5
    if-nez v0, :cond_6

    goto :goto_6

    .line 9
    :cond_6
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const/16 v4, 0x3ee

    if-eq v3, v4, :cond_f

    :goto_6
    if-nez v0, :cond_7

    goto :goto_7

    .line 10
    :cond_7
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const/16 v4, 0x3ef

    if-eq v3, v4, :cond_f

    :goto_7
    if-nez v0, :cond_8

    goto :goto_8

    .line 11
    :cond_8
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const/16 v4, 0x7d0

    if-eq v3, v4, :cond_f

    :goto_8
    if-nez v0, :cond_9

    goto :goto_9

    .line 12
    :cond_9
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const/16 v4, 0x7d1

    if-eq v3, v4, :cond_f

    :goto_9
    if-nez v0, :cond_a

    goto :goto_a

    .line 13
    :cond_a
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const/16 v4, 0x7d2

    if-eq v3, v4, :cond_f

    :goto_a
    if-nez v0, :cond_b

    goto :goto_b

    .line 14
    :cond_b
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const/16 v4, 0x7d3

    if-eq v3, v4, :cond_f

    :goto_b
    if-nez v0, :cond_c

    goto :goto_c

    .line 15
    :cond_c
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const/16 v4, 0x7d4

    if-eq v3, v4, :cond_f

    :goto_c
    if-nez v0, :cond_d

    goto :goto_d

    .line 16
    :cond_d
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v3, 0x7d5

    if-ne v0, v3, :cond_e

    goto :goto_e

    .line 17
    :cond_e
    :goto_d
    new-instance v0, Lcom/sumsub/sns/internal/features/data/model/common/e0;

    invoke-direct {v0, p0, p1, v2, v1}, Lcom/sumsub/sns/internal/features/data/model/common/e0;-><init>(Ljava/lang/Throwable;Landroid/os/Parcelable;Lcom/sumsub/sns/internal/features/data/model/common/c0;I)V

    return-object v0

    .line 18
    :cond_f
    :goto_e
    new-instance v0, Lcom/sumsub/sns/internal/features/data/model/common/k0;

    invoke-virtual {p0}, Lcom/sumsub/sns/core/data/model/SNSException$Api;->getDescription()Ljava/lang/String;

    move-result-object v1

    .line 19
    invoke-direct {v0, v1, p0, p1, v2}, Lcom/sumsub/sns/internal/features/data/model/common/k0;-><init>(Ljava/lang/String;Lcom/sumsub/sns/core/data/model/SNSException$Api;Landroid/os/Parcelable;Lcom/sumsub/sns/internal/features/data/model/common/c0;)V

    return-object v0

    .line 20
    :cond_10
    instance-of v0, p0, Ljava/io/IOException;

    if-nez v0, :cond_13

    .line 21
    instance-of v0, p0, Lcom/sumsub/sns/core/data/model/SNSException$Network;

    if-eqz v0, :cond_11

    goto :goto_f

    .line 22
    :cond_11
    instance-of v0, p0, Ljava/util/concurrent/CancellationException;

    if-eqz v0, :cond_12

    return-object v2

    .line 23
    :cond_12
    new-instance v0, Lcom/sumsub/sns/internal/features/data/model/common/e0;

    invoke-direct {v0, p0, p1, v2, v1}, Lcom/sumsub/sns/internal/features/data/model/common/e0;-><init>(Ljava/lang/Throwable;Landroid/os/Parcelable;Lcom/sumsub/sns/internal/features/data/model/common/c0;I)V

    return-object v0

    .line 24
    :cond_13
    :goto_f
    new-instance v0, Lcom/sumsub/sns/internal/features/data/model/common/i0;

    invoke-direct {v0, p0, p1, v1}, Lcom/sumsub/sns/internal/features/data/model/common/i0;-><init>(Ljava/lang/Throwable;Landroid/os/Parcelable;I)V

    return-object v0
.end method

.method public static final a(Ljava/lang/Throwable;Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;)Ljava/lang/String;
    .locals 1

    .line 25
    instance-of v0, p0, Lcom/sumsub/sns/core/data/model/SNSException$Api;

    if-eqz v0, :cond_0

    check-cast p0, Lcom/sumsub/sns/core/data/model/SNSException$Api;

    invoke-virtual {p0}, Lcom/sumsub/sns/core/data/model/SNSException$Api;->getDescription()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 26
    :cond_0
    instance-of v0, p0, Lcom/sumsub/sns/core/data/model/SNSException$Network;

    if-eqz v0, :cond_1

    const-string/jumbo p0, "sns_oops_network_html"

    invoke-virtual {p1, p0}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 27
    :cond_1
    instance-of p1, p0, Lcom/sumsub/sns/core/data/model/SNSException$Unknown;

    if-eqz p1, :cond_2

    check-cast p0, Lcom/sumsub/sns/core/data/model/SNSException$Unknown;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 28
    :cond_2
    const-string p0, "Unknown exception"

    return-object p0
.end method
