.class public Landroidx/constraintlayout/core/state/helpers/FlowReference;
.super Landroidx/constraintlayout/core/state/HelperReference;
.source "FlowReference.java"


# instance fields
.field protected mFirstHorizontalBias:F

.field protected mFirstHorizontalStyle:I

.field protected mFirstVerticalBias:F

.field protected mFirstVerticalStyle:I

.field protected mFlow:Landroidx/constraintlayout/core/widgets/Flow;

.field protected mHorizontalAlign:I

.field protected mHorizontalGap:I

.field protected mHorizontalStyle:I

.field protected mLastHorizontalBias:F

.field protected mLastHorizontalStyle:I

.field protected mLastVerticalBias:F

.field protected mLastVerticalStyle:I

.field protected mMapPostMargin:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field protected mMapPreMargin:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field protected mMapWeights:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field protected mMaxElementsWrap:I

.field protected mOrientation:I

.field protected mPaddingBottom:I

.field protected mPaddingLeft:I

.field protected mPaddingRight:I

.field protected mPaddingTop:I

.field protected mVerticalAlign:I

.field protected mVerticalGap:I

.field protected mVerticalStyle:I

.field protected mWrapMode:I


# direct methods
.method public constructor <init>(Landroidx/constraintlayout/core/state/State;Landroidx/constraintlayout/core/state/State$Helper;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Landroidx/constraintlayout/core/state/HelperReference;-><init>(Landroidx/constraintlayout/core/state/State;Landroidx/constraintlayout/core/state/State$Helper;)V

    .line 4
    const/4 p1, 0x0

    .line 5
    .line 6
    iput p1, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mWrapMode:I

    .line 7
    const/4 v0, -0x1

    .line 8
    .line 9
    iput v0, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mVerticalStyle:I

    .line 10
    .line 11
    iput v0, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mFirstVerticalStyle:I

    .line 12
    .line 13
    iput v0, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mLastVerticalStyle:I

    .line 14
    .line 15
    iput v0, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mHorizontalStyle:I

    .line 16
    .line 17
    iput v0, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mFirstHorizontalStyle:I

    .line 18
    .line 19
    iput v0, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mLastHorizontalStyle:I

    .line 20
    const/4 v1, 0x2

    .line 21
    .line 22
    iput v1, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mVerticalAlign:I

    .line 23
    .line 24
    iput v1, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mHorizontalAlign:I

    .line 25
    .line 26
    iput p1, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mVerticalGap:I

    .line 27
    .line 28
    iput p1, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mHorizontalGap:I

    .line 29
    .line 30
    iput p1, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mPaddingLeft:I

    .line 31
    .line 32
    iput p1, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mPaddingRight:I

    .line 33
    .line 34
    iput p1, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mPaddingTop:I

    .line 35
    .line 36
    iput p1, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mPaddingBottom:I

    .line 37
    .line 38
    iput v0, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mMaxElementsWrap:I

    .line 39
    .line 40
    iput p1, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mOrientation:I

    .line 41
    .line 42
    const/high16 p1, 0x3f000000    # 0.5f

    .line 43
    .line 44
    iput p1, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mFirstVerticalBias:F

    .line 45
    .line 46
    iput p1, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mLastVerticalBias:F

    .line 47
    .line 48
    iput p1, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mFirstHorizontalBias:F

    .line 49
    .line 50
    iput p1, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mLastHorizontalBias:F

    .line 51
    .line 52
    sget-object p1, Landroidx/constraintlayout/core/state/State$Helper;->VERTICAL_FLOW:Landroidx/constraintlayout/core/state/State$Helper;

    .line 53
    .line 54
    if-ne p2, p1, :cond_0

    .line 55
    const/4 p1, 0x1

    .line 56
    .line 57
    iput p1, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mOrientation:I

    .line 58
    :cond_0
    return-void
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
.end method


# virtual methods
.method public addFlowElement(Ljava/lang/String;FFF)V
    .locals 1

    .line 1
    .line 2
    .line 3
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-super {p0, v0}, Landroidx/constraintlayout/core/state/HelperReference;->add([Ljava/lang/Object;)Landroidx/constraintlayout/core/state/HelperReference;

    .line 8
    .line 9
    .line 10
    invoke-static {p2}, Ljava/lang/Float;->isNaN(F)Z

    .line 11
    move-result v0

    .line 12
    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    iget-object v0, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mMapWeights:Ljava/util/HashMap;

    .line 16
    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    new-instance v0, Ljava/util/HashMap;

    .line 20
    .line 21
    .line 22
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 23
    .line 24
    iput-object v0, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mMapWeights:Ljava/util/HashMap;

    .line 25
    .line 26
    :cond_0
    iget-object v0, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mMapWeights:Ljava/util/HashMap;

    .line 27
    .line 28
    .line 29
    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 30
    move-result-object p2

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    :cond_1
    invoke-static {p3}, Ljava/lang/Float;->isNaN(F)Z

    .line 37
    move-result p2

    .line 38
    .line 39
    if-nez p2, :cond_3

    .line 40
    .line 41
    iget-object p2, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mMapPreMargin:Ljava/util/HashMap;

    .line 42
    .line 43
    if-nez p2, :cond_2

    .line 44
    .line 45
    new-instance p2, Ljava/util/HashMap;

    .line 46
    .line 47
    .line 48
    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    .line 49
    .line 50
    iput-object p2, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mMapPreMargin:Ljava/util/HashMap;

    .line 51
    .line 52
    :cond_2
    iget-object p2, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mMapPreMargin:Ljava/util/HashMap;

    .line 53
    .line 54
    .line 55
    invoke-static {p3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 56
    move-result-object p3

    .line 57
    .line 58
    .line 59
    invoke-virtual {p2, p1, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    :cond_3
    invoke-static {p4}, Ljava/lang/Float;->isNaN(F)Z

    .line 63
    move-result p2

    .line 64
    .line 65
    if-nez p2, :cond_5

    .line 66
    .line 67
    iget-object p2, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mMapPostMargin:Ljava/util/HashMap;

    .line 68
    .line 69
    if-nez p2, :cond_4

    .line 70
    .line 71
    new-instance p2, Ljava/util/HashMap;

    .line 72
    .line 73
    .line 74
    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    .line 75
    .line 76
    iput-object p2, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mMapPostMargin:Ljava/util/HashMap;

    .line 77
    .line 78
    :cond_4
    iget-object p2, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mMapPostMargin:Ljava/util/HashMap;

    .line 79
    .line 80
    .line 81
    invoke-static {p4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 82
    move-result-object p3

    .line 83
    .line 84
    .line 85
    invoke-virtual {p2, p1, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    :cond_5
    return-void
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

.method public apply()V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/constraintlayout/core/state/helpers/FlowReference;->getHelperWidget()Landroidx/constraintlayout/core/widgets/HelperWidget;

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mFlow:Landroidx/constraintlayout/core/widgets/Flow;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0}, Landroidx/constraintlayout/core/state/ConstraintReference;->setConstraintWidget(Landroidx/constraintlayout/core/widgets/ConstraintWidget;)V

    .line 9
    .line 10
    iget-object v0, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mFlow:Landroidx/constraintlayout/core/widgets/Flow;

    .line 11
    .line 12
    iget v1, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mOrientation:I

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroidx/constraintlayout/core/widgets/Flow;->setOrientation(I)V

    .line 16
    .line 17
    iget-object v0, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mFlow:Landroidx/constraintlayout/core/widgets/Flow;

    .line 18
    .line 19
    iget v1, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mWrapMode:I

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Landroidx/constraintlayout/core/widgets/Flow;->setWrapMode(I)V

    .line 23
    .line 24
    iget v0, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mMaxElementsWrap:I

    .line 25
    const/4 v1, -0x1

    .line 26
    .line 27
    if-eq v0, v1, :cond_0

    .line 28
    .line 29
    iget-object v2, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mFlow:Landroidx/constraintlayout/core/widgets/Flow;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v2, v0}, Landroidx/constraintlayout/core/widgets/Flow;->setMaxElementsWrap(I)V

    .line 33
    .line 34
    :cond_0
    iget v0, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mPaddingLeft:I

    .line 35
    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    iget-object v2, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mFlow:Landroidx/constraintlayout/core/widgets/Flow;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2, v0}, Landroidx/constraintlayout/core/widgets/VirtualLayout;->setPaddingLeft(I)V

    .line 42
    .line 43
    :cond_1
    iget v0, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mPaddingTop:I

    .line 44
    .line 45
    if-eqz v0, :cond_2

    .line 46
    .line 47
    iget-object v2, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mFlow:Landroidx/constraintlayout/core/widgets/Flow;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2, v0}, Landroidx/constraintlayout/core/widgets/VirtualLayout;->setPaddingTop(I)V

    .line 51
    .line 52
    :cond_2
    iget v0, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mPaddingRight:I

    .line 53
    .line 54
    if-eqz v0, :cond_3

    .line 55
    .line 56
    iget-object v2, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mFlow:Landroidx/constraintlayout/core/widgets/Flow;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v2, v0}, Landroidx/constraintlayout/core/widgets/VirtualLayout;->setPaddingRight(I)V

    .line 60
    .line 61
    :cond_3
    iget v0, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mPaddingBottom:I

    .line 62
    .line 63
    if-eqz v0, :cond_4

    .line 64
    .line 65
    iget-object v2, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mFlow:Landroidx/constraintlayout/core/widgets/Flow;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v2, v0}, Landroidx/constraintlayout/core/widgets/VirtualLayout;->setPaddingBottom(I)V

    .line 69
    .line 70
    :cond_4
    iget v0, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mHorizontalGap:I

    .line 71
    .line 72
    if-eqz v0, :cond_5

    .line 73
    .line 74
    iget-object v2, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mFlow:Landroidx/constraintlayout/core/widgets/Flow;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v2, v0}, Landroidx/constraintlayout/core/widgets/Flow;->setHorizontalGap(I)V

    .line 78
    .line 79
    :cond_5
    iget v0, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mVerticalGap:I

    .line 80
    .line 81
    if-eqz v0, :cond_6

    .line 82
    .line 83
    iget-object v2, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mFlow:Landroidx/constraintlayout/core/widgets/Flow;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v2, v0}, Landroidx/constraintlayout/core/widgets/Flow;->setVerticalGap(I)V

    .line 87
    .line 88
    :cond_6
    iget v0, p0, Landroidx/constraintlayout/core/state/ConstraintReference;->mHorizontalBias:F

    .line 89
    .line 90
    const/high16 v2, 0x3f000000    # 0.5f

    .line 91
    .line 92
    cmpl-float v3, v0, v2

    .line 93
    .line 94
    if-eqz v3, :cond_7

    .line 95
    .line 96
    iget-object v3, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mFlow:Landroidx/constraintlayout/core/widgets/Flow;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v3, v0}, Landroidx/constraintlayout/core/widgets/Flow;->setHorizontalBias(F)V

    .line 100
    .line 101
    :cond_7
    iget v0, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mFirstHorizontalBias:F

    .line 102
    .line 103
    cmpl-float v3, v0, v2

    .line 104
    .line 105
    if-eqz v3, :cond_8

    .line 106
    .line 107
    iget-object v3, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mFlow:Landroidx/constraintlayout/core/widgets/Flow;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v3, v0}, Landroidx/constraintlayout/core/widgets/Flow;->setFirstHorizontalBias(F)V

    .line 111
    .line 112
    :cond_8
    iget v0, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mLastHorizontalBias:F

    .line 113
    .line 114
    cmpl-float v3, v0, v2

    .line 115
    .line 116
    if-eqz v3, :cond_9

    .line 117
    .line 118
    iget-object v3, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mFlow:Landroidx/constraintlayout/core/widgets/Flow;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v3, v0}, Landroidx/constraintlayout/core/widgets/Flow;->setLastHorizontalBias(F)V

    .line 122
    .line 123
    :cond_9
    iget v0, p0, Landroidx/constraintlayout/core/state/ConstraintReference;->mVerticalBias:F

    .line 124
    .line 125
    cmpl-float v3, v0, v2

    .line 126
    .line 127
    if-eqz v3, :cond_a

    .line 128
    .line 129
    iget-object v3, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mFlow:Landroidx/constraintlayout/core/widgets/Flow;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v3, v0}, Landroidx/constraintlayout/core/widgets/Flow;->setVerticalBias(F)V

    .line 133
    .line 134
    :cond_a
    iget v0, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mFirstVerticalBias:F

    .line 135
    .line 136
    cmpl-float v3, v0, v2

    .line 137
    .line 138
    if-eqz v3, :cond_b

    .line 139
    .line 140
    iget-object v3, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mFlow:Landroidx/constraintlayout/core/widgets/Flow;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v3, v0}, Landroidx/constraintlayout/core/widgets/Flow;->setFirstVerticalBias(F)V

    .line 144
    .line 145
    :cond_b
    iget v0, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mLastVerticalBias:F

    .line 146
    .line 147
    cmpl-float v2, v0, v2

    .line 148
    .line 149
    if-eqz v2, :cond_c

    .line 150
    .line 151
    iget-object v2, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mFlow:Landroidx/constraintlayout/core/widgets/Flow;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v2, v0}, Landroidx/constraintlayout/core/widgets/Flow;->setLastVerticalBias(F)V

    .line 155
    .line 156
    :cond_c
    iget v0, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mHorizontalAlign:I

    .line 157
    const/4 v2, 0x2

    .line 158
    .line 159
    if-eq v0, v2, :cond_d

    .line 160
    .line 161
    iget-object v3, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mFlow:Landroidx/constraintlayout/core/widgets/Flow;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v3, v0}, Landroidx/constraintlayout/core/widgets/Flow;->setHorizontalAlign(I)V

    .line 165
    .line 166
    :cond_d
    iget v0, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mVerticalAlign:I

    .line 167
    .line 168
    if-eq v0, v2, :cond_e

    .line 169
    .line 170
    iget-object v2, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mFlow:Landroidx/constraintlayout/core/widgets/Flow;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v2, v0}, Landroidx/constraintlayout/core/widgets/Flow;->setVerticalAlign(I)V

    .line 174
    .line 175
    :cond_e
    iget v0, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mVerticalStyle:I

    .line 176
    .line 177
    if-eq v0, v1, :cond_f

    .line 178
    .line 179
    iget-object v2, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mFlow:Landroidx/constraintlayout/core/widgets/Flow;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v2, v0}, Landroidx/constraintlayout/core/widgets/Flow;->setVerticalStyle(I)V

    .line 183
    .line 184
    :cond_f
    iget v0, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mFirstVerticalStyle:I

    .line 185
    .line 186
    if-eq v0, v1, :cond_10

    .line 187
    .line 188
    iget-object v2, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mFlow:Landroidx/constraintlayout/core/widgets/Flow;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v2, v0}, Landroidx/constraintlayout/core/widgets/Flow;->setFirstVerticalStyle(I)V

    .line 192
    .line 193
    :cond_10
    iget v0, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mLastVerticalStyle:I

    .line 194
    .line 195
    if-eq v0, v1, :cond_11

    .line 196
    .line 197
    iget-object v2, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mFlow:Landroidx/constraintlayout/core/widgets/Flow;

    .line 198
    .line 199
    .line 200
    invoke-virtual {v2, v0}, Landroidx/constraintlayout/core/widgets/Flow;->setLastVerticalStyle(I)V

    .line 201
    .line 202
    :cond_11
    iget v0, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mHorizontalStyle:I

    .line 203
    .line 204
    if-eq v0, v1, :cond_12

    .line 205
    .line 206
    iget-object v2, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mFlow:Landroidx/constraintlayout/core/widgets/Flow;

    .line 207
    .line 208
    .line 209
    invoke-virtual {v2, v0}, Landroidx/constraintlayout/core/widgets/Flow;->setHorizontalStyle(I)V

    .line 210
    .line 211
    :cond_12
    iget v0, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mFirstHorizontalStyle:I

    .line 212
    .line 213
    if-eq v0, v1, :cond_13

    .line 214
    .line 215
    iget-object v2, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mFlow:Landroidx/constraintlayout/core/widgets/Flow;

    .line 216
    .line 217
    .line 218
    invoke-virtual {v2, v0}, Landroidx/constraintlayout/core/widgets/Flow;->setFirstHorizontalStyle(I)V

    .line 219
    .line 220
    :cond_13
    iget v0, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mLastHorizontalStyle:I

    .line 221
    .line 222
    if-eq v0, v1, :cond_14

    .line 223
    .line 224
    iget-object v1, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mFlow:Landroidx/constraintlayout/core/widgets/Flow;

    .line 225
    .line 226
    .line 227
    invoke-virtual {v1, v0}, Landroidx/constraintlayout/core/widgets/Flow;->setLastHorizontalStyle(I)V

    .line 228
    .line 229
    .line 230
    :cond_14
    invoke-virtual {p0}, Landroidx/constraintlayout/core/state/HelperReference;->applyBase()V

    .line 231
    return-void
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

