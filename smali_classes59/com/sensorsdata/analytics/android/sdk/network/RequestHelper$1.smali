.class Lcom/sensorsdata/analytics/android/sdk/network/RequestHelper$1;
.super Ljava/lang/Object;
.source "RequestHelper.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sensorsdata/analytics/android/sdk/network/RequestHelper;->urlHttpGet(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;ILcom/sensorsdata/analytics/android/sdk/network/HttpCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/sensorsdata/analytics/android/sdk/network/RequestHelper;

.field final synthetic val$callBack:Lcom/sensorsdata/analytics/android/sdk/network/HttpCallback;

.field final synthetic val$headerMap:Ljava/util/Map;

.field final synthetic val$paramsMap:Ljava/util/Map;

.field final synthetic val$requestCount:I

.field final synthetic val$retryCount:I

.field final synthetic val$url:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/sensorsdata/analytics/android/sdk/network/RequestHelper;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Lcom/sensorsdata/analytics/android/sdk/network/HttpCallback;II)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sensorsdata/analytics/android/sdk/network/RequestHelper$1;->this$0:Lcom/sensorsdata/analytics/android/sdk/network/RequestHelper;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/sensorsdata/analytics/android/sdk/network/RequestHelper$1;->val$url:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p3, p0, Lcom/sensorsdata/analytics/android/sdk/network/RequestHelper$1;->val$paramsMap:Ljava/util/Map;

    .line 7
    .line 8
    iput-object p4, p0, Lcom/sensorsdata/analytics/android/sdk/network/RequestHelper$1;->val$headerMap:Ljava/util/Map;

    .line 9
    .line 10
    iput-object p5, p0, Lcom/sensorsdata/analytics/android/sdk/network/RequestHelper$1;->val$callBack:Lcom/sensorsdata/analytics/android/sdk/network/HttpCallback;

    .line 11
    .line 12
    iput p6, p0, Lcom/sensorsdata/analytics/android/sdk/network/RequestHelper$1;->val$retryCount:I

    .line 13
    .line 14
    iput p7, p0, Lcom/sensorsdata/analytics/android/sdk/network/RequestHelper$1;->val$requestCount:I

    .line 15
    .line 16
    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
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
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
.end method


