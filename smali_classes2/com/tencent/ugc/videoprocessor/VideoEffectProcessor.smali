.class public Lcom/tencent/ugc/videoprocessor/VideoEffectProcessor;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final TAG:Ljava/lang/String; = "VideoEffectProcessor"


# instance fields
.field private final mContext:Landroid/content/Context;

.field private mCurrentEffect:Lcom/tencent/ugc/videobase/chain/TXCGPUImageFilter;

.field private mCurrentEffectType:I

.field private final mMotionFilterConfig:Lcom/tencent/ugc/videoprocessor/videoeffect/data/MotionFilterConfig;

.field private mReverse:Z

.field private mTotalDuration:J


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput-boolean v0, p0, Lcom/tencent/ugc/videoprocessor/VideoEffectProcessor;->mReverse:Z

    .line 7
    const/4 v0, -0x1

    .line 8
    .line 9
    iput v0, p0, Lcom/tencent/ugc/videoprocessor/VideoEffectProcessor;->mCurrentEffectType:I

    .line 10
    .line 11
    const-wide/16 v0, -0x1

    .line 12
    .line 13
    iput-wide v0, p0, Lcom/tencent/ugc/videoprocessor/VideoEffectProcessor;->mTotalDuration:J

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 17
    move-result-object p1

    .line 18
    .line 19
    iput-object p1, p0, Lcom/tencent/ugc/videoprocessor/VideoEffectProcessor;->mContext:Landroid/content/Context;

    .line 20
    .line 21
    new-instance p1, Lcom/tencent/ugc/videoprocessor/videoeffect/data/MotionFilterConfig;

    .line 22
    .line 23
    .line 24
    invoke-direct {p1}, Lcom/tencent/ugc/videoprocessor/videoeffect/data/MotionFilterConfig;-><init>()V

    .line 25
    .line 26
    iput-object p1, p0, Lcom/tencent/ugc/videoprocessor/VideoEffectProcessor;->mMotionFilterConfig:Lcom/tencent/ugc/videoprocessor/videoeffect/data/MotionFilterConfig;

    .line 27
    return-void
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
.end method

