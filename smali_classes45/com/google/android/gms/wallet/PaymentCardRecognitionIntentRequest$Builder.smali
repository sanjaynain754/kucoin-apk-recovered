.class public final Lcom/google/android/gms/wallet/PaymentCardRecognitionIntentRequest$Builder;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-wallet@@19.3.0"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/wallet/PaymentCardRecognitionIntentRequest;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "Builder"
.end annotation


# instance fields
.field final synthetic zza:Lcom/google/android/gms/wallet/PaymentCardRecognitionIntentRequest;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/wallet/PaymentCardRecognitionIntentRequest;Lcom/google/android/gms/wallet/zzx;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/google/android/gms/wallet/PaymentCardRecognitionIntentRequest$Builder;->zza:Lcom/google/android/gms/wallet/PaymentCardRecognitionIntentRequest;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    return-void
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
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method


# virtual methods
.method public build()Lcom/google/android/gms/wallet/PaymentCardRecognitionIntentRequest;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/google/android/gms/wallet/PaymentCardRecognitionIntentRequest$Builder;->zza:Lcom/google/android/gms/wallet/PaymentCardRecognitionIntentRequest;

    .line 3
    .line 4
    iget v0, v0, Lcom/google/android/gms/wallet/PaymentCardRecognitionIntentRequest;->zza:I

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    const/4 v0, 0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    .line 11
    :goto_0
    const-string v1, "The paymentCardRecognitionType is required when creating a PaymentCardRecognitionIntentRequest."

    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/Preconditions;->checkArgument(ZLjava/lang/Object;)V

    .line 15
    .line 16
    iget-object v0, p0, Lcom/google/android/gms/wallet/PaymentCardRecognitionIntentRequest$Builder;->zza:Lcom/google/android/gms/wallet/PaymentCardRecognitionIntentRequest;

    .line 17
    return-object v0
    .line 18
.end method
