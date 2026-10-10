.class public final Lcom/geetest/captcha/views/a$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/geetest/captcha/views/a;->a()Lcom/geetest/captcha/views/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/geetest/captcha/views/a;


# direct methods
.method public constructor <init>(Lcom/geetest/captcha/views/a;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/geetest/captcha/views/a$c;->this$0:Lcom/geetest/captcha/views/a;

    .line 3
    const/4 p1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 7
    return-void
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


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/geetest/captcha/views/a$c;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 5

    .line 2
    iget-object v0, p0, Lcom/geetest/captcha/views/a$c;->this$0:Lcom/geetest/captcha/views/a;

    new-instance v1, Lcom/geetest/captcha/views/a$b;

    .line 3
    iget-object v2, v0, Lcom/geetest/captcha/views/a;->a:Ljava/lang/String;

    .line 4
    iget-object v3, v0, Lcom/geetest/captcha/views/a;->c:Lcom/geetest/captcha/views/GTC4WebView;

    .line 5
    iget-object v4, v0, Lcom/geetest/captcha/views/a;->b:Lcom/geetest/captcha/c0;

    .line 6
    invoke-direct {v1, v2, v3, v4}, Lcom/geetest/captcha/views/a$b;-><init>(Ljava/lang/String;Lcom/geetest/captcha/views/GTC4WebView;Lcom/geetest/captcha/c0;)V

    .line 7
    iput-object v1, v0, Lcom/geetest/captcha/views/a;->d:Lcom/geetest/captcha/views/a$b;

    .line 8
    iget-object v0, p0, Lcom/geetest/captcha/views/a$c;->this$0:Lcom/geetest/captcha/views/a;

    .line 9
    iget-object v1, v0, Lcom/geetest/captcha/views/a;->c:Lcom/geetest/captcha/views/GTC4WebView;

    .line 10
    iget-object v0, v0, Lcom/geetest/captcha/views/a;->d:Lcom/geetest/captcha/views/a$b;

    if-nez v0, :cond_0

    .line 11
    const-string v0, "jsInterface"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    const-string v2, "JSInterface"

    invoke-virtual {v1, v0, v2}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    iget-object v0, p0, Lcom/geetest/captcha/views/a$c;->this$0:Lcom/geetest/captcha/views/a;

    .line 13
    iget-object v0, v0, Lcom/geetest/captcha/views/a;->c:Lcom/geetest/captcha/views/GTC4WebView;

    .line 14
    invoke-virtual {v0}, Landroid/view/View;->buildLayer()V

    .line 15
    iget-object v0, p0, Lcom/geetest/captcha/views/a$c;->this$0:Lcom/geetest/captcha/views/a;

    .line 16
    iget-object v1, v0, Lcom/geetest/captcha/views/a;->c:Lcom/geetest/captcha/views/GTC4WebView;

    .line 17
    iget-object v0, v0, Lcom/geetest/captcha/views/a;->a:Ljava/lang/String;

    .line 18
    invoke-virtual {v1, v0}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 19
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v1, -0x1

    invoke-direct {v0, v1, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 20
    iget-object v1, p0, Lcom/geetest/captcha/views/a$c;->this$0:Lcom/geetest/captcha/views/a;

    .line 21
    iget-object v1, v1, Lcom/geetest/captcha/views/a;->c:Lcom/geetest/captcha/views/GTC4WebView;

    .line 22
    invoke-virtual {v1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method
