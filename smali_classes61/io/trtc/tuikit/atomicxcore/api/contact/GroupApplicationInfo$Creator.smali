.class public final Lio/trtc/tuikit/atomicxcore/api/contact/GroupApplicationInfo$Creator;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/trtc/tuikit/atomicxcore/api/contact/GroupApplicationInfo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Creator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lio/trtc/tuikit/atomicxcore/api/contact/GroupApplicationInfo;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x9,
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
    .line 19
    .line 20
    .line 21
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Lio/trtc/tuikit/atomicxcore/api/contact/GroupApplicationInfo;
    .locals 16
    .param p1    # Landroid/os/Parcel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const-string v0, "parcel"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/trtc/tuikit/atomicxcore/api/contact/GroupApplicationInfo;

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v8

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v11

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v12, 0x0

    if-nez v0, :cond_0

    move-object v0, v12

    goto :goto_0

    :cond_0
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lio/trtc/tuikit/atomicxcore/api/contact/GroupApplicationHandledStatus;->valueOf(Ljava/lang/String;)Lio/trtc/tuikit/atomicxcore/api/contact/GroupApplicationHandledStatus;

    move-result-object v0

    :goto_0
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v13

    if-nez v13, :cond_1

    :goto_1
    move-object v13, v12

    goto :goto_2

    :cond_1
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Lio/trtc/tuikit/atomicxcore/api/contact/GroupApplicationHandledResult;->valueOf(Ljava/lang/String;)Lio/trtc/tuikit/atomicxcore/api/contact/GroupApplicationHandledResult;

    move-result-object v12

    goto :goto_1

    :goto_2
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Lio/trtc/tuikit/atomicxcore/api/contact/GroupApplicationType;->valueOf(Ljava/lang/String;)Lio/trtc/tuikit/atomicxcore/api/contact/GroupApplicationType;

    move-result-object v14

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object v12

    move-object v15, v12

    check-cast v15, Lcom/tencent/imsdk/v2/V2TIMGroupApplication;

    move-object v12, v0

    invoke-direct/range {v1 .. v15}, Lio/trtc/tuikit/atomicxcore/api/contact/GroupApplicationInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/contact/GroupApplicationHandledStatus;Lio/trtc/tuikit/atomicxcore/api/contact/GroupApplicationHandledResult;Lio/trtc/tuikit/atomicxcore/api/contact/GroupApplicationType;Lcom/tencent/imsdk/v2/V2TIMGroupApplication;)V

    return-object v1
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lio/trtc/tuikit/atomicxcore/api/contact/GroupApplicationInfo$Creator;->createFromParcel(Landroid/os/Parcel;)Lio/trtc/tuikit/atomicxcore/api/contact/GroupApplicationInfo;

    move-result-object p1

    return-object p1
.end method

.method public final newArray(I)[Lio/trtc/tuikit/atomicxcore/api/contact/GroupApplicationInfo;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    new-array p1, p1, [Lio/trtc/tuikit/atomicxcore/api/contact/GroupApplicationInfo;

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lio/trtc/tuikit/atomicxcore/api/contact/GroupApplicationInfo$Creator;->newArray(I)[Lio/trtc/tuikit/atomicxcore/api/contact/GroupApplicationInfo;

    move-result-object p1

    return-object p1
.end method
