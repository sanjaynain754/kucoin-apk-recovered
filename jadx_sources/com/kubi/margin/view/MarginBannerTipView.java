package com.kubi.margin.view;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.kubi.margin.R$color;
import com.kubi.margin.R$id;
import com.kubi.margin.R$layout;
import com.kubi.margin.R$string;
import com.kubi.margin.view.MarginBannerTipView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.router.core.Router;
import com.kubi.user.protocol.entity.SignTermItem;
import com.kubi.utils.C27018c0;
import com.tencent.bugly.proguard.C33627eb;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: MarginBannerTipView.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u000e\u001a\u00020\u000fH\u0002J\u000e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u000fJ\u0016\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0012J\u0006\u0010\u0017\u001a\u00020\u000fJ\u0014\u0010\u0018\u001a\u00020\u000f2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001aR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/margin/view/MarginBannerTipView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "tvTip", "Lcom/kubi/resources/widget/BaseTextView;", "ivClose", "Landroid/widget/ImageView;", "setupClickListeners", "", "setTipText", "text", "", TIMPushProvider.f75062n, "addReadMore", "content", SignTermItem.LINK, TIMPushProvider.f75063o, "setOnCloseClickListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function0;", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class MarginBannerTipView extends FrameLayout {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final BaseTextView f34256b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final ImageView f34257c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MarginBannerTipView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: j */
    public final void m40699j() {
        setVisibility(0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MarginBannerTipView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: e */
    public static final void m40693e(String str, View view) {
        Router.f46192a.m56184f(str).m4048k();
    }

    /* JADX INFO: renamed from: i */
    public static final void m40695i(MarginBannerTipView marginBannerTipView, View view) {
        marginBannerTipView.setVisibility(8);
    }

    /* JADX INFO: renamed from: d */
    public final void m40696d(@NotNull String content, @NotNull final String link) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(link, "link");
        if (StringsKt.isBlank(content) || StringsKt.isBlank(link)) {
            return;
        }
        String string = getContext().getString(R$string.view_more);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder().append((CharSequence) content).append((CharSequence) C33627eb.f69716f).append((CharSequence) string);
        C27018c0 c27018c0 = new C27018c0(R$color.primary, new View.OnClickListener() { // from class: xp.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MarginBannerTipView.m40693e(link, view);
            }
        });
        Intrinsics.checkNotNull(spannableStringBuilderAppend);
        spannableStringBuilderAppend.setSpan(c27018c0, StringsKt.indexOf$default((CharSequence) spannableStringBuilderAppend, string, 0, false, 6, (Object) null), StringsKt.indexOf$default((CharSequence) spannableStringBuilderAppend, string, 0, false, 6, (Object) null) + string.length(), 18);
        this.f34256b.setText(spannableStringBuilderAppend);
        this.f34256b.setMovementMethod(LinkMovementMethod.getInstance());
    }

    /* JADX INFO: renamed from: f */
    public final void m40697f() {
        setVisibility(8);
    }

    /* JADX INFO: renamed from: h */
    public final void m40698h() {
        this.f34257c.setOnClickListener(new View.OnClickListener() { // from class: xp.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MarginBannerTipView.m40695i(this.f103893b, view);
            }
        });
    }

    public final void setOnCloseClickListener(@NotNull final Function0<Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f34257c.setOnClickListener(new View.OnClickListener() { // from class: xp.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MarginBannerTipView.m40694g(listener, this, view);
            }
        });
    }

    public final void setTipText(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f34256b.setText(text);
    }

    public /* synthetic */ MarginBannerTipView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: g */
    public static final void m40694g(Function0 function0, MarginBannerTipView marginBannerTipView, View view) {
        function0.invoke();
        marginBannerTipView.m40697f();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MarginBannerTipView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(context).inflate(R$layout.bmargin_notice_layout, (ViewGroup) this, true);
        View viewFindViewById = findViewById(R$id.tvTip);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f34256b = (BaseTextView) viewFindViewById;
        View viewFindViewById2 = findViewById(R$id.ivClose);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f34257c = (ImageView) viewFindViewById2;
        m40698h();
    }
}
