.class public final enum Lcom/sensorsdata/abtest/entity/SABErrorEnum;
.super Ljava/lang/Enum;
.source "SABErrorEnum.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/sensorsdata/abtest/entity/SABErrorEnum;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/sensorsdata/abtest/entity/SABErrorEnum;

.field public static final enum ASYNC_REQUEST_EXPERIMENT_NOT_IN_FUZZY:Lcom/sensorsdata/abtest/entity/SABErrorEnum;

.field public static final enum ASYNC_REQUEST_NETWORK_UNAVAILABLE:Lcom/sensorsdata/abtest/entity/SABErrorEnum;

.field public static final enum ASYNC_REQUEST_NULL_EXPERIMENT_PARAMETER_NAME:Lcom/sensorsdata/abtest/entity/SABErrorEnum;

.field public static final enum ASYNC_REQUEST_PARAMS_TYPE_NOT_VALID:Lcom/sensorsdata/abtest/entity/SABErrorEnum;

.field public static final enum ASYNC_REQUEST_PROPERTIES_NOT_VALID:Lcom/sensorsdata/abtest/entity/SABErrorEnum;

.field public static final enum ASYNC_REQUEST_TIMEOUT:Lcom/sensorsdata/abtest/entity/SABErrorEnum;

.field public static final enum SDK_NULL_BASE_URL_OF_SENSORS_AB_TEST_CONFIG_OPTIONS:Lcom/sensorsdata/abtest/entity/SABErrorEnum;

.field public static final enum SDK_NULL_CONTEXT:Lcom/sensorsdata/abtest/entity/SABErrorEnum;

.field public static final enum SDK_NULL_KEY_OF_SENSORS_AB_TEST_CONFIG_OPTIONS:Lcom/sensorsdata/abtest/entity/SABErrorEnum;

.field public static final enum SDK_NULL_SENSORS_AB_TEST_CONFIG_OPTIONS:Lcom/sensorsdata/abtest/entity/SABErrorEnum;


# instance fields
.field public code:Ljava/lang/String;

