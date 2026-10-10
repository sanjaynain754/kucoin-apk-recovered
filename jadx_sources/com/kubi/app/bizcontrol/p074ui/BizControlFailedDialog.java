package com.kubi.app.bizcontrol.p074ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.blankj.utilcode.util.ThreadUtils;
import com.kubi.app.bizcontrol.R$drawable;
import com.kubi.app.bizcontrol.R$id;
import com.kubi.app.bizcontrol.R$layout;
import com.kubi.app.bizcontrol.R$string;
import com.kubi.app.bizcontrol.R$style;
import com.kubi.resources.dialog.BaseDialogFragment;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.lib.kucoin.bizcontrol.api.BizControlConfigState;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import o00.C42917g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p294gz.C38058b;
import p294gz.InterfaceC38061e;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: BizControlFailedDialog.kt */
/* JADX INFO: loaded from: classes64.dex */
@Metadata(m90083d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\r\u001a\u00020\u000eH\u0002J&\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u001b\u001a\u00020\u0018H\u0002J\b\u0010\u001c\u001a\u00020\u0018H\u0002J\u0010\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, m90084d2 = {"Lcom/kubi/app/bizcontrol/ui/BizControlFailedDialog;", "Lcom/kubi/resources/dialog/BaseDialogFragment;", "Lcom/kubi/sdk/lib/kucoin/bizcontrol/api/IStateListener;", "autoLoading", "", "<init>", "(Z)V", "ivBizControlFailIcon", "Landroid/widget/ImageView;", "tvBizControlFailContent", "Lcom/kubi/resources/widget/BaseTextView;", "btnBizControlFailRefresh", "Lcom/kubi/resources/widget/button/KcPrimaryButton;", "getLayoutId", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onCreate", "", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "showLoadingView", "showFailedView", "onStateUpdated", "state", "Lcom/kubi/sdk/lib/kucoin/bizcontrol/api/BizControlConfigState;", "LBizControl_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBizControlFailedDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BizControlFailedDialog.kt\ncom/kubi/app/bizcontrol/ui/BizControlFailedDialog\n+ 2 KThreadPoolEx.kt\ncom/kubi/sdk/thread/KThreadPoolExKt\n*L\n1#1,117:1\n19#2,2:118\n*S KotlinDebug\n*F\n+ 1 BizControlFailedDialog.kt\ncom/kubi/app/bizcontrol/ui/BizControlFailedDialog\n*L\n80#1:118,2\n*E\n"})
public final class BizControlFailedDialog extends BaseDialogFragment implements InterfaceC38061e {

    /* JADX INFO: renamed from: Z */
    public final boolean f15518Z;

    /* JADX INFO: renamed from: a0 */
    @Nullable
    public ImageView f15519a0;

    /* JADX INFO: renamed from: b0 */
    @Nullable
    public BaseTextView f15520b0;

    /* JADX INFO: renamed from: c0 */
    @Nullable
    public KcPrimaryButton f15521c0;

    /* JADX INFO: renamed from: com.kubi.app.bizcontrol.ui.BizControlFailedDialog$a */
    /* JADX INFO: compiled from: BizControlFailedDialog.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C9421a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BizControlConfigState.values().length];
            try {
                iArr[BizControlConfigState.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BizControlConfigState.FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: A3 */
    public static final void m15005A3(BizControlConfigState bizControlConfigState, BizControlFailedDialog bizControlFailedDialog) {
        if (bizControlConfigState == BizControlConfigState.SUCCESS) {
            C38058b.f85672a.m85939k(bizControlFailedDialog);
            bizControlFailedDialog.dismiss();
        } else if (bizControlConfigState == BizControlConfigState.FAILED) {
            bizControlFailedDialog.m15014B3();
        }
    }

    /* JADX INFO: renamed from: D3 */
    private final void m15007D3() {
        ImageView imageView = this.f15519a0;
        if (imageView != null) {
            imageView.setImageResource(R$drawable.ic2_common_processing);
        }
        BaseTextView baseTextView = this.f15520b0;
        if (baseTextView != null) {
            baseTextView.setText(getText(R$string.biz_control_config_reloading_hint));
        }
        C42917g.m94139e().execute(new Runnable() { // from class: com.kubi.app.bizcontrol.ui.c
            @Override // java.lang.Runnable
            public final void run() {
                BizControlFailedDialog.m15008E3(this.f15529b);
            }
        });
    }

    /* JADX INFO: renamed from: E3 */
    public static final void m15008E3(BizControlFailedDialog bizControlFailedDialog) {
        KcPrimaryButton kcPrimaryButton = bizControlFailedDialog.f15521c0;
        if (kcPrimaryButton != null) {
            kcPrimaryButton.m55043o();
        }
    }

    /* JADX INFO: renamed from: z3 */
    private final int m15013z3() {
        return R$layout.layout_biz_control_fail_dialog;
    }

    /* JADX INFO: renamed from: B3 */
    public final void m15014B3() {
        ImageView imageView = this.f15519a0;
        if (imageView != null) {
            imageView.setImageResource(R$drawable.ic2_common_warning);
        }
        BaseTextView baseTextView = this.f15520b0;
        if (baseTextView != null) {
            baseTextView.setText(getText(R$string.biz_control_config_failed_hint));
        }
        KcPrimaryButton kcPrimaryButton = this.f15521c0;
        if (kcPrimaryButton != null) {
            kcPrimaryButton.mo28851l();
        }
        KcPrimaryButton kcPrimaryButton2 = this.f15521c0;
        if (kcPrimaryButton2 != null) {
            C27046k.m66711z(kcPrimaryButton2, 0L, new Function0() { // from class: com.kubi.app.bizcontrol.ui.a
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BizControlFailedDialog.m15006C3(this.f15526b);
                }
            }, 1, null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(m15013z3(), container, false);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        this.f15519a0 = (ImageView) view.findViewById(R$id.iv_bizControl_fail_icon);
        this.f15520b0 = (BaseTextView) view.findViewById(R$id.tv_bizControl_fail_content);
        this.f15521c0 = (KcPrimaryButton) view.findViewById(R$id.btn_bizControl_fail_refresh);
        m54191p3();
        if (!this.f15518Z) {
            m15014B3();
            return;
        }
        C38058b c38058b = C38058b.f85672a;
        int i11 = C9421a.$EnumSwitchMapping$0[c38058b.m85935g().ordinal()];
        if (i11 == 1) {
            dismiss();
        } else if (i11 == 2) {
            m15014B3();
        } else {
            m15007D3();
            c38058b.m85929a(this);
        }
    }

    @Override // p294gz.InterfaceC38061e
    /* JADX INFO: renamed from: r */
    public void mo14990r(@NotNull final BizControlConfigState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        ThreadUtils.m6114g(new Runnable() { // from class: com.kubi.app.bizcontrol.ui.b
            @Override // java.lang.Runnable
            public final void run() {
                BizControlFailedDialog.m15005A3(state, this);
            }
        });
    }

    public BizControlFailedDialog(boolean z11) {
        this.f15518Z = z11;
    }

    /* JADX INFO: renamed from: C3 */
    public static final Unit m15006C3(BizControlFailedDialog bizControlFailedDialog) {
        bizControlFailedDialog.m15007D3();
        LifecycleOwnerKt.getLifecycleScope(bizControlFailedDialog).launchWhenCreated(new BizControlFailedDialog$showFailedView$1$1(bizControlFailedDialog, null));
        return Unit.INSTANCE;
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(0, R$style.BiDialog_BizControl_FullScreen);
    }
}
