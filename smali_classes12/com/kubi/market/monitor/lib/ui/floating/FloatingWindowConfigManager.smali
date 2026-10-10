.class public final Lcom/kubi/market/monitor/lib/ui/floating/FloatingWindowConfigManager;
.super Ljava/lang/Object;
.source "FloatingWindowConfigManager.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0006\u0010\u0012\u001a\u00020\u0013J\u000c\u0010\u0014\u001a\u00020\u0015*\u00020\u0005H\u0002J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0013H\u0002J\u0008\u0010\u0018\u001a\u00020\rH\u0002J\u0006\u0010\u0019\u001a\u00020\u0015J\u001f\u0010\u001a\u001a\u00020\u00152\u0017\u0010\u001b\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u001c\u00a2\u0006\u0002\u0008\u001dJ\u000e\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0013J\u0010\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u000c\u001a\u00020\rH\u0002J\u000c\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u00050!J\u000e\u0010\"\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\u0005J\u0010\u0010$\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\u0005H\u0002J\u000e\u0010%\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\u0005J\u0006\u0010&\u001a\u00020\u0013J\"\u0010\'\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010(j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`)H\u0086@\u00a2\u0006\u0002\u0010*J\u0006\u0010+\u001a\u00020\u0005J\u0014\u0010,\u001a\u00020\u00152\u000c\u0010-\u001a\u0008\u0012\u0004\u0012\u00020\u00050!J\u000c\u0010.\u001a\u0008\u0012\u0004\u0012\u00020\u00050!J\u0006\u0010/\u001a\u00020\u0005J\u0014\u00100\u001a\u00020\u00152\u000c\u00101\u001a\u0008\u0012\u0004\u0012\u00020\u00050!J\u0006\u00102\u001a\u000203J\u000e\u00104\u001a\u00020\u00152\u0006\u00105\u001a\u000203R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00050\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00050\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000c\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000e\u0010\u000f\"\u0004\u0008\u0010\u0010\u0011\u00a8\u00066"
    }
    d2 = {
        "Lcom/kubi/market/monitor/lib/ui/floating/FloatingWindowConfigManager;",
        "",
        "<init>",
        "()V",
        "LOG_TAG",
        "",
        "market_floating_window_config",
        "category_market_floating_window",
        "NEWFLOATING_SYMBOLS_LIST_DATA_KEY",
        "TRACKING_SYMBOLS_KEY",
        "Lcom/kubi/utils/storage/StorageId;",
        "FLOATING_LAST_POSITION_KEY",
        "config",
        "Lcom/kubi/market/monitor/lib/entity/MarketFloatingWindowConfig;",
        "getConfig",
        "()Lcom/kubi/market/monitor/lib/entity/MarketFloatingWindowConfig;",
        "setConfig",
        "(Lcom/kubi/market/monitor/lib/entity/MarketFloatingWindowConfig;)V",
        "getOldFloatingWindowSwitch",
        "",
        "log",
        "",
        "saveOldFloatingWindowSwitch",
        "switch",
        "initMarketFloatingWindowConfig",
        "init",
        "updateMarketFloatingWindowConfig",
        "block",
        "Lkotlin/Function1;",
        "Lkotlin/ExtensionFunctionType;",
        "updateFloatingWindowSwitch",
        "saveMarketFloatingWindowConfig",
        "getNewSymbolList",
        "",
        "addOrRemoveSymbol",
        "symbol",
        "addSymbol",
        "removeSymbol",
        "canShowFloatingWindow",
        "getSymbolsListData",
        "Ljava/util/ArrayList;",
        "Lkotlin/collections/ArrayList;",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "getSymbolsString",
        "saveSymbolsListData",
        "newListData",
        "getOldSymbolList",
        "getOldSymbolListString",
        "saveOldSymbolList",
        "list",
        "getFloatingPoint",
        "Landroid/graphics/Point;",
        "cacheFloatingPoint",
        "point",
        "MarketMonitorLib_googleRelease"
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
        "SMAP\nFloatingWindowConfigManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatingWindowConfigManager.kt\ncom/kubi/market/monitor/lib/ui/floating/FloatingWindowConfigManager\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 3 JsonEx.kt\ncom/kubi/mvi/common/JsonExKt\n+ 4 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n+ 5 JsonEx.kt\ncom/kubi/utils/extensions/JsonExKt\n+ 6 MarketMonitorIssue.kt\ncom/kubi/market/monitor/lib/exeption/MarketMonitorIssueKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 CommonUtils.kt\ncom/kubi/market/monitor/lib/ui/floating/window/util/CommonUtilsKt\n*L\n1#1,302:1\n135#2,2:303\n126#2,2:305\n32#2:355\n23#2,2:359\n32#2:361\n23#2,2:362\n36#3:307\n36#3:316\n36#3:349\n137#4,5:308\n137#4,5:317\n196#4,3:327\n137#4,5:350\n35#5,3:313\n35#5,3:356\n45#6,4:322\n45#6,4:344\n1#7:326\n63#8,14:330\n78#8:348\n*S KotlinDebug\n*F\n+ 1 FloatingWindowConfigManager.kt\ncom/kubi/market/monitor/lib/ui/floating/FloatingWindowConfigManager\n*L\n72#1:303,2\n86#1:305,2\n261#1:355\n269#1:359,2\n277#1:361\n294#1:362,2\n96#1:307\n152#1:316\n252#1:349\n96#1:308,5\n152#1:317,5\n218#1:327,3\n252#1:350,5\n139#1:313,3\n269#1:356,3\n198#1:322,4\n239#1:344,4\n239#1:330,14\n239#1:348\n*E\n"
    }
