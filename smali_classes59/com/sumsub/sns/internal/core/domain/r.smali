.class public final Lcom/sumsub/sns/internal/core/domain/r;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lcom/sumsub/sns/internal/core/domain/k;


# static fields
.field public static final d:Landroidx/datastore/preferences/core/Preferences$Key;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lkotlinx/coroutines/m0;

.field public volatile c:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    const-string v0, "auth_token"

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Landroidx/datastore/preferences/core/PreferencesKeys;->stringKey(Ljava/lang/String;)Landroidx/datastore/preferences/core/Preferences$Key;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    sput-object v0, Lcom/sumsub/sns/internal/core/domain/r;->d:Landroidx/datastore/preferences/core/Preferences$Key;

    .line 9
    return-void
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public constructor <init>(Landroid/content/Context;Lkotlinx/coroutines/m0;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/sumsub/sns/internal/core/domain/r;->a:Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    invoke-interface {p2}, Lkotlinx/coroutines/m0;->getCoroutineContext()Lkotlin/coroutines/CoroutineContext;

    .line 9
    move-result-object p1

    .line 10
    .line 11
    .line 12
    invoke-static {}, Lkotlinx/coroutines/z0;->b()Lkotlinx/coroutines/j0;

    .line 13
    move-result-object p2

    .line 14
    .line 15
    .line 16
    invoke-interface {p1, p2}, Lkotlin/coroutines/CoroutineContext;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    .line 17
    move-result-object p1

    .line 18
    .line 19
    .line 20
    invoke-static {p1}, Lkotlinx/coroutines/n0;->a(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/m0;

    .line 21
    move-result-object p1

    .line 22
    .line 23
    iput-object p1, p0, Lcom/sumsub/sns/internal/core/domain/r;->b:Lkotlinx/coroutines/m0;

    .line 24
    return-void
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
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/core/domain/r;->b()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Lcom/sumsub/sns/internal/core/domain/j;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/sumsub/sns/internal/core/domain/j;-><init>(Lcom/sumsub/sns/internal/core/domain/k;Lkotlin/coroutines/Continuation;)V

    const/4 v2, 0x1

    invoke-static {v1, v0, v2, v1}, Lkotlinx/coroutines/h;->f(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 2
    :cond_0
    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public final a(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p1, Lcom/sumsub/sns/internal/core/domain/o;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/sumsub/sns/internal/core/domain/o;

    iget v1, v0, Lcom/sumsub/sns/internal/core/domain/o;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/core/domain/o;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/core/domain/o;

    invoke-direct {v0, p0, p1}, Lcom/sumsub/sns/internal/core/domain/o;-><init>(Lcom/sumsub/sns/internal/core/domain/r;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p1, v0, Lcom/sumsub/sns/internal/core/domain/o;->a:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 3
    iget v2, v0, Lcom/sumsub/sns/internal/core/domain/o;->c:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/sumsub/sns/internal/core/domain/r;->c:Ljava/lang/String;

    if-nez p1, :cond_5

    iget-object p1, p0, Lcom/sumsub/sns/internal/core/domain/r;->a:Landroid/content/Context;

    .line 4
    sget-object v2, Lcom/sumsub/sns/internal/core/domain/i;->b:Lkotlin/properties/ReadOnlyProperty;

    sget-object v4, Lcom/sumsub/sns/internal/core/domain/i;->a:[Lkotlin/reflect/KProperty;

    const/4 v5, 0x0

    aget-object v4, v4, v5

    invoke-interface {v2, p1, v4}, Lkotlin/properties/ReadOnlyProperty;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/datastore/core/DataStore;

    .line 5
    invoke-interface {p1}, Landroidx/datastore/core/DataStore;->getData()Lkotlinx/coroutines/flow/e;

    move-result-object p1

    .line 6
    new-instance v2, Lcom/sumsub/sns/internal/core/domain/n;

    invoke-direct {v2, p1}, Lcom/sumsub/sns/internal/core/domain/n;-><init>(Lkotlinx/coroutines/flow/e;)V

    .line 7
    iput v3, v0, Lcom/sumsub/sns/internal/core/domain/o;->c:I

    invoke-static {v2, v0}, Lkotlinx/coroutines/flow/g;->F(Lkotlinx/coroutines/flow/e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_4

    .line 8
    iput-object p1, p0, Lcom/sumsub/sns/internal/core/domain/r;->c:Ljava/lang/String;

    goto :goto_2

    :cond_4
    const/4 p1, 0x0

    :goto_2
    if-nez p1, :cond_5

    .line 9
    const-string p1, ""

    :cond_5
    return-object p1
.end method

.method public final b()Ljava/lang/Object;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/domain/r;->c:Ljava/lang/String;

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
.end method

.method public final put(Ljava/lang/Object;)V
    .locals 6

    .line 1
    .line 2
    check-cast p1, Ljava/lang/String;

    .line 3
    .line 4
    iput-object p1, p0, Lcom/sumsub/sns/internal/core/domain/r;->c:Ljava/lang/String;

    .line 5
    .line 6
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/domain/r;->b:Lkotlinx/coroutines/m0;

    .line 7
    .line 8
    new-instance v3, Lcom/sumsub/sns/internal/core/domain/q;

    .line 9
    const/4 v1, 0x0

    .line 10
    .line 11
    .line 12
    invoke-direct {v3, p0, p1, v1}, Lcom/sumsub/sns/internal/core/domain/q;-><init>(Lcom/sumsub/sns/internal/core/domain/r;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    .line 13
    const/4 v4, 0x3

    .line 14
    const/4 v5, 0x0

    .line 15
    const/4 v2, 0x0

    .line 16
    .line 17
    .line 18
    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 19
    return-void
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method
