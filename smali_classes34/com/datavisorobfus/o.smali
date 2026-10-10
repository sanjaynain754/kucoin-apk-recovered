.class public Lcom/datavisorobfus/o;
.super Landroid/webkit/WebView;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/datavisorobfus/o$b;,
        Lcom/datavisorobfus/o$c;
    }
.end annotation


# instance fields
.field private final a:Lcom/datavisorobfus/o$c;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/datavisorobfus/o$c;)V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "AddJavascriptInterface",
            "SetJavaScriptEnabled"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    iput-object p2, p0, Lcom/datavisorobfus/o;->a:Lcom/datavisorobfus/o$c;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 9
    move-result-object p1

    .line 10
    const/4 p2, 0x1

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1, p2}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 14
    .line 15
    new-instance p1, Lcom/datavisorobfus/o$b;

    .line 16
    const/4 p2, 0x0

    .line 17
    .line 18
    .line 19
    invoke-direct {p1, p0, p2}, Lcom/datavisorobfus/o$b;-><init>(Lcom/datavisorobfus/o;Lcom/datavisorobfus/o$a;)V

    .line 20
    .line 21
    const-string p2, "dvCandidate"

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, p1, p2}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    new-instance p1, Lcom/datavisorobfus/o$a;

    .line 27
    .line 28
    .line 29
    invoke-direct {p1, p0}, Lcom/datavisorobfus/o$a;-><init>(Lcom/datavisorobfus/o;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, p1}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 33
    .line 34
    const-string p1, "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"

    .line 35
    .line 36
    .line 37
    invoke-static {p1}, Lcom/datavisor/vangogh/bridge/crypto;->convert(Ljava/lang/String;)Ljava/lang/String;

    .line 38
    move-result-object p1

    .line 39
    .line 40
    .line 41
    const-string/jumbo p2, "text/html"

    .line 42
    .line 43
    const-string v0, "UTF-8"

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, p1, p2, v0}, Landroid/webkit/WebView;->loadData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    return-void
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
.end method

.method public static synthetic a(Lcom/datavisorobfus/o;)Lcom/datavisorobfus/o$c;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/datavisorobfus/o;->a:Lcom/datavisorobfus/o$c;

    return-object p0
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 2
    const-string v0, "DVWRWebView now destroy itself"

    invoke-static {v0}, Lcom/datavisorobfus/f0;->a(Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_0
    invoke-virtual {p0}, Landroid/webkit/WebView;->stopLoading()V

    invoke-virtual {p0}, Landroid/webkit/WebView;->clearHistory()V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroid/webkit/WebView;->clearCache(Z)V

    const-string v0, "about:blank"

    invoke-virtual {p0, v0}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    invoke-virtual {p0}, Landroid/webkit/WebView;->destroy()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method
