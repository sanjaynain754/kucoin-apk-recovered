.class public final Lcom/kubi/flutter/widget/kline/o;
.super Ljava/lang/Object;
.source "KLineSetting.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/flutter/widget/kline/o$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u0017B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001d\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0007H\u0000\u00a2\u0006\u0002\u0008\u000cJ\u0015\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0006H\u0000\u00a2\u0006\u0002\u0008\u000eJ\u0006\u0010\u000f\u001a\u00020\u0006J\u000c\u0010\u0010\u001a\u00020\u0011*\u00020\u0011H\u0002J\r\u0010\u0012\u001a\u00020\u0013H\u0000\u00a2\u0006\u0002\u0008\u0014J\u000e\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0013R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/kubi/flutter/widget/kline/KLineSetting;",
        "",
        "<init>",
        "()V",
        "listeners",
        "Ljava/util/WeakHashMap;",
        "",
        "Lcom/kubi/flutter/widget/kline/KLineSetting$ISettingUpdateListener;",
        "addListener",
        "",
        "key",
        "listener",
        "addListener$LKLineWidget_googleRelease",
        "removeListener",
        "removeListener$LKLineWidget_googleRelease",
        "getKlineRemarkUrl",
        "toColorValue",
        "",
        "getSetupConfig",
        "Lcom/kubi/flutter/proto/kline/ChartSetupConfig;",
        "getSetupConfig$LKLineWidget_googleRelease",
        "updateSetting",
        "config",
        "ISettingUpdateListener",
        "LKLineWidget_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nKLineSetting.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KLineSetting.kt\ncom/kubi/flutter/widget/kline/KLineSetting\n+ 2 ChartSetupConfigKt.kt\ncom/kubi/flutter/proto/kline/ChartSetupConfigKtKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 CandleViewConfigKt.kt\ncom/kubi/flutter/proto/kline/CandleViewConfigKtKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,111:1\n8#2:112\n1#3:113\n1#3:115\n8#4:114\n1869#5,2:116\n*S KotlinDebug\n*F\n+ 1 KLineSetting.kt\ncom/kubi/flutter/widget/kline/KLineSetting\n*L\n56#1:112\n56#1:113\n57#1:115\n57#1:114\n109#1:116,2\n*E\n"
    }
.end annotation


# static fields
.field public static final a:Lcom/kubi/flutter/widget/kline/o;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final b:Ljava/util/WeakHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/WeakHashMap<",
            "Ljava/lang/String;",
            "Lcom/kubi/flutter/widget/kline/o$a;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/flutter/widget/kline/o;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/kubi/flutter/widget/kline/o;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/kubi/flutter/widget/kline/o;->a:Lcom/kubi/flutter/widget/kline/o;

    .line 8
    .line 9
    new-instance v0, Ljava/util/WeakHashMap;

    .line 10
    .line 11
    .line 12
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 13
    .line 14
    sput-object v0, Lcom/kubi/flutter/widget/kline/o;->b:Ljava/util/WeakHashMap;

    .line 15
    return-void
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
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
    .line 33
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lcom/kubi/flutter/widget/kline/o$a;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/flutter/widget/kline/o$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "key"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "listener"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    sget-object v0, Lcom/kubi/flutter/widget/kline/o;->b:Ljava/util/WeakHashMap;

    .line 13
    monitor-enter v0

    .line 14
    .line 15
    .line 16
    :try_start_0
    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    monitor-exit v0

    .line 20
    return-void

    .line 21
    :catchall_0
    move-exception p1

    .line 22
    monitor-exit v0

    .line 23
    throw p1
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

.method public final b()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    const-string v1, "www."

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    sget-object v1, Lcom/kubi/host/HostManager;->a:Lcom/kubi/host/HostManager;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1}, Lcom/kubi/host/HostManager;->b()Ljava/lang/String;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    move-result-object v0

    .line 24
    return-object v0
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

