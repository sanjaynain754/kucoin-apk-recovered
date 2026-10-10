.class Landroidx/exifinterface/media/ExifInterface$Rational;
.super Ljava/lang/Object;
.source "ExifInterface.java"


# annotations
.annotation build Landroidx/annotation/VisibleForTesting;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/exifinterface/media/ExifInterface;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Rational"
.end annotation


# instance fields
.field public final denominator:J

.field public final numerator:J


# direct methods
.method private constructor <init>(JJ)V
    .locals 3

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    cmp-long v2, p3, v0

    if-nez v2, :cond_0

    .line 3
    iput-wide v0, p0, Landroidx/exifinterface/media/ExifInterface$Rational;->numerator:J

    const-wide/16 p1, 0x1

    .line 4
    iput-wide p1, p0, Landroidx/exifinterface/media/ExifInterface$Rational;->denominator:J

    return-void

    .line 5
    :cond_0
    iput-wide p1, p0, Landroidx/exifinterface/media/ExifInterface$Rational;->numerator:J

    .line 6
    iput-wide p3, p0, Landroidx/exifinterface/media/ExifInterface$Rational;->denominator:J

    return-void
.end method

.method public synthetic constructor <init>(JJLandroidx/exifinterface/media/ExifInterface$1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Landroidx/exifinterface/media/ExifInterface$Rational;-><init>(JJ)V

    return-void
.end method

.method public static createFromDouble(D)Landroidx/exifinterface/media/ExifInterface$Rational;
    .locals 23

    .line 1
    .line 2
    const-wide/high16 v0, 0x43e0000000000000L    # 9.223372036854776E18

    .line 3
    .line 4
    cmpl-double v0, p0, v0

    .line 5
    .line 6
    const-wide/16 v3, 0x1

    .line 7
    .line 8
    if-gez v0, :cond_0

    .line 9
    .line 10
    const-wide/high16 v5, -0x3c20000000000000L    # -9.223372036854776E18

    .line 11
    .line 12
    cmpg-double v0, p0, v5

    .line 13
    .line 14
    if-gtz v0, :cond_1

    .line 15
    .line 16
    :cond_0
    const-wide/16 v21, 0x0

    .line 17
    goto :goto_1

    .line 18
    .line 19
    .line 20
    :cond_1
    invoke-static/range {p0 .. p1}, Ljava/lang/Math;->abs(D)D

    .line 21
    move-result-wide v5

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    const-wide v7, 0x3e45798ee2308c3aL    # 1.0E-8

    .line 27
    mul-double/2addr v7, v5

    .line 28
    .line 29
    const-wide/16 v9, 0x0

    .line 30
    move-wide v11, v3

    .line 31
    move-wide v15, v5

    .line 32
    move-wide v13, v9

    .line 33
    .line 34
    :goto_0
    const-wide/high16 v17, 0x3ff0000000000000L    # 1.0

    .line 35
    .line 36
    rem-double v19, v15, v17

    .line 37
    .line 38
    const-wide/16 v21, 0x0

    .line 39
    .line 40
    sub-double v1, v15, v19

    .line 41
    double-to-long v0, v1

    .line 42
    .line 43
    mul-long v15, v0, v3

    .line 44
    add-long/2addr v13, v15

    .line 45
    mul-long/2addr v0, v9

    .line 46
    add-long/2addr v0, v11

    .line 47
    .line 48
    div-double v15, v17, v19

    .line 49
    long-to-double v11, v13

    .line 50
    .line 51
    move-wide/from16 v17, v3

    .line 52
    long-to-double v2, v0

    .line 53
    div-double/2addr v11, v2

    .line 54
    .line 55
    sub-double v2, v5, v11

    .line 56
    .line 57
    .line 58
    invoke-static {v2, v3}, Ljava/lang/Math;->abs(D)D

    .line 59
    move-result-wide v2

    .line 60
    .line 61
    cmpl-double v2, v2, v7

    .line 62
    .line 63
    if-gtz v2, :cond_3

    .line 64
    .line 65
    new-instance v2, Landroidx/exifinterface/media/ExifInterface$Rational;

    .line 66
    .line 67
    cmpg-double v3, p0, v21

    .line 68
    .line 69
    if-gez v3, :cond_2

    .line 70
    neg-long v13, v13

    .line 71
    .line 72
    .line 73
    :cond_2
    invoke-direct {v2, v13, v14, v0, v1}, Landroidx/exifinterface/media/ExifInterface$Rational;-><init>(JJ)V

    .line 74
    return-object v2

    .line 75
    :cond_3
    move-wide v11, v9

    .line 76
    move-wide v3, v13

    .line 77
    .line 78
    move-wide/from16 v13, v17

    .line 79
    move-wide v9, v0

    .line 80
    goto :goto_0

    .line 81
    .line 82
    :goto_1
    new-instance v0, Landroidx/exifinterface/media/ExifInterface$Rational;

    .line 83
    .line 84
    cmpl-double v1, p0, v21

    .line 85
    .line 86
    if-lez v1, :cond_4

    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    const-wide v1, 0x7fffffffffffffffL

    .line 92
    goto :goto_2

    .line 93
    .line 94
    :cond_4
    const-wide/high16 v1, -0x8000000000000000L

    .line 95
    .line 96
    .line 97
    :goto_2
    invoke-direct {v0, v1, v2, v3, v4}, Landroidx/exifinterface/media/ExifInterface$Rational;-><init>(JJ)V

    .line 98
    return-object v0
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


# virtual methods
.method public calculate()D
    .locals 4

    .line 1
    .line 2
    iget-wide v0, p0, Landroidx/exifinterface/media/ExifInterface$Rational;->numerator:J

    .line 3
    long-to-double v0, v0

    .line 4
    .line 5
    iget-wide v2, p0, Landroidx/exifinterface/media/ExifInterface$Rational;->denominator:J

    .line 6
    long-to-double v2, v2

    .line 7
    div-double/2addr v0, v2

    .line 8
    return-wide v0
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
    iget-wide v1, p0, Landroidx/exifinterface/media/ExifInterface$Rational;->numerator:J

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v1, "/"

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    iget-wide v1, p0, Landroidx/exifinterface/media/ExifInterface$Rational;->denominator:J

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    move-result-object v0

    .line 25
    return-object v0
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
.end method
