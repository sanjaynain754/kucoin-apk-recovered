.class public interface abstract Lcom/google/android/gms/identitycredentials/provider/CreateCredentialCallback;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-identity-credentials@@16.0.0-alpha08"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0008f\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u0008\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\u000b\u00c0\u0006\u0001"
    }
    d2 = {
        "Lcom/google/android/gms/identitycredentials/provider/CreateCredentialCallback;",
        "",
        "onConditionalCreateResult",
        "",
        "result",
        "Lcom/google/android/gms/identitycredentials/CreateCredentialResponse;",
        "pendingIntent",
        "Landroid/app/PendingIntent;",
        "onError",
        "error",
        "Lcom/google/android/gms/identitycredentials/CreateCredentialException;",
        "java.com.google.android.gmscore.integ.client.identity_credentials_identity_credentials"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract onConditionalCreateResult(Lcom/google/android/gms/identitycredentials/CreateCredentialResponse;Landroid/app/PendingIntent;)V
    .param p1    # Lcom/google/android/gms/identitycredentials/CreateCredentialResponse;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/app/PendingIntent;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
.end method

.method public abstract onError(Lcom/google/android/gms/identitycredentials/CreateCredentialException;)V
    .param p1    # Lcom/google/android/gms/identitycredentials/CreateCredentialException;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
.end method