.method public getFirstHorizontalBias()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mFirstHorizontalBias:F

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

.method public getFirstHorizontalStyle()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mFirstHorizontalStyle:I

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

.method public getFirstVerticalBias()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mFirstVerticalBias:F

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

.method public getFirstVerticalStyle()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mFirstVerticalStyle:I

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

.method public getHelperWidget()Landroidx/constraintlayout/core/widgets/HelperWidget;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mFlow:Landroidx/constraintlayout/core/widgets/Flow;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Landroidx/constraintlayout/core/widgets/Flow;

    .line 7
    .line 8
    .line 9
    invoke-direct {v0}, Landroidx/constraintlayout/core/widgets/Flow;-><init>()V

    .line 10
    .line 11
    iput-object v0, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mFlow:Landroidx/constraintlayout/core/widgets/Flow;

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mFlow:Landroidx/constraintlayout/core/widgets/Flow;

    .line 14
    return-object v0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
.end method

.method public getHorizontalAlign()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mHorizontalAlign:I

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
    iget v0, p0, Landroidx/constraintlayout/core/state/ConstraintReference;->mHorizontalBias:F

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

.method public getHorizontalGap()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mHorizontalGap:I

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

.method public getHorizontalStyle()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mHorizontalStyle:I

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

.method public getLastHorizontalBias()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mLastHorizontalBias:F

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

