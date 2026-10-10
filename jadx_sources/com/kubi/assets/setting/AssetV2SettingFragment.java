package com.kubi.assets.setting;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.SwitchCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.assets.AssetExKt;
import com.kubi.assets.R$id;
import com.kubi.assets.R$layout;
import com.kubi.assets.R$string;
import com.kubi.assets.SimpleTextWatcher;
import com.kubi.assets.entity.AssetV2SettingEntity;
import com.kubi.assets.entity.FiatCurrency;
import com.kubi.assets.service.AssetsDepend;
import com.kubi.data.entity.CustomOrderEntity;
import com.kubi.data.entity.SubAssetEntity;
import com.kubi.mvi.state.BaseStateFragment;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.widget.ClearEditText;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.TitleBar;
import com.kubi.sdk.widget.dialog.SelectEntity;
import io.chad.library.adapter.base.BaseQuickAdapter;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41016c;
import p637ta.C44774g5;
import p637ta.C44896x3;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;
import w00.C45681e;

/* JADX INFO: compiled from: AssetV2SettingFragment.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 02\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u00010B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0011\u001a\u00020\u0012H\u0014J\u0012\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010!\u001a\u00020\u001aH\u0015J\b\u0010\"\u001a\u00020\u001aH\u0002J\u0010\u0010#\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020%H\u0002J\b\u0010&\u001a\u00020\u001aH\u0002J\u0010\u0010'\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020)H\u0002J\b\u0010*\u001a\u00020\u001aH\u0002J\u001a\u0010+\u001a\u00020\u001a2\b\u0010,\u001a\u0004\u0018\u00010%2\b\u0010-\u001a\u0004\u0018\u00010%J\b\u0010.\u001a\u00020\u001aH\u0016J\b\u0010/\u001a\u00020\u001aH\u0014R\u001d\u0010\u0007\u001a\u0004\u0018\u00010\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u001e8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u00061"}, m90084d2 = {"Lcom/kubi/assets/setting/AssetV2SettingFragment;", "Lcom/kubi/mvi/state/BaseStateFragment;", "Lcom/kubi/assets/setting/AssetV2SettingContract$UiIntent;", "Lcom/kubi/assets/setting/AssetV2SettingContract$UIState;", "Lcom/kubi/assets/setting/AssetV2SettingViewModel;", "<init>", "()V", "binding", "Lcom/kubi/assets/databinding/FragmentAssetv2SettingBinding;", "getBinding", "()Lcom/kubi/assets/databinding/FragmentAssetv2SettingBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "subAssetEntity", "Lcom/kubi/data/entity/SubAssetEntity;", "customOrderEntity", "Lcom/kubi/data/entity/CustomOrderEntity;", "getLayout", "", "adapter", "Lcom/kubi/assets/setting/AssetV2SettingAdapter;", "getAdapter", "()Lcom/kubi/assets/setting/AssetV2SettingAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "vmClass", "Lkotlin/reflect/KClass;", "getVmClass", "()Lkotlin/reflect/KClass;", "initView", "initEditTextEvents", "searchFilter", "content", "", "initAdapterItemClickEvents", "changeCurrency", "data", "Lcom/kubi/assets/entity/AssetV2SettingEntity;", "showNoteDialog", "setUserConfig", FirebaseAnalytics.Param.CURRENCY, "balanceCurrency", "lazyLoad", "bindState", "Companion", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAssetV2SettingFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetV2SettingFragment.kt\ncom/kubi/assets/setting/AssetV2SettingFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,180:1\n147#2,16:181\n1#3:197\n774#4:198\n865#4,2:199\n*S KotlinDebug\n*F\n+ 1 AssetV2SettingFragment.kt\ncom/kubi/assets/setting/AssetV2SettingFragment\n*L\n34#1:181,16\n107#1:198\n107#1:199,2\n*E\n"})
public final class AssetV2SettingFragment extends BaseStateFragment<AssetV2SettingContract$UiIntent, UIState, AssetV2SettingViewModel> {

    /* JADX INFO: renamed from: V */
    @Nullable
    public SubAssetEntity f18707V;

    /* JADX INFO: renamed from: W */
    @Nullable
    public CustomOrderEntity f18708W;

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ KProperty<Object>[] f18705Z = {Reflection.property1(new PropertyReference1Impl(AssetV2SettingFragment.class, "binding", "getBinding()Lcom/kubi/assets/databinding/FragmentAssetv2SettingBinding;", 0))};

    /* JADX INFO: renamed from: Y */
    @NotNull
    public static final Companion f18704Y = new Companion(null);

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f18706U = C45681e.m100799e(this, new Function1<AssetV2SettingFragment, C44896x3>() { // from class: com.kubi.assets.setting.AssetV2SettingFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44896x3 invoke(@NotNull AssetV2SettingFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44896x3.m99316a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C44896x3, Unit>() { // from class: com.kubi.assets.setting.AssetV2SettingFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C44896x3 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44896x3 c44896x3) {
            invoke(c44896x3);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: X */
    @NotNull
    public final Lazy f18709X = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.setting.b
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AssetV2SettingFragment.m19225r3();
        }
    });

    /* JADX INFO: compiled from: AssetV2SettingFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/assets/setting/AssetV2SettingFragment$Companion;", "", "<init>", "()V", "SUB_ASSET_ENTITY", "", "CUSTOM_ORDER_ENTITY", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.setting.AssetV2SettingFragment$a */
    /* JADX INFO: compiled from: AssetV2SettingFragment.kt */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¨\u0006\n"}, m90084d2 = {"com/kubi/assets/setting/AssetV2SettingFragment$initEditTextEvents$1", "Lcom/kubi/assets/SimpleTextWatcher;", "onTextChanged", "", CmcdData.Factory.STREAMING_FORMAT_SS, "", "start", "", TtmlNode.ANNOTATION_POSITION_BEFORE, "count", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nAssetV2SettingFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetV2SettingFragment.kt\ncom/kubi/assets/setting/AssetV2SettingFragment$initEditTextEvents$1\n+ 2 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n1#1,180:1\n106#2:181\n78#2,22:182\n*S KotlinDebug\n*F\n+ 1 AssetV2SettingFragment.kt\ncom/kubi/assets/setting/AssetV2SettingFragment$initEditTextEvents$1\n*L\n94#1:181\n94#1:182,22\n*E\n"})
    public static final class C10931a extends SimpleTextWatcher {
        public C10931a() {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence s11, int start, int before, int count) {
            int i11;
            boolean z11;
            String strValueOf = String.valueOf(s11);
            int length = strValueOf.length() - 1;
            int i12 = 0;
            boolean z12 = false;
            while (i12 <= length) {
                if (!z12) {
                    i11 = i12;
                } else {
                    i11 = length;
                }
                if (Intrinsics.compare((int) strValueOf.charAt(i11), 32) <= 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z12) {
                    if (!z11) {
                        z12 = true;
                    } else {
                        i12++;
                    }
                } else if (!z11) {
                    break;
                } else {
                    length--;
                }
            }
            String string = strValueOf.subSequence(i12, length + 1).toString();
            AssetV2SettingFragment assetV2SettingFragment = AssetV2SettingFragment.this;
            try {
                Result.Companion companion = Result.INSTANCE;
                assetV2SettingFragment.m19228z3(string);
                Result.m103844constructorimpl(Unit.INSTANCE);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m103844constructorimpl(ResultKt.createFailure(th2));
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.setting.AssetV2SettingFragment$bindState$2 */
    /* JADX INFO: compiled from: AssetV2SettingFragment.kt */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "", "Lcom/kubi/assets/entity/AssetV2SettingEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.setting.AssetV2SettingFragment$bindState$2", m90122f = "AssetV2SettingFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C109332 extends SuspendLambda implements Function2<List<? extends AssetV2SettingEntity>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(List<? extends AssetV2SettingEntity> list, Continuation<? super Unit> continuation) {
            return invoke2((List<AssetV2SettingEntity>) list, continuation);
        }

        public C109332(Continuation<? super C109332> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C109332 c109332 = AssetV2SettingFragment.this.new C109332(continuation);
            c109332.L$0 = obj;
            return c109332;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<AssetV2SettingEntity> list, Continuation<? super Unit> continuation) {
            return ((C109332) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List list = (List) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (list != null && !list.isEmpty()) {
                AssetV2SettingFragment.this.showContent();
                AssetV2SettingFragment.this.m19232t3().replaceData(list);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.setting.AssetV2SettingFragment$bindState$4 */
    /* JADX INFO: compiled from: AssetV2SettingFragment.kt */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.setting.AssetV2SettingFragment$bindState$4", m90122f = "AssetV2SettingFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C109354 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return ((C109354) create(bool, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public C109354(Continuation<? super C109354> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C109354 c109354 = AssetV2SettingFragment.this.new C109354(continuation);
            c109354.L$0 = obj;
            return c109354;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Boolean bool = (Boolean) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (bool != null) {
                BaseFragment.hideLoadingDialog$default(AssetV2SettingFragment.this, false, 1, null);
                FragmentActivity activity = AssetV2SettingFragment.this.getActivity();
                if (activity != null) {
                    activity.finish();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.setting.AssetV2SettingFragment$bindState$6 */
    /* JADX INFO: compiled from: AssetV2SettingFragment.kt */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.setting.AssetV2SettingFragment$bindState$6", m90122f = "AssetV2SettingFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C109376 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        /* synthetic */ boolean Z$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return invoke(bool.booleanValue(), continuation);
        }

        public C109376(Continuation<? super C109376> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C109376 c109376 = AssetV2SettingFragment.this.new C109376(continuation);
            c109376.Z$0 = ((Boolean) obj).booleanValue();
            return c109376;
        }

        public final Object invoke(boolean z11, Continuation<? super Unit> continuation) {
            return ((C109376) create(Boolean.valueOf(z11), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z11 = this.Z$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AssetV2SettingFragment.this.m19232t3().m19217n(z11);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: r3 */
    public static final AssetV2SettingAdapter m19225r3() {
        return new AssetV2SettingAdapter(new ArrayList());
    }

    /* JADX INFO: renamed from: A3 */
    public final void m19229A3(@Nullable String str, @Nullable String str2) {
        if (AssetsDepend.f18689a.m19189j().c()) {
            sendIntent(new AssetV2SettingContract$UiIntent.SetUserConfig(str, str2));
        }
    }

    /* JADX INFO: renamed from: B3 */
    public final void m19230B3() {
        AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.note).m54156M4(getString(R$string.assetv2_sub_tips)).m54162S4(R$string.confirm, null).m54172c5(getChildFragmentManager());
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.fragment_assetv2_setting;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @NotNull
    public KClass<AssetV2SettingViewModel> getVmClass() {
        return Reflection.getOrCreateKotlinClass(AssetV2SettingViewModel.class);
    }

    /* JADX INFO: renamed from: t3 */
    public final AssetV2SettingAdapter m19232t3() {
        return (AssetV2SettingAdapter) this.f18709X.getValue();
    }

    /* JADX INFO: renamed from: u3 */
    public final C44896x3 m19233u3() {
        return (C44896x3) this.f18706U.getValue(this, f18705Z[0]);
    }

    /* JADX INFO: renamed from: w3 */
    public static final void m19226w3(AssetV2SettingFragment assetV2SettingFragment, BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        AssetV2SettingEntity assetV2SettingEntity;
        CharSequence label;
        List data = baseQuickAdapter.getData();
        Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
        Object orNull = CollectionsKt.getOrNull(data, i11);
        String name = null;
        if (orNull instanceof AssetV2SettingEntity) {
            assetV2SettingEntity = (AssetV2SettingEntity) orNull;
        } else {
            assetV2SettingEntity = null;
        }
        if (assetV2SettingEntity != null && assetV2SettingEntity.getType() == 1) {
            SelectEntity selectEntity = assetV2SettingEntity.getSelectEntity();
            if (selectEntity != null) {
                label = selectEntity.getLabel();
            } else {
                label = null;
            }
            String strValueOf = String.valueOf(label);
            CustomOrderEntity customOrderEntity = assetV2SettingFragment.f18708W;
            if (customOrderEntity != null) {
                name = customOrderEntity.getBaseCurrency();
            }
            if (Intrinsics.areEqual(strValueOf, name)) {
                FragmentActivity activity = assetV2SettingFragment.getActivity();
                if (activity != null) {
                    activity.finish();
                    return;
                }
                return;
            }
            assetV2SettingFragment.m19231s3(assetV2SettingEntity);
            return;
        }
        if (assetV2SettingEntity != null && assetV2SettingEntity.getType() == 2) {
            FiatCurrency fiatCurrency = assetV2SettingEntity.getFiatCurrency();
            if (fiatCurrency != null) {
                name = fiatCurrency.getName();
            }
            if (Intrinsics.areEqual(name, C41016c.m89965c())) {
                FragmentActivity activity2 = assetV2SettingFragment.getActivity();
                if (activity2 != null) {
                    activity2.finish();
                    return;
                }
                return;
            }
            assetV2SettingFragment.m19231s3(assetV2SettingEntity);
        }
    }

    /* JADX INFO: renamed from: y3 */
    public static final void m19227y3(AssetV2SettingFragment assetV2SettingFragment, BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        int id2 = view.getId();
        if (id2 == R$id.switch_sub) {
            if (view instanceof SwitchCompat) {
                assetV2SettingFragment.m19232t3().m19219p(true);
                SwitchCompat switchCompat = (SwitchCompat) view;
                assetV2SettingFragment.sendIntent(new AssetV2SettingContract$UiIntent.SubSwitchChanged(switchCompat.isChecked()));
                assetV2SettingFragment.m19232t3().m19218o(Boolean.valueOf(switchCompat.isChecked()));
                assetV2SettingFragment.m19232t3().notifyDataSetChanged();
                return;
            }
            return;
        }
        if (id2 == R$id.tv_sub_account) {
            assetV2SettingFragment.m19230B3();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z3 */
    public final void m19228z3(String str) {
        String name;
        if (str.length() == 0) {
            m19232t3().setNewData(getState().getSettingEntityList());
            return;
        }
        List<AssetV2SettingEntity> settingEntityList = getState().getSettingEntityList();
        if (settingEntityList != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : settingEntityList) {
                FiatCurrency fiatCurrency = ((AssetV2SettingEntity) obj).getFiatCurrency();
                if (fiatCurrency != null && (name = fiatCurrency.getName()) != null && StringsKt.contains((CharSequence) name, (CharSequence) str, true)) {
                    arrayList.add(obj);
                }
            }
            m19232t3().setNewData(arrayList);
        }
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void bindState() {
        super.bindState();
        bindState(new PropertyReference1Impl() { // from class: com.kubi.assets.setting.AssetV2SettingFragment.bindState.1
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getSettingEntityList();
            }
        }, new C109332(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.assets.setting.AssetV2SettingFragment.bindState.3
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getGetSingleCurrencyStatus();
            }
        }, new C109354(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.assets.setting.AssetV2SettingFragment.bindState.5
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Boolean.valueOf(((UIState) obj).getUiHideNumberFlag());
            }
        }, new C109376(null));
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @SuppressLint({"NotifyDataSetChanged"})
    public void initView() {
        int i11;
        C44774g5 c44774g5;
        LinearLayout root;
        TitleBar titleBar = getTitleBar();
        if (AssetExKt.m15129q()) {
            i11 = R$string.currency_rate;
        } else {
            i11 = R$string.assets_setting;
        }
        titleBar.setTitle(getString(i11));
        showLoading();
        C44896x3 c44896x3M19233u3 = m19233u3();
        if (c44896x3M19233u3 != null && (c44774g5 = c44896x3M19233u3.f101134c) != null && (root = c44774g5.getRoot()) != null) {
            AssetExKt.m15138z(root, AssetExKt.m15129q());
        }
        C44896x3 c44896x3M19233u4 = m19233u3();
        if (c44896x3M19233u4 != null) {
            m19232t3().bindToRecyclerView(c44896x3M19233u4.f101133b);
        }
        m19232t3().setOnItemChildClickListener(new BaseQuickAdapter.OnItemChildClickListener() { // from class: com.kubi.assets.setting.c
            @Override // io.chad.library.adapter.base.BaseQuickAdapter.OnItemChildClickListener
            public final void onItemChildClick(BaseQuickAdapter baseQuickAdapter, View view, int i12) {
                AssetV2SettingFragment.m19227y3(this.f18714a, baseQuickAdapter, view, i12);
            }
        });
        m19234v3();
        m19235x3();
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public void lazyLoad() {
        super.lazyLoad();
        sendIntent(new AssetV2SettingContract$UiIntent.GetData(this.f18707V, this.f18708W));
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.base.p113ui.OldBaseFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        SubAssetEntity subAssetEntity;
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        CustomOrderEntity customOrderEntity = null;
        if (arguments != null) {
            subAssetEntity = (SubAssetEntity) RouteExKt.m56274t(arguments, "sub_asset_entity");
        } else {
            subAssetEntity = null;
        }
        this.f18707V = subAssetEntity;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            customOrderEntity = (CustomOrderEntity) RouteExKt.m56274t(arguments2, "custom_order_entity");
        }
        this.f18708W = customOrderEntity;
    }

    /* JADX INFO: renamed from: s3 */
    public final void m19231s3(AssetV2SettingEntity assetV2SettingEntity) {
        CharSequence label;
        String name;
        String name2;
        SelectEntity selectEntity = assetV2SettingEntity.getSelectEntity();
        String baseCurrency = null;
        CharSequence label2 = null;
        if (selectEntity != null) {
            label = selectEntity.getLabel();
        } else {
            label = null;
        }
        if (label != null && label.length() != 0) {
            FiatCurrency fiatCurrency = assetV2SettingEntity.getFiatCurrency();
            if (fiatCurrency != null) {
                name2 = fiatCurrency.getName();
            } else {
                name2 = null;
            }
            SelectEntity selectEntity2 = assetV2SettingEntity.getSelectEntity();
            if (selectEntity2 != null) {
                label2 = selectEntity2.getLabel();
            }
            m19229A3(name2, String.valueOf(label2));
        } else {
            FiatCurrency fiatCurrency2 = assetV2SettingEntity.getFiatCurrency();
            if (fiatCurrency2 != null) {
                name = fiatCurrency2.getName();
            } else {
                name = null;
            }
            CustomOrderEntity customOrderEntity = this.f18708W;
            if (customOrderEntity != null) {
                baseCurrency = customOrderEntity.getBaseCurrency();
            }
            m19229A3(name, baseCurrency);
        }
        showLoadingDialog();
    }

    /* JADX INFO: renamed from: v3 */
    public final void m19234v3() {
        m19232t3().setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() { // from class: com.kubi.assets.setting.d
            @Override // io.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                AssetV2SettingFragment.m19226w3(this.f18715a, baseQuickAdapter, view, i11);
            }
        });
    }

    /* JADX INFO: renamed from: x3 */
    public final void m19235x3() {
        C44774g5 c44774g5;
        ClearEditText clearEditText;
        C44896x3 c44896x3M19233u3 = m19233u3();
        if (c44896x3M19233u3 != null && (c44774g5 = c44896x3M19233u3.f101134c) != null && (clearEditText = c44774g5.f99995b) != null) {
            clearEditText.addTextChangedListener(new C10931a());
        }
    }
}
