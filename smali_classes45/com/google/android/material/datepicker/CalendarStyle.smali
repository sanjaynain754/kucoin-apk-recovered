.class final Lcom/google/android/material/datepicker/CalendarStyle;
.super Ljava/lang/Object;
.source "CalendarStyle.java"


# instance fields
.field final day:Lcom/google/android/material/datepicker/CalendarItemStyle;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field final invalidDay:Lcom/google/android/material/datepicker/CalendarItemStyle;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field final rangeFill:Landroid/graphics/Paint;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field final selectedDay:Lcom/google/android/material/datepicker/CalendarItemStyle;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field final selectedYear:Lcom/google/android/material/datepicker/CalendarItemStyle;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field final todayDay:Lcom/google/android/material/datepicker/CalendarItemStyle;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field final todayYear:Lcom/google/android/material/datepicker/CalendarItemStyle;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field final year:Lcom/google/android/material/datepicker/CalendarItemStyle;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 4
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    sget v0, Lcom/google/android/material/R$attr;->materialCalendarStyle:I

    .line 6
    .line 7
    const-class v1, Lcom/google/android/material/datepicker/MaterialCalendar;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 11
    move-result-object v1

    .line 12
    .line 13
    .line 14
    invoke-static {p1, v0, v1}, Lcom/google/android/material/resources/MaterialAttributes;->resolveOrThrow(Landroid/content/Context;ILjava/lang/String;)I

    .line 15
    move-result v0

    .line 16
    .line 17
    sget-object v1, Lcom/google/android/material/R$styleable;->MaterialCalendar:[I

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    sget v1, Lcom/google/android/material/R$styleable;->MaterialCalendar_dayStyle:I

    .line 24
    const/4 v2, 0x0

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 28
    move-result v1

    .line 29
    .line 30
    .line 31
    invoke-static {p1, v1}, Lcom/google/android/material/datepicker/CalendarItemStyle;->create(Landroid/content/Context;I)Lcom/google/android/material/datepicker/CalendarItemStyle;

    .line 32
    move-result-object v1

    .line 33
    .line 34
    iput-object v1, p0, Lcom/google/android/material/datepicker/CalendarStyle;->day:Lcom/google/android/material/datepicker/CalendarItemStyle;

    .line 35
    .line 36
    sget v1, Lcom/google/android/material/R$styleable;->MaterialCalendar_dayInvalidStyle:I

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 40
    move-result v1

    .line 41
    .line 42
    .line 43
    invoke-static {p1, v1}, Lcom/google/android/material/datepicker/CalendarItemStyle;->create(Landroid/content/Context;I)Lcom/google/android/material/datepicker/CalendarItemStyle;

    .line 44
    move-result-object v1

    .line 45
    .line 46
    iput-object v1, p0, Lcom/google/android/material/datepicker/CalendarStyle;->invalidDay:Lcom/google/android/material/datepicker/CalendarItemStyle;

    .line 47
    .line 48
    sget v1, Lcom/google/android/material/R$styleable;->MaterialCalendar_daySelectedStyle:I

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 52
    move-result v1

    .line 53
    .line 54
    .line 55
    invoke-static {p1, v1}, Lcom/google/android/material/datepicker/CalendarItemStyle;->create(Landroid/content/Context;I)Lcom/google/android/material/datepicker/CalendarItemStyle;

    .line 56
    move-result-object v1

    .line 57
    .line 58
    iput-object v1, p0, Lcom/google/android/material/datepicker/CalendarStyle;->selectedDay:Lcom/google/android/material/datepicker/CalendarItemStyle;

    .line 59
    .line 60
    sget v1, Lcom/google/android/material/R$styleable;->MaterialCalendar_dayTodayStyle:I

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 64
    move-result v1

    .line 65
    .line 66
    .line 67
    invoke-static {p1, v1}, Lcom/google/android/material/datepicker/CalendarItemStyle;->create(Landroid/content/Context;I)Lcom/google/android/material/datepicker/CalendarItemStyle;

    .line 68
    move-result-object v1

    .line 69
    .line 70
    iput-object v1, p0, Lcom/google/android/material/datepicker/CalendarStyle;->todayDay:Lcom/google/android/material/datepicker/CalendarItemStyle;

    .line 71
    .line 72
    sget v1, Lcom/google/android/material/R$styleable;->MaterialCalendar_rangeFillColor:I

    .line 73
    .line 74
    .line 75
    invoke-static {p1, v0, v1}, Lcom/google/android/material/resources/MaterialResources;->getColorStateList(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    .line 76
    move-result-object v1

    .line 77
    .line 78
    sget v3, Lcom/google/android/material/R$styleable;->MaterialCalendar_yearStyle:I

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0, v3, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 82
    move-result v3

    .line 83
    .line 84
    .line 85
    invoke-static {p1, v3}, Lcom/google/android/material/datepicker/CalendarItemStyle;->create(Landroid/content/Context;I)Lcom/google/android/material/datepicker/CalendarItemStyle;

    .line 86
    move-result-object v3

    .line 87
    .line 88
    iput-object v3, p0, Lcom/google/android/material/datepicker/CalendarStyle;->year:Lcom/google/android/material/datepicker/CalendarItemStyle;

    .line 89
    .line 90
    sget v3, Lcom/google/android/material/R$styleable;->MaterialCalendar_yearSelectedStyle:I

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0, v3, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 94
    move-result v3

    .line 95
    .line 96
    .line 97
    invoke-static {p1, v3}, Lcom/google/android/material/datepicker/CalendarItemStyle;->create(Landroid/content/Context;I)Lcom/google/android/material/datepicker/CalendarItemStyle;

    .line 98
    move-result-object v3

    .line 99
    .line 100
    iput-object v3, p0, Lcom/google/android/material/datepicker/CalendarStyle;->selectedYear:Lcom/google/android/material/datepicker/CalendarItemStyle;

    .line 101
    .line 102
    sget v3, Lcom/google/android/material/R$styleable;->MaterialCalendar_yearTodayStyle:I

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0, v3, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 106
    move-result v2

    .line 107
    .line 108
    .line 109
    invoke-static {p1, v2}, Lcom/google/android/material/datepicker/CalendarItemStyle;->create(Landroid/content/Context;I)Lcom/google/android/material/datepicker/CalendarItemStyle;

    .line 110
    move-result-object p1

    .line 111
    .line 112
    iput-object p1, p0, Lcom/google/android/material/datepicker/CalendarStyle;->todayYear:Lcom/google/android/material/datepicker/CalendarItemStyle;

    .line 113
    .line 114
    new-instance p1, Landroid/graphics/Paint;

    .line 115
    .line 116
    .line 117
    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    .line 118
    .line 119
    iput-object p1, p0, Lcom/google/android/material/datepicker/CalendarStyle;->rangeFill:Landroid/graphics/Paint;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v1}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    .line 123
    move-result v1

    .line 124
    .line 125
    .line 126
    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 130
    return-void
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
.end method
