.class public final Lcom/kubi/sdk/site/rebirth/SiteLoadingHelper;
.super Ljava/lang/Object;
.source "SiteLoadingHelper.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/sdk/site/rebirth/SiteLoadingHelper$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0016\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J/\u0010\u0011\u001a\u00020\u000c*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00152\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0000\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00172\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u0012H\u0000\u00a2\u0006\u0002\u0008\u001cJ\u001b\u0010\u001d\u001a\u00020\u000c*\u00020\u001e2\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u0012H\u0000\u00a2\u0006\u0002\u0008\u001fJ\u001b\u0010 \u001a\u00020\u000c*\u00020\u001e2\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u0012H\u0000\u00a2\u0006\u0002\u0008!J\'\u0010\"\u001a\u00020\u000c*\u00020\u001e2\u0008\u0008\u0001\u0010#\u001a\u00020$2\u0006\u0010\u001b\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\u0005H\u0082\u0008R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"
    }
    d2 = {
        "Lcom/kubi/sdk/site/rebirth/SiteLoadingHelper;",
        "",
        "<init>",
        "()V",
        "SITE_CHANGE_TITLE",
        "",
        "SITE_CHANGE_SUB_TITLE",
        "SITE_CHANGE_BLOCK_TITLE",
        "SITE_CHANGE_BLOCK",
        "SITE_CHANGE_BLOCK_BUTTON",
        "SITE_CHANGE_BLOCK_SUB_TITLE",
        "setSwitchSiteViewStub",
        "",
        "activity",
        "Landroidx/activity/ComponentActivity;",
        "viewStub",
        "Landroid/view/ViewStub;",
        "setSiteLoadingText",
        "Landroid/os/Bundle;",
        "siteType",
        "from",
        "Lcom/kubi/sdk/site/SiteService$SwitchFromType;",
        "isDirectly",
        "",
        "setSiteLoadingText$LSite_googleRelease",
        "(Landroid/os/Bundle;Ljava/lang/String;Lcom/kubi/sdk/site/SiteService$SwitchFromType;Ljava/lang/Boolean;)V",
        "isBlockChangeView",
        "bundle",
        "isBlockChangeView$LSite_googleRelease",
        "setSwitchLoadingView",
        "Landroid/view/View;",
        "setSwitchLoadingView$LSite_googleRelease",
        "setSwitchBlockView",
        "setSwitchBlockView$LSite_googleRelease",
        "setTextByBundle",
        "id",
        "",
        "key",
        "LSite_googleRelease"
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
        "SMAP\nSiteLoadingHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SiteLoadingHelper.kt\ncom/kubi/sdk/site/rebirth/SiteLoadingHelper\n*L\n1#1,124:1\n116#1,6:125\n116#1,6:131\n116#1,6:137\n*S KotlinDebug\n*F\n+ 1 SiteLoadingHelper.kt\ncom/kubi/sdk/site/rebirth/SiteLoadingHelper\n*L\n110#1:125,6\n111#1:131,6\n112#1:137,6\n*E\n"
    }
.end annotation


# static fields
.field public static final a:Lcom/kubi/sdk/site/rebirth/SiteLoadingHelper;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/sdk/site/rebirth/SiteLoadingHelper;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/kubi/sdk/site/rebirth/SiteLoadingHelper;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/kubi/sdk/site/rebirth/SiteLoadingHelper;->a:Lcom/kubi/sdk/site/rebirth/SiteLoadingHelper;

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
.end method


# virtual methods
.method public final a(Landroid/os/Bundle;)Z
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    .line 5
    const-string/jumbo v0, "site_change_block"

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 9
    move-result p1

    .line 10
    return p1

    .line 11
    :cond_0
    const/4 p1, 0x0

    .line 12
    return p1
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

