.class public final Lcom/kubi/kucoin/interceptor/RouteProtocolSwitchInterceptor;
.super Ljava/lang/Object;
.source "RouteProtocolSwitchInterceptor.kt"

# interfaces
.implements Lzx/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/kucoin/interceptor/RouteProtocolSwitchInterceptor$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\u0008\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0002J\u0014\u0010\u000b\u001a\u00020\u000c*\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0002\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/kubi/kucoin/interceptor/RouteProtocolSwitchInterceptor;",
        "Lcom/kubi/router/interceptor/IInterceptor;",
        "<init>",
        "()V",
        "intercept",
        "",
        "chain",
        "Lcom/kubi/router/interceptor/IChain;",
        "needForceExternalUrl",
        "externalPath",
        "",
        "toTransparentRnUriIfNeeded",
        "Landroid/net/Uri;",
        "postcard",
        "Lcom/kubi/router/model/Postcard;",
        "Companion",
        "LAppRouter_googleRelease"
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
        "SMAP\nRouteProtocolSwitchInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RouteProtocolSwitchInterceptor.kt\ncom/kubi/kucoin/interceptor/RouteProtocolSwitchInterceptor\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,165:1\n29#2:166\n29#2:167\n*S KotlinDebug\n*F\n+ 1 RouteProtocolSwitchInterceptor.kt\ncom/kubi/kucoin/interceptor/RouteProtocolSwitchInterceptor\n*L\n86#1:166\n95#1:167\n*E\n"
    }
.end annotation


# static fields
.field public static final a:Lcom/kubi/kucoin/interceptor/RouteProtocolSwitchInterceptor$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/kucoin/interceptor/RouteProtocolSwitchInterceptor$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/kubi/kucoin/interceptor/RouteProtocolSwitchInterceptor$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/kubi/kucoin/interceptor/RouteProtocolSwitchInterceptor;->a:Lcom/kubi/kucoin/interceptor/RouteProtocolSwitchInterceptor$Companion;

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
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Z
    .locals 1

    .line 1
    .line 2
    const-string v0, "news"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    const-string v0, "/news"

    .line 11
    .line 12
    .line 13
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    move-result v0

    .line 15
    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    const-string v0, "notice"

    .line 19
    .line 20
    .line 21
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 22
    move-result v0

    .line 23
    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    const-string v0, "/notice"

    .line 27
    .line 28
    .line 29
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 30
    move-result v0

    .line 31
    .line 32
    if-nez v0, :cond_1

    .line 33
    .line 34
    const-string v0, "notice/push"

    .line 35
    .line 36
    .line 37
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    move-result v0

    .line 39
    .line 40
    if-nez v0, :cond_1

    .line 41
    .line 42
    const-string v0, "/notice/push"

    .line 43
    .line 44
    .line 45
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 46
    move-result v0

    .line 47
    .line 48
    if-nez v0, :cond_1

    .line 49
    .line 50
    const-string v0, "notice/login"

    .line 51
    .line 52
    .line 53
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 54
    move-result v0

    .line 55
    .line 56
    if-nez v0, :cond_1

    .line 57
    .line 58
    const-string v0, "/notice/login"

    .line 59
    .line 60
    .line 61
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 62
    move-result p1

    .line 63
    .line 64
    if-eqz p1, :cond_0

    .line 65
    goto :goto_0

    .line 66
    :cond_0
    const/4 p1, 0x0

    .line 67
    return p1

    .line 68
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 69
    return p1
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
.end method

