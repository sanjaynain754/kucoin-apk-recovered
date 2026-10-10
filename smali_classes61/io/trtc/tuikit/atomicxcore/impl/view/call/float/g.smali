.class public final Lio/trtc/tuikit/atomicxcore/impl/view/call/float/g;
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
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/g;->a:Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;

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
    .locals 5

    .line 1
    .line 2
    check-cast p1, Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantInfo;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantInfo;->getStatus()Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantStatus;

    .line 6
    move-result-object p2

    .line 7
    .line 8
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantStatus;->Accept:Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantStatus;

    .line 9
    .line 10
    if-ne p2, v0, :cond_0

    .line 11
    .line 12
    iget-object p2, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/g;->a:Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;

    .line 13
    .line 14
    iget-object v1, p2, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->d:Lio/trtc/tuikit/atomicxcore/impl/view/call/x;

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    const/high16 v2, 0x42a00000    # 80.0f

    .line 19
    .line 20
    .line 21
    invoke-virtual {p2, v2}, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->a(F)I

    .line 22
    move-result p2

    .line 23
    .line 24
    iget-object v3, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/g;->a:Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v3, v2}, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->a(F)I

    .line 28
    move-result v2

    .line 29
    .line 30
    const/high16 v3, 0x41400000    # 12.0f

    .line 31
    const/4 v4, 0x1

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1, v4, p2, v2, v3}, Lio/trtc/tuikit/atomicxcore/impl/view/call/x;->a(ZIIF)V

    .line 35
    .line 36
    :cond_0
    sget-object p2, Lio/trtc/tuikit/atomicxcore/api/call/CallStore;->Companion:Lio/trtc/tuikit/atomicxcore/api/call/CallStore$Companion;

    .line 37
    .line 38
    .line 39
    invoke-static {p2}, Lio/trtc/tuikit/atomicxcore/api/view/b;->a(Lio/trtc/tuikit/atomicxcore/api/call/CallStore$Companion;)Ljava/lang/Object;

    .line 40
    move-result-object p2

    .line 41
    .line 42
    check-cast p2, Lio/trtc/tuikit/atomicxcore/api/call/CallInfo;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p2}, Lio/trtc/tuikit/atomicxcore/api/call/CallInfo;->getMediaType()Lio/trtc/tuikit/atomicxcore/api/call/CallMediaType;

    .line 46
    move-result-object p2

    .line 47
    .line 48
    sget-object v1, Lio/trtc/tuikit/atomicxcore/api/call/CallMediaType;->Audio:Lio/trtc/tuikit/atomicxcore/api/call/CallMediaType;

    .line 49
    .line 50
    if-ne p2, v1, :cond_1

    .line 51
    .line 52
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 53
    return-object p1

    .line 54
    .line 55
    .line 56
    :cond_1
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantInfo;->getStatus()Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantStatus;

    .line 57
    move-result-object p1

    .line 58
    .line 59
    if-ne p1, v0, :cond_4

    .line 60
    .line 61
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/g;->a:Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;

    .line 62
    .line 63
    iget-object p1, p1, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->j:Landroid/widget/FrameLayout;

    .line 64
    const/4 p2, 0x0

    .line 65
    .line 66
    if-nez p1, :cond_2

    .line 67
    .line 68
    .line 69
    const-string/jumbo p1, "smallVideoContainer"

    .line 70
    .line 71
    .line 72
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 73
    move-object p1, p2

    .line 74
    .line 75
    .line 76
    :cond_2
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 77
    move-result p1

    .line 78
    .line 79
    const/16 v0, 0x8

    .line 80
    .line 81
    if-ne p1, v0, :cond_4

    .line 82
    .line 83
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/g;->a:Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;

    .line 84
    const/4 v1, 0x0

    .line 85
    .line 86
    .line 87
    invoke-virtual {p1, v1}, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->a(Z)V

    .line 88
    .line 89
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/g;->a:Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;

    .line 90
    .line 91
    .line 92
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->c()V

    .line 93
    .line 94
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/g;->a:Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;

    .line 95
    .line 96
    .line 97
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->e()V

    .line 98
    .line 99
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/g;->a:Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;

    .line 100
    .line 101
    .line 102
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->d()V

    .line 103
    .line 104
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/g;->a:Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;

    .line 105
    .line 106
    iget-object p1, p1, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->m:Landroid/widget/ImageView;

    .line 107
    .line 108
    if-nez p1, :cond_3

    .line 109
    .line 110
    const-string p1, "imageBackground"

    .line 111
    .line 112
    .line 113
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 114
    goto :goto_0

    .line 115
    :cond_3
    move-object p2, p1

    .line 116
    .line 117
    .line 118
    :goto_0
    invoke-virtual {p2, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 119
    .line 120
    :cond_4
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 121
    return-object p1
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
