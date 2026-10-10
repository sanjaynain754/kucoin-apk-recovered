.class public final Lcom/kubi/widget/web/startup/i;
.super Ljava/lang/Object;
.source "KWebStartupDependencies.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0007J\u0008\u0010\u0008\u001a\u00020\u0007H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/kubi/widget/web/startup/KWebSiteBaseConfigurator;",
        "",
        "<init>",
        "()V",
        "TAG",
        "",
        "configure",
        "",
        "updateSiteChannel",
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
        "SMAP\nKWebStartupDependencies.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KWebStartupDependencies.kt\ncom/kubi/widget/web/startup/KWebSiteBaseConfigurator\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,131:1\n11228#2:132\n11563#2,3:133\n*S KotlinDebug\n*F\n+ 1 KWebStartupDependencies.kt\ncom/kubi/widget/web/startup/KWebSiteBaseConfigurator\n*L\n83#1:132\n83#1:133,3\n*E\n"
    }
.end annotation


# static fields
.field public static final a:Lcom/kubi/widget/web/startup/i;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/widget/web/startup/i;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/kubi/widget/web/startup/i;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/kubi/widget/web/startup/i;->a:Lcom/kubi/widget/web/startup/i;

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
.end method

.method public static synthetic a()Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/widget/web/startup/i;->e()Lkotlin/Unit;

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
.end method

.method public static synthetic b()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/widget/web/startup/i;->g()Ljava/lang/String;

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
.end method

.method public static synthetic c(Lcom/kubi/sdk/mode/AppMode;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/widget/web/startup/i;->f(Lcom/kubi/sdk/mode/AppMode;)Lkotlin/Unit;

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
.end method

.method public static final e()Lkotlin/Unit;
    .locals 3

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/sdk/mode/AppMode;->Companion:Lcom/kubi/sdk/mode/AppMode$Companion;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/sdk/mode/AppMode$Companion;->getCurrentMode()Landroidx/lifecycle/LiveData;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    new-instance v1, Lcom/kubi/widget/web/startup/h;

    .line 9
    .line 10
    .line 11
    invoke-direct {v1}, Lcom/kubi/widget/web/startup/h;-><init>()V

    .line 12
    .line 13
    new-instance v2, Lcom/kubi/widget/web/startup/i$b;

    .line 14
    .line 15
    .line 16
    invoke-direct {v2, v1}, Lcom/kubi/widget/web/startup/i$b;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v2}, Landroidx/lifecycle/LiveData;->observeForever(Landroidx/lifecycle/Observer;)V

    .line 20
    .line 21
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 22
    return-object v0
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

.method public static final f(Lcom/kubi/sdk/mode/AppMode;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    sget-object p0, Lcom/kubi/widget/web/startup/i;->a:Lcom/kubi/widget/web/startup/i;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/kubi/widget/web/startup/i;->h()V

    .line 6
    .line 7
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 8
    return-object p0
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
.end method

.method public static final g()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/kucoin/utils/r;->a:Lcom/kubi/kucoin/utils/r;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/kucoin/utils/r;->l()Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const-string v0, "light"

    .line 11
    return-object v0

    .line 12
    .line 13
    :cond_0
    const-string v0, "dark"

    .line 14
    return-object v0
    .line 15
    .line 16
    .line 17
.end method


# virtual methods
.method public final d()V
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/widget/web/startup/i;->h()V

    .line 4
    .line 5
    new-instance v0, Lcom/kubi/widget/web/startup/e;

    .line 6
    const/4 v1, 0x0

    .line 7
    const/4 v2, 0x1

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, v1, v2, v1}, Lcom/kubi/widget/web/startup/e;-><init>(Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 11
    .line 12
    new-instance v1, Lcom/kubi/widget/web/startup/f;

    .line 13
    .line 14
    .line 15
    invoke-direct {v1}, Lcom/kubi/widget/web/startup/f;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Lcom/kubi/widget/web/startup/e;->e(Lkotlin/jvm/functions/Function0;)V

    .line 19
    .line 20
    sget-object v0, Lx00/b;->a:Lx00/b;

    .line 21
    .line 22
    const-string v1, "KuCoin"

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, Lx00/b;->j(Ljava/lang/String;)V

    .line 26
    .line 27
    sget-object v1, Lvk/s;->a:Lvk/s;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1}, Lvk/s;->Q()Z

    .line 31
    move-result v1

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v1}, Lx00/b;->i(Z)V

    .line 35
    .line 36
    .line 37
    invoke-static {}, Lcom/kubi/sdk/function/language/LanguageType;->values()[Lcom/kubi/sdk/function/language/LanguageType;

    .line 38
    move-result-object v1

    .line 39
    .line 40
    new-instance v2, Ljava/util/ArrayList;

    .line 41
    array-length v3, v1

    .line 42
    .line 43
    .line 44
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 45
    array-length v3, v1

    .line 46
    const/4 v4, 0x0

    .line 47
    .line 48
    :goto_0
    if-ge v4, v3, :cond_0

    .line 49
    .line 50
    aget-object v5, v1, v4

    .line 51
    .line 52
    .line 53
    invoke-virtual {v5}, Lcom/kubi/sdk/function/language/LanguageType;->getLocale()Ljava/util/Locale;

    .line 54
    move-result-object v5

    .line 55
    .line 56
    .line 57
    invoke-virtual {v5}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    .line 58
    move-result-object v5

    .line 59
    .line 60
    .line 61
    invoke-interface {v2, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 62
    .line 63
    add-int/lit8 v4, v4, 0x1

    .line 64
    goto :goto_0

    .line 65
    .line 66
    .line 67
    :cond_0
    invoke-virtual {v0, v2}, Lx00/b;->k(Ljava/lang/Iterable;)V

    .line 68
    .line 69
    sget-object v0, Lx00/b;->a:Lx00/b;

    .line 70
    .line 71
    new-instance v1, Lcom/kubi/widget/web/startup/g;

    .line 72
    .line 73
    .line 74
    invoke-direct {v1}, Lcom/kubi/widget/web/startup/g;-><init>()V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0, v1}, Lx00/b;->m(Lkotlin/jvm/functions/Function0;)V

    .line 78
    .line 79
    sget-object v1, Lcom/kubi/widget/web/helper/t;->a:Lcom/kubi/widget/web/helper/t;

    .line 80
    .line 81
    sget-object v2, Lcom/kubi/sdk/function/language/a;->g:Lcom/kubi/sdk/function/language/LanguageType;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1, v2}, Lcom/kubi/widget/web/helper/t;->a(Lcom/kubi/sdk/function/language/LanguageType;)Ljava/lang/String;

    .line 85
    move-result-object v1

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0, v1}, Lx00/b;->d(Ljava/lang/String;)V

    .line 89
    .line 90
    sget-object v0, Lcom/kubi/sdk/function/language/a;->a:Lcom/kubi/sdk/function/language/a;

    .line 91
    .line 92
    new-instance v1, Lcom/kubi/widget/web/startup/i$a;

    .line 93
    .line 94
    .line 95
    invoke-direct {v1}, Lcom/kubi/widget/web/startup/i$a;-><init>()V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0, v1}, Lcom/kubi/sdk/function/language/a;->addOnLanguageChangeListener(Lcom/kubi/sdk/function/language/a$a;)V

    .line 99
    return-void
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
.end method

