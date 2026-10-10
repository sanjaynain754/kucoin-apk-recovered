.class public final Lcom/kubi/sdk/site/config/SiteInfoProxy;
.super Ljava/lang/Object;
.source "SiteInfoProxy.kt"

# interfaces
.implements Lcom/kubi/sdk/site/info/a;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0002\n\u0002\u0008\u0005\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0008\u0010\u000e\u001a\u00020\u0005H\u0016J\u0016\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005H\u0096@\u00a2\u0006\u0002\u0010\u0011J\u000e\u0010\u0012\u001a\u00020\u0007H\u0096@\u00a2\u0006\u0002\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0005H\u0016J\u0016\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0008\u0010\t\"\u0004\u0008\n\u0010\u000bR\u0014\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00050\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/kubi/sdk/site/config/SiteInfoProxy;",
        "Lcom/kubi/sdk/site/info/ISiteInfoProxy;",
        "<init>",
        "()V",
        "TAG",
        "",
        "forceRedirect",
        "",
        "getForceRedirect",
        "()Z",
        "setForceRedirect",
        "(Z)V",
        "SiteInfoSId",
        "Lcom/kubi/utils/storage/StorageId;",
        "loadSiteType",
        "fetchSiteType",
        "defaultValue",
        "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "fetchSupportSiteConfig",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "saveSiteType",
        "",
        "siteType",
        "logd",
        "tag",
        "message",
        "LSiteConfig_googleRelease"
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
        "SMAP\nSiteInfoProxy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SiteInfoProxy.kt\ncom/kubi/sdk/site/config/SiteInfoProxy\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,100:1\n23#2,2:101\n*S KotlinDebug\n*F\n+ 1 SiteInfoProxy.kt\ncom/kubi/sdk/site/config/SiteInfoProxy\n*L\n94#1:101,2\n*E\n"
    }
.end annotation


# static fields
.field public static final a:Lcom/kubi/sdk/site/config/SiteInfoProxy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static b:Z

.field public static final c:Ly70/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ly70/g<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/sdk/site/config/SiteInfoProxy;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/kubi/sdk/site/config/SiteInfoProxy;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/kubi/sdk/site/config/SiteInfoProxy;->a:Lcom/kubi/sdk/site/config/SiteInfoProxy;

    .line 8
    .line 9
    new-instance v1, Ly70/g;

    .line 10
    .line 11
    sget-object v4, Lcom/kubi/utils/storage/StorageType;->Shared:Lcom/kubi/utils/storage/StorageType;

    .line 12
    .line 13
    const/16 v6, 0x8

    .line 14
    const/4 v7, 0x0

    .line 15
    .line 16
    const-string v2, "site"

    .line 17
    .line 18
    const-string v3, "siteType"

    .line 19
    const/4 v5, 0x0

    .line 20
    .line 21
    .line 22
    invoke-direct/range {v1 .. v7}, Ly70/g;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/kubi/utils/storage/StorageType;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 23
    .line 24
    sput-object v1, Lcom/kubi/sdk/site/config/SiteInfoProxy;->c:Ly70/g;

    .line 25
    return-void
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


