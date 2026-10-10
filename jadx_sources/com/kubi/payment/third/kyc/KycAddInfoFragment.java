package com.kubi.payment.third.kyc;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$string;
import com.kubi.otc.service.OtcDepend;
import com.kubi.payment.third.base.BaseThirdFragment;
import com.kubi.payment.third.data.entities.ThirdKycInfo;
import com.kubi.payment.third.data.entities.ThirdKycItem;
import com.kubi.payment.third.kyc.view.AKycBaseView;
import com.kubi.payment.third.kyc.view.KycChooseDateView;
import com.kubi.payment.third.kyc.view.KycChooseView;
import com.kubi.payment.third.kyc.view.KycIdCardView;
import com.kubi.payment.third.kyc.view.KycInputEditText;
import com.kubi.payment.third.kyc.view.SubmitView;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p270ft.C37611e;
import p852kotlin.Function;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.IntIterator;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.IntRange;
import p852kotlin.ranges.RangesKt;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: KycAddInfoFragment.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0014J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0014J\"\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u00142\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\u000b\u001a\u0004\u0018\u00010\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/payment/third/kyc/KycAddInfoFragment;", "Lcom/kubi/payment/third/base/BaseThirdFragment;", "Lcom/kubi/payment/third/kyc/KycAddInfoViewModel;", "<init>", "()V", "kycInfo", "Lcom/kubi/payment/third/data/entities/ThirdKycInfo;", "getKycInfo", "()Lcom/kubi/payment/third/data/entities/ThirdKycInfo;", "kycInfo$delegate", "Lkotlin/Lazy;", "binding", "Lcom/kubi/otc/databinding/BotcFragmentAddKycinfoBinding;", "getBinding", "()Lcom/kubi/otc/databinding/BotcFragmentAddKycinfoBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "viewModelClass", "Lkotlin/reflect/KClass;", "getLayout", "", "initViews", "", "observeData", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKycAddInfoFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KycAddInfoFragment.kt\ncom/kubi/payment/third/kyc/KycAddInfoFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 ViewExt.kt\ncom/kubi/utils/extensions/core/ViewExtKt\n*L\n1#1,98:1\n147#2,16:99\n1878#3,3:115\n1549#3:119\n1620#3,3:120\n1869#3,2:123\n372#4:118\n*S KotlinDebug\n*F\n+ 1 KycAddInfoFragment.kt\ncom/kubi/payment/third/kyc/KycAddInfoFragment\n*L\n27#1:99,16\n42#1:115,3\n93#1:119\n93#1:120,3\n93#1:123,2\n93#1:118\n*E\n"})
public final class KycAddInfoFragment extends BaseThirdFragment<KycAddInfoViewModel> {

