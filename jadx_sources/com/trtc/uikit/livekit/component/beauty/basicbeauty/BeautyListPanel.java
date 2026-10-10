package com.trtc.uikit.livekit.component.beauty.basicbeauty;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.qcloud.tuicore.util.ScreenUtil;
import com.trtc.uikit.livekit.R$id;
import com.trtc.uikit.livekit.R$layout;
import com.trtc.uikit.livekit.R$string;
import com.trtc.uikit.livekit.component.beauty.basicbeauty.BeautyListPanel;
import com.trtc.uikit.livekit.component.beauty.basicbeauty.view.BeautyListAdapter;
import fd0.C37436d;
import io.trtc.tuikit.atomicxcore.api.device.BaseBeautyStore;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BeautyListPanel.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u0018H\u0014J\b\u0010\u001a\u001a\u00020\u0018H\u0014J\u0006\u0010\u001b\u001a\u00020\u0018J\u0006\u0010\u001c\u001a\u00020\u0018J\u0006\u0010\u001d\u001a\u00020\u0018J\u0006\u0010\u001e\u001a\u00020\u0018J\b\u0010\u001f\u001a\u00020\u0018H\u0002J\b\u0010 \u001a\u00020\u0018H\u0002J\u0010\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u0007H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/beauty/basicbeauty/BeautyListPanel;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "beautyListAdapter", "Lcom/trtc/uikit/livekit/component/beauty/basicbeauty/view/BeautyListAdapter;", "beautySeekBar", "Landroid/widget/SeekBar;", "textBeautyLevel", "Landroid/widget/TextView;", "textBeautyType", "recycleBeautyList", "Landroidx/recyclerview/widget/RecyclerView;", "currentBeautyType", "Lcom/trtc/uikit/livekit/component/beauty/basicbeauty/view/BeautyListAdapter$BeautyType;", "baseBeautyStore", "Lio/trtc/tuikit/atomicxcore/api/device/BaseBeautyStore;", "initView", "", "onAttachedToWindow", "onDetachedFromWindow", "closeBeauty", "enableSmooth", "enableWhiteness", "enableRuddy", "initBeautySeekBar", "initBeautyList", "setSeekBarVisibility", "visibility", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"ViewConstructor"})
public final class BeautyListPanel extends FrameLayout {

    /* JADX INFO: renamed from: b */
    public BeautyListAdapter f77671b;

    /* JADX INFO: renamed from: c */
    public SeekBar f77672c;

    /* JADX INFO: renamed from: d */
    public TextView f77673d;

    /* JADX INFO: renamed from: e */
    public TextView f77674e;

