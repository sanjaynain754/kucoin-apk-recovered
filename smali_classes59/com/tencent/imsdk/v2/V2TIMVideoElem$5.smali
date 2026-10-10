.class Lcom/tencent/imsdk/v2/V2TIMVideoElem$5;
.super Ljava/lang/Object;
.source "V2TIMVideoElem.java"

# interfaces
.implements Lcom/tencent/imsdk/v2/V2TIMValueCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/imsdk/v2/V2TIMVideoElem;->downloadSnapshot(Ljava/lang/String;Lcom/tencent/imsdk/v2/V2TIMDownloadCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/tencent/imsdk/v2/V2TIMValueCallback<",
        "Lcom/tencent/imsdk/message/DownloadProgressInfo;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/tencent/imsdk/v2/V2TIMVideoElem;

.field final synthetic val$v2TIMDownloadCallback:Lcom/tencent/imsdk/v2/V2TIMDownloadCallback;


# direct methods
.method public constructor <init>(Lcom/tencent/imsdk/v2/V2TIMVideoElem;Lcom/tencent/imsdk/v2/V2TIMDownloadCallback;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/imsdk/v2/V2TIMVideoElem$5;->this$0:Lcom/tencent/imsdk/v2/V2TIMVideoElem;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/tencent/imsdk/v2/V2TIMVideoElem$5;->val$v2TIMDownloadCallback:Lcom/tencent/imsdk/v2/V2TIMDownloadCallback;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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


# virtual methods
.method public onError(ILjava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMVideoElem$5;->val$v2TIMDownloadCallback:Lcom/tencent/imsdk/v2/V2TIMDownloadCallback;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0, p1, p2}, Lcom/tencent/imsdk/v2/V2TIMCallback;->onError(ILjava/lang/String;)V

    .line 8
    :cond_0
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

.method public onSuccess(Lcom/tencent/imsdk/message/DownloadProgressInfo;)V
    .locals 6

    .line 2
    new-instance v0, Lcom/tencent/imsdk/v2/V2TIMElem$V2ProgressInfo;

    iget-object v1, p0, Lcom/tencent/imsdk/v2/V2TIMVideoElem$5;->this$0:Lcom/tencent/imsdk/v2/V2TIMVideoElem;

    invoke-virtual {p1}, Lcom/tencent/imsdk/message/DownloadProgressInfo;->getCurrentSize()J

    move-result-wide v2

    invoke-virtual {p1}, Lcom/tencent/imsdk/message/DownloadProgressInfo;->getTotalSize()J

    move-result-wide v4

    invoke-direct/range {v0 .. v5}, Lcom/tencent/imsdk/v2/V2TIMElem$V2ProgressInfo;-><init>(Lcom/tencent/imsdk/v2/V2TIMElem;JJ)V

    .line 3
    iget-object p1, p0, Lcom/tencent/imsdk/v2/V2TIMVideoElem$5;->val$v2TIMDownloadCallback:Lcom/tencent/imsdk/v2/V2TIMDownloadCallback;

    if-eqz p1, :cond_0

    .line 4
    invoke-interface {p1, v0}, Lcom/tencent/imsdk/v2/V2TIMDownloadCallback;->onProgress(Lcom/tencent/imsdk/v2/V2TIMElem$V2ProgressInfo;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/tencent/imsdk/message/DownloadProgressInfo;

    invoke-virtual {p0, p1}, Lcom/tencent/imsdk/v2/V2TIMVideoElem$5;->onSuccess(Lcom/tencent/imsdk/message/DownloadProgressInfo;)V

    return-void
.end method
