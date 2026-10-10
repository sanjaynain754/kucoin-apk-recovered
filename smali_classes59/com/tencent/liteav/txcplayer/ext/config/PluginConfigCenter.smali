.class public Lcom/tencent/liteav/txcplayer/ext/config/PluginConfigCenter;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final sIsCorePlugin:[Z

.field private static final sPluginClazzName:[Ljava/lang/String;

.field private static final sPluginIds:[I

.field private static final sPluginName:[Ljava/lang/String;

.field private static final sPluginVersion:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const/4 v0, 0x2

    .line 2
    .line 3
    .line 4
    filled-new-array {v0}, [I

    .line 5
    move-result-object v0

    .line 6
    .line 7
    sput-object v0, Lcom/tencent/liteav/txcplayer/ext/config/PluginConfigCenter;->sPluginIds:[I

    .line 8
    .line 9
    .line 10
    const-string/jumbo v0, "monet"

    .line 11
    .line 12
    .line 13
    filled-new-array {v0}, [Ljava/lang/String;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    sput-object v0, Lcom/tencent/liteav/txcplayer/ext/config/PluginConfigCenter;->sPluginName:[Ljava/lang/String;

    .line 17
    const/4 v0, 0x1

    .line 18
    .line 19
    .line 20
    filled-new-array {v0}, [I

    .line 21
    move-result-object v1

    .line 22
    .line 23
    sput-object v1, Lcom/tencent/liteav/txcplayer/ext/config/PluginConfigCenter;->sPluginVersion:[I

    .line 24
    .line 25
    const-string v1, "com.tencent.liteav.monet.MonetPlugin"

    .line 26
    .line 27
    .line 28
    filled-new-array {v1}, [Ljava/lang/String;

    .line 29
    move-result-object v1

    .line 30
    .line 31
    sput-object v1, Lcom/tencent/liteav/txcplayer/ext/config/PluginConfigCenter;->sPluginClazzName:[Ljava/lang/String;

    .line 32
    .line 33
    new-array v1, v0, [Z

    .line 34
    const/4 v2, 0x0

    .line 35
    .line 36
    aput-boolean v0, v1, v2

    .line 37
    .line 38
    sput-object v1, Lcom/tencent/liteav/txcplayer/ext/config/PluginConfigCenter;->sIsCorePlugin:[Z

    .line 39
    return-void
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
.end method

.method public static loadPluginConfig(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/tencent/liteav/txcplayer/ext/host/PluginInfo;",
            ">;)V"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    :goto_0
    sget-object v1, Lcom/tencent/liteav/txcplayer/ext/config/PluginConfigCenter;->sPluginIds:[I

    .line 4
    array-length v2, v1

    .line 5
    .line 6
    if-ge v0, v2, :cond_0

    .line 7
    .line 8
    new-instance v2, Lcom/tencent/liteav/txcplayer/ext/host/PluginInfo;

    .line 9
    .line 10
    .line 11
    invoke-direct {v2}, Lcom/tencent/liteav/txcplayer/ext/host/PluginInfo;-><init>()V

    .line 12
    .line 13
    aget v1, v1, v0

    .line 14
    .line 15
    iput v1, v2, Lcom/tencent/liteav/txcplayer/ext/host/PluginInfo;->mPluginId:I

    .line 16
    .line 17
    sget-object v1, Lcom/tencent/liteav/txcplayer/ext/config/PluginConfigCenter;->sPluginName:[Ljava/lang/String;

    .line 18
    .line 19
    aget-object v1, v1, v0

    .line 20
    .line 21
    iput-object v1, v2, Lcom/tencent/liteav/txcplayer/ext/host/PluginInfo;->mPluginName:Ljava/lang/String;

    .line 22
    .line 23
    sget-object v1, Lcom/tencent/liteav/txcplayer/ext/config/PluginConfigCenter;->sPluginVersion:[I

    .line 24
    .line 25
    aget v1, v1, v0

    .line 26
    .line 27
    iput v1, v2, Lcom/tencent/liteav/txcplayer/ext/host/PluginInfo;->mPluginVersion:I

    .line 28
    .line 29
    sget-object v1, Lcom/tencent/liteav/txcplayer/ext/config/PluginConfigCenter;->sPluginClazzName:[Ljava/lang/String;

    .line 30
    .line 31
    aget-object v1, v1, v0

    .line 32
    .line 33
    iput-object v1, v2, Lcom/tencent/liteav/txcplayer/ext/host/PluginInfo;->mPluginClazzName:Ljava/lang/String;

    .line 34
    .line 35
    sget-object v1, Lcom/tencent/liteav/txcplayer/ext/config/PluginConfigCenter;->sIsCorePlugin:[Z

    .line 36
    .line 37
    aget-boolean v1, v1, v0

    .line 38
    .line 39
    iput-boolean v1, v2, Lcom/tencent/liteav/txcplayer/ext/host/PluginInfo;->mIsCorePlugin:Z

    .line 40
    .line 41
    .line 42
    invoke-interface {p0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    add-int/lit8 v0, v0, 0x1

    .line 45
    goto :goto_0

    .line 46
    :cond_0
    return-void
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
.end method
