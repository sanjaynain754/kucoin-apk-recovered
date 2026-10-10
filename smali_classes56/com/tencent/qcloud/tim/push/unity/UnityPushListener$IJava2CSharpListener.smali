.class public interface abstract Lcom/tencent/qcloud/tim/push/unity/UnityPushListener$IJava2CSharpListener;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/qcloud/tim/push/unity/UnityPushListener;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "IJava2CSharpListener"
.end annotation


# virtual methods
.method public abstract onNotificationClicked(Ljava/lang/String;)V
.end method

.method public abstract onRecvPushMessage(Lcom/tencent/qcloud/tim/push/TIMPushMessage;)V
.end method

.method public abstract onRevokePushMessage(Ljava/lang/String;)V
.end method
