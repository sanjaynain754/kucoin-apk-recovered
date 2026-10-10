.class public interface abstract Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleRequestCallback;
.super Ljava/lang/Object;
.source "TUILiveBattleManager.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "BattleRequestCallback"
.end annotation


# virtual methods
.method public abstract onError(Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;Ljava/lang/String;)V
.end method

.method public abstract onSuccess(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleInfo;Ljava/util/Map;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleInfo;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/tencent/cloud/tuikit/engine/extension/TUILiveBattleManager$BattleCode;",
            ">;)V"
        }
    .end annotation
.end method
