.class public Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;
.super Ljava/lang/Object;
.source "RNCWebViewModuleImpl.java"

# interfaces
.implements Lcom/facebook/react/bridge/ActivityEventListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl$ShouldOverrideUrlLoadingLock;,
        Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl$MimeType;
    }
.end annotation


# static fields
.field public static final FILE_DOWNLOAD_PERMISSION_REQUEST:I = 0x1

.field public static final NAME:Ljava/lang/String; = "RNCWebViewModule"

.field public static final PICKER:I = 0x1

.field public static final PICKER_LEGACY:I = 0x3

.field protected static final shouldOverrideUrlLoadingLock:Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl$ShouldOverrideUrlLoadingLock;


# instance fields
.field private final mContext:Lcom/facebook/react/bridge/ReactApplicationContext;

.field private mDownloadRequest:Landroid/app/DownloadManager$Request;

.field private mFilePathCallback:Landroid/webkit/ValueCallback;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/webkit/ValueCallback<",
            "[",
            "Landroid/net/Uri;",
            ">;"
        }
    .end annotation
.end field

.field private mFilePathCallbackLegacy:Landroid/webkit/ValueCallback;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/webkit/ValueCallback<",
            "Landroid/net/Uri;",
            ">;"
        }
    .end annotation
.end field

.field private mOutputImage:Ljava/io/File;

.field private mOutputVideo:Ljava/io/File;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl$ShouldOverrideUrlLoadingLock;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl$ShouldOverrideUrlLoadingLock;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;->shouldOverrideUrlLoadingLock:Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl$ShouldOverrideUrlLoadingLock;

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

.method public constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;->mContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1, p0}, Lcom/facebook/react/bridge/ReactContext;->addActivityEventListener(Lcom/facebook/react/bridge/ActivityEventListener;)V

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
.end method

