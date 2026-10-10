package com.kubi.loan.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.blankj.utilcode.util.C5275i0;
import com.blankj.utilcode.util.C5303w0;
import com.google.firebase.messaging.Constants;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.loan.R$id;
import com.kubi.loan.R$layout;
import com.kubi.loan.R$string;
import com.kubi.loan.R$styleable;
import com.kubi.loan.view.LeverInputViewNew;
import com.kubi.resources.C22890g;
import com.kubi.resources.widget.FilterEmojiEditText;
import com.kubi.resources.widget.KcTextInputLayout;
import com.kubi.resources.widget.ShowHideTextView;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import gf.C37886j;
import io.reactivex.functions.Action;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Locale;
import jo.C40461l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p567qo.C43800f;
import p567qo.C43801g;
import p567qo.C43820z;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LeverInputViewNew.kt */
/* JADX INFO: loaded from: classes26.dex */
@Metadata(m90083d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\bJ\u0006\u0010\u0017\u001a\u00020\u0018J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0010\u0010\u001b\u001a\u00020\u001c2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\u0006\u0010\u001f\u001a\u00020\u001eJ\u0006\u0010\"\u001a\u00020!J\b\u0010#\u001a\u0004\u0018\u00010\u0016J\u000e\u0010$\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020&J(\u0010$\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020(2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010)\u001a\u00020&2\u0006\u0010*\u001a\u00020+J\u0018\u0010,\u001a\u00020\u001c2\u0006\u0010-\u001a\u00020\u00132\b\b\u0002\u0010.\u001a\u00020&J\u0006\u0010/\u001a\u00020\u0013J\u0006\u00100\u001a\u00020(J\u0006\u00101\u001a\u00020\u0013R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00062"}, m90084d2 = {"Lcom/kubi/loan/view/LeverInputViewNew;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attributeSet", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "bloanViewLeverInputNewBinding", "Lcom/kubi/loan/databinding/BloanViewLeverInputNewBinding;", "getBloanViewLeverInputNewBinding", "()Lcom/kubi/loan/databinding/BloanViewLeverInputNewBinding;", "setBloanViewLeverInputNewBinding", "(Lcom/kubi/loan/databinding/BloanViewLeverInputNewBinding;)V", "ul_color_normal", "", "ul_color_error", "all_show", "", "fiat_show", "coin", "Lcom/kubi/data/entity/CoinInfoEntity;", "getInput", "Lcom/kubi/resources/widget/FilterEmojiEditText;", "getFiatTv", "Landroid/widget/TextView;", "setCoin", "", "mInputHelper", "Lcom/kubi/loan/view/ReturnInputHelperNew;", "getReturnInputHelperNew", "mBorrowInputHelper", "Lcom/kubi/loan/view/BorrowInputHelperNew;", "getBorrowHelperNew", "getCoin", "setAmount", "amount", "", "maxAmount", "Ljava/math/BigDecimal;", "hint", TUIConstants.TIMPush.NOTIFICATION.ACTION, "Lio/reactivex/functions/Action;", "showError", "isShow", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "isError", "getData", "isFiatShow", "LoanLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class LeverInputViewNew extends FrameLayout {

    /* JADX INFO: renamed from: b */
    @NotNull
    public C40461l f32486b;

    /* JADX INFO: renamed from: c */
    public int f32487c;

    /* JADX INFO: renamed from: d */
    public int f32488d;

    /* JADX INFO: renamed from: e */
    public boolean f32489e;

    /* JADX INFO: renamed from: f */
    public boolean f32490f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public CoinInfoEntity f32491g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public C43820z f32492h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public C43800f f32493i;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LeverInputViewNew(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: g */
    public static final Unit m37803g(BigDecimal bigDecimal, CoinInfoEntity coinInfoEntity, LeverInputViewNew leverInputViewNew, Action action) throws Exception {
        String code = coinInfoEntity != null ? coinInfoEntity.getCode() : null;
        if (code == null) {
            code = "";
        }
        Locale ENGLISH = Locale.ENGLISH;
        Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
        leverInputViewNew.f32486b.f89835d.setText(C37886j.m85578b(bigDecimal, code, null, false, false, false, 0, ENGLISH, 0, 174, null));
        FilterEmojiEditText filterEmojiEditText = leverInputViewNew.f32486b.f89835d;
        Editable text = filterEmojiEditText.getText();
        filterEmojiEditText.setSelection(C27039d.m66650j(text != null ? Integer.valueOf(text.length()) : null));
        action.run();
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeverInputViewNew(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.f32487c = C22890g.m54291p(context2);
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.f32488d = C22890g.m54289n(context3);
        this.f32489e = true;
        LayoutInflater.from(getContext()).inflate(R$layout.bloan_view_lever_input_new, this);
        C40461l c40461lM89111a = C40461l.m89111a(findViewById(R$id.root_view));
        Intrinsics.checkNotNullExpressionValue(c40461lM89111a, "bind(...)");
        this.f32486b = c40461lM89111a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.kucoin_LeverInputView);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        String string = typedArrayObtainStyledAttributes.getString(R$styleable.kucoin_LeverInputView_kucoin_liv_title);
        String string2 = typedArrayObtainStyledAttributes.getString(R$styleable.kucoin_LeverInputView_kucoin_liv_all);
        this.f32489e = typedArrayObtainStyledAttributes.getBoolean(R$styleable.kucoin_LeverInputView_kucoin_liv_all_show, true);
        this.f32490f = typedArrayObtainStyledAttributes.getBoolean(R$styleable.kucoin_LeverInputView_kucoin_liv_fiat_show, false);
        this.f32487c = typedArrayObtainStyledAttributes.getColor(R$styleable.kucoin_LeverInputView_kucoin_liv_underline_color_normal, C22890g.m54291p(context));
        this.f32488d = typedArrayObtainStyledAttributes.getColor(R$styleable.kucoin_LeverInputView_kucoin_liv_underline_color_error, C22890g.m54289n(context));
        typedArrayObtainStyledAttributes.recycle();
        this.f32486b.f89838g.setHint(string);
        this.f32486b.f89839h.setText((string2 == null || string2.length() == 0) ? context.getString(R$string.all) : string2);
        this.f32486b.f89839h.setVisibility(this.f32489e ? 0 : 8);
        this.f32486b.f89833b.setVisibility(this.f32489e ? 0 : 8);
        this.f32486b.f89841j.setVisibility(this.f32490f ? 0 : 8);
        post(new Runnable() { // from class: qo.l
            @Override // java.lang.Runnable
            public final void run() {
                LeverInputViewNew.m37802c(this.f96867b);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m37804i(LeverInputViewNew leverInputViewNew, boolean z11, String str, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = "";
        }
        leverInputViewNew.m37808h(z11, str);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m37805d() {
        return !TextUtils.isEmpty(this.f32486b.f89838g.getError());
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getF32490f() {
        return this.f32490f;
    }

    /* JADX INFO: renamed from: f */
    public final void m37807f(@NotNull final BigDecimal maxAmount, @Nullable final CoinInfoEntity coinInfoEntity, @NotNull String hint, @NotNull final Action action) {
        Intrinsics.checkNotNullParameter(maxAmount, "maxAmount");
        Intrinsics.checkNotNullParameter(hint, "hint");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f32491g = coinInfoEntity;
        ShowHideTextView showHideTextView = this.f32486b.f89840i;
        String currency = coinInfoEntity != null ? coinInfoEntity.getCurrency() : null;
        if (currency == null) {
            currency = "";
        }
        showHideTextView.setText(currency);
        if (this.f32489e) {
            TextView tvAll = this.f32486b.f89839h;
            Intrinsics.checkNotNullExpressionValue(tvAll, "tvAll");
            C27046k.m66711z(tvAll, 0L, new Function0() { // from class: qo.m
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LeverInputViewNew.m37803g(maxAmount, coinInfoEntity, this, action);
                }
            }, 1, null);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: getBloanViewLeverInputNewBinding, reason: from getter */
    public final C40461l getF32486b() {
        return this.f32486b;
    }

    @NotNull
    public final C43800f getBorrowHelperNew() {
        if (this.f32493i == null) {
            this.f32493i = new C43800f(this);
        }
        C43800f c43800f = this.f32493i;
        Intrinsics.checkNotNull(c43800f);
        return c43800f;
    }

    @Nullable
    /* JADX INFO: renamed from: getCoin, reason: from getter */
    public final CoinInfoEntity getF32491g() {
        return this.f32491g;
    }

    @NotNull
    public final BigDecimal getData() {
        Editable text = this.f32486b.f89835d.getText();
        String string = text != null ? text.toString() : null;
        if (string == null || string.length() == 0) {
            return C43801g.m96470a();
        }
        try {
            ArrayList arrayListArrayListOf = CollectionsKt.arrayListOf(Double.valueOf(Double.NaN), Double.valueOf(Double.NEGATIVE_INFINITY), Double.valueOf(Double.POSITIVE_INFINITY));
            BigDecimal bigDecimal = new BigDecimal(String.valueOf(this.f32486b.f89835d.getText()));
            return arrayListArrayListOf.contains(Double.valueOf(bigDecimal.doubleValue())) ? C43801g.m96470a() : bigDecimal;
        } catch (Exception unused) {
            return C43801g.m96470a();
        }
    }

    @NotNull
    public final TextView getFiatTv() {
        TextView tvFiat = this.f32486b.f89841j;
        Intrinsics.checkNotNullExpressionValue(tvFiat, "tvFiat");
        return tvFiat;
    }

    @NotNull
    public final FilterEmojiEditText getInput() {
        FilterEmojiEditText etInput = this.f32486b.f89835d;
        Intrinsics.checkNotNullExpressionValue(etInput, "etInput");
        return etInput;
    }

    @NotNull
    public final C43820z getReturnInputHelperNew() {
        if (this.f32492h == null) {
            this.f32492h = new C43820z(this);
        }
        C43820z c43820z = this.f32492h;
        Intrinsics.checkNotNull(c43820z);
        return c43820z;
    }

    /* JADX INFO: renamed from: h */
    public final void m37808h(boolean z11, @NotNull String error) {
        Intrinsics.checkNotNullParameter(error, "error");
        if (z11) {
            KcTextInputLayout.m54598l(this.f32486b.f89838g, error, false, 2, null);
        } else {
            KcTextInputLayout.m54596f(this.f32486b.f89838g, false, 1, null);
        }
    }

    public final void setAmount(@NotNull String amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f32486b.f89835d.setText(amount);
        FilterEmojiEditText filterEmojiEditText = this.f32486b.f89835d;
        Editable text = filterEmojiEditText.getText();
        filterEmojiEditText.setSelection(C27039d.m66650j(text != null ? Integer.valueOf(text.length()) : null));
    }

    public final void setBloanViewLeverInputNewBinding(@NotNull C40461l c40461l) {
        Intrinsics.checkNotNullParameter(c40461l, "<set-?>");
        this.f32486b = c40461l;
    }

    public final void setCoin(@Nullable CoinInfoEntity coin) {
        this.f32491g = coin;
        this.f32486b.f89840i.setText(coin != null ? coin.getCurrency() : null);
    }

    /* JADX INFO: renamed from: c */
    public static final void m37802c(LeverInputViewNew leverInputViewNew) {
        if (!C5303w0.m6511a()) {
            FilterEmojiEditText input = leverInputViewNew.getInput();
            if (input != null) {
                input.setPadding(leverInputViewNew.getInput().getPaddingLeft(), leverInputViewNew.getInput().getPaddingTop(), leverInputViewNew.findViewById(R$id.endView).getMeasuredWidth() + C5275i0.m6236a(10.0f), leverInputViewNew.getInput().getPaddingBottom());
                return;
            }
            return;
        }
        FilterEmojiEditText input2 = leverInputViewNew.getInput();
        if (input2 != null) {
            input2.setPadding(leverInputViewNew.findViewById(R$id.endView).getMeasuredWidth() + C5275i0.m6236a(10.0f), leverInputViewNew.getInput().getPaddingTop(), leverInputViewNew.getInput().getPaddingRight(), leverInputViewNew.getInput().getPaddingBottom());
        }
    }
}
