.class public final Lcom/kubi/otc/entity/FastQuoteModel$Creator;
.super Ljava/lang/Object;
.source "FastBean.kt"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kubi/otc/entity/FastQuoteModel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Creator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/kubi/otc/entity/FastQuoteModel;",
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
.method public final createFromParcel(Landroid/os/Parcel;)Lcom/kubi/otc/entity/FastQuoteModel;
    .locals 24

    .line 1
    move-object/from16 v0, p1

    const-string v1, "parcel"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lcom/kubi/otc/entity/FastQuoteModel;

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    sget-object v1, Lcom/kubi/otc/entity/FastFeeModel;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v1, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v1

    :goto_0
    check-cast v1, Lcom/kubi/otc/entity/FastFeeModel;

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v13

    if-nez v13, :cond_1

    const/4 v13, 0x0

    goto :goto_1

    :cond_1
    sget-object v13, Lcom/kubi/otc/entity/FiatLimitResponse;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v13, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v13

    :goto_1
    check-cast v13, Lcom/kubi/otc/entity/FiatLimitResponse;

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v14

    if-nez v14, :cond_2

    const/4 v14, 0x0

    goto :goto_2

    :cond_2
    sget-object v14, Lcom/kubi/otc/entity/FastRechargePaymentModel;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v14, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v14

    :goto_2
    check-cast v14, Lcom/kubi/otc/entity/FastRechargePaymentModel;

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v15

    if-nez v15, :cond_3

    const/4 v15, 0x0

    goto :goto_3

    :cond_3
    sget-object v15, Lcom/kubi/otc/entity/FastBankPaymentModel;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v15, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v15

    :goto_3
    check-cast v15, Lcom/kubi/otc/entity/FastBankPaymentModel;

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v16

    if-nez v16, :cond_4

    const/4 v12, 0x0

    goto :goto_4

    :cond_4
    sget-object v12, Lcom/kubi/otc/entity/FastFiatCommonMode;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v12, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v12

    :goto_4
    check-cast v12, Lcom/kubi/otc/entity/FastFiatCommonMode;

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v17

    if-nez v17, :cond_5

    move-object/from16 v17, v1

    const/4 v1, 0x0

    goto :goto_5

    :cond_5
    move-object/from16 v17, v1

    sget-object v1, Lcom/kubi/otc/entity/FastCommonOtcMode;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v1, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v1

    :goto_5
    check-cast v1, Lcom/kubi/otc/entity/FastCommonOtcMode;

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v18

    if-nez v18, :cond_6

    move-object/from16 v18, v1

    const/4 v1, 0x0

    goto :goto_6

    :cond_6
    move-object/from16 v18, v1

    sget-object v1, Lcom/kubi/otc/entity/CardInfoModel;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v1, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v1

    :goto_6
    check-cast v1, Lcom/kubi/otc/entity/CardInfoModel;

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v19

    const/16 v20, 0x0

    const/16 v21, 0x1

    if-nez v19, :cond_7

    const/16 v19, 0x0

    goto :goto_8

    :cond_7
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v19

    if-eqz v19, :cond_8

    move/from16 v19, v21

    goto :goto_7

    :cond_8
    move/from16 v19, v20

    :goto_7
    invoke-static/range {v19 .. v19}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v19

    :goto_8
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v22

    if-nez v22, :cond_9

    const/16 v20, 0x0

    goto :goto_9

    :cond_9
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v22

    if-eqz v22, :cond_a

    move/from16 v20, v21

    :cond_a
    invoke-static/range {v20 .. v20}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v20

    :goto_9
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v21

    move-object/from16 v16, v1

    if-nez v21, :cond_b

    const/4 v0, 0x0

    goto :goto_a

    :cond_b
    sget-object v1, Lcom/kubi/otc/entity/FastQuoteParams;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v1, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    :goto_a
    move-object/from16 v21, v0

    check-cast v21, Lcom/kubi/otc/entity/FastQuoteParams;

    move-object/from16 v23, v16

    move-object/from16 v16, v12

    move-object/from16 v12, v17

    move-object/from16 v17, v18

    move-object/from16 v18, v23

    invoke-direct/range {v2 .. v21}, Lcom/kubi/otc/entity/FastQuoteModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/otc/entity/FastFeeModel;Lcom/kubi/otc/entity/FiatLimitResponse;Lcom/kubi/otc/entity/FastRechargePaymentModel;Lcom/kubi/otc/entity/FastBankPaymentModel;Lcom/kubi/otc/entity/FastFiatCommonMode;Lcom/kubi/otc/entity/FastCommonOtcMode;Lcom/kubi/otc/entity/CardInfoModel;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/kubi/otc/entity/FastQuoteParams;)V

    return-object v2
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/kubi/otc/entity/FastQuoteModel$Creator;->createFromParcel(Landroid/os/Parcel;)Lcom/kubi/otc/entity/FastQuoteModel;

    move-result-object p1

    return-object p1
.end method

.method public final newArray(I)[Lcom/kubi/otc/entity/FastQuoteModel;
    .locals 0

    .line 1
    new-array p1, p1, [Lcom/kubi/otc/entity/FastQuoteModel;

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/kubi/otc/entity/FastQuoteModel$Creator;->newArray(I)[Lcom/kubi/otc/entity/FastQuoteModel;

    move-result-object p1

    return-object p1
.end method
