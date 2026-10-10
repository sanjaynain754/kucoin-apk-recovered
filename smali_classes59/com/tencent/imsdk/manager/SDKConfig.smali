.class public Lcom/tencent/imsdk/manager/SDKConfig;
.super Ljava/lang/Object;
.source "SDKConfig.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/imsdk/manager/SDKConfig$DeviceInfo;,
        Lcom/tencent/imsdk/manager/SDKConfig$NetworkInfo;,
        Lcom/tencent/imsdk/manager/SDKConfig$ProxyInfo;,
        Lcom/tencent/imsdk/manager/SDKConfig$DatabaseEncryptInfo;,
        Lcom/tencent/imsdk/manager/SDKConfig$PacketRetryInfo;,
        Lcom/tencent/imsdk/manager/SDKConfig$LogSetting;
    }
.end annotation


# instance fields
.field public appName:Ljava/lang/String;

.field public applicationID:I

.field public databaseEncryptInfo:Lcom/tencent/imsdk/manager/SDKConfig$DatabaseEncryptInfo;

.field public deviceInfo:Lcom/tencent/imsdk/manager/SDKConfig$DeviceInfo;

.field public disableHttpRequest:Z

.field public enableQuic:Z

.field public isIPv6Prior:Z

.field public isTestEnvironment:Z

.field public logSetting:Lcom/tencent/imsdk/manager/SDKConfig$LogSetting;

.field public networkInfo:Lcom/tencent/imsdk/manager/SDKConfig$NetworkInfo;

.field public numberUIPlatform:I

.field public packageName:Ljava/lang/String;

.field public packetRetryInfo:Lcom/tencent/imsdk/manager/SDKConfig$PacketRetryInfo;

.field public proxyInfo:Lcom/tencent/imsdk/manager/SDKConfig$ProxyInfo;

.field public sdkAppId:J

.field public sdkInitPath:Ljava/lang/String;

.field public sdkInstanceType:J

.field public serverType:Ljava/lang/Integer;

