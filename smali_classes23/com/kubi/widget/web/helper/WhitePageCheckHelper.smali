.class public final Lcom/kubi/widget/web/helper/WhitePageCheckHelper;
.super Ljava/lang/Object;
.source "WhitePageCheckHelper.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/widget/web/helper/WhitePageCheckHelper$a;,
        Lcom/kubi/widget/web/helper/WhitePageCheckHelper$WhitePageConfig;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u00c6\u0002\u0018\u00002\u00020\u0001:\u0002\u001a\u001bB\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\r\u0010\u000e\u001a\u00020\u000fH\u0000\u00a2\u0006\u0002\u0008\u0010J\u0013\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u0012H\u0000\u00a2\u0006\u0002\u0008\u0014J\u001d\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u00122\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0000\u00a2\u0006\u0002\u0008\u0014J\u001b\u0010\u0017\u001a\u00020\u000f2\u000c\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u0012H\u0000\u00a2\u0006\u0002\u0008\u0019R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\n@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\r\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/kubi/widget/web/helper/WhitePageCheckHelper;",
        "",
        "<init>",
        "()V",
        "CONFIG_NAME",
        "",
        "value",
        "",
        "isEnable",
        "()Z",
        "",
        "delay",
        "getDelay",
        "()J",
        "load",
        "",
        "load$LWebWidget_googleRelease",
        "prepare",
        "Lcom/kubi/widget/web/startup/PreparedConfig;",
        "Lcom/kubi/widget/web/helper/WhitePageCheckHelper$PreparedWhitePageConfig;",
        "prepare$LWebWidget_googleRelease",
        "config",
        "Lcom/kubi/widget/web/helper/WhitePageCheckHelper$WhitePageConfig;",
        "apply",
        "prepared",
        "apply$LWebWidget_googleRelease",
        "WhitePageConfig",
        "PreparedWhitePageConfig",
        "LWebWidget_googleRelease"
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
        "SMAP\nWhitePageCheckHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WhitePageCheckHelper.kt\ncom/kubi/widget/web/helper/WhitePageCheckHelper\n+ 2 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 3 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,64:1\n35#2,4:65\n39#2:71\n44#3,2:69\n*S KotlinDebug\n*F\n+ 1 WhitePageCheckHelper.kt\ncom/kubi/widget/web/helper/WhitePageCheckHelper\n*L\n40#1:65,4\n40#1:71\n40#1:69,2\n*E\n"
    }
.end annotation


# static fields
.field public static final a:Lcom/kubi/widget/web/helper/WhitePageCheckHelper;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static b:Z

.field public static c:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/widget/web/helper/WhitePageCheckHelper;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/kubi/widget/web/helper/WhitePageCheckHelper;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/kubi/widget/web/helper/WhitePageCheckHelper;->a:Lcom/kubi/widget/web/helper/WhitePageCheckHelper;

    .line 8
    .line 9
    sget-object v0, Lvk/s;->a:Lvk/s;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Lvk/s;->Q()Z

    .line 13
    move-result v0

    .line 14
    .line 15
    sput-boolean v0, Lcom/kubi/widget/web/helper/WhitePageCheckHelper;->b:Z

    .line 16
    .line 17
    const-wide/16 v0, 0x1388

    .line 18
    .line 19
    sput-wide v0, Lcom/kubi/widget/web/helper/WhitePageCheckHelper;->c:J

    .line 20
    return-void
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
.end method


