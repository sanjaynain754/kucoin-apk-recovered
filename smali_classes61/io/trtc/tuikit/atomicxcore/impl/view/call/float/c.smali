.class public final Lio/trtc/tuikit/atomicxcore/impl/view/call/float/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/coroutines/flow/f;


# instance fields
.field public final synthetic a:Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;


# direct methods
.method public constructor <init>(Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/c;->a:Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;

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
    .locals 1

    .line 1
    .line 2
    check-cast p1, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;

    .line 3
    .line 4
    sget-object p2, Lio/trtc/tuikit/atomicxcore/api/call/CallStore;->Companion:Lio/trtc/tuikit/atomicxcore/api/call/CallStore$Companion;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2}, Lio/trtc/tuikit/atomicxcore/api/call/CallStore$Companion;->getShared()Lio/trtc/tuikit/atomicxcore/api/call/CallStore;

    .line 8
    move-result-object p2

    .line 9
    .line 10
    .line 11
    invoke-virtual {p2}, Lio/trtc/tuikit/atomicxcore/api/call/CallStore;->getObserverState()Lio/trtc/tuikit/atomicxcore/api/call/CallState;

    .line 12
    move-result-object p2

    .line 13
    .line 14
    .line 15
    invoke-virtual {p2}, Lio/trtc/tuikit/atomicxcore/api/call/CallState;->getSelfInfo()Lkotlinx/coroutines/flow/w;

    .line 16
    move-result-object p2

    .line 17
    .line 18
    .line 19
    invoke-interface {p2}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 20
    move-result-object p2

    .line 21
    .line 22
    check-cast p2, Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantInfo;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p2}, Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantInfo;->getStatus()Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantStatus;

    .line 26
    move-result-object p2

    .line 27
    .line 28
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantStatus;->Accept:Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantStatus;

    .line 29
    .line 30
    if-ne p2, v0, :cond_0

    .line 31
    .line 32
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 33
    return-object p1

    .line 34
    .line 35
    :cond_0
    sget-object p2, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;->OFF:Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;

    .line 36
    const/4 v0, 0x0

    .line 37
    .line 38
    if-ne p1, p2, :cond_1

    .line 39
    const/4 p1, 0x1

    .line 40
    goto :goto_0

    .line 41
    :cond_1
    move p1, v0

    .line 42
    .line 43
    :goto_0
    iget-object p2, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/c;->a:Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;

    .line 44
    .line 45
    iget-object p2, p2, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->m:Landroid/widget/ImageView;

    .line 46
    .line 47
    if-nez p2, :cond_2

    .line 48
    .line 49
    const-string p2, "imageBackground"

    .line 50
    .line 51
    .line 52
    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 53
    const/4 p2, 0x0

    .line 54
    .line 55
    :cond_2
    if-eqz p1, :cond_3

    .line 56
    goto :goto_1

    .line 57
    .line 58
    :cond_3
    const/16 v0, 0x8

    .line 59
    .line 60
    .line 61
    :goto_1
    invoke-virtual {p2, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 62
    .line 63
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 64
    return-object p1
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
