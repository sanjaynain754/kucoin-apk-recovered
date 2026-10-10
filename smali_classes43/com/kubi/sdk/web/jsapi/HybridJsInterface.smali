.class public final Lcom/kubi/sdk/web/jsapi/HybridJsInterface;
.super Ljava/lang/Object;
.source "HybridJsInterface.kt"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/sdk/web/jsapi/HybridJsInterface$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0001\u0018\u0000 \t2\u00020\u0001:\u0001\tB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0008H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/kubi/sdk/web/jsapi/HybridJsInterface;",
        "",
        "bridge",
        "Lcom/kubi/sdk/web/core/WebBridge;",
        "(Lcom/kubi/sdk/web/core/WebBridge;)V",
        "prompt",
        "",
        "message",
        "",
        "Companion",
        "KWebView_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nHybridJsInterface.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HybridJsInterface.kt\ncom/kubi/sdk/web/jsapi/HybridJsInterface\n+ 2 WebCoreException.kt\ncom/kubi/sdk/web/core/WebCoreExceptionKt\n*L\n1#1,116:1\n85#2,4:117\n85#2,4:121\n85#2,4:125\n85#2,4:129\n86#2,3:133\n*S KotlinDebug\n*F\n+ 1 HybridJsInterface.kt\ncom/kubi/sdk/web/jsapi/HybridJsInterface\n*L\n63#1:117,4\n91#1:121,4\n99#1:125,4\n105#1:129,4\n111#1:133,3\n*E\n"
    }
.end annotation


# static fields
.field public static final Companion:Lcom/kubi/sdk/web/jsapi/HybridJsInterface$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final TAG:Ljava/lang/String; = "HybridJsInterface"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field private final bridge:Lcom/kubi/sdk/web/core/WebBridge;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/sdk/web/jsapi/HybridJsInterface$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/kubi/sdk/web/jsapi/HybridJsInterface$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/kubi/sdk/web/jsapi/HybridJsInterface;->Companion:Lcom/kubi/sdk/web/jsapi/HybridJsInterface$Companion;

    .line 9
    return-void
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
.end method

.method public constructor <init>(Lcom/kubi/sdk/web/core/WebBridge;)V
    .locals 1
    .param p1    # Lcom/kubi/sdk/web/core/WebBridge;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "bridge"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    iput-object p1, p0, Lcom/kubi/sdk/web/jsapi/HybridJsInterface;->bridge:Lcom/kubi/sdk/web/core/WebBridge;

    .line 11
    return-void
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
    .line 245
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
.end method


