.class Lcom/google/android/material/button/MaterialButton$1;
.super Landroidx/dynamicanimation/animation/FloatPropertyCompat;
.source "MaterialButton.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/material/button/MaterialButton;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/dynamicanimation/animation/FloatPropertyCompat<",
        "Lcom/google/android/material/button/MaterialButton;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Landroidx/dynamicanimation/animation/FloatPropertyCompat;-><init>(Ljava/lang/String;)V

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
.end method


# virtual methods
.method public getValue(Lcom/google/android/material/button/MaterialButton;)F
    .locals 0

    .line 2
    invoke-static {p1}, Lcom/google/android/material/button/MaterialButton;->access$000(Lcom/google/android/material/button/MaterialButton;)F

    move-result p1

    return p1
.end method

.method public bridge synthetic getValue(Ljava/lang/Object;)F
    .locals 0

    .line 1
    check-cast p1, Lcom/google/android/material/button/MaterialButton;

    invoke-virtual {p0, p1}, Lcom/google/android/material/button/MaterialButton$1;->getValue(Lcom/google/android/material/button/MaterialButton;)F

    move-result p1

    return p1
.end method

.method public setValue(Lcom/google/android/material/button/MaterialButton;F)V
    .locals 0

    .line 2
    invoke-static {p1, p2}, Lcom/google/android/material/button/MaterialButton;->access$100(Lcom/google/android/material/button/MaterialButton;F)V

    return-void
.end method

.method public bridge synthetic setValue(Ljava/lang/Object;F)V
    .locals 0

    .line 1
    check-cast p1, Lcom/google/android/material/button/MaterialButton;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/material/button/MaterialButton$1;->setValue(Lcom/google/android/material/button/MaterialButton;F)V

    return-void
.end method
