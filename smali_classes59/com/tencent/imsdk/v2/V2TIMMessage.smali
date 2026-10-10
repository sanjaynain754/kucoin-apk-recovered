.class public Lcom/tencent/imsdk/v2/V2TIMMessage;
.super Ljava/lang/Object;
.source "V2TIMMessage.java"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final V2TIM_ELEM_TYPE_CUSTOM:I = 0x2

.field public static final V2TIM_ELEM_TYPE_FACE:I = 0x8

.field public static final V2TIM_ELEM_TYPE_FILE:I = 0x6

.field public static final V2TIM_ELEM_TYPE_GROUP_TIPS:I = 0x9

.field public static final V2TIM_ELEM_TYPE_IMAGE:I = 0x3

.field public static final V2TIM_ELEM_TYPE_LOCATION:I = 0x7

.field public static final V2TIM_ELEM_TYPE_MERGER:I = 0xa

.field public static final V2TIM_ELEM_TYPE_NONE:I = 0x0

.field public static final V2TIM_ELEM_TYPE_SOUND:I = 0x4

.field public static final V2TIM_ELEM_TYPE_STREAM:I = 0xb

.field public static final V2TIM_ELEM_TYPE_TEXT:I = 0x1

.field public static final V2TIM_ELEM_TYPE_VIDEO:I = 0x5

.field public static final V2TIM_GROUP_MESSAGE_READ_MEMBERS_FILTER_READ:I = 0x0

.field public static final V2TIM_GROUP_MESSAGE_READ_MEMBERS_FILTER_UNREAD:I = 0x1

.field public static final V2TIM_MSG_STATUS_HAS_DELETED:I = 0x4

.field public static final V2TIM_MSG_STATUS_LOCAL_IMPORTED:I = 0x5

.field public static final V2TIM_MSG_STATUS_LOCAL_REVOKED:I = 0x6

.field public static final V2TIM_MSG_STATUS_SENDING:I = 0x1

.field public static final V2TIM_MSG_STATUS_SEND_FAIL:I = 0x3

.field public static final V2TIM_MSG_STATUS_SEND_SUCC:I = 0x2

.field private static final V2TIM_MSG_STATUS_UNKNOWN:I = 0x0

.field public static final V2TIM_NOT_RECEIVE_MESSAGE:I = 0x1

.field public static final V2TIM_NOT_RECEIVE_MESSAGE_EXCEPT_AT:I = 0x4

.field public static final V2TIM_PRIORITY_DEFAULT:I = 0x0

.field public static final V2TIM_PRIORITY_HIGH:I = 0x1

.field public static final V2TIM_PRIORITY_LOW:I = 0x3

.field public static final V2TIM_PRIORITY_NORMAL:I = 0x2

.field public static final V2TIM_RECEIVE_MESSAGE:I = 0x0

.field public static final V2TIM_RECEIVE_NOT_NOTIFY_MESSAGE:I = 0x2

.field public static final V2TIM_RECEIVE_NOT_NOTIFY_MESSAGE_EXCEPT_AT:I = 0x3


# instance fields
.field private message:Lcom/tencent/imsdk/message/Message;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/tencent/imsdk/message/Message;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Lcom/tencent/imsdk/message/Message;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMMessage;->message:Lcom/tencent/imsdk/message/Message;

    .line 11
    .line 12
    .line 13
    invoke-static {}, Lcom/tencent/imsdk/manager/BaseManager;->getInstance()Lcom/tencent/imsdk/manager/BaseManager;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1}, Lcom/tencent/imsdk/manager/BaseManager;->getServerTime()J

    .line 18
    move-result-wide v1

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1, v2}, Lcom/tencent/imsdk/message/Message;->setClientTime(J)V

    .line 22
    return-void
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
.method public getCloudCustomData()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMMessage;->message:Lcom/tencent/imsdk/message/Message;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    const-string v0, ""

    .line 7
    return-object v0

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {v0}, Lcom/tencent/imsdk/message/Message;->getCloudCustomString()Ljava/lang/String;

    .line 11
    move-result-object v0

    .line 12
    return-object v0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public getCustomElem()Lcom/tencent/imsdk/v2/V2TIMCustomElem;
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getElemType()I

    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    return-object v1

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getElemType()I

    .line 12
    move-result v0

    .line 13
    const/4 v2, 0x2

    .line 14
    .line 15
    if-ne v0, v2, :cond_1

    .line 16
    .line 17
    new-instance v0, Lcom/tencent/imsdk/v2/V2TIMCustomElem;

    .line 18
    .line 19
    .line 20
    invoke-direct {v0}, Lcom/tencent/imsdk/v2/V2TIMCustomElem;-><init>()V

    .line 21
    .line 22
    iget-object v1, p0, Lcom/tencent/imsdk/v2/V2TIMMessage;->message:Lcom/tencent/imsdk/message/Message;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, Lcom/tencent/imsdk/v2/V2TIMElem;->setMessage(Lcom/tencent/imsdk/message/Message;)V

    .line 26
    const/4 v1, 0x0

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v1}, Lcom/tencent/imsdk/v2/V2TIMElem;->setElemIndex(I)V

    .line 30
    return-object v0

    .line 31
    :cond_1
    return-object v1
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

.method public getCustomModerationConfigurationID()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMMessage;->message:Lcom/tencent/imsdk/message/Message;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    const-string v0, ""

    .line 7
    return-object v0

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {v0}, Lcom/tencent/imsdk/message/Message;->getCustomModerationConfigurationID()Ljava/lang/String;

    .line 11
    move-result-object v0

    .line 12
    return-object v0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public getElemType()I
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMMessage;->message:Lcom/tencent/imsdk/message/Message;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    goto :goto_0

    .line 7
    .line 8
    .line 9
    :cond_0
    invoke-virtual {v0}, Lcom/tencent/imsdk/message/Message;->getMessageBaseElements()Ljava/util/List;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 14
    move-result v0

    .line 15
    .line 16
    if-gtz v0, :cond_1

    .line 17
    goto :goto_0

    .line 18
    .line 19
    :cond_1
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMMessage;->message:Lcom/tencent/imsdk/message/Message;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Lcom/tencent/imsdk/message/Message;->getMessageBaseElements()Ljava/util/List;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    .line 26
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 27
    move-result-object v0

    .line 28
    .line 29
    check-cast v0, Lcom/tencent/imsdk/message/MessageBaseElement;

    .line 30
    .line 31
    instance-of v2, v0, Lcom/tencent/imsdk/message/TextElement;

    .line 32
    .line 33
    if-eqz v2, :cond_2

    .line 34
    const/4 v0, 0x1

    .line 35
    return v0

    .line 36
    .line 37
    :cond_2
    instance-of v2, v0, Lcom/tencent/imsdk/message/ImageElement;

    .line 38
    .line 39
    if-eqz v2, :cond_3

    .line 40
    const/4 v0, 0x3

    .line 41
    return v0

    .line 42
    .line 43
    :cond_3
    instance-of v2, v0, Lcom/tencent/imsdk/message/VideoElement;

    .line 44
    .line 45
    if-eqz v2, :cond_4

    .line 46
    const/4 v0, 0x5

    .line 47
    return v0

    .line 48
    .line 49
    :cond_4
    instance-of v2, v0, Lcom/tencent/imsdk/message/SoundElement;

    .line 50
    .line 51
    if-eqz v2, :cond_5

    .line 52
    const/4 v0, 0x4

    .line 53
    return v0

    .line 54
    .line 55
    :cond_5
    instance-of v2, v0, Lcom/tencent/imsdk/message/FaceElement;

    .line 56
    .line 57
    if-eqz v2, :cond_6

    .line 58
    .line 59
    const/16 v0, 0x8

    .line 60
    return v0

    .line 61
    .line 62
    :cond_6
    instance-of v2, v0, Lcom/tencent/imsdk/message/FileElement;

    .line 63
    .line 64
    if-eqz v2, :cond_7

    .line 65
    const/4 v0, 0x6

    .line 66
    return v0

    .line 67
    .line 68
    :cond_7
    instance-of v2, v0, Lcom/tencent/imsdk/message/CustomElement;

    .line 69
    .line 70
    if-eqz v2, :cond_8

    .line 71
    const/4 v0, 0x2

    .line 72
    return v0

    .line 73
    .line 74
    :cond_8
    instance-of v2, v0, Lcom/tencent/imsdk/message/LocationElement;

    .line 75
    .line 76
    if-eqz v2, :cond_9

    .line 77
    const/4 v0, 0x7

    .line 78
    return v0

    .line 79
    .line 80
    :cond_9
    instance-of v2, v0, Lcom/tencent/imsdk/message/GroupTipsElement;

    .line 81
    .line 82
    if-eqz v2, :cond_a

    .line 83
    .line 84
    const/16 v0, 0x9

    .line 85
    return v0

    .line 86
    .line 87
    :cond_a
    instance-of v2, v0, Lcom/tencent/imsdk/message/MergerElement;

    .line 88
    .line 89
    if-eqz v2, :cond_b

    .line 90
    .line 91
    const/16 v0, 0xa

    .line 92
    return v0

    .line 93
    .line 94
    :cond_b
    instance-of v0, v0, Lcom/tencent/imsdk/message/StreamElement;

    .line 95
    .line 96
    if-eqz v0, :cond_c

    .line 97
    .line 98
    const/16 v0, 0xb

    .line 99
    return v0

    .line 100
    :cond_c
    :goto_0
    return v1
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

