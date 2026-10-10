.class public Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;
.super Ljava/lang/Object;
.source "BuiltinOptionsUnion.java"


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
    iput-byte v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->type:B

    .line 7
    const/4 v0, 0x0

    .line 8
    .line 9
    iput-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

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

.method public static pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;)I
    .locals 1

    .line 1
    .line 2
    iget-byte v0, p1, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->type:B

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
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asRightShiftOptions()Lorg/tensorflow/lite/schema/RightShiftOptionsT;

    .line 11
    move-result-object p1

    .line 12
    .line 13
    .line 14
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/RightShiftOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/RightShiftOptionsT;)I

    .line 15
    move-result p0

    .line 16
    return p0

    .line 17
    .line 18
    .line 19
    :pswitch_1
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asBitwiseXorOptions()Lorg/tensorflow/lite/schema/BitwiseXorOptionsT;

    .line 20
    move-result-object p1

    .line 21
    .line 22
    .line 23
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/BitwiseXorOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/BitwiseXorOptionsT;)I

    .line 24
    move-result p0

    .line 25
    return p0

    .line 26
    .line 27
    .line 28
    :pswitch_2
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asBitcastOptions()Lorg/tensorflow/lite/schema/BitcastOptionsT;

    .line 29
    move-result-object p1

    .line 30
    .line 31
    .line 32
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/BitcastOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/BitcastOptionsT;)I

    .line 33
    move-result p0

    .line 34
    return p0

    .line 35
    .line 36
    .line 37
    :pswitch_3
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asSignOptions()Lorg/tensorflow/lite/schema/SignOptionsT;

    .line 38
    move-result-object p1

    .line 39
    .line 40
    .line 41
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/SignOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/SignOptionsT;)I

    .line 42
    move-result p0

    .line 43
    return p0

    .line 44
    .line 45
    .line 46
    :pswitch_4
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asATan2Options()Lorg/tensorflow/lite/schema/ATan2OptionsT;

    .line 47
    move-result-object p1

    .line 48
    .line 49
    .line 50
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/ATan2Options;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/ATan2OptionsT;)I

    .line 51
    move-result p0

    .line 52
    return p0

    .line 53
    .line 54
    .line 55
    :pswitch_5
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asUnsortedSegmentSumOptions()Lorg/tensorflow/lite/schema/UnsortedSegmentSumOptionsT;

    .line 56
    move-result-object p1

    .line 57
    .line 58
    .line 59
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/UnsortedSegmentSumOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/UnsortedSegmentSumOptionsT;)I

    .line 60
    move-result p0

    .line 61
    return p0

    .line 62
    .line 63
    .line 64
    :pswitch_6
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asUnsortedSegmentMinOptions()Lorg/tensorflow/lite/schema/UnsortedSegmentMinOptionsT;

    .line 65
    move-result-object p1

    .line 66
    .line 67
    .line 68
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/UnsortedSegmentMinOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/UnsortedSegmentMinOptionsT;)I

    .line 69
    move-result p0

    .line 70
    return p0

    .line 71
    .line 72
    .line 73
    :pswitch_7
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asUnsortedSegmentMaxOptions()Lorg/tensorflow/lite/schema/UnsortedSegmentMaxOptionsT;

    .line 74
    move-result-object p1

    .line 75
    .line 76
    .line 77
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/UnsortedSegmentMaxOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/UnsortedSegmentMaxOptionsT;)I

    .line 78
    move-result p0

    .line 79
    return p0

    .line 80
    .line 81
    .line 82
    :pswitch_8
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asUnsortedSegmentProdOptions()Lorg/tensorflow/lite/schema/UnsortedSegmentProdOptionsT;

    .line 83
    move-result-object p1

    .line 84
    .line 85
    .line 86
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/UnsortedSegmentProdOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/UnsortedSegmentProdOptionsT;)I

    .line 87
    move-result p0

    .line 88
    return p0

    .line 89
    .line 90
    .line 91
    :pswitch_9
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asDynamicUpdateSliceOptions()Lorg/tensorflow/lite/schema/DynamicUpdateSliceOptionsT;

    .line 92
    move-result-object p1

    .line 93
    .line 94
    .line 95
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/DynamicUpdateSliceOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/DynamicUpdateSliceOptionsT;)I

    .line 96
    move-result p0

    .line 97
    return p0

    .line 98
    .line 99
    .line 100
    :pswitch_a
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asGeluOptions()Lorg/tensorflow/lite/schema/GeluOptionsT;

    .line 101
    move-result-object p1

    .line 102
    .line 103
    .line 104
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/GeluOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/GeluOptionsT;)I

    .line 105
    move-result p0

    .line 106
    return p0

    .line 107
    .line 108
    .line 109
    :pswitch_b
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asBucketizeOptions()Lorg/tensorflow/lite/schema/BucketizeOptionsT;

    .line 110
    move-result-object p1

    .line 111
    .line 112
    .line 113
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/BucketizeOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/BucketizeOptionsT;)I

    .line 114
    move-result p0

    .line 115
    return p0

    .line 116
    .line 117
    .line 118
    :pswitch_c
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asRandomOptions()Lorg/tensorflow/lite/schema/RandomOptionsT;

    .line 119
    move-result-object p1

    .line 120
    .line 121
    .line 122
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/RandomOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/RandomOptionsT;)I

    .line 123
    move-result p0

    .line 124
    return p0

    .line 125
    .line 126
    .line 127
    :pswitch_d
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asAssignVariableOptions()Lorg/tensorflow/lite/schema/AssignVariableOptionsT;

    .line 128
    move-result-object p1

    .line 129
    .line 130
    .line 131
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/AssignVariableOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/AssignVariableOptionsT;)I

    .line 132
    move-result p0

    .line 133
    return p0

    .line 134
    .line 135
    .line 136
    :pswitch_e
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asReadVariableOptions()Lorg/tensorflow/lite/schema/ReadVariableOptionsT;

    .line 137
    move-result-object p1

    .line 138
    .line 139
    .line 140
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/ReadVariableOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/ReadVariableOptionsT;)I

    .line 141
    move-result p0

    .line 142
    return p0

    .line 143
    .line 144
    .line 145
    :pswitch_f
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asVarHandleOptions()Lorg/tensorflow/lite/schema/VarHandleOptionsT;

    .line 146
    move-result-object p1

    .line 147
    .line 148
    .line 149
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/VarHandleOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/VarHandleOptionsT;)I

    .line 150
    move-result p0

    .line 151
    return p0

    .line 152
    .line 153
    .line 154
    :pswitch_10
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asHashtableSizeOptions()Lorg/tensorflow/lite/schema/HashtableSizeOptionsT;

    .line 155
    move-result-object p1

    .line 156
    .line 157
    .line 158
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/HashtableSizeOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/HashtableSizeOptionsT;)I

    .line 159
    move-result p0

    .line 160
    return p0

    .line 161
    .line 162
    .line 163
    :pswitch_11
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asHashtableImportOptions()Lorg/tensorflow/lite/schema/HashtableImportOptionsT;

    .line 164
    move-result-object p1

    .line 165
    .line 166
    .line 167
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/HashtableImportOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/HashtableImportOptionsT;)I

    .line 168
    move-result p0

    .line 169
    return p0

    .line 170
    .line 171
    .line 172
    :pswitch_12
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asHashtableFindOptions()Lorg/tensorflow/lite/schema/HashtableFindOptionsT;

    .line 173
    move-result-object p1

    .line 174
    .line 175
    .line 176
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/HashtableFindOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/HashtableFindOptionsT;)I

    .line 177
    move-result p0

    .line 178
    return p0

    .line 179
    .line 180
    .line 181
    :pswitch_13
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asHashtableOptions()Lorg/tensorflow/lite/schema/HashtableOptionsT;

    .line 182
    move-result-object p1

    .line 183
    .line 184
    .line 185
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/HashtableOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/HashtableOptionsT;)I

    .line 186
    move-result p0

    .line 187
    return p0

    .line 188
    .line 189
    .line 190
    :pswitch_14
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asConv3DOptions()Lorg/tensorflow/lite/schema/Conv3DOptionsT;

    .line 191
    move-result-object p1

    .line 192
    .line 193
    .line 194
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/Conv3DOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/Conv3DOptionsT;)I

    .line 195
    move-result p0

    .line 196
    return p0

    .line 197
    .line 198
    .line 199
    :pswitch_15
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asRfft2dOptions()Lorg/tensorflow/lite/schema/Rfft2dOptionsT;

    .line 200
    move-result-object p1

    .line 201
    .line 202
    .line 203
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/Rfft2dOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/Rfft2dOptionsT;)I

    .line 204
    move-result p0

    .line 205
    return p0

    .line 206
    .line 207
    .line 208
    :pswitch_16
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asBroadcastToOptions()Lorg/tensorflow/lite/schema/BroadcastToOptionsT;

    .line 209
    move-result-object p1

    .line 210
    .line 211
    .line 212
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/BroadcastToOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/BroadcastToOptionsT;)I

    .line 213
    move-result p0

    .line 214
    return p0

    .line 215
    .line 216
    .line 217
    :pswitch_17
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asCallOnceOptions()Lorg/tensorflow/lite/schema/CallOnceOptionsT;

    .line 218
    move-result-object p1

    .line 219
    .line 220
    .line 221
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/CallOnceOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/CallOnceOptionsT;)I

    .line 222
    move-result p0

    .line 223
    return p0

    .line 224
    .line 225
    .line 226
    :pswitch_18
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asCumsumOptions()Lorg/tensorflow/lite/schema/CumsumOptionsT;

    .line 227
    move-result-object p1

    .line 228
    .line 229
    .line 230
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/CumsumOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/CumsumOptionsT;)I

    .line 231
    move-result p0

    .line 232
    return p0

    .line 233
    .line 234
    .line 235
    :pswitch_19
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asBatchMatMulOptions()Lorg/tensorflow/lite/schema/BatchMatMulOptionsT;

    .line 236
    move-result-object p1

    .line 237
    .line 238
    .line 239
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/BatchMatMulOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/BatchMatMulOptionsT;)I

    .line 240
    move-result p0

    .line 241
    return p0

    .line 242
    .line 243
    .line 244
    :pswitch_1a
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asSegmentSumOptions()Lorg/tensorflow/lite/schema/SegmentSumOptionsT;

    .line 245
    move-result-object p1

    .line 246
    .line 247
    .line 248
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/SegmentSumOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/SegmentSumOptionsT;)I

    .line 249
    move-result p0

    .line 250
    return p0

    .line 251
    .line 252
    .line 253
    :pswitch_1b
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asDensifyOptions()Lorg/tensorflow/lite/schema/DensifyOptionsT;

    .line 254
    move-result-object p1

    .line 255
    .line 256
    .line 257
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/DensifyOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/DensifyOptionsT;)I

    .line 258
    move-result p0

    .line 259
    return p0

    .line 260
    .line 261
    .line 262
    :pswitch_1c
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asSelectV2Options()Lorg/tensorflow/lite/schema/SelectV2OptionsT;

    .line 263
    move-result-object p1

    .line 264
    .line 265
    .line 266
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/SelectV2Options;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/SelectV2OptionsT;)I

    .line 267
    move-result p0

    .line 268
    return p0

    .line 269
    .line 270
    .line 271
    :pswitch_1d
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asScatterNdOptions()Lorg/tensorflow/lite/schema/ScatterNdOptionsT;

    .line 272
    move-result-object p1

    .line 273
    .line 274
    .line 275
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/ScatterNdOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/ScatterNdOptionsT;)I

    .line 276
    move-result p0

    .line 277
    return p0

    .line 278
    .line 279
    .line 280
    :pswitch_1e
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asNonMaxSuppressionV5Options()Lorg/tensorflow/lite/schema/NonMaxSuppressionV5OptionsT;

    .line 281
    move-result-object p1

    .line 282
    .line 283
    .line 284
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/NonMaxSuppressionV5Options;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/NonMaxSuppressionV5OptionsT;)I

    .line 285
    move-result p0

    .line 286
    return p0

    .line 287
    .line 288
    .line 289
    :pswitch_1f
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asNonMaxSuppressionV4Options()Lorg/tensorflow/lite/schema/NonMaxSuppressionV4OptionsT;

    .line 290
    move-result-object p1

    .line 291
    .line 292
    .line 293
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/NonMaxSuppressionV4Options;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/NonMaxSuppressionV4OptionsT;)I

    .line 294
    move-result p0

    .line 295
    return p0

    .line 296
    .line 297
    .line 298
    :pswitch_20
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asDepthToSpaceOptions()Lorg/tensorflow/lite/schema/DepthToSpaceOptionsT;

    .line 299
    move-result-object p1

    .line 300
    .line 301
    .line 302
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/DepthToSpaceOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/DepthToSpaceOptionsT;)I

    .line 303
    move-result p0

    .line 304
    return p0

    .line 305
    .line 306
    .line 307
    :pswitch_21
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asWhileOptions()Lorg/tensorflow/lite/schema/WhileOptionsT;

    .line 308
    move-result-object p1

    .line 309
    .line 310
    .line 311
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/WhileOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/WhileOptionsT;)I

    .line 312
    move-result p0

    .line 313
    return p0

    .line 314
    .line 315
    .line 316
    :pswitch_22
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asIfOptions()Lorg/tensorflow/lite/schema/IfOptionsT;

    .line 317
    move-result-object p1

    .line 318
    .line 319
    .line 320
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/IfOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/IfOptionsT;)I

    .line 321
    move-result p0

    .line 322
    return p0

    .line 323
    .line 324
    .line 325
    :pswitch_23
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asHardSwishOptions()Lorg/tensorflow/lite/schema/HardSwishOptionsT;

    .line 326
    move-result-object p1

    .line 327
    .line 328
    .line 329
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/HardSwishOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/HardSwishOptionsT;)I

    .line 330
    move-result p0

    .line 331
    return p0

    .line 332
    .line 333
    .line 334
    :pswitch_24
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asMatrixSetDiagOptions()Lorg/tensorflow/lite/schema/MatrixSetDiagOptionsT;

    .line 335
    move-result-object p1

    .line 336
    .line 337
    .line 338
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/MatrixSetDiagOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/MatrixSetDiagOptionsT;)I

    .line 339
    move-result p0

    .line 340
    return p0

    .line 341
    .line 342
    .line 343
    :pswitch_25
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asQuantizeOptions()Lorg/tensorflow/lite/schema/QuantizeOptionsT;

    .line 344
    move-result-object p1

    .line 345
    .line 346
    .line 347
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/QuantizeOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/QuantizeOptionsT;)I

    .line 348
    move-result p0

    .line 349
    return p0

    .line 350
    .line 351
    .line 352
    :pswitch_26
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asMatrixDiagOptions()Lorg/tensorflow/lite/schema/MatrixDiagOptionsT;

    .line 353
    move-result-object p1

    .line 354
    .line 355
    .line 356
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/MatrixDiagOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/MatrixDiagOptionsT;)I

    .line 357
    move-result p0

    .line 358
    return p0

    .line 359
    .line 360
    .line 361
    :pswitch_27
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asReverseSequenceOptions()Lorg/tensorflow/lite/schema/ReverseSequenceOptionsT;

    .line 362
    move-result-object p1

    .line 363
    .line 364
    .line 365
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/ReverseSequenceOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/ReverseSequenceOptionsT;)I

    .line 366
    move-result p0

    .line 367
    return p0

    .line 368
    .line 369
    .line 370
    :pswitch_28
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asRankOptions()Lorg/tensorflow/lite/schema/RankOptionsT;

    .line 371
    move-result-object p1

    .line 372
    .line 373
    .line 374
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/RankOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/RankOptionsT;)I

    .line 375
    move-result p0

    .line 376
    return p0

    .line 377
    .line 378
    .line 379
    :pswitch_29
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asWhereOptions()Lorg/tensorflow/lite/schema/WhereOptionsT;

    .line 380
    move-result-object p1

    .line 381
    .line 382
    .line 383
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/WhereOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/WhereOptionsT;)I

    .line 384
    move-result p0

    .line 385
    return p0

    .line 386
    .line 387
    .line 388
    :pswitch_2a
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asCosOptions()Lorg/tensorflow/lite/schema/CosOptionsT;

    .line 389
    move-result-object p1

    .line 390
    .line 391
    .line 392
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/CosOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/CosOptionsT;)I

    .line 393
    move-result p0

    .line 394
    return p0

    .line 395
    .line 396
    .line 397
    :pswitch_2b
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asGatherNdOptions()Lorg/tensorflow/lite/schema/GatherNdOptionsT;

    .line 398
    move-result-object p1

    .line 399
    .line 400
    .line 401
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/GatherNdOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/GatherNdOptionsT;)I

    .line 402
    move-result p0

    .line 403
    return p0

    .line 404
    .line 405
    .line 406
    :pswitch_2c
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asAddNOptions()Lorg/tensorflow/lite/schema/AddNOptionsT;

    .line 407
    move-result-object p1

    .line 408
    .line 409
    .line 410
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/AddNOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/AddNOptionsT;)I

    .line 411
    move-result p0

    .line 412
    return p0

    .line 413
    .line 414
    .line 415
    :pswitch_2d
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asReverseV2Options()Lorg/tensorflow/lite/schema/ReverseV2OptionsT;

    .line 416
    move-result-object p1

    .line 417
    .line 418
    .line 419
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/ReverseV2Options;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/ReverseV2OptionsT;)I

    .line 420
    move-result p0

    .line 421
    return p0

    .line 422
    .line 423
    .line 424
    :pswitch_2e
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asUniqueOptions()Lorg/tensorflow/lite/schema/UniqueOptionsT;

    .line 425
    move-result-object p1

    .line 426
    .line 427
    .line 428
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/UniqueOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/UniqueOptionsT;)I

    .line 429
    move-result p0

    .line 430
    return p0

    .line 431
    .line 432
    .line 433
    :pswitch_2f
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asSplitVOptions()Lorg/tensorflow/lite/schema/SplitVOptionsT;

    .line 434
    move-result-object p1

    .line 435
    .line 436
    .line 437
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/SplitVOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/SplitVOptionsT;)I

    .line 438
    move-result p0

    .line 439
    return p0

    .line 440
    .line 441
    .line 442
    :pswitch_30
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asAbsOptions()Lorg/tensorflow/lite/schema/AbsOptionsT;

    .line 443
    move-result-object p1

    .line 444
    .line 445
    .line 446
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/AbsOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/AbsOptionsT;)I

    .line 447
    move-result p0

    .line 448
    return p0

    .line 449
    .line 450
    .line 451
    :pswitch_31
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asMirrorPadOptions()Lorg/tensorflow/lite/schema/MirrorPadOptionsT;

    .line 452
    move-result-object p1

    .line 453
    .line 454
    .line 455
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/MirrorPadOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/MirrorPadOptionsT;)I

    .line 456
    move-result p0

    .line 457
    return p0

    .line 458
    .line 459
    .line 460
    :pswitch_32
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asSquaredDifferenceOptions()Lorg/tensorflow/lite/schema/SquaredDifferenceOptionsT;

    .line 461
    move-result-object p1

    .line 462
    .line 463
    .line 464
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/SquaredDifferenceOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/SquaredDifferenceOptionsT;)I

    .line 465
    move-result p0

    .line 466
    return p0

    .line 467
    .line 468
    .line 469
    :pswitch_33
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asLeakyReluOptions()Lorg/tensorflow/lite/schema/LeakyReluOptionsT;

    .line 470
    move-result-object p1

    .line 471
    .line 472
    .line 473
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/LeakyReluOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/LeakyReluOptionsT;)I

    .line 474
    move-result p0

    .line 475
    return p0

    .line 476
    .line 477
    .line 478
    :pswitch_34
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asResizeNearestNeighborOptions()Lorg/tensorflow/lite/schema/ResizeNearestNeighborOptionsT;

    .line 479
    move-result-object p1

    .line 480
    .line 481
    .line 482
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/ResizeNearestNeighborOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/ResizeNearestNeighborOptionsT;)I

    .line 483
    move-result p0

    .line 484
    return p0

    .line 485
    .line 486
    .line 487
    :pswitch_35
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asRangeOptions()Lorg/tensorflow/lite/schema/RangeOptionsT;

    .line 488
    move-result-object p1

    .line 489
    .line 490
    .line 491
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/RangeOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/RangeOptionsT;)I

    .line 492
    move-result p0

    .line 493
    return p0

    .line 494
    .line 495
    .line 496
    :pswitch_36
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asFloorModOptions()Lorg/tensorflow/lite/schema/FloorModOptionsT;

    .line 497
    move-result-object p1

    .line 498
    .line 499
    .line 500
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/FloorModOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/FloorModOptionsT;)I

    .line 501
    move-result p0

    .line 502
    return p0

    .line 503
    .line 504
    .line 505
    :pswitch_37
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asUnidirectionalSequenceLSTMOptions()Lorg/tensorflow/lite/schema/UnidirectionalSequenceLSTMOptionsT;

    .line 506
    move-result-object p1

    .line 507
    .line 508
    .line 509
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/UnidirectionalSequenceLSTMOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/UnidirectionalSequenceLSTMOptionsT;)I

    .line 510
    move-result p0

    .line 511
    return p0

    .line 512
    .line 513
    .line 514
    :pswitch_38
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asBidirectionalSequenceRNNOptions()Lorg/tensorflow/lite/schema/BidirectionalSequenceRNNOptionsT;

    .line 515
    move-result-object p1

    .line 516
    .line 517
    .line 518
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/BidirectionalSequenceRNNOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/BidirectionalSequenceRNNOptionsT;)I

    .line 519
    move-result p0

    .line 520
    return p0

    .line 521
    .line 522
    .line 523
    :pswitch_39
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asBidirectionalSequenceLSTMOptions()Lorg/tensorflow/lite/schema/BidirectionalSequenceLSTMOptionsT;

    .line 524
    move-result-object p1

    .line 525
    .line 526
    .line 527
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/BidirectionalSequenceLSTMOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/BidirectionalSequenceLSTMOptionsT;)I

    .line 528
    move-result p0

    .line 529
    return p0

    .line 530
    .line 531
    .line 532
    :pswitch_3a
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asFillOptions()Lorg/tensorflow/lite/schema/FillOptionsT;

    .line 533
    move-result-object p1

    .line 534
    .line 535
    .line 536
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/FillOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/FillOptionsT;)I

    .line 537
    move-result p0

    .line 538
    return p0

    .line 539
    .line 540
    .line 541
    :pswitch_3b
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asZerosLikeOptions()Lorg/tensorflow/lite/schema/ZerosLikeOptionsT;

    .line 542
    move-result-object p1

    .line 543
    .line 544
    .line 545
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/ZerosLikeOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/ZerosLikeOptionsT;)I

    .line 546
    move-result p0

    .line 547
    return p0

    .line 548
    .line 549
    .line 550
    :pswitch_3c
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asSquareOptions()Lorg/tensorflow/lite/schema/SquareOptionsT;

    .line 551
    move-result-object p1

    .line 552
    .line 553
    .line 554
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/SquareOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/SquareOptionsT;)I

    .line 555
    move-result p0

    .line 556
    return p0

    .line 557
    .line 558
    .line 559
    :pswitch_3d
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asFloorDivOptions()Lorg/tensorflow/lite/schema/FloorDivOptionsT;

    .line 560
    move-result-object p1

    .line 561
    .line 562
    .line 563
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/FloorDivOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/FloorDivOptionsT;)I

    .line 564
    move-result p0

    .line 565
    return p0

    .line 566
    .line 567
    .line 568
    :pswitch_3e
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asUnpackOptions()Lorg/tensorflow/lite/schema/UnpackOptionsT;

    .line 569
    move-result-object p1

    .line 570
    .line 571
    .line 572
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/UnpackOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/UnpackOptionsT;)I

    .line 573
    move-result p0

    .line 574
    return p0

    .line 575
    .line 576
    .line 577
    :pswitch_3f
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asLogicalNotOptions()Lorg/tensorflow/lite/schema/LogicalNotOptionsT;

    .line 578
    move-result-object p1

    .line 579
    .line 580
    .line 581
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/LogicalNotOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/LogicalNotOptionsT;)I

    .line 582
    move-result p0

    .line 583
    return p0

    .line 584
    .line 585
    .line 586
    :pswitch_40
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asLogicalAndOptions()Lorg/tensorflow/lite/schema/LogicalAndOptionsT;

    .line 587
    move-result-object p1

    .line 588
    .line 589
    .line 590
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/LogicalAndOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/LogicalAndOptionsT;)I

    .line 591
    move-result p0

    .line 592
    return p0

    .line 593
    .line 594
    .line 595
    :pswitch_41
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asOneHotOptions()Lorg/tensorflow/lite/schema/OneHotOptionsT;

    .line 596
    move-result-object p1

    .line 597
    .line 598
    .line 599
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/OneHotOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/OneHotOptionsT;)I

    .line 600
    move-result p0

    .line 601
    return p0

    .line 602
    .line 603
    .line 604
    :pswitch_42
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asLogicalOrOptions()Lorg/tensorflow/lite/schema/LogicalOrOptionsT;

    .line 605
    move-result-object p1

    .line 606
    .line 607
    .line 608
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/LogicalOrOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/LogicalOrOptionsT;)I

    .line 609
    move-result p0

    .line 610
    return p0

    .line 611
    .line 612
    .line 613
    :pswitch_43
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asPackOptions()Lorg/tensorflow/lite/schema/PackOptionsT;

    .line 614
    move-result-object p1

    .line 615
    .line 616
    .line 617
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/PackOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/PackOptionsT;)I

    .line 618
    move-result p0

    .line 619
    return p0

    .line 620
    .line 621
    .line 622
    :pswitch_44
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asFakeQuantOptions()Lorg/tensorflow/lite/schema/FakeQuantOptionsT;

    .line 623
    move-result-object p1

    .line 624
    .line 625
    .line 626
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/FakeQuantOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/FakeQuantOptionsT;)I

    .line 627
    move-result p0

    .line 628
    return p0

    .line 629
    .line 630
    .line 631
    :pswitch_45
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asArgMinOptions()Lorg/tensorflow/lite/schema/ArgMinOptionsT;

    .line 632
    move-result-object p1

    .line 633
    .line 634
    .line 635
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/ArgMinOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/ArgMinOptionsT;)I

    .line 636
    move-result p0

    .line 637
    return p0

    .line 638
    .line 639
    .line 640
    :pswitch_46
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asPowOptions()Lorg/tensorflow/lite/schema/PowOptionsT;

    .line 641
    move-result-object p1

    .line 642
    .line 643
    .line 644
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/PowOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/PowOptionsT;)I

    .line 645
    move-result p0

    .line 646
    return p0

    .line 647
    .line 648
    .line 649
    :pswitch_47
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asShapeOptions()Lorg/tensorflow/lite/schema/ShapeOptionsT;

    .line 650
    move-result-object p1

    .line 651
    .line 652
    .line 653
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/ShapeOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/ShapeOptionsT;)I

    .line 654
    move-result p0

    .line 655
    return p0

    .line 656
    .line 657
    .line 658
    :pswitch_48
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asNotEqualOptions()Lorg/tensorflow/lite/schema/NotEqualOptionsT;

    .line 659
    move-result-object p1

    .line 660
    .line 661
    .line 662
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/NotEqualOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/NotEqualOptionsT;)I

    .line 663
    move-result p0

    .line 664
    return p0

    .line 665
    .line 666
    .line 667
    :pswitch_49
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asEqualOptions()Lorg/tensorflow/lite/schema/EqualOptionsT;

    .line 668
    move-result-object p1

    .line 669
    .line 670
    .line 671
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/EqualOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/EqualOptionsT;)I

    .line 672
    move-result p0

    .line 673
    return p0

    .line 674
    .line 675
    .line 676
    :pswitch_4a
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asExpandDimsOptions()Lorg/tensorflow/lite/schema/ExpandDimsOptionsT;

    .line 677
    move-result-object p1

    .line 678
    .line 679
    .line 680
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/ExpandDimsOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/ExpandDimsOptionsT;)I

    .line 681
    move-result p0

    .line 682
    return p0

    .line 683
    .line 684
    .line 685
    :pswitch_4b
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asTileOptions()Lorg/tensorflow/lite/schema/TileOptionsT;

    .line 686
    move-result-object p1

    .line 687
    .line 688
    .line 689
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/TileOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/TileOptionsT;)I

    .line 690
    move-result p0

    .line 691
    return p0

    .line 692
    .line 693
    .line 694
    :pswitch_4c
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asSparseToDenseOptions()Lorg/tensorflow/lite/schema/SparseToDenseOptionsT;

    .line 695
    move-result-object p1

    .line 696
    .line 697
    .line 698
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/SparseToDenseOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/SparseToDenseOptionsT;)I

    .line 699
    move-result p0

    .line 700
    return p0

    .line 701
    .line 702
    .line 703
    :pswitch_4d
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asTransposeConvOptions()Lorg/tensorflow/lite/schema/TransposeConvOptionsT;

    .line 704
    move-result-object p1

    .line 705
    .line 706
    .line 707
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/TransposeConvOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/TransposeConvOptionsT;)I

    .line 708
    move-result p0

    .line 709
    return p0

    .line 710
    .line 711
    .line 712
    :pswitch_4e
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asSliceOptions()Lorg/tensorflow/lite/schema/SliceOptionsT;

    .line 713
    move-result-object p1

    .line 714
    .line 715
    .line 716
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/SliceOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/SliceOptionsT;)I

    .line 717
    move-result p0

    .line 718
    return p0

    .line 719
    .line 720
    .line 721
    :pswitch_4f
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asSelectOptions()Lorg/tensorflow/lite/schema/SelectOptionsT;

    .line 722
    move-result-object p1

    .line 723
    .line 724
    .line 725
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/SelectOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/SelectOptionsT;)I

    .line 726
    move-result p0

    .line 727
    return p0

    .line 728
    .line 729
    .line 730
    :pswitch_50
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asLessEqualOptions()Lorg/tensorflow/lite/schema/LessEqualOptionsT;

    .line 731
    move-result-object p1

    .line 732
    .line 733
    .line 734
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/LessEqualOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/LessEqualOptionsT;)I

    .line 735
    move-result p0

    .line 736
    return p0

    .line 737
    .line 738
    .line 739
    :pswitch_51
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asGreaterEqualOptions()Lorg/tensorflow/lite/schema/GreaterEqualOptionsT;

    .line 740
    move-result-object p1

    .line 741
    .line 742
    .line 743
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/GreaterEqualOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/GreaterEqualOptionsT;)I

    .line 744
    move-result p0

    .line 745
    return p0

    .line 746
    .line 747
    .line 748
    :pswitch_52
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asGreaterOptions()Lorg/tensorflow/lite/schema/GreaterOptionsT;

    .line 749
    move-result-object p1

    .line 750
    .line 751
    .line 752
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/GreaterOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/GreaterOptionsT;)I

    .line 753
    move-result p0

    .line 754
    return p0

    .line 755
    .line 756
    .line 757
    :pswitch_53
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asPadV2Options()Lorg/tensorflow/lite/schema/PadV2OptionsT;

    .line 758
    move-result-object p1

    .line 759
    .line 760
    .line 761
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/PadV2Options;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/PadV2OptionsT;)I

    .line 762
    move-result p0

    .line 763
    return p0

    .line 764
    .line 765
    .line 766
    :pswitch_54
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asNegOptions()Lorg/tensorflow/lite/schema/NegOptionsT;

    .line 767
    move-result-object p1

    .line 768
    .line 769
    .line 770
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/NegOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/NegOptionsT;)I

    .line 771
    move-result p0

    .line 772
    return p0

    .line 773
    .line 774
    .line 775
    :pswitch_55
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asLessOptions()Lorg/tensorflow/lite/schema/LessOptionsT;

    .line 776
    move-result-object p1

    .line 777
    .line 778
    .line 779
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/LessOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/LessOptionsT;)I

    .line 780
    move-result p0

    .line 781
    return p0

    .line 782
    .line 783
    .line 784
    :pswitch_56
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asArgMaxOptions()Lorg/tensorflow/lite/schema/ArgMaxOptionsT;

    .line 785
    move-result-object p1

    .line 786
    .line 787
    .line 788
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/ArgMaxOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/ArgMaxOptionsT;)I

    .line 789
    move-result p0

    .line 790
    return p0

    .line 791
    .line 792
    .line 793
    :pswitch_57
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asMaximumMinimumOptions()Lorg/tensorflow/lite/schema/MaximumMinimumOptionsT;

    .line 794
    move-result-object p1

    .line 795
    .line 796
    .line 797
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/MaximumMinimumOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/MaximumMinimumOptionsT;)I

    .line 798
    move-result p0

    .line 799
    return p0

    .line 800
    .line 801
    .line 802
    :pswitch_58
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asDequantizeOptions()Lorg/tensorflow/lite/schema/DequantizeOptionsT;

    .line 803
    move-result-object p1

    .line 804
    .line 805
    .line 806
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/DequantizeOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/DequantizeOptionsT;)I

    .line 807
    move-result p0

    .line 808
    return p0

    .line 809
    .line 810
    .line 811
    :pswitch_59
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asCastOptions()Lorg/tensorflow/lite/schema/CastOptionsT;

    .line 812
    move-result-object p1

    .line 813
    .line 814
    .line 815
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/CastOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/CastOptionsT;)I

    .line 816
    move-result p0

    .line 817
    return p0

    .line 818
    .line 819
    .line 820
    :pswitch_5a
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asLogSoftmaxOptions()Lorg/tensorflow/lite/schema/LogSoftmaxOptionsT;

    .line 821
    move-result-object p1

    .line 822
    .line 823
    .line 824
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/LogSoftmaxOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/LogSoftmaxOptionsT;)I

    .line 825
    move-result p0

    .line 826
    return p0

    .line 827
    .line 828
    .line 829
    :pswitch_5b
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asSplitOptions()Lorg/tensorflow/lite/schema/SplitOptionsT;

    .line 830
    move-result-object p1

    .line 831
    .line 832
    .line 833
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/SplitOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/SplitOptionsT;)I

    .line 834
    move-result p0

    .line 835
    return p0

    .line 836
    .line 837
    .line 838
    :pswitch_5c
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asTopKV2Options()Lorg/tensorflow/lite/schema/TopKV2OptionsT;

    .line 839
    move-result-object p1

    .line 840
    .line 841
    .line 842
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/TopKV2Options;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/TopKV2OptionsT;)I

    .line 843
    move-result p0

    .line 844
    return p0

    .line 845
    .line 846
    .line 847
    :pswitch_5d
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asExpOptions()Lorg/tensorflow/lite/schema/ExpOptionsT;

    .line 848
    move-result-object p1

    .line 849
    .line 850
    .line 851
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/ExpOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/ExpOptionsT;)I

    .line 852
    move-result p0

    .line 853
    return p0

    .line 854
    .line 855
    .line 856
    :pswitch_5e
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asStridedSliceOptions()Lorg/tensorflow/lite/schema/StridedSliceOptionsT;

    .line 857
    move-result-object p1

    .line 858
    .line 859
    .line 860
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/StridedSliceOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/StridedSliceOptionsT;)I

    .line 861
    move-result p0

    .line 862
    return p0

    .line 863
    .line 864
    .line 865
    :pswitch_5f
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asSequenceRNNOptions()Lorg/tensorflow/lite/schema/SequenceRNNOptionsT;

    .line 866
    move-result-object p1

    .line 867
    .line 868
    .line 869
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/SequenceRNNOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/SequenceRNNOptionsT;)I

    .line 870
    move-result p0

    .line 871
    return p0

    .line 872
    .line 873
    .line 874
    :pswitch_60
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asSqueezeOptions()Lorg/tensorflow/lite/schema/SqueezeOptionsT;

    .line 875
    move-result-object p1

    .line 876
    .line 877
    .line 878
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/SqueezeOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/SqueezeOptionsT;)I

    .line 879
    move-result p0

    .line 880
    return p0

    .line 881
    .line 882
    .line 883
    :pswitch_61
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asDivOptions()Lorg/tensorflow/lite/schema/DivOptionsT;

    .line 884
    move-result-object p1

    .line 885
    .line 886
    .line 887
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/DivOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/DivOptionsT;)I

    .line 888
    move-result p0

    .line 889
    return p0

    .line 890
    .line 891
    .line 892
    :pswitch_62
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asSubOptions()Lorg/tensorflow/lite/schema/SubOptionsT;

    .line 893
    move-result-object p1

    .line 894
    .line 895
    .line 896
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/SubOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/SubOptionsT;)I

    .line 897
    move-result p0

    .line 898
    return p0

    .line 899
    .line 900
    .line 901
    :pswitch_63
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asReducerOptions()Lorg/tensorflow/lite/schema/ReducerOptionsT;

    .line 902
    move-result-object p1

    .line 903
    .line 904
    .line 905
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/ReducerOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/ReducerOptionsT;)I

    .line 906
    move-result p0

    .line 907
    return p0

    .line 908
    .line 909
    .line 910
    :pswitch_64
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asTransposeOptions()Lorg/tensorflow/lite/schema/TransposeOptionsT;

    .line 911
    move-result-object p1

    .line 912
    .line 913
    .line 914
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/TransposeOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/TransposeOptionsT;)I

    .line 915
    move-result p0

    .line 916
    return p0

    .line 917
    .line 918
    .line 919
    :pswitch_65
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asSpaceToBatchNDOptions()Lorg/tensorflow/lite/schema/SpaceToBatchNDOptionsT;

    .line 920
    move-result-object p1

    .line 921
    .line 922
    .line 923
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/SpaceToBatchNDOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/SpaceToBatchNDOptionsT;)I

    .line 924
    move-result p0

    .line 925
    return p0

    .line 926
    .line 927
    .line 928
    :pswitch_66
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asBatchToSpaceNDOptions()Lorg/tensorflow/lite/schema/BatchToSpaceNDOptionsT;

    .line 929
    move-result-object p1

    .line 930
    .line 931
    .line 932
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/BatchToSpaceNDOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/BatchToSpaceNDOptionsT;)I

    .line 933
    move-result p0

    .line 934
    return p0

    .line 935
    .line 936
    .line 937
    :pswitch_67
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asGatherOptions()Lorg/tensorflow/lite/schema/GatherOptionsT;

    .line 938
    move-result-object p1

    .line 939
    .line 940
    .line 941
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/GatherOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/GatherOptionsT;)I

    .line 942
    move-result p0

    .line 943
    return p0

    .line 944
    .line 945
    .line 946
    :pswitch_68
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asPadOptions()Lorg/tensorflow/lite/schema/PadOptionsT;

    .line 947
    move-result-object p1

    .line 948
    .line 949
    .line 950
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/PadOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/PadOptionsT;)I

    .line 951
    move-result p0

    .line 952
    return p0

    .line 953
    .line 954
    .line 955
    :pswitch_69
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asMulOptions()Lorg/tensorflow/lite/schema/MulOptionsT;

    .line 956
    move-result-object p1

    .line 957
    .line 958
    .line 959
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/MulOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/MulOptionsT;)I

    .line 960
    move-result p0

    .line 961
    return p0

    .line 962
    .line 963
    .line 964
    :pswitch_6a
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asEmbeddingLookupSparseOptions()Lorg/tensorflow/lite/schema/EmbeddingLookupSparseOptionsT;

    .line 965
    move-result-object p1

    .line 966
    .line 967
    .line 968
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/EmbeddingLookupSparseOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/EmbeddingLookupSparseOptionsT;)I

    .line 969
    move-result p0

    .line 970
    return p0

    .line 971
    .line 972
    .line 973
    :pswitch_6b
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asSpaceToDepthOptions()Lorg/tensorflow/lite/schema/SpaceToDepthOptionsT;

    .line 974
    move-result-object p1

    .line 975
    .line 976
    .line 977
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/SpaceToDepthOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/SpaceToDepthOptionsT;)I

    .line 978
    move-result p0

    .line 979
    return p0

    .line 980
    .line 981
    .line 982
    :pswitch_6c
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asSkipGramOptions()Lorg/tensorflow/lite/schema/SkipGramOptionsT;

    .line 983
    move-result-object p1

    .line 984
    .line 985
    .line 986
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/SkipGramOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/SkipGramOptionsT;)I

    .line 987
    move-result p0

    .line 988
    return p0

    .line 989
    .line 990
    .line 991
    :pswitch_6d
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asReshapeOptions()Lorg/tensorflow/lite/schema/ReshapeOptionsT;

    .line 992
    move-result-object p1

    .line 993
    .line 994
    .line 995
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/ReshapeOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/ReshapeOptionsT;)I

    .line 996
    move-result p0

    .line 997
    return p0

    .line 998
    .line 999
    .line 1000
    :pswitch_6e
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asCallOptions()Lorg/tensorflow/lite/schema/CallOptionsT;

    .line 1001
    move-result-object p1

    .line 1002
    .line 1003
    .line 1004
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/CallOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/CallOptionsT;)I

    .line 1005
    move-result p0

    .line 1006
    return p0

    .line 1007
    .line 1008
    .line 1009
    :pswitch_6f
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asResizeBilinearOptions()Lorg/tensorflow/lite/schema/ResizeBilinearOptionsT;

    .line 1010
    move-result-object p1

    .line 1011
    .line 1012
    .line 1013
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/ResizeBilinearOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/ResizeBilinearOptionsT;)I

    .line 1014
    move-result p0

    .line 1015
    return p0

    .line 1016
    .line 1017
    .line 1018
    :pswitch_70
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asLSTMOptions()Lorg/tensorflow/lite/schema/LSTMOptionsT;

    .line 1019
    move-result-object p1

    .line 1020
    .line 1021
    .line 1022
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/LSTMOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/LSTMOptionsT;)I

    .line 1023
    move-result p0

    .line 1024
    return p0

    .line 1025
    .line 1026
    .line 1027
    :pswitch_71
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asLocalResponseNormalizationOptions()Lorg/tensorflow/lite/schema/LocalResponseNormalizationOptionsT;

    .line 1028
    move-result-object p1

    .line 1029
    .line 1030
    .line 1031
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/LocalResponseNormalizationOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/LocalResponseNormalizationOptionsT;)I

    .line 1032
    move-result p0

    .line 1033
    return p0

    .line 1034
    .line 1035
    .line 1036
    :pswitch_72
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asL2NormOptions()Lorg/tensorflow/lite/schema/L2NormOptionsT;

    .line 1037
    move-result-object p1

    .line 1038
    .line 1039
    .line 1040
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/L2NormOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/L2NormOptionsT;)I

    .line 1041
    move-result p0

    .line 1042
    return p0

    .line 1043
    .line 1044
    .line 1045
    :pswitch_73
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asAddOptions()Lorg/tensorflow/lite/schema/AddOptionsT;

    .line 1046
    move-result-object p1

    .line 1047
    .line 1048
    .line 1049
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/AddOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/AddOptionsT;)I

    .line 1050
    move-result p0

    .line 1051
    return p0

    .line 1052
    .line 1053
    .line 1054
    :pswitch_74
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asConcatenationOptions()Lorg/tensorflow/lite/schema/ConcatenationOptionsT;

    .line 1055
    move-result-object p1

    .line 1056
    .line 1057
    .line 1058
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/ConcatenationOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/ConcatenationOptionsT;)I

    .line 1059
    move-result p0

    .line 1060
    return p0

    .line 1061
    .line 1062
    .line 1063
    :pswitch_75
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asSoftmaxOptions()Lorg/tensorflow/lite/schema/SoftmaxOptionsT;

    .line 1064
    move-result-object p1

    .line 1065
    .line 1066
    .line 1067
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/SoftmaxOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/SoftmaxOptionsT;)I

    .line 1068
    move-result p0

    .line 1069
    return p0

    .line 1070
    .line 1071
    .line 1072
    :pswitch_76
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asFullyConnectedOptions()Lorg/tensorflow/lite/schema/FullyConnectedOptionsT;

    .line 1073
    move-result-object p1

    .line 1074
    .line 1075
    .line 1076
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/FullyConnectedOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/FullyConnectedOptionsT;)I

    .line 1077
    move-result p0

    .line 1078
    return p0

    .line 1079
    .line 1080
    .line 1081
    :pswitch_77
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asRNNOptions()Lorg/tensorflow/lite/schema/RNNOptionsT;

    .line 1082
    move-result-object p1

    .line 1083
    .line 1084
    .line 1085
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/RNNOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/RNNOptionsT;)I

    .line 1086
    move-result p0

    .line 1087
    return p0

    .line 1088
    .line 1089
    .line 1090
    :pswitch_78
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asSVDFOptions()Lorg/tensorflow/lite/schema/SVDFOptionsT;

    .line 1091
    move-result-object p1

    .line 1092
    .line 1093
    .line 1094
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/SVDFOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/SVDFOptionsT;)I

    .line 1095
    move-result p0

    .line 1096
    return p0

    .line 1097
    .line 1098
    .line 1099
    :pswitch_79
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asPool2DOptions()Lorg/tensorflow/lite/schema/Pool2DOptionsT;

    .line 1100
    move-result-object p1

    .line 1101
    .line 1102
    .line 1103
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/Pool2DOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/Pool2DOptionsT;)I

    .line 1104
    move-result p0

    .line 1105
    return p0

    .line 1106
    .line 1107
    .line 1108
    :pswitch_7a
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asLSHProjectionOptions()Lorg/tensorflow/lite/schema/LSHProjectionOptionsT;

    .line 1109
    move-result-object p1

    .line 1110
    .line 1111
    .line 1112
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/LSHProjectionOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/LSHProjectionOptionsT;)I

    .line 1113
    move-result p0

    .line 1114
    return p0

    .line 1115
    .line 1116
    .line 1117
    :pswitch_7b
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asConcatEmbeddingsOptions()Lorg/tensorflow/lite/schema/ConcatEmbeddingsOptionsT;

    .line 1118
    move-result-object p1

    .line 1119
    .line 1120
    .line 1121
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/ConcatEmbeddingsOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/ConcatEmbeddingsOptionsT;)I

    .line 1122
    move-result p0

    .line 1123
    return p0

    .line 1124
    .line 1125
    .line 1126
    :pswitch_7c
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asDepthwiseConv2DOptions()Lorg/tensorflow/lite/schema/DepthwiseConv2DOptionsT;

    .line 1127
    move-result-object p1

    .line 1128
    .line 1129
    .line 1130
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/DepthwiseConv2DOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/DepthwiseConv2DOptionsT;)I

    .line 1131
    move-result p0

    .line 1132
    return p0

    .line 1133
    .line 1134
    .line 1135
    :pswitch_7d
    invoke-virtual {p1}, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->asConv2DOptions()Lorg/tensorflow/lite/schema/Conv2DOptionsT;

    .line 1136
    move-result-object p1

    .line 1137
    .line 1138
    .line 1139
    invoke-static {p0, p1}, Lorg/tensorflow/lite/schema/Conv2DOptions;->pack(Lcom/google/flatbuffers/FlatBufferBuilder;Lorg/tensorflow/lite/schema/Conv2DOptionsT;)I

    .line 1140
    move-result p0

    .line 1141
    return p0

    .line 1142
    nop

    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7d
        :pswitch_7c
        :pswitch_7b
        :pswitch_7a
        :pswitch_79
        :pswitch_78
        :pswitch_77
        :pswitch_76
        :pswitch_75
        :pswitch_74
        :pswitch_73
        :pswitch_72
        :pswitch_71
        :pswitch_70
        :pswitch_6f
        :pswitch_6e
        :pswitch_6d
        :pswitch_6c
        :pswitch_6b
        :pswitch_6a
        :pswitch_69
        :pswitch_68
        :pswitch_67
        :pswitch_66
        :pswitch_65
        :pswitch_64
        :pswitch_63
        :pswitch_62
        :pswitch_61
        :pswitch_60
        :pswitch_5f
        :pswitch_5e
        :pswitch_5d
        :pswitch_5c
        :pswitch_5b
        :pswitch_5a
        :pswitch_59
        :pswitch_58
        :pswitch_57
        :pswitch_56
        :pswitch_55
        :pswitch_54
        :pswitch_53
        :pswitch_52
        :pswitch_51
        :pswitch_50
        :pswitch_4f
        :pswitch_4e
        :pswitch_4d
        :pswitch_4c
        :pswitch_4b
        :pswitch_4a
        :pswitch_49
        :pswitch_48
        :pswitch_47
        :pswitch_46
        :pswitch_45
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
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
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
.end method


