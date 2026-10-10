.class public final Lio/trtc/tuikit/atomicxcore/impl/conversation/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/tencent/imsdk/v2/V2TIMValueCallback;


# instance fields
.field public final synthetic a:Lio/trtc/tuikit/atomicxcore/impl/conversation/E;

.field public final synthetic b:Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationListFilter;

.field public final synthetic c:Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;


# direct methods
.method public constructor <init>(Lio/trtc/tuikit/atomicxcore/impl/conversation/E;Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationListFilter;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/conversation/y;->a:Lio/trtc/tuikit/atomicxcore/impl/conversation/E;

    .line 3
    .line 4
    iput-object p2, p0, Lio/trtc/tuikit/atomicxcore/impl/conversation/y;->b:Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationListFilter;

    .line 5
    .line 6
    iput-object p3, p0, Lio/trtc/tuikit/atomicxcore/impl/conversation/y;->c:Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;

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
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/conversation/y;->c:Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    if-nez p2, :cond_0

    .line 7
    .line 8
    const-string p2, "Unknown error"

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
    .locals 4

    .line 1
    .line 2
    check-cast p1, Ljava/lang/Number;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 6
    move-result-wide v0

    .line 7
    .line 8
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/conversation/y;->a:Lio/trtc/tuikit/atomicxcore/impl/conversation/E;

    .line 9
    .line 10
    iput-wide v0, p1, Lio/trtc/tuikit/atomicxcore/impl/conversation/E;->j:J

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/impl/conversation/E;->a()V

    .line 14
    .line 15
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/conversation/y;->a:Lio/trtc/tuikit/atomicxcore/impl/conversation/E;

    .line 16
    .line 17
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/conversation/y;->b:Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationListFilter;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    new-instance v1, Lcom/tencent/imsdk/v2/V2TIMConversationListFilter;

    .line 23
    .line 24
    .line 25
    invoke-direct {v1}, Lcom/tencent/imsdk/v2/V2TIMConversationListFilter;-><init>()V

    .line 26
    .line 27
    if-nez v0, :cond_0

    .line 28
    goto :goto_0

    .line 29
    .line 30
    .line 31
    :cond_0
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationListFilter;->getType()Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationType;

    .line 32
    move-result-object v2

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationType;->getValue()I

    .line 36
    move-result v2

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1, v2}, Lcom/tencent/imsdk/v2/V2TIMConversationListFilter;->setConversationType(I)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationListFilter;->getConversationGroup()Ljava/lang/String;

    .line 43
    move-result-object v2

    .line 44
    .line 45
    if-eqz v2, :cond_1

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1, v2}, Lcom/tencent/imsdk/v2/V2TIMConversationListFilter;->setConversationGroup(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    :cond_1
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationListFilter;->getMarkType()Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationMarkType;

    .line 52
    move-result-object v2

    .line 53
    .line 54
    if-eqz v2, :cond_2

    .line 55
    .line 56
    .line 57
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationMarkType;->getValue()J

    .line 58
    move-result-wide v2

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1, v2, v3}, Lcom/tencent/imsdk/v2/V2TIMConversationListFilter;->setMarkType(J)V

    .line 62
    .line 63
    .line 64
    :cond_2
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationListFilter;->getHasUnreadCount()Ljava/lang/Boolean;

    .line 65
    move-result-object v2

    .line 66
    .line 67
    if-eqz v2, :cond_3

    .line 68
    .line 69
    .line 70
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 71
    move-result v2

    .line 72
    .line 73
    .line 74
    invoke-virtual {v1, v2}, Lcom/tencent/imsdk/v2/V2TIMConversationListFilter;->setHasUnreadCount(Z)V

    .line 75
    .line 76
    .line 77
    :cond_3
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationListFilter;->getHasGroupAtInfo()Ljava/lang/Boolean;

    .line 78
    move-result-object v2

    .line 79
    .line 80
    if-eqz v2, :cond_4

    .line 81
    .line 82
    .line 83
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 84
    move-result v2

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1, v2}, Lcom/tencent/imsdk/v2/V2TIMConversationListFilter;->setHasGroupAtInfo(Z)V

    .line 88
    .line 89
    :cond_4
    :goto_0
    iput-object v0, p1, Lio/trtc/tuikit/atomicxcore/impl/conversation/E;->k:Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationListFilter;

    .line 90
    .line 91
    .line 92
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getConversationManager()Lcom/tencent/imsdk/v2/V2TIMConversationManager;

    .line 93
    move-result-object p1

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1, v1}, Lcom/tencent/imsdk/v2/V2TIMConversationManager;->subscribeUnreadMessageCountByFilter(Lcom/tencent/imsdk/v2/V2TIMConversationListFilter;)V

    .line 97
    .line 98
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/conversation/y;->c:Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;

    .line 99
    .line 100
    if-eqz p1, :cond_5

    .line 101
    .line 102
    .line 103
    invoke-interface {p1}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onSuccess()V

    .line 104
    :cond_5
    return-void
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
