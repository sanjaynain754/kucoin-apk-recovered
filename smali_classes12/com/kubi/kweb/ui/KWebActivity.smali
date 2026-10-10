.class public Lcom/kubi/kweb/ui/KWebActivity;
.super Lcom/kubi/widget/web/ui/KWebBaseActivity;
.source "KWebActivity.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0017\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0014\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/kubi/kweb/ui/KWebActivity;",
        "Lcom/kubi/widget/web/ui/KWebBaseActivity;",
        "<init>",
        "()V",
        "initWebView",
        "",
        "webView",
        "Lcom/kubi/sdk/web/KWebView;",
        "KWebLib_googleRelease"
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
.field public static final synthetic t:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/widget/web/ui/KWebBaseActivity;-><init>()V

    .line 4
    .line 5
    const-string v0, "page_h5"

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lcom/kubi/sdk/BaseActivity;->setPageId(Ljava/lang/String;)V

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
.end method


# virtual methods
.method public u0(Lcom/kubi/sdk/web/KWebView;)V
    .locals 5
    .param p1    # Lcom/kubi/sdk/web/KWebView;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "webView"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-super {p0, p1}, Lcom/kubi/widget/web/ui/KWebBaseActivity;->u0(Lcom/kubi/sdk/web/KWebView;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    const-string v1, "url"

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    const-string v0, ""

    .line 23
    .line 24
    :cond_0
    const-string v1, "/support/meeting/"

    .line 25
    const/4 v2, 0x0

    .line 26
    const/4 v3, 0x2

    .line 27
    const/4 v4, 0x0

    .line 28
    .line 29
    .line 30
    invoke-static {v0, v1, v2, v3, v4}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    .line 31
    move-result v1

    .line 32
    .line 33
    if-nez v1, :cond_2

    .line 34
    .line 35
    const-string v1, "/agora/"

    .line 36
    .line 37
    .line 38
    invoke-static {v0, v1, v2, v3, v4}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    .line 39
    move-result v0

    .line 40
    .line 41
    if-eqz v0, :cond_1

    .line 42
    goto :goto_0

    .line 43
    :cond_1
    move v0, v2

    .line 44
    goto :goto_1

    .line 45
    :cond_2
    :goto_0
    const/4 v0, 0x1

    .line 46
    .line 47
    :goto_1
    new-instance v1, Lcom/kubi/widget/web/helper/b0;

    .line 48
    .line 49
    .line 50
    invoke-direct {v1, p0, v0}, Lcom/kubi/widget/web/helper/b0;-><init>(Lcom/kubi/sdk/BaseActivity;Z)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1, v1}, Lcom/kubi/sdk/web/KWebView;->setWebPermission(Le10/b;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 57
    move-result-object v0

    .line 58
    .line 59
    const-string v1, "getIntent(...)"

    .line 60
    .line 61
    .line 62
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    .line 64
    const-string v1, "is_out_file"

    .line 65
    .line 66
    .line 67
    invoke-static {v0, v1, v2}, Lcom/kubi/router/utils/RouteExKt;->g(Landroid/content/Intent;Ljava/lang/String;Z)Z

    .line 68
    move-result v0

    .line 69
    .line 70
    if-eqz v0, :cond_3

    .line 71
    .line 72
    new-instance v0, Lcom/kubi/widget/web/helper/n;

    .line 73
    .line 74
    .line 75
    invoke-direct {v0, p0}, Lcom/kubi/widget/web/helper/n;-><init>(Lcom/kubi/sdk/BaseActivity;)V

    .line 76
    goto :goto_2

    .line 77
    .line 78
    :cond_3
    new-instance v0, Lcom/kubi/widget/web/helper/b;

    .line 79
    .line 80
    .line 81
    invoke-direct {v0, p0}, Lcom/kubi/widget/web/helper/b;-><init>(Lcom/kubi/sdk/BaseActivity;)V

    .line 82
    .line 83
    .line 84
    :goto_2
    invoke-virtual {p1, v0}, Lcom/kubi/sdk/web/KWebView;->setFileChooser(Le10/a;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0}, Lcom/kubi/widget/web/ui/KWebBaseActivity;->l0()Lcom/kubi/widget/web/ui/KWebContainer;

    .line 88
    move-result-object p1

    .line 89
    .line 90
    .line 91
    invoke-virtual {p1, p0}, Lcom/kubi/widget/web/ui/KWebContainer;->x(Lcom/kubi/sdk/BaseActivity;)V

    .line 92
    return-void
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
.end method
