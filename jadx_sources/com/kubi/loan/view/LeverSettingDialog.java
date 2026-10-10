package com.kubi.loan.view;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.util.SparseArrayKt;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.blankj.utilcode.util.C5267e0;
import com.blankj.utilcode.util.KeyboardUtils;
import com.fasterxml.jackson.databind.node.C6447a;
import com.kubi.loan.R$color;
import com.kubi.loan.R$layout;
import com.kubi.loan.R$string;
import com.kubi.loan.view.LeverSettingDialog;
import com.kubi.resources.dialog.GravityDialogFragment;
import com.kubi.resources.widget.LeverSeekBar;
import com.kubi.resources.widget.bubbleseekbar.BubbleSeekBar;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27056j0;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.DowngradeExKt;
import com.tencent.bugly.proguard.C33820nf;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.math.BigDecimal;
import java.math.RoundingMode;
import jo.C40450a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p011a9.C0206f;
import p429lf.C42180b;
import p752x8.AbstractC46099a;
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
import p852kotlin.ranges.RangesKt;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: LeverSettingDialog.kt */
/* JADX INFO: loaded from: classes26.dex */
@Metadata(m90083d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\u0010\r\n\u0002\b\u0003\u0018\u0000 %2\u00020\u0001:\u0002$%B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u001a\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u001b\u001a\u00020\u0019H\u0016J\b\u0010\u001c\u001a\u00020\u0019H\u0002J\u000e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0002J\b\u0010 \u001a\u00020\u0019H\u0002J\u000e\u0010!\u001a\u00020\"*\u0004\u0018\u00010#H\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\n\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006&"}, m90084d2 = {"Lcom/kubi/loan/view/LeverSettingDialog;", "Lcom/kubi/resources/dialog/GravityDialogFragment;", "<init>", "()V", "bloanDialogSetLeverBinding", "Lcom/kubi/loan/databinding/BloanDialogSetLeverBinding;", "getBloanDialogSetLeverBinding", "()Lcom/kubi/loan/databinding/BloanDialogSetLeverBinding;", "bloanDialogSetLeverBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "config", "Lcom/kubi/loan/view/LeverSettingDialog$LeverDialogConfig;", "getConfig", "()Lcom/kubi/loan/view/LeverSettingDialog$LeverDialogConfig;", "config$delegate", "Lkotlin/Lazy;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "dismiss", "initListener", "calculateSectionText", "Landroid/util/SparseArray;", "", "bindPromptStatus", "nonNullDouble", "", "", "LeverDialogConfig", "Companion", "LoanLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nLeverSettingDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LeverSettingDialog.kt\ncom/kubi/loan/view/LeverSettingDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,226:1\n143#2,20:227\n1#3:247\n*S KotlinDebug\n*F\n+ 1 LeverSettingDialog.kt\ncom/kubi/loan/view/LeverSettingDialog\n*L\n45#1:227,20\n*E\n"})
public final class LeverSettingDialog extends GravityDialogFragment {

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final InterfaceC24293a f32496c0 = C45681e.m100799e(this, new Function1<LeverSettingDialog, C40450a>() { // from class: com.kubi.loan.view.LeverSettingDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C40450a invoke(@NotNull LeverSettingDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C40450a.m89089a(fragment.requireView());
        }
    }, new Function1<C40450a, Unit>() { // from class: com.kubi.loan.view.LeverSettingDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C40450a it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C40450a c40450a) {
            invoke(c40450a);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public final Lazy f32497d0 = LazyKt.lazy(new Function0() { // from class: qo.u
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return LeverSettingDialog.m37816J3(this.f96882b);
        }
    });

    /* JADX INFO: renamed from: f0 */
    public static final /* synthetic */ KProperty<Object>[] f32495f0 = {Reflection.property1(new PropertyReference1Impl(LeverSettingDialog.class, "bloanDialogSetLeverBinding", "getBloanDialogSetLeverBinding()Lcom/kubi/loan/databinding/BloanDialogSetLeverBinding;", 0))};

    /* JADX INFO: renamed from: e0 */
    @NotNull
    public static final Companion f32494e0 = new Companion(null);

