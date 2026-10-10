.class public interface abstract Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$FetchScheduledConferenceListCallback;
.super Ljava/lang/Object;
.source "TUIConferenceListManager.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "FetchScheduledConferenceListCallback"
.end annotation


# virtual methods
.method public abstract onError(Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;Ljava/lang/String;)V
.end method

.method public abstract onSuccess(Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ScheduledConferenceListResult;)V
.end method
