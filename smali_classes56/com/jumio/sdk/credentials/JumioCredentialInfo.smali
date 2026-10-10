.class public final Lcom/jumio/sdk/credentials/JumioCredentialInfo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\t\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/jumio/sdk/credentials/JumioCredentialInfo;",
        "Ljava/io/Serializable;",
        "category",
        "Lcom/jumio/sdk/credentials/JumioCredentialCategory;",
        "id",
        "",
        "order",
        "",
        "<init>",
        "(Lcom/jumio/sdk/credentials/JumioCredentialCategory;Ljava/lang/String;I)V",
        "getCategory",
        "()Lcom/jumio/sdk/credentials/JumioCredentialCategory;",
        "getId",
        "()Ljava/lang/String;",
        "getOrder",
        "()I",
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


# instance fields
.field public final a:Lcom/jumio/sdk/credentials/JumioCredentialCategory;

.field public final b:Ljava/lang/String;

.field public final c:I


# direct methods
.method public constructor <init>(Lcom/jumio/sdk/credentials/JumioCredentialCategory;Ljava/lang/String;I)V
    .locals 1
    .param p1    # Lcom/jumio/sdk/credentials/JumioCredentialCategory;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "category"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "id"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/jumio/sdk/credentials/JumioCredentialInfo;->a:Lcom/jumio/sdk/credentials/JumioCredentialCategory;

    .line 3
    iput-object p2, p0, Lcom/jumio/sdk/credentials/JumioCredentialInfo;->b:Ljava/lang/String;

    .line 4
    iput p3, p0, Lcom/jumio/sdk/credentials/JumioCredentialInfo;->c:I

    return-void
.end method

.method public synthetic constructor <init>(Lcom/jumio/sdk/credentials/JumioCredentialCategory;Ljava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    .line 5
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lcom/jumio/sdk/credentials/JumioCredentialInfo;-><init>(Lcom/jumio/sdk/credentials/JumioCredentialCategory;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final getCategory()Lcom/jumio/sdk/credentials/JumioCredentialCategory;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/sdk/credentials/JumioCredentialInfo;->a:Lcom/jumio/sdk/credentials/JumioCredentialCategory;

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
.end method

.method public final getId()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/sdk/credentials/JumioCredentialInfo;->b:Ljava/lang/String;

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
.end method

.method public final getOrder()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/jumio/sdk/credentials/JumioCredentialInfo;->c:I

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
.end method
