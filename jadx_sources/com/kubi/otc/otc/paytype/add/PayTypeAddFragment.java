package com.kubi.otc.otc.paytype.add;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import cn.jiguang.privates.push.constants.JPushConstants;
import com.blankj.utilcode.util.C5275i0;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.otc.OtcUserManager;
import com.kubi.otc.R$color;
import com.kubi.otc.R$drawable;
import com.kubi.otc.R$font;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$string;
import com.kubi.otc.entity.AdPayType;
import com.kubi.otc.entity.PayTemplate;
import com.kubi.otc.entity.PayTypeEntity;
import com.kubi.otc.entity.PrecheckBean;
import com.kubi.otc.otc.paytype.C20143e;
import com.kubi.otc.otc.paytype.PayTypeBoxItem;
import com.kubi.otc.otc.paytype.PayTypeChooseItem;
import com.kubi.otc.otc.paytype.PayTypeImageItem;
import com.kubi.otc.otc.paytype.PayTypeInputItem;
import com.kubi.otc.otc.paytype.PayTypeItem;
import com.kubi.otc.otc.paytype.PayTypeSelectFragment;
import com.kubi.otc.service.OtcDepend;
import com.kubi.payment.p2p.widget.PaymentMethodTextView;
import com.kubi.payment.util.C21457l;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.FilterEmojiEditText;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.base.p113ui.BaseFragmentActivity;
import com.kubi.sdk.base.p113ui.OldBaseFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.dialog.BottomSheetDialogHelper;
import com.kubi.sdk.widget.dialog.SelectEntity;
import com.kubi.utils.C27099x;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.functions.BiConsumer;
import io.reactivex.functions.Consumer;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import lt.C42300e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p011a9.C0206f;
import p270ft.C37616f;
import p402kf.C41016c;
import p569qq.C43846g;
import p569qq.C43852m;
import p752x8.AbstractC46099a;
import p778xy.C46338a;
import p852kotlin.Function;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.IntIterator;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.IntRange;
import p852kotlin.ranges.RangesKt;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;
import ro.C44128b;
import w00.C45681e;

