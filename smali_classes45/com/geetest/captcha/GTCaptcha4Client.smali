.class public final Lcom/geetest/captcha/GTCaptcha4Client;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/geetest/captcha/NoProguard;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/geetest/captcha/GTCaptcha4Client$OnSuccessListener;,
        Lcom/geetest/captcha/GTCaptcha4Client$OnFailureListener;,
        Lcom/geetest/captcha/GTCaptcha4Client$OnWebViewShowListener;,
        Lcom/geetest/captcha/GTCaptcha4Client$OnDialogShowListener;
    }
.end annotation


# instance fields
.field public final a:Lcom/geetest/captcha/m;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/geetest/captcha/m;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, p1}, Lcom/geetest/captcha/m;-><init>(Landroid/content/Context;)V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/geetest/captcha/GTCaptcha4Client;->a:Lcom/geetest/captcha/m;

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
.end method

.method public static getClient(Landroid/content/Context;)Lcom/geetest/captcha/GTCaptcha4Client;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/geetest/captcha/GTCaptcha4Client;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0}, Lcom/geetest/captcha/GTCaptcha4Client;-><init>(Landroid/content/Context;)V

    .line 6
    return-object v0
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
.end method

.method public static getVersion()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    const-string v0, "1.8.9"

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
    .line 18
.end method

.method public static isSupportWebView(Landroid/content/Context;)Landroid/util/Pair;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Landroid/util/Pair<",
            "Ljava/lang/Boolean;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/geetest/captcha/m$b;->a(Landroid/content/Context;)Landroid/util/Pair;

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
.end method


# virtual methods
.method public addOnFailureListener(Lcom/geetest/captcha/GTCaptcha4Client$OnFailureListener;)Lcom/geetest/captcha/GTCaptcha4Client;
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/geetest/captcha/GTCaptcha4Client;->a:Lcom/geetest/captcha/m;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    const-string v1, "listener"

    .line 8
    .line 9
    .line 10
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    iput-object p1, v0, Lcom/geetest/captcha/m;->c:Lcom/geetest/captcha/GTCaptcha4Client$OnFailureListener;

    .line 13
    return-object p0
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
.end method

.method public addOnSuccessListener(Lcom/geetest/captcha/GTCaptcha4Client$OnSuccessListener;)Lcom/geetest/captcha/GTCaptcha4Client;
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/geetest/captcha/GTCaptcha4Client;->a:Lcom/geetest/captcha/m;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const-string/jumbo v1, "response"

    .line 9
    .line 10
    .line 11
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    iput-object p1, v0, Lcom/geetest/captcha/m;->b:Lcom/geetest/captcha/GTCaptcha4Client$OnSuccessListener;

    .line 14
    return-object p0
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

.method public addOnWebViewShowListener(Lcom/geetest/captcha/GTCaptcha4Client$OnWebViewShowListener;)Lcom/geetest/captcha/GTCaptcha4Client;
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/geetest/captcha/GTCaptcha4Client;->a:Lcom/geetest/captcha/m;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const-string/jumbo v1, "webViewShowListener"

    .line 9
    .line 10
    .line 11
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    iput-object p1, v0, Lcom/geetest/captcha/m;->d:Lcom/geetest/captcha/GTCaptcha4Client$OnWebViewShowListener;

    .line 14
    return-object p0
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

