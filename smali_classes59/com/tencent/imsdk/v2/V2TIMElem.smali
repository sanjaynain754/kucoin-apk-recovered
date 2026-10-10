.class public Lcom/tencent/imsdk/v2/V2TIMElem;
.super Ljava/lang/Object;
.source "V2TIMElem.java"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/imsdk/v2/V2TIMElem$V2ProgressInfo;
    }
.end annotation


# instance fields
.field private final TAG:Ljava/lang/String;

.field private elemIndex:I

.field private message:Lcom/tencent/imsdk/message/Message;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    const-string v0, "V2TIMElem"

    .line 6
    .line 7
    iput-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMElem;->TAG:Ljava/lang/String;

    .line 8
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
.end method


# virtual methods
.method public appendElem(Lcom/tencent/imsdk/v2/V2TIMElem;)V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMElem;->message:Lcom/tencent/imsdk/message/Message;

    .line 3
    .line 4
    const-string v1, "V2TIMElem"

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    const-string p1, "appendElem error, must be first elem from message"

    .line 9
    .line 10
    .line 11
    invoke-static {v1, p1}, Lcom/tencent/imsdk/common/IMLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    return-void

    .line 13
    .line 14
    :cond_0
    instance-of v0, p1, Lcom/tencent/imsdk/v2/V2TIMTextElem;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    new-instance v0, Lcom/tencent/imsdk/message/TextElement;

    .line 19
    .line 20
    .line 21
    invoke-direct {v0}, Lcom/tencent/imsdk/message/TextElement;-><init>()V

    .line 22
    move-object v1, p1

    .line 23
    .line 24
    check-cast v1, Lcom/tencent/imsdk/v2/V2TIMTextElem;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1}, Lcom/tencent/imsdk/v2/V2TIMTextElem;->getText()Ljava/lang/String;

    .line 28
    move-result-object v1

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v1}, Lcom/tencent/imsdk/message/TextElement;->setTextContent(Ljava/lang/String;)V

    .line 32
    .line 33
    iget-object v1, p0, Lcom/tencent/imsdk/v2/V2TIMElem;->message:Lcom/tencent/imsdk/message/Message;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1, v0}, Lcom/tencent/imsdk/message/Message;->addElement(Lcom/tencent/imsdk/message/MessageBaseElement;)V

    .line 37
    goto :goto_0

    .line 38
    .line 39
    :cond_1
    instance-of v0, p1, Lcom/tencent/imsdk/v2/V2TIMCustomElem;

    .line 40
    .line 41
    if-eqz v0, :cond_2

    .line 42
    .line 43
    new-instance v0, Lcom/tencent/imsdk/message/CustomElement;

    .line 44
    .line 45
    .line 46
    invoke-direct {v0}, Lcom/tencent/imsdk/message/CustomElement;-><init>()V

    .line 47
    move-object v1, p1

    .line 48
    .line 49
    check-cast v1, Lcom/tencent/imsdk/v2/V2TIMCustomElem;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1}, Lcom/tencent/imsdk/v2/V2TIMCustomElem;->getData()[B

    .line 53
    move-result-object v2

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, v2}, Lcom/tencent/imsdk/message/CustomElement;->setData([B)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1}, Lcom/tencent/imsdk/v2/V2TIMCustomElem;->getDescription()Ljava/lang/String;

    .line 60
    move-result-object v2

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, v2}, Lcom/tencent/imsdk/message/CustomElement;->setDescription(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1}, Lcom/tencent/imsdk/v2/V2TIMCustomElem;->getExtension()[B

    .line 67
    move-result-object v1

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0, v1}, Lcom/tencent/imsdk/message/CustomElement;->setExtension([B)V

    .line 71
    .line 72
    iget-object v1, p0, Lcom/tencent/imsdk/v2/V2TIMElem;->message:Lcom/tencent/imsdk/message/Message;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1, v0}, Lcom/tencent/imsdk/message/Message;->addElement(Lcom/tencent/imsdk/message/MessageBaseElement;)V

    .line 76
    goto :goto_0

    .line 77
    .line 78
    :cond_2
    instance-of v0, p1, Lcom/tencent/imsdk/v2/V2TIMFaceElem;

    .line 79
    .line 80
    if-eqz v0, :cond_3

    .line 81
    .line 82
    new-instance v0, Lcom/tencent/imsdk/message/FaceElement;

    .line 83
    .line 84
    .line 85
    invoke-direct {v0}, Lcom/tencent/imsdk/message/FaceElement;-><init>()V

    .line 86
    move-object v1, p1

    .line 87
    .line 88
    check-cast v1, Lcom/tencent/imsdk/v2/V2TIMFaceElem;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v1}, Lcom/tencent/imsdk/v2/V2TIMFaceElem;->getIndex()I

    .line 92
    move-result v2

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0, v2}, Lcom/tencent/imsdk/message/FaceElement;->setFaceIndex(I)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v1}, Lcom/tencent/imsdk/v2/V2TIMFaceElem;->getData()[B

    .line 99
    move-result-object v1

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0, v1}, Lcom/tencent/imsdk/message/FaceElement;->setFaceData([B)V

    .line 103
    .line 104
    iget-object v1, p0, Lcom/tencent/imsdk/v2/V2TIMElem;->message:Lcom/tencent/imsdk/message/Message;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v1, v0}, Lcom/tencent/imsdk/message/Message;->addElement(Lcom/tencent/imsdk/message/MessageBaseElement;)V

    .line 108
    goto :goto_0

    .line 109
    .line 110
    :cond_3
    instance-of v0, p1, Lcom/tencent/imsdk/v2/V2TIMLocationElem;

    .line 111
    .line 112
    if-eqz v0, :cond_4

    .line 113
    .line 114
    new-instance v0, Lcom/tencent/imsdk/message/LocationElement;

    .line 115
    .line 116
    .line 117
    invoke-direct {v0}, Lcom/tencent/imsdk/message/LocationElement;-><init>()V

    .line 118
    move-object v1, p1

    .line 119
    .line 120
    check-cast v1, Lcom/tencent/imsdk/v2/V2TIMLocationElem;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v1}, Lcom/tencent/imsdk/v2/V2TIMLocationElem;->getLatitude()D

    .line 124
    move-result-wide v2

    .line 125
    .line 126
    .line 127
    invoke-virtual {v0, v2, v3}, Lcom/tencent/imsdk/message/LocationElement;->setLatitude(D)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v1}, Lcom/tencent/imsdk/v2/V2TIMLocationElem;->getLongitude()D

    .line 131
    move-result-wide v2

    .line 132
    .line 133
    .line 134
    invoke-virtual {v0, v2, v3}, Lcom/tencent/imsdk/message/LocationElement;->setLongitude(D)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v1}, Lcom/tencent/imsdk/v2/V2TIMLocationElem;->getDesc()Ljava/lang/String;

    .line 138
    move-result-object v1

    .line 139
    .line 140
    .line 141
    invoke-virtual {v0, v1}, Lcom/tencent/imsdk/message/LocationElement;->setDescription(Ljava/lang/String;)V

    .line 142
    .line 143
    iget-object v1, p0, Lcom/tencent/imsdk/v2/V2TIMElem;->message:Lcom/tencent/imsdk/message/Message;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v1, v0}, Lcom/tencent/imsdk/message/Message;->addElement(Lcom/tencent/imsdk/message/MessageBaseElement;)V

    .line 147
    .line 148
    :goto_0
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMElem;->message:Lcom/tencent/imsdk/message/Message;

    .line 149
    .line 150
    .line 151
    invoke-virtual {p1, v0}, Lcom/tencent/imsdk/v2/V2TIMElem;->setMessage(Lcom/tencent/imsdk/message/Message;)V

    .line 152
    .line 153
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMElem;->message:Lcom/tencent/imsdk/message/Message;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v0}, Lcom/tencent/imsdk/message/Message;->getMessageBaseElements()Ljava/util/List;

    .line 157
    move-result-object v0

    .line 158
    .line 159
    .line 160
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 161
    move-result v0

    .line 162
    .line 163
    add-int/lit8 v0, v0, -0x1

    .line 164
    .line 165
    .line 166
    invoke-virtual {p1, v0}, Lcom/tencent/imsdk/v2/V2TIMElem;->setElemIndex(I)V

    .line 167
    return-void

    .line 168
    .line 169
    :cond_4
    const-string p1, "appendElem error, not support this elem type"

    .line 170
    .line 171
    .line 172
    invoke-static {v1, p1}, Lcom/tencent/imsdk/common/IMLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 173
    return-void
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