.method public final c()Lcom/kubi/flutter/proto/kline/ChartSetupConfig;
    .locals 5
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/utils/DataMapUtil;->a:Lcom/kubi/utils/DataMapUtil;

    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x0

    .line 5
    .line 6
    const-string v3, "upDown"

    .line 7
    const/4 v4, 0x0

    .line 8
    .line 9
    .line 10
    invoke-static {v0, v3, v4, v1, v2}, Lcom/kubi/utils/DataMapUtil;->d(Lcom/kubi/utils/DataMapUtil;Ljava/lang/String;IILjava/lang/Object;)I

    .line 11
    move-result v0

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    const/4 v4, 0x1

    .line 15
    .line 16
    :cond_0
    sget-object v0, Lcom/kubi/flutter/proto/kline/ChartSetupConfigKt$Dsl;->b:Lcom/kubi/flutter/proto/kline/ChartSetupConfigKt$Dsl$Companion;

    .line 17
    .line 18
    .line 19
    invoke-static {}, Lcom/kubi/flutter/proto/kline/ChartSetupConfig;->newBuilder()Lcom/kubi/flutter/proto/kline/ChartSetupConfig$b;

    .line 20
    move-result-object v1

    .line 21
    .line 22
    const-string v2, "newBuilder(...)"

    .line 23
    .line 24
    .line 25
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v1}, Lcom/kubi/flutter/proto/kline/ChartSetupConfigKt$Dsl$Companion;->_create(Lcom/kubi/flutter/proto/kline/ChartSetupConfig$b;)Lcom/kubi/flutter/proto/kline/ChartSetupConfigKt$Dsl;

    .line 29
    move-result-object v0

    .line 30
    .line 31
    sget-object v1, Lcom/kubi/flutter/proto/kline/CandleViewConfigKt$Dsl;->b:Lcom/kubi/flutter/proto/kline/CandleViewConfigKt$Dsl$Companion;

    .line 32
    .line 33
    .line 34
    invoke-static {}, Lcom/kubi/flutter/proto/kline/CandleViewConfig;->newBuilder()Lcom/kubi/flutter/proto/kline/CandleViewConfig$b;

    .line 35
    move-result-object v3

    .line 36
    .line 37
    .line 38
    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1, v3}, Lcom/kubi/flutter/proto/kline/CandleViewConfigKt$Dsl$Companion;->_create(Lcom/kubi/flutter/proto/kline/CandleViewConfig$b;)Lcom/kubi/flutter/proto/kline/CandleViewConfigKt$Dsl;

    .line 42
    move-result-object v1

    .line 43
    .line 44
    sget-object v2, Lcom/kubi/flutter/proto/kline/SwitchType;->OFF:Lcom/kubi/flutter/proto/kline/SwitchType;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1, v2}, Lcom/kubi/flutter/proto/kline/CandleViewConfigKt$Dsl;->d(Lcom/kubi/flutter/proto/kline/SwitchType;)V

    .line 48
    .line 49
    sget-object v2, Lcom/kubi/flutter/widget/kline/o;->a:Lcom/kubi/flutter/widget/kline/o;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v2}, Lcom/kubi/flutter/widget/kline/o;->b()Ljava/lang/String;

    .line 53
    move-result-object v3

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1, v3}, Lcom/kubi/flutter/proto/kline/CandleViewConfigKt$Dsl;->e(Ljava/lang/String;)V

    .line 57
    .line 58
    if-eqz v4, :cond_1

    .line 59
    .line 60
    sget v3, Lcom/kubi/flutter/widget/R$color;->primary:I

    .line 61
    .line 62
    .line 63
    :goto_0
    invoke-virtual {v2, v3}, Lcom/kubi/flutter/widget/kline/o;->e(I)I

    .line 64
    move-result v3

    .line 65
    goto :goto_1

    .line 66
    .line 67
    :cond_1
    sget v3, Lcom/kubi/flutter/widget/R$color;->secondary:I

    .line 68
    goto :goto_0

    .line 69
    .line 70
    .line 71
    :goto_1
    invoke-virtual {v1, v3}, Lcom/kubi/flutter/proto/kline/CandleViewConfigKt$Dsl;->b(I)V

    .line 72
    .line 73
    if-eqz v4, :cond_2

    .line 74
    .line 75
    sget v3, Lcom/kubi/flutter/widget/R$color;->secondary:I

    .line 76
    .line 77
    .line 78
    :goto_2
    invoke-virtual {v2, v3}, Lcom/kubi/flutter/widget/kline/o;->e(I)I

    .line 79
    move-result v2

    .line 80
    goto :goto_3

    .line 81
    .line 82
    :cond_2
    sget v3, Lcom/kubi/flutter/widget/R$color;->primary:I

    .line 83
    goto :goto_2

    .line 84
    .line 85
    .line 86
    :goto_3
    invoke-virtual {v1, v2}, Lcom/kubi/flutter/proto/kline/CandleViewConfigKt$Dsl;->c(I)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v1}, Lcom/kubi/flutter/proto/kline/CandleViewConfigKt$Dsl;->a()Lcom/kubi/flutter/proto/kline/CandleViewConfig;

    .line 90
    move-result-object v1

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0, v1}, Lcom/kubi/flutter/proto/kline/ChartSetupConfigKt$Dsl;->b(Lcom/kubi/flutter/proto/kline/CandleViewConfig;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0}, Lcom/kubi/flutter/proto/kline/ChartSetupConfigKt$Dsl;->a()Lcom/kubi/flutter/proto/kline/ChartSetupConfig;

    .line 97
    move-result-object v0

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

.method public final d(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "key"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Lcom/kubi/flutter/widget/kline/o;->b:Ljava/util/WeakHashMap;

    .line 8
    monitor-enter v0

    .line 9
    .line 10
    .line 11
    :try_start_0
    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    move-result-object p1

    .line 13
    .line 14
    check-cast p1, Lcom/kubi/flutter/widget/kline/o$a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    monitor-exit v0

    .line 16
    return-void

    .line 17
    :catchall_0
    move-exception p1

    .line 18
    monitor-exit v0

    .line 19
    throw p1
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

.method public final e(I)I
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/blankj/utilcode/util/o0;->a()Landroid/app/Application;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-static {v0, p1}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 8
    move-result p1

    .line 9
    return p1
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
