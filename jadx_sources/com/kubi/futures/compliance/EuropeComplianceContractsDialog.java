package com.kubi.futures.compliance;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.FragmentManager;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.C5267e0;
import com.kubi.futures.data.compliance.IComplianceService;
import com.kubi.futures.data.compliance.entity.EuropeComplianceDocsEntity;
import com.kubi.kumex.R$id;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.R$string;
import com.kubi.kumex.utils.Log;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.BasePageAdapter;
import com.kubi.sdk.BasePageDialog;
import com.kubi.sdk.ItemCallBack;
import com.kubi.sdk.PageEntity;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import com.tencent.qcloud.tuicore.TUIConstants;
import dm.C36805n;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.concurrent.TimeUnit;
import o00.C42916f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p011a9.C0206f;
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

/* JADX INFO: compiled from: EuropeComplianceContractsDialog.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 02\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00010B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0016\u001a\u00020\u0017H\u0016J&\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u001a\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00192\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010#\u001a\u00020!H\u0002J\u0012\u0010$\u001a\u00020!2\b\u0010%\u001a\u0004\u0018\u00010&H\u0002J\u0010\u0010'\u001a\u00020!2\u0006\u0010(\u001a\u00020)H\u0002J\n\u0010*\u001a\u0004\u0018\u00010+H\u0016J\u001e\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00020-2\u0006\u0010.\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u0017H\u0016R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0011\u001a\u0004\u0018\u00010\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014¨\u00061"}, m90084d2 = {"Lcom/kubi/futures/compliance/EuropeComplianceContractsDialog;", "Lcom/kubi/sdk/BasePageDialog;", "", "<init>", "()V", "viewBinding", "Lcom/kubi/kumex/databinding/BkumexDialogEuropeComplianceContractsBinding;", "getViewBinding", "()Lcom/kubi/kumex/databinding/BkumexDialogEuropeComplianceContractsBinding;", "viewBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "searchFragment", "Lcom/kubi/futures/compliance/EuropeComplianceSearchContractsFragment;", "getSearchFragment", "()Lcom/kubi/futures/compliance/EuropeComplianceSearchContractsFragment;", "searchFragment$delegate", "Lkotlin/Lazy;", "documentType", "", "getDocumentType", "()Ljava/lang/String;", "documentType$delegate", "initType", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "setTypeText", "executeSearch", "text", "", "navigationLangDialog", "data", "Lcom/kubi/futures/data/compliance/entity/EuropeComplianceDocsEntity;", "getPageList", "Landroidx/recyclerview/widget/RecyclerView;", "fetchPageData", "Lcom/kubi/sdk/PageEntity;", "page", "size", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nEuropeComplianceContractsDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EuropeComplianceContractsDialog.kt\ncom/kubi/futures/compliance/EuropeComplianceContractsDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,181:1\n157#2,6:182\n*S KotlinDebug\n*F\n+ 1 EuropeComplianceContractsDialog.kt\ncom/kubi/futures/compliance/EuropeComplianceContractsDialog\n*L\n53#1:182,6\n*E\n"})
public final class EuropeComplianceContractsDialog extends BasePageDialog<Object> {

    /* JADX INFO: renamed from: t0 */
    @NotNull
    public final InterfaceC24293a f22562t0;

    /* JADX INFO: renamed from: u0 */
    @NotNull
    public final Lazy f22563u0;

    /* JADX INFO: renamed from: v0 */
    @NotNull
    public final Lazy f22564v0;

    /* JADX INFO: renamed from: x0 */
    public static final /* synthetic */ KProperty<Object>[] f22561x0 = {Reflection.property1(new PropertyReference1Impl(EuropeComplianceContractsDialog.class, "viewBinding", "getViewBinding()Lcom/kubi/kumex/databinding/BkumexDialogEuropeComplianceContractsBinding;", 0))};

    /* JADX INFO: renamed from: w0 */
    @NotNull
    public static final Companion f22560w0 = new Companion(null);

    /* JADX INFO: compiled from: EuropeComplianceContractsDialog.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\n\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, m90084d2 = {"Lcom/kubi/futures/compliance/EuropeComplianceContractsDialog$Companion;", "", "<init>", "()V", TIMPushProvider.f75062n, "", "manager", "Landroidx/fragment/app/FragmentManager;", "documentType", "", "LEGAL_TYPE", "COST_TYPE", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final void show(@NotNull FragmentManager manager, @NotNull String documentType) {
            Intrinsics.checkNotNullParameter(manager, "manager");
            Intrinsics.checkNotNullParameter(documentType, "documentType");
            EuropeComplianceContractsDialog europeComplianceContractsDialog = new EuropeComplianceContractsDialog();
            Bundle bundle = new Bundle();
            bundle.putString("documentType", documentType);
            europeComplianceContractsDialog.setArguments(bundle);
            europeComplianceContractsDialog.show(manager, "EuropeComplianceContractsDialog");
        }
    }

    /* JADX INFO: renamed from: com.kubi.futures.compliance.EuropeComplianceContractsDialog$a */
    /* JADX INFO: compiled from: EuropeComplianceContractsDialog.kt */
    @Metadata(m90083d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\n"}, m90084d2 = {"com/kubi/futures/compliance/EuropeComplianceContractsDialog$onViewCreated$adapter$1", "Lcom/kubi/sdk/ItemCallBack;", "Lcom/kubi/futures/data/compliance/entity/EuropeComplianceDocsEntity;", TUIConstants.TUIChat.CALL_BACK, "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "pos", "", "data", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C12848a implements ItemCallBack<EuropeComplianceDocsEntity> {
        public C12848a() {
        }

        @Override // com.kubi.sdk.ItemCallBack
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo24515a(View view, int i11, EuropeComplianceDocsEntity data) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(data, "data");
            EuropeComplianceContractsDialog.this.m24510K4(data);
        }
    }

    /* JADX INFO: renamed from: com.kubi.futures.compliance.EuropeComplianceContractsDialog$b */
    /* JADX INFO: compiled from: EuropeComplianceContractsDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\b"}, m90084d2 = {"com/kubi/futures/compliance/EuropeComplianceContractsDialog$onViewCreated$adapter$2", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "", "areItemsTheSame", "", "oldItem", "newItem", "areContentsTheSame", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C12849b extends DiffUtil.ItemCallback<Object> {
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areContentsTheSame(Object oldItem, Object newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.areEqual(oldItem, newItem);
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areItemsTheSame(Object oldItem, Object newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.areEqual(oldItem, newItem);
        }
    }

    public EuropeComplianceContractsDialog() {
        super(false, 1, null);
        this.f22562t0 = C45681e.m100799e(this, new Function1<EuropeComplianceContractsDialog, C36805n>() { // from class: com.kubi.futures.compliance.EuropeComplianceContractsDialog$special$$inlined$viewBindingFragmentWithCallbacks$default$2
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C36805n invoke(@NotNull EuropeComplianceContractsDialog fragment) {
                Intrinsics.checkNotNullParameter(fragment, "fragment");
                return C36805n.m82471a(fragment.requireView());
            }
        }, new Function1<C36805n, Unit>() { // from class: com.kubi.futures.compliance.EuropeComplianceContractsDialog$special$$inlined$viewBindingFragmentWithCallbacks$default$1
            public final void invoke(@NotNull C36805n it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C36805n c36805n) {
                invoke(c36805n);
                return Unit.INSTANCE;
            }
        });
        this.f22563u0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.compliance.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EuropeComplianceContractsDialog.m24504Q4(this.f22585b);
            }
        });
        this.f22564v0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.compliance.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EuropeComplianceContractsDialog.m24496F4(this.f22586b);
            }
        });
    }

    /* JADX INFO: renamed from: G4 */
    private final void m24497G4(CharSequence charSequence) {
        Log.f30813a.m36615a("EuropeComplianceContractsDialog", "executeSearch: " + ((Object) charSequence));
        if (charSequence == null || charSequence.length() == 0) {
            if (m24508I4().isAdded()) {
                getChildFragmentManager().beginTransaction().remove(m24508I4()).commitAllowingStateLoss();
            }
        } else {
            if (!m24508I4().getF22576X() && !m24508I4().isAdded()) {
                m24508I4().m24545B3(true);
                getChildFragmentManager().beginTransaction().add(R$id.searchContainer, m24508I4()).commitAllowingStateLoss();
            }
            m24508I4().onTextChanged(charSequence.toString());
        }
    }

    /* JADX INFO: renamed from: H4 */
    private final String m24498H4() {
        return (String) this.f22564v0.getValue();
    }

    /* JADX INFO: renamed from: M4 */
    public static final Unit m24500M4(C36805n c36805n, EuropeComplianceContractsDialog europeComplianceContractsDialog, CharSequence charSequence) {
        if ((charSequence == null || charSequence.length() == 0) && c36805n.f80638k.getDisplayedChild() != 0) {
            c36805n.f80638k.setDisplayedChild(0);
        }
        if (charSequence != null && charSequence.length() != 0 && c36805n.f80638k.getDisplayedChild() != 1) {
            c36805n.f80638k.setDisplayedChild(1);
        }
        europeComplianceContractsDialog.m24497G4(charSequence);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O4 */
    public static final Unit m24502O4(Throwable th2) {
        Log log = Log.f30813a;
        Intrinsics.checkNotNull(th2);
        log.m36616b("EuropeComplianceContractsDialog", th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Q4 */
    public static final EuropeComplianceSearchContractsFragment m24504Q4(EuropeComplianceContractsDialog europeComplianceContractsDialog) {
        EuropeComplianceSearchContractsFragment europeComplianceSearchContractsFragment = new EuropeComplianceSearchContractsFragment();
        Bundle bundle = new Bundle();
        bundle.putString("documentType", europeComplianceContractsDialog.m24498H4());
        europeComplianceSearchContractsFragment.setArguments(bundle);
        return europeComplianceSearchContractsFragment;
    }

    /* JADX INFO: renamed from: I4 */
    public final EuropeComplianceSearchContractsFragment m24508I4() {
        return (EuropeComplianceSearchContractsFragment) this.f22563u0.getValue();
    }

    /* JADX INFO: renamed from: J4 */
    public final C36805n m24509J4() {
        return (C36805n) this.f22562t0.getValue(this, f22561x0[0]);
    }

    /* JADX INFO: renamed from: K4 */
    public final void m24510K4(EuropeComplianceDocsEntity europeComplianceDocsEntity) {
        EuropeComplianceLangDialog.f22566u0.show(this, europeComplianceDocsEntity);
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper
    /* JADX INFO: renamed from: N3 */
    public int mo24511N3() {
        return 8;
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.bkumex_dialog_europe_compliance_contracts, container, false);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        final C36805n c36805nM24509J4 = m24509J4();
        if (c36805nM24509J4 == null) {
            return;
        }
        ViewExtKt.m66578i(view, (int) (((double) C5267e0.m6179a()) * 0.9d));
        AppCompatImageView close = c36805nM24509J4.f80630c;
        Intrinsics.checkNotNullExpressionValue(close, "close");
        C27046k.m66711z(close, 0L, new Function0() { // from class: com.kubi.futures.compliance.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EuropeComplianceContractsDialog.m24499L4(this.f22580b);
            }
        }, 1, null);
        m24512R4();
        c36805nM24509J4.f80634g.setAdapter(BasePageAdapter.a.m57044c(new BasePageAdapter.a(), EuropeComplianceDocsEntity.class, EuropeComplianceDocProxy.class, new C12848a(), null, 8, null).m57045a(new C12849b()));
        Observable<CharSequence> observableObserveOn = C0206f.m784d(c36805nM24509J4.f80636i).debounce(500L, TimeUnit.MILLISECONDS).observeOn(C42916f.m94128g());
        final Function1 function1 = new Function1() { // from class: com.kubi.futures.compliance.b
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EuropeComplianceContractsDialog.m24500M4(c36805nM24509J4, this, (CharSequence) obj);
            }
        };
        Consumer<? super CharSequence> consumer = new Consumer() { // from class: com.kubi.futures.compliance.c
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                EuropeComplianceContractsDialog.m24501N4(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.futures.compliance.d
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EuropeComplianceContractsDialog.m24502O4((Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.futures.compliance.e
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                EuropeComplianceContractsDialog.m24503P4(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, getF43550U());
        m56398B0();
    }

    @Override // com.kubi.sdk.BasePageDialog
    @NotNull
    /* JADX INFO: renamed from: p4 */
    public PageEntity<Object> mo24513p4(int i11, int i12) {
        return IComplianceService.f22675a.get().mo97163f(m24498H4(), null, i11, i12).toPageEntity();
    }

    /* JADX INFO: renamed from: F4 */
    public static final String m24496F4(EuropeComplianceContractsDialog europeComplianceContractsDialog) {
        Bundle arguments = europeComplianceContractsDialog.getArguments();
        if (arguments != null) {
            return arguments.getString("documentType");
        }
        return null;
    }

    /* JADX INFO: renamed from: L4 */
    public static final Unit m24499L4(EuropeComplianceContractsDialog europeComplianceContractsDialog) {
        europeComplianceContractsDialog.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N4 */
    public static final void m24501N4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P4 */
    public static final void m24503P4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: R4 */
    public final void m24512R4() {
        C36805n c36805nM24509J4 = m24509J4();
        if (c36805nM24509J4 == null) {
            return;
        }
        if (Intrinsics.areEqual(m24498H4(), "cost_transparency")) {
            c36805nM24509J4.f80639l.setText("MIFID EX-ANTE");
            c36805nM24509J4.f80629b.setText("MIFID EX-ANTE");
            return;
        }
        BaseTextView baseTextView = c36805nM24509J4.f80639l;
        C27017c c27017c = C27017c.f54310a;
        int i11 = R$string.futures_eourpe_priip_title;
        baseTextView.setText(c27017c.m66516f(i11, new Object[0]));
        c36805nM24509J4.f80629b.setText(c27017c.m66516f(i11, new Object[0]));
    }

    @Override // com.kubi.sdk.BasePageDialog
    @Nullable
    /* JADX INFO: renamed from: s4 */
    public RecyclerView mo24514s4() {
        C36805n c36805nM24509J4 = m24509J4();
        if (c36805nM24509J4 != null) {
            return c36805nM24509J4.f80634g;
        }
        return null;
    }
}
