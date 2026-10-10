package com.sumsub.sns.internal.core.presentation.screen.base;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewbinding.ViewBinding;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.core.presentation.base.AbstractC28058F;
import com.sumsub.sns.core.presentation.base.AbstractC28081V;
import com.sumsub.sns.core.presentation.base.AbstractC28133l;
import com.sumsub.sns.internal.core.common.AbstractC28503w;
import com.sumsub.sns.internal.core.common.C28497u;
import com.sumsub.sns.internal.core.presentation.screen.base.InterfaceC28920d;
import com.sumsub.sns.internal.core.presentation.screen.navigation.C28945b;
import com.sumsub.sns.internal.core.presentation.screen.navigation.C28947d;
import com.sumsub.sns.internal.core.presentation.screen.navigation.C28949f;
import com.sumsub.sns.internal.core.presentation.screen.navigation.C28951h;
import com.sumsub.sns.internal.core.presentation.screen.navigation.C28954k;
import com.sumsub.sns.internal.core.presentation.screen.navigation.InterfaceC28952i;
import com.sumsub.sns.internal.features.presentation.intro.C31157j;
import com.sumsub.sns.internal.features.presentation.verification2.code.C32759o;
import com.sumsub.sns.internal.features.presentation.verification2.email.C32785g;
import com.sumsub.sns.internal.features.presentation.verification2.phone.C32866k;
import com.sumsub.sns.internal.features.presentation.verification2.status.C32888g;
import com.sumsub.sns.internal.log.AbstractC33294e;
import com.sumsub.sns.internal.log.C33272c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Pair;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.IntIterator;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.IntRange;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.screen.base.l */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\u0012\b\u0001\u0010\u0006*\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00050\u0004*\u000e\b\u0002\u0010\t*\b\u0012\u0004\u0012\u00020\b0\u00072\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\nB\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m90084d2 = {"Lcom/sumsub/sns/internal/core/presentation/screen/base/l;", "Landroidx/viewbinding/ViewBinding;", "TViewBinding", "Lcom/sumsub/sns/core/presentation/base/V;", "Lcom/sumsub/sns/internal/core/presentation/screen/base/d;", "Lcom/sumsub/sns/internal/core/presentation/screen/navigation/i;", "TViewState", "Lcom/sumsub/sns/core/presentation/base/C;", "Lcom/sumsub/sns/core/presentation/base/s;", "TViewModel", "Lcom/sumsub/sns/core/presentation/base/F;", "<init>", "()V", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nScreenStackHostFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScreenStackHostFragment.kt\ncom/sumsub/sns/internal/core/presentation/screen/base/ScreenStackHostFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 FragmentManager.kt\nandroidx/fragment/app/FragmentManagerKt\n*L\n1#1,104:1\n1563#2:105\n1634#2,3:106\n1563#2:109\n1634#2,3:110\n967#2,7:113\n54#3,8:120\n32#3,8:128\n*S KotlinDebug\n*F\n+ 1 ScreenStackHostFragment.kt\ncom/sumsub/sns/internal/core/presentation/screen/base/ScreenStackHostFragment\n*L\n49#1:105\n49#1:106,3\n52#1:109\n52#1:110,3\n59#1:113,7\n81#1:120,8\n89#1:128,8\n*E\n"})
public abstract class AbstractC28928l<TViewBinding extends ViewBinding, TViewState extends AbstractC28081V & InterfaceC28920d, TViewModel extends AbstractC28052C> extends AbstractC28058F<TViewBinding, TViewState, TViewModel> {
    /* JADX INFO: renamed from: a */
    public static AbstractC28133l m69698a(InterfaceC28952i interfaceC28952i) {
        if (Intrinsics.areEqual(interfaceC28952i, C28947d.f58850a)) {
            return new C32785g();
        }
        if (Intrinsics.areEqual(interfaceC28952i, C28951h.f58855a)) {
            return new C32866k();
        }
        if (interfaceC28952i instanceof C28945b) {
            C32759o c32759o = new C32759o();
            Bundle bundle = new Bundle();
            bundle.putParcelable("otp_screen", (C28945b) interfaceC28952i);
            c32759o.setArguments(bundle);
            return c32759o;
        }
        if (interfaceC28952i instanceof C28954k) {
            C32888g c32888g = new C32888g();
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("result_screen", (C28954k) interfaceC28952i);
            c32888g.setArguments(bundle2);
            return c32888g;
        }
        if (!(interfaceC28952i instanceof C28949f)) {
            throw new NoWhenBranchMatchedException();
        }
        C28949f c28949f = (C28949f) interfaceC28952i;
        C31157j.f62993c.getClass();
        C31157j c31157j = new C31157j();
        Bundle bundle3 = new Bundle();
        bundle3.putString("sns_param_step", c28949f.f58851a);
        bundle3.putString("sns_param_scene", c28949f.f58852b);
        bundle3.putString("sns_param_document_type", c28949f.f58853c);
        bundle3.putString("sns_param_country_code", c28949f.f58854d);
        c31157j.setArguments(bundle3);
        return c31157j;
    }

    /* JADX INFO: renamed from: f */
    public abstract int getF67188b();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.sumsub.sns.core.presentation.base.AbstractC28058F
    public final void handleSuccessState(AbstractC28081V abstractC28081V, Bundle bundle) {
        m69700a(((C28929m) ((InterfaceC28920d) abstractC28081V)).f58817a);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28058F, com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final boolean onFinishCalled(AbstractC28503w abstractC28503w) {
        if (Intrinsics.areEqual(abstractC28503w, C28497u.f58029b)) {
            Fragment fragmentFindFragmentById = getChildFragmentManager().findFragmentById(getF67188b());
            AbstractC28133l abstractC28133l = fragmentFindFragmentById instanceof AbstractC28133l ? (AbstractC28133l) fragmentFindFragmentById : null;
            if (abstractC28133l != null && abstractC28133l.isAdded() && !abstractC28133l.onFinishCalled(abstractC28503w)) {
                return false;
            }
        }
        return super.onFinishCalled(abstractC28503w);
    }

    /* JADX INFO: renamed from: b */
    public static String m69699b(InterfaceC28952i interfaceC28952i) {
        return Reflection.getOrCreateKotlinClass(interfaceC28952i.getClass()).getQualifiedName() + "_" + interfaceC28952i.hashCode();
    }

    /* JADX INFO: renamed from: a */
    public final void m69700a(List list) {
        if (list.isEmpty()) {
            return;
        }
        FragmentManager childFragmentManager = getChildFragmentManager();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m69699b((InterfaceC28952i) it.next()));
        }
        IntRange intRangeUntil = RangesKt.until(0, childFragmentManager.getBackStackEntryCount());
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
        Iterator<Integer> it2 = intRangeUntil.iterator();
        while (it2.hasNext()) {
            arrayList2.add(childFragmentManager.getBackStackEntryAt(((IntIterator) it2).nextInt()).getName());
        }
        List listZip = CollectionsKt.zip(arrayList2, CollectionsKt.drop(arrayList, 1));
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : listZip) {
            Pair pair = (Pair) obj;
            if (!Intrinsics.areEqual((String) pair.component1(), (String) pair.component2())) {
                break;
            } else {
                arrayList3.add(obj);
            }
        }
        int size = arrayList3.size();
        Logger.DefaultImpls.v$default(C33272c.f67812a, AbstractC33294e.m71624a(this), "syncFragmentBackstack: screens=" + list + ", backstack=" + arrayList2 + ", common=" + size, null, 4, null);
        if (childFragmentManager.getBackStackEntryCount() > size) {
            if (size == 0) {
                childFragmentManager.popBackStackImmediate((String) null, 1);
            } else {
                childFragmentManager.popBackStackImmediate((String) arrayList2.get(size - 1), 0);
            }
        }
        if (size == 0) {
            Fragment fragmentFindFragmentById = childFragmentManager.findFragmentById(getF67188b());
            if (!Intrinsics.areEqual(fragmentFindFragmentById != null ? fragmentFindFragmentById.getTag() : null, CollectionsKt.first((List) arrayList))) {
                FragmentTransaction fragmentTransactionBeginTransaction = childFragmentManager.beginTransaction();
                fragmentTransactionBeginTransaction.replace(getF67188b(), m69698a((InterfaceC28952i) CollectionsKt.first(list)), (String) CollectionsKt.first((List) arrayList));
                fragmentTransactionBeginTransaction.commitNowAllowingStateLoss();
            }
        }
        int size2 = list.size();
        for (int i11 = size + 1; i11 < size2; i11++) {
            FragmentTransaction fragmentTransactionBeginTransaction2 = childFragmentManager.beginTransaction();
            fragmentTransactionBeginTransaction2.replace(getF67188b(), m69698a((InterfaceC28952i) list.get(i11)), (String) arrayList.get(i11));
            fragmentTransactionBeginTransaction2.addToBackStack((String) arrayList.get(i11));
            fragmentTransactionBeginTransaction2.commitAllowingStateLoss();
            childFragmentManager.executePendingTransactions();
        }
    }
}
