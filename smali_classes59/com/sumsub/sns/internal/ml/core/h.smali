.class public abstract Lcom/sumsub/sns/internal/ml/core/h;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lcom/sumsub/sns/internal/ml/core/o;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lcom/sumsub/sns/internal/core/common/a1;

.field public c:Lorg/tensorflow/lite/InterpreterApi;

.field public final d:Lkotlin/Lazy;

.field public final e:Lkotlin/Lazy;

.field public volatile f:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/sumsub/sns/internal/ml/core/h;->a:Ljava/lang/String;

    .line 6
    .line 7
    new-instance p1, Lcom/sumsub/sns/internal/core/common/a1;

    .line 8
    .line 9
    .line 10
    invoke-direct {p1}, Lcom/sumsub/sns/internal/core/common/a1;-><init>()V

    .line 11
    .line 12
    iput-object p1, p0, Lcom/sumsub/sns/internal/ml/core/h;->b:Lcom/sumsub/sns/internal/core/common/a1;

    .line 13
    .line 14
    new-instance p1, Lcom/sumsub/sns/internal/ml/core/t;

    .line 15
    .line 16
    .line 17
    invoke-direct {p1, p0}, Lcom/sumsub/sns/internal/ml/core/t;-><init>(Lcom/sumsub/sns/internal/ml/core/h;)V

    .line 18
    .line 19
    .line 20
    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 21
    move-result-object p1

    .line 22
    .line 23
    iput-object p1, p0, Lcom/sumsub/sns/internal/ml/core/h;->d:Lkotlin/Lazy;

    .line 24
    .line 25
    new-instance p1, Lcom/sumsub/sns/internal/ml/core/u;

    .line 26
    .line 27
    .line 28
    invoke-direct {p1, p0}, Lcom/sumsub/sns/internal/ml/core/u;-><init>(Lcom/sumsub/sns/internal/ml/core/h;)V

    .line 29
    .line 30
    .line 31
    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 32
    move-result-object p1

    .line 33
    .line 34
    iput-object p1, p0, Lcom/sumsub/sns/internal/ml/core/h;->e:Lkotlin/Lazy;

    .line 35
    return-void
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
.end method

