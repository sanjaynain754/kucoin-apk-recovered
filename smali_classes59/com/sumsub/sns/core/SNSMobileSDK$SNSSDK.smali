.class public final Lcom/sumsub/sns/core/SNSMobileSDK$SNSSDK;
.super Lcom/sumsub/sns/core/SNSMobileSDK$SDK;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sumsub/sns/core/SNSMobileSDK;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "SNSSDK"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0008\u0010\n\u001a\u00020\u000bH\u0016R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\t\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/sumsub/sns/core/SNSMobileSDK$SNSSDK;",
        "Lcom/sumsub/sns/core/SNSMobileSDK$SDK;",
        "builder",
        "Lcom/sumsub/sns/core/SNSMobileSDK$Builder;",
        "<init>",
        "(Lcom/sumsub/sns/core/SNSMobileSDK$Builder;)V",
        "stateChangedHandler",
        "Lcom/sumsub/sns/core/data/listener/SNSStateChangedHandler;",
        "getStateChangedHandler$idensic_mobile_sdk_aar_defaultRelease",
        "()Lcom/sumsub/sns/core/data/listener/SNSStateChangedHandler;",
        "launch",
        "",
        "idensic-mobile-sdk-aar_defaultRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final stateChangedHandler:Lcom/sumsub/sns/core/data/listener/SNSStateChangedHandler;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/core/SNSMobileSDK$Builder;)V
    .locals 0
    .param p1    # Lcom/sumsub/sns/core/SNSMobileSDK$Builder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/sumsub/sns/core/SNSMobileSDK$SDK;-><init>(Lcom/sumsub/sns/core/SNSMobileSDK$Builder;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/sumsub/sns/core/SNSMobileSDK$Builder;->getStateChangedHandler$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/core/data/listener/SNSStateChangedHandler;

    .line 7
    move-result-object p1

    .line 8
    .line 9
    iput-object p1, p0, Lcom/sumsub/sns/core/SNSMobileSDK$SNSSDK;->stateChangedHandler:Lcom/sumsub/sns/core/data/listener/SNSStateChangedHandler;

    .line 10
    return-void
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


# virtual methods
.method public final getStateChangedHandler$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/core/data/listener/SNSStateChangedHandler;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/SNSMobileSDK$SNSSDK;->stateChangedHandler:Lcom/sumsub/sns/core/data/listener/SNSStateChangedHandler;

    .line 3
    return-object v0
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

.method public launch()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/sumsub/sns/core/SNSMobileSDK$SDK;->launch()V

    .line 4
    .line 5
    sget-object v0, Lcom/sumsub/sns/core/SNSMobileSDK;->INSTANCE:Lcom/sumsub/sns/core/SNSMobileSDK;

    .line 6
    .line 7
    .line 8
    invoke-static {v0, p0}, Lcom/sumsub/sns/core/SNSMobileSDK;->access$start(Lcom/sumsub/sns/core/SNSMobileSDK;Lcom/sumsub/sns/core/SNSMobileSDK$SDK;)V

    .line 9
    return-void
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method
