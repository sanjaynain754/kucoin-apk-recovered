.class Lcom/sensorsdata/analytics/android/sdk/deeplink/SensorsDataDeepLink$1;
.super Lcom/sensorsdata/analytics/android/sdk/network/HttpCallback$JsonCallback;
.source "SensorsDataDeepLink.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sensorsdata/analytics/android/sdk/deeplink/SensorsDataDeepLink;->parseDeepLink(Landroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/sensorsdata/analytics/android/sdk/deeplink/SensorsDataDeepLink;

.field final synthetic val$requestDeepLinkStartTime:J


# direct methods
.method public constructor <init>(Lcom/sensorsdata/analytics/android/sdk/deeplink/SensorsDataDeepLink;J)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sensorsdata/analytics/android/sdk/deeplink/SensorsDataDeepLink$1;->this$0:Lcom/sensorsdata/analytics/android/sdk/deeplink/SensorsDataDeepLink;

    .line 3
    .line 4
    iput-wide p2, p0, Lcom/sensorsdata/analytics/android/sdk/deeplink/SensorsDataDeepLink$1;->val$requestDeepLinkStartTime:J

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Lcom/sensorsdata/analytics/android/sdk/network/HttpCallback$JsonCallback;-><init>()V

    .line 8
    return-void
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
.end method


