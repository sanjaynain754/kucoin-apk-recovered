.class Lcn/jiguang/privates/core/api/JReporter$1;
.super Ljava/lang/Object;
.source "JReporter.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcn/jiguang/privates/core/api/JReporter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcn/jiguang/privates/core/api/JReporter;",
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
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method


# virtual methods
.method public createFromParcel(Landroid/os/Parcel;)Lcn/jiguang/privates/core/api/JReporter;
    .locals 1

    .line 2
    new-instance v0, Lcn/jiguang/privates/core/api/JReporter;

    invoke-direct {v0, p1}, Lcn/jiguang/privates/core/api/JReporter;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcn/jiguang/privates/core/api/JReporter$1;->createFromParcel(Landroid/os/Parcel;)Lcn/jiguang/privates/core/api/JReporter;

    move-result-object p1

    return-object p1
.end method

.method public newArray(I)[Lcn/jiguang/privates/core/api/JReporter;
    .locals 0

    .line 2
    new-array p1, p1, [Lcn/jiguang/privates/core/api/JReporter;

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcn/jiguang/privates/core/api/JReporter$1;->newArray(I)[Lcn/jiguang/privates/core/api/JReporter;

    move-result-object p1

    return-object p1
.end method
