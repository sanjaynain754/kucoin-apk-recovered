.class public final Lcom/kubi/core/biz/bottomtab/order/child/u;
.super Landroidx/lifecycle/ViewModel;
.source "OrderListOperatorVM.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0011\u001a\u00020\u00122\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005J\u001c\u0010\u0013\u001a\u00020\u00122\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002J\u001c\u0010\u0017\u001a\u00020\u00122\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002J\u000e\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001cJ\u0008\u0010\u001d\u001a\u00020\u0012H\u0014R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00080\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00080\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"
    }
    d2 = {
        "Lcom/kubi/core/biz/bottomtab/order/child/OrderListOperatorVM;",
        "Landroidx/lifecycle/ViewModel;",
        "<init>",
        "()V",
        "orderRepo",
        "Lcom/kubi/core/base/order/ITradeOrderDataRepo;",
        "_eventFlow",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "Lcom/kubi/core/biz/bottomtab/order/child/OrderListOperatorContract$BizEvent;",
        "eventFlow",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "getEventFlow",
        "()Lkotlinx/coroutines/flow/StateFlow;",
        "balanceCollectJob",
        "Lkotlinx/coroutines/Job;",
        "destroyDisposable",
        "Lio/reactivex/disposables/CompositeDisposable;",
        "injectOrderRepo",
        "",
        "cancelTargetOrder",
        "symbol",
        "",
        "orderId",
        "cancelAllOrders",
        "orderLevelType",
        "Lcom/kubi/core/base/order/data/OrderLevelType;",
        "sendBizIntent",
        "intent",
        "Lcom/kubi/core/biz/bottomtab/order/child/OrderListOperatorContract$UiIntent;",
        "onCleared",
        "TradeCoreBizLib_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public V:Lcd/a;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final W:Lkotlinx/coroutines/flow/n;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/n<",
            "Lcom/kubi/core/biz/bottomtab/order/child/r;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final X:Lkotlinx/coroutines/flow/w;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/w<",
            "Lcom/kubi/core/biz/bottomtab/order/child/r;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public Y:Lkotlinx/coroutines/x1;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final Z:Lio/reactivex/disposables/CompositeDisposable;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Landroidx/lifecycle/ViewModel;-><init>()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    iput-object v0, p0, Lcom/kubi/core/biz/bottomtab/order/child/u;->W:Lkotlinx/coroutines/flow/n;

    .line 11
    .line 12
    iput-object v0, p0, Lcom/kubi/core/biz/bottomtab/order/child/u;->X:Lkotlinx/coroutines/flow/w;

    .line 13
    .line 14
    new-instance v0, Lio/reactivex/disposables/CompositeDisposable;

    .line 15
    .line 16
    .line 17
    invoke-direct {v0}, Lio/reactivex/disposables/CompositeDisposable;-><init>()V

    .line 18
    .line 19
    iput-object v0, p0, Lcom/kubi/core/biz/bottomtab/order/child/u;->Z:Lio/reactivex/disposables/CompositeDisposable;

    .line 20
    return-void
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
.end method

.method public static synthetic b(Lcom/kubi/core/biz/bottomtab/order/child/u;Lcom/kubi/core/base/order/data/CancelOrderData$All$Response;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/core/biz/bottomtab/order/child/u;->f(Lcom/kubi/core/biz/bottomtab/order/child/u;Lcom/kubi/core/base/order/data/CancelOrderData$All$Response;)Lkotlin/Unit;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
.end method

.method public static synthetic d(Lcom/kubi/core/biz/bottomtab/order/child/u;Lcom/kubi/core/base/order/data/CancelOrderData$Single$Response;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/core/biz/bottomtab/order/child/u;->h(Lcom/kubi/core/biz/bottomtab/order/child/u;Lcom/kubi/core/base/order/data/CancelOrderData$Single$Response;)Lkotlin/Unit;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
.end method

.method public static final f(Lcom/kubi/core/biz/bottomtab/order/child/u;Lcom/kubi/core/base/order/data/CancelOrderData$All$Response;)Lkotlin/Unit;
    .locals 7

    .line 1
    .line 2
    const-string v0, "it"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    instance-of v0, p1, Lcom/kubi/core/base/order/data/CancelOrderData$All$ResponseSuccess;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/kubi/core/biz/bottomtab/order/child/u;->W:Lkotlinx/coroutines/flow/n;

    .line 12
    .line 13
    new-instance v1, Lcom/kubi/core/biz/bottomtab/order/child/r$a;

    .line 14
    const/4 v5, 0x4

    .line 15
    const/4 v6, 0x0

    .line 16
    const/4 v2, 0x1

    .line 17
    const/4 v3, 0x1

    .line 18
    const/4 v4, 0x0

    .line 19
    .line 20
    .line 21
    invoke-direct/range {v1 .. v6}, Lcom/kubi/core/biz/bottomtab/order/child/r$a;-><init>(ZZLjava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 22
    .line 23
    .line 24
    invoke-interface {v0, v1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 25
    .line 26
    :cond_0
    instance-of v0, p1, Lcom/kubi/core/base/order/data/CancelOrderData$All$ResponseFail;

    .line 27
    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    iget-object p0, p0, Lcom/kubi/core/biz/bottomtab/order/child/u;->W:Lkotlinx/coroutines/flow/n;

    .line 31
    .line 32
    new-instance v0, Lcom/kubi/core/biz/bottomtab/order/child/r$a;

    .line 33
    .line 34
    check-cast p1, Lcom/kubi/core/base/order/data/CancelOrderData$All$ResponseFail;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1}, Lcom/kubi/core/base/order/data/CancelOrderData$All$ResponseFail;->getApiCode()Ljava/lang/String;

    .line 38
    move-result-object p1

    .line 39
    .line 40
    const-string v1, "301134"

    .line 41
    .line 42
    .line 43
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    move-result v2

    .line 45
    const/4 v4, 0x4

    .line 46
    const/4 v5, 0x0

    .line 47
    const/4 v1, 0x0

    .line 48
    const/4 v3, 0x0

    .line 49
    .line 50
    .line 51
    invoke-direct/range {v0 .. v5}, Lcom/kubi/core/biz/bottomtab/order/child/r$a;-><init>(ZZLjava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 52
    .line 53
    .line 54
    invoke-interface {p0, v0}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 55
    .line 56
    :cond_1
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 57
    return-object p0
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
.end method

.method public static final h(Lcom/kubi/core/biz/bottomtab/order/child/u;Lcom/kubi/core/base/order/data/CancelOrderData$Single$Response;)Lkotlin/Unit;
    .locals 7

    .line 1
    .line 2
    const-string v0, "it"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    instance-of v0, p1, Lcom/kubi/core/base/order/data/CancelOrderData$Single$ResponseSuccess;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/kubi/core/biz/bottomtab/order/child/u;->W:Lkotlinx/coroutines/flow/n;

    .line 12
    .line 13
    new-instance v1, Lcom/kubi/core/biz/bottomtab/order/child/r$a;

    .line 14
    const/4 v5, 0x4

    .line 15
    const/4 v6, 0x0

    .line 16
    const/4 v2, 0x1

    .line 17
    const/4 v3, 0x1

    .line 18
    const/4 v4, 0x0

    .line 19
    .line 20
    .line 21
    invoke-direct/range {v1 .. v6}, Lcom/kubi/core/biz/bottomtab/order/child/r$a;-><init>(ZZLjava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 22
    .line 23
    .line 24
    invoke-interface {v0, v1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 25
    .line 26
    :cond_0
    instance-of v0, p1, Lcom/kubi/core/base/order/data/CancelOrderData$Single$ResponseFail;

    .line 27
    .line 28
    if-eqz v0, :cond_3

    .line 29
    .line 30
    iget-object p0, p0, Lcom/kubi/core/biz/bottomtab/order/child/u;->W:Lkotlinx/coroutines/flow/n;

    .line 31
    .line 32
    new-instance v0, Lcom/kubi/core/biz/bottomtab/order/child/r$a;

    .line 33
    .line 34
    check-cast p1, Lcom/kubi/core/base/order/data/CancelOrderData$Single$ResponseFail;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1}, Lcom/kubi/core/base/order/data/CancelOrderData$Single$ResponseFail;->getApiCode()Ljava/lang/String;

    .line 38
    move-result-object v1

    .line 39
    .line 40
    const-string v2, "301134"

    .line 41
    .line 42
    .line 43
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    move-result v1

    .line 45
    .line 46
    if-nez v1, :cond_2

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1}, Lcom/kubi/core/base/order/data/CancelOrderData$Single$ResponseFail;->getApiCode()Ljava/lang/String;

    .line 50
    move-result-object p1

    .line 51
    .line 52
    const-string v1, "106100"

    .line 53
    .line 54
    .line 55
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 56
    move-result p1

    .line 57
    .line 58
    if-eqz p1, :cond_1

    .line 59
    goto :goto_1

    .line 60
    :cond_1
    const/4 p1, 0x0

    .line 61
    :goto_0
    move v2, p1

    .line 62
    goto :goto_2

    .line 63
    :cond_2
    :goto_1
    const/4 p1, 0x1

    .line 64
    goto :goto_0

    .line 65
    :goto_2
    const/4 v4, 0x4

    .line 66
    const/4 v5, 0x0

    .line 67
    const/4 v1, 0x0

    .line 68
    const/4 v3, 0x0

    .line 69
    .line 70
    .line 71
    invoke-direct/range {v0 .. v5}, Lcom/kubi/core/biz/bottomtab/order/child/r$a;-><init>(ZZLjava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 72
    .line 73
    .line 74
    invoke-interface {p0, v0}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 75
    .line 76
    :cond_3
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 77
    return-object p0
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
.end method


# virtual methods
.method public final e(Ljava/lang/String;Lcom/kubi/core/base/order/data/OrderLevelType;)V
    .locals 2

    .line 1
    .line 2
    if-eqz p1, :cond_1

    .line 3
    .line 4
    .line 5
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 6
    move-result v0

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move-object v0, p1

    .line 11
    goto :goto_1

    .line 12
    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 13
    .line 14
    :goto_1
    sget-object v1, Lcom/kubi/spot/api/ISpotCommonService;->a:Lcom/kubi/spot/api/ISpotCommonService$Companion;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1}, Lcom/kubi/spot/api/ISpotCommonService$Companion;->get()Lcom/kubi/spot/api/ISpotCommonService;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    .line 21
    invoke-interface {v1, p1}, Lcom/kubi/spot/api/ISpotCommonService;->q(Ljava/lang/String;)Z

    .line 22
    move-result p1

    .line 23
    .line 24
    if-eqz p1, :cond_2

    .line 25
    .line 26
    iget-object p1, p0, Lcom/kubi/core/biz/bottomtab/order/child/u;->W:Lkotlinx/coroutines/flow/n;

    .line 27
    .line 28
    new-instance p2, Lcom/kubi/core/biz/bottomtab/order/child/r$a;

    .line 29
    .line 30
    sget v0, Lcom/kubi/tradecorebiz/R$string;->outage_tip:I

    .line 31
    .line 32
    .line 33
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 34
    move-result-object v0

    .line 35
    const/4 v1, 0x0

    .line 36
    .line 37
    .line 38
    invoke-direct {p2, v1, v1, v0}, Lcom/kubi/core/biz/bottomtab/order/child/r$a;-><init>(ZZLjava/lang/Integer;)V

    .line 39
    .line 40
    .line 41
    invoke-interface {p1, p2}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 42
    return-void

    .line 43
    .line 44
    :cond_2
    new-instance p1, Lcom/kubi/core/base/order/data/CancelOrderData$All$Request;

    .line 45
    .line 46
    .line 47
    invoke-direct {p1, p2, v0}, Lcom/kubi/core/base/order/data/CancelOrderData$All$Request;-><init>(Lcom/kubi/core/base/order/data/OrderLevelType;Ljava/lang/String;)V

    .line 48
    .line 49
    iget-object p2, p0, Lcom/kubi/core/biz/bottomtab/order/child/u;->V:Lcd/a;

    .line 50
    .line 51
    if-eqz p2, :cond_3

    .line 52
    .line 53
    .line 54
    invoke-interface {p2}, Lcd/a;->a()Lyc/b;

    .line 55
    move-result-object p2

    .line 56
    .line 57
    if-eqz p2, :cond_3

    .line 58
    .line 59
    iget-object v0, p0, Lcom/kubi/core/biz/bottomtab/order/child/u;->Z:Lio/reactivex/disposables/CompositeDisposable;

    .line 60
    .line 61
    new-instance v1, Lcom/kubi/core/biz/bottomtab/order/child/t;

    .line 62
    .line 63
    .line 64
    invoke-direct {v1, p0}, Lcom/kubi/core/biz/bottomtab/order/child/t;-><init>(Lcom/kubi/core/biz/bottomtab/order/child/u;)V

    .line 65
    .line 66
    .line 67
    invoke-interface {p2, p1, v0, v1}, Lyc/b;->a(Lwc/a;Lio/reactivex/disposables/CompositeDisposable;Lkotlin/jvm/functions/Function1;)V

    .line 68
    :cond_3
    return-void
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
.end method

.method public final g(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/core/spot/helper/z;->a:Lcom/kubi/core/spot/helper/z;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/kubi/core/spot/helper/z;->b(Ljava/lang/String;)Z

    .line 6
    move-result v1

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Lcom/kubi/core/spot/helper/z;->a(Ljava/lang/String;)Z

    .line 12
    move-result v0

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    iget-object p1, p0, Lcom/kubi/core/biz/bottomtab/order/child/u;->W:Lkotlinx/coroutines/flow/n;

    .line 17
    .line 18
    new-instance p2, Lcom/kubi/core/biz/bottomtab/order/child/r$a;

    .line 19
    .line 20
    sget v0, Lcom/kubi/tradecorebiz/R$string;->outage_tip:I

    .line 21
    .line 22
    .line 23
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 24
    move-result-object v0

    .line 25
    const/4 v1, 0x0

    .line 26
    .line 27
    .line 28
    invoke-direct {p2, v1, v1, v0}, Lcom/kubi/core/biz/bottomtab/order/child/r$a;-><init>(ZZLjava/lang/Integer;)V

    .line 29
    .line 30
    .line 31
    invoke-interface {p1, p2}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 32
    return-void

    .line 33
    .line 34
    :cond_0
    new-instance v0, Lcom/kubi/core/base/order/data/CancelOrderData$Single$Request;

    .line 35
    .line 36
    .line 37
    invoke-direct {v0, p2, p1}, Lcom/kubi/core/base/order/data/CancelOrderData$Single$Request;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    .line 39
    iget-object p1, p0, Lcom/kubi/core/biz/bottomtab/order/child/u;->V:Lcd/a;

    .line 40
    .line 41
    if-eqz p1, :cond_1

    .line 42
    .line 43
    .line 44
    invoke-interface {p1}, Lcd/a;->d()Lyc/b;

    .line 45
    move-result-object p1

    .line 46
    .line 47
    if-eqz p1, :cond_1

    .line 48
    .line 49
    iget-object p2, p0, Lcom/kubi/core/biz/bottomtab/order/child/u;->Z:Lio/reactivex/disposables/CompositeDisposable;

    .line 50
    .line 51
    new-instance v1, Lcom/kubi/core/biz/bottomtab/order/child/s;

    .line 52
    .line 53
    .line 54
    invoke-direct {v1, p0}, Lcom/kubi/core/biz/bottomtab/order/child/s;-><init>(Lcom/kubi/core/biz/bottomtab/order/child/u;)V

    .line 55
    .line 56
    .line 57
    invoke-interface {p1, v0, p2, v1}, Lyc/b;->a(Lwc/a;Lio/reactivex/disposables/CompositeDisposable;Lkotlin/jvm/functions/Function1;)V

    .line 58
    :cond_1
    return-void
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
.end method

.method public final n()Lkotlinx/coroutines/flow/w;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/w<",
            "Lcom/kubi/core/biz/bottomtab/order/child/r;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/core/biz/bottomtab/order/child/u;->X:Lkotlinx/coroutines/flow/w;

    .line 3
    return-object v0
    .line 4
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
.end method

.method public final o(Lcd/a;)V
    .locals 0
    .param p1    # Lcd/a;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/core/biz/bottomtab/order/child/u;->V:Lcd/a;

    .line 3
    return-void
    .line 4
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
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
.end method

.method public onCleared()V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Landroidx/lifecycle/ViewModel;->onCleared()V

    .line 4
    .line 5
    iget-object v0, p0, Lcom/kubi/core/biz/bottomtab/order/child/u;->Y:Lkotlinx/coroutines/x1;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    const/4 v1, 0x1

    .line 9
    const/4 v2, 0x0

    .line 10
    .line 11
    .line 12
    invoke-static {v0, v2, v1, v2}, Lkotlinx/coroutines/x1$a;->a(Lkotlinx/coroutines/x1;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, Lcom/kubi/core/biz/bottomtab/order/child/u;->Z:Lio/reactivex/disposables/CompositeDisposable;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Lio/reactivex/disposables/CompositeDisposable;->clear()V

    .line 18
    return-void
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
.end method

.method public final p(Lcom/kubi/core/biz/bottomtab/order/child/OrderListOperatorContract$UiIntent;)V
    .locals 1
    .param p1    # Lcom/kubi/core/biz/bottomtab/order/child/OrderListOperatorContract$UiIntent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "intent"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    instance-of v0, p1, Lcom/kubi/core/biz/bottomtab/order/child/OrderListOperatorContract$UiIntent$CancelOrder;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    check-cast p1, Lcom/kubi/core/biz/bottomtab/order/child/OrderListOperatorContract$UiIntent$CancelOrder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Lcom/kubi/core/biz/bottomtab/order/child/OrderListOperatorContract$UiIntent$CancelOrder;->getSymbol()Ljava/lang/String;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Lcom/kubi/core/biz/bottomtab/order/child/OrderListOperatorContract$UiIntent$CancelOrder;->getOrderId()Ljava/lang/String;

    .line 19
    move-result-object p1

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v0, p1}, Lcom/kubi/core/biz/bottomtab/order/child/u;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    return-void

    .line 24
    .line 25
    :cond_0
    instance-of v0, p1, Lcom/kubi/core/biz/bottomtab/order/child/OrderListOperatorContract$UiIntent$CancelAllOrder;

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    check-cast p1, Lcom/kubi/core/biz/bottomtab/order/child/OrderListOperatorContract$UiIntent$CancelAllOrder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Lcom/kubi/core/biz/bottomtab/order/child/OrderListOperatorContract$UiIntent$CancelAllOrder;->getSymbol()Ljava/lang/String;

    .line 33
    move-result-object v0

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1}, Lcom/kubi/core/biz/bottomtab/order/child/OrderListOperatorContract$UiIntent$CancelAllOrder;->getOrderLevelType()Lcom/kubi/core/base/order/data/OrderLevelType;

    .line 37
    move-result-object p1

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, v0, p1}, Lcom/kubi/core/biz/bottomtab/order/child/u;->e(Ljava/lang/String;Lcom/kubi/core/base/order/data/OrderLevelType;)V

    .line 41
    return-void

    .line 42
    .line 43
    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 44
    .line 45
    .line 46
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 47
    throw p1
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
.end method
