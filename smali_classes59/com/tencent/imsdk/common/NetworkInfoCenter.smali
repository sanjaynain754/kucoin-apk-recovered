.class public Lcom/tencent/imsdk/common/NetworkInfoCenter;
.super Landroid/content/BroadcastReceiver;
.source "NetworkInfoCenter.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/imsdk/common/NetworkInfoCenter$Holder;,
        Lcom/tencent/imsdk/common/NetworkInfoCenter$INetworkChangeListener;
    }
.end annotation


# static fields
.field private static final IP_TYPE_IPV4_ONLY:I = 0x1

.field private static final IP_TYPE_IPV6_DUAL:I = 0x3

.field private static final IP_TYPE_IPV6_ONLY:I = 0x2

.field private static final IP_TYPE_UNKNOWN:I = 0x0

.field private static final NETWORK_1xRTT:I = 0x6b

.field private static final NETWORK_2G3G:I = 0x2

.field private static final NETWORK_CDMA:I = 0x68

.field private static final NETWORK_CDMA1X:I = 0x62

.field private static final NETWORK_EDGE:I = 0x66

.field private static final NETWORK_EHRPD:I = 0x72

.field private static final NETWORK_EVDO_0:I = 0x69

.field private static final NETWORK_EVDO_A:I = 0x6a

.field private static final NETWORK_EVDO_B:I = 0x70

.field private static final NETWORK_GPRS:I = 0x65

.field private static final NETWORK_HSDPA:I = 0x6c

.field private static final NETWORK_HSPA:I = 0x6e

.field private static final NETWORK_HSPAP:I = 0x73

.field private static final NETWORK_HSUPA:I = 0x6d

.field private static final NETWORK_IDEN:I = 0x6f

.field private static final NETWORK_LTE:I = 0x71

.field private static final NETWORK_UMTS:I = 0x67

.field private static final NETWORK_UNKNOWN:I = 0x0

.field private static final NETWORK_WCDMA:I = 0x63

.field private static final NETWORK_WIFI:I = 0x1

.field private static final TAG:Ljava/lang/String; = "NetworkInfoCenter"


# instance fields
.field private isInit:Z

.field private isRegisterReceiver:Z

.field private mCheckNetworkInterface:Z

.field private mConnectivityManager:Landroid/net/ConnectivityManager;

.field private mContext:Landroid/content/Context;

.field private mIPType:I

.field private mInitializeCostTime:J

.field private mListener:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/tencent/imsdk/common/NetworkInfoCenter$INetworkChangeListener;",
            ">;"
        }
    .end annotation
.end field

.field private mNetworkConnected:Z

.field private mNetworkSSID:Ljava/lang/String;

.field private mNetworkType:I

.field private mServiceProvider:Ljava/lang/String;

.field private mTelephonyManager:Landroid/telephony/TelephonyManager;

.field private mWifiManager:Landroid/net/wifi/WifiManager;

.field private mWifiNetworkHandle:J

.field private mXgNetworkHandle:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
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

.method public constructor <init>()V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput-boolean v0, p0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->isInit:Z

    .line 7
    .line 8
    iput-boolean v0, p0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->mNetworkConnected:Z

    .line 9
    .line 10
    iput v0, p0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->mNetworkType:I

    .line 11
    .line 12
    iput v0, p0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->mIPType:I

    .line 13
    .line 14
    const-string v1, ""

    .line 15
    .line 16
    iput-object v1, p0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->mNetworkSSID:Ljava/lang/String;

    .line 17
    .line 18
    iput-object v1, p0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->mServiceProvider:Ljava/lang/String;

    .line 19
    .line 20
    const-wide/16 v1, 0x0

    .line 21
    .line 22
    iput-wide v1, p0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->mInitializeCostTime:J

    .line 23
    .line 24
    iput-boolean v0, p0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->isRegisterReceiver:Z

    .line 25
    .line 26
    iput-boolean v0, p0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->mCheckNetworkInterface:Z

    .line 27
    .line 28
    iput-wide v1, p0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->mWifiNetworkHandle:J

    .line 29
    .line 30
    iput-wide v1, p0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->mXgNetworkHandle:J

    .line 31
    return-void
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

.method public static getInstance()Lcom/tencent/imsdk/common/NetworkInfoCenter;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/imsdk/common/NetworkInfoCenter$Holder;->instance:Lcom/tencent/imsdk/common/NetworkInfoCenter;

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

.method private getProviderName()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->mServiceProvider:Ljava/lang/String;

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

.method private static networkToNetId(Landroid/net/Network;)J
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/net/Network;->getNetworkHandle()J

    .line 4
    move-result-wide v0

    .line 5
    return-wide v0
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

