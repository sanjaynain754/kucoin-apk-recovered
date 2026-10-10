package com.kubi.widget.web.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.sdk.BaseFragment;
import com.kubi.utils.C27051h;
import com.kubi.widget.web.R$id;
import com.kubi.widget.web.R$layout;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: KWebFragment.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/widget/web/ui/KWebFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "webContainer", "Lcom/kubi/widget/web/ui/KWebContainer;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onLoad", "", "onDestroyView", "Companion", "LWebWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKWebFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KWebFragment.kt\ncom/kubi/widget/web/ui/KWebFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,73:1\n1#2:74\n*E\n"})
public final class KWebFragment extends BaseFragment {

    /* JADX INFO: renamed from: V */
    @NotNull
    public static final Companion f55292V = new Companion(null);

    /* JADX INFO: renamed from: U */
    public KWebContainer f55293U;

    /* JADX INFO: compiled from: KWebFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/widget/web/ui/KWebFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/widget/web/ui/KWebFragment;", "url", "", "LWebWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final KWebFragment newInstance(@NotNull String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            KWebFragment kWebFragment = new KWebFragment();
            kWebFragment.setArguments(new C27051h().m66724h("url", url).m66724h("loading", "2").m66717a());
            return kWebFragment;
        }
    }

    /* JADX INFO: renamed from: com.kubi.widget.web.ui.KWebFragment$onLoad$1 */
    /* JADX INFO: compiled from: KWebFragment.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.widget.web.ui.KWebFragment$onLoad$1", m90122f = "KWebFragment.kt", m90123i = {}, m90124l = {51}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C272281 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;

        public C272281(Continuation<? super C272281> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return KWebFragment.this.new C272281(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C272281) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                KWebContainer kWebContainer = KWebFragment.this.f55293U;
                if (kWebContainer == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("webContainer");
                    kWebContainer = null;
                }
                this.label = 1;
                if (kWebContainer.m67479E(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.kweb_fragment_webview, container, false);
        KWebContainer kWebContainer = (KWebContainer) viewInflate.findViewById(R$id.web_container);
        Intrinsics.checkNotNull(kWebContainer);
        this.f55293U = kWebContainer;
        Bundle arguments = getArguments();
        KWebUIConfig kWebUIConfigFromBundle = arguments != null ? KWebUIConfig.f55294m.fromBundle(arguments) : null;
        if (kWebUIConfigFromBundle != null) {
            kWebContainer.m67489Q(kWebUIConfigFromBundle);
        }
        Intrinsics.checkNotNullExpressionValue(viewInflate, "apply(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        KWebContainer kWebContainer = this.f55293U;
        if (kWebContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webContainer");
            kWebContainer = null;
        }
        kWebContainer.m67482J();
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onLoad() {
        super.onLoad();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C272281(null), 3, null);
    }
}
