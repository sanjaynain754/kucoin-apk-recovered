.class public final Lcom/sumsub/sentry/t0;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public final a:Lcom/sumsub/sentry/c0;

.field public final b:Lcom/sumsub/sns/internal/log/cacher/c;

.field public final c:Lkotlinx/coroutines/m0;


# direct methods
.method public constructor <init>(Lcom/sumsub/sentry/c0;Lcom/sumsub/sns/internal/log/cacher/c;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    .line 4
    .line 5
    invoke-static {v0, v1, v0}, Lkotlinx/coroutines/q2;->b(Lkotlinx/coroutines/x1;ILjava/lang/Object;)Lkotlinx/coroutines/z;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-static {}, Lkotlinx/coroutines/z0;->b()Lkotlinx/coroutines/j0;

    .line 10
    move-result-object v1

    .line 11
    .line 12
    .line 13
    invoke-interface {v0, v1}, Lkotlin/coroutines/CoroutineContext;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Lkotlinx/coroutines/n0;->a(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/m0;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    .line 23
    iput-object p1, p0, Lcom/sumsub/sentry/t0;->a:Lcom/sumsub/sentry/c0;

    .line 24
    .line 25
    iput-object p2, p0, Lcom/sumsub/sentry/t0;->b:Lcom/sumsub/sns/internal/log/cacher/c;

    .line 26
    .line 27
    iput-object v0, p0, Lcom/sumsub/sentry/t0;->c:Lkotlinx/coroutines/m0;

    .line 28
    return-void
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method
