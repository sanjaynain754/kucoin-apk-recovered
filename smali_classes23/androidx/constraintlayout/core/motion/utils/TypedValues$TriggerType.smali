.class public interface abstract Landroidx/constraintlayout/core/motion/utils/TypedValues$TriggerType;
.super Ljava/lang/Object;
.source "TypedValues.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/constraintlayout/core/motion/utils/TypedValues;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "TriggerType"
.end annotation


# static fields
.field public static final CROSS:Ljava/lang/String; = "CROSS"

.field public static final KEY_WORDS:[Ljava/lang/String;

.field public static final NAME:Ljava/lang/String; = "KeyTrigger"

.field public static final NEGATIVE_CROSS:Ljava/lang/String; = "negativeCross"

.field public static final POSITIVE_CROSS:Ljava/lang/String; = "positiveCross"

.field public static final POST_LAYOUT:Ljava/lang/String; = "postLayout"

.field public static final TRIGGER_COLLISION_ID:Ljava/lang/String; = "triggerCollisionId"

.field public static final TRIGGER_COLLISION_VIEW:Ljava/lang/String; = "triggerCollisionView"

.field public static final TRIGGER_ID:Ljava/lang/String; = "triggerID"

.field public static final TRIGGER_RECEIVER:Ljava/lang/String; = "triggerReceiver"

.field public static final TRIGGER_SLACK:Ljava/lang/String; = "triggerSlack"

.field public static final TYPE_CROSS:I = 0x138

.field public static final TYPE_NEGATIVE_CROSS:I = 0x136

.field public static final TYPE_POSITIVE_CROSS:I = 0x135

.field public static final TYPE_POST_LAYOUT:I = 0x130

.field public static final TYPE_TRIGGER_COLLISION_ID:I = 0x133

.field public static final TYPE_TRIGGER_COLLISION_VIEW:I = 0x132

.field public static final TYPE_TRIGGER_ID:I = 0x134

.field public static final TYPE_TRIGGER_RECEIVER:I = 0x137

.field public static final TYPE_TRIGGER_SLACK:I = 0x131

.field public static final TYPE_VIEW_TRANSITION_ON_CROSS:I = 0x12d

.field public static final TYPE_VIEW_TRANSITION_ON_NEGATIVE_CROSS:I = 0x12f

.field public static final TYPE_VIEW_TRANSITION_ON_POSITIVE_CROSS:I = 0x12e

.field public static final VIEW_TRANSITION_ON_CROSS:Ljava/lang/String; = "viewTransitionOnCross"

.field public static final VIEW_TRANSITION_ON_NEGATIVE_CROSS:Ljava/lang/String; = "viewTransitionOnNegativeCross"

.field public static final VIEW_TRANSITION_ON_POSITIVE_CROSS:Ljava/lang/String; = "viewTransitionOnPositiveCross"


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .line 1
    .line 2
    .line 3
    const-string/jumbo v10, "triggerReceiver"

    .line 4
    .line 5
    const-string v11, "CROSS"

    .line 6
    .line 7
    .line 8
    const-string/jumbo v0, "viewTransitionOnCross"

    .line 9
    .line 10
    .line 11
    const-string/jumbo v1, "viewTransitionOnPositiveCross"

    .line 12
    .line 13
    .line 14
    const-string/jumbo v2, "viewTransitionOnNegativeCross"

    .line 15
    .line 16
    .line 17
    const-string/jumbo v3, "postLayout"

    .line 18
    .line 19
    .line 20
    const-string/jumbo v4, "triggerSlack"

    .line 21
    .line 22
    .line 23
    const-string/jumbo v5, "triggerCollisionView"

    .line 24
    .line 25
    .line 26
    const-string/jumbo v6, "triggerCollisionId"

    .line 27
    .line 28
    .line 29
    const-string/jumbo v7, "triggerID"

    .line 30
    .line 31
    .line 32
    const-string/jumbo v8, "positiveCross"

    .line 33
    .line 34
    .line 35
    const-string/jumbo v9, "negativeCross"

    .line 36
    .line 37
    .line 38
    filled-new-array/range {v0 .. v11}, [Ljava/lang/String;

    .line 39
    move-result-object v0

    .line 40
    .line 41
    sput-object v0, Landroidx/constraintlayout/core/motion/utils/TypedValues$TriggerType;->KEY_WORDS:[Ljava/lang/String;

    .line 42
    return-void
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
    const-string/jumbo v1, "triggerReceiver"

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
    .line 26
    :cond_0
    const/16 p0, 0xb

    .line 27
    .line 28
    goto/16 :goto_1

    .line 29
    .line 30
    .line 31
    :sswitch_1
    const-string/jumbo v1, "postLayout"

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 35
    move-result p0

    .line 36
    .line 37
    if-nez p0, :cond_1

    .line 38
    goto :goto_0

    .line 39
    .line 40
    :cond_1
    const/16 p0, 0xa

    .line 41
    .line 42
    goto/16 :goto_1

    .line 43
    .line 44
    .line 45
    :sswitch_2
    const-string/jumbo v1, "viewTransitionOnCross"

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 49
    move-result p0

    .line 50
    .line 51
    if-nez p0, :cond_2

    .line 52
    goto :goto_0

    .line 53
    .line 54
    :cond_2
    const/16 p0, 0x9

    .line 55
    .line 56
    goto/16 :goto_1

    .line 57
    .line 58
    .line 59
    :sswitch_3
    const-string/jumbo v1, "triggerSlack"

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 63
    move-result p0

    .line 64
    .line 65
    if-nez p0, :cond_3

    .line 66
    goto :goto_0

    .line 67
    .line 68
    :cond_3
    const/16 p0, 0x8

    .line 69
    .line 70
    goto/16 :goto_1

    .line 71
    .line 72
    :sswitch_4
    const-string v1, "CROSS"

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 76
    move-result p0

    .line 77
    .line 78
    if-nez p0, :cond_4

    .line 79
    goto :goto_0

    .line 80
    :cond_4
    const/4 p0, 0x7

    .line 81
    goto :goto_1

    .line 82
    .line 83
    .line 84
    :sswitch_5
    const-string/jumbo v1, "viewTransitionOnNegativeCross"

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 88
    move-result p0

    .line 89
    .line 90
    if-nez p0, :cond_5

    .line 91
    goto :goto_0

    .line 92
    :cond_5
    const/4 p0, 0x6

    .line 93
    goto :goto_1

    .line 94
    .line 95
    .line 96
    :sswitch_6
    const-string/jumbo v1, "triggerCollisionView"

    .line 97
    .line 98
    .line 99
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 100
    move-result p0

    .line 101
    .line 102
    if-nez p0, :cond_6

    .line 103
    goto :goto_0

    .line 104
    :cond_6
    const/4 p0, 0x5

    .line 105
    goto :goto_1

    .line 106
    .line 107
    .line 108
    :sswitch_7
    const-string/jumbo v1, "negativeCross"

    .line 109
    .line 110
    .line 111
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 112
    move-result p0

    .line 113
    .line 114
    if-nez p0, :cond_7

    .line 115
    goto :goto_0

    .line 116
    :cond_7
    const/4 p0, 0x4

    .line 117
    goto :goto_1

    .line 118
    .line 119
    .line 120
    :sswitch_8
    const-string/jumbo v1, "triggerID"

    .line 121
    .line 122
    .line 123
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 124
    move-result p0

    .line 125
    .line 126
    if-nez p0, :cond_8

    .line 127
    goto :goto_0

    .line 128
    :cond_8
    const/4 p0, 0x3

    .line 129
    goto :goto_1

    .line 130
    .line 131
    .line 132
    :sswitch_9
    const-string/jumbo v1, "triggerCollisionId"

    .line 133
    .line 134
    .line 135
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 136
    move-result p0

    .line 137
    .line 138
    if-nez p0, :cond_9

    .line 139
    goto :goto_0

    .line 140
    :cond_9
    const/4 p0, 0x2

    .line 141
    goto :goto_1

    .line 142
    .line 143
    .line 144
    :sswitch_a
    const-string/jumbo v1, "viewTransitionOnPositiveCross"

    .line 145
    .line 146
    .line 147
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 148
    move-result p0

    .line 149
    .line 150
    if-nez p0, :cond_a

    .line 151
    .line 152
    goto/16 :goto_0

    .line 153
    :cond_a
    const/4 p0, 0x1

    .line 154
    goto :goto_1

    .line 155
    .line 156
    .line 157
    :sswitch_b
    const-string/jumbo v1, "positiveCross"

    .line 158
    .line 159
    .line 160
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 161
    move-result p0

    .line 162
    .line 163
    if-nez p0, :cond_b

    .line 164
    .line 165
    goto/16 :goto_0

    .line 166
    :cond_b
    const/4 p0, 0x0

    .line 167
    .line 168
    .line 169
    :goto_1
    packed-switch p0, :pswitch_data_0

    .line 170
    return v0

    .line 171
    .line 172
    :pswitch_0
    const/16 p0, 0x137

    .line 173
    return p0

    .line 174
    .line 175
    :pswitch_1
    const/16 p0, 0x130

    .line 176
    return p0

    .line 177
    .line 178
    :pswitch_2
    const/16 p0, 0x12d

    .line 179
    return p0

    .line 180
    .line 181
    :pswitch_3
    const/16 p0, 0x131

    .line 182
    return p0

    .line 183
    .line 184
    :pswitch_4
    const/16 p0, 0x138

    .line 185
    return p0

    .line 186
    .line 187
    :pswitch_5
    const/16 p0, 0x12f

    .line 188
    return p0

    .line 189
    .line 190
    :pswitch_6
    const/16 p0, 0x132

    .line 191
    return p0

    .line 192
    .line 193
    :pswitch_7
    const/16 p0, 0x136

    .line 194
    return p0

    .line 195
    .line 196
    :pswitch_8
    const/16 p0, 0x134

    .line 197
    return p0

    .line 198
    .line 199
    :pswitch_9
    const/16 p0, 0x133

    .line 200
    return p0

    .line 201
    .line 202
    :pswitch_a
    const/16 p0, 0x12e

    .line 203
    return p0

    .line 204
    .line 205
    :pswitch_b
    const/16 p0, 0x135

    .line 206
    return p0

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
    :sswitch_data_0
    .sparse-switch
        -0x5f0e9e39 -> :sswitch_b
        -0x399a6b12 -> :sswitch_a
        -0x2ee3a4eb -> :sswitch_9
        -0x26ab2f2d -> :sswitch_8
        -0x26090af5 -> :sswitch_7
        -0x4880de1 -> :sswitch_6
        -0x94d7ce -> :sswitch_5
        0x3d6a020 -> :sswitch_4
        0x15b9acb8 -> :sswitch_3
        0x4d99e267 -> :sswitch_2
        0x538787ea -> :sswitch_1
        0x5b846bc7 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
