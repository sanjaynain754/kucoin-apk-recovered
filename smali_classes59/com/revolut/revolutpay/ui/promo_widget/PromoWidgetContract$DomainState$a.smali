.class public final Lcom/revolut/revolutpay/ui/promo_widget/PromoWidgetContract$DomainState$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/revolut/revolutpay/ui/promo_widget/PromoWidgetContract$DomainState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/revolut/revolutpay/ui/promo_widget/PromoWidgetContract$DomainState;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
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
.end method


# virtual methods
.method public final a(Landroid/os/Parcel;)Lcom/revolut/revolutpay/ui/promo_widget/PromoWidgetContract$DomainState;
    .locals 7
    .param p1    # Landroid/os/Parcel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "parcel"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    new-instance v1, Lcom/revolut/revolutpay/ui/promo_widget/PromoWidgetContract$DomainState;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 12
    move-result v0

    .line 13
    const/4 v2, 0x0

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    move-object v0, v2

    .line 17
    goto :goto_0

    .line 18
    .line 19
    :cond_0
    sget-object v0, Lcom/revolut/revolutpay/api/CashbackState;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 20
    .line 21
    .line 22
    invoke-interface {v0, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    :goto_0
    check-cast v0, Lcom/revolut/revolutpay/api/CashbackState;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 29
    move-result v3

    .line 30
    .line 31
    if-nez v3, :cond_1

    .line 32
    :goto_1
    move-object v3, v2

    .line 33
    goto :goto_2

    .line 34
    .line 35
    .line 36
    :cond_1
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 37
    move-result-object v2

    .line 38
    .line 39
    .line 40
    invoke-static {v2}, Lcom/revolut/revolutpay/api/ExperienceEnrollment;->valueOf(Ljava/lang/String;)Lcom/revolut/revolutpay/api/ExperienceEnrollment;

    .line 41
    move-result-object v2

    .line 42
    goto :goto_1

    .line 43
    .line 44
    :goto_2
    const-class v2, Lcom/revolut/revolutpay/ui/promo_widget/PromoWidgetContract$DomainState;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 48
    move-result-object v4

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1, v4}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 52
    move-result-object v4

    .line 53
    .line 54
    check-cast v4, Lcom/revolut/revolutpay/ui/promo_widget/PromoWidgetContract$PhoneState;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 58
    move-result-object v5

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1, v5}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 62
    move-result-object v5

    .line 63
    .line 64
    check-cast v5, Lcom/revolut/revolutpay/ui/promo_widget/PromoWidgetContract$EmailState;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 68
    move-result-object v2

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 72
    move-result-object p1

    .line 73
    move-object v6, p1

    .line 74
    .line 75
    check-cast v6, Lcom/revolut/revolutpay/ui/promo_widget/PromoWidgetContract$SendingFlowState;

    .line 76
    move-object v2, v0

    .line 77
    .line 78
    .line 79
    invoke-direct/range {v1 .. v6}, Lcom/revolut/revolutpay/ui/promo_widget/PromoWidgetContract$DomainState;-><init>(Lcom/revolut/revolutpay/api/CashbackState;Lcom/revolut/revolutpay/api/ExperienceEnrollment;Lcom/revolut/revolutpay/ui/promo_widget/PromoWidgetContract$PhoneState;Lcom/revolut/revolutpay/ui/promo_widget/PromoWidgetContract$EmailState;Lcom/revolut/revolutpay/ui/promo_widget/PromoWidgetContract$SendingFlowState;)V

    .line 80
    return-object v1
    .line 81
.end method

.method public final b(I)[Lcom/revolut/revolutpay/ui/promo_widget/PromoWidgetContract$DomainState;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    new-array p1, p1, [Lcom/revolut/revolutpay/ui/promo_widget/PromoWidgetContract$DomainState;

    .line 3
    return-object p1
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
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/revolut/revolutpay/ui/promo_widget/PromoWidgetContract$DomainState$a;->a(Landroid/os/Parcel;)Lcom/revolut/revolutpay/ui/promo_widget/PromoWidgetContract$DomainState;

    .line 4
    move-result-object p1

    .line 5
    return-object p1
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
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/revolut/revolutpay/ui/promo_widget/PromoWidgetContract$DomainState$a;->b(I)[Lcom/revolut/revolutpay/ui/promo_widget/PromoWidgetContract$DomainState;

    .line 4
    move-result-object p1

    .line 5
    return-object p1
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
.end method
