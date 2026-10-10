.class public final Lio/trtc/tuikit/atomicxcore/impl/contact/G;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/tencent/imsdk/v2/V2TIMValueCallback;


# instance fields
.field public final synthetic a:Lio/trtc/tuikit/atomicxcore/impl/contact/O;

.field public final synthetic b:Lcom/tencent/imsdk/v2/V2TIMUserFullInfo;

.field public final synthetic c:Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;


# direct methods
.method public constructor <init>(Lio/trtc/tuikit/atomicxcore/impl/contact/O;Lcom/tencent/imsdk/v2/V2TIMUserFullInfo;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/contact/G;->a:Lio/trtc/tuikit/atomicxcore/impl/contact/O;

    .line 3
    .line 4
    iput-object p2, p0, Lio/trtc/tuikit/atomicxcore/impl/contact/G;->b:Lcom/tencent/imsdk/v2/V2TIMUserFullInfo;

    .line 5
    .line 6
    iput-object p3, p0, Lio/trtc/tuikit/atomicxcore/impl/contact/G;->c:Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;

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
    .locals 10

    .line 1
    .line 2
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/contact/G;->a:Lio/trtc/tuikit/atomicxcore/impl/contact/O;

    .line 3
    .line 4
    iget-object p1, p1, Lio/trtc/tuikit/atomicxcore/impl/contact/O;->h:Lkotlinx/coroutines/flow/n;

    .line 5
    .line 6
    iget-object p2, p0, Lio/trtc/tuikit/atomicxcore/impl/contact/G;->b:Lcom/tencent/imsdk/v2/V2TIMUserFullInfo;

    .line 7
    .line 8
    new-instance v0, Lio/trtc/tuikit/atomicxcore/api/contact/ContactInfo;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p2}, Lcom/tencent/imsdk/v2/V2TIMUserInfo;->getUserID()Ljava/lang/String;

    .line 12
    move-result-object v1

    .line 13
    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    const-string v1, ""

    .line 17
    .line 18
    :cond_0
    sget-object v2, Lio/trtc/tuikit/atomicxcore/api/contact/ContactType;->USER:Lio/trtc/tuikit/atomicxcore/api/contact/ContactType;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p2}, Lcom/tencent/imsdk/v2/V2TIMUserInfo;->getFaceUrl()Ljava/lang/String;

    .line 22
    move-result-object v3

    .line 23
    .line 24
    .line 25
    invoke-virtual {p2}, Lcom/tencent/imsdk/v2/V2TIMUserInfo;->getNickName()Ljava/lang/String;

    .line 26
    move-result-object v4

    .line 27
    .line 28
    if-nez v4, :cond_1

    .line 29
    .line 30
    .line 31
    invoke-virtual {p2}, Lcom/tencent/imsdk/v2/V2TIMUserInfo;->getUserID()Ljava/lang/String;

    .line 32
    move-result-object v4

    .line 33
    .line 34
    :cond_1
    const/16 v8, 0x70

    .line 35
    const/4 v9, 0x0

    .line 36
    const/4 v5, 0x0

    .line 37
    const/4 v6, 0x0

    .line 38
    const/4 v7, 0x0

    .line 39
    .line 40
    .line 41
    invoke-direct/range {v0 .. v9}, Lio/trtc/tuikit/atomicxcore/api/contact/ContactInfo;-><init>(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/contact/ContactType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lio/trtc/tuikit/atomicxcore/api/contact/ContactOnlineStatus;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 42
    .line 43
    .line 44
    invoke-interface {p1, v0}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 45
    .line 46
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/contact/G;->c:Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;

    .line 47
    .line 48
    if-eqz p1, :cond_2

    .line 49
    .line 50
    .line 51
    invoke-interface {p1}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onSuccess()V

    .line 52
    :cond_2
    return-void
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

.method public final onSuccess(Ljava/lang/Object;)V
    .locals 12

    .line 1
    .line 2
    check-cast p1, Ljava/util/List;

    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 8
    move-result-object p1

    .line 9
    .line 10
    check-cast p1, Lcom/tencent/imsdk/v2/V2TIMFriendCheckResult;

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p1, 0x0

    .line 13
    .line 14
    :goto_0
    if-eqz p1, :cond_1

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Lcom/tencent/imsdk/v2/V2TIMFriendCheckResult;->getResultType()I

    .line 18
    move-result p1

    .line 19
    const/4 v0, 0x3

    .line 20
    .line 21
    if-ne p1, v0, :cond_1

    .line 22
    const/4 p1, 0x1

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    const/4 p1, 0x0

    .line 25
    .line 26
    :goto_1
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/contact/G;->a:Lio/trtc/tuikit/atomicxcore/impl/contact/O;

    .line 27
    .line 28
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/impl/contact/O;->h:Lkotlinx/coroutines/flow/n;

    .line 29
    .line 30
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/contact/G;->b:Lcom/tencent/imsdk/v2/V2TIMUserFullInfo;

    .line 31
    .line 32
    new-instance v2, Lio/trtc/tuikit/atomicxcore/api/contact/ContactInfo;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1}, Lcom/tencent/imsdk/v2/V2TIMUserInfo;->getUserID()Ljava/lang/String;

    .line 36
    move-result-object v3

    .line 37
    .line 38
    if-nez v3, :cond_2

    .line 39
    .line 40
    const-string v3, ""

    .line 41
    .line 42
    :cond_2
    sget-object v4, Lio/trtc/tuikit/atomicxcore/api/contact/ContactType;->USER:Lio/trtc/tuikit/atomicxcore/api/contact/ContactType;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1}, Lcom/tencent/imsdk/v2/V2TIMUserInfo;->getFaceUrl()Ljava/lang/String;

    .line 46
    move-result-object v5

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1}, Lcom/tencent/imsdk/v2/V2TIMUserInfo;->getNickName()Ljava/lang/String;

    .line 50
    move-result-object v6

    .line 51
    .line 52
    if-nez v6, :cond_3

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1}, Lcom/tencent/imsdk/v2/V2TIMUserInfo;->getUserID()Ljava/lang/String;

    .line 56
    move-result-object v6

    .line 57
    .line 58
    :cond_3
    const/16 v10, 0x70

    .line 59
    const/4 v11, 0x0

    .line 60
    const/4 v7, 0x0

    .line 61
    const/4 v8, 0x0

    .line 62
    const/4 v9, 0x0

    .line 63
    .line 64
    .line 65
    invoke-direct/range {v2 .. v11}, Lio/trtc/tuikit/atomicxcore/api/contact/ContactInfo;-><init>(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/contact/ContactType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lio/trtc/tuikit/atomicxcore/api/contact/ContactOnlineStatus;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 66
    .line 67
    .line 68
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 69
    move-result-object p1

    .line 70
    .line 71
    .line 72
    invoke-virtual {v2, p1}, Lio/trtc/tuikit/atomicxcore/api/contact/ContactInfo;->setContact(Ljava/lang/Boolean;)V

    .line 73
    .line 74
    .line 75
    invoke-interface {v0, v2}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 76
    .line 77
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/contact/G;->c:Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;

    .line 78
    .line 79
    if-eqz p1, :cond_4

    .line 80
    .line 81
    .line 82
    invoke-interface {p1}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onSuccess()V

    .line 83
    :cond_4
    return-void
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
