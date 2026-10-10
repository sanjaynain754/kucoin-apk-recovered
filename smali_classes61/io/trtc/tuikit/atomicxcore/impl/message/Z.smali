.class public final Lio/trtc/tuikit/atomicxcore/impl/message/Z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/tencent/imsdk/v2/V2TIMValueCallback;


# instance fields
.field public final synthetic a:Lio/trtc/tuikit/atomicxcore/impl/message/d0;

.field public final synthetic b:Lio/trtc/tuikit/atomicxcore/impl/message/r0;

.field public final synthetic c:Lio/trtc/tuikit/atomicxcore/api/message/MessageFetchOption;


# direct methods
.method public constructor <init>(Lio/trtc/tuikit/atomicxcore/impl/message/d0;Lio/trtc/tuikit/atomicxcore/impl/message/r0;Lio/trtc/tuikit/atomicxcore/api/message/MessageFetchOption;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/message/Z;->a:Lio/trtc/tuikit/atomicxcore/impl/message/d0;

    .line 3
    .line 4
    iput-object p2, p0, Lio/trtc/tuikit/atomicxcore/impl/message/Z;->b:Lio/trtc/tuikit/atomicxcore/impl/message/r0;

    .line 5
    .line 6
    iput-object p3, p0, Lio/trtc/tuikit/atomicxcore/impl/message/Z;->c:Lio/trtc/tuikit/atomicxcore/api/message/MessageFetchOption;

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
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/message/Z;->a:Lio/trtc/tuikit/atomicxcore/impl/message/d0;

    .line 3
    .line 4
    if-nez p2, :cond_0

    .line 5
    .line 6
    const-string p2, ""

    .line 7
    .line 8
    :cond_0
    const-string v1, "desc"

    .line 9
    .line 10
    .line 11
    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/impl/message/d0;->a:Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    .line 18
    invoke-interface {v0, p1, p2}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onFailure(ILjava/lang/String;)V

    .line 19
    :cond_1
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
.end method

.method public final onSuccess(Ljava/lang/Object;)V
    .locals 3

    .line 1
    .line 2
    check-cast p1, Ljava/util/List;

    .line 3
    .line 4
    if-nez p1, :cond_1

    .line 5
    .line 6
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/message/Z;->a:Lio/trtc/tuikit/atomicxcore/impl/message/d0;

    .line 7
    .line 8
    const-string v0, "desc"

    .line 9
    .line 10
    const-string v1, "Download failed"

    .line 11
    .line 12
    .line 13
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    iget-object p1, p1, Lio/trtc/tuikit/atomicxcore/impl/message/d0;->a:Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;

    .line 16
    .line 17
    if-eqz p1, :cond_0

    .line 18
    const/4 v0, -0x1

    .line 19
    .line 20
    .line 21
    invoke-interface {p1, v0, v1}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onFailure(ILjava/lang/String;)V

    .line 22
    :cond_0
    return-void

    .line 23
    .line 24
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    .line 25
    .line 26
    const/16 v1, 0xa

    .line 27
    .line 28
    .line 29
    invoke-static {p1, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 30
    move-result v1

    .line 31
    .line 32
    .line 33
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 34
    .line 35
    .line 36
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 37
    move-result-object p1

    .line 38
    .line 39
    .line 40
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 41
    move-result v1

    .line 42
    .line 43
    if-eqz v1, :cond_2

    .line 44
    .line 45
    .line 46
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 47
    move-result-object v1

    .line 48
    .line 49
    check-cast v1, Lcom/tencent/imsdk/v2/V2TIMMessage;

    .line 50
    .line 51
    .line 52
    invoke-static {v1}, Lio/trtc/tuikit/atomicxcore/impl/common/l;->a(Lcom/tencent/imsdk/v2/V2TIMMessage;)Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;

    .line 53
    move-result-object v1

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 57
    goto :goto_0

    .line 58
    .line 59
    :cond_2
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/message/Z;->b:Lio/trtc/tuikit/atomicxcore/impl/message/r0;

    .line 60
    .line 61
    iget-object p1, p1, Lio/trtc/tuikit/atomicxcore/impl/message/r0;->e:Lkotlinx/coroutines/flow/n;

    .line 62
    .line 63
    .line 64
    invoke-interface {p1, v0}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 68
    move-result p1

    .line 69
    .line 70
    if-nez p1, :cond_3

    .line 71
    .line 72
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/message/Z;->b:Lio/trtc/tuikit/atomicxcore/impl/message/r0;

    .line 73
    .line 74
    new-instance v1, Lio/trtc/tuikit/atomicxcore/api/message/MessageEvent$FetchMessages;

    .line 75
    .line 76
    iget-object v2, p0, Lio/trtc/tuikit/atomicxcore/impl/message/Z;->c:Lio/trtc/tuikit/atomicxcore/api/message/MessageFetchOption;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/message/MessageFetchOption;->getDirection()Lio/trtc/tuikit/atomicxcore/api/message/MessageFetchDirection;

    .line 80
    move-result-object v2

    .line 81
    .line 82
    .line 83
    invoke-direct {v1, v0, v2}, Lio/trtc/tuikit/atomicxcore/api/message/MessageEvent$FetchMessages;-><init>(Ljava/util/List;Lio/trtc/tuikit/atomicxcore/api/message/MessageFetchDirection;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p1, v1}, Lio/trtc/tuikit/atomicxcore/impl/message/r0;->a(Lio/trtc/tuikit/atomicxcore/api/message/MessageEvent;)V

    .line 87
    .line 88
    :cond_3
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/message/Z;->a:Lio/trtc/tuikit/atomicxcore/impl/message/d0;

    .line 89
    .line 90
    .line 91
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/impl/message/d0;->onSuccess()V

    .line 92
    return-void
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