.method public getLastHorizontalStyle()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mLastHorizontalStyle:I

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

.method public getLastVerticalBias()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mLastVerticalBias:F

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

.method public getLastVerticalStyle()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mLastVerticalStyle:I

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

.method public getMaxElementsWrap()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mMaxElementsWrap:I

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

.method public getOrientation()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mOrientation:I

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

.method public getPaddingBottom()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mPaddingBottom:I

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

.method public getPaddingLeft()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mPaddingLeft:I

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

.method public getPaddingRight()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mPaddingRight:I

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

.method public getPaddingTop()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mPaddingTop:I

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

.method public getPostMargin(Ljava/lang/String;)F
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mMapPreMargin:Ljava/util/HashMap;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 8
    move-result v0

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mMapPreMargin:Ljava/util/HashMap;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    move-result-object p1

    .line 17
    .line 18
    check-cast p1, Ljava/lang/Float;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 22
    move-result p1

    .line 23
    return p1

    .line 24
    :cond_0
    const/4 p1, 0x0

    .line 25
    return p1
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
.end method

.method public getPreMargin(Ljava/lang/String;)F
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mMapPostMargin:Ljava/util/HashMap;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 8
    move-result v0

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mMapPostMargin:Ljava/util/HashMap;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    move-result-object p1

    .line 17
    .line 18
    check-cast p1, Ljava/lang/Float;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 22
    move-result p1

    .line 23
    return p1

    .line 24
    :cond_0
    const/4 p1, 0x0

    .line 25
    return p1
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
.end method

