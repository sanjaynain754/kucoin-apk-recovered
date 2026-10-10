.class public final enum Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker$TemplateType;
.super Ljava/lang/Enum;
.source "LiveTemplatePicker.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "TemplateType"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker$TemplateType$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker$TemplateType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0010\u0008\u0086\u0081\u0002\u0018\u0000 \u00122\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0012B!\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\tj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker$TemplateType;",
        "",
        "id",
        "",
        "desc",
        "icon",
        "<init>",
        "(Ljava/lang/String;IIII)V",
        "getId",
        "()I",
        "getDesc",
        "getIcon",
        "VERTICAL_DYNAMIC_GRID",
        "VERTICAL_DYNAMIC_FLOAT",
        "VERTICAL_STATIC_GRID",
        "VERTICAL_STATIC_FLOAT",
        "VERTICAL_DYNAMIC_GRID_CO_HOST",
        "VERTICAL_DYNAMIC_FLOAT_CO_HOST",
        "Companion",
        "tuilivekit_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker$TemplateType$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final enum VERTICAL_DYNAMIC_FLOAT:Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker$TemplateType;

.field public static final enum VERTICAL_DYNAMIC_FLOAT_CO_HOST:Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker$TemplateType;

.field public static final enum VERTICAL_DYNAMIC_GRID:Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker$TemplateType;

.field public static final enum VERTICAL_DYNAMIC_GRID_CO_HOST:Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker$TemplateType;

.field public static final enum VERTICAL_STATIC_FLOAT:Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker$TemplateType;

.field public static final enum VERTICAL_STATIC_GRID:Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker$TemplateType;

