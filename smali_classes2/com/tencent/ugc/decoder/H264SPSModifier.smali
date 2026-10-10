.class public Lcom/tencent/ugc/decoder/H264SPSModifier;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final DEBUG:Z = false

.field private static final TAG:Ljava/lang/String; = "H264SPSModifier"


# instance fields
.field private mReceiveFirstVUI:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput-boolean v0, p0, Lcom/tencent/ugc/decoder/H264SPSModifier;->mReceiveFirstVUI:Z

    .line 7
    return-void
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

.method private deEmulationPrevention([B)[B
    .locals 9

    .line 1
    array-length v0, p1

    .line 2
    .line 3
    new-array v0, v0, [B

    .line 4
    const/4 v1, 0x0

    .line 5
    move v2, v1

    .line 6
    move v3, v2

    .line 7
    :goto_0
    array-length v4, p1

    .line 8
    .line 9
    if-ge v2, v4, :cond_1

    .line 10
    array-length v4, p1

    .line 11
    const/4 v5, 0x3

    .line 12
    sub-int/2addr v4, v5

    .line 13
    .line 14
    if-ge v2, v4, :cond_0

    .line 15
    .line 16
    aget-byte v4, p1, v2

    .line 17
    .line 18
    if-nez v4, :cond_0

    .line 19
    .line 20
    add-int/lit8 v6, v2, 0x1

    .line 21
    .line 22
    aget-byte v7, p1, v6

    .line 23
    .line 24
    if-nez v7, :cond_0

    .line 25
    .line 26
    add-int/lit8 v7, v2, 0x2

    .line 27
    .line 28
    aget-byte v7, p1, v7

    .line 29
    .line 30
    if-ne v7, v5, :cond_0

    .line 31
    .line 32
    add-int/lit8 v7, v2, 0x3

    .line 33
    .line 34
    aget-byte v8, p1, v7

    .line 35
    .line 36
    if-gt v8, v5, :cond_0

    .line 37
    .line 38
    add-int/lit8 v2, v3, 0x1

    .line 39
    .line 40
    aput-byte v4, v0, v3

    .line 41
    .line 42
    add-int/lit8 v3, v3, 0x2

    .line 43
    .line 44
    aget-byte v4, p1, v6

    .line 45
    .line 46
    aput-byte v4, v0, v2

    .line 47
    move v2, v7

    .line 48
    goto :goto_0

    .line 49
    .line 50
    :cond_0
    add-int/lit8 v4, v3, 0x1

    .line 51
    .line 52
    aget-byte v5, p1, v2

    .line 53
    .line 54
    aput-byte v5, v0, v3

    .line 55
    .line 56
    add-int/lit8 v2, v2, 0x1

    .line 57
    move v3, v4

    .line 58
    goto :goto_0

    .line 59
    :cond_1
    array-length p1, p1

    .line 60
    .line 61
    if-eq v3, p1, :cond_2

    .line 62
    .line 63
    new-array p1, v3, [B

    .line 64
    .line 65
    .line 66
    invoke-static {v0, v1, p1, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 67
    return-object p1

    .line 68
    :cond_2
    const/4 p1, 0x0

    .line 69
    return-object p1
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

.method private emulationPrevention([B)[B
    .locals 9

    .line 1
    array-length v0, p1

    .line 2
    const/4 v1, 0x3

    .line 3
    mul-int/2addr v0, v1

    .line 4
    .line 5
    div-int/lit8 v0, v0, 0x2

    .line 6
    .line 7
    new-array v0, v0, [B

    .line 8
    const/4 v2, 0x0

    .line 9
    move v3, v2

    .line 10
    move v4, v3

    .line 11
    :goto_0
    array-length v5, p1

    .line 12
    .line 13
    if-ge v3, v5, :cond_1

    .line 14
    array-length v5, p1

    .line 15
    .line 16
    add-int/lit8 v5, v5, -0x2

    .line 17
    .line 18
    if-ge v3, v5, :cond_0

    .line 19
    .line 20
    aget-byte v5, p1, v3

    .line 21
    .line 22
    if-nez v5, :cond_0

    .line 23
    .line 24
    add-int/lit8 v6, v3, 0x1

    .line 25
    .line 26
    aget-byte v7, p1, v6

    .line 27
    .line 28
    if-nez v7, :cond_0

    .line 29
    .line 30
    add-int/lit8 v7, v3, 0x2

    .line 31
    .line 32
    aget-byte v8, p1, v7

    .line 33
    .line 34
    if-gt v8, v1, :cond_0

    .line 35
    .line 36
    add-int/lit8 v3, v4, 0x1

    .line 37
    .line 38
    aput-byte v5, v0, v4

    .line 39
    .line 40
    add-int/lit8 v5, v4, 0x2

    .line 41
    .line 42
    aget-byte v6, p1, v6

    .line 43
    .line 44
    aput-byte v6, v0, v3

    .line 45
    .line 46
    add-int/lit8 v4, v4, 0x3

    .line 47
    .line 48
    aput-byte v1, v0, v5

    .line 49
    move v3, v7

    .line 50
    goto :goto_0

    .line 51
    .line 52
    :cond_0
    add-int/lit8 v5, v4, 0x1

    .line 53
    .line 54
    aget-byte v6, p1, v3

    .line 55
    .line 56
    aput-byte v6, v0, v4

    .line 57
    .line 58
    add-int/lit8 v3, v3, 0x1

    .line 59
    move v4, v5

    .line 60
    goto :goto_0

    .line 61
    :cond_1
    array-length v1, p1

    .line 62
    .line 63
    if-eq v4, v1, :cond_2

    .line 64
    .line 65
    new-array p1, v4, [B

    .line 66
    .line 67
    .line 68
    invoke-static {v0, v2, p1, v2, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 69
    :cond_2
    return-object p1
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

.method private modifyVUIParameters(Lcom/tencent/ugc/decoder/H264RbspRewriter;)Z
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "VUI: aspect_ratio_info_present_flag"

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1, v0}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->readBool(Ljava/lang/String;)Z

    .line 6
    move-result v0

    .line 7
    .line 8
    const/16 v1, 0x8

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    const-string v0, "VUI: aspect_ratio"

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, v1, v0}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->readNBit(ILjava/lang/String;)J

    .line 16
    move-result-wide v2

    .line 17
    long-to-int v0, v2

    .line 18
    .line 19
    const/16 v2, 0xff

    .line 20
    .line 21
    if-ne v0, v2, :cond_0

    .line 22
    .line 23
    const-string v0, "VUI: sar_width"

    .line 24
    .line 25
    const/16 v2, 0x10

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1, v2, v0}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->skipNBit(ILjava/lang/String;)V

    .line 29
    .line 30
    const-string v0, "VUI: sar_height"

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1, v2, v0}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->skipNBit(ILjava/lang/String;)V

    .line 34
    .line 35
    :cond_0
    const-string v0, "VUI: overscan_info_present_flag"

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1, v0}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->readBool(Ljava/lang/String;)Z

    .line 39
    move-result v0

    .line 40
    const/4 v2, 0x1

    .line 41
    .line 42
    if-eqz v0, :cond_1

    .line 43
    .line 44
    const-string v0, "VUI: overscan_appropriate_flag"

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1, v2, v0}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->skipNBit(ILjava/lang/String;)V

    .line 48
    .line 49
    :cond_1
    const-string v0, "VUI: video_signal_type_present_flag"

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1, v0}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->readBool(Ljava/lang/String;)Z

    .line 53
    move-result v0

    .line 54
    .line 55
    if-eqz v0, :cond_2

    .line 56
    const/4 v0, 0x3

    .line 57
    .line 58
    const-string v3, "VUI: video_format"

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1, v0, v3}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->skipNBit(ILjava/lang/String;)V

    .line 62
    .line 63
    const-string v0, "VUI: video_full_range_flag"

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1, v2, v0}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->skipNBit(ILjava/lang/String;)V

    .line 67
    .line 68
    const-string v0, "VUI: colour_description_present_flag"

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1, v0}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->readBool(Ljava/lang/String;)Z

    .line 72
    move-result v0

    .line 73
    .line 74
    if-eqz v0, :cond_2

    .line 75
    .line 76
    const-string v0, "VUI: colour_primaries"

    .line 77
    .line 78
    .line 79
    invoke-virtual {p1, v1, v0}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->skipNBit(ILjava/lang/String;)V

    .line 80
    .line 81
    const-string v0, "VUI: transfer_characteristics"

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1, v1, v0}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->skipNBit(ILjava/lang/String;)V

    .line 85
    .line 86
    const-string v0, "VUI: matrix_coefficients"

    .line 87
    .line 88
    .line 89
    invoke-virtual {p1, v1, v0}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->skipNBit(ILjava/lang/String;)V

    .line 90
    .line 91
    :cond_2
    const-string v0, "VUI: chroma_loc_info_present_flag"

    .line 92
    .line 93
    .line 94
    invoke-virtual {p1, v0}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->readBool(Ljava/lang/String;)Z

    .line 95
    move-result v0

    .line 96
    .line 97
    if-eqz v0, :cond_3

    .line 98
    .line 99
    const-string v0, "VUI chroma_sample_loc_type_top_field"

    .line 100
    .line 101
    .line 102
    invoke-virtual {p1, v0}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->skipUE(Ljava/lang/String;)V

    .line 103
    .line 104
    const-string v0, "VUI chroma_sample_loc_type_bottom_field"

    .line 105
    .line 106
    .line 107
    invoke-virtual {p1, v0}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->skipUE(Ljava/lang/String;)V

    .line 108
    .line 109
    :cond_3
    const-string v0, "VUI: timing_info_present_flag"

    .line 110
    .line 111
    .line 112
    invoke-virtual {p1, v0}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->readBool(Ljava/lang/String;)Z

    .line 113
    move-result v0

    .line 114
    .line 115
    if-eqz v0, :cond_4

    .line 116
    .line 117
    const-string v0, "VUI: num_units_in_tick"

    .line 118
    .line 119
    const/16 v1, 0x20

    .line 120
    .line 121
    .line 122
    invoke-virtual {p1, v1, v0}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->skipNBit(ILjava/lang/String;)V

    .line 123
    .line 124
    const-string v0, "VUI: time_scale"

    .line 125
    .line 126
    .line 127
    invoke-virtual {p1, v1, v0}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->skipNBit(ILjava/lang/String;)V

    .line 128
    .line 129
    const-string v0, "VUI: fixed_frame_rate_flag"

    .line 130
    .line 131
    .line 132
    invoke-virtual {p1, v2, v0}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->skipNBit(ILjava/lang/String;)V

    .line 133
    .line 134
    :cond_4
    const-string v0, "VUI: nal_hrd_parameters_present_flag"

    .line 135
    .line 136
    .line 137
    invoke-virtual {p1, v0}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->readBool(Ljava/lang/String;)Z

    .line 138
    move-result v0

    .line 139
    .line 140
    if-eqz v0, :cond_5

    .line 141
    .line 142
    .line 143
    invoke-direct {p0, p1}, Lcom/tencent/ugc/decoder/H264SPSModifier;->readHRDParameters(Lcom/tencent/ugc/decoder/H264RbspRewriter;)V

    .line 144
    .line 145
    :cond_5
    const-string v1, "VUI: vcl_hrd_parameters_present_flag"

    .line 146
    .line 147
    .line 148
    invoke-virtual {p1, v1}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->readBool(Ljava/lang/String;)Z

    .line 149
    move-result v1

    .line 150
    .line 151
    if-eqz v1, :cond_6

    .line 152
    .line 153
    .line 154
    invoke-direct {p0, p1}, Lcom/tencent/ugc/decoder/H264SPSModifier;->readHRDParameters(Lcom/tencent/ugc/decoder/H264RbspRewriter;)V

    .line 155
    .line 156
    :cond_6
    if-nez v0, :cond_7

    .line 157
    .line 158
    if-eqz v1, :cond_8

    .line 159
    .line 160
    :cond_7
    const-string v0, "VUI: low_delay_hrd_flag"

    .line 161
    .line 162
    .line 163
    invoke-virtual {p1, v2, v0}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->skipNBit(ILjava/lang/String;)V

    .line 164
    .line 165
    :cond_8
    const-string v0, "VUI: pic_struct_present_flag"

    .line 166
    .line 167
    .line 168
    invoke-virtual {p1, v2, v0}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->skipNBit(ILjava/lang/String;)V

    .line 169
    .line 170
    const-string v0, "VUI: bitstream_restriction_flag"

    .line 171
    .line 172
    .line 173
    invoke-virtual {p1, v0}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->testBool(Ljava/lang/String;)Z

    .line 174
    move-result v0

    .line 175
    .line 176
    const-string v1, "H264SPSModifier"

    .line 177
    .line 178
    const-string v3, "VUI: motion_vectors_over_pic_boundaries_flag"

    .line 179
    .line 180
    const-string v4, "VUI: set bitstream_restriction_flag"

    .line 181
    const/4 v5, 0x0

    .line 182
    .line 183
    if-eqz v0, :cond_a

    .line 184
    .line 185
    .line 186
    invoke-virtual {p1, v2, v4}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->writeBool(ZLjava/lang/String;)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {p1, v3}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->readBool(Ljava/lang/String;)Z

    .line 190
    .line 191
    const-string v0, "VUI max_bytes_per_pic_denom"

    .line 192
    .line 193
    .line 194
    invoke-virtual {p1, v0}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->skipUE(Ljava/lang/String;)V

    .line 195
    .line 196
    const-string v0, "VUI max_bits_per_mb_denom"

    .line 197
    .line 198
    .line 199
    invoke-virtual {p1, v0}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->skipUE(Ljava/lang/String;)V

    .line 200
    .line 201
    const-string v0, "VUI log2_max_mv_length_horizontal"

    .line 202
    .line 203
    .line 204
    invoke-virtual {p1, v0}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->skipUE(Ljava/lang/String;)V

    .line 205
    .line 206
    const-string v0, "VUI log2_max_mv_length_vertical"

    .line 207
    .line 208
    .line 209
    invoke-virtual {p1, v0}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->skipUE(Ljava/lang/String;)V

    .line 210
    .line 211
    const-string v0, "VUI num_reorder_frames"

    .line 212
    .line 213
    .line 214
    invoke-virtual {p1, v0}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->skipUE(Ljava/lang/String;)V

    .line 215
    .line 216
    iget-boolean v0, p0, Lcom/tencent/ugc/decoder/H264SPSModifier;->mReceiveFirstVUI:Z

    .line 217
    .line 218
    if-nez v0, :cond_9

    .line 219
    .line 220
    .line 221
    invoke-virtual {p1, v5}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->readUE(Z)I

    .line 222
    move-result p1

    .line 223
    .line 224
    const-string v0, "decode: do not add max_dec_frame_buffering when it is "

    .line 225
    .line 226
    .line 227
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 228
    move-result-object p1

    .line 229
    .line 230
    .line 231
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 232
    move-result-object p1

    .line 233
    .line 234
    .line 235
    invoke-static {v1, p1}, Lcom/tencent/liteav/base/util/LiteavLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 236
    .line 237
    iput-boolean v2, p0, Lcom/tencent/ugc/decoder/H264SPSModifier;->mReceiveFirstVUI:Z

    .line 238
    :cond_9
    return v5

    .line 239
    .line 240
    .line 241
    :cond_a
    invoke-virtual {p1, v2, v4}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->writeBool(ZLjava/lang/String;)V

    .line 242
    .line 243
    .line 244
    invoke-virtual {p1, v2, v3}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->writeBool(ZLjava/lang/String;)V

    .line 245
    .line 246
    const-string v0, "VUI: max_bytes_per_pic_denom"

    .line 247
    .line 248
    .line 249
    invoke-virtual {p1, v5, v0}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->writeUE(ILjava/lang/String;)V

    .line 250
    .line 251
    const-string v0, "VUI: max_bits_per_mb_denom"

    .line 252
    .line 253
    .line 254
    invoke-virtual {p1, v5, v0}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->writeUE(ILjava/lang/String;)V

    .line 255
    .line 256
    const-string v0, "VUI: log2_max_mv_length_horizontal"

    .line 257
    .line 258
    const/16 v3, 0xa

    .line 259
    .line 260
    .line 261
    invoke-virtual {p1, v3, v0}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->writeUE(ILjava/lang/String;)V

    .line 262
    .line 263
    const-string v0, "VUI: log2_max_mv_length_vertical"

    .line 264
    .line 265
    .line 266
    invoke-virtual {p1, v3, v0}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->writeUE(ILjava/lang/String;)V

    .line 267
    .line 268
    const-string v0, "VUI: num_reorder_frames"

    .line 269
    .line 270
    .line 271
    invoke-virtual {p1, v5, v0}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->writeUE(ILjava/lang/String;)V

    .line 272
    .line 273
    const-string v0, "VUI: max_dec_frame_buffering"

    .line 274
    .line 275
    .line 276
    invoke-virtual {p1, v2, v0}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->writeUE(ILjava/lang/String;)V

    .line 277
    .line 278
    iget-boolean p1, p0, Lcom/tencent/ugc/decoder/H264SPSModifier;->mReceiveFirstVUI:Z

    .line 279
    .line 280
    if-nez p1, :cond_b

    .line 281
    .line 282
    const-string p1, "decode: add max_dec_frame_buffering 1 when it is no exist"

    .line 283
    .line 284
    .line 285
    invoke-static {v1, p1}, Lcom/tencent/liteav/base/util/LiteavLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 286
    .line 287
    iput-boolean v2, p0, Lcom/tencent/ugc/decoder/H264SPSModifier;->mReceiveFirstVUI:Z

    .line 288
    :cond_b
    return v2
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
.end method