# virtual methods
.method public asATan2Options()Lorg/tensorflow/lite/schema/ATan2OptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/ATan2OptionsT;

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

.method public asAbsOptions()Lorg/tensorflow/lite/schema/AbsOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/AbsOptionsT;

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

.method public asAddNOptions()Lorg/tensorflow/lite/schema/AddNOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/AddNOptionsT;

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

.method public asAddOptions()Lorg/tensorflow/lite/schema/AddOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/AddOptionsT;

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

.method public asArgMaxOptions()Lorg/tensorflow/lite/schema/ArgMaxOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/ArgMaxOptionsT;

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

.method public asArgMinOptions()Lorg/tensorflow/lite/schema/ArgMinOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/ArgMinOptionsT;

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

.method public asAssignVariableOptions()Lorg/tensorflow/lite/schema/AssignVariableOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/AssignVariableOptionsT;

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

.method public asBatchMatMulOptions()Lorg/tensorflow/lite/schema/BatchMatMulOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/BatchMatMulOptionsT;

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

.method public asBatchToSpaceNDOptions()Lorg/tensorflow/lite/schema/BatchToSpaceNDOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/BatchToSpaceNDOptionsT;

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

.method public asBidirectionalSequenceLSTMOptions()Lorg/tensorflow/lite/schema/BidirectionalSequenceLSTMOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/BidirectionalSequenceLSTMOptionsT;

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

