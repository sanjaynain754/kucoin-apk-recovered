.class Lcom/tencent/qcloud/tim/push/components/TokenRequester$TimeoutThread$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/qcloud/tim/push/components/TokenRequester$TimeoutThread;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/tencent/qcloud/tim/push/components/TokenRequester$TimeoutThread;


# direct methods
.method public constructor <init>(Lcom/tencent/qcloud/tim/push/components/TokenRequester$TimeoutThread;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/qcloud/tim/push/components/TokenRequester$TimeoutThread$1;->a:Lcom/tencent/qcloud/tim/push/components/TokenRequester$TimeoutThread;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.method public run()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/qcloud/tim/push/components/TokenRequester$TimeoutThread$1;->a:Lcom/tencent/qcloud/tim/push/components/TokenRequester$TimeoutThread;

    .line 3
    .line 4
    iget-object v0, v0, Lcom/tencent/qcloud/tim/push/components/TokenRequester$TimeoutThread;->b:Lcom/tencent/qcloud/tim/push/components/TokenRequester$ResultCallBack;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/tencent/qcloud/tim/push/components/TokenRequester$ResultCallBack;->a()V

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
.end method
