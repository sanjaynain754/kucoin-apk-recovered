.class public final Lcom/kubi/kweb/startup/KWebConfigUpdateStartupTask;
.super Ljava/lang/Object;
.source "KWebConfigUpdateStartupTask.kt"

# interfaces
.implements Lcom/kubi/sdk/startup/IStartupTask;


# annotations
.annotation build Lcom/kubi/sdk/startup/StartupOption;
    name = "kweb_config_update"
    priority = 0xc8
    stepType = .enum Lcom/kubi/sdk/startup/StartupStepType;->FirstPage:Lcom/kubi/sdk/startup/StartupStepType;
    threadType = .enum Lcom/kubi/sdk/startup/StartupThreadType;->Async:Lcom/kubi/sdk/startup/StartupThreadType;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/kubi/kweb/startup/KWebConfigUpdateStartupTask;",
        "Lcom/kubi/sdk/startup/IStartupTask;",
        "<init>",
        "()V",
        "run",
        "",
        "application",
        "Landroid/app/Application;",
        "KWebLib_googleRelease"
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
        "SMAP\nKWebConfigUpdateStartupTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KWebConfigUpdateStartupTask.kt\ncom/kubi/kweb/startup/KWebConfigUpdateStartupTask\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 KWebIssue.kt\ncom/kubi/kweb/exception/KWebIssueKt\n+ 5 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,58:1\n1617#2,9:59\n1869#2:68\n1870#2:70\n1626#2:71\n1669#2,8:72\n1#3:69\n44#4,2:80\n47#5,4:82\n*S KotlinDebug\n*F\n+ 1 KWebConfigUpdateStartupTask.kt\ncom/kubi/kweb/startup/KWebConfigUpdateStartupTask\n*L\n35#1:59,9\n35#1:68\n35#1:70\n35#1:71\n36#1:72,8\n35#1:69\n40#1:80,2\n45#1:82,4\n*E\n"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method


