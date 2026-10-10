.class public Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl;
.super Lcom/tencent/imsdk/v2/V2TIMConversationManager;
.source "V2TIMConversationManagerImpl.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl$V2TIMConversationManagerImplHolder;
    }
.end annotation


# instance fields
.field private mConversationListener:Lcom/tencent/imsdk/conversation/ConversationListener;

.field private mV2TIMConversationListener:Lcom/tencent/imsdk/v2/V2TIMConversationListener;

.field private final mV2TIMConversationListenerList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/tencent/imsdk/v2/V2TIMConversationListener;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 2
    invoke-direct {p0}, Lcom/tencent/imsdk/v2/V2TIMConversationManager;-><init>()V

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl;->mV2TIMConversationListenerList:Ljava/util/List;

    .line 4
    invoke-direct {p0}, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl;->initListener()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl$1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl;-><init>()V

    return-void
.end method

.method public static synthetic access$200(Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl;)Ljava/util/List;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl;->mV2TIMConversationListenerList:Ljava/util/List;

    .line 3
    return-object p0
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
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public static synthetic access$300(Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl;)Lcom/tencent/imsdk/v2/V2TIMConversationListener;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl;->mV2TIMConversationListener:Lcom/tencent/imsdk/v2/V2TIMConversationListener;

    .line 3
    return-object p0
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
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public static synthetic access$302(Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl;Lcom/tencent/imsdk/v2/V2TIMConversationListener;)Lcom/tencent/imsdk/v2/V2TIMConversationListener;
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl;->mV2TIMConversationListener:Lcom/tencent/imsdk/v2/V2TIMConversationListener;

    .line 3
    return-object p1
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
.end method

.method public static getInstance()Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl$V2TIMConversationManagerImplHolder;->access$100()Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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
.end method

.method private initListener()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl;->mConversationListener:Lcom/tencent/imsdk/conversation/ConversationListener;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl$1;

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, p0}, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl$1;-><init>(Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl;)V

    .line 10
    .line 11
    iput-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl;->mConversationListener:Lcom/tencent/imsdk/conversation/ConversationListener;

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-static {}, Lcom/tencent/imsdk/conversation/ConversationManager;->getInstance()Lcom/tencent/imsdk/conversation/ConversationManager;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    iget-object v1, p0, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl;->mConversationListener:Lcom/tencent/imsdk/conversation/ConversationListener;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Lcom/tencent/imsdk/conversation/ConversationManager;->setConversationListener(Lcom/tencent/imsdk/conversation/ConversationListener;)V

    .line 21
    return-void
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
.end method


