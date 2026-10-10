.class public Landroidx/constraintlayout/core/Metrics;
.super Ljava/lang/Object;
.source "Metrics.java"


# instance fields
.field public additionalMeasures:J

.field public bfs:J

.field public constraints:J

.field public determineGroups:J

.field public errors:J

.field public extravariables:J

.field public fullySolved:J

.field public graphOptimizer:J

.field public graphSolved:J

.field public grouping:J

.field public infeasibleDetermineGroups:J

.field public iterations:J

.field public lastTableSize:J

.field public layouts:J

.field public linearSolved:J

.field public mChildCount:J

.field public mEquations:J

.field public mMeasureCalls:J

.field public mMeasureDuration:J

.field public mNumberOfLayouts:I

.field public mNumberOfMeasures:I

.field public mSimpleEquations:J

.field public mSolverPasses:J

.field public mVariables:J

.field public maxRows:J

.field public maxTableSize:J

.field public maxVariables:J

.field public measuredMatchWidgets:J

.field public measuredWidgets:J

.field public measures:J

.field public measuresLayoutDuration:J

.field public measuresWidgetsDuration:J

.field public measuresWrap:J

.field public measuresWrapInfeasible:J

.field public minimize:J

.field public minimizeGoal:J

.field public nonresolvedWidgets:J

.field public optimize:J

.field public pivots:J

.field public problematicLayouts:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public resolutions:J

.field public resolvedWidgets:J

.field public simpleconstraints:J

.field public slackvariables:J

.field public tableSizeIncrease:J

.field public variables:J

.field public widgets:J


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Landroidx/constraintlayout/core/Metrics;->problematicLayouts:Ljava/util/ArrayList;

    .line 11
    return-void
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


