.class public final Lio/trtc/tuikit/atomicxcore/impl/view/call/g;
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
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/g;->a:Lio/trtc/tuikit/atomicxcore/impl/view/call/x;

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
    .locals 4

    .line 1
    .line 2
    check-cast p1, Ljava/util/Map;

    .line 3
    .line 4
    iget-object p2, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/g;->a:Lio/trtc/tuikit/atomicxcore/impl/view/call/x;

    .line 5
    .line 6
    iget-object p2, p2, Lio/trtc/tuikit/atomicxcore/impl/view/call/x;->l:Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantInfo;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p2}, Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantInfo;->getId()Ljava/lang/String;

    .line 10
    move-result-object p2

    .line 11
    .line 12
    .line 13
    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    move-result-object p1

    .line 15
    .line 16
    check-cast p1, Lio/trtc/tuikit/atomicxcore/api/device/NetworkQuality;

    .line 17
    .line 18
    if-eqz p1, :cond_5

    .line 19
    .line 20
    iget-object p2, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/g;->a:Lio/trtc/tuikit/atomicxcore/impl/view/call/x;

    .line 21
    .line 22
    iget-object v0, p2, Lio/trtc/tuikit/atomicxcore/impl/view/call/x;->p:Ljava/util/Map;

    .line 23
    .line 24
    .line 25
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    move-result-object p1

    .line 27
    .line 28
    check-cast p1, Ljava/lang/String;

    .line 29
    const/4 v0, 0x0

    .line 30
    .line 31
    const-string v1, "imageNetworkBad"

    .line 32
    .line 33
    if-eqz p1, :cond_3

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 37
    move-result v2

    .line 38
    .line 39
    if-nez v2, :cond_0

    .line 40
    goto :goto_1

    .line 41
    .line 42
    :cond_0
    iget-object v2, p2, Lio/trtc/tuikit/atomicxcore/impl/view/call/x;->d:Lio/trtc/tuikit/atomicxcore/impl/view/call/B;

    .line 43
    .line 44
    iget-object v3, p2, Lio/trtc/tuikit/atomicxcore/impl/view/call/x;->i:Landroid/widget/ImageView;

    .line 45
    .line 46
    if-nez v3, :cond_1

    .line 47
    .line 48
    .line 49
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 50
    move-object v3, v0

    .line 51
    .line 52
    .line 53
    :cond_1
    invoke-virtual {v2, v3, p1}, Lio/trtc/tuikit/atomicxcore/impl/view/call/B;->a(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 54
    .line 55
    iget-object p1, p2, Lio/trtc/tuikit/atomicxcore/impl/view/call/x;->i:Landroid/widget/ImageView;

    .line 56
    .line 57
    if-nez p1, :cond_2

    .line 58
    .line 59
    .line 60
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 61
    goto :goto_0

    .line 62
    :cond_2
    move-object v0, p1

    .line 63
    :goto_0
    const/4 p1, 0x0

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 67
    goto :goto_3

    .line 68
    .line 69
    :cond_3
    :goto_1
    iget-object p1, p2, Lio/trtc/tuikit/atomicxcore/impl/view/call/x;->i:Landroid/widget/ImageView;

    .line 70
    .line 71
    if-nez p1, :cond_4

    .line 72
    .line 73
    .line 74
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 75
    goto :goto_2

    .line 76
    :cond_4
    move-object v0, p1

    .line 77
    .line 78
    :goto_2
    const/16 p1, 0x8

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 82
    .line 83
    :cond_5
    :goto_3
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 84
    return-object p1
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
