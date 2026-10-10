package com.sumsub.sns.core.presentation.form;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.activity.result.ActivityResultCaller;
import androidx.activity.result.ActivityResultRegistry;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.R$string;
import com.sumsub.sns.core.presentation.base.AbstractC28118g;
import com.sumsub.sns.core.presentation.base.AbstractC28133l;
import com.sumsub.sns.core.presentation.form.model.AbstractC28178b;
import com.sumsub.sns.core.presentation.form.viewadapter.C28191e;
import com.sumsub.sns.core.presentation.form.viewadapter.C28209n;
import com.sumsub.sns.core.presentation.util.C28241a;
import com.sumsub.sns.internal.core.common.AbstractC28392F;
import com.sumsub.sns.internal.core.common.AbstractC28400J;
import com.sumsub.sns.internal.core.common.AbstractC28421U;
import com.sumsub.sns.internal.core.common.AbstractC28441c;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.common.AbstractC28462i0;
import com.sumsub.sns.internal.core.common.AbstractC28485q;
import com.sumsub.sns.internal.core.common.C28404L;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.presentation.android.C28710y;
import com.sumsub.sns.internal.core.presentation.form.C28799f;
import com.sumsub.sns.internal.core.presentation.form.C28801h;
import com.sumsub.sns.internal.core.presentation.form.C28803j;
import com.sumsub.sns.internal.core.presentation.form.FieldId;
import com.sumsub.sns.internal.core.presentation.form.InterfaceC28797d;
import com.sumsub.sns.internal.core.presentation.form.InterfaceC28804k;
import com.sumsub.sns.internal.core.presentation.form.InterfaceC28805l;
import com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0;
import com.sumsub.sns.internal.core.presentation.form.model.AbstractC28842f;
import com.sumsub.sns.internal.core.presentation.form.model.AbstractC28845g0;
import com.sumsub.sns.internal.core.presentation.form.model.AbstractC28849i0;
import com.sumsub.sns.internal.core.presentation.form.model.C28809C;
import com.sumsub.sns.internal.core.presentation.form.model.C28811E;
import com.sumsub.sns.internal.core.presentation.form.model.C28813G;
import com.sumsub.sns.internal.core.presentation.form.model.C28815I;
import com.sumsub.sns.internal.core.presentation.form.model.C28817K;
import com.sumsub.sns.internal.core.presentation.form.model.C28819M;
import com.sumsub.sns.internal.core.presentation.form.model.C28821O;
import com.sumsub.sns.internal.core.presentation.form.model.C28823Q;
import com.sumsub.sns.internal.core.presentation.form.model.C28825T;
import com.sumsub.sns.internal.core.presentation.form.model.C28827V;
import com.sumsub.sns.internal.core.presentation.form.model.C28829X;
import com.sumsub.sns.internal.core.presentation.form.model.C28831Z;
import com.sumsub.sns.internal.core.presentation.form.model.C28835b0;
import com.sumsub.sns.internal.core.presentation.form.model.C28839d0;
import com.sumsub.sns.internal.core.presentation.form.model.C28840e;
import com.sumsub.sns.internal.core.presentation.form.model.C28846h;
import com.sumsub.sns.internal.core.presentation.form.model.C28847h0;
import com.sumsub.sns.internal.core.presentation.form.model.C28854l;
import com.sumsub.sns.internal.core.presentation.form.model.C28857o;
import com.sumsub.sns.internal.core.presentation.form.model.C28859q;
import com.sumsub.sns.internal.core.presentation.form.model.C28861s;
import com.sumsub.sns.internal.core.presentation.form.model.C28863u;
import com.sumsub.sns.internal.core.presentation.form.model.C28865w;
import com.sumsub.sns.internal.core.presentation.form.model.C28867y;
import com.sumsub.sns.internal.core.presentation.form.model.FieldError;
import com.sumsub.sns.internal.core.presentation.widget.autocompletePhone.util.AbstractC28974a;
import com.sumsub.sns.internal.features.data.model.common.remote.C29389j0;
import com.sumsub.sns.internal.features.data.model.common.remote.C29405l0;
import com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel;
import com.sumsub.sns.internal.log.C33272c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.flow.InterfaceC41678w;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;
import ug0.C45236a;
import xg0.AbstractC46162a;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.form.f */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m90084d2 = {"Lcom/sumsub/sns/core/presentation/form/f;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "com/sumsub/sns/core/presentation/form/b", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFormFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FormFragment.kt\ncom/sumsub/sns/core/presentation/form/FormFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 BundleExtensions.kt\ncom/sumsub/sns/internal/core/common/BundleExtensionsKt\n+ 5 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n+ 6 Json.kt\nkotlinx/serialization/json/Json\n*L\n1#1,569:1\n360#2,7:570\n1563#2:581\n1634#2,3:582\n1374#2:585\n1460#2,5:586\n774#2:591\n865#2,2:592\n1869#2,2:594\n774#2:596\n865#2,2:597\n1#3:577\n30#4:578\n32#5,2:579\n96#6:599\n*S KotlinDebug\n*F\n+ 1 FormFragment.kt\ncom/sumsub/sns/core/presentation/form/FormFragment\n*L\n221#1:570,7\n354#1:581\n354#1:582,3\n379#1:585\n379#1:586,5\n391#1:591\n391#1:592,2\n395#1:594,2\n401#1:596\n401#1:597,2\n257#1:578\n329#1:579,2\n527#1:599\n*E\n"})
public final class C28169f extends Fragment {