.method public final h()V
    .locals 8

    .line 1
    .line 2
    sget-object v0, Lv80/f;->a:Lv80/f;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lv80/f;->c()Lv80/a;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lv80/f;->d()Ld10/a;

    .line 10
    move-result-object v3

    .line 11
    .line 12
    sget-object v0, Lcom/kubi/sdk/site/SiteType;->Companion:Lcom/kubi/sdk/site/SiteType$Companion;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/kubi/sdk/site/SiteType$Companion;->getCurrentSiteType()Ljava/lang/String;

    .line 16
    move-result-object v7

    .line 17
    .line 18
    sget-object v0, Lcom/kubi/sdk/mode/AppMode;->Companion:Lcom/kubi/sdk/mode/AppMode$Companion;

    .line 19
    const/4 v2, 0x0

    .line 20
    const/4 v4, 0x1

    .line 21
    .line 22
    .line 23
    invoke-static {v0, v2, v4, v2}, Lcom/kubi/sdk/mode/AppMode$Companion;->getCurrentMode$default(Lcom/kubi/sdk/mode/AppMode$Companion;Lcom/kubi/sdk/mode/AppMode;ILjava/lang/Object;)Lcom/kubi/sdk/mode/AppMode;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Lcom/kubi/sdk/mode/AppMode;->getModeType()Ljava/lang/String;

    .line 28
    move-result-object v0

    .line 29
    .line 30
    new-instance v2, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 34
    .line 35
    .line 36
    const-string/jumbo v4, "siteType="

    .line 37
    .line 38
    .line 39
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    const-string v4, ", mode="

    .line 45
    .line 46
    .line 47
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    const-string v4, ", shareSite="

    .line 53
    .line 54
    .line 55
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    move-result-object v4

    .line 60
    .line 61
    .line 62
    invoke-virtual {v4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 63
    move-result-object v4

    .line 64
    .line 65
    .line 66
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    move-result-object v2

    .line 71
    .line 72
    const-string v4, "KWebWidgetStartupTask"

    .line 73
    .line 74
    .line 75
    invoke-static {v4, v2}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    .line 77
    new-instance v2, Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1}, Lv80/a;->a()Ljava/lang/String;

    .line 84
    move-result-object v5

    .line 85
    .line 86
    .line 87
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    const/16 v5, 0x20

    .line 90
    .line 91
    .line 92
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    const/16 v0, 0x2f

    .line 98
    .line 99
    .line 100
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    sget-object v0, Lvk/s;->a:Lvk/s;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0}, Lvk/s;->Z()Ljava/lang/String;

    .line 106
    move-result-object v0

    .line 107
    .line 108
    .line 109
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 113
    move-result-object v6

    .line 114
    .line 115
    const-string v0, "appendUA updated"

    .line 116
    .line 117
    .line 118
    invoke-static {v4, v0}, Lro/b;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 119
    .line 120
    sget-object v2, Lx00/b;->a:Lx00/b;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v1}, Lv80/a;->c()Ljava/lang/String;

    .line 124
    move-result-object v4

    .line 125
    .line 126
    .line 127
    invoke-virtual {v1}, Lv80/a;->b()Ljava/lang/String;

    .line 128
    move-result-object v5

    .line 129
    .line 130
    .line 131
    invoke-virtual/range {v2 .. v7}, Lx00/b;->h(Ld10/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 132
    .line 133
    sget-object v0, Lzz/a;->a:Lzz/a;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v0, v6}, Lzz/a;->a(Ljava/lang/String;)V

    .line 137
    return-void
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
.end method
