package sl;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kucoin.market.monitor.lib.R$id;
import com.kubi.market.monitor.lib.p100ui.floating.setting.bubbleseekbar.SettingBubbleSeekBar;

/* JADX INFO: renamed from: sl.c */
/* JADX INFO: compiled from: FragmentFloatingMoreSettingBinding.java */
/* JADX INFO: loaded from: classes19.dex */
public final class C44514c implements ViewBinding {

    /* JADX INFO: renamed from: A */
    @NonNull
    public final LinearLayoutCompat f98598A;

    /* JADX INFO: renamed from: B */
    @NonNull
    public final ConstraintLayout f98599B;

    /* JADX INFO: renamed from: C */
    @NonNull
    public final ConstraintLayout f98600C;

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f98601a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final View f98602b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final View f98603c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final LinearLayoutCompat f98604d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ConstraintLayout f98605e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final TextView f98606f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final TextView f98607g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final ConstraintLayout f98608h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final TextView f98609i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final TextView f98610j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final TextView f98611k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final TextView f98612l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final TextView f98613m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final TextView f98614n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final TextView f98615o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final TextView f98616p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final ConstraintLayout f98617q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final TextView f98618r;

    /* JADX INFO: renamed from: s */
    @NonNull
    public final TextView f98619s;

    /* JADX INFO: renamed from: t */
    @NonNull
    public final TextView f98620t;

    /* JADX INFO: renamed from: u */
    @NonNull
    public final TextView f98621u;

    /* JADX INFO: renamed from: v */
    @NonNull
    public final LinearLayoutCompat f98622v;

    /* JADX INFO: renamed from: w */
    @NonNull
    public final TextView f98623w;

    /* JADX INFO: renamed from: x */
    @NonNull
    public final TextView f98624x;

    /* JADX INFO: renamed from: y */
    @NonNull
    public final TextView f98625y;

    /* JADX INFO: renamed from: z */
    @NonNull
    public final SettingBubbleSeekBar f98626z;

