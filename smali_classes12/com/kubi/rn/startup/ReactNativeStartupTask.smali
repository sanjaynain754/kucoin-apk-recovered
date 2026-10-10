.class public final Lcom/kubi/rn/startup/ReactNativeStartupTask;
.super Ljava/lang/Object;
.source "ReactNativeStartupTask.kt"

# interfaces
.implements Lcom/kubi/sdk/startup/IStartupTask;


# annotations
.annotation build Lcom/kubi/sdk/startup/StartupOption;
    name = "react_native"
    stepType = .enum Lcom/kubi/sdk/startup/StartupStepType;->FirstPage:Lcom/kubi/sdk/startup/StartupStepType;
    threadType = .enum Lcom/kubi/sdk/startup/StartupThreadType;->Async:Lcom/kubi/sdk/startup/StartupThreadType;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\rH\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/kubi/rn/startup/ReactNativeStartupTask;",
        "Lcom/kubi/sdk/startup/IStartupTask;",
        "<init>",
        "()V",
        "downloadPriorityEnabled",
        "",
        "getDownloadPriorityEnabled",
        "()Z",
        "downloadPriorityEnabled$delegate",
        "Lkotlin/Lazy;",
        "run",
        "",
        "application",
        "Landroid/app/Application;",
        "BReactNativeLib_googleRelease"
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
        "SMAP\nReactNativeStartupTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactNativeStartupTask.kt\ncom/kubi/rn/startup/ReactNativeStartupTask\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n+ 4 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 5 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,166:1\n2746#2,3:167\n47#3,4:170\n35#4,4:174\n39#4:180\n35#4,4:181\n39#4:187\n44#5,2:178\n44#5,2:185\n*S KotlinDebug\n*F\n+ 1 ReactNativeStartupTask.kt\ncom/kubi/rn/startup/ReactNativeStartupTask\n*L\n75#1:167,3\n122#1:170,4\n50#1:174,4\n50#1:180\n109#1:181,4\n109#1:187\n50#1:178,2\n109#1:185,2\n*E\n"
    }
.end annotation


# instance fields
.field private final downloadPriorityEnabled$delegate:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/kubi/rn/startup/e;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Lcom/kubi/rn/startup/e;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    iput-object v0, p0, Lcom/kubi/rn/startup/ReactNativeStartupTask;->downloadPriorityEnabled$delegate:Lkotlin/Lazy;

    .line 15
    return-void
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

.method public static synthetic a()Lcom/kubi/sdk/pkg/bundle/i18n/b;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/rn/startup/ReactNativeStartupTask;->run$lambda$4()Lcom/kubi/sdk/pkg/bundle/i18n/b;

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

.method public static synthetic b()Z
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/rn/startup/ReactNativeStartupTask;->downloadPriorityEnabled_delegate$lambda$0()Z

    .line 4
    move-result v0

    .line 5
    return v0
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

.method public static synthetic c(Z)Z
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/rn/startup/ReactNativeStartupTask;->run$lambda$3(Z)Z

    .line 4
    move-result p0

    .line 5
    return p0
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

.method public static synthetic d()Ljava/util/Map;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/rn/startup/ReactNativeStartupTask;->run$lambda$2()Ljava/util/Map;

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

