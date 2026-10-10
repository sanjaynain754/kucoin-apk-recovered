.class public final Lio/trtc/tuikit/atomicxcore/impl/contact/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/tencent/imsdk/v2/V2TIMValueCallback;


# instance fields
.field public final synthetic a:Lio/trtc/tuikit/atomicxcore/impl/contact/O;

.field public final synthetic b:Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;

.field public final synthetic c:Lio/trtc/tuikit/atomicxcore/api/contact/FriendApplicationInfo;


# direct methods
.method public constructor <init>(Lio/trtc/tuikit/atomicxcore/impl/contact/O;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;Lio/trtc/tuikit/atomicxcore/api/contact/FriendApplicationInfo;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/contact/t;->a:Lio/trtc/tuikit/atomicxcore/impl/contact/O;

    .line 3
    .line 4
    iput-object p2, p0, Lio/trtc/tuikit/atomicxcore/impl/contact/t;->b:Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;

    .line 5
    .line 6
    iput-object p3, p0, Lio/trtc/tuikit/atomicxcore/impl/contact/t;->c:Lio/trtc/tuikit/atomicxcore/api/contact/FriendApplicationInfo;

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
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/contact/t;->b:Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    if-nez p2, :cond_0

    .line 7
    .line 8
    const-string p2, "Accept friend application failed"

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-interface {v0, p1, p2}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onFailure(ILjava/lang/String;)V

    .line 12
    :cond_1
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
.end method

.method public final onSuccess(Ljava/lang/Object;)V
    .locals 6

    .line 1
    .line 2
    check-cast p1, Lcom/tencent/imsdk/v2/V2TIMFriendOperationResult;

    .line 3
    .line 4
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/contact/t;->a:Lio/trtc/tuikit/atomicxcore/impl/contact/O;

    .line 5
    .line 6
    iget-object p1, p1, Lio/trtc/tuikit/atomicxcore/impl/contact/O;->d:Lkotlinx/coroutines/flow/n;

    .line 7
    .line 8
    .line 9
    invoke-interface {p1}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    check-cast v0, Ljava/lang/Iterable;

    .line 13
    .line 14
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/contact/t;->c:Lio/trtc/tuikit/atomicxcore/api/contact/FriendApplicationInfo;

    .line 15
    .line 16
    new-instance v2, Ljava/util/ArrayList;

    .line 17
    .line 18
    .line 19
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    .line 26
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    move-result v3

    .line 28
    .line 29
    if-eqz v3, :cond_1

    .line 30
    .line 31
    .line 32
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    move-result-object v3

    .line 34
    move-object v4, v3

    .line 35
    .line 36
    check-cast v4, Lio/trtc/tuikit/atomicxcore/api/contact/FriendApplicationInfo;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v4}, Lio/trtc/tuikit/atomicxcore/api/contact/FriendApplicationInfo;->getApplicationID()Ljava/lang/String;

    .line 40
    move-result-object v4

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/contact/FriendApplicationInfo;->getApplicationID()Ljava/lang/String;

    .line 44
    move-result-object v5

    .line 45
    .line 46
    .line 47
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 48
    move-result v4

    .line 49
    .line 50
    if-nez v4, :cond_0

    .line 51
    .line 52
    .line 53
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 54
    goto :goto_0

    .line 55
    .line 56
    .line 57
    :cond_1
    invoke-interface {p1, v2}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 58
    .line 59
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/contact/t;->b:Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;

    .line 60
    .line 61
    if-eqz p1, :cond_2

    .line 62
    .line 63
    .line 64
    invoke-interface {p1}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onSuccess()V

    .line 65
    :cond_2
    return-void
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
