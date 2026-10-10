.class public final Lcom/kubi/sdk/site/net/NetSiteErrorReceiver;
.super Ljava/lang/Object;
.source "NetSiteErrorReceiver.kt"

# interfaces
.implements Lxk/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/sdk/site/net/NetSiteErrorReceiver$Companion;,
        Lcom/kubi/sdk/site/net/NetSiteErrorReceiver$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0082@\u00a2\u0006\u0002\u0010\u0008J\u0016\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0082@\u00a2\u0006\u0002\u0010\u0008J\u0011\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0002\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/kubi/sdk/site/net/NetSiteErrorReceiver;",
        "Lcom/kubi/kucoin/callback/INetBusinessErrorReceiver;",
        "<init>",
        "()V",
        "handle",
        "",
        "errorInfo",
        "Lcom/kubi/kucoin/callback/BizErrorInfo;",
        "(Lcom/kubi/kucoin/callback/BizErrorInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "handleLegacySiteError",
        "invoke",
        "Companion",
        "LSite_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nNetSiteErrorReceiver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetSiteErrorReceiver.kt\ncom/kubi/sdk/site/net/NetSiteErrorReceiver\n+ 2 SiteIssue.kt\ncom/kubi/sdk/site/exception/SiteIssueKt\n*L\n1#1,124:1\n50#2,3:125\n50#2,3:128\n50#2,3:131\n50#2,3:134\n45#2,3:137\n*S KotlinDebug\n*F\n+ 1 NetSiteErrorReceiver.kt\ncom/kubi/sdk/site/net/NetSiteErrorReceiver\n*L\n68#1:125,3\n77#1:128,3\n97#1:131,3\n101#1:134,3\n120#1:137,3\n*E\n"
    }
.end annotation


# static fields
.field public static final b:Lcom/kubi/sdk/site/net/NetSiteErrorReceiver$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/sdk/site/net/NetSiteErrorReceiver$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/kubi/sdk/site/net/NetSiteErrorReceiver$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/kubi/sdk/site/net/NetSiteErrorReceiver;->b:Lcom/kubi/sdk/site/net/NetSiteErrorReceiver$Companion;

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
.end method

.method public constructor <init>()V
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
.end method

.method public static synthetic a()Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/sdk/site/net/NetSiteErrorReceiver;->e()Lkotlin/Unit;

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
.end method