.method public asBidirectionalSequenceRNNOptions()Lorg/tensorflow/lite/schema/BidirectionalSequenceRNNOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/BidirectionalSequenceRNNOptionsT;

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

.method public asBitcastOptions()Lorg/tensorflow/lite/schema/BitcastOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/BitcastOptionsT;

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

.method public asBitwiseXorOptions()Lorg/tensorflow/lite/schema/BitwiseXorOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/BitwiseXorOptionsT;

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

.method public asBroadcastToOptions()Lorg/tensorflow/lite/schema/BroadcastToOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/BroadcastToOptionsT;

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

.method public asBucketizeOptions()Lorg/tensorflow/lite/schema/BucketizeOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/BucketizeOptionsT;

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

.method public asCallOnceOptions()Lorg/tensorflow/lite/schema/CallOnceOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/CallOnceOptionsT;

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

.method public asCallOptions()Lorg/tensorflow/lite/schema/CallOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/CallOptionsT;

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

.method public asCastOptions()Lorg/tensorflow/lite/schema/CastOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/CastOptionsT;

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

.method public asConcatEmbeddingsOptions()Lorg/tensorflow/lite/schema/ConcatEmbeddingsOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/ConcatEmbeddingsOptionsT;

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

.method public asConcatenationOptions()Lorg/tensorflow/lite/schema/ConcatenationOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/ConcatenationOptionsT;

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

