.class public final Lmi/b;
.super Ljava/lang/Object;
.source "UnifiedFuturesCoupon.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/kubi/futures/trade/coupon/UnifiedFuturesCouponPanelMapper;",
        "",
        "<init>",
        "()V",
        "map",
        "Lcom/kubi/futures/trade/coupon/UnifiedFuturesFeeDeductionCoupon;",
        "entity",
        "Lcom/kubi/futures/trade/coupon/UnifiedFuturesCouponAvailableEntity;",
        "KumexLib_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nUnifiedFuturesCoupon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnifiedFuturesCoupon.kt\ncom/kubi/futures/trade/coupon/UnifiedFuturesCouponPanelMapper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,108:1\n295#2,2:109\n*S KotlinDebug\n*F\n+ 1 UnifiedFuturesCoupon.kt\ncom/kubi/futures/trade/coupon/UnifiedFuturesCouponPanelMapper\n*L\n74#1:109,2\n*E\n"
    }
.end annotation


# static fields
.field public static final a:Lmi/b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lmi/b;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lmi/b;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lmi/b;->a:Lmi/b;

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
.end method


# virtual methods
.method public final a(Lcom/kubi/futures/trade/coupon/UnifiedFuturesCouponAvailableEntity;)Lcom/kubi/futures/trade/coupon/UnifiedFuturesFeeDeductionCoupon;
    .locals 3
    .param p1    # Lcom/kubi/futures/trade/coupon/UnifiedFuturesCouponAvailableEntity;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    if-eqz p1, :cond_6

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/kubi/futures/trade/coupon/UnifiedFuturesCouponAvailableEntity;->getAvailableCoupons()Ljava/util/List;

    .line 7
    move-result-object p1

    .line 8
    .line 9
    if-eqz p1, :cond_6

    .line 10
    .line 11
    .line 12
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 13
    move-result-object p1

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    move-result v1

    .line 18
    .line 19
    if-eqz v1, :cond_3

    .line 20
    .line 21
    .line 22
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    move-result-object v1

    .line 24
    move-object v2, v1

    .line 25
    .line 26
    check-cast v2, Lcom/kubi/futures/trade/coupon/UnifiedFuturesCouponEntity;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2}, Lcom/kubi/futures/trade/coupon/UnifiedFuturesCouponEntity;->getTotalAmount()Ljava/lang/String;

    .line 30
    move-result-object v2

    .line 31
    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    .line 35
    invoke-static {v2}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    .line 36
    move-result v2

    .line 37
    .line 38
    if-eqz v2, :cond_1

    .line 39
    goto :goto_0

    .line 40
    :cond_1
    const/4 v2, 0x0

    .line 41
    goto :goto_1

    .line 42
    :cond_2
    :goto_0
    const/4 v2, 0x1

    .line 43
    .line 44
    :goto_1
    if-nez v2, :cond_0

    .line 45
    goto :goto_2

    .line 46
    :cond_3
    move-object v1, v0

    .line 47
    .line 48
    :goto_2
    check-cast v1, Lcom/kubi/futures/trade/coupon/UnifiedFuturesCouponEntity;

    .line 49
    .line 50
    if-eqz v1, :cond_6

    .line 51
    .line 52
    new-instance p1, Lcom/kubi/futures/trade/coupon/UnifiedFuturesFeeDeductionCoupon;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1}, Lcom/kubi/futures/trade/coupon/UnifiedFuturesCouponEntity;->getTotalAmount()Ljava/lang/String;

    .line 56
    move-result-object v0

    .line 57
    .line 58
    const-string v2, ""

    .line 59
    .line 60
    if-nez v0, :cond_4

    .line 61
    move-object v0, v2

    .line 62
    .line 63
    .line 64
    :cond_4
    invoke-virtual {v1}, Lcom/kubi/futures/trade/coupon/UnifiedFuturesCouponEntity;->getCurrency()Ljava/lang/String;

    .line 65
    move-result-object v1

    .line 66
    .line 67
    if-nez v1, :cond_5

    .line 68
    goto :goto_3

    .line 69
    :cond_5
    move-object v2, v1

    .line 70
    .line 71
    .line 72
    :goto_3
    invoke-direct {p1, v0, v2}, Lcom/kubi/futures/trade/coupon/UnifiedFuturesFeeDeductionCoupon;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    return-object p1

    .line 74
    :cond_6
    return-object v0
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
.end method
