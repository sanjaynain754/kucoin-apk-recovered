.class public final Lio/trtc/tuikit/atomicxcore/impl/contact/H;
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
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/contact/H;->a:Lio/trtc/tuikit/atomicxcore/impl/contact/O;

    .line 3
    .line 4
    iput-object p2, p0, Lio/trtc/tuikit/atomicxcore/impl/contact/H;->b:Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;

    .line 5
    .line 6
    iput-object p3, p0, Lio/trtc/tuikit/atomicxcore/impl/contact/H;->c:Ljava/lang/String;

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
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/contact/H;->a:Lio/trtc/tuikit/atomicxcore/impl/contact/O;

    .line 3
    .line 4
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/impl/contact/O;->h:Lkotlinx/coroutines/flow/n;

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, v1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 9
    .line 10
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/contact/H;->b:Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    if-nez p2, :cond_0

    .line 15
    .line 16
    const-string p2, "Get user info failed"

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
    check-cast p1, Lcom/tencent/imsdk/v2/V2TIMUserFullInfo;

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object p1, v0

    .line 14
    .line 15
    :goto_0
    if-nez p1, :cond_2

    .line 16
    .line 17
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/contact/H;->a:Lio/trtc/tuikit/atomicxcore/impl/contact/O;

    .line 18
    .line 19
    iget-object p1, p1, Lio/trtc/tuikit/atomicxcore/impl/contact/O;->h:Lkotlinx/coroutines/flow/n;

    .line 20
    .line 21
    .line 22
    invoke-interface {p1, v0}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 23
    .line 24
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/contact/H;->b:Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;

    .line 25
    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    const/16 v0, 0x1781

    .line 29
    .line 30
    .line 31
    const-string/jumbo v1, "user not exist"

    .line 32
    .line 33
    .line 34
    invoke-interface {p1, v0, v1}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onFailure(ILjava/lang/String;)V

    .line 35
    :cond_1
    return-void

    .line 36
    .line 37
    .line 38
    :cond_2
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getFriendshipManager()Lcom/tencent/imsdk/v2/V2TIMFriendshipManager;

    .line 39
    move-result-object v0

    .line 40
    .line 41
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/contact/H;->c:Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    .line 45
    move-result-object v1

    .line 46
    .line 47
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/contact/G;

    .line 48
    .line 49
    iget-object v3, p0, Lio/trtc/tuikit/atomicxcore/impl/contact/H;->a:Lio/trtc/tuikit/atomicxcore/impl/contact/O;

    .line 50
    .line 51
    iget-object v4, p0, Lio/trtc/tuikit/atomicxcore/impl/contact/H;->b:Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;

    .line 52
    .line 53
    .line 54
    invoke-direct {v2, v3, p1, v4}, Lio/trtc/tuikit/atomicxcore/impl/contact/G;-><init>(Lio/trtc/tuikit/atomicxcore/impl/contact/O;Lcom/tencent/imsdk/v2/V2TIMUserFullInfo;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 55
    const/4 p1, 0x2

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, v1, p1, v2}, Lcom/tencent/imsdk/v2/V2TIMFriendshipManager;->checkFriend(Ljava/util/List;ILcom/tencent/imsdk/v2/V2TIMValueCallback;)V

    .line 59
    return-void
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