.field public static final synthetic b:[Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker$TemplateType;

.field public static final synthetic c:Lkotlin/enums/EnumEntries;


# instance fields
.field private final desc:I

.field private final icon:I

.field private final id:I


# direct methods
.method static constructor <clinit>()V
    .locals 17

    .line 1
    .line 2
    new-instance v0, Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker$TemplateType;

    .line 3
    .line 4
    sget v4, Lcom/trtc/uikit/livekit/R$string;->common_template_dynamic_grid:I

    .line 5
    .line 6
    sget v5, Lcom/trtc/uikit/livekit/R$drawable;->anchor_prepare_dynamic_grid:I

    .line 7
    .line 8
    const-string v1, "VERTICAL_DYNAMIC_GRID"

    .line 9
    const/4 v2, 0x0

    .line 10
    .line 11
    const/16 v3, 0x258

    .line 12
    .line 13
    .line 14
    invoke-direct/range {v0 .. v5}, Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker$TemplateType;-><init>(Ljava/lang/String;IIII)V

    .line 15
    .line 16
    sput-object v0, Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker$TemplateType;->VERTICAL_DYNAMIC_GRID:Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker$TemplateType;

    .line 17
    .line 18
    new-instance v5, Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker$TemplateType;

    .line 19
    .line 20
    sget v9, Lcom/trtc/uikit/livekit/R$string;->common_template_dynamic_float:I

    .line 21
    .line 22
    sget v10, Lcom/trtc/uikit/livekit/R$drawable;->anchor_prepare_dynamic_float:I

    .line 23
    .line 24
    const-string v6, "VERTICAL_DYNAMIC_FLOAT"

    .line 25
    const/4 v7, 0x1

    .line 26
    .line 27
    const/16 v8, 0x259

    .line 28
    .line 29
    .line 30
    invoke-direct/range {v5 .. v10}, Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker$TemplateType;-><init>(Ljava/lang/String;IIII)V

    .line 31
    .line 32
    sput-object v5, Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker$TemplateType;->VERTICAL_DYNAMIC_FLOAT:Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker$TemplateType;

    .line 33
    .line 34
    new-instance v10, Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker$TemplateType;

    .line 35
    .line 36
    sget v14, Lcom/trtc/uikit/livekit/R$string;->common_template_static_grid:I

    .line 37
    .line 38
    sget v15, Lcom/trtc/uikit/livekit/R$drawable;->anchor_prepare_static_grid:I

    .line 39
    .line 40
    const-string v11, "VERTICAL_STATIC_GRID"

    .line 41
    const/4 v12, 0x2

    .line 42
    .line 43
    const/16 v13, 0x320

    .line 44
    .line 45
    .line 46
    invoke-direct/range {v10 .. v15}, Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker$TemplateType;-><init>(Ljava/lang/String;IIII)V

    .line 47
    .line 48
    sput-object v10, Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker$TemplateType;->VERTICAL_STATIC_GRID:Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker$TemplateType;

    .line 49
    .line 50
    new-instance v11, Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker$TemplateType;

    .line 51
    .line 52
    sget v15, Lcom/trtc/uikit/livekit/R$string;->common_template_static_float:I

    .line 53
    .line 54
    sget v16, Lcom/trtc/uikit/livekit/R$drawable;->anchor_prepare_static_float:I

    .line 55
    .line 56
    const-string v12, "VERTICAL_STATIC_FLOAT"

    .line 57
    const/4 v13, 0x3

    .line 58
    .line 59
    const/16 v14, 0x321

    .line 60
    .line 61
    .line 62
    invoke-direct/range {v11 .. v16}, Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker$TemplateType;-><init>(Ljava/lang/String;IIII)V

    .line 63
    .line 64
    sput-object v11, Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker$TemplateType;->VERTICAL_STATIC_FLOAT:Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker$TemplateType;

    .line 65
    .line 66
    new-instance v1, Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker$TemplateType;

    .line 67
    move v5, v4

    .line 68
    .line 69
    const/16 v4, 0x258

    .line 70
    .line 71
    sget v6, Lcom/trtc/uikit/livekit/R$drawable;->anchor_prepare_dynamic_grid_co_host:I

    .line 72
    .line 73
    const-string v2, "VERTICAL_DYNAMIC_GRID_CO_HOST"

    .line 74
    const/4 v3, 0x4

    .line 75
    .line 76
    .line 77
    invoke-direct/range {v1 .. v6}, Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker$TemplateType;-><init>(Ljava/lang/String;IIII)V

    .line 78
    .line 79
    sput-object v1, Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker$TemplateType;->VERTICAL_DYNAMIC_GRID_CO_HOST:Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker$TemplateType;

    .line 80
    .line 81
    new-instance v6, Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker$TemplateType;

    .line 82
    move v10, v9

    .line 83
    .line 84
    const/16 v9, 0x259

    .line 85
    .line 86
    sget v11, Lcom/trtc/uikit/livekit/R$drawable;->anchor_prepare_dynamic_float_co_host:I

    .line 87
    .line 88
    const-string v7, "VERTICAL_DYNAMIC_FLOAT_CO_HOST"

    .line 89
    const/4 v8, 0x5

    .line 90
    .line 91
    .line 92
    invoke-direct/range {v6 .. v11}, Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker$TemplateType;-><init>(Ljava/lang/String;IIII)V

    .line 93
    .line 94
    sput-object v6, Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker$TemplateType;->VERTICAL_DYNAMIC_FLOAT_CO_HOST:Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker$TemplateType;

    .line 95
    .line 96
    .line 97
    invoke-static {}, Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker$TemplateType;->a()[Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker$TemplateType;

    .line 98
    move-result-object v0

    .line 99
    .line 100
    sput-object v0, Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker$TemplateType;->b:[Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker$TemplateType;

    .line 101
    .line 102
    .line 103
    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    .line 104
    move-result-object v0

    .line 105
    .line 106
    sput-object v0, Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker$TemplateType;->c:Lkotlin/enums/EnumEntries;

    .line 107
    .line 108
    new-instance v0, Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker$TemplateType$Companion;

    .line 109
    const/4 v1, 0x0

    .line 110
    .line 111
    .line 112
    invoke-direct {v0, v1}, Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker$TemplateType$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 113
    .line 114
    sput-object v0, Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker$TemplateType;->Companion:Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker$TemplateType$Companion;

    .line 115
    return-void
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
.end method

.method public constructor <init>(Ljava/lang/String;IIII)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(III)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 4
    .line 5
    iput p3, p0, Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker$TemplateType;->id:I

    .line 6
    .line 7
    iput p4, p0, Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker$TemplateType;->desc:I

    .line 8
    .line 9
    iput p5, p0, Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker$TemplateType;->icon:I

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
.end method

.method public static final synthetic a()[Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker$TemplateType;
    .locals 6

    .line 1
    .line 2
    sget-object v0, Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker$TemplateType;->VERTICAL_DYNAMIC_GRID:Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker$TemplateType;

    .line 3
    .line 4
    sget-object v1, Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker$TemplateType;->VERTICAL_DYNAMIC_FLOAT:Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker$TemplateType;

    .line 5
    .line 6
    sget-object v2, Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker$TemplateType;->VERTICAL_STATIC_GRID:Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker$TemplateType;

    .line 7
    .line 8
    sget-object v3, Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker$TemplateType;->VERTICAL_STATIC_FLOAT:Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker$TemplateType;

    .line 9
    .line 10
    sget-object v4, Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker$TemplateType;->VERTICAL_DYNAMIC_GRID_CO_HOST:Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker$TemplateType;

    .line 11
    .line 12
    sget-object v5, Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker$TemplateType;->VERTICAL_DYNAMIC_FLOAT_CO_HOST:Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker$TemplateType;

    .line 13
    .line 14
    .line 15
    filled-new-array/range {v0 .. v5}, [Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker$TemplateType;

    .line 16
    move-result-object v0

    .line 17
    return-object v0
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

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker$TemplateType;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker$TemplateType;->c:Lkotlin/enums/EnumEntries;

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

.method public static valueOf(Ljava/lang/String;)Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker$TemplateType;
    .locals 1

    .line 1
    .line 2
    const-class v0, Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker$TemplateType;

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker$TemplateType;

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

.method public static values()[Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker$TemplateType;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker$TemplateType;->b:[Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker$TemplateType;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, [Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker$TemplateType;

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


# virtual methods
.method public final getDesc()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker$TemplateType;->desc:I

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

.method public final getIcon()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker$TemplateType;->icon:I

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

.method public final getId()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker$TemplateType;->id:I

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
