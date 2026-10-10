.class public Lcom/tencent/imsdk/v2/V2TIMConversation;
.super Ljava/lang/Object;
.source "V2TIMConversation.java"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field static final CONVERSATION_C2C_PREFIX:Ljava/lang/String; = "c2c_"

.field static final CONVERSATION_C2C_TYPE:Ljava/lang/String; = "c2c"

.field static final CONVERSATION_GROUP_PREFIX:Ljava/lang/String; = "group_"

.field static final CONVERSATION_GROUP_TYPE:Ljava/lang/String; = "group"

.field public static final CONVERSATION_TYPE_INVALID:I = 0x0

.field public static final V2TIM_C2C:I = 0x1

.field public static V2TIM_CONVERSATION_MARK_TYPE_FOLD:J = 0x4L

.field public static V2TIM_CONVERSATION_MARK_TYPE_HIDE:J = 0x8L

.field public static V2TIM_CONVERSATION_MARK_TYPE_STAR:J = 0x1L

.field public static V2TIM_CONVERSATION_MARK_TYPE_UNREAD:J = 0x2L

.field public static final V2TIM_GROUP:I = 0x2


# instance fields
.field private conversation:Lcom/tencent/imsdk/conversation/Conversation;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
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
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    return-void
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
.end method


# virtual methods
.method public getC2CReadTimestamp()J
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMConversation;->conversation:Lcom/tencent/imsdk/conversation/Conversation;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    const-wide/16 v0, 0x0

    .line 7
    return-wide v0

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {v0}, Lcom/tencent/imsdk/conversation/Conversation;->getC2CReadTimestamp()J

    .line 11
    move-result-wide v0

    .line 12
    return-wide v0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public getConversationGroupList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMConversation;->conversation:Lcom/tencent/imsdk/conversation/Conversation;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    const/4 v0, 0x0

    .line 6
    return-object v0

    .line 7
    .line 8
    .line 9
    :cond_0
    invoke-virtual {v0}, Lcom/tencent/imsdk/conversation/Conversation;->getConversationGroupList()Ljava/util/List;

    .line 10
    move-result-object v0

    .line 11
    return-object v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public getConversationID()Ljava/lang/String;
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMConversation;->conversation:Lcom/tencent/imsdk/conversation/Conversation;

    .line 3
    .line 4
    if-eqz v0, :cond_2

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/tencent/imsdk/conversation/Conversation;->getConversationKey()Lcom/tencent/imsdk/conversation/ConversationKey;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/tencent/imsdk/conversation/ConversationKey;->getConversationType()I

    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x1

    .line 14
    .line 15
    if-ne v0, v1, :cond_0

    .line 16
    .line 17
    new-instance v0, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 21
    .line 22
    const-string v1, "c2c_"

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    iget-object v1, p0, Lcom/tencent/imsdk/v2/V2TIMConversation;->conversation:Lcom/tencent/imsdk/conversation/Conversation;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1}, Lcom/tencent/imsdk/conversation/Conversation;->getConversationKey()Lcom/tencent/imsdk/conversation/ConversationKey;

    .line 31
    move-result-object v1

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Lcom/tencent/imsdk/conversation/ConversationKey;->getConversationID()Ljava/lang/String;

    .line 35
    move-result-object v1

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    move-result-object v0

    .line 43
    return-object v0

    .line 44
    .line 45
    :cond_0
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMConversation;->conversation:Lcom/tencent/imsdk/conversation/Conversation;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Lcom/tencent/imsdk/conversation/Conversation;->getConversationKey()Lcom/tencent/imsdk/conversation/ConversationKey;

    .line 49
    move-result-object v0

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Lcom/tencent/imsdk/conversation/ConversationKey;->getConversationType()I

    .line 53
    move-result v0

    .line 54
    const/4 v1, 0x2

    .line 55
    .line 56
    if-ne v0, v1, :cond_1

    .line 57
    .line 58
    new-instance v0, Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 62
    .line 63
    const-string v1, "group_"

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    iget-object v1, p0, Lcom/tencent/imsdk/v2/V2TIMConversation;->conversation:Lcom/tencent/imsdk/conversation/Conversation;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1}, Lcom/tencent/imsdk/conversation/Conversation;->getConversationKey()Lcom/tencent/imsdk/conversation/ConversationKey;

    .line 72
    move-result-object v1

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1}, Lcom/tencent/imsdk/conversation/ConversationKey;->getConversationID()Ljava/lang/String;

    .line 76
    move-result-object v1

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 83
    move-result-object v0

    .line 84
    return-object v0

    .line 85
    .line 86
    :cond_1
    const-string v0, ""

    .line 87
    return-object v0

    .line 88
    :cond_2
    const/4 v0, 0x0

    .line 89
    return-object v0
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
.end method