# virtual methods
.method public final a(Lcom/kubi/widget/web/startup/t;)V
    .locals 4
    .param p1    # Lcom/kubi/widget/web/startup/t;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/widget/web/startup/t<",
            "Lcom/kubi/widget/web/helper/WhitePageCheckHelper$a;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "prepared"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    instance-of v0, p1, Lcom/kubi/widget/web/startup/t$c;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    check-cast p1, Lcom/kubi/widget/web/startup/t$c;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Lcom/kubi/widget/web/startup/t$c;->a()Ljava/lang/Object;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    check-cast v0, Lcom/kubi/widget/web/helper/WhitePageCheckHelper$a;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Lcom/kubi/widget/web/helper/WhitePageCheckHelper$a;->b()Z

    .line 22
    move-result v0

    .line 23
    .line 24
    sput-boolean v0, Lcom/kubi/widget/web/helper/WhitePageCheckHelper;->b:Z

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Lcom/kubi/widget/web/startup/t$c;->a()Ljava/lang/Object;

    .line 28
    move-result-object v0

    .line 29
    .line 30
    check-cast v0, Lcom/kubi/widget/web/helper/WhitePageCheckHelper$a;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Lcom/kubi/widget/web/helper/WhitePageCheckHelper$a;->a()J

    .line 34
    move-result-wide v0

    .line 35
    .line 36
    sput-wide v0, Lcom/kubi/widget/web/helper/WhitePageCheckHelper;->c:J

    .line 37
    .line 38
    sget-object v0, Lx00/b;->a:Lx00/b;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1}, Lcom/kubi/widget/web/startup/t$c;->a()Ljava/lang/Object;

    .line 42
    move-result-object v1

    .line 43
    .line 44
    check-cast v1, Lcom/kubi/widget/web/helper/WhitePageCheckHelper$a;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1}, Lcom/kubi/widget/web/helper/WhitePageCheckHelper$a;->c()F

    .line 48
    move-result v1

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1}, Lcom/kubi/widget/web/startup/t$c;->a()Ljava/lang/Object;

    .line 52
    move-result-object p1

    .line 53
    .line 54
    check-cast p1, Lcom/kubi/widget/web/helper/WhitePageCheckHelper$a;

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1}, Lcom/kubi/widget/web/helper/WhitePageCheckHelper$a;->a()J

    .line 58
    move-result-wide v2

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, v1, v2, v3}, Lx00/b;->p(FJ)V

    .line 62
    return-void

    .line 63
    .line 64
    :cond_0
    sget-object v0, Lcom/kubi/widget/web/startup/t$b;->a:Lcom/kubi/widget/web/startup/t$b;

    .line 65
    .line 66
    .line 67
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 68
    move-result v0

    .line 69
    .line 70
    if-nez v0, :cond_2

    .line 71
    .line 72
    instance-of v0, p1, Lcom/kubi/widget/web/startup/t$a;

    .line 73
    .line 74
    if-eqz v0, :cond_1

    .line 75
    .line 76
    check-cast p1, Lcom/kubi/widget/web/startup/t$a;

    .line 77
    .line 78
    .line 79
    invoke-virtual {p1}, Lcom/kubi/widget/web/startup/t$a;->a()Ljava/lang/Throwable;

    .line 80
    move-result-object p1

    .line 81
    throw p1

    .line 82
    .line 83
    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 84
    .line 85
    .line 86
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 87
    throw p1

    .line 88
    :cond_2
    return-void
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
.end method

.method public final b()J
    .locals 2

    .line 1
    .line 2
    sget-wide v0, Lcom/kubi/widget/web/helper/WhitePageCheckHelper;->c:J

    .line 3
    return-wide v0
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

.method public final c()Z
    .locals 1

    .line 1
    .line 2
    sget-boolean v0, Lcom/kubi/widget/web/helper/WhitePageCheckHelper;->b:Z

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

.method public final d()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/widget/web/helper/WhitePageCheckHelper;->e()Lcom/kubi/widget/web/startup/t;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, v0}, Lcom/kubi/widget/web/helper/WhitePageCheckHelper;->a(Lcom/kubi/widget/web/startup/t;)V

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
.end method