.method private createEffect(I)Lcom/tencent/ugc/videobase/chain/TXCGPUImageFilter;
    .locals 1

    .line 1
    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    new-instance p1, Lcom/tencent/ugc/videobase/chain/TXCGPUImageFilter;

    .line 6
    .line 7
    .line 8
    invoke-direct {p1}, Lcom/tencent/ugc/videobase/chain/TXCGPUImageFilter;-><init>()V

    .line 9
    return-object p1

    .line 10
    .line 11
    :pswitch_0
    new-instance p1, Lcom/tencent/ugc/videoprocessor/videoeffect/filter/TXCGPUIllusionFilter;

    .line 12
    .line 13
    .line 14
    invoke-direct {p1}, Lcom/tencent/ugc/videoprocessor/videoeffect/filter/TXCGPUIllusionFilter;-><init>()V

    .line 15
    return-object p1

    .line 16
    .line 17
    :pswitch_1
    new-instance p1, Lcom/tencent/ugc/videoprocessor/videoeffect/filter/TXCGPUMirrorFilter;

    .line 18
    .line 19
    .line 20
    invoke-direct {p1}, Lcom/tencent/ugc/videoprocessor/videoeffect/filter/TXCGPUMirrorFilter;-><init>()V

    .line 21
    return-object p1

    .line 22
    .line 23
    :pswitch_2
    new-instance p1, Lcom/tencent/ugc/videoprocessor/videoeffect/filter/TXCGPULightingFilter;

    .line 24
    .line 25
    iget-object v0, p0, Lcom/tencent/ugc/videoprocessor/VideoEffectProcessor;->mContext:Landroid/content/Context;

    .line 26
    .line 27
    .line 28
    invoke-direct {p1, v0}, Lcom/tencent/ugc/videoprocessor/videoeffect/filter/TXCGPULightingFilter;-><init>(Landroid/content/Context;)V

    .line 29
    return-object p1

    .line 30
    .line 31
    :pswitch_3
    new-instance p1, Lcom/tencent/ugc/videoprocessor/videoeffect/filter/TXCGPUGhostFilter;

    .line 32
    .line 33
    .line 34
    invoke-direct {p1}, Lcom/tencent/ugc/videoprocessor/videoeffect/filter/TXCGPUGhostFilter;-><init>()V

    .line 35
    return-object p1

    .line 36
    .line 37
    :pswitch_4
    new-instance p1, Lcom/tencent/ugc/videoprocessor/videoeffect/filter/TXCGPUPhontomFilter;

    .line 38
    .line 39
    .line 40
    invoke-direct {p1}, Lcom/tencent/ugc/videoprocessor/videoeffect/filter/TXCGPUPhontomFilter;-><init>()V

    .line 41
    return-object p1

    .line 42
    .line 43
    :pswitch_5
    new-instance p1, Lcom/tencent/ugc/videoprocessor/videoeffect/filter/TXCGPUGhostShadowFilter;

    .line 44
    .line 45
    .line 46
    invoke-direct {p1}, Lcom/tencent/ugc/videoprocessor/videoeffect/filter/TXCGPUGhostShadowFilter;-><init>()V

    .line 47
    return-object p1

    .line 48
    .line 49
    :pswitch_6
    new-instance p1, Lcom/tencent/ugc/videoprocessor/videoeffect/filter/TXCGPULinearShadowFilter;

    .line 50
    .line 51
    .line 52
    invoke-direct {p1}, Lcom/tencent/ugc/videoprocessor/videoeffect/filter/TXCGPULinearShadowFilter;-><init>()V

    .line 53
    return-object p1

    .line 54
    .line 55
    :pswitch_7
    new-instance p1, Lcom/tencent/ugc/videoprocessor/videoeffect/filter/TXCGPURockFilter;

    .line 56
    .line 57
    .line 58
    invoke-direct {p1}, Lcom/tencent/ugc/videoprocessor/videoeffect/filter/TXCGPURockFilter;-><init>()V

    .line 59
    return-object p1

    .line 60
    .line 61
    :pswitch_8
    new-instance p1, Lcom/tencent/ugc/videoprocessor/videoeffect/filter/TXCGPUDarkFilter;

    .line 62
    .line 63
    .line 64
    invoke-direct {p1}, Lcom/tencent/ugc/videoprocessor/videoeffect/filter/TXCGPUDarkFilter;-><init>()V

    .line 65
    return-object p1

    .line 66
    .line 67
    :pswitch_9
    new-instance p1, Lcom/tencent/ugc/videoprocessor/videoeffect/filter/TXCGPUSplitScreenFilter;

    .line 68
    .line 69
    .line 70
    invoke-direct {p1}, Lcom/tencent/ugc/videoprocessor/videoeffect/filter/TXCGPUSplitScreenFilter;-><init>()V

    .line 71
    return-object p1

    .line 72
    .line 73
    :pswitch_a
    new-instance p1, Lcom/tencent/ugc/videoprocessor/videoeffect/filter/TXCGPUSpiritOutFilter;

    .line 74
    .line 75
    .line 76
    invoke-direct {p1}, Lcom/tencent/ugc/videoprocessor/videoeffect/filter/TXCGPUSpiritOutFilter;-><init>()V

    .line 77
    return-object p1

    .line 78
    nop

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
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private destroyCurrentEffect()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/ugc/videoprocessor/VideoEffectProcessor;->mCurrentEffect:Lcom/tencent/ugc/videobase/chain/TXCGPUImageFilter;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/tencent/ugc/videobase/chain/TXCGPUImageFilter;->uninitialize()V

    .line 8
    const/4 v0, 0x0

    .line 9
    .line 10
    iput-object v0, p0, Lcom/tencent/ugc/videoprocessor/VideoEffectProcessor;->mCurrentEffect:Lcom/tencent/ugc/videobase/chain/TXCGPUImageFilter;

    .line 11
    :cond_0
    return-void
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
.end method

