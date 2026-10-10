.class public final Lio/trtc/tuikit/atomicxcore/impl/gift/f;
.super Lio/trtc/tuikit/atomicxcore/api/gift/GiftStore;
.source "SourceFile"

# interfaces
.implements Lio/trtc/tuikit/atomicxcore/impl/live/d0;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lkotlinx/coroutines/flow/n;

.field public final c:Lio/trtc/tuikit/atomicxcore/impl/common/r;

.field public final d:Lio/trtc/tuikit/atomicxcore/impl/common/q;

.field public final e:Lio/trtc/tuikit/atomicxcore/impl/gift/c;

.field public final f:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveGiftManager;

.field public final g:Lio/trtc/tuikit/atomicxcore/api/gift/GiftState;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 4

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
    const-string v1, "roomEngine"

    .line 18
    .line 19
    .line 20
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-direct {p0}, Lio/trtc/tuikit/atomicxcore/api/gift/GiftStore;-><init>()V

    .line 24
    .line 25
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/gift/f;->a:Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 29
    move-result-object p1

    .line 30
    .line 31
    .line 32
    invoke-static {p1}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 33
    move-result-object p1

    .line 34
    .line 35
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/gift/f;->b:Lkotlinx/coroutines/flow/n;

    .line 36
    .line 37
    const-string v1, "file"

    .line 38
    .line 39
    const-string v2, "AtomicXCore-Live"

    .line 40
    .line 41
    const-string v3, "GiftStoreImpl"

    .line 42
    .line 43
    .line 44
    invoke-static {v3, v1, v2, v3}, Lio/trtc/tuikit/atomicxcore/api/view/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 45
    move-result-object v1

    .line 46
    .line 47
    iput-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/gift/f;->c:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 48
    .line 49
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/common/q;

    .line 50
    .line 51
    .line 52
    invoke-direct {v1}, Lio/trtc/tuikit/atomicxcore/impl/common/q;-><init>()V

    .line 53
    .line 54
    iput-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/gift/f;->d:Lio/trtc/tuikit/atomicxcore/impl/common/q;

    .line 55
    .line 56
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/gift/c;

    .line 57
    .line 58
    .line 59
    invoke-direct {v1, p0}, Lio/trtc/tuikit/atomicxcore/impl/gift/c;-><init>(Lio/trtc/tuikit/atomicxcore/impl/gift/f;)V

    .line 60
    .line 61
    iput-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/gift/f;->e:Lio/trtc/tuikit/atomicxcore/impl/gift/c;

    .line 62
    .line 63
    sget-object v1, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$ExtensionType;->LIVE_GIFT_MANAGER:Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$ExtensionType;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, v1}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->getExtension(Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$ExtensionType;)Ljava/lang/Object;

    .line 67
    move-result-object v0

    .line 68
    .line 69
    const-string v1, "null cannot be cast to non-null type com.tencent.cloud.tuikit.engine.extension.TUILiveGiftManager"

    .line 70
    .line 71
    .line 72
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    .line 74
    check-cast v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveGiftManager;

    .line 75
    .line 76
    iput-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/gift/f;->f:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveGiftManager;

    .line 77
    .line 78
    new-instance v0, Lio/trtc/tuikit/atomicxcore/api/gift/GiftState;

    .line 79
    .line 80
    .line 81
    invoke-direct {v0, p1}, Lio/trtc/tuikit/atomicxcore/api/gift/GiftState;-><init>(Lkotlinx/coroutines/flow/w;)V

    .line 82
    .line 83
    iput-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/gift/f;->g:Lio/trtc/tuikit/atomicxcore/api/gift/GiftState;

    .line 84
    return-void
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