    /* JADX INFO: renamed from: a */
    public C28801h f57422a;

    /* JADX INFO: renamed from: d */
    public C28209n f57425d;

    /* JADX INFO: renamed from: e */
    public C28710y f57426e;

    /* JADX INFO: renamed from: g */
    public boolean f57428g;

    /* JADX INFO: renamed from: k */
    public boolean f57432k;

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ KProperty[] f57421p = {AbstractC28118g.m69077a(C28169f.class, "tvTitle", "getTvTitle()Landroid/widget/TextView;", 0), AbstractC28118g.m69077a(C28169f.class, "tvSubtitle", "getTvSubtitle()Landroid/widget/TextView;", 0)};

    /* JADX INFO: renamed from: o */
    public static final C28165b f57420o = new C28165b();

    /* JADX INFO: renamed from: b */
    public final C28404L f57423b = new C28404L(R$id.sns_title);

    /* JADX INFO: renamed from: c */
    public final C28404L f57424c = new C28404L(R$id.sns_subtitle);

    /* JADX INFO: renamed from: f */
    public final C28241a f57427f = new C28241a();

    /* JADX INFO: renamed from: h */
    public List f57429h = CollectionsKt.emptyList();

    /* JADX INFO: renamed from: i */
    public Map f57430i = MapsKt.emptyMap();

