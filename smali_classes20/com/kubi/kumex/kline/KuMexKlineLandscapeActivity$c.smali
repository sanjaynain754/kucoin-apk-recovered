.class public final Lcom/kubi/kumex/kline/KuMexKlineLandscapeActivity$c;
.super Ljava/lang/Object;
.source "KuMexKlineLandscapeActivity.kt"

# interfaces
.implements Lcom/google/android/material/tabs/TabLayout$OnTabSelectedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/kumex/kline/KuMexKlineLandscapeActivity;->Z0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016\u00a8\u0006\u0008"
    }
    d2 = {
        "com/kubi/kumex/kline/KuMexKlineLandscapeActivity$initListener$3",
        "Lcom/google/android/material/tabs/TabLayout$OnTabSelectedListener;",
        "onTabUnselected",
        "",
        "tab",
        "Lcom/google/android/material/tabs/TabLayout$Tab;",
        "onTabSelected",
        "onTabReselected",
        "KumexLib_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic a:Lcom/kubi/kumex/kline/KuMexKlineLandscapeActivity;


# direct methods
.method public constructor <init>(Lcom/kubi/kumex/kline/KuMexKlineLandscapeActivity;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/kumex/kline/KuMexKlineLandscapeActivity$c;->a:Lcom/kubi/kumex/kline/KuMexKlineLandscapeActivity;

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
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
.end method


# virtual methods
.method public onTabReselected(Lcom/google/android/material/tabs/TabLayout$Tab;)V
    .locals 0

    .line 1
    return-void
    .line 2
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
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
.end method

.method public onTabSelected(Lcom/google/android/material/tabs/TabLayout$Tab;)V
    .locals 2

    .line 1
    .line 2
    const-string v0, "tab"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/kubi/kumex/kline/KuMexKlineLandscapeActivity$c;->a:Lcom/kubi/kumex/kline/KuMexKlineLandscapeActivity;

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Lcom/kubi/kumex/kline/KuMexKlineLandscapeActivity;->J0(Lcom/kubi/kumex/kline/KuMexKlineLandscapeActivity;)I

    .line 11
    move-result v0

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Lcom/google/android/material/tabs/TabLayout$Tab;->getPosition()I

    .line 15
    move-result v1

    .line 16
    .line 17
    if-ne v0, v1, :cond_0

    .line 18
    return-void

    .line 19
    .line 20
    :cond_0
    iget-object v0, p0, Lcom/kubi/kumex/kline/KuMexKlineLandscapeActivity$c;->a:Lcom/kubi/kumex/kline/KuMexKlineLandscapeActivity;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Lcom/google/android/material/tabs/TabLayout$Tab;->getPosition()I

    .line 24
    move-result p1

    .line 25
    .line 26
    .line 27
    invoke-static {v0, p1}, Lcom/kubi/kumex/kline/KuMexKlineLandscapeActivity;->L0(Lcom/kubi/kumex/kline/KuMexKlineLandscapeActivity;I)V

    .line 28
    .line 29
    sget-object p1, Lgf/b0;->a:Lgf/b0;

    .line 30
    .line 31
    iget-object v0, p0, Lcom/kubi/kumex/kline/KuMexKlineLandscapeActivity$c;->a:Lcom/kubi/kumex/kline/KuMexKlineLandscapeActivity;

    .line 32
    .line 33
    .line 34
    invoke-static {v0}, Lcom/kubi/kumex/kline/KuMexKlineLandscapeActivity;->J0(Lcom/kubi/kumex/kline/KuMexKlineLandscapeActivity;)I

    .line 35
    move-result v0

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1, v0}, Lgf/b0;->s(I)V

    .line 39
    .line 40
    iget-object v0, p0, Lcom/kubi/kumex/kline/KuMexKlineLandscapeActivity$c;->a:Lcom/kubi/kumex/kline/KuMexKlineLandscapeActivity;

    .line 41
    .line 42
    .line 43
    invoke-static {v0}, Lcom/kubi/kumex/kline/KuMexKlineLandscapeActivity;->K0(Lcom/kubi/kumex/kline/KuMexKlineLandscapeActivity;)Lcom/kubi/kumex/kline/KuMexFlutterKlineFragment;

    .line 44
    move-result-object v0

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1}, Lgf/b0;->d()I

    .line 48
    move-result p1

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, p1}, Lcom/kubi/kumex/kline/KuMexFlutterKlineFragment;->u3(I)V

    .line 52
    return-void
    .line 53
    .line 54
    .line 55
    .line 56
.end method

.method public onTabUnselected(Lcom/google/android/material/tabs/TabLayout$Tab;)V
    .locals 0

    .line 1
    return-void
    .line 2
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
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
.end method