.method private printBuffer(Ljava/lang/String;[B)V
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

.method private readHRDParameters(Lcom/tencent/ugc/decoder/H264RbspRewriter;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "SPS: cpb_cnt_minus1"

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1, v0}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->readUE(Ljava/lang/String;)I

    .line 6
    move-result v0

    .line 7
    .line 8
    const-string v1, "HRD: bit_rate_scale"

    .line 9
    const/4 v2, 0x4

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1, v2, v1}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->skipNBit(ILjava/lang/String;)V

    .line 13
    .line 14
    const-string v1, "HRD: cpb_size_scale"

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, v2, v1}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->skipNBit(ILjava/lang/String;)V

    .line 18
    const/4 v1, 0x0

    .line 19
    .line 20
    :goto_0
    if-gt v1, v0, :cond_0

    .line 21
    .line 22
    const-string v2, "HRD: bit_rate_value_minus1"

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, v2}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->skipUE(Ljava/lang/String;)V

    .line 26
    .line 27
    const-string v2, "HRD: cpb_size_value_minus1"

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, v2}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->skipUE(Ljava/lang/String;)V

    .line 31
    .line 32
    const-string v2, "HRD: cbr_flag"

    .line 33
    const/4 v3, 0x1

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1, v3, v2}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->skipNBit(ILjava/lang/String;)V

    .line 37
    .line 38
    add-int/lit8 v1, v1, 0x1

    .line 39
    goto :goto_0

    .line 40
    .line 41
    :cond_0
    const-string v0, "HRD: initial_cpb_removal_delay_length_minus1"

    .line 42
    const/4 v1, 0x5

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1, v1, v0}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->skipNBit(ILjava/lang/String;)V

    .line 46
    .line 47
    const-string v0, "HRD: cpb_removal_delay_length_minus1"

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1, v1, v0}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->skipNBit(ILjava/lang/String;)V

    .line 51
    .line 52
    const-string v0, "HRD: dpb_output_delay_length_minus1"

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1, v1, v0}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->skipNBit(ILjava/lang/String;)V

    .line 56
    .line 57
    const-string v0, "HRD: time_offset_length"

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1, v1, v0}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->skipNBit(ILjava/lang/String;)V

    .line 61
    return-void
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


