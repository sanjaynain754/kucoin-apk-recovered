.class public interface abstract Lvi/a;
.super Ljava/lang/Object;
.source "HelpCenterApi.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0008f\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u0018\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00032\u0008\u0008\u0001\u0010\u0005\u001a\u00020\tH\'\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\n\u00c0\u0006\u0001"
    }
    d2 = {
        "Lcom/kubi/helpcenter/api/HelpCenterApi;",
        "",
        "queryBotType",
        "Lkotlinx/coroutines/flow/Flow;",
        "Lcom/kubi/helpcenter/entity/BotTypeEntity;",
        "params",
        "Lcom/kubi/helpcenter/entity/QueryBotTypeParams;",
        "queryWorkOrderUrl",
        "",
        "Lcom/kubi/helpcenter/entity/WorkOrderParams;",
        "HelpCenterLib_googleRelease"
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
.method public abstract a(Lcom/kubi/helpcenter/entity/WorkOrderParams;)Lkotlinx/coroutines/flow/e;
    .param p1    # Lcom/kubi/helpcenter/entity/WorkOrderParams;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/helpcenter/entity/WorkOrderParams;",
            ")",
            "Lkotlinx/coroutines/flow/e<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "v1/intelligent-bot-server/api/open/index/ticket"
    .end annotation
.end method

.method public abstract b(Lcom/kubi/helpcenter/entity/QueryBotTypeParams;)Lkotlinx/coroutines/flow/e;
    .param p1    # Lcom/kubi/helpcenter/entity/QueryBotTypeParams;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/helpcenter/entity/QueryBotTypeParams;",
            ")",
            "Lkotlinx/coroutines/flow/e<",
            "Lcom/kubi/helpcenter/entity/BotTypeEntity;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "v1/intelligent-bot-server/api/open/index/entry"
    .end annotation
.end method
