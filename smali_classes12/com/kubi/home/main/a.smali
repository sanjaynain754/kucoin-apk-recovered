.class public interface abstract Lcom/kubi/home/main/a;
.super Ljava/lang/Object;
.source "FreeStyleApi.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008f\u0018\u00002\u00020\u0001J\u001f\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\n\u0008\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\'\u00a2\u0006\u0002\u0010\u0007J\u0018\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00032\u0008\u0008\u0001\u0010\t\u001a\u00020\nH\'J\u000e\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u0003H\'J>\u0010\r\u001a8\u00124\u00122\u0012\u0004\u0012\u00020\u000f\u0012\u000c\u0012\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0018\u00010\u000ej\u0018\u0012\u0004\u0012\u00020\u000f\u0012\u000c\u0012\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0018\u0001`\u00120\u0003H\'J\u0010\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0003H\'\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\u0015\u00c0\u0006\u0001"
    }
    d2 = {
        "Lcom/kubi/home/main/FreeStyleApi;",
        "",
        "queryAppNotice",
        "Lkotlinx/coroutines/flow/Flow;",
        "Lcom/kubi/home/main/FreeStyleEntity;",
        "ui",
        "",
        "(Ljava/lang/Long;)Lkotlinx/coroutines/flow/Flow;",
        "postAppNoticeRead",
        "data",
        "Lcom/kubi/home/main/FreeStyleIdEntity;",
        "queryAppGuide",
        "Lcom/kubi/home/entity/HomeAppGuideEntity;",
        "welfareAlertInfo",
        "Ljava/util/HashMap;",
        "",
        "",
        "Lcom/kubi/home/entity/CmsAdEntity;",
        "Lkotlin/collections/HashMap;",
        "isNewcomer",
        "Lcom/kubi/home/entity/NewcomerConfigEntity;",
        "HomeLib_googleRelease"
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
.method public abstract a(Lcom/kubi/home/main/FreeStyleIdEntity;)Lkotlinx/coroutines/flow/e;
    .param p1    # Lcom/kubi/home/main/FreeStyleIdEntity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/home/main/FreeStyleIdEntity;",
            ")",
            "Lkotlinx/coroutines/flow/e<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "v1/app-notice/read"
    .end annotation
.end method

.method public abstract b(Ljava/lang/Long;)Lkotlinx/coroutines/flow/e;
    .param p1    # Ljava/lang/Long;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation

        .annotation runtime Lretrofit2/http/Query;
            value = "uid"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Long;",
            ")",
            "Lkotlinx/coroutines/flow/e<",
            "Lcom/kubi/home/main/FreeStyleEntity;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "v1/app-notice/query"
    .end annotation
.end method

.method public abstract c()Lkotlinx/coroutines/flow/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/e<",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/kubi/home/entity/CmsAdEntity;",
            ">;>;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "v1/cms/ads-login?ad_position=app-homepage-welfare-popup"
    .end annotation
.end method

.method public abstract d()Lkotlinx/coroutines/flow/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/e<",
            "Lcom/kubi/home/entity/NewcomerConfigEntity;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "v1/kcop/newcomer/app/is-newcomer"
    .end annotation
.end method

.method public abstract e()Lkotlinx/coroutines/flow/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/e<",
            "Lcom/kubi/home/entity/HomeAppGuideEntity;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "v1/campaign-center/invitation-support-v2/app-guide"
    .end annotation
.end method
