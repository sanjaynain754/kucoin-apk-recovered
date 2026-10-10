.class public final Landroidx/credentials/exceptions/publickeycredential/SignalCredentialStateException$Companion;
.super Ljava/lang/Object;
.source "SignalCredentialStateException.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/credentials/exceptions/publickeycredential/SignalCredentialStateException;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007H\u0007J\u0012\u0010\u0004\u001a\u00020\u00052\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007H\u0007\u00a8\u0006\t"
    }
    d2 = {
        "Landroidx/credentials/exceptions/publickeycredential/SignalCredentialStateException$Companion;",
        "",
        "<init>",
        "()V",
        "createFrom",
        "Landroidx/credentials/exceptions/publickeycredential/SignalCredentialStateException;",
        "type",
        "",
        "msg",
        "credentials"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/credentials/exceptions/publickeycredential/SignalCredentialStateException$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final createFrom(Ljava/lang/String;)Landroidx/credentials/exceptions/publickeycredential/SignalCredentialStateException;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/RestrictTo;
        value = {
            .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY:Landroidx/annotation/RestrictTo$Scope;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 8
    new-instance v0, Landroidx/credentials/exceptions/publickeycredential/SignalCredentialUnknownException;

    invoke-direct {v0, p1}, Landroidx/credentials/exceptions/publickeycredential/SignalCredentialUnknownException;-><init>(Ljava/lang/CharSequence;)V

    return-object v0
.end method

.method public final createFrom(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/publickeycredential/SignalCredentialStateException;
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/RestrictTo;
        value = {
            .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY:Landroidx/annotation/RestrictTo$Scope;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string/jumbo v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, 0x160686b

    if-eq v0, v1, :cond_4

    const v1, 0x59f4b4f3

    if-eq v0, v1, :cond_2

    const v1, 0x715ee59f

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "androidx.credentials.SignalCredentialStateException.TYPE_UNKNOWN"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    .line 2
    :cond_1
    new-instance p1, Landroidx/credentials/exceptions/publickeycredential/SignalCredentialUnknownException;

    invoke-direct {p1, p2}, Landroidx/credentials/exceptions/publickeycredential/SignalCredentialUnknownException;-><init>(Ljava/lang/CharSequence;)V

    return-object p1

    .line 3
    :cond_2
    const-string v0, "androidx.credentials.SignalCredentialStateException.TYPE_PROVIDER_CONFIGURATION"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_0

    .line 4
    :cond_3
    new-instance p1, Landroidx/credentials/exceptions/publickeycredential/SignalCredentialStateProviderConfigurationException;

    invoke-direct {p1, p2}, Landroidx/credentials/exceptions/publickeycredential/SignalCredentialStateProviderConfigurationException;-><init>(Ljava/lang/CharSequence;)V

    return-object p1

    .line 5
    :cond_4
    const-string v0, "androidx.credentials.SignalCredentialStateException.TYPE_SECURITY"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    .line 6
    new-instance p1, Landroidx/credentials/exceptions/publickeycredential/SignalCredentialSecurityException;

    invoke-direct {p1, p2}, Landroidx/credentials/exceptions/publickeycredential/SignalCredentialSecurityException;-><init>(Ljava/lang/CharSequence;)V

    return-object p1

    .line 7
    :cond_5
    :goto_0
    new-instance p1, Landroidx/credentials/exceptions/publickeycredential/SignalCredentialUnknownException;

    invoke-direct {p1, p2}, Landroidx/credentials/exceptions/publickeycredential/SignalCredentialUnknownException;-><init>(Ljava/lang/CharSequence;)V

    return-object p1
.end method
