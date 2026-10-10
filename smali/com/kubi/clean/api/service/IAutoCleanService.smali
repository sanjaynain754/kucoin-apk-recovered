.class public interface abstract Lcom/kubi/clean/api/service/IAutoCleanService;
.super Ljava/lang/Object;
.source "IAutoCleanService.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/clean/api/service/IAutoCleanService$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008g\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aJ \u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u00a6@\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0012\u0010\t\u001a\u00020\n2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u000cH&J0\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e2\u0012\u0010\u0011\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00130\u0012\"\u00020\u0013H\u00a6@\u00a2\u0006\u0002\u0010\u0014J\u0008\u0010\u0015\u001a\u00020\nH&J\u0008\u0010\u0016\u001a\u00020\nH&J\u0010\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0019H&\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\u001b\u00c0\u0006\u0001"
    }
    d2 = {
        "Lcom/kubi/clean/api/service/IAutoCleanService;",
        "",
        "showNotice",
        "Lkotlin/Result;",
        "Lcom/kubi/clean/api/entity/AutoCleanDialogResult;",
        "config",
        "Lcom/kubi/clean/api/entity/AutoCleanNoticeRequestConfig;",
        "showNotice-YNEx5aM",
        "(Lcom/kubi/clean/api/entity/AutoCleanNoticeRequestConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "dismissAutoLimitView",
        "",
        "container",
        "Landroid/view/ViewGroup;",
        "queryLimitMessage",
        "",
        "",
        "Lcom/kubi/clean/api/entity/IPLimitConfig;",
        "bizTypeList",
        "",
        "Lcom/kubi/clean/api/entity/AutoCleanBizType;",
        "([Lcom/kubi/clean/api/entity/AutoCleanBizType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "bindEvent",
        "refreshTopMsg",
        "onMainTabChanged",
        "mainTabPage",
        "Lcom/kubi/clean/api/constant/MainTabPage;",
        "Companion",
        "AutoCleanUserApi_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lvx/b;
.end annotation


# static fields
.field public static final a:Lcom/kubi/clean/api/service/IAutoCleanService$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/clean/api/service/IAutoCleanService$Companion;->a:Lcom/kubi/clean/api/service/IAutoCleanService$Companion;

    .line 3
    .line 4
    sput-object v0, Lcom/kubi/clean/api/service/IAutoCleanService;->a:Lcom/kubi/clean/api/service/IAutoCleanService$Companion;

    .line 5
    return-void
    .line 6
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
.end method


# virtual methods
.method public abstract a()V
.end method

.method public abstract b()V
.end method

.method public abstract c(Lcom/kubi/clean/api/constant/MainTabPage;)V
    .param p1    # Lcom/kubi/clean/api/constant/MainTabPage;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract d(Landroid/view/ViewGroup;)V
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
.end method

.method public abstract e([Lcom/kubi/clean/api/entity/AutoCleanBizType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # [Lcom/kubi/clean/api/entity/AutoCleanBizType;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lcom/kubi/clean/api/entity/AutoCleanBizType;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/kubi/clean/api/entity/IPLimitConfig;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method