.method public asConv2DOptions()Lorg/tensorflow/lite/schema/Conv2DOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/Conv2DOptionsT;

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

.method public asConv3DOptions()Lorg/tensorflow/lite/schema/Conv3DOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/Conv3DOptionsT;

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

.method public asCosOptions()Lorg/tensorflow/lite/schema/CosOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/CosOptionsT;

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

.method public asCumsumOptions()Lorg/tensorflow/lite/schema/CumsumOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/CumsumOptionsT;

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

.method public asDensifyOptions()Lorg/tensorflow/lite/schema/DensifyOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/DensifyOptionsT;

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

.method public asDepthToSpaceOptions()Lorg/tensorflow/lite/schema/DepthToSpaceOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/DepthToSpaceOptionsT;

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

.method public asDepthwiseConv2DOptions()Lorg/tensorflow/lite/schema/DepthwiseConv2DOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/DepthwiseConv2DOptionsT;

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

.method public asDequantizeOptions()Lorg/tensorflow/lite/schema/DequantizeOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/DequantizeOptionsT;

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

.method public asDivOptions()Lorg/tensorflow/lite/schema/DivOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/DivOptionsT;

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

.method public asDynamicUpdateSliceOptions()Lorg/tensorflow/lite/schema/DynamicUpdateSliceOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/DynamicUpdateSliceOptionsT;

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

