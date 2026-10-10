.class public interface abstract Lcom/jumio/core/data/scan/ScanResult;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Lcom/jumio/core/data/scan/DataInterface<",
        "*>;>",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008f\u0018\u0000*\u000c\u0008\u0000\u0010\u0001*\u0006\u0012\u0002\u0008\u00030\u00022\u00020\u0003R\u0012\u0010\u0004\u001a\u00028\u0000X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u0008X\u00a6\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\t\u0010\n\"\u0004\u0008\u000b\u0010\u000cR\u0018\u0010\r\u001a\u00020\u000eX\u00a6\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u000f\u0010\u0010\"\u0004\u0008\u0011\u0010\u0012R\u0012\u0010\u0013\u001a\u00020\u0014X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0015\u0010\u0016R\u0012\u0010\u0017\u001a\u00020\u0014X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0017\u0010\u0016\u00a8\u0006\u0018\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/jumio/core/data/scan/ScanResult;",
        "T",
        "Lcom/jumio/core/data/scan/DataInterface;",
        "",
        "data",
        "getData",
        "()Lcom/jumio/core/data/scan/DataInterface;",
        "automationModel",
        "Lcom/jumio/core/models/automation/AutomationModel;",
        "getAutomationModel",
        "()Lcom/jumio/core/models/automation/AutomationModel;",
        "setAutomationModel",
        "(Lcom/jumio/core/models/automation/AutomationModel;)V",
        "state",
        "Lcom/jumio/core/data/scan/DataState;",
        "getState",
        "()Lcom/jumio/core/data/scan/DataState;",
        "setState",
        "(Lcom/jumio/core/data/scan/DataState;)V",
        "hasData",
        "",
        "getHasData",
        "()Z",
        "isComplete",
        "jumio-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract getAutomationModel()Lcom/jumio/core/models/automation/AutomationModel;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract getData()Lcom/jumio/core/data/scan/DataInterface;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract getHasData()Z
.end method

.method public abstract getState()Lcom/jumio/core/data/scan/DataState;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract isComplete()Z
.end method

.method public abstract setAutomationModel(Lcom/jumio/core/models/automation/AutomationModel;)V
    .param p1    # Lcom/jumio/core/models/automation/AutomationModel;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
.end method

.method public abstract setState(Lcom/jumio/core/data/scan/DataState;)V
    .param p1    # Lcom/jumio/core/data/scan/DataState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method