.method private getCurrentMotion(J)Lcom/tencent/ugc/videoprocessor/videoeffect/data/Motion;
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/ugc/videoprocessor/VideoEffectProcessor;->mMotionFilterConfig:Lcom/tencent/ugc/videoprocessor/videoeffect/data/MotionFilterConfig;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/ugc/videoprocessor/videoeffect/data/MotionFilterConfig;->getMotionList()Ljava/util/List;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Lcom/tencent/ugc/videobase/utils/CollectionUtils;->isEmpty(Ljava/util/Collection;)Z

    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x0

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    return-object v2

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 18
    move-result v1

    .line 19
    .line 20
    add-int/lit8 v1, v1, -0x1

    .line 21
    .line 22
    :goto_0
    if-ltz v1, :cond_2

    .line 23
    .line 24
    .line 25
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 26
    move-result-object v3

    .line 27
    .line 28
    check-cast v3, Lcom/tencent/ugc/videoprocessor/videoeffect/data/Motion;

    .line 29
    .line 30
    .line 31
    invoke-direct {p0, v3, p1, p2}, Lcom/tencent/ugc/videoprocessor/VideoEffectProcessor;->isInMotionTime(Lcom/tencent/ugc/videoprocessor/videoeffect/data/Motion;J)Z

    .line 32
    move-result v4

    .line 33
    .line 34
    if-eqz v4, :cond_1

    .line 35
    move-object v2, v3

    .line 36
    goto :goto_1

    .line 37
    .line 38
    :cond_1
    add-int/lit8 v1, v1, -0x1

    .line 39
    goto :goto_0

    .line 40
    .line 41
    :cond_2
    :goto_1
    iget-object p1, p0, Lcom/tencent/ugc/videoprocessor/VideoEffectProcessor;->mMotionFilterConfig:Lcom/tencent/ugc/videoprocessor/videoeffect/data/MotionFilterConfig;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1}, Lcom/tencent/ugc/videoprocessor/videoeffect/data/MotionFilterConfig;->getCurrentMotion()Lcom/tencent/ugc/videoprocessor/videoeffect/data/Motion;

    .line 45
    move-result-object p1

    .line 46
    .line 47
    iget-wide v0, p1, Lcom/tencent/ugc/videoprocessor/videoeffect/data/Motion;->endTime:J

    .line 48
    .line 49
    const-wide/16 v3, -0x1

    .line 50
    .line 51
    cmp-long p2, v0, v3

    .line 52
    .line 53
    if-nez p2, :cond_3

    .line 54
    return-object p1

    .line 55
    :cond_3
    return-object v2
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
.end method

.method private getMotionPts(Lcom/tencent/ugc/videoprocessor/videoeffect/data/Motion;J)J
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p2, p3}, Lcom/tencent/ugc/videoprocessor/VideoEffectProcessor;->isInMotionTime(Lcom/tencent/ugc/videoprocessor/videoeffect/data/Motion;J)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    const-wide/16 p1, -0x1

    .line 9
    return-wide p1

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-direct {p0, p1}, Lcom/tencent/ugc/videoprocessor/VideoEffectProcessor;->getMotionStartTime(Lcom/tencent/ugc/videoprocessor/videoeffect/data/Motion;)J

    .line 13
    move-result-wide v0

    .line 14
    sub-long/2addr p2, v0

    .line 15
    .line 16
    .line 17
    invoke-static {p2, p3}, Ljava/lang/Math;->abs(J)J

    .line 18
    move-result-wide p1

    .line 19
    add-long/2addr v0, p1

    .line 20
    return-wide v0
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
.end method

.method private getMotionStartTime(Lcom/tencent/ugc/videoprocessor/videoeffect/data/Motion;)J
    .locals 4

    .line 1
    .line 2
    iget-wide v0, p1, Lcom/tencent/ugc/videoprocessor/videoeffect/data/Motion;->endTime:J

    .line 3
    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    cmp-long v2, v0, v2

    .line 7
    .line 8
    if-gez v2, :cond_0

    .line 9
    .line 10
    iget-wide v0, p1, Lcom/tencent/ugc/videoprocessor/videoeffect/data/Motion;->startTime:J

    .line 11
    return-wide v0

    .line 12
    .line 13
    :cond_0
    iget-boolean v2, p0, Lcom/tencent/ugc/videoprocessor/VideoEffectProcessor;->mReverse:Z

    .line 14
    .line 15
    if-eqz v2, :cond_1

    .line 16
    .line 17
    iget-wide v2, p1, Lcom/tencent/ugc/videoprocessor/videoeffect/data/Motion;->startTime:J

    .line 18
    .line 19
    .line 20
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->max(JJ)J

    .line 21
    move-result-wide v0

    .line 22
    return-wide v0

    .line 23
    .line 24
    :cond_1
    iget-wide v2, p1, Lcom/tencent/ugc/videoprocessor/videoeffect/data/Motion;->startTime:J

    .line 25
    .line 26
    .line 27
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    .line 28
    move-result-wide v0

    .line 29
    return-wide v0
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
.end method

