.class Lio/flutter/plugins/videoplayer/Messages$PigeonCodec;
.super Lio/flutter/plugin/common/StandardMessageCodec;
.source "Messages.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/plugins/videoplayer/Messages;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "PigeonCodec"
.end annotation


# static fields
.field public static final INSTANCE:Lio/flutter/plugins/videoplayer/Messages$PigeonCodec;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lio/flutter/plugins/videoplayer/Messages$PigeonCodec;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lio/flutter/plugins/videoplayer/Messages$PigeonCodec;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lio/flutter/plugins/videoplayer/Messages$PigeonCodec;->INSTANCE:Lio/flutter/plugins/videoplayer/Messages$PigeonCodec;

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
    .line 18
    .line 19
    .line 20
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lio/flutter/plugin/common/StandardMessageCodec;-><init>()V

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
    .line 18
    .line 19
    .line 20
.end method


# virtual methods
.method public readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;
    .locals 0
    .param p2    # Ljava/nio/ByteBuffer;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2}, Lio/flutter/plugin/common/StandardMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 7
    move-result-object p1

    .line 8
    return-object p1

    .line 9
    .line 10
    .line 11
    :pswitch_0
    invoke-virtual {p0, p2}, Lio/flutter/plugin/common/StandardMessageCodec;->readValue(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 12
    move-result-object p1

    .line 13
    .line 14
    check-cast p1, Ljava/util/ArrayList;

    .line 15
    .line 16
    .line 17
    invoke-static {p1}, Lio/flutter/plugins/videoplayer/Messages$PlaybackState;->fromList(Ljava/util/ArrayList;)Lio/flutter/plugins/videoplayer/Messages$PlaybackState;

    .line 18
    move-result-object p1

    .line 19
    return-object p1

    .line 20
    .line 21
    .line 22
    :pswitch_1
    invoke-virtual {p0, p2}, Lio/flutter/plugin/common/StandardMessageCodec;->readValue(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 23
    move-result-object p1

    .line 24
    .line 25
    check-cast p1, Ljava/util/ArrayList;

    .line 26
    .line 27
    .line 28
    invoke-static {p1}, Lio/flutter/plugins/videoplayer/Messages$TexturePlayerIds;->fromList(Ljava/util/ArrayList;)Lio/flutter/plugins/videoplayer/Messages$TexturePlayerIds;

    .line 29
    move-result-object p1

    .line 30
    return-object p1

    .line 31
    .line 32
    .line 33
    :pswitch_2
    invoke-virtual {p0, p2}, Lio/flutter/plugin/common/StandardMessageCodec;->readValue(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 34
    move-result-object p1

    .line 35
    .line 36
    check-cast p1, Ljava/util/ArrayList;

    .line 37
    .line 38
    .line 39
    invoke-static {p1}, Lio/flutter/plugins/videoplayer/Messages$CreationOptions;->fromList(Ljava/util/ArrayList;)Lio/flutter/plugins/videoplayer/Messages$CreationOptions;

    .line 40
    move-result-object p1

    .line 41
    return-object p1

    .line 42
    .line 43
    .line 44
    :pswitch_3
    invoke-virtual {p0, p2}, Lio/flutter/plugin/common/StandardMessageCodec;->readValue(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 45
    move-result-object p1

    .line 46
    .line 47
    check-cast p1, Ljava/util/ArrayList;

    .line 48
    .line 49
    .line 50
    invoke-static {p1}, Lio/flutter/plugins/videoplayer/Messages$PlatformVideoViewCreationParams;->fromList(Ljava/util/ArrayList;)Lio/flutter/plugins/videoplayer/Messages$PlatformVideoViewCreationParams;

    .line 51
    move-result-object p1

    .line 52
    return-object p1

    .line 53
    .line 54
    .line 55
    :pswitch_4
    invoke-virtual {p0, p2}, Lio/flutter/plugin/common/StandardMessageCodec;->readValue(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 56
    move-result-object p1

    .line 57
    .line 58
    if-nez p1, :cond_0

    .line 59
    const/4 p1, 0x0

    .line 60
    return-object p1

    .line 61
    .line 62
    .line 63
    :cond_0
    invoke-static {}, Lio/flutter/plugins/videoplayer/Messages$PlatformVideoFormat;->values()[Lio/flutter/plugins/videoplayer/Messages$PlatformVideoFormat;

    .line 64
    move-result-object p2

    .line 65
    .line 66
    check-cast p1, Ljava/lang/Long;

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1}, Ljava/lang/Long;->intValue()I

    .line 70
    move-result p1

    .line 71
    .line 72
    aget-object p1, p2, p1

    .line 73
    return-object p1

    .line 74
    nop

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
    :pswitch_data_0
    .packed-switch -0x7f
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method

.method public writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V
    .locals 1
    .param p1    # Ljava/io/ByteArrayOutputStream;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    instance-of v0, p2, Lio/flutter/plugins/videoplayer/Messages$PlatformVideoFormat;

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    const/16 v0, 0x81

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 10
    .line 11
    if-nez p2, :cond_0

    .line 12
    const/4 p2, 0x0

    .line 13
    goto :goto_0

    .line 14
    .line 15
    :cond_0
    check-cast p2, Lio/flutter/plugins/videoplayer/Messages$PlatformVideoFormat;

    .line 16
    .line 17
    iget p2, p2, Lio/flutter/plugins/videoplayer/Messages$PlatformVideoFormat;->index:I

    .line 18
    .line 19
    .line 20
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 21
    move-result-object p2

    .line 22
    .line 23
    .line 24
    :goto_0
    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/videoplayer/Messages$PigeonCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 25
    return-void

    .line 26
    .line 27
    :cond_1
    instance-of v0, p2, Lio/flutter/plugins/videoplayer/Messages$PlatformVideoViewCreationParams;

    .line 28
    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    const/16 v0, 0x82

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 35
    .line 36
    check-cast p2, Lio/flutter/plugins/videoplayer/Messages$PlatformVideoViewCreationParams;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p2}, Lio/flutter/plugins/videoplayer/Messages$PlatformVideoViewCreationParams;->toList()Ljava/util/ArrayList;

    .line 40
    move-result-object p2

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/videoplayer/Messages$PigeonCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 44
    return-void

    .line 45
    .line 46
    :cond_2
    instance-of v0, p2, Lio/flutter/plugins/videoplayer/Messages$CreationOptions;

    .line 47
    .line 48
    if-eqz v0, :cond_3

    .line 49
    .line 50
    const/16 v0, 0x83

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 54
    .line 55
    check-cast p2, Lio/flutter/plugins/videoplayer/Messages$CreationOptions;

    .line 56
    .line 57
    .line 58
    invoke-virtual {p2}, Lio/flutter/plugins/videoplayer/Messages$CreationOptions;->toList()Ljava/util/ArrayList;

    .line 59
    move-result-object p2

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/videoplayer/Messages$PigeonCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 63
    return-void

    .line 64
    .line 65
    :cond_3
    instance-of v0, p2, Lio/flutter/plugins/videoplayer/Messages$TexturePlayerIds;

    .line 66
    .line 67
    if-eqz v0, :cond_4

    .line 68
    .line 69
    const/16 v0, 0x84

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 73
    .line 74
    check-cast p2, Lio/flutter/plugins/videoplayer/Messages$TexturePlayerIds;

    .line 75
    .line 76
    .line 77
    invoke-virtual {p2}, Lio/flutter/plugins/videoplayer/Messages$TexturePlayerIds;->toList()Ljava/util/ArrayList;

    .line 78
    move-result-object p2

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/videoplayer/Messages$PigeonCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 82
    return-void

    .line 83
    .line 84
    :cond_4
    instance-of v0, p2, Lio/flutter/plugins/videoplayer/Messages$PlaybackState;

    .line 85
    .line 86
    if-eqz v0, :cond_5

    .line 87
    .line 88
    const/16 v0, 0x85

    .line 89
    .line 90
    .line 91
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 92
    .line 93
    check-cast p2, Lio/flutter/plugins/videoplayer/Messages$PlaybackState;

    .line 94
    .line 95
    .line 96
    invoke-virtual {p2}, Lio/flutter/plugins/videoplayer/Messages$PlaybackState;->toList()Ljava/util/ArrayList;

    .line 97
    move-result-object p2

    .line 98
    .line 99
    .line 100
    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/videoplayer/Messages$PigeonCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 101
    return-void

    .line 102
    .line 103
    .line 104
    :cond_5
    invoke-super {p0, p1, p2}, Lio/flutter/plugin/common/StandardMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 105
    return-void
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
.end method
