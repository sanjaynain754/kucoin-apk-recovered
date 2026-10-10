package com.kubi.assets.lite;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.assets.AssetV2Api;
import com.kubi.assets.R$color;
import com.kubi.assets.R$id;
import com.kubi.assets.R$layout;
import com.kubi.assets.R$string;
import com.kubi.assets.filter.AssetFilterDialogFragment;
import com.kubi.assets.filter.AssetFilterHelper;
import com.kubi.assets.filter.IFilterDialogCallBack;
import com.kubi.assets.filter.ParcelizePair;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.ShowHideTextView;
import com.kubi.router.core.Router;
import com.kubi.sdk.base.p113ui.BasePagingFragment;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.TimeUtils;
import com.kubi.utils.extensions.C27046k;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.tencent.qcloud.tuicore.TUIConstants;
import gf.C37890n;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.functions.Action;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p637ta.C44842p5;
import p830zf.InterfaceC46803i0;
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

/* JADX INFO: compiled from: LiteBaseAccountDetailFragment.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\u00020\u0004:\u0001XB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\r\u001a\u00020\u000eH\u0014J\b\u0010\u000f\u001a\u00020\u000eH\u0014J\b\u0010\u0010\u001a\u00020\u0011H\u0014J\b\u0010\u0012\u001a\u00020\u000eH\u0014J\b\u0010\u0013\u001a\u00020\u000eH\u0014J\b\u00100\u001a\u000201H\u0014J\b\u00102\u001a\u000201H\u0014J\u001a\u00103\u001a\u0002012\u0006\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u000107H\u0016J\b\u00108\u001a\u000201H\u0016J\b\u00109\u001a\u000201H\u0016J\b\u0010:\u001a\u00020\u0016H&J\b\u0010;\u001a\u000201H\u0016J\u0016\u0010B\u001a\u0002012\f\u0010C\u001a\b\u0012\u0004\u0012\u00020>0DH\u0016J\u000e\u0010E\u001a\u0002012\u0006\u0010F\u001a\u00020\u0011J\u0014\u0010G\u001a\u0002012\f\u0010H\u001a\b\u0012\u0004\u0012\u00020I0DJ\u0018\u0010J\u001a\u0002012\u0006\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020IH\u0002J\u0010\u0010N\u001a\u0002012\u0006\u0010M\u001a\u00020IH\u0002J\u0010\u0010O\u001a\u0002012\u0006\u0010P\u001a\u00020QH\u0002J\u000e\u0010R\u001a\u00020S2\u0006\u0010T\u001a\u00020\u0016J\u001a\u0010U\u001a\u0002012\b\u0010V\u001a\u0004\u0018\u00010Q2\u0006\u0010W\u001a\u00020\u0011H\u0002R\u001d\u0010\u0007\u001a\u0004\u0018\u00010\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR-\u0010\u0014\u001a\u001e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015j\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017`\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001b\u0010!\u001a\u00020\"8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b#\u0010$R\u001b\u0010'\u001a\u00020(8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b+\u0010&\u001a\u0004\b)\u0010*R\u001a\u0010,\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R!\u0010<\u001a\u0012\u0012\u0004\u0012\u00020>0=j\b\u0012\u0004\u0012\u00020>`?¢\u0006\b\n\u0000\u001a\u0004\b@\u0010A¨\u0006Y"}, m90084d2 = {"Lcom/kubi/assets/lite/LiteBaseAccountDetailFragment;", ExifInterface.GPS_DIRECTION_TRUE, "Landroid/os/Parcelable;", "Lcom/kubi/sdk/base/ui/BasePagingFragment;", "Lcom/kubi/assets/filter/IFilterDialogCallBack;", "<init>", "()V", "binding", "Lcom/kubi/assets/databinding/LayoutLiteBaseAccountDetailBinding;", "getBinding", "()Lcom/kubi/assets/databinding/LayoutLiteBaseAccountDetailBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "getLayout", "", "getItemLayout", "needDefaultBackground", "", "getEmptyFooterText", "getEndFooterText", "requestParams", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "getRequestParams", "()Ljava/util/HashMap;", "beforeGet", "Lcom/kubi/utils/TimeUtils$BeforeGet;", "getBeforeGet", "()Lcom/kubi/utils/TimeUtils$BeforeGet;", "setBeforeGet", "(Lcom/kubi/utils/TimeUtils$BeforeGet;)V", "assetV2Api", "Lcom/kubi/assets/AssetV2Api;", "getAssetV2Api", "()Lcom/kubi/assets/AssetV2Api;", "assetV2Api$delegate", "Lkotlin/Lazy;", "coinInfoEntity", "Lcom/kubi/data/entity/CoinInfoEntity;", "getCoinInfoEntity", "()Lcom/kubi/data/entity/CoinInfoEntity;", "coinInfoEntity$delegate", "isOpenEye", "()Z", "setOpenEye", "(Z)V", "onReBack", "", "setHeader", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onFilterClick", "onViewMoreClick", "getAccountType", "refreshData", "initParams", "Ljava/util/ArrayList;", "Lcom/kubi/assets/filter/ParcelizePair;", "Lkotlin/collections/ArrayList;", "getInitParams", "()Ljava/util/ArrayList;", "filterCallBack", DbParams.KEY_CHANNEL_RESULT, "", "syncEyeStatus", "isOpen", "setHeaderInfoList", "list", "Lcom/kubi/assets/lite/LiteBaseAccountDetailFragment$AssetHeaderInfo;", "setHeaderItemData", "helper", "Lio/chad/library/adapter/base/BaseViewHolder;", "item", "clickFreezeInfo", "loadFreezeReasonData", "ivArrow", "Lcom/kubi/sdk/widget/shape/view/ShapeImageView;", "getStart", "", "value", "startShowChartAnimator", "imageView", "showAnimation", "AssetHeaderInfo", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nLiteBaseAccountDetailFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiteBaseAccountDetailFragment.kt\ncom/kubi/assets/lite/LiteBaseAccountDetailFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n*L\n1#1,258:1\n147#2,16:259\n17#3,2:275\n*S KotlinDebug\n*F\n+ 1 LiteBaseAccountDetailFragment.kt\ncom/kubi/assets/lite/LiteBaseAccountDetailFragment\n*L\n47#1:259,16\n54#1:275,2\n*E\n"})
public abstract class LiteBaseAccountDetailFragment<T extends Parcelable> extends BasePagingFragment<T> implements IFilterDialogCallBack {

    /* JADX INFO: renamed from: g0 */
    public static final /* synthetic */ KProperty<Object>[] f17864g0 = {Reflection.property1(new PropertyReference1Impl(LiteBaseAccountDetailFragment.class, "binding", "getBinding()Lcom/kubi/assets/databinding/LayoutLiteBaseAccountDetailBinding;", 0))};

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final InterfaceC24293a f17865Z = C45681e.m100799e(this, new Function1<LiteBaseAccountDetailFragment<T>, C44842p5>() { // from class: com.kubi.assets.lite.LiteBaseAccountDetailFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44842p5 invoke(@NotNull LiteBaseAccountDetailFragment<T> fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44842p5.m99210a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C44842p5, Unit>() { // from class: com.kubi.assets.lite.LiteBaseAccountDetailFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C44842p5 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44842p5 c44842p5) {
            invoke(c44842p5);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final HashMap<String, Object> f17866a0 = new HashMap<>();

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public TimeUtils.C27004b f17867b0 = new TimeUtils.C27004b();

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final Lazy f17868c0 = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.lite.s
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return LiteBaseAccountDetailFragment.m17609N3();
        }
    });

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public final Lazy f17869d0 = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.lite.t
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return LiteBaseAccountDetailFragment.m17610P3(this.f17897b);
        }
    });

    /* JADX INFO: renamed from: e0 */
    public boolean f17870e0;

    /* JADX INFO: renamed from: f0 */
    @NotNull
    public final ArrayList<ParcelizePair> f17871f0;

    /* JADX INFO: renamed from: com.kubi.assets.lite.LiteBaseAccountDetailFragment$a, reason: from toString */
    /* JADX INFO: compiled from: LiteBaseAccountDetailFragment.kt */
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003JC\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/assets/lite/LiteBaseAccountDetailFragment$AssetHeaderInfo;", "", "title", "", "value", "subValue", "isShowArrow", "", TUIConstants.TIMPush.NOTIFICATION.ACTION, "Lio/reactivex/functions/Action;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLio/reactivex/functions/Action;)V", "getTitle", "()Ljava/lang/String;", "getValue", "getSubValue", "()Z", "getAction", "()Lio/reactivex/functions/Action;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class AssetHeaderInfo {

        /* JADX INFO: renamed from: a, reason: from toString */
        @Nullable
        public final String title;

        /* JADX INFO: renamed from: b, reason: from toString */
        @Nullable
        public final String value;

        /* JADX INFO: renamed from: c, reason: from toString */
        @Nullable
        public final String subValue;

        /* JADX INFO: renamed from: d, reason: from toString */
        public final boolean isShowArrow;

        /* JADX INFO: renamed from: e, reason: from toString */
        @Nullable
        public final Action action;

        public AssetHeaderInfo(@Nullable String str, @Nullable String str2, @Nullable String str3, boolean z11, @Nullable Action action) {
            this.title = str;
            this.value = str2;
            this.subValue = str3;
            this.isShowArrow = z11;
            this.action = action;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AssetHeaderInfo)) {
                return false;
            }
            AssetHeaderInfo assetHeaderInfo = (AssetHeaderInfo) other;
            return Intrinsics.areEqual(this.title, assetHeaderInfo.title) && Intrinsics.areEqual(this.value, assetHeaderInfo.value) && Intrinsics.areEqual(this.subValue, assetHeaderInfo.subValue) && this.isShowArrow == assetHeaderInfo.isShowArrow && Intrinsics.areEqual(this.action, assetHeaderInfo.action);
        }

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Action getAction() {
            return this.action;
        }

        @Nullable
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @Nullable
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getIsShowArrow() {
            return this.isShowArrow;
        }

        public int hashCode() {
            String str = this.title;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.value;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.subValue;
            int iHashCode3 = (((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + Boolean.hashCode(this.isShowArrow)) * 31;
            Action action = this.action;
            return iHashCode3 + (action != null ? action.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "AssetHeaderInfo(title=" + this.title + ", value=" + this.value + ", subValue=" + this.subValue + ", isShowArrow=" + this.isShowArrow + ", action=" + this.action + ')';
        }

        public /* synthetic */ AssetHeaderInfo(String str, String str2, String str3, boolean z11, Action action, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? false : z11, (i11 & 16) != 0 ? null : action);
        }
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: C3 */
    public boolean mo15903C3() {
        return false;
    }

    @NotNull
    /* JADX INFO: renamed from: Q3 */
    public abstract String mo17584Q3();

    /* JADX INFO: renamed from: d4 */
    public final void m17625d4(BaseViewHolder baseViewHolder, final AssetHeaderInfo assetHeaderInfo) {
        BaseViewHolder text = baseViewHolder.setText(R$id.tvTitle, assetHeaderInfo.getTitle());
        int i11 = R$id.tvValue;
        BaseViewHolder text2 = text.setText(i11, assetHeaderInfo.getValue());
        Context mContext = this.mContext;
        Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
        text2.setTextColor(i11, C27046k.m66699n(mContext, Intrinsics.areEqual(assetHeaderInfo.getValue(), "0.00") ? R$color.c_text40 : R$color.c_text));
        ImageView imageView = (ImageView) baseViewHolder.getView(R$id.ivArrow);
        ShowHideTextView showHideTextView = (ShowHideTextView) baseViewHolder.getView(i11);
        Intrinsics.checkNotNull(imageView);
        Intrinsics.checkNotNull(showHideTextView);
        C27046k.m66681D(new View[]{imageView, showHideTextView}, new Function0() { // from class: com.kubi.assets.lite.r
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LiteBaseAccountDetailFragment.m17614e4(this.f17895b, assetHeaderInfo);
            }
        });
        imageView.setVisibility((!assetHeaderInfo.getIsShowArrow() || Intrinsics.areEqual(assetHeaderInfo.getValue(), "0.00")) ? 8 : 0);
        ShowHideTextView.m54778d(baseViewHolder.itemView, this.f17870e0);
    }

    /* JADX INFO: renamed from: T3 */
    private final C44842p5 m17611T3() {
        return (C44842p5) this.f17865Z.getValue(this, f17864g0[0]);
    }

    /* JADX INFO: renamed from: b4 */
    public static final void m17613b4(LiteBaseAccountDetailFragment liteBaseAccountDetailFragment) {
        DialogFragmentHelper dialogFragmentHelperNewInstance = AssetFilterDialogFragment.f17329u0.newInstance(liteBaseAccountDetailFragment.mo17584Q3(), liteBaseAccountDetailFragment.f17871f0);
        FragmentManager childFragmentManager = liteBaseAccountDetailFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        dialogFragmentHelperNewInstance.show(childFragmentManager, liteBaseAccountDetailFragment.mo17584Q3());
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: F3 */
    public void mo15906F3() {
        this.f17867b0 = new TimeUtils.C27004b();
        super.mo15906F3();
    }

    @NotNull
    /* JADX INFO: renamed from: R3 */
    public final AssetV2Api m17616R3() {
        Object value = this.f17868c0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (AssetV2Api) value;
    }

    @NotNull
    /* JADX INFO: renamed from: S3, reason: from getter */
    public final TimeUtils.C27004b getF17867b0() {
        return this.f17867b0;
    }

    @NotNull
    /* JADX INFO: renamed from: U3 */
    public final CoinInfoEntity m17618U3() {
        return (CoinInfoEntity) this.f17869d0.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: V3 */
    public final ArrayList<ParcelizePair> m17619V3() {
        return this.f17871f0;
    }

    @NotNull
    /* JADX INFO: renamed from: W3 */
    public final HashMap<String, Object> m17620W3() {
        return this.f17866a0;
    }

    /* JADX INFO: renamed from: X3 */
    public final long m17621X3(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        int iHashCode = value.hashCode();
        if (iHashCode == -1480287667) {
            if (value.equals("ONE_WEEK")) {
                return this.f17867b0.m66434a(7, 6);
            }
            return 0L;
        }
        if (iHashCode == 1314132820) {
            if (value.equals("HALF_MONTH")) {
                return this.f17867b0.m66434a(15, 6);
            }
            return 0L;
        }
        if (iHashCode == 1346794279 && value.equals("ONE_MONTH")) {
            return this.f17867b0.m66434a(30, 6);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: Y3, reason: from getter */
    public final boolean getF17870e0() {
        return this.f17870e0;
    }

    /* JADX INFO: renamed from: c4 */
    public final void m17624c4(@NotNull List<AssetHeaderInfo> list) {
        RecyclerView recyclerView;
        C44842p5 c44842p5M17611T3;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        Intrinsics.checkNotNullParameter(list, "list");
        C44842p5 c44842p5M17611T4 = m17611T3();
        if (((c44842p5M17611T4 == null || (recyclerView3 = c44842p5M17611T4.f100641l) == null) ? null : recyclerView3.getAdapter()) == null && (c44842p5M17611T3 = m17611T3()) != null && (recyclerView2 = c44842p5M17611T3.f100641l) != null) {
            final int i11 = R$layout.lite_item_asset_header_info;
            recyclerView2.setAdapter(new BaseQuickAdapter<AssetHeaderInfo, BaseViewHolder>(this, i11) { // from class: com.kubi.assets.lite.LiteBaseAccountDetailFragment$setHeaderInfoList$1

                /* JADX INFO: renamed from: i */
                public final /* synthetic */ LiteBaseAccountDetailFragment<T> f17877i;

                {
                    this.f17877i = this;
                }

                @Override // io.chad.library.adapter.base.BaseQuickAdapter
                /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
                public void convert(BaseViewHolder helper, LiteBaseAccountDetailFragment.AssetHeaderInfo item) {
                    Intrinsics.checkNotNullParameter(helper, "helper");
                    Intrinsics.checkNotNullParameter(item, "item");
                    this.f17877i.m17625d4(helper, item);
                }
            });
        }
        C44842p5 c44842p5M17611T5 = m17611T3();
        RecyclerView.Adapter adapter = (c44842p5M17611T5 == null || (recyclerView = c44842p5M17611T5.f100641l) == null) ? null : recyclerView.getAdapter();
        BaseQuickAdapter baseQuickAdapter = adapter instanceof BaseQuickAdapter ? (BaseQuickAdapter) adapter : null;
        if (baseQuickAdapter != null) {
            baseQuickAdapter.replaceData(list);
        }
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment, com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.layout_lite_base_account_detail;
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment, com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) throws Exception {
        ImageView imageView;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        this.f46496X.setEnabled(false);
        C44842p5 c44842p5M17611T3 = m17611T3();
        if (c44842p5M17611T3 != null && (imageView = c44842p5M17611T3.f100636g) != null) {
            C27046k.m66711z(imageView, 0L, new Function0() { // from class: com.kubi.assets.lite.u
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LiteBaseAccountDetailFragment.m17612a4(this.f17898b);
                }
            }, 1, null);
        }
        AssetFilterHelper.m16577f(AssetFilterHelper.f17335a, mo17584Q3(), null, 2, null);
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: t3 */
    public int mo15921t3() {
        return R$string.coin_detail_empty;
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: v3 */
    public int mo15923v3() {
        Object objM56186h = Router.f46192a.m56186h(InterfaceC46803i0.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h != null ? ((InterfaceC46803i0) objM56186h).m103135a() : true) {
            return R$string.coin_no_more_data;
        }
        return 0;
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: x3 */
    public int mo15925x3() {
        return R$layout.item_base_account_detail;
    }

    @Override // com.kubi.assets.filter.IFilterDialogCallBack
    /* JADX INFO: renamed from: z */
    public void mo15926z(@NotNull List<ParcelizePair> result) {
        Intrinsics.checkNotNullParameter(result, "result");
        super.mo15926z(result);
        this.f17871f0.clear();
        this.f17871f0.addAll(result);
        mo15906F3();
    }

    public LiteBaseAccountDetailFragment() {
        ArrayList<ParcelizePair> arrayList = new ArrayList<>();
        arrayList.add(new ParcelizePair("direction", ""));
        arrayList.add(new ParcelizePair("time", "ONE_MONTH"));
        arrayList.add(new ParcelizePair("bizType", ""));
        this.f17871f0 = arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N3 */
    public static final AssetV2Api m17609N3() {
        return (AssetV2Api) C42597a.m93386b().create(AssetV2Api.class);
    }

    /* JADX INFO: renamed from: P3 */
    public static final CoinInfoEntity m17610P3(LiteBaseAccountDetailFragment liteBaseAccountDetailFragment) {
        String str;
        String stringExtra = liteBaseAccountDetailFragment.requireActivity().getIntent().getStringExtra("code");
        C37890n c37890n = C37890n.f85269a;
        if (stringExtra == null) {
            str = "";
        } else {
            str = stringExtra;
        }
        CoinInfoEntity coinInfoEntityM85613u = c37890n.m85613u(str);
        if (coinInfoEntityM85613u == null) {
            CoinInfoEntity coinInfoEntity = new CoinInfoEntity();
            coinInfoEntity.setCode(stringExtra);
            coinInfoEntity.setCurrency(stringExtra);
            return coinInfoEntity;
        }
        return coinInfoEntityM85613u;
    }

    /* JADX INFO: renamed from: a4 */
    public static final Unit m17612a4(final LiteBaseAccountDetailFragment liteBaseAccountDetailFragment) throws Exception {
        if (liteBaseAccountDetailFragment.getContext() != null) {
            liteBaseAccountDetailFragment.m17623Z3();
            AssetFilterHelper.f17335a.m16578e(liteBaseAccountDetailFragment.mo17584Q3(), new Action() { // from class: com.kubi.assets.lite.v
                @Override // io.reactivex.functions.Action
                public final void run() {
                    LiteBaseAccountDetailFragment.m17613b4(this.f17899b);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e4 */
    public static final Unit m17614e4(LiteBaseAccountDetailFragment liteBaseAccountDetailFragment, AssetHeaderInfo assetHeaderInfo) throws Exception {
        liteBaseAccountDetailFragment.m17615O3(assetHeaderInfo);
        return Unit.INSTANCE;
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: G3 */
    public void mo15907G3() {
        Context context = getContext();
        if (context != null) {
            this.f46495W.addHeaderView(new View(context));
        }
    }

    /* JADX INFO: renamed from: O3 */
    public final void m17615O3(AssetHeaderInfo assetHeaderInfo) throws Exception {
        Action action;
        if (assetHeaderInfo.getIsShowArrow() && !Intrinsics.areEqual(assetHeaderInfo.getValue(), "0.00") && (action = assetHeaderInfo.getAction()) != null) {
            action.run();
        }
    }

    /* JADX INFO: renamed from: f4 */
    public final void m17626f4(boolean z11) {
        LiteAccountDetailHeaderView liteAccountDetailHeaderView;
        RecyclerView recyclerView;
        RecyclerView.Adapter adapter;
        C44842p5 c44842p5M17611T3 = m17611T3();
        if (c44842p5M17611T3 != null) {
            liteAccountDetailHeaderView = c44842p5M17611T3.f100633d;
        } else {
            liteAccountDetailHeaderView = null;
        }
        ShowHideTextView.m54778d(liteAccountDetailHeaderView, z11);
        this.f17870e0 = z11;
        C44842p5 c44842p5M17611T4 = m17611T3();
        if (c44842p5M17611T4 != null && (recyclerView = c44842p5M17611T4.f100641l) != null && (adapter = recyclerView.getAdapter()) != null) {
            adapter.notifyDataSetChanged();
        }
        this.f46495W.notifyDataSetChanged();
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public void onReBack() {
        super.onReBack();
        mo15906F3();
    }

    /* JADX INFO: renamed from: Z3 */
    public void m17623Z3() {
    }
}
