.class public final Lio/trtc/tuikit/atomicxcore/impl/view/room/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final f:Lkotlin/Lazy;


# instance fields
.field public final a:Lio/trtc/tuikit/atomicxcore/impl/common/r;

.field public final b:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

.field public final c:Ljava/util/HashSet;

.field public final d:Ljava/util/HashMap;

.field public e:Lio/trtc/tuikit/atomicxcore/impl/view/room/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/view/room/c;->a:Lio/trtc/tuikit/atomicxcore/impl/view/room/c;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    sput-object v0, Lio/trtc/tuikit/atomicxcore/impl/view/room/i;->f:Lkotlin/Lazy;

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
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    const-string v0, "file"

    .line 6
    .line 7
    const-string v1, "AtomicXCore-Room"

    .line 8
    .line 9
    const-string v2, "VideoStreamManager"

    .line 10
    .line 11
    .line 12
    invoke-static {v2, v0, v1, v2}, Lio/trtc/tuikit/atomicxcore/api/view/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    iput-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/room/i;->a:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 16
    .line 17
    .line 18
    invoke-static {}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->sharedInstance()Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    iput-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/room/i;->b:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    .line 22
    .line 23
    new-instance v0, Ljava/util/HashSet;

    .line 24
    .line 25
    .line 26
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 27
    .line 28
    iput-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/room/i;->c:Ljava/util/HashSet;

    .line 29
    .line 30
    new-instance v0, Ljava/util/HashMap;

    .line 31
    .line 32
    .line 33
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 34
    .line 35
    iput-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/room/i;->d:Ljava/util/HashMap;

    .line 36
    return-void
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
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/common/TUIVideoView;)V
    .locals 5

    const-string/jumbo v0, "userID"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "view"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_1

    .line 2
    :cond_0
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/room/i;->c:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->size()I

    move-result v0

    const/4 v1, 0x5

    if-lt v0, v1, :cond_1

    invoke-virtual {p2}, Landroid/view/View;->getWidth()I

    move-result v0

    const/16 v1, 0x3c0

    if-gt v0, v1, :cond_1

    .line 3
    sget-object v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;->CAMERA_STREAM_LOW:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;

    goto :goto_0

    .line 4
    :cond_1
    sget-object v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;->CAMERA_STREAM:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;

    .line 5
    :goto_0
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/room/i;->a:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string/jumbo v3, "startPlayCameraStream userId:"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " ,view:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/Object;->hashCode()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " ,streamType:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 6
    const-string v3, "message"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    .line 7
    invoke-virtual {v1, v4, v2}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 8
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/view/room/e;

    invoke-virtual {p2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    invoke-direct {v1, p1, v0, v2}, Lio/trtc/tuikit/atomicxcore/impl/view/room/e;-><init>(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;I)V

    .line 9
    iget-object v2, p0, Lio/trtc/tuikit/atomicxcore/impl/view/room/i;->d:Ljava/util/HashMap;

    invoke-virtual {v2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 10
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/room/i;->a:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 11
    const-string p2, "same user operation, ignore"

    invoke-static {p2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    invoke-virtual {p1, v4, p2}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    return-void

    .line 13
    :cond_2
    iget-object v2, p0, Lio/trtc/tuikit/atomicxcore/impl/view/room/i;->b:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    invoke-virtual {v2, p1, v0, p2}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->setRemoteVideoView(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;Lcom/tencent/cloud/tuikit/engine/common/TUIVideoView;)V

    .line 14
    iget-object p2, p0, Lio/trtc/tuikit/atomicxcore/impl/view/room/i;->b:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/view/room/g;

    invoke-direct {v2, p0}, Lio/trtc/tuikit/atomicxcore/impl/view/room/g;-><init>(Lio/trtc/tuikit/atomicxcore/impl/view/room/i;)V

    invoke-virtual {p2, p1, v0, v2}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->startPlayRemoteVideo(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$PlayCallback;)V

    .line 15
    iget-object p2, p0, Lio/trtc/tuikit/atomicxcore/impl/view/room/i;->d:Ljava/util/HashMap;

    invoke-virtual {p2, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    sget-object p2, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;->CAMERA_STREAM:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;

    if-ne v0, p2, :cond_3

    .line 17
    iget-object p2, p0, Lio/trtc/tuikit/atomicxcore/impl/view/room/i;->c:Ljava/util/HashSet;

    invoke-virtual {p2, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_3
    :goto_1
    return-void
.end method

.method public final a(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/common/TUIVideoView;Z)V
    .locals 3

    const-string/jumbo v0, "userID"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "view"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/room/i;->a:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string/jumbo v2, "stopPlayCameraStream userId:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x7d

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    const-string v2, "message"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    .line 20
    invoke-virtual {v0, v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 21
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 22
    :cond_0
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/room/i;->d:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/trtc/tuikit/atomicxcore/impl/view/room/e;

    if-eqz v0, :cond_2

    .line 23
    iget v0, v0, Lio/trtc/tuikit/atomicxcore/impl/view/room/e;->c:I

    .line 24
    invoke-virtual {p2}, Ljava/lang/Object;->hashCode()I

    move-result p2

    if-ne v0, p2, :cond_2

    .line 25
    iget-object p2, p0, Lio/trtc/tuikit/atomicxcore/impl/view/room/i;->b:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    sget-object v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;->CAMERA_STREAM:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;

    invoke-virtual {p2, p1, v0}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->stopPlayRemoteVideo(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;)V

    .line 26
    iget-object p2, p0, Lio/trtc/tuikit/atomicxcore/impl/view/room/i;->b:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    sget-object v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;->CAMERA_STREAM_LOW:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;

    invoke-virtual {p2, p1, v1}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->stopPlayRemoteVideo(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;)V

    if-eqz p3, :cond_1

    .line 27
    iget-object p2, p0, Lio/trtc/tuikit/atomicxcore/impl/view/room/i;->b:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    const/4 p3, 0x0

    invoke-virtual {p2, p1, v0, p3}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->setRemoteVideoView(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;Lcom/tencent/cloud/tuikit/engine/common/TUIVideoView;)V

    .line 28
    iget-object p2, p0, Lio/trtc/tuikit/atomicxcore/impl/view/room/i;->b:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    invoke-virtual {p2, p1, v1, p3}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->setRemoteVideoView(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;Lcom/tencent/cloud/tuikit/engine/common/TUIVideoView;)V

    .line 29
    :cond_1
    iget-object p2, p0, Lio/trtc/tuikit/atomicxcore/impl/view/room/i;->c:Ljava/util/HashSet;

    invoke-virtual {p2, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 30
    iget-object p2, p0, Lio/trtc/tuikit/atomicxcore/impl/view/room/i;->d:Ljava/util/HashMap;

    invoke-virtual {p2, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    :goto_0
    return-void
.end method

.method public final b(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/common/TUIVideoView;Z)V
    .locals 3

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "userID"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    const-string/jumbo v0, "view"

    .line 10
    .line 11
    .line 12
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/room/i;->a:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 15
    .line 16
    new-instance v1, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string/jumbo v2, "stopPlayScreenShareStream userId:"

    .line 20
    .line 21
    .line 22
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    const/16 v2, 0x7d

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    move-result-object v1

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    const-string v2, "message"

    .line 40
    .line 41
    .line 42
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    const/4 v2, 0x0

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 50
    move-result v0

    .line 51
    .line 52
    if-nez v0, :cond_0

    .line 53
    goto :goto_0

    .line 54
    .line 55
    :cond_0
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/room/i;->e:Lio/trtc/tuikit/atomicxcore/impl/view/room/e;

    .line 56
    .line 57
    if-eqz v0, :cond_2

    .line 58
    .line 59
    iget v0, v0, Lio/trtc/tuikit/atomicxcore/impl/view/room/e;->c:I

    .line 60
    .line 61
    .line 62
    invoke-virtual {p2}, Ljava/lang/Object;->hashCode()I

    .line 63
    move-result p2

    .line 64
    .line 65
    if-ne v0, p2, :cond_2

    .line 66
    .line 67
    iget-object p2, p0, Lio/trtc/tuikit/atomicxcore/impl/view/room/i;->b:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    .line 68
    .line 69
    sget-object v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;->SCREEN_STREAM:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;

    .line 70
    .line 71
    .line 72
    invoke-virtual {p2, p1, v0}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->stopPlayRemoteVideo(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;)V

    .line 73
    const/4 p2, 0x0

    .line 74
    .line 75
    if-eqz p3, :cond_1

    .line 76
    .line 77
    iget-object p3, p0, Lio/trtc/tuikit/atomicxcore/impl/view/room/i;->b:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    .line 78
    .line 79
    .line 80
    invoke-virtual {p3, p1, v0, p2}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->setRemoteVideoView(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;Lcom/tencent/cloud/tuikit/engine/common/TUIVideoView;)V

    .line 81
    .line 82
    :cond_1
    iput-object p2, p0, Lio/trtc/tuikit/atomicxcore/impl/view/room/i;->e:Lio/trtc/tuikit/atomicxcore/impl/view/room/e;

    .line 83
    :cond_2
    :goto_0
    return-void
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