.end annotation


# static fields
.field public static final a:Lcom/kubi/market/monitor/lib/ui/floating/FloatingWindowConfigManager;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final b:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

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

.field public static final d:Ly70/g;
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

.field public static e:Lcom/kubi/market/monitor/lib/entity/MarketFloatingWindowConfig;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/market/monitor/lib/ui/floating/FloatingWindowConfigManager;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/kubi/market/monitor/lib/ui/floating/FloatingWindowConfigManager;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/kubi/market/monitor/lib/ui/floating/FloatingWindowConfigManager;->a:Lcom/kubi/market/monitor/lib/ui/floating/FloatingWindowConfigManager;

    .line 8
    .line 9
    const-string v1, "FloatingWindowConfigManager"

    .line 10
    .line 11
    sput-object v1, Lcom/kubi/market/monitor/lib/ui/floating/FloatingWindowConfigManager;->b:Ljava/lang/String;

    .line 12
    .line 13
    new-instance v2, Ly70/g;

    .line 14
    .line 15
    const/16 v7, 0xc

    .line 16
    const/4 v8, 0x0

    .line 17
    .line 18
    const-string v3, "CATE_KV_MARKET_MONITOR"

    .line 19
    .line 20
    const-string v4, "tracking_symbols_key_list_data"

    .line 21
    const/4 v5, 0x0

    .line 22
    const/4 v6, 0x0

    .line 23
    .line 24
    .line 25
    invoke-direct/range {v2 .. v8}, Ly70/g;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/kubi/utils/storage/StorageType;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 26
    .line 27
    sput-object v2, Lcom/kubi/market/monitor/lib/ui/floating/FloatingWindowConfigManager;->c:Ly70/g;

    .line 28
    .line 29
    new-instance v3, Ly70/g;

    .line 30
    .line 31
    const/16 v8, 0xc

    .line 32
    const/4 v9, 0x0

    .line 33
    .line 34
    const-string v4, "CATE_KV_MARKET_MONITOR"

    .line 35
    .line 36
    const-string v5, "floating_last_position_key"

    .line 37
    const/4 v6, 0x0

    .line 38
    const/4 v7, 0x0

    .line 39
    .line 40
    .line 41
    invoke-direct/range {v3 .. v9}, Ly70/g;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/kubi/utils/storage/StorageType;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 42
    .line 43
    sput-object v3, Lcom/kubi/market/monitor/lib/ui/floating/FloatingWindowConfigManager;->d:Ly70/g;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Lcom/kubi/market/monitor/lib/ui/floating/FloatingWindowConfigManager;->o()Lcom/kubi/market/monitor/lib/entity/MarketFloatingWindowConfig;

    .line 47
    move-result-object v0

    .line 48
    .line 49
    sput-object v0, Lcom/kubi/market/monitor/lib/ui/floating/FloatingWindowConfigManager;->e:Lcom/kubi/market/monitor/lib/entity/MarketFloatingWindowConfig;

    .line 50
    return-void
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

