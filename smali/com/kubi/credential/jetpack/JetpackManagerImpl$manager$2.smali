.class final Lcom/kubi/credential/jetpack/JetpackManagerImpl$manager$2;
.super Lkotlin/jvm/internal/Lambda;
.source "JetpackManagerImpl.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/credential/jetpack/JetpackManagerImpl;-><init>(Landroid/content/Context;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Landroidx/credentials/CredentialManager;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "Landroidx/credentials/CredentialManager;",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic this$0:Lcom/kubi/credential/jetpack/JetpackManagerImpl;


# direct methods
.method public constructor <init>(Lcom/kubi/credential/jetpack/JetpackManagerImpl;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/credential/jetpack/JetpackManagerImpl$manager$2;->this$0:Lcom/kubi/credential/jetpack/JetpackManagerImpl;

    .line 3
    const/4 p1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 7
    return-void
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
    .line 31
.end method


# virtual methods
.method public final invoke()Landroidx/credentials/CredentialManager;
    .locals 4
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    sget-object v0, Landroidx/credentials/CredentialManager;->Companion:Landroidx/credentials/CredentialManager$Companion;

    new-instance v1, Lcom/kubi/credential/jetpack/a;

    iget-object v2, p0, Lcom/kubi/credential/jetpack/JetpackManagerImpl$manager$2;->this$0:Lcom/kubi/credential/jetpack/JetpackManagerImpl;

    invoke-static {v2}, Lcom/kubi/credential/jetpack/JetpackManagerImpl;->e(Lcom/kubi/credential/jetpack/JetpackManagerImpl;)Landroid/content/Context;

    move-result-object v2

    iget-object v3, p0, Lcom/kubi/credential/jetpack/JetpackManagerImpl$manager$2;->this$0:Lcom/kubi/credential/jetpack/JetpackManagerImpl;

    invoke-static {v3}, Lcom/kubi/credential/jetpack/JetpackManagerImpl;->d(Lcom/kubi/credential/jetpack/JetpackManagerImpl;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/kubi/credential/jetpack/a;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroidx/credentials/CredentialManager$Companion;->create(Landroid/content/Context;)Landroidx/credentials/CredentialManager;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/kubi/credential/jetpack/JetpackManagerImpl$manager$2;->invoke()Landroidx/credentials/CredentialManager;

    move-result-object v0

    return-object v0
.end method
