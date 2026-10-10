package com.kubi.assets.overview.ongoing;

import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.assets.AssetExKt;
import com.kubi.assets.R$drawable;
import com.kubi.assets.R$string;
import com.kubi.assets.entity.FundsInfo;
import com.kubi.assets.finance.product.FinanceVipProductAdapter;
import com.kubi.assets.overview.OverviewAnalyticsReporter;
import com.kubi.assets.overview.ongoing.mapper.ProductItem;
import com.kubi.resources.C22890g;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.ShowHideTextView;
import com.kubi.resources.widget.round.widget.RoundImageView;
import com.kubi.sdk.adapter.KcBaseDifferMultiAdapter;
import com.kubi.sdk.util.C24277v;
import com.kubi.sdk.widget.shape.layout.ShapeConstraintLayout;
import com.kubi.sdk.widget.shape.layout.ShapeLinearLayout;
import com.kubi.sdk.widget.shape.view.ShapeTextView;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27092t0;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.DowngradeExKt;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.bugly.proguard.C33820nf;
import com.tencent.bugly.proguard.C33954u6;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p275fy.C37728a;
import p275fy.C37732e;
import p637ta.C44762f1;
import p637ta.C44770g1;
import p637ta.C44778h1;
import p637ta.C44786i1;
import p637ta.C44794j1;
import p637ta.C44802k1;
import p637ta.C44810l1;
import p637ta.C44817m1;
import p637ta.C44824n1;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.FunctionReferenceImpl;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: AssetOnGoingAdapter.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J&\u0010\u001d\u001a\u00020\u001e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020\u0002H\u0002J\u001e\u0010#\u001a\u00020\u001e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020$0 2\u0006\u0010\"\u001a\u00020\u0002H\u0002J&\u0010%\u001a\u00020\u001e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020&0 2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020\u0002H\u0002J&\u0010'\u001a\u00020\u001e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020(0 2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020\u0002H\u0002J&\u0010)\u001a\u00020\u001e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020*0 2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020\u0002H\u0002J\u001e\u0010+\u001a\u00020\u001e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020,0 2\u0006\u0010\"\u001a\u00020\u0002H\u0002J\u001e\u0010-\u001a\u00020\u001e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020.0 2\u0006\u0010\"\u001a\u00020\u0002H\u0002J&\u0010/\u001a\u00020\u001e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002000 2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020\u0002H\u0002J\u001e\u00101\u001a\u00020\u001e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002020 2\u0006\u0010\"\u001a\u00020\u0002H\u0002J\u0016\u00103\u001a\u00020\u001e2\u000e\u00104\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00065"}, m90084d2 = {"Lcom/kubi/assets/overview/ongoing/AssetOnGoingAdapter;", "Lcom/kubi/sdk/adapter/KcBaseDifferMultiAdapter;", "Lcom/kubi/assets/overview/ongoing/mapper/ProductItem;", "fragment", "Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment;", "diffCallBack", "Lcom/kubi/assets/overview/ongoing/ProductDiffCallBack;", "data", "", "<init>", "(Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment;Lcom/kubi/assets/overview/ongoing/ProductDiffCallBack;Ljava/util/List;)V", "getFragment", "()Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment;", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "hideNumber", "", "getHideNumber", "()Z", "setHideNumber", "(Z)V", "helper", "Lcom/kubi/assets/overview/ongoing/AssetOnGoingAdapterHelper;", "getItemId", "", ViewProps.POSITION, "", "bindContractCard", "", C33954u6.f72238i, "Lcom/kubi/sdk/adapter/BaseQuickVH;", "Lcom/kubi/assets/databinding/AssetItemOngoingContractBinding;", "item", "bindCrossCard", "Lcom/kubi/assets/databinding/AssetItemOngoingCrossBinding;", "bindIsolatedCard", "Lcom/kubi/assets/databinding/AssetItemOngoingIsolatedBinding;", "bindRobotCard", "Lcom/kubi/assets/databinding/AssetItemOngoingRobotBinding;", "bindFinanceCard", "Lcom/kubi/assets/databinding/AssetItemOngoingFinanceBinding;", "bindCopyTradingCard", "Lcom/kubi/assets/databinding/AssetItemOngoingCopytradingBinding;", "bindLeadTradingCard", "Lcom/kubi/assets/databinding/AssetItemOngoingLeadtradingBinding;", "bindHeader", "Lcom/kubi/assets/databinding/AssetItemOngoingHeaderBinding;", "bindLoadMore", "Lcom/kubi/assets/databinding/AssetItemOngoingLoadMoreBinding;", "updateData", "newData", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAssetOnGoingAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetOnGoingAdapter.kt\ncom/kubi/assets/overview/ongoing/AssetOnGoingAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,419:1\n1#2:420\n*E\n"})
public final class AssetOnGoingAdapter extends KcBaseDifferMultiAdapter<ProductItem> {

    /* JADX INFO: renamed from: k */
    @NotNull
    public final AssetOnGoingFragment f18399k;

    /* JADX INFO: renamed from: l */
    @NotNull
    public List<ProductItem> f18400l;

    /* JADX INFO: renamed from: m */
    public boolean f18401m;

    /* JADX INFO: renamed from: n */
    @NotNull
    public AssetOnGoingAdapterHelper f18402n;

