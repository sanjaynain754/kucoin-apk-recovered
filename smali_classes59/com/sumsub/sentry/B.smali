.class public final Lcom/sumsub/sentry/B;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# annotations
.annotation runtime Ltg0/o;
.end annotation


# static fields
.field public static final Companion:Lcom/sumsub/sentry/A;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/Integer;

.field public final c:Ljava/lang/Integer;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/Integer;

.field public final f:Ljava/lang/String;

.field public final g:Ljava/lang/Boolean;

.field public final h:Ljava/lang/String;

.field public final i:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sentry/A;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/sumsub/sentry/A;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/sumsub/sentry/B;->Companion:Lcom/sumsub/sentry/A;

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
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    and-int/lit8 v0, p1, 0x1

    .line 6
    const/4 v1, 0x0

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iput-object v1, p0, Lcom/sumsub/sentry/B;->a:Ljava/lang/String;

    .line 11
    goto :goto_0

    .line 12
    .line 13
    :cond_0
    iput-object p2, p0, Lcom/sumsub/sentry/B;->a:Ljava/lang/String;

    .line 14
    .line 15
    :goto_0
    and-int/lit8 p2, p1, 0x2

    .line 16
    .line 17
    if-nez p2, :cond_1

    .line 18
    .line 19
    iput-object v1, p0, Lcom/sumsub/sentry/B;->b:Ljava/lang/Integer;

    .line 20
    goto :goto_1

    .line 21
    .line 22
    :cond_1
    iput-object p3, p0, Lcom/sumsub/sentry/B;->b:Ljava/lang/Integer;

    .line 23
    .line 24
    :goto_1
    and-int/lit8 p2, p1, 0x4

    .line 25
    .line 26
    if-nez p2, :cond_2

    .line 27
    .line 28
    iput-object v1, p0, Lcom/sumsub/sentry/B;->c:Ljava/lang/Integer;

    .line 29
    goto :goto_2

    .line 30
    .line 31
    :cond_2
    iput-object p4, p0, Lcom/sumsub/sentry/B;->c:Ljava/lang/Integer;

    .line 32
    .line 33
    :goto_2
    and-int/lit8 p2, p1, 0x8

    .line 34
    .line 35
    if-nez p2, :cond_3

    .line 36
    .line 37
    iput-object v1, p0, Lcom/sumsub/sentry/B;->d:Ljava/lang/String;

    .line 38
    goto :goto_3

    .line 39
    .line 40
    :cond_3
    iput-object p5, p0, Lcom/sumsub/sentry/B;->d:Ljava/lang/String;

    .line 41
    .line 42
    :goto_3
    and-int/lit8 p2, p1, 0x10

    .line 43
    .line 44
    if-nez p2, :cond_4

    .line 45
    .line 46
    iput-object v1, p0, Lcom/sumsub/sentry/B;->e:Ljava/lang/Integer;

    .line 47
    goto :goto_4

    .line 48
    .line 49
    :cond_4
    iput-object p6, p0, Lcom/sumsub/sentry/B;->e:Ljava/lang/Integer;

    .line 50
    .line 51
    :goto_4
    and-int/lit8 p2, p1, 0x20

    .line 52
    .line 53
    if-nez p2, :cond_5

    .line 54
    .line 55
    iput-object v1, p0, Lcom/sumsub/sentry/B;->f:Ljava/lang/String;

    .line 56
    goto :goto_5

    .line 57
    .line 58
    :cond_5
    iput-object p7, p0, Lcom/sumsub/sentry/B;->f:Ljava/lang/String;

    .line 59
    .line 60
    :goto_5
    and-int/lit8 p2, p1, 0x40

    .line 61
    .line 62
    if-nez p2, :cond_6

    .line 63
    .line 64
    iput-object v1, p0, Lcom/sumsub/sentry/B;->g:Ljava/lang/Boolean;

    .line 65
    goto :goto_6

    .line 66
    .line 67
    :cond_6
    iput-object p8, p0, Lcom/sumsub/sentry/B;->g:Ljava/lang/Boolean;

    .line 68
    .line 69
    :goto_6
    and-int/lit16 p2, p1, 0x80

    .line 70
    .line 71
    if-nez p2, :cond_7

    .line 72
    .line 73
    iput-object v1, p0, Lcom/sumsub/sentry/B;->h:Ljava/lang/String;

    .line 74
    goto :goto_7

    .line 75
    .line 76
    :cond_7
    iput-object p9, p0, Lcom/sumsub/sentry/B;->h:Ljava/lang/String;

    .line 77
    .line 78
    :goto_7
    and-int/lit16 p1, p1, 0x100

    .line 79
    .line 80
    if-nez p1, :cond_8

    .line 81
    .line 82
    iput-object v1, p0, Lcom/sumsub/sentry/B;->i:Ljava/lang/String;

    .line 83
    return-void

    .line 84
    .line 85
    :cond_8
    iput-object p10, p0, Lcom/sumsub/sentry/B;->i:Ljava/lang/String;

    .line 86
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
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
.end method