# virtual methods
.method public addConversationListener(Lcom/tencent/imsdk/v2/V2TIMConversationListener;)V
    .locals 2

    .line 1
    .line 2
    if-nez p1, :cond_0

    .line 3
    return-void

    .line 4
    .line 5
    .line 6
    :cond_0
    invoke-static {}, Lcom/tencent/imsdk/common/IMContext;->getInstance()Lcom/tencent/imsdk/common/IMContext;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    new-instance v1, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl$3;

    .line 10
    .line 11
    .line 12
    invoke-direct {v1, p0, p1}, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl$3;-><init>(Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl;Lcom/tencent/imsdk/v2/V2TIMConversationListener;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Lcom/tencent/imsdk/common/IMContext;->runOnMainThread(Ljava/lang/Runnable;)V

    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public addConversationsToGroup(Ljava/lang/String;Ljava/util/List;Lcom/tencent/imsdk/v2/V2TIMValueCallback;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/tencent/imsdk/v2/V2TIMValueCallback<",
            "Ljava/util/List<",
            "Lcom/tencent/imsdk/v2/V2TIMConversationOperationResult;",
            ">;>;)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    const/16 v1, 0x1781

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    if-eqz p3, :cond_4

    .line 11
    .line 12
    const-string p1, "groupName is empty"

    .line 13
    .line 14
    .line 15
    invoke-interface {p3, v1, p1}, Lcom/tencent/imsdk/v2/V2TIMValueCallback;->onError(ILjava/lang/String;)V

    .line 16
    return-void

    .line 17
    .line 18
    :cond_0
    if-eqz p2, :cond_3

    .line 19
    .line 20
    .line 21
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 22
    move-result v0

    .line 23
    .line 24
    if-nez v0, :cond_1

    .line 25
    goto :goto_1

    .line 26
    .line 27
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    .line 28
    .line 29
    .line 30
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 34
    move-result-object p2

    .line 35
    .line 36
    .line 37
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    move-result v1

    .line 39
    .line 40
    if-eqz v1, :cond_2

    .line 41
    .line 42
    .line 43
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    move-result-object v1

    .line 45
    .line 46
    check-cast v1, Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0, v1}, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl;->getConversationKey(Ljava/lang/String;)Lcom/tencent/imsdk/conversation/ConversationKey;

    .line 50
    move-result-object v1

    .line 51
    .line 52
    .line 53
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 54
    goto :goto_0

    .line 55
    .line 56
    :cond_2
    new-instance p2, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl$33;

    .line 57
    .line 58
    .line 59
    invoke-direct {p2, p0, p3}, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl$33;-><init>(Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl;Lcom/tencent/imsdk/v2/V2TIMValueCallback;)V

    .line 60
    .line 61
    .line 62
    invoke-static {}, Lcom/tencent/imsdk/conversation/ConversationManager;->getInstance()Lcom/tencent/imsdk/conversation/ConversationManager;

    .line 63
    move-result-object p3

    .line 64
    .line 65
    new-instance v1, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl$34;

    .line 66
    .line 67
    .line 68
    invoke-direct {v1, p0, p2}, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl$34;-><init>(Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl;Lcom/tencent/imsdk/v2/V2TIMValueCallback;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p3, p1, v0, v1}, Lcom/tencent/imsdk/conversation/ConversationManager;->addConversationsToGroup(Ljava/lang/String;Ljava/util/List;Lcom/tencent/imsdk/common/IMCallback;)V

    .line 72
    return-void

    .line 73
    .line 74
    :cond_3
    :goto_1
    if-eqz p3, :cond_4

    .line 75
    .line 76
    const-string p1, "conversationIDList is empty"

    .line 77
    .line 78
    .line 79
    invoke-interface {p3, v1, p1}, Lcom/tencent/imsdk/v2/V2TIMValueCallback;->onError(ILjava/lang/String;)V

    .line 80
    :cond_4
    return-void
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
.end method

.method public cleanConversationUnreadMessageCount(Ljava/lang/String;JJLcom/tencent/imsdk/v2/V2TIMCallback;)V
    .locals 4

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl$23;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0, p6}, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl$23;-><init>(Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl;Lcom/tencent/imsdk/v2/V2TIMCallback;)V

    .line 6
    const/4 v1, 0x1

    .line 7
    .line 8
    if-eqz p1, :cond_6

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 12
    move-result v2

    .line 13
    .line 14
    if-nez v2, :cond_0

    .line 15
    goto :goto_0

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-virtual {p0, p1}, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl;->getConversationKey(Ljava/lang/String;)Lcom/tencent/imsdk/conversation/ConversationKey;

    .line 19
    move-result-object p1

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Lcom/tencent/imsdk/conversation/ConversationKey;->getConversationType()I

    .line 23
    move-result v2

    .line 24
    const/4 v3, 0x0

    .line 25
    .line 26
    if-ne v1, v2, :cond_2

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Lcom/tencent/imsdk/conversation/ConversationKey;->getConversationID()Ljava/lang/String;

    .line 30
    move-result-object p4

    .line 31
    .line 32
    .line 33
    invoke-virtual {p4}, Ljava/lang/String;->isEmpty()Z

    .line 34
    move-result p4

    .line 35
    .line 36
    if-eqz p4, :cond_1

    .line 37
    .line 38
    .line 39
    invoke-static {}, Lcom/tencent/imsdk/conversation/ConversationManager;->getInstance()Lcom/tencent/imsdk/conversation/ConversationManager;

    .line 40
    move-result-object p1

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1, v1, v3, v0}, Lcom/tencent/imsdk/conversation/ConversationManager;->clearUnreadMessage(ZZLcom/tencent/imsdk/common/IMCallback;)V

    .line 44
    return-void

    .line 45
    .line 46
    .line 47
    :cond_1
    invoke-static {}, Lcom/tencent/imsdk/message/MessageCenter;->getInstance()Lcom/tencent/imsdk/message/MessageCenter;

    .line 48
    move-result-object p4

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1}, Lcom/tencent/imsdk/conversation/ConversationKey;->getConversationID()Ljava/lang/String;

    .line 52
    move-result-object p1

    .line 53
    .line 54
    .line 55
    invoke-virtual {p4, p1, p2, p3, v0}, Lcom/tencent/imsdk/message/MessageCenter;->setC2CMessageRead(Ljava/lang/String;JLcom/tencent/imsdk/common/IMCallback;)V

    .line 56
    return-void

    .line 57
    :cond_2
    const/4 p2, 0x2

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1}, Lcom/tencent/imsdk/conversation/ConversationKey;->getConversationType()I

    .line 61
    move-result p3

    .line 62
    .line 63
    if-ne p2, p3, :cond_4

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1}, Lcom/tencent/imsdk/conversation/ConversationKey;->getConversationID()Ljava/lang/String;

    .line 67
    move-result-object p2

    .line 68
    .line 69
    .line 70
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    .line 71
    move-result p2

    .line 72
    .line 73
    if-eqz p2, :cond_3

    .line 74
    .line 75
    .line 76
    invoke-static {}, Lcom/tencent/imsdk/conversation/ConversationManager;->getInstance()Lcom/tencent/imsdk/conversation/ConversationManager;

    .line 77
    move-result-object p1

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1, v3, v1, v0}, Lcom/tencent/imsdk/conversation/ConversationManager;->clearUnreadMessage(ZZLcom/tencent/imsdk/common/IMCallback;)V

    .line 81
    return-void

    .line 82
    .line 83
    .line 84
    :cond_3
    invoke-static {}, Lcom/tencent/imsdk/message/MessageCenter;->getInstance()Lcom/tencent/imsdk/message/MessageCenter;

    .line 85
    move-result-object p2

    .line 86
    .line 87
    .line 88
    invoke-virtual {p1}, Lcom/tencent/imsdk/conversation/ConversationKey;->getConversationID()Ljava/lang/String;

    .line 89
    move-result-object p1

    .line 90
    .line 91
    .line 92
    invoke-virtual {p2, p1, p4, p5, v0}, Lcom/tencent/imsdk/message/MessageCenter;->setGroupMessageRead(Ljava/lang/String;JLcom/tencent/imsdk/common/IMCallback;)V

    .line 93
    return-void

    .line 94
    .line 95
    :cond_4
    if-eqz p6, :cond_5

    .line 96
    .line 97
    const/16 p1, 0x1781

    .line 98
    .line 99
    const-string p2, "conversationID is invalid"

    .line 100
    .line 101
    .line 102
    invoke-interface {p6, p1, p2}, Lcom/tencent/imsdk/v2/V2TIMCallback;->onError(ILjava/lang/String;)V

    .line 103
    :cond_5
    return-void

    .line 104
    .line 105
    .line 106
    :cond_6
    :goto_0
    invoke-static {}, Lcom/tencent/imsdk/conversation/ConversationManager;->getInstance()Lcom/tencent/imsdk/conversation/ConversationManager;

    .line 107
    move-result-object p1

    .line 108
    .line 109
    .line 110
    invoke-virtual {p1, v1, v1, v0}, Lcom/tencent/imsdk/conversation/ConversationManager;->clearUnreadMessage(ZZLcom/tencent/imsdk/common/IMCallback;)V

    .line 111
    return-void
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
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
.end method

.method public createConversationGroup(Ljava/lang/String;Ljava/util/List;Lcom/tencent/imsdk/v2/V2TIMValueCallback;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/tencent/imsdk/v2/V2TIMValueCallback<",
            "Ljava/util/List<",
            "Lcom/tencent/imsdk/v2/V2TIMConversationOperationResult;",
            ">;>;)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    if-eqz p3, :cond_0

    .line 9
    .line 10
    const/16 p1, 0x1781

    .line 11
    .line 12
    const-string p2, "group name is empty"

    .line 13
    .line 14
    .line 15
    invoke-interface {p3, p1, p2}, Lcom/tencent/imsdk/v2/V2TIMValueCallback;->onError(ILjava/lang/String;)V

    .line 16
    :cond_0
    return-void

    .line 17
    .line 18
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    .line 19
    .line 20
    .line 21
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 25
    move-result-object p2

    .line 26
    .line 27
    .line 28
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    move-result v1

    .line 30
    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    .line 34
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    move-result-object v1

    .line 36
    .line 37
    check-cast v1, Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, v1}, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl;->getConversationKey(Ljava/lang/String;)Lcom/tencent/imsdk/conversation/ConversationKey;

    .line 41
    move-result-object v1

    .line 42
    .line 43
    .line 44
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 45
    goto :goto_0

    .line 46
    .line 47
    :cond_2
    new-instance p2, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl$28;

    .line 48
    .line 49
    .line 50
    invoke-direct {p2, p0, p3}, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl$28;-><init>(Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl;Lcom/tencent/imsdk/v2/V2TIMValueCallback;)V

    .line 51
    .line 52
    .line 53
    invoke-static {}, Lcom/tencent/imsdk/conversation/ConversationManager;->getInstance()Lcom/tencent/imsdk/conversation/ConversationManager;

    .line 54
    move-result-object p3

    .line 55
    .line 56
    new-instance v1, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl$29;

    .line 57
    .line 58
    .line 59
    invoke-direct {v1, p0, p2}, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl$29;-><init>(Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl;Lcom/tencent/imsdk/v2/V2TIMValueCallback;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p3, p1, v0, v1}, Lcom/tencent/imsdk/conversation/ConversationManager;->createConversationGroup(Ljava/lang/String;Ljava/util/List;Lcom/tencent/imsdk/common/IMCallback;)V

    .line 63
    return-void
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
.end method

