.class public interface abstract Lcom/kubi/qrcode/api/service/IQrCodeService;
.super Ljava/lang/Object;
.source "IQrCodeService.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/qrcode/api/service/IQrCodeService$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u0008g\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0016\u0010\u0006\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0008\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\"\u0010\u000c\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u00082\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H&\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\u0013\u00c0\u0006\u0001"
    }
    d2 = {
        "Lcom/kubi/qrcode/api/service/IQrCodeService;",
        "",
        "handleScanCodeResult",
        "",
        "activity",
        "Lcom/kubi/sdk/BaseActivity;",
        "complete",
        "Lkotlin/Function1;",
        "",
        "handleScanCode",
        "fragment",
        "Lcom/kubi/sdk/BaseFragment;",
        "encodeAsBitmap",
        "Landroid/graphics/Bitmap;",
        "str",
        "width",
        "",
        "height",
        "Companion",
        "QrCodeApi_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lvx/b;
.end annotation


# static fields
.field public static final a:Lcom/kubi/qrcode/api/service/IQrCodeService$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/qrcode/api/service/IQrCodeService$Companion;->a:Lcom/kubi/qrcode/api/service/IQrCodeService$Companion;

    .line 3
    .line 4
    sput-object v0, Lcom/kubi/qrcode/api/service/IQrCodeService;->a:Lcom/kubi/qrcode/api/service/IQrCodeService$Companion;

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
.end method


# virtual methods
.method public abstract encodeAsBitmap(Ljava/lang/String;II)Landroid/graphics/Bitmap;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract handleScanCode(Lcom/kubi/sdk/BaseFragment;)V
    .param p1    # Lcom/kubi/sdk/BaseFragment;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract handleScanCodeResult(Lcom/kubi/sdk/BaseActivity;Lkotlin/jvm/functions/Function1;)V
    .param p1    # Lcom/kubi/sdk/BaseActivity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/sdk/BaseActivity;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation
.end method
