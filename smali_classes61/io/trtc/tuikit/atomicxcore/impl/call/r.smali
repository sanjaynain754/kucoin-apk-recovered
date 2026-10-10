.class public final Lio/trtc/tuikit/atomicxcore/impl/call/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/coroutines/flow/f;


# instance fields
.field public final synthetic a:Lio/trtc/tuikit/atomicxcore/impl/call/w;


# direct methods
.method public constructor <init>(Lio/trtc/tuikit/atomicxcore/impl/call/w;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/call/r;->a:Lio/trtc/tuikit/atomicxcore/impl/call/w;

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
    .locals 11

    .line 1
    .line 2
    check-cast p1, Lio/trtc/tuikit/atomicxcore/api/login/UserProfile;

    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 7
    return-object p1

    .line 8
    .line 9
    :cond_0
    iget-object p2, p0, Lio/trtc/tuikit/atomicxcore/impl/call/r;->a:Lio/trtc/tuikit/atomicxcore/impl/call/w;

    .line 10
    .line 11
    iget-object p2, p2, Lio/trtc/tuikit/atomicxcore/impl/call/w;->f:Lkotlinx/coroutines/flow/n;

    .line 12
    .line 13
    .line 14
    invoke-interface {p2}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 15
    move-result-object p2

    .line 16
    .line 17
    check-cast p2, Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantInfo;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p2}, Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantInfo;->getId()Ljava/lang/String;

    .line 21
    move-result-object p2

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/login/UserProfile;->getUserID()Ljava/lang/String;

    .line 25
    move-result-object v0

    .line 26
    .line 27
    .line 28
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    move-result p2

    .line 30
    .line 31
    if-eqz p2, :cond_1

    .line 32
    .line 33
    iget-object p2, p0, Lio/trtc/tuikit/atomicxcore/impl/call/r;->a:Lio/trtc/tuikit/atomicxcore/impl/call/w;

    .line 34
    .line 35
    iget-object p2, p2, Lio/trtc/tuikit/atomicxcore/impl/call/w;->f:Lkotlinx/coroutines/flow/n;

    .line 36
    .line 37
    .line 38
    invoke-interface {p2}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 39
    move-result-object p2

    .line 40
    .line 41
    check-cast p2, Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantInfo;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p2}, Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantInfo;->getName()Ljava/lang/String;

    .line 45
    move-result-object p2

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/login/UserProfile;->getNickname()Ljava/lang/String;

    .line 49
    move-result-object v0

    .line 50
    .line 51
    .line 52
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 53
    move-result p2

    .line 54
    .line 55
    if-eqz p2, :cond_1

    .line 56
    .line 57
    iget-object p2, p0, Lio/trtc/tuikit/atomicxcore/impl/call/r;->a:Lio/trtc/tuikit/atomicxcore/impl/call/w;

    .line 58
    .line 59
    iget-object p2, p2, Lio/trtc/tuikit/atomicxcore/impl/call/w;->f:Lkotlinx/coroutines/flow/n;

    .line 60
    .line 61
    .line 62
    invoke-interface {p2}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 63
    move-result-object p2

    .line 64
    .line 65
    check-cast p2, Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantInfo;

    .line 66
    .line 67
    .line 68
    invoke-virtual {p2}, Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantInfo;->getAvatarUrl()Ljava/lang/String;

    .line 69
    move-result-object p2

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/login/UserProfile;->getAvatarURL()Ljava/lang/String;

    .line 73
    move-result-object v0

    .line 74
    .line 75
    .line 76
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 77
    move-result p2

    .line 78
    .line 79
    if-nez p2, :cond_5

    .line 80
    .line 81
    :cond_1
    new-instance p2, Ljava/lang/StringBuilder;

    .line 82
    .line 83
    const-string v0, "self info changed, id:"

    .line 84
    .line 85
    .line 86
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/login/UserProfile;->getUserID()Ljava/lang/String;

    .line 90
    move-result-object v0

    .line 91
    .line 92
    .line 93
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    const-string v0, " name:"

    .line 96
    .line 97
    .line 98
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/login/UserProfile;->getNickname()Ljava/lang/String;

    .line 102
    move-result-object v0

    .line 103
    .line 104
    .line 105
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    const-string v0, " avatar:"

    .line 108
    .line 109
    .line 110
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/login/UserProfile;->getAvatarURL()Ljava/lang/String;

    .line 114
    move-result-object v0

    .line 115
    .line 116
    .line 117
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 121
    move-result-object p2

    .line 122
    .line 123
    const-string v0, "message"

    .line 124
    .line 125
    .line 126
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 127
    const/4 v0, 0x0

    .line 128
    .line 129
    .line 130
    invoke-static {v0, p2}, Lio/trtc/tuikit/atomicxcore/impl/call/x;->a(ILjava/lang/String;)V

    .line 131
    .line 132
    iget-object p2, p0, Lio/trtc/tuikit/atomicxcore/impl/call/r;->a:Lio/trtc/tuikit/atomicxcore/impl/call/w;

    .line 133
    .line 134
    iget-object p2, p2, Lio/trtc/tuikit/atomicxcore/impl/call/w;->f:Lkotlinx/coroutines/flow/n;

    .line 135
    .line 136
    .line 137
    :cond_2
    invoke-interface {p2}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 138
    move-result-object v0

    .line 139
    move-object v1, v0

    .line 140
    .line 141
    check-cast v1, Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantInfo;

    .line 142
    .line 143
    .line 144
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/login/UserProfile;->getUserID()Ljava/lang/String;

    .line 145
    move-result-object v2

    .line 146
    .line 147
    .line 148
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/login/UserProfile;->getNickname()Ljava/lang/String;

    .line 149
    move-result-object v3

    .line 150
    .line 151
    if-nez v3, :cond_3

    .line 152
    .line 153
    .line 154
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/login/UserProfile;->getUserID()Ljava/lang/String;

    .line 155
    move-result-object v3

    .line 156
    .line 157
    .line 158
    :cond_3
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/login/UserProfile;->getAvatarURL()Ljava/lang/String;

    .line 159
    move-result-object v4

    .line 160
    .line 161
    if-nez v4, :cond_4

    .line 162
    .line 163
    const-string v4, ""

    .line 164
    .line 165
    :cond_4
    const/16 v9, 0x78

    .line 166
    const/4 v10, 0x0

    .line 167
    const/4 v5, 0x0

    .line 168
    const/4 v6, 0x0

    .line 169
    const/4 v7, 0x0

    .line 170
    const/4 v8, 0x0

    .line 171
    .line 172
    .line 173
    invoke-static/range {v1 .. v10}, Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantInfo;->copy$default(Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantStatus;ZZILjava/lang/Object;)Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantInfo;

    .line 174
    move-result-object v1

    .line 175
    .line 176
    .line 177
    invoke-interface {p2, v0, v1}, Lkotlinx/coroutines/flow/n;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 178
    move-result v0

    .line 179
    .line 180
    if-eqz v0, :cond_2

    .line 181
    .line 182
    :cond_5
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 183
    return-object p1
    .line 184
    .line 185
    .line 186
.end method