# virtual methods
.method public run()V
    .locals 15

    .line 1
    .line 2
    new-instance v0, Lcom/sensorsdata/analytics/android/sdk/network/RealRequest;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/sensorsdata/analytics/android/sdk/network/RealRequest;-><init>()V

    .line 6
    .line 7
    iget-object v1, p0, Lcom/sensorsdata/analytics/android/sdk/network/RequestHelper$1;->this$0:Lcom/sensorsdata/analytics/android/sdk/network/RequestHelper;

    .line 8
    .line 9
    iget-object v2, p0, Lcom/sensorsdata/analytics/android/sdk/network/RequestHelper$1;->val$url:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v3, p0, Lcom/sensorsdata/analytics/android/sdk/network/RequestHelper$1;->val$paramsMap:Ljava/util/Map;

    .line 12
    .line 13
    .line 14
    invoke-static {v1, v2, v3}, Lcom/sensorsdata/analytics/android/sdk/network/RequestHelper;->access$000(Lcom/sensorsdata/analytics/android/sdk/network/RequestHelper;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    .line 15
    move-result-object v1

    .line 16
    .line 17
    iget-object v2, p0, Lcom/sensorsdata/analytics/android/sdk/network/RequestHelper$1;->val$headerMap:Ljava/util/Map;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1, v2}, Lcom/sensorsdata/analytics/android/sdk/network/RealRequest;->getData(Ljava/lang/String;Ljava/util/Map;)Lcom/sensorsdata/analytics/android/sdk/network/RealResponse;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    iget v1, v0, Lcom/sensorsdata/analytics/android/sdk/network/RealResponse;->code:I

    .line 24
    .line 25
    const/16 v2, 0xc8

    .line 26
    .line 27
    if-eq v1, v2, :cond_3

    .line 28
    .line 29
    const/16 v2, 0xcc

    .line 30
    .line 31
    if-ne v1, v2, :cond_0

    .line 32
    goto :goto_0

    .line 33
    .line 34
    :cond_0
    iget-object v1, p0, Lcom/sensorsdata/analytics/android/sdk/network/RequestHelper$1;->this$0:Lcom/sensorsdata/analytics/android/sdk/network/RequestHelper;

    .line 35
    .line 36
    .line 37
    invoke-static {v1}, Lcom/sensorsdata/analytics/android/sdk/network/RequestHelper;->access$100(Lcom/sensorsdata/analytics/android/sdk/network/RequestHelper;)Z

    .line 38
    move-result v1

    .line 39
    .line 40
    if-nez v1, :cond_1

    .line 41
    .line 42
    iget v1, v0, Lcom/sensorsdata/analytics/android/sdk/network/RealResponse;->code:I

    .line 43
    .line 44
    .line 45
    invoke-static {v1}, Lcom/sensorsdata/analytics/android/sdk/network/HttpUtils;->needRedirects(I)Z

    .line 46
    move-result v1

    .line 47
    .line 48
    if-eqz v1, :cond_1

    .line 49
    .line 50
    iget-object v1, p0, Lcom/sensorsdata/analytics/android/sdk/network/RequestHelper$1;->this$0:Lcom/sensorsdata/analytics/android/sdk/network/RequestHelper;

    .line 51
    const/4 v2, 0x1

    .line 52
    .line 53
    .line 54
    invoke-static {v1, v2}, Lcom/sensorsdata/analytics/android/sdk/network/RequestHelper;->access$102(Lcom/sensorsdata/analytics/android/sdk/network/RequestHelper;Z)Z

    .line 55
    .line 56
    iget-object v3, p0, Lcom/sensorsdata/analytics/android/sdk/network/RequestHelper$1;->this$0:Lcom/sensorsdata/analytics/android/sdk/network/RequestHelper;

    .line 57
    .line 58
    iget-object v4, v0, Lcom/sensorsdata/analytics/android/sdk/network/RealResponse;->location:Ljava/lang/String;

    .line 59
    .line 60
    iget-object v5, p0, Lcom/sensorsdata/analytics/android/sdk/network/RequestHelper$1;->val$paramsMap:Ljava/util/Map;

    .line 61
    .line 62
    iget-object v6, p0, Lcom/sensorsdata/analytics/android/sdk/network/RequestHelper$1;->val$headerMap:Ljava/util/Map;

    .line 63
    .line 64
    iget v7, p0, Lcom/sensorsdata/analytics/android/sdk/network/RequestHelper$1;->val$retryCount:I

    .line 65
    .line 66
    iget-object v8, p0, Lcom/sensorsdata/analytics/android/sdk/network/RequestHelper$1;->val$callBack:Lcom/sensorsdata/analytics/android/sdk/network/HttpCallback;

    .line 67
    .line 68
    .line 69
    invoke-static/range {v3 .. v8}, Lcom/sensorsdata/analytics/android/sdk/network/RequestHelper;->access$200(Lcom/sensorsdata/analytics/android/sdk/network/RequestHelper;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;ILcom/sensorsdata/analytics/android/sdk/network/HttpCallback;)V

    .line 70
    return-void

    .line 71
    .line 72
    :cond_1
    iget v13, p0, Lcom/sensorsdata/analytics/android/sdk/network/RequestHelper$1;->val$requestCount:I

    .line 73
    .line 74
    if-eqz v13, :cond_2

    .line 75
    .line 76
    iget-object v9, p0, Lcom/sensorsdata/analytics/android/sdk/network/RequestHelper$1;->this$0:Lcom/sensorsdata/analytics/android/sdk/network/RequestHelper;

    .line 77
    .line 78
    iget-object v10, p0, Lcom/sensorsdata/analytics/android/sdk/network/RequestHelper$1;->val$url:Ljava/lang/String;

    .line 79
    .line 80
    iget-object v11, p0, Lcom/sensorsdata/analytics/android/sdk/network/RequestHelper$1;->val$paramsMap:Ljava/util/Map;

    .line 81
    .line 82
    iget-object v12, p0, Lcom/sensorsdata/analytics/android/sdk/network/RequestHelper$1;->val$headerMap:Ljava/util/Map;

    .line 83
    .line 84
    iget-object v14, p0, Lcom/sensorsdata/analytics/android/sdk/network/RequestHelper$1;->val$callBack:Lcom/sensorsdata/analytics/android/sdk/network/HttpCallback;

    .line 85
    .line 86
    .line 87
    invoke-static/range {v9 .. v14}, Lcom/sensorsdata/analytics/android/sdk/network/RequestHelper;->access$200(Lcom/sensorsdata/analytics/android/sdk/network/RequestHelper;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;ILcom/sensorsdata/analytics/android/sdk/network/HttpCallback;)V

    .line 88
    return-void

    .line 89
    .line 90
    :cond_2
    iget-object v1, p0, Lcom/sensorsdata/analytics/android/sdk/network/RequestHelper$1;->val$callBack:Lcom/sensorsdata/analytics/android/sdk/network/HttpCallback;

    .line 91
    .line 92
    if-eqz v1, :cond_4

    .line 93
    .line 94
    .line 95
    invoke-virtual {v1, v0}, Lcom/sensorsdata/analytics/android/sdk/network/HttpCallback;->onError(Lcom/sensorsdata/analytics/android/sdk/network/RealResponse;)V

    .line 96
    return-void

    .line 97
    .line 98
    :cond_3
    :goto_0
    iget-object v1, p0, Lcom/sensorsdata/analytics/android/sdk/network/RequestHelper$1;->val$callBack:Lcom/sensorsdata/analytics/android/sdk/network/HttpCallback;

    .line 99
    .line 100
    if-eqz v1, :cond_4

    .line 101
    .line 102
    .line 103
    invoke-virtual {v1, v0}, Lcom/sensorsdata/analytics/android/sdk/network/HttpCallback;->onSuccess(Lcom/sensorsdata/analytics/android/sdk/network/RealResponse;)V

    .line 104
    :cond_4
    return-void
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
