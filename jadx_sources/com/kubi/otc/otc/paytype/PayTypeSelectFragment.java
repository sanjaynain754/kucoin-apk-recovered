package com.kubi.otc.otc.paytype;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.KeyboardUtils;
import com.kubi.otc.R$layout;
import com.kubi.otc.entity.PayTypeEntity;
import com.kubi.otc.view.IndexBar;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.ClearEditText;
import com.kubi.sdk.base.p113ui.OldBaseFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.BiConsumer;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import mt.C42620e0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p011a9.C0206f;
import p270ft.C37597b0;
import p491o8.C42989b;
import p752x8.AbstractC46099a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;
import w00.C45681e;

/* JADX INFO: compiled from: PayTypeSelectFragment.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000I\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0013\u001a\u00020\u0014H\u0014J\u001a\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0017J\u001a\u0010\u001b\u001a\u00020\u001c*\b\u0012\u0004\u0012\u00020\u001d0\u00052\u0006\u0010\u001e\u001a\u00020\u001dH\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001d\u0010\r\u001a\u0004\u0018\u00010\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/otc/otc/paytype/PayTypeSelectFragment;", "Lcom/kubi/sdk/base/ui/OldBaseFragment;", "<init>", "()V", "mList", "", "Lcom/kubi/otc/entity/PayTypeEntity;", "mAdapter", "com/kubi/otc/otc/paytype/PayTypeSelectFragment$mAdapter$2$1", "getMAdapter", "()Lcom/kubi/otc/otc/paytype/PayTypeSelectFragment$mAdapter$2$1;", "mAdapter$delegate", "Lkotlin/Lazy;", "binding", "Lcom/kubi/otc/databinding/BotcFragmentPaytypeSelectBinding;", "getBinding", "()Lcom/kubi/otc/databinding/BotcFragmentPaytypeSelectBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "getLayout", "", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "containsIgnoreCase", "", "", TypedValues.Custom.S_STRING, "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPayTypeSelectFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PayTypeSelectFragment.kt\ncom/kubi/otc/otc/paytype/PayTypeSelectFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,136:1\n147#2,16:137\n1669#3,8:153\n774#3:161\n865#3,2:162\n1563#3:164\n1634#3,3:165\n1869#3,2:168\n1869#3,2:170\n865#3,2:172\n*S KotlinDebug\n*F\n+ 1 PayTypeSelectFragment.kt\ncom/kubi/otc/otc/paytype/PayTypeSelectFragment\n*L\n67#1:137,16\n81#1:153,8\n82#1:161\n82#1:162,2\n83#1:164\n83#1:165,3\n108#1:168,2\n131#1:170,2\n120#1:172,2\n*E\n"})
public final class PayTypeSelectFragment extends OldBaseFragment {

    /* JADX INFO: renamed from: X */
    public static final /* synthetic */ KProperty<Object>[] f37863X = {Reflection.property1(new PropertyReference1Impl(PayTypeSelectFragment.class, "binding", "getBinding()Lcom/kubi/otc/databinding/BotcFragmentPaytypeSelectBinding;", 0))};

    /* JADX INFO: renamed from: U */
    @NotNull
    public List<PayTypeEntity> f37864U = CollectionsKt.emptyList();

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f37865V = LazyKt.lazy(new Function0() { // from class: com.kubi.otc.otc.paytype.n
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PayTypeSelectFragment.m45019v3(this.f38010b);
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public final InterfaceC24293a f37866W = C45681e.m100799e(this, new Function1<PayTypeSelectFragment, C37597b0>() { // from class: com.kubi.otc.otc.paytype.PayTypeSelectFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37597b0 invoke(@NotNull PayTypeSelectFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37597b0.m84778a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C37597b0, Unit>() { // from class: com.kubi.otc.otc.paytype.PayTypeSelectFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C37597b0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37597b0 c37597b0) {
            invoke(c37597b0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: com.kubi.otc.otc.paytype.PayTypeSelectFragment$a */
    /* JADX INFO: compiled from: PayTypeSelectFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016¨\u0006\t"}, m90084d2 = {"com/kubi/otc/otc/paytype/PayTypeSelectFragment$onViewCreated$5", "Lcom/kubi/otc/view/IndexBar$IndexBarListener;", "onPress", "", "pos", "", "index", "", "onRelease", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nPayTypeSelectFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PayTypeSelectFragment.kt\ncom/kubi/otc/otc/paytype/PayTypeSelectFragment$onViewCreated$5\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,136:1\n360#2,7:137\n*S KotlinDebug\n*F\n+ 1 PayTypeSelectFragment.kt\ncom/kubi/otc/otc/paytype/PayTypeSelectFragment$onViewCreated$5\n*L\n89#1:137,7\n*E\n"})
    public static final class C20094a implements IndexBar.InterfaceC20287a {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ LinearLayoutManager f37868b;

        public C20094a(LinearLayoutManager linearLayoutManager) {
            this.f37868b = linearLayoutManager;
        }

        @Override // com.kubi.otc.view.IndexBar.InterfaceC20287a
        /* JADX INFO: renamed from: a */
        public void mo45027a(int i11, String index) {
            BaseTextView baseTextView;
            BaseTextView baseTextView2;
            Intrinsics.checkNotNullParameter(index, "index");
            C37597b0 c37597b0M45025t3 = PayTypeSelectFragment.this.m45025t3();
            if (c37597b0M45025t3 != null && (baseTextView2 = c37597b0M45025t3.f83622f) != null) {
                C27046k.m66685H(baseTextView2);
            }
            C37597b0 c37597b0M45025t4 = PayTypeSelectFragment.this.m45025t3();
            if (c37597b0M45025t4 != null && (baseTextView = c37597b0M45025t4.f83622f) != null) {
                baseTextView.setText(index);
            }
            LinearLayoutManager linearLayoutManager = this.f37868b;
            Iterator it = PayTypeSelectFragment.this.f37864U.iterator();
            int i12 = 0;
            while (it.hasNext()) {
                if (Intrinsics.areEqual(((PayTypeEntity) it.next()).getTitle(), index)) {
                    linearLayoutManager.scrollToPositionWithOffset(i12, 0);
                }
                i12++;
            }
            i12 = -1;
            linearLayoutManager.scrollToPositionWithOffset(i12, 0);
        }

        @Override // com.kubi.otc.view.IndexBar.InterfaceC20287a
        public void onRelease() {
            BaseTextView baseTextView;
            C37597b0 c37597b0M45025t3 = PayTypeSelectFragment.this.m45025t3();
            if (c37597b0M45025t3 == null || (baseTextView = c37597b0M45025t3.f83622f) == null) {
                return;
            }
            C27046k.m66700o(baseTextView);
        }
    }

    /* JADX INFO: renamed from: v3 */
    public static final PayTypeSelectFragment$mAdapter$2$1 m45019v3(PayTypeSelectFragment payTypeSelectFragment) {
        return new PayTypeSelectFragment$mAdapter$2$1(payTypeSelectFragment, R$layout.botc_item_paytype_select);
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.botc_fragment_paytype_select;
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    @SuppressLint({"ClickableViewAccessibility"})
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        ClearEditText clearEditText;
        List listSplit$default;
        RecyclerView recyclerView;
        BaseTextView baseTextView;
        IndexBar indexBar;
        IndexBar indexBar2;
        Window window;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        FragmentActivity activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            window.setSoftInputMode(32);
        }
        C20143e.m45238d(this, new BiConsumer() { // from class: com.kubi.otc.otc.paytype.i
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj, Object obj2) {
                PayTypeSelectFragment.m45022y3(this.f37993b, (Boolean) obj, (List) obj2);
            }
        });
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.mContext);
        C37597b0 c37597b0M45025t3 = m45025t3();
        if (c37597b0M45025t3 != null && (indexBar2 = c37597b0M45025t3.f83619c) != null) {
            List<PayTypeEntity> list = this.f37864U;
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (hashSet.add(((PayTypeEntity) obj).getTitle())) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (!((PayTypeEntity) obj2).m103797isCommonlyUsed()) {
                    arrayList2.add(obj2);
                }
            }
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(((PayTypeEntity) it.next()).getTitle());
            }
            indexBar2.setIndexList(arrayList3);
        }
        C37597b0 c37597b0M45025t4 = m45025t3();
        if (c37597b0M45025t4 != null && (indexBar = c37597b0M45025t4.f83619c) != null) {
            indexBar.setListener(new C20094a(linearLayoutManager));
        }
        C37597b0 c37597b0M45025t5 = m45025t3();
        if (c37597b0M45025t5 != null && (baseTextView = c37597b0M45025t5.f83621e) != null) {
            C27046k.m66711z(baseTextView, 0L, new Function0() { // from class: com.kubi.otc.otc.paytype.j
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PayTypeSelectFragment.m45023z3(this.f37997b);
                }
            }, 1, null);
        }
        Context mContext = this.mContext;
        Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
        final C42620e0 c42620e0 = new C42620e0(mContext, this.f37864U);
        C37597b0 c37597b0M45025t6 = m45025t3();
        if (c37597b0M45025t6 != null && (recyclerView = c37597b0M45025t6.f83620d) != null) {
            recyclerView.setAdapter(m45026u3());
            recyclerView.setLayoutManager(linearLayoutManager);
            recyclerView.setOnTouchListener(new View.OnTouchListener() { // from class: com.kubi.otc.otc.paytype.k
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    return PayTypeSelectFragment.m45010A3(this.f38001b, view2, motionEvent);
                }
            });
        }
        for (PayTypeEntity payTypeEntity : this.f37864U) {
            String strM94422e = C42989b.m94422e(payTypeEntity.getShowTypeName(), ",");
            payTypeEntity.setNameLetter((strM94422e == null || (listSplit$default = StringsKt.split$default((CharSequence) strM94422e, new String[]{","}, false, 0, 6, (Object) null)) == null) ? null : CollectionsKt.toList(listSplit$default));
        }
        C37597b0 c37597b0M45025t7 = m45025t3();
        if (c37597b0M45025t7 == null || (clearEditText = c37597b0M45025t7.f83618b) == null) {
            return;
        }
        AbstractC46099a<CharSequence> abstractC46099aM784d = C0206f.m784d(clearEditText);
        final Function1 function1 = new Function1() { // from class: com.kubi.otc.otc.paytype.l
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                return PayTypeSelectFragment.m45020w3(this.f38003b, c42620e0, (CharSequence) obj3);
            }
        };
        Disposable disposableSubscribe = abstractC46099aM784d.subscribe(new Consumer() { // from class: com.kubi.otc.otc.paytype.m
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj3) {
                PayTypeSelectFragment.m45021x3(function1, obj3);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, getDestroyDisposable());
    }

    /* JADX INFO: renamed from: t3 */
    public final C37597b0 m45025t3() {
        return (C37597b0) this.f37866W.getValue(this, f37863X[0]);
    }

    /* JADX INFO: renamed from: u3 */
    public final PayTypeSelectFragment$mAdapter$2$1 m45026u3() {
        return (PayTypeSelectFragment$mAdapter$2$1) this.f37865V.getValue();
    }

    /* JADX INFO: renamed from: A3 */
    public static final boolean m45010A3(PayTypeSelectFragment payTypeSelectFragment, View view, MotionEvent motionEvent) {
        KeyboardUtils.m6033e(payTypeSelectFragment.requireActivity());
        return false;
    }

    /* JADX INFO: renamed from: w3 */
    public static final Unit m45020w3(PayTypeSelectFragment payTypeSelectFragment, C42620e0 c42620e0, CharSequence charSequence) {
        List<PayTypeEntity> list;
        RecyclerView recyclerView;
        IndexBar indexBar;
        RecyclerView recyclerView2;
        IndexBar indexBar2;
        PayTypeSelectFragment$mAdapter$2$1 payTypeSelectFragment$mAdapter$2$1M45026u3 = payTypeSelectFragment.m45026u3();
        Intrinsics.checkNotNull(charSequence);
        if (charSequence.length() == 0) {
            C37597b0 c37597b0M45025t3 = payTypeSelectFragment.m45025t3();
            if (c37597b0M45025t3 != null && (indexBar2 = c37597b0M45025t3.f83619c) != null) {
                C27046k.m66685H(indexBar2);
            }
            C37597b0 c37597b0M45025t4 = payTypeSelectFragment.m45025t3();
            if (c37597b0M45025t4 != null && (recyclerView2 = c37597b0M45025t4.f83620d) != null) {
                recyclerView2.addItemDecoration(c42620e0);
            }
            list = payTypeSelectFragment.f37864U;
        } else {
            C37597b0 c37597b0M45025t5 = payTypeSelectFragment.m45025t3();
            if (c37597b0M45025t5 != null && (indexBar = c37597b0M45025t5.f83619c) != null) {
                C27046k.m66700o(indexBar);
            }
            C37597b0 c37597b0M45025t6 = payTypeSelectFragment.m45025t3();
            if (c37597b0M45025t6 != null && (recyclerView = c37597b0M45025t6.f83620d) != null) {
                recyclerView.removeItemDecoration(c42620e0);
            }
            List<PayTypeEntity> list2 = payTypeSelectFragment.f37864U;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list2) {
                PayTypeEntity payTypeEntity = (PayTypeEntity) obj;
                String showTypeName = payTypeEntity.getShowTypeName();
                Locale ROOT = Locale.ROOT;
                Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
                String lowerCase = showTypeName.toLowerCase(ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                String string = charSequence.toString();
                Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
                String lowerCase2 = string.toLowerCase(ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                Boolean boolValueOf = null;
                if (!C27025c.m66566d(Boolean.valueOf(StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) lowerCase2, false, 2, (Object) null)))) {
                    List<String> nameLetter = payTypeEntity.getNameLetter();
                    if (nameLetter != null) {
                        boolValueOf = Boolean.valueOf(payTypeSelectFragment.m45024s3(nameLetter, charSequence.toString()));
                    }
                    if (C27025c.m66566d(boolValueOf)) {
                    }
                }
                arrayList.add(obj);
            }
            list = arrayList;
        }
        payTypeSelectFragment$mAdapter$2$1M45026u3.replaceData(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x3 */
    public static final void m45021x3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: y3 */
    public static final void m45022y3(PayTypeSelectFragment payTypeSelectFragment, Boolean bool, List list) {
        Intrinsics.checkNotNull(list);
        payTypeSelectFragment.f37864U = list;
    }

    /* JADX INFO: renamed from: z3 */
    public static final Unit m45023z3(PayTypeSelectFragment payTypeSelectFragment) {
        payTypeSelectFragment.preformBackPressed();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s3 */
    public final boolean m45024s3(List<String> list, String str) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (StringsKt.equals((String) it.next(), str, true)) {
                return true;
            }
        }
        return false;
    }
}
