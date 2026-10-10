package com.trtc.uikit.livekit.features.anchorprepare.view.function;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.tencent.bugly.proguard.C33757kf;
import com.trtc.uikit.livekit.R$id;
import com.trtc.uikit.livekit.R$layout;
import com.trtc.uikit.livekit.R$string;
import io.trtc.tuikit.atomicx.widget.basicwidget.popover.AtomicPopover;
import io.trtc.tuikit.atomicxcore.api.device.DeviceStore;
import io.trtc.tuikit.atomicxcore.api.device.MirrorType;
import io.trtc.tuikit.atomicxcore.api.device.VideoQuality;
import io.trtc.tuikit.atomicxcore.api.view.LiveCoreView;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import ud0.DialogC45189c;
import ud0.DialogC45191e;

/* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorprepare.view.function.h, reason: from Kotlin metadata */
/* JADX INFO: compiled from: PrepareVideoSettingPanel.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/anchorprepare/view/function/PrepareVideoSettingPanel;", "Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover;", "context", "Landroid/content/Context;", "liveCoreView", "Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;", "<init>", "(Landroid/content/Context;Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;)V", "textMirror", "Landroid/widget/TextView;", "textVideoQuality", "initView", "", "mirrorTypeToString", "", "videoQualityToString", C33757kf.f70665k, "Lio/trtc/tuikit/atomicxcore/api/device/VideoQuality;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class PrepareVideoSettingPanel extends AtomicPopover {

    /* JADX INFO: renamed from: m */
    @NotNull
    public final LiveCoreView f78506m;

    /* JADX INFO: renamed from: n */
    public TextView f78507n;

    /* JADX INFO: renamed from: o */
    public TextView f78508o;

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorprepare.view.function.h$b */
    /* JADX INFO: compiled from: PrepareVideoSettingPanel.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/trtc/uikit/livekit/features/anchorprepare/view/function/PrepareVideoSettingPanel$initView$1$1", "Lcom/trtc/uikit/livekit/component/videoquality/LocalMirrorSelectPanel$OnMirrorTypeSelectedListener;", "onVideoQualitySelected", "", "mirrorType", "Lio/trtc/tuikit/atomicxcore/api/device/MirrorType;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class b implements DialogC45189c.b {
        public b() {
        }

        @Override // ud0.DialogC45189c.b
        /* JADX INFO: renamed from: a */
        public void mo80595a(MirrorType mirrorType) {
            Intrinsics.checkNotNullParameter(mirrorType, "mirrorType");
            DeviceStore.INSTANCE.shared().switchMirror(mirrorType);
            TextView textView = PrepareVideoSettingPanel.this.f78507n;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("textMirror");
                textView = null;
            }
            textView.setText(PrepareVideoSettingPanel.this.m80688L());
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorprepare.view.function.h$c */
    /* JADX INFO: compiled from: PrepareVideoSettingPanel.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/trtc/uikit/livekit/features/anchorprepare/view/function/PrepareVideoSettingPanel$initView$2$1", "Lcom/trtc/uikit/livekit/component/videoquality/VideoQualitySelectPanel$OnVideoQualitySelectedListener;", "onVideoQualitySelected", "", "videoQuality", "Lio/trtc/tuikit/atomicxcore/api/device/VideoQuality;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class c implements DialogC45191e.a {
        public c() {
        }

        @Override // ud0.DialogC45191e.a
        /* JADX INFO: renamed from: a */
        public void mo80689a(VideoQuality videoQuality) {
            Intrinsics.checkNotNullParameter(videoQuality, "videoQuality");
            DeviceStore.INSTANCE.shared().updateVideoQuality(videoQuality);
            TextView textView = PrepareVideoSettingPanel.this.f78508o;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("textVideoQuality");
                textView = null;
            }
            textView.setText(PrepareVideoSettingPanel.this.m80687M(videoQuality));
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorprepare.view.function.h$a */
    /* JADX INFO: compiled from: PrepareVideoSettingPanel.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[MirrorType.values().length];
            try {
                iArr[MirrorType.AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MirrorType.ENABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MirrorType.DISABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[VideoQuality.values().length];
            try {
                iArr2[VideoQuality.QUALITY_1080P.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[VideoQuality.QUALITY_720P.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[VideoQuality.QUALITY_540P.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[VideoQuality.QUALITY_360P.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrepareVideoSettingPanel(@NotNull Context context, @NotNull LiveCoreView liveCoreView) {
        super(context, null, 2, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(liveCoreView, "liveCoreView");
        this.f78506m = liveCoreView;
        m80684I();
    }

    /* JADX INFO: renamed from: J */
    public static final void m80685J(PrepareVideoSettingPanel prepareVideoSettingPanel, View view) {
        List listListOf = CollectionsKt.listOf((Object[]) new MirrorType[]{MirrorType.AUTO, MirrorType.ENABLE, MirrorType.DISABLE});
        Context context = prepareVideoSettingPanel.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        DialogC45189c dialogC45189c = new DialogC45189c(context, listListOf);
        dialogC45189c.setOnMirrorTypeSelectedListener(prepareVideoSettingPanel.new b());
        dialogC45189c.show();
    }

    /* JADX INFO: renamed from: K */
    public static final void m80686K(PrepareVideoSettingPanel prepareVideoSettingPanel, View view) {
        List listListOf = CollectionsKt.listOf((Object[]) new VideoQuality[]{VideoQuality.QUALITY_1080P, VideoQuality.QUALITY_720P});
        Context context = prepareVideoSettingPanel.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        DialogC45191e dialogC45191e = new DialogC45191e(context, listListOf);
        dialogC45191e.setOnVideoQualitySelectedListener(prepareVideoSettingPanel.new c());
        dialogC45191e.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public final String m80687M(VideoQuality videoQuality) {
        int i11 = a.$EnumSwitchMapping$1[videoQuality.ordinal()];
        if (i11 == 1) {
            return "1080P";
        }
        if (i11 == 2) {
            return "720P";
        }
        if (i11 == 3) {
            return "540P";
        }
        if (i11 == 4) {
            return "360P";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: L */
    public final String m80688L() {
        int i11 = a.$EnumSwitchMapping$0[DeviceStore.INSTANCE.shared().getDeviceState().getLocalMirrorType().getValue().ordinal()];
        if (i11 == 1) {
            String string = getContext().getString(R$string.mirror_type_auto);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }
        if (i11 == 2) {
            String string2 = getContext().getString(R$string.mirror_type_enable);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
        if (i11 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        String string3 = getContext().getString(R$string.mirror_type_disable);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        return string3;
    }

    /* JADX INFO: renamed from: I */
    private final void m80684I() {
        TextView textView = null;
        View viewInflate = View.inflate(getContext(), R$layout.livekit_anchor_prepare_layout_video_setting, null);
        Intrinsics.checkNotNull(viewInflate);
        m88181q(viewInflate);
        View viewFindViewById = viewInflate.findViewById(R$id.tv_mirror);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f78507n = (TextView) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(R$id.tv_quality_value);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f78508o = (TextView) viewFindViewById2;
        TextView textView2 = this.f78507n;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textMirror");
            textView2 = null;
        }
        textView2.setText(m80688L());
        TextView textView3 = this.f78507n;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textMirror");
            textView3 = null;
        }
        textView3.setOnClickListener(new View.OnClickListener() { // from class: com.trtc.uikit.livekit.features.anchorprepare.view.function.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PrepareVideoSettingPanel.m80685J(this.f78504b, view);
            }
        });
        TextView textView4 = this.f78508o;
        if (textView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textVideoQuality");
        } else {
            textView = textView4;
        }
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.trtc.uikit.livekit.features.anchorprepare.view.function.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PrepareVideoSettingPanel.m80686K(this.f78505b, view);
            }
        });
    }
}
