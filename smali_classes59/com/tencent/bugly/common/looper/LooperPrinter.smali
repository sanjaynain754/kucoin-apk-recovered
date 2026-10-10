.class public final Lcom/tencent/bugly/common/looper/LooperPrinter;
.super Ljava/lang/Object;
.source "BUGLY"

# interfaces
.implements Landroid/util/Printer;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/bugly/common/looper/LooperPrinter$Companion;,
        Lcom/tencent/bugly/common/looper/LooperPrinter$IDispatch;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0018\u0000 \u00102\u00020\u0001:\u0002\u0010\u0011B\u0017\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/tencent/bugly/common/looper/LooperPrinter;",
        "Landroid/util/Printer;",
        "origin",
        "dispatch",
        "Lcom/tencent/bugly/common/looper/LooperPrinter$IDispatch;",
        "(Landroid/util/Printer;Lcom/tencent/bugly/common/looper/LooperPrinter$IDispatch;)V",
        "callingOrigin",
        "",
        "isHasChecked",
        "isValid",
        "getOrigin",
        "()Landroid/util/Printer;",
        "println",
        "",
        "x",
        "",
        "Companion",
        "IDispatch",
        "bugly-pro_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lcom/tencent/bugly/common/looper/LooperPrinter$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final START_PREFIX:Ljava/lang/String; = ">>"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final STOP_PREFIX:Ljava/lang/String; = "<<"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final TAG:Ljava/lang/String; = "RMonitor_looper_Printer"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field private callingOrigin:Z

.field private final dispatch:Lcom/tencent/bugly/common/looper/LooperPrinter$IDispatch;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private isHasChecked:Z

.field private isValid:Z

.field private final origin:Landroid/util/Printer;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/bugly/common/looper/LooperPrinter$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/tencent/bugly/common/looper/LooperPrinter$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/tencent/bugly/common/looper/LooperPrinter;->Companion:Lcom/tencent/bugly/common/looper/LooperPrinter$Companion;

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
.end method

.method public constructor <init>(Landroid/util/Printer;Lcom/tencent/bugly/common/looper/LooperPrinter$IDispatch;)V
    .locals 1
    .param p1    # Landroid/util/Printer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/tencent/bugly/common/looper/LooperPrinter$IDispatch;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "dispatch"

    .line 3
    .line 4
    .line 5
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    iput-object p1, p0, Lcom/tencent/bugly/common/looper/LooperPrinter;->origin:Landroid/util/Printer;

    .line 11
    .line 12
    iput-object p2, p0, Lcom/tencent/bugly/common/looper/LooperPrinter;->dispatch:Lcom/tencent/bugly/common/looper/LooperPrinter$IDispatch;

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
.end method


# virtual methods
.method public final getOrigin()Landroid/util/Printer;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/common/looper/LooperPrinter;->origin:Landroid/util/Printer;

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
.end method

.method public println(Ljava/lang/String;)V
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "x"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    iget-object v0, p0, Lcom/tencent/bugly/common/looper/LooperPrinter;->dispatch:Lcom/tencent/bugly/common/looper/LooperPrinter$IDispatch;

    .line 9
    .line 10
    .line 11
    invoke-interface {v0, p0}, Lcom/tencent/bugly/common/looper/LooperPrinter$IDispatch;->checkValid(Landroid/util/Printer;)Z

    .line 12
    move-result v0

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    goto :goto_2

    .line 16
    .line 17
    :cond_0
    iget-boolean v0, p0, Lcom/tencent/bugly/common/looper/LooperPrinter;->callingOrigin:Z

    .line 18
    const/4 v1, 0x1

    .line 19
    const/4 v2, 0x0

    .line 20
    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    iget-object v0, p0, Lcom/tencent/bugly/common/looper/LooperPrinter;->origin:Landroid/util/Printer;

    .line 24
    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    if-eq v0, p0, :cond_1

    .line 28
    .line 29
    instance-of v3, v0, Lcom/tencent/bugly/common/looper/LooperPrinter;

    .line 30
    .line 31
    if-nez v3, :cond_1

    .line 32
    .line 33
    iput-boolean v1, p0, Lcom/tencent/bugly/common/looper/LooperPrinter;->callingOrigin:Z

    .line 34
    .line 35
    .line 36
    invoke-interface {v0, p1}, Landroid/util/Printer;->println(Ljava/lang/String;)V

    .line 37
    .line 38
    iput-boolean v2, p0, Lcom/tencent/bugly/common/looper/LooperPrinter;->callingOrigin:Z

    .line 39
    .line 40
    :cond_1
    iget-boolean v0, p0, Lcom/tencent/bugly/common/looper/LooperPrinter;->isHasChecked:Z

    .line 41
    .line 42
    const-string v3, ">>"

    .line 43
    const/4 v4, 0x0

    .line 44
    const/4 v5, 0x2

    .line 45
    .line 46
    if-nez v0, :cond_4

    .line 47
    .line 48
    .line 49
    invoke-static {p1, v3, v2, v5, v4}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 50
    move-result v0

    .line 51
    .line 52
    if-nez v0, :cond_3

    .line 53
    .line 54
    const-string v0, "<<"

    .line 55
    .line 56
    .line 57
    invoke-static {p1, v0, v2, v5, v4}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 58
    move-result v0

    .line 59
    .line 60
    if-eqz v0, :cond_2

    .line 61
    goto :goto_0

    .line 62
    :cond_2
    move v0, v2

    .line 63
    goto :goto_1

    .line 64
    :cond_3
    :goto_0
    move v0, v1

    .line 65
    .line 66
    :goto_1
    iput-boolean v0, p0, Lcom/tencent/bugly/common/looper/LooperPrinter;->isValid:Z

    .line 67
    .line 68
    iput-boolean v1, p0, Lcom/tencent/bugly/common/looper/LooperPrinter;->isHasChecked:Z

    .line 69
    .line 70
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 71
    .line 72
    new-instance v1, Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    const-string/jumbo v6, "println, isValid: "

    .line 76
    .line 77
    .line 78
    invoke-direct {v1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    iget-boolean v6, p0, Lcom/tencent/bugly/common/looper/LooperPrinter;->isValid:Z

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    const-string v6, ", x: "

    .line 86
    .line 87
    .line 88
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 95
    move-result-object v1

    .line 96
    .line 97
    const-string v6, "RMonitor_looper_Printer"

    .line 98
    .line 99
    .line 100
    filled-new-array {v6, v1}, [Ljava/lang/String;

    .line 101
    move-result-object v1

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    .line 105
    .line 106
    :cond_4
    iget-boolean v0, p0, Lcom/tencent/bugly/common/looper/LooperPrinter;->isValid:Z

    .line 107
    .line 108
    if-eqz v0, :cond_5

    .line 109
    .line 110
    iget-object v0, p0, Lcom/tencent/bugly/common/looper/LooperPrinter;->dispatch:Lcom/tencent/bugly/common/looper/LooperPrinter$IDispatch;

    .line 111
    .line 112
    .line 113
    invoke-static {p1, v3, v2, v5, v4}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 114
    move-result v1

    .line 115
    .line 116
    .line 117
    invoke-interface {v0, v1, p1}, Lcom/tencent/bugly/common/looper/LooperPrinter$IDispatch;->dispatch(ZLjava/lang/String;)V

    .line 118
    :cond_5
    :goto_2
    return-void
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
.end method
