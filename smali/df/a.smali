.class public final Ldf/a;
.super Ljava/lang/Object;
.source "KCredentialManager.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0015\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0008\u0002\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008\u0012\u000e\u0008\u0002\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u0008\u0012\u000e\u0008\u0002\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u0008\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u0015\u0010\u001bR\u001d\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001d\u001a\u0004\u0008\u0011\u0010\u001eR\u001d\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010\u001d\u001a\u0004\u0008\u0019\u0010\u001eR\u001d\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008 \u0010\u001d\u001a\u0004\u0008!\u0010\u001e\u00a8\u0006\""
    }
    d2 = {
        "Ldf/a;",
        "",
        "Landroid/content/Context;",
        "context",
        "",
        "assetLinks",
        "Lcom/kubi/credential/core/a;",
        "credentialManager",
        "Lcom/kubi/credential/track/g$b;",
        "Lef/b;",
        "createTrackFactory",
        "Lef/j;",
        "getTrackFactory",
        "",
        "clearTrackFactory",
        "<init>",
        "(Landroid/content/Context;Ljava/lang/String;Lcom/kubi/credential/core/a;Lcom/kubi/credential/track/g$b;Lcom/kubi/credential/track/g$b;Lcom/kubi/credential/track/g$b;)V",
        "a",
        "Landroid/content/Context;",
        "getContext",
        "()Landroid/content/Context;",
        "b",
        "Ljava/lang/String;",
        "getAssetLinks",
        "()Ljava/lang/String;",
        "c",
        "Lcom/kubi/credential/core/a;",
        "()Lcom/kubi/credential/core/a;",
        "d",
        "Lcom/kubi/credential/track/g$b;",
        "()Lcom/kubi/credential/track/g$b;",
        "e",
        "f",
        "getClearTrackFactory",
        "credential_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final a:Landroid/content/Context;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final c:Lcom/kubi/credential/core/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d:Lcom/kubi/credential/track/g$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/kubi/credential/track/g$b<",
            "Lef/b;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final e:Lcom/kubi/credential/track/g$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/kubi/credential/track/g$b<",
            "Lef/j;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final f:Lcom/kubi/credential/track/g$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/kubi/credential/track/g$b<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lcom/kubi/credential/core/a;Lcom/kubi/credential/track/g$b;Lcom/kubi/credential/track/g$b;Lcom/kubi/credential/track/g$b;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Lcom/kubi/credential/core/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lcom/kubi/credential/track/g$b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lcom/kubi/credential/track/g$b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Lcom/kubi/credential/track/g$b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Lcom/kubi/credential/core/a;",
            "Lcom/kubi/credential/track/g$b<",
            "Lef/b;",
            ">;",
            "Lcom/kubi/credential/track/g$b<",
            "Lef/j;",
            ">;",
            "Lcom/kubi/credential/track/g$b<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "credentialManager"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createTrackFactory"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getTrackFactory"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clearTrackFactory"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ldf/a;->a:Landroid/content/Context;

    .line 3
    iput-object p2, p0, Ldf/a;->b:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Ldf/a;->c:Lcom/kubi/credential/core/a;

    .line 5
    iput-object p4, p0, Ldf/a;->d:Lcom/kubi/credential/track/g$b;

    .line 6
    iput-object p5, p0, Ldf/a;->e:Lcom/kubi/credential/track/g$b;

    .line 7
    iput-object p6, p0, Ldf/a;->f:Lcom/kubi/credential/track/g$b;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Ljava/lang/String;Lcom/kubi/credential/core/a;Lcom/kubi/credential/track/g$b;Lcom/kubi/credential/track/g$b;Lcom/kubi/credential/track/g$b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_0

    const/4 p2, 0x0

    :cond_0
    move-object v2, p2

    and-int/lit8 p2, p7, 0x4

    if-eqz p2, :cond_1

    .line 8
    new-instance p3, Lcom/kubi/credential/jetpack/JetpackManagerImpl;

    invoke-direct {p3, p1, v2}, Lcom/kubi/credential/jetpack/JetpackManagerImpl;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    :cond_1
    move-object v3, p3

    and-int/lit8 p2, p7, 0x8

    if-eqz p2, :cond_2

    .line 9
    new-instance p4, Lcom/kubi/credential/track/d;

    invoke-direct {p4}, Lcom/kubi/credential/track/d;-><init>()V

    :cond_2
    move-object v4, p4

    and-int/lit8 p2, p7, 0x10

    if-eqz p2, :cond_3

    .line 10
    new-instance p5, Lcom/kubi/credential/track/f;

    invoke-direct {p5}, Lcom/kubi/credential/track/f;-><init>()V

    :cond_3
    move-object v5, p5

    and-int/lit8 p2, p7, 0x20

    if-eqz p2, :cond_4

    .line 11
    new-instance p6, Lcom/kubi/credential/track/b;

    invoke-direct {p6}, Lcom/kubi/credential/track/b;-><init>()V

    :cond_4
    move-object v0, p0

    move-object v1, p1

    move-object v6, p6

    .line 12
    invoke-direct/range {v0 .. v6}, Ldf/a;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/kubi/credential/core/a;Lcom/kubi/credential/track/g$b;Lcom/kubi/credential/track/g$b;Lcom/kubi/credential/track/g$b;)V

    return-void
.end method


# virtual methods
.method public final a()Lcom/kubi/credential/track/g$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/kubi/credential/track/g$b<",
            "Lef/b;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Ldf/a;->d:Lcom/kubi/credential/track/g$b;

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
.end method

.method public final b()Lcom/kubi/credential/core/a;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Ldf/a;->c:Lcom/kubi/credential/core/a;

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
.end method

.method public final c()Lcom/kubi/credential/track/g$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/kubi/credential/track/g$b<",
            "Lef/j;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Ldf/a;->e:Lcom/kubi/credential/track/g$b;

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
.end method
