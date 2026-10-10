.class public interface abstract Luh/b;
.super Ljava/lang/Object;
.source "ISettingService.kt"

# interfaces
.implements Luh/a;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008f\u0018\u00002\u00020\u0001J\u0008\u0010\u0002\u001a\u00020\u0003H&J\u0008\u0010\u0004\u001a\u00020\u0005H&J\u001c\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u0008H&J\u000e\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u000bH&J\u0010\u0010\u000c\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH&J\u000e\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u0010H&J\u0008\u0010\u0011\u001a\u00020\u000eH&J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u000eH&J\u0008\u0010\u0015\u001a\u00020\u0003H&J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H&J\u0010\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u001bH&J\u000e\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u0010H&J\u0008\u0010\u001d\u001a\u00020\u001bH&J\n\u0010\u001e\u001a\u0004\u0018\u00010\u001fH&J\n\u0010 \u001a\u0004\u0018\u00010\u001fH&\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006!\u00c0\u0006\u0001"
    }
    d2 = {
        "Lcom/kubi/futures/data/setting/ISettingService;",
        "Lcom/kubi/futures/data/setting/ISettingApi;",
        "fetchInitData",
        "",
        "getUserConfig",
        "Lcom/kubi/kumex/data/platform/model/UserConfig;",
        "updateUserConfig",
        "map",
        "",
        "",
        "observeUserConfig",
        "Lio/reactivex/Flowable;",
        "updatePreferencesSettings",
        "new",
        "Lcom/kubi/kumex/data/platform/model/PreferencesEntity;",
        "observePreferencesSettings",
        "Lio/reactivex/Observable;",
        "getPreferencesSettings",
        "submitPreferencesSettings",
        "",
        "entity",
        "initPreferencesSettingsMemory",
        "getTaxRate",
        "Ljava/math/BigDecimal;",
        "isTrial",
        "",
        "updateTradingNoticeSettings",
        "Lcom/kubi/kumex/data/platform/model/TradingNoticeEntity;",
        "observeTradingNoticeSettings",
        "getTradingNoticeSettings",
        "fetchAuUserCategoryCached",
        "Lcom/kubi/kumex/data/trade/model/AuUserCategoryVO;",
        "getAuUserCategory",
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


# virtual methods
.method public abstract F0()Lcom/kubi/kumex/data/platform/model/UserConfig;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract c(Lcom/kubi/kumex/data/platform/model/TradingNoticeEntity;)V
    .param p1    # Lcom/kubi/kumex/data/platform/model/TradingNoticeEntity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract e()V
.end method

.method public abstract f()V
.end method

.method public abstract g()Lcom/kubi/kumex/data/platform/model/TradingNoticeEntity;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract i(Lcom/kubi/kumex/data/platform/model/PreferencesEntity;)V
    .param p1    # Lcom/kubi/kumex/data/platform/model/PreferencesEntity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract k()Lcom/kubi/kumex/data/trade/model/AuUserCategoryVO;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract m()Lcom/kubi/kumex/data/platform/model/PreferencesEntity;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract o()Lio/reactivex/Flowable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Flowable<",
            "Lcom/kubi/kumex/data/platform/model/UserConfig;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract p()Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lcom/kubi/kumex/data/platform/model/PreferencesEntity;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract q(Ljava/util/Map;)V
    .param p1    # Ljava/util/Map;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract r(Lcom/kubi/kumex/data/platform/model/PreferencesEntity;)Ljava/lang/Object;
    .param p1    # Lcom/kubi/kumex/data/platform/model/PreferencesEntity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract s()Lcom/kubi/kumex/data/trade/model/AuUserCategoryVO;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract t()Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lcom/kubi/kumex/data/platform/model/TradingNoticeEntity;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract w(Z)Ljava/math/BigDecimal;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method
