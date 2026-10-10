.class public final Lcom/geetest/captcha/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lcom/geetest/captcha/l;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public b:Lcom/geetest/captcha/views/GTC4WebView;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public c:Lcom/geetest/captcha/views/a;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final d:Lcom/geetest/captcha/GTCaptcha4Client$OnDialogShowListener;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/geetest/captcha/GTCaptcha4Client$OnDialogShowListener;)V
    .locals 0
    .param p1    # Lcom/geetest/captcha/GTCaptcha4Client$OnDialogShowListener;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/geetest/captcha/e;->d:Lcom/geetest/captcha/GTCaptcha4Client$OnDialogShowListener;

    .line 6
    return-void
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
.end method

.method public static final a(Lcom/geetest/captcha/d0;)V
    .locals 1

    const-string v0, "$webViewObserver"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 174
    invoke-interface {p0}, Lcom/geetest/captcha/d0;->b()V

    return-void
.end method

.method public static final a(Lcom/geetest/captcha/e;Landroid/content/Context;Lcom/geetest/captcha/d;Lcom/geetest/captcha/d0;)V
    .locals 1

    const-string/jumbo v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$dataBean"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$webViewObserver"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 154
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    iget-object v0, p2, Lcom/geetest/captcha/d;->l:Ljava/lang/String;

    .line 156
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 157
    new-instance p2, Lcom/geetest/captcha/l;

    invoke-direct {p2, p1}, Lcom/geetest/captcha/l;-><init>(Landroid/content/Context;)V

    goto :goto_0

    .line 158
    :cond_0
    iget-object p2, p2, Lcom/geetest/captcha/d;->l:Ljava/lang/String;

    if-eqz p2, :cond_1

    .line 159
    new-instance v0, Lcom/geetest/captcha/l;

    invoke-direct {v0, p1, p2}, Lcom/geetest/captcha/l;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    move-object p2, v0

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    .line 160
    :goto_0
    iput-object p2, p0, Lcom/geetest/captcha/e;->a:Lcom/geetest/captcha/l;

    if-eqz p2, :cond_2

    .line 161
    iget-object p1, p0, Lcom/geetest/captcha/e;->d:Lcom/geetest/captcha/GTCaptcha4Client$OnDialogShowListener;

    .line 162
    iput-object p1, p2, Lcom/geetest/captcha/l;->b:Lcom/geetest/captcha/GTCaptcha4Client$OnDialogShowListener;

    :cond_2
    if-eqz p2, :cond_3

    .line 163
    iget-object p1, p0, Lcom/geetest/captcha/e;->b:Lcom/geetest/captcha/views/GTC4WebView;

    .line 164
    iput-object p1, p2, Lcom/geetest/captcha/l;->a:Landroid/view/View;

    .line 165
    :cond_3
    invoke-static {p2, p3}, Lcom/geetest/captcha/e;->a(Lcom/geetest/captcha/l;Lcom/geetest/captcha/d0;)V

    .line 166
    iget-object p0, p0, Lcom/geetest/captcha/e;->a:Lcom/geetest/captcha/l;

    if-eqz p0, :cond_4

    invoke-virtual {p0}, Lcom/geetest/captcha/l;->show()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    .line 167
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_4
    return-void
.end method

.method public static final a(Lcom/geetest/captcha/e;Lcom/geetest/captcha/l;)V
    .locals 1

    const-string/jumbo v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$this_apply"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 186
    iget-object p0, p0, Lcom/geetest/captcha/e;->b:Lcom/geetest/captcha/views/GTC4WebView;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/webkit/WebView;->destroy()V

    .line 187
    :cond_0
    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    return-void
.end method

.method public static a(Lcom/geetest/captcha/l;Lcom/geetest/captcha/d0;)V
    .locals 2

    if-eqz p0, :cond_0

    .line 168
    new-instance v0, Lcom/geetest/captcha/g0;

    invoke-direct {v0, p1}, Lcom/geetest/captcha/g0;-><init>(Lcom/geetest/captcha/d0;)V

    invoke-virtual {p0, v0}, Landroid/app/Dialog;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)V

    .line 169
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-lt v0, v1, :cond_1

    if-eqz p0, :cond_1

    .line 170
    invoke-static {p0}, Lcom/geetest/captcha/f0;->a(Landroid/app/Dialog;)Landroid/window/OnBackInvokedDispatcher;

    move-result-object p0

    if-eqz p0, :cond_1

    new-instance v0, Lcom/geetest/captcha/h0;

    invoke-direct {v0, p1}, Lcom/geetest/captcha/h0;-><init>(Lcom/geetest/captcha/d0;)V

    const p1, 0xf4240

    invoke-static {p0, p1, v0}, Landroidx/appcompat/app/j;->a(Landroid/window/OnBackInvokedDispatcher;ILandroid/window/OnBackInvokedCallback;)V

    :cond_1
    return-void
