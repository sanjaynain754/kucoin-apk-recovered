package com.kubi.payment.p2p.trade.view;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.annotation.LayoutRes;
import androidx.fragment.app.FragmentActivity;
import com.kubi.otc.exception.OtcMessage;
import com.kubi.payment.p2p.trade.view.AbsP2PBaseTopPopup;
import com.kubi.resources.widget.C23040f;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import io.chad.library.adapter.base.BaseViewHolder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: AbsP2PBaseTopPopup.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\b&\u0018\u0000 #2\u00020\u0001:\u0001#B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0017\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\fJ\u0006\u0010\u001b\u001a\u00020\bJ\u0014\u0010\u001c\u001a\u00020\b2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\u0010\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\fH\u0002J\u0006\u0010\u001e\u001a\u00020\u0013J\b\u0010\u001f\u001a\u00020 H'J\u0010\u0010!\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\u0013H&R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R#\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\f0\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0014\u0010\u0015¨\u0006$"}, m90084d2 = {"Lcom/kubi/payment/p2p/trade/view/AbsP2PBaseTopPopup;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dismissListener", "Lkotlin/Function0;", "", "popupWindow", "Lcom/kubi/resources/widget/BackgroundDarkPopupWindow;", "contentView", "Landroid/view/View;", "kotlin.jvm.PlatformType", "getContentView", "()Landroid/view/View;", "contentView$delegate", "Lkotlin/Lazy;", "contentViewHolder", "Lio/chad/library/adapter/base/BaseViewHolder;", "getContentViewHolder", "()Lio/chad/library/adapter/base/BaseViewHolder;", "contentViewHolder$delegate", "showPopup", "activity", "Landroidx/fragment/app/FragmentActivity;", "dependView", "dismiss", "setOnDismissListener", "checkPopup", "getViewHolder", "getLayout", "", "initView", "viewHolder", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAbsP2PBaseTopPopup.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbsP2PBaseTopPopup.kt\ncom/kubi/payment/p2p/trade/view/AbsP2PBaseTopPopup\n+ 2 OtcIssue.kt\ncom/kubi/otc/exception/OtcIssueKt\n*L\n1#1,117:1\n48#2,2:118\n*S KotlinDebug\n*F\n+ 1 AbsP2PBaseTopPopup.kt\ncom/kubi/payment/p2p/trade/view/AbsP2PBaseTopPopup\n*L\n54#1:118,2\n*E\n"})
public abstract class AbsP2PBaseTopPopup {

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final Companion f40122f = new Companion(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Context f40123a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public Function0<Unit> f40124b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public C23040f f40125c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final Lazy f40126d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final Lazy f40127e;

    /* JADX INFO: compiled from: AbsP2PBaseTopPopup.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/payment/p2p/trade/view/AbsP2PBaseTopPopup$Companion;", "", "<init>", "()V", "POP_UP_BG_ALPHA", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @LayoutRes
    /* JADX INFO: renamed from: m */
    public abstract int mo49372m();

    /* JADX INFO: renamed from: o */
    public abstract void mo49374o(@NotNull BaseViewHolder baseViewHolder);

    public AbsP2PBaseTopPopup(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f40123a = context;
        this.f40126d = LazyKt.lazy(new Function0() { // from class: gu.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbsP2PBaseTopPopup.m49366h(this.f85629b);
            }
        });
        this.f40127e = LazyKt.lazy(new Function0() { // from class: gu.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbsP2PBaseTopPopup.m49365g(this.f85630b);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public static final void m49364f(AbsP2PBaseTopPopup absP2PBaseTopPopup) {
        Function0<Unit> function0 = absP2PBaseTopPopup.f40124b;
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: renamed from: g */
    public static final BaseViewHolder m49365g(AbsP2PBaseTopPopup absP2PBaseTopPopup) {
        return new BaseViewHolder(absP2PBaseTopPopup.m49370k());
    }

    /* JADX INFO: renamed from: h */
    public static final View m49366h(AbsP2PBaseTopPopup absP2PBaseTopPopup) {
        return LayoutInflater.from(absP2PBaseTopPopup.f40123a).inflate(absP2PBaseTopPopup.mo49372m(), (ViewGroup) null);
    }

    /* JADX INFO: renamed from: j */
    public static final Unit m49367j(AbsP2PBaseTopPopup absP2PBaseTopPopup) {
        C23040f c23040f = absP2PBaseTopPopup.f40125c;
        if (c23040f != null) {
            c23040f.dismiss();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public final void m49368e(View view) {
        if (this.f40125c == null) {
            mo49374o(m49371l());
            C23040f c23040f = new C23040f(m49370k(), -1, -2);
            this.f40125c = c23040f;
            c23040f.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: gu.b
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    AbsP2PBaseTopPopup.m49364f(this.f85628b);
                }
            });
            C23040f c23040f2 = this.f40125c;
            if (c23040f2 != null) {
                c23040f2.setFocusable(true);
            }
            C23040f c23040f3 = this.f40125c;
            if (c23040f3 != null) {
                c23040f3.setBackgroundDrawable(new BitmapDrawable());
            }
            C23040f c23040f4 = this.f40125c;
            if (c23040f4 != null) {
                c23040f4.m55190q(0.3f);
            }
            C23040f c23040f5 = this.f40125c;
            if (c23040f5 != null) {
                c23040f5.m55187n();
            }
            C23040f c23040f6 = this.f40125c;
            if (c23040f6 != null) {
                c23040f6.m55181h(view);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m49369i() {
        C23040f c23040f = this.f40125c;
        if (C27025c.m66566d(c23040f != null ? Boolean.valueOf(c23040f.isShowing()) : null)) {
            C27100x0.m66923d(new Function0() { // from class: gu.a
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AbsP2PBaseTopPopup.m49367j(this.f85627b);
                }
            });
        }
    }

    /* JADX INFO: renamed from: k */
    public final View m49370k() {
        return (View) this.f40126d.getValue();
    }

    /* JADX INFO: renamed from: l */
    public final BaseViewHolder m49371l() {
        return (BaseViewHolder) this.f40127e.getValue();
    }

    /* JADX INFO: renamed from: p */
    public final void m49375p(@NotNull Function0<Unit> dismiss) {
        Intrinsics.checkNotNullParameter(dismiss, "dismiss");
        this.f40124b = dismiss;
    }

    /* JADX INFO: renamed from: q */
    public final void m49376q(@Nullable FragmentActivity fragmentActivity, @Nullable View view) {
        if (fragmentActivity == null || view == null || fragmentActivity.isFinishing() || fragmentActivity.isDestroyed() || !view.isAttachedToWindow()) {
            return;
        }
        try {
            m49368e(view);
            C23040f c23040f = this.f40125c;
            if (c23040f != null) {
                c23040f.m55181h(view);
            }
            C23040f c23040f2 = this.f40125c;
            if (c23040f2 != null) {
                c23040f2.showAsDropDown(view, 0, 0);
            }
        } catch (Exception e11) {
            C43846g.m96568c(new OtcMessage("showPopup：exception", C27041f.m66668h(e11.getMessage()), false, 4, null), null, 2, null);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final BaseViewHolder m49373n() {
        return m49371l();
    }
}
