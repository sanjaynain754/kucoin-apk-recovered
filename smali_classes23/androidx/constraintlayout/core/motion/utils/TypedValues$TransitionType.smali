.class public interface abstract Landroidx/constraintlayout/core/motion/utils/TypedValues$TransitionType;
.super Ljava/lang/Object;
.source "TypedValues.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/constraintlayout/core/motion/utils/TypedValues;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "TransitionType"
.end annotation


# static fields
.field public static final KEY_WORDS:[Ljava/lang/String;

.field public static final NAME:Ljava/lang/String; = "Transitions"

.field public static final S_AUTO_TRANSITION:Ljava/lang/String; = "autoTransition"

.field public static final S_DURATION:Ljava/lang/String; = "duration"

.field public static final S_FROM:Ljava/lang/String; = "from"

.field public static final S_INTERPOLATOR:Ljava/lang/String; = "motionInterpolator"

.field public static final S_PATH_MOTION_ARC:Ljava/lang/String; = "pathMotionArc"

.field public static final S_STAGGERED:Ljava/lang/String; = "staggered"

.field public static final S_TO:Ljava/lang/String; = "to"

.field public static final S_TRANSITION_FLAGS:Ljava/lang/String; = "transitionFlags"

.field public static final TYPE_AUTO_TRANSITION:I = 0x2c0

.field public static final TYPE_DURATION:I = 0x2bc

.field public static final TYPE_FROM:I = 0x2bd

.field public static final TYPE_INTERPOLATOR:I = 0x2c1

.field public static final TYPE_PATH_MOTION_ARC:I = 0x1fd

.field public static final TYPE_STAGGERED:I = 0x2c2

.field public static final TYPE_TO:I = 0x2be

.field public static final TYPE_TRANSITION_FLAGS:I = 0x2c3


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    .line 2
    const-string v7, "from"

    .line 3
    .line 4
    .line 5
    const-string/jumbo v8, "transitionFlags"

    .line 6
    .line 7
    const-string v0, "duration"

    .line 8
    .line 9
    const-string v1, "from"

    .line 10
    .line 11
    .line 12
    const-string/jumbo v2, "to"

    .line 13
    .line 14
    .line 15
    const-string/jumbo v3, "pathMotionArc"

    .line 16
    .line 17
    const-string v4, "autoTransition"

    .line 18
    .line 19
    .line 20
    const-string/jumbo v5, "motionInterpolator"

    .line 21
    .line 22
    .line 23
    const-string/jumbo v6, "staggered"

    .line 24
    .line 25
    .line 26
    filled-new-array/range {v0 .. v8}, [Ljava/lang/String;

    .line 27
    move-result-object v0

    .line 28
    .line 29
    sput-object v0, Landroidx/constraintlayout/core/motion/utils/TypedValues$TransitionType;->KEY_WORDS:[Ljava/lang/String;

    .line 30
    return-void
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
.end method

.method public static getId(Ljava/lang/String;)I
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    const/4 v0, -0x1

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 8
    move-result v1

    .line 9
    .line 10
    .line 11
    sparse-switch v1, :sswitch_data_0

    .line 12
    :goto_0
    move p0, v0

    .line 13
    .line 14
    goto/16 :goto_1

    .line 15
    .line 16
    .line 17
    :sswitch_0
    const-string/jumbo v1, "staggered"

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 21
    move-result p0

    .line 22
    .line 23
    if-nez p0, :cond_0

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 p0, 0x7

    .line 26
    goto :goto_1

    .line 27
    .line 28
    .line 29
    :sswitch_1
    const-string/jumbo v1, "pathMotionArc"

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 33
    move-result p0

    .line 34
    .line 35
    if-nez p0, :cond_1

    .line 36
    goto :goto_0

    .line 37
    :cond_1
    const/4 p0, 0x6

    .line 38
    goto :goto_1

    .line 39
    .line 40
    :sswitch_2
    const-string v1, "from"

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 44
    move-result p0

    .line 45
    .line 46
    if-nez p0, :cond_2

    .line 47
    goto :goto_0

    .line 48
    :cond_2
    const/4 p0, 0x5

    .line 49
    goto :goto_1

    .line 50
    .line 51
    .line 52
    :sswitch_3
    const-string/jumbo v1, "to"

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 56
    move-result p0

    .line 57
    .line 58
    if-nez p0, :cond_3

    .line 59
    goto :goto_0

    .line 60
    :cond_3
    const/4 p0, 0x4

    .line 61
    goto :goto_1

    .line 62
    .line 63
    :sswitch_4
    const-string v1, "autoTransition"

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 67
    move-result p0

    .line 68
    .line 69
    if-nez p0, :cond_4

    .line 70
    goto :goto_0

    .line 71
    :cond_4
    const/4 p0, 0x3

    .line 72
    goto :goto_1

    .line 73
    .line 74
    .line 75
    :sswitch_5
    const-string/jumbo v1, "motionInterpolator"

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 79
    move-result p0

    .line 80
    .line 81
    if-nez p0, :cond_5

    .line 82
    goto :goto_0

    .line 83
    :cond_5
    const/4 p0, 0x2

    .line 84
    goto :goto_1

    .line 85
    .line 86
    :sswitch_6
    const-string v1, "duration"

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 90
    move-result p0

    .line 91
    .line 92
    if-nez p0, :cond_6

    .line 93
    goto :goto_0

    .line 94
    :cond_6
    const/4 p0, 0x1

    .line 95
    goto :goto_1

    .line 96
    .line 97
    .line 98
    :sswitch_7
    const-string/jumbo v1, "transitionFlags"

    .line 99
    .line 100
    .line 101
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 102
    move-result p0

    .line 103
    .line 104
    if-nez p0, :cond_7

    .line 105
    goto :goto_0

    .line 106
    :cond_7
    const/4 p0, 0x0

    .line 107
    .line 108
    .line 109
    :goto_1
    packed-switch p0, :pswitch_data_0

    .line 110
    return v0

    .line 111
    .line 112
    :pswitch_0
    const/16 p0, 0x2c2

    .line 113
    return p0

    .line 114
    .line 115
    :pswitch_1
    const/16 p0, 0x1fd

    .line 116
    return p0

    .line 117
    .line 118
    :pswitch_2
    const/16 p0, 0x2bd

    .line 119
    return p0

    .line 120
    .line 121
    :pswitch_3
    const/16 p0, 0x2be

    .line 122
    return p0

    .line 123
    .line 124
    :pswitch_4
    const/16 p0, 0x2c0

    .line 125
    return p0

    .line 126
    .line 127
    :pswitch_5
    const/16 p0, 0x2c1

    .line 128
    return p0

    .line 129
    .line 130
    :pswitch_6
    const/16 p0, 0x2bc

    .line 131
    return p0

    .line 132
    .line 133
    :pswitch_7
    const/16 p0, 0x2c3

    .line 134
    return p0

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
    :sswitch_data_0
    .sparse-switch
        -0x770661ce -> :sswitch_7
        -0x76bbb26c -> :sswitch_6
        -0x50ef8463 -> :sswitch_5
        -0x4d5ee79c -> :sswitch_4
        0xe7b -> :sswitch_3
        0x3017aa -> :sswitch_2
        0x4e203417 -> :sswitch_1
        0x6da0e50c -> :sswitch_0
    .end sparse-switch

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
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method public static getType(I)I
    .locals 1

    .line 1
    .line 2
    const/16 v0, 0x1fd

    .line 3
    .line 4
    if-eq p0, v0, :cond_0

    .line 5
    .line 6
    .line 7
    packed-switch p0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    packed-switch p0, :pswitch_data_1

    .line 11
    const/4 p0, -0x1

    .line 12
    return p0

    .line 13
    :pswitch_0
    const/4 p0, 0x4

    .line 14
    return p0

    .line 15
    .line 16
    :pswitch_1
    const/16 p0, 0x8

    .line 17
    return p0

    .line 18
    :cond_0
    :pswitch_2
    const/4 p0, 0x2

    .line 19
    return p0

    .line 20
    nop

    .line 21
    .line 22
    .line 23
    .line 24
    :pswitch_data_0
    .packed-switch 0x2bc
        :pswitch_2
        :pswitch_1
        :pswitch_1
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x2c1
        :pswitch_1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
