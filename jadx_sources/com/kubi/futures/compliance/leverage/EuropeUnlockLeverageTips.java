package com.kubi.futures.compliance.leverage;

import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.ViewKt;
import com.kubi.futures.data.compliance.entity.EuropeUnlockLeverageLevelTaskEntity;
import com.kubi.kumex.R$color;
import com.kubi.kumex.R$string;
import com.kubi.kumex.service.KuMexDepend;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.widget.shape.layout.ShapeLinearLayout;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import dm.C36760f2;
import dm.C36795l1;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41775x1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p836zl.C46894j;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;
import y70.C46392a;

/* JADX INFO: compiled from: EuropeUnlockLeverageTips.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013J\u0010\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u001e\u0010\u0016\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u000fH\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/futures/compliance/leverage/EuropeUnlockLeverageTips;", "", "<init>", "()V", "stubBinding", "Lcom/kubi/kumex/databinding/BkumexEuropeUnlockLeverageTipsBinding;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "scope$delegate", "Lkotlin/Lazy;", "job", "Lkotlinx/coroutines/Job;", "inject", "", "binding", "Lcom/kubi/kumex/databinding/BkumexFragmentFuturesBinding;", "tasks", "", "Lcom/kubi/futures/data/compliance/entity/EuropeUnlockLeverageLevelTaskEntity;", "fetchLevel", "render", "shouldShow", "", "save", "getTodayDate", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nEuropeUnlockLeverageTips.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EuropeUnlockLeverageTips.kt\ncom/kubi/futures/compliance/leverage/EuropeUnlockLeverageTips\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,162:1\n117#2,13:163\n1788#3,4:176\n32#4:180\n23#4,2:181\n*S KotlinDebug\n*F\n+ 1 EuropeUnlockLeverageTips.kt\ncom/kubi/futures/compliance/leverage/EuropeUnlockLeverageTips\n*L\n63#1:163,13\n100#1:176,4\n145#1:180\n153#1:181,2\n*E\n"})
public final class EuropeUnlockLeverageTips {

    /* JADX INFO: renamed from: a */
    @Nullable
    public C36795l1 f22618a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Lazy f22619b = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.compliance.leverage.k0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return EuropeUnlockLeverageTips.m24674m();
        }
    });

    /* JADX INFO: renamed from: c */
    @Nullable
    public InterfaceC41775x1 f22620c;

    /* JADX INFO: renamed from: com.kubi.futures.compliance.leverage.EuropeUnlockLeverageTips$a */
    /* JADX INFO: compiled from: View.kt */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007¸\u0006\u0000"}, m90084d2 = {"androidx/core/view/ViewKt$doOnDetach$1", "Landroid/view/View$OnAttachStateChangeListener;", "onViewAttachedToWindow", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "onViewDetachedFromWindow", "core-ktx_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt$doOnDetach$1\n+ 2 EuropeUnlockLeverageTips.kt\ncom/kubi/futures/compliance/leverage/EuropeUnlockLeverageTips\n*L\n1#1,414:1\n64#2,2:415\n*E\n"})
    public static final class ViewOnAttachStateChangeListenerC12885a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ View f22621b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ EuropeUnlockLeverageTips f22622c;

        public ViewOnAttachStateChangeListenerC12885a(View view, EuropeUnlockLeverageTips europeUnlockLeverageTips) {
            this.f22621b = view;
            this.f22622c = europeUnlockLeverageTips;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(@NotNull View view) {
            this.f22621b.removeOnAttachStateChangeListener(this);
            InterfaceC41775x1 interfaceC41775x1 = this.f22622c.f22620c;
            if (interfaceC41775x1 != null) {
                InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@NotNull View view) {
        }
    }

    /* JADX INFO: renamed from: com.kubi.futures.compliance.leverage.EuropeUnlockLeverageTips$b */
    /* JADX INFO: compiled from: EuropeUnlockLeverageTips.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m90084d2 = {"com/kubi/futures/compliance/leverage/EuropeUnlockLeverageTips$render$1", "Landroid/text/style/ClickableSpan;", "onClick", "", "widget", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C12886b extends ClickableSpan {
        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            Intrinsics.checkNotNullParameter(widget, "widget");
            EuropeUnlockLeverageDialog.Companion companion = EuropeUnlockLeverageDialog.f22609w0;
            FragmentManager childFragmentManager = ViewKt.findFragment(widget).getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            EuropeUnlockLeverageDialog.Companion.show$default(companion, childFragmentManager, false, false, 6, null);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint ds2) {
            Intrinsics.checkNotNullParameter(ds2, "ds");
            super.updateDrawState(ds2);
            ds2.setUnderlineText(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m24672i(EuropeUnlockLeverageTips europeUnlockLeverageTips, C36760f2 c36760f2, List list, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            list = null;
        }
        europeUnlockLeverageTips.m24678h(c36760f2, list);
    }

    /* JADX INFO: renamed from: f */
    public final InterfaceC41709m0 m24676f() {
        return (InterfaceC41709m0) this.f22619b.getValue();
    }

    /* JADX INFO: renamed from: g */
    public final String m24677g() {
        String str = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date());
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    /* JADX INFO: renamed from: h */
    public final void m24678h(@Nullable C36760f2 c36760f2, @Nullable List<EuropeUnlockLeverageLevelTaskEntity> list) {
        ShapeLinearLayout root;
        InterfaceC41775x1 interfaceC41775x1 = this.f22620c;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        KuMexDepend kuMexDepend = KuMexDepend.f30378a;
        if (!kuMexDepend.m35905g().c() || !kuMexDepend.m35906h() || !m24681n() || c36760f2 == null) {
            C36795l1 c36795l1 = this.f22618a;
            if (c36795l1 == null || (root = c36795l1.getRoot()) == null) {
                return;
            }
            ViewExtKt.m66577h(root);
            return;
        }
        ConstraintLayout constraintLayoutM82373b = c36760f2.getRoot();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutM82373b, "getRoot(...)");
        if (constraintLayoutM82373b.isAttachedToWindow()) {
            constraintLayoutM82373b.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC12885a(constraintLayoutM82373b, this));
        } else {
            InterfaceC41775x1 interfaceC41775x2 = this.f22620c;
            if (interfaceC41775x2 != null) {
                InterfaceC41775x1.a.m91377a(interfaceC41775x2, null, 1, null);
            }
        }
        if (list != null) {
            m24679j(list, c36760f2);
        } else {
            m24675e(c36760f2);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m24680l() {
        C46392a.m102333p(C46894j.f104736a.m103240E(), m24677g());
    }

    /* JADX INFO: renamed from: n */
    public final boolean m24681n() {
        String strM102326h = C46392a.m102326h(C46894j.f104736a.m103240E(), "");
        if (strM102326h.length() == 0) {
            return true;
        }
        return StringsKt.contains$default((CharSequence) strM102326h, (CharSequence) m24677g(), false, 2, (Object) null);
    }

    /* JADX INFO: renamed from: k */
    public static final Unit m24673k(EuropeUnlockLeverageTips europeUnlockLeverageTips, C36795l1 c36795l1) {
        europeUnlockLeverageTips.m24680l();
        ShapeLinearLayout root = c36795l1.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        ViewExtKt.m66577h(root);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m */
    public static final InterfaceC41709m0 m24674m() {
        return C41713n0.m91126b();
    }

    /* JADX INFO: renamed from: e */
    public final void m24675e(C36760f2 c36760f2) {
        this.f22620c = C41696j.m91104d(m24676f(), null, null, new EuropeUnlockLeverageTips$fetchLevel$1(this, c36760f2, null), 3, null);
    }

    /* JADX INFO: renamed from: j */
    public final void m24679j(List<EuropeUnlockLeverageLevelTaskEntity> list, C36760f2 c36760f2) {
        ShapeLinearLayout root;
        if (list.isEmpty()) {
            C36795l1 c36795l1 = this.f22618a;
            if (c36795l1 != null && (root = c36795l1.getRoot()) != null) {
                ViewExtKt.m66577h(root);
            }
            InterfaceC41775x1 interfaceC41775x1 = this.f22620c;
            if (interfaceC41775x1 != null) {
                InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
                return;
            }
            return;
        }
        int i11 = 0;
        if (!list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (Intrinsics.areEqual(((EuropeUnlockLeverageLevelTaskEntity) it.next()).getStatus(), "FINISHED") && (i11 = i11 + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        try {
            this.f22618a = C36795l1.m82450a(c36760f2.f80027J.inflate());
        } catch (Throwable th2) {
            C44128b.m97263g("EuropeUnlockLeverageTips", th2);
        }
        final C36795l1 c36795l2 = this.f22618a;
        if (c36795l2 == null) {
            return;
        }
        c36795l2.f80478c.setMovementMethod(LinkMovementMethod.getInstance());
        BaseTextView baseTextView = c36795l2.f80478c;
        C27017c c27017c = C27017c.f54310a;
        baseTextView.setHighlightColor(c27017c.m66512a(R$color.c_transparent));
        BaseTextView baseTextView2 = c36795l2.f80478c;
        int i12 = R$string.kumex_eurpe_leverage_edu_tips;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i11);
        sb2.append('/');
        sb2.append(list.size());
        baseTextView2.setText(c27017c.m66516f(i12, sb2.toString()));
        HighlightTextHelper highlightTextHelper = HighlightTextHelper.f43497a;
        BaseTextView unlockLeverageTips = c36795l2.f80478c;
        Intrinsics.checkNotNullExpressionValue(unlockLeverageTips, "unlockLeverageTips");
        HighlightTextHelper.TextTagEnum textTagEnum = HighlightTextHelper.TextTagEnum.SPAN;
        highlightTextHelper.m54120f(unlockLeverageTips, new Pair(textTagEnum, new ForegroundColorSpan(c27017c.m66512a(R$color.c_text))), new Pair(textTagEnum, new C12886b()));
        AppCompatImageView unlockLeverageClose = c36795l2.f80477b;
        Intrinsics.checkNotNullExpressionValue(unlockLeverageClose, "unlockLeverageClose");
        C27046k.m66711z(unlockLeverageClose, 0L, new Function0() { // from class: com.kubi.futures.compliance.leverage.j0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EuropeUnlockLeverageTips.m24673k(this.f22647b, c36795l2);
            }
        }, 1, null);
    }
}