.field public message:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 14

    .line 1
    .line 2
    new-instance v0, Lcom/sensorsdata/abtest/entity/SABErrorEnum;

    .line 3
    .line 4
    const-string v1, "0001"

    .line 5
    .line 6
    const-string v2, "Context must be not empty!"

    .line 7
    .line 8
    const-string v3, "SDK_NULL_CONTEXT"

    .line 9
    const/4 v4, 0x0

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, v3, v4, v1, v2}, Lcom/sensorsdata/abtest/entity/SABErrorEnum;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 13
    .line 14
    sput-object v0, Lcom/sensorsdata/abtest/entity/SABErrorEnum;->SDK_NULL_CONTEXT:Lcom/sensorsdata/abtest/entity/SABErrorEnum;

    .line 15
    .line 16
    new-instance v1, Lcom/sensorsdata/abtest/entity/SABErrorEnum;

    .line 17
    .line 18
    const-string v2, "0002"

    .line 19
    .line 20
    const-string v3, "SensorsABTestConfigOptions can not be null"

    .line 21
    .line 22
    const-string v4, "SDK_NULL_SENSORS_AB_TEST_CONFIG_OPTIONS"

    .line 23
    const/4 v5, 0x1

    .line 24
    .line 25
    .line 26
    invoke-direct {v1, v4, v5, v2, v3}, Lcom/sensorsdata/abtest/entity/SABErrorEnum;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 27
    .line 28
    sput-object v1, Lcom/sensorsdata/abtest/entity/SABErrorEnum;->SDK_NULL_SENSORS_AB_TEST_CONFIG_OPTIONS:Lcom/sensorsdata/abtest/entity/SABErrorEnum;

    .line 29
    .line 30
    new-instance v2, Lcom/sensorsdata/abtest/entity/SABErrorEnum;

    .line 31
    .line 32
    const-string v3, "0003"

    .line 33
    .line 34
    const-string v4, "A/B Testing SDK \u521d\u59cb\u5316\u5931\u8d25\uff0c\u8bf7\u4f7f\u7528\u6b63\u786e\u7684 URL"

    .line 35
    .line 36
    const-string v5, "SDK_NULL_BASE_URL_OF_SENSORS_AB_TEST_CONFIG_OPTIONS"

    .line 37
    const/4 v6, 0x2

    .line 38
    .line 39
    .line 40
    invoke-direct {v2, v5, v6, v3, v4}, Lcom/sensorsdata/abtest/entity/SABErrorEnum;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 41
    .line 42
    sput-object v2, Lcom/sensorsdata/abtest/entity/SABErrorEnum;->SDK_NULL_BASE_URL_OF_SENSORS_AB_TEST_CONFIG_OPTIONS:Lcom/sensorsdata/abtest/entity/SABErrorEnum;

    .line 43
    .line 44
    new-instance v3, Lcom/sensorsdata/abtest/entity/SABErrorEnum;

    .line 45
    .line 46
    const-string v4, "0004"

    .line 47
    .line 48
    const-string v5, "A/B Testing SDK \u521d\u59cb\u5316\u5931\u8d25\uff0c\u8bf7\u4f7f\u7528\u6b63\u786e\u7684 URL\uff08\u5fc5\u987b\u5305\u542b project-key)"

    .line 49
    .line 50
    const-string v6, "SDK_NULL_KEY_OF_SENSORS_AB_TEST_CONFIG_OPTIONS"

    .line 51
    const/4 v7, 0x3

    .line 52
    .line 53
    .line 54
    invoke-direct {v3, v6, v7, v4, v5}, Lcom/sensorsdata/abtest/entity/SABErrorEnum;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 55
    .line 56
    sput-object v3, Lcom/sensorsdata/abtest/entity/SABErrorEnum;->SDK_NULL_KEY_OF_SENSORS_AB_TEST_CONFIG_OPTIONS:Lcom/sensorsdata/abtest/entity/SABErrorEnum;

    .line 57
    .line 58
    new-instance v4, Lcom/sensorsdata/abtest/entity/SABErrorEnum;

    .line 59
    .line 60
    const-string v5, "1001"

    .line 61
    .line 62
    const-string v6, "The experiment param name of async request is empty and return default value: %s"

    .line 63
    .line 64
    const-string v7, "ASYNC_REQUEST_NULL_EXPERIMENT_PARAMETER_NAME"

    .line 65
    const/4 v8, 0x4

    .line 66
    .line 67
    .line 68
    invoke-direct {v4, v7, v8, v5, v6}, Lcom/sensorsdata/abtest/entity/SABErrorEnum;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 69
    .line 70
    sput-object v4, Lcom/sensorsdata/abtest/entity/SABErrorEnum;->ASYNC_REQUEST_NULL_EXPERIMENT_PARAMETER_NAME:Lcom/sensorsdata/abtest/entity/SABErrorEnum;

    .line 71
    .line 72
    new-instance v5, Lcom/sensorsdata/abtest/entity/SABErrorEnum;

    .line 73
    .line 74
    const-string v6, "1002"

    .line 75
    .line 76
    const-string v7, "Network is unavailable and return default value: %s"

    .line 77
    .line 78
    const-string v8, "ASYNC_REQUEST_NETWORK_UNAVAILABLE"

    .line 79
    const/4 v9, 0x5

    .line 80
    .line 81
    .line 82
    invoke-direct {v5, v8, v9, v6, v7}, Lcom/sensorsdata/abtest/entity/SABErrorEnum;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 83
    .line 84
    sput-object v5, Lcom/sensorsdata/abtest/entity/SABErrorEnum;->ASYNC_REQUEST_NETWORK_UNAVAILABLE:Lcom/sensorsdata/abtest/entity/SABErrorEnum;

    .line 85
    .line 86
    new-instance v6, Lcom/sensorsdata/abtest/entity/SABErrorEnum;

    .line 87
    .line 88
    const-string v7, "1003"

    .line 89
    .line 90
    const-string v8, "AsyncRequest is timeout and return default value: %s"

    .line 91
    .line 92
    const-string v9, "ASYNC_REQUEST_TIMEOUT"

    .line 93
    const/4 v10, 0x6

    .line 94
    .line 95
    .line 96
    invoke-direct {v6, v9, v10, v7, v8}, Lcom/sensorsdata/abtest/entity/SABErrorEnum;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 97
    .line 98
    sput-object v6, Lcom/sensorsdata/abtest/entity/SABErrorEnum;->ASYNC_REQUEST_TIMEOUT:Lcom/sensorsdata/abtest/entity/SABErrorEnum;

    .line 99
    .line 100
    new-instance v7, Lcom/sensorsdata/abtest/entity/SABErrorEnum;

    .line 101
    .line 102
    const-string v8, "1004"

    .line 103
    .line 104
    .line 105
    const-string/jumbo v9, "\u8bd5\u9a8c\u7ed3\u679c\u7c7b\u578b\u4e0e\u4ee3\u7801\u671f\u671b\u7c7b\u578b\u4e0d\u4e00\u81f4\uff0c\u8bd5\u9a8c\u53c2\u6570\u540d\uff1a%s\uff0c\u5f53\u524d\u8fd4\u56de\u7c7b\u578b\u4e3a\uff1a%s\uff0c\u4ee3\u7801\u671f\u671b\u7c7b\u578b\u4e3a\uff1a%s"

    .line 106
    .line 107
    const-string v10, "ASYNC_REQUEST_PARAMS_TYPE_NOT_VALID"

    .line 108
    const/4 v11, 0x7

    .line 109
    .line 110
    .line 111
    invoke-direct {v7, v10, v11, v8, v9}, Lcom/sensorsdata/abtest/entity/SABErrorEnum;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 112
    .line 113
    sput-object v7, Lcom/sensorsdata/abtest/entity/SABErrorEnum;->ASYNC_REQUEST_PARAMS_TYPE_NOT_VALID:Lcom/sensorsdata/abtest/entity/SABErrorEnum;

    .line 114
    .line 115
    new-instance v8, Lcom/sensorsdata/abtest/entity/SABErrorEnum;

    .line 116
    .line 117
    const-string v9, "1005"

    .line 118
    .line 119
    .line 120
    const-string/jumbo v10, "\u8bf7\u6c42\u8bd5\u9a8c\u7684\u81ea\u5b9a\u4e49\u53c2\u6570\u6821\u9a8c\u4e0d\u901a\u8fc7: %s"

    .line 121
    .line 122
    const-string v11, "ASYNC_REQUEST_PROPERTIES_NOT_VALID"

    .line 123
    .line 124
    const/16 v12, 0x8

    .line 125
    .line 126
    .line 127
    invoke-direct {v8, v11, v12, v9, v10}, Lcom/sensorsdata/abtest/entity/SABErrorEnum;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 128
    .line 129
    sput-object v8, Lcom/sensorsdata/abtest/entity/SABErrorEnum;->ASYNC_REQUEST_PROPERTIES_NOT_VALID:Lcom/sensorsdata/abtest/entity/SABErrorEnum;

    .line 130
    .line 131
    new-instance v9, Lcom/sensorsdata/abtest/entity/SABErrorEnum;

    .line 132
    .line 133
    const-string v10, "1006"

    .line 134
    .line 135
    .line 136
    const-string/jumbo v11, "\u8bf7\u6c42\u7684\u8bd5\u9a8c\u6ca1\u6709\u5728 fuzzy experiments list \u4e2d"

    .line 137
    .line 138
    const-string v12, "ASYNC_REQUEST_EXPERIMENT_NOT_IN_FUZZY"

    .line 139
    .line 140
    const/16 v13, 0x9

    .line 141
    .line 142
    .line 143
    invoke-direct {v9, v12, v13, v10, v11}, Lcom/sensorsdata/abtest/entity/SABErrorEnum;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 144
    .line 145
    sput-object v9, Lcom/sensorsdata/abtest/entity/SABErrorEnum;->ASYNC_REQUEST_EXPERIMENT_NOT_IN_FUZZY:Lcom/sensorsdata/abtest/entity/SABErrorEnum;

    .line 146
    .line 147
    .line 148
    filled-new-array/range {v0 .. v9}, [Lcom/sensorsdata/abtest/entity/SABErrorEnum;

    .line 149
    move-result-object v0

    .line 150
    .line 151
    sput-object v0, Lcom/sensorsdata/abtest/entity/SABErrorEnum;->$VALUES:[Lcom/sensorsdata/abtest/entity/SABErrorEnum;

    .line 152
    return-void
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

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 4
    .line 5
    iput-object p3, p0, Lcom/sensorsdata/abtest/entity/SABErrorEnum;->code:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/sensorsdata/abtest/entity/SABErrorEnum;->message:Ljava/lang/String;

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
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/sensorsdata/abtest/entity/SABErrorEnum;
    .locals 1

    .line 1
    .line 2
    const-class v0, Lcom/sensorsdata/abtest/entity/SABErrorEnum;

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Lcom/sensorsdata/abtest/entity/SABErrorEnum;

    .line 9
    return-object p0
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

.method public static values()[Lcom/sensorsdata/abtest/entity/SABErrorEnum;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/sensorsdata/abtest/entity/SABErrorEnum;->$VALUES:[Lcom/sensorsdata/abtest/entity/SABErrorEnum;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, [Lcom/sensorsdata/abtest/entity/SABErrorEnum;->clone()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, [Lcom/sensorsdata/abtest/entity/SABErrorEnum;

    .line 9
    return-object v0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method
