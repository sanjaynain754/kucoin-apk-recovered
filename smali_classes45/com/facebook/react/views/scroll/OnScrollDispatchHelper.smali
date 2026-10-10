.class public final Lcom/facebook/react/views/scroll/OnScrollDispatchHelper;
.super Ljava/lang/Object;
.source "OnScrollDispatchHelper.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/views/scroll/OnScrollDispatchHelper$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0008@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u001e\u0010\u000c\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0008@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000bR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/facebook/react/views/scroll/OnScrollDispatchHelper;",
        "",
        "<init>",
        "()V",
        "prevX",
        "",
        "prevY",
        "value",
        "",
        "xFlingVelocity",
        "getXFlingVelocity",
        "()F",
        "yFlingVelocity",
        "getYFlingVelocity",
        "lastScrollEventTimeMs",
        "",
        "onScrollChanged",
        "",
        "x",
        "y",
        "Companion",
        "ReactAndroid_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final Companion:Lcom/facebook/react/views/scroll/OnScrollDispatchHelper$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final MIN_EVENT_SEPARATION_MS:I = 0xa


# instance fields
.field private lastScrollEventTimeMs:J

.field private prevX:I

.field private prevY:I

.field private xFlingVelocity:F

.field private yFlingVelocity:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/react/views/scroll/OnScrollDispatchHelper$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/facebook/react/views/scroll/OnScrollDispatchHelper$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/facebook/react/views/scroll/OnScrollDispatchHelper;->Companion:Lcom/facebook/react/views/scroll/OnScrollDispatchHelper$Companion;

    .line 9
    return-void
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
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    iput v0, p0, Lcom/facebook/react/views/scroll/OnScrollDispatchHelper;->prevX:I

    .line 8
    .line 9
    iput v0, p0, Lcom/facebook/react/views/scroll/OnScrollDispatchHelper;->prevY:I

    .line 10
    .line 11
    const-wide/16 v0, -0xb

    .line 12
    .line 13
    iput-wide v0, p0, Lcom/facebook/react/views/scroll/OnScrollDispatchHelper;->lastScrollEventTimeMs:J

    .line 14
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
.end method


# virtual methods
.method public final getXFlingVelocity()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/facebook/react/views/scroll/OnScrollDispatchHelper;->xFlingVelocity:F

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
.end method

.method public final getYFlingVelocity()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/facebook/react/views/scroll/OnScrollDispatchHelper;->yFlingVelocity:F

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
.end method

.method public final onScrollChanged(II)Z
    .locals 9

    .line 1
    .line 2
    .line 3
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 4
    move-result-wide v0

    .line 5
    .line 6
    iget-wide v2, p0, Lcom/facebook/react/views/scroll/OnScrollDispatchHelper;->lastScrollEventTimeMs:J

    .line 7
    .line 8
    sub-long v4, v0, v2

    .line 9
    .line 10
    const-wide/16 v6, 0xa

    .line 11
    .line 12
    cmp-long v4, v4, v6

    .line 13
    .line 14
    if-gtz v4, :cond_1

    .line 15
    .line 16
    iget v4, p0, Lcom/facebook/react/views/scroll/OnScrollDispatchHelper;->prevX:I

    .line 17
    .line 18
    if-ne v4, p1, :cond_1

    .line 19
    .line 20
    iget v4, p0, Lcom/facebook/react/views/scroll/OnScrollDispatchHelper;->prevY:I

    .line 21
    .line 22
    if-eq v4, p2, :cond_0

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 v4, 0x0

    .line 25
    goto :goto_1

    .line 26
    :cond_1
    :goto_0
    const/4 v4, 0x1

    .line 27
    .line 28
    :goto_1
    sub-long v5, v0, v2

    .line 29
    .line 30
    const-wide/16 v7, 0x0

    .line 31
    .line 32
    cmp-long v5, v5, v7

    .line 33
    .line 34
    if-eqz v5, :cond_2

    .line 35
    .line 36
    iget v5, p0, Lcom/facebook/react/views/scroll/OnScrollDispatchHelper;->prevX:I

    .line 37
    .line 38
    sub-int v5, p1, v5

    .line 39
    int-to-float v5, v5

    .line 40
    .line 41
    sub-long v6, v0, v2

    .line 42
    long-to-float v6, v6

    .line 43
    div-float/2addr v5, v6

    .line 44
    .line 45
    iput v5, p0, Lcom/facebook/react/views/scroll/OnScrollDispatchHelper;->xFlingVelocity:F

    .line 46
    .line 47
    iget v5, p0, Lcom/facebook/react/views/scroll/OnScrollDispatchHelper;->prevY:I

    .line 48
    .line 49
    sub-int v5, p2, v5

    .line 50
    int-to-float v5, v5

    .line 51
    .line 52
    sub-long v2, v0, v2

    .line 53
    long-to-float v2, v2

    .line 54
    div-float/2addr v5, v2

    .line 55
    .line 56
    iput v5, p0, Lcom/facebook/react/views/scroll/OnScrollDispatchHelper;->yFlingVelocity:F

    .line 57
    .line 58
    :cond_2
    iput-wide v0, p0, Lcom/facebook/react/views/scroll/OnScrollDispatchHelper;->lastScrollEventTimeMs:J

    .line 59
    .line 60
    iput p1, p0, Lcom/facebook/react/views/scroll/OnScrollDispatchHelper;->prevX:I

    .line 61
    .line 62
    iput p2, p0, Lcom/facebook/react/views/scroll/OnScrollDispatchHelper;->prevY:I

    .line 63
    return v4
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
