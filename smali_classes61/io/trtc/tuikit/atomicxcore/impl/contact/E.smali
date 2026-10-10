.class public final Lio/trtc/tuikit/atomicxcore/impl/contact/E;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/tencent/imsdk/v2/V2TIMValueCallback;


# instance fields
.field public final synthetic a:Lio/trtc/tuikit/atomicxcore/impl/contact/O;

.field public final synthetic b:Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lio/trtc/tuikit/atomicxcore/impl/contact/O;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/contact/E;->a:Lio/trtc/tuikit/atomicxcore/impl/contact/O;

    .line 3
    .line 4
    iput-object p2, p0, Lio/trtc/tuikit/atomicxcore/impl/contact/E;->b:Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;

    .line 5
    .line 6
    iput-object p3, p0, Lio/trtc/tuikit/atomicxcore/impl/contact/E;->c:Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method


# virtual methods
.method public final onError(ILjava/lang/String;)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/contact/E;->a:Lio/trtc/tuikit/atomicxcore/impl/contact/O;

    .line 3
    .line 4
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/impl/contact/O;->i:Lkotlinx/coroutines/flow/n;

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, v1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 9
    .line 10
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/contact/E;->b:Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    if-nez p2, :cond_0

    .line 15
    .line 16
    const-string p2, "Get group info failed"

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-interface {v0, p1, p2}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onFailure(ILjava/lang/String;)V

    .line 20
    :cond_1
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
.end method

.method public final onSuccess(Ljava/lang/Object;)V
    .locals 5

    .line 1
    .line 2
    check-cast p1, Ljava/util/List;

    .line 3
    const/4 v0, 0x0

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 9
    move-result-object p1

    .line 10
    .line 11
    check-cast p1, Lcom/tencent/imsdk/v2/V2TIMGroupInfoResult;

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object p1, v0

    .line 14
    .line 15
    :goto_0
    if-eqz p1, :cond_2

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Lcom/tencent/imsdk/v2/V2TIMGroupInfoResult;->getResultCode()I

    .line 19
    move-result v1

    .line 20
    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Lcom/tencent/imsdk/v2/V2TIMGroupInfoResult;->getGroupInfo()Lcom/tencent/imsdk/v2/V2TIMGroupInfo;

    .line 25
    move-result-object p1

    .line 26
    .line 27
    if-nez p1, :cond_1

    .line 28
    .line 29
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/contact/E;->a:Lio/trtc/tuikit/atomicxcore/impl/contact/O;

    .line 30
    .line 31
    iget-object p1, p1, Lio/trtc/tuikit/atomicxcore/impl/contact/O;->i:Lkotlinx/coroutines/flow/n;

    .line 32
    .line 33
    .line 34
    invoke-interface {p1, v0}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 35
    .line 36
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/contact/E;->b:Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;

    .line 37
    .line 38
    if-eqz p1, :cond_6

    .line 39
    .line 40
    const/16 v0, 0x1781

    .line 41
    .line 42
    const-string v1, "group not exist"

    .line 43
    .line 44
    .line 45
    invoke-interface {p1, v0, v1}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onFailure(ILjava/lang/String;)V

    .line 46
    return-void

    .line 47
    .line 48
    .line 49
    :cond_1
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getGroupManager()Lcom/tencent/imsdk/v2/V2TIMGroupManager;

    .line 50
    move-result-object v0

    .line 51
    .line 52
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/contact/D;

    .line 53
    .line 54
    iget-object v2, p0, Lio/trtc/tuikit/atomicxcore/impl/contact/E;->a:Lio/trtc/tuikit/atomicxcore/impl/contact/O;

    .line 55
    .line 56
    iget-object v3, p0, Lio/trtc/tuikit/atomicxcore/impl/contact/E;->b:Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;

    .line 57
    .line 58
    iget-object v4, p0, Lio/trtc/tuikit/atomicxcore/impl/contact/E;->c:Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    invoke-direct {v1, v2, p1, v3, v4}, Lio/trtc/tuikit/atomicxcore/impl/contact/D;-><init>(Lio/trtc/tuikit/atomicxcore/impl/contact/O;Lcom/tencent/imsdk/v2/V2TIMGroupInfo;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, v1}, Lcom/tencent/imsdk/v2/V2TIMGroupManager;->getJoinedGroupList(Lcom/tencent/imsdk/v2/V2TIMValueCallback;)V

    .line 65
    return-void

    .line 66
    .line 67
    :cond_2
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/contact/E;->a:Lio/trtc/tuikit/atomicxcore/impl/contact/O;

    .line 68
    .line 69
    iget-object v1, v1, Lio/trtc/tuikit/atomicxcore/impl/contact/O;->i:Lkotlinx/coroutines/flow/n;

    .line 70
    .line 71
    .line 72
    invoke-interface {v1, v0}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 73
    .line 74
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/contact/E;->b:Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;

    .line 75
    .line 76
    if-eqz v1, :cond_6

    .line 77
    .line 78
    if-eqz p1, :cond_3

    .line 79
    .line 80
    .line 81
    invoke-virtual {p1}, Lcom/tencent/imsdk/v2/V2TIMGroupInfoResult;->getResultCode()I

    .line 82
    move-result v2

    .line 83
    goto :goto_1

    .line 84
    .line 85
    :cond_3
    const/16 v2, 0x271f

    .line 86
    .line 87
    :goto_1
    if-eqz p1, :cond_4

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1}, Lcom/tencent/imsdk/v2/V2TIMGroupInfoResult;->getResultMessage()Ljava/lang/String;

    .line 91
    move-result-object v0

    .line 92
    .line 93
    :cond_4
    if-nez v0, :cond_5

    .line 94
    .line 95
    const-string v0, "Get group info failed"

    .line 96
    .line 97
    .line 98
    :cond_5
    invoke-interface {v1, v2, v0}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onFailure(ILjava/lang/String;)V

    .line 99
    :cond_6
    return-void
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