    /* JADX INFO: renamed from: f */
    public RecyclerView f77675f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public BeautyListAdapter.BeautyType f77676g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public final BaseBeautyStore f77677h;

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.beauty.basicbeauty.BeautyListPanel$b */
    /* JADX INFO: compiled from: BeautyListPanel.kt */
    @Metadata(m90083d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, m90084d2 = {"com/trtc/uikit/livekit/component/beauty/basicbeauty/BeautyListPanel$initBeautyList$1", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C35898b extends RecyclerView.ItemDecoration {

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f77678d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ int f77679e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ int f77680f;

        public C35898b(int i11, int i12, int i13) {
            this.f77678d = i11;
            this.f77679e = i12;
            this.f77680f = i13;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
            Intrinsics.checkNotNullParameter(outRect, "outRect");
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(parent, "parent");
            Intrinsics.checkNotNullParameter(state, "state");
            int childLayoutPosition = parent.getChildLayoutPosition(view) % this.f77678d;
            outRect.left = ((childLayoutPosition + 1) * this.f77679e) - (childLayoutPosition * this.f77680f);
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.beauty.basicbeauty.BeautyListPanel$c */
    /* JADX INFO: compiled from: BeautyListPanel.kt */
    @Metadata(m90083d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\f"}, m90084d2 = {"com/trtc/uikit/livekit/component/beauty/basicbeauty/BeautyListPanel$initBeautySeekBar$1", "Landroid/widget/SeekBar$OnSeekBarChangeListener;", "onProgressChanged", "", "seekBar", "Landroid/widget/SeekBar;", "progress", "", "fromUser", "", "onStartTrackingTouch", "onStopTrackingTouch", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C35899c implements SeekBar.OnSeekBarChangeListener {

        /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.beauty.basicbeauty.BeautyListPanel$c$a */
        /* JADX INFO: compiled from: BeautyListPanel.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[BeautyListAdapter.BeautyType.values().length];
                try {
                    iArr[BeautyListAdapter.BeautyType.SMOOTH.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[BeautyListAdapter.BeautyType.WHITENESS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[BeautyListAdapter.BeautyType.RUDDY.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public C35899c() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            Intrinsics.checkNotNullParameter(seekBar, "seekBar");
            TextView textView = BeautyListPanel.this.f77673d;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("textBeautyLevel");
                textView = null;
            }
            textView.setText(String.valueOf(progress));
            int i11 = a.$EnumSwitchMapping$0[BeautyListPanel.this.f77676g.ordinal()];
            if (i11 == 1) {
                BeautyListPanel.this.f77677h.setSmoothLevel(progress);
            } else if (i11 == 2) {
                BeautyListPanel.this.f77677h.setWhitenessLevel(progress);
            } else {
                if (i11 != 3) {
                    return;
                }
                BeautyListPanel.this.f77677h.setRuddyLevel(progress);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            Intrinsics.checkNotNullParameter(seekBar, "seekBar");
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            Intrinsics.checkNotNullParameter(seekBar, "seekBar");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BeautyListPanel(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.beauty.basicbeauty.BeautyListPanel$a */
    /* JADX INFO: compiled from: BeautyListPanel.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C35897a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BeautyListAdapter.BeautyType.values().length];
            try {
                iArr[BeautyListAdapter.BeautyType.CLOSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BeautyListAdapter.BeautyType.SMOOTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BeautyListAdapter.BeautyType.WHITENESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BeautyListAdapter.BeautyType.RUDDY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BeautyListPanel(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: j */
    public static final void m79553j(BeautyListPanel beautyListPanel, BeautyListAdapter.BeautyType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        beautyListPanel.f77676g = type;
        int i11 = C35897a.$EnumSwitchMapping$0[type.ordinal()];
        if (i11 == 1) {
            beautyListPanel.m79554e();
            return;
        }
        if (i11 == 2) {
            beautyListPanel.m79556g();
        } else if (i11 == 3) {
            beautyListPanel.m79557h();
        } else {
            if (i11 != 4) {
                return;
            }
            beautyListPanel.m79555f();
        }
    }

    private final void setSeekBarVisibility(int visibility) {
        SeekBar seekBar = this.f77672c;
        TextView textView = null;
        if (seekBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("beautySeekBar");
            seekBar = null;
        }
        seekBar.setVisibility(visibility);
        TextView textView2 = this.f77674e;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textBeautyType");
            textView2 = null;
        }
        textView2.setVisibility(visibility);
        TextView textView3 = this.f77673d;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textBeautyLevel");
        } else {
            textView = textView3;
        }
        textView.setVisibility(visibility);
    }

    /* JADX INFO: renamed from: e */
    public final void m79554e() {
        setSeekBarVisibility(8);
        C37436d.m84222d();
    }

    /* JADX INFO: renamed from: f */
    public final void m79555f() {
        float fFloatValue = this.f77677h.getBaseBeautyState().getRuddyLevel().getValue().floatValue();
        setSeekBarVisibility(0);
        TextView textView = this.f77674e;
        SeekBar seekBar = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textBeautyType");
            textView = null;
        }
        textView.setText(R$string.common_beauty_item_ruddy);
        SeekBar seekBar2 = this.f77672c;
        if (seekBar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("beautySeekBar");
            seekBar2 = null;
        }
        seekBar2.setMax(9);
        seekBar2.setProgress((int) fFloatValue);
        TextView textView2 = this.f77673d;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textBeautyLevel");
            textView2 = null;
        }
        SeekBar seekBar3 = this.f77672c;
        if (seekBar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("beautySeekBar");
        } else {
            seekBar = seekBar3;
        }
        textView2.setText(String.valueOf(seekBar.getProgress()));
    }

    /* JADX INFO: renamed from: g */
    public final void m79556g() {
        float fFloatValue = this.f77677h.getBaseBeautyState().getSmoothLevel().getValue().floatValue();
        setSeekBarVisibility(0);
        TextView textView = this.f77674e;
        SeekBar seekBar = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textBeautyType");
            textView = null;
        }
        textView.setText(R$string.common_beauty_item_smooth);
        SeekBar seekBar2 = this.f77672c;
        if (seekBar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("beautySeekBar");
            seekBar2 = null;
        }
        seekBar2.setMax(9);
        seekBar2.setProgress((int) fFloatValue);
        TextView textView2 = this.f77673d;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textBeautyLevel");
            textView2 = null;
        }
        SeekBar seekBar3 = this.f77672c;
        if (seekBar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("beautySeekBar");
        } else {
            seekBar = seekBar3;
        }
        textView2.setText(String.valueOf(seekBar.getProgress()));
    }

    /* JADX INFO: renamed from: h */
    public final void m79557h() {
        float fFloatValue = this.f77677h.getBaseBeautyState().getWhitenessLevel().getValue().floatValue();
        setSeekBarVisibility(0);
        TextView textView = this.f77674e;
        SeekBar seekBar = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textBeautyType");
            textView = null;
        }
        textView.setText(R$string.common_beauty_item_whiteness);
        SeekBar seekBar2 = this.f77672c;
        if (seekBar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("beautySeekBar");
            seekBar2 = null;
        }
        seekBar2.setMax(9);
        seekBar2.setProgress((int) fFloatValue);
        TextView textView2 = this.f77673d;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textBeautyLevel");
            textView2 = null;
        }
        SeekBar seekBar3 = this.f77672c;
        if (seekBar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("beautySeekBar");
        } else {
            seekBar = seekBar3;
        }
        textView2.setText(String.valueOf(seekBar.getProgress()));
    }

    /* JADX INFO: renamed from: i */
    public final void m79558i() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        BeautyListAdapter beautyListAdapter = new BeautyListAdapter(context);
        this.f77671b = beautyListAdapter;
        int itemCount = beautyListAdapter.getItemCount();
        RecyclerView recyclerView = this.f77675f;
        BeautyListAdapter beautyListAdapter2 = null;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recycleBeautyList");
            recyclerView = null;
        }
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), itemCount));
        int screenWidth = ScreenUtil.getScreenWidth(getContext()) - (ScreenUtil.dip2px(56.0f) * itemCount);
        int i11 = screenWidth / itemCount;
        int i12 = screenWidth / (itemCount + 1);
        RecyclerView recyclerView2 = this.f77675f;
        if (recyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recycleBeautyList");
            recyclerView2 = null;
        }
        recyclerView2.addItemDecoration(new C35898b(itemCount, i12, i11));
        RecyclerView recyclerView3 = this.f77675f;
        if (recyclerView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recycleBeautyList");
            recyclerView3 = null;
        }
        BeautyListAdapter beautyListAdapter3 = this.f77671b;
        if (beautyListAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("beautyListAdapter");
            beautyListAdapter3 = null;
        }
        recyclerView3.setAdapter(beautyListAdapter3);
        BeautyListAdapter beautyListAdapter4 = this.f77671b;
        if (beautyListAdapter4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("beautyListAdapter");
        } else {
            beautyListAdapter2 = beautyListAdapter4;
        }
        beautyListAdapter2.setOnItemClickListener(new BeautyListAdapter.InterfaceC35901b() { // from class: gd0.a
            @Override // com.trtc.uikit.livekit.component.beauty.basicbeauty.view.BeautyListAdapter.InterfaceC35901b
            /* JADX INFO: renamed from: a */
            public final void mo79569a(BeautyListAdapter.BeautyType beautyType) {
                BeautyListPanel.m79553j(this.f85239a, beautyType);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public final void m79559k() {
        SeekBar seekBar = this.f77672c;
        if (seekBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("beautySeekBar");
            seekBar = null;
        }
        seekBar.setOnSeekBarChangeListener(new C35899c());
    }

    public /* synthetic */ BeautyListPanel(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: l */
    public final void m79560l() {
        LayoutInflater.from(getContext()).inflate(R$layout.beauty_basic_beauty_panel, (ViewGroup) this, true);
        View viewFindViewById = findViewById(R$id.rv_beauty_list);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f77675f = (RecyclerView) viewFindViewById;
        View viewFindViewById2 = findViewById(R$id.beauty_tv_seek_bar_type);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f77674e = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R$id.beauty_seek_bar);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f77672c = (SeekBar) viewFindViewById3;
        View viewFindViewById4 = findViewById(R$id.beauty_tv_seek_bar_level);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f77673d = (TextView) viewFindViewById4;
        m79558i();
        m79559k();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BeautyListPanel(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f77676g = BeautyListAdapter.BeautyType.NONE;
        this.f77677h = BaseBeautyStore.INSTANCE.shared();
        m79560l();
    }
}
