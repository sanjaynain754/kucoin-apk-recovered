.class public final enum Lio/flutter/view/AccessibilityBridge$Action;
.super Ljava/lang/Enum;
.source "AccessibilityBridge.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/view/AccessibilityBridge;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Action"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/flutter/view/AccessibilityBridge$Action;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lio/flutter/view/AccessibilityBridge$Action;

.field public static final enum COPY:Lio/flutter/view/AccessibilityBridge$Action;

.field public static final enum CUSTOM_ACTION:Lio/flutter/view/AccessibilityBridge$Action;

.field public static final enum CUT:Lio/flutter/view/AccessibilityBridge$Action;

.field public static final enum DECREASE:Lio/flutter/view/AccessibilityBridge$Action;

.field public static final enum DID_GAIN_ACCESSIBILITY_FOCUS:Lio/flutter/view/AccessibilityBridge$Action;

.field public static final enum DID_LOSE_ACCESSIBILITY_FOCUS:Lio/flutter/view/AccessibilityBridge$Action;

.field public static final enum DISMISS:Lio/flutter/view/AccessibilityBridge$Action;

.field public static final enum FOCUS:Lio/flutter/view/AccessibilityBridge$Action;

.field public static final enum INCREASE:Lio/flutter/view/AccessibilityBridge$Action;

.field public static final enum LONG_PRESS:Lio/flutter/view/AccessibilityBridge$Action;

.field public static final enum MOVE_CURSOR_BACKWARD_BY_CHARACTER:Lio/flutter/view/AccessibilityBridge$Action;

.field public static final enum MOVE_CURSOR_BACKWARD_BY_WORD:Lio/flutter/view/AccessibilityBridge$Action;

.field public static final enum MOVE_CURSOR_FORWARD_BY_CHARACTER:Lio/flutter/view/AccessibilityBridge$Action;

.field public static final enum MOVE_CURSOR_FORWARD_BY_WORD:Lio/flutter/view/AccessibilityBridge$Action;

.field public static final enum PASTE:Lio/flutter/view/AccessibilityBridge$Action;

.field public static final enum SCROLL_DOWN:Lio/flutter/view/AccessibilityBridge$Action;

.field public static final enum SCROLL_LEFT:Lio/flutter/view/AccessibilityBridge$Action;

.field public static final enum SCROLL_RIGHT:Lio/flutter/view/AccessibilityBridge$Action;

.field public static final enum SCROLL_TO_OFFSET:Lio/flutter/view/AccessibilityBridge$Action;

.field public static final enum SCROLL_UP:Lio/flutter/view/AccessibilityBridge$Action;

.field public static final enum SET_SELECTION:Lio/flutter/view/AccessibilityBridge$Action;

.field public static final enum SET_TEXT:Lio/flutter/view/AccessibilityBridge$Action;

.field public static final enum SHOW_ON_SCREEN:Lio/flutter/view/AccessibilityBridge$Action;

.field public static final enum TAP:Lio/flutter/view/AccessibilityBridge$Action;


# instance fields
.field public final value:I