.field public stringUIPlatform:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    const-wide/16 v0, 0x0

    .line 6
    .line 7
    iput-wide v0, p0, Lcom/tencent/imsdk/manager/SDKConfig;->sdkAppId:J

    .line 8
    .line 9
    const-string v2, ""

    .line 10
    .line 11
    iput-object v2, p0, Lcom/tencent/imsdk/manager/SDKConfig;->sdkInitPath:Ljava/lang/String;

    .line 12
    .line 13
    iput-wide v0, p0, Lcom/tencent/imsdk/manager/SDKConfig;->sdkInstanceType:J

    .line 14
    const/4 v0, 0x0

    .line 15
    .line 16
    iput-boolean v0, p0, Lcom/tencent/imsdk/manager/SDKConfig;->isTestEnvironment:Z

    .line 17
    .line 18
    iput-boolean v0, p0, Lcom/tencent/imsdk/manager/SDKConfig;->enableQuic:Z

    .line 19
    .line 20
    iput-boolean v0, p0, Lcom/tencent/imsdk/manager/SDKConfig;->isIPv6Prior:Z

    .line 21
    .line 22
    iput-object v2, p0, Lcom/tencent/imsdk/manager/SDKConfig;->stringUIPlatform:Ljava/lang/String;

    .line 23
    .line 24
    iput v0, p0, Lcom/tencent/imsdk/manager/SDKConfig;->numberUIPlatform:I

    .line 25
    const/4 v1, 0x0

    .line 26
    .line 27
    iput-object v1, p0, Lcom/tencent/imsdk/manager/SDKConfig;->serverType:Ljava/lang/Integer;

    .line 28
    .line 29
    new-instance v1, Lcom/tencent/imsdk/manager/SDKConfig$DeviceInfo;

    .line 30
    .line 31
    .line 32
    invoke-direct {v1}, Lcom/tencent/imsdk/manager/SDKConfig$DeviceInfo;-><init>()V

    .line 33
    .line 34
    iput-object v1, p0, Lcom/tencent/imsdk/manager/SDKConfig;->deviceInfo:Lcom/tencent/imsdk/manager/SDKConfig$DeviceInfo;

    .line 35
    .line 36
    new-instance v1, Lcom/tencent/imsdk/manager/SDKConfig$NetworkInfo;

    .line 37
    .line 38
    .line 39
    invoke-direct {v1}, Lcom/tencent/imsdk/manager/SDKConfig$NetworkInfo;-><init>()V

    .line 40
    .line 41
    iput-object v1, p0, Lcom/tencent/imsdk/manager/SDKConfig;->networkInfo:Lcom/tencent/imsdk/manager/SDKConfig$NetworkInfo;

    .line 42
    .line 43
    new-instance v1, Lcom/tencent/imsdk/manager/SDKConfig$ProxyInfo;

    .line 44
    .line 45
    .line 46
    invoke-direct {v1}, Lcom/tencent/imsdk/manager/SDKConfig$ProxyInfo;-><init>()V

    .line 47
    .line 48
    iput-object v1, p0, Lcom/tencent/imsdk/manager/SDKConfig;->proxyInfo:Lcom/tencent/imsdk/manager/SDKConfig$ProxyInfo;

    .line 49
    .line 50
    new-instance v1, Lcom/tencent/imsdk/manager/SDKConfig$DatabaseEncryptInfo;

    .line 51
    .line 52
    .line 53
    invoke-direct {v1}, Lcom/tencent/imsdk/manager/SDKConfig$DatabaseEncryptInfo;-><init>()V

    .line 54
    .line 55
    iput-object v1, p0, Lcom/tencent/imsdk/manager/SDKConfig;->databaseEncryptInfo:Lcom/tencent/imsdk/manager/SDKConfig$DatabaseEncryptInfo;

    .line 56
    .line 57
    new-instance v1, Lcom/tencent/imsdk/manager/SDKConfig$PacketRetryInfo;

    .line 58
    .line 59
    .line 60
    invoke-direct {v1}, Lcom/tencent/imsdk/manager/SDKConfig$PacketRetryInfo;-><init>()V

    .line 61
    .line 62
    iput-object v1, p0, Lcom/tencent/imsdk/manager/SDKConfig;->packetRetryInfo:Lcom/tencent/imsdk/manager/SDKConfig$PacketRetryInfo;

    .line 63
    .line 64
    new-instance v1, Lcom/tencent/imsdk/manager/SDKConfig$LogSetting;

    .line 65
    .line 66
    .line 67
    invoke-direct {v1}, Lcom/tencent/imsdk/manager/SDKConfig$LogSetting;-><init>()V

    .line 68
    .line 69
    iput-object v1, p0, Lcom/tencent/imsdk/manager/SDKConfig;->logSetting:Lcom/tencent/imsdk/manager/SDKConfig$LogSetting;

    .line 70
    .line 71
    iput-object v2, p0, Lcom/tencent/imsdk/manager/SDKConfig;->packageName:Ljava/lang/String;

    .line 72
    .line 73
    iput-object v2, p0, Lcom/tencent/imsdk/manager/SDKConfig;->appName:Ljava/lang/String;

    .line 74
    .line 75
    iput v0, p0, Lcom/tencent/imsdk/manager/SDKConfig;->applicationID:I

    .line 76
    .line 77
    iput-boolean v0, p0, Lcom/tencent/imsdk/manager/SDKConfig;->disableHttpRequest:Z

    .line 78
    return-void
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

.method public static getAppCpuUsage()F
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/imsdk/common/SystemUtil;->getAppCpuUsage()F

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
.end method

.method public static getAppMemoryUsage()F
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/imsdk/common/SystemUtil;->getAppMemory()F

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
.end method

.method public static getDeviceID()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/imsdk/common/SystemUtil;->getDeviceID()Ljava/lang/String;

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
.end method

.method public static getSysCpuUsage()F
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/imsdk/common/SystemUtil;->getSysCpuUsage()F

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
.end method