.method public getCustomData()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMConversation;->conversation:Lcom/tencent/imsdk/conversation/Conversation;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    const/4 v0, 0x0

    .line 6
    return-object v0

    .line 7
    .line 8
    .line 9
    :cond_0
    invoke-virtual {v0}, Lcom/tencent/imsdk/conversation/Conversation;->getCustomData()Ljava/lang/String;

    .line 10
    move-result-object v0

    .line 11
    return-object v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public getDraftText()Ljava/lang/String;
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMConversation;->conversation:Lcom/tencent/imsdk/conversation/Conversation;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    return-object v1

    .line 7
    .line 8
    .line 9
    :cond_0
    invoke-virtual {v0}, Lcom/tencent/imsdk/conversation/Conversation;->getDraftMessage()Lcom/tencent/imsdk/message/DraftMessage;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    return-object v1

    .line 14
    .line 15
    .line 16
    :cond_1
    invoke-virtual {v0}, Lcom/tencent/imsdk/message/DraftMessage;->getUserDefinedData()[B

    .line 17
    move-result-object v0

    .line 18
    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    new-instance v1, Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    invoke-direct {v1, v0}, Ljava/lang/String;-><init>([B)V

    .line 25
    :cond_2
    return-object v1
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

.method public getDraftTimestamp()J
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMConversation;->conversation:Lcom/tencent/imsdk/conversation/Conversation;

    .line 3
    .line 4
    const-wide/16 v1, 0x0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    return-wide v1

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {v0}, Lcom/tencent/imsdk/conversation/Conversation;->getDraftMessage()Lcom/tencent/imsdk/message/DraftMessage;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    if-nez v0, :cond_1

    .line 14
    return-wide v1

    .line 15
    .line 16
    .line 17
    :cond_1
    invoke-virtual {v0}, Lcom/tencent/imsdk/message/DraftMessage;->getEditTime()J

    .line 18
    move-result-wide v0

    .line 19
    return-wide v0
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
.end method

.method public getFaceUrl()Ljava/lang/String;
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMConversation;->conversation:Lcom/tencent/imsdk/conversation/Conversation;

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMConversation;->getType()I

    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x1

    .line 10
    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMConversation;->conversation:Lcom/tencent/imsdk/conversation/Conversation;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/tencent/imsdk/conversation/Conversation;->getC2cFaceUrl()Ljava/lang/String;

    .line 17
    move-result-object v0

    .line 18
    return-object v0

    .line 19
    .line 20
    .line 21
    :cond_0
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMConversation;->getType()I

    .line 22
    move-result v0

    .line 23
    const/4 v1, 0x2

    .line 24
    .line 25
    if-ne v0, v1, :cond_1

    .line 26
    .line 27
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMConversation;->conversation:Lcom/tencent/imsdk/conversation/Conversation;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Lcom/tencent/imsdk/conversation/Conversation;->getGroupFaceUrl()Ljava/lang/String;

    .line 31
    move-result-object v0

    .line 32
    return-object v0

    .line 33
    :cond_1
    const/4 v0, 0x0

    .line 34
    return-object v0
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

.method public getGroupAtInfoList()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/tencent/imsdk/v2/V2TIMGroupAtInfo;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMConversation;->conversation:Lcom/tencent/imsdk/conversation/Conversation;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Ljava/util/ArrayList;

    .line 7
    .line 8
    .line 9
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 10
    return-object v0

    .line 11
    .line 12
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 13
    .line 14
    .line 15
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 16
    .line 17
    iget-object v1, p0, Lcom/tencent/imsdk/v2/V2TIMConversation;->conversation:Lcom/tencent/imsdk/conversation/Conversation;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, Lcom/tencent/imsdk/conversation/Conversation;->getConversationAtInfoList()Ljava/util/List;

    .line 21
    move-result-object v1

    .line 22
    .line 23
    .line 24
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 25
    move-result-object v1

    .line 26
    .line 27
    .line 28
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    move-result v2

    .line 30
    .line 31
    if-eqz v2, :cond_1

    .line 32
    .line 33
    .line 34
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    move-result-object v2

    .line 36
    .line 37
    check-cast v2, Lcom/tencent/imsdk/conversation/ConversationAtInfo;

    .line 38
    .line 39
    new-instance v3, Lcom/tencent/imsdk/v2/V2TIMGroupAtInfo;

    .line 40
    .line 41
    .line 42
    invoke-direct {v3}, Lcom/tencent/imsdk/v2/V2TIMGroupAtInfo;-><init>()V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v3, v2}, Lcom/tencent/imsdk/v2/V2TIMGroupAtInfo;->setConversationGroupAtInfo(Lcom/tencent/imsdk/conversation/ConversationAtInfo;)V

    .line 46
    .line 47
    .line 48
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 49
    goto :goto_0

    .line 50
    :cond_1
    return-object v0
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
.end method

.method public getGroupID()Ljava/lang/String;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMConversation;->conversation:Lcom/tencent/imsdk/conversation/Conversation;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    return-object v1

    .line 7
    .line 8
    .line 9
    :cond_0
    invoke-virtual {v0}, Lcom/tencent/imsdk/conversation/Conversation;->getConversationType()I

    .line 10
    move-result v0

    .line 11
    const/4 v2, 0x2

    .line 12
    .line 13
    if-ne v0, v2, :cond_1

    .line 14
    .line 15
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMConversation;->conversation:Lcom/tencent/imsdk/conversation/Conversation;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/tencent/imsdk/conversation/Conversation;->getGroupID()Ljava/lang/String;

    .line 19
    move-result-object v0

    .line 20
    return-object v0

    .line 21
    :cond_1
    return-object v1
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

.method public getGroupReadSequence()J
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMConversation;->conversation:Lcom/tencent/imsdk/conversation/Conversation;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    const-wide/16 v0, 0x0

    .line 7
    return-wide v0

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {v0}, Lcom/tencent/imsdk/conversation/Conversation;->getGroupReadSequence()J

    .line 11
    move-result-wide v0

    .line 12
    return-wide v0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public getGroupType()Ljava/lang/String;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMConversation;->conversation:Lcom/tencent/imsdk/conversation/Conversation;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    return-object v1

    .line 7
    .line 8
    .line 9
    :cond_0
    invoke-virtual {v0}, Lcom/tencent/imsdk/conversation/Conversation;->getGroupType()Ljava/lang/String;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 14
    move-result v2

    .line 15
    .line 16
    if-eqz v2, :cond_1

    .line 17
    return-object v1

    .line 18
    .line 19
    :cond_1
    const-string v1, "Private"

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 23
    move-result v1

    .line 24
    .line 25
    if-eqz v1, :cond_2

    .line 26
    .line 27
    const-string v0, "Work"

    .line 28
    return-object v0

    .line 29
    .line 30
    :cond_2
    const-string v1, "ChatRoom"

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 34
    move-result v1

    .line 35
    .line 36
    if-eqz v1, :cond_3

    .line 37
    .line 38
    const-string v0, "Meeting"

    .line 39
    :cond_3
    return-object v0
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

.method public getLastMessage()Lcom/tencent/imsdk/v2/V2TIMMessage;
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMConversation;->conversation:Lcom/tencent/imsdk/conversation/Conversation;

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/tencent/imsdk/conversation/Conversation;->getLastMessage()Lcom/tencent/imsdk/message/Message;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    goto :goto_0

    .line 12
    .line 13
    :cond_0
    new-instance v0, Lcom/tencent/imsdk/v2/V2TIMMessage;

    .line 14
    .line 15
    .line 16
    invoke-direct {v0}, Lcom/tencent/imsdk/v2/V2TIMMessage;-><init>()V

    .line 17
    .line 18
    iget-object v1, p0, Lcom/tencent/imsdk/v2/V2TIMConversation;->conversation:Lcom/tencent/imsdk/conversation/Conversation;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, Lcom/tencent/imsdk/conversation/Conversation;->getLastMessage()Lcom/tencent/imsdk/message/Message;

    .line 22
    move-result-object v1

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, Lcom/tencent/imsdk/v2/V2TIMMessage;->setMessage(Lcom/tencent/imsdk/message/Message;)V

    .line 26
    return-object v0

    .line 27
    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 28
    return-object v0
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

.method public getMarkList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMConversation;->conversation:Lcom/tencent/imsdk/conversation/Conversation;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    const/4 v0, 0x0

    .line 6
    return-object v0

    .line 7
    .line 8
    .line 9
    :cond_0
    invoke-virtual {v0}, Lcom/tencent/imsdk/conversation/Conversation;->getMarkList()Ljava/util/List;

    .line 10
    move-result-object v0

    .line 11
    return-object v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public getOrderKey()J
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMConversation;->conversation:Lcom/tencent/imsdk/conversation/Conversation;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    const-wide/16 v0, 0x0

    .line 7
    return-wide v0

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {v0}, Lcom/tencent/imsdk/conversation/Conversation;->getOrderKey()J

    .line 11
    move-result-wide v0

    .line 12
    return-wide v0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public getRecvOpt()I
    .locals 6

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMConversation;->conversation:Lcom/tencent/imsdk/conversation/Conversation;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-eqz v0, :cond_6

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMConversation;->getType()I

    .line 9
    move-result v0

    .line 10
    const/4 v2, 0x3

    .line 11
    const/4 v3, 0x2

    .line 12
    const/4 v4, 0x1

    .line 13
    .line 14
    if-ne v0, v4, :cond_2

    .line 15
    .line 16
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMConversation;->conversation:Lcom/tencent/imsdk/conversation/Conversation;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/tencent/imsdk/conversation/Conversation;->getUserMessageReceiveOption()I

    .line 20
    move-result v0

    .line 21
    .line 22
    if-ne v0, v4, :cond_0

    .line 23
    return v1

    .line 24
    .line 25
    :cond_0
    if-ne v0, v3, :cond_1

    .line 26
    return v4

    .line 27
    .line 28
    :cond_1
    if-ne v0, v2, :cond_6

    .line 29
    return v3

    .line 30
    .line 31
    .line 32
    :cond_2
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMConversation;->getType()I

    .line 33
    move-result v0

    .line 34
    .line 35
    if-ne v0, v3, :cond_6

    .line 36
    .line 37
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMConversation;->conversation:Lcom/tencent/imsdk/conversation/Conversation;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Lcom/tencent/imsdk/conversation/Conversation;->getGroupMessageReceiveOption()I

    .line 41
    move-result v0

    .line 42
    .line 43
    sget v5, Lcom/tencent/imsdk/group/GroupMemberInfo;->MESSAGE_RECEIVE_OPTION_AUTO_RECEIVE:I

    .line 44
    .line 45
    if-ne v0, v5, :cond_3

    .line 46
    return v1

    .line 47
    .line 48
    :cond_3
    sget v5, Lcom/tencent/imsdk/group/GroupMemberInfo;->MESSAGE_RECEIVE_OPTION_NOT_RECEIVE:I

    .line 49
    .line 50
    if-ne v0, v5, :cond_4

    .line 51
    return v4

    .line 52
    .line 53
    :cond_4
    sget v4, Lcom/tencent/imsdk/group/GroupMemberInfo;->MESSAGE_RECEIVE_OPTION_RECEIVE_WITH_NO_OFFLINE_PUSH:I

    .line 54
    .line 55
    if-ne v0, v4, :cond_5

    .line 56
    return v3

    .line 57
    .line 58
    :cond_5
    sget v3, Lcom/tencent/imsdk/group/GroupMemberInfo;->MESSAGE_RECEIVE_OPTION_RECEIVE_WITH_NO_OFFLINE_PUSH_EXCEPT_AT:I

    .line 59
    .line 60
    if-ne v0, v3, :cond_6

    .line 61
    return v2

    .line 62
    :cond_6
    return v1
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
.end method

.method public getShowName()Ljava/lang/String;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMConversation;->conversation:Lcom/tencent/imsdk/conversation/Conversation;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    return-object v1

    .line 7
    .line 8
    .line 9
    :cond_0
    invoke-virtual {v0}, Lcom/tencent/imsdk/conversation/Conversation;->getConversationType()I

    .line 10
    move-result v0

    .line 11
    const/4 v2, 0x2

    .line 12
    .line 13
    if-ne v0, v2, :cond_2

    .line 14
    .line 15
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMConversation;->conversation:Lcom/tencent/imsdk/conversation/Conversation;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/tencent/imsdk/conversation/Conversation;->getGroupName()Ljava/lang/String;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    .line 22
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 23
    move-result v0

    .line 24
    .line 25
    if-nez v0, :cond_1

    .line 26
    .line 27
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMConversation;->conversation:Lcom/tencent/imsdk/conversation/Conversation;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Lcom/tencent/imsdk/conversation/Conversation;->getGroupName()Ljava/lang/String;

    .line 31
    move-result-object v0

    .line 32
    return-object v0

    .line 33
    .line 34
    :cond_1
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMConversation;->conversation:Lcom/tencent/imsdk/conversation/Conversation;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Lcom/tencent/imsdk/conversation/Conversation;->getGroupID()Ljava/lang/String;

    .line 38
    move-result-object v0

    .line 39
    return-object v0

    .line 40
    .line 41
    :cond_2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMConversation;->conversation:Lcom/tencent/imsdk/conversation/Conversation;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Lcom/tencent/imsdk/conversation/Conversation;->getConversationType()I

    .line 45
    move-result v0

    .line 46
    const/4 v2, 0x1

    .line 47
    .line 48
    if-ne v0, v2, :cond_5

    .line 49
    .line 50
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMConversation;->conversation:Lcom/tencent/imsdk/conversation/Conversation;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0}, Lcom/tencent/imsdk/conversation/Conversation;->getC2cRemark()Ljava/lang/String;

    .line 54
    move-result-object v0

    .line 55
    .line 56
    .line 57
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 58
    move-result v0

    .line 59
    .line 60
    if-nez v0, :cond_3

    .line 61
    .line 62
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMConversation;->conversation:Lcom/tencent/imsdk/conversation/Conversation;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0}, Lcom/tencent/imsdk/conversation/Conversation;->getC2cRemark()Ljava/lang/String;

    .line 66
    move-result-object v0

    .line 67
    return-object v0

    .line 68
    .line 69
    :cond_3
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMConversation;->conversation:Lcom/tencent/imsdk/conversation/Conversation;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0}, Lcom/tencent/imsdk/conversation/Conversation;->getC2cNickname()Ljava/lang/String;

    .line 73
    move-result-object v0

    .line 74
    .line 75
    .line 76
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 77
    move-result v0

    .line 78
    .line 79
    if-nez v0, :cond_4

    .line 80
    .line 81
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMConversation;->conversation:Lcom/tencent/imsdk/conversation/Conversation;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0}, Lcom/tencent/imsdk/conversation/Conversation;->getC2cNickname()Ljava/lang/String;

    .line 85
    move-result-object v0

    .line 86
    return-object v0

    .line 87
    .line 88
    :cond_4
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMConversation;->conversation:Lcom/tencent/imsdk/conversation/Conversation;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0}, Lcom/tencent/imsdk/conversation/Conversation;->getC2cUserID()Ljava/lang/String;

    .line 92
    move-result-object v0

    .line 93
    return-object v0

    .line 94
    :cond_5
    return-object v1
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
.end method