.method public getFaceElem()Lcom/tencent/imsdk/v2/V2TIMFaceElem;
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getElemType()I

    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    return-object v1

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getElemType()I

    .line 12
    move-result v0

    .line 13
    .line 14
    const/16 v2, 0x8

    .line 15
    .line 16
    if-ne v0, v2, :cond_1

    .line 17
    .line 18
    new-instance v0, Lcom/tencent/imsdk/v2/V2TIMFaceElem;

    .line 19
    .line 20
    .line 21
    invoke-direct {v0}, Lcom/tencent/imsdk/v2/V2TIMFaceElem;-><init>()V

    .line 22
    .line 23
    iget-object v1, p0, Lcom/tencent/imsdk/v2/V2TIMMessage;->message:Lcom/tencent/imsdk/message/Message;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v1}, Lcom/tencent/imsdk/v2/V2TIMElem;->setMessage(Lcom/tencent/imsdk/message/Message;)V

    .line 27
    const/4 v1, 0x0

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v1}, Lcom/tencent/imsdk/v2/V2TIMElem;->setElemIndex(I)V

    .line 31
    return-object v0

    .line 32
    :cond_1
    return-object v1
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
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMMessage;->message:Lcom/tencent/imsdk/message/Message;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/tencent/imsdk/message/Message;->getFaceUrl()Ljava/lang/String;

    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public getFileElem()Lcom/tencent/imsdk/v2/V2TIMFileElem;
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getElemType()I

    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    return-object v1

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getElemType()I

    .line 12
    move-result v0

    .line 13
    const/4 v2, 0x6

    .line 14
    .line 15
    if-ne v0, v2, :cond_1

    .line 16
    .line 17
    new-instance v0, Lcom/tencent/imsdk/v2/V2TIMFileElem;

    .line 18
    .line 19
    .line 20
    invoke-direct {v0}, Lcom/tencent/imsdk/v2/V2TIMFileElem;-><init>()V

    .line 21
    .line 22
    iget-object v1, p0, Lcom/tencent/imsdk/v2/V2TIMMessage;->message:Lcom/tencent/imsdk/message/Message;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, Lcom/tencent/imsdk/v2/V2TIMElem;->setMessage(Lcom/tencent/imsdk/message/Message;)V

    .line 26
    const/4 v1, 0x0

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v1}, Lcom/tencent/imsdk/v2/V2TIMElem;->setElemIndex(I)V

    .line 30
    return-object v0

    .line 31
    :cond_1
    return-object v1
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

.method public getFriendRemark()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMMessage;->message:Lcom/tencent/imsdk/message/Message;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/tencent/imsdk/message/Message;->getFriendRemark()Ljava/lang/String;

    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public getGroupAtUserList()Ljava/util/List;
    .locals 3
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
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMMessage;->message:Lcom/tencent/imsdk/message/Message;

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
    .line 13
    :cond_0
    invoke-virtual {v0}, Lcom/tencent/imsdk/message/Message;->getMessageGroupAtInfoList()Ljava/util/List;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    new-instance v1, Ljava/util/ArrayList;

    .line 17
    .line 18
    .line 19
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    .line 26
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    move-result v2

    .line 28
    .line 29
    if-eqz v2, :cond_1

    .line 30
    .line 31
    .line 32
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    move-result-object v2

    .line 34
    .line 35
    check-cast v2, Lcom/tencent/imsdk/message/MessageAtInfo;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2}, Lcom/tencent/imsdk/message/MessageAtInfo;->getAtUserID()Ljava/lang/String;

    .line 39
    move-result-object v2

    .line 40
    .line 41
    .line 42
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 43
    goto :goto_0

    .line 44
    :cond_1
    return-object v1
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

.method public getGroupID()Ljava/lang/String;
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMMessage;->message:Lcom/tencent/imsdk/message/Message;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/tencent/imsdk/message/Message;->getMessageType()I

    .line 8
    move-result v0

    .line 9
    .line 10
    sget v1, Lcom/tencent/imsdk/message/Message;->MESSAGE_TYPE_GROUP:I

    .line 11
    .line 12
    if-ne v0, v1, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMMessage;->message:Lcom/tencent/imsdk/message/Message;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/tencent/imsdk/message/Message;->getGroupID()Ljava/lang/String;

    .line 18
    move-result-object v0

    .line 19
    return-object v0

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    return-object v0
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

.method public getGroupTipsElem()Lcom/tencent/imsdk/v2/V2TIMGroupTipsElem;
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getElemType()I

    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    return-object v1

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getElemType()I

    .line 12
    move-result v0

    .line 13
    .line 14
    const/16 v2, 0x9

    .line 15
    .line 16
    if-ne v0, v2, :cond_1

    .line 17
    .line 18
    new-instance v0, Lcom/tencent/imsdk/v2/V2TIMGroupTipsElem;

    .line 19
    .line 20
    .line 21
    invoke-direct {v0}, Lcom/tencent/imsdk/v2/V2TIMGroupTipsElem;-><init>()V

    .line 22
    .line 23
    iget-object v1, p0, Lcom/tencent/imsdk/v2/V2TIMMessage;->message:Lcom/tencent/imsdk/message/Message;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v1}, Lcom/tencent/imsdk/v2/V2TIMElem;->setMessage(Lcom/tencent/imsdk/message/Message;)V

    .line 27
    const/4 v1, 0x0

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v1}, Lcom/tencent/imsdk/v2/V2TIMElem;->setElemIndex(I)V

    .line 31
    return-object v0

    .line 32
    :cond_1
    return-object v1
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

.method public getImageElem()Lcom/tencent/imsdk/v2/V2TIMImageElem;
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getElemType()I

    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    return-object v1

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getElemType()I

    .line 12
    move-result v0

    .line 13
    const/4 v2, 0x3

    .line 14
    .line 15
    if-ne v0, v2, :cond_1

    .line 16
    .line 17
    new-instance v0, Lcom/tencent/imsdk/v2/V2TIMImageElem;

    .line 18
    .line 19
    .line 20
    invoke-direct {v0}, Lcom/tencent/imsdk/v2/V2TIMImageElem;-><init>()V

    .line 21
    .line 22
    iget-object v1, p0, Lcom/tencent/imsdk/v2/V2TIMMessage;->message:Lcom/tencent/imsdk/message/Message;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, Lcom/tencent/imsdk/v2/V2TIMElem;->setMessage(Lcom/tencent/imsdk/message/Message;)V

    .line 26
    const/4 v1, 0x0

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v1}, Lcom/tencent/imsdk/v2/V2TIMElem;->setElemIndex(I)V

    .line 30
    return-object v0

    .line 31
    :cond_1
    return-object v1
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