    /* JADX INFO: renamed from: X */
    public static final /* synthetic */ KProperty<Object>[] f40229X = {Reflection.property1(new PropertyReference1Impl(KycAddInfoFragment.class, "binding", "getBinding()Lcom/kubi/otc/databinding/BotcFragmentAddKycinfoBinding;", 0))};

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f40230V = LazyKt.lazy(new Function0() { // from class: com.kubi.payment.third.kyc.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return KycAddInfoFragment.m49558A3(this.f40235b);
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public final InterfaceC24293a f40231W = C45681e.m100799e(this, new Function1<KycAddInfoFragment, C37611e>() { // from class: com.kubi.payment.third.kyc.KycAddInfoFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37611e invoke(@NotNull KycAddInfoFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37611e.m84803a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C37611e, Unit>() { // from class: com.kubi.payment.third.kyc.KycAddInfoFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C37611e it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37611e c37611e) {
            invoke(c37611e);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: com.kubi.payment.third.kyc.KycAddInfoFragment$a */
    /* JADX INFO: compiled from: KycAddInfoFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21394a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f40232b;

        public C21394a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f40232b = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p852kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f40232b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f40232b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z3 */
    public static final Unit m49563z3(KycAddInfoFragment kycAddInfoFragment, Map it) {
        Intrinsics.checkNotNullParameter(it, "it");
        KycAddInfoViewModel kycAddInfoViewModel = (KycAddInfoViewModel) kycAddInfoFragment.m45631m3();
        ThirdKycInfo thirdKycInfoM49565y3 = kycAddInfoFragment.m49565y3();
        Map<String, String> extraParams = thirdKycInfoM49565y3 != null ? thirdKycInfoM49565y3.getExtraParams() : null;
        if (extraParams == null) {
            extraParams = MapsKt.emptyMap();
        }
        kycAddInfoViewModel.m49572x(MapsKt.plus(it, extraParams));
        return Unit.INSTANCE;
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.botc_fragment_add_kycinfo;
    }

    @Override // com.kubi.payment.base.BaseFragment
    @NotNull
    /* JADX INFO: renamed from: s3 */
    public KClass<KycAddInfoViewModel> mo45635s3() {
        return Reflection.getOrCreateKotlinClass(KycAddInfoViewModel.class);
    }

    /* JADX INFO: renamed from: x3 */
    public final C37611e m49564x3() {
        return (C37611e) this.f40231W.getValue(this, f40229X[0]);
    }

    /* JADX INFO: renamed from: y3 */
    public final ThirdKycInfo m49565y3() {
        return (ThirdKycInfo) this.f40230V.getValue();
    }

    /* JADX INFO: renamed from: A3 */
    public static final ThirdKycInfo m49558A3(KycAddInfoFragment kycAddInfoFragment) {
        Bundle arguments = kycAddInfoFragment.getArguments();
        if (arguments != null) {
            return (ThirdKycInfo) arguments.getParcelable("data");
        }
        return null;
    }

    /* JADX INFO: renamed from: B3 */
    public static final Unit m49559B3(KycAddInfoFragment kycAddInfoFragment, Boolean bool) {
        FragmentActivity activity = kycAddInfoFragment.getActivity();
        if (activity != null) {
            activity.setResult(-1);
        }
        kycAddInfoFragment.preformBackPressed();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.kubi.payment.base.BaseFragment
    /* JADX INFO: renamed from: n3 */
    public void mo45632n3() {
        List<ThirdKycItem> items;
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        KycIdCardView kycIdCardView;
        KycInputEditText kycInputEditText;
        KycChooseDateView kycChooseDateView;
        KycChooseView kycChooseView;
        getNavigationBar().setMainTitle(getString(R$string.otc_kyc_info));
        Context mContext = this.mContext;
        Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
        SubmitView submitView = new SubmitView(mContext);
        ThirdKycInfo thirdKycInfoM49565y3 = m49565y3();
        if (thirdKycInfoM49565y3 != null && (items = thirdKycInfoM49565y3.getItems()) != null) {
            Iterator<T> it = items.iterator();
            int i11 = 0;
            while (true) {
                List<ThirdKycItem> listEmptyList = null;
                aKycBaseView = null;
                aKycBaseView = null;
                aKycBaseView = null;
                aKycBaseView = null;
                aKycBaseView = null;
                AKycBaseView aKycBaseView = null;
                if (it.hasNext()) {
                    Object next = it.next();
                    int i12 = i11 + 1;
                    if (i11 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    ThirdKycItem thirdKycItem = (ThirdKycItem) next;
                    String type = thirdKycItem.getType();
                    if (type != null) {
                        switch (type.hashCode()) {
                            case -1200716976:
                                if (type.equals(ThirdKycItem.TYPE_PICTURE_DATA)) {
                                    Context mContext2 = this.mContext;
                                    Intrinsics.checkNotNullExpressionValue(mContext2, "mContext");
                                    kycIdCardView = new KycIdCardView(mContext2);
                                    kycIdCardView.m49587d(thirdKycItem, i11, this);
                                }
                                break;
                            case 886306529:
                                if (type.equals(ThirdKycItem.TYPE_STRING_INPUT)) {
                                    Context mContext3 = this.mContext;
                                    Intrinsics.checkNotNullExpressionValue(mContext3, "mContext");
                                    kycInputEditText = new KycInputEditText(mContext3);
                                    kycInputEditText.setItemView(thirdKycItem);
                                }
                                break;
                            case 1235250624:
                                if (type.equals(ThirdKycItem.TYPE_DATE_SELECTION)) {
                                    Context mContext4 = this.mContext;
                                    Intrinsics.checkNotNullExpressionValue(mContext4, "mContext");
                                    kycChooseDateView = new KycChooseDateView(mContext4);
                                    FragmentManager childFragmentManager = getChildFragmentManager();
                                    Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                                    kycChooseDateView.mo49580e(thirdKycItem, childFragmentManager);
                                }
                                break;
                            case 1583260963:
                                if (type.equals(ThirdKycItem.TYPE_STRING_SELECTION)) {
                                    Context mContext5 = this.mContext;
                                    Intrinsics.checkNotNullExpressionValue(mContext5, "mContext");
                                    kycChooseView = new KycChooseView(mContext5);
                                    FragmentManager childFragmentManager2 = getChildFragmentManager();
                                    Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "getChildFragmentManager(...)");
                                    kycChooseView.mo49580e(thirdKycItem, childFragmentManager2);
                                }
                                break;
                        }
                    }
                    if (aKycBaseView != null) {
                        aKycBaseView.setRefreshStatus(submitView);
                        C37611e c37611eM49564x3 = m49564x3();
                        if (c37611eM49564x3 == null || (linearLayout2 = c37611eM49564x3.f83826b) == null) {
                            aKycBaseView = kycIdCardView;
                            aKycBaseView = kycInputEditText;
                            aKycBaseView = kycChooseDateView;
                            aKycBaseView = kycChooseView;
                        } else {
                            aKycBaseView = kycIdCardView;
                            aKycBaseView = kycInputEditText;
                            aKycBaseView = kycChooseDateView;
                            aKycBaseView = kycChooseView;
                            linearLayout2.addView(aKycBaseView);
                        }
                    } else {
                        aKycBaseView = kycIdCardView;
                        aKycBaseView = kycInputEditText;
                        aKycBaseView = kycChooseDateView;
                        aKycBaseView = kycChooseView;
                    }
                    i11 = i12;
                } else {
                    C37611e c37611eM49564x4 = m49564x3();
                    if (c37611eM49564x4 != null && (linearLayout = c37611eM49564x4.f83826b) != null) {
                        ThirdKycInfo thirdKycInfoM49565y4 = m49565y3();
                        if (thirdKycInfoM49565y4 != null) {
                            listEmptyList = thirdKycInfoM49565y4.getItems();
                        }
                        if (listEmptyList == null) {
                            listEmptyList = CollectionsKt.emptyList();
                        }
                        submitView.m49596e(listEmptyList, new Function1() { // from class: com.kubi.payment.third.kyc.b
                            @Override // p852kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return KycAddInfoFragment.m49563z3(this.f40236b, (Map) obj);
                            }
                        });
                        linearLayout.addView(submitView);
                        return;
                    }
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.payment.base.BaseFragment
    /* JADX INFO: renamed from: o3 */
    public void mo45633o3() {
        super.mo45633o3();
        ((KycAddInfoViewModel) m45631m3()).m49571w().observe(getViewLifecycleOwner(), new C21394a(new Function1() { // from class: com.kubi.payment.third.kyc.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KycAddInfoFragment.m49559B3(this.f40237b, (Boolean) obj);
            }
        }));
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        LinearLayout linearLayout;
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == -1 && data != null) {
            String strM45468q = OtcDepend.f38138a.m45468q(data);
            C37611e c37611eM49564x3 = m49564x3();
            if (c37611eM49564x3 != null && (linearLayout = c37611eM49564x3.f83826b) != null) {
                IntRange intRangeUntil = RangesKt.until(0, linearLayout.getChildCount());
                ArrayList<View> arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
                Iterator<Integer> it = intRangeUntil.iterator();
                while (it.hasNext()) {
                    arrayList.add(linearLayout.getChildAt(((IntIterator) it).nextInt()));
                }
                for (View view : arrayList) {
                    if (view instanceof KycIdCardView) {
                        ((KycIdCardView) view).m49588e(strM45468q, requestCode);
                    }
                }
            }
        }
    }
}