# virtual methods
.method public updateVUIforMaxBuffering(Ljava/io/InputStream;)[B
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 8
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 9
    new-instance v1, Lcom/tencent/ugc/decoder/H264RbspRewriter;

    invoke-direct {v1, p1, v0}, Lcom/tencent/ugc/decoder/H264RbspRewriter;-><init>(Ljava/io/InputStream;Ljava/io/OutputStream;)V

    .line 10
    const-string p1, "NALU type"

    const/16 v2, 0x8

    invoke-virtual {v1, v2, p1}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->skipNBit(ILjava/lang/String;)V

    .line 11
    const-string p1, "SPS: profile_idc"

    invoke-virtual {v1, v2, p1}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->readNBit(ILjava/lang/String;)J

    move-result-wide v3

    long-to-int p1, v3

    .line 12
    const-string v3, "SPS: constraint_set_0-3_flag and reserved_zero_4bits"

    invoke-virtual {v1, v2, v3}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->skipNBit(ILjava/lang/String;)V

    .line 13
    const-string v3, "SPS: level_idc"

    invoke-virtual {v1, v2, v3}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->readNBit(ILjava/lang/String;)J

    .line 14
    const-string v3, "SPS: seq_parameter_set_id"

    invoke-virtual {v1, v3}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->skipUE(Ljava/lang/String;)V

    const/16 v3, 0x64

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eq p1, v3, :cond_0

    const/16 v3, 0x6e

    if-eq p1, v3, :cond_0

    const/16 v3, 0x7a

    if-eq p1, v3, :cond_0

    const/16 v3, 0x90

    if-ne p1, v3, :cond_4

    .line 15
    :cond_0
    const-string p1, "SPS: chroma_format_idc"

    invoke-virtual {v1, p1}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->readUE(Ljava/lang/String;)I

    move-result p1

    const/4 v3, 0x3

    if-ne p1, v3, :cond_1

    .line 16
    const-string p1, "SPS: residual_color_transform_flag"

    invoke-virtual {v1, v5, p1}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->skipNBit(ILjava/lang/String;)V

    .line 17
    :cond_1
    const-string p1, "SPS: bit_depth_luma_minus8"

    invoke-virtual {v1, p1}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->skipUE(Ljava/lang/String;)V

    .line 18
    const-string p1, "SPS: bit_depth_chroma_minus8"

    invoke-virtual {v1, p1}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->skipUE(Ljava/lang/String;)V

    .line 19
    const-string p1, "SPS: qpprime_y_zero_transform_bypass_flag"

    invoke-virtual {v1, v5, p1}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->skipNBit(ILjava/lang/String;)V

    .line 20
    const-string p1, "SPS: seq_scaling_matrix_present_lag"

    .line 21
    invoke-virtual {v1, p1}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->readBool(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_4

    move p1, v4

    :goto_0
    if-ge p1, v2, :cond_4

    .line 22
    const-string v3, "SPS: seqScalingListPresentFlag"

    .line 23
    invoke-virtual {v1, v3}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->readBool(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_3

    const/4 v3, 0x6

    if-ge p1, v3, :cond_2

    const/16 v3, 0x10

    .line 24
    invoke-virtual {v1, v3}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->skipScalingList(I)V

    goto :goto_1

    :cond_2
    const/16 v3, 0x40

    .line 25
    invoke-virtual {v1, v3}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->skipScalingList(I)V

    :cond_3
    :goto_1
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    .line 26
    :cond_4
    const-string p1, "SPS: log2_max_frame_num_minus4"

    invoke-virtual {v1, p1}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->skipUE(Ljava/lang/String;)V

    .line 27
    const-string p1, "SPS: pic_order_cnt_type"

    invoke-virtual {v1, p1}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->readUE(Ljava/lang/String;)I

    move-result p1

    if-nez p1, :cond_5

    .line 28
    const-string p1, "SPS: log2_max_pic_order_cnt_lsb_minus4"

    invoke-virtual {v1, p1}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->skipUE(Ljava/lang/String;)V

    goto :goto_3

    :cond_5
    if-ne p1, v5, :cond_6

    .line 29
    const-string p1, "SPS: delta_pic_order_always_zero_flag"

    invoke-virtual {v1, v5, p1}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->skipNBit(ILjava/lang/String;)V

    .line 30
    const-string p1, "SPS: offset_for_non_ref_pic"

    invoke-virtual {v1, p1}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->skipUE(Ljava/lang/String;)V

    .line 31
    const-string p1, "SPS: offset_for_top_to_bottom_field"

    invoke-virtual {v1, p1}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->skipUE(Ljava/lang/String;)V

    .line 32
    const-string p1, "SPS: num_ref_frames_in_pic_order_cnt_cycle"

    .line 33
    invoke-virtual {v1, p1}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->readUE(Ljava/lang/String;)I

    move-result p1

    move v2, v4

    :goto_2
    if-ge v2, p1, :cond_6

    .line 34
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v6, "SPS: offsetForRefFrame ["

    invoke-direct {v3, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, "]"

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->skipUE(Ljava/lang/String;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 35
    :cond_6
    :goto_3
    const-string p1, "SPS: num_ref_frames"

    invoke-virtual {v1, p1}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->readUE(Ljava/lang/String;)I

    .line 36
    const-string p1, "SPS: gaps_in_frame_num_value_allowed_flag"

    invoke-virtual {v1, v5, p1}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->skipNBit(ILjava/lang/String;)V

    .line 37
    const-string p1, "SPS: pic_width_in_mbs_minus1"

    invoke-virtual {v1, p1}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->skipUE(Ljava/lang/String;)V

    .line 38
    const-string p1, "SPS: pic_height_in_map_units_minus1"

    invoke-virtual {v1, p1}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->skipUE(Ljava/lang/String;)V

    .line 39
    const-string p1, "SPS: frame_mbs_only_flag"

    invoke-virtual {v1, p1}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->readBool(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_7

    .line 40
    const-string p1, "SPS: mb_adaptive_frame_field_flag"

    invoke-virtual {v1, v5, p1}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->skipNBit(ILjava/lang/String;)V

    .line 41
    :cond_7
    const-string p1, "SPS: direct_8x8_inference_flag"

    invoke-virtual {v1, v5, p1}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->skipNBit(ILjava/lang/String;)V

    .line 42
    const-string p1, "SPS: frame_cropping_flag"

    invoke-virtual {v1, p1}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->readBool(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_8

    .line 43
    const-string p1, "SPS: frame_crop_left_offset"

    invoke-virtual {v1, p1}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->skipUE(Ljava/lang/String;)V

    .line 44
    const-string p1, "SPS: frame_crop_right_offset"

    invoke-virtual {v1, p1}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->skipUE(Ljava/lang/String;)V

    .line 45
    const-string p1, "SPS: frame_crop_top_offset"

    invoke-virtual {v1, p1}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->skipUE(Ljava/lang/String;)V

    .line 46
    const-string p1, "SPS: frame_crop_bottom_offset"

    invoke-virtual {v1, p1}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->skipUE(Ljava/lang/String;)V

    .line 47
    :cond_8
    const-string p1, "SPS: vui_parameters_present_flag"

    .line 48
    invoke-virtual {v1, p1}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->testBool(Ljava/lang/String;)Z

    move-result p1

    .line 49
    const-string v2, "VUI set 1: "

    if-eqz p1, :cond_9

    .line 50
    invoke-virtual {v1, v5, v2}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->writeBool(ZLjava/lang/String;)V

    .line 51
    invoke-direct {p0, v1}, Lcom/tencent/ugc/decoder/H264SPSModifier;->modifyVUIParameters(Lcom/tencent/ugc/decoder/H264RbspRewriter;)Z

    move-result p1

    if-nez p1, :cond_a

    const/4 p1, 0x0

    return-object p1

    .line 52
    :cond_9
    invoke-virtual {v1, v5, v2}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->writeBool(ZLjava/lang/String;)V

    .line 53
    const-string p1, "VUI: aspect_ratio_info_present_flag"

    invoke-virtual {v1, v4, p1}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->writeBool(ZLjava/lang/String;)V

    .line 54
    const-string p1, "VUI: overscan_info_present_flag"

    invoke-virtual {v1, v4, p1}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->writeBool(ZLjava/lang/String;)V

    .line 55
    const-string p1, "VUI: video_signal_type_present_flag"

    invoke-virtual {v1, v4, p1}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->writeBool(ZLjava/lang/String;)V

    .line 56
    const-string p1, "VUI: chroma_loc_info_present_flag"

    invoke-virtual {v1, v4, p1}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->writeBool(ZLjava/lang/String;)V

    .line 57
    const-string p1, "VUI: timing_info_present_flag"

    invoke-virtual {v1, v4, p1}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->writeBool(ZLjava/lang/String;)V

    .line 58
    const-string p1, "VUI: nal_hrd_parameters_present_flag"

    invoke-virtual {v1, v4, p1}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->writeBool(ZLjava/lang/String;)V

    .line 59
    const-string p1, "VUI: vcl_hrd_parameters_present_flag"

    invoke-virtual {v1, v4, p1}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->writeBool(ZLjava/lang/String;)V

    .line 60
    const-string p1, "VUI: pic_struct_present_flag"

    invoke-virtual {v1, v4, p1}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->writeBool(ZLjava/lang/String;)V

    .line 61
    const-string p1, "VUI: bitstream_restriction_flag"

    invoke-virtual {v1, v5, p1}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->writeBool(ZLjava/lang/String;)V

    .line 62
    const-string p1, "VUI: motion_vectors_over_pic_boundaries_flag"

    invoke-virtual {v1, v5, p1}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->writeBool(ZLjava/lang/String;)V

    .line 63
    const-string p1, "VUI: max_bytes_per_pic_denom"

    invoke-virtual {v1, v4, p1}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->writeUE(ILjava/lang/String;)V

    .line 64
    const-string p1, "VUI: max_bits_per_mb_denom"

    invoke-virtual {v1, v4, p1}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->writeUE(ILjava/lang/String;)V

    .line 65
    const-string p1, "VUI: log2_max_mv_length_horizontal"

    const/16 v2, 0xa

    invoke-virtual {v1, v2, p1}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->writeUE(ILjava/lang/String;)V

    .line 66
    const-string p1, "VUI: log2_max_mv_length_vertical"

    invoke-virtual {v1, v2, p1}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->writeUE(ILjava/lang/String;)V

    .line 67
    const-string p1, "VUI: num_reorder_frames"

    invoke-virtual {v1, v4, p1}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->writeUE(ILjava/lang/String;)V

    .line 68
    const-string p1, "VUI: max_dec_frame_buffering"

    invoke-virtual {v1, v5, p1}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->writeUE(ILjava/lang/String;)V

    .line 69
    iget-boolean p1, p0, Lcom/tencent/ugc/decoder/H264SPSModifier;->mReceiveFirstVUI:Z

    if-nez p1, :cond_a

    .line 70
    const-string p1, "H264SPSModifier"

    const-string v2, "decode: add max_dec_frame_buffering 1 when vui is no exist"

    invoke-static {p1, v2}, Lcom/tencent/liteav/base/util/LiteavLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 71
    iput-boolean v5, p0, Lcom/tencent/ugc/decoder/H264SPSModifier;->mReceiveFirstVUI:Z

    .line 72
    :cond_a
    invoke-virtual {v1}, Lcom/tencent/ugc/decoder/H264RbspRewriter;->writeTrailingBits()V

    .line 73
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p1

    return-object p1
.end method

.method public updateVUIforMaxBuffering([B)[B
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const-string v0, "origin sps : "

    invoke-direct {p0, v0, p1}, Lcom/tencent/ugc/decoder/H264SPSModifier;->printBuffer(Ljava/lang/String;[B)V

    .line 2
    invoke-direct {p0, p1}, Lcom/tencent/ugc/decoder/H264SPSModifier;->deEmulationPrevention([B)[B

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    const-string p1, "deEmulationPrevention sps : "

    invoke-direct {p0, p1, v0}, Lcom/tencent/ugc/decoder/H264SPSModifier;->printBuffer(Ljava/lang/String;[B)V

    const/4 p1, 0x1

    move-object v2, v0

    move v0, p1

    move-object p1, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 4
    :goto_0
    new-instance v1, Ljava/io/ByteArrayInputStream;

    invoke-direct {v1, p1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-virtual {p0, v1}, Lcom/tencent/ugc/decoder/H264SPSModifier;->updateVUIforMaxBuffering(Ljava/io/InputStream;)[B

    move-result-object p1

    .line 5
    const-string v1, "new sps : "

    invoke-direct {p0, v1, p1}, Lcom/tencent/ugc/decoder/H264SPSModifier;->printBuffer(Ljava/lang/String;[B)V

    if-eqz p1, :cond_1

    if-eqz v0, :cond_1

    .line 6
    invoke-direct {p0, p1}, Lcom/tencent/ugc/decoder/H264SPSModifier;->emulationPrevention([B)[B

    move-result-object p1

    .line 7
    const-string v0, "emulationPrevention sps : "

    invoke-direct {p0, v0, p1}, Lcom/tencent/ugc/decoder/H264SPSModifier;->printBuffer(Ljava/lang/String;[B)V

    :cond_1
    return-object p1
.end method