.method public static bridge synthetic a(Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;)Lcom/facebook/react/bridge/ReactApplicationContext;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;->mContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 3
    return-object p0
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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method private acceptsImages(Ljava/lang/String;)Ljava/lang/Boolean;
    .locals 2

    .line 1
    const-string v0, "\\.\\w+"

    invoke-virtual {p1, v0}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    const-string v0, "."

    const-string v1, ""

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;->getMimeTypeFromExtension(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 3
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    sget-object v0, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl$MimeType;->IMAGE:Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl$MimeType;

    invoke-static {v0}, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl$MimeType;->b(Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl$MimeType;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p1, 0x1

    :goto_1
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method private acceptsImages([Ljava/lang/String;)Ljava/lang/Boolean;
    .locals 1

    .line 4
    invoke-direct {p0, p1}, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;->getAcceptedMimeType([Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    .line 5
    sget-object v0, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl$MimeType;->DEFAULT:Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl$MimeType;

    invoke-static {v0}, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl$MimeType;->b(Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl$MimeType;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;->arrayContainsString([Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl$MimeType;->IMAGE:Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl$MimeType;

    invoke-static {v0}, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl$MimeType;->b(Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl$MimeType;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;->arrayContainsString([Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method private acceptsVideo(Ljava/lang/String;)Ljava/lang/Boolean;
    .locals 2

    .line 1
    const-string v0, "\\.\\w+"

    invoke-virtual {p1, v0}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    const-string v0, "."

    const-string v1, ""

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;->getMimeTypeFromExtension(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 3
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    sget-object v0, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl$MimeType;->VIDEO:Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl$MimeType;

    invoke-static {v0}, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl$MimeType;->b(Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl$MimeType;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p1, 0x1

    :goto_1
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method private acceptsVideo([Ljava/lang/String;)Ljava/lang/Boolean;
    .locals 1

    .line 4
    invoke-direct {p0, p1}, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;->getAcceptedMimeType([Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    .line 5
    sget-object v0, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl$MimeType;->DEFAULT:Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl$MimeType;

    invoke-static {v0}, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl$MimeType;->b(Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl$MimeType;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;->arrayContainsString([Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl$MimeType;->VIDEO:Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl$MimeType;

    invoke-static {v0}, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl$MimeType;->b(Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl$MimeType;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;->arrayContainsString([Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method private arrayContainsString([Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Boolean;
    .locals 3

    .line 1
    array-length v0, p1

    .line 2
    const/4 v1, 0x0

    .line 3
    .line 4
    :goto_0
    if-ge v1, v0, :cond_1

    .line 5
    .line 6
    aget-object v2, p1, v1

    .line 7
    .line 8
    .line 9
    invoke-virtual {v2, p2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 10
    move-result v2

    .line 11
    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 15
    return-object p1

    .line 16
    .line 17
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 18
    goto :goto_0

    .line 19
    .line 20
    :cond_1
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 21
    return-object p1
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

.method public static bridge synthetic b(Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;)Landroid/app/DownloadManager$Request;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;->mDownloadRequest:Landroid/app/DownloadManager$Request;

    .line 3
    return-object p0
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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method private getAcceptedMimeType([Ljava/lang/String;)[Ljava/lang/String;
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;->noAcceptTypesSet([Ljava/lang/String;)Ljava/lang/Boolean;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 8
    move-result v0

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    sget-object p1, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl$MimeType;->DEFAULT:Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl$MimeType;

    .line 13
    .line 14
    .line 15
    invoke-static {p1}, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl$MimeType;->b(Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl$MimeType;)Ljava/lang/String;

    .line 16
    move-result-object p1

    .line 17
    .line 18
    .line 19
    filled-new-array {p1}, [Ljava/lang/String;

    .line 20
    move-result-object p1

    .line 21
    return-object p1

    .line 22
    :cond_0
    array-length v0, p1

    .line 23
    .line 24
    new-array v0, v0, [Ljava/lang/String;

    .line 25
    const/4 v1, 0x0

    .line 26
    :goto_0
    array-length v2, p1

    .line 27
    .line 28
    if-ge v1, v2, :cond_3

    .line 29
    .line 30
    aget-object v2, p1, v1

    .line 31
    .line 32
    const-string v3, "\\.\\w+"

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2, v3}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    .line 36
    move-result v3

    .line 37
    .line 38
    if-eqz v3, :cond_2

    .line 39
    .line 40
    const-string v3, "."

    .line 41
    .line 42
    const-string v4, ""

    .line 43
    .line 44
    .line 45
    invoke-virtual {v2, v3, v4}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 46
    move-result-object v3

    .line 47
    .line 48
    .line 49
    invoke-direct {p0, v3}, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;->getMimeTypeFromExtension(Ljava/lang/String;)Ljava/lang/String;

    .line 50
    move-result-object v3

    .line 51
    .line 52
    if-eqz v3, :cond_1

    .line 53
    .line 54
    aput-object v3, v0, v1

    .line 55
    goto :goto_1

    .line 56
    .line 57
    :cond_1
    aput-object v2, v0, v1

    .line 58
    goto :goto_1

    .line 59
    .line 60
    :cond_2
    aput-object v2, v0, v1

    .line 61
    .line 62
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 63
    goto :goto_0

    .line 64
    :cond_3
    return-object v0
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
.end method

.method private getFileChooserIntent(Ljava/lang/String;)Landroid/content/Intent;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    sget-object v0, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl$MimeType;->DEFAULT:Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl$MimeType;

    invoke-static {v0}, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl$MimeType;->b(Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl$MimeType;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, p1

    .line 3
    :goto_0
    const-string v1, "\\.\\w+"

    invoke-virtual {p1, v1}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 4
    const-string v0, "."

    const-string v1, ""

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;->getMimeTypeFromExtension(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 5
    :cond_1
    new-instance p1, Landroid/content/Intent;

    const-string v1, "android.intent.action.GET_CONTENT"

    invoke-direct {p1, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 6
    const-string v1, "android.intent.category.OPENABLE"

    invoke-virtual {p1, v1}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 7
    invoke-virtual {p1, v0}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    return-object p1
.end method

.method private getFileChooserIntent([Ljava/lang/String;Z)Landroid/content/Intent;
    .locals 2

    .line 8
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.GET_CONTENT"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 9
    const-string v1, "android.intent.category.OPENABLE"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 10
    sget-object v1, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl$MimeType;->DEFAULT:Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl$MimeType;

    invoke-static {v1}, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl$MimeType;->b(Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl$MimeType;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 11
    const-string v1, "android.intent.extra.MIME_TYPES"

    invoke-direct {p0, p1}, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;->getAcceptedMimeType([Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;

    .line 12
    const-string p1, "android.intent.extra.ALLOW_MULTIPLE"

    invoke-virtual {v0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    return-object v0
.end method

.method private getMimeTypeFromExtension(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    .line 5
    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1}, Landroid/webkit/MimeTypeMap;->getMimeTypeFromExtension(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    move-result-object p1

    .line 11
    return-object p1

    .line 12
    :cond_0
    const/4 p1, 0x0

    .line 13
    return-object p1
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

.method private getPermissionAwareActivity()Lcom/facebook/react/modules/core/PermissionAwareActivity;
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;->mContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/facebook/react/bridge/ReactContext;->getCurrentActivity()Landroid/app/Activity;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    instance-of v1, v0, Lcom/facebook/react/modules/core/PermissionAwareActivity;

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    check-cast v0, Lcom/facebook/react/modules/core/PermissionAwareActivity;

    .line 15
    return-object v0

    .line 16
    .line 17
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 18
    .line 19
    const-string v1, "Tried to use permissions API but the host Activity doesn\'t implement PermissionAwareActivity."

    .line 20
    .line 21
    .line 22
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 23
    throw v0

    .line 24
    .line 25
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 26
    .line 27
    const-string v1, "Tried to use permissions API while not attached to an Activity."

    .line 28
    .line 29
    .line 30
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 31
    throw v0
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

.method private getWebviewFileDownloaderPermissionListener(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/react/modules/core/PermissionListener;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl$a;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0, p1, p2}, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl$a;-><init>(Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    return-object v0
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

.method private noAcceptTypesSet([Ljava/lang/String;)Ljava/lang/Boolean;
    .locals 3

    .line 1
    array-length v0, p1

    .line 2
    const/4 v1, 0x1

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    array-length v0, p1

    .line 6
    const/4 v2, 0x0

    .line 7
    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    aget-object p1, p1, v2

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 16
    move-result p1

    .line 17
    .line 18
    if-nez p1, :cond_0

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move v1, v2

    .line 21
    .line 22
    .line 23
    :cond_1
    :goto_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 24
    move-result-object p1

    .line 25
    return-object p1
.end method


# virtual methods
.method public downloadFile(Ljava/lang/String;)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;->mContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 3
    .line 4
    const-string v1, "download"

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/facebook/react/bridge/ReactContext;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    check-cast v0, Landroid/app/DownloadManager;

    .line 11
    .line 12
    :try_start_0
    iget-object v1, p0, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;->mDownloadRequest:Landroid/app/DownloadManager$Request;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroid/app/DownloadManager;->enqueue(Landroid/app/DownloadManager$Request;)J
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    .line 17
    iget-object v0, p0, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;->mContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 18
    const/4 v1, 0x1

    .line 19
    .line 20
    .line 21
    invoke-static {v0, p1, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 22
    move-result-object p1

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 26
    return-void

    .line 27
    :catch_0
    move-exception p1

    .line 28
    goto :goto_0

    .line 29
    :catch_1
    move-exception p1

    .line 30
    .line 31
    :goto_0
    const-string v0, "RNCWebViewModule"

    .line 32
    .line 33
    const-string v1, "Unsupported URI, aborting download"

    .line 34
    .line 35
    .line 36
    invoke-static {v0, v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 37
    return-void
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
.end method

.method public getCapturedFile(Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl$MimeType;)Ljava/io/File;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl$b;->a:[I

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 6
    move-result p1

    .line 7
    .line 8
    aget p1, v0, p1

    .line 9
    const/4 v0, 0x1

    .line 10
    .line 11
    if-eq p1, v0, :cond_1

    .line 12
    const/4 v0, 0x2

    .line 13
    .line 14
    if-eq p1, v0, :cond_0

    .line 15
    .line 16
    const-string p1, ""

    .line 17
    move-object v0, p1

    .line 18
    goto :goto_0

    .line 19
    .line 20
    :cond_0
    sget-object p1, Landroid/os/Environment;->DIRECTORY_MOVIES:Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    const-string/jumbo p1, "video-"

    .line 24
    .line 25
    const-string v0, ".mp4"

    .line 26
    goto :goto_0

    .line 27
    .line 28
    :cond_1
    sget-object p1, Landroid/os/Environment;->DIRECTORY_PICTURES:Ljava/lang/String;

    .line 29
    .line 30
    const-string p1, "image-"

    .line 31
    .line 32
    const-string v0, ".jpg"

    .line 33
    .line 34
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 44
    move-result-wide v2

    .line 45
    .line 46
    .line 47
    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 48
    move-result-object v2

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    iget-object v1, p0, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;->mContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 57
    const/4 v2, 0x0

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1, v2}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    .line 61
    move-result-object v1

    .line 62
    .line 63
    .line 64
    invoke-static {p1, v0, v1}, Ljava/io/File;->createTempFile(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    .line 65
    move-result-object p1

    .line 66
    return-object p1
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
.end method

.method public getOutputUri(Ljava/io/File;)Landroid/net/Uri;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;->mContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    iget-object v1, p0, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;->mContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 9
    .line 10
    new-instance v2, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    const-string v0, ".fileprovider"

    .line 19
    .line 20
    .line 21
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    move-result-object v0

    .line 26
    .line 27
    .line 28
    invoke-static {v1, v0, p1}, Landroidx/core/content/FileProvider;->getUriForFile(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Landroid/net/Uri;

    .line 29
    move-result-object p1

    .line 30
    return-object p1
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
.end method

.method public getPhotoIntent()Landroid/content/Intent;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    :try_start_0
    sget-object v1, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl$MimeType;->IMAGE:Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl$MimeType;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v1}, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;->getCapturedFile(Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl$MimeType;)Ljava/io/File;

    .line 7
    move-result-object v1

    .line 8
    .line 9
    iput-object v1, p0, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;->mOutputImage:Ljava/io/File;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v1}, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;->getOutputUri(Ljava/io/File;)Landroid/net/Uri;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    new-instance v2, Landroid/content/Intent;

    .line 16
    .line 17
    const-string v3, "android.media.action.IMAGE_CAPTURE"

    .line 18
    .line 19
    .line 20
    invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_2

    .line 21
    .line 22
    .line 23
    :try_start_1
    const-string/jumbo v0, "output"

    .line 24
    .line 25
    .line 26
    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0

    .line 27
    return-object v2

    .line 28
    :catch_0
    move-exception v0

    .line 29
    goto :goto_1

    .line 30
    :catch_1
    move-exception v0

    .line 31
    goto :goto_1

    .line 32
    :catch_2
    move-exception v1

    .line 33
    :goto_0
    move-object v2, v0

    .line 34
    move-object v0, v1

    .line 35
    goto :goto_1

    .line 36
    :catch_3
    move-exception v1

    .line 37
    goto :goto_0

    .line 38
    .line 39
    :goto_1
    const-string v1, "CREATE FILE"

    .line 40
    .line 41
    const-string v3, "Error occurred while creating the File"

    .line 42
    .line 43
    .line 44
    invoke-static {v1, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 48
    return-object v2
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

.method public getSelectedFiles(Landroid/content/Intent;I)[Landroid/net/Uri;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    return-object v0

    .line 5
    .line 6
    .line 7
    :cond_0
    invoke-virtual {p1}, Landroid/content/Intent;->getClipData()Landroid/content/ClipData;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    if-eqz v1, :cond_2

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/content/Intent;->getClipData()Landroid/content/ClipData;

    .line 14
    move-result-object p2

    .line 15
    .line 16
    .line 17
    invoke-virtual {p2}, Landroid/content/ClipData;->getItemCount()I

    .line 18
    move-result p2

    .line 19
    .line 20
    new-array v0, p2, [Landroid/net/Uri;

    .line 21
    const/4 v1, 0x0

    .line 22
    .line 23
    :goto_0
    if-ge v1, p2, :cond_1

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Landroid/content/Intent;->getClipData()Landroid/content/ClipData;

    .line 27
    move-result-object v2

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2, v1}, Landroid/content/ClipData;->getItemAt(I)Landroid/content/ClipData$Item;

    .line 31
    move-result-object v2

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2}, Landroid/content/ClipData$Item;->getUri()Landroid/net/Uri;

    .line 35
    move-result-object v2

    .line 36
    .line 37
    aput-object v2, v0, v1

    .line 38
    .line 39
    add-int/lit8 v1, v1, 0x1

    .line 40
    goto :goto_0

    .line 41
    :cond_1
    return-object v0

    .line 42
    .line 43
    .line 44
    :cond_2
    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 45
    move-result-object v1

    .line 46
    .line 47
    if-eqz v1, :cond_3

    .line 48
    const/4 v1, -0x1

    .line 49
    .line 50
    if-ne p2, v1, :cond_3

    .line 51
    .line 52
    .line 53
    invoke-static {p2, p1}, Landroid/webkit/WebChromeClient$FileChooserParams;->parseResult(ILandroid/content/Intent;)[Landroid/net/Uri;

    .line 54
    move-result-object p1

    .line 55
    return-object p1

    .line 56
    :cond_3
    return-object v0
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

.method public getVideoIntent()Landroid/content/Intent;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    :try_start_0
    sget-object v1, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl$MimeType;->VIDEO:Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl$MimeType;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v1}, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;->getCapturedFile(Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl$MimeType;)Ljava/io/File;

    .line 7
    move-result-object v1

    .line 8
    .line 9
    iput-object v1, p0, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;->mOutputVideo:Ljava/io/File;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v1}, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;->getOutputUri(Ljava/io/File;)Landroid/net/Uri;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    new-instance v2, Landroid/content/Intent;

    .line 16
    .line 17
    const-string v3, "android.media.action.VIDEO_CAPTURE"

    .line 18
    .line 19
    .line 20
    invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_2

    .line 21
    .line 22
    .line 23
    :try_start_1
    const-string/jumbo v0, "output"

    .line 24
    .line 25
    .line 26
    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0

    .line 27
    return-object v2

    .line 28
    :catch_0
    move-exception v0

    .line 29
    goto :goto_1

    .line 30
    :catch_1
    move-exception v0

    .line 31
    goto :goto_1

    .line 32
    :catch_2
    move-exception v1

    .line 33
    :goto_0
    move-object v2, v0

    .line 34
    move-object v0, v1

    .line 35
    goto :goto_1

    .line 36
    :catch_3
    move-exception v1

    .line 37
    goto :goto_0

    .line 38
    .line 39
    :goto_1
    const-string v1, "CREATE FILE"

    .line 40
    .line 41
    const-string v3, "Error occurred while creating the File"

    .line 42
    .line 43
    .line 44
    invoke-static {v1, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 48
    return-object v2
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

.method public grantFileDownloaderPermissions(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;->mContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/facebook/react/bridge/ReactContext;->getCurrentActivity()Landroid/app/Activity;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 9
    .line 10
    const/16 v2, 0x1c

    .line 11
    const/4 v3, 0x1

    .line 12
    .line 13
    if-le v1, v2, :cond_0

    .line 14
    return v3

    .line 15
    .line 16
    :cond_0
    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    .line 17
    .line 18
    .line 19
    invoke-static {v0, v1}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    .line 20
    move-result v0

    .line 21
    .line 22
    if-nez v0, :cond_1

    .line 23
    move v0, v3

    .line 24
    goto :goto_0

    .line 25
    :cond_1
    const/4 v0, 0x0

    .line 26
    .line 27
    :goto_0
    if-nez v0, :cond_2

    .line 28
    .line 29
    .line 30
    invoke-direct {p0}, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;->getPermissionAwareActivity()Lcom/facebook/react/modules/core/PermissionAwareActivity;

    .line 31
    move-result-object v2

    .line 32
    .line 33
    .line 34
    filled-new-array {v1}, [Ljava/lang/String;

    .line 35
    move-result-object v1

    .line 36
    .line 37
    .line 38
    invoke-direct {p0, p1, p2}, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;->getWebviewFileDownloaderPermissionListener(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/react/modules/core/PermissionListener;

    .line 39
    move-result-object p1

    .line 40
    .line 41
    .line 42
    invoke-interface {v2, v1, v3, p1}, Lcom/facebook/react/modules/core/PermissionAwareActivity;->requestPermissions([Ljava/lang/String;ILcom/facebook/react/modules/core/PermissionListener;)V

    .line 43
    :cond_2
    return v0
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
.end method

.method public isFileUploadSupported()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
    .line 3
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

.method public needsCameraPermission()Z
    .locals 6

    .line 1
    .line 2
    const-string v0, "android.permission.CAMERA"

    .line 3
    .line 4
    iget-object v1, p0, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;->mContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v1}, Lcom/facebook/react/bridge/ReactContext;->getCurrentActivity()Landroid/app/Activity;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 12
    move-result-object v2

    .line 13
    const/4 v3, 0x1

    .line 14
    .line 15
    .line 16
    :try_start_0
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 17
    move-result-object v4

    .line 18
    .line 19
    .line 20
    invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 21
    move-result-object v4

    .line 22
    .line 23
    const/16 v5, 0x1000

    .line 24
    .line 25
    .line 26
    invoke-virtual {v2, v4, v5}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 27
    move-result-object v2

    .line 28
    .line 29
    iget-object v2, v2, Landroid/content/pm/PackageInfo;->requestedPermissions:[Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 33
    move-result-object v2

    .line 34
    .line 35
    .line 36
    invoke-interface {v2, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 37
    move-result v2

    .line 38
    .line 39
    if-eqz v2, :cond_0

    .line 40
    .line 41
    .line 42
    invoke-static {v1, v0}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    .line 43
    move-result v0
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 44
    .line 45
    if-eqz v0, :cond_0

    .line 46
    return v3

    .line 47
    :cond_0
    const/4 v0, 0x0

    .line 48
    return v0

    .line 49
    :catch_0
    return v3
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
.end method

.method public onActivityResult(Landroid/app/Activity;IILandroid/content/Intent;)V
    .locals 6

    .line 1
    .line 2
    iget-object p1, p0, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;->mFilePathCallback:Landroid/webkit/ValueCallback;

    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    iget-object p1, p0, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;->mFilePathCallbackLegacy:Landroid/webkit/ValueCallback;

    .line 7
    .line 8
    if-nez p1, :cond_0

    .line 9
    return-void

    .line 10
    .line 11
    :cond_0
    iget-object p1, p0, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;->mOutputImage:Ljava/io/File;

    .line 12
    .line 13
    const-wide/16 v0, 0x0

    .line 14
    const/4 v2, 0x0

    .line 15
    const/4 v3, 0x1

    .line 16
    .line 17
    if-eqz p1, :cond_1

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/io/File;->length()J

    .line 21
    move-result-wide v4

    .line 22
    .line 23
    cmp-long p1, v4, v0

    .line 24
    .line 25
    if-lez p1, :cond_1

    .line 26
    move p1, v3

    .line 27
    goto :goto_0

    .line 28
    :cond_1
    move p1, v2

    .line 29
    .line 30
    :goto_0
    iget-object v4, p0, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;->mOutputVideo:Ljava/io/File;

    .line 31
    .line 32
    if-eqz v4, :cond_2

    .line 33
    .line 34
    .line 35
    invoke-virtual {v4}, Ljava/io/File;->length()J

    .line 36
    move-result-wide v4

    .line 37
    .line 38
    cmp-long v0, v4, v0

    .line 39
    .line 40
    if-lez v0, :cond_2

    .line 41
    move v2, v3

    .line 42
    :cond_2
    const/4 v0, -0x1

    .line 43
    const/4 v1, 0x0

    .line 44
    .line 45
    if-eq p2, v3, :cond_7

    .line 46
    const/4 v3, 0x3

    .line 47
    .line 48
    if-eq p2, v3, :cond_3

    .line 49
    goto :goto_1

    .line 50
    .line 51
    :cond_3
    if-eq p3, v0, :cond_4

    .line 52
    .line 53
    iget-object p2, p0, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;->mFilePathCallbackLegacy:Landroid/webkit/ValueCallback;

    .line 54
    .line 55
    .line 56
    invoke-interface {p2, v1}, Landroid/webkit/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V

    .line 57
    goto :goto_1

    .line 58
    .line 59
    :cond_4
    if-eqz p1, :cond_5

    .line 60
    .line 61
    iget-object p2, p0, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;->mFilePathCallbackLegacy:Landroid/webkit/ValueCallback;

    .line 62
    .line 63
    iget-object p3, p0, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;->mOutputImage:Ljava/io/File;

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0, p3}, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;->getOutputUri(Ljava/io/File;)Landroid/net/Uri;

    .line 67
    move-result-object p3

    .line 68
    .line 69
    .line 70
    invoke-interface {p2, p3}, Landroid/webkit/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V

    .line 71
    goto :goto_1

    .line 72
    .line 73
    :cond_5
    if-eqz v2, :cond_6

    .line 74
    .line 75
    iget-object p2, p0, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;->mFilePathCallbackLegacy:Landroid/webkit/ValueCallback;

    .line 76
    .line 77
    iget-object p3, p0, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;->mOutputVideo:Ljava/io/File;

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0, p3}, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;->getOutputUri(Ljava/io/File;)Landroid/net/Uri;

    .line 81
    move-result-object p3

    .line 82
    .line 83
    .line 84
    invoke-interface {p2, p3}, Landroid/webkit/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V

    .line 85
    goto :goto_1

    .line 86
    .line 87
    :cond_6
    iget-object p2, p0, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;->mFilePathCallbackLegacy:Landroid/webkit/ValueCallback;

    .line 88
    .line 89
    .line 90
    invoke-virtual {p4}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 91
    move-result-object p3

    .line 92
    .line 93
    .line 94
    invoke-interface {p2, p3}, Landroid/webkit/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V

    .line 95
    goto :goto_1

    .line 96
    .line 97
    :cond_7
    if-eq p3, v0, :cond_8

    .line 98
    .line 99
    iget-object p2, p0, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;->mFilePathCallback:Landroid/webkit/ValueCallback;

    .line 100
    .line 101
    if-eqz p2, :cond_b

    .line 102
    .line 103
    .line 104
    invoke-interface {p2, v1}, Landroid/webkit/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V

    .line 105
    goto :goto_1

    .line 106
    .line 107
    :cond_8
    if-eqz p1, :cond_9

    .line 108
    .line 109
    iget-object p2, p0, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;->mFilePathCallback:Landroid/webkit/ValueCallback;

    .line 110
    .line 111
    iget-object p3, p0, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;->mOutputImage:Ljava/io/File;

    .line 112
    .line 113
    .line 114
    invoke-virtual {p0, p3}, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;->getOutputUri(Ljava/io/File;)Landroid/net/Uri;

    .line 115
    move-result-object p3

    .line 116
    .line 117
    .line 118
    filled-new-array {p3}, [Landroid/net/Uri;

    .line 119
    move-result-object p3

    .line 120
    .line 121
    .line 122
    invoke-interface {p2, p3}, Landroid/webkit/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V

    .line 123
    goto :goto_1

    .line 124
    .line 125
    :cond_9
    if-eqz v2, :cond_a

    .line 126
    .line 127
    iget-object p2, p0, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;->mFilePathCallback:Landroid/webkit/ValueCallback;

    .line 128
    .line 129
    iget-object p3, p0, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;->mOutputVideo:Ljava/io/File;

    .line 130
    .line 131
    .line 132
    invoke-virtual {p0, p3}, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;->getOutputUri(Ljava/io/File;)Landroid/net/Uri;

    .line 133
    move-result-object p3

    .line 134
    .line 135
    .line 136
    filled-new-array {p3}, [Landroid/net/Uri;

    .line 137
    move-result-object p3

    .line 138
    .line 139
    .line 140
    invoke-interface {p2, p3}, Landroid/webkit/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V

    .line 141
    goto :goto_1

    .line 142
    .line 143
    :cond_a
    iget-object p2, p0, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;->mFilePathCallback:Landroid/webkit/ValueCallback;

    .line 144
    .line 145
    .line 146
    invoke-virtual {p0, p4, p3}, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;->getSelectedFiles(Landroid/content/Intent;I)[Landroid/net/Uri;

    .line 147
    move-result-object p3

    .line 148
    .line 149
    .line 150
    invoke-interface {p2, p3}, Landroid/webkit/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V

    .line 151
    .line 152
    :cond_b
    :goto_1
    iget-object p2, p0, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;->mOutputImage:Ljava/io/File;

    .line 153
    .line 154
    if-eqz p2, :cond_c

    .line 155
    .line 156
    if-nez p1, :cond_c

    .line 157
    .line 158
    .line 159
    invoke-virtual {p2}, Ljava/io/File;->delete()Z

    .line 160
    .line 161
    :cond_c
    iget-object p1, p0, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;->mOutputVideo:Ljava/io/File;

    .line 162
    .line 163
    if-eqz p1, :cond_d

    .line 164
    .line 165
    if-nez v2, :cond_d

    .line 166
    .line 167
    .line 168
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    .line 169
    .line 170
    :cond_d
    iput-object v1, p0, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;->mFilePathCallback:Landroid/webkit/ValueCallback;

    .line 171
    .line 172
    iput-object v1, p0, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;->mFilePathCallbackLegacy:Landroid/webkit/ValueCallback;

    .line 173
    .line 174
    iput-object v1, p0, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;->mOutputImage:Ljava/io/File;

    .line 175
    .line 176
    iput-object v1, p0, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;->mOutputVideo:Ljava/io/File;

    .line 177
    return-void
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
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
.end method

.method public onNewIntent(Landroid/content/Intent;)V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
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
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;->mDownloadRequest:Landroid/app/DownloadManager$Request;

    .line 3
    return-void
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
    sget-object v0, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;->shouldOverrideUrlLoadingLock:Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl$ShouldOverrideUrlLoadingLock;

    .line 3
    .line 4
    .line 5
    invoke-static {p2, p3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 6
    move-result-object p2

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p2}, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl$ShouldOverrideUrlLoadingLock;->getLock(Ljava/lang/Double;)Ljava/util/concurrent/atomic/AtomicReference;

    .line 10
    move-result-object p2

    .line 11
    .line 12
    if-eqz p2, :cond_1

    .line 13
    monitor-enter p2

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    :try_start_0
    sget-object p1, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl$ShouldOverrideUrlLoadingLock$ShouldOverrideCallbackState;->DO_NOT_OVERRIDE:Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl$ShouldOverrideUrlLoadingLock$ShouldOverrideCallbackState;

    .line 18
    goto :goto_0

    .line 19
    :catchall_0
    move-exception p1

    .line 20
    goto :goto_1

    .line 21
    .line 22
    :cond_0
    sget-object p1, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl$ShouldOverrideUrlLoadingLock$ShouldOverrideCallbackState;->SHOULD_OVERRIDE:Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl$ShouldOverrideUrlLoadingLock$ShouldOverrideCallbackState;

    .line 23
    .line 24
    .line 25
    :goto_0
    invoke-virtual {p2, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p2}, Ljava/lang/Object;->notify()V

    .line 29
    monitor-exit p2

    .line 30
    return-void

    .line 31
    :goto_1
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    throw p1

    .line 33
    :cond_1
    return-void
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public startPhotoPickerIntent(Ljava/lang/String;Landroid/webkit/ValueCallback;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Landroid/webkit/ValueCallback<",
            "Landroid/net/Uri;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p2, p0, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;->mFilePathCallbackLegacy:Landroid/webkit/ValueCallback;

    .line 2
    iget-object p2, p0, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;->mContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    invoke-virtual {p2}, Lcom/facebook/react/bridge/ReactContext;->getCurrentActivity()Landroid/app/Activity;

    move-result-object p2

    .line 3
    invoke-direct {p0, p1}, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;->getFileChooserIntent(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    .line 4
    const-string v1, ""

    invoke-static {v0, v1}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object v0

    .line 5
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 6
    invoke-direct {p0, p1}, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;->acceptsImages(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 7
    invoke-virtual {p0}, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;->getPhotoIntent()Landroid/content/Intent;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 8
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 9
    :cond_0
    invoke-direct {p0, p1}, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;->acceptsVideo(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 10
    invoke-virtual {p0}, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;->getVideoIntent()Landroid/content/Intent;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 11
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    const/4 p1, 0x0

    .line 12
    new-array p1, p1, [Landroid/os/Parcelable;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Landroid/os/Parcelable;

    const-string v1, "android.intent.extra.INITIAL_INTENTS"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 13
    invoke-virtual {p2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/content/Intent;->resolveActivity(Landroid/content/pm/PackageManager;)Landroid/content/ComponentName;

    move-result-object p1

    if-eqz p1, :cond_2

    const/4 p1, 0x3

    .line 14
    invoke-virtual {p2, v0, p1}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void

    .line 15
    :cond_2
    const-string p1, "RNCWebViewModule"

    const-string/jumbo p2, "there is no Activity to handle this Intent"

    invoke-static {p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public startPhotoPickerIntent([Ljava/lang/String;ZLandroid/webkit/ValueCallback;Z)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/String;",
            "Z",
            "Landroid/webkit/ValueCallback<",
            "[",
            "Landroid/net/Uri;",
            ">;Z)Z"
        }
    .end annotation

    .line 16
    iput-object p3, p0, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;->mFilePathCallback:Landroid/webkit/ValueCallback;

    .line 17
    iget-object p3, p0, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;->mContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    invoke-virtual {p3}, Lcom/facebook/react/bridge/ReactContext;->getCurrentActivity()Landroid/app/Activity;

    move-result-object p3

    .line 18
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 19
    invoke-virtual {p0}, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;->needsCameraPermission()Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_1

    .line 20
    invoke-direct {p0, p1}, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;->acceptsImages([Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 21
    invoke-virtual {p0}, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;->getPhotoIntent()Landroid/content/Intent;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 22
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 23
    :cond_0
    invoke-direct {p0, p1}, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;->acceptsVideo([Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 24
    invoke-virtual {p0}, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;->getVideoIntent()Landroid/content/Intent;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 25
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 26
    :cond_1
    new-instance v1, Landroid/content/Intent;

    const-string v3, "android.intent.action.CHOOSER"

    invoke-direct {v1, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    if-eqz p4, :cond_2

    goto :goto_0

    .line 27
    :cond_2
    invoke-direct {p0, p1, p2}, Lcom/reactnativecommunity/webview/RNCWebViewModuleImpl;->getFileChooserIntent([Ljava/lang/String;Z)Landroid/content/Intent;

    move-result-object p1

    .line 28
    const-string p2, "android.intent.extra.INTENT"

    invoke-virtual {v1, p2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    const/4 p1, 0x0

    .line 29
    new-array p1, p1, [Landroid/os/Parcelable;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Landroid/os/Parcelable;

    const-string p2, "android.intent.extra.INITIAL_INTENTS"

    invoke-virtual {v1, p2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Landroid/os/Parcelable;)Landroid/content/Intent;

    move-object v2, v1

    .line 30
    :goto_0
    const-string p1, "RNCWebViewModule"

    const/4 p2, 0x1

    if-eqz v2, :cond_4

    .line 31
    invoke-virtual {p3}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p4

    invoke-virtual {v2, p4}, Landroid/content/Intent;->resolveActivity(Landroid/content/pm/PackageManager;)Landroid/content/ComponentName;

    move-result-object p4

    if-eqz p4, :cond_3

    .line 32
    invoke-virtual {p3, v2, p2}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    goto :goto_1

    .line 33
    :cond_3
    const-string/jumbo p3, "there is no Activity to handle this Intent"

    invoke-static {p1, p3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    .line 34
    :cond_4
    const-string/jumbo p3, "there is no Camera permission"

    invoke-static {p1, p3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :goto_1
    return p2
.end method
