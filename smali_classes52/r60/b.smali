.class public interface abstract Lr60/b;
.super Ljava/lang/Object;
.source "IOrderSocketApi.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008f\u0018\u00002\u00020\u0001JH\u0010\u0002\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0008\u0008\u0003\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0003\u0010\u0008\u001a\u00020\u00072\n\u0008\u0001\u0010\t\u001a\u0004\u0018\u00010\u00072\u0008\u0008\u0003\u0010\n\u001a\u00020\u000b2\u0008\u0008\u0003\u0010\u000c\u001a\u00020\u000bH\'JH\u0010\r\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0008\u0008\u0003\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0003\u0010\u0008\u001a\u00020\u00072\n\u0008\u0001\u0010\t\u001a\u0004\u0018\u00010\u00072\u0008\u0008\u0003\u0010\n\u001a\u00020\u000b2\u0008\u0008\u0003\u0010\u000c\u001a\u00020\u000bH\'J<\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u000f2\u0014\u0008\u0001\u0010\u0010\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0016\u0008\u0003\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0012H\'J<\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u000f2\u0014\u0008\u0001\u0010\u0010\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0016\u0008\u0003\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0012H\'\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\u0015\u00c0\u0006\u0001"
    }
    d2 = {
        "Lcom/kubi/unify/unify/common/order/api/IOrderSocketApi;",
        "",
        "getActiveOrdersPeriod",
        "Lcom/kubi/network/api/subscribe/annotations/PeriodFlow;",
        "Lcom/kubi/unify/entity/UnifyPageEntity;",
        "Lcom/kubi/unify/entity/UnifyOrderEntity;",
        "tradeType",
        "",
        "orderFilter",
        "symbol",
        "currentPage",
        "",
        "pageSize",
        "getAdvancedOrdersPeriod",
        "observeActiveOrderByPage",
        "Lkotlinx/coroutines/flow/Flow;",
        "periodFlow",
        "convert",
        "Lcom/kubi/network/restful/core/IConverter;",
        "Lcom/kubi/network/api/subscribe/model/SubscribeMessage;",
        "observeAdvanceOrderByPage",
        "BUnifyAccountLib_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic c(Lr60/b;Lhr/f;Lkr/c;ILjava/lang/Object;)Lkotlinx/coroutines/flow/e;
    .locals 0

    .line 1
    .line 2
    if-nez p4, :cond_1

    .line 3
    .line 4
    and-int/lit8 p3, p3, 0x2

    .line 5
    .line 6
    if-eqz p3, :cond_0

    .line 7
    .line 8
    new-instance p2, Lr60/c;

    .line 9
    .line 10
    sget-object p3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 11
    .line 12
    .line 13
    invoke-direct {p2, p3}, Lr60/c;-><init>(Ljava/lang/Boolean;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-interface {p0, p1, p2}, Lr60/b;->b(Lhr/f;Lkr/c;)Lkotlinx/coroutines/flow/e;

    .line 17
    move-result-object p0

    .line 18
    return-object p0

    .line 19
    .line 20
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 21
    .line 22
    const-string p1, "Super calls with default arguments not supported in this target, function: observeActiveOrderByPage"

    .line 23
    .line 24
    .line 25
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 26
    throw p0
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
.end method

.method public static synthetic d(Lr60/b;Lhr/f;Lkr/c;ILjava/lang/Object;)Lkotlinx/coroutines/flow/e;
    .locals 0

    .line 1
    .line 2
    if-nez p4, :cond_1

    .line 3
    .line 4
    and-int/lit8 p3, p3, 0x2

    .line 5
    .line 6
    if-eqz p3, :cond_0

    .line 7
    .line 8
    new-instance p2, Lr60/c;

    .line 9
    .line 10
    sget-object p3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 11
    .line 12
    .line 13
    invoke-direct {p2, p3}, Lr60/c;-><init>(Ljava/lang/Boolean;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-interface {p0, p1, p2}, Lr60/b;->a(Lhr/f;Lkr/c;)Lkotlinx/coroutines/flow/e;

    .line 17
    move-result-object p0

    .line 18
    return-object p0

    .line 19
    .line 20
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 21
    .line 22
    const-string p1, "Super calls with default arguments not supported in this target, function: observeAdvanceOrderByPage"

    .line 23
    .line 24
    .line 25
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 26
    throw p0
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
.end method

.method public static synthetic e(Lr60/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/Object;)Lhr/f;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 1
    .line 2
    if-nez p7, :cond_4

    .line 3
    .line 4
    and-int/lit8 p7, p6, 0x1

    .line 5
    .line 6
    if-eqz p7, :cond_0

    .line 7
    .line 8
    sget-object p1, Lcom/kubi/unify/api/entity/UnifySupportService;->FUTURES:Lcom/kubi/unify/api/entity/UnifySupportService;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/kubi/unify/api/entity/UnifySupportService;->getValue()Ljava/lang/String;

    .line 12
    move-result-object p1

    .line 13
    .line 14
    :cond_0
    and-int/lit8 p7, p6, 0x2

    .line 15
    .line 16
    if-eqz p7, :cond_1

    .line 17
    .line 18
    const-string p2, "ADVANCED"

    .line 19
    .line 20
    :cond_1
    and-int/lit8 p7, p6, 0x8

    .line 21
    .line 22
    if-eqz p7, :cond_2

    .line 23
    const/4 p4, 0x1

    .line 24
    .line 25
    :cond_2
    and-int/lit8 p6, p6, 0x10

    .line 26
    .line 27
    if-eqz p6, :cond_3

    .line 28
    .line 29
    const/16 p5, 0x32

    .line 30
    :cond_3
    move p6, p4

    .line 31
    move p7, p5

    .line 32
    move-object p4, p2

    .line 33
    move-object p5, p3

    .line 34
    move-object p2, p0

    .line 35
    move-object p3, p1

    .line 36
    .line 37
    .line 38
    invoke-interface/range {p2 .. p7}, Lr60/b;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)Lhr/f;

    .line 39
    move-result-object p0

    .line 40
    return-object p0

    .line 41
    .line 42
    :cond_4
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 43
    .line 44
    const-string p1, "Super calls with default arguments not supported in this target, function: getAdvancedOrdersPeriod"

    .line 45
    .line 46
    .line 47
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 48
    throw p0
.end method

.method public static synthetic h(Lr60/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/Object;)Lhr/f;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 1
    .line 2
    if-nez p7, :cond_4

    .line 3
    .line 4
    and-int/lit8 p7, p6, 0x1

    .line 5
    .line 6
    if-eqz p7, :cond_0

    .line 7
    .line 8
    sget-object p1, Lcom/kubi/unify/api/entity/UnifySupportService;->FUTURES:Lcom/kubi/unify/api/entity/UnifySupportService;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/kubi/unify/api/entity/UnifySupportService;->getValue()Ljava/lang/String;

    .line 12
    move-result-object p1

    .line 13
    .line 14
    :cond_0
    and-int/lit8 p7, p6, 0x2

    .line 15
    .line 16
    if-eqz p7, :cond_1

    .line 17
    .line 18
    const-string p2, "NORMAL"

    .line 19
    .line 20
    :cond_1
    and-int/lit8 p7, p6, 0x8

    .line 21
    .line 22
    if-eqz p7, :cond_2

    .line 23
    const/4 p4, 0x1

    .line 24
    .line 25
    :cond_2
    and-int/lit8 p6, p6, 0x10

    .line 26
    .line 27
    if-eqz p6, :cond_3

    .line 28
    .line 29
    const/16 p5, 0x32

    .line 30
    :cond_3
    move p6, p4

    .line 31
    move p7, p5

    .line 32
    move-object p4, p2

    .line 33
    move-object p5, p3

    .line 34
    move-object p2, p0

    .line 35
    move-object p3, p1

    .line 36
    .line 37
    .line 38
    invoke-interface/range {p2 .. p7}, Lr60/b;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)Lhr/f;

    .line 39
    move-result-object p0

    .line 40
    return-object p0

    .line 41
    .line 42
    :cond_4
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 43
    .line 44
    const-string p1, "Super calls with default arguments not supported in this target, function: getActiveOrdersPeriod"

    .line 45
    .line 46
    .line 47
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 48
    throw p0
.end method


# virtual methods
.method public abstract a(Lhr/f;Lkr/c;)Lkotlinx/coroutines/flow/e;
    .param p1    # Lhr/f;
        .annotation runtime Lhr/b;
            connectedPeriod = 0x1e
            waitPeriodResult = true
        .end annotation

        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkr/c;
        .annotation runtime Lhr/e;
        .end annotation

        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhr/f<",
            "Lcom/kubi/unify/entity/UnifyPageEntity<",
            "Lcom/kubi/unify/entity/UnifyOrderEntity;",
            ">;>;",
            "Lkr/c<",
            "Lcom/kubi/network/api/subscribe/model/SubscribeMessage;",
            "Lcom/kubi/unify/entity/UnifyOrderEntity;",
            ">;)",
            "Lkotlinx/coroutines/flow/e<",
            "Lcom/kubi/unify/entity/UnifyOrderEntity;",
            ">;"
        }
    .end annotation

    .annotation runtime Lhr/d;
        topic = "/unifiedAccount/innerOrderAll"
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract b(Lhr/f;Lkr/c;)Lkotlinx/coroutines/flow/e;
    .param p1    # Lhr/f;
        .annotation runtime Lhr/b;
            connectedPeriod = 0x1e
            waitPeriodResult = true
        .end annotation

        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkr/c;
        .annotation runtime Lhr/e;
        .end annotation

        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhr/f<",
            "Lcom/kubi/unify/entity/UnifyPageEntity<",
            "Lcom/kubi/unify/entity/UnifyOrderEntity;",
            ">;>;",
            "Lkr/c<",
            "Lcom/kubi/network/api/subscribe/model/SubscribeMessage;",
            "Lcom/kubi/unify/entity/UnifyOrderEntity;",
            ">;)",
            "Lkotlinx/coroutines/flow/e<",
            "Lcom/kubi/unify/entity/UnifyOrderEntity;",
            ">;"
        }
    .end annotation

    .annotation runtime Lhr/d;
        topic = "/unifiedAccount/innerOrderAll"
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)Lhr/f;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Query;
            value = "tradeType"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Query;
            value = "orderFilter"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation

        .annotation runtime Lretrofit2/http/Query;
            value = "symbol"
        .end annotation
    .end param
    .param p4    # I
        .annotation runtime Lretrofit2/http/Query;
            value = "currentPage"
        .end annotation
    .end param
    .param p5    # I
        .annotation runtime Lretrofit2/http/Query;
            value = "pageSize"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "II)",
            "Lhr/f<",
            "Lcom/kubi/unify/entity/UnifyPageEntity<",
            "Lcom/kubi/unify/entity/UnifyOrderEntity;",
            ">;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "ultra-order/unified/inner/orders/query-orders"
    .end annotation
.end method

.method public abstract g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)Lhr/f;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Query;
            value = "tradeType"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Query;
            value = "orderFilter"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation

        .annotation runtime Lretrofit2/http/Query;
            value = "symbol"
        .end annotation
    .end param
    .param p4    # I
        .annotation runtime Lretrofit2/http/Query;
            value = "currentPage"
        .end annotation
    .end param
    .param p5    # I
        .annotation runtime Lretrofit2/http/Query;
            value = "pageSize"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "II)",
            "Lhr/f<",
            "Lcom/kubi/unify/entity/UnifyPageEntity<",
            "Lcom/kubi/unify/entity/UnifyOrderEntity;",
            ">;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "ultra-order/unified/inner/orders/query-orders"
    .end annotation
.end method
