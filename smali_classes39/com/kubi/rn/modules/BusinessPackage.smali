.class public final Lcom/kubi/rn/modules/BusinessPackage;
.super Ljava/lang/Object;
.source "BusinessPackage.kt"

# interfaces
.implements Lcom/facebook/react/ReactPackage;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\u0008H\u0016J\u0008\u0010\t\u001a\u00020\nH\u0002J&\u0010\u000b\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\r\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u000e0\u000c0\u00052\u0006\u0010\u0007\u001a\u00020\u0008H\u0016\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/kubi/rn/modules/BusinessPackage;",
        "Lcom/facebook/react/ReactPackage;",
        "<init>",
        "()V",
        "createNativeModules",
        "",
        "Lcom/facebook/react/bridge/NativeModule;",
        "reactContext",
        "Lcom/facebook/react/bridge/ReactApplicationContext;",
        "registerKrnSocketBinaryHandler",
        "",
        "createViewManagers",
        "Lcom/facebook/react/uimanager/ViewManager;",
        "Landroid/view/View;",
        "Lcom/facebook/react/uimanager/ReactShadowNode;",
        "BReactNativeLib_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
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
.end method

.method private final registerKrnSocketBinaryHandler()V
    .locals 3

    .line 1
    .line 2
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 3
    .line 4
    sget-object v0, Lcom/kubi/router/core/Router;->a:Lcom/kubi/router/core/Router;

    .line 5
    .line 6
    const-class v1, Ld00/j;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lcom/kubi/router/core/Router;->n(Ljava/lang/Class;)Ljava/lang/Object;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    check-cast v0, Ld00/j;

    .line 13
    .line 14
    instance-of v1, v0, Lcom/kubi/rn/core/socket/KRNSocketNativeBridge$KRNSocketHandler;

    .line 15
    const/4 v2, 0x0

    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    check-cast v0, Lcom/kubi/rn/core/socket/KRNSocketNativeBridge$KRNSocketHandler;

    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception v0

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    move-object v0, v2

    .line 24
    .line 25
    :goto_0
    if-eqz v0, :cond_1

    .line 26
    .line 27
    .line 28
    invoke-static {v0}, Lcom/kubi/rn/core/socket/KRNSocketNativeBridge;->setHandler(Lcom/kubi/rn/core/socket/KRNSocketNativeBridge$KRNSocketHandler;)V

    .line 29
    .line 30
    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 31
    .line 32
    .line 33
    :cond_1
    invoke-static {v2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    return-void

    .line 35
    .line 36
    :goto_1
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 37
    .line 38
    .line 39
    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 40
    move-result-object v0

    .line 41
    .line 42
    .line 43
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    return-void
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
.end method


# virtual methods
.method public createNativeModules(Lcom/facebook/react/bridge/ReactApplicationContext;)Ljava/util/List;
    .locals 10
    .param p1    # Lcom/facebook/react/bridge/ReactApplicationContext;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/react/bridge/ReactApplicationContext;",
            ")",
            "Ljava/util/List<",
            "Lcom/facebook/react/bridge/NativeModule;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "reactContext"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Lcom/kubi/rn/modules/BusinessPackage;->registerKrnSocketBinaryHandler()V

    .line 9
    .line 10
    new-instance v0, Lcom/kubi/rn/protocol/KRNProtocolBridge;

    .line 11
    .line 12
    .line 13
    invoke-direct {v0, p1}, Lcom/kubi/rn/protocol/KRNProtocolBridge;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 14
    .line 15
    new-instance v1, Lcom/kubi/rn/modules/bridge/KRNPublicBridge;

    .line 16
    .line 17
    .line 18
    invoke-direct {v1, p1}, Lcom/kubi/rn/modules/bridge/KRNPublicBridge;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 19
    .line 20
    new-instance v2, Lcom/kubi/rn/modules/bridge/KRNPhotoBridge;

    .line 21
    .line 22
    .line 23
    invoke-direct {v2, p1}, Lcom/kubi/rn/modules/bridge/KRNPhotoBridge;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 24
    .line 25
    new-instance v3, Lcom/kubi/rn/modules/bridge/KRNEventEmitter;

    .line 26
    .line 27
    .line 28
    invoke-direct {v3, p1}, Lcom/kubi/rn/modules/bridge/KRNEventEmitter;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 29
    .line 30
    new-instance v4, Lcom/kubi/rn/modules/bridge/KRNSocketEventEmitter;

    .line 31
    .line 32
    .line 33
    invoke-direct {v4, p1}, Lcom/kubi/rn/modules/bridge/KRNSocketEventEmitter;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 34
    .line 35
    new-instance v5, Lcom/kubi/rn/core/RNRouteEmitterModule;

    .line 36
    .line 37
    .line 38
    invoke-direct {v5, p1}, Lcom/kubi/rn/core/RNRouteEmitterModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 39
    .line 40
    new-instance v6, Lcom/kubi/rn/core/biz/FuturesNavigationModule;

    .line 41
    .line 42
    .line 43
    invoke-direct {v6, p1}, Lcom/kubi/rn/core/biz/FuturesNavigationModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 44
    .line 45
    new-instance v7, Lcom/kubi/rn/kline/TradingViewLegacyStorageModule;

    .line 46
    .line 47
    .line 48
    invoke-direct {v7, p1}, Lcom/kubi/rn/kline/TradingViewLegacyStorageModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 49
    .line 50
    new-instance v8, Lcom/kubi/rn/core/turbo/NativeKRNEngineBridgeTurboModule;

    .line 51
    .line 52
    .line 53
    invoke-direct {v8, p1}, Lcom/kubi/rn/core/turbo/NativeKRNEngineBridgeTurboModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 54
    .line 55
    const/16 p1, 0x9

    .line 56
    .line 57
    new-array p1, p1, [Lcom/facebook/react/bridge/NativeModule;

    .line 58
    const/4 v9, 0x0

    .line 59
    .line 60
    aput-object v0, p1, v9

    .line 61
    const/4 v0, 0x1

    .line 62
    .line 63
    aput-object v1, p1, v0

    .line 64
    const/4 v0, 0x2

    .line 65
    .line 66
    aput-object v2, p1, v0

    .line 67
    const/4 v0, 0x3

    .line 68
    .line 69
    aput-object v3, p1, v0

    .line 70
    const/4 v0, 0x4

    .line 71
    .line 72
    aput-object v4, p1, v0

    .line 73
    const/4 v0, 0x5

    .line 74
    .line 75
    aput-object v5, p1, v0

    .line 76
    const/4 v0, 0x6

    .line 77
    .line 78
    aput-object v6, p1, v0

    .line 79
    const/4 v0, 0x7

    .line 80
    .line 81
    aput-object v7, p1, v0

    .line 82
    .line 83
    const/16 v0, 0x8

    .line 84
    .line 85
    aput-object v8, p1, v0

    .line 86
    .line 87
    .line 88
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->mutableListOf([Ljava/lang/Object;)Ljava/util/List;

    .line 89
    move-result-object p1

    .line 90
    return-object p1
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
.end method

.method public createViewManagers(Lcom/facebook/react/bridge/ReactApplicationContext;)Ljava/util/List;
    .locals 3
    .param p1    # Lcom/facebook/react/bridge/ReactApplicationContext;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/react/bridge/ReactApplicationContext;",
            ")",
            "Ljava/util/List<",
            "Lcom/facebook/react/uimanager/ViewManager<",
            "Landroid/view/View;",
            "Lcom/facebook/react/uimanager/ReactShadowNode<",
            "*>;>;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "reactContext"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    new-instance p1, Lcom/kubi/rn/brandindicator/KCBrandRefreshIndicatorViewManager;

    .line 8
    .line 9
    .line 10
    invoke-direct {p1}, Lcom/kubi/rn/brandindicator/KCBrandRefreshIndicatorViewManager;-><init>()V

    .line 11
    .line 12
    new-instance v0, Lcom/kubi/rn/brandrefresh/KCBrandRefreshLayoutManager;

    .line 13
    .line 14
    .line 15
    invoke-direct {v0}, Lcom/kubi/rn/brandrefresh/KCBrandRefreshLayoutManager;-><init>()V

    .line 16
    const/4 v1, 0x2

    .line 17
    .line 18
    new-array v1, v1, [Lcom/facebook/react/uimanager/ViewManager;

    .line 19
    const/4 v2, 0x0

    .line 20
    .line 21
    aput-object p1, v1, v2

    .line 22
    const/4 p1, 0x1

    .line 23
    .line 24
    aput-object v0, v1, p1

    .line 25
    .line 26
    .line 27
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->mutableListOf([Ljava/lang/Object;)Ljava/util/List;

    .line 28
    move-result-object p1

    .line 29
    .line 30
    sget-object v0, Lcom/kubi/homern/api/IHomeRNService;->a:Lcom/kubi/homern/api/IHomeRNService$Companion;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Lcom/kubi/homern/api/IHomeRNService$Companion;->get()Lcom/kubi/homern/api/IHomeRNService;

    .line 34
    move-result-object v1

    .line 35
    .line 36
    .line 37
    invoke-interface {v1}, Lcom/kubi/homern/api/IHomeRNService;->d()Lcom/facebook/react/uimanager/ViewManager;

    .line 38
    move-result-object v1

    .line 39
    .line 40
    .line 41
    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Lcom/kubi/homern/api/IHomeRNService$Companion;->get()Lcom/kubi/homern/api/IHomeRNService;

    .line 45
    move-result-object v1

    .line 46
    .line 47
    .line 48
    invoke-interface {v1}, Lcom/kubi/homern/api/IHomeRNService;->a()Lcom/facebook/react/uimanager/ViewManager;

    .line 49
    move-result-object v1

    .line 50
    .line 51
    .line 52
    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0}, Lcom/kubi/homern/api/IHomeRNService$Companion;->get()Lcom/kubi/homern/api/IHomeRNService;

    .line 56
    move-result-object v0

    .line 57
    .line 58
    .line 59
    invoke-interface {v0}, Lcom/kubi/homern/api/IHomeRNService;->c()Lcom/facebook/react/uimanager/ViewManager;

    .line 60
    move-result-object v0

    .line 61
    .line 62
    .line 63
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 64
    return-object p1
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
.end method
