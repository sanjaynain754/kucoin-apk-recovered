.class public final Lcom/jumio/core/api/SingleProcessor;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jumio/core/model/Subscriber;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/jumio/core/model/Subscriber<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0010\u0003\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0006\u0010\u000f\u001a\u00020\u0010J\u0012\u0010\u0011\u001a\u00020\u00102\n\u0010\u0012\u001a\u0006\u0012\u0002\u0008\u00030\u0013J\u0006\u0010\u0014\u001a\u00020\u0015J\u000c\u0010\u0016\u001a\u0008\u0012\u0002\u0008\u0003\u0018\u00010\u0013J\u0012\u0010\u0017\u001a\u00020\u00102\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0016\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0016\u001a\u00020\u0015J\u000e\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020!R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0008\u0012\u0002\u0008\u0003\u0018\u00010\u000cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u000c\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""
    }
    d2 = {
        "Lcom/jumio/core/api/SingleProcessor;",
        "Lcom/jumio/core/model/Subscriber;",
        "",
        "executorService",
        "Ljava/util/concurrent/ExecutorService;",
        "apiCallSettings",
        "Lcom/jumio/core/network/ApiCallSettings;",
        "apiResult",
        "Lcom/jumio/core/network/ApiResult;",
        "<init>",
        "(Ljava/util/concurrent/ExecutorService;Lcom/jumio/core/network/ApiCallSettings;Lcom/jumio/core/network/ApiResult;)V",
        "call",
        "Lcom/jumio/core/network/ApiCall;",
        "currentCallable",
        "Ljava/util/concurrent/Future;",
        "destroy",
        "",
        "execute",
        "apiCallDataModel",
        "Lcom/jumio/core/models/ApiCallDataModel;",
        "retry",
        "",
        "abort",
        "onResult",
        "result",
        "onError",
        "error",
        "",
        "persist",
        "persistor",
        "Lcom/jumio/core/persistence/PersistenceUtil$Persist;",
        "restore",
        "restorer",
        "Lcom/jumio/core/persistence/PersistenceUtil$Restore;",
        "jumio-core_release"
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
        "SMAP\nSingleProcessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SingleProcessor.kt\ncom/jumio/core/api/SingleProcessor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,89:1\n1#2:90\n*E\n"
    }
.end annotation


# instance fields
.field public final a:Ljava/util/concurrent/ExecutorService;

.field public final b:Lcom/jumio/core/api/BackendManager;

.field public final c:Lcom/jumio/core/api/BackendManager;

.field public d:Lcom/jumio/core/network/ApiCall;

.field public e:Ljava/util/concurrent/Future;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/ExecutorService;Lcom/jumio/core/api/BackendManager;Lcom/jumio/core/api/BackendManager;)V
    .locals 1

    .line 1
    .line 2
    const-string v0, "executorService"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "apiCallSettings"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    const-string v0, "apiResult"

    .line 13
    .line 14
    .line 15
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    .line 20
    iput-object p1, p0, Lcom/jumio/core/api/SingleProcessor;->a:Ljava/util/concurrent/ExecutorService;

    .line 21
    .line 22
    iput-object p2, p0, Lcom/jumio/core/api/SingleProcessor;->b:Lcom/jumio/core/api/BackendManager;

    .line 23
    .line 24
    iput-object p3, p0, Lcom/jumio/core/api/SingleProcessor;->c:Lcom/jumio/core/api/BackendManager;

    .line 25
    return-void
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
.end method