.method public asEmbeddingLookupSparseOptions()Lorg/tensorflow/lite/schema/EmbeddingLookupSparseOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/EmbeddingLookupSparseOptionsT;

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

.method public asEqualOptions()Lorg/tensorflow/lite/schema/EqualOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/EqualOptionsT;

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

.method public asExpOptions()Lorg/tensorflow/lite/schema/ExpOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/ExpOptionsT;

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

.method public asExpandDimsOptions()Lorg/tensorflow/lite/schema/ExpandDimsOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/ExpandDimsOptionsT;

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

.method public asFakeQuantOptions()Lorg/tensorflow/lite/schema/FakeQuantOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/FakeQuantOptionsT;

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

.method public asFillOptions()Lorg/tensorflow/lite/schema/FillOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/FillOptionsT;

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

.method public asFloorDivOptions()Lorg/tensorflow/lite/schema/FloorDivOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/FloorDivOptionsT;

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

.method public asFloorModOptions()Lorg/tensorflow/lite/schema/FloorModOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/FloorModOptionsT;

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

.method public asFullyConnectedOptions()Lorg/tensorflow/lite/schema/FullyConnectedOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/FullyConnectedOptionsT;

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

.method public asGatherNdOptions()Lorg/tensorflow/lite/schema/GatherNdOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/GatherNdOptionsT;

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