# virtual methods
.method public final a(Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;)V
    .locals 3

    const-string v0, "liveInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/gift/f;->c:Lio/trtc/tuikit/atomicxcore/impl/common/r;

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
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/gift/f;->c:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 5
    const-string v1, "message"

    const/4 v2, 0x0

    const-string v3, "API: leaveRoom called with liveID="

    invoke-static {v3, p1, v0, v1, v2}, Lio/trtc/tuikit/atomicxcore/impl/gift/a;->a(Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/impl/common/r;Ljava/lang/String;I)V

    .line 6
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/gift/f;->d:Lio/trtc/tuikit/atomicxcore/impl/common/q;

    .line 7
    iget-object p1, p1, Lio/trtc/tuikit/atomicxcore/impl/common/q;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 8
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/common/n;->a:Lio/trtc/tuikit/atomicxcore/impl/common/n;

    invoke-static {p1, v0}, Lkotlin/collections/CollectionsKt;->removeAll(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Z

    .line 9
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/gift/f;->f:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveGiftManager;

    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/gift/f;->e:Lio/trtc/tuikit/atomicxcore/impl/gift/c;

    invoke-virtual {p1, v0}, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveGiftManager;->removeObserver(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveGiftManager$Observer;)V

    return-void
.end method

.method public final addGiftListener(Lio/trtc/tuikit/atomicxcore/api/gift/GiftListener;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/gift/f;->d:Lio/trtc/tuikit/atomicxcore/impl/common/q;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lio/trtc/tuikit/atomicxcore/impl/common/q;->a(Ljava/lang/Object;)V

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
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/gift/f;->c:Lio/trtc/tuikit/atomicxcore/impl/common/r;

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
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/gift/f;->f:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveGiftManager;

    .line 18
    .line 19
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/gift/f;->e:Lio/trtc/tuikit/atomicxcore/impl/gift/c;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, v0}, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveGiftManager;->addObserver(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveGiftManager$Observer;)V

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

.method public final getGiftState()Lio/trtc/tuikit/atomicxcore/api/gift/GiftState;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/gift/f;->g:Lio/trtc/tuikit/atomicxcore/api/gift/GiftState;

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

.method public final refreshUsableGifts(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/gift/f;->c:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 3
    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    const-string v2, "API: refreshUsableGifts called with liveID="

    .line 7
    .line 8
    .line 9
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    iget-object v2, p0, Lio/trtc/tuikit/atomicxcore/impl/gift/f;->a:Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    const-string v2, "message"

    .line 24
    .line 25
    .line 26
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    const/4 v2, 0x0

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 31
    .line 32
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/gift/f;->f:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveGiftManager;

    .line 33
    .line 34
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/gift/f;->a:Ljava/lang/String;

    .line 35
    .line 36
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/gift/d;

    .line 37
    .line 38
    .line 39
    invoke-direct {v2, p0, p1}, Lio/trtc/tuikit/atomicxcore/impl/gift/d;-><init>(Lio/trtc/tuikit/atomicxcore/impl/gift/f;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v1, v2}, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveGiftManager;->getGiftList(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/extension/TUILiveGiftManager$GetGiftListCallback;)V

    .line 43
    return-void
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

.method public final removeGiftListener(Lio/trtc/tuikit/atomicxcore/api/gift/GiftListener;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/gift/f;->d:Lio/trtc/tuikit/atomicxcore/impl/common/q;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lio/trtc/tuikit/atomicxcore/impl/common/q;->b(Ljava/lang/Object;)V

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
.end method

.method public final sendGift(Ljava/lang/String;ILio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 3

    .line 1
    .line 2
    const-string v0, "giftID"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/gift/f;->c:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 8
    .line 9
    new-instance v1, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    const-string v2, "API: sendGift called with giftID="

    .line 12
    .line 13
    .line 14
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    const-string v2, ", count="

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    move-result-object v1

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    const-string v2, "message"

    .line 35
    .line 36
    .line 37
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    const/4 v2, 0x0

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 42
    .line 43
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/gift/f;->f:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveGiftManager;

    .line 44
    .line 45
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/gift/f;->a:Ljava/lang/String;

    .line 46
    .line 47
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/gift/e;

    .line 48
    .line 49
    .line 50
    invoke-direct {v2, p0, p3}, Lio/trtc/tuikit/atomicxcore/impl/gift/e;-><init>(Lio/trtc/tuikit/atomicxcore/impl/gift/f;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, v1, p1, p2, v2}, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveGiftManager;->sendGift(Ljava/lang/String;Ljava/lang/String;ILcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 54
    return-void
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

.method public final setLanguage(Ljava/lang/String;)V
    .locals 5

    .line 1
    .line 2
    const-string v0, "language"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/gift/f;->c:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 8
    const/4 v2, 0x0

    .line 9
    .line 10
    const-string v3, "setCurrentLanguage:"

    .line 11
    .line 12
    const-string v4, "message"

    .line 13
    .line 14
    .line 15
    invoke-static {v3, p1, v1, v4, v2}, Lio/trtc/tuikit/atomicxcore/impl/gift/a;->a(Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/impl/common/r;Ljava/lang/String;I)V

    .line 16
    .line 17
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    .line 18
    .line 19
    .line 20
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 24
    .line 25
    new-instance p1, Lorg/json/JSONObject;

    .line 26
    .line 27
    .line 28
    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    .line 29
    .line 30
    const-string v0, "api"

    .line 31
    .line 32
    const-string v2, "setCurrentLanguage"

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 36
    .line 37
    const-string v0, "params"

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 44
    move-result-object p1

    .line 45
    .line 46
    .line 47
    const-string/jumbo v0, "toString(...)"

    .line 48
    .line 49
    .line 50
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-static {}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->sharedInstance()Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    .line 54
    move-result-object v0

    .line 55
    const/4 v1, 0x0

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, p1, v1}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->callExperimentalAPI(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ExperimentalAPIResponseCallback;)Ljava/lang/Object;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 59
    return-void

    .line 60
    :catch_0
    move-exception p1

    .line 61
    .line 62
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/gift/f;->c:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 63
    .line 64
    new-instance v1, Ljava/lang/StringBuilder;

    .line 65
    .line 66
    const-string v2, "setCurrentLanguage failed:"

    .line 67
    .line 68
    .line 69
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    .line 73
    move-result-object p1

    .line 74
    .line 75
    .line 76
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    move-result-object p1

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    invoke-static {p1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 87
    const/4 v1, 0x2

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0, v1, p1}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 91
    return-void
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
