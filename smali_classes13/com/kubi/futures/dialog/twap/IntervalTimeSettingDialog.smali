.class public final Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog;
.super Lcom/kubi/resources/dialog/DialogFragmentHelper;
.source "IntervalTimeSettingDialog.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0008\u0003\n\u0002\u0008\u0008*\u0002&)\u0018\u0000 /2\u00020\u0001:\u0001/B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J&\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u0008\u0010 \u001a\u00020!H\u0016J\u001a\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00192\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u0008\u0010+\u001a\u00020#H\u0002J\u0018\u0010,\u001a\u00020#2\u0006\u0010-\u001a\u00020\n2\u0006\u0010.\u001a\u00020\nH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000c\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u000e\u0010\u000fR\u001b\u0010\u0012\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0011\u001a\u0004\u0008\u0013\u0010\u0014R\u000e\u0010\u0016\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u00020&X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\'R\u0010\u0010(\u001a\u00020)X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010*\u00a8\u00060"
    }
    d2 = {
        "Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog;",
        "Lcom/kubi/resources/dialog/DialogFragmentHelper;",
        "<init>",
        "()V",
        "binding",
        "Lcom/kubi/kumex/databinding/BkumexDialogTwapIntervalTimeBinding;",
        "minutesRange",
        "Lkotlin/ranges/IntRange;",
        "secondsRange",
        "min",
        "",
        "max",
        "reqKey",
        "",
        "getReqKey",
        "()Ljava/lang/String;",
        "reqKey$delegate",
        "Lkotlin/Lazy;",
        "initialInterval",
        "getInitialInterval",
        "()J",
        "initialInterval$delegate",
        "currentSelectedMinutes",
        "currentSelectedSeconds",
        "onCreateView",
        "Landroid/view/View;",
        "inflater",
        "Landroid/view/LayoutInflater;",
        "container",
        "Landroid/view/ViewGroup;",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "initType",
        "",
        "onViewCreated",
        "",
        "view",
        "minuteSelectedListener",
        "com/kubi/futures/dialog/twap/IntervalTimeSettingDialog$minuteSelectedListener$1",
        "Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog$minuteSelectedListener$1;",
        "secondSelectedListener",
        "com/kubi/futures/dialog/twap/IntervalTimeSettingDialog$secondSelectedListener$1",
        "Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog$secondSelectedListener$1;",
        "checkTimeValid",
        "setTimeOfView",
        "minutes",
        "seconds",
        "Companion",
        "KumexLib_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final B0:Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final A0:Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog$b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public q0:Ldm/f1;

.field public final r0:Lkotlin/ranges/IntRange;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final s0:Lkotlin/ranges/IntRange;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final t0:J

.field public final u0:J

.field public final v0:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final w0:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public x0:J

.field public y0:J

.field public final z0:Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog;->B0:Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog$Companion;

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
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/resources/dialog/DialogFragmentHelper;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lkotlin/ranges/IntRange;

    .line 6
    .line 7
    const/16 v1, 0x3c

    .line 8
    const/4 v2, 0x0

    .line 9
    .line 10
    .line 11
    invoke-direct {v0, v2, v1}, Lkotlin/ranges/IntRange;-><init>(II)V

    .line 12
    .line 13
    iput-object v0, p0, Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog;->r0:Lkotlin/ranges/IntRange;

    .line 14
    .line 15
    new-instance v0, Lkotlin/ranges/IntRange;

    .line 16
    .line 17
    const/16 v1, 0x3b

    .line 18
    .line 19
    .line 20
    invoke-direct {v0, v2, v1}, Lkotlin/ranges/IntRange;-><init>(II)V

    .line 21
    .line 22
    iput-object v0, p0, Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog;->s0:Lkotlin/ranges/IntRange;

    .line 23
    .line 24
    const-wide/16 v0, 0x5

    .line 25
    .line 26
    iput-wide v0, p0, Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog;->t0:J

    .line 27
    .line 28
    const-wide/16 v0, 0xe10

    .line 29
    .line 30
    iput-wide v0, p0, Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog;->u0:J

    .line 31
    .line 32
    new-instance v0, Lzh/d;

    .line 33
    .line 34
    .line 35
    invoke-direct {v0, p0}, Lzh/d;-><init>(Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog;)V

    .line 36
    .line 37
    .line 38
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 39
    move-result-object v0

    .line 40
    .line 41
    iput-object v0, p0, Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog;->v0:Lkotlin/Lazy;

    .line 42
    .line 43
    new-instance v0, Lzh/e;

    .line 44
    .line 45
    .line 46
    invoke-direct {v0, p0}, Lzh/e;-><init>(Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog;)V

    .line 47
    .line 48
    .line 49
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 50
    move-result-object v0

    .line 51
    .line 52
    iput-object v0, p0, Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog;->w0:Lkotlin/Lazy;

    .line 53
    .line 54
    new-instance v0, Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog$a;

    .line 55
    .line 56
    .line 57
    invoke-direct {v0, p0}, Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog$a;-><init>(Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog;)V

    .line 58
    .line 59
    iput-object v0, p0, Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog;->z0:Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog$a;

    .line 60
    .line 61
    new-instance v0, Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog$b;

    .line 62
    .line 63
    .line 64
    invoke-direct {v0, p0}, Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog$b;-><init>(Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog;)V

    .line 65
    .line 66
    iput-object v0, p0, Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog;->A0:Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog$b;

    .line 67
    return-void
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
.end method

.method public static final A4(Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog;)Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 4
    move-result-object p0

    .line 5
    .line 6
    if-eqz p0, :cond_1

    .line 7
    .line 8
    const-string v0, "data"

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    move-result-object p0

    .line 13
    .line 14
    if-nez p0, :cond_0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    return-object p0

    .line 17
    .line 18
    :cond_1
    :goto_0
    const-string p0, ""

    .line 19
    return-object p0
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
.end method

.method public static synthetic j4(Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog;)J
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog;->w4(Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog;)J

    .line 4
    move-result-wide v0

    .line 5
    return-wide v0
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
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public static synthetic k4(Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog;->z4(Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog;)Lkotlin/Unit;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public static synthetic l4(Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog;->x4(Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog;)Lkotlin/Unit;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public static synthetic m4(Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog;->y4(Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog;)Lkotlin/Unit;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public static synthetic n4(Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog;)Ljava/lang/String;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog;->A4(Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog;)Ljava/lang/String;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public static final synthetic o4(Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog;->t4()V

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
.end method

.method public static final synthetic p4(Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog;)Lkotlin/ranges/IntRange;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog;->r0:Lkotlin/ranges/IntRange;

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
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public static final synthetic q4(Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog;)Lkotlin/ranges/IntRange;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog;->s0:Lkotlin/ranges/IntRange;

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
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public static final synthetic r4(Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog;J)V
    .locals 0

    .line 1
    .line 2
    iput-wide p1, p0, Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog;->x0:J

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
.end method

.method public static final synthetic s4(Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog;J)V
    .locals 0

    .line 1
    .line 2
    iput-wide p1, p0, Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog;->y0:J

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
.end method

.method public static final w4(Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog;)J
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 4
    move-result-object p0

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    const-string v0, "cur"

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    .line 12
    move-result-wide v0

    .line 13
    return-wide v0

    .line 14
    .line 15
    :cond_0
    const-wide/16 v0, 0x1e

    .line 16
    return-wide v0
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
.end method

.method public static final x4(Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/resources/dialog/DialogFragmentHelper;->dismiss()V

    .line 4
    .line 5
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 6
    return-object p0
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
.end method

.method public static final y4(Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog;)Lkotlin/Unit;
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog;->u4()J

    .line 4
    move-result-wide v0

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v1}, Lzh/g;->b(J)J

    .line 8
    move-result-wide v0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog;->u4()J

    .line 12
    move-result-wide v2

    .line 13
    .line 14
    .line 15
    invoke-static {v2, v3}, Lzh/g;->c(J)J

    .line 16
    move-result-wide v2

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog;->B4(JJ)V

    .line 20
    .line 21
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 22
    return-object p0
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
.end method

.method public static final z4(Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog;)Lkotlin/Unit;
    .locals 7

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog;->v4()Ljava/lang/String;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    new-instance v2, Landroid/os/Bundle;

    .line 19
    .line 20
    .line 21
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 22
    .line 23
    iget-wide v3, p0, Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog;->x0:J

    .line 24
    .line 25
    const/16 v5, 0x3c

    .line 26
    int-to-long v5, v5

    .line 27
    mul-long/2addr v3, v5

    .line 28
    .line 29
    iget-wide v5, p0, Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog;->y0:J

    .line 30
    add-long/2addr v3, v5

    .line 31
    .line 32
    const-string v5, "interval"

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2, v5, v3, v4}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 36
    .line 37
    sget-object v3, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v1, v2}, Landroidx/fragment/app/FragmentManager;->setFragmentResult(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 41
    .line 42
    .line 43
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/resources/dialog/DialogFragmentHelper;->dismiss()V

    .line 44
    .line 45
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 46
    return-object p0
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
.end method


# virtual methods
.method public final B4(JJ)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog;->r0:Lkotlin/ranges/IntRange;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lzh/a0;->e(Lkotlin/ranges/IntRange;)Lkotlin/ranges/LongRange;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-static {p1, p2, v0}, Lkotlin/ranges/RangesKt;->coerceIn(JLkotlin/ranges/ClosedRange;)J

    .line 10
    move-result-wide p1

    .line 11
    .line 12
    iput-wide p1, p0, Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog;->x0:J

    .line 13
    .line 14
    iget-object p1, p0, Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog;->s0:Lkotlin/ranges/IntRange;

    .line 15
    .line 16
    .line 17
    invoke-static {p1}, Lzh/a0;->e(Lkotlin/ranges/IntRange;)Lkotlin/ranges/LongRange;

    .line 18
    move-result-object p1

    .line 19
    .line 20
    .line 21
    invoke-static {p3, p4, p1}, Lkotlin/ranges/RangesKt;->coerceIn(JLkotlin/ranges/ClosedRange;)J

    .line 22
    move-result-wide p1

    .line 23
    .line 24
    iput-wide p1, p0, Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog;->y0:J

    .line 25
    .line 26
    iget-object p1, p0, Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog;->q0:Ldm/f1;

    .line 27
    const/4 p2, 0x0

    .line 28
    .line 29
    const-string p3, "binding"

    .line 30
    .line 31
    if-nez p1, :cond_0

    .line 32
    .line 33
    .line 34
    invoke-static {p3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 35
    move-object p1, p2

    .line 36
    .line 37
    :cond_0
    iget-object p1, p1, Ldm/f1;->d:Lcom/kubi/resources/widget/wheel/view/WheelView;

    .line 38
    .line 39
    iget-wide v0, p0, Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog;->x0:J

    .line 40
    long-to-int p4, v0

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1, p4}, Lcom/kubi/resources/widget/wheel/view/WheelView;->setCurrentItem(I)V

    .line 44
    .line 45
    iget-object p1, p0, Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog;->q0:Ldm/f1;

    .line 46
    .line 47
    if-nez p1, :cond_1

    .line 48
    .line 49
    .line 50
    invoke-static {p3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 51
    goto :goto_0

    .line 52
    :cond_1
    move-object p2, p1

    .line 53
    .line 54
    :goto_0
    iget-object p1, p2, Ldm/f1;->f:Lcom/kubi/resources/widget/wheel/view/WheelView;

    .line 55
    .line 56
    iget-wide p2, p0, Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog;->y0:J

    .line 57
    long-to-int p2, p2

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1, p2}, Lcom/kubi/resources/widget/wheel/view/WheelView;->setCurrentItem(I)V

    .line 61
    return-void
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
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
.end method

.method public N3()I
    .locals 1

    .line 1
    .line 2
    const/16 v0, 0x8

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
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0
    .param p1    # Landroid/view/LayoutInflater;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/view/ViewGroup;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    const-string p3, "inflater"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    const/4 p3, 0x0

    .line 7
    .line 8
    .line 9
    invoke-static {p1, p2, p3}, Ldm/f1;->c(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Ldm/f1;

    .line 10
    move-result-object p1

    .line 11
    .line 12
    const-string p2, "inflate(...)"

    .line 13
    .line 14
    .line 15
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    iput-object p1, p0, Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog;->q0:Ldm/f1;

    .line 18
    .line 19
    if-nez p1, :cond_0

    .line 20
    .line 21
    const-string p1, "binding"

    .line 22
    .line 23
    .line 24
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 25
    const/4 p1, 0x0

    .line 26
    .line 27
    .line 28
    :cond_0
    invoke-virtual {p1}, Ldm/f1;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 29
    move-result-object p1

    .line 30
    return-object p1
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
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 7
    .param p1    # Landroid/view/View;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "view"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-super {p0, p1, p2}, Lcom/kubi/resources/dialog/BaseDialogFragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog;->u4()J

    .line 12
    move-result-wide p1

    .line 13
    .line 14
    .line 15
    invoke-static {p1, p2}, Lzh/g;->b(J)J

    .line 16
    move-result-wide p1

    .line 17
    .line 18
    iget-object v0, p0, Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog;->r0:Lkotlin/ranges/IntRange;

    .line 19
    .line 20
    .line 21
    invoke-static {v0}, Lzh/a0;->e(Lkotlin/ranges/IntRange;)Lkotlin/ranges/LongRange;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    .line 25
    invoke-static {p1, p2, v0}, Lkotlin/ranges/RangesKt;->coerceIn(JLkotlin/ranges/ClosedRange;)J

    .line 26
    move-result-wide p1

    .line 27
    .line 28
    iput-wide p1, p0, Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog;->x0:J

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog;->u4()J

    .line 32
    move-result-wide p1

    .line 33
    .line 34
    .line 35
    invoke-static {p1, p2}, Lzh/g;->c(J)J

    .line 36
    move-result-wide p1

    .line 37
    .line 38
    iget-object v0, p0, Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog;->s0:Lkotlin/ranges/IntRange;

    .line 39
    .line 40
    .line 41
    invoke-static {v0}, Lzh/a0;->e(Lkotlin/ranges/IntRange;)Lkotlin/ranges/LongRange;

    .line 42
    move-result-object v0

    .line 43
    .line 44
    .line 45
    invoke-static {p1, p2, v0}, Lkotlin/ranges/RangesKt;->coerceIn(JLkotlin/ranges/ClosedRange;)J

    .line 46
    move-result-wide p1

    .line 47
    .line 48
    iput-wide p1, p0, Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog;->y0:J

    .line 49
    .line 50
    iget-object p1, p0, Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog;->q0:Ldm/f1;

    .line 51
    const/4 p2, 0x0

    .line 52
    .line 53
    const-string v0, "binding"

    .line 54
    .line 55
    if-nez p1, :cond_0

    .line 56
    .line 57
    .line 58
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 59
    move-object p1, p2

    .line 60
    .line 61
    :cond_0
    iget-object p1, p1, Ldm/f1;->d:Lcom/kubi/resources/widget/wheel/view/WheelView;

    .line 62
    .line 63
    sget v1, Lcom/kubi/kumex/R$string;->alpha_countdown_minute:I

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 67
    move-result-object v1

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1, v1}, Lcom/kubi/resources/widget/wheel/view/WheelView;->setLabel(Ljava/lang/String;)V

    .line 71
    .line 72
    iget-object p1, p0, Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog;->q0:Ldm/f1;

    .line 73
    .line 74
    if-nez p1, :cond_1

    .line 75
    .line 76
    .line 77
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 78
    move-object p1, p2

    .line 79
    .line 80
    :cond_1
    iget-object p1, p1, Ldm/f1;->f:Lcom/kubi/resources/widget/wheel/view/WheelView;

    .line 81
    .line 82
    sget v1, Lcom/kubi/kumex/R$string;->alpha_countdown_second:I

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 86
    move-result-object v1

    .line 87
    .line 88
    .line 89
    invoke-virtual {p1, v1}, Lcom/kubi/resources/widget/wheel/view/WheelView;->setLabel(Ljava/lang/String;)V

    .line 90
    .line 91
    iget-object p1, p0, Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog;->q0:Ldm/f1;

    .line 92
    .line 93
    if-nez p1, :cond_2

    .line 94
    .line 95
    .line 96
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 97
    move-object p1, p2

    .line 98
    .line 99
    :cond_2
    iget-object p1, p1, Ldm/f1;->d:Lcom/kubi/resources/widget/wheel/view/WheelView;

    .line 100
    .line 101
    const-string v1, "minute"

    .line 102
    .line 103
    .line 104
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 105
    .line 106
    iget-wide v1, p0, Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog;->x0:J

    .line 107
    long-to-int v1, v1

    .line 108
    .line 109
    iget-object v2, p0, Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog;->r0:Lkotlin/ranges/IntRange;

    .line 110
    .line 111
    .line 112
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    .line 113
    move-result-object v2

    .line 114
    .line 115
    iget-object v3, p0, Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog;->z0:Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog$a;

    .line 116
    .line 117
    .line 118
    invoke-static {p1, v1, v2, v3}, Lzh/a0;->b(Lcom/kubi/resources/widget/wheel/view/WheelView;ILjava/util/List;Lkotlin/jvm/functions/Function1;)V

    .line 119
    .line 120
    iget-object p1, p0, Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog;->q0:Ldm/f1;

    .line 121
    .line 122
    if-nez p1, :cond_3

    .line 123
    .line 124
    .line 125
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 126
    move-object p1, p2

    .line 127
    .line 128
    :cond_3
    iget-object p1, p1, Ldm/f1;->f:Lcom/kubi/resources/widget/wheel/view/WheelView;

    .line 129
    .line 130
    const-string v1, "second"

    .line 131
    .line 132
    .line 133
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 134
    .line 135
    iget-wide v1, p0, Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog;->y0:J

    .line 136
    long-to-int v1, v1

    .line 137
    .line 138
    iget-object v2, p0, Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog;->s0:Lkotlin/ranges/IntRange;

    .line 139
    .line 140
    .line 141
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    .line 142
    move-result-object v2

    .line 143
    .line 144
    iget-object v3, p0, Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog;->A0:Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog$b;

    .line 145
    .line 146
    .line 147
    invoke-static {p1, v1, v2, v3}, Lzh/a0;->b(Lcom/kubi/resources/widget/wheel/view/WheelView;ILjava/util/List;Lkotlin/jvm/functions/Function1;)V

    .line 148
    .line 149
    iget-object p1, p0, Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog;->q0:Ldm/f1;

    .line 150
    .line 151
    if-nez p1, :cond_4

    .line 152
    .line 153
    .line 154
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 155
    move-object p1, p2

    .line 156
    .line 157
    :cond_4
    iget-object v1, p1, Ldm/f1;->c:Landroid/widget/ImageView;

    .line 158
    .line 159
    const-string p1, "ivClose"

    .line 160
    .line 161
    .line 162
    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 163
    .line 164
    new-instance v4, Lzh/a;

    .line 165
    .line 166
    .line 167
    invoke-direct {v4, p0}, Lzh/a;-><init>(Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog;)V

    .line 168
    const/4 v5, 0x1

    .line 169
    const/4 v6, 0x0

    .line 170
    .line 171
    const-wide/16 v2, 0x0

    .line 172
    .line 173
    .line 174
    invoke-static/range {v1 .. v6}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 175
    .line 176
    iget-object p1, p0, Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog;->q0:Ldm/f1;

    .line 177
    .line 178
    if-nez p1, :cond_5

    .line 179
    .line 180
    .line 181
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 182
    move-object p1, p2

    .line 183
    .line 184
    :cond_5
    iget-object v1, p1, Ldm/f1;->e:Lcom/kubi/resources/widget/button/KcSecondaryButton;

    .line 185
    .line 186
    const-string p1, "resetTv"

    .line 187
    .line 188
    .line 189
    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 190
    .line 191
    new-instance v4, Lzh/b;

    .line 192
    .line 193
    .line 194
    invoke-direct {v4, p0}, Lzh/b;-><init>(Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog;)V

    .line 195
    const/4 v5, 0x1

    .line 196
    const/4 v6, 0x0

    .line 197
    .line 198
    const-wide/16 v2, 0x0

    .line 199
    .line 200
    .line 201
    invoke-static/range {v1 .. v6}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 202
    .line 203
    iget-object p1, p0, Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog;->q0:Ldm/f1;

    .line 204
    .line 205
    if-nez p1, :cond_6

    .line 206
    .line 207
    .line 208
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 209
    goto :goto_0

    .line 210
    :cond_6
    move-object p2, p1

    .line 211
    .line 212
    :goto_0
    iget-object v0, p2, Ldm/f1;->b:Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 213
    .line 214
    const-string p1, "confirmTv"

    .line 215
    .line 216
    .line 217
    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 218
    .line 219
    new-instance v3, Lzh/c;

    .line 220
    .line 221
    .line 222
    invoke-direct {v3, p0}, Lzh/c;-><init>(Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog;)V

    .line 223
    const/4 v4, 0x1

    .line 224
    const/4 v5, 0x0

    .line 225
    .line 226
    const-wide/16 v1, 0x0

    .line 227
    .line 228
    .line 229
    invoke-static/range {v0 .. v5}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 230
    return-void
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
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
.end method

.method public final t4()V
    .locals 6

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog;->x0:J

    .line 3
    .line 4
    const/16 v2, 0x3c

    .line 5
    int-to-long v2, v2

    .line 6
    mul-long/2addr v0, v2

    .line 7
    .line 8
    iget-wide v2, p0, Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog;->y0:J

    .line 9
    add-long/2addr v0, v2

    .line 10
    .line 11
    iget-wide v2, p0, Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog;->t0:J

    .line 12
    .line 13
    cmp-long v4, v0, v2

    .line 14
    const/4 v5, 0x0

    .line 15
    .line 16
    if-gez v4, :cond_0

    .line 17
    .line 18
    .line 19
    invoke-static {v2, v3}, Lzh/g;->b(J)J

    .line 20
    move-result-wide v0

    .line 21
    .line 22
    iget-wide v2, p0, Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog;->t0:J

    .line 23
    .line 24
    .line 25
    invoke-static {v2, v3}, Lzh/g;->c(J)J

    .line 26
    move-result-wide v2

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog;->B4(JJ)V

    .line 30
    .line 31
    sget v0, Lcom/kubi/kumex/R$string;->bkumex_twap_interval_min_tips:I

    .line 32
    .line 33
    iget-wide v1, p0, Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog;->t0:J

    .line 34
    .line 35
    .line 36
    invoke-static {v1, v2}, Lzh/g;->h(J)Ljava/lang/String;

    .line 37
    move-result-object v1

    .line 38
    .line 39
    .line 40
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 41
    move-result-object v1

    .line 42
    .line 43
    .line 44
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 45
    move-result-object v1

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0, v0, v1}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 49
    move-result-object v0

    .line 50
    .line 51
    new-array v1, v5, [Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    invoke-static {v0, v1}, Lcom/kubi/utils/ToastCompat;->G(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 55
    return-void

    .line 56
    .line 57
    :cond_0
    iget-wide v2, p0, Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog;->u0:J

    .line 58
    .line 59
    cmp-long v0, v0, v2

    .line 60
    .line 61
    if-lez v0, :cond_1

    .line 62
    .line 63
    .line 64
    invoke-static {v2, v3}, Lzh/g;->b(J)J

    .line 65
    move-result-wide v0

    .line 66
    .line 67
    iget-wide v2, p0, Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog;->u0:J

    .line 68
    .line 69
    .line 70
    invoke-static {v2, v3}, Lzh/g;->c(J)J

    .line 71
    move-result-wide v2

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog;->B4(JJ)V

    .line 75
    .line 76
    sget v0, Lcom/kubi/kumex/R$string;->bkumex_twap_interval_max_tips:I

    .line 77
    .line 78
    iget-wide v1, p0, Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog;->u0:J

    .line 79
    .line 80
    .line 81
    invoke-static {v1, v2}, Lzh/g;->h(J)Ljava/lang/String;

    .line 82
    move-result-object v1

    .line 83
    .line 84
    .line 85
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 86
    move-result-object v1

    .line 87
    .line 88
    .line 89
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 90
    move-result-object v1

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0, v0, v1}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 94
    move-result-object v0

    .line 95
    .line 96
    new-array v1, v5, [Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    invoke-static {v0, v1}, Lcom/kubi/utils/ToastCompat;->G(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 100
    :cond_1
    return-void
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
.end method

.method public final u4()J
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog;->w0:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Ljava/lang/Number;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 12
    move-result-wide v0

    .line 13
    return-wide v0
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
.end method

.method public final v4()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/futures/dialog/twap/IntervalTimeSettingDialog;->v0:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Ljava/lang/String;

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
.end method
