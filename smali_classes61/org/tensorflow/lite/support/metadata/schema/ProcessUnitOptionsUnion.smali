.class public Lorg/tensorflow/lite/support/metadata/schema/ProcessUnitOptionsUnion;
.super Ljava/lang/Object;
.source "ProcessUnitOptionsUnion.java"


# instance fields
.field private type:B

.field private value:Ljava/lang/Object;


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
    iput-byte v0, p0, Lorg/tensorflow/lite/support/metadata/schema/ProcessUnitOptionsUnion;->type:B

    .line 7
    const/4 v0, 0x0

    .line 8
    .line 9
    iput-object v0, p0, Lorg/tensorflow/lite/support/metadata/schema/ProcessUnitOptionsUnion;->value:Ljava/lang/Object;

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
.end method

.method public static pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/support/metadata/schema/ProcessUnitOptionsUnion;)I
    .locals 1

    .line 1
    .line 2
    iget-byte v0, p1, Lorg/tensorflow/lite/support/metadata/schema/ProcessUnitOptionsUnion;->type:B

    .line 3
    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    const/4 p0, 0x0

    .line 7
    return p0

    .line 8
    .line 9
    .line 10
    :pswitch_0
    invoke-virtual {p1}, Lorg/tensorflow/lite/support/metadata/schema/ProcessUnitOptionsUnion;->asRegexTokenizerOptions()Lorg/tensorflow/lite/support/metadata/schema/RegexTokenizerOptionsT;

    .line 11
    move-result-object p1

    .line 12
    .line 13
    .line 14
    invoke-static {p0, p1}, Lorg/tensorflow/lite/support/metadata/schema/RegexTokenizerOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/support/metadata/schema/RegexTokenizerOptionsT;)I

    .line 15
    move-result p0

    .line 16
    return p0

    .line 17
    .line 18
    .line 19
    :pswitch_1
    invoke-virtual {p1}, Lorg/tensorflow/lite/support/metadata/schema/ProcessUnitOptionsUnion;->asSentencePieceTokenizerOptions()Lorg/tensorflow/lite/support/metadata/schema/SentencePieceTokenizerOptionsT;

    .line 20
    move-result-object p1

    .line 21
    .line 22
    .line 23
    invoke-static {p0, p1}, Lorg/tensorflow/lite/support/metadata/schema/SentencePieceTokenizerOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/support/metadata/schema/SentencePieceTokenizerOptionsT;)I

    .line 24
    move-result p0

    .line 25
    return p0

    .line 26
    .line 27
    .line 28
    :pswitch_2
    invoke-virtual {p1}, Lorg/tensorflow/lite/support/metadata/schema/ProcessUnitOptionsUnion;->asBertTokenizerOptions()Lorg/tensorflow/lite/support/metadata/schema/BertTokenizerOptionsT;

    .line 29
    move-result-object p1

    .line 30
    .line 31
    .line 32
    invoke-static {p0, p1}, Lorg/tensorflow/lite/support/metadata/schema/BertTokenizerOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/support/metadata/schema/BertTokenizerOptionsT;)I

    .line 33
    move-result p0

    .line 34
    return p0

    .line 35
    .line 36
    .line 37
    :pswitch_3
    invoke-virtual {p1}, Lorg/tensorflow/lite/support/metadata/schema/ProcessUnitOptionsUnion;->asScoreThresholdingOptions()Lorg/tensorflow/lite/support/metadata/schema/ScoreThresholdingOptionsT;

    .line 38
    move-result-object p1

    .line 39
    .line 40
    .line 41
    invoke-static {p0, p1}, Lorg/tensorflow/lite/support/metadata/schema/ScoreThresholdingOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/support/metadata/schema/ScoreThresholdingOptionsT;)I

    .line 42
    move-result p0

    .line 43
    return p0

    .line 44
    .line 45
    .line 46
    :pswitch_4
    invoke-virtual {p1}, Lorg/tensorflow/lite/support/metadata/schema/ProcessUnitOptionsUnion;->asScoreCalibrationOptions()Lorg/tensorflow/lite/support/metadata/schema/ScoreCalibrationOptionsT;

    .line 47
    move-result-object p1

    .line 48
    .line 49
    .line 50
    invoke-static {p0, p1}, Lorg/tensorflow/lite/support/metadata/schema/ScoreCalibrationOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/support/metadata/schema/ScoreCalibrationOptionsT;)I

    .line 51
    move-result p0

    .line 52
    return p0

    .line 53
    .line 54
    .line 55
    :pswitch_5
    invoke-virtual {p1}, Lorg/tensorflow/lite/support/metadata/schema/ProcessUnitOptionsUnion;->asNormalizationOptions()Lorg/tensorflow/lite/support/metadata/schema/NormalizationOptionsT;

    .line 56
    move-result-object p1

    .line 57
    .line 58
    .line 59
    invoke-static {p0, p1}, Lorg/tensorflow/lite/support/metadata/schema/NormalizationOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/support/metadata/schema/NormalizationOptionsT;)I

    .line 60
    move-result p0

    .line 61
    return p0

    .line 62
    nop

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
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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


# virtual methods
.method public asBertTokenizerOptions()Lorg/tensorflow/lite/support/metadata/schema/BertTokenizerOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/support/metadata/schema/ProcessUnitOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/support/metadata/schema/BertTokenizerOptionsT;

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
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public asNormalizationOptions()Lorg/tensorflow/lite/support/metadata/schema/NormalizationOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/support/metadata/schema/ProcessUnitOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/support/metadata/schema/NormalizationOptionsT;

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
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public asRegexTokenizerOptions()Lorg/tensorflow/lite/support/metadata/schema/RegexTokenizerOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/support/metadata/schema/ProcessUnitOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/support/metadata/schema/RegexTokenizerOptionsT;

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
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public asScoreCalibrationOptions()Lorg/tensorflow/lite/support/metadata/schema/ScoreCalibrationOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/support/metadata/schema/ProcessUnitOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/support/metadata/schema/ScoreCalibrationOptionsT;

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
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public asScoreThresholdingOptions()Lorg/tensorflow/lite/support/metadata/schema/ScoreThresholdingOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/support/metadata/schema/ProcessUnitOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/support/metadata/schema/ScoreThresholdingOptionsT;

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
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public asSentencePieceTokenizerOptions()Lorg/tensorflow/lite/support/metadata/schema/SentencePieceTokenizerOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/support/metadata/schema/ProcessUnitOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/support/metadata/schema/SentencePieceTokenizerOptionsT;

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
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public getType()B
    .locals 1

    .line 1
    .line 2
    iget-byte v0, p0, Lorg/tensorflow/lite/support/metadata/schema/ProcessUnitOptionsUnion;->type:B

    .line 3
    return v0
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
.end method

.method public getValue()Ljava/lang/Object;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/support/metadata/schema/ProcessUnitOptionsUnion;->value:Ljava/lang/Object;

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
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public setType(B)V
    .locals 0

    .line 1
    .line 2
    iput-byte p1, p0, Lorg/tensorflow/lite/support/metadata/schema/ProcessUnitOptionsUnion;->type:B

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
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public setValue(Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lorg/tensorflow/lite/support/metadata/schema/ProcessUnitOptionsUnion;->value:Ljava/lang/Object;

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
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method
