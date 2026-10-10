.class public Lcn/jiguang/privates/core/business/active/JActiveBusiness;
.super Ljava/lang/Object;
.source "JActiveBusiness.java"


# static fields
.field private static final TAG:Ljava/lang/String; = "JActiveBusiness"

.field private static volatile instance:Lcn/jiguang/privates/core/business/active/JActiveBusiness;


# instance fields
.field private lastToBackgroundTime:J

.field private lastToForegroundTime:J


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
    .line 18
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    const-wide/16 v0, 0x0

    .line 6
    .line 7
    iput-wide v0, p0, Lcn/jiguang/privates/core/business/active/JActiveBusiness;->lastToForegroundTime:J

    .line 8
    .line 9
    iput-wide v0, p0, Lcn/jiguang/privates/core/business/active/JActiveBusiness;->lastToBackgroundTime:J

    .line 10
    return-void
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public static getInstance()Lcn/jiguang/privates/core/business/active/JActiveBusiness;
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcn/jiguang/privates/core/business/active/JActiveBusiness;->instance:Lcn/jiguang/privates/core/business/active/JActiveBusiness;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    const-class v0, Lcn/jiguang/privates/core/business/active/JActiveBusiness;

    .line 7
    monitor-enter v0

    .line 8
    .line 9
    :try_start_0
    new-instance v1, Lcn/jiguang/privates/core/business/active/JActiveBusiness;

    .line 10
    .line 11
    .line 12
    invoke-direct {v1}, Lcn/jiguang/privates/core/business/active/JActiveBusiness;-><init>()V

    .line 13
    .line 14
    sput-object v1, Lcn/jiguang/privates/core/business/active/JActiveBusiness;->instance:Lcn/jiguang/privates/core/business/active/JActiveBusiness;

    .line 15
    monitor-exit v0

    .line 16
    goto :goto_0

    .line 17
    :catchall_0
    move-exception v1

    .line 18
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    throw v1

    .line 20
    .line 21
    :cond_0
    :goto_0
    sget-object v0, Lcn/jiguang/privates/core/business/active/JActiveBusiness;->instance:Lcn/jiguang/privates/core/business/active/JActiveBusiness;

    .line 22
    return-object v0
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
    .line 76
    .line 77
.end method


# virtual methods
.method public toBackground(Landroid/content/Context;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lcn/jiguang/privates/core/cache/JCoreConfig;->getConnectState(Landroid/content/Context;)Z

    .line 4
    move-result p1

    .line 5
    .line 6
    if-nez p1, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 11
    move-result-wide v0

    .line 12
    .line 13
    iput-wide v0, p0, Lcn/jiguang/privates/core/business/active/JActiveBusiness;->lastToBackgroundTime:J

    .line 14
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public toForeground(Landroid/content/Context;)V
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lcn/jiguang/privates/core/cache/JCoreConfig;->getConnectState(Landroid/content/Context;)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    goto :goto_0

    .line 8
    .line 9
    :cond_0
    iget-wide v0, p0, Lcn/jiguang/privates/core/business/active/JActiveBusiness;->lastToBackgroundTime:J

    .line 10
    .line 11
    const-wide/16 v2, 0x0

    .line 12
    .line 13
    cmp-long v0, v0, v2

    .line 14
    .line 15
    if-nez v0, :cond_1

    .line 16
    goto :goto_0

    .line 17
    .line 18
    .line 19
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 20
    move-result-wide v0

    .line 21
    .line 22
    iput-wide v0, p0, Lcn/jiguang/privates/core/business/active/JActiveBusiness;->lastToForegroundTime:J

    .line 23
    .line 24
    iget-wide v2, p0, Lcn/jiguang/privates/core/business/active/JActiveBusiness;->lastToBackgroundTime:J

    .line 25
    sub-long/2addr v0, v2

    .line 26
    .line 27
    .line 28
    invoke-static {}, Lcn/jiguang/privates/core/global/JCoreGlobal;->getHeartbeatInterval()J

    .line 29
    move-result-wide v2

    .line 30
    .line 31
    const-wide/16 v4, 0x2

    .line 32
    div-long/2addr v2, v4

    .line 33
    .line 34
    cmp-long v0, v0, v2

    .line 35
    .line 36
    if-gez v0, :cond_2

    .line 37
    :goto_0
    return-void

    .line 38
    .line 39
    .line 40
    :cond_2
    invoke-static {}, Lcn/jiguang/privates/core/business/connect/JConnectBusiness;->getInstance()Lcn/jiguang/privates/core/business/connect/JConnectBusiness;

    .line 41
    move-result-object v0

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Lcn/jiguang/privates/core/business/connect/JConnectBusiness;->isTcpConnecting()Z

    .line 45
    move-result v0

    .line 46
    .line 47
    const-string v1, "JActiveBusiness"

    .line 48
    .line 49
    if-nez v0, :cond_3

    .line 50
    .line 51
    .line 52
    const-string/jumbo v0, "re connect"

    .line 53
    .line 54
    .line 55
    invoke-static {v1, v0}, Lcn/jiguang/privates/common/log/JCommonLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    .line 57
    const/16 v0, 0xbb1

    .line 58
    const/4 v1, 0x0

    .line 59
    .line 60
    .line 61
    invoke-static {p1, v0, v1}, Lcn/jiguang/privates/common/api/JCommonPrivatesApi;->sendMessageToRemoteProcess(Landroid/content/Context;ILandroid/os/Bundle;)V

    .line 62
    .line 63
    const/16 v0, 0xbb2

    .line 64
    .line 65
    .line 66
    invoke-static {p1, v0, v1}, Lcn/jiguang/privates/common/api/JCommonPrivatesApi;->sendMessageToRemoteProcess(Landroid/content/Context;ILandroid/os/Bundle;)V

    .line 67
    return-void

    .line 68
    .line 69
    .line 70
    :cond_3
    const-string/jumbo v0, "re heartbeat"

    .line 71
    .line 72
    .line 73
    invoke-static {v1, v0}, Lcn/jiguang/privates/common/log/JCommonLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    invoke-static {}, Lcn/jiguang/privates/core/business/connect/JConnectBusiness;->getInstance()Lcn/jiguang/privates/core/business/connect/JConnectBusiness;

    .line 77
    move-result-object v0

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0, p1}, Lcn/jiguang/privates/core/business/connect/JConnectBusiness;->stopHeartbeat(Landroid/content/Context;)V

    .line 81
    .line 82
    .line 83
    invoke-static {}, Lcn/jiguang/privates/core/business/connect/JConnectBusiness;->getInstance()Lcn/jiguang/privates/core/business/connect/JConnectBusiness;

    .line 84
    move-result-object v0

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0, p1}, Lcn/jiguang/privates/core/business/connect/JConnectBusiness;->startHeartbeat(Landroid/content/Context;)V

    .line 88
    return-void
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
    .line 215
.end method