    /* JADX INFO: renamed from: j */
    public final Lazy f57431j = LazyKt.lazy(new Function0() { // from class: com.sumsub.sns.core.presentation.form.i
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C28169f.m69100a(this.f57436b);
        }
    });

    /* JADX INFO: renamed from: l */
    public final C28167d f57433l = new C28167d(this);

    /* JADX INFO: renamed from: m */
    public final ViewTreeObserver.OnPreDrawListener f57434m = new ViewTreeObserver.OnPreDrawListener() { // from class: com.sumsub.sns.core.presentation.form.j
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            return C28169f.m69105b(this.f57437b);
        }
    };

    /* JADX INFO: renamed from: n */
    public final C28166c f57435n = new C28166c(this);

    /* JADX INFO: renamed from: a */
    public final InterfaceC28804k m69106a() {
        InterfaceC28804k interfaceC28804kMo69614a;
        ActivityResultCaller parentFragment = getParentFragment();
        InterfaceC28797d interfaceC28797d = parentFragment instanceof InterfaceC28797d ? (InterfaceC28797d) parentFragment : null;
        if (interfaceC28797d != null && (interfaceC28804kMo69614a = interfaceC28797d.mo69614a()) != null) {
            return interfaceC28804kMo69614a;
        }
        KeyEventDispatcher.Component activity = getActivity();
        InterfaceC28797d interfaceC28797d2 = activity instanceof InterfaceC28797d ? (InterfaceC28797d) activity : null;
        if (interfaceC28797d2 != null) {
            return interfaceC28797d2.mo69614a();
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final RecyclerView m69112b() {
        View view = getView();
        if (view != null) {
            return (RecyclerView) view.findViewById(R$id.sns_list);
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m69105b(C28169f c28169f) {
        RecyclerView recyclerViewM69112b;
        if (!c28169f.f57428g && (recyclerViewM69112b = c28169f.m69112b()) != null) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerViewM69112b.getLayoutManager();
            RecyclerView.Adapter adapter = recyclerViewM69112b.getAdapter();
            int itemCount = adapter != null ? adapter.getItemCount() : 0;
            if (itemCount != 0 && RangesKt.coerceAtMost(linearLayoutManager.findLastCompletelyVisibleItemPosition() + 1, itemCount) >= itemCount) {
                Logger.DefaultImpls.v$default(C33272c.f67812a, c28169f.m69113c(), "onScrollStateChanged: LAST", null, 4, null);
                c28169f.f57428g = true;
                InterfaceC28804k interfaceC28804kM69106a = c28169f.m69106a();
                if (interfaceC28804kM69106a != null) {
                    interfaceC28804kM69106a.mo69616a();
                }
            }
        }
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Logger.DefaultImpls.v$default(C33272c.f67812a, m69113c(), "onCreateView", null, 4, null);
        return layoutInflater.inflate(R$layout.sns_form_fragment, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        Logger.DefaultImpls.v$default(C33272c.f67812a, m69113c(), "onDestroy", null, 4, null);
        C28710y c28710y = this.f57426e;
        if (c28710y != null) {
            getLifecycle().removeObserver(c28710y);
            this.f57426e = null;
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        ViewTreeObserver viewTreeObserver;
        Logger.DefaultImpls.v$default(C33272c.f67812a, m69113c(), "onDestroyView", null, 4, null);
        RecyclerView recyclerViewM69112b = m69112b();
        if (recyclerViewM69112b != null && (viewTreeObserver = recyclerViewM69112b.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnPreDrawListener(this.f57434m);
        }
        RecyclerView recyclerViewM69112b2 = m69112b();
        if (recyclerViewM69112b2 != null) {
            recyclerViewM69112b2.setAdapter(null);
        }
        this.f57425d = null;
        this.f57422a = null;
        super.onDestroyView();
    }

    /* JADX INFO: renamed from: a */
    public static final InterfaceC28805l m69100a(C28169f c28169f) {
        InterfaceC28804k interfaceC28804kM69106a = c28169f.m69106a();
        if (interfaceC28804kM69106a != null) {
            return interfaceC28804kM69106a.mo69622b();
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final String m69113c() {
        String string;
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("client_tag")) == null) {
            string = "_";
        }
        return string + "::FormFragment";
    }

    /* JADX INFO: renamed from: d */
    public final void m69114d() {
        InterfaceC41678w interfaceC41678wMo69624d;
        C28799f c28799f;
        C28801h c28801h;
        Object obj;
        InterfaceC28804k interfaceC28804kM69106a = m69106a();
        if (interfaceC28804kM69106a != null && (interfaceC41678wMo69624d = interfaceC28804kM69106a.mo69624d()) != null && (c28799f = (C28799f) interfaceC41678wMo69624d.getValue()) != null && (c28801h = (C28801h) CollectionsKt.getOrNull(c28799f.f58567b, c28799f.f58566a)) != null) {
            List list = c28801h.f58573d;
            ArrayList arrayList = new ArrayList();
            String str = c28801h.f58571b;
            if (str != null) {
                arrayList.add(new C28839d0(str, ""));
            }
            String str2 = c28801h.f58572c;
            if (str2 != null) {
                arrayList.add(new C28829X(str2, ""));
            }
            arrayList.addAll(list);
            List listM69107a = m69107a(arrayList);
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM69107a, 10));
            ArrayList arrayList3 = (ArrayList) listM69107a;
            int size = arrayList3.size();
            int i11 = 0;
            int i12 = 0;
            while (i12 < size) {
                Object obj2 = arrayList3.get(i12);
                i12++;
                AbstractC28841e0 abstractC28841e0M69657a = (AbstractC28841e0) obj2;
                String str3 = (String) this.f57430i.get(AbstractC28178b.m69118a(abstractC28841e0M69657a));
                if (str3 != null) {
                    Logger.DefaultImpls.v$default(C33272c.f67812a, m69113c(), "field with error " + abstractC28841e0M69657a.m69653j(), null, 4, null);
                    abstractC28841e0M69657a = AbstractC28845g0.m69657a(abstractC28841e0M69657a, str3);
                }
                arrayList2.add(abstractC28841e0M69657a);
            }
            this.f57429h = arrayList2;
            if (C28468k0.f57988f) {
                int size2 = arrayList2.size();
                do {
                    if (i11 < size2) {
                        obj = arrayList2.get(i11);
                        i11++;
                    } else {
                        obj = null;
                        break;
                    }
                } while (!(((AbstractC28841e0) obj) instanceof C28821O));
                AbstractC28841e0 abstractC28841e0 = (AbstractC28841e0) obj;
                if (abstractC28841e0 != null) {
                    Logger.DefaultImpls.v$default(C33272c.f67812a, m69113c(), "phone field error=" + ((Object) abstractC28841e0.mo69641b()), null, 4, null);
                }
            }
            Logger.DefaultImpls.v$default(C33272c.f67812a, m69113c(), "visible " + arrayList2.size() + " items", null, 4, null);
            C28209n c28209n = this.f57425d;
            if (c28209n != null) {
                DiffUtil.DiffResult diffResultCalculateDiff = DiffUtil.calculateDiff(c28209n.mo69071a(c28209n.f57292a, arrayList2));
                c28209n.f57292a.clear();
                c28209n.f57292a.addAll(arrayList2);
                diffResultCalculateDiff.dispatchUpdatesTo(c28209n);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:96:0x0156  */
    /* JADX INFO: renamed from: e */
    public final boolean m69115e() {
        InterfaceC28804k interfaceC28804kM69106a;
        InterfaceC41678w interfaceC41678wMo69624d;
        C28799f c28799f;
        C28803j c28803j;
        RecyclerView recyclerViewM69112b;
        String strM69120a;
        if (m69112b() == null || (interfaceC28804kM69106a = m69106a()) == null || (interfaceC41678wMo69624d = interfaceC28804kM69106a.mo69624d()) == null || (c28799f = (C28799f) interfaceC41678wMo69624d.getValue()) == null || (c28803j = c28799f.f58569d) == null) {
            return false;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        AbstractC28841e0 abstractC28841e0 = null;
        for (AbstractC28841e0 abstractC28841e1 : this.f57429h) {
            if (!AbstractC28178b.m69122a(abstractC28841e1, this.f57433l)) {
                if (abstractC28841e0 == null) {
                    abstractC28841e0 = abstractC28841e1;
                }
                Logger.DefaultImpls.v$default(C33272c.f67812a, m69113c(), "failed check for " + abstractC28841e1.m69653j(), null, 4, null);
                C28167d c28167d = this.f57433l;
                if (!(abstractC28841e1 instanceof C28831Z) && !(abstractC28841e1 instanceof C28835b0) && !(abstractC28841e1 instanceof C28854l) && !(abstractC28841e1 instanceof C28861s) && !(abstractC28841e1 instanceof C28863u) && !(abstractC28841e1 instanceof C28859q) && !(abstractC28841e1 instanceof C28827V)) {
                    if (abstractC28841e1 instanceof C28821O) {
                        C28821O c28821o = (C28821O) abstractC28841e1;
                        String strM69098a = c28167d.m69098a(AbstractC28178b.m69119a(c28821o));
                        String strM69098a2 = c28167d.m69098a(abstractC28841e1);
                        if (strM69098a2 == null) {
                            strM69098a2 = "";
                        }
                        C29405l0.Companion.getClass();
                        FieldError fieldErrorM69660a = AbstractC28849i0.m69660a(c28821o.f58617e, C29389j0.m69854a(strM69098a, strM69098a2));
                        if (fieldErrorM69660a == null && !AbstractC28974a.m69714a(strM69098a2)) {
                            strM69120a = AbstractC28178b.m69120a(FieldError.NOT_VALID, c28803j);
                        } else if (fieldErrorM69660a != null) {
                            strM69120a = AbstractC28178b.m69120a(fieldErrorM69660a, c28803j);
                        } else {
                            strM69120a = null;
                        }
                    } else if (!(abstractC28841e1 instanceof C28819M) && !(abstractC28841e1 instanceof C28825T) && !(abstractC28841e1 instanceof C28857o)) {
                        if (abstractC28841e1 instanceof C28809C) {
                            C28809C c28809c = (C28809C) abstractC28841e1;
                            String strM69098a3 = c28167d.m69098a(c28809c);
                            if (Intrinsics.areEqual(c28809c.f58578d.f59470e, Boolean.TRUE) && strM69098a3 == null) {
                                strM69120a = AbstractC28178b.m69120a(FieldError.REQUIRED, c28803j);
                            } else {
                                strM69120a = null;
                            }
                        } else {
                            if (abstractC28841e1 instanceof C28817K) {
                                if (!AbstractC28178b.m69121a((C28817K) abstractC28841e1, c28167d)) {
                                    strM69120a = AbstractC28178b.m69120a(FieldError.REQUIRED, c28803j);
                                }
                            } else if (!(abstractC28841e1 instanceof C28865w) && !(abstractC28841e1 instanceof C28811E) && !(abstractC28841e1 instanceof C28823Q) && !(abstractC28841e1 instanceof C28829X) && !(abstractC28841e1 instanceof C28813G) && !(abstractC28841e1 instanceof C28867y) && !(abstractC28841e1 instanceof C28839d0) && !(abstractC28841e1 instanceof C28846h) && !(abstractC28841e1 instanceof C28815I)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            strM69120a = null;
                        }
                    } else {
                        String strM69120a2 = AbstractC28178b.m69120a(FieldError.REQUIRED, c28803j);
                        if (!AbstractC28178b.m69122a(abstractC28841e1, c28167d)) {
                            strM69120a = strM69120a2;
                        } else {
                            strM69120a = null;
                        }
                    }
                } else {
                    FieldError fieldErrorM69660a2 = AbstractC28849i0.m69660a(abstractC28841e1.mo69642c(), c28167d.m69098a(abstractC28841e1));
                    if (fieldErrorM69660a2 != null) {
                        strM69120a = AbstractC28178b.m69120a(fieldErrorM69660a2, c28803j);
                    } else {
                        strM69120a = null;
                    }
                }
                if (strM69120a != null) {
                    linkedHashMap.put(AbstractC28178b.m69118a(abstractC28841e1), strM69120a);
                }
            }
        }
        this.f57430i = linkedHashMap;
        if (abstractC28841e0 != null) {
            m69114d();
            Iterator it = this.f57429h.iterator();
            final int i11 = 0;
            while (true) {
                if (it.hasNext()) {
                    if (Intrinsics.areEqual(AbstractC28178b.m69118a((AbstractC28841e0) it.next()), AbstractC28178b.m69118a(abstractC28841e0))) {
                        break;
                    }
                    i11++;
                } else {
                    i11 = -1;
                    break;
                }
            }
            Logger.DefaultImpls.v$default(C33272c.f67812a, m69113c(), "validateForm: scroll to " + i11 + " position", null, 4, null);
            if (i11 >= 0 && (recyclerViewM69112b = m69112b()) != null) {
                recyclerViewM69112b.post(new Runnable() { // from class: com.sumsub.sns.core.presentation.form.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        C28169f.m69103a(this.f57439b, i11);
                    }
                });
            }
            return false;
        }
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f57427f.m69188a(bundle);
        if (bundle != null) {
            m69110a((String) null, bundle);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        RecyclerView.LayoutManager layoutManager;
        String str;
        super.onSaveInstanceState(bundle);
        String str2 = this.f57427f.f57537a;
        Parcelable parcelableOnSaveInstanceState = null;
        if (str2 == null) {
            str2 = null;
        }
        bundle.putString("fragment_unique_id", str2);
        C28710y c28710y = this.f57426e;
        if (c28710y != null && (str = c28710y.f58390h) != null) {
            bundle.putString("OBSERVER_ITEM_ID", str);
        }
        RecyclerView recyclerViewM69112b = m69112b();
        if (recyclerViewM69112b != null && (layoutManager = recyclerViewM69112b.getLayoutManager()) != null) {
            parcelableOnSaveInstanceState = layoutManager.onSaveInstanceState();
        }
        bundle.putParcelable("SCROLL_STATE", parcelableOnSaveInstanceState);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String strM69333a;
        InterfaceC41678w interfaceC41678wMo69624d;
        ViewTreeObserver viewTreeObserver;
        super.onViewCreated(view, bundle);
        if (bundle != null) {
            bundle.setClassLoader(requireContext().getClassLoader());
        }
        RecyclerView recyclerViewM69112b = m69112b();
        if (recyclerViewM69112b != null) {
            new LinearLayoutManager(recyclerViewM69112b.getContext());
            recyclerViewM69112b.setLayoutManager(new LinearLayoutManager(recyclerViewM69112b.getContext()));
            C28209n c28209n = new C28209n(this.f57433l);
            C28166c c28166c = this.f57435n;
            c28209n.f57493c = null;
            if (c28166c != null) {
                c28209n.f57493c = new C28191e(c28166c);
            }
            this.f57425d = c28209n;
            recyclerViewM69112b.setAdapter(c28209n);
            RecyclerView.ItemAnimator itemAnimator = recyclerViewM69112b.getItemAnimator();
            if (itemAnimator != null) {
                itemAnimator.setChangeDuration(100L);
            }
            RecyclerView.ItemAnimator itemAnimator2 = recyclerViewM69112b.getItemAnimator();
            if (itemAnimator2 != null) {
                itemAnimator2.setAddDuration(100L);
            }
            RecyclerView.ItemAnimator itemAnimator3 = recyclerViewM69112b.getItemAnimator();
            if (itemAnimator3 != null) {
                itemAnimator3.setRemoveDuration(100L);
            }
            RecyclerView.ItemAnimator itemAnimator4 = recyclerViewM69112b.getItemAnimator();
            if (itemAnimator4 != null) {
                itemAnimator4.setMoveDuration(100L);
            }
            RecyclerView recyclerViewM69112b2 = m69112b();
            if (recyclerViewM69112b2 != null && (viewTreeObserver = recyclerViewM69112b2.getViewTreeObserver()) != null) {
                viewTreeObserver.addOnPreDrawListener(this.f57434m);
            }
        }
        C33272c c33272c = C33272c.f67812a;
        String strM69113c = m69113c();
        InterfaceC28804k interfaceC28804kM69106a = m69106a();
        if (interfaceC28804kM69106a != null) {
            strM69333a = AbstractC28458h.m69333a(interfaceC28804kM69106a);
        } else {
            strM69333a = null;
        }
        Logger.DefaultImpls.v$default(c33272c, strM69113c, "onViewCreated: viewModel=" + strM69333a, null, 4, null);
        InterfaceC28804k interfaceC28804kM69106a2 = m69106a();
        if (interfaceC28804kM69106a2 != null && (interfaceC41678wMo69624d = interfaceC28804kM69106a2.mo69624d()) != null) {
            AbstractC28421U.m69305b(interfaceC41678wMo69624d, getViewLifecycleOwner(), new C28168e(this, bundle, null));
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m69103a(C28169f c28169f, int i11) {
        RecyclerView recyclerViewM69112b = c28169f.m69112b();
        if (recyclerViewM69112b != null) {
            recyclerViewM69112b.scrollToPosition(i11);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m69110a(String str, Bundle bundle) {
        String f66531c;
        String string;
        if (this.f57426e != null) {
            return;
        }
        ActivityResultRegistry activityResultRegistry = requireActivity().getActivityResultRegistry();
        String str2 = this.f57427f.f57537a;
        if (str2 == null) {
            str2 = null;
        }
        if (str == null) {
            str = getString(R$string.sns_questionnaire_mime_types);
        }
        String[] strArrM69321a = AbstractC28441c.m69321a(str);
        Function2 function2 = new Function2() { // from class: com.sumsub.sns.core.presentation.form.k
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return C28169f.m69102a(this.f57438b, (String) obj, (Uri) obj2);
            }
        };
        Bundle arguments = getArguments();
        if (arguments == null || (f66531c = arguments.getString(LanguageSelectionViewModel.ARG_ID_DOC_SET_TYPE)) == null) {
            Fragment parentFragment = getParentFragment();
            AbstractC28133l abstractC28133l = parentFragment instanceof AbstractC28133l ? (AbstractC28133l) parentFragment : null;
            f66531c = abstractC28133l != null ? abstractC28133l.getF66531c() : "TYPE_UNKNOWN";
        }
        C28710y c28710y = new C28710y(activityResultRegistry, str2, strArrM69321a, function2, f66531c);
        if (bundle != null && (string = bundle.getString("OBSERVER_ITEM_ID")) != null) {
            c28710y.f58390h = string;
        }
        getLifecycle().addObserver(c28710y);
        this.f57426e = c28710y;
    }

    /* JADX INFO: renamed from: b */
    public static final Unit m69104b(C28169f c28169f, String str) {
        AbstractC28392F.m69277a(c28169f, str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m69102a(C28169f c28169f, String str, Uri uri) {
        c28169f.m69109a(str, uri);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public final void m69111a(List list, int i11) {
        String strTrimIndent;
        List list2;
        C28801h c28801h = (C28801h) CollectionsKt.getOrNull(list, i11);
        Spanned spannedM69364a = null;
        Logger.DefaultImpls.v$default(C33272c.f67812a, m69113c(), "showPage: " + i11 + " has " + ((c28801h == null || (list2 = c28801h.f58573d) == null) ? null : Integer.valueOf(list2.size())) + " items", null, 4, null);
        if (list.isEmpty() || c28801h == null) {
            return;
        }
        C28404L c28404l = this.f57423b;
        KProperty[] kPropertyArr = f57421p;
        TextView textView = (TextView) c28404l.getValue(this, kPropertyArr[0]);
        if (textView != null) {
            String str = c28801h.f58571b;
            AbstractC28458h.m69341a(textView, str != null ? AbstractC28462i0.m69364a(str, requireContext()) : null);
        }
        TextView textView2 = (TextView) this.f57424c.getValue(this, kPropertyArr[1]);
        if (textView2 != null) {
            String str2 = c28801h.f58572c;
            if (str2 != null && (strTrimIndent = StringsKt.trimIndent(str2)) != null) {
                spannedM69364a = AbstractC28462i0.m69364a(strTrimIndent, requireContext());
            }
            AbstractC28458h.m69341a(textView2, spannedM69364a);
        }
        TextView textView3 = (TextView) this.f57423b.getValue(this, kPropertyArr[0]);
        if (textView3 != null) {
            AbstractC28485q.m69381a(textView3, new Function1() { // from class: com.sumsub.sns.core.presentation.form.m
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C28169f.m69101a(this.f57441b, (String) obj);
                }
            });
        }
        TextView textView4 = (TextView) this.f57424c.getValue(this, kPropertyArr[1]);
        if (textView4 != null) {
            AbstractC28485q.m69381a(textView4, new Function1() { // from class: com.sumsub.sns.core.presentation.form.n
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C28169f.m69104b(this.f57443b, (String) obj);
                }
            });
        }
        m69108a(c28801h);
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m69101a(C28169f c28169f, String str) {
        AbstractC28392F.m69277a(c28169f, str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public final void m69108a(C28801h c28801h) {
        List listMo69646g;
        if (Intrinsics.areEqual(this.f57422a, c28801h)) {
            Logger.DefaultImpls.v$default(C33272c.f67812a, m69113c(), "skipping page update", null, 4, null);
            return;
        }
        if (isAdded()) {
            Logger.DefaultImpls.v$default(C33272c.f67812a, m69113c(), "creating views for page " + c28801h.f58570a, null, 4, null);
            this.f57432k = true;
            this.f57430i = MapsKt.emptyMap();
            m69114d();
            for (AbstractC28841e0 abstractC28841e0 : this.f57429h) {
                if (C28468k0.f57988f) {
                    C33272c c33272c = C33272c.f67812a;
                    Logger.DefaultImpls.v$default(c33272c, m69113c(), "showing view for " + abstractC28841e0.m69653j(), null, 4, null);
                    String strMo69644f = abstractC28841e0.mo69644f();
                    List list = strMo69644f;
                    if (strMo69644f == null && ((listMo69646g = abstractC28841e0.mo69646g()) == null || listMo69646g.isEmpty())) {
                        list = listMo69646g;
                        list = null;
                    }
                    if (list != null) {
                        Logger.DefaultImpls.v$default(c33272c, m69113c(), "initial value for " + abstractC28841e0.m69653j() + " = " + list, null, 4, null);
                    }
                }
            }
            this.f57432k = false;
            this.f57422a = c28801h;
        }
    }

    /* JADX INFO: renamed from: a */
    public final List m69107a(ArrayList arrayList) {
        InterfaceC41678w interfaceC41678wMo69624d;
        C28799f c28799f;
        List list;
        InterfaceC28804k interfaceC28804kM69106a = m69106a();
        if (interfaceC28804kM69106a == null || (interfaceC41678wMo69624d = interfaceC28804kM69106a.mo69624d()) == null || (c28799f = (C28799f) interfaceC41678wMo69624d.getValue()) == null || (list = c28799f.f58567b) == null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList2, ((C28801h) it.next()).f58573d);
        }
        C28847h0 c28847h0 = AbstractC28842f.f58669a;
        C28840e c28840eM69654a = AbstractC28842f.m69654a(arrayList2, (InterfaceC28805l) this.f57431j.getValue());
        LinkedHashSet linkedHashSet = c28840eM69654a.f58664a;
        LinkedHashSet linkedHashSet2 = c28840eM69654a.f58665b;
        if (!linkedHashSet.isEmpty()) {
            Logger.DefaultImpls.v$default(C33272c.f67812a, m69113c(), "hidden sections: " + linkedHashSet.size(), null, 4, null);
        }
        if (C28468k0.f57988f) {
            ArrayList arrayList3 = new ArrayList();
            int size = arrayList.size();
            int i11 = 0;
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                if (linkedHashSet2.contains(AbstractC28178b.m69118a((AbstractC28841e0) obj))) {
                    arrayList3.add(obj);
                }
            }
            Logger.DefaultImpls.v$default(C33272c.f67812a, m69113c(), "hidden items: " + arrayList3.size(), null, 4, null);
            int size2 = arrayList3.size();
            while (i11 < size2) {
                Object obj2 = arrayList3.get(i11);
                i11++;
                Logger.DefaultImpls.v$default(C33272c.f67812a, m69113c(), "hidden " + ((AbstractC28841e0) obj2), null, 4, null);
            }
        }
        List mutableList = CollectionsKt.toMutableList((Collection) arrayList);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : mutableList) {
            AbstractC28841e0 abstractC28841e0 = (AbstractC28841e0) obj3;
            boolean z11 = abstractC28841e0 instanceof C28823Q;
            if ((z11 && !linkedHashSet.contains(((C28823Q) abstractC28841e0).f58626e)) || (!z11 && !linkedHashSet2.contains(AbstractC28178b.m69118a(abstractC28841e0)))) {
                arrayList4.add(obj3);
            }
        }
        return arrayList4;
    }

    /* JADX INFO: renamed from: a */
    public final void m69109a(String str, Uri uri) {
        Logger.DefaultImpls.v$default(C33272c.f67812a, m69113c(), "handleFilePickResult: " + str + " -> " + uri, null, 4, null);
        if (uri == null) {
            return;
        }
        try {
            AbstractC46162a abstractC46162aM69286a = AbstractC28400J.m69286a(C28468k0.f57988f);
            abstractC46162aM69286a.getSerializersModule();
            if (((FieldId) abstractC46162aM69286a.mo99408a(C45236a.m99969u(FieldId.Companion.serializer()), str)) == null || m69106a() == null) {
                return;
            }
            requireContext();
            CollectionsKt.listOf(uri);
        } catch (Throwable unused) {
        }
    }
}
