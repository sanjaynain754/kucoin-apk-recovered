.class public final Lio/trtc/tuikit/atomicxcore/impl/conversation/j;
.super Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationGroupStore;
.source "SourceFile"


# instance fields
.field public final a:Lkotlinx/coroutines/flow/n;

.field public final b:Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationGroupState;

.field public volatile c:Lio/trtc/tuikit/atomicxcore/impl/conversation/d;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationGroupStore;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    iput-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/conversation/j;->a:Lkotlinx/coroutines/flow/n;

    .line 14
    .line 15
    new-instance v1, Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationGroupState;

    .line 16
    .line 17
    .line 18
    invoke-static {v0}, Lkotlinx/coroutines/flow/g;->c(Lkotlinx/coroutines/flow/n;)Lkotlinx/coroutines/flow/w;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    .line 22
    invoke-direct {v1, v0}, Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationGroupState;-><init>(Lkotlinx/coroutines/flow/w;)V

    .line 23
    .line 24
    iput-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/conversation/j;->b:Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationGroupState;

    .line 25
    .line 26
    new-instance v0, Lio/trtc/tuikit/atomicxcore/impl/conversation/d;

    .line 27
    .line 28
    .line 29
    invoke-direct {v0, p0}, Lio/trtc/tuikit/atomicxcore/impl/conversation/d;-><init>(Lio/trtc/tuikit/atomicxcore/impl/conversation/j;)V

    .line 30
    .line 31
    iput-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/conversation/j;->c:Lio/trtc/tuikit/atomicxcore/impl/conversation/d;

    .line 32
    .line 33
    new-instance v0, Lio/trtc/tuikit/atomicxcore/impl/common/w;

    .line 34
    .line 35
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/conversation/j;->c:Lio/trtc/tuikit/atomicxcore/impl/conversation/d;

    .line 36
    .line 37
    .line 38
    invoke-direct {v0, v1}, Lio/trtc/tuikit/atomicxcore/impl/common/w;-><init>(Lcom/tencent/imsdk/v2/V2TIMConversationListener;)V

    .line 39
    .line 40
    .line 41
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getConversationManager()Lcom/tencent/imsdk/v2/V2TIMConversationManager;

    .line 42
    move-result-object v1

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1, v0}, Lcom/tencent/imsdk/v2/V2TIMConversationManager;->addConversationListener(Lcom/tencent/imsdk/v2/V2TIMConversationListener;)V

    .line 46
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

