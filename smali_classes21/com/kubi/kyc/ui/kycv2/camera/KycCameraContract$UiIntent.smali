.class public abstract Lcom/kubi/kyc/ui/kycv2/camera/KycCameraContract$UiIntent;
.super Ljava/lang/Object;
.source "KycCameraContract.kt"

# interfaces
.implements Lcom/kubi/mvi/state/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/kyc/ui/kycv2/camera/KycCameraContract$UiIntent$CameraInit;,
        Lcom/kubi/kyc/ui/kycv2/camera/KycCameraContract$UiIntent$CameraReset;,
        Lcom/kubi/kyc/ui/kycv2/camera/KycCameraContract$UiIntent$ShutterButtonClick;,
        Lcom/kubi/kyc/ui/kycv2/camera/KycCameraContract$UiIntent$StartPreview;,
        Lcom/kubi/kyc/ui/kycv2/camera/KycCameraContract$UiIntent$SwitchCameraClick;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\u0008B\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\u000c\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/kubi/kyc/ui/kycv2/camera/KycCameraContract$UiIntent;",
        "Lcom/kubi/mvi/state/IIntent;",
        "<init>",
        "()V",
        "SwitchCameraClick",
        "ShutterButtonClick",
        "CameraInit",
        "CameraReset",
        "StartPreview",
        "Lcom/kubi/kyc/ui/kycv2/camera/KycCameraContract$UiIntent$CameraInit;",
        "Lcom/kubi/kyc/ui/kycv2/camera/KycCameraContract$UiIntent$CameraReset;",
        "Lcom/kubi/kyc/ui/kycv2/camera/KycCameraContract$UiIntent$ShutterButtonClick;",
        "Lcom/kubi/kyc/ui/kycv2/camera/KycCameraContract$UiIntent$StartPreview;",
        "Lcom/kubi/kyc/ui/kycv2/camera/KycCameraContract$UiIntent$SwitchCameraClick;",
        "KycLib_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kubi/kyc/ui/kycv2/camera/KycCameraContract$UiIntent;-><init>()V

    return-void
.end method