    /* JADX INFO: compiled from: LeverSettingDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/loan/view/LeverSettingDialog$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/loan/view/LeverSettingDialog;", "config", "Lcom/kubi/loan/view/LeverSettingDialog$LeverDialogConfig;", "LoanLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nLeverSettingDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LeverSettingDialog.kt\ncom/kubi/loan/view/LeverSettingDialog$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,226:1\n1#2:227\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final LeverSettingDialog newInstance(@NotNull LeverDialogConfig config) {
            Intrinsics.checkNotNullParameter(config, "config");
            LeverSettingDialog leverSettingDialog = new LeverSettingDialog();
            Bundle bundle = new Bundle();
            bundle.putParcelable("data", config);
            leverSettingDialog.setArguments(bundle);
            return leverSettingDialog;
        }
    }

    /* JADX INFO: compiled from: LeverSettingDialog.kt */
    @Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003JC\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u0018\u001a\u00020\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0019R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006%"}, m90084d2 = {"Lcom/kubi/loan/view/LeverSettingDialog$LeverDialogConfig;", "Landroid/os/Parcelable;", "requestKey", "", "warningLever", "Ljava/math/BigDecimal;", "positionLever", "currentLever", "maxLever", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getRequestKey", "()Ljava/lang/String;", "getWarningLever", "()Ljava/math/BigDecimal;", "getPositionLever", "getCurrentLever", "getMaxLever", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "LoanLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class LeverDialogConfig implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<LeverDialogConfig> CREATOR = new C17468a();

        @Nullable
        private final BigDecimal currentLever;

        @Nullable
        private final BigDecimal maxLever;

        @Nullable
        private final BigDecimal positionLever;

        @NotNull
        private final String requestKey;

        @Nullable
        private final BigDecimal warningLever;