# virtual methods
.method public b(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 9
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    instance-of v0, p2, Lcom/kubi/sdk/site/config/SiteInfoProxy$fetchSiteType$1;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p2

    .line 6
    .line 7
    check-cast v0, Lcom/kubi/sdk/site/config/SiteInfoProxy$fetchSiteType$1;

    .line 8
    .line 9
    iget v1, v0, Lcom/kubi/sdk/site/config/SiteInfoProxy$fetchSiteType$1;->label:I

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
    iput v1, v0, Lcom/kubi/sdk/site/config/SiteInfoProxy$fetchSiteType$1;->label:I

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lcom/kubi/sdk/site/config/SiteInfoProxy$fetchSiteType$1;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p0, p2}, Lcom/kubi/sdk/site/config/SiteInfoProxy$fetchSiteType$1;-><init>(Lcom/kubi/sdk/site/config/SiteInfoProxy;Lkotlin/coroutines/Continuation;)V

    .line 25
    .line 26
    :goto_0
    iget-object p2, v0, Lcom/kubi/sdk/site/config/SiteInfoProxy$fetchSiteType$1;->result:Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    iget v2, v0, Lcom/kubi/sdk/site/config/SiteInfoProxy$fetchSiteType$1;->label:I

    .line 33
    const/4 v3, 0x2

    .line 34
    const/4 v4, 0x1

    .line 35
    .line 36
    const-string v5, "SiteConfig::SiteInfoProxy"

    .line 37
    .line 38
    if-eqz v2, :cond_3

    .line 39
    .line 40
    if-eq v2, v4, :cond_2

    .line 41
    .line 42
    if-ne v2, v3, :cond_1

    .line 43
    .line 44
    iget p1, v0, Lcom/kubi/sdk/site/config/SiteInfoProxy$fetchSiteType$1;->I$0:I

    .line 45
    .line 46
    iget-object v1, v0, Lcom/kubi/sdk/site/config/SiteInfoProxy$fetchSiteType$1;->L$2:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v1, Lm00/b;

    .line 49
    .line 50
    iget-object v1, v0, Lcom/kubi/sdk/site/config/SiteInfoProxy$fetchSiteType$1;->L$1:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v1, Ljava/lang/String;

    .line 53
    .line 54
    iget-object v0, v0, Lcom/kubi/sdk/site/config/SiteInfoProxy$fetchSiteType$1;->L$0:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v0, Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    :try_start_0
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 60
    .line 61
    goto/16 :goto_4

    .line 62
    :catch_0
    move-exception p1

    .line 63
    .line 64
    goto/16 :goto_7

    .line 65
    .line 66
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 67
    .line 68
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 69
    .line 70
    .line 71
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 72
    throw p1

    .line 73
    .line 74
    :cond_2
    iget-object p1, v0, Lcom/kubi/sdk/site/config/SiteInfoProxy$fetchSiteType$1;->L$1:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast p1, Ljava/lang/String;

    .line 77
    .line 78
    iget-object v2, v0, Lcom/kubi/sdk/site/config/SiteInfoProxy$fetchSiteType$1;->L$0:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v2, Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 84
    move-object v8, p2

    .line 85
    move-object p2, p1

    .line 86
    move-object p1, v2

    .line 87
    move-object v2, v8

    .line 88
    goto :goto_1

    .line 89
    .line 90
    .line 91
    :cond_3
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 92
    .line 93
    new-instance p2, Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 97
    .line 98
    const-string v2, "fetchSiteType from server start "

    .line 99
    .line 100
    .line 101
    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 108
    move-result-object p2

    .line 109
    .line 110
    .line 111
    invoke-virtual {p0, v5, p2}, Lcom/kubi/sdk/site/config/SiteInfoProxy;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 112
    .line 113
    sget-object p2, Lcom/kubi/sdk/site/config/SupportSiteManager;->a:Lcom/kubi/sdk/site/config/SupportSiteManager;

    .line 114
    .line 115
    .line 116
    invoke-virtual {p2}, Lcom/kubi/sdk/site/config/SupportSiteManager;->b()Ljava/util/List;

    .line 117
    move-result-object v2

    .line 118
    .line 119
    .line 120
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 121
    move-result v2

    .line 122
    .line 123
    if-ne v2, v4, :cond_4

    .line 124
    .line 125
    .line 126
    invoke-virtual {p2}, Lcom/kubi/sdk/site/config/SupportSiteManager;->b()Ljava/util/List;

    .line 127
    move-result-object p1

    .line 128
    .line 129
    .line 130
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    .line 131
    move-result-object p1

    .line 132
    return-object p1

    .line 133
    .line 134
    .line 135
    :cond_4
    invoke-virtual {p2}, Lcom/kubi/sdk/site/config/SupportSiteManager;->c()Ly70/g;

    .line 136
    move-result-object p2

    .line 137
    .line 138
    const-string v2, ""

    .line 139
    .line 140
    .line 141
    invoke-static {p2, v2}, Ly70/a;->h(Ly70/g;Ljava/lang/String;)Ljava/lang/String;

    .line 142
    move-result-object p2

    .line 143
    .line 144
    new-instance v2, Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 148
    .line 149
    const-string v6, "fetchSiteType supportList = "

    .line 150
    .line 151
    .line 152
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 159
    move-result-object v2

    .line 160
    .line 161
    .line 162
    invoke-virtual {p0, v5, v2}, Lcom/kubi/sdk/site/config/SiteInfoProxy;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    .line 166
    move-result v2

    .line 167
    .line 168
    if-nez v2, :cond_6

    .line 169
    .line 170
    const-string v2, "hava no support site list, fetch it first"

    .line 171
    .line 172
    .line 173
    invoke-virtual {p0, v5, v2}, Lcom/kubi/sdk/site/config/SiteInfoProxy;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 174
    .line 175
    iput-object p1, v0, Lcom/kubi/sdk/site/config/SiteInfoProxy$fetchSiteType$1;->L$0:Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 179
    move-result-object v2

    .line 180
    .line 181
    iput-object v2, v0, Lcom/kubi/sdk/site/config/SiteInfoProxy$fetchSiteType$1;->L$1:Ljava/lang/Object;

    .line 182
    .line 183
    iput v4, v0, Lcom/kubi/sdk/site/config/SiteInfoProxy$fetchSiteType$1;->I$0:I

    .line 184
    .line 185
    iput v4, v0, Lcom/kubi/sdk/site/config/SiteInfoProxy$fetchSiteType$1;->label:I

    .line 186
    .line 187
    .line 188
    invoke-virtual {p0, v0}, Lcom/kubi/sdk/site/config/SiteInfoProxy;->c(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 189
    move-result-object v2

    .line 190
    .line 191
    if-ne v2, v1, :cond_5

    .line 192
    goto :goto_3

    .line 193
    .line 194
    :cond_5
    :goto_1
    check-cast v2, Ljava/lang/Boolean;

    .line 195
    .line 196
    .line 197
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 198
    move-result v2

    .line 199
    goto :goto_2

    .line 200
    :cond_6
    move v2, v4

    .line 201
    .line 202
    :goto_2
    :try_start_1
    new-instance v6, Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 206
    .line 207
    const-string v7, "fetchSiteType begin: "

    .line 208
    .line 209
    .line 210
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 211
    .line 212
    .line 213
    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 214
    .line 215
    .line 216
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 217
    move-result-object v6

    .line 218
    .line 219
    .line 220
    invoke-virtual {p0, v5, v6}, Lcom/kubi/sdk/site/config/SiteInfoProxy;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    invoke-static {}, Lmr/a;->b()Lretrofit2/Retrofit;

    .line 224
    move-result-object v6

    .line 225
    .line 226
    const-class v7, Lm00/b;

    .line 227
    .line 228
    .line 229
    invoke-virtual {v6, v7}, Lretrofit2/Retrofit;->create(Ljava/lang/Class;)Ljava/lang/Object;

    .line 230
    move-result-object v6

    .line 231
    .line 232
    check-cast v6, Lm00/b;

    .line 233
    .line 234
    iput-object p1, v0, Lcom/kubi/sdk/site/config/SiteInfoProxy$fetchSiteType$1;->L$0:Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 238
    move-result-object p2

    .line 239
    .line 240
    iput-object p2, v0, Lcom/kubi/sdk/site/config/SiteInfoProxy$fetchSiteType$1;->L$1:Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 244
    move-result-object p2

    .line 245
    .line 246
    iput-object p2, v0, Lcom/kubi/sdk/site/config/SiteInfoProxy$fetchSiteType$1;->L$2:Ljava/lang/Object;

    .line 247
    .line 248
    iput v2, v0, Lcom/kubi/sdk/site/config/SiteInfoProxy$fetchSiteType$1;->I$0:I

    .line 249
    .line 250
    iput v3, v0, Lcom/kubi/sdk/site/config/SiteInfoProxy$fetchSiteType$1;->label:I

    .line 251
    .line 252
    .line 253
    invoke-interface {v6, v0}, Lm00/b;->a(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 254
    move-result-object p2
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 255
    .line 256
    if-ne p2, v1, :cond_7

    .line 257
    :goto_3
    return-object v1

    .line 258
    :cond_7
    move-object v0, p1

    .line 259
    move p1, v2

    .line 260
    .line 261
    :goto_4
    :try_start_2
    check-cast p2, Lm00/a;

    .line 262
    .line 263
    .line 264
    invoke-virtual {p2}, Lm00/a;->a()Ljava/lang/Object;

    .line 265
    move-result-object p2

    .line 266
    .line 267
    check-cast p2, Lcom/kubi/sdk/site/info/data/SiteInfoEntity;

    .line 268
    .line 269
    new-instance v1, Ljava/lang/StringBuilder;

    .line 270
    .line 271
    .line 272
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 273
    .line 274
    const-string v2, "fetchSiteType end entity = "

    .line 275
    .line 276
    .line 277
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 278
    .line 279
    .line 280
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 281
    .line 282
    .line 283
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 284
    move-result-object v1

    .line 285
    .line 286
    .line 287
    invoke-virtual {p0, v5, v1}, Lcom/kubi/sdk/site/config/SiteInfoProxy;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 288
    .line 289
    if-nez p2, :cond_8

    .line 290
    return-object v0

    .line 291
    .line 292
    :cond_8
    new-instance v1, Ljava/lang/StringBuilder;

    .line 293
    .line 294
    .line 295
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 296
    .line 297
    const-string v2, "fetchSiteType end "

    .line 298
    .line 299
    .line 300
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 301
    .line 302
    .line 303
    invoke-virtual {p2}, Lcom/kubi/sdk/site/info/data/SiteInfoEntity;->getSiteType()Ljava/lang/String;

    .line 304
    move-result-object v2

    .line 305
    .line 306
    .line 307
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 308
    .line 309
    .line 310
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 311
    move-result-object v1

    .line 312
    .line 313
    .line 314
    invoke-static {v1, v5}, Lqq/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 315
    .line 316
    sget-object v1, Lcom/kubi/sdk/site/config/SupportSiteManager;->a:Lcom/kubi/sdk/site/config/SupportSiteManager;

    .line 317
    .line 318
    .line 319
    invoke-virtual {p2}, Lcom/kubi/sdk/site/info/data/SiteInfoEntity;->getSiteType()Ljava/lang/String;

    .line 320
    move-result-object v2

    .line 321
    .line 322
    if-eqz p1, :cond_9

    .line 323
    goto :goto_5

    .line 324
    :cond_9
    const/4 v4, 0x0

    .line 325
    .line 326
    .line 327
    :goto_5
    invoke-virtual {v1, v2, v4}, Lcom/kubi/sdk/site/config/SupportSiteManager;->f(Ljava/lang/String;Z)Z

    .line 328
    move-result p1

    .line 329
    .line 330
    if-eqz p1, :cond_a

    .line 331
    .line 332
    .line 333
    invoke-virtual {p2}, Lcom/kubi/sdk/site/info/data/SiteInfoEntity;->getForceRedirect()Z

    .line 334
    move-result p1

    .line 335
    .line 336
    .line 337
    invoke-virtual {p0, p1}, Lcom/kubi/sdk/site/config/SiteInfoProxy;->h(Z)V

    .line 338
    .line 339
    .line 340
    invoke-virtual {p2}, Lcom/kubi/sdk/site/info/data/SiteInfoEntity;->getSiteType()Ljava/lang/String;

    .line 341
    move-result-object p1

    .line 342
    goto :goto_6

    .line 343
    :cond_a
    move-object p1, v0

    .line 344
    .line 345
    :goto_6
    const-string p2, "SiteConfig::SupportSiteManager"

    .line 346
    .line 347
    new-instance v1, Ljava/lang/StringBuilder;

    .line 348
    .line 349
    .line 350
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 351
    .line 352
    const-string v2, "fetchSiteType isSupportSite: = "

    .line 353
    .line 354
    .line 355
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 356
    .line 357
    .line 358
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 359
    .line 360
    .line 361
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 362
    move-result-object v1

    .line 363
    .line 364
    .line 365
    invoke-static {p2, v1}, Lro/b;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 366
    return-object p1

    .line 367
    :catch_1
    move-exception p2

    .line 368
    move-object v0, p1

    .line 369
    move-object p1, p2

    .line 370
    .line 371
    :goto_7
    new-instance p2, Ljava/lang/StringBuilder;

    .line 372
    .line 373
    .line 374
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 375
    .line 376
    const-string v1, "load site type error: "

    .line 377
    .line 378
    .line 379
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 380
    .line 381
    .line 382
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 383
    move-result-object p1

    .line 384
    .line 385
    .line 386
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 387
    .line 388
    .line 389
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 390
    move-result-object p1

    .line 391
    .line 392
    .line 393
    invoke-static {v5, p1}, Lro/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 394
    return-object v0
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

.method public c(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .param p1    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    instance-of v0, p1, Lcom/kubi/sdk/site/config/SiteInfoProxy$fetchSupportSiteConfig$1;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p1

    .line 6
    .line 7
    check-cast v0, Lcom/kubi/sdk/site/config/SiteInfoProxy$fetchSupportSiteConfig$1;

    .line 8
    .line 9
    iget v1, v0, Lcom/kubi/sdk/site/config/SiteInfoProxy$fetchSupportSiteConfig$1;->label:I

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
    iput v1, v0, Lcom/kubi/sdk/site/config/SiteInfoProxy$fetchSupportSiteConfig$1;->label:I

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lcom/kubi/sdk/site/config/SiteInfoProxy$fetchSupportSiteConfig$1;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p0, p1}, Lcom/kubi/sdk/site/config/SiteInfoProxy$fetchSupportSiteConfig$1;-><init>(Lcom/kubi/sdk/site/config/SiteInfoProxy;Lkotlin/coroutines/Continuation;)V

    .line 25
    .line 26
    :goto_0
    iget-object p1, v0, Lcom/kubi/sdk/site/config/SiteInfoProxy$fetchSupportSiteConfig$1;->result:Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    iget v2, v0, Lcom/kubi/sdk/site/config/SiteInfoProxy$fetchSupportSiteConfig$1;->label:I

    .line 33
    const/4 v3, 0x1

    .line 34
    .line 35
    const-string v4, "SiteConfig::SiteInfoProxy"

    .line 36
    .line 37
    if-eqz v2, :cond_2

    .line 38
    .line 39
    if-ne v2, v3, :cond_1

    .line 40
    .line 41
    iget-object v0, v0, Lcom/kubi/sdk/site/config/SiteInfoProxy$fetchSupportSiteConfig$1;->L$0:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v0, Lm00/b;

    .line 44
    .line 45
    .line 46
    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 47
    goto :goto_1

    .line 48
    :catch_0
    move-exception p1

    .line 49
    goto :goto_2

    .line 50
    .line 51
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 52
    .line 53
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 54
    .line 55
    .line 56
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 57
    throw p1

    .line 58
    .line 59
    .line 60
    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 61
    .line 62
    :try_start_1
    const-string p1, "fetchSupportSiteConfig start"

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0, v4, p1}, Lcom/kubi/sdk/site/config/SiteInfoProxy;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    invoke-static {}, Lmr/a;->b()Lretrofit2/Retrofit;

    .line 69
    move-result-object p1

    .line 70
    .line 71
    const-class v2, Lm00/b;

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1, v2}, Lretrofit2/Retrofit;->create(Ljava/lang/Class;)Ljava/lang/Object;

    .line 75
    move-result-object p1

    .line 76
    .line 77
    check-cast p1, Lm00/b;

    .line 78
    .line 79
    .line 80
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    move-result-object v2

    .line 82
    .line 83
    iput-object v2, v0, Lcom/kubi/sdk/site/config/SiteInfoProxy$fetchSupportSiteConfig$1;->L$0:Ljava/lang/Object;

    .line 84
    .line 85
    iput v3, v0, Lcom/kubi/sdk/site/config/SiteInfoProxy$fetchSupportSiteConfig$1;->label:I

    .line 86
    .line 87
    .line 88
    invoke-interface {p1, v0}, Lm00/b;->b(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 89
    move-result-object p1

    .line 90
    .line 91
    if-ne p1, v1, :cond_3

    .line 92
    return-object v1

    .line 93
    .line 94
    :cond_3
    :goto_1
    check-cast p1, Lm00/a;

    .line 95
    .line 96
    .line 97
    invoke-virtual {p1}, Lm00/a;->a()Ljava/lang/Object;

    .line 98
    move-result-object p1

    .line 99
    .line 100
    check-cast p1, Ljava/util/List;

    .line 101
    .line 102
    new-instance v0, Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 106
    .line 107
    const-string v1, "fetchSupportSiteConfig res = "

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 117
    move-result-object v0

    .line 118
    .line 119
    .line 120
    invoke-virtual {p0, v4, v0}, Lcom/kubi/sdk/site/config/SiteInfoProxy;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 121
    .line 122
    if-eqz p1, :cond_4

    .line 123
    .line 124
    sget-object v0, Lcom/kubi/sdk/site/config/SupportSiteManager;->a:Lcom/kubi/sdk/site/config/SupportSiteManager;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v0, p1}, Lcom/kubi/sdk/site/config/SupportSiteManager;->j(Ljava/util/List;)V

    .line 128
    .line 129
    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 133
    .line 134
    const-string v1, "fetchSupportSiteConfig "

    .line 135
    .line 136
    .line 137
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 144
    move-result-object p1

    .line 145
    .line 146
    .line 147
    invoke-static {p1, v4}, Lqq/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 151
    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 152
    return-object p1

    .line 153
    .line 154
    :goto_2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 158
    .line 159
    const-string v1, "fetchSupportSiteConfig error: "

    .line 160
    .line 161
    .line 162
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 166
    move-result-object p1

    .line 167
    .line 168
    .line 169
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 173
    move-result-object p1

    .line 174
    .line 175
    .line 176
    invoke-static {v4, p1}, Lro/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 177
    const/4 p1, 0x0

    .line 178
    .line 179
    .line 180
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 181
    move-result-object p1

    .line 182
    return-object p1
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
.end method

