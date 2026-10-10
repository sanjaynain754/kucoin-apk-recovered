.class public final Lzo/d;
.super Ljava/lang/Object;
.source "MarginCouponConfig.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00022\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00042\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "isSame",
        "",
        "Lcom/kubi/margin/api/entity/MarginCouponConfig;",
        "other",
        "Lcom/kubi/margin/api/entity/CouponsOverview;",
        "MarginApi_googleRelease"
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
.method public static final a(Lcom/kubi/margin/api/entity/CouponsOverview;Lcom/kubi/margin/api/entity/CouponsOverview;)Z
    .locals 4
    .param p0    # Lcom/kubi/margin/api/entity/CouponsOverview;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p1    # Lcom/kubi/margin/api/entity/CouponsOverview;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v1, 0x0

    .line 8
    .line 9
    if-eqz p1, :cond_1

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/kubi/margin/api/entity/CouponsOverview;->getCouponNotUseNum()Ljava/lang/Integer;

    .line 13
    move-result-object v2

    .line 14
    goto :goto_0

    .line 15
    :cond_1
    move-object v2, v1

    .line 16
    .line 17
    :goto_0
    if-eqz p0, :cond_2

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/kubi/margin/api/entity/CouponsOverview;->getCouponNotUseNum()Ljava/lang/Integer;

    .line 21
    move-result-object v3

    .line 22
    goto :goto_1

    .line 23
    :cond_2
    move-object v3, v1

    .line 24
    .line 25
    .line 26
    :goto_1
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    move-result v2

    .line 28
    .line 29
    if-eqz v2, :cond_5

    .line 30
    .line 31
    if-eqz p0, :cond_3

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Lcom/kubi/margin/api/entity/CouponsOverview;->getUsingCoupon()Lcom/kubi/margin/api/entity/MarginCouponConfig;

    .line 35
    move-result-object p0

    .line 36
    goto :goto_2

    .line 37
    :cond_3
    move-object p0, v1

    .line 38
    .line 39
    :goto_2
    if-eqz p1, :cond_4

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1}, Lcom/kubi/margin/api/entity/CouponsOverview;->getUsingCoupon()Lcom/kubi/margin/api/entity/MarginCouponConfig;

    .line 43
    move-result-object v1

    .line 44
    .line 45
    .line 46
    :cond_4
    invoke-static {p0, v1}, Lzo/d;->b(Lcom/kubi/margin/api/entity/MarginCouponConfig;Lcom/kubi/margin/api/entity/MarginCouponConfig;)Z

    .line 47
    move-result p0

    .line 48
    .line 49
    if-eqz p0, :cond_5

    .line 50
    return v0

    .line 51
    :cond_5
    const/4 p0, 0x0

    .line 52
    return p0
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
.end method

.method public static final b(Lcom/kubi/margin/api/entity/MarginCouponConfig;Lcom/kubi/margin/api/entity/MarginCouponConfig;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    if-nez p0, :cond_0

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v1, 0x0

    .line 8
    .line 9
    if-eqz p0, :cond_1

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/kubi/margin/api/entity/MarginCouponConfig;->getActivityId()Ljava/lang/String;

    .line 13
    move-result-object v2

    .line 14
    goto :goto_0

    .line 15
    :cond_1
    move-object v2, v1

    .line 16
    .line 17
    :goto_0
    if-eqz p1, :cond_2

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Lcom/kubi/margin/api/entity/MarginCouponConfig;->getActivityId()Ljava/lang/String;

    .line 21
    move-result-object v3

    .line 22
    goto :goto_1

    .line 23
    :cond_2
    move-object v3, v1

    .line 24
    .line 25
    .line 26
    :goto_1
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    move-result v2

    .line 28
    .line 29
    if-eqz v2, :cond_9

    .line 30
    .line 31
    if-eqz p0, :cond_3

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Lcom/kubi/margin/api/entity/MarginCouponConfig;->getCouponId()Ljava/lang/String;

    .line 35
    move-result-object v2

    .line 36
    goto :goto_2

    .line 37
    :cond_3
    move-object v2, v1

    .line 38
    .line 39
    :goto_2
    if-eqz p1, :cond_4

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1}, Lcom/kubi/margin/api/entity/MarginCouponConfig;->getCouponId()Ljava/lang/String;

    .line 43
    move-result-object v3

    .line 44
    goto :goto_3

    .line 45
    :cond_4
    move-object v3, v1

    .line 46
    .line 47
    .line 48
    :goto_3
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 49
    move-result v2

    .line 50
    .line 51
    if-eqz v2, :cond_9

    .line 52
    .line 53
    if-eqz p0, :cond_5

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, Lcom/kubi/margin/api/entity/MarginCouponConfig;->getState()Ljava/lang/String;

    .line 57
    move-result-object v2

    .line 58
    goto :goto_4

    .line 59
    :cond_5
    move-object v2, v1

    .line 60
    .line 61
    :goto_4
    if-eqz p1, :cond_6

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1}, Lcom/kubi/margin/api/entity/MarginCouponConfig;->getState()Ljava/lang/String;

    .line 65
    move-result-object v3

    .line 66
    goto :goto_5

    .line 67
    :cond_6
    move-object v3, v1

    .line 68
    .line 69
    .line 70
    :goto_5
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 71
    move-result v2

    .line 72
    .line 73
    if-eqz v2, :cond_9

    .line 74
    .line 75
    if-eqz p0, :cond_7

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0}, Lcom/kubi/margin/api/entity/MarginCouponConfig;->getCurrency()Ljava/lang/String;

    .line 79
    move-result-object p0

    .line 80
    goto :goto_6

    .line 81
    :cond_7
    move-object p0, v1

    .line 82
    .line 83
    :goto_6
    if-eqz p1, :cond_8

    .line 84
    .line 85
    .line 86
    invoke-virtual {p1}, Lcom/kubi/margin/api/entity/MarginCouponConfig;->getCurrency()Ljava/lang/String;

    .line 87
    move-result-object v1

    .line 88
    .line 89
    .line 90
    :cond_8
    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 91
    move-result p0

    .line 92
    .line 93
    if-eqz p0, :cond_9

    .line 94
    return v0

    .line 95
    :cond_9
    const/4 p0, 0x0

    .line 96
    return p0
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
.end method
