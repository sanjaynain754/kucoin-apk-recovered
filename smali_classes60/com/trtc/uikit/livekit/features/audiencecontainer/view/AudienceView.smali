.class public final Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;
.super Lcom/trtc/uikit/livekit/features/audiencecontainer/view/BasicView;
.source "AudienceView.kt"

# interfaces
.implements Lee0/f$a;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "ViewConstructor"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$Companion;,
        Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$a;,
        Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$b;,
        Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$c;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00c2\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\'\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0008\u0003\n\u0002\u0008\u0003\n\u0002\u0008\u0003\n\u0002\u0008\u0003\n\u0002\u0008\u0006*\n\u00ba\u0001\u00bd\u0001\u00c0\u0001\u00c3\u0001\u00c6\u0001\u0008\u0007\u0018\u0000 \u00ca\u00012\u00020\u00012\u00020\u0002:\u0006\u00c8\u0001\u00c9\u0001\u00ca\u0001B\'\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\t\u0010\nJ\u000e\u0010W\u001a\u00020X2\u0006\u0010\u000b\u001a\u00020\u000cJ\u0006\u0010Y\u001a\u00020XJ\u0006\u0010Z\u001a\u00020[J\u000e\u0010\\\u001a\u00020X2\u0006\u0010]\u001a\u00020^J\u0008\u0010_\u001a\u00020XH\u0014J\u0008\u0010`\u001a\u00020XH\u0014J\u0008\u0010a\u001a\u00020XH\u0014J\u0008\u0010b\u001a\u00020XH\u0002J\u0010\u0010c\u001a\u00020X2\u0006\u0010\u000b\u001a\u00020\u000cH\u0002J\u0010\u0010d\u001a\u00020K2\u0006\u0010e\u001a\u00020fH\u0016J\u000e\u0010g\u001a\u00020X2\u0006\u0010h\u001a\u00020KJ\u0006\u0010i\u001a\u00020XJ\u0006\u0010j\u001a\u00020XJ\u0006\u0010k\u001a\u00020XJ\u0006\u0010l\u001a\u00020XJ\u0010\u0010m\u001a\u00020X2\u0008\u0010n\u001a\u0004\u0018\u00010IJ\u0006\u0010S\u001a\u00020KJ\u0008\u0010o\u001a\u00020XH\u0002J\u0010\u0010p\u001a\u00020X2\u0006\u0010q\u001a\u00020KH\u0002J\u0010\u0010r\u001a\u00020X2\u0006\u0010q\u001a\u00020KH\u0002J\u0008\u0010s\u001a\u00020KH\u0002J\u0008\u0010t\u001a\u00020uH\u0002J\u0010\u0010v\u001a\u00020w2\u0006\u0010q\u001a\u00020KH\u0002J\u001a\u0010x\u001a\u00020X2\u0008\u0010y\u001a\u0004\u0018\u00010[2\u0006\u0010z\u001a\u00020\u0008H\u0002J\u0008\u0010{\u001a\u00020XH\u0002J\u0008\u0010|\u001a\u00020XH\u0002J\u0012\u0010}\u001a\u00020X2\u0008\u0010~\u001a\u0004\u0018\u00010\u007fH\u0002J\u0011\u0010\u0080\u0001\u001a\u00020X2\u0006\u0010~\u001a\u00020\u007fH\u0002J\u0011\u0010\u0081\u0001\u001a\u00020X2\u0006\u0010~\u001a\u00020\u007fH\u0002J\t\u0010\u0082\u0001\u001a\u00020XH\u0002J\t\u0010\u0083\u0001\u001a\u00020XH\u0002J\t\u0010\u0084\u0001\u001a\u00020XH\u0014J\t\u0010\u0085\u0001\u001a\u00020XH\u0014J\u0011\u0010\u0086\u0001\u001a\u00020X2\u0006\u0010\u000b\u001a\u00020\u000cH\u0002J\t\u0010\u0087\u0001\u001a\u00020XH\u0002J\t\u0010\u0088\u0001\u001a\u00020XH\u0002J\u0011\u0010\u0089\u0001\u001a\u00020X2\u0006\u0010\u000b\u001a\u00020\u000cH\u0002J\u0011\u0010\u008a\u0001\u001a\u00020X2\u0006\u0010\u000b\u001a\u00020\u000cH\u0002J\t\u0010\u008b\u0001\u001a\u00020XH\u0002J\u0012\u0010\u008c\u0001\u001a\u00020X2\u0007\u0010\u008d\u0001\u001a\u00020KH\u0002J\u0011\u0010\u008e\u0001\u001a\u00020X2\u0006\u0010\u000b\u001a\u00020\u000cH\u0002J\t\u0010\u008f\u0001\u001a\u00020XH\u0002J\t\u0010\u0090\u0001\u001a\u00020XH\u0002J\t\u0010\u0091\u0001\u001a\u00020XH\u0002J\t\u0010\u0092\u0001\u001a\u00020XH\u0002J\u0011\u0010\u0093\u0001\u001a\u00020X2\u0006\u0010\u000b\u001a\u00020\u000cH\u0002J\u0011\u0010\u0094\u0001\u001a\u00020X2\u0006\u0010\u000b\u001a\u00020\u000cH\u0002J\u0011\u0010\u0095\u0001\u001a\u00020X2\u0006\u0010\u000b\u001a\u00020\u000cH\u0002J\u0011\u0010\u0096\u0001\u001a\u00020X2\u0006\u0010\u000b\u001a\u00020\u000cH\u0002J\u0011\u0010\u0097\u0001\u001a\u00020X2\u0006\u0010\u000b\u001a\u00020\u000cH\u0002J\u0011\u0010\u0098\u0001\u001a\u00020X2\u0006\u0010\u000b\u001a\u00020\u000cH\u0002J\t\u0010\u0099\u0001\u001a\u00020XH\u0002J\t\u0010\u009a\u0001\u001a\u00020XH\u0002J\t\u0010\u009b\u0001\u001a\u00020XH\u0002J\t\u0010\u009c\u0001\u001a\u00020XH\u0002J\t\u0010\u009d\u0001\u001a\u00020XH\u0002J\t\u0010\u009e\u0001\u001a\u00020XH\u0002J\u001a\u0010\u009f\u0001\u001a\u00020X2\u0007\u0010\u00a0\u0001\u001a\u00020\u00082\u0006\u0010q\u001a\u00020KH\u0002J\u0007\u0010\u00a1\u0001\u001a\u00020XJ\u0007\u0010\u00a2\u0001\u001a\u00020XJ\u0007\u0010\u00a3\u0001\u001a\u00020XJ\t\u0010\u00a4\u0001\u001a\u00020XH\u0002J\u001a\u0010\u00a5\u0001\u001a\u00020X2\u000f\u0010\u00a6\u0001\u001a\n\u0012\u0005\u0012\u00030\u00a8\u00010\u00a7\u0001H\u0003J\u0012\u0010\u00a9\u0001\u001a\u00020X2\u0007\u0010\u00aa\u0001\u001a\u00020KH\u0002J\u0012\u0010\u00ab\u0001\u001a\u00020X2\u0007\u0010\u00aa\u0001\u001a\u00020KH\u0002J\u0012\u0010\u00ac\u0001\u001a\u00020X2\u0007\u0010\u00aa\u0001\u001a\u00020KH\u0002J\u0012\u0010\u00ad\u0001\u001a\u00020X2\u0007\u0010\u00aa\u0001\u001a\u00020KH\u0002J\u0012\u0010\u00ae\u0001\u001a\u00020X2\u0007\u0010\u00af\u0001\u001a\u00020KH\u0002J\u0014\u0010\u00b0\u0001\u001a\u00020X2\t\u0010\u00b1\u0001\u001a\u0004\u0018\u00010VH\u0002J\u001a\u0010\u00b2\u0001\u001a\u00020X2\u0007\u0010\u00b3\u0001\u001a\u0002092\u0006\u0010h\u001a\u00020KH\u0002J\t\u0010\u00b4\u0001\u001a\u00020XH\u0002J\u0012\u0010\u00b5\u0001\u001a\u00020X2\u0007\u0010\u00b6\u0001\u001a\u00020[H\u0016J\u0012\u0010\u00b7\u0001\u001a\u00020[2\u0007\u0010\u00b8\u0001\u001a\u00020VH\u0002R\u000e\u0010\u000b\u001a\u00020\u000cX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\'\u001a\u00020(X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020*X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u00102\u001a\u000203X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u00104\u001a\u000205X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u00106\u001a\u000207X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u00108\u001a\u000209X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020;X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020=X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020?X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020AX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010B\u001a\u0004\u0018\u00010CX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010D\u001a\u0004\u0018\u00010EX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010F\u001a\u0004\u0018\u00010GX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010H\u001a\u0004\u0018\u00010IX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010J\u001a\u00020KX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010L\u001a\u0008\u0018\u00010MR\u00020\u0000X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010N\u001a\u00020OX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010P\u001a\u00020OX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010Q\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010R\u001a\u00020KX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010S\u001a\u00020KX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010T\u001a\u00020KX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010U\u001a\u0004\u0018\u00010VX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0013\u0010\u00b9\u0001\u001a\u00030\u00ba\u0001X\u0082\u0004\u00a2\u0006\u0005\n\u0003\u0010\u00bb\u0001R\u0013\u0010\u00bc\u0001\u001a\u00030\u00bd\u0001X\u0082\u0004\u00a2\u0006\u0005\n\u0003\u0010\u00be\u0001R\u0013\u0010\u00bf\u0001\u001a\u00030\u00c0\u0001X\u0082\u0004\u00a2\u0006\u0005\n\u0003\u0010\u00c1\u0001R\u0013\u0010\u00c2\u0001\u001a\u00030\u00c3\u0001X\u0082\u0004\u00a2\u0006\u0005\n\u0003\u0010\u00c4\u0001R\u0013\u0010\u00c5\u0001\u001a\u00030\u00c6\u0001X\u0082\u0004\u00a2\u0006\u0005\n\u0003\u0010\u00c7\u0001\u00a8\u0006\u00cb\u0001"
    }
    d2 = {
        "Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;",
        "Lcom/trtc/uikit/livekit/features/audiencecontainer/view/BasicView;",
        "Lcom/trtc/uikit/livekit/features/audiencecontainer/store/AudienceStore$AudienceViewListener;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "defStyleAttr",
        "",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "liveInfo",
        "Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;",
        "liveCoreView",
        "Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;",
        "liveCoreViewMaskBackgroundView",
        "Lcom/trtc/uikit/livekit/features/audiencecontainer/view/LiveCoreViewMaskBackgroundView;",
        "layoutPlaying",
        "Landroid/widget/FrameLayout;",
        "layoutLiveCoreView",
        "layoutLiveCoreViewMask",
        "ivVideoViewBackground",
        "Landroid/widget/ImageView;",
        "kcAudiencePreviewView",
        "Lcom/trtc/uikit/livekit/kc/widget/KCAudiencePreviewView;",
        "imageMore",
        "buttonGift",
        "Lcom/trtc/uikit/livekit/component/giftaccess/GiftButton;",
        "buttonLike",
        "Lcom/trtc/uikit/livekit/component/gift/LikeButton;",
        "imageCoGuest",
        "barrageInputView",
        "Lcom/trtc/uikit/livekit/component/barrage/BarrageInputView;",
        "roomInfoView",
        "Lcom/trtc/uikit/livekit/component/roominfo/LiveInfoView;",
        "giftPlayView",
        "Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;",
        "audienceListView",
        "Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView;",
        "barrageStreamView",
        "Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView;",
        "networkInfoView",
        "Lcom/trtc/uikit/livekit/component/networkInfo/NetworkInfoView;",
        "imageFloatWindow",
        "imagePreviewShare",
        "imagePreviewReport",
        "imageStandardExit",
        "imageCompactExit",
        "layoutSwitchOrientationButton",
        "imageSwitchOrientationIcon",
        "waitingCoGuestPassView",
        "Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/CoGuestRequestFloatView;",
        "audiencePlayingRootView",
        "Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudiencePlayingRootView;",
        "mainScope",
        "Lkotlinx/coroutines/CoroutineScope;",
        "bottomFunctionView",
        "Landroid/view/View;",
        "peopleCountView",
        "Lcom/trtc/uikit/livekit/kc/widget/KCPeopleCountView;",
        "riskView",
        "Lcom/trtc/uikit/livekit/kc/widget/KCRiskView;",
        "tradeCardView",
        "Lcom/trtc/uikit/livekit/kc/widget/KCTradeCardView;",
        "kcRoomInfoService",
        "Lcom/trtc/uikit/livekit/kc/roominfo/service/KCRoomInfoService;",
        "endLiveDialog",
        "Lio/trtc/tuikit/atomicx/widget/basicwidget/alertdialog/AtomicAlertDialog;",
        "userInfoDialog",
        "Lcom/trtc/uikit/livekit/features/audiencecontainer/view/userinfo/UserInfoDialog;",
        "anchorManagerDialog",
        "Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;",
        "viewObserver",
        "Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$ViewObserver;",
        "isLoading",
        "",
        "videoViewAdapterImpl",
        "Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$VideoViewAdapterImpl;",
        "touchX",
        "",
        "touchY",
        "touchSlop",
        "isSwiping",
        "isLiveStreaming",
        "isClickEmptySeat",
        "playbackQuality",
        "Lio/trtc/tuikit/atomicxcore/api/device/VideoQuality;",
        "init",
        "",
        "initStore",
        "getRoomId",
        "",
        "setAudienceContainerViewListenerList",
        "viewListenerList",
        "Lcom/trtc/uikit/livekit/features/audiencecontainer/store/observer/AudienceContainerViewListenerList;",
        "initView",
        "addObserver",
        "removeObserver",
        "initFloatWindowView",
        "initPreviewView",
        "dispatchTouchEvent",
        "event",
        "Landroid/view/MotionEvent;",
        "enablePictureInPictureMode",
        "enable",
        "startPreviewLiveStream",
        "stopPreviewLiveStream",
        "joinRoom",
        "leaveRoom",
        "setViewObserver",
        "observer",
        "initSwitchOrientationButtonView",
        "setScreenOrientation",
        "isPortrait",
        "updateViewByOrientation",
        "isScreenPortrait",
        "getScreenPoint",
        "Landroid/graphics/Point;",
        "getSwitchScreenButtonPosition",
        "Landroid/widget/FrameLayout$LayoutParams;",
        "setLayoutBackground",
        "imageUrl",
        "seatLayoutTemplateId",
        "onViewLoading",
        "onViewFinished",
        "showCoGuestManageDialog",
        "userInfo",
        "Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;",
        "showAnchorManagerDialog",
        "showUserInfoDialog",
        "setVideoViewAdapter",
        "createVideoMuteBitmap",
        "onAttachedToWindow",
        "onDetachedFromWindow",
        "initComponentView",
        "initMoreIcon",
        "initCoGuestVisibility",
        "initAudienceListView",
        "initPeopleCountView",
        "initTradeCardView",
        "updateBarrageStreamViewMargin",
        "isTradeCardVisible",
        "initNetworkView",
        "initExitRoomView",
        "initPreviewShareButton",
        "initPreviewReportButton",
        "updatePreviewTopActions",
        "initRoomInfoView",
        "initBarrageStreamView",
        "initBarrageInputView",
        "initGiftView",
        "initLikeView",
        "initGiftPlayView",
        "initCoGuestIcon",
        "initWaitingCoGuestPassView",
        "cancelCoGuestRequest",
        "stopCoGuest",
        "showStopCoGuestDialog",
        "showCancelCoGuestRequestDialog",
        "setCoreViewLayoutParamsWhenLandscape",
        "templateId",
        "subscribeObserver",
        "unsubscribeObserver",
        "onExitButtonClick",
        "onLinkStatusChange",
        "onCoHostConnectedUsersChanged",
        "connectedList",
        "",
        "Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;",
        "onHeaderFloatWinDisable",
        "disable",
        "onHeaderLiveDataDisable",
        "onHeaderVisitorCntDisable",
        "onFooterCoGuestDisable",
        "onVideoOrientationChanged",
        "videoStreamIsLandscape",
        "onPlaybackQualityChanged",
        "videoQuality",
        "enableView",
        "view",
        "showLiveStreamEndDialog",
        "onRoomDismissed",
        "roomId",
        "videoQualityToString",
        "quality",
        "liveListListener",
        "com/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$liveListListener$1",
        "Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$liveListListener$1;",
        "seatListener",
        "com/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$seatListener$1",
        "Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$seatListener$1;",
        "conGuestListener",
        "com/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$conGuestListener$1",
        "Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$conGuestListener$1;",
        "battleListener",
        "com/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$battleListener$1",
        "Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$battleListener$1;",
        "liveAudienceListener",
        "com/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$liveAudienceListener$1",
        "Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$liveAudienceListener$1;",
        "VideoViewAdapterImpl",
        "ViewObserver",
        "Companion",
        "tuilivekit_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nAudienceView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AudienceView.kt\ncom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1495:1\n2746#2,3:1496\n2746#2,3:1499\n2746#2,3:1502\n*S KotlinDebug\n*F\n+ 1 AudienceView.kt\ncom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView\n*L\n1062#1:1496,3\n1071#1:1499,3\n929#1:1502,3\n*E\n"
    }
.end annotation


# static fields
.field public static final u0:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final v0:Lcom/trtc/uikit/livekit/common/LiveKitLogger;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public A:Landroid/widget/ImageView;

.field public B:Lcom/trtc/uikit/livekit/component/giftaccess/GiftButton;

.field public C:Lcom/trtc/uikit/livekit/component/gift/LikeButton;

.field public D:Landroid/widget/ImageView;

.field public E:Lcom/trtc/uikit/livekit/component/barrage/BarrageInputView;

.field public F:Lcom/trtc/uikit/livekit/component/roominfo/LiveInfoView;

.field public G:Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;

.field public H:Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView;

.field public I:Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView;

.field public J:Lcom/trtc/uikit/livekit/component/networkInfo/NetworkInfoView;

.field public K:Landroid/widget/ImageView;

.field public L:Landroid/widget/ImageView;

.field public M:Landroid/widget/ImageView;

.field public N:Landroid/widget/ImageView;

.field public O:Landroid/widget/ImageView;

.field public P:Landroid/widget/FrameLayout;

.field public Q:Landroid/widget/ImageView;

.field public R:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/CoGuestRequestFloatView;

.field public S:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudiencePlayingRootView;

.field public final T:Lkotlinx/coroutines/m0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public U:Landroid/view/View;

.field public V:Lcom/trtc/uikit/livekit/kc/widget/KCPeopleCountView;

.field public W:Lcom/trtc/uikit/livekit/kc/widget/KCRiskView;

.field public a0:Lcom/trtc/uikit/livekit/kc/widget/KCTradeCardView;

.field public b0:Lcom/trtc/uikit/livekit/kc/roominfo/service/KCRoomInfoService;

.field public c0:Lio/trtc/tuikit/atomicx/widget/basicwidget/alertdialog/AtomicAlertDialog;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public d0:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/userinfo/UserInfoDialog;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public e0:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public f0:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$b;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public g0:Z

.field public h0:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$a;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public i0:F

.field public j0:F

.field public final k0:I

.field public l0:Z

.field public m0:Z

.field public n0:Z

.field public o0:Lio/trtc/tuikit/atomicxcore/api/device/VideoQuality;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final p0:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$l;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final q0:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$m;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final r0:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$e;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public s:Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;

.field public final s0:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$d;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public t:Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;

.field public final t0:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$k;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public u:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/LiveCoreViewMaskBackgroundView;

.field public v:Landroid/widget/FrameLayout;

.field public w:Landroid/widget/FrameLayout;

.field public x:Landroid/widget/FrameLayout;

.field public y:Landroid/widget/ImageView;

