package com.kubi.loan.record;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.loan.R$font;
import com.kubi.loan.R$id;
import com.kubi.loan.R$layout;
import com.kubi.loan.R$string;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.TitleBar;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.core.C27029c;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import java.util.List;
import jo.C40452c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43852m;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: LeverBorrowRecordPayingFragment.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 02\u00020\u00012\u00020\u0002:\u00010B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J$\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u001a\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\u001dH\u0002J\b\u0010\"\u001a\u00020\u001dH\u0002J\"\u0010#\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020 H\u0002J\b\u0010)\u001a\u0004\u0018\u00010*J\b\u0010+\u001a\u0004\u0018\u00010*J\u0012\u0010,\u001a\u00020\u001d2\b\u0010-\u001a\u0004\u0018\u00010'H\u0016J\u0012\u0010.\u001a\u00020\u001d2\b\u0010/\u001a\u0004\u0018\u00010'H\u0016R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011¨\u00061"}, m90084d2 = {"Lcom/kubi/loan/record/LeverBorrowRecordPayingFragment;", "Lcom/kubi/sdk/BaseFragment;", "Lcom/kubi/loan/record/OnSymbolOrCoinChange;", "<init>", "()V", "bloanFragmentBorrowBinding", "Lcom/kubi/loan/databinding/BloanFragmentBorrowBinding;", "getBloanFragmentBorrowBinding", "()Lcom/kubi/loan/databinding/BloanFragmentBorrowBinding;", "bloanFragmentBorrowBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "wholeFragment", "Lcom/kubi/loan/record/LeverBorrowRecordChildFragment;", "isolateFragment", "titleGroup", "Landroid/widget/RadioGroup;", "getTitleGroup", "()Landroid/widget/RadioGroup;", "titleGroup$delegate", "Lkotlin/Lazy;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "onBackPressed", "", "initTitleBar", "processFragment", "showFragment", "fragment", "Landroidx/fragment/app/Fragment;", "tag", "", "commitNow", "getCodeTv", "Landroid/widget/TextView;", "getResetTv", "onCoinChanged", "coin", "onSymbolChanged", "symbol", "Companion", "LoanLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nLeverBorrowRecordPayingFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LeverBorrowRecordPayingFragment.kt\ncom/kubi/loan/record/LeverBorrowRecordPayingFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,183:1\n147#2,16:184\n1#3:200\n774#4:201\n865#4,2:202\n1869#4,2:204\n*S KotlinDebug\n*F\n+ 1 LeverBorrowRecordPayingFragment.kt\ncom/kubi/loan/record/LeverBorrowRecordPayingFragment\n*L\n41#1:184,16\n151#1:201\n151#1:202,2\n153#1:204,2\n*E\n"})
public final class LeverBorrowRecordPayingFragment extends BaseFragment implements OnSymbolOrCoinChange {

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f32456U = C45681e.m100799e(this, new Function1<LeverBorrowRecordPayingFragment, C40452c>() { // from class: com.kubi.loan.record.LeverBorrowRecordPayingFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C40452c invoke(@NotNull LeverBorrowRecordPayingFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C40452c.m89093a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C40452c, Unit>() { // from class: com.kubi.loan.record.LeverBorrowRecordPayingFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C40452c it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C40452c c40452c) {
            invoke(c40452c);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    public LeverBorrowRecordChildFragment f32457V;

    /* JADX INFO: renamed from: W */
    public LeverBorrowRecordChildFragment f32458W;

    /* JADX INFO: renamed from: X */
    @NotNull
    public final Lazy f32459X;

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ KProperty<Object>[] f32455Z = {Reflection.property1(new PropertyReference1Impl(LeverBorrowRecordPayingFragment.class, "bloanFragmentBorrowBinding", "getBloanFragmentBorrowBinding()Lcom/kubi/loan/databinding/BloanFragmentBorrowBinding;", 0))};

    /* JADX INFO: renamed from: Y */
    @NotNull
    public static final Companion f32454Y = new Companion(null);

    /* JADX INFO: compiled from: LeverBorrowRecordPayingFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/loan/record/LeverBorrowRecordPayingFragment$Companion;", "", "<init>", "()V", "TYPE_WHOLE", "", "TYPE_ISOLATE", "LoanLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: t3 */
    public static /* synthetic */ void m37787t3(LeverBorrowRecordPayingFragment leverBorrowRecordPayingFragment, Fragment fragment, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        leverBorrowRecordPayingFragment.m37795s3(fragment, str, z11);
    }

    @Override // com.kubi.loan.record.OnSymbolOrCoinChange
    /* JADX INFO: renamed from: A */
    public void mo37789A(@Nullable String str) {
        LeverBorrowRecordChildFragment leverBorrowRecordChildFragment = this.f32458W;
        if (leverBorrowRecordChildFragment != null) {
            LeverBorrowRecordChildFragment leverBorrowRecordChildFragment2 = null;
            if (leverBorrowRecordChildFragment == null) {
                Intrinsics.throwUninitializedPropertyAccessException("isolateFragment");
                leverBorrowRecordChildFragment = null;
            }
            if (leverBorrowRecordChildFragment.isAdded()) {
                LeverBorrowRecordChildFragment leverBorrowRecordChildFragment3 = this.f32458W;
                if (leverBorrowRecordChildFragment3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("isolateFragment");
                } else {
                    leverBorrowRecordChildFragment2 = leverBorrowRecordChildFragment3;
                }
                leverBorrowRecordChildFragment2.m37767I4(str);
            }
        }
    }

    @Override // com.kubi.loan.record.OnSymbolOrCoinChange
    /* JADX INFO: renamed from: F */
    public void mo37790F(@Nullable String str) {
        LeverBorrowRecordChildFragment leverBorrowRecordChildFragment = this.f32457V;
        if (leverBorrowRecordChildFragment != null) {
            LeverBorrowRecordChildFragment leverBorrowRecordChildFragment2 = null;
            if (leverBorrowRecordChildFragment == null) {
                Intrinsics.throwUninitializedPropertyAccessException("wholeFragment");
                leverBorrowRecordChildFragment = null;
            }
            if (leverBorrowRecordChildFragment.isAdded()) {
                LeverBorrowRecordChildFragment leverBorrowRecordChildFragment3 = this.f32457V;
                if (leverBorrowRecordChildFragment3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("wholeFragment");
                } else {
                    leverBorrowRecordChildFragment2 = leverBorrowRecordChildFragment3;
                }
                leverBorrowRecordChildFragment2.m37766D4(str);
            }
        }
    }

    /* JADX INFO: renamed from: l3 */
    public final C40452c m37791l3() {
        return (C40452c) this.f32456U.getValue(this, f32455Z[0]);
    }

    /* JADX INFO: renamed from: o3 */
    public final RadioGroup m37794o3() {
        return (RadioGroup) this.f32459X.getValue();
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.bloan_fragment_borrow, (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m37786r3();
        m37784p3();
    }

    public LeverBorrowRecordPayingFragment() {
        setPageId("B4cryptoPendingRepay");
        this.f32459X = LazyKt.lazy(new Function0() { // from class: com.kubi.loan.record.z
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LeverBorrowRecordPayingFragment.m37788u3(this.f32482b);
            }
        });
    }

    /* JADX INFO: renamed from: p3 */
    private final void m37784p3() {
        TitleBar titleBar = getTitleBar();
        RadioGroup radioGroupM37794o3 = m37794o3();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, C27029c.m66603f(this, 36));
        layoutParams.gravity = 17;
        Unit unit = Unit.INSTANCE;
        titleBar.m58940m(radioGroupM37794o3, layoutParams);
        m37794o3().setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: com.kubi.loan.record.y
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i11) {
                LeverBorrowRecordPayingFragment.m37785q3(this.f32481b, radioGroup, i11);
            }
        });
    }

    /* JADX INFO: renamed from: q3 */
    public static final void m37785q3(LeverBorrowRecordPayingFragment leverBorrowRecordPayingFragment, RadioGroup radioGroup, int i11) {
        int i12;
        int i13;
        LeverBorrowRecordChildFragment leverBorrowRecordChildFragment;
        LeverBorrowRecordChildFragment leverBorrowRecordChildFragment2;
        RadioGroup radioGroupM37794o3 = leverBorrowRecordPayingFragment.m37794o3();
        int i14 = R$id.lend;
        RadioButton radioButton = (RadioButton) radioGroupM37794o3.findViewById(i14);
        Context context = leverBorrowRecordPayingFragment.m37794o3().getContext();
        if (i11 == i14) {
            i12 = R$font.semi;
        } else {
            i12 = R$font.medium;
        }
        radioButton.setTypeface(ResourcesCompat.getFont(context, i12));
        RadioGroup radioGroupM37794o4 = leverBorrowRecordPayingFragment.m37794o3();
        int i15 = R$id.borrow;
        RadioButton radioButton2 = (RadioButton) radioGroupM37794o4.findViewById(i15);
        Context context2 = leverBorrowRecordPayingFragment.m37794o3().getContext();
        if (i11 == i15) {
            i13 = R$font.semi;
        } else {
            i13 = R$font.medium;
        }
        radioButton2.setTypeface(ResourcesCompat.getFont(context2, i13));
        if (i11 == i15) {
            C43852m.m96591c("B4cryptoPendingRepay", "isolatedMarginRepay", "1", null, 8, null);
            LeverBorrowRecordChildFragment leverBorrowRecordChildFragment3 = leverBorrowRecordPayingFragment.f32458W;
            if (leverBorrowRecordChildFragment3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("isolateFragment");
                leverBorrowRecordChildFragment2 = null;
            } else {
                leverBorrowRecordChildFragment2 = leverBorrowRecordChildFragment3;
            }
            m37787t3(leverBorrowRecordPayingFragment, leverBorrowRecordChildFragment2, "1", false, 4, null);
            return;
        }
        C43852m.m96591c("B4cryptoPendingRepay", "crossMarginRepay", "1", null, 8, null);
        LeverBorrowRecordChildFragment leverBorrowRecordChildFragment4 = leverBorrowRecordPayingFragment.f32457V;
        if (leverBorrowRecordChildFragment4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("wholeFragment");
            leverBorrowRecordChildFragment = null;
        } else {
            leverBorrowRecordChildFragment = leverBorrowRecordChildFragment4;
        }
        m37787t3(leverBorrowRecordPayingFragment, leverBorrowRecordChildFragment, "0", false, 4, null);
    }

    /* JADX INFO: renamed from: r3 */
    private final void m37786r3() {
        Integer numValueOf;
        String strM56239b0;
        String strM56239b1;
        Bundle arguments = getArguments();
        LeverBorrowRecordChildFragment leverBorrowRecordChildFragment = null;
        if (arguments != null) {
            numValueOf = Integer.valueOf(RouteExKt.m56226Q(arguments, "type", 0));
        } else {
            numValueOf = null;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            strM56239b0 = RouteExKt.m56239b0(arguments2, "coin");
        } else {
            strM56239b0 = null;
        }
        String strM66668h = C27041f.m66668h(strM56239b0);
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            strM56239b1 = RouteExKt.m56239b0(arguments3, "symbol");
        } else {
            strM56239b1 = null;
        }
        String strM66668h2 = C27041f.m66668h(strM56239b1);
        LeverBorrowRecordChildFragment.Companion companion = LeverBorrowRecordChildFragment.f32443i0;
        this.f32457V = companion.newInstance(0, strM66668h, strM66668h2);
        this.f32458W = companion.newInstance(1, strM66668h, strM66668h2);
        if (numValueOf != null && numValueOf.intValue() == 1) {
            RadioGroup radioGroupM37794o3 = m37794o3();
            int i11 = R$id.borrow;
            radioGroupM37794o3.check(i11);
            ((RadioButton) m37794o3().findViewById(R$id.lend)).setTypeface(ResourcesCompat.getFont(m37794o3().getContext(), R$font.semi));
            ((RadioButton) m37794o3().findViewById(i11)).setTypeface(ResourcesCompat.getFont(m37794o3().getContext(), R$font.medium));
            LeverBorrowRecordChildFragment leverBorrowRecordChildFragment2 = this.f32457V;
            if (leverBorrowRecordChildFragment2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("wholeFragment");
                leverBorrowRecordChildFragment2 = null;
            }
            m37795s3(leverBorrowRecordChildFragment2, "0", true);
            LeverBorrowRecordChildFragment leverBorrowRecordChildFragment3 = this.f32458W;
            if (leverBorrowRecordChildFragment3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("isolateFragment");
            } else {
                leverBorrowRecordChildFragment = leverBorrowRecordChildFragment3;
            }
            m37795s3(leverBorrowRecordChildFragment, "1", true);
            return;
        }
        RadioGroup radioGroupM37794o4 = m37794o3();
        int i12 = R$id.lend;
        radioGroupM37794o4.check(i12);
        ((RadioButton) m37794o3().findViewById(i12)).setTypeface(ResourcesCompat.getFont(m37794o3().getContext(), R$font.semi));
        ((RadioButton) m37794o3().findViewById(R$id.borrow)).setTypeface(ResourcesCompat.getFont(m37794o3().getContext(), R$font.medium));
        LeverBorrowRecordChildFragment leverBorrowRecordChildFragment4 = this.f32458W;
        if (leverBorrowRecordChildFragment4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("isolateFragment");
            leverBorrowRecordChildFragment4 = null;
        }
        m37795s3(leverBorrowRecordChildFragment4, "1", true);
        LeverBorrowRecordChildFragment leverBorrowRecordChildFragment5 = this.f32457V;
        if (leverBorrowRecordChildFragment5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("wholeFragment");
        } else {
            leverBorrowRecordChildFragment = leverBorrowRecordChildFragment5;
        }
        m37795s3(leverBorrowRecordChildFragment, "0", true);
    }

    /* JADX INFO: renamed from: u3 */
    public static final RadioGroup m37788u3(LeverBorrowRecordPayingFragment leverBorrowRecordPayingFragment) {
        View viewInflate = LayoutInflater.from(leverBorrowRecordPayingFragment.getActivity()).inflate(R$layout.bloan_title_lever_market, (ViewGroup) null);
        Intrinsics.checkNotNull(viewInflate, "null cannot be cast to non-null type android.widget.RadioGroup");
        RadioGroup radioGroup = (RadioGroup) viewInflate;
        RadioButton radioButton = (RadioButton) radioGroup.findViewById(R$id.lend);
        RadioButton radioButton2 = (RadioButton) radioGroup.findViewById(R$id.borrow);
        radioButton.setPadding(C27029c.m66603f(leverBorrowRecordPayingFragment, 16), 0, C27029c.m66603f(leverBorrowRecordPayingFragment, 16), 0);
        radioButton2.setPadding(C27029c.m66603f(leverBorrowRecordPayingFragment, 16), 0, C27029c.m66603f(leverBorrowRecordPayingFragment, 16), 0);
        radioButton.setText(R$string.margin_cross);
        radioButton2.setText(R$string.margin_isolated);
        return radioGroup;
    }

    @Nullable
    /* JADX INFO: renamed from: m3 */
    public final TextView m37792m3() {
        C40452c c40452cM37791l3 = m37791l3();
        if (c40452cM37791l3 != null) {
            return c40452cM37791l3.f89773d;
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: n3 */
    public final TextView m37793n3() {
        C40452c c40452cM37791l3 = m37791l3();
        if (c40452cM37791l3 != null) {
            return c40452cM37791l3.f89774e;
        }
        return null;
    }

    @Override // com.kubi.sdk.BaseFragment, com.kubi.sdk.IBackCallback
    public boolean onBackPressed() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
            return true;
        }
        return true;
    }

    /* JADX INFO: renamed from: s3 */
    public final void m37795s3(Fragment fragment, String str, boolean z11) {
        FragmentTransaction fragmentTransactionBeginTransaction = getChildFragmentManager().beginTransaction();
        if (getChildFragmentManager().findFragmentByTag(str) == null) {
            fragmentTransactionBeginTransaction.add(R$id.fragment, fragment, str);
        } else {
            fragment.setUserVisibleHint(true);
            fragmentTransactionBeginTransaction.show(fragment);
        }
        List<Fragment> fragments = getChildFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
        ArrayList<Fragment> arrayList = new ArrayList();
        for (Object obj : fragments) {
            if (!Intrinsics.areEqual((Fragment) obj, fragment)) {
                arrayList.add(obj);
            }
        }
        for (Fragment fragment2 : arrayList) {
            fragment2.setUserVisibleHint(false);
            fragmentTransactionBeginTransaction.hide(fragment2);
        }
        if (z11) {
            fragmentTransactionBeginTransaction.commitNowAllowingStateLoss();
        } else {
            fragmentTransactionBeginTransaction.commitAllowingStateLoss();
        }
    }
}
