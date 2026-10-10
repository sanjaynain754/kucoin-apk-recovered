.class public Landroidx/constraintlayout/core/state/TransitionParser;
.super Ljava/lang/Object;
.source "TransitionParser.java"


# direct methods
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
    .line 18
    .line 19
    .line 20
.end method

.method private static varargs map(Ljava/lang/String;[Ljava/lang/String;)I
    .locals 3

    const/4 v0, 0x0

    move v1, v0

    .line 1
    :goto_0
    array-length v2, p1

    if-ge v1, v2, :cond_1

    .line 2
    aget-object v2, p1, v1

    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return v1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v0
.end method

.method private static varargs map(Landroidx/constraintlayout/core/motion/utils/TypedBundle;ILjava/lang/String;[Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x0

    .line 3
    :goto_0
    array-length v1, p3

    if-ge v0, v1, :cond_1

    .line 4
    aget-object v1, p3, v0

    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 5
    invoke-virtual {p0, p1, v0}, Landroidx/constraintlayout/core/motion/utils/TypedBundle;->add(II)V

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static parse(Landroidx/constraintlayout/core/parser/CLObject;Landroidx/constraintlayout/core/state/Transition;)V
    .locals 11
    .param p0    # Landroidx/constraintlayout/core/parser/CLObject;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Landroidx/constraintlayout/core/state/Transition;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/RestrictTo;
        value = {
            .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY_GROUP:Landroidx/annotation/RestrictTo$Scope;
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/constraintlayout/core/parser/CLParsingException;
        }
    .end annotation

    const/4 v0, 0x5

    const/4 v1, 0x4

    const/4 v2, 0x3

    const/4 v3, 0x2

    .line 2
    invoke-virtual {p1}, Landroidx/constraintlayout/core/state/Transition;->resetProperties()V

    .line 3
    const-string/jumbo v4, "pathMotionArc"

    invoke-virtual {p0, v4}, Landroidx/constraintlayout/core/parser/CLContainer;->getStringOrNull(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 4
    new-instance v5, Landroidx/constraintlayout/core/motion/utils/TypedBundle;

    invoke-direct {v5}, Landroidx/constraintlayout/core/motion/utils/TypedBundle;-><init>()V

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v4, :cond_6

    const/16 v8, 0x1fd

    const/4 v9, -0x1

    .line 5
    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v10

    sparse-switch v10, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v10, "below"

    invoke-virtual {v4, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    goto :goto_0

    :cond_0
    move v9, v0

    goto :goto_0

    :sswitch_1
    const-string v10, "above"

    invoke-virtual {v4, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    goto :goto_0

    :cond_1
    move v9, v1

    goto :goto_0

    :sswitch_2
    const-string/jumbo v10, "none"

    invoke-virtual {v4, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    goto :goto_0

    :cond_2
    move v9, v2

    goto :goto_0

    :sswitch_3
    const-string v10, "flip"

    invoke-virtual {v4, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    goto :goto_0

    :cond_3
    move v9, v3

    goto :goto_0

    :sswitch_4
    const-string/jumbo v10, "startHorizontal"

    invoke-virtual {v4, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4

    goto :goto_0

    :cond_4
    move v9, v6

    goto :goto_0

    :sswitch_5
    const-string/jumbo v10, "startVertical"

    invoke-virtual {v4, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_5

    goto :goto_0

    :cond_5
    move v9, v7

    :goto_0
    packed-switch v9, :pswitch_data_0

    goto :goto_1

    .line 6
    :pswitch_0
    invoke-virtual {v5, v8, v1}, Landroidx/constraintlayout/core/motion/utils/TypedBundle;->add(II)V

    goto :goto_1

    .line 7
    :pswitch_1
    invoke-virtual {v5, v8, v0}, Landroidx/constraintlayout/core/motion/utils/TypedBundle;->add(II)V

    goto :goto_1

    .line 8
    :pswitch_2
    invoke-virtual {v5, v8, v7}, Landroidx/constraintlayout/core/motion/utils/TypedBundle;->add(II)V

    goto :goto_1

    .line 9
    :pswitch_3
    invoke-virtual {v5, v8, v2}, Landroidx/constraintlayout/core/motion/utils/TypedBundle;->add(II)V

    goto :goto_1

    .line 10
    :pswitch_4
    invoke-virtual {v5, v8, v3}, Landroidx/constraintlayout/core/motion/utils/TypedBundle;->add(II)V

    goto :goto_1

    .line 11
    :pswitch_5
    invoke-virtual {v5, v8, v6}, Landroidx/constraintlayout/core/motion/utils/TypedBundle;->add(II)V

    :goto_1
    move v7, v6

    .line 12
    :cond_6
    const-string v0, "interpolator"

    invoke-virtual {p0, v0}, Landroidx/constraintlayout/core/parser/CLContainer;->getStringOrNull(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_7

    const/16 v1, 0x2c1

    .line 13
    invoke-virtual {v5, v1, v0}, Landroidx/constraintlayout/core/motion/utils/TypedBundle;->add(ILjava/lang/String;)V

    move v7, v6

    .line 14
    :cond_7
    const-string/jumbo v0, "staggered"

    invoke-virtual {p0, v0}, Landroidx/constraintlayout/core/parser/CLContainer;->getFloatOrNaN(Ljava/lang/String;)F

    move-result v0

    .line 15
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v1

    if-nez v1, :cond_8

    const/16 v1, 0x2c2

    .line 16
    invoke-virtual {v5, v1, v0}, Landroidx/constraintlayout/core/motion/utils/TypedBundle;->add(IF)V

    goto :goto_2

    :cond_8
    move v6, v7

    :goto_2
    if-eqz v6, :cond_9

    .line 17
    invoke-virtual {p1, v5}, Landroidx/constraintlayout/core/state/Transition;->setTransitionProperties(Landroidx/constraintlayout/core/motion/utils/TypedBundle;)V

    .line 18
    :cond_9
    const-string/jumbo v0, "onSwipe"

    invoke-virtual {p0, v0}, Landroidx/constraintlayout/core/parser/CLContainer;->getObjectOrNull(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLObject;

    move-result-object v0

    if-eqz v0, :cond_a

    .line 19
    invoke-static {v0, p1}, Landroidx/constraintlayout/core/state/TransitionParser;->parseOnSwipe(Landroidx/constraintlayout/core/parser/CLContainer;Landroidx/constraintlayout/core/state/Transition;)V

    .line 20
    :cond_a
    invoke-static {p0, p1}, Landroidx/constraintlayout/core/state/TransitionParser;->parseKeyFrames(Landroidx/constraintlayout/core/parser/CLObject;Landroidx/constraintlayout/core/state/Transition;)V

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x6eaff208 -> :sswitch_5
        -0x3c0665da -> :sswitch_4
        0x30006d -> :sswitch_3
        0x33af38 -> :sswitch_2
        0x585239d -> :sswitch_1
        0x5948c31 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static parse(Landroidx/constraintlayout/core/parser/CLObject;Landroidx/constraintlayout/core/state/Transition;Landroidx/constraintlayout/core/state/CorePixelDp;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/constraintlayout/core/parser/CLParsingException;
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-static {p0, p1}, Landroidx/constraintlayout/core/state/TransitionParser;->parse(Landroidx/constraintlayout/core/parser/CLObject;Landroidx/constraintlayout/core/state/Transition;)V

    return-void
.end method

.method private static parseKeyAttribute(Landroidx/constraintlayout/core/parser/CLObject;Landroidx/constraintlayout/core/state/Transition;)V
    .locals 23
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/constraintlayout/core/parser/CLParsingException;
        }
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v1, p1

    .line 5
    .line 6
    const/16 v2, 0x9

    .line 7
    const/4 v4, 0x1

    .line 8
    .line 9
    .line 10
    const-string/jumbo v5, "target"

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v5}, Landroidx/constraintlayout/core/parser/CLContainer;->getArrayOrNull(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLArray;

    .line 14
    move-result-object v5

    .line 15
    .line 16
    if-nez v5, :cond_0

    .line 17
    .line 18
    goto/16 :goto_11

    .line 19
    .line 20
    :cond_0
    const-string v6, "frames"

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v6}, Landroidx/constraintlayout/core/parser/CLContainer;->getArrayOrNull(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLArray;

    .line 24
    move-result-object v6

    .line 25
    .line 26
    if-nez v6, :cond_1

    .line 27
    .line 28
    goto/16 :goto_11

    .line 29
    .line 30
    .line 31
    :cond_1
    const-string/jumbo v7, "transitionEasing"

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v7}, Landroidx/constraintlayout/core/parser/CLContainer;->getStringOrNull(Ljava/lang/String;)Ljava/lang/String;

    .line 35
    move-result-object v7

    .line 36
    .line 37
    .line 38
    const-string/jumbo v15, "rotationZ"

    .line 39
    .line 40
    const-string v16, "alpha"

    .line 41
    .line 42
    .line 43
    const-string/jumbo v8, "scaleX"

    .line 44
    .line 45
    .line 46
    const-string/jumbo v9, "scaleY"

    .line 47
    .line 48
    .line 49
    const-string/jumbo v10, "translationX"

    .line 50
    .line 51
    .line 52
    const-string/jumbo v11, "translationY"

    .line 53
    .line 54
    .line 55
    const-string/jumbo v12, "translationZ"

    .line 56
    .line 57
    .line 58
    const-string/jumbo v13, "rotationX"

    .line 59
    .line 60
    .line 61
    const-string/jumbo v14, "rotationY"

    .line 62
    .line 63
    .line 64
    filled-new-array/range {v8 .. v16}, [Ljava/lang/String;

    .line 65
    move-result-object v8

    .line 66
    .line 67
    new-array v9, v2, [I

    .line 68
    .line 69
    .line 70
    fill-array-data v9, :array_0

    .line 71
    .line 72
    new-array v10, v2, [Z

    .line 73
    .line 74
    .line 75
    fill-array-data v10, :array_1

    .line 76
    .line 77
    .line 78
    invoke-virtual {v6}, Landroidx/constraintlayout/core/parser/CLContainer;->size()I

    .line 79
    move-result v11

    .line 80
    .line 81
    new-array v12, v11, [Landroidx/constraintlayout/core/motion/utils/TypedBundle;

    .line 82
    const/4 v13, 0x0

    .line 83
    .line 84
    .line 85
    :goto_0
    invoke-virtual {v6}, Landroidx/constraintlayout/core/parser/CLContainer;->size()I

    .line 86
    move-result v14

    .line 87
    .line 88
    if-ge v13, v14, :cond_2

    .line 89
    .line 90
    new-instance v14, Landroidx/constraintlayout/core/motion/utils/TypedBundle;

    .line 91
    .line 92
    .line 93
    invoke-direct {v14}, Landroidx/constraintlayout/core/motion/utils/TypedBundle;-><init>()V

    .line 94
    .line 95
    aput-object v14, v12, v13

    .line 96
    add-int/2addr v13, v4

    .line 97
    goto :goto_0

    .line 98
    :cond_2
    const/4 v13, 0x0

    .line 99
    .line 100
    :goto_1
    if-ge v13, v2, :cond_a

    .line 101
    .line 102
    aget-object v14, v8, v13

    .line 103
    .line 104
    aget v15, v9, v13

    .line 105
    .line 106
    aget-boolean v16, v10, v13

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0, v14}, Landroidx/constraintlayout/core/parser/CLContainer;->getArrayOrNull(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLArray;

    .line 110
    move-result-object v2

    .line 111
    .line 112
    move/from16 v18, v4

    .line 113
    .line 114
    if-eqz v2, :cond_4

    .line 115
    .line 116
    .line 117
    invoke-virtual {v2}, Landroidx/constraintlayout/core/parser/CLContainer;->size()I

    .line 118
    move-result v4

    .line 119
    .line 120
    if-ne v4, v11, :cond_3

    .line 121
    goto :goto_2

    .line 122
    .line 123
    :cond_3
    new-instance v1, Landroidx/constraintlayout/core/parser/CLParsingException;

    .line 124
    .line 125
    new-instance v2, Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 129
    .line 130
    const-string v3, "incorrect size for "

    .line 131
    .line 132
    .line 133
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    const-string v3, " array, not matching targets array!"

    .line 139
    .line 140
    .line 141
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 145
    move-result-object v2

    .line 146
    .line 147
    .line 148
    invoke-direct {v1, v2, v0}, Landroidx/constraintlayout/core/parser/CLParsingException;-><init>(Ljava/lang/String;Landroidx/constraintlayout/core/parser/CLElement;)V

    .line 149
    throw v1

    .line 150
    .line 151
    :cond_4
    :goto_2
    if-eqz v2, :cond_7

    .line 152
    const/4 v4, 0x0

    .line 153
    .line 154
    :goto_3
    if-ge v4, v11, :cond_6

    .line 155
    .line 156
    .line 157
    invoke-virtual {v2, v4}, Landroidx/constraintlayout/core/parser/CLContainer;->getFloat(I)F

    .line 158
    move-result v14

    .line 159
    .line 160
    const/16 v19, 0x0

    .line 161
    .line 162
    if-eqz v16, :cond_5

    .line 163
    .line 164
    iget-object v3, v1, Landroidx/constraintlayout/core/state/Transition;->mToPixel:Landroidx/constraintlayout/core/state/CorePixelDp;

    .line 165
    .line 166
    .line 167
    invoke-interface {v3, v14}, Landroidx/constraintlayout/core/state/CorePixelDp;->toPixels(F)F

    .line 168
    move-result v14

    .line 169
    .line 170
    :cond_5
    aget-object v3, v12, v4

    .line 171
    .line 172
    .line 173
    invoke-virtual {v3, v15, v14}, Landroidx/constraintlayout/core/motion/utils/TypedBundle;->add(IF)V

    .line 174
    .line 175
    add-int/lit8 v4, v4, 0x1

    .line 176
    goto :goto_3

    .line 177
    .line 178
    :cond_6
    const/16 v19, 0x0

    .line 179
    goto :goto_5

    .line 180
    .line 181
    :cond_7
    const/16 v19, 0x0

    .line 182
    .line 183
    .line 184
    invoke-virtual {v0, v14}, Landroidx/constraintlayout/core/parser/CLContainer;->getFloatOrNaN(Ljava/lang/String;)F

    .line 185
    move-result v2

    .line 186
    .line 187
    .line 188
    invoke-static {v2}, Ljava/lang/Float;->isNaN(F)Z

    .line 189
    move-result v3

    .line 190
    .line 191
    if-nez v3, :cond_9

    .line 192
    .line 193
    if-eqz v16, :cond_8

    .line 194
    .line 195
    iget-object v3, v1, Landroidx/constraintlayout/core/state/Transition;->mToPixel:Landroidx/constraintlayout/core/state/CorePixelDp;

    .line 196
    .line 197
    .line 198
    invoke-interface {v3, v2}, Landroidx/constraintlayout/core/state/CorePixelDp;->toPixels(F)F

    .line 199
    move-result v2

    .line 200
    .line 201
    :cond_8
    move/from16 v3, v19

    .line 202
    .line 203
    :goto_4
    if-ge v3, v11, :cond_9

    .line 204
    .line 205
    aget-object v4, v12, v3

    .line 206
    .line 207
    .line 208
    invoke-virtual {v4, v15, v2}, Landroidx/constraintlayout/core/motion/utils/TypedBundle;->add(IF)V

    .line 209
    .line 210
    add-int/lit8 v3, v3, 0x1

    .line 211
    goto :goto_4

    .line 212
    .line 213
    :cond_9
    :goto_5
    add-int/lit8 v13, v13, 0x1

    .line 214
    .line 215
    move/from16 v4, v18

    .line 216
    .line 217
    const/16 v2, 0x9

    .line 218
    goto :goto_1

    .line 219
    .line 220
    :cond_a
    move/from16 v18, v4

    .line 221
    .line 222
    const/16 v19, 0x0

    .line 223
    .line 224
    const-string v2, "custom"

    .line 225
    .line 226
    .line 227
    invoke-virtual {v0, v2}, Landroidx/constraintlayout/core/parser/CLContainer;->getOrNull(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLElement;

    .line 228
    move-result-object v2

    .line 229
    .line 230
    if-eqz v2, :cond_11

    .line 231
    .line 232
    instance-of v4, v2, Landroidx/constraintlayout/core/parser/CLObject;

    .line 233
    .line 234
    if-eqz v4, :cond_11

    .line 235
    .line 236
    check-cast v2, Landroidx/constraintlayout/core/parser/CLObject;

    .line 237
    .line 238
    .line 239
    invoke-virtual {v2}, Landroidx/constraintlayout/core/parser/CLContainer;->size()I

    .line 240
    move-result v4

    .line 241
    .line 242
    .line 243
    invoke-virtual {v6}, Landroidx/constraintlayout/core/parser/CLContainer;->size()I

    .line 244
    move-result v8

    .line 245
    const/4 v9, 0x2

    .line 246
    .line 247
    new-array v9, v9, [I

    .line 248
    .line 249
    aput v4, v9, v18

    .line 250
    .line 251
    aput v8, v9, v19

    .line 252
    .line 253
    const-class v8, Landroidx/constraintlayout/core/motion/CustomVariable;

    .line 254
    .line 255
    .line 256
    invoke-static {v8, v9}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    .line 257
    move-result-object v8

    .line 258
    .line 259
    check-cast v8, [[Landroidx/constraintlayout/core/motion/CustomVariable;

    .line 260
    .line 261
    move/from16 v9, v19

    .line 262
    .line 263
    :goto_6
    if-ge v9, v4, :cond_12

    .line 264
    .line 265
    .line 266
    invoke-virtual {v2, v9}, Landroidx/constraintlayout/core/parser/CLContainer;->get(I)Landroidx/constraintlayout/core/parser/CLElement;

    .line 267
    move-result-object v10

    .line 268
    .line 269
    check-cast v10, Landroidx/constraintlayout/core/parser/CLKey;

    .line 270
    .line 271
    .line 272
    invoke-virtual {v10}, Landroidx/constraintlayout/core/parser/CLElement;->content()Ljava/lang/String;

    .line 273
    move-result-object v13

    .line 274
    .line 275
    .line 276
    invoke-virtual {v10}, Landroidx/constraintlayout/core/parser/CLKey;->getValue()Landroidx/constraintlayout/core/parser/CLElement;

    .line 277
    move-result-object v14

    .line 278
    .line 279
    instance-of v14, v14, Landroidx/constraintlayout/core/parser/CLArray;

    .line 280
    .line 281
    const-wide/16 v16, -0x1

    .line 282
    .line 283
    const/16 v3, 0x385

    .line 284
    .line 285
    if-eqz v14, :cond_f

    .line 286
    .line 287
    .line 288
    invoke-virtual {v10}, Landroidx/constraintlayout/core/parser/CLKey;->getValue()Landroidx/constraintlayout/core/parser/CLElement;

    .line 289
    move-result-object v10

    .line 290
    .line 291
    check-cast v10, Landroidx/constraintlayout/core/parser/CLArray;

    .line 292
    .line 293
    .line 294
    invoke-virtual {v10}, Landroidx/constraintlayout/core/parser/CLContainer;->size()I

    .line 295
    move-result v14

    .line 296
    .line 297
    if-ne v14, v11, :cond_b

    .line 298
    .line 299
    if-lez v14, :cond_b

    .line 300
    .line 301
    move/from16 v14, v19

    .line 302
    .line 303
    .line 304
    invoke-virtual {v10, v14}, Landroidx/constraintlayout/core/parser/CLContainer;->get(I)Landroidx/constraintlayout/core/parser/CLElement;

    .line 305
    move-result-object v15

    .line 306
    .line 307
    instance-of v15, v15, Landroidx/constraintlayout/core/parser/CLNumber;

    .line 308
    .line 309
    if-eqz v15, :cond_c

    .line 310
    move v15, v14

    .line 311
    .line 312
    :goto_7
    if-ge v15, v11, :cond_b

    .line 313
    .line 314
    aget-object v16, v8, v15

    .line 315
    .line 316
    new-instance v14, Landroidx/constraintlayout/core/motion/CustomVariable;

    .line 317
    .line 318
    .line 319
    invoke-virtual {v10, v15}, Landroidx/constraintlayout/core/parser/CLContainer;->get(I)Landroidx/constraintlayout/core/parser/CLElement;

    .line 320
    move-result-object v17

    .line 321
    .line 322
    move-object/from16 v20, v2

    .line 323
    .line 324
    .line 325
    invoke-virtual/range {v17 .. v17}, Landroidx/constraintlayout/core/parser/CLElement;->getFloat()F

    .line 326
    move-result v2

    .line 327
    .line 328
    .line 329
    invoke-direct {v14, v13, v3, v2}, Landroidx/constraintlayout/core/motion/CustomVariable;-><init>(Ljava/lang/String;IF)V

    .line 330
    .line 331
    aput-object v14, v16, v9

    .line 332
    .line 333
    add-int/lit8 v15, v15, 0x1

    .line 334
    .line 335
    move-object/from16 v2, v20

    .line 336
    const/4 v14, 0x0

    .line 337
    goto :goto_7

    .line 338
    .line 339
    :cond_b
    move-object/from16 v20, v2

    .line 340
    goto :goto_a

    .line 341
    .line 342
    :cond_c
    move-object/from16 v20, v2

    .line 343
    const/4 v2, 0x0

    .line 344
    .line 345
    :goto_8
    if-ge v2, v11, :cond_e

    .line 346
    .line 347
    .line 348
    invoke-virtual {v10, v2}, Landroidx/constraintlayout/core/parser/CLContainer;->get(I)Landroidx/constraintlayout/core/parser/CLElement;

    .line 349
    move-result-object v3

    .line 350
    .line 351
    .line 352
    invoke-virtual {v3}, Landroidx/constraintlayout/core/parser/CLElement;->content()Ljava/lang/String;

    .line 353
    move-result-object v3

    .line 354
    .line 355
    .line 356
    invoke-static {v3}, Landroidx/constraintlayout/core/state/ConstraintSetParser;->parseColorString(Ljava/lang/String;)J

    .line 357
    move-result-wide v14

    .line 358
    .line 359
    cmp-long v3, v14, v16

    .line 360
    .line 361
    if-eqz v3, :cond_d

    .line 362
    .line 363
    aget-object v3, v8, v2

    .line 364
    .line 365
    move/from16 v21, v2

    .line 366
    .line 367
    new-instance v2, Landroidx/constraintlayout/core/motion/CustomVariable;

    .line 368
    long-to-int v14, v14

    .line 369
    .line 370
    const/16 v15, 0x386

    .line 371
    .line 372
    .line 373
    invoke-direct {v2, v13, v15, v14}, Landroidx/constraintlayout/core/motion/CustomVariable;-><init>(Ljava/lang/String;II)V

    .line 374
    .line 375
    aput-object v2, v3, v9

    .line 376
    goto :goto_9

    .line 377
    .line 378
    :cond_d
    move/from16 v21, v2

    .line 379
    .line 380
    :goto_9
    add-int/lit8 v2, v21, 0x1

    .line 381
    goto :goto_8

    .line 382
    .line 383
    :cond_e
    :goto_a
    move/from16 v16, v4

    .line 384
    goto :goto_d

    .line 385
    .line 386
    :cond_f
    move-object/from16 v20, v2

    .line 387
    .line 388
    .line 389
    invoke-virtual {v10}, Landroidx/constraintlayout/core/parser/CLKey;->getValue()Landroidx/constraintlayout/core/parser/CLElement;

    .line 390
    move-result-object v2

    .line 391
    .line 392
    instance-of v10, v2, Landroidx/constraintlayout/core/parser/CLNumber;

    .line 393
    .line 394
    if-eqz v10, :cond_10

    .line 395
    .line 396
    .line 397
    invoke-virtual {v2}, Landroidx/constraintlayout/core/parser/CLElement;->getFloat()F

    .line 398
    move-result v2

    .line 399
    const/4 v10, 0x0

    .line 400
    .line 401
    :goto_b
    if-ge v10, v11, :cond_e

    .line 402
    .line 403
    aget-object v14, v8, v10

    .line 404
    .line 405
    new-instance v15, Landroidx/constraintlayout/core/motion/CustomVariable;

    .line 406
    .line 407
    .line 408
    invoke-direct {v15, v13, v3, v2}, Landroidx/constraintlayout/core/motion/CustomVariable;-><init>(Ljava/lang/String;IF)V

    .line 409
    .line 410
    aput-object v15, v14, v9

    .line 411
    .line 412
    add-int/lit8 v10, v10, 0x1

    .line 413
    goto :goto_b

    .line 414
    .line 415
    .line 416
    :cond_10
    invoke-virtual {v2}, Landroidx/constraintlayout/core/parser/CLElement;->content()Ljava/lang/String;

    .line 417
    move-result-object v2

    .line 418
    .line 419
    .line 420
    invoke-static {v2}, Landroidx/constraintlayout/core/state/ConstraintSetParser;->parseColorString(Ljava/lang/String;)J

    .line 421
    move-result-wide v2

    .line 422
    .line 423
    cmp-long v10, v2, v16

    .line 424
    .line 425
    if-eqz v10, :cond_e

    .line 426
    const/4 v10, 0x0

    .line 427
    .line 428
    :goto_c
    if-ge v10, v11, :cond_e

    .line 429
    .line 430
    aget-object v14, v8, v10

    .line 431
    .line 432
    new-instance v15, Landroidx/constraintlayout/core/motion/CustomVariable;

    .line 433
    .line 434
    move/from16 v16, v4

    .line 435
    long-to-int v4, v2

    .line 436
    .line 437
    move-wide/from16 v21, v2

    .line 438
    .line 439
    const/16 v2, 0x386

    .line 440
    .line 441
    .line 442
    invoke-direct {v15, v13, v2, v4}, Landroidx/constraintlayout/core/motion/CustomVariable;-><init>(Ljava/lang/String;II)V

    .line 443
    .line 444
    aput-object v15, v14, v9

    .line 445
    .line 446
    add-int/lit8 v10, v10, 0x1

    .line 447
    .line 448
    move/from16 v4, v16

    .line 449
    .line 450
    move-wide/from16 v2, v21

    .line 451
    goto :goto_c

    .line 452
    .line 453
    :goto_d
    add-int/lit8 v9, v9, 0x1

    .line 454
    .line 455
    move/from16 v4, v16

    .line 456
    .line 457
    move-object/from16 v2, v20

    .line 458
    .line 459
    const/16 v19, 0x0

    .line 460
    .line 461
    goto/16 :goto_6

    .line 462
    :cond_11
    const/4 v8, 0x0

    .line 463
    .line 464
    :cond_12
    const-string v2, "curveFit"

    .line 465
    .line 466
    .line 467
    invoke-virtual {v0, v2}, Landroidx/constraintlayout/core/parser/CLContainer;->getStringOrNull(Ljava/lang/String;)Ljava/lang/String;

    .line 468
    move-result-object v0

    .line 469
    const/4 v2, 0x0

    .line 470
    .line 471
    .line 472
    :goto_e
    invoke-virtual {v5}, Landroidx/constraintlayout/core/parser/CLContainer;->size()I

    .line 473
    move-result v3

    .line 474
    .line 475
    if-ge v2, v3, :cond_16

    .line 476
    const/4 v3, 0x0

    .line 477
    .line 478
    :goto_f
    if-ge v3, v11, :cond_15

    .line 479
    .line 480
    .line 481
    invoke-virtual {v5, v2}, Landroidx/constraintlayout/core/parser/CLContainer;->getString(I)Ljava/lang/String;

    .line 482
    move-result-object v4

    .line 483
    .line 484
    aget-object v9, v12, v3

    .line 485
    .line 486
    if-eqz v0, :cond_13

    .line 487
    .line 488
    .line 489
    const-string/jumbo v10, "spline"

    .line 490
    .line 491
    .line 492
    const-string/jumbo v13, "linear"

    .line 493
    .line 494
    .line 495
    filled-new-array {v10, v13}, [Ljava/lang/String;

    .line 496
    move-result-object v10

    .line 497
    .line 498
    .line 499
    invoke-static {v0, v10}, Landroidx/constraintlayout/core/state/TransitionParser;->map(Ljava/lang/String;[Ljava/lang/String;)I

    .line 500
    move-result v10

    .line 501
    .line 502
    const/16 v13, 0x1fc

    .line 503
    .line 504
    .line 505
    invoke-virtual {v9, v13, v10}, Landroidx/constraintlayout/core/motion/utils/TypedBundle;->add(II)V

    .line 506
    .line 507
    :cond_13
    const/16 v10, 0x1f5

    .line 508
    .line 509
    .line 510
    invoke-virtual {v9, v10, v7}, Landroidx/constraintlayout/core/motion/utils/TypedBundle;->addIfNotNull(ILjava/lang/String;)V

    .line 511
    .line 512
    .line 513
    invoke-virtual {v6, v3}, Landroidx/constraintlayout/core/parser/CLContainer;->getInt(I)I

    .line 514
    move-result v10

    .line 515
    .line 516
    const/16 v13, 0x64

    .line 517
    .line 518
    .line 519
    invoke-virtual {v9, v13, v10}, Landroidx/constraintlayout/core/motion/utils/TypedBundle;->add(II)V

    .line 520
    .line 521
    if-eqz v8, :cond_14

    .line 522
    .line 523
    aget-object v10, v8, v3

    .line 524
    goto :goto_10

    .line 525
    :cond_14
    const/4 v10, 0x0

    .line 526
    .line 527
    .line 528
    :goto_10
    invoke-virtual {v1, v4, v9, v10}, Landroidx/constraintlayout/core/state/Transition;->addKeyAttribute(Ljava/lang/String;Landroidx/constraintlayout/core/motion/utils/TypedBundle;[Landroidx/constraintlayout/core/motion/CustomVariable;)V

    .line 529
    .line 530
    add-int/lit8 v3, v3, 0x1

    .line 531
    goto :goto_f

    .line 532
    .line 533
    :cond_15
    add-int/lit8 v2, v2, 0x1

    .line 534
    goto :goto_e

    .line 535
    :cond_16
    :goto_11
    return-void

    .line 536
    nop

    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    :array_0
    .array-data 4
        0x137
        0x138
        0x130
        0x131
        0x132
        0x134
        0x135
        0x136
        0x12f
    .end array-data

    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    :array_1
    .array-data 1
        0x0t
        0x0t
        0x1t
        0x1t
        0x1t
        0x0t
        0x0t
        0x0t
        0x0t
    .end array-data
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
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
.end method

.method private static parseKeyCycle(Landroidx/constraintlayout/core/parser/CLObject;Landroidx/constraintlayout/core/state/Transition;)V
    .locals 20
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/constraintlayout/core/parser/CLParsingException;
        }
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v1, p1

    .line 5
    .line 6
    .line 7
    const-string/jumbo v2, "target"

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v2}, Landroidx/constraintlayout/core/parser/CLContainer;->getArray(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLArray;

    .line 11
    move-result-object v2

    .line 12
    .line 13
    const-string v3, "frames"

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v3}, Landroidx/constraintlayout/core/parser/CLContainer;->getArray(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLArray;

    .line 17
    move-result-object v3

    .line 18
    .line 19
    .line 20
    const-string/jumbo v4, "transitionEasing"

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v4}, Landroidx/constraintlayout/core/parser/CLContainer;->getStringOrNull(Ljava/lang/String;)Ljava/lang/String;

    .line 24
    move-result-object v4

    .line 25
    .line 26
    .line 27
    const-string/jumbo v15, "offset"

    .line 28
    .line 29
    .line 30
    const-string/jumbo v16, "phase"

    .line 31
    .line 32
    .line 33
    const-string/jumbo v5, "scaleX"

    .line 34
    .line 35
    .line 36
    const-string/jumbo v6, "scaleY"

    .line 37
    .line 38
    .line 39
    const-string/jumbo v7, "translationX"

    .line 40
    .line 41
    .line 42
    const-string/jumbo v8, "translationY"

    .line 43
    .line 44
    .line 45
    const-string/jumbo v9, "translationZ"

    .line 46
    .line 47
    .line 48
    const-string/jumbo v10, "rotationX"

    .line 49
    .line 50
    .line 51
    const-string/jumbo v11, "rotationY"

    .line 52
    .line 53
    .line 54
    const-string/jumbo v12, "rotationZ"

    .line 55
    .line 56
    const-string v13, "alpha"

    .line 57
    .line 58
    .line 59
    const-string/jumbo v14, "period"

    .line 60
    .line 61
    .line 62
    filled-new-array/range {v5 .. v16}, [Ljava/lang/String;

    .line 63
    move-result-object v5

    .line 64
    .line 65
    const/16 v6, 0xc

    .line 66
    .line 67
    new-array v7, v6, [I

    .line 68
    .line 69
    .line 70
    fill-array-data v7, :array_0

    .line 71
    const/4 v10, 0x1

    .line 72
    .line 73
    new-array v11, v6, [I

    .line 74
    .line 75
    .line 76
    fill-array-data v11, :array_1

    .line 77
    .line 78
    .line 79
    invoke-virtual {v3}, Landroidx/constraintlayout/core/parser/CLContainer;->size()I

    .line 80
    move-result v12

    .line 81
    .line 82
    new-array v13, v12, [Landroidx/constraintlayout/core/motion/utils/TypedBundle;

    .line 83
    const/4 v14, 0x0

    .line 84
    .line 85
    :goto_0
    if-ge v14, v12, :cond_0

    .line 86
    .line 87
    new-instance v15, Landroidx/constraintlayout/core/motion/utils/TypedBundle;

    .line 88
    .line 89
    .line 90
    invoke-direct {v15}, Landroidx/constraintlayout/core/motion/utils/TypedBundle;-><init>()V

    .line 91
    .line 92
    aput-object v15, v13, v14

    .line 93
    add-int/2addr v14, v10

    .line 94
    goto :goto_0

    .line 95
    :cond_0
    const/4 v14, 0x0

    .line 96
    const/4 v15, 0x0

    .line 97
    .line 98
    :goto_1
    if-ge v14, v6, :cond_2

    .line 99
    .line 100
    aget-object v9, v5, v14

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0, v9}, Landroidx/constraintlayout/core/parser/CLContainer;->has(Ljava/lang/String;)Z

    .line 104
    move-result v9

    .line 105
    .line 106
    if-eqz v9, :cond_1

    .line 107
    .line 108
    aget v9, v11, v14

    .line 109
    .line 110
    if-ne v9, v10, :cond_1

    .line 111
    move v15, v10

    .line 112
    :cond_1
    add-int/2addr v14, v10

    .line 113
    goto :goto_1

    .line 114
    :cond_2
    const/4 v9, 0x0

    .line 115
    .line 116
    :goto_2
    if-ge v9, v6, :cond_d

    .line 117
    .line 118
    aget-object v14, v5, v9

    .line 119
    .line 120
    aget v6, v7, v9

    .line 121
    .line 122
    aget v8, v11, v9

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0, v14}, Landroidx/constraintlayout/core/parser/CLContainer;->getArrayOrNull(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLArray;

    .line 126
    move-result-object v10

    .line 127
    .line 128
    move-object/from16 v18, v5

    .line 129
    .line 130
    if-eqz v10, :cond_4

    .line 131
    .line 132
    .line 133
    invoke-virtual {v10}, Landroidx/constraintlayout/core/parser/CLContainer;->size()I

    .line 134
    move-result v5

    .line 135
    .line 136
    if-ne v5, v12, :cond_3

    .line 137
    goto :goto_3

    .line 138
    .line 139
    :cond_3
    new-instance v1, Landroidx/constraintlayout/core/parser/CLParsingException;

    .line 140
    .line 141
    const-string v2, "incorrect size for $attrName array, not matching targets array!"

    .line 142
    .line 143
    .line 144
    invoke-direct {v1, v2, v0}, Landroidx/constraintlayout/core/parser/CLParsingException;-><init>(Ljava/lang/String;Landroidx/constraintlayout/core/parser/CLElement;)V

    .line 145
    throw v1

    .line 146
    .line 147
    :cond_4
    :goto_3
    if-eqz v10, :cond_9

    .line 148
    const/4 v5, 0x0

    .line 149
    .line 150
    :goto_4
    if-ge v5, v12, :cond_7

    .line 151
    .line 152
    .line 153
    invoke-virtual {v10, v5}, Landroidx/constraintlayout/core/parser/CLContainer;->getFloat(I)F

    .line 154
    move-result v14

    .line 155
    .line 156
    move/from16 v19, v5

    .line 157
    const/4 v5, 0x1

    .line 158
    .line 159
    if-ne v8, v5, :cond_5

    .line 160
    .line 161
    iget-object v5, v1, Landroidx/constraintlayout/core/state/Transition;->mToPixel:Landroidx/constraintlayout/core/state/CorePixelDp;

    .line 162
    .line 163
    .line 164
    invoke-interface {v5, v14}, Landroidx/constraintlayout/core/state/CorePixelDp;->toPixels(F)F

    .line 165
    move-result v14

    .line 166
    goto :goto_5

    .line 167
    :cond_5
    const/4 v5, 0x2

    .line 168
    .line 169
    if-ne v8, v5, :cond_6

    .line 170
    .line 171
    if-eqz v15, :cond_6

    .line 172
    .line 173
    iget-object v5, v1, Landroidx/constraintlayout/core/state/Transition;->mToPixel:Landroidx/constraintlayout/core/state/CorePixelDp;

    .line 174
    .line 175
    .line 176
    invoke-interface {v5, v14}, Landroidx/constraintlayout/core/state/CorePixelDp;->toPixels(F)F

    .line 177
    move-result v14

    .line 178
    .line 179
    :cond_6
    :goto_5
    aget-object v5, v13, v19

    .line 180
    .line 181
    .line 182
    invoke-virtual {v5, v6, v14}, Landroidx/constraintlayout/core/motion/utils/TypedBundle;->add(IF)V

    .line 183
    const/4 v5, 0x1

    .line 184
    .line 185
    add-int/lit8 v14, v19, 0x1

    .line 186
    move v5, v14

    .line 187
    goto :goto_4

    .line 188
    :cond_7
    const/4 v5, 0x2

    .line 189
    .line 190
    :cond_8
    const/16 v17, 0x1

    .line 191
    goto :goto_8

    .line 192
    :cond_9
    const/4 v5, 0x1

    .line 193
    .line 194
    .line 195
    invoke-virtual {v0, v14}, Landroidx/constraintlayout/core/parser/CLContainer;->getFloatOrNaN(Ljava/lang/String;)F

    .line 196
    move-result v10

    .line 197
    .line 198
    .line 199
    invoke-static {v10}, Ljava/lang/Float;->isNaN(F)Z

    .line 200
    move-result v14

    .line 201
    .line 202
    if-nez v14, :cond_c

    .line 203
    .line 204
    if-ne v8, v5, :cond_a

    .line 205
    .line 206
    iget-object v5, v1, Landroidx/constraintlayout/core/state/Transition;->mToPixel:Landroidx/constraintlayout/core/state/CorePixelDp;

    .line 207
    .line 208
    .line 209
    invoke-interface {v5, v10}, Landroidx/constraintlayout/core/state/CorePixelDp;->toPixels(F)F

    .line 210
    move-result v10

    .line 211
    const/4 v5, 0x2

    .line 212
    goto :goto_6

    .line 213
    :cond_a
    const/4 v5, 0x2

    .line 214
    .line 215
    if-ne v8, v5, :cond_b

    .line 216
    .line 217
    if-eqz v15, :cond_b

    .line 218
    .line 219
    iget-object v8, v1, Landroidx/constraintlayout/core/state/Transition;->mToPixel:Landroidx/constraintlayout/core/state/CorePixelDp;

    .line 220
    .line 221
    .line 222
    invoke-interface {v8, v10}, Landroidx/constraintlayout/core/state/CorePixelDp;->toPixels(F)F

    .line 223
    move-result v10

    .line 224
    :cond_b
    :goto_6
    const/4 v8, 0x0

    .line 225
    .line 226
    :goto_7
    if-ge v8, v12, :cond_8

    .line 227
    .line 228
    aget-object v14, v13, v8

    .line 229
    .line 230
    .line 231
    invoke-virtual {v14, v6, v10}, Landroidx/constraintlayout/core/motion/utils/TypedBundle;->add(IF)V

    .line 232
    .line 233
    const/16 v17, 0x1

    .line 234
    .line 235
    add-int/lit8 v8, v8, 0x1

    .line 236
    goto :goto_7

    .line 237
    .line 238
    :cond_c
    move/from16 v17, v5

    .line 239
    const/4 v5, 0x2

    .line 240
    .line 241
    :goto_8
    add-int/lit8 v9, v9, 0x1

    .line 242
    .line 243
    move-object/from16 v5, v18

    .line 244
    .line 245
    const/16 v6, 0xc

    .line 246
    const/4 v10, 0x1

    .line 247
    .line 248
    goto/16 :goto_2

    .line 249
    .line 250
    :cond_d
    const-string v5, "curveFit"

    .line 251
    .line 252
    .line 253
    invoke-virtual {v0, v5}, Landroidx/constraintlayout/core/parser/CLContainer;->getStringOrNull(Ljava/lang/String;)Ljava/lang/String;

    .line 254
    move-result-object v5

    .line 255
    .line 256
    const-string v6, "easing"

    .line 257
    .line 258
    .line 259
    invoke-virtual {v0, v6}, Landroidx/constraintlayout/core/parser/CLContainer;->getStringOrNull(Ljava/lang/String;)Ljava/lang/String;

    .line 260
    move-result-object v6

    .line 261
    .line 262
    .line 263
    const-string/jumbo v7, "waveShape"

    .line 264
    .line 265
    .line 266
    invoke-virtual {v0, v7}, Landroidx/constraintlayout/core/parser/CLContainer;->getStringOrNull(Ljava/lang/String;)Ljava/lang/String;

    .line 267
    move-result-object v7

    .line 268
    .line 269
    const-string v8, "customWave"

    .line 270
    .line 271
    .line 272
    invoke-virtual {v0, v8}, Landroidx/constraintlayout/core/parser/CLContainer;->getStringOrNull(Ljava/lang/String;)Ljava/lang/String;

    .line 273
    move-result-object v0

    .line 274
    const/4 v8, 0x0

    .line 275
    .line 276
    .line 277
    :goto_9
    invoke-virtual {v2}, Landroidx/constraintlayout/core/parser/CLContainer;->size()I

    .line 278
    move-result v9

    .line 279
    .line 280
    if-ge v8, v9, :cond_15

    .line 281
    const/4 v9, 0x0

    .line 282
    .line 283
    :goto_a
    if-ge v9, v12, :cond_14

    .line 284
    .line 285
    .line 286
    invoke-virtual {v2, v8}, Landroidx/constraintlayout/core/parser/CLContainer;->getString(I)Ljava/lang/String;

    .line 287
    move-result-object v10

    .line 288
    .line 289
    aget-object v11, v13, v9

    .line 290
    .line 291
    if-eqz v5, :cond_10

    .line 292
    .line 293
    const/16 v14, 0x191

    .line 294
    .line 295
    .line 296
    const-string/jumbo v15, "linear"

    .line 297
    .line 298
    .line 299
    invoke-virtual {v5, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 300
    move-result v15

    .line 301
    .line 302
    if-nez v15, :cond_f

    .line 303
    .line 304
    .line 305
    const-string/jumbo v15, "spline"

    .line 306
    .line 307
    .line 308
    invoke-virtual {v5, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 309
    move-result v15

    .line 310
    .line 311
    if-nez v15, :cond_e

    .line 312
    goto :goto_b

    .line 313
    :cond_e
    const/4 v15, 0x0

    .line 314
    .line 315
    .line 316
    invoke-virtual {v11, v14, v15}, Landroidx/constraintlayout/core/motion/utils/TypedBundle;->add(II)V

    .line 317
    goto :goto_b

    .line 318
    :cond_f
    const/4 v15, 0x1

    .line 319
    .line 320
    .line 321
    invoke-virtual {v11, v14, v15}, Landroidx/constraintlayout/core/motion/utils/TypedBundle;->add(II)V

    .line 322
    .line 323
    :cond_10
    :goto_b
    const/16 v14, 0x1f5

    .line 324
    .line 325
    .line 326
    invoke-virtual {v11, v14, v4}, Landroidx/constraintlayout/core/motion/utils/TypedBundle;->addIfNotNull(ILjava/lang/String;)V

    .line 327
    .line 328
    if-eqz v6, :cond_11

    .line 329
    .line 330
    const/16 v14, 0x1a4

    .line 331
    .line 332
    .line 333
    invoke-virtual {v11, v14, v6}, Landroidx/constraintlayout/core/motion/utils/TypedBundle;->add(ILjava/lang/String;)V

    .line 334
    .line 335
    :cond_11
    if-eqz v7, :cond_12

    .line 336
    .line 337
    const/16 v14, 0x1a5

    .line 338
    .line 339
    .line 340
    invoke-virtual {v11, v14, v7}, Landroidx/constraintlayout/core/motion/utils/TypedBundle;->add(ILjava/lang/String;)V

    .line 341
    .line 342
    :cond_12
    if-eqz v0, :cond_13

    .line 343
    .line 344
    const/16 v14, 0x1a6

    .line 345
    .line 346
    .line 347
    invoke-virtual {v11, v14, v0}, Landroidx/constraintlayout/core/motion/utils/TypedBundle;->add(ILjava/lang/String;)V

    .line 348
    .line 349
    .line 350
    :cond_13
    invoke-virtual {v3, v9}, Landroidx/constraintlayout/core/parser/CLContainer;->getInt(I)I

    .line 351
    move-result v14

    .line 352
    .line 353
    const/16 v15, 0x64

    .line 354
    .line 355
    .line 356
    invoke-virtual {v11, v15, v14}, Landroidx/constraintlayout/core/motion/utils/TypedBundle;->add(II)V

    .line 357
    .line 358
    .line 359
    invoke-virtual {v1, v10, v11}, Landroidx/constraintlayout/core/state/Transition;->addKeyCycle(Ljava/lang/String;Landroidx/constraintlayout/core/motion/utils/TypedBundle;)V

    .line 360
    .line 361
    const/16 v17, 0x1

    .line 362
    .line 363
    add-int/lit8 v9, v9, 0x1

    .line 364
    goto :goto_a

    .line 365
    .line 366
    :cond_14
    const/16 v17, 0x1

    .line 367
    .line 368
    add-int/lit8 v8, v8, 0x1

    .line 369
    goto :goto_9

    .line 370
    :cond_15
    return-void

    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    :array_0
    .array-data 4
        0x137
        0x138
        0x130
        0x131
        0x132
        0x134
        0x135
        0x136
        0x193
        0x1a7
        0x1a8
        0x1a9
    .end array-data

    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    :array_1
    .array-data 4
        0x0
        0x0
        0x1
        0x1
        0x1
        0x0
        0x0
        0x0
        0x0
        0x0
        0x2
        0x0
    .end array-data
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
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
.end method

.method public static parseKeyFrames(Landroidx/constraintlayout/core/parser/CLObject;Landroidx/constraintlayout/core/state/Transition;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/constraintlayout/core/parser/CLParsingException;
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "KeyFrames"

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, v0}, Landroidx/constraintlayout/core/parser/CLContainer;->getObjectOrNull(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLObject;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    if-nez p0, :cond_0

    .line 9
    goto :goto_3

    .line 10
    .line 11
    :cond_0
    const-string v0, "KeyPositions"

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v0}, Landroidx/constraintlayout/core/parser/CLContainer;->getArrayOrNull(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLArray;

    .line 15
    move-result-object v0

    .line 16
    const/4 v1, 0x0

    .line 17
    .line 18
    if-eqz v0, :cond_2

    .line 19
    move v2, v1

    .line 20
    .line 21
    .line 22
    :goto_0
    invoke-virtual {v0}, Landroidx/constraintlayout/core/parser/CLContainer;->size()I

    .line 23
    move-result v3

    .line 24
    .line 25
    if-ge v2, v3, :cond_2

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v2}, Landroidx/constraintlayout/core/parser/CLContainer;->get(I)Landroidx/constraintlayout/core/parser/CLElement;

    .line 29
    move-result-object v3

    .line 30
    .line 31
    instance-of v4, v3, Landroidx/constraintlayout/core/parser/CLObject;

    .line 32
    .line 33
    if-eqz v4, :cond_1

    .line 34
    .line 35
    check-cast v3, Landroidx/constraintlayout/core/parser/CLObject;

    .line 36
    .line 37
    .line 38
    invoke-static {v3, p1}, Landroidx/constraintlayout/core/state/TransitionParser;->parseKeyPosition(Landroidx/constraintlayout/core/parser/CLObject;Landroidx/constraintlayout/core/state/Transition;)V

    .line 39
    .line 40
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 41
    goto :goto_0

    .line 42
    .line 43
    :cond_2
    const-string v0, "KeyAttributes"

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, v0}, Landroidx/constraintlayout/core/parser/CLContainer;->getArrayOrNull(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLArray;

    .line 47
    move-result-object v0

    .line 48
    .line 49
    if-eqz v0, :cond_4

    .line 50
    move v2, v1

    .line 51
    .line 52
    .line 53
    :goto_1
    invoke-virtual {v0}, Landroidx/constraintlayout/core/parser/CLContainer;->size()I

    .line 54
    move-result v3

    .line 55
    .line 56
    if-ge v2, v3, :cond_4

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, v2}, Landroidx/constraintlayout/core/parser/CLContainer;->get(I)Landroidx/constraintlayout/core/parser/CLElement;

    .line 60
    move-result-object v3

    .line 61
    .line 62
    instance-of v4, v3, Landroidx/constraintlayout/core/parser/CLObject;

    .line 63
    .line 64
    if-eqz v4, :cond_3

    .line 65
    .line 66
    check-cast v3, Landroidx/constraintlayout/core/parser/CLObject;

    .line 67
    .line 68
    .line 69
    invoke-static {v3, p1}, Landroidx/constraintlayout/core/state/TransitionParser;->parseKeyAttribute(Landroidx/constraintlayout/core/parser/CLObject;Landroidx/constraintlayout/core/state/Transition;)V

    .line 70
    .line 71
    :cond_3
    add-int/lit8 v2, v2, 0x1

    .line 72
    goto :goto_1

    .line 73
    .line 74
    :cond_4
    const-string v0, "KeyCycles"

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0, v0}, Landroidx/constraintlayout/core/parser/CLContainer;->getArrayOrNull(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLArray;

    .line 78
    move-result-object p0

    .line 79
    .line 80
    if-eqz p0, :cond_6

    .line 81
    .line 82
    .line 83
    :goto_2
    invoke-virtual {p0}, Landroidx/constraintlayout/core/parser/CLContainer;->size()I

    .line 84
    move-result v0

    .line 85
    .line 86
    if-ge v1, v0, :cond_6

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0, v1}, Landroidx/constraintlayout/core/parser/CLContainer;->get(I)Landroidx/constraintlayout/core/parser/CLElement;

    .line 90
    move-result-object v0

    .line 91
    .line 92
    instance-of v2, v0, Landroidx/constraintlayout/core/parser/CLObject;

    .line 93
    .line 94
    if-eqz v2, :cond_5

    .line 95
    .line 96
    check-cast v0, Landroidx/constraintlayout/core/parser/CLObject;

    .line 97
    .line 98
    .line 99
    invoke-static {v0, p1}, Landroidx/constraintlayout/core/state/TransitionParser;->parseKeyCycle(Landroidx/constraintlayout/core/parser/CLObject;Landroidx/constraintlayout/core/state/Transition;)V

    .line 100
    .line 101
    :cond_5
    add-int/lit8 v1, v1, 0x1

    .line 102
    goto :goto_2

    .line 103
    :cond_6
    :goto_3
    return-void
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

.method private static parseKeyPosition(Landroidx/constraintlayout/core/parser/CLObject;Landroidx/constraintlayout/core/state/Transition;)V
    .locals 21
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/constraintlayout/core/parser/CLParsingException;
        }
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    new-instance v1, Landroidx/constraintlayout/core/motion/utils/TypedBundle;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1}, Landroidx/constraintlayout/core/motion/utils/TypedBundle;-><init>()V

    .line 8
    .line 9
    .line 10
    const-string/jumbo v2, "target"

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v2}, Landroidx/constraintlayout/core/parser/CLContainer;->getArray(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLArray;

    .line 14
    move-result-object v2

    .line 15
    .line 16
    const-string v3, "frames"

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v3}, Landroidx/constraintlayout/core/parser/CLContainer;->getArray(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLArray;

    .line 20
    move-result-object v3

    .line 21
    .line 22
    .line 23
    const-string/jumbo v4, "percentX"

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v4}, Landroidx/constraintlayout/core/parser/CLContainer;->getArrayOrNull(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLArray;

    .line 27
    move-result-object v4

    .line 28
    .line 29
    .line 30
    const-string/jumbo v5, "percentY"

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v5}, Landroidx/constraintlayout/core/parser/CLContainer;->getArrayOrNull(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLArray;

    .line 34
    move-result-object v5

    .line 35
    .line 36
    .line 37
    const-string/jumbo v6, "percentWidth"

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v6}, Landroidx/constraintlayout/core/parser/CLContainer;->getArrayOrNull(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLArray;

    .line 41
    move-result-object v6

    .line 42
    .line 43
    .line 44
    const-string/jumbo v7, "percentHeight"

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v7}, Landroidx/constraintlayout/core/parser/CLContainer;->getArrayOrNull(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLArray;

    .line 48
    move-result-object v7

    .line 49
    .line 50
    .line 51
    const-string/jumbo v8, "pathMotionArc"

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, v8}, Landroidx/constraintlayout/core/parser/CLContainer;->getStringOrNull(Ljava/lang/String;)Ljava/lang/String;

    .line 55
    move-result-object v8

    .line 56
    .line 57
    .line 58
    const-string/jumbo v9, "transitionEasing"

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, v9}, Landroidx/constraintlayout/core/parser/CLContainer;->getStringOrNull(Ljava/lang/String;)Ljava/lang/String;

    .line 62
    move-result-object v9

    .line 63
    .line 64
    const-string v10, "curveFit"

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0, v10}, Landroidx/constraintlayout/core/parser/CLContainer;->getStringOrNull(Ljava/lang/String;)Ljava/lang/String;

    .line 68
    move-result-object v10

    .line 69
    .line 70
    .line 71
    const-string/jumbo v11, "type"

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0, v11}, Landroidx/constraintlayout/core/parser/CLContainer;->getStringOrNull(Ljava/lang/String;)Ljava/lang/String;

    .line 75
    move-result-object v0

    .line 76
    .line 77
    .line 78
    const-string/jumbo v11, "parentRelative"

    .line 79
    .line 80
    if-nez v0, :cond_0

    .line 81
    move-object v0, v11

    .line 82
    .line 83
    :cond_0
    if-eqz v4, :cond_1

    .line 84
    .line 85
    .line 86
    invoke-virtual {v3}, Landroidx/constraintlayout/core/parser/CLContainer;->size()I

    .line 87
    move-result v12

    .line 88
    .line 89
    .line 90
    invoke-virtual {v4}, Landroidx/constraintlayout/core/parser/CLContainer;->size()I

    .line 91
    move-result v13

    .line 92
    .line 93
    if-eq v12, v13, :cond_1

    .line 94
    .line 95
    goto/16 :goto_2

    .line 96
    .line 97
    :cond_1
    if-eqz v5, :cond_2

    .line 98
    .line 99
    .line 100
    invoke-virtual {v3}, Landroidx/constraintlayout/core/parser/CLContainer;->size()I

    .line 101
    move-result v12

    .line 102
    .line 103
    .line 104
    invoke-virtual {v5}, Landroidx/constraintlayout/core/parser/CLContainer;->size()I

    .line 105
    move-result v13

    .line 106
    .line 107
    if-eq v12, v13, :cond_2

    .line 108
    .line 109
    goto/16 :goto_2

    .line 110
    :cond_2
    const/4 v13, 0x0

    .line 111
    .line 112
    .line 113
    :goto_0
    invoke-virtual {v2}, Landroidx/constraintlayout/core/parser/CLContainer;->size()I

    .line 114
    move-result v14

    .line 115
    .line 116
    if-ge v13, v14, :cond_6

    .line 117
    .line 118
    .line 119
    invoke-virtual {v2, v13}, Landroidx/constraintlayout/core/parser/CLContainer;->getString(I)Ljava/lang/String;

    .line 120
    move-result-object v14

    .line 121
    .line 122
    const-string v15, "deltaRelative"

    .line 123
    .line 124
    .line 125
    const-string/jumbo v12, "pathRelative"

    .line 126
    .line 127
    .line 128
    filled-new-array {v15, v12, v11}, [Ljava/lang/String;

    .line 129
    move-result-object v12

    .line 130
    .line 131
    .line 132
    invoke-static {v0, v12}, Landroidx/constraintlayout/core/state/TransitionParser;->map(Ljava/lang/String;[Ljava/lang/String;)I

    .line 133
    move-result v12

    .line 134
    .line 135
    .line 136
    invoke-virtual {v1}, Landroidx/constraintlayout/core/motion/utils/TypedBundle;->clear()V

    .line 137
    .line 138
    const/16 v15, 0x1fe

    .line 139
    .line 140
    .line 141
    invoke-virtual {v1, v15, v12}, Landroidx/constraintlayout/core/motion/utils/TypedBundle;->add(II)V

    .line 142
    .line 143
    if-eqz v10, :cond_3

    .line 144
    .line 145
    .line 146
    const-string/jumbo v12, "spline"

    .line 147
    .line 148
    .line 149
    const-string/jumbo v15, "linear"

    .line 150
    .line 151
    .line 152
    filled-new-array {v12, v15}, [Ljava/lang/String;

    .line 153
    move-result-object v12

    .line 154
    .line 155
    const/16 v15, 0x1fc

    .line 156
    .line 157
    .line 158
    invoke-static {v1, v15, v10, v12}, Landroidx/constraintlayout/core/state/TransitionParser;->map(Landroidx/constraintlayout/core/motion/utils/TypedBundle;ILjava/lang/String;[Ljava/lang/String;)V

    .line 159
    .line 160
    :cond_3
    const/16 v12, 0x1f5

    .line 161
    .line 162
    .line 163
    invoke-virtual {v1, v12, v9}, Landroidx/constraintlayout/core/motion/utils/TypedBundle;->addIfNotNull(ILjava/lang/String;)V

    .line 164
    .line 165
    if-eqz v8, :cond_4

    .line 166
    .line 167
    const-string v19, "below"

    .line 168
    .line 169
    const-string v20, "above"

    .line 170
    .line 171
    .line 172
    const-string/jumbo v15, "none"

    .line 173
    .line 174
    .line 175
    const-string/jumbo v16, "startVertical"

    .line 176
    .line 177
    .line 178
    const-string/jumbo v17, "startHorizontal"

    .line 179
    .line 180
    const-string v18, "flip"

    .line 181
    .line 182
    .line 183
    filled-new-array/range {v15 .. v20}, [Ljava/lang/String;

    .line 184
    move-result-object v12

    .line 185
    .line 186
    const/16 v15, 0x1fd

    .line 187
    .line 188
    .line 189
    invoke-static {v1, v15, v8, v12}, Landroidx/constraintlayout/core/state/TransitionParser;->map(Landroidx/constraintlayout/core/motion/utils/TypedBundle;ILjava/lang/String;[Ljava/lang/String;)V

    .line 190
    :cond_4
    const/4 v12, 0x0

    .line 191
    .line 192
    .line 193
    :goto_1
    invoke-virtual {v3}, Landroidx/constraintlayout/core/parser/CLContainer;->size()I

    .line 194
    move-result v15

    .line 195
    .line 196
    if-ge v12, v15, :cond_5

    .line 197
    .line 198
    .line 199
    invoke-virtual {v3, v12}, Landroidx/constraintlayout/core/parser/CLContainer;->getInt(I)I

    .line 200
    move-result v15

    .line 201
    .line 202
    move-object/from16 v16, v0

    .line 203
    .line 204
    const/16 v0, 0x64

    .line 205
    .line 206
    .line 207
    invoke-virtual {v1, v0, v15}, Landroidx/constraintlayout/core/motion/utils/TypedBundle;->add(II)V

    .line 208
    .line 209
    const/16 v0, 0x1fa

    .line 210
    .line 211
    .line 212
    invoke-static {v1, v0, v4, v12}, Landroidx/constraintlayout/core/state/TransitionParser;->set(Landroidx/constraintlayout/core/motion/utils/TypedBundle;ILandroidx/constraintlayout/core/parser/CLArray;I)V

    .line 213
    .line 214
    const/16 v0, 0x1fb

    .line 215
    .line 216
    .line 217
    invoke-static {v1, v0, v5, v12}, Landroidx/constraintlayout/core/state/TransitionParser;->set(Landroidx/constraintlayout/core/motion/utils/TypedBundle;ILandroidx/constraintlayout/core/parser/CLArray;I)V

    .line 218
    .line 219
    const/16 v0, 0x1f7

    .line 220
    .line 221
    .line 222
    invoke-static {v1, v0, v6, v12}, Landroidx/constraintlayout/core/state/TransitionParser;->set(Landroidx/constraintlayout/core/motion/utils/TypedBundle;ILandroidx/constraintlayout/core/parser/CLArray;I)V

    .line 223
    .line 224
    const/16 v0, 0x1f8

    .line 225
    .line 226
    .line 227
    invoke-static {v1, v0, v7, v12}, Landroidx/constraintlayout/core/state/TransitionParser;->set(Landroidx/constraintlayout/core/motion/utils/TypedBundle;ILandroidx/constraintlayout/core/parser/CLArray;I)V

    .line 228
    .line 229
    move-object/from16 v0, p1

    .line 230
    .line 231
    .line 232
    invoke-virtual {v0, v14, v1}, Landroidx/constraintlayout/core/state/Transition;->addKeyPosition(Ljava/lang/String;Landroidx/constraintlayout/core/motion/utils/TypedBundle;)V

    .line 233
    .line 234
    add-int/lit8 v12, v12, 0x1

    .line 235
    .line 236
    move-object/from16 v0, v16

    .line 237
    goto :goto_1

    .line 238
    .line 239
    :cond_5
    move-object/from16 v16, v0

    .line 240
    .line 241
    move-object/from16 v0, p1

    .line 242
    .line 243
    add-int/lit8 v13, v13, 0x1

    .line 244
    .line 245
    move-object/from16 v0, v16

    .line 246
    .line 247
    goto/16 :goto_0

    .line 248
    :cond_6
    :goto_2
    return-void
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
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
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
.end method

.method private static parseOnSwipe(Landroidx/constraintlayout/core/parser/CLContainer;Landroidx/constraintlayout/core/state/Transition;)V
    .locals 17

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    const-string v1, "anchor"

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroidx/constraintlayout/core/parser/CLContainer;->getStringOrNull(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    .line 11
    const-string/jumbo v2, "side"

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v2}, Landroidx/constraintlayout/core/parser/CLContainer;->getStringOrNull(Ljava/lang/String;)Ljava/lang/String;

    .line 15
    move-result-object v2

    .line 16
    .line 17
    sget-object v3, Landroidx/constraintlayout/core/state/Transition$OnSwipe;->SIDES:[Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    invoke-static {v2, v3}, Landroidx/constraintlayout/core/state/TransitionParser;->map(Ljava/lang/String;[Ljava/lang/String;)I

    .line 21
    move-result v2

    .line 22
    .line 23
    const-string v3, "direction"

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v3}, Landroidx/constraintlayout/core/parser/CLContainer;->getStringOrNull(Ljava/lang/String;)Ljava/lang/String;

    .line 27
    move-result-object v3

    .line 28
    .line 29
    sget-object v4, Landroidx/constraintlayout/core/state/Transition$OnSwipe;->DIRECTIONS:[Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    invoke-static {v3, v4}, Landroidx/constraintlayout/core/state/TransitionParser;->map(Ljava/lang/String;[Ljava/lang/String;)I

    .line 33
    move-result v3

    .line 34
    .line 35
    .line 36
    const-string/jumbo v4, "scale"

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v4}, Landroidx/constraintlayout/core/parser/CLContainer;->getFloatOrNaN(Ljava/lang/String;)F

    .line 40
    move-result v4

    .line 41
    .line 42
    .line 43
    const-string/jumbo v5, "threshold"

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, v5}, Landroidx/constraintlayout/core/parser/CLContainer;->getFloatOrNaN(Ljava/lang/String;)F

    .line 47
    move-result v5

    .line 48
    .line 49
    .line 50
    const-string/jumbo v6, "maxVelocity"

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, v6}, Landroidx/constraintlayout/core/parser/CLContainer;->getFloatOrNaN(Ljava/lang/String;)F

    .line 54
    move-result v6

    .line 55
    .line 56
    .line 57
    const-string/jumbo v7, "maxAccel"

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, v7}, Landroidx/constraintlayout/core/parser/CLContainer;->getFloatOrNaN(Ljava/lang/String;)F

    .line 61
    move-result v7

    .line 62
    .line 63
    .line 64
    const-string/jumbo v8, "limitBounds"

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0, v8}, Landroidx/constraintlayout/core/parser/CLContainer;->getStringOrNull(Ljava/lang/String;)Ljava/lang/String;

    .line 68
    move-result-object v8

    .line 69
    .line 70
    .line 71
    const-string/jumbo v9, "mode"

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0, v9}, Landroidx/constraintlayout/core/parser/CLContainer;->getStringOrNull(Ljava/lang/String;)Ljava/lang/String;

    .line 75
    move-result-object v9

    .line 76
    .line 77
    sget-object v10, Landroidx/constraintlayout/core/state/Transition$OnSwipe;->MODE:[Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    invoke-static {v9, v10}, Landroidx/constraintlayout/core/state/TransitionParser;->map(Ljava/lang/String;[Ljava/lang/String;)I

    .line 81
    move-result v9

    .line 82
    .line 83
    .line 84
    const-string/jumbo v10, "touchUp"

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0, v10}, Landroidx/constraintlayout/core/parser/CLContainer;->getStringOrNull(Ljava/lang/String;)Ljava/lang/String;

    .line 88
    move-result-object v10

    .line 89
    .line 90
    sget-object v11, Landroidx/constraintlayout/core/state/Transition$OnSwipe;->TOUCH_UP:[Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    invoke-static {v10, v11}, Landroidx/constraintlayout/core/state/TransitionParser;->map(Ljava/lang/String;[Ljava/lang/String;)I

    .line 94
    move-result v10

    .line 95
    .line 96
    .line 97
    const-string/jumbo v11, "springMass"

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0, v11}, Landroidx/constraintlayout/core/parser/CLContainer;->getFloatOrNaN(Ljava/lang/String;)F

    .line 101
    move-result v11

    .line 102
    .line 103
    .line 104
    const-string/jumbo v12, "springStiffness"

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0, v12}, Landroidx/constraintlayout/core/parser/CLContainer;->getFloatOrNaN(Ljava/lang/String;)F

    .line 108
    move-result v12

    .line 109
    .line 110
    .line 111
    const-string/jumbo v13, "springDamping"

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0, v13}, Landroidx/constraintlayout/core/parser/CLContainer;->getFloatOrNaN(Ljava/lang/String;)F

    .line 115
    move-result v13

    .line 116
    .line 117
    .line 118
    const-string/jumbo v14, "stopThreshold"

    .line 119
    .line 120
    .line 121
    invoke-virtual {v0, v14}, Landroidx/constraintlayout/core/parser/CLContainer;->getFloatOrNaN(Ljava/lang/String;)F

    .line 122
    move-result v14

    .line 123
    .line 124
    .line 125
    const-string/jumbo v15, "springBoundary"

    .line 126
    .line 127
    .line 128
    invoke-virtual {v0, v15}, Landroidx/constraintlayout/core/parser/CLContainer;->getStringOrNull(Ljava/lang/String;)Ljava/lang/String;

    .line 129
    move-result-object v15

    .line 130
    .line 131
    move/from16 v16, v14

    .line 132
    .line 133
    sget-object v14, Landroidx/constraintlayout/core/state/Transition$OnSwipe;->BOUNDARY:[Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    invoke-static {v15, v14}, Landroidx/constraintlayout/core/state/TransitionParser;->map(Ljava/lang/String;[Ljava/lang/String;)I

    .line 137
    move-result v14

    .line 138
    .line 139
    const-string v15, "around"

    .line 140
    .line 141
    .line 142
    invoke-virtual {v0, v15}, Landroidx/constraintlayout/core/parser/CLContainer;->getStringOrNull(Ljava/lang/String;)Ljava/lang/String;

    .line 143
    move-result-object v0

    .line 144
    .line 145
    .line 146
    invoke-virtual/range {p1 .. p1}, Landroidx/constraintlayout/core/state/Transition;->createOnSwipe()Landroidx/constraintlayout/core/state/Transition$OnSwipe;

    .line 147
    move-result-object v15

    .line 148
    .line 149
    .line 150
    invoke-virtual {v15, v1}, Landroidx/constraintlayout/core/state/Transition$OnSwipe;->setAnchorId(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v15, v2}, Landroidx/constraintlayout/core/state/Transition$OnSwipe;->setAnchorSide(I)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v15, v3}, Landroidx/constraintlayout/core/state/Transition$OnSwipe;->setDragDirection(I)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v15, v4}, Landroidx/constraintlayout/core/state/Transition$OnSwipe;->setDragScale(F)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v15, v5}, Landroidx/constraintlayout/core/state/Transition$OnSwipe;->setDragThreshold(F)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v15, v6}, Landroidx/constraintlayout/core/state/Transition$OnSwipe;->setMaxVelocity(F)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v15, v7}, Landroidx/constraintlayout/core/state/Transition$OnSwipe;->setMaxAcceleration(F)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v15, v8}, Landroidx/constraintlayout/core/state/Transition$OnSwipe;->setLimitBoundsTo(Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v15, v9}, Landroidx/constraintlayout/core/state/Transition$OnSwipe;->setAutoCompleteMode(I)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v15, v10}, Landroidx/constraintlayout/core/state/Transition$OnSwipe;->setOnTouchUp(I)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v15, v11}, Landroidx/constraintlayout/core/state/Transition$OnSwipe;->setSpringMass(F)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v15, v12}, Landroidx/constraintlayout/core/state/Transition$OnSwipe;->setSpringStiffness(F)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v15, v13}, Landroidx/constraintlayout/core/state/Transition$OnSwipe;->setSpringDamping(F)V

    .line 187
    .line 188
    move/from16 v1, v16

    .line 189
    .line 190
    .line 191
    invoke-virtual {v15, v1}, Landroidx/constraintlayout/core/state/Transition$OnSwipe;->setSpringStopThreshold(F)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v15, v14}, Landroidx/constraintlayout/core/state/Transition$OnSwipe;->setSpringBoundary(I)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v15, v0}, Landroidx/constraintlayout/core/state/Transition$OnSwipe;->setRotationCenterId(Ljava/lang/String;)V

    .line 198
    return-void
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
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
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
.end method

.method private static set(Landroidx/constraintlayout/core/motion/utils/TypedBundle;ILandroidx/constraintlayout/core/parser/CLArray;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/constraintlayout/core/parser/CLParsingException;
        }
    .end annotation

    .line 1
    .line 2
    if-eqz p2, :cond_0

    .line 3
    .line 4
    .line 5
    invoke-virtual {p2, p3}, Landroidx/constraintlayout/core/parser/CLContainer;->getFloat(I)F

    .line 6
    move-result p2

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, p1, p2}, Landroidx/constraintlayout/core/motion/utils/TypedBundle;->add(IF)V

    .line 10
    :cond_0
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
.end method
