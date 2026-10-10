.class public final Lcom/kubi/home/realtime/RealtimeStartupTask;
.super Ljava/lang/Object;
.source "RealtimeStartupTask.kt"

# interfaces
.implements Lcom/kubi/sdk/startup/IStartupTask;


# annotations
.annotation build Lcom/kubi/sdk/startup/StartupOption;
    name = "realtime"
    priority = 0x12c
    stepType = .enum Lcom/kubi/sdk/startup/StartupStepType;->MainPage:Lcom/kubi/sdk/startup/StartupStepType;
    threadType = .enum Lcom/kubi/sdk/startup/StartupThreadType;->Async:Lcom/kubi/sdk/startup/StartupThreadType;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000=\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0008\u0004*\u0001\u0016\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0008\u0010\u0018\u001a\u00020\u0012H\u0002R\u0014\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000b\u0010\u000cR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0017\u00a8\u0006\u0019"
    }
    d2 = {
        "Lcom/kubi/home/realtime/RealtimeStartupTask;",
        "Lcom/kubi/sdk/startup/IStartupTask;",
        "<init>",
        "()V",
        "currentList",
        "",
        "Lcom/kubi/home/realtime/model/SymbolInfo;",
        "newCoinAdapter",
        "Lcom/kubi/home/realtime/spot/NewCoinAdapter;",
        "realTimeService",
        "Lcom/kubi/home/realtime/IRealTimeWidgetService;",
        "getRealTimeService",
        "()Lcom/kubi/home/realtime/IRealTimeWidgetService;",
        "realTimeService$delegate",
        "Lkotlin/Lazy;",
        "serviceScope",
        "Lkotlinx/coroutines/CoroutineScope;",
        "run",
        "",
        "application",
        "Landroid/app/Application;",
        "newCoinLifecycleListener",
        "com/kubi/home/realtime/RealtimeStartupTask$newCoinLifecycleListener$1",
        "Lcom/kubi/home/realtime/RealtimeStartupTask$newCoinLifecycleListener$1;",
        "getNewListings",
        "HomeLib_googleRelease"
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
        "SMAP\nRealtimeStartupTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealtimeStartupTask.kt\ncom/kubi/home/realtime/RealtimeStartupTask\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,145:1\n47#2,4:146\n*S KotlinDebug\n*F\n+ 1 RealtimeStartupTask.kt\ncom/kubi/home/realtime/RealtimeStartupTask\n*L\n35#1:146,4\n*E\n"
    }
.end annotation


