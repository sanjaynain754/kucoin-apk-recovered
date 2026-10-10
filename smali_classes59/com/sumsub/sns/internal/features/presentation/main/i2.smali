.class public abstract Lcom/sumsub/sns/internal/features/presentation/main/i2;
.super Lcom/sumsub/sns/core/presentation/base/M0;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lcom/sumsub/sns/internal/core/common/s0;


# static fields
.field public static final synthetic c:[Lkotlin/reflect/KProperty;


# instance fields
.field public final a:Lcom/sumsub/sns/internal/features/data/repository/common/a;

.field public final b:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    .line 2
    const-string v0, "getCallbacksLostOopsStrings()Lcom/sumsub/sns/internal/features/presentation/main/CallbacksLostOopsStrings;"

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    const-class v2, Lcom/sumsub/sns/internal/features/presentation/main/i2;

    .line 6
    .line 7
    const-string v3, "callbacksLostOopsStrings"

    .line 8
    .line 9
    .line 10
    invoke-static {v2, v3, v0, v1}, Lcom/sumsub/sns/internal/core/presentation/android/a;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KMutableProperty1;

    .line 11
    move-result-object v0

    .line 12
    const/4 v2, 0x1

    .line 13
    .line 14
    new-array v2, v2, [Lkotlin/reflect/KProperty;

    .line 15
    .line 16
    aput-object v0, v2, v1

    .line 17
    .line 18
    sput-object v2, Lcom/sumsub/sns/internal/features/presentation/main/i2;->c:[Lkotlin/reflect/KProperty;

    .line 19
    return-void
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
.end method

.method public constructor <init>(Landroidx/lifecycle/SavedStateHandle;Lcom/sumsub/sns/internal/features/data/repository/common/a;Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p2, p3}, Lcom/sumsub/sns/core/presentation/base/M0;-><init>(Lcom/sumsub/sns/internal/features/data/repository/common/a;Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;)V

    .line 4
    .line 5
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/main/i2;->a:Lcom/sumsub/sns/internal/features/data/repository/common/a;

    .line 6
    .line 7
    new-instance p2, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 8
    const/4 p3, 0x0

    .line 9
    const/4 v0, 0x0

    .line 10
    .line 11
    const-string v1, "KEY_CALLBACKS_LOST_OOPS_STRINGS"

    .line 12
    .line 13
    .line 14
    invoke-direct {p2, p1, v1, p3, v0}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;-><init>(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 15
    .line 16
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/main/i2;->b:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 17
    return-void
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
.end method

.method public static a(Lcom/sumsub/sns/internal/features/presentation/main/i2;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/main/g2;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/main/g2;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/main/g2;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/main/g2;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/main/g2;

    invoke-direct {v0, p0, p1}, Lcom/sumsub/sns/internal/features/presentation/main/g2;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/i2;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/main/g2;->b:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 1
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/main/g2;->d:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    iget-object p0, v0, Lcom/sumsub/sns/internal/features/presentation/main/g2;->a:Lcom/sumsub/sns/internal/features/presentation/main/i2;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 2
    iput-object p0, v0, Lcom/sumsub/sns/internal/features/presentation/main/g2;->a:Lcom/sumsub/sns/internal/features/presentation/main/i2;

    iput v4, v0, Lcom/sumsub/sns/internal/features/presentation/main/g2;->d:I

    .line 3
    invoke-static {p0, v0}, Lcom/sumsub/sns/core/presentation/base/M0;->onPrepare$suspendImpl(Lcom/sumsub/sns/core/presentation/base/M0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    const/4 p1, 0x0

    .line 4
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/main/g2;->a:Lcom/sumsub/sns/internal/features/presentation/main/i2;

    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/main/g2;->d:I

    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/presentation/main/i2;->a(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_5

    :goto_2
    return-object v1

    .line 5
    :cond_5
    :goto_3
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public final a(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 9

    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/main/h2;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/main/h2;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/main/h2;->g:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/main/h2;->g:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/main/h2;

    invoke-direct {v0, p0, p1}, Lcom/sumsub/sns/internal/features/presentation/main/h2;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/i2;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/main/h2;->e:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 6
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/main/h2;->g:I

    const/4 v3, 0x0

    const/4 v4, 0x0

    packed-switch v2, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    iget-object v1, v0, Lcom/sumsub/sns/internal/features/presentation/main/h2;->d:Ljava/lang/String;

    iget-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/main/h2;->c:Ljava/lang/String;

    iget-object v5, v0, Lcom/sumsub/sns/internal/features/presentation/main/h2;->b:Lcom/sumsub/sns/internal/features/presentation/main/i2;

    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/main/h2;->a:Lcom/sumsub/sns/internal/features/presentation/main/b;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_9

    :pswitch_1
    iget-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/main/h2;->d:Ljava/lang/String;

    iget-object v5, v0, Lcom/sumsub/sns/internal/features/presentation/main/h2;->c:Ljava/lang/String;

    iget-object v6, v0, Lcom/sumsub/sns/internal/features/presentation/main/h2;->b:Lcom/sumsub/sns/internal/features/presentation/main/i2;

    iget-object v7, v0, Lcom/sumsub/sns/internal/features/presentation/main/h2;->a:Lcom/sumsub/sns/internal/features/presentation/main/b;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v8, v7

    move-object v7, v6

    move-object v6, v8

    goto/16 :goto_7

    :pswitch_2
    iget-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/main/h2;->c:Ljava/lang/String;

    iget-object v5, v0, Lcom/sumsub/sns/internal/features/presentation/main/h2;->b:Lcom/sumsub/sns/internal/features/presentation/main/i2;

    iget-object v6, v0, Lcom/sumsub/sns/internal/features/presentation/main/h2;->a:Lcom/sumsub/sns/internal/features/presentation/main/b;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_5

    :pswitch_3
    iget-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/main/h2;->c:Ljava/lang/String;

    iget-object v5, v0, Lcom/sumsub/sns/internal/features/presentation/main/h2;->b:Lcom/sumsub/sns/internal/features/presentation/main/i2;

    iget-object v6, v0, Lcom/sumsub/sns/internal/features/presentation/main/h2;->a:Lcom/sumsub/sns/internal/features/presentation/main/b;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_4

    :pswitch_4
    iget-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/main/h2;->b:Lcom/sumsub/sns/internal/features/presentation/main/i2;

    iget-object v5, v0, Lcom/sumsub/sns/internal/features/presentation/main/h2;->a:Lcom/sumsub/sns/internal/features/presentation/main/b;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_2

    :pswitch_5
    iget-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/main/h2;->b:Lcom/sumsub/sns/internal/features/presentation/main/i2;

    iget-object v5, v0, Lcom/sumsub/sns/internal/features/presentation/main/h2;->a:Lcom/sumsub/sns/internal/features/presentation/main/b;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_6
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 7
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/main/i2;->b:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object v2, Lcom/sumsub/sns/internal/features/presentation/main/i2;->c:[Lkotlin/reflect/KProperty;

    aget-object v2, v2, v3

    invoke-virtual {p1}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/main/b;

    .line 8
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/main/h2;->a:Lcom/sumsub/sns/internal/features/presentation/main/b;

    iput-object p0, v0, Lcom/sumsub/sns/internal/features/presentation/main/h2;->b:Lcom/sumsub/sns/internal/features/presentation/main/i2;

    const/4 v2, 0x1

    iput v2, v0, Lcom/sumsub/sns/internal/features/presentation/main/h2;->g:I

    const-string/jumbo v2, "sns_oops_restartSdk_title"

    invoke-virtual {p0, v2, v0}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_1

    goto/16 :goto_8

    :cond_1
    move-object v5, p1

    move-object p1, v2

    move-object v2, p0

    :goto_1
    check-cast p1, Ljava/lang/String;

    if-nez p1, :cond_4

    .line 9
    iput-object v5, v0, Lcom/sumsub/sns/internal/features/presentation/main/h2;->a:Lcom/sumsub/sns/internal/features/presentation/main/b;

    iput-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/main/h2;->b:Lcom/sumsub/sns/internal/features/presentation/main/i2;

    const/4 p1, 0x2

    iput p1, v0, Lcom/sumsub/sns/internal/features/presentation/main/h2;->g:I

    const-string/jumbo p1, "sns_oops_fatal_title"

    invoke-virtual {p0, p1, v0}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_2

    goto/16 :goto_8

    .line 10
    :cond_2
    :goto_2
    check-cast p1, Ljava/lang/String;

    if-nez p1, :cond_4

    if-eqz v5, :cond_3

    .line 11
    iget-object p1, v5, Lcom/sumsub/sns/internal/features/presentation/main/b;->a:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object p1, v4

    .line 12
    :cond_4
    :goto_3
    iput-object v5, v0, Lcom/sumsub/sns/internal/features/presentation/main/h2;->a:Lcom/sumsub/sns/internal/features/presentation/main/b;

    iput-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/main/h2;->b:Lcom/sumsub/sns/internal/features/presentation/main/i2;

    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/main/h2;->c:Ljava/lang/String;

    const/4 v6, 0x3

    iput v6, v0, Lcom/sumsub/sns/internal/features/presentation/main/h2;->g:I

    const-string/jumbo v6, "sns_oops_restartSdk_html"

    invoke-virtual {p0, v6, v0}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v1, :cond_5

    goto :goto_8

    :cond_5
    move-object v8, v2

    move-object v2, p1

    move-object p1, v6

    move-object v6, v5

    move-object v5, v8

    :goto_4
    check-cast p1, Ljava/lang/String;

    if-nez p1, :cond_8

    .line 13
    iput-object v6, v0, Lcom/sumsub/sns/internal/features/presentation/main/h2;->a:Lcom/sumsub/sns/internal/features/presentation/main/b;

    iput-object v5, v0, Lcom/sumsub/sns/internal/features/presentation/main/h2;->b:Lcom/sumsub/sns/internal/features/presentation/main/i2;

    iput-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/main/h2;->c:Ljava/lang/String;

    const/4 p1, 0x4

    iput p1, v0, Lcom/sumsub/sns/internal/features/presentation/main/h2;->g:I

    const-string/jumbo p1, "sns_oops_fatal_html"

    invoke-virtual {p0, p1, v0}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    goto :goto_8

    .line 14
    :cond_6
    :goto_5
    check-cast p1, Ljava/lang/String;

    if-nez p1, :cond_8

    if-eqz v6, :cond_7

    .line 15
    iget-object p1, v6, Lcom/sumsub/sns/internal/features/presentation/main/b;->b:Ljava/lang/String;

    goto :goto_6

    :cond_7
    move-object p1, v4

    .line 16
    :cond_8
    :goto_6
    iput-object v6, v0, Lcom/sumsub/sns/internal/features/presentation/main/h2;->a:Lcom/sumsub/sns/internal/features/presentation/main/b;

    iput-object v5, v0, Lcom/sumsub/sns/internal/features/presentation/main/h2;->b:Lcom/sumsub/sns/internal/features/presentation/main/i2;

    iput-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/main/h2;->c:Ljava/lang/String;

    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/main/h2;->d:Ljava/lang/String;

    const/4 v7, 0x5

    iput v7, v0, Lcom/sumsub/sns/internal/features/presentation/main/h2;->g:I

    const-string/jumbo v7, "sns_oops_restartSdk_action"

    invoke-virtual {p0, v7, v0}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v1, :cond_9

    goto :goto_8

    :cond_9
    move-object v8, v2

    move-object v2, p1

    move-object p1, v7

    move-object v7, v5

    move-object v5, v8

    :goto_7
    check-cast p1, Ljava/lang/String;

    if-nez p1, :cond_d

    .line 17
    iput-object v6, v0, Lcom/sumsub/sns/internal/features/presentation/main/h2;->a:Lcom/sumsub/sns/internal/features/presentation/main/b;

    iput-object v7, v0, Lcom/sumsub/sns/internal/features/presentation/main/h2;->b:Lcom/sumsub/sns/internal/features/presentation/main/i2;

    iput-object v5, v0, Lcom/sumsub/sns/internal/features/presentation/main/h2;->c:Ljava/lang/String;

    iput-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/main/h2;->d:Ljava/lang/String;

    const/4 p1, 0x6

    iput p1, v0, Lcom/sumsub/sns/internal/features/presentation/main/h2;->g:I

    const-string/jumbo p1, "sns_oops_action_goBack"

    invoke-virtual {p0, p1, v0}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_a

    :goto_8
    return-object v1

    :cond_a
    move-object v1, v2

    move-object v2, v5

    move-object v0, v6

    move-object v5, v7

    .line 18
    :goto_9
    check-cast p1, Ljava/lang/String;

    if-nez p1, :cond_c

    if-eqz v0, :cond_b

    .line 19
    iget-object v4, v0, Lcom/sumsub/sns/internal/features/presentation/main/b;->c:Ljava/lang/String;

    :cond_b
    :goto_a
    move-object v7, v5

    move-object v5, v2

    move-object v2, v1

    goto :goto_b

    :cond_c
    move-object v4, p1

    goto :goto_a

    :cond_d
    move-object v4, p1

    .line 20
    :goto_b
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/main/b;

    invoke-direct {p1, v5, v2, v4}, Lcom/sumsub/sns/internal/features/presentation/main/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    iget-object v0, v7, Lcom/sumsub/sns/internal/features/presentation/main/i2;->b:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 22
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/main/i2;->c:[Lkotlin/reflect/KProperty;

    aget-object v1, v1, v3

    .line 23
    iget-object v1, v0, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 24
    iget-object v0, v0, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    invoke-virtual {v1, v0, p1}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 25
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public abstract a(Lcom/sumsub/sns/core/data/model/SNSCompletionResult;Z)V
.end method

.method public abstract a(Lcom/sumsub/sns/internal/core/common/w;J)V
.end method

.method public abstract a(Lcom/sumsub/sns/internal/features/data/model/common/X;)V
.end method

.method public abstract a(Lcom/sumsub/sns/internal/features/data/model/common/t2;Landroid/os/Parcelable;Ljava/lang/String;)V
.end method

.method public abstract a(ZZ)V
.end method

.method public abstract b(Ljava/lang/String;)V
.end method

.method public abstract c(Z)V
.end method

.method public abstract d(Z)V
.end method

.method public abstract e()V
.end method

.method public abstract e(Z)V
.end method

.method public abstract f()Lcom/sumsub/sns/internal/features/presentation/main/d;
.end method

.method public abstract g()Lcom/sumsub/sns/internal/features/presentation/main/k2;
.end method

.method public final h()Z
    .locals 13

    .line 1
    .line 2
    sget-boolean v0, Lcom/sumsub/sns/internal/core/common/k0;->h:Z

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    return v1

    .line 7
    .line 8
    :cond_0
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 9
    .line 10
    iget-object v0, v0, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 11
    .line 12
    const-string v2, "SNSBaseAppViewModel"

    .line 13
    .line 14
    const-string v3, "SDK restored without callbacks, terminating with the oops screen"

    .line 15
    const/4 v4, 0x0

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v2, v3, v4}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 19
    .line 20
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/main/i2;->a:Lcom/sumsub/sns/internal/features/data/repository/common/a;

    .line 21
    .line 22
    sget-object v2, Lcom/sumsub/sns/core/data/model/SNSSDKState$Ready;->INSTANCE:Lcom/sumsub/sns/core/data/model/SNSSDKState$Ready;

    .line 23
    .line 24
    check-cast v0, Lcom/sumsub/sns/internal/features/data/repository/common/e;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v2}, Lcom/sumsub/sns/internal/features/data/repository/common/e;->a(Lcom/sumsub/sns/core/data/model/SNSSDKState;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/M0;->onPrepareError()V

    .line 31
    .line 32
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/main/s;->c:Lcom/sumsub/sns/internal/features/presentation/main/s;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, v0}, Lcom/sumsub/sns/core/presentation/base/C;->fireEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    .line 36
    .line 37
    new-instance v6, Lcom/sumsub/sns/internal/features/data/model/common/e0;

    .line 38
    .line 39
    new-instance v0, Lcom/sumsub/sns/core/data/model/SNSNeedRestartSDKException;

    .line 40
    .line 41
    .line 42
    invoke-direct {v0}, Lcom/sumsub/sns/core/data/model/SNSNeedRestartSDKException;-><init>()V

    .line 43
    .line 44
    new-instance v7, Lcom/sumsub/sns/internal/features/data/model/common/c0;

    .line 45
    .line 46
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/main/i2;->b:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 47
    .line 48
    sget-object v3, Lcom/sumsub/sns/internal/features/presentation/main/i2;->c:[Lkotlin/reflect/KProperty;

    .line 49
    .line 50
    aget-object v5, v3, v1

    .line 51
    .line 52
    .line 53
    invoke-virtual {v2}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a()Ljava/lang/Object;

    .line 54
    move-result-object v2

    .line 55
    .line 56
    check-cast v2, Lcom/sumsub/sns/internal/features/presentation/main/b;

    .line 57
    .line 58
    if-eqz v2, :cond_1

    .line 59
    .line 60
    iget-object v2, v2, Lcom/sumsub/sns/internal/features/presentation/main/b;->a:Ljava/lang/String;

    .line 61
    move-object v8, v2

    .line 62
    goto :goto_0

    .line 63
    :cond_1
    move-object v8, v4

    .line 64
    .line 65
    :goto_0
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/main/i2;->b:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 66
    .line 67
    aget-object v5, v3, v1

    .line 68
    .line 69
    .line 70
    invoke-virtual {v2}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a()Ljava/lang/Object;

    .line 71
    move-result-object v2

    .line 72
    .line 73
    check-cast v2, Lcom/sumsub/sns/internal/features/presentation/main/b;

    .line 74
    .line 75
    if-eqz v2, :cond_2

    .line 76
    .line 77
    iget-object v2, v2, Lcom/sumsub/sns/internal/features/presentation/main/b;->b:Ljava/lang/String;

    .line 78
    move-object v9, v2

    .line 79
    goto :goto_1

    .line 80
    :cond_2
    move-object v9, v4

    .line 81
    .line 82
    :goto_1
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/main/i2;->b:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 83
    .line 84
    aget-object v1, v3, v1

    .line 85
    .line 86
    .line 87
    invoke-virtual {v2}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a()Ljava/lang/Object;

    .line 88
    move-result-object v1

    .line 89
    .line 90
    check-cast v1, Lcom/sumsub/sns/internal/features/presentation/main/b;

    .line 91
    .line 92
    if-eqz v1, :cond_3

    .line 93
    .line 94
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/presentation/main/b;->c:Ljava/lang/String;

    .line 95
    move-object v10, v1

    .line 96
    goto :goto_2

    .line 97
    :cond_3
    move-object v10, v4

    .line 98
    .line 99
    :goto_2
    sget-object v1, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSResultIcons;->INFO:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSResultIcons;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v1}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSResultIcons;->getImageName()Ljava/lang/String;

    .line 103
    move-result-object v11

    .line 104
    .line 105
    sget-object v12, Lcom/sumsub/sns/core/theme/SNSColorElement;->BACKGROUND_INFO:Lcom/sumsub/sns/core/theme/SNSColorElement;

    .line 106
    .line 107
    .line 108
    invoke-direct/range {v7 .. v12}, Lcom/sumsub/sns/internal/features/data/model/common/c0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/core/theme/SNSColorElement;)V

    .line 109
    const/4 v1, 0x2

    .line 110
    .line 111
    .line 112
    invoke-direct {v6, v0, v4, v7, v1}, Lcom/sumsub/sns/internal/features/data/model/common/e0;-><init>(Ljava/lang/Throwable;Landroid/os/Parcelable;Lcom/sumsub/sns/internal/features/data/model/common/c0;I)V

    .line 113
    .line 114
    const/16 v10, 0x8

    .line 115
    const/4 v11, 0x0

    .line 116
    .line 117
    const-string v7, "TYPE_UNKNOWN"

    .line 118
    const/4 v8, 0x0

    .line 119
    const/4 v9, 0x0

    .line 120
    move-object v5, p0

    .line 121
    .line 122
    .line 123
    invoke-static/range {v5 .. v11}, Lcom/sumsub/sns/core/presentation/base/C;->throwError$default(Lcom/sumsub/sns/core/presentation/base/C;Lcom/sumsub/sns/internal/features/data/model/common/l0;Ljava/lang/String;ZLjava/lang/String;ILjava/lang/Object;)V

    .line 124
    const/4 v0, 0x1

    .line 125
    return v0
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
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
.end method

.method public onCleared()V
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/sumsub/sns/core/presentation/base/M0;->onCleared()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/main/i2;->f()Lcom/sumsub/sns/internal/features/presentation/main/d;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    iget-object v1, v0, Lcom/sumsub/sns/internal/features/presentation/main/d;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    .line 16
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 17
    move-result-object v1

    .line 18
    .line 19
    .line 20
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    move-result v2

    .line 22
    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    .line 26
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    move-result-object v2

    .line 28
    .line 29
    check-cast v2, Lkotlinx/coroutines/w;

    .line 30
    const/4 v3, 0x1

    .line 31
    const/4 v4, 0x0

    .line 32
    .line 33
    .line 34
    invoke-static {v2, v4, v3, v4}, Lkotlinx/coroutines/x1$a;->a(Lkotlinx/coroutines/x1;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 35
    goto :goto_0

    .line 36
    .line 37
    :cond_0
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/main/d;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 41
    return-void
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
.end method