.method public getType()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMConversation;->conversation:Lcom/tencent/imsdk/conversation/Conversation;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/tencent/imsdk/conversation/Conversation;->getConversationType()I

    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public getUnreadCount()I
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMConversation;->conversation:Lcom/tencent/imsdk/conversation/Conversation;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/tencent/imsdk/conversation/Conversation;->getUnreadMessageCount()J

    .line 8
    move-result-wide v0

    .line 9
    long-to-int v0, v0

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public getUserID()Ljava/lang/String;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMConversation;->conversation:Lcom/tencent/imsdk/conversation/Conversation;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    return-object v1

    .line 7
    .line 8
    .line 9
    :cond_0
    invoke-virtual {v0}, Lcom/tencent/imsdk/conversation/Conversation;->getConversationType()I

    .line 10
    move-result v0

    .line 11
    const/4 v2, 0x1

    .line 12
    .line 13
    if-ne v0, v2, :cond_1

    .line 14
    .line 15
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMConversation;->conversation:Lcom/tencent/imsdk/conversation/Conversation;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/tencent/imsdk/conversation/Conversation;->getC2cUserID()Ljava/lang/String;

    .line 19
    move-result-object v0

    .line 20
    return-object v0

    .line 21
    :cond_1
    return-object v1
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

.method public isPinned()Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMConversation;->conversation:Lcom/tencent/imsdk/conversation/Conversation;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    const/4 v0, 0x0

    .line 6
    return v0

    .line 7
    .line 8
    .line 9
    :cond_0
    invoke-virtual {v0}, Lcom/tencent/imsdk/conversation/Conversation;->isPinned()Z

    .line 10
    move-result v0

    .line 11
    return v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public setConversation(Lcom/tencent/imsdk/conversation/Conversation;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/imsdk/v2/V2TIMConversation;->conversation:Lcom/tencent/imsdk/conversation/Conversation;

    .line 3
    return-void
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