.method public deleteConversation(Ljava/lang/String;Lcom/tencent/imsdk/v2/V2TIMCallback;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    if-eqz p2, :cond_0

    .line 9
    .line 10
    const/16 p1, 0x1781

    .line 11
    .line 12
    const-string v0, "conversationID is empty"

    .line 13
    .line 14
    .line 15
    invoke-interface {p2, p1, v0}, Lcom/tencent/imsdk/v2/V2TIMCallback;->onError(ILjava/lang/String;)V

    .line 16
    :cond_0
    return-void

    .line 17
    .line 18
    .line 19
    :cond_1
    invoke-virtual {p0, p1}, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl;->getConversationKey(Ljava/lang/String;)Lcom/tencent/imsdk/conversation/ConversationKey;

    .line 20
    move-result-object p1

    .line 21
    .line 22
    new-instance v0, Ljava/util/ArrayList;

    .line 23
    .line 24
    .line 25
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    new-instance p1, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl$13;

    .line 31
    .line 32
    .line 33
    invoke-direct {p1, p0, p2}, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl$13;-><init>(Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl;Lcom/tencent/imsdk/v2/V2TIMCallback;)V

    .line 34
    .line 35
    .line 36
    invoke-static {}, Lcom/tencent/imsdk/conversation/ConversationManager;->getInstance()Lcom/tencent/imsdk/conversation/ConversationManager;

    .line 37
    move-result-object p2

    .line 38
    .line 39
    new-instance v1, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl$14;

    .line 40
    .line 41
    .line 42
    invoke-direct {v1, p0, p1}, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl$14;-><init>(Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl;Lcom/tencent/imsdk/v2/V2TIMValueCallback;)V

    .line 43
    const/4 p1, 0x1

    .line 44
    .line 45
    .line 46
    invoke-virtual {p2, v0, p1, v1}, Lcom/tencent/imsdk/conversation/ConversationManager;->deleteConversationList(Ljava/util/List;ZLcom/tencent/imsdk/common/IMCallback;)V

    .line 47
    return-void
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
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
.end method

.method public deleteConversationGroup(Ljava/lang/String;Lcom/tencent/imsdk/v2/V2TIMCallback;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    if-eqz p2, :cond_0

    .line 9
    .line 10
    const/16 p1, 0x1781

    .line 11
    .line 12
    const-string v0, "group name is empty"

    .line 13
    .line 14
    .line 15
    invoke-interface {p2, p1, v0}, Lcom/tencent/imsdk/v2/V2TIMCallback;->onError(ILjava/lang/String;)V

    .line 16
    :cond_0
    return-void

    .line 17
    .line 18
    .line 19
    :cond_1
    invoke-static {}, Lcom/tencent/imsdk/conversation/ConversationManager;->getInstance()Lcom/tencent/imsdk/conversation/ConversationManager;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    new-instance v1, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl$31;

    .line 23
    .line 24
    .line 25
    invoke-direct {v1, p0, p2}, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl$31;-><init>(Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl;Lcom/tencent/imsdk/v2/V2TIMCallback;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, p1, v1}, Lcom/tencent/imsdk/conversation/ConversationManager;->deleteConversationGroup(Ljava/lang/String;Lcom/tencent/imsdk/common/IMCallback;)V

    .line 29
    return-void
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public deleteConversationList(Ljava/util/List;ZLcom/tencent/imsdk/v2/V2TIMValueCallback;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;Z",
            "Lcom/tencent/imsdk/v2/V2TIMValueCallback<",
            "Ljava/util/List<",
            "Lcom/tencent/imsdk/v2/V2TIMConversationOperationResult;",
            ">;>;)V"
        }
    .end annotation

    .line 1
    .line 2
    if-eqz p1, :cond_2

    .line 3
    .line 4
    .line 5
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 6
    move-result v0

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    goto :goto_1

    .line 10
    .line 11
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    .line 14
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 18
    move-result-object p1

    .line 19
    .line 20
    .line 21
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    move-result v1

    .line 23
    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    .line 27
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    move-result-object v1

    .line 29
    .line 30
    check-cast v1, Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, v1}, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl;->getConversationKey(Ljava/lang/String;)Lcom/tencent/imsdk/conversation/ConversationKey;

    .line 34
    move-result-object v1

    .line 35
    .line 36
    .line 37
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 38
    goto :goto_0

    .line 39
    .line 40
    :cond_1
    new-instance p1, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl$15;

    .line 41
    .line 42
    .line 43
    invoke-direct {p1, p0, p3}, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl$15;-><init>(Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl;Lcom/tencent/imsdk/v2/V2TIMValueCallback;)V

    .line 44
    .line 45
    .line 46
    invoke-static {}, Lcom/tencent/imsdk/conversation/ConversationManager;->getInstance()Lcom/tencent/imsdk/conversation/ConversationManager;

    .line 47
    move-result-object p3

    .line 48
    .line 49
    new-instance v1, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl$16;

    .line 50
    .line 51
    .line 52
    invoke-direct {v1, p0, p1}, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl$16;-><init>(Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl;Lcom/tencent/imsdk/v2/V2TIMValueCallback;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p3, v0, p2, v1}, Lcom/tencent/imsdk/conversation/ConversationManager;->deleteConversationList(Ljava/util/List;ZLcom/tencent/imsdk/common/IMCallback;)V

    .line 56
    return-void

    .line 57
    .line 58
    :cond_2
    :goto_1
    if-eqz p3, :cond_3

    .line 59
    .line 60
    const/16 p1, 0x1781

    .line 61
    .line 62
    const-string p2, "conversationIDList is empty"

    .line 63
    .line 64
    .line 65
    invoke-interface {p3, p1, p2}, Lcom/tencent/imsdk/v2/V2TIMValueCallback;->onError(ILjava/lang/String;)V

    .line 66
    :cond_3
    return-void
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
.end method

.method public deleteConversationsFromGroup(Ljava/lang/String;Ljava/util/List;Lcom/tencent/imsdk/v2/V2TIMValueCallback;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/tencent/imsdk/v2/V2TIMValueCallback<",
            "Ljava/util/List<",
            "Lcom/tencent/imsdk/v2/V2TIMConversationOperationResult;",
            ">;>;)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    const/16 v1, 0x1781

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    if-eqz p3, :cond_4

    .line 11
    .line 12
    const-string p1, "groupName is empty"

    .line 13
    .line 14
    .line 15
    invoke-interface {p3, v1, p1}, Lcom/tencent/imsdk/v2/V2TIMValueCallback;->onError(ILjava/lang/String;)V

    .line 16
    return-void

    .line 17
    .line 18
    :cond_0
    if-eqz p2, :cond_3

    .line 19
    .line 20
    .line 21
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 22
    move-result v0

    .line 23
    .line 24
    if-nez v0, :cond_1

    .line 25
    goto :goto_1

    .line 26
    .line 27
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    .line 28
    .line 29
    .line 30
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 34
    move-result-object p2

    .line 35
    .line 36
    .line 37
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    move-result v1

    .line 39
    .line 40
    if-eqz v1, :cond_2

    .line 41
    .line 42
    .line 43
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    move-result-object v1

    .line 45
    .line 46
    check-cast v1, Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0, v1}, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl;->getConversationKey(Ljava/lang/String;)Lcom/tencent/imsdk/conversation/ConversationKey;

    .line 50
    move-result-object v1

    .line 51
    .line 52
    .line 53
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 54
    goto :goto_0

    .line 55
    .line 56
    :cond_2
    new-instance p2, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl$35;

    .line 57
    .line 58
    .line 59
    invoke-direct {p2, p0, p3}, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl$35;-><init>(Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl;Lcom/tencent/imsdk/v2/V2TIMValueCallback;)V

    .line 60
    .line 61
    .line 62
    invoke-static {}, Lcom/tencent/imsdk/conversation/ConversationManager;->getInstance()Lcom/tencent/imsdk/conversation/ConversationManager;

    .line 63
    move-result-object p3

    .line 64
    .line 65
    new-instance v1, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl$36;

    .line 66
    .line 67
    .line 68
    invoke-direct {v1, p0, p2}, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl$36;-><init>(Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl;Lcom/tencent/imsdk/v2/V2TIMValueCallback;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p3, p1, v0, v1}, Lcom/tencent/imsdk/conversation/ConversationManager;->deleteConversationsFromGroup(Ljava/lang/String;Ljava/util/List;Lcom/tencent/imsdk/common/IMCallback;)V

    .line 72
    return-void

    .line 73
    .line 74
    :cond_3
    :goto_1
    if-eqz p3, :cond_4

    .line 75
    .line 76
    const-string p1, "conversationIDList is empty"

    .line 77
    .line 78
    .line 79
    invoke-interface {p3, v1, p1}, Lcom/tencent/imsdk/v2/V2TIMValueCallback;->onError(ILjava/lang/String;)V

    .line 80
    :cond_4
    return-void
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
.end method

.method public getConversation(Ljava/lang/String;Lcom/tencent/imsdk/v2/V2TIMValueCallback;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/tencent/imsdk/v2/V2TIMValueCallback<",
            "Lcom/tencent/imsdk/v2/V2TIMConversation;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    if-eqz p2, :cond_0

    .line 9
    .line 10
    const/16 p1, 0x1781

    .line 11
    .line 12
    const-string v0, "conversationID is empty"

    .line 13
    .line 14
    .line 15
    invoke-interface {p2, p1, v0}, Lcom/tencent/imsdk/v2/V2TIMValueCallback;->onError(ILjava/lang/String;)V

    .line 16
    :cond_0
    return-void

    .line 17
    .line 18
    .line 19
    :cond_1
    invoke-virtual {p0, p1}, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl;->getConversationKey(Ljava/lang/String;)Lcom/tencent/imsdk/conversation/ConversationKey;

    .line 20
    move-result-object p1

    .line 21
    .line 22
    new-instance v0, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl$11;

    .line 23
    .line 24
    .line 25
    invoke-direct {v0, p0, p2}, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl$11;-><init>(Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl;Lcom/tencent/imsdk/v2/V2TIMValueCallback;)V

    .line 26
    .line 27
    .line 28
    invoke-static {}, Lcom/tencent/imsdk/conversation/ConversationManager;->getInstance()Lcom/tencent/imsdk/conversation/ConversationManager;

    .line 29
    move-result-object p2

    .line 30
    .line 31
    new-instance v1, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl$12;

    .line 32
    .line 33
    .line 34
    invoke-direct {v1, p0, v0}, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl$12;-><init>(Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl;Lcom/tencent/imsdk/v2/V2TIMValueCallback;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p2, p1, v1}, Lcom/tencent/imsdk/conversation/ConversationManager;->getConversationInfo(Lcom/tencent/imsdk/conversation/ConversationKey;Lcom/tencent/imsdk/common/IMCallback;)V

    .line 38
    return-void
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
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
.end method

.method public getConversationGroupList(Lcom/tencent/imsdk/v2/V2TIMValueCallback;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/tencent/imsdk/v2/V2TIMValueCallback<",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/imsdk/conversation/ConversationManager;->getInstance()Lcom/tencent/imsdk/conversation/ConversationManager;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    new-instance v1, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl$30;

    .line 7
    .line 8
    .line 9
    invoke-direct {v1, p0, p1}, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl$30;-><init>(Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl;Lcom/tencent/imsdk/v2/V2TIMValueCallback;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lcom/tencent/imsdk/conversation/ConversationManager;->getConversationGroupList(Lcom/tencent/imsdk/common/IMCallback;)V

    .line 13
    return-void
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
.end method

.method public getConversationKey(Ljava/lang/String;)Lcom/tencent/imsdk/conversation/ConversationKey;
    .locals 5

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/imsdk/conversation/ConversationKey;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/tencent/imsdk/conversation/ConversationKey;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 9
    move-result v1

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    return-object v0

    .line 13
    .line 14
    :cond_0
    const-string v1, "c2c_"

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 18
    move-result v1

    .line 19
    const/4 v2, 0x1

    .line 20
    .line 21
    if-nez v1, :cond_1

    .line 22
    const/4 v1, 0x4

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 26
    move-result-object p1

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v2}, Lcom/tencent/imsdk/conversation/ConversationKey;->setConversationType(I)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, p1}, Lcom/tencent/imsdk/conversation/ConversationKey;->setConversationID(Ljava/lang/String;)V

    .line 33
    return-object v0

    .line 34
    .line 35
    :cond_1
    const-string v1, "group_"

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 39
    move-result v1

    .line 40
    const/4 v3, 0x2

    .line 41
    .line 42
    if-nez v1, :cond_2

    .line 43
    const/4 v1, 0x6

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 47
    move-result-object p1

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v3}, Lcom/tencent/imsdk/conversation/ConversationKey;->setConversationType(I)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, p1}, Lcom/tencent/imsdk/conversation/ConversationKey;->setConversationID(Ljava/lang/String;)V

    .line 54
    return-object v0

    .line 55
    .line 56
    :cond_2
    const-string v1, "c2c"

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 60
    move-result v1

    .line 61
    .line 62
    const-string v4, ""

    .line 63
    .line 64
    if-eqz v1, :cond_3

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0, v2}, Lcom/tencent/imsdk/conversation/ConversationKey;->setConversationType(I)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0, v4}, Lcom/tencent/imsdk/conversation/ConversationKey;->setConversationID(Ljava/lang/String;)V

    .line 71
    return-object v0

    .line 72
    .line 73
    :cond_3
    const-string v1, "group"

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 77
    move-result v1

    .line 78
    .line 79
    if-eqz v1, :cond_4

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0, v3}, Lcom/tencent/imsdk/conversation/ConversationKey;->setConversationType(I)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0, v4}, Lcom/tencent/imsdk/conversation/ConversationKey;->setConversationID(Ljava/lang/String;)V

    .line 86
    return-object v0

    .line 87
    .line 88
    .line 89
    :cond_4
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 90
    move-result p1

    .line 91
    .line 92
    if-nez p1, :cond_5

    .line 93
    const/4 p1, 0x3

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0, p1}, Lcom/tencent/imsdk/conversation/ConversationKey;->setConversationType(I)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0, v4}, Lcom/tencent/imsdk/conversation/ConversationKey;->setConversationID(Ljava/lang/String;)V

    .line 100
    return-object v0

    .line 101
    :cond_5
    const/4 p1, 0x0

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0, p1}, Lcom/tencent/imsdk/conversation/ConversationKey;->setConversationType(I)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0, v4}, Lcom/tencent/imsdk/conversation/ConversationKey;->setConversationID(Ljava/lang/String;)V

    .line 108
    return-object v0
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
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
.end method

