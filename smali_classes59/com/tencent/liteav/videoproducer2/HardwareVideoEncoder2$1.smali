.class final Lcom/tencent/liteav/videoproducer2/HardwareVideoEncoder2$1;
.super Lcom/tencent/liteav/videoproducer/encoder/e$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/liteav/videoproducer2/HardwareVideoEncoder2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/tencent/liteav/videoproducer2/HardwareVideoEncoder2;


# direct methods
.method public constructor <init>(Lcom/tencent/liteav/videoproducer2/HardwareVideoEncoder2;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/liteav/videoproducer2/HardwareVideoEncoder2$1;->a:Lcom/tencent/liteav/videoproducer2/HardwareVideoEncoder2;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Lcom/tencent/liteav/videoproducer/encoder/e$a;-><init>()V

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


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/videoproducer2/HardwareVideoEncoder2$1;->a:Lcom/tencent/liteav/videoproducer2/HardwareVideoEncoder2;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/tencent/liteav/videoproducer2/HardwareVideoEncoder2;->access$200(Lcom/tencent/liteav/videoproducer2/HardwareVideoEncoder2;)Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x1

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public final onBitrateModeUpdated(Lcom/tencent/liteav/videoproducer/encoder/VideoEncoderDef$BitrateMode;)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/videoproducer2/HardwareVideoEncoder2$1;->a:Lcom/tencent/liteav/videoproducer2/HardwareVideoEncoder2;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/tencent/liteav/videoproducer2/HardwareVideoEncoder2;->access$000(Lcom/tencent/liteav/videoproducer2/HardwareVideoEncoder2;)J

    .line 6
    move-result-wide v1

    .line 7
    .line 8
    iget p1, p1, Lcom/tencent/liteav/videoproducer/encoder/VideoEncoderDef$BitrateMode;->mValue:I

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, v2, p1}, Lcom/tencent/liteav/videoproducer2/HardwareVideoEncoder2;->access$100(Lcom/tencent/liteav/videoproducer2/HardwareVideoEncoder2;JI)V

    .line 12
    return-void
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

