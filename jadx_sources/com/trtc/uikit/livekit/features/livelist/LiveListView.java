package com.trtc.uikit.livekit.features.livelist;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.kubi.p110rn.kline.KlineFlutterMiniConstants;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import com.tencent.qcloud.tuicore.TUICore;
import com.trtc.uikit.livekit.features.livelist.view.doublecolumn.DoubleColumnListView;
import com.trtc.uikit.livekit.features.livelist.view.singlecolumn.SingleColumnListView;
import he0.InterfaceC38182b;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: LiveListView.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ.\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001eJ\u000e\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010 \u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u0017J\u0006\u0010\"\u001a\u00020\u001bJ\b\u0010#\u001a\u00020\u001bH\u0014J\b\u0010$\u001a\u00020\u001bH\u0014J \u0010%\u001a\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0012\u0010&\u001a\u00020\u001b2\b\u0010!\u001a\u0004\u0018\u00010\u0017H\u0002J\u0012\u0010'\u001a\u00020\u001b2\b\u0010!\u001a\u0004\u0018\u00010\u0017H\u0002J\u0010\u0010(\u001a\u00020\u001b2\u0006\u0010)\u001a\u00020\u0019H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006*"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/livelist/LiveListView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", TtmlNode.TAG_STYLE, "Lcom/trtc/uikit/livekit/features/livelist/Style;", "singleColumnListView", "Lcom/trtc/uikit/livekit/features/livelist/view/singlecolumn/SingleColumnListView;", "doubleColumnListView", "Lcom/trtc/uikit/livekit/features/livelist/view/doublecolumn/DoubleColumnListView;", "liveInfoListStore", "Lcom/trtc/uikit/livekit/features/livelist/store/LiveInfoListStore;", "fragmentActivity", "Landroidx/fragment/app/FragmentActivity;", "liveListViewAdapter", "Lcom/trtc/uikit/livekit/features/livelist/LiveListViewAdapter;", "onItemClickListener", "Lcom/trtc/uikit/livekit/features/livelist/OnItemClickListener;", "isInit", "", "init", "", "adapter", KlineFlutterMiniConstants.PROP_DATA_SOURCE, "Lcom/trtc/uikit/livekit/features/livelist/LiveListDataSource;", "updateColumnStyle", "setOnItemClickListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "refreshData", "onAttachedToWindow", "onDetachedFromWindow", "initLiveColumnListView", "setDoubleColumnListViewClickLister", "setSingleColumnListViewClickLister", "enableSwitchPlaybackQuality", BridgeParamKeyKt.RN_CONTAINER_UI_ENABLE, "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nLiveListView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveListView.kt\ncom/trtc/uikit/livekit/features/livelist/LiveListView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,118:1\n1#2:119\n*E\n"})
public final class LiveListView extends FrameLayout {

    /* JADX INFO: renamed from: b */
    public Style f79033b;

    /* JADX INFO: renamed from: c */
    public SingleColumnListView f79034c;

    /* JADX INFO: renamed from: d */
    public DoubleColumnListView f79035d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public InterfaceC38182b f79036e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LiveListView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.livelist.LiveListView$a */
    /* JADX INFO: compiled from: LiveListView.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C36373a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Style.values().length];
            try {
                iArr[Style.DOUBLE_COLUMN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LiveListView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void setDoubleColumnListViewClickLister(InterfaceC38182b interfaceC38182b) {
        if (interfaceC38182b != null) {
            DoubleColumnListView doubleColumnListView = this.f79035d;
            if (doubleColumnListView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("doubleColumnListView");
                doubleColumnListView = null;
            }
            doubleColumnListView.setOnItemClickListener(interfaceC38182b);
        }
    }

    private final void setSingleColumnListViewClickLister(InterfaceC38182b interfaceC38182b) {
        if (interfaceC38182b != null) {
            SingleColumnListView singleColumnListView = this.f79034c;
            if (singleColumnListView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("singleColumnListView");
                singleColumnListView = null;
            }
            singleColumnListView.setOnItemClickListener(interfaceC38182b);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m81370a(boolean z11) {
        HashMap map = new HashMap();
        map.put(BridgeParamKeyKt.RN_CONTAINER_UI_ENABLE, Boolean.valueOf(z11));
        TUICore.callService("AdvanceSettingManager", "enableSwitchPlaybackQuality", map);
    }

    public final void setOnItemClickListener(@NotNull InterfaceC38182b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f79036e = listener;
        Style style = this.f79033b;
        if (style == null) {
            Intrinsics.throwUninitializedPropertyAccessException(TtmlNode.TAG_STYLE);
            style = null;
        }
        if (C36373a.$EnumSwitchMapping$0[style.ordinal()] == 1) {
            setDoubleColumnListViewClickLister(listener);
        } else {
            setSingleColumnListViewClickLister(listener);
        }
    }

    public /* synthetic */ LiveListView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m81370a(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m81370a(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LiveListView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
