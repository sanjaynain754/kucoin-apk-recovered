.class public Landroidx/constraintlayout/core/dsl/Constraint;
.super Ljava/lang/Object;
.source "Constraint.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;,
        Landroidx/constraintlayout/core/dsl/Constraint$HSide;,
        Landroidx/constraintlayout/core/dsl/Constraint$VAnchor;,
        Landroidx/constraintlayout/core/dsl/Constraint$VSide;,
        Landroidx/constraintlayout/core/dsl/Constraint$ChainMode;,
        Landroidx/constraintlayout/core/dsl/Constraint$Behaviour;,
        Landroidx/constraintlayout/core/dsl/Constraint$Anchor;,
        Landroidx/constraintlayout/core/dsl/Constraint$Side;
    }
.end annotation


# static fields
.field public static final PARENT:Landroidx/constraintlayout/core/dsl/Constraint;

.field static UNSET:I

.field static chainModeMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Landroidx/constraintlayout/core/dsl/Constraint$ChainMode;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field helperJason:Ljava/lang/String;

.field helperType:Ljava/lang/String;

.field private mBaseline:Landroidx/constraintlayout/core/dsl/Constraint$VAnchor;

.field private mBottom:Landroidx/constraintlayout/core/dsl/Constraint$VAnchor;

.field private mCircleAngle:F

.field private mCircleConstraint:Ljava/lang/String;

.field private mCircleRadius:I

.field private mConstrainedHeight:Z

.field private mConstrainedWidth:Z

.field private mDimensionRatio:Ljava/lang/String;

.field private mEditorAbsoluteX:I

.field private mEditorAbsoluteY:I

.field private mEnd:Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;

.field private mHeight:I

.field private mHeightDefault:Landroidx/constraintlayout/core/dsl/Constraint$Behaviour;

.field private mHeightMax:I

.field private mHeightMin:I

.field private mHeightPercent:F

.field private mHorizontalBias:F

.field private mHorizontalChainStyle:Landroidx/constraintlayout/core/dsl/Constraint$ChainMode;

.field private mHorizontalWeight:F

.field private final mId:Ljava/lang/String;

.field private mLeft:Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;

