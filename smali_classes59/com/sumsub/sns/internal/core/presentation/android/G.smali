.class public final Lcom/sumsub/sns/internal/core/presentation/android/G;
.super Lcom/sumsub/sns/internal/core/presentation/android/K;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/sumsub/sns/internal/core/presentation/android/G;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final e:Lcom/sumsub/sns/internal/core/presentation/android/G;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/core/presentation/android/G;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/sumsub/sns/internal/core/presentation/android/G;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/sumsub/sns/internal/core/presentation/android/G;->e:Lcom/sumsub/sns/internal/core/presentation/android/G;

    .line 8
    .line 9
    new-instance v0, Lcom/sumsub/sns/internal/core/presentation/android/F;

    .line 10
    .line 11
    .line 12
    invoke-direct {v0}, Lcom/sumsub/sns/internal/core/presentation/android/F;-><init>()V

    .line 13
    .line 14
    sput-object v0, Lcom/sumsub/sns/internal/core/presentation/android/G;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 15
    return-void
    .line 16
    .line 17
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/internal/core/analytics/PermissionPayload;->MICROPHONE_PERMISSION:Lcom/sumsub/sns/internal/core/analytics/PermissionPayload;

    .line 3
    .line 4
    const-string v1, "android.permission.RECORD_AUDIO"

    .line 5
    .line 6
    .line 7
    const-string/jumbo v2, "sns_alert_lackOfMicrophonePermissions"

    .line 8
    .line 9
    const-string v3, "Microphone"

    .line 10
    .line 11
    .line 12
    invoke-direct {p0, v3, v1, v0, v2}, Lcom/sumsub/sns/internal/core/presentation/android/K;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/core/analytics/PermissionPayload;Ljava/lang/String;)V

    .line 13
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
.end method


# virtual methods
.method public final describeContents()I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
    .line 3
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
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 1
    const/4 p2, 0x1

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 5
    return-void
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
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method
