.class public Lio/flutter/embedding/engine/systemchannels/TextInputChannel$Configuration$Autofill;
.super Ljava/lang/Object;
.source "TextInputChannel.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/embedding/engine/systemchannels/TextInputChannel$Configuration;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Autofill"
.end annotation


# instance fields
.field public final editState:Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextEditState;

.field public final hintText:Ljava/lang/String;

.field public final hints:[Ljava/lang/String;

.field public final uniqueIdentifier:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextEditState;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # [Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .param p4    # Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextEditState;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lio/flutter/embedding/engine/systemchannels/TextInputChannel$Configuration$Autofill;->uniqueIdentifier:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p2, p0, Lio/flutter/embedding/engine/systemchannels/TextInputChannel$Configuration$Autofill;->hints:[Ljava/lang/String;

    .line 8
    .line 9
    iput-object p3, p0, Lio/flutter/embedding/engine/systemchannels/TextInputChannel$Configuration$Autofill;->hintText:Ljava/lang/String;

    .line 10
    .line 11
    iput-object p4, p0, Lio/flutter/embedding/engine/systemchannels/TextInputChannel$Configuration$Autofill;->editState:Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextEditState;

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
.end method

.method public static fromJson(Lorg/json/JSONObject;)Lio/flutter/embedding/engine/systemchannels/TextInputChannel$Configuration$Autofill;
    .locals 6
    .param p0    # Lorg/json/JSONObject;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;,
            Ljava/lang/NoSuchFieldException;
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "uniqueIdentifier"

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    const-string v1, "hints"

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 12
    move-result-object v1

    .line 13
    .line 14
    const-string v2, "hintText"

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    .line 18
    move-result v3

    .line 19
    .line 20
    if-eqz v3, :cond_0

    .line 21
    const/4 v2, 0x0

    .line 22
    goto :goto_0

    .line 23
    .line 24
    .line 25
    :cond_0
    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 26
    move-result-object v2

    .line 27
    .line 28
    :goto_0
    const-string v3, "editingValue"

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, v3}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 32
    move-result-object p0

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    .line 36
    move-result v3

    .line 37
    .line 38
    new-array v3, v3, [Ljava/lang/String;

    .line 39
    const/4 v4, 0x0

    .line 40
    .line 41
    .line 42
    :goto_1
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    .line 43
    move-result v5

    .line 44
    .line 45
    if-ge v4, v5, :cond_1

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1, v4}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    .line 49
    move-result-object v5

    .line 50
    .line 51
    .line 52
    invoke-static {v5}, Lio/flutter/embedding/engine/systemchannels/TextInputChannel$Configuration$Autofill;->translateAutofillHint(Ljava/lang/String;)Ljava/lang/String;

    .line 53
    move-result-object v5

    .line 54
    .line 55
    aput-object v5, v3, v4

    .line 56
    .line 57
    add-int/lit8 v4, v4, 0x1

    .line 58
    goto :goto_1

    .line 59
    .line 60
    :cond_1
    new-instance v1, Lio/flutter/embedding/engine/systemchannels/TextInputChannel$Configuration$Autofill;

    .line 61
    .line 62
    .line 63
    invoke-static {p0}, Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextEditState;->fromJson(Lorg/json/JSONObject;)Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextEditState;

    .line 64
    move-result-object p0

    .line 65
    .line 66
    .line 67
    invoke-direct {v1, v0, v3, v2, p0}, Lio/flutter/embedding/engine/systemchannels/TextInputChannel$Configuration$Autofill;-><init>(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextEditState;)V

    .line 68
    return-object v1
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
.end method

