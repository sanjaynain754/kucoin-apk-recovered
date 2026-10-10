.class public final Lio/trtc/tuikit/atomicxcore/impl/live/q;
.super Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;
.source "SourceFile"

# interfaces
.implements Lio/trtc/tuikit/atomicxcore/impl/live/d0;


# instance fields
.field public final a:Lkotlinx/coroutines/flow/n;

.field public final b:Lkotlinx/coroutines/flow/n;

.field public final c:Lkotlinx/coroutines/flow/n;

.field public final d:Lio/trtc/tuikit/atomicxcore/impl/common/r;

.field public final e:Lio/trtc/tuikit/atomicxcore/impl/common/q;

.field public final f:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager;

.field public final g:Lio/trtc/tuikit/atomicxcore/impl/live/l;

.field public final h:Lio/trtc/tuikit/atomicxcore/api/live/BattleState;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 10

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->sharedInstance()Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    const-string/jumbo v1, "sharedInstance(...)"

    .line 8
    .line 9
    .line 10
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    const-string v1, "liveID"

    .line 13
    .line 14
    .line 15
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    const-string p1, "roomEngine"

    .line 18
    .line 19
    .line 20
    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-direct {p0}, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;-><init>()V

    .line 24
    .line 25
    new-instance v1, Lio/trtc/tuikit/atomicxcore/api/live/BattleInfo;

    .line 26
    .line 27
    const/16 v8, 0xf

    .line 28
    const/4 v9, 0x0

    .line 29
    const/4 v2, 0x0

    .line 30
    const/4 v3, 0x0

    .line 31
    .line 32
    const-wide/16 v4, 0x0

    .line 33
    .line 34
    const-wide/16 v6, 0x0

    .line 35
    .line 36
    .line 37
    invoke-direct/range {v1 .. v9}, Lio/trtc/tuikit/atomicxcore/api/live/BattleInfo;-><init>(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/live/BattleConfig;JJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 38
    .line 39
    .line 40
    invoke-static {v1}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 41
    move-result-object p1

    .line 42
    .line 43
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/live/q;->a:Lkotlinx/coroutines/flow/n;

    .line 44
    .line 45
    .line 46
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 47
    move-result-object v1

    .line 48
    .line 49
    .line 50
    invoke-static {v1}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 51
    move-result-object v1

    .line 52
    .line 53
    iput-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/live/q;->b:Lkotlinx/coroutines/flow/n;

    .line 54
    .line 55
    .line 56
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    .line 57
    move-result-object v2

    .line 58
    .line 59
    .line 60
    invoke-static {v2}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 61
    move-result-object v2

    .line 62
    .line 63
    iput-object v2, p0, Lio/trtc/tuikit/atomicxcore/impl/live/q;->c:Lkotlinx/coroutines/flow/n;

    .line 64
    .line 65
    const-string v3, "file"

    .line 66
    .line 67
    const-string v4, "AtomicXCore-Live"

    .line 68
    .line 69
    const-string v5, "BattleStoreImpl"

    .line 70
    .line 71
    .line 72
    invoke-static {v5, v3, v4, v5}, Lio/trtc/tuikit/atomicxcore/api/view/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 73
    move-result-object v3

    .line 74
    .line 75
    iput-object v3, p0, Lio/trtc/tuikit/atomicxcore/impl/live/q;->d:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 76
    .line 77
    new-instance v3, Lio/trtc/tuikit/atomicxcore/impl/common/q;

    .line 78
    .line 79
    .line 80
    invoke-direct {v3}, Lio/trtc/tuikit/atomicxcore/impl/common/q;-><init>()V

    .line 81
    .line 82
    iput-object v3, p0, Lio/trtc/tuikit/atomicxcore/impl/live/q;->e:Lio/trtc/tuikit/atomicxcore/impl/common/q;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->getLiveBattleManager()Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager;

    .line 86
    move-result-object v0

    .line 87
    .line 88
    iput-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/q;->f:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager;

    .line 89
    .line 90
    new-instance v0, Lio/trtc/tuikit/atomicxcore/impl/live/l;

    .line 91
    .line 92
    .line 93
    invoke-direct {v0, p0}, Lio/trtc/tuikit/atomicxcore/impl/live/l;-><init>(Lio/trtc/tuikit/atomicxcore/impl/live/q;)V

    .line 94
    .line 95
    iput-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/q;->g:Lio/trtc/tuikit/atomicxcore/impl/live/l;

    .line 96
    .line 97
    new-instance v0, Lio/trtc/tuikit/atomicxcore/api/live/BattleState;

    .line 98
    .line 99
    .line 100
    invoke-direct {v0, p1, v1, v2}, Lio/trtc/tuikit/atomicxcore/api/live/BattleState;-><init>(Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;)V

    .line 101
    .line 102
    iput-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/q;->h:Lio/trtc/tuikit/atomicxcore/api/live/BattleState;

    .line 103
    return-void
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
.end method


# virtual methods
.method public final a(Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;)V
    .locals 3

    const-string v0, "liveInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/q;->d:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "API: afterEnterRoom called with liveInfo="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    const-string v1, "message"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    .line 3
    invoke-virtual {v0, v1, p1}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 4

    const-string v0, "liveID"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/q;->d:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 5
    const-string v1, "message"

    const/4 v2, 0x0

    const-string v3, "API: leaveRoom called with liveID="

    invoke-static {v3, p1, v0, v1, v2}, Lio/trtc/tuikit/atomicxcore/impl/gift/a;->a(Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/impl/common/r;Ljava/lang/String;I)V

    .line 6
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/live/q;->e:Lio/trtc/tuikit/atomicxcore/impl/common/q;

    .line 7
    iget-object p1, p1, Lio/trtc/tuikit/atomicxcore/impl/common/q;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 8
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/common/n;->a:Lio/trtc/tuikit/atomicxcore/impl/common/n;

    invoke-static {p1, v0}, Lkotlin/collections/CollectionsKt;->removeAll(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Z

    .line 9
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/live/q;->f:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager;

    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/q;->g:Lio/trtc/tuikit/atomicxcore/impl/live/l;

    invoke-virtual {p1, v0}, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager;->removeObserver(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$Observer;)V

    return-void
.end method

.method public final acceptBattle(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/q;->d:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 3
    .line 4
    const-string v1, "message"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    const-string v3, "API: acceptBattle called with battleID="

    .line 8
    .line 9
    .line 10
    invoke-static {v3, p1, v0, v1, v2}, Lio/trtc/tuikit/atomicxcore/impl/gift/a;->a(Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/impl/common/r;Ljava/lang/String;I)V

    .line 11
    .line 12
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/q;->f:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager;

    .line 13
    .line 14
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/live/b;

    .line 15
    .line 16
    .line 17
    invoke-direct {v1, p0, p2}, Lio/trtc/tuikit/atomicxcore/impl/live/b;-><init>(Lio/trtc/tuikit/atomicxcore/impl/live/q;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p1, v1}, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager;->acceptBattle(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

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
.end method

.method public final addBattleListener(Lio/trtc/tuikit/atomicxcore/api/live/BattleListener;)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/q;->d:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 3
    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    const-string v2, "API: addBattleListener called with listener="

    .line 7
    .line 8
    .line 9
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    const-string v2, "message"

    .line 22
    .line 23
    .line 24
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    const/4 v2, 0x0

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 29
    .line 30
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/q;->e:Lio/trtc/tuikit/atomicxcore/impl/common/q;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, p1}, Lio/trtc/tuikit/atomicxcore/impl/common/q;->a(Ljava/lang/Object;)V

    .line 34
    return-void
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
.end method

.method public final b(Ljava/lang/String;)V
    .locals 4

    .line 1
    .line 2
    const-string v0, "liveID"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/q;->d:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 8
    .line 9
    const-string v1, "message"

    .line 10
    const/4 v2, 0x0

    .line 11
    .line 12
    const-string v3, "API: beforeEnterRoom called with liveID="

    .line 13
    .line 14
    .line 15
    invoke-static {v3, p1, v0, v1, v2}, Lio/trtc/tuikit/atomicxcore/impl/gift/a;->a(Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/impl/common/r;Ljava/lang/String;I)V

    .line 16
    .line 17
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/live/q;->f:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager;

    .line 18
    .line 19
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/q;->g:Lio/trtc/tuikit/atomicxcore/impl/live/l;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, v0}, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager;->addObserver(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$Observer;)V

    .line 23
    return-void
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public final cancelBattleRequest(Ljava/lang/String;Ljava/util/List;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "userIDList"

    .line 4
    .line 5
    .line 6
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/q;->d:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 9
    .line 10
    new-instance v1, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v2, "API: cancelBattleRequest called with battleID="

    .line 13
    .line 14
    .line 15
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    const-string v2, ", userIDList="

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    const-string v2, "message"

    .line 36
    .line 37
    .line 38
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    const/4 v2, 0x0

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 43
    .line 44
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/q;->f:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager;

    .line 45
    .line 46
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/live/m;

    .line 47
    .line 48
    .line 49
    invoke-direct {v1, p0, p3}, Lio/trtc/tuikit/atomicxcore/impl/live/m;-><init>(Lio/trtc/tuikit/atomicxcore/impl/live/q;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, p1, p2, v1}, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager;->cancelBattleRequest(Ljava/lang/String;Ljava/util/List;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 53
    return-void
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
.end method

.method public final exitBattle(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/q;->d:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 3
    .line 4
    const-string v1, "message"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    const-string v3, "API: exitBattle called with battleID="

    .line 8
    .line 9
    .line 10
    invoke-static {v3, p1, v0, v1, v2}, Lio/trtc/tuikit/atomicxcore/impl/gift/a;->a(Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/impl/common/r;Ljava/lang/String;I)V

    .line 11
    .line 12
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/q;->f:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager;

    .line 13
    .line 14
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/live/n;

    .line 15
    .line 16
    .line 17
    invoke-direct {v1, p0, p2}, Lio/trtc/tuikit/atomicxcore/impl/live/n;-><init>(Lio/trtc/tuikit/atomicxcore/impl/live/q;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p1, v1}, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager;->exitBattle(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

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
.end method

.method public final getBattleState()Lio/trtc/tuikit/atomicxcore/api/live/BattleState;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/q;->h:Lio/trtc/tuikit/atomicxcore/api/live/BattleState;

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
.end method

.method public final rejectBattle(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/q;->d:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 3
    .line 4
    const-string v1, "message"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    const-string v3, "API: rejectBattle called with battleID="

    .line 8
    .line 9
    .line 10
    invoke-static {v3, p1, v0, v1, v2}, Lio/trtc/tuikit/atomicxcore/impl/gift/a;->a(Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/impl/common/r;Ljava/lang/String;I)V

    .line 11
    .line 12
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/q;->f:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager;

    .line 13
    .line 14
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/live/o;

    .line 15
    .line 16
    .line 17
    invoke-direct {v1, p0, p2}, Lio/trtc/tuikit/atomicxcore/impl/live/o;-><init>(Lio/trtc/tuikit/atomicxcore/impl/live/q;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p1, v1}, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager;->rejectBattle(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

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
.end method

.method public final removeBattleListener(Lio/trtc/tuikit/atomicxcore/api/live/BattleListener;)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/q;->d:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 3
    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    const-string v2, "API: removeBattleListener called with listener="

    .line 7
    .line 8
    .line 9
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    const-string v2, "message"

    .line 22
    .line 23
    .line 24
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    const/4 v2, 0x0

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 29
    .line 30
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/q;->e:Lio/trtc/tuikit/atomicxcore/impl/common/q;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, p1}, Lio/trtc/tuikit/atomicxcore/impl/common/q;->b(Ljava/lang/Object;)V

    .line 34
    return-void
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
.end method

.method public final requestBattle(Lio/trtc/tuikit/atomicxcore/api/live/BattleConfig;Ljava/util/List;ILio/trtc/tuikit/atomicxcore/api/live/BattleRequestCallback;)V
    .locals 3

    .line 1
    .line 2
    const-string v0, "config"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string/jumbo v0, "userIDList"

    .line 9
    .line 10
    .line 11
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/q;->d:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 14
    .line 15
    new-instance v1, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v2, "API: requestBattle called with config="

    .line 18
    .line 19
    .line 20
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    const-string v2, ", userIDList="

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    const-string v2, ", timeout="

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    move-result-object v1

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    const-string v2, "message"

    .line 49
    .line 50
    .line 51
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    const/4 v2, 0x0

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 56
    .line 57
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/q;->f:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager;

    .line 58
    .line 59
    if-nez p1, :cond_0

    .line 60
    .line 61
    new-instance p1, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleConfig;

    .line 62
    .line 63
    .line 64
    invoke-direct {p1}, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleConfig;-><init>()V

    .line 65
    goto :goto_0

    .line 66
    .line 67
    :cond_0
    new-instance v1, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleConfig;

    .line 68
    .line 69
    .line 70
    invoke-direct {v1}, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleConfig;-><init>()V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/BattleConfig;->getDuration()I

    .line 74
    move-result v2

    .line 75
    .line 76
    iput v2, v1, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleConfig;->duration:I

    .line 77
    .line 78
    .line 79
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/BattleConfig;->getNeedResponse()Z

    .line 80
    move-result v2

    .line 81
    .line 82
    iput-boolean v2, v1, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleConfig;->needResponse:Z

    .line 83
    .line 84
    .line 85
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/BattleConfig;->getExtensionInfo()Ljava/lang/String;

    .line 86
    move-result-object p1

    .line 87
    .line 88
    iput-object p1, v1, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleConfig;->extensionInfo:Ljava/lang/String;

    .line 89
    move-object p1, v1

    .line 90
    .line 91
    :goto_0
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/live/p;

    .line 92
    .line 93
    .line 94
    invoke-direct {v1, p0, p4}, Lio/trtc/tuikit/atomicxcore/impl/live/p;-><init>(Lio/trtc/tuikit/atomicxcore/impl/live/q;Lio/trtc/tuikit/atomicxcore/api/live/BattleRequestCallback;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0, p1, p2, p3, v1}, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager;->requestBattle(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleConfig;Ljava/util/List;ILcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleRequestCallback;)V

    .line 98
    return-void
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
.end method
