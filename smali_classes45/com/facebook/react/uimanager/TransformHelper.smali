.class public Lcom/facebook/react/uimanager/TransformHelper;
.super Ljava/lang/Object;
.source "TransformHelper.java"


# static fields
.field private static sHelperMatrix:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "[D>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/react/uimanager/TransformHelper$1;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/facebook/react/uimanager/TransformHelper$1;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/facebook/react/uimanager/TransformHelper;->sHelperMatrix:Ljava/lang/ThreadLocal;

    .line 8
    return-void
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
.end method

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
.end method

.method private static convertToRadians(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)D
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-interface {p0, p1}, Lcom/facebook/react/bridge/ReadableMap;->getType(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableType;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    sget-object v1, Lcom/facebook/react/bridge/ReadableType;->String:Lcom/facebook/react/bridge/ReadableType;

    .line 7
    const/4 v2, 0x1

    .line 8
    .line 9
    if-ne v0, v1, :cond_2

    .line 10
    .line 11
    .line 12
    invoke-interface {p0, p1}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 13
    move-result-object p0

    .line 14
    .line 15
    .line 16
    const-string/jumbo p1, "rad"

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, p1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 20
    move-result p1

    .line 21
    const/4 v0, 0x0

    .line 22
    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 27
    move-result p1

    .line 28
    .line 29
    add-int/lit8 p1, p1, -0x3

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, v0, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 33
    move-result-object p0

    .line 34
    goto :goto_0

    .line 35
    .line 36
    :cond_0
    const-string p1, "deg"

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0, p1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 40
    move-result p1

    .line 41
    .line 42
    if-eqz p1, :cond_1

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 46
    move-result p1

    .line 47
    .line 48
    add-int/lit8 p1, p1, -0x3

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0, v0, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 52
    move-result-object p0

    .line 53
    move v2, v0

    .line 54
    .line 55
    .line 56
    :cond_1
    :goto_0
    invoke-static {p0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 57
    move-result p0

    .line 58
    float-to-double p0, p0

    .line 59
    goto :goto_1

    .line 60
    .line 61
    .line 62
    :cond_2
    invoke-interface {p0, p1}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    .line 63
    move-result-wide p0

    .line 64
    .line 65
    :goto_1
    if-eqz v2, :cond_3

    .line 66
    return-wide p0

    .line 67
    .line 68
    .line 69
    :cond_3
    invoke-static {p0, p1}, Lcom/facebook/react/uimanager/MatrixMathHelper;->degreesToRadians(D)D

    .line 70
    move-result-wide p0

    .line 71
    return-wide p0
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
.end method

.method private static getTranslateForTransformOrigin(FFLcom/facebook/react/bridge/ReadableArray;Z)[F
    .locals 10

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x3

    .line 4
    const/4 v3, 0x1

    .line 5
    .line 6
    if-eqz p2, :cond_6

    .line 7
    const/4 v4, 0x0

    .line 8
    .line 9
    cmpl-float v5, p1, v4

    .line 10
    .line 11
    if-nez v5, :cond_0

    .line 12
    .line 13
    cmpl-float v5, p0, v4

    .line 14
    .line 15
    if-nez v5, :cond_0

    .line 16
    .line 17
    goto/16 :goto_3

    .line 18
    .line 19
    :cond_0
    const/high16 v5, 0x40000000    # 2.0f

    .line 20
    .line 21
    div-float v6, p0, v5

    .line 22
    .line 23
    div-float v5, p1, v5

    .line 24
    .line 25
    new-array v7, v2, [F

    .line 26
    .line 27
    aput v6, v7, v1

    .line 28
    .line 29
    aput v5, v7, v3

    .line 30
    .line 31
    aput v4, v7, v0

    .line 32
    move v4, v1

    .line 33
    .line 34
    .line 35
    :goto_0
    invoke-interface {p2}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    .line 36
    move-result v8

    .line 37
    .line 38
    if-ge v4, v8, :cond_5

    .line 39
    .line 40
    if-ge v4, v2, :cond_5

    .line 41
    .line 42
    sget-object v8, Lcom/facebook/react/uimanager/TransformHelper$2;->$SwitchMap$com$facebook$react$bridge$ReadableType:[I

    .line 43
    .line 44
    .line 45
    invoke-interface {p2, v4}, Lcom/facebook/react/bridge/ReadableArray;->getType(I)Lcom/facebook/react/bridge/ReadableType;

    .line 46
    move-result-object v9

    .line 47
    .line 48
    .line 49
    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    .line 50
    move-result v9

    .line 51
    .line 52
    aget v8, v8, v9

    .line 53
    .line 54
    if-eq v8, v3, :cond_3

    .line 55
    .line 56
    if-eq v8, v0, :cond_1

    .line 57
    goto :goto_2

    .line 58
    .line 59
    :cond_1
    if-eqz p3, :cond_4

    .line 60
    .line 61
    .line 62
    invoke-interface {p2, v4}, Lcom/facebook/react/bridge/ReadableArray;->getString(I)Ljava/lang/String;

    .line 63
    move-result-object v8

    .line 64
    .line 65
    const-string v9, "%"

    .line 66
    .line 67
    .line 68
    invoke-virtual {v8, v9}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 69
    move-result v9

    .line 70
    .line 71
    if-eqz v9, :cond_4

    .line 72
    .line 73
    .line 74
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 75
    move-result v9

    .line 76
    sub-int/2addr v9, v3

    .line 77
    .line 78
    .line 79
    invoke-virtual {v8, v1, v9}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 80
    move-result-object v8

    .line 81
    .line 82
    .line 83
    invoke-static {v8}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 84
    move-result v8

    .line 85
    .line 86
    if-nez v4, :cond_2

    .line 87
    move v9, p0

    .line 88
    goto :goto_1

    .line 89
    :cond_2
    move v9, p1

    .line 90
    :goto_1
    mul-float/2addr v9, v8

    .line 91
    .line 92
    const/high16 v8, 0x42c80000    # 100.0f

    .line 93
    div-float/2addr v9, v8

    .line 94
    .line 95
    aput v9, v7, v4

    .line 96
    goto :goto_2

    .line 97
    .line 98
    .line 99
    :cond_3
    invoke-interface {p2, v4}, Lcom/facebook/react/bridge/ReadableArray;->getDouble(I)D

    .line 100
    move-result-wide v8

    .line 101
    double-to-float v8, v8

    .line 102
    .line 103
    aput v8, v7, v4

    .line 104
    :cond_4
    :goto_2
    add-int/2addr v4, v3

    .line 105
    goto :goto_0

    .line 106
    :cond_5
    neg-float p0, v6

    .line 107
    .line 108
    aget p1, v7, v1

    .line 109
    add-float/2addr p0, p1

    .line 110
    neg-float p1, v5

    .line 111
    .line 112
    aget p2, v7, v3

    .line 113
    add-float/2addr p1, p2

    .line 114
    .line 115
    aget p2, v7, v0

    .line 116
    .line 117
    new-array p3, v2, [F

    .line 118
    .line 119
    aput p0, p3, v1

    .line 120
    .line 121
    aput p1, p3, v3

    .line 122
    .line 123
    aput p2, p3, v0

    .line 124
    return-object p3

    .line 125
    :cond_6
    :goto_3
    const/4 p0, 0x0

    .line 126
    return-object p0
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

.method private static parseTranslateValue(Ljava/lang/String;D)D
    .locals 2

    .line 1
    .line 2
    :try_start_0
    const-string v0, "%"

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 12
    move-result v0

    .line 13
    .line 14
    add-int/lit8 v0, v0, -0x1

    .line 15
    const/4 v1, 0x0

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    .line 22
    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 23
    move-result-wide v0

    .line 24
    mul-double/2addr v0, p1

    .line 25
    .line 26
    const-wide/high16 p0, 0x4059000000000000L    # 100.0

    .line 27
    div-double/2addr v0, p0

    .line 28
    return-wide v0

    .line 29
    .line 30
    .line 31
    :cond_0
    invoke-static {p0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 32
    move-result-wide p0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 33
    return-wide p0

    .line 34
    .line 35
    :catch_0
    new-instance p1, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 39
    .line 40
    const-string p2, "Invalid translate value: "

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    move-result-object p0

    .line 51
    .line 52
    const-string p1, "ReactNative"

    .line 53
    .line 54
    .line 55
    invoke-static {p1, p0}, Lx3/a;->I(Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    .line 57
    const-wide/16 p0, 0x0

    .line 58
    return-wide p0
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
.end method

.method public static processTransform(Lcom/facebook/react/bridge/ReadableArray;[D)V
    .locals 6
    .annotation runtime Ljava/lang/Deprecated;
        forRemoval = true
        since = "0.75"
    .end annotation

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    .line 1
    invoke-static/range {v0 .. v5}, Lcom/facebook/react/uimanager/TransformHelper;->processTransform(Lcom/facebook/react/bridge/ReadableArray;[DFFLcom/facebook/react/bridge/ReadableArray;Z)V

    return-void
.end method

.method public static processTransform(Lcom/facebook/react/bridge/ReadableArray;[DFFLcom/facebook/react/bridge/ReadableArray;)V
    .locals 6
    .annotation runtime Ljava/lang/Deprecated;
        forRemoval = true
        since = "0.75"
    .end annotation

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move-object v4, p4

    .line 2
    invoke-static/range {v0 .. v5}, Lcom/facebook/react/uimanager/TransformHelper;->processTransform(Lcom/facebook/react/bridge/ReadableArray;[DFFLcom/facebook/react/bridge/ReadableArray;Z)V

    return-void
.end method

.method public static processTransform(Lcom/facebook/react/bridge/ReadableArray;[DFFLcom/facebook/react/bridge/ReadableArray;Z)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p3

    .line 3
    sget-object v4, Lcom/facebook/react/uimanager/TransformHelper;->sHelperMatrix:Ljava/lang/ThreadLocal;

    invoke-virtual {v4}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, [D

    .line 4
    invoke-static {v1}, Lcom/facebook/react/uimanager/MatrixMathHelper;->resetIdentityMatrix([D)V

    .line 5
    invoke-static/range {p2 .. p5}, Lcom/facebook/react/uimanager/TransformHelper;->getTranslateForTransformOrigin(FFLcom/facebook/react/bridge/ReadableArray;Z)[F

    move-result-object v4

    const/4 v12, 0x2

    const/4 v13, 0x1

    const/4 v14, 0x0

    if-eqz v4, :cond_0

    .line 6
    invoke-static {v5}, Lcom/facebook/react/uimanager/MatrixMathHelper;->resetIdentityMatrix([D)V

    .line 7
    aget v6, v4, v14

    float-to-double v6, v6

    aget v8, v4, v13

    float-to-double v8, v8

    aget v10, v4, v12

    float-to-double v10, v10

    invoke-static/range {v5 .. v11}, Lcom/facebook/react/uimanager/MatrixMathHelper;->applyTranslate3D([DDDD)V

    .line 8
    invoke-static {v1, v1, v5}, Lcom/facebook/react/uimanager/MatrixMathHelper;->multiplyInto([D[D[D)V

    .line 9
    :cond_0
    invoke-interface {v0}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    move-result v6

    const/16 v15, 0x10

    if-ne v6, v15, :cond_3

    invoke-interface {v0, v14}, Lcom/facebook/react/bridge/ReadableArray;->getType(I)Lcom/facebook/react/bridge/ReadableType;

    move-result-object v6

    sget-object v7, Lcom/facebook/react/bridge/ReadableType;->Number:Lcom/facebook/react/bridge/ReadableType;

    if-ne v6, v7, :cond_3

    .line 10
    invoke-static {v5}, Lcom/facebook/react/uimanager/MatrixMathHelper;->resetIdentityMatrix([D)V

    move v2, v14

    .line 11
    :goto_0
    invoke-interface {v0}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    move-result v3

    if-ge v2, v3, :cond_1

    .line 12
    invoke-interface {v0, v2}, Lcom/facebook/react/bridge/ReadableArray;->getDouble(I)D

    move-result-wide v6

    aput-wide v6, v5, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 13
    :cond_1
    invoke-static {v1, v1, v5}, Lcom/facebook/react/uimanager/MatrixMathHelper;->multiplyInto([D[D[D)V

    :cond_2
    move v13, v14

    goto/16 :goto_f

    .line 14
    :cond_3
    invoke-interface {v0}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    move-result v6

    move v7, v14

    :goto_1
    if-ge v7, v6, :cond_2

    .line 15
    invoke-interface {v0, v7}, Lcom/facebook/react/bridge/ReadableArray;->getMap(I)Lcom/facebook/react/bridge/ReadableMap;

    move-result-object v8

    .line 16
    invoke-interface {v8}, Lcom/facebook/react/bridge/ReadableMap;->keySetIterator()Lcom/facebook/react/bridge/ReadableMapKeySetIterator;

    move-result-object v9

    invoke-interface {v9}, Lcom/facebook/react/bridge/ReadableMapKeySetIterator;->nextKey()Ljava/lang/String;

    move-result-object v9

    .line 17
    invoke-static {v5}, Lcom/facebook/react/uimanager/MatrixMathHelper;->resetIdentityMatrix([D)V

    .line 18
    const-string v10, "matrix"

    invoke-virtual {v10, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_5

    .line 19
    invoke-interface {v8, v9}, Lcom/facebook/react/bridge/ReadableMap;->getArray(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableArray;

    move-result-object v8

    move v9, v14

    :goto_2
    if-ge v9, v15, :cond_4

    .line 20
    invoke-interface {v8, v9}, Lcom/facebook/react/bridge/ReadableArray;->getDouble(I)D

    move-result-wide v10

    aput-wide v10, v5, v9

    add-int/lit8 v9, v9, 0x1

    goto :goto_2

    :cond_4
    :goto_3
    move v12, v6

    move v13, v14

    move v14, v7

    goto/16 :goto_e

    .line 21
    :cond_5
    const-string/jumbo v10, "perspective"

    invoke-virtual {v10, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_6

    .line 22
    invoke-interface {v8, v9}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    move-result-wide v8

    invoke-static {v5, v8, v9}, Lcom/facebook/react/uimanager/MatrixMathHelper;->applyPerspective([DD)V

    goto :goto_3

    .line 23
    :cond_6
    const-string/jumbo v10, "rotateX"

    invoke-virtual {v10, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_7

    .line 24
    invoke-static {v8, v9}, Lcom/facebook/react/uimanager/TransformHelper;->convertToRadians(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)D

    move-result-wide v8

    invoke-static {v5, v8, v9}, Lcom/facebook/react/uimanager/MatrixMathHelper;->applyRotateX([DD)V

    goto :goto_3

    .line 25
    :cond_7
    const-string/jumbo v10, "rotateY"

    invoke-virtual {v10, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_8

    .line 26
    invoke-static {v8, v9}, Lcom/facebook/react/uimanager/TransformHelper;->convertToRadians(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)D

    move-result-wide v8

    invoke-static {v5, v8, v9}, Lcom/facebook/react/uimanager/MatrixMathHelper;->applyRotateY([DD)V

    goto :goto_3

    .line 27
    :cond_8
    const-string/jumbo v10, "rotate"

    invoke-virtual {v10, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_9

    const-string/jumbo v10, "rotateZ"

    invoke-virtual {v10, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_a

    :cond_9
    move v12, v6

    move v13, v14

    move v14, v7

    goto/16 :goto_d

    .line 28
    :cond_a
    const-string/jumbo v10, "scale"

    invoke-virtual {v10, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_b

    .line 29
    invoke-interface {v8, v9}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    move-result-wide v8

    .line 30
    invoke-static {v5, v8, v9}, Lcom/facebook/react/uimanager/MatrixMathHelper;->applyScaleX([DD)V

    .line 31
    invoke-static {v5, v8, v9}, Lcom/facebook/react/uimanager/MatrixMathHelper;->applyScaleY([DD)V

    goto :goto_3

    .line 32
    :cond_b
    const-string/jumbo v10, "scaleX"

    invoke-virtual {v10, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_c

    .line 33
    invoke-interface {v8, v9}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    move-result-wide v8

    invoke-static {v5, v8, v9}, Lcom/facebook/react/uimanager/MatrixMathHelper;->applyScaleX([DD)V

    goto :goto_3

    .line 34
    :cond_c
    const-string/jumbo v10, "scaleY"

    invoke-virtual {v10, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_d

    .line 35
    invoke-interface {v8, v9}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    move-result-wide v8

    invoke-static {v5, v8, v9}, Lcom/facebook/react/uimanager/MatrixMathHelper;->applyScaleY([DD)V

    goto/16 :goto_3

    .line 36
    :cond_d
    const-string/jumbo v10, "translate"

    invoke-virtual {v10, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_11

    .line 37
    invoke-interface {v8, v9}, Lcom/facebook/react/bridge/ReadableMap;->getArray(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableArray;

    move-result-object v8

    .line 38
    invoke-interface {v8, v14}, Lcom/facebook/react/bridge/ReadableArray;->getType(I)Lcom/facebook/react/bridge/ReadableType;

    move-result-object v9

    sget-object v10, Lcom/facebook/react/bridge/ReadableType;->String:Lcom/facebook/react/bridge/ReadableType;

    if-ne v9, v10, :cond_e

    if-eqz p5, :cond_e

    .line 39
    invoke-interface {v8, v14}, Lcom/facebook/react/bridge/ReadableArray;->getString(I)Ljava/lang/String;

    move-result-object v9

    float-to-double v12, v2

    invoke-static {v9, v12, v13}, Lcom/facebook/react/uimanager/TransformHelper;->parseTranslateValue(Ljava/lang/String;D)D

    move-result-wide v11

    :goto_4
    const/4 v9, 0x1

    goto :goto_5

    .line 40
    :cond_e
    invoke-interface {v8, v14}, Lcom/facebook/react/bridge/ReadableArray;->getDouble(I)D

    move-result-wide v11

    goto :goto_4

    .line 41
    :goto_5
    invoke-interface {v8, v9}, Lcom/facebook/react/bridge/ReadableArray;->getType(I)Lcom/facebook/react/bridge/ReadableType;

    move-result-object v13

    if-ne v13, v10, :cond_f

    if-eqz p5, :cond_f

    .line 42
    invoke-interface {v8, v9}, Lcom/facebook/react/bridge/ReadableArray;->getString(I)Ljava/lang/String;

    move-result-object v10

    move v13, v14

    float-to-double v14, v3

    invoke-static {v10, v14, v15}, Lcom/facebook/react/uimanager/TransformHelper;->parseTranslateValue(Ljava/lang/String;D)D

    move-result-wide v14

    goto :goto_6

    :cond_f
    move v13, v14

    .line 43
    invoke-interface {v8, v9}, Lcom/facebook/react/bridge/ReadableArray;->getDouble(I)D

    move-result-wide v14

    .line 44
    :goto_6
    invoke-interface {v8}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    move-result v9

    const/4 v10, 0x2

    if-le v9, v10, :cond_10

    invoke-interface {v8, v10}, Lcom/facebook/react/bridge/ReadableArray;->getDouble(I)D

    move-result-wide v8

    move-wide/from16 v17, v11

    move-wide v10, v8

    move v12, v6

    move-wide v8, v14

    move v14, v7

    :goto_7
    move-wide/from16 v6, v17

    goto :goto_8

    :cond_10
    move-wide/from16 v17, v11

    const-wide/16 v10, 0x0

    move-wide v8, v14

    move v14, v7

    move v12, v6

    goto :goto_7

    .line 45
    :goto_8
    invoke-static/range {v5 .. v11}, Lcom/facebook/react/uimanager/MatrixMathHelper;->applyTranslate3D([DDDD)V

    goto/16 :goto_e

    :cond_11
    move v12, v6

    move v13, v14

    move v14, v7

    .line 46
    const-string/jumbo v6, "translateX"

    invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_13

    .line 47
    invoke-interface {v8, v9}, Lcom/facebook/react/bridge/ReadableMap;->getType(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableType;

    move-result-object v6

    sget-object v7, Lcom/facebook/react/bridge/ReadableType;->String:Lcom/facebook/react/bridge/ReadableType;

    if-ne v6, v7, :cond_12

    if-eqz p5, :cond_12

    .line 48
    invoke-interface {v8, v9}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    float-to-double v7, v2

    invoke-static {v6, v7, v8}, Lcom/facebook/react/uimanager/TransformHelper;->parseTranslateValue(Ljava/lang/String;D)D

    move-result-wide v6

    :goto_9
    const-wide/16 v8, 0x0

    goto :goto_a

    .line 49
    :cond_12
    invoke-interface {v8, v9}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    move-result-wide v6

    goto :goto_9

    .line 50
    :goto_a
    invoke-static {v5, v6, v7, v8, v9}, Lcom/facebook/react/uimanager/MatrixMathHelper;->applyTranslate2D([DDD)V

    goto :goto_e

    .line 51
    :cond_13
    const-string/jumbo v6, "translateY"

    invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_15

    .line 52
    invoke-interface {v8, v9}, Lcom/facebook/react/bridge/ReadableMap;->getType(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableType;

    move-result-object v6

    sget-object v7, Lcom/facebook/react/bridge/ReadableType;->String:Lcom/facebook/react/bridge/ReadableType;

    if-ne v6, v7, :cond_14

    if-eqz p5, :cond_14

    .line 53
    invoke-interface {v8, v9}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    float-to-double v7, v3

    invoke-static {v6, v7, v8}, Lcom/facebook/react/uimanager/TransformHelper;->parseTranslateValue(Ljava/lang/String;D)D

    move-result-wide v6

    :goto_b
    const-wide/16 v8, 0x0

    goto :goto_c

    .line 54
    :cond_14
    invoke-interface {v8, v9}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    move-result-wide v6

    goto :goto_b

    .line 55
    :goto_c
    invoke-static {v5, v8, v9, v6, v7}, Lcom/facebook/react/uimanager/MatrixMathHelper;->applyTranslate2D([DDD)V

    goto :goto_e

    .line 56
    :cond_15
    const-string/jumbo v6, "skewX"

    invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_16

    .line 57
    invoke-static {v8, v9}, Lcom/facebook/react/uimanager/TransformHelper;->convertToRadians(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)D

    move-result-wide v6

    invoke-static {v5, v6, v7}, Lcom/facebook/react/uimanager/MatrixMathHelper;->applySkewX([DD)V

    goto :goto_e

    .line 58
    :cond_16
    const-string/jumbo v6, "skewY"

    invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_17

    .line 59
    invoke-static {v8, v9}, Lcom/facebook/react/uimanager/TransformHelper;->convertToRadians(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)D

    move-result-wide v6

    invoke-static {v5, v6, v7}, Lcom/facebook/react/uimanager/MatrixMathHelper;->applySkewY([DD)V

    goto :goto_e

    .line 60
    :cond_17
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Unsupported transform type: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const-string v7, "ReactNative"

    invoke-static {v7, v6}, Lx3/a;->I(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_e

    .line 61
    :goto_d
    invoke-static {v8, v9}, Lcom/facebook/react/uimanager/TransformHelper;->convertToRadians(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)D

    move-result-wide v6

    invoke-static {v5, v6, v7}, Lcom/facebook/react/uimanager/MatrixMathHelper;->applyRotateZ([DD)V

    .line 62
    :goto_e
    invoke-static {v1, v1, v5}, Lcom/facebook/react/uimanager/MatrixMathHelper;->multiplyInto([D[D[D)V

    add-int/lit8 v7, v14, 0x1

    move v6, v12

    move v14, v13

    const/4 v12, 0x2

    const/4 v13, 0x1

    const/16 v15, 0x10

    goto/16 :goto_1

    :goto_f
    if-eqz v4, :cond_18

    .line 63
    invoke-static {v5}, Lcom/facebook/react/uimanager/MatrixMathHelper;->resetIdentityMatrix([D)V

    .line 64
    aget v0, v4, v13

    neg-float v0, v0

    float-to-double v6, v0

    const/16 v16, 0x1

    aget v0, v4, v16

    neg-float v0, v0

    float-to-double v8, v0

    const/4 v10, 0x2

    aget v0, v4, v10

    neg-float v0, v0

    float-to-double v10, v0

    invoke-static/range {v5 .. v11}, Lcom/facebook/react/uimanager/MatrixMathHelper;->applyTranslate3D([DDDD)V

    .line 65
    invoke-static {v1, v1, v5}, Lcom/facebook/react/uimanager/MatrixMathHelper;->multiplyInto([D[D[D)V

    :cond_18
    return-void
.end method