/* JADX INFO: compiled from: PayTypeAddFragment.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010,\u001a\u00020-H\u0014J\u001a\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u000103H\u0016J\b\u00104\u001a\u00020/H\u0002J\u0012\u00105\u001a\u00020/2\b\u00106\u001a\u0004\u0018\u000107H\u0002J\b\u00108\u001a\u00020/H\u0002J\b\u00109\u001a\u00020/H\u0002J\b\u0010:\u001a\u00020/H\u0002J\u0012\u0010;\u001a\u00020/2\b\u0010<\u001a\u0004\u0018\u00010\u0005H\u0002J\f\u0010=\u001a\u00020/*\u00020>H\u0002J\u001a\u0010?\u001a\u00020/*\u00020>2\f\u0010@\u001a\b\u0012\u0004\u0012\u00020A0\u000bH\u0002J\"\u0010B\u001a\u00020/2\u0006\u0010C\u001a\u00020-2\u0006\u0010D\u001a\u00020-2\b\u0010E\u001a\u0004\u0018\u00010FH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0015\u001a\u0004\u0018\u00010\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0017\u0010\u0018R'\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001b0\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0014\u001a\u0004\b\u001c\u0010\u001dR\u000e\u0010\u001f\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u0010!\u001a\u0004\u0018\u00010\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b#\u0010$R\u001b\u0010'\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u0014\u001a\u0004\b(\u0010)R\u000e\u0010+\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006G"}, m90084d2 = {"Lcom/kubi/otc/otc/paytype/add/PayTypeAddFragment;", "Lcom/kubi/sdk/base/ui/OldBaseFragment;", "<init>", "()V", "path", "", "payTypeId", "isEidtPayType", "", "payTypeTemplateList", "", "", "Lcom/kubi/otc/entity/PayTemplate;", "mapParams", "", "viewModel", "Lcom/kubi/otc/otc/paytype/add/PayTypeAddViewModel;", "getViewModel", "()Lcom/kubi/otc/otc/paytype/add/PayTypeAddViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "editDatas", "Lcom/kubi/otc/entity/AdPayType;", "getEditDatas", "()Lcom/kubi/otc/entity/AdPayType;", "editDatas$delegate", "editMapDatas", "", "getEditMapDatas", "()Ljava/util/Map;", "editMapDatas$delegate", "needRiskAlert", "riskAlertMessage", "binding", "Lcom/kubi/otc/databinding/BotcFragmentAddReceivedWayBinding;", "getBinding", "()Lcom/kubi/otc/databinding/BotcFragmentAddReceivedWayBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "securityWidgetOpen", "getSecurityWidgetOpen", "()Z", "securityWidgetOpen$delegate", "userPayTypeName", "getLayout", "", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "initData", "initView", "config", "Lcom/kubi/otc/entity/PayTypeEntity;", "observeData", "checkEnable", "submitInfo", "preAddUnsupportedFieldWarn", "key", "hideUnsupportedFieldWarn", "Landroid/widget/LinearLayout;", "showUnsupportedFieldWarn", "checkFailFields", "Lcom/kubi/otc/entity/PrecheckBean$FailField;", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPayTypeAddFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PayTypeAddFragment.kt\ncom/kubi/otc/otc/paytype/add/PayTypeAddFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 ViewExt.kt\ncom/kubi/utils/extensions/core/ViewExtKt\n+ 7 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n+ 8 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 9 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,402:1\n106#2,15:403\n147#3,16:418\n1#4:434\n1869#5,2:435\n1549#5:438\n1620#5,3:439\n808#5,11:442\n1869#5,2:453\n1549#5:456\n1620#5,3:457\n1549#5:461\n1620#5,3:462\n1869#5,2:465\n1208#5,2:467\n1236#5,4:469\n1549#5:474\n1620#5,3:475\n1869#5,2:478\n1549#5:481\n1620#5,3:482\n1563#5:500\n1634#5,3:501\n372#6:437\n372#6:455\n372#6:460\n372#6:473\n372#6:480\n160#7,4:485\n160#7,4:489\n35#8,4:493\n39#8:499\n44#9,2:497\n*S KotlinDebug\n*F\n+ 1 PayTypeAddFragment.kt\ncom/kubi/otc/otc/paytype/add/PayTypeAddFragment\n*L\n79#1:403,15\n95#1:418,16\n182#1:435,2\n323#1:438\n323#1:439,3\n323#1:442,11\n323#1:453,2\n333#1:456\n333#1:457,3\n372#1:461\n372#1:462,3\n372#1:465,2\n378#1:467,2\n378#1:469,4\n379#1:474\n379#1:475,3\n379#1:478,2\n394#1:481\n394#1:482,3\n226#1:500\n226#1:501,3\n323#1:437\n333#1:455\n372#1:460\n379#1:473\n394#1:480\n83#1:485,4\n86#1:489,4\n105#1:493,4\n105#1:499\n105#1:497,2\n*E\n"})
public final class PayTypeAddFragment extends OldBaseFragment {

    /* JADX INFO: renamed from: h0 */
    public static final /* synthetic */ KProperty<Object>[] f37900h0 = {Reflection.property1(new PropertyReference1Impl(PayTypeAddFragment.class, "binding", "getBinding()Lcom/kubi/otc/databinding/BotcFragmentAddReceivedWayBinding;", 0))};

    /* JADX INFO: renamed from: W */
    public boolean f37903W;

    /* JADX INFO: renamed from: X */
    @Nullable
    public Map<String, ? extends List<PayTemplate>> f37904X;

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final Lazy f37906Z;

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final Lazy f37907a0;

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final Lazy f37908b0;

    /* JADX INFO: renamed from: c0 */
    public boolean f37909c0;

    /* JADX INFO: renamed from: d0 */
    @Nullable
    public String f37910d0;

    /* JADX INFO: renamed from: e0 */
    @NotNull
    public final InterfaceC24293a f37911e0;

    /* JADX INFO: renamed from: f0 */
    @NotNull
    public final Lazy f37912f0;

    /* JADX INFO: renamed from: g0 */
    @NotNull
    public String f37913g0;

    /* JADX INFO: renamed from: U */
    @NotNull
    public String f37901U = "";

    /* JADX INFO: renamed from: V */
    @NotNull
    public String f37902V = "";

    /* JADX INFO: renamed from: Y */
    @NotNull
    public Map<String, String> f37905Y = new LinkedHashMap();

    /* JADX INFO: renamed from: com.kubi.otc.otc.paytype.add.PayTypeAddFragment$a */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJSONOrNull$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJSONOrNull$1\n*L\n1#1,300:1\n*E\n"})
    public static final class C20103a extends TypeToken<Map<String, ? extends Object>> {
    }

    /* JADX INFO: renamed from: com.kubi.otc.otc.paytype.add.PayTypeAddFragment$b */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJSONOrNull$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJSONOrNull$1\n*L\n1#1,300:1\n*E\n"})
    public static final class C20104b extends TypeToken<Map<String, ? extends Object>> {
    }

    /* JADX INFO: renamed from: com.kubi.otc.otc.paytype.add.PayTypeAddFragment$c */
    /* JADX INFO: compiled from: PayTypeAddFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C20105c implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f37914b;

        public C20105c(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f37914b = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p852kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f37914b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f37914b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: com.kubi.otc.otc.paytype.add.PayTypeAddFragment$d */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class C20106d extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: P3 */
    private final boolean m45167P3() {
        return ((Boolean) this.f37912f0.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: T3 */
    public static final void m45169T3(final PayTypeAddFragment payTypeAddFragment, Boolean bool, final List list) throws Exception {
        C20143e.m45240f(payTypeAddFragment, new BiConsumer() { // from class: com.kubi.otc.otc.paytype.add.m
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj, Object obj2) {
                PayTypeAddFragment.m45170U3(this.f37940b, list, (Boolean) obj, (Map) obj2);
            }
        }, true);
    }

    /* JADX INFO: renamed from: W3 */
    public static final Unit m45171W3(PayTypeAddFragment payTypeAddFragment, PayTemplate payTemplate, PayTypeInputItem payTypeInputItem, CharSequence charSequence) {
        payTypeAddFragment.f37905Y.put(payTemplate.getKey(), StringsKt.trim((CharSequence) charSequence.toString()).toString());
        if (payTypeInputItem.getIsRequired()) {
            payTypeAddFragment.m45164J3();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c4 */
    public static final void m45177c4(final PayTypeAddFragment payTypeAddFragment, PayTypeImageItem payTypeImageItem) {
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        Context mContext = payTypeAddFragment.mContext;
        if (mContext != null) {
            Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
            TextView textViewM45243c = payTypeImageItem.m45243c(mContext);
            Context mContext2 = payTypeAddFragment.mContext;
            Intrinsics.checkNotNullExpressionValue(mContext2, "mContext");
            ImageView imageViewM45242b = payTypeImageItem.m45242b(mContext2);
            if (imageViewM45242b != null) {
                C27046k.m66711z(imageViewM45242b, 0L, new Function0() { // from class: com.kubi.otc.otc.paytype.add.n
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PayTypeAddFragment.m45178d4(this.f37942b);
                    }
                }, 1, null);
            }
            C37616f c37616fM45209M3 = payTypeAddFragment.m45209M3();
            if (c37616fM45209M3 != null && (linearLayout2 = c37616fM45209M3.f83849d) != null) {
                linearLayout2.addView(textViewM45243c);
            }
            C37616f c37616fM45209M4 = payTypeAddFragment.m45209M3();
            if (c37616fM45209M4 != null && (linearLayout = c37616fM45209M4.f83849d) != null) {
                linearLayout.addView(imageViewM45242b);
            }
            if (textViewM45243c != null) {
                ViewExtKt.m66585p(textViewM45243c, 0, C5275i0.m6236a(17.0f), 0, 0, 13, null);
            }
            if (imageViewM45242b != null) {
                ViewExtKt.m66585p(imageViewM45242b, 0, C5275i0.m6236a(8.0f), 0, 0, 13, null);
            }
        }
    }

    /* JADX INFO: renamed from: d4 */
    public static final Unit m45178d4(PayTypeAddFragment payTypeAddFragment) {
        OtcDepend.f38138a.m45469r(payTypeAddFragment, 1, 101);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e4 */
    public static final Unit m45179e4(PayTypeAddFragment payTypeAddFragment, PayTemplate payTemplate, PayTypeBoxItem payTypeBoxItem, CharSequence charSequence) {
        payTypeAddFragment.f37905Y.put(payTemplate.getKey(), StringsKt.trim((CharSequence) charSequence.toString()).toString());
        if (payTypeBoxItem.getIsRequired()) {
            payTypeAddFragment.m45164J3();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m4 */
    public static final Unit m45190m4(PayTypeAddFragment payTypeAddFragment, Boolean bool) {
        OtcUserManager.m45480l(OtcUserManager.f38144a, null, 1, null);
        payTypeAddFragment.showToast(payTypeAddFragment.getString(R$string.add_ok));
        payTypeAddFragment.preformBackPressed();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n4 */
    public static final Unit m45192n4(final PayTypeAddFragment payTypeAddFragment) {
        if (payTypeAddFragment.f37903W) {
            return Unit.INSTANCE;
        }
        Intent intentPutExtra = new Intent(payTypeAddFragment.mContext, (Class<?>) BaseFragmentActivity.class).putExtra(BaseActivity.TITLE_BAR, false).putExtra("fragment", PayTypeSelectFragment.class.getName());
        Intrinsics.checkNotNullExpressionValue(intentPutExtra, "putExtra(...)");
        payTypeAddFragment.startActivityWithResult(intentPutExtra, new Consumer() { // from class: com.kubi.otc.otc.paytype.add.v
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                PayTypeAddFragment.m45194o4(this.f37952b, (Intent) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o4 */
    public static final void m45194o4(PayTypeAddFragment payTypeAddFragment, Intent intent) {
        PayTypeEntity payTypeEntity;
        if (intent != null && (payTypeEntity = (PayTypeEntity) intent.getParcelableExtra("data")) != null) {
            Map<String, ? extends List<PayTemplate>> map = payTypeAddFragment.f37904X;
            if (map != null) {
                payTypeEntity.setTemplate(map.get(payTypeEntity.getTypeCode()));
            }
            payTypeAddFragment.m45214V3(payTypeEntity);
        }
        payTypeAddFragment.f37901U = "";
    }

    /* JADX INFO: renamed from: r4 */
    public static final boolean m45199r4() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new C20106d().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("payment_android_p2p_payment_edit_and_add", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        return C27025c.m66567e((Boolean) objM20457a, true);
    }

    /* JADX INFO: renamed from: t4 */
    public static final Unit m45202t4(PrecheckBean.FailField failField, BaseTextView showByCondition) {
        Intrinsics.checkNotNullParameter(showByCondition, "$this$showByCondition");
        showByCondition.setText(C27041f.m66668h(failField != null ? failField.getHint() : null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: M3 */
    public final C37616f m45209M3() {
        return (C37616f) this.f37911e0.getValue(this, f37900h0[0]);
    }

    /* JADX INFO: renamed from: N3 */
    public final AdPayType m45210N3() {
        return (AdPayType) this.f37907a0.getValue();
    }

    /* JADX INFO: renamed from: O3 */
    public final Map<String, Object> m45211O3() {
        return (Map) this.f37908b0.getValue();
    }

    /* JADX INFO: renamed from: Q3 */
    public final PayTypeAddViewModel m45212Q3() {
        return (PayTypeAddViewModel) this.f37906Z.getValue();
    }

    /* JADX INFO: renamed from: V3 */
    public final void m45214V3(PayTypeEntity payTypeEntity) {
        String strM66668h;
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        LinearLayout linearLayout3;
        LinearLayout linearLayout4;
        LinearLayout linearLayout5;
        LinearLayout linearLayout6;
        LinearLayout linearLayout7;
        PaymentMethodTextView paymentMethodTextView;
        LinearLayout linearLayout8;
        List<PayTemplate> template;
        PayTemplate payTemplate;
        List<PayTemplate> template2;
        PayTemplate payTemplate2;
        Integer riskWarnStatus;
        this.f37909c0 = (payTypeEntity == null || (template2 = payTypeEntity.getTemplate()) == null || (payTemplate2 = (PayTemplate) CollectionsKt.firstOrNull((List) template2)) == null || (riskWarnStatus = payTemplate2.getRiskWarnStatus()) == null || riskWarnStatus.intValue() != 1) ? false : true;
        this.f37910d0 = C27041f.m66668h((payTypeEntity == null || (template = payTypeEntity.getTemplate()) == null || (payTemplate = (PayTemplate) CollectionsKt.firstOrNull((List) template)) == null) ? null : payTemplate.getRiskWarnContent());
        if (payTypeEntity == null) {
            return;
        }
        if (!this.f37903W) {
            this.f37905Y = new LinkedHashMap();
        }
        this.f37902V = C27041f.m66668h(payTypeEntity.getId());
        C37616f c37616fM45209M3 = m45209M3();
        if (c37616fM45209M3 != null && (linearLayout8 = c37616fM45209M3.f83849d) != null) {
            linearLayout8.removeAllViews();
        }
        C37616f c37616fM45209M4 = m45209M3();
        if (c37616fM45209M4 != null && (paymentMethodTextView = c37616fM45209M4.f83855j) != null) {
            paymentMethodTextView.setText(payTypeEntity.getShowTypeName());
            C27046k.m66694i(paymentMethodTextView, this.f37903W ? 0 : R$drawable.icon_arrow_right_mirrored, 0, GravityCompat.END, 2, null);
            paymentMethodTextView.setDrawableColor(payTypeEntity.getColor());
        }
        List<PayTemplate> template3 = payTypeEntity.getTemplate();
        if (template3 != null) {
            for (final PayTemplate payTemplate3 : template3) {
                if (this.f37903W) {
                    Object obj = m45211O3().get(payTemplate3.getKey());
                    strM66668h = C27041f.m66668h(obj instanceof String ? (String) obj : null);
                } else {
                    strM66668h = "";
                }
                String str = strM66668h;
                Integer type = payTemplate3.getType();
                if (type != null && type.intValue() == 1) {
                    final PayTypeInputItem payTypeInputItem = new PayTypeInputItem(payTemplate3.getValue(), payTemplate3.getTips(), str, payTemplate3.getKey(), payTemplate3.m103796isRequired());
                    Context mContext = this.mContext;
                    Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
                    TextView textViewM45246d = payTypeInputItem.m45246d(mContext);
                    Context mContext2 = this.mContext;
                    Intrinsics.checkNotNullExpressionValue(mContext2, "mContext");
                    FilterEmojiEditText filterEmojiEditTextM45245c = payTypeInputItem.m45245c(mContext2);
                    AbstractC46099a<CharSequence> abstractC46099aM784d = C0206f.m784d(filterEmojiEditTextM45245c);
                    final Function1 function1 = new Function1() { // from class: com.kubi.otc.otc.paytype.add.w
                        @Override // p852kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return PayTypeAddFragment.m45171W3(this.f37953b, payTemplate3, payTypeInputItem, (CharSequence) obj2);
                        }
                    };
                    Consumer<? super CharSequence> consumer = new Consumer() { // from class: com.kubi.otc.otc.paytype.add.x
                        @Override // io.reactivex.functions.Consumer
                        public final void accept(Object obj2) {
                            PayTypeAddFragment.m45172X3(function1, obj2);
                        }
                    };
                    final Function1 function2 = new Function1() { // from class: com.kubi.otc.otc.paytype.add.y
                        @Override // p852kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return PayTypeAddFragment.m45173Y3((Throwable) obj2);
                        }
                    };
                    addSubscription(abstractC46099aM784d.subscribe(consumer, new Consumer() { // from class: com.kubi.otc.otc.paytype.add.b
                        @Override // io.reactivex.functions.Consumer
                        public final void accept(Object obj2) {
                            PayTypeAddFragment.m45174Z3(function2, obj2);
                        }
                    }));
                    C37616f c37616fM45209M5 = m45209M3();
                    if (c37616fM45209M5 != null && (linearLayout7 = c37616fM45209M5.f83849d) != null) {
                        linearLayout7.addView(textViewM45246d);
                    }
                    C37616f c37616fM45209M6 = m45209M3();
                    if (c37616fM45209M6 != null && (linearLayout6 = c37616fM45209M6.f83849d) != null) {
                        linearLayout6.addView(filterEmojiEditTextM45245c);
                    }
                    if (TextUtils.isEmpty(payTypeInputItem.getLabel())) {
                        C27046k.m66700o(textViewM45246d);
                        ViewExtKt.m66585p(filterEmojiEditTextM45245c, 0, C5275i0.m6236a(17.0f), 0, 0, 13, null);
                    } else {
                        ViewExtKt.m66585p(textViewM45246d, 0, C5275i0.m6236a(17.0f), 0, 0, 13, null);
                        ViewExtKt.m66585p(filterEmojiEditTextM45245c, 0, C5275i0.m6236a(5.0f), 0, 0, 13, null);
                    }
                } else if (type != null && type.intValue() == 2) {
                    final PayTypeChooseItem payTypeChooseItem = new PayTypeChooseItem(payTemplate3.getValue(), payTemplate3.getTips(), str, payTemplate3.getSelectValue(), payTemplate3.getKey(), payTemplate3.m103796isRequired());
                    Context mContext3 = this.mContext;
                    Intrinsics.checkNotNullExpressionValue(mContext3, "mContext");
                    TextView textViewM45234d = payTypeChooseItem.m45234d(mContext3);
                    Context mContext4 = this.mContext;
                    Intrinsics.checkNotNullExpressionValue(mContext4, "mContext");
                    final FilterEmojiEditText filterEmojiEditTextM45232b = payTypeChooseItem.m45232b(mContext4);
                    C27046k.m66711z(filterEmojiEditTextM45232b, 0L, new Function0() { // from class: com.kubi.otc.otc.paytype.add.c
                        @Override // p852kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PayTypeAddFragment.m45175a4(payTypeChooseItem, this, filterEmojiEditTextM45232b, payTemplate3);
                        }
                    }, 1, null);
                    C37616f c37616fM45209M7 = m45209M3();
                    if (c37616fM45209M7 != null && (linearLayout5 = c37616fM45209M7.f83849d) != null) {
                        linearLayout5.addView(textViewM45234d);
                    }
                    C37616f c37616fM45209M8 = m45209M3();
                    if (c37616fM45209M8 != null && (linearLayout4 = c37616fM45209M8.f83849d) != null) {
                        linearLayout4.addView(filterEmojiEditTextM45232b);
                    }
                    ViewExtKt.m66585p(textViewM45234d, 0, C5275i0.m6236a(17.0f), 0, 0, 13, null);
                    ViewExtKt.m66585p(filterEmojiEditTextM45232b, 0, C5275i0.m6236a(5.0f), 0, 0, 13, null);
                } else if (type != null && type.intValue() == 3) {
                    final PayTypeImageItem payTypeImageItem = new PayTypeImageItem(payTemplate3.getValue(), str, payTemplate3.getKey(), payTemplate3.m103796isRequired());
                    C37616f c37616fM45209M9 = m45209M3();
                    if (c37616fM45209M9 != null && (linearLayout3 = c37616fM45209M9.f83849d) != null) {
                        linearLayout3.post(new Runnable() { // from class: com.kubi.otc.otc.paytype.add.d
                            @Override // java.lang.Runnable
                            public final void run() {
                                PayTypeAddFragment.m45177c4(this.f37929b, payTypeImageItem);
                            }
                        });
                    }
                } else if (type != null && type.intValue() == 4) {
                    final PayTypeBoxItem payTypeBoxItem = new PayTypeBoxItem(payTemplate3.getValue(), payTemplate3.getTips(), str, payTemplate3.getKey(), payTemplate3.m103796isRequired());
                    Context mContext5 = this.mContext;
                    Intrinsics.checkNotNullExpressionValue(mContext5, "mContext");
                    TextView textViewM45154c = payTypeBoxItem.m45154c(mContext5);
                    Context mContext6 = this.mContext;
                    Intrinsics.checkNotNullExpressionValue(mContext6, "mContext");
                    FilterEmojiEditText filterEmojiEditTextM45153b = payTypeBoxItem.m45153b(mContext6);
                    AbstractC46099a<CharSequence> abstractC46099aM784d2 = C0206f.m784d(filterEmojiEditTextM45153b);
                    final Function1 function3 = new Function1() { // from class: com.kubi.otc.otc.paytype.add.e
                        @Override // p852kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return PayTypeAddFragment.m45179e4(this.f37931b, payTemplate3, payTypeBoxItem, (CharSequence) obj2);
                        }
                    };
                    Consumer<? super CharSequence> consumer2 = new Consumer() { // from class: com.kubi.otc.otc.paytype.add.f
                        @Override // io.reactivex.functions.Consumer
                        public final void accept(Object obj2) {
                            PayTypeAddFragment.m45180f4(function3, obj2);
                        }
                    };
                    final Function1 function4 = new Function1() { // from class: com.kubi.otc.otc.paytype.add.g
                        @Override // p852kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return PayTypeAddFragment.m45181g4((Throwable) obj2);
                        }
                    };
                    addSubscription(abstractC46099aM784d2.subscribe(consumer2, new Consumer() { // from class: com.kubi.otc.otc.paytype.add.h
                        @Override // io.reactivex.functions.Consumer
                        public final void accept(Object obj2) {
                            PayTypeAddFragment.m45182h4(function4, obj2);
                        }
                    }));
                    C37616f c37616fM45209M10 = m45209M3();
                    if (c37616fM45209M10 != null && (linearLayout2 = c37616fM45209M10.f83849d) != null) {
                        linearLayout2.addView(textViewM45154c);
                    }
                    C37616f c37616fM45209M11 = m45209M3();
                    if (c37616fM45209M11 != null && (linearLayout = c37616fM45209M11.f83849d) != null) {
                        linearLayout.addView(filterEmojiEditTextM45153b);
                    }
                    ViewExtKt.m66585p(textViewM45154c, 0, C5275i0.m6236a(17.0f), 0, 0, 13, null);
                    ViewExtKt.m66585p(filterEmojiEditTextM45153b, 0, C5275i0.m6236a(5.0f), 0, 0, 13, null);
                }
                m45215q4(payTemplate3.getKey());
            }
        }
        m45164J3();
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.botc_fragment_add_received_way;
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Button button;
        LinearLayout linearLayout;
        BaseTextView baseTextView;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m45168S3();
        C37616f c37616fM45209M3 = m45209M3();
        if (c37616fM45209M3 != null && (baseTextView = c37616fM45209M3.f83853h) != null) {
            baseTextView.setText(this.f37913g0);
        }
        C37616f c37616fM45209M4 = m45209M3();
        if (c37616fM45209M4 != null && (linearLayout = c37616fM45209M4.f83851f) != null) {
            C27046k.m66711z(linearLayout, 0L, new Function0() { // from class: com.kubi.otc.otc.paytype.add.a
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PayTypeAddFragment.m45192n4(this.f37919b);
                }
            }, 1, null);
        }
        C37616f c37616fM45209M5 = m45209M3();
        if (c37616fM45209M5 == null || (button = c37616fM45209M5.f83847b) == null) {
            return;
        }
        C27046k.m66711z(button, 0L, new Function0() { // from class: com.kubi.otc.otc.paytype.add.l
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PayTypeAddFragment.m45196p4(this.f37939b);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: q4 */
    public final void m45215q4(String str) {
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        Context mContext = this.mContext;
        Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
        BaseTextView baseTextView = new BaseTextView(mContext);
        baseTextView.setTextSize(12.0f);
        baseTextView.setTypeface(ResourcesCompat.getFont(baseTextView.getContext(), R$font.regular));
        baseTextView.setTextColor(ContextCompat.getColor(baseTextView.getContext(), R$color.brandRed));
        C37616f c37616fM45209M3 = m45209M3();
        if (c37616fM45209M3 != null && (linearLayout2 = c37616fM45209M3.f83849d) != null) {
            baseTextView.setTag(linearLayout2.getId(), str);
        }
        ViewExtKt.m66577h(baseTextView);
        C37616f c37616fM45209M4 = m45209M3();
        if (c37616fM45209M4 != null && (linearLayout = c37616fM45209M4.f83849d) != null) {
            linearLayout.addView(baseTextView);
        }
        C27046k.m66692g(baseTextView, C27040e.m66658b(4));
    }

    /* JADX INFO: renamed from: s4 */
    public final void m45216s4(LinearLayout linearLayout, List<PrecheckBean.FailField> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
        for (Object obj : list) {
            linkedHashMap.put(((PrecheckBean.FailField) obj).getField(), obj);
        }
        IntRange intRangeUntil = RangesKt.until(0, linearLayout.getChildCount());
        ArrayList<View> arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
        Iterator<Integer> it = intRangeUntil.iterator();
        while (it.hasNext()) {
            arrayList.add(linearLayout.getChildAt(((IntIterator) it).nextInt()));
        }
        for (View view : arrayList) {
            if (view instanceof BaseTextView) {
                Object tag = ((BaseTextView) view).getTag(linearLayout.getId());
                String str = tag instanceof String ? (String) tag : null;
                if (str != null) {
                    final PrecheckBean.FailField failField = (PrecheckBean.FailField) linkedHashMap.get(str);
                    C21457l.m49859g(view, failField != null, null, new Function1() { // from class: com.kubi.otc.otc.paytype.add.q
                        @Override // p852kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return PayTypeAddFragment.m45202t4(failField, (BaseTextView) obj2);
                        }
                    }, 2, null);
                }
            }
        }
    }

    public PayTypeAddFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.kubi.otc.otc.paytype.add.PayTypeAddFragment$special$$inlined$viewModels$default$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final Fragment invoke() {
                return this;
            }

            {
                super(0);
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.kubi.otc.otc.paytype.add.PayTypeAddFragment$special$$inlined$viewModels$default$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }

            {
                super(0);
            }
        });
        final Function0 function1 = null;
        this.f37906Z = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(PayTypeAddViewModel.class), new Function0<ViewModelStore>() { // from class: com.kubi.otc.otc.paytype.add.PayTypeAddFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.otc.otc.paytype.add.PayTypeAddFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function2 = function1;
                if (function2 != null && (creationExtras = (CreationExtras) function2.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM103549viewModels$lambda1 = FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM103549viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM103549viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.otc.otc.paytype.add.PayTypeAddFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM103549viewModels$lambda1 = FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM103549viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM103549viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory != null && (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) != null) {
                    return defaultViewModelProviderFactory;
                }
                ViewModelProvider.Factory defaultViewModelProviderFactory2 = this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory2;
            }
        });
        this.f37907a0 = LazyKt.lazy(new Function0() { // from class: com.kubi.otc.otc.paytype.add.r
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PayTypeAddFragment.m45165K3(this.f37949b);
            }
        });
        this.f37908b0 = LazyKt.lazy(new Function0() { // from class: com.kubi.otc.otc.paytype.add.s
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PayTypeAddFragment.m45166L3(this.f37950b);
            }
        });
        this.f37911e0 = C45681e.m100799e(this, new Function1<PayTypeAddFragment, C37616f>() { // from class: com.kubi.otc.otc.paytype.add.PayTypeAddFragment$special$$inlined$viewBindingFragment$2
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C37616f invoke(@NotNull PayTypeAddFragment fragment) {
                Intrinsics.checkNotNullParameter(fragment, "fragment");
                return C37616f.m84813a(this.this$0.getContentView());
            }

            {
                super(1);
            }
        }, new Function1<C37616f, Unit>() { // from class: com.kubi.otc.otc.paytype.add.PayTypeAddFragment$special$$inlined$viewBindingFragment$1
            public final void invoke(@NotNull C37616f it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C37616f c37616f) {
                invoke(c37616f);
                return Unit.INSTANCE;
            }
        });
        this.f37912f0 = LazyKt.lazy(new Function0() { // from class: com.kubi.otc.otc.paytype.add.t
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(PayTypeAddFragment.m45199r4());
            }
        });
        this.f37913g0 = "";
        setPageId("B7P2PPaymentSettings");
    }

    /* JADX INFO: renamed from: J3 */
    private final void m45164J3() {
        Button button;
        LinearLayout linearLayout;
        String string;
        String string2;
        C37616f c37616fM45209M3 = m45209M3();
        boolean z11 = true;
        if (c37616fM45209M3 != null && (linearLayout = c37616fM45209M3.f83849d) != null) {
            IntRange intRangeUntil = RangesKt.until(0, linearLayout.getChildCount());
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
            Iterator<Integer> it = intRangeUntil.iterator();
            while (it.hasNext()) {
                arrayList.add(linearLayout.getChildAt(((IntIterator) it).nextInt()));
            }
            ArrayList<FilterEmojiEditText> arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (obj instanceof FilterEmojiEditText) {
                    arrayList2.add(obj);
                }
            }
            for (FilterEmojiEditText filterEmojiEditText : arrayList2) {
                Object tag = filterEmojiEditText.getTag();
                Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type com.kubi.otc.otc.paytype.PayTypeItem");
                if (((PayTypeItem) tag).getIsRequired()) {
                    Editable text = filterEmojiEditText.getText();
                    if (text != null && (string2 = text.toString()) != null) {
                        string = StringsKt.trim((CharSequence) string2).toString();
                    } else {
                        string = null;
                    }
                    if (string == null || string.length() == 0) {
                        z11 = false;
                    }
                }
            }
        }
        C37616f c37616fM45209M4 = m45209M3();
        if (c37616fM45209M4 != null && (button = c37616fM45209M4.f83847b) != null) {
            button.setEnabled(z11);
        }
    }

    /* JADX INFO: renamed from: K3 */
    public static final AdPayType m45165K3(PayTypeAddFragment payTypeAddFragment) {
        Bundle arguments = payTypeAddFragment.getArguments();
        if (arguments != null) {
            return (AdPayType) arguments.getParcelable("data");
        }
        return null;
    }

    /* JADX INFO: renamed from: L3 */
    public static final Map m45166L3(PayTypeAddFragment payTypeAddFragment) {
        Object objM66914d;
        String reservedFields;
        Object objM66914d2 = null;
        try {
            objM66914d = C27099x.m66914d(C27099x.m66919i(payTypeAddFragment.m45210N3(), false, 2, null), new C20103a().getType());
        } catch (Throwable unused) {
            objM66914d = null;
        }
        Map mapEmptyMap = (Map) objM66914d;
        if (mapEmptyMap == null) {
            mapEmptyMap = MapsKt.emptyMap();
        }
        AdPayType adPayTypeM45210N3 = payTypeAddFragment.m45210N3();
        if (adPayTypeM45210N3 != null) {
            reservedFields = adPayTypeM45210N3.getReservedFields();
        } else {
            reservedFields = null;
        }
        String strM66668h = C27041f.m66668h(reservedFields);
        try {
            C27099x c27099x = C27099x.f54458a;
            objM66914d2 = C27099x.m66914d(strM66668h, new C20104b().getType());
        } catch (Throwable unused2) {
        }
        Map mapEmptyMap2 = (Map) objM66914d2;
        if (mapEmptyMap2 == null) {
            mapEmptyMap2 = MapsKt.emptyMap();
        }
        return MapsKt.plus(mapEmptyMap, mapEmptyMap2);
    }

    /* JADX INFO: renamed from: S3 */
    private final void m45168S3() {
        String strM56284y;
        if (m45210N3() != null) {
            this.f37903W = true;
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            strM56284y = RouteExKt.m56284y(arguments, "data_1");
        } else {
            strM56284y = null;
        }
        this.f37913g0 = C27041f.m66669i(strM56284y, getStringRes(R$string.payment_paytype_need_kyc, new Object[0]));
        BaseFragment.showLoadingView$default(this, 0, 0, 3, null);
        C20143e.m45238d(this, new BiConsumer() { // from class: com.kubi.otc.otc.paytype.add.u
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj, Object obj2) throws Exception {
                PayTypeAddFragment.m45169T3(this.f37951b, (Boolean) obj, (List) obj2);
            }
        });
        m45183i4();
    }

    /* JADX INFO: renamed from: U3 */
    public static final void m45170U3(PayTypeAddFragment payTypeAddFragment, List list, Boolean bool, Map map) {
        PayTypeEntity payTypeEntity;
        Object next;
        String typeCode;
        String payTypeCode;
        C37616f c37616fM45209M3;
        LinearLayout linearLayout;
        payTypeAddFragment.showContentView();
        payTypeAddFragment.f37904X = map;
        if (bool.booleanValue() && (!bool.booleanValue() || (c37616fM45209M3 = payTypeAddFragment.m45209M3()) == null || (linearLayout = c37616fM45209M3.f83849d) == null || linearLayout.getChildCount() != 0)) {
            return;
        }
        PayTypeEntity payTypeEntity2 = null;
        if (payTypeAddFragment.f37903W) {
            Intrinsics.checkNotNull(list);
            Iterator it = list.iterator();
            do {
                if (it.hasNext()) {
                    next = it.next();
                    typeCode = ((PayTypeEntity) next).getTypeCode();
                    AdPayType adPayTypeM45210N3 = payTypeAddFragment.m45210N3();
                    if (adPayTypeM45210N3 != null) {
                        payTypeCode = adPayTypeM45210N3.getPayTypeCode();
                    } else {
                        payTypeCode = null;
                    }
                } else {
                    next = null;
                    break;
                }
            } while (!Intrinsics.areEqual(typeCode, payTypeCode));
            payTypeEntity = (PayTypeEntity) next;
        } else {
            Intrinsics.checkNotNull(list);
            payTypeEntity = (PayTypeEntity) CollectionsKt.getOrNull(list, 0);
        }
        if (payTypeEntity != null) {
            Intrinsics.checkNotNull(map);
            payTypeEntity.setTemplate((List) map.get(payTypeEntity.getTypeCode()));
            payTypeEntity2 = payTypeEntity;
        }
        payTypeAddFragment.m45214V3(payTypeEntity2);
    }

    /* JADX INFO: renamed from: X3 */
    public static final void m45172X3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: Y3 */
    public static final Unit m45173Y3(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Z3 */
    public static final void m45174Z3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: a4 */
    public static final Unit m45175a4(final PayTypeChooseItem payTypeChooseItem, final PayTypeAddFragment payTypeAddFragment, final FilterEmojiEditText filterEmojiEditText, final PayTemplate payTemplate) {
        if (payTypeChooseItem.m45233c() != null) {
            BottomSheetDialogHelper bottomSheetDialogHelper = BottomSheetDialogHelper.f48599a;
            List<String> listM45233c = payTypeChooseItem.m45233c();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM45233c, 10));
            for (String str : listM45233c) {
                arrayList.add(new SelectEntity(null, str, str, null, null, null, null, null, null, false, false, null, 4089, null));
            }
            DialogFragmentHelper dialogFragmentHelperM58944B = BottomSheetDialogHelper.m58944B(bottomSheetDialogHelper, arrayList, new BiConsumer() { // from class: com.kubi.otc.otc.paytype.add.o
                @Override // io.reactivex.functions.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    PayTypeAddFragment.m45176b4(filterEmojiEditText, payTypeAddFragment, payTemplate, payTypeChooseItem, (BaseViewHolder) obj, (BottomSheetDialogHelper.InterfaceC24339a) obj2);
                }
            }, false, null, null, false, 60, null);
            FragmentManager childFragmentManager = payTypeAddFragment.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            dialogFragmentHelperM58944B.show(childFragmentManager, "choose");
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b4 */
    public static final void m45176b4(FilterEmojiEditText filterEmojiEditText, PayTypeAddFragment payTypeAddFragment, PayTemplate payTemplate, PayTypeChooseItem payTypeChooseItem, BaseViewHolder baseViewHolder, BottomSheetDialogHelper.InterfaceC24339a interfaceC24339a) {
        filterEmojiEditText.setText(interfaceC24339a.getValue());
        payTypeAddFragment.f37905Y.put(payTemplate.getKey(), interfaceC24339a.getValue());
        if (payTypeChooseItem.getIsRequired()) {
            payTypeAddFragment.m45164J3();
        }
    }

    /* JADX INFO: renamed from: f4 */
    public static final void m45180f4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: g4 */
    public static final Unit m45181g4(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h4 */
    public static final void m45182h4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: i4 */
    private final void m45183i4() {
        m45212Q3().m45228p().observe(getViewLifecycleOwner(), new C20105c(new Function1() { // from class: com.kubi.otc.otc.paytype.add.i
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PayTypeAddFragment.m45184j4(this.f37936b, (Boolean) obj);
            }
        }));
        m45212Q3().m45226n().observe(getViewLifecycleOwner(), new C20105c(new Function1() { // from class: com.kubi.otc.otc.paytype.add.j
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PayTypeAddFragment.m45186k4(this.f37937b, (PrecheckBean.Response) obj);
            }
        }));
        m45212Q3().m45227o().observe(getViewLifecycleOwner(), new C20105c(new Function1() { // from class: com.kubi.otc.otc.paytype.add.k
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PayTypeAddFragment.m45190m4(this.f37938b, (Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j4 */
    public static final Unit m45184j4(PayTypeAddFragment payTypeAddFragment, Boolean bool) {
        if (bool.booleanValue()) {
            payTypeAddFragment.showDialogLoading();
        } else {
            payTypeAddFragment.hideDialogLoading();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k4 */
    public static final Unit m45186k4(final PayTypeAddFragment payTypeAddFragment, PrecheckBean.Response response) throws JSONException {
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        C37616f c37616fM45209M3 = payTypeAddFragment.m45209M3();
        if (c37616fM45209M3 != null && (linearLayout2 = c37616fM45209M3.f83849d) != null) {
            payTypeAddFragment.m45213R3(linearLayout2);
        }
        List<PrecheckBean.FailField> failFields = response.getFailFields();
        if (failFields != null && !failFields.isEmpty()) {
            C37616f c37616fM45209M4 = payTypeAddFragment.m45209M3();
            if (c37616fM45209M4 != null && (linearLayout = c37616fM45209M4.f83849d) != null) {
                payTypeAddFragment.m45216s4(linearLayout, response.getFailFields());
            }
        } else if (payTypeAddFragment.f37909c0 && !payTypeAddFragment.f37903W) {
            C42300e c42300e = C42300e.f93799a;
            FragmentManager childFragmentManager = payTypeAddFragment.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            C42300e.m92839e(c42300e, childFragmentManager, "payment_p2p_add_payment_method_risk_alert", payTypeAddFragment.getStringRes(R$string.payment_p2p_risk_tips, new Object[0]), C27041f.m66668h(payTypeAddFragment.f37910d0), null, payTypeAddFragment.getStringRes(R$string.payment_p2p_agree_and_add, new Object[0]), new Function0() { // from class: com.kubi.otc.otc.paytype.add.p
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PayTypeAddFragment.m45188l4(this.f37947b);
                }
            }, 16, null);
        } else {
            payTypeAddFragment.m45217u4();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l4 */
    public static final Unit m45188l4(PayTypeAddFragment payTypeAddFragment) throws JSONException {
        payTypeAddFragment.m45217u4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p4 */
    public static final Unit m45196p4(PayTypeAddFragment payTypeAddFragment) {
        payTypeAddFragment.m45212Q3().m45229q(payTypeAddFragment.f37902V, payTypeAddFragment.f37905Y);
        C43852m.m96591c("B7P2PPaymentSettings", "paymethodCbutton", null, null, 12, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: R3 */
    public final void m45213R3(LinearLayout linearLayout) {
        IntRange intRangeUntil = RangesKt.until(0, linearLayout.getChildCount());
        ArrayList<View> arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
        Iterator<Integer> it = intRangeUntil.iterator();
        while (it.hasNext()) {
            arrayList.add(linearLayout.getChildAt(((IntIterator) it).nextInt()));
        }
        for (View view : arrayList) {
            if ((view instanceof BaseTextView) && (((BaseTextView) view).getTag(linearLayout.getId()) instanceof String)) {
                ViewExtKt.m66577h(view);
            }
        }
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        LinearLayout linearLayout;
        ImageView imageView;
        Object objPrevious;
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == -1 && requestCode == 101 && data != null) {
            this.f37901U = OtcDepend.f38138a.m45468q(data);
            C37616f c37616fM45209M3 = m45209M3();
            if (c37616fM45209M3 != null && (linearLayout = c37616fM45209M3.f83849d) != null) {
                IntRange intRangeUntil = RangesKt.until(0, linearLayout.getChildCount());
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
                Iterator<Integer> it = intRangeUntil.iterator();
                while (it.hasNext()) {
                    arrayList.add(linearLayout.getChildAt(((IntIterator) it).nextInt()));
                }
                ListIterator listIterator = arrayList.listIterator(arrayList.size());
                do {
                    imageView = null;
                    if (listIterator.hasPrevious()) {
                        objPrevious = listIterator.previous();
                    } else {
                        objPrevious = null;
                        break;
                    }
                } while (!(((View) objPrevious) instanceof ImageView));
                View view = (View) objPrevious;
                if (view != null) {
                    if (view instanceof ImageView) {
                        imageView = (ImageView) view;
                    }
                    if (imageView != null) {
                        C46338a.m102151a(this.mContext).mo6634v(this.f37901U).m6594E0(imageView);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: u4 */
    public final void m45217u4() throws JSONException {
        LinearLayout linearLayout;
        Object next;
        PayTypeItem payTypeItem;
        Boolean boolValueOf;
        boolean z11;
        C37616f c37616fM45209M3 = m45209M3();
        String id2 = null;
        if (c37616fM45209M3 != null && (linearLayout = c37616fM45209M3.f83849d) != null) {
            IntRange intRangeUntil = RangesKt.until(0, linearLayout.getChildCount());
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
            Iterator<Integer> it = intRangeUntil.iterator();
            while (it.hasNext()) {
                arrayList.add(linearLayout.getChildAt(((IntIterator) it).nextInt()));
            }
            Iterator it2 = arrayList.iterator();
            do {
                if (it2.hasNext()) {
                    next = it2.next();
                    Object tag = ((View) next).getTag();
                    if (tag instanceof PayTypeItem) {
                        payTypeItem = (PayTypeItem) tag;
                    } else {
                        payTypeItem = null;
                    }
                    if (payTypeItem != null) {
                        if (payTypeItem.getIsRequired() && Intrinsics.areEqual(payTypeItem.getTag(), "payQrcodePic") && this.f37901U.length() == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        boolValueOf = Boolean.valueOf(z11);
                    } else {
                        boolValueOf = null;
                    }
                } else {
                    next = null;
                    break;
                }
            } while (!C27025c.m66566d(boolValueOf));
            if (((View) next) != null) {
                showToast(getString(R$string.upload_wechat_qrcode));
                return;
            }
        }
        HashMap<String, String> map = new HashMap<>();
        map.put("payTypeId", this.f37902V);
        map.put("legal", C41016c.m89965c());
        map.put(JPushConstants.Analysis.KEY_JSON, C27099x.m66919i(this.f37905Y, false, 2, null));
        if (this.f37903W) {
            AdPayType adPayTypeM45210N3 = m45210N3();
            if (adPayTypeM45210N3 != null) {
                id2 = adPayTypeM45210N3.getId();
            }
            map.put("id", C27041f.m66668h(id2));
        }
        if (m45167P3()) {
            PayTypeAddViewModel payTypeAddViewModelM45212Q3 = m45212Q3();
            Context mContext = this.mContext;
            Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            payTypeAddViewModelM45212Q3.m45231t(mContext, viewLifecycleOwner, this.f37903W, this.f37901U, map);
            return;
        }
        m45212Q3().m45230r(this.f37903W, this.f37901U, map);
    }
}