.method private static final downloadPriorityEnabled_delegate$lambda$0()Z
    .locals 8

    .line 1
    .line 2
    const-string v0, "kc_download_priority_switch"

    .line 3
    .line 4
    :try_start_0
    sget-object v1, Lcom/kubi/config/RemoteConfig;->a:Lcom/kubi/config/RemoteConfig;

    .line 5
    .line 6
    new-instance v1, Lcom/kubi/rn/startup/ReactNativeStartupTask$downloadPriorityEnabled_delegate$lambda$0$$inlined$getConfig$1;

    .line 7
    .line 8
    .line 9
    invoke-direct {v1}, Lcom/kubi/rn/startup/ReactNativeStartupTask$downloadPriorityEnabled_delegate$lambda$0$$inlined$getConfig$1;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    const-string v2, "object : TypeToken<T>() {}.type"

    .line 16
    .line 17
    .line 18
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-static {v0, v1}, Lcom/kubi/config/RemoteConfig;->a(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 22
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception v0

    .line 25
    move-object v2, v0

    .line 26
    .line 27
    new-instance v1, Lcom/kubi/config/exception/KCConfigException;

    .line 28
    .line 29
    const/16 v6, 0x8

    .line 30
    const/4 v7, 0x0

    .line 31
    .line 32
    const-string v3, "RemoteConfig"

    .line 33
    const/4 v4, 0x0

    .line 34
    const/4 v5, 0x0

    .line 35
    .line 36
    .line 37
    invoke-direct/range {v1 .. v7}, Lcom/kubi/config/exception/KCConfigException;-><init>(Ljava/lang/Throwable;Ljava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 38
    const/4 v0, 0x2

    .line 39
    const/4 v2, 0x0

    .line 40
    .line 41
    .line 42
    invoke-static {v1, v2, v0, v2}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 43
    move-object v0, v2

    .line 44
    .line 45
    :goto_0
    check-cast v0, Ljava/lang/Boolean;

    .line 46
    const/4 v1, 0x1

    .line 47
    .line 48
    .line 49
    invoke-static {v0, v1}, Lcom/kubi/utils/extensions/c;->e(Ljava/lang/Boolean;Z)Z

    .line 50
    move-result v0

    .line 51
    return v0
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

.method private final getDownloadPriorityEnabled()Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/rn/startup/ReactNativeStartupTask;->downloadPriorityEnabled$delegate:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Ljava/lang/Boolean;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 12
    move-result v0

    .line 13
    return v0
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

.method private static final run$lambda$2()Ljava/util/Map;
    .locals 6

    .line 1
    .line 2
    const-string v0, "X-DEVICE-NO"

    .line 3
    .line 4
    .line 5
    invoke-static {}, Lcom/blankj/utilcode/util/j;->f()Ljava/lang/String;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    sget-object v1, Lvk/s;->a:Lvk/s;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1}, Lvk/s;->Z()Ljava/lang/String;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    const-string v2, "X-APP-VERSION"

    .line 19
    .line 20
    .line 21
    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 22
    move-result-object v1

    .line 23
    .line 24
    sget-object v2, Lcom/kubi/user/config/UserInfo;->a:Lcom/kubi/user/config/UserInfo;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2}, Lcom/kubi/user/config/UserInfo;->i()Ljava/lang/String;

    .line 28
    move-result-object v3

    .line 29
    .line 30
    const-string v4, "X-USER-ID"

    .line 31
    .line 32
    .line 33
    invoke-static {v4, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 34
    move-result-object v3

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2}, Lcom/kubi/user/config/UserInfo;->l()Ljava/lang/String;

    .line 38
    move-result-object v2

    .line 39
    .line 40
    .line 41
    invoke-static {v2}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 42
    move-result-object v2

    .line 43
    .line 44
    const-string v4, "X-APP-TOKEN"

    .line 45
    .line 46
    .line 47
    invoke-static {v4, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 48
    move-result-object v2

    .line 49
    .line 50
    sget-object v4, Lcom/kubi/sdk/site/SiteType;->Companion:Lcom/kubi/sdk/site/SiteType$Companion;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v4}, Lcom/kubi/sdk/site/SiteType$Companion;->getCurrentSiteType()Ljava/lang/String;

    .line 54
    move-result-object v4

    .line 55
    .line 56
    const-string v5, "X-SITE"

    .line 57
    .line 58
    .line 59
    invoke-static {v5, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 60
    move-result-object v4

    .line 61
    .line 62
    .line 63
    filled-new-array {v0, v1, v3, v2, v4}, [Lkotlin/Pair;

    .line 64
    move-result-object v0

    .line 65
    .line 66
    .line 67
    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    .line 68
    move-result-object v0

    .line 69
    return-object v0
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

.method private static final run$lambda$3(Z)Z
    .locals 7

    .line 1
    .line 2
    if-eqz p0, :cond_0

    .line 3
    .line 4
    const-string p0, "app_krn_lang_prefetch"

    .line 5
    .line 6
    :try_start_0
    sget-object v0, Lcom/kubi/config/RemoteConfig;->a:Lcom/kubi/config/RemoteConfig;

    .line 7
    .line 8
    new-instance v0, Lcom/kubi/rn/startup/ReactNativeStartupTask$run$lambda$3$$inlined$getConfig$1;

    .line 9
    .line 10
    .line 11
    invoke-direct {v0}, Lcom/kubi/rn/startup/ReactNativeStartupTask$run$lambda$3$$inlined$getConfig$1;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    const-string v1, "object : TypeToken<T>() {}.type"

    .line 18
    .line 19
    .line 20
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-static {p0, v0}, Lcom/kubi/config/RemoteConfig;->a(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 24
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception v0

    .line 27
    move-object p0, v0

    .line 28
    move-object v1, p0

    .line 29
    .line 30
    new-instance v0, Lcom/kubi/config/exception/KCConfigException;

    .line 31
    .line 32
    const/16 v5, 0x8

    .line 33
    const/4 v6, 0x0

    .line 34
    .line 35
    const-string v2, "RemoteConfig"

    .line 36
    const/4 v3, 0x0

    .line 37
    const/4 v4, 0x0

    .line 38
    .line 39
    .line 40
    invoke-direct/range {v0 .. v6}, Lcom/kubi/config/exception/KCConfigException;-><init>(Ljava/lang/Throwable;Ljava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 41
    const/4 p0, 0x2

    .line 42
    const/4 v1, 0x0

    .line 43
    .line 44
    .line 45
    invoke-static {v0, v1, p0, v1}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 46
    move-object p0, v1

    .line 47
    .line 48
    :goto_0
    check-cast p0, Ljava/lang/Boolean;

    .line 49
    const/4 v0, 0x1

    .line 50
    .line 51
    .line 52
    invoke-static {p0, v0}, Lcom/kubi/utils/extensions/c;->e(Ljava/lang/Boolean;Z)Z

    .line 53
    move-result p0

    .line 54
    .line 55
    if-eqz p0, :cond_0

    .line 56
    goto :goto_1

    .line 57
    :cond_0
    const/4 v0, 0x0

    .line 58
    :goto_1
    return v0
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

.method private static final run$lambda$4()Lcom/kubi/sdk/pkg/bundle/i18n/b;
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/sdk/pkg/bundle/i18n/b;

    .line 3
    .line 4
    sget-object v1, Lcom/kubi/sdk/site/SiteType;->Companion:Lcom/kubi/sdk/site/SiteType$Companion;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v1}, Lcom/kubi/sdk/site/SiteType$Companion;->getCurrentSiteType()Ljava/lang/String;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    sget-object v2, Lcom/kubi/sdk/function/language/a;->g:Lcom/kubi/sdk/function/language/LanguageType;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v2}, Lcom/kubi/sdk/function/language/LanguageType;->getLocalString()Ljava/lang/String;

    .line 14
    move-result-object v2

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, v1, v2}, Lcom/kubi/sdk/pkg/bundle/i18n/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 18
    return-object v0
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
    .line 7
    const-string v0, "krn_init_time"

    .line 8
    const/4 v1, 0x1

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1}, Lqq/l;->a(Ljava/lang/String;Z)Lqq/l$a;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    sget-object v1, Lcom/kubi/rn/utils/RNConfigHelper;->INSTANCE:Lcom/kubi/rn/utils/RNConfigHelper;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, p1}, Lcom/kubi/rn/utils/RNConfigHelper;->initConfig(Landroid/content/Context;)V

    .line 18
    .line 19
    sget-object v1, Lcom/facebook/react/modules/i18nmanager/I18nUtil;->Companion:Lcom/facebook/react/modules/i18nmanager/I18nUtil$Companion;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, Lcom/facebook/react/modules/i18nmanager/I18nUtil$Companion;->DEPRECATED$getInstance()Lcom/facebook/react/modules/i18nmanager/I18nUtil;

    .line 23
    move-result-object v1

    .line 24
    const/4 v2, 0x0

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, p1, v2}, Lcom/facebook/react/modules/i18nmanager/I18nUtil;->allowRTL(Landroid/content/Context;Z)V

    .line 28
    .line 29
    sget-object v1, Lcom/kubi/rn/core/ReactNativeEngine;->INSTANCE:Lcom/kubi/rn/core/ReactNativeEngine;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Lcom/kubi/rn/core/ReactNativeEngine;->getEnableBundleManagerServer()Z

    .line 33
    move-result v1

    .line 34
    .line 35
    sget-object v3, Lzz/a;->a:Lzz/a;

    .line 36
    .line 37
    .line 38
    invoke-direct {p0}, Lcom/kubi/rn/startup/ReactNativeStartupTask;->getDownloadPriorityEnabled()Z

    .line 39
    move-result v4

    .line 40
    .line 41
    .line 42
    invoke-virtual {v3, v4}, Lzz/a;->d(Z)V

    .line 43
    .line 44
    if-eqz v1, :cond_3

    .line 45
    .line 46
    sget-object v2, Lcom/kubi/sdk/pkg/task/PackageDownloadSetting;->a:Lcom/kubi/sdk/pkg/task/PackageDownloadSetting;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v2}, Lcom/kubi/sdk/pkg/task/PackageDownloadSetting;->a()Ljava/util/ArrayList;

    .line 50
    move-result-object v2

    .line 51
    .line 52
    if-eqz v2, :cond_0

    .line 53
    .line 54
    .line 55
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 56
    move-result v3

    .line 57
    .line 58
    if-eqz v3, :cond_0

    .line 59
    goto :goto_0

    .line 60
    .line 61
    .line 62
    :cond_0
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 63
    move-result-object v2

    .line 64
    .line 65
    .line 66
    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 67
    move-result v3

    .line 68
    .line 69
    if-eqz v3, :cond_2

    .line 70
    .line 71
    .line 72
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 73
    move-result-object v3

    .line 74
    .line 75
    check-cast v3, Lokhttp3/Interceptor;

    .line 76
    .line 77
    instance-of v3, v3, Lcom/kubi/rn/startup/CalcBundleHostInterceptor;

    .line 78
    .line 79
    if-eqz v3, :cond_1

    .line 80
    goto :goto_1

    .line 81
    .line 82
    :cond_2
    :goto_0
    sget-object v2, Lcom/kubi/sdk/pkg/task/PackageDownloadSetting;->a:Lcom/kubi/sdk/pkg/task/PackageDownloadSetting;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2}, Lcom/kubi/sdk/pkg/task/PackageDownloadSetting;->a()Ljava/util/ArrayList;

    .line 86
    move-result-object v2

    .line 87
    .line 88
    new-instance v3, Lcom/kubi/rn/startup/CalcBundleHostInterceptor;

    .line 89
    .line 90
    .line 91
    invoke-direct {v3}, Lcom/kubi/rn/startup/CalcBundleHostInterceptor;-><init>()V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 95
    .line 96
    :goto_1
    sget-object v2, Lzz/a;->a:Lzz/a;

    .line 97
    .line 98
    sget-object v3, Lcom/kubi/host/HostManager;->a:Lcom/kubi/host/HostManager;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v3}, Lcom/kubi/host/HostManager;->f()Ljava/lang/String;

    .line 102
    move-result-object v3

    .line 103
    .line 104
    new-instance v4, Lcom/kubi/rn/startup/f;

    .line 105
    .line 106
    .line 107
    invoke-direct {v4}, Lcom/kubi/rn/startup/f;-><init>()V

    .line 108
    .line 109
    const-string v5, "Kucoin"

    .line 110
    .line 111
    .line 112
    invoke-virtual {v2, v3, v5, v4}, Lzz/a;->b(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 113
    goto :goto_2

    .line 114
    .line 115
    .line 116
    :cond_3
    invoke-virtual {v3, v2}, Lzz/a;->e(Z)V

    .line 117
    .line 118
    const-string v2, "ReactNativeStartupTask"

    .line 119
    .line 120
    const-string v3, "enableBundleManagerServer=false\uff0c\u5305\u7ba1\u7406\u5e73\u53f0\u5df2\u7981\u7528"

    .line 121
    .line 122
    .line 123
    invoke-static {v2, v3}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 124
    .line 125
    :goto_2
    sget-object v2, Lzz/a;->a:Lzz/a;

    .line 126
    .line 127
    new-instance v3, Lcom/kubi/rn/startup/g;

    .line 128
    .line 129
    .line 130
    invoke-direct {v3, v1}, Lcom/kubi/rn/startup/g;-><init>(Z)V

    .line 131
    .line 132
    new-instance v4, Lcom/kubi/rn/startup/h;

    .line 133
    .line 134
    .line 135
    invoke-direct {v4}, Lcom/kubi/rn/startup/h;-><init>()V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v2, p1, v3, v4}, Lzz/a;->c(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V

    .line 139
    .line 140
    new-instance v2, Lkotlinx/coroutines/l0;

    .line 141
    .line 142
    const-string v3, "react_native_init"

    .line 143
    .line 144
    .line 145
    invoke-direct {v2, v3}, Lkotlinx/coroutines/l0;-><init>(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    invoke-static {}, Lo00/a;->b()Lkotlinx/coroutines/j0;

    .line 149
    move-result-object v3

    .line 150
    .line 151
    .line 152
    invoke-virtual {v2, v3}, Lkotlin/coroutines/AbstractCoroutineContextElement;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    .line 153
    move-result-object v2

    .line 154
    .line 155
    sget-object v3, Lkotlinx/coroutines/CoroutineExceptionHandler;->M0:Lkotlinx/coroutines/CoroutineExceptionHandler$a;

    .line 156
    .line 157
    new-instance v4, Lcom/kubi/rn/startup/ReactNativeStartupTask$run$$inlined$CoroutineExceptionHandler$1;

    .line 158
    .line 159
    .line 160
    invoke-direct {v4, v3}, Lcom/kubi/rn/startup/ReactNativeStartupTask$run$$inlined$CoroutineExceptionHandler$1;-><init>(Lkotlinx/coroutines/CoroutineExceptionHandler$a;)V

    .line 161
    .line 162
    .line 163
    invoke-interface {v2, v4}, Lkotlin/coroutines/CoroutineContext;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    .line 164
    move-result-object v2

    .line 165
    .line 166
    .line 167
    invoke-static {v2}, Lkotlinx/coroutines/n0;->a(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/m0;

    .line 168
    move-result-object v3

    .line 169
    .line 170
    new-instance v6, Lcom/kubi/rn/startup/ReactNativeStartupTask$run$5;

    .line 171
    const/4 v2, 0x0

    .line 172
    .line 173
    .line 174
    invoke-direct {v6, p1, v1, v0, v2}, Lcom/kubi/rn/startup/ReactNativeStartupTask$run$5;-><init>(Landroid/app/Application;ZLqq/l$a;Lkotlin/coroutines/Continuation;)V

    .line 175
    const/4 v7, 0x3

    .line 176
    const/4 v8, 0x0

    .line 177
    const/4 v4, 0x0

    .line 178
    const/4 v5, 0x0

    .line 179
    .line 180
    .line 181
    invoke-static/range {v3 .. v8}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 182
    .line 183
    sget-object v0, Lcom/kubi/sdk/function/language/a;->a:Lcom/kubi/sdk/function/language/a;

    .line 184
    .line 185
    new-instance v1, Lcom/kubi/rn/startup/ReactNativeStartupTask$run$6;

    .line 186
    .line 187
    .line 188
    invoke-direct {v1, p1}, Lcom/kubi/rn/startup/ReactNativeStartupTask$run$6;-><init>(Landroid/app/Application;)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v0, v1}, Lcom/kubi/sdk/function/language/a;->addOnLanguageChangeListener(Lcom/kubi/sdk/function/language/a$a;)V

    .line 192
    .line 193
    sget-object p1, Lcom/kubi/rn/config/RnWhitePageCheckConfig;->INSTANCE:Lcom/kubi/rn/config/RnWhitePageCheckConfig;

    .line 194
    .line 195
    .line 196
    invoke-virtual {p1}, Lcom/kubi/rn/config/RnWhitePageCheckConfig;->load$BReactNativeLib_googleRelease()V

    .line 197
    return-void
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
.end method