.method public final b(Landroid/os/Bundle;Ljava/lang/String;Lcom/kubi/sdk/site/SiteService$SwitchFromType;Ljava/lang/Boolean;)V
    .locals 5
    .param p1    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/kubi/sdk/site/SiteService$SwitchFromType;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Ljava/lang/Boolean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "<this>"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string/jumbo v0, "siteType"

    .line 9
    .line 10
    .line 11
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    const-string v0, "from"

    .line 14
    .line 15
    .line 16
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    sget-object v0, Lcom/kubi/sdk/site/config/SupportSiteManager;->a:Lcom/kubi/sdk/site/config/SupportSiteManager;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p2}, Lcom/kubi/sdk/site/config/SupportSiteManager;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    if-nez v0, :cond_0

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move-object p2, v0

    .line 27
    .line 28
    :goto_0
    sget-object v0, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 29
    .line 30
    sget v1, Lcom/kubi/sdk/site/R$string;->site_changing_to:I

    .line 31
    .line 32
    .line 33
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 34
    move-result-object v2

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v1, v2}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 38
    move-result-object v1

    .line 39
    .line 40
    sget-object v2, Lcom/kubi/sdk/site/rebirth/SiteLoadingHelper$a;->$EnumSwitchMapping$0:[I

    .line 41
    .line 42
    .line 43
    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    .line 44
    move-result v3

    .line 45
    .line 46
    aget v2, v2, v3

    .line 47
    const/4 v3, 0x1

    .line 48
    .line 49
    if-eq v2, v3, :cond_2

    .line 50
    const/4 v4, 0x2

    .line 51
    .line 52
    if-eq v2, v4, :cond_2

    .line 53
    const/4 v4, 0x3

    .line 54
    .line 55
    if-eq v2, v4, :cond_2

    .line 56
    const/4 v4, 0x4

    .line 57
    .line 58
    if-eq v2, v4, :cond_1

    .line 59
    .line 60
    sget v2, Lcom/kubi/sdk/site/R$string;->site_changing_info_by_ip:I

    .line 61
    .line 62
    .line 63
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 64
    move-result-object v4

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0, v2, v4}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 68
    move-result-object v2

    .line 69
    goto :goto_1

    .line 70
    .line 71
    :cond_1
    sget v2, Lcom/kubi/sdk/site/R$string;->site_changing_info_by_login:I

    .line 72
    .line 73
    .line 74
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 75
    move-result-object v4

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0, v2, v4}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 79
    move-result-object v2

    .line 80
    goto :goto_1

    .line 81
    .line 82
    :cond_2
    sget v2, Lcom/kubi/sdk/site/R$string;->site_changing_info_by_kyc:I

    .line 83
    .line 84
    .line 85
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 86
    move-result-object v4

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0, v2, v4}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 90
    move-result-object v2

    .line 91
    .line 92
    .line 93
    :goto_1
    const-string/jumbo v4, "site_change_sub_title"

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1, v4, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    const-string/jumbo v2, "site_change_title"

    .line 100
    .line 101
    .line 102
    invoke-virtual {p1, v2, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 103
    .line 104
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 105
    .line 106
    .line 107
    invoke-static {p4, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 108
    move-result p4

    .line 109
    .line 110
    if-nez p4, :cond_3

    .line 111
    .line 112
    sget-object p4, Lcom/kubi/sdk/site/SiteService$SwitchFromType;->Gateway:Lcom/kubi/sdk/site/SiteService$SwitchFromType;

    .line 113
    .line 114
    sget-object v1, Lcom/kubi/sdk/site/SiteService$SwitchFromType;->Bridge:Lcom/kubi/sdk/site/SiteService$SwitchFromType;

    .line 115
    .line 116
    .line 117
    filled-new-array {p4, v1}, [Lcom/kubi/sdk/site/SiteService$SwitchFromType;

    .line 118
    move-result-object p4

    .line 119
    .line 120
    .line 121
    invoke-static {p4}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    .line 122
    move-result-object p4

    .line 123
    .line 124
    .line 125
    invoke-interface {p4, p3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 126
    move-result p3

    .line 127
    .line 128
    if-eqz p3, :cond_3

    .line 129
    .line 130
    .line 131
    const-string/jumbo p3, "site_change_block"

    .line 132
    .line 133
    .line 134
    invoke-virtual {p1, p3, v3}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 135
    .line 136
    sget p3, Lcom/kubi/sdk/site/R$string;->site_changing_title:I

    .line 137
    const/4 p4, 0x0

    .line 138
    .line 139
    new-array v1, p4, [Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v0, p3, v1}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 143
    move-result-object p3

    .line 144
    .line 145
    sget v1, Lcom/kubi/sdk/site/R$string;->site_changing_dialog_info_by_kyc:I

    .line 146
    .line 147
    .line 148
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 149
    move-result-object p2

    .line 150
    .line 151
    .line 152
    invoke-virtual {v0, v1, p2}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 153
    move-result-object p2

    .line 154
    .line 155
    sget v1, Lcom/kubi/sdk/site/R$string;->site_changing_switch_now:I

    .line 156
    .line 157
    new-array p4, p4, [Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v0, v1, p4}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 161
    move-result-object p4

    .line 162
    .line 163
    .line 164
    const-string/jumbo v0, "site_change_block_title"

    .line 165
    .line 166
    .line 167
    invoke-virtual {p1, v0, p3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    const-string/jumbo p3, "site_change_block_sub_title"

    .line 171
    .line 172
    .line 173
    invoke-virtual {p1, p3, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    const-string/jumbo p2, "site_change_block_btn"

    .line 177
    .line 178
    .line 179
    invoke-virtual {p1, p2, p4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 180
    :cond_3
    return-void
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
.end method

.method public final c(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 2
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
    const-string v0, "<this>"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    if-nez p2, :cond_0

    .line 8
    goto :goto_0

    .line 9
    .line 10
    :cond_0
    sget v0, Lcom/kubi/sdk/site/R$id;->blockTitle:I

    .line 11
    .line 12
    .line 13
    const-string/jumbo v1, "site_change_block_title"

    .line 14
    .line 15
    .line 16
    invoke-virtual {p2, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 17
    move-result-object v1

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    check-cast v0, Lcom/kubi/resources/widget/BaseTextView;

    .line 24
    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 31
    .line 32
    :cond_1
    sget v0, Lcom/kubi/sdk/site/R$id;->blockSubTitle:I

    .line 33
    .line 34
    .line 35
    const-string/jumbo v1, "site_change_block_sub_title"

    .line 36
    .line 37
    .line 38
    invoke-virtual {p2, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 39
    move-result-object v1

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 43
    move-result-object v0

    .line 44
    .line 45
    check-cast v0, Lcom/kubi/resources/widget/BaseTextView;

    .line 46
    .line 47
    if-eqz v1, :cond_2

    .line 48
    .line 49
    if-eqz v0, :cond_2

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 53
    .line 54
    :cond_2
    sget v0, Lcom/kubi/sdk/site/R$id;->btn_confirm:I

    .line 55
    .line 56
    .line 57
    const-string/jumbo v1, "site_change_block_btn"

    .line 58
    .line 59
    .line 60
    invoke-virtual {p2, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 61
    move-result-object p2

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 65
    move-result-object p1

    .line 66
    .line 67
    check-cast p1, Lcom/kubi/resources/widget/BaseTextView;

    .line 68
    .line 69
    if-eqz p2, :cond_3

    .line 70
    .line 71
    if-eqz p1, :cond_3

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 75
    :cond_3
    :goto_0
    return-void
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

.method public final d(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 3
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
    const-string v0, "<this>"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    if-nez p2, :cond_0

    .line 8
    goto :goto_0

    .line 9
    .line 10
    .line 11
    :cond_0
    const-string/jumbo v0, "site_change_title"

    .line 12
    .line 13
    .line 14
    invoke-virtual {p2, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    if-nez v0, :cond_1

    .line 18
    goto :goto_0

    .line 19
    .line 20
    .line 21
    :cond_1
    const-string/jumbo v1, "site_change_sub_title"

    .line 22
    .line 23
    .line 24
    invoke-virtual {p2, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    move-result-object p2

    .line 26
    .line 27
    if-nez p2, :cond_2

    .line 28
    goto :goto_0

    .line 29
    .line 30
    :cond_2
    sget v1, Lcom/kubi/sdk/site/R$id;->title:I

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 34
    move-result-object v1

    .line 35
    .line 36
    check-cast v1, Lcom/kubi/resources/widget/BaseTextView;

    .line 37
    .line 38
    if-nez v1, :cond_3

    .line 39
    goto :goto_0

    .line 40
    .line 41
    :cond_3
    sget v2, Lcom/kubi/sdk/site/R$id;->subTitle:I

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 45
    move-result-object p1

    .line 46
    .line 47
    check-cast p1, Lcom/kubi/resources/widget/BaseTextView;

    .line 48
    .line 49
    if-nez p1, :cond_4

    .line 50
    :goto_0
    return-void

    .line 51
    .line 52
    .line 53
    :cond_4
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 57
    return-void
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

.method public final e(Landroidx/activity/ComponentActivity;Landroid/view/ViewStub;)V
    .locals 6
    .param p1    # Landroidx/activity/ComponentActivity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/view/ViewStub;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "activity"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string/jumbo v0, "viewStub"

    .line 9
    .line 10
    .line 11
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    sget v0, Lcom/kubi/sdk/site/R$layout;->site_switch_loading:I

    .line 14
    .line 15
    .line 16
    invoke-virtual {p2, v0}, Landroid/view/ViewStub;->setLayoutResource(I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p2}, Landroid/view/ViewStub;->inflate()Landroid/view/View;

    .line 20
    move-result-object p2

    .line 21
    .line 22
    .line 23
    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 27
    move-result-object v0

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 31
    move-result-object v0

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, p2, v0}, Lcom/kubi/sdk/site/rebirth/SiteLoadingHelper;->d(Landroid/view/View;Landroid/os/Bundle;)V

    .line 35
    .line 36
    sget-object p2, Lcom/kubi/sdk/site/helper/b;->a:Lcom/kubi/sdk/site/helper/b;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p2, p1}, Lcom/kubi/sdk/site/helper/b;->c(Landroidx/activity/ComponentActivity;)V

    .line 40
    .line 41
    .line 42
    invoke-static {p1}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 43
    move-result-object v0

    .line 44
    .line 45
    new-instance v3, Lcom/kubi/sdk/site/rebirth/SiteLoadingHelper$setSwitchSiteViewStub$1;

    .line 46
    const/4 p2, 0x0

    .line 47
    .line 48
    .line 49
    invoke-direct {v3, p1, p2}, Lcom/kubi/sdk/site/rebirth/SiteLoadingHelper$setSwitchSiteViewStub$1;-><init>(Landroidx/activity/ComponentActivity;Lkotlin/coroutines/Continuation;)V

    .line 50
    const/4 v4, 0x3

    .line 51
    const/4 v5, 0x0

    .line 52
    const/4 v1, 0x0

    .line 53
    const/4 v2, 0x0

    .line 54
    .line 55
    .line 56
    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 57
    return-void
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