.method public static final a(Lcom/sumsub/sns/internal/ml/core/h;Lkotlin/jvm/functions/Function0;Lkotlinx/coroutines/m0;)Lcom/sumsub/sns/internal/ml/core/n;
    .locals 4

    .line 3
    iget-object p2, p0, Lcom/sumsub/sns/internal/ml/core/h;->d:Lkotlin/Lazy;

    .line 4
    invoke-interface {p2}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/concurrent/ExecutorService;

    .line 5
    new-instance v0, Lcom/sumsub/sns/internal/ml/core/w;

    invoke-direct {v0, p1, p0}, Lcom/sumsub/sns/internal/ml/core/w;-><init>(Lkotlin/jvm/functions/Function0;Lcom/sumsub/sns/internal/ml/core/h;)V

    invoke-interface {p2, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object p1

    .line 6
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/ml/core/h;->a()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long p2, v0, v2

    if-gtz p2, :cond_0

    .line 7
    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object p0

    .line 8
    check-cast p0, Lcom/sumsub/sns/internal/ml/core/n;

    return-object p0

    .line 9
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/ml/core/h;->a()J

    move-result-wide v0

    sget-object p2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {p1, v0, v1, p2}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sumsub/sns/internal/ml/core/n;
    :try_end_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    const/4 p1, 0x1

    .line 10
    iput-boolean p1, p0, Lcom/sumsub/sns/internal/ml/core/h;->f:Z

    .line 11
    iget-object p1, p0, Lcom/sumsub/sns/internal/ml/core/h;->a:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/sumsub/sns/internal/ml/core/h;->d()Ljava/lang/String;

    move-result-object p0

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "MlSolution timeout ("

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 12
    sget-object p2, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 13
    iget-object p2, p2, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    const/4 v0, 0x0

    .line 14
    invoke-virtual {p2, p1, p0, v0}, Lcom/sumsub/sns/internal/log/logger/b;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 15
    new-instance p0, Lcom/sumsub/sns/internal/ml/core/m;

    invoke-direct {p0}, Lcom/sumsub/sns/internal/ml/core/m;-><init>()V

    return-object p0
.end method

.method public static final a(Lkotlin/jvm/functions/Function0;Lcom/sumsub/sns/internal/ml/core/h;)Lcom/sumsub/sns/internal/ml/core/n;
    .locals 2

    const/4 v0, 0x1

    .line 43
    :try_start_0
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object p0

    const/4 v1, 0x0

    .line 44
    iput-boolean v1, p1, Lcom/sumsub/sns/internal/ml/core/h;->f:Z

    .line 45
    new-instance v1, Lcom/sumsub/sns/internal/ml/core/l;

    invoke-direct {v1, p0}, Lcom/sumsub/sns/internal/ml/core/l;-><init>(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lcom/sumsub/sns/internal/ml/core/i; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v1

    :catchall_0
    move-exception p0

    goto :goto_0

    :catch_0
    move-exception p0

    goto :goto_1

    :catch_1
    move-exception p0

    goto :goto_2

    .line 46
    :goto_0
    iput-boolean v0, p1, Lcom/sumsub/sns/internal/ml/core/h;->f:Z

    .line 47
    iget-object p1, p1, Lcom/sumsub/sns/internal/ml/core/h;->a:Ljava/lang/String;

    .line 48
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 49
    iget-object v0, v0, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 50
    const-string v1, "Error while executing ML model"

    invoke-virtual {v0, p1, v1, p0}, Lcom/sumsub/sns/internal/log/logger/b;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 51
    new-instance p1, Lcom/sumsub/sns/internal/ml/core/j;

    invoke-direct {p1, p0}, Lcom/sumsub/sns/internal/ml/core/j;-><init>(Ljava/lang/Throwable;)V

    goto :goto_3

    .line 52
    :goto_1
    iput-boolean v0, p1, Lcom/sumsub/sns/internal/ml/core/h;->f:Z

    .line 53
    iget-object p1, p1, Lcom/sumsub/sns/internal/ml/core/h;->a:Ljava/lang/String;

    .line 54
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 55
    iget-object v0, v0, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 56
    const-string v1, "Error while loading ML model"

    invoke-virtual {v0, p1, v1, p0}, Lcom/sumsub/sns/internal/log/logger/b;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 57
    new-instance p1, Lcom/sumsub/sns/internal/ml/core/j;

    invoke-direct {p1, p0}, Lcom/sumsub/sns/internal/ml/core/j;-><init>(Ljava/lang/Throwable;)V

    goto :goto_3

    .line 58
    :goto_2
    iput-boolean v0, p1, Lcom/sumsub/sns/internal/ml/core/h;->f:Z

    .line 59
    iget-object p1, p1, Lcom/sumsub/sns/internal/ml/core/h;->a:Ljava/lang/String;

    .line 60
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 61
    iget-object v0, v0, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 62
    const-string v1, "Can\'t find Native TensorFlow library"

    invoke-virtual {v0, p1, v1, p0}, Lcom/sumsub/sns/internal/log/logger/b;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 63
    new-instance p1, Lcom/sumsub/sns/internal/ml/core/j;

    invoke-direct {p1, p0}, Lcom/sumsub/sns/internal/ml/core/j;-><init>(Ljava/lang/Throwable;)V

    :goto_3
    return-object p1
.end method

.method public static final a(Lcom/sumsub/sns/internal/ml/core/h;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 25
    iget-object v0, p0, Lcom/sumsub/sns/internal/ml/core/h;->b:Lcom/sumsub/sns/internal/core/common/a1;

    new-instance v1, Lcom/sumsub/sns/internal/ml/core/s;

    invoke-direct {v1, p0, p1}, Lcom/sumsub/sns/internal/ml/core/s;-><init>(Lcom/sumsub/sns/internal/ml/core/h;Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    .line 27
    invoke-interface {v1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 28
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v4

    sub-long/2addr v4, v2

    .line 29
    iget-object v1, v0, Lcom/sumsub/sns/internal/core/common/a1;->a:Ljava/util/ArrayList;

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v1, 0x0

    .line 30
    iput-boolean v1, v0, Lcom/sumsub/sns/internal/core/common/a1;->b:Z

    .line 31
    invoke-virtual {p0, p1, v4, v5}, Lcom/sumsub/sns/internal/ml/core/h;->a(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic a(Lcom/sumsub/sns/internal/ml/core/h;Ljava/lang/Object;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 1

    .line 24
    new-instance v0, Lcom/sumsub/sns/internal/ml/core/q;

    invoke-direct {v0, p0, p1}, Lcom/sumsub/sns/internal/ml/core/q;-><init>(Lcom/sumsub/sns/internal/ml/core/h;Ljava/lang/Object;)V

    invoke-virtual {p0, v0, p2}, Lcom/sumsub/sns/internal/ml/core/h;->a(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static a(Lcom/sumsub/sns/internal/ml/core/h;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p1, Lcom/sumsub/sns/internal/ml/core/d;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/sumsub/sns/internal/ml/core/d;

    iget v1, v0, Lcom/sumsub/sns/internal/ml/core/d;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/ml/core/d;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/ml/core/d;

    invoke-direct {v0, p0, p1}, Lcom/sumsub/sns/internal/ml/core/d;-><init>(Lcom/sumsub/sns/internal/ml/core/h;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p1, v0, Lcom/sumsub/sns/internal/ml/core/d;->b:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 32
    iget v2, v0, Lcom/sumsub/sns/internal/ml/core/d;->d:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lcom/sumsub/sns/internal/ml/core/d;->a:Lcom/sumsub/sns/internal/ml/core/h;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 33
    iget-object p1, p0, Lcom/sumsub/sns/internal/ml/core/h;->e:Lkotlin/Lazy;

    .line 34
    invoke-interface {p1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkotlinx/coroutines/m1;

    .line 35
    new-instance v2, Lcom/sumsub/sns/internal/ml/core/e;

    const/4 v4, 0x0

    invoke-direct {v2, p0, v4}, Lcom/sumsub/sns/internal/ml/core/e;-><init>(Lcom/sumsub/sns/internal/ml/core/h;Lkotlin/coroutines/Continuation;)V

    iput-object p0, v0, Lcom/sumsub/sns/internal/ml/core/d;->a:Lcom/sumsub/sns/internal/ml/core/h;

    iput v3, v0, Lcom/sumsub/sns/internal/ml/core/d;->d:I

    invoke-static {p1, v2, v0}, Lkotlinx/coroutines/h;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    .line 36
    :cond_3
    :goto_1
    iget-object p0, p0, Lcom/sumsub/sns/internal/ml/core/h;->d:Lkotlin/Lazy;

    .line 37
    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/concurrent/ExecutorService;

    .line 38
    invoke-interface {p0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 39
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final a(Lcom/sumsub/sns/internal/ml/core/h;Ljava/lang/Runnable;)Ljava/lang/Thread;
    .locals 2

    .line 18
    new-instance v0, Ljava/lang/Thread;

    invoke-virtual {p0}, Lcom/sumsub/sns/internal/ml/core/h;->d()Ljava/lang/String;

    move-result-object p0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "CoroutineThread"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p1, p0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    return-object v0
.end method

.method public static final a(Lcom/sumsub/sns/internal/ml/core/h;)Lkotlinx/coroutines/m1;
    .locals 1

    .line 16
    new-instance v0, Lcom/sumsub/sns/internal/ml/core/y;

    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/ml/core/y;-><init>(Lcom/sumsub/sns/internal/ml/core/h;)V

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object p0

    .line 17
    invoke-static {p0}, Lkotlinx/coroutines/o1;->c(Ljava/util/concurrent/ExecutorService;)Lkotlinx/coroutines/m1;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lcom/sumsub/sns/internal/ml/core/h;Ljava/lang/Runnable;)Ljava/lang/Thread;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/Thread;

    invoke-virtual {p0}, Lcom/sumsub/sns/internal/ml/core/h;->d()Ljava/lang/String;

    move-result-object p0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "Thread"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p1, p0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    return-object v0
.end method

.method public static final b(Lcom/sumsub/sns/internal/ml/core/h;Ljava/lang/Object;)Lkotlin/Unit;
    .locals 1

    .line 12
    iget-object v0, p0, Lcom/sumsub/sns/internal/ml/core/h;->c:Lorg/tensorflow/lite/InterpreterApi;

    if-nez v0, :cond_0

    .line 13
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/ml/core/h;->e()Lorg/tensorflow/lite/InterpreterApi;

    move-result-object v0

    .line 14
    iput-object v0, p0, Lcom/sumsub/sns/internal/ml/core/h;->c:Lorg/tensorflow/lite/InterpreterApi;

    .line 15
    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/ml/core/h;->a(Lorg/tensorflow/lite/InterpreterApi;)V

    .line 16
    :cond_0
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/ml/core/h;->a(Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    .line 17
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/ml/core/h;->c()Ljava/util/Map;

    move-result-object p0

    .line 18
    invoke-interface {v0, p1, p0}, Lorg/tensorflow/lite/InterpreterApi;->runForMultipleInputsOutputs([Ljava/lang/Object;Ljava/util/Map;)V

    .line 19
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final b(Lcom/sumsub/sns/internal/ml/core/h;)Z
    .locals 6

    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/ml/core/h;->b:Lcom/sumsub/sns/internal/core/common/a1;

    new-instance v1, Lcom/sumsub/sns/internal/ml/core/v;

    invoke-direct {v1, p0}, Lcom/sumsub/sns/internal/ml/core/v;-><init>(Lcom/sumsub/sns/internal/ml/core/h;)V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    .line 4
    invoke-interface {v1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 5
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v4

    sub-long/2addr v4, v2

    .line 6
    iget-object v1, v0, Lcom/sumsub/sns/internal/core/common/a1;->a:Ljava/util/ArrayList;

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v1, 0x0

    .line 7
    iput-boolean v1, v0, Lcom/sumsub/sns/internal/core/common/a1;->b:Z

    .line 8
    iget-object p0, p0, Lcom/sumsub/sns/internal/ml/core/h;->a:Ljava/lang/String;

    .line 9
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 10
    iget-object v0, v0, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 11
    const-string/jumbo v1, "preloadModel finished"

    const/4 v2, 0x0

    invoke-virtual {v0, p0, v1, v2}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p0, 0x1

    return p0
.end method

.method public static final c(Lcom/sumsub/sns/internal/ml/core/h;)Lkotlin/Unit;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/sumsub/sns/internal/ml/core/h;->c:Lorg/tensorflow/lite/InterpreterApi;

    if-nez v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/ml/core/h;->e()Lorg/tensorflow/lite/InterpreterApi;

    move-result-object v0

    .line 3
    iput-object v0, p0, Lcom/sumsub/sns/internal/ml/core/h;->c:Lorg/tensorflow/lite/InterpreterApi;

    .line 4
    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/ml/core/h;->a(Lorg/tensorflow/lite/InterpreterApi;)V

    .line 5
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final d(Lcom/sumsub/sns/internal/ml/core/h;)Ljava/util/concurrent/ExecutorService;
    .locals 1

    .line 1
    new-instance v0, Lcom/sumsub/sns/internal/ml/core/x;

    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/ml/core/x;-><init>(Lcom/sumsub/sns/internal/ml/core/h;)V

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a()J
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public abstract a(Ljava/lang/Object;J)Ljava/lang/Object;
.end method

.method public final a(Lkotlin/coroutines/jvm/internal/SuspendLambda;)Ljava/lang/Object;
    .locals 4

    .line 19
    iget-object v0, p0, Lcom/sumsub/sns/internal/ml/core/h;->a:Ljava/lang/String;

    .line 20
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 21
    iget-object v1, v1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 22
    const-string/jumbo v2, "preloadModel"

    const/4 v3, 0x0

    invoke-virtual {v1, v0, v2, v3}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 23
    new-instance v0, Lcom/sumsub/sns/internal/ml/core/p;

    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/ml/core/p;-><init>(Lcom/sumsub/sns/internal/ml/core/h;)V

    invoke-virtual {p0, v0, p1}, Lcom/sumsub/sns/internal/ml/core/h;->a(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final a(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 2

    .line 40
    new-instance v0, Lcom/sumsub/sns/internal/ml/core/r;

    invoke-direct {v0, p0, p1}, Lcom/sumsub/sns/internal/ml/core/r;-><init>(Lcom/sumsub/sns/internal/ml/core/h;Lkotlin/jvm/functions/Function0;)V

    .line 41
    iget-object p1, p0, Lcom/sumsub/sns/internal/ml/core/h;->e:Lkotlin/Lazy;

    invoke-interface {p1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkotlinx/coroutines/m1;

    .line 42
    new-instance v1, Lcom/sumsub/sns/internal/ml/core/g;

    invoke-direct {v1, v0}, Lcom/sumsub/sns/internal/ml/core/g;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-static {p1, v1, p2}, Lkotlinx/coroutines/h;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public a(Lorg/tensorflow/lite/InterpreterApi;)V
    .locals 0

    .line 2
    return-void
.end method

.method public abstract a(Ljava/lang/Object;)[Ljava/lang/Object;
.end method

.method public abstract b()Lcom/sumsub/sns/internal/ml/core/c;
.end method

.method public abstract c()Ljava/util/Map;
.end method

.method public abstract d()Ljava/lang/String;
.end method

.method public final e()Lorg/tensorflow/lite/InterpreterApi;
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/ml/core/h;->a:Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/ml/core/h;->b()Lcom/sumsub/sns/internal/ml/core/c;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    new-instance v2, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    const-string v3, "initInterpreter: "

    .line 14
    .line 15
    .line 16
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    move-result-object v1

    .line 24
    .line 25
    sget-object v2, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 26
    .line 27
    iget-object v2, v2, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 28
    const/4 v3, 0x0

    .line 29
    .line 30
    .line 31
    invoke-virtual {v2, v0, v1, v3}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/ml/core/h;->b()Lcom/sumsub/sns/internal/ml/core/c;

    .line 35
    move-result-object v0

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/ml/core/c;->a()Ljava/nio/ByteBuffer;

    .line 39
    move-result-object v0

    .line 40
    .line 41
    new-instance v1, Lorg/tensorflow/lite/InterpreterApi$Options;

    .line 42
    .line 43
    .line 44
    invoke-direct {v1}, Lorg/tensorflow/lite/InterpreterApi$Options;-><init>()V

    .line 45
    const/4 v2, -0x1

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1, v2}, Lorg/tensorflow/lite/InterpreterApi$Options;->setNumThreads(I)Lorg/tensorflow/lite/InterpreterApi$Options;

    .line 49
    const/4 v2, 0x1

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1, v2}, Lorg/tensorflow/lite/InterpreterApi$Options;->setCancellable(Z)Lorg/tensorflow/lite/InterpreterApi$Options;

    .line 53
    .line 54
    .line 55
    invoke-static {v0, v1}, Lorg/tensorflow/lite/InterpreterApi;->create(Ljava/nio/ByteBuffer;Lorg/tensorflow/lite/InterpreterApi$Options;)Lorg/tensorflow/lite/InterpreterApi;

    .line 56
    move-result-object v0

    .line 57
    return-object v0
.end method

.method public final finalize()V
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/ml/core/f;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, p0, v1}, Lcom/sumsub/sns/internal/ml/core/f;-><init>(Lcom/sumsub/sns/internal/ml/core/h;Lkotlin/coroutines/Continuation;)V

    .line 7
    const/4 v2, 0x1

    .line 8
    .line 9
    .line 10
    invoke-static {v1, v0, v2, v1}, Lkotlinx/coroutines/h;->f(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;

    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method