# virtual methods
.method public final prompt(Ljava/lang/String;)V
    .locals 23
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    .line 1
    const-string v2, "type"

    const-string v3, "name"

    const-string v4, "module"

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v7

    if-nez v7, :cond_1

    :cond_0
    const/4 v3, 0x2

    const/4 v4, 0x0

    goto/16 :goto_5

    .line 2
    :cond_1
    sget-object v7, Lcom/kubi/sdk/web/util/b;->a:Lcom/kubi/sdk/web/util/b;

    const-string v8, "js prompt"

    const-string v9, "jsInoke"

    invoke-virtual {v7, v9, v8}, Lcom/kubi/sdk/web/util/b;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    iget-object v8, v1, Lcom/kubi/sdk/web/jsapi/HybridJsInterface;->bridge:Lcom/kubi/sdk/web/core/WebBridge;

    invoke-virtual {v8}, Lcom/kubi/sdk/web/core/WebBridge;->s()Lcom/kubi/sdk/web/jsapi/JsEventQueue;

    move-result-object v8

    invoke-virtual {v8}, Lcom/kubi/sdk/web/jsapi/JsEventQueue;->c()V

    .line 4
    :try_start_0
    new-instance v8, Lorg/json/JSONObject;

    invoke-direct {v8, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 5
    invoke-virtual {v8, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 6
    invoke-virtual {v8, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    const-string v11, ", cb:"

    const-string v12, ", cbId:"

    const-string v13, ", value: "

    const-string v14, "eventObj type: "

    const-string v15, "callbackId"

    const-string v5, "callback"

    if-eqz v0, :cond_3

    :try_start_1
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v16

    if-nez v16, :cond_2

    goto :goto_0

    :cond_2
    if-eqz v10, :cond_3

    invoke-interface {v10}, Ljava/lang/CharSequence;->length()I

    move-result v16

    if-nez v16, :cond_4

    :cond_3
    :goto_0
    move-object v3, v9

    goto/16 :goto_2

    .line 8
    :cond_4
    const-string v2, "HybridJsInterface"

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v17, v9

    const-string v9, "\u65b0\u63a5\u53e3\u8c03\u7528: module="

    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v9, ", name="

    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v7, v2, v6}, Lcom/kubi/sdk/web/util/b;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    invoke-virtual {v8, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 10
    invoke-virtual {v8, v15}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 11
    const-string v6, "arguments"

    invoke-virtual {v8, v6}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v6

    if-nez v6, :cond_5

    new-instance v6, Lorg/json/JSONObject;

    invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V

    goto :goto_1

    :catch_0
    move-exception v0

    move-object v3, v0

    goto/16 :goto_4

    .line 12
    :cond_5
    :goto_1
    sget-object v8, Lcom/kubi/sdk/web/jsapi/JsBridgeCallbackImpl;->d:Lcom/kubi/sdk/web/jsapi/JsBridgeCallbackImpl$Companion;

    iget-object v9, v1, Lcom/kubi/sdk/web/jsapi/HybridJsInterface;->bridge:Lcom/kubi/sdk/web/core/WebBridge;

    invoke-virtual {v8, v9, v2, v5}, Lcom/kubi/sdk/web/jsapi/JsBridgeCallbackImpl$Companion;->obtain(Lcom/kubi/sdk/web/core/WebBridge;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/sdk/web/jsapi/a;

    move-result-object v8

    .line 13
    sget-object v9, Lcom/kubi/sdk/web/jsapi/HybridJsInterface;->Companion:Lcom/kubi/sdk/web/jsapi/HybridJsInterface$Companion;

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v10, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v9, v0, v10, v6, v8}, Lcom/kubi/sdk/web/jsapi/HybridJsInterface$Companion;->access$createEventForNewApi(Lcom/kubi/sdk/web/jsapi/HybridJsInterface$Companion;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Lcom/kubi/sdk/web/jsapi/a;)Lcom/kubi/sdk/web/jsapi/JsBridgeEvent;

    move-result-object v0

    .line 14
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lcom/kubi/sdk/web/jsapi/JsBridgeEvent;->g()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lcom/kubi/sdk/web/jsapi/JsBridgeEvent;->h()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v3, v17

    invoke-virtual {v7, v3, v2}, Lcom/kubi/sdk/web/util/b;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    iget-object v2, v1, Lcom/kubi/sdk/web/jsapi/HybridJsInterface;->bridge:Lcom/kubi/sdk/web/core/WebBridge;

    invoke-virtual {v2, v0}, Lcom/kubi/sdk/web/core/WebBridge;->n(Lcom/kubi/sdk/web/jsapi/JsBridgeEvent;)V

    return-void

    .line 16
    :goto_2
    invoke-virtual {v8, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_9

    .line 17
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-nez v4, :cond_6

    goto/16 :goto_3

    .line 18
    :cond_6
    invoke-virtual {v8, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 19
    invoke-virtual {v8, v15}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 20
    const-string v6, "params"

    invoke-virtual {v8, v6}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v6

    if-nez v6, :cond_7

    .line 21
    const-string v19, "HybridJsInterface"

    const-string v18, "params is empty"

    .line 22
    new-instance v17, Lcom/kubi/sdk/web/core/WebCoreMessage;

    const/16 v21, 0x4

    const/16 v22, 0x0

    const/16 v20, 0x0

    invoke-direct/range {v17 .. v22}, Lcom/kubi/sdk/web/core/WebCoreMessage;-><init>(Ljava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v0, v17

    const/4 v2, 0x2

    const/4 v3, 0x0

    .line 23
    invoke-static {v0, v3, v2, v3}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    return-void

    .line 24
    :cond_7
    sget-object v8, Lcom/kubi/sdk/web/jsapi/JsBridgeCallbackImpl;->d:Lcom/kubi/sdk/web/jsapi/JsBridgeCallbackImpl$Companion;

    iget-object v9, v1, Lcom/kubi/sdk/web/jsapi/HybridJsInterface;->bridge:Lcom/kubi/sdk/web/core/WebBridge;

    invoke-virtual {v8, v9, v4, v5}, Lcom/kubi/sdk/web/jsapi/JsBridgeCallbackImpl$Companion;->obtain(Lcom/kubi/sdk/web/core/WebBridge;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/sdk/web/jsapi/a;

    move-result-object v8

    .line 25
    sget-object v9, Lcom/kubi/sdk/web/jsapi/HybridJsInterface;->Companion:Lcom/kubi/sdk/web/jsapi/HybridJsInterface$Companion;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    const-string v10, "ROOT"

    invoke-static {v2, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "this as java.lang.String).toLowerCase(locale)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v9, v0, v6, v8}, Lcom/kubi/sdk/web/jsapi/HybridJsInterface$Companion;->access$createEvent(Lcom/kubi/sdk/web/jsapi/HybridJsInterface$Companion;Ljava/lang/String;Lorg/json/JSONObject;Lcom/kubi/sdk/web/jsapi/a;)Lcom/kubi/sdk/web/jsapi/JsBridgeEvent;

    move-result-object v0

    if-nez v0, :cond_8

    .line 26
    const-string v19, "HybridJsInterface"

    const-string v18, "eventObj is error"

    .line 27
    new-instance v17, Lcom/kubi/sdk/web/core/WebCoreMessage;

    const/16 v21, 0x4

    const/16 v22, 0x0

    const/16 v20, 0x0

    invoke-direct/range {v17 .. v22}, Lcom/kubi/sdk/web/core/WebCoreMessage;-><init>(Ljava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v0, v17

    const/4 v2, 0x2

    const/4 v3, 0x0

    .line 28
    invoke-static {v0, v3, v2, v3}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    return-void

    .line 29
    :cond_8
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lcom/kubi/sdk/web/jsapi/JsBridgeEvent;->g()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lcom/kubi/sdk/web/jsapi/JsBridgeEvent;->h()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v7, v3, v2}, Lcom/kubi/sdk/web/util/b;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    iget-object v2, v1, Lcom/kubi/sdk/web/jsapi/HybridJsInterface;->bridge:Lcom/kubi/sdk/web/core/WebBridge;

    invoke-virtual {v2, v0}, Lcom/kubi/sdk/web/core/WebBridge;->n(Lcom/kubi/sdk/web/jsapi/JsBridgeEvent;)V

    return-void

    .line 31
    :cond_9
    :goto_3
    const-string v4, "HybridJsInterface"

    const-string v3, "type is empty"

    .line 32
    new-instance v2, Lcom/kubi/sdk/web/core/WebCoreMessage;

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v7}, Lcom/kubi/sdk/web/core/WebCoreMessage;-><init>(Ljava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v3, 0x2

    const/4 v4, 0x0

    .line 33
    invoke-static {v2, v4, v3, v4}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-void

    .line 34
    :goto_4
    new-instance v2, Lcom/kubi/sdk/web/core/WebCoreException;

    const/4 v7, 0x4

    const/4 v8, 0x0

    const-string v4, "HybridJsInterface"

    const/4 v5, 0x0

    const-string v6, "jsapi err"

    invoke-direct/range {v2 .. v8}, Lcom/kubi/sdk/web/core/WebCoreException;-><init>(Ljava/lang/Throwable;Ljava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v3, 0x2

    const/4 v4, 0x0

    .line 35
    invoke-static {v2, v4, v3, v4}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    return-void

    .line 36
    :goto_5
    new-instance v5, Lcom/kubi/sdk/web/core/WebCoreMessage;

    const/4 v9, 0x4

    const/4 v10, 0x0

    const-string v6, "message is empty"

    const-string v7, "HybridJsInterface"

    const/4 v8, 0x0

    invoke-direct/range {v5 .. v10}, Lcom/kubi/sdk/web/core/WebCoreMessage;-><init>(Ljava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 37
    invoke-static {v5, v4, v3, v4}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    return-void
.end method