.method public getConversationList(JILcom/tencent/imsdk/v2/V2TIMValueCallback;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JI",
            "Lcom/tencent/imsdk/v2/V2TIMValueCallback<",
            "Lcom/tencent/imsdk/v2/V2TIMConversationResult;",
            ">;)V"
        }
    .end annotation

    if-gtz p3, :cond_1

    if-eqz p4, :cond_0

    const/16 p1, 0x1781

    .line 1
    const-string p2, "count is invalid"

    invoke-interface {p4, p1, p2}, Lcom/tencent/imsdk/v2/V2TIMValueCallback;->onError(ILjava/lang/String;)V

    :cond_0
    return-void

    .line 2
    :cond_1
    new-instance v0, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl$5;

    invoke-direct {v0, p0, p4}, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl$5;-><init>(Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl;Lcom/tencent/imsdk/v2/V2TIMValueCallback;)V

    .line 3
    invoke-static {}, Lcom/tencent/imsdk/conversation/ConversationManager;->getInstance()Lcom/tencent/imsdk/conversation/ConversationManager;

    move-result-object p4

    new-instance v1, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl$6;

    invoke-direct {v1, p0, v0}, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl$6;-><init>(Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl;Lcom/tencent/imsdk/v2/V2TIMValueCallback;)V

    invoke-virtual {p4, p1, p2, p3, v1}, Lcom/tencent/imsdk/conversation/ConversationManager;->getConversationList(JILcom/tencent/imsdk/common/IMCallback;)V

    .line 4
    invoke-static {}, Lcom/tencent/imsdk/manager/BaseManager;->getInstance()Lcom/tencent/imsdk/manager/BaseManager;

    move-result-object p1

    const-wide/16 p2, 0x2

    invoke-virtual {p1, p2, p3}, Lcom/tencent/imsdk/manager/BaseManager;->reportTUIComponentUsage(J)V

    return-void