.method private onNetworkChanged(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 11

    .line 1
    .line 2
    sget-object p1, Lcom/tencent/imsdk/common/NetworkInfoCenter;->TAG:Ljava/lang/String;

    .line 3
    .line 4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    const-string/jumbo v1, "network changed, action: "

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 17
    move-result-object v1

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    .line 27
    invoke-static {p1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 28
    .line 29
    const-string v0, "android.net.conn.CONNECTIVITY_CHANGE"

    .line 30
    .line 31
    .line 32
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 33
    move-result-object p2

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 37
    move-result p2

    .line 38
    .line 39
    if-eqz p2, :cond_4

    .line 40
    .line 41
    iget-object p2, p0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->mConnectivityManager:Landroid/net/ConnectivityManager;

    .line 42
    .line 43
    if-nez p2, :cond_0

    .line 44
    .line 45
    iget-object p2, p0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->mContext:Landroid/content/Context;

    .line 46
    .line 47
    const-string v0, "connectivity"

    .line 48
    .line 49
    .line 50
    invoke-virtual {p2, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 51
    move-result-object p2

    .line 52
    .line 53
    check-cast p2, Landroid/net/ConnectivityManager;

    .line 54
    .line 55
    iput-object p2, p0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->mConnectivityManager:Landroid/net/ConnectivityManager;

    .line 56
    .line 57
    :cond_0
    iget-object p2, p0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->mConnectivityManager:Landroid/net/ConnectivityManager;

    .line 58
    .line 59
    if-nez p2, :cond_1

    .line 60
    .line 61
    .line 62
    const-string/jumbo p2, "network changed, mConnectivityManager is null"

    .line 63
    .line 64
    .line 65
    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 66
    return-void

    .line 67
    .line 68
    .line 69
    :cond_1
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 70
    move-result-wide p1

    .line 71
    .line 72
    :try_start_0
    iget-object v0, p0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->mConnectivityManager:Landroid/net/ConnectivityManager;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    .line 76
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 77
    goto :goto_0

    .line 78
    :catch_0
    move-exception v0

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 82
    const/4 v0, 0x0

    .line 83
    :goto_0
    const/4 v1, 0x0

    .line 84
    .line 85
    if-eqz v0, :cond_3

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z

    .line 89
    move-result v2

    .line 90
    .line 91
    if-eqz v2, :cond_2

    .line 92
    const/4 v1, 0x1

    .line 93
    .line 94
    iput-boolean v1, p0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->mNetworkConnected:Z

    .line 95
    goto :goto_1

    .line 96
    .line 97
    :cond_2
    iput-boolean v1, p0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->mNetworkConnected:Z

    .line 98
    .line 99
    .line 100
    :goto_1
    invoke-direct {p0, v0}, Lcom/tencent/imsdk/common/NetworkInfoCenter;->updateNetworkType(Landroid/net/NetworkInfo;)V

    .line 101
    .line 102
    .line 103
    invoke-direct {p0}, Lcom/tencent/imsdk/common/NetworkInfoCenter;->updateNetworkSSID()V

    .line 104
    .line 105
    .line 106
    invoke-direct {p0}, Lcom/tencent/imsdk/common/NetworkInfoCenter;->updateProviderName()V

    .line 107
    .line 108
    .line 109
    invoke-direct {p0}, Lcom/tencent/imsdk/common/NetworkInfoCenter;->updateNetworkInterface()V

    .line 110
    .line 111
    sget-object v1, Lcom/tencent/imsdk/common/NetworkInfoCenter;->TAG:Ljava/lang/String;

    .line 112
    .line 113
    new-instance v2, Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 117
    .line 118
    const-string v3, "mNetworkConnected: "

    .line 119
    .line 120
    .line 121
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    iget-boolean v3, p0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->mNetworkConnected:Z

    .line 124
    .line 125
    .line 126
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    const-string v3, ", current network: "

    .line 129
    .line 130
    .line 131
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 138
    move-result-object v0

    .line 139
    .line 140
    .line 141
    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 142
    goto :goto_2

    .line 143
    .line 144
    :cond_3
    iput-boolean v1, p0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->mNetworkConnected:Z

    .line 145
    .line 146
    iput v1, p0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->mNetworkType:I

    .line 147
    .line 148
    sget-object v0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->TAG:Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    const-string/jumbo v1, "no network connection found"

    .line 152
    .line 153
    .line 154
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 155
    .line 156
    .line 157
    :goto_2
    invoke-direct {p0}, Lcom/tencent/imsdk/common/NetworkInfoCenter;->updateIPType()V

    .line 158
    .line 159
    .line 160
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 161
    move-result-wide v0

    .line 162
    sub-long/2addr v0, p1

    .line 163
    .line 164
    iput-wide v0, p0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->mInitializeCostTime:J

    .line 165
    .line 166
    iget-object p1, p0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->mListener:Ljava/lang/ref/WeakReference;

    .line 167
    .line 168
    .line 169
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 170
    move-result-object p1

    .line 171
    move-object v0, p1

    .line 172
    .line 173
    check-cast v0, Lcom/tencent/imsdk/common/NetworkInfoCenter$INetworkChangeListener;

    .line 174
    .line 175
    if-eqz v0, :cond_4

    .line 176
    .line 177
    iget-boolean v1, p0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->mNetworkConnected:Z

    .line 178
    .line 179
    .line 180
    invoke-virtual {p0}, Lcom/tencent/imsdk/common/NetworkInfoCenter;->getNetworkType()I

    .line 181
    move-result v2

    .line 182
    .line 183
    .line 184
    invoke-virtual {p0}, Lcom/tencent/imsdk/common/NetworkInfoCenter;->getIPType()I

    .line 185
    move-result v3

    .line 186
    .line 187
    .line 188
    invoke-virtual {p0}, Lcom/tencent/imsdk/common/NetworkInfoCenter;->getNetworkID()Ljava/lang/String;

    .line 189
    move-result-object v4

    .line 190
    .line 191
    .line 192
    invoke-virtual {p0}, Lcom/tencent/imsdk/common/NetworkInfoCenter;->getWifiNetworkHandle()J

    .line 193
    move-result-wide v5

    .line 194
    .line 195
    .line 196
    invoke-virtual {p0}, Lcom/tencent/imsdk/common/NetworkInfoCenter;->getXgNetworkHandle()J

    .line 197
    move-result-wide v7

    .line 198
    .line 199
    .line 200
    invoke-virtual {p0}, Lcom/tencent/imsdk/common/NetworkInfoCenter;->getInitializeCostTime()J

    .line 201
    move-result-wide v9

    .line 202
    .line 203
    .line 204
    invoke-interface/range {v0 .. v10}, Lcom/tencent/imsdk/common/NetworkInfoCenter$INetworkChangeListener;->onNetworkChange(ZIILjava/lang/String;JJJ)V

    .line 205
    :cond_4
    return-void
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

.method private onScreenStatusChange(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .line 1
    .line 2
    sget-object p1, Lcom/tencent/imsdk/common/NetworkInfoCenter;->TAG:Ljava/lang/String;

    .line 3
    .line 4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    const-string/jumbo v1, "screen status changed, action: "

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 17
    move-result-object v1

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    .line 27
    invoke-static {p1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 28
    .line 29
    iget-object p1, p0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->mListener:Ljava/lang/ref/WeakReference;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 33
    move-result-object p1

    .line 34
    .line 35
    check-cast p1, Lcom/tencent/imsdk/common/NetworkInfoCenter$INetworkChangeListener;

    .line 36
    .line 37
    const-string v0, "android.intent.action.SCREEN_ON"

    .line 38
    .line 39
    .line 40
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 41
    move-result-object p2

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 45
    move-result p2

    .line 46
    .line 47
    iget-boolean v0, p0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->isInit:Z

    .line 48
    .line 49
    if-eqz v0, :cond_0

    .line 50
    .line 51
    if-eqz p1, :cond_0

    .line 52
    .line 53
    .line 54
    invoke-interface {p1, p2}, Lcom/tencent/imsdk/common/NetworkInfoCenter$INetworkChangeListener;->onScreenStatusChange(Z)V

    .line 55
    :cond_0
    return-void
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

.method private updateIPType()V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/imsdk/common/SystemUtil;->getSDKVersion()I

    .line 4
    move-result v0

    .line 5
    .line 6
    const/16 v1, 0x17

    .line 7
    .line 8
    if-ge v0, v1, :cond_0

    .line 9
    return-void

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    .line 12
    iput v0, p0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->mIPType:I

    .line 13
    .line 14
    iget-object v0, p0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->mConnectivityManager:Landroid/net/ConnectivityManager;

    .line 15
    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    iget-object v0, p0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->mContext:Landroid/content/Context;

    .line 19
    .line 20
    const-string v1, "connectivity"

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    check-cast v0, Landroid/net/ConnectivityManager;

    .line 27
    .line 28
    iput-object v0, p0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->mConnectivityManager:Landroid/net/ConnectivityManager;

    .line 29
    .line 30
    :cond_1
    iget-object v0, p0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->mConnectivityManager:Landroid/net/ConnectivityManager;

    .line 31
    .line 32
    if-nez v0, :cond_2

    .line 33
    .line 34
    sget-object v0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->TAG:Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    const-string/jumbo v1, "updateIPType, mConnectivityManager is null"

    .line 38
    .line 39
    .line 40
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 41
    return-void

    .line 42
    .line 43
    .line 44
    :cond_2
    :try_start_0
    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetwork()Landroid/net/Network;

    .line 45
    move-result-object v1

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v1}, Landroid/net/ConnectivityManager;->getLinkProperties(Landroid/net/Network;)Landroid/net/LinkProperties;

    .line 49
    move-result-object v0

    .line 50
    .line 51
    if-nez v0, :cond_3

    .line 52
    .line 53
    sget-object v0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->TAG:Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    const-string/jumbo v1, "updateIPType, no linkProperties"

    .line 57
    .line 58
    .line 59
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 60
    return-void

    .line 61
    :catch_0
    move-exception v0

    .line 62
    goto :goto_1

    .line 63
    .line 64
    .line 65
    :cond_3
    invoke-virtual {v0}, Landroid/net/LinkProperties;->getLinkAddresses()Ljava/util/List;

    .line 66
    move-result-object v0

    .line 67
    .line 68
    .line 69
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 70
    move-result-object v0

    .line 71
    .line 72
    .line 73
    :cond_4
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 74
    move-result v1

    .line 75
    .line 76
    if-eqz v1, :cond_6

    .line 77
    .line 78
    .line 79
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 80
    move-result-object v1

    .line 81
    .line 82
    check-cast v1, Landroid/net/LinkAddress;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v1}, Landroid/net/LinkAddress;->getAddress()Ljava/net/InetAddress;

    .line 86
    move-result-object v1

    .line 87
    .line 88
    instance-of v2, v1, Ljava/net/Inet4Address;

    .line 89
    .line 90
    if-eqz v2, :cond_5

    .line 91
    .line 92
    .line 93
    invoke-virtual {v1}, Ljava/net/InetAddress;->isLinkLocalAddress()Z

    .line 94
    move-result v2

    .line 95
    .line 96
    if-nez v2, :cond_5

    .line 97
    .line 98
    iget v1, p0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->mIPType:I

    .line 99
    .line 100
    or-int/lit8 v1, v1, 0x1

    .line 101
    .line 102
    iput v1, p0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->mIPType:I

    .line 103
    goto :goto_0

    .line 104
    .line 105
    :cond_5
    instance-of v2, v1, Ljava/net/Inet6Address;

    .line 106
    .line 107
    if-eqz v2, :cond_4

    .line 108
    .line 109
    .line 110
    invoke-virtual {v1}, Ljava/net/InetAddress;->isLinkLocalAddress()Z

    .line 111
    move-result v1

    .line 112
    .line 113
    if-nez v1, :cond_4

    .line 114
    .line 115
    iget v1, p0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->mIPType:I

    .line 116
    .line 117
    or-int/lit8 v1, v1, 0x2

    .line 118
    .line 119
    iput v1, p0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->mIPType:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 120
    goto :goto_0

    .line 121
    .line 122
    :goto_1
    sget-object v1, Lcom/tencent/imsdk/common/NetworkInfoCenter;->TAG:Ljava/lang/String;

    .line 123
    .line 124
    new-instance v2, Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 128
    .line 129
    .line 130
    const-string/jumbo v3, "updateIPType, e: "

    .line 131
    .line 132
    .line 133
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v0}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    .line 137
    move-result-object v3

    .line 138
    .line 139
    .line 140
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 144
    move-result-object v2

    .line 145
    .line 146
    .line 147
    invoke-static {v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 148
    .line 149
    .line 150
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 151
    .line 152
    :cond_6
    sget-object v0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->TAG:Ljava/lang/String;

    .line 153
    .line 154
    new-instance v1, Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 158
    .line 159
    .line 160
    const-string/jumbo v2, "updateIPType|type:"

    .line 161
    .line 162
    .line 163
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    iget v2, p0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->mIPType:I

    .line 166
    .line 167
    .line 168
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 172
    move-result-object v1

    .line 173
    .line 174
    .line 175
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 176
    return-void
    .line 177
.end method

.method private updateNetworkInterface()V
    .locals 9

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->mCheckNetworkInterface:Z

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    return-void

    .line 6
    .line 7
    :cond_0
    const-wide/16 v0, 0x0

    .line 8
    .line 9
    iput-wide v0, p0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->mWifiNetworkHandle:J

    .line 10
    .line 11
    iput-wide v0, p0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->mXgNetworkHandle:J

    .line 12
    .line 13
    iget-object v0, p0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->mConnectivityManager:Landroid/net/ConnectivityManager;

    .line 14
    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    iget-object v0, p0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->mContext:Landroid/content/Context;

    .line 18
    .line 19
    const-string v1, "connectivity"

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    check-cast v0, Landroid/net/ConnectivityManager;

    .line 26
    .line 27
    iput-object v0, p0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->mConnectivityManager:Landroid/net/ConnectivityManager;

    .line 28
    .line 29
    :cond_1
    iget-object v0, p0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->mConnectivityManager:Landroid/net/ConnectivityManager;

    .line 30
    .line 31
    if-nez v0, :cond_2

    .line 32
    .line 33
    sget-object v0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->TAG:Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    const-string/jumbo v1, "updateNetworkInterface, mConnectivityManager is null"

    .line 37
    .line 38
    .line 39
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 40
    return-void

    .line 41
    .line 42
    .line 43
    :cond_2
    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getAllNetworks()[Landroid/net/Network;

    .line 44
    move-result-object v0

    .line 45
    array-length v1, v0

    .line 46
    const/4 v2, 0x0

    .line 47
    move v3, v2

    .line 48
    .line 49
    :goto_0
    if-ge v3, v1, :cond_7

    .line 50
    .line 51
    aget-object v4, v0, v3

    .line 52
    .line 53
    if-nez v4, :cond_3

    .line 54
    goto :goto_2

    .line 55
    .line 56
    :cond_3
    :try_start_0
    iget-object v5, p0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->mConnectivityManager:Landroid/net/ConnectivityManager;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v5, v4}, Landroid/net/ConnectivityManager;->getNetworkCapabilities(Landroid/net/Network;)Landroid/net/NetworkCapabilities;

    .line 60
    move-result-object v5
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 61
    goto :goto_1

    .line 62
    :catch_0
    move-exception v5

    .line 63
    .line 64
    sget-object v6, Lcom/tencent/imsdk/common/NetworkInfoCenter;->TAG:Ljava/lang/String;

    .line 65
    .line 66
    new-instance v7, Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 70
    .line 71
    .line 72
    const-string/jumbo v8, "updateNetworkInterface, system exception:"

    .line 73
    .line 74
    .line 75
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v5}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    .line 79
    move-result-object v8

    .line 80
    .line 81
    .line 82
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 86
    move-result-object v7

    .line 87
    .line 88
    .line 89
    invoke-static {v6, v7}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 90
    .line 91
    .line 92
    invoke-virtual {v5}, Ljava/lang/Throwable;->printStackTrace()V

    .line 93
    const/4 v5, 0x0

    .line 94
    .line 95
    :goto_1
    if-nez v5, :cond_4

    .line 96
    goto :goto_2

    .line 97
    :cond_4
    const/4 v6, 0x1

    .line 98
    .line 99
    .line 100
    invoke-virtual {v5, v6}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    .line 101
    move-result v6

    .line 102
    .line 103
    const/16 v7, 0xc

    .line 104
    .line 105
    if-eqz v6, :cond_5

    .line 106
    .line 107
    .line 108
    invoke-virtual {v5, v7}, Landroid/net/NetworkCapabilities;->hasCapability(I)Z

    .line 109
    move-result v6

    .line 110
    .line 111
    if-eqz v6, :cond_5

    .line 112
    .line 113
    .line 114
    invoke-static {v4}, Lcom/tencent/imsdk/common/NetworkInfoCenter;->networkToNetId(Landroid/net/Network;)J

    .line 115
    move-result-wide v4

    .line 116
    .line 117
    iput-wide v4, p0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->mWifiNetworkHandle:J

    .line 118
    goto :goto_2

    .line 119
    .line 120
    .line 121
    :cond_5
    invoke-virtual {v5, v2}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    .line 122
    move-result v6

    .line 123
    .line 124
    if-eqz v6, :cond_6

    .line 125
    .line 126
    .line 127
    invoke-virtual {v5, v7}, Landroid/net/NetworkCapabilities;->hasCapability(I)Z

    .line 128
    move-result v5

    .line 129
    .line 130
    if-eqz v5, :cond_6

    .line 131
    .line 132
    .line 133
    invoke-static {v4}, Lcom/tencent/imsdk/common/NetworkInfoCenter;->networkToNetId(Landroid/net/Network;)J

    .line 134
    move-result-wide v4

    .line 135
    .line 136
    iput-wide v4, p0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->mXgNetworkHandle:J

    .line 137
    .line 138
    :cond_6
    :goto_2
    add-int/lit8 v3, v3, 0x1

    .line 139
    goto :goto_0

    .line 140
    .line 141
    :cond_7
    sget-object v0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->TAG:Ljava/lang/String;

    .line 142
    .line 143
    new-instance v1, Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 147
    .line 148
    .line 149
    const-string/jumbo v2, "updateNetworkInterface, wifiNetworkHandle = "

    .line 150
    .line 151
    .line 152
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    iget-wide v2, p0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->mWifiNetworkHandle:J

    .line 155
    .line 156
    .line 157
    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    const-string v2, " xgNetworkHandle = "

    .line 160
    .line 161
    .line 162
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    iget-wide v2, p0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->mXgNetworkHandle:J

    .line 165
    .line 166
    .line 167
    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 171
    move-result-object v1

    .line 172
    .line 173
    .line 174
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 175
    return-void
    .line 176
    .line 177
.end method

.method private updateNetworkSSID()V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
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

.method private updateNetworkType(Landroid/net/NetworkInfo;)V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    if-eqz p1, :cond_8

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/net/NetworkInfo;->isAvailable()Z

    .line 7
    move-result p1

    .line 8
    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    goto/16 :goto_2

    .line 12
    .line 13
    :cond_0
    iget-object p1, p0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->mConnectivityManager:Landroid/net/ConnectivityManager;

    .line 14
    .line 15
    if-nez p1, :cond_1

    .line 16
    .line 17
    iget-object p1, p0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->mContext:Landroid/content/Context;

    .line 18
    .line 19
    const-string v1, "connectivity"

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 23
    move-result-object p1

    .line 24
    .line 25
    check-cast p1, Landroid/net/ConnectivityManager;

    .line 26
    .line 27
    iput-object p1, p0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->mConnectivityManager:Landroid/net/ConnectivityManager;

    .line 28
    .line 29
    :cond_1
    iget-object p1, p0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->mConnectivityManager:Landroid/net/ConnectivityManager;

    .line 30
    .line 31
    if-nez p1, :cond_2

    .line 32
    .line 33
    iput v0, p0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->mNetworkType:I

    .line 34
    return-void

    .line 35
    :cond_2
    const/4 v1, 0x1

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1, v1}, Landroid/net/ConnectivityManager;->getNetworkInfo(I)Landroid/net/NetworkInfo;

    .line 39
    move-result-object p1

    .line 40
    .line 41
    if-eqz p1, :cond_4

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1}, Landroid/net/NetworkInfo;->getState()Landroid/net/NetworkInfo$State;

    .line 45
    move-result-object p1

    .line 46
    .line 47
    if-eqz p1, :cond_4

    .line 48
    .line 49
    sget-object v2, Landroid/net/NetworkInfo$State;->CONNECTED:Landroid/net/NetworkInfo$State;

    .line 50
    .line 51
    if-eq p1, v2, :cond_3

    .line 52
    .line 53
    sget-object v2, Landroid/net/NetworkInfo$State;->CONNECTING:Landroid/net/NetworkInfo$State;

    .line 54
    .line 55
    if-ne p1, v2, :cond_4

    .line 56
    .line 57
    :cond_3
    iput v1, p0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->mNetworkType:I

    .line 58
    return-void

    .line 59
    .line 60
    .line 61
    :cond_4
    invoke-static {}, Lcom/tencent/imsdk/common/SystemUtil;->getSDKVersion()I

    .line 62
    move-result p1

    .line 63
    .line 64
    const/16 v1, 0x1e

    .line 65
    .line 66
    const/16 v2, 0x71

    .line 67
    .line 68
    if-lt p1, v1, :cond_5

    .line 69
    .line 70
    iget-object p1, p0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->mContext:Landroid/content/Context;

    .line 71
    .line 72
    .line 73
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 74
    move-result v1

    .line 75
    .line 76
    .line 77
    invoke-static {}, Landroid/os/Process;->myUid()I

    .line 78
    move-result v3

    .line 79
    .line 80
    const-string v4, "android.permission.READ_PHONE_STATE"

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1, v4, v1, v3}, Landroid/content/Context;->checkPermission(Ljava/lang/String;II)I

    .line 84
    move-result p1

    .line 85
    .line 86
    if-eqz p1, :cond_5

    .line 87
    .line 88
    iget-boolean p1, p0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->mNetworkConnected:Z

    .line 89
    .line 90
    if-eqz p1, :cond_7

    .line 91
    .line 92
    iput v2, p0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->mNetworkType:I

    .line 93
    return-void

    .line 94
    .line 95
    :cond_5
    iget-object p1, p0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->mContext:Landroid/content/Context;

    .line 96
    .line 97
    .line 98
    const-string/jumbo v1, "phone"

    .line 99
    .line 100
    .line 101
    invoke-virtual {p1, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 102
    move-result-object p1

    .line 103
    .line 104
    check-cast p1, Landroid/telephony/TelephonyManager;

    .line 105
    .line 106
    if-nez p1, :cond_6

    .line 107
    .line 108
    iput v0, p0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->mNetworkType:I

    .line 109
    return-void

    .line 110
    .line 111
    .line 112
    :cond_6
    :try_start_0
    invoke-virtual {p1}, Landroid/telephony/TelephonyManager;->getNetworkType()I

    .line 113
    move-result p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 114
    goto :goto_0

    .line 115
    :catch_0
    move-exception p1

    .line 116
    .line 117
    .line 118
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 119
    .line 120
    sget-object v1, Lcom/tencent/imsdk/common/NetworkInfoCenter;->TAG:Ljava/lang/String;

    .line 121
    .line 122
    new-instance v3, Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 126
    .line 127
    const-string v4, "getNetworkType:"

    .line 128
    .line 129
    .line 130
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {p1}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    .line 134
    move-result-object p1

    .line 135
    .line 136
    .line 137
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 141
    move-result-object p1

    .line 142
    .line 143
    .line 144
    invoke-static {v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 145
    move p1, v0

    .line 146
    .line 147
    .line 148
    :goto_0
    packed-switch p1, :pswitch_data_0

    .line 149
    .line 150
    iput v0, p0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->mNetworkType:I

    .line 151
    goto :goto_1

    .line 152
    .line 153
    :pswitch_0
    const/16 p1, 0x73

    .line 154
    .line 155
    iput p1, p0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->mNetworkType:I

    .line 156
    goto :goto_1

    .line 157
    .line 158
    :pswitch_1
    const/16 p1, 0x72

    .line 159
    .line 160
    iput p1, p0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->mNetworkType:I

    .line 161
    goto :goto_1

    .line 162
    .line 163
    :pswitch_2
    iput v2, p0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->mNetworkType:I

    .line 164
    goto :goto_1

    .line 165
    .line 166
    :pswitch_3
    const/16 p1, 0x70

    .line 167
    .line 168
    iput p1, p0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->mNetworkType:I

    .line 169
    goto :goto_1

    .line 170
    .line 171
    :pswitch_4
    const/16 p1, 0x6f

    .line 172
    .line 173
    iput p1, p0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->mNetworkType:I

    .line 174
    goto :goto_1

    .line 175
    .line 176
    :pswitch_5
    const/16 p1, 0x6e

    .line 177
    .line 178
    iput p1, p0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->mNetworkType:I

    .line 179
    goto :goto_1

    .line 180
    .line 181
    :pswitch_6
    const/16 p1, 0x6d

    .line 182
    .line 183
    iput p1, p0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->mNetworkType:I

    .line 184
    goto :goto_1

    .line 185
    .line 186
    :pswitch_7
    const/16 p1, 0x6c

    .line 187
    .line 188
    iput p1, p0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->mNetworkType:I

    .line 189
    goto :goto_1

    .line 190
    .line 191
    :pswitch_8
    const/16 p1, 0x6b

    .line 192
    .line 193
    iput p1, p0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->mNetworkType:I

    .line 194
    goto :goto_1

    .line 195
    .line 196
    :pswitch_9
    const/16 p1, 0x6a

    .line 197
    .line 198
    iput p1, p0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->mNetworkType:I

    .line 199
    goto :goto_1

    .line 200
    .line 201
    :pswitch_a
    const/16 p1, 0x69

    .line 202
    .line 203
    iput p1, p0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->mNetworkType:I

    .line 204
    goto :goto_1

    .line 205
    .line 206
    :pswitch_b
    const/16 p1, 0x68

    .line 207
    .line 208
    iput p1, p0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->mNetworkType:I

    .line 209
    goto :goto_1

    .line 210
    .line 211
    :pswitch_c
    const/16 p1, 0x67

    .line 212
    .line 213
    iput p1, p0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->mNetworkType:I

    .line 214
    goto :goto_1

    .line 215
    .line 216
    :pswitch_d
    const/16 p1, 0x66

    .line 217
    .line 218
    iput p1, p0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->mNetworkType:I

    .line 219
    goto :goto_1

    .line 220
    .line 221
    :pswitch_e
    const/16 p1, 0x65

    .line 222
    .line 223
    iput p1, p0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->mNetworkType:I

    .line 224
    :cond_7
    :goto_1
    return-void

    .line 225
    .line 226
    :cond_8
    :goto_2
    iput v0, p0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->mNetworkType:I

    .line 227
    return-void

    .line 228
    nop

    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private updateProviderName()V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
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


# virtual methods
.method public getIPType()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->mIPType:I

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

.method public getInitializeCostTime()J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->mInitializeCostTime:J

    .line 3
    return-wide v0
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

.method public getNetworkID()Ljava/lang/String;
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/tencent/imsdk/common/NetworkInfoCenter;->getNetworkType()I

    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    .line 7
    if-ne v1, v0, :cond_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/tencent/imsdk/common/NetworkInfoCenter;->getNetworkSSID()Ljava/lang/String;

    .line 11
    move-result-object v0

    .line 12
    return-object v0

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-direct {p0}, Lcom/tencent/imsdk/common/NetworkInfoCenter;->getProviderName()Ljava/lang/String;

    .line 16
    move-result-object v0

    .line 17
    return-object v0
.end method

.method public getNetworkSSID()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->mNetworkSSID:Ljava/lang/String;

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

.method public getNetworkType()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->mNetworkType:I

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

.method public getWifiNetworkHandle()J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->mWifiNetworkHandle:J

    .line 3
    return-wide v0
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

.method public getXgNetworkHandle()J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->mXgNetworkHandle:J

    .line 3
    return-wide v0
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

.method public init(Landroid/content/Context;Lcom/tencent/imsdk/common/NetworkInfoCenter$INetworkChangeListener;)V
    .locals 4

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->isInit:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    sget-object p1, Lcom/tencent/imsdk/common/NetworkInfoCenter;->TAG:Ljava/lang/String;

    .line 7
    .line 8
    const-string p2, "NetworkInfoCenter has init"

    .line 9
    .line 10
    .line 11
    invoke-static {p1, p2}, Lcom/tencent/imsdk/common/IMLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    return-void

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 16
    move-result-wide v0

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 20
    move-result-object v2

    .line 21
    .line 22
    iput-object v2, p0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->mContext:Landroid/content/Context;

    .line 23
    .line 24
    new-instance v2, Ljava/lang/ref/WeakReference;

    .line 25
    .line 26
    .line 27
    invoke-direct {v2, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 28
    .line 29
    iput-object v2, p0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->mListener:Ljava/lang/ref/WeakReference;

    .line 30
    .line 31
    new-instance p2, Landroid/content/IntentFilter;

    .line 32
    .line 33
    .line 34
    invoke-direct {p2}, Landroid/content/IntentFilter;-><init>()V

    .line 35
    .line 36
    const-string v2, "android.net.conn.CONNECTIVITY_CHANGE"

    .line 37
    .line 38
    .line 39
    invoke-virtual {p2, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 40
    .line 41
    const-string v2, "android.net.wifi.STATE_CHANGE"

    .line 42
    .line 43
    .line 44
    invoke-virtual {p2, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 45
    .line 46
    const-string v2, "android.net.wifi.WIFI_STATE_CHANGED"

    .line 47
    .line 48
    .line 49
    invoke-virtual {p2, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 50
    .line 51
    const-string v2, "android.intent.action.SCREEN_ON"

    .line 52
    .line 53
    .line 54
    invoke-virtual {p2, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 55
    .line 56
    const-string v2, "android.intent.action.SCREEN_OFF"

    .line 57
    .line 58
    .line 59
    invoke-virtual {p2, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 60
    .line 61
    iget-object v2, p0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->mContext:Landroid/content/Context;

    .line 62
    const/4 v3, 0x1

    .line 63
    .line 64
    if-eqz v2, :cond_1

    .line 65
    .line 66
    .line 67
    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 68
    move-result-object v2

    .line 69
    .line 70
    .line 71
    invoke-virtual {v2, p0, p2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 72
    .line 73
    iput-boolean v3, p0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->isRegisterReceiver:Z

    .line 74
    .line 75
    .line 76
    :cond_1
    invoke-static {}, Lcom/tencent/imsdk/common/SystemUtil;->isQuicPluginLibraryLoaded()Z

    .line 77
    move-result p2

    .line 78
    .line 79
    iput-boolean p2, p0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->mCheckNetworkInterface:Z

    .line 80
    .line 81
    const-string p2, "connectivity"

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 85
    move-result-object p1

    .line 86
    .line 87
    check-cast p1, Landroid/net/ConnectivityManager;

    .line 88
    .line 89
    iput-object p1, p0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->mConnectivityManager:Landroid/net/ConnectivityManager;

    .line 90
    .line 91
    if-eqz p1, :cond_2

    .line 92
    .line 93
    .line 94
    :try_start_0
    invoke-virtual {p1}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    .line 95
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 96
    goto :goto_0

    .line 97
    :catch_0
    move-exception p1

    .line 98
    .line 99
    .line 100
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 101
    const/4 p1, 0x0

    .line 102
    .line 103
    .line 104
    :goto_0
    invoke-direct {p0, p1}, Lcom/tencent/imsdk/common/NetworkInfoCenter;->updateNetworkType(Landroid/net/NetworkInfo;)V

    .line 105
    .line 106
    .line 107
    :cond_2
    invoke-direct {p0}, Lcom/tencent/imsdk/common/NetworkInfoCenter;->updateNetworkSSID()V

    .line 108
    .line 109
    .line 110
    invoke-direct {p0}, Lcom/tencent/imsdk/common/NetworkInfoCenter;->updateProviderName()V

    .line 111
    .line 112
    .line 113
    invoke-direct {p0}, Lcom/tencent/imsdk/common/NetworkInfoCenter;->updateIPType()V

    .line 114
    .line 115
    .line 116
    invoke-direct {p0}, Lcom/tencent/imsdk/common/NetworkInfoCenter;->updateNetworkInterface()V

    .line 117
    .line 118
    .line 119
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 120
    move-result-wide p1

    .line 121
    sub-long/2addr p1, v0

    .line 122
    .line 123
    iput-wide p1, p0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->mInitializeCostTime:J

    .line 124
    .line 125
    iput-boolean v3, p0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->isInit:Z

    .line 126
    return-void
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

.method public isNetworkConnected()Z
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->mConnectivityManager:Landroid/net/ConnectivityManager;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    iget-object v0, p0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->mContext:Landroid/content/Context;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    return v1

    .line 11
    .line 12
    :cond_0
    const-string v2, "connectivity"

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    check-cast v0, Landroid/net/ConnectivityManager;

    .line 19
    .line 20
    iput-object v0, p0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->mConnectivityManager:Landroid/net/ConnectivityManager;

    .line 21
    .line 22
    :cond_1
    iget-object v0, p0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->mConnectivityManager:Landroid/net/ConnectivityManager;

    .line 23
    .line 24
    if-nez v0, :cond_2

    .line 25
    .line 26
    sget-object v0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->TAG:Ljava/lang/String;

    .line 27
    .line 28
    const-string v2, "isNetworkConnected, mConnectivityManager is null"

    .line 29
    .line 30
    .line 31
    invoke-static {v0, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 32
    return v1

    .line 33
    .line 34
    .line 35
    :cond_2
    :try_start_0
    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    .line 36
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 37
    goto :goto_0

    .line 38
    :catch_0
    move-exception v0

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 42
    const/4 v0, 0x0

    .line 43
    .line 44
    :goto_0
    if-eqz v0, :cond_4

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z

    .line 48
    move-result v0

    .line 49
    .line 50
    if-eqz v0, :cond_3

    .line 51
    const/4 v0, 0x1

    .line 52
    return v0

    .line 53
    :cond_3
    return v1

    .line 54
    .line 55
    :cond_4
    sget-object v0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->TAG:Ljava/lang/String;

    .line 56
    .line 57
    const-string v2, "isNetworkConnected, activeNetwork is null"

    .line 58
    .line 59
    .line 60
    invoke-static {v0, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 61
    return v1
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

.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .line 1
    .line 2
    if-nez p2, :cond_0

    .line 3
    .line 4
    sget-object p1, Lcom/tencent/imsdk/common/NetworkInfoCenter;->TAG:Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    const-string/jumbo p2, "receive broadcast intent == null"

    .line 8
    .line 9
    .line 10
    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 11
    return-void

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    sget-object p1, Lcom/tencent/imsdk/common/NetworkInfoCenter;->TAG:Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    const-string/jumbo p2, "receive broadcast intent.getAction == null"

    .line 23
    .line 24
    .line 25
    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 26
    return-void

    .line 27
    .line 28
    :cond_1
    const-string v1, "android.net.conn.CONNECTIVITY_CHANGE"

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    move-result v1

    .line 33
    .line 34
    if-nez v1, :cond_2

    .line 35
    .line 36
    const-string v1, "android.net.wifi.STATE_CHANGE"

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 40
    move-result v1

    .line 41
    .line 42
    if-nez v1, :cond_2

    .line 43
    .line 44
    const-string v1, "android.net.wifi.WIFI_STATE_CHANGED"

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 48
    move-result v1

    .line 49
    .line 50
    if-eqz v1, :cond_3

    .line 51
    .line 52
    .line 53
    :cond_2
    invoke-direct {p0, p1, p2}, Lcom/tencent/imsdk/common/NetworkInfoCenter;->onNetworkChanged(Landroid/content/Context;Landroid/content/Intent;)V

    .line 54
    .line 55
    :cond_3
    const-string v1, "android.intent.action.SCREEN_ON"

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 59
    move-result v1

    .line 60
    .line 61
    if-nez v1, :cond_5

    .line 62
    .line 63
    const-string v1, "android.intent.action.SCREEN_OFF"

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 67
    move-result v0

    .line 68
    .line 69
    if-eqz v0, :cond_4

    .line 70
    goto :goto_0

    .line 71
    :cond_4
    return-void

    .line 72
    .line 73
    .line 74
    :cond_5
    :goto_0
    invoke-direct {p0, p1, p2}, Lcom/tencent/imsdk/common/NetworkInfoCenter;->onScreenStatusChange(Landroid/content/Context;Landroid/content/Intent;)V

    .line 75
    return-void
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

.method public uninit()V
    .locals 2

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->isRegisterReceiver:Z

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->mContext:Landroid/content/Context;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 17
    .line 18
    iput-boolean v1, p0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->isRegisterReceiver:Z

    .line 19
    .line 20
    :cond_0
    iput-boolean v1, p0, Lcom/tencent/imsdk/common/NetworkInfoCenter;->isInit:Z

    .line 21
    return-void
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