.method private getVideoPts(J)J
    .locals 6

    .line 1
    .line 2
    iget-wide v4, p0, Lcom/tencent/ugc/videoprocessor/VideoEffectProcessor;->mTotalDuration:J

    .line 3
    .line 4
    const-wide/16 v0, -0x1

    .line 5
    .line 6
    cmp-long v0, v4, v0

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    return-wide p1

    .line 10
    .line 11
    :cond_0
    sub-long v0, v4, p1

    .line 12
    .line 13
    const-wide/16 v2, 0x0

    .line 14
    .line 15
    .line 16
    invoke-static/range {v0 .. v5}, Lcom/tencent/liteav/base/util/h;->a(JJJ)J

    .line 17
    move-result-wide p1

    .line 18
    return-wide p1
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
.end method

.method private isInMotionTime(Lcom/tencent/ugc/videoprocessor/videoeffect/data/Motion;J)Z
    .locals 8

    .line 1
    .line 2
    iget-wide v0, p1, Lcom/tencent/ugc/videoprocessor/videoeffect/data/Motion;->startTime:J

    .line 3
    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    cmp-long v4, v0, v2

    .line 7
    const/4 v5, 0x0

    .line 8
    .line 9
    if-gez v4, :cond_0

    .line 10
    return v5

    .line 11
    .line 12
    :cond_0
    iget-wide v6, p1, Lcom/tencent/ugc/videoprocessor/videoeffect/data/Motion;->endTime:J

    .line 13
    .line 14
    cmp-long v2, v6, v2

    .line 15
    .line 16
    if-lez v2, :cond_2

    .line 17
    .line 18
    .line 19
    invoke-static {v0, v1, v6, v7}, Ljava/lang/Math;->min(JJ)J

    .line 20
    move-result-wide v0

    .line 21
    .line 22
    iget-wide v2, p1, Lcom/tencent/ugc/videoprocessor/videoeffect/data/Motion;->startTime:J

    .line 23
    .line 24
    iget-wide v6, p1, Lcom/tencent/ugc/videoprocessor/videoeffect/data/Motion;->endTime:J

    .line 25
    .line 26
    .line 27
    invoke-static {v2, v3, v6, v7}, Ljava/lang/Math;->max(JJ)J

    .line 28
    move-result-wide v2

    .line 29
    .line 30
    cmp-long p1, p2, v0

    .line 31
    .line 32
    if-ltz p1, :cond_1

    .line 33
    .line 34
    cmp-long p1, p2, v2

    .line 35
    .line 36
    if-lez p1, :cond_2

    .line 37
    :cond_1
    return v5

    .line 38
    :cond_2
    const/4 p1, 0x1

    .line 39
    return p1
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
.end method


# virtual methods
.method public deleteAllEffect()V
    .locals 2

    .line 1
    .line 2
    const-string v0, "VideoEffectProcessor"

    .line 3
    .line 4
    const-string v1, "==== deleteAllEffect ===="

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v1}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    .line 9
    iget-object v0, p0, Lcom/tencent/ugc/videoprocessor/VideoEffectProcessor;->mMotionFilterConfig:Lcom/tencent/ugc/videoprocessor/videoeffect/data/MotionFilterConfig;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/tencent/ugc/videoprocessor/videoeffect/data/MotionFilterConfig;->clear()V

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
.end method

.method public deleteLastEffect()V
    .locals 2

    .line 1
    .line 2
    const-string v0, "VideoEffectProcessor"

    .line 3
    .line 4
    const-string v1, "==== deleteLastEffect ===="

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v1}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    .line 9
    iget-object v0, p0, Lcom/tencent/ugc/videoprocessor/VideoEffectProcessor;->mMotionFilterConfig:Lcom/tencent/ugc/videoprocessor/videoeffect/data/MotionFilterConfig;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/tencent/ugc/videoprocessor/videoeffect/data/MotionFilterConfig;->deleteLastMotionEffect()V

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
.end method

.method public destroy()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/ugc/videoprocessor/VideoEffectProcessor;->destroyCurrentEffect()V

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
.end method