    public C44514c(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull View view, @NonNull View view2, @NonNull LinearLayoutCompat linearLayoutCompat2, @NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull ConstraintLayout constraintLayout2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8, @NonNull TextView textView9, @NonNull TextView textView10, @NonNull ConstraintLayout constraintLayout3, @NonNull TextView textView11, @NonNull TextView textView12, @NonNull TextView textView13, @NonNull TextView textView14, @NonNull LinearLayoutCompat linearLayoutCompat3, @NonNull TextView textView15, @NonNull TextView textView16, @NonNull TextView textView17, @NonNull SettingBubbleSeekBar settingBubbleSeekBar, @NonNull LinearLayoutCompat linearLayoutCompat4, @NonNull ConstraintLayout constraintLayout4, @NonNull ConstraintLayout constraintLayout5) {
        this.f98601a = linearLayoutCompat;
        this.f98602b = view;
        this.f98603c = view2;
        this.f98604d = linearLayoutCompat2;
        this.f98605e = constraintLayout;
        this.f98606f = textView;
        this.f98607g = textView2;
        this.f98608h = constraintLayout2;
        this.f98609i = textView3;
        this.f98610j = textView4;
        this.f98611k = textView5;
        this.f98612l = textView6;
        this.f98613m = textView7;
        this.f98614n = textView8;
        this.f98615o = textView9;
        this.f98616p = textView10;
        this.f98617q = constraintLayout3;
        this.f98618r = textView11;
        this.f98619s = textView12;
        this.f98620t = textView13;
        this.f98621u = textView14;
        this.f98622v = linearLayoutCompat3;
        this.f98623w = textView15;
        this.f98624x = textView16;
        this.f98625y = textView17;
        this.f98626z = settingBubbleSeekBar;
        this.f98598A = linearLayoutCompat4;
        this.f98599B = constraintLayout4;
        this.f98600C = constraintLayout5;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44514c m98488a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.divider;
        View viewFindChildViewById2 = ViewBindings.findChildViewById(view, i11);
        if (viewFindChildViewById2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.divider2))) != null) {
            i11 = R$id.expandContainer;
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
            if (linearLayoutCompat != null) {
                i11 = R$id.floating_window_bg_alpha_scale;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                if (constraintLayout != null) {
                    i11 = R$id.floatingWindowBgTips;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
                    if (textView != null) {
                        i11 = R$id.floating_window_display_mode;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i11);
                        if (textView2 != null) {
                            i11 = R$id.floating_window_display_mode_layout;
                            ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                            if (constraintLayout2 != null) {
                                i11 = R$id.floating_window_display_mode_text;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i11);
                                if (textView3 != null) {
                                    i11 = R$id.floating_window_page_count_tip_text;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i11);
                                    if (textView4 != null) {
                                        i11 = R$id.floating_window_pagination_settings;
                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i11);
                                        if (textView5 != null) {
                                            i11 = R$id.floating_window_pagination_settings_text;
                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i11);
                                            if (textView6 != null) {
                                                i11 = R$id.floating_window_paging_interval_10s;
                                                TextView textView7 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                if (textView7 != null) {
                                                    i11 = R$id.floating_window_paging_interval_3s;
                                                    TextView textView8 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                    if (textView8 != null) {
                                                        i11 = R$id.floating_window_paging_interval_5s;
                                                        TextView textView9 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                        if (textView9 != null) {
                                                            i11 = R$id.floating_window_refresh_time;
                                                            TextView textView10 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                            if (textView10 != null) {
                                                                i11 = R$id.floating_window_refresh_time_layout;
                                                                ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                                                                if (constraintLayout3 != null) {
                                                                    i11 = R$id.floating_window_refresh_time_text;
                                                                    TextView textView11 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                                    if (textView11 != null) {
                                                                        i11 = R$id.floating_window_scroll_interval_10s;
                                                                        TextView textView12 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                                        if (textView12 != null) {
                                                                            i11 = R$id.floating_window_scroll_interval_3s;
                                                                            TextView textView13 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                                            if (textView13 != null) {
                                                                                i11 = R$id.floating_window_scroll_interval_5s;
                                                                                TextView textView14 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                                                if (textView14 != null) {
                                                                                    i11 = R$id.floating_window_scroll_interval_layout;
                                                                                    LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                                                                                    if (linearLayoutCompat2 != null) {
                                                                                        i11 = R$id.floating_window_setting_title;
                                                                                        TextView textView15 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                                                        if (textView15 != null) {
                                                                                            i11 = R$id.floating_window_text_size;
                                                                                            TextView textView16 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                                                            if (textView16 != null) {
                                                                                                i11 = R$id.floating_window_text_size_current;
                                                                                                TextView textView17 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                                                                if (textView17 != null) {
                                                                                                    i11 = R$id.pageCountSeekBar;
                                                                                                    SettingBubbleSeekBar settingBubbleSeekBar = (SettingBubbleSeekBar) ViewBindings.findChildViewById(view, i11);
                                                                                                    if (settingBubbleSeekBar != null) {
                                                                                                        i11 = R$id.paging_interval_layout;
                                                                                                        LinearLayoutCompat linearLayoutCompat3 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                                                                                                        if (linearLayoutCompat3 != null) {
                                                                                                            i11 = R$id.pagingModeLayout;
                                                                                                            ConstraintLayout constraintLayout4 = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                                                                                                            if (constraintLayout4 != null) {
                                                                                                                i11 = R$id.text_size_setting_layout;
                                                                                                                ConstraintLayout constraintLayout5 = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                                                                                                                if (constraintLayout5 != null) {
                                                                                                                    return new C44514c((LinearLayoutCompat) view, viewFindChildViewById2, viewFindChildViewById, linearLayoutCompat, constraintLayout, textView, textView2, constraintLayout2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, constraintLayout3, textView11, textView12, textView13, textView14, linearLayoutCompat2, textView15, textView16, textView17, settingBubbleSeekBar, linearLayoutCompat3, constraintLayout4, constraintLayout5);
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
    public LinearLayoutCompat getRoot() {
        return this.f98601a;
    }
}