.field public z:Lcom/trtc/uikit/livekit/kc/widget/KCAudiencePreviewView;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->u0:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$Companion;

    .line 9
    .line 10
    sget-object v0, Lcom/trtc/uikit/livekit/common/LiveKitLogger;->c:Lcom/trtc/uikit/livekit/common/LiveKitLogger$Companion;

    .line 11
    .line 12
    const-string v1, "AudienceView"

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Lcom/trtc/uikit/livekit/common/LiveKitLogger$Companion;->getLiveStreamLogger(Ljava/lang/String;)Lcom/trtc/uikit/livekit/common/LiveKitLogger;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    sput-object v0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->v0:Lcom/trtc/uikit/livekit/common/LiveKitLogger;

    .line 19
    return-void
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
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 7
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .line 1
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 7
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .line 2
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0, p1, p2, p3}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/BasicView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 5
    invoke-static {}, Lkotlinx/coroutines/n0;->b()Lkotlinx/coroutines/m0;

    move-result-object p2

    iput-object p2, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->T:Lkotlinx/coroutines/m0;

    .line 6
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object p2

    invoke-virtual {p2}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result p2

    iput p2, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->k0:I

    .line 7
    new-instance p2, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$l;

    invoke-direct {p2, p0, p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$l;-><init>(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;Landroid/content/Context;)V

    iput-object p2, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->p0:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$l;

    .line 8
    new-instance p2, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$m;

    invoke-direct {p2, p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$m;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->q0:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$m;

    .line 9
    new-instance p2, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$e;

    invoke-direct {p2, p0, p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$e;-><init>(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;Landroid/content/Context;)V

    iput-object p2, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->r0:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$e;

    .line 10
    new-instance p2, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$d;

    invoke-direct {p2, p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$d;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->s0:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$d;

    .line 11
    new-instance p1, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$k;

    invoke-direct {p1, p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$k;-><init>(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;)V

    iput-object p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->t0:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$k;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    .line 3
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static final synthetic A(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;)Lcom/trtc/uikit/livekit/kc/widget/KCAudiencePreviewView;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->z:Lcom/trtc/uikit/livekit/kc/widget/KCAudiencePreviewView;

    .line 3
    return-object p0
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
.end method

.method public static final A0(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;Landroid/view/View;)V
    .locals 6

    .line 1
    .line 2
    const/16 v4, 0xc

    .line 3
    const/4 v5, 0x0

    .line 4
    .line 5
    const-string v0, "B1FeedLive"

    .line 6
    .line 7
    const-string v1, "more"

    .line 8
    const/4 v2, 0x0

    .line 9
    const/4 v3, 0x0

    .line 10
    .line 11
    .line 12
    invoke-static/range {v0 .. v5}, Lqq/m;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;ILjava/lang/Object;)V

    .line 13
    .line 14
    new-instance p1, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/e;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    const-string v1, "getContext(...)"

    .line 21
    .line 22
    .line 23
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/BasicView;->getAudienceStore()Lee0/f;

    .line 27
    move-result-object p0

    .line 28
    .line 29
    .line 30
    invoke-direct {p1, v0, p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/e;-><init>(Landroid/content/Context;Lee0/f;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover;->show()V

    .line 34
    return-void
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
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public static final synthetic B(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;)Lcom/trtc/uikit/livekit/kc/roominfo/service/KCRoomInfoService;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->b0:Lcom/trtc/uikit/livekit/kc/roominfo/service/KCRoomInfoService;

    .line 3
    return-object p0
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
.end method

.method public static final B1(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;)V
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->I:Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView;

    .line 3
    .line 4
    if-nez p0, :cond_0

    .line 5
    .line 6
    const-string p0, "barrageStreamView"

    .line 7
    .line 8
    .line 9
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 10
    const/4 p0, 0x0

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView;->p()V

    .line 14
    return-void
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
.end method

.method public static final synthetic C()Lcom/trtc/uikit/livekit/common/LiveKitLogger;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->v0:Lcom/trtc/uikit/livekit/common/LiveKitLogger;

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
.end method

.method private final C1(Lio/trtc/tuikit/atomicxcore/api/device/VideoQuality;)Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$c;->$EnumSwitchMapping$0:[I

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 6
    move-result p1

    .line 7
    .line 8
    aget p1, v0, p1

    .line 9
    const/4 v0, 0x1

    .line 10
    .line 11
    if-eq p1, v0, :cond_3

    .line 12
    const/4 v0, 0x2

    .line 13
    .line 14
    if-eq p1, v0, :cond_2

    .line 15
    const/4 v0, 0x3

    .line 16
    .line 17
    if-eq p1, v0, :cond_1

    .line 18
    const/4 v0, 0x4

    .line 19
    .line 20
    if-eq p1, v0, :cond_0

    .line 21
    .line 22
    const-string p1, "original"

    .line 23
    return-object p1

    .line 24
    .line 25
    :cond_0
    const-string p1, "360P"

    .line 26
    return-object p1

    .line 27
    .line 28
    :cond_1
    const-string p1, "540P"

    .line 29
    return-object p1

    .line 30
    .line 31
    :cond_2
    const-string p1, "720P"

    .line 32
    return-object p1

    .line 33
    .line 34
    :cond_3
    const-string p1, "1080P"

    .line 35
    return-object p1
    .line 36
    .line 37
    .line 38
    .line 39
.end method

.method public static final synthetic D(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;)Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->t:Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;

    .line 3
    return-object p0
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
.end method

.method public static final synthetic E(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;)Lcom/trtc/uikit/livekit/features/audiencecontainer/view/LiveCoreViewMaskBackgroundView;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->u:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/LiveCoreViewMaskBackgroundView;

    .line 3
    return-object p0
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
.end method

.method public static final E0(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;)Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/trtc/uikit/livekit/kc/helper/b;->a:Lcom/trtc/uikit/livekit/kc/helper/b;

    .line 3
    .line 4
    iget-object p0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->s:Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;

    .line 5
    .line 6
    if-nez p0, :cond_0

    .line 7
    .line 8
    const-string p0, "liveInfo"

    .line 9
    .line 10
    .line 11
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 12
    const/4 p0, 0x0

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->getLiveID()Ljava/lang/String;

    .line 16
    move-result-object p0

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p0}, Lcom/trtc/uikit/livekit/kc/helper/b;->c(Ljava/lang/String;)V

    .line 20
    .line 21
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 22
    return-object p0
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
.end method

.method public static final synthetic F(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;)Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->s:Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;

    .line 3
    return-object p0
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
.end method

.method public static final synthetic G(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;)Lkotlinx/coroutines/m0;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->T:Lkotlinx/coroutines/m0;

    .line 3
    return-object p0
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
.end method

.method public static final G0(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;Landroid/view/View;)V
    .locals 6

    .line 1
    .line 2
    const/16 v4, 0xc

    .line 3
    const/4 v5, 0x0

    .line 4
    .line 5
    const-string v0, "B1FeedLiveRoomDetail"

    .line 6
    .line 7
    const-string v1, "share"

    .line 8
    const/4 v2, 0x0

    .line 9
    const/4 v3, 0x0

    .line 10
    .line 11
    .line 12
    invoke-static/range {v0 .. v5}, Lqq/m;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;ILjava/lang/Object;)V

    .line 13
    .line 14
    sget-object p1, Lcom/trtc/uikit/livekit/kc/share/KCLiveShareHelper;->a:Lcom/trtc/uikit/livekit/kc/share/KCLiveShareHelper;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    const-string v1, "getContext(...)"

    .line 21
    .line 22
    .line 23
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    iget-object p0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->s:Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;

    .line 26
    .line 27
    if-nez p0, :cond_0

    .line 28
    .line 29
    const-string p0, "liveInfo"

    .line 30
    .line 31
    .line 32
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 33
    const/4 p0, 0x0

    .line 34
    .line 35
    .line 36
    :cond_0
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->getLiveID()Ljava/lang/String;

    .line 37
    move-result-object p0

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1, v0, p0}, Lcom/trtc/uikit/livekit/kc/share/KCLiveShareHelper;->f(Landroid/content/Context;Ljava/lang/String;)V

    .line 41
    return-void
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
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public static final synthetic H(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;)Lcom/trtc/uikit/livekit/kc/widget/KCRiskView;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->W:Lcom/trtc/uikit/livekit/kc/widget/KCRiskView;

    .line 3
    return-object p0
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
.end method

.method public static final synthetic I(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->p0()V

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
.end method

.method public static final synthetic J(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->q0(Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;)V

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
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public static final synthetic K(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;)Z
    .locals 0

    .line 1
    .line 2
    iget-boolean p0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->n0:Z

    .line 3
    return p0
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
.end method

.method public static final synthetic L(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;)Z
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->R0()Z

    .line 4
    move-result p0

    .line 5
    return p0
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
.end method

.method public static final L0(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;Landroid/view/View;)V
    .locals 7

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    const-string v0, "null cannot be cast to non-null type android.app.Activity"

    .line 7
    .line 8
    .line 9
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    check-cast p1, Landroid/app/Activity;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/app/Activity;->getRequestedOrientation()I

    .line 15
    move-result p1

    .line 16
    const/4 v0, 0x1

    .line 17
    .line 18
    if-ne p1, v0, :cond_0

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    .line 22
    :goto_0
    if-eqz v0, :cond_1

    .line 23
    .line 24
    const-string p1, "fullScreen"

    .line 25
    :goto_1
    move-object v2, p1

    .line 26
    goto :goto_2

    .line 27
    .line 28
    :cond_1
    const-string p1, "cancelFullScreen"

    .line 29
    goto :goto_1

    .line 30
    .line 31
    :goto_2
    const/16 v5, 0xc

    .line 32
    const/4 v6, 0x0

    .line 33
    .line 34
    const-string v1, "B1FeedLive"

    .line 35
    const/4 v3, 0x0

    .line 36
    const/4 v4, 0x0

    .line 37
    .line 38
    .line 39
    invoke-static/range {v1 .. v6}, Lqq/m;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;ILjava/lang/Object;)V

    .line 40
    .line 41
    xor-int/lit8 p1, v0, 0x1

    .line 42
    .line 43
    .line 44
    invoke-direct {p0, p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->setScreenOrientation(Z)V

    .line 45
    .line 46
    if-eqz v0, :cond_3

    .line 47
    .line 48
    iget-object p0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->b0:Lcom/trtc/uikit/livekit/kc/roominfo/service/KCRoomInfoService;

    .line 49
    .line 50
    if-nez p0, :cond_2

    .line 51
    .line 52
    const-string p0, "kcRoomInfoService"

    .line 53
    .line 54
    .line 55
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 56
    const/4 p0, 0x0

    .line 57
    .line 58
    .line 59
    :cond_2
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/kc/roominfo/service/KCRoomInfoService;->i()V

    .line 60
    :cond_3
    return-void
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public static final synthetic M(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;Ljava/util/List;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->U0(Ljava/util/List;)V

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
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public static final synthetic N(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;Z)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->X0(Z)V

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
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public static final N0(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;Landroid/view/View;Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/view/WindowInsetsCompat;
    .locals 3

    .line 1
    .line 2
    const-string v0, "v"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "insets"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-static {}, Landroidx/core/view/WindowInsetsCompat$Type;->navigationBars()I

    .line 14
    move-result v0

    .line 15
    .line 16
    .line 17
    invoke-virtual {p2, v0}, Landroidx/core/view/WindowInsetsCompat;->getInsets(I)Landroidx/core/graphics/Insets;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    iget v0, v0, Landroidx/core/graphics/Insets;->bottom:I

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 24
    move-result-object p0

    .line 25
    .line 26
    const-string v1, "null cannot be cast to non-null type android.app.Activity"

    .line 27
    .line 28
    .line 29
    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    check-cast p0, Landroid/app/Activity;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Landroid/app/Activity;->getRequestedOrientation()I

    .line 35
    move-result p0

    .line 36
    const/4 v1, 0x1

    .line 37
    const/4 v2, 0x0

    .line 38
    .line 39
    if-ne p0, v1, :cond_0

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1, v2, v2, v2, v0}, Landroid/view/View;->setPaddingRelative(IIII)V

    .line 43
    return-object p2

    .line 44
    .line 45
    :cond_0
    sget-object p0, Lcom/kubi/sdk/util/EdgeToEdgeCompat;->a:Lcom/kubi/sdk/util/EdgeToEdgeCompat;

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Lcom/kubi/sdk/util/EdgeToEdgeCompat;->i()I

    .line 49
    move-result p0

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1, v2, v2, p0, v2}, Landroid/view/View;->setPaddingRelative(IIII)V

    .line 53
    return-object p2
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
.end method

.method public static final synthetic O(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;Z)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->Y0(Z)V

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
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public static final synthetic P(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;Z)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->Z0(Z)V

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
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public static final P0(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;Landroid/view/View;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->k1()V

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
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public static final synthetic Q(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;Z)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->a1(Z)V

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
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public static final synthetic R(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->b1()V

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
.end method

.method public static final synthetic S(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;Lio/trtc/tuikit/atomicxcore/api/device/VideoQuality;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->c1(Lio/trtc/tuikit/atomicxcore/api/device/VideoQuality;)V

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
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public static final synthetic T(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;Z)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->d1(Z)V

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
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public static final synthetic U(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->e1()V

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
.end method

.method public static final synthetic V(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->n0:Z

    .line 3
    return-void
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
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public static final V0(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;Ljava/util/List;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->D:Landroid/widget/ImageView;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    const-string v0, "imageCoGuest"

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 10
    const/4 v0, 0x0

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 14
    move-result p1

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v0, p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->g0(Landroid/view/View;Z)V

    .line 18
    return-void
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
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public static final synthetic W(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;IZ)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->g1(IZ)V

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
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
.end method

.method public static final synthetic X(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->s:Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;

    .line 3
    return-void
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
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public static final synthetic Y(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->m0:Z

    .line 3
    return-void
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
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public static final synthetic Z(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->l1(Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;)V

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
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public static final synthetic a0(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;Z)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->x1(Z)V

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
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public static final synthetic b0(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->z1()V

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
.end method

.method public static final d0(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;Landroid/view/View;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->k1()V

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
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public static synthetic f(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;Landroid/view/View;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->G0(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;Landroid/view/View;)V

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
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public static synthetic g(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;Landroid/view/View;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->v0(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;Landroid/view/View;)V

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
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method private final getScreenPoint()Landroid/graphics/Point;
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    const-string v1, "window"

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    const-string v1, "null cannot be cast to non-null type android.view.WindowManager"

    .line 13
    .line 14
    .line 15
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    check-cast v0, Landroid/view/WindowManager;

    .line 18
    .line 19
    .line 20
    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    new-instance v1, Landroid/graphics/Point;

    .line 24
    .line 25
    .line 26
    invoke-direct {v1}, Landroid/graphics/Point;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v1}, Landroid/view/Display;->getSize(Landroid/graphics/Point;)V

    .line 30
    return-object v1
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
.end method

.method public static synthetic h(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;Landroid/view/View;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->t0(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;Landroid/view/View;)V

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
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public static synthetic i(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;Landroid/content/DialogInterface;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->o0(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;Landroid/content/DialogInterface;)V

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
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public static synthetic j(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;Landroid/view/View;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->P0(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;Landroid/view/View;)V

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
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public static synthetic k(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;Landroid/view/View;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->s0(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;Landroid/view/View;)V

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
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public static synthetic l(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->B1(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;)V

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
.end method

.method public static synthetic m(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;Landroid/view/View;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->t1(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;Landroid/view/View;)V

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
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public static synthetic n(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;Landroid/view/View;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->L0(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;Landroid/view/View;)V

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
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public static final n0(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;Landroid/view/View;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/BasicView;->getViewState()Lee0/j;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Lee0/j;->c()Lkotlinx/coroutines/flow/n;

    .line 8
    move-result-object p1

    .line 9
    .line 10
    .line 11
    invoke-interface {p1}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 12
    move-result-object p1

    .line 13
    .line 14
    check-cast p1, Ljava/lang/Boolean;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 18
    move-result p1

    .line 19
    .line 20
    if-nez p1, :cond_5

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/BasicView;->getCoGuestState()Lio/trtc/tuikit/atomicxcore/api/live/CoGuestState;

    .line 24
    move-result-object p1

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestState;->getConnected()Lkotlinx/coroutines/flow/w;

    .line 28
    move-result-object p1

    .line 29
    .line 30
    .line 31
    invoke-interface {p1}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 32
    move-result-object p1

    .line 33
    .line 34
    check-cast p1, Ljava/lang/Iterable;

    .line 35
    .line 36
    instance-of v0, p1, Ljava/util/Collection;

    .line 37
    .line 38
    if-eqz v0, :cond_0

    .line 39
    move-object v0, p1

    .line 40
    .line 41
    check-cast v0, Ljava/util/Collection;

    .line 42
    .line 43
    .line 44
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 45
    move-result v0

    .line 46
    .line 47
    if-eqz v0, :cond_0

    .line 48
    goto :goto_1

    .line 49
    .line 50
    .line 51
    :cond_0
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 52
    move-result-object p1

    .line 53
    .line 54
    .line 55
    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 56
    move-result v0

    .line 57
    .line 58
    if-eqz v0, :cond_3

    .line 59
    .line 60
    .line 61
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 62
    move-result-object v0

    .line 63
    .line 64
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;->getUserID()Ljava/lang/String;

    .line 68
    move-result-object v0

    .line 69
    .line 70
    sget-object v1, Lio/trtc/tuikit/atomicxcore/api/login/LoginStore;->shared:Lio/trtc/tuikit/atomicxcore/api/login/LoginStore;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/login/LoginStore;->getLoginState()Lio/trtc/tuikit/atomicxcore/api/login/LoginState;

    .line 74
    move-result-object v1

    .line 75
    .line 76
    .line 77
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/login/LoginState;->getLoginUserInfo()Lkotlinx/coroutines/flow/w;

    .line 78
    move-result-object v1

    .line 79
    .line 80
    .line 81
    invoke-interface {v1}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 82
    move-result-object v1

    .line 83
    .line 84
    check-cast v1, Lio/trtc/tuikit/atomicxcore/api/login/UserProfile;

    .line 85
    .line 86
    if-eqz v1, :cond_2

    .line 87
    .line 88
    .line 89
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/login/UserProfile;->getUserID()Ljava/lang/String;

    .line 90
    move-result-object v1

    .line 91
    goto :goto_0

    .line 92
    :cond_2
    const/4 v1, 0x0

    .line 93
    .line 94
    .line 95
    :goto_0
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 96
    move-result v0

    .line 97
    .line 98
    if-eqz v0, :cond_1

    .line 99
    return-void

    .line 100
    .line 101
    :cond_3
    :goto_1
    iget-boolean p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->n0:Z

    .line 102
    .line 103
    if-eqz p1, :cond_4

    .line 104
    goto :goto_2

    .line 105
    :cond_4
    const/4 p1, 0x1

    .line 106
    .line 107
    iput-boolean p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->n0:Z

    .line 108
    .line 109
    new-instance p1, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/TypeSelectDialog;

    .line 110
    .line 111
    .line 112
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 113
    move-result-object v0

    .line 114
    .line 115
    const-string v1, "getContext(...)"

    .line 116
    .line 117
    .line 118
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/BasicView;->getAudienceStore()Lee0/f;

    .line 122
    move-result-object v1

    .line 123
    const/4 v2, -0x1

    .line 124
    .line 125
    .line 126
    invoke-direct {p1, v0, v1, v2}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/TypeSelectDialog;-><init>(Landroid/content/Context;Lee0/f;I)V

    .line 127
    .line 128
    new-instance v0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/g;

    .line 129
    .line 130
    .line 131
    invoke-direct {v0, p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/g;-><init>(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {p1, v0}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover;->show()V

    .line 138
    :cond_5
    :goto_2
    return-void
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
.end method

.method public static final n1(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;Lio/trtc/tuikit/atomicx/widget/basicwidget/alertdialog/AtomicAlertDialog$b;)Lkotlin/Unit;
    .locals 6

    .line 1
    .line 2
    const-string v0, "$this$init"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    sget v1, Lcom/trtc/uikit/livekit/R$string;->common_audience_end_link_tips:I

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    const-string v1, "getString(...)"

    .line 18
    .line 19
    .line 20
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, v0}, Lio/trtc/tuikit/atomicx/widget/basicwidget/alertdialog/AtomicAlertDialog$b;->o(Ljava/lang/String;)V

    .line 24
    .line 25
    new-instance v0, Lkotlin/Pair;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 29
    move-result-object v1

    .line 30
    .line 31
    sget v2, Lcom/trtc/uikit/livekit/R$string;->common_end_link:I

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 35
    move-result-object v1

    .line 36
    .line 37
    sget-object v2, Lio/trtc/tuikit/atomicx/widget/basicwidget/alertdialog/AtomicAlertDialog$TextColorPreset;->RED:Lio/trtc/tuikit/atomicx/widget/basicwidget/alertdialog/AtomicAlertDialog$TextColorPreset;

    .line 38
    .line 39
    .line 40
    invoke-direct {v0, v1, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 41
    .line 42
    new-instance v1, Lkotlin/Pair;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 46
    move-result-object v2

    .line 47
    .line 48
    sget v3, Lcom/trtc/uikit/livekit/R$string;->common_exit_live:I

    .line 49
    .line 50
    .line 51
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 52
    move-result-object v2

    .line 53
    .line 54
    sget-object v3, Lio/trtc/tuikit/atomicx/widget/basicwidget/alertdialog/AtomicAlertDialog$TextColorPreset;->PRIMARY:Lio/trtc/tuikit/atomicx/widget/basicwidget/alertdialog/AtomicAlertDialog$TextColorPreset;

    .line 55
    .line 56
    .line 57
    invoke-direct {v1, v2, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 58
    .line 59
    new-instance v2, Lkotlin/Pair;

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 63
    move-result-object v4

    .line 64
    .line 65
    sget v5, Lcom/trtc/uikit/livekit/R$string;->common_cancel:I

    .line 66
    .line 67
    .line 68
    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 69
    move-result-object v4

    .line 70
    .line 71
    .line 72
    invoke-direct {v2, v4, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    filled-new-array {v0, v1, v2}, [Lkotlin/Pair;

    .line 76
    move-result-object v0

    .line 77
    .line 78
    .line 79
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    .line 80
    move-result-object v0

    .line 81
    .line 82
    new-instance v1, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/j;

    .line 83
    .line 84
    .line 85
    invoke-direct {v1, p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/j;-><init>(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;)V

    .line 86
    const/4 p0, 0x0

    .line 87
    .line 88
    .line 89
    invoke-static {p1, v0, p0, v1}, Lio/trtc/tuikit/atomicx/widget/basicwidget/alertdialog/f;->j(Lio/trtc/tuikit/atomicx/widget/basicwidget/alertdialog/AtomicAlertDialog$b;Ljava/util/List;ZLkotlin/jvm/functions/Function3;)V

    .line 90
    .line 91
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 92
    return-object p0
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
.end method

.method public static synthetic o(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;Ljava/util/List;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->V0(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;Ljava/util/List;)V

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
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public static final o0(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;Landroid/content/DialogInterface;)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    .line 3
    iput-boolean p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->n0:Z

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
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public static final o1(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;Landroid/app/Dialog;ILjava/lang/String;)Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    const-string v0, "dialog"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string p1, "text"

    .line 8
    .line 9
    .line 10
    invoke-static {p3, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    const/4 p1, 0x0

    .line 12
    .line 13
    if-eqz p2, :cond_1

    .line 14
    const/4 p0, 0x1

    .line 15
    .line 16
    if-eq p2, p0, :cond_0

    .line 17
    goto :goto_0

    .line 18
    .line 19
    :cond_0
    const-string p0, "EVENT_KEY_LIVE_KIT"

    .line 20
    .line 21
    const-string p2, "EVENT_SUB_KEY_DESTROY_LIVE_VIEW"

    .line 22
    .line 23
    .line 24
    invoke-static {p0, p2, p1}, Lcom/tencent/qcloud/tuicore/TUICore;->notifyEvent(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    .line 25
    goto :goto_0

    .line 26
    .line 27
    .line 28
    :cond_1
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/BasicView;->getCoGuestStore()Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;

    .line 29
    move-result-object p2

    .line 30
    .line 31
    .line 32
    invoke-virtual {p2, p1}, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;->disconnect(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/BasicView;->getAudienceStore()Lee0/f;

    .line 36
    move-result-object p0

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Lee0/f;->v()Lcom/trtc/uikit/livekit/features/audiencecontainer/store/ViewStore;

    .line 40
    move-result-object p0

    .line 41
    const/4 p1, 0x0

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0, p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/store/ViewStore;->g(Z)V

    .line 45
    .line 46
    :goto_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 47
    return-object p0
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
.end method

.method public static synthetic p(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;Lio/trtc/tuikit/atomicx/widget/basicwidget/alertdialog/AtomicAlertDialog$b;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->n1(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;Lio/trtc/tuikit/atomicx/widget/basicwidget/alertdialog/AtomicAlertDialog$b;)Lkotlin/Unit;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public static synthetic q(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;Landroid/view/View;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->d0(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;Landroid/view/View;)V

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
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public static synthetic r(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;Landroid/view/View;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->A0(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;Landroid/view/View;)V

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
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public static synthetic s(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;Landroid/view/View;Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/view/WindowInsetsCompat;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->N0(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;Landroid/view/View;Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/view/WindowInsetsCompat;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
.end method

.method public static final s0(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;Landroid/view/View;)V
    .locals 6

    .line 1
    .line 2
    new-instance v3, Lorg/json/JSONObject;

    .line 3
    .line 4
    .line 5
    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 6
    .line 7
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->z:Lcom/trtc/uikit/livekit/kc/widget/KCAudiencePreviewView;

    .line 8
    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    const-string p1, "kcAudiencePreviewView"

    .line 12
    .line 13
    .line 14
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 15
    const/4 p1, 0x0

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 19
    move-result p1

    .line 20
    .line 21
    const/16 v0, 0x8

    .line 22
    .line 23
    if-ne p1, v0, :cond_1

    .line 24
    .line 25
    const-string p1, "liveNow"

    .line 26
    goto :goto_0

    .line 27
    .line 28
    :cond_1
    const-string p1, "preview"

    .line 29
    .line 30
    :goto_0
    const-string v0, "type"

    .line 31
    .line 32
    .line 33
    invoke-virtual {v3, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 34
    .line 35
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 36
    const/4 v4, 0x4

    .line 37
    const/4 v5, 0x0

    .line 38
    .line 39
    const-string v0, "B1FeedLive"

    .line 40
    .line 41
    const-string v1, "close"

    .line 42
    const/4 v2, 0x0

    .line 43
    .line 44
    .line 45
    invoke-static/range {v0 .. v5}, Lqq/m;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;ILjava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->W0()V

    .line 49
    return-void
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method private final setScreenOrientation(Z)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    const-string v1, "null cannot be cast to non-null type android.app.Activity"

    .line 7
    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    check-cast v0, Landroid/app/Activity;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p1}, Landroid/app/Activity;->setRequestedOrientation(I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->A1(Z)V

    .line 18
    .line 19
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->u:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/LiveCoreViewMaskBackgroundView;

    .line 20
    const/4 v1, 0x0

    .line 21
    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    const-string v0, "liveCoreViewMaskBackgroundView"

    .line 25
    .line 26
    .line 27
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 28
    move-object v0, v1

    .line 29
    .line 30
    .line 31
    :cond_0
    invoke-virtual {v0, p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/LiveCoreViewMaskBackgroundView;->setPortrait(Z)V

    .line 32
    .line 33
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->s:Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;

    .line 34
    .line 35
    if-nez v0, :cond_1

    .line 36
    .line 37
    const-string v0, "liveInfo"

    .line 38
    .line 39
    .line 40
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 41
    goto :goto_0

    .line 42
    :cond_1
    move-object v1, v0

    .line 43
    .line 44
    .line 45
    :goto_0
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->getSeatLayoutTemplateID()I

    .line 46
    move-result v0

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0, v0, p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->g1(IZ)V

    .line 50
    return-void
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
.end method

.method public static synthetic t(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->y1(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;)V

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
.end method

.method public static final t0(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;Landroid/view/View;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->W0()V

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
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public static final t1(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;Landroid/view/View;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->p1()V

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
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public static synthetic u(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->E0(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;)Lkotlin/Unit;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
.end method

.method public static synthetic v(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;Landroid/app/Dialog;ILjava/lang/String;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2, p3}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->o1(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;Landroid/app/Dialog;ILjava/lang/String;)Lkotlin/Unit;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
.end method

.method public static final v0(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;Landroid/view/View;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    const-string v0, "null cannot be cast to non-null type android.app.Activity"

    .line 7
    .line 8
    .line 9
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    check-cast p1, Landroid/app/Activity;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/app/Activity;->getRequestedOrientation()I

    .line 15
    move-result p1

    .line 16
    .line 17
    if-nez p1, :cond_0

    .line 18
    const/4 p1, 0x1

    .line 19
    .line 20
    .line 21
    invoke-direct {p0, p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->setScreenOrientation(Z)V

    .line 22
    .line 23
    .line 24
    :cond_0
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/BasicView;->getAudienceStore()Lee0/f;

    .line 25
    move-result-object p0

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Lee0/f;->z()V

    .line 29
    return-void
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
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public static synthetic w(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;Landroid/view/View;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->n0(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;Landroid/view/View;)V

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
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public static final synthetic x(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;)Lcom/trtc/uikit/livekit/component/barrage/BarrageInputView;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->E:Lcom/trtc/uikit/livekit/component/barrage/BarrageInputView;

    .line 3
    return-object p0
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
.end method

.method public static final synthetic y(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;)Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->I:Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView;

    .line 3
    return-object p0
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
.end method

.method public static final y1(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;)V
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->I:Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView;

    .line 3
    .line 4
    if-nez p0, :cond_0

    .line 5
    .line 6
    const-string p0, "barrageStreamView"

    .line 7
    .line 8
    .line 9
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 10
    const/4 p0, 0x0

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView;->l()V

    .line 14
    return-void
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
.end method

.method public static final synthetic z(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;)Landroid/view/View;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->U:Landroid/view/View;

    .line 3
    return-object p0
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
.end method


# virtual methods
.method public final A1(Z)V
    .locals 8

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->P:Landroid/widget/FrameLayout;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string v0, "layoutSwitchOrientationButton"

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 11
    move-object v0, v1

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-virtual {p0, p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->h0(Z)Landroid/widget/FrameLayout$LayoutParams;

    .line 15
    move-result-object v2

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 19
    .line 20
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->Q:Landroid/widget/ImageView;

    .line 21
    .line 22
    if-nez v0, :cond_1

    .line 23
    .line 24
    const-string v0, "imageSwitchOrientationIcon"

    .line 25
    .line 26
    .line 27
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 28
    move-object v0, v1

    .line 29
    .line 30
    :cond_1
    if-eqz p1, :cond_2

    .line 31
    .line 32
    sget v2, Lcom/trtc/uikit/livekit/R$drawable;->livekit_ic_switch_landscape_button:I

    .line 33
    goto :goto_0

    .line 34
    .line 35
    :cond_2
    sget v2, Lcom/trtc/uikit/livekit/R$drawable;->livekit_ic_switch_portrait_button:I

    .line 36
    .line 37
    .line 38
    :goto_0
    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 39
    .line 40
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->E:Lcom/trtc/uikit/livekit/component/barrage/BarrageInputView;

    .line 41
    .line 42
    if-nez v0, :cond_3

    .line 43
    .line 44
    const-string v0, "barrageInputView"

    .line 45
    .line 46
    .line 47
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 48
    move-object v0, v1

    .line 49
    :cond_3
    const/4 v2, 0x0

    .line 50
    .line 51
    const/16 v3, 0x8

    .line 52
    .line 53
    if-eqz p1, :cond_4

    .line 54
    move v4, v2

    .line 55
    goto :goto_1

    .line 56
    :cond_4
    move v4, v3

    .line 57
    .line 58
    .line 59
    :goto_1
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 60
    .line 61
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->B:Lcom/trtc/uikit/livekit/component/giftaccess/GiftButton;

    .line 62
    .line 63
    if-nez v0, :cond_5

    .line 64
    .line 65
    const-string v0, "buttonGift"

    .line 66
    .line 67
    .line 68
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 69
    move-object v0, v1

    .line 70
    .line 71
    .line 72
    :cond_5
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 73
    .line 74
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->I:Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView;

    .line 75
    .line 76
    const-string v4, "barrageStreamView"

    .line 77
    .line 78
    if-nez v0, :cond_6

    .line 79
    .line 80
    .line 81
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 82
    move-object v0, v1

    .line 83
    .line 84
    :cond_6
    if-eqz p1, :cond_7

    .line 85
    move v5, v2

    .line 86
    goto :goto_2

    .line 87
    :cond_7
    move v5, v3

    .line 88
    .line 89
    .line 90
    :goto_2
    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    .line 91
    .line 92
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->A:Landroid/widget/ImageView;

    .line 93
    .line 94
    if-nez v0, :cond_8

    .line 95
    .line 96
    const-string v0, "imageMore"

    .line 97
    .line 98
    .line 99
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 100
    move-object v0, v1

    .line 101
    .line 102
    :cond_8
    if-eqz p1, :cond_9

    .line 103
    move v5, v2

    .line 104
    goto :goto_3

    .line 105
    :cond_9
    move v5, v3

    .line 106
    .line 107
    .line 108
    :goto_3
    invoke-virtual {v0, v5}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 109
    .line 110
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->C:Lcom/trtc/uikit/livekit/component/gift/LikeButton;

    .line 111
    .line 112
    if-nez v0, :cond_a

    .line 113
    .line 114
    const-string v0, "buttonLike"

    .line 115
    .line 116
    .line 117
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 118
    move-object v0, v1

    .line 119
    .line 120
    :cond_a
    if-eqz p1, :cond_b

    .line 121
    goto :goto_4

    .line 122
    :cond_b
    move v2, v3

    .line 123
    .line 124
    .line 125
    :goto_4
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 126
    .line 127
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->H:Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView;

    .line 128
    .line 129
    const-string v2, "audienceListView"

    .line 130
    .line 131
    if-nez v0, :cond_c

    .line 132
    .line 133
    .line 134
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 135
    move-object v0, v1

    .line 136
    .line 137
    .line 138
    :cond_c
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 139
    move-result-object v0

    .line 140
    .line 141
    const-string v3, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams"

    .line 142
    .line 143
    .line 144
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 145
    .line 146
    check-cast v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 147
    .line 148
    const/high16 v5, 0x41f00000    # 30.0f

    .line 149
    .line 150
    if-eqz p1, :cond_d

    .line 151
    .line 152
    const/high16 v6, 0x42700000    # 60.0f

    .line 153
    .line 154
    .line 155
    invoke-static {v6}, Lcom/tencent/qcloud/tuicore/util/ScreenUtil;->dip2px(F)I

    .line 156
    move-result v6

    .line 157
    goto :goto_5

    .line 158
    .line 159
    .line 160
    :cond_d
    invoke-static {v5}, Lcom/tencent/qcloud/tuicore/util/ScreenUtil;->dip2px(F)I

    .line 161
    move-result v6

    .line 162
    .line 163
    :goto_5
    iput v6, v0, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 164
    .line 165
    iget-object v6, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->H:Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView;

    .line 166
    .line 167
    if-nez v6, :cond_e

    .line 168
    .line 169
    .line 170
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 171
    move-object v6, v1

    .line 172
    .line 173
    .line 174
    :cond_e
    invoke-virtual {v6, p1}, Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView;->setScreenOrientation(Z)V

    .line 175
    .line 176
    iget-object v6, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->H:Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView;

    .line 177
    .line 178
    if-nez v6, :cond_f

    .line 179
    .line 180
    .line 181
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 182
    move-object v6, v1

    .line 183
    .line 184
    .line 185
    :cond_f
    invoke-virtual {v6, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 186
    .line 187
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->O:Landroid/widget/ImageView;

    .line 188
    .line 189
    const-string v2, "imageCompactExit"

    .line 190
    .line 191
    if-nez v0, :cond_10

    .line 192
    .line 193
    .line 194
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 195
    move-object v0, v1

    .line 196
    .line 197
    .line 198
    :cond_10
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 199
    move-result-object v0

    .line 200
    .line 201
    .line 202
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 203
    .line 204
    check-cast v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 205
    .line 206
    const/high16 v6, 0x425c0000    # 55.0f

    .line 207
    .line 208
    if-eqz p1, :cond_11

    .line 209
    .line 210
    .line 211
    invoke-static {v6}, Lcom/tencent/qcloud/tuicore/util/ScreenUtil;->dip2px(F)I

    .line 212
    move-result v7

    .line 213
    goto :goto_6

    .line 214
    .line 215
    .line 216
    :cond_11
    invoke-static {v5}, Lcom/tencent/qcloud/tuicore/util/ScreenUtil;->dip2px(F)I

    .line 217
    move-result v7

    .line 218
    .line 219
    :goto_6
    iput v7, v0, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 220
    .line 221
    iget-object v7, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->O:Landroid/widget/ImageView;

    .line 222
    .line 223
    if-nez v7, :cond_12

    .line 224
    .line 225
    .line 226
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 227
    move-object v7, v1

    .line 228
    .line 229
    .line 230
    :cond_12
    invoke-virtual {v7, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 231
    .line 232
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->N:Landroid/widget/ImageView;

    .line 233
    .line 234
    const-string v2, "imageStandardExit"

    .line 235
    .line 236
    if-nez v0, :cond_13

    .line 237
    .line 238
    .line 239
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 240
    move-object v0, v1

    .line 241
    .line 242
    .line 243
    :cond_13
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 244
    move-result-object v0

    .line 245
    .line 246
    .line 247
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 248
    .line 249
    check-cast v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 250
    .line 251
    if-eqz p1, :cond_14

    .line 252
    .line 253
    .line 254
    invoke-static {v6}, Lcom/tencent/qcloud/tuicore/util/ScreenUtil;->dip2px(F)I

    .line 255
    move-result v7

    .line 256
    goto :goto_7

    .line 257
    .line 258
    .line 259
    :cond_14
    invoke-static {v5}, Lcom/tencent/qcloud/tuicore/util/ScreenUtil;->dip2px(F)I

    .line 260
    move-result v7

    .line 261
    .line 262
    :goto_7
    iput v7, v0, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 263
    .line 264
    iget-object v7, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->N:Landroid/widget/ImageView;

    .line 265
    .line 266
    if-nez v7, :cond_15

    .line 267
    .line 268
    .line 269
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 270
    move-object v7, v1

    .line 271
    .line 272
    .line 273
    :cond_15
    invoke-virtual {v7, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 274
    .line 275
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->V:Lcom/trtc/uikit/livekit/kc/widget/KCPeopleCountView;

    .line 276
    .line 277
    const-string v2, "peopleCountView"

    .line 278
    .line 279
    if-nez v0, :cond_16

    .line 280
    .line 281
    .line 282
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 283
    move-object v0, v1

    .line 284
    .line 285
    .line 286
    :cond_16
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 287
    move-result-object v0

    .line 288
    .line 289
    .line 290
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 291
    .line 292
    check-cast v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 293
    .line 294
    if-eqz p1, :cond_17

    .line 295
    .line 296
    .line 297
    invoke-static {v6}, Lcom/tencent/qcloud/tuicore/util/ScreenUtil;->dip2px(F)I

    .line 298
    move-result v7

    .line 299
    goto :goto_8

    .line 300
    .line 301
    .line 302
    :cond_17
    invoke-static {v5}, Lcom/tencent/qcloud/tuicore/util/ScreenUtil;->dip2px(F)I

    .line 303
    move-result v7

    .line 304
    .line 305
    :goto_8
    iput v7, v0, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 306
    .line 307
    iget-object v7, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->V:Lcom/trtc/uikit/livekit/kc/widget/KCPeopleCountView;

    .line 308
    .line 309
    if-nez v7, :cond_18

    .line 310
    .line 311
    .line 312
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 313
    move-object v7, v1

    .line 314
    .line 315
    .line 316
    :cond_18
    invoke-virtual {v7, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 317
    .line 318
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->K:Landroid/widget/ImageView;

    .line 319
    .line 320
    const-string v2, "imageFloatWindow"

    .line 321
    .line 322
    if-nez v0, :cond_19

    .line 323
    .line 324
    .line 325
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 326
    move-object v0, v1

    .line 327
    .line 328
    .line 329
    :cond_19
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 330
    move-result-object v0

    .line 331
    .line 332
    .line 333
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 334
    .line 335
    check-cast v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 336
    .line 337
    if-eqz p1, :cond_1a

    .line 338
    .line 339
    .line 340
    invoke-static {v6}, Lcom/tencent/qcloud/tuicore/util/ScreenUtil;->dip2px(F)I

    .line 341
    move-result v7

    .line 342
    goto :goto_9

    .line 343
    .line 344
    .line 345
    :cond_1a
    invoke-static {v5}, Lcom/tencent/qcloud/tuicore/util/ScreenUtil;->dip2px(F)I

    .line 346
    move-result v7

    .line 347
    .line 348
    :goto_9
    iput v7, v0, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 349
    .line 350
    iget-object v7, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->K:Landroid/widget/ImageView;

    .line 351
    .line 352
    if-nez v7, :cond_1b

    .line 353
    .line 354
    .line 355
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 356
    move-object v7, v1

    .line 357
    .line 358
    .line 359
    :cond_1b
    invoke-virtual {v7, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 360
    .line 361
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->L:Landroid/widget/ImageView;

    .line 362
    .line 363
    const-string v2, "imagePreviewShare"

    .line 364
    .line 365
    if-nez v0, :cond_1c

    .line 366
    .line 367
    .line 368
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 369
    move-object v0, v1

    .line 370
    .line 371
    .line 372
    :cond_1c
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 373
    move-result-object v0

    .line 374
    .line 375
    .line 376
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 377
    .line 378
    check-cast v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 379
    .line 380
    if-eqz p1, :cond_1d

    .line 381
    .line 382
    .line 383
    invoke-static {v6}, Lcom/tencent/qcloud/tuicore/util/ScreenUtil;->dip2px(F)I

    .line 384
    move-result v7

    .line 385
    goto :goto_a

    .line 386
    .line 387
    .line 388
    :cond_1d
    invoke-static {v5}, Lcom/tencent/qcloud/tuicore/util/ScreenUtil;->dip2px(F)I

    .line 389
    move-result v7

    .line 390
    .line 391
    :goto_a
    iput v7, v0, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 392
    .line 393
    iget-object v7, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->L:Landroid/widget/ImageView;

    .line 394
    .line 395
    if-nez v7, :cond_1e

    .line 396
    .line 397
    .line 398
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 399
    move-object v7, v1

    .line 400
    .line 401
    .line 402
    :cond_1e
    invoke-virtual {v7, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 403
    .line 404
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->M:Landroid/widget/ImageView;

    .line 405
    .line 406
    const-string v2, "imagePreviewReport"

    .line 407
    .line 408
    if-nez v0, :cond_1f

    .line 409
    .line 410
    .line 411
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 412
    move-object v0, v1

    .line 413
    .line 414
    .line 415
    :cond_1f
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 416
    move-result-object v0

    .line 417
    .line 418
    .line 419
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 420
    .line 421
    check-cast v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 422
    .line 423
    if-eqz p1, :cond_20

    .line 424
    .line 425
    .line 426
    invoke-static {v6}, Lcom/tencent/qcloud/tuicore/util/ScreenUtil;->dip2px(F)I

    .line 427
    move-result v6

    .line 428
    goto :goto_b

    .line 429
    .line 430
    .line 431
    :cond_20
    invoke-static {v5}, Lcom/tencent/qcloud/tuicore/util/ScreenUtil;->dip2px(F)I

    .line 432
    move-result v6

    .line 433
    .line 434
    :goto_b
    iput v6, v0, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 435
    .line 436
    iget-object v6, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->M:Landroid/widget/ImageView;

    .line 437
    .line 438
    if-nez v6, :cond_21

    .line 439
    .line 440
    .line 441
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 442
    move-object v6, v1

    .line 443
    .line 444
    .line 445
    :cond_21
    invoke-virtual {v6, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 446
    .line 447
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->F:Lcom/trtc/uikit/livekit/component/roominfo/LiveInfoView;

    .line 448
    .line 449
    const-string v2, "roomInfoView"

    .line 450
    .line 451
    if-nez v0, :cond_22

    .line 452
    .line 453
    .line 454
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 455
    move-object v0, v1

    .line 456
    .line 457
    .line 458
    :cond_22
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 459
    move-result-object v0

    .line 460
    .line 461
    .line 462
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 463
    .line 464
    check-cast v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 465
    .line 466
    if-eqz p1, :cond_23

    .line 467
    .line 468
    const/high16 v3, 0x42500000    # 52.0f

    .line 469
    .line 470
    .line 471
    invoke-static {v3}, Lcom/tencent/qcloud/tuicore/util/ScreenUtil;->dip2px(F)I

    .line 472
    move-result v3

    .line 473
    goto :goto_c

    .line 474
    .line 475
    .line 476
    :cond_23
    invoke-static {v5}, Lcom/tencent/qcloud/tuicore/util/ScreenUtil;->dip2px(F)I

    .line 477
    move-result v3

    .line 478
    .line 479
    :goto_c
    iput v3, v0, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 480
    .line 481
    iget-object v3, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->F:Lcom/trtc/uikit/livekit/component/roominfo/LiveInfoView;

    .line 482
    .line 483
    if-nez v3, :cond_24

    .line 484
    .line 485
    .line 486
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 487
    move-object v3, v1

    .line 488
    .line 489
    .line 490
    :cond_24
    invoke-virtual {v3, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 491
    .line 492
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->F:Lcom/trtc/uikit/livekit/component/roominfo/LiveInfoView;

    .line 493
    .line 494
    if-nez v0, :cond_25

    .line 495
    .line 496
    .line 497
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 498
    move-object v0, v1

    .line 499
    .line 500
    .line 501
    :cond_25
    invoke-virtual {v0, p1}, Lcom/trtc/uikit/livekit/component/roominfo/LiveInfoView;->setScreenOrientation(Z)V

    .line 502
    .line 503
    if-eqz p1, :cond_27

    .line 504
    .line 505
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->I:Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView;

    .line 506
    .line 507
    if-nez p1, :cond_26

    .line 508
    .line 509
    .line 510
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 511
    goto :goto_d

    .line 512
    :cond_26
    move-object v1, p1

    .line 513
    .line 514
    :goto_d
    new-instance p1, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/l;

    .line 515
    .line 516
    .line 517
    invoke-direct {p1, p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/l;-><init>(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;)V

    .line 518
    .line 519
    .line 520
    invoke-virtual {v1, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 521
    goto :goto_f

    .line 522
    .line 523
    :cond_27
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->W:Lcom/trtc/uikit/livekit/kc/widget/KCRiskView;

    .line 524
    .line 525
    if-nez p1, :cond_28

    .line 526
    .line 527
    const-string p1, "riskView"

    .line 528
    .line 529
    .line 530
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 531
    goto :goto_e

    .line 532
    :cond_28
    move-object v1, p1

    .line 533
    .line 534
    .line 535
    :goto_e
    invoke-virtual {v1}, Lcom/trtc/uikit/livekit/kc/widget/KCRiskView;->g()V

    .line 536
    .line 537
    .line 538
    :goto_f
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->z1()V

    .line 539
    return-void
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
.end method

.method public final B0(Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->J:Lcom/trtc/uikit/livekit/component/networkInfo/NetworkInfoView;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    const-string v0, "networkInfoView"

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 10
    const/4 v0, 0x0

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-virtual {v0, p1}, Lcom/trtc/uikit/livekit/component/networkInfo/NetworkInfoView;->s(Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;)V

    .line 14
    return-void
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
.end method

.method public final C0(Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->V:Lcom/trtc/uikit/livekit/kc/widget/KCPeopleCountView;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string v0, "peopleCountView"

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 11
    move-object v0, v1

    .line 12
    .line 13
    :cond_0
    iget-object v2, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->b0:Lcom/trtc/uikit/livekit/kc/roominfo/service/KCRoomInfoService;

    .line 14
    .line 15
    if-nez v2, :cond_1

    .line 16
    .line 17
    const-string v2, "kcRoomInfoService"

    .line 18
    .line 19
    .line 20
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 21
    goto :goto_0

    .line 22
    :cond_1
    move-object v1, v2

    .line 23
    .line 24
    .line 25
    :goto_0
    invoke-virtual {v0, p1, v1}, Lcom/trtc/uikit/livekit/kc/widget/KCPeopleCountView;->e(Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;Lcom/trtc/uikit/livekit/kc/roominfo/service/KCRoomInfoService;)V

    .line 26
    return-void
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
.end method

.method public final D0()V
    .locals 7

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->M:Landroid/widget/ImageView;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    const-string v0, "imagePreviewReport"

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 10
    const/4 v0, 0x0

    .line 11
    :cond_0
    move-object v1, v0

    .line 12
    .line 13
    new-instance v4, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/o;

    .line 14
    .line 15
    .line 16
    invoke-direct {v4, p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/o;-><init>(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;)V

    .line 17
    const/4 v5, 0x1

    .line 18
    const/4 v6, 0x0

    .line 19
    .line 20
    const-wide/16 v2, 0x0

    .line 21
    .line 22
    .line 23
    invoke-static/range {v1 .. v6}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 24
    return-void
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
.end method

.method public final F0()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->L:Landroid/widget/ImageView;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    const-string v0, "imagePreviewShare"

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 10
    const/4 v0, 0x0

    .line 11
    .line 12
    :cond_0
    new-instance v1, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/k;

    .line 13
    .line 14
    .line 15
    invoke-direct {v1, p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/k;-><init>(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 19
    return-void
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
.end method

.method public final H0(Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;)V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->z:Lcom/trtc/uikit/livekit/kc/widget/KCAudiencePreviewView;

    .line 3
    .line 4
    const-string v1, "kcAudiencePreviewView"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    .line 10
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 11
    move-object v0, v2

    .line 12
    .line 13
    :cond_0
    iget-object v3, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->b0:Lcom/trtc/uikit/livekit/kc/roominfo/service/KCRoomInfoService;

    .line 14
    .line 15
    if-nez v3, :cond_1

    .line 16
    .line 17
    const-string v3, "kcRoomInfoService"

    .line 18
    .line 19
    .line 20
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 21
    move-object v3, v2

    .line 22
    .line 23
    .line 24
    :cond_1
    invoke-virtual {v0, p1, v3}, Lcom/trtc/uikit/livekit/kc/widget/KCAudiencePreviewView;->o(Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;Lcom/trtc/uikit/livekit/kc/roominfo/service/KCRoomInfoService;)V

    .line 25
    .line 26
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->z:Lcom/trtc/uikit/livekit/kc/widget/KCAudiencePreviewView;

    .line 27
    .line 28
    if-nez p1, :cond_2

    .line 29
    .line 30
    .line 31
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 32
    goto :goto_0

    .line 33
    :cond_2
    move-object v2, p1

    .line 34
    .line 35
    :goto_0
    new-instance p1, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$h;

    .line 36
    .line 37
    .line 38
    invoke-direct {p1, p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$h;-><init>(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2, p1}, Lcom/trtc/uikit/livekit/kc/widget/KCAudiencePreviewView;->setOnViewDisplayListener(Lcom/trtc/uikit/livekit/kc/widget/j;)V

    .line 42
    return-void
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
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
.end method

.method public final I0(Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->F:Lcom/trtc/uikit/livekit/component/roominfo/LiveInfoView;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string v0, "roomInfoView"

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 11
    move-object v0, v1

    .line 12
    .line 13
    :cond_0
    iget-object v2, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->b0:Lcom/trtc/uikit/livekit/kc/roominfo/service/KCRoomInfoService;

    .line 14
    .line 15
    if-nez v2, :cond_1

    .line 16
    .line 17
    const-string v2, "kcRoomInfoService"

    .line 18
    .line 19
    .line 20
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 21
    goto :goto_0

    .line 22
    :cond_1
    move-object v1, v2

    .line 23
    .line 24
    .line 25
    :goto_0
    invoke-virtual {v0, p1, v1}, Lcom/trtc/uikit/livekit/component/roominfo/LiveInfoView;->l(Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;Lcom/trtc/uikit/livekit/kc/roominfo/service/KCRoomInfoService;)V

    .line 26
    return-void
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
.end method

.method public final J0()V
    .locals 11

    .line 1
    .line 2
    new-instance v0, Lee0/f;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->s:Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;

    .line 5
    .line 6
    const-string v2, "liveInfo"

    .line 7
    const/4 v3, 0x0

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    .line 12
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 13
    move-object v1, v3

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->getLiveID()Ljava/lang/String;

    .line 17
    move-result-object v1

    .line 18
    .line 19
    .line 20
    invoke-direct {v0, v1}, Lee0/f;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/BasicView;->setAudienceStore(Lee0/f;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/BasicView;->getAudienceStore()Lee0/f;

    .line 27
    move-result-object v0

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, v0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/BasicView;->b(Lee0/f;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/BasicView;->getAudienceStore()Lee0/f;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Lee0/f;->t()Lcom/trtc/uikit/livekit/features/audiencecontainer/store/MediaStore;

    .line 38
    move-result-object v0

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/store/MediaStore;->n()V

    .line 42
    .line 43
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->t:Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;

    .line 44
    .line 45
    const-string v1, "liveCoreView"

    .line 46
    .line 47
    if-nez v0, :cond_1

    .line 48
    .line 49
    .line 50
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 51
    move-object v0, v3

    .line 52
    .line 53
    .line 54
    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 55
    move-result-object v0

    .line 56
    .line 57
    const-string v4, "layoutLiveCoreView"

    .line 58
    .line 59
    if-eqz v0, :cond_6

    .line 60
    .line 61
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->t:Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;

    .line 62
    .line 63
    if-nez v0, :cond_2

    .line 64
    .line 65
    .line 66
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 67
    move-object v0, v3

    .line 68
    .line 69
    .line 70
    :cond_2
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 71
    move-result-object v0

    .line 72
    .line 73
    iget-object v5, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->w:Landroid/widget/FrameLayout;

    .line 74
    .line 75
    if-nez v5, :cond_3

    .line 76
    .line 77
    .line 78
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 79
    move-object v5, v3

    .line 80
    .line 81
    .line 82
    :cond_3
    invoke-static {v0, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 83
    move-result v0

    .line 84
    .line 85
    if-eqz v0, :cond_6

    .line 86
    .line 87
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->w:Landroid/widget/FrameLayout;

    .line 88
    .line 89
    if-nez v0, :cond_4

    .line 90
    .line 91
    .line 92
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 93
    move-object v0, v3

    .line 94
    .line 95
    :cond_4
    iget-object v5, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->t:Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;

    .line 96
    .line 97
    if-nez v5, :cond_5

    .line 98
    .line 99
    .line 100
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 101
    move-object v5, v3

    .line 102
    .line 103
    .line 104
    :cond_5
    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 105
    .line 106
    :cond_6
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->w:Landroid/widget/FrameLayout;

    .line 107
    .line 108
    if-nez v0, :cond_7

    .line 109
    .line 110
    .line 111
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 112
    move-object v0, v3

    .line 113
    .line 114
    :cond_7
    iget-object v4, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->t:Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;

    .line 115
    .line 116
    if-nez v4, :cond_8

    .line 117
    .line 118
    .line 119
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 120
    move-object v4, v3

    .line 121
    .line 122
    .line 123
    :cond_8
    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 124
    .line 125
    new-instance v5, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/LiveCoreViewMaskBackgroundView;

    .line 126
    .line 127
    .line 128
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 129
    move-result-object v6

    .line 130
    .line 131
    const-string v0, "getContext(...)"

    .line 132
    .line 133
    .line 134
    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 135
    const/4 v9, 0x6

    .line 136
    const/4 v10, 0x0

    .line 137
    const/4 v7, 0x0

    .line 138
    const/4 v8, 0x0

    .line 139
    .line 140
    .line 141
    invoke-direct/range {v5 .. v10}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/LiveCoreViewMaskBackgroundView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 142
    .line 143
    iput-object v5, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->u:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/LiveCoreViewMaskBackgroundView;

    .line 144
    .line 145
    .line 146
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/BasicView;->getAudienceStore()Lee0/f;

    .line 147
    move-result-object v0

    .line 148
    .line 149
    .line 150
    invoke-virtual {v5, v0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/LiveCoreViewMaskBackgroundView;->j(Lee0/f;)V

    .line 151
    .line 152
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->x:Landroid/widget/FrameLayout;

    .line 153
    .line 154
    if-nez v0, :cond_9

    .line 155
    .line 156
    const-string v0, "layoutLiveCoreViewMask"

    .line 157
    .line 158
    .line 159
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 160
    move-object v0, v3

    .line 161
    .line 162
    :cond_9
    iget-object v1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->u:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/LiveCoreViewMaskBackgroundView;

    .line 163
    .line 164
    if-nez v1, :cond_a

    .line 165
    .line 166
    const-string v1, "liveCoreViewMaskBackgroundView"

    .line 167
    .line 168
    .line 169
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 170
    move-object v1, v3

    .line 171
    .line 172
    .line 173
    :cond_a
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->e0()V

    .line 177
    .line 178
    const/16 v0, 0x15

    .line 179
    .line 180
    .line 181
    invoke-static {v0}, Lvc0/e;->b(I)V

    .line 182
    .line 183
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->s:Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;

    .line 184
    .line 185
    if-nez v0, :cond_b

    .line 186
    .line 187
    .line 188
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 189
    move-object v0, v3

    .line 190
    .line 191
    .line 192
    :cond_b
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->getCoverURL()Ljava/lang/String;

    .line 193
    move-result-object v0

    .line 194
    .line 195
    iget-object v1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->s:Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;

    .line 196
    .line 197
    if-nez v1, :cond_c

    .line 198
    .line 199
    .line 200
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 201
    goto :goto_0

    .line 202
    :cond_c
    move-object v3, v1

    .line 203
    .line 204
    .line 205
    :goto_0
    invoke-virtual {v3}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->getSeatLayoutTemplateID()I

    .line 206
    move-result v1

    .line 207
    .line 208
    .line 209
    invoke-virtual {p0, v0, v1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->h1(Ljava/lang/String;I)V

    .line 210
    return-void
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
.end method

.method public final K0()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    const-string v1, "null cannot be cast to non-null type android.app.Activity"

    .line 7
    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    check-cast v0, Landroid/app/Activity;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/app/Activity;->getRequestedOrientation()I

    .line 15
    move-result v0

    .line 16
    const/4 v1, 0x1

    .line 17
    .line 18
    if-ne v0, v1, :cond_0

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v1, 0x0

    .line 21
    .line 22
    .line 23
    :goto_0
    invoke-virtual {p0, v1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->A1(Z)V

    .line 24
    .line 25
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->P:Landroid/widget/FrameLayout;

    .line 26
    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    const-string v0, "layoutSwitchOrientationButton"

    .line 30
    .line 31
    .line 32
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 33
    const/4 v0, 0x0

    .line 34
    .line 35
    :cond_1
    new-instance v1, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/p;

    .line 36
    .line 37
    .line 38
    invoke-direct {v1, p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/p;-><init>(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 42
    return-void
.end method

.method public final M0()V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->a0:Lcom/trtc/uikit/livekit/kc/widget/KCTradeCardView;

    .line 3
    .line 4
    const-string v1, "tradeCardView"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    .line 10
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 11
    move-object v0, v2

    .line 12
    .line 13
    :cond_0
    iget-object v3, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->b0:Lcom/trtc/uikit/livekit/kc/roominfo/service/KCRoomInfoService;

    .line 14
    .line 15
    if-nez v3, :cond_1

    .line 16
    .line 17
    const-string v3, "kcRoomInfoService"

    .line 18
    .line 19
    .line 20
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 21
    move-object v3, v2

    .line 22
    .line 23
    .line 24
    :cond_1
    invoke-virtual {v0, v3}, Lcom/trtc/uikit/livekit/kc/widget/KCTradeCardView;->i(Lcom/trtc/uikit/livekit/kc/roominfo/service/KCRoomInfoService;)V

    .line 25
    .line 26
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->a0:Lcom/trtc/uikit/livekit/kc/widget/KCTradeCardView;

    .line 27
    .line 28
    if-nez v0, :cond_2

    .line 29
    .line 30
    .line 31
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 32
    goto :goto_0

    .line 33
    :cond_2
    move-object v2, v0

    .line 34
    .line 35
    :goto_0
    new-instance v0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$i;

    .line 36
    .line 37
    .line 38
    invoke-direct {v0, p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$i;-><init>(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2, v0}, Lcom/trtc/uikit/livekit/kc/widget/KCTradeCardView;->setOnVisibilityChangeListener(Lcom/trtc/uikit/livekit/kc/widget/KCTradeCardView$a;)V

    .line 42
    return-void
.end method

.method public final O0()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->R:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/CoGuestRequestFloatView;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    const-string v0, "waitingCoGuestPassView"

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 10
    const/4 v0, 0x0

    .line 11
    .line 12
    :cond_0
    new-instance v1, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/b;

    .line 13
    .line 14
    .line 15
    invoke-direct {v1, p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/b;-><init>(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 19
    return-void
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
.end method

.method public final Q0()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->m0:Z

    .line 3
    return v0
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
.end method

.method public final R0()Z
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    const-string v1, "null cannot be cast to non-null type android.app.Activity"

    .line 7
    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    check-cast v0, Landroid/app/Activity;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/app/Activity;->getRequestedOrientation()I

    .line 15
    move-result v0

    .line 16
    const/4 v1, 0x1

    .line 17
    .line 18
    if-ne v0, v1, :cond_0

    .line 19
    return v1

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    return v0
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
.end method

.method public final S0()V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->v1()V

    .line 4
    const/4 v0, 0x1

    .line 5
    .line 6
    iput-boolean v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->m0:Z

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/BasicView;->getAudienceStore()Lee0/f;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lee0/f;->e()V

    .line 14
    .line 15
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->v:Landroid/widget/FrameLayout;

    .line 16
    const/4 v1, 0x0

    .line 17
    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    const-string v0, "layoutPlaying"

    .line 21
    .line 22
    .line 23
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 24
    move-object v0, v1

    .line 25
    .line 26
    :cond_0
    const/16 v2, 0x8

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->f1()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/BasicView;->getAudienceStore()Lee0/f;

    .line 36
    move-result-object v0

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Lee0/f;->t()Lcom/trtc/uikit/livekit/features/audiencecontainer/store/MediaStore;

    .line 40
    move-result-object v0

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/store/MediaStore;->n()V

    .line 44
    .line 45
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->t:Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;

    .line 46
    .line 47
    if-nez v0, :cond_1

    .line 48
    .line 49
    const-string v0, "liveCoreView"

    .line 50
    .line 51
    .line 52
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 53
    move-object v0, v1

    .line 54
    .line 55
    .line 56
    :cond_1
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/BasicView;->getMediaState()Lee0/h;

    .line 57
    move-result-object v2

    .line 58
    .line 59
    .line 60
    invoke-virtual {v2}, Lee0/h;->a()Lkotlinx/coroutines/flow/n;

    .line 61
    move-result-object v2

    .line 62
    .line 63
    .line 64
    invoke-interface {v2}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 65
    move-result-object v2

    .line 66
    .line 67
    check-cast v2, Landroid/graphics/Bitmap;

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/BasicView;->getMediaState()Lee0/h;

    .line 71
    move-result-object v3

    .line 72
    .line 73
    .line 74
    invoke-virtual {v3}, Lee0/h;->d()Lkotlinx/coroutines/flow/n;

    .line 75
    move-result-object v3

    .line 76
    .line 77
    .line 78
    invoke-interface {v3}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 79
    move-result-object v3

    .line 80
    .line 81
    check-cast v3, Landroid/graphics/Bitmap;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0, v2, v3}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->setLocalVideoMuteImage(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->i1()V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/BasicView;->getLiveListStore()Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;

    .line 91
    move-result-object v0

    .line 92
    .line 93
    iget-object v2, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->s:Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;

    .line 94
    .line 95
    if-nez v2, :cond_2

    .line 96
    .line 97
    const-string v2, "liveInfo"

    .line 98
    .line 99
    .line 100
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 101
    goto :goto_0

    .line 102
    :cond_2
    move-object v1, v2

    .line 103
    .line 104
    .line 105
    :goto_0
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->getLiveID()Ljava/lang/String;

    .line 106
    move-result-object v1

    .line 107
    .line 108
    new-instance v2, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$j;

    .line 109
    .line 110
    .line 111
    invoke-direct {v2, p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$j;-><init>(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0, v1, v2}, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;->joinLive(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/live/LiveInfoCompletionHandler;)V

    .line 115
    return-void
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
.end method

.method public final T0()V
    .locals 27

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->w1()V

    .line 6
    .line 7
    iget-object v1, v0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->t:Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;

    .line 8
    .line 9
    const-string v2, "liveCoreView"

    .line 10
    const/4 v3, 0x0

    .line 11
    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 16
    move-object v1, v3

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 20
    move-result-object v4

    .line 21
    .line 22
    .line 23
    const v5, 0x106000d

    .line 24
    .line 25
    .line 26
    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I

    .line 27
    move-result v4

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1, v4}, Landroid/view/View;->setBackgroundColor(I)V

    .line 31
    .line 32
    iget-boolean v1, v0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->m0:Z

    .line 33
    .line 34
    if-nez v1, :cond_1

    .line 35
    return-void

    .line 36
    :cond_1
    const/4 v1, 0x0

    .line 37
    .line 38
    iput-boolean v1, v0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->m0:Z

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->u1()V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/BasicView;->getAudienceStore()Lee0/f;

    .line 45
    move-result-object v1

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1}, Lee0/f;->C()V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/BasicView;->getAudienceStore()Lee0/f;

    .line 52
    move-result-object v1

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1}, Lee0/f;->p()Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;

    .line 56
    move-result-object v1

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1, v3}, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;->leaveLive(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/BasicView;->getAudienceStore()Lee0/f;

    .line 63
    move-result-object v1

    .line 64
    .line 65
    new-instance v4, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;

    .line 66
    .line 67
    .line 68
    const v25, 0x7ffff

    .line 69
    .line 70
    const/16 v26, 0x0

    .line 71
    const/4 v5, 0x0

    .line 72
    const/4 v6, 0x0

    .line 73
    const/4 v7, 0x0

    .line 74
    const/4 v8, 0x0

    .line 75
    const/4 v9, 0x0

    .line 76
    const/4 v10, 0x0

    .line 77
    const/4 v11, 0x0

    .line 78
    const/4 v12, 0x0

    .line 79
    const/4 v13, 0x0

    .line 80
    const/4 v14, 0x0

    .line 81
    const/4 v15, 0x0

    .line 82
    .line 83
    const/16 v16, 0x0

    .line 84
    .line 85
    const/16 v17, 0x0

    .line 86
    .line 87
    const/16 v18, 0x0

    .line 88
    .line 89
    const/16 v19, 0x0

    .line 90
    .line 91
    const-wide/16 v20, 0x0

    .line 92
    .line 93
    const/16 v22, 0x0

    .line 94
    .line 95
    const/16 v23, 0x0

    .line 96
    .line 97
    const/16 v24, 0x0

    .line 98
    .line 99
    .line 100
    invoke-direct/range {v4 .. v26}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZILio/trtc/tuikit/atomicxcore/api/live/TakeSeatMode;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;ILio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;JIZLjava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v1, v4}, Lee0/f;->E(Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;)V

    .line 104
    .line 105
    iget-object v1, v0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->t:Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;

    .line 106
    .line 107
    if-nez v1, :cond_2

    .line 108
    .line 109
    .line 110
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 111
    move-object v1, v3

    .line 112
    .line 113
    .line 114
    :cond_2
    invoke-virtual {v1, v3, v3}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->setLocalVideoMuteImage(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/BasicView;->getMediaStore()Lcom/trtc/uikit/livekit/features/audiencecontainer/store/MediaStore;

    .line 118
    move-result-object v1

    .line 119
    .line 120
    .line 121
    invoke-virtual {v1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/store/MediaStore;->m()V

    .line 122
    .line 123
    iget-object v1, v0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->F:Lcom/trtc/uikit/livekit/component/roominfo/LiveInfoView;

    .line 124
    .line 125
    if-nez v1, :cond_3

    .line 126
    .line 127
    const-string v1, "roomInfoView"

    .line 128
    .line 129
    .line 130
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 131
    move-object v1, v3

    .line 132
    .line 133
    .line 134
    :cond_3
    invoke-virtual {v1}, Lcom/trtc/uikit/livekit/component/roominfo/LiveInfoView;->E()V

    .line 135
    .line 136
    .line 137
    invoke-static {}, Lfd0/d;->d()V

    .line 138
    .line 139
    .line 140
    invoke-static {}, Ljd0/a;->a()V

    .line 141
    .line 142
    iput-object v3, v0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->o0:Lio/trtc/tuikit/atomicxcore/api/device/VideoQuality;

    .line 143
    return-void
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
.end method

.method public final U0(Ljava/util/List;)V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NotifyDataSetChanged"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/n;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0, p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/n;-><init>(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;Ljava/util/List;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

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
.end method

.method public final W0()V
    .locals 4

    .line 1
    .line 2
    sget-object v0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->v0:Lcom/trtc/uikit/livekit/common/LiveKitLogger;

    .line 3
    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    const-string v2, "onExitButtonClick, isLoading:"

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    iget-boolean v2, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->g0:Z

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    move-result-object v1

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1}, Lcom/trtc/uikit/livekit/common/LiveKitLogger;->b(Ljava/lang/String;)Ljava/lang/Object;

    .line 25
    .line 26
    iget-boolean v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->g0:Z

    .line 27
    .line 28
    if-eqz v0, :cond_0

    .line 29
    return-void

    .line 30
    .line 31
    .line 32
    :cond_0
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/BasicView;->getCoGuestState()Lio/trtc/tuikit/atomicxcore/api/live/CoGuestState;

    .line 33
    move-result-object v0

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestState;->getConnected()Lkotlinx/coroutines/flow/w;

    .line 37
    move-result-object v0

    .line 38
    .line 39
    .line 40
    invoke-interface {v0}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 41
    move-result-object v0

    .line 42
    .line 43
    check-cast v0, Ljava/lang/Iterable;

    .line 44
    .line 45
    instance-of v1, v0, Ljava/util/Collection;

    .line 46
    const/4 v2, 0x0

    .line 47
    .line 48
    if-eqz v1, :cond_1

    .line 49
    move-object v1, v0

    .line 50
    .line 51
    check-cast v1, Ljava/util/Collection;

    .line 52
    .line 53
    .line 54
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 55
    move-result v1

    .line 56
    .line 57
    if-eqz v1, :cond_1

    .line 58
    goto :goto_1

    .line 59
    .line 60
    .line 61
    :cond_1
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 62
    move-result-object v0

    .line 63
    .line 64
    .line 65
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 66
    move-result v1

    .line 67
    .line 68
    if-eqz v1, :cond_4

    .line 69
    .line 70
    .line 71
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 72
    move-result-object v1

    .line 73
    .line 74
    check-cast v1, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;->getUserID()Ljava/lang/String;

    .line 78
    move-result-object v1

    .line 79
    .line 80
    sget-object v3, Lio/trtc/tuikit/atomicxcore/api/login/LoginStore;->shared:Lio/trtc/tuikit/atomicxcore/api/login/LoginStore;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v3}, Lio/trtc/tuikit/atomicxcore/api/login/LoginStore;->getLoginState()Lio/trtc/tuikit/atomicxcore/api/login/LoginState;

    .line 84
    move-result-object v3

    .line 85
    .line 86
    .line 87
    invoke-virtual {v3}, Lio/trtc/tuikit/atomicxcore/api/login/LoginState;->getLoginUserInfo()Lkotlinx/coroutines/flow/w;

    .line 88
    move-result-object v3

    .line 89
    .line 90
    .line 91
    invoke-interface {v3}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 92
    move-result-object v3

    .line 93
    .line 94
    check-cast v3, Lio/trtc/tuikit/atomicxcore/api/login/UserProfile;

    .line 95
    .line 96
    if-eqz v3, :cond_3

    .line 97
    .line 98
    .line 99
    invoke-virtual {v3}, Lio/trtc/tuikit/atomicxcore/api/login/UserProfile;->getUserID()Ljava/lang/String;

    .line 100
    move-result-object v3

    .line 101
    goto :goto_0

    .line 102
    :cond_3
    move-object v3, v2

    .line 103
    .line 104
    .line 105
    :goto_0
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 106
    move-result v1

    .line 107
    .line 108
    if-eqz v1, :cond_2

    .line 109
    .line 110
    .line 111
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->m1()V

    .line 112
    return-void

    .line 113
    .line 114
    :cond_4
    :goto_1
    const-string v0, "EVENT_KEY_LIVE_KIT"

    .line 115
    .line 116
    const-string v1, "EVENT_SUB_KEY_DESTROY_LIVE_VIEW"

    .line 117
    .line 118
    .line 119
    invoke-static {v0, v1, v2}, Lcom/tencent/qcloud/tuicore/TUICore;->notifyEvent(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    .line 120
    return-void
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
.end method

.method public final X0(Z)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->D:Landroid/widget/ImageView;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    const-string v0, "imageCoGuest"

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 10
    const/4 v0, 0x0

    .line 11
    .line 12
    :cond_0
    if-eqz p1, :cond_1

    .line 13
    .line 14
    const/16 p1, 0x8

    .line 15
    goto :goto_0

    .line 16
    :cond_1
    const/4 p1, 0x0

    .line 17
    .line 18
    .line 19
    :goto_0
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 20
    return-void
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
.end method

.method public final Y0(Z)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->K:Landroid/widget/ImageView;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    const-string v0, "imageFloatWindow"

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 10
    const/4 v0, 0x0

    .line 11
    .line 12
    :cond_0
    if-eqz p1, :cond_1

    .line 13
    .line 14
    const/16 p1, 0x8

    .line 15
    goto :goto_0

    .line 16
    :cond_1
    const/4 p1, 0x0

    .line 17
    .line 18
    .line 19
    :goto_0
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 20
    return-void
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
.end method

.method public final Z0(Z)V
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->F:Lcom/trtc/uikit/livekit/component/roominfo/LiveInfoView;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string v0, "roomInfoView"

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 11
    move-object v0, v1

    .line 12
    :cond_0
    const/4 v2, 0x0

    .line 13
    .line 14
    const/16 v3, 0x8

    .line 15
    .line 16
    if-eqz p1, :cond_1

    .line 17
    move v4, v3

    .line 18
    goto :goto_0

    .line 19
    :cond_1
    move v4, v2

    .line 20
    .line 21
    .line 22
    :goto_0
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 23
    .line 24
    const-string v0, "audienceListView"

    .line 25
    .line 26
    if-eqz p1, :cond_3

    .line 27
    .line 28
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->H:Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView;

    .line 29
    .line 30
    if-nez p1, :cond_2

    .line 31
    .line 32
    .line 33
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 34
    goto :goto_1

    .line 35
    :cond_2
    move-object v1, p1

    .line 36
    .line 37
    .line 38
    :goto_1
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 39
    return-void

    .line 40
    .line 41
    :cond_3
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->H:Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView;

    .line 42
    .line 43
    if-nez p1, :cond_4

    .line 44
    .line 45
    .line 46
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 47
    goto :goto_2

    .line 48
    :cond_4
    move-object v1, p1

    .line 49
    .line 50
    :goto_2
    sget-object p1, Lee0/a;->a:Lee0/a;

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1}, Lee0/a;->d()Lkotlinx/coroutines/flow/n;

    .line 54
    move-result-object p1

    .line 55
    .line 56
    .line 57
    invoke-interface {p1}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 58
    move-result-object p1

    .line 59
    .line 60
    check-cast p1, Ljava/lang/Boolean;

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 64
    move-result p1

    .line 65
    const/4 v0, 0x1

    .line 66
    .line 67
    if-ne p1, v0, :cond_5

    .line 68
    move v2, v3

    .line 69
    .line 70
    .line 71
    :cond_5
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 72
    return-void
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
.end method

.method public a()V
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
.end method

.method public final a1(Z)V
    .locals 5

    .line 1
    .line 2
    sget-object v0, Lee0/a;->a:Lee0/a;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lee0/a;->c()Lkotlinx/coroutines/flow/n;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-interface {v0}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    check-cast v0, Ljava/lang/Boolean;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 16
    move-result v0

    .line 17
    const/4 v1, 0x1

    .line 18
    .line 19
    const/16 v2, 0x8

    .line 20
    const/4 v3, 0x0

    .line 21
    .line 22
    const-string v4, "audienceListView"

    .line 23
    .line 24
    if-ne v0, v1, :cond_1

    .line 25
    .line 26
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->H:Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView;

    .line 27
    .line 28
    if-nez p1, :cond_0

    .line 29
    .line 30
    .line 31
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move-object v3, p1

    .line 34
    .line 35
    .line 36
    :goto_0
    invoke-virtual {v3, v2}, Landroid/view/View;->setVisibility(I)V

    .line 37
    return-void

    .line 38
    .line 39
    :cond_1
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->H:Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView;

    .line 40
    .line 41
    if-nez v0, :cond_2

    .line 42
    .line 43
    .line 44
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 45
    goto :goto_1

    .line 46
    :cond_2
    move-object v3, v0

    .line 47
    .line 48
    :goto_1
    if-eqz p1, :cond_3

    .line 49
    goto :goto_2

    .line 50
    :cond_3
    const/4 v2, 0x0

    .line 51
    .line 52
    .line 53
    :goto_2
    invoke-virtual {v3, v2}, Landroid/view/View;->setVisibility(I)V

    .line 54
    return-void
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
.end method

.method public final b1()V
    .locals 8

    .line 1
    .line 2
    new-instance v0, Ljava/util/HashMap;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/BasicView;->getCoGuestState()Lio/trtc/tuikit/atomicxcore/api/live/CoGuestState;

    .line 9
    move-result-object v1

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestState;->getConnected()Lkotlinx/coroutines/flow/w;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    .line 16
    invoke-interface {v1}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 17
    move-result-object v1

    .line 18
    .line 19
    check-cast v1, Ljava/lang/Iterable;

    .line 20
    .line 21
    instance-of v2, v1, Ljava/util/Collection;

    .line 22
    .line 23
    const/16 v3, 0x8

    .line 24
    .line 25
    const-string v4, "EVENT_PARAMS_IS_LINKING"

    .line 26
    .line 27
    const-string v5, "waitingCoGuestPassView"

    .line 28
    const/4 v6, 0x0

    .line 29
    .line 30
    if-eqz v2, :cond_0

    .line 31
    move-object v2, v1

    .line 32
    .line 33
    check-cast v2, Ljava/util/Collection;

    .line 34
    .line 35
    .line 36
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 37
    move-result v2

    .line 38
    .line 39
    if-eqz v2, :cond_0

    .line 40
    goto :goto_2

    .line 41
    .line 42
    .line 43
    :cond_0
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 44
    move-result-object v1

    .line 45
    .line 46
    .line 47
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    move-result v2

    .line 49
    .line 50
    if-eqz v2, :cond_4

    .line 51
    .line 52
    .line 53
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 54
    move-result-object v2

    .line 55
    .line 56
    check-cast v2, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;->getUserID()Ljava/lang/String;

    .line 60
    move-result-object v2

    .line 61
    .line 62
    sget-object v7, Lio/trtc/tuikit/atomicxcore/api/login/LoginStore;->shared:Lio/trtc/tuikit/atomicxcore/api/login/LoginStore;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v7}, Lio/trtc/tuikit/atomicxcore/api/login/LoginStore;->getLoginState()Lio/trtc/tuikit/atomicxcore/api/login/LoginState;

    .line 66
    move-result-object v7

    .line 67
    .line 68
    .line 69
    invoke-virtual {v7}, Lio/trtc/tuikit/atomicxcore/api/login/LoginState;->getLoginUserInfo()Lkotlinx/coroutines/flow/w;

    .line 70
    move-result-object v7

    .line 71
    .line 72
    .line 73
    invoke-interface {v7}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 74
    move-result-object v7

    .line 75
    .line 76
    check-cast v7, Lio/trtc/tuikit/atomicxcore/api/login/UserProfile;

    .line 77
    .line 78
    if-eqz v7, :cond_2

    .line 79
    .line 80
    .line 81
    invoke-virtual {v7}, Lio/trtc/tuikit/atomicxcore/api/login/UserProfile;->getUserID()Ljava/lang/String;

    .line 82
    move-result-object v7

    .line 83
    goto :goto_0

    .line 84
    :cond_2
    move-object v7, v6

    .line 85
    .line 86
    .line 87
    :goto_0
    invoke-static {v2, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 88
    move-result v2

    .line 89
    .line 90
    if-eqz v2, :cond_1

    .line 91
    .line 92
    iget-object v1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->R:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/CoGuestRequestFloatView;

    .line 93
    .line 94
    if-nez v1, :cond_3

    .line 95
    .line 96
    .line 97
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 98
    goto :goto_1

    .line 99
    :cond_3
    move-object v6, v1

    .line 100
    .line 101
    .line 102
    :goto_1
    invoke-virtual {v6, v3}, Landroid/view/View;->setVisibility(I)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->s1()V

    .line 106
    .line 107
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 108
    .line 109
    .line 110
    invoke-interface {v0, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    goto :goto_5

    .line 112
    .line 113
    .line 114
    :cond_4
    :goto_2
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/BasicView;->getViewState()Lee0/j;

    .line 115
    move-result-object v1

    .line 116
    .line 117
    .line 118
    invoke-virtual {v1}, Lee0/j;->c()Lkotlinx/coroutines/flow/n;

    .line 119
    move-result-object v1

    .line 120
    .line 121
    .line 122
    invoke-interface {v1}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 123
    move-result-object v1

    .line 124
    .line 125
    check-cast v1, Ljava/lang/Boolean;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 129
    move-result v1

    .line 130
    .line 131
    if-eqz v1, :cond_6

    .line 132
    .line 133
    iget-object v1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->R:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/CoGuestRequestFloatView;

    .line 134
    .line 135
    if-nez v1, :cond_5

    .line 136
    .line 137
    .line 138
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 139
    goto :goto_3

    .line 140
    :cond_5
    move-object v6, v1

    .line 141
    :goto_3
    const/4 v1, 0x0

    .line 142
    .line 143
    .line 144
    invoke-virtual {v6, v1}, Landroid/view/View;->setVisibility(I)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->c0()V

    .line 148
    .line 149
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 150
    .line 151
    .line 152
    invoke-interface {v0, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 153
    goto :goto_5

    .line 154
    .line 155
    :cond_6
    iget-object v1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->R:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/CoGuestRequestFloatView;

    .line 156
    .line 157
    if-nez v1, :cond_7

    .line 158
    .line 159
    .line 160
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 161
    goto :goto_4

    .line 162
    :cond_7
    move-object v6, v1

    .line 163
    .line 164
    .line 165
    :goto_4
    invoke-virtual {v6, v3}, Landroid/view/View;->setVisibility(I)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->m0()V

    .line 169
    .line 170
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 171
    .line 172
    .line 173
    invoke-interface {v0, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 174
    .line 175
    :goto_5
    const-string v1, "EVENT_KEY_LIVE_KIT"

    .line 176
    .line 177
    const-string v2, "EVENT_SUB_KEY_LINK_STATUS_CHANGE"

    .line 178
    .line 179
    .line 180
    invoke-static {v1, v2, v0}, Lcom/tencent/qcloud/tuicore/TUICore;->notifyEvent(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    .line 181
    return-void
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
.end method

.method public c()V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    sget v1, Lcom/trtc/uikit/livekit/R$layout;->livekit_livestream_audience_view:I

    .line 11
    const/4 v2, 0x1

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 15
    .line 16
    sget v0, Lcom/trtc/uikit/livekit/R$id;->fl_playing:I

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    const-string v1, "findViewById(...)"

    .line 23
    .line 24
    .line 25
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    check-cast v0, Landroid/widget/FrameLayout;

    .line 28
    .line 29
    iput-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->v:Landroid/widget/FrameLayout;

    .line 30
    .line 31
    sget v0, Lcom/trtc/uikit/livekit/R$id;->iv_co_guest:I

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 35
    move-result-object v0

    .line 36
    .line 37
    .line 38
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    check-cast v0, Landroid/widget/ImageView;

    .line 41
    .line 42
    iput-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->D:Landroid/widget/ImageView;

    .line 43
    .line 44
    sget v0, Lcom/trtc/uikit/livekit/R$id;->iv_more:I

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 48
    move-result-object v0

    .line 49
    .line 50
    .line 51
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    check-cast v0, Landroid/widget/ImageView;

    .line 54
    .line 55
    iput-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->A:Landroid/widget/ImageView;

    .line 56
    .line 57
    sget v0, Lcom/trtc/uikit/livekit/R$id;->btn_gift:I

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 61
    move-result-object v0

    .line 62
    .line 63
    .line 64
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    .line 66
    check-cast v0, Lcom/trtc/uikit/livekit/component/giftaccess/GiftButton;

    .line 67
    .line 68
    iput-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->B:Lcom/trtc/uikit/livekit/component/giftaccess/GiftButton;

    .line 69
    .line 70
    sget v0, Lcom/trtc/uikit/livekit/R$id;->btn_like:I

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 74
    move-result-object v0

    .line 75
    .line 76
    .line 77
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    .line 79
    check-cast v0, Lcom/trtc/uikit/livekit/component/gift/LikeButton;

    .line 80
    .line 81
    iput-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->C:Lcom/trtc/uikit/livekit/component/gift/LikeButton;

    .line 82
    .line 83
    sget v0, Lcom/trtc/uikit/livekit/R$id;->barrage_input_view:I

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 87
    move-result-object v0

    .line 88
    .line 89
    .line 90
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 91
    .line 92
    check-cast v0, Lcom/trtc/uikit/livekit/component/barrage/BarrageInputView;

    .line 93
    .line 94
    iput-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->E:Lcom/trtc/uikit/livekit/component/barrage/BarrageInputView;

    .line 95
    .line 96
    sget v0, Lcom/trtc/uikit/livekit/R$id;->room_info_view:I

    .line 97
    .line 98
    .line 99
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 100
    move-result-object v0

    .line 101
    .line 102
    .line 103
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 104
    .line 105
    check-cast v0, Lcom/trtc/uikit/livekit/component/roominfo/LiveInfoView;

    .line 106
    .line 107
    iput-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->F:Lcom/trtc/uikit/livekit/component/roominfo/LiveInfoView;

    .line 108
    .line 109
    sget v0, Lcom/trtc/uikit/livekit/R$id;->audience_list_view:I

    .line 110
    .line 111
    .line 112
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 113
    move-result-object v0

    .line 114
    .line 115
    .line 116
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 117
    .line 118
    check-cast v0, Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView;

    .line 119
    .line 120
    iput-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->H:Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView;

    .line 121
    .line 122
    sget v0, Lcom/trtc/uikit/livekit/R$id;->barrage_stream_view:I

    .line 123
    .line 124
    .line 125
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 126
    move-result-object v0

    .line 127
    .line 128
    .line 129
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 130
    .line 131
    check-cast v0, Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView;

    .line 132
    .line 133
    iput-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->I:Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView;

    .line 134
    .line 135
    sget v0, Lcom/trtc/uikit/livekit/R$id;->network_info_view:I

    .line 136
    .line 137
    .line 138
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 139
    move-result-object v0

    .line 140
    .line 141
    .line 142
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 143
    .line 144
    check-cast v0, Lcom/trtc/uikit/livekit/component/networkInfo/NetworkInfoView;

    .line 145
    .line 146
    iput-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->J:Lcom/trtc/uikit/livekit/component/networkInfo/NetworkInfoView;

    .line 147
    .line 148
    sget v0, Lcom/trtc/uikit/livekit/R$id;->btn_waiting_pass:I

    .line 149
    .line 150
    .line 151
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 152
    move-result-object v0

    .line 153
    .line 154
    .line 155
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 156
    .line 157
    check-cast v0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/CoGuestRequestFloatView;

    .line 158
    .line 159
    iput-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->R:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/CoGuestRequestFloatView;

    .line 160
    .line 161
    sget v0, Lcom/trtc/uikit/livekit/R$id;->gift_play_view:I

    .line 162
    .line 163
    .line 164
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 165
    move-result-object v0

    .line 166
    .line 167
    .line 168
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 169
    .line 170
    check-cast v0, Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;

    .line 171
    .line 172
    iput-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->G:Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;

    .line 173
    .line 174
    sget v0, Lcom/trtc/uikit/livekit/R$id;->iv_float_window:I

    .line 175
    .line 176
    .line 177
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 178
    move-result-object v0

    .line 179
    .line 180
    .line 181
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 182
    .line 183
    check-cast v0, Landroid/widget/ImageView;

    .line 184
    .line 185
    iput-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->K:Landroid/widget/ImageView;

    .line 186
    .line 187
    sget v0, Lcom/trtc/uikit/livekit/R$id;->iv_preview_share:I

    .line 188
    .line 189
    .line 190
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 191
    move-result-object v0

    .line 192
    .line 193
    .line 194
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 195
    .line 196
    check-cast v0, Landroid/widget/ImageView;

    .line 197
    .line 198
    iput-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->L:Landroid/widget/ImageView;

    .line 199
    .line 200
    sget v0, Lcom/trtc/uikit/livekit/R$id;->iv_preview_report:I

    .line 201
    .line 202
    .line 203
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 204
    move-result-object v0

    .line 205
    .line 206
    .line 207
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 208
    .line 209
    check-cast v0, Landroid/widget/ImageView;

    .line 210
    .line 211
    iput-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->M:Landroid/widget/ImageView;

    .line 212
    .line 213
    sget v0, Lcom/trtc/uikit/livekit/R$id;->iv_standard_exit_room:I

    .line 214
    .line 215
    .line 216
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 217
    move-result-object v0

    .line 218
    .line 219
    .line 220
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 221
    .line 222
    check-cast v0, Landroid/widget/ImageView;

    .line 223
    .line 224
    iput-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->N:Landroid/widget/ImageView;

    .line 225
    .line 226
    sget v0, Lcom/trtc/uikit/livekit/R$id;->iv_compact_exit_room:I

    .line 227
    .line 228
    .line 229
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 230
    move-result-object v0

    .line 231
    .line 232
    .line 233
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 234
    .line 235
    check-cast v0, Landroid/widget/ImageView;

    .line 236
    .line 237
    iput-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->O:Landroid/widget/ImageView;

    .line 238
    .line 239
    sget v0, Lcom/trtc/uikit/livekit/R$id;->video_view_background:I

    .line 240
    .line 241
    .line 242
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 243
    move-result-object v0

    .line 244
    .line 245
    .line 246
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 247
    .line 248
    check-cast v0, Landroid/widget/ImageView;

    .line 249
    .line 250
    iput-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->y:Landroid/widget/ImageView;

    .line 251
    .line 252
    sget v0, Lcom/trtc/uikit/livekit/R$id;->live_core_view:I

    .line 253
    .line 254
    .line 255
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 256
    move-result-object v0

    .line 257
    .line 258
    .line 259
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 260
    .line 261
    check-cast v0, Landroid/widget/FrameLayout;

    .line 262
    .line 263
    iput-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->w:Landroid/widget/FrameLayout;

    .line 264
    .line 265
    sget v0, Lcom/trtc/uikit/livekit/R$id;->live_core_view_mask:I

    .line 266
    .line 267
    .line 268
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 269
    move-result-object v0

    .line 270
    .line 271
    .line 272
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 273
    .line 274
    check-cast v0, Landroid/widget/FrameLayout;

    .line 275
    .line 276
    iput-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->x:Landroid/widget/FrameLayout;

    .line 277
    .line 278
    sget v0, Lcom/trtc/uikit/livekit/R$id;->fl_playing_root:I

    .line 279
    .line 280
    .line 281
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 282
    move-result-object v0

    .line 283
    .line 284
    .line 285
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 286
    .line 287
    check-cast v0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudiencePlayingRootView;

    .line 288
    .line 289
    iput-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->S:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudiencePlayingRootView;

    .line 290
    .line 291
    sget v0, Lcom/trtc/uikit/livekit/R$id;->fl_switch_orientation_button:I

    .line 292
    .line 293
    .line 294
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 295
    move-result-object v0

    .line 296
    .line 297
    .line 298
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 299
    .line 300
    check-cast v0, Landroid/widget/FrameLayout;

    .line 301
    .line 302
    iput-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->P:Landroid/widget/FrameLayout;

    .line 303
    .line 304
    sget v0, Lcom/trtc/uikit/livekit/R$id;->img_switch_orientation_button_icon:I

    .line 305
    .line 306
    .line 307
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 308
    move-result-object v0

    .line 309
    .line 310
    .line 311
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 312
    .line 313
    check-cast v0, Landroid/widget/ImageView;

    .line 314
    .line 315
    iput-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->Q:Landroid/widget/ImageView;

    .line 316
    .line 317
    sget v0, Lcom/trtc/uikit/livekit/R$id;->people_count_view:I

    .line 318
    .line 319
    .line 320
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 321
    move-result-object v0

    .line 322
    .line 323
    .line 324
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 325
    .line 326
    check-cast v0, Lcom/trtc/uikit/livekit/kc/widget/KCPeopleCountView;

    .line 327
    .line 328
    iput-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->V:Lcom/trtc/uikit/livekit/kc/widget/KCPeopleCountView;

    .line 329
    .line 330
    sget v0, Lcom/trtc/uikit/livekit/R$id;->kc_audience_preview_view:I

    .line 331
    .line 332
    .line 333
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 334
    move-result-object v0

    .line 335
    .line 336
    .line 337
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 338
    .line 339
    check-cast v0, Lcom/trtc/uikit/livekit/kc/widget/KCAudiencePreviewView;

    .line 340
    .line 341
    iput-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->z:Lcom/trtc/uikit/livekit/kc/widget/KCAudiencePreviewView;

    .line 342
    .line 343
    sget v0, Lcom/trtc/uikit/livekit/R$id;->cl_function:I

    .line 344
    .line 345
    .line 346
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 347
    move-result-object v0

    .line 348
    .line 349
    .line 350
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 351
    .line 352
    iput-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->U:Landroid/view/View;

    .line 353
    .line 354
    sget v0, Lcom/trtc/uikit/livekit/R$id;->risk_view:I

    .line 355
    .line 356
    .line 357
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 358
    move-result-object v0

    .line 359
    .line 360
    .line 361
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 362
    .line 363
    check-cast v0, Lcom/trtc/uikit/livekit/kc/widget/KCRiskView;

    .line 364
    .line 365
    iput-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->W:Lcom/trtc/uikit/livekit/kc/widget/KCRiskView;

    .line 366
    .line 367
    sget v0, Lcom/trtc/uikit/livekit/R$id;->trade_card_view:I

    .line 368
    .line 369
    .line 370
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 371
    move-result-object v0

    .line 372
    .line 373
    .line 374
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 375
    .line 376
    check-cast v0, Lcom/trtc/uikit/livekit/kc/widget/KCTradeCardView;

    .line 377
    .line 378
    iput-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->a0:Lcom/trtc/uikit/livekit/kc/widget/KCTradeCardView;

    .line 379
    .line 380
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->S:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudiencePlayingRootView;

    .line 381
    .line 382
    if-nez v0, :cond_0

    .line 383
    .line 384
    const-string v0, "audiencePlayingRootView"

    .line 385
    .line 386
    .line 387
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 388
    const/4 v0, 0x0

    .line 389
    .line 390
    :cond_0
    new-instance v1, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/s;

    .line 391
    .line 392
    .line 393
    invoke-direct {v1, p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/s;-><init>(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;)V

    .line 394
    .line 395
    .line 396
    invoke-static {v0, v1}, Landroidx/core/view/ViewCompat;->setOnApplyWindowInsetsListener(Landroid/view/View;Landroidx/core/view/OnApplyWindowInsetsListener;)V

    .line 397
    .line 398
    .line 399
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->u0()V

    .line 400
    return-void
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
.end method

.method public final c0()V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->D:Landroid/widget/ImageView;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    const-string v2, "imageCoGuest"

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    .line 10
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 11
    move-object v0, v1

    .line 12
    .line 13
    :cond_0
    sget v3, Lcom/trtc/uikit/livekit/R$drawable;->livekit_function_link_request:I

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 17
    .line 18
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->D:Landroid/widget/ImageView;

    .line 19
    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    .line 23
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 24
    goto :goto_0

    .line 25
    :cond_1
    move-object v1, v0

    .line 26
    .line 27
    :goto_0
    new-instance v0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/q;

    .line 28
    .line 29
    .line 30
    invoke-direct {v0, p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/q;-><init>(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 34
    return-void
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
.end method

.method public final c1(Lio/trtc/tuikit/atomicxcore/api/device/VideoQuality;)V
    .locals 12

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->o0:Lio/trtc/tuikit/atomicxcore/api/device/VideoQuality;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    if-eq v0, p1, :cond_0

    .line 7
    .line 8
    sget-object v1, Lio/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast;->a:Lio/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 12
    move-result-object v2

    .line 13
    .line 14
    const-string v0, "getContext(...)"

    .line 15
    .line 16
    .line 17
    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    new-instance v0, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 26
    move-result-object v3

    .line 27
    .line 28
    sget v4, Lcom/trtc/uikit/livekit/R$string;->live_video_resolution_changed:I

    .line 29
    .line 30
    .line 31
    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 32
    move-result-object v3

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    invoke-direct {p0, p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->C1(Lio/trtc/tuikit/atomicxcore/api/device/VideoQuality;)Ljava/lang/String;

    .line 42
    move-result-object v3

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    move-result-object v3

    .line 50
    .line 51
    sget-object v4, Lio/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast$Style;->INFO:Lio/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast$Style;

    .line 52
    .line 53
    const/16 v10, 0xf8

    .line 54
    const/4 v11, 0x0

    .line 55
    const/4 v5, 0x0

    .line 56
    const/4 v6, 0x0

    .line 57
    const/4 v7, 0x0

    .line 58
    const/4 v8, 0x0

    .line 59
    const/4 v9, 0x0

    .line 60
    .line 61
    .line 62
    invoke-static/range {v1 .. v11}, Lio/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast;->j(Lio/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast;Landroid/content/Context;Ljava/lang/String;Lio/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast$Style;Lio/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast$Position;Ljava/lang/Integer;Lio/trtc/tuikit/atomicx/widget/basicwidget/toast/AtomicToast$Duration;Ljava/lang/Integer;Ljava/util/Map;ILjava/lang/Object;)V

    .line 63
    .line 64
    :cond_0
    iput-object p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->o0:Lio/trtc/tuikit/atomicxcore/api/device/VideoQuality;

    .line 65
    return-void
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
.end method

.method public final d1(Z)V
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->P:Landroid/widget/FrameLayout;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string v0, "layoutSwitchOrientationButton"

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 11
    move-object v0, v1

    .line 12
    :cond_0
    const/4 v2, 0x0

    .line 13
    .line 14
    const/16 v3, 0x8

    .line 15
    .line 16
    if-eqz p1, :cond_1

    .line 17
    move v4, v2

    .line 18
    goto :goto_0

    .line 19
    :cond_1
    move v4, v3

    .line 20
    .line 21
    .line 22
    :goto_0
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 23
    .line 24
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->D:Landroid/widget/ImageView;

    .line 25
    .line 26
    const-string v4, "imageCoGuest"

    .line 27
    .line 28
    if-nez v0, :cond_2

    .line 29
    .line 30
    .line 31
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 32
    move-object v0, v1

    .line 33
    .line 34
    :cond_2
    if-eqz p1, :cond_3

    .line 35
    move v2, v3

    .line 36
    .line 37
    .line 38
    :cond_3
    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 39
    .line 40
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->D:Landroid/widget/ImageView;

    .line 41
    .line 42
    if-nez v0, :cond_4

    .line 43
    .line 44
    .line 45
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 46
    goto :goto_1

    .line 47
    :cond_4
    move-object v1, v0

    .line 48
    .line 49
    .line 50
    :goto_1
    invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 51
    .line 52
    if-eqz p1, :cond_5

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->K0()V

    .line 56
    return-void

    .line 57
    .line 58
    .line 59
    :cond_5
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 60
    move-result-object p1

    .line 61
    .line 62
    const-string v0, "null cannot be cast to non-null type android.app.Activity"

    .line 63
    .line 64
    .line 65
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    .line 67
    check-cast p1, Landroid/app/Activity;

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1}, Landroid/app/Activity;->getRequestedOrientation()I

    .line 71
    move-result p1

    .line 72
    .line 73
    if-nez p1, :cond_6

    .line 74
    const/4 p1, 0x1

    .line 75
    .line 76
    .line 77
    invoke-direct {p0, p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->setScreenOrientation(Z)V

    .line 78
    :cond_6
    return-void
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
.end method

.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 4
    .param p1    # Landroid/view/MotionEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "event"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 9
    move-result v0

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    const/4 v1, 0x2

    .line 13
    .line 14
    if-eq v0, v1, :cond_0

    .line 15
    goto :goto_0

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 19
    move-result v0

    .line 20
    .line 21
    iget v1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->i0:F

    .line 22
    sub-float/2addr v0, v1

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 26
    move-result v1

    .line 27
    .line 28
    iget v2, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->j0:F

    .line 29
    sub-float/2addr v1, v2

    .line 30
    .line 31
    .line 32
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 33
    move-result v2

    .line 34
    .line 35
    iget v3, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->k0:I

    .line 36
    int-to-float v3, v3

    .line 37
    .line 38
    cmpl-float v2, v2, v3

    .line 39
    .line 40
    if-lez v2, :cond_2

    .line 41
    .line 42
    .line 43
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 44
    move-result v0

    .line 45
    .line 46
    .line 47
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 48
    move-result v1

    .line 49
    .line 50
    cmpl-float v0, v0, v1

    .line 51
    .line 52
    if-lez v0, :cond_2

    .line 53
    const/4 v0, 0x1

    .line 54
    .line 55
    iput-boolean v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->l0:Z

    .line 56
    goto :goto_0

    .line 57
    .line 58
    .line 59
    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 60
    move-result v0

    .line 61
    .line 62
    iput v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->i0:F

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 66
    move-result v0

    .line 67
    .line 68
    iput v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->j0:F

    .line 69
    const/4 v0, 0x0

    .line 70
    .line 71
    iput-boolean v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->l0:Z

    .line 72
    .line 73
    :cond_2
    :goto_0
    iget-boolean v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->l0:Z

    .line 74
    .line 75
    if-eqz v0, :cond_4

    .line 76
    .line 77
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->S:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudiencePlayingRootView;

    .line 78
    .line 79
    if-nez v0, :cond_3

    .line 80
    .line 81
    const-string v0, "audiencePlayingRootView"

    .line 82
    .line 83
    .line 84
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 85
    const/4 v0, 0x0

    .line 86
    .line 87
    .line 88
    :cond_3
    invoke-virtual {v0, p1}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 89
    move-result p1

    .line 90
    return p1

    .line 91
    .line 92
    .line 93
    :cond_4
    invoke-super {p0, p1}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 94
    move-result p1

    .line 95
    return p1
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
.end method

.method public e()V
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
.end method

.method public final e0()V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/BasicView;->getMediaStore()Lcom/trtc/uikit/livekit/features/audiencecontainer/store/MediaStore;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    const-string v2, "getContext(...)"

    .line 11
    .line 12
    .line 13
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    sget v2, Lcom/trtc/uikit/livekit/R$drawable;->livekit_local_mute_image_multi:I

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1, v2, v2}, Lcom/trtc/uikit/livekit/features/audiencecontainer/store/MediaStore;->d(Landroid/content/Context;II)V

    .line 19
    return-void
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
.end method

.method public final e1()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    iput-boolean v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->g0:Z

    .line 4
    .line 5
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->f0:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$b;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    .line 10
    invoke-interface {v0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$b;->a()V

    .line 11
    :cond_0
    return-void
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
.end method

.method public final f0(Z)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    const-string v1, "audiencePlayingRootView"

    .line 4
    .line 5
    if-eqz p1, :cond_1

    .line 6
    .line 7
    iget-object v2, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->S:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudiencePlayingRootView;

    .line 8
    .line 9
    if-nez v2, :cond_0

    .line 10
    .line 11
    .line 12
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move-object v0, v2

    .line 15
    .line 16
    :goto_0
    const/16 v1, 0x8

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 20
    goto :goto_2

    .line 21
    .line 22
    :cond_1
    iget-object v2, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->S:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudiencePlayingRootView;

    .line 23
    .line 24
    if-nez v2, :cond_2

    .line 25
    .line 26
    .line 27
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 28
    goto :goto_1

    .line 29
    :cond_2
    move-object v0, v2

    .line 30
    :goto_1
    const/4 v1, 0x0

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 34
    .line 35
    .line 36
    :goto_2
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/BasicView;->getMediaStore()Lcom/trtc/uikit/livekit/features/audiencecontainer/store/MediaStore;

    .line 37
    move-result-object v0

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/store/MediaStore;->e(Z)V

    .line 41
    return-void
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
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
.end method

.method public final f1()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    iput-boolean v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->g0:Z

    .line 4
    .line 5
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->f0:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$b;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    .line 10
    invoke-interface {v0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$b;->b()V

    .line 11
    :cond_0
    return-void
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
.end method

.method public final g0(Landroid/view/View;Z)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1, p2}, Landroid/view/View;->setEnabled(Z)V

    .line 4
    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    const/high16 p2, 0x3f800000    # 1.0f

    .line 8
    goto :goto_0

    .line 9
    .line 10
    :cond_0
    const/high16 p2, 0x3f000000    # 0.5f

    .line 11
    .line 12
    .line 13
    :goto_0
    invoke-virtual {p1, p2}, Landroid/view/View;->setAlpha(F)V

    .line 14
    return-void
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
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public final g1(IZ)V
    .locals 5

    .line 1
    .line 2
    sget-object v0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->v0:Lcom/trtc/uikit/livekit/common/LiveKitLogger;

    .line 3
    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    const-string v2, "setCoreViewLayoutParamsWhenLandscape:templateId:"

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v2, ",isPortrait:"

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    move-result-object v1

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v1}, Lcom/trtc/uikit/livekit/common/LiveKitLogger;->b(Ljava/lang/String;)Ljava/lang/Object;

    .line 31
    .line 32
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->w:Landroid/widget/FrameLayout;

    .line 33
    .line 34
    const-string v1, "layoutLiveCoreView"

    .line 35
    const/4 v2, 0x0

    .line 36
    .line 37
    if-nez v0, :cond_0

    .line 38
    .line 39
    .line 40
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 41
    move-object v0, v2

    .line 42
    .line 43
    .line 44
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 45
    move-result-object v0

    .line 46
    .line 47
    const-string v3, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams"

    .line 48
    .line 49
    .line 50
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    .line 52
    check-cast v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 53
    .line 54
    const/16 v3, 0xc8

    .line 55
    .line 56
    if-ne p1, v3, :cond_1

    .line 57
    .line 58
    if-eqz p2, :cond_1

    .line 59
    .line 60
    const/high16 p2, 0x42dc0000    # 110.0f

    .line 61
    .line 62
    .line 63
    invoke-static {p2}, Lcom/tencent/qcloud/tuicore/util/ScreenUtil;->dip2px(F)I

    .line 64
    move-result p2

    .line 65
    .line 66
    iput p2, v0, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 67
    .line 68
    .line 69
    invoke-static {}, Lcom/blankj/utilcode/util/e0;->e()I

    .line 70
    move-result p2

    .line 71
    .line 72
    mul-int/lit8 v3, p2, 0x9

    .line 73
    .line 74
    div-int/lit8 v3, v3, 0x10

    .line 75
    .line 76
    iput v3, v0, Landroid/widget/FrameLayout$LayoutParams;->height:I

    .line 77
    .line 78
    new-instance v3, Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 82
    .line 83
    const-string v4, "setCoreViewLayoutParamsWhenLandscape screenWidth:"

    .line 84
    .line 85
    .line 86
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 93
    move-result-object p2

    .line 94
    .line 95
    const-string v3, "Live"

    .line 96
    .line 97
    .line 98
    invoke-static {v3, p2}, Lro/b;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 99
    goto :goto_0

    .line 100
    :cond_1
    const/4 p2, 0x0

    .line 101
    .line 102
    iput p2, v0, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 103
    const/4 p2, -0x1

    .line 104
    .line 105
    iput p2, v0, Landroid/widget/FrameLayout$LayoutParams;->height:I

    .line 106
    .line 107
    :goto_0
    iget-object p2, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->w:Landroid/widget/FrameLayout;

    .line 108
    .line 109
    if-nez p2, :cond_2

    .line 110
    .line 111
    .line 112
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 113
    move-object p2, v2

    .line 114
    .line 115
    .line 116
    :cond_2
    invoke-virtual {p2, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 117
    .line 118
    iget-object p2, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->s:Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;

    .line 119
    .line 120
    if-nez p2, :cond_3

    .line 121
    .line 122
    const-string p2, "liveInfo"

    .line 123
    .line 124
    .line 125
    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 126
    goto :goto_1

    .line 127
    :cond_3
    move-object v2, p2

    .line 128
    .line 129
    .line 130
    :goto_1
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->getBackgroundURL()Ljava/lang/String;

    .line 131
    move-result-object p2

    .line 132
    .line 133
    .line 134
    invoke-virtual {p0, p2, p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->h1(Ljava/lang/String;I)V

    .line 135
    return-void
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
.end method

.method public final getRoomId()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->s:Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    const-string v0, "liveInfo"

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 10
    const/4 v0, 0x0

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->getLiveID()Ljava/lang/String;

    .line 14
    move-result-object v0

    .line 15
    return-object v0
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
.end method

.method public final h0(Z)Landroid/widget/FrameLayout$LayoutParams;
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->getScreenPoint()Landroid/graphics/Point;

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lcom/blankj/utilcode/util/e0;->e()I

    .line 7
    move-result v0

    .line 8
    .line 9
    .line 10
    invoke-static {}, Lcom/blankj/utilcode/util/e0;->d()I

    .line 11
    move-result v1

    .line 12
    .line 13
    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    .line 14
    const/4 v3, -0x2

    .line 15
    .line 16
    .line 17
    const v4, 0x800035

    .line 18
    .line 19
    .line 20
    invoke-direct {v2, v3, v3, v4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 21
    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    mul-int/lit8 v0, v0, 0x9

    .line 25
    .line 26
    div-int/lit8 v0, v0, 0x10

    .line 27
    .line 28
    const/high16 p1, 0x42980000    # 76.0f

    .line 29
    .line 30
    .line 31
    invoke-static {p1}, Lcom/tencent/qcloud/tuicore/util/ScreenUtil;->dip2px(F)I

    .line 32
    move-result p1

    .line 33
    add-int/2addr v0, p1

    .line 34
    .line 35
    const/high16 p1, 0x40000000    # 2.0f

    .line 36
    .line 37
    .line 38
    invoke-static {p1}, Lcom/tencent/qcloud/tuicore/util/ScreenUtil;->dip2px(F)I

    .line 39
    move-result p1

    .line 40
    .line 41
    iput p1, v2, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    .line 42
    .line 43
    iput v0, v2, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 44
    return-object v2

    .line 45
    .line 46
    :cond_0
    mul-int/lit8 p1, v0, 0x10

    .line 47
    .line 48
    div-int/lit8 p1, p1, 0x9

    .line 49
    sub-int/2addr v1, p1

    .line 50
    .line 51
    sget-object p1, Lcom/kubi/sdk/util/EdgeToEdgeCompat;->a:Lcom/kubi/sdk/util/EdgeToEdgeCompat;

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1}, Lcom/kubi/sdk/util/EdgeToEdgeCompat;->i()I

    .line 55
    move-result p1

    .line 56
    sub-int/2addr v1, p1

    .line 57
    .line 58
    div-int/lit8 v1, v1, 0x2

    .line 59
    .line 60
    const/high16 p1, 0x42500000    # 52.0f

    .line 61
    .line 62
    .line 63
    invoke-static {p1}, Lcom/tencent/qcloud/tuicore/util/ScreenUtil;->dip2px(F)I

    .line 64
    move-result p1

    .line 65
    sub-int/2addr v0, p1

    .line 66
    .line 67
    const/high16 p1, 0x41000000    # 8.0f

    .line 68
    .line 69
    .line 70
    invoke-static {p1}, Lcom/tencent/qcloud/tuicore/util/ScreenUtil;->dip2px(F)I

    .line 71
    move-result p1

    .line 72
    add-int/2addr v1, p1

    .line 73
    .line 74
    iput v1, v2, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    .line 75
    .line 76
    iput v0, v2, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 77
    return-object v2
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
.end method

.method public final h1(Ljava/lang/String;I)V
    .locals 4

    .line 1
    .line 2
    sget-object v0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->v0:Lcom/trtc/uikit/livekit/common/LiveKitLogger;

    .line 3
    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    const-string v2, "setLayoutBackground->imageUrl: "

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v2, ", seatLayoutTemplateId:"

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    move-result-object v1

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v1}, Lcom/trtc/uikit/livekit/common/LiveKitLogger;->b(Ljava/lang/String;)Ljava/lang/Object;

    .line 31
    .line 32
    const/16 v0, 0xc8

    .line 33
    .line 34
    const-string v1, "ivVideoViewBackground"

    .line 35
    const/4 v2, 0x0

    .line 36
    .line 37
    if-eq p2, v0, :cond_2

    .line 38
    .line 39
    new-instance p2, Lsc0/d$b;

    .line 40
    .line 41
    .line 42
    invoke-direct {p2}, Lsc0/d$b;-><init>()V

    .line 43
    .line 44
    const/high16 v0, 0x42a00000    # 80.0f

    .line 45
    .line 46
    .line 47
    invoke-virtual {p2, v0}, Lsc0/d$b;->g(F)Lsc0/d$b;

    .line 48
    .line 49
    .line 50
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 51
    move-result v0

    .line 52
    .line 53
    if-nez v0, :cond_1

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 57
    move-result-object v0

    .line 58
    .line 59
    iget-object v3, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->y:Landroid/widget/ImageView;

    .line 60
    .line 61
    if-nez v3, :cond_0

    .line 62
    .line 63
    .line 64
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 65
    goto :goto_0

    .line 66
    :cond_0
    move-object v2, v3

    .line 67
    .line 68
    .line 69
    :goto_0
    invoke-virtual {p2}, Lsc0/d$b;->f()Lsc0/d;

    .line 70
    move-result-object p2

    .line 71
    .line 72
    .line 73
    invoke-static {v0, v2, p1, p2}, Lsc0/c;->d(Landroid/content/Context;Landroid/widget/ImageView;Ljava/lang/Object;Lsc0/d;)V

    .line 74
    :cond_1
    return-void

    .line 75
    .line 76
    .line 77
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 78
    move-result-object p1

    .line 79
    .line 80
    iget-object p2, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->y:Landroid/widget/ImageView;

    .line 81
    .line 82
    if-nez p2, :cond_3

    .line 83
    .line 84
    .line 85
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 86
    move-object p2, v2

    .line 87
    .line 88
    .line 89
    :cond_3
    invoke-static {p1, p2}, Lsc0/c;->a(Landroid/content/Context;Landroid/widget/ImageView;)V

    .line 90
    .line 91
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 92
    .line 93
    const/16 p2, 0x1f

    .line 94
    .line 95
    if-lt p1, p2, :cond_5

    .line 96
    .line 97
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->y:Landroid/widget/ImageView;

    .line 98
    .line 99
    if-nez p1, :cond_4

    .line 100
    .line 101
    .line 102
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 103
    move-object p1, v2

    .line 104
    .line 105
    .line 106
    :cond_4
    invoke-static {p1, v2}, Lsc0/b;->a(Landroid/widget/ImageView;Landroid/graphics/RenderEffect;)V

    .line 107
    .line 108
    :cond_5
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->y:Landroid/widget/ImageView;

    .line 109
    .line 110
    if-nez p1, :cond_6

    .line 111
    .line 112
    .line 113
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 114
    move-object p1, v2

    .line 115
    .line 116
    .line 117
    :cond_6
    invoke-virtual {p1, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 118
    .line 119
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->y:Landroid/widget/ImageView;

    .line 120
    .line 121
    if-nez p1, :cond_7

    .line 122
    .line 123
    .line 124
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 125
    goto :goto_1

    .line 126
    :cond_7
    move-object v2, p1

    .line 127
    :goto_1
    const/4 p1, 0x0

    .line 128
    .line 129
    .line 130
    invoke-virtual {v2, p1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 131
    return-void
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
.end method

.method public final i0(Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;)V
    .locals 9
    .param p1    # Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "liveInfo"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->v0:Lcom/trtc/uikit/livekit/common/LiveKitLogger;

    .line 8
    .line 9
    new-instance v1, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 13
    .line 14
    const-string v2, "AudienceView init:"

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    move-result-object v1

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1}, Lcom/trtc/uikit/livekit/common/LiveKitLogger;->b(Ljava/lang/String;)Ljava/lang/Object;

    .line 28
    .line 29
    iput-object p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->s:Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;

    .line 30
    .line 31
    new-instance v2, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 35
    move-result-object v3

    .line 36
    .line 37
    const-string v0, "getContext(...)"

    .line 38
    .line 39
    .line 40
    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    .line 42
    const/16 v7, 0xe

    .line 43
    const/4 v8, 0x0

    .line 44
    const/4 v4, 0x0

    .line 45
    const/4 v5, 0x0

    .line 46
    const/4 v6, 0x0

    .line 47
    .line 48
    .line 49
    invoke-direct/range {v2 .. v8}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILio/trtc/tuikit/atomicxcore/api/view/CoreViewType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 50
    .line 51
    iput-object v2, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->t:Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->getLiveID()Ljava/lang/String;

    .line 55
    move-result-object p1

    .line 56
    .line 57
    .line 58
    invoke-virtual {v2, p1}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->setLiveId(Ljava/lang/String;)V

    .line 59
    .line 60
    new-instance p1, Lcom/trtc/uikit/livekit/kc/roominfo/service/KCRoomInfoService;

    .line 61
    .line 62
    .line 63
    invoke-direct {p1}, Lcom/trtc/uikit/livekit/kc/roominfo/service/KCRoomInfoService;-><init>()V

    .line 64
    .line 65
    iput-object p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->b0:Lcom/trtc/uikit/livekit/kc/roominfo/service/KCRoomInfoService;

    .line 66
    return-void
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
.end method

.method public final i1()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->h0:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$a;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$a;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 10
    move-result-object v1

    .line 11
    .line 12
    const-string v2, "getContext(...)"

    .line 13
    .line 14
    .line 15
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, p0, v1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$a;-><init>(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;Landroid/content/Context;)V

    .line 19
    .line 20
    iput-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->h0:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$a;

    .line 21
    .line 22
    :cond_0
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->t:Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;

    .line 23
    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    const-string v0, "liveCoreView"

    .line 27
    .line 28
    .line 29
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 30
    const/4 v0, 0x0

    .line 31
    .line 32
    :cond_1
    iget-object v1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->h0:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$a;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->setVideoViewAdapter(Lio/trtc/tuikit/atomicxcore/api/view/VideoViewAdapter;)V

    .line 36
    return-void
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
.end method

.method public final j0(Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->H:Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    const-string v0, "audienceListView"

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 10
    const/4 v0, 0x0

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-virtual {v0, p1}, Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView;->n(Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;)V

    .line 14
    return-void
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
.end method

.method public final j1(Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->e0:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 10
    move-result-object v1

    .line 11
    .line 12
    const-string v2, "getContext(...)"

    .line 13
    .line 14
    .line 15
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/BasicView;->getAudienceStore()Lee0/f;

    .line 19
    move-result-object v2

    .line 20
    .line 21
    .line 22
    invoke-direct {v0, v1, v2}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;-><init>(Landroid/content/Context;Lee0/f;)V

    .line 23
    .line 24
    iput-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->e0:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;

    .line 25
    .line 26
    :cond_0
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->e0:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;

    .line 27
    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->d0(Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;)V

    .line 32
    .line 33
    :cond_1
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->e0:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;

    .line 34
    .line 35
    if-eqz p1, :cond_2

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover;->show()V

    .line 39
    :cond_2
    return-void
.end method

.method public final k0(Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->E:Lcom/trtc/uikit/livekit/component/barrage/BarrageInputView;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    const-string v0, "barrageInputView"

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 10
    const/4 v0, 0x0

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->getLiveID()Ljava/lang/String;

    .line 14
    move-result-object p1

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p1}, Lcom/trtc/uikit/livekit/component/barrage/BarrageInputView;->b(Ljava/lang/String;)V

    .line 18
    return-void
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
.end method

.method public final k1()V
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/u;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    const-string v2, "getContext(...)"

    .line 9
    .line 10
    .line 11
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/BasicView;->getAudienceStore()Lee0/f;

    .line 15
    move-result-object v2

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, v1, v2}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/u;-><init>(Landroid/content/Context;Lee0/f;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover;->show()V

    .line 22
    return-void
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
.end method

.method public final l0(Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;)V
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->getSeatLayoutTemplateID()I

    .line 4
    move-result v0

    .line 5
    .line 6
    const/16 v1, 0xc8

    .line 7
    const/4 v2, 0x0

    .line 8
    .line 9
    const-string v3, "barrageStreamView"

    .line 10
    .line 11
    if-ne v0, v1, :cond_1

    .line 12
    .line 13
    .line 14
    invoke-static {}, Lcom/blankj/utilcode/util/e0;->e()I

    .line 15
    move-result v0

    .line 16
    .line 17
    .line 18
    invoke-static {}, Lcom/blankj/utilcode/util/e0;->d()I

    .line 19
    move-result v1

    .line 20
    .line 21
    mul-int/lit8 v0, v0, 0x9

    .line 22
    .line 23
    div-int/lit8 v0, v0, 0x10

    .line 24
    .line 25
    iget-object v4, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->I:Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView;

    .line 26
    .line 27
    if-nez v4, :cond_0

    .line 28
    .line 29
    .line 30
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 31
    move-object v4, v2

    .line 32
    .line 33
    .line 34
    :cond_0
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 35
    move-result-object v4

    .line 36
    .line 37
    const/high16 v5, 0x42dc0000    # 110.0f

    .line 38
    .line 39
    .line 40
    invoke-static {v5}, Lcom/tencent/qcloud/tuicore/util/ScreenUtil;->dip2px(F)I

    .line 41
    move-result v5

    .line 42
    sub-int/2addr v1, v5

    .line 43
    .line 44
    const/high16 v5, 0x428c0000    # 70.0f

    .line 45
    .line 46
    .line 47
    invoke-static {v5}, Lcom/tencent/qcloud/tuicore/util/ScreenUtil;->dip2px(F)I

    .line 48
    move-result v5

    .line 49
    sub-int/2addr v1, v5

    .line 50
    sub-int/2addr v1, v0

    .line 51
    .line 52
    const/high16 v0, 0x41400000    # 12.0f

    .line 53
    .line 54
    .line 55
    invoke-static {v0}, Lcom/tencent/qcloud/tuicore/util/ScreenUtil;->dip2px(F)I

    .line 56
    move-result v0

    .line 57
    sub-int/2addr v1, v0

    .line 58
    .line 59
    sget-object v0, Lcom/kubi/sdk/util/EdgeToEdgeCompat;->a:Lcom/kubi/sdk/util/EdgeToEdgeCompat;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0}, Lcom/kubi/sdk/util/EdgeToEdgeCompat;->i()I

    .line 63
    move-result v0

    .line 64
    sub-int/2addr v1, v0

    .line 65
    .line 66
    iput v1, v4, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 67
    .line 68
    :cond_1
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->I:Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView;

    .line 69
    .line 70
    if-nez v0, :cond_2

    .line 71
    .line 72
    .line 73
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 74
    move-object v0, v2

    .line 75
    .line 76
    .line 77
    :cond_2
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->getLiveID()Ljava/lang/String;

    .line 78
    move-result-object v1

    .line 79
    .line 80
    .line 81
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->getLiveOwner()Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;

    .line 82
    move-result-object p1

    .line 83
    .line 84
    .line 85
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;->getUserID()Ljava/lang/String;

    .line 86
    move-result-object p1

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0, v1, p1}, Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    .line 91
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->I:Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView;

    .line 92
    .line 93
    if-nez p1, :cond_3

    .line 94
    .line 95
    .line 96
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 97
    move-object p1, v2

    .line 98
    .line 99
    :cond_3
    new-instance v0, Lsd0/a;

    .line 100
    .line 101
    .line 102
    invoke-direct {v0}, Lsd0/a;-><init>()V

    .line 103
    .line 104
    .line 105
    invoke-virtual {p1, v0}, Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView;->setItemTypeDelegate(Lcd0/c;)V

    .line 106
    .line 107
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->I:Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView;

    .line 108
    .line 109
    if-nez p1, :cond_4

    .line 110
    .line 111
    .line 112
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 113
    move-object p1, v2

    .line 114
    .line 115
    :cond_4
    new-instance v0, Lcom/trtc/uikit/livekit/component/giftaccess/view/GiftBarrageAdapter;

    .line 116
    .line 117
    .line 118
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 119
    move-result-object v1

    .line 120
    .line 121
    const-string v4, "getContext(...)"

    .line 122
    .line 123
    .line 124
    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    invoke-direct {v0, v1}, Lcom/trtc/uikit/livekit/component/giftaccess/view/GiftBarrageAdapter;-><init>(Landroid/content/Context;)V

    .line 128
    const/4 v1, 0x1

    .line 129
    .line 130
    .line 131
    invoke-virtual {p1, v1, v0}, Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView;->r(ILcd0/a;)V

    .line 132
    .line 133
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->I:Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView;

    .line 134
    .line 135
    if-nez p1, :cond_5

    .line 136
    .line 137
    .line 138
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 139
    goto :goto_0

    .line 140
    :cond_5
    move-object v2, p1

    .line 141
    .line 142
    :goto_0
    new-instance p1, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$f;

    .line 143
    .line 144
    .line 145
    invoke-direct {p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$f;-><init>()V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v2, p1}, Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView;->setOnMessageClickListener(Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView$a;)V

    .line 149
    const/4 p1, 0x0

    .line 150
    .line 151
    .line 152
    invoke-virtual {p0, p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->x1(Z)V

    .line 153
    return-void
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
.end method

.method public final l1(Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;)V
    .locals 2

    .line 1
    .line 2
    if-nez p1, :cond_0

    .line 3
    goto :goto_0

    .line 4
    .line 5
    .line 6
    :cond_0
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;->getUserID()Ljava/lang/String;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 11
    move-result v0

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    goto :goto_0

    .line 15
    .line 16
    .line 17
    :cond_1
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/BasicView;->getCoGuestState()Lio/trtc/tuikit/atomicxcore/api/live/CoGuestState;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestState;->getConnected()Lkotlinx/coroutines/flow/w;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    .line 25
    invoke-interface {v0}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 26
    move-result-object v0

    .line 27
    .line 28
    check-cast v0, Ljava/util/List;

    .line 29
    .line 30
    .line 31
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 32
    move-result v0

    .line 33
    const/4 v1, 0x1

    .line 34
    .line 35
    if-gt v0, v1, :cond_2

    .line 36
    :goto_0
    return-void

    .line 37
    .line 38
    .line 39
    :cond_2
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;->getUserID()Ljava/lang/String;

    .line 40
    move-result-object v0

    .line 41
    .line 42
    sget-object v1, Lio/trtc/tuikit/atomicxcore/api/login/LoginStore;->shared:Lio/trtc/tuikit/atomicxcore/api/login/LoginStore;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/login/LoginStore;->getLoginState()Lio/trtc/tuikit/atomicxcore/api/login/LoginState;

    .line 46
    move-result-object v1

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/login/LoginState;->getLoginUserInfo()Lkotlinx/coroutines/flow/w;

    .line 50
    move-result-object v1

    .line 51
    .line 52
    .line 53
    invoke-interface {v1}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 54
    move-result-object v1

    .line 55
    .line 56
    check-cast v1, Lio/trtc/tuikit/atomicxcore/api/login/UserProfile;

    .line 57
    .line 58
    if-eqz v1, :cond_3

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/login/UserProfile;->getUserID()Ljava/lang/String;

    .line 62
    move-result-object v1

    .line 63
    goto :goto_1

    .line 64
    :cond_3
    const/4 v1, 0x0

    .line 65
    .line 66
    .line 67
    :goto_1
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 68
    move-result v0

    .line 69
    .line 70
    if-eqz v0, :cond_4

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0, p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->j1(Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;)V

    .line 74
    return-void

    .line 75
    .line 76
    .line 77
    :cond_4
    invoke-virtual {p0, p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->q1(Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;)V

    .line 78
    return-void
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
.end method

.method public final m0()V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->D:Landroid/widget/ImageView;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    const-string v2, "imageCoGuest"

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    .line 10
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 11
    move-object v0, v1

    .line 12
    .line 13
    :cond_0
    sget v3, Lcom/trtc/uikit/livekit/R$drawable;->livekit_function_link_default:I

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 17
    .line 18
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->D:Landroid/widget/ImageView;

    .line 19
    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    .line 23
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 24
    goto :goto_0

    .line 25
    :cond_1
    move-object v1, v0

    .line 26
    .line 27
    :goto_0
    new-instance v0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/f;

    .line 28
    .line 29
    .line 30
    invoke-direct {v0, p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/f;-><init>(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 34
    return-void
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
.end method

.method public final m1()V
    .locals 4

    .line 1
    .line 2
    new-instance v0, Lio/trtc/tuikit/atomicx/widget/basicwidget/alertdialog/AtomicAlertDialog;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    const-string v2, "getContext(...)"

    .line 9
    .line 10
    .line 11
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    const/4 v2, 0x0

    .line 13
    const/4 v3, 0x2

    .line 14
    .line 15
    .line 16
    invoke-direct {v0, v1, v2, v3, v2}, Lio/trtc/tuikit/atomicx/widget/basicwidget/alertdialog/AtomicAlertDialog;-><init>(Landroid/content/Context;Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover$PanelGravity;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 17
    .line 18
    new-instance v1, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/i;

    .line 19
    .line 20
    .line 21
    invoke-direct {v1, p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/i;-><init>(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1}, Lio/trtc/tuikit/atomicx/widget/basicwidget/alertdialog/AtomicAlertDialog;->u(Lkotlin/jvm/functions/Function1;)V

    .line 25
    .line 26
    iput-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->c0:Lio/trtc/tuikit/atomicx/widget/basicwidget/alertdialog/AtomicAlertDialog;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicx/widget/basicwidget/alertdialog/AtomicAlertDialog;->I()Landroid/app/Dialog;

    .line 30
    return-void
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
.end method

.method public onAttachedToWindow()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/BasicView;->onAttachedToWindow()V

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
.end method

.method public onDetachedFromWindow()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/BasicView;->onDetachedFromWindow()V

    .line 4
    .line 5
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->t:Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;

    .line 6
    const/4 v1, 0x0

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const-string v0, "liveCoreView"

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 14
    move-object v0, v1

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-virtual {v0, v1}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->setVideoViewAdapter(Lio/trtc/tuikit/atomicxcore/api/view/VideoViewAdapter;)V

    .line 18
    return-void
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
.end method

.method public onRoomDismissed(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "roomId"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    const/4 p1, 0x0

    .line 7
    .line 8
    iput-boolean p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->m0:Z

    .line 9
    .line 10
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->c0:Lio/trtc/tuikit/atomicx/widget/basicwidget/alertdialog/AtomicAlertDialog;

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicx/widget/basicwidget/alertdialog/AtomicAlertDialog;->s()V

    .line 16
    :cond_0
    return-void
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
.end method

.method public final p0()V
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/BasicView;->getAudienceStore()Lee0/f;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lee0/f;->q()Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatState;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatState;->getCanvas()Lkotlinx/coroutines/flow/w;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    .line 15
    invoke-interface {v0}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/live/LiveCanvas;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/BasicView;->getLiveListState()Lio/trtc/tuikit/atomicxcore/api/live/LiveListState;

    .line 22
    move-result-object v1

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveListState;->getCurrentLive()Lkotlinx/coroutines/flow/w;

    .line 26
    move-result-object v1

    .line 27
    .line 28
    .line 29
    invoke-interface {v1}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    check-cast v1, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->getLiveID()Ljava/lang/String;

    .line 36
    move-result-object v1

    .line 37
    .line 38
    iget-object v2, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->s:Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;

    .line 39
    const/4 v3, 0x0

    .line 40
    .line 41
    if-nez v2, :cond_0

    .line 42
    .line 43
    const-string v2, "liveInfo"

    .line 44
    .line 45
    .line 46
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 47
    move-object v2, v3

    .line 48
    .line 49
    .line 50
    :cond_0
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->getLiveID()Ljava/lang/String;

    .line 51
    move-result-object v2

    .line 52
    .line 53
    .line 54
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 55
    move-result v1

    .line 56
    .line 57
    if-nez v1, :cond_1

    .line 58
    goto :goto_2

    .line 59
    .line 60
    .line 61
    :cond_1
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveCanvas;->getW()I

    .line 62
    move-result v1

    .line 63
    .line 64
    if-eqz v1, :cond_7

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveCanvas;->getH()I

    .line 68
    move-result v1

    .line 69
    .line 70
    if-nez v1, :cond_2

    .line 71
    goto :goto_2

    .line 72
    .line 73
    .line 74
    :cond_2
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveCanvas;->getW()I

    .line 75
    move-result v1

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveCanvas;->getH()I

    .line 79
    move-result v0

    .line 80
    const/4 v2, 0x0

    .line 81
    .line 82
    if-lt v1, v0, :cond_3

    .line 83
    const/4 v0, 0x1

    .line 84
    goto :goto_0

    .line 85
    :cond_3
    move v0, v2

    .line 86
    .line 87
    .line 88
    :goto_0
    invoke-virtual {p0, v0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->d1(Z)V

    .line 89
    .line 90
    iget-object v1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->D:Landroid/widget/ImageView;

    .line 91
    .line 92
    const-string v4, "imageCoGuest"

    .line 93
    .line 94
    if-nez v1, :cond_4

    .line 95
    .line 96
    .line 97
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 98
    move-object v1, v3

    .line 99
    .line 100
    :cond_4
    const/16 v5, 0x8

    .line 101
    .line 102
    if-eqz v0, :cond_5

    .line 103
    move v2, v5

    .line 104
    .line 105
    .line 106
    :cond_5
    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 107
    .line 108
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->D:Landroid/widget/ImageView;

    .line 109
    .line 110
    if-nez v0, :cond_6

    .line 111
    .line 112
    .line 113
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 114
    goto :goto_1

    .line 115
    :cond_6
    move-object v3, v0

    .line 116
    .line 117
    .line 118
    :goto_1
    invoke-virtual {v3, v5}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 119
    :cond_7
    :goto_2
    return-void
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
.end method

.method public final p1()V
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/y;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    const-string v2, "getContext(...)"

    .line 9
    .line 10
    .line 11
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/BasicView;->getAudienceStore()Lee0/f;

    .line 15
    move-result-object v2

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, v1, v2}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/y;-><init>(Landroid/content/Context;Lee0/f;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover;->show()V

    .line 22
    return-void
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
.end method

.method public final q0(Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->v:Landroid/widget/FrameLayout;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    const-string v0, "layoutPlaying"

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 10
    const/4 v0, 0x0

    .line 11
    :cond_0
    const/4 v1, 0x0

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->m0()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->I0(Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->j0(Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->H0(Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->C0(Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->M0()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->B0(Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->r0()V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->F0()V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->D0()V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0, p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->l0(Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->k0(Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0, p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->x0(Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0, p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->y0(Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0, p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->w0(Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->O0()V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->z0()V

    .line 66
    return-void
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
.end method

.method public final q1(Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->d0:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/userinfo/UserInfoDialog;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/userinfo/UserInfoDialog;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 10
    move-result-object v1

    .line 11
    .line 12
    const-string v2, "getContext(...)"

    .line 13
    .line 14
    .line 15
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/BasicView;->getAudienceStore()Lee0/f;

    .line 19
    move-result-object v2

    .line 20
    .line 21
    .line 22
    invoke-direct {v0, v1, v2}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/userinfo/UserInfoDialog;-><init>(Landroid/content/Context;Lee0/f;)V

    .line 23
    .line 24
    iput-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->d0:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/userinfo/UserInfoDialog;

    .line 25
    .line 26
    :cond_0
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->d0:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/userinfo/UserInfoDialog;

    .line 27
    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/userinfo/UserInfoDialog;->K(Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;)V

    .line 32
    .line 33
    :cond_1
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->d0:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/userinfo/UserInfoDialog;

    .line 34
    .line 35
    if-eqz p1, :cond_2

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover;->show()V

    .line 39
    :cond_2
    return-void
.end method

.method public final r0()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->N:Landroid/widget/ImageView;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string v0, "imageStandardExit"

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 11
    move-object v0, v1

    .line 12
    .line 13
    :cond_0
    new-instance v2, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/c;

    .line 14
    .line 15
    .line 16
    invoke-direct {v2, p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/c;-><init>(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 20
    .line 21
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->O:Landroid/widget/ImageView;

    .line 22
    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    const-string v0, "imageCompactExit"

    .line 26
    .line 27
    .line 28
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 29
    goto :goto_0

    .line 30
    :cond_1
    move-object v1, v0

    .line 31
    .line 32
    :goto_0
    new-instance v0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/d;

    .line 33
    .line 34
    .line 35
    invoke-direct {v0, p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/d;-><init>(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 39
    return-void
    .line 40
    .line 41
    .line 42
.end method

.method public final r1()V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->t:Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string v0, "liveCoreView"

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 11
    move-object v0, v1

    .line 12
    .line 13
    :cond_0
    iget-object v2, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->s:Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;

    .line 14
    .line 15
    if-nez v2, :cond_1

    .line 16
    .line 17
    const-string v2, "liveInfo"

    .line 18
    .line 19
    .line 20
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 21
    move-object v2, v1

    .line 22
    .line 23
    .line 24
    :cond_1
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->getLiveID()Ljava/lang/String;

    .line 25
    move-result-object v2

    .line 26
    const/4 v3, 0x1

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v2, v3, v1}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->startPreviewLiveStream(Ljava/lang/String;ZLcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$PlayCallback;)V

    .line 30
    return-void
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
.end method

.method public final s1()V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->D:Landroid/widget/ImageView;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    const-string v2, "imageCoGuest"

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    .line 10
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 11
    move-object v0, v1

    .line 12
    .line 13
    :cond_0
    sget v3, Lcom/trtc/uikit/livekit/R$drawable;->livekit_function_linked:I

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 17
    .line 18
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->D:Landroid/widget/ImageView;

    .line 19
    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    .line 23
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 24
    goto :goto_0

    .line 25
    :cond_1
    move-object v1, v0

    .line 26
    .line 27
    :goto_0
    new-instance v0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/r;

    .line 28
    .line 29
    .line 30
    invoke-direct {v0, p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/r;-><init>(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 34
    return-void
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
.end method

.method public final setAudienceContainerViewListenerList(Lfe0/a;)V
    .locals 1
    .param p1    # Lfe0/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "viewListenerList"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/BasicView;->getAudienceStore()Lee0/f;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p1}, Lee0/f;->D(Lfe0/a;)V

    .line 13
    return-void
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
.end method

.method public final setViewObserver(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$b;)V
    .locals 0
    .param p1    # Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$b;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->f0:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$b;

    .line 3
    return-void
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
.end method

.method public final u0()V
    .locals 4

    .line 1
    .line 2
    sget-object v0, Lcom/trtc/uikit/livekit/kc/helper/c;->a:Lcom/trtc/uikit/livekit/kc/helper/c;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/trtc/uikit/livekit/kc/helper/c;->b()Z

    .line 6
    move-result v0

    .line 7
    .line 8
    const-string v1, "imageFloatWindow"

    .line 9
    const/4 v2, 0x0

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->K:Landroid/widget/ImageView;

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    .line 18
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move-object v2, v0

    .line 21
    .line 22
    :goto_0
    new-instance v0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/h;

    .line 23
    .line 24
    .line 25
    invoke-direct {v0, p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/h;-><init>(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 29
    return-void

    .line 30
    .line 31
    :cond_1
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->K:Landroid/widget/ImageView;

    .line 32
    .line 33
    if-nez v0, :cond_2

    .line 34
    .line 35
    .line 36
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 37
    move-object v0, v2

    .line 38
    .line 39
    :cond_2
    const/16 v1, 0x8

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 43
    .line 44
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->V:Lcom/trtc/uikit/livekit/kc/widget/KCPeopleCountView;

    .line 45
    .line 46
    const-string v1, "peopleCountView"

    .line 47
    .line 48
    if-nez v0, :cond_3

    .line 49
    .line 50
    .line 51
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 52
    move-object v0, v2

    .line 53
    .line 54
    .line 55
    :cond_3
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 56
    move-result-object v0

    .line 57
    .line 58
    const-string v3, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams"

    .line 59
    .line 60
    .line 61
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    .line 63
    check-cast v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 64
    .line 65
    const/high16 v3, 0x42600000    # 56.0f

    .line 66
    .line 67
    .line 68
    invoke-static {v3}, Lcom/tencent/qcloud/tuicore/util/ScreenUtil;->dip2px(F)I

    .line 69
    move-result v3

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0, v3}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 73
    .line 74
    iget-object v3, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->V:Lcom/trtc/uikit/livekit/kc/widget/KCPeopleCountView;

    .line 75
    .line 76
    if-nez v3, :cond_4

    .line 77
    .line 78
    .line 79
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 80
    goto :goto_1

    .line 81
    :cond_4
    move-object v2, v3

    .line 82
    .line 83
    .line 84
    :goto_1
    invoke-virtual {v2, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 85
    return-void
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
.end method

.method public final u1()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->t:Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string v0, "liveCoreView"

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 11
    move-object v0, v1

    .line 12
    .line 13
    :cond_0
    iget-object v2, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->s:Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;

    .line 14
    .line 15
    if-nez v2, :cond_1

    .line 16
    .line 17
    const-string v2, "liveInfo"

    .line 18
    .line 19
    .line 20
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 21
    goto :goto_0

    .line 22
    :cond_1
    move-object v1, v2

    .line 23
    .line 24
    .line 25
    :goto_0
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->getLiveID()Ljava/lang/String;

    .line 26
    move-result-object v1

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v1}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->stopPreviewLiveStream(Ljava/lang/String;)V

    .line 30
    return-void
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
.end method

.method public final v1()V
    .locals 7

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/BasicView;->getAudienceStore()Lee0/f;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, p0}, Lee0/f;->d(Lee0/f$a;)V

    .line 8
    .line 9
    iget-object v1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->T:Lkotlinx/coroutines/m0;

    .line 10
    .line 11
    new-instance v4, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$subscribeObserver$1;

    .line 12
    const/4 v0, 0x0

    .line 13
    .line 14
    .line 15
    invoke-direct {v4, p0, v0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$subscribeObserver$1;-><init>(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;Lkotlin/coroutines/Continuation;)V

    .line 16
    const/4 v5, 0x3

    .line 17
    const/4 v6, 0x0

    .line 18
    const/4 v2, 0x0

    .line 19
    const/4 v3, 0x0

    .line 20
    .line 21
    .line 22
    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, v0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/BasicView;->setSubscribeStateJob(Lkotlinx/coroutines/x1;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/BasicView;->getLiveListStore()Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;

    .line 30
    move-result-object v0

    .line 31
    .line 32
    iget-object v1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->p0:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$l;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;->addLiveListListener(Lio/trtc/tuikit/atomicxcore/api/live/LiveListListener;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/BasicView;->getLiveSeatStore()Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;

    .line 39
    move-result-object v0

    .line 40
    .line 41
    iget-object v1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->q0:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$m;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;->addLiveSeatEventListener(Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatListener;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/BasicView;->getCoGuestStore()Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;

    .line 48
    move-result-object v0

    .line 49
    .line 50
    iget-object v1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->r0:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$e;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, v1}, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;->addGuestListener(Lio/trtc/tuikit/atomicxcore/api/live/GuestListener;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/BasicView;->getBattleStore()Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;

    .line 57
    move-result-object v0

    .line 58
    .line 59
    iget-object v1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->s0:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$d;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, v1}, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;->addBattleListener(Lio/trtc/tuikit/atomicxcore/api/live/BattleListener;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/BasicView;->getLiveAudienceStore()Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore;

    .line 66
    move-result-object v0

    .line 67
    .line 68
    iget-object v1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->t0:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$k;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0, v1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore;->addLiveAudienceListener(Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceListener;)V

    .line 72
    return-void
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
.end method

.method public final w0(Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->G:Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    const-string v2, "giftPlayView"

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    .line 10
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 11
    move-object v0, v1

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->getLiveID()Ljava/lang/String;

    .line 15
    move-result-object p1

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;->b(Ljava/lang/String;)V

    .line 19
    .line 20
    sget-object p1, Lcom/trtc/uikit/livekit/component/giftaccess/store/GiftStore;->b:Lcom/trtc/uikit/livekit/component/giftaccess/store/GiftStore$Companion;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Lcom/trtc/uikit/livekit/component/giftaccess/store/GiftStore$Companion;->getInstance()Lcom/trtc/uikit/livekit/component/giftaccess/store/GiftStore;

    .line 24
    move-result-object p1

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Lcom/trtc/uikit/livekit/component/giftaccess/store/GiftStore;->c()Lrd0/b;

    .line 28
    move-result-object p1

    .line 29
    .line 30
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->G:Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;

    .line 31
    .line 32
    if-nez v0, :cond_1

    .line 33
    .line 34
    .line 35
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 36
    goto :goto_0

    .line 37
    :cond_1
    move-object v1, v0

    .line 38
    .line 39
    :goto_0
    new-instance v0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$g;

    .line 40
    .line 41
    .line 42
    invoke-direct {v0, p0, p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$g;-><init>(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;Lrd0/b;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1, v0}, Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;->setListener(Lcom/trtc/uikit/livekit/component/gift/GiftPlayView$c;)V

    .line 46
    return-void
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
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
.end method

.method public final w1()V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/BasicView;->getAudienceStore()Lee0/f;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, p0}, Lee0/f;->B(Lee0/f$a;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/BasicView;->getSubscribeStateJob()Lkotlinx/coroutines/x1;

    .line 11
    move-result-object v0

    .line 12
    const/4 v1, 0x1

    .line 13
    const/4 v2, 0x0

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    .line 18
    invoke-static {v0, v2, v1, v2}, Lkotlinx/coroutines/x1$a;->a(Lkotlinx/coroutines/x1;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/BasicView;->getLiveListStore()Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    iget-object v3, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->p0:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$l;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v3}, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;->removeLiveListListener(Lio/trtc/tuikit/atomicxcore/api/live/LiveListListener;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/BasicView;->getLiveSeatStore()Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;

    .line 31
    move-result-object v0

    .line 32
    .line 33
    iget-object v3, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->q0:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$m;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, v3}, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;->removeLiveSeatEventListener(Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatListener;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/BasicView;->getCoGuestStore()Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;

    .line 40
    move-result-object v0

    .line 41
    .line 42
    iget-object v3, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->r0:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$e;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v3}, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;->removeGuestListener(Lio/trtc/tuikit/atomicxcore/api/live/GuestListener;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/BasicView;->getBattleStore()Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;

    .line 49
    move-result-object v0

    .line 50
    .line 51
    iget-object v3, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->s0:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$d;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, v3}, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;->removeBattleListener(Lio/trtc/tuikit/atomicxcore/api/live/BattleListener;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/BasicView;->getLiveAudienceStore()Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore;

    .line 58
    move-result-object v0

    .line 59
    .line 60
    iget-object v3, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->t0:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView$k;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, v3}, Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore;->removeLiveAudienceListener(Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceListener;)V

    .line 64
    .line 65
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->T:Lkotlinx/coroutines/m0;

    .line 66
    .line 67
    .line 68
    invoke-static {v0, v2, v1, v2}, Lkotlinx/coroutines/n0;->e(Lkotlinx/coroutines/m0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 69
    return-void
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
.end method

.method public final x0(Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;)V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->B:Lcom/trtc/uikit/livekit/component/giftaccess/GiftButton;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    const-string v0, "buttonGift"

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 10
    const/4 v0, 0x0

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->getLiveID()Ljava/lang/String;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->getLiveOwner()Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;

    .line 18
    move-result-object v2

    .line 19
    .line 20
    .line 21
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;->getUserID()Ljava/lang/String;

    .line 22
    move-result-object v2

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->getLiveOwner()Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;

    .line 26
    move-result-object v3

    .line 27
    .line 28
    .line 29
    invoke-virtual {v3}, Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;->getUserName()Ljava/lang/String;

    .line 30
    move-result-object v3

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->getLiveOwner()Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;

    .line 34
    move-result-object p1

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;->getAvatarURL()Ljava/lang/String;

    .line 38
    move-result-object p1

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v1, v2, v3, p1}, Lcom/trtc/uikit/livekit/component/giftaccess/GiftButton;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 42
    return-void
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
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
.end method

.method public final x1(Z)V
    .locals 4

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    const-string v1, "updateBarrageStreamViewMargin:"

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    const-string v1, "Live"

    .line 20
    .line 21
    .line 22
    invoke-static {v1, v0}, Lro/b;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    .line 24
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->I:Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView;

    .line 25
    .line 26
    const-string v1, "barrageStreamView"

    .line 27
    const/4 v2, 0x0

    .line 28
    .line 29
    if-nez v0, :cond_0

    .line 30
    .line 31
    .line 32
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 33
    move-object v0, v2

    .line 34
    .line 35
    .line 36
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 37
    move-result-object v0

    .line 38
    .line 39
    instance-of v3, v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 40
    .line 41
    if-eqz v3, :cond_1

    .line 42
    .line 43
    check-cast v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 44
    goto :goto_0

    .line 45
    :cond_1
    move-object v0, v2

    .line 46
    .line 47
    :goto_0
    if-nez v0, :cond_2

    .line 48
    return-void

    .line 49
    .line 50
    :cond_2
    if-eqz p1, :cond_3

    .line 51
    .line 52
    const/high16 p1, 0x43080000    # 136.0f

    .line 53
    .line 54
    .line 55
    invoke-static {p1}, Lcom/tencent/qcloud/tuicore/util/ScreenUtil;->dip2px(F)I

    .line 56
    move-result p1

    .line 57
    goto :goto_1

    .line 58
    .line 59
    .line 60
    :cond_3
    invoke-static {}, Lcom/blankj/utilcode/util/e0;->e()I

    .line 61
    move-result p1

    .line 62
    .line 63
    const/high16 v3, 0x43960000    # 300.0f

    .line 64
    .line 65
    .line 66
    invoke-static {v3}, Lcom/tencent/qcloud/tuicore/util/ScreenUtil;->dip2px(F)I

    .line 67
    move-result v3

    .line 68
    sub-int/2addr p1, v3

    .line 69
    const/4 v3, 0x0

    .line 70
    .line 71
    .line 72
    invoke-static {p1, v3}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 73
    move-result p1

    .line 74
    .line 75
    const/high16 v3, 0x41800000    # 16.0f

    .line 76
    .line 77
    .line 78
    invoke-static {v3}, Lcom/tencent/qcloud/tuicore/util/ScreenUtil;->dip2px(F)I

    .line 79
    move-result v3

    .line 80
    .line 81
    .line 82
    invoke-static {p1, v3}, Ljava/lang/Math;->max(II)I

    .line 83
    move-result p1

    .line 84
    .line 85
    .line 86
    :goto_1
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 87
    .line 88
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->I:Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView;

    .line 89
    .line 90
    if-nez p1, :cond_4

    .line 91
    .line 92
    .line 93
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 94
    move-object p1, v2

    .line 95
    .line 96
    .line 97
    :cond_4
    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 98
    .line 99
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->I:Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView;

    .line 100
    .line 101
    if-nez p1, :cond_5

    .line 102
    .line 103
    .line 104
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 105
    goto :goto_2

    .line 106
    :cond_5
    move-object v2, p1

    .line 107
    .line 108
    :goto_2
    new-instance p1, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/e;

    .line 109
    .line 110
    .line 111
    invoke-direct {p1, p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/e;-><init>(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v2, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 115
    return-void
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
.end method

.method public final y0(Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->C:Lcom/trtc/uikit/livekit/component/gift/LikeButton;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    const-string v0, "buttonLike"

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 10
    const/4 v0, 0x0

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->getLiveID()Ljava/lang/String;

    .line 14
    move-result-object p1

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p1}, Lcom/trtc/uikit/livekit/common/ui/BasicView;->b(Ljava/lang/String;)V

    .line 18
    return-void
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
.end method

.method public final z0()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->A:Landroid/widget/ImageView;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    const-string v0, "imageMore"

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 10
    const/4 v0, 0x0

    .line 11
    .line 12
    :cond_0
    new-instance v1, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/m;

    .line 13
    .line 14
    .line 15
    invoke-direct {v1, p0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/m;-><init>(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 19
    return-void
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
.end method

.method public final z1()V
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    const-string v1, "null cannot be cast to non-null type android.app.Activity"

    .line 7
    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    check-cast v0, Landroid/app/Activity;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/app/Activity;->getRequestedOrientation()I

    .line 15
    move-result v0

    .line 16
    const/4 v1, 0x0

    .line 17
    const/4 v2, 0x1

    .line 18
    .line 19
    if-ne v0, v2, :cond_0

    .line 20
    move v0, v2

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move v0, v1

    .line 23
    .line 24
    :goto_0
    iget-object v3, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->z:Lcom/trtc/uikit/livekit/kc/widget/KCAudiencePreviewView;

    .line 25
    const/4 v4, 0x0

    .line 26
    .line 27
    if-nez v3, :cond_1

    .line 28
    .line 29
    const-string v3, "kcAudiencePreviewView"

    .line 30
    .line 31
    .line 32
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 33
    move-object v3, v4

    .line 34
    .line 35
    .line 36
    :cond_1
    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    .line 37
    move-result v3

    .line 38
    .line 39
    if-nez v3, :cond_2

    .line 40
    goto :goto_1

    .line 41
    :cond_2
    move v2, v1

    .line 42
    .line 43
    :goto_1
    sget-object v3, Lcom/trtc/uikit/livekit/kc/helper/c;->a:Lcom/trtc/uikit/livekit/kc/helper/c;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v3}, Lcom/trtc/uikit/livekit/kc/helper/c;->b()Z

    .line 47
    move-result v3

    .line 48
    .line 49
    .line 50
    invoke-static {v2, v0, v3}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/x;->a(ZZZ)Lcom/trtc/uikit/livekit/features/audiencecontainer/view/w;

    .line 51
    move-result-object v0

    .line 52
    .line 53
    iget-object v2, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->L:Landroid/widget/ImageView;

    .line 54
    .line 55
    if-nez v2, :cond_3

    .line 56
    .line 57
    const-string v2, "imagePreviewShare"

    .line 58
    .line 59
    .line 60
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 61
    move-object v2, v4

    .line 62
    .line 63
    .line 64
    :cond_3
    invoke-virtual {v0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/w;->c()Z

    .line 65
    move-result v3

    .line 66
    .line 67
    const/16 v5, 0x8

    .line 68
    .line 69
    if-eqz v3, :cond_4

    .line 70
    move v3, v1

    .line 71
    goto :goto_2

    .line 72
    :cond_4
    move v3, v5

    .line 73
    .line 74
    .line 75
    :goto_2
    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 76
    .line 77
    iget-object v2, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->M:Landroid/widget/ImageView;

    .line 78
    .line 79
    if-nez v2, :cond_5

    .line 80
    .line 81
    const-string v2, "imagePreviewReport"

    .line 82
    .line 83
    .line 84
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 85
    move-object v2, v4

    .line 86
    .line 87
    .line 88
    :cond_5
    invoke-virtual {v0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/w;->b()Z

    .line 89
    move-result v3

    .line 90
    .line 91
    if-eqz v3, :cond_6

    .line 92
    move v3, v1

    .line 93
    goto :goto_3

    .line 94
    :cond_6
    move v3, v5

    .line 95
    .line 96
    .line 97
    :goto_3
    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 98
    .line 99
    iget-object v2, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/AudienceView;->K:Landroid/widget/ImageView;

    .line 100
    .line 101
    if-nez v2, :cond_7

    .line 102
    .line 103
    const-string v2, "imageFloatWindow"

    .line 104
    .line 105
    .line 106
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 107
    goto :goto_4

    .line 108
    :cond_7
    move-object v4, v2

    .line 109
    .line 110
    .line 111
    :goto_4
    invoke-virtual {v0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/w;->a()Z

    .line 112
    move-result v0

    .line 113
    .line 114
    if-eqz v0, :cond_8

    .line 115
    goto :goto_5

    .line 116
    :cond_8
    move v1, v5

    .line 117
    .line 118
    .line 119
    :goto_5
    invoke-virtual {v4, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 120
    return-void
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
.end method