# instance fields
.field private final currentList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/kubi/home/realtime/model/SymbolInfo;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final newCoinAdapter:Lcom/kubi/home/realtime/spot/b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final newCoinLifecycleListener:Lcom/kubi/home/realtime/RealtimeStartupTask$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final realTimeService$delegate:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final serviceScope:Lkotlinx/coroutines/m0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/kubi/home/realtime/RealtimeStartupTask;->currentList:Ljava/util/List;

    .line 11
    .line 12
    new-instance v0, Lcom/kubi/home/realtime/spot/b;

    .line 13
    .line 14
    .line 15
    invoke-direct {v0}, Lcom/kubi/home/realtime/spot/b;-><init>()V

    .line 16
    .line 17
    iput-object v0, p0, Lcom/kubi/home/realtime/RealtimeStartupTask;->newCoinAdapter:Lcom/kubi/home/realtime/spot/b;

    .line 18
    .line 19
    new-instance v0, Lcom/kubi/home/realtime/d;

    .line 20
    .line 21
    .line 22
    invoke-direct {v0}, Lcom/kubi/home/realtime/d;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 26
    move-result-object v0

    .line 27
    .line 28
    iput-object v0, p0, Lcom/kubi/home/realtime/RealtimeStartupTask;->realTimeService$delegate:Lkotlin/Lazy;

    .line 29
    const/4 v0, 0x0

    .line 30
    const/4 v1, 0x1

    .line 31
    .line 32
    .line 33
    invoke-static {v0, v1, v0}, Lkotlinx/coroutines/q2;->b(Lkotlinx/coroutines/x1;ILjava/lang/Object;)Lkotlinx/coroutines/z;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    .line 37
    invoke-static {}, Lo00/a;->b()Lkotlinx/coroutines/j0;

    .line 38
    move-result-object v1

    .line 39
    .line 40
    .line 41
    invoke-interface {v0, v1}, Lkotlin/coroutines/CoroutineContext;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    .line 42
    move-result-object v0

    .line 43
    .line 44
    sget-object v1, Lkotlinx/coroutines/CoroutineExceptionHandler;->M0:Lkotlinx/coroutines/CoroutineExceptionHandler$a;

    .line 45
    .line 46
    new-instance v2, Lcom/kubi/home/realtime/RealtimeStartupTask$b;

    .line 47
    .line 48
    .line 49
    invoke-direct {v2, v1}, Lcom/kubi/home/realtime/RealtimeStartupTask$b;-><init>(Lkotlinx/coroutines/CoroutineExceptionHandler$a;)V

    .line 50
    .line 51
    .line 52
    invoke-interface {v0, v2}, Lkotlin/coroutines/CoroutineContext;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    .line 53
    move-result-object v0

    .line 54
    .line 55
    .line 56
    invoke-static {v0}, Lkotlinx/coroutines/n0;->a(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/m0;

    .line 57
    move-result-object v0

    .line 58
    .line 59
    iput-object v0, p0, Lcom/kubi/home/realtime/RealtimeStartupTask;->serviceScope:Lkotlinx/coroutines/m0;

    .line 60
    .line 61
    new-instance v0, Lcom/kubi/home/realtime/RealtimeStartupTask$a;

    .line 62
    .line 63
    .line 64
    invoke-direct {v0, p0}, Lcom/kubi/home/realtime/RealtimeStartupTask$a;-><init>(Lcom/kubi/home/realtime/RealtimeStartupTask;)V

    .line 65
    .line 66
    iput-object v0, p0, Lcom/kubi/home/realtime/RealtimeStartupTask;->newCoinLifecycleListener:Lcom/kubi/home/realtime/RealtimeStartupTask$a;

    .line 67
    return-void
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
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
.end method

.method public static synthetic a()Lcom/kubi/home/realtime/IRealTimeWidgetService;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/home/realtime/RealtimeStartupTask;->realTimeService_delegate$lambda$0()Lcom/kubi/home/realtime/IRealTimeWidgetService;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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
.end method

.method public static final synthetic access$getCurrentList$p(Lcom/kubi/home/realtime/RealtimeStartupTask;)Ljava/util/List;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/home/realtime/RealtimeStartupTask;->currentList:Ljava/util/List;

    .line 3
    return-object p0
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

.method public static final synthetic access$getNewCoinAdapter$p(Lcom/kubi/home/realtime/RealtimeStartupTask;)Lcom/kubi/home/realtime/spot/b;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/home/realtime/RealtimeStartupTask;->newCoinAdapter:Lcom/kubi/home/realtime/spot/b;

    .line 3
    return-object p0
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

.method public static final synthetic access$getNewListings(Lcom/kubi/home/realtime/RealtimeStartupTask;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/home/realtime/RealtimeStartupTask;->getNewListings()V

    .line 4
    return-void
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

.method public static final synthetic access$getRealTimeService(Lcom/kubi/home/realtime/RealtimeStartupTask;)Lcom/kubi/home/realtime/IRealTimeWidgetService;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/home/realtime/RealtimeStartupTask;->getRealTimeService()Lcom/kubi/home/realtime/IRealTimeWidgetService;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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

.method public static final synthetic access$getServiceScope$p(Lcom/kubi/home/realtime/RealtimeStartupTask;)Lkotlinx/coroutines/m0;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/home/realtime/RealtimeStartupTask;->serviceScope:Lkotlinx/coroutines/m0;

    .line 3
    return-object p0
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

.method private final getNewListings()V
    .locals 7

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/user/config/UserInfo;->a:Lcom/kubi/user/config/UserInfo;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/user/config/UserInfo;->n()Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    return-void

    .line 10
    .line 11
    :cond_0
    iget-object v1, p0, Lcom/kubi/home/realtime/RealtimeStartupTask;->serviceScope:Lkotlinx/coroutines/m0;

    .line 12
    .line 13
    new-instance v4, Lcom/kubi/home/realtime/RealtimeStartupTask$getNewListings$1;

    .line 14
    const/4 v0, 0x0

    .line 15
    .line 16
    .line 17
    invoke-direct {v4, p0, v0}, Lcom/kubi/home/realtime/RealtimeStartupTask$getNewListings$1;-><init>(Lcom/kubi/home/realtime/RealtimeStartupTask;Lkotlin/coroutines/Continuation;)V

    .line 18
    const/4 v5, 0x3

    .line 19
    const/4 v6, 0x0

    .line 20
    const/4 v2, 0x0

    .line 21
    const/4 v3, 0x0

    .line 22
    .line 23
    .line 24
    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 25
    return-void
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method private final getRealTimeService()Lcom/kubi/home/realtime/IRealTimeWidgetService;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/home/realtime/RealtimeStartupTask;->realTimeService$delegate:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/kubi/home/realtime/IRealTimeWidgetService;

    .line 9
    return-object v0
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
.end method

.method private static final realTimeService_delegate$lambda$0()Lcom/kubi/home/realtime/IRealTimeWidgetService;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/home/realtime/IRealTimeWidgetService;->a:Lcom/kubi/home/realtime/IRealTimeWidgetService$Companion;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/home/realtime/IRealTimeWidgetService$Companion;->get()Lcom/kubi/home/realtime/IRealTimeWidgetService;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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
.end method


# virtual methods
.method public run(Landroid/app/Application;)V
    .locals 1
    .param p1    # Landroid/app/Application;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "application"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object p1, Lss/b;->a:Lss/b;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Lss/b;->c()Z

    .line 11
    move-result p1

    .line 12
    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Lcom/kubi/home/realtime/RealtimeStartupTask;->getRealTimeService()Lcom/kubi/home/realtime/IRealTimeWidgetService;

    .line 17
    move-result-object p1

    .line 18
    .line 19
    iget-object v0, p0, Lcom/kubi/home/realtime/RealtimeStartupTask;->newCoinAdapter:Lcom/kubi/home/realtime/spot/b;

    .line 20
    .line 21
    .line 22
    invoke-interface {p1, v0}, Lcom/kubi/home/realtime/IRealTimeWidgetService;->a(Lcom/kubi/home/realtime/a;)V

    .line 23
    .line 24
    .line 25
    invoke-direct {p0}, Lcom/kubi/home/realtime/RealtimeStartupTask;->getRealTimeService()Lcom/kubi/home/realtime/IRealTimeWidgetService;

    .line 26
    move-result-object p1

    .line 27
    .line 28
    iget-object v0, p0, Lcom/kubi/home/realtime/RealtimeStartupTask;->newCoinLifecycleListener:Lcom/kubi/home/realtime/RealtimeStartupTask$a;

    .line 29
    .line 30
    .line 31
    invoke-interface {p1, v0}, Lcom/kubi/home/realtime/IRealTimeWidgetService;->b(Lcom/kubi/home/realtime/f;)V

    .line 32
    :cond_0
    return-void
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