# virtual methods
.method public copy(Landroidx/constraintlayout/core/Metrics;)V
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p1, Landroidx/constraintlayout/core/Metrics;->mVariables:J

    .line 3
    .line 4
    iput-wide v0, p0, Landroidx/constraintlayout/core/Metrics;->mVariables:J

    .line 5
    .line 6
    iget-wide v0, p1, Landroidx/constraintlayout/core/Metrics;->mEquations:J

    .line 7
    .line 8
    iput-wide v0, p0, Landroidx/constraintlayout/core/Metrics;->mEquations:J

    .line 9
    .line 10
    iget-wide v0, p1, Landroidx/constraintlayout/core/Metrics;->mSimpleEquations:J

    .line 11
    .line 12
    iput-wide v0, p0, Landroidx/constraintlayout/core/Metrics;->mSimpleEquations:J

    .line 13
    .line 14
    iget v0, p1, Landroidx/constraintlayout/core/Metrics;->mNumberOfMeasures:I

    .line 15
    .line 16
    iput v0, p0, Landroidx/constraintlayout/core/Metrics;->mNumberOfMeasures:I

    .line 17
    .line 18
    iget v0, p1, Landroidx/constraintlayout/core/Metrics;->mNumberOfLayouts:I

    .line 19
    .line 20
    iput v0, p0, Landroidx/constraintlayout/core/Metrics;->mNumberOfLayouts:I

    .line 21
    .line 22
    iget-wide v0, p1, Landroidx/constraintlayout/core/Metrics;->mMeasureDuration:J

    .line 23
    .line 24
    iput-wide v0, p0, Landroidx/constraintlayout/core/Metrics;->mMeasureDuration:J

    .line 25
    .line 26
    iget-wide v0, p1, Landroidx/constraintlayout/core/Metrics;->mChildCount:J

    .line 27
    .line 28
    iput-wide v0, p0, Landroidx/constraintlayout/core/Metrics;->mChildCount:J

    .line 29
    .line 30
    iget-wide v0, p1, Landroidx/constraintlayout/core/Metrics;->mMeasureCalls:J

    .line 31
    .line 32
    iput-wide v0, p0, Landroidx/constraintlayout/core/Metrics;->mMeasureCalls:J

    .line 33
    .line 34
    iget-wide v0, p1, Landroidx/constraintlayout/core/Metrics;->measuresWidgetsDuration:J

    .line 35
    .line 36
    iput-wide v0, p0, Landroidx/constraintlayout/core/Metrics;->measuresWidgetsDuration:J

    .line 37
    .line 38
    iget-wide v0, p1, Landroidx/constraintlayout/core/Metrics;->mSolverPasses:J

    .line 39
    .line 40
    iput-wide v0, p0, Landroidx/constraintlayout/core/Metrics;->mSolverPasses:J

    .line 41
    .line 42
    iget-wide v0, p1, Landroidx/constraintlayout/core/Metrics;->measuresLayoutDuration:J

    .line 43
    .line 44
    iput-wide v0, p0, Landroidx/constraintlayout/core/Metrics;->measuresLayoutDuration:J

    .line 45
    .line 46
    iget-wide v0, p1, Landroidx/constraintlayout/core/Metrics;->measures:J

    .line 47
    .line 48
    iput-wide v0, p0, Landroidx/constraintlayout/core/Metrics;->measures:J

    .line 49
    .line 50
    iget-wide v0, p1, Landroidx/constraintlayout/core/Metrics;->widgets:J

    .line 51
    .line 52
    iput-wide v0, p0, Landroidx/constraintlayout/core/Metrics;->widgets:J

    .line 53
    .line 54
    iget-wide v0, p1, Landroidx/constraintlayout/core/Metrics;->additionalMeasures:J

    .line 55
    .line 56
    iput-wide v0, p0, Landroidx/constraintlayout/core/Metrics;->additionalMeasures:J

    .line 57
    .line 58
    iget-wide v0, p1, Landroidx/constraintlayout/core/Metrics;->resolutions:J

    .line 59
    .line 60
    iput-wide v0, p0, Landroidx/constraintlayout/core/Metrics;->resolutions:J

    .line 61
    .line 62
    iget-wide v0, p1, Landroidx/constraintlayout/core/Metrics;->tableSizeIncrease:J

    .line 63
    .line 64
    iput-wide v0, p0, Landroidx/constraintlayout/core/Metrics;->tableSizeIncrease:J

    .line 65
    .line 66
    iget-wide v0, p1, Landroidx/constraintlayout/core/Metrics;->maxTableSize:J

    .line 67
    .line 68
    iput-wide v0, p0, Landroidx/constraintlayout/core/Metrics;->maxTableSize:J

    .line 69
    .line 70
    iget-wide v0, p1, Landroidx/constraintlayout/core/Metrics;->lastTableSize:J

    .line 71
    .line 72
    iput-wide v0, p0, Landroidx/constraintlayout/core/Metrics;->lastTableSize:J

    .line 73
    .line 74
    iget-wide v0, p1, Landroidx/constraintlayout/core/Metrics;->maxVariables:J

    .line 75
    .line 76
    iput-wide v0, p0, Landroidx/constraintlayout/core/Metrics;->maxVariables:J

    .line 77
    .line 78
    iget-wide v0, p1, Landroidx/constraintlayout/core/Metrics;->maxRows:J

    .line 79
    .line 80
    iput-wide v0, p0, Landroidx/constraintlayout/core/Metrics;->maxRows:J

    .line 81
    .line 82
    iget-wide v0, p1, Landroidx/constraintlayout/core/Metrics;->minimize:J

    .line 83
    .line 84
    iput-wide v0, p0, Landroidx/constraintlayout/core/Metrics;->minimize:J

    .line 85
    .line 86
    iget-wide v0, p1, Landroidx/constraintlayout/core/Metrics;->minimizeGoal:J

    .line 87
    .line 88
    iput-wide v0, p0, Landroidx/constraintlayout/core/Metrics;->minimizeGoal:J

    .line 89
    .line 90
    iget-wide v0, p1, Landroidx/constraintlayout/core/Metrics;->constraints:J

    .line 91
    .line 92
    iput-wide v0, p0, Landroidx/constraintlayout/core/Metrics;->constraints:J

    .line 93
    .line 94
    iget-wide v0, p1, Landroidx/constraintlayout/core/Metrics;->simpleconstraints:J

    .line 95
    .line 96
    iput-wide v0, p0, Landroidx/constraintlayout/core/Metrics;->simpleconstraints:J

    .line 97
    .line 98
    iget-wide v0, p1, Landroidx/constraintlayout/core/Metrics;->optimize:J

    .line 99
    .line 100
    iput-wide v0, p0, Landroidx/constraintlayout/core/Metrics;->optimize:J

    .line 101
    .line 102
    iget-wide v0, p1, Landroidx/constraintlayout/core/Metrics;->iterations:J

    .line 103
    .line 104
    iput-wide v0, p0, Landroidx/constraintlayout/core/Metrics;->iterations:J

    .line 105
    .line 106
    iget-wide v0, p1, Landroidx/constraintlayout/core/Metrics;->pivots:J

    .line 107
    .line 108
    iput-wide v0, p0, Landroidx/constraintlayout/core/Metrics;->pivots:J

    .line 109
    .line 110
    iget-wide v0, p1, Landroidx/constraintlayout/core/Metrics;->bfs:J

    .line 111
    .line 112
    iput-wide v0, p0, Landroidx/constraintlayout/core/Metrics;->bfs:J

    .line 113
    .line 114
    iget-wide v0, p1, Landroidx/constraintlayout/core/Metrics;->variables:J

    .line 115
    .line 116
    iput-wide v0, p0, Landroidx/constraintlayout/core/Metrics;->variables:J

    .line 117
    .line 118
    iget-wide v0, p1, Landroidx/constraintlayout/core/Metrics;->errors:J

    .line 119
    .line 120
    iput-wide v0, p0, Landroidx/constraintlayout/core/Metrics;->errors:J

    .line 121
    .line 122
    iget-wide v0, p1, Landroidx/constraintlayout/core/Metrics;->slackvariables:J

    .line 123
    .line 124
    iput-wide v0, p0, Landroidx/constraintlayout/core/Metrics;->slackvariables:J

    .line 125
    .line 126
    iget-wide v0, p1, Landroidx/constraintlayout/core/Metrics;->extravariables:J

    .line 127
    .line 128
    iput-wide v0, p0, Landroidx/constraintlayout/core/Metrics;->extravariables:J

    .line 129
    .line 130
    iget-wide v0, p1, Landroidx/constraintlayout/core/Metrics;->fullySolved:J

    .line 131
    .line 132
    iput-wide v0, p0, Landroidx/constraintlayout/core/Metrics;->fullySolved:J

    .line 133
    .line 134
    iget-wide v0, p1, Landroidx/constraintlayout/core/Metrics;->graphOptimizer:J

    .line 135
    .line 136
    iput-wide v0, p0, Landroidx/constraintlayout/core/Metrics;->graphOptimizer:J

    .line 137
    .line 138
    iget-wide v0, p1, Landroidx/constraintlayout/core/Metrics;->graphSolved:J

    .line 139
    .line 140
    iput-wide v0, p0, Landroidx/constraintlayout/core/Metrics;->graphSolved:J

    .line 141
    .line 142
    iget-wide v0, p1, Landroidx/constraintlayout/core/Metrics;->resolvedWidgets:J

    .line 143
    .line 144
    iput-wide v0, p0, Landroidx/constraintlayout/core/Metrics;->resolvedWidgets:J

    .line 145
    .line 146
    iget-wide v0, p1, Landroidx/constraintlayout/core/Metrics;->nonresolvedWidgets:J

    .line 147
    .line 148
    iput-wide v0, p0, Landroidx/constraintlayout/core/Metrics;->nonresolvedWidgets:J

    .line 149
    return-void
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
.end method

