.class public final Lcom/kubi/lite/utils/e;
.super Ljava/lang/Object;
.source "LiteUtils.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\rJ\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0012\u001a\u00020\u000bJ\u0006\u0010\u0013\u001a\u00020\u000bJ\u0016\u0010\u0014\u001a\u00020\u0015*\u0004\u0018\u00010\r2\u0008\u0008\u0002\u0010\u0016\u001a\u00020\rR\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\u0006\u0010\u0007R\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0011\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/kubi/lite/utils/LiteUtils;",
        "",
        "<init>",
        "()V",
        "mediumFont",
        "Landroid/graphics/Typeface;",
        "getMediumFont",
        "()Landroid/graphics/Typeface;",
        "mediumFont$delegate",
        "Lkotlin/Lazy;",
        "isLitePath",
        "",
        "path",
        "",
        "uri",
        "Landroid/net/Uri;",
        "isLiteModeAvailable",
        "Ljava/lang/Boolean;",
        "isLiteAvailable",
        "isSupportSwitchAnimation",
        "log",
        "",
        "tag",
        "LiteLib_googleRelease"
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
        "SMAP\nLiteUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiteUtils.kt\ncom/kubi/lite/utils/LiteUtils\n+ 2 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 3 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,79:1\n35#2,4:80\n39#2:86\n44#3,2:84\n*S KotlinDebug\n*F\n+ 1 LiteUtils.kt\ncom/kubi/lite/utils/LiteUtils\n*L\n51#1:80,4\n51#1:86\n51#1:84,2\n*E\n"
    }
.end annotation


# static fields
.field public static final a:Lcom/kubi/lite/utils/e;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final b:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static c:Ljava/lang/Boolean;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/lite/utils/e;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/kubi/lite/utils/e;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/kubi/lite/utils/e;->a:Lcom/kubi/lite/utils/e;

    .line 8
    .line 9
    new-instance v0, Lcom/kubi/lite/utils/d;

    .line 10
    .line 11
    .line 12
    invoke-direct {v0}, Lcom/kubi/lite/utils/d;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    sput-object v0, Lcom/kubi/lite/utils/e;->b:Lkotlin/Lazy;

    .line 19
    return-void
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
.end method

.method public static synthetic a()Landroid/graphics/Typeface;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/lite/utils/e;->c()Landroid/graphics/Typeface;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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
.end method

.method public static final c()Landroid/graphics/Typeface;
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/utils/l;->a:Lcom/kubi/utils/l;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/utils/l;->a()Landroid/content/Context;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    sget v1, Lcom/kubi/lite/R$font;->medium:I

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1}, Landroidx/core/content/res/ResourcesCompat;->getFont(Landroid/content/Context;I)Landroid/graphics/Typeface;

    .line 12
    move-result-object v0

    .line 13
    return-object v0
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
.end method


