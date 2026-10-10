.class public final Lcom/kubi/futures/trade/welfare/vm/FuturesTrialRulesViewModel;
.super Lcom/kubi/mvi/vm/BaseVM;
.source "FuturesTrialRulesViewModel.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R%\u0010\u0006\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00080\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/kubi/futures/trade/welfare/vm/FuturesTrialRulesViewModel;",
        "Lcom/kubi/mvi/vm/BaseVM;",
        "<init>",
        "()V",
        "trialExceptionHandler",
        "Lkotlinx/coroutines/CoroutineExceptionHandler;",
        "trial",
        "Landroidx/lifecycle/MutableLiveData;",
        "Lkotlin/Pair;",
        "",
        "Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;",
        "getTrial",
        "()Landroidx/lifecycle/MutableLiveData;",
        "fetchTrialDetails",
        "",
        "id",
        "",
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
        "SMAP\nFuturesTrialRulesViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FuturesTrialRulesViewModel.kt\ncom/kubi/futures/trade/welfare/vm/FuturesTrialRulesViewModel\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,36:1\n47#2,4:37\n*S KotlinDebug\n*F\n+ 1 FuturesTrialRulesViewModel.kt\ncom/kubi/futures/trade/welfare/vm/FuturesTrialRulesViewModel\n*L\n21#1:37,4\n*E\n"
    }
.end annotation


# instance fields
.field public final V:Lkotlinx/coroutines/CoroutineExceptionHandler;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final W:Landroidx/lifecycle/MutableLiveData;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/MutableLiveData<",
            "Lkotlin/Pair<",
            "Ljava/lang/Boolean;",
            "Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/mvi/vm/BaseVM;-><init>()V

    .line 4
    .line 5
    sget-object v0, Lkotlinx/coroutines/CoroutineExceptionHandler;->M0:Lkotlinx/coroutines/CoroutineExceptionHandler$a;

    .line 6
    .line 7
    new-instance v1, Lcom/kubi/futures/trade/welfare/vm/FuturesTrialRulesViewModel$a;

    .line 8
    .line 9
    .line 10
    invoke-direct {v1, v0, p0}, Lcom/kubi/futures/trade/welfare/vm/FuturesTrialRulesViewModel$a;-><init>(Lkotlinx/coroutines/CoroutineExceptionHandler$a;Lcom/kubi/futures/trade/welfare/vm/FuturesTrialRulesViewModel;)V

    .line 11
    .line 12
    iput-object v1, p0, Lcom/kubi/futures/trade/welfare/vm/FuturesTrialRulesViewModel;->V:Lkotlinx/coroutines/CoroutineExceptionHandler;

    .line 13
    .line 14
    new-instance v0, Landroidx/lifecycle/MutableLiveData;

    .line 15
    .line 16
    .line 17
    invoke-direct {v0}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 18
    .line 19
    iput-object v0, p0, Lcom/kubi/futures/trade/welfare/vm/FuturesTrialRulesViewModel;->W:Landroidx/lifecycle/MutableLiveData;

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
.end method


# virtual methods
.method public final d(Ljava/lang/String;)V
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "id"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 9
    move-result-object v1

    .line 10
    .line 11
    .line 12
    invoke-static {}, Lo00/a;->b()Lkotlinx/coroutines/j0;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    iget-object v2, p0, Lcom/kubi/futures/trade/welfare/vm/FuturesTrialRulesViewModel;->V:Lkotlinx/coroutines/CoroutineExceptionHandler;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v2}, Lkotlin/coroutines/AbstractCoroutineContextElement;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    .line 19
    move-result-object v2

    .line 20
    .line 21
    new-instance v4, Lcom/kubi/futures/trade/welfare/vm/FuturesTrialRulesViewModel$fetchTrialDetails$1;

    .line 22
    const/4 v0, 0x0

    .line 23
    .line 24
    .line 25
    invoke-direct {v4, p1, p0, v0}, Lcom/kubi/futures/trade/welfare/vm/FuturesTrialRulesViewModel$fetchTrialDetails$1;-><init>(Ljava/lang/String;Lcom/kubi/futures/trade/welfare/vm/FuturesTrialRulesViewModel;Lkotlin/coroutines/Continuation;)V

    .line 26
    const/4 v5, 0x2

    .line 27
    const/4 v6, 0x0

    .line 28
    const/4 v3, 0x0

    .line 29
    .line 30
    .line 31
    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 32
    return-void
.end method

.method public final n()Landroidx/lifecycle/MutableLiveData;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/MutableLiveData<",
            "Lkotlin/Pair<",
            "Ljava/lang/Boolean;",
            "Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/futures/trade/welfare/vm/FuturesTrialRulesViewModel;->W:Landroidx/lifecycle/MutableLiveData;

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
.end method