.end method

.method public static final a(Ljava/lang/String;)V
    .locals 3

    .line 175
    sget-object v0, Lcom/geetest/captcha/utils/LogUtils;->a:Lcom/geetest/captcha/utils/LogUtils;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "DialogController javascript:jsBridge.callback(\'showBox\') return: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/geetest/captcha/utils/LogUtils;->release(Ljava/lang/String;)V

    return-void
.end method

.method public static final a(Lcom/geetest/captcha/d0;Landroid/content/DialogInterface;ILandroid/view/KeyEvent;)Z
    .locals 0

    const-string p1, "$webViewObserver"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x4

    if-ne p2, p1, :cond_0

    if-eqz p3, :cond_0

    .line 171
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getRepeatCount()I

    move-result p1

    if-nez p1, :cond_0

    .line 172
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    move-result p1

    const/4 p2, 0x1

    if-ne p1, p2, :cond_0

    .line 173
    invoke-interface {p0}, Lcom/geetest/captcha/d0;->b()V

    :cond_0
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final a()V
    .locals 4

    .line 176
    :try_start_0
    iget-object v0, p0, Lcom/geetest/captcha/e;->a:Lcom/geetest/captcha/l;

    if-eqz v0, :cond_4

    .line 177
    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 178
    iget-object v1, p0, Lcom/geetest/captcha/e;->b:Lcom/geetest/captcha/views/GTC4WebView;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_3

    check-cast v1, Landroid/app/Activity;

    .line 179
    invoke-virtual {v1}, Landroid/app/Activity;->isFinishing()Z

    move-result v2

    if-nez v2, :cond_4

    invoke-virtual {v1}, Landroid/app/Activity;->isDestroyed()Z

    move-result v2

    if-nez v2, :cond_4

    .line 180
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 181
    new-instance v2, Lcom/geetest/captcha/k0;

    invoke-direct {v2, p0, v0}, Lcom/geetest/captcha/k0;-><init>(Lcom/geetest/captcha/e;Lcom/geetest/captcha/l;)V

    invoke-virtual {v1, v2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void

    .line 182
    :cond_1
    iget-object v1, p0, Lcom/geetest/captcha/e;->b:Lcom/geetest/captcha/views/GTC4WebView;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Landroid/webkit/WebView;->destroy()V

    .line 183
    :cond_2
    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    return-void

    .line 184
    :cond_3
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "null cannot be cast to non-null type android.app.Activity"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 185
    :goto_1
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_4
    return-void
.end method

.method public final a(Landroid/content/Context;Lcom/geetest/captcha/d;Lcom/geetest/captcha/b0$a;)V
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/geetest/captcha/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/geetest/captcha/b0$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dataBean"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "webViewObserver"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 134
    :try_start_0
    new-instance v0, Lcom/geetest/captcha/c0;

    invoke-direct {v0}, Lcom/geetest/captcha/c0;-><init>()V

    .line 135
    invoke-virtual {v0, p3}, Lcom/geetest/captcha/c0;->a(Lcom/geetest/captcha/d0;)V

    .line 136
    iget-object v1, p0, Lcom/geetest/captcha/e;->b:Lcom/geetest/captcha/views/GTC4WebView;

    if-eqz v1, :cond_0

    invoke-virtual {v1, v0}, Lcom/geetest/captcha/views/GTC4WebView;->setWebViewObservable(Lcom/geetest/captcha/c0;)V

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_2

    .line 137
    :cond_0
    :goto_0
    iget-object v1, p0, Lcom/geetest/captcha/e;->c:Lcom/geetest/captcha/views/a;

    if-eqz v1, :cond_1

    invoke-virtual {v1, v0}, Lcom/geetest/captcha/views/a;->a(Lcom/geetest/captcha/c0;)V

    .line 138
    :cond_1
    iget-boolean v0, p2, Lcom/geetest/captcha/d;->i:Z

    if-eqz v0, :cond_2

    goto :goto_3

    .line 139
    :cond_2
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 140
    move-object v0, p1

    check-cast v0, Landroid/app/Activity;

    new-instance v1, Lcom/geetest/captcha/j0;

    invoke-direct {v1, p0, p1, p2, p3}, Lcom/geetest/captcha/j0;-><init>(Lcom/geetest/captcha/e;Landroid/content/Context;Lcom/geetest/captcha/d;Lcom/geetest/captcha/d0;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void

    .line 141
    :cond_3
    iget-object v0, p2, Lcom/geetest/captcha/d;->l:Ljava/lang/String;

    .line 142
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 143
    new-instance p2, Lcom/geetest/captcha/l;

    invoke-direct {p2, p1}, Lcom/geetest/captcha/l;-><init>(Landroid/content/Context;)V

    goto :goto_1

    .line 144
    :cond_4
    iget-object p2, p2, Lcom/geetest/captcha/d;->l:Ljava/lang/String;

    if-eqz p2, :cond_5

    .line 145
    new-instance v0, Lcom/geetest/captcha/l;

    invoke-direct {v0, p1, p2}, Lcom/geetest/captcha/l;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    move-object p2, v0

    goto :goto_1

    :cond_5
    const/4 p2, 0x0

    .line 146
    :goto_1
    iput-object p2, p0, Lcom/geetest/captcha/e;->a:Lcom/geetest/captcha/l;

    if-eqz p2, :cond_6

    .line 147
    iget-object p1, p0, Lcom/geetest/captcha/e;->d:Lcom/geetest/captcha/GTCaptcha4Client$OnDialogShowListener;

    .line 148
    iput-object p1, p2, Lcom/geetest/captcha/l;->b:Lcom/geetest/captcha/GTCaptcha4Client$OnDialogShowListener;

    :cond_6
    if-eqz p2, :cond_7

    .line 149
    iget-object p1, p0, Lcom/geetest/captcha/e;->b:Lcom/geetest/captcha/views/GTC4WebView;

    .line 150
    iput-object p1, p2, Lcom/geetest/captcha/l;->a:Landroid/view/View;

    .line 151
    :cond_7
    invoke-static {p2, p3}, Lcom/geetest/captcha/e;->a(Lcom/geetest/captcha/l;Lcom/geetest/captcha/d0;)V

    .line 152
    iget-object p1, p0, Lcom/geetest/captcha/e;->a:Lcom/geetest/captcha/l;

    if-eqz p1, :cond_8

    invoke-virtual {p1}, Lcom/geetest/captcha/l;->show()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 153
    :goto_2
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_8
    :goto_3
    return-void
.end method

.method public final a(Landroid/content/Context;Lcom/geetest/captcha/d;Lcom/geetest/captcha/d0;)V
    .locals 25
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/geetest/captcha/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/geetest/captcha/d0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    const-string v5, "mi"

    const-string v6, "displayMode"

    const-string v7, "context"

    invoke-static {v2, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dataBean"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "webViewObserver"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v8, Lcom/geetest/captcha/c0;

    invoke-direct {v8}, Lcom/geetest/captcha/c0;-><init>()V

    .line 2
    invoke-virtual {v8, v4}, Lcom/geetest/captcha/c0;->a(Lcom/geetest/captcha/d0;)V

    .line 3
    iget-object v0, v3, Lcom/geetest/captcha/d;->b:Ljava/lang/String;

    .line 4
    invoke-static {v0}, Lcom/geetest/captcha/t$a;->a(Ljava/lang/String;)Lcom/geetest/captcha/t;

    move-result-object v0

    const-string v9, "description"

    if-nez v0, :cond_0

    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/geetest/captcha/i;->PARAM:Lcom/geetest/captcha/i;

    invoke-virtual {v2}, Lcom/geetest/captcha/i;->getType()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "75"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 6
    sget-object v2, Lcom/geetest/captcha/j;->e:Ljava/lang/String;

    .line 7
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 8
    const-string v5, "Address configuration error"

    invoke-virtual {v3, v9, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 9
    sget-object v5, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 10
    invoke-interface {v4, v0, v2, v3}, Lcom/geetest/captcha/d0;->a(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void

    .line 11
    :cond_0
    iget-object v10, v0, Lcom/geetest/captcha/t;->a:Ljava/lang/String;

    iget-object v11, v0, Lcom/geetest/captcha/t;->b:Ljava/util/Map;

    .line 12
    const-string v0, "baseUrl"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    new-instance v12, Lorg/json/JSONObject;

    invoke-direct {v12}, Lorg/json/JSONObject;-><init>()V

    .line 14
    sget-object v0, Lcom/geetest/captcha/f;->CENTER:Lcom/geetest/captcha/f;

    invoke-virtual {v0}, Lcom/geetest/captcha/f;->getValue()Ljava/lang/String;

    move-result-object v0

    const-string v13, "displayArea"

    invoke-virtual {v12, v13, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 15
    const-string/jumbo v0, "protocol"

    const-string v13, "https://"

    invoke-virtual {v12, v0, v13}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 16
    const-string v0, "loading"

    const-string v13, "./gt4-loading.gif"

    invoke-virtual {v12, v0, v13}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 17
    iget-object v0, v3, Lcom/geetest/captcha/d;->g:Ljava/util/Map;

    .line 18
    sget-object v13, Lcom/geetest/captcha/utils/LogUtils;->a:Lcom/geetest/captcha/utils/LogUtils;

    new-instance v14, Ljava/lang/StringBuilder;

    const-string v15, "Config Params: "

    invoke-direct {v14, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v13, v14}, Lcom/geetest/captcha/utils/LogUtils;->d(Ljava/lang/String;)V

    if-eqz v0, :cond_9

    .line 19
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v15

    if-eqz v15, :cond_1

    goto/16 :goto_3

    .line 20
    :cond_1
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v15, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v16

    if-eqz v16, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v16

    check-cast v16, Ljava/util/Map$Entry;

    invoke-interface/range {v16 .. v16}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v17

    move-object/from16 v13, v17

    check-cast v13, Ljava/lang/String;

    invoke-interface/range {v16 .. v16}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v14

    move-object/from16 v16, v0

    .line 21
    const-string/jumbo v0, "xid"

    invoke-static {v0, v13}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_3

    .line 22
    new-instance v13, Ljava/util/HashMap;

    invoke-direct {v13}, Ljava/util/HashMap;-><init>()V

    move-object/from16 v19, v15

    if-eqz v14, :cond_2

    .line 23
    instance-of v15, v14, Lorg/json/JSONObject;

    if-eqz v15, :cond_2

    .line 24
    invoke-virtual {v13, v0, v14}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    :cond_2
    sput-object v13, Lcom/geetest/captcha/c;->a:Ljava/util/Map;

    goto :goto_2

    :cond_3
    move-object/from16 v19, v15

    .line 26
    const-string v0, "_gee_info"

    invoke-static {v0, v13}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    if-eqz v14, :cond_7

    .line 27
    instance-of v0, v14, Lorg/json/JSONObject;

    if-eqz v0, :cond_7

    .line 28
    move-object v15, v14

    check-cast v15, Lorg/json/JSONObject;

    .line 29
    const-string v23, "build"

    .line 30
    const-string v24, "clientVersion"

    const-string v19, "geeid"

    const-string v20, "packageName"

    const-string v21, "displayName"

    const-string v22, "appVer"

    filled-new-array/range {v19 .. v24}, [Ljava/lang/String;

    move-result-object v0

    const/4 v13, 0x0

    :goto_1
    const/4 v14, 0x6

    if-ge v13, v14, :cond_5

    .line 31
    aget-object v14, v0, v13

    .line 32
    invoke-virtual {v15, v14}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v19

    if-eqz v19, :cond_4

    .line 33
    invoke-virtual {v15, v14}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    :cond_4
    add-int/lit8 v13, v13, 0x1

    goto :goto_1

    :cond_5
    move-object/from16 v0, v16

    goto :goto_0

    .line 34
    :cond_6
    invoke-virtual {v12, v13, v14}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_7
    :goto_2
    move-object/from16 v0, v16

    move-object/from16 v15, v19

    goto :goto_0

    :cond_8
    move-object/from16 v19, v15

    goto :goto_4

    :cond_9
    :goto_3
    const/4 v15, 0x0

    :goto_4
    if-eqz v11, :cond_b

    .line 35
    invoke-interface {v11}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/util/Map$Entry;

    invoke-interface {v13}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/String;

    invoke-interface {v13}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/String;

    .line 36
    invoke-virtual {v12, v14, v13}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_5

    .line 37
    :cond_a
    invoke-interface {v11}, Ljava/util/Map;->clear()V

    .line 38
    :cond_b
    iget-object v0, v3, Lcom/geetest/captcha/d;->a:Ljava/lang/String;

    const-string v13, "captchaId"

    if-eqz v0, :cond_c

    goto :goto_6

    :cond_c
    invoke-static {v13}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 39
    :goto_6
    invoke-virtual {v12, v13, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 40
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v13, "challenge"

    invoke-virtual {v12, v13, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 41
    iget-boolean v0, v3, Lcom/geetest/captcha/d;->c:Z

    .line 42
    const-string v13, "debug"

    invoke-virtual {v12, v13, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 43
    iget-object v0, v3, Lcom/geetest/captcha/d;->d:Ljava/lang/String;

    const-string v13, "language"

    if-eqz v0, :cond_e

    .line 44
    invoke-static {v0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_d

    goto :goto_7

    .line 45
    :cond_d
    iget-object v0, v3, Lcom/geetest/captcha/d;->d:Ljava/lang/String;

    .line 46
    invoke-virtual {v12, v13, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-object/from16 v16, v9

    goto :goto_8

    .line 47
    :cond_e
    :goto_7
    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Configuration;->getLocales()Landroid/os/LocaleList;

    move-result-object v0

    const/4 v14, 0x0

    invoke-virtual {v0, v14}, Landroid/os/LocaleList;->get(I)Ljava/util/Locale;

    move-result-object v0

    .line 48
    const-string/jumbo v14, "{\n                contex\u2026.locales[0]\n            }"

    invoke-static {v0, v14}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v16, v0

    invoke-virtual/range {v16 .. v16}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0x2d

    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual/range {v16 .. v16}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v0

    const-string v4, "locale.country"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v4, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    move-object/from16 v16, v9

    const-string v9, "ROOT"

    invoke-static {v4, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string/jumbo v4, "this as java.lang.String).toLowerCase(locale)"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v12, v13, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 50
    :goto_8
    iget-object v0, v3, Lcom/geetest/captcha/d;->e:[Ljava/lang/String;

    if-eqz v0, :cond_11

    .line 51
    array-length v0, v0

    if-nez v0, :cond_f

    goto :goto_a

    .line 52
    :cond_f
    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 53
    iget-object v4, v3, Lcom/geetest/captcha/d;->e:[Ljava/lang/String;

    .line 54
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    array-length v9, v4

    const/4 v13, 0x0

    :goto_9
    if-ge v13, v9, :cond_10

    aget-object v14, v4, v13

    .line 55
    invoke-virtual {v0, v14}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    add-int/lit8 v13, v13, 0x1

    goto :goto_9

    .line 56
    :cond_10
    const-string v4, "apiServers"

    invoke-virtual {v12, v4, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 57
    :cond_11
    :goto_a
    iget-object v0, v3, Lcom/geetest/captcha/d;->f:[Ljava/lang/String;

    if-eqz v0, :cond_14

    .line 58
    array-length v0, v0

    if-nez v0, :cond_12

    goto :goto_c

    .line 59
    :cond_12
    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 60
    iget-object v4, v3, Lcom/geetest/captcha/d;->f:[Ljava/lang/String;

    .line 61
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    array-length v9, v4

    const/4 v13, 0x0

    :goto_b
    if-ge v13, v9, :cond_13

    aget-object v14, v4, v13

    .line 62
    invoke-virtual {v0, v14}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    add-int/lit8 v13, v13, 0x1

    goto :goto_b

    .line 63
    :cond_13
    const-string/jumbo v4, "staticServers"

    invoke-virtual {v12, v4, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 64
    :cond_14
    :goto_c
    iget v0, v3, Lcom/geetest/captcha/d;->j:I

    .line 65
    const-string/jumbo v4, "timeout"

    invoke-virtual {v12, v4, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 66
    const-string v0, "clientVersion"

    const-string v4, "1.8.9"

    invoke-virtual {v12, v0, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 67
    const-string v9, "clientType"

    const-string v13, "android"

    invoke-virtual {v12, v9, v13}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 68
    new-instance v9, Lorg/json/JSONObject;

    invoke-direct {v9}, Lorg/json/JSONObject;-><init>()V

    .line 69
    iget-boolean v13, v3, Lcom/geetest/captcha/d;->h:Z

    .line 70
    const-string v14, "outside"

    invoke-virtual {v9, v14, v13}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 71
    const-string v13, "mask"

    invoke-virtual {v12, v13, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 72
    :try_start_0
    new-instance v9, Lorg/json/JSONObject;

    invoke-direct {v9}, Lorg/json/JSONObject;-><init>()V

    .line 73
    const-string v13, "geeid"

    new-instance v14, Lorg/json/JSONObject;

    .line 74
    invoke-static {v2}, Lcom/geetest/captcha/n;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    .line 75
    invoke-direct {v14, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v13, v14}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 76
    const-string v1, "packageName"

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v9, v1, v13}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 77
    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v13

    const/4 v14, 0x0

    invoke-virtual {v1, v13, v14}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v1

    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v13

    invoke-virtual {v1, v13}, Landroid/content/pm/PackageItemInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;

    move-result-object v1

    const-string v13, "context.packageManager.g\u2026l(context.packageManager)"

    invoke-static {v1, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v13

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v14

    move-object/from16 v18, v1

    const/4 v1, 0x0

    invoke-virtual {v13, v14, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v1

    .line 79
    const-string v13, "displayName"

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-static {v14}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v9, v13, v14}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 80
    const-string v13, "appVer"

    iget-object v14, v1, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    invoke-virtual {v9, v13, v14}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 81
    const-string v13, "build"

    iget v1, v1, Landroid/content/pm/PackageInfo;->versionCode:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v9, v13, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 82
    invoke-virtual {v9, v0, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    if-eqz v15, :cond_15

    .line 83
    invoke-virtual {v15}, Lorg/json/JSONObject;->length()I

    move-result v0

    if-lez v0, :cond_15

    .line 84
    invoke-virtual {v15}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v0

    .line 85
    const-string v1, "keys"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_15

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 86
    invoke-virtual {v15, v1}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v9, v1, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_d

    :catch_0
    move-exception v0

    goto :goto_e

    .line 87
    :cond_15
    invoke-virtual {v12, v5, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_f

    .line 88
    :goto_e
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 89
    :goto_f
    :try_start_1
    invoke-virtual {v12, v6}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_16

    .line 90
    invoke-virtual {v12, v6}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Ljava/lang/Integer;

    if-eqz v0, :cond_18

    invoke-virtual {v12, v6}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lcom/geetest/captcha/g;->AUTO:Lcom/geetest/captcha/g;

    invoke-virtual {v1}, Lcom/geetest/captcha/g;->getValue()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_18

    goto :goto_10

    :catch_1
    move-exception v0

    goto :goto_12

    .line 91
    :cond_16
    :goto_10
    invoke-static {v2, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 92
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 v0, v0, 0x30

    const/16 v1, 0x20

    if-ne v0, v1, :cond_17

    .line 93
    sget-object v0, Lcom/geetest/captcha/g;->DARK:Lcom/geetest/captcha/g;

    goto :goto_11

    :cond_17
    sget-object v0, Lcom/geetest/captcha/g;->NORMAL:Lcom/geetest/captcha/g;

    :goto_11
    invoke-virtual {v0}, Lcom/geetest/captcha/g;->getValue()I

    move-result v0

    invoke-virtual {v12, v6, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_13

    .line 94
    :goto_12
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 95
    :cond_18
    :goto_13
    sget-object v0, Lcom/geetest/captcha/utils/LogUtils;->a:Lcom/geetest/captcha/utils/LogUtils;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "BaseURL: "

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 96
    iget-object v6, v3, Lcom/geetest/captcha/d;->b:Ljava/lang/String;

    .line 97
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, ", Parameter: "

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/geetest/captcha/utils/LogUtils;->d(Ljava/lang/String;)V

    .line 98
    new-instance v1, Lorg/json/JSONObject;

    invoke-virtual {v12}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v1, v7}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 99
    invoke-virtual {v1, v5}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_19

    .line 100
    invoke-virtual {v1, v5}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    .line 101
    :cond_19
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 102
    iget-object v4, v3, Lcom/geetest/captcha/d;->b:Ljava/lang/String;

    .line 103
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/geetest/captcha/utils/LogUtils;->release(Ljava/lang/String;)V

    .line 104
    invoke-virtual {v12}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 105
    const-string v1, "name"

    const-string v4, "data"

    invoke-static {v4, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz v11, :cond_1a

    .line 106
    invoke-interface {v11, v4, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    :cond_1a
    :try_start_2
    new-instance v0, Lcom/geetest/captcha/views/a$a;

    invoke-direct {v0}, Lcom/geetest/captcha/views/a$a;-><init>()V

    if-eqz v11, :cond_1d

    .line 108
    invoke-interface {v11}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1b

    goto :goto_15

    .line 109
    :cond_1b
    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    .line 110
    invoke-virtual {v1, v10}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const/16 v4, 0x3f

    invoke-virtual {v1, v4}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 111
    invoke-interface {v11}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_14
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1c

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map$Entry;

    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    .line 112
    invoke-virtual {v1, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const/16 v6, 0x3d

    invoke-virtual {v1, v6}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const/16 v5, 0x26

    invoke-virtual {v1, v5}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    goto :goto_14

    :catch_2
    move-exception v0

    move-object/from16 v1, p0

    goto :goto_16

    .line 113
    :cond_1c
    invoke-virtual {v1}, Ljava/lang/StringBuffer;->length()I

    move-result v4

    add-int/lit8 v4, v4, -0x1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuffer;->deleteCharAt(I)Ljava/lang/StringBuffer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v10

    .line 114
    const-string/jumbo v1, "{\n            val sb = S\u2026- 1).toString()\n        }"

    invoke-static {v10, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 115
    :cond_1d
    :goto_15
    const-string/jumbo v1, "url"

    invoke-static {v10, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 116
    const-string v1, "<set-?>"

    invoke-static {v10, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 117
    iput-object v10, v0, Lcom/geetest/captcha/views/a$a;->a:Ljava/lang/String;

    .line 118
    invoke-virtual {v0, v2, v8, v3}, Lcom/geetest/captcha/views/a$a;->a(Landroid/content/Context;Lcom/geetest/captcha/c0;Lcom/geetest/captcha/d;)Lcom/geetest/captcha/views/a$a;

    move-result-object v0

    .line 119
    new-instance v1, Lcom/geetest/captcha/views/a;

    .line 120
    invoke-direct {v1, v0}, Lcom/geetest/captcha/views/a;-><init>(Lcom/geetest/captcha/views/a$a;)V

    .line 121
    invoke-virtual {v1}, Lcom/geetest/captcha/views/a;->a()Lcom/geetest/captcha/views/a;

    move-result-object v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    move-object/from16 v1, p0

    .line 122
    :try_start_3
    iput-object v0, v1, Lcom/geetest/captcha/e;->c:Lcom/geetest/captcha/views/a;

    .line 123
    iget-object v0, v0, Lcom/geetest/captcha/views/a;->c:Lcom/geetest/captcha/views/GTC4WebView;

    .line 124
    iput-object v0, v1, Lcom/geetest/captcha/e;->b:Lcom/geetest/captcha/views/GTC4WebView;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    goto :goto_17

    :catch_3
    move-exception v0

    .line 125
    :goto_16
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 126
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1e

    .line 127
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lcom/geetest/captcha/i;->WEB_VIEW_NEW:Lcom/geetest/captcha/i;

    invoke-virtual {v3}, Lcom/geetest/captcha/i;->getType()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "99"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 128
    sget-object v3, Lcom/geetest/captcha/j;->g:Ljava/lang/String;

    .line 129
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 130
    const-string v5, "Device not supported"

    move-object/from16 v6, v16

    invoke-virtual {v4, v6, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 131
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    const-string v5, "exception"

    invoke-virtual {v4, v5, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 132
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    move-object/from16 v5, p3

    .line 133
    invoke-interface {v5, v2, v3, v4}, Lcom/geetest/captcha/d0;->a(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V

    :cond_1e
    :goto_17
    return-void
.end method

.method public final b()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/geetest/captcha/e;->b:Lcom/geetest/captcha/views/GTC4WebView;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    new-instance v1, Lcom/geetest/captcha/i0;

    .line 7
    .line 8
    .line 9
    invoke-direct {v1}, Lcom/geetest/captcha/i0;-><init>()V

    .line 10
    .line 11
    const-string v2, "javascript:jsBridge.callback(\'showBox\')"

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v2, v1}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    .line 15
    :cond_0
    return-void
    .line 16
    .line 17
    .line 18
.end method
