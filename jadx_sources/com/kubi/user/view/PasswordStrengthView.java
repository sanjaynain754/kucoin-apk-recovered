package com.kubi.user.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import c70.C4898t0;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import com.kubi.user.R$color;
import com.kubi.user.R$drawable;
import com.kubi.user.R$layout;
import com.kubi.user.R$string;
import com.kubi.user.helper.PasswordStrength;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45682f;

/* JADX INFO: compiled from: PasswordStrengthView.kt */
/* JADX INFO: loaded from: classes53.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011R\u001d\u0010\b\u001a\u0004\u0018\u00010\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/user/view/PasswordStrengthView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/kubi/user/databinding/ViewPasswordStrengthBinding;", "getBinding", "()Lcom/kubi/user/databinding/ViewPasswordStrengthBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "setStrength", "", "strength", "Lcom/kubi/user/helper/PasswordStrength;", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPasswordStrengthView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PasswordStrengthView.kt\ncom/kubi/user/view/PasswordStrengthView\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n*L\n1#1,68:1\n52#2:69\n80#2,7:70\n*S KotlinDebug\n*F\n+ 1 PasswordStrengthView.kt\ncom/kubi/user/view/PasswordStrengthView\n*L\n24#1:69\n24#1:70,7\n*E\n"})
public final class PasswordStrengthView extends LinearLayout {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ KProperty<Object>[] f53927c = {Reflection.property1(new PropertyReference1Impl(PasswordStrengthView.class, "binding", "getBinding()Lcom/kubi/user/databinding/ViewPasswordStrengthBinding;", 0))};

    /* JADX INFO: renamed from: b */
    @NotNull
    public final InterfaceC24293a f53928b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public PasswordStrengthView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: com.kubi.user.view.PasswordStrengthView$a */
    /* JADX INFO: compiled from: PasswordStrengthView.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C26848a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PasswordStrength.values().length];
            try {
                iArr[PasswordStrength.WEAK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PasswordStrength.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PasswordStrength.STRONG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ PasswordStrengthView(Context context, AttributeSet attributeSet, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet);
    }

    @Nullable
    public final C4898t0 getBinding() {
        return (C4898t0) this.f53928b.getValue(this, f53927c[0]);
    }

    public final void setStrength(@NotNull PasswordStrength strength) {
        BaseTextView baseTextView;
        ImageView imageView;
        ImageView imageView2;
        ImageView imageView3;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        LinearLayout linearLayout;
        BaseTextView baseTextView4;
        ImageView imageView4;
        ImageView imageView5;
        ImageView imageView6;
        BaseTextView baseTextView5;
        BaseTextView baseTextView6;
        LinearLayout linearLayout2;
        BaseTextView baseTextView7;
        ImageView imageView7;
        ImageView imageView8;
        ImageView imageView9;
        BaseTextView baseTextView8;
        BaseTextView baseTextView9;
        LinearLayout linearLayout3;
        LinearLayout linearLayout4;
        Intrinsics.checkNotNullParameter(strength, "strength");
        int i11 = C26848a.$EnumSwitchMapping$0[strength.ordinal()];
        if (i11 == 1) {
            C4898t0 binding = getBinding();
            if (binding != null && (linearLayout = binding.f5334e) != null) {
                C27046k.m66685H(linearLayout);
            }
            C4898t0 binding2 = getBinding();
            if (binding2 != null && (baseTextView3 = binding2.f5335f) != null) {
                baseTextView3.setText(C27017c.f54310a.m66516f(R$string.loginpassword_weak, new Object[0]));
            }
            C4898t0 binding3 = getBinding();
            if (binding3 != null && (baseTextView2 = binding3.f5335f) != null) {
                baseTextView2.setTextColor(C27017c.f54310a.m66512a(R$color.brandRed));
            }
            C4898t0 binding4 = getBinding();
            if (binding4 != null && (imageView3 = binding4.f5331b) != null) {
                imageView3.setImageResource(R$drawable.shape_password_strength_hint_weak);
            }
            C4898t0 binding5 = getBinding();
            if (binding5 != null && (imageView2 = binding5.f5332c) != null) {
                imageView2.setImageResource(R$drawable.shape_password_strength_hint_none);
            }
            C4898t0 binding6 = getBinding();
            if (binding6 != null && (imageView = binding6.f5333d) != null) {
                imageView.setImageResource(R$drawable.shape_password_strength_hint_none);
            }
            C4898t0 binding7 = getBinding();
            if (binding7 == null || (baseTextView = binding7.f5336g) == null) {
                return;
            }
            C27046k.m66685H(baseTextView);
            return;
        }
        if (i11 == 2) {
            C4898t0 binding8 = getBinding();
            if (binding8 != null && (linearLayout2 = binding8.f5334e) != null) {
                C27046k.m66685H(linearLayout2);
            }
            C4898t0 binding9 = getBinding();
            if (binding9 != null && (baseTextView6 = binding9.f5335f) != null) {
                baseTextView6.setText(C27017c.f54310a.m66516f(R$string.loginpassword_normal, new Object[0]));
            }
            C4898t0 binding10 = getBinding();
            if (binding10 != null && (baseTextView5 = binding10.f5335f) != null) {
                baseTextView5.setTextColor(C27017c.f54310a.m66512a(R$color.complementary));
            }
            C4898t0 binding11 = getBinding();
            if (binding11 != null && (imageView6 = binding11.f5331b) != null) {
                imageView6.setImageResource(R$drawable.shape_password_strength_hint_medium);
            }
            C4898t0 binding12 = getBinding();
            if (binding12 != null && (imageView5 = binding12.f5332c) != null) {
                imageView5.setImageResource(R$drawable.shape_password_strength_hint_medium);
            }
            C4898t0 binding13 = getBinding();
            if (binding13 != null && (imageView4 = binding13.f5333d) != null) {
                imageView4.setImageResource(R$drawable.shape_password_strength_hint_none);
            }
            C4898t0 binding14 = getBinding();
            if (binding14 == null || (baseTextView4 = binding14.f5336g) == null) {
                return;
            }
            C27046k.m66685H(baseTextView4);
            return;
        }
        if (i11 != 3) {
            C4898t0 binding15 = getBinding();
            if (binding15 == null || (linearLayout4 = binding15.f5334e) == null) {
                return;
            }
            ViewExtKt.m66577h(linearLayout4);
            return;
        }
        C4898t0 binding16 = getBinding();
        if (binding16 != null && (linearLayout3 = binding16.f5334e) != null) {
            C27046k.m66685H(linearLayout3);
        }
        C4898t0 binding17 = getBinding();
        if (binding17 != null && (baseTextView9 = binding17.f5335f) != null) {
            baseTextView9.setText(C27017c.f54310a.m66516f(R$string.loginpassword_strong, new Object[0]));
        }
        C4898t0 binding18 = getBinding();
        if (binding18 != null && (baseTextView8 = binding18.f5335f) != null) {
            baseTextView8.setTextColor(C27017c.f54310a.m66512a(R$color.brandGreen));
        }
        C4898t0 binding19 = getBinding();
        if (binding19 != null && (imageView9 = binding19.f5331b) != null) {
            imageView9.setImageResource(R$drawable.shape_password_strength_hint_strong);
        }
        C4898t0 binding20 = getBinding();
        if (binding20 != null && (imageView8 = binding20.f5332c) != null) {
            imageView8.setImageResource(R$drawable.shape_password_strength_hint_strong);
        }
        C4898t0 binding21 = getBinding();
        if (binding21 != null && (imageView7 = binding21.f5333d) != null) {
            imageView7.setImageResource(R$drawable.shape_password_strength_hint_strong);
        }
        C4898t0 binding22 = getBinding();
        if (binding22 == null || (baseTextView7 = binding22.f5336g) == null) {
            return;
        }
        ViewExtKt.m66577h(baseTextView7);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PasswordStrengthView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f53928b = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C4898t0>() { // from class: com.kubi.user.view.PasswordStrengthView$special$$inlined$customViewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C4898t0 invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C4898t0.m5075a(C45682f.m100800a(viewGroup));
            }
        });
        LayoutInflater.from(context).inflate(R$layout.view_password_strength, (ViewGroup) this, true);
    }
}
