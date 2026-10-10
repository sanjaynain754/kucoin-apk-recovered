package com.kubi.mine.lib.p101ui;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.KeyEventDispatcher;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.C5267e0;
import com.blankj.utilcode.util.C5276j;
import com.blankj.utilcode.util.C5305y;
import com.blankj.utilcode.util.NetworkUtils;
import com.kubi.host.HostManager;
import com.kubi.kucoin.data.platform.IPAddressHelper;
import com.kubi.mine.R$id;
import com.kubi.mine.R$layout;
import com.kubi.mine.R$string;
import com.kubi.mine.lib.service.MineDepend;
import com.kubi.network.retrofit.utils.C19331c;
import com.kubi.resources.widget.NavigationBar;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.router.core.Router;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.base.p113ui.InterfaceC23686g;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.sdk.util.C24217a1;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.share.api.IShareService;
import com.kubi.share.api.TextShareParam;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.netdiagno.C27075a;
import com.tencent.qcloud.tuicore.TUIConstants;
import gq.C37996q;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import iq.InterfaceC40162d;
import java.util.ArrayList;
import java.util.TimeZone;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p319hq.InterfaceC38285b;
import p694vk.C45590s;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;
import w00.C45681e;
import w70.InterfaceC45748a;

/* JADX INFO: compiled from: QaParamsFragment.kt */
/* JADX INFO: loaded from: classes29.dex */
@Metadata(m90083d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J$\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u001a\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u00192\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J8\u0010 \u001a\u00020\u00152.\u0010!\u001a*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0#0\"j\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0#`$H\u0002J\b\u0010%\u001a\u00020\u000eH\u0002J\b\u0010&\u001a\u00020\u0015H\u0016J\u0012\u0010'\u001a\u00020\u00152\b\u0010(\u001a\u0004\u0018\u00010\u000eH\u0016J\u0012\u0010)\u001a\u00020\u00152\b\u0010(\u001a\u0004\u0018\u00010\u000eH\u0016R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u00060\u0010j\u0002`\u0011X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.¢\u0006\u0002\n\u0000¨\u0006*"}, m90084d2 = {"Lcom/kubi/mine/lib/ui/QaParamsFragment;", "Lcom/kubi/sdk/BaseFragment;", "Lcom/kubi/utils/netdiagno/LDNetDiagnoListener;", "<init>", "()V", "binding", "Lcom/kubi/mine/databinding/KucoinLayoutQaParamsBinding;", "getBinding", "()Lcom/kubi/mine/databinding/KucoinLayoutQaParamsBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "requestTime", "", "errorMsg", "", "strBuilder", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "netDiagnoService", "Lcom/kubi/utils/netdiagno/LDNetDiagnoService;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "addNet", "list", "Ljava/util/ArrayList;", "Lkotlin/Pair;", "Lkotlin/collections/ArrayList;", "getShareText", "onDestroyView", "OnNetDiagnoFinished", "log", "OnNetDiagnoUpdated", "MineLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nQaParamsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QaParamsFragment.kt\ncom/kubi/mine/lib/ui/QaParamsFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n*L\n1#1,241:1\n147#2,16:242\n25#3,3:258\n*S KotlinDebug\n*F\n+ 1 QaParamsFragment.kt\ncom/kubi/mine/lib/ui/QaParamsFragment\n*L\n52#1:242,16\n78#1:258,3\n*E\n"})
public final class QaParamsFragment extends BaseFragment implements InterfaceC45748a {

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ KProperty<Object>[] f35230Z = {Reflection.property1(new PropertyReference1Impl(QaParamsFragment.class, "binding", "getBinding()Lcom/kubi/mine/databinding/KucoinLayoutQaParamsBinding;", 0))};

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f35231U = C45681e.m100799e(this, new Function1<QaParamsFragment, C37996q>() { // from class: com.kubi.mine.lib.ui.QaParamsFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37996q invoke(@NotNull QaParamsFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37996q.m85867a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C37996q, Unit>() { // from class: com.kubi.mine.lib.ui.QaParamsFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C37996q it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37996q c37996q) {
            invoke(c37996q);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    public long f35232V = -1;

    /* JADX INFO: renamed from: W */
    @NotNull
    public String f35233W = "";

    /* JADX INFO: renamed from: X */
    public StringBuilder f35234X;

    /* JADX INFO: renamed from: Y */
    public C27075a f35235Y;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5, types: [androidx.recyclerview.widget.RecyclerView$Adapter, com.kubi.mine.lib.ui.QaParamsFragment$onViewCreated$adapter$1] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) throws Exception {
        KcPrimaryButton kcPrimaryButton;
        String str;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Object objM56186h = Router.f46192a.m56186h(InterfaceC40162d.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h != null) {
            ((InterfaceC40162d) objM56186h).m88519a(m42178p3());
        } else {
            C37996q c37996qM42178p3 = m42178p3();
            if (c37996qM42178p3 != null && (kcPrimaryButton = c37996qM42178p3.f85588b) != null) {
                C27046k.m66711z(kcPrimaryButton, 0L, new Function0() { // from class: com.kubi.mine.lib.ui.j3
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return QaParamsFragment.m42173u3(this.f35299b);
                    }
                }, 1, null);
            }
        }
        C37996q c37996qM42178p4 = m42178p3();
        if (c37996qM42178p4 != null && (recyclerView2 = c37996qM42178p4.f85590d) != null) {
            recyclerView2.setLayoutManager(new LinearLayoutManager(view.getContext()));
        }
        final ArrayList arrayList = new ArrayList();
        String string = getString(R$string.params_version);
        int i11 = R$string.version_stub;
        C45590s c45590s = C45590s.f102687a;
        arrayList.add(TuplesKt.m90091to(string, getString(i11, c45590s.m100676a0())));
        arrayList.add(TuplesKt.m90091to(getString(R$string.params_channel), C19116o3.m42278f(c45590s.m100665P())));
        arrayList.add(TuplesKt.m90091to(getString(R$string.params_language), MultiLanguageManager.f46811g.getLocalString()));
        arrayList.add(TuplesKt.m90091to(getString(R$string.params_board), C5276j.m6243b()));
        arrayList.add(TuplesKt.m90091to(getString(R$string.params_system), Build.VERSION.RELEASE));
        arrayList.add(TuplesKt.m90091to(getString(R$string.params_device_model), C5276j.m6244c()));
        String string2 = getString(R$string.params_screen_size);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C5267e0.m6182d());
        sb2.append('*');
        sb2.append(C5267e0.m6183e());
        arrayList.add(TuplesKt.m90091to(string2, sb2.toString()));
        String string3 = getString(R$string.params_network_type);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(NetworkUtils.m6057e().name());
        HostManager hostManager = HostManager.a;
        String strA = hostManager.A();
        if (Intrinsics.areEqual(strA, "1")) {
            str = "4";
        } else {
            str = Intrinsics.areEqual(strA, "2") ? "5" : "3";
        }
        sb3.append(str);
        arrayList.add(TuplesKt.m90091to(string3, sb3.toString()));
        String string4 = getString(R$string.params_ip_address);
        String strM32049c = IPAddressHelper.f27740a.m32049c();
        if (TextUtils.isEmpty(strM32049c)) {
            strM32049c = NetworkUtils.m6055c(true);
        }
        arrayList.add(TuplesKt.m90091to(string4, strM32049c));
        arrayList.add(TuplesKt.m90091to(getString(R$string.params_operator), C5305y.m6515a()));
        arrayList.add(TuplesKt.m90091to(getString(R$string.params_timezone), TimeZone.getDefault().getDisplayName(false, 0)));
        arrayList.add(TuplesKt.m90091to(getString(R$string.login_device), C5276j.m6247f() + C19116o3.m42277e()));
        final int i12 = R$layout.kucoin_item_simple_left_right;
        final ?? r11 = new BaseQuickAdapter<Pair<? extends String, ? extends String>, BaseViewHolder>(arrayList, i12) { // from class: com.kubi.mine.lib.ui.QaParamsFragment$onViewCreated$adapter$1
            @Override // io.chad.library.adapter.base.BaseQuickAdapter
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public void convert(BaseViewHolder helper, Pair<String, String> item) {
                Intrinsics.checkNotNullParameter(helper, "helper");
                Intrinsics.checkNotNullParameter(item, "item");
                helper.setText(R$id.tv_left, item.getFirst()).setText(R$id.tv_right, item.getSecond());
            }
        };
        C37996q c37996qM42178p5 = m42178p3();
        if (c37996qM42178p5 != null && (recyclerView = c37996qM42178p5.f85590d) != 0) {
            recyclerView.setAdapter(r11);
        }
        InterfaceC38285b interfaceC38285b = (InterfaceC38285b) C42597a.m93386b().create(InterfaceC38285b.class);
        final long jCurrentTimeMillis = System.currentTimeMillis();
        Observable<R> observableCompose = interfaceC38285b.m86409b().compose(C24217a1.m58389m());
        final Function1 function1 = new Function1() { // from class: com.kubi.mine.lib.ui.k3
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return QaParamsFragment.m42174v3(this.f35305b, jCurrentTimeMillis, arrayList, r11, (String) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.mine.lib.ui.l3
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                QaParamsFragment.m42170r3(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.mine.lib.ui.m3
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return QaParamsFragment.m42171s3(this.f35319b, arrayList, r11, (Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableCompose.subscribe(consumer, new Consumer() { // from class: com.kubi.mine.lib.ui.n3
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                QaParamsFragment.m42172t3(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, getDestroyDisposable());
        this.f35234X = new StringBuilder();
        C27075a c27075a = new C27075a(view.getContext(), MineDepend.f35159a.m41826e().id, StringsKt.replace$default(hostManager.f(), "https://", "", false, 4, (Object) null), C5305y.m6515a(), this);
        this.f35235Y = c27075a;
        c27075a.m66777i(new String[0]);
    }

    @Override // w70.InterfaceC45748a
    /* JADX INFO: renamed from: o */
    public void mo42176o(@Nullable String str) {
        StringBuilder sb2 = this.f35234X;
        if (sb2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("strBuilder");
            sb2 = null;
        }
        sb2.append(str);
    }

    /* JADX INFO: renamed from: o3 */
    public final void m42177o3(ArrayList<Pair<String, String>> arrayList) {
        if (this.f35232V <= 0) {
            if (TextUtils.isEmpty(this.f35233W)) {
                arrayList.add(TuplesKt.m90091to(getString(R$string.params_reqest_time), getString(R$string.network_error)));
                return;
            } else {
                arrayList.add(TuplesKt.m90091to(getString(R$string.params_reqest_time), C27041f.m66668h(this.f35233W)));
                return;
            }
        }
        arrayList.add(TuplesKt.m90091to(getString(R$string.params_reqest_time), this.f35232V + "ms"));
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.kucoin_layout_qa_params, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    /* JADX INFO: renamed from: p3 */
    public final C37996q m42178p3() {
        return (C37996q) this.f35231U.getValue(this, f35230Z[0]);
    }

    /* JADX INFO: renamed from: q3 */
    public final String m42179q3() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C19116o3.m42275c(IPAddressHelper.f27740a.m32049c()));
        sb2.append("\nrequestTime：");
        sb2.append(this.f35232V);
        sb2.append("ms\n\n");
        StringBuilder sb3 = this.f35234X;
        if (sb3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("strBuilder");
            sb3 = null;
        }
        sb2.append((Object) sb3);
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r3 */
    public static final void m42170r3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: s3 */
    public static final Unit m42171s3(QaParamsFragment qaParamsFragment, ArrayList arrayList, QaParamsFragment$onViewCreated$adapter$1 qaParamsFragment$onViewCreated$adapter$1, Throwable th2) {
        qaParamsFragment.f35233W = C27041f.m66668h(th2.getMessage());
        qaParamsFragment.m42177o3(arrayList);
        qaParamsFragment$onViewCreated$adapter$1.notifyDataSetChanged();
        th2.printStackTrace();
        Intrinsics.checkNotNull(th2);
        C19331c.m42836c(th2, null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t3 */
    public static final void m42172t3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: u3 */
    public static final Unit m42173u3(QaParamsFragment qaParamsFragment) {
        if (qaParamsFragment.getActivity() != null) {
            IShareService iShareService = IShareService.f49268a.get();
            TextShareParam textShareParam = new TextShareParam("envInfo", null, null, null, 14, null);
            textShareParam.setContent(qaParamsFragment.m42179q3());
            IShareService.m59640c(iShareService, textShareParam, null, 2, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v3 */
    public static final Unit m42174v3(QaParamsFragment qaParamsFragment, long j11, ArrayList arrayList, QaParamsFragment$onViewCreated$adapter$1 qaParamsFragment$onViewCreated$adapter$1, String str) {
        qaParamsFragment.f35232V = System.currentTimeMillis() - j11;
        qaParamsFragment.m42177o3(arrayList);
        qaParamsFragment$onViewCreated$adapter$1.notifyDataSetChanged();
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        InterfaceC23686g interfaceC23686g;
        NavigationBar navigationBar;
        super.onCreate(savedInstanceState);
        getTitleBar().m58934f();
        KeyEventDispatcher.Component activity = getActivity();
        if (activity instanceof InterfaceC23686g) {
            interfaceC23686g = (InterfaceC23686g) activity;
        } else {
            interfaceC23686g = null;
        }
        if (interfaceC23686g != null && (navigationBar = interfaceC23686g.getNavigationBar()) != null) {
            navigationBar.m54692c();
        }
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        C27075a c27075a = this.f35235Y;
        if (c27075a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("netDiagnoService");
            c27075a = null;
        }
        c27075a.m66817z();
    }

    @Override // w70.InterfaceC45748a
    /* JADX INFO: renamed from: k */
    public void mo42175k(@Nullable String str) {
    }
}