# virtual methods
.method public final b()Z
    .locals 8

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/lite/utils/e;->c:Ljava/lang/Boolean;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    .line 11
    :cond_0
    const-string v0, "kc_lite_show"

    .line 12
    .line 13
    :try_start_0
    sget-object v1, Lcom/kubi/config/RemoteConfig;->a:Lcom/kubi/config/RemoteConfig;

    .line 14
    .line 15
    new-instance v1, Lcom/kubi/lite/utils/e$a;

    .line 16
    .line 17
    .line 18
    invoke-direct {v1}, Lcom/kubi/lite/utils/e$a;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    .line 22
    move-result-object v1

    .line 23
    .line 24
    const-string v2, "object : TypeToken<T>() {}.type"

    .line 25
    .line 26
    .line 27
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-static {v0, v1}, Lcom/kubi/config/RemoteConfig;->a(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 31
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    goto :goto_0

    .line 33
    :catchall_0
    move-exception v0

    .line 34
    move-object v2, v0

    .line 35
    .line 36
    new-instance v1, Lcom/kubi/config/exception/KCConfigException;

    .line 37
    .line 38
    const/16 v6, 0x8

    .line 39
    const/4 v7, 0x0

    .line 40
    .line 41
    const-string v3, "RemoteConfig"

    .line 42
    const/4 v4, 0x0

    .line 43
    const/4 v5, 0x0

    .line 44
    .line 45
    .line 46
    invoke-direct/range {v1 .. v7}, Lcom/kubi/config/exception/KCConfigException;-><init>(Ljava/lang/Throwable;Ljava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 47
    const/4 v0, 0x2

    .line 48
    const/4 v2, 0x0

    .line 49
    .line 50
    .line 51
    invoke-static {v1, v2, v0, v2}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 52
    move-object v0, v2

    .line 53
    .line 54
    :goto_0
    check-cast v0, Ljava/lang/Boolean;

    .line 55
    const/4 v1, 0x1

    .line 56
    .line 57
    .line 58
    invoke-static {v0, v1}, Lcom/kubi/utils/extensions/c;->e(Ljava/lang/Boolean;Z)Z

    .line 59
    move-result v0

    .line 60
    .line 61
    sget-object v2, Lcom/kubi/sdk/site/SiteVisibleConfigKey;->Lite:Lcom/kubi/sdk/site/SiteVisibleConfigKey;

    .line 62
    .line 63
    .line 64
    invoke-static {v2}, Lcom/kubi/sdk/site/b;->b(Lcom/kubi/sdk/site/SiteVisibleConfigKey;)Z

    .line 65
    move-result v2

    .line 66
    const/4 v3, 0x0

    .line 67
    .line 68
    if-eqz v0, :cond_1

    .line 69
    .line 70
    if-eqz v2, :cond_1

    .line 71
    move v4, v1

    .line 72
    goto :goto_1

    .line 73
    :cond_1
    move v4, v3

    .line 74
    .line 75
    :goto_1
    sget-object v5, Lcom/kubi/user/config/UserInfo;->a:Lcom/kubi/user/config/UserInfo;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v5}, Lcom/kubi/user/config/UserInfo;->d()Lcom/kubi/user/config/UserInfo$LoginState;

    .line 79
    move-result-object v6

    .line 80
    .line 81
    sget-object v7, Lcom/kubi/user/config/UserInfo$LoginState;->Login:Lcom/kubi/user/config/UserInfo$LoginState;

    .line 82
    .line 83
    if-ne v6, v7, :cond_3

    .line 84
    .line 85
    if-eqz v4, :cond_2

    .line 86
    .line 87
    sget-object v4, Lcom/kubi/sdk/mode/config/LiteConfigManager;->a:Lcom/kubi/sdk/mode/config/LiteConfigManager;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v4}, Lcom/kubi/sdk/mode/config/LiteConfigManager;->f()Z

    .line 91
    move-result v4

    .line 92
    .line 93
    if-eqz v4, :cond_2

    .line 94
    goto :goto_2

    .line 95
    :cond_2
    move v1, v3

    .line 96
    :goto_2
    move v4, v1

    .line 97
    .line 98
    :cond_3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 102
    .line 103
    const-string v3, "isLiteAvailable: remoteEnabled="

    .line 104
    .line 105
    .line 106
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    const-string v0, ", siteEnabled="

    .line 112
    .line 113
    .line 114
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    const-string v0, ",login=["

    .line 120
    .line 121
    .line 122
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v5}, Lcom/kubi/user/config/UserInfo;->d()Lcom/kubi/user/config/UserInfo$LoginState;

    .line 126
    move-result-object v0

    .line 127
    .line 128
    .line 129
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    const-string v0, " -- "

    .line 132
    .line 133
    .line 134
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    sget-object v0, Lcom/kubi/sdk/mode/config/LiteConfigManager;->a:Lcom/kubi/sdk/mode/config/LiteConfigManager;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v0}, Lcom/kubi/sdk/mode/config/LiteConfigManager;->f()Z

    .line 140
    move-result v0

    .line 141
    .line 142
    .line 143
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    const-string v0, "] $"

    .line 146
    .line 147
    .line 148
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 155
    move-result-object v0

    .line 156
    .line 157
    const-string v1, "LiteTag"

    .line 158
    .line 159
    .line 160
    invoke-static {v1, v0}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 161
    .line 162
    sget-object v0, Lwz/a;->a:Lwz/a;

    .line 163
    .line 164
    .line 165
    invoke-virtual {v0, v4}, Lwz/a;->f(Z)V

    .line 166
    .line 167
    .line 168
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 169
    move-result-object v0

    .line 170
    .line 171
    sput-object v0, Lcom/kubi/lite/utils/e;->c:Ljava/lang/Boolean;

    .line 172
    return v4
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
.end method