.method private static translateAutofillHint(Ljava/lang/String;)Ljava/lang/String;
    .locals 17
    .param p0    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    const-string v1, "postalCode"

    .line 5
    .line 6
    const-string v2, "postalAddress"

    .line 7
    .line 8
    const-string v3, "password"

    .line 9
    .line 10
    const-string v4, "newUsername"

    .line 11
    .line 12
    const-string v5, "username"

    .line 13
    .line 14
    const-string v6, "creditCardExpirationYear"

    .line 15
    .line 16
    const-string v7, "creditCardExpirationDate"

    .line 17
    .line 18
    const-string v8, "creditCardNumber"

    .line 19
    .line 20
    const-string v9, "gender"

    .line 21
    .line 22
    const-string v10, "creditCardExpirationDay"

    .line 23
    .line 24
    const-string v11, "creditCardSecurityCode"

    .line 25
    .line 26
    const-string v12, "newPassword"

    .line 27
    .line 28
    const-string v13, "creditCardExpirationMonth"

    .line 29
    .line 30
    sget v14, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 31
    .line 32
    const/16 v15, 0x1a

    .line 33
    .line 34
    if-ge v14, v15, :cond_0

    .line 35
    return-object v0

    .line 36
    .line 37
    .line 38
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 42
    move-result v16

    .line 43
    .line 44
    .line 45
    sparse-switch v16, :sswitch_data_0

    .line 46
    :goto_0
    const/4 v15, -0x1

    .line 47
    .line 48
    goto/16 :goto_1

    .line 49
    .line 50
    :sswitch_0
    const-string v15, "birthdayDay"

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 54
    move-result v15

    .line 55
    .line 56
    if-nez v15, :cond_1

    .line 57
    goto :goto_0

    .line 58
    .line 59
    :cond_1
    const/16 v15, 0x23

    .line 60
    .line 61
    goto/16 :goto_1

    .line 62
    .line 63
    .line 64
    :sswitch_1
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 65
    move-result v15

    .line 66
    .line 67
    if-nez v15, :cond_2

    .line 68
    goto :goto_0

    .line 69
    .line 70
    :cond_2
    const/16 v15, 0x22

    .line 71
    .line 72
    goto/16 :goto_1

    .line 73
    .line 74
    :sswitch_2
    const-string v15, "postalAddressExtended"

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 78
    move-result v15

    .line 79
    .line 80
    if-nez v15, :cond_3

    .line 81
    goto :goto_0

    .line 82
    .line 83
    :cond_3
    const/16 v15, 0x21

    .line 84
    .line 85
    goto/16 :goto_1

    .line 86
    .line 87
    .line 88
    :sswitch_3
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 89
    move-result v15

    .line 90
    .line 91
    if-nez v15, :cond_4

    .line 92
    goto :goto_0

    .line 93
    .line 94
    :cond_4
    const/16 v15, 0x20

    .line 95
    .line 96
    goto/16 :goto_1

    .line 97
    .line 98
    :sswitch_4
    const-string v15, "givenName"

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 102
    move-result v15

    .line 103
    .line 104
    if-nez v15, :cond_5

    .line 105
    goto :goto_0

    .line 106
    .line 107
    :cond_5
    const/16 v15, 0x1f

    .line 108
    .line 109
    goto/16 :goto_1

    .line 110
    .line 111
    .line 112
    :sswitch_5
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 113
    move-result v15

    .line 114
    .line 115
    if-nez v15, :cond_6

    .line 116
    goto :goto_0

    .line 117
    .line 118
    :cond_6
    const/16 v15, 0x1e

    .line 119
    .line 120
    goto/16 :goto_1

    .line 121
    .line 122
    :sswitch_6
    const-string v15, "birthday"

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 126
    move-result v15

    .line 127
    .line 128
    if-nez v15, :cond_7

    .line 129
    goto :goto_0

    .line 130
    .line 131
    :cond_7
    const/16 v15, 0x1d

    .line 132
    .line 133
    goto/16 :goto_1

    .line 134
    .line 135
    .line 136
    :sswitch_7
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 137
    move-result v15

    .line 138
    .line 139
    if-nez v15, :cond_8

    .line 140
    goto :goto_0

    .line 141
    .line 142
    :cond_8
    const/16 v15, 0x1c

    .line 143
    .line 144
    goto/16 :goto_1

    .line 145
    .line 146
    :sswitch_8
    const-string v15, "telephoneNumber"

    .line 147
    .line 148
    .line 149
    invoke-virtual {v0, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 150
    move-result v15

    .line 151
    .line 152
    if-nez v15, :cond_9

    .line 153
    goto :goto_0

    .line 154
    .line 155
    :cond_9
    const/16 v15, 0x1b

    .line 156
    .line 157
    goto/16 :goto_1

    .line 158
    .line 159
    :sswitch_9
    const-string v14, "familyName"

    .line 160
    .line 161
    .line 162
    invoke-virtual {v0, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 163
    move-result v14

    .line 164
    .line 165
    if-nez v14, :cond_24

    .line 166
    goto :goto_0

    .line 167
    .line 168
    :sswitch_a
    const-string v14, "birthdayMonth"

    .line 169
    .line 170
    .line 171
    invoke-virtual {v0, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 172
    move-result v14

    .line 173
    .line 174
    if-nez v14, :cond_a

    .line 175
    .line 176
    goto/16 :goto_0

    .line 177
    .line 178
    :cond_a
    const/16 v15, 0x19

    .line 179
    .line 180
    goto/16 :goto_1

    .line 181
    .line 182
    :sswitch_b
    const-string v14, "addressState"

    .line 183
    .line 184
    .line 185
    invoke-virtual {v0, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 186
    move-result v14

    .line 187
    .line 188
    if-nez v14, :cond_b

    .line 189
    .line 190
    goto/16 :goto_0

    .line 191
    .line 192
    :cond_b
    const/16 v15, 0x18

    .line 193
    .line 194
    goto/16 :goto_1

    .line 195
    .line 196
    :sswitch_c
    const-string v14, "email"

    .line 197
    .line 198
    .line 199
    invoke-virtual {v0, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 200
    move-result v14

    .line 201
    .line 202
    if-nez v14, :cond_c

    .line 203
    .line 204
    goto/16 :goto_0

    .line 205
    .line 206
    :cond_c
    const/16 v15, 0x17

    .line 207
    .line 208
    goto/16 :goto_1

    .line 209
    .line 210
    :sswitch_d
    const-string v14, "name"

    .line 211
    .line 212
    .line 213
    invoke-virtual {v0, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 214
    move-result v14

    .line 215
    .line 216
    if-nez v14, :cond_d

    .line 217
    .line 218
    goto/16 :goto_0

    .line 219
    .line 220
    :cond_d
    const/16 v15, 0x16

    .line 221
    .line 222
    goto/16 :goto_1

    .line 223
    .line 224
    .line 225
    :sswitch_e
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 226
    move-result v14

    .line 227
    .line 228
    if-nez v14, :cond_e

    .line 229
    .line 230
    goto/16 :goto_0

    .line 231
    .line 232
    :cond_e
    const/16 v15, 0x15

    .line 233
    .line 234
    goto/16 :goto_1

    .line 235
    .line 236
    :sswitch_f
    const-string v14, "telephoneNumberCountryCode"

    .line 237
    .line 238
    .line 239
    invoke-virtual {v0, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 240
    move-result v14

    .line 241
    .line 242
    if-nez v14, :cond_f

    .line 243
    .line 244
    goto/16 :goto_0

    .line 245
    .line 246
    :cond_f
    const/16 v15, 0x14

    .line 247
    .line 248
    goto/16 :goto_1

    .line 249
    .line 250
    .line 251
    :sswitch_10
    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 252
    move-result v14

    .line 253
    .line 254
    if-nez v14, :cond_10

    .line 255
    .line 256
    goto/16 :goto_0

    .line 257
    .line 258
    :cond_10
    const/16 v15, 0x13

    .line 259
    .line 260
    goto/16 :goto_1

    .line 261
    .line 262
    .line 263
    :sswitch_11
    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 264
    move-result v14

    .line 265
    .line 266
    if-nez v14, :cond_11

    .line 267
    .line 268
    goto/16 :goto_0

    .line 269
    .line 270
    :cond_11
    const/16 v15, 0x12

    .line 271
    .line 272
    goto/16 :goto_1

    .line 273
    .line 274
    :sswitch_12
    const-string v14, "nameSuffix"

    .line 275
    .line 276
    .line 277
    invoke-virtual {v0, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 278
    move-result v14

    .line 279
    .line 280
    if-nez v14, :cond_12

    .line 281
    .line 282
    goto/16 :goto_0

    .line 283
    .line 284
    :cond_12
    const/16 v15, 0x11

    .line 285
    .line 286
    goto/16 :goto_1

    .line 287
    .line 288
    :sswitch_13
    const-string v14, "middleName"

    .line 289
    .line 290
    .line 291
    invoke-virtual {v0, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 292
    move-result v14

    .line 293
    .line 294
    if-nez v14, :cond_13

    .line 295
    .line 296
    goto/16 :goto_0

    .line 297
    .line 298
    :cond_13
    const/16 v15, 0x10

    .line 299
    .line 300
    goto/16 :goto_1

    .line 301
    .line 302
    :sswitch_14
    const-string v14, "namePrefix"

    .line 303
    .line 304
    .line 305
    invoke-virtual {v0, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 306
    move-result v14

    .line 307
    .line 308
    if-nez v14, :cond_14

    .line 309
    .line 310
    goto/16 :goto_0

    .line 311
    .line 312
    :cond_14
    const/16 v15, 0xf

    .line 313
    .line 314
    goto/16 :goto_1

    .line 315
    .line 316
    .line 317
    :sswitch_15
    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 318
    move-result v14

    .line 319
    .line 320
    if-nez v14, :cond_15

    .line 321
    .line 322
    goto/16 :goto_0

    .line 323
    .line 324
    :cond_15
    const/16 v15, 0xe

    .line 325
    .line 326
    goto/16 :goto_1

    .line 327
    .line 328
    :sswitch_16
    const-string v14, "postalAddressExtendedPostalCode"

    .line 329
    .line 330
    .line 331
    invoke-virtual {v0, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 332
    move-result v14

    .line 333
    .line 334
    if-nez v14, :cond_16

    .line 335
    .line 336
    goto/16 :goto_0

    .line 337
    .line 338
    :cond_16
    const/16 v15, 0xd

    .line 339
    .line 340
    goto/16 :goto_1

    .line 341
    .line 342
    .line 343
    :sswitch_17
    invoke-virtual {v0, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 344
    move-result v14

    .line 345
    .line 346
    if-nez v14, :cond_17

    .line 347
    .line 348
    goto/16 :goto_0

    .line 349
    .line 350
    :cond_17
    const/16 v15, 0xc

    .line 351
    .line 352
    goto/16 :goto_1

    .line 353
    .line 354
    :sswitch_18
    const-string v14, "addressCity"

    .line 355
    .line 356
    .line 357
    invoke-virtual {v0, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 358
    move-result v14

    .line 359
    .line 360
    if-nez v14, :cond_18

    .line 361
    .line 362
    goto/16 :goto_0

    .line 363
    .line 364
    :cond_18
    const/16 v15, 0xb

    .line 365
    .line 366
    goto/16 :goto_1

    .line 367
    .line 368
    :sswitch_19
    const-string v14, "middleInitial"

    .line 369
    .line 370
    .line 371
    invoke-virtual {v0, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 372
    move-result v14

    .line 373
    .line 374
    if-nez v14, :cond_19

    .line 375
    .line 376
    goto/16 :goto_0

    .line 377
    .line 378
    :cond_19
    const/16 v15, 0xa

    .line 379
    .line 380
    goto/16 :goto_1

    .line 381
    .line 382
    :sswitch_1a
    const-string v14, "countryName"

    .line 383
    .line 384
    .line 385
    invoke-virtual {v0, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 386
    move-result v14

    .line 387
    .line 388
    if-nez v14, :cond_1a

    .line 389
    .line 390
    goto/16 :goto_0

    .line 391
    .line 392
    :cond_1a
    const/16 v15, 0x9

    .line 393
    .line 394
    goto/16 :goto_1

    .line 395
    .line 396
    :sswitch_1b
    const-string v14, "telephoneNumberDevice"

    .line 397
    .line 398
    .line 399
    invoke-virtual {v0, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 400
    move-result v14

    .line 401
    .line 402
    if-nez v14, :cond_1b

    .line 403
    .line 404
    goto/16 :goto_0

    .line 405
    .line 406
    :cond_1b
    const/16 v15, 0x8

    .line 407
    goto :goto_1

    .line 408
    .line 409
    :sswitch_1c
    const-string v14, "fullStreetAddress"

    .line 410
    .line 411
    .line 412
    invoke-virtual {v0, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 413
    move-result v14

    .line 414
    .line 415
    if-nez v14, :cond_1c

    .line 416
    .line 417
    goto/16 :goto_0

    .line 418
    :cond_1c
    const/4 v15, 0x7

    .line 419
    goto :goto_1

    .line 420
    .line 421
    .line 422
    :sswitch_1d
    invoke-virtual {v0, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 423
    move-result v14

    .line 424
    .line 425
    if-nez v14, :cond_1d

    .line 426
    .line 427
    goto/16 :goto_0

    .line 428
    :cond_1d
    const/4 v15, 0x6

    .line 429
    goto :goto_1

    .line 430
    .line 431
    .line 432
    :sswitch_1e
    invoke-virtual {v0, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 433
    move-result v14

    .line 434
    .line 435
    if-nez v14, :cond_1e

    .line 436
    .line 437
    goto/16 :goto_0

    .line 438
    :cond_1e
    const/4 v15, 0x5

    .line 439
    goto :goto_1

    .line 440
    .line 441
    .line 442
    :sswitch_1f
    invoke-virtual {v0, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 443
    move-result v14

    .line 444
    .line 445
    if-nez v14, :cond_1f

    .line 446
    .line 447
    goto/16 :goto_0

    .line 448
    :cond_1f
    const/4 v15, 0x4

    .line 449
    goto :goto_1

    .line 450
    .line 451
    :sswitch_20
    const-string v14, "telephoneNumberNational"

    .line 452
    .line 453
    .line 454
    invoke-virtual {v0, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 455
    move-result v14

    .line 456
    .line 457
    if-nez v14, :cond_20

    .line 458
    .line 459
    goto/16 :goto_0

    .line 460
    :cond_20
    const/4 v15, 0x3

    .line 461
    goto :goto_1

    .line 462
    .line 463
    .line 464
    :sswitch_21
    invoke-virtual {v0, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 465
    move-result v14

    .line 466
    .line 467
    if-nez v14, :cond_21

    .line 468
    .line 469
    goto/16 :goto_0

    .line 470
    :cond_21
    const/4 v15, 0x2

    .line 471
    goto :goto_1

    .line 472
    .line 473
    :sswitch_22
    const-string v14, "oneTimeCode"

    .line 474
    .line 475
    .line 476
    invoke-virtual {v0, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 477
    move-result v14

    .line 478
    .line 479
    if-nez v14, :cond_22

    .line 480
    .line 481
    goto/16 :goto_0

    .line 482
    :cond_22
    const/4 v15, 0x1

    .line 483
    goto :goto_1

    .line 484
    .line 485
    :sswitch_23
    const-string v14, "birthdayYear"

    .line 486
    .line 487
    .line 488
    invoke-virtual {v0, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 489
    move-result v14

    .line 490
    .line 491
    if-nez v14, :cond_23

    .line 492
    .line 493
    goto/16 :goto_0

    .line 494
    :cond_23
    const/4 v15, 0x0

    .line 495
    .line 496
    .line 497
    :cond_24
    :goto_1
    packed-switch v15, :pswitch_data_0

    .line 498
    return-object v0

    .line 499
    .line 500
    :pswitch_0
    const-string v0, "birthDateDay"

    .line 501
    return-object v0

    .line 502
    :pswitch_1
    return-object v1

    .line 503
    .line 504
    :pswitch_2
    const-string v0, "extendedAddress"

    .line 505
    return-object v0

    .line 506
    :pswitch_3
    return-object v2

    .line 507
    .line 508
    :pswitch_4
    const-string v0, "personGivenName"

    .line 509
    return-object v0

    .line 510
    :pswitch_5
    return-object v3

    .line 511
    .line 512
    :pswitch_6
    const-string v0, "birthDateFull"

    .line 513
    return-object v0

    .line 514
    :pswitch_7
    return-object v4

    .line 515
    .line 516
    :pswitch_8
    const-string v0, "phoneNumber"

    .line 517
    return-object v0

    .line 518
    .line 519
    :pswitch_9
    const-string v0, "personFamilyName"

    .line 520
    return-object v0

    .line 521
    .line 522
    :pswitch_a
    const-string v0, "birthDateMonth"

    .line 523
    return-object v0

    .line 524
    .line 525
    :pswitch_b
    const-string v0, "addressRegion"

    .line 526
    return-object v0

    .line 527
    .line 528
    :pswitch_c
    const-string v0, "emailAddress"

    .line 529
    return-object v0

    .line 530
    .line 531
    :pswitch_d
    const-string v0, "personName"

    .line 532
    return-object v0

    .line 533
    :pswitch_e
    return-object v5

    .line 534
    .line 535
    :pswitch_f
    const-string v0, "phoneCountryCode"

    .line 536
    return-object v0

    .line 537
    :pswitch_10
    return-object v6

    .line 538
    :pswitch_11
    return-object v7

    .line 539
    .line 540
    :pswitch_12
    const-string v0, "personNameSuffix"

    .line 541
    return-object v0

    .line 542
    .line 543
    :pswitch_13
    const-string v0, "personMiddleName"

    .line 544
    return-object v0

    .line 545
    .line 546
    :pswitch_14
    const-string v0, "personNamePrefix"

    .line 547
    return-object v0

    .line 548
    :pswitch_15
    return-object v8

    .line 549
    .line 550
    :pswitch_16
    const-string v0, "extendedPostalCode"

    .line 551
    return-object v0

    .line 552
    :pswitch_17
    return-object v9

    .line 553
    .line 554
    :pswitch_18
    const-string v0, "addressLocality"

    .line 555
    return-object v0

    .line 556
    .line 557
    :pswitch_19
    const-string v0, "personMiddleInitial"

    .line 558
    return-object v0

    .line 559
    .line 560
    :pswitch_1a
    const-string v0, "addressCountry"

    .line 561
    return-object v0

    .line 562
    .line 563
    :pswitch_1b
    const-string v0, "phoneNumberDevice"

    .line 564
    return-object v0

    .line 565
    .line 566
    :pswitch_1c
    const-string v0, "streetAddress"

    .line 567
    return-object v0

    .line 568
    :pswitch_1d
    return-object v10

    .line 569
    :pswitch_1e
    return-object v11

    .line 570
    :pswitch_1f
    return-object v12

    .line 571
    .line 572
    :pswitch_20
    const-string v0, "phoneNational"

    .line 573
    return-object v0

    .line 574
    :pswitch_21
    return-object v13

    .line 575
    .line 576
    :pswitch_22
    const-string v0, "smsOTPCode"

    .line 577
    return-object v0

    .line 578
    .line 579
    :pswitch_23
    const-string v0, "birthDateYear"

    .line 580
    return-object v0

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
    :sswitch_data_0
    .sparse-switch
        -0x7ab827a6 -> :sswitch_23
        -0x72476d20 -> :sswitch_22
        -0x6df5a7d8 -> :sswitch_21
        -0x6cd04ac1 -> :sswitch_20
        -0x6c8dd7a5 -> :sswitch_1f
        -0x68c2726a -> :sswitch_1e
        -0x6446fcbc -> :sswitch_1d
        -0x62e1a7de -> :sswitch_1c
        -0x5d6852dd -> :sswitch_1b
        -0x580574bf -> :sswitch_1a
        -0x5443ec11 -> :sswitch_19
        -0x521f7081 -> :sswitch_18
        -0x4a7a0d3f -> :sswitch_17
        -0x46b1d806 -> :sswitch_16
        -0x449b65ae -> :sswitch_15
        -0x31d43b03 -> :sswitch_14
        -0x30c50a40 -> :sswitch_13
        -0x2c8af644 -> :sswitch_12
        -0x24989afa -> :sswitch_11
        -0x248f026b -> :sswitch_10
        -0x20bc980a -> :sswitch_f
        -0xfd6772a -> :sswitch_e
        0x337a8b -> :sswitch_d
        0x5c24b9c -> :sswitch_c
        0xf1790fd -> :sswitch_b
        0x230ed603 -> :sswitch_a
        0x2f98f80f -> :sswitch_9
        0x352e686d -> :sswitch_8
        0x3b11f696 -> :sswitch_7
        0x3fbd627d -> :sswitch_6
        0x4889ba9b -> :sswitch_5
        0x578fdfa8 -> :sswitch_4
        0x631a4ca9 -> :sswitch_3
        0x728d6502 -> :sswitch_2
        0x77dfc158 -> :sswitch_1
        0x77e93bdf -> :sswitch_0
    .end sparse-switch

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
    :pswitch_data_0
    .packed-switch 0x0
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
.end method