.method public static final synthetic b(Lcom/kubi/sdk/site/net/NetSiteErrorReceiver;Lxk/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/kubi/sdk/site/net/NetSiteErrorReceiver;->d(Lxk/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
.end method

.method public static final synthetic c(Lcom/kubi/sdk/site/net/NetSiteErrorReceiver;Lxk/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/kubi/sdk/site/net/NetSiteErrorReceiver;->f(Lxk/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
.end method

.method public static final e()Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

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
.end method


# virtual methods
.method public final d(Lxk/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxk/a;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Lxk/a;->a()Lorg/json/JSONObject;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Lxk/a;->b()Lokhttp3/Request;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1}, Lokhttp3/Request;->url()Lokhttp3/HttpUrl;

    .line 12
    move-result-object v1

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1}, Lokhttp3/HttpUrl;->encodedPath()Ljava/lang/String;

    .line 16
    .line 17
    const-string v1, "code"

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 26
    return-object p1

    .line 27
    .line 28
    :cond_0
    const-string v1, "308100"

    .line 29
    .line 30
    .line 31
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 32
    move-result v0

    .line 33
    .line 34
    if-nez v0, :cond_1

    .line 35
    .line 36
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 37
    return-object p1

    .line 38
    .line 39
    :cond_1
    sget-object v0, Lcom/kubi/user/account/MultiAccountBizErrorHandler;->a:Lcom/kubi/user/account/MultiAccountBizErrorHandler;

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1}, Lxk/a;->b()Lokhttp3/Request;

    .line 43
    move-result-object v1

    .line 44
    .line 45
    const-string v2, "X-APP-TOKEN"

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1, v2}, Lokhttp3/Request;->header(Ljava/lang/String;)Ljava/lang/String;

    .line 49
    move-result-object v1

    .line 50
    .line 51
    sget-object v2, Lcom/kubi/user/account/AccountChangeType;->TYPE_308100:Lcom/kubi/user/account/AccountChangeType;

    .line 52
    .line 53
    new-instance v3, Lcom/kubi/sdk/site/net/a;

    .line 54
    .line 55
    .line 56
    invoke-direct {v3}, Lcom/kubi/sdk/site/net/a;-><init>()V

    .line 57
    .line 58
    const/16 v5, 0x8

    .line 59
    const/4 v6, 0x0

    .line 60
    const/4 v4, 0x0

    .line 61
    .line 62
    .line 63
    invoke-static/range {v0 .. v6}, Lcom/kubi/user/account/MultiAccountBizErrorHandler;->b(Lcom/kubi/user/account/MultiAccountBizErrorHandler;Ljava/lang/String;Lcom/kubi/user/account/AccountChangeType;Lkotlin/jvm/functions/Function0;Ljava/lang/String;ILjava/lang/Object;)Lcom/kubi/user/account/MultiAccountBizErrorHandler$DispatchResult;

    .line 64
    move-result-object v0

    .line 65
    .line 66
    sget-object v1, Lcom/kubi/sdk/site/net/NetSiteErrorReceiver$a;->$EnumSwitchMapping$0:[I

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 70
    move-result v0

    .line 71
    .line 72
    aget v0, v1, v0

    .line 73
    const/4 v1, 0x1

    .line 74
    .line 75
    if-eq v0, v1, :cond_4

    .line 76
    const/4 v1, 0x2

    .line 77
    .line 78
    if-eq v0, v1, :cond_4

    .line 79
    const/4 v1, 0x3

    .line 80
    .line 81
    if-ne v0, v1, :cond_3

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0, p1, p2}, Lcom/kubi/sdk/site/net/NetSiteErrorReceiver;->f(Lxk/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 85
    move-result-object p1

    .line 86
    .line 87
    .line 88
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 89
    move-result-object p2

    .line 90
    .line 91
    if-ne p1, p2, :cond_2

    .line 92
    return-object p1

    .line 93
    .line 94
    :cond_2
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 95
    return-object p1

    .line 96
    .line 97
    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 98
    .line 99
    .line 100
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 101
    throw p1

    .line 102
    .line 103
    :cond_4
    const-string p1, "NetSiteErrorReceiver"

    .line 104
    .line 105
    const-string p2, "\u662f\u5b50\u8d26\u6237\uff0c\u4e0d\u8df3\u8f6c\u5207\u7ad9\u70b9\u903b\u8f91"

    .line 106
    .line 107
    .line 108
    invoke-static {p1, p2}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 109
    .line 110
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 111
    return-object p1
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
.end method

.method public final f(Lxk/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxk/a;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    .line 2
    instance-of v0, p2, Lcom/kubi/sdk/site/net/NetSiteErrorReceiver$handleLegacySiteError$1;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p2

    .line 6
    .line 7
    check-cast v0, Lcom/kubi/sdk/site/net/NetSiteErrorReceiver$handleLegacySiteError$1;

    .line 8
    .line 9
    iget v1, v0, Lcom/kubi/sdk/site/net/NetSiteErrorReceiver$handleLegacySiteError$1;->label:I

    .line 10
    .line 11
    const/high16 v2, -0x80000000

    .line 12
    .line 13
    and-int v3, v1, v2

    .line 14
    .line 15
    if-eqz v3, :cond_0

    .line 16
    sub-int/2addr v1, v2

    .line 17
    .line 18
    iput v1, v0, Lcom/kubi/sdk/site/net/NetSiteErrorReceiver$handleLegacySiteError$1;->label:I

    .line 19
    :goto_0
    move-object v6, v0

    .line 20
    goto :goto_1

    .line 21
    .line 22
    :cond_0
    new-instance v0, Lcom/kubi/sdk/site/net/NetSiteErrorReceiver$handleLegacySiteError$1;

    .line 23
    .line 24
    .line 25
    invoke-direct {v0, p0, p2}, Lcom/kubi/sdk/site/net/NetSiteErrorReceiver$handleLegacySiteError$1;-><init>(Lcom/kubi/sdk/site/net/NetSiteErrorReceiver;Lkotlin/coroutines/Continuation;)V

    .line 26
    goto :goto_0

    .line 27
    .line 28
    :goto_1
    iget-object p2, v6, Lcom/kubi/sdk/site/net/NetSiteErrorReceiver$handleLegacySiteError$1;->result:Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 32
    move-result-object v0

    .line 33
    .line 34
    iget v1, v6, Lcom/kubi/sdk/site/net/NetSiteErrorReceiver$handleLegacySiteError$1;->label:I

    .line 35
    const/4 v2, 0x1

    .line 36
    .line 37
    const-string v9, "NetSiteErrorReceiver"

    .line 38
    const/4 v3, 0x2

    .line 39
    .line 40
    const-string v10, "handle_site_error["

    .line 41
    .line 42
    if-eqz v1, :cond_3

    .line 43
    .line 44
    if-eq v1, v2, :cond_2

    .line 45
    .line 46
    if-ne v1, v3, :cond_1

    .line 47
    .line 48
    iget-object p1, v6, Lcom/kubi/sdk/site/net/NetSiteErrorReceiver$handleLegacySiteError$1;->L$5:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast p1, Ljava/lang/String;

    .line 51
    .line 52
    iget-object v0, v6, Lcom/kubi/sdk/site/net/NetSiteErrorReceiver$handleLegacySiteError$1;->L$4:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v0, Ljava/lang/String;

    .line 55
    .line 56
    iget-object v0, v6, Lcom/kubi/sdk/site/net/NetSiteErrorReceiver$handleLegacySiteError$1;->L$3:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v0, Lorg/json/JSONObject;

    .line 59
    .line 60
    iget-object v0, v6, Lcom/kubi/sdk/site/net/NetSiteErrorReceiver$handleLegacySiteError$1;->L$2:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v0, Ljava/lang/String;

    .line 63
    .line 64
    iget-object v1, v6, Lcom/kubi/sdk/site/net/NetSiteErrorReceiver$handleLegacySiteError$1;->L$1:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v1, Lorg/json/JSONObject;

    .line 67
    .line 68
    iget-object v1, v6, Lcom/kubi/sdk/site/net/NetSiteErrorReceiver$handleLegacySiteError$1;->L$0:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v1, Lxk/a;

    .line 71
    .line 72
    .line 73
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 74
    .line 75
    goto/16 :goto_4

    .line 76
    .line 77
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 78
    .line 79
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 80
    .line 81
    .line 82
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 83
    throw p1

    .line 84
    .line 85
    :cond_2
    iget-boolean p1, v6, Lcom/kubi/sdk/site/net/NetSiteErrorReceiver$handleLegacySiteError$1;->Z$0:Z

    .line 86
    .line 87
    iget-object v1, v6, Lcom/kubi/sdk/site/net/NetSiteErrorReceiver$handleLegacySiteError$1;->L$5:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v1, Ljava/lang/String;

    .line 90
    .line 91
    iget-object v2, v6, Lcom/kubi/sdk/site/net/NetSiteErrorReceiver$handleLegacySiteError$1;->L$4:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v2, Ljava/lang/String;

    .line 94
    .line 95
    iget-object v4, v6, Lcom/kubi/sdk/site/net/NetSiteErrorReceiver$handleLegacySiteError$1;->L$3:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v4, Lorg/json/JSONObject;

    .line 98
    .line 99
    iget-object v5, v6, Lcom/kubi/sdk/site/net/NetSiteErrorReceiver$handleLegacySiteError$1;->L$2:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v5, Ljava/lang/String;

    .line 102
    .line 103
    iget-object v7, v6, Lcom/kubi/sdk/site/net/NetSiteErrorReceiver$handleLegacySiteError$1;->L$1:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast v7, Lorg/json/JSONObject;

    .line 106
    .line 107
    iget-object v8, v6, Lcom/kubi/sdk/site/net/NetSiteErrorReceiver$handleLegacySiteError$1;->L$0:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v8, Lxk/a;

    .line 110
    .line 111
    .line 112
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 113
    move-object p2, v8

    .line 114
    move v8, p1

    .line 115
    move-object p1, p2

    .line 116
    move-object p2, v5

    .line 117
    move-object v5, v2

    .line 118
    move-object v2, v1

    .line 119
    .line 120
    goto/16 :goto_2

    .line 121
    .line 122
    .line 123
    :cond_3
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {p1}, Lxk/a;->a()Lorg/json/JSONObject;

    .line 127
    move-result-object v7

    .line 128
    .line 129
    .line 130
    invoke-virtual {p1}, Lxk/a;->b()Lokhttp3/Request;

    .line 131
    move-result-object p2

    .line 132
    .line 133
    .line 134
    invoke-virtual {p2}, Lokhttp3/Request;->url()Lokhttp3/HttpUrl;

    .line 135
    move-result-object p2

    .line 136
    .line 137
    .line 138
    invoke-virtual {p2}, Lokhttp3/HttpUrl;->encodedPath()Ljava/lang/String;

    .line 139
    move-result-object p2

    .line 140
    .line 141
    const-string v1, "data"

    .line 142
    .line 143
    .line 144
    invoke-virtual {v7, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 145
    move-result-object v4

    .line 146
    const/4 v1, 0x0

    .line 147
    .line 148
    if-nez v4, :cond_4

    .line 149
    .line 150
    new-instance p1, Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 154
    .line 155
    .line 156
    invoke-virtual {p1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    const-string p2, "] data_empty"

    .line 162
    .line 163
    .line 164
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 168
    move-result-object v5

    .line 169
    .line 170
    const-string v6, "NetSiteErrorReceiver"

    .line 171
    .line 172
    .line 173
    invoke-static {v6, v5}, Lro/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 174
    .line 175
    new-instance v4, Lcom/kubi/sdk/site/exception/SiteMessage;

    .line 176
    const/4 v8, 0x4

    .line 177
    const/4 v9, 0x0

    .line 178
    const/4 v7, 0x0

    .line 179
    .line 180
    .line 181
    invoke-direct/range {v4 .. v9}, Lcom/kubi/sdk/site/exception/SiteMessage;-><init>(Ljava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 182
    .line 183
    .line 184
    invoke-static {v4, v1, v3, v1}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 185
    .line 186
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 187
    return-object p1

    .line 188
    .line 189
    :cond_4
    const-string v5, "siteType"

    .line 190
    .line 191
    .line 192
    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 193
    move-result-object v5

    .line 194
    .line 195
    const-string v8, "forceRedirect"

    .line 196
    .line 197
    .line 198
    invoke-virtual {v4, v8}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 199
    move-result v8

    .line 200
    .line 201
    sget-object v11, Lcom/kubi/sdk/site/config/SiteInfoProxy;->a:Lcom/kubi/sdk/site/config/SiteInfoProxy;

    .line 202
    .line 203
    .line 204
    invoke-virtual {v11, v8}, Lcom/kubi/sdk/site/config/SiteInfoProxy;->h(Z)V

    .line 205
    .line 206
    new-instance v11, Ljava/lang/StringBuilder;

    .line 207
    .line 208
    .line 209
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 213
    .line 214
    .line 215
    invoke-virtual {v11, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 216
    .line 217
    const-string v12, "] code=308100, siteType="

    .line 218
    .line 219
    .line 220
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 221
    .line 222
    .line 223
    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 224
    .line 225
    const-string v12, ", forceRedirect="

    .line 226
    .line 227
    .line 228
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 229
    .line 230
    .line 231
    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 232
    .line 233
    .line 234
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 235
    move-result-object v11

    .line 236
    .line 237
    .line 238
    invoke-static {v9, v11}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 239
    .line 240
    if-eqz v5, :cond_5

    .line 241
    .line 242
    .line 243
    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    .line 244
    move-result v11

    .line 245
    .line 246
    if-nez v11, :cond_6

    .line 247
    :cond_5
    move v11, v3

    .line 248
    .line 249
    goto/16 :goto_6

    .line 250
    .line 251
    :cond_6
    sget-object v11, Lcom/kubi/sdk/site/helper/a;->a:Lcom/kubi/sdk/site/helper/a;

    .line 252
    .line 253
    .line 254
    invoke-virtual {v11}, Lcom/kubi/sdk/site/helper/a;->c()Z

    .line 255
    move-result v11

    .line 256
    .line 257
    if-eqz v11, :cond_7

    .line 258
    .line 259
    sget-object p1, Lcom/kubi/sdk/site/helper/b;->a:Lcom/kubi/sdk/site/helper/b;

    .line 260
    .line 261
    sget-object p2, Lcom/kubi/sdk/site/SiteService$SwitchFromType;->Gateway:Lcom/kubi/sdk/site/SiteService$SwitchFromType;

    .line 262
    .line 263
    const-string v0, "inMigration"

    .line 264
    .line 265
    .line 266
    invoke-virtual {p1, v5, p2, v0}, Lcom/kubi/sdk/site/helper/b;->d(Ljava/lang/String;Lcom/kubi/sdk/site/SiteService$SwitchFromType;Ljava/lang/String;)V

    .line 267
    .line 268
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 269
    return-object p1

    .line 270
    .line 271
    :cond_7
    new-instance v11, Ljava/lang/StringBuilder;

    .line 272
    .line 273
    .line 274
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 275
    .line 276
    .line 277
    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 278
    .line 279
    .line 280
    invoke-virtual {v11, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 281
    .line 282
    const-string v12, "] body_invalid data="

    .line 283
    .line 284
    .line 285
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 286
    .line 287
    .line 288
    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 289
    .line 290
    .line 291
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 292
    move-result-object v11

    .line 293
    .line 294
    .line 295
    invoke-static {v11, v9}, Lqq/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 296
    .line 297
    sget-object v11, Lcom/kubi/sdk/site/config/SupportSiteManager;->a:Lcom/kubi/sdk/site/config/SupportSiteManager;

    .line 298
    const/4 v12, 0x0

    .line 299
    .line 300
    .line 301
    invoke-static {v11, v5, v12, v3, v1}, Lcom/kubi/sdk/site/config/SupportSiteManager;->h(Lcom/kubi/sdk/site/config/SupportSiteManager;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 302
    move-result v11

    .line 303
    .line 304
    if-nez v11, :cond_8

    .line 305
    .line 306
    new-instance p1, Ljava/lang/StringBuilder;

    .line 307
    .line 308
    .line 309
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 310
    .line 311
    .line 312
    invoke-virtual {p1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 313
    .line 314
    .line 315
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 316
    .line 317
    const-string p2, "] not support site"

    .line 318
    .line 319
    .line 320
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 321
    .line 322
    .line 323
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 324
    move-result-object v5

    .line 325
    .line 326
    const-string v6, "NetSiteErrorReceiver"

    .line 327
    .line 328
    .line 329
    invoke-static {v6, v5}, Lro/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 330
    .line 331
    new-instance v4, Lcom/kubi/sdk/site/exception/SiteMessage;

    .line 332
    const/4 v8, 0x4

    .line 333
    const/4 v9, 0x0

    .line 334
    const/4 v7, 0x0

    .line 335
    .line 336
    .line 337
    invoke-direct/range {v4 .. v9}, Lcom/kubi/sdk/site/exception/SiteMessage;-><init>(Ljava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 338
    .line 339
    .line 340
    invoke-static {v4, v1, v3, v1}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 341
    .line 342
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 343
    return-object p1

    .line 344
    .line 345
    :cond_8
    sget-object v11, Lcom/kubi/sdk/site/SiteType;->Companion:Lcom/kubi/sdk/site/SiteType$Companion;

    .line 346
    .line 347
    .line 348
    invoke-virtual {v11}, Lcom/kubi/sdk/site/SiteType$Companion;->getCurrentSiteType()Ljava/lang/String;

    .line 349
    move-result-object v11

    .line 350
    .line 351
    .line 352
    invoke-static {v5, v11}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 353
    move-result v11

    .line 354
    .line 355
    if-eqz v11, :cond_9

    .line 356
    .line 357
    new-instance p1, Ljava/lang/StringBuilder;

    .line 358
    .line 359
    .line 360
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 361
    .line 362
    .line 363
    invoke-virtual {p1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 364
    .line 365
    .line 366
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 367
    .line 368
    const-string p2, "] body_same"

    .line 369
    .line 370
    .line 371
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 372
    .line 373
    .line 374
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 375
    move-result-object v5

    .line 376
    .line 377
    const-string v6, "NetSiteErrorReceiver"

    .line 378
    .line 379
    .line 380
    invoke-static {v6, v5}, Lro/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 381
    .line 382
    new-instance v4, Lcom/kubi/sdk/site/exception/SiteMessage;

    .line 383
    const/4 v8, 0x4

    .line 384
    const/4 v9, 0x0

    .line 385
    const/4 v7, 0x0

    .line 386
    .line 387
    .line 388
    invoke-direct/range {v4 .. v9}, Lcom/kubi/sdk/site/exception/SiteMessage;-><init>(Ljava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 389
    .line 390
    .line 391
    invoke-static {v4, v1, v3, v1}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 392
    .line 393
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 394
    return-object p1

    .line 395
    .line 396
    :cond_9
    new-instance v1, Ljava/lang/StringBuilder;

    .line 397
    .line 398
    .line 399
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 400
    .line 401
    const-string v11, "SiteService.startSwitchSite start, siteType="

    .line 402
    .line 403
    .line 404
    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 405
    .line 406
    .line 407
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 408
    .line 409
    .line 410
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 411
    move-result-object v1

    .line 412
    .line 413
    .line 414
    invoke-static {v9, v1}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 415
    .line 416
    .line 417
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 418
    move-result-object v1

    .line 419
    .line 420
    iput-object v1, v6, Lcom/kubi/sdk/site/net/NetSiteErrorReceiver$handleLegacySiteError$1;->L$0:Ljava/lang/Object;

    .line 421
    .line 422
    .line 423
    invoke-static {v7}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 424
    move-result-object v1

    .line 425
    .line 426
    iput-object v1, v6, Lcom/kubi/sdk/site/net/NetSiteErrorReceiver$handleLegacySiteError$1;->L$1:Ljava/lang/Object;

    .line 427
    .line 428
    iput-object p2, v6, Lcom/kubi/sdk/site/net/NetSiteErrorReceiver$handleLegacySiteError$1;->L$2:Ljava/lang/Object;

    .line 429
    .line 430
    .line 431
    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 432
    move-result-object v1

    .line 433
    .line 434
    iput-object v1, v6, Lcom/kubi/sdk/site/net/NetSiteErrorReceiver$handleLegacySiteError$1;->L$3:Ljava/lang/Object;

    .line 435
    .line 436
    .line 437
    invoke-static {v5}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 438
    move-result-object v1

    .line 439
    .line 440
    iput-object v1, v6, Lcom/kubi/sdk/site/net/NetSiteErrorReceiver$handleLegacySiteError$1;->L$4:Ljava/lang/Object;

    .line 441
    .line 442
    iput-object v5, v6, Lcom/kubi/sdk/site/net/NetSiteErrorReceiver$handleLegacySiteError$1;->L$5:Ljava/lang/Object;

    .line 443
    .line 444
    iput-boolean v8, v6, Lcom/kubi/sdk/site/net/NetSiteErrorReceiver$handleLegacySiteError$1;->Z$0:Z

    .line 445
    .line 446
    iput v2, v6, Lcom/kubi/sdk/site/net/NetSiteErrorReceiver$handleLegacySiteError$1;->label:I

    .line 447
    .line 448
    const-wide/16 v1, 0x7d0

    .line 449
    .line 450
    .line 451
    invoke-static {v1, v2, v6}, Lkotlinx/coroutines/DelayKt;->b(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 452
    move-result-object v1

    .line 453
    .line 454
    if-ne v1, v0, :cond_a

    .line 455
    goto :goto_3

    .line 456
    :cond_a
    move-object v2, v5

    .line 457
    .line 458
    :goto_2
    sget-object v1, Lcom/kubi/sdk/site/SiteService;->a:Lcom/kubi/sdk/site/SiteService;

    .line 459
    move v11, v3

    .line 460
    .line 461
    sget-object v3, Lcom/kubi/sdk/site/SiteService$SwitchFromType;->Gateway:Lcom/kubi/sdk/site/SiteService$SwitchFromType;

    .line 462
    .line 463
    .line 464
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 465
    move-result-object p1

    .line 466
    .line 467
    iput-object p1, v6, Lcom/kubi/sdk/site/net/NetSiteErrorReceiver$handleLegacySiteError$1;->L$0:Ljava/lang/Object;

    .line 468
    .line 469
    .line 470
    invoke-static {v7}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 471
    move-result-object p1

    .line 472
    .line 473
    iput-object p1, v6, Lcom/kubi/sdk/site/net/NetSiteErrorReceiver$handleLegacySiteError$1;->L$1:Ljava/lang/Object;

    .line 474
    .line 475
    iput-object p2, v6, Lcom/kubi/sdk/site/net/NetSiteErrorReceiver$handleLegacySiteError$1;->L$2:Ljava/lang/Object;

    .line 476
    .line 477
    .line 478
    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 479
    move-result-object p1

    .line 480
    .line 481
    iput-object p1, v6, Lcom/kubi/sdk/site/net/NetSiteErrorReceiver$handleLegacySiteError$1;->L$3:Ljava/lang/Object;

    .line 482
    .line 483
    .line 484
    invoke-static {v5}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 485
    move-result-object p1

    .line 486
    .line 487
    iput-object p1, v6, Lcom/kubi/sdk/site/net/NetSiteErrorReceiver$handleLegacySiteError$1;->L$4:Ljava/lang/Object;

    .line 488
    .line 489
    iput-object v2, v6, Lcom/kubi/sdk/site/net/NetSiteErrorReceiver$handleLegacySiteError$1;->L$5:Ljava/lang/Object;

    .line 490
    .line 491
    iput-boolean v8, v6, Lcom/kubi/sdk/site/net/NetSiteErrorReceiver$handleLegacySiteError$1;->Z$0:Z

    .line 492
    .line 493
    iput v11, v6, Lcom/kubi/sdk/site/net/NetSiteErrorReceiver$handleLegacySiteError$1;->label:I

    .line 494
    const/4 v4, 0x0

    .line 495
    const/4 v5, 0x0

    .line 496
    .line 497
    const/16 v7, 0xc

    .line 498
    const/4 v8, 0x0

    .line 499
    .line 500
    .line 501
    invoke-static/range {v1 .. v8}, Lcom/kubi/sdk/site/SiteService;->G(Lcom/kubi/sdk/site/SiteService;Ljava/lang/String;Lcom/kubi/sdk/site/SiteService$SwitchFromType;Ljava/lang/String;Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    .line 502
    move-result-object p1

    .line 503
    .line 504
    if-ne p1, v0, :cond_b

    .line 505
    :goto_3
    return-object v0

    .line 506
    :cond_b
    move-object v0, p2

    .line 507
    move-object p2, p1

    .line 508
    move-object p1, v2

    .line 509
    .line 510
    :goto_4
    check-cast p2, Ljava/lang/Boolean;

    .line 511
    .line 512
    .line 513
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 514
    move-result p2

    .line 515
    .line 516
    const-string v1, "] startSwitchSite "

    .line 517
    .line 518
    if-eqz p2, :cond_c

    .line 519
    .line 520
    new-instance p2, Ljava/lang/StringBuilder;

    .line 521
    .line 522
    .line 523
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 524
    .line 525
    .line 526
    invoke-virtual {p2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 527
    .line 528
    .line 529
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 530
    .line 531
    .line 532
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 533
    .line 534
    .line 535
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 536
    .line 537
    const-string p1, " success"

    .line 538
    .line 539
    .line 540
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 541
    .line 542
    .line 543
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 544
    move-result-object p1

    .line 545
    .line 546
    .line 547
    invoke-static {v9, p1}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 548
    goto :goto_5

    .line 549
    .line 550
    :cond_c
    new-instance p2, Ljava/lang/StringBuilder;

    .line 551
    .line 552
    .line 553
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 554
    .line 555
    .line 556
    invoke-virtual {p2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 557
    .line 558
    .line 559
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 560
    .line 561
    .line 562
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 563
    .line 564
    .line 565
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 566
    .line 567
    const-string p1, " cancel"

    .line 568
    .line 569
    .line 570
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 571
    .line 572
    .line 573
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 574
    move-result-object p1

    .line 575
    .line 576
    .line 577
    invoke-static {v9, p1}, Lro/b;->n(Ljava/lang/String;Ljava/lang/String;)V

    .line 578
    .line 579
    :goto_5
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 580
    return-object p1

    .line 581
    .line 582
    :goto_6
    new-instance p1, Ljava/lang/StringBuilder;

    .line 583
    .line 584
    .line 585
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 586
    .line 587
    .line 588
    invoke-virtual {p1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 589
    .line 590
    .line 591
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 592
    .line 593
    const-string p2, "] site_empty"

    .line 594
    .line 595
    .line 596
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 597
    .line 598
    .line 599
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 600
    move-result-object v3

    .line 601
    .line 602
    const-string v4, "NetSiteErrorReceiver"

    .line 603
    .line 604
    .line 605
    invoke-static {v4, v3}, Lro/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 606
    .line 607
    new-instance v2, Lcom/kubi/sdk/site/exception/SiteMessage;

    .line 608
    const/4 v6, 0x4

    .line 609
    const/4 v7, 0x0

    .line 610
    const/4 v5, 0x0

    .line 611
    .line 612
    .line 613
    invoke-direct/range {v2 .. v7}, Lcom/kubi/sdk/site/exception/SiteMessage;-><init>(Ljava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 614
    .line 615
    .line 616
    invoke-static {v2, v1, v11, v1}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 617
    .line 618
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 619
    return-object p1
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
.end method

.method public g(Lxk/a;)V
    .locals 9
    .param p1    # Lxk/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "errorInfo"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    const/4 v1, 0x0

    .line 7
    .line 8
    :try_start_0
    new-instance v0, Lcom/kubi/sdk/site/net/NetSiteErrorReceiver$invoke$1;

    .line 9
    .line 10
    .line 11
    invoke-direct {v0, p0, p1, v1}, Lcom/kubi/sdk/site/net/NetSiteErrorReceiver$invoke$1;-><init>(Lcom/kubi/sdk/site/net/NetSiteErrorReceiver;Lxk/a;Lkotlin/coroutines/Continuation;)V

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, Lcom/kubi/mvi/common/MviExKt;->n(Lkotlin/jvm/functions/Function2;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    return-void

    .line 16
    :catch_0
    move-exception v0

    .line 17
    move-object p1, v0

    .line 18
    move-object v3, p1

    .line 19
    .line 20
    const-string v4, "NetSiteErrorReceiver"

    .line 21
    .line 22
    .line 23
    invoke-static {v4, v3}, Lro/b;->g(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 24
    .line 25
    new-instance v2, Lcom/kubi/sdk/site/exception/SiteException;

    .line 26
    .line 27
    const/16 v7, 0x8

    .line 28
    const/4 v8, 0x0

    .line 29
    const/4 v5, 0x0

    .line 30
    const/4 v6, 0x0

    .line 31
    .line 32
    .line 33
    invoke-direct/range {v2 .. v8}, Lcom/kubi/sdk/site/exception/SiteException;-><init>(Ljava/lang/Throwable;Ljava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 34
    const/4 p1, 0x2

    .line 35
    .line 36
    .line 37
    invoke-static {v2, v1, p1, v1}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 38
    return-void
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    check-cast p1, Lxk/a;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lcom/kubi/sdk/site/net/NetSiteErrorReceiver;->g(Lxk/a;)V

    .line 6
    .line 7
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 8
    return-object p1
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
.end method
