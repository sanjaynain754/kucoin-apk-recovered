package com.kubi.kucoin;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.KeyboardUtils;
import com.kubi.kucoin.ChoosePhoneAreaActivity;
import com.kubi.kucoin.data.AreaCodeModel;
import com.kubi.kucoin.data.AreaCodeViewModel;
import com.kubi.kucoin.data.platform.model.CountryEntity;
import com.kubi.resources.widget.AlertTipsTextView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.ClearEditText;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.loading.WrapperLoadingView;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import java.util.List;
import java.util.concurrent.TimeUnit;
import ma.C42495a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p011a9.C0206f;
import p694vk.C45577j0;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45678b;

/* JADX INFO: compiled from: ChoosePhoneAreaActivity.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0014J\b\u0010-\u001a\u00020*H\u0003J\b\u0010.\u001a\u00020*H\u0002J\u0018\u0010/\u001a\u00020\u00152\u0006\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\u0005J\u0012\u00103\u001a\u00020\u00152\b\u00100\u001a\u0004\u0018\u000101H\u0016R#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR#\u0010\u000b\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\f\u0010\bR\u001d\u0010\u000e\u001a\u0004\u0018\u00010\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\n\u001a\u0004\b\u0014\u0010\u0016R#\u0010\u0018\u001a\n \u0006*\u0004\u0018\u00010\u00190\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\n\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\n\u001a\u0004\b\u001f\u0010 R\u001b\u0010\"\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\n\u001a\u0004\b$\u0010%R\u000e\u0010'\u001a\u00020(X\u0082.¢\u0006\u0002\n\u0000¨\u00064"}, m90084d2 = {"Lcom/kubi/kucoin/ChoosePhoneAreaActivity;", "Lcom/kubi/sdk/BaseActivity;", "<init>", "()V", "emptyView", "Landroid/view/View;", "kotlin.jvm.PlatformType", "getEmptyView", "()Landroid/view/View;", "emptyView$delegate", "Lkotlin/Lazy;", "searchEmptyView", "getSearchEmptyView", "searchEmptyView$delegate", "busercenterActivityChooseAreaBinding", "Lcom/kubi/app/country/databinding/BusercenterActivityChooseAreaBinding;", "getBusercenterActivityChooseAreaBinding", "()Lcom/kubi/app/country/databinding/BusercenterActivityChooseAreaBinding;", "busercenterActivityChooseAreaBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "isFromAsset", "", "()Z", "isFromAsset$delegate", "loadingView", "Lcom/kubi/sdk/widget/loading/WrapperLoadingView;", "getLoadingView", "()Lcom/kubi/sdk/widget/loading/WrapperLoadingView;", "loadingView$delegate", "viewModel", "Lcom/kubi/kucoin/data/AreaCodeViewModel;", "getViewModel", "()Lcom/kubi/kucoin/data/AreaCodeViewModel;", "viewModel$delegate", "adapter", "Lcom/kubi/kucoin/AreaCodeListAdapter;", "getAdapter", "()Lcom/kubi/kucoin/AreaCodeListAdapter;", "adapter$delegate", "fromWhereType", "Lcom/kubi/kucoin/SceneCode;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "initViews", "initObserves", "tryHiddenSoftInput", "ev", "Landroid/view/MotionEvent;", "currentFocus", "dispatchTouchEvent", "LAppCountry_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nChoosePhoneAreaActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChoosePhoneAreaActivity.kt\ncom/kubi/kucoin/ChoosePhoneAreaActivity\n+ 2 ActivityViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ActivityViewBindings\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,245:1\n45#2,19:246\n1#3:265\n*S KotlinDebug\n*F\n+ 1 ChoosePhoneAreaActivity.kt\ncom/kubi/kucoin/ChoosePhoneAreaActivity\n*L\n60#1:246,19\n*E\n"})
public final class ChoosePhoneAreaActivity extends BaseActivity {

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ KProperty<Object>[] f27583q = {Reflection.property1(new PropertyReference1Impl(ChoosePhoneAreaActivity.class, "busercenterActivityChooseAreaBinding", "getBusercenterActivityChooseAreaBinding()Lcom/kubi/app/country/databinding/BusercenterActivityChooseAreaBinding;", 0))};

    /* JADX INFO: renamed from: i */
    @NotNull
    public final Lazy f27584i = LazyKt.lazy(new Function0() { // from class: vk.v
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ChoosePhoneAreaActivity.m31895i0(this.f102717b);
        }
    });

    /* JADX INFO: renamed from: j */
    @NotNull
    public final Lazy f27585j = LazyKt.lazy(new Function0() { // from class: vk.a0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ChoosePhoneAreaActivity.m31878C0(this.f102663b);
        }
    });

    /* JADX INFO: renamed from: k */
    @NotNull
    public final InterfaceC24293a f27586k = C45678b.m100788b(this, new Function1<C42495a, Unit>() { // from class: com.kubi.kucoin.ChoosePhoneAreaActivity$special$$inlined$viewBindingActivity$default$1
        public final void invoke(@NotNull C42495a it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C42495a c42495a) {
            invoke(c42495a);
            return Unit.INSTANCE;
        }
    }, new Function1<ChoosePhoneAreaActivity, C42495a>() { // from class: com.kubi.kucoin.ChoosePhoneAreaActivity$special$$inlined$viewBindingActivity$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C42495a invoke(@NotNull ChoosePhoneAreaActivity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            return C42495a.m93179a(C45678b.m100787a(activity));
        }
    });

    /* JADX INFO: renamed from: l */
    @NotNull
    public final Lazy f27587l = LazyKt.lazy(new Function0() { // from class: vk.b0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(ChoosePhoneAreaActivity.m31876A0(this.f102664b));
        }
    });

    /* JADX INFO: renamed from: m */
    @NotNull
    public final Lazy f27588m = LazyKt.lazy(new Function0() { // from class: vk.c0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ChoosePhoneAreaActivity.m31877B0(this.f102665b);
        }
    });

    /* JADX INFO: renamed from: n */
    @NotNull
    public final Lazy f27589n = LazyKt.lazy(new Function0() { // from class: vk.d0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ChoosePhoneAreaActivity.m31879F0(this.f102666b);
        }
    });

    /* JADX INFO: renamed from: o */
    @NotNull
    public final Lazy f27590o = LazyKt.lazy(new Function0() { // from class: vk.e0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ChoosePhoneAreaActivity.m31894h0();
        }
    });

    /* JADX INFO: renamed from: p */
    public SceneCode f27591p;

    /* JADX INFO: renamed from: F0 */
    public static final AreaCodeViewModel m31879F0(ChoosePhoneAreaActivity choosePhoneAreaActivity) {
        return (AreaCodeViewModel) new ViewModelProvider(choosePhoneAreaActivity).get(AreaCodeViewModel.class);
    }

    /* JADX INFO: renamed from: h0 */
    public static final AreaCodeListAdapter m31894h0() {
        return new AreaCodeListAdapter();
    }

    /* JADX INFO: renamed from: l0 */
    private final View m31896l0() {
        return (View) this.f27584i.getValue();
    }

    /* JADX INFO: renamed from: m0 */
    private final WrapperLoadingView m31897m0() {
        return (WrapperLoadingView) this.f27588m.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t0 */
    public static final void m31902t0(ChoosePhoneAreaActivity choosePhoneAreaActivity, BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            Object item = baseQuickAdapter.getItem(i11);
            Intrinsics.checkNotNull(item, "null cannot be cast to non-null type com.kubi.kucoin.data.AreaCodeModel");
            objM103844constructorimpl = Result.m103844constructorimpl((AreaCodeModel) item);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = null;
        }
        AreaCodeModel areaCodeModel = (AreaCodeModel) objM103844constructorimpl;
        if (areaCodeModel == null || areaCodeModel.isHeader || ((CountryEntity) areaCodeModel.f86727t).isDismissed()) {
            return;
        }
        if (choosePhoneAreaActivity.m31913z0()) {
            Intent intent = new Intent();
            intent.putExtra("data", ((CountryEntity) areaCodeModel.f86727t).getDisplayMobileCode());
            intent.putExtra("data_1", ((CountryEntity) areaCodeModel.f86727t).getIco());
            intent.putExtra("data_2", ((CountryEntity) areaCodeModel.f86727t).getMobileCode());
            choosePhoneAreaActivity.setResult(-1, intent);
        } else {
            choosePhoneAreaActivity.setResult(-1, new Intent().putExtra("data", (Parcelable) areaCodeModel.f86727t));
        }
        choosePhoneAreaActivity.finish();
    }

    /* JADX INFO: renamed from: E0 */
    public final boolean m31908E0(@NotNull MotionEvent ev2, @Nullable View view) {
        Intrinsics.checkNotNullParameter(ev2, "ev");
        if (view instanceof EditText) {
            int[] iArr = {0, 0};
            EditText editText = (EditText) view;
            editText.getLocationOnScreen(iArr);
            boolean z11 = ev2.getX() > ((float) iArr[0]) && ev2.getX() < ((float) (iArr[0] + editText.getWidth()));
            boolean z12 = ev2.getY() > ((float) iArr[1]) && ev2.getY() < ((float) (iArr[1] + editText.getHeight()));
            if (!z11 || !z12) {
                KeyboardUtils.m6034f(view);
                return true;
            }
        }
        return false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(@Nullable MotionEvent ev2) {
        if (ev2 != null && ev2.getAction() == 0) {
            m31908E0(ev2, getCurrentFocus());
        }
        return super.dispatchTouchEvent(ev2);
    }

    /* JADX INFO: renamed from: j0 */
    public final AreaCodeListAdapter m31909j0() {
        return (AreaCodeListAdapter) this.f27590o.getValue();
    }

    /* JADX INFO: renamed from: k0 */
    public final C42495a m31910k0() {
        return (C42495a) this.f27586k.getValue(this, f27583q[0]);
    }

    /* JADX INFO: renamed from: n0 */
    public final View m31911n0() {
        return (View) this.f27585j.getValue();
    }

    /* JADX INFO: renamed from: o0 */
    public final AreaCodeViewModel m31912o0() {
        return (AreaCodeViewModel) this.f27589n.getValue();
    }

    /* JADX INFO: renamed from: z0 */
    public final boolean m31913z0() {
        return ((Boolean) this.f27587l.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: A0 */
    public static final boolean m31876A0(ChoosePhoneAreaActivity choosePhoneAreaActivity) {
        Boolean boolM56220K;
        Intent intent = choosePhoneAreaActivity.getIntent();
        if (intent != null) {
            boolM56220K = RouteExKt.m56220K(intent, "isFromAsset");
        } else {
            boolM56220K = null;
        }
        return C27025c.m66566d(boolM56220K);
    }

    /* JADX INFO: renamed from: B0 */
    public static final WrapperLoadingView m31877B0(ChoosePhoneAreaActivity choosePhoneAreaActivity) {
        RecyclerView recyclerView;
        C42495a c42495aM31910k0 = choosePhoneAreaActivity.m31910k0();
        if (c42495aM31910k0 != null) {
            recyclerView = c42495aM31910k0.f94154d;
        } else {
            recyclerView = null;
        }
        return WrapperLoadingView.injectView(recyclerView);
    }

    /* JADX INFO: renamed from: C0 */
    public static final View m31878C0(ChoosePhoneAreaActivity choosePhoneAreaActivity) {
        RecyclerView recyclerView;
        LayoutInflater layoutInflater = choosePhoneAreaActivity.getLayoutInflater();
        int i11 = com.kubi.app.country.R$layout.busercenter_area_code_search_empty;
        C42495a c42495aM31910k0 = choosePhoneAreaActivity.m31910k0();
        if (c42495aM31910k0 != null) {
            recyclerView = c42495aM31910k0.f94154d;
        } else {
            recyclerView = null;
        }
        return layoutInflater.inflate(i11, (ViewGroup) recyclerView, false);
    }

    /* JADX INFO: renamed from: i0 */
    public static final View m31895i0(ChoosePhoneAreaActivity choosePhoneAreaActivity) {
        RecyclerView recyclerView;
        LayoutInflater layoutInflater = choosePhoneAreaActivity.getLayoutInflater();
        int i11 = com.kubi.app.country.R$layout.busercenter_area_code_empty;
        C42495a c42495aM31910k0 = choosePhoneAreaActivity.m31910k0();
        if (c42495aM31910k0 != null) {
            recyclerView = c42495aM31910k0.f94154d;
        } else {
            recyclerView = null;
        }
        return layoutInflater.inflate(i11, (ViewGroup) recyclerView, false);
    }

    /* JADX INFO: renamed from: p0 */
    private final void m31898p0() {
        m31912o0().m31943B().observe(this, new C45577j0(new Function1() { // from class: vk.y
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ChoosePhoneAreaActivity.m31899q0(this.f102720b, (List) obj);
            }
        }));
        m31912o0().m31944C().observe(this, new C45577j0(new Function1() { // from class: vk.z
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ChoosePhoneAreaActivity.m31900r0(this.f102721b, (List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q0 */
    public static final Unit m31899q0(ChoosePhoneAreaActivity choosePhoneAreaActivity, List list) {
        View viewM31911n0;
        AlertTipsTextView alertTipsTextView;
        C42495a c42495aM31910k0 = choosePhoneAreaActivity.m31910k0();
        if (c42495aM31910k0 != null && (alertTipsTextView = c42495aM31910k0.f94156f) != null) {
            ViewExtKt.m66577h(alertTipsTextView);
        }
        choosePhoneAreaActivity.m31897m0().showContent();
        AreaCodeListAdapter areaCodeListAdapterM31909j0 = choosePhoneAreaActivity.m31909j0();
        if (list.isEmpty()) {
            viewM31911n0 = choosePhoneAreaActivity.m31896l0();
        } else {
            viewM31911n0 = choosePhoneAreaActivity.m31911n0();
        }
        areaCodeListAdapterM31909j0.setEmptyView(viewM31911n0);
        choosePhoneAreaActivity.m31909j0().setNewData(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r0 */
    public static final Unit m31900r0(ChoosePhoneAreaActivity choosePhoneAreaActivity, List list) {
        View viewM31896l0;
        AlertTipsTextView alertTipsTextView;
        AreaCodeListAdapter areaCodeListAdapterM31909j0 = choosePhoneAreaActivity.m31909j0();
        if (list.isEmpty()) {
            viewM31896l0 = choosePhoneAreaActivity.m31911n0();
        } else {
            viewM31896l0 = choosePhoneAreaActivity.m31896l0();
        }
        areaCodeListAdapterM31909j0.setEmptyView(viewM31896l0);
        C42495a c42495aM31910k0 = choosePhoneAreaActivity.m31910k0();
        if (c42495aM31910k0 != null && (alertTipsTextView = c42495aM31910k0.f94156f) != null) {
            ViewExtKt.m66577h(alertTipsTextView);
        }
        choosePhoneAreaActivity.m31909j0().setNewData(list);
        return Unit.INSTANCE;
    }

    @SuppressLint({"CheckResult"})
    /* JADX INFO: renamed from: s0 */
    private final void m31901s0() {
        ClearEditText clearEditText;
        RecyclerView recyclerView;
        BaseTextView baseTextView;
        ImageView imageView;
        C42495a c42495aM31910k0 = m31910k0();
        if (c42495aM31910k0 != null && (imageView = c42495aM31910k0.f94153c) != null) {
            C27046k.m66711z(imageView, 0L, new Function0() { // from class: vk.f0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ChoosePhoneAreaActivity.m31905w0(this.f102667b);
                }
            }, 1, null);
        }
        C42495a c42495aM31910k1 = m31910k0();
        if (c42495aM31910k1 != null && (baseTextView = c42495aM31910k1.f94155e) != null) {
            C27046k.m66711z(baseTextView, 0L, new Function0() { // from class: vk.g0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ChoosePhoneAreaActivity.m31906x0(this.f102668b);
                }
            }, 1, null);
        }
        C42495a c42495aM31910k2 = m31910k0();
        if (c42495aM31910k2 != null && (recyclerView = c42495aM31910k2.f94154d) != null) {
            recyclerView.setAdapter(m31909j0());
        }
        m31909j0().setEmptyView(m31896l0());
        View viewFindViewById = m31896l0().findViewById(com.kubi.app.country.R$id.kcBtRetry);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        C27046k.m66711z(viewFindViewById, 0L, new Function0() { // from class: vk.h0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChoosePhoneAreaActivity.m31907y0(this.f102669b);
            }
        }, 1, null);
        m31909j0().setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() { // from class: vk.i0
            @Override // io.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                ChoosePhoneAreaActivity.m31902t0(this.f102670a, baseQuickAdapter, view, i11);
            }
        });
        C42495a c42495aM31910k3 = m31910k0();
        if (c42495aM31910k3 != null) {
            clearEditText = c42495aM31910k3.f94152b;
        } else {
            clearEditText = null;
        }
        Intrinsics.checkNotNull(clearEditText, "null cannot be cast to non-null type android.widget.EditText");
        Observable<CharSequence> observableObserveOn = C0206f.m784d(clearEditText).debounce(300L, TimeUnit.MILLISECONDS).observeOn(AndroidSchedulers.mainThread());
        final Function1 function1 = new Function1() { // from class: vk.w
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ChoosePhoneAreaActivity.m31903u0(this.f102718b, (CharSequence) obj);
            }
        };
        observableObserveOn.subscribe(new Consumer() { // from class: vk.x
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ChoosePhoneAreaActivity.m31904v0(function1, obj);
            }
        });
        m31897m0().showLoading();
    }

    /* JADX INFO: renamed from: u0 */
    public static final Unit m31903u0(ChoosePhoneAreaActivity choosePhoneAreaActivity, CharSequence charSequence) {
        choosePhoneAreaActivity.m31912o0().m31946F(charSequence.toString());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v0 */
    public static final void m31904v0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: w0 */
    public static final Unit m31905w0(ChoosePhoneAreaActivity choosePhoneAreaActivity) {
        choosePhoneAreaActivity.preformBackPressed();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x0 */
    public static final Unit m31906x0(ChoosePhoneAreaActivity choosePhoneAreaActivity) {
        choosePhoneAreaActivity.preformBackPressed();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y0 */
    public static final Unit m31907y0(ChoosePhoneAreaActivity choosePhoneAreaActivity) {
        choosePhoneAreaActivity.m31897m0().showLoading();
        AreaCodeViewModel areaCodeViewModelM31912o0 = choosePhoneAreaActivity.m31912o0();
        SceneCode sceneCode = choosePhoneAreaActivity.f27591p;
        if (sceneCode == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fromWhereType");
            sceneCode = null;
        }
        AreaCodeViewModel.m31939v(areaCodeViewModelM31912o0, sceneCode.getCode(), null, 2, null);
        return Unit.INSTANCE;
    }

    @Override // com.kubi.sdk.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) throws Throwable {
        super.onCreate(savedInstanceState);
        setContentView(com.kubi.app.country.R$layout.busercenter_activity_choose_area);
        setPageId("B1AddressSelection");
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        SceneCode sceneCode = SceneCode.PHONE_REGISTER_COUNTRY_CODE;
        if (!RouteExKt.m56248g(intent, sceneCode.toString(), false)) {
            Intent intent2 = getIntent();
            Intrinsics.checkNotNullExpressionValue(intent2, "getIntent(...)");
            sceneCode = SceneCode.PHONE_LOGIN_COUNTRY_CODE;
            if (!RouteExKt.m56248g(intent2, sceneCode.toString(), false)) {
                Intent intent3 = getIntent();
                Intrinsics.checkNotNullExpressionValue(intent3, "getIntent(...)");
                sceneCode = SceneCode.BIND_PHONE_COUNTRY_CODE;
                if (!RouteExKt.m56248g(intent3, sceneCode.toString(), false)) {
                    Intent intent4 = getIntent();
                    Intrinsics.checkNotNullExpressionValue(intent4, "getIntent(...)");
                    sceneCode = SceneCode.CHANGE_BIND_PHONE_COUNTRY_CODE;
                    if (!RouteExKt.m56248g(intent4, sceneCode.toString(), false)) {
                        Intent intent5 = getIntent();
                        Intrinsics.checkNotNullExpressionValue(intent5, "getIntent(...)");
                        sceneCode = SceneCode.WITHDRAW_COUNTRY_CODE;
                        if (!RouteExKt.m56248g(intent5, sceneCode.toString(), false) && !m31913z0()) {
                            sceneCode = SceneCode.KEY_CHOOSE_TYPE_FOR_DEFAULT;
                        }
                    }
                }
            }
        }
        this.f27591p = sceneCode;
        AreaCodeListAdapter areaCodeListAdapterM31909j0 = m31909j0();
        SceneCode sceneCode2 = this.f27591p;
        SceneCode sceneCode3 = null;
        if (sceneCode2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fromWhereType");
            sceneCode2 = null;
        }
        areaCodeListAdapterM31909j0.m31875j(sceneCode2);
        m31901s0();
        m31898p0();
        Intent intent6 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent6, "getIntent(...)");
        String strM56282x = RouteExKt.m56282x(intent6, "codeAndMobileCodeStr", "");
        AreaCodeViewModel areaCodeViewModelM31912o0 = m31912o0();
        SceneCode sceneCode4 = this.f27591p;
        if (sceneCode4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fromWhereType");
        } else {
            sceneCode3 = sceneCode4;
        }
        areaCodeViewModelM31912o0.m31948u(sceneCode3.getCode(), strM56282x);
    }
}
