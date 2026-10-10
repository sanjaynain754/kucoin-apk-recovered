.class public final Lcom/tencent/rmonitor/sla/AttaEventReportTask;
.super Lcom/tencent/bugly/common/reporter/upload/QAPMUpload;
.source "BUGLY"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/rmonitor/sla/AttaEventReportTask$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0018\u0000 \u001a2\u00020\u00012\u00020\u0002:\u0001\u001aB\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0002\u0010\u0008J\u0018\u0010\t\u001a\u0004\u0018\u00010\n2\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J$\u0010\u000b\u001a\u00020\u000c2\n\u0010\r\u001a\u00060\u000ej\u0002`\u000f2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\nH\u0002J\u0012\u0010\u0012\u001a\u00020\n2\u0008\u0010\u0011\u001a\u0004\u0018\u00010\nH\u0002J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0006\u0010\u0016\u001a\u00020\u0017J\u0008\u0010\u0018\u001a\u00020\u000cH\u0016J\u0008\u0010\u0019\u001a\u00020\u000cH\u0016R\u0014\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"
    }
    d2 = {
        "Lcom/tencent/rmonitor/sla/AttaEventReportTask;",
        "Lcom/tencent/bugly/common/reporter/upload/QAPMUpload;",
        "Ljava/lang/Runnable;",
        "url",
        "Ljava/net/URL;",
        "eventList",
        "",
        "Lcom/tencent/rmonitor/sla/AttaEvent;",
        "(Ljava/net/URL;Ljava/util/List;)V",
        "buildAttaBody",
        "",
        "buildAttaBodyInternal",
        "",
        "builder",
        "Ljava/lang/StringBuilder;",
        "Lkotlin/text/StringBuilder;",
        "key",
        "value",
        "dealValue",
        "getFormatTime",
        "timeInMillis",
        "",
        "report",
        "",
        "request",
        "run",
        "Companion",
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
.field private static final ATTA_ID:Ljava/lang/String; = "08e00055686"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final ATTA_TOKEN:Ljava/lang/String; = "8666841551"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final Companion:Lcom/tencent/rmonitor/sla/AttaEventReportTask$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final TAG:Ljava/lang/String; = "RMonitor_sla_AttaEventReportTask"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final TIME_FORMAT:Ljava/text/SimpleDateFormat;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field private final eventList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/tencent/rmonitor/sla/AttaEvent;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/rmonitor/sla/AttaEventReportTask$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/tencent/rmonitor/sla/AttaEventReportTask$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/tencent/rmonitor/sla/AttaEventReportTask;->Companion:Lcom/tencent/rmonitor/sla/AttaEventReportTask$Companion;

    .line 9
    .line 10
    new-instance v0, Ljava/text/SimpleDateFormat;

    .line 11
    .line 12
    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 13
    .line 14
    const-string v2, "yyyy-MM-dd HH:mm:ss.SSS"

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, v2, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 18
    .line 19
    sput-object v0, Lcom/tencent/rmonitor/sla/AttaEventReportTask;->TIME_FORMAT:Ljava/text/SimpleDateFormat;

    .line 20
    return-void
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
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
.end method

.method public constructor <init>(Ljava/net/URL;Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/net/URL;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/net/URL;",
            "Ljava/util/List<",
            "Lcom/tencent/rmonitor/sla/AttaEvent;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "url"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "eventList"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0, p1}, Lcom/tencent/bugly/common/reporter/upload/QAPMUpload;-><init>(Ljava/net/URL;)V

    .line 14
    .line 15
    iput-object p2, p0, Lcom/tencent/rmonitor/sla/AttaEventReportTask;->eventList:Ljava/util/List;

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
.end method

.method private final buildAttaBody(Ljava/util/List;)Ljava/lang/String;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/tencent/rmonitor/sla/AttaEvent;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    return-object v1

    .line 9
    .line 10
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const/16 v2, 0x12c

    .line 13
    .line 14
    .line 15
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 16
    .line 17
    new-instance v2, Lorg/json/JSONArray;

    .line 18
    .line 19
    .line 20
    invoke-direct {v2}, Lorg/json/JSONArray;-><init>()V

    .line 21
    .line 22
    .line 23
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 24
    move-result-object p1

    .line 25
    .line 26
    .line 27
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    move-result v3

    .line 29
    .line 30
    if-eqz v3, :cond_1

    .line 31
    .line 32
    .line 33
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    move-result-object v3

    .line 35
    .line 36
    check-cast v3, Lcom/tencent/rmonitor/sla/AttaEvent;

    .line 37
    const/4 v4, 0x0

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v3}, Lcom/tencent/rmonitor/sla/AttaEvent;->getAppVersion()Ljava/lang/String;

    .line 44
    move-result-object v4

    .line 45
    .line 46
    .line 47
    invoke-direct {p0, v4}, Lcom/tencent/rmonitor/sla/AttaEventReportTask;->dealValue(Ljava/lang/String;)Ljava/lang/String;

    .line 48
    move-result-object v4

    .line 49
    .line 50
    const-string v5, "app_version"

    .line 51
    .line 52
    .line 53
    invoke-direct {p0, v0, v5, v4}, Lcom/tencent/rmonitor/sla/AttaEventReportTask;->buildAttaBodyInternal(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v3}, Lcom/tencent/rmonitor/sla/AttaEvent;->getAppName()Ljava/lang/String;

    .line 57
    move-result-object v4

    .line 58
    .line 59
    .line 60
    invoke-direct {p0, v4}, Lcom/tencent/rmonitor/sla/AttaEventReportTask;->dealValue(Ljava/lang/String;)Ljava/lang/String;

    .line 61
    move-result-object v4

    .line 62
    .line 63
    const-string v5, "app_name"

    .line 64
    .line 65
    .line 66
    invoke-direct {p0, v0, v5, v4}, Lcom/tencent/rmonitor/sla/AttaEventReportTask;->buildAttaBodyInternal(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v3}, Lcom/tencent/rmonitor/sla/AttaEvent;->getAppBundleId()Ljava/lang/String;

    .line 70
    move-result-object v4

    .line 71
    .line 72
    .line 73
    invoke-direct {p0, v4}, Lcom/tencent/rmonitor/sla/AttaEventReportTask;->dealValue(Ljava/lang/String;)Ljava/lang/String;

    .line 74
    move-result-object v4

    .line 75
    .line 76
    const-string v5, "app_bundle_id"

    .line 77
    .line 78
    .line 79
    invoke-direct {p0, v0, v5, v4}, Lcom/tencent/rmonitor/sla/AttaEventReportTask;->buildAttaBodyInternal(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v3}, Lcom/tencent/rmonitor/sla/AttaEvent;->getAppKey()Ljava/lang/String;

    .line 83
    move-result-object v4

    .line 84
    .line 85
    .line 86
    invoke-direct {p0, v4}, Lcom/tencent/rmonitor/sla/AttaEventReportTask;->dealValue(Ljava/lang/String;)Ljava/lang/String;

    .line 87
    move-result-object v4

    .line 88
    .line 89
    const-string v5, "app_key"

    .line 90
    .line 91
    .line 92
    invoke-direct {p0, v0, v5, v4}, Lcom/tencent/rmonitor/sla/AttaEventReportTask;->buildAttaBodyInternal(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v3}, Lcom/tencent/rmonitor/sla/AttaEvent;->getClientType()Ljava/lang/String;

    .line 96
    move-result-object v4

    .line 97
    .line 98
    const-string v5, "client_type"

    .line 99
    .line 100
    .line 101
    invoke-direct {p0, v0, v5, v4}, Lcom/tencent/rmonitor/sla/AttaEventReportTask;->buildAttaBodyInternal(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v3}, Lcom/tencent/rmonitor/sla/AttaEvent;->getUserId()Ljava/lang/String;

    .line 105
    move-result-object v4

    .line 106
    .line 107
    .line 108
    invoke-direct {p0, v4}, Lcom/tencent/rmonitor/sla/AttaEventReportTask;->dealValue(Ljava/lang/String;)Ljava/lang/String;

    .line 109
    move-result-object v4

    .line 110
    .line 111
    const-string v5, "user_id"

    .line 112
    .line 113
    .line 114
    invoke-direct {p0, v0, v5, v4}, Lcom/tencent/rmonitor/sla/AttaEventReportTask;->buildAttaBodyInternal(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v3}, Lcom/tencent/rmonitor/sla/AttaEvent;->getSdkVersion()Ljava/lang/String;

    .line 118
    move-result-object v4

    .line 119
    .line 120
    const-string v5, "sdk_version"

    .line 121
    .line 122
    .line 123
    invoke-direct {p0, v0, v5, v4}, Lcom/tencent/rmonitor/sla/AttaEventReportTask;->buildAttaBodyInternal(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v3}, Lcom/tencent/rmonitor/sla/AttaEvent;->getEventCode()Ljava/lang/String;

    .line 127
    move-result-object v4

    .line 128
    .line 129
    const-string v5, "event_code"

    .line 130
    .line 131
    .line 132
    invoke-direct {p0, v0, v5, v4}, Lcom/tencent/rmonitor/sla/AttaEventReportTask;->buildAttaBodyInternal(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v3}, Lcom/tencent/rmonitor/sla/AttaEvent;->getEventResult()I

    .line 136
    move-result v4

    .line 137
    .line 138
    .line 139
    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 140
    move-result-object v4

    .line 141
    .line 142
    const-string v5, "event_result"

    .line 143
    .line 144
    .line 145
    invoke-direct {p0, v0, v5, v4}, Lcom/tencent/rmonitor/sla/AttaEventReportTask;->buildAttaBodyInternal(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v3}, Lcom/tencent/rmonitor/sla/AttaEvent;->getEventTime()J

    .line 149
    move-result-wide v4

    .line 150
    .line 151
    .line 152
    invoke-direct {p0, v4, v5}, Lcom/tencent/rmonitor/sla/AttaEventReportTask;->getFormatTime(J)Ljava/lang/String;

    .line 153
    move-result-object v4

    .line 154
    .line 155
    const-string v5, "event_time"

    .line 156
    .line 157
    .line 158
    invoke-direct {p0, v0, v5, v4}, Lcom/tencent/rmonitor/sla/AttaEventReportTask;->buildAttaBodyInternal(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v3}, Lcom/tencent/rmonitor/sla/AttaEvent;->getEventCost()I

    .line 162
    move-result v4

    .line 163
    .line 164
    .line 165
    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 166
    move-result-object v4

    .line 167
    .line 168
    const-string v5, "event_cost"

    .line 169
    .line 170
    .line 171
    invoke-direct {p0, v0, v5, v4}, Lcom/tencent/rmonitor/sla/AttaEventReportTask;->buildAttaBodyInternal(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v3}, Lcom/tencent/rmonitor/sla/AttaEvent;->getErrorCode()I

    .line 175
    move-result v4

    .line 176
    .line 177
    .line 178
    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 179
    move-result-object v4

    .line 180
    .line 181
    const-string v5, "error_code"

    .line 182
    .line 183
    .line 184
    invoke-direct {p0, v0, v5, v4}, Lcom/tencent/rmonitor/sla/AttaEventReportTask;->buildAttaBodyInternal(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v3}, Lcom/tencent/rmonitor/sla/AttaEvent;->getUploadTime()J

    .line 188
    move-result-wide v4

    .line 189
    .line 190
    .line 191
    invoke-direct {p0, v4, v5}, Lcom/tencent/rmonitor/sla/AttaEventReportTask;->getFormatTime(J)Ljava/lang/String;

    .line 192
    move-result-object v4

    .line 193
    .line 194
    const-string v5, "upload_time"

    .line 195
    .line 196
    .line 197
    invoke-direct {p0, v0, v5, v4}, Lcom/tencent/rmonitor/sla/AttaEventReportTask;->buildAttaBodyInternal(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v3}, Lcom/tencent/rmonitor/sla/AttaEvent;->getDeviceId()Ljava/lang/String;

    .line 201
    move-result-object v4

    .line 202
    .line 203
    .line 204
    invoke-direct {p0, v4}, Lcom/tencent/rmonitor/sla/AttaEventReportTask;->dealValue(Ljava/lang/String;)Ljava/lang/String;

    .line 205
    move-result-object v4

    .line 206
    .line 207
    const-string v5, "device_id"

    .line 208
    .line 209
    .line 210
    invoke-direct {p0, v0, v5, v4}, Lcom/tencent/rmonitor/sla/AttaEventReportTask;->buildAttaBodyInternal(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {v3}, Lcom/tencent/rmonitor/sla/AttaEvent;->getOsVersion()Ljava/lang/String;

    .line 214
    move-result-object v4

    .line 215
    .line 216
    .line 217
    invoke-direct {p0, v4}, Lcom/tencent/rmonitor/sla/AttaEventReportTask;->dealValue(Ljava/lang/String;)Ljava/lang/String;

    .line 218
    move-result-object v4

    .line 219
    .line 220
    const-string v5, "os_version"

    .line 221
    .line 222
    .line 223
    invoke-direct {p0, v0, v5, v4}, Lcom/tencent/rmonitor/sla/AttaEventReportTask;->buildAttaBodyInternal(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {v3}, Lcom/tencent/rmonitor/sla/AttaEvent;->getManufacturer()Ljava/lang/String;

    .line 227
    move-result-object v4

    .line 228
    .line 229
    .line 230
    invoke-direct {p0, v4}, Lcom/tencent/rmonitor/sla/AttaEventReportTask;->dealValue(Ljava/lang/String;)Ljava/lang/String;

    .line 231
    move-result-object v4

    .line 232
    .line 233
    const-string v5, "manufacturer"

    .line 234
    .line 235
    .line 236
    invoke-direct {p0, v0, v5, v4}, Lcom/tencent/rmonitor/sla/AttaEventReportTask;->buildAttaBodyInternal(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v3}, Lcom/tencent/rmonitor/sla/AttaEvent;->getModel()Ljava/lang/String;

    .line 240
    move-result-object v4

    .line 241
    .line 242
    .line 243
    invoke-direct {p0, v4}, Lcom/tencent/rmonitor/sla/AttaEventReportTask;->dealValue(Ljava/lang/String;)Ljava/lang/String;

    .line 244
    move-result-object v4

    .line 245
    .line 246
    const-string v5, "model"

    .line 247
    .line 248
    .line 249
    invoke-direct {p0, v0, v5, v4}, Lcom/tencent/rmonitor/sla/AttaEventReportTask;->buildAttaBodyInternal(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    .line 250
    .line 251
    .line 252
    invoke-virtual {v3}, Lcom/tencent/rmonitor/sla/AttaEvent;->getDebug()I

    .line 253
    move-result v4

    .line 254
    .line 255
    .line 256
    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 257
    move-result-object v4

    .line 258
    .line 259
    const-string v5, "debug"

    .line 260
    .line 261
    .line 262
    invoke-direct {p0, v0, v5, v4}, Lcom/tencent/rmonitor/sla/AttaEventReportTask;->buildAttaBodyInternal(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    invoke-virtual {v3}, Lcom/tencent/rmonitor/sla/AttaEvent;->getProductId()Ljava/lang/String;

    .line 266
    move-result-object v4

    .line 267
    .line 268
    .line 269
    invoke-direct {p0, v4}, Lcom/tencent/rmonitor/sla/AttaEventReportTask;->dealValue(Ljava/lang/String;)Ljava/lang/String;

    .line 270
    move-result-object v4

    .line 271
    .line 272
    const-string v5, "product_id"

    .line 273
    .line 274
    .line 275
    invoke-direct {p0, v0, v5, v4}, Lcom/tencent/rmonitor/sla/AttaEventReportTask;->buildAttaBodyInternal(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    .line 276
    .line 277
    .line 278
    invoke-virtual {v3}, Lcom/tencent/rmonitor/sla/AttaEvent;->getFullOSVersion()Ljava/lang/String;

    .line 279
    move-result-object v4

    .line 280
    .line 281
    .line 282
    invoke-direct {p0, v4}, Lcom/tencent/rmonitor/sla/AttaEventReportTask;->dealValue(Ljava/lang/String;)Ljava/lang/String;

    .line 283
    move-result-object v4

    .line 284
    .line 285
    const-string v5, "full_os_version"

    .line 286
    .line 287
    .line 288
    invoke-direct {p0, v0, v5, v4}, Lcom/tencent/rmonitor/sla/AttaEventReportTask;->buildAttaBodyInternal(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    .line 289
    .line 290
    .line 291
    invoke-virtual {v3}, Lcom/tencent/rmonitor/sla/AttaEvent;->getParam0()Ljava/lang/String;

    .line 292
    move-result-object v4

    .line 293
    .line 294
    .line 295
    invoke-direct {p0, v4}, Lcom/tencent/rmonitor/sla/AttaEventReportTask;->dealValue(Ljava/lang/String;)Ljava/lang/String;

    .line 296
    move-result-object v4

    .line 297
    .line 298
    const-string v5, "param_0"

    .line 299
    .line 300
    .line 301
    invoke-direct {p0, v0, v5, v4}, Lcom/tencent/rmonitor/sla/AttaEventReportTask;->buildAttaBodyInternal(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    .line 302
    .line 303
    .line 304
    invoke-virtual {v3}, Lcom/tencent/rmonitor/sla/AttaEvent;->getParam1()Ljava/lang/String;

    .line 305
    move-result-object v4

    .line 306
    .line 307
    .line 308
    invoke-direct {p0, v4}, Lcom/tencent/rmonitor/sla/AttaEventReportTask;->dealValue(Ljava/lang/String;)Ljava/lang/String;

    .line 309
    move-result-object v4

    .line 310
    .line 311
    const-string v5, "param_1"

    .line 312
    .line 313
    .line 314
    invoke-direct {p0, v0, v5, v4}, Lcom/tencent/rmonitor/sla/AttaEventReportTask;->buildAttaBodyInternal(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    .line 315
    .line 316
    .line 317
    invoke-virtual {v3}, Lcom/tencent/rmonitor/sla/AttaEvent;->getParam2()Ljava/lang/String;

    .line 318
    move-result-object v4

    .line 319
    .line 320
    .line 321
    invoke-direct {p0, v4}, Lcom/tencent/rmonitor/sla/AttaEventReportTask;->dealValue(Ljava/lang/String;)Ljava/lang/String;

    .line 322
    move-result-object v4

    .line 323
    .line 324
    const-string v5, "param_2"

    .line 325
    .line 326
    .line 327
    invoke-direct {p0, v0, v5, v4}, Lcom/tencent/rmonitor/sla/AttaEventReportTask;->buildAttaBodyInternal(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    .line 328
    .line 329
    .line 330
    invoke-virtual {v3}, Lcom/tencent/rmonitor/sla/AttaEvent;->getParam3()Ljava/lang/String;

    .line 331
    move-result-object v4

    .line 332
    .line 333
    .line 334
    invoke-direct {p0, v4}, Lcom/tencent/rmonitor/sla/AttaEventReportTask;->dealValue(Ljava/lang/String;)Ljava/lang/String;

    .line 335
    move-result-object v4

    .line 336
    .line 337
    const-string v5, "param_3"

    .line 338
    .line 339
    .line 340
    invoke-direct {p0, v0, v5, v4}, Lcom/tencent/rmonitor/sla/AttaEventReportTask;->buildAttaBodyInternal(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    .line 341
    .line 342
    .line 343
    invoke-virtual {v3}, Lcom/tencent/rmonitor/sla/AttaEvent;->getParam4()Ljava/lang/String;

    .line 344
    move-result-object v4

    .line 345
    .line 346
    .line 347
    invoke-direct {p0, v4}, Lcom/tencent/rmonitor/sla/AttaEventReportTask;->dealValue(Ljava/lang/String;)Ljava/lang/String;

    .line 348
    move-result-object v4

    .line 349
    .line 350
    const-string v5, "param_4"

    .line 351
    .line 352
    .line 353
    invoke-direct {p0, v0, v5, v4}, Lcom/tencent/rmonitor/sla/AttaEventReportTask;->buildAttaBodyInternal(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    .line 354
    .line 355
    .line 356
    invoke-virtual {v3}, Lcom/tencent/rmonitor/sla/AttaEvent;->getParam5()Ljava/lang/String;

    .line 357
    move-result-object v4

    .line 358
    .line 359
    .line 360
    invoke-direct {p0, v4}, Lcom/tencent/rmonitor/sla/AttaEventReportTask;->dealValue(Ljava/lang/String;)Ljava/lang/String;

    .line 361
    move-result-object v4

    .line 362
    .line 363
    const-string v5, "param_5"

    .line 364
    .line 365
    .line 366
    invoke-direct {p0, v0, v5, v4}, Lcom/tencent/rmonitor/sla/AttaEventReportTask;->buildAttaBodyInternal(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    .line 367
    .line 368
    .line 369
    invoke-virtual {v3}, Lcom/tencent/rmonitor/sla/AttaEvent;->getParam6()Ljava/lang/String;

    .line 370
    move-result-object v4

    .line 371
    .line 372
    .line 373
    invoke-direct {p0, v4}, Lcom/tencent/rmonitor/sla/AttaEventReportTask;->dealValue(Ljava/lang/String;)Ljava/lang/String;

    .line 374
    move-result-object v4

    .line 375
    .line 376
    const-string v5, "param_6"

    .line 377
    .line 378
    .line 379
    invoke-direct {p0, v0, v5, v4}, Lcom/tencent/rmonitor/sla/AttaEventReportTask;->buildAttaBodyInternal(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    .line 380
    .line 381
    .line 382
    invoke-virtual {v3}, Lcom/tencent/rmonitor/sla/AttaEvent;->getParam7()Ljava/lang/String;

    .line 383
    move-result-object v4

    .line 384
    .line 385
    .line 386
    invoke-direct {p0, v4}, Lcom/tencent/rmonitor/sla/AttaEventReportTask;->dealValue(Ljava/lang/String;)Ljava/lang/String;

    .line 387
    move-result-object v4

    .line 388
    .line 389
    const-string v5, "param_7"

    .line 390
    .line 391
    .line 392
    invoke-direct {p0, v0, v5, v4}, Lcom/tencent/rmonitor/sla/AttaEventReportTask;->buildAttaBodyInternal(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    .line 393
    .line 394
    .line 395
    invoke-virtual {v3}, Lcom/tencent/rmonitor/sla/AttaEvent;->getParam8()Ljava/lang/String;

    .line 396
    move-result-object v4

    .line 397
    .line 398
    .line 399
    invoke-direct {p0, v4}, Lcom/tencent/rmonitor/sla/AttaEventReportTask;->dealValue(Ljava/lang/String;)Ljava/lang/String;

    .line 400
    move-result-object v4

    .line 401
    .line 402
    const-string v5, "param_8"

    .line 403
    .line 404
    .line 405
    invoke-direct {p0, v0, v5, v4}, Lcom/tencent/rmonitor/sla/AttaEventReportTask;->buildAttaBodyInternal(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    .line 406
    .line 407
    .line 408
    invoke-virtual {v3}, Lcom/tencent/rmonitor/sla/AttaEvent;->getParam9()Ljava/lang/String;

    .line 409
    move-result-object v4

    .line 410
    .line 411
    .line 412
    invoke-direct {p0, v4}, Lcom/tencent/rmonitor/sla/AttaEventReportTask;->dealValue(Ljava/lang/String;)Ljava/lang/String;

    .line 413
    move-result-object v4

    .line 414
    .line 415
    const-string v5, "param_9"

    .line 416
    .line 417
    .line 418
    invoke-direct {p0, v0, v5, v4}, Lcom/tencent/rmonitor/sla/AttaEventReportTask;->buildAttaBodyInternal(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    .line 419
    .line 420
    .line 421
    invoke-virtual {v3}, Lcom/tencent/rmonitor/sla/AttaEvent;->getParam10()Ljava/lang/String;

    .line 422
    move-result-object v4

    .line 423
    .line 424
    .line 425
    invoke-direct {p0, v4}, Lcom/tencent/rmonitor/sla/AttaEventReportTask;->dealValue(Ljava/lang/String;)Ljava/lang/String;

    .line 426
    move-result-object v4

    .line 427
    .line 428
    const-string v5, "param_10"

    .line 429
    .line 430
    .line 431
    invoke-direct {p0, v0, v5, v4}, Lcom/tencent/rmonitor/sla/AttaEventReportTask;->buildAttaBodyInternal(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    .line 432
    .line 433
    .line 434
    invoke-virtual {v3}, Lcom/tencent/rmonitor/sla/AttaEvent;->getParam11()Ljava/lang/String;

    .line 435
    move-result-object v4

    .line 436
    .line 437
    .line 438
    invoke-direct {p0, v4}, Lcom/tencent/rmonitor/sla/AttaEventReportTask;->dealValue(Ljava/lang/String;)Ljava/lang/String;

    .line 439
    move-result-object v4

    .line 440
    .line 441
    const-string v5, "param_11"

    .line 442
    .line 443
    .line 444
    invoke-direct {p0, v0, v5, v4}, Lcom/tencent/rmonitor/sla/AttaEventReportTask;->buildAttaBodyInternal(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    .line 445
    .line 446
    .line 447
    invoke-virtual {v3}, Lcom/tencent/rmonitor/sla/AttaEvent;->getParam12()Ljava/lang/String;

    .line 448
    move-result-object v4

    .line 449
    .line 450
    .line 451
    invoke-direct {p0, v4}, Lcom/tencent/rmonitor/sla/AttaEventReportTask;->dealValue(Ljava/lang/String;)Ljava/lang/String;

    .line 452
    move-result-object v4

    .line 453
    .line 454
    const-string v5, "param_12"

    .line 455
    .line 456
    .line 457
    invoke-direct {p0, v0, v5, v4}, Lcom/tencent/rmonitor/sla/AttaEventReportTask;->buildAttaBodyInternal(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    .line 458
    .line 459
    .line 460
    invoke-virtual {v3}, Lcom/tencent/rmonitor/sla/AttaEvent;->getParam13()Ljava/lang/String;

    .line 461
    move-result-object v3

    .line 462
    .line 463
    .line 464
    invoke-direct {p0, v3}, Lcom/tencent/rmonitor/sla/AttaEventReportTask;->dealValue(Ljava/lang/String;)Ljava/lang/String;

    .line 465
    move-result-object v3

    .line 466
    .line 467
    const-string v4, "param_13"

    .line 468
    .line 469
    .line 470
    invoke-direct {p0, v0, v4, v3}, Lcom/tencent/rmonitor/sla/AttaEventReportTask;->buildAttaBodyInternal(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    .line 471
    .line 472
    .line 473
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 474
    move-result-object v3

    .line 475
    .line 476
    .line 477
    invoke-virtual {v2, v3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 478
    .line 479
    goto/16 :goto_0

    .line 480
    .line 481
    :cond_1
    :try_start_0
    new-instance p1, Lorg/json/JSONObject;

    .line 482
    .line 483
    .line 484
    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    .line 485
    .line 486
    const-string v0, "attaid"

    .line 487
    .line 488
    const-string v3, "08e00055686"

    .line 489
    .line 490
    .line 491
    invoke-virtual {p1, v0, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 492
    .line 493
    const-string v0, "token"

    .line 494
    .line 495
    const-string v3, "8666841551"

    .line 496
    .line 497
    .line 498
    invoke-virtual {p1, v0, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 499
    .line 500
    const-string v0, "type"

    .line 501
    .line 502
    const-string v3, "batch"

    .line 503
    .line 504
    .line 505
    invoke-virtual {p1, v0, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 506
    .line 507
    const-string v0, "version"

    .line 508
    .line 509
    const-string v3, "v1.0.0"

    .line 510
    .line 511
    .line 512
    invoke-virtual {p1, v0, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 513
    .line 514
    const-string v0, "datas"

    .line 515
    .line 516
    .line 517
    invoke-virtual {p1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 518
    .line 519
    .line 520
    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 521
    move-result-object p1
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 522
    return-object p1

    .line 523
    :catch_0
    move-exception p1

    .line 524
    .line 525
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 526
    .line 527
    const-string v2, "RMonitor_sla_AttaEventReportTask"

    .line 528
    .line 529
    .line 530
    invoke-virtual {v0, v2, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->exception(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 531
    return-object v1
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
.end method

.method private final buildAttaBodyInternal(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 11
    move-result v0

    .line 12
    .line 13
    const-string v1, "="

    .line 14
    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    return-void

    .line 26
    .line 27
    :cond_1
    const-string v0, "&"

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    return-void
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

.method private final dealValue(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 1
    .line 2
    if-eqz p1, :cond_0

    .line 3
    const/4 v4, 0x4

    .line 4
    const/4 v5, 0x0

    .line 5
    .line 6
    const-string v1, "$"

    .line 7
    .line 8
    const-string v2, "\\$"

    .line 9
    const/4 v3, 0x0

    .line 10
    move-object v0, p1

    .line 11
    .line 12
    .line 13
    invoke-static/range {v0 .. v5}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    .line 14
    move-result-object p1

    .line 15
    .line 16
    .line 17
    invoke-static {p1}, Lcom/tencent/bugly/common/utils/StringUtil;->encode(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    move-result-object p1

    .line 19
    return-object p1

    .line 20
    .line 21
    :cond_0
    const-string p1, ""

    .line 22
    return-object p1
    .line 23
    .line 24
.end method

.method private final getFormatTime(J)Ljava/lang/String;
    .locals 3

    .line 1
    .line 2
    :try_start_0
    new-instance v0, Ljava/util/Date;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p1, p2}, Ljava/util/Date;-><init>(J)V

    .line 6
    .line 7
    sget-object v1, Lcom/tencent/rmonitor/sla/AttaEventReportTask;->TIME_FORMAT:Ljava/text/SimpleDateFormat;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1, v0}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    const-string v1, "TIME_FORMAT.format(date)"

    .line 14
    .line 15
    .line 16
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    return-object v0

    .line 18
    :catchall_0
    move-exception v0

    .line 19
    .line 20
    .line 21
    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 22
    move-result-object p1

    .line 23
    .line 24
    sget-object p2, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 28
    move-result-object v0

    .line 29
    .line 30
    .line 31
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 32
    .line 33
    const-string v1, "RMonitor_sla_AttaEventReportTask"

    .line 34
    .line 35
    const-string v2, "getFormatTime"

    .line 36
    .line 37
    .line 38
    filled-new-array {v1, v2, v0}, [Ljava/lang/String;

    .line 39
    move-result-object v0

    .line 40
    .line 41
    .line 42
    invoke-virtual {p2, v0}, Lcom/tencent/rmonitor/common/logger/Logger;->e([Ljava/lang/String;)V

    .line 43
    return-object p1
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
.end method


# virtual methods
.method public final report()Z
    .locals 13

    .line 1
    .line 2
    const-string v0, "atta report respCode: "

    .line 3
    .line 4
    const-string v1, "atta report data:"

    .line 5
    .line 6
    .line 7
    invoke-static {}, Lcom/tencent/bugly/proguard/m7;->g()Z

    .line 8
    move-result v2

    .line 9
    const/4 v3, 0x0

    .line 10
    .line 11
    const-string v4, "RMonitor_sla_AttaEventReportTask"

    .line 12
    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 16
    .line 17
    const-string v1, "report atta event fail for app in standalone mode."

    .line 18
    .line 19
    .line 20
    filled-new-array {v4, v1}, [Ljava/lang/String;

    .line 21
    move-result-object v1

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->w([Ljava/lang/String;)V

    .line 25
    return v3

    .line 26
    .line 27
    :cond_0
    iget-object v2, p0, Lcom/tencent/rmonitor/sla/AttaEventReportTask;->eventList:Ljava/util/List;

    .line 28
    .line 29
    .line 30
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 31
    move-result v2

    .line 32
    .line 33
    if-eqz v2, :cond_1

    .line 34
    .line 35
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 36
    .line 37
    const-string v1, "event list is empty"

    .line 38
    .line 39
    .line 40
    filled-new-array {v4, v1}, [Ljava/lang/String;

    .line 41
    move-result-object v1

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    .line 45
    return v3

    .line 46
    .line 47
    :cond_1
    sget-object v2, Lcom/tencent/bugly/common/network/NetworkWatcher;->INSTANCE:Lcom/tencent/bugly/common/network/NetworkWatcher;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2}, Lcom/tencent/bugly/common/network/NetworkWatcher;->isNetworkConnectedRealtime()Z

    .line 51
    move-result v2

    .line 52
    .line 53
    if-nez v2, :cond_2

    .line 54
    .line 55
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 56
    .line 57
    const-string v1, "network not available"

    .line 58
    .line 59
    .line 60
    filled-new-array {v4, v1}, [Ljava/lang/String;

    .line 61
    move-result-object v1

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    .line 65
    return v3

    .line 66
    .line 67
    :cond_2
    sget-object v2, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 68
    .line 69
    new-instance v5, Ljava/lang/StringBuilder;

    .line 70
    .line 71
    const-string v6, "atta report url: "

    .line 72
    .line 73
    .line 74
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0}, Lcom/tencent/bugly/common/reporter/upload/QAPMUpload;->getUrl()Ljava/net/URL;

    .line 78
    move-result-object v6

    .line 79
    .line 80
    .line 81
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 85
    move-result-object v5

    .line 86
    .line 87
    .line 88
    filled-new-array {v4, v5}, [Ljava/lang/String;

    .line 89
    move-result-object v5

    .line 90
    .line 91
    .line 92
    invoke-virtual {v2, v5}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    .line 93
    .line 94
    new-instance v7, Ljava/util/HashMap;

    .line 95
    .line 96
    .line 97
    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 98
    .line 99
    const-string v5, "application/x-www-form-urlencoded"

    .line 100
    .line 101
    const-string v12, "Content-Type"

    .line 102
    .line 103
    .line 104
    invoke-interface {v7, v12, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    .line 106
    const-string v5, "Atta-Type"

    .line 107
    .line 108
    const-string v6, "batch-report"

    .line 109
    .line 110
    .line 111
    invoke-interface {v7, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    const/4 v10, 0x6

    .line 113
    const/4 v11, 0x0

    .line 114
    const/4 v8, 0x0

    .line 115
    const/4 v9, 0x0

    .line 116
    move-object v6, p0

    .line 117
    .line 118
    .line 119
    invoke-static/range {v6 .. v11}, Lcom/tencent/bugly/common/reporter/upload/QAPMUpload;->connectionBuilder$default(Lcom/tencent/bugly/common/reporter/upload/QAPMUpload;Ljava/util/HashMap;IIILjava/lang/Object;)Ljava/net/HttpURLConnection;

    .line 120
    move-result-object v5

    .line 121
    .line 122
    if-eqz v5, :cond_4

    .line 123
    .line 124
    :try_start_0
    iget-object v7, v6, Lcom/tencent/rmonitor/sla/AttaEventReportTask;->eventList:Ljava/util/List;

    .line 125
    .line 126
    .line 127
    invoke-direct {p0, v7}, Lcom/tencent/rmonitor/sla/AttaEventReportTask;->buildAttaBody(Ljava/util/List;)Ljava/lang/String;

    .line 128
    move-result-object v7

    .line 129
    .line 130
    new-instance v8, Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-direct {v8, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 140
    move-result-object v1

    .line 141
    .line 142
    .line 143
    filled-new-array {v4, v1}, [Ljava/lang/String;

    .line 144
    move-result-object v1

    .line 145
    .line 146
    .line 147
    invoke-virtual {v2, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    .line 148
    .line 149
    if-eqz v7, :cond_4

    .line 150
    .line 151
    new-instance v1, Ljava/io/DataOutputStream;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v5}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    .line 155
    move-result-object v8

    .line 156
    .line 157
    .line 158
    invoke-direct {v1, v8}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 159
    .line 160
    :try_start_1
    const-string v8, "utf-8"

    .line 161
    .line 162
    .line 163
    invoke-static {v8}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 164
    move-result-object v8

    .line 165
    .line 166
    const-string v9, "forName(charsetName)"

    .line 167
    .line 168
    .line 169
    invoke-static {v8, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v7, v8}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 173
    move-result-object v8

    .line 174
    .line 175
    const-string v9, "this as java.lang.String).getBytes(charset)"

    .line 176
    .line 177
    .line 178
    invoke-static {v8, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v1, v8}, Ljava/io/OutputStream;->write([B)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v1}, Ljava/io/DataOutputStream;->flush()V

    .line 185
    .line 186
    sget-object v8, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 187
    const/4 v8, 0x0

    .line 188
    .line 189
    .line 190
    :try_start_2
    invoke-static {v1, v8}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 191
    .line 192
    new-instance v1, Ljava/io/BufferedInputStream;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v5}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 196
    move-result-object v9

    .line 197
    .line 198
    .line 199
    invoke-direct {v1, v9}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 200
    .line 201
    :try_start_3
    sget-object v9, Lcom/tencent/rmonitor/common/util/FileUtil;->Companion:Lcom/tencent/rmonitor/common/util/FileUtil$Companion;

    .line 202
    .line 203
    const/16 v10, 0x2000

    .line 204
    .line 205
    .line 206
    invoke-virtual {v9, v1, v10}, Lcom/tencent/rmonitor/common/util/FileUtil$Companion;->readStream(Ljava/io/InputStream;I)Ljava/lang/String;

    .line 207
    move-result-object v9
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 208
    .line 209
    .line 210
    :try_start_4
    invoke-static {v1, v8}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {v5}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 214
    move-result v1

    .line 215
    .line 216
    .line 217
    invoke-virtual {v5, v12}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    .line 218
    move-result-object v8

    .line 219
    .line 220
    const/16 v10, 0xc8

    .line 221
    .line 222
    if-ne v1, v10, :cond_3

    .line 223
    const/4 v10, 0x1

    .line 224
    goto :goto_0

    .line 225
    :cond_3
    move v10, v3

    .line 226
    .line 227
    :goto_0
    new-instance v11, Ljava/lang/StringBuilder;

    .line 228
    .line 229
    .line 230
    invoke-direct {v11, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 234
    .line 235
    const-string v0, ", contentLen: "

    .line 236
    .line 237
    .line 238
    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 239
    .line 240
    .line 241
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 242
    move-result v0

    .line 243
    .line 244
    .line 245
    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 246
    .line 247
    const-string v0, ", contentType: "

    .line 248
    .line 249
    .line 250
    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 251
    .line 252
    .line 253
    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 254
    .line 255
    const-string v0, ", body: "

    .line 256
    .line 257
    .line 258
    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 259
    .line 260
    .line 261
    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 262
    .line 263
    .line 264
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 265
    move-result-object v0

    .line 266
    .line 267
    .line 268
    filled-new-array {v4, v0}, [Ljava/lang/String;

    .line 269
    move-result-object v0

    .line 270
    .line 271
    .line 272
    invoke-virtual {v2, v0}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 273
    move v3, v10

    .line 274
    goto :goto_2

    .line 275
    :catchall_0
    move-exception v0

    .line 276
    goto :goto_1

    .line 277
    :catchall_1
    move-exception v0

    .line 278
    move-object v2, v0

    .line 279
    :try_start_5
    throw v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 280
    :catchall_2
    move-exception v0

    .line 281
    .line 282
    .line 283
    :try_start_6
    invoke-static {v1, v2}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 284
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 285
    :catchall_3
    move-exception v0

    .line 286
    move-object v2, v0

    .line 287
    :try_start_7
    throw v2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 288
    :catchall_4
    move-exception v0

    .line 289
    .line 290
    .line 291
    :try_start_8
    invoke-static {v1, v2}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 292
    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 293
    .line 294
    :goto_1
    :try_start_9
    sget-object v1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 295
    .line 296
    .line 297
    invoke-virtual {v1, v4, v0}, Lcom/tencent/rmonitor/common/logger/Logger;->exception(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    .line 298
    .line 299
    .line 300
    invoke-virtual {v5}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 301
    return v3

    .line 302
    :catchall_5
    move-exception v0

    .line 303
    .line 304
    .line 305
    invoke-virtual {v5}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 306
    throw v0

    .line 307
    .line 308
    :cond_4
    :goto_2
    if-eqz v5, :cond_5

    .line 309
    .line 310
    .line 311
    invoke-virtual {v5}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 312
    :cond_5
    return v3
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
.end method

.method public request()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/tencent/rmonitor/sla/AttaEventReportTask;->report()Z

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
.end method

.method public run()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/tencent/rmonitor/sla/AttaEventReportTask;->report()Z

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
.end method