.method public getLocalCustomData()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMMessage;->message:Lcom/tencent/imsdk/message/Message;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    const-string v0, ""

    .line 7
    return-object v0

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {v0}, Lcom/tencent/imsdk/message/Message;->getLocalCustomString()Ljava/lang/String;

    .line 11
    move-result-object v0

    .line 12
    return-object v0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public getLocalCustomInt()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMMessage;->message:Lcom/tencent/imsdk/message/Message;

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
    invoke-virtual {v0}, Lcom/tencent/imsdk/message/Message;->getLocalCustomNumber()I

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

.method public getLocationElem()Lcom/tencent/imsdk/v2/V2TIMLocationElem;
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getElemType()I

    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    return-object v1

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getElemType()I

    .line 12
    move-result v0

    .line 13
    const/4 v2, 0x7

    .line 14
    .line 15
    if-ne v0, v2, :cond_1

    .line 16
    .line 17
    new-instance v0, Lcom/tencent/imsdk/v2/V2TIMLocationElem;

    .line 18
    .line 19
    .line 20
    invoke-direct {v0}, Lcom/tencent/imsdk/v2/V2TIMLocationElem;-><init>()V

    .line 21
    .line 22
    iget-object v1, p0, Lcom/tencent/imsdk/v2/V2TIMMessage;->message:Lcom/tencent/imsdk/message/Message;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, Lcom/tencent/imsdk/v2/V2TIMElem;->setMessage(Lcom/tencent/imsdk/message/Message;)V

    .line 26
    const/4 v1, 0x0

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v1}, Lcom/tencent/imsdk/v2/V2TIMElem;->setElemIndex(I)V

    .line 30
    return-object v0

    .line 31
    :cond_1
    return-object v1
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

.method public getMergerElem()Lcom/tencent/imsdk/v2/V2TIMMergerElem;
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getElemType()I

    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    return-object v1

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getElemType()I

    .line 12
    move-result v0

    .line 13
    .line 14
    const/16 v2, 0xa

    .line 15
    .line 16
    if-ne v0, v2, :cond_1

    .line 17
    .line 18
    new-instance v0, Lcom/tencent/imsdk/v2/V2TIMMergerElem;

    .line 19
    .line 20
    .line 21
    invoke-direct {v0}, Lcom/tencent/imsdk/v2/V2TIMMergerElem;-><init>()V

    .line 22
    .line 23
    iget-object v1, p0, Lcom/tencent/imsdk/v2/V2TIMMessage;->message:Lcom/tencent/imsdk/message/Message;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v1}, Lcom/tencent/imsdk/v2/V2TIMElem;->setMessage(Lcom/tencent/imsdk/message/Message;)V

    .line 27
    const/4 v1, 0x0

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v1}, Lcom/tencent/imsdk/v2/V2TIMElem;->setElemIndex(I)V

    .line 31
    return-object v0

    .line 32
    :cond_1
    return-object v1
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

.method public getMessage()Lcom/tencent/imsdk/message/Message;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMMessage;->message:Lcom/tencent/imsdk/message/Message;

    .line 3
    return-object v0
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

.method public getMessageQuoteInfo()Lcom/tencent/imsdk/v2/V2TIMMessageQuoteInfo;
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMMessage;->message:Lcom/tencent/imsdk/message/Message;

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
    invoke-virtual {v0}, Lcom/tencent/imsdk/message/Message;->getQuoteInfo()Lcom/tencent/imsdk/message/MessageQuoteInfo;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    return-object v1

    .line 14
    .line 15
    :cond_1
    new-instance v1, Lcom/tencent/imsdk/v2/V2TIMMessageQuoteInfo;

    .line 16
    .line 17
    .line 18
    invoke-direct {v1}, Lcom/tencent/imsdk/v2/V2TIMMessageQuoteInfo;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, v0}, Lcom/tencent/imsdk/v2/V2TIMMessageQuoteInfo;->setMessageQuoteInfo(Lcom/tencent/imsdk/message/MessageQuoteInfo;)V

    .line 22
    return-object v1
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

.method public getMsgID()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMMessage;->message:Lcom/tencent/imsdk/message/Message;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/tencent/imsdk/message/Message;->getMsgID()Ljava/lang/String;

    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    .line 11
    :cond_0
    const-string v0, ""

    .line 12
    return-object v0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public getNameCard()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMMessage;->message:Lcom/tencent/imsdk/message/Message;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/tencent/imsdk/message/Message;->getNameCard()Ljava/lang/String;

    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public getNickName()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMMessage;->message:Lcom/tencent/imsdk/message/Message;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/tencent/imsdk/message/Message;->getNickName()Ljava/lang/String;

    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public getOfflinePushInfo()Lcom/tencent/imsdk/v2/V2TIMOfflinePushInfo;
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMMessage;->message:Lcom/tencent/imsdk/message/Message;

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
    invoke-virtual {v0}, Lcom/tencent/imsdk/message/Message;->getOfflinePushInfo()Lcom/tencent/imsdk/message/MessageOfflinePushInfo;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    new-instance v1, Lcom/tencent/imsdk/v2/V2TIMOfflinePushInfo;

    .line 13
    .line 14
    .line 15
    invoke-direct {v1}, Lcom/tencent/imsdk/v2/V2TIMOfflinePushInfo;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, v0}, Lcom/tencent/imsdk/v2/V2TIMOfflinePushInfo;->setMessageOfflinePushInfo(Lcom/tencent/imsdk/message/MessageOfflinePushInfo;)V

    .line 19
    return-object v1
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

.method public getPinnerInfo()Lcom/tencent/imsdk/v2/V2TIMGroupMemberFullInfo;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMMessage;->message:Lcom/tencent/imsdk/message/Message;

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
    invoke-virtual {v0}, Lcom/tencent/imsdk/message/Message;->getPinnerInfo()Lcom/tencent/imsdk/group/GroupMemberInfo;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    if-eqz v0, :cond_2

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/tencent/imsdk/group/GroupMemberInfo;->getUserID()Ljava/lang/String;

    .line 16
    move-result-object v2

    .line 17
    .line 18
    .line 19
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 20
    move-result v2

    .line 21
    .line 22
    if-eqz v2, :cond_1

    .line 23
    goto :goto_0

    .line 24
    .line 25
    :cond_1
    new-instance v1, Lcom/tencent/imsdk/v2/V2TIMGroupMemberFullInfo;

    .line 26
    .line 27
    .line 28
    invoke-direct {v1}, Lcom/tencent/imsdk/v2/V2TIMGroupMemberFullInfo;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, v0}, Lcom/tencent/imsdk/v2/V2TIMGroupMemberInfo;->setGroupMemberInfo(Lcom/tencent/imsdk/group/GroupMemberInfo;)V

    .line 32
    :cond_2
    :goto_0
    return-object v1
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

.method public getPriority()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMMessage;->message:Lcom/tencent/imsdk/message/Message;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/tencent/imsdk/message/Message;->getPriority()I

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

.method public getRandom()J
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMMessage;->message:Lcom/tencent/imsdk/message/Message;

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
    invoke-virtual {v0}, Lcom/tencent/imsdk/message/Message;->getRandom()J

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

.method public getRevokeReason()Ljava/lang/String;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMMessage;->message:Lcom/tencent/imsdk/message/Message;

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
    invoke-virtual {v0}, Lcom/tencent/imsdk/message/Message;->getMessageStatus()I

    .line 10
    move-result v0

    .line 11
    const/4 v2, 0x6

    .line 12
    .line 13
    if-eq v0, v2, :cond_1

    .line 14
    return-object v1

    .line 15
    .line 16
    :cond_1
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMMessage;->message:Lcom/tencent/imsdk/message/Message;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/tencent/imsdk/message/Message;->getRevokeReason()Ljava/lang/String;

    .line 20
    move-result-object v0

    .line 21
    return-object v0
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