# virtual methods
.method public onAfter()V
    .locals 10

    .line 1
    .line 2
    .line 3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 4
    move-result-wide v0

    .line 5
    .line 6
    iget-wide v2, p0, Lcom/sensorsdata/analytics/android/sdk/deeplink/SensorsDataDeepLink$1;->val$requestDeepLinkStartTime:J

    .line 7
    .line 8
    sub-long v8, v0, v2

    .line 9
    .line 10
    new-instance v1, Lorg/json/JSONObject;

    .line 11
    .line 12
    .line 13
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 14
    .line 15
    :try_start_0
    iget-object v0, p0, Lcom/sensorsdata/analytics/android/sdk/deeplink/SensorsDataDeepLink$1;->this$0:Lcom/sensorsdata/analytics/android/sdk/deeplink/SensorsDataDeepLink;

    .line 16
    .line 17
    .line 18
    invoke-static {v0}, Lcom/sensorsdata/analytics/android/sdk/deeplink/SensorsDataDeepLink;->access$200(Lcom/sensorsdata/analytics/android/sdk/deeplink/SensorsDataDeepLink;)Ljava/lang/String;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    .line 22
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 23
    move-result v0

    .line 24
    .line 25
    if-nez v0, :cond_0

    .line 26
    .line 27
    const-string v0, "$deeplink_options"

    .line 28
    .line 29
    iget-object v2, p0, Lcom/sensorsdata/analytics/android/sdk/deeplink/SensorsDataDeepLink$1;->this$0:Lcom/sensorsdata/analytics/android/sdk/deeplink/SensorsDataDeepLink;

    .line 30
    .line 31
    .line 32
    invoke-static {v2}, Lcom/sensorsdata/analytics/android/sdk/deeplink/SensorsDataDeepLink;->access$200(Lcom/sensorsdata/analytics/android/sdk/deeplink/SensorsDataDeepLink;)Ljava/lang/String;

    .line 33
    move-result-object v2

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 37
    goto :goto_0

    .line 38
    :catch_0
    move-exception v0

    .line 39
    goto :goto_1

    .line 40
    .line 41
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/sensorsdata/analytics/android/sdk/deeplink/SensorsDataDeepLink$1;->this$0:Lcom/sensorsdata/analytics/android/sdk/deeplink/SensorsDataDeepLink;

    .line 42
    .line 43
    .line 44
    invoke-static {v0}, Lcom/sensorsdata/analytics/android/sdk/deeplink/SensorsDataDeepLink;->access$000(Lcom/sensorsdata/analytics/android/sdk/deeplink/SensorsDataDeepLink;)Ljava/lang/String;

    .line 45
    move-result-object v0

    .line 46
    .line 47
    .line 48
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 49
    move-result v0

    .line 50
    .line 51
    if-nez v0, :cond_1

    .line 52
    .line 53
    const-string v0, "$deeplink_match_fail_reason"

    .line 54
    .line 55
    iget-object v2, p0, Lcom/sensorsdata/analytics/android/sdk/deeplink/SensorsDataDeepLink$1;->this$0:Lcom/sensorsdata/analytics/android/sdk/deeplink/SensorsDataDeepLink;

    .line 56
    .line 57
    .line 58
    invoke-static {v2}, Lcom/sensorsdata/analytics/android/sdk/deeplink/SensorsDataDeepLink;->access$000(Lcom/sensorsdata/analytics/android/sdk/deeplink/SensorsDataDeepLink;)Ljava/lang/String;

    .line 59
    move-result-object v2

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 63
    .line 64
    :cond_1
    const-string v0, "$deeplink_url"

    .line 65
    .line 66
    iget-object v2, p0, Lcom/sensorsdata/analytics/android/sdk/deeplink/SensorsDataDeepLink$1;->this$0:Lcom/sensorsdata/analytics/android/sdk/deeplink/SensorsDataDeepLink;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v2}, Lcom/sensorsdata/analytics/android/sdk/deeplink/AbsDeepLink;->getDeepLinkUrl()Ljava/lang/String;

    .line 70
    move-result-object v2

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 74
    .line 75
    const-string v0, "$event_duration"

    .line 76
    .line 77
    sget-object v2, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    .line 78
    .line 79
    const-string v3, "%.3f"

    .line 80
    long-to-float v4, v8

    .line 81
    .line 82
    const/high16 v5, 0x447a0000    # 1000.0f

    .line 83
    div-float/2addr v4, v5

    .line 84
    .line 85
    .line 86
    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 87
    move-result-object v4

    .line 88
    .line 89
    .line 90
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 91
    move-result-object v4

    .line 92
    .line 93
    .line 94
    invoke-static {v2, v3, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 95
    move-result-object v2

    .line 96
    .line 97
    .line 98
    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 99
    goto :goto_2

    .line 100
    .line 101
    .line 102
    :goto_1
    invoke-static {v0}, Lcom/sensorsdata/analytics/android/sdk/SALog;->printStackTrace(Ljava/lang/Exception;)V

    .line 103
    .line 104
    .line 105
    :goto_2
    invoke-static {}, Lcom/sensorsdata/analytics/android/sdk/advert/utils/ChannelUtils;->getUtmProperties()Lorg/json/JSONObject;

    .line 106
    move-result-object v0

    .line 107
    .line 108
    .line 109
    invoke-static {v0, v1}, Lcom/sensorsdata/analytics/android/sdk/util/SensorsDataUtils;->mergeJSONObject(Lorg/json/JSONObject;Lorg/json/JSONObject;)V

    .line 110
    .line 111
    iget-object v0, p0, Lcom/sensorsdata/analytics/android/sdk/deeplink/SensorsDataDeepLink$1;->this$0:Lcom/sensorsdata/analytics/android/sdk/deeplink/SensorsDataDeepLink;

    .line 112
    .line 113
    iget-object v4, v0, Lcom/sensorsdata/analytics/android/sdk/deeplink/AbsDeepLink;->mCallBack:Lcom/sensorsdata/analytics/android/sdk/deeplink/DeepLinkManager$OnDeepLinkParseFinishCallback;

    .line 114
    .line 115
    if-eqz v4, :cond_2

    .line 116
    .line 117
    sget-object v5, Lcom/sensorsdata/analytics/android/sdk/deeplink/DeepLinkManager$DeepLinkType;->SENSORSDATA:Lcom/sensorsdata/analytics/android/sdk/deeplink/DeepLinkManager$DeepLinkType;

    .line 118
    .line 119
    .line 120
    invoke-static {v0}, Lcom/sensorsdata/analytics/android/sdk/deeplink/SensorsDataDeepLink;->access$200(Lcom/sensorsdata/analytics/android/sdk/deeplink/SensorsDataDeepLink;)Ljava/lang/String;

    .line 121
    move-result-object v6

    .line 122
    .line 123
    iget-object v0, p0, Lcom/sensorsdata/analytics/android/sdk/deeplink/SensorsDataDeepLink$1;->this$0:Lcom/sensorsdata/analytics/android/sdk/deeplink/SensorsDataDeepLink;

    .line 124
    .line 125
    .line 126
    invoke-static {v0}, Lcom/sensorsdata/analytics/android/sdk/deeplink/SensorsDataDeepLink;->access$100(Lcom/sensorsdata/analytics/android/sdk/deeplink/SensorsDataDeepLink;)Z

    .line 127
    move-result v7

    .line 128
    .line 129
    .line 130
    invoke-interface/range {v4 .. v9}, Lcom/sensorsdata/analytics/android/sdk/deeplink/DeepLinkManager$OnDeepLinkParseFinishCallback;->onFinish(Lcom/sensorsdata/analytics/android/sdk/deeplink/DeepLinkManager$DeepLinkType;Ljava/lang/String;ZJ)V

    .line 131
    .line 132
    .line 133
    :cond_2
    invoke-static {}, Lcom/sensorsdata/analytics/android/sdk/SensorsDataAPI;->sharedInstance()Lcom/sensorsdata/analytics/android/sdk/SensorsDataAPI;

    .line 134
    move-result-object v0

    .line 135
    .line 136
    const-string v2, "$AppDeeplinkMatchedResult"

    .line 137
    .line 138
    .line 139
    invoke-virtual {v0, v2, v1}, Lcom/sensorsdata/analytics/android/sdk/SensorsDataAPI;->trackInternal(Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 140
    return-void
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

.method public onFailure(ILjava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    iget-object p1, p0, Lcom/sensorsdata/analytics/android/sdk/deeplink/SensorsDataDeepLink$1;->this$0:Lcom/sensorsdata/analytics/android/sdk/deeplink/SensorsDataDeepLink;

    .line 3
    .line 4
    .line 5
    invoke-static {p1, p2}, Lcom/sensorsdata/analytics/android/sdk/deeplink/SensorsDataDeepLink;->access$002(Lcom/sensorsdata/analytics/android/sdk/deeplink/SensorsDataDeepLink;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    iget-object p1, p0, Lcom/sensorsdata/analytics/android/sdk/deeplink/SensorsDataDeepLink$1;->this$0:Lcom/sensorsdata/analytics/android/sdk/deeplink/SensorsDataDeepLink;

    .line 8
    const/4 p2, 0x0

    .line 9
    .line 10
    .line 11
    invoke-static {p1, p2}, Lcom/sensorsdata/analytics/android/sdk/deeplink/SensorsDataDeepLink;->access$102(Lcom/sensorsdata/analytics/android/sdk/deeplink/SensorsDataDeepLink;Z)Z

    .line 12
    return-void
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
.end method

.method public bridge synthetic onResponse(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lorg/json/JSONObject;

    invoke-virtual {p0, p1}, Lcom/sensorsdata/analytics/android/sdk/deeplink/SensorsDataDeepLink$1;->onResponse(Lorg/json/JSONObject;)V

    return-void
.end method

.method public onResponse(Lorg/json/JSONObject;)V
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    .line 2
    iget-object v1, p0, Lcom/sensorsdata/analytics/android/sdk/deeplink/SensorsDataDeepLink$1;->this$0:Lcom/sensorsdata/analytics/android/sdk/deeplink/SensorsDataDeepLink;

    const/4 v2, 0x1

    invoke-static {v1, v2}, Lcom/sensorsdata/analytics/android/sdk/deeplink/SensorsDataDeepLink;->access$102(Lcom/sensorsdata/analytics/android/sdk/deeplink/SensorsDataDeepLink;Z)Z

    .line 3
    const-string v1, "channel_params"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    .line 4
    invoke-static {v1}, Lcom/sensorsdata/analytics/android/sdk/util/JSONUtils;->json2Map(Lorg/json/JSONObject;)Ljava/util/Map;

    move-result-object v1

    .line 5
    invoke-static {v1}, Lcom/sensorsdata/analytics/android/sdk/advert/utils/ChannelUtils;->parseParams(Ljava/util/Map;)V

    .line 6
    iget-object v1, p0, Lcom/sensorsdata/analytics/android/sdk/deeplink/SensorsDataDeepLink$1;->this$0:Lcom/sensorsdata/analytics/android/sdk/deeplink/SensorsDataDeepLink;

    const-string/jumbo v2, "page_params"

    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/sensorsdata/analytics/android/sdk/deeplink/SensorsDataDeepLink;->access$202(Lcom/sensorsdata/analytics/android/sdk/deeplink/SensorsDataDeepLink;Ljava/lang/String;)Ljava/lang/String;

    .line 7
    iget-object v1, p0, Lcom/sensorsdata/analytics/android/sdk/deeplink/SensorsDataDeepLink$1;->this$0:Lcom/sensorsdata/analytics/android/sdk/deeplink/SensorsDataDeepLink;

    const-string v2, "errorMsg"

    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lcom/sensorsdata/analytics/android/sdk/deeplink/SensorsDataDeepLink;->access$002(Lcom/sensorsdata/analytics/android/sdk/deeplink/SensorsDataDeepLink;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    iget-object p1, p0, Lcom/sensorsdata/analytics/android/sdk/deeplink/SensorsDataDeepLink$1;->this$0:Lcom/sensorsdata/analytics/android/sdk/deeplink/SensorsDataDeepLink;

    invoke-static {p1}, Lcom/sensorsdata/analytics/android/sdk/deeplink/SensorsDataDeepLink;->access$000(Lcom/sensorsdata/analytics/android/sdk/deeplink/SensorsDataDeepLink;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 9
    iget-object p1, p0, Lcom/sensorsdata/analytics/android/sdk/deeplink/SensorsDataDeepLink$1;->this$0:Lcom/sensorsdata/analytics/android/sdk/deeplink/SensorsDataDeepLink;

    invoke-static {p1, v0}, Lcom/sensorsdata/analytics/android/sdk/deeplink/SensorsDataDeepLink;->access$102(Lcom/sensorsdata/analytics/android/sdk/deeplink/SensorsDataDeepLink;Z)Z

    :cond_0
    return-void

    .line 10
    :cond_1
    iget-object p1, p0, Lcom/sensorsdata/analytics/android/sdk/deeplink/SensorsDataDeepLink$1;->this$0:Lcom/sensorsdata/analytics/android/sdk/deeplink/SensorsDataDeepLink;

    invoke-static {p1, v0}, Lcom/sensorsdata/analytics/android/sdk/deeplink/SensorsDataDeepLink;->access$102(Lcom/sensorsdata/analytics/android/sdk/deeplink/SensorsDataDeepLink;Z)Z

    return-void
.end method