.method public d()Z
    .locals 1

    .line 1
    .line 2
    sget-boolean v0, Lcom/kubi/sdk/site/config/SiteInfoProxy;->b:Z

    .line 3
    return v0
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

.method public e()Ljava/lang/String;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/sdk/site/config/SiteInfoProxy;->c:Ly70/g;

    .line 3
    .line 4
    sget-object v1, Lcom/kubi/sdk/site/SiteType;->Global:Lcom/kubi/sdk/site/SiteType;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v1}, Lcom/kubi/sdk/site/SiteType;->getSiteType()Ljava/lang/String;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1}, Ly70/a;->h(Ly70/g;Ljava/lang/String;)Ljava/lang/String;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    new-instance v1, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 18
    .line 19
    const-string v2, "loadSiteType end "

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    move-result-object v1

    .line 30
    .line 31
    const-string v2, "SiteConfig::SiteInfoProxy"

    .line 32
    .line 33
    .line 34
    invoke-static {v1, v2}, Lqq/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    return-object v0
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
.end method

.method public final f(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "tag"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "message"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-static {p1, p2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 14
    return-void
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
.end method

.method public g(Ljava/lang/String;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "siteType"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 11
    .line 12
    const-string v1, "save site type: "

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    const-string v1, "SiteConfig::SiteInfoProxy"

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, v1, v0}, Lcom/kubi/sdk/site/config/SiteInfoProxy;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    .line 29
    sget-object v0, Lcom/kubi/sdk/site/config/SiteInfoProxy;->c:Ly70/g;

    .line 30
    .line 31
    .line 32
    invoke-static {v0, p1}, Ly70/a;->p(Ly70/g;Ljava/lang/String;)Ly70/a;

    .line 33
    return-void
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

.method public h(Z)V
    .locals 0

    .line 1
    .line 2
    sput-boolean p1, Lcom/kubi/sdk/site/config/SiteInfoProxy;->b:Z

    .line 3
    return-void
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