.method public static synthetic a(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/market/monitor/lib/ui/floating/FloatingWindowConfigManager;->r(Ljava/lang/String;Ljava/lang/String;)Z

    .line 4
    move-result p0

    .line 5
    return p0
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
.end method

.method public static synthetic b(ZLcom/kubi/market/monitor/lib/entity/MarketFloatingWindowConfig;)Lcom/kubi/market/monitor/lib/entity/MarketFloatingWindowConfig;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/market/monitor/lib/ui/floating/FloatingWindowConfigManager;->x(ZLcom/kubi/market/monitor/lib/entity/MarketFloatingWindowConfig;)Lcom/kubi/market/monitor/lib/entity/MarketFloatingWindowConfig;

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
.end method

.method public static final r(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    .line 1
    .line 2
    const-string v0, "it"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 9
    move-result p0

    .line 10
    return p0
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
.end method

.method public static final x(ZLcom/kubi/market/monitor/lib/entity/MarketFloatingWindowConfig;)Lcom/kubi/market/monitor/lib/entity/MarketFloatingWindowConfig;
    .locals 18

    .line 1
    .line 2
    const-string v0, "$this$updateMarketFloatingWindowConfig"

    .line 3
    .line 4
    move-object/from16 v1, p1

    .line 5
    .line 6
    .line 7
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    const/16 v16, 0x3ffe

    .line 10
    .line 11
    const/16 v17, 0x0

    .line 12
    const/4 v3, 0x0

    .line 13
    const/4 v4, 0x0

    .line 14
    const/4 v5, 0x0

    .line 15
    const/4 v6, 0x0

    .line 16
    const/4 v7, 0x0

    .line 17
    const/4 v8, 0x0

    .line 18
    const/4 v9, 0x0

    .line 19
    const/4 v10, 0x0

    .line 20
    const/4 v11, 0x0

    .line 21
    const/4 v12, 0x0

    .line 22
    const/4 v13, 0x0

    .line 23
    const/4 v14, 0x0

    .line 24
    const/4 v15, 0x0

    .line 25
    .line 26
    move/from16 v2, p0

    .line 27
    .line 28
    .line 29
    invoke-static/range {v1 .. v17}, Lcom/kubi/market/monitor/lib/entity/MarketFloatingWindowConfig;->copy$default(Lcom/kubi/market/monitor/lib/entity/MarketFloatingWindowConfig;ZIIIIIIIIZZZZIILjava/lang/Object;)Lcom/kubi/market/monitor/lib/entity/MarketFloatingWindowConfig;

    .line 30
    move-result-object v0

    .line 31
    return-object v0
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


# virtual methods
.method public final c(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "symbol"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/kubi/market/monitor/lib/ui/floating/FloatingWindowConfigManager;->i()Ljava/util/List;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 13
    move-result v0

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, p1}, Lcom/kubi/market/monitor/lib/ui/floating/FloatingWindowConfigManager;->q(Ljava/lang/String;)V

    .line 19
    return-void

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-virtual {p0, p1}, Lcom/kubi/market/monitor/lib/ui/floating/FloatingWindowConfigManager;->d(Ljava/lang/String;)V

    .line 23
    return-void
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

.method public final d(Ljava/lang/String;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/market/monitor/lib/ui/floating/FloatingWindowConfigManager;->i()Ljava/util/List;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v0}, Lcom/kubi/market/monitor/lib/ui/floating/FloatingWindowConfigManager;->v(Ljava/util/List;)V

    .line 15
    .line 16
    sget-object v0, Lcom/kubi/market/monitor/lib/ui/floating/window/w0;->a:Lcom/kubi/market/monitor/lib/ui/floating/window/w0;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p1}, Lcom/kubi/market/monitor/lib/ui/floating/window/w0;->c0(Ljava/lang/String;)V

    .line 20
    .line 21
    sget-object v0, Lfl/d;->a:Lfl/d;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Lfl/d;->i()Ljava/util/ArrayList;

    .line 25
    move-result-object v0

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    sget-object v0, Lcom/kubi/kucoin/feature/widget/appwidget/WidgetRefreshService;->g:Lcom/kubi/kucoin/feature/widget/appwidget/WidgetRefreshService$Companion;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Lcom/kubi/kucoin/feature/widget/appwidget/WidgetRefreshService$Companion;->getTradeLists()Ljava/util/List;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    new-instance v1, Lcom/kubi/data/entity/TradeItemBean;

    .line 37
    .line 38
    .line 39
    invoke-direct {v1, p1}, Lcom/kubi/data/entity/TradeItemBean;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 43
    return-void
    .line 44
    .line 45
.end method

.method public final e(Landroid/graphics/Point;)V
    .locals 2
    .param p1    # Landroid/graphics/Point;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "point"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Lcom/kubi/market/monitor/lib/ui/floating/FloatingWindowConfigManager;->d:Ly70/g;

    .line 8
    .line 9
    .line 10
    invoke-static {p1}, Lcom/blankj/utilcode/util/p;->j(Ljava/lang/Object;)Ljava/lang/String;

    .line 11
    move-result-object p1

    .line 12
    .line 13
    const-string v1, "toJson(...)"

    .line 14
    .line 15
    .line 16
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-static {v0, p1}, Ly70/a;->p(Ly70/g;Ljava/lang/String;)Ly70/a;

    .line 20
    return-void
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

.method public final f()Z
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/market/monitor/lib/ui/floating/FloatingWindowConfigManager;->e:Lcom/kubi/market/monitor/lib/entity/MarketFloatingWindowConfig;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/market/monitor/lib/entity/MarketFloatingWindowConfig;->isShow()Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    sget-object v0, Lfl/d;->a:Lfl/d;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lfl/d;->d()Z

    .line 14
    move-result v0

    .line 15
    .line 16
    if-nez v0, :cond_0

    .line 17
    const/4 v0, 0x1

    .line 18
    return v0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    return v0
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

.method public final g()Lcom/kubi/market/monitor/lib/entity/MarketFloatingWindowConfig;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/market/monitor/lib/ui/floating/FloatingWindowConfigManager;->e:Lcom/kubi/market/monitor/lib/entity/MarketFloatingWindowConfig;

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

.method public final h()Landroid/graphics/Point;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/market/monitor/lib/ui/floating/FloatingWindowConfigManager;->d:Ly70/g;

    .line 3
    .line 4
    const-string v1, ""

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v1}, Ly70/a;->h(Ly70/g;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x0

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    .line 14
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 15
    move-result v2

    .line 16
    .line 17
    if-nez v2, :cond_0

    .line 18
    goto :goto_0

    .line 19
    .line 20
    :cond_0
    :try_start_0
    const-class v2, Landroid/graphics/Point;

    .line 21
    .line 22
    .line 23
    invoke-static {v0, v2}, Lcom/blankj/utilcode/util/p;->d(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    const-string v2, "fromJson(...)"

    .line 27
    .line 28
    .line 29
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    check-cast v0, Landroid/graphics/Point;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 32
    return-object v0

    .line 33
    .line 34
    :catch_0
    new-instance v0, Landroid/graphics/Point;

    .line 35
    .line 36
    .line 37
    invoke-direct {v0, v1, v1}, Landroid/graphics/Point;-><init>(II)V

    .line 38
    return-object v0

    .line 39
    .line 40
    :cond_1
    :goto_0
    new-instance v0, Landroid/graphics/Point;

    .line 41
    .line 42
    .line 43
    invoke-direct {v0, v1, v1}, Landroid/graphics/Point;-><init>(II)V

    .line 44
    return-object v0
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

.method public final i()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/market/monitor/lib/ui/floating/FloatingWindowConfigManager;->m()Ljava/lang/String;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 8
    move-result v1

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 14
    move-result-object v0

    .line 15
    return-object v0

    .line 16
    .line 17
    :cond_0
    :try_start_0
    sget-object v1, Lcom/kubi/utils/x;->a:Lcom/kubi/utils/x;

    .line 18
    .line 19
    new-instance v1, Lcom/kubi/market/monitor/lib/ui/floating/FloatingWindowConfigManager$a;

    .line 20
    .line 21
    .line 22
    invoke-direct {v1}, Lcom/kubi/market/monitor/lib/ui/floating/FloatingWindowConfigManager$a;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    .line 26
    move-result-object v1

    .line 27
    .line 28
    .line 29
    invoke-static {v0, v1}, Lcom/kubi/utils/x;->d(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 30
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    goto :goto_0

    .line 32
    :catchall_0
    move-exception v0

    .line 33
    .line 34
    const-string v1, "GsonUtils"

    .line 35
    const/4 v2, 0x4

    .line 36
    const/4 v3, 0x0

    .line 37
    .line 38
    .line 39
    invoke-static {v0, v1, v3, v2, v3}, Lqq/g;->d(Ljava/lang/Throwable;Ljava/lang/String;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 40
    move-object v0, v3

    .line 41
    .line 42
    :goto_0
    check-cast v0, Ljava/util/List;

    .line 43
    .line 44
    if-nez v0, :cond_1

    .line 45
    .line 46
    .line 47
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 48
    move-result-object v0

    .line 49
    :cond_1
    return-object v0
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

.method public final j()Z
    .locals 4

    .line 1
    .line 2
    sget-object v0, Lfl/d;->a:Lfl/d;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lfl/d;->f()Ly70/g;

    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    .line 9
    .line 10
    invoke-static {v0, v1}, Ly70/a;->d(Ly70/g;Z)Z

    .line 11
    move-result v0

    .line 12
    .line 13
    sget-object v1, Lcom/kubi/market/monitor/lib/ui/floating/FloatingWindowConfigManager;->a:Lcom/kubi/market/monitor/lib/ui/floating/FloatingWindowConfigManager;

    .line 14
    .line 15
    new-instance v2, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    const-string v3, "getOldFloatingWindowSwitch:"

    .line 21
    .line 22
    .line 23
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    move-result-object v2

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, v2}, Lcom/kubi/market/monitor/lib/ui/floating/FloatingWindowConfigManager;->p(Ljava/lang/String;)V

    .line 34
    return v0
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
.end method

.method public final k()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/market/monitor/lib/ui/floating/FloatingWindowConfigManager;->c:Ly70/g;

    .line 3
    .line 4
    const-string v1, ""

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v1}, Ly70/a;->h(Ly70/g;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    move-result-object v0

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

.method public final l(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .param p1    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    instance-of v0, p1, Lcom/kubi/market/monitor/lib/ui/floating/FloatingWindowConfigManager$getSymbolsListData$1;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p1

    .line 6
    .line 7
    check-cast v0, Lcom/kubi/market/monitor/lib/ui/floating/FloatingWindowConfigManager$getSymbolsListData$1;

    .line 8
    .line 9
    iget v1, v0, Lcom/kubi/market/monitor/lib/ui/floating/FloatingWindowConfigManager$getSymbolsListData$1;->label:I

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
    iput v1, v0, Lcom/kubi/market/monitor/lib/ui/floating/FloatingWindowConfigManager$getSymbolsListData$1;->label:I

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lcom/kubi/market/monitor/lib/ui/floating/FloatingWindowConfigManager$getSymbolsListData$1;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p0, p1}, Lcom/kubi/market/monitor/lib/ui/floating/FloatingWindowConfigManager$getSymbolsListData$1;-><init>(Lcom/kubi/market/monitor/lib/ui/floating/FloatingWindowConfigManager;Lkotlin/coroutines/Continuation;)V

    .line 25
    .line 26
    :goto_0
    iget-object p1, v0, Lcom/kubi/market/monitor/lib/ui/floating/FloatingWindowConfigManager$getSymbolsListData$1;->result:Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    iget v2, v0, Lcom/kubi/market/monitor/lib/ui/floating/FloatingWindowConfigManager$getSymbolsListData$1;->label:I

    .line 33
    const/4 v3, 0x1

    .line 34
    const/4 v4, 0x0

    .line 35
    .line 36
    if-eqz v2, :cond_2

    .line 37
    .line 38
    if-ne v2, v3, :cond_1

    .line 39
    .line 40
    iget-object v1, v0, Lcom/kubi/market/monitor/lib/ui/floating/FloatingWindowConfigManager$getSymbolsListData$1;->L$2:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v1, Ljava/lang/String;

    .line 43
    .line 44
    iget-object v1, v0, Lcom/kubi/market/monitor/lib/ui/floating/FloatingWindowConfigManager$getSymbolsListData$1;->L$1:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v1, Lcom/kubi/utils/x;

    .line 47
    .line 48
    iget-object v0, v0, Lcom/kubi/market/monitor/lib/ui/floating/FloatingWindowConfigManager$getSymbolsListData$1;->L$0:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v0, Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 54
    return-object p1

    .line 55
    .line 56
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 57
    .line 58
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 59
    .line 60
    .line 61
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 62
    throw p1

    .line 63
    .line 64
    .line 65
    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    :try_start_1
    invoke-virtual {p0}, Lcom/kubi/market/monitor/lib/ui/floating/FloatingWindowConfigManager;->m()Ljava/lang/String;

    .line 69
    move-result-object p1

    .line 70
    .line 71
    .line 72
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 73
    move-result v2

    .line 74
    .line 75
    if-nez v2, :cond_3

    .line 76
    return-object v4

    .line 77
    .line 78
    :cond_3
    sget-object v2, Lcom/kubi/utils/x;->a:Lcom/kubi/utils/x;

    .line 79
    .line 80
    new-instance v5, Lcom/kubi/market/monitor/lib/ui/floating/FloatingWindowConfigManager$getSymbolsListData$$inlined$fromJsonOrNull$1;

    .line 81
    .line 82
    .line 83
    invoke-direct {v5, p1, v4}, Lcom/kubi/market/monitor/lib/ui/floating/FloatingWindowConfigManager$getSymbolsListData$$inlined$fromJsonOrNull$1;-><init>(Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    .line 84
    .line 85
    .line 86
    invoke-static {v5}, Lkotlinx/coroutines/flow/g;->K(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/e;

    .line 87
    move-result-object v5

    .line 88
    .line 89
    .line 90
    invoke-static {}, Lo00/a;->b()Lkotlinx/coroutines/j0;

    .line 91
    move-result-object v6

    .line 92
    .line 93
    .line 94
    invoke-static {v5, v6}, Lkotlinx/coroutines/flow/g;->N(Lkotlinx/coroutines/flow/e;Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/flow/e;

    .line 95
    move-result-object v5

    .line 96
    .line 97
    .line 98
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    move-result-object v6

    .line 100
    .line 101
    iput-object v6, v0, Lcom/kubi/market/monitor/lib/ui/floating/FloatingWindowConfigManager$getSymbolsListData$1;->L$0:Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    move-result-object v2

    .line 106
    .line 107
    iput-object v2, v0, Lcom/kubi/market/monitor/lib/ui/floating/FloatingWindowConfigManager$getSymbolsListData$1;->L$1:Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    move-result-object p1

    .line 112
    .line 113
    iput-object p1, v0, Lcom/kubi/market/monitor/lib/ui/floating/FloatingWindowConfigManager$getSymbolsListData$1;->L$2:Ljava/lang/Object;

    .line 114
    const/4 p1, 0x0

    .line 115
    .line 116
    iput p1, v0, Lcom/kubi/market/monitor/lib/ui/floating/FloatingWindowConfigManager$getSymbolsListData$1;->I$0:I

    .line 117
    .line 118
    iput v3, v0, Lcom/kubi/market/monitor/lib/ui/floating/FloatingWindowConfigManager$getSymbolsListData$1;->label:I

    .line 119
    .line 120
    .line 121
    invoke-static {v5, v0}, Lkotlinx/coroutines/flow/g;->f0(Lkotlinx/coroutines/flow/e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 122
    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 123
    .line 124
    if-ne p1, v1, :cond_4

    .line 125
    return-object v1

    .line 126
    :cond_4
    return-object p1

    .line 127
    :catch_0
    return-object v4
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

.method public final m()Ljava/lang/String;
    .locals 7
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ly70/g;

    .line 3
    .line 4
    const/16 v5, 0xc

    .line 5
    const/4 v6, 0x0

    .line 6
    .line 7
    const-string v1, "category_market_floating_window"

    .line 8
    .line 9
    const-string v2, "newfloating_tracking_symbols_list_data_key"

    .line 10
    const/4 v3, 0x0

    .line 11
    const/4 v4, 0x0

    .line 12
    .line 13
    .line 14
    invoke-direct/range {v0 .. v6}, Ly70/g;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/kubi/utils/storage/StorageType;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/kubi/market/monitor/lib/ui/floating/FloatingWindowConfigManager;->k()Ljava/lang/String;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    .line 21
    invoke-static {v0, v1}, Ly70/a;->h(Ly70/g;Ljava/lang/String;)Ljava/lang/String;

    .line 22
    move-result-object v0

    .line 23
    return-object v0
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public final n()V
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lfl/d;->a:Lfl/d;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lfl/d;->i()Ljava/util/ArrayList;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Lfl/d;->i()Ljava/util/ArrayList;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/kubi/market/monitor/lib/ui/floating/FloatingWindowConfigManager;->i()Ljava/util/List;

    .line 17
    move-result-object v1

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 21
    return-void
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

.method public final o()Lcom/kubi/market/monitor/lib/entity/MarketFloatingWindowConfig;
    .locals 20

    .line 1
    .line 2
    new-instance v0, Ly70/g;

    .line 3
    .line 4
    const/16 v5, 0xc

    .line 5
    const/4 v6, 0x0

    .line 6
    .line 7
    const-string v1, "category_market_floating_window"

    .line 8
    .line 9
    const-string v2, "market_floating_window_config"

    .line 10
    const/4 v3, 0x0

    .line 11
    const/4 v4, 0x0

    .line 12
    .line 13
    .line 14
    invoke-direct/range {v0 .. v6}, Ly70/g;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/kubi/utils/storage/StorageType;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 15
    .line 16
    const-string v1, ""

    .line 17
    .line 18
    .line 19
    invoke-static {v0, v1}, Ly70/a;->h(Ly70/g;Ljava/lang/String;)Ljava/lang/String;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    :try_start_0
    sget-object v1, Lcom/kubi/utils/x;->a:Lcom/kubi/utils/x;

    .line 23
    .line 24
    new-instance v1, Lcom/kubi/market/monitor/lib/ui/floating/FloatingWindowConfigManager$b;

    .line 25
    .line 26
    .line 27
    invoke-direct {v1}, Lcom/kubi/market/monitor/lib/ui/floating/FloatingWindowConfigManager$b;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    .line 31
    move-result-object v1

    .line 32
    .line 33
    .line 34
    invoke-static {v0, v1}, Lcom/kubi/utils/x;->d(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 35
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    goto :goto_0

    .line 37
    :catchall_0
    move-exception v0

    .line 38
    .line 39
    const-string v1, "GsonUtils"

    .line 40
    const/4 v2, 0x4

    .line 41
    const/4 v3, 0x0

    .line 42
    .line 43
    .line 44
    invoke-static {v0, v1, v3, v2, v3}, Lqq/g;->d(Ljava/lang/Throwable;Ljava/lang/String;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 45
    move-object v0, v3

    .line 46
    .line 47
    :goto_0
    check-cast v0, Lcom/kubi/market/monitor/lib/entity/MarketFloatingWindowConfig;

    .line 48
    .line 49
    if-eqz v0, :cond_0

    .line 50
    .line 51
    sget-object v1, Lcom/kubi/market/monitor/lib/ui/floating/FloatingWindowConfigManager;->a:Lcom/kubi/market/monitor/lib/ui/floating/FloatingWindowConfigManager;

    .line 52
    .line 53
    new-instance v2, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 57
    .line 58
    const-string v3, "initMarketFloatingWindowConfig:"

    .line 59
    .line 60
    .line 61
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    move-result-object v2

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1, v2}, Lcom/kubi/market/monitor/lib/ui/floating/FloatingWindowConfigManager;->p(Ljava/lang/String;)V

    .line 72
    goto :goto_1

    .line 73
    .line 74
    :cond_0
    new-instance v3, Lcom/kubi/market/monitor/lib/entity/MarketFloatingWindowConfig;

    .line 75
    .line 76
    const/16 v18, 0x3fff

    .line 77
    .line 78
    const/16 v19, 0x0

    .line 79
    const/4 v4, 0x0

    .line 80
    const/4 v5, 0x0

    .line 81
    const/4 v6, 0x0

    .line 82
    const/4 v7, 0x0

    .line 83
    const/4 v8, 0x0

    .line 84
    const/4 v9, 0x0

    .line 85
    const/4 v10, 0x0

    .line 86
    const/4 v11, 0x0

    .line 87
    const/4 v12, 0x0

    .line 88
    const/4 v13, 0x0

    .line 89
    const/4 v14, 0x0

    .line 90
    const/4 v15, 0x0

    .line 91
    .line 92
    const/16 v16, 0x0

    .line 93
    .line 94
    const/16 v17, 0x0

    .line 95
    .line 96
    .line 97
    invoke-direct/range {v3 .. v19}, Lcom/kubi/market/monitor/lib/entity/MarketFloatingWindowConfig;-><init>(ZIIIIIIIIZZZZIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 98
    .line 99
    sget-object v0, Lcom/kubi/market/monitor/lib/ui/floating/FloatingWindowConfigManager;->a:Lcom/kubi/market/monitor/lib/ui/floating/FloatingWindowConfigManager;

    .line 100
    .line 101
    new-instance v1, Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 105
    .line 106
    const-string v2, "create default MarketFloatingWindowConfig:"

    .line 107
    .line 108
    .line 109
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 116
    move-result-object v1

    .line 117
    .line 118
    .line 119
    invoke-virtual {v0, v1}, Lcom/kubi/market/monitor/lib/ui/floating/FloatingWindowConfigManager;->p(Ljava/lang/String;)V

    .line 120
    move-object v0, v3

    .line 121
    :goto_1
    return-object v0
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

.method public final p(Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/market/monitor/lib/ui/floating/FloatingWindowConfigManager;->b:Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p1}, Lro/b;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    return-void
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

.method public final q(Ljava/lang/String;)V
    .locals 12
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "symbol"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/kubi/market/monitor/lib/ui/floating/FloatingWindowConfigManager;->i()Ljava/util/List;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    new-instance v1, Lcom/kubi/market/monitor/lib/ui/floating/a;

    .line 16
    .line 17
    .line 18
    invoke-direct {v1, p1}, Lcom/kubi/market/monitor/lib/ui/floating/a;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->removeAll(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Z

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v0}, Lcom/kubi/market/monitor/lib/ui/floating/FloatingWindowConfigManager;->v(Ljava/util/List;)V

    .line 25
    .line 26
    sget-object v0, Lfl/d;->a:Lfl/d;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Lfl/d;->i()Ljava/util/ArrayList;

    .line 30
    move-result-object v0

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 34
    .line 35
    sget-object v0, Lcom/kubi/kucoin/feature/widget/appwidget/WidgetRefreshService;->g:Lcom/kubi/kucoin/feature/widget/appwidget/WidgetRefreshService$Companion;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Lcom/kubi/kucoin/feature/widget/appwidget/WidgetRefreshService$Companion;->getTradeLists()Ljava/util/List;

    .line 39
    move-result-object v1

    .line 40
    .line 41
    .line 42
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 43
    move-result-object v2

    .line 44
    .line 45
    .line 46
    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    move-result v0

    .line 48
    const/4 v3, 0x0

    .line 49
    .line 50
    if-eqz v0, :cond_2

    .line 51
    .line 52
    .line 53
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 54
    move-result-object v4

    .line 55
    move-object v0, v4

    .line 56
    .line 57
    check-cast v0, Lcom/kubi/data/entity/TradeItemBean;

    .line 58
    .line 59
    .line 60
    :try_start_0
    invoke-virtual {v0}, Lcom/kubi/data/entity/TradeItemBean;->getSymbol()Ljava/lang/String;

    .line 61
    move-result-object v0

    .line 62
    .line 63
    .line 64
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 65
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 66
    goto :goto_0

    .line 67
    :catchall_0
    move-exception v0

    .line 68
    move-object v6, v0

    .line 69
    .line 70
    .line 71
    invoke-static {v6}, Lny/b;->e(Ljava/lang/Throwable;)Z

    .line 72
    move-result v0

    .line 73
    .line 74
    if-nez v0, :cond_1

    .line 75
    .line 76
    new-instance v5, Lcom/kubi/market/monitor/lib/exeption/MarketMonitorException;

    .line 77
    .line 78
    const/16 v10, 0x8

    .line 79
    const/4 v11, 0x0

    .line 80
    .line 81
    const-string v7, "FloatingWindowConfigManager"

    .line 82
    const/4 v8, 0x0

    .line 83
    const/4 v9, 0x0

    .line 84
    .line 85
    .line 86
    invoke-direct/range {v5 .. v11}, Lcom/kubi/market/monitor/lib/exeption/MarketMonitorException;-><init>(Ljava/lang/Throwable;Ljava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 87
    const/4 v0, 0x2

    .line 88
    .line 89
    .line 90
    invoke-static {v5, v3, v0, v3}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 91
    :cond_1
    const/4 v0, 0x0

    .line 92
    .line 93
    :goto_0
    if-eqz v0, :cond_0

    .line 94
    move-object v3, v4

    .line 95
    .line 96
    :cond_2
    check-cast v3, Lcom/kubi/data/entity/TradeItemBean;

    .line 97
    .line 98
    if-eqz v3, :cond_3

    .line 99
    .line 100
    .line 101
    invoke-interface {v1, v3}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 102
    .line 103
    :cond_3
    sget-object v0, Lcom/kubi/market/monitor/lib/ui/floating/window/w0;->a:Lcom/kubi/market/monitor/lib/ui/floating/window/w0;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0, p1}, Lcom/kubi/market/monitor/lib/ui/floating/window/w0;->X0(Ljava/lang/String;)V

    .line 107
    return-void
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

.method public final s(Lcom/kubi/market/monitor/lib/entity/MarketFloatingWindowConfig;)V
    .locals 7

    .line 1
    .line 2
    new-instance v0, Ly70/g;

    .line 3
    .line 4
    const/16 v5, 0xc

    .line 5
    const/4 v6, 0x0

    .line 6
    .line 7
    const-string v1, "category_market_floating_window"

    .line 8
    .line 9
    const-string v2, "market_floating_window_config"

    .line 10
    const/4 v3, 0x0

    .line 11
    const/4 v4, 0x0

    .line 12
    .line 13
    .line 14
    invoke-direct/range {v0 .. v6}, Ly70/g;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/kubi/utils/storage/StorageType;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 15
    .line 16
    if-eqz p1, :cond_0

    .line 17
    const/4 v1, 0x2

    .line 18
    const/4 v2, 0x0

    .line 19
    const/4 v3, 0x0

    .line 20
    .line 21
    .line 22
    invoke-static {p1, v3, v1, v2}, Lcom/kubi/utils/x;->i(Ljava/lang/Object;ZILjava/lang/Object;)Ljava/lang/String;

    .line 23
    move-result-object p1

    .line 24
    .line 25
    if-nez p1, :cond_1

    .line 26
    .line 27
    :cond_0
    const-string p1, ""

    .line 28
    .line 29
    .line 30
    :cond_1
    invoke-static {v0, p1}, Ly70/a;->p(Ly70/g;Ljava/lang/String;)Ly70/a;

    .line 31
    return-void
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

.method public final t(Z)V
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lfl/d;->a:Lfl/d;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lfl/d;->f()Ly70/g;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-static {v0, p1}, Ly70/a;->k(Ly70/g;Z)Ly70/a;

    .line 10
    return-void
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

.method public final u(Ljava/util/List;)V
    .locals 4
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "list"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Lcom/kubi/market/monitor/lib/ui/floating/FloatingWindowConfigManager;->c:Ly70/g;

    .line 8
    const/4 v1, 0x2

    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v3, 0x0

    .line 11
    .line 12
    .line 13
    invoke-static {p1, v3, v1, v2}, Lcom/kubi/utils/x;->i(Ljava/lang/Object;ZILjava/lang/Object;)Ljava/lang/String;

    .line 14
    move-result-object p1

    .line 15
    .line 16
    if-nez p1, :cond_0

    .line 17
    .line 18
    const-string p1, ""

    .line 19
    .line 20
    .line 21
    :cond_0
    invoke-static {v0, p1}, Ly70/a;->p(Ly70/g;Ljava/lang/String;)Ly70/a;

    .line 22
    return-void
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

.method public final v(Ljava/util/List;)V
    .locals 11
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "newListData"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Laq/b;->b()Z

    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x2

    .line 11
    const/4 v3, 0x0

    .line 12
    .line 13
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 14
    .line 15
    new-instance v4, Ly70/g;

    .line 16
    .line 17
    const-string v5, "category_market_floating_window"

    .line 18
    .line 19
    const-string v6, "newfloating_tracking_symbols_list_data_key"

    .line 20
    .line 21
    const/16 v9, 0xc

    .line 22
    const/4 v10, 0x0

    .line 23
    const/4 v7, 0x0

    .line 24
    const/4 v8, 0x0

    .line 25
    .line 26
    .line 27
    invoke-direct/range {v4 .. v10}, Ly70/g;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/kubi/utils/storage/StorageType;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 28
    const/4 v0, 0x0

    .line 29
    .line 30
    .line 31
    invoke-static {p1, v0, v2, v3}, Lcom/kubi/utils/x;->i(Ljava/lang/Object;ZILjava/lang/Object;)Ljava/lang/String;

    .line 32
    move-result-object p1

    .line 33
    .line 34
    .line 35
    invoke-static {v4, p1}, Ly70/a;->p(Ly70/g;Ljava/lang/String;)Ly70/a;

    .line 36
    move-result-object p1

    .line 37
    .line 38
    .line 39
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    goto :goto_0

    .line 42
    :catchall_0
    move-exception v0

    .line 43
    move-object p1, v0

    .line 44
    .line 45
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 46
    .line 47
    .line 48
    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 49
    move-result-object p1

    .line 50
    .line 51
    .line 52
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    move-result-object p1

    .line 54
    .line 55
    .line 56
    :goto_0
    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 57
    move-result-object v5

    .line 58
    .line 59
    if-eqz v5, :cond_2

    .line 60
    .line 61
    if-eqz v1, :cond_1

    .line 62
    .line 63
    instance-of p1, v5, Ljava/util/concurrent/CancellationException;

    .line 64
    .line 65
    if-nez p1, :cond_0

    .line 66
    .line 67
    .line 68
    invoke-static {v5}, Lny/b;->e(Ljava/lang/Throwable;)Z

    .line 69
    move-result p1

    .line 70
    .line 71
    if-nez p1, :cond_2

    .line 72
    .line 73
    new-instance v4, Lcom/kubi/market/monitor/lib/exeption/MarketMonitorException;

    .line 74
    .line 75
    const/16 v9, 0x8

    .line 76
    const/4 v10, 0x0

    .line 77
    .line 78
    const-string v6, "market_monitor_issue"

    .line 79
    const/4 v7, 0x0

    .line 80
    const/4 v8, 0x0

    .line 81
    .line 82
    .line 83
    invoke-direct/range {v4 .. v10}, Lcom/kubi/market/monitor/lib/exeption/MarketMonitorException;-><init>(Ljava/lang/Throwable;Ljava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 84
    .line 85
    .line 86
    invoke-static {v4, v3, v2, v3}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 87
    goto :goto_1

    .line 88
    :cond_0
    throw v5

    .line 89
    :cond_1
    throw v5

    .line 90
    :cond_2
    :goto_1
    return-void
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

.method public final w(Z)V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/market/monitor/lib/ui/floating/b;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p1}, Lcom/kubi/market/monitor/lib/ui/floating/b;-><init>(Z)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lcom/kubi/market/monitor/lib/ui/floating/FloatingWindowConfigManager;->y(Lkotlin/jvm/functions/Function1;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1}, Lcom/kubi/market/monitor/lib/ui/floating/FloatingWindowConfigManager;->t(Z)V

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
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method

.method public final y(Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .param p1    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/kubi/market/monitor/lib/entity/MarketFloatingWindowConfig;",
            "Lcom/kubi/market/monitor/lib/entity/MarketFloatingWindowConfig;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "block"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Lcom/kubi/market/monitor/lib/ui/floating/FloatingWindowConfigManager;->e:Lcom/kubi/market/monitor/lib/entity/MarketFloatingWindowConfig;

    .line 8
    .line 9
    .line 10
    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    move-result-object p1

    .line 12
    .line 13
    check-cast p1, Lcom/kubi/market/monitor/lib/entity/MarketFloatingWindowConfig;

    .line 14
    .line 15
    sput-object p1, Lcom/kubi/market/monitor/lib/ui/floating/FloatingWindowConfigManager;->e:Lcom/kubi/market/monitor/lib/entity/MarketFloatingWindowConfig;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, p1}, Lcom/kubi/market/monitor/lib/ui/floating/FloatingWindowConfigManager;->s(Lcom/kubi/market/monitor/lib/entity/MarketFloatingWindowConfig;)V

    .line 19
    return-void
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
