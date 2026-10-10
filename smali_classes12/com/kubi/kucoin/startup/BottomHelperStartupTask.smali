.class public final Lcom/kubi/kucoin/startup/BottomHelperStartupTask;
.super Ljava/lang/Object;
.source "BottomHelperStartupTask.kt"

# interfaces
.implements Lcom/kubi/sdk/startup/IStartupTask;


# annotations
.annotation build Lcom/kubi/sdk/startup/StartupOption;
    name = "bottom_helper"
    priority = 0xc9
    stepType = .enum Lcom/kubi/sdk/startup/StartupStepType;->Application:Lcom/kubi/sdk/startup/StartupStepType;
    threadType = .enum Lcom/kubi/sdk/startup/StartupThreadType;->Main:Lcom/kubi/sdk/startup/StartupThreadType;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/kubi/kucoin/startup/BottomHelperStartupTask;",
        "Lcom/kubi/sdk/startup/IStartupTask;",
        "<init>",
        "()V",
        "run",
        "",
        "application",
        "Landroid/app/Application;",
        "LAppFacade_googleRelease"
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
        "SMAP\nBottomHelperStartupTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomHelperStartupTask.kt\ncom/kubi/kucoin/startup/BottomHelperStartupTask\n+ 2 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 3 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,38:1\n35#2,4:39\n39#2:45\n44#3,2:43\n*S KotlinDebug\n*F\n+ 1 BottomHelperStartupTask.kt\ncom/kubi/kucoin/startup/BottomHelperStartupTask\n*L\n22#1:39,4\n22#1:45\n22#1:43,2\n*E\n"
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

.method public static synthetic a()Ljava/lang/Boolean;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/kucoin/startup/BottomHelperStartupTask;->run$lambda$0()Ljava/lang/Boolean;

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

.method private static final run$lambda$0()Ljava/lang/Boolean;
    .locals 8

    .line 1
    .line 2
    const-string v0, "android_startup_bottom_lottie_async"

    .line 3
    .line 4
    :try_start_0
    sget-object v1, Lcom/kubi/config/RemoteConfig;->a:Lcom/kubi/config/RemoteConfig;

    .line 5
    .line 6
    new-instance v1, Lcom/kubi/kucoin/startup/BottomHelperStartupTask$a;

    .line 7
    .line 8
    .line 9
    invoke-direct {v1}, Lcom/kubi/kucoin/startup/BottomHelperStartupTask$a;-><init>()V

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
    return-object v0
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


# virtual methods
.method public run(Landroid/app/Application;)V
    .locals 5
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
    sget-object v0, Lcom/kubi/kucoin/startup/b;->a:Lcom/kubi/kucoin/startup/b;

    .line 8
    .line 9
    new-instance v1, Lcom/kubi/kucoin/startup/a;

    .line 10
    .line 11
    .line 12
    invoke-direct {v1}, Lcom/kubi/kucoin/startup/a;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Lcom/kubi/kucoin/startup/b;->b(Lkotlin/jvm/functions/Function0;)Lcom/kubi/kucoin/utils/BottomLottieMode;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    sget-object v2, Lcom/kubi/kucoin/utils/BottomLottieMode;->ASYNC:Lcom/kubi/kucoin/utils/BottomLottieMode;

    .line 19
    .line 20
    if-ne v1, v2, :cond_0

    .line 21
    const/4 v2, 0x1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v2, 0x0

    .line 24
    .line 25
    :goto_0
    sget-object v3, Lcom/kubi/kucoin/utils/BottomMenuHelper;->a:Lcom/kubi/kucoin/utils/BottomMenuHelper;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v3, v1}, Lcom/kubi/kucoin/utils/BottomMenuHelper;->l(Lcom/kubi/kucoin/utils/BottomLottieMode;)V

    .line 29
    .line 30
    sget-object v1, Lcr/b;->a:Lcr/b;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Lcr/b;->g()Lcom/kubi/monitor/utils/DeviceLevel;

    .line 34
    move-result-object v1

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1}, Lcom/kubi/monitor/utils/DeviceLevel;->getValue()I

    .line 38
    move-result v1

    .line 39
    .line 40
    sget-object v4, Lcom/kubi/monitor/utils/DeviceLevel;->MIDDLE:Lcom/kubi/monitor/utils/DeviceLevel;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v4}, Lcom/kubi/monitor/utils/DeviceLevel;->getValue()I

    .line 44
    move-result v4

    .line 45
    .line 46
    if-le v1, v4, :cond_2

    .line 47
    .line 48
    if-eqz v2, :cond_1

    .line 49
    .line 50
    sget-object v1, Lcom/kubi/kucoin/utils/r;->a:Lcom/kubi/kucoin/utils/r;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1}, Lcom/kubi/kucoin/utils/r;->l()Z

    .line 54
    move-result v1

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, v1}, Lcom/kubi/kucoin/startup/b;->a(Z)Ljava/lang/String;

    .line 58
    move-result-object v0

    .line 59
    .line 60
    .line 61
    invoke-virtual {v3, p1, v0}, Lcom/kubi/kucoin/utils/BottomMenuHelper;->n(Landroid/content/Context;Ljava/lang/String;)V

    .line 62
    return-void

    .line 63
    .line 64
    .line 65
    :cond_1
    invoke-virtual {v3, p1}, Lcom/kubi/kucoin/utils/BottomMenuHelper;->k(Landroid/content/Context;)V

    .line 66
    :cond_2
    return-void
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