.method public asGatherOptions()Lorg/tensorflow/lite/schema/GatherOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/GatherOptionsT;

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

.method public asGeluOptions()Lorg/tensorflow/lite/schema/GeluOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/GeluOptionsT;

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

.method public asGreaterEqualOptions()Lorg/tensorflow/lite/schema/GreaterEqualOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/GreaterEqualOptionsT;

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

.method public asGreaterOptions()Lorg/tensorflow/lite/schema/GreaterOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/GreaterOptionsT;

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

.method public asHardSwishOptions()Lorg/tensorflow/lite/schema/HardSwishOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/HardSwishOptionsT;

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

.method public asHashtableFindOptions()Lorg/tensorflow/lite/schema/HashtableFindOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/HashtableFindOptionsT;

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

.method public asHashtableImportOptions()Lorg/tensorflow/lite/schema/HashtableImportOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/HashtableImportOptionsT;

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

.method public asHashtableOptions()Lorg/tensorflow/lite/schema/HashtableOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/HashtableOptionsT;

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

.method public asHashtableSizeOptions()Lorg/tensorflow/lite/schema/HashtableSizeOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/HashtableSizeOptionsT;

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

.method public asIfOptions()Lorg/tensorflow/lite/schema/IfOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/IfOptionsT;

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

.method public asL2NormOptions()Lorg/tensorflow/lite/schema/L2NormOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/L2NormOptionsT;

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

