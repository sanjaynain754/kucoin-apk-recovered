package com.kubi.assets.rollback;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.assets.R$color;
import com.kubi.assets.R$layout;
import com.kubi.assets.R$string;
import com.kubi.assets.entity.RollbackEntity;
import com.kubi.assets.service.AssetsHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27018c0;
import com.kubi.utils.extensions.C27041f;
import com.tencent.qcloud.tuicore.TUIConstants;
import f00.C37304a;
import g00.InterfaceC37749a;
import io.chad.library.adapter.base.BaseQuickAdapter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p637ta.C44872u0;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.jvm.internal.StringCompanionObject;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;
import w00.C45681e;

/* JADX INFO: compiled from: RollbackFragment.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 $2\u00020\u0001:\u0001$B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0014\u001a\u00020\u0015J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0002J$\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u001a\u0010\"\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R)\u0010\f\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u000e0\u000e0\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011¨\u0006%"}, m90084d2 = {"Lcom/kubi/assets/rollback/RollbackFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "binding", "Lcom/kubi/assets/databinding/AssetFragmentRollbackBinding;", "getBinding", "()Lcom/kubi/assets/databinding/AssetFragmentRollbackBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "rollbackAdapter", "Lcom/kubi/assets/rollback/RollbackAdapter;", "rollbackList", "", "Lcom/kubi/assets/entity/RollbackEntity;", "kotlin.jvm.PlatformType", "getRollbackList", "()Ljava/util/List;", "rollbackList$delegate", "Lkotlin/Lazy;", "initView", "", "setClickSpan", "content", "", "clickStr", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Companion", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRollbackFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RollbackFragment.kt\ncom/kubi/assets/rollback/RollbackFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,118:1\n147#2,16:119\n*S KotlinDebug\n*F\n+ 1 RollbackFragment.kt\ncom/kubi/assets/rollback/RollbackFragment\n*L\n39#1:119,16\n*E\n"})
public final class RollbackFragment extends BaseFragment {

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f18565U = C45681e.m100799e(this, new Function1<RollbackFragment, C44872u0>() { // from class: com.kubi.assets.rollback.RollbackFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44872u0 invoke(@NotNull RollbackFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44872u0.m99268a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C44872u0, Unit>() { // from class: com.kubi.assets.rollback.RollbackFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C44872u0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44872u0 c44872u0) {
            invoke(c44872u0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final RollbackAdapter f18566V = new RollbackAdapter();

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f18567W = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.rollback.b
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RollbackFragment.m18907p3(this.f18569b);
        }
    });

    /* JADX INFO: renamed from: Y */
    public static final /* synthetic */ KProperty<Object>[] f18564Y = {Reflection.property1(new PropertyReference1Impl(RollbackFragment.class, "binding", "getBinding()Lcom/kubi/assets/databinding/AssetFragmentRollbackBinding;", 0))};

    /* JADX INFO: renamed from: X */
    @NotNull
    public static final Companion f18563X = new Companion(null);

    /* JADX INFO: compiled from: RollbackFragment.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/assets/rollback/RollbackFragment$Companion;", "", "<init>", "()V", "startRollbackFragment", "", "context", "Landroid/content/Context;", "rollbackList", "Ljava/util/ArrayList;", "Lcom/kubi/assets/entity/RollbackEntity;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final void startRollbackFragment(@NotNull Context context, @Nullable ArrayList<RollbackEntity> rollbackList) {
            Intrinsics.checkNotNullParameter(context, "context");
            BaseActivity.Companion companion = BaseActivity.INSTANCE;
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("data", rollbackList);
            Unit unit = Unit.INSTANCE;
            companion.launch(context, RollbackFragment.class, bundle);
        }
    }

    /* JADX INFO: renamed from: o3 */
    public static final void m18906o3(RollbackFragment rollbackFragment, BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        List<RollbackEntity> data = rollbackFragment.f18566V.getData();
        Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
        RollbackEntity rollbackEntity = (RollbackEntity) CollectionsKt.getOrNull(data, i11);
        InterfaceC37749a.a.m85113h(C37304a.f82764a, C27041f.m66668h(rollbackEntity != null ? rollbackEntity.getDepositId() : null), null, null, null, null, 30, null);
    }

    /* JADX INFO: renamed from: r3 */
    public static final void m18908r3(RollbackFragment rollbackFragment, View view) {
        AssetsHelper.f18684a.m19154H(rollbackFragment.getActivity());
    }

    /* JADX INFO: renamed from: m3 */
    public final C44872u0 m18909m3() {
        return (C44872u0) this.f18565U.getValue(this, f18564Y[0]);
    }

    /* JADX INFO: renamed from: n3 */
    public final List<RollbackEntity> m18910n3() {
        return (List) this.f18567W.getValue();
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.asset_fragment_rollback, (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        initView();
    }

    /* JADX INFO: renamed from: q3 */
    public final void m18911q3(String str, String str2) {
        BaseTextView baseTextView;
        SpannableString spannableString = new SpannableString(str);
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) spannableString, str2, 0, true, 2, (Object) null);
        int length = str2.length();
        if (iIndexOf$default < 0) {
            length = str.length();
            iIndexOf$default = 0;
        }
        spannableString.setSpan(new C27018c0(R$color.primary, new View.OnClickListener() { // from class: com.kubi.assets.rollback.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RollbackFragment.m18908r3(this.f18570b, view);
            }
        }), iIndexOf$default, length + iIndexOf$default, 17);
        C44872u0 c44872u0M18909m3 = m18909m3();
        if (c44872u0M18909m3 == null || (baseTextView = c44872u0M18909m3.f100925d) == null) {
            return;
        }
        baseTextView.setMovementMethod(LinkMovementMethod.getInstance());
        baseTextView.setHighlightColor(0);
        baseTextView.setText(spannableString);
    }

    /* JADX INFO: renamed from: p3 */
    public static final List m18907p3(RollbackFragment rollbackFragment) {
        ArrayList parcelableArrayList;
        Bundle arguments = rollbackFragment.getArguments();
        if (arguments != null) {
            parcelableArrayList = arguments.getParcelableArrayList("data");
        } else {
            parcelableArrayList = null;
        }
        if (parcelableArrayList == null) {
            return CollectionsKt.emptyList();
        }
        return parcelableArrayList;
    }

    public final void initView() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        getTitleBar().setTitle(getString(R$string.asset_rollback_title));
        C44872u0 c44872u0M18909m3 = m18909m3();
        if (c44872u0M18909m3 != null && (recyclerView2 = c44872u0M18909m3.f100923b) != null) {
            recyclerView2.setAdapter(this.f18566V);
        }
        C44872u0 c44872u0M18909m4 = m18909m3();
        if (c44872u0M18909m4 != null && (recyclerView = c44872u0M18909m4.f100923b) != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        }
        this.f18566V.setNewData(m18910n3());
        String string = getString(R$string.asset_rollback_contact);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        Locale ENGLISH = Locale.ENGLISH;
        Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
        String lowerCase = string.toLowerCase(ENGLISH);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String string2 = getString(R$string.asset_rollback_tip3);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        String str = String.format(ENGLISH, string2, Arrays.copyOf(new Object[]{lowerCase}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        m18911q3(str, lowerCase);
        this.f18566V.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() { // from class: com.kubi.assets.rollback.a
            @Override // io.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                RollbackFragment.m18906o3(this.f18568a, baseQuickAdapter, view, i11);
            }
        });
    }
}