# direct methods
.method private static synthetic $values()[Lio/flutter/view/AccessibilityBridge$Action;
    .locals 25

    .line 1
    .line 2
    sget-object v1, Lio/flutter/view/AccessibilityBridge$Action;->TAP:Lio/flutter/view/AccessibilityBridge$Action;

    .line 3
    .line 4
    sget-object v2, Lio/flutter/view/AccessibilityBridge$Action;->LONG_PRESS:Lio/flutter/view/AccessibilityBridge$Action;

    .line 5
    .line 6
    sget-object v3, Lio/flutter/view/AccessibilityBridge$Action;->SCROLL_LEFT:Lio/flutter/view/AccessibilityBridge$Action;

    .line 7
    .line 8
    sget-object v4, Lio/flutter/view/AccessibilityBridge$Action;->SCROLL_RIGHT:Lio/flutter/view/AccessibilityBridge$Action;

    .line 9
    .line 10
    sget-object v5, Lio/flutter/view/AccessibilityBridge$Action;->SCROLL_UP:Lio/flutter/view/AccessibilityBridge$Action;

    .line 11
    .line 12
    sget-object v6, Lio/flutter/view/AccessibilityBridge$Action;->SCROLL_DOWN:Lio/flutter/view/AccessibilityBridge$Action;

    .line 13
    .line 14
    sget-object v7, Lio/flutter/view/AccessibilityBridge$Action;->INCREASE:Lio/flutter/view/AccessibilityBridge$Action;

    .line 15
    .line 16
    sget-object v8, Lio/flutter/view/AccessibilityBridge$Action;->DECREASE:Lio/flutter/view/AccessibilityBridge$Action;

    .line 17
    .line 18
    sget-object v9, Lio/flutter/view/AccessibilityBridge$Action;->SHOW_ON_SCREEN:Lio/flutter/view/AccessibilityBridge$Action;

    .line 19
    .line 20
    sget-object v10, Lio/flutter/view/AccessibilityBridge$Action;->MOVE_CURSOR_FORWARD_BY_CHARACTER:Lio/flutter/view/AccessibilityBridge$Action;

    .line 21
    .line 22
    sget-object v11, Lio/flutter/view/AccessibilityBridge$Action;->MOVE_CURSOR_BACKWARD_BY_CHARACTER:Lio/flutter/view/AccessibilityBridge$Action;

    .line 23
    .line 24
    sget-object v12, Lio/flutter/view/AccessibilityBridge$Action;->SET_SELECTION:Lio/flutter/view/AccessibilityBridge$Action;

    .line 25
    .line 26
    sget-object v13, Lio/flutter/view/AccessibilityBridge$Action;->COPY:Lio/flutter/view/AccessibilityBridge$Action;

    .line 27
    .line 28
    sget-object v14, Lio/flutter/view/AccessibilityBridge$Action;->CUT:Lio/flutter/view/AccessibilityBridge$Action;

    .line 29
    .line 30
    sget-object v15, Lio/flutter/view/AccessibilityBridge$Action;->PASTE:Lio/flutter/view/AccessibilityBridge$Action;

    .line 31
    .line 32
    sget-object v16, Lio/flutter/view/AccessibilityBridge$Action;->DID_GAIN_ACCESSIBILITY_FOCUS:Lio/flutter/view/AccessibilityBridge$Action;

    .line 33
    .line 34
    sget-object v17, Lio/flutter/view/AccessibilityBridge$Action;->DID_LOSE_ACCESSIBILITY_FOCUS:Lio/flutter/view/AccessibilityBridge$Action;

    .line 35
    .line 36
    sget-object v18, Lio/flutter/view/AccessibilityBridge$Action;->CUSTOM_ACTION:Lio/flutter/view/AccessibilityBridge$Action;

    .line 37
    .line 38
    sget-object v19, Lio/flutter/view/AccessibilityBridge$Action;->DISMISS:Lio/flutter/view/AccessibilityBridge$Action;

    .line 39
    .line 40
    sget-object v20, Lio/flutter/view/AccessibilityBridge$Action;->MOVE_CURSOR_FORWARD_BY_WORD:Lio/flutter/view/AccessibilityBridge$Action;

    .line 41
    .line 42
    sget-object v21, Lio/flutter/view/AccessibilityBridge$Action;->MOVE_CURSOR_BACKWARD_BY_WORD:Lio/flutter/view/AccessibilityBridge$Action;

    .line 43
    .line 44
    sget-object v22, Lio/flutter/view/AccessibilityBridge$Action;->SET_TEXT:Lio/flutter/view/AccessibilityBridge$Action;

    .line 45
    .line 46
    sget-object v23, Lio/flutter/view/AccessibilityBridge$Action;->FOCUS:Lio/flutter/view/AccessibilityBridge$Action;

    .line 47
    .line 48
    sget-object v24, Lio/flutter/view/AccessibilityBridge$Action;->SCROLL_TO_OFFSET:Lio/flutter/view/AccessibilityBridge$Action;

    .line 49
    .line 50
    .line 51
    filled-new-array/range {v1 .. v24}, [Lio/flutter/view/AccessibilityBridge$Action;

    .line 52
    move-result-object v0

    .line 53
    return-object v0
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
.end method

.method static constructor <clinit>()V
    .locals 6

    .line 1
    .line 2
    new-instance v0, Lio/flutter/view/AccessibilityBridge$Action;

    .line 3
    .line 4
    const-string v1, "TAP"

    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v1, v2, v3}, Lio/flutter/view/AccessibilityBridge$Action;-><init>(Ljava/lang/String;II)V

    .line 10
    .line 11
    sput-object v0, Lio/flutter/view/AccessibilityBridge$Action;->TAP:Lio/flutter/view/AccessibilityBridge$Action;

    .line 12
    .line 13
    new-instance v0, Lio/flutter/view/AccessibilityBridge$Action;

    .line 14
    .line 15
    const-string v1, "LONG_PRESS"

    .line 16
    const/4 v2, 0x2

    .line 17
    .line 18
    .line 19
    invoke-direct {v0, v1, v3, v2}, Lio/flutter/view/AccessibilityBridge$Action;-><init>(Ljava/lang/String;II)V

    .line 20
    .line 21
    sput-object v0, Lio/flutter/view/AccessibilityBridge$Action;->LONG_PRESS:Lio/flutter/view/AccessibilityBridge$Action;

    .line 22
    .line 23
    new-instance v0, Lio/flutter/view/AccessibilityBridge$Action;

    .line 24
    .line 25
    const-string v1, "SCROLL_LEFT"

    .line 26
    const/4 v3, 0x4

    .line 27
    .line 28
    .line 29
    invoke-direct {v0, v1, v2, v3}, Lio/flutter/view/AccessibilityBridge$Action;-><init>(Ljava/lang/String;II)V

    .line 30
    .line 31
    sput-object v0, Lio/flutter/view/AccessibilityBridge$Action;->SCROLL_LEFT:Lio/flutter/view/AccessibilityBridge$Action;

    .line 32
    .line 33
    new-instance v0, Lio/flutter/view/AccessibilityBridge$Action;

    .line 34
    .line 35
    const-string v1, "SCROLL_RIGHT"

    .line 36
    const/4 v2, 0x3

    .line 37
    .line 38
    const/16 v4, 0x8

    .line 39
    .line 40
    .line 41
    invoke-direct {v0, v1, v2, v4}, Lio/flutter/view/AccessibilityBridge$Action;-><init>(Ljava/lang/String;II)V

    .line 42
    .line 43
    sput-object v0, Lio/flutter/view/AccessibilityBridge$Action;->SCROLL_RIGHT:Lio/flutter/view/AccessibilityBridge$Action;

    .line 44
    .line 45
    new-instance v0, Lio/flutter/view/AccessibilityBridge$Action;

    .line 46
    .line 47
    const-string v1, "SCROLL_UP"

    .line 48
    .line 49
    const/16 v2, 0x10

    .line 50
    .line 51
    .line 52
    invoke-direct {v0, v1, v3, v2}, Lio/flutter/view/AccessibilityBridge$Action;-><init>(Ljava/lang/String;II)V

    .line 53
    .line 54
    sput-object v0, Lio/flutter/view/AccessibilityBridge$Action;->SCROLL_UP:Lio/flutter/view/AccessibilityBridge$Action;

    .line 55
    .line 56
    new-instance v0, Lio/flutter/view/AccessibilityBridge$Action;

    .line 57
    const/4 v1, 0x5

    .line 58
    .line 59
    const/16 v3, 0x20

    .line 60
    .line 61
    const-string v5, "SCROLL_DOWN"

    .line 62
    .line 63
    .line 64
    invoke-direct {v0, v5, v1, v3}, Lio/flutter/view/AccessibilityBridge$Action;-><init>(Ljava/lang/String;II)V

    .line 65
    .line 66
    sput-object v0, Lio/flutter/view/AccessibilityBridge$Action;->SCROLL_DOWN:Lio/flutter/view/AccessibilityBridge$Action;

    .line 67
    .line 68
    new-instance v0, Lio/flutter/view/AccessibilityBridge$Action;

    .line 69
    const/4 v1, 0x6

    .line 70
    .line 71
    const/16 v3, 0x40

    .line 72
    .line 73
    const-string v5, "INCREASE"

    .line 74
    .line 75
    .line 76
    invoke-direct {v0, v5, v1, v3}, Lio/flutter/view/AccessibilityBridge$Action;-><init>(Ljava/lang/String;II)V

    .line 77
    .line 78
    sput-object v0, Lio/flutter/view/AccessibilityBridge$Action;->INCREASE:Lio/flutter/view/AccessibilityBridge$Action;

    .line 79
    .line 80
    new-instance v0, Lio/flutter/view/AccessibilityBridge$Action;

    .line 81
    const/4 v1, 0x7

    .line 82
    .line 83
    const/16 v3, 0x80

    .line 84
    .line 85
    const-string v5, "DECREASE"

    .line 86
    .line 87
    .line 88
    invoke-direct {v0, v5, v1, v3}, Lio/flutter/view/AccessibilityBridge$Action;-><init>(Ljava/lang/String;II)V

    .line 89
    .line 90
    sput-object v0, Lio/flutter/view/AccessibilityBridge$Action;->DECREASE:Lio/flutter/view/AccessibilityBridge$Action;

    .line 91
    .line 92
    new-instance v0, Lio/flutter/view/AccessibilityBridge$Action;

    .line 93
    .line 94
    const-string v1, "SHOW_ON_SCREEN"

    .line 95
    .line 96
    const/16 v3, 0x100

    .line 97
    .line 98
    .line 99
    invoke-direct {v0, v1, v4, v3}, Lio/flutter/view/AccessibilityBridge$Action;-><init>(Ljava/lang/String;II)V

    .line 100
    .line 101
    sput-object v0, Lio/flutter/view/AccessibilityBridge$Action;->SHOW_ON_SCREEN:Lio/flutter/view/AccessibilityBridge$Action;

    .line 102
    .line 103
    new-instance v0, Lio/flutter/view/AccessibilityBridge$Action;

    .line 104
    .line 105
    const/16 v1, 0x9

    .line 106
    .line 107
    const/16 v3, 0x200

    .line 108
    .line 109
    const-string v4, "MOVE_CURSOR_FORWARD_BY_CHARACTER"

    .line 110
    .line 111
    .line 112
    invoke-direct {v0, v4, v1, v3}, Lio/flutter/view/AccessibilityBridge$Action;-><init>(Ljava/lang/String;II)V

    .line 113
    .line 114
    sput-object v0, Lio/flutter/view/AccessibilityBridge$Action;->MOVE_CURSOR_FORWARD_BY_CHARACTER:Lio/flutter/view/AccessibilityBridge$Action;

    .line 115
    .line 116
    new-instance v0, Lio/flutter/view/AccessibilityBridge$Action;

    .line 117
    .line 118
    const/16 v1, 0xa

    .line 119
    .line 120
    const/16 v3, 0x400

    .line 121
    .line 122
    const-string v4, "MOVE_CURSOR_BACKWARD_BY_CHARACTER"

    .line 123
    .line 124
    .line 125
    invoke-direct {v0, v4, v1, v3}, Lio/flutter/view/AccessibilityBridge$Action;-><init>(Ljava/lang/String;II)V

    .line 126
    .line 127
    sput-object v0, Lio/flutter/view/AccessibilityBridge$Action;->MOVE_CURSOR_BACKWARD_BY_CHARACTER:Lio/flutter/view/AccessibilityBridge$Action;

    .line 128
    .line 129
    new-instance v0, Lio/flutter/view/AccessibilityBridge$Action;

    .line 130
    .line 131
    const/16 v1, 0xb

    .line 132
    .line 133
    const/16 v3, 0x800

    .line 134
    .line 135
    const-string v4, "SET_SELECTION"

    .line 136
    .line 137
    .line 138
    invoke-direct {v0, v4, v1, v3}, Lio/flutter/view/AccessibilityBridge$Action;-><init>(Ljava/lang/String;II)V

    .line 139
    .line 140
    sput-object v0, Lio/flutter/view/AccessibilityBridge$Action;->SET_SELECTION:Lio/flutter/view/AccessibilityBridge$Action;

    .line 141
    .line 142
    new-instance v0, Lio/flutter/view/AccessibilityBridge$Action;

    .line 143
    .line 144
    const/16 v1, 0xc

    .line 145
    .line 146
    const/16 v3, 0x1000

    .line 147
    .line 148
    const-string v4, "COPY"

    .line 149
    .line 150
    .line 151
    invoke-direct {v0, v4, v1, v3}, Lio/flutter/view/AccessibilityBridge$Action;-><init>(Ljava/lang/String;II)V

    .line 152
    .line 153
    sput-object v0, Lio/flutter/view/AccessibilityBridge$Action;->COPY:Lio/flutter/view/AccessibilityBridge$Action;

    .line 154
    .line 155
    new-instance v0, Lio/flutter/view/AccessibilityBridge$Action;

    .line 156
    .line 157
    const/16 v1, 0xd

    .line 158
    .line 159
    const/16 v3, 0x2000

    .line 160
    .line 161
    const-string v4, "CUT"

    .line 162
    .line 163
    .line 164
    invoke-direct {v0, v4, v1, v3}, Lio/flutter/view/AccessibilityBridge$Action;-><init>(Ljava/lang/String;II)V

    .line 165
    .line 166
    sput-object v0, Lio/flutter/view/AccessibilityBridge$Action;->CUT:Lio/flutter/view/AccessibilityBridge$Action;

    .line 167
    .line 168
    new-instance v0, Lio/flutter/view/AccessibilityBridge$Action;

    .line 169
    .line 170
    const/16 v1, 0xe

    .line 171
    .line 172
    const/16 v3, 0x4000

    .line 173
    .line 174
    const-string v4, "PASTE"

    .line 175
    .line 176
    .line 177
    invoke-direct {v0, v4, v1, v3}, Lio/flutter/view/AccessibilityBridge$Action;-><init>(Ljava/lang/String;II)V

    .line 178
    .line 179
    sput-object v0, Lio/flutter/view/AccessibilityBridge$Action;->PASTE:Lio/flutter/view/AccessibilityBridge$Action;

    .line 180
    .line 181
    new-instance v0, Lio/flutter/view/AccessibilityBridge$Action;

    .line 182
    .line 183
    const/16 v1, 0xf

    .line 184
    .line 185
    .line 186
    const v3, 0x8000

    .line 187
    .line 188
    const-string v4, "DID_GAIN_ACCESSIBILITY_FOCUS"

    .line 189
    .line 190
    .line 191
    invoke-direct {v0, v4, v1, v3}, Lio/flutter/view/AccessibilityBridge$Action;-><init>(Ljava/lang/String;II)V

    .line 192
    .line 193
    sput-object v0, Lio/flutter/view/AccessibilityBridge$Action;->DID_GAIN_ACCESSIBILITY_FOCUS:Lio/flutter/view/AccessibilityBridge$Action;

    .line 194
    .line 195
    new-instance v0, Lio/flutter/view/AccessibilityBridge$Action;

    .line 196
    .line 197
    const-string v1, "DID_LOSE_ACCESSIBILITY_FOCUS"

    .line 198
    .line 199
    const/high16 v3, 0x10000

    .line 200
    .line 201
    .line 202
    invoke-direct {v0, v1, v2, v3}, Lio/flutter/view/AccessibilityBridge$Action;-><init>(Ljava/lang/String;II)V

    .line 203
    .line 204
    sput-object v0, Lio/flutter/view/AccessibilityBridge$Action;->DID_LOSE_ACCESSIBILITY_FOCUS:Lio/flutter/view/AccessibilityBridge$Action;

    .line 205
    .line 206
    new-instance v0, Lio/flutter/view/AccessibilityBridge$Action;

    .line 207
    .line 208
    const/16 v1, 0x11

    .line 209
    .line 210
    const/high16 v2, 0x20000

    .line 211
    .line 212
    const-string v3, "CUSTOM_ACTION"

    .line 213
    .line 214
    .line 215
    invoke-direct {v0, v3, v1, v2}, Lio/flutter/view/AccessibilityBridge$Action;-><init>(Ljava/lang/String;II)V

    .line 216
    .line 217
    sput-object v0, Lio/flutter/view/AccessibilityBridge$Action;->CUSTOM_ACTION:Lio/flutter/view/AccessibilityBridge$Action;

    .line 218
    .line 219
    new-instance v0, Lio/flutter/view/AccessibilityBridge$Action;

    .line 220
    .line 221
    const/16 v1, 0x12

    .line 222
    .line 223
    const/high16 v2, 0x40000

    .line 224
    .line 225
    const-string v3, "DISMISS"

    .line 226
    .line 227
    .line 228
    invoke-direct {v0, v3, v1, v2}, Lio/flutter/view/AccessibilityBridge$Action;-><init>(Ljava/lang/String;II)V

    .line 229
    .line 230
    sput-object v0, Lio/flutter/view/AccessibilityBridge$Action;->DISMISS:Lio/flutter/view/AccessibilityBridge$Action;

    .line 231
    .line 232
    new-instance v0, Lio/flutter/view/AccessibilityBridge$Action;

    .line 233
    .line 234
    const/16 v1, 0x13

    .line 235
    .line 236
    const/high16 v2, 0x80000

    .line 237
    .line 238
    const-string v3, "MOVE_CURSOR_FORWARD_BY_WORD"

    .line 239
    .line 240
    .line 241
    invoke-direct {v0, v3, v1, v2}, Lio/flutter/view/AccessibilityBridge$Action;-><init>(Ljava/lang/String;II)V

    .line 242
    .line 243
    sput-object v0, Lio/flutter/view/AccessibilityBridge$Action;->MOVE_CURSOR_FORWARD_BY_WORD:Lio/flutter/view/AccessibilityBridge$Action;

    .line 244
    .line 245
    new-instance v0, Lio/flutter/view/AccessibilityBridge$Action;

    .line 246
    .line 247
    const/16 v1, 0x14

    .line 248
    .line 249
    const/high16 v2, 0x100000

    .line 250
    .line 251
    const-string v3, "MOVE_CURSOR_BACKWARD_BY_WORD"

    .line 252
    .line 253
    .line 254
    invoke-direct {v0, v3, v1, v2}, Lio/flutter/view/AccessibilityBridge$Action;-><init>(Ljava/lang/String;II)V

    .line 255
    .line 256
    sput-object v0, Lio/flutter/view/AccessibilityBridge$Action;->MOVE_CURSOR_BACKWARD_BY_WORD:Lio/flutter/view/AccessibilityBridge$Action;

    .line 257
    .line 258
    new-instance v0, Lio/flutter/view/AccessibilityBridge$Action;

    .line 259
    .line 260
    const/16 v1, 0x15

    .line 261
    .line 262
    const/high16 v2, 0x200000

    .line 263
    .line 264
    const-string v3, "SET_TEXT"

    .line 265
    .line 266
    .line 267
    invoke-direct {v0, v3, v1, v2}, Lio/flutter/view/AccessibilityBridge$Action;-><init>(Ljava/lang/String;II)V

    .line 268
    .line 269
    sput-object v0, Lio/flutter/view/AccessibilityBridge$Action;->SET_TEXT:Lio/flutter/view/AccessibilityBridge$Action;

    .line 270
    .line 271
    new-instance v0, Lio/flutter/view/AccessibilityBridge$Action;

    .line 272
    .line 273
    const/16 v1, 0x16

    .line 274
    .line 275
    const/high16 v2, 0x400000

    .line 276
    .line 277
    const-string v3, "FOCUS"

    .line 278
    .line 279
    .line 280
    invoke-direct {v0, v3, v1, v2}, Lio/flutter/view/AccessibilityBridge$Action;-><init>(Ljava/lang/String;II)V

    .line 281
    .line 282
    sput-object v0, Lio/flutter/view/AccessibilityBridge$Action;->FOCUS:Lio/flutter/view/AccessibilityBridge$Action;

    .line 283
    .line 284
    new-instance v0, Lio/flutter/view/AccessibilityBridge$Action;

    .line 285
    .line 286
    const/16 v1, 0x17

    .line 287
    .line 288
    const/high16 v2, 0x800000

    .line 289
    .line 290
    const-string v3, "SCROLL_TO_OFFSET"

    .line 291
    .line 292
    .line 293
    invoke-direct {v0, v3, v1, v2}, Lio/flutter/view/AccessibilityBridge$Action;-><init>(Ljava/lang/String;II)V

    .line 294
    .line 295
    sput-object v0, Lio/flutter/view/AccessibilityBridge$Action;->SCROLL_TO_OFFSET:Lio/flutter/view/AccessibilityBridge$Action;

    .line 296
    .line 297
    .line 298
    invoke-static {}, Lio/flutter/view/AccessibilityBridge$Action;->$values()[Lio/flutter/view/AccessibilityBridge$Action;

    .line 299
    move-result-object v0

    .line 300
    .line 301
    sput-object v0, Lio/flutter/view/AccessibilityBridge$Action;->$VALUES:[Lio/flutter/view/AccessibilityBridge$Action;

    .line 302
    return-void
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
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 4
    .line 5
    iput p3, p0, Lio/flutter/view/AccessibilityBridge$Action;->value:I

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
.end method

.method public static valueOf(Ljava/lang/String;)Lio/flutter/view/AccessibilityBridge$Action;
    .locals 1

    .line 1
    .line 2
    const-class v0, Lio/flutter/view/AccessibilityBridge$Action;

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Lio/flutter/view/AccessibilityBridge$Action;

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
.end method

.method public static values()[Lio/flutter/view/AccessibilityBridge$Action;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lio/flutter/view/AccessibilityBridge$Action;->$VALUES:[Lio/flutter/view/AccessibilityBridge$Action;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, [Lio/flutter/view/AccessibilityBridge$Action;->clone()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, [Lio/flutter/view/AccessibilityBridge$Action;

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
.end method
