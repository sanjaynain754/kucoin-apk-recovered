.class public Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl$a;
.super Ljava/lang/Object;
.source "RNCWebViewModuleImpl.java"

# interfaces
.implements Lcom/facebook/react/modules/core/PermissionListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;->getWebviewFileDownloaderPermissionListener(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/react/modules/core/PermissionListener;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;


# direct methods
.method public constructor <init>(Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl$a;->d:Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl$a;->b:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p3, p0, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl$a;->c:Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    return-void
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
.end method


# virtual methods
.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)Z
    .locals 1

    .line 1
    const/4 p2, 0x0

    .line 2
    const/4 v0, 0x1

    .line 3
    .line 4
    if-eq p1, v0, :cond_0

    .line 5
    return p2

    .line 6
    :cond_0
    array-length p1, p3

    .line 7
    .line 8
    if-lez p1, :cond_1

    .line 9
    .line 10
    aget p1, p3, p2

    .line 11
    .line 12
    if-nez p1, :cond_1

    .line 13
    .line 14
    iget-object p1, p0, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl$a;->d:Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;

    .line 15
    .line 16
    .line 17
    invoke-static {p1}, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;->b(Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;)Landroid/app/DownloadManager$Request;

    .line 18
    move-result-object p1

    .line 19
    .line 20
    if-eqz p1, :cond_2

    .line 21
    .line 22
    iget-object p1, p0, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl$a;->d:Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;

    .line 23
    .line 24
    iget-object p2, p0, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl$a;->b:Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, p2}, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;->downloadFile(Ljava/lang/String;)V

    .line 28
    goto :goto_0

    .line 29
    .line 30
    :cond_1
    iget-object p1, p0, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl$a;->d:Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;

    .line 31
    .line 32
    .line 33
    invoke-static {p1}, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;->a(Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;)Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 34
    move-result-object p1

    .line 35
    .line 36
    iget-object p2, p0, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl$a;->c:Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    invoke-static {p1, p2, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 40
    move-result-object p1

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 44
    :cond_2
    :goto_0
    return v0
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
.end method
