.class public final Lcom/kubi/clean/service/a;
.super Ljava/lang/Object;
.source "AutoCleanDialogManager.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0014\u0010\u0008\u001a\u00020\t*\u00020\u00072\u0006\u0010\n\u001a\u00020\u0006H\u0002J\u0006\u0010\u000b\u001a\u00020\tJ\u0010\u0010\u000c\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0006H\u0002J\u0012\u0010\r\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u0006H\u0002J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0006H\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J2\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00142\u0006\u0010\u0016\u001a\u00020\u00172\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0018\u001a\u00020\u0019H\u0086@\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0018\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010\u001d\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J&\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u0012H\u0082@\u00a2\u0006\u0004\u0008 \u0010!J,\u0010\"\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00172\u0012\u0010#\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00150\u00140$H\u0002J \u0010%\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020\u0010H\u0002J\u0018\u0010)\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\'H\u0002J\u0018\u0010*\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\'H\u0002J<\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020,2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u00122\u0012\u0010#\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00150\u00140$2\u0006\u0010(\u001a\u00020\u0010H\u0002J\u0018\u0010.\u001a\u00020\t2\u0006\u0010/\u001a\u0002002\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0012\u00101\u001a\u00020\t2\u0008\u00102\u001a\u0004\u0018\u00010\u0006H\u0002R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00063"
    }
    d2 = {
        "Lcom/kubi/clean/service/AutoCleanDialogManager;",
        "",
        "<init>",
        "()V",
        "dialogMap",
        "",
        "",
        "Lcom/kubi/resources/dialog/BaseDialogFragment;",
        "addDialog",
        "",
        "bizType",
        "destroy",
        "removeDialog",
        "getDialog",
        "closeDialog",
        "canOpenDialog",
        "",
        "ipLimitConfig",
        "Lcom/kubi/clean/api/entity/IPLimitConfig;",
        "preShowDialog",
        "Lkotlin/Result;",
        "Lcom/kubi/clean/api/entity/AutoCleanDialogResult;",
        "requestConfig",
        "Lcom/kubi/clean/api/entity/AutoCleanNoticeRequestConfig;",
        "currentTabPage",
        "Lcom/kubi/clean/api/constant/MainTabPage;",
        "preShowDialog-rL6R5X8",
        "(Lcom/kubi/clean/api/entity/AutoCleanNoticeRequestConfig;Lcom/kubi/clean/api/entity/IPLimitConfig;Lcom/kubi/clean/api/constant/MainTabPage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "checkShowIsOk",
        "destroyDialog",
        "preShowNormalDialog",
        "config",
        "preShowNormalDialog-0E7RQCE",
        "(Lcom/kubi/clean/api/entity/AutoCleanNoticeRequestConfig;Lcom/kubi/clean/api/entity/IPLimitConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "createDialog",
        "completableDeferred",
        "Lkotlinx/coroutines/CompletableDeferred;",
        "setInitViewListener",
        "viewHolder",
        "Lio/chad/library/adapter/base/BaseViewHolder;",
        "examineDialog",
        "examineInitViewListener",
        "initNormalDialog",
        "initDialogButton",
        "Lcom/kubi/clean/view/AutoUserDialogFragmentHelper;",
        "dialogFragmentHelper",
        "setTvPrivacyPolicy",
        "tvView",
        "Landroid/widget/TextView;",
        "welfareApplyJoin",
        "welfareRequestId",
        "AutoCleanUserLib_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/kubi/resources/dialog/BaseDialogFragment;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/kubi/clean/service/a;->a:Ljava/util/Map;

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
.end method