.method public asLSHProjectionOptions()Lorg/tensorflow/lite/schema/LSHProjectionOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/LSHProjectionOptionsT;

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

.method public asLSTMOptions()Lorg/tensorflow/lite/schema/LSTMOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/LSTMOptionsT;

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

.method public asLeakyReluOptions()Lorg/tensorflow/lite/schema/LeakyReluOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/LeakyReluOptionsT;

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

.method public asLessEqualOptions()Lorg/tensorflow/lite/schema/LessEqualOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/LessEqualOptionsT;

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

.method public asLessOptions()Lorg/tensorflow/lite/schema/LessOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/LessOptionsT;

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

.method public asLocalResponseNormalizationOptions()Lorg/tensorflow/lite/schema/LocalResponseNormalizationOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/LocalResponseNormalizationOptionsT;

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

.method public asLogSoftmaxOptions()Lorg/tensorflow/lite/schema/LogSoftmaxOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/LogSoftmaxOptionsT;

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

.method public asLogicalAndOptions()Lorg/tensorflow/lite/schema/LogicalAndOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/LogicalAndOptionsT;

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

.method public asLogicalNotOptions()Lorg/tensorflow/lite/schema/LogicalNotOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/LogicalNotOptionsT;

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

.method public asLogicalOrOptions()Lorg/tensorflow/lite/schema/LogicalOrOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/LogicalOrOptionsT;

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

.method public asMatrixDiagOptions()Lorg/tensorflow/lite/schema/MatrixDiagOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/MatrixDiagOptionsT;

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

.method public asMatrixSetDiagOptions()Lorg/tensorflow/lite/schema/MatrixSetDiagOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/MatrixSetDiagOptionsT;

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

.method public asMaximumMinimumOptions()Lorg/tensorflow/lite/schema/MaximumMinimumOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/MaximumMinimumOptionsT;

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

.method public asMirrorPadOptions()Lorg/tensorflow/lite/schema/MirrorPadOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/MirrorPadOptionsT;

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

.method public asMulOptions()Lorg/tensorflow/lite/schema/MulOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/MulOptionsT;

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

