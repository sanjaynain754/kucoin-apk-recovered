package com.kubi.kucoin.main.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatRadioButton;
import com.airbnb.lottie.C5080h;
import com.airbnb.lottie.LottieDrawable;
import com.blankj.utilcode.util.C5275i0;
import com.kubi.event.api.C12572a;
import com.kubi.kucoin.main.widget.HomeRadioButton;
import com.kubi.kucoin.utils.BottomLottieRequest;
import com.kubi.kucoin.utils.BottomLottieSource;
import com.kubi.kucoin.utils.BottomMenuHelper;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p600rl.C44112a;
import p600rl.InterfaceC44113b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: compiled from: HomeRadioButton.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0017\u0018\u0000 A2\u00020\u0001:\u0001AB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u000bH\u0016J\b\u0010-\u001a\u00020\u000bH\u0016J\u000e\u0010.\u001a\u00020+2\u0006\u0010/\u001a\u00020\u000bJ6\u00100\u001a\u00020+2\u0006\u00101\u001a\u00020\u00182\u0006\u00102\u001a\u00020\u00072\u0006\u00103\u001a\u00020\u00072\u0006\u00104\u001a\u00020\u00182\u0006\u00105\u001a\u00020\u00182\u0006\u00106\u001a\u00020\u000bJ0\u00107\u001a\u00020+2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u00102\u001a\u00020\u00072\u0006\u00103\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u0018H\u0002J\u0010\u00108\u001a\u00020+2\u0006\u00101\u001a\u00020\u0018H\u0002J\u0010\u00109\u001a\u00020+2\u0006\u00101\u001a\u00020\u0018H\u0002J\u0012\u0010:\u001a\u00020+2\b\b\u0002\u0010;\u001a\u00020\u000bH\u0002J\u0010\u0010<\u001a\u00020+2\u0006\u0010;\u001a\u00020\u000bH\u0002J\b\u0010=\u001a\u00020+H\u0002J\b\u0010>\u001a\u00020+H\u0014J\b\u0010?\u001a\u00020+H\u0014J\b\u0010@\u001a\u00020\u000bH\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000f0\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001c\u0010$\u001a\u0004\u0018\u00010%X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006B"}, m90084d2 = {"Lcom/kubi/kucoin/main/widget/HomeRadioButton;", "Landroidx/appcompat/widget/AppCompatRadioButton;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "isFeedInTop", "", "normalDrawable", "Landroid/graphics/drawable/Drawable;", "selectDrawable", "Lcom/airbnb/lottie/LottieDrawable;", "feedTopToHomeDrawable", "feedHomeToTopDrawable", "staticSelectedDrawable", "staticTopDrawable", "asyncRequest", "Lcom/kubi/kucoin/utils/BottomLottieRequest;", "asyncGeneration", "asyncStateKey", "", "selectedAsset", "homeToTopAsset", "topToHomeAsset", "asyncDrawables", "", "asyncModeProvider", "Lkotlin/Function0;", "getAsyncModeProvider$KuFacadeLib_googleRelease", "()Lkotlin/jvm/functions/Function0;", "setAsyncModeProvider$KuFacadeLib_googleRelease", "(Lkotlin/jvm/functions/Function0;)V", "asyncGateway", "Lcom/kubi/kucoin/main/widget/HomeLottieGateway;", "getAsyncGateway$KuFacadeLib_googleRelease", "()Lcom/kubi/kucoin/main/widget/HomeLottieGateway;", "setAsyncGateway$KuFacadeLib_googleRelease", "(Lcom/kubi/kucoin/main/widget/HomeLottieGateway;)V", "setChecked", "", "checked", "performClick", "updateFeedInTop", "feedInTop", "bindBottomTopDrawable", "lottieName", "normalRes", "topRes", "homeToTopName", "topToHomeName", "isDayTheme", "bindAsyncDrawable", "bindTopToHomeDrawable", "bindHomeToTopDrawable", "updateHomeTabDrawable", "isCheckStateUpdate", "updateAsyncHomeTabDrawable", "cancelAsyncRequest", "onAttachedToWindow", "onDetachedFromWindow", "isAsyncModeEnabled", "Companion", "KuFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHomeRadioButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeRadioButton.kt\ncom/kubi/kucoin/main/widget/HomeRadioButton\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,297:1\n1869#2,2:298\n1869#2,2:300\n1869#2,2:302\n1#3:304\n*S KotlinDebug\n*F\n+ 1 HomeRadioButton.kt\ncom/kubi/kucoin/main/widget/HomeRadioButton\n*L\n120#1:298,2\n130#1:300,2\n260#1:302,2\n*E\n"})
public final class HomeRadioButton extends AppCompatRadioButton {

