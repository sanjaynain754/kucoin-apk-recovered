.class public final enum Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;
.super Ljava/lang/Enum;
.source "TextInputChannel.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/embedding/engine/systemchannels/TextInputChannel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "TextInputType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;

.field public static final enum DATETIME:Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;

.field public static final enum EMAIL_ADDRESS:Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;

.field public static final enum MULTILINE:Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;

.field public static final enum NAME:Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;

.field public static final enum NONE:Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;

.field public static final enum NUMBER:Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;

.field public static final enum PHONE:Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;

.field public static final enum POSTAL_ADDRESS:Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;

.field public static final enum TEXT:Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;

.field public static final enum TWITTER:Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;

.field public static final enum URL:Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;

.field public static final enum VISIBLE_PASSWORD:Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;

.field public static final enum WEB_SEARCH:Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;


# instance fields
.field private final encodedName:Ljava/lang/String;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method private static synthetic $values()[Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;
    .locals 13

    .line 1
    .line 2
    sget-object v0, Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;->TEXT:Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;

    .line 3
    .line 4
    sget-object v1, Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;->DATETIME:Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;

    .line 5
    .line 6
    sget-object v2, Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;->NAME:Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;

    .line 7
    .line 8
    sget-object v3, Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;->POSTAL_ADDRESS:Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;

    .line 9
    .line 10
    sget-object v4, Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;->NUMBER:Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;

    .line 11
    .line 12
    sget-object v5, Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;->PHONE:Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;

    .line 13
    .line 14
    sget-object v6, Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;->MULTILINE:Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;

    .line 15
    .line 16
    sget-object v7, Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;->EMAIL_ADDRESS:Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;

    .line 17
    .line 18
    sget-object v8, Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;->URL:Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;

    .line 19
    .line 20
    sget-object v9, Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;->VISIBLE_PASSWORD:Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;

    .line 21
    .line 22
    sget-object v10, Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;->NONE:Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;

    .line 23
    .line 24
    sget-object v11, Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;->WEB_SEARCH:Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;

    .line 25
    .line 26
    sget-object v12, Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;->TWITTER:Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;

    .line 27
    .line 28
    .line 29
    filled-new-array/range {v0 .. v12}, [Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;

    .line 30
    move-result-object v0

    .line 31
    return-object v0
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
.end method

.method static constructor <clinit>()V
    .locals 4

    .line 1
    .line 2
    new-instance v0, Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    const-string v2, "TextInputType.text"

    .line 6
    .line 7
    const-string v3, "TEXT"

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, v3, v1, v2}, Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 11
    .line 12
    sput-object v0, Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;->TEXT:Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;

    .line 13
    .line 14
    new-instance v0, Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;

    .line 15
    const/4 v1, 0x1

    .line 16
    .line 17
    const-string v2, "TextInputType.datetime"

    .line 18
    .line 19
    const-string v3, "DATETIME"

    .line 20
    .line 21
    .line 22
    invoke-direct {v0, v3, v1, v2}, Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 23
    .line 24
    sput-object v0, Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;->DATETIME:Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;

    .line 25
    .line 26
    new-instance v0, Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;

    .line 27
    const/4 v1, 0x2

    .line 28
    .line 29
    const-string v2, "TextInputType.name"

    .line 30
    .line 31
    const-string v3, "NAME"

    .line 32
    .line 33
    .line 34
    invoke-direct {v0, v3, v1, v2}, Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 35
    .line 36
    sput-object v0, Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;->NAME:Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;

    .line 37
    .line 38
    new-instance v0, Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;

    .line 39
    const/4 v1, 0x3

    .line 40
    .line 41
    const-string v2, "TextInputType.address"

    .line 42
    .line 43
    const-string v3, "POSTAL_ADDRESS"

    .line 44
    .line 45
    .line 46
    invoke-direct {v0, v3, v1, v2}, Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 47
    .line 48
    sput-object v0, Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;->POSTAL_ADDRESS:Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;

    .line 49
    .line 50
    new-instance v0, Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;

    .line 51
    const/4 v1, 0x4

    .line 52
    .line 53
    const-string v2, "TextInputType.number"

    .line 54
    .line 55
    const-string v3, "NUMBER"

    .line 56
    .line 57
    .line 58
    invoke-direct {v0, v3, v1, v2}, Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 59
    .line 60
    sput-object v0, Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;->NUMBER:Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;

    .line 61
    .line 62
    new-instance v0, Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;

    .line 63
    const/4 v1, 0x5

    .line 64
    .line 65
    const-string v2, "TextInputType.phone"

    .line 66
    .line 67
    const-string v3, "PHONE"

    .line 68
    .line 69
    .line 70
    invoke-direct {v0, v3, v1, v2}, Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 71
    .line 72
    sput-object v0, Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;->PHONE:Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;

    .line 73
    .line 74
    new-instance v0, Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;

    .line 75
    const/4 v1, 0x6

    .line 76
    .line 77
    const-string v2, "TextInputType.multiline"

    .line 78
    .line 79
    const-string v3, "MULTILINE"

    .line 80
    .line 81
    .line 82
    invoke-direct {v0, v3, v1, v2}, Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 83
    .line 84
    sput-object v0, Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;->MULTILINE:Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;

    .line 85
    .line 86
    new-instance v0, Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;

    .line 87
    const/4 v1, 0x7

    .line 88
    .line 89
    const-string v2, "TextInputType.emailAddress"

    .line 90
    .line 91
    const-string v3, "EMAIL_ADDRESS"

    .line 92
    .line 93
    .line 94
    invoke-direct {v0, v3, v1, v2}, Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 95
    .line 96
    sput-object v0, Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;->EMAIL_ADDRESS:Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;

    .line 97
    .line 98
    new-instance v0, Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;

    .line 99
    .line 100
    const/16 v1, 0x8

    .line 101
    .line 102
    const-string v2, "TextInputType.url"

    .line 103
    .line 104
    const-string v3, "URL"

    .line 105
    .line 106
    .line 107
    invoke-direct {v0, v3, v1, v2}, Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 108
    .line 109
    sput-object v0, Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;->URL:Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;

    .line 110
    .line 111
    new-instance v0, Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;

    .line 112
    .line 113
    const/16 v1, 0x9

    .line 114
    .line 115
    const-string v2, "TextInputType.visiblePassword"

    .line 116
    .line 117
    const-string v3, "VISIBLE_PASSWORD"

    .line 118
    .line 119
    .line 120
    invoke-direct {v0, v3, v1, v2}, Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 121
    .line 122
    sput-object v0, Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;->VISIBLE_PASSWORD:Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;

    .line 123
    .line 124
    new-instance v0, Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;

    .line 125
    .line 126
    const/16 v1, 0xa

    .line 127
    .line 128
    const-string v2, "TextInputType.none"

    .line 129
    .line 130
    const-string v3, "NONE"

    .line 131
    .line 132
    .line 133
    invoke-direct {v0, v3, v1, v2}, Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 134
    .line 135
    sput-object v0, Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;->NONE:Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;

    .line 136
    .line 137
    new-instance v0, Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;

    .line 138
    .line 139
    const/16 v1, 0xb

    .line 140
    .line 141
    const-string v2, "TextInputType.webSearch"

    .line 142
    .line 143
    const-string v3, "WEB_SEARCH"

    .line 144
    .line 145
    .line 146
    invoke-direct {v0, v3, v1, v2}, Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 147
    .line 148
    sput-object v0, Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;->WEB_SEARCH:Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;

    .line 149
    .line 150
    new-instance v0, Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;

    .line 151
    .line 152
    const/16 v1, 0xc

    .line 153
    .line 154
    const-string v2, "TextInputType.twitter"

    .line 155
    .line 156
    const-string v3, "TWITTER"

    .line 157
    .line 158
    .line 159
    invoke-direct {v0, v3, v1, v2}, Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 160
    .line 161
    sput-object v0, Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;->TWITTER:Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;

    .line 162
    .line 163
    .line 164
    invoke-static {}, Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;->$values()[Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;

    .line 165
    move-result-object v0

    .line 166
    .line 167
    sput-object v0, Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;->$VALUES:[Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;

    .line 168
    return-void
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
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 4
    .line 5
    iput-object p3, p0, Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;->encodedName:Ljava/lang/String;

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
.end method

.method public static fromValue(Ljava/lang/String;)Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;
    .locals 5
    .param p0    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/NoSuchFieldException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;->values()[Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;

    .line 4
    move-result-object v0

    .line 5
    array-length v1, v0

    .line 6
    const/4 v2, 0x0

    .line 7
    .line 8
    :goto_0
    if-ge v2, v1, :cond_1

    .line 9
    .line 10
    aget-object v3, v0, v2

    .line 11
    .line 12
    iget-object v4, v3, Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;->encodedName:Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v4, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 16
    move-result v4

    .line 17
    .line 18
    if-eqz v4, :cond_0

    .line 19
    return-object v3

    .line 20
    .line 21
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 22
    goto :goto_0

    .line 23
    .line 24
    :cond_1
    new-instance v0, Ljava/lang/NoSuchFieldException;

    .line 25
    .line 26
    new-instance v1, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 30
    .line 31
    const-string v2, "No such TextInputType: "

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    move-result-object p0

    .line 42
    .line 43
    .line 44
    invoke-direct {v0, p0}, Ljava/lang/NoSuchFieldException;-><init>(Ljava/lang/String;)V

    .line 45
    throw v0
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
.end method

.method public static valueOf(Ljava/lang/String;)Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;
    .locals 1

    .line 1
    .line 2
    const-class v0, Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;

    .line 9
    return-object p0
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
.end method

.method public static values()[Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;->$VALUES:[Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, [Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;->clone()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, [Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputType;

    .line 9
    return-object v0
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
.end method