.method public static final a(Lio/trtc/tuikit/atomicxcore/impl/conversation/j;Ljava/util/List;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    if-nez p2, :cond_0

    .line 6
    return-void

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    .line 9
    if-eqz p1, :cond_3

    .line 10
    .line 11
    .line 12
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 13
    move-result-object p1

    .line 14
    .line 15
    .line 16
    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    move-result v0

    .line 18
    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    .line 22
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    move-result-object v0

    .line 24
    move-object v1, v0

    .line 25
    .line 26
    check-cast v1, Lcom/tencent/imsdk/v2/V2TIMConversationOperationResult;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, Lcom/tencent/imsdk/v2/V2TIMConversationOperationResult;->getResultCode()I

    .line 30
    move-result v1

    .line 31
    .line 32
    if-eqz v1, :cond_1

    .line 33
    move-object p0, v0

    .line 34
    .line 35
    :cond_2
    check-cast p0, Lcom/tencent/imsdk/v2/V2TIMConversationOperationResult;

    .line 36
    .line 37
    :cond_3
    if-eqz p0, :cond_5

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMConversationOperationResult;->getResultCode()I

    .line 41
    move-result p1

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMConversationOperationResult;->getResultInfo()Ljava/lang/String;

    .line 45
    move-result-object p0

    .line 46
    .line 47
    if-nez p0, :cond_4

    .line 48
    .line 49
    const-string p0, "Unknown error"

    .line 50
    .line 51
    .line 52
    :cond_4
    invoke-interface {p2, p1, p0}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onFailure(ILjava/lang/String;)V

    .line 53
    return-void

    .line 54
    .line 55
    .line 56
    :cond_5
    invoke-interface {p2}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onSuccess()V

    .line 57
    return-void
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
.method public final addConversationsToGroup(Ljava/lang/String;Ljava/util/List;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 2

    .line 1
    .line 2
    const-string v0, "groupName"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "conversationIDList"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 14
    move-result v0

    .line 15
    .line 16
    const/16 v1, 0x1781

    .line 17
    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    if-eqz p3, :cond_1

    .line 21
    .line 22
    const-string p1, "Group name is empty"

    .line 23
    .line 24
    .line 25
    invoke-interface {p3, v1, p1}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onFailure(ILjava/lang/String;)V

    .line 26
    return-void

    .line 27
    .line 28
    .line 29
    :cond_0
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 30
    move-result v0

    .line 31
    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    if-eqz p3, :cond_1

    .line 35
    .line 36
    const-string p1, "Conversation ID list is empty"

    .line 37
    .line 38
    .line 39
    invoke-interface {p3, v1, p1}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onFailure(ILjava/lang/String;)V

    .line 40
    :cond_1
    return-void

    .line 41
    .line 42
    .line 43
    :cond_2
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getConversationManager()Lcom/tencent/imsdk/v2/V2TIMConversationManager;

    .line 44
    move-result-object v0

    .line 45
    .line 46
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/conversation/c;

    .line 47
    .line 48
    .line 49
    invoke-direct {v1, p0, p3}, Lio/trtc/tuikit/atomicxcore/impl/conversation/c;-><init>(Lio/trtc/tuikit/atomicxcore/impl/conversation/j;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, p1, p2, v1}, Lcom/tencent/imsdk/v2/V2TIMConversationManager;->addConversationsToGroup(Ljava/lang/String;Ljava/util/List;Lcom/tencent/imsdk/v2/V2TIMValueCallback;)V

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

.method public final createGroup(Ljava/lang/String;Ljava/util/List;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 2

    .line 1
    .line 2
    const-string v0, "groupName"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "conversationIDList"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 14
    move-result v0

    .line 15
    .line 16
    const/16 v1, 0x1781

    .line 17
    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    if-eqz p3, :cond_1

    .line 21
    .line 22
    const-string p1, "Group name is empty"

    .line 23
    .line 24
    .line 25
    invoke-interface {p3, v1, p1}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onFailure(ILjava/lang/String;)V

    .line 26
    return-void

    .line 27
    .line 28
    .line 29
    :cond_0
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 30
    move-result v0

    .line 31
    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    if-eqz p3, :cond_1

    .line 35
    .line 36
    const-string p1, "Conversation ID list is empty"

    .line 37
    .line 38
    .line 39
    invoke-interface {p3, v1, p1}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onFailure(ILjava/lang/String;)V

    .line 40
    :cond_1
    return-void

    .line 41
    .line 42
    .line 43
    :cond_2
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getConversationManager()Lcom/tencent/imsdk/v2/V2TIMConversationManager;

    .line 44
    move-result-object v0

    .line 45
    .line 46
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/conversation/e;

    .line 47
    .line 48
    .line 49
    invoke-direct {v1, p0, p1, p3}, Lio/trtc/tuikit/atomicxcore/impl/conversation/e;-><init>(Lio/trtc/tuikit/atomicxcore/impl/conversation/j;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, p1, p2, v1}, Lcom/tencent/imsdk/v2/V2TIMConversationManager;->createConversationGroup(Ljava/lang/String;Ljava/util/List;Lcom/tencent/imsdk/v2/V2TIMValueCallback;)V

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

.method public final deleteConversationsFromGroup(Ljava/lang/String;Ljava/util/List;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 2

    .line 1
    .line 2
    const-string v0, "groupName"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "conversationIDList"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 14
    move-result v0

    .line 15
    .line 16
    const/16 v1, 0x1781

    .line 17
    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    if-eqz p3, :cond_1

    .line 21
    .line 22
    const-string p1, "Group name is empty"

    .line 23
    .line 24
    .line 25
    invoke-interface {p3, v1, p1}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onFailure(ILjava/lang/String;)V

    .line 26
    return-void

    .line 27
    .line 28
    .line 29
    :cond_0
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 30
    move-result v0

    .line 31
    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    if-eqz p3, :cond_1

    .line 35
    .line 36
    const-string p1, "Conversation ID list is empty"

    .line 37
    .line 38
    .line 39
    invoke-interface {p3, v1, p1}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onFailure(ILjava/lang/String;)V

    .line 40
    :cond_1
    return-void

    .line 41
    .line 42
    .line 43
    :cond_2
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getConversationManager()Lcom/tencent/imsdk/v2/V2TIMConversationManager;

    .line 44
    move-result-object v0

    .line 45
    .line 46
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/conversation/f;

    .line 47
    .line 48
    .line 49
    invoke-direct {v1, p0, p3}, Lio/trtc/tuikit/atomicxcore/impl/conversation/f;-><init>(Lio/trtc/tuikit/atomicxcore/impl/conversation/j;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, p1, p2, v1}, Lcom/tencent/imsdk/v2/V2TIMConversationManager;->deleteConversationsFromGroup(Ljava/lang/String;Ljava/util/List;Lcom/tencent/imsdk/v2/V2TIMValueCallback;)V

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

.method public final deleteGroup(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 2

    .line 1
    .line 2
    const-string v0, "groupName"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 9
    move-result v0

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    if-eqz p2, :cond_0

    .line 14
    .line 15
    const/16 p1, 0x1781

    .line 16
    .line 17
    const-string v0, "Group name is empty"

    .line 18
    .line 19
    .line 20
    invoke-interface {p2, p1, v0}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onFailure(ILjava/lang/String;)V

    .line 21
    :cond_0
    return-void

    .line 22
    .line 23
    .line 24
    :cond_1
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getConversationManager()Lcom/tencent/imsdk/v2/V2TIMConversationManager;

    .line 25
    move-result-object v0

    .line 26
    .line 27
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/conversation/g;

    .line 28
    .line 29
    .line 30
    invoke-direct {v1, p0, p2, p1}, Lio/trtc/tuikit/atomicxcore/impl/conversation/g;-><init>(Lio/trtc/tuikit/atomicxcore/impl/conversation/j;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, p1, v1}, Lcom/tencent/imsdk/v2/V2TIMConversationManager;->deleteConversationGroup(Ljava/lang/String;Lcom/tencent/imsdk/v2/V2TIMCallback;)V

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
.end method

.method public final fetchGroupList(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 4

    .line 1
    .line 2
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/common/d;->e:Lio/trtc/tuikit/atomicxcore/impl/common/d;

    .line 3
    .line 4
    const-string v1, "componentType"

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    new-instance v0, Lorg/json/JSONObject;

    .line 10
    .line 11
    .line 12
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 13
    .line 14
    const/16 v1, 0x3ed

    .line 15
    int-to-long v1, v1

    .line 16
    .line 17
    const-string v3, "UIComponentType"

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v3, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    .line 27
    const-string/jumbo v1, "toString(...)"

    .line 28
    .line 29
    .line 30
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getInstance()Lcom/tencent/imsdk/v2/V2TIMManager;

    .line 34
    move-result-object v1

    .line 35
    .line 36
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/common/m;

    .line 37
    .line 38
    .line 39
    invoke-direct {v2}, Lio/trtc/tuikit/atomicxcore/impl/common/m;-><init>()V

    .line 40
    .line 41
    const-string v3, "reportTUIFeatureUsage"

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1, v3, v0, v2}, Lcom/tencent/imsdk/v2/V2TIMManager;->callExperimentalAPI(Ljava/lang/String;Ljava/lang/Object;Lcom/tencent/imsdk/v2/V2TIMValueCallback;)V

    .line 45
    .line 46
    .line 47
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getConversationManager()Lcom/tencent/imsdk/v2/V2TIMConversationManager;

    .line 48
    move-result-object v0

    .line 49
    .line 50
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/conversation/h;

    .line 51
    .line 52
    .line 53
    invoke-direct {v1, p0, p1}, Lio/trtc/tuikit/atomicxcore/impl/conversation/h;-><init>(Lio/trtc/tuikit/atomicxcore/impl/conversation/j;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, v1}, Lcom/tencent/imsdk/v2/V2TIMConversationManager;->getConversationGroupList(Lcom/tencent/imsdk/v2/V2TIMValueCallback;)V

    .line 57
    return-void
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

.method public final getConversationGroupState()Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationGroupState;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/conversation/j;->b:Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationGroupState;

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

.method public final renameGroup(Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 2

    .line 1
    .line 2
    const-string v0, "oldName"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "newName"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 14
    move-result v0

    .line 15
    .line 16
    const/16 v1, 0x1781

    .line 17
    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    if-eqz p3, :cond_1

    .line 21
    .line 22
    const-string p1, "Old group name is empty"

    .line 23
    .line 24
    .line 25
    invoke-interface {p3, v1, p1}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onFailure(ILjava/lang/String;)V

    .line 26
    return-void

    .line 27
    .line 28
    .line 29
    :cond_0
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    .line 30
    move-result v0

    .line 31
    .line 32
    if-nez v0, :cond_2

    .line 33
    .line 34
    if-eqz p3, :cond_1

    .line 35
    .line 36
    const-string p1, "New group name is empty"

    .line 37
    .line 38
    .line 39
    invoke-interface {p3, v1, p1}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onFailure(ILjava/lang/String;)V

    .line 40
    :cond_1
    return-void

    .line 41
    .line 42
    .line 43
    :cond_2
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getConversationManager()Lcom/tencent/imsdk/v2/V2TIMConversationManager;

    .line 44
    move-result-object v0

    .line 45
    .line 46
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/conversation/i;

    .line 47
    .line 48
    .line 49
    invoke-direct {v1, p0, p3, p1, p2}, Lio/trtc/tuikit/atomicxcore/impl/conversation/i;-><init>(Lio/trtc/tuikit/atomicxcore/impl/conversation/j;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;Ljava/lang/String;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, p1, p2, v1}, Lcom/tencent/imsdk/v2/V2TIMConversationManager;->renameConversationGroup(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/imsdk/v2/V2TIMCallback;)V

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