        /* JADX INFO: renamed from: com.kubi.loan.view.LeverSettingDialog$LeverDialogConfig$a */
        /* JADX INFO: compiled from: LeverSettingDialog.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class C17468a implements Parcelable.Creator<LeverDialogConfig> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final LeverDialogConfig createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LeverDialogConfig(parcel.readString(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final LeverDialogConfig[] newArray(int i11) {
                return new LeverDialogConfig[i11];
            }
        }

        public static /* synthetic */ LeverDialogConfig copy$default(LeverDialogConfig leverDialogConfig, String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = leverDialogConfig.requestKey;
            }
            if ((i11 & 2) != 0) {
                bigDecimal = leverDialogConfig.warningLever;
            }
            if ((i11 & 4) != 0) {
                bigDecimal2 = leverDialogConfig.positionLever;
            }
            if ((i11 & 8) != 0) {
                bigDecimal3 = leverDialogConfig.currentLever;
            }
            if ((i11 & 16) != 0) {
                bigDecimal4 = leverDialogConfig.maxLever;
            }
            BigDecimal bigDecimal5 = bigDecimal4;
            BigDecimal bigDecimal6 = bigDecimal2;
            return leverDialogConfig.copy(str, bigDecimal, bigDecimal6, bigDecimal3, bigDecimal5);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LeverDialogConfig)) {
                return false;
            }
            LeverDialogConfig leverDialogConfig = (LeverDialogConfig) other;
            return Intrinsics.areEqual(this.requestKey, leverDialogConfig.requestKey) && Intrinsics.areEqual(this.warningLever, leverDialogConfig.warningLever) && Intrinsics.areEqual(this.positionLever, leverDialogConfig.positionLever) && Intrinsics.areEqual(this.currentLever, leverDialogConfig.currentLever) && Intrinsics.areEqual(this.maxLever, leverDialogConfig.maxLever);
        }

        public LeverDialogConfig(@NotNull String requestKey, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4) {
            Intrinsics.checkNotNullParameter(requestKey, "requestKey");
            this.requestKey = requestKey;
            this.warningLever = bigDecimal;
            this.positionLever = bigDecimal2;
            this.currentLever = bigDecimal3;
            this.maxLever = bigDecimal4;
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getRequestKey() {
            return this.requestKey;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final BigDecimal getWarningLever() {
            return this.warningLever;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final BigDecimal getPositionLever() {
            return this.positionLever;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final BigDecimal getCurrentLever() {
            return this.currentLever;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final BigDecimal getMaxLever() {
            return this.maxLever;
        }

        @NotNull
        public final LeverDialogConfig copy(@NotNull String requestKey, @Nullable BigDecimal warningLever, @Nullable BigDecimal positionLever, @Nullable BigDecimal currentLever, @Nullable BigDecimal maxLever) {
            Intrinsics.checkNotNullParameter(requestKey, "requestKey");
            return new LeverDialogConfig(requestKey, warningLever, positionLever, currentLever, maxLever);
        }

        @Nullable
        public final BigDecimal getCurrentLever() {
            return this.currentLever;
        }

        @Nullable
        public final BigDecimal getMaxLever() {
            return this.maxLever;
        }

        @Nullable
        public final BigDecimal getPositionLever() {
            return this.positionLever;
        }

        @NotNull
        public final String getRequestKey() {
            return this.requestKey;
        }

        @Nullable
        public final BigDecimal getWarningLever() {
            return this.warningLever;
        }

        public int hashCode() {
            int iHashCode = this.requestKey.hashCode() * 31;
            BigDecimal bigDecimal = this.warningLever;
            int iHashCode2 = (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
            BigDecimal bigDecimal2 = this.positionLever;
            int iHashCode3 = (iHashCode2 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
            BigDecimal bigDecimal3 = this.currentLever;
            int iHashCode4 = (iHashCode3 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
            BigDecimal bigDecimal4 = this.maxLever;
            return iHashCode4 + (bigDecimal4 != null ? bigDecimal4.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "LeverDialogConfig(requestKey=" + this.requestKey + ", warningLever=" + this.warningLever + ", positionLever=" + this.positionLever + ", currentLever=" + this.currentLever + ", maxLever=" + this.maxLever + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.requestKey);
            dest.writeSerializable(this.warningLever);
            dest.writeSerializable(this.positionLever);
            dest.writeSerializable(this.currentLever);
            dest.writeSerializable(this.maxLever);
        }
    }

    /* JADX INFO: renamed from: com.kubi.loan.view.LeverSettingDialog$a */
    /* JADX INFO: compiled from: LeverSettingDialog.kt */
    @Metadata(m90083d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, m90084d2 = {"com/kubi/loan/view/LeverSettingDialog$initListener$1$7", "Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$OnProgressChangedListenerAdapter;", "getProgressOnActionUp", "", "bubbleSeekBar", "Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;", "progress", "", "progressFloat", "", "LoanLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C17469a extends BubbleSeekBar.AbstractC23000l {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C40450a f32498a;

        public C17469a(C40450a c40450a) {
            this.f32498a = c40450a;
        }

        @Override // com.kubi.resources.widget.bubbleseekbar.BubbleSeekBar.AbstractC23000l, com.kubi.resources.widget.bubbleseekbar.BubbleSeekBar.InterfaceC22999k
        /* JADX INFO: renamed from: b */
        public void mo37833b(BubbleSeekBar bubbleSeekBar, int i11, float f11) {
            super.mo37833b(bubbleSeekBar, i11, f11);
            if (this.f32498a.f89759g.getTag() != null) {
                return;
            }
            this.f32498a.f89756d.getEditText().setText(C6447a.m11724a(new BigDecimal(String.valueOf(f11)).setScale(1, RoundingMode.DOWN)).toPlainString());
            EditText editText = this.f32498a.f89756d.getEditText();
            Intrinsics.checkNotNullExpressionValue(editText, "getEditText(...)");
            C27046k.m66707v(editText);
        }
    }

    /* JADX INFO: renamed from: M3 */
    private final void m37817M3() {
        final C40450a c40450aM37828K3 = m37828K3();
        if (c40450aM37828K3 != null) {
            LeverDialogConfig leverDialogConfigM37829L3 = m37829L3();
            final double dM66647g = C27039d.m66647g(leverDialogConfigM37829L3 != null ? leverDialogConfigM37829L3.getMaxLever() : null);
            LeverDialogConfig leverDialogConfigM37829L4 = m37829L3();
            double dM66647g2 = C27039d.m66647g(leverDialogConfigM37829L4 != null ? leverDialogConfigM37829L4.getCurrentLever() : null);
            AppCompatImageView close = c40450aM37828K3.f89754b;
            Intrinsics.checkNotNullExpressionValue(close, "close");
            C27046k.m66711z(close, 0L, new Function0() { // from class: qo.n
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LeverSettingDialog.m37819O3(this.f96872b);
                }
            }, 1, null);
            KcPrimaryButton confirm = c40450aM37828K3.f89755c;
            Intrinsics.checkNotNullExpressionValue(confirm, "confirm");
            C27046k.m66711z(confirm, 0L, new Function0() { // from class: qo.o
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LeverSettingDialog.m37820P3(this.f96873b, c40450aM37828K3);
                }
            }, 1, null);
            c40450aM37828K3.f89756d.m54821l(0.1d, 1);
            c40450aM37828K3.f89756d.getEditText().setFilters(new C27056j0[]{new C27056j0(1)});
            c40450aM37828K3.f89756d.setValue(dM66647g2);
            AbstractC46099a<CharSequence> abstractC46099aM784d = C0206f.m784d(c40450aM37828K3.f89756d.getEditText());
            final Function1 function1 = new Function1() { // from class: qo.p
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return LeverSettingDialog.m37821Q3(c40450aM37828K3, this, dM66647g, (CharSequence) obj);
                }
            };
            Disposable disposableSubscribe = abstractC46099aM784d.subscribe(new Consumer() { // from class: qo.q
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    LeverSettingDialog.m37822R3(function1, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
            DisposableKt.addTo(disposableSubscribe, getF43550U());
            c40450aM37828K3.f89759g.getConfigBuilder().m55026d(1.0f).m55025c((float) dM66647g).m55028f((int) (dM66647g - ((double) 1))).m55027e(1).m55024b(true).m55023a();
            float f11 = (float) dM66647g2;
            c40450aM37828K3.f89759g.setProgress(Float.valueOf(f11 > 1.0f ? f11 : 1.0f).floatValue());
            c40450aM37828K3.f89759g.setProgressFormatCallback(new BubbleSeekBar.InterfaceC22998j() { // from class: qo.r
                @Override // com.kubi.resources.widget.bubbleseekbar.BubbleSeekBar.InterfaceC22998j
                /* JADX INFO: renamed from: a */
                public final String mo40277a(String str) {
                    return LeverSettingDialog.m37823S3(this.f96879a, str);
                }
            });
            c40450aM37828K3.f89759g.setCustomSectionTextArray(new BubbleSeekBar.InterfaceC22997i() { // from class: qo.s
                @Override // com.kubi.resources.widget.bubbleseekbar.BubbleSeekBar.InterfaceC22997i
                /* JADX INFO: renamed from: a */
                public final SparseArray mo40278a(int i11, SparseArray sparseArray) {
                    return LeverSettingDialog.m37824T3(this.f96880a, i11, sparseArray);
                }
            });
            c40450aM37828K3.f89759g.setOnProgressChangedListener(new C17469a(c40450aM37828K3));
            c40450aM37828K3.f89759g.setWindowProvider(new LeverSeekBar.InterfaceC22927a() { // from class: qo.t
                @Override // com.kubi.resources.widget.LeverSeekBar.InterfaceC22927a
                /* JADX INFO: renamed from: a */
                public final void mo40279a(int[] iArr) {
                    LeverSettingDialog.m37818N3(this.f96881a, iArr);
                }
            });
            ViewGroup.LayoutParams layoutParams = c40450aM37828K3.f89755c.getLayoutParams();
            int iM6183e = C5267e0.m6183e();
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            layoutParams.width = iM6183e - ((int) C27025c.m66565c(contextRequireContext, 24));
            ViewGroup.LayoutParams layoutParams2 = c40450aM37828K3.f89759g.getLayoutParams();
            int iM6183e2 = C5267e0.m6183e();
            Context contextRequireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
            layoutParams2.width = iM6183e2 - ((int) C27025c.m66565c(contextRequireContext2, 24));
        }
    }

    /* JADX INFO: renamed from: S3 */
    public static final String m37823S3(LeverSettingDialog leverSettingDialog, String str) {
        String strM92640e;
        StringBuilder sb2 = new StringBuilder();
        if (leverSettingDialog.m37830U3(str) <= 1.0d) {
            strM92640e = "1";
        } else {
            BigDecimal bigDecimalM66536f = DowngradeExKt.m66536f(str);
            strM92640e = bigDecimalM66536f != null ? C42180b.m92640e(bigDecimalM66536f, null, 4, false, false, false, 0, null, 125, null) : null;
        }
        sb2.append(strM92640e);
        sb2.append('x');
        return sb2.toString();
    }

    /* JADX INFO: renamed from: T3 */
    public static final SparseArray m37824T3(LeverSettingDialog leverSettingDialog, int i11, SparseArray result) {
        Intrinsics.checkNotNullParameter(result, "result");
        result.clear();
        SparseArrayKt.putAll(result, leverSettingDialog.m37827I3());
        return result;
    }

    /* JADX INFO: renamed from: K3 */
    public final C40450a m37828K3() {
        return (C40450a) this.f32496c0.getValue(this, f32495f0[0]);
    }

    /* JADX INFO: renamed from: L3 */
    public final LeverDialogConfig m37829L3() {
        return (LeverDialogConfig) this.f32497d0.getValue();
    }

    /* JADX INFO: renamed from: U3 */
    public final double m37830U3(CharSequence charSequence) {
        try {
            return DowngradeExKt.m66538h(String.valueOf(charSequence), 0.0d, 1, null);
        } catch (Throwable unused) {
            return 0.0d;
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.bloan_dialog_set_lever, container, false);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m37817M3();
    }

    /* JADX INFO: renamed from: J3 */
    public static final LeverDialogConfig m37816J3(LeverSettingDialog leverSettingDialog) {
        Bundle arguments = leverSettingDialog.getArguments();
        if (arguments != null) {
            return (LeverDialogConfig) arguments.getParcelable("data");
        }
        return null;
    }

    /* JADX INFO: renamed from: N3 */
    public static final void m37818N3(LeverSettingDialog leverSettingDialog, int[] iArr) {
        View view = leverSettingDialog.getView();
        if (view != null) {
            view.getLocationOnScreen(iArr);
        }
    }

    /* JADX INFO: renamed from: O3 */
    public static final Unit m37819O3(LeverSettingDialog leverSettingDialog) {
        leverSettingDialog.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: P3 */
    public static final Unit m37820P3(LeverSettingDialog leverSettingDialog, C40450a c40450a) {
        BaseActivity baseActivity;
        String requestKey;
        FragmentActivity activity = leverSettingDialog.getActivity();
        BigDecimal maxLever = null;
        if (activity instanceof BaseActivity) {
            baseActivity = (BaseActivity) activity;
        } else {
            baseActivity = null;
        }
        if (baseActivity != null) {
            LeverDialogConfig leverDialogConfigM37829L3 = leverSettingDialog.m37829L3();
            if (leverDialogConfigM37829L3 != null) {
                requestKey = leverDialogConfigM37829L3.getRequestKey();
            } else {
                requestKey = null;
            }
            String strM66669i = C27041f.m66669i(requestKey, "LeverSettingDialog");
            Bundle bundle = new Bundle();
            double dM37830U3 = leverSettingDialog.m37830U3(c40450a.f89756d.getEditText().getText());
            LeverDialogConfig leverDialogConfigM37829L4 = leverSettingDialog.m37829L3();
            if (leverDialogConfigM37829L4 != null) {
                maxLever = leverDialogConfigM37829L4.getMaxLever();
            }
            bundle.putDouble("data", RangesKt.coerceAtMost(dM37830U3, C27039d.m66647g(maxLever)));
            Unit unit = Unit.INSTANCE;
            baseActivity.setFragmentResult(strM66669i, bundle);
        }
        leverSettingDialog.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Q3 */
    public static final Unit m37821Q3(C40450a c40450a, LeverSettingDialog leverSettingDialog, double d11, CharSequence charSequence) {
        float f11 = 1.0f;
        if (TextUtils.isEmpty(charSequence)) {
            c40450a.f89759g.setProgress(1.0f);
            return Unit.INSTANCE;
        }
        double dM37830U3 = leverSettingDialog.m37830U3(charSequence);
        if (dM37830U3 < 1.0d) {
            d11 = 1.0d;
        } else if (dM37830U3 <= d11) {
            d11 = dM37830U3;
        }
        if (d11 != dM37830U3) {
            c40450a.f89756d.setValue(d11);
        }
        c40450a.f89759g.setTag(Boolean.TRUE);
        if (d11 > 1.0d) {
            f11 = (float) d11;
        }
        c40450a.f89759g.setProgress(f11);
        c40450a.f89759g.setTag(null);
        leverSettingDialog.m37826H3();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: R3 */
    public static final void m37822R3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: H3 */
    public final void m37826H3() {
        BigDecimal positionLever;
        String string;
        BigDecimal positionLever2;
        C40450a c40450aM37828K3 = m37828K3();
        if (c40450aM37828K3 != null) {
            LeverDialogConfig leverDialogConfigM37829L3 = m37829L3();
            BigDecimal warningLever = null;
            strM92640e = null;
            String strM92640e = null;
            if (leverDialogConfigM37829L3 != null) {
                positionLever = leverDialogConfigM37829L3.getPositionLever();
            } else {
                positionLever = null;
            }
            BigDecimal bigDecimal = new BigDecimal(String.valueOf(c40450aM37828K3.f89756d.getValue()));
            AppCompatTextView appCompatTextView = c40450aM37828K3.f89758f;
            if (positionLever != null && bigDecimal.compareTo(positionLever) < 0) {
                c40450aM37828K3.f89755c.setEnabled(false);
                c40450aM37828K3.f89758f.setTextColor(C27017c.f54310a.m66512a(R$color.secondary));
                int i11 = R$string.margin_lever_min_tips;
                StringBuilder sb2 = new StringBuilder();
                LeverDialogConfig leverDialogConfigM37829L4 = m37829L3();
                if (leverDialogConfigM37829L4 != null && (positionLever2 = leverDialogConfigM37829L4.getPositionLever()) != null) {
                    strM92640e = C42180b.m92640e(positionLever2, null, 4, false, false, false, 0, null, 125, null);
                }
                sb2.append(C27041f.m66669i(strM92640e, C33820nf.f71144W));
                sb2.append('x');
                string = getString(i11, sb2.toString());
            } else {
                LeverDialogConfig leverDialogConfigM37829L5 = m37829L3();
                if (leverDialogConfigM37829L5 != null) {
                    warningLever = leverDialogConfigM37829L5.getWarningLever();
                }
                if (bigDecimal.compareTo(warningLever) > 0) {
                    c40450aM37828K3.f89755c.setEnabled(true);
                    c40450aM37828K3.f89758f.setTextColor(C27017c.f54310a.m66512a(R$color.complementary));
                    string = getString(R$string.high_lever_risk_tip);
                } else {
                    c40450aM37828K3.f89755c.setEnabled(true);
                    string = "";
                }
            }
            appCompatTextView.setText(string);
        }
    }

    /* JADX INFO: renamed from: I3 */
    public final SparseArray<String> m37827I3() {
        BigDecimal maxLever;
        LeverDialogConfig leverDialogConfigM37829L3 = m37829L3();
        if (leverDialogConfigM37829L3 != null) {
            maxLever = leverDialogConfigM37829L3.getMaxLever();
        } else {
            maxLever = null;
        }
        double dM66647g = C27039d.m66647g(maxLever);
        SparseArray<String> sparseArray = new SparseArray<>();
        if (dM66647g > 0.0d) {
            int i11 = 0;
            if (dM66647g < 5.0d) {
                int i12 = (int) dM66647g;
                while (i11 < i12) {
                    StringBuilder sb2 = new StringBuilder();
                    int i13 = i11 + 1;
                    sb2.append(i13);
                    sb2.append('x');
                    sparseArray.put(i11, sb2.toString());
                    i11 = i13;
                }
            } else {
                double d11 = (dM66647g - ((double) 1.0f)) / ((double) 4);
                for (int i14 = 0; i14 < 5; i14++) {
                    if (i14 != 0) {
                        if (i14 != 4) {
                            int i15 = (int) (((double) 1) + (((double) i14) * d11));
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(i15);
                            sb3.append('x');
                            sparseArray.put(i15 - 1, sb3.toString());
                        } else {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append((int) dM66647g);
                            sb4.append('x');
                            sparseArray.put((int) (dM66647g - ((double) 1)), sb4.toString());
                        }
                    } else {
                        sparseArray.put(0, "1x");
                    }
                }
            }
        }
        return sparseArray;
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment
    public void dismiss() {
        super.dismiss();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            KeyboardUtils.m6033e(activity);
        }
    }
}
