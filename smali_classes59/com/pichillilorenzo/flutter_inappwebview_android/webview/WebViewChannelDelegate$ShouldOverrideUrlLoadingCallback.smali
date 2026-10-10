.class public Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegate$ShouldOverrideUrlLoadingCallback;
.super Lcom/pichillilorenzo/flutter_inappwebview_android/types/BaseCallbackResultImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegate;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ShouldOverrideUrlLoadingCallback"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/pichillilorenzo/flutter_inappwebview_android/types/BaseCallbackResultImpl<",
        "Lcom/pichillilorenzo/flutter_inappwebview_android/types/NavigationActionPolicy;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/pichillilorenzo/flutter_inappwebview_android/types/BaseCallbackResultImpl;-><init>()V

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


# virtual methods
.method public decodeResult(Ljava/lang/Object;)Lcom/pichillilorenzo/flutter_inappwebview_android/types/NavigationActionPolicy;
    .locals 1

    .line 2
    instance-of v0, p1, Ljava/lang/Integer;

    if-eqz v0, :cond_0

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    goto :goto_0

    :cond_0
    sget-object p1, Lcom/pichillilorenzo/flutter_inappwebview_android/types/NavigationActionPolicy;->CANCEL:Lcom/pichillilorenzo/flutter_inappwebview_android/types/NavigationActionPolicy;

    invoke-virtual {p1}, Lcom/pichillilorenzo/flutter_inappwebview_android/types/NavigationActionPolicy;->rawValue()I

    move-result p1

    .line 3
    :goto_0
    invoke-static {p1}, Lcom/pichillilorenzo/flutter_inappwebview_android/types/NavigationActionPolicy;->fromValue(I)Lcom/pichillilorenzo/flutter_inappwebview_android/types/NavigationActionPolicy;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic decodeResult(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/WebViewChannelDelegate$ShouldOverrideUrlLoadingCallback;->decodeResult(Ljava/lang/Object;)Lcom/pichillilorenzo/flutter_inappwebview_android/types/NavigationActionPolicy;

    move-result-object p1

    return-object p1
.end method
