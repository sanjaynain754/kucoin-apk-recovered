.class public final Lcom/kubi/spot/dialog/order/AmendOrderViewModel$subscribeLatestPrice$1$a;
.super Ljava/lang/Object;
.source "AmendOrderViewModel.kt"

# interfaces
.implements Lkotlinx/coroutines/flow/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/spot/dialog/order/AmendOrderViewModel$subscribeLatestPrice$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lkotlinx/coroutines/flow/f;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic b:Lkotlinx/coroutines/m0;

.field public final synthetic c:Lcom/kubi/spot/dialog/order/AmendOrderViewModel;


# direct methods
.method public constructor <init>(Lkotlinx/coroutines/m0;Lcom/kubi/spot/dialog/order/AmendOrderViewModel;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/spot/dialog/order/AmendOrderViewModel$subscribeLatestPrice$1$a;->b:Lkotlinx/coroutines/m0;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/kubi/spot/dialog/order/AmendOrderViewModel$subscribeLatestPrice$1$a;->c:Lcom/kubi/spot/dialog/order/AmendOrderViewModel;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method


# virtual methods
.method public final a(Lcom/kubi/kucoin/manager/SpotMatchPushEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/kucoin/manager/SpotMatchPushEntity;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/kubi/kucoin/manager/SpotMatchPushEntity;->getSequence()J

    .line 4
    move-result-wide v0

    .line 5
    .line 6
    iget-object p2, p0, Lcom/kubi/spot/dialog/order/AmendOrderViewModel$subscribeLatestPrice$1$a;->b:Lkotlinx/coroutines/m0;

    .line 7
    .line 8
    .line 9
    invoke-static {p2}, Lkotlinx/coroutines/n0;->h(Lkotlinx/coroutines/m0;)Z

    .line 10
    move-result p2

    .line 11
    .line 12
    if-eqz p2, :cond_0

    .line 13
    .line 14
    iget-object p2, p0, Lcom/kubi/spot/dialog/order/AmendOrderViewModel$subscribeLatestPrice$1$a;->c:Lcom/kubi/spot/dialog/order/AmendOrderViewModel;

    .line 15
    .line 16
    .line 17
    invoke-static {p2}, Lcom/kubi/spot/dialog/order/AmendOrderViewModel;->s(Lcom/kubi/spot/dialog/order/AmendOrderViewModel;)J

    .line 18
    move-result-wide v2

    .line 19
    .line 20
    cmp-long p2, v0, v2

    .line 21
    .line 22
    if-lez p2, :cond_0

    .line 23
    .line 24
    iget-object p2, p0, Lcom/kubi/spot/dialog/order/AmendOrderViewModel$subscribeLatestPrice$1$a;->c:Lcom/kubi/spot/dialog/order/AmendOrderViewModel;

    .line 25
    .line 26
    .line 27
    invoke-static {p2, v0, v1}, Lcom/kubi/spot/dialog/order/AmendOrderViewModel;->v(Lcom/kubi/spot/dialog/order/AmendOrderViewModel;J)V

    .line 28
    .line 29
    new-instance p2, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 33
    .line 34
    const-string v2, "collect \u66f4\u65b0\uff0csequence="

    .line 35
    .line 36
    .line 37
    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    move-result-object p2

    .line 45
    .line 46
    .line 47
    invoke-static {p2}, Lro/b;->i(Ljava/lang/String;)V

    .line 48
    .line 49
    iget-object p2, p0, Lcom/kubi/spot/dialog/order/AmendOrderViewModel$subscribeLatestPrice$1$a;->c:Lcom/kubi/spot/dialog/order/AmendOrderViewModel;

    .line 50
    .line 51
    .line 52
    invoke-static {p2}, Lcom/kubi/spot/dialog/order/AmendOrderViewModel;->u(Lcom/kubi/spot/dialog/order/AmendOrderViewModel;)Landroidx/lifecycle/MutableLiveData;

    .line 53
    move-result-object p2

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1}, Lcom/kubi/kucoin/manager/SpotMatchPushEntity;->getPrice()Ljava/lang/String;

    .line 57
    move-result-object p1

    .line 58
    .line 59
    .line 60
    invoke-virtual {p2, p1}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 61
    goto :goto_0

    .line 62
    .line 63
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 67
    .line 68
    const-string p2, "\u5ffd\u7565\u63a8\u9001\uff0csequence="

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    const-string p2, " <= latestSequence="

    .line 77
    .line 78
    .line 79
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    iget-object p2, p0, Lcom/kubi/spot/dialog/order/AmendOrderViewModel$subscribeLatestPrice$1$a;->c:Lcom/kubi/spot/dialog/order/AmendOrderViewModel;

    .line 82
    .line 83
    .line 84
    invoke-static {p2}, Lcom/kubi/spot/dialog/order/AmendOrderViewModel;->s(Lcom/kubi/spot/dialog/order/AmendOrderViewModel;)J

    .line 85
    move-result-wide v0

    .line 86
    .line 87
    .line 88
    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 92
    move-result-object p1

    .line 93
    .line 94
    .line 95
    invoke-static {p1}, Lro/b;->i(Ljava/lang/String;)V

    .line 96
    .line 97
    :goto_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 98
    return-object p1
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
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    check-cast p1, Lcom/kubi/kucoin/manager/SpotMatchPushEntity;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/kubi/spot/dialog/order/AmendOrderViewModel$subscribeLatestPrice$1$a;->a(Lcom/kubi/kucoin/manager/SpotMatchPushEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 6
    move-result-object p1

    .line 7
    return-object p1
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
.end method
