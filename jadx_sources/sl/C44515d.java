package sl;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kucoin.market.monitor.lib.R$id;
import com.kubi.market.monitor.lib.p100ui.floating.setting.FloatWindowSwitchButton;
import com.kubi.market.monitor.lib.p100ui.floating.setting.SettingSymbolListView;
import com.kubi.market.monitor.lib.p100ui.floating.setting.bubbleseekbar.SettingBubbleSeekBar;

/* JADX INFO: renamed from: sl.d */
/* JADX INFO: compiled from: FragmentFloatingSettingNewBinding.java */
/* JADX INFO: loaded from: classes19.dex */
public final class C44515d implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f98627a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final SettingBubbleSeekBar f98628b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ConstraintLayout f98629c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final SettingSymbolListView f98630d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final TextView f98631e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final TextView f98632f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final View f98633g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final View f98634h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final ConstraintLayout f98635i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final TextView f98636j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final TextView f98637k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final FloatWindowSwitchButton f98638l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final ConstraintLayout f98639m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final TextView f98640n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final TextView f98641o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final ConstraintLayout f98642p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final TextView f98643q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final ConstraintLayout f98644r;

    /* JADX INFO: renamed from: s */
    @NonNull
    public final TextView f98645s;

    public C44515d(@NonNull ConstraintLayout constraintLayout, @NonNull SettingBubbleSeekBar settingBubbleSeekBar, @NonNull ConstraintLayout constraintLayout2, @NonNull SettingSymbolListView settingSymbolListView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull View view, @NonNull View view2, @NonNull ConstraintLayout constraintLayout3, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull FloatWindowSwitchButton floatWindowSwitchButton, @NonNull ConstraintLayout constraintLayout4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull ConstraintLayout constraintLayout5, @NonNull TextView textView7, @NonNull ConstraintLayout constraintLayout6, @NonNull TextView textView8) {
        this.f98627a = constraintLayout;
        this.f98628b = settingBubbleSeekBar;
        this.f98629c = constraintLayout2;
        this.f98630d = settingSymbolListView;
        this.f98631e = textView;
        this.f98632f = textView2;
        this.f98633g = view;
        this.f98634h = view2;
        this.f98635i = constraintLayout3;
        this.f98636j = textView3;
        this.f98637k = textView4;
        this.f98638l = floatWindowSwitchButton;
        this.f98639m = constraintLayout4;
        this.f98640n = textView5;
        this.f98641o = textView6;
        this.f98642p = constraintLayout5;
        this.f98643q = textView7;
        this.f98644r = constraintLayout6;
        this.f98645s = textView8;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44515d m98490a(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i11 = R$id.alpha_seekBar;
        SettingBubbleSeekBar settingBubbleSeekBar = (SettingBubbleSeekBar) ViewBindings.findChildViewById(view, i11);
        if (settingBubbleSeekBar != null) {
            i11 = R$id.bgAlphaTipLayout;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
            if (constraintLayout != null) {
                i11 = R$id.coin_add_layout;
                SettingSymbolListView settingSymbolListView = (SettingSymbolListView) ViewBindings.findChildViewById(view, i11);
                if (settingSymbolListView != null) {
                    i11 = R$id.currentAlpha;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
                    if (textView != null) {
                        i11 = R$id.customShow;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i11);
                        if (textView2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.divider))) != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i11 = R$id.divider2))) != null) {
                            i11 = R$id.floating_window_bg_alpha_scale;
                            ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                            if (constraintLayout2 != null) {
                                i11 = R$id.floatingWindowBgTips;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i11);
                                if (textView3 != null) {
                                    i11 = R$id.floating_window_setting_title;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i11);
                                    if (textView4 != null) {
                                        i11 = R$id.floatingWindowSwitch;
                                        FloatWindowSwitchButton floatWindowSwitchButton = (FloatWindowSwitchButton) ViewBindings.findChildViewById(view, i11);
                                        if (floatWindowSwitchButton != null) {
                                            i11 = R$id.floating_window_switch_layout;
                                            ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                                            if (constraintLayout3 != null) {
                                                i11 = R$id.floating_window_switch_tip_description;
                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                if (textView5 != null) {
                                                    i11 = R$id.floating_window_switch_tip_title;
                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                    if (textView6 != null) {
                                                        i11 = R$id.mainSetting;
                                                        ConstraintLayout constraintLayout4 = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                                                        if (constraintLayout4 != null) {
                                                            i11 = R$id.moreSetting;
                                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                            if (textView7 != null) {
                                                                i11 = R$id.themeSetting;
                                                                ConstraintLayout constraintLayout5 = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                                                                if (constraintLayout5 != null) {
                                                                    i11 = R$id.themeText;
                                                                    TextView textView8 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                                    if (textView8 != null) {
                                                                        return new C44515d((ConstraintLayout) view, settingBubbleSeekBar, constraintLayout, settingSymbolListView, textView, textView2, viewFindChildViewById, viewFindChildViewById2, constraintLayout2, textView3, textView4, floatWindowSwitchButton, constraintLayout3, textView5, textView6, constraintLayout4, textView7, constraintLayout5, textView8);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f98627a;
    }
}