.method public getRevokerInfo()Lcom/tencent/imsdk/v2/V2TIMUserFullInfo;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMMessage;->message:Lcom/tencent/imsdk/message/Message;

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
    invoke-virtual {v0}, Lcom/tencent/imsdk/message/Message;->getMessageStatus()I

    .line 10
    move-result v0

    .line 11
    const/4 v2, 0x6

    .line 12
    .line 13
    if-eq v0, v2, :cond_1

    .line 14
    return-object v1

    .line 15
    .line 16
    :cond_1
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMMessage;->message:Lcom/tencent/imsdk/message/Message;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/tencent/imsdk/message/Message;->getRevokerInfo()Lcom/tencent/imsdk/relationship/UserInfo;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    if-eqz v0, :cond_3

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Lcom/tencent/imsdk/relationship/UserInfo;->getUserID()Ljava/lang/String;

    .line 26
    move-result-object v2

    .line 27
    .line 28
    .line 29
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 30
    move-result v2

    .line 31
    .line 32
    if-eqz v2, :cond_2

    .line 33
    goto :goto_0

    .line 34
    .line 35
    :cond_2
    new-instance v1, Lcom/tencent/imsdk/v2/V2TIMUserFullInfo;

    .line 36
    .line 37
    .line 38
    invoke-direct {v1}, Lcom/tencent/imsdk/v2/V2TIMUserFullInfo;-><init>()V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1, v0}, Lcom/tencent/imsdk/v2/V2TIMUserInfo;->setUserInfo(Lcom/tencent/imsdk/relationship/UserInfo;)V

    .line 42
    :cond_3
    :goto_0
    return-object v1
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

.method public getSender()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMMessage;->message:Lcom/tencent/imsdk/message/Message;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/tencent/imsdk/message/Message;->getSenderUserID()Ljava/lang/String;

    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public getSeq()J
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMMessage;->message:Lcom/tencent/imsdk/message/Message;

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
    invoke-virtual {v0}, Lcom/tencent/imsdk/message/Message;->getSeq()J

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

.method public getSoundElem()Lcom/tencent/imsdk/v2/V2TIMSoundElem;
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getElemType()I

    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    return-object v1

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getElemType()I

    .line 12
    move-result v0

    .line 13
    const/4 v2, 0x4

    .line 14
    .line 15
    if-ne v0, v2, :cond_1

    .line 16
    .line 17
    new-instance v0, Lcom/tencent/imsdk/v2/V2TIMSoundElem;

    .line 18
    .line 19
    .line 20
    invoke-direct {v0}, Lcom/tencent/imsdk/v2/V2TIMSoundElem;-><init>()V

    .line 21
    .line 22
    iget-object v1, p0, Lcom/tencent/imsdk/v2/V2TIMMessage;->message:Lcom/tencent/imsdk/message/Message;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, Lcom/tencent/imsdk/v2/V2TIMElem;->setMessage(Lcom/tencent/imsdk/message/Message;)V

    .line 26
    const/4 v1, 0x0

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v1}, Lcom/tencent/imsdk/v2/V2TIMElem;->setElemIndex(I)V

    .line 30
    return-object v0

    .line 31
    :cond_1
    return-object v1
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

.method public getStatus()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMMessage;->message:Lcom/tencent/imsdk/message/Message;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    .line 8
    .line 9
    :cond_0
    invoke-virtual {v0}, Lcom/tencent/imsdk/message/Message;->getMessageStatus()I

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

.method public getStreamElem()Lcom/tencent/imsdk/v2/V2TIMStreamElem;
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getElemType()I

    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    return-object v1

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getElemType()I

    .line 12
    move-result v0

    .line 13
    .line 14
    const/16 v2, 0xb

    .line 15
    .line 16
    if-ne v0, v2, :cond_1

    .line 17
    .line 18
    new-instance v0, Lcom/tencent/imsdk/v2/V2TIMStreamElem;

    .line 19
    .line 20
    .line 21
    invoke-direct {v0}, Lcom/tencent/imsdk/v2/V2TIMStreamElem;-><init>()V

    .line 22
    .line 23
    iget-object v1, p0, Lcom/tencent/imsdk/v2/V2TIMMessage;->message:Lcom/tencent/imsdk/message/Message;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v1}, Lcom/tencent/imsdk/v2/V2TIMElem;->setMessage(Lcom/tencent/imsdk/message/Message;)V

    .line 27
    const/4 v1, 0x0

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v1}, Lcom/tencent/imsdk/v2/V2TIMElem;->setElemIndex(I)V

    .line 31
    return-object v0

    .line 32
    :cond_1
    return-object v1
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

.method public getTextElem()Lcom/tencent/imsdk/v2/V2TIMTextElem;
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getElemType()I

    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    return-object v1

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getElemType()I

    .line 12
    move-result v0

    .line 13
    const/4 v2, 0x1

    .line 14
    .line 15
    if-ne v0, v2, :cond_1

    .line 16
    .line 17
    new-instance v0, Lcom/tencent/imsdk/v2/V2TIMTextElem;

    .line 18
    .line 19
    .line 20
    invoke-direct {v0}, Lcom/tencent/imsdk/v2/V2TIMTextElem;-><init>()V

    .line 21
    .line 22
    iget-object v1, p0, Lcom/tencent/imsdk/v2/V2TIMMessage;->message:Lcom/tencent/imsdk/message/Message;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, Lcom/tencent/imsdk/v2/V2TIMElem;->setMessage(Lcom/tencent/imsdk/message/Message;)V

    .line 26
    const/4 v1, 0x0

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v1}, Lcom/tencent/imsdk/v2/V2TIMElem;->setElemIndex(I)V

    .line 30
    return-object v0

    .line 31
    :cond_1
    return-object v1
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

.method public getTimestamp()J
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMMessage;->message:Lcom/tencent/imsdk/message/Message;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/tencent/imsdk/message/Message;->getTimestamp()J

    .line 8
    move-result-wide v0

    .line 9
    return-wide v0

    .line 10
    .line 11
    :cond_0
    const-wide/16 v0, 0x0

    .line 12
    return-wide v0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public getUserID()Ljava/lang/String;
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMMessage;->message:Lcom/tencent/imsdk/message/Message;

    .line 3
    .line 4
    if-eqz v0, :cond_2

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/tencent/imsdk/message/Message;->getMessageType()I

    .line 8
    move-result v0

    .line 9
    .line 10
    sget v1, Lcom/tencent/imsdk/message/Message;->MESSAGE_TYPE_C2C:I

    .line 11
    .line 12
    if-eq v0, v1, :cond_0

    .line 13
    goto :goto_0

    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMMessage;->message:Lcom/tencent/imsdk/message/Message;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/tencent/imsdk/message/Message;->isMessageSender()Z

    .line 19
    move-result v0

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMMessage;->message:Lcom/tencent/imsdk/message/Message;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Lcom/tencent/imsdk/message/Message;->getReceiverUserID()Ljava/lang/String;

    .line 27
    move-result-object v0

    .line 28
    return-object v0

    .line 29
    .line 30
    :cond_1
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMMessage;->message:Lcom/tencent/imsdk/message/Message;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Lcom/tencent/imsdk/message/Message;->getSenderUserID()Ljava/lang/String;

    .line 34
    move-result-object v0

    .line 35
    return-object v0

    .line 36
    :cond_2
    :goto_0
    const/4 v0, 0x0

    .line 37
    return-object v0
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