.end method

.method public getConversationList(Ljava/util/List;Lcom/tencent/imsdk/v2/V2TIMValueCallback;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/tencent/imsdk/v2/V2TIMValueCallback<",
            "Ljava/util/List<",
            "Lcom/tencent/imsdk/v2/V2TIMConversation;",
            ">;>;)V"
        }
    .end annotation

    if-eqz p1, :cond_2

    .line 5
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 6
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 8
    invoke-virtual {p0, v1}, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl;->getConversationKey(Ljava/lang/String;)Lcom/tencent/imsdk/conversation/ConversationKey;

    move-result-object v1

    .line 9
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 10
    :cond_1
    new-instance p1, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl$7;

    invoke-direct {p1, p0, p2}, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl$7;-><init>(Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl;Lcom/tencent/imsdk/v2/V2TIMValueCallback;)V

    .line 11
    invoke-static {}, Lcom/tencent/imsdk/conversation/ConversationManager;->getInstance()Lcom/tencent/imsdk/conversation/ConversationManager;

    move-result-object p2

    new-instance v1, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl$8;

    invoke-direct {v1, p0, p1}, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl$8;-><init>(Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl;Lcom/tencent/imsdk/v2/V2TIMValueCallback;)V

    invoke-virtual {p2, v0, v1}, Lcom/tencent/imsdk/conversation/ConversationManager;->getConversationList(Ljava/util/List;Lcom/tencent/imsdk/common/IMCallback;)V

    return-void

    :cond_2
    :goto_1
    if-eqz p2, :cond_3

    const/16 p1, 0x1781

    .line 12
    const-string v0, "conversationIDList cannot be empty"

    invoke-interface {p2, p1, v0}, Lcom/tencent/imsdk/v2/V2TIMValueCallback;->onError(ILjava/lang/String;)V

    :cond_3
    return-void
.end method

.method public getConversationListByFilter(Lcom/tencent/imsdk/v2/V2TIMConversationListFilter;JILcom/tencent/imsdk/v2/V2TIMValueCallback;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/tencent/imsdk/v2/V2TIMConversationListFilter;",
            "JI",
            "Lcom/tencent/imsdk/v2/V2TIMValueCallback<",
            "Lcom/tencent/imsdk/v2/V2TIMConversationResult;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    const/16 v0, 0x1781

    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    if-eqz p5, :cond_1

    .line 7
    .line 8
    const-string p1, "filter is null"

    .line 9
    .line 10
    .line 11
    invoke-interface {p5, v0, p1}, Lcom/tencent/imsdk/v2/V2TIMValueCallback;->onError(ILjava/lang/String;)V

    .line 12
    return-void

    .line 13
    .line 14
    :cond_0
    if-gtz p4, :cond_2

    .line 15
    .line 16
    if-eqz p5, :cond_1

    .line 17
    .line 18
    const-string p1, "count is invalid"

    .line 19
    .line 20
    .line 21
    invoke-interface {p5, v0, p1}, Lcom/tencent/imsdk/v2/V2TIMValueCallback;->onError(ILjava/lang/String;)V

    .line 22
    :cond_1
    return-void

    .line 23
    .line 24
    :cond_2
    new-instance v0, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl$9;

    .line 25
    .line 26
    .line 27
    invoke-direct {v0, p0, p5}, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl$9;-><init>(Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl;Lcom/tencent/imsdk/v2/V2TIMValueCallback;)V

    .line 28
    .line 29
    .line 30
    invoke-static {}, Lcom/tencent/imsdk/conversation/ConversationManager;->getInstance()Lcom/tencent/imsdk/conversation/ConversationManager;

    .line 31
    move-result-object v1

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1}, Lcom/tencent/imsdk/v2/V2TIMConversationListFilter;->getConversationFilter()Lcom/tencent/imsdk/conversation/ConversationListFilter;

    .line 35
    move-result-object v2

    .line 36
    .line 37
    new-instance v6, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl$10;

    .line 38
    .line 39
    .line 40
    invoke-direct {v6, p0, v0}, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl$10;-><init>(Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl;Lcom/tencent/imsdk/v2/V2TIMValueCallback;)V

    .line 41
    move-wide v3, p2

    .line 42
    move v5, p4

    .line 43
    .line 44
    .line 45
    invoke-virtual/range {v1 .. v6}, Lcom/tencent/imsdk/conversation/ConversationManager;->getConversationListByFilter(Lcom/tencent/imsdk/conversation/ConversationListFilter;JILcom/tencent/imsdk/common/IMCallback;)V

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
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
.end method

