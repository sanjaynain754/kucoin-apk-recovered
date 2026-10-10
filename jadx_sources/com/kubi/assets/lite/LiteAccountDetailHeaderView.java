package com.kubi.assets.lite;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.kubi.assets.R$layout;
import com.kubi.resources.widget.ShowHideTextView;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import com.kubi.utils.extensions.C27046k;
import io.reactivex.functions.Consumer;
import lb.C42153h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p637ta.C44856r5;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45682f;
import y70.C46392a;

/* JADX INFO: compiled from: LiteAccountDetailHeaderView.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011J\u0016\u0010\u0013\u001a\u00020\u000f2\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015R\u001d\u0010\b\u001a\u0004\u0018\u00010\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/assets/lite/LiteAccountDetailHeaderView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/kubi/assets/databinding/LiteAssetViewAccountDetailHeaderBinding;", "getBinding", "()Lcom/kubi/assets/databinding/LiteAssetViewAccountDetailHeaderBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "setCoinPrice", "", "coinNumber", "", "coinPrice", "bindEyesChanged", "consumer", "Lio/reactivex/functions/Consumer;", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nLiteAccountDetailHeaderView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiteAccountDetailHeaderView.kt\ncom/kubi/assets/lite/LiteAccountDetailHeaderView\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n+ 3 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,44:1\n41#2:45\n65#2:46\n80#2,7:47\n135#3,2:54\n126#3,2:56\n*S KotlinDebug\n*F\n+ 1 LiteAccountDetailHeaderView.kt\ncom/kubi/assets/lite/LiteAccountDetailHeaderView\n*L\n24#1:45\n24#1:46\n24#1:47,7\n28#1:54,2\n39#1:56,2\n*E\n"})
public final class LiteAccountDetailHeaderView extends ConstraintLayout {

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ KProperty<Object>[] f17862o = {Reflection.property1(new PropertyReference1Impl(LiteAccountDetailHeaderView.class, "binding", "getBinding()Lcom/kubi/assets/databinding/LiteAssetViewAccountDetailHeaderBinding;", 0))};

    /* JADX INFO: renamed from: n */
    @NotNull
    public final InterfaceC24293a f17863n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiteAccountDetailHeaderView(@NotNull Context context, @NotNull AttributeSet attrs) {
        AppCompatCheckBox appCompatCheckBox;
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f17863n = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C44856r5>() { // from class: com.kubi.assets.lite.LiteAccountDetailHeaderView$special$$inlined$viewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C44856r5 invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C44856r5.m99236a(C45682f.m100801b(viewGroup));
            }
        });
        LayoutInflater.from(context).inflate(R$layout.lite_asset_view_account_detail_header, this);
        C44856r5 binding = getBinding();
        if (binding == null || (appCompatCheckBox = binding.f100750b) == null) {
            return;
        }
        appCompatCheckBox.setChecked(C46392a.m102322d(C42153h.f93593a.m92500D(), false));
    }

    /* JADX INFO: renamed from: c */
    public static final Unit m17600c(Consumer consumer, CompoundButton compoundButton, boolean z11) throws Exception {
        Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
        C46392a.m102328k(C42153h.f93593a.m92500D(), z11);
        consumer.accept(Boolean.valueOf(z11));
        return Unit.INSTANCE;
    }

    private final C44856r5 getBinding() {
        return (C44856r5) this.f17863n.getValue(this, f17862o[0]);
    }

    /* JADX INFO: renamed from: b */
    public final void m17601b(@Nullable final Consumer<Boolean> consumer) {
        C44856r5 binding;
        AppCompatCheckBox appCompatCheckBox;
        if (consumer == null || (binding = getBinding()) == null || (appCompatCheckBox = binding.f100750b) == null) {
            return;
        }
        C27046k.m66708w(appCompatCheckBox, new Function2() { // from class: com.kubi.assets.lite.q
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return LiteAccountDetailHeaderView.m17600c(consumer, (CompoundButton) obj, ((Boolean) obj2).booleanValue());
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public final void m17602d(@NotNull String coinNumber, @NotNull String coinPrice) {
        ShowHideTextView showHideTextView;
        ShowHideTextView showHideTextView2;
        Intrinsics.checkNotNullParameter(coinNumber, "coinNumber");
        Intrinsics.checkNotNullParameter(coinPrice, "coinPrice");
        C44856r5 binding = getBinding();
        if (binding != null && (showHideTextView2 = binding.f100752d) != null) {
            showHideTextView2.setText(coinNumber);
        }
        C44856r5 binding2 = getBinding();
        if (binding2 == null || (showHideTextView = binding2.f100753e) == null) {
            return;
        }
        showHideTextView.setText(coinPrice);
    }
}