.method public asNegOptions()Lorg/tensorflow/lite/schema/NegOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/NegOptionsT;

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

.method public asNonMaxSuppressionV4Options()Lorg/tensorflow/lite/schema/NonMaxSuppressionV4OptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/NonMaxSuppressionV4OptionsT;

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

.method public asNonMaxSuppressionV5Options()Lorg/tensorflow/lite/schema/NonMaxSuppressionV5OptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/NonMaxSuppressionV5OptionsT;

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

.method public asNotEqualOptions()Lorg/tensorflow/lite/schema/NotEqualOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/NotEqualOptionsT;

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

.method public asOneHotOptions()Lorg/tensorflow/lite/schema/OneHotOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/OneHotOptionsT;

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

.method public asPackOptions()Lorg/tensorflow/lite/schema/PackOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/PackOptionsT;

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

.method public asPadOptions()Lorg/tensorflow/lite/schema/PadOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/PadOptionsT;

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

.method public asPadV2Options()Lorg/tensorflow/lite/schema/PadV2OptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/PadV2OptionsT;

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

.method public asPool2DOptions()Lorg/tensorflow/lite/schema/Pool2DOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/Pool2DOptionsT;

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

.method public asPowOptions()Lorg/tensorflow/lite/schema/PowOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/PowOptionsT;

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

.method public asQuantizeOptions()Lorg/tensorflow/lite/schema/QuantizeOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/QuantizeOptionsT;

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

.method public asRNNOptions()Lorg/tensorflow/lite/schema/RNNOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/RNNOptionsT;

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

.method public asRandomOptions()Lorg/tensorflow/lite/schema/RandomOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/RandomOptionsT;

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

.method public asRangeOptions()Lorg/tensorflow/lite/schema/RangeOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/RangeOptionsT;

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

.method public asRankOptions()Lorg/tensorflow/lite/schema/RankOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/RankOptionsT;

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

.method public asReadVariableOptions()Lorg/tensorflow/lite/schema/ReadVariableOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/ReadVariableOptionsT;

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

.method public asReducerOptions()Lorg/tensorflow/lite/schema/ReducerOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/ReducerOptionsT;

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

.method public asReshapeOptions()Lorg/tensorflow/lite/schema/ReshapeOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/ReshapeOptionsT;

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

.method public asResizeBilinearOptions()Lorg/tensorflow/lite/schema/ResizeBilinearOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/ResizeBilinearOptionsT;

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

.method public asResizeNearestNeighborOptions()Lorg/tensorflow/lite/schema/ResizeNearestNeighborOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/ResizeNearestNeighborOptionsT;

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

.method public asReverseSequenceOptions()Lorg/tensorflow/lite/schema/ReverseSequenceOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/ReverseSequenceOptionsT;

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

.method public asReverseV2Options()Lorg/tensorflow/lite/schema/ReverseV2OptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/ReverseV2OptionsT;

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

.method public asRfft2dOptions()Lorg/tensorflow/lite/schema/Rfft2dOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/Rfft2dOptionsT;

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

.method public asRightShiftOptions()Lorg/tensorflow/lite/schema/RightShiftOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/RightShiftOptionsT;

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

.method public asSVDFOptions()Lorg/tensorflow/lite/schema/SVDFOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/SVDFOptionsT;

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

.method public asScatterNdOptions()Lorg/tensorflow/lite/schema/ScatterNdOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/ScatterNdOptionsT;

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

.method public asSegmentSumOptions()Lorg/tensorflow/lite/schema/SegmentSumOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/SegmentSumOptionsT;

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

.method public asSelectOptions()Lorg/tensorflow/lite/schema/SelectOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/SelectOptionsT;

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

.method public asSelectV2Options()Lorg/tensorflow/lite/schema/SelectV2OptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/SelectV2OptionsT;

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

.method public asSequenceRNNOptions()Lorg/tensorflow/lite/schema/SequenceRNNOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/SequenceRNNOptionsT;

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

.method public asShapeOptions()Lorg/tensorflow/lite/schema/ShapeOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/ShapeOptionsT;

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

.method public asSignOptions()Lorg/tensorflow/lite/schema/SignOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/SignOptionsT;

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

.method public asSkipGramOptions()Lorg/tensorflow/lite/schema/SkipGramOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/SkipGramOptionsT;

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

.method public asSliceOptions()Lorg/tensorflow/lite/schema/SliceOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/SliceOptionsT;

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

.method public asSoftmaxOptions()Lorg/tensorflow/lite/schema/SoftmaxOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/SoftmaxOptionsT;

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

.method public asSpaceToBatchNDOptions()Lorg/tensorflow/lite/schema/SpaceToBatchNDOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/SpaceToBatchNDOptionsT;

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

.method public asSpaceToDepthOptions()Lorg/tensorflow/lite/schema/SpaceToDepthOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/SpaceToDepthOptionsT;

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

.method public asSparseToDenseOptions()Lorg/tensorflow/lite/schema/SparseToDenseOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/SparseToDenseOptionsT;

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

.method public asSplitOptions()Lorg/tensorflow/lite/schema/SplitOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/SplitOptionsT;

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

.method public asSplitVOptions()Lorg/tensorflow/lite/schema/SplitVOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/SplitVOptionsT;

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

.method public asSquareOptions()Lorg/tensorflow/lite/schema/SquareOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/SquareOptionsT;

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

.method public asSquaredDifferenceOptions()Lorg/tensorflow/lite/schema/SquaredDifferenceOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/SquaredDifferenceOptionsT;

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

.method public asSqueezeOptions()Lorg/tensorflow/lite/schema/SqueezeOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/SqueezeOptionsT;

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

.method public asStridedSliceOptions()Lorg/tensorflow/lite/schema/StridedSliceOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/StridedSliceOptionsT;

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

.method public asSubOptions()Lorg/tensorflow/lite/schema/SubOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/SubOptionsT;

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

.method public asTileOptions()Lorg/tensorflow/lite/schema/TileOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/TileOptionsT;

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

.method public asTopKV2Options()Lorg/tensorflow/lite/schema/TopKV2OptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/TopKV2OptionsT;

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

.method public asTransposeConvOptions()Lorg/tensorflow/lite/schema/TransposeConvOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/TransposeConvOptionsT;

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

.method public asTransposeOptions()Lorg/tensorflow/lite/schema/TransposeOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/TransposeOptionsT;

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

.method public asUnidirectionalSequenceLSTMOptions()Lorg/tensorflow/lite/schema/UnidirectionalSequenceLSTMOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/UnidirectionalSequenceLSTMOptionsT;

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

.method public asUniqueOptions()Lorg/tensorflow/lite/schema/UniqueOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/UniqueOptionsT;

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

.method public asUnpackOptions()Lorg/tensorflow/lite/schema/UnpackOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/UnpackOptionsT;

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

.method public asUnsortedSegmentMaxOptions()Lorg/tensorflow/lite/schema/UnsortedSegmentMaxOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/UnsortedSegmentMaxOptionsT;

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

.method public asUnsortedSegmentMinOptions()Lorg/tensorflow/lite/schema/UnsortedSegmentMinOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/UnsortedSegmentMinOptionsT;

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

.method public asUnsortedSegmentProdOptions()Lorg/tensorflow/lite/schema/UnsortedSegmentProdOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/UnsortedSegmentProdOptionsT;

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

.method public asUnsortedSegmentSumOptions()Lorg/tensorflow/lite/schema/UnsortedSegmentSumOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/UnsortedSegmentSumOptionsT;

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

.method public asVarHandleOptions()Lorg/tensorflow/lite/schema/VarHandleOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/VarHandleOptionsT;

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

.method public asWhereOptions()Lorg/tensorflow/lite/schema/WhereOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/WhereOptionsT;

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

.method public asWhileOptions()Lorg/tensorflow/lite/schema/WhileOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/WhileOptionsT;

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

.method public asZerosLikeOptions()Lorg/tensorflow/lite/schema/ZerosLikeOptionsT;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/tensorflow/lite/schema/ZerosLikeOptionsT;

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
    iget-byte v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->type:B

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
    iget-object v0, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

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
    iput-byte p1, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->type:B

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
    iput-object p1, p0, Lorg/tensorflow/lite/schema/BuiltinOptionsUnion;->value:Ljava/lang/Object;

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