.method public getVideoElem()Lcom/tencent/imsdk/v2/V2TIMVideoElem;
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getElemType()I

    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    return-object v1

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getElemType()I

    .line 12
    move-result v0

    .line 13
    const/4 v2, 0x5

    .line 14
    .line 15
    if-ne v0, v2, :cond_1

    .line 16
    .line 17
    new-instance v0, Lcom/tencent/imsdk/v2/V2TIMVideoElem;

    .line 18
    .line 19
    .line 20
    invoke-direct {v0}, Lcom/tencent/imsdk/v2/V2TIMVideoElem;-><init>()V

    .line 21
    .line 22
    iget-object v1, p0, Lcom/tencent/imsdk/v2/V2TIMMessage;->message:Lcom/tencent/imsdk/message/Message;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, Lcom/tencent/imsdk/v2/V2TIMElem;->setMessage(Lcom/tencent/imsdk/message/Message;)V

    .line 26
    const/4 v1, 0x0

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v1}, Lcom/tencent/imsdk/v2/V2TIMElem;->setElemIndex(I)V

    .line 30
    return-object v0

    .line 31
    :cond_1
    return-object v1
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

.method public hasRiskContent()Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMMessage;->message:Lcom/tencent/imsdk/message/Message;

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
    invoke-virtual {v0}, Lcom/tencent/imsdk/message/Message;->isHasRiskContent()Z

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

.method public isBroadcastMessage()Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMMessage;->message:Lcom/tencent/imsdk/message/Message;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/tencent/imsdk/message/Message;->isBroadcastMessage()Z

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

.method public isDisableCloudMessagePostHook()Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMMessage;->message:Lcom/tencent/imsdk/message/Message;

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
    invoke-virtual {v0}, Lcom/tencent/imsdk/message/Message;->isDisableCloudMessagePostHook()Z

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

.method public isDisableCloudMessagePreHook()Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMMessage;->message:Lcom/tencent/imsdk/message/Message;

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
    invoke-virtual {v0}, Lcom/tencent/imsdk/message/Message;->isDisableCloudMessagePreHook()Z

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

.method public isExcludedFromContentModeration()Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMMessage;->message:Lcom/tencent/imsdk/message/Message;

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
    invoke-virtual {v0}, Lcom/tencent/imsdk/message/Message;->isExcludedFromContentModeration()Z

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

.method public isExcludedFromLastMessage()Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMMessage;->message:Lcom/tencent/imsdk/message/Message;

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
    invoke-virtual {v0}, Lcom/tencent/imsdk/message/Message;->isExcludedFromLastMessage()Z

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

.method public isExcludedFromUnreadCount()Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMMessage;->message:Lcom/tencent/imsdk/message/Message;

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
    invoke-virtual {v0}, Lcom/tencent/imsdk/message/Message;->isExcludedFromUnreadCount()Z

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

.method public isNeedReadReceipt()Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMMessage;->message:Lcom/tencent/imsdk/message/Message;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/tencent/imsdk/message/Message;->isNeedReadReceipt()Z

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

.method public isPeerRead()Z
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getStatus()I

    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    const/4 v2, 0x1

    .line 9
    .line 10
    if-eq v0, v2, :cond_1

    .line 11
    const/4 v2, 0x3

    .line 12
    .line 13
    if-eq v0, v2, :cond_1

    .line 14
    const/4 v2, 0x5

    .line 15
    .line 16
    if-ne v0, v2, :cond_0

    .line 17
    goto :goto_0

    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMMessage;->message:Lcom/tencent/imsdk/message/Message;

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Lcom/tencent/imsdk/message/Message;->isPeerRead()Z

    .line 25
    move-result v0

    .line 26
    return v0

    .line 27
    :cond_1
    :goto_0
    return v1
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

.method public isRead()Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMMessage;->message:Lcom/tencent/imsdk/message/Message;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/tencent/imsdk/message/Message;->isSelfRead()Z

    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    const/4 v0, 0x1

    .line 11
    return v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public isSelf()Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMMessage;->message:Lcom/tencent/imsdk/message/Message;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/tencent/imsdk/message/Message;->isMessageSender()Z

    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    const/4 v0, 0x1

    .line 11
    return v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public isSupportMessageExtension()Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMMessage;->message:Lcom/tencent/imsdk/message/Message;

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
    invoke-virtual {v0}, Lcom/tencent/imsdk/message/Message;->isSupportMessageExtension()Z

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

