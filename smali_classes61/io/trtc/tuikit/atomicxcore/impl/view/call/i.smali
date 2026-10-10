.class public final Lio/trtc/tuikit/atomicxcore/impl/view/call/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/coroutines/flow/f;


# instance fields
.field public final synthetic a:Lio/trtc/tuikit/atomicxcore/impl/view/call/x;


# direct methods
.method public constructor <init>(Lio/trtc/tuikit/atomicxcore/impl/view/call/x;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/i;->a:Lio/trtc/tuikit/atomicxcore/impl/view/call/x;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.method public final emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3

    .line 1
    .line 2
    check-cast p1, Ljava/util/LinkedHashSet;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    .line 9
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    move-result p2

    .line 11
    .line 12
    if-eqz p2, :cond_1

    .line 13
    .line 14
    .line 15
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    move-result-object p2

    .line 17
    .line 18
    check-cast p2, Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantInfo;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p2}, Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantInfo;->getId()Ljava/lang/String;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/i;->a:Lio/trtc/tuikit/atomicxcore/impl/view/call/x;

    .line 25
    .line 26
    iget-object v1, v1, Lio/trtc/tuikit/atomicxcore/impl/view/call/x;->l:Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantInfo;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantInfo;->getId()Ljava/lang/String;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    .line 33
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    move-result v0

    .line 35
    .line 36
    if-eqz v0, :cond_0

    .line 37
    .line 38
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/i;->a:Lio/trtc/tuikit/atomicxcore/impl/view/call/x;

    .line 39
    .line 40
    .line 41
    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 42
    .line 43
    iget-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/view/call/x;->l:Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantInfo;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p2}, Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantInfo;->getStatus()Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantStatus;

    .line 47
    move-result-object v2

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1, v2}, Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantInfo;->setStatus(Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantStatus;)V

    .line 51
    .line 52
    iget-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/view/call/x;->l:Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantInfo;

    .line 53
    .line 54
    .line 55
    invoke-virtual {p2}, Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantInfo;->getRemark()Ljava/lang/String;

    .line 56
    move-result-object v2

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1, v2}, Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantInfo;->setRemark(Ljava/lang/String;)V

    .line 60
    .line 61
    iget-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/view/call/x;->l:Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantInfo;

    .line 62
    .line 63
    .line 64
    invoke-virtual {p2}, Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantInfo;->getName()Ljava/lang/String;

    .line 65
    move-result-object v2

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1, v2}, Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantInfo;->setName(Ljava/lang/String;)V

    .line 69
    .line 70
    iget-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/view/call/x;->l:Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantInfo;

    .line 71
    .line 72
    .line 73
    invoke-virtual {p2}, Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantInfo;->isCameraOpened()Z

    .line 74
    move-result v2

    .line 75
    .line 76
    .line 77
    invoke-virtual {v1, v2}, Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantInfo;->setCameraOpened(Z)V

    .line 78
    .line 79
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/impl/view/call/x;->l:Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantInfo;

    .line 80
    .line 81
    .line 82
    invoke-virtual {p2}, Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantInfo;->isMicrophoneOpened()Z

    .line 83
    move-result p2

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0, p2}, Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantInfo;->setMicrophoneOpened(Z)V

    .line 87
    .line 88
    iget-object p2, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/i;->a:Lio/trtc/tuikit/atomicxcore/impl/view/call/x;

    .line 89
    .line 90
    .line 91
    invoke-virtual {p2}, Lio/trtc/tuikit/atomicxcore/impl/view/call/x;->c()V

    .line 92
    goto :goto_0

    .line 93
    .line 94
    :cond_1
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 95
    return-object p1
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
.end method