.method public final e()Lcom/kubi/widget/web/startup/t;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/kubi/widget/web/startup/t<",
            "Lcom/kubi/widget/web/helper/WhitePageCheckHelper$a;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "web_white_page_config"

    .line 4
    .line 5
    :try_start_0
    sget-object v1, Lcom/kubi/config/RemoteConfig;->a:Lcom/kubi/config/RemoteConfig;

    .line 6
    .line 7
    new-instance v1, Lcom/kubi/widget/web/helper/WhitePageCheckHelper$b;

    .line 8
    .line 9
    .line 10
    invoke-direct {v1}, Lcom/kubi/widget/web/helper/WhitePageCheckHelper$b;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    .line 17
    const-string/jumbo v2, "object : TypeToken<T>() {}.type"

    .line 18
    .line 19
    .line 20
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-static {v0, v1}, Lcom/kubi/config/RemoteConfig;->a(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 24
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception v0

    .line 27
    move-object v2, v0

    .line 28
    .line 29
    new-instance v1, Lcom/kubi/config/exception/KCConfigException;

    .line 30
    .line 31
    const/16 v6, 0x8

    .line 32
    const/4 v7, 0x0

    .line 33
    .line 34
    const-string v3, "RemoteConfig"

    .line 35
    const/4 v4, 0x0

    .line 36
    const/4 v5, 0x0

    .line 37
    .line 38
    .line 39
    invoke-direct/range {v1 .. v7}, Lcom/kubi/config/exception/KCConfigException;-><init>(Ljava/lang/Throwable;Ljava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 40
    const/4 v0, 0x2

    .line 41
    const/4 v2, 0x0

    .line 42
    .line 43
    .line 44
    invoke-static {v1, v2, v0, v2}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 45
    move-object v0, v2

    .line 46
    .line 47
    :goto_0
    check-cast v0, Lcom/kubi/widget/web/helper/WhitePageCheckHelper$WhitePageConfig;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, v0}, Lcom/kubi/widget/web/helper/WhitePageCheckHelper;->f(Lcom/kubi/widget/web/helper/WhitePageCheckHelper$WhitePageConfig;)Lcom/kubi/widget/web/startup/t;

    .line 51
    move-result-object v0

    .line 52
    return-object v0
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

.method public final f(Lcom/kubi/widget/web/helper/WhitePageCheckHelper$WhitePageConfig;)Lcom/kubi/widget/web/startup/t;
    .locals 6
    .param p1    # Lcom/kubi/widget/web/helper/WhitePageCheckHelper$WhitePageConfig;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/widget/web/helper/WhitePageCheckHelper$WhitePageConfig;",
            ")",
            "Lcom/kubi/widget/web/startup/t<",
            "Lcom/kubi/widget/web/helper/WhitePageCheckHelper$a;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    sget-object p1, Lcom/kubi/widget/web/startup/t$b;->a:Lcom/kubi/widget/web/startup/t$b;

    .line 5
    return-object p1

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-virtual {p1}, Lcom/kubi/widget/web/helper/WhitePageCheckHelper$WhitePageConfig;->getThreshold()F

    .line 9
    move-result v0

    .line 10
    .line 11
    const/16 v1, 0x64

    .line 12
    int-to-float v1, v1

    .line 13
    mul-float/2addr v0, v1

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Lcom/kubi/widget/web/helper/WhitePageCheckHelper$WhitePageConfig;->getDelay()J

    .line 17
    move-result-wide v1

    .line 18
    .line 19
    const-wide/16 v3, 0x0

    .line 20
    .line 21
    cmp-long v1, v1, v3

    .line 22
    .line 23
    if-gtz v1, :cond_1

    .line 24
    .line 25
    sget-object p1, Lcom/kubi/widget/web/startup/t$b;->a:Lcom/kubi/widget/web/startup/t$b;

    .line 26
    return-object p1

    .line 27
    .line 28
    :cond_1
    new-instance v1, Lcom/kubi/widget/web/startup/t$c;

    .line 29
    .line 30
    new-instance v2, Lcom/kubi/widget/web/helper/WhitePageCheckHelper$a;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Lcom/kubi/widget/web/helper/WhitePageCheckHelper$WhitePageConfig;->getEnable()Z

    .line 34
    move-result v3

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1}, Lcom/kubi/widget/web/helper/WhitePageCheckHelper$WhitePageConfig;->getDelay()J

    .line 38
    move-result-wide v4

    .line 39
    .line 40
    .line 41
    invoke-direct {v2, v3, v0, v4, v5}, Lcom/kubi/widget/web/helper/WhitePageCheckHelper$a;-><init>(ZFJ)V

    .line 42
    .line 43
    .line 44
    invoke-direct {v1, v2}, Lcom/kubi/widget/web/startup/t$c;-><init>(Ljava/lang/Object;)V

    .line 45
    return-object v1
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