.method public reset()V
    .locals 3

    .line 1
    .line 2
    const-wide/16 v0, 0x0

    .line 3
    .line 4
    iput-wide v0, p0, Landroidx/constraintlayout/core/Metrics;->measures:J

    .line 5
    .line 6
    iput-wide v0, p0, Landroidx/constraintlayout/core/Metrics;->widgets:J

    .line 7
    .line 8
    iput-wide v0, p0, Landroidx/constraintlayout/core/Metrics;->additionalMeasures:J

    .line 9
    .line 10
    iput-wide v0, p0, Landroidx/constraintlayout/core/Metrics;->resolutions:J

    .line 11
    .line 12
    iput-wide v0, p0, Landroidx/constraintlayout/core/Metrics;->tableSizeIncrease:J

    .line 13
    .line 14
    iput-wide v0, p0, Landroidx/constraintlayout/core/Metrics;->maxTableSize:J

    .line 15
    .line 16
    iput-wide v0, p0, Landroidx/constraintlayout/core/Metrics;->lastTableSize:J

    .line 17
    .line 18
    iput-wide v0, p0, Landroidx/constraintlayout/core/Metrics;->maxVariables:J

    .line 19
    .line 20
    iput-wide v0, p0, Landroidx/constraintlayout/core/Metrics;->maxRows:J

    .line 21
    .line 22
    iput-wide v0, p0, Landroidx/constraintlayout/core/Metrics;->minimize:J

    .line 23
    .line 24
    iput-wide v0, p0, Landroidx/constraintlayout/core/Metrics;->minimizeGoal:J

    .line 25
    .line 26
    iput-wide v0, p0, Landroidx/constraintlayout/core/Metrics;->constraints:J

    .line 27
    .line 28
    iput-wide v0, p0, Landroidx/constraintlayout/core/Metrics;->simpleconstraints:J

    .line 29
    .line 30
    iput-wide v0, p0, Landroidx/constraintlayout/core/Metrics;->optimize:J

    .line 31
    .line 32
    iput-wide v0, p0, Landroidx/constraintlayout/core/Metrics;->iterations:J

    .line 33
    .line 34
    iput-wide v0, p0, Landroidx/constraintlayout/core/Metrics;->pivots:J

    .line 35
    .line 36
    iput-wide v0, p0, Landroidx/constraintlayout/core/Metrics;->bfs:J

    .line 37
    .line 38
    iput-wide v0, p0, Landroidx/constraintlayout/core/Metrics;->variables:J

    .line 39
    .line 40
    iput-wide v0, p0, Landroidx/constraintlayout/core/Metrics;->errors:J

    .line 41
    .line 42
    iput-wide v0, p0, Landroidx/constraintlayout/core/Metrics;->slackvariables:J

    .line 43
    .line 44
    iput-wide v0, p0, Landroidx/constraintlayout/core/Metrics;->extravariables:J

    .line 45
    .line 46
    iput-wide v0, p0, Landroidx/constraintlayout/core/Metrics;->fullySolved:J

    .line 47
    .line 48
    iput-wide v0, p0, Landroidx/constraintlayout/core/Metrics;->graphOptimizer:J

    .line 49
    .line 50
    iput-wide v0, p0, Landroidx/constraintlayout/core/Metrics;->graphSolved:J

    .line 51
    .line 52
    iput-wide v0, p0, Landroidx/constraintlayout/core/Metrics;->resolvedWidgets:J

    .line 53
    .line 54
    iput-wide v0, p0, Landroidx/constraintlayout/core/Metrics;->nonresolvedWidgets:J

    .line 55
    .line 56
    iput-wide v0, p0, Landroidx/constraintlayout/core/Metrics;->linearSolved:J

    .line 57
    .line 58
    iget-object v2, p0, Landroidx/constraintlayout/core/Metrics;->problematicLayouts:Ljava/util/ArrayList;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 62
    const/4 v2, 0x0

    .line 63
    .line 64
    iput v2, p0, Landroidx/constraintlayout/core/Metrics;->mNumberOfMeasures:I

    .line 65
    .line 66
    iput v2, p0, Landroidx/constraintlayout/core/Metrics;->mNumberOfLayouts:I

    .line 67
    .line 68
    iput-wide v0, p0, Landroidx/constraintlayout/core/Metrics;->measuresWidgetsDuration:J

    .line 69
    .line 70
    iput-wide v0, p0, Landroidx/constraintlayout/core/Metrics;->measuresLayoutDuration:J

    .line 71
    .line 72
    iput-wide v0, p0, Landroidx/constraintlayout/core/Metrics;->mChildCount:J

    .line 73
    .line 74
    iput-wide v0, p0, Landroidx/constraintlayout/core/Metrics;->mMeasureDuration:J

    .line 75
    .line 76
    iput-wide v0, p0, Landroidx/constraintlayout/core/Metrics;->mMeasureCalls:J

    .line 77
    .line 78
    iput-wide v0, p0, Landroidx/constraintlayout/core/Metrics;->mSolverPasses:J

    .line 79
    .line 80
    iput-wide v0, p0, Landroidx/constraintlayout/core/Metrics;->mVariables:J

    .line 81
    .line 82
    iput-wide v0, p0, Landroidx/constraintlayout/core/Metrics;->mEquations:J

    .line 83
    .line 84
    iput-wide v0, p0, Landroidx/constraintlayout/core/Metrics;->mSimpleEquations:J

    .line 85
    return-void
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
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    const-string v1, "\n*** Metrics ***\nmeasures: "

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    iget-wide v1, p0, Landroidx/constraintlayout/core/Metrics;->measures:J

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v1, "\nmeasuresWrap: "

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    iget-wide v1, p0, Landroidx/constraintlayout/core/Metrics;->measuresWrap:J

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    const-string v1, "\nmeasuresWrapInfeasible: "

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    iget-wide v1, p0, Landroidx/constraintlayout/core/Metrics;->measuresWrapInfeasible:J

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    const-string v1, "\ndetermineGroups: "

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    iget-wide v1, p0, Landroidx/constraintlayout/core/Metrics;->determineGroups:J

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    const-string v1, "\ninfeasibleDetermineGroups: "

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    iget-wide v1, p0, Landroidx/constraintlayout/core/Metrics;->infeasibleDetermineGroups:J

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    const-string v1, "\ngraphOptimizer: "

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    iget-wide v1, p0, Landroidx/constraintlayout/core/Metrics;->graphOptimizer:J

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    const-string v1, "\nwidgets: "

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    iget-wide v1, p0, Landroidx/constraintlayout/core/Metrics;->widgets:J

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    const-string v1, "\ngraphSolved: "

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    iget-wide v1, p0, Landroidx/constraintlayout/core/Metrics;->graphSolved:J

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    const-string v1, "\nlinearSolved: "

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    iget-wide v1, p0, Landroidx/constraintlayout/core/Metrics;->linearSolved:J

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    const-string v1, "\n"

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 104
    move-result-object v0

    .line 105
    return-object v0
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
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
.end method
