package com.kubi.mine.lib.p101ui;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import com.kubi.mine.R$layout;
import com.kubi.resources.widget.KcSwitchButton;
import com.kubi.resources.widget.NavigationBar;
import com.kubi.resources.widget.button.KcSecondaryButton;
import com.kubi.router.core.Router;
import com.kubi.sdk.base.p113ui.OldBaseFragment;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.DataMapUtil;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import gq.C37989j;
import iq.InterfaceC40160b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: BeepSettingFragment.kt */
/* JADX INFO: loaded from: classes29.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0014J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u001a\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/mine/lib/ui/BeepSettingFragment;", "Lcom/kubi/sdk/base/ui/OldBaseFragment;", "<init>", "()V", "binding", "Lcom/kubi/mine/databinding/KucoinFragmentBeepBinding;", "getBinding", "()Lcom/kubi/mine/databinding/KucoinFragmentBeepBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "getLayout", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "MineLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBeepSettingFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BeepSettingFragment.kt\ncom/kubi/mine/lib/ui/BeepSettingFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n*L\n1#1,105:1\n147#2,16:106\n25#3,3:122\n*S KotlinDebug\n*F\n+ 1 BeepSettingFragment.kt\ncom/kubi/mine/lib/ui/BeepSettingFragment\n*L\n23#1:106,16\n60#1:122,3\n*E\n"})
public final class BeepSettingFragment extends OldBaseFragment {

    /* JADX INFO: renamed from: V */
    public static final /* synthetic */ KProperty<Object>[] f35175V = {Reflection.property1(new PropertyReference1Impl(BeepSettingFragment.class, "binding", "getBinding()Lcom/kubi/mine/databinding/KucoinFragmentBeepBinding;", 0))};

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f35176U = C45681e.m100799e(this, new Function1<BeepSettingFragment, C37989j>() { // from class: com.kubi.mine.lib.ui.BeepSettingFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37989j invoke(@NotNull BeepSettingFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37989j.m85853a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C37989j, Unit>() { // from class: com.kubi.mine.lib.ui.BeepSettingFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C37989j it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37989j c37989j) {
            invoke(c37989j);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: A3 */
    public static final void m41877A3(CompoundButton compoundButton, boolean z11) {
        DataMapUtil.f54245a.m66377l("beep_revoke", z11);
    }

    /* JADX INFO: renamed from: u3 */
    public static final void m41887u3(CompoundButton compoundButton, boolean z11) {
        DataMapUtil.f54245a.m66377l("beep_outcome", z11);
    }

    /* JADX INFO: renamed from: v3 */
    public static final void m41888v3(CompoundButton compoundButton, boolean z11) {
        DataMapUtil.f54245a.m66377l("vibrate_bottom", z11);
    }

    /* JADX INFO: renamed from: w3 */
    public static final void m41889w3(CompoundButton compoundButton, boolean z11) {
        DataMapUtil.f54245a.m66377l("beep", z11);
    }

    /* JADX INFO: renamed from: x3 */
    public static final void m41890x3(CompoundButton compoundButton, boolean z11) {
        DataMapUtil.f54245a.m66377l("beep_login", z11);
    }

    /* JADX INFO: renamed from: y3 */
    public static final void m41891y3(CompoundButton compoundButton, boolean z11) {
        DataMapUtil.f54245a.m66377l("beep_income", z11);
    }

    /* JADX INFO: renamed from: z3 */
    public static final void m41892z3(CompoundButton compoundButton, boolean z11) {
        DataMapUtil.f54245a.m66377l("beep_transfer", z11);
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.kucoin_fragment_beep;
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        KcSwitchButton kcSwitchButton;
        KcSwitchButton kcSwitchButton2;
        KcSwitchButton kcSwitchButton3;
        KcSwitchButton kcSwitchButton4;
        KcSwitchButton kcSwitchButton5;
        KcSwitchButton kcSwitchButton6;
        KcSwitchButton kcSwitchButton7;
        KcSwitchButton kcSwitchButton8;
        KcSwitchButton kcSwitchButton9;
        KcSwitchButton kcSwitchButton10;
        KcSwitchButton kcSwitchButton11;
        KcSwitchButton kcSwitchButton12;
        KcSwitchButton kcSwitchButton13;
        KcSwitchButton kcSwitchButton14;
        KcSecondaryButton kcSecondaryButton;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C37989j c37989jM41893s3 = m41893s3();
        if (c37989jM41893s3 != null && (kcSecondaryButton = c37989jM41893s3.f85485b) != null) {
            C27046k.m66711z(kcSecondaryButton, 0L, new Function0() { // from class: com.kubi.mine.lib.ui.n
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BeepSettingFragment.m41886t3(this.f35323b);
                }
            }, 1, null);
        }
        C37989j c37989jM41893s4 = m41893s3();
        if (c37989jM41893s4 != null && (kcSwitchButton14 = c37989jM41893s4.f85487d) != null) {
            kcSwitchButton14.setChecked(DataMapUtil.f54245a.m66370a("vibrate_bottom", true));
        }
        C37989j c37989jM41893s5 = m41893s3();
        if (c37989jM41893s5 != null && (kcSwitchButton13 = c37989jM41893s5.f85487d) != null) {
            kcSwitchButton13.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.kubi.mine.lib.ui.o
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                    BeepSettingFragment.m41888v3(compoundButton, z11);
                }
            });
        }
        Object objM56186h = Router.f46192a.m56186h(InterfaceC40160b.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h != null) {
            ((InterfaceC40160b) objM56186h).mo88511a(m41893s3());
        } else {
            C37989j c37989jM41893s6 = m41893s3();
            if (c37989jM41893s6 != null && (kcSwitchButton2 = c37989jM41893s6.f85491h) != null) {
                kcSwitchButton2.setChecked(DataMapUtil.f54245a.m66370a("beep", true));
            }
            C37989j c37989jM41893s7 = m41893s3();
            if (c37989jM41893s7 != null && (kcSwitchButton = c37989jM41893s7.f85491h) != null) {
                kcSwitchButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.kubi.mine.lib.ui.p
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                        BeepSettingFragment.m41889w3(compoundButton, z11);
                    }
                });
            }
        }
        C37989j c37989jM41893s8 = m41893s3();
        if (c37989jM41893s8 != null && (kcSwitchButton12 = c37989jM41893s8.f85489f) != null) {
            kcSwitchButton12.setChecked(DataMapUtil.f54245a.m66370a("beep_login", true));
        }
        C37989j c37989jM41893s9 = m41893s3();
        if (c37989jM41893s9 != null && (kcSwitchButton11 = c37989jM41893s9.f85489f) != null) {
            kcSwitchButton11.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.kubi.mine.lib.ui.q
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                    BeepSettingFragment.m41890x3(compoundButton, z11);
                }
            });
        }
        C37989j c37989jM41893s10 = m41893s3();
        if (c37989jM41893s10 != null && (kcSwitchButton10 = c37989jM41893s10.f85488e) != null) {
            kcSwitchButton10.setChecked(DataMapUtil.f54245a.m66370a("beep_income", true));
        }
        C37989j c37989jM41893s11 = m41893s3();
        if (c37989jM41893s11 != null && (kcSwitchButton9 = c37989jM41893s11.f85488e) != null) {
            kcSwitchButton9.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.kubi.mine.lib.ui.r
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                    BeepSettingFragment.m41891y3(compoundButton, z11);
                }
            });
        }
        C37989j c37989jM41893s12 = m41893s3();
        if (c37989jM41893s12 != null && (kcSwitchButton8 = c37989jM41893s12.f85493j) != null) {
            kcSwitchButton8.setChecked(DataMapUtil.f54245a.m66370a("beep_transfer", true));
        }
        C37989j c37989jM41893s13 = m41893s3();
        if (c37989jM41893s13 != null && (kcSwitchButton7 = c37989jM41893s13.f85493j) != null) {
            kcSwitchButton7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.kubi.mine.lib.ui.s
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                    BeepSettingFragment.m41892z3(compoundButton, z11);
                }
            });
        }
        C37989j c37989jM41893s14 = m41893s3();
        if (c37989jM41893s14 != null && (kcSwitchButton6 = c37989jM41893s14.f85492i) != null) {
            kcSwitchButton6.setChecked(DataMapUtil.f54245a.m66370a("beep_revoke", true));
        }
        C37989j c37989jM41893s15 = m41893s3();
        if (c37989jM41893s15 != null && (kcSwitchButton5 = c37989jM41893s15.f85492i) != null) {
            kcSwitchButton5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.kubi.mine.lib.ui.t
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                    BeepSettingFragment.m41877A3(compoundButton, z11);
                }
            });
        }
        C37989j c37989jM41893s16 = m41893s3();
        if (c37989jM41893s16 != null && (kcSwitchButton4 = c37989jM41893s16.f85490g) != null) {
            kcSwitchButton4.setChecked(DataMapUtil.f54245a.m66370a("beep_outcome", true));
        }
        C37989j c37989jM41893s17 = m41893s3();
        if (c37989jM41893s17 == null || (kcSwitchButton3 = c37989jM41893s17.f85490g) == null) {
            return;
        }
        kcSwitchButton3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.kubi.mine.lib.ui.u
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                BeepSettingFragment.m41887u3(compoundButton, z11);
            }
        });
    }

    /* JADX INFO: renamed from: s3 */
    public final C37989j m41893s3() {
        return (C37989j) this.f35176U.getValue(this, f35175V[0]);
    }

    /* JADX INFO: renamed from: t3 */
    public static final Unit m41886t3(BeepSettingFragment beepSettingFragment) {
        KcSwitchButton kcSwitchButton;
        KcSwitchButton kcSwitchButton2;
        KcSwitchButton kcSwitchButton3;
        KcSwitchButton kcSwitchButton4;
        KcSwitchButton kcSwitchButton5;
        KcSwitchButton kcSwitchButton6;
        KcSwitchButton kcSwitchButton7;
        C37989j c37989jM41893s3 = beepSettingFragment.m41893s3();
        if (c37989jM41893s3 != null && (kcSwitchButton7 = c37989jM41893s3.f85491h) != null) {
            kcSwitchButton7.setChecked(false);
        }
        DataMapUtil dataMapUtil = DataMapUtil.f54245a;
        dataMapUtil.m66377l("beep", false);
        C37989j c37989jM41893s4 = beepSettingFragment.m41893s3();
        if (c37989jM41893s4 != null && (kcSwitchButton6 = c37989jM41893s4.f85489f) != null) {
            kcSwitchButton6.setChecked(false);
        }
        dataMapUtil.m66377l("beep_login", false);
        C37989j c37989jM41893s5 = beepSettingFragment.m41893s3();
        if (c37989jM41893s5 != null && (kcSwitchButton5 = c37989jM41893s5.f85488e) != null) {
            kcSwitchButton5.setChecked(false);
        }
        dataMapUtil.m66377l("beep_income", false);
        C37989j c37989jM41893s6 = beepSettingFragment.m41893s3();
        if (c37989jM41893s6 != null && (kcSwitchButton4 = c37989jM41893s6.f85493j) != null) {
            kcSwitchButton4.setChecked(false);
        }
        dataMapUtil.m66377l("beep_transfer", false);
        C37989j c37989jM41893s7 = beepSettingFragment.m41893s3();
        if (c37989jM41893s7 != null && (kcSwitchButton3 = c37989jM41893s7.f85492i) != null) {
            kcSwitchButton3.setChecked(false);
        }
        dataMapUtil.m66377l("beep_revoke", false);
        C37989j c37989jM41893s8 = beepSettingFragment.m41893s3();
        if (c37989jM41893s8 != null && (kcSwitchButton2 = c37989jM41893s8.f85490g) != null) {
            kcSwitchButton2.setChecked(false);
        }
        dataMapUtil.m66377l("beep_outcome", false);
        C37989j c37989jM41893s9 = beepSettingFragment.m41893s3();
        if (c37989jM41893s9 != null && (kcSwitchButton = c37989jM41893s9.f85487d) != null) {
            kcSwitchButton.setChecked(false);
        }
        dataMapUtil.m66377l("vibrate_bottom", false);
        return Unit.INSTANCE;
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getTitleBar().m58934f();
        NavigationBar navigationBar = getNavigationBar();
        if (navigationBar != null) {
            navigationBar.m54692c();
        }
    }
}