.method public getTotalUnreadMessageCount(Lcom/tencent/imsdk/v2/V2TIMValueCallback;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/tencent/imsdk/v2/V2TIMValueCallback<",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl$19;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0, p1}, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl$19;-><init>(Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl;Lcom/tencent/imsdk/v2/V2TIMValueCallback;)V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lcom/tencent/imsdk/conversation/ConversationManager;->getInstance()Lcom/tencent/imsdk/conversation/ConversationManager;

    .line 9
    move-result-object p1

    .line 10
    .line 11
    new-instance v1, Lcom/tencent/imsdk/conversation/ConversationListFilter;

    .line 12
    .line 13
    .line 14
    invoke-direct {v1}, Lcom/tencent/imsdk/conversation/ConversationListFilter;-><init>()V

    .line 15
    .line 16
    new-instance v2, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl$20;

    .line 17
    .line 18
    .line 19
    invoke-direct {v2, p0, v0}, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl$20;-><init>(Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl;Lcom/tencent/imsdk/v2/V2TIMValueCallback;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, v1, v2}, Lcom/tencent/imsdk/conversation/ConversationManager;->getTotalUnreadMessageCount(Lcom/tencent/imsdk/conversation/ConversationListFilter;Lcom/tencent/imsdk/common/IMCallback;)V

    .line 23
    return-void
    .line 24
    .line 25
.end method

.method public getUnreadMessageCountByFilter(Lcom/tencent/imsdk/v2/V2TIMConversationListFilter;Lcom/tencent/imsdk/v2/V2TIMValueCallback;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/tencent/imsdk/v2/V2TIMConversationListFilter;",
            "Lcom/tencent/imsdk/v2/V2TIMValueCallback<",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    const/16 v0, 0x1781

    .line 3
    .line 4
    if-nez p1, :cond_1

    .line 5
    .line 6
    if-eqz p2, :cond_0

    .line 7
    .line 8
    const-string p1, "filter must not be null"

    .line 9
    .line 10
    .line 11
    invoke-interface {p2, v0, p1}, Lcom/tencent/imsdk/v2/V2TIMValueCallback;->onError(ILjava/lang/String;)V

    .line 12
    :cond_0
    return-void

    .line 13
    .line 14
    .line 15
    :cond_1
    invoke-virtual {p1}, Lcom/tencent/imsdk/v2/V2TIMConversationListFilter;->getConversationFilter()Lcom/tencent/imsdk/conversation/ConversationListFilter;

    .line 16
    move-result-object p1

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Lcom/tencent/imsdk/conversation/ConversationListFilter;->isNull()Z

    .line 20
    move-result v1

    .line 21
    .line 22
    if-eqz v1, :cond_2

    .line 23
    .line 24
    .line 25
    const-string/jumbo p1, "one of type, conversationGroup and markType fields of the filter must be set"

    .line 26
    .line 27
    .line 28
    invoke-interface {p2, v0, p1}, Lcom/tencent/imsdk/v2/V2TIMValueCallback;->onError(ILjava/lang/String;)V

    .line 29
    return-void

    .line 30
    .line 31
    :cond_2
    new-instance v0, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl$21;

    .line 32
    .line 33
    .line 34
    invoke-direct {v0, p0, p2}, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl$21;-><init>(Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl;Lcom/tencent/imsdk/v2/V2TIMValueCallback;)V

    .line 35
    .line 36
    .line 37
    invoke-static {}, Lcom/tencent/imsdk/conversation/ConversationManager;->getInstance()Lcom/tencent/imsdk/conversation/ConversationManager;

    .line 38
    move-result-object p2

    .line 39
    .line 40
    new-instance v1, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl$22;

    .line 41
    .line 42
    .line 43
    invoke-direct {v1, p0, v0}, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl$22;-><init>(Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl;Lcom/tencent/imsdk/v2/V2TIMValueCallback;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p2, p1, v1}, Lcom/tencent/imsdk/conversation/ConversationManager;->getTotalUnreadMessageCount(Lcom/tencent/imsdk/conversation/ConversationListFilter;Lcom/tencent/imsdk/common/IMCallback;)V

    .line 47
    return-void
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
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
.end method

.method public markConversation(Ljava/util/List;JZLcom/tencent/imsdk/v2/V2TIMValueCallback;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;JZ",
            "Lcom/tencent/imsdk/v2/V2TIMValueCallback<",
            "Ljava/util/List<",
            "Lcom/tencent/imsdk/v2/V2TIMConversationOperationResult;",
            ">;>;)V"
        }
    .end annotation

    .line 1
    .line 2
    const/16 v0, 0x1781

    .line 3
    .line 4
    if-eqz p1, :cond_3

    .line 5
    .line 6
    .line 7
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 8
    move-result v1

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    goto :goto_1

    .line 12
    .line 13
    :cond_0
    const-wide/16 v1, 0x0

    .line 14
    .line 15
    cmp-long v1, p2, v1

    .line 16
    .line 17
    if-nez v1, :cond_1

    .line 18
    .line 19
    if-eqz p5, :cond_4

    .line 20
    .line 21
    const-string p1, "markType is invalid"

    .line 22
    .line 23
    .line 24
    invoke-interface {p5, v0, p1}, Lcom/tencent/imsdk/v2/V2TIMValueCallback;->onError(ILjava/lang/String;)V

    .line 25
    return-void

    .line 26
    .line 27
    :cond_1
    new-instance v2, Ljava/util/ArrayList;

    .line 28
    .line 29
    .line 30
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 34
    move-result-object p1

    .line 35
    .line 36
    .line 37
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    move-result v0

    .line 39
    .line 40
    if-eqz v0, :cond_2

    .line 41
    .line 42
    .line 43
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    move-result-object v0

    .line 45
    .line 46
    check-cast v0, Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0, v0}, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl;->getConversationKey(Ljava/lang/String;)Lcom/tencent/imsdk/conversation/ConversationKey;

    .line 50
    move-result-object v0

    .line 51
    .line 52
    .line 53
    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 54
    goto :goto_0

    .line 55
    .line 56
    :cond_2
    new-instance p1, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl$24;

    .line 57
    .line 58
    .line 59
    invoke-direct {p1, p0, p5}, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl$24;-><init>(Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl;Lcom/tencent/imsdk/v2/V2TIMValueCallback;)V

    .line 60
    .line 61
    .line 62
    invoke-static {}, Lcom/tencent/imsdk/conversation/ConversationManager;->getInstance()Lcom/tencent/imsdk/conversation/ConversationManager;

    .line 63
    move-result-object v1

    .line 64
    .line 65
    new-instance v6, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl$25;

    .line 66
    .line 67
    .line 68
    invoke-direct {v6, p0, p1}, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl$25;-><init>(Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl;Lcom/tencent/imsdk/v2/V2TIMValueCallback;)V

    .line 69
    move-wide v3, p2

    .line 70
    move v5, p4

    .line 71
    .line 72
    .line 73
    invoke-virtual/range {v1 .. v6}, Lcom/tencent/imsdk/conversation/ConversationManager;->markConversation(Ljava/util/List;JZLcom/tencent/imsdk/common/IMCallback;)V

    .line 74
    return-void

    .line 75
    .line 76
    :cond_3
    :goto_1
    if-eqz p5, :cond_4

    .line 77
    .line 78
    const-string p1, "conversationIDList is empty"

    .line 79
    .line 80
    .line 81
    invoke-interface {p5, v0, p1}, Lcom/tencent/imsdk/v2/V2TIMValueCallback;->onError(ILjava/lang/String;)V

    .line 82
    :cond_4
    return-void
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
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
.end method

.method public pinConversation(Ljava/lang/String;ZLcom/tencent/imsdk/v2/V2TIMCallback;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    if-eqz p3, :cond_0

    .line 9
    .line 10
    const/16 p1, 0x1781

    .line 11
    .line 12
    const-string p2, "conversationID is empty"

    .line 13
    .line 14
    .line 15
    invoke-interface {p3, p1, p2}, Lcom/tencent/imsdk/v2/V2TIMCallback;->onError(ILjava/lang/String;)V

    .line 16
    :cond_0
    return-void

    .line 17
    .line 18
    .line 19
    :cond_1
    invoke-virtual {p0, p1}, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl;->getConversationKey(Ljava/lang/String;)Lcom/tencent/imsdk/conversation/ConversationKey;

    .line 20
    move-result-object p1

    .line 21
    .line 22
    .line 23
    invoke-static {}, Lcom/tencent/imsdk/conversation/ConversationManager;->getInstance()Lcom/tencent/imsdk/conversation/ConversationManager;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    new-instance v1, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl$18;

    .line 27
    .line 28
    .line 29
    invoke-direct {v1, p0, p3}, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl$18;-><init>(Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl;Lcom/tencent/imsdk/v2/V2TIMCallback;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, p1, p2, v1}, Lcom/tencent/imsdk/conversation/ConversationManager;->pinConversation(Lcom/tencent/imsdk/conversation/ConversationKey;ZLcom/tencent/imsdk/common/IMCallback;)V

    .line 33
    return-void
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
.end method

.method public removeConversationListener(Lcom/tencent/imsdk/v2/V2TIMConversationListener;)V
    .locals 2

    .line 1
    .line 2
    if-nez p1, :cond_0

    .line 3
    return-void

    .line 4
    .line 5
    .line 6
    :cond_0
    invoke-static {}, Lcom/tencent/imsdk/common/IMContext;->getInstance()Lcom/tencent/imsdk/common/IMContext;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    new-instance v1, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl$4;

    .line 10
    .line 11
    .line 12
    invoke-direct {v1, p0, p1}, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl$4;-><init>(Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl;Lcom/tencent/imsdk/v2/V2TIMConversationListener;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Lcom/tencent/imsdk/common/IMContext;->runOnMainThread(Ljava/lang/Runnable;)V

    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public renameConversationGroup(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/imsdk/v2/V2TIMCallback;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    const/16 v1, 0x1781

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    if-eqz p3, :cond_1

    .line 11
    .line 12
    .line 13
    const-string/jumbo p1, "oldName is empty"

    .line 14
    .line 15
    .line 16
    invoke-interface {p3, v1, p1}, Lcom/tencent/imsdk/v2/V2TIMCallback;->onError(ILjava/lang/String;)V

    .line 17
    return-void

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 21
    move-result v0

    .line 22
    .line 23
    if-eqz v0, :cond_2

    .line 24
    .line 25
    if-eqz p3, :cond_1

    .line 26
    .line 27
    .line 28
    const-string/jumbo p1, "newName is empty"

    .line 29
    .line 30
    .line 31
    invoke-interface {p3, v1, p1}, Lcom/tencent/imsdk/v2/V2TIMCallback;->onError(ILjava/lang/String;)V

    .line 32
    :cond_1
    return-void

    .line 33
    .line 34
    .line 35
    :cond_2
    invoke-static {}, Lcom/tencent/imsdk/conversation/ConversationManager;->getInstance()Lcom/tencent/imsdk/conversation/ConversationManager;

    .line 36
    move-result-object v0

    .line 37
    .line 38
    new-instance v1, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl$32;

    .line 39
    .line 40
    .line 41
    invoke-direct {v1, p0, p3}, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl$32;-><init>(Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl;Lcom/tencent/imsdk/v2/V2TIMCallback;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, p1, p2, v1}, Lcom/tencent/imsdk/conversation/ConversationManager;->renameConversationGroup(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/imsdk/common/IMCallback;)V

    .line 45
    return-void
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
.end method

.method public setConversationCustomData(Ljava/util/List;Ljava/lang/String;Lcom/tencent/imsdk/v2/V2TIMValueCallback;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/tencent/imsdk/v2/V2TIMValueCallback<",
            "Ljava/util/List<",
            "Lcom/tencent/imsdk/v2/V2TIMConversationOperationResult;",
            ">;>;)V"
        }
    .end annotation

    .line 1
    .line 2
    if-eqz p1, :cond_2

    .line 3
    .line 4
    .line 5
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 6
    move-result v0

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    goto :goto_1

    .line 10
    .line 11
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    .line 14
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 18
    move-result-object p1

    .line 19
    .line 20
    .line 21
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    move-result v1

    .line 23
    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    .line 27
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    move-result-object v1

    .line 29
    .line 30
    check-cast v1, Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, v1}, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl;->getConversationKey(Ljava/lang/String;)Lcom/tencent/imsdk/conversation/ConversationKey;

    .line 34
    move-result-object v1

    .line 35
    .line 36
    .line 37
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 38
    goto :goto_0

    .line 39
    .line 40
    :cond_1
    new-instance p1, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl$26;

    .line 41
    .line 42
    .line 43
    invoke-direct {p1, p0, p3}, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl$26;-><init>(Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl;Lcom/tencent/imsdk/v2/V2TIMValueCallback;)V

    .line 44
    .line 45
    .line 46
    invoke-static {}, Lcom/tencent/imsdk/conversation/ConversationManager;->getInstance()Lcom/tencent/imsdk/conversation/ConversationManager;

    .line 47
    move-result-object p3

    .line 48
    .line 49
    new-instance v1, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl$27;

    .line 50
    .line 51
    .line 52
    invoke-direct {v1, p0, p1}, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl$27;-><init>(Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl;Lcom/tencent/imsdk/v2/V2TIMValueCallback;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p3, v0, p2, v1}, Lcom/tencent/imsdk/conversation/ConversationManager;->setConversationCustomData(Ljava/util/List;Ljava/lang/String;Lcom/tencent/imsdk/common/IMCallback;)V

    .line 56
    return-void

    .line 57
    .line 58
    :cond_2
    :goto_1
    if-eqz p3, :cond_3

    .line 59
    .line 60
    const/16 p1, 0x1781

    .line 61
    .line 62
    const-string p2, "conversationIDList is empty"

    .line 63
    .line 64
    .line 65
    invoke-interface {p3, p1, p2}, Lcom/tencent/imsdk/v2/V2TIMValueCallback;->onError(ILjava/lang/String;)V

    .line 66
    :cond_3
    return-void
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
.end method

.method public setConversationDraft(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/imsdk/v2/V2TIMCallback;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    if-eqz p3, :cond_0

    .line 9
    .line 10
    const/16 p1, 0x1781

    .line 11
    .line 12
    const-string p2, "conversationID is empty"

    .line 13
    .line 14
    .line 15
    invoke-interface {p3, p1, p2}, Lcom/tencent/imsdk/v2/V2TIMCallback;->onError(ILjava/lang/String;)V

    .line 16
    :cond_0
    return-void

    .line 17
    .line 18
    .line 19
    :cond_1
    invoke-virtual {p0, p1}, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl;->getConversationKey(Ljava/lang/String;)Lcom/tencent/imsdk/conversation/ConversationKey;

    .line 20
    move-result-object p1

    .line 21
    .line 22
    new-instance v0, Lcom/tencent/imsdk/message/DraftMessage;

    .line 23
    .line 24
    .line 25
    invoke-direct {v0}, Lcom/tencent/imsdk/message/DraftMessage;-><init>()V

    .line 26
    .line 27
    if-eqz p2, :cond_2

    .line 28
    .line 29
    .line 30
    invoke-virtual {p2}, Ljava/lang/String;->getBytes()[B

    .line 31
    move-result-object p2

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, p2}, Lcom/tencent/imsdk/message/DraftMessage;->setUserDefinedData([B)V

    .line 35
    .line 36
    .line 37
    :cond_2
    invoke-static {}, Lcom/tencent/imsdk/conversation/ConversationManager;->getInstance()Lcom/tencent/imsdk/conversation/ConversationManager;

    .line 38
    move-result-object p2

    .line 39
    .line 40
    new-instance v1, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl$17;

    .line 41
    .line 42
    .line 43
    invoke-direct {v1, p0, p3}, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl$17;-><init>(Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl;Lcom/tencent/imsdk/v2/V2TIMCallback;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p2, p1, v0, v1}, Lcom/tencent/imsdk/conversation/ConversationManager;->setConversationDraft(Lcom/tencent/imsdk/conversation/ConversationKey;Lcom/tencent/imsdk/message/DraftMessage;Lcom/tencent/imsdk/common/IMCallback;)V

    .line 47
    return-void
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
.end method

.method public setConversationListener(Lcom/tencent/imsdk/v2/V2TIMConversationListener;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/imsdk/common/IMContext;->getInstance()Lcom/tencent/imsdk/common/IMContext;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    new-instance v1, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl$2;

    .line 7
    .line 8
    .line 9
    invoke-direct {v1, p0, p1}, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl$2;-><init>(Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl;Lcom/tencent/imsdk/v2/V2TIMConversationListener;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lcom/tencent/imsdk/common/IMContext;->runOnMainThread(Ljava/lang/Runnable;)V

    .line 13
    return-void
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
.end method

.method public subscribeUnreadMessageCountByFilter(Lcom/tencent/imsdk/v2/V2TIMConversationListFilter;)V
    .locals 1

    .line 1
    .line 2
    if-nez p1, :cond_0

    .line 3
    goto :goto_0

    .line 4
    .line 5
    .line 6
    :cond_0
    invoke-virtual {p1}, Lcom/tencent/imsdk/v2/V2TIMConversationListFilter;->getConversationFilter()Lcom/tencent/imsdk/conversation/ConversationListFilter;

    .line 7
    move-result-object p1

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Lcom/tencent/imsdk/conversation/ConversationListFilter;->isNull()Z

    .line 11
    move-result v0

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    :goto_0
    return-void

    .line 15
    .line 16
    .line 17
    :cond_1
    invoke-static {}, Lcom/tencent/imsdk/conversation/ConversationManager;->getInstance()Lcom/tencent/imsdk/conversation/ConversationManager;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p1}, Lcom/tencent/imsdk/conversation/ConversationManager;->subscribeUnreadMessageCountByFilter(Lcom/tencent/imsdk/conversation/ConversationListFilter;)V

    .line 22
    return-void
    .line 23
    .line 24
    .line 25
.end method

.method public unsubscribeUnreadMessageCountByFilter(Lcom/tencent/imsdk/v2/V2TIMConversationListFilter;)V
    .locals 1

    .line 1
    .line 2
    if-nez p1, :cond_0

    .line 3
    goto :goto_0

    .line 4
    .line 5
    .line 6
    :cond_0
    invoke-virtual {p1}, Lcom/tencent/imsdk/v2/V2TIMConversationListFilter;->getConversationFilter()Lcom/tencent/imsdk/conversation/ConversationListFilter;

    .line 7
    move-result-object p1

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Lcom/tencent/imsdk/conversation/ConversationListFilter;->isNull()Z

    .line 11
    move-result v0

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    :goto_0
    return-void

    .line 15
    .line 16
    .line 17
    :cond_1
    invoke-static {}, Lcom/tencent/imsdk/conversation/ConversationManager;->getInstance()Lcom/tencent/imsdk/conversation/ConversationManager;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p1}, Lcom/tencent/imsdk/conversation/ConversationManager;->unsubscribeUnreadMessageCountByFilter(Lcom/tencent/imsdk/conversation/ConversationListFilter;)V

    .line 22
    return-void
    .line 23
    .line 24
    .line 25
.end method
