.class public Lcom/reactnativecommunity/webview/RNCWebViewModule;
.super Lcom/reactnativecommunity/webview/NativeRNCWebViewModuleSpec;
.source "RNCWebViewModule.java"


# annotations
.annotation runtime Lcom/facebook/react/module/annotations/ReactModule;
    name = "RNCWebViewModule"
.end annotation


# instance fields
.field private final mRNCWebViewModuleImpl:Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;


# direct methods
.method public constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/reactnativecommunity/webview/NativeRNCWebViewModuleSpec;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 4
    .line 5
    new-instance v0, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, p1}, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/reactnativecommunity/webview/RNCWebViewModule;->mRNCWebViewModuleImpl:Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;

    .line 11
    return-void
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


# virtual methods
.method public downloadFile(Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/reactnativecommunity/webview/RNCWebViewModule;->mRNCWebViewModuleImpl:Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;->downloadFile(Ljava/lang/String;)V

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
    .line 24
    .line 25
.end method

.method public getName()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "RNCWebViewModule"

    .line 3
    return-object v0
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
.end method

.method public grantFileDownloaderPermissions(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/reactnativecommunity/webview/RNCWebViewModule;->mRNCWebViewModuleImpl:Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;->grantFileDownloaderPermissions(Ljava/lang/String;Ljava/lang/String;)Z

    .line 6
    move-result p1

    .line 7
    return p1
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
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public isFileUploadSupported(Lcom/facebook/react/bridge/Promise;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/reactnativecommunity/webview/RNCWebViewModule;->mRNCWebViewModuleImpl:Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;->isFileUploadSupported()Z

    .line 6
    move-result v0

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    .line 13
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 14
    return-void
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

.method public setDownloadRequest(Landroid/app/DownloadManager$Request;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/reactnativecommunity/webview/RNCWebViewModule;->mRNCWebViewModuleImpl:Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;->setDownloadRequest(Landroid/app/DownloadManager$Request;)V

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
    .line 24
    .line 25
.end method

.method public shouldStartLoadWithLockIdentifier(ZD)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/reactnativecommunity/webview/RNCWebViewModule;->mRNCWebViewModuleImpl:Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1, p2, p3}, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;->shouldStartLoadWithLockIdentifier(ZD)V

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
.end method

.method public startPhotoPickerIntent(Landroid/webkit/ValueCallback;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/webkit/ValueCallback<",
            "Landroid/net/Uri;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/reactnativecommunity/webview/RNCWebViewModule;->mRNCWebViewModuleImpl:Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;

    invoke-virtual {v0, p2, p1}, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;->startPhotoPickerIntent(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    return-void
.end method

.method public startPhotoPickerIntent(Landroid/webkit/ValueCallback;[Ljava/lang/String;ZZ)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/webkit/ValueCallback<",
            "[",
            "Landroid/net/Uri;",
            ">;[",
            "Ljava/lang/String;",
            "ZZ)Z"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lcom/reactnativecommunity/webview/RNCWebViewModule;->mRNCWebViewModuleImpl:Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;

    invoke-virtual {v0, p2, p3, p1, p4}, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;->startPhotoPickerIntent([Ljava/lang/String;ZLandroid/webkit/ValueCallback;Z)Z

    move-result p1

    return p1
.end method
