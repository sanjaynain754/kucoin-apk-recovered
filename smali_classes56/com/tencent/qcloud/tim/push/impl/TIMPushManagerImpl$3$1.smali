.class Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$3$1;
.super Lcom/tencent/qcloud/tim/push/TIMPushCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$3;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/tencent/qcloud/tim/push/TIMPushCallback<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$3;


# direct methods
.method public constructor <init>(Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$3;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$3$1;->a:Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$3;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Lcom/tencent/qcloud/tim/push/TIMPushCallback;-><init>()V

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
.end method


# virtual methods
.method public bridge synthetic onError(ILjava/lang/String;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p3, Ljava/lang/String;

    invoke-virtual {p0, p1, p2, p3}, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$3$1;->onError(ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onError(ILjava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 2
    iget-object p3, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$3$1;->a:Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$3;

    iget-object p3, p3, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$3;->b:Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;

    invoke-static {p3}, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->i(Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;)Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;

    move-result-object p3

    invoke-virtual {p3}, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->b()Ljava/lang/String;

    move-result-object p3

    .line 3
    invoke-static {}, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->a()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getBuiltInPushUserID failed, errCode = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ", errMsg = "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ", fallback getRegistrationID = "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    iget-object p1, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$3$1;->a:Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$3;

    iget-object p1, p1, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$3;->a:Lcom/tencent/qcloud/tim/push/TIMPushCallback;

    invoke-static {p1, p3}, Lcom/tencent/qcloud/tim/push/utils/TIMPushUtils;->a(Lcom/tencent/qcloud/tim/push/TIMPushCallback;Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$3$1;->onSuccess(Ljava/lang/String;)V

    return-void
.end method

.method public onSuccess(Ljava/lang/String;)V
    .locals 3

    .line 2
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    iget-object p1, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$3$1;->a:Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$3;

    iget-object p1, p1, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$3;->b:Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;

    invoke-static {p1}, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->i(Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;)Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;

    move-result-object p1

    invoke-virtual {p1}, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->b()Ljava/lang/String;

    move-result-object p1

    .line 4
    :cond_0
    invoke-static {}, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl;->a()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getRegistrationID = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", from built-in push account"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 5
    iget-object v0, p0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$3$1;->a:Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$3;

    iget-object v0, v0, Lcom/tencent/qcloud/tim/push/impl/TIMPushManagerImpl$3;->a:Lcom/tencent/qcloud/tim/push/TIMPushCallback;

    invoke-static {v0, p1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushUtils;->a(Lcom/tencent/qcloud/tim/push/TIMPushCallback;Ljava/lang/Object;)V

    return-void
.end method
