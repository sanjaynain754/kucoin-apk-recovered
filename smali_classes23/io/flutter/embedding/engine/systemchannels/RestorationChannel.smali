.class public Lio/flutter/embedding/engine/systemchannels/RestorationChannel;
.super Ljava/lang/Object;
.source "RestorationChannel.java"


# static fields
.field private static final TAG:Ljava/lang/String; = "RestorationChannel"


# instance fields
.field private channel:Lio/flutter/plugin/common/MethodChannel;

.field private engineHasProvidedData:Z

.field private frameworkHasRequestedData:Z

.field private final handler:Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;

.field private pendingFrameworkRestorationChannelRequest:Lio/flutter/plugin/common/MethodChannel$Result;

.field private restorationData:[B

.field public final waitForRestorationData:Z


# direct methods
.method public constructor <init>(Lio/flutter/embedding/engine/dart/DartExecutor;Z)V
    .locals 3
    .param p1    # Lio/flutter/embedding/engine/dart/DartExecutor;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Z
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    new-instance v0, Lio/flutter/plugin/common/MethodChannel;

    const-string v1, "flutter/restoration"

    sget-object v2, Lio/flutter/plugin/common/StandardMethodCodec;->INSTANCE:Lio/flutter/plugin/common/StandardMethodCodec;

    invoke-direct {v0, p1, v1, v2}, Lio/flutter/plugin/common/MethodChannel;-><init>(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;Lio/flutter/plugin/common/MethodCodec;)V

    invoke-direct {p0, v0, p2}, Lio/flutter/embedding/engine/systemchannels/RestorationChannel;-><init>(Lio/flutter/plugin/common/MethodChannel;Z)V

    return-void
.end method

.method public constructor <init>(Lio/flutter/plugin/common/MethodChannel;Z)V
    .locals 1
    .param p2    # Z
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lio/flutter/embedding/engine/systemchannels/RestorationChannel;->engineHasProvidedData:Z

    .line 4
    iput-boolean v0, p0, Lio/flutter/embedding/engine/systemchannels/RestorationChannel;->frameworkHasRequestedData:Z

    .line 5
    new-instance v0, Lio/flutter/embedding/engine/systemchannels/RestorationChannel$2;

    invoke-direct {v0, p0}, Lio/flutter/embedding/engine/systemchannels/RestorationChannel$2;-><init>(Lio/flutter/embedding/engine/systemchannels/RestorationChannel;)V

    iput-object v0, p0, Lio/flutter/embedding/engine/systemchannels/RestorationChannel;->handler:Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;

    .line 6
    iput-object p1, p0, Lio/flutter/embedding/engine/systemchannels/RestorationChannel;->channel:Lio/flutter/plugin/common/MethodChannel;

    .line 7
    iput-boolean p2, p0, Lio/flutter/embedding/engine/systemchannels/RestorationChannel;->waitForRestorationData:Z

    .line 8
    invoke-virtual {p1, v0}, Lio/flutter/plugin/common/MethodChannel;->setMethodCallHandler(Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;)V

    return-void
.end method

.method public static synthetic access$000(Lio/flutter/embedding/engine/systemchannels/RestorationChannel;)[B
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lio/flutter/embedding/engine/systemchannels/RestorationChannel;->restorationData:[B

    .line 3
    return-object p0
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
.end method

.method public static synthetic access$002(Lio/flutter/embedding/engine/systemchannels/RestorationChannel;[B)[B
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lio/flutter/embedding/engine/systemchannels/RestorationChannel;->restorationData:[B

    .line 3
    return-object p1
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

.method public static synthetic access$102(Lio/flutter/embedding/engine/systemchannels/RestorationChannel;Z)Z
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lio/flutter/embedding/engine/systemchannels/RestorationChannel;->frameworkHasRequestedData:Z

    .line 3
    return p1
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

.method public static synthetic access$200(Lio/flutter/embedding/engine/systemchannels/RestorationChannel;)Z
    .locals 0

    .line 1
    .line 2
    iget-boolean p0, p0, Lio/flutter/embedding/engine/systemchannels/RestorationChannel;->engineHasProvidedData:Z

    .line 3
    return p0
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
.end method

.method public static synthetic access$300(Lio/flutter/embedding/engine/systemchannels/RestorationChannel;[B)Ljava/util/Map;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lio/flutter/embedding/engine/systemchannels/RestorationChannel;->packageData([B)Ljava/util/Map;

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
.end method

.method public static synthetic access$402(Lio/flutter/embedding/engine/systemchannels/RestorationChannel;Lio/flutter/plugin/common/MethodChannel$Result;)Lio/flutter/plugin/common/MethodChannel$Result;
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lio/flutter/embedding/engine/systemchannels/RestorationChannel;->pendingFrameworkRestorationChannelRequest:Lio/flutter/plugin/common/MethodChannel$Result;

    .line 3
    return-object p1
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

.method private packageData([B)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/util/HashMap;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 6
    .line 7
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 8
    .line 9
    const-string v2, "enabled"

    .line 10
    .line 11
    .line 12
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    const-string v1, "data"

    .line 15
    .line 16
    .line 17
    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    return-object v0
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method


# virtual methods
.method public clearData()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    iput-object v0, p0, Lio/flutter/embedding/engine/systemchannels/RestorationChannel;->restorationData:[B

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
.end method

.method public getRestorationData()[B
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lio/flutter/embedding/engine/systemchannels/RestorationChannel;->restorationData:[B

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
.end method

.method public setRestorationData([B)V
    .locals 3
    .param p1    # [B
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    iput-boolean v0, p0, Lio/flutter/embedding/engine/systemchannels/RestorationChannel;->engineHasProvidedData:Z

    .line 4
    .line 5
    iget-object v0, p0, Lio/flutter/embedding/engine/systemchannels/RestorationChannel;->pendingFrameworkRestorationChannelRequest:Lio/flutter/plugin/common/MethodChannel$Result;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    .line 10
    invoke-direct {p0, p1}, Lio/flutter/embedding/engine/systemchannels/RestorationChannel;->packageData([B)Ljava/util/Map;

    .line 11
    move-result-object v1

    .line 12
    .line 13
    .line 14
    invoke-interface {v0, v1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 15
    const/4 v0, 0x0

    .line 16
    .line 17
    iput-object v0, p0, Lio/flutter/embedding/engine/systemchannels/RestorationChannel;->pendingFrameworkRestorationChannelRequest:Lio/flutter/plugin/common/MethodChannel$Result;

    .line 18
    .line 19
    iput-object p1, p0, Lio/flutter/embedding/engine/systemchannels/RestorationChannel;->restorationData:[B

    .line 20
    return-void

    .line 21
    .line 22
    :cond_0
    iget-boolean v0, p0, Lio/flutter/embedding/engine/systemchannels/RestorationChannel;->frameworkHasRequestedData:Z

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    iget-object v0, p0, Lio/flutter/embedding/engine/systemchannels/RestorationChannel;->channel:Lio/flutter/plugin/common/MethodChannel;

    .line 27
    .line 28
    .line 29
    invoke-direct {p0, p1}, Lio/flutter/embedding/engine/systemchannels/RestorationChannel;->packageData([B)Ljava/util/Map;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    new-instance v2, Lio/flutter/embedding/engine/systemchannels/RestorationChannel$1;

    .line 33
    .line 34
    .line 35
    invoke-direct {v2, p0, p1}, Lio/flutter/embedding/engine/systemchannels/RestorationChannel$1;-><init>(Lio/flutter/embedding/engine/systemchannels/RestorationChannel;[B)V

    .line 36
    .line 37
    .line 38
    const-string/jumbo p1, "push"

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, p1, v1, v2}, Lio/flutter/plugin/common/MethodChannel;->invokeMethod(Ljava/lang/String;Ljava/lang/Object;Lio/flutter/plugin/common/MethodChannel$Result;)V

    .line 42
    return-void

    .line 43
    .line 44
    :cond_1
    iput-object p1, p0, Lio/flutter/embedding/engine/systemchannels/RestorationChannel;->restorationData:[B

    .line 45
    return-void
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
.end method