.method public getCurrentMotionType(J)I
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Lcom/tencent/ugc/videoprocessor/VideoEffectProcessor;->getVideoPts(J)J

    .line 4
    move-result-wide p1

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, p1, p2}, Lcom/tencent/ugc/videoprocessor/VideoEffectProcessor;->getCurrentMotion(J)Lcom/tencent/ugc/videoprocessor/videoeffect/data/Motion;

    .line 8
    move-result-object p1

    .line 9
    .line 10
    if-nez p1, :cond_0

    .line 11
    const/4 p1, -0x1

    .line 12
    return p1

    .line 13
    .line 14
    :cond_0
    iget p1, p1, Lcom/tencent/ugc/videoprocessor/videoeffect/data/Motion;->type:I

    .line 15
    return p1
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
.end method

.method public processFrame(Lcom/tencent/ugc/videobase/frame/PixelFrame;Ljava/nio/FloatBuffer;Ljava/nio/FloatBuffer;Lcom/tencent/ugc/videobase/frame/GLTexturePool;)Lcom/tencent/ugc/videobase/frame/PixelFrame;
    .locals 8

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->getTimestamp()J

    .line 4
    move-result-wide v0

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, v0, v1}, Lcom/tencent/ugc/videoprocessor/VideoEffectProcessor;->getVideoPts(J)J

    .line 8
    move-result-wide v0

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, v0, v1}, Lcom/tencent/ugc/videoprocessor/VideoEffectProcessor;->getCurrentMotion(J)Lcom/tencent/ugc/videoprocessor/videoeffect/data/Motion;

    .line 12
    move-result-object v2

    .line 13
    .line 14
    if-eqz v2, :cond_5

    .line 15
    .line 16
    .line 17
    invoke-direct {p0, v2, v0, v1}, Lcom/tencent/ugc/videoprocessor/VideoEffectProcessor;->isInMotionTime(Lcom/tencent/ugc/videoprocessor/videoeffect/data/Motion;J)Z

    .line 18
    move-result v3

    .line 19
    .line 20
    if-eqz v3, :cond_5

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->getTimestamp()J

    .line 24
    move-result-wide v3

    .line 25
    .line 26
    const-wide/16 v5, 0x0

    .line 27
    .line 28
    cmp-long v3, v3, v5

    .line 29
    .line 30
    if-nez v3, :cond_0

    .line 31
    .line 32
    goto/16 :goto_2

    .line 33
    .line 34
    :cond_0
    iget v3, p0, Lcom/tencent/ugc/videoprocessor/VideoEffectProcessor;->mCurrentEffectType:I

    .line 35
    .line 36
    iget v4, v2, Lcom/tencent/ugc/videoprocessor/videoeffect/data/Motion;->type:I

    .line 37
    .line 38
    if-eq v3, v4, :cond_1

    .line 39
    .line 40
    .line 41
    invoke-direct {p0}, Lcom/tencent/ugc/videoprocessor/VideoEffectProcessor;->destroyCurrentEffect()V

    .line 42
    .line 43
    :cond_1
    iget-object v3, p0, Lcom/tencent/ugc/videoprocessor/VideoEffectProcessor;->mCurrentEffect:Lcom/tencent/ugc/videobase/chain/TXCGPUImageFilter;

    .line 44
    const/4 v4, 0x0

    .line 45
    .line 46
    if-nez v3, :cond_2

    .line 47
    .line 48
    iget v3, v2, Lcom/tencent/ugc/videoprocessor/videoeffect/data/Motion;->type:I

    .line 49
    .line 50
    iput v3, p0, Lcom/tencent/ugc/videoprocessor/VideoEffectProcessor;->mCurrentEffectType:I

    .line 51
    .line 52
    .line 53
    invoke-direct {p0, v3}, Lcom/tencent/ugc/videoprocessor/VideoEffectProcessor;->createEffect(I)Lcom/tencent/ugc/videobase/chain/TXCGPUImageFilter;

    .line 54
    move-result-object v3

    .line 55
    .line 56
    iput-object v3, p0, Lcom/tencent/ugc/videoprocessor/VideoEffectProcessor;->mCurrentEffect:Lcom/tencent/ugc/videobase/chain/TXCGPUImageFilter;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v3, p4}, Lcom/tencent/ugc/videobase/chain/TXCGPUImageFilter;->initialize(Lcom/tencent/ugc/videobase/frame/GLTexturePool;)V

    .line 60
    const/4 v3, 0x1

    .line 61
    goto :goto_0

    .line 62
    :cond_2
    move v3, v4

    .line 63
    .line 64
    :goto_0
    iget-object v5, p0, Lcom/tencent/ugc/videoprocessor/VideoEffectProcessor;->mCurrentEffect:Lcom/tencent/ugc/videobase/chain/TXCGPUImageFilter;

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->getWidth()I

    .line 68
    move-result v6

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->getHeight()I

    .line 72
    move-result v7

    .line 73
    .line 74
    .line 75
    invoke-virtual {v5, v6, v7}, Lcom/tencent/ugc/videobase/chain/TXCGPUImageFilter;->onOutputSizeChanged(II)V

    .line 76
    .line 77
    iget-object v5, p0, Lcom/tencent/ugc/videoprocessor/VideoEffectProcessor;->mCurrentEffect:Lcom/tencent/ugc/videobase/chain/TXCGPUImageFilter;

    .line 78
    .line 79
    instance-of v6, v5, Lcom/tencent/ugc/videoprocessor/videoeffect/TXCGPUEffectFilterBase;

    .line 80
    .line 81
    if-eqz v6, :cond_4

    .line 82
    .line 83
    check-cast v5, Lcom/tencent/ugc/videoprocessor/videoeffect/TXCGPUEffectFilterBase;

    .line 84
    .line 85
    if-eqz v3, :cond_3

    .line 86
    .line 87
    .line 88
    invoke-direct {p0, v2}, Lcom/tencent/ugc/videoprocessor/VideoEffectProcessor;->getMotionStartTime(Lcom/tencent/ugc/videoprocessor/videoeffect/data/Motion;)J

    .line 89
    move-result-wide v0

    .line 90
    .line 91
    .line 92
    invoke-virtual {v5, v0, v1}, Lcom/tencent/ugc/videoprocessor/videoeffect/TXCGPUEffectFilterBase;->setNextFrameTimestamp(J)V

    .line 93
    goto :goto_1

    .line 94
    .line 95
    .line 96
    :cond_3
    invoke-direct {p0, v2, v0, v1}, Lcom/tencent/ugc/videoprocessor/VideoEffectProcessor;->getMotionPts(Lcom/tencent/ugc/videoprocessor/videoeffect/data/Motion;J)J

    .line 97
    move-result-wide v0

    .line 98
    .line 99
    .line 100
    invoke-virtual {v5, v0, v1}, Lcom/tencent/ugc/videoprocessor/videoeffect/TXCGPUEffectFilterBase;->setNextFrameTimestamp(J)V

    .line 101
    .line 102
    .line 103
    :cond_4
    :goto_1
    invoke-virtual {p1}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->getWidth()I

    .line 104
    move-result v0

    .line 105
    .line 106
    .line 107
    invoke-virtual {p1}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->getHeight()I

    .line 108
    move-result v1

    .line 109
    .line 110
    .line 111
    invoke-virtual {p4, v0, v1}, Lcom/tencent/ugc/videobase/frame/GLTexturePool;->obtain(II)Lcom/tencent/ugc/videobase/frame/GLTexture;

    .line 112
    move-result-object p4

    .line 113
    .line 114
    .line 115
    invoke-virtual {p1}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->getColorRange()Lcom/tencent/liteav/videobase/base/GLConstants$ColorRange;

    .line 116
    move-result-object v0

    .line 117
    .line 118
    .line 119
    invoke-virtual {p1}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->getColorSpace()Lcom/tencent/liteav/videobase/base/GLConstants$ColorSpace;

    .line 120
    move-result-object v1

    .line 121
    .line 122
    .line 123
    invoke-virtual {p4, v0, v1}, Lcom/tencent/ugc/videobase/frame/GLTexture;->setColorFormat(Lcom/tencent/liteav/videobase/base/GLConstants$ColorRange;Lcom/tencent/liteav/videobase/base/GLConstants$ColorSpace;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {p1}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->getWidth()I

    .line 127
    move-result v0

    .line 128
    .line 129
    .line 130
    invoke-virtual {p1}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->getHeight()I

    .line 131
    move-result v1

    .line 132
    .line 133
    .line 134
    invoke-static {v4, v4, v0, v1}, Landroid/opengl/GLES20;->glViewport(IIII)V

    .line 135
    .line 136
    iget-object v0, p0, Lcom/tencent/ugc/videoprocessor/VideoEffectProcessor;->mCurrentEffect:Lcom/tencent/ugc/videobase/chain/TXCGPUImageFilter;

    .line 137
    .line 138
    .line 139
    invoke-virtual {p1}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->getTextureId()I

    .line 140
    move-result v1

    .line 141
    .line 142
    .line 143
    invoke-virtual {v0, v1, p4, p2, p3}, Lcom/tencent/ugc/videobase/chain/TXCGPUImageFilter;->onDraw(ILcom/tencent/ugc/videobase/frame/GLTexture;Ljava/nio/FloatBuffer;Ljava/nio/FloatBuffer;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {p1}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->getGLContext()Ljava/lang/Object;

    .line 147
    move-result-object p2

    .line 148
    .line 149
    .line 150
    invoke-virtual {p4, p2}, Lcom/tencent/ugc/videobase/frame/GLTexture;->wrap(Ljava/lang/Object;)Lcom/tencent/ugc/videobase/frame/PixelFrame;

    .line 151
    move-result-object p2

    .line 152
    .line 153
    .line 154
    invoke-virtual {p1}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->getTimestamp()J

    .line 155
    move-result-wide v0

    .line 156
    .line 157
    .line 158
    invoke-virtual {p2, v0, v1}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->setTimestamp(J)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {p4}, Lcom/tencent/ugc/videobase/frame/RefCounted;->release()V

    .line 162
    return-object p2

    .line 163
    .line 164
    .line 165
    :cond_5
    :goto_2
    invoke-direct {p0}, Lcom/tencent/ugc/videoprocessor/VideoEffectProcessor;->destroyCurrentEffect()V

    .line 166
    const/4 p1, 0x0

    .line 167
    return-object p1
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
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
.end method

.method public setReverse(ZJ)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/tencent/ugc/videoprocessor/VideoEffectProcessor;->mReverse:Z

    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    const-wide/16 p1, -0x1

    .line 7
    .line 8
    iput-wide p1, p0, Lcom/tencent/ugc/videoprocessor/VideoEffectProcessor;->mTotalDuration:J

    .line 9
    return-void

    .line 10
    .line 11
    :cond_0
    iput-wide p2, p0, Lcom/tencent/ugc/videoprocessor/VideoEffectProcessor;->mTotalDuration:J

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
.end method

.method public startEffect(IJ)V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    const-string v1, "startEffect: type"

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v1, "  startTime:"

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    const-string v1, "VideoEffectProcessor"

    .line 25
    .line 26
    .line 27
    invoke-static {v1, v0}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    .line 29
    new-instance v0, Lcom/tencent/ugc/videoprocessor/videoeffect/data/Motion;

    .line 30
    .line 31
    .line 32
    invoke-direct {v0, p1}, Lcom/tencent/ugc/videoprocessor/videoeffect/data/Motion;-><init>(I)V

    .line 33
    .line 34
    iput-wide p2, v0, Lcom/tencent/ugc/videoprocessor/videoeffect/data/Motion;->startTime:J

    .line 35
    .line 36
    iget-object p1, p0, Lcom/tencent/ugc/videoprocessor/VideoEffectProcessor;->mMotionFilterConfig:Lcom/tencent/ugc/videoprocessor/videoeffect/data/MotionFilterConfig;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1, v0}, Lcom/tencent/ugc/videoprocessor/videoeffect/data/MotionFilterConfig;->addMotion(Lcom/tencent/ugc/videoprocessor/videoeffect/data/Motion;)V

    .line 40
    return-void
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
.end method

.method public stopEffect(IJ)V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    const-string v1, "stopEffect type: "

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string p1, ", endTime: "

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    move-result-object p1

    .line 23
    .line 24
    const-string v0, "VideoEffectProcessor"

    .line 25
    .line 26
    .line 27
    invoke-static {v0, p1}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    .line 29
    iget-object p1, p0, Lcom/tencent/ugc/videoprocessor/VideoEffectProcessor;->mMotionFilterConfig:Lcom/tencent/ugc/videoprocessor/videoeffect/data/MotionFilterConfig;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Lcom/tencent/ugc/videoprocessor/videoeffect/data/MotionFilterConfig;->getCurrentMotion()Lcom/tencent/ugc/videoprocessor/videoeffect/data/Motion;

    .line 33
    move-result-object p1

    .line 34
    .line 35
    if-eqz p1, :cond_0

    .line 36
    .line 37
    iput-wide p2, p1, Lcom/tencent/ugc/videoprocessor/videoeffect/data/Motion;->endTime:J

    .line 38
    :cond_0
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
.end method
