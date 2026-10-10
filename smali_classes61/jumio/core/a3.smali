.class public abstract Ljumio/core/a3;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lcom/jumio/core/scope/ScopeProviderInterface;

.field public final b:Ljava/util/concurrent/CopyOnWriteArrayList;


# direct methods
.method public constructor <init>(Lcom/jumio/core/scope/ScopeProviderInterface;)V
    .locals 1

    .line 1
    .line 2
    const-string v0, "scopeProvider"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    iput-object p1, p0, Ljumio/core/a3;->a:Lcom/jumio/core/scope/ScopeProviderInterface;

    .line 11
    .line 12
    new-instance p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 13
    .line 14
    .line 15
    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 16
    .line 17
    iput-object p1, p0, Ljumio/core/a3;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

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
.end method


# virtual methods
.method public final add(Lcom/jumio/core/model/Subscriber;)Z
    .locals 1
    .param p1    # Lcom/jumio/core/model/Subscriber;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jumio/core/model/Subscriber<",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "subscriber"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    iget-object v0, p0, Ljumio/core/a3;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->contains(Ljava/lang/Object;)Z

    .line 12
    move-result v0

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, Ljumio/core/a3;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 20
    move-result p1

    .line 21
    .line 22
    if-eqz p1, :cond_0

    .line 23
    const/4 p1, 0x1

    .line 24
    return p1

    .line 25
    :cond_0
    const/4 p1, 0x0

    .line 26
    return p1
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public final publishError(Ljava/lang/Throwable;)V
    .locals 5
    .param p1    # Ljava/lang/Throwable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "error"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Ljumio/core/a3;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    .line 14
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    move-result v1

    .line 16
    .line 17
    if-eqz v1, :cond_3

    .line 18
    .line 19
    .line 20
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    move-result-object v1

    .line 22
    .line 23
    check-cast v1, Lcom/jumio/core/model/Subscriber;

    .line 24
    .line 25
    :try_start_0
    sget-object v2, Lcom/jumio/core/util/ReflectionUtil;->INSTANCE:Lcom/jumio/core/util/ReflectionUtil;

    .line 26
    .line 27
    const-string v3, "onError"

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    move-result-object v4

    .line 32
    .line 33
    .line 34
    filled-new-array {v4}, [Ljava/lang/Class;

    .line 35
    move-result-object v4

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2, v1, v3, v4}, Lcom/jumio/core/util/ReflectionUtil;->getMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 39
    move-result-object v2

    .line 40
    const/4 v3, 0x0

    .line 41
    .line 42
    if-eqz v2, :cond_0

    .line 43
    .line 44
    const-class v4, Lcom/jumio/core/model/InvokeOnUiThread;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v2, v4}, Ljava/lang/reflect/Method;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 48
    move-result-object v2

    .line 49
    .line 50
    check-cast v2, Lcom/jumio/core/model/InvokeOnUiThread;

    .line 51
    goto :goto_1

    .line 52
    :cond_0
    move-object v2, v3

    .line 53
    .line 54
    :goto_1
    if-eqz v2, :cond_2

    .line 55
    .line 56
    .line 57
    invoke-interface {v2}, Lcom/jumio/core/model/InvokeOnUiThread;->value()Z

    .line 58
    move-result v2

    .line 59
    .line 60
    if-nez v2, :cond_1

    .line 61
    goto :goto_2

    .line 62
    .line 63
    :cond_1
    iget-object v2, p0, Ljumio/core/a3;->a:Lcom/jumio/core/scope/ScopeProviderInterface;

    .line 64
    .line 65
    new-instance v4, Ljumio/core/Y2;

    .line 66
    .line 67
    .line 68
    invoke-direct {v4, v1, p1, v3}, Ljumio/core/Y2;-><init>(Lcom/jumio/core/model/Subscriber;Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)V

    .line 69
    .line 70
    .line 71
    invoke-interface {v2, v4}, Lcom/jumio/core/scope/ScopeProviderInterface;->postOnMain(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/x1;

    .line 72
    goto :goto_0

    .line 73
    .line 74
    .line 75
    :cond_2
    :goto_2
    invoke-interface {v1, p1}, Lcom/jumio/core/model/Subscriber;->onError(Ljava/lang/Throwable;)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 76
    goto :goto_0

    .line 77
    .line 78
    .line 79
    :catch_0
    invoke-interface {v1, p1}, Lcom/jumio/core/model/Subscriber;->onError(Ljava/lang/Throwable;)V

    .line 80
    goto :goto_0

    .line 81
    :cond_3
    return-void
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
.end method

.method public final publishResult(Ljava/lang/Object;)V
    .locals 6
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Ljumio/core/a3;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    move-result v1

    .line 11
    .line 12
    if-eqz v1, :cond_4

    .line 13
    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    check-cast v1, Lcom/jumio/core/model/Subscriber;

    .line 19
    const/4 v2, 0x0

    .line 20
    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    .line 24
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    move-result-object v3

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    move-object v3, v2

    .line 28
    .line 29
    :goto_1
    sget-object v4, Lcom/jumio/core/util/ReflectionUtil;->INSTANCE:Lcom/jumio/core/util/ReflectionUtil;

    .line 30
    .line 31
    const-string v5, "onResult"

    .line 32
    .line 33
    .line 34
    filled-new-array {v3}, [Ljava/lang/Class;

    .line 35
    move-result-object v3

    .line 36
    .line 37
    .line 38
    invoke-virtual {v4, v1, v5, v3}, Lcom/jumio/core/util/ReflectionUtil;->getMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 39
    move-result-object v3

    .line 40
    .line 41
    if-eqz v3, :cond_1

    .line 42
    .line 43
    const-class v4, Lcom/jumio/core/model/InvokeOnUiThread;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v3, v4}, Ljava/lang/reflect/Method;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 47
    move-result-object v3

    .line 48
    .line 49
    check-cast v3, Lcom/jumio/core/model/InvokeOnUiThread;

    .line 50
    goto :goto_2

    .line 51
    :cond_1
    move-object v3, v2

    .line 52
    .line 53
    :goto_2
    if-eqz v3, :cond_3

    .line 54
    .line 55
    .line 56
    invoke-interface {v3}, Lcom/jumio/core/model/InvokeOnUiThread;->value()Z

    .line 57
    move-result v3

    .line 58
    .line 59
    if-nez v3, :cond_2

    .line 60
    goto :goto_3

    .line 61
    .line 62
    :cond_2
    iget-object v3, p0, Ljumio/core/a3;->a:Lcom/jumio/core/scope/ScopeProviderInterface;

    .line 63
    .line 64
    new-instance v4, Ljumio/core/Z2;

    .line 65
    .line 66
    .line 67
    invoke-direct {v4, v1, p1, v2}, Ljumio/core/Z2;-><init>(Lcom/jumio/core/model/Subscriber;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)V

    .line 68
    .line 69
    .line 70
    invoke-interface {v3, v4}, Lcom/jumio/core/scope/ScopeProviderInterface;->postOnMain(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/x1;

    .line 71
    goto :goto_0

    .line 72
    .line 73
    .line 74
    :cond_3
    :goto_3
    invoke-interface {v1, p1}, Lcom/jumio/core/model/Subscriber;->onResult(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 75
    goto :goto_0

    .line 76
    .line 77
    .line 78
    :catch_0
    invoke-interface {v1, p1}, Lcom/jumio/core/model/Subscriber;->onResult(Ljava/lang/Object;)V

    .line 79
    goto :goto_0

    .line 80
    :cond_4
    return-void
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
.end method

.method public final remove(Lcom/jumio/core/model/Subscriber;)Z
    .locals 1
    .param p1    # Lcom/jumio/core/model/Subscriber;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jumio/core/model/Subscriber<",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "subscriber"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    iget-object v0, p0, Ljumio/core/a3;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 12
    move-result p1

    .line 13
    return p1
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
.end method

.method public final removeAllSubscriber()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Ljumio/core/a3;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->clear()V

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
.end method
