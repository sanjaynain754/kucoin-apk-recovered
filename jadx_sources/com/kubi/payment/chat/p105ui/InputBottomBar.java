package com.kubi.payment.chat.p105ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.kubi.otc.R$id;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$string;
import com.kubi.resources.widget.ClearEditText;
import com.kubi.utils.C27014a1;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27046k;
import io.reactivex.functions.Consumer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p011a9.C0206f;
import p658ub.C45148b;
import p752x8.AbstractC46099a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: InputBottomBar.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\u0004\u0010\bJ\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\u0003H\u0003J(\u0010\u0011\u001a\u00020\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u000fR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/payment/chat/ui/InputBottomBar;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "content", "", "sendTextListener", "Lkotlin/Function1;", "", "sendImageListener", "Lkotlin/Function0;", "initView", "setData", "sendTextAction", "sendImageAction", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class InputBottomBar extends LinearLayout {

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final Companion f38458e = new Companion(null);

    /* JADX INFO: renamed from: b */
    @Nullable
    public String f38459b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public Function1<? super String, Unit> f38460c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public Function0<Unit> f38461d;

    /* JADX INFO: compiled from: InputBottomBar.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m90084d2 = {"Lcom/kubi/payment/chat/ui/InputBottomBar$Companion;", "", "<init>", "()V", "LENGTH_FILTER", "", "INPUT_LIMIT_TIME", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputBottomBar(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f38459b = "";
        m46240e(context);
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m46236f(InputBottomBar inputBottomBar) {
        Function0<Unit> function0 = inputBottomBar.f38461d;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g */
    public static final void m46237g(InputBottomBar inputBottomBar, View view, ClearEditText clearEditText, View view2) {
        String str = inputBottomBar.f38459b;
        if (str == null || str.length() == 0) {
            return;
        }
        if (C27014a1.m66502b(view, 1000L)) {
            ToastCompat.m66437C(R$string.pay_chat_send_fast_tip);
            return;
        }
        Function1<? super String, Unit> function1 = inputBottomBar.f38460c;
        if (function1 != null) {
            function1.invoke(C45148b.m99794d(inputBottomBar.f38459b));
        }
        clearEditText.setText("");
    }

    /* JADX INFO: renamed from: h */
    public static final Unit m46238h(InputBottomBar inputBottomBar, View view, View view2, CharSequence charSequence) {
        String string;
        String string2 = (charSequence == null || (string = charSequence.toString()) == null) ? null : StringsKt.trim((CharSequence) string).toString();
        inputBottomBar.f38459b = string2;
        if (string2 == null || string2.length() == 0) {
            view.setVisibility(0);
            view2.setVisibility(8);
        } else {
            view.setVisibility(8);
            view2.setVisibility(0);
        }
        return Unit.INSTANCE;
    }

    @SuppressLint({"CheckResult"})
    /* JADX INFO: renamed from: e */
    public final void m46240e(Context context) {
        View.inflate(context, R$layout.botc_view_input_bottom_bar, this);
        final View viewFindViewById = findViewById(R$id.iv_image);
        Intrinsics.checkNotNull(viewFindViewById);
        C27046k.m66711z(viewFindViewById, 0L, new Function0() { // from class: com.kubi.payment.chat.ui.s0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InputBottomBar.m46236f(this.f38504b);
            }
        }, 1, null);
        final View viewFindViewById2 = findViewById(R$id.tv_send);
        final ClearEditText clearEditText = (ClearEditText) findViewById(R$id.et_input);
        viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: com.kubi.payment.chat.ui.t0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InputBottomBar.m46237g(this.f38506b, viewFindViewById2, clearEditText, view);
            }
        });
        clearEditText.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(400)});
        AbstractC46099a<CharSequence> abstractC46099aM784d = C0206f.m784d(clearEditText);
        final Function1 function1 = new Function1() { // from class: com.kubi.payment.chat.ui.u0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InputBottomBar.m46238h(this.f38510b, viewFindViewById, viewFindViewById2, (CharSequence) obj);
            }
        };
        abstractC46099aM784d.subscribe(new Consumer() { // from class: com.kubi.payment.chat.ui.v0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                InputBottomBar.m46239i(function1, obj);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public final void m46241j(@NotNull Function1<? super String, Unit> sendTextAction, @NotNull Function0<Unit> sendImageAction) {
        Intrinsics.checkNotNullParameter(sendTextAction, "sendTextAction");
        Intrinsics.checkNotNullParameter(sendImageAction, "sendImageAction");
        this.f38460c = sendTextAction;
        this.f38461d = sendImageAction;
    }

    /* JADX INFO: renamed from: i */
    public static final void m46239i(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputBottomBar(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f38459b = "";
        m46240e(context);
    }
}