.field private mReferenceIds:[Ljava/lang/String;

.field private mRight:Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;

.field private mStart:Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;

.field private mTop:Landroidx/constraintlayout/core/dsl/Constraint$VAnchor;

.field private mVerticalBias:F

.field private mVerticalChainStyle:Landroidx/constraintlayout/core/dsl/Constraint$ChainMode;

.field private mVerticalWeight:F

.field private mWidth:I

.field private mWidthDefault:Landroidx/constraintlayout/core/dsl/Constraint$Behaviour;

.field private mWidthMax:I

.field private mWidthMin:I

.field private mWidthPercent:F


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    .line 2
    new-instance v0, Landroidx/constraintlayout/core/dsl/Constraint;

    .line 3
    .line 4
    .line 5
    const-string/jumbo v1, "parent"

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1}, Landroidx/constraintlayout/core/dsl/Constraint;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    sput-object v0, Landroidx/constraintlayout/core/dsl/Constraint;->PARENT:Landroidx/constraintlayout/core/dsl/Constraint;

    .line 11
    .line 12
    const/high16 v0, -0x80000000

    .line 13
    .line 14
    sput v0, Landroidx/constraintlayout/core/dsl/Constraint;->UNSET:I

    .line 15
    .line 16
    new-instance v0, Ljava/util/HashMap;

    .line 17
    .line 18
    .line 19
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 20
    .line 21
    sput-object v0, Landroidx/constraintlayout/core/dsl/Constraint;->chainModeMap:Ljava/util/Map;

    .line 22
    .line 23
    sget-object v1, Landroidx/constraintlayout/core/dsl/Constraint$ChainMode;->SPREAD:Landroidx/constraintlayout/core/dsl/Constraint$ChainMode;

    .line 24
    .line 25
    .line 26
    const-string/jumbo v2, "spread"

    .line 27
    .line 28
    .line 29
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v0, Landroidx/constraintlayout/core/dsl/Constraint;->chainModeMap:Ljava/util/Map;

    .line 32
    .line 33
    sget-object v1, Landroidx/constraintlayout/core/dsl/Constraint$ChainMode;->SPREAD_INSIDE:Landroidx/constraintlayout/core/dsl/Constraint$ChainMode;

    .line 34
    .line 35
    .line 36
    const-string/jumbo v2, "spread_inside"

    .line 37
    .line 38
    .line 39
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    sget-object v0, Landroidx/constraintlayout/core/dsl/Constraint;->chainModeMap:Ljava/util/Map;

    .line 42
    .line 43
    sget-object v1, Landroidx/constraintlayout/core/dsl/Constraint$ChainMode;->PACKED:Landroidx/constraintlayout/core/dsl/Constraint$ChainMode;

    .line 44
    .line 45
    .line 46
    const-string/jumbo v2, "packed"

    .line 47
    .line 48
    .line 49
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    return-void
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
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput-object v0, p0, Landroidx/constraintlayout/core/dsl/Constraint;->helperType:Ljava/lang/String;

    .line 7
    .line 8
    iput-object v0, p0, Landroidx/constraintlayout/core/dsl/Constraint;->helperJason:Ljava/lang/String;

    .line 9
    .line 10
    new-instance v1, Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;

    .line 11
    .line 12
    sget-object v2, Landroidx/constraintlayout/core/dsl/Constraint$HSide;->LEFT:Landroidx/constraintlayout/core/dsl/Constraint$HSide;

    .line 13
    .line 14
    .line 15
    invoke-direct {v1, p0, v2}, Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;-><init>(Landroidx/constraintlayout/core/dsl/Constraint;Landroidx/constraintlayout/core/dsl/Constraint$HSide;)V

    .line 16
    .line 17
    iput-object v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mLeft:Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;

    .line 18
    .line 19
    new-instance v1, Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;

    .line 20
    .line 21
    sget-object v2, Landroidx/constraintlayout/core/dsl/Constraint$HSide;->RIGHT:Landroidx/constraintlayout/core/dsl/Constraint$HSide;

    .line 22
    .line 23
    .line 24
    invoke-direct {v1, p0, v2}, Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;-><init>(Landroidx/constraintlayout/core/dsl/Constraint;Landroidx/constraintlayout/core/dsl/Constraint$HSide;)V

    .line 25
    .line 26
    iput-object v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mRight:Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;

    .line 27
    .line 28
    new-instance v1, Landroidx/constraintlayout/core/dsl/Constraint$VAnchor;

    .line 29
    .line 30
    sget-object v2, Landroidx/constraintlayout/core/dsl/Constraint$VSide;->TOP:Landroidx/constraintlayout/core/dsl/Constraint$VSide;

    .line 31
    .line 32
    .line 33
    invoke-direct {v1, p0, v2}, Landroidx/constraintlayout/core/dsl/Constraint$VAnchor;-><init>(Landroidx/constraintlayout/core/dsl/Constraint;Landroidx/constraintlayout/core/dsl/Constraint$VSide;)V

    .line 34
    .line 35
    iput-object v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mTop:Landroidx/constraintlayout/core/dsl/Constraint$VAnchor;

    .line 36
    .line 37
    new-instance v1, Landroidx/constraintlayout/core/dsl/Constraint$VAnchor;

    .line 38
    .line 39
    sget-object v2, Landroidx/constraintlayout/core/dsl/Constraint$VSide;->BOTTOM:Landroidx/constraintlayout/core/dsl/Constraint$VSide;

    .line 40
    .line 41
    .line 42
    invoke-direct {v1, p0, v2}, Landroidx/constraintlayout/core/dsl/Constraint$VAnchor;-><init>(Landroidx/constraintlayout/core/dsl/Constraint;Landroidx/constraintlayout/core/dsl/Constraint$VSide;)V

    .line 43
    .line 44
    iput-object v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mBottom:Landroidx/constraintlayout/core/dsl/Constraint$VAnchor;

    .line 45
    .line 46
    new-instance v1, Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;

    .line 47
    .line 48
    sget-object v2, Landroidx/constraintlayout/core/dsl/Constraint$HSide;->START:Landroidx/constraintlayout/core/dsl/Constraint$HSide;

    .line 49
    .line 50
    .line 51
    invoke-direct {v1, p0, v2}, Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;-><init>(Landroidx/constraintlayout/core/dsl/Constraint;Landroidx/constraintlayout/core/dsl/Constraint$HSide;)V

    .line 52
    .line 53
    iput-object v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mStart:Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;

    .line 54
    .line 55
    new-instance v1, Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;

    .line 56
    .line 57
    sget-object v2, Landroidx/constraintlayout/core/dsl/Constraint$HSide;->END:Landroidx/constraintlayout/core/dsl/Constraint$HSide;

    .line 58
    .line 59
    .line 60
    invoke-direct {v1, p0, v2}, Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;-><init>(Landroidx/constraintlayout/core/dsl/Constraint;Landroidx/constraintlayout/core/dsl/Constraint$HSide;)V

    .line 61
    .line 62
    iput-object v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mEnd:Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;

    .line 63
    .line 64
    new-instance v1, Landroidx/constraintlayout/core/dsl/Constraint$VAnchor;

    .line 65
    .line 66
    sget-object v2, Landroidx/constraintlayout/core/dsl/Constraint$VSide;->BASELINE:Landroidx/constraintlayout/core/dsl/Constraint$VSide;

    .line 67
    .line 68
    .line 69
    invoke-direct {v1, p0, v2}, Landroidx/constraintlayout/core/dsl/Constraint$VAnchor;-><init>(Landroidx/constraintlayout/core/dsl/Constraint;Landroidx/constraintlayout/core/dsl/Constraint$VSide;)V

    .line 70
    .line 71
    iput-object v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mBaseline:Landroidx/constraintlayout/core/dsl/Constraint$VAnchor;

    .line 72
    .line 73
    sget v1, Landroidx/constraintlayout/core/dsl/Constraint;->UNSET:I

    .line 74
    .line 75
    iput v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mWidth:I

    .line 76
    .line 77
    iput v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mHeight:I

    .line 78
    .line 79
    const/high16 v2, 0x7fc00000    # Float.NaN

    .line 80
    .line 81
    iput v2, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mHorizontalBias:F

    .line 82
    .line 83
    iput v2, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mVerticalBias:F

    .line 84
    .line 85
    iput-object v0, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mDimensionRatio:Ljava/lang/String;

    .line 86
    .line 87
    iput-object v0, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mCircleConstraint:Ljava/lang/String;

    .line 88
    .line 89
    const/high16 v3, -0x80000000

    .line 90
    .line 91
    iput v3, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mCircleRadius:I

    .line 92
    .line 93
    iput v2, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mCircleAngle:F

    .line 94
    .line 95
    iput v3, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mEditorAbsoluteX:I

    .line 96
    .line 97
    iput v3, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mEditorAbsoluteY:I

    .line 98
    .line 99
    iput v2, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mVerticalWeight:F

    .line 100
    .line 101
    iput v2, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mHorizontalWeight:F

    .line 102
    .line 103
    iput-object v0, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mHorizontalChainStyle:Landroidx/constraintlayout/core/dsl/Constraint$ChainMode;

    .line 104
    .line 105
    iput-object v0, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mVerticalChainStyle:Landroidx/constraintlayout/core/dsl/Constraint$ChainMode;

    .line 106
    .line 107
    iput-object v0, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mWidthDefault:Landroidx/constraintlayout/core/dsl/Constraint$Behaviour;

    .line 108
    .line 109
    iput-object v0, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mHeightDefault:Landroidx/constraintlayout/core/dsl/Constraint$Behaviour;

    .line 110
    .line 111
    iput v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mWidthMax:I

    .line 112
    .line 113
    iput v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mHeightMax:I

    .line 114
    .line 115
    iput v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mWidthMin:I

    .line 116
    .line 117
    iput v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mHeightMin:I

    .line 118
    .line 119
    iput v2, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mWidthPercent:F

    .line 120
    .line 121
    iput v2, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mHeightPercent:F

    .line 122
    .line 123
    iput-object v0, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mReferenceIds:[Ljava/lang/String;

    .line 124
    const/4 v0, 0x0

    .line 125
    .line 126
    iput-boolean v0, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mConstrainedWidth:Z

    .line 127
    .line 128
    iput-boolean v0, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mConstrainedHeight:Z

    .line 129
    .line 130
    iput-object p1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mId:Ljava/lang/String;

    .line 131
    return-void
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
.end method

.method public static synthetic access$000(Landroidx/constraintlayout/core/dsl/Constraint;)Ljava/lang/String;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mId:Ljava/lang/String;

    .line 3
    return-object p0
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
.end method


# virtual methods
.method public append(Ljava/lang/StringBuilder;Ljava/lang/String;F)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {p3}, Ljava/lang/Float;->isNaN(F)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string p2, ":"

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    const-string p2, ",\n"

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    return-void
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

.method public convertStringArrayToString([Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    const-string v1, "["

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    const/4 v1, 0x0

    .line 9
    :goto_0
    array-length v2, p1

    .line 10
    .line 11
    if-ge v1, v2, :cond_1

    .line 12
    .line 13
    const-string v2, "\'"

    .line 14
    .line 15
    if-nez v1, :cond_0

    .line 16
    move-object v3, v2

    .line 17
    goto :goto_1

    .line 18
    .line 19
    :cond_0
    const-string v3, ",\'"

    .line 20
    .line 21
    .line 22
    :goto_1
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    aget-object v3, p1, v1

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    add-int/lit8 v1, v1, 0x1

    .line 33
    goto :goto_0

    .line 34
    .line 35
    :cond_1
    const-string p1, "]"

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    move-result-object p1

    .line 43
    return-object p1
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
.end method

.method public getBaseline()Landroidx/constraintlayout/core/dsl/Constraint$VAnchor;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mBaseline:Landroidx/constraintlayout/core/dsl/Constraint$VAnchor;

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
.end method

.method public getBottom()Landroidx/constraintlayout/core/dsl/Constraint$VAnchor;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mBottom:Landroidx/constraintlayout/core/dsl/Constraint$VAnchor;

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
.end method

.method public getCircleAngle()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mCircleAngle:F

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
.end method

.method public getCircleConstraint()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mCircleConstraint:Ljava/lang/String;

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
.end method

.method public getCircleRadius()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mCircleRadius:I

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
.end method

.method public getDimensionRatio()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mDimensionRatio:Ljava/lang/String;

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
.end method

.method public getEditorAbsoluteX()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mEditorAbsoluteX:I

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
.end method

.method public getEditorAbsoluteY()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mEditorAbsoluteY:I

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
.end method

.method public getEnd()Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mEnd:Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;

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
.end method

.method public getHeight()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mHeight:I

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
.end method

.method public getHeightDefault()Landroidx/constraintlayout/core/dsl/Constraint$Behaviour;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mHeightDefault:Landroidx/constraintlayout/core/dsl/Constraint$Behaviour;

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
.end method

.method public getHeightMax()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mHeightMax:I

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
.end method

.method public getHeightMin()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mHeightMin:I

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
.end method

.method public getHeightPercent()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mHeightPercent:F

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
.end method

.method public getHorizontalBias()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mHorizontalBias:F

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
.end method

.method public getHorizontalChainStyle()Landroidx/constraintlayout/core/dsl/Constraint$ChainMode;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mHorizontalChainStyle:Landroidx/constraintlayout/core/dsl/Constraint$ChainMode;

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
.end method

.method public getHorizontalWeight()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mHorizontalWeight:F

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
.end method

.method public getLeft()Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mLeft:Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;

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
.end method

.method public getReferenceIds()[Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mReferenceIds:[Ljava/lang/String;

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
.end method

.method public getRight()Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mRight:Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;

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
.end method

.method public getStart()Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mStart:Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;

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
.end method

.method public getTop()Landroidx/constraintlayout/core/dsl/Constraint$VAnchor;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mTop:Landroidx/constraintlayout/core/dsl/Constraint$VAnchor;

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
.end method

.method public getVerticalBias()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mVerticalBias:F

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
.end method

.method public getVerticalChainStyle()Landroidx/constraintlayout/core/dsl/Constraint$ChainMode;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mVerticalChainStyle:Landroidx/constraintlayout/core/dsl/Constraint$ChainMode;

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
.end method

.method public getVerticalWeight()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mVerticalWeight:F

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
.end method

.method public getWidth()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mWidth:I

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
.end method

.method public getWidthDefault()Landroidx/constraintlayout/core/dsl/Constraint$Behaviour;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mWidthDefault:Landroidx/constraintlayout/core/dsl/Constraint$Behaviour;

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
.end method

.method public getWidthMax()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mWidthMax:I

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
.end method

.method public getWidthMin()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mWidthMin:I

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
.end method

.method public getWidthPercent()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mWidthPercent:F

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
.end method

.method public isConstrainedHeight()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mConstrainedHeight:Z

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
.end method

.method public isConstrainedWidth()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mConstrainedWidth:Z

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
.end method

.method public linkToBaseline(Landroidx/constraintlayout/core/dsl/Constraint$VAnchor;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0}, Landroidx/constraintlayout/core/dsl/Constraint;->linkToBaseline(Landroidx/constraintlayout/core/dsl/Constraint$VAnchor;I)V

    return-void
.end method

.method public linkToBaseline(Landroidx/constraintlayout/core/dsl/Constraint$VAnchor;I)V
    .locals 1

    const/high16 v0, -0x80000000

    .line 2
    invoke-virtual {p0, p1, p2, v0}, Landroidx/constraintlayout/core/dsl/Constraint;->linkToBaseline(Landroidx/constraintlayout/core/dsl/Constraint$VAnchor;II)V

    return-void
.end method

.method public linkToBaseline(Landroidx/constraintlayout/core/dsl/Constraint$VAnchor;II)V
    .locals 1

    .line 3
    iget-object v0, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mBaseline:Landroidx/constraintlayout/core/dsl/Constraint$VAnchor;

    iput-object p1, v0, Landroidx/constraintlayout/core/dsl/Constraint$Anchor;->mConnection:Landroidx/constraintlayout/core/dsl/Constraint$Anchor;

    .line 4
    iput p2, v0, Landroidx/constraintlayout/core/dsl/Constraint$Anchor;->mMargin:I

    .line 5
    iput p3, v0, Landroidx/constraintlayout/core/dsl/Constraint$Anchor;->mGoneMargin:I

    return-void
.end method

.method public linkToBottom(Landroidx/constraintlayout/core/dsl/Constraint$VAnchor;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0}, Landroidx/constraintlayout/core/dsl/Constraint;->linkToBottom(Landroidx/constraintlayout/core/dsl/Constraint$VAnchor;I)V

    return-void
.end method

.method public linkToBottom(Landroidx/constraintlayout/core/dsl/Constraint$VAnchor;I)V
    .locals 1

    const/high16 v0, -0x80000000

    .line 2
    invoke-virtual {p0, p1, p2, v0}, Landroidx/constraintlayout/core/dsl/Constraint;->linkToBottom(Landroidx/constraintlayout/core/dsl/Constraint$VAnchor;II)V

    return-void
.end method

.method public linkToBottom(Landroidx/constraintlayout/core/dsl/Constraint$VAnchor;II)V
    .locals 1

    .line 3
    iget-object v0, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mBottom:Landroidx/constraintlayout/core/dsl/Constraint$VAnchor;

    iput-object p1, v0, Landroidx/constraintlayout/core/dsl/Constraint$Anchor;->mConnection:Landroidx/constraintlayout/core/dsl/Constraint$Anchor;

    .line 4
    iput p2, v0, Landroidx/constraintlayout/core/dsl/Constraint$Anchor;->mMargin:I

    .line 5
    iput p3, v0, Landroidx/constraintlayout/core/dsl/Constraint$Anchor;->mGoneMargin:I

    return-void
.end method

.method public linkToEnd(Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0}, Landroidx/constraintlayout/core/dsl/Constraint;->linkToEnd(Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;I)V

    return-void
.end method

.method public linkToEnd(Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;I)V
    .locals 1

    const/high16 v0, -0x80000000

    .line 2
    invoke-virtual {p0, p1, p2, v0}, Landroidx/constraintlayout/core/dsl/Constraint;->linkToEnd(Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;II)V

    return-void
.end method

.method public linkToEnd(Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;II)V
    .locals 1

    .line 3
    iget-object v0, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mEnd:Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;

    iput-object p1, v0, Landroidx/constraintlayout/core/dsl/Constraint$Anchor;->mConnection:Landroidx/constraintlayout/core/dsl/Constraint$Anchor;

    .line 4
    iput p2, v0, Landroidx/constraintlayout/core/dsl/Constraint$Anchor;->mMargin:I

    .line 5
    iput p3, v0, Landroidx/constraintlayout/core/dsl/Constraint$Anchor;->mGoneMargin:I

    return-void
.end method

.method public linkToLeft(Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0}, Landroidx/constraintlayout/core/dsl/Constraint;->linkToLeft(Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;I)V

    return-void
.end method

.method public linkToLeft(Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;I)V
    .locals 1

    const/high16 v0, -0x80000000

    .line 2
    invoke-virtual {p0, p1, p2, v0}, Landroidx/constraintlayout/core/dsl/Constraint;->linkToLeft(Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;II)V

    return-void
.end method

.method public linkToLeft(Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;II)V
    .locals 1

    .line 3
    iget-object v0, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mLeft:Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;

    iput-object p1, v0, Landroidx/constraintlayout/core/dsl/Constraint$Anchor;->mConnection:Landroidx/constraintlayout/core/dsl/Constraint$Anchor;

    .line 4
    iput p2, v0, Landroidx/constraintlayout/core/dsl/Constraint$Anchor;->mMargin:I

    .line 5
    iput p3, v0, Landroidx/constraintlayout/core/dsl/Constraint$Anchor;->mGoneMargin:I

    return-void
.end method

.method public linkToRight(Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0}, Landroidx/constraintlayout/core/dsl/Constraint;->linkToRight(Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;I)V

    return-void
.end method

.method public linkToRight(Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;I)V
    .locals 1

    const/high16 v0, -0x80000000

    .line 2
    invoke-virtual {p0, p1, p2, v0}, Landroidx/constraintlayout/core/dsl/Constraint;->linkToRight(Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;II)V

    return-void
.end method

.method public linkToRight(Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;II)V
    .locals 1

    .line 3
    iget-object v0, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mRight:Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;

    iput-object p1, v0, Landroidx/constraintlayout/core/dsl/Constraint$Anchor;->mConnection:Landroidx/constraintlayout/core/dsl/Constraint$Anchor;

    .line 4
    iput p2, v0, Landroidx/constraintlayout/core/dsl/Constraint$Anchor;->mMargin:I

    .line 5
    iput p3, v0, Landroidx/constraintlayout/core/dsl/Constraint$Anchor;->mGoneMargin:I

    return-void
.end method

.method public linkToStart(Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0}, Landroidx/constraintlayout/core/dsl/Constraint;->linkToStart(Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;I)V

    return-void
.end method

.method public linkToStart(Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;I)V
    .locals 1

    const/high16 v0, -0x80000000

    .line 2
    invoke-virtual {p0, p1, p2, v0}, Landroidx/constraintlayout/core/dsl/Constraint;->linkToStart(Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;II)V

    return-void
.end method

.method public linkToStart(Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;II)V
    .locals 1

    .line 3
    iget-object v0, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mStart:Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;

    iput-object p1, v0, Landroidx/constraintlayout/core/dsl/Constraint$Anchor;->mConnection:Landroidx/constraintlayout/core/dsl/Constraint$Anchor;

    .line 4
    iput p2, v0, Landroidx/constraintlayout/core/dsl/Constraint$Anchor;->mMargin:I

    .line 5
    iput p3, v0, Landroidx/constraintlayout/core/dsl/Constraint$Anchor;->mGoneMargin:I

    return-void
.end method

.method public linkToTop(Landroidx/constraintlayout/core/dsl/Constraint$VAnchor;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0}, Landroidx/constraintlayout/core/dsl/Constraint;->linkToTop(Landroidx/constraintlayout/core/dsl/Constraint$VAnchor;I)V

    return-void
.end method

.method public linkToTop(Landroidx/constraintlayout/core/dsl/Constraint$VAnchor;I)V
    .locals 1

    const/high16 v0, -0x80000000

    .line 2
    invoke-virtual {p0, p1, p2, v0}, Landroidx/constraintlayout/core/dsl/Constraint;->linkToTop(Landroidx/constraintlayout/core/dsl/Constraint$VAnchor;II)V

    return-void
.end method

.method public linkToTop(Landroidx/constraintlayout/core/dsl/Constraint$VAnchor;II)V
    .locals 1

    .line 3
    iget-object v0, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mTop:Landroidx/constraintlayout/core/dsl/Constraint$VAnchor;

    iput-object p1, v0, Landroidx/constraintlayout/core/dsl/Constraint$Anchor;->mConnection:Landroidx/constraintlayout/core/dsl/Constraint$Anchor;

    .line 4
    iput p2, v0, Landroidx/constraintlayout/core/dsl/Constraint$Anchor;->mMargin:I

    .line 5
    iput p3, v0, Landroidx/constraintlayout/core/dsl/Constraint$Anchor;->mGoneMargin:I

    return-void
.end method

.method public setCircleAngle(F)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mCircleAngle:F

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
.end method

.method public setCircleConstraint(Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mCircleConstraint:Ljava/lang/String;

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
.end method

.method public setCircleRadius(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mCircleRadius:I

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
.end method

.method public setConstrainedHeight(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mConstrainedHeight:Z

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
.end method

.method public setConstrainedWidth(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mConstrainedWidth:Z

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
.end method

.method public setDimensionRatio(Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mDimensionRatio:Ljava/lang/String;

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
.end method

.method public setEditorAbsoluteX(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mEditorAbsoluteX:I

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
.end method

.method public setEditorAbsoluteY(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mEditorAbsoluteY:I

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
.end method

.method public setHeight(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mHeight:I

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
.end method

.method public setHeightDefault(Landroidx/constraintlayout/core/dsl/Constraint$Behaviour;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mHeightDefault:Landroidx/constraintlayout/core/dsl/Constraint$Behaviour;

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
.end method

.method public setHeightMax(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mHeightMax:I

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
.end method

.method public setHeightMin(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mHeightMin:I

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
.end method

.method public setHeightPercent(F)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mHeightPercent:F

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
.end method

.method public setHorizontalBias(F)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mHorizontalBias:F

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
.end method

.method public setHorizontalChainStyle(Landroidx/constraintlayout/core/dsl/Constraint$ChainMode;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mHorizontalChainStyle:Landroidx/constraintlayout/core/dsl/Constraint$ChainMode;

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
.end method

.method public setHorizontalWeight(F)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mHorizontalWeight:F

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
.end method

.method public setReferenceIds([Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mReferenceIds:[Ljava/lang/String;

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
.end method

.method public setVerticalBias(F)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mVerticalBias:F

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
.end method

.method public setVerticalChainStyle(Landroidx/constraintlayout/core/dsl/Constraint$ChainMode;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mVerticalChainStyle:Landroidx/constraintlayout/core/dsl/Constraint$ChainMode;

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
.end method

.method public setVerticalWeight(F)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mVerticalWeight:F

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
.end method

.method public setWidth(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mWidth:I

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
.end method

.method public setWidthDefault(Landroidx/constraintlayout/core/dsl/Constraint$Behaviour;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mWidthDefault:Landroidx/constraintlayout/core/dsl/Constraint$Behaviour;

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
.end method

.method public setWidthMax(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mWidthMax:I

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
.end method

.method public setWidthMin(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mWidthMin:I

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
.end method

.method public setWidthPercent(F)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mWidthPercent:F

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
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    iget-object v2, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mId:Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v2, ":{\n"

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    move-result-object v1

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    iget-object v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mLeft:Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, v0}, Landroidx/constraintlayout/core/dsl/Constraint$Anchor;->build(Ljava/lang/StringBuilder;)V

    .line 30
    .line 31
    iget-object v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mRight:Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1, v0}, Landroidx/constraintlayout/core/dsl/Constraint$Anchor;->build(Ljava/lang/StringBuilder;)V

    .line 35
    .line 36
    iget-object v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mTop:Landroidx/constraintlayout/core/dsl/Constraint$VAnchor;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1, v0}, Landroidx/constraintlayout/core/dsl/Constraint$Anchor;->build(Ljava/lang/StringBuilder;)V

    .line 40
    .line 41
    iget-object v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mBottom:Landroidx/constraintlayout/core/dsl/Constraint$VAnchor;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1, v0}, Landroidx/constraintlayout/core/dsl/Constraint$Anchor;->build(Ljava/lang/StringBuilder;)V

    .line 45
    .line 46
    iget-object v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mStart:Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1, v0}, Landroidx/constraintlayout/core/dsl/Constraint$Anchor;->build(Ljava/lang/StringBuilder;)V

    .line 50
    .line 51
    iget-object v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mEnd:Landroidx/constraintlayout/core/dsl/Constraint$HAnchor;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1, v0}, Landroidx/constraintlayout/core/dsl/Constraint$Anchor;->build(Ljava/lang/StringBuilder;)V

    .line 55
    .line 56
    iget-object v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mBaseline:Landroidx/constraintlayout/core/dsl/Constraint$VAnchor;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1, v0}, Landroidx/constraintlayout/core/dsl/Constraint$Anchor;->build(Ljava/lang/StringBuilder;)V

    .line 60
    .line 61
    iget v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mWidth:I

    .line 62
    .line 63
    sget v2, Landroidx/constraintlayout/core/dsl/Constraint;->UNSET:I

    .line 64
    .line 65
    const-string v3, ",\n"

    .line 66
    .line 67
    if-eq v1, v2, :cond_0

    .line 68
    .line 69
    .line 70
    const-string/jumbo v1, "width:"

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    iget v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mWidth:I

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    :cond_0
    iget v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mHeight:I

    .line 84
    .line 85
    sget v2, Landroidx/constraintlayout/core/dsl/Constraint;->UNSET:I

    .line 86
    .line 87
    if-eq v1, v2, :cond_1

    .line 88
    .line 89
    const-string v1, "height:"

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    iget v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mHeight:I

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    :cond_1
    const-string v1, "horizontalBias"

    .line 103
    .line 104
    iget v2, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mHorizontalBias:F

    .line 105
    .line 106
    .line 107
    invoke-virtual {p0, v0, v1, v2}, Landroidx/constraintlayout/core/dsl/Constraint;->append(Ljava/lang/StringBuilder;Ljava/lang/String;F)V

    .line 108
    .line 109
    .line 110
    const-string/jumbo v1, "verticalBias"

    .line 111
    .line 112
    iget v2, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mVerticalBias:F

    .line 113
    .line 114
    .line 115
    invoke-virtual {p0, v0, v1, v2}, Landroidx/constraintlayout/core/dsl/Constraint;->append(Ljava/lang/StringBuilder;Ljava/lang/String;F)V

    .line 116
    .line 117
    iget-object v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mDimensionRatio:Ljava/lang/String;

    .line 118
    .line 119
    const-string v2, "\',\n"

    .line 120
    .line 121
    if-eqz v1, :cond_2

    .line 122
    .line 123
    const-string v1, "dimensionRatio:\'"

    .line 124
    .line 125
    .line 126
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    iget-object v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mDimensionRatio:Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    :cond_2
    iget-object v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mCircleConstraint:Ljava/lang/String;

    .line 137
    .line 138
    const-string v4, "\'"

    .line 139
    .line 140
    if-eqz v1, :cond_7

    .line 141
    .line 142
    iget v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mCircleAngle:F

    .line 143
    .line 144
    .line 145
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    .line 146
    move-result v1

    .line 147
    .line 148
    const/high16 v5, -0x80000000

    .line 149
    .line 150
    if-eqz v1, :cond_3

    .line 151
    .line 152
    iget v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mCircleRadius:I

    .line 153
    .line 154
    if-eq v1, v5, :cond_7

    .line 155
    .line 156
    :cond_3
    const-string v1, "circular:[\'"

    .line 157
    .line 158
    .line 159
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    iget-object v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mCircleConstraint:Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    iget v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mCircleAngle:F

    .line 170
    .line 171
    .line 172
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    .line 173
    move-result v1

    .line 174
    .line 175
    const-string v6, ","

    .line 176
    .line 177
    if-nez v1, :cond_4

    .line 178
    .line 179
    .line 180
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    iget v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mCircleAngle:F

    .line 183
    .line 184
    .line 185
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 186
    .line 187
    :cond_4
    iget v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mCircleRadius:I

    .line 188
    .line 189
    if-eq v1, v5, :cond_6

    .line 190
    .line 191
    iget v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mCircleAngle:F

    .line 192
    .line 193
    .line 194
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    .line 195
    move-result v1

    .line 196
    .line 197
    if-eqz v1, :cond_5

    .line 198
    .line 199
    const-string v1, ",0,"

    .line 200
    .line 201
    .line 202
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    iget v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mCircleRadius:I

    .line 205
    .line 206
    .line 207
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 208
    goto :goto_0

    .line 209
    .line 210
    .line 211
    :cond_5
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 212
    .line 213
    iget v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mCircleRadius:I

    .line 214
    .line 215
    .line 216
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 217
    .line 218
    :cond_6
    :goto_0
    const-string v1, "],\n"

    .line 219
    .line 220
    .line 221
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 222
    .line 223
    .line 224
    :cond_7
    const-string/jumbo v1, "verticalWeight"

    .line 225
    .line 226
    iget v5, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mVerticalWeight:F

    .line 227
    .line 228
    .line 229
    invoke-virtual {p0, v0, v1, v5}, Landroidx/constraintlayout/core/dsl/Constraint;->append(Ljava/lang/StringBuilder;Ljava/lang/String;F)V

    .line 230
    .line 231
    const-string v1, "horizontalWeight"

    .line 232
    .line 233
    iget v5, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mHorizontalWeight:F

    .line 234
    .line 235
    .line 236
    invoke-virtual {p0, v0, v1, v5}, Landroidx/constraintlayout/core/dsl/Constraint;->append(Ljava/lang/StringBuilder;Ljava/lang/String;F)V

    .line 237
    .line 238
    iget-object v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mHorizontalChainStyle:Landroidx/constraintlayout/core/dsl/Constraint$ChainMode;

    .line 239
    .line 240
    if-eqz v1, :cond_8

    .line 241
    .line 242
    const-string v1, "horizontalChainStyle:\'"

    .line 243
    .line 244
    .line 245
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 246
    .line 247
    sget-object v1, Landroidx/constraintlayout/core/dsl/Constraint;->chainModeMap:Ljava/util/Map;

    .line 248
    .line 249
    iget-object v5, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mHorizontalChainStyle:Landroidx/constraintlayout/core/dsl/Constraint$ChainMode;

    .line 250
    .line 251
    .line 252
    invoke-interface {v1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 253
    move-result-object v1

    .line 254
    .line 255
    check-cast v1, Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 259
    .line 260
    .line 261
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 262
    .line 263
    :cond_8
    iget-object v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mVerticalChainStyle:Landroidx/constraintlayout/core/dsl/Constraint$ChainMode;

    .line 264
    .line 265
    if-eqz v1, :cond_9

    .line 266
    .line 267
    .line 268
    const-string/jumbo v1, "verticalChainStyle:\'"

    .line 269
    .line 270
    .line 271
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 272
    .line 273
    sget-object v1, Landroidx/constraintlayout/core/dsl/Constraint;->chainModeMap:Ljava/util/Map;

    .line 274
    .line 275
    iget-object v5, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mVerticalChainStyle:Landroidx/constraintlayout/core/dsl/Constraint$ChainMode;

    .line 276
    .line 277
    .line 278
    invoke-interface {v1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 279
    move-result-object v1

    .line 280
    .line 281
    check-cast v1, Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 285
    .line 286
    .line 287
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 288
    .line 289
    :cond_9
    iget-object v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mWidthDefault:Landroidx/constraintlayout/core/dsl/Constraint$Behaviour;

    .line 290
    .line 291
    const-string v5, ",min:"

    .line 292
    .line 293
    const-string v6, ",max:"

    .line 294
    .line 295
    .line 296
    const-string/jumbo v7, "width:\'"

    .line 297
    .line 298
    .line 299
    const-string/jumbo v8, "},\n"

    .line 300
    .line 301
    if-eqz v1, :cond_d

    .line 302
    .line 303
    iget v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mWidthMax:I

    .line 304
    .line 305
    sget v9, Landroidx/constraintlayout/core/dsl/Constraint;->UNSET:I

    .line 306
    .line 307
    if-ne v1, v9, :cond_a

    .line 308
    .line 309
    iget v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mWidthMin:I

    .line 310
    .line 311
    if-ne v1, v9, :cond_a

    .line 312
    .line 313
    .line 314
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 315
    .line 316
    iget-object v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mWidthDefault:Landroidx/constraintlayout/core/dsl/Constraint$Behaviour;

    .line 317
    .line 318
    .line 319
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 320
    move-result-object v1

    .line 321
    .line 322
    .line 323
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 324
    move-result-object v1

    .line 325
    .line 326
    .line 327
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 328
    .line 329
    .line 330
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 331
    goto :goto_1

    .line 332
    .line 333
    .line 334
    :cond_a
    const-string/jumbo v1, "width:{value:\'"

    .line 335
    .line 336
    .line 337
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 338
    .line 339
    iget-object v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mWidthDefault:Landroidx/constraintlayout/core/dsl/Constraint$Behaviour;

    .line 340
    .line 341
    .line 342
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 343
    move-result-object v1

    .line 344
    .line 345
    .line 346
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 347
    move-result-object v1

    .line 348
    .line 349
    .line 350
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 351
    .line 352
    .line 353
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 354
    .line 355
    iget v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mWidthMax:I

    .line 356
    .line 357
    sget v9, Landroidx/constraintlayout/core/dsl/Constraint;->UNSET:I

    .line 358
    .line 359
    if-eq v1, v9, :cond_b

    .line 360
    .line 361
    .line 362
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 363
    .line 364
    iget v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mWidthMax:I

    .line 365
    .line 366
    .line 367
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 368
    .line 369
    :cond_b
    iget v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mWidthMin:I

    .line 370
    .line 371
    sget v9, Landroidx/constraintlayout/core/dsl/Constraint;->UNSET:I

    .line 372
    .line 373
    if-eq v1, v9, :cond_c

    .line 374
    .line 375
    .line 376
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 377
    .line 378
    iget v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mWidthMin:I

    .line 379
    .line 380
    .line 381
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 382
    .line 383
    .line 384
    :cond_c
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 385
    .line 386
    :cond_d
    :goto_1
    iget-object v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mHeightDefault:Landroidx/constraintlayout/core/dsl/Constraint$Behaviour;

    .line 387
    .line 388
    const-string v9, "height:\'"

    .line 389
    .line 390
    if-eqz v1, :cond_11

    .line 391
    .line 392
    iget v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mHeightMax:I

    .line 393
    .line 394
    sget v10, Landroidx/constraintlayout/core/dsl/Constraint;->UNSET:I

    .line 395
    .line 396
    if-ne v1, v10, :cond_e

    .line 397
    .line 398
    iget v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mHeightMin:I

    .line 399
    .line 400
    if-ne v1, v10, :cond_e

    .line 401
    .line 402
    .line 403
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 404
    .line 405
    iget-object v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mHeightDefault:Landroidx/constraintlayout/core/dsl/Constraint$Behaviour;

    .line 406
    .line 407
    .line 408
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 409
    move-result-object v1

    .line 410
    .line 411
    .line 412
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 413
    move-result-object v1

    .line 414
    .line 415
    .line 416
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 417
    .line 418
    .line 419
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 420
    goto :goto_2

    .line 421
    .line 422
    :cond_e
    const-string v1, "height:{value:\'"

    .line 423
    .line 424
    .line 425
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 426
    .line 427
    iget-object v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mHeightDefault:Landroidx/constraintlayout/core/dsl/Constraint$Behaviour;

    .line 428
    .line 429
    .line 430
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 431
    move-result-object v1

    .line 432
    .line 433
    .line 434
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 435
    move-result-object v1

    .line 436
    .line 437
    .line 438
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 439
    .line 440
    .line 441
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 442
    .line 443
    iget v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mHeightMax:I

    .line 444
    .line 445
    sget v2, Landroidx/constraintlayout/core/dsl/Constraint;->UNSET:I

    .line 446
    .line 447
    if-eq v1, v2, :cond_f

    .line 448
    .line 449
    .line 450
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 451
    .line 452
    iget v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mHeightMax:I

    .line 453
    .line 454
    .line 455
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 456
    .line 457
    :cond_f
    iget v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mHeightMin:I

    .line 458
    .line 459
    sget v2, Landroidx/constraintlayout/core/dsl/Constraint;->UNSET:I

    .line 460
    .line 461
    if-eq v1, v2, :cond_10

    .line 462
    .line 463
    .line 464
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 465
    .line 466
    iget v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mHeightMin:I

    .line 467
    .line 468
    .line 469
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 470
    .line 471
    .line 472
    :cond_10
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 473
    .line 474
    :cond_11
    :goto_2
    iget v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mWidthPercent:F

    .line 475
    float-to-double v1, v1

    .line 476
    .line 477
    .line 478
    invoke-static {v1, v2}, Ljava/lang/Double;->isNaN(D)Z

    .line 479
    move-result v1

    .line 480
    .line 481
    const-string v2, "%\',\n"

    .line 482
    .line 483
    if-nez v1, :cond_12

    .line 484
    .line 485
    .line 486
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 487
    .line 488
    iget v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mWidthPercent:F

    .line 489
    float-to-int v1, v1

    .line 490
    .line 491
    .line 492
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 493
    .line 494
    .line 495
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 496
    .line 497
    :cond_12
    iget v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mHeightPercent:F

    .line 498
    float-to-double v4, v1

    .line 499
    .line 500
    .line 501
    invoke-static {v4, v5}, Ljava/lang/Double;->isNaN(D)Z

    .line 502
    move-result v1

    .line 503
    .line 504
    if-nez v1, :cond_13

    .line 505
    .line 506
    .line 507
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 508
    .line 509
    iget v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mHeightPercent:F

    .line 510
    float-to-int v1, v1

    .line 511
    .line 512
    .line 513
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 514
    .line 515
    .line 516
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 517
    .line 518
    :cond_13
    iget-object v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mReferenceIds:[Ljava/lang/String;

    .line 519
    .line 520
    if-eqz v1, :cond_14

    .line 521
    .line 522
    .line 523
    const-string/jumbo v1, "referenceIds:"

    .line 524
    .line 525
    .line 526
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 527
    .line 528
    iget-object v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mReferenceIds:[Ljava/lang/String;

    .line 529
    .line 530
    .line 531
    invoke-virtual {p0, v1}, Landroidx/constraintlayout/core/dsl/Constraint;->convertStringArrayToString([Ljava/lang/String;)Ljava/lang/String;

    .line 532
    move-result-object v1

    .line 533
    .line 534
    .line 535
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 536
    .line 537
    .line 538
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 539
    .line 540
    :cond_14
    iget-boolean v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mConstrainedWidth:Z

    .line 541
    .line 542
    if-eqz v1, :cond_15

    .line 543
    .line 544
    const-string v1, "constrainedWidth:"

    .line 545
    .line 546
    .line 547
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 548
    .line 549
    iget-boolean v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mConstrainedWidth:Z

    .line 550
    .line 551
    .line 552
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 553
    .line 554
    .line 555
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 556
    .line 557
    :cond_15
    iget-boolean v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mConstrainedHeight:Z

    .line 558
    .line 559
    if-eqz v1, :cond_16

    .line 560
    .line 561
    const-string v1, "constrainedHeight:"

    .line 562
    .line 563
    .line 564
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 565
    .line 566
    iget-boolean v1, p0, Landroidx/constraintlayout/core/dsl/Constraint;->mConstrainedHeight:Z

    .line 567
    .line 568
    .line 569
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 570
    .line 571
    .line 572
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 573
    .line 574
    .line 575
    :cond_16
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 576
    .line 577
    .line 578
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 579
    move-result-object v0

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
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
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
.end method
