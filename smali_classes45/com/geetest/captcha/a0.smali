.class public final enum Lcom/geetest/captcha/a0;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/geetest/captcha/a0$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/geetest/captcha/a0;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum CANCEL:Lcom/geetest/captcha/a0;

.field public static final enum END:Lcom/geetest/captcha/a0;

.field public static final enum FAIL:Lcom/geetest/captcha/a0;

.field public static final enum FLOWING:Lcom/geetest/captcha/a0;

.field public static final enum NONE:Lcom/geetest/captcha/a0;

.field public static final enum SUCCESS:Lcom/geetest/captcha/a0;

.field public static final synthetic a:[Lcom/geetest/captcha/a0;


# instance fields
.field private type:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 9

    .line 1
    .line 2
    new-instance v0, Lcom/geetest/captcha/a0;

    .line 3
    .line 4
    const-string v1, "FLOWING"

    .line 5
    .line 6
    const-string v2, "-10"

    .line 7
    const/4 v3, 0x0

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, v3, v1, v2}, Lcom/geetest/captcha/a0;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 11
    .line 12
    sput-object v0, Lcom/geetest/captcha/a0;->FLOWING:Lcom/geetest/captcha/a0;

    .line 13
    .line 14
    new-instance v1, Lcom/geetest/captcha/a0;

    .line 15
    .line 16
    const-string v2, "SUCCESS"

    .line 17
    .line 18
    const-string v3, "-11"

    .line 19
    const/4 v4, 0x1

    .line 20
    .line 21
    .line 22
    invoke-direct {v1, v4, v2, v3}, Lcom/geetest/captcha/a0;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 23
    .line 24
    sput-object v1, Lcom/geetest/captcha/a0;->SUCCESS:Lcom/geetest/captcha/a0;

    .line 25
    .line 26
    new-instance v2, Lcom/geetest/captcha/a0;

    .line 27
    .line 28
    const-string v3, "END"

    .line 29
    .line 30
    const-string v4, "-12"

    .line 31
    const/4 v5, 0x2

    .line 32
    .line 33
    .line 34
    invoke-direct {v2, v5, v3, v4}, Lcom/geetest/captcha/a0;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 35
    .line 36
    sput-object v2, Lcom/geetest/captcha/a0;->END:Lcom/geetest/captcha/a0;

    .line 37
    .line 38
    new-instance v3, Lcom/geetest/captcha/a0;

    .line 39
    .line 40
    const-string v4, "FAIL"

    .line 41
    .line 42
    const-string v5, "-13"

    .line 43
    const/4 v6, 0x3

    .line 44
    .line 45
    .line 46
    invoke-direct {v3, v6, v4, v5}, Lcom/geetest/captcha/a0;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 47
    .line 48
    sput-object v3, Lcom/geetest/captcha/a0;->FAIL:Lcom/geetest/captcha/a0;

    .line 49
    .line 50
    new-instance v4, Lcom/geetest/captcha/a0;

    .line 51
    .line 52
    const-string v5, "CANCEL"

    .line 53
    .line 54
    const-string v6, "-14"

    .line 55
    const/4 v7, 0x4

    .line 56
    .line 57
    .line 58
    invoke-direct {v4, v7, v5, v6}, Lcom/geetest/captcha/a0;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 59
    .line 60
    sput-object v4, Lcom/geetest/captcha/a0;->CANCEL:Lcom/geetest/captcha/a0;

    .line 61
    .line 62
    new-instance v5, Lcom/geetest/captcha/a0;

    .line 63
    .line 64
    const-string v6, "NONE"

    .line 65
    .line 66
    const-string v7, "-15"

    .line 67
    const/4 v8, 0x5

    .line 68
    .line 69
    .line 70
    invoke-direct {v5, v8, v6, v7}, Lcom/geetest/captcha/a0;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 71
    .line 72
    sput-object v5, Lcom/geetest/captcha/a0;->NONE:Lcom/geetest/captcha/a0;

    .line 73
    .line 74
    .line 75
    filled-new-array/range {v0 .. v5}, [Lcom/geetest/captcha/a0;

    .line 76
    move-result-object v0

    .line 77
    .line 78
    sput-object v0, Lcom/geetest/captcha/a0;->a:[Lcom/geetest/captcha/a0;

    .line 79
    return-void
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
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p2, p1}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 4
    .line 5
    iput-object p3, p0, Lcom/geetest/captcha/a0;->type:Ljava/lang/String;

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
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/geetest/captcha/a0;
    .locals 1

    .line 1
    .line 2
    const-class v0, Lcom/geetest/captcha/a0;

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Lcom/geetest/captcha/a0;

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
.end method

.method public static values()[Lcom/geetest/captcha/a0;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/geetest/captcha/a0;->a:[Lcom/geetest/captcha/a0;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, [Lcom/geetest/captcha/a0;

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
.end method


# virtual methods
.method public final getType()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/geetest/captcha/a0;->type:Ljava/lang/String;

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
.end method

.method public final setType(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "<set-?>"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iput-object p1, p0, Lcom/geetest/captcha/a0;->type:Ljava/lang/String;

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
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method
