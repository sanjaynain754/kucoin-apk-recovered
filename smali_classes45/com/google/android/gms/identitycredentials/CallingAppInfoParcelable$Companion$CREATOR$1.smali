.class public final Lcom/google/android/gms/identitycredentials/CallingAppInfoParcelable$Companion$CREATOR$1;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-identity-credentials@@16.0.0-alpha08"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/identitycredentials/CallingAppInfoParcelable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/google/android/gms/identitycredentials/CallingAppInfoParcelable;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002*\u0001\u0000\u0008\n\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u001d\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tH\u0016\u00a2\u0006\u0002\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "com/google/android/gms/identitycredentials/CallingAppInfoParcelable$Companion$CREATOR$1",
        "Landroid/os/Parcelable$Creator;",
        "Lcom/google/android/gms/identitycredentials/CallingAppInfoParcelable;",
        "createFromParcel",
        "source",
        "Landroid/os/Parcel;",
        "newArray",
        "",
        "size",
        "",
        "(I)[Lcom/google/android/gms/identitycredentials/CallingAppInfoParcelable;",
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


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    return-void
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
.end method


# virtual methods
.method public createFromParcel(Landroid/os/Parcel;)Lcom/google/android/gms/identitycredentials/CallingAppInfoParcelable;
    .locals 3

    const-string/jumbo v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    .line 2
    sget-object v1, Lcom/google/android/gms/identitycredentials/CallingAppInfoParcelable;->Companion:Lcom/google/android/gms/identitycredentials/CallingAppInfoParcelable$Companion;

    invoke-static {v1, p1}, Lcom/google/android/gms/identitycredentials/CallingAppInfoParcelable$Companion;->access$readByteArrayList(Lcom/google/android/gms/identitycredentials/CallingAppInfoParcelable$Companion;Landroid/os/Parcel;)Ljava/util/ArrayList;

    move-result-object v1

    .line 3
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    if-eqz v0, :cond_1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/google/android/gms/identitycredentials/CallingAppInfoParcelable;

    .line 4
    invoke-direct {v2, v0, v1, p1}, Lcom/google/android/gms/identitycredentials/CallingAppInfoParcelable;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    return-object v2

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    .line 5
    invoke-virtual {p0, p1}, Lcom/google/android/gms/identitycredentials/CallingAppInfoParcelable$Companion$CREATOR$1;->createFromParcel(Landroid/os/Parcel;)Lcom/google/android/gms/identitycredentials/CallingAppInfoParcelable;

    move-result-object p1

    return-object p1
.end method

.method public newArray(I)[Lcom/google/android/gms/identitycredentials/CallingAppInfoParcelable;
    .locals 0

    .line 1
    new-array p1, p1, [Lcom/google/android/gms/identitycredentials/CallingAppInfoParcelable;

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/google/android/gms/identitycredentials/CallingAppInfoParcelable$Companion$CREATOR$1;->newArray(I)[Lcom/google/android/gms/identitycredentials/CallingAppInfoParcelable;

    move-result-object p1

    return-object p1
.end method
