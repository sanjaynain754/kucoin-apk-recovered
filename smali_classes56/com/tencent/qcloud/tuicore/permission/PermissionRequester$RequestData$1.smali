.class final Lcom/tencent/qcloud/tuicore/permission/PermissionRequester$RequestData$1;
.super Ljava/lang/Object;
.source "PermissionRequester.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/qcloud/tuicore/permission/PermissionRequester$RequestData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/tencent/qcloud/tuicore/permission/PermissionRequester$RequestData;",
        ">;"
    }
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
.end method


# virtual methods
.method public createFromParcel(Landroid/os/Parcel;)Lcom/tencent/qcloud/tuicore/permission/PermissionRequester$RequestData;
    .locals 1

    .line 2
    new-instance v0, Lcom/tencent/qcloud/tuicore/permission/PermissionRequester$RequestData;

    invoke-direct {v0, p1}, Lcom/tencent/qcloud/tuicore/permission/PermissionRequester$RequestData;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/tencent/qcloud/tuicore/permission/PermissionRequester$RequestData$1;->createFromParcel(Landroid/os/Parcel;)Lcom/tencent/qcloud/tuicore/permission/PermissionRequester$RequestData;

    move-result-object p1

    return-object p1
.end method

.method public newArray(I)[Lcom/tencent/qcloud/tuicore/permission/PermissionRequester$RequestData;
    .locals 0

    .line 2
    new-array p1, p1, [Lcom/tencent/qcloud/tuicore/permission/PermissionRequester$RequestData;

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/tencent/qcloud/tuicore/permission/PermissionRequester$RequestData$1;->newArray(I)[Lcom/tencent/qcloud/tuicore/permission/PermissionRequester$RequestData;

    move-result-object p1

    return-object p1
.end method
