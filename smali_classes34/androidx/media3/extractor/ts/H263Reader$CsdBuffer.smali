.class final Landroidx/media3/extractor/ts/H263Reader$CsdBuffer;
.super Ljava/lang/Object;
.source "H263Reader.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/extractor/ts/H263Reader;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "CsdBuffer"
.end annotation


# static fields
.field private static final START_CODE:[B

.field private static final STATE_EXPECT_VIDEO_OBJECT_LAYER_START:I = 0x3

.field private static final STATE_EXPECT_VIDEO_OBJECT_START:I = 0x2

.field private static final STATE_EXPECT_VISUAL_OBJECT_START:I = 0x1

.field private static final STATE_SKIP_TO_VISUAL_OBJECT_SEQUENCE_START:I = 0x0

.field private static final STATE_WAIT_FOR_VOP_START:I = 0x4


# instance fields
.field public data:[B

.field private isFilling:Z

.field public length:I

.field private state:I

.field public volStartPosition:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    .line 3
    new-array v0, v0, [B

    .line 4
    .line 5
    .line 6
    fill-array-data v0, :array_0

    .line 7
    .line 8
    sput-object v0, Landroidx/media3/extractor/ts/H263Reader$CsdBuffer;->START_CODE:[B

    .line 9
    return-void

    .line 10
    nop

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    :array_0
    .array-data 1
        0x0t
        0x0t
        0x1t
    .end array-data
    .line 17
    .line 18
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-array p1, p1, [B

    .line 6
    .line 7
    iput-object p1, p0, Landroidx/media3/extractor/ts/H263Reader$CsdBuffer;->data:[B

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
.end method


# virtual methods
.method public onData([BII)V
    .locals 4

    .line 1
    .line 2
    iget-boolean v0, p0, Landroidx/media3/extractor/ts/H263Reader$CsdBuffer;->isFilling:Z

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    return-void

    .line 6
    :cond_0
    sub-int/2addr p3, p2

    .line 7
    .line 8
    iget-object v0, p0, Landroidx/media3/extractor/ts/H263Reader$CsdBuffer;->data:[B

    .line 9
    array-length v1, v0

    .line 10
    .line 11
    iget v2, p0, Landroidx/media3/extractor/ts/H263Reader$CsdBuffer;->length:I

    .line 12
    .line 13
    add-int v3, v2, p3

    .line 14
    .line 15
    if-ge v1, v3, :cond_1

    .line 16
    add-int/2addr v2, p3

    .line 17
    .line 18
    mul-int/lit8 v2, v2, 0x2

    .line 19
    .line 20
    .line 21
    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 22
    move-result-object v0

    .line 23
    .line 24
    iput-object v0, p0, Landroidx/media3/extractor/ts/H263Reader$CsdBuffer;->data:[B

    .line 25
    .line 26
    :cond_1
    iget-object v0, p0, Landroidx/media3/extractor/ts/H263Reader$CsdBuffer;->data:[B

    .line 27
    .line 28
    iget v1, p0, Landroidx/media3/extractor/ts/H263Reader$CsdBuffer;->length:I

    .line 29
    .line 30
    .line 31
    invoke-static {p1, p2, v0, v1, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 32
    .line 33
    iget p1, p0, Landroidx/media3/extractor/ts/H263Reader$CsdBuffer;->length:I

    .line 34
    add-int/2addr p1, p3

    .line 35
    .line 36
    iput p1, p0, Landroidx/media3/extractor/ts/H263Reader$CsdBuffer;->length:I

    .line 37
    return-void
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
.end method

.method public onStartCode(II)Z
    .locals 8

    .line 1
    .line 2
    iget v0, p0, Landroidx/media3/extractor/ts/H263Reader$CsdBuffer;->state:I

    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    .line 6
    if-eqz v0, :cond_8

    .line 7
    .line 8
    const/16 v3, 0xb5

    .line 9
    const/4 v4, 0x2

    .line 10
    .line 11
    const-string v5, "Unexpected start code value"

    .line 12
    .line 13
    const-string v6, "H263Reader"

    .line 14
    .line 15
    if-eq v0, v2, :cond_6

    .line 16
    const/4 v7, 0x3

    .line 17
    .line 18
    if-eq v0, v4, :cond_4

    .line 19
    const/4 v4, 0x4

    .line 20
    .line 21
    if-eq v0, v7, :cond_2

    .line 22
    .line 23
    if-ne v0, v4, :cond_1

    .line 24
    .line 25
    const/16 v0, 0xb3

    .line 26
    .line 27
    if-eq p1, v0, :cond_0

    .line 28
    .line 29
    if-ne p1, v3, :cond_9

    .line 30
    .line 31
    :cond_0
    iget p1, p0, Landroidx/media3/extractor/ts/H263Reader$CsdBuffer;->length:I

    .line 32
    sub-int/2addr p1, p2

    .line 33
    .line 34
    iput p1, p0, Landroidx/media3/extractor/ts/H263Reader$CsdBuffer;->length:I

    .line 35
    .line 36
    iput-boolean v1, p0, Landroidx/media3/extractor/ts/H263Reader$CsdBuffer;->isFilling:Z

    .line 37
    return v2

    .line 38
    .line 39
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 40
    .line 41
    .line 42
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 43
    throw p1

    .line 44
    .line 45
    :cond_2
    and-int/lit16 p1, p1, 0xf0

    .line 46
    .line 47
    const/16 p2, 0x20

    .line 48
    .line 49
    if-eq p1, p2, :cond_3

    .line 50
    .line 51
    .line 52
    invoke-static {v6, v5}, Landroidx/media3/common/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0}, Landroidx/media3/extractor/ts/H263Reader$CsdBuffer;->reset()V

    .line 56
    goto :goto_0

    .line 57
    .line 58
    :cond_3
    iget p1, p0, Landroidx/media3/extractor/ts/H263Reader$CsdBuffer;->length:I

    .line 59
    .line 60
    iput p1, p0, Landroidx/media3/extractor/ts/H263Reader$CsdBuffer;->volStartPosition:I

    .line 61
    .line 62
    iput v4, p0, Landroidx/media3/extractor/ts/H263Reader$CsdBuffer;->state:I

    .line 63
    goto :goto_0

    .line 64
    .line 65
    :cond_4
    const/16 p2, 0x1f

    .line 66
    .line 67
    if-le p1, p2, :cond_5

    .line 68
    .line 69
    .line 70
    invoke-static {v6, v5}, Landroidx/media3/common/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0}, Landroidx/media3/extractor/ts/H263Reader$CsdBuffer;->reset()V

    .line 74
    goto :goto_0

    .line 75
    .line 76
    :cond_5
    iput v7, p0, Landroidx/media3/extractor/ts/H263Reader$CsdBuffer;->state:I

    .line 77
    goto :goto_0

    .line 78
    .line 79
    :cond_6
    if-eq p1, v3, :cond_7

    .line 80
    .line 81
    .line 82
    invoke-static {v6, v5}, Landroidx/media3/common/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0}, Landroidx/media3/extractor/ts/H263Reader$CsdBuffer;->reset()V

    .line 86
    goto :goto_0

    .line 87
    .line 88
    :cond_7
    iput v4, p0, Landroidx/media3/extractor/ts/H263Reader$CsdBuffer;->state:I

    .line 89
    goto :goto_0

    .line 90
    .line 91
    :cond_8
    const/16 p2, 0xb0

    .line 92
    .line 93
    if-ne p1, p2, :cond_9

    .line 94
    .line 95
    iput v2, p0, Landroidx/media3/extractor/ts/H263Reader$CsdBuffer;->state:I

    .line 96
    .line 97
    iput-boolean v2, p0, Landroidx/media3/extractor/ts/H263Reader$CsdBuffer;->isFilling:Z

    .line 98
    .line 99
    :cond_9
    :goto_0
    sget-object p1, Landroidx/media3/extractor/ts/H263Reader$CsdBuffer;->START_CODE:[B

    .line 100
    array-length p2, p1

    .line 101
    .line 102
    .line 103
    invoke-virtual {p0, p1, v1, p2}, Landroidx/media3/extractor/ts/H263Reader$CsdBuffer;->onData([BII)V

    .line 104
    return v1
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
.end method

.method public reset()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    iput-boolean v0, p0, Landroidx/media3/extractor/ts/H263Reader$CsdBuffer;->isFilling:Z

    .line 4
    .line 5
    iput v0, p0, Landroidx/media3/extractor/ts/H263Reader$CsdBuffer;->length:I

    .line 6
    .line 7
    iput v0, p0, Landroidx/media3/extractor/ts/H263Reader$CsdBuffer;->state:I

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
.end method
