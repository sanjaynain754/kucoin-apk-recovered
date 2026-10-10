.class public final Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UiIntent$HideSmallOrFilter;
.super Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UiIntent;
.source "AssetV2IsolatedContract.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UiIntent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "HideSmallOrFilter"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0008\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\n\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UiIntent$HideSmallOrFilter;",
        "Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UiIntent;",
        "checked",
        "",
        "keyword",
        "",
        "isManual",
        "<init>",
        "(ZLjava/lang/String;Z)V",
        "getChecked",
        "()Z",
        "getKeyword",
        "()Ljava/lang/String;",
        "AssetsCenterLib_googleRelease"
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
.field private final checked:Z

.field private final isManual:Z

.field private final keyword:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(ZLjava/lang/String;Z)V
    .locals 1
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "keyword"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UiIntent;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 3
    iput-boolean p1, p0, Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UiIntent$HideSmallOrFilter;->checked:Z

    .line 4
    iput-object p2, p0, Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UiIntent$HideSmallOrFilter;->keyword:Ljava/lang/String;

    .line 5
    iput-boolean p3, p0, Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UiIntent$HideSmallOrFilter;->isManual:Z

    return-void
.end method

.method public synthetic constructor <init>(ZLjava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    .line 1
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UiIntent$HideSmallOrFilter;-><init>(ZLjava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public final getChecked()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UiIntent$HideSmallOrFilter;->checked:Z

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
.end method

.method public final getKeyword()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UiIntent$HideSmallOrFilter;->keyword:Ljava/lang/String;

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
.end method

.method public final isManual()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UiIntent$HideSmallOrFilter;->isManual:Z

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
.end method