    /* JADX INFO: renamed from: r */
    @NotNull
    public static final Companion f28035r = new Companion(null);

    /* JADX INFO: renamed from: b */
    public boolean f28036b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public Drawable f28037c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public LottieDrawable f28038d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public LottieDrawable f28039e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public LottieDrawable f28040f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public Drawable f28041g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public Drawable f28042h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public BottomLottieRequest f28043i;

    /* JADX INFO: renamed from: j */
    public int f28044j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public String f28045k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public String f28046l;

    /* JADX INFO: renamed from: m */
    @Nullable
    public String f28047m;

    /* JADX INFO: renamed from: n */
    @Nullable
    public String f28048n;

    /* JADX INFO: renamed from: o */
    @NotNull
    public final Map<String, LottieDrawable> f28049o;

    /* JADX INFO: renamed from: p */
    @Nullable
    public Function0<Boolean> f28050p;

    /* JADX INFO: renamed from: q */
    @Nullable
    public InterfaceC44113b f28051q;

    /* JADX INFO: compiled from: HomeRadioButton.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/kucoin/main/widget/HomeRadioButton$Companion;", "", "<init>", "()V", "TAG", "", "KuFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HomeRadioButton(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m32489n(HomeRadioButton homeRadioButton, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        homeRadioButton.m32498m(z11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HomeRadioButton(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: j */
    public static final Unit m32487j(Ref.BooleanRef booleanRef, int i11, HomeRadioButton homeRadioButton, String str, boolean z11, String str2, C5080h composition, BottomLottieSource source) {
        Intrinsics.checkNotNullParameter(composition, "composition");
        Intrinsics.checkNotNullParameter(source, "source");
        booleanRef.element = true;
        int i12 = homeRadioButton.f28044j;
        if (i11 == i12) {
            homeRadioButton.f28043i = null;
        }
        if (i11 != i12 || !Intrinsics.areEqual(homeRadioButton.f28045k, str) || !homeRadioButton.isChecked() || homeRadioButton.f28036b != z11 || !homeRadioButton.isAttachedToWindow()) {
            return Unit.INSTANCE;
        }
        InterfaceC44113b interfaceC44113b = homeRadioButton.f28051q;
        if (interfaceC44113b == null) {
            interfaceC44113b = C44112a.f97406a;
        }
        LottieDrawable lottieDrawableMo97193a = interfaceC44113b.mo97193a(composition);
        Drawable drawable = homeRadioButton.f28037c;
        if (drawable != null) {
            lottieDrawableMo97193a.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        }
        homeRadioButton.f28049o.put(str2, lottieDrawableMo97193a);
        homeRadioButton.setCompoundDrawablesRelative(null, lottieDrawableMo97193a, null, null);
        lottieDrawableMo97193a.start();
        C44128b.m97259c("HomeRadioButton", "[bottomLottieReady] asset=" + str2 + ", source=" + source);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public static final Unit m32488k(Ref.BooleanRef booleanRef, int i11, HomeRadioButton homeRadioButton, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        booleanRef.element = true;
        if (i11 == homeRadioButton.f28044j) {
            homeRadioButton.f28043i = null;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d */
    public final void m32491d(@NotNull String lottieName, int i11, int i12, @NotNull String homeToTopName, @NotNull String topToHomeName, boolean z11) {
        Intrinsics.checkNotNullParameter(lottieName, "lottieName");
        Intrinsics.checkNotNullParameter(homeToTopName, "homeToTopName");
        Intrinsics.checkNotNullParameter(topToHomeName, "topToHomeName");
        Drawable drawable = AppCompatResources.getDrawable(getContext(), i11);
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
            this.f28037c = drawable;
        } else {
            drawable = null;
        }
        String str = z11 ? "" : "-night";
        if (m32495h()) {
            m32490c(StringsKt.replace$default(lottieName, ".json", str + ".json", false, 4, (Object) null), i11, i12, StringsKt.replace$default(homeToTopName, ".json", str + ".json", false, 4, (Object) null), StringsKt.replace$default(topToHomeName, ".json", str + ".json", false, 4, (Object) null));
            setCompoundDrawablePadding(C5275i0.m6236a(1.0f));
            m32489n(this, false, 1, null);
            return;
        }
        BottomMenuHelper bottomMenuHelper = BottomMenuHelper.f28520a;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        LottieDrawable lottieDrawableM33067j = bottomMenuHelper.m33067j(context, StringsKt.replace$default(lottieName, ".json", str + ".json", false, 4, (Object) null));
        this.f28038d = lottieDrawableM33067j;
        if (drawable != null) {
            lottieDrawableM33067j.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        }
        setCompoundDrawablePadding(C5275i0.m6236a(1.0f));
        m32493f(StringsKt.replace$default(topToHomeName, ".json", str + ".json", false, 4, (Object) null));
        m32492e(StringsKt.replace$default(homeToTopName, ".json", str + ".json", false, 4, (Object) null));
        m32489n(this, false, 1, null);
    }

    /* JADX INFO: renamed from: e */
    public final void m32492e(String str) {
        BottomMenuHelper bottomMenuHelper = BottomMenuHelper.f28520a;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        LottieDrawable lottieDrawableM33067j = bottomMenuHelper.m33067j(context, str);
        Drawable drawable = this.f28037c;
        if (drawable != null) {
            lottieDrawableM33067j.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        }
        this.f28040f = lottieDrawableM33067j;
    }

    /* JADX INFO: renamed from: f */
    public final void m32493f(String str) {
        BottomMenuHelper bottomMenuHelper = BottomMenuHelper.f28520a;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        LottieDrawable lottieDrawableM33067j = bottomMenuHelper.m33067j(context, str);
        Drawable drawable = this.f28037c;
        if (drawable != null) {
            lottieDrawableM33067j.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        }
        this.f28039e = lottieDrawableM33067j;
    }

    /* JADX INFO: renamed from: g */
    public final void m32494g() {
        this.f28044j++;
        BottomLottieRequest bottomLottieRequest = this.f28043i;
        if (bottomLottieRequest != null) {
            bottomLottieRequest.cancel();
        }
        this.f28043i = null;
    }

    @Nullable
    /* JADX INFO: renamed from: getAsyncGateway$KuFacadeLib_googleRelease, reason: from getter */
    public final InterfaceC44113b getF28051q() {
        return this.f28051q;
    }

    @Nullable
    public final Function0<Boolean> getAsyncModeProvider$KuFacadeLib_googleRelease() {
        return this.f28050p;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m32495h() {
        Function0<Boolean> function0 = this.f28050p;
        return function0 != null ? function0.invoke().booleanValue() : BottomMenuHelper.f28520a.m33070m();
    }

    /* JADX INFO: renamed from: l */
    public final void m32497l(boolean z11) {
        C44128b.m97259c("HomeRadioButton", "[updateFeedInTop] feedInTop:" + z11 + ", isFeedInTop:" + this.f28036b);
        if (this.f28036b != z11) {
            this.f28036b = z11;
            m32498m(false);
        }
    }

    @Override // android.widget.CompoundButton, android.view.View
    public boolean performClick() {
        C44128b.m97259c("HomeRadioButton", "[performClick] isChecked:" + isChecked() + ", isFeedInTop:" + this.f28036b);
        if (isChecked() && this.f28036b) {
            this.f28036b = false;
            m32489n(this, false, 1, null);
            C12572a.m23695d("com.kubi.home.feed.QuoteEvent:home_tab_jump_page_top", null, 0L, 6, null);
        }
        return super.performClick();
    }

    public final void setAsyncGateway$KuFacadeLib_googleRelease(@Nullable InterfaceC44113b interfaceC44113b) {
        this.f28051q = interfaceC44113b;
    }

    public final void setAsyncModeProvider$KuFacadeLib_googleRelease(@Nullable Function0<Boolean> function0) {
        this.f28050p = function0;
    }

    public /* synthetic */ HomeRadioButton(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: c */
    public final void m32490c(String str, int i11, int i12, String str2, String str3) {
        Drawable drawableMutate;
        m32494g();
        Iterator<T> it = this.f28049o.values().iterator();
        while (true) {
            drawableMutate = null;
            if (!it.hasNext()) {
                break;
            }
            LottieDrawable lottieDrawable = (LottieDrawable) it.next();
            lottieDrawable.m5627v();
            lottieDrawable.setCallback(null);
        }
        this.f28049o.clear();
        this.f28046l = str;
        this.f28047m = str2;
        this.f28048n = str3;
        BottomMenuHelper bottomMenuHelper = BottomMenuHelper.f28520a;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.f28041g = bottomMenuHelper.m33065h(context, i11);
        Drawable drawable = AppCompatResources.getDrawable(getContext(), i12);
        if (drawable != null) {
            drawableMutate = drawable.mutate();
        }
        this.f28042h = drawableMutate;
        for (Drawable drawable2 : CollectionsKt.listOf((Object[]) new Drawable[]{this.f28041g, drawableMutate})) {
            Drawable drawable3 = this.f28037c;
            if (drawable3 != null && drawable2 != null) {
                drawable2.setBounds(0, 0, drawable3.getMinimumWidth(), drawable3.getMinimumHeight());
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m32496i(boolean z11) {
        String str;
        Drawable drawable;
        if (!isChecked()) {
            this.f28045k = "unchecked";
            m32494g();
            setCompoundDrawablesRelative(null, this.f28037c, null, null);
            return;
        }
        final boolean z12 = this.f28036b;
        if (!z11 && z12) {
            str = this.f28047m;
        } else if (!z11) {
            str = this.f28048n;
        } else if (z12) {
            str = this.f28047m;
        } else {
            str = this.f28046l;
        }
        final String str2 = str;
        if (str2 != null) {
            final String str3 = str2 + ':' + z12;
            this.f28045k = str3;
            m32494g();
            LottieDrawable lottieDrawable = this.f28049o.get(str2);
            if (lottieDrawable != null) {
                setCompoundDrawablesRelative(null, lottieDrawable, null, null);
                lottieDrawable.start();
                return;
            }
            if (z12) {
                drawable = this.f28042h;
            } else {
                drawable = this.f28041g;
            }
            setCompoundDrawablesRelative(null, drawable, null, null);
            if (isAttachedToWindow()) {
                final int i11 = this.f28044j;
                final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                InterfaceC44113b interfaceC44113b = this.f28051q;
                if (interfaceC44113b == null) {
                    interfaceC44113b = C44112a.f97406a;
                }
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                BottomLottieRequest bottomLottieRequestMo97194b = interfaceC44113b.mo97194b(context, str2, new Function2() { // from class: rl.c
                    @Override // p852kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return HomeRadioButton.m32487j(booleanRef, i11, this, str3, z12, str2, (C5080h) obj, (BottomLottieSource) obj2);
                    }
                }, new Function1() { // from class: rl.d
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return HomeRadioButton.m32488k(booleanRef, i11, this, (Throwable) obj);
                    }
                });
                if (!booleanRef.element) {
                    this.f28043i = bottomLottieRequestMo97194b;
                }
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m32498m(boolean z11) {
        Drawable drawable;
        if (m32495h() && this.f28046l != null) {
            m32496i(z11);
            return;
        }
        LottieDrawable lottieDrawable = null;
        if (!z11 && isChecked()) {
            if (this.f28036b) {
                drawable = this.f28040f;
            } else {
                drawable = this.f28039e;
            }
        } else {
            drawable = null;
        }
        if (drawable == null) {
            if (isChecked()) {
                if (this.f28036b) {
                    drawable = this.f28040f;
                } else {
                    drawable = this.f28038d;
                }
            } else {
                drawable = this.f28037c;
            }
        }
        setCompoundDrawablesRelative(null, drawable, null, null);
        if (drawable instanceof LottieDrawable) {
            lottieDrawable = (LottieDrawable) drawable;
        }
        if (lottieDrawable != null) {
            lottieDrawable.start();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (m32495h() && this.f28046l != null) {
            m32489n(this, false, 1, null);
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        m32494g();
        Iterator<T> it = this.f28049o.values().iterator();
        while (it.hasNext()) {
            ((LottieDrawable) it.next()).m5627v();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean checked) {
        super.setChecked(checked);
        m32489n(this, false, 1, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HomeRadioButton(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f28049o = new LinkedHashMap();
    }
}
