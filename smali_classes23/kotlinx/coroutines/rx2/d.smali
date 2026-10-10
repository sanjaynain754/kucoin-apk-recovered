.class public final synthetic Lkotlinx/coroutines/rx2/d;
.super Ljava/lang/Object;
.source "R8$$SyntheticClass"

# interfaces
.implements Lio/reactivex/ObservableOnSubscribe;


# instance fields
.field public final synthetic b:Lkotlin/coroutines/CoroutineContext;

.field public final synthetic c:Lkotlinx/coroutines/flow/e;


# direct methods
.method public synthetic constructor <init>(Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/flow/e;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lkotlinx/coroutines/rx2/d;->b:Lkotlin/coroutines/CoroutineContext;

    .line 6
    .line 7
    iput-object p2, p0, Lkotlinx/coroutines/rx2/d;->c:Lkotlinx/coroutines/flow/e;

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
.end method


# virtual methods
.method public final subscribe(Lio/reactivex/ObservableEmitter;)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lkotlinx/coroutines/rx2/d;->b:Lkotlin/coroutines/CoroutineContext;

    .line 3
    .line 4
    iget-object v1, p0, Lkotlinx/coroutines/rx2/d;->c:Lkotlinx/coroutines/flow/e;

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v1, p1}, Lkotlinx/coroutines/rx2/RxConvertKt;->a(Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/flow/e;Lio/reactivex/ObservableEmitter;)V

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
.end method
