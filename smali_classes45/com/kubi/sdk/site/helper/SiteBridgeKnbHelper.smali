.class public final Lcom/kubi/sdk/site/helper/SiteBridgeKnbHelper;
.super Ljava/lang/Object;
.source "SiteBridgeKnbHelper.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J4\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u00052\u001c\u0010\t\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000c\u0012\u0004\u0012\u00020\u00070\nH\u0086@\u00a2\u0006\u0002\u0010\rJ4\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u00052\u001c\u0010\t\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000c\u0012\u0004\u0012\u00020\u00070\nH\u0086@\u00a2\u0006\u0002\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/kubi/sdk/site/helper/SiteBridgeKnbHelper;",
        "",
        "<init>",
        "()V",
        "TAG",
        "",
        "startChangeSite",
        "",
        "siteType",
        "callback",
        "Lkotlin/Function2;",
        "",
        "Lcom/kubi/sdk/protocol/ProtocolException;",
        "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "startChangeSiteDirectly",
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
        "SMAP\nSiteBridgeKnbHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SiteBridgeKnbHelper.kt\ncom/kubi/sdk/site/helper/SiteBridgeKnbHelper\n+ 2 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 3 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n+ 4 SiteIssue.kt\ncom/kubi/sdk/site/exception/SiteIssueKt\n*L\n1#1,74:1\n35#2,4:75\n39#2:81\n35#2,4:85\n39#2:91\n44#3,2:79\n44#3,2:89\n45#4,3:82\n45#4,3:92\n*S KotlinDebug\n*F\n+ 1 SiteBridgeKnbHelper.kt\ncom/kubi/sdk/site/helper/SiteBridgeKnbHelper\n*L\n23#1:75,4\n23#1:81\n52#1:85,4\n52#1:91\n23#1:79,2\n52#1:89,2\n41#1:82,3\n69#1:92,3\n*E\n"
    }
.end annotation