# virtual methods
.method public final a(Lcom/jumio/core/models/ApiCallDataModel;)V
    .locals 3

    .line 1
    .line 2
    const-string v0, "apiCallDataModel"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/jumio/core/api/SingleProcessor;->e:Ljava/util/concurrent/Future;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/jumio/core/models/ApiCallDataModel;->getCall()Ljava/lang/Class;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    const-class v1, Ljumio/core/f;

    .line 16
    .line 17
    const-class v2, Lcom/jumio/core/models/ApiCallDataModel;

    .line 18
    .line 19
    .line 20
    filled-new-array {v1, v2}, [Ljava/lang/Class;

    .line 21
    move-result-object v1

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 25
    move-result-object v0

    .line 26
    .line 27
    iget-object v1, p0, Lcom/jumio/core/api/SingleProcessor;->b:Lcom/jumio/core/api/BackendManager;

    .line 28
    .line 29
    .line 30
    filled-new-array {v1, p1}, [Ljava/lang/Object;

    .line 31
    move-result-object p1

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, p1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    move-result-object p1

    .line 36
    .line 37
    const-string v0, "null cannot be cast to non-null type com.jumio.core.network.ApiCall<*>"

    .line 38
    .line 39
    .line 40
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    .line 42
    check-cast p1, Lcom/jumio/core/network/ApiCall;

    .line 43
    .line 44
    iput-object p1, p0, Lcom/jumio/core/api/SingleProcessor;->d:Lcom/jumio/core/network/ApiCall;

    .line 45
    .line 46
    const-string v0, "null cannot be cast to non-null type com.jumio.core.model.Publisher<kotlin.Any?>"

    .line 47
    .line 48
    .line 49
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1, p0}, Ljumio/core/a3;->add(Lcom/jumio/core/model/Subscriber;)Z

    .line 53
    .line 54
    iget-object p1, p0, Lcom/jumio/core/api/SingleProcessor;->a:Ljava/util/concurrent/ExecutorService;

    .line 55
    .line 56
    iget-object v0, p0, Lcom/jumio/core/api/SingleProcessor;->d:Lcom/jumio/core/network/ApiCall;

    .line 57
    .line 58
    .line 59
    invoke-interface {p1, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    .line 60
    move-result-object p1

    .line 61
    .line 62
    const-string v0, "null cannot be cast to non-null type java.util.concurrent.Future<com.jumio.core.network.ApiCall<*>>"

    .line 63
    .line 64
    .line 65
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    .line 67
    iput-object p1, p0, Lcom/jumio/core/api/SingleProcessor;->e:Ljava/util/concurrent/Future;

    .line 68
    return-void

    .line 69
    .line 70
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 71
    .line 72
    const-string v0, "Another call is being executed"

    .line 73
    .line 74
    .line 75
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 76
    throw p1
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
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 2
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
    iget-object v0, p0, Lcom/jumio/core/api/SingleProcessor;->d:Lcom/jumio/core/network/ApiCall;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v1, p0, Lcom/jumio/core/api/SingleProcessor;->c:Lcom/jumio/core/api/BackendManager;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Lcom/jumio/core/network/ApiCall;->getApiCallDataModel()Lcom/jumio/core/models/ApiCallDataModel;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    .line 18
    invoke-interface {v1, v0, p1}, Ljumio/core/g;->onError(Lcom/jumio/core/models/ApiCallDataModel;Ljava/lang/Throwable;)V

    .line 19
    :cond_0
    const/4 p1, 0x0

    .line 20
    .line 21
    iput-object p1, p0, Lcom/jumio/core/api/SingleProcessor;->e:Ljava/util/concurrent/Future;

    .line 22
    return-void
    .line 23
    .line 24
.end method

.method public onResult(Ljava/lang/Object;)V
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/api/SingleProcessor;->d:Lcom/jumio/core/network/ApiCall;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v1, p0, Lcom/jumio/core/api/SingleProcessor;->c:Lcom/jumio/core/api/BackendManager;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/jumio/core/network/ApiCall;->getApiCallDataModel()Lcom/jumio/core/models/ApiCallDataModel;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    .line 13
    invoke-interface {v1, v0, p1}, Ljumio/core/g;->onResult(Lcom/jumio/core/models/ApiCallDataModel;Ljava/lang/Object;)V

    .line 14
    :cond_0
    const/4 p1, 0x0

    .line 15
    .line 16
    iput-object p1, p0, Lcom/jumio/core/api/SingleProcessor;->e:Ljava/util/concurrent/Future;

    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method
