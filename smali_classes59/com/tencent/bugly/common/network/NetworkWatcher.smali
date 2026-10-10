.class public final Lcom/tencent/bugly/common/network/NetworkWatcher;
.super Ljava/lang/Object;
.source "BUGLY"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/bugly/common/network/NetworkWatcher$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000[\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008*\u0001\u0019\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0008\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0008\u0010\u001f\u001a\u00020\u001eH\u0002J\u000e\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\rJ\u0008\u0010\"\u001a\u0004\u0018\u00010\u0004J\u0006\u0010#\u001a\u00020\u001cJ\u0006\u0010$\u001a\u00020\rJ\u0006\u0010%\u001a\u00020\rJ\u0018\u0010&\u001a\u00020\r2\u0006\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0002J\u0008\u0010+\u001a\u00020\u001cH\u0002J\u0018\u0010,\u001a\u00020\u00072\u0006\u0010-\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u000e\u0010.\u001a\u00020\u001c2\u0006\u0010/\u001a\u00020\u0016J\u0008\u00100\u001a\u00020\u001cH\u0002J\u0006\u00101\u001a\u00020\u001cR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\u00020\u00078BX\u0082\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000e\u0010\u000f\"\u0004\u0008\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0012\u0010\u000f\"\u0004\u0008\u0013\u0010\u0011R\"\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015j\n\u0012\u0004\u0012\u00020\u0016\u0018\u0001`\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u001a\u00a8\u00062"
    }
    d2 = {
        "Lcom/tencent/bugly/common/network/NetworkWatcher;",
        "",
        "()V",
        "ACTION_CONN_CHANGE",
        "",
        "TAG",
        "apn",
        "Lcom/tencent/bugly/common/network/Apn;",
        "getApn",
        "()Lcom/tencent/bugly/common/network/Apn;",
        "handler",
        "Landroid/os/Handler;",
        "isInited",
        "",
        "isNetAvailable",
        "()Z",
        "setNetAvailable",
        "(Z)V",
        "isWifiAvailable",
        "setWifiAvailable",
        "mListeners",
        "Ljava/util/HashSet;",
        "Lcom/tencent/bugly/common/network/INetworkStateListener;",
        "Lkotlin/collections/HashSet;",
        "netStatusReceive",
        "com/tencent/bugly/common/network/NetworkWatcher$netStatusReceive$1",
        "Lcom/tencent/bugly/common/network/NetworkWatcher$netStatusReceive$1;",
        "checkConnInfo",
        "",
        "networkState",
        "Lcom/tencent/bugly/common/network/NetworkState;",
        "getMobileDetailState",
        "getNetworkState",
        "fetchMobileDetailState",
        "getOperatorName",
        "init",
        "isNetworkConnectedRealtime",
        "isWiFiConnectedRealtime",
        "isWiFiType",
        "connManager",
        "Landroid/net/ConnectivityManager;",
        "activeNetInfo",
        "Landroid/net/NetworkInfo;",
        "notifyListener",
        "processApn",
        "it",
        "registerListener",
        "listener",
        "resetApn",
        "unInit",
        "bugly-pro_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final ACTION_CONN_CHANGE:Ljava/lang/String; = "android.net.conn.CONNECTIVITY_CHANGE"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final INSTANCE:Lcom/tencent/bugly/common/network/NetworkWatcher;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final TAG:Ljava/lang/String; = "Bugly_NetWatcher"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static volatile apn:Lcom/tencent/bugly/common/network/Apn;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static handler:Landroid/os/Handler;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private static volatile isInited:Z

.field private static volatile isNetAvailable:Z

.field private static volatile isWifiAvailable:Z

.field private static mListeners:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Lcom/tencent/bugly/common/network/INetworkStateListener;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private static final netStatusReceive:Lcom/tencent/bugly/common/network/NetworkWatcher$netStatusReceive$1;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/bugly/common/network/NetworkWatcher;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/tencent/bugly/common/network/NetworkWatcher;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/tencent/bugly/common/network/NetworkWatcher;->INSTANCE:Lcom/tencent/bugly/common/network/NetworkWatcher;

    .line 8
    .line 9
    sget-object v0, Lcom/tencent/bugly/common/network/Apn;->TYPE_INIT:Lcom/tencent/bugly/common/network/Apn;

    .line 10
    .line 11
    sput-object v0, Lcom/tencent/bugly/common/network/NetworkWatcher;->apn:Lcom/tencent/bugly/common/network/Apn;

    .line 12
    .line 13
    new-instance v0, Lcom/tencent/bugly/common/network/NetworkWatcher$netStatusReceive$1;

    .line 14
    .line 15
    .line 16
    invoke-direct {v0}, Lcom/tencent/bugly/common/network/NetworkWatcher$netStatusReceive$1;-><init>()V

    .line 17
    .line 18
    sput-object v0, Lcom/tencent/bugly/common/network/NetworkWatcher;->netStatusReceive:Lcom/tencent/bugly/common/network/NetworkWatcher$netStatusReceive$1;

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

.method private constructor <init>()V
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
.end method

.method public static final synthetic access$checkConnInfo(Lcom/tencent/bugly/common/network/NetworkWatcher;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/bugly/common/network/NetworkWatcher;->checkConnInfo()V

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
.end method

.method public static final synthetic access$getHandler$p()Landroid/os/Handler;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/bugly/common/network/NetworkWatcher;->handler:Landroid/os/Handler;

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

.method private final checkConnInfo()V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/bugly/common/network/NetworkWatcher;->resetApn()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/tencent/bugly/common/network/NetworkWatcher;->getApn()Lcom/tencent/bugly/common/network/Apn;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    sget-object v1, Lcom/tencent/bugly/common/network/NetworkWatcher$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 13
    move-result v0

    .line 14
    .line 15
    aget v0, v1, v0

    .line 16
    const/4 v1, 0x0

    .line 17
    const/4 v2, 0x1

    .line 18
    .line 19
    if-ne v0, v2, :cond_0

    .line 20
    move v0, v2

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move v0, v1

    .line 23
    .line 24
    :goto_0
    sput-boolean v0, Lcom/tencent/bugly/common/network/NetworkWatcher;->isWifiAvailable:Z

    .line 25
    .line 26
    .line 27
    invoke-direct {p0}, Lcom/tencent/bugly/common/network/NetworkWatcher;->getApn()Lcom/tencent/bugly/common/network/Apn;

    .line 28
    move-result-object v0

    .line 29
    .line 30
    sget-object v3, Lcom/tencent/bugly/common/network/Apn;->TYPE_UNKNOWN:Lcom/tencent/bugly/common/network/Apn;

    .line 31
    .line 32
    if-eq v0, v3, :cond_1

    .line 33
    move v1, v2

    .line 34
    .line 35
    :cond_1
    sput-boolean v1, Lcom/tencent/bugly/common/network/NetworkWatcher;->isNetAvailable:Z

    .line 36
    .line 37
    .line 38
    invoke-direct {p0}, Lcom/tencent/bugly/common/network/NetworkWatcher;->notifyListener()V

    .line 39
    return-void
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

.method private final getApn()Lcom/tencent/bugly/common/network/Apn;
    .locals 2

    .line 1
    sget-object v0, Lcom/tencent/bugly/common/network/NetworkWatcher;->apn:Lcom/tencent/bugly/common/network/Apn;

    sget-object v1, Lcom/tencent/bugly/common/network/Apn;->TYPE_INIT:Lcom/tencent/bugly/common/network/Apn;

    if-ne v0, v1, :cond_0

    .line 2
    invoke-direct {p0}, Lcom/tencent/bugly/common/network/NetworkWatcher;->resetApn()V

    .line 3
    :cond_0
    sget-object v0, Lcom/tencent/bugly/common/network/NetworkWatcher;->apn:Lcom/tencent/bugly/common/network/Apn;

    return-object v0
.end method

.method private final getApn(Lcom/tencent/bugly/common/network/NetworkState;)Lcom/tencent/bugly/common/network/Apn;
    .locals 2

    .line 4
    invoke-virtual {p0}, Lcom/tencent/bugly/common/network/NetworkWatcher;->getOperatorName()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 5
    sget-object v1, Lcom/tencent/bugly/common/network/NetworkWatcher;->INSTANCE:Lcom/tencent/bugly/common/network/NetworkWatcher;

    invoke-direct {v1, v0, p1}, Lcom/tencent/bugly/common/network/NetworkWatcher;->processApn(Ljava/lang/String;Lcom/tencent/bugly/common/network/NetworkState;)Lcom/tencent/bugly/common/network/Apn;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    return-object p1

    .line 6
    :cond_1
    :goto_0
    sget-object p1, Lcom/tencent/bugly/common/network/Apn;->TYPE_NET:Lcom/tencent/bugly/common/network/Apn;

    return-object p1
.end method

.method private final getMobileDetailState()Lcom/tencent/bugly/common/network/NetworkState;
    .locals 3

    .line 1
    .line 2
    .line 3
    :try_start_0
    invoke-static {}, Lcom/tencent/bugly/proguard/d3;->c()Landroid/content/Context;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    const-string v1, "android.permission.READ_PHONE_STATE"

    .line 7
    .line 8
    .line 9
    invoke-static {v0, v1}, Lcom/tencent/bugly/proguard/q4;->a(Landroid/content/Context;Ljava/lang/String;)Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    sget-object v0, Lcom/tencent/bugly/common/network/NetworkState;->NETWORK_MOBILE:Lcom/tencent/bugly/common/network/NetworkState;

    .line 15
    return-object v0

    .line 16
    :catchall_0
    move-exception v0

    .line 17
    .line 18
    goto/16 :goto_13

    .line 19
    .line 20
    .line 21
    :cond_0
    invoke-static {}, Lcom/tencent/bugly/proguard/d3;->c()Landroid/content/Context;

    .line 22
    move-result-object v0

    .line 23
    const/4 v1, 0x0

    .line 24
    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    .line 28
    const-string/jumbo v2, "phone"

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 32
    move-result-object v0

    .line 33
    goto :goto_0

    .line 34
    :cond_1
    move-object v0, v1

    .line 35
    .line 36
    :goto_0
    instance-of v2, v0, Landroid/telephony/TelephonyManager;

    .line 37
    .line 38
    if-eqz v2, :cond_2

    .line 39
    .line 40
    check-cast v0, Landroid/telephony/TelephonyManager;

    .line 41
    goto :goto_1

    .line 42
    :cond_2
    move-object v0, v1

    .line 43
    .line 44
    :goto_1
    if-eqz v0, :cond_3

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getNetworkType()I

    .line 48
    move-result v0

    .line 49
    .line 50
    .line 51
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 52
    move-result-object v1

    .line 53
    .line 54
    :cond_3
    if-nez v1, :cond_4

    .line 55
    goto :goto_2

    .line 56
    .line 57
    .line 58
    :cond_4
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 59
    move-result v0

    .line 60
    const/4 v2, 0x1

    .line 61
    .line 62
    if-ne v0, v2, :cond_5

    .line 63
    goto :goto_6

    .line 64
    .line 65
    :cond_5
    :goto_2
    if-nez v1, :cond_6

    .line 66
    goto :goto_3

    .line 67
    .line 68
    .line 69
    :cond_6
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 70
    move-result v0

    .line 71
    const/4 v2, 0x4

    .line 72
    .line 73
    if-ne v0, v2, :cond_7

    .line 74
    goto :goto_6

    .line 75
    .line 76
    :cond_7
    :goto_3
    if-nez v1, :cond_8

    .line 77
    goto :goto_4

    .line 78
    .line 79
    .line 80
    :cond_8
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 81
    move-result v0

    .line 82
    const/4 v2, 0x2

    .line 83
    .line 84
    if-ne v0, v2, :cond_9

    .line 85
    goto :goto_6

    .line 86
    .line 87
    :cond_9
    :goto_4
    if-nez v1, :cond_a

    .line 88
    goto :goto_5

    .line 89
    .line 90
    .line 91
    :cond_a
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 92
    move-result v0

    .line 93
    const/4 v2, 0x7

    .line 94
    .line 95
    if-ne v0, v2, :cond_b

    .line 96
    goto :goto_6

    .line 97
    .line 98
    :cond_b
    :goto_5
    if-nez v1, :cond_c

    .line 99
    goto :goto_7

    .line 100
    .line 101
    .line 102
    :cond_c
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 103
    move-result v0

    .line 104
    .line 105
    const/16 v2, 0xb

    .line 106
    .line 107
    if-ne v0, v2, :cond_d

    .line 108
    .line 109
    :goto_6
    sget-object v0, Lcom/tencent/bugly/common/network/NetworkState;->NETWORK_2G:Lcom/tencent/bugly/common/network/NetworkState;

    .line 110
    return-object v0

    .line 111
    .line 112
    :cond_d
    :goto_7
    if-nez v1, :cond_e

    .line 113
    goto :goto_8

    .line 114
    .line 115
    .line 116
    :cond_e
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 117
    move-result v0

    .line 118
    const/4 v2, 0x6

    .line 119
    .line 120
    if-ne v0, v2, :cond_f

    .line 121
    .line 122
    goto/16 :goto_10

    .line 123
    .line 124
    :cond_f
    :goto_8
    if-nez v1, :cond_10

    .line 125
    goto :goto_9

    .line 126
    .line 127
    .line 128
    :cond_10
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 129
    move-result v0

    .line 130
    const/4 v2, 0x3

    .line 131
    .line 132
    if-ne v0, v2, :cond_11

    .line 133
    goto :goto_10

    .line 134
    .line 135
    :cond_11
    :goto_9
    if-nez v1, :cond_12

    .line 136
    goto :goto_a

    .line 137
    .line 138
    .line 139
    :cond_12
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 140
    move-result v0

    .line 141
    const/4 v2, 0x5

    .line 142
    .line 143
    if-ne v0, v2, :cond_13

    .line 144
    goto :goto_10

    .line 145
    .line 146
    :cond_13
    :goto_a
    if-nez v1, :cond_14

    .line 147
    goto :goto_b

    .line 148
    .line 149
    .line 150
    :cond_14
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 151
    move-result v0

    .line 152
    .line 153
    const/16 v2, 0x8

    .line 154
    .line 155
    if-ne v0, v2, :cond_15

    .line 156
    goto :goto_10

    .line 157
    .line 158
    :cond_15
    :goto_b
    if-nez v1, :cond_16

    .line 159
    goto :goto_c

    .line 160
    .line 161
    .line 162
    :cond_16
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 163
    move-result v0

    .line 164
    .line 165
    const/16 v2, 0x9

    .line 166
    .line 167
    if-ne v0, v2, :cond_17

    .line 168
    goto :goto_10

    .line 169
    .line 170
    :cond_17
    :goto_c
    if-nez v1, :cond_18

    .line 171
    goto :goto_d

    .line 172
    .line 173
    .line 174
    :cond_18
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 175
    move-result v0

    .line 176
    .line 177
    const/16 v2, 0xa

    .line 178
    .line 179
    if-ne v0, v2, :cond_19

    .line 180
    goto :goto_10

    .line 181
    .line 182
    :cond_19
    :goto_d
    if-nez v1, :cond_1a

    .line 183
    goto :goto_e

    .line 184
    .line 185
    .line 186
    :cond_1a
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 187
    move-result v0

    .line 188
    .line 189
    const/16 v2, 0xc

    .line 190
    .line 191
    if-ne v0, v2, :cond_1b

    .line 192
    goto :goto_10

    .line 193
    .line 194
    :cond_1b
    :goto_e
    if-nez v1, :cond_1c

    .line 195
    goto :goto_f

    .line 196
    .line 197
    .line 198
    :cond_1c
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 199
    move-result v0

    .line 200
    .line 201
    const/16 v2, 0xe

    .line 202
    .line 203
    if-ne v0, v2, :cond_1d

    .line 204
    goto :goto_10

    .line 205
    .line 206
    :cond_1d
    :goto_f
    if-nez v1, :cond_1e

    .line 207
    goto :goto_11

    .line 208
    .line 209
    .line 210
    :cond_1e
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 211
    move-result v0

    .line 212
    .line 213
    const/16 v2, 0xf

    .line 214
    .line 215
    if-ne v0, v2, :cond_1f

    .line 216
    .line 217
    :goto_10
    sget-object v0, Lcom/tencent/bugly/common/network/NetworkState;->NETWORK_3G:Lcom/tencent/bugly/common/network/NetworkState;

    .line 218
    return-object v0

    .line 219
    .line 220
    :cond_1f
    :goto_11
    if-nez v1, :cond_20

    .line 221
    goto :goto_12

    .line 222
    .line 223
    .line 224
    :cond_20
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 225
    move-result v0

    .line 226
    .line 227
    const/16 v1, 0xd

    .line 228
    .line 229
    if-ne v0, v1, :cond_21

    .line 230
    .line 231
    sget-object v0, Lcom/tencent/bugly/common/network/NetworkState;->NETWORK_4G:Lcom/tencent/bugly/common/network/NetworkState;

    .line 232
    return-object v0

    .line 233
    .line 234
    :cond_21
    :goto_12
    sget-object v0, Lcom/tencent/bugly/common/network/NetworkState;->NETWORK_MOBILE:Lcom/tencent/bugly/common/network/NetworkState;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 235
    return-object v0

    .line 236
    .line 237
    :goto_13
    sget-object v1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 238
    .line 239
    const-string v2, "Bugly_NetWatcher"

    .line 240
    .line 241
    .line 242
    invoke-virtual {v1, v2, v0}, Lcom/tencent/rmonitor/common/logger/Logger;->exception(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 243
    .line 244
    sget-object v0, Lcom/tencent/bugly/common/network/NetworkState;->NETWORK_MOBILE:Lcom/tencent/bugly/common/network/NetworkState;

    .line 245
    return-object v0
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
.end method

.method private final isWiFiType(Landroid/net/ConnectivityManager;Landroid/net/NetworkInfo;)Z
    .locals 7

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/bugly/common/utils/AndroidVersion;->Companion:Lcom/tencent/bugly/common/utils/AndroidVersion$Companion;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/bugly/common/utils/AndroidVersion$Companion;->isOverL()Z

    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v2, 0x1

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p2}, Landroid/net/NetworkInfo;->isConnectedOrConnecting()Z

    .line 14
    move-result p1

    .line 15
    .line 16
    if-eqz p1, :cond_3

    .line 17
    .line 18
    .line 19
    invoke-virtual {p2}, Landroid/net/NetworkInfo;->getType()I

    .line 20
    move-result p1

    .line 21
    .line 22
    if-ne p1, v2, :cond_3

    .line 23
    return v2

    .line 24
    .line 25
    .line 26
    :cond_0
    invoke-virtual {p1}, Landroid/net/ConnectivityManager;->getAllNetworks()[Landroid/net/Network;

    .line 27
    move-result-object p2

    .line 28
    .line 29
    const-string v0, "connManager.allNetworks"

    .line 30
    .line 31
    .line 32
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    array-length v0, p2

    .line 34
    move v3, v1

    .line 35
    .line 36
    :goto_0
    if-ge v3, v0, :cond_3

    .line 37
    .line 38
    aget-object v4, p2, v3

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, v4}, Landroid/net/ConnectivityManager;->getNetworkInfo(Landroid/net/Network;)Landroid/net/NetworkInfo;

    .line 42
    move-result-object v4

    .line 43
    .line 44
    if-eqz v4, :cond_2

    .line 45
    .line 46
    .line 47
    invoke-virtual {v4}, Landroid/net/NetworkInfo;->getType()I

    .line 48
    move-result v5

    .line 49
    .line 50
    if-ne v5, v2, :cond_2

    .line 51
    .line 52
    .line 53
    invoke-virtual {v4}, Landroid/net/NetworkInfo;->getState()Landroid/net/NetworkInfo$State;

    .line 54
    move-result-object v5

    .line 55
    .line 56
    sget-object v6, Landroid/net/NetworkInfo$State;->CONNECTED:Landroid/net/NetworkInfo$State;

    .line 57
    .line 58
    if-eq v5, v6, :cond_1

    .line 59
    .line 60
    .line 61
    invoke-virtual {v4}, Landroid/net/NetworkInfo;->getState()Landroid/net/NetworkInfo$State;

    .line 62
    move-result-object v4

    .line 63
    .line 64
    sget-object v5, Landroid/net/NetworkInfo$State;->CONNECTING:Landroid/net/NetworkInfo$State;

    .line 65
    .line 66
    if-ne v4, v5, :cond_2

    .line 67
    :cond_1
    return v2

    .line 68
    .line 69
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 70
    goto :goto_0

    .line 71
    :cond_3
    return v1
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
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
.end method

.method private final notifyListener()V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/bugly/common/network/NetworkWatcher;->getApn()Lcom/tencent/bugly/common/network/Apn;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    sget-object v1, Lcom/tencent/bugly/common/network/NetworkWatcher$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 10
    move-result v0

    .line 11
    .line 12
    aget v0, v1, v0

    .line 13
    const/4 v1, 0x1

    .line 14
    .line 15
    if-eq v0, v1, :cond_1

    .line 16
    const/4 v1, 0x2

    .line 17
    .line 18
    if-eq v0, v1, :cond_0

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v1, 0x3

    .line 21
    .line 22
    :cond_1
    :goto_0
    sget-object v0, Lcom/tencent/bugly/common/network/NetworkWatcher;->mListeners:Ljava/util/HashSet;

    .line 23
    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    .line 27
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 31
    move-result-object v0

    .line 32
    .line 33
    .line 34
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    move-result v2

    .line 36
    .line 37
    if-eqz v2, :cond_2

    .line 38
    .line 39
    .line 40
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    move-result-object v2

    .line 42
    .line 43
    check-cast v2, Lcom/tencent/bugly/common/network/INetworkStateListener;

    .line 44
    .line 45
    .line 46
    invoke-interface {v2, v1}, Lcom/tencent/bugly/common/network/INetworkStateListener;->onNetworkStateChanged(I)V

    .line 47
    goto :goto_1

    .line 48
    :cond_2
    return-void
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

.method private final processApn(Ljava/lang/String;Lcom/tencent/bugly/common/network/NetworkState;)Lcom/tencent/bugly/common/network/Apn;
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 4
    move-result v0

    .line 5
    .line 6
    .line 7
    const v1, 0x24de73bc

    .line 8
    const/4 v2, 0x2

    .line 9
    const/4 v3, 0x1

    .line 10
    .line 11
    if-eq v0, v1, :cond_8

    .line 12
    .line 13
    .line 14
    const v1, 0x24df0a7d

    .line 15
    .line 16
    if-eq v0, v1, :cond_4

    .line 17
    .line 18
    .line 19
    const v1, 0x24e00cb6

    .line 20
    .line 21
    if-eq v0, v1, :cond_0

    .line 22
    goto :goto_0

    .line 23
    .line 24
    .line 25
    :cond_0
    const-string/jumbo v0, "\u4e2d\u56fd\u8054\u901a"

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    move-result p1

    .line 30
    .line 31
    if-nez p1, :cond_1

    .line 32
    goto :goto_0

    .line 33
    .line 34
    :cond_1
    sget-object p1, Lcom/tencent/bugly/common/network/NetworkWatcher$WhenMappings;->$EnumSwitchMapping$1:[I

    .line 35
    .line 36
    .line 37
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 38
    move-result p2

    .line 39
    .line 40
    aget p1, p1, p2

    .line 41
    .line 42
    if-eq p1, v3, :cond_3

    .line 43
    .line 44
    if-eq p1, v2, :cond_2

    .line 45
    .line 46
    sget-object p1, Lcom/tencent/bugly/common/network/Apn;->T_APN_WONET:Lcom/tencent/bugly/common/network/Apn;

    .line 47
    return-object p1

    .line 48
    .line 49
    :cond_2
    sget-object p1, Lcom/tencent/bugly/common/network/Apn;->T_APN_3GNET:Lcom/tencent/bugly/common/network/Apn;

    .line 50
    return-object p1

    .line 51
    .line 52
    :cond_3
    sget-object p1, Lcom/tencent/bugly/common/network/Apn;->T_APN_UNINET:Lcom/tencent/bugly/common/network/Apn;

    .line 53
    return-object p1

    .line 54
    .line 55
    .line 56
    :cond_4
    const-string/jumbo v0, "\u4e2d\u56fd\u79fb\u52a8"

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 60
    move-result p1

    .line 61
    .line 62
    if-nez p1, :cond_5

    .line 63
    goto :goto_0

    .line 64
    .line 65
    :cond_5
    sget-object p1, Lcom/tencent/bugly/common/network/NetworkWatcher$WhenMappings;->$EnumSwitchMapping$1:[I

    .line 66
    .line 67
    .line 68
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 69
    move-result p2

    .line 70
    .line 71
    aget p1, p1, p2

    .line 72
    .line 73
    if-eq p1, v3, :cond_7

    .line 74
    .line 75
    if-eq p1, v2, :cond_6

    .line 76
    .line 77
    sget-object p1, Lcom/tencent/bugly/common/network/Apn;->T_APN_CMLTE:Lcom/tencent/bugly/common/network/Apn;

    .line 78
    return-object p1

    .line 79
    .line 80
    :cond_6
    sget-object p1, Lcom/tencent/bugly/common/network/Apn;->T_APN_CM3G:Lcom/tencent/bugly/common/network/Apn;

    .line 81
    return-object p1

    .line 82
    .line 83
    :cond_7
    sget-object p1, Lcom/tencent/bugly/common/network/Apn;->T_APN_CMNET:Lcom/tencent/bugly/common/network/Apn;

    .line 84
    return-object p1

    .line 85
    .line 86
    .line 87
    :cond_8
    const-string/jumbo v0, "\u4e2d\u56fd\u7535\u4fe1"

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 91
    move-result p1

    .line 92
    .line 93
    if-nez p1, :cond_9

    .line 94
    .line 95
    :goto_0
    sget-object p1, Lcom/tencent/bugly/common/network/Apn;->TYPE_NET:Lcom/tencent/bugly/common/network/Apn;

    .line 96
    return-object p1

    .line 97
    .line 98
    :cond_9
    sget-object p1, Lcom/tencent/bugly/common/network/NetworkWatcher$WhenMappings;->$EnumSwitchMapping$1:[I

    .line 99
    .line 100
    .line 101
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 102
    move-result p2

    .line 103
    .line 104
    aget p1, p1, p2

    .line 105
    .line 106
    if-eq p1, v3, :cond_b

    .line 107
    .line 108
    if-eq p1, v2, :cond_a

    .line 109
    .line 110
    sget-object p1, Lcom/tencent/bugly/common/network/Apn;->T_APN_CTLTE:Lcom/tencent/bugly/common/network/Apn;

    .line 111
    return-object p1

    .line 112
    .line 113
    :cond_a
    sget-object p1, Lcom/tencent/bugly/common/network/Apn;->T_APN_CTNET:Lcom/tencent/bugly/common/network/Apn;

    .line 114
    return-object p1

    .line 115
    .line 116
    :cond_b
    sget-object p1, Lcom/tencent/bugly/common/network/Apn;->TYPE_UNKNOWN:Lcom/tencent/bugly/common/network/Apn;

    .line 117
    return-object p1
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
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
.end method

.method private final resetApn()V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    .line 4
    :try_start_0
    invoke-virtual {p0, v0}, Lcom/tencent/bugly/common/network/NetworkWatcher;->getNetworkState(Z)Lcom/tencent/bugly/common/network/NetworkState;

    .line 5
    move-result-object v0

    .line 6
    .line 7
    sget-object v1, Lcom/tencent/bugly/common/network/NetworkWatcher$WhenMappings;->$EnumSwitchMapping$1:[I

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 11
    move-result v2

    .line 12
    .line 13
    aget v1, v1, v2

    .line 14
    const/4 v2, 0x3

    .line 15
    .line 16
    if-eq v1, v2, :cond_1

    .line 17
    const/4 v2, 0x4

    .line 18
    .line 19
    if-eq v1, v2, :cond_0

    .line 20
    .line 21
    .line 22
    invoke-direct {p0, v0}, Lcom/tencent/bugly/common/network/NetworkWatcher;->getApn(Lcom/tencent/bugly/common/network/NetworkState;)Lcom/tencent/bugly/common/network/Apn;

    .line 23
    move-result-object v0

    .line 24
    goto :goto_1

    .line 25
    :catch_0
    move-exception v0

    .line 26
    goto :goto_0

    .line 27
    .line 28
    :cond_0
    sget-object v0, Lcom/tencent/bugly/common/network/Apn;->TYPE_UNKNOWN:Lcom/tencent/bugly/common/network/Apn;

    .line 29
    goto :goto_1

    .line 30
    .line 31
    :cond_1
    sget-object v0, Lcom/tencent/bugly/common/network/Apn;->TYPE_WIFI:Lcom/tencent/bugly/common/network/Apn;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 32
    goto :goto_1

    .line 33
    .line 34
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    const-string v0, ": cannot get apn from network state, so use default"

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    move-result-object v0

    .line 50
    .line 51
    const-string v1, "Bugly_NetWatcher"

    .line 52
    .line 53
    .line 54
    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 55
    .line 56
    sget-object v0, Lcom/tencent/bugly/common/network/Apn;->TYPE_UNKNOWN:Lcom/tencent/bugly/common/network/Apn;

    .line 57
    .line 58
    :goto_1
    sput-object v0, Lcom/tencent/bugly/common/network/NetworkWatcher;->apn:Lcom/tencent/bugly/common/network/Apn;

    .line 59
    return-void
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
.end method


# virtual methods
.method public final getNetworkState(Z)Lcom/tencent/bugly/common/network/NetworkState;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/bugly/proguard/d3;->c()Landroid/content/Context;

    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const-string v2, "connectivity"

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 13
    move-result-object v0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move-object v0, v1

    .line 16
    .line 17
    :goto_0
    instance-of v2, v0, Landroid/net/ConnectivityManager;

    .line 18
    .line 19
    if-eqz v2, :cond_1

    .line 20
    move-object v1, v0

    .line 21
    .line 22
    check-cast v1, Landroid/net/ConnectivityManager;

    .line 23
    .line 24
    :cond_1
    if-nez v1, :cond_2

    .line 25
    .line 26
    sget-object p1, Lcom/tencent/bugly/common/network/NetworkState;->NETWORK_NONE:Lcom/tencent/bugly/common/network/NetworkState;

    .line 27
    return-object p1

    .line 28
    .line 29
    .line 30
    :cond_2
    invoke-virtual {v1}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    .line 31
    move-result-object v0

    .line 32
    .line 33
    if-eqz v0, :cond_6

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isAvailable()Z

    .line 37
    move-result v2

    .line 38
    .line 39
    if-nez v2, :cond_3

    .line 40
    goto :goto_1

    .line 41
    .line 42
    .line 43
    :cond_3
    invoke-direct {p0, v1, v0}, Lcom/tencent/bugly/common/network/NetworkWatcher;->isWiFiType(Landroid/net/ConnectivityManager;Landroid/net/NetworkInfo;)Z

    .line 44
    move-result v0

    .line 45
    .line 46
    if-eqz v0, :cond_4

    .line 47
    .line 48
    sget-object p1, Lcom/tencent/bugly/common/network/NetworkState;->NETWORK_WIFI:Lcom/tencent/bugly/common/network/NetworkState;

    .line 49
    return-object p1

    .line 50
    .line 51
    :cond_4
    if-eqz p1, :cond_5

    .line 52
    .line 53
    .line 54
    invoke-direct {p0}, Lcom/tencent/bugly/common/network/NetworkWatcher;->getMobileDetailState()Lcom/tencent/bugly/common/network/NetworkState;

    .line 55
    move-result-object p1

    .line 56
    return-object p1

    .line 57
    .line 58
    :cond_5
    sget-object p1, Lcom/tencent/bugly/common/network/NetworkState;->NETWORK_MOBILE:Lcom/tencent/bugly/common/network/NetworkState;

    .line 59
    return-object p1

    .line 60
    .line 61
    :cond_6
    :goto_1
    sget-object p1, Lcom/tencent/bugly/common/network/NetworkState;->NETWORK_NONE:Lcom/tencent/bugly/common/network/NetworkState;

    .line 62
    return-object p1
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

.method public final getOperatorName()Ljava/lang/String;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/bugly/proguard/d3;->c()Landroid/content/Context;

    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    .line 10
    const-string/jumbo v2, "phone"

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 14
    move-result-object v0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move-object v0, v1

    .line 17
    .line 18
    :goto_0
    instance-of v2, v0, Landroid/telephony/TelephonyManager;

    .line 19
    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    check-cast v0, Landroid/telephony/TelephonyManager;

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    move-object v0, v1

    .line 25
    .line 26
    :goto_1
    if-eqz v0, :cond_2

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getSimOperatorName()Ljava/lang/String;

    .line 30
    move-result-object v0

    .line 31
    return-object v0

    .line 32
    :cond_2
    return-object v1
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

.method public final init()V
    .locals 6

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "unInit, "

    .line 4
    .line 5
    sget-boolean v1, Lcom/tencent/bugly/common/network/NetworkWatcher;->isInited:Z

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    return-void

    .line 9
    .line 10
    :cond_0
    sget-object v1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 11
    .line 12
    const-string v2, "Bugly_NetWatcher"

    .line 13
    .line 14
    const-string v3, "init"

    .line 15
    .line 16
    .line 17
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 18
    move-result-object v2

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, v2}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    .line 22
    .line 23
    const-class v1, Lcom/tencent/bugly/common/network/NetworkWatcher;

    .line 24
    monitor-enter v1

    .line 25
    .line 26
    :try_start_0
    sget-boolean v2, Lcom/tencent/bugly/common/network/NetworkWatcher;->isInited:Z

    .line 27
    .line 28
    if-nez v2, :cond_2

    .line 29
    .line 30
    .line 31
    invoke-static {}, Lcom/tencent/bugly/proguard/d3;->c()Landroid/content/Context;

    .line 32
    move-result-object v2

    .line 33
    .line 34
    if-eqz v2, :cond_1

    .line 35
    .line 36
    const-string v3, "getGlobalContext()"

    .line 37
    .line 38
    .line 39
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 40
    .line 41
    :try_start_1
    sget-object v3, Lcom/tencent/bugly/common/network/NetworkWatcher;->netStatusReceive:Lcom/tencent/bugly/common/network/NetworkWatcher$netStatusReceive$1;

    .line 42
    .line 43
    new-instance v4, Landroid/content/IntentFilter;

    .line 44
    .line 45
    const-string v5, "android.net.conn.CONNECTIVITY_CHANGE"

    .line 46
    .line 47
    .line 48
    invoke-direct {v4, v5}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v2, v3, v4}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 52
    goto :goto_0

    .line 53
    :catchall_0
    move-exception v2

    .line 54
    .line 55
    :try_start_2
    sget-object v3, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 56
    .line 57
    const-string v4, "Bugly_NetWatcher"

    .line 58
    .line 59
    new-instance v5, Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    move-result-object v0

    .line 70
    .line 71
    .line 72
    filled-new-array {v4, v0}, [Ljava/lang/String;

    .line 73
    move-result-object v0

    .line 74
    .line 75
    .line 76
    invoke-virtual {v3, v0}, Lcom/tencent/rmonitor/common/logger/Logger;->e([Ljava/lang/String;)V

    .line 77
    goto :goto_0

    .line 78
    :catchall_1
    move-exception v0

    .line 79
    goto :goto_1

    .line 80
    .line 81
    :cond_1
    :goto_0
    new-instance v0, Landroid/os/Handler;

    .line 82
    .line 83
    sget-object v2, Lcom/tencent/bugly/common/thread/ThreadManager;->Companion:Lcom/tencent/bugly/common/thread/ThreadManager$Companion;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v2}, Lcom/tencent/bugly/common/thread/ThreadManager$Companion;->getMonitorThreadLooper()Landroid/os/Looper;

    .line 87
    move-result-object v2

    .line 88
    .line 89
    .line 90
    invoke-direct {v0, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 91
    .line 92
    sput-object v0, Lcom/tencent/bugly/common/network/NetworkWatcher;->handler:Landroid/os/Handler;

    .line 93
    const/4 v0, 0x1

    .line 94
    .line 95
    sput-boolean v0, Lcom/tencent/bugly/common/network/NetworkWatcher;->isInited:Z

    .line 96
    .line 97
    sget-object v0, Lcom/tencent/bugly/common/network/NetworkWatcher;->INSTANCE:Lcom/tencent/bugly/common/network/NetworkWatcher;

    .line 98
    .line 99
    .line 100
    invoke-direct {v0}, Lcom/tencent/bugly/common/network/NetworkWatcher;->checkConnInfo()V

    .line 101
    .line 102
    :cond_2
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 103
    monitor-exit v1

    .line 104
    return-void

    .line 105
    :goto_1
    monitor-exit v1

    .line 106
    throw v0
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
.end method

.method public final isNetAvailable()Z
    .locals 1

    .line 1
    .line 2
    sget-boolean v0, Lcom/tencent/bugly/common/network/NetworkWatcher;->isNetAvailable:Z

    .line 3
    return v0
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

.method public final isNetworkConnectedRealtime()Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Lcom/tencent/bugly/common/network/NetworkWatcher;->getNetworkState(Z)Lcom/tencent/bugly/common/network/NetworkState;

    .line 5
    move-result-object v1

    .line 6
    .line 7
    sget-object v2, Lcom/tencent/bugly/common/network/NetworkState;->NETWORK_NONE:Lcom/tencent/bugly/common/network/NetworkState;

    .line 8
    .line 9
    if-eq v1, v2, :cond_0

    .line 10
    const/4 v0, 0x1

    .line 11
    :cond_0
    return v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public final isWiFiConnectedRealtime()Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Lcom/tencent/bugly/common/network/NetworkWatcher;->getNetworkState(Z)Lcom/tencent/bugly/common/network/NetworkState;

    .line 5
    move-result-object v1

    .line 6
    .line 7
    sget-object v2, Lcom/tencent/bugly/common/network/NetworkState;->NETWORK_WIFI:Lcom/tencent/bugly/common/network/NetworkState;

    .line 8
    .line 9
    if-ne v1, v2, :cond_0

    .line 10
    const/4 v0, 0x1

    .line 11
    :cond_0
    return v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public final isWifiAvailable()Z
    .locals 1

    .line 1
    .line 2
    sget-boolean v0, Lcom/tencent/bugly/common/network/NetworkWatcher;->isWifiAvailable:Z

    .line 3
    return v0
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

.method public final registerListener(Lcom/tencent/bugly/common/network/INetworkStateListener;)V
    .locals 1
    .param p1    # Lcom/tencent/bugly/common/network/INetworkStateListener;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "listener"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Lcom/tencent/bugly/common/network/NetworkWatcher;->mListeners:Ljava/util/HashSet;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    new-instance v0, Ljava/util/HashSet;

    .line 12
    .line 13
    .line 14
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 15
    .line 16
    sput-object v0, Lcom/tencent/bugly/common/network/NetworkWatcher;->mListeners:Ljava/util/HashSet;

    .line 17
    .line 18
    :cond_0
    sget-object v0, Lcom/tencent/bugly/common/network/NetworkWatcher;->mListeners:Ljava/util/HashSet;

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    .line 23
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 27
    move-result v0

    .line 28
    .line 29
    if-nez v0, :cond_1

    .line 30
    .line 31
    sget-object v0, Lcom/tencent/bugly/common/network/NetworkWatcher;->mListeners:Ljava/util/HashSet;

    .line 32
    .line 33
    .line 34
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 38
    :cond_1
    return-void
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

.method public final setNetAvailable(Z)V
    .locals 0

    .line 1
    .line 2
    sput-boolean p1, Lcom/tencent/bugly/common/network/NetworkWatcher;->isNetAvailable:Z

    .line 3
    return-void
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
.end method

.method public final setWifiAvailable(Z)V
    .locals 0

    .line 1
    .line 2
    sput-boolean p1, Lcom/tencent/bugly/common/network/NetworkWatcher;->isWifiAvailable:Z

    .line 3
    return-void
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
.end method

.method public final unInit()V
    .locals 6

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "unInit, "

    .line 4
    .line 5
    const-class v1, Lcom/tencent/bugly/common/network/NetworkWatcher;

    .line 6
    monitor-enter v1

    .line 7
    .line 8
    :try_start_0
    sget-boolean v2, Lcom/tencent/bugly/common/network/NetworkWatcher;->isInited:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 9
    .line 10
    if-eqz v2, :cond_1

    .line 11
    .line 12
    .line 13
    :try_start_1
    invoke-static {}, Lcom/tencent/bugly/proguard/d3;->c()Landroid/content/Context;

    .line 14
    move-result-object v2

    .line 15
    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    sget-object v3, Lcom/tencent/bugly/common/network/NetworkWatcher;->netStatusReceive:Lcom/tencent/bugly/common/network/NetworkWatcher$netStatusReceive$1;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v2, v3}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception v2

    .line 24
    .line 25
    :try_start_2
    sget-object v3, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 26
    .line 27
    const-string v4, "Bugly_NetWatcher"

    .line 28
    .line 29
    new-instance v5, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    move-result-object v0

    .line 40
    .line 41
    .line 42
    filled-new-array {v4, v0}, [Ljava/lang/String;

    .line 43
    move-result-object v0

    .line 44
    .line 45
    .line 46
    invoke-virtual {v3, v0}, Lcom/tencent/rmonitor/common/logger/Logger;->e([Ljava/lang/String;)V

    .line 47
    :cond_0
    :goto_0
    const/4 v0, 0x0

    .line 48
    .line 49
    sput-boolean v0, Lcom/tencent/bugly/common/network/NetworkWatcher;->isInited:Z

    .line 50
    goto :goto_1

    .line 51
    :catchall_1
    move-exception v0

    .line 52
    goto :goto_2

    .line 53
    .line 54
    :cond_1
    :goto_1
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 55
    monitor-exit v1

    .line 56
    return-void

    .line 57
    :goto_2
    monitor-exit v1

    .line 58
    throw v0
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
.end method
