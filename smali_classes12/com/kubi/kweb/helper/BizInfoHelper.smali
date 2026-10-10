.class public final Lcom/kubi/kweb/helper/BizInfoHelper;
.super Ljava/lang/Object;
.source "BizInfoHelper.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/kweb/helper/BizInfoHelper$BaseWebInfo;,
        Lcom/kubi/kweb/helper/BizInfoHelper$LoadMapInfo;,
        Lcom/kubi/kweb/helper/BizInfoHelper$LoadMapV3;,
        Lcom/kubi/kweb/helper/BizInfoHelper$PackageConfig;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u00c0\u0002\u0018\u00002\u00020\u0001:\u0004\u0017\u0018\u0019\u001aB\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000c\u0010\t\u001a\u00020\u0005*\u00020\u0005H\u0002J\u001c\u0010\n\u001a\u00020\u000b2\u0012\u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e0\rH\u0002J\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0010J$\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00132\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e0\rH\u0002J\u0010\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u0005H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00080\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"
    }
    d2 = {
        "Lcom/kubi/kweb/helper/BizInfoHelper;",
        "",
        "<init>",
        "()V",
        "TAG",
        "",
        "bizMap",
        "",
        "Lcom/kubi/sdk/web/config/WebBizInfo;",
        "fixPath",
        "loadV2Config",
        "",
        "loadMap",
        "",
        "Lcom/kubi/kweb/helper/BizInfoHelper$LoadMapInfo;",
        "initBizConfig",
        "",
        "handleConfig",
        "loadMapV3",
        "Lcom/kubi/kweb/helper/BizInfoHelper$LoadMapV3;",
        "loadV2Map",
        "testConfig",
        "config",
        "PackageConfig",
        "LoadMapInfo",
        "BaseWebInfo",
        "LoadMapV3",
        "KWebLib_googleRelease"
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
        "SMAP\nBizInfoHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BizInfoHelper.kt\ncom/kubi/kweb/helper/BizInfoHelper\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 4 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,169:1\n216#2,2:170\n216#2,2:179\n216#2,2:181\n35#3,4:172\n39#3:178\n44#4,2:176\n*S KotlinDebug\n*F\n+ 1 BizInfoHelper.kt\ncom/kubi/kweb/helper/BizInfoHelper\n*L\n75#1:170,2\n131#1:179,2\n143#1:181,2\n99#1:172,4\n99#1:178\n99#1:176,2\n*E\n"
    }
.end annotation


# static fields
.field public static final a:Lcom/kubi/kweb/helper/BizInfoHelper;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lx00/a;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/kweb/helper/BizInfoHelper;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/kubi/kweb/helper/BizInfoHelper;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/kubi/kweb/helper/BizInfoHelper;->a:Lcom/kubi/kweb/helper/BizInfoHelper;

    .line 8
    .line 9
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 10
    .line 11
    .line 12
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 13
    .line 14
    sput-object v0, Lcom/kubi/kweb/helper/BizInfoHelper;->b:Ljava/util/Map;

    .line 15
    return-void
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


# virtual methods
.method public final a(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    .line 2
    const-string v0, "http"

    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x2

    .line 5
    const/4 v3, 0x0

    .line 6
    .line 7
    .line 8
    invoke-static {p1, v0, v1, v2, v3}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 9
    move-result v0

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    return-object p1

    .line 13
    .line 14
    :cond_0
    const-string v0, "/"

    .line 15
    .line 16
    .line 17
    invoke-static {p1, v0, v1, v2, v3}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 18
    move-result v0

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    new-instance v0, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 26
    .line 27
    sget-object v1, Lcom/kubi/host/HostManager;->a:Lcom/kubi/host/HostManager;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1}, Lcom/kubi/host/HostManager;->m()Ljava/lang/String;

    .line 31
    move-result-object v1

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    move-result-object p1

    .line 42
    return-object p1

    .line 43
    .line 44
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 48
    .line 49
    sget-object v1, Lcom/kubi/host/HostManager;->a:Lcom/kubi/host/HostManager;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1}, Lcom/kubi/host/HostManager;->m()Ljava/lang/String;

    .line 53
    move-result-object v1

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    const/16 v1, 0x2f

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    move-result-object p1

    .line 69
    return-object p1
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
.end method

