.class public final Lcom/kubi/otc/entity/FiatWithdrawOrderInfo$Creator;
.super Ljava/lang/Object;
.source "FiatBean.kt"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kubi/otc/entity/FiatWithdrawOrderInfo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Creator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/kubi/otc/entity/FiatWithdrawOrderInfo;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
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
.method public final createFromParcel(Landroid/os/Parcel;)Lcom/kubi/otc/entity/FiatWithdrawOrderInfo;
    .locals 23

    .line 1
    move-object/from16 v0, p1

    const-string v1, "parcel"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lcom/kubi/otc/entity/FiatWithdrawOrderInfo;

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    sget-object v1, Lcom/kubi/otc/entity/WithdrawAmount;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v1, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v1

    :goto_0
    check-cast v1, Lcom/kubi/otc/entity/WithdrawAmount;

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v8

    if-nez v8, :cond_1

    const/4 v8, 0x0

    goto :goto_1

    :cond_1
    sget-object v8, Lcom/kubi/otc/entity/FeeAmount;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v8, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v8

    :goto_1
    check-cast v8, Lcom/kubi/otc/entity/FeeAmount;

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v15

    if-nez v15, :cond_2

    const/4 v15, 0x0

    goto :goto_2

    :cond_2
    invoke-virtual {v0}, Landroid/os/Parcel;->readLong()J

    move-result-wide v15

    invoke-static/range {v15 .. v16}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v15

    :goto_2
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v16

    if-nez v16, :cond_3

    const/4 v7, 0x0

    goto :goto_3

    :cond_3
    sget-object v7, Lcom/kubi/otc/entity/FiatAccountExtraInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v7, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v7

    :goto_3
    check-cast v7, Lcom/kubi/otc/entity/FiatAccountExtraInfo;

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v17

    if-nez v17, :cond_4

    const/16 v17, 0x0

    goto :goto_5

    :cond_4
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v17

    if-eqz v17, :cond_5

    const/16 v17, 0x1

    goto :goto_4

    :cond_5
    const/16 v17, 0x0

    :goto_4
    invoke-static/range {v17 .. v17}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v17

    :goto_5
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v18

    if-nez v18, :cond_6

    move-object/from16 v18, v1

    const/4 v1, 0x0

    goto :goto_6

    :cond_6
    move-object/from16 v18, v1

    sget-object v1, Lcom/kubi/otc/entity/WithdrawAmount;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v1, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v1

    :goto_6
    check-cast v1, Lcom/kubi/otc/entity/WithdrawAmount;

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v19

    if-nez v19, :cond_7

    move-object/from16 v19, v1

    const/4 v1, 0x0

    goto :goto_7

    :cond_7
    move-object/from16 v19, v1

    sget-object v1, Lcom/kubi/otc/entity/WithdrawAmount;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v1, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v1

    :goto_7
    check-cast v1, Lcom/kubi/otc/entity/WithdrawAmount;

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v20

    if-nez v20, :cond_8

    move-object/from16 v20, v1

    const/4 v1, 0x0

    goto :goto_8

    :cond_8
    move-object/from16 v20, v1

    sget-object v1, Lcom/kubi/payment/channel/data/entities/ErrorInfoEntity;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v1, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v1

    :goto_8
    check-cast v1, Lcom/kubi/payment/channel/data/entities/ErrorInfoEntity;

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v21

    move-object/from16 v16, v1

    if-nez v21, :cond_9

    const/4 v0, 0x0

    goto :goto_9

    :cond_9
    sget-object v1, Lcom/kubi/otc/entity/TaxAmount;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v1, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    :goto_9
    move-object/from16 v21, v0

    check-cast v21, Lcom/kubi/otc/entity/TaxAmount;

    move-object/from16 v22, v16

    move-object/from16 v16, v7

    move-object/from16 v7, v18

    move-object/from16 v18, v19

    move-object/from16 v19, v20

    move-object/from16 v20, v22

    invoke-direct/range {v2 .. v21}, Lcom/kubi/otc/entity/FiatWithdrawOrderInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/otc/entity/WithdrawAmount;Lcom/kubi/otc/entity/FeeAmount;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lcom/kubi/otc/entity/FiatAccountExtraInfo;Ljava/lang/Boolean;Lcom/kubi/otc/entity/WithdrawAmount;Lcom/kubi/otc/entity/WithdrawAmount;Lcom/kubi/payment/channel/data/entities/ErrorInfoEntity;Lcom/kubi/otc/entity/TaxAmount;)V

    return-object v2
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/kubi/otc/entity/FiatWithdrawOrderInfo$Creator;->createFromParcel(Landroid/os/Parcel;)Lcom/kubi/otc/entity/FiatWithdrawOrderInfo;

    move-result-object p1

    return-object p1
.end method

.method public final newArray(I)[Lcom/kubi/otc/entity/FiatWithdrawOrderInfo;
    .locals 0

    .line 1
    new-array p1, p1, [Lcom/kubi/otc/entity/FiatWithdrawOrderInfo;

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/kubi/otc/entity/FiatWithdrawOrderInfo$Creator;->newArray(I)[Lcom/kubi/otc/entity/FiatWithdrawOrderInfo;

    move-result-object p1

    return-object p1
.end method
