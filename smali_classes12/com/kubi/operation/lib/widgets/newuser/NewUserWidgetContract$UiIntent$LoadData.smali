.class public final Lcom/kubi/operation/lib/widgets/newuser/NewUserWidgetContract$UiIntent$LoadData;
.super Lcom/kubi/operation/lib/widgets/newuser/NewUserWidgetContract$UiIntent;
.source "NewUserWidgetContract.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kubi/operation/lib/widgets/newuser/NewUserWidgetContract$UiIntent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "LoadData"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/kubi/operation/lib/widgets/newuser/NewUserWidgetContract$UiIntent$LoadData;",
        "Lcom/kubi/operation/lib/widgets/newuser/NewUserWidgetContract$UiIntent;",
        "forceRefresh",
        "",
        "<init>",
        "(Z)V",
        "getForceRefresh",
        "()Z",
        "OperationLib_googleRelease"
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
.field private final forceRefresh:Z


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v2, v0, v1}, Lcom/kubi/operation/lib/widgets/newuser/NewUserWidgetContract$UiIntent$LoadData;-><init>(ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lcom/kubi/operation/lib/widgets/newuser/NewUserWidgetContract$UiIntent;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-boolean p1, p0, Lcom/kubi/operation/lib/widgets/newuser/NewUserWidgetContract$UiIntent$LoadData;->forceRefresh:Z

    return-void
.end method

.method public synthetic constructor <init>(ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    .line 3
    :cond_0
    invoke-direct {p0, p1}, Lcom/kubi/operation/lib/widgets/newuser/NewUserWidgetContract$UiIntent$LoadData;-><init>(Z)V

    return-void
.end method


# virtual methods
.method public final getForceRefresh()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/kubi/operation/lib/widgets/newuser/NewUserWidgetContract$UiIntent$LoadData;->forceRefresh:Z

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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method