.method public getElement()Lcom/tencent/imsdk/message/MessageBaseElement;
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMElem;->message:Lcom/tencent/imsdk/message/Message;

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
    invoke-virtual {v0}, Lcom/tencent/imsdk/message/Message;->getMessageBaseElements()Ljava/util/List;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    iget v2, p0, Lcom/tencent/imsdk/v2/V2TIMElem;->elemIndex:I

    .line 13
    .line 14
    if-ltz v2, :cond_2

    .line 15
    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 18
    move-result v2

    .line 19
    .line 20
    iget v3, p0, Lcom/tencent/imsdk/v2/V2TIMElem;->elemIndex:I

    .line 21
    .line 22
    if-gt v2, v3, :cond_1

    .line 23
    goto :goto_0

    .line 24
    .line 25
    .line 26
    :cond_1
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 27
    move-result-object v0

    .line 28
    .line 29
    check-cast v0, Lcom/tencent/imsdk/message/MessageBaseElement;

    .line 30
    return-object v0

    .line 31
    :cond_2
    :goto_0
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

.method public getMessage()Lcom/tencent/imsdk/message/Message;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMElem;->message:Lcom/tencent/imsdk/message/Message;

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

.method public getNextElem()Lcom/tencent/imsdk/v2/V2TIMElem;
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMElem;->message:Lcom/tencent/imsdk/message/Message;

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
    invoke-virtual {v0}, Lcom/tencent/imsdk/message/Message;->getMessageBaseElements()Ljava/util/List;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    iget v2, p0, Lcom/tencent/imsdk/v2/V2TIMElem;->elemIndex:I

    .line 13
    .line 14
    add-int/lit8 v2, v2, 0x1

    .line 15
    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 18
    move-result v3

    .line 19
    .line 20
    if-lt v2, v3, :cond_1

    .line 21
    return-object v1

    .line 22
    .line 23
    :cond_1
    new-instance v1, Lcom/tencent/imsdk/v2/V2TIMElem;

    .line 24
    .line 25
    .line 26
    invoke-direct {v1}, Lcom/tencent/imsdk/v2/V2TIMElem;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 30
    move-result-object v0

    .line 31
    .line 32
    check-cast v0, Lcom/tencent/imsdk/message/MessageBaseElement;

    .line 33
    .line 34
    instance-of v3, v0, Lcom/tencent/imsdk/message/TextElement;

    .line 35
    .line 36
    if-eqz v3, :cond_2

    .line 37
    .line 38
    new-instance v1, Lcom/tencent/imsdk/v2/V2TIMTextElem;

    .line 39
    .line 40
    .line 41
    invoke-direct {v1}, Lcom/tencent/imsdk/v2/V2TIMTextElem;-><init>()V

    .line 42
    goto :goto_0

    .line 43
    .line 44
    :cond_2
    instance-of v3, v0, Lcom/tencent/imsdk/message/ImageElement;

    .line 45
    .line 46
    if-eqz v3, :cond_3

    .line 47
    .line 48
    new-instance v1, Lcom/tencent/imsdk/v2/V2TIMImageElem;

    .line 49
    .line 50
    .line 51
    invoke-direct {v1}, Lcom/tencent/imsdk/v2/V2TIMImageElem;-><init>()V

    .line 52
    goto :goto_0

    .line 53
    .line 54
    :cond_3
    instance-of v3, v0, Lcom/tencent/imsdk/message/VideoElement;

    .line 55
    .line 56
    if-eqz v3, :cond_4

    .line 57
    .line 58
    new-instance v1, Lcom/tencent/imsdk/v2/V2TIMVideoElem;

    .line 59
    .line 60
    .line 61
    invoke-direct {v1}, Lcom/tencent/imsdk/v2/V2TIMVideoElem;-><init>()V

    .line 62
    goto :goto_0

    .line 63
    .line 64
    :cond_4
    instance-of v3, v0, Lcom/tencent/imsdk/message/SoundElement;

    .line 65
    .line 66
    if-eqz v3, :cond_5

    .line 67
    .line 68
    new-instance v1, Lcom/tencent/imsdk/v2/V2TIMSoundElem;

    .line 69
    .line 70
    .line 71
    invoke-direct {v1}, Lcom/tencent/imsdk/v2/V2TIMSoundElem;-><init>()V

    .line 72
    goto :goto_0

    .line 73
    .line 74
    :cond_5
    instance-of v3, v0, Lcom/tencent/imsdk/message/FaceElement;

    .line 75
    .line 76
    if-eqz v3, :cond_6

    .line 77
    .line 78
    new-instance v1, Lcom/tencent/imsdk/v2/V2TIMFaceElem;

    .line 79
    .line 80
    .line 81
    invoke-direct {v1}, Lcom/tencent/imsdk/v2/V2TIMFaceElem;-><init>()V

    .line 82
    goto :goto_0

    .line 83
    .line 84
    :cond_6
    instance-of v3, v0, Lcom/tencent/imsdk/message/FileElement;

    .line 85
    .line 86
    if-eqz v3, :cond_7

    .line 87
    .line 88
    new-instance v1, Lcom/tencent/imsdk/v2/V2TIMFileElem;

    .line 89
    .line 90
    .line 91
    invoke-direct {v1}, Lcom/tencent/imsdk/v2/V2TIMFileElem;-><init>()V

    .line 92
    goto :goto_0

    .line 93
    .line 94
    :cond_7
    instance-of v3, v0, Lcom/tencent/imsdk/message/CustomElement;

    .line 95
    .line 96
    if-eqz v3, :cond_8

    .line 97
    .line 98
    new-instance v1, Lcom/tencent/imsdk/v2/V2TIMCustomElem;

    .line 99
    .line 100
    .line 101
    invoke-direct {v1}, Lcom/tencent/imsdk/v2/V2TIMCustomElem;-><init>()V

    .line 102
    goto :goto_0

    .line 103
    .line 104
    :cond_8
    instance-of v3, v0, Lcom/tencent/imsdk/message/LocationElement;

    .line 105
    .line 106
    if-eqz v3, :cond_9

    .line 107
    .line 108
    new-instance v1, Lcom/tencent/imsdk/v2/V2TIMLocationElem;

    .line 109
    .line 110
    .line 111
    invoke-direct {v1}, Lcom/tencent/imsdk/v2/V2TIMLocationElem;-><init>()V

    .line 112
    goto :goto_0

    .line 113
    .line 114
    :cond_9
    instance-of v3, v0, Lcom/tencent/imsdk/message/MergerElement;

    .line 115
    .line 116
    if-eqz v3, :cond_a

    .line 117
    .line 118
    new-instance v1, Lcom/tencent/imsdk/v2/V2TIMMergerElem;

    .line 119
    .line 120
    .line 121
    invoke-direct {v1}, Lcom/tencent/imsdk/v2/V2TIMMergerElem;-><init>()V

    .line 122
    goto :goto_0

    .line 123
    .line 124
    :cond_a
    instance-of v0, v0, Lcom/tencent/imsdk/message/GroupTipsElement;

    .line 125
    .line 126
    if-eqz v0, :cond_b

    .line 127
    .line 128
    new-instance v1, Lcom/tencent/imsdk/v2/V2TIMGroupTipsElem;

    .line 129
    .line 130
    .line 131
    invoke-direct {v1}, Lcom/tencent/imsdk/v2/V2TIMGroupTipsElem;-><init>()V

    .line 132
    .line 133
    :cond_b
    :goto_0
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMElem;->message:Lcom/tencent/imsdk/message/Message;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v1, v0}, Lcom/tencent/imsdk/v2/V2TIMElem;->setMessage(Lcom/tencent/imsdk/message/Message;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v1, v2}, Lcom/tencent/imsdk/v2/V2TIMElem;->setElemIndex(I)V

    .line 140
    return-object v1
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

.method public setElemIndex(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/tencent/imsdk/v2/V2TIMElem;->elemIndex:I

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

.method public setMessage(Lcom/tencent/imsdk/message/Message;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/imsdk/v2/V2TIMElem;->message:Lcom/tencent/imsdk/message/Message;

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
