.class public final Lcom/kubi/widget/web/service/IKWebService$SessionReadyResult;
.super Ljava/lang/Object;
.source "IKWebService.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kubi/widget/web/service/IKWebService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "SessionReadyResult"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/widget/web/service/IKWebService$SessionReadyResult$Status;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\n\u0018\u00002\u00020\u0001:\u0001\u0010B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/kubi/widget/web/service/IKWebService$SessionReadyResult;",
        "",
        "ready",
        "",
        "status",
        "Lcom/kubi/widget/web/service/IKWebService$SessionReadyResult$Status;",
        "message",
        "",
        "<init>",
        "(ZLcom/kubi/widget/web/service/IKWebService$SessionReadyResult$Status;Ljava/lang/String;)V",
        "getReady",
        "()Z",
        "getStatus",
        "()Lcom/kubi/widget/web/service/IKWebService$SessionReadyResult$Status;",
        "getMessage",
        "()Ljava/lang/String;",
        "Status",
        "LWebWidget_googleRelease"
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
.field public final a:Z

.field public final b:Lcom/kubi/widget/web/service/IKWebService$SessionReadyResult$Status;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(ZLcom/kubi/widget/web/service/IKWebService$SessionReadyResult$Status;Ljava/lang/String;)V
    .locals 1
    .param p2    # Lcom/kubi/widget/web/service/IKWebService$SessionReadyResult$Status;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string/jumbo v0, "status"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-boolean p1, p0, Lcom/kubi/widget/web/service/IKWebService$SessionReadyResult;->a:Z

    .line 3
    iput-object p2, p0, Lcom/kubi/widget/web/service/IKWebService$SessionReadyResult;->b:Lcom/kubi/widget/web/service/IKWebService$SessionReadyResult$Status;

    .line 4
    iput-object p3, p0, Lcom/kubi/widget/web/service/IKWebService$SessionReadyResult;->c:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(ZLcom/kubi/widget/web/service/IKWebService$SessionReadyResult$Status;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    .line 5
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lcom/kubi/widget/web/service/IKWebService$SessionReadyResult;-><init>(ZLcom/kubi/widget/web/service/IKWebService$SessionReadyResult$Status;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/widget/web/service/IKWebService$SessionReadyResult;->c:Ljava/lang/String;

    .line 3
    return-object v0
    .line 4
    .line 5
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
.end method

.method public final b()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/kubi/widget/web/service/IKWebService$SessionReadyResult;->a:Z

    .line 3
    return v0
    .line 4
    .line 5
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
.end method

.method public final c()Lcom/kubi/widget/web/service/IKWebService$SessionReadyResult$Status;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/widget/web/service/IKWebService$SessionReadyResult;->b:Lcom/kubi/widget/web/service/IKWebService$SessionReadyResult$Status;

    .line 3
    return-object v0
    .line 4
    .line 5
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
.end method