.method public getVerticalAlign()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mVerticalAlign:I

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

.method public getVerticalBias()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Landroidx/constraintlayout/core/state/ConstraintReference;->mVerticalBias:F

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

.method public getVerticalGap()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mVerticalGap:I

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

.method public getVerticalStyle()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mVerticalStyle:I

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

.method public getWeight(Ljava/lang/String;)F
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mMapWeights:Ljava/util/HashMap;

    .line 3
    .line 4
    const/high16 v1, -0x40800000    # -1.0f

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    return v1

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 11
    move-result v0

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    iget-object v0, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mMapWeights:Ljava/util/HashMap;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    move-result-object p1

    .line 20
    .line 21
    check-cast p1, Ljava/lang/Float;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 25
    move-result p1

    .line 26
    return p1

    .line 27
    :cond_1
    return v1
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
.end method

.method public getWrapMode()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mWrapMode:I

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

.method public setFirstHorizontalBias(F)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mFirstHorizontalBias:F

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

.method public setFirstHorizontalStyle(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mFirstHorizontalStyle:I

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

.method public setFirstVerticalBias(F)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mFirstVerticalBias:F

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

.method public setFirstVerticalStyle(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mFirstVerticalStyle:I

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

.method public setHelperWidget(Landroidx/constraintlayout/core/widgets/HelperWidget;)V
    .locals 1

    .line 1
    .line 2
    instance-of v0, p1, Landroidx/constraintlayout/core/widgets/Flow;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    check-cast p1, Landroidx/constraintlayout/core/widgets/Flow;

    .line 7
    .line 8
    iput-object p1, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mFlow:Landroidx/constraintlayout/core/widgets/Flow;

    .line 9
    return-void

    .line 10
    :cond_0
    const/4 p1, 0x0

    .line 11
    .line 12
    iput-object p1, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mFlow:Landroidx/constraintlayout/core/widgets/Flow;

    .line 13
    return-void
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

.method public setHorizontalAlign(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mHorizontalAlign:I

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

.method public setHorizontalGap(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mHorizontalGap:I

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

.method public setHorizontalStyle(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mHorizontalStyle:I

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

.method public setLastHorizontalBias(F)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mLastHorizontalBias:F

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

.method public setLastHorizontalStyle(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mLastHorizontalStyle:I

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

.method public setLastVerticalBias(F)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mLastVerticalBias:F

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

.method public setLastVerticalStyle(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mLastVerticalStyle:I

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

.method public setMaxElementsWrap(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mMaxElementsWrap:I

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

.method public setOrientation(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mOrientation:I

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

.method public setPaddingBottom(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mPaddingBottom:I

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

.method public setPaddingLeft(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mPaddingLeft:I

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

.method public setPaddingRight(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mPaddingRight:I

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

.method public setPaddingTop(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mPaddingTop:I

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

.method public setVerticalAlign(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mVerticalAlign:I

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

.method public setVerticalGap(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mVerticalGap:I

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

.method public setVerticalStyle(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mVerticalStyle:I

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

.method public setWrapMode(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Landroidx/constraintlayout/core/state/helpers/FlowReference;->mWrapMode:I

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
