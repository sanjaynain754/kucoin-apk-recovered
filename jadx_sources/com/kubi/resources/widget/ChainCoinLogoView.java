package com.kubi.resources.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.content.ContextCompat;
import com.kubi.sdk.res.R$color;
import com.kubi.sdk.res.R$layout;
import com.kubi.sdk.res.R$mipmap;
import com.kubi.sdk.util.C24277v;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.C27029c;
import com.kubi.utils.extensions.core.ViewExtKt;
import k00.C40838b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p419l2.C42032f;
import p778xy.C46338a;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;
import w00.C45682f;

/* JADX INFO: compiled from: ChainCoinLogoView.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ?\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0017JG\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u001aJ \u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0013H\u0002J \u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0013H\u0002J\b\u0010 \u001a\u00020!H\u0002J\b\u0010\"\u001a\u00020#H\u0002R\u001d\u0010\n\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006$"}, m90084d2 = {"Lcom/kubi/resources/widget/ChainCoinLogoView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/kubi/sdk/res/databinding/CommonViewChainCoinLogoViewBinding;", "getBinding", "()Lcom/kubi/sdk/res/databinding/CommonViewChainCoinLogoViewBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "setLogo", "", "coinLogo", "", "chainLogo", "coinLogoSize", "chainLogoSize", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Landroid/content/Context;)V", "setAlphaLogo", "displayName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Landroid/content/Context;)V", "createAlphaCoinFallbackDrawable", "Landroid/graphics/drawable/Drawable;", "sizePx", "buildTextAvatarBitmap", "Landroid/graphics/Bitmap;", "mediumSansTypeface", "Landroid/graphics/Typeface;", "isAppDayTheme", "", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nChainCoinLogoView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChainCoinLogoView.kt\ncom/kubi/resources/widget/ChainCoinLogoView\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n+ 3 Bitmap.kt\nandroidx/core/graphics/BitmapKt\n*L\n1#1,197:1\n52#2:198\n80#2,7:199\n90#3,6:206\n*S KotlinDebug\n*F\n+ 1 ChainCoinLogoView.kt\ncom/kubi/resources/widget/ChainCoinLogoView\n*L\n37#1:198\n37#1:199,7\n162#1:206,6\n*E\n"})
public final class ChainCoinLogoView extends FrameLayout {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ KProperty<Object>[] f43739c = {Reflection.property1(new PropertyReference1Impl(ChainCoinLogoView.class, "binding", "getBinding()Lcom/kubi/sdk/res/databinding/CommonViewChainCoinLogoViewBinding;", 0))};

    /* JADX INFO: renamed from: b */
    @NotNull
    public final InterfaceC24293a f43740b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ChainCoinLogoView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: c */
    public final Bitmap m54464c(Context context, int i11, String str) {
        String str2;
        int iCoerceAtLeast = RangesKt.coerceAtLeast(i11, 1);
        String string = StringsKt.trim((CharSequence) str).toString();
        if (string.length() == 0) {
            str2 = "?";
        } else {
            char[] chars = Character.toChars(string.codePointAt(0));
            Intrinsics.checkNotNullExpressionValue(chars, "toChars(...)");
            str2 = new String(chars);
        }
        int iM66699n = C27046k.m66699n(context, !m54466e() ? R$color.c_cover8 : R$color.c_cover4);
        int iM66699n2 = C27046k.m66699n(context, R$color.c_text20);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iCoerceAtLeast, iCoerceAtLeast, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(1);
        paint.setColor(iM66699n);
        paint.setStyle(Paint.Style.FILL);
        float f11 = iCoerceAtLeast;
        float f12 = f11 / 2.0f;
        canvas.drawCircle(f12, f12, f12, paint);
        Paint paint2 = new Paint(1);
        paint2.setColor(iM66699n2);
        paint2.setTextSize(f11 * 0.5f);
        paint2.setTextAlign(Paint.Align.CENTER);
        paint2.setTypeface(m54467f());
        Paint.FontMetrics fontMetrics = paint2.getFontMetrics();
        canvas.drawText(str2, f12, ((-(fontMetrics.ascent + fontMetrics.descent)) / 2.0f) + f12, paint2);
        return bitmapCreateBitmap;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ChainCoinLogoView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final C40838b getBinding() {
        return (C40838b) this.f43740b.getValue(this, f43739c[0]);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m54460h(ChainCoinLogoView chainCoinLogoView, String str, String str2, String str3, Integer num, Integer num2, Context context, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            num = null;
        }
        if ((i11 & 16) != 0) {
            num2 = null;
        }
        if ((i11 & 32) != 0) {
            context = null;
        }
        chainCoinLogoView.m54468g(str, str2, str3, num, num2, context);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m54462k(ChainCoinLogoView chainCoinLogoView, String str, String str2, Integer num, Integer num2, Context context, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            num = null;
        }
        if ((i11 & 8) != 0) {
            num2 = null;
        }
        if ((i11 & 16) != 0) {
            context = null;
        }
        chainCoinLogoView.m54469j(str, str2, num, num2, context);
    }

    /* JADX INFO: renamed from: d */
    public final Drawable m54465d(Context context, int i11, String str) {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(new BitmapDrawable(context.getResources(), m54464c(context, i11, str)));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103847exceptionOrNullimpl(objM103844constructorimpl) != null && (objM103844constructorimpl = ContextCompat.getDrawable(context, R$mipmap.kucoin_icon_default_icon)) == null) {
            objM103844constructorimpl = new ColorDrawable(0);
        }
        return (Drawable) objM103844constructorimpl;
    }

    /* JADX INFO: renamed from: f */
    public final Typeface m54467f() {
        if (Build.VERSION.SDK_INT >= 28) {
            Typeface typefaceCreate = Typeface.create(Typeface.SANS_SERIF, 500, false);
            Intrinsics.checkNotNull(typefaceCreate);
            return typefaceCreate;
        }
        Typeface typefaceCreate2 = Typeface.create(Typeface.SANS_SERIF, 1);
        Intrinsics.checkNotNull(typefaceCreate2);
        return typefaceCreate2;
    }

    /* JADX INFO: renamed from: g */
    public final void m54468g(@NotNull final String coinLogo, @NotNull final String chainLogo, @NotNull final String displayName, @Nullable final Integer num, @Nullable final Integer num2, @Nullable final Context context) {
        Intrinsics.checkNotNullParameter(coinLogo, "coinLogo");
        Intrinsics.checkNotNullParameter(chainLogo, "chainLogo");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        C27100x0.m66923d(new Function0() { // from class: com.kubi.resources.widget.o
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChainCoinLogoView.m54461i(this.f45002b, context, num, num2, chainLogo, displayName, coinLogo);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public final void m54469j(@NotNull final String coinLogo, @NotNull final String chainLogo, @Nullable final Integer num, @Nullable final Integer num2, @Nullable final Context context) {
        Intrinsics.checkNotNullParameter(coinLogo, "coinLogo");
        Intrinsics.checkNotNullParameter(chainLogo, "chainLogo");
        C27100x0.m66923d(new Function0() { // from class: com.kubi.resources.widget.n
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChainCoinLogoView.m54463l(this.f44992b, context, coinLogo, chainLogo, num, num2);
            }
        });
    }

    public /* synthetic */ ChainCoinLogoView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m54461i(ChainCoinLogoView chainCoinLogoView, Context context, Integer num, Integer num2, String str, String str2, String str3) {
        int iIntValue;
        C40838b binding = chainCoinLogoView.getBinding();
        if (binding == null) {
            return Unit.INSTANCE;
        }
        if (context == null) {
            context = chainCoinLogoView.getContext();
        }
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 26;
        }
        int iCoerceAtLeast = RangesKt.coerceAtLeast(C27029c.m66601d(chainCoinLogoView, iIntValue), 1);
        if (num != null) {
            int iM66601d = C27029c.m66601d(chainCoinLogoView, num.intValue());
            CoinAvatarView coinIcon = binding.f90726c;
            Intrinsics.checkNotNullExpressionValue(coinIcon, "coinIcon");
            ViewExtKt.m66569A(coinIcon, iM66601d, iM66601d);
        }
        if (num2 != null) {
            int iM66601d2 = C27029c.m66601d(chainCoinLogoView, num2.intValue());
            CoinAvatarView chainIcon = binding.f90725b;
            Intrinsics.checkNotNullExpressionValue(chainIcon, "chainIcon");
            ViewExtKt.m66569A(chainIcon, iM66601d2, iM66601d2);
        }
        CoinAvatarView coinAvatarView = binding.f90725b;
        Intrinsics.checkNotNull(context);
        coinAvatarView.setStrokeColor(C27046k.m66699n(context, R$color.c_overlay));
        C24277v.m58540e(context, str, binding.f90725b);
        CoinAvatarView coinIcon2 = binding.f90726c;
        Intrinsics.checkNotNullExpressionValue(coinIcon2, "coinIcon");
        Drawable drawableM54465d = chainCoinLogoView.m54465d(context, iCoerceAtLeast, str2);
        if (!C24277v.m58537b(context)) {
            coinIcon2.setImageDrawable(drawableM54465d);
            return Unit.INSTANCE;
        }
        C46338a.m102151a(context).m6625m(coinIcon2);
        if (StringsKt.isBlank(str3)) {
            coinIcon2.setImageDrawable(drawableM54465d);
            return Unit.INSTANCE;
        }
        C46338a.m102151a(context).mo6634v(str3).mo6606a(new C42032f().mo92193e().mo92190c0(drawableM54465d).mo92210n(drawableM54465d)).m6594E0(coinIcon2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l */
    public static final Unit m54463l(ChainCoinLogoView chainCoinLogoView, Context context, String str, String str2, Integer num, Integer num2) {
        C40838b binding = chainCoinLogoView.getBinding();
        if (binding == null) {
            return Unit.INSTANCE;
        }
        if (context == null) {
            context = chainCoinLogoView.getContext();
        }
        C24277v.m58540e(context, str, binding.f90726c);
        C24277v.m58540e(context, str2, binding.f90725b);
        CoinAvatarView coinAvatarView = binding.f90725b;
        Intrinsics.checkNotNull(context);
        coinAvatarView.setStrokeColor(C27046k.m66699n(context, R$color.c_overlay));
        if (num != null) {
            int iM66601d = C27029c.m66601d(chainCoinLogoView, num.intValue());
            CoinAvatarView coinIcon = binding.f90726c;
            Intrinsics.checkNotNullExpressionValue(coinIcon, "coinIcon");
            ViewExtKt.m66569A(coinIcon, iM66601d, iM66601d);
        }
        if (num2 != null) {
            int iM66601d2 = C27029c.m66601d(chainCoinLogoView, num2.intValue());
            CoinAvatarView chainIcon = binding.f90725b;
            Intrinsics.checkNotNullExpressionValue(chainIcon, "chainIcon");
            ViewExtKt.m66569A(chainIcon, iM66601d2, iM66601d2);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m54466e() {
        if (AppCompatDelegate.getDefaultNightMode() != 2) {
            return true;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ChainCoinLogoView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f43740b = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C40838b>() { // from class: com.kubi.resources.widget.ChainCoinLogoView$special$$inlined$customViewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C40838b invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C40838b.m89372a(C45682f.m100800a(viewGroup));
            }
        });
        LayoutInflater.from(context).inflate(R$layout.common_view_chain_coin_logo_view, (ViewGroup) this, true);
    }
}
