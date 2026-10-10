.class public interface abstract Lwk/a;
.super Ljava/lang/Object;
.source "GpsApi.kt"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "KCRetrofitAPICheck"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008g\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00010\u00040\u00032\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0006H\'\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\u0007\u00c0\u0006\u0001"
    }
    d2 = {
        "Lcom/kubi/kucoin/api/GpsApi;",
        "",
        "uploadGPS",
        "Lio/reactivex/Observable;",
        "Lcom/kubi/sdk/base/entity/BaseEntity;",
        "gpsEntity",
        "Lcom/kubi/kucoin/entity/GPSEntity;",
        "LLocation_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract a(Lcom/kubi/kucoin/entity/GPSEntity;)Lio/reactivex/Observable;
    .param p1    # Lcom/kubi/kucoin/entity/GPSEntity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/kucoin/entity/GPSEntity;",
            ")",
            "Lio/reactivex/Observable<",
            "Lcom/kubi/sdk/base/entity/BaseEntity<",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "v1/user/event/gps"
    .end annotation
.end method