# static fields
.field public static final a:Lcom/kubi/sdk/site/helper/SiteBridgeKnbHelper;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/sdk/site/helper/SiteBridgeKnbHelper;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/kubi/sdk/site/helper/SiteBridgeKnbHelper;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/kubi/sdk/site/helper/SiteBridgeKnbHelper;->a:Lcom/kubi/sdk/site/helper/SiteBridgeKnbHelper;

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
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 20
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/jvm/functions/Function2;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Ljava/lang/Boolean;",
            "-",
            "Lcom/kubi/sdk/protocol/ProtocolException;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    move-object/from16 v1, p1

    .line 3
    .line 4
    move-object/from16 v8, p2

    .line 5
    .line 6
    move-object/from16 v0, p3

    .line 7
    .line 8
    instance-of v2, v0, Lcom/kubi/sdk/site/helper/SiteBridgeKnbHelper$startChangeSite$1;

    .line 9
    .line 10
    if-eqz v2, :cond_0

    .line 11
    move-object v2, v0

    .line 12
    .line 13
    check-cast v2, Lcom/kubi/sdk/site/helper/SiteBridgeKnbHelper$startChangeSite$1;

    .line 14
    .line 15
    iget v3, v2, Lcom/kubi/sdk/site/helper/SiteBridgeKnbHelper$startChangeSite$1;->label:I

    .line 16
    .line 17
    const/high16 v4, -0x80000000

    .line 18
    .line 19
    and-int v5, v3, v4

    .line 20
    .line 21
    if-eqz v5, :cond_0

    .line 22
    sub-int/2addr v3, v4

    .line 23
    .line 24
    iput v3, v2, Lcom/kubi/sdk/site/helper/SiteBridgeKnbHelper$startChangeSite$1;->label:I

    .line 25
    .line 26
    move-object/from16 v9, p0

    .line 27
    :goto_0
    move-object v5, v2

    .line 28
    goto :goto_1

    .line 29
    .line 30
    :cond_0
    new-instance v2, Lcom/kubi/sdk/site/helper/SiteBridgeKnbHelper$startChangeSite$1;

    .line 31
    .line 32
    move-object/from16 v9, p0

    .line 33
    .line 34
    .line 35
    invoke-direct {v2, v9, v0}, Lcom/kubi/sdk/site/helper/SiteBridgeKnbHelper$startChangeSite$1;-><init>(Lcom/kubi/sdk/site/helper/SiteBridgeKnbHelper;Lkotlin/coroutines/Continuation;)V

    .line 36
    goto :goto_0

    .line 37
    .line 38
    :goto_1
    iget-object v0, v5, Lcom/kubi/sdk/site/helper/SiteBridgeKnbHelper$startChangeSite$1;->result:Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 42
    move-result-object v10

    .line 43
    .line 44
    iget v2, v5, Lcom/kubi/sdk/site/helper/SiteBridgeKnbHelper$startChangeSite$1;->label:I

    .line 45
    const/4 v3, 0x0

    .line 46
    const/4 v11, 0x2

    .line 47
    const/4 v4, 0x1

    .line 48
    const/4 v12, 0x0

    .line 49
    .line 50
    if-eqz v2, :cond_2

    .line 51
    .line 52
    if-ne v2, v4, :cond_1

    .line 53
    .line 54
    iget-object v1, v5, Lcom/kubi/sdk/site/helper/SiteBridgeKnbHelper$startChangeSite$1;->L$2:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v1, Lcom/kubi/sdk/site/SiteService$SwitchFromType;

    .line 57
    .line 58
    iget-object v1, v5, Lcom/kubi/sdk/site/helper/SiteBridgeKnbHelper$startChangeSite$1;->L$1:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v1, Lkotlin/jvm/functions/Function2;

    .line 61
    .line 62
    iget-object v2, v5, Lcom/kubi/sdk/site/helper/SiteBridgeKnbHelper$startChangeSite$1;->L$0:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v2, Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    :try_start_0
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 68
    .line 69
    goto/16 :goto_6

    .line 70
    :catchall_0
    move-exception v0

    .line 71
    move-object v8, v1

    .line 72
    :goto_2
    move-object v1, v0

    .line 73
    .line 74
    goto/16 :goto_7

    .line 75
    .line 76
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 77
    .line 78
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 79
    .line 80
    .line 81
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 82
    throw v0

    .line 83
    .line 84
    .line 85
    :cond_2
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 86
    .line 87
    :try_start_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 91
    .line 92
    .line 93
    const-string/jumbo v2, "siteType error "

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 103
    move-result-object v0

    .line 104
    .line 105
    const-string v2, "SiteBridgeKnbHelper"

    .line 106
    .line 107
    .line 108
    invoke-static {v0, v2}, Lqq/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 109
    .line 110
    const-string v0, "kc_site_support_knb"
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 111
    .line 112
    :try_start_2
    sget-object v2, Lcom/kubi/config/RemoteConfig;->a:Lcom/kubi/config/RemoteConfig;

    .line 113
    .line 114
    new-instance v2, Lcom/kubi/sdk/site/helper/SiteBridgeKnbHelper$a;

    .line 115
    .line 116
    .line 117
    invoke-direct {v2}, Lcom/kubi/sdk/site/helper/SiteBridgeKnbHelper$a;-><init>()V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v2}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    .line 121
    move-result-object v2

    .line 122
    .line 123
    const-string v6, "object : TypeToken<T>() {}.type"

    .line 124
    .line 125
    .line 126
    invoke-static {v2, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    invoke-static {v0, v2}, Lcom/kubi/config/RemoteConfig;->a(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 130
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 131
    goto :goto_3

    .line 132
    :catchall_1
    move-exception v0

    .line 133
    move-object v14, v0

    .line 134
    .line 135
    :try_start_3
    const-string v15, "RemoteConfig"

    .line 136
    .line 137
    new-instance v13, Lcom/kubi/config/exception/KCConfigException;

    .line 138
    .line 139
    const/16 v18, 0x8

    .line 140
    .line 141
    const/16 v19, 0x0

    .line 142
    .line 143
    const/16 v16, 0x0

    .line 144
    .line 145
    const/16 v17, 0x0

    .line 146
    .line 147
    .line 148
    invoke-direct/range {v13 .. v19}, Lcom/kubi/config/exception/KCConfigException;-><init>(Ljava/lang/Throwable;Ljava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 149
    .line 150
    .line 151
    invoke-static {v13, v12, v11, v12}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 152
    move-object v0, v12

    .line 153
    .line 154
    :goto_3
    check-cast v0, Ljava/lang/Boolean;

    .line 155
    .line 156
    .line 157
    invoke-static {v0, v4}, Lcom/kubi/utils/extensions/c;->e(Ljava/lang/Boolean;Z)Z

    .line 158
    move-result v0

    .line 159
    .line 160
    if-eqz v0, :cond_3

    .line 161
    .line 162
    sget-object v0, Lcom/kubi/sdk/site/config/SupportSiteManager;->a:Lcom/kubi/sdk/site/config/SupportSiteManager;

    .line 163
    .line 164
    .line 165
    invoke-static {v0, v1, v3, v11, v12}, Lcom/kubi/sdk/site/config/SupportSiteManager;->h(Lcom/kubi/sdk/site/config/SupportSiteManager;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 166
    move-result v0

    .line 167
    .line 168
    if-nez v0, :cond_3

    .line 169
    .line 170
    sget-object v0, Lcom/kubi/sdk/site/helper/b;->a:Lcom/kubi/sdk/site/helper/b;

    .line 171
    .line 172
    sget-object v2, Lcom/kubi/sdk/site/SiteService$SwitchFromType;->Bridge:Lcom/kubi/sdk/site/SiteService$SwitchFromType;

    .line 173
    .line 174
    .line 175
    const-string/jumbo v3, "siteTypeNotSupport"

    .line 176
    .line 177
    .line 178
    invoke-virtual {v0, v1, v2, v3}, Lcom/kubi/sdk/site/helper/b;->d(Ljava/lang/String;Lcom/kubi/sdk/site/SiteService$SwitchFromType;Ljava/lang/String;)V

    .line 179
    .line 180
    new-instance v13, Lcom/kubi/sdk/protocol/ProtocolException;

    .line 181
    .line 182
    const-string v14, "-1"

    .line 183
    .line 184
    .line 185
    const-string/jumbo v16, "siteType error"

    .line 186
    .line 187
    const/16 v18, 0xa

    .line 188
    .line 189
    const/16 v19, 0x0

    .line 190
    const/4 v15, 0x0

    .line 191
    .line 192
    const/16 v17, 0x0

    .line 193
    .line 194
    .line 195
    invoke-direct/range {v13 .. v19}, Lcom/kubi/sdk/protocol/ProtocolException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/Object;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 196
    .line 197
    .line 198
    invoke-interface {v8, v12, v13}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 199
    .line 200
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 201
    return-object v0

    .line 202
    :catchall_2
    move-exception v0

    .line 203
    .line 204
    goto/16 :goto_2

    .line 205
    .line 206
    :cond_3
    sget-object v0, Lcom/kubi/sdk/site/helper/a;->a:Lcom/kubi/sdk/site/helper/a;

    .line 207
    .line 208
    .line 209
    invoke-virtual {v0}, Lcom/kubi/sdk/site/helper/a;->c()Z

    .line 210
    move-result v0

    .line 211
    .line 212
    if-eqz v0, :cond_4

    .line 213
    .line 214
    sget-object v0, Lcom/kubi/sdk/site/SiteService$SwitchFromType;->Migration:Lcom/kubi/sdk/site/SiteService$SwitchFromType;

    .line 215
    :goto_4
    move-object v2, v0

    .line 216
    goto :goto_5

    .line 217
    .line 218
    :cond_4
    sget-object v0, Lcom/kubi/sdk/site/SiteService$SwitchFromType;->Bridge:Lcom/kubi/sdk/site/SiteService$SwitchFromType;

    .line 219
    goto :goto_4

    .line 220
    .line 221
    :goto_5
    sget-object v0, Lcom/kubi/sdk/site/config/SiteInfoProxy;->a:Lcom/kubi/sdk/site/config/SiteInfoProxy;

    .line 222
    .line 223
    .line 224
    invoke-virtual {v0, v4}, Lcom/kubi/sdk/site/config/SiteInfoProxy;->h(Z)V

    .line 225
    .line 226
    sget-object v0, Lcom/kubi/sdk/site/SiteService;->a:Lcom/kubi/sdk/site/SiteService;

    .line 227
    .line 228
    .line 229
    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 230
    move-result-object v3

    .line 231
    .line 232
    iput-object v3, v5, Lcom/kubi/sdk/site/helper/SiteBridgeKnbHelper$startChangeSite$1;->L$0:Ljava/lang/Object;

    .line 233
    .line 234
    iput-object v8, v5, Lcom/kubi/sdk/site/helper/SiteBridgeKnbHelper$startChangeSite$1;->L$1:Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 238
    move-result-object v3

    .line 239
    .line 240
    iput-object v3, v5, Lcom/kubi/sdk/site/helper/SiteBridgeKnbHelper$startChangeSite$1;->L$2:Ljava/lang/Object;

    .line 241
    .line 242
    iput v4, v5, Lcom/kubi/sdk/site/helper/SiteBridgeKnbHelper$startChangeSite$1;->label:I

    .line 243
    const/4 v3, 0x0

    .line 244
    const/4 v4, 0x0

    .line 245
    .line 246
    const/16 v6, 0xc

    .line 247
    const/4 v7, 0x0

    .line 248
    .line 249
    .line 250
    invoke-static/range {v0 .. v7}, Lcom/kubi/sdk/site/SiteService;->G(Lcom/kubi/sdk/site/SiteService;Ljava/lang/String;Lcom/kubi/sdk/site/SiteService$SwitchFromType;Ljava/lang/String;Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    .line 251
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 252
    .line 253
    if-ne v0, v10, :cond_5

    .line 254
    return-object v10

    .line 255
    :cond_5
    move-object v1, v8

    .line 256
    .line 257
    :goto_6
    :try_start_4
    check-cast v0, Ljava/lang/Boolean;

    .line 258
    .line 259
    .line 260
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 261
    move-result v0

    .line 262
    .line 263
    .line 264
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 265
    move-result-object v0

    .line 266
    .line 267
    .line 268
    invoke-interface {v1, v0, v12}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 269
    goto :goto_8

    .line 270
    .line 271
    :goto_7
    const-string v2, "SiteBridgeKnbHelper"

    .line 272
    .line 273
    .line 274
    invoke-static {v2, v1}, Lro/b;->g(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 275
    .line 276
    new-instance v0, Lcom/kubi/sdk/site/exception/SiteException;

    .line 277
    .line 278
    const/16 v5, 0x8

    .line 279
    const/4 v6, 0x0

    .line 280
    const/4 v3, 0x0

    .line 281
    const/4 v4, 0x0

    .line 282
    .line 283
    .line 284
    invoke-direct/range {v0 .. v6}, Lcom/kubi/sdk/site/exception/SiteException;-><init>(Ljava/lang/Throwable;Ljava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 285
    .line 286
    .line 287
    invoke-static {v0, v12, v11, v12}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 288
    .line 289
    new-instance v0, Lcom/kubi/sdk/protocol/ProtocolException;

    .line 290
    move-object v2, v1

    .line 291
    .line 292
    const-string v1, "-1"

    .line 293
    .line 294
    .line 295
    const-string/jumbo v3, "siteType error"

    .line 296
    const/4 v4, 0x0

    .line 297
    .line 298
    .line 299
    invoke-direct/range {v0 .. v6}, Lcom/kubi/sdk/protocol/ProtocolException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/Object;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 300
    .line 301
    .line 302
    invoke-interface {v8, v12, v0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 303
    .line 304
    :goto_8
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 305
    return-object v0
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
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
.end method

.method public final b(Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 18
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/jvm/functions/Function2;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Ljava/lang/Boolean;",
            "-",
            "Lcom/kubi/sdk/protocol/ProtocolException;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    move-object/from16 v1, p1

    .line 3
    .line 4
    move-object/from16 v6, p2

    .line 5
    .line 6
    move-object/from16 v0, p3

    .line 7
    .line 8
    instance-of v2, v0, Lcom/kubi/sdk/site/helper/SiteBridgeKnbHelper$startChangeSiteDirectly$1;

    .line 9
    .line 10
    if-eqz v2, :cond_0

    .line 11
    move-object v2, v0

    .line 12
    .line 13
    check-cast v2, Lcom/kubi/sdk/site/helper/SiteBridgeKnbHelper$startChangeSiteDirectly$1;

    .line 14
    .line 15
    iget v3, v2, Lcom/kubi/sdk/site/helper/SiteBridgeKnbHelper$startChangeSiteDirectly$1;->label:I

    .line 16
    .line 17
    const/high16 v4, -0x80000000

    .line 18
    .line 19
    and-int v5, v3, v4

    .line 20
    .line 21
    if-eqz v5, :cond_0

    .line 22
    sub-int/2addr v3, v4

    .line 23
    .line 24
    iput v3, v2, Lcom/kubi/sdk/site/helper/SiteBridgeKnbHelper$startChangeSiteDirectly$1;->label:I

    .line 25
    .line 26
    move-object/from16 v7, p0

    .line 27
    :goto_0
    move-object v5, v2

    .line 28
    goto :goto_1

    .line 29
    .line 30
    :cond_0
    new-instance v2, Lcom/kubi/sdk/site/helper/SiteBridgeKnbHelper$startChangeSiteDirectly$1;

    .line 31
    .line 32
    move-object/from16 v7, p0

    .line 33
    .line 34
    .line 35
    invoke-direct {v2, v7, v0}, Lcom/kubi/sdk/site/helper/SiteBridgeKnbHelper$startChangeSiteDirectly$1;-><init>(Lcom/kubi/sdk/site/helper/SiteBridgeKnbHelper;Lkotlin/coroutines/Continuation;)V

    .line 36
    goto :goto_0

    .line 37
    .line 38
    :goto_1
    iget-object v0, v5, Lcom/kubi/sdk/site/helper/SiteBridgeKnbHelper$startChangeSiteDirectly$1;->result:Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 42
    move-result-object v8

    .line 43
    .line 44
    iget v2, v5, Lcom/kubi/sdk/site/helper/SiteBridgeKnbHelper$startChangeSiteDirectly$1;->label:I

    .line 45
    const/4 v3, 0x0

    .line 46
    const/4 v9, 0x2

    .line 47
    const/4 v4, 0x1

    .line 48
    const/4 v10, 0x0

    .line 49
    .line 50
    if-eqz v2, :cond_2

    .line 51
    .line 52
    if-ne v2, v4, :cond_1

    .line 53
    .line 54
    iget-object v1, v5, Lcom/kubi/sdk/site/helper/SiteBridgeKnbHelper$startChangeSiteDirectly$1;->L$2:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v1, Lcom/kubi/sdk/site/SiteService$SwitchFromType;

    .line 57
    .line 58
    iget-object v1, v5, Lcom/kubi/sdk/site/helper/SiteBridgeKnbHelper$startChangeSiteDirectly$1;->L$1:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v1, Lkotlin/jvm/functions/Function2;

    .line 61
    .line 62
    iget-object v2, v5, Lcom/kubi/sdk/site/helper/SiteBridgeKnbHelper$startChangeSiteDirectly$1;->L$0:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v2, Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    :try_start_0
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 68
    .line 69
    goto/16 :goto_5

    .line 70
    :catchall_0
    move-exception v0

    .line 71
    move-object v12, v0

    .line 72
    move-object v6, v1

    .line 73
    .line 74
    goto/16 :goto_6

    .line 75
    .line 76
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 77
    .line 78
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 79
    .line 80
    .line 81
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 82
    throw v0

    .line 83
    .line 84
    .line 85
    :cond_2
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 86
    .line 87
    :try_start_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 91
    .line 92
    .line 93
    const-string/jumbo v2, "siteType error directly "

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 103
    move-result-object v0

    .line 104
    .line 105
    const-string v2, "SiteBridgeKnbHelper"

    .line 106
    .line 107
    .line 108
    invoke-static {v0, v2}, Lqq/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 109
    .line 110
    const-string v0, "kc_site_support_knb_v2"
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 111
    .line 112
    :try_start_2
    sget-object v2, Lcom/kubi/config/RemoteConfig;->a:Lcom/kubi/config/RemoteConfig;

    .line 113
    .line 114
    new-instance v2, Lcom/kubi/sdk/site/helper/SiteBridgeKnbHelper$b;

    .line 115
    .line 116
    .line 117
    invoke-direct {v2}, Lcom/kubi/sdk/site/helper/SiteBridgeKnbHelper$b;-><init>()V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v2}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    .line 121
    move-result-object v2

    .line 122
    .line 123
    const-string v11, "object : TypeToken<T>() {}.type"

    .line 124
    .line 125
    .line 126
    invoke-static {v2, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    invoke-static {v0, v2}, Lcom/kubi/config/RemoteConfig;->a(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 130
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 131
    goto :goto_2

    .line 132
    :catchall_1
    move-exception v0

    .line 133
    move-object v12, v0

    .line 134
    .line 135
    :try_start_3
    const-string v13, "RemoteConfig"

    .line 136
    .line 137
    new-instance v11, Lcom/kubi/config/exception/KCConfigException;

    .line 138
    .line 139
    const/16 v16, 0x8

    .line 140
    .line 141
    const/16 v17, 0x0

    .line 142
    const/4 v14, 0x0

    .line 143
    const/4 v15, 0x0

    .line 144
    .line 145
    .line 146
    invoke-direct/range {v11 .. v17}, Lcom/kubi/config/exception/KCConfigException;-><init>(Ljava/lang/Throwable;Ljava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 147
    .line 148
    .line 149
    invoke-static {v11, v10, v9, v10}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 150
    move-object v0, v10

    .line 151
    .line 152
    :goto_2
    check-cast v0, Ljava/lang/Boolean;

    .line 153
    .line 154
    .line 155
    invoke-static {v0, v4}, Lcom/kubi/utils/extensions/c;->e(Ljava/lang/Boolean;Z)Z

    .line 156
    move-result v0

    .line 157
    .line 158
    if-eqz v0, :cond_3

    .line 159
    .line 160
    sget-object v0, Lcom/kubi/sdk/site/config/SupportSiteManager;->a:Lcom/kubi/sdk/site/config/SupportSiteManager;

    .line 161
    .line 162
    .line 163
    invoke-static {v0, v1, v3, v9, v10}, Lcom/kubi/sdk/site/config/SupportSiteManager;->h(Lcom/kubi/sdk/site/config/SupportSiteManager;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 164
    move-result v0

    .line 165
    .line 166
    if-nez v0, :cond_3

    .line 167
    .line 168
    sget-object v0, Lcom/kubi/sdk/site/helper/b;->a:Lcom/kubi/sdk/site/helper/b;

    .line 169
    .line 170
    sget-object v2, Lcom/kubi/sdk/site/SiteService$SwitchFromType;->Bridge:Lcom/kubi/sdk/site/SiteService$SwitchFromType;

    .line 171
    .line 172
    .line 173
    const-string/jumbo v3, "siteTypeNotSupport"

    .line 174
    .line 175
    .line 176
    invoke-virtual {v0, v1, v2, v3}, Lcom/kubi/sdk/site/helper/b;->d(Ljava/lang/String;Lcom/kubi/sdk/site/SiteService$SwitchFromType;Ljava/lang/String;)V

    .line 177
    .line 178
    new-instance v11, Lcom/kubi/sdk/protocol/ProtocolException;

    .line 179
    .line 180
    const-string v12, "-1"

    .line 181
    .line 182
    const-string v14, "directly siteType error"

    .line 183
    .line 184
    const/16 v16, 0xa

    .line 185
    .line 186
    const/16 v17, 0x0

    .line 187
    const/4 v13, 0x0

    .line 188
    const/4 v15, 0x0

    .line 189
    .line 190
    .line 191
    invoke-direct/range {v11 .. v17}, Lcom/kubi/sdk/protocol/ProtocolException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/Object;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 192
    .line 193
    .line 194
    invoke-interface {v6, v10, v11}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 195
    .line 196
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 197
    return-object v0

    .line 198
    :catchall_2
    move-exception v0

    .line 199
    move-object v12, v0

    .line 200
    goto :goto_6

    .line 201
    .line 202
    :cond_3
    sget-object v0, Lcom/kubi/sdk/site/helper/a;->a:Lcom/kubi/sdk/site/helper/a;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v0}, Lcom/kubi/sdk/site/helper/a;->c()Z

    .line 206
    move-result v0

    .line 207
    .line 208
    if-eqz v0, :cond_4

    .line 209
    .line 210
    sget-object v0, Lcom/kubi/sdk/site/SiteService$SwitchFromType;->Migration:Lcom/kubi/sdk/site/SiteService$SwitchFromType;

    .line 211
    :goto_3
    move-object v2, v0

    .line 212
    goto :goto_4

    .line 213
    .line 214
    :cond_4
    sget-object v0, Lcom/kubi/sdk/site/SiteService$SwitchFromType;->Bridge:Lcom/kubi/sdk/site/SiteService$SwitchFromType;

    .line 215
    goto :goto_3

    .line 216
    .line 217
    :goto_4
    sget-object v0, Lcom/kubi/sdk/site/SiteService;->a:Lcom/kubi/sdk/site/SiteService;

    .line 218
    .line 219
    .line 220
    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 221
    move-result-object v3

    .line 222
    .line 223
    .line 224
    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 225
    move-result-object v11

    .line 226
    .line 227
    iput-object v11, v5, Lcom/kubi/sdk/site/helper/SiteBridgeKnbHelper$startChangeSiteDirectly$1;->L$0:Ljava/lang/Object;

    .line 228
    .line 229
    iput-object v6, v5, Lcom/kubi/sdk/site/helper/SiteBridgeKnbHelper$startChangeSiteDirectly$1;->L$1:Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 233
    move-result-object v11

    .line 234
    .line 235
    iput-object v11, v5, Lcom/kubi/sdk/site/helper/SiteBridgeKnbHelper$startChangeSiteDirectly$1;->L$2:Ljava/lang/Object;

    .line 236
    .line 237
    iput v4, v5, Lcom/kubi/sdk/site/helper/SiteBridgeKnbHelper$startChangeSiteDirectly$1;->label:I

    .line 238
    move-object v4, v3

    .line 239
    const/4 v3, 0x0

    .line 240
    .line 241
    .line 242
    invoke-virtual/range {v0 .. v5}, Lcom/kubi/sdk/site/SiteService;->F(Ljava/lang/String;Lcom/kubi/sdk/site/SiteService$SwitchFromType;Ljava/lang/String;Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 243
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 244
    .line 245
    if-ne v0, v8, :cond_5

    .line 246
    return-object v8

    .line 247
    :cond_5
    move-object v1, v6

    .line 248
    .line 249
    :goto_5
    :try_start_4
    check-cast v0, Ljava/lang/Boolean;

    .line 250
    .line 251
    .line 252
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 253
    move-result v0

    .line 254
    .line 255
    .line 256
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 257
    move-result-object v0

    .line 258
    .line 259
    .line 260
    invoke-interface {v1, v0, v10}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 261
    goto :goto_7

    .line 262
    .line 263
    :goto_6
    const-string v13, "SiteBridgeKnbHelper"

    .line 264
    .line 265
    .line 266
    invoke-static {v13, v12}, Lro/b;->g(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 267
    .line 268
    new-instance v11, Lcom/kubi/sdk/site/exception/SiteException;

    .line 269
    .line 270
    const/16 v16, 0x8

    .line 271
    .line 272
    const/16 v17, 0x0

    .line 273
    const/4 v14, 0x0

    .line 274
    const/4 v15, 0x0

    .line 275
    .line 276
    .line 277
    invoke-direct/range {v11 .. v17}, Lcom/kubi/sdk/site/exception/SiteException;-><init>(Ljava/lang/Throwable;Ljava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 278
    .line 279
    .line 280
    invoke-static {v11, v10, v9, v10}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 281
    .line 282
    new-instance v11, Lcom/kubi/sdk/protocol/ProtocolException;

    .line 283
    move-object v13, v12

    .line 284
    .line 285
    const-string v12, "-1"

    .line 286
    .line 287
    const-string v14, "directly siteType error"

    .line 288
    const/4 v15, 0x0

    .line 289
    .line 290
    .line 291
    invoke-direct/range {v11 .. v17}, Lcom/kubi/sdk/protocol/ProtocolException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/Object;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 292
    .line 293
    .line 294
    invoke-interface {v6, v10, v11}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 295
    .line 296
    :goto_7
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 297
    return-object v0
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
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
.end method