.method public b(Lzx/a;)Z
    .locals 8
    .param p1    # Lzx/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "chain"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {p1}, Lzx/a;->b()Lay/a;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Lay/a;->h()Ljava/lang/String;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Lay/a;->j()Landroid/net/Uri;

    .line 17
    move-result-object v2

    .line 18
    .line 19
    .line 20
    invoke-static {v2}, Lcom/kubi/router/utils/RouteExKt;->G(Landroid/net/Uri;)Ljava/lang/String;

    .line 21
    move-result-object v2

    .line 22
    .line 23
    sget-object v3, Lcom/kubi/route/config/RouteConfigManager;->a:Lcom/kubi/route/config/RouteConfigManager;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v3, v1}, Lcom/kubi/route/config/RouteConfigManager;->e(Ljava/lang/String;)Lcom/kubi/route/config/model/RouteEntry;

    .line 27
    move-result-object v3

    .line 28
    .line 29
    new-instance v4, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 33
    .line 34
    const-string v5, "intercept: externalUrl="

    .line 35
    .line 36
    .line 37
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    const-string v5, ", externalPath="

    .line 43
    .line 44
    .line 45
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    const-string v5, ", routeEntry="

    .line 51
    .line 52
    .line 53
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    move-result-object v4

    .line 61
    .line 62
    const-string v5, "RouteProtocolSwitchInterceptor"

    .line 63
    .line 64
    .line 65
    invoke-static {v5, v4}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 66
    .line 67
    if-eqz v3, :cond_0

    .line 68
    .line 69
    .line 70
    invoke-virtual {v3}, Lcom/kubi/route/config/model/RouteEntry;->getBiz()Ljava/lang/String;

    .line 71
    move-result-object v4

    .line 72
    goto :goto_0

    .line 73
    :cond_0
    const/4 v4, 0x0

    .line 74
    .line 75
    .line 76
    :goto_0
    invoke-static {v4}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 77
    move-result-object v4

    .line 78
    .line 79
    if-eqz v3, :cond_1

    .line 80
    .line 81
    .line 82
    invoke-virtual {v3}, Lcom/kubi/route/config/model/RouteEntry;->getSiteTypeList()Ljava/util/List;

    .line 83
    move-result-object v6

    .line 84
    .line 85
    if-nez v6, :cond_2

    .line 86
    .line 87
    .line 88
    :cond_1
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 89
    move-result-object v6

    .line 90
    .line 91
    .line 92
    :cond_2
    invoke-static {v4, v6}, Lil/q;->a(Ljava/lang/String;Ljava/util/List;)Z

    .line 93
    move-result v7

    .line 94
    .line 95
    if-eqz v7, :cond_3

    .line 96
    .line 97
    new-instance p1, Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 101
    .line 102
    const-string v0, "intercept: blocked by RouteAppSiteInterceptor, bizType="

    .line 103
    .line 104
    .line 105
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    const-string v0, ", siteTypeList="

    .line 111
    .line 112
    .line 113
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {p1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    const-string v0, ", curSiteType="

    .line 119
    .line 120
    .line 121
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    sget-object v0, Lcom/kubi/sdk/site/SiteType;->Companion:Lcom/kubi/sdk/site/SiteType$Companion;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v0}, Lcom/kubi/sdk/site/SiteType$Companion;->getCurrentSiteType()Ljava/lang/String;

    .line 127
    move-result-object v0

    .line 128
    .line 129
    .line 130
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 134
    move-result-object p1

    .line 135
    .line 136
    .line 137
    invoke-static {v5, p1}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 138
    const/4 p1, 0x0

    .line 139
    return p1

    .line 140
    .line 141
    :cond_3
    if-eqz v3, :cond_4

    .line 142
    .line 143
    .line 144
    invoke-virtual {v3}, Lcom/kubi/route/config/model/RouteEntry;->getMode()Ljava/util/List;

    .line 145
    move-result-object v4

    .line 146
    .line 147
    if-nez v4, :cond_5

    .line 148
    .line 149
    :cond_4
    sget-object v4, Lcom/kubi/sdk/mode/AppMode;->Pro:Lcom/kubi/sdk/mode/AppMode;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v4}, Lcom/kubi/sdk/mode/AppMode;->getModeType()Ljava/lang/String;

    .line 153
    move-result-object v4

    .line 154
    .line 155
    sget-object v6, Lcom/kubi/sdk/mode/AppMode;->Lite:Lcom/kubi/sdk/mode/AppMode;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v6}, Lcom/kubi/sdk/mode/AppMode;->getModeType()Ljava/lang/String;

    .line 159
    move-result-object v6

    .line 160
    .line 161
    sget-object v7, Lcom/kubi/sdk/mode/AppMode;->Web3:Lcom/kubi/sdk/mode/AppMode;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v7}, Lcom/kubi/sdk/mode/AppMode;->getModeType()Ljava/lang/String;

    .line 165
    move-result-object v7

    .line 166
    .line 167
    .line 168
    filled-new-array {v4, v6, v7}, [Ljava/lang/String;

    .line 169
    move-result-object v4

    .line 170
    .line 171
    .line 172
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    .line 173
    move-result-object v4

    .line 174
    .line 175
    :cond_5
    sget-object v6, Lil/p;->a:Lil/p;

    .line 176
    .line 177
    .line 178
    invoke-virtual {v6, v1, v4}, Lil/p;->g(Ljava/lang/String;Ljava/util/List;)Z

    .line 179
    move-result v6

    .line 180
    .line 181
    if-eqz v6, :cond_6

    .line 182
    .line 183
    new-instance p1, Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 187
    .line 188
    const-string v0, "intercept: blocked by RouteAppModeInterceptor, supportMode="

    .line 189
    .line 190
    .line 191
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 195
    .line 196
    .line 197
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 198
    move-result-object p1

    .line 199
    .line 200
    .line 201
    invoke-static {v5, p1}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 202
    const/4 p1, 0x1

    .line 203
    return p1

    .line 204
    .line 205
    .line 206
    :cond_6
    invoke-virtual {p0, v2}, Lcom/kubi/kucoin/interceptor/RouteProtocolSwitchInterceptor;->a(Ljava/lang/String;)Z

    .line 207
    move-result v2

    .line 208
    .line 209
    if-eqz v2, :cond_7

    .line 210
    .line 211
    new-instance v2, Lay/a;

    .line 212
    .line 213
    .line 214
    invoke-virtual {p0, v1, v0}, Lcom/kubi/kucoin/interceptor/RouteProtocolSwitchInterceptor;->c(Ljava/lang/String;Lay/a;)Landroid/net/Uri;

    .line 215
    move-result-object v1

    .line 216
    .line 217
    .line 218
    invoke-static {v1}, Lil/u;->d(Landroid/net/Uri;)Landroid/net/Uri;

    .line 219
    move-result-object v1

    .line 220
    .line 221
    .line 222
    invoke-virtual {v0}, Lay/a;->d()Landroid/os/Bundle;

    .line 223
    move-result-object v0

    .line 224
    .line 225
    .line 226
    invoke-direct {v2, v1, v0}, Lay/a;-><init>(Landroid/net/Uri;Landroid/os/Bundle;)V

    .line 227
    .line 228
    .line 229
    invoke-interface {p1, v2}, Lzx/a;->a(Lay/a;)Z

    .line 230
    move-result p1

    .line 231
    return p1

    .line 232
    .line 233
    :cond_7
    if-eqz v3, :cond_9

    .line 234
    .line 235
    .line 236
    invoke-static {v3}, Lcom/kubi/route/config/a;->a(Lcom/kubi/route/config/model/RouteEntry;)Ljava/lang/String;

    .line 237
    move-result-object v2

    .line 238
    .line 239
    if-nez v2, :cond_8

    .line 240
    goto :goto_1

    .line 241
    :cond_8
    move-object v1, v2

    .line 242
    .line 243
    :cond_9
    :goto_1
    new-instance v2, Lay/a;

    .line 244
    .line 245
    .line 246
    invoke-virtual {p0, v1, v0}, Lcom/kubi/kucoin/interceptor/RouteProtocolSwitchInterceptor;->c(Ljava/lang/String;Lay/a;)Landroid/net/Uri;

    .line 247
    move-result-object v1

    .line 248
    .line 249
    .line 250
    invoke-static {v1}, Lil/u;->d(Landroid/net/Uri;)Landroid/net/Uri;

    .line 251
    move-result-object v1

    .line 252
    .line 253
    .line 254
    invoke-virtual {v0}, Lay/a;->d()Landroid/os/Bundle;

    .line 255
    move-result-object v0

    .line 256
    .line 257
    .line 258
    invoke-direct {v2, v1, v0}, Lay/a;-><init>(Landroid/net/Uri;Landroid/os/Bundle;)V

    .line 259
    .line 260
    .line 261
    invoke-interface {p1, v2}, Lzx/a;->a(Lay/a;)Z

    .line 262
    move-result p1

    .line 263
    return p1
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
.end method

.method public final c(Ljava/lang/String;Lay/a;)Landroid/net/Uri;
    .locals 9

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, Lcom/kubi/router/utils/RouteExKt;->G(Landroid/net/Uri;)Ljava/lang/String;

    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x1

    .line 10
    .line 11
    new-array v3, v2, [C

    .line 12
    .line 13
    const/16 v4, 0x2f

    .line 14
    const/4 v5, 0x0

    .line 15
    .line 16
    aput-char v4, v3, v5

    .line 17
    .line 18
    .line 19
    invoke-static {v1, v3}, Lkotlin/text/StringsKt;->trimStart(Ljava/lang/String;[C)Ljava/lang/String;

    .line 20
    move-result-object v1

    .line 21
    .line 22
    .line 23
    invoke-virtual {p2}, Lay/a;->d()Landroid/os/Bundle;

    .line 24
    move-result-object v3

    .line 25
    .line 26
    const-string v4, "transparent"

    .line 27
    .line 28
    .line 29
    invoke-virtual {v3, v4}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 30
    move-result-object v3

    .line 31
    .line 32
    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 33
    .line 34
    .line 35
    invoke-static {v3, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    move-result v3

    .line 37
    .line 38
    if-nez v3, :cond_1

    .line 39
    .line 40
    .line 41
    invoke-virtual {p2}, Lay/a;->d()Landroid/os/Bundle;

    .line 42
    move-result-object p2

    .line 43
    .line 44
    .line 45
    invoke-virtual {p2, v4}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 46
    move-result-object p2

    .line 47
    .line 48
    const-string v3, "true"

    .line 49
    .line 50
    .line 51
    invoke-static {p2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 52
    move-result p2

    .line 53
    .line 54
    if-nez p2, :cond_1

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, v4}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 58
    move-result-object p2

    .line 59
    .line 60
    .line 61
    invoke-static {p2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 62
    move-result p2

    .line 63
    .line 64
    if-eqz p2, :cond_0

    .line 65
    goto :goto_0

    .line 66
    :cond_0
    move v2, v5

    .line 67
    .line 68
    :cond_1
    :goto_0
    const-string p2, "krn/router"

    .line 69
    .line 70
    .line 71
    invoke-static {v1, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 72
    move-result p2

    .line 73
    .line 74
    if-eqz p2, :cond_3

    .line 75
    .line 76
    if-nez v2, :cond_2

    .line 77
    goto :goto_1

    .line 78
    :cond_2
    const/4 v7, 0x4

    .line 79
    const/4 v8, 0x0

    .line 80
    .line 81
    const-string v4, "krn/router"

    .line 82
    .line 83
    const-string v5, "krn/transparent_router"

    .line 84
    const/4 v6, 0x0

    .line 85
    move-object v3, p1

    .line 86
    .line 87
    .line 88
    invoke-static/range {v3 .. v8}, Lkotlin/text/StringsKt;->replaceFirst$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    .line 89
    move-result-object p1

    .line 90
    .line 91
    .line 92
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 93
    move-result-object p1

    .line 94
    return-object p1

    .line 95
    :cond_3
    :goto_1
    return-object v0
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
.end method
