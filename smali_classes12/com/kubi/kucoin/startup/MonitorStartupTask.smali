.class public final Lcom/kubi/kucoin/startup/MonitorStartupTask;
.super Ljava/lang/Object;
.source "MonitorStartupTask.kt"

# interfaces
.implements Lcom/kubi/sdk/startup/IStartupTask;


# annotations
.annotation build Lcom/kubi/sdk/startup/StartupOption;
    name = "monitor"
    priority = 0x1
    stepType = .enum Lcom/kubi/sdk/startup/StartupStepType;->Setup:Lcom/kubi/sdk/startup/StartupStepType;
    threadType = .enum Lcom/kubi/sdk/startup/StartupThreadType;->Main:Lcom/kubi/sdk/startup/StartupThreadType;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/kucoin/startup/MonitorStartupTask$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001:\u0001\nB\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0017J\u0008\u0010\u0008\u001a\u00020\u0005H\u0002J\u0008\u0010\t\u001a\u00020\u0005H\u0002\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/kubi/kucoin/startup/MonitorStartupTask;",
        "Lcom/kubi/sdk/startup/IStartupTask;",
        "<init>",
        "()V",
        "run",
        "",
        "application",
        "Landroid/app/Application;",
        "updateUser",
        "updateAppMode",
        "MonitorConfig",
        "LAppStartup_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
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

