.class public final Lcom/kubi/margin/trade/dialog/MarginWholePositionFragmentExtKt$collectEventFlowForUI$1$a;
.super Ljava/lang/Object;
.source "MarginWholePositionFragmentExt.kt"

# interfaces
.implements Lkotlinx/coroutines/flow/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/margin/trade/dialog/MarginWholePositionFragmentExtKt$collectEventFlowForUI$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
.field public final synthetic b:Lcom/kubi/margin/trade/position/MarginWholePositionFragment;


# direct methods
.method public constructor <init>(Lcom/kubi/margin/trade/position/MarginWholePositionFragment;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/margin/trade/dialog/MarginWholePositionFragmentExtKt$collectEventFlowForUI$1$a;->b:Lcom/kubi/margin/trade/position/MarginWholePositionFragment;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    return-void
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
.end method


# virtual methods
.method public final a(Ldr/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldr/a;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    .line 2
    instance-of p2, p1, Lcom/kubi/mvi/event/SingleEvent$b;

    .line 3
    .line 4
    if-eqz p2, :cond_0

    .line 5
    .line 6
    iget-object p1, p0, Lcom/kubi/margin/trade/dialog/MarginWholePositionFragmentExtKt$collectEventFlowForUI$1$a;->b:Lcom/kubi/margin/trade/position/MarginWholePositionFragment;

    .line 7
    const/4 p2, 0x1

    .line 8
    const/4 v0, 0x0

    .line 9
    const/4 v1, 0x0

    .line 10
    .line 11
    .line 12
    invoke-static {p1, v1, p2, v0}, Lcom/kubi/sdk/BaseFragment;->hideLoadingDialog$default(Lcom/kubi/sdk/BaseFragment;ZILjava/lang/Object;)V

    .line 13
    goto :goto_0

    .line 14
    .line 15
    :cond_0
    instance-of p2, p1, Lcom/kubi/mvi/event/SingleEvent$h;

    .line 16
    .line 17
    if-eqz p2, :cond_1

    .line 18
    .line 19
    iget-object p1, p0, Lcom/kubi/margin/trade/dialog/MarginWholePositionFragmentExtKt$collectEventFlowForUI$1$a;->b:Lcom/kubi/margin/trade/position/MarginWholePositionFragment;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Lcom/kubi/sdk/BaseFragment;->showLoadingDialog()V

    .line 23
    goto :goto_0

    .line 24
    .line 25
    :cond_1
    instance-of p2, p1, Lcom/kubi/margin/trade/dialog/d;

    .line 26
    .line 27
    if-eqz p2, :cond_2

    .line 28
    .line 29
    .line 30
    invoke-static {}, Lcom/kubi/margin/trade/dialog/MarginWholePositionFragmentExtKt;->a()V

    .line 31
    goto :goto_0

    .line 32
    .line 33
    :cond_2
    instance-of p2, p1, Lcom/kubi/margin/trade/dialog/c;

    .line 34
    .line 35
    if-eqz p2, :cond_3

    .line 36
    .line 37
    check-cast p1, Lcom/kubi/margin/trade/dialog/c;

    .line 38
    .line 39
    .line 40
    invoke-static {p1}, Lcom/kubi/margin/trade/dialog/MarginWholePositionFragmentExtKt;->b(Lcom/kubi/margin/trade/dialog/c;)V

    .line 41
    goto :goto_0

    .line 42
    .line 43
    :cond_3
    instance-of p2, p1, Lcom/kubi/margin/trade/dialog/f;

    .line 44
    .line 45
    if-eqz p2, :cond_4

    .line 46
    .line 47
    check-cast p1, Lcom/kubi/margin/trade/dialog/f;

    .line 48
    .line 49
    .line 50
    invoke-static {p1}, Lcom/kubi/margin/trade/dialog/MarginWholePositionFragmentExtKt;->d(Lcom/kubi/margin/trade/dialog/f;)V

    .line 51
    goto :goto_0

    .line 52
    .line 53
    :cond_4
    instance-of p2, p1, Lcom/kubi/margin/trade/dialog/e;

    .line 54
    .line 55
    if-eqz p2, :cond_5

    .line 56
    .line 57
    check-cast p1, Lcom/kubi/margin/trade/dialog/e;

    .line 58
    .line 59
    .line 60
    invoke-static {p1}, Lcom/kubi/margin/trade/dialog/MarginWholePositionFragmentExtKt;->c(Lcom/kubi/margin/trade/dialog/e;)V

    .line 61
    goto :goto_0

    .line 62
    .line 63
    :cond_5
    new-instance p2, Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 67
    .line 68
    const-string v0, "unknown event: "

    .line 69
    .line 70
    .line 71
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 78
    move-result-object p1

    .line 79
    .line 80
    .line 81
    invoke-static {p1}, Lro/b;->d(Ljava/lang/String;)V

    .line 82
    .line 83
    :goto_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 84
    return-object p1
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

.method public bridge synthetic emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    check-cast p1, Ldr/a;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/kubi/margin/trade/dialog/MarginWholePositionFragmentExtKt$collectEventFlowForUI$1$a;->a(Ldr/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
.end method