    /* JADX INFO: renamed from: com.kubi.assets.overview.ongoing.AssetOnGoingAdapter$10 */
    /* JADX INFO: compiled from: AssetOnGoingAdapter.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C1073510 extends FunctionReferenceImpl implements Function3<LayoutInflater, ViewGroup, Boolean, C44770g1> {
        public static final C1073510 INSTANCE = new C1073510();

        @Override // p852kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ C44770g1 invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            return invoke(layoutInflater, viewGroup, bool.booleanValue());
        }

        public C1073510() {
            super(3, C44770g1.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/kubi/assets/databinding/AssetItemOngoingCopytradingBinding;", 0);
        }

        public final C44770g1 invoke(LayoutInflater p11, ViewGroup viewGroup, boolean z11) {
            Intrinsics.checkNotNullParameter(p11, "p0");
            return C44770g1.m99056c(p11, viewGroup, z11);
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.overview.ongoing.AssetOnGoingAdapter$12 */
    /* JADX INFO: compiled from: AssetOnGoingAdapter.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C1073612 extends FunctionReferenceImpl implements Function3<LayoutInflater, ViewGroup, Boolean, C44810l1> {
        public static final C1073612 INSTANCE = new C1073612();

        @Override // p852kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ C44810l1 invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            return invoke(layoutInflater, viewGroup, bool.booleanValue());
        }

        public C1073612() {
            super(3, C44810l1.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/kubi/assets/databinding/AssetItemOngoingLeadtradingBinding;", 0);
        }

        public final C44810l1 invoke(LayoutInflater p11, ViewGroup viewGroup, boolean z11) {
            Intrinsics.checkNotNullParameter(p11, "p0");
            return C44810l1.m99141c(p11, viewGroup, z11);
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.overview.ongoing.AssetOnGoingAdapter$14 */
    /* JADX INFO: compiled from: AssetOnGoingAdapter.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C1073714 extends FunctionReferenceImpl implements Function3<LayoutInflater, ViewGroup, Boolean, C44786i1> {
        public static final C1073714 INSTANCE = new C1073714();

        @Override // p852kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ C44786i1 invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            return invoke(layoutInflater, viewGroup, bool.booleanValue());
        }

        public C1073714() {
            super(3, C44786i1.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/kubi/assets/databinding/AssetItemOngoingFinanceBinding;", 0);
        }

        public final C44786i1 invoke(LayoutInflater p11, ViewGroup viewGroup, boolean z11) {
            Intrinsics.checkNotNullParameter(p11, "p0");
            return C44786i1.m99090c(p11, viewGroup, z11);
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.overview.ongoing.AssetOnGoingAdapter$16 */
    /* JADX INFO: compiled from: AssetOnGoingAdapter.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C1073816 extends FunctionReferenceImpl implements Function3<LayoutInflater, ViewGroup, Boolean, C44794j1> {
        public static final C1073816 INSTANCE = new C1073816();

        @Override // p852kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ C44794j1 invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            return invoke(layoutInflater, viewGroup, bool.booleanValue());
        }

        public C1073816() {
            super(3, C44794j1.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/kubi/assets/databinding/AssetItemOngoingHeaderBinding;", 0);
        }

        public final C44794j1 invoke(LayoutInflater p11, ViewGroup viewGroup, boolean z11) {
            Intrinsics.checkNotNullParameter(p11, "p0");
            return C44794j1.m99107c(p11, viewGroup, z11);
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.overview.ongoing.AssetOnGoingAdapter$18 */
    /* JADX INFO: compiled from: AssetOnGoingAdapter.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C1073918 extends FunctionReferenceImpl implements Function3<LayoutInflater, ViewGroup, Boolean, C44817m1> {
        public static final C1073918 INSTANCE = new C1073918();

        @Override // p852kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ C44817m1 invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            return invoke(layoutInflater, viewGroup, bool.booleanValue());
        }

        public C1073918() {
            super(3, C44817m1.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/kubi/assets/databinding/AssetItemOngoingLoadMoreBinding;", 0);
        }

        public final C44817m1 invoke(LayoutInflater p11, ViewGroup viewGroup, boolean z11) {
            Intrinsics.checkNotNullParameter(p11, "p0");
            return C44817m1.m99156c(p11, viewGroup, z11);
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.overview.ongoing.AssetOnGoingAdapter$2 */
    /* JADX INFO: compiled from: AssetOnGoingAdapter.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C107402 extends FunctionReferenceImpl implements Function3<LayoutInflater, ViewGroup, Boolean, C44762f1> {
        public static final C107402 INSTANCE = new C107402();

        @Override // p852kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ C44762f1 invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            return invoke(layoutInflater, viewGroup, bool.booleanValue());
        }

        public C107402() {
            super(3, C44762f1.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/kubi/assets/databinding/AssetItemOngoingContractBinding;", 0);
        }

        public final C44762f1 invoke(LayoutInflater p11, ViewGroup viewGroup, boolean z11) {
            Intrinsics.checkNotNullParameter(p11, "p0");
            return C44762f1.m99039c(p11, viewGroup, z11);
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.overview.ongoing.AssetOnGoingAdapter$4 */
    /* JADX INFO: compiled from: AssetOnGoingAdapter.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C107414 extends FunctionReferenceImpl implements Function3<LayoutInflater, ViewGroup, Boolean, C44778h1> {
        public static final C107414 INSTANCE = new C107414();

        @Override // p852kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ C44778h1 invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            return invoke(layoutInflater, viewGroup, bool.booleanValue());
        }

        public C107414() {
            super(3, C44778h1.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/kubi/assets/databinding/AssetItemOngoingCrossBinding;", 0);
        }

        public final C44778h1 invoke(LayoutInflater p11, ViewGroup viewGroup, boolean z11) {
            Intrinsics.checkNotNullParameter(p11, "p0");
            return C44778h1.m99073c(p11, viewGroup, z11);
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.overview.ongoing.AssetOnGoingAdapter$6 */
    /* JADX INFO: compiled from: AssetOnGoingAdapter.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C107426 extends FunctionReferenceImpl implements Function3<LayoutInflater, ViewGroup, Boolean, C44802k1> {
        public static final C107426 INSTANCE = new C107426();

        @Override // p852kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ C44802k1 invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            return invoke(layoutInflater, viewGroup, bool.booleanValue());
        }

        public C107426() {
            super(3, C44802k1.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/kubi/assets/databinding/AssetItemOngoingIsolatedBinding;", 0);
        }

        public final C44802k1 invoke(LayoutInflater p11, ViewGroup viewGroup, boolean z11) {
            Intrinsics.checkNotNullParameter(p11, "p0");
            return C44802k1.m99124c(p11, viewGroup, z11);
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.overview.ongoing.AssetOnGoingAdapter$8 */
    /* JADX INFO: compiled from: AssetOnGoingAdapter.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C107438 extends FunctionReferenceImpl implements Function3<LayoutInflater, ViewGroup, Boolean, C44824n1> {
        public static final C107438 INSTANCE = new C107438();

        @Override // p852kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ C44824n1 invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            return invoke(layoutInflater, viewGroup, bool.booleanValue());
        }

        public C107438() {
            super(3, C44824n1.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/kubi/assets/databinding/AssetItemOngoingRobotBinding;", 0);
        }

        public final C44824n1 invoke(LayoutInflater p11, ViewGroup viewGroup, boolean z11) {
            Intrinsics.checkNotNullParameter(p11, "p0");
            return C44824n1.m99174c(p11, viewGroup, z11);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetOnGoingAdapter(@NotNull AssetOnGoingFragment fragment, @NotNull ProductDiffCallBack diffCallBack, @NotNull List<ProductItem> data) {
        super(diffCallBack, data);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(diffCallBack, "diffCallBack");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f18399k = fragment;
        this.f18400l = data;
        this.f18402n = new AssetOnGoingAdapterHelper();
        setHasStableIds(true);
        C37732e.m85036d(this, new Function1() { // from class: com.kubi.assets.overview.ongoing.a
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(AssetOnGoingAdapter.m18667x((ProductItem) obj));
            }
        });
        C37732e.m85034b(this, 1, C107402.INSTANCE, new Function3() { // from class: com.kubi.assets.overview.ongoing.b
            @Override // p852kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return AssetOnGoingAdapter.m18668y(this.f18422b, (C37728a) obj, ((Integer) obj2).intValue(), (ProductItem) obj3);
            }
        });
        C37732e.m85034b(this, 3, C107414.INSTANCE, new Function3() { // from class: com.kubi.assets.overview.ongoing.c
            @Override // p852kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return AssetOnGoingAdapter.m18649A(this.f18423b, (C37728a) obj, ((Integer) obj2).intValue(), (ProductItem) obj3);
            }
        });
        C37732e.m85034b(this, 2, C107426.INSTANCE, new Function3() { // from class: com.kubi.assets.overview.ongoing.d
            @Override // p852kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return AssetOnGoingAdapter.m18650B(this.f18424b, (C37728a) obj, ((Integer) obj2).intValue(), (ProductItem) obj3);
            }
        });
        C37732e.m85034b(this, 4, C107438.INSTANCE, new Function3() { // from class: com.kubi.assets.overview.ongoing.e
            @Override // p852kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return AssetOnGoingAdapter.m18651C(this.f18425b, (C37728a) obj, ((Integer) obj2).intValue(), (ProductItem) obj3);
            }
        });
        C37732e.m85034b(this, 8, C1073510.INSTANCE, new Function3() { // from class: com.kubi.assets.overview.ongoing.f
            @Override // p852kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return AssetOnGoingAdapter.m18652D(this.f18426b, (C37728a) obj, ((Integer) obj2).intValue(), (ProductItem) obj3);
            }
        });
        C37732e.m85034b(this, 9, C1073612.INSTANCE, new Function3() { // from class: com.kubi.assets.overview.ongoing.g
            @Override // p852kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return AssetOnGoingAdapter.m18653E(this.f18427b, (C37728a) obj, ((Integer) obj2).intValue(), (ProductItem) obj3);
            }
        });
        C37732e.m85034b(this, 5, C1073714.INSTANCE, new Function3() { // from class: com.kubi.assets.overview.ongoing.h
            @Override // p852kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return AssetOnGoingAdapter.m18654F(this.f18428b, (C37728a) obj, ((Integer) obj2).intValue(), (ProductItem) obj3);
            }
        });
        C37732e.m85034b(this, 6, C1073816.INSTANCE, new Function3() { // from class: com.kubi.assets.overview.ongoing.i
            @Override // p852kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return AssetOnGoingAdapter.m18655G(this.f18429b, (C37728a) obj, ((Integer) obj2).intValue(), (ProductItem) obj3);
            }
        });
        C37732e.m85034b(this, 7, C1073918.INSTANCE, new Function3() { // from class: com.kubi.assets.overview.ongoing.j
            @Override // p852kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return AssetOnGoingAdapter.m18656H(this.f18430b, (C37728a) obj, ((Integer) obj2).intValue(), (ProductItem) obj3);
            }
        });
    }

    /* JADX INFO: renamed from: A */
    public static final Unit m18649A(AssetOnGoingAdapter assetOnGoingAdapter, C37728a holder, int i11, ProductItem item) throws JSONException {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        assetOnGoingAdapter.m18671K(holder, item);
        ShowHideTextView.m54778d(holder.itemView, assetOnGoingAdapter.f18401m);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B */
    public static final Unit m18650B(AssetOnGoingAdapter assetOnGoingAdapter, C37728a holder, int i11, ProductItem item) throws JSONException {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        assetOnGoingAdapter.m18674N(holder, i11, item);
        ShowHideTextView.m54778d(holder.itemView, assetOnGoingAdapter.f18401m);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C */
    public static final Unit m18651C(AssetOnGoingAdapter assetOnGoingAdapter, C37728a holder, int i11, ProductItem item) throws JSONException {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        assetOnGoingAdapter.m18677Q(holder, i11, item);
        ShowHideTextView.m54778d(holder.itemView, assetOnGoingAdapter.f18401m);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D */
    public static final Unit m18652D(AssetOnGoingAdapter assetOnGoingAdapter, C37728a holder, int i11, ProductItem item) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        assetOnGoingAdapter.m18670J(holder, item);
        ShowHideTextView.m54778d(holder.itemView, assetOnGoingAdapter.f18401m);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E */
    public static final Unit m18653E(AssetOnGoingAdapter assetOnGoingAdapter, C37728a holder, int i11, ProductItem item) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        assetOnGoingAdapter.m18675O(holder, item);
        ShowHideTextView.m54778d(holder.itemView, assetOnGoingAdapter.f18401m);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F */
    public static final Unit m18654F(AssetOnGoingAdapter assetOnGoingAdapter, C37728a holder, int i11, ProductItem item) throws JSONException {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        assetOnGoingAdapter.m18672L(holder, i11, item);
        ShowHideTextView.m54778d(holder.itemView, assetOnGoingAdapter.f18401m);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G */
    public static final Unit m18655G(AssetOnGoingAdapter assetOnGoingAdapter, C37728a holder, int i11, ProductItem item) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        assetOnGoingAdapter.m18673M(holder, i11, item);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H */
    public static final Unit m18656H(AssetOnGoingAdapter assetOnGoingAdapter, C37728a holder, int i11, ProductItem item) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        assetOnGoingAdapter.m18676P(holder, item);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x */
    public static final int m18667x(ProductItem it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getF18435a();
    }

    /* JADX INFO: renamed from: y */
    public static final Unit m18668y(AssetOnGoingAdapter assetOnGoingAdapter, C37728a holder, int i11, ProductItem item) throws JSONException {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        assetOnGoingAdapter.m18669I(holder, i11, item);
        ShowHideTextView.m54778d(holder.itemView, assetOnGoingAdapter.f18401m);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I */
    public final void m18669I(C37728a<C44762f1> c37728a, int i11, ProductItem productItem) throws JSONException {
        ProductItem.ContractItem contractItem = productItem instanceof ProductItem.ContractItem ? (ProductItem.ContractItem) productItem : null;
        if (contractItem == null) {
            return;
        }
        C44762f1 c44762f1 = (C44762f1) c37728a.m85032b();
        C24277v.m58542g(c44762f1.f99882c, contractItem.getIconUrl());
        AssetOnGoingAdapterHelper assetOnGoingAdapterHelper = this.f18402n;
        RoundImageView ivBg = c44762f1.f99881b;
        Intrinsics.checkNotNullExpressionValue(ivBg, "ivBg");
        assetOnGoingAdapterHelper.m18766f(ivBg, contractItem.getBackground());
        c44762f1.f99891l.setText(contractItem.getFormatSymbol());
        c44762f1.f99885f.setText(contractItem.getSide());
        c44762f1.f99886g.setText(contractItem.getFormatMarginMode() + ' ' + contractItem.getLeverage());
        c44762f1.f99893n.setText(contractItem.getPositionText());
        c44762f1.f99892m.setText(contractItem.getUnPnl());
        c44762f1.f99894o.setText(contractItem.getRoi());
        c44762f1.f99889j.setText(contractItem.getMarkPrice());
        ShapeTextView trialTagView = c44762f1.f99884e;
        Intrinsics.checkNotNullExpressionValue(trialTagView, "trialTagView");
        C27046k.m66684G(trialTagView, C27025c.m66566d(contractItem.getIsTrial()));
        c44762f1.f99884e.setText(C27092t0.m66896a(contractItem.getPrizeType()));
        c44762f1.f99888i.setText(contractItem.getSecondText());
        c44762f1.f99887h.setText(contractItem.getSecondValue());
        c44762f1.f99894o.setTextDirection(StringsKt.contains$default((CharSequence) contractItem.getRoi(), (CharSequence) C33820nf.f71144W, false, 2, (Object) null) ? 3 : 5);
        AssetOnGoingAdapterHelper assetOnGoingAdapterHelper2 = this.f18402n;
        ViewBinding viewBindingM85032b = c37728a.m85032b();
        Intrinsics.checkNotNullExpressionValue(viewBindingM85032b, "<get-viewBinding>(...)");
        assetOnGoingAdapterHelper2.m18763b((C44762f1) viewBindingM85032b, contractItem.getFormatSymbol(), contractItem.getSide(), contractItem.getFormatMarginMode() + ' ' + contractItem.getLeverage());
        OverviewAnalyticsReporter.f18247a.m18416n(i11, contractItem.getSymbol(), contractItem.getMarginMode(), StringsKt.contains$default((CharSequence) contractItem.getUnPnl(), (CharSequence) C33820nf.f71144W, false, 2, (Object) null));
    }

    /* JADX INFO: renamed from: J */
    public final void m18670J(C37728a<C44770g1> c37728a, ProductItem productItem) {
        ProductItem.CopyTradingItem copyTradingItem = productItem instanceof ProductItem.CopyTradingItem ? (ProductItem.CopyTradingItem) productItem : null;
        if (copyTradingItem == null) {
            return;
        }
        C44770g1 c44770g1 = (C44770g1) c37728a.m85032b();
        C24277v.m58540e(getContext(), copyTradingItem.getAvatarUrl(), c44770g1.f99957c);
        AssetOnGoingAdapterHelper assetOnGoingAdapterHelper = this.f18402n;
        RoundImageView ivBg = c44770g1.f99956b;
        Intrinsics.checkNotNullExpressionValue(ivBg, "ivBg");
        assetOnGoingAdapterHelper.m18766f(ivBg, copyTradingItem.getBackground());
        c44770g1.f99962h.setText(copyTradingItem.getNickName());
        c44770g1.f99958d.setText(copyTradingItem.getDuration());
        c44770g1.f99964j.setText(copyTradingItem.getPnlText());
        c44770g1.f99963i.setText(copyTradingItem.getTotalPnl());
        c44770g1.f99965k.setText(copyTradingItem.getTotalPnlRatio());
        c44770g1.f99961g.setText(copyTradingItem.getCopyAmountText());
        c44770g1.f99960f.setText(copyTradingItem.getCopyAmount());
    }

    /* JADX INFO: renamed from: K */
    public final void m18671K(C37728a<C44778h1> c37728a, ProductItem productItem) throws JSONException {
        ProductItem.CrossItem crossItem = productItem instanceof ProductItem.CrossItem ? (ProductItem.CrossItem) productItem : null;
        if (crossItem == null) {
            return;
        }
        C44778h1 c44778h1 = (C44778h1) c37728a.m85032b();
        c44778h1.f100021g.setText(crossItem.getPositionText());
        c44778h1.f100020f.setText(crossItem.getProfit());
        c44778h1.f100022h.setText(crossItem.getProfitRate());
        this.f18402n.m18764c(getContext(), c44778h1.f100016b, crossItem.m18804e(), crossItem.getHasMore(), crossItem.getTotalCount());
        AssetOnGoingAdapterHelper assetOnGoingAdapterHelper = this.f18402n;
        RoundImageView ivBg = c44778h1.f100017c;
        Intrinsics.checkNotNullExpressionValue(ivBg, "ivBg");
        assetOnGoingAdapterHelper.m18766f(ivBg, crossItem.getBackground());
        AssetOnGoingAdapterHelper assetOnGoingAdapterHelper2 = this.f18402n;
        AssetOnGoingFragment assetOnGoingFragment = this.f18399k;
        FrameLayout riskView = c44778h1.f100018d;
        Intrinsics.checkNotNullExpressionValue(riskView, "riskView");
        assetOnGoingAdapterHelper2.m18767g(assetOnGoingFragment, riskView, crossItem.getRiskViewEntity(), null, false);
        OverviewAnalyticsReporter overviewAnalyticsReporter = OverviewAnalyticsReporter.f18247a;
        List<FundsInfo> listM18804e = crossItem.m18804e();
        overviewAnalyticsReporter.m18413k(C27039d.m66650j(listM18804e != null ? Integer.valueOf(listM18804e.size()) : null), StringsKt.contains$default((CharSequence) crossItem.getProfit(), (CharSequence) C33820nf.f71144W, false, 2, (Object) null));
    }

    /* JADX INFO: renamed from: L */
    public final void m18672L(C37728a<C44786i1> c37728a, int i11, ProductItem productItem) throws JSONException {
        String category;
        ProductItem.FinancialItem financialItem = productItem instanceof ProductItem.FinancialItem ? (ProductItem.FinancialItem) productItem : null;
        if (financialItem == null) {
            return;
        }
        C44786i1 c44786i1 = (C44786i1) c37728a.m85032b();
        C24277v.m58542g(c44786i1.f100107b, financialItem.getIconUrl());
        View viewDivider = c44786i1.f100119n;
        Intrinsics.checkNotNullExpressionValue(viewDivider, "viewDivider");
        AssetExKt.m15138z(viewDivider, !financialItem.getShowTag());
        ShowHideTextView tvHolder = c44786i1.f100114i;
        Intrinsics.checkNotNullExpressionValue(tvHolder, "tvHolder");
        AssetExKt.m15138z(tvHolder, !financialItem.getShowTag());
        ShapeTextView tvLabel = c44786i1.f100115j;
        Intrinsics.checkNotNullExpressionValue(tvLabel, "tvLabel");
        AssetExKt.m15138z(tvLabel, financialItem.getShowTag());
        c44786i1.f100117l.setTextColor(financialItem.getColor());
        c44786i1.f100110e.setTextColor(C22890g.m54291p(getContext()));
        c44786i1.f100116k.setText(financialItem.getCurrency());
        c44786i1.f100114i.setText(financialItem.getHolderText());
        c44786i1.f100115j.setText(financialItem.getCategoryText());
        c44786i1.f100108c.setText(financialItem.getAmount());
        c44786i1.f100113h.setText(financialItem.getDateText());
        AssetOnGoingAdapterHelper assetOnGoingAdapterHelper = this.f18402n;
        BaseTextView tvRevenueName = c44786i1.f100118m;
        Intrinsics.checkNotNullExpressionValue(tvRevenueName, "tvRevenueName");
        ShowHideTextView tvRevenue = c44786i1.f100117l;
        Intrinsics.checkNotNullExpressionValue(tvRevenue, "tvRevenue");
        BaseTextView tvAnnualizedName = c44786i1.f100111f;
        Intrinsics.checkNotNullExpressionValue(tvAnnualizedName, "tvAnnualizedName");
        ShowHideTextView tvAnnualized = c44786i1.f100110e;
        Intrinsics.checkNotNullExpressionValue(tvAnnualized, "tvAnnualized");
        BaseTextView tvEndDateName = c44786i1.f100113h;
        Intrinsics.checkNotNullExpressionValue(tvEndDateName, "tvEndDateName");
        BaseTextView tvEndDate = c44786i1.f100112g;
        Intrinsics.checkNotNullExpressionValue(tvEndDate, "tvEndDate");
        assetOnGoingAdapterHelper.m18765e(tvRevenueName, tvRevenue, tvAnnualizedName, tvAnnualized, tvEndDateName, tvEndDate);
        Intrinsics.checkNotNull(c44786i1);
        assetOnGoingAdapterHelper.m18768h(c44786i1, financialItem.getIncomeAmount(), financialItem.getReturnRate(), financialItem.getMinLockEndTime(), financialItem.getIncomeCurrencyCount());
        OverviewAnalyticsReporter.f18247a.m18415m(i11, financialItem.getCurrency(), Integer.valueOf(financialItem.getSize()));
        BaseTextView tvName = ((C44786i1) c37728a.m85032b()).f100116k;
        Intrinsics.checkNotNullExpressionValue(tvName, "tvName");
        String category2 = financialItem.getCategory();
        if ((category2 == null || true != StringsKt.contains$default((CharSequence) category2, (CharSequence) "PWM_FUND", false, 2, (Object) null)) && ((category = financialItem.getCategory()) == null || true != StringsKt.contains$default((CharSequence) category, (CharSequence) "PWM_FIXED", false, 2, (Object) null))) {
            TextPaint paint = tvName.getPaint();
            if (paint != null) {
                paint.setShader(null);
            }
            TextPaint paint2 = c44786i1.f100117l.getPaint();
            if (paint2 != null) {
                paint2.setShader(null);
            }
            ShapeConstraintLayout yellowBg = c44786i1.f100120o;
            Intrinsics.checkNotNullExpressionValue(yellowBg, "yellowBg");
            AssetExKt.m15138z(yellowBg, false);
            return;
        }
        TextPaint paint3 = tvName.getPaint();
        if (paint3 != null) {
            paint3.setShader(FinanceVipProductAdapter.f17470j.getShader());
        }
        TextPaint paint4 = c44786i1.f100117l.getPaint();
        if (paint4 != null) {
            paint4.setShader(FinanceVipProductAdapter.f17470j.getShader());
        }
        ShapeConstraintLayout yellowBg2 = c44786i1.f100120o;
        Intrinsics.checkNotNullExpressionValue(yellowBg2, "yellowBg");
        AssetExKt.m15138z(yellowBg2, true);
    }

    /* JADX INFO: renamed from: M */
    public final void m18673M(C37728a<C44794j1> c37728a, int i11, ProductItem productItem) {
        ProductItem.HeaderItem headerItem = productItem instanceof ProductItem.HeaderItem ? (ProductItem.HeaderItem) productItem : null;
        if (headerItem == null) {
            return;
        }
        C44794j1 c44794j1 = (C44794j1) c37728a.m85032b();
        c44794j1.f100212g.setText(headerItem.getF18436b());
        Integer alreadyCopyTraders = headerItem.getAlreadyCopyTraders();
        if (alreadyCopyTraders == null || alreadyCopyTraders.intValue() <= 0) {
            ShapeLinearLayout llLeadFollowerBadge = c44794j1.f100209d;
            Intrinsics.checkNotNullExpressionValue(llLeadFollowerBadge, "llLeadFollowerBadge");
            ViewExtKt.m66577h(llLeadFollowerBadge);
        } else {
            ShapeLinearLayout llLeadFollowerBadge2 = c44794j1.f100209d;
            Intrinsics.checkNotNullExpressionValue(llLeadFollowerBadge2, "llLeadFollowerBadge");
            ViewExtKt.m66594y(llLeadFollowerBadge2);
            c44794j1.f100211f.setText(alreadyCopyTraders.toString());
        }
        boolean isExpanded = headerItem.getIsExpanded();
        if (isExpanded) {
            c44794j1.f100207b.setImageResource(R$drawable.ic2_arrow_up_16);
            ImageView ivArrow = c44794j1.f100207b;
            Intrinsics.checkNotNullExpressionValue(ivArrow, "ivArrow");
            ViewExtKt.m66594y(ivArrow);
            View viewDivider = c44794j1.f100213h;
            Intrinsics.checkNotNullExpressionValue(viewDivider, "viewDivider");
            ViewExtKt.m66577h(viewDivider);
            return;
        }
        if (isExpanded) {
            throw new NoWhenBranchMatchedException();
        }
        c44794j1.f100207b.setImageResource(R$drawable.ic2_arrow_down_16);
        ImageView ivArrow2 = c44794j1.f100207b;
        Intrinsics.checkNotNullExpressionValue(ivArrow2, "ivArrow");
        ViewExtKt.m66594y(ivArrow2);
        View viewDivider2 = c44794j1.f100213h;
        Intrinsics.checkNotNullExpressionValue(viewDivider2, "viewDivider");
        AssetExKt.m15138z(viewDivider2, i11 != getItemCount() - 1);
    }

    /* JADX INFO: renamed from: N */
    public final void m18674N(C37728a<C44802k1> c37728a, int i11, ProductItem productItem) throws JSONException {
        ProductItem.IsolatedItem isolatedItem = productItem instanceof ProductItem.IsolatedItem ? (ProductItem.IsolatedItem) productItem : null;
        if (isolatedItem == null) {
            return;
        }
        C44802k1 c44802k1 = (C44802k1) c37728a.m85032b();
        C24277v.m58542g(c44802k1.f100281c, isolatedItem.getIconUrl());
        c44802k1.f100287i.setText(isolatedItem.getName());
        c44802k1.f100289k.setText(isolatedItem.getPositionText());
        c44802k1.f100288j.setText(isolatedItem.getProfit());
        c44802k1.f100290l.setText(isolatedItem.getProfitRate());
        c44802k1.f100285g.setText(isolatedItem.getMarkPrice());
        c44802k1.f100283e.setText(isolatedItem.getLiquidationPrice());
        AssetOnGoingAdapterHelper assetOnGoingAdapterHelper = this.f18402n;
        RoundImageView ivBg = c44802k1.f100280b;
        Intrinsics.checkNotNullExpressionValue(ivBg, "ivBg");
        assetOnGoingAdapterHelper.m18766f(ivBg, isolatedItem.getBackground());
        AssetOnGoingAdapterHelper assetOnGoingAdapterHelper2 = this.f18402n;
        AssetOnGoingFragment assetOnGoingFragment = this.f18399k;
        FrameLayout riskView = c44802k1.f100282d;
        Intrinsics.checkNotNullExpressionValue(riskView, "riskView");
        assetOnGoingAdapterHelper2.m18767g(assetOnGoingFragment, riskView, isolatedItem.getRiskViewEntity(), null, true);
        OverviewAnalyticsReporter.f18247a.m18417o(i11, isolatedItem.getTag(), StringsKt.contains$default((CharSequence) isolatedItem.getProfit(), (CharSequence) C33820nf.f71144W, false, 2, (Object) null));
    }

    /* JADX INFO: renamed from: O */
    public final void m18675O(C37728a<C44810l1> c37728a, ProductItem productItem) {
        ProductItem.LeadTradingItem leadTradingItem = productItem instanceof ProductItem.LeadTradingItem ? (ProductItem.LeadTradingItem) productItem : null;
        if (leadTradingItem == null) {
            return;
        }
        C44810l1 c44810l1 = (C44810l1) c37728a.m85032b();
        C24277v.m58542g(c44810l1.f100352c, leadTradingItem.getIconUrl());
        ImageView ivIcon = c44810l1.f100352c;
        Intrinsics.checkNotNullExpressionValue(ivIcon, "ivIcon");
        ViewExtKt.m66594y(ivIcon);
        AssetOnGoingAdapterHelper assetOnGoingAdapterHelper = this.f18402n;
        RoundImageView ivBg = c44810l1.f100351b;
        Intrinsics.checkNotNullExpressionValue(ivBg, "ivBg");
        assetOnGoingAdapterHelper.m18766f(ivBg, leadTradingItem.getBackground());
        c44810l1.f100360k.setText(leadTradingItem.getFormatSymbol());
        c44810l1.f100354e.setText(leadTradingItem.getSide());
        c44810l1.f100354e.setTextColor(StringsKt.equals(leadTradingItem.getSide(), "Long", true) ? C22890g.m54291p(getContext()) : C22890g.m54289n(getContext()));
        c44810l1.f100355f.setText(leadTradingItem.getFormatMarginMode() + ' ' + leadTradingItem.getLeverage());
        c44810l1.f100362m.setText(leadTradingItem.getPositionText());
        c44810l1.f100361l.setText(leadTradingItem.getPnl());
        c44810l1.f100363n.setText(leadTradingItem.getPnlRatio());
        c44810l1.f100358i.setText(leadTradingItem.getMarkPrice());
        c44810l1.f100356g.setText(leadTradingItem.getLiquidationPrice());
        if (StringsKt.contains$default((CharSequence) leadTradingItem.getPnlRatio(), (CharSequence) C33820nf.f71144W, false, 2, (Object) null)) {
            c44810l1.f100363n.setTextDirection(3);
        } else {
            c44810l1.f100363n.setTextDirection(5);
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m18676P(C37728a<C44817m1> c37728a, ProductItem productItem) {
        ProductItem.LoadMoreItem loadMoreItem = productItem instanceof ProductItem.LoadMoreItem ? (ProductItem.LoadMoreItem) productItem : null;
        if (loadMoreItem == null) {
            return;
        }
        ((C44817m1) c37728a.m85032b()).f100447c.setText(DowngradeExKt.m66551u(C27017c.f54310a.m66516f(R$string.kc_assets_view_more_num, new Object[0]), new Object[]{loadMoreItem.getTotalCount()}, null, 2, null));
    }

    /* JADX INFO: renamed from: Q */
    public final void m18677Q(C37728a<C44824n1> c37728a, int i11, ProductItem productItem) throws JSONException {
        ProductItem.RobotItem robotItem = productItem instanceof ProductItem.RobotItem ? (ProductItem.RobotItem) productItem : null;
        if (robotItem == null) {
            return;
        }
        C44824n1 c44824n1 = (C44824n1) c37728a.m85032b();
        c44824n1.f100480c.setImageResource(robotItem.getDrawableId());
        AssetOnGoingAdapterHelper assetOnGoingAdapterHelper = this.f18402n;
        RoundImageView ivBg = c44824n1.f100479b;
        Intrinsics.checkNotNullExpressionValue(ivBg, "ivBg");
        assetOnGoingAdapterHelper.m18766f(ivBg, robotItem.getBackground());
        c44824n1.f100483f.setText(robotItem.getName());
        c44824n1.f100487j.setText(robotItem.getProductText());
        c44824n1.f100485h.setText(robotItem.getPositionText());
        c44824n1.f100484g.setText(robotItem.getTotalProfit());
        c44824n1.f100486i.setText(robotItem.getTotalProfitRate());
        c44824n1.f100482e.setText(robotItem.getCostText());
        c44824n1.f100481d.setText(robotItem.getTotalCost());
        OverviewAnalyticsReporter.f18247a.m18412j(i11, robotItem.getTag(), StringsKt.contains$default((CharSequence) robotItem.getTotalProfit(), (CharSequence) C33820nf.f71144W, false, 2, (Object) null));
    }

    /* JADX INFO: renamed from: R */
    public final void m18678R(boolean z11) {
        this.f18401m = z11;
    }

    /* JADX INFO: renamed from: S */
    public final void m18679S(@Nullable List<ProductItem> list) {
        this.f18400l.clear();
        if (list != null) {
            this.f18400l.addAll(list);
        }
        notifyDataSetChanged();
    }

    @NotNull
    public final List<ProductItem> getData() {
        return this.f18400l;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int position) {
        int iHashCode;
        ProductItem item = getItem(position);
        if (item instanceof ProductItem.IsolatedItem) {
            iHashCode = ((ProductItem.IsolatedItem) item).getName().hashCode();
        } else {
            int iHashCode2 = 0;
            if (item instanceof ProductItem.RobotItem) {
                String id2 = ((ProductItem.RobotItem) item).getId();
                if (id2 != null) {
                    iHashCode2 = id2.hashCode();
                }
                return iHashCode2;
            }
            if (item instanceof ProductItem.CopyTradingItem) {
                Long leadConfigId = ((ProductItem.CopyTradingItem) item).getLeadConfigId();
                if (leadConfigId != null) {
                    iHashCode2 = leadConfigId.hashCode();
                }
                return iHashCode2;
            }
            if (item instanceof ProductItem.LeadTradingItem) {
                String symbol = ((ProductItem.LeadTradingItem) item).getSymbol();
                if (symbol != null) {
                    iHashCode2 = symbol.hashCode();
                }
                return iHashCode2;
            }
            if (item instanceof ProductItem.FinancialItem) {
                String currency = ((ProductItem.FinancialItem) item).getCurrency();
                if (currency != null) {
                    iHashCode2 = currency.hashCode();
                }
                return iHashCode2;
            }
            if (item instanceof ProductItem.ContractItem) {
                iHashCode = ((ProductItem.ContractItem) item).getFormatSymbol().hashCode();
            } else {
                return position;
            }
        }
        return iHashCode;
    }
}