.method public setCloudCustomData(Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMMessage;->message:Lcom/tencent/imsdk/message/Message;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    return-void

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-virtual {v0, p1}, Lcom/tencent/imsdk/message/Message;->setCloudCustomString(Ljava/lang/String;)V

    .line 9
    return-void
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

.method public setCustomModerationConfigurationID(Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMMessage;->message:Lcom/tencent/imsdk/message/Message;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    return-void

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-virtual {v0, p1}, Lcom/tencent/imsdk/message/Message;->setCustomModerationConfigurationID(Ljava/lang/String;)V

    .line 9
    return-void
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

.method public setDisableCloudMessagePostHook(Z)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMMessage;->message:Lcom/tencent/imsdk/message/Message;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    return-void

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-virtual {v0, p1}, Lcom/tencent/imsdk/message/Message;->setDisableCloudMessagePostHook(Z)V

    .line 9
    return-void
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

.method public setDisableCloudMessagePreHook(Z)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMMessage;->message:Lcom/tencent/imsdk/message/Message;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    return-void

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-virtual {v0, p1}, Lcom/tencent/imsdk/message/Message;->setDisableCloudMessagePreHook(Z)V

    .line 9
    return-void
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

.method public setExcludedFromContentModeration(Z)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMMessage;->message:Lcom/tencent/imsdk/message/Message;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    return-void

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-virtual {v0, p1}, Lcom/tencent/imsdk/message/Message;->setExcludedFromContentModeration(Z)V

    .line 9
    return-void
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

.method public setExcludedFromLastMessage(Z)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMMessage;->message:Lcom/tencent/imsdk/message/Message;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    return-void

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-virtual {v0, p1}, Lcom/tencent/imsdk/message/Message;->setExcludedFromLastMessage(Z)V

    .line 9
    return-void
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

.method public setExcludedFromUnreadCount(Z)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMMessage;->message:Lcom/tencent/imsdk/message/Message;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    return-void

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-virtual {v0, p1}, Lcom/tencent/imsdk/message/Message;->setExcludedFromUnreadCount(Z)V

    .line 9
    return-void
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

.method public setGroupAtUserList(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMMessage;->message:Lcom/tencent/imsdk/message/Message;

    .line 3
    .line 4
    if-eqz v0, :cond_2

    .line 5
    .line 6
    if-nez p1, :cond_0

    .line 7
    goto :goto_1

    .line 8
    .line 9
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 10
    .line 11
    .line 12
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 16
    move-result-object p1

    .line 17
    .line 18
    .line 19
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    move-result v1

    .line 21
    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    .line 25
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    move-result-object v1

    .line 27
    .line 28
    check-cast v1, Ljava/lang/String;

    .line 29
    .line 30
    new-instance v2, Lcom/tencent/imsdk/message/MessageAtInfo;

    .line 31
    .line 32
    .line 33
    invoke-direct {v2}, Lcom/tencent/imsdk/message/MessageAtInfo;-><init>()V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2, v1}, Lcom/tencent/imsdk/message/MessageAtInfo;->setAtUserID(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 40
    goto :goto_0

    .line 41
    .line 42
    :cond_1
    iget-object p1, p0, Lcom/tencent/imsdk/v2/V2TIMMessage;->message:Lcom/tencent/imsdk/message/Message;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1, v0}, Lcom/tencent/imsdk/message/Message;->setMessageGroupAtInfoList(Ljava/util/List;)V

    .line 46
    :cond_2
    :goto_1
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
.end method

.method public setLocalCustomData(Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMMessage;->message:Lcom/tencent/imsdk/message/Message;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    return-void

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-virtual {v0, p1}, Lcom/tencent/imsdk/message/Message;->setLocalCustomString(Ljava/lang/String;)V

    .line 9
    return-void
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

.method public setLocalCustomInt(I)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMMessage;->message:Lcom/tencent/imsdk/message/Message;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    return-void

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-virtual {v0, p1}, Lcom/tencent/imsdk/message/Message;->setLocalCustomNumber(I)V

    .line 9
    return-void
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

.method public setMessage(Lcom/tencent/imsdk/message/Message;)V
    .locals 0

    .line 1
    .line 2
    if-nez p1, :cond_0

    .line 3
    return-void

    .line 4
    .line 5
    :cond_0
    iput-object p1, p0, Lcom/tencent/imsdk/v2/V2TIMMessage;->message:Lcom/tencent/imsdk/message/Message;

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
.end method

.method public setNeedReadReceipt(Z)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMMessage;->message:Lcom/tencent/imsdk/message/Message;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lcom/tencent/imsdk/message/Message;->setNeedReadReceipt(Z)V

    .line 8
    :cond_0
    return-void
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

.method public setSupportMessageExtension(Z)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMMessage;->message:Lcom/tencent/imsdk/message/Message;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    return-void

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-virtual {v0, p1}, Lcom/tencent/imsdk/message/Message;->setSupportMessageExtension(Z)V

    .line 9
    return-void
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

.method public toString()Ljava/lang/String;
    .locals 6

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    const-string v1, "V2TIMMessage--->"

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    new-instance v1, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 16
    const/4 v2, 0x0

    .line 17
    const/4 v3, 0x0

    .line 18
    .line 19
    :goto_0
    iget-object v4, p0, Lcom/tencent/imsdk/v2/V2TIMMessage;->message:Lcom/tencent/imsdk/message/Message;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v4}, Lcom/tencent/imsdk/message/Message;->getMessageBaseElements()Ljava/util/List;

    .line 23
    move-result-object v4

    .line 24
    .line 25
    .line 26
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 27
    move-result v4

    .line 28
    .line 29
    if-ge v3, v4, :cond_14

    .line 30
    .line 31
    iget-object v4, p0, Lcom/tencent/imsdk/v2/V2TIMMessage;->message:Lcom/tencent/imsdk/message/Message;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v4}, Lcom/tencent/imsdk/message/Message;->getMessageBaseElements()Ljava/util/List;

    .line 35
    move-result-object v4

    .line 36
    .line 37
    .line 38
    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 39
    move-result-object v4

    .line 40
    .line 41
    check-cast v4, Lcom/tencent/imsdk/message/MessageBaseElement;

    .line 42
    .line 43
    instance-of v5, v4, Lcom/tencent/imsdk/message/TextElement;

    .line 44
    .line 45
    if-eqz v5, :cond_1

    .line 46
    .line 47
    if-nez v2, :cond_0

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getTextElem()Lcom/tencent/imsdk/v2/V2TIMTextElem;

    .line 51
    move-result-object v2

    .line 52
    goto :goto_1

    .line 53
    .line 54
    .line 55
    :cond_0
    invoke-virtual {v2}, Lcom/tencent/imsdk/v2/V2TIMElem;->getNextElem()Lcom/tencent/imsdk/v2/V2TIMElem;

    .line 56
    move-result-object v2

    .line 57
    :goto_1
    move-object v4, v2

    .line 58
    .line 59
    check-cast v4, Lcom/tencent/imsdk/v2/V2TIMTextElem;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v4}, Lcom/tencent/imsdk/v2/V2TIMTextElem;->toString()Ljava/lang/String;

    .line 63
    move-result-object v4

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    goto/16 :goto_b

    .line 69
    .line 70
    :cond_1
    instance-of v5, v4, Lcom/tencent/imsdk/message/CustomElement;

    .line 71
    .line 72
    if-eqz v5, :cond_3

    .line 73
    .line 74
    if-nez v2, :cond_2

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getCustomElem()Lcom/tencent/imsdk/v2/V2TIMCustomElem;

    .line 78
    move-result-object v2

    .line 79
    goto :goto_2

    .line 80
    .line 81
    .line 82
    :cond_2
    invoke-virtual {v2}, Lcom/tencent/imsdk/v2/V2TIMElem;->getNextElem()Lcom/tencent/imsdk/v2/V2TIMElem;

    .line 83
    move-result-object v2

    .line 84
    :goto_2
    move-object v4, v2

    .line 85
    .line 86
    check-cast v4, Lcom/tencent/imsdk/v2/V2TIMCustomElem;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v4}, Lcom/tencent/imsdk/v2/V2TIMCustomElem;->toString()Ljava/lang/String;

    .line 90
    move-result-object v4

    .line 91
    .line 92
    .line 93
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    goto/16 :goto_b

    .line 96
    .line 97
    :cond_3
    instance-of v5, v4, Lcom/tencent/imsdk/message/ImageElement;

    .line 98
    .line 99
    if-eqz v5, :cond_5

    .line 100
    .line 101
    if-nez v2, :cond_4

    .line 102
    .line 103
    .line 104
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getImageElem()Lcom/tencent/imsdk/v2/V2TIMImageElem;

    .line 105
    move-result-object v2

    .line 106
    goto :goto_3

    .line 107
    .line 108
    .line 109
    :cond_4
    invoke-virtual {v2}, Lcom/tencent/imsdk/v2/V2TIMElem;->getNextElem()Lcom/tencent/imsdk/v2/V2TIMElem;

    .line 110
    move-result-object v2

    .line 111
    :goto_3
    move-object v4, v2

    .line 112
    .line 113
    check-cast v4, Lcom/tencent/imsdk/v2/V2TIMImageElem;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v4}, Lcom/tencent/imsdk/v2/V2TIMImageElem;->toString()Ljava/lang/String;

    .line 117
    move-result-object v4

    .line 118
    .line 119
    .line 120
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    goto/16 :goto_b

    .line 123
    .line 124
    :cond_5
    instance-of v5, v4, Lcom/tencent/imsdk/message/SoundElement;

    .line 125
    .line 126
    if-eqz v5, :cond_7

    .line 127
    .line 128
    if-nez v2, :cond_6

    .line 129
    .line 130
    .line 131
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getSoundElem()Lcom/tencent/imsdk/v2/V2TIMSoundElem;

    .line 132
    move-result-object v2

    .line 133
    goto :goto_4

    .line 134
    .line 135
    .line 136
    :cond_6
    invoke-virtual {v2}, Lcom/tencent/imsdk/v2/V2TIMElem;->getNextElem()Lcom/tencent/imsdk/v2/V2TIMElem;

    .line 137
    move-result-object v2

    .line 138
    :goto_4
    move-object v4, v2

    .line 139
    .line 140
    check-cast v4, Lcom/tencent/imsdk/v2/V2TIMSoundElem;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v4}, Lcom/tencent/imsdk/v2/V2TIMSoundElem;->toString()Ljava/lang/String;

    .line 144
    move-result-object v4

    .line 145
    .line 146
    .line 147
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    goto/16 :goto_b

    .line 150
    .line 151
    :cond_7
    instance-of v5, v4, Lcom/tencent/imsdk/message/VideoElement;

    .line 152
    .line 153
    if-eqz v5, :cond_9

    .line 154
    .line 155
    if-nez v2, :cond_8

    .line 156
    .line 157
    .line 158
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getVideoElem()Lcom/tencent/imsdk/v2/V2TIMVideoElem;

    .line 159
    move-result-object v2

    .line 160
    goto :goto_5

    .line 161
    .line 162
    .line 163
    :cond_8
    invoke-virtual {v2}, Lcom/tencent/imsdk/v2/V2TIMElem;->getNextElem()Lcom/tencent/imsdk/v2/V2TIMElem;

    .line 164
    move-result-object v2

    .line 165
    :goto_5
    move-object v4, v2

    .line 166
    .line 167
    check-cast v4, Lcom/tencent/imsdk/v2/V2TIMVideoElem;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v4}, Lcom/tencent/imsdk/v2/V2TIMVideoElem;->toString()Ljava/lang/String;

    .line 171
    move-result-object v4

    .line 172
    .line 173
    .line 174
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    goto/16 :goto_b

    .line 177
    .line 178
    :cond_9
    instance-of v5, v4, Lcom/tencent/imsdk/message/FileElement;

    .line 179
    .line 180
    if-eqz v5, :cond_b

    .line 181
    .line 182
    if-nez v2, :cond_a

    .line 183
    .line 184
    .line 185
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getFileElem()Lcom/tencent/imsdk/v2/V2TIMFileElem;

    .line 186
    move-result-object v2

    .line 187
    goto :goto_6

    .line 188
    .line 189
    .line 190
    :cond_a
    invoke-virtual {v2}, Lcom/tencent/imsdk/v2/V2TIMElem;->getNextElem()Lcom/tencent/imsdk/v2/V2TIMElem;

    .line 191
    move-result-object v2

    .line 192
    :goto_6
    move-object v4, v2

    .line 193
    .line 194
    check-cast v4, Lcom/tencent/imsdk/v2/V2TIMFileElem;

    .line 195
    .line 196
    .line 197
    invoke-virtual {v4}, Lcom/tencent/imsdk/v2/V2TIMFileElem;->toString()Ljava/lang/String;

    .line 198
    move-result-object v4

    .line 199
    .line 200
    .line 201
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 202
    .line 203
    goto/16 :goto_b

    .line 204
    .line 205
    :cond_b
    instance-of v5, v4, Lcom/tencent/imsdk/message/LocationElement;

    .line 206
    .line 207
    if-eqz v5, :cond_d

    .line 208
    .line 209
    if-nez v2, :cond_c

    .line 210
    .line 211
    .line 212
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getLocationElem()Lcom/tencent/imsdk/v2/V2TIMLocationElem;

    .line 213
    move-result-object v2

    .line 214
    goto :goto_7

    .line 215
    .line 216
    .line 217
    :cond_c
    invoke-virtual {v2}, Lcom/tencent/imsdk/v2/V2TIMElem;->getNextElem()Lcom/tencent/imsdk/v2/V2TIMElem;

    .line 218
    move-result-object v2

    .line 219
    :goto_7
    move-object v4, v2

    .line 220
    .line 221
    check-cast v4, Lcom/tencent/imsdk/v2/V2TIMLocationElem;

    .line 222
    .line 223
    .line 224
    invoke-virtual {v4}, Lcom/tencent/imsdk/v2/V2TIMLocationElem;->toString()Ljava/lang/String;

    .line 225
    move-result-object v4

    .line 226
    .line 227
    .line 228
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 229
    goto :goto_b

    .line 230
    .line 231
    :cond_d
    instance-of v5, v4, Lcom/tencent/imsdk/message/FaceElement;

    .line 232
    .line 233
    if-eqz v5, :cond_f

    .line 234
    .line 235
    if-nez v2, :cond_e

    .line 236
    .line 237
    .line 238
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getFaceElem()Lcom/tencent/imsdk/v2/V2TIMFaceElem;

    .line 239
    move-result-object v2

    .line 240
    goto :goto_8

    .line 241
    .line 242
    .line 243
    :cond_e
    invoke-virtual {v2}, Lcom/tencent/imsdk/v2/V2TIMElem;->getNextElem()Lcom/tencent/imsdk/v2/V2TIMElem;

    .line 244
    move-result-object v2

    .line 245
    :goto_8
    move-object v4, v2

    .line 246
    .line 247
    check-cast v4, Lcom/tencent/imsdk/v2/V2TIMFaceElem;

    .line 248
    .line 249
    .line 250
    invoke-virtual {v4}, Lcom/tencent/imsdk/v2/V2TIMFaceElem;->toString()Ljava/lang/String;

    .line 251
    move-result-object v4

    .line 252
    .line 253
    .line 254
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 255
    goto :goto_b

    .line 256
    .line 257
    :cond_f
    instance-of v5, v4, Lcom/tencent/imsdk/message/MergerElement;

    .line 258
    .line 259
    if-eqz v5, :cond_11

    .line 260
    .line 261
    if-nez v2, :cond_10

    .line 262
    .line 263
    .line 264
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getMergerElem()Lcom/tencent/imsdk/v2/V2TIMMergerElem;

    .line 265
    move-result-object v2

    .line 266
    goto :goto_9

    .line 267
    .line 268
    .line 269
    :cond_10
    invoke-virtual {v2}, Lcom/tencent/imsdk/v2/V2TIMElem;->getNextElem()Lcom/tencent/imsdk/v2/V2TIMElem;

    .line 270
    move-result-object v2

    .line 271
    :goto_9
    move-object v4, v2

    .line 272
    .line 273
    check-cast v4, Lcom/tencent/imsdk/v2/V2TIMMergerElem;

    .line 274
    .line 275
    .line 276
    invoke-virtual {v4}, Lcom/tencent/imsdk/v2/V2TIMMergerElem;->toString()Ljava/lang/String;

    .line 277
    move-result-object v4

    .line 278
    .line 279
    .line 280
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 281
    goto :goto_b

    .line 282
    .line 283
    :cond_11
    instance-of v4, v4, Lcom/tencent/imsdk/message/GroupTipsElement;

    .line 284
    .line 285
    if-eqz v4, :cond_13

    .line 286
    .line 287
    if-nez v2, :cond_12

    .line 288
    .line 289
    .line 290
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getGroupTipsElem()Lcom/tencent/imsdk/v2/V2TIMGroupTipsElem;

    .line 291
    move-result-object v2

    .line 292
    goto :goto_a

    .line 293
    .line 294
    .line 295
    :cond_12
    invoke-virtual {v2}, Lcom/tencent/imsdk/v2/V2TIMElem;->getNextElem()Lcom/tencent/imsdk/v2/V2TIMElem;

    .line 296
    move-result-object v2

    .line 297
    :goto_a
    move-object v4, v2

    .line 298
    .line 299
    check-cast v4, Lcom/tencent/imsdk/v2/V2TIMGroupTipsElem;

    .line 300
    .line 301
    .line 302
    invoke-virtual {v4}, Lcom/tencent/imsdk/v2/V2TIMGroupTipsElem;->toString()Ljava/lang/String;

    .line 303
    move-result-object v4

    .line 304
    .line 305
    .line 306
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 307
    .line 308
    .line 309
    :cond_13
    :goto_b
    const-string/jumbo v4, "|"

    .line 310
    .line 311
    .line 312
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 313
    .line 314
    add-int/lit8 v3, v3, 0x1

    .line 315
    .line 316
    goto/16 :goto_0

    .line 317
    .line 318
    .line 319
    :cond_14
    const-string/jumbo v2, "msgID:"

    .line 320
    .line 321
    .line 322
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 323
    .line 324
    .line 325
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getMsgID()Ljava/lang/String;

    .line 326
    move-result-object v2

    .line 327
    .line 328
    .line 329
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 330
    .line 331
    const-string v2, ", timestamp:"

    .line 332
    .line 333
    .line 334
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 335
    .line 336
    .line 337
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getTimestamp()J

    .line 338
    move-result-wide v2

    .line 339
    .line 340
    .line 341
    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 342
    .line 343
    const-string v2, ", sender:"

    .line 344
    .line 345
    .line 346
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 347
    .line 348
    .line 349
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getSender()Ljava/lang/String;

    .line 350
    move-result-object v2

    .line 351
    .line 352
    .line 353
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 354
    .line 355
    const-string v2, ", nickname:"

    .line 356
    .line 357
    .line 358
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 359
    .line 360
    .line 361
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getNickName()Ljava/lang/String;

    .line 362
    move-result-object v2

    .line 363
    .line 364
    .line 365
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 366
    .line 367
    const-string v2, ", faceUrl:"

    .line 368
    .line 369
    .line 370
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 371
    .line 372
    .line 373
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getFaceUrl()Ljava/lang/String;

    .line 374
    move-result-object v2

    .line 375
    .line 376
    .line 377
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 378
    .line 379
    const-string v2, ", friendRemark:"

    .line 380
    .line 381
    .line 382
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 383
    .line 384
    .line 385
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getFriendRemark()Ljava/lang/String;

    .line 386
    move-result-object v2

    .line 387
    .line 388
    .line 389
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 390
    .line 391
    const-string v2, ", nameCard:"

    .line 392
    .line 393
    .line 394
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 395
    .line 396
    .line 397
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getNameCard()Ljava/lang/String;

    .line 398
    move-result-object v2

    .line 399
    .line 400
    .line 401
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 402
    .line 403
    const-string v2, ", groupID:"

    .line 404
    .line 405
    .line 406
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 407
    .line 408
    .line 409
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getGroupID()Ljava/lang/String;

    .line 410
    move-result-object v2

    .line 411
    .line 412
    .line 413
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 414
    .line 415
    const-string v2, ", userID:"

    .line 416
    .line 417
    .line 418
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 419
    .line 420
    .line 421
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getUserID()Ljava/lang/String;

    .line 422
    move-result-object v2

    .line 423
    .line 424
    .line 425
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 426
    .line 427
    const-string v2, ", seq:"

    .line 428
    .line 429
    .line 430
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 431
    .line 432
    .line 433
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getSeq()J

    .line 434
    move-result-wide v2

    .line 435
    .line 436
    .line 437
    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 438
    .line 439
    const-string v2, ", random:"

    .line 440
    .line 441
    .line 442
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 443
    .line 444
    .line 445
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getRandom()J

    .line 446
    move-result-wide v2

    .line 447
    .line 448
    .line 449
    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 450
    .line 451
    const-string v2, ", status:"

    .line 452
    .line 453
    .line 454
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 455
    .line 456
    .line 457
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getStatus()I

    .line 458
    move-result v2

    .line 459
    .line 460
    .line 461
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 462
    .line 463
    const-string v2, ", isSelf:"

    .line 464
    .line 465
    .line 466
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 467
    .line 468
    .line 469
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->isSelf()Z

    .line 470
    move-result v2

    .line 471
    .line 472
    .line 473
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 474
    .line 475
    const-string v2, ", isRead:"

    .line 476
    .line 477
    .line 478
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 479
    .line 480
    .line 481
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->isRead()Z

    .line 482
    move-result v2

    .line 483
    .line 484
    .line 485
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 486
    .line 487
    const-string v2, ", isPeerRead:"

    .line 488
    .line 489
    .line 490
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 491
    .line 492
    .line 493
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->isPeerRead()Z

    .line 494
    move-result v2

    .line 495
    .line 496
    .line 497
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 498
    .line 499
    const-string v2, ", needReadReceipt:"

    .line 500
    .line 501
    .line 502
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 503
    .line 504
    .line 505
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->isNeedReadReceipt()Z

    .line 506
    move-result v2

    .line 507
    .line 508
    .line 509
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 510
    .line 511
    const-string v2, ", priority:"

    .line 512
    .line 513
    .line 514
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 515
    .line 516
    .line 517
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getPriority()I

    .line 518
    move-result v2

    .line 519
    .line 520
    .line 521
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 522
    .line 523
    const-string v2, ", groupAtUserList:"

    .line 524
    .line 525
    .line 526
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 527
    .line 528
    .line 529
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getGroupAtUserList()Ljava/util/List;

    .line 530
    move-result-object v2

    .line 531
    .line 532
    .line 533
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 534
    .line 535
    const-string v2, ", elemType:"

    .line 536
    .line 537
    .line 538
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 539
    .line 540
    .line 541
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getElemType()I

    .line 542
    move-result v2

    .line 543
    .line 544
    .line 545
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 546
    .line 547
    const-string v2, ", localCustomData:"

    .line 548
    .line 549
    .line 550
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 551
    .line 552
    .line 553
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getLocalCustomData()Ljava/lang/String;

    .line 554
    move-result-object v2

    .line 555
    .line 556
    .line 557
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 558
    .line 559
    const-string v2, ", localCustomInt:"

    .line 560
    .line 561
    .line 562
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 563
    .line 564
    .line 565
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getLocalCustomInt()I

    .line 566
    move-result v2

    .line 567
    .line 568
    .line 569
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 570
    .line 571
    const-string v2, ", cloudCustomData:"

    .line 572
    .line 573
    .line 574
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 575
    .line 576
    .line 577
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getCloudCustomData()Ljava/lang/String;

    .line 578
    move-result-object v2

    .line 579
    .line 580
    .line 581
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 582
    .line 583
    const-string v2, ", isExcludeFromUnreadCount:"

    .line 584
    .line 585
    .line 586
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 587
    .line 588
    .line 589
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->isExcludedFromUnreadCount()Z

    .line 590
    move-result v2

    .line 591
    .line 592
    .line 593
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 594
    .line 595
    const-string v2, ", isExcludeFromLastMessage:"

    .line 596
    .line 597
    .line 598
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 599
    .line 600
    .line 601
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->isExcludedFromLastMessage()Z

    .line 602
    move-result v2

    .line 603
    .line 604
    .line 605
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 606
    .line 607
    const-string v2, ", offlinePushInfo:"

    .line 608
    .line 609
    .line 610
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 611
    .line 612
    .line 613
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getOfflinePushInfo()Lcom/tencent/imsdk/v2/V2TIMOfflinePushInfo;

    .line 614
    move-result-object v2

    .line 615
    .line 616
    .line 617
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 618
    .line 619
    const-string v2, ", isBroadcastMessage:"

    .line 620
    .line 621
    .line 622
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 623
    .line 624
    .line 625
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->isBroadcastMessage()Z

    .line 626
    move-result v2

    .line 627
    .line 628
    .line 629
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 630
    .line 631
    const-string v2, ", supportMessageExtension:"

    .line 632
    .line 633
    .line 634
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 635
    .line 636
    .line 637
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->isSupportMessageExtension()Z

    .line 638
    move-result v2

    .line 639
    .line 640
    .line 641
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 642
    .line 643
    const-string v2, ", hasRiskContent:"

    .line 644
    .line 645
    .line 646
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 647
    .line 648
    .line 649
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->hasRiskContent()Z

    .line 650
    move-result v2

    .line 651
    .line 652
    .line 653
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 654
    .line 655
    const-string v2, ", elemDesc:"

    .line 656
    .line 657
    .line 658
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 659
    .line 660
    .line 661
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 662
    move-result-object v1

    .line 663
    .line 664
    .line 665
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 666
    .line 667
    const-string v1, ", revokerInfo:"

    .line 668
    .line 669
    .line 670
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 671
    .line 672
    .line 673
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getRevokerInfo()Lcom/tencent/imsdk/v2/V2TIMUserFullInfo;

    .line 674
    move-result-object v1

    .line 675
    .line 676
    .line 677
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 678
    .line 679
    const-string v1, ", revokeReason:"

    .line 680
    .line 681
    .line 682
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 683
    .line 684
    .line 685
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getRevokeReason()Ljava/lang/String;

    .line 686
    move-result-object v1

    .line 687
    .line 688
    .line 689
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 690
    .line 691
    const-string v1, ", pinnerInfo:"

    .line 692
    .line 693
    .line 694
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 695
    .line 696
    .line 697
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getPinnerInfo()Lcom/tencent/imsdk/v2/V2TIMGroupMemberFullInfo;

    .line 698
    move-result-object v1

    .line 699
    .line 700
    .line 701
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 702
    .line 703
    const-string v1, ", quoteInfo:"

    .line 704
    .line 705
    .line 706
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 707
    .line 708
    .line 709
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getMessageQuoteInfo()Lcom/tencent/imsdk/v2/V2TIMMessageQuoteInfo;

    .line 710
    move-result-object v1

    .line 711
    .line 712
    .line 713
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 714
    .line 715
    .line 716
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 717
    move-result-object v0

    .line 718
    return-object v0
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
.end method