.method public final b(Lcom/kubi/kweb/helper/BizInfoHelper$LoadMapV3;Ljava/util/Map;)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/kweb/helper/BizInfoHelper$LoadMapV3;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/kubi/kweb/helper/BizInfoHelper$LoadMapInfo;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/kweb/helper/BizInfoHelper$LoadMapV3;->isEmpty()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    const-string v1, "BizInfoHelper"

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    sget-object v0, Lx00/b;->a:Lx00/b;

    .line 11
    const/4 v2, 0x1

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v2}, Lx00/b;->n(I)V

    .line 15
    .line 16
    const-string v0, "initBizConfig: v2"

    .line 17
    .line 18
    .line 19
    invoke-static {v0, v1}, Lqq/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    .line 21
    move-object/from16 v0, p0

    .line 22
    .line 23
    move-object/from16 v1, p2

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v1}, Lcom/kubi/kweb/helper/BizInfoHelper;->d(Ljava/util/Map;)V

    .line 27
    return-void

    .line 28
    .line 29
    :cond_0
    move-object/from16 v0, p0

    .line 30
    .line 31
    sget-object v2, Lx00/b;->a:Lx00/b;

    .line 32
    const/4 v3, 0x2

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2, v3}, Lx00/b;->n(I)V

    .line 36
    .line 37
    const-string v2, "initBizConfig: v3"

    .line 38
    .line 39
    .line 40
    invoke-static {v2, v1}, Lqq/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/kweb/helper/BizInfoHelper$LoadMapV3;->getBase()Ljava/util/Map;

    .line 44
    move-result-object v2

    .line 45
    .line 46
    .line 47
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 48
    move-result-object v2

    .line 49
    .line 50
    .line 51
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 52
    move-result-object v2

    .line 53
    .line 54
    .line 55
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 56
    move-result v3

    .line 57
    .line 58
    const-string v4, ": "

    .line 59
    .line 60
    if-eqz v3, :cond_1

    .line 61
    .line 62
    .line 63
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 64
    move-result-object v3

    .line 65
    .line 66
    check-cast v3, Ljava/util/Map$Entry;

    .line 67
    .line 68
    .line 69
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 70
    move-result-object v5

    .line 71
    move-object v7, v5

    .line 72
    .line 73
    check-cast v7, Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 77
    move-result-object v3

    .line 78
    .line 79
    check-cast v3, Lcom/kubi/kweb/helper/BizInfoHelper$BaseWebInfo;

    .line 80
    .line 81
    new-instance v6, Lx00/a;

    .line 82
    .line 83
    sget-object v5, Lcom/kubi/kweb/helper/BizInfoHelper;->a:Lcom/kubi/kweb/helper/BizInfoHelper;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v3}, Lcom/kubi/kweb/helper/BizInfoHelper$BaseWebInfo;->getSource()Ljava/lang/String;

    .line 87
    move-result-object v8

    .line 88
    .line 89
    .line 90
    invoke-virtual {v5, v8}, Lcom/kubi/kweb/helper/BizInfoHelper;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 91
    move-result-object v10

    .line 92
    .line 93
    const/16 v15, 0xf0

    .line 94
    .line 95
    const/16 v16, 0x0

    .line 96
    const/4 v11, 0x0

    .line 97
    const/4 v12, 0x0

    .line 98
    const/4 v13, 0x0

    .line 99
    const/4 v14, 0x0

    .line 100
    move-object v8, v7

    .line 101
    move-object v9, v7

    .line 102
    .line 103
    .line 104
    invoke-direct/range {v6 .. v16}, Lx00/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 105
    .line 106
    sget-object v5, Lcom/kubi/kweb/helper/BizInfoHelper;->b:Ljava/util/Map;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v6}, Lx00/a;->b()Ljava/lang/String;

    .line 110
    move-result-object v8

    .line 111
    .line 112
    .line 113
    invoke-interface {v5, v8, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    .line 115
    sget-object v5, Lx00/b;->a:Lx00/b;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v5, v7}, Lx00/b;->a(Ljava/lang/String;)V

    .line 119
    .line 120
    new-instance v5, Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v6}, Lx00/a;->b()Ljava/lang/String;

    .line 127
    move-result-object v6

    .line 128
    .line 129
    .line 130
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 140
    move-result-object v3

    .line 141
    .line 142
    .line 143
    invoke-static {v1, v3}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 144
    goto :goto_0

    .line 145
    .line 146
    .line 147
    :cond_1
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/kweb/helper/BizInfoHelper$LoadMapV3;->getOfflinePages()Ljava/util/Map;

    .line 148
    move-result-object v2

    .line 149
    .line 150
    .line 151
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 152
    move-result-object v2

    .line 153
    .line 154
    .line 155
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 156
    move-result-object v2

    .line 157
    .line 158
    .line 159
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 160
    move-result v3

    .line 161
    .line 162
    if-eqz v3, :cond_3

    .line 163
    .line 164
    .line 165
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 166
    move-result-object v3

    .line 167
    .line 168
    check-cast v3, Ljava/util/Map$Entry;

    .line 169
    .line 170
    .line 171
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 172
    move-result-object v5

    .line 173
    move-object v7, v5

    .line 174
    .line 175
    check-cast v7, Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 179
    move-result-object v3

    .line 180
    .line 181
    check-cast v3, Lcom/kubi/kweb/helper/BizInfoHelper$LoadMapInfo;

    .line 182
    .line 183
    .line 184
    invoke-virtual {v3}, Lcom/kubi/kweb/helper/BizInfoHelper$LoadMapInfo;->getBiz()Ljava/lang/String;

    .line 185
    move-result-object v8

    .line 186
    .line 187
    .line 188
    invoke-virtual {v3}, Lcom/kubi/kweb/helper/BizInfoHelper$LoadMapInfo;->getPackageName()Ljava/lang/String;

    .line 189
    move-result-object v9

    .line 190
    .line 191
    .line 192
    invoke-virtual {v3}, Lcom/kubi/kweb/helper/BizInfoHelper$LoadMapInfo;->getHttpProxy()Z

    .line 193
    move-result v12

    .line 194
    .line 195
    .line 196
    invoke-virtual {v3}, Lcom/kubi/kweb/helper/BizInfoHelper$LoadMapInfo;->getIndexEnable()Z

    .line 197
    move-result v11

    .line 198
    .line 199
    .line 200
    invoke-virtual {v3}, Lcom/kubi/kweb/helper/BizInfoHelper$LoadMapInfo;->getSource()Ljava/lang/String;

    .line 201
    move-result-object v5

    .line 202
    .line 203
    if-eqz v5, :cond_2

    .line 204
    .line 205
    sget-object v6, Lcom/kubi/kweb/helper/BizInfoHelper;->a:Lcom/kubi/kweb/helper/BizInfoHelper;

    .line 206
    .line 207
    .line 208
    invoke-virtual {v6, v5}, Lcom/kubi/kweb/helper/BizInfoHelper;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 209
    move-result-object v5

    .line 210
    :goto_2
    move-object v10, v5

    .line 211
    goto :goto_3

    .line 212
    :cond_2
    const/4 v5, 0x0

    .line 213
    goto :goto_2

    .line 214
    .line 215
    .line 216
    :goto_3
    invoke-virtual {v3}, Lcom/kubi/kweb/helper/BizInfoHelper$LoadMapInfo;->getNoWifiEnable()Z

    .line 217
    move-result v13

    .line 218
    .line 219
    .line 220
    invoke-virtual {v3}, Lcom/kubi/kweb/helper/BizInfoHelper$LoadMapInfo;->getIndexHtmlName()Ljava/lang/String;

    .line 221
    move-result-object v14

    .line 222
    .line 223
    new-instance v6, Lx00/a;

    .line 224
    .line 225
    .line 226
    invoke-direct/range {v6 .. v14}, Lx00/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;)V

    .line 227
    .line 228
    sget-object v5, Lcom/kubi/kweb/helper/BizInfoHelper;->b:Ljava/util/Map;

    .line 229
    .line 230
    .line 231
    invoke-virtual {v6}, Lx00/a;->b()Ljava/lang/String;

    .line 232
    move-result-object v7

    .line 233
    .line 234
    .line 235
    invoke-interface {v5, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 236
    .line 237
    sget-object v5, Lx00/b;->a:Lx00/b;

    .line 238
    .line 239
    .line 240
    invoke-virtual {v3}, Lcom/kubi/kweb/helper/BizInfoHelper$LoadMapInfo;->getPackageName()Ljava/lang/String;

    .line 241
    move-result-object v7

    .line 242
    .line 243
    .line 244
    invoke-virtual {v5, v7}, Lx00/b;->c(Ljava/lang/String;)V

    .line 245
    .line 246
    new-instance v5, Ljava/lang/StringBuilder;

    .line 247
    .line 248
    .line 249
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 250
    .line 251
    .line 252
    invoke-virtual {v6}, Lx00/a;->b()Ljava/lang/String;

    .line 253
    move-result-object v6

    .line 254
    .line 255
    .line 256
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 257
    .line 258
    .line 259
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 260
    .line 261
    .line 262
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 263
    .line 264
    .line 265
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 266
    move-result-object v3

    .line 267
    .line 268
    .line 269
    invoke-static {v1, v3}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 270
    goto :goto_1

    .line 271
    .line 272
    :cond_3
    sget-object v1, Lx00/b;->a:Lx00/b;

    .line 273
    .line 274
    .line 275
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/kweb/helper/BizInfoHelper$LoadMapV3;->getSupportPages()Ljava/util/List;

    .line 276
    move-result-object v2

    .line 277
    .line 278
    .line 279
    invoke-virtual {v1, v2}, Lx00/b;->f(Ljava/util/List;)V

    .line 280
    return-void
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

.method public final c()Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lx00/a;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    :try_start_0
    const-string v0, "h5_offline_package"
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 3
    .line 4
    :try_start_1
    sget-object v1, Lcom/kubi/config/RemoteConfig;->a:Lcom/kubi/config/RemoteConfig;

    .line 5
    .line 6
    new-instance v1, Lcom/kubi/kweb/helper/BizInfoHelper$a;

    .line 7
    .line 8
    .line 9
    invoke-direct {v1}, Lcom/kubi/kweb/helper/BizInfoHelper$a;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    const-string v2, "object : TypeToken<T>() {}.type"

    .line 16
    .line 17
    .line 18
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-static {v0, v1}, Lcom/kubi/config/RemoteConfig;->a(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 22
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception v0

    .line 25
    move-object v2, v0

    .line 26
    .line 27
    :try_start_2
    const-string v3, "RemoteConfig"

    .line 28
    .line 29
    new-instance v1, Lcom/kubi/config/exception/KCConfigException;

    .line 30
    .line 31
    const/16 v6, 0x8

    .line 32
    const/4 v7, 0x0

    .line 33
    const/4 v4, 0x0

    .line 34
    const/4 v5, 0x0

    .line 35
    .line 36
    .line 37
    invoke-direct/range {v1 .. v7}, Lcom/kubi/config/exception/KCConfigException;-><init>(Ljava/lang/Throwable;Ljava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 38
    const/4 v0, 0x2

    .line 39
    const/4 v2, 0x0

    .line 40
    .line 41
    .line 42
    invoke-static {v1, v2, v0, v2}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 43
    move-object v0, v2

    .line 44
    .line 45
    :goto_0
    check-cast v0, Lcom/kubi/kweb/helper/BizInfoHelper$PackageConfig;

    .line 46
    const/4 v1, -0x1

    .line 47
    .line 48
    if-eqz v0, :cond_1

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, Lcom/kubi/kweb/helper/BizInfoHelper$PackageConfig;->getLoadMapV3()Lcom/kubi/kweb/helper/BizInfoHelper$LoadMapV3;

    .line 52
    move-result-object v2

    .line 53
    .line 54
    if-nez v2, :cond_0

    .line 55
    .line 56
    sget-object v2, Lx00/b;->a:Lx00/b;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v2, v1}, Lx00/b;->n(I)V

    .line 60
    .line 61
    const-string v1, "Not Fetch, So initBizConfig: v2"

    .line 62
    .line 63
    const-string v2, "BizInfoHelper"

    .line 64
    .line 65
    .line 66
    invoke-static {v1, v2}, Lqq/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, Lcom/kubi/kweb/helper/BizInfoHelper$PackageConfig;->getLoadMap()Ljava/util/Map;

    .line 70
    move-result-object v0

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0, v0}, Lcom/kubi/kweb/helper/BizInfoHelper;->d(Ljava/util/Map;)V

    .line 74
    goto :goto_2

    .line 75
    :catchall_1
    move-exception v0

    .line 76
    goto :goto_1

    .line 77
    .line 78
    .line 79
    :cond_0
    invoke-virtual {v0}, Lcom/kubi/kweb/helper/BizInfoHelper$PackageConfig;->getLoadMap()Ljava/util/Map;

    .line 80
    move-result-object v0

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0, v2, v0}, Lcom/kubi/kweb/helper/BizInfoHelper;->b(Lcom/kubi/kweb/helper/BizInfoHelper$LoadMapV3;Ljava/util/Map;)V

    .line 84
    goto :goto_2

    .line 85
    .line 86
    :cond_1
    sget-object v0, Lx00/b;->a:Lx00/b;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0, v1}, Lx00/b;->n(I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 90
    goto :goto_2

    .line 91
    .line 92
    :goto_1
    const-string v1, "loadh5Config"

    .line 93
    .line 94
    const-string v2, "initBizConfig error"

    .line 95
    .line 96
    .line 97
    invoke-static {v1, v2, v0}, Lro/b;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 98
    .line 99
    :goto_2
    sget-object v0, Lcom/kubi/kweb/helper/BizInfoHelper;->b:Ljava/util/Map;

    .line 100
    .line 101
    .line 102
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 103
    move-result-object v0

    .line 104
    .line 105
    .line 106
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    .line 107
    move-result-object v0

    .line 108
    return-object v0
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

.method public final d(Ljava/util/Map;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/kubi/kweb/helper/BizInfoHelper$LoadMapInfo;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    .line 7
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 8
    move-result-object p1

    .line 9
    .line 10
    .line 11
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    move-result v0

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    .line 17
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    check-cast v0, Ljava/util/Map$Entry;

    .line 21
    .line 22
    .line 23
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 24
    move-result-object v1

    .line 25
    move-object v3, v1

    .line 26
    .line 27
    check-cast v3, Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 31
    move-result-object v0

    .line 32
    .line 33
    check-cast v0, Lcom/kubi/kweb/helper/BizInfoHelper$LoadMapInfo;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Lcom/kubi/kweb/helper/BizInfoHelper$LoadMapInfo;->getBiz()Ljava/lang/String;

    .line 37
    move-result-object v4

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Lcom/kubi/kweb/helper/BizInfoHelper$LoadMapInfo;->getPackageName()Ljava/lang/String;

    .line 41
    move-result-object v5

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Lcom/kubi/kweb/helper/BizInfoHelper$LoadMapInfo;->getHttpProxy()Z

    .line 45
    move-result v8

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Lcom/kubi/kweb/helper/BizInfoHelper$LoadMapInfo;->getIndexEnable()Z

    .line 49
    move-result v7

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Lcom/kubi/kweb/helper/BizInfoHelper$LoadMapInfo;->getSource()Ljava/lang/String;

    .line 53
    move-result-object v1

    .line 54
    .line 55
    if-eqz v1, :cond_0

    .line 56
    .line 57
    sget-object v2, Lcom/kubi/kweb/helper/BizInfoHelper;->a:Lcom/kubi/kweb/helper/BizInfoHelper;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v2, v1}, Lcom/kubi/kweb/helper/BizInfoHelper;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 61
    move-result-object v1

    .line 62
    :goto_1
    move-object v6, v1

    .line 63
    goto :goto_2

    .line 64
    :cond_0
    const/4 v1, 0x0

    .line 65
    goto :goto_1

    .line 66
    .line 67
    .line 68
    :goto_2
    invoke-virtual {v0}, Lcom/kubi/kweb/helper/BizInfoHelper$LoadMapInfo;->getNoWifiEnable()Z

    .line 69
    move-result v9

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0}, Lcom/kubi/kweb/helper/BizInfoHelper$LoadMapInfo;->getIndexHtmlName()Ljava/lang/String;

    .line 73
    move-result-object v10

    .line 74
    .line 75
    new-instance v2, Lx00/a;

    .line 76
    .line 77
    .line 78
    invoke-direct/range {v2 .. v10}, Lx00/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;)V

    .line 79
    .line 80
    sget-object v1, Lcom/kubi/kweb/helper/BizInfoHelper;->b:Ljava/util/Map;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v2}, Lx00/a;->b()Ljava/lang/String;

    .line 84
    move-result-object v3

    .line 85
    .line 86
    .line 87
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    sget-object v1, Lx00/b;->a:Lx00/b;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0}, Lcom/kubi/kweb/helper/BizInfoHelper$LoadMapInfo;->getPackageName()Ljava/lang/String;

    .line 93
    move-result-object v3

    .line 94
    .line 95
    .line 96
    invoke-virtual {v1, v3}, Lx00/b;->c(Ljava/lang/String;)V

    .line 97
    .line 98
    new-instance v1, Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v2}, Lx00/a;->b()Ljava/lang/String;

    .line 105
    move-result-object v2

    .line 106
    .line 107
    .line 108
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    const-string v2, ": "

    .line 111
    .line 112
    .line 113
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 120
    move-result-object v0

    .line 121
    .line 122
    const-string v1, "BizInfoHelper"

    .line 123
    .line 124
    .line 125
    invoke-static {v1, v0}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 126
    goto :goto_0

    .line 127
    :cond_1
    return-void
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
.end method