.method public static synthetic a(Lcom/kubi/kucoin/startup/MonitorStartupTask;Lcom/kubi/sdk/mode/AppMode;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/kucoin/startup/MonitorStartupTask;->run$lambda$2(Lcom/kubi/kucoin/startup/MonitorStartupTask;Lcom/kubi/sdk/mode/AppMode;)Lkotlin/Unit;

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
.end method

.method public static synthetic b(Lcom/kubi/kucoin/startup/MonitorStartupTask;Lcom/kubi/user/model/AccountEventState;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/kucoin/startup/MonitorStartupTask;->run$lambda$0(Lcom/kubi/kucoin/startup/MonitorStartupTask;Lcom/kubi/user/model/AccountEventState;)Lkotlin/Unit;

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
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/kucoin/startup/MonitorStartupTask;->run$lambda$1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

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
.end method

.method private static final run$lambda$0(Lcom/kubi/kucoin/startup/MonitorStartupTask;Lcom/kubi/user/model/AccountEventState;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/kucoin/startup/MonitorStartupTask;->updateUser()V

    .line 4
    .line 5
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 6
    return-object p0
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
.end method

.method private static final run$lambda$1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

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
.end method

.method private static final run$lambda$2(Lcom/kubi/kucoin/startup/MonitorStartupTask;Lcom/kubi/sdk/mode/AppMode;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/kucoin/startup/MonitorStartupTask;->updateAppMode()V

    .line 4
    .line 5
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 6
    return-object p0
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
.end method

.method private final updateAppMode()V
    .locals 3

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/sdk/mode/AppMode;->Companion:Lcom/kubi/sdk/mode/AppMode$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v1, v2, v1}, Lcom/kubi/sdk/mode/AppMode$Companion;->getCurrentMode$default(Lcom/kubi/sdk/mode/AppMode$Companion;Lcom/kubi/sdk/mode/AppMode;ILjava/lang/Object;)Lcom/kubi/sdk/mode/AppMode;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/kubi/sdk/mode/AppMode;->getModeType()Ljava/lang/String;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    const-string v1, "APP-MODE"

    .line 15
    .line 16
    .line 17
    invoke-static {v1, v0}, Lqq/g;->f(Ljava/lang/String;Ljava/lang/String;)V

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

.method private final updateUser()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/user/config/UserInfo;->c()Lcom/kubi/user/model/LoginUserEntity;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iget-object v0, v0, Lcom/kubi/user/model/LoginUserEntity;->uid:Ljava/lang/String;

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const-string v0, "0"

    .line 11
    .line 12
    :cond_0
    const-string v1, "UID"

    .line 13
    .line 14
    .line 15
    invoke-static {v1, v0}, Lqq/g;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    return-void
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
    .locals 3
    .param p1    # Landroid/app/Application;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "CheckResult"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "application"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object p1, Lcom/kubi/sdk/BaseApplication;->Companion:Lcom/kubi/sdk/BaseApplication$Companion;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Lcom/kubi/sdk/BaseApplication$Companion;->get()Landroid/app/Application;

    .line 11
    move-result-object p1

    .line 12
    .line 13
    sget-object v0, Lvk/s;->a:Lvk/s;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Lvk/s;->Q()Z

    .line 17
    move-result v0

    .line 18
    .line 19
    sget-object v1, Lcom/kubi/kucoin/startup/MonitorStartupTask$a;->a:Lcom/kubi/kucoin/startup/MonitorStartupTask$a;

    .line 20
    .line 21
    sget-object v2, Lcom/kubi/monitor/firebase/d;->a:Lcom/kubi/monitor/firebase/d;

    .line 22
    .line 23
    .line 24
    invoke-static {p1, v0, v1, v2}, Lqq/i;->h(Landroid/app/Application;ZLqq/e;Lqq/d;)V

    .line 25
    .line 26
    sget-object p1, Lcom/kubi/monitor/firebase/b;->a:Lcom/kubi/monitor/firebase/b;

    .line 27
    .line 28
    .line 29
    invoke-static {p1}, Lqq/i;->a(Ltq/c;)V

    .line 30
    .line 31
    sget-object p1, Lcom/kubi/monitor/sensor/b;->a:Lcom/kubi/monitor/sensor/b;

    .line 32
    .line 33
    .line 34
    invoke-static {p1}, Lqq/i;->a(Ltq/c;)V

    .line 35
    .line 36
    .line 37
    invoke-direct {p0}, Lcom/kubi/kucoin/startup/MonitorStartupTask;->updateUser()V

    .line 38
    .line 39
    sget-object p1, Lcom/kubi/user/config/UserInfo;->a:Lcom/kubi/user/config/UserInfo;

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1}, Lcom/kubi/user/config/UserInfo;->a()Lio/reactivex/Observable;

    .line 43
    move-result-object p1

    .line 44
    .line 45
    new-instance v0, Lcom/kubi/kucoin/startup/i;

    .line 46
    .line 47
    .line 48
    invoke-direct {v0, p0}, Lcom/kubi/kucoin/startup/i;-><init>(Lcom/kubi/kucoin/startup/MonitorStartupTask;)V

    .line 49
    .line 50
    new-instance v1, Lcom/kubi/kucoin/startup/j;

    .line 51
    .line 52
    .line 53
    invoke-direct {v1, v0}, Lcom/kubi/kucoin/startup/j;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1, v1}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    .line 57
    .line 58
    .line 59
    invoke-direct {p0}, Lcom/kubi/kucoin/startup/MonitorStartupTask;->updateAppMode()V

    .line 60
    .line 61
    sget-object p1, Lcom/kubi/sdk/mode/AppMode;->Companion:Lcom/kubi/sdk/mode/AppMode$Companion;

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1}, Lcom/kubi/sdk/mode/AppMode$Companion;->getCurrentMode()Landroidx/lifecycle/LiveData;

    .line 65
    move-result-object p1

    .line 66
    .line 67
    new-instance v0, Lcom/kubi/kucoin/startup/k;

    .line 68
    .line 69
    .line 70
    invoke-direct {v0, p0}, Lcom/kubi/kucoin/startup/k;-><init>(Lcom/kubi/kucoin/startup/MonitorStartupTask;)V

    .line 71
    .line 72
    new-instance v1, Lcom/kubi/kucoin/startup/MonitorStartupTask$b;

    .line 73
    .line 74
    .line 75
    invoke-direct {v1, v0}, Lcom/kubi/kucoin/startup/MonitorStartupTask$b;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1, v1}, Landroidx/lifecycle/LiveData;->observeForever(Landroidx/lifecycle/Observer;)V

    .line 79
    .line 80
    sget-object p1, Lcom/kubi/kucoin/utils/p;->a:Lcom/kubi/kucoin/utils/p;

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1}, Lcom/kubi/kucoin/utils/p;->a()V

    .line 84
    .line 85
    sget-object p1, Lcom/kubi/kucoin/utils/b1;->a:Lcom/kubi/kucoin/utils/b1;

    .line 86
    .line 87
    .line 88
    invoke-virtual {p1}, Lcom/kubi/kucoin/utils/b1;->a()V

    .line 89
    return-void
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