.method public final onEncodedFail(Lcom/tencent/liteav/videobase/videobase/e$a;)V
    .locals 0

    .line 1
    .line 2
    sget-object p1, Lcom/tencent/liteav/videobase/videobase/e$a;->a:Lcom/tencent/liteav/videobase/videobase/e$a;

    .line 3
    .line 4
    iget-object p1, p0, Lcom/tencent/liteav/videoproducer2/HardwareVideoEncoder2$1;->a:Lcom/tencent/liteav/videoproducer2/HardwareVideoEncoder2;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Lcom/tencent/liteav/videoproducer2/HardwareVideoEncoder2;->notifyEncodeFail()V

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
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public final declared-synchronized onEncodedNAL(Lcom/tencent/liteav/videobase/common/EncodedVideoFrame;Z)V
    .locals 29

    .line 1
    .line 2
    move-object/from16 v1, p0

    .line 3
    .line 4
    move-object/from16 v5, p1

    .line 5
    monitor-enter p0

    .line 6
    .line 7
    :try_start_0
    iget-object v0, v1, Lcom/tencent/liteav/videoproducer2/HardwareVideoEncoder2$1;->a:Lcom/tencent/liteav/videoproducer2/HardwareVideoEncoder2;

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Lcom/tencent/liteav/videoproducer2/HardwareVideoEncoder2;->access$000(Lcom/tencent/liteav/videoproducer2/HardwareVideoEncoder2;)J

    .line 11
    move-result-wide v2

    .line 12
    .line 13
    const-wide/16 v6, 0x0

    .line 14
    .line 15
    cmp-long v0, v2, v6

    .line 16
    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    if-nez p2, :cond_2

    .line 20
    .line 21
    iget-object v2, v1, Lcom/tencent/liteav/videoproducer2/HardwareVideoEncoder2$1;->a:Lcom/tencent/liteav/videoproducer2/HardwareVideoEncoder2;

    .line 22
    .line 23
    .line 24
    invoke-static {v2}, Lcom/tencent/liteav/videoproducer2/HardwareVideoEncoder2;->access$000(Lcom/tencent/liteav/videoproducer2/HardwareVideoEncoder2;)J

    .line 25
    move-result-wide v3

    .line 26
    .line 27
    iget-object v6, v5, Lcom/tencent/liteav/videobase/common/EncodedVideoFrame;->data:Ljava/nio/ByteBuffer;

    .line 28
    .line 29
    iget-object v0, v5, Lcom/tencent/liteav/videobase/common/EncodedVideoFrame;->nalType:Lcom/tencent/liteav/videobase/common/c;

    .line 30
    .line 31
    iget v7, v0, Lcom/tencent/liteav/videobase/common/c;->mValue:I

    .line 32
    .line 33
    iget-object v0, v5, Lcom/tencent/liteav/videobase/common/EncodedVideoFrame;->profileType:Lcom/tencent/liteav/videobase/common/d;

    .line 34
    .line 35
    iget v8, v0, Lcom/tencent/liteav/videobase/common/d;->mValue:I

    .line 36
    .line 37
    iget-object v0, v5, Lcom/tencent/liteav/videobase/common/EncodedVideoFrame;->codecType:Lcom/tencent/liteav/videobase/common/CodecType;

    .line 38
    .line 39
    iget v9, v0, Lcom/tencent/liteav/videobase/common/CodecType;->mValue:I

    .line 40
    .line 41
    iget v10, v5, Lcom/tencent/liteav/videobase/common/EncodedVideoFrame;->rotation:I

    .line 42
    .line 43
    iget-wide v11, v5, Lcom/tencent/liteav/videobase/common/EncodedVideoFrame;->dts:J

    .line 44
    .line 45
    iget-wide v13, v5, Lcom/tencent/liteav/videobase/common/EncodedVideoFrame;->pts:J

    .line 46
    move-object v0, v2

    .line 47
    move-wide v15, v3

    .line 48
    .line 49
    iget-wide v2, v5, Lcom/tencent/liteav/videobase/common/EncodedVideoFrame;->gopIndex:J

    .line 50
    .line 51
    move-wide/from16 v17, v2

    .line 52
    .line 53
    iget-wide v2, v5, Lcom/tencent/liteav/videobase/common/EncodedVideoFrame;->gopFrameIndex:J

    .line 54
    .line 55
    move-wide/from16 v19, v2

    .line 56
    .line 57
    iget-wide v2, v5, Lcom/tencent/liteav/videobase/common/EncodedVideoFrame;->frameIndex:J

    .line 58
    .line 59
    move-wide/from16 v21, v2

    .line 60
    .line 61
    iget-wide v2, v5, Lcom/tencent/liteav/videobase/common/EncodedVideoFrame;->refFrameIndex:J

    .line 62
    .line 63
    iget v4, v5, Lcom/tencent/liteav/videobase/common/EncodedVideoFrame;->width:I

    .line 64
    .line 65
    move-object/from16 p2, v0

    .line 66
    .line 67
    iget v0, v5, Lcom/tencent/liteav/videobase/common/EncodedVideoFrame;->height:I

    .line 68
    .line 69
    move/from16 v24, v0

    .line 70
    .line 71
    iget-object v0, v5, Lcom/tencent/liteav/videobase/common/EncodedVideoFrame;->svcInfo:Ljava/lang/Integer;

    .line 72
    .line 73
    const/16 v23, 0x0

    .line 74
    .line 75
    if-eqz v0, :cond_0

    .line 76
    .line 77
    const/16 v25, 0x1

    .line 78
    goto :goto_0

    .line 79
    .line 80
    :cond_0
    move/from16 v25, v23

    .line 81
    .line 82
    :goto_0
    if-nez v0, :cond_1

    .line 83
    .line 84
    :goto_1
    move/from16 v26, v23

    .line 85
    .line 86
    move/from16 v23, v4

    .line 87
    .line 88
    move-wide/from16 v27, v2

    .line 89
    .line 90
    move-object/from16 v2, p2

    .line 91
    move-wide v3, v15

    .line 92
    .line 93
    move-wide/from16 v15, v17

    .line 94
    .line 95
    move-wide/from16 v17, v19

    .line 96
    .line 97
    move-wide/from16 v19, v21

    .line 98
    .line 99
    move-wide/from16 v21, v27

    .line 100
    goto :goto_2

    .line 101
    .line 102
    .line 103
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 104
    move-result v23

    .line 105
    goto :goto_1

    .line 106
    .line 107
    .line 108
    :goto_2
    invoke-static/range {v2 .. v26}, Lcom/tencent/liteav/videoproducer2/HardwareVideoEncoder2;->access$300(Lcom/tencent/liteav/videoproducer2/HardwareVideoEncoder2;JLcom/tencent/liteav/videobase/common/EncodedVideoFrame;Ljava/nio/ByteBuffer;IIIIJJJJJJIIZI)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 109
    monitor-exit p0

    .line 110
    return-void

    .line 111
    :catchall_0
    move-exception v0

    .line 112
    goto :goto_3

    .line 113
    .line 114
    :cond_2
    :try_start_1
    iget-object v0, v1, Lcom/tencent/liteav/videoproducer2/HardwareVideoEncoder2$1;->a:Lcom/tencent/liteav/videoproducer2/HardwareVideoEncoder2;

    .line 115
    .line 116
    .line 117
    invoke-static {v0}, Lcom/tencent/liteav/videoproducer2/HardwareVideoEncoder2;->access$400(Lcom/tencent/liteav/videoproducer2/HardwareVideoEncoder2;)Ljava/lang/String;

    .line 118
    move-result-object v0

    .line 119
    .line 120
    .line 121
    const-string/jumbo v2, "onEncodedNAL mNativeHandler=%d,isEos=%b"

    .line 122
    .line 123
    iget-object v3, v1, Lcom/tencent/liteav/videoproducer2/HardwareVideoEncoder2$1;->a:Lcom/tencent/liteav/videoproducer2/HardwareVideoEncoder2;

    .line 124
    .line 125
    .line 126
    invoke-static {v3}, Lcom/tencent/liteav/videoproducer2/HardwareVideoEncoder2;->access$000(Lcom/tencent/liteav/videoproducer2/HardwareVideoEncoder2;)J

    .line 127
    move-result-wide v3

    .line 128
    .line 129
    .line 130
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 131
    move-result-object v3

    .line 132
    .line 133
    .line 134
    invoke-static/range {p2 .. p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 135
    move-result-object v4

    .line 136
    .line 137
    .line 138
    filled-new-array {v3, v4}, [Ljava/lang/Object;

    .line 139
    move-result-object v3

    .line 140
    .line 141
    .line 142
    invoke-static {v0, v2, v3}, Lcom/tencent/liteav/base/util/LiteavLog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 143
    monitor-exit p0

    .line 144
    return-void

    .line 145
    :goto_3
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 146
    throw v0
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