# virtual methods
.method public run(Landroid/app/Application;)V
    .locals 9
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
    const/4 v1, 0x0

    .line 7
    .line 8
    :try_start_0
    sget-object v0, Lcom/kubi/kweb/helper/BizInfoHelper;->a:Lcom/kubi/kweb/helper/BizInfoHelper;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/kubi/kweb/helper/BizInfoHelper;->c()Ljava/util/List;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    sget-object v2, Lx00/b;->a:Lx00/b;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v2, v0}, Lx00/b;->g(Ljava/util/List;)V

    .line 18
    .line 19
    new-instance v2, Ljava/util/ArrayList;

    .line 20
    .line 21
    .line 22
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 26
    move-result-object v0

    .line 27
    .line 28
    .line 29
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    move-result v3

    .line 31
    .line 32
    if-eqz v3, :cond_1

    .line 33
    .line 34
    .line 35
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    move-result-object v3

    .line 37
    .line 38
    check-cast v3, Lx00/a;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v3}, Lx00/a;->d()Lcom/kubi/sdk/pkg/hybird/a;

    .line 42
    move-result-object v3

    .line 43
    .line 44
    if-eqz v3, :cond_0

    .line 45
    .line 46
    .line 47
    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 48
    goto :goto_0

    .line 49
    :catchall_0
    move-exception v0

    .line 50
    move-object v3, v0

    .line 51
    goto :goto_2

    .line 52
    .line 53
    :cond_1
    new-instance v0, Ljava/util/HashSet;

    .line 54
    .line 55
    .line 56
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 57
    .line 58
    new-instance v3, Ljava/util/ArrayList;

    .line 59
    .line 60
    .line 61
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 62
    .line 63
    .line 64
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 65
    move-result-object v2

    .line 66
    .line 67
    .line 68
    :cond_2
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 69
    move-result v4

    .line 70
    .line 71
    if-eqz v4, :cond_3

    .line 72
    .line 73
    .line 74
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 75
    move-result-object v4

    .line 76
    move-object v5, v4

    .line 77
    .line 78
    check-cast v5, Lcom/kubi/sdk/pkg/hybird/a;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v5}, Lcom/kubi/sdk/pkg/hybird/a;->d()Ljava/lang/String;

    .line 82
    move-result-object v5

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 86
    move-result v5

    .line 87
    .line 88
    if-eqz v5, :cond_2

    .line 89
    .line 90
    .line 91
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 92
    goto :goto_1

    .line 93
    .line 94
    .line 95
    :cond_3
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    .line 96
    move-result-object v0

    .line 97
    .line 98
    sget-object v2, Lcom/kubi/sdk/pkg/hybird/HybridPackageManager;->a:Lcom/kubi/sdk/pkg/hybird/HybridPackageManager;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v2, p1, v0}, Lcom/kubi/sdk/pkg/hybird/HybridPackageManager;->h(Landroid/content/Context;Ljava/util/List;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 102
    goto :goto_3

    .line 103
    .line 104
    :goto_2
    new-instance v2, Lcom/kubi/kweb/exception/KWebException;

    .line 105
    .line 106
    const/16 v7, 0x8

    .line 107
    const/4 v8, 0x0

    .line 108
    .line 109
    const-string v4, "kweb_config_update"

    .line 110
    const/4 v5, 0x0

    .line 111
    const/4 v6, 0x0

    .line 112
    .line 113
    .line 114
    invoke-direct/range {v2 .. v8}, Lcom/kubi/kweb/exception/KWebException;-><init>(Ljava/lang/Throwable;Ljava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 115
    const/4 v0, 0x2

    .line 116
    .line 117
    .line 118
    invoke-static {v2, v1, v0, v1}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 119
    .line 120
    :goto_3
    new-instance v0, Lkotlinx/coroutines/l0;

    .line 121
    .line 122
    const-string v2, "hybrid_update"

    .line 123
    .line 124
    .line 125
    invoke-direct {v0, v2}, Lkotlinx/coroutines/l0;-><init>(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    invoke-static {}, Lo00/a;->b()Lkotlinx/coroutines/j0;

    .line 129
    move-result-object v2

    .line 130
    .line 131
    .line 132
    invoke-virtual {v0, v2}, Lkotlin/coroutines/AbstractCoroutineContextElement;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    .line 133
    move-result-object v0

    .line 134
    .line 135
    sget-object v2, Lkotlinx/coroutines/CoroutineExceptionHandler;->M0:Lkotlinx/coroutines/CoroutineExceptionHandler$a;

    .line 136
    .line 137
    new-instance v3, Lcom/kubi/kweb/startup/KWebConfigUpdateStartupTask$a;

    .line 138
    .line 139
    .line 140
    invoke-direct {v3, v2}, Lcom/kubi/kweb/startup/KWebConfigUpdateStartupTask$a;-><init>(Lkotlinx/coroutines/CoroutineExceptionHandler$a;)V

    .line 141
    .line 142
    .line 143
    invoke-interface {v0, v3}, Lkotlin/coroutines/CoroutineContext;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    .line 144
    move-result-object v0

    .line 145
    .line 146
    .line 147
    invoke-static {v0}, Lkotlinx/coroutines/n0;->a(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/m0;

    .line 148
    move-result-object v2

    .line 149
    .line 150
    new-instance v5, Lcom/kubi/kweb/startup/KWebConfigUpdateStartupTask$run$1;

    .line 151
    .line 152
    .line 153
    invoke-direct {v5, p1, v1}, Lcom/kubi/kweb/startup/KWebConfigUpdateStartupTask$run$1;-><init>(Landroid/app/Application;Lkotlin/coroutines/Continuation;)V

    .line 154
    const/4 v6, 0x3

    .line 155
    const/4 v7, 0x0

    .line 156
    const/4 v3, 0x0

    .line 157
    const/4 v4, 0x0

    .line 158
    .line 159
    .line 160
    invoke-static/range {v2 .. v7}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 161
    return-void
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
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
.end method
