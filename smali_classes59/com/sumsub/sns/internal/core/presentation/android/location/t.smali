.class public abstract Lcom/sumsub/sns/internal/core/presentation/android/location/t;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# direct methods
.method public static a(Landroid/content/Context;)Lkotlin/jvm/functions/Function0;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    .line 2
    const-class v0, Landroid/location/LocationManager;

    invoke-static {p0, v0}, Landroidx/core/content/ContextCompat;->getSystemService(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    .line 3
    check-cast p0, Landroid/location/LocationManager;

    .line 4
    new-instance v0, Lcom/sumsub/sns/internal/core/presentation/android/location/y;

    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/core/presentation/android/location/y;-><init>(Landroid/location/LocationManager;)V

    return-object v0
.end method

.method public static final a(Landroid/location/LocationManager;)Z
    .locals 0

    if-eqz p0, :cond_0

    .line 5
    invoke-static {p0}, Landroidx/core/location/LocationManagerCompat;->isLocationEnabled(Landroid/location/LocationManager;)Z

    move-result p0

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method