.method public cancel()V
    .locals 10

    .line 1
    .line 2
    iget-object v0, p0, Lcom/geetest/captcha/GTCaptcha4Client;->a:Lcom/geetest/captcha/m;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 9
    move-result-wide v1

    .line 10
    .line 11
    sget-wide v3, Lcom/geetest/captcha/m;->e:J

    .line 12
    sub-long/2addr v1, v3

    .line 13
    .line 14
    const-wide/16 v3, 0x3e8

    .line 15
    .line 16
    cmp-long v1, v1, v3

    .line 17
    .line 18
    if-gez v1, :cond_0

    .line 19
    .line 20
    sget-object v0, Lcom/geetest/captcha/utils/LogUtils;->a:Lcom/geetest/captcha/utils/LogUtils;

    .line 21
    .line 22
    const-string v1, "The interval between the two cancel is at least 1 second."

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, Lcom/geetest/captcha/utils/LogUtils;->release(Ljava/lang/String;)V

    .line 26
    return-void

    .line 27
    .line 28
    :cond_0
    iget-object v0, v0, Lcom/geetest/captcha/m;->a:Lcom/geetest/captcha/b;

    .line 29
    .line 30
    iget-object v1, v0, Lcom/geetest/captcha/b;->g:Lcom/geetest/captcha/x;

    .line 31
    .line 32
    .line 33
    const-string/jumbo v2, "request"

    .line 34
    const/4 v3, 0x0

    .line 35
    .line 36
    if-nez v1, :cond_1

    .line 37
    .line 38
    .line 39
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 40
    move-object v1, v3

    .line 41
    .line 42
    .line 43
    :cond_1
    invoke-virtual {v1}, Lcom/geetest/captcha/x;->a()Z

    .line 44
    move-result v1

    .line 45
    .line 46
    if-eqz v1, :cond_2

    .line 47
    .line 48
    goto/16 :goto_2

    .line 49
    .line 50
    :cond_2
    iget-object v1, v0, Lcom/geetest/captcha/b;->g:Lcom/geetest/captcha/x;

    .line 51
    .line 52
    if-nez v1, :cond_3

    .line 53
    .line 54
    .line 55
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 56
    move-object v1, v3

    .line 57
    .line 58
    :cond_3
    sget-object v4, Lcom/geetest/captcha/a0;->FAIL:Lcom/geetest/captcha/a0;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1, v4}, Lcom/geetest/captcha/x;->a(Lcom/geetest/captcha/a0;)V

    .line 62
    .line 63
    sget-object v1, Lcom/geetest/captcha/a0;->CANCEL:Lcom/geetest/captcha/a0;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1}, Lcom/geetest/captcha/a0;->getType()Ljava/lang/String;

    .line 67
    move-result-object v1

    .line 68
    .line 69
    new-instance v4, Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 73
    .line 74
    sget-object v5, Lcom/geetest/captcha/i;->USER_ERROR:Lcom/geetest/captcha/i;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v5}, Lcom/geetest/captcha/i;->getType()Ljava/lang/String;

    .line 78
    move-result-object v5

    .line 79
    .line 80
    .line 81
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    const-string v5, "60"

    .line 84
    .line 85
    .line 86
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 90
    move-result-object v4

    .line 91
    .line 92
    const-string v5, "code"

    .line 93
    .line 94
    .line 95
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 96
    .line 97
    new-instance v6, Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 110
    move-result-object v1

    .line 111
    .line 112
    sget-object v4, Lcom/geetest/captcha/j;->f:Ljava/lang/String;

    .line 113
    .line 114
    new-instance v6, Lorg/json/JSONObject;

    .line 115
    .line 116
    .line 117
    invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V

    .line 118
    .line 119
    const-string v7, "description"

    .line 120
    .line 121
    const-string v8, "User cancelled \'Captcha\'"

    .line 122
    .line 123
    .line 124
    invoke-virtual {v6, v7, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 125
    .line 126
    sget-object v7, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 127
    .line 128
    .line 129
    invoke-static {v1, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 130
    .line 131
    const-string v7, "msg"

    .line 132
    .line 133
    .line 134
    invoke-static {v4, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 135
    .line 136
    const-string v8, "desc"

    .line 137
    .line 138
    .line 139
    invoke-static {v6, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 140
    .line 141
    new-instance v9, Lorg/json/JSONObject;

    .line 142
    .line 143
    .line 144
    invoke-direct {v9}, Lorg/json/JSONObject;-><init>()V

    .line 145
    .line 146
    .line 147
    :try_start_0
    invoke-virtual {v9, v5, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v9, v7, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v9, v8, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 154
    goto :goto_0

    .line 155
    :catch_0
    move-exception v1

    .line 156
    .line 157
    .line 158
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 159
    .line 160
    .line 161
    :goto_0
    invoke-virtual {v9}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 162
    move-result-object v1

    .line 163
    .line 164
    const-string v4, "jsonObject.toString()"

    .line 165
    .line 166
    .line 167
    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 168
    .line 169
    sget-object v4, Lcom/geetest/captcha/utils/LogUtils;->a:Lcom/geetest/captcha/utils/LogUtils;

    .line 170
    .line 171
    new-instance v5, Ljava/lang/StringBuilder;

    .line 172
    .line 173
    const-string v6, "Controller: "

    .line 174
    .line 175
    .line 176
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 183
    move-result-object v5

    .line 184
    .line 185
    .line 186
    invoke-virtual {v4, v5}, Lcom/geetest/captcha/utils/LogUtils;->release(Ljava/lang/String;)V

    .line 187
    .line 188
    iget-object v4, v0, Lcom/geetest/captcha/b;->g:Lcom/geetest/captcha/x;

    .line 189
    .line 190
    if-nez v4, :cond_4

    .line 191
    .line 192
    .line 193
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 194
    move-object v4, v3

    .line 195
    .line 196
    :cond_4
    iget-object v5, v4, Lcom/geetest/captcha/x;->e:Lcom/geetest/captcha/e;

    .line 197
    .line 198
    if-eqz v5, :cond_5

    .line 199
    .line 200
    .line 201
    invoke-virtual {v5}, Lcom/geetest/captcha/e;->a()V

    .line 202
    .line 203
    :cond_5
    iput-object v3, v4, Lcom/geetest/captcha/x;->e:Lcom/geetest/captcha/e;

    .line 204
    .line 205
    iget-object v0, v0, Lcom/geetest/captcha/b;->g:Lcom/geetest/captcha/x;

    .line 206
    .line 207
    if-nez v0, :cond_6

    .line 208
    .line 209
    .line 210
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 211
    goto :goto_1

    .line 212
    :cond_6
    move-object v3, v0

    .line 213
    .line 214
    .line 215
    :goto_1
    invoke-virtual {v3, v1}, Lcom/geetest/captcha/x;->a(Ljava/lang/String;)V

    .line 216
    :goto_2
    return-void
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
.end method

.method public configurationChanged(Landroid/content/res/Configuration;)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/geetest/captcha/GTCaptcha4Client;->a:Lcom/geetest/captcha/m;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    const-string v1, "newConfig"

    .line 8
    .line 9
    .line 10
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    iget-object v0, v0, Lcom/geetest/captcha/m;->a:Lcom/geetest/captcha/b;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    :try_start_0
    iget-object p1, v0, Lcom/geetest/captcha/b;->g:Lcom/geetest/captcha/x;

    .line 21
    .line 22
    if-nez p1, :cond_0

    .line 23
    .line 24
    .line 25
    const-string/jumbo p1, "request"

    .line 26
    .line 27
    .line 28
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 29
    const/4 p1, 0x0

    .line 30
    goto :goto_0

    .line 31
    :catch_0
    move-exception p1

    .line 32
    goto :goto_1

    .line 33
    .line 34
    :cond_0
    :goto_0
    iget-object p1, p1, Lcom/geetest/captcha/x;->e:Lcom/geetest/captcha/e;

    .line 35
    .line 36
    if-eqz p1, :cond_1

    .line 37
    .line 38
    iget-object p1, p1, Lcom/geetest/captcha/e;->a:Lcom/geetest/captcha/l;

    .line 39
    .line 40
    if-eqz p1, :cond_1

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1}, Lcom/geetest/captcha/l;->a()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 44
    return-void

    .line 45
    .line 46
    .line 47
    :goto_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 48
    :cond_1
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
.end method

.method public destroy()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/geetest/captcha/GTCaptcha4Client;->a:Lcom/geetest/captcha/m;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    sget-object v0, Lcom/geetest/captcha/utils/LogUtils;->a:Lcom/geetest/captcha/utils/LogUtils;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/geetest/captcha/utils/LogUtils;->destroy()V

    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public init(Ljava/lang/String;)Lcom/geetest/captcha/GTCaptcha4Client;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/geetest/captcha/GTCaptcha4Client;->a:Lcom/geetest/captcha/m;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lcom/geetest/captcha/m;->a(Ljava/lang/String;Lcom/geetest/captcha/GTCaptcha4Config;)V

    return-object p0
.end method

.method public init(Ljava/lang/String;Lcom/geetest/captcha/GTCaptcha4Config;)Lcom/geetest/captcha/GTCaptcha4Client;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/geetest/captcha/GTCaptcha4Client;->a:Lcom/geetest/captcha/m;

    invoke-virtual {v0, p1, p2}, Lcom/geetest/captcha/m;->a(Ljava/lang/String;Lcom/geetest/captcha/GTCaptcha4Config;)V

    return-object p0
.end method

.method public setLogEnable(Z)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/geetest/captcha/GTCaptcha4Client;->a:Lcom/geetest/captcha/m;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    sget-object v0, Lcom/geetest/captcha/utils/LogUtils;->a:Lcom/geetest/captcha/utils/LogUtils;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lcom/geetest/captcha/utils/LogUtils;->setReleaseLog(Z)V

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
.end method

.method public verifyWithCaptcha()Lcom/geetest/captcha/GTCaptcha4Client;
    .locals 11

    .line 1
    .line 2
    iget-object v0, p0, Lcom/geetest/captcha/GTCaptcha4Client;->a:Lcom/geetest/captcha/m;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 9
    move-result-wide v1

    .line 10
    .line 11
    sget-wide v3, Lcom/geetest/captcha/m;->e:J

    .line 12
    sub-long/2addr v1, v3

    .line 13
    .line 14
    const-wide/16 v3, 0x3e8

    .line 15
    .line 16
    cmp-long v1, v1, v3

    .line 17
    .line 18
    if-gez v1, :cond_0

    .line 19
    .line 20
    sget-object v0, Lcom/geetest/captcha/utils/LogUtils;->a:Lcom/geetest/captcha/utils/LogUtils;

    .line 21
    .line 22
    const-string v1, "The interval between the two captcha is at least 1 second."

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, Lcom/geetest/captcha/utils/LogUtils;->release(Ljava/lang/String;)V

    .line 26
    return-object p0

    .line 27
    .line 28
    .line 29
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 30
    move-result-wide v1

    .line 31
    .line 32
    sput-wide v1, Lcom/geetest/captcha/m;->e:J

    .line 33
    .line 34
    iget-object v1, v0, Lcom/geetest/captcha/m;->a:Lcom/geetest/captcha/b;

    .line 35
    .line 36
    iget-object v2, v0, Lcom/geetest/captcha/m;->b:Lcom/geetest/captcha/GTCaptcha4Client$OnSuccessListener;

    .line 37
    .line 38
    iput-object v2, v1, Lcom/geetest/captcha/b;->c:Lcom/geetest/captcha/GTCaptcha4Client$OnSuccessListener;

    .line 39
    .line 40
    iget-object v3, v0, Lcom/geetest/captcha/m;->c:Lcom/geetest/captcha/GTCaptcha4Client$OnFailureListener;

    .line 41
    .line 42
    iput-object v3, v1, Lcom/geetest/captcha/b;->d:Lcom/geetest/captcha/GTCaptcha4Client$OnFailureListener;

    .line 43
    .line 44
    iget-object v0, v0, Lcom/geetest/captcha/m;->d:Lcom/geetest/captcha/GTCaptcha4Client$OnWebViewShowListener;

    .line 45
    .line 46
    iput-object v0, v1, Lcom/geetest/captcha/b;->e:Lcom/geetest/captcha/GTCaptcha4Client$OnWebViewShowListener;

    .line 47
    .line 48
    iget-object v0, v1, Lcom/geetest/captcha/b;->a:Landroid/content/Context;

    .line 49
    .line 50
    if-eqz v3, :cond_1b

    .line 51
    .line 52
    const-string v3, "jsonObject.toString()"

    .line 53
    .line 54
    const-string v4, "description"

    .line 55
    .line 56
    const-string v5, "desc"

    .line 57
    .line 58
    const-string v6, "msg"

    .line 59
    .line 60
    const-string v7, "code"

    .line 61
    .line 62
    if-nez v2, :cond_1

    .line 63
    .line 64
    new-instance v0, Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 68
    .line 69
    sget-object v2, Lcom/geetest/captcha/a0;->FLOWING:Lcom/geetest/captcha/a0;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v2}, Lcom/geetest/captcha/a0;->getType()Ljava/lang/String;

    .line 73
    move-result-object v2

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    sget-object v2, Lcom/geetest/captcha/i;->PARAM:Lcom/geetest/captcha/i;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2}, Lcom/geetest/captcha/i;->getType()Ljava/lang/String;

    .line 82
    move-result-object v2

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    const-string v2, "70"

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 94
    move-result-object v0

    .line 95
    .line 96
    sget-object v2, Lcom/geetest/captcha/j;->e:Ljava/lang/String;

    .line 97
    .line 98
    new-instance v8, Lorg/json/JSONObject;

    .line 99
    .line 100
    .line 101
    invoke-direct {v8}, Lorg/json/JSONObject;-><init>()V

    .line 102
    .line 103
    const-string v9, "The GTC4SessionResponse object cannot be null"

    .line 104
    .line 105
    .line 106
    invoke-virtual {v8, v4, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 107
    .line 108
    sget-object v4, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 109
    .line 110
    .line 111
    invoke-static {v0, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    invoke-static {v2, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    invoke-static {v8, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 118
    .line 119
    new-instance v4, Lorg/json/JSONObject;

    .line 120
    .line 121
    .line 122
    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 123
    .line 124
    .line 125
    :try_start_0
    invoke-virtual {v4, v7, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v4, v6, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v4, v5, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 132
    goto :goto_0

    .line 133
    :catch_0
    move-exception v0

    .line 134
    .line 135
    .line 136
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 137
    .line 138
    .line 139
    :goto_0
    invoke-virtual {v4}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 140
    move-result-object v0

    .line 141
    .line 142
    .line 143
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 144
    .line 145
    sget-object v2, Lcom/geetest/captcha/utils/LogUtils;->a:Lcom/geetest/captcha/utils/LogUtils;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v2, v0}, Lcom/geetest/captcha/utils/LogUtils;->release(Ljava/lang/String;)V

    .line 149
    .line 150
    iget-object v1, v1, Lcom/geetest/captcha/b;->d:Lcom/geetest/captcha/GTCaptcha4Client$OnFailureListener;

    .line 151
    .line 152
    if-eqz v1, :cond_5

    .line 153
    .line 154
    .line 155
    invoke-interface {v1, v0}, Lcom/geetest/captcha/GTCaptcha4Client$OnFailureListener;->onFailure(Ljava/lang/String;)V

    .line 156
    .line 157
    goto/16 :goto_4

    .line 158
    .line 159
    :cond_1
    if-nez v0, :cond_2

    .line 160
    .line 161
    new-instance v0, Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 165
    .line 166
    sget-object v2, Lcom/geetest/captcha/a0;->FLOWING:Lcom/geetest/captcha/a0;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v2}, Lcom/geetest/captcha/a0;->getType()Ljava/lang/String;

    .line 170
    move-result-object v2

    .line 171
    .line 172
    .line 173
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    sget-object v2, Lcom/geetest/captcha/i;->PARAM:Lcom/geetest/captcha/i;

    .line 176
    .line 177
    .line 178
    invoke-virtual {v2}, Lcom/geetest/captcha/i;->getType()Ljava/lang/String;

    .line 179
    move-result-object v2

    .line 180
    .line 181
    .line 182
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    const-string v2, "71"

    .line 185
    .line 186
    .line 187
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 191
    move-result-object v0

    .line 192
    .line 193
    sget-object v2, Lcom/geetest/captcha/j;->e:Ljava/lang/String;

    .line 194
    .line 195
    new-instance v8, Lorg/json/JSONObject;

    .line 196
    .line 197
    .line 198
    invoke-direct {v8}, Lorg/json/JSONObject;-><init>()V

    .line 199
    .line 200
    const-string v9, "The context parameter should not be null"

    .line 201
    .line 202
    .line 203
    invoke-virtual {v8, v4, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 204
    .line 205
    sget-object v4, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 206
    .line 207
    .line 208
    invoke-static {v0, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    invoke-static {v2, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    invoke-static {v8, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 215
    .line 216
    new-instance v4, Lorg/json/JSONObject;

    .line 217
    .line 218
    .line 219
    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 220
    .line 221
    .line 222
    :try_start_1
    invoke-virtual {v4, v7, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 223
    .line 224
    .line 225
    invoke-virtual {v4, v6, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 226
    .line 227
    .line 228
    invoke-virtual {v4, v5, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    .line 229
    goto :goto_1

    .line 230
    :catch_1
    move-exception v0

    .line 231
    .line 232
    .line 233
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 234
    .line 235
    .line 236
    :goto_1
    invoke-virtual {v4}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 237
    move-result-object v0

    .line 238
    .line 239
    .line 240
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 241
    .line 242
    sget-object v2, Lcom/geetest/captcha/utils/LogUtils;->a:Lcom/geetest/captcha/utils/LogUtils;

    .line 243
    .line 244
    .line 245
    invoke-virtual {v2, v0}, Lcom/geetest/captcha/utils/LogUtils;->release(Ljava/lang/String;)V

    .line 246
    .line 247
    iget-object v1, v1, Lcom/geetest/captcha/b;->d:Lcom/geetest/captcha/GTCaptcha4Client$OnFailureListener;

    .line 248
    .line 249
    if-eqz v1, :cond_5

    .line 250
    .line 251
    .line 252
    invoke-interface {v1, v0}, Lcom/geetest/captcha/GTCaptcha4Client$OnFailureListener;->onFailure(Ljava/lang/String;)V

    .line 253
    .line 254
    goto/16 :goto_4

    .line 255
    .line 256
    :cond_2
    instance-of v0, v0, Landroid/app/Activity;

    .line 257
    .line 258
    if-nez v0, :cond_3

    .line 259
    .line 260
    new-instance v0, Ljava/lang/StringBuilder;

    .line 261
    .line 262
    .line 263
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 264
    .line 265
    sget-object v2, Lcom/geetest/captcha/a0;->FLOWING:Lcom/geetest/captcha/a0;

    .line 266
    .line 267
    .line 268
    invoke-virtual {v2}, Lcom/geetest/captcha/a0;->getType()Ljava/lang/String;

    .line 269
    move-result-object v2

    .line 270
    .line 271
    .line 272
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 273
    .line 274
    sget-object v2, Lcom/geetest/captcha/i;->PARAM:Lcom/geetest/captcha/i;

    .line 275
    .line 276
    .line 277
    invoke-virtual {v2}, Lcom/geetest/captcha/i;->getType()Ljava/lang/String;

    .line 278
    move-result-object v2

    .line 279
    .line 280
    .line 281
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 282
    .line 283
    const-string v2, "72"

    .line 284
    .line 285
    .line 286
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 287
    .line 288
    .line 289
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 290
    move-result-object v0

    .line 291
    .line 292
    sget-object v2, Lcom/geetest/captcha/j;->e:Ljava/lang/String;

    .line 293
    .line 294
    new-instance v8, Lorg/json/JSONObject;

    .line 295
    .line 296
    .line 297
    invoke-direct {v8}, Lorg/json/JSONObject;-><init>()V

    .line 298
    .line 299
    const-string v9, "The context must be an \'Activity\' object"

    .line 300
    .line 301
    .line 302
    invoke-virtual {v8, v4, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 303
    .line 304
    sget-object v4, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 305
    .line 306
    .line 307
    invoke-static {v0, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 308
    .line 309
    .line 310
    invoke-static {v2, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 311
    .line 312
    .line 313
    invoke-static {v8, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 314
    .line 315
    new-instance v4, Lorg/json/JSONObject;

    .line 316
    .line 317
    .line 318
    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 319
    .line 320
    .line 321
    :try_start_2
    invoke-virtual {v4, v7, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 322
    .line 323
    .line 324
    invoke-virtual {v4, v6, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 325
    .line 326
    .line 327
    invoke-virtual {v4, v5, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_2

    .line 328
    goto :goto_2

    .line 329
    :catch_2
    move-exception v0

    .line 330
    .line 331
    .line 332
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 333
    .line 334
    .line 335
    :goto_2
    invoke-virtual {v4}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 336
    move-result-object v0

    .line 337
    .line 338
    .line 339
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 340
    .line 341
    sget-object v2, Lcom/geetest/captcha/utils/LogUtils;->a:Lcom/geetest/captcha/utils/LogUtils;

    .line 342
    .line 343
    .line 344
    invoke-virtual {v2, v0}, Lcom/geetest/captcha/utils/LogUtils;->release(Ljava/lang/String;)V

    .line 345
    .line 346
    iget-object v1, v1, Lcom/geetest/captcha/b;->d:Lcom/geetest/captcha/GTCaptcha4Client$OnFailureListener;

    .line 347
    .line 348
    if-eqz v1, :cond_5

    .line 349
    .line 350
    .line 351
    invoke-interface {v1, v0}, Lcom/geetest/captcha/GTCaptcha4Client$OnFailureListener;->onFailure(Ljava/lang/String;)V

    .line 352
    goto :goto_4

    .line 353
    .line 354
    :cond_3
    iget-object v0, v1, Lcom/geetest/captcha/b;->b:Ljava/lang/String;

    .line 355
    .line 356
    const-string v2, "appId"

    .line 357
    const/4 v8, 0x0

    .line 358
    .line 359
    if-nez v0, :cond_4

    .line 360
    .line 361
    .line 362
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 363
    move-object v0, v8

    .line 364
    .line 365
    .line 366
    :cond_4
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 367
    move-result v0

    .line 368
    .line 369
    if-eqz v0, :cond_6

    .line 370
    .line 371
    new-instance v0, Ljava/lang/StringBuilder;

    .line 372
    .line 373
    .line 374
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 375
    .line 376
    sget-object v2, Lcom/geetest/captcha/a0;->FLOWING:Lcom/geetest/captcha/a0;

    .line 377
    .line 378
    .line 379
    invoke-virtual {v2}, Lcom/geetest/captcha/a0;->getType()Ljava/lang/String;

    .line 380
    move-result-object v2

    .line 381
    .line 382
    .line 383
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 384
    .line 385
    sget-object v2, Lcom/geetest/captcha/i;->PARAM:Lcom/geetest/captcha/i;

    .line 386
    .line 387
    .line 388
    invoke-virtual {v2}, Lcom/geetest/captcha/i;->getType()Ljava/lang/String;

    .line 389
    move-result-object v2

    .line 390
    .line 391
    .line 392
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 393
    .line 394
    const-string v2, "74"

    .line 395
    .line 396
    .line 397
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 398
    .line 399
    .line 400
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 401
    move-result-object v0

    .line 402
    .line 403
    sget-object v2, Lcom/geetest/captcha/j;->e:Ljava/lang/String;

    .line 404
    .line 405
    new-instance v8, Lorg/json/JSONObject;

    .line 406
    .line 407
    .line 408
    invoke-direct {v8}, Lorg/json/JSONObject;-><init>()V

    .line 409
    .line 410
    const-string v9, "The \'AppId\' parameter should not be null"

    .line 411
    .line 412
    .line 413
    invoke-virtual {v8, v4, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 414
    .line 415
    sget-object v4, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 416
    .line 417
    .line 418
    invoke-static {v0, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 419
    .line 420
    .line 421
    invoke-static {v2, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 422
    .line 423
    .line 424
    invoke-static {v8, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 425
    .line 426
    new-instance v4, Lorg/json/JSONObject;

    .line 427
    .line 428
    .line 429
    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 430
    .line 431
    .line 432
    :try_start_3
    invoke-virtual {v4, v7, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 433
    .line 434
    .line 435
    invoke-virtual {v4, v6, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 436
    .line 437
    .line 438
    invoke-virtual {v4, v5, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_3

    .line 439
    goto :goto_3

    .line 440
    :catch_3
    move-exception v0

    .line 441
    .line 442
    .line 443
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 444
    .line 445
    .line 446
    :goto_3
    invoke-virtual {v4}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 447
    move-result-object v0

    .line 448
    .line 449
    .line 450
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 451
    .line 452
    sget-object v2, Lcom/geetest/captcha/utils/LogUtils;->a:Lcom/geetest/captcha/utils/LogUtils;

    .line 453
    .line 454
    .line 455
    invoke-virtual {v2, v0}, Lcom/geetest/captcha/utils/LogUtils;->release(Ljava/lang/String;)V

    .line 456
    .line 457
    iget-object v1, v1, Lcom/geetest/captcha/b;->d:Lcom/geetest/captcha/GTCaptcha4Client$OnFailureListener;

    .line 458
    .line 459
    if-eqz v1, :cond_5

    .line 460
    .line 461
    .line 462
    invoke-interface {v1, v0}, Lcom/geetest/captcha/GTCaptcha4Client$OnFailureListener;->onFailure(Ljava/lang/String;)V

    .line 463
    :cond_5
    :goto_4
    return-object p0

    .line 464
    .line 465
    :cond_6
    iget-object v0, v1, Lcom/geetest/captcha/b;->g:Lcom/geetest/captcha/x;

    .line 466
    .line 467
    .line 468
    const-string/jumbo v3, "request"

    .line 469
    .line 470
    if-nez v0, :cond_7

    .line 471
    .line 472
    .line 473
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 474
    move-object v0, v8

    .line 475
    .line 476
    :cond_7
    iget-object v0, v0, Lcom/geetest/captcha/x;->c:Lcom/geetest/captcha/a0$a;

    .line 477
    .line 478
    sget-object v4, Lcom/geetest/captcha/a0$a;->NONE:Lcom/geetest/captcha/a0$a;

    .line 479
    .line 480
    .line 481
    const-string/jumbo v5, "webViewHandler"

    .line 482
    .line 483
    if-eq v0, v4, :cond_f

    .line 484
    .line 485
    iget-object v0, v1, Lcom/geetest/captcha/b;->g:Lcom/geetest/captcha/x;

    .line 486
    .line 487
    if-nez v0, :cond_8

    .line 488
    .line 489
    .line 490
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 491
    move-object v0, v8

    .line 492
    .line 493
    :cond_8
    iget-object v0, v0, Lcom/geetest/captcha/x;->d:Lcom/geetest/captcha/a0;

    .line 494
    .line 495
    sget-object v6, Lcom/geetest/captcha/a0;->NONE:Lcom/geetest/captcha/a0;

    .line 496
    .line 497
    if-ne v0, v6, :cond_f

    .line 498
    .line 499
    iget-object v0, v1, Lcom/geetest/captcha/b;->g:Lcom/geetest/captcha/x;

    .line 500
    .line 501
    if-nez v0, :cond_9

    .line 502
    .line 503
    .line 504
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 505
    move-object v0, v8

    .line 506
    .line 507
    :cond_9
    sget-object v2, Lcom/geetest/captcha/a0;->FLOWING:Lcom/geetest/captcha/a0;

    .line 508
    .line 509
    .line 510
    invoke-virtual {v0, v2}, Lcom/geetest/captcha/x;->a(Lcom/geetest/captcha/a0;)V

    .line 511
    .line 512
    iget-object v0, v1, Lcom/geetest/captcha/b;->g:Lcom/geetest/captcha/x;

    .line 513
    .line 514
    if-nez v0, :cond_a

    .line 515
    .line 516
    .line 517
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 518
    move-object v0, v8

    .line 519
    .line 520
    :cond_a
    iget-object v2, v1, Lcom/geetest/captcha/b;->c:Lcom/geetest/captcha/GTCaptcha4Client$OnSuccessListener;

    .line 521
    .line 522
    iput-object v2, v0, Lcom/geetest/captcha/x;->f:Lcom/geetest/captcha/GTCaptcha4Client$OnSuccessListener;

    .line 523
    .line 524
    iget-object v0, v1, Lcom/geetest/captcha/b;->g:Lcom/geetest/captcha/x;

    .line 525
    .line 526
    if-nez v0, :cond_b

    .line 527
    .line 528
    .line 529
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 530
    move-object v0, v8

    .line 531
    .line 532
    :cond_b
    iget-object v2, v1, Lcom/geetest/captcha/b;->d:Lcom/geetest/captcha/GTCaptcha4Client$OnFailureListener;

    .line 533
    .line 534
    iput-object v2, v0, Lcom/geetest/captcha/x;->g:Lcom/geetest/captcha/GTCaptcha4Client$OnFailureListener;

    .line 535
    .line 536
    iget-object v0, v1, Lcom/geetest/captcha/b;->g:Lcom/geetest/captcha/x;

    .line 537
    .line 538
    if-nez v0, :cond_c

    .line 539
    .line 540
    .line 541
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 542
    move-object v0, v8

    .line 543
    .line 544
    :cond_c
    iget-object v2, v1, Lcom/geetest/captcha/b;->e:Lcom/geetest/captcha/GTCaptcha4Client$OnWebViewShowListener;

    .line 545
    .line 546
    iput-object v2, v0, Lcom/geetest/captcha/x;->h:Lcom/geetest/captcha/GTCaptcha4Client$OnWebViewShowListener;

    .line 547
    .line 548
    iget-object v0, v1, Lcom/geetest/captcha/b;->i:Lcom/geetest/captcha/b0;

    .line 549
    .line 550
    if-nez v0, :cond_d

    .line 551
    .line 552
    .line 553
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 554
    move-object v0, v8

    .line 555
    .line 556
    :cond_d
    iget-object v1, v1, Lcom/geetest/captcha/b;->g:Lcom/geetest/captcha/x;

    .line 557
    .line 558
    if-nez v1, :cond_e

    .line 559
    .line 560
    .line 561
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 562
    goto :goto_5

    .line 563
    :cond_e
    move-object v8, v1

    .line 564
    .line 565
    .line 566
    :goto_5
    invoke-virtual {v0, v8}, Lcom/geetest/captcha/q;->b(Lcom/geetest/captcha/x;)V

    .line 567
    return-object p0

    .line 568
    .line 569
    :cond_f
    new-instance v0, Lcom/geetest/captcha/b0;

    .line 570
    .line 571
    .line 572
    invoke-direct {v0}, Lcom/geetest/captcha/b0;-><init>()V

    .line 573
    .line 574
    iput-object v0, v1, Lcom/geetest/captcha/b;->i:Lcom/geetest/captcha/b0;

    .line 575
    .line 576
    new-instance v0, Lcom/geetest/captcha/x;

    .line 577
    .line 578
    iget-object v6, v1, Lcom/geetest/captcha/b;->a:Landroid/content/Context;

    .line 579
    .line 580
    iget-object v7, v1, Lcom/geetest/captcha/b;->b:Ljava/lang/String;

    .line 581
    .line 582
    if-nez v7, :cond_10

    .line 583
    .line 584
    .line 585
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 586
    move-object v7, v8

    .line 587
    .line 588
    :cond_10
    iget-object v2, v1, Lcom/geetest/captcha/b;->f:Lcom/geetest/captcha/GTCaptcha4Config;

    .line 589
    .line 590
    const-string v9, "captchaId"

    .line 591
    .line 592
    .line 593
    invoke-static {v7, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 594
    .line 595
    new-instance v9, Lcom/geetest/captcha/d;

    .line 596
    .line 597
    .line 598
    invoke-direct {v9}, Lcom/geetest/captcha/d;-><init>()V

    .line 599
    .line 600
    iput-object v7, v9, Lcom/geetest/captcha/d;->a:Ljava/lang/String;

    .line 601
    .line 602
    if-eqz v2, :cond_11

    .line 603
    .line 604
    .line 605
    invoke-virtual {v2}, Lcom/geetest/captcha/GTCaptcha4Config;->isDebug()Z

    .line 606
    move-result v7

    .line 607
    .line 608
    iput-boolean v7, v9, Lcom/geetest/captcha/d;->c:Z

    .line 609
    .line 610
    .line 611
    invoke-virtual {v2}, Lcom/geetest/captcha/GTCaptcha4Config;->getHtml()Ljava/lang/String;

    .line 612
    move-result-object v7

    .line 613
    .line 614
    const-string v10, "it.html"

    .line 615
    .line 616
    .line 617
    invoke-static {v7, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 618
    .line 619
    iput-object v7, v9, Lcom/geetest/captcha/d;->b:Ljava/lang/String;

    .line 620
    .line 621
    .line 622
    invoke-virtual {v2}, Lcom/geetest/captcha/GTCaptcha4Config;->getLanguage()Ljava/lang/String;

    .line 623
    move-result-object v7

    .line 624
    .line 625
    iput-object v7, v9, Lcom/geetest/captcha/d;->d:Ljava/lang/String;

    .line 626
    .line 627
    .line 628
    invoke-virtual {v2}, Lcom/geetest/captcha/GTCaptcha4Config;->getApiServers()[Ljava/lang/String;

    .line 629
    move-result-object v7

    .line 630
    .line 631
    iput-object v7, v9, Lcom/geetest/captcha/d;->e:[Ljava/lang/String;

    .line 632
    .line 633
    .line 634
    invoke-virtual {v2}, Lcom/geetest/captcha/GTCaptcha4Config;->getStaticServers()[Ljava/lang/String;

    .line 635
    move-result-object v7

    .line 636
    .line 637
    iput-object v7, v9, Lcom/geetest/captcha/d;->f:[Ljava/lang/String;

    .line 638
    .line 639
    .line 640
    invoke-virtual {v2}, Lcom/geetest/captcha/GTCaptcha4Config;->isCanceledOnTouchOutside()Z

    .line 641
    move-result v7

    .line 642
    .line 643
    iput-boolean v7, v9, Lcom/geetest/captcha/d;->h:Z

    .line 644
    .line 645
    .line 646
    invoke-virtual {v2}, Lcom/geetest/captcha/GTCaptcha4Config;->isGTC4ViewHidden()Z

    .line 647
    move-result v7

    .line 648
    .line 649
    iput-boolean v7, v9, Lcom/geetest/captcha/d;->i:Z

    .line 650
    .line 651
    .line 652
    invoke-virtual {v2}, Lcom/geetest/captcha/GTCaptcha4Config;->getParams()Ljava/util/Map;

    .line 653
    move-result-object v7

    .line 654
    .line 655
    iput-object v7, v9, Lcom/geetest/captcha/d;->g:Ljava/util/Map;

    .line 656
    .line 657
    .line 658
    invoke-virtual {v2}, Lcom/geetest/captcha/GTCaptcha4Config;->getTimeOut()I

    .line 659
    move-result v7

    .line 660
    .line 661
    iput v7, v9, Lcom/geetest/captcha/d;->j:I

    .line 662
    .line 663
    .line 664
    invoke-virtual {v2}, Lcom/geetest/captcha/GTCaptcha4Config;->getBackgroundColor()I

    .line 665
    move-result v7

    .line 666
    .line 667
    iput v7, v9, Lcom/geetest/captcha/d;->k:I

    .line 668
    .line 669
    .line 670
    invoke-virtual {v2}, Lcom/geetest/captcha/GTCaptcha4Config;->getDialogStyle()Ljava/lang/String;

    .line 671
    move-result-object v2

    .line 672
    .line 673
    iput-object v2, v9, Lcom/geetest/captcha/d;->l:Ljava/lang/String;

    .line 674
    .line 675
    :cond_11
    iget-object v2, v9, Lcom/geetest/captcha/d;->b:Ljava/lang/String;

    .line 676
    .line 677
    .line 678
    invoke-static {v2}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    .line 679
    move-result v2

    .line 680
    .line 681
    if-eqz v2, :cond_12

    .line 682
    .line 683
    const-string v2, "file:///android_asset/gt4-index.html"

    .line 684
    .line 685
    iput-object v2, v9, Lcom/geetest/captcha/d;->b:Ljava/lang/String;

    .line 686
    .line 687
    .line 688
    :cond_12
    invoke-direct {v0, v6, v9}, Lcom/geetest/captcha/x;-><init>(Landroid/content/Context;Lcom/geetest/captcha/d;)V

    .line 689
    .line 690
    iput-object v0, v1, Lcom/geetest/captcha/b;->g:Lcom/geetest/captcha/x;

    .line 691
    .line 692
    .line 693
    invoke-virtual {v0, v4}, Lcom/geetest/captcha/x;->a(Lcom/geetest/captcha/a0$a;)V

    .line 694
    .line 695
    iget-object v0, v1, Lcom/geetest/captcha/b;->g:Lcom/geetest/captcha/x;

    .line 696
    .line 697
    if-nez v0, :cond_13

    .line 698
    .line 699
    .line 700
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 701
    move-object v0, v8

    .line 702
    .line 703
    :cond_13
    sget-object v2, Lcom/geetest/captcha/a0;->FLOWING:Lcom/geetest/captcha/a0;

    .line 704
    .line 705
    .line 706
    invoke-virtual {v0, v2}, Lcom/geetest/captcha/x;->a(Lcom/geetest/captcha/a0;)V

    .line 707
    .line 708
    iget-object v0, v1, Lcom/geetest/captcha/b;->g:Lcom/geetest/captcha/x;

    .line 709
    .line 710
    if-nez v0, :cond_14

    .line 711
    .line 712
    .line 713
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 714
    move-object v0, v8

    .line 715
    .line 716
    :cond_14
    new-instance v2, Lcom/geetest/captcha/e;

    .line 717
    .line 718
    iget-object v4, v1, Lcom/geetest/captcha/b;->f:Lcom/geetest/captcha/GTCaptcha4Config;

    .line 719
    .line 720
    if-eqz v4, :cond_15

    .line 721
    .line 722
    .line 723
    invoke-virtual {v4}, Lcom/geetest/captcha/GTCaptcha4Config;->getDialogShowListener()Lcom/geetest/captcha/GTCaptcha4Client$OnDialogShowListener;

    .line 724
    move-result-object v4

    .line 725
    goto :goto_6

    .line 726
    :cond_15
    move-object v4, v8

    .line 727
    .line 728
    .line 729
    :goto_6
    invoke-direct {v2, v4}, Lcom/geetest/captcha/e;-><init>(Lcom/geetest/captcha/GTCaptcha4Client$OnDialogShowListener;)V

    .line 730
    .line 731
    iput-object v2, v0, Lcom/geetest/captcha/x;->e:Lcom/geetest/captcha/e;

    .line 732
    .line 733
    iget-object v0, v1, Lcom/geetest/captcha/b;->g:Lcom/geetest/captcha/x;

    .line 734
    .line 735
    if-nez v0, :cond_16

    .line 736
    .line 737
    .line 738
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 739
    move-object v0, v8

    .line 740
    .line 741
    :cond_16
    iget-object v2, v1, Lcom/geetest/captcha/b;->c:Lcom/geetest/captcha/GTCaptcha4Client$OnSuccessListener;

    .line 742
    .line 743
    iput-object v2, v0, Lcom/geetest/captcha/x;->f:Lcom/geetest/captcha/GTCaptcha4Client$OnSuccessListener;

    .line 744
    .line 745
    iget-object v0, v1, Lcom/geetest/captcha/b;->g:Lcom/geetest/captcha/x;

    .line 746
    .line 747
    if-nez v0, :cond_17

    .line 748
    .line 749
    .line 750
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 751
    move-object v0, v8

    .line 752
    .line 753
    :cond_17
    iget-object v2, v1, Lcom/geetest/captcha/b;->d:Lcom/geetest/captcha/GTCaptcha4Client$OnFailureListener;

    .line 754
    .line 755
    iput-object v2, v0, Lcom/geetest/captcha/x;->g:Lcom/geetest/captcha/GTCaptcha4Client$OnFailureListener;

    .line 756
    .line 757
    iget-object v0, v1, Lcom/geetest/captcha/b;->g:Lcom/geetest/captcha/x;

    .line 758
    .line 759
    if-nez v0, :cond_18

    .line 760
    .line 761
    .line 762
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 763
    move-object v0, v8

    .line 764
    .line 765
    :cond_18
    iget-object v2, v1, Lcom/geetest/captcha/b;->e:Lcom/geetest/captcha/GTCaptcha4Client$OnWebViewShowListener;

    .line 766
    .line 767
    iput-object v2, v0, Lcom/geetest/captcha/x;->h:Lcom/geetest/captcha/GTCaptcha4Client$OnWebViewShowListener;

    .line 768
    .line 769
    iget-object v0, v1, Lcom/geetest/captcha/b;->i:Lcom/geetest/captcha/b0;

    .line 770
    .line 771
    if-nez v0, :cond_19

    .line 772
    .line 773
    .line 774
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 775
    move-object v0, v8

    .line 776
    .line 777
    :cond_19
    iget-object v1, v1, Lcom/geetest/captcha/b;->g:Lcom/geetest/captcha/x;

    .line 778
    .line 779
    if-nez v1, :cond_1a

    .line 780
    .line 781
    .line 782
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 783
    goto :goto_7

    .line 784
    :cond_1a
    move-object v8, v1

    .line 785
    .line 786
    .line 787
    :goto_7
    invoke-virtual {v0, v8}, Lcom/geetest/captcha/q;->b(Lcom/geetest/captcha/x;)V

    .line 788
    return-object p0

    .line 789
    .line 790
    :cond_1b
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 791
    .line 792
    const-string v1, "The OnFailureListener object cannot be null."

    .line 793
    .line 794
    .line 795
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 796
    throw v0
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
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
.end method
