.class public final Lio/trtc/tuikit/atomicxcore/impl/contact/V;
.super Lcom/tencent/imsdk/v2/V2TIMConversationListener;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lio/trtc/tuikit/atomicxcore/impl/contact/G0;


# direct methods
.method public constructor <init>(Lio/trtc/tuikit/atomicxcore/impl/contact/G0;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/contact/V;->a:Lio/trtc/tuikit/atomicxcore/impl/contact/G0;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Lcom/tencent/imsdk/v2/V2TIMConversationListener;-><init>()V

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


# virtual methods
.method public final onConversationChanged(Ljava/util/List;)V
    .locals 5

    .line 1
    .line 2
    const-string v0, "conversationList"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/contact/V;->a:Lio/trtc/tuikit/atomicxcore/impl/contact/G0;

    .line 8
    .line 9
    .line 10
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 11
    move-result-object p1

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    move-result v1

    .line 16
    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    .line 20
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    move-result-object v1

    .line 22
    move-object v2, v1

    .line 23
    .line 24
    check-cast v2, Lcom/tencent/imsdk/v2/V2TIMConversation;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2}, Lcom/tencent/imsdk/v2/V2TIMConversation;->getConversationID()Ljava/lang/String;

    .line 28
    move-result-object v2

    .line 29
    .line 30
    new-instance v3, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    const-string v4, "group_"

    .line 33
    .line 34
    .line 35
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    iget-object v4, v0, Lio/trtc/tuikit/atomicxcore/impl/contact/G0;->a:Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    move-result-object v3

    .line 45
    .line 46
    .line 47
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 48
    move-result v2

    .line 49
    .line 50
    if-eqz v2, :cond_0

    .line 51
    goto :goto_0

    .line 52
    :cond_1
    const/4 v1, 0x0

    .line 53
    .line 54
    :goto_0
    check-cast v1, Lcom/tencent/imsdk/v2/V2TIMConversation;

    .line 55
    .line 56
    if-eqz v1, :cond_3

    .line 57
    .line 58
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/contact/V;->a:Lio/trtc/tuikit/atomicxcore/impl/contact/G0;

    .line 59
    .line 60
    iget-object v0, p1, Lio/trtc/tuikit/atomicxcore/impl/contact/G0;->i:Lkotlinx/coroutines/flow/n;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v1}, Lcom/tencent/imsdk/v2/V2TIMConversation;->isPinned()Z

    .line 64
    move-result v2

    .line 65
    .line 66
    .line 67
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 68
    move-result-object v2

    .line 69
    .line 70
    .line 71
    invoke-interface {v0, v2}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 72
    .line 73
    iget-object v0, p1, Lio/trtc/tuikit/atomicxcore/impl/contact/G0;->g:Lkotlinx/coroutines/flow/n;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v1}, Lcom/tencent/imsdk/v2/V2TIMConversation;->getRecvOpt()I

    .line 77
    move-result v2

    .line 78
    const/4 v3, 0x2

    .line 79
    .line 80
    if-ne v2, v3, :cond_2

    .line 81
    const/4 v2, 0x1

    .line 82
    goto :goto_1

    .line 83
    :cond_2
    const/4 v2, 0x0

    .line 84
    .line 85
    .line 86
    :goto_1
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 87
    move-result-object v2

    .line 88
    .line 89
    .line 90
    invoke-interface {v0, v2}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 91
    .line 92
    iget-object p1, p1, Lio/trtc/tuikit/atomicxcore/impl/contact/G0;->s:Lkotlinx/coroutines/flow/n;

    .line 93
    .line 94
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/contact/ReceiveMessageOpt;->Companion:Lio/trtc/tuikit/atomicxcore/api/contact/ReceiveMessageOpt$Companion;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v1}, Lcom/tencent/imsdk/v2/V2TIMConversation;->getRecvOpt()I

    .line 98
    move-result v1

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0, v1}, Lio/trtc/tuikit/atomicxcore/api/contact/ReceiveMessageOpt$Companion;->parse(I)Lio/trtc/tuikit/atomicxcore/api/contact/ReceiveMessageOpt;

    .line 102
    move-result-object v0

    .line 103
    .line 104
    .line 105
    invoke-interface {p1, v0}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 106
    :cond_3
    return-void
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
